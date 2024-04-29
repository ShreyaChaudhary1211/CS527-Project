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
package org.apache.commons.lang3;

import org.apache.commons.lang3.math.NumberUtils;

/**
 * <p>Operations on boolean primitives and Boolean objects.</p>
 *
 * <p>This class tries to handle {@code null} input gracefully.
 * An exception will not be thrown for a {@code null} input.
 * Each method documents its behaviour in more detail.</p>
 *
 * <p>#ThreadSafe#</p>
 * @since 2.0
 */
@java.lang.SuppressWarnings({"fallthrough"}) public class BooleanUtils {public static class __CLR4_5_22ys2yslvha78kh{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172755542L,8589935092L,4240,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * <p>{@code BooleanUtils} instances should NOT be constructed in standard programming.
     * Instead, the class should be used as {@code BooleanUtils.negate(true);}.</p>
     *
     * <p>This constructor is public to permit tools that require a JavaBean instance
     * to operate.</p>
     */
    public BooleanUtils() {
      super();__CLR4_5_22ys2yslvha78kh.R.inc(3845);try{__CLR4_5_22ys2yslvha78kh.R.inc(3844);
    }finally{__CLR4_5_22ys2yslvha78kh.R.flushNeeded();}}

    // Boolean utilities
    //--------------------------------------------------------------------------
    /**
     * <p>Negates the specified boolean.</p>
     *
     * <p>If {@code null} is passed in, {@code null} will be returned.</p>
     *
     * <p>NOTE: This returns null and will throw a NullPointerException if unboxed to a boolean. </p>
     *
     * <pre>
     *   BooleanUtils.negate(Boolean.TRUE)  = Boolean.FALSE;
     *   BooleanUtils.negate(Boolean.FALSE) = Boolean.TRUE;
     *   BooleanUtils.negate(null)          = null;
     * </pre>
     *
     * @param bool  the Boolean to negate, may be null
     * @return the negated Boolean, or {@code null} if {@code null} input
     */
    public static Boolean negate(final Boolean bool) {try{__CLR4_5_22ys2yslvha78kh.R.inc(3846);
        __CLR4_5_22ys2yslvha78kh.R.inc(3847);if ((((bool == null)&&(__CLR4_5_22ys2yslvha78kh.R.iget(3848)!=0|true))||(__CLR4_5_22ys2yslvha78kh.R.iget(3849)==0&false))) {{
            __CLR4_5_22ys2yslvha78kh.R.inc(3850);return null;
        }
        }__CLR4_5_22ys2yslvha78kh.R.inc(3851);return (((bool.booleanValue() )&&(__CLR4_5_22ys2yslvha78kh.R.iget(3852)!=0|true))||(__CLR4_5_22ys2yslvha78kh.R.iget(3853)==0&false))? Boolean.FALSE : Boolean.TRUE;
    }finally{__CLR4_5_22ys2yslvha78kh.R.flushNeeded();}}

    // boolean Boolean methods
    //-----------------------------------------------------------------------
    /**
     * <p>Checks if a {@code Boolean} value is {@code true},
     * handling {@code null} by returning {@code false}.</p>
     *
     * <pre>
     *   BooleanUtils.isTrue(Boolean.TRUE)  = true
     *   BooleanUtils.isTrue(Boolean.FALSE) = false
     *   BooleanUtils.isTrue(null)          = false
     * </pre>
     *
     * @param bool  the boolean to check, null returns {@code false}
     * @return {@code true} only if the input is non-null and true
     * @since 2.1
     */
    public static boolean isTrue(final Boolean bool) {try{__CLR4_5_22ys2yslvha78kh.R.inc(3854);
        __CLR4_5_22ys2yslvha78kh.R.inc(3855);return Boolean.TRUE.equals(bool);
    }finally{__CLR4_5_22ys2yslvha78kh.R.flushNeeded();}}

    /**
     * <p>Checks if a {@code Boolean} value is <i>not</i> {@code true},
     * handling {@code null} by returning {@code true}.</p>
     *
     * <pre>
     *   BooleanUtils.isNotTrue(Boolean.TRUE)  = false
     *   BooleanUtils.isNotTrue(Boolean.FALSE) = true
     *   BooleanUtils.isNotTrue(null)          = true
     * </pre>
     *
     * @param bool  the boolean to check, null returns {@code true}
     * @return {@code true} if the input is null or false
     * @since 2.3
     */
    public static boolean isNotTrue(final Boolean bool) {try{__CLR4_5_22ys2yslvha78kh.R.inc(3856);
        __CLR4_5_22ys2yslvha78kh.R.inc(3857);return !isTrue(bool);
    }finally{__CLR4_5_22ys2yslvha78kh.R.flushNeeded();}}

    /**
     * <p>Checks if a {@code Boolean} value is {@code false},
     * handling {@code null} by returning {@code false}.</p>
     *
     * <pre>
     *   BooleanUtils.isFalse(Boolean.TRUE)  = false
     *   BooleanUtils.isFalse(Boolean.FALSE) = true
     *   BooleanUtils.isFalse(null)          = false
     * </pre>
     *
     * @param bool  the boolean to check, null returns {@code false}
     * @return {@code true} only if the input is non-null and false
     * @since 2.1
     */
    public static boolean isFalse(final Boolean bool) {try{__CLR4_5_22ys2yslvha78kh.R.inc(3858);
        __CLR4_5_22ys2yslvha78kh.R.inc(3859);return Boolean.FALSE.equals(bool);
    }finally{__CLR4_5_22ys2yslvha78kh.R.flushNeeded();}}

    /**
     * <p>Checks if a {@code Boolean} value is <i>not</i> {@code false},
     * handling {@code null} by returning {@code true}.</p>
     *
     * <pre>
     *   BooleanUtils.isNotFalse(Boolean.TRUE)  = true
     *   BooleanUtils.isNotFalse(Boolean.FALSE) = false
     *   BooleanUtils.isNotFalse(null)          = true
     * </pre>
     *
     * @param bool  the boolean to check, null returns {@code true}
     * @return {@code true} if the input is null or true
     * @since 2.3
     */
    public static boolean isNotFalse(final Boolean bool) {try{__CLR4_5_22ys2yslvha78kh.R.inc(3860);
        __CLR4_5_22ys2yslvha78kh.R.inc(3861);return !isFalse(bool);
    }finally{__CLR4_5_22ys2yslvha78kh.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * <p>Converts a Boolean to a boolean handling {@code null}
     * by returning {@code false}.</p>
     *
     * <pre>
     *   BooleanUtils.toBoolean(Boolean.TRUE)  = true
     *   BooleanUtils.toBoolean(Boolean.FALSE) = false
     *   BooleanUtils.toBoolean(null)          = false
     * </pre>
     *
     * @param bool  the boolean to convert
     * @return {@code true} or {@code false}, {@code null} returns {@code false}
     */
    public static boolean toBoolean(final Boolean bool) {try{__CLR4_5_22ys2yslvha78kh.R.inc(3862);
        __CLR4_5_22ys2yslvha78kh.R.inc(3863);return bool != null && bool.booleanValue();
    }finally{__CLR4_5_22ys2yslvha78kh.R.flushNeeded();}}

    /**
     * <p>Converts a Boolean to a boolean handling {@code null}.</p>
     *
     * <pre>
     *   BooleanUtils.toBooleanDefaultIfNull(Boolean.TRUE, false) = true
     *   BooleanUtils.toBooleanDefaultIfNull(Boolean.FALSE, true) = false
     *   BooleanUtils.toBooleanDefaultIfNull(null, true)          = true
     * </pre>
     *
     * @param bool  the boolean to convert
     * @param valueIfNull  the boolean value to return if {@code null}
     * @return {@code true} or {@code false}
     */
    public static boolean toBooleanDefaultIfNull(final Boolean bool, final boolean valueIfNull) {try{__CLR4_5_22ys2yslvha78kh.R.inc(3864);
        __CLR4_5_22ys2yslvha78kh.R.inc(3865);if ((((bool == null)&&(__CLR4_5_22ys2yslvha78kh.R.iget(3866)!=0|true))||(__CLR4_5_22ys2yslvha78kh.R.iget(3867)==0&false))) {{
            __CLR4_5_22ys2yslvha78kh.R.inc(3868);return valueIfNull;
        }
        }__CLR4_5_22ys2yslvha78kh.R.inc(3869);return bool.booleanValue();
    }finally{__CLR4_5_22ys2yslvha78kh.R.flushNeeded();}}

    // Integer to Boolean methods
    //-----------------------------------------------------------------------
    /**
     * <p>Converts an int to a boolean using the convention that {@code zero}
     * is {@code false}.</p>
     *
     * <pre>
     *   BooleanUtils.toBoolean(0) = false
     *   BooleanUtils.toBoolean(1) = true
     *   BooleanUtils.toBoolean(2) = true
     * </pre>
     *
     * @param value  the int to convert
     * @return {@code true} if non-zero, {@code false}
     *  if zero
     */
    public static boolean toBoolean(final int value) {try{__CLR4_5_22ys2yslvha78kh.R.inc(3870);
        __CLR4_5_22ys2yslvha78kh.R.inc(3871);return value != 0;
    }finally{__CLR4_5_22ys2yslvha78kh.R.flushNeeded();}}

    /**
     * <p>Converts an int to a Boolean using the convention that {@code zero}
     * is {@code false}.</p>
     *
     * <pre>
     *   BooleanUtils.toBoolean(0) = Boolean.FALSE
     *   BooleanUtils.toBoolean(1) = Boolean.TRUE
     *   BooleanUtils.toBoolean(2) = Boolean.TRUE
     * </pre>
     *
     * @param value  the int to convert
     * @return Boolean.TRUE if non-zero, Boolean.FALSE if zero,
     *  {@code null} if {@code null}
     */
    public static Boolean toBooleanObject(final int value) {try{__CLR4_5_22ys2yslvha78kh.R.inc(3872);
        __CLR4_5_22ys2yslvha78kh.R.inc(3873);return (((value == 0 )&&(__CLR4_5_22ys2yslvha78kh.R.iget(3874)!=0|true))||(__CLR4_5_22ys2yslvha78kh.R.iget(3875)==0&false))? Boolean.FALSE : Boolean.TRUE;
    }finally{__CLR4_5_22ys2yslvha78kh.R.flushNeeded();}}

    /**
     * <p>Converts an Integer to a Boolean using the convention that {@code zero}
     * is {@code false}.</p>
     *
     * <p>{@code null} will be converted to {@code null}.</p>
     *
     * <p>NOTE: This returns null and will throw a NullPointerException if unboxed to a boolean. </p>
     *
     * <pre>
     *   BooleanUtils.toBoolean(Integer.valueOf(0))    = Boolean.FALSE
     *   BooleanUtils.toBoolean(Integer.valueOf(1))    = Boolean.TRUE
     *   BooleanUtils.toBoolean(Integer.valueOf(null)) = null
     * </pre>
     *
     * @param value  the Integer to convert
     * @return Boolean.TRUE if non-zero, Boolean.FALSE if zero,
     *  {@code null} if {@code null} input
     */
    public static Boolean toBooleanObject(final Integer value) {try{__CLR4_5_22ys2yslvha78kh.R.inc(3876);
        __CLR4_5_22ys2yslvha78kh.R.inc(3877);if ((((value == null)&&(__CLR4_5_22ys2yslvha78kh.R.iget(3878)!=0|true))||(__CLR4_5_22ys2yslvha78kh.R.iget(3879)==0&false))) {{
            __CLR4_5_22ys2yslvha78kh.R.inc(3880);return null;
        }
        }__CLR4_5_22ys2yslvha78kh.R.inc(3881);return (((value.intValue() == 0 )&&(__CLR4_5_22ys2yslvha78kh.R.iget(3882)!=0|true))||(__CLR4_5_22ys2yslvha78kh.R.iget(3883)==0&false))? Boolean.FALSE : Boolean.TRUE;
    }finally{__CLR4_5_22ys2yslvha78kh.R.flushNeeded();}}

    /**
     * <p>Converts an int to a boolean specifying the conversion values.</p>
     *
     * <pre>
     *   BooleanUtils.toBoolean(0, 1, 0) = false
     *   BooleanUtils.toBoolean(1, 1, 0) = true
     *   BooleanUtils.toBoolean(2, 1, 2) = false
     *   BooleanUtils.toBoolean(2, 2, 0) = true
     * </pre>
     *
     * @param value  the Integer to convert
     * @param trueValue  the value to match for {@code true}
     * @param falseValue  the value to match for {@code false}
     * @return {@code true} or {@code false}
     * @throws IllegalArgumentException if no match
     */
    public static boolean toBoolean(final int value, final int trueValue, final int falseValue) {try{__CLR4_5_22ys2yslvha78kh.R.inc(3884);
        __CLR4_5_22ys2yslvha78kh.R.inc(3885);if ((((value == trueValue)&&(__CLR4_5_22ys2yslvha78kh.R.iget(3886)!=0|true))||(__CLR4_5_22ys2yslvha78kh.R.iget(3887)==0&false))) {{
            __CLR4_5_22ys2yslvha78kh.R.inc(3888);return true;
        }
        }__CLR4_5_22ys2yslvha78kh.R.inc(3889);if ((((value == falseValue)&&(__CLR4_5_22ys2yslvha78kh.R.iget(3890)!=0|true))||(__CLR4_5_22ys2yslvha78kh.R.iget(3891)==0&false))) {{
            __CLR4_5_22ys2yslvha78kh.R.inc(3892);return false;
        }
        // no match
        }__CLR4_5_22ys2yslvha78kh.R.inc(3893);throw new IllegalArgumentException("The Integer did not match either specified value");
    }finally{__CLR4_5_22ys2yslvha78kh.R.flushNeeded();}}

    /**
     * <p>Converts an Integer to a boolean specifying the conversion values.</p>
     *
     * <pre>
     *   BooleanUtils.toBoolean(Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(0)) = false
     *   BooleanUtils.toBoolean(Integer.valueOf(1), Integer.valueOf(1), Integer.valueOf(0)) = true
     *   BooleanUtils.toBoolean(Integer.valueOf(2), Integer.valueOf(1), Integer.valueOf(2)) = false
     *   BooleanUtils.toBoolean(Integer.valueOf(2), Integer.valueOf(2), Integer.valueOf(0)) = true
     *   BooleanUtils.toBoolean(null, null, Integer.valueOf(0))                     = true
     * </pre>
     *
     * @param value  the Integer to convert
     * @param trueValue  the value to match for {@code true}, may be {@code null}
     * @param falseValue  the value to match for {@code false}, may be {@code null}
     * @return {@code true} or {@code false}
     * @throws IllegalArgumentException if no match
     */
    public static boolean toBoolean(final Integer value, final Integer trueValue, final Integer falseValue) {try{__CLR4_5_22ys2yslvha78kh.R.inc(3894);
        __CLR4_5_22ys2yslvha78kh.R.inc(3895);if ((((value == null)&&(__CLR4_5_22ys2yslvha78kh.R.iget(3896)!=0|true))||(__CLR4_5_22ys2yslvha78kh.R.iget(3897)==0&false))) {{
            __CLR4_5_22ys2yslvha78kh.R.inc(3898);if ((((trueValue == null)&&(__CLR4_5_22ys2yslvha78kh.R.iget(3899)!=0|true))||(__CLR4_5_22ys2yslvha78kh.R.iget(3900)==0&false))) {{
                __CLR4_5_22ys2yslvha78kh.R.inc(3901);return true;
            }
            }__CLR4_5_22ys2yslvha78kh.R.inc(3902);if ((((falseValue == null)&&(__CLR4_5_22ys2yslvha78kh.R.iget(3903)!=0|true))||(__CLR4_5_22ys2yslvha78kh.R.iget(3904)==0&false))) {{
                __CLR4_5_22ys2yslvha78kh.R.inc(3905);return false;
            }
        }} }else {__CLR4_5_22ys2yslvha78kh.R.inc(3906);if ((((value.equals(trueValue))&&(__CLR4_5_22ys2yslvha78kh.R.iget(3907)!=0|true))||(__CLR4_5_22ys2yslvha78kh.R.iget(3908)==0&false))) {{
            __CLR4_5_22ys2yslvha78kh.R.inc(3909);return true;
        } }else {__CLR4_5_22ys2yslvha78kh.R.inc(3910);if ((((value.equals(falseValue))&&(__CLR4_5_22ys2yslvha78kh.R.iget(3911)!=0|true))||(__CLR4_5_22ys2yslvha78kh.R.iget(3912)==0&false))) {{
            __CLR4_5_22ys2yslvha78kh.R.inc(3913);return false;
        }
        // no match
        }}}__CLR4_5_22ys2yslvha78kh.R.inc(3914);throw new IllegalArgumentException("The Integer did not match either specified value");
    }finally{__CLR4_5_22ys2yslvha78kh.R.flushNeeded();}}

    /**
     * <p>Converts an int to a Boolean specifying the conversion values.</p>
     *
     * <p>NOTE: This returns null and will throw a NullPointerException if unboxed to a boolean. </p>
     *
     * <pre>
     *   BooleanUtils.toBooleanObject(0, 0, 2, 3) = Boolean.TRUE
     *   BooleanUtils.toBooleanObject(2, 1, 2, 3) = Boolean.FALSE
     *   BooleanUtils.toBooleanObject(3, 1, 2, 3) = null
     * </pre>
     *
     * @param value  the Integer to convert
     * @param trueValue  the value to match for {@code true}
     * @param falseValue  the value to match for {@code false}
     * @param nullValue  the value to to match for {@code null}
     * @return Boolean.TRUE, Boolean.FALSE, or {@code null}
     * @throws IllegalArgumentException if no match
     */
    public static Boolean toBooleanObject(final int value, final int trueValue, final int falseValue, final int nullValue) {try{__CLR4_5_22ys2yslvha78kh.R.inc(3915);
        __CLR4_5_22ys2yslvha78kh.R.inc(3916);if ((((value == trueValue)&&(__CLR4_5_22ys2yslvha78kh.R.iget(3917)!=0|true))||(__CLR4_5_22ys2yslvha78kh.R.iget(3918)==0&false))) {{
            __CLR4_5_22ys2yslvha78kh.R.inc(3919);return Boolean.TRUE;
        }
        }__CLR4_5_22ys2yslvha78kh.R.inc(3920);if ((((value == falseValue)&&(__CLR4_5_22ys2yslvha78kh.R.iget(3921)!=0|true))||(__CLR4_5_22ys2yslvha78kh.R.iget(3922)==0&false))) {{
            __CLR4_5_22ys2yslvha78kh.R.inc(3923);return Boolean.FALSE;
        }
        }__CLR4_5_22ys2yslvha78kh.R.inc(3924);if ((((value == nullValue)&&(__CLR4_5_22ys2yslvha78kh.R.iget(3925)!=0|true))||(__CLR4_5_22ys2yslvha78kh.R.iget(3926)==0&false))) {{
            __CLR4_5_22ys2yslvha78kh.R.inc(3927);return null;
        }
        // no match
        }__CLR4_5_22ys2yslvha78kh.R.inc(3928);throw new IllegalArgumentException("The Integer did not match any specified value");
    }finally{__CLR4_5_22ys2yslvha78kh.R.flushNeeded();}}

    /**
     * <p>Converts an Integer to a Boolean specifying the conversion values.</p>
     *
     * <p>NOTE: This returns null and will throw a NullPointerException if unboxed to a boolean. </p>
     *
     * <pre>
     *   BooleanUtils.toBooleanObject(Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(2), Integer.valueOf(3)) = Boolean.TRUE
     *   BooleanUtils.toBooleanObject(Integer.valueOf(2), Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(3)) = Boolean.FALSE
     *   BooleanUtils.toBooleanObject(Integer.valueOf(3), Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(3)) = null
     * </pre>
     *
     * @param value  the Integer to convert
     * @param trueValue  the value to match for {@code true}, may be {@code null}
     * @param falseValue  the value to match for {@code false}, may be {@code null}
     * @param nullValue  the value to to match for {@code null}, may be {@code null}
     * @return Boolean.TRUE, Boolean.FALSE, or {@code null}
     * @throws IllegalArgumentException if no match
     */
    public static Boolean toBooleanObject(final Integer value, final Integer trueValue, final Integer falseValue, final Integer nullValue) {try{__CLR4_5_22ys2yslvha78kh.R.inc(3929);
        __CLR4_5_22ys2yslvha78kh.R.inc(3930);if ((((value == null)&&(__CLR4_5_22ys2yslvha78kh.R.iget(3931)!=0|true))||(__CLR4_5_22ys2yslvha78kh.R.iget(3932)==0&false))) {{
            __CLR4_5_22ys2yslvha78kh.R.inc(3933);if ((((trueValue == null)&&(__CLR4_5_22ys2yslvha78kh.R.iget(3934)!=0|true))||(__CLR4_5_22ys2yslvha78kh.R.iget(3935)==0&false))) {{
                __CLR4_5_22ys2yslvha78kh.R.inc(3936);return Boolean.TRUE;
            }
            }__CLR4_5_22ys2yslvha78kh.R.inc(3937);if ((((falseValue == null)&&(__CLR4_5_22ys2yslvha78kh.R.iget(3938)!=0|true))||(__CLR4_5_22ys2yslvha78kh.R.iget(3939)==0&false))) {{
                __CLR4_5_22ys2yslvha78kh.R.inc(3940);return Boolean.FALSE;
            }
            }__CLR4_5_22ys2yslvha78kh.R.inc(3941);if ((((nullValue == null)&&(__CLR4_5_22ys2yslvha78kh.R.iget(3942)!=0|true))||(__CLR4_5_22ys2yslvha78kh.R.iget(3943)==0&false))) {{
                __CLR4_5_22ys2yslvha78kh.R.inc(3944);return null;
            }
        }} }else {__CLR4_5_22ys2yslvha78kh.R.inc(3945);if ((((value.equals(trueValue))&&(__CLR4_5_22ys2yslvha78kh.R.iget(3946)!=0|true))||(__CLR4_5_22ys2yslvha78kh.R.iget(3947)==0&false))) {{
            __CLR4_5_22ys2yslvha78kh.R.inc(3948);return Boolean.TRUE;
        } }else {__CLR4_5_22ys2yslvha78kh.R.inc(3949);if ((((value.equals(falseValue))&&(__CLR4_5_22ys2yslvha78kh.R.iget(3950)!=0|true))||(__CLR4_5_22ys2yslvha78kh.R.iget(3951)==0&false))) {{
            __CLR4_5_22ys2yslvha78kh.R.inc(3952);return Boolean.FALSE;
        } }else {__CLR4_5_22ys2yslvha78kh.R.inc(3953);if ((((value.equals(nullValue))&&(__CLR4_5_22ys2yslvha78kh.R.iget(3954)!=0|true))||(__CLR4_5_22ys2yslvha78kh.R.iget(3955)==0&false))) {{
            __CLR4_5_22ys2yslvha78kh.R.inc(3956);return null;
        }
        // no match
        }}}}__CLR4_5_22ys2yslvha78kh.R.inc(3957);throw new IllegalArgumentException("The Integer did not match any specified value");
    }finally{__CLR4_5_22ys2yslvha78kh.R.flushNeeded();}}

    // Boolean to Integer methods
    //-----------------------------------------------------------------------
    /**
     * <p>Converts a boolean to an int using the convention that
     * {@code zero} is {@code false}.</p>
     *
     * <pre>
     *   BooleanUtils.toInteger(true)  = 1
     *   BooleanUtils.toInteger(false) = 0
     * </pre>
     *
     * @param bool  the boolean to convert
     * @return one if {@code true}, zero if {@code false}
     */
    public static int toInteger(final boolean bool) {try{__CLR4_5_22ys2yslvha78kh.R.inc(3958);
        __CLR4_5_22ys2yslvha78kh.R.inc(3959);return (((bool )&&(__CLR4_5_22ys2yslvha78kh.R.iget(3960)!=0|true))||(__CLR4_5_22ys2yslvha78kh.R.iget(3961)==0&false))? 1 : 0;
    }finally{__CLR4_5_22ys2yslvha78kh.R.flushNeeded();}}

    /**
     * <p>Converts a boolean to an Integer using the convention that
     * {@code zero} is {@code false}.</p>
     *
     * <pre>
     *   BooleanUtils.toIntegerObject(true)  = Integer.valueOf(1)
     *   BooleanUtils.toIntegerObject(false) = Integer.valueOf(0)
     * </pre>
     *
     * @param bool  the boolean to convert
     * @return one if {@code true}, zero if {@code false}
     */
    public static Integer toIntegerObject(final boolean bool) {try{__CLR4_5_22ys2yslvha78kh.R.inc(3962);
        __CLR4_5_22ys2yslvha78kh.R.inc(3963);return (((bool )&&(__CLR4_5_22ys2yslvha78kh.R.iget(3964)!=0|true))||(__CLR4_5_22ys2yslvha78kh.R.iget(3965)==0&false))? NumberUtils.INTEGER_ONE : NumberUtils.INTEGER_ZERO;
    }finally{__CLR4_5_22ys2yslvha78kh.R.flushNeeded();}}

    /**
     * <p>Converts a Boolean to a Integer using the convention that
     * {@code zero} is {@code false}.</p>
     *
     * <p>{@code null} will be converted to {@code null}.</p>
     *
     * <pre>
     *   BooleanUtils.toIntegerObject(Boolean.TRUE)  = Integer.valueOf(1)
     *   BooleanUtils.toIntegerObject(Boolean.FALSE) = Integer.valueOf(0)
     * </pre>
     *
     * @param bool  the Boolean to convert
     * @return one if Boolean.TRUE, zero if Boolean.FALSE, {@code null} if {@code null}
     */
    public static Integer toIntegerObject(final Boolean bool) {try{__CLR4_5_22ys2yslvha78kh.R.inc(3966);
        __CLR4_5_22ys2yslvha78kh.R.inc(3967);if ((((bool == null)&&(__CLR4_5_22ys2yslvha78kh.R.iget(3968)!=0|true))||(__CLR4_5_22ys2yslvha78kh.R.iget(3969)==0&false))) {{
            __CLR4_5_22ys2yslvha78kh.R.inc(3970);return null;
        }
        }__CLR4_5_22ys2yslvha78kh.R.inc(3971);return (((bool.booleanValue() )&&(__CLR4_5_22ys2yslvha78kh.R.iget(3972)!=0|true))||(__CLR4_5_22ys2yslvha78kh.R.iget(3973)==0&false))? NumberUtils.INTEGER_ONE : NumberUtils.INTEGER_ZERO;
    }finally{__CLR4_5_22ys2yslvha78kh.R.flushNeeded();}}

    /**
     * <p>Converts a boolean to an int specifying the conversion values.</p>
     *
     * <pre>
     *   BooleanUtils.toInteger(true, 1, 0)  = 1
     *   BooleanUtils.toInteger(false, 1, 0) = 0
     * </pre>
     *
     * @param bool  the to convert
     * @param trueValue  the value to return if {@code true}
     * @param falseValue  the value to return if {@code false}
     * @return the appropriate value
     */
    public static int toInteger(final boolean bool, final int trueValue, final int falseValue) {try{__CLR4_5_22ys2yslvha78kh.R.inc(3974);
        __CLR4_5_22ys2yslvha78kh.R.inc(3975);return (((bool )&&(__CLR4_5_22ys2yslvha78kh.R.iget(3976)!=0|true))||(__CLR4_5_22ys2yslvha78kh.R.iget(3977)==0&false))? trueValue : falseValue;
    }finally{__CLR4_5_22ys2yslvha78kh.R.flushNeeded();}}

    /**
     * <p>Converts a Boolean to an int specifying the conversion values.</p>
     *
     * <pre>
     *   BooleanUtils.toInteger(Boolean.TRUE, 1, 0, 2)  = 1
     *   BooleanUtils.toInteger(Boolean.FALSE, 1, 0, 2) = 0
     *   BooleanUtils.toInteger(null, 1, 0, 2)          = 2
     * </pre>
     *
     * @param bool  the Boolean to convert
     * @param trueValue  the value to return if {@code true}
     * @param falseValue  the value to return if {@code false}
     * @param nullValue  the value to return if {@code null}
     * @return the appropriate value
     */
    public static int toInteger(final Boolean bool, final int trueValue, final int falseValue, final int nullValue) {try{__CLR4_5_22ys2yslvha78kh.R.inc(3978);
        __CLR4_5_22ys2yslvha78kh.R.inc(3979);if ((((bool == null)&&(__CLR4_5_22ys2yslvha78kh.R.iget(3980)!=0|true))||(__CLR4_5_22ys2yslvha78kh.R.iget(3981)==0&false))) {{
            __CLR4_5_22ys2yslvha78kh.R.inc(3982);return nullValue;
        }
        }__CLR4_5_22ys2yslvha78kh.R.inc(3983);return (((bool.booleanValue() )&&(__CLR4_5_22ys2yslvha78kh.R.iget(3984)!=0|true))||(__CLR4_5_22ys2yslvha78kh.R.iget(3985)==0&false))? trueValue : falseValue;
    }finally{__CLR4_5_22ys2yslvha78kh.R.flushNeeded();}}

    /**
     * <p>Converts a boolean to an Integer specifying the conversion values.</p>
     *
     * <pre>
     *   BooleanUtils.toIntegerObject(true, Integer.valueOf(1), Integer.valueOf(0))  = Integer.valueOf(1)
     *   BooleanUtils.toIntegerObject(false, Integer.valueOf(1), Integer.valueOf(0)) = Integer.valueOf(0)
     * </pre>
     *
     * @param bool  the to convert
     * @param trueValue  the value to return if {@code true}, may be {@code null}
     * @param falseValue  the value to return if {@code false}, may be {@code null}
     * @return the appropriate value
     */
    public static Integer toIntegerObject(final boolean bool, final Integer trueValue, final Integer falseValue) {try{__CLR4_5_22ys2yslvha78kh.R.inc(3986);
        __CLR4_5_22ys2yslvha78kh.R.inc(3987);return (((bool )&&(__CLR4_5_22ys2yslvha78kh.R.iget(3988)!=0|true))||(__CLR4_5_22ys2yslvha78kh.R.iget(3989)==0&false))? trueValue : falseValue;
    }finally{__CLR4_5_22ys2yslvha78kh.R.flushNeeded();}}

    /**
     * <p>Converts a Boolean to an Integer specifying the conversion values.</p>
     *
     * <pre>
     *   BooleanUtils.toIntegerObject(Boolean.TRUE, Integer.valueOf(1), Integer.valueOf(0), Integer.valueOf(2))  = Integer.valueOf(1)
     *   BooleanUtils.toIntegerObject(Boolean.FALSE, Integer.valueOf(1), Integer.valueOf(0), Integer.valueOf(2)) = Integer.valueOf(0)
     *   BooleanUtils.toIntegerObject(null, Integer.valueOf(1), Integer.valueOf(0), Integer.valueOf(2))          = Integer.valueOf(2)
     * </pre>
     *
     * @param bool  the Boolean to convert
     * @param trueValue  the value to return if {@code true}, may be {@code null}
     * @param falseValue  the value to return if {@code false}, may be {@code null}
     * @param nullValue  the value to return if {@code null}, may be {@code null}
     * @return the appropriate value
     */
    public static Integer toIntegerObject(final Boolean bool, final Integer trueValue, final Integer falseValue, final Integer nullValue) {try{__CLR4_5_22ys2yslvha78kh.R.inc(3990);
        __CLR4_5_22ys2yslvha78kh.R.inc(3991);if ((((bool == null)&&(__CLR4_5_22ys2yslvha78kh.R.iget(3992)!=0|true))||(__CLR4_5_22ys2yslvha78kh.R.iget(3993)==0&false))) {{
            __CLR4_5_22ys2yslvha78kh.R.inc(3994);return nullValue;
        }
        }__CLR4_5_22ys2yslvha78kh.R.inc(3995);return (((bool.booleanValue() )&&(__CLR4_5_22ys2yslvha78kh.R.iget(3996)!=0|true))||(__CLR4_5_22ys2yslvha78kh.R.iget(3997)==0&false))? trueValue : falseValue;
    }finally{__CLR4_5_22ys2yslvha78kh.R.flushNeeded();}}

    // String to Boolean methods
    //-----------------------------------------------------------------------
    /**
     * <p>Converts a String to a Boolean.</p>
     *
     * <p>{@code 'true'}, {@code 'on'}, {@code 'y'}, {@code 't'} or {@code 'yes'}
     * (case insensitive) will return {@code true}.
     * {@code 'false'}, {@code 'off'}, {@code 'n'}, {@code 'f'} or {@code 'no'}
     * (case insensitive) will return {@code false}.
     * Otherwise, {@code null} is returned.</p>
     *
     * <p>NOTE: This returns null and will throw a NullPointerException if unboxed to a boolean. </p>
     *
     * <pre>
     *   // N.B. case is not significant
     *   BooleanUtils.toBooleanObject(null)    = null
     *   BooleanUtils.toBooleanObject("true")  = Boolean.TRUE
     *   BooleanUtils.toBooleanObject("T")     = Boolean.TRUE // i.e. T[RUE]
     *   BooleanUtils.toBooleanObject("false") = Boolean.FALSE
     *   BooleanUtils.toBooleanObject("f")     = Boolean.FALSE // i.e. f[alse]
     *   BooleanUtils.toBooleanObject("No")    = Boolean.FALSE
     *   BooleanUtils.toBooleanObject("n")     = Boolean.FALSE // i.e. n[o]
     *   BooleanUtils.toBooleanObject("on")    = Boolean.TRUE
     *   BooleanUtils.toBooleanObject("ON")    = Boolean.TRUE
     *   BooleanUtils.toBooleanObject("off")   = Boolean.FALSE
     *   BooleanUtils.toBooleanObject("oFf")   = Boolean.FALSE
     *   BooleanUtils.toBooleanObject("yes")   = Boolean.TRUE
     *   BooleanUtils.toBooleanObject("Y")     = Boolean.TRUE // i.e. Y[ES]
     *   BooleanUtils.toBooleanObject("blue")  = null
     *   BooleanUtils.toBooleanObject("true ") = null // trailing space (too long)
     *   BooleanUtils.toBooleanObject("ono")   = null // does not match on or no
     * </pre>
     *
     * @param str  the String to check; upper and lower case are treated as the same
     * @return the Boolean value of the string, {@code null} if no match or {@code null} input
     */
    public static Boolean toBooleanObject(final String str) {try{__CLR4_5_22ys2yslvha78kh.R.inc(3998);
        // Previously used equalsIgnoreCase, which was fast for interned 'true'.
        // Non interned 'true' matched 15 times slower.
        //
        // Optimisation provides same performance as before for interned 'true'.
        // Similar performance for null, 'false', and other strings not length 2/3/4.
        // 'true'/'TRUE' match 4 times slower, 'tRUE'/'True' 7 times slower.
        __CLR4_5_22ys2yslvha78kh.R.inc(3999);if ((((str == "true")&&(__CLR4_5_22ys2yslvha78kh.R.iget(4000)!=0|true))||(__CLR4_5_22ys2yslvha78kh.R.iget(4001)==0&false))) {{
            __CLR4_5_22ys2yslvha78kh.R.inc(4002);return Boolean.TRUE;
        }
        }__CLR4_5_22ys2yslvha78kh.R.inc(4003);if ((((str == null)&&(__CLR4_5_22ys2yslvha78kh.R.iget(4004)!=0|true))||(__CLR4_5_22ys2yslvha78kh.R.iget(4005)==0&false))) {{
            __CLR4_5_22ys2yslvha78kh.R.inc(4006);return null;
        }
        }boolean __CLB4_5_2_bool0=false;__CLR4_5_22ys2yslvha78kh.R.inc(4007);switch (str.length()) {
            case 1:if (!__CLB4_5_2_bool0) {__CLR4_5_22ys2yslvha78kh.R.inc(4008);__CLB4_5_2_bool0=true;} {
                __CLR4_5_22ys2yslvha78kh.R.inc(4009);final char ch0 = str.charAt(0);
                __CLR4_5_22ys2yslvha78kh.R.inc(4010);if ((((ch0 == 'y' || ch0 == 'Y' ||
                    ch0 == 't' || ch0 == 'T')&&(__CLR4_5_22ys2yslvha78kh.R.iget(4011)!=0|true))||(__CLR4_5_22ys2yslvha78kh.R.iget(4012)==0&false))) {{
                    __CLR4_5_22ys2yslvha78kh.R.inc(4013);return Boolean.TRUE;
                }
                }__CLR4_5_22ys2yslvha78kh.R.inc(4014);if ((((ch0 == 'n' || ch0 == 'N' ||
                    ch0 == 'f' || ch0 == 'F')&&(__CLR4_5_22ys2yslvha78kh.R.iget(4015)!=0|true))||(__CLR4_5_22ys2yslvha78kh.R.iget(4016)==0&false))) {{
                    __CLR4_5_22ys2yslvha78kh.R.inc(4017);return Boolean.FALSE;
                }
                }__CLR4_5_22ys2yslvha78kh.R.inc(4018);break;
            }
            case 2:if (!__CLB4_5_2_bool0) {__CLR4_5_22ys2yslvha78kh.R.inc(4019);__CLB4_5_2_bool0=true;} {
                __CLR4_5_22ys2yslvha78kh.R.inc(4020);final char ch0 = str.charAt(0);
                __CLR4_5_22ys2yslvha78kh.R.inc(4021);final char ch1 = str.charAt(1);
                __CLR4_5_22ys2yslvha78kh.R.inc(4022);if (((((ch0 == 'o' || ch0 == 'O') &&
                    (ch1 == 'n' || ch1 == 'N') )&&(__CLR4_5_22ys2yslvha78kh.R.iget(4023)!=0|true))||(__CLR4_5_22ys2yslvha78kh.R.iget(4024)==0&false))) {{
                    __CLR4_5_22ys2yslvha78kh.R.inc(4025);return Boolean.TRUE;
                }
                }__CLR4_5_22ys2yslvha78kh.R.inc(4026);if (((((ch0 == 'n' || ch0 == 'N') &&
                    (ch1 == 'o' || ch1 == 'O') )&&(__CLR4_5_22ys2yslvha78kh.R.iget(4027)!=0|true))||(__CLR4_5_22ys2yslvha78kh.R.iget(4028)==0&false))) {{
                    __CLR4_5_22ys2yslvha78kh.R.inc(4029);return Boolean.FALSE;
                }
                }__CLR4_5_22ys2yslvha78kh.R.inc(4030);break;
            }
            case 3:if (!__CLB4_5_2_bool0) {__CLR4_5_22ys2yslvha78kh.R.inc(4031);__CLB4_5_2_bool0=true;} {
                __CLR4_5_22ys2yslvha78kh.R.inc(4032);final char ch0 = str.charAt(0);
                __CLR4_5_22ys2yslvha78kh.R.inc(4033);final char ch1 = str.charAt(1);
                __CLR4_5_22ys2yslvha78kh.R.inc(4034);final char ch2 = str.charAt(2);
                __CLR4_5_22ys2yslvha78kh.R.inc(4035);if (((((ch0 == 'y' || ch0 == 'Y') &&
                    (ch1 == 'e' || ch1 == 'E') &&
                    (ch2 == 's' || ch2 == 'S') )&&(__CLR4_5_22ys2yslvha78kh.R.iget(4036)!=0|true))||(__CLR4_5_22ys2yslvha78kh.R.iget(4037)==0&false))) {{
                    __CLR4_5_22ys2yslvha78kh.R.inc(4038);return Boolean.TRUE;
                }
                }__CLR4_5_22ys2yslvha78kh.R.inc(4039);if (((((ch0 == 'o' || ch0 == 'O') &&
                    (ch1 == 'f' || ch1 == 'F') &&
                    (ch2 == 'f' || ch2 == 'F') )&&(__CLR4_5_22ys2yslvha78kh.R.iget(4040)!=0|true))||(__CLR4_5_22ys2yslvha78kh.R.iget(4041)==0&false))) {{
                    __CLR4_5_22ys2yslvha78kh.R.inc(4042);return Boolean.FALSE;
                }
                }__CLR4_5_22ys2yslvha78kh.R.inc(4043);break;
            }
            case 4:if (!__CLB4_5_2_bool0) {__CLR4_5_22ys2yslvha78kh.R.inc(4044);__CLB4_5_2_bool0=true;} {
                __CLR4_5_22ys2yslvha78kh.R.inc(4045);final char ch0 = str.charAt(0);
                __CLR4_5_22ys2yslvha78kh.R.inc(4046);final char ch1 = str.charAt(1);
                __CLR4_5_22ys2yslvha78kh.R.inc(4047);final char ch2 = str.charAt(2);
                __CLR4_5_22ys2yslvha78kh.R.inc(4048);final char ch3 = str.charAt(3);
                __CLR4_5_22ys2yslvha78kh.R.inc(4049);if (((((ch0 == 't' || ch0 == 'T') &&
                    (ch1 == 'r' || ch1 == 'R') &&
                    (ch2 == 'u' || ch2 == 'U') &&
                    (ch3 == 'e' || ch3 == 'E') )&&(__CLR4_5_22ys2yslvha78kh.R.iget(4050)!=0|true))||(__CLR4_5_22ys2yslvha78kh.R.iget(4051)==0&false))) {{
                    __CLR4_5_22ys2yslvha78kh.R.inc(4052);return Boolean.TRUE;
                }
                }__CLR4_5_22ys2yslvha78kh.R.inc(4053);break;
            }
            case 5:if (!__CLB4_5_2_bool0) {__CLR4_5_22ys2yslvha78kh.R.inc(4054);__CLB4_5_2_bool0=true;} {
                __CLR4_5_22ys2yslvha78kh.R.inc(4055);final char ch0 = str.charAt(0);
                __CLR4_5_22ys2yslvha78kh.R.inc(4056);final char ch1 = str.charAt(1);
                __CLR4_5_22ys2yslvha78kh.R.inc(4057);final char ch2 = str.charAt(2);
                __CLR4_5_22ys2yslvha78kh.R.inc(4058);final char ch3 = str.charAt(3);
                __CLR4_5_22ys2yslvha78kh.R.inc(4059);final char ch4 = str.charAt(4);
                __CLR4_5_22ys2yslvha78kh.R.inc(4060);if (((((ch0 == 'f' || ch0 == 'F') &&
                    (ch1 == 'a' || ch1 == 'A') &&
                    (ch2 == 'l' || ch2 == 'L') &&
                    (ch3 == 's' || ch3 == 'S') &&
                    (ch4 == 'e' || ch4 == 'E') )&&(__CLR4_5_22ys2yslvha78kh.R.iget(4061)!=0|true))||(__CLR4_5_22ys2yslvha78kh.R.iget(4062)==0&false))) {{
                    __CLR4_5_22ys2yslvha78kh.R.inc(4063);return Boolean.FALSE;
                }
                }__CLR4_5_22ys2yslvha78kh.R.inc(4064);break;
            }
        default:if (!__CLB4_5_2_bool0) {__CLR4_5_22ys2yslvha78kh.R.inc(4065);__CLB4_5_2_bool0=true;}
            __CLR4_5_22ys2yslvha78kh.R.inc(4066);break;
        }

        __CLR4_5_22ys2yslvha78kh.R.inc(4067);return null;
    }finally{__CLR4_5_22ys2yslvha78kh.R.flushNeeded();}}

    /**
     * <p>Converts a String to a Boolean throwing an exception if no match.</p>
     *
     * <p>NOTE: This returns null and will throw a NullPointerException if unboxed to a boolean. </p>
     *
     * <pre>
     *   BooleanUtils.toBooleanObject("true", "true", "false", "null")  = Boolean.TRUE
     *   BooleanUtils.toBooleanObject("false", "true", "false", "null") = Boolean.FALSE
     *   BooleanUtils.toBooleanObject("null", "true", "false", "null")  = null
     * </pre>
     *
     * @param str  the String to check
     * @param trueString  the String to match for {@code true} (case sensitive), may be {@code null}
     * @param falseString  the String to match for {@code false} (case sensitive), may be {@code null}
     * @param nullString  the String to match for {@code null} (case sensitive), may be {@code null}
     * @return the Boolean value of the string, {@code null} if either the String matches {@code nullString}
     *  or if {@code null} input and {@code nullString} is {@code null}
     * @throws IllegalArgumentException if the String doesn't match
     */
    public static Boolean toBooleanObject(final String str, final String trueString, final String falseString, final String nullString) {try{__CLR4_5_22ys2yslvha78kh.R.inc(4068);
        __CLR4_5_22ys2yslvha78kh.R.inc(4069);if ((((str == null)&&(__CLR4_5_22ys2yslvha78kh.R.iget(4070)!=0|true))||(__CLR4_5_22ys2yslvha78kh.R.iget(4071)==0&false))) {{
            __CLR4_5_22ys2yslvha78kh.R.inc(4072);if ((((trueString == null)&&(__CLR4_5_22ys2yslvha78kh.R.iget(4073)!=0|true))||(__CLR4_5_22ys2yslvha78kh.R.iget(4074)==0&false))) {{
                __CLR4_5_22ys2yslvha78kh.R.inc(4075);return Boolean.TRUE;
            }
            }__CLR4_5_22ys2yslvha78kh.R.inc(4076);if ((((falseString == null)&&(__CLR4_5_22ys2yslvha78kh.R.iget(4077)!=0|true))||(__CLR4_5_22ys2yslvha78kh.R.iget(4078)==0&false))) {{
                __CLR4_5_22ys2yslvha78kh.R.inc(4079);return Boolean.FALSE;
            }
            }__CLR4_5_22ys2yslvha78kh.R.inc(4080);if ((((nullString == null)&&(__CLR4_5_22ys2yslvha78kh.R.iget(4081)!=0|true))||(__CLR4_5_22ys2yslvha78kh.R.iget(4082)==0&false))) {{
                __CLR4_5_22ys2yslvha78kh.R.inc(4083);return null;
            }
        }} }else {__CLR4_5_22ys2yslvha78kh.R.inc(4084);if ((((str.equals(trueString))&&(__CLR4_5_22ys2yslvha78kh.R.iget(4085)!=0|true))||(__CLR4_5_22ys2yslvha78kh.R.iget(4086)==0&false))) {{
            __CLR4_5_22ys2yslvha78kh.R.inc(4087);return Boolean.TRUE;
        } }else {__CLR4_5_22ys2yslvha78kh.R.inc(4088);if ((((str.equals(falseString))&&(__CLR4_5_22ys2yslvha78kh.R.iget(4089)!=0|true))||(__CLR4_5_22ys2yslvha78kh.R.iget(4090)==0&false))) {{
            __CLR4_5_22ys2yslvha78kh.R.inc(4091);return Boolean.FALSE;
        } }else {__CLR4_5_22ys2yslvha78kh.R.inc(4092);if ((((str.equals(nullString))&&(__CLR4_5_22ys2yslvha78kh.R.iget(4093)!=0|true))||(__CLR4_5_22ys2yslvha78kh.R.iget(4094)==0&false))) {{
            __CLR4_5_22ys2yslvha78kh.R.inc(4095);return null;
        }
        // no match
        }}}}__CLR4_5_22ys2yslvha78kh.R.inc(4096);throw new IllegalArgumentException("The String did not match any specified value");
    }finally{__CLR4_5_22ys2yslvha78kh.R.flushNeeded();}}

    // String to boolean methods
    //-----------------------------------------------------------------------
    /**
     * <p>Converts a String to a boolean (optimised for performance).</p>
     *
     * <p>{@code 'true'}, {@code 'on'}, {@code 'y'}, {@code 't'} or {@code 'yes'}
     * (case insensitive) will return {@code true}. Otherwise,
     * {@code false} is returned.</p>
     *
     * <p>This method performs 4 times faster (JDK1.4) than
     * {@code Boolean.valueOf(String)}. However, this method accepts
     * 'on' and 'yes', 't', 'y' as true values.
     *
     * <pre>
     *   BooleanUtils.toBoolean(null)    = false
     *   BooleanUtils.toBoolean("true")  = true
     *   BooleanUtils.toBoolean("TRUE")  = true
     *   BooleanUtils.toBoolean("tRUe")  = true
     *   BooleanUtils.toBoolean("on")    = true
     *   BooleanUtils.toBoolean("yes")   = true
     *   BooleanUtils.toBoolean("false") = false
     *   BooleanUtils.toBoolean("x gti") = false
     *   BooleanUtils.toBooleanObject("y") = true
     *   BooleanUtils.toBooleanObject("n") = false
     *   BooleanUtils.toBooleanObject("t") = true
     *   BooleanUtils.toBooleanObject("f") = false 
     * </pre>
     *
     * @param str  the String to check
     * @return the boolean value of the string, {@code false} if no match or the String is null
     */
    public static boolean toBoolean(final String str) {try{__CLR4_5_22ys2yslvha78kh.R.inc(4097);
        __CLR4_5_22ys2yslvha78kh.R.inc(4098);return toBooleanObject(str) == Boolean.TRUE;
    }finally{__CLR4_5_22ys2yslvha78kh.R.flushNeeded();}}

    /**
     * <p>Converts a String to a Boolean throwing an exception if no match found.</p>
     *
     * <pre>
     *   BooleanUtils.toBoolean("true", "true", "false")  = true
     *   BooleanUtils.toBoolean("false", "true", "false") = false
     * </pre>
     *
     * @param str  the String to check
     * @param trueString  the String to match for {@code true} (case sensitive), may be {@code null}
     * @param falseString  the String to match for {@code false} (case sensitive), may be {@code null}
     * @return the boolean value of the string
     * @throws IllegalArgumentException if the String doesn't match
     */
    public static boolean toBoolean(final String str, final String trueString, final String falseString) {try{__CLR4_5_22ys2yslvha78kh.R.inc(4099);
        __CLR4_5_22ys2yslvha78kh.R.inc(4100);if ((((str == trueString)&&(__CLR4_5_22ys2yslvha78kh.R.iget(4101)!=0|true))||(__CLR4_5_22ys2yslvha78kh.R.iget(4102)==0&false))) {{
            __CLR4_5_22ys2yslvha78kh.R.inc(4103);return true;
        } }else {__CLR4_5_22ys2yslvha78kh.R.inc(4104);if ((((str == falseString)&&(__CLR4_5_22ys2yslvha78kh.R.iget(4105)!=0|true))||(__CLR4_5_22ys2yslvha78kh.R.iget(4106)==0&false))) {{
            __CLR4_5_22ys2yslvha78kh.R.inc(4107);return false;
        } }else {__CLR4_5_22ys2yslvha78kh.R.inc(4108);if ((((str != null)&&(__CLR4_5_22ys2yslvha78kh.R.iget(4109)!=0|true))||(__CLR4_5_22ys2yslvha78kh.R.iget(4110)==0&false))) {{
            __CLR4_5_22ys2yslvha78kh.R.inc(4111);if ((((str.equals(trueString))&&(__CLR4_5_22ys2yslvha78kh.R.iget(4112)!=0|true))||(__CLR4_5_22ys2yslvha78kh.R.iget(4113)==0&false))) {{
                __CLR4_5_22ys2yslvha78kh.R.inc(4114);return true;
            } }else {__CLR4_5_22ys2yslvha78kh.R.inc(4115);if ((((str.equals(falseString))&&(__CLR4_5_22ys2yslvha78kh.R.iget(4116)!=0|true))||(__CLR4_5_22ys2yslvha78kh.R.iget(4117)==0&false))) {{
                __CLR4_5_22ys2yslvha78kh.R.inc(4118);return false;
            }
        }}}
        // no match
        }}}__CLR4_5_22ys2yslvha78kh.R.inc(4119);throw new IllegalArgumentException("The String did not match either specified value");
    }finally{__CLR4_5_22ys2yslvha78kh.R.flushNeeded();}}

    // Boolean to String methods
    //-----------------------------------------------------------------------
    /**
     * <p>Converts a Boolean to a String returning {@code 'true'},
     * {@code 'false'}, or {@code null}.</p>
     *
     * <pre>
     *   BooleanUtils.toStringTrueFalse(Boolean.TRUE)  = "true"
     *   BooleanUtils.toStringTrueFalse(Boolean.FALSE) = "false"
     *   BooleanUtils.toStringTrueFalse(null)          = null;
     * </pre>
     *
     * @param bool  the Boolean to check
     * @return {@code 'true'}, {@code 'false'}, or {@code null}
     */
    public static String toStringTrueFalse(final Boolean bool) {try{__CLR4_5_22ys2yslvha78kh.R.inc(4120);
        __CLR4_5_22ys2yslvha78kh.R.inc(4121);return toString(bool, "true", "false", null);
    }finally{__CLR4_5_22ys2yslvha78kh.R.flushNeeded();}}

    /**
     * <p>Converts a Boolean to a String returning {@code 'on'},
     * {@code 'off'}, or {@code null}.</p>
     *
     * <pre>
     *   BooleanUtils.toStringOnOff(Boolean.TRUE)  = "on"
     *   BooleanUtils.toStringOnOff(Boolean.FALSE) = "off"
     *   BooleanUtils.toStringOnOff(null)          = null;
     * </pre>
     *
     * @param bool  the Boolean to check
     * @return {@code 'on'}, {@code 'off'}, or {@code null}
     */
    public static String toStringOnOff(final Boolean bool) {try{__CLR4_5_22ys2yslvha78kh.R.inc(4122);
        __CLR4_5_22ys2yslvha78kh.R.inc(4123);return toString(bool, "on", "off", null);
    }finally{__CLR4_5_22ys2yslvha78kh.R.flushNeeded();}}

    /**
     * <p>Converts a Boolean to a String returning {@code 'yes'},
     * {@code 'no'}, or {@code null}.</p>
     *
     * <pre>
     *   BooleanUtils.toStringYesNo(Boolean.TRUE)  = "yes"
     *   BooleanUtils.toStringYesNo(Boolean.FALSE) = "no"
     *   BooleanUtils.toStringYesNo(null)          = null;
     * </pre>
     *
     * @param bool  the Boolean to check
     * @return {@code 'yes'}, {@code 'no'}, or {@code null}
     */
    public static String toStringYesNo(final Boolean bool) {try{__CLR4_5_22ys2yslvha78kh.R.inc(4124);
        __CLR4_5_22ys2yslvha78kh.R.inc(4125);return toString(bool, "yes", "no", null);
    }finally{__CLR4_5_22ys2yslvha78kh.R.flushNeeded();}}

    /**
     * <p>Converts a Boolean to a String returning one of the input Strings.</p>
     *
     * <pre>
     *   BooleanUtils.toString(Boolean.TRUE, "true", "false", null)   = "true"
     *   BooleanUtils.toString(Boolean.FALSE, "true", "false", null)  = "false"
     *   BooleanUtils.toString(null, "true", "false", null)           = null;
     * </pre>
     *
     * @param bool  the Boolean to check
     * @param trueString  the String to return if {@code true}, may be {@code null}
     * @param falseString  the String to return if {@code false}, may be {@code null}
     * @param nullString  the String to return if {@code null}, may be {@code null}
     * @return one of the three input Strings
     */
    public static String toString(final Boolean bool, final String trueString, final String falseString, final String nullString) {try{__CLR4_5_22ys2yslvha78kh.R.inc(4126);
        __CLR4_5_22ys2yslvha78kh.R.inc(4127);if ((((bool == null)&&(__CLR4_5_22ys2yslvha78kh.R.iget(4128)!=0|true))||(__CLR4_5_22ys2yslvha78kh.R.iget(4129)==0&false))) {{
            __CLR4_5_22ys2yslvha78kh.R.inc(4130);return nullString;
        }
        }__CLR4_5_22ys2yslvha78kh.R.inc(4131);return (((bool.booleanValue() )&&(__CLR4_5_22ys2yslvha78kh.R.iget(4132)!=0|true))||(__CLR4_5_22ys2yslvha78kh.R.iget(4133)==0&false))? trueString : falseString;
    }finally{__CLR4_5_22ys2yslvha78kh.R.flushNeeded();}}

    // boolean to String methods
    //-----------------------------------------------------------------------
    /**
     * <p>Converts a boolean to a String returning {@code 'true'}
     * or {@code 'false'}.</p>
     *
     * <pre>
     *   BooleanUtils.toStringTrueFalse(true)   = "true"
     *   BooleanUtils.toStringTrueFalse(false)  = "false"
     * </pre>
     *
     * @param bool  the Boolean to check
     * @return {@code 'true'}, {@code 'false'}, or {@code null}
     */
    public static String toStringTrueFalse(final boolean bool) {try{__CLR4_5_22ys2yslvha78kh.R.inc(4134);
        __CLR4_5_22ys2yslvha78kh.R.inc(4135);return toString(bool, "true", "false");
    }finally{__CLR4_5_22ys2yslvha78kh.R.flushNeeded();}}

    /**
     * <p>Converts a boolean to a String returning {@code 'on'}
     * or {@code 'off'}.</p>
     *
     * <pre>
     *   BooleanUtils.toStringOnOff(true)   = "on"
     *   BooleanUtils.toStringOnOff(false)  = "off"
     * </pre>
     *
     * @param bool  the Boolean to check
     * @return {@code 'on'}, {@code 'off'}, or {@code null}
     */
    public static String toStringOnOff(final boolean bool) {try{__CLR4_5_22ys2yslvha78kh.R.inc(4136);
        __CLR4_5_22ys2yslvha78kh.R.inc(4137);return toString(bool, "on", "off");
    }finally{__CLR4_5_22ys2yslvha78kh.R.flushNeeded();}}

    /**
     * <p>Converts a boolean to a String returning {@code 'yes'}
     * or {@code 'no'}.</p>
     *
     * <pre>
     *   BooleanUtils.toStringYesNo(true)   = "yes"
     *   BooleanUtils.toStringYesNo(false)  = "no"
     * </pre>
     *
     * @param bool  the Boolean to check
     * @return {@code 'yes'}, {@code 'no'}, or {@code null}
     */
    public static String toStringYesNo(final boolean bool) {try{__CLR4_5_22ys2yslvha78kh.R.inc(4138);
        __CLR4_5_22ys2yslvha78kh.R.inc(4139);return toString(bool, "yes", "no");
    }finally{__CLR4_5_22ys2yslvha78kh.R.flushNeeded();}}

    /**
     * <p>Converts a boolean to a String returning one of the input Strings.</p>
     *
     * <pre>
     *   BooleanUtils.toString(true, "true", "false")   = "true"
     *   BooleanUtils.toString(false, "true", "false")  = "false"
     * </pre>
     *
     * @param bool  the Boolean to check
     * @param trueString  the String to return if {@code true}, may be {@code null}
     * @param falseString  the String to return if {@code false}, may be {@code null}
     * @return one of the two input Strings
     */
    public static String toString(final boolean bool, final String trueString, final String falseString) {try{__CLR4_5_22ys2yslvha78kh.R.inc(4140);
        __CLR4_5_22ys2yslvha78kh.R.inc(4141);return (((bool )&&(__CLR4_5_22ys2yslvha78kh.R.iget(4142)!=0|true))||(__CLR4_5_22ys2yslvha78kh.R.iget(4143)==0&false))? trueString : falseString;
    }finally{__CLR4_5_22ys2yslvha78kh.R.flushNeeded();}}

    // logical operations
    // ----------------------------------------------------------------------
    /**
     * <p>Performs an and on a set of booleans.</p>
     *
     * <pre>
     *   BooleanUtils.and(true, true)         = true
     *   BooleanUtils.and(false, false)       = false
     *   BooleanUtils.and(true, false)        = false
     *   BooleanUtils.and(true, true, false)  = false
     *   BooleanUtils.and(true, true, true)   = true
     * </pre>
     *
     * @param array  an array of {@code boolean}s
     * @return {@code true} if the and is successful.
     * @throws IllegalArgumentException if {@code array} is {@code null}
     * @throws IllegalArgumentException if {@code array} is empty.
     * @since 3.0.1
     */
    public static boolean and(final boolean... array) {try{__CLR4_5_22ys2yslvha78kh.R.inc(4144);
        // Validates input
        __CLR4_5_22ys2yslvha78kh.R.inc(4145);if ((((array == null)&&(__CLR4_5_22ys2yslvha78kh.R.iget(4146)!=0|true))||(__CLR4_5_22ys2yslvha78kh.R.iget(4147)==0&false))) {{
            __CLR4_5_22ys2yslvha78kh.R.inc(4148);throw new IllegalArgumentException("The Array must not be null");
        }
        }__CLR4_5_22ys2yslvha78kh.R.inc(4149);if ((((array.length == 0)&&(__CLR4_5_22ys2yslvha78kh.R.iget(4150)!=0|true))||(__CLR4_5_22ys2yslvha78kh.R.iget(4151)==0&false))) {{
            __CLR4_5_22ys2yslvha78kh.R.inc(4152);throw new IllegalArgumentException("Array is empty");
        }
        }__CLR4_5_22ys2yslvha78kh.R.inc(4153);for (final boolean element : array) {{
            __CLR4_5_22ys2yslvha78kh.R.inc(4154);if ((((!element)&&(__CLR4_5_22ys2yslvha78kh.R.iget(4155)!=0|true))||(__CLR4_5_22ys2yslvha78kh.R.iget(4156)==0&false))) {{
                __CLR4_5_22ys2yslvha78kh.R.inc(4157);return false;
            }
        }}
        }__CLR4_5_22ys2yslvha78kh.R.inc(4158);return true;
    }finally{__CLR4_5_22ys2yslvha78kh.R.flushNeeded();}}

    /**
     * <p>Performs an and on an array of Booleans.</p>
     *
     * <pre>
     *   BooleanUtils.and(Boolean.TRUE, Boolean.TRUE)                 = Boolean.TRUE
     *   BooleanUtils.and(Boolean.FALSE, Boolean.FALSE)               = Boolean.FALSE
     *   BooleanUtils.and(Boolean.TRUE, Boolean.FALSE)                = Boolean.FALSE
     *   BooleanUtils.and(Boolean.TRUE, Boolean.TRUE, Boolean.TRUE)   = Boolean.TRUE
     *   BooleanUtils.and(Boolean.FALSE, Boolean.FALSE, Boolean.TRUE) = Boolean.FALSE
     *   BooleanUtils.and(Boolean.TRUE, Boolean.FALSE, Boolean.TRUE)  = Boolean.FALSE
     * </pre>
     *
     * @param array  an array of {@code Boolean}s
     * @return {@code true} if the and is successful.
     * @throws IllegalArgumentException if {@code array} is {@code null}
     * @throws IllegalArgumentException if {@code array} is empty.
     * @throws IllegalArgumentException if {@code array} contains a {@code null}
     * @since 3.0.1
     */
    public static Boolean and(final Boolean... array) {try{__CLR4_5_22ys2yslvha78kh.R.inc(4159);
        __CLR4_5_22ys2yslvha78kh.R.inc(4160);if ((((array == null)&&(__CLR4_5_22ys2yslvha78kh.R.iget(4161)!=0|true))||(__CLR4_5_22ys2yslvha78kh.R.iget(4162)==0&false))) {{
            __CLR4_5_22ys2yslvha78kh.R.inc(4163);throw new IllegalArgumentException("The Array must not be null");
        }
        }__CLR4_5_22ys2yslvha78kh.R.inc(4164);if ((((array.length == 0)&&(__CLR4_5_22ys2yslvha78kh.R.iget(4165)!=0|true))||(__CLR4_5_22ys2yslvha78kh.R.iget(4166)==0&false))) {{
            __CLR4_5_22ys2yslvha78kh.R.inc(4167);throw new IllegalArgumentException("Array is empty");
        }
        }__CLR4_5_22ys2yslvha78kh.R.inc(4168);try {
            __CLR4_5_22ys2yslvha78kh.R.inc(4169);final boolean[] primitive = ArrayUtils.toPrimitive(array);
            __CLR4_5_22ys2yslvha78kh.R.inc(4170);return (((and(primitive) )&&(__CLR4_5_22ys2yslvha78kh.R.iget(4171)!=0|true))||(__CLR4_5_22ys2yslvha78kh.R.iget(4172)==0&false))? Boolean.TRUE : Boolean.FALSE;
        } catch (final NullPointerException ex) {
            __CLR4_5_22ys2yslvha78kh.R.inc(4173);throw new IllegalArgumentException("The array must not contain any null elements");
        }
    }finally{__CLR4_5_22ys2yslvha78kh.R.flushNeeded();}}

    /**
     * <p>Performs an or on a set of booleans.</p>
     *
     * <pre>
     *   BooleanUtils.or(true, true)          = true
     *   BooleanUtils.or(false, false)        = false
     *   BooleanUtils.or(true, false)         = true
     *   BooleanUtils.or(true, true, false)   = true
     *   BooleanUtils.or(true, true, true)    = true
     *   BooleanUtils.or(false, false, false) = false
     * </pre>
     *
     * @param array  an array of {@code boolean}s
     * @return {@code true} if the or is successful.
     * @throws IllegalArgumentException if {@code array} is {@code null}
     * @throws IllegalArgumentException if {@code array} is empty.
     * @since 3.0.1
     */
    public static boolean or(final boolean... array) {try{__CLR4_5_22ys2yslvha78kh.R.inc(4174);
        // Validates input
        __CLR4_5_22ys2yslvha78kh.R.inc(4175);if ((((array == null)&&(__CLR4_5_22ys2yslvha78kh.R.iget(4176)!=0|true))||(__CLR4_5_22ys2yslvha78kh.R.iget(4177)==0&false))) {{
            __CLR4_5_22ys2yslvha78kh.R.inc(4178);throw new IllegalArgumentException("The Array must not be null");
        }
        }__CLR4_5_22ys2yslvha78kh.R.inc(4179);if ((((array.length == 0)&&(__CLR4_5_22ys2yslvha78kh.R.iget(4180)!=0|true))||(__CLR4_5_22ys2yslvha78kh.R.iget(4181)==0&false))) {{
            __CLR4_5_22ys2yslvha78kh.R.inc(4182);throw new IllegalArgumentException("Array is empty");
        }
        }__CLR4_5_22ys2yslvha78kh.R.inc(4183);for (final boolean element : array) {{
            __CLR4_5_22ys2yslvha78kh.R.inc(4184);if ((((element)&&(__CLR4_5_22ys2yslvha78kh.R.iget(4185)!=0|true))||(__CLR4_5_22ys2yslvha78kh.R.iget(4186)==0&false))) {{
                __CLR4_5_22ys2yslvha78kh.R.inc(4187);return true;
            }
        }}
        }__CLR4_5_22ys2yslvha78kh.R.inc(4188);return false;
    }finally{__CLR4_5_22ys2yslvha78kh.R.flushNeeded();}}

    /**
     * <p>Performs an or on an array of Booleans.</p>
     *
     * <pre>
     *   BooleanUtils.or(Boolean.TRUE, Boolean.TRUE)                  = Boolean.TRUE
     *   BooleanUtils.or(Boolean.FALSE, Boolean.FALSE)                = Boolean.FALSE
     *   BooleanUtils.or(Boolean.TRUE, Boolean.FALSE)                 = Boolean.TRUE
     *   BooleanUtils.or(Boolean.TRUE, Boolean.TRUE, Boolean.TRUE)    = Boolean.TRUE
     *   BooleanUtils.or(Boolean.FALSE, Boolean.FALSE, Boolean.TRUE)  = Boolean.TRUE
     *   BooleanUtils.or(Boolean.TRUE, Boolean.FALSE, Boolean.TRUE)   = Boolean.TRUE
     *   BooleanUtils.or(Boolean.FALSE, Boolean.FALSE, Boolean.FALSE) = Boolean.FALSE
     * </pre>
     *
     * @param array  an array of {@code Boolean}s
     * @return {@code true} if the or is successful.
     * @throws IllegalArgumentException if {@code array} is {@code null}
     * @throws IllegalArgumentException if {@code array} is empty.
     * @throws IllegalArgumentException if {@code array} contains a {@code null}
     * @since 3.0.1
     */
    public static Boolean or(final Boolean... array) {try{__CLR4_5_22ys2yslvha78kh.R.inc(4189);
        __CLR4_5_22ys2yslvha78kh.R.inc(4190);if ((((array == null)&&(__CLR4_5_22ys2yslvha78kh.R.iget(4191)!=0|true))||(__CLR4_5_22ys2yslvha78kh.R.iget(4192)==0&false))) {{
            __CLR4_5_22ys2yslvha78kh.R.inc(4193);throw new IllegalArgumentException("The Array must not be null");
        }
        }__CLR4_5_22ys2yslvha78kh.R.inc(4194);if ((((array.length == 0)&&(__CLR4_5_22ys2yslvha78kh.R.iget(4195)!=0|true))||(__CLR4_5_22ys2yslvha78kh.R.iget(4196)==0&false))) {{
            __CLR4_5_22ys2yslvha78kh.R.inc(4197);throw new IllegalArgumentException("Array is empty");
        }
        }__CLR4_5_22ys2yslvha78kh.R.inc(4198);try {
            __CLR4_5_22ys2yslvha78kh.R.inc(4199);final boolean[] primitive = ArrayUtils.toPrimitive(array);
            __CLR4_5_22ys2yslvha78kh.R.inc(4200);return (((or(primitive) )&&(__CLR4_5_22ys2yslvha78kh.R.iget(4201)!=0|true))||(__CLR4_5_22ys2yslvha78kh.R.iget(4202)==0&false))? Boolean.TRUE : Boolean.FALSE;
        } catch (final NullPointerException ex) {
            __CLR4_5_22ys2yslvha78kh.R.inc(4203);throw new IllegalArgumentException("The array must not contain any null elements");
        }
    }finally{__CLR4_5_22ys2yslvha78kh.R.flushNeeded();}}

    /**
     * <p>Performs an xor on a set of booleans.</p>
     *
     * <pre>
     *   BooleanUtils.xor(true, true)   = false
     *   BooleanUtils.xor(false, false) = false
     *   BooleanUtils.xor(true, false)  = true
     * </pre>
     *
     * @param array  an array of {@code boolean}s
     * @return {@code true} if the xor is successful.
     * @throws IllegalArgumentException if {@code array} is {@code null}
     * @throws IllegalArgumentException if {@code array} is empty.
     */
    public static boolean xor(final boolean... array) {try{__CLR4_5_22ys2yslvha78kh.R.inc(4204);
        // Validates input
        __CLR4_5_22ys2yslvha78kh.R.inc(4205);if ((((array == null)&&(__CLR4_5_22ys2yslvha78kh.R.iget(4206)!=0|true))||(__CLR4_5_22ys2yslvha78kh.R.iget(4207)==0&false))) {{
            __CLR4_5_22ys2yslvha78kh.R.inc(4208);throw new IllegalArgumentException("The Array must not be null");
        }
        }__CLR4_5_22ys2yslvha78kh.R.inc(4209);if ((((array.length == 0)&&(__CLR4_5_22ys2yslvha78kh.R.iget(4210)!=0|true))||(__CLR4_5_22ys2yslvha78kh.R.iget(4211)==0&false))) {{
            __CLR4_5_22ys2yslvha78kh.R.inc(4212);throw new IllegalArgumentException("Array is empty");
        }

        // false if the neutral element of the xor operator
        }__CLR4_5_22ys2yslvha78kh.R.inc(4213);boolean result = false;
        __CLR4_5_22ys2yslvha78kh.R.inc(4214);for (final boolean element : array) {{
            __CLR4_5_22ys2yslvha78kh.R.inc(4215);result ^= element;
        }

        }__CLR4_5_22ys2yslvha78kh.R.inc(4216);return result;
    }finally{__CLR4_5_22ys2yslvha78kh.R.flushNeeded();}}

    /**
     * <p>Performs an xor on an array of Booleans.</p>
     *
     * <pre>
     *   BooleanUtils.xor(new Boolean[] { Boolean.TRUE, Boolean.TRUE })   = Boolean.FALSE
     *   BooleanUtils.xor(new Boolean[] { Boolean.FALSE, Boolean.FALSE }) = Boolean.FALSE
     *   BooleanUtils.xor(new Boolean[] { Boolean.TRUE, Boolean.FALSE })  = Boolean.TRUE
     * </pre>
     *
     * @param array  an array of {@code Boolean}s
     * @return {@code true} if the xor is successful.
     * @throws IllegalArgumentException if {@code array} is {@code null}
     * @throws IllegalArgumentException if {@code array} is empty.
     * @throws IllegalArgumentException if {@code array} contains a {@code null}
     */
    public static Boolean xor(final Boolean... array) {try{__CLR4_5_22ys2yslvha78kh.R.inc(4217);
        __CLR4_5_22ys2yslvha78kh.R.inc(4218);if ((((array == null)&&(__CLR4_5_22ys2yslvha78kh.R.iget(4219)!=0|true))||(__CLR4_5_22ys2yslvha78kh.R.iget(4220)==0&false))) {{
            __CLR4_5_22ys2yslvha78kh.R.inc(4221);throw new IllegalArgumentException("The Array must not be null");
        }
        }__CLR4_5_22ys2yslvha78kh.R.inc(4222);if ((((array.length == 0)&&(__CLR4_5_22ys2yslvha78kh.R.iget(4223)!=0|true))||(__CLR4_5_22ys2yslvha78kh.R.iget(4224)==0&false))) {{
            __CLR4_5_22ys2yslvha78kh.R.inc(4225);throw new IllegalArgumentException("Array is empty");
        }
        }__CLR4_5_22ys2yslvha78kh.R.inc(4226);try {
            __CLR4_5_22ys2yslvha78kh.R.inc(4227);final boolean[] primitive = ArrayUtils.toPrimitive(array);
            __CLR4_5_22ys2yslvha78kh.R.inc(4228);return (((xor(primitive) )&&(__CLR4_5_22ys2yslvha78kh.R.iget(4229)!=0|true))||(__CLR4_5_22ys2yslvha78kh.R.iget(4230)==0&false))? Boolean.TRUE : Boolean.FALSE;
        } catch (final NullPointerException ex) {
            __CLR4_5_22ys2yslvha78kh.R.inc(4231);throw new IllegalArgumentException("The array must not contain any null elements");
        }
    }finally{__CLR4_5_22ys2yslvha78kh.R.flushNeeded();}}

    /**
     * <p>Compares two {@code boolean} values. This is the same functionality as provided in Java 7.</p>
     *
     * @param x the first {@code boolean} to compare
     * @param y the second {@code boolean} to compare
     * @return the value {@code 0} if {@code x == y};
     *         a value less than {@code 0} if {@code !x && y}; and
     *         a value greater than {@code 0} if {@code x && !y}
     * @since 3.4
     */
    public static int compare(final boolean x, final boolean y) {try{__CLR4_5_22ys2yslvha78kh.R.inc(4232);
        __CLR4_5_22ys2yslvha78kh.R.inc(4233);if ((((x == y)&&(__CLR4_5_22ys2yslvha78kh.R.iget(4234)!=0|true))||(__CLR4_5_22ys2yslvha78kh.R.iget(4235)==0&false))) {{
            __CLR4_5_22ys2yslvha78kh.R.inc(4236);return 0;
        }
        }__CLR4_5_22ys2yslvha78kh.R.inc(4237);return (((x )&&(__CLR4_5_22ys2yslvha78kh.R.iget(4238)!=0|true))||(__CLR4_5_22ys2yslvha78kh.R.iget(4239)==0&false))? 1 : -1;
    }finally{__CLR4_5_22ys2yslvha78kh.R.flushNeeded();}}

}
