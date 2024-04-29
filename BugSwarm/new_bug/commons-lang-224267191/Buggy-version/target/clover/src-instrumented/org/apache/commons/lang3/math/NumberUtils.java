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
package org.apache.commons.lang3.math;

import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.math.BigInteger;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.SystemUtils;
import org.apache.commons.lang3.Validate;

/**
 * <p>Provides extra functionality for Java Number classes.</p>
 *
 * @since 2.0
 */
@java.lang.SuppressWarnings({"fallthrough"}) public class NumberUtils {public static class __CLR4_5_2bvgbvglvha7av1{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172755542L,8589935092L,16108,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    
    /** Reusable Long constant for zero. */
    public static final Long LONG_ZERO = Long.valueOf(0L);
    /** Reusable Long constant for one. */
    public static final Long LONG_ONE = Long.valueOf(1L);
    /** Reusable Long constant for minus one. */
    public static final Long LONG_MINUS_ONE = Long.valueOf(-1L);
    /** Reusable Integer constant for zero. */
    public static final Integer INTEGER_ZERO = Integer.valueOf(0);
    /** Reusable Integer constant for one. */
    public static final Integer INTEGER_ONE = Integer.valueOf(1);
    /** Reusable Integer constant for minus one. */
    public static final Integer INTEGER_MINUS_ONE = Integer.valueOf(-1);
    /** Reusable Short constant for zero. */
    public static final Short SHORT_ZERO = Short.valueOf((short) 0);
    /** Reusable Short constant for one. */
    public static final Short SHORT_ONE = Short.valueOf((short) 1);
    /** Reusable Short constant for minus one. */
    public static final Short SHORT_MINUS_ONE = Short.valueOf((short) -1);
    /** Reusable Byte constant for zero. */
    public static final Byte BYTE_ZERO = Byte.valueOf((byte) 0);
    /** Reusable Byte constant for one. */
    public static final Byte BYTE_ONE = Byte.valueOf((byte) 1);
    /** Reusable Byte constant for minus one. */
    public static final Byte BYTE_MINUS_ONE = Byte.valueOf((byte) -1);
    /** Reusable Double constant for zero. */
    public static final Double DOUBLE_ZERO = Double.valueOf(0.0d);
    /** Reusable Double constant for one. */
    public static final Double DOUBLE_ONE = Double.valueOf(1.0d);
    /** Reusable Double constant for minus one. */
    public static final Double DOUBLE_MINUS_ONE = Double.valueOf(-1.0d);
    /** Reusable Float constant for zero. */
    public static final Float FLOAT_ZERO = Float.valueOf(0.0f);
    /** Reusable Float constant for one. */
    public static final Float FLOAT_ONE = Float.valueOf(1.0f);
    /** Reusable Float constant for minus one. */
    public static final Float FLOAT_MINUS_ONE = Float.valueOf(-1.0f);

    /**
     * <p><code>NumberUtils</code> instances should NOT be constructed in standard programming.
     * Instead, the class should be used as <code>NumberUtils.toInt("6");</code>.</p>
     *
     * <p>This constructor is public to permit tools that require a JavaBean instance
     * to operate.</p>
     */
    public NumberUtils() {
        super();__CLR4_5_2bvgbvglvha7av1.R.inc(15389);try{__CLR4_5_2bvgbvglvha7av1.R.inc(15388);
    }finally{__CLR4_5_2bvgbvglvha7av1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * <p>Convert a <code>String</code> to an <code>int</code>, returning
     * <code>zero</code> if the conversion fails.</p>
     *
     * <p>If the string is <code>null</code>, <code>zero</code> is returned.</p>
     *
     * <pre>
     *   NumberUtils.toInt(null) = 0
     *   NumberUtils.toInt("")   = 0
     *   NumberUtils.toInt("1")  = 1
     * </pre>
     *
     * @param str  the string to convert, may be null
     * @return the int represented by the string, or <code>zero</code> if
     *  conversion fails
     * @since 2.1
     */
    public static int toInt(final String str) {try{__CLR4_5_2bvgbvglvha7av1.R.inc(15390);
        __CLR4_5_2bvgbvglvha7av1.R.inc(15391);return toInt(str, 0);
    }finally{__CLR4_5_2bvgbvglvha7av1.R.flushNeeded();}}

    /**
     * <p>Convert a <code>String</code> to an <code>int</code>, returning a
     * default value if the conversion fails.</p>
     *
     * <p>If the string is <code>null</code>, the default value is returned.</p>
     *
     * <pre>
     *   NumberUtils.toInt(null, 1) = 1
     *   NumberUtils.toInt("", 1)   = 1
     *   NumberUtils.toInt("1", 0)  = 1
     * </pre>
     *
     * @param str  the string to convert, may be null
     * @param defaultValue  the default value
     * @return the int represented by the string, or the default if conversion fails
     * @since 2.1
     */
    public static int toInt(final String str, final int defaultValue) {try{__CLR4_5_2bvgbvglvha7av1.R.inc(15392);
        __CLR4_5_2bvgbvglvha7av1.R.inc(15393);if((((str == null)&&(__CLR4_5_2bvgbvglvha7av1.R.iget(15394)!=0|true))||(__CLR4_5_2bvgbvglvha7av1.R.iget(15395)==0&false))) {{
            __CLR4_5_2bvgbvglvha7av1.R.inc(15396);return defaultValue;
        }
        }__CLR4_5_2bvgbvglvha7av1.R.inc(15397);try {
            __CLR4_5_2bvgbvglvha7av1.R.inc(15398);return Integer.parseInt(str);
        } catch (final NumberFormatException nfe) {
            __CLR4_5_2bvgbvglvha7av1.R.inc(15399);return defaultValue;
        }
    }finally{__CLR4_5_2bvgbvglvha7av1.R.flushNeeded();}}

    /**
     * <p>Convert a <code>String</code> to a <code>long</code>, returning
     * <code>zero</code> if the conversion fails.</p>
     *
     * <p>If the string is <code>null</code>, <code>zero</code> is returned.</p>
     *
     * <pre>
     *   NumberUtils.toLong(null) = 0L
     *   NumberUtils.toLong("")   = 0L
     *   NumberUtils.toLong("1")  = 1L
     * </pre>
     *
     * @param str  the string to convert, may be null
     * @return the long represented by the string, or <code>0</code> if
     *  conversion fails
     * @since 2.1
     */
    public static long toLong(final String str) {try{__CLR4_5_2bvgbvglvha7av1.R.inc(15400);
        __CLR4_5_2bvgbvglvha7av1.R.inc(15401);return toLong(str, 0L);
    }finally{__CLR4_5_2bvgbvglvha7av1.R.flushNeeded();}}

    /**
     * <p>Convert a <code>String</code> to a <code>long</code>, returning a
     * default value if the conversion fails.</p>
     *
     * <p>If the string is <code>null</code>, the default value is returned.</p>
     *
     * <pre>
     *   NumberUtils.toLong(null, 1L) = 1L
     *   NumberUtils.toLong("", 1L)   = 1L
     *   NumberUtils.toLong("1", 0L)  = 1L
     * </pre>
     *
     * @param str  the string to convert, may be null
     * @param defaultValue  the default value
     * @return the long represented by the string, or the default if conversion fails
     * @since 2.1
     */
    public static long toLong(final String str, final long defaultValue) {try{__CLR4_5_2bvgbvglvha7av1.R.inc(15402);
        __CLR4_5_2bvgbvglvha7av1.R.inc(15403);if ((((str == null)&&(__CLR4_5_2bvgbvglvha7av1.R.iget(15404)!=0|true))||(__CLR4_5_2bvgbvglvha7av1.R.iget(15405)==0&false))) {{
            __CLR4_5_2bvgbvglvha7av1.R.inc(15406);return defaultValue;
        }
        }__CLR4_5_2bvgbvglvha7av1.R.inc(15407);try {
            __CLR4_5_2bvgbvglvha7av1.R.inc(15408);return Long.parseLong(str);
        } catch (final NumberFormatException nfe) {
            __CLR4_5_2bvgbvglvha7av1.R.inc(15409);return defaultValue;
        }
    }finally{__CLR4_5_2bvgbvglvha7av1.R.flushNeeded();}}

    /**
     * <p>Convert a <code>String</code> to a <code>float</code>, returning
     * <code>0.0f</code> if the conversion fails.</p>
     *
     * <p>If the string <code>str</code> is <code>null</code>,
     * <code>0.0f</code> is returned.</p>
     *
     * <pre>
     *   NumberUtils.toFloat(null)   = 0.0f
     *   NumberUtils.toFloat("")     = 0.0f
     *   NumberUtils.toFloat("1.5")  = 1.5f
     * </pre>
     *
     * @param str the string to convert, may be <code>null</code>
     * @return the float represented by the string, or <code>0.0f</code>
     *  if conversion fails
     * @since 2.1
     */
    public static float toFloat(final String str) {try{__CLR4_5_2bvgbvglvha7av1.R.inc(15410);
        __CLR4_5_2bvgbvglvha7av1.R.inc(15411);return toFloat(str, 0.0f);
    }finally{__CLR4_5_2bvgbvglvha7av1.R.flushNeeded();}}

    /**
     * <p>Convert a <code>String</code> to a <code>float</code>, returning a
     * default value if the conversion fails.</p>
     *
     * <p>If the string <code>str</code> is <code>null</code>, the default
     * value is returned.</p>
     *
     * <pre>
     *   NumberUtils.toFloat(null, 1.1f)   = 1.0f
     *   NumberUtils.toFloat("", 1.1f)     = 1.1f
     *   NumberUtils.toFloat("1.5", 0.0f)  = 1.5f
     * </pre>
     *
     * @param str the string to convert, may be <code>null</code>
     * @param defaultValue the default value
     * @return the float represented by the string, or defaultValue
     *  if conversion fails
     * @since 2.1
     */
    public static float toFloat(final String str, final float defaultValue) {try{__CLR4_5_2bvgbvglvha7av1.R.inc(15412);
      __CLR4_5_2bvgbvglvha7av1.R.inc(15413);if ((((str == null)&&(__CLR4_5_2bvgbvglvha7av1.R.iget(15414)!=0|true))||(__CLR4_5_2bvgbvglvha7av1.R.iget(15415)==0&false))) {{
          __CLR4_5_2bvgbvglvha7av1.R.inc(15416);return defaultValue;
      }     
      }__CLR4_5_2bvgbvglvha7av1.R.inc(15417);try {
          __CLR4_5_2bvgbvglvha7av1.R.inc(15418);return Float.parseFloat(str);
      } catch (final NumberFormatException nfe) {
          __CLR4_5_2bvgbvglvha7av1.R.inc(15419);return defaultValue;
      }
    }finally{__CLR4_5_2bvgbvglvha7av1.R.flushNeeded();}}

    /**
     * <p>Convert a <code>String</code> to a <code>double</code>, returning
     * <code>0.0d</code> if the conversion fails.</p>
     *
     * <p>If the string <code>str</code> is <code>null</code>,
     * <code>0.0d</code> is returned.</p>
     *
     * <pre>
     *   NumberUtils.toDouble(null)   = 0.0d
     *   NumberUtils.toDouble("")     = 0.0d
     *   NumberUtils.toDouble("1.5")  = 1.5d
     * </pre>
     *
     * @param str the string to convert, may be <code>null</code>
     * @return the double represented by the string, or <code>0.0d</code>
     *  if conversion fails
     * @since 2.1
     */
    public static double toDouble(final String str) {try{__CLR4_5_2bvgbvglvha7av1.R.inc(15420);
        __CLR4_5_2bvgbvglvha7av1.R.inc(15421);return toDouble(str, 0.0d);
    }finally{__CLR4_5_2bvgbvglvha7av1.R.flushNeeded();}}

    /**
     * <p>Convert a <code>String</code> to a <code>double</code>, returning a
     * default value if the conversion fails.</p>
     *
     * <p>If the string <code>str</code> is <code>null</code>, the default
     * value is returned.</p>
     *
     * <pre>
     *   NumberUtils.toDouble(null, 1.1d)   = 1.1d
     *   NumberUtils.toDouble("", 1.1d)     = 1.1d
     *   NumberUtils.toDouble("1.5", 0.0d)  = 1.5d
     * </pre>
     *
     * @param str the string to convert, may be <code>null</code>
     * @param defaultValue the default value
     * @return the double represented by the string, or defaultValue
     *  if conversion fails
     * @since 2.1
     */
    public static double toDouble(final String str, final double defaultValue) {try{__CLR4_5_2bvgbvglvha7av1.R.inc(15422);
      __CLR4_5_2bvgbvglvha7av1.R.inc(15423);if ((((str == null)&&(__CLR4_5_2bvgbvglvha7av1.R.iget(15424)!=0|true))||(__CLR4_5_2bvgbvglvha7av1.R.iget(15425)==0&false))) {{
          __CLR4_5_2bvgbvglvha7av1.R.inc(15426);return defaultValue;
      }
      }__CLR4_5_2bvgbvglvha7av1.R.inc(15427);try {
          __CLR4_5_2bvgbvglvha7av1.R.inc(15428);return Double.parseDouble(str);
      } catch (final NumberFormatException nfe) {
          __CLR4_5_2bvgbvglvha7av1.R.inc(15429);return defaultValue;
      }
    }finally{__CLR4_5_2bvgbvglvha7av1.R.flushNeeded();}}

     //-----------------------------------------------------------------------
     /**
     * <p>Convert a <code>String</code> to a <code>byte</code>, returning
     * <code>zero</code> if the conversion fails.</p>
     *
     * <p>If the string is <code>null</code>, <code>zero</code> is returned.</p>
     *
     * <pre>
     *   NumberUtils.toByte(null) = 0
     *   NumberUtils.toByte("")   = 0
     *   NumberUtils.toByte("1")  = 1
     * </pre>
     *
     * @param str  the string to convert, may be null
     * @return the byte represented by the string, or <code>zero</code> if
     *  conversion fails
     * @since 2.5
     */
    public static byte toByte(final String str) {try{__CLR4_5_2bvgbvglvha7av1.R.inc(15430);
        __CLR4_5_2bvgbvglvha7av1.R.inc(15431);return toByte(str, (byte) 0);
    }finally{__CLR4_5_2bvgbvglvha7av1.R.flushNeeded();}}

    /**
     * <p>Convert a <code>String</code> to a <code>byte</code>, returning a
     * default value if the conversion fails.</p>
     *
     * <p>If the string is <code>null</code>, the default value is returned.</p>
     *
     * <pre>
     *   NumberUtils.toByte(null, 1) = 1
     *   NumberUtils.toByte("", 1)   = 1
     *   NumberUtils.toByte("1", 0)  = 1
     * </pre>
     *
     * @param str  the string to convert, may be null
     * @param defaultValue  the default value
     * @return the byte represented by the string, or the default if conversion fails
     * @since 2.5
     */
    public static byte toByte(final String str, final byte defaultValue) {try{__CLR4_5_2bvgbvglvha7av1.R.inc(15432);
        __CLR4_5_2bvgbvglvha7av1.R.inc(15433);if((((str == null)&&(__CLR4_5_2bvgbvglvha7av1.R.iget(15434)!=0|true))||(__CLR4_5_2bvgbvglvha7av1.R.iget(15435)==0&false))) {{
            __CLR4_5_2bvgbvglvha7av1.R.inc(15436);return defaultValue;
        }
        }__CLR4_5_2bvgbvglvha7av1.R.inc(15437);try {
            __CLR4_5_2bvgbvglvha7av1.R.inc(15438);return Byte.parseByte(str);
        } catch (final NumberFormatException nfe) {
            __CLR4_5_2bvgbvglvha7av1.R.inc(15439);return defaultValue;
        }
    }finally{__CLR4_5_2bvgbvglvha7av1.R.flushNeeded();}}

    /**
     * <p>Convert a <code>String</code> to a <code>short</code>, returning
     * <code>zero</code> if the conversion fails.</p>
     *
     * <p>If the string is <code>null</code>, <code>zero</code> is returned.</p>
     *
     * <pre>
     *   NumberUtils.toShort(null) = 0
     *   NumberUtils.toShort("")   = 0
     *   NumberUtils.toShort("1")  = 1
     * </pre>
     *
     * @param str  the string to convert, may be null
     * @return the short represented by the string, or <code>zero</code> if
     *  conversion fails
     * @since 2.5
     */
    public static short toShort(final String str) {try{__CLR4_5_2bvgbvglvha7av1.R.inc(15440);
        __CLR4_5_2bvgbvglvha7av1.R.inc(15441);return toShort(str, (short) 0);
    }finally{__CLR4_5_2bvgbvglvha7av1.R.flushNeeded();}}

    /**
     * <p>Convert a <code>String</code> to an <code>short</code>, returning a
     * default value if the conversion fails.</p>
     *
     * <p>If the string is <code>null</code>, the default value is returned.</p>
     *
     * <pre>
     *   NumberUtils.toShort(null, 1) = 1
     *   NumberUtils.toShort("", 1)   = 1
     *   NumberUtils.toShort("1", 0)  = 1
     * </pre>
     *
     * @param str  the string to convert, may be null
     * @param defaultValue  the default value
     * @return the short represented by the string, or the default if conversion fails
     * @since 2.5
     */
    public static short toShort(final String str, final short defaultValue) {try{__CLR4_5_2bvgbvglvha7av1.R.inc(15442);
        __CLR4_5_2bvgbvglvha7av1.R.inc(15443);if((((str == null)&&(__CLR4_5_2bvgbvglvha7av1.R.iget(15444)!=0|true))||(__CLR4_5_2bvgbvglvha7av1.R.iget(15445)==0&false))) {{
            __CLR4_5_2bvgbvglvha7av1.R.inc(15446);return defaultValue;
        }
        }__CLR4_5_2bvgbvglvha7av1.R.inc(15447);try {
            __CLR4_5_2bvgbvglvha7av1.R.inc(15448);return Short.parseShort(str);
        } catch (final NumberFormatException nfe) {
            __CLR4_5_2bvgbvglvha7av1.R.inc(15449);return defaultValue;
        }
    }finally{__CLR4_5_2bvgbvglvha7av1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    // must handle Long, Float, Integer, Float, Short,
    //                  BigDecimal, BigInteger and Byte
    // useful methods:
    // Byte.decode(String)
    // Byte.valueOf(String,int radix)
    // Byte.valueOf(String)
    // Double.valueOf(String)
    // Float.valueOf(String)
    // Float.valueOf(String)
    // Integer.valueOf(String,int radix)
    // Integer.valueOf(String)
    // Integer.decode(String)
    // Integer.getInteger(String)
    // Integer.getInteger(String,int val)
    // Integer.getInteger(String,Integer val)
    // Integer.valueOf(String)
    // Double.valueOf(String)
    // new Byte(String)
    // Long.valueOf(String)
    // Long.getLong(String)
    // Long.getLong(String,int)
    // Long.getLong(String,Integer)
    // Long.valueOf(String,int)
    // Long.valueOf(String)
    // Short.valueOf(String)
    // Short.decode(String)
    // Short.valueOf(String,int)
    // Short.valueOf(String)
    // new BigDecimal(String)
    // new BigInteger(String)
    // new BigInteger(String,int radix)
    // Possible inputs:
    // 45 45.5 45E7 4.5E7 Hex Oct Binary xxxF xxxD xxxf xxxd
    // plus minus everything. Prolly more. A lot are not separable.

    /**
     * <p>Turns a string value into a java.lang.Number.</p>
     *
     * <p>If the string starts with {@code 0x} or {@code -0x} (lower or upper case) or {@code #} or {@code -#}, it
     * will be interpreted as a hexadecimal Integer - or Long, if the number of digits after the
     * prefix is more than 8 - or BigInteger if there are more than 16 digits.
     * </p>
     * <p>Then, the value is examined for a type qualifier on the end, i.e. one of
     * <code>'f','F','d','D','l','L'</code>.  If it is found, it starts 
     * trying to create successively larger types from the type specified
     * until one is found that can represent the value.</p>
     *
     * <p>If a type specifier is not found, it will check for a decimal point
     * and then try successively larger types from <code>Integer</code> to
     * <code>BigInteger</code> and from <code>Float</code> to
    * <code>BigDecimal</code>.</p>
    * 
     * <p>
     * Integral values with a leading {@code 0} will be interpreted as octal; the returned number will
     * be Integer, Long or BigDecimal as appropriate.
     * </p>
     *
     * <p>Returns <code>null</code> if the string is <code>null</code>.</p>
     *
     * <p>This method does not trim the input string, i.e., strings with leading
     * or trailing spaces will generate NumberFormatExceptions.</p>
     *
     * @param str  String containing a number, may be null
     * @return Number created from the string (or null if the input is null)
     * @throws NumberFormatException if the value cannot be converted
     */
    public static Number createNumber(final String str) throws NumberFormatException {try{__CLR4_5_2bvgbvglvha7av1.R.inc(15450);
        __CLR4_5_2bvgbvglvha7av1.R.inc(15451);if ((((str == null)&&(__CLR4_5_2bvgbvglvha7av1.R.iget(15452)!=0|true))||(__CLR4_5_2bvgbvglvha7av1.R.iget(15453)==0&false))) {{
            __CLR4_5_2bvgbvglvha7av1.R.inc(15454);return null;
        }
        }__CLR4_5_2bvgbvglvha7av1.R.inc(15455);if ((((StringUtils.isBlank(str))&&(__CLR4_5_2bvgbvglvha7av1.R.iget(15456)!=0|true))||(__CLR4_5_2bvgbvglvha7av1.R.iget(15457)==0&false))) {{
            __CLR4_5_2bvgbvglvha7av1.R.inc(15458);throw new NumberFormatException("A blank string is not a valid number");
        }
        // Need to deal with all possible hex prefixes here
        }__CLR4_5_2bvgbvglvha7av1.R.inc(15459);final String[] hex_prefixes = {"0x", "0X", "-0x", "-0X", "#", "-#"};
        __CLR4_5_2bvgbvglvha7av1.R.inc(15460);int pfxLen = 0;
        __CLR4_5_2bvgbvglvha7av1.R.inc(15461);for(final String pfx : hex_prefixes) {{
            __CLR4_5_2bvgbvglvha7av1.R.inc(15462);if ((((str.startsWith(pfx))&&(__CLR4_5_2bvgbvglvha7av1.R.iget(15463)!=0|true))||(__CLR4_5_2bvgbvglvha7av1.R.iget(15464)==0&false))) {{
                __CLR4_5_2bvgbvglvha7av1.R.inc(15465);pfxLen += pfx.length();
                __CLR4_5_2bvgbvglvha7av1.R.inc(15466);break;
            }
        }}
        }__CLR4_5_2bvgbvglvha7av1.R.inc(15467);if ((((pfxLen > 0)&&(__CLR4_5_2bvgbvglvha7av1.R.iget(15468)!=0|true))||(__CLR4_5_2bvgbvglvha7av1.R.iget(15469)==0&false))) {{ // we have a hex number
            __CLR4_5_2bvgbvglvha7av1.R.inc(15470);char firstSigDigit = 0; // strip leading zeroes
            __CLR4_5_2bvgbvglvha7av1.R.inc(15471);for(int i = pfxLen; (((i < str.length())&&(__CLR4_5_2bvgbvglvha7av1.R.iget(15472)!=0|true))||(__CLR4_5_2bvgbvglvha7av1.R.iget(15473)==0&false)); i++) {{
                __CLR4_5_2bvgbvglvha7av1.R.inc(15474);firstSigDigit = str.charAt(i);
                __CLR4_5_2bvgbvglvha7av1.R.inc(15475);if ((((firstSigDigit == '0')&&(__CLR4_5_2bvgbvglvha7av1.R.iget(15476)!=0|true))||(__CLR4_5_2bvgbvglvha7av1.R.iget(15477)==0&false))) {{ // count leading zeroes
                    __CLR4_5_2bvgbvglvha7av1.R.inc(15478);pfxLen++;
                } }else {{
                    __CLR4_5_2bvgbvglvha7av1.R.inc(15479);break;
                }
            }}
            }__CLR4_5_2bvgbvglvha7av1.R.inc(15480);final int hexDigits = str.length() - pfxLen;
            __CLR4_5_2bvgbvglvha7av1.R.inc(15481);if ((((hexDigits > 16 || hexDigits == 16 && firstSigDigit > '7')&&(__CLR4_5_2bvgbvglvha7av1.R.iget(15482)!=0|true))||(__CLR4_5_2bvgbvglvha7av1.R.iget(15483)==0&false))) {{ // too many for Long
                __CLR4_5_2bvgbvglvha7av1.R.inc(15484);return createBigInteger(str);
            }
            }__CLR4_5_2bvgbvglvha7av1.R.inc(15485);if ((((hexDigits > 8 || hexDigits == 8 && firstSigDigit > '7')&&(__CLR4_5_2bvgbvglvha7av1.R.iget(15486)!=0|true))||(__CLR4_5_2bvgbvglvha7av1.R.iget(15487)==0&false))) {{ // too many for an int
                __CLR4_5_2bvgbvglvha7av1.R.inc(15488);return createLong(str);
            }
            }__CLR4_5_2bvgbvglvha7av1.R.inc(15489);return createInteger(str);
        }
        }__CLR4_5_2bvgbvglvha7av1.R.inc(15490);final char lastChar = str.charAt(str.length() - 1);
        __CLR4_5_2bvgbvglvha7av1.R.inc(15491);String mant;
        __CLR4_5_2bvgbvglvha7av1.R.inc(15492);String dec;
        __CLR4_5_2bvgbvglvha7av1.R.inc(15493);String exp;
        __CLR4_5_2bvgbvglvha7av1.R.inc(15494);final int decPos = str.indexOf('.');
        __CLR4_5_2bvgbvglvha7av1.R.inc(15495);final int expPos = str.indexOf('e') + str.indexOf('E') + 1; // assumes both not present
        // if both e and E are present, this is caught by the checks on expPos (which prevent IOOBE)
        // and the parsing which will detect if e or E appear in a number due to using the wrong offset

        __CLR4_5_2bvgbvglvha7av1.R.inc(15496);if ((((decPos > -1)&&(__CLR4_5_2bvgbvglvha7av1.R.iget(15497)!=0|true))||(__CLR4_5_2bvgbvglvha7av1.R.iget(15498)==0&false))) {{ // there is a decimal point
            __CLR4_5_2bvgbvglvha7av1.R.inc(15499);if ((((expPos > -1)&&(__CLR4_5_2bvgbvglvha7av1.R.iget(15500)!=0|true))||(__CLR4_5_2bvgbvglvha7av1.R.iget(15501)==0&false))) {{ // there is an exponent
                __CLR4_5_2bvgbvglvha7av1.R.inc(15502);if ((((expPos < decPos || expPos > str.length())&&(__CLR4_5_2bvgbvglvha7av1.R.iget(15503)!=0|true))||(__CLR4_5_2bvgbvglvha7av1.R.iget(15504)==0&false))) {{ // prevents double exponent causing IOOBE
                    __CLR4_5_2bvgbvglvha7av1.R.inc(15505);throw new NumberFormatException(str + " is not a valid number.");
                }
                }__CLR4_5_2bvgbvglvha7av1.R.inc(15506);dec = str.substring(decPos + 1, expPos);
            } }else {{
                __CLR4_5_2bvgbvglvha7av1.R.inc(15507);dec = str.substring(decPos + 1);
            }
            }__CLR4_5_2bvgbvglvha7av1.R.inc(15508);mant = getMantissa(str, decPos);
        } }else {{
            __CLR4_5_2bvgbvglvha7av1.R.inc(15509);if ((((expPos > -1)&&(__CLR4_5_2bvgbvglvha7av1.R.iget(15510)!=0|true))||(__CLR4_5_2bvgbvglvha7av1.R.iget(15511)==0&false))) {{
                __CLR4_5_2bvgbvglvha7av1.R.inc(15512);if ((((expPos > str.length())&&(__CLR4_5_2bvgbvglvha7av1.R.iget(15513)!=0|true))||(__CLR4_5_2bvgbvglvha7av1.R.iget(15514)==0&false))) {{ // prevents double exponent causing IOOBE
                    __CLR4_5_2bvgbvglvha7av1.R.inc(15515);throw new NumberFormatException(str + " is not a valid number.");
                }
                }__CLR4_5_2bvgbvglvha7av1.R.inc(15516);mant = getMantissa(str, expPos);
            } }else {{
                __CLR4_5_2bvgbvglvha7av1.R.inc(15517);mant = getMantissa(str);
            }
            }__CLR4_5_2bvgbvglvha7av1.R.inc(15518);dec = null;
        }
        }__CLR4_5_2bvgbvglvha7av1.R.inc(15519);if ((((!Character.isDigit(lastChar) && lastChar != '.')&&(__CLR4_5_2bvgbvglvha7av1.R.iget(15520)!=0|true))||(__CLR4_5_2bvgbvglvha7av1.R.iget(15521)==0&false))) {{
            __CLR4_5_2bvgbvglvha7av1.R.inc(15522);if ((((expPos > -1 && expPos < str.length() - 1)&&(__CLR4_5_2bvgbvglvha7av1.R.iget(15523)!=0|true))||(__CLR4_5_2bvgbvglvha7av1.R.iget(15524)==0&false))) {{
                __CLR4_5_2bvgbvglvha7av1.R.inc(15525);exp = str.substring(expPos + 1, str.length() - 1);
            } }else {{
                __CLR4_5_2bvgbvglvha7av1.R.inc(15526);exp = null;
            }
            //Requesting a specific type..
            }__CLR4_5_2bvgbvglvha7av1.R.inc(15527);final String numeric = str.substring(0, str.length() - 1);
            __CLR4_5_2bvgbvglvha7av1.R.inc(15528);final boolean allZeros = isAllZeros(mant) && isAllZeros(exp);
            boolean __CLB4_5_2_bool0=false;__CLR4_5_2bvgbvglvha7av1.R.inc(15529);switch (lastChar) {
                case 'l' :if (!__CLB4_5_2_bool0) {__CLR4_5_2bvgbvglvha7av1.R.inc(15530);__CLB4_5_2_bool0=true;}
                case 'L' :if (!__CLB4_5_2_bool0) {__CLR4_5_2bvgbvglvha7av1.R.inc(15531);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2bvgbvglvha7av1.R.inc(15532);if ((((dec == null
                        && exp == null
                        && (numeric.charAt(0) == '-' && isDigits(numeric.substring(1)) || isDigits(numeric)))&&(__CLR4_5_2bvgbvglvha7av1.R.iget(15533)!=0|true))||(__CLR4_5_2bvgbvglvha7av1.R.iget(15534)==0&false))) {{
                        __CLR4_5_2bvgbvglvha7av1.R.inc(15535);try {
                            __CLR4_5_2bvgbvglvha7av1.R.inc(15536);return createLong(numeric);
                        } catch (final NumberFormatException nfe) { // NOPMD
                            // Too big for a long
                        }
                        __CLR4_5_2bvgbvglvha7av1.R.inc(15537);return createBigInteger(numeric);

                    }
                    }__CLR4_5_2bvgbvglvha7av1.R.inc(15538);throw new NumberFormatException(str + " is not a valid number.");
                case 'f' :if (!__CLB4_5_2_bool0) {__CLR4_5_2bvgbvglvha7av1.R.inc(15539);__CLB4_5_2_bool0=true;}
                case 'F' :if (!__CLB4_5_2_bool0) {__CLR4_5_2bvgbvglvha7av1.R.inc(15540);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2bvgbvglvha7av1.R.inc(15541);try {
                        __CLR4_5_2bvgbvglvha7av1.R.inc(15542);final Float f = NumberUtils.createFloat(str);
                        __CLR4_5_2bvgbvglvha7av1.R.inc(15543);if ((((!(f.isInfinite() || f.floatValue() == 0.0F && !allZeros))&&(__CLR4_5_2bvgbvglvha7av1.R.iget(15544)!=0|true))||(__CLR4_5_2bvgbvglvha7av1.R.iget(15545)==0&false))) {{
                            //If it's too big for a float or the float value = 0 and the string
                            //has non-zeros in it, then float does not have the precision we want
                            __CLR4_5_2bvgbvglvha7av1.R.inc(15546);return f;
                        }

                    }} catch (final NumberFormatException nfe) { // NOPMD
                        // ignore the bad number
                    }
                    //$FALL-THROUGH$
                case 'd' :if (!__CLB4_5_2_bool0) {__CLR4_5_2bvgbvglvha7av1.R.inc(15547);__CLB4_5_2_bool0=true;}
                case 'D' :if (!__CLB4_5_2_bool0) {__CLR4_5_2bvgbvglvha7av1.R.inc(15548);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2bvgbvglvha7av1.R.inc(15549);try {
                        __CLR4_5_2bvgbvglvha7av1.R.inc(15550);final Double d = NumberUtils.createDouble(str);
                        __CLR4_5_2bvgbvglvha7av1.R.inc(15551);if ((((!(d.isInfinite() || d.floatValue() == 0.0D && !allZeros))&&(__CLR4_5_2bvgbvglvha7av1.R.iget(15552)!=0|true))||(__CLR4_5_2bvgbvglvha7av1.R.iget(15553)==0&false))) {{
                            __CLR4_5_2bvgbvglvha7av1.R.inc(15554);return d;
                        }
                    }} catch (final NumberFormatException nfe) { // NOPMD
                        // ignore the bad number
                    }
                    __CLR4_5_2bvgbvglvha7av1.R.inc(15555);try {
                        __CLR4_5_2bvgbvglvha7av1.R.inc(15556);return createBigDecimal(numeric);
                    } catch (final NumberFormatException e) { // NOPMD
                        // ignore the bad number
                    }
                    //$FALL-THROUGH$
                default :if (!__CLB4_5_2_bool0) {__CLR4_5_2bvgbvglvha7av1.R.inc(15557);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2bvgbvglvha7av1.R.inc(15558);throw new NumberFormatException(str + " is not a valid number.");

            }
        }
        //User doesn't have a preference on the return type, so let's start
        //small and go from there...
        }__CLR4_5_2bvgbvglvha7av1.R.inc(15559);if ((((expPos > -1 && expPos < str.length() - 1)&&(__CLR4_5_2bvgbvglvha7av1.R.iget(15560)!=0|true))||(__CLR4_5_2bvgbvglvha7av1.R.iget(15561)==0&false))) {{
            __CLR4_5_2bvgbvglvha7av1.R.inc(15562);exp = str.substring(expPos + 1, str.length());
        } }else {{
            __CLR4_5_2bvgbvglvha7av1.R.inc(15563);exp = null;
        }
        }__CLR4_5_2bvgbvglvha7av1.R.inc(15564);if ((((dec == null && exp == null)&&(__CLR4_5_2bvgbvglvha7av1.R.iget(15565)!=0|true))||(__CLR4_5_2bvgbvglvha7av1.R.iget(15566)==0&false))) {{ // no decimal point and no exponent
            //Must be an Integer, Long, Biginteger
            __CLR4_5_2bvgbvglvha7av1.R.inc(15567);try {
                __CLR4_5_2bvgbvglvha7av1.R.inc(15568);return createInteger(str);
            } catch (final NumberFormatException nfe) { // NOPMD
                // ignore the bad number
            }
            __CLR4_5_2bvgbvglvha7av1.R.inc(15569);try {
                __CLR4_5_2bvgbvglvha7av1.R.inc(15570);return createLong(str);
            } catch (final NumberFormatException nfe) { // NOPMD
                // ignore the bad number
            }
            __CLR4_5_2bvgbvglvha7av1.R.inc(15571);return createBigInteger(str);
        }

        //Must be a Float, Double, BigDecimal
        }__CLR4_5_2bvgbvglvha7av1.R.inc(15572);final boolean allZeros = isAllZeros(mant) && isAllZeros(exp);
        __CLR4_5_2bvgbvglvha7av1.R.inc(15573);try {
            __CLR4_5_2bvgbvglvha7av1.R.inc(15574);final Float f = createFloat(str);
            __CLR4_5_2bvgbvglvha7av1.R.inc(15575);final Double d = createDouble(str);
            __CLR4_5_2bvgbvglvha7av1.R.inc(15576);if ((((!f.isInfinite()
                    && !(f.floatValue() == 0.0F && !allZeros)
                    && f.toString().equals(d.toString()))&&(__CLR4_5_2bvgbvglvha7av1.R.iget(15577)!=0|true))||(__CLR4_5_2bvgbvglvha7av1.R.iget(15578)==0&false))) {{
                __CLR4_5_2bvgbvglvha7av1.R.inc(15579);return f;
            }
            }__CLR4_5_2bvgbvglvha7av1.R.inc(15580);if ((((!d.isInfinite() && !(d.doubleValue() == 0.0D && !allZeros))&&(__CLR4_5_2bvgbvglvha7av1.R.iget(15581)!=0|true))||(__CLR4_5_2bvgbvglvha7av1.R.iget(15582)==0&false))) {{
                __CLR4_5_2bvgbvglvha7av1.R.inc(15583);final BigDecimal b = createBigDecimal(str);
                __CLR4_5_2bvgbvglvha7av1.R.inc(15584);if ((((b.compareTo(BigDecimal.valueOf(d.doubleValue())) == 0)&&(__CLR4_5_2bvgbvglvha7av1.R.iget(15585)!=0|true))||(__CLR4_5_2bvgbvglvha7av1.R.iget(15586)==0&false))) {{
                    __CLR4_5_2bvgbvglvha7av1.R.inc(15587);return d;
                }
                }__CLR4_5_2bvgbvglvha7av1.R.inc(15588);return b;
            }
        }} catch (final NumberFormatException nfe) { // NOPMD
            // ignore the bad number
        }
        __CLR4_5_2bvgbvglvha7av1.R.inc(15589);return createBigDecimal(str);
    }finally{__CLR4_5_2bvgbvglvha7av1.R.flushNeeded();}}

    /**
     * <p>Utility method for {@link #createNumber(java.lang.String)}.</p>
     *
     * <p>Returns mantissa of the given number.</p>
     * 
     * @param str the string representation of the number
     * @return mantissa of the given number
     */
    private static String getMantissa(final String str) {try{__CLR4_5_2bvgbvglvha7av1.R.inc(15590);
        __CLR4_5_2bvgbvglvha7av1.R.inc(15591);return getMantissa(str, str.length());
    }finally{__CLR4_5_2bvgbvglvha7av1.R.flushNeeded();}}

    /**
     * <p>Utility method for {@link #createNumber(java.lang.String)}.</p>
     *
     * <p>Returns mantissa of the given number.</p>
     * 
     * @param str the string representation of the number
     * @param stopPos the position of the exponent or decimal point
     * @return mantissa of the given number
     */
    private static String getMantissa(final String str, final int stopPos) {try{__CLR4_5_2bvgbvglvha7av1.R.inc(15592);
        __CLR4_5_2bvgbvglvha7av1.R.inc(15593);final char firstChar = str.charAt(0);
        __CLR4_5_2bvgbvglvha7av1.R.inc(15594);final boolean hasSign = firstChar == '-' || firstChar == '+';

        __CLR4_5_2bvgbvglvha7av1.R.inc(15595);return (((hasSign )&&(__CLR4_5_2bvgbvglvha7av1.R.iget(15596)!=0|true))||(__CLR4_5_2bvgbvglvha7av1.R.iget(15597)==0&false))? str.substring(1, stopPos) : str.substring(0, stopPos);
    }finally{__CLR4_5_2bvgbvglvha7av1.R.flushNeeded();}}

    /**
     * <p>Utility method for {@link #createNumber(java.lang.String)}.</p>
     *
     * <p>Returns <code>true</code> if s is <code>null</code>.</p>
     * 
     * @param str  the String to check
     * @return if it is all zeros or <code>null</code>
     */
    private static boolean isAllZeros(final String str) {try{__CLR4_5_2bvgbvglvha7av1.R.inc(15598);
        __CLR4_5_2bvgbvglvha7av1.R.inc(15599);if ((((str == null)&&(__CLR4_5_2bvgbvglvha7av1.R.iget(15600)!=0|true))||(__CLR4_5_2bvgbvglvha7av1.R.iget(15601)==0&false))) {{
            __CLR4_5_2bvgbvglvha7av1.R.inc(15602);return true;
        }
        }__CLR4_5_2bvgbvglvha7av1.R.inc(15603);for (int i = str.length() - 1; (((i >= 0)&&(__CLR4_5_2bvgbvglvha7av1.R.iget(15604)!=0|true))||(__CLR4_5_2bvgbvglvha7av1.R.iget(15605)==0&false)); i--) {{
            __CLR4_5_2bvgbvglvha7av1.R.inc(15606);if ((((str.charAt(i) != '0')&&(__CLR4_5_2bvgbvglvha7av1.R.iget(15607)!=0|true))||(__CLR4_5_2bvgbvglvha7av1.R.iget(15608)==0&false))) {{
                __CLR4_5_2bvgbvglvha7av1.R.inc(15609);return false;
            }
        }}
        }__CLR4_5_2bvgbvglvha7av1.R.inc(15610);return str.length() > 0;
    }finally{__CLR4_5_2bvgbvglvha7av1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * <p>Convert a <code>String</code> to a <code>Float</code>.</p>
     *
     * <p>Returns <code>null</code> if the string is <code>null</code>.</p>
     * 
     * @param str  a <code>String</code> to convert, may be null
     * @return converted <code>Float</code> (or null if the input is null)
     * @throws NumberFormatException if the value cannot be converted
     */
    public static Float createFloat(final String str) {try{__CLR4_5_2bvgbvglvha7av1.R.inc(15611);
        __CLR4_5_2bvgbvglvha7av1.R.inc(15612);if ((((str == null)&&(__CLR4_5_2bvgbvglvha7av1.R.iget(15613)!=0|true))||(__CLR4_5_2bvgbvglvha7av1.R.iget(15614)==0&false))) {{
            __CLR4_5_2bvgbvglvha7av1.R.inc(15615);return null;
        }
        }__CLR4_5_2bvgbvglvha7av1.R.inc(15616);return Float.valueOf(str);
    }finally{__CLR4_5_2bvgbvglvha7av1.R.flushNeeded();}}

    /**
     * <p>Convert a <code>String</code> to a <code>Double</code>.</p>
     * 
     * <p>Returns <code>null</code> if the string is <code>null</code>.</p>
     *
     * @param str  a <code>String</code> to convert, may be null
     * @return converted <code>Double</code> (or null if the input is null)
     * @throws NumberFormatException if the value cannot be converted
     */
    public static Double createDouble(final String str) {try{__CLR4_5_2bvgbvglvha7av1.R.inc(15617);
        __CLR4_5_2bvgbvglvha7av1.R.inc(15618);if ((((str == null)&&(__CLR4_5_2bvgbvglvha7av1.R.iget(15619)!=0|true))||(__CLR4_5_2bvgbvglvha7av1.R.iget(15620)==0&false))) {{
            __CLR4_5_2bvgbvglvha7av1.R.inc(15621);return null;
        }
        }__CLR4_5_2bvgbvglvha7av1.R.inc(15622);return Double.valueOf(str);
    }finally{__CLR4_5_2bvgbvglvha7av1.R.flushNeeded();}}

    /**
     * <p>Convert a <code>String</code> to a <code>Integer</code>, handling
     * hex (0xhhhh) and octal (0dddd) notations.
     * N.B. a leading zero means octal; spaces are not trimmed.</p>
     *
     * <p>Returns <code>null</code> if the string is <code>null</code>.</p>
     * 
     * @param str  a <code>String</code> to convert, may be null
     * @return converted <code>Integer</code> (or null if the input is null)
     * @throws NumberFormatException if the value cannot be converted
     */
    public static Integer createInteger(final String str) {try{__CLR4_5_2bvgbvglvha7av1.R.inc(15623);
        __CLR4_5_2bvgbvglvha7av1.R.inc(15624);if ((((str == null)&&(__CLR4_5_2bvgbvglvha7av1.R.iget(15625)!=0|true))||(__CLR4_5_2bvgbvglvha7av1.R.iget(15626)==0&false))) {{
            __CLR4_5_2bvgbvglvha7av1.R.inc(15627);return null;
        }
        // decode() handles 0xAABD and 0777 (hex and octal) as well.
        }__CLR4_5_2bvgbvglvha7av1.R.inc(15628);return Integer.decode(str);
    }finally{__CLR4_5_2bvgbvglvha7av1.R.flushNeeded();}}

    /**
     * <p>Convert a <code>String</code> to a <code>Long</code>; 
     * since 3.1 it handles hex (0Xhhhh) and octal (0ddd) notations.
     * N.B. a leading zero means octal; spaces are not trimmed.</p>
     * 
     * <p>Returns <code>null</code> if the string is <code>null</code>.</p>
     *
     * @param str  a <code>String</code> to convert, may be null
     * @return converted <code>Long</code> (or null if the input is null)
     * @throws NumberFormatException if the value cannot be converted
     */
    public static Long createLong(final String str) {try{__CLR4_5_2bvgbvglvha7av1.R.inc(15629);
        __CLR4_5_2bvgbvglvha7av1.R.inc(15630);if ((((str == null)&&(__CLR4_5_2bvgbvglvha7av1.R.iget(15631)!=0|true))||(__CLR4_5_2bvgbvglvha7av1.R.iget(15632)==0&false))) {{
            __CLR4_5_2bvgbvglvha7av1.R.inc(15633);return null;
        }
        }__CLR4_5_2bvgbvglvha7av1.R.inc(15634);return Long.decode(str);
    }finally{__CLR4_5_2bvgbvglvha7av1.R.flushNeeded();}}

    /**
     * <p>Convert a <code>String</code> to a <code>BigInteger</code>;
     * since 3.2 it handles hex (0x or #) and octal (0) notations.</p>
     *
     * <p>Returns <code>null</code> if the string is <code>null</code>.</p>
     * 
     * @param str  a <code>String</code> to convert, may be null
     * @return converted <code>BigInteger</code> (or null if the input is null)
     * @throws NumberFormatException if the value cannot be converted
     */
    public static BigInteger createBigInteger(final String str) {try{__CLR4_5_2bvgbvglvha7av1.R.inc(15635);
        __CLR4_5_2bvgbvglvha7av1.R.inc(15636);if ((((str == null)&&(__CLR4_5_2bvgbvglvha7av1.R.iget(15637)!=0|true))||(__CLR4_5_2bvgbvglvha7av1.R.iget(15638)==0&false))) {{
            __CLR4_5_2bvgbvglvha7av1.R.inc(15639);return null;
        }
        }__CLR4_5_2bvgbvglvha7av1.R.inc(15640);int pos = 0; // offset within string
        __CLR4_5_2bvgbvglvha7av1.R.inc(15641);int radix = 10;
        __CLR4_5_2bvgbvglvha7av1.R.inc(15642);boolean negate = false; // need to negate later?
        __CLR4_5_2bvgbvglvha7av1.R.inc(15643);if ((((str.startsWith("-"))&&(__CLR4_5_2bvgbvglvha7av1.R.iget(15644)!=0|true))||(__CLR4_5_2bvgbvglvha7av1.R.iget(15645)==0&false))) {{
            __CLR4_5_2bvgbvglvha7av1.R.inc(15646);negate = true;
            __CLR4_5_2bvgbvglvha7av1.R.inc(15647);pos = 1;
        }
        }__CLR4_5_2bvgbvglvha7av1.R.inc(15648);if ((((str.startsWith("0x", pos) || str.startsWith("0X", pos))&&(__CLR4_5_2bvgbvglvha7av1.R.iget(15649)!=0|true))||(__CLR4_5_2bvgbvglvha7av1.R.iget(15650)==0&false))) {{ // hex
            __CLR4_5_2bvgbvglvha7av1.R.inc(15651);radix = 16;
            __CLR4_5_2bvgbvglvha7av1.R.inc(15652);pos += 2;
        } }else {__CLR4_5_2bvgbvglvha7av1.R.inc(15653);if ((((str.startsWith("#", pos))&&(__CLR4_5_2bvgbvglvha7av1.R.iget(15654)!=0|true))||(__CLR4_5_2bvgbvglvha7av1.R.iget(15655)==0&false))) {{ // alternative hex (allowed by Long/Integer)
            __CLR4_5_2bvgbvglvha7av1.R.inc(15656);radix = 16;
            __CLR4_5_2bvgbvglvha7av1.R.inc(15657);pos ++;
        } }else {__CLR4_5_2bvgbvglvha7av1.R.inc(15658);if ((((str.startsWith("0", pos) && str.length() > pos + 1)&&(__CLR4_5_2bvgbvglvha7av1.R.iget(15659)!=0|true))||(__CLR4_5_2bvgbvglvha7av1.R.iget(15660)==0&false))) {{ // octal; so long as there are additional digits
            __CLR4_5_2bvgbvglvha7av1.R.inc(15661);radix = 8;
            __CLR4_5_2bvgbvglvha7av1.R.inc(15662);pos ++;
        } // default is to treat as decimal

        }}}__CLR4_5_2bvgbvglvha7av1.R.inc(15663);final BigInteger value = new BigInteger(str.substring(pos), radix);
        __CLR4_5_2bvgbvglvha7av1.R.inc(15664);return (((negate )&&(__CLR4_5_2bvgbvglvha7av1.R.iget(15665)!=0|true))||(__CLR4_5_2bvgbvglvha7av1.R.iget(15666)==0&false))? value.negate() : value;
    }finally{__CLR4_5_2bvgbvglvha7av1.R.flushNeeded();}}

    /**
     * <p>Convert a <code>String</code> to a <code>BigDecimal</code>.</p>
     * 
     * <p>Returns <code>null</code> if the string is <code>null</code>.</p>
     *
     * @param str  a <code>String</code> to convert, may be null
     * @return converted <code>BigDecimal</code> (or null if the input is null)
     * @throws NumberFormatException if the value cannot be converted
     */
    public static BigDecimal createBigDecimal(final String str) {try{__CLR4_5_2bvgbvglvha7av1.R.inc(15667);
        __CLR4_5_2bvgbvglvha7av1.R.inc(15668);if ((((str == null)&&(__CLR4_5_2bvgbvglvha7av1.R.iget(15669)!=0|true))||(__CLR4_5_2bvgbvglvha7av1.R.iget(15670)==0&false))) {{
            __CLR4_5_2bvgbvglvha7av1.R.inc(15671);return null;
        }
        // handle JDK1.3.1 bug where "" throws IndexOutOfBoundsException
        }__CLR4_5_2bvgbvglvha7av1.R.inc(15672);if ((((StringUtils.isBlank(str))&&(__CLR4_5_2bvgbvglvha7av1.R.iget(15673)!=0|true))||(__CLR4_5_2bvgbvglvha7av1.R.iget(15674)==0&false))) {{
            __CLR4_5_2bvgbvglvha7av1.R.inc(15675);throw new NumberFormatException("A blank string is not a valid number");
        }
        }__CLR4_5_2bvgbvglvha7av1.R.inc(15676);if ((((str.trim().startsWith("--"))&&(__CLR4_5_2bvgbvglvha7av1.R.iget(15677)!=0|true))||(__CLR4_5_2bvgbvglvha7av1.R.iget(15678)==0&false))) {{
            // this is protection for poorness in java.lang.BigDecimal.
            // it accepts this as a legal value, but it does not appear 
            // to be in specification of class. OS X Java parses it to 
            // a wrong value.
            __CLR4_5_2bvgbvglvha7av1.R.inc(15679);throw new NumberFormatException(str + " is not a valid number.");
        }
        }__CLR4_5_2bvgbvglvha7av1.R.inc(15680);return new BigDecimal(str);
    }finally{__CLR4_5_2bvgbvglvha7av1.R.flushNeeded();}}

    // Min in array
    //--------------------------------------------------------------------
    /**
     * <p>Returns the minimum value in an array.</p>
     * 
     * @param array  an array, must not be null or empty
     * @return the minimum value in the array
     * @throws IllegalArgumentException if <code>array</code> is <code>null</code>
     * @throws IllegalArgumentException if <code>array</code> is empty
     * @since 3.4 Changed signature from min(long[]) to min(long...)
     */
    public static long min(final long... array) {try{__CLR4_5_2bvgbvglvha7av1.R.inc(15681);
        // Validates input
        __CLR4_5_2bvgbvglvha7av1.R.inc(15682);validateArray(array);
    
        // Finds and returns min
        __CLR4_5_2bvgbvglvha7av1.R.inc(15683);long min = array[0];
        __CLR4_5_2bvgbvglvha7av1.R.inc(15684);for (int i = 1; (((i < array.length)&&(__CLR4_5_2bvgbvglvha7av1.R.iget(15685)!=0|true))||(__CLR4_5_2bvgbvglvha7av1.R.iget(15686)==0&false)); i++) {{
            __CLR4_5_2bvgbvglvha7av1.R.inc(15687);if ((((array[i] < min)&&(__CLR4_5_2bvgbvglvha7av1.R.iget(15688)!=0|true))||(__CLR4_5_2bvgbvglvha7av1.R.iget(15689)==0&false))) {{
                __CLR4_5_2bvgbvglvha7av1.R.inc(15690);min = array[i];
            }
        }}
    
        }__CLR4_5_2bvgbvglvha7av1.R.inc(15691);return min;
    }finally{__CLR4_5_2bvgbvglvha7av1.R.flushNeeded();}}

    /**
     * <p>Returns the minimum value in an array.</p>
     * 
     * @param array  an array, must not be null or empty
     * @return the minimum value in the array
     * @throws IllegalArgumentException if <code>array</code> is <code>null</code>
     * @throws IllegalArgumentException if <code>array</code> is empty
     * @since 3.4 Changed signature from min(int[]) to min(int...)
     */
    public static int min(final int... array) {try{__CLR4_5_2bvgbvglvha7av1.R.inc(15692);
        // Validates input
        __CLR4_5_2bvgbvglvha7av1.R.inc(15693);validateArray(array);
    
        // Finds and returns min
        __CLR4_5_2bvgbvglvha7av1.R.inc(15694);int min = array[0];
        __CLR4_5_2bvgbvglvha7av1.R.inc(15695);for (int j = 1; (((j < array.length)&&(__CLR4_5_2bvgbvglvha7av1.R.iget(15696)!=0|true))||(__CLR4_5_2bvgbvglvha7av1.R.iget(15697)==0&false)); j++) {{
            __CLR4_5_2bvgbvglvha7av1.R.inc(15698);if ((((array[j] < min)&&(__CLR4_5_2bvgbvglvha7av1.R.iget(15699)!=0|true))||(__CLR4_5_2bvgbvglvha7av1.R.iget(15700)==0&false))) {{
                __CLR4_5_2bvgbvglvha7av1.R.inc(15701);min = array[j];
            }
        }}
    
        }__CLR4_5_2bvgbvglvha7av1.R.inc(15702);return min;
    }finally{__CLR4_5_2bvgbvglvha7av1.R.flushNeeded();}}

    /**
     * <p>Returns the minimum value in an array.</p>
     * 
     * @param array  an array, must not be null or empty
     * @return the minimum value in the array
     * @throws IllegalArgumentException if <code>array</code> is <code>null</code>
     * @throws IllegalArgumentException if <code>array</code> is empty
     * @since 3.4 Changed signature from min(short[]) to min(short...)
     */
    public static short min(final short... array) {try{__CLR4_5_2bvgbvglvha7av1.R.inc(15703);
        // Validates input
        __CLR4_5_2bvgbvglvha7av1.R.inc(15704);validateArray(array);
    
        // Finds and returns min
        __CLR4_5_2bvgbvglvha7av1.R.inc(15705);short min = array[0];
        __CLR4_5_2bvgbvglvha7av1.R.inc(15706);for (int i = 1; (((i < array.length)&&(__CLR4_5_2bvgbvglvha7av1.R.iget(15707)!=0|true))||(__CLR4_5_2bvgbvglvha7av1.R.iget(15708)==0&false)); i++) {{
            __CLR4_5_2bvgbvglvha7av1.R.inc(15709);if ((((array[i] < min)&&(__CLR4_5_2bvgbvglvha7av1.R.iget(15710)!=0|true))||(__CLR4_5_2bvgbvglvha7av1.R.iget(15711)==0&false))) {{
                __CLR4_5_2bvgbvglvha7av1.R.inc(15712);min = array[i];
            }
        }}
    
        }__CLR4_5_2bvgbvglvha7av1.R.inc(15713);return min;
    }finally{__CLR4_5_2bvgbvglvha7av1.R.flushNeeded();}}

    /**
     * <p>Returns the minimum value in an array.</p>
     * 
     * @param array  an array, must not be null or empty
     * @return the minimum value in the array
     * @throws IllegalArgumentException if <code>array</code> is <code>null</code>
     * @throws IllegalArgumentException if <code>array</code> is empty
     * @since 3.4 Changed signature from min(byte[]) to min(byte...)
     */
    public static byte min(final byte... array) {try{__CLR4_5_2bvgbvglvha7av1.R.inc(15714);
        // Validates input
        __CLR4_5_2bvgbvglvha7av1.R.inc(15715);validateArray(array);
    
        // Finds and returns min
        __CLR4_5_2bvgbvglvha7av1.R.inc(15716);byte min = array[0];
        __CLR4_5_2bvgbvglvha7av1.R.inc(15717);for (int i = 1; (((i < array.length)&&(__CLR4_5_2bvgbvglvha7av1.R.iget(15718)!=0|true))||(__CLR4_5_2bvgbvglvha7av1.R.iget(15719)==0&false)); i++) {{
            __CLR4_5_2bvgbvglvha7av1.R.inc(15720);if ((((array[i] < min)&&(__CLR4_5_2bvgbvglvha7av1.R.iget(15721)!=0|true))||(__CLR4_5_2bvgbvglvha7av1.R.iget(15722)==0&false))) {{
                __CLR4_5_2bvgbvglvha7av1.R.inc(15723);min = array[i];
            }
        }}
    
        }__CLR4_5_2bvgbvglvha7av1.R.inc(15724);return min;
    }finally{__CLR4_5_2bvgbvglvha7av1.R.flushNeeded();}}

     /**
     * <p>Returns the minimum value in an array.</p>
     * 
     * @param array  an array, must not be null or empty
     * @return the minimum value in the array
     * @throws IllegalArgumentException if <code>array</code> is <code>null</code>
     * @throws IllegalArgumentException if <code>array</code> is empty
     * @see IEEE754rUtils#min(double[]) IEEE754rUtils for a version of this method that handles NaN differently
     * @since 3.4 Changed signature from min(double[]) to min(double...)
     */
    public static double min(final double... array) {try{__CLR4_5_2bvgbvglvha7av1.R.inc(15725);
        // Validates input
        __CLR4_5_2bvgbvglvha7av1.R.inc(15726);validateArray(array);
    
        // Finds and returns min
        __CLR4_5_2bvgbvglvha7av1.R.inc(15727);double min = array[0];
        __CLR4_5_2bvgbvglvha7av1.R.inc(15728);for (int i = 1; (((i < array.length)&&(__CLR4_5_2bvgbvglvha7av1.R.iget(15729)!=0|true))||(__CLR4_5_2bvgbvglvha7av1.R.iget(15730)==0&false)); i++) {{
            __CLR4_5_2bvgbvglvha7av1.R.inc(15731);if ((((Double.isNaN(array[i]))&&(__CLR4_5_2bvgbvglvha7av1.R.iget(15732)!=0|true))||(__CLR4_5_2bvgbvglvha7av1.R.iget(15733)==0&false))) {{
                __CLR4_5_2bvgbvglvha7av1.R.inc(15734);return Double.NaN;
            }
            }__CLR4_5_2bvgbvglvha7av1.R.inc(15735);if ((((array[i] < min)&&(__CLR4_5_2bvgbvglvha7av1.R.iget(15736)!=0|true))||(__CLR4_5_2bvgbvglvha7av1.R.iget(15737)==0&false))) {{
                __CLR4_5_2bvgbvglvha7av1.R.inc(15738);min = array[i];
            }
        }}
    
        }__CLR4_5_2bvgbvglvha7av1.R.inc(15739);return min;
    }finally{__CLR4_5_2bvgbvglvha7av1.R.flushNeeded();}}

    /**
     * <p>Returns the minimum value in an array.</p>
     * 
     * @param array  an array, must not be null or empty
     * @return the minimum value in the array
     * @throws IllegalArgumentException if <code>array</code> is <code>null</code>
     * @throws IllegalArgumentException if <code>array</code> is empty
     * @see IEEE754rUtils#min(float[]) IEEE754rUtils for a version of this method that handles NaN differently
     * @since 3.4 Changed signature from min(float[]) to min(float...)
     */
    public static float min(final float... array) {try{__CLR4_5_2bvgbvglvha7av1.R.inc(15740);
        // Validates input
        __CLR4_5_2bvgbvglvha7av1.R.inc(15741);validateArray(array);
    
        // Finds and returns min
        __CLR4_5_2bvgbvglvha7av1.R.inc(15742);float min = array[0];
        __CLR4_5_2bvgbvglvha7av1.R.inc(15743);for (int i = 1; (((i < array.length)&&(__CLR4_5_2bvgbvglvha7av1.R.iget(15744)!=0|true))||(__CLR4_5_2bvgbvglvha7av1.R.iget(15745)==0&false)); i++) {{
            __CLR4_5_2bvgbvglvha7av1.R.inc(15746);if ((((Float.isNaN(array[i]))&&(__CLR4_5_2bvgbvglvha7av1.R.iget(15747)!=0|true))||(__CLR4_5_2bvgbvglvha7av1.R.iget(15748)==0&false))) {{
                __CLR4_5_2bvgbvglvha7av1.R.inc(15749);return Float.NaN;
            }
            }__CLR4_5_2bvgbvglvha7av1.R.inc(15750);if ((((array[i] < min)&&(__CLR4_5_2bvgbvglvha7av1.R.iget(15751)!=0|true))||(__CLR4_5_2bvgbvglvha7av1.R.iget(15752)==0&false))) {{
                __CLR4_5_2bvgbvglvha7av1.R.inc(15753);min = array[i];
            }
        }}
    
        }__CLR4_5_2bvgbvglvha7av1.R.inc(15754);return min;
    }finally{__CLR4_5_2bvgbvglvha7av1.R.flushNeeded();}}

    // Max in array
    //--------------------------------------------------------------------
    /**
     * <p>Returns the maximum value in an array.</p>
     * 
     * @param array  an array, must not be null or empty
     * @return the maximum value in the array
     * @throws IllegalArgumentException if <code>array</code> is <code>null</code>
     * @throws IllegalArgumentException if <code>array</code> is empty
     * @since 3.4 Changed signature from max(long[]) to max(long...)
     */
    public static long max(final long... array) {try{__CLR4_5_2bvgbvglvha7av1.R.inc(15755);
        // Validates input
        __CLR4_5_2bvgbvglvha7av1.R.inc(15756);validateArray(array);

        // Finds and returns max
        __CLR4_5_2bvgbvglvha7av1.R.inc(15757);long max = array[0];
        __CLR4_5_2bvgbvglvha7av1.R.inc(15758);for (int j = 1; (((j < array.length)&&(__CLR4_5_2bvgbvglvha7av1.R.iget(15759)!=0|true))||(__CLR4_5_2bvgbvglvha7av1.R.iget(15760)==0&false)); j++) {{
            __CLR4_5_2bvgbvglvha7av1.R.inc(15761);if ((((array[j] > max)&&(__CLR4_5_2bvgbvglvha7av1.R.iget(15762)!=0|true))||(__CLR4_5_2bvgbvglvha7av1.R.iget(15763)==0&false))) {{
                __CLR4_5_2bvgbvglvha7av1.R.inc(15764);max = array[j];
            }
        }}

        }__CLR4_5_2bvgbvglvha7av1.R.inc(15765);return max;
    }finally{__CLR4_5_2bvgbvglvha7av1.R.flushNeeded();}}

    /**
     * <p>Returns the maximum value in an array.</p>
     * 
     * @param array  an array, must not be null or empty
     * @return the maximum value in the array
     * @throws IllegalArgumentException if <code>array</code> is <code>null</code>
     * @throws IllegalArgumentException if <code>array</code> is empty
     * @since 3.4 Changed signature from max(int[]) to max(int...)
     */
    public static int max(final int... array) {try{__CLR4_5_2bvgbvglvha7av1.R.inc(15766);
        // Validates input
        __CLR4_5_2bvgbvglvha7av1.R.inc(15767);validateArray(array);
    
        // Finds and returns max
        __CLR4_5_2bvgbvglvha7av1.R.inc(15768);int max = array[0];
        __CLR4_5_2bvgbvglvha7av1.R.inc(15769);for (int j = 1; (((j < array.length)&&(__CLR4_5_2bvgbvglvha7av1.R.iget(15770)!=0|true))||(__CLR4_5_2bvgbvglvha7av1.R.iget(15771)==0&false)); j++) {{
            __CLR4_5_2bvgbvglvha7av1.R.inc(15772);if ((((array[j] > max)&&(__CLR4_5_2bvgbvglvha7av1.R.iget(15773)!=0|true))||(__CLR4_5_2bvgbvglvha7av1.R.iget(15774)==0&false))) {{
                __CLR4_5_2bvgbvglvha7av1.R.inc(15775);max = array[j];
            }
        }}
    
        }__CLR4_5_2bvgbvglvha7av1.R.inc(15776);return max;
    }finally{__CLR4_5_2bvgbvglvha7av1.R.flushNeeded();}}

    /**
     * <p>Returns the maximum value in an array.</p>
     * 
     * @param array  an array, must not be null or empty
     * @return the maximum value in the array
     * @throws IllegalArgumentException if <code>array</code> is <code>null</code>
     * @throws IllegalArgumentException if <code>array</code> is empty
     * @since 3.4 Changed signature from max(short[]) to max(short...)
     */
    public static short max(final short... array) {try{__CLR4_5_2bvgbvglvha7av1.R.inc(15777);
        // Validates input
        __CLR4_5_2bvgbvglvha7av1.R.inc(15778);validateArray(array);
    
        // Finds and returns max
        __CLR4_5_2bvgbvglvha7av1.R.inc(15779);short max = array[0];
        __CLR4_5_2bvgbvglvha7av1.R.inc(15780);for (int i = 1; (((i < array.length)&&(__CLR4_5_2bvgbvglvha7av1.R.iget(15781)!=0|true))||(__CLR4_5_2bvgbvglvha7av1.R.iget(15782)==0&false)); i++) {{
            __CLR4_5_2bvgbvglvha7av1.R.inc(15783);if ((((array[i] > max)&&(__CLR4_5_2bvgbvglvha7av1.R.iget(15784)!=0|true))||(__CLR4_5_2bvgbvglvha7av1.R.iget(15785)==0&false))) {{
                __CLR4_5_2bvgbvglvha7av1.R.inc(15786);max = array[i];
            }
        }}
    
        }__CLR4_5_2bvgbvglvha7av1.R.inc(15787);return max;
    }finally{__CLR4_5_2bvgbvglvha7av1.R.flushNeeded();}}

    /**
     * <p>Returns the maximum value in an array.</p>
     * 
     * @param array  an array, must not be null or empty
     * @return the maximum value in the array
     * @throws IllegalArgumentException if <code>array</code> is <code>null</code>
     * @throws IllegalArgumentException if <code>array</code> is empty
     * @since 3.4 Changed signature from max(byte[]) to max(byte...)
     */
    public static byte max(final byte... array) {try{__CLR4_5_2bvgbvglvha7av1.R.inc(15788);
        // Validates input
        __CLR4_5_2bvgbvglvha7av1.R.inc(15789);validateArray(array);
    
        // Finds and returns max
        __CLR4_5_2bvgbvglvha7av1.R.inc(15790);byte max = array[0];
        __CLR4_5_2bvgbvglvha7av1.R.inc(15791);for (int i = 1; (((i < array.length)&&(__CLR4_5_2bvgbvglvha7av1.R.iget(15792)!=0|true))||(__CLR4_5_2bvgbvglvha7av1.R.iget(15793)==0&false)); i++) {{
            __CLR4_5_2bvgbvglvha7av1.R.inc(15794);if ((((array[i] > max)&&(__CLR4_5_2bvgbvglvha7av1.R.iget(15795)!=0|true))||(__CLR4_5_2bvgbvglvha7av1.R.iget(15796)==0&false))) {{
                __CLR4_5_2bvgbvglvha7av1.R.inc(15797);max = array[i];
            }
        }}
    
        }__CLR4_5_2bvgbvglvha7av1.R.inc(15798);return max;
    }finally{__CLR4_5_2bvgbvglvha7av1.R.flushNeeded();}}

    /**
     * <p>Returns the maximum value in an array.</p>
     * 
     * @param array  an array, must not be null or empty
     * @return the maximum value in the array
     * @throws IllegalArgumentException if <code>array</code> is <code>null</code>
     * @throws IllegalArgumentException if <code>array</code> is empty
     * @see IEEE754rUtils#max(double[]) IEEE754rUtils for a version of this method that handles NaN differently
     * @since 3.4 Changed signature from max(double[]) to max(double...)
     */
    public static double max(final double... array) {try{__CLR4_5_2bvgbvglvha7av1.R.inc(15799);
        // Validates input
        __CLR4_5_2bvgbvglvha7av1.R.inc(15800);validateArray(array);

        // Finds and returns max
        __CLR4_5_2bvgbvglvha7av1.R.inc(15801);double max = array[0];
        __CLR4_5_2bvgbvglvha7av1.R.inc(15802);for (int j = 1; (((j < array.length)&&(__CLR4_5_2bvgbvglvha7av1.R.iget(15803)!=0|true))||(__CLR4_5_2bvgbvglvha7av1.R.iget(15804)==0&false)); j++) {{
            __CLR4_5_2bvgbvglvha7av1.R.inc(15805);if ((((Double.isNaN(array[j]))&&(__CLR4_5_2bvgbvglvha7av1.R.iget(15806)!=0|true))||(__CLR4_5_2bvgbvglvha7av1.R.iget(15807)==0&false))) {{
                __CLR4_5_2bvgbvglvha7av1.R.inc(15808);return Double.NaN;
            }
            }__CLR4_5_2bvgbvglvha7av1.R.inc(15809);if ((((array[j] > max)&&(__CLR4_5_2bvgbvglvha7av1.R.iget(15810)!=0|true))||(__CLR4_5_2bvgbvglvha7av1.R.iget(15811)==0&false))) {{
                __CLR4_5_2bvgbvglvha7av1.R.inc(15812);max = array[j];
            }
        }}
    
        }__CLR4_5_2bvgbvglvha7av1.R.inc(15813);return max;
    }finally{__CLR4_5_2bvgbvglvha7av1.R.flushNeeded();}}

    /**
     * <p>Returns the maximum value in an array.</p>
     * 
     * @param array  an array, must not be null or empty
     * @return the maximum value in the array
     * @throws IllegalArgumentException if <code>array</code> is <code>null</code>
     * @throws IllegalArgumentException if <code>array</code> is empty
     * @see IEEE754rUtils#max(float[]) IEEE754rUtils for a version of this method that handles NaN differently
     * @since 3.4 Changed signature from max(float[]) to max(float...)
     */
    public static float max(final float... array) {try{__CLR4_5_2bvgbvglvha7av1.R.inc(15814);
        // Validates input
        __CLR4_5_2bvgbvglvha7av1.R.inc(15815);validateArray(array);

        // Finds and returns max
        __CLR4_5_2bvgbvglvha7av1.R.inc(15816);float max = array[0];
        __CLR4_5_2bvgbvglvha7av1.R.inc(15817);for (int j = 1; (((j < array.length)&&(__CLR4_5_2bvgbvglvha7av1.R.iget(15818)!=0|true))||(__CLR4_5_2bvgbvglvha7av1.R.iget(15819)==0&false)); j++) {{
            __CLR4_5_2bvgbvglvha7av1.R.inc(15820);if ((((Float.isNaN(array[j]))&&(__CLR4_5_2bvgbvglvha7av1.R.iget(15821)!=0|true))||(__CLR4_5_2bvgbvglvha7av1.R.iget(15822)==0&false))) {{
                __CLR4_5_2bvgbvglvha7av1.R.inc(15823);return Float.NaN;
            }
            }__CLR4_5_2bvgbvglvha7av1.R.inc(15824);if ((((array[j] > max)&&(__CLR4_5_2bvgbvglvha7av1.R.iget(15825)!=0|true))||(__CLR4_5_2bvgbvglvha7av1.R.iget(15826)==0&false))) {{
                __CLR4_5_2bvgbvglvha7av1.R.inc(15827);max = array[j];
            }
        }}

        }__CLR4_5_2bvgbvglvha7av1.R.inc(15828);return max;
    }finally{__CLR4_5_2bvgbvglvha7av1.R.flushNeeded();}}

    /**
     * Checks if the specified array is neither null nor empty.
     *
     * @param array  the array to check
     * @throws IllegalArgumentException if {@code array} is either {@code null} or empty
     */
    private static void validateArray(final Object array) {try{__CLR4_5_2bvgbvglvha7av1.R.inc(15829);
        __CLR4_5_2bvgbvglvha7av1.R.inc(15830);Validate.isTrue(array != null, "The Array must not be null");
        __CLR4_5_2bvgbvglvha7av1.R.inc(15831);Validate.isTrue(Array.getLength(array) != 0, "Array cannot be empty.");        
    }finally{__CLR4_5_2bvgbvglvha7av1.R.flushNeeded();}}
     
    // 3 param min
    //-----------------------------------------------------------------------
    /**
     * <p>Gets the minimum of three <code>long</code> values.</p>
     * 
     * @param a  value 1
     * @param b  value 2
     * @param c  value 3
     * @return  the smallest of the values
     */
    public static long min(long a, final long b, final long c) {try{__CLR4_5_2bvgbvglvha7av1.R.inc(15832);
        __CLR4_5_2bvgbvglvha7av1.R.inc(15833);if ((((b < a)&&(__CLR4_5_2bvgbvglvha7av1.R.iget(15834)!=0|true))||(__CLR4_5_2bvgbvglvha7av1.R.iget(15835)==0&false))) {{
            __CLR4_5_2bvgbvglvha7av1.R.inc(15836);a = b;
        }
        }__CLR4_5_2bvgbvglvha7av1.R.inc(15837);if ((((c < a)&&(__CLR4_5_2bvgbvglvha7av1.R.iget(15838)!=0|true))||(__CLR4_5_2bvgbvglvha7av1.R.iget(15839)==0&false))) {{
            __CLR4_5_2bvgbvglvha7av1.R.inc(15840);a = c;
        }
        }__CLR4_5_2bvgbvglvha7av1.R.inc(15841);return a;
    }finally{__CLR4_5_2bvgbvglvha7av1.R.flushNeeded();}}

    /**
     * <p>Gets the minimum of three <code>int</code> values.</p>
     * 
     * @param a  value 1
     * @param b  value 2
     * @param c  value 3
     * @return  the smallest of the values
     */
    public static int min(int a, final int b, final int c) {try{__CLR4_5_2bvgbvglvha7av1.R.inc(15842);
        __CLR4_5_2bvgbvglvha7av1.R.inc(15843);if ((((b < a)&&(__CLR4_5_2bvgbvglvha7av1.R.iget(15844)!=0|true))||(__CLR4_5_2bvgbvglvha7av1.R.iget(15845)==0&false))) {{
            __CLR4_5_2bvgbvglvha7av1.R.inc(15846);a = b;
        }
        }__CLR4_5_2bvgbvglvha7av1.R.inc(15847);if ((((c < a)&&(__CLR4_5_2bvgbvglvha7av1.R.iget(15848)!=0|true))||(__CLR4_5_2bvgbvglvha7av1.R.iget(15849)==0&false))) {{
            __CLR4_5_2bvgbvglvha7av1.R.inc(15850);a = c;
        }
        }__CLR4_5_2bvgbvglvha7av1.R.inc(15851);return a;
    }finally{__CLR4_5_2bvgbvglvha7av1.R.flushNeeded();}}

    /**
     * <p>Gets the minimum of three <code>short</code> values.</p>
     * 
     * @param a  value 1
     * @param b  value 2
     * @param c  value 3
     * @return  the smallest of the values
     */
    public static short min(short a, final short b, final short c) {try{__CLR4_5_2bvgbvglvha7av1.R.inc(15852);
        __CLR4_5_2bvgbvglvha7av1.R.inc(15853);if ((((b < a)&&(__CLR4_5_2bvgbvglvha7av1.R.iget(15854)!=0|true))||(__CLR4_5_2bvgbvglvha7av1.R.iget(15855)==0&false))) {{
            __CLR4_5_2bvgbvglvha7av1.R.inc(15856);a = b;
        }
        }__CLR4_5_2bvgbvglvha7av1.R.inc(15857);if ((((c < a)&&(__CLR4_5_2bvgbvglvha7av1.R.iget(15858)!=0|true))||(__CLR4_5_2bvgbvglvha7av1.R.iget(15859)==0&false))) {{
            __CLR4_5_2bvgbvglvha7av1.R.inc(15860);a = c;
        }
        }__CLR4_5_2bvgbvglvha7av1.R.inc(15861);return a;
    }finally{__CLR4_5_2bvgbvglvha7av1.R.flushNeeded();}}

    /**
     * <p>Gets the minimum of three <code>byte</code> values.</p>
     * 
     * @param a  value 1
     * @param b  value 2
     * @param c  value 3
     * @return  the smallest of the values
     */
    public static byte min(byte a, final byte b, final byte c) {try{__CLR4_5_2bvgbvglvha7av1.R.inc(15862);
        __CLR4_5_2bvgbvglvha7av1.R.inc(15863);if ((((b < a)&&(__CLR4_5_2bvgbvglvha7av1.R.iget(15864)!=0|true))||(__CLR4_5_2bvgbvglvha7av1.R.iget(15865)==0&false))) {{
            __CLR4_5_2bvgbvglvha7av1.R.inc(15866);a = b;
        }
        }__CLR4_5_2bvgbvglvha7av1.R.inc(15867);if ((((c < a)&&(__CLR4_5_2bvgbvglvha7av1.R.iget(15868)!=0|true))||(__CLR4_5_2bvgbvglvha7av1.R.iget(15869)==0&false))) {{
            __CLR4_5_2bvgbvglvha7av1.R.inc(15870);a = c;
        }
        }__CLR4_5_2bvgbvglvha7av1.R.inc(15871);return a;
    }finally{__CLR4_5_2bvgbvglvha7av1.R.flushNeeded();}}

    /**
     * <p>Gets the minimum of three <code>double</code> values.</p>
     * 
     * <p>If any value is <code>NaN</code>, <code>NaN</code> is
     * returned. Infinity is handled.</p>
     * 
     * @param a  value 1
     * @param b  value 2
     * @param c  value 3
     * @return  the smallest of the values
     * @see IEEE754rUtils#min(double, double, double) for a version of this method that handles NaN differently
     */
    public static double min(final double a, final double b, final double c) {try{__CLR4_5_2bvgbvglvha7av1.R.inc(15872);
        __CLR4_5_2bvgbvglvha7av1.R.inc(15873);return Math.min(Math.min(a, b), c);
    }finally{__CLR4_5_2bvgbvglvha7av1.R.flushNeeded();}}

    /**
     * <p>Gets the minimum of three <code>float</code> values.</p>
     * 
     * <p>If any value is <code>NaN</code>, <code>NaN</code> is
     * returned. Infinity is handled.</p>
     *
     * @param a  value 1
     * @param b  value 2
     * @param c  value 3
     * @return  the smallest of the values
     * @see IEEE754rUtils#min(float, float, float) for a version of this method that handles NaN differently
     */
    public static float min(final float a, final float b, final float c) {try{__CLR4_5_2bvgbvglvha7av1.R.inc(15874);
        __CLR4_5_2bvgbvglvha7av1.R.inc(15875);return Math.min(Math.min(a, b), c);
    }finally{__CLR4_5_2bvgbvglvha7av1.R.flushNeeded();}}

    // 3 param max
    //-----------------------------------------------------------------------
    /**
     * <p>Gets the maximum of three <code>long</code> values.</p>
     * 
     * @param a  value 1
     * @param b  value 2
     * @param c  value 3
     * @return  the largest of the values
     */
    public static long max(long a, final long b, final long c) {try{__CLR4_5_2bvgbvglvha7av1.R.inc(15876);
        __CLR4_5_2bvgbvglvha7av1.R.inc(15877);if ((((b > a)&&(__CLR4_5_2bvgbvglvha7av1.R.iget(15878)!=0|true))||(__CLR4_5_2bvgbvglvha7av1.R.iget(15879)==0&false))) {{
            __CLR4_5_2bvgbvglvha7av1.R.inc(15880);a = b;
        }
        }__CLR4_5_2bvgbvglvha7av1.R.inc(15881);if ((((c > a)&&(__CLR4_5_2bvgbvglvha7av1.R.iget(15882)!=0|true))||(__CLR4_5_2bvgbvglvha7av1.R.iget(15883)==0&false))) {{
            __CLR4_5_2bvgbvglvha7av1.R.inc(15884);a = c;
        }
        }__CLR4_5_2bvgbvglvha7av1.R.inc(15885);return a;
    }finally{__CLR4_5_2bvgbvglvha7av1.R.flushNeeded();}}

    /**
     * <p>Gets the maximum of three <code>int</code> values.</p>
     * 
     * @param a  value 1
     * @param b  value 2
     * @param c  value 3
     * @return  the largest of the values
     */
    public static int max(int a, final int b, final int c) {try{__CLR4_5_2bvgbvglvha7av1.R.inc(15886);
        __CLR4_5_2bvgbvglvha7av1.R.inc(15887);if ((((b > a)&&(__CLR4_5_2bvgbvglvha7av1.R.iget(15888)!=0|true))||(__CLR4_5_2bvgbvglvha7av1.R.iget(15889)==0&false))) {{
            __CLR4_5_2bvgbvglvha7av1.R.inc(15890);a = b;
        }
        }__CLR4_5_2bvgbvglvha7av1.R.inc(15891);if ((((c > a)&&(__CLR4_5_2bvgbvglvha7av1.R.iget(15892)!=0|true))||(__CLR4_5_2bvgbvglvha7av1.R.iget(15893)==0&false))) {{
            __CLR4_5_2bvgbvglvha7av1.R.inc(15894);a = c;
        }
        }__CLR4_5_2bvgbvglvha7av1.R.inc(15895);return a;
    }finally{__CLR4_5_2bvgbvglvha7av1.R.flushNeeded();}}

    /**
     * <p>Gets the maximum of three <code>short</code> values.</p>
     * 
     * @param a  value 1
     * @param b  value 2
     * @param c  value 3
     * @return  the largest of the values
     */
    public static short max(short a, final short b, final short c) {try{__CLR4_5_2bvgbvglvha7av1.R.inc(15896);
        __CLR4_5_2bvgbvglvha7av1.R.inc(15897);if ((((b > a)&&(__CLR4_5_2bvgbvglvha7av1.R.iget(15898)!=0|true))||(__CLR4_5_2bvgbvglvha7av1.R.iget(15899)==0&false))) {{
            __CLR4_5_2bvgbvglvha7av1.R.inc(15900);a = b;
        }
        }__CLR4_5_2bvgbvglvha7av1.R.inc(15901);if ((((c > a)&&(__CLR4_5_2bvgbvglvha7av1.R.iget(15902)!=0|true))||(__CLR4_5_2bvgbvglvha7av1.R.iget(15903)==0&false))) {{
            __CLR4_5_2bvgbvglvha7av1.R.inc(15904);a = c;
        }
        }__CLR4_5_2bvgbvglvha7av1.R.inc(15905);return a;
    }finally{__CLR4_5_2bvgbvglvha7av1.R.flushNeeded();}}

    /**
     * <p>Gets the maximum of three <code>byte</code> values.</p>
     * 
     * @param a  value 1
     * @param b  value 2
     * @param c  value 3
     * @return  the largest of the values
     */
    public static byte max(byte a, final byte b, final byte c) {try{__CLR4_5_2bvgbvglvha7av1.R.inc(15906);
        __CLR4_5_2bvgbvglvha7av1.R.inc(15907);if ((((b > a)&&(__CLR4_5_2bvgbvglvha7av1.R.iget(15908)!=0|true))||(__CLR4_5_2bvgbvglvha7av1.R.iget(15909)==0&false))) {{
            __CLR4_5_2bvgbvglvha7av1.R.inc(15910);a = b;
        }
        }__CLR4_5_2bvgbvglvha7av1.R.inc(15911);if ((((c > a)&&(__CLR4_5_2bvgbvglvha7av1.R.iget(15912)!=0|true))||(__CLR4_5_2bvgbvglvha7av1.R.iget(15913)==0&false))) {{
            __CLR4_5_2bvgbvglvha7av1.R.inc(15914);a = c;
        }
        }__CLR4_5_2bvgbvglvha7av1.R.inc(15915);return a;
    }finally{__CLR4_5_2bvgbvglvha7av1.R.flushNeeded();}}

    /**
     * <p>Gets the maximum of three <code>double</code> values.</p>
     * 
     * <p>If any value is <code>NaN</code>, <code>NaN</code> is
     * returned. Infinity is handled.</p>
     *
     * @param a  value 1
     * @param b  value 2
     * @param c  value 3
     * @return  the largest of the values
     * @see IEEE754rUtils#max(double, double, double) for a version of this method that handles NaN differently
     */
    public static double max(final double a, final double b, final double c) {try{__CLR4_5_2bvgbvglvha7av1.R.inc(15916);
        __CLR4_5_2bvgbvglvha7av1.R.inc(15917);return Math.max(Math.max(a, b), c);
    }finally{__CLR4_5_2bvgbvglvha7av1.R.flushNeeded();}}

    /**
     * <p>Gets the maximum of three <code>float</code> values.</p>
     * 
     * <p>If any value is <code>NaN</code>, <code>NaN</code> is
     * returned. Infinity is handled.</p>
     *
     * @param a  value 1
     * @param b  value 2
     * @param c  value 3
     * @return  the largest of the values
     * @see IEEE754rUtils#max(float, float, float) for a version of this method that handles NaN differently
     */
    public static float max(final float a, final float b, final float c) {try{__CLR4_5_2bvgbvglvha7av1.R.inc(15918);
        __CLR4_5_2bvgbvglvha7av1.R.inc(15919);return Math.max(Math.max(a, b), c);
    }finally{__CLR4_5_2bvgbvglvha7av1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * <p>Checks whether the <code>String</code> contains only
     * digit characters.</p>
     *
     * <p><code>Null</code> and empty String will return
     * <code>false</code>.</p>
     *
     * @param str  the <code>String</code> to check
     * @return <code>true</code> if str contains only Unicode numeric
     */
    public static boolean isDigits(final String str) {try{__CLR4_5_2bvgbvglvha7av1.R.inc(15920);
        __CLR4_5_2bvgbvglvha7av1.R.inc(15921);return StringUtils.isNumeric(str);
    }finally{__CLR4_5_2bvgbvglvha7av1.R.flushNeeded();}}

    /**
     * <p>Checks whether the String a valid Java number.</p>
     *
     * <p>Valid numbers include hexadecimal marked with the <code>0x</code> or
     * <code>0X</code> qualifier, octal numbers, scientific notation and
     * numbers marked with a type qualifier (e.g. 123L).</p>
     *
     * <p>Non-hexadecimal strings beginning with a leading zero are
     * treated as octal values. Thus the string <code>09</code> will return
     * <code>false</code>, since <code>9</code> is not a valid octal value.
     * However, numbers beginning with {@code 0.} are treated as decimal.</p>
     *
     * <p><code>null</code> and empty/blank {@code String} will return
     * <code>false</code>.</p>
     *
     * <p>Note, {@link #createNumber(String)} should return a number for every
     * input resulting in <code>true</code>.</p>
     *
     * @param str  the <code>String</code> to check
     * @return <code>true</code> if the string is a correctly formatted number
     * @since 3.3 the code supports hex {@code 0Xhhh} an
     *        octal {@code 0ddd} validation
     * @deprecated This feature will be removed in Lang 4.0,
     *             use {@link NumberUtils#isCreatable(String)} instead
     */
    @Deprecated
    public static boolean isNumber(final String str) {try{__CLR4_5_2bvgbvglvha7av1.R.inc(15922);
        __CLR4_5_2bvgbvglvha7av1.R.inc(15923);return isCreatable(str);
    }finally{__CLR4_5_2bvgbvglvha7av1.R.flushNeeded();}}

    /**
     * <p>Checks whether the String a valid Java number.</p>
     *
     * <p>Valid numbers include hexadecimal marked with the <code>0x</code> or
     * <code>0X</code> qualifier, octal numbers, scientific notation and
     * numbers marked with a type qualifier (e.g. 123L).</p>
     *
     * <p>Non-hexadecimal strings beginning with a leading zero are
     * treated as octal values. Thus the string <code>09</code> will return
     * <code>false</code>, since <code>9</code> is not a valid octal value.
     * However, numbers beginning with {@code 0.} are treated as decimal.</p>
     *
     * <p><code>null</code> and empty/blank {@code String} will return
     * <code>false</code>.</p>
     *
     * <p>Note, {@link #createNumber(String)} should return a number for every
     * input resulting in <code>true</code>.</p>
     *
     * @param str  the <code>String</code> to check
     * @return <code>true</code> if the string is a correctly formatted number
     * @since 3.5 the code supports the "+" suffix on numbers except for integers in Java 1.6
     */
    public static boolean isCreatable(final String str) {try{__CLR4_5_2bvgbvglvha7av1.R.inc(15924);
        __CLR4_5_2bvgbvglvha7av1.R.inc(15925);if ((((StringUtils.isEmpty(str))&&(__CLR4_5_2bvgbvglvha7av1.R.iget(15926)!=0|true))||(__CLR4_5_2bvgbvglvha7av1.R.iget(15927)==0&false))) {{
            __CLR4_5_2bvgbvglvha7av1.R.inc(15928);return false;
        }
        }__CLR4_5_2bvgbvglvha7av1.R.inc(15929);final char[] chars = str.toCharArray();
        __CLR4_5_2bvgbvglvha7av1.R.inc(15930);int sz = chars.length;
        __CLR4_5_2bvgbvglvha7av1.R.inc(15931);boolean hasExp = false;
        __CLR4_5_2bvgbvglvha7av1.R.inc(15932);boolean hasDecPoint = false;
        __CLR4_5_2bvgbvglvha7av1.R.inc(15933);boolean allowSigns = false;
        __CLR4_5_2bvgbvglvha7av1.R.inc(15934);boolean foundDigit = false;
        // deal with any possible sign up front
        __CLR4_5_2bvgbvglvha7av1.R.inc(15935);final int start = (((chars[0] == '-' || chars[0] == '+' )&&(__CLR4_5_2bvgbvglvha7av1.R.iget(15936)!=0|true))||(__CLR4_5_2bvgbvglvha7av1.R.iget(15937)==0&false))? 1 : 0;
        __CLR4_5_2bvgbvglvha7av1.R.inc(15938);final boolean hasLeadingPlusSign = start == 1 && chars[0] == '+';
        __CLR4_5_2bvgbvglvha7av1.R.inc(15939);if ((((sz > start + 1 && chars[start] == '0')&&(__CLR4_5_2bvgbvglvha7av1.R.iget(15940)!=0|true))||(__CLR4_5_2bvgbvglvha7av1.R.iget(15941)==0&false))) {{ // leading 0
            __CLR4_5_2bvgbvglvha7av1.R.inc(15942);if ((((chars[start + 1] == 'x' || chars[start + 1] == 'X')&&(__CLR4_5_2bvgbvglvha7av1.R.iget(15943)!=0|true))||(__CLR4_5_2bvgbvglvha7av1.R.iget(15944)==0&false))) {{ // leading 0x/0X
                __CLR4_5_2bvgbvglvha7av1.R.inc(15945);int i = start + 2;
                __CLR4_5_2bvgbvglvha7av1.R.inc(15946);if ((((i == sz)&&(__CLR4_5_2bvgbvglvha7av1.R.iget(15947)!=0|true))||(__CLR4_5_2bvgbvglvha7av1.R.iget(15948)==0&false))) {{
                    __CLR4_5_2bvgbvglvha7av1.R.inc(15949);return false; // str == "0x"
                }
                // checking hex (it can't be anything else)
                }__CLR4_5_2bvgbvglvha7av1.R.inc(15950);for (; (((i < chars.length)&&(__CLR4_5_2bvgbvglvha7av1.R.iget(15951)!=0|true))||(__CLR4_5_2bvgbvglvha7av1.R.iget(15952)==0&false)); i++) {{
                    __CLR4_5_2bvgbvglvha7av1.R.inc(15953);if (((((chars[i] < '0' || chars[i] > '9')
                        && (chars[i] < 'a' || chars[i] > 'f')
                        && (chars[i] < 'A' || chars[i] > 'F'))&&(__CLR4_5_2bvgbvglvha7av1.R.iget(15954)!=0|true))||(__CLR4_5_2bvgbvglvha7av1.R.iget(15955)==0&false))) {{
                        __CLR4_5_2bvgbvglvha7av1.R.inc(15956);return false;
                    }
                }}
                }__CLR4_5_2bvgbvglvha7av1.R.inc(15957);return true;
           } }else {__CLR4_5_2bvgbvglvha7av1.R.inc(15958);if ((((Character.isDigit(chars[start + 1]))&&(__CLR4_5_2bvgbvglvha7av1.R.iget(15959)!=0|true))||(__CLR4_5_2bvgbvglvha7av1.R.iget(15960)==0&false))) {{
               // leading 0, but not hex, must be octal
               __CLR4_5_2bvgbvglvha7av1.R.inc(15961);int i = start + 1;
               __CLR4_5_2bvgbvglvha7av1.R.inc(15962);for (; (((i < chars.length)&&(__CLR4_5_2bvgbvglvha7av1.R.iget(15963)!=0|true))||(__CLR4_5_2bvgbvglvha7av1.R.iget(15964)==0&false)); i++) {{
                   __CLR4_5_2bvgbvglvha7av1.R.inc(15965);if ((((chars[i] < '0' || chars[i] > '7')&&(__CLR4_5_2bvgbvglvha7av1.R.iget(15966)!=0|true))||(__CLR4_5_2bvgbvglvha7av1.R.iget(15967)==0&false))) {{
                       __CLR4_5_2bvgbvglvha7av1.R.inc(15968);return false;
                   }
               }}
               }__CLR4_5_2bvgbvglvha7av1.R.inc(15969);return true;               
           }
        }}}
        }__CLR4_5_2bvgbvglvha7av1.R.inc(15970);sz--; // don't want to loop to the last char, check it afterwords
              // for type qualifiers
        __CLR4_5_2bvgbvglvha7av1.R.inc(15971);int i = start;
        // loop to the next to last char or to the last char if we need another digit to
        // make a valid number (e.g. chars[0..5] = "1234E")
        __CLR4_5_2bvgbvglvha7av1.R.inc(15972);while ((((i < sz || i < sz + 1 && allowSigns && !foundDigit)&&(__CLR4_5_2bvgbvglvha7av1.R.iget(15973)!=0|true))||(__CLR4_5_2bvgbvglvha7av1.R.iget(15974)==0&false))) {{
            __CLR4_5_2bvgbvglvha7av1.R.inc(15975);if ((((chars[i] >= '0' && chars[i] <= '9')&&(__CLR4_5_2bvgbvglvha7av1.R.iget(15976)!=0|true))||(__CLR4_5_2bvgbvglvha7av1.R.iget(15977)==0&false))) {{
                __CLR4_5_2bvgbvglvha7av1.R.inc(15978);foundDigit = true;
                __CLR4_5_2bvgbvglvha7av1.R.inc(15979);allowSigns = false;

            } }else {__CLR4_5_2bvgbvglvha7av1.R.inc(15980);if ((((chars[i] == '.')&&(__CLR4_5_2bvgbvglvha7av1.R.iget(15981)!=0|true))||(__CLR4_5_2bvgbvglvha7av1.R.iget(15982)==0&false))) {{
                __CLR4_5_2bvgbvglvha7av1.R.inc(15983);if ((((hasDecPoint || hasExp)&&(__CLR4_5_2bvgbvglvha7av1.R.iget(15984)!=0|true))||(__CLR4_5_2bvgbvglvha7av1.R.iget(15985)==0&false))) {{
                    // two decimal points or dec in exponent   
                    __CLR4_5_2bvgbvglvha7av1.R.inc(15986);return false;
                }
                }__CLR4_5_2bvgbvglvha7av1.R.inc(15987);hasDecPoint = true;
            } }else {__CLR4_5_2bvgbvglvha7av1.R.inc(15988);if ((((chars[i] == 'e' || chars[i] == 'E')&&(__CLR4_5_2bvgbvglvha7av1.R.iget(15989)!=0|true))||(__CLR4_5_2bvgbvglvha7av1.R.iget(15990)==0&false))) {{
                // we've already taken care of hex.
                __CLR4_5_2bvgbvglvha7av1.R.inc(15991);if ((((hasExp)&&(__CLR4_5_2bvgbvglvha7av1.R.iget(15992)!=0|true))||(__CLR4_5_2bvgbvglvha7av1.R.iget(15993)==0&false))) {{
                    // two E's
                    __CLR4_5_2bvgbvglvha7av1.R.inc(15994);return false;
                }
                }__CLR4_5_2bvgbvglvha7av1.R.inc(15995);if ((((!foundDigit)&&(__CLR4_5_2bvgbvglvha7av1.R.iget(15996)!=0|true))||(__CLR4_5_2bvgbvglvha7av1.R.iget(15997)==0&false))) {{
                    __CLR4_5_2bvgbvglvha7av1.R.inc(15998);return false;
                }
                }__CLR4_5_2bvgbvglvha7av1.R.inc(15999);hasExp = true;
                __CLR4_5_2bvgbvglvha7av1.R.inc(16000);allowSigns = true;
            } }else {__CLR4_5_2bvgbvglvha7av1.R.inc(16001);if ((((chars[i] == '+' || chars[i] == '-')&&(__CLR4_5_2bvgbvglvha7av1.R.iget(16002)!=0|true))||(__CLR4_5_2bvgbvglvha7av1.R.iget(16003)==0&false))) {{
                __CLR4_5_2bvgbvglvha7av1.R.inc(16004);if ((((!allowSigns)&&(__CLR4_5_2bvgbvglvha7av1.R.iget(16005)!=0|true))||(__CLR4_5_2bvgbvglvha7av1.R.iget(16006)==0&false))) {{
                    __CLR4_5_2bvgbvglvha7av1.R.inc(16007);return false;
                }
                }__CLR4_5_2bvgbvglvha7av1.R.inc(16008);allowSigns = false;
                __CLR4_5_2bvgbvglvha7av1.R.inc(16009);foundDigit = false; // we need a digit after the E
            } }else {{
                __CLR4_5_2bvgbvglvha7av1.R.inc(16010);return false;
            }
            }}}}__CLR4_5_2bvgbvglvha7av1.R.inc(16011);i++;
        }
        }__CLR4_5_2bvgbvglvha7av1.R.inc(16012);if ((((i < chars.length)&&(__CLR4_5_2bvgbvglvha7av1.R.iget(16013)!=0|true))||(__CLR4_5_2bvgbvglvha7av1.R.iget(16014)==0&false))) {{
            __CLR4_5_2bvgbvglvha7av1.R.inc(16015);if ((((chars[i] >= '0' && chars[i] <= '9')&&(__CLR4_5_2bvgbvglvha7av1.R.iget(16016)!=0|true))||(__CLR4_5_2bvgbvglvha7av1.R.iget(16017)==0&false))) {{
                __CLR4_5_2bvgbvglvha7av1.R.inc(16018);if ((((SystemUtils.IS_JAVA_1_6 && hasLeadingPlusSign && !hasDecPoint)&&(__CLR4_5_2bvgbvglvha7av1.R.iget(16019)!=0|true))||(__CLR4_5_2bvgbvglvha7av1.R.iget(16020)==0&false))) {{
                    __CLR4_5_2bvgbvglvha7av1.R.inc(16021);return false;
                }
                // no type qualifier, OK
                }__CLR4_5_2bvgbvglvha7av1.R.inc(16022);return true;
            }
            }__CLR4_5_2bvgbvglvha7av1.R.inc(16023);if ((((chars[i] == 'e' || chars[i] == 'E')&&(__CLR4_5_2bvgbvglvha7av1.R.iget(16024)!=0|true))||(__CLR4_5_2bvgbvglvha7av1.R.iget(16025)==0&false))) {{
                // can't have an E at the last byte
                __CLR4_5_2bvgbvglvha7av1.R.inc(16026);return false;
            }
            }__CLR4_5_2bvgbvglvha7av1.R.inc(16027);if ((((chars[i] == '.')&&(__CLR4_5_2bvgbvglvha7av1.R.iget(16028)!=0|true))||(__CLR4_5_2bvgbvglvha7av1.R.iget(16029)==0&false))) {{
                __CLR4_5_2bvgbvglvha7av1.R.inc(16030);if ((((hasDecPoint || hasExp)&&(__CLR4_5_2bvgbvglvha7av1.R.iget(16031)!=0|true))||(__CLR4_5_2bvgbvglvha7av1.R.iget(16032)==0&false))) {{
                    // two decimal points or dec in exponent
                    __CLR4_5_2bvgbvglvha7av1.R.inc(16033);return false;
                }
                // single trailing decimal point after non-exponent is ok
                }__CLR4_5_2bvgbvglvha7av1.R.inc(16034);return foundDigit;
            }
            }__CLR4_5_2bvgbvglvha7av1.R.inc(16035);if ((((!allowSigns
                && (chars[i] == 'd'
                    || chars[i] == 'D'
                    || chars[i] == 'f'
                    || chars[i] == 'F'))&&(__CLR4_5_2bvgbvglvha7av1.R.iget(16036)!=0|true))||(__CLR4_5_2bvgbvglvha7av1.R.iget(16037)==0&false))) {{
                __CLR4_5_2bvgbvglvha7av1.R.inc(16038);return foundDigit;
            }
            }__CLR4_5_2bvgbvglvha7av1.R.inc(16039);if ((((chars[i] == 'l'
                || chars[i] == 'L')&&(__CLR4_5_2bvgbvglvha7av1.R.iget(16040)!=0|true))||(__CLR4_5_2bvgbvglvha7av1.R.iget(16041)==0&false))) {{
                // not allowing L with an exponent or decimal point
                __CLR4_5_2bvgbvglvha7av1.R.inc(16042);return foundDigit && !hasExp && !hasDecPoint;
            }
            // last character is illegal
            }__CLR4_5_2bvgbvglvha7av1.R.inc(16043);return false;
        }
        // allowSigns is true iff the val ends in 'E'
        // found digit it to make sure weird stuff like '.' and '1E-' doesn't pass
        }__CLR4_5_2bvgbvglvha7av1.R.inc(16044);return !allowSigns && foundDigit;
    }finally{__CLR4_5_2bvgbvglvha7av1.R.flushNeeded();}}
    
    /**
     * <p>Checks whether the given String is a parsable number.</p>
     *
     * <p>Parsable numbers include those Strings understood by {@link Integer#parseInt(String)},
     * {@link Long#parseLong(String)}, {@link Float#parseFloat(String)} or
     * {@link Double#parseDouble(String)}. This method can be used instead of catching {@link java.text.ParseException}
     * when calling one of those methods.</p>
     *
     * <p>Hexadecimal and scientific notations are <strong>not</strong> considered parsable.
     * See {@link #isCreatable(String)} on those cases.</p>
     *
     * <p>{@code Null} and empty String will return <code>false</code>.</p>
     *
     * @param str the String to check.
     * @return {@code true} if the string is a parsable number.
     * @since 3.4
     */
    public static boolean isParsable(final String str) {try{__CLR4_5_2bvgbvglvha7av1.R.inc(16045);
        __CLR4_5_2bvgbvglvha7av1.R.inc(16046);if ((((StringUtils.isEmpty(str))&&(__CLR4_5_2bvgbvglvha7av1.R.iget(16047)!=0|true))||(__CLR4_5_2bvgbvglvha7av1.R.iget(16048)==0&false))) {{
            __CLR4_5_2bvgbvglvha7av1.R.inc(16049);return false;
        }
        }__CLR4_5_2bvgbvglvha7av1.R.inc(16050);if ((((str.charAt(str.length() - 1) == '.')&&(__CLR4_5_2bvgbvglvha7av1.R.iget(16051)!=0|true))||(__CLR4_5_2bvgbvglvha7av1.R.iget(16052)==0&false))) {{
            __CLR4_5_2bvgbvglvha7av1.R.inc(16053);return false;
        }
        }__CLR4_5_2bvgbvglvha7av1.R.inc(16054);if ((((str.charAt(0) == '-')&&(__CLR4_5_2bvgbvglvha7av1.R.iget(16055)!=0|true))||(__CLR4_5_2bvgbvglvha7av1.R.iget(16056)==0&false))) {{
            __CLR4_5_2bvgbvglvha7av1.R.inc(16057);if ((((str.length() == 1)&&(__CLR4_5_2bvgbvglvha7av1.R.iget(16058)!=0|true))||(__CLR4_5_2bvgbvglvha7av1.R.iget(16059)==0&false))) {{
                __CLR4_5_2bvgbvglvha7av1.R.inc(16060);return false;
            }
            }__CLR4_5_2bvgbvglvha7av1.R.inc(16061);return withDecimalsParsing(str, 1);
        } }else {{
            __CLR4_5_2bvgbvglvha7av1.R.inc(16062);return withDecimalsParsing(str, 0);
        }
    }}finally{__CLR4_5_2bvgbvglvha7av1.R.flushNeeded();}}

    private static boolean withDecimalsParsing(final String str, final int beginIdx) {try{__CLR4_5_2bvgbvglvha7av1.R.inc(16063);
        __CLR4_5_2bvgbvglvha7av1.R.inc(16064);int decimalPoints = 0;
        __CLR4_5_2bvgbvglvha7av1.R.inc(16065);for (int i = beginIdx; (((i < str.length())&&(__CLR4_5_2bvgbvglvha7av1.R.iget(16066)!=0|true))||(__CLR4_5_2bvgbvglvha7av1.R.iget(16067)==0&false)); i++) {{
            __CLR4_5_2bvgbvglvha7av1.R.inc(16068);final boolean isDecimalPoint = str.charAt(i) == '.';
            __CLR4_5_2bvgbvglvha7av1.R.inc(16069);if ((((isDecimalPoint)&&(__CLR4_5_2bvgbvglvha7av1.R.iget(16070)!=0|true))||(__CLR4_5_2bvgbvglvha7av1.R.iget(16071)==0&false))) {{
                __CLR4_5_2bvgbvglvha7av1.R.inc(16072);decimalPoints++;
            }
            }__CLR4_5_2bvgbvglvha7av1.R.inc(16073);if ((((decimalPoints > 1)&&(__CLR4_5_2bvgbvglvha7av1.R.iget(16074)!=0|true))||(__CLR4_5_2bvgbvglvha7av1.R.iget(16075)==0&false))) {{
                __CLR4_5_2bvgbvglvha7av1.R.inc(16076);return false;
            }
            }__CLR4_5_2bvgbvglvha7av1.R.inc(16077);if ((((!isDecimalPoint && !Character.isDigit(str.charAt(i)))&&(__CLR4_5_2bvgbvglvha7av1.R.iget(16078)!=0|true))||(__CLR4_5_2bvgbvglvha7av1.R.iget(16079)==0&false))) {{
                __CLR4_5_2bvgbvglvha7av1.R.inc(16080);return false;
            }
        }}
        }__CLR4_5_2bvgbvglvha7av1.R.inc(16081);return true;
    }finally{__CLR4_5_2bvgbvglvha7av1.R.flushNeeded();}}

    /**
     * <p>Compares two {@code int} values numerically. This is the same functionality as provided in Java 7.</p>
     *
     * @param x the first {@code int} to compare
     * @param y the second {@code int} to compare
     * @return the value {@code 0} if {@code x == y};
     *         a value less than {@code 0} if {@code x < y}; and
     *         a value greater than {@code 0} if {@code x > y}
     * @since 3.4
     */
    public static int compare(final int x, final int y) {try{__CLR4_5_2bvgbvglvha7av1.R.inc(16082);
        __CLR4_5_2bvgbvglvha7av1.R.inc(16083);if ((((x == y)&&(__CLR4_5_2bvgbvglvha7av1.R.iget(16084)!=0|true))||(__CLR4_5_2bvgbvglvha7av1.R.iget(16085)==0&false))) {{
            __CLR4_5_2bvgbvglvha7av1.R.inc(16086);return 0;
        }
        }__CLR4_5_2bvgbvglvha7av1.R.inc(16087);return (((x < y )&&(__CLR4_5_2bvgbvglvha7av1.R.iget(16088)!=0|true))||(__CLR4_5_2bvgbvglvha7av1.R.iget(16089)==0&false))? -1 : 1;
    }finally{__CLR4_5_2bvgbvglvha7av1.R.flushNeeded();}}

    /**
     * <p>Compares to {@code long} values numerically. This is the same functionality as provided in Java 7.</p>
     *
     * @param x the first {@code long} to compare
     * @param y the second {@code long} to compare
     * @return the value {@code 0} if {@code x == y};
     *         a value less than {@code 0} if {@code x < y}; and
     *         a value greater than {@code 0} if {@code x > y}
     * @since 3.4
     */
    public static int compare(final long x, final long y) {try{__CLR4_5_2bvgbvglvha7av1.R.inc(16090);
        __CLR4_5_2bvgbvglvha7av1.R.inc(16091);if ((((x == y)&&(__CLR4_5_2bvgbvglvha7av1.R.iget(16092)!=0|true))||(__CLR4_5_2bvgbvglvha7av1.R.iget(16093)==0&false))) {{
            __CLR4_5_2bvgbvglvha7av1.R.inc(16094);return 0;
        }
        }__CLR4_5_2bvgbvglvha7av1.R.inc(16095);return (((x < y )&&(__CLR4_5_2bvgbvglvha7av1.R.iget(16096)!=0|true))||(__CLR4_5_2bvgbvglvha7av1.R.iget(16097)==0&false))? -1 : 1;
    }finally{__CLR4_5_2bvgbvglvha7av1.R.flushNeeded();}}

    /**
     * <p>Compares to {@code short} values numerically. This is the same functionality as provided in Java 7.</p>
     *
     * @param x the first {@code short} to compare
     * @param y the second {@code short} to compare
     * @return the value {@code 0} if {@code x == y};
     *         a value less than {@code 0} if {@code x < y}; and
     *         a value greater than {@code 0} if {@code x > y}
     * @since 3.4
     */
    public static int compare(final short x, final short y) {try{__CLR4_5_2bvgbvglvha7av1.R.inc(16098);
        __CLR4_5_2bvgbvglvha7av1.R.inc(16099);if ((((x == y)&&(__CLR4_5_2bvgbvglvha7av1.R.iget(16100)!=0|true))||(__CLR4_5_2bvgbvglvha7av1.R.iget(16101)==0&false))) {{
            __CLR4_5_2bvgbvglvha7av1.R.inc(16102);return 0;
        }
        }__CLR4_5_2bvgbvglvha7av1.R.inc(16103);return (((x < y )&&(__CLR4_5_2bvgbvglvha7av1.R.iget(16104)!=0|true))||(__CLR4_5_2bvgbvglvha7av1.R.iget(16105)==0&false))? -1 : 1;
    }finally{__CLR4_5_2bvgbvglvha7av1.R.flushNeeded();}}

    /**
     * <p>Compares two {@code byte} values numerically. This is the same functionality as provided in Java 7.</p>
     *
     * @param x the first {@code byte} to compare
     * @param y the second {@code byte} to compare
     * @return the value {@code 0} if {@code x == y};
     *         a value less than {@code 0} if {@code x < y}; and
     *         a value greater than {@code 0} if {@code x > y}
     * @since 3.4
     */
    public static int compare(final byte x, final byte y) {try{__CLR4_5_2bvgbvglvha7av1.R.inc(16106);
        __CLR4_5_2bvgbvglvha7av1.R.inc(16107);return x - y;
    }finally{__CLR4_5_2bvgbvglvha7av1.R.flushNeeded();}}
}
