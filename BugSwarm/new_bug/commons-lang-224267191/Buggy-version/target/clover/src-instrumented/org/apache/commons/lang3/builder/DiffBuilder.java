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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.Validate;

/**
 * <p>
 * Assists in implementing {@link Diffable#diff(Object)} methods.
 * </p>
 * 
 * <p>
 * To use this class, write code as follows:
 * </p>
 * 
 * <pre>
 * public class Person implements Diffable&lt;Person&gt; {
 *   String name;
 *   int age;
 *   boolean smoker;
 *   
 *   ...
 *   
 *   public DiffResult diff(Person obj) {
 *     // No need for null check, as NullPointerException correct if obj is null
 *     return new DiffBuilder(this, obj, ToStringStyle.SHORT_PREFIX_STYLE)
 *       .append("name", this.name, obj.name)
 *       .append("age", this.age, obj.age)
 *       .append("smoker", this.smoker, obj.smoker)
 *       .build();
 *   }
 * }
 * </pre>
 * 
 * <p>
 * The {@code ToStringStyle} passed to the constructor is embedded in the
 * returned {@code DiffResult} and influences the style of the
 * {@code DiffResult.toString()} method. This style choice can be overridden by
 * calling {@link DiffResult#toString(ToStringStyle)}.
 * </p>
 * 
 * @since 3.3
 * @see Diffable
 * @see Diff
 * @see DiffResult
 * @see ToStringStyle
 */
public class DiffBuilder implements Builder<DiffResult> {public static class __CLR4_5_28oc8oclvha7a7b{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172755542L,8589935092L,11585,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private final List<Diff<?>> diffs;
    private final boolean objectsTriviallyEqual;
    private final Object left;
    private final Object right;
    private final ToStringStyle style;

    /**
     * <p>
     * Constructs a builder for the specified objects with the specified style.
     * </p>
     * 
     * <p>
     * If {@code lhs == rhs} or {@code lhs.equals(rhs)} then the builder will
     * not evaluate any calls to {@code append(...)} and will return an empty
     * {@link DiffResult} when {@link #build()} is executed.
     * </p>
     * 
     * @param lhs
     *            {@code this} object
     * @param rhs
     *            the object to diff against
     * @param style
     *            the style will use when outputting the objects, {@code null}
     *            uses the default
     * @param testTriviallyEqual
     *            If true, this will test if lhs and rhs are the same or equal.
     *            All of the append(fieldName, lhs, rhs) methods will abort
     *            without creating a field {@link Diff} if the trivially equal
     *            test is enabled and returns true.  The result of this test
     *            is never changed throughout the life of this {@link DiffBuilder}.
     * @throws IllegalArgumentException
     *             if {@code lhs} or {@code rhs} is {@code null}
     * @since 3.4
     */
    public DiffBuilder(final Object lhs, final Object rhs,
            final ToStringStyle style, final boolean testTriviallyEqual) {try{__CLR4_5_28oc8oclvha7a7b.R.inc(11244);

        __CLR4_5_28oc8oclvha7a7b.R.inc(11245);Validate.isTrue(lhs != null, "lhs cannot be null");
        __CLR4_5_28oc8oclvha7a7b.R.inc(11246);Validate.isTrue(rhs != null, "rhs cannot be null");

        __CLR4_5_28oc8oclvha7a7b.R.inc(11247);this.diffs = new ArrayList<>();
        __CLR4_5_28oc8oclvha7a7b.R.inc(11248);this.left = lhs;
        __CLR4_5_28oc8oclvha7a7b.R.inc(11249);this.right = rhs;
        __CLR4_5_28oc8oclvha7a7b.R.inc(11250);this.style = style;

        // Don't compare any fields if objects equal
        __CLR4_5_28oc8oclvha7a7b.R.inc(11251);this.objectsTriviallyEqual = testTriviallyEqual && (lhs == rhs || lhs.equals(rhs));
    }finally{__CLR4_5_28oc8oclvha7a7b.R.flushNeeded();}}

    /**
     * <p>
     * Constructs a builder for the specified objects with the specified style.
     * </p>
     * 
     * <p>
     * If {@code lhs == rhs} or {@code lhs.equals(rhs)} then the builder will
     * not evaluate any calls to {@code append(...)} and will return an empty
     * {@link DiffResult} when {@link #build()} is executed.
     * </p>
     * 
     * <p>
     * This delegates to {@link #DiffBuilder(Object, Object, ToStringStyle, boolean)}
     * with the testTriviallyEqual flag enabled.
     * </p>
     *
     * @param lhs
     *            {@code this} object
     * @param rhs
     *            the object to diff against
     * @param style
     *            the style will use when outputting the objects, {@code null}
     *            uses the default
     * @throws IllegalArgumentException
     *             if {@code lhs} or {@code rhs} is {@code null}
     */
    public DiffBuilder(final Object lhs, final Object rhs,
            final ToStringStyle style) {

            this(lhs, rhs, style, true);__CLR4_5_28oc8oclvha7a7b.R.inc(11253);try{__CLR4_5_28oc8oclvha7a7b.R.inc(11252);
    }finally{__CLR4_5_28oc8oclvha7a7b.R.flushNeeded();}}

    /**
     * <p>
     * Test if two {@code boolean}s are equal.
     * </p>
     * 
     * @param fieldName
     *            the field name
     * @param lhs
     *            the left hand {@code boolean}
     * @param rhs
     *            the right hand {@code boolean}
     * @return this
     * @throws IllegalArgumentException
     *             if field name is {@code null}
     */
    public DiffBuilder append(final String fieldName, final boolean lhs,
            final boolean rhs) {try{__CLR4_5_28oc8oclvha7a7b.R.inc(11254);
        __CLR4_5_28oc8oclvha7a7b.R.inc(11255);validateFieldNameNotNull(fieldName);

        __CLR4_5_28oc8oclvha7a7b.R.inc(11256);if ((((objectsTriviallyEqual)&&(__CLR4_5_28oc8oclvha7a7b.R.iget(11257)!=0|true))||(__CLR4_5_28oc8oclvha7a7b.R.iget(11258)==0&false))) {{
            __CLR4_5_28oc8oclvha7a7b.R.inc(11259);return this;
        }
        }__CLR4_5_28oc8oclvha7a7b.R.inc(11260);if ((((lhs != rhs)&&(__CLR4_5_28oc8oclvha7a7b.R.iget(11261)!=0|true))||(__CLR4_5_28oc8oclvha7a7b.R.iget(11262)==0&false))) {{
            __CLR4_5_28oc8oclvha7a7b.R.inc(11263);diffs.add(new Diff<Boolean>(fieldName) {
                private static final long serialVersionUID = 1L;

                @Override
                public Boolean getLeft() {try{__CLR4_5_28oc8oclvha7a7b.R.inc(11264);
                    __CLR4_5_28oc8oclvha7a7b.R.inc(11265);return Boolean.valueOf(lhs);
                }finally{__CLR4_5_28oc8oclvha7a7b.R.flushNeeded();}}

                @Override
                public Boolean getRight() {try{__CLR4_5_28oc8oclvha7a7b.R.inc(11266);
                    __CLR4_5_28oc8oclvha7a7b.R.inc(11267);return Boolean.valueOf(rhs);
                }finally{__CLR4_5_28oc8oclvha7a7b.R.flushNeeded();}}
            });
        }
        }__CLR4_5_28oc8oclvha7a7b.R.inc(11268);return this;
    }finally{__CLR4_5_28oc8oclvha7a7b.R.flushNeeded();}}

