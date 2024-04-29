/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.commons.lang3.builder;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.lang3.Validate;

/**
 * <p>
 * A {@code DiffResult} contains a collection of the differences between two
 * {@link Diffable} objects. Typically these differences are displayed using
 * {@link #toString()} method, which returns a string describing the fields that
 * differ between the objects.
 * </p>
 * <p>
 * Use a {@link DiffBuilder} to build a {@code DiffResult} comparing two objects.
 * </p>
 * 
 * @since 3.3
 */
public class DiffResult implements Iterable<Diff<?>> {public static class __CLR4_5_28xt8xtlvha7a7m{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172755542L,8589935092L,11618,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * <p>
     * The {@code String} returned when the objects have no differences:
     * {@value}
     * </p>
     */
    public static final String OBJECTS_SAME_STRING = "";

    private static final String DIFFERS_STRING = "differs from";

    private final List<Diff<?>> diffs;
    private final Object lhs;
    private final Object rhs;
    private final ToStringStyle style;

    /**
     * <p>
     * Creates a {@link DiffResult} containing the differences between two
     * objects.
     * </p>
     * 
     * @param lhs
     *            the left hand object
     * @param rhs
     *            the right hand object
     * @param diffs
     *            the list of differences, may be empty
     * @param style
     *            the style to use for the {@link #toString()} method. May be
     *            {@code null}, in which case
     *            {@link ToStringStyle#DEFAULT_STYLE} is used
     * @throws IllegalArgumentException
     *             if {@code lhs}, {@code rhs} or {@code diffs} is {@code null}
     */
    DiffResult(final Object lhs, final Object rhs, final List<Diff<?>> diffs,
            final ToStringStyle style) {try{__CLR4_5_28xt8xtlvha7a7m.R.inc(11585);
        __CLR4_5_28xt8xtlvha7a7m.R.inc(11586);Validate.isTrue(lhs != null, "Left hand object cannot be null");
        __CLR4_5_28xt8xtlvha7a7m.R.inc(11587);Validate.isTrue(rhs != null, "Right hand object cannot be null");
        __CLR4_5_28xt8xtlvha7a7m.R.inc(11588);Validate.isTrue(diffs != null, "List of differences cannot be null");

        __CLR4_5_28xt8xtlvha7a7m.R.inc(11589);this.diffs = diffs;
        __CLR4_5_28xt8xtlvha7a7m.R.inc(11590);this.lhs = lhs;
        __CLR4_5_28xt8xtlvha7a7m.R.inc(11591);this.rhs = rhs;

        __CLR4_5_28xt8xtlvha7a7m.R.inc(11592);if ((((style == null)&&(__CLR4_5_28xt8xtlvha7a7m.R.iget(11593)!=0|true))||(__CLR4_5_28xt8xtlvha7a7m.R.iget(11594)==0&false))) {{
            __CLR4_5_28xt8xtlvha7a7m.R.inc(11595);this.style = ToStringStyle.DEFAULT_STYLE;
        } }else {{
            __CLR4_5_28xt8xtlvha7a7m.R.inc(11596);this.style = style;
        }
    }}finally{__CLR4_5_28xt8xtlvha7a7m.R.flushNeeded();}}

    /**
     * <p>
     * Returns an unmodifiable list of {@code Diff}s. The list may be empty if
     * there were no differences between the objects.
     * </p>
     * 
     * @return an unmodifiable list of {@code Diff}s
     */
    public List<Diff<?>> getDiffs() {try{__CLR4_5_28xt8xtlvha7a7m.R.inc(11597);
        __CLR4_5_28xt8xtlvha7a7m.R.inc(11598);return Collections.unmodifiableList(diffs);
    }finally{__CLR4_5_28xt8xtlvha7a7m.R.flushNeeded();}}

    /**
     * <p>
     * Returns the number of differences between the two objects.
     * </p>
     * 
     * @return the number of differences
     */
    public int getNumberOfDiffs() {try{__CLR4_5_28xt8xtlvha7a7m.R.inc(11599);
        __CLR4_5_28xt8xtlvha7a7m.R.inc(11600);return diffs.size();
    }finally{__CLR4_5_28xt8xtlvha7a7m.R.flushNeeded();}}

