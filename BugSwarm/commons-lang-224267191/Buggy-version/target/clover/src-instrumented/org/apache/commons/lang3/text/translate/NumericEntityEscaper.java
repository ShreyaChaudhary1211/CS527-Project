/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.commons.lang3.text.translate;

import java.io.IOException;
import java.io.Writer;

/**
 * Translates codepoints to their XML numeric entity escaped value.
 *
 * @since 3.0
 * @deprecated as of 3.6, use commons-text
 * <a href="https://commons.apache.org/proper/commons-text/javadocs/api-release/org/apache/commons/text/translate/NumericEntityEscaper.html">
 * NumericEntityEscaper</a> instead
 */
@Deprecated
public class NumericEntityEscaper extends CodePointTranslator {public static class __CLR4_5_2gg5gg5lvha7c66{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172755542L,8589935092L,21347,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private final int below;
    private final int above;
    private final boolean between;

    /**
     * <p>Constructs a <code>NumericEntityEscaper</code> for the specified range. This is
     * the underlying method for the other constructors/builders. The <code>below</code>
     * and <code>above</code> boundaries are inclusive when <code>between</code> is
     * <code>true</code> and exclusive when it is <code>false</code>. </p>
     *
     * @param below int value representing the lowest codepoint boundary
     * @param above int value representing the highest codepoint boundary
     * @param between whether to escape between the boundaries or outside them
     */
    private NumericEntityEscaper(final int below, final int above, final boolean between) {try{__CLR4_5_2gg5gg5lvha7c66.R.inc(21317);
        __CLR4_5_2gg5gg5lvha7c66.R.inc(21318);this.below = below;
        __CLR4_5_2gg5gg5lvha7c66.R.inc(21319);this.above = above;
        __CLR4_5_2gg5gg5lvha7c66.R.inc(21320);this.between = between;
    }finally{__CLR4_5_2gg5gg5lvha7c66.R.flushNeeded();}}

    /**
     * <p>Constructs a <code>NumericEntityEscaper</code> for all characters. </p>
     */
    public NumericEntityEscaper() {
        this(0, Integer.MAX_VALUE, true);__CLR4_5_2gg5gg5lvha7c66.R.inc(21322);try{__CLR4_5_2gg5gg5lvha7c66.R.inc(21321);
    }finally{__CLR4_5_2gg5gg5lvha7c66.R.flushNeeded();}}

    /**
     * <p>Constructs a <code>NumericEntityEscaper</code> below the specified value (exclusive). </p>
     *
     * @param codepoint below which to escape
     * @return the newly created {@code NumericEntityEscaper} instance
     */
    public static NumericEntityEscaper below(final int codepoint) {try{__CLR4_5_2gg5gg5lvha7c66.R.inc(21323);
        __CLR4_5_2gg5gg5lvha7c66.R.inc(21324);return outsideOf(codepoint, Integer.MAX_VALUE);
    }finally{__CLR4_5_2gg5gg5lvha7c66.R.flushNeeded();}}

    /**
     * <p>Constructs a <code>NumericEntityEscaper</code> above the specified value (exclusive). </p>
     *
     * @param codepoint above which to escape
     * @return the newly created {@code NumericEntityEscaper} instance
     */
    public static NumericEntityEscaper above(final int codepoint) {try{__CLR4_5_2gg5gg5lvha7c66.R.inc(21325);
        __CLR4_5_2gg5gg5lvha7c66.R.inc(21326);return outsideOf(0, codepoint);
    }finally{__CLR4_5_2gg5gg5lvha7c66.R.flushNeeded();}}

    /**
     * <p>Constructs a <code>NumericEntityEscaper</code> between the specified values (inclusive). </p>
     *
     * @param codepointLow above which to escape
     * @param codepointHigh below which to escape
     * @return the newly created {@code NumericEntityEscaper} instance
     */
    public static NumericEntityEscaper between(final int codepointLow, final int codepointHigh) {try{__CLR4_5_2gg5gg5lvha7c66.R.inc(21327);
        __CLR4_5_2gg5gg5lvha7c66.R.inc(21328);return new NumericEntityEscaper(codepointLow, codepointHigh, true);
    }finally{__CLR4_5_2gg5gg5lvha7c66.R.flushNeeded();}}

    /**
     * <p>Constructs a <code>NumericEntityEscaper</code> outside of the specified values (exclusive). </p>
     *
     * @param codepointLow below which to escape
     * @param codepointHigh above which to escape
     * @return the newly created {@code NumericEntityEscaper} instance
     */
    public static NumericEntityEscaper outsideOf(final int codepointLow, final int codepointHigh) {try{__CLR4_5_2gg5gg5lvha7c66.R.inc(21329);
        __CLR4_5_2gg5gg5lvha7c66.R.inc(21330);return new NumericEntityEscaper(codepointLow, codepointHigh, false);
    }finally{__CLR4_5_2gg5gg5lvha7c66.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean translate(final int codepoint, final Writer out) throws IOException {try{__CLR4_5_2gg5gg5lvha7c66.R.inc(21331);
        __CLR4_5_2gg5gg5lvha7c66.R.inc(21332);if((((between)&&(__CLR4_5_2gg5gg5lvha7c66.R.iget(21333)!=0|true))||(__CLR4_5_2gg5gg5lvha7c66.R.iget(21334)==0&false))) {{
            __CLR4_5_2gg5gg5lvha7c66.R.inc(21335);if ((((codepoint < below || codepoint > above)&&(__CLR4_5_2gg5gg5lvha7c66.R.iget(21336)!=0|true))||(__CLR4_5_2gg5gg5lvha7c66.R.iget(21337)==0&false))) {{
                __CLR4_5_2gg5gg5lvha7c66.R.inc(21338);return false;
            }
        }} }else {{
            __CLR4_5_2gg5gg5lvha7c66.R.inc(21339);if ((((codepoint >= below && codepoint <= above)&&(__CLR4_5_2gg5gg5lvha7c66.R.iget(21340)!=0|true))||(__CLR4_5_2gg5gg5lvha7c66.R.iget(21341)==0&false))) {{
                __CLR4_5_2gg5gg5lvha7c66.R.inc(21342);return false;
            }
        }}

        }__CLR4_5_2gg5gg5lvha7c66.R.inc(21343);out.write("&#");
        __CLR4_5_2gg5gg5lvha7c66.R.inc(21344);out.write(Integer.toString(codepoint, 10));
        __CLR4_5_2gg5gg5lvha7c66.R.inc(21345);out.write(';');
        __CLR4_5_2gg5gg5lvha7c66.R.inc(21346);return true;
    }finally{__CLR4_5_2gg5gg5lvha7c66.R.flushNeeded();}}
}