    /**
     * <p>
     * Test if two {@code boolean[]}s are equal.
     * </p>
     * 
     * @param fieldName
     *            the field name
     * @param lhs
     *            the left hand {@code boolean[]}
     * @param rhs
     *            the right hand {@code boolean[]}
     * @return this
     * @throws IllegalArgumentException
     *             if field name is {@code null}
     */
    public DiffBuilder append(final String fieldName, final boolean[] lhs,
            final boolean[] rhs) {try{__CLR4_5_28oc8oclvha7a7b.R.inc(11269);
        __CLR4_5_28oc8oclvha7a7b.R.inc(11270);validateFieldNameNotNull(fieldName);
        __CLR4_5_28oc8oclvha7a7b.R.inc(11271);if ((((objectsTriviallyEqual)&&(__CLR4_5_28oc8oclvha7a7b.R.iget(11272)!=0|true))||(__CLR4_5_28oc8oclvha7a7b.R.iget(11273)==0&false))) {{
            __CLR4_5_28oc8oclvha7a7b.R.inc(11274);return this;
        }
        }__CLR4_5_28oc8oclvha7a7b.R.inc(11275);if ((((!Arrays.equals(lhs, rhs))&&(__CLR4_5_28oc8oclvha7a7b.R.iget(11276)!=0|true))||(__CLR4_5_28oc8oclvha7a7b.R.iget(11277)==0&false))) {{
            __CLR4_5_28oc8oclvha7a7b.R.inc(11278);diffs.add(new Diff<Boolean[]>(fieldName) {
                private static final long serialVersionUID = 1L;

                @Override
                public Boolean[] getLeft() {try{__CLR4_5_28oc8oclvha7a7b.R.inc(11279);
                    __CLR4_5_28oc8oclvha7a7b.R.inc(11280);return ArrayUtils.toObject(lhs);
                }finally{__CLR4_5_28oc8oclvha7a7b.R.flushNeeded();}}

                @Override
                public Boolean[] getRight() {try{__CLR4_5_28oc8oclvha7a7b.R.inc(11281);
                    __CLR4_5_28oc8oclvha7a7b.R.inc(11282);return ArrayUtils.toObject(rhs);
                }finally{__CLR4_5_28oc8oclvha7a7b.R.flushNeeded();}}
            });
        }
        }__CLR4_5_28oc8oclvha7a7b.R.inc(11283);return this;
    }finally{__CLR4_5_28oc8oclvha7a7b.R.flushNeeded();}}

    /**
     * <p>
     * Test if two {@code byte}s are equal.
     * </p>
     * 
     * @param fieldName
     *            the field name
     * @param lhs
     *            the left hand {@code byte}
     * @param rhs
     *            the right hand {@code byte}
     * @return this
     * @throws IllegalArgumentException
     *             if field name is {@code null}
     */
    public DiffBuilder append(final String fieldName, final byte lhs,
            final byte rhs) {try{__CLR4_5_28oc8oclvha7a7b.R.inc(11284);
        __CLR4_5_28oc8oclvha7a7b.R.inc(11285);validateFieldNameNotNull(fieldName);
        __CLR4_5_28oc8oclvha7a7b.R.inc(11286);if ((((objectsTriviallyEqual)&&(__CLR4_5_28oc8oclvha7a7b.R.iget(11287)!=0|true))||(__CLR4_5_28oc8oclvha7a7b.R.iget(11288)==0&false))) {{
            __CLR4_5_28oc8oclvha7a7b.R.inc(11289);return this;
        }
        }__CLR4_5_28oc8oclvha7a7b.R.inc(11290);if ((((lhs != rhs)&&(__CLR4_5_28oc8oclvha7a7b.R.iget(11291)!=0|true))||(__CLR4_5_28oc8oclvha7a7b.R.iget(11292)==0&false))) {{
            __CLR4_5_28oc8oclvha7a7b.R.inc(11293);diffs.add(new Diff<Byte>(fieldName) {
                private static final long serialVersionUID = 1L;

                @Override
                public Byte getLeft() {try{__CLR4_5_28oc8oclvha7a7b.R.inc(11294);
                    __CLR4_5_28oc8oclvha7a7b.R.inc(11295);return Byte.valueOf(lhs);
                }finally{__CLR4_5_28oc8oclvha7a7b.R.flushNeeded();}}

                @Override
                public Byte getRight() {try{__CLR4_5_28oc8oclvha7a7b.R.inc(11296);
                    __CLR4_5_28oc8oclvha7a7b.R.inc(11297);return Byte.valueOf(rhs);
                }finally{__CLR4_5_28oc8oclvha7a7b.R.flushNeeded();}}
            });
        }
        }__CLR4_5_28oc8oclvha7a7b.R.inc(11298);return this;
    }finally{__CLR4_5_28oc8oclvha7a7b.R.flushNeeded();}}

    /**
     * <p>
     * Test if two {@code byte[]}s are equal.
     * </p>
     * 
     * @param fieldName
     *            the field name
     * @param lhs
     *            the left hand {@code byte[]}
     * @param rhs
     *            the right hand {@code byte[]}
     * @return this
     * @throws IllegalArgumentException
     *             if field name is {@code null}
     */
    public DiffBuilder append(final String fieldName, final byte[] lhs,
            final byte[] rhs) {try{__CLR4_5_28oc8oclvha7a7b.R.inc(11299);
        __CLR4_5_28oc8oclvha7a7b.R.inc(11300);validateFieldNameNotNull(fieldName);

        __CLR4_5_28oc8oclvha7a7b.R.inc(11301);if ((((objectsTriviallyEqual)&&(__CLR4_5_28oc8oclvha7a7b.R.iget(11302)!=0|true))||(__CLR4_5_28oc8oclvha7a7b.R.iget(11303)==0&false))) {{
            __CLR4_5_28oc8oclvha7a7b.R.inc(11304);return this;
        }
        }__CLR4_5_28oc8oclvha7a7b.R.inc(11305);if ((((!Arrays.equals(lhs, rhs))&&(__CLR4_5_28oc8oclvha7a7b.R.iget(11306)!=0|true))||(__CLR4_5_28oc8oclvha7a7b.R.iget(11307)==0&false))) {{
            __CLR4_5_28oc8oclvha7a7b.R.inc(11308);diffs.add(new Diff<Byte[]>(fieldName) {
                private static final long serialVersionUID = 1L;

                @Override
                public Byte[] getLeft() {try{__CLR4_5_28oc8oclvha7a7b.R.inc(11309);
                    __CLR4_5_28oc8oclvha7a7b.R.inc(11310);return ArrayUtils.toObject(lhs);
                }finally{__CLR4_5_28oc8oclvha7a7b.R.flushNeeded();}}

                @Override
                public Byte[] getRight() {try{__CLR4_5_28oc8oclvha7a7b.R.inc(11311);
                    __CLR4_5_28oc8oclvha7a7b.R.inc(11312);return ArrayUtils.toObject(rhs);
                }finally{__CLR4_5_28oc8oclvha7a7b.R.flushNeeded();}}
            });
        }
        }__CLR4_5_28oc8oclvha7a7b.R.inc(11313);return this;
    }finally{__CLR4_5_28oc8oclvha7a7b.R.flushNeeded();}}