    /**
     * <p>
     * Returns the style used by the {@link #toString()} method.
     * </p>
     * 
     * @return the style
     */
    public ToStringStyle getToStringStyle() {try{__CLR4_5_28xt8xtlvha7a7m.R.inc(11601);
        __CLR4_5_28xt8xtlvha7a7m.R.inc(11602);return style;
    }finally{__CLR4_5_28xt8xtlvha7a7m.R.flushNeeded();}}

    /**
     * <p>
     * Builds a {@code String} description of the differences contained within
     * this {@code DiffResult}. A {@link ToStringBuilder} is used for each object
     * and the style of the output is governed by the {@code ToStringStyle}
     * passed to the constructor.
     * </p>
     * 
     * <p>
     * If there are no differences stored in this list, the method will return
     * {@link #OBJECTS_SAME_STRING}. Otherwise, using the example given in
     * {@link Diffable} and {@link ToStringStyle#SHORT_PREFIX_STYLE}, an output
     * might be:
     * </p>
     * 
     * <pre>
     * Person[name=John Doe,age=32] differs from Person[name=Joe Bloggs,age=26]
     * </pre>
     * 
     * <p>
     * This indicates that the objects differ in name and age, but not in
     * smoking status.
     * </p>
     * 
     * <p>
     * To use a different {@code ToStringStyle} for an instance of this class,
     * use {@link #toString(ToStringStyle)}.
     * </p>
     * 
     * @return a {@code String} description of the differences.
     */
    @Override
    public String toString() {try{__CLR4_5_28xt8xtlvha7a7m.R.inc(11603);
        __CLR4_5_28xt8xtlvha7a7m.R.inc(11604);return toString(style);
    }finally{__CLR4_5_28xt8xtlvha7a7m.R.flushNeeded();}}

    /**
     * <p>
     * Builds a {@code String} description of the differences contained within
     * this {@code DiffResult}, using the supplied {@code ToStringStyle}.
     * </p>
     * 
     * @param style
     *            the {@code ToStringStyle} to use when outputting the objects
     * 
     * @return a {@code String} description of the differences.
     */
    public String toString(final ToStringStyle style) {try{__CLR4_5_28xt8xtlvha7a7m.R.inc(11605);
        __CLR4_5_28xt8xtlvha7a7m.R.inc(11606);if ((((diffs.size() == 0)&&(__CLR4_5_28xt8xtlvha7a7m.R.iget(11607)!=0|true))||(__CLR4_5_28xt8xtlvha7a7m.R.iget(11608)==0&false))) {{
            __CLR4_5_28xt8xtlvha7a7m.R.inc(11609);return OBJECTS_SAME_STRING;
        }

        }__CLR4_5_28xt8xtlvha7a7m.R.inc(11610);final ToStringBuilder lhsBuilder = new ToStringBuilder(lhs, style);
        __CLR4_5_28xt8xtlvha7a7m.R.inc(11611);final ToStringBuilder rhsBuilder = new ToStringBuilder(rhs, style);

        __CLR4_5_28xt8xtlvha7a7m.R.inc(11612);for (final Diff<?> diff : diffs) {{
            __CLR4_5_28xt8xtlvha7a7m.R.inc(11613);lhsBuilder.append(diff.getFieldName(), diff.getLeft());
            __CLR4_5_28xt8xtlvha7a7m.R.inc(11614);rhsBuilder.append(diff.getFieldName(), diff.getRight());
        }

        }__CLR4_5_28xt8xtlvha7a7m.R.inc(11615);return String.format("%s %s %s", lhsBuilder.build(), DIFFERS_STRING,
                rhsBuilder.build());
    }finally{__CLR4_5_28xt8xtlvha7a7m.R.flushNeeded();}}

    /**
     * <p>
     * Returns an iterator over the {@code Diff} objects contained in this list.
     * </p>
     * 
     * @return the iterator
     */
    @Override
    public Iterator<Diff<?>> iterator() {try{__CLR4_5_28xt8xtlvha7a7m.R.inc(11616);
        __CLR4_5_28xt8xtlvha7a7m.R.inc(11617);return diffs.iterator();
    }finally{__CLR4_5_28xt8xtlvha7a7m.R.flushNeeded();}}
}