    /**
     * <p>
     * Test if two {@code char}s are equal.
     * </p>
     * 
     * @param fieldName
     *            the field name
     * @param lhs
     *            the left hand {@code char}
     * @param rhs
     *            the right hand {@code char}
     * @return this
     * @throws IllegalArgumentException
     *             if field name is {@code null}
     */
    public DiffBuilder append(final String fieldName, final char lhs,
            final char rhs) {try{__CLR4_5_28oc8oclvha7a7b.R.inc(11314);
        __CLR4_5_28oc8oclvha7a7b.R.inc(11315);validateFieldNameNotNull(fieldName);

        __CLR4_5_28oc8oclvha7a7b.R.inc(11316);if ((((objectsTriviallyEqual)&&(__CLR4_5_28oc8oclvha7a7b.R.iget(11317)!=0|true))||(__CLR4_5_28oc8oclvha7a7b.R.iget(11318)==0&false))) {{
            __CLR4_5_28oc8oclvha7a7b.R.inc(11319);return this;
        }
        }__CLR4_5_28oc8oclvha7a7b.R.inc(11320);if ((((lhs != rhs)&&(__CLR4_5_28oc8oclvha7a7b.R.iget(11321)!=0|true))||(__CLR4_5_28oc8oclvha7a7b.R.iget(11322)==0&false))) {{
            __CLR4_5_28oc8oclvha7a7b.R.inc(11323);diffs.add(new Diff<Character>(fieldName) {
                private static final long serialVersionUID = 1L;

                @Override
                public Character getLeft() {try{__CLR4_5_28oc8oclvha7a7b.R.inc(11324);
                    __CLR4_5_28oc8oclvha7a7b.R.inc(11325);return Character.valueOf(lhs);
                }finally{__CLR4_5_28oc8oclvha7a7b.R.flushNeeded();}}

                @Override
                public Character getRight() {try{__CLR4_5_28oc8oclvha7a7b.R.inc(11326);
                    __CLR4_5_28oc8oclvha7a7b.R.inc(11327);return Character.valueOf(rhs);
                }finally{__CLR4_5_28oc8oclvha7a7b.R.flushNeeded();}}
            });
        }
        }__CLR4_5_28oc8oclvha7a7b.R.inc(11328);return this;
    }finally{__CLR4_5_28oc8oclvha7a7b.R.flushNeeded();}}

    /**
     * <p>
     * Test if two {@code char[]}s are equal.
     * </p>
     * 
     * @param fieldName
     *            the field name
     * @param lhs
     *            the left hand {@code char[]}
     * @param rhs
     *            the right hand {@code char[]}
     * @return this
     * @throws IllegalArgumentException
     *             if field name is {@code null}
     */
    public DiffBuilder append(final String fieldName, final char[] lhs,
            final char[] rhs) {try{__CLR4_5_28oc8oclvha7a7b.R.inc(11329);
        __CLR4_5_28oc8oclvha7a7b.R.inc(11330);validateFieldNameNotNull(fieldName);

        __CLR4_5_28oc8oclvha7a7b.R.inc(11331);if ((((objectsTriviallyEqual)&&(__CLR4_5_28oc8oclvha7a7b.R.iget(11332)!=0|true))||(__CLR4_5_28oc8oclvha7a7b.R.iget(11333)==0&false))) {{
            __CLR4_5_28oc8oclvha7a7b.R.inc(11334);return this;
        }
        }__CLR4_5_28oc8oclvha7a7b.R.inc(11335);if ((((!Arrays.equals(lhs, rhs))&&(__CLR4_5_28oc8oclvha7a7b.R.iget(11336)!=0|true))||(__CLR4_5_28oc8oclvha7a7b.R.iget(11337)==0&false))) {{
            __CLR4_5_28oc8oclvha7a7b.R.inc(11338);diffs.add(new Diff<Character[]>(fieldName) {
                private static final long serialVersionUID = 1L;

                @Override
                public Character[] getLeft() {try{__CLR4_5_28oc8oclvha7a7b.R.inc(11339);
                    __CLR4_5_28oc8oclvha7a7b.R.inc(11340);return ArrayUtils.toObject(lhs);
                }finally{__CLR4_5_28oc8oclvha7a7b.R.flushNeeded();}}

                @Override
                public Character[] getRight() {try{__CLR4_5_28oc8oclvha7a7b.R.inc(11341);
                    __CLR4_5_28oc8oclvha7a7b.R.inc(11342);return ArrayUtils.toObject(rhs);
                }finally{__CLR4_5_28oc8oclvha7a7b.R.flushNeeded();}}
            });
        }
        }__CLR4_5_28oc8oclvha7a7b.R.inc(11343);return this;
    }finally{__CLR4_5_28oc8oclvha7a7b.R.flushNeeded();}}

    /**
     * <p>
     * Test if two {@code double}s are equal.
     * </p>
     * 
     * @param fieldName
     *            the field name
     * @param lhs
     *            the left hand {@code double}
     * @param rhs
     *            the right hand {@code double}
     * @return this
     * @throws IllegalArgumentException
     *             if field name is {@code null}
     */
    public DiffBuilder append(final String fieldName, final double lhs,
            final double rhs) {try{__CLR4_5_28oc8oclvha7a7b.R.inc(11344);
        __CLR4_5_28oc8oclvha7a7b.R.inc(11345);validateFieldNameNotNull(fieldName);

        __CLR4_5_28oc8oclvha7a7b.R.inc(11346);if ((((objectsTriviallyEqual)&&(__CLR4_5_28oc8oclvha7a7b.R.iget(11347)!=0|true))||(__CLR4_5_28oc8oclvha7a7b.R.iget(11348)==0&false))) {{
            __CLR4_5_28oc8oclvha7a7b.R.inc(11349);return this;
        }
        }__CLR4_5_28oc8oclvha7a7b.R.inc(11350);if ((((Double.doubleToLongBits(lhs) != Double.doubleToLongBits(rhs))&&(__CLR4_5_28oc8oclvha7a7b.R.iget(11351)!=0|true))||(__CLR4_5_28oc8oclvha7a7b.R.iget(11352)==0&false))) {{
            __CLR4_5_28oc8oclvha7a7b.R.inc(11353);diffs.add(new Diff<Double>(fieldName) {
                private static final long serialVersionUID = 1L;

                @Override
                public Double getLeft() {try{__CLR4_5_28oc8oclvha7a7b.R.inc(11354);
                    __CLR4_5_28oc8oclvha7a7b.R.inc(11355);return Double.valueOf(lhs);
                }finally{__CLR4_5_28oc8oclvha7a7b.R.flushNeeded();}}

                @Override
                public Double getRight() {try{__CLR4_5_28oc8oclvha7a7b.R.inc(11356);
                    __CLR4_5_28oc8oclvha7a7b.R.inc(11357);return Double.valueOf(rhs);
                }finally{__CLR4_5_28oc8oclvha7a7b.R.flushNeeded();}}
            });
        }
        }__CLR4_5_28oc8oclvha7a7b.R.inc(11358);return this;
    }finally{__CLR4_5_28oc8oclvha7a7b.R.flushNeeded();}}

    /**
     * <p>
     * Test if two {@code double[]}s are equal.
     * </p>
     * 
     * @param fieldName
     *            the field name
     * @param lhs
     *            the left hand {@code double[]}
     * @param rhs
     *            the right hand {@code double[]}
     * @return this
     * @throws IllegalArgumentException
     *             if field name is {@code null}
     */
    public DiffBuilder append(final String fieldName, final double[] lhs,
            final double[] rhs) {try{__CLR4_5_28oc8oclvha7a7b.R.inc(11359);
        __CLR4_5_28oc8oclvha7a7b.R.inc(11360);validateFieldNameNotNull(fieldName);

        __CLR4_5_28oc8oclvha7a7b.R.inc(11361);if ((((objectsTriviallyEqual)&&(__CLR4_5_28oc8oclvha7a7b.R.iget(11362)!=0|true))||(__CLR4_5_28oc8oclvha7a7b.R.iget(11363)==0&false))) {{
            __CLR4_5_28oc8oclvha7a7b.R.inc(11364);return this;
        }
        }__CLR4_5_28oc8oclvha7a7b.R.inc(11365);if ((((!Arrays.equals(lhs, rhs))&&(__CLR4_5_28oc8oclvha7a7b.R.iget(11366)!=0|true))||(__CLR4_5_28oc8oclvha7a7b.R.iget(11367)==0&false))) {{
            __CLR4_5_28oc8oclvha7a7b.R.inc(11368);diffs.add(new Diff<Double[]>(fieldName) {
                private static final long serialVersionUID = 1L;

                @Override
                public Double[] getLeft() {try{__CLR4_5_28oc8oclvha7a7b.R.inc(11369);
                    __CLR4_5_28oc8oclvha7a7b.R.inc(11370);return ArrayUtils.toObject(lhs);
                }finally{__CLR4_5_28oc8oclvha7a7b.R.flushNeeded();}}

                @Override
                public Double[] getRight() {try{__CLR4_5_28oc8oclvha7a7b.R.inc(11371);
                    __CLR4_5_28oc8oclvha7a7b.R.inc(11372);return ArrayUtils.toObject(rhs);
                }finally{__CLR4_5_28oc8oclvha7a7b.R.flushNeeded();}}
            });
        }
        }__CLR4_5_28oc8oclvha7a7b.R.inc(11373);return this;
    }finally{__CLR4_5_28oc8oclvha7a7b.R.flushNeeded();}}

    /**
     * <p>
     * Test if two {@code float}s are equal.
     * </p>
     * 
     * @param fieldName
     *            the field name
     * @param lhs
     *            the left hand {@code float}
     * @param rhs
     *            the right hand {@code float}
     * @return this
     * @throws IllegalArgumentException
     *             if field name is {@code null}
     */
    public DiffBuilder append(final String fieldName, final float lhs,
            final float rhs) {try{__CLR4_5_28oc8oclvha7a7b.R.inc(11374);
        __CLR4_5_28oc8oclvha7a7b.R.inc(11375);validateFieldNameNotNull(fieldName);

        __CLR4_5_28oc8oclvha7a7b.R.inc(11376);if ((((objectsTriviallyEqual)&&(__CLR4_5_28oc8oclvha7a7b.R.iget(11377)!=0|true))||(__CLR4_5_28oc8oclvha7a7b.R.iget(11378)==0&false))) {{
            __CLR4_5_28oc8oclvha7a7b.R.inc(11379);return this;
        }
        }__CLR4_5_28oc8oclvha7a7b.R.inc(11380);if ((((Float.floatToIntBits(lhs) != Float.floatToIntBits(rhs))&&(__CLR4_5_28oc8oclvha7a7b.R.iget(11381)!=0|true))||(__CLR4_5_28oc8oclvha7a7b.R.iget(11382)==0&false))) {{
            __CLR4_5_28oc8oclvha7a7b.R.inc(11383);diffs.add(new Diff<Float>(fieldName) {
                private static final long serialVersionUID = 1L;

                @Override
                public Float getLeft() {try{__CLR4_5_28oc8oclvha7a7b.R.inc(11384);
                    __CLR4_5_28oc8oclvha7a7b.R.inc(11385);return Float.valueOf(lhs);
                }finally{__CLR4_5_28oc8oclvha7a7b.R.flushNeeded();}}

                @Override
                public Float getRight() {try{__CLR4_5_28oc8oclvha7a7b.R.inc(11386);
                    __CLR4_5_28oc8oclvha7a7b.R.inc(11387);return Float.valueOf(rhs);
                }finally{__CLR4_5_28oc8oclvha7a7b.R.flushNeeded();}}
            });
        }
        }__CLR4_5_28oc8oclvha7a7b.R.inc(11388);return this;
    }finally{__CLR4_5_28oc8oclvha7a7b.R.flushNeeded();}}

    /**
     * <p>
     * Test if two {@code float[]}s are equal.
     * </p>
     * 
     * @param fieldName
     *            the field name
     * @param lhs
     *            the left hand {@code float[]}
     * @param rhs
     *            the right hand {@code float[]}
     * @return this
     * @throws IllegalArgumentException
     *             if field name is {@code null}
     */
    public DiffBuilder append(final String fieldName, final float[] lhs,
            final float[] rhs) {try{__CLR4_5_28oc8oclvha7a7b.R.inc(11389);
        __CLR4_5_28oc8oclvha7a7b.R.inc(11390);validateFieldNameNotNull(fieldName);

        __CLR4_5_28oc8oclvha7a7b.R.inc(11391);if ((((objectsTriviallyEqual)&&(__CLR4_5_28oc8oclvha7a7b.R.iget(11392)!=0|true))||(__CLR4_5_28oc8oclvha7a7b.R.iget(11393)==0&false))) {{
            __CLR4_5_28oc8oclvha7a7b.R.inc(11394);return this;
        }
        }__CLR4_5_28oc8oclvha7a7b.R.inc(11395);if ((((!Arrays.equals(lhs, rhs))&&(__CLR4_5_28oc8oclvha7a7b.R.iget(11396)!=0|true))||(__CLR4_5_28oc8oclvha7a7b.R.iget(11397)==0&false))) {{
            __CLR4_5_28oc8oclvha7a7b.R.inc(11398);diffs.add(new Diff<Float[]>(fieldName) {
                private static final long serialVersionUID = 1L;

                @Override
                public Float[] getLeft() {try{__CLR4_5_28oc8oclvha7a7b.R.inc(11399);
                    __CLR4_5_28oc8oclvha7a7b.R.inc(11400);return ArrayUtils.toObject(lhs);
                }finally{__CLR4_5_28oc8oclvha7a7b.R.flushNeeded();}}

                @Override
                public Float[] getRight() {try{__CLR4_5_28oc8oclvha7a7b.R.inc(11401);
                    __CLR4_5_28oc8oclvha7a7b.R.inc(11402);return ArrayUtils.toObject(rhs);
                }finally{__CLR4_5_28oc8oclvha7a7b.R.flushNeeded();}}
            });
        }
        }__CLR4_5_28oc8oclvha7a7b.R.inc(11403);return this;
    }finally{__CLR4_5_28oc8oclvha7a7b.R.flushNeeded();}}

    /**
     * <p>
     * Test if two {@code int}s are equal.
     * </p>
     * 
     * @param fieldName
     *            the field name
     * @param lhs
     *            the left hand {@code int}
     * @param rhs
     *            the right hand {@code int}
     * @return this
     * @throws IllegalArgumentException
     *             if field name is {@code null}
     */
    public DiffBuilder append(final String fieldName, final int lhs,
            final int rhs) {try{__CLR4_5_28oc8oclvha7a7b.R.inc(11404);
        __CLR4_5_28oc8oclvha7a7b.R.inc(11405);validateFieldNameNotNull(fieldName);

        __CLR4_5_28oc8oclvha7a7b.R.inc(11406);if ((((objectsTriviallyEqual)&&(__CLR4_5_28oc8oclvha7a7b.R.iget(11407)!=0|true))||(__CLR4_5_28oc8oclvha7a7b.R.iget(11408)==0&false))) {{
            __CLR4_5_28oc8oclvha7a7b.R.inc(11409);return this;
        }
        }__CLR4_5_28oc8oclvha7a7b.R.inc(11410);if ((((lhs != rhs)&&(__CLR4_5_28oc8oclvha7a7b.R.iget(11411)!=0|true))||(__CLR4_5_28oc8oclvha7a7b.R.iget(11412)==0&false))) {{
            __CLR4_5_28oc8oclvha7a7b.R.inc(11413);diffs.add(new Diff<Integer>(fieldName) {
                private static final long serialVersionUID = 1L;

                @Override
                public Integer getLeft() {try{__CLR4_5_28oc8oclvha7a7b.R.inc(11414);
                    __CLR4_5_28oc8oclvha7a7b.R.inc(11415);return Integer.valueOf(lhs);
                }finally{__CLR4_5_28oc8oclvha7a7b.R.flushNeeded();}}

                @Override
                public Integer getRight() {try{__CLR4_5_28oc8oclvha7a7b.R.inc(11416);
                    __CLR4_5_28oc8oclvha7a7b.R.inc(11417);return Integer.valueOf(rhs);
                }finally{__CLR4_5_28oc8oclvha7a7b.R.flushNeeded();}}
            });
        }
        }__CLR4_5_28oc8oclvha7a7b.R.inc(11418);return this;
    }finally{__CLR4_5_28oc8oclvha7a7b.R.flushNeeded();}}

    /**
     * <p>
     * Test if two {@code int[]}s are equal.
     * </p>
     * 
     * @param fieldName
     *            the field name
     * @param lhs
     *            the left hand {@code int[]}
     * @param rhs
     *            the right hand {@code int[]}
     * @return this
     * @throws IllegalArgumentException
     *             if field name is {@code null}
     */
    public DiffBuilder append(final String fieldName, final int[] lhs,
            final int[] rhs) {try{__CLR4_5_28oc8oclvha7a7b.R.inc(11419);
        __CLR4_5_28oc8oclvha7a7b.R.inc(11420);validateFieldNameNotNull(fieldName);

        __CLR4_5_28oc8oclvha7a7b.R.inc(11421);if ((((objectsTriviallyEqual)&&(__CLR4_5_28oc8oclvha7a7b.R.iget(11422)!=0|true))||(__CLR4_5_28oc8oclvha7a7b.R.iget(11423)==0&false))) {{
            __CLR4_5_28oc8oclvha7a7b.R.inc(11424);return this;
        }
        }__CLR4_5_28oc8oclvha7a7b.R.inc(11425);if ((((!Arrays.equals(lhs, rhs))&&(__CLR4_5_28oc8oclvha7a7b.R.iget(11426)!=0|true))||(__CLR4_5_28oc8oclvha7a7b.R.iget(11427)==0&false))) {{
            __CLR4_5_28oc8oclvha7a7b.R.inc(11428);diffs.add(new Diff<Integer[]>(fieldName) {
                private static final long serialVersionUID = 1L;

                @Override
                public Integer[] getLeft() {try{__CLR4_5_28oc8oclvha7a7b.R.inc(11429);
                    __CLR4_5_28oc8oclvha7a7b.R.inc(11430);return ArrayUtils.toObject(lhs);
                }finally{__CLR4_5_28oc8oclvha7a7b.R.flushNeeded();}}

                @Override
                public Integer[] getRight() {try{__CLR4_5_28oc8oclvha7a7b.R.inc(11431);
                    __CLR4_5_28oc8oclvha7a7b.R.inc(11432);return ArrayUtils.toObject(rhs);
                }finally{__CLR4_5_28oc8oclvha7a7b.R.flushNeeded();}}
            });
        }
        }__CLR4_5_28oc8oclvha7a7b.R.inc(11433);return this;
    }finally{__CLR4_5_28oc8oclvha7a7b.R.flushNeeded();}}

    /**
     * <p>
     * Test if two {@code long}s are equal.
     * </p>
     * 
     * @param fieldName
     *            the field name
     * @param lhs
     *            the left hand {@code long}
     * @param rhs
     *            the right hand {@code long}
     * @return this
     * @throws IllegalArgumentException
     *             if field name is {@code null}
     */
    public DiffBuilder append(final String fieldName, final long lhs,
            final long rhs) {try{__CLR4_5_28oc8oclvha7a7b.R.inc(11434);
        __CLR4_5_28oc8oclvha7a7b.R.inc(11435);validateFieldNameNotNull(fieldName);

        __CLR4_5_28oc8oclvha7a7b.R.inc(11436);if ((((objectsTriviallyEqual)&&(__CLR4_5_28oc8oclvha7a7b.R.iget(11437)!=0|true))||(__CLR4_5_28oc8oclvha7a7b.R.iget(11438)==0&false))) {{
            __CLR4_5_28oc8oclvha7a7b.R.inc(11439);return this;
        }
        }__CLR4_5_28oc8oclvha7a7b.R.inc(11440);if ((((lhs != rhs)&&(__CLR4_5_28oc8oclvha7a7b.R.iget(11441)!=0|true))||(__CLR4_5_28oc8oclvha7a7b.R.iget(11442)==0&false))) {{
            __CLR4_5_28oc8oclvha7a7b.R.inc(11443);diffs.add(new Diff<Long>(fieldName) {
                private static final long serialVersionUID = 1L;

                @Override
                public Long getLeft() {try{__CLR4_5_28oc8oclvha7a7b.R.inc(11444);
                    __CLR4_5_28oc8oclvha7a7b.R.inc(11445);return Long.valueOf(lhs);
                }finally{__CLR4_5_28oc8oclvha7a7b.R.flushNeeded();}}

                @Override
                public Long getRight() {try{__CLR4_5_28oc8oclvha7a7b.R.inc(11446);
                    __CLR4_5_28oc8oclvha7a7b.R.inc(11447);return Long.valueOf(rhs);
                }finally{__CLR4_5_28oc8oclvha7a7b.R.flushNeeded();}}
            });
        }
        }__CLR4_5_28oc8oclvha7a7b.R.inc(11448);return this;
    }finally{__CLR4_5_28oc8oclvha7a7b.R.flushNeeded();}}

    /**
     * <p>
     * Test if two {@code long[]}s are equal.
     * </p>
     * 
     * @param fieldName
     *            the field name
     * @param lhs
     *            the left hand {@code long[]}
     * @param rhs
     *            the right hand {@code long[]}
     * @return this
     * @throws IllegalArgumentException
     *             if field name is {@code null}
     */
    public DiffBuilder append(final String fieldName, final long[] lhs,
            final long[] rhs) {try{__CLR4_5_28oc8oclvha7a7b.R.inc(11449);
        __CLR4_5_28oc8oclvha7a7b.R.inc(11450);validateFieldNameNotNull(fieldName);

        __CLR4_5_28oc8oclvha7a7b.R.inc(11451);if ((((objectsTriviallyEqual)&&(__CLR4_5_28oc8oclvha7a7b.R.iget(11452)!=0|true))||(__CLR4_5_28oc8oclvha7a7b.R.iget(11453)==0&false))) {{
            __CLR4_5_28oc8oclvha7a7b.R.inc(11454);return this;
        }
        }__CLR4_5_28oc8oclvha7a7b.R.inc(11455);if ((((!Arrays.equals(lhs, rhs))&&(__CLR4_5_28oc8oclvha7a7b.R.iget(11456)!=0|true))||(__CLR4_5_28oc8oclvha7a7b.R.iget(11457)==0&false))) {{
            __CLR4_5_28oc8oclvha7a7b.R.inc(11458);diffs.add(new Diff<Long[]>(fieldName) {
                private static final long serialVersionUID = 1L;

                @Override
                public Long[] getLeft() {try{__CLR4_5_28oc8oclvha7a7b.R.inc(11459);
                    __CLR4_5_28oc8oclvha7a7b.R.inc(11460);return ArrayUtils.toObject(lhs);
                }finally{__CLR4_5_28oc8oclvha7a7b.R.flushNeeded();}}

                @Override
                public Long[] getRight() {try{__CLR4_5_28oc8oclvha7a7b.R.inc(11461);
                    __CLR4_5_28oc8oclvha7a7b.R.inc(11462);return ArrayUtils.toObject(rhs);
                }finally{__CLR4_5_28oc8oclvha7a7b.R.flushNeeded();}}
            });
        }
        }__CLR4_5_28oc8oclvha7a7b.R.inc(11463);return this;
    }finally{__CLR4_5_28oc8oclvha7a7b.R.flushNeeded();}}

    /**
     * <p>
     * Test if two {@code short}s are equal.
     * </p>
     * 
     * @param fieldName
     *            the field name
     * @param lhs
     *            the left hand {@code short}
     * @param rhs
     *            the right hand {@code short}
     * @return this
     * @throws IllegalArgumentException
     *             if field name is {@code null}
     */
    public DiffBuilder append(final String fieldName, final short lhs,
            final short rhs) {try{__CLR4_5_28oc8oclvha7a7b.R.inc(11464);
        __CLR4_5_28oc8oclvha7a7b.R.inc(11465);validateFieldNameNotNull(fieldName);

        __CLR4_5_28oc8oclvha7a7b.R.inc(11466);if ((((objectsTriviallyEqual)&&(__CLR4_5_28oc8oclvha7a7b.R.iget(11467)!=0|true))||(__CLR4_5_28oc8oclvha7a7b.R.iget(11468)==0&false))) {{
            __CLR4_5_28oc8oclvha7a7b.R.inc(11469);return this;
        }
        }__CLR4_5_28oc8oclvha7a7b.R.inc(11470);if ((((lhs != rhs)&&(__CLR4_5_28oc8oclvha7a7b.R.iget(11471)!=0|true))||(__CLR4_5_28oc8oclvha7a7b.R.iget(11472)==0&false))) {{
            __CLR4_5_28oc8oclvha7a7b.R.inc(11473);diffs.add(new Diff<Short>(fieldName) {
                private static final long serialVersionUID = 1L;

                @Override
                public Short getLeft() {try{__CLR4_5_28oc8oclvha7a7b.R.inc(11474);
                    __CLR4_5_28oc8oclvha7a7b.R.inc(11475);return Short.valueOf(lhs);
                }finally{__CLR4_5_28oc8oclvha7a7b.R.flushNeeded();}}

                @Override
                public Short getRight() {try{__CLR4_5_28oc8oclvha7a7b.R.inc(11476);
                    __CLR4_5_28oc8oclvha7a7b.R.inc(11477);return Short.valueOf(rhs);
                }finally{__CLR4_5_28oc8oclvha7a7b.R.flushNeeded();}}
            });
        }
        }__CLR4_5_28oc8oclvha7a7b.R.inc(11478);return this;
    }finally{__CLR4_5_28oc8oclvha7a7b.R.flushNeeded();}}

    /**
     * <p>
     * Test if two {@code short[]}s are equal.
     * </p>
     * 
     * @param fieldName
     *            the field name
     * @param lhs
     *            the left hand {@code short[]}
     * @param rhs
     *            the right hand {@code short[]}
     * @return this
     * @throws IllegalArgumentException
     *             if field name is {@code null}
     */
    public DiffBuilder append(final String fieldName, final short[] lhs,
            final short[] rhs) {try{__CLR4_5_28oc8oclvha7a7b.R.inc(11479);
        __CLR4_5_28oc8oclvha7a7b.R.inc(11480);validateFieldNameNotNull(fieldName);

        __CLR4_5_28oc8oclvha7a7b.R.inc(11481);if ((((objectsTriviallyEqual)&&(__CLR4_5_28oc8oclvha7a7b.R.iget(11482)!=0|true))||(__CLR4_5_28oc8oclvha7a7b.R.iget(11483)==0&false))) {{
            __CLR4_5_28oc8oclvha7a7b.R.inc(11484);return this;
        }
        }__CLR4_5_28oc8oclvha7a7b.R.inc(11485);if ((((!Arrays.equals(lhs, rhs))&&(__CLR4_5_28oc8oclvha7a7b.R.iget(11486)!=0|true))||(__CLR4_5_28oc8oclvha7a7b.R.iget(11487)==0&false))) {{
            __CLR4_5_28oc8oclvha7a7b.R.inc(11488);diffs.add(new Diff<Short[]>(fieldName) {
                private static final long serialVersionUID = 1L;

                @Override
                public Short[] getLeft() {try{__CLR4_5_28oc8oclvha7a7b.R.inc(11489);
                    __CLR4_5_28oc8oclvha7a7b.R.inc(11490);return ArrayUtils.toObject(lhs);
                }finally{__CLR4_5_28oc8oclvha7a7b.R.flushNeeded();}}

                @Override
                public Short[] getRight() {try{__CLR4_5_28oc8oclvha7a7b.R.inc(11491);
                    __CLR4_5_28oc8oclvha7a7b.R.inc(11492);return ArrayUtils.toObject(rhs);
                }finally{__CLR4_5_28oc8oclvha7a7b.R.flushNeeded();}}
            });
        }
        }__CLR4_5_28oc8oclvha7a7b.R.inc(11493);return this;
    }finally{__CLR4_5_28oc8oclvha7a7b.R.flushNeeded();}}

    /**
     * <p>
     * Test if two {@code Objects}s are equal.
     * </p>
     * 
     * @param fieldName
     *            the field name
     * @param lhs
     *            the left hand {@code Object}
     * @param rhs
     *            the right hand {@code Object}
     * @return this
     * @throws IllegalArgumentException
     *             if field name is {@code null}
     */
    public DiffBuilder append(final String fieldName, final Object lhs,
            final Object rhs) {try{__CLR4_5_28oc8oclvha7a7b.R.inc(11494);
        __CLR4_5_28oc8oclvha7a7b.R.inc(11495);validateFieldNameNotNull(fieldName);
        __CLR4_5_28oc8oclvha7a7b.R.inc(11496);if ((((objectsTriviallyEqual)&&(__CLR4_5_28oc8oclvha7a7b.R.iget(11497)!=0|true))||(__CLR4_5_28oc8oclvha7a7b.R.iget(11498)==0&false))) {{
            __CLR4_5_28oc8oclvha7a7b.R.inc(11499);return this;
        }
        }__CLR4_5_28oc8oclvha7a7b.R.inc(11500);if ((((lhs == rhs)&&(__CLR4_5_28oc8oclvha7a7b.R.iget(11501)!=0|true))||(__CLR4_5_28oc8oclvha7a7b.R.iget(11502)==0&false))) {{
            __CLR4_5_28oc8oclvha7a7b.R.inc(11503);return this;
        }

        }__CLR4_5_28oc8oclvha7a7b.R.inc(11504);Object objectToTest;
        __CLR4_5_28oc8oclvha7a7b.R.inc(11505);if ((((lhs != null)&&(__CLR4_5_28oc8oclvha7a7b.R.iget(11506)!=0|true))||(__CLR4_5_28oc8oclvha7a7b.R.iget(11507)==0&false))) {{
            __CLR4_5_28oc8oclvha7a7b.R.inc(11508);objectToTest = lhs;
        } }else {{
            // rhs cannot be null, as lhs != rhs
            __CLR4_5_28oc8oclvha7a7b.R.inc(11509);objectToTest = rhs;
        }

        }__CLR4_5_28oc8oclvha7a7b.R.inc(11510);if ((((objectToTest.getClass().isArray())&&(__CLR4_5_28oc8oclvha7a7b.R.iget(11511)!=0|true))||(__CLR4_5_28oc8oclvha7a7b.R.iget(11512)==0&false))) {{
            __CLR4_5_28oc8oclvha7a7b.R.inc(11513);if ((((objectToTest instanceof boolean[])&&(__CLR4_5_28oc8oclvha7a7b.R.iget(11514)!=0|true))||(__CLR4_5_28oc8oclvha7a7b.R.iget(11515)==0&false))) {{
                __CLR4_5_28oc8oclvha7a7b.R.inc(11516);return append(fieldName, (boolean[]) lhs, (boolean[]) rhs);
            }
            }__CLR4_5_28oc8oclvha7a7b.R.inc(11517);if ((((objectToTest instanceof byte[])&&(__CLR4_5_28oc8oclvha7a7b.R.iget(11518)!=0|true))||(__CLR4_5_28oc8oclvha7a7b.R.iget(11519)==0&false))) {{
                __CLR4_5_28oc8oclvha7a7b.R.inc(11520);return append(fieldName, (byte[]) lhs, (byte[]) rhs);
            }
            }__CLR4_5_28oc8oclvha7a7b.R.inc(11521);if ((((objectToTest instanceof char[])&&(__CLR4_5_28oc8oclvha7a7b.R.iget(11522)!=0|true))||(__CLR4_5_28oc8oclvha7a7b.R.iget(11523)==0&false))) {{
                __CLR4_5_28oc8oclvha7a7b.R.inc(11524);return append(fieldName, (char[]) lhs, (char[]) rhs);
            }
            }__CLR4_5_28oc8oclvha7a7b.R.inc(11525);if ((((objectToTest instanceof double[])&&(__CLR4_5_28oc8oclvha7a7b.R.iget(11526)!=0|true))||(__CLR4_5_28oc8oclvha7a7b.R.iget(11527)==0&false))) {{
                __CLR4_5_28oc8oclvha7a7b.R.inc(11528);return append(fieldName, (double[]) lhs, (double[]) rhs);
            }
            }__CLR4_5_28oc8oclvha7a7b.R.inc(11529);if ((((objectToTest instanceof float[])&&(__CLR4_5_28oc8oclvha7a7b.R.iget(11530)!=0|true))||(__CLR4_5_28oc8oclvha7a7b.R.iget(11531)==0&false))) {{
                __CLR4_5_28oc8oclvha7a7b.R.inc(11532);return append(fieldName, (float[]) lhs, (float[]) rhs);
            }
            }__CLR4_5_28oc8oclvha7a7b.R.inc(11533);if ((((objectToTest instanceof int[])&&(__CLR4_5_28oc8oclvha7a7b.R.iget(11534)!=0|true))||(__CLR4_5_28oc8oclvha7a7b.R.iget(11535)==0&false))) {{
                __CLR4_5_28oc8oclvha7a7b.R.inc(11536);return append(fieldName, (int[]) lhs, (int[]) rhs);
            }
            }__CLR4_5_28oc8oclvha7a7b.R.inc(11537);if ((((objectToTest instanceof long[])&&(__CLR4_5_28oc8oclvha7a7b.R.iget(11538)!=0|true))||(__CLR4_5_28oc8oclvha7a7b.R.iget(11539)==0&false))) {{
                __CLR4_5_28oc8oclvha7a7b.R.inc(11540);return append(fieldName, (long[]) lhs, (long[]) rhs);
            }
            }__CLR4_5_28oc8oclvha7a7b.R.inc(11541);if ((((objectToTest instanceof short[])&&(__CLR4_5_28oc8oclvha7a7b.R.iget(11542)!=0|true))||(__CLR4_5_28oc8oclvha7a7b.R.iget(11543)==0&false))) {{
                __CLR4_5_28oc8oclvha7a7b.R.inc(11544);return append(fieldName, (short[]) lhs, (short[]) rhs);
            }

            }__CLR4_5_28oc8oclvha7a7b.R.inc(11545);return append(fieldName, (Object[]) lhs, (Object[]) rhs);
        }

        // Not array type
        }__CLR4_5_28oc8oclvha7a7b.R.inc(11546);if ((((lhs != null && lhs.equals(rhs))&&(__CLR4_5_28oc8oclvha7a7b.R.iget(11547)!=0|true))||(__CLR4_5_28oc8oclvha7a7b.R.iget(11548)==0&false))) {{
            __CLR4_5_28oc8oclvha7a7b.R.inc(11549);return this;
        }

        }__CLR4_5_28oc8oclvha7a7b.R.inc(11550);diffs.add(new Diff<Object>(fieldName) {
            private static final long serialVersionUID = 1L;

            @Override
            public Object getLeft() {try{__CLR4_5_28oc8oclvha7a7b.R.inc(11551);
                __CLR4_5_28oc8oclvha7a7b.R.inc(11552);return lhs;
            }finally{__CLR4_5_28oc8oclvha7a7b.R.flushNeeded();}}

            @Override
            public Object getRight() {try{__CLR4_5_28oc8oclvha7a7b.R.inc(11553);
                __CLR4_5_28oc8oclvha7a7b.R.inc(11554);return rhs;
            }finally{__CLR4_5_28oc8oclvha7a7b.R.flushNeeded();}}
        });

        __CLR4_5_28oc8oclvha7a7b.R.inc(11555);return this;
    }finally{__CLR4_5_28oc8oclvha7a7b.R.flushNeeded();}}

    /**
     * <p>
     * Test if two {@code Object[]}s are equal.
     * </p>
     * 
     * @param fieldName
     *            the field name
     * @param lhs
     *            the left hand {@code Object[]}
     * @param rhs
     *            the right hand {@code Object[]}
     * @return this
     * @throws IllegalArgumentException
     *             if field name is {@code null}
     */
    public DiffBuilder append(final String fieldName, final Object[] lhs,
            final Object[] rhs) {try{__CLR4_5_28oc8oclvha7a7b.R.inc(11556);
        __CLR4_5_28oc8oclvha7a7b.R.inc(11557);validateFieldNameNotNull(fieldName);
        __CLR4_5_28oc8oclvha7a7b.R.inc(11558);if ((((objectsTriviallyEqual)&&(__CLR4_5_28oc8oclvha7a7b.R.iget(11559)!=0|true))||(__CLR4_5_28oc8oclvha7a7b.R.iget(11560)==0&false))) {{
            __CLR4_5_28oc8oclvha7a7b.R.inc(11561);return this;
        }

        }__CLR4_5_28oc8oclvha7a7b.R.inc(11562);if ((((!Arrays.equals(lhs, rhs))&&(__CLR4_5_28oc8oclvha7a7b.R.iget(11563)!=0|true))||(__CLR4_5_28oc8oclvha7a7b.R.iget(11564)==0&false))) {{
            __CLR4_5_28oc8oclvha7a7b.R.inc(11565);diffs.add(new Diff<Object[]>(fieldName) {
                private static final long serialVersionUID = 1L;

                @Override
                public Object[] getLeft() {try{__CLR4_5_28oc8oclvha7a7b.R.inc(11566);
                    __CLR4_5_28oc8oclvha7a7b.R.inc(11567);return lhs;
                }finally{__CLR4_5_28oc8oclvha7a7b.R.flushNeeded();}}

                @Override
                public Object[] getRight() {try{__CLR4_5_28oc8oclvha7a7b.R.inc(11568);
                    __CLR4_5_28oc8oclvha7a7b.R.inc(11569);return rhs;
                }finally{__CLR4_5_28oc8oclvha7a7b.R.flushNeeded();}}
            });
        }

        }__CLR4_5_28oc8oclvha7a7b.R.inc(11570);return this;
    }finally{__CLR4_5_28oc8oclvha7a7b.R.flushNeeded();}}

    /**
     * <p>
     * Append diffs from another {@code DiffResult}.
     * </p>
     * 
     * <p>
     * This method is useful if you want to compare properties which are
     * themselves Diffable and would like to know which specific part of
     * it is different.
     * </p>
     * 
     * <pre>
     * public class Person implements Diffable&lt;Person&gt; {
     *   String name;
     *   Address address; // implements Diffable&lt;Address&gt;
     *   
     *   ...
     *   
     *   public DiffResult diff(Person obj) {
     *     return new DiffBuilder(this, obj, ToStringStyle.SHORT_PREFIX_STYLE)
     *       .append("name", this.name, obj.name)
     *       .append("address", this.address.diff(obj.address))
     *       .build();
     *   }
     * }
     * </pre>
     * 
     * @param fieldName
     *            the field name
     * @param diffResult
     *            the {@code DiffResult} to append
     * @return this
     * @throws IllegalArgumentException
     *             if field name is {@code null}
     * @since 3.5
     */
    public DiffBuilder append(final String fieldName,
            final DiffResult diffResult) {try{__CLR4_5_28oc8oclvha7a7b.R.inc(11571);
        __CLR4_5_28oc8oclvha7a7b.R.inc(11572);validateFieldNameNotNull(fieldName);
        __CLR4_5_28oc8oclvha7a7b.R.inc(11573);Validate.isTrue(diffResult != null, "Diff result cannot be null");
        __CLR4_5_28oc8oclvha7a7b.R.inc(11574);if ((((objectsTriviallyEqual)&&(__CLR4_5_28oc8oclvha7a7b.R.iget(11575)!=0|true))||(__CLR4_5_28oc8oclvha7a7b.R.iget(11576)==0&false))) {{
            __CLR4_5_28oc8oclvha7a7b.R.inc(11577);return this;
        }

        }__CLR4_5_28oc8oclvha7a7b.R.inc(11578);for (final Diff<?> diff : diffResult.getDiffs()) {{
            __CLR4_5_28oc8oclvha7a7b.R.inc(11579);append(fieldName + "." + diff.getFieldName(),
                   diff.getLeft(), diff.getRight());
        }

        }__CLR4_5_28oc8oclvha7a7b.R.inc(11580);return this;
    }finally{__CLR4_5_28oc8oclvha7a7b.R.flushNeeded();}}

    /**
     * <p>
     * Builds a {@link DiffResult} based on the differences appended to this
     * builder.
     * </p>
     * 
     * @return a {@code DiffResult} containing the differences between the two
     *         objects.
     */
    @Override
    public DiffResult build() {try{__CLR4_5_28oc8oclvha7a7b.R.inc(11581);
        __CLR4_5_28oc8oclvha7a7b.R.inc(11582);return new DiffResult(left, right, diffs, style);
    }finally{__CLR4_5_28oc8oclvha7a7b.R.flushNeeded();}}

    private void validateFieldNameNotNull(final String fieldName) {try{__CLR4_5_28oc8oclvha7a7b.R.inc(11583);
        __CLR4_5_28oc8oclvha7a7b.R.inc(11584);Validate.isTrue(fieldName != null, "Field name cannot be null");
    }finally{__CLR4_5_28oc8oclvha7a7b.R.flushNeeded();}}

}
