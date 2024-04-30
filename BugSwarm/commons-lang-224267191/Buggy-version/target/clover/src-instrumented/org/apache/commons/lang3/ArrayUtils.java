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

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.apache.commons.lang3.math.NumberUtils;
import org.apache.commons.lang3.mutable.MutableInt;

/**
 * <p>Operations on arrays, primitive arrays (like {@code int[]}) and
 * primitive wrapper arrays (like {@code Integer[]}).
 *
 * <p>This class tries to handle {@code null} input gracefully.
 * An exception will not be thrown for a {@code null}
 * array input. However, an Object array that contains a {@code null}
 * element may throw an exception. Each method documents its behaviour.
 *
 * <p>#ThreadSafe#
 * @since 2.0
 */
public class ArrayUtils {public static class __CLR4_5_27070lvha78c4{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172755542L,8589935092L,3799,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * An empty immutable {@code Object} array.
     */
    public static final Object[] EMPTY_OBJECT_ARRAY = new Object[0];
    /**
     * An empty immutable {@code Class} array.
     */
    public static final Class<?>[] EMPTY_CLASS_ARRAY = new Class[0];
    /**
     * An empty immutable {@code String} array.
     */
    public static final String[] EMPTY_STRING_ARRAY = new String[0];
    /**
     * An empty immutable {@code long} array.
     */
    public static final long[] EMPTY_LONG_ARRAY = new long[0];
    /**
     * An empty immutable {@code Long} array.
     */
    public static final Long[] EMPTY_LONG_OBJECT_ARRAY = new Long[0];
    /**
     * An empty immutable {@code int} array.
     */
    public static final int[] EMPTY_INT_ARRAY = new int[0];
    /**
     * An empty immutable {@code Integer} array.
     */
    public static final Integer[] EMPTY_INTEGER_OBJECT_ARRAY = new Integer[0];
    /**
     * An empty immutable {@code short} array.
     */
    public static final short[] EMPTY_SHORT_ARRAY = new short[0];
    /**
     * An empty immutable {@code Short} array.
     */
    public static final Short[] EMPTY_SHORT_OBJECT_ARRAY = new Short[0];
    /**
     * An empty immutable {@code byte} array.
     */
    public static final byte[] EMPTY_BYTE_ARRAY = new byte[0];
    /**
     * An empty immutable {@code Byte} array.
     */
    public static final Byte[] EMPTY_BYTE_OBJECT_ARRAY = new Byte[0];
    /**
     * An empty immutable {@code double} array.
     */
    public static final double[] EMPTY_DOUBLE_ARRAY = new double[0];
    /**
     * An empty immutable {@code Double} array.
     */
    public static final Double[] EMPTY_DOUBLE_OBJECT_ARRAY = new Double[0];
    /**
     * An empty immutable {@code float} array.
     */
    public static final float[] EMPTY_FLOAT_ARRAY = new float[0];
    /**
     * An empty immutable {@code Float} array.
     */
    public static final Float[] EMPTY_FLOAT_OBJECT_ARRAY = new Float[0];
    /**
     * An empty immutable {@code boolean} array.
     */
    public static final boolean[] EMPTY_BOOLEAN_ARRAY = new boolean[0];
    /**
     * An empty immutable {@code Boolean} array.
     */
    public static final Boolean[] EMPTY_BOOLEAN_OBJECT_ARRAY = new Boolean[0];
    /**
     * An empty immutable {@code char} array.
     */
    public static final char[] EMPTY_CHAR_ARRAY = new char[0];
    /**
     * An empty immutable {@code Character} array.
     */
    public static final Character[] EMPTY_CHARACTER_OBJECT_ARRAY = new Character[0];

    /**
     * The index value when an element is not found in a list or array: {@code -1}.
     * This value is returned by methods in this class and can also be used in comparisons with values returned by
     * various method from {@link java.util.List}.
     */
    public static final int INDEX_NOT_FOUND = -1;

    /**
     * <p>ArrayUtils instances should NOT be constructed in standard programming.
     * Instead, the class should be used as <code>ArrayUtils.clone(new int[] {2})</code>.
     *
     * <p>This constructor is public to permit tools that require a JavaBean instance
     * to operate.
     */
    public ArrayUtils() {
      super();__CLR4_5_27070lvha78c4.R.inc(253);try{__CLR4_5_27070lvha78c4.R.inc(252);
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}


    // NOTE: Cannot use {@code} to enclose text which includes {}, but <code></code> is OK


    // Basic methods handling multi-dimensional arrays
    //-----------------------------------------------------------------------
    /**
     * <p>Outputs an array as a String, treating {@code null} as an empty array.
     *
     * <p>Multi-dimensional arrays are handled correctly, including
     * multi-dimensional primitive arrays.
     *
     * <p>The format is that of Java source code, for example <code>{a,b}</code>.
     *
     * @param array  the array to get a toString for, may be {@code null}
     * @return a String representation of the array, '{}' if null array input
     */
    public static String toString(final Object array) {try{__CLR4_5_27070lvha78c4.R.inc(254);
        __CLR4_5_27070lvha78c4.R.inc(255);return toString(array, "{}");
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Outputs an array as a String handling {@code null}s.
     *
     * <p>Multi-dimensional arrays are handled correctly, including
     * multi-dimensional primitive arrays.
     *
     * <p>The format is that of Java source code, for example <code>{a,b}</code>.
     *
     * @param array  the array to get a toString for, may be {@code null}
     * @param stringIfNull  the String to return if the array is {@code null}
     * @return a String representation of the array
     */
    public static String toString(final Object array, final String stringIfNull) {try{__CLR4_5_27070lvha78c4.R.inc(256);
        __CLR4_5_27070lvha78c4.R.inc(257);if ((((array == null)&&(__CLR4_5_27070lvha78c4.R.iget(258)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(259)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(260);return stringIfNull;
        }
        }__CLR4_5_27070lvha78c4.R.inc(261);return new ToStringBuilder(array, ToStringStyle.SIMPLE_STYLE).append(array).toString();
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Get a hash code for an array handling multi-dimensional arrays correctly.
     *
     * <p>Multi-dimensional primitive arrays are also handled correctly by this method.
     *
     * @param array  the array to get a hash code for, {@code null} returns zero
     * @return a hash code for the array
     */
    public static int hashCode(final Object array) {try{__CLR4_5_27070lvha78c4.R.inc(262);
        __CLR4_5_27070lvha78c4.R.inc(263);return new HashCodeBuilder().append(array).toHashCode();
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Compares two arrays, using equals(), handling multi-dimensional arrays
     * correctly.
     *
     * <p>Multi-dimensional primitive arrays are also handled correctly by this method.
     *
     * @param array1  the left hand array to compare, may be {@code null}
     * @param array2  the right hand array to compare, may be {@code null}
     * @return {@code true} if the arrays are equal
     * @deprecated this method has been replaced by {@code java.util.Objects.deepEquals(Object, Object)} and will be
     * removed from future releases.
     */
    @Deprecated
    public static boolean isEquals(final Object array1, final Object array2) {try{__CLR4_5_27070lvha78c4.R.inc(264);
        __CLR4_5_27070lvha78c4.R.inc(265);return new EqualsBuilder().append(array1, array2).isEquals();
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    // To map
    //-----------------------------------------------------------------------
    /**
     * <p>Converts the given array into a {@link java.util.Map}. Each element of the array
     * must be either a {@link java.util.Map.Entry} or an Array, containing at least two
     * elements, where the first element is used as key and the second as
     * value.
     *
     * <p>This method can be used to initialize:
     * <pre>
     * // Create a Map mapping colors.
     * Map colorMap = ArrayUtils.toMap(new String[][] {
     *     {"RED", "#FF0000"},
     *     {"GREEN", "#00FF00"},
     *     {"BLUE", "#0000FF"}});
     * </pre>
     *
     * <p>This method returns {@code null} for a {@code null} input array.
     *
     * @param array  an array whose elements are either a {@link java.util.Map.Entry} or
     *  an Array containing at least two elements, may be {@code null}
     * @return a {@code Map} that was created from the array
     * @throws IllegalArgumentException  if one element of this Array is
     *  itself an Array containing less then two elements
     * @throws IllegalArgumentException  if the array contains elements other
     *  than {@link java.util.Map.Entry} and an Array
     */
    public static Map<Object, Object> toMap(final Object[] array) {try{__CLR4_5_27070lvha78c4.R.inc(266);
        __CLR4_5_27070lvha78c4.R.inc(267);if ((((array == null)&&(__CLR4_5_27070lvha78c4.R.iget(268)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(269)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(270);return null;
        }
        }__CLR4_5_27070lvha78c4.R.inc(271);final Map<Object, Object> map = new HashMap<>((int) (array.length * 1.5));
        __CLR4_5_27070lvha78c4.R.inc(272);for (int i = 0; (((i < array.length)&&(__CLR4_5_27070lvha78c4.R.iget(273)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(274)==0&false)); i++) {{
            __CLR4_5_27070lvha78c4.R.inc(275);final Object object = array[i];
            __CLR4_5_27070lvha78c4.R.inc(276);if ((((object instanceof Map.Entry<?, ?>)&&(__CLR4_5_27070lvha78c4.R.iget(277)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(278)==0&false))) {{
                __CLR4_5_27070lvha78c4.R.inc(279);final Map.Entry<?,?> entry = (Map.Entry<?,?>) object;
                __CLR4_5_27070lvha78c4.R.inc(280);map.put(entry.getKey(), entry.getValue());
            } }else {__CLR4_5_27070lvha78c4.R.inc(281);if ((((object instanceof Object[])&&(__CLR4_5_27070lvha78c4.R.iget(282)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(283)==0&false))) {{
                __CLR4_5_27070lvha78c4.R.inc(284);final Object[] entry = (Object[]) object;
                __CLR4_5_27070lvha78c4.R.inc(285);if ((((entry.length < 2)&&(__CLR4_5_27070lvha78c4.R.iget(286)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(287)==0&false))) {{
                    __CLR4_5_27070lvha78c4.R.inc(288);throw new IllegalArgumentException("Array element " + i + ", '"
                        + object
                        + "', has a length less than 2");
                }
                }__CLR4_5_27070lvha78c4.R.inc(289);map.put(entry[0], entry[1]);
            } }else {{
                __CLR4_5_27070lvha78c4.R.inc(290);throw new IllegalArgumentException("Array element " + i + ", '"
                        + object
                        + "', is neither of type Map.Entry nor an Array");
            }
        }}}
        }__CLR4_5_27070lvha78c4.R.inc(291);return map;
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    // Generic array
    //-----------------------------------------------------------------------
    /**
     * <p>Create a type-safe generic array.
     *
     * <p>The Java language does not allow an array to be created from a generic type:
     *
     * <pre>
    public static &lt;T&gt; T[] createAnArray(int size) {
        return new T[size]; // compiler error here
    }
    public static &lt;T&gt; T[] createAnArray(int size) {
        return (T[])new Object[size]; // ClassCastException at runtime
    }
     * </pre>
     *
     * <p>Therefore new arrays of generic types can be created with this method.
     * For example, an array of Strings can be created:
     *
     * <pre>
    String[] array = ArrayUtils.toArray("1", "2");
    String[] emptyArray = ArrayUtils.&lt;String&gt;toArray();
     * </pre>
     *
     * <p>The method is typically used in scenarios, where the caller itself uses generic types
     * that have to be combined into an array.
     *
     * <p>Note, this method makes only sense to provide arguments of the same type so that the
     * compiler can deduce the type of the array itself. While it is possible to select the
     * type explicitly like in
     * <code>Number[] array = ArrayUtils.&lt;Number&gt;toArray(Integer.valueOf(42), Double.valueOf(Math.PI))</code>,
     * there is no real advantage when compared to
     * <code>new Number[] {Integer.valueOf(42), Double.valueOf(Math.PI)}</code>.
     *
     * @param  <T>   the array's element type
     * @param  items  the varargs array items, null allowed
     * @return the array, not null unless a null array is passed in
     * @since  3.0
     */
    public static <T> T[] toArray(final T... items) {try{__CLR4_5_27070lvha78c4.R.inc(292);
        __CLR4_5_27070lvha78c4.R.inc(293);return items;
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    // Clone
    //-----------------------------------------------------------------------
    /**
     * <p>Shallow clones an array returning a typecast result and handling
     * {@code null}.
     *
     * <p>The objects in the array are not cloned, thus there is no special
     * handling for multi-dimensional arrays.
     *
     * <p>This method returns {@code null} for a {@code null} input array.
     *
     * @param <T> the component type of the array
     * @param array  the array to shallow clone, may be {@code null}
     * @return the cloned array, {@code null} if {@code null} input
     */
    public static <T> T[] clone(final T[] array) {try{__CLR4_5_27070lvha78c4.R.inc(294);
        __CLR4_5_27070lvha78c4.R.inc(295);if ((((array == null)&&(__CLR4_5_27070lvha78c4.R.iget(296)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(297)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(298);return null;
        }
        }__CLR4_5_27070lvha78c4.R.inc(299);return array.clone();
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Clones an array returning a typecast result and handling
     * {@code null}.
     *
     * <p>This method returns {@code null} for a {@code null} input array.
     *
     * @param array  the array to clone, may be {@code null}
     * @return the cloned array, {@code null} if {@code null} input
     */
    public static long[] clone(final long[] array) {try{__CLR4_5_27070lvha78c4.R.inc(300);
        __CLR4_5_27070lvha78c4.R.inc(301);if ((((array == null)&&(__CLR4_5_27070lvha78c4.R.iget(302)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(303)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(304);return null;
        }
        }__CLR4_5_27070lvha78c4.R.inc(305);return array.clone();
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Clones an array returning a typecast result and handling
     * {@code null}.
     *
     * <p>This method returns {@code null} for a {@code null} input array.
     *
     * @param array  the array to clone, may be {@code null}
     * @return the cloned array, {@code null} if {@code null} input
     */
    public static int[] clone(final int[] array) {try{__CLR4_5_27070lvha78c4.R.inc(306);
        __CLR4_5_27070lvha78c4.R.inc(307);if ((((array == null)&&(__CLR4_5_27070lvha78c4.R.iget(308)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(309)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(310);return null;
        }
        }__CLR4_5_27070lvha78c4.R.inc(311);return array.clone();
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Clones an array returning a typecast result and handling
     * {@code null}.
     *
     * <p>This method returns {@code null} for a {@code null} input array.
     *
     * @param array  the array to clone, may be {@code null}
     * @return the cloned array, {@code null} if {@code null} input
     */
    public static short[] clone(final short[] array) {try{__CLR4_5_27070lvha78c4.R.inc(312);
        __CLR4_5_27070lvha78c4.R.inc(313);if ((((array == null)&&(__CLR4_5_27070lvha78c4.R.iget(314)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(315)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(316);return null;
        }
        }__CLR4_5_27070lvha78c4.R.inc(317);return array.clone();
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Clones an array returning a typecast result and handling
     * {@code null}.
     *
     * <p>This method returns {@code null} for a {@code null} input array.
     *
     * @param array  the array to clone, may be {@code null}
     * @return the cloned array, {@code null} if {@code null} input
     */
    public static char[] clone(final char[] array) {try{__CLR4_5_27070lvha78c4.R.inc(318);
        __CLR4_5_27070lvha78c4.R.inc(319);if ((((array == null)&&(__CLR4_5_27070lvha78c4.R.iget(320)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(321)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(322);return null;
        }
        }__CLR4_5_27070lvha78c4.R.inc(323);return array.clone();
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Clones an array returning a typecast result and handling
     * {@code null}.
     *
     * <p>This method returns {@code null} for a {@code null} input array.
     *
     * @param array  the array to clone, may be {@code null}
     * @return the cloned array, {@code null} if {@code null} input
     */
    public static byte[] clone(final byte[] array) {try{__CLR4_5_27070lvha78c4.R.inc(324);
        __CLR4_5_27070lvha78c4.R.inc(325);if ((((array == null)&&(__CLR4_5_27070lvha78c4.R.iget(326)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(327)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(328);return null;
        }
        }__CLR4_5_27070lvha78c4.R.inc(329);return array.clone();
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Clones an array returning a typecast result and handling
     * {@code null}.
     *
     * <p>This method returns {@code null} for a {@code null} input array.
     *
     * @param array  the array to clone, may be {@code null}
     * @return the cloned array, {@code null} if {@code null} input
     */
    public static double[] clone(final double[] array) {try{__CLR4_5_27070lvha78c4.R.inc(330);
        __CLR4_5_27070lvha78c4.R.inc(331);if ((((array == null)&&(__CLR4_5_27070lvha78c4.R.iget(332)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(333)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(334);return null;
        }
        }__CLR4_5_27070lvha78c4.R.inc(335);return array.clone();
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Clones an array returning a typecast result and handling
     * {@code null}.
     *
     * <p>This method returns {@code null} for a {@code null} input array.
     *
     * @param array  the array to clone, may be {@code null}
     * @return the cloned array, {@code null} if {@code null} input
     */
    public static float[] clone(final float[] array) {try{__CLR4_5_27070lvha78c4.R.inc(336);
        __CLR4_5_27070lvha78c4.R.inc(337);if ((((array == null)&&(__CLR4_5_27070lvha78c4.R.iget(338)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(339)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(340);return null;
        }
        }__CLR4_5_27070lvha78c4.R.inc(341);return array.clone();
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Clones an array returning a typecast result and handling
     * {@code null}.
     *
     * <p>This method returns {@code null} for a {@code null} input array.
     *
     * @param array  the array to clone, may be {@code null}
     * @return the cloned array, {@code null} if {@code null} input
     */
    public static boolean[] clone(final boolean[] array) {try{__CLR4_5_27070lvha78c4.R.inc(342);
        __CLR4_5_27070lvha78c4.R.inc(343);if ((((array == null)&&(__CLR4_5_27070lvha78c4.R.iget(344)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(345)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(346);return null;
        }
        }__CLR4_5_27070lvha78c4.R.inc(347);return array.clone();
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    // nullToEmpty
    //-----------------------------------------------------------------------
    /**
     * <p>Defensive programming technique to change a {@code null}
     * reference to an empty one.
     *
     * <p>This method returns an empty array for a {@code null} input array.
     *
     * @param array  the array to check for {@code null} or empty
     * @param type   the class representation of the desired array
     * @param <T>  the class type
     * @return the same array, {@code public static} empty array if {@code null}
     * @throws IllegalArgumentException if the type argument is null
     * @since 3.5
     */
    public static <T> T[] nullToEmpty(final T[] array, final Class<T[]> type) {try{__CLR4_5_27070lvha78c4.R.inc(348);
        __CLR4_5_27070lvha78c4.R.inc(349);if ((((type == null)&&(__CLR4_5_27070lvha78c4.R.iget(350)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(351)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(352);throw new IllegalArgumentException("The type must not be null");
        }

        }__CLR4_5_27070lvha78c4.R.inc(353);if ((((array == null)&&(__CLR4_5_27070lvha78c4.R.iget(354)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(355)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(356);return type.cast(Array.newInstance(type.getComponentType(), 0));
        }
        }__CLR4_5_27070lvha78c4.R.inc(357);return array;
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}    
    
    
    /**
     * <p>Defensive programming technique to change a {@code null}
     * reference to an empty one.
     *
     * <p>This method returns an empty array for a {@code null} input array.
     *
     * <p>As a memory optimizing technique an empty array passed in will be overridden with
     * the empty {@code public static} references in this class.
     *
     * @param array  the array to check for {@code null} or empty
     * @return the same array, {@code public static} empty array if {@code null} or empty input
     * @since 2.5
     */
    public static Object[] nullToEmpty(final Object[] array) {try{__CLR4_5_27070lvha78c4.R.inc(358);
        __CLR4_5_27070lvha78c4.R.inc(359);if ((((isEmpty(array))&&(__CLR4_5_27070lvha78c4.R.iget(360)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(361)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(362);return EMPTY_OBJECT_ARRAY;
        }
        }__CLR4_5_27070lvha78c4.R.inc(363);return array;
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Defensive programming technique to change a {@code null}
     * reference to an empty one.
     *
     * <p>This method returns an empty array for a {@code null} input array.
     *
     * <p>As a memory optimizing technique an empty array passed in will be overridden with
     * the empty {@code public static} references in this class.
     *
     * @param array  the array to check for {@code null} or empty
     * @return the same array, {@code public static} empty array if {@code null} or empty input
     * @since 3.2
     */
    public static Class<?>[] nullToEmpty(final Class<?>[] array) {try{__CLR4_5_27070lvha78c4.R.inc(364);
        __CLR4_5_27070lvha78c4.R.inc(365);if ((((isEmpty(array))&&(__CLR4_5_27070lvha78c4.R.iget(366)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(367)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(368);return EMPTY_CLASS_ARRAY;
        }
        }__CLR4_5_27070lvha78c4.R.inc(369);return array;
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Defensive programming technique to change a {@code null}
     * reference to an empty one.
     *
     * <p>This method returns an empty array for a {@code null} input array.
     *
     * <p>As a memory optimizing technique an empty array passed in will be overridden with
     * the empty {@code public static} references in this class.
     *
     * @param array  the array to check for {@code null} or empty
     * @return the same array, {@code public static} empty array if {@code null} or empty input
     * @since 2.5
     */
    public static String[] nullToEmpty(final String[] array) {try{__CLR4_5_27070lvha78c4.R.inc(370);
        __CLR4_5_27070lvha78c4.R.inc(371);if ((((isEmpty(array))&&(__CLR4_5_27070lvha78c4.R.iget(372)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(373)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(374);return EMPTY_STRING_ARRAY;
        }
        }__CLR4_5_27070lvha78c4.R.inc(375);return array;
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Defensive programming technique to change a {@code null}
     * reference to an empty one.
     *
     * <p>This method returns an empty array for a {@code null} input array.
     *
     * <p>As a memory optimizing technique an empty array passed in will be overridden with
     * the empty {@code public static} references in this class.
     *
     * @param array  the array to check for {@code null} or empty
     * @return the same array, {@code public static} empty array if {@code null} or empty input
     * @since 2.5
     */
    public static long[] nullToEmpty(final long[] array) {try{__CLR4_5_27070lvha78c4.R.inc(376);
        __CLR4_5_27070lvha78c4.R.inc(377);if ((((isEmpty(array))&&(__CLR4_5_27070lvha78c4.R.iget(378)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(379)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(380);return EMPTY_LONG_ARRAY;
        }
        }__CLR4_5_27070lvha78c4.R.inc(381);return array;
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Defensive programming technique to change a {@code null}
     * reference to an empty one.
     *
     * <p>This method returns an empty array for a {@code null} input array.
     *
     * <p>As a memory optimizing technique an empty array passed in will be overridden with
     * the empty {@code public static} references in this class.
     *
     * @param array  the array to check for {@code null} or empty
     * @return the same array, {@code public static} empty array if {@code null} or empty input
     * @since 2.5
     */
    public static int[] nullToEmpty(final int[] array) {try{__CLR4_5_27070lvha78c4.R.inc(382);
        __CLR4_5_27070lvha78c4.R.inc(383);if ((((isEmpty(array))&&(__CLR4_5_27070lvha78c4.R.iget(384)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(385)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(386);return EMPTY_INT_ARRAY;
        }
        }__CLR4_5_27070lvha78c4.R.inc(387);return array;
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Defensive programming technique to change a {@code null}
     * reference to an empty one.
     *
     * <p>This method returns an empty array for a {@code null} input array.
     *
     * <p>As a memory optimizing technique an empty array passed in will be overridden with
     * the empty {@code public static} references in this class.
     *
     * @param array  the array to check for {@code null} or empty
     * @return the same array, {@code public static} empty array if {@code null} or empty input
     * @since 2.5
     */
    public static short[] nullToEmpty(final short[] array) {try{__CLR4_5_27070lvha78c4.R.inc(388);
        __CLR4_5_27070lvha78c4.R.inc(389);if ((((isEmpty(array))&&(__CLR4_5_27070lvha78c4.R.iget(390)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(391)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(392);return EMPTY_SHORT_ARRAY;
        }
        }__CLR4_5_27070lvha78c4.R.inc(393);return array;
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Defensive programming technique to change a {@code null}
     * reference to an empty one.
     *
     * <p>This method returns an empty array for a {@code null} input array.
     *
     * <p>As a memory optimizing technique an empty array passed in will be overridden with
     * the empty {@code public static} references in this class.
     *
     * @param array  the array to check for {@code null} or empty
     * @return the same array, {@code public static} empty array if {@code null} or empty input
     * @since 2.5
     */
    public static char[] nullToEmpty(final char[] array) {try{__CLR4_5_27070lvha78c4.R.inc(394);
        __CLR4_5_27070lvha78c4.R.inc(395);if ((((isEmpty(array))&&(__CLR4_5_27070lvha78c4.R.iget(396)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(397)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(398);return EMPTY_CHAR_ARRAY;
        }
        }__CLR4_5_27070lvha78c4.R.inc(399);return array;
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Defensive programming technique to change a {@code null}
     * reference to an empty one.
     *
     * <p>This method returns an empty array for a {@code null} input array.
     *
     * <p>As a memory optimizing technique an empty array passed in will be overridden with
     * the empty {@code public static} references in this class.
     *
     * @param array  the array to check for {@code null} or empty
     * @return the same array, {@code public static} empty array if {@code null} or empty input
     * @since 2.5
     */
    public static byte[] nullToEmpty(final byte[] array) {try{__CLR4_5_27070lvha78c4.R.inc(400);
        __CLR4_5_27070lvha78c4.R.inc(401);if ((((isEmpty(array))&&(__CLR4_5_27070lvha78c4.R.iget(402)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(403)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(404);return EMPTY_BYTE_ARRAY;
        }
        }__CLR4_5_27070lvha78c4.R.inc(405);return array;
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Defensive programming technique to change a {@code null}
     * reference to an empty one.
     *
     * <p>This method returns an empty array for a {@code null} input array.
     *
     * <p>As a memory optimizing technique an empty array passed in will be overridden with
     * the empty {@code public static} references in this class.
     *
     * @param array  the array to check for {@code null} or empty
     * @return the same array, {@code public static} empty array if {@code null} or empty input
     * @since 2.5
     */
    public static double[] nullToEmpty(final double[] array) {try{__CLR4_5_27070lvha78c4.R.inc(406);
        __CLR4_5_27070lvha78c4.R.inc(407);if ((((isEmpty(array))&&(__CLR4_5_27070lvha78c4.R.iget(408)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(409)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(410);return EMPTY_DOUBLE_ARRAY;
        }
        }__CLR4_5_27070lvha78c4.R.inc(411);return array;
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Defensive programming technique to change a {@code null}
     * reference to an empty one.
     *
     * <p>This method returns an empty array for a {@code null} input array.
     *
     * <p>As a memory optimizing technique an empty array passed in will be overridden with
     * the empty {@code public static} references in this class.
     *
     * @param array  the array to check for {@code null} or empty
     * @return the same array, {@code public static} empty array if {@code null} or empty input
     * @since 2.5
     */
    public static float[] nullToEmpty(final float[] array) {try{__CLR4_5_27070lvha78c4.R.inc(412);
        __CLR4_5_27070lvha78c4.R.inc(413);if ((((isEmpty(array))&&(__CLR4_5_27070lvha78c4.R.iget(414)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(415)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(416);return EMPTY_FLOAT_ARRAY;
        }
        }__CLR4_5_27070lvha78c4.R.inc(417);return array;
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Defensive programming technique to change a {@code null}
     * reference to an empty one.
     *
     * <p>This method returns an empty array for a {@code null} input array.
     *
     * <p>As a memory optimizing technique an empty array passed in will be overridden with
     * the empty {@code public static} references in this class.
     *
     * @param array  the array to check for {@code null} or empty
     * @return the same array, {@code public static} empty array if {@code null} or empty input
     * @since 2.5
     */
    public static boolean[] nullToEmpty(final boolean[] array) {try{__CLR4_5_27070lvha78c4.R.inc(418);
        __CLR4_5_27070lvha78c4.R.inc(419);if ((((isEmpty(array))&&(__CLR4_5_27070lvha78c4.R.iget(420)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(421)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(422);return EMPTY_BOOLEAN_ARRAY;
        }
        }__CLR4_5_27070lvha78c4.R.inc(423);return array;
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Defensive programming technique to change a {@code null}
     * reference to an empty one.
     *
     * <p>This method returns an empty array for a {@code null} input array.
     *
     * <p>As a memory optimizing technique an empty array passed in will be overridden with
     * the empty {@code public static} references in this class.
     *
     * @param array  the array to check for {@code null} or empty
     * @return the same array, {@code public static} empty array if {@code null} or empty input
     * @since 2.5
     */
    public static Long[] nullToEmpty(final Long[] array) {try{__CLR4_5_27070lvha78c4.R.inc(424);
        __CLR4_5_27070lvha78c4.R.inc(425);if ((((isEmpty(array))&&(__CLR4_5_27070lvha78c4.R.iget(426)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(427)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(428);return EMPTY_LONG_OBJECT_ARRAY;
        }
        }__CLR4_5_27070lvha78c4.R.inc(429);return array;
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Defensive programming technique to change a {@code null}
     * reference to an empty one.
     *
     * <p>This method returns an empty array for a {@code null} input array.
     *
     * <p>As a memory optimizing technique an empty array passed in will be overridden with
     * the empty {@code public static} references in this class.
     *
     * @param array  the array to check for {@code null} or empty
     * @return the same array, {@code public static} empty array if {@code null} or empty input
     * @since 2.5
     */
    public static Integer[] nullToEmpty(final Integer[] array) {try{__CLR4_5_27070lvha78c4.R.inc(430);
        __CLR4_5_27070lvha78c4.R.inc(431);if ((((isEmpty(array))&&(__CLR4_5_27070lvha78c4.R.iget(432)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(433)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(434);return EMPTY_INTEGER_OBJECT_ARRAY;
        }
        }__CLR4_5_27070lvha78c4.R.inc(435);return array;
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Defensive programming technique to change a {@code null}
     * reference to an empty one.
     *
     * <p>This method returns an empty array for a {@code null} input array.
     *
     * <p>As a memory optimizing technique an empty array passed in will be overridden with
     * the empty {@code public static} references in this class.
     *
     * @param array  the array to check for {@code null} or empty
     * @return the same array, {@code public static} empty array if {@code null} or empty input
     * @since 2.5
     */
    public static Short[] nullToEmpty(final Short[] array) {try{__CLR4_5_27070lvha78c4.R.inc(436);
        __CLR4_5_27070lvha78c4.R.inc(437);if ((((isEmpty(array))&&(__CLR4_5_27070lvha78c4.R.iget(438)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(439)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(440);return EMPTY_SHORT_OBJECT_ARRAY;
        }
        }__CLR4_5_27070lvha78c4.R.inc(441);return array;
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Defensive programming technique to change a {@code null}
     * reference to an empty one.
     *
     * <p>This method returns an empty array for a {@code null} input array.
     *
     * <p>As a memory optimizing technique an empty array passed in will be overridden with
     * the empty {@code public static} references in this class.
     *
     * @param array  the array to check for {@code null} or empty
     * @return the same array, {@code public static} empty array if {@code null} or empty input
     * @since 2.5
     */
    public static Character[] nullToEmpty(final Character[] array) {try{__CLR4_5_27070lvha78c4.R.inc(442);
        __CLR4_5_27070lvha78c4.R.inc(443);if ((((isEmpty(array))&&(__CLR4_5_27070lvha78c4.R.iget(444)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(445)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(446);return EMPTY_CHARACTER_OBJECT_ARRAY;
        }
        }__CLR4_5_27070lvha78c4.R.inc(447);return array;
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Defensive programming technique to change a {@code null}
     * reference to an empty one.
     *
     * <p>This method returns an empty array for a {@code null} input array.
     *
     * <p>As a memory optimizing technique an empty array passed in will be overridden with
     * the empty {@code public static} references in this class.
     *
     * @param array  the array to check for {@code null} or empty
     * @return the same array, {@code public static} empty array if {@code null} or empty input
     * @since 2.5
     */
    public static Byte[] nullToEmpty(final Byte[] array) {try{__CLR4_5_27070lvha78c4.R.inc(448);
        __CLR4_5_27070lvha78c4.R.inc(449);if ((((isEmpty(array))&&(__CLR4_5_27070lvha78c4.R.iget(450)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(451)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(452);return EMPTY_BYTE_OBJECT_ARRAY;
        }
        }__CLR4_5_27070lvha78c4.R.inc(453);return array;
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Defensive programming technique to change a {@code null}
     * reference to an empty one.
     *
     * <p>This method returns an empty array for a {@code null} input array.
     *
     * <p>As a memory optimizing technique an empty array passed in will be overridden with
     * the empty {@code public static} references in this class.
     *
     * @param array  the array to check for {@code null} or empty
     * @return the same array, {@code public static} empty array if {@code null} or empty input
     * @since 2.5
     */
    public static Double[] nullToEmpty(final Double[] array) {try{__CLR4_5_27070lvha78c4.R.inc(454);
        __CLR4_5_27070lvha78c4.R.inc(455);if ((((isEmpty(array))&&(__CLR4_5_27070lvha78c4.R.iget(456)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(457)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(458);return EMPTY_DOUBLE_OBJECT_ARRAY;
        }
        }__CLR4_5_27070lvha78c4.R.inc(459);return array;
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Defensive programming technique to change a {@code null}
     * reference to an empty one.
     *
     * <p>This method returns an empty array for a {@code null} input array.
     *
     * <p>As a memory optimizing technique an empty array passed in will be overridden with
     * the empty {@code public static} references in this class.
     *
     * @param array  the array to check for {@code null} or empty
     * @return the same array, {@code public static} empty array if {@code null} or empty input
     * @since 2.5
     */
    public static Float[] nullToEmpty(final Float[] array) {try{__CLR4_5_27070lvha78c4.R.inc(460);
        __CLR4_5_27070lvha78c4.R.inc(461);if ((((isEmpty(array))&&(__CLR4_5_27070lvha78c4.R.iget(462)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(463)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(464);return EMPTY_FLOAT_OBJECT_ARRAY;
        }
        }__CLR4_5_27070lvha78c4.R.inc(465);return array;
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Defensive programming technique to change a {@code null}
     * reference to an empty one.
     *
     * <p>This method returns an empty array for a {@code null} input array.
     *
     * <p>As a memory optimizing technique an empty array passed in will be overridden with
     * the empty {@code public static} references in this class.
     *
     * @param array  the array to check for {@code null} or empty
     * @return the same array, {@code public static} empty array if {@code null} or empty input
     * @since 2.5
     */
    public static Boolean[] nullToEmpty(final Boolean[] array) {try{__CLR4_5_27070lvha78c4.R.inc(466);
        __CLR4_5_27070lvha78c4.R.inc(467);if ((((isEmpty(array))&&(__CLR4_5_27070lvha78c4.R.iget(468)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(469)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(470);return EMPTY_BOOLEAN_OBJECT_ARRAY;
        }
        }__CLR4_5_27070lvha78c4.R.inc(471);return array;
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    // Subarrays
    //-----------------------------------------------------------------------
    /**
     * <p>Produces a new array containing the elements between
     * the start and end indices.
     *
     * <p>The start index is inclusive, the end index exclusive.
     * Null array input produces null output.
     *
     * <p>The component type of the subarray is always the same as
     * that of the input array. Thus, if the input is an array of type
     * {@code Date}, the following usage is envisaged:
     *
     * <pre>
     * Date[] someDates = (Date[])ArrayUtils.subarray(allDates, 2, 5);
     * </pre>
     *
     * @param <T> the component type of the array
     * @param array  the array
     * @param startIndexInclusive  the starting index. Undervalue (&lt;0)
     *      is promoted to 0, overvalue (&gt;array.length) results
     *      in an empty array.
     * @param endIndexExclusive  elements up to endIndex-1 are present in the
     *      returned subarray. Undervalue (&lt; startIndex) produces
     *      empty array, overvalue (&gt;array.length) is demoted to
     *      array length.
     * @return a new array containing the elements between
     *      the start and end indices.
     * @since 2.1
     * @see Arrays#copyOfRange(Object[], int, int)
     */
    public static <T> T[] subarray(final T[] array, int startIndexInclusive, int endIndexExclusive) {try{__CLR4_5_27070lvha78c4.R.inc(472);
        __CLR4_5_27070lvha78c4.R.inc(473);if ((((array == null)&&(__CLR4_5_27070lvha78c4.R.iget(474)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(475)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(476);return null;
        }
        }__CLR4_5_27070lvha78c4.R.inc(477);if ((((startIndexInclusive < 0)&&(__CLR4_5_27070lvha78c4.R.iget(478)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(479)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(480);startIndexInclusive = 0;
        }
        }__CLR4_5_27070lvha78c4.R.inc(481);if ((((endIndexExclusive > array.length)&&(__CLR4_5_27070lvha78c4.R.iget(482)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(483)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(484);endIndexExclusive = array.length;
        }
        }__CLR4_5_27070lvha78c4.R.inc(485);final int newSize = endIndexExclusive - startIndexInclusive;
        __CLR4_5_27070lvha78c4.R.inc(486);final Class<?> type = array.getClass().getComponentType();
        __CLR4_5_27070lvha78c4.R.inc(487);if ((((newSize <= 0)&&(__CLR4_5_27070lvha78c4.R.iget(488)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(489)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(490);@SuppressWarnings("unchecked") // OK, because array is of type T
            final T[] emptyArray = (T[]) Array.newInstance(type, 0);
            __CLR4_5_27070lvha78c4.R.inc(491);return emptyArray;
        }
        }__CLR4_5_27070lvha78c4.R.inc(492);@SuppressWarnings("unchecked") // OK, because array is of type T
        final
        T[] subarray = (T[]) Array.newInstance(type, newSize);
        __CLR4_5_27070lvha78c4.R.inc(493);System.arraycopy(array, startIndexInclusive, subarray, 0, newSize);
        __CLR4_5_27070lvha78c4.R.inc(494);return subarray;
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Produces a new {@code long} array containing the elements
     * between the start and end indices.
     *
     * <p>The start index is inclusive, the end index exclusive.
     * Null array input produces null output.
     *
     * @param array  the array
     * @param startIndexInclusive  the starting index. Undervalue (&lt;0)
     *      is promoted to 0, overvalue (&gt;array.length) results
     *      in an empty array.
     * @param endIndexExclusive  elements up to endIndex-1 are present in the
     *      returned subarray. Undervalue (&lt; startIndex) produces
     *      empty array, overvalue (&gt;array.length) is demoted to
     *      array length.
     * @return a new array containing the elements between
     *      the start and end indices.
     * @since 2.1
     * @see Arrays#copyOfRange(long[], int, int)
     */
    public static long[] subarray(final long[] array, int startIndexInclusive, int endIndexExclusive) {try{__CLR4_5_27070lvha78c4.R.inc(495);
        __CLR4_5_27070lvha78c4.R.inc(496);if ((((array == null)&&(__CLR4_5_27070lvha78c4.R.iget(497)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(498)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(499);return null;
        }
        }__CLR4_5_27070lvha78c4.R.inc(500);if ((((startIndexInclusive < 0)&&(__CLR4_5_27070lvha78c4.R.iget(501)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(502)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(503);startIndexInclusive = 0;
        }
        }__CLR4_5_27070lvha78c4.R.inc(504);if ((((endIndexExclusive > array.length)&&(__CLR4_5_27070lvha78c4.R.iget(505)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(506)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(507);endIndexExclusive = array.length;
        }
        }__CLR4_5_27070lvha78c4.R.inc(508);final int newSize = endIndexExclusive - startIndexInclusive;
        __CLR4_5_27070lvha78c4.R.inc(509);if ((((newSize <= 0)&&(__CLR4_5_27070lvha78c4.R.iget(510)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(511)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(512);return EMPTY_LONG_ARRAY;
        }

        }__CLR4_5_27070lvha78c4.R.inc(513);final long[] subarray = new long[newSize];
        __CLR4_5_27070lvha78c4.R.inc(514);System.arraycopy(array, startIndexInclusive, subarray, 0, newSize);
        __CLR4_5_27070lvha78c4.R.inc(515);return subarray;
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Produces a new {@code int} array containing the elements
     * between the start and end indices.
     *
     * <p>The start index is inclusive, the end index exclusive.
     * Null array input produces null output.
     *
     * @param array  the array
     * @param startIndexInclusive  the starting index. Undervalue (&lt;0)
     *      is promoted to 0, overvalue (&gt;array.length) results
     *      in an empty array.
     * @param endIndexExclusive  elements up to endIndex-1 are present in the
     *      returned subarray. Undervalue (&lt; startIndex) produces
     *      empty array, overvalue (&gt;array.length) is demoted to
     *      array length.
     * @return a new array containing the elements between
     *      the start and end indices.
     * @since 2.1
     * @see Arrays#copyOfRange(int[], int, int)
     */
    public static int[] subarray(final int[] array, int startIndexInclusive, int endIndexExclusive) {try{__CLR4_5_27070lvha78c4.R.inc(516);
        __CLR4_5_27070lvha78c4.R.inc(517);if ((((array == null)&&(__CLR4_5_27070lvha78c4.R.iget(518)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(519)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(520);return null;
        }
        }__CLR4_5_27070lvha78c4.R.inc(521);if ((((startIndexInclusive < 0)&&(__CLR4_5_27070lvha78c4.R.iget(522)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(523)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(524);startIndexInclusive = 0;
        }
        }__CLR4_5_27070lvha78c4.R.inc(525);if ((((endIndexExclusive > array.length)&&(__CLR4_5_27070lvha78c4.R.iget(526)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(527)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(528);endIndexExclusive = array.length;
        }
        }__CLR4_5_27070lvha78c4.R.inc(529);final int newSize = endIndexExclusive - startIndexInclusive;
        __CLR4_5_27070lvha78c4.R.inc(530);if ((((newSize <= 0)&&(__CLR4_5_27070lvha78c4.R.iget(531)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(532)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(533);return EMPTY_INT_ARRAY;
        }

        }__CLR4_5_27070lvha78c4.R.inc(534);final int[] subarray = new int[newSize];
        __CLR4_5_27070lvha78c4.R.inc(535);System.arraycopy(array, startIndexInclusive, subarray, 0, newSize);
        __CLR4_5_27070lvha78c4.R.inc(536);return subarray;
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Produces a new {@code short} array containing the elements
     * between the start and end indices.
     *
     * <p>The start index is inclusive, the end index exclusive.
     * Null array input produces null output.
     *
     * @param array  the array
     * @param startIndexInclusive  the starting index. Undervalue (&lt;0)
     *      is promoted to 0, overvalue (&gt;array.length) results
     *      in an empty array.
     * @param endIndexExclusive  elements up to endIndex-1 are present in the
     *      returned subarray. Undervalue (&lt; startIndex) produces
     *      empty array, overvalue (&gt;array.length) is demoted to
     *      array length.
     * @return a new array containing the elements between
     *      the start and end indices.
     * @since 2.1
     * @see Arrays#copyOfRange(short[], int, int)
     */
    public static short[] subarray(final short[] array, int startIndexInclusive, int endIndexExclusive) {try{__CLR4_5_27070lvha78c4.R.inc(537);
        __CLR4_5_27070lvha78c4.R.inc(538);if ((((array == null)&&(__CLR4_5_27070lvha78c4.R.iget(539)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(540)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(541);return null;
        }
        }__CLR4_5_27070lvha78c4.R.inc(542);if ((((startIndexInclusive < 0)&&(__CLR4_5_27070lvha78c4.R.iget(543)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(544)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(545);startIndexInclusive = 0;
        }
        }__CLR4_5_27070lvha78c4.R.inc(546);if ((((endIndexExclusive > array.length)&&(__CLR4_5_27070lvha78c4.R.iget(547)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(548)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(549);endIndexExclusive = array.length;
        }
        }__CLR4_5_27070lvha78c4.R.inc(550);final int newSize = endIndexExclusive - startIndexInclusive;
        __CLR4_5_27070lvha78c4.R.inc(551);if ((((newSize <= 0)&&(__CLR4_5_27070lvha78c4.R.iget(552)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(553)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(554);return EMPTY_SHORT_ARRAY;
        }

        }__CLR4_5_27070lvha78c4.R.inc(555);final short[] subarray = new short[newSize];
        __CLR4_5_27070lvha78c4.R.inc(556);System.arraycopy(array, startIndexInclusive, subarray, 0, newSize);
        __CLR4_5_27070lvha78c4.R.inc(557);return subarray;
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Produces a new {@code char} array containing the elements
     * between the start and end indices.
     *
     * <p>The start index is inclusive, the end index exclusive.
     * Null array input produces null output.
     *
     * @param array  the array
     * @param startIndexInclusive  the starting index. Undervalue (&lt;0)
     *      is promoted to 0, overvalue (&gt;array.length) results
     *      in an empty array.
     * @param endIndexExclusive  elements up to endIndex-1 are present in the
     *      returned subarray. Undervalue (&lt; startIndex) produces
     *      empty array, overvalue (&gt;array.length) is demoted to
     *      array length.
     * @return a new array containing the elements between
     *      the start and end indices.
     * @since 2.1
     * @see Arrays#copyOfRange(char[], int, int)
     */
    public static char[] subarray(final char[] array, int startIndexInclusive, int endIndexExclusive) {try{__CLR4_5_27070lvha78c4.R.inc(558);
        __CLR4_5_27070lvha78c4.R.inc(559);if ((((array == null)&&(__CLR4_5_27070lvha78c4.R.iget(560)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(561)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(562);return null;
        }
        }__CLR4_5_27070lvha78c4.R.inc(563);if ((((startIndexInclusive < 0)&&(__CLR4_5_27070lvha78c4.R.iget(564)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(565)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(566);startIndexInclusive = 0;
        }
        }__CLR4_5_27070lvha78c4.R.inc(567);if ((((endIndexExclusive > array.length)&&(__CLR4_5_27070lvha78c4.R.iget(568)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(569)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(570);endIndexExclusive = array.length;
        }
        }__CLR4_5_27070lvha78c4.R.inc(571);final int newSize = endIndexExclusive - startIndexInclusive;
        __CLR4_5_27070lvha78c4.R.inc(572);if ((((newSize <= 0)&&(__CLR4_5_27070lvha78c4.R.iget(573)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(574)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(575);return EMPTY_CHAR_ARRAY;
        }

        }__CLR4_5_27070lvha78c4.R.inc(576);final char[] subarray = new char[newSize];
        __CLR4_5_27070lvha78c4.R.inc(577);System.arraycopy(array, startIndexInclusive, subarray, 0, newSize);
        __CLR4_5_27070lvha78c4.R.inc(578);return subarray;
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Produces a new {@code byte} array containing the elements
     * between the start and end indices.
     *
     * <p>The start index is inclusive, the end index exclusive.
     * Null array input produces null output.
     *
     * @param array  the array
     * @param startIndexInclusive  the starting index. Undervalue (&lt;0)
     *      is promoted to 0, overvalue (&gt;array.length) results
     *      in an empty array.
     * @param endIndexExclusive  elements up to endIndex-1 are present in the
     *      returned subarray. Undervalue (&lt; startIndex) produces
     *      empty array, overvalue (&gt;array.length) is demoted to
     *      array length.
     * @return a new array containing the elements between
     *      the start and end indices.
     * @since 2.1
     * @see Arrays#copyOfRange(byte[], int, int)
     */
    public static byte[] subarray(final byte[] array, int startIndexInclusive, int endIndexExclusive) {try{__CLR4_5_27070lvha78c4.R.inc(579);
        __CLR4_5_27070lvha78c4.R.inc(580);if ((((array == null)&&(__CLR4_5_27070lvha78c4.R.iget(581)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(582)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(583);return null;
        }
        }__CLR4_5_27070lvha78c4.R.inc(584);if ((((startIndexInclusive < 0)&&(__CLR4_5_27070lvha78c4.R.iget(585)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(586)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(587);startIndexInclusive = 0;
        }
        }__CLR4_5_27070lvha78c4.R.inc(588);if ((((endIndexExclusive > array.length)&&(__CLR4_5_27070lvha78c4.R.iget(589)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(590)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(591);endIndexExclusive = array.length;
        }
        }__CLR4_5_27070lvha78c4.R.inc(592);final int newSize = endIndexExclusive - startIndexInclusive;
        __CLR4_5_27070lvha78c4.R.inc(593);if ((((newSize <= 0)&&(__CLR4_5_27070lvha78c4.R.iget(594)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(595)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(596);return EMPTY_BYTE_ARRAY;
        }

        }__CLR4_5_27070lvha78c4.R.inc(597);final byte[] subarray = new byte[newSize];
        __CLR4_5_27070lvha78c4.R.inc(598);System.arraycopy(array, startIndexInclusive, subarray, 0, newSize);
        __CLR4_5_27070lvha78c4.R.inc(599);return subarray;
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Produces a new {@code double} array containing the elements
     * between the start and end indices.
     *
     * <p>The start index is inclusive, the end index exclusive.
     * Null array input produces null output.
     *
     * @param array  the array
     * @param startIndexInclusive  the starting index. Undervalue (&lt;0)
     *      is promoted to 0, overvalue (&gt;array.length) results
     *      in an empty array.
     * @param endIndexExclusive  elements up to endIndex-1 are present in the
     *      returned subarray. Undervalue (&lt; startIndex) produces
     *      empty array, overvalue (&gt;array.length) is demoted to
     *      array length.
     * @return a new array containing the elements between
     *      the start and end indices.
     * @since 2.1
     * @see Arrays#copyOfRange(double[], int, int)
     */
    public static double[] subarray(final double[] array, int startIndexInclusive, int endIndexExclusive) {try{__CLR4_5_27070lvha78c4.R.inc(600);
        __CLR4_5_27070lvha78c4.R.inc(601);if ((((array == null)&&(__CLR4_5_27070lvha78c4.R.iget(602)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(603)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(604);return null;
        }
        }__CLR4_5_27070lvha78c4.R.inc(605);if ((((startIndexInclusive < 0)&&(__CLR4_5_27070lvha78c4.R.iget(606)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(607)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(608);startIndexInclusive = 0;
        }
        }__CLR4_5_27070lvha78c4.R.inc(609);if ((((endIndexExclusive > array.length)&&(__CLR4_5_27070lvha78c4.R.iget(610)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(611)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(612);endIndexExclusive = array.length;
        }
        }__CLR4_5_27070lvha78c4.R.inc(613);final int newSize = endIndexExclusive - startIndexInclusive;
        __CLR4_5_27070lvha78c4.R.inc(614);if ((((newSize <= 0)&&(__CLR4_5_27070lvha78c4.R.iget(615)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(616)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(617);return EMPTY_DOUBLE_ARRAY;
        }

        }__CLR4_5_27070lvha78c4.R.inc(618);final double[] subarray = new double[newSize];
        __CLR4_5_27070lvha78c4.R.inc(619);System.arraycopy(array, startIndexInclusive, subarray, 0, newSize);
        __CLR4_5_27070lvha78c4.R.inc(620);return subarray;
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Produces a new {@code float} array containing the elements
     * between the start and end indices.
     *
     * <p>The start index is inclusive, the end index exclusive.
     * Null array input produces null output.
     *
     * @param array  the array
     * @param startIndexInclusive  the starting index. Undervalue (&lt;0)
     *      is promoted to 0, overvalue (&gt;array.length) results
     *      in an empty array.
     * @param endIndexExclusive  elements up to endIndex-1 are present in the
     *      returned subarray. Undervalue (&lt; startIndex) produces
     *      empty array, overvalue (&gt;array.length) is demoted to
     *      array length.
     * @return a new array containing the elements between
     *      the start and end indices.
     * @since 2.1
     * @see Arrays#copyOfRange(float[], int, int)
     */
    public static float[] subarray(final float[] array, int startIndexInclusive, int endIndexExclusive) {try{__CLR4_5_27070lvha78c4.R.inc(621);
        __CLR4_5_27070lvha78c4.R.inc(622);if ((((array == null)&&(__CLR4_5_27070lvha78c4.R.iget(623)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(624)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(625);return null;
        }
        }__CLR4_5_27070lvha78c4.R.inc(626);if ((((startIndexInclusive < 0)&&(__CLR4_5_27070lvha78c4.R.iget(627)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(628)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(629);startIndexInclusive = 0;
        }
        }__CLR4_5_27070lvha78c4.R.inc(630);if ((((endIndexExclusive > array.length)&&(__CLR4_5_27070lvha78c4.R.iget(631)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(632)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(633);endIndexExclusive = array.length;
        }
        }__CLR4_5_27070lvha78c4.R.inc(634);final int newSize = endIndexExclusive - startIndexInclusive;
        __CLR4_5_27070lvha78c4.R.inc(635);if ((((newSize <= 0)&&(__CLR4_5_27070lvha78c4.R.iget(636)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(637)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(638);return EMPTY_FLOAT_ARRAY;
        }

        }__CLR4_5_27070lvha78c4.R.inc(639);final float[] subarray = new float[newSize];
        __CLR4_5_27070lvha78c4.R.inc(640);System.arraycopy(array, startIndexInclusive, subarray, 0, newSize);
        __CLR4_5_27070lvha78c4.R.inc(641);return subarray;
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Produces a new {@code boolean} array containing the elements
     * between the start and end indices.
     *
     * <p>The start index is inclusive, the end index exclusive.
     * Null array input produces null output.
     *
     * @param array  the array
     * @param startIndexInclusive  the starting index. Undervalue (&lt;0)
     *      is promoted to 0, overvalue (&gt;array.length) results
     *      in an empty array.
     * @param endIndexExclusive  elements up to endIndex-1 are present in the
     *      returned subarray. Undervalue (&lt; startIndex) produces
     *      empty array, overvalue (&gt;array.length) is demoted to
     *      array length.
     * @return a new array containing the elements between
     *      the start and end indices.
     * @since 2.1
     * @see Arrays#copyOfRange(boolean[], int, int)
     */
    public static boolean[] subarray(final boolean[] array, int startIndexInclusive, int endIndexExclusive) {try{__CLR4_5_27070lvha78c4.R.inc(642);
        __CLR4_5_27070lvha78c4.R.inc(643);if ((((array == null)&&(__CLR4_5_27070lvha78c4.R.iget(644)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(645)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(646);return null;
        }
        }__CLR4_5_27070lvha78c4.R.inc(647);if ((((startIndexInclusive < 0)&&(__CLR4_5_27070lvha78c4.R.iget(648)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(649)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(650);startIndexInclusive = 0;
        }
        }__CLR4_5_27070lvha78c4.R.inc(651);if ((((endIndexExclusive > array.length)&&(__CLR4_5_27070lvha78c4.R.iget(652)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(653)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(654);endIndexExclusive = array.length;
        }
        }__CLR4_5_27070lvha78c4.R.inc(655);final int newSize = endIndexExclusive - startIndexInclusive;
        __CLR4_5_27070lvha78c4.R.inc(656);if ((((newSize <= 0)&&(__CLR4_5_27070lvha78c4.R.iget(657)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(658)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(659);return EMPTY_BOOLEAN_ARRAY;
        }

        }__CLR4_5_27070lvha78c4.R.inc(660);final boolean[] subarray = new boolean[newSize];
        __CLR4_5_27070lvha78c4.R.inc(661);System.arraycopy(array, startIndexInclusive, subarray, 0, newSize);
        __CLR4_5_27070lvha78c4.R.inc(662);return subarray;
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    // Is same length
    //-----------------------------------------------------------------------
    /**
     * <p>Checks whether two arrays are the same length, treating
     * {@code null} arrays as length {@code 0}.
     *
     * <p>Any multi-dimensional aspects of the arrays are ignored.
     *
     * @param array1 the first array, may be {@code null}
     * @param array2 the second array, may be {@code null}
     * @return {@code true} if length of arrays matches, treating
     *  {@code null} as an empty array
     */
    public static boolean isSameLength(final Object[] array1, final Object[] array2) {try{__CLR4_5_27070lvha78c4.R.inc(663);
        __CLR4_5_27070lvha78c4.R.inc(664);return getLength(array1) == getLength(array2);
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Checks whether two arrays are the same length, treating
     * {@code null} arrays as length {@code 0}.
     *
     * @param array1 the first array, may be {@code null}
     * @param array2 the second array, may be {@code null}
     * @return {@code true} if length of arrays matches, treating
     *  {@code null} as an empty array
     */
    public static boolean isSameLength(final long[] array1, final long[] array2) {try{__CLR4_5_27070lvha78c4.R.inc(665);
        __CLR4_5_27070lvha78c4.R.inc(666);return getLength(array1) == getLength(array2);
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Checks whether two arrays are the same length, treating
     * {@code null} arrays as length {@code 0}.
     *
     * @param array1 the first array, may be {@code null}
     * @param array2 the second array, may be {@code null}
     * @return {@code true} if length of arrays matches, treating
     *  {@code null} as an empty array
     */
    public static boolean isSameLength(final int[] array1, final int[] array2) {try{__CLR4_5_27070lvha78c4.R.inc(667);
        __CLR4_5_27070lvha78c4.R.inc(668);return getLength(array1) == getLength(array2);
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Checks whether two arrays are the same length, treating
     * {@code null} arrays as length {@code 0}.
     *
     * @param array1 the first array, may be {@code null}
     * @param array2 the second array, may be {@code null}
     * @return {@code true} if length of arrays matches, treating
     *  {@code null} as an empty array
     */
    public static boolean isSameLength(final short[] array1, final short[] array2) {try{__CLR4_5_27070lvha78c4.R.inc(669);
        __CLR4_5_27070lvha78c4.R.inc(670);return getLength(array1) == getLength(array2);
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Checks whether two arrays are the same length, treating
     * {@code null} arrays as length {@code 0}.
     *
     * @param array1 the first array, may be {@code null}
     * @param array2 the second array, may be {@code null}
     * @return {@code true} if length of arrays matches, treating
     *  {@code null} as an empty array
     */
    public static boolean isSameLength(final char[] array1, final char[] array2) {try{__CLR4_5_27070lvha78c4.R.inc(671);
        __CLR4_5_27070lvha78c4.R.inc(672);return getLength(array1) == getLength(array2);
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Checks whether two arrays are the same length, treating
     * {@code null} arrays as length {@code 0}.
     *
     * @param array1 the first array, may be {@code null}
     * @param array2 the second array, may be {@code null}
     * @return {@code true} if length of arrays matches, treating
     *  {@code null} as an empty array
     */
    public static boolean isSameLength(final byte[] array1, final byte[] array2) {try{__CLR4_5_27070lvha78c4.R.inc(673);
        __CLR4_5_27070lvha78c4.R.inc(674);return getLength(array1) == getLength(array2);
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Checks whether two arrays are the same length, treating
     * {@code null} arrays as length {@code 0}.
     *
     * @param array1 the first array, may be {@code null}
     * @param array2 the second array, may be {@code null}
     * @return {@code true} if length of arrays matches, treating
     *  {@code null} as an empty array
     */
    public static boolean isSameLength(final double[] array1, final double[] array2) {try{__CLR4_5_27070lvha78c4.R.inc(675);
        __CLR4_5_27070lvha78c4.R.inc(676);return getLength(array1) == getLength(array2);
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Checks whether two arrays are the same length, treating
     * {@code null} arrays as length {@code 0}.
     *
     * @param array1 the first array, may be {@code null}
     * @param array2 the second array, may be {@code null}
     * @return {@code true} if length of arrays matches, treating
     *  {@code null} as an empty array
     */
    public static boolean isSameLength(final float[] array1, final float[] array2) {try{__CLR4_5_27070lvha78c4.R.inc(677);
        __CLR4_5_27070lvha78c4.R.inc(678);return getLength(array1) == getLength(array2);
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Checks whether two arrays are the same length, treating
     * {@code null} arrays as length {@code 0}.
     *
     * @param array1 the first array, may be {@code null}
     * @param array2 the second array, may be {@code null}
     * @return {@code true} if length of arrays matches, treating
     *  {@code null} as an empty array
     */
    public static boolean isSameLength(final boolean[] array1, final boolean[] array2) {try{__CLR4_5_27070lvha78c4.R.inc(679);
        __CLR4_5_27070lvha78c4.R.inc(680);return getLength(array1) == getLength(array2);
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * <p>Returns the length of the specified array.
     * This method can deal with {@code Object} arrays and with primitive arrays.
     *
     * <p>If the input array is {@code null}, {@code 0} is returned.
     *
     * <pre>
     * ArrayUtils.getLength(null)            = 0
     * ArrayUtils.getLength([])              = 0
     * ArrayUtils.getLength([null])          = 1
     * ArrayUtils.getLength([true, false])   = 2
     * ArrayUtils.getLength([1, 2, 3])       = 3
     * ArrayUtils.getLength(["a", "b", "c"]) = 3
     * </pre>
     *
     * @param array  the array to retrieve the length from, may be null
     * @return The length of the array, or {@code 0} if the array is {@code null}
     * @throws IllegalArgumentException if the object argument is not an array.
     * @since 2.1
     */
    public static int getLength(final Object array) {try{__CLR4_5_27070lvha78c4.R.inc(681);
        __CLR4_5_27070lvha78c4.R.inc(682);if ((((array == null)&&(__CLR4_5_27070lvha78c4.R.iget(683)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(684)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(685);return 0;
        }
        }__CLR4_5_27070lvha78c4.R.inc(686);return Array.getLength(array);
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Checks whether two arrays are the same type taking into account
     * multi-dimensional arrays.
     *
     * @param array1 the first array, must not be {@code null}
     * @param array2 the second array, must not be {@code null}
     * @return {@code true} if type of arrays matches
     * @throws IllegalArgumentException if either array is {@code null}
     */
    public static boolean isSameType(final Object array1, final Object array2) {try{__CLR4_5_27070lvha78c4.R.inc(687);
        __CLR4_5_27070lvha78c4.R.inc(688);if ((((array1 == null || array2 == null)&&(__CLR4_5_27070lvha78c4.R.iget(689)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(690)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(691);throw new IllegalArgumentException("The Array must not be null");
        }
        }__CLR4_5_27070lvha78c4.R.inc(692);return array1.getClass().getName().equals(array2.getClass().getName());
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    // Reverse
    //-----------------------------------------------------------------------
    /**
     * <p>Reverses the order of the given array.
     *
     * <p>There is no special handling for multi-dimensional arrays.
     *
     * <p>This method does nothing for a {@code null} input array.
     *
     * @param array  the array to reverse, may be {@code null}
     */
    public static void reverse(final Object[] array) {try{__CLR4_5_27070lvha78c4.R.inc(693);
        __CLR4_5_27070lvha78c4.R.inc(694);if ((((array == null)&&(__CLR4_5_27070lvha78c4.R.iget(695)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(696)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(697);return;
        }
        }__CLR4_5_27070lvha78c4.R.inc(698);reverse(array, 0, array.length);
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Reverses the order of the given array.
     *
     * <p>This method does nothing for a {@code null} input array.
     *
     * @param array  the array to reverse, may be {@code null}
     */
    public static void reverse(final long[] array) {try{__CLR4_5_27070lvha78c4.R.inc(699);
        __CLR4_5_27070lvha78c4.R.inc(700);if ((((array == null)&&(__CLR4_5_27070lvha78c4.R.iget(701)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(702)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(703);return;
        }
        }__CLR4_5_27070lvha78c4.R.inc(704);reverse(array, 0, array.length);
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Reverses the order of the given array.
     *
     * <p>This method does nothing for a {@code null} input array.
     *
     * @param array  the array to reverse, may be {@code null}
     */
    public static void reverse(final int[] array) {try{__CLR4_5_27070lvha78c4.R.inc(705);
        __CLR4_5_27070lvha78c4.R.inc(706);if ((((array == null)&&(__CLR4_5_27070lvha78c4.R.iget(707)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(708)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(709);return;
        }
        }__CLR4_5_27070lvha78c4.R.inc(710);reverse(array, 0, array.length);
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Reverses the order of the given array.
     *
     * <p>This method does nothing for a {@code null} input array.
     *
     * @param array  the array to reverse, may be {@code null}
     */
    public static void reverse(final short[] array) {try{__CLR4_5_27070lvha78c4.R.inc(711);
        __CLR4_5_27070lvha78c4.R.inc(712);if ((((array == null)&&(__CLR4_5_27070lvha78c4.R.iget(713)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(714)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(715);return;
        }
        }__CLR4_5_27070lvha78c4.R.inc(716);reverse(array, 0, array.length);
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Reverses the order of the given array.
     *
     * <p>This method does nothing for a {@code null} input array.
     *
     * @param array  the array to reverse, may be {@code null}
     */
    public static void reverse(final char[] array) {try{__CLR4_5_27070lvha78c4.R.inc(717);
        __CLR4_5_27070lvha78c4.R.inc(718);if ((((array == null)&&(__CLR4_5_27070lvha78c4.R.iget(719)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(720)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(721);return;
        }
        }__CLR4_5_27070lvha78c4.R.inc(722);reverse(array, 0, array.length);
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Reverses the order of the given array.
     *
     * <p>This method does nothing for a {@code null} input array.
     *
     * @param array  the array to reverse, may be {@code null}
     */
    public static void reverse(final byte[] array) {try{__CLR4_5_27070lvha78c4.R.inc(723);
        __CLR4_5_27070lvha78c4.R.inc(724);if ((((array == null)&&(__CLR4_5_27070lvha78c4.R.iget(725)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(726)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(727);return;
        }
        }__CLR4_5_27070lvha78c4.R.inc(728);reverse(array, 0, array.length);
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Reverses the order of the given array.
     *
     * <p>This method does nothing for a {@code null} input array.
     *
     * @param array  the array to reverse, may be {@code null}
     */
    public static void reverse(final double[] array) {try{__CLR4_5_27070lvha78c4.R.inc(729);
        __CLR4_5_27070lvha78c4.R.inc(730);if ((((array == null)&&(__CLR4_5_27070lvha78c4.R.iget(731)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(732)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(733);return;
        }
        }__CLR4_5_27070lvha78c4.R.inc(734);reverse(array, 0, array.length);
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Reverses the order of the given array.
     *
     * <p>This method does nothing for a {@code null} input array.
     *
     * @param array  the array to reverse, may be {@code null}
     */
    public static void reverse(final float[] array) {try{__CLR4_5_27070lvha78c4.R.inc(735);
        __CLR4_5_27070lvha78c4.R.inc(736);if ((((array == null)&&(__CLR4_5_27070lvha78c4.R.iget(737)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(738)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(739);return;
        }
        }__CLR4_5_27070lvha78c4.R.inc(740);reverse(array, 0, array.length);
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Reverses the order of the given array.
     *
     * <p>This method does nothing for a {@code null} input array.
     *
     * @param array  the array to reverse, may be {@code null}
     */
    public static void reverse(final boolean[] array) {try{__CLR4_5_27070lvha78c4.R.inc(741);
        __CLR4_5_27070lvha78c4.R.inc(742);if ((((array == null)&&(__CLR4_5_27070lvha78c4.R.iget(743)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(744)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(745);return;
        }
        }__CLR4_5_27070lvha78c4.R.inc(746);reverse(array, 0, array.length);
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>
     * Reverses the order of the given array in the given range.
     * 
     * <p>
     * This method does nothing for a {@code null} input array.
     * 
     * @param array
     *            the array to reverse, may be {@code null}
     * @param startIndexInclusive
     *            the starting index. Undervalue (&lt;0) is promoted to 0, overvalue (&gt;array.length) results in no
     *            change.
     * @param endIndexExclusive
     *            elements up to endIndex-1 are reversed in the array. Undervalue (&lt; start index) results in no
     *            change. Overvalue (&gt;array.length) is demoted to array length.
     * @since 3.2
     */
    public static void reverse(final boolean[] array, final int startIndexInclusive, final int endIndexExclusive) {try{__CLR4_5_27070lvha78c4.R.inc(747);
        __CLR4_5_27070lvha78c4.R.inc(748);if ((((array == null)&&(__CLR4_5_27070lvha78c4.R.iget(749)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(750)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(751);return;
        }
        }__CLR4_5_27070lvha78c4.R.inc(752);int i = (((startIndexInclusive < 0 )&&(__CLR4_5_27070lvha78c4.R.iget(753)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(754)==0&false))? 0 : startIndexInclusive;
        __CLR4_5_27070lvha78c4.R.inc(755);int j = Math.min(array.length, endIndexExclusive) - 1;
        __CLR4_5_27070lvha78c4.R.inc(756);boolean tmp;
        __CLR4_5_27070lvha78c4.R.inc(757);while ((((j > i)&&(__CLR4_5_27070lvha78c4.R.iget(758)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(759)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(760);tmp = array[j];
            __CLR4_5_27070lvha78c4.R.inc(761);array[j] = array[i];
            __CLR4_5_27070lvha78c4.R.inc(762);array[i] = tmp;
            __CLR4_5_27070lvha78c4.R.inc(763);j--;
            __CLR4_5_27070lvha78c4.R.inc(764);i++;
        }
    }}finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>
     * Reverses the order of the given array in the given range.
     * 
     * <p>
     * This method does nothing for a {@code null} input array.
     * 
     * @param array
     *            the array to reverse, may be {@code null}
     * @param startIndexInclusive
     *            the starting index. Undervalue (&lt;0) is promoted to 0, overvalue (&gt;array.length) results in no
     *            change.
     * @param endIndexExclusive
     *            elements up to endIndex-1 are reversed in the array. Undervalue (&lt; start index) results in no
     *            change. Overvalue (&gt;array.length) is demoted to array length.
     * @since 3.2
     */
    public static void reverse(final byte[] array, final int startIndexInclusive, final int endIndexExclusive) {try{__CLR4_5_27070lvha78c4.R.inc(765);
        __CLR4_5_27070lvha78c4.R.inc(766);if ((((array == null)&&(__CLR4_5_27070lvha78c4.R.iget(767)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(768)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(769);return;
        }
        }__CLR4_5_27070lvha78c4.R.inc(770);int i = (((startIndexInclusive < 0 )&&(__CLR4_5_27070lvha78c4.R.iget(771)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(772)==0&false))? 0 : startIndexInclusive;
        __CLR4_5_27070lvha78c4.R.inc(773);int j = Math.min(array.length, endIndexExclusive) - 1;
        __CLR4_5_27070lvha78c4.R.inc(774);byte tmp;
        __CLR4_5_27070lvha78c4.R.inc(775);while ((((j > i)&&(__CLR4_5_27070lvha78c4.R.iget(776)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(777)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(778);tmp = array[j];
            __CLR4_5_27070lvha78c4.R.inc(779);array[j] = array[i];
            __CLR4_5_27070lvha78c4.R.inc(780);array[i] = tmp;
            __CLR4_5_27070lvha78c4.R.inc(781);j--;
            __CLR4_5_27070lvha78c4.R.inc(782);i++;
        }
    }}finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>
     * Reverses the order of the given array in the given range.
     * 
     * <p>
     * This method does nothing for a {@code null} input array.
     * 
     * @param array
     *            the array to reverse, may be {@code null}
     * @param startIndexInclusive
     *            the starting index. Undervalue (&lt;0) is promoted to 0, overvalue (&gt;array.length) results in no
     *            change.
     * @param endIndexExclusive
     *            elements up to endIndex-1 are reversed in the array. Undervalue (&lt; start index) results in no
     *            change. Overvalue (&gt;array.length) is demoted to array length.
     * @since 3.2
     */
    public static void reverse(final char[] array, final int startIndexInclusive, final int endIndexExclusive) {try{__CLR4_5_27070lvha78c4.R.inc(783);
        __CLR4_5_27070lvha78c4.R.inc(784);if ((((array == null)&&(__CLR4_5_27070lvha78c4.R.iget(785)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(786)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(787);return;
        }
        }__CLR4_5_27070lvha78c4.R.inc(788);int i = (((startIndexInclusive < 0 )&&(__CLR4_5_27070lvha78c4.R.iget(789)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(790)==0&false))? 0 : startIndexInclusive;
        __CLR4_5_27070lvha78c4.R.inc(791);int j = Math.min(array.length, endIndexExclusive) - 1;
        __CLR4_5_27070lvha78c4.R.inc(792);char tmp;
        __CLR4_5_27070lvha78c4.R.inc(793);while ((((j > i)&&(__CLR4_5_27070lvha78c4.R.iget(794)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(795)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(796);tmp = array[j];
            __CLR4_5_27070lvha78c4.R.inc(797);array[j] = array[i];
            __CLR4_5_27070lvha78c4.R.inc(798);array[i] = tmp;
            __CLR4_5_27070lvha78c4.R.inc(799);j--;
            __CLR4_5_27070lvha78c4.R.inc(800);i++;
        }
    }}finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>
     * Reverses the order of the given array in the given range.
     * 
     * <p>
     * This method does nothing for a {@code null} input array.
     * 
     * @param array
     *            the array to reverse, may be {@code null}
     * @param startIndexInclusive
     *            the starting index. Undervalue (&lt;0) is promoted to 0, overvalue (&gt;array.length) results in no
     *            change.
     * @param endIndexExclusive
     *            elements up to endIndex-1 are reversed in the array. Undervalue (&lt; start index) results in no
     *            change. Overvalue (&gt;array.length) is demoted to array length.
     * @since 3.2
     */
    public static void reverse(final double[] array, final int startIndexInclusive, final int endIndexExclusive) {try{__CLR4_5_27070lvha78c4.R.inc(801);
        __CLR4_5_27070lvha78c4.R.inc(802);if ((((array == null)&&(__CLR4_5_27070lvha78c4.R.iget(803)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(804)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(805);return;
        }
        }__CLR4_5_27070lvha78c4.R.inc(806);int i = (((startIndexInclusive < 0 )&&(__CLR4_5_27070lvha78c4.R.iget(807)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(808)==0&false))? 0 : startIndexInclusive;
        __CLR4_5_27070lvha78c4.R.inc(809);int j = Math.min(array.length, endIndexExclusive) - 1;
        __CLR4_5_27070lvha78c4.R.inc(810);double tmp;
        __CLR4_5_27070lvha78c4.R.inc(811);while ((((j > i)&&(__CLR4_5_27070lvha78c4.R.iget(812)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(813)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(814);tmp = array[j];
            __CLR4_5_27070lvha78c4.R.inc(815);array[j] = array[i];
            __CLR4_5_27070lvha78c4.R.inc(816);array[i] = tmp;
            __CLR4_5_27070lvha78c4.R.inc(817);j--;
            __CLR4_5_27070lvha78c4.R.inc(818);i++;
        }
    }}finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>
     * Reverses the order of the given array in the given range.
     * 
     * <p>
     * This method does nothing for a {@code null} input array.
     * 
     * @param array
     *            the array to reverse, may be {@code null}
     * @param startIndexInclusive
     *            the starting index. Undervalue (&lt;0) is promoted to 0, overvalue (&gt;array.length) results in no
     *            change.
     * @param endIndexExclusive
     *            elements up to endIndex-1 are reversed in the array. Undervalue (&lt; start index) results in no
     *            change. Overvalue (&gt;array.length) is demoted to array length.
     * @since 3.2
     */
    public static void reverse(final float[] array, final int startIndexInclusive, final int endIndexExclusive) {try{__CLR4_5_27070lvha78c4.R.inc(819);
        __CLR4_5_27070lvha78c4.R.inc(820);if ((((array == null)&&(__CLR4_5_27070lvha78c4.R.iget(821)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(822)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(823);return;
        }
        }__CLR4_5_27070lvha78c4.R.inc(824);int i = (((startIndexInclusive < 0 )&&(__CLR4_5_27070lvha78c4.R.iget(825)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(826)==0&false))? 0 : startIndexInclusive;
        __CLR4_5_27070lvha78c4.R.inc(827);int j = Math.min(array.length, endIndexExclusive) - 1;
        __CLR4_5_27070lvha78c4.R.inc(828);float tmp;
        __CLR4_5_27070lvha78c4.R.inc(829);while ((((j > i)&&(__CLR4_5_27070lvha78c4.R.iget(830)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(831)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(832);tmp = array[j];
            __CLR4_5_27070lvha78c4.R.inc(833);array[j] = array[i];
            __CLR4_5_27070lvha78c4.R.inc(834);array[i] = tmp;
            __CLR4_5_27070lvha78c4.R.inc(835);j--;
            __CLR4_5_27070lvha78c4.R.inc(836);i++;
        }
    }}finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>
     * Reverses the order of the given array in the given range.
     * 
     * <p>
     * This method does nothing for a {@code null} input array.
     * 
     * @param array
     *            the array to reverse, may be {@code null}
     * @param startIndexInclusive
     *            the starting index. Undervalue (&lt;0) is promoted to 0, overvalue (&gt;array.length) results in no
     *            change.
     * @param endIndexExclusive
     *            elements up to endIndex-1 are reversed in the array. Undervalue (&lt; start index) results in no
     *            change. Overvalue (&gt;array.length) is demoted to array length.
     * @since 3.2
     */
    public static void reverse(final int[] array, final int startIndexInclusive, final int endIndexExclusive) {try{__CLR4_5_27070lvha78c4.R.inc(837);
        __CLR4_5_27070lvha78c4.R.inc(838);if ((((array == null)&&(__CLR4_5_27070lvha78c4.R.iget(839)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(840)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(841);return;
        }
        }__CLR4_5_27070lvha78c4.R.inc(842);int i = (((startIndexInclusive < 0 )&&(__CLR4_5_27070lvha78c4.R.iget(843)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(844)==0&false))? 0 : startIndexInclusive;
        __CLR4_5_27070lvha78c4.R.inc(845);int j = Math.min(array.length, endIndexExclusive) - 1;
        __CLR4_5_27070lvha78c4.R.inc(846);int tmp;
        __CLR4_5_27070lvha78c4.R.inc(847);while ((((j > i)&&(__CLR4_5_27070lvha78c4.R.iget(848)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(849)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(850);tmp = array[j];
            __CLR4_5_27070lvha78c4.R.inc(851);array[j] = array[i];
            __CLR4_5_27070lvha78c4.R.inc(852);array[i] = tmp;
            __CLR4_5_27070lvha78c4.R.inc(853);j--;
            __CLR4_5_27070lvha78c4.R.inc(854);i++;
        }
    }}finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>
     * Reverses the order of the given array in the given range.
     * 
     * <p>
     * This method does nothing for a {@code null} input array.
     * 
     * @param array
     *            the array to reverse, may be {@code null}
     * @param startIndexInclusive
     *            the starting index. Undervalue (&lt;0) is promoted to 0, overvalue (&gt;array.length) results in no
     *            change.
     * @param endIndexExclusive
     *            elements up to endIndex-1 are reversed in the array. Undervalue (&lt; start index) results in no
     *            change. Overvalue (&gt;array.length) is demoted to array length.
     * @since 3.2
     */
    public static void reverse(final long[] array, final int startIndexInclusive, final int endIndexExclusive) {try{__CLR4_5_27070lvha78c4.R.inc(855);
        __CLR4_5_27070lvha78c4.R.inc(856);if ((((array == null)&&(__CLR4_5_27070lvha78c4.R.iget(857)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(858)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(859);return;
        }
        }__CLR4_5_27070lvha78c4.R.inc(860);int i = (((startIndexInclusive < 0 )&&(__CLR4_5_27070lvha78c4.R.iget(861)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(862)==0&false))? 0 : startIndexInclusive;
        __CLR4_5_27070lvha78c4.R.inc(863);int j = Math.min(array.length, endIndexExclusive) - 1;
        __CLR4_5_27070lvha78c4.R.inc(864);long tmp;
        __CLR4_5_27070lvha78c4.R.inc(865);while ((((j > i)&&(__CLR4_5_27070lvha78c4.R.iget(866)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(867)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(868);tmp = array[j];
            __CLR4_5_27070lvha78c4.R.inc(869);array[j] = array[i];
            __CLR4_5_27070lvha78c4.R.inc(870);array[i] = tmp;
            __CLR4_5_27070lvha78c4.R.inc(871);j--;
            __CLR4_5_27070lvha78c4.R.inc(872);i++;
        }
    }}finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>
     * Reverses the order of the given array in the given range.
     * 
     * <p>
     * This method does nothing for a {@code null} input array.
     * 
     * @param array
     *            the array to reverse, may be {@code null}
     * @param startIndexInclusive
     *            the starting index. Under value (&lt;0) is promoted to 0, over value (&gt;array.length) results in no
     *            change.
     * @param endIndexExclusive
     *            elements up to endIndex-1 are reversed in the array. Under value (&lt; start index) results in no
     *            change. Over value (&gt;array.length) is demoted to array length.
     * @since 3.2
     */
    public static void reverse(final Object[] array, final int startIndexInclusive, final int endIndexExclusive) {try{__CLR4_5_27070lvha78c4.R.inc(873);
        __CLR4_5_27070lvha78c4.R.inc(874);if ((((array == null)&&(__CLR4_5_27070lvha78c4.R.iget(875)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(876)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(877);return;
        }
        }__CLR4_5_27070lvha78c4.R.inc(878);int i = (((startIndexInclusive < 0 )&&(__CLR4_5_27070lvha78c4.R.iget(879)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(880)==0&false))? 0 : startIndexInclusive;
        __CLR4_5_27070lvha78c4.R.inc(881);int j = Math.min(array.length, endIndexExclusive) - 1;
        __CLR4_5_27070lvha78c4.R.inc(882);Object tmp;
        __CLR4_5_27070lvha78c4.R.inc(883);while ((((j > i)&&(__CLR4_5_27070lvha78c4.R.iget(884)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(885)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(886);tmp = array[j];
            __CLR4_5_27070lvha78c4.R.inc(887);array[j] = array[i];
            __CLR4_5_27070lvha78c4.R.inc(888);array[i] = tmp;
            __CLR4_5_27070lvha78c4.R.inc(889);j--;
            __CLR4_5_27070lvha78c4.R.inc(890);i++;
        }
    }}finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>
     * Reverses the order of the given array in the given range.
     * 
     * <p>
     * This method does nothing for a {@code null} input array.
     * 
     * @param array
     *            the array to reverse, may be {@code null}
     * @param startIndexInclusive
     *            the starting index. Undervalue (&lt;0) is promoted to 0, overvalue (&gt;array.length) results in no
     *            change.
     * @param endIndexExclusive
     *            elements up to endIndex-1 are reversed in the array. Undervalue (&lt; start index) results in no
     *            change. Overvalue (&gt;array.length) is demoted to array length.
     * @since 3.2
     */
    public static void reverse(final short[] array, final int startIndexInclusive, final int endIndexExclusive) {try{__CLR4_5_27070lvha78c4.R.inc(891);
        __CLR4_5_27070lvha78c4.R.inc(892);if ((((array == null)&&(__CLR4_5_27070lvha78c4.R.iget(893)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(894)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(895);return;
        }
        }__CLR4_5_27070lvha78c4.R.inc(896);int i = (((startIndexInclusive < 0 )&&(__CLR4_5_27070lvha78c4.R.iget(897)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(898)==0&false))? 0 : startIndexInclusive;
        __CLR4_5_27070lvha78c4.R.inc(899);int j = Math.min(array.length, endIndexExclusive) - 1;
        __CLR4_5_27070lvha78c4.R.inc(900);short tmp;
        __CLR4_5_27070lvha78c4.R.inc(901);while ((((j > i)&&(__CLR4_5_27070lvha78c4.R.iget(902)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(903)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(904);tmp = array[j];
            __CLR4_5_27070lvha78c4.R.inc(905);array[j] = array[i];
            __CLR4_5_27070lvha78c4.R.inc(906);array[i] = tmp;
            __CLR4_5_27070lvha78c4.R.inc(907);j--;
            __CLR4_5_27070lvha78c4.R.inc(908);i++;
        }
    }}finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    // Swap
    //-----------------------------------------------------------------------
    /**
     * Swaps two elements in the given array.
     *
     * <p>There is no special handling for multi-dimensional arrays. This method
     * does nothing for a {@code null} or empty input array or for overflow indices.
     * Negative indices are promoted to 0(zero).</p>
     * 
     * Examples:
     * <ul>
     *     <li>ArrayUtils.swap(["1", "2", "3"], 0, 2) -&gt; ["3", "2", "1"]</li>
     *     <li>ArrayUtils.swap(["1", "2", "3"], 0, 0) -&gt; ["1", "2", "3"]</li>
     *     <li>ArrayUtils.swap(["1", "2", "3"], 1, 0) -&gt; ["2", "1", "3"]</li>
     *     <li>ArrayUtils.swap(["1", "2", "3"], 0, 5) -&gt; ["1", "2", "3"]</li>
     *     <li>ArrayUtils.swap(["1", "2", "3"], -1, 1) -&gt; ["2", "1", "3"]</li>
     * </ul>
     *
     * @param array the array to swap, may be {@code null}
     * @param offset1 the index of the first element to swap
     * @param offset2 the index of the second element to swap
     * @since 3.5
     */
    public static void swap(final Object[] array, final int offset1, final int offset2) {try{__CLR4_5_27070lvha78c4.R.inc(909);
        __CLR4_5_27070lvha78c4.R.inc(910);if ((((array == null || array.length == 0)&&(__CLR4_5_27070lvha78c4.R.iget(911)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(912)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(913);return;
        }
        }__CLR4_5_27070lvha78c4.R.inc(914);swap(array, offset1, offset2, 1);
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * Swaps two elements in the given long array.
     *
     * <p>There is no special handling for multi-dimensional arrays. This method
     * does nothing for a {@code null} or empty input array or for overflow indices.
     * Negative indices are promoted to 0(zero).</p>
     *
     * Examples:
     * <ul>
     *     <li>ArrayUtils.swap([true, false, true], 0, 2) -&gt; [true, false, true]</li>
     *     <li>ArrayUtils.swap([true, false, true], 0, 0) -&gt; [true, false, true]</li>
     *     <li>ArrayUtils.swap([true, false, true], 1, 0) -&gt; [false, true, true]</li>
     *     <li>ArrayUtils.swap([true, false, true], 0, 5) -&gt; [true, false, true]</li>
     *     <li>ArrayUtils.swap([true, false, true], -1, 1) -&gt; [false, true, true]</li>
     * </ul>
     *
     *
     * @param array  the array to swap, may be {@code null}
     * @param offset1 the index of the first element to swap
     * @param offset2 the index of the second element to swap
     * @since 3.5
     */
    public static void swap(final long[] array, final int offset1, final int offset2) {try{__CLR4_5_27070lvha78c4.R.inc(915);
        __CLR4_5_27070lvha78c4.R.inc(916);if ((((array == null || array.length == 0)&&(__CLR4_5_27070lvha78c4.R.iget(917)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(918)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(919);return;
        }
        }__CLR4_5_27070lvha78c4.R.inc(920);swap(array, offset1, offset2, 1);
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * Swaps two elements in the given int array.
     *
     * <p>There is no special handling for multi-dimensional arrays. This method
     * does nothing for a {@code null} or empty input array or for overflow indices.
     * Negative indices are promoted to 0(zero).</p>
     *
     * Examples:
     * <ul>
     *     <li>ArrayUtils.swap([1, 2, 3], 0, 2) -&gt; [3, 2, 1]</li>
     *     <li>ArrayUtils.swap([1, 2, 3], 0, 0) -&gt; [1, 2, 3]</li>
     *     <li>ArrayUtils.swap([1, 2, 3], 1, 0) -&gt; [2, 1, 3]</li>
     *     <li>ArrayUtils.swap([1, 2, 3], 0, 5) -&gt; [1, 2, 3]</li>
     *     <li>ArrayUtils.swap([1, 2, 3], -1, 1) -&gt; [2, 1, 3]</li>
     * </ul>
     *
     * @param array  the array to swap, may be {@code null}
     * @param offset1 the index of the first element to swap
     * @param offset2 the index of the second element to swap
     * @since 3.5
     */
    public static void swap(final int[] array, final int offset1, final int offset2) {try{__CLR4_5_27070lvha78c4.R.inc(921);
        __CLR4_5_27070lvha78c4.R.inc(922);if ((((array == null || array.length == 0)&&(__CLR4_5_27070lvha78c4.R.iget(923)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(924)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(925);return;
        }
        }__CLR4_5_27070lvha78c4.R.inc(926);swap(array, offset1, offset2, 1);
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * Swaps two elements in the given short array.
     *
     * <p>There is no special handling for multi-dimensional arrays. This method
     * does nothing for a {@code null} or empty input array or for overflow indices.
     * Negative indices are promoted to 0(zero).</p>
     *
     * Examples:
     * <ul>
     *     <li>ArrayUtils.swap([1, 2, 3], 0, 2) -&gt; [3, 2, 1]</li>
     *     <li>ArrayUtils.swap([1, 2, 3], 0, 0) -&gt; [1, 2, 3]</li>
     *     <li>ArrayUtils.swap([1, 2, 3], 1, 0) -&gt; [2, 1, 3]</li>
     *     <li>ArrayUtils.swap([1, 2, 3], 0, 5) -&gt; [1, 2, 3]</li>
     *     <li>ArrayUtils.swap([1, 2, 3], -1, 1) -&gt; [2, 1, 3]</li>
     * </ul>
     *
     * @param array  the array to swap, may be {@code null}
     * @param offset1 the index of the first element to swap
     * @param offset2 the index of the second element to swap
     * @since 3.5
     */
    public static void swap(final short[] array, final int offset1, final int offset2) {try{__CLR4_5_27070lvha78c4.R.inc(927);
        __CLR4_5_27070lvha78c4.R.inc(928);if ((((array == null || array.length == 0)&&(__CLR4_5_27070lvha78c4.R.iget(929)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(930)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(931);return;
        }
        }__CLR4_5_27070lvha78c4.R.inc(932);swap(array, offset1, offset2, 1);
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * Swaps two elements in the given char array.
     *
     * <p>There is no special handling for multi-dimensional arrays. This method
     * does nothing for a {@code null} or empty input array or for overflow indices.
     * Negative indices are promoted to 0(zero).</p>
     * 
     * Examples:
     * <ul>
     *     <li>ArrayUtils.swap([1, 2, 3], 0, 2) -&gt; [3, 2, 1]</li>
     *     <li>ArrayUtils.swap([1, 2, 3], 0, 0) -&gt; [1, 2, 3]</li>
     *     <li>ArrayUtils.swap([1, 2, 3], 1, 0) -&gt; [2, 1, 3]</li>
     *     <li>ArrayUtils.swap([1, 2, 3], 0, 5) -&gt; [1, 2, 3]</li>
     *     <li>ArrayUtils.swap([1, 2, 3], -1, 1) -&gt; [2, 1, 3]</li>
     * </ul>
     *
     * @param array  the array to swap, may be {@code null}
     * @param offset1 the index of the first element to swap
     * @param offset2 the index of the second element to swap
     * @since 3.5
     */
    public static void swap(final char[] array, final int offset1, final int offset2) {try{__CLR4_5_27070lvha78c4.R.inc(933);
        __CLR4_5_27070lvha78c4.R.inc(934);if ((((array == null || array.length == 0)&&(__CLR4_5_27070lvha78c4.R.iget(935)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(936)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(937);return;
        }
        }__CLR4_5_27070lvha78c4.R.inc(938);swap(array, offset1, offset2, 1);
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * Swaps two elements in the given byte array.
     *
     * <p>There is no special handling for multi-dimensional arrays. This method
     * does nothing for a {@code null} or empty input array or for overflow indices.
     * Negative indices are promoted to 0(zero).</p>
     *
     * Examples:
     * <ul>
     *     <li>ArrayUtils.swap([1, 2, 3], 0, 2) -&gt; [3, 2, 1]</li>
     *     <li>ArrayUtils.swap([1, 2, 3], 0, 0) -&gt; [1, 2, 3]</li>
     *     <li>ArrayUtils.swap([1, 2, 3], 1, 0) -&gt; [2, 1, 3]</li>
     *     <li>ArrayUtils.swap([1, 2, 3], 0, 5) -&gt; [1, 2, 3]</li>
     *     <li>ArrayUtils.swap([1, 2, 3], -1, 1) -&gt; [2, 1, 3]</li>
     * </ul>
     *
     * @param array  the array to swap, may be {@code null}
     * @param offset1 the index of the first element to swap
     * @param offset2 the index of the second element to swap
     * @since 3.5
     */
    public static void swap(final byte[] array, final int offset1, final int offset2) {try{__CLR4_5_27070lvha78c4.R.inc(939);
        __CLR4_5_27070lvha78c4.R.inc(940);if ((((array == null || array.length == 0)&&(__CLR4_5_27070lvha78c4.R.iget(941)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(942)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(943);return;
        }
        }__CLR4_5_27070lvha78c4.R.inc(944);swap(array, offset1, offset2, 1);
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * Swaps two elements in the given double array.
     *
     * <p>There is no special handling for multi-dimensional arrays. This method
     * does nothing for a {@code null} or empty input array or for overflow indices.
     * Negative indices are promoted to 0(zero).</p>
     *
     * Examples:
     * <ul>
     *     <li>ArrayUtils.swap([1, 2, 3], 0, 2) -&gt; [3, 2, 1]</li>
     *     <li>ArrayUtils.swap([1, 2, 3], 0, 0) -&gt; [1, 2, 3]</li>
     *     <li>ArrayUtils.swap([1, 2, 3], 1, 0) -&gt; [2, 1, 3]</li>
     *     <li>ArrayUtils.swap([1, 2, 3], 0, 5) -&gt; [1, 2, 3]</li>
     *     <li>ArrayUtils.swap([1, 2, 3], -1, 1) -&gt; [2, 1, 3]</li>
     * </ul>
     *
     * @param array  the array to swap, may be {@code null}
     * @param offset1 the index of the first element to swap
     * @param offset2 the index of the second element to swap
     * @since 3.5
     */
    public static void swap(final double[] array, final int offset1, final int offset2) {try{__CLR4_5_27070lvha78c4.R.inc(945);
        __CLR4_5_27070lvha78c4.R.inc(946);if ((((array == null || array.length == 0)&&(__CLR4_5_27070lvha78c4.R.iget(947)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(948)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(949);return;
        }
        }__CLR4_5_27070lvha78c4.R.inc(950);swap(array, offset1, offset2, 1);
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * Swaps two elements in the given float array.
     *
     * <p>There is no special handling for multi-dimensional arrays. This method
     * does nothing for a {@code null} or empty input array or for overflow indices.
     * Negative indices are promoted to 0(zero).</p>
     *
     * Examples:
     * <ul>
     *     <li>ArrayUtils.swap([1, 2, 3], 0, 2) -&gt; [3, 2, 1]</li>
     *     <li>ArrayUtils.swap([1, 2, 3], 0, 0) -&gt; [1, 2, 3]</li>
     *     <li>ArrayUtils.swap([1, 2, 3], 1, 0) -&gt; [2, 1, 3]</li>
     *     <li>ArrayUtils.swap([1, 2, 3], 0, 5) -&gt; [1, 2, 3]</li>
     *     <li>ArrayUtils.swap([1, 2, 3], -1, 1) -&gt; [2, 1, 3]</li>
     * </ul>
     *
     * @param array  the array to swap, may be {@code null}
     * @param offset1 the index of the first element to swap
     * @param offset2 the index of the second element to swap
     * @since 3.5
     */
    public static void swap(final float[] array, final int offset1, final int offset2) {try{__CLR4_5_27070lvha78c4.R.inc(951);
        __CLR4_5_27070lvha78c4.R.inc(952);if ((((array == null || array.length == 0)&&(__CLR4_5_27070lvha78c4.R.iget(953)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(954)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(955);return;
        }
        }__CLR4_5_27070lvha78c4.R.inc(956);swap(array, offset1, offset2, 1);
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * Swaps two elements in the given boolean array.
     *
     * <p>There is no special handling for multi-dimensional arrays. This method
     * does nothing for a {@code null} or empty input array or for overflow indices.
     * Negative indices are promoted to 0(zero).</p>
     *
     * Examples:
     * <ul>
     *     <li>ArrayUtils.swap([1, 2, 3], 0, 2) -&gt; [3, 2, 1]</li>
     *     <li>ArrayUtils.swap([1, 2, 3], 0, 0) -&gt; [1, 2, 3]</li>
     *     <li>ArrayUtils.swap([1, 2, 3], 1, 0) -&gt; [2, 1, 3]</li>
     *     <li>ArrayUtils.swap([1, 2, 3], 0, 5) -&gt; [1, 2, 3]</li>
     *     <li>ArrayUtils.swap([1, 2, 3], -1, 1) -&gt; [2, 1, 3]</li>
     * </ul>
     *
     * @param array  the array to swap, may be {@code null}
     * @param offset1 the index of the first element to swap
     * @param offset2 the index of the second element to swap
     * @since 3.5
     */
    public static void swap(final boolean[] array, final int offset1, final int offset2) {try{__CLR4_5_27070lvha78c4.R.inc(957);
        __CLR4_5_27070lvha78c4.R.inc(958);if ((((array == null || array.length == 0)&&(__CLR4_5_27070lvha78c4.R.iget(959)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(960)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(961);return;
        }
        }__CLR4_5_27070lvha78c4.R.inc(962);swap(array, offset1, offset2, 1);
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * Swaps a series of elements in the given boolean array.
     *
     * <p>This method does nothing for a {@code null} or empty input array or
     * for overflow indices. Negative indices are promoted to 0(zero). If any
     * of the sub-arrays to swap falls outside of the given array, then the
     * swap is stopped at the end of the array and as many as possible elements
     * are swapped.</p>
     * 
     * Examples:
     * <ul>
     *     <li>ArrayUtils.swap([true, false, true, false], 0, 2, 1) -&gt; [true, false, true, false]</li>
     *     <li>ArrayUtils.swap([true, false, true, false], 0, 0, 1) -&gt; [true, false, true, false]</li>
     *     <li>ArrayUtils.swap([true, false, true, false], 0, 2, 2) -&gt; [true, false, true, false]</li>
     *     <li>ArrayUtils.swap([true, false, true, false], -3, 2, 2) -&gt; [true, false, true, false]</li>
     *     <li>ArrayUtils.swap([true, false, true, false], 0, 3, 3) -&gt; [false, false, true, true]</li>
     * </ul>
     *
     * @param array the array to swap, may be {@code null}
     * @param offset1 the index of the first element in the series to swap
     * @param offset2 the index of the second element in the series to swap
     * @param len the number of elements to swap starting with the given indices
     * @since 3.5
     */
    public static void swap(final boolean[] array, int offset1, int offset2, int len) {try{__CLR4_5_27070lvha78c4.R.inc(963);
        __CLR4_5_27070lvha78c4.R.inc(964);if ((((array == null || array.length == 0 || offset1 >= array.length || offset2 >= array.length)&&(__CLR4_5_27070lvha78c4.R.iget(965)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(966)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(967);return;
        }
        }__CLR4_5_27070lvha78c4.R.inc(968);if ((((offset1 < 0)&&(__CLR4_5_27070lvha78c4.R.iget(969)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(970)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(971);offset1 = 0;
        }
        }__CLR4_5_27070lvha78c4.R.inc(972);if ((((offset2 < 0)&&(__CLR4_5_27070lvha78c4.R.iget(973)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(974)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(975);offset2 = 0;
        }
        }__CLR4_5_27070lvha78c4.R.inc(976);len = Math.min(Math.min(len, array.length - offset1), array.length - offset2);
        __CLR4_5_27070lvha78c4.R.inc(977);for (int i = 0; (((i < len)&&(__CLR4_5_27070lvha78c4.R.iget(978)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(979)==0&false)); i++, offset1++, offset2++) {{
            __CLR4_5_27070lvha78c4.R.inc(980);final boolean aux = array[offset1];
            __CLR4_5_27070lvha78c4.R.inc(981);array[offset1] = array[offset2];
            __CLR4_5_27070lvha78c4.R.inc(982);array[offset2] = aux;
        }
    }}finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * Swaps a series of elements in the given byte array.
     *
     * <p>This method does nothing for a {@code null} or empty input array or
     * for overflow indices. Negative indices are promoted to 0(zero). If any
     * of the sub-arrays to swap falls outside of the given array, then the
     * swap is stopped at the end of the array and as many as possible elements
     * are swapped.</p>
     *
     * Examples:
     * <ul>
     *     <li>ArrayUtils.swap([1, 2, 3, 4], 0, 2, 1) -&gt; [3, 2, 1, 4]</li>
     *     <li>ArrayUtils.swap([1, 2, 3, 4], 0, 0, 1) -&gt; [1, 2, 3, 4]</li>
     *     <li>ArrayUtils.swap([1, 2, 3, 4], 2, 0, 2) -&gt; [3, 4, 1, 2]</li>
     *     <li>ArrayUtils.swap([1, 2, 3, 4], -3, 2, 2) -&gt; [3, 4, 1, 2]</li>
     *     <li>ArrayUtils.swap([1, 2, 3, 4], 0, 3, 3) -&gt; [4, 2, 3, 1]</li>
     * </ul>
     *
     * @param array the array to swap, may be {@code null}
     * @param offset1 the index of the first element in the series to swap
     * @param offset2 the index of the second element in the series to swap
     * @param len the number of elements to swap starting with the given indices
     * @since 3.5
     */
    public static void swap(final byte[] array, int offset1, int offset2, int len) {try{__CLR4_5_27070lvha78c4.R.inc(983);
        __CLR4_5_27070lvha78c4.R.inc(984);if ((((array == null || array.length == 0 || offset1 >= array.length || offset2 >= array.length)&&(__CLR4_5_27070lvha78c4.R.iget(985)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(986)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(987);return;
        }
        }__CLR4_5_27070lvha78c4.R.inc(988);if ((((offset1 < 0)&&(__CLR4_5_27070lvha78c4.R.iget(989)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(990)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(991);offset1 = 0;
        }
        }__CLR4_5_27070lvha78c4.R.inc(992);if ((((offset2 < 0)&&(__CLR4_5_27070lvha78c4.R.iget(993)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(994)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(995);offset2 = 0;
        }
        }__CLR4_5_27070lvha78c4.R.inc(996);len = Math.min(Math.min(len, array.length - offset1), array.length - offset2);
        __CLR4_5_27070lvha78c4.R.inc(997);for (int i = 0; (((i < len)&&(__CLR4_5_27070lvha78c4.R.iget(998)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(999)==0&false)); i++, offset1++, offset2++) {{
            __CLR4_5_27070lvha78c4.R.inc(1000);final byte aux = array[offset1];
            __CLR4_5_27070lvha78c4.R.inc(1001);array[offset1] = array[offset2];
            __CLR4_5_27070lvha78c4.R.inc(1002);array[offset2] = aux;
        }
    }}finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * Swaps a series of elements in the given char array.
     *
     * <p>This method does nothing for a {@code null} or empty input array or
     * for overflow indices. Negative indices are promoted to 0(zero). If any
     * of the sub-arrays to swap falls outside of the given array, then the
     * swap is stopped at the end of the array and as many as possible elements
     * are swapped.</p>
     * 
     * Examples:
     * <ul>
     *     <li>ArrayUtils.swap([1, 2, 3, 4], 0, 2, 1) -&gt; [3, 2, 1, 4]</li>
     *     <li>ArrayUtils.swap([1, 2, 3, 4], 0, 0, 1) -&gt; [1, 2, 3, 4]</li>
     *     <li>ArrayUtils.swap([1, 2, 3, 4], 2, 0, 2) -&gt; [3, 4, 1, 2]</li>
     *     <li>ArrayUtils.swap([1, 2, 3, 4], -3, 2, 2) -&gt; [3, 4, 1, 2]</li>
     *     <li>ArrayUtils.swap([1, 2, 3, 4], 0, 3, 3) -&gt; [4, 2, 3, 1]</li>
     * </ul>
     *
     * @param array the array to swap, may be {@code null}
     * @param offset1 the index of the first element in the series to swap
     * @param offset2 the index of the second element in the series to swap
     * @param len the number of elements to swap starting with the given indices
     * @since 3.5
     */
    public static void swap(final char[] array, int offset1, int offset2, int len) {try{__CLR4_5_27070lvha78c4.R.inc(1003);
        __CLR4_5_27070lvha78c4.R.inc(1004);if ((((array == null || array.length == 0 || offset1 >= array.length || offset2 >= array.length)&&(__CLR4_5_27070lvha78c4.R.iget(1005)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1006)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(1007);return;
        }
        }__CLR4_5_27070lvha78c4.R.inc(1008);if ((((offset1 < 0)&&(__CLR4_5_27070lvha78c4.R.iget(1009)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1010)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(1011);offset1 = 0;
        }
        }__CLR4_5_27070lvha78c4.R.inc(1012);if ((((offset2 < 0)&&(__CLR4_5_27070lvha78c4.R.iget(1013)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1014)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(1015);offset2 = 0;
        }
        }__CLR4_5_27070lvha78c4.R.inc(1016);len = Math.min(Math.min(len, array.length - offset1), array.length - offset2);
        __CLR4_5_27070lvha78c4.R.inc(1017);for (int i = 0; (((i < len)&&(__CLR4_5_27070lvha78c4.R.iget(1018)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1019)==0&false)); i++, offset1++, offset2++) {{
            __CLR4_5_27070lvha78c4.R.inc(1020);final char aux = array[offset1];
            __CLR4_5_27070lvha78c4.R.inc(1021);array[offset1] = array[offset2];
            __CLR4_5_27070lvha78c4.R.inc(1022);array[offset2] = aux;
        }
    }}finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * Swaps a series of elements in the given double array.
     *
     * <p>This method does nothing for a {@code null} or empty input array or
     * for overflow indices. Negative indices are promoted to 0(zero). If any
     * of the sub-arrays to swap falls outside of the given array, then the
     * swap is stopped at the end of the array and as many as possible elements
     * are swapped.</p>
     *
     * Examples:
     * <ul>
     *     <li>ArrayUtils.swap([1, 2, 3, 4], 0, 2, 1) -&gt; [3, 2, 1, 4]</li>
     *     <li>ArrayUtils.swap([1, 2, 3, 4], 0, 0, 1) -&gt; [1, 2, 3, 4]</li>
     *     <li>ArrayUtils.swap([1, 2, 3, 4], 2, 0, 2) -&gt; [3, 4, 1, 2]</li>
     *     <li>ArrayUtils.swap([1, 2, 3, 4], -3, 2, 2) -&gt; [3, 4, 1, 2]</li>
     *     <li>ArrayUtils.swap([1, 2, 3, 4], 0, 3, 3) -&gt; [4, 2, 3, 1]</li>
     * </ul>
     *
     * @param array the array to swap, may be {@code null}
     * @param offset1 the index of the first element in the series to swap
     * @param offset2 the index of the second element in the series to swap
     * @param len the number of elements to swap starting with the given indices
     * @since 3.5
     */
    public static void swap(final double[] array,  int offset1, int offset2, int len) {try{__CLR4_5_27070lvha78c4.R.inc(1023);
        __CLR4_5_27070lvha78c4.R.inc(1024);if ((((array == null || array.length == 0 || offset1 >= array.length || offset2 >= array.length)&&(__CLR4_5_27070lvha78c4.R.iget(1025)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1026)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(1027);return;
        }
        }__CLR4_5_27070lvha78c4.R.inc(1028);if ((((offset1 < 0)&&(__CLR4_5_27070lvha78c4.R.iget(1029)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1030)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(1031);offset1 = 0;
        }
        }__CLR4_5_27070lvha78c4.R.inc(1032);if ((((offset2 < 0)&&(__CLR4_5_27070lvha78c4.R.iget(1033)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1034)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(1035);offset2 = 0;
        }
        }__CLR4_5_27070lvha78c4.R.inc(1036);len = Math.min(Math.min(len, array.length - offset1), array.length - offset2);
        __CLR4_5_27070lvha78c4.R.inc(1037);for (int i = 0; (((i < len)&&(__CLR4_5_27070lvha78c4.R.iget(1038)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1039)==0&false)); i++, offset1++, offset2++) {{
            __CLR4_5_27070lvha78c4.R.inc(1040);final double aux = array[offset1];
            __CLR4_5_27070lvha78c4.R.inc(1041);array[offset1] = array[offset2];
            __CLR4_5_27070lvha78c4.R.inc(1042);array[offset2] = aux;
        }
    }}finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * Swaps a series of elements in the given float array.
     *
     * <p>This method does nothing for a {@code null} or empty input array or
     * for overflow indices. Negative indices are promoted to 0(zero). If any
     * of the sub-arrays to swap falls outside of the given array, then the
     * swap is stopped at the end of the array and as many as possible elements
     * are swapped.</p>
     *
     * Examples:
     * <ul>
     *     <li>ArrayUtils.swap([1, 2, 3, 4], 0, 2, 1) -&gt; [3, 2, 1, 4]</li>
     *     <li>ArrayUtils.swap([1, 2, 3, 4], 0, 0, 1) -&gt; [1, 2, 3, 4]</li>
     *     <li>ArrayUtils.swap([1, 2, 3, 4], 2, 0, 2) -&gt; [3, 4, 1, 2]</li>
     *     <li>ArrayUtils.swap([1, 2, 3, 4], -3, 2, 2) -&gt; [3, 4, 1, 2]</li>
     *     <li>ArrayUtils.swap([1, 2, 3, 4], 0, 3, 3) -&gt; [4, 2, 3, 1]</li>
     * </ul>
     *
     * @param array the array to swap, may be {@code null}
     * @param offset1 the index of the first element in the series to swap
     * @param offset2 the index of the second element in the series to swap
     * @param len the number of elements to swap starting with the given indices
     * @since 3.5
     */
    public static void swap(final float[] array, int offset1, int offset2, int len) {try{__CLR4_5_27070lvha78c4.R.inc(1043);
        __CLR4_5_27070lvha78c4.R.inc(1044);if ((((array == null || array.length == 0 || offset1 >= array.length || offset2 >= array.length)&&(__CLR4_5_27070lvha78c4.R.iget(1045)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1046)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(1047);return;
        }
        }__CLR4_5_27070lvha78c4.R.inc(1048);if ((((offset1 < 0)&&(__CLR4_5_27070lvha78c4.R.iget(1049)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1050)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(1051);offset1 = 0;
        }
        }__CLR4_5_27070lvha78c4.R.inc(1052);if ((((offset2 < 0)&&(__CLR4_5_27070lvha78c4.R.iget(1053)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1054)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(1055);offset2 = 0;
        }
        }__CLR4_5_27070lvha78c4.R.inc(1056);len = Math.min(Math.min(len, array.length - offset1), array.length - offset2);
        __CLR4_5_27070lvha78c4.R.inc(1057);for (int i = 0; (((i < len)&&(__CLR4_5_27070lvha78c4.R.iget(1058)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1059)==0&false)); i++, offset1++, offset2++) {{
            __CLR4_5_27070lvha78c4.R.inc(1060);final float aux = array[offset1];
            __CLR4_5_27070lvha78c4.R.inc(1061);array[offset1] = array[offset2];
            __CLR4_5_27070lvha78c4.R.inc(1062);array[offset2] = aux;
        }

    }}finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * Swaps a series of elements in the given int array.
     *
     * <p>This method does nothing for a {@code null} or empty input array or
     * for overflow indices. Negative indices are promoted to 0(zero). If any
     * of the sub-arrays to swap falls outside of the given array, then the
     * swap is stopped at the end of the array and as many as possible elements
     * are swapped.</p>
     *
     * Examples:
     * <ul>
     *     <li>ArrayUtils.swap([1, 2, 3, 4], 0, 2, 1) -&gt; [3, 2, 1, 4]</li>
     *     <li>ArrayUtils.swap([1, 2, 3, 4], 0, 0, 1) -&gt; [1, 2, 3, 4]</li>
     *     <li>ArrayUtils.swap([1, 2, 3, 4], 2, 0, 2) -&gt; [3, 4, 1, 2]</li>
     *     <li>ArrayUtils.swap([1, 2, 3, 4], -3, 2, 2) -&gt; [3, 4, 1, 2]</li>
     *     <li>ArrayUtils.swap([1, 2, 3, 4], 0, 3, 3) -&gt; [4, 2, 3, 1]</li>
     * </ul>
     *
     * @param array the array to swap, may be {@code null}
     * @param offset1 the index of the first element in the series to swap
     * @param offset2 the index of the second element in the series to swap
     * @param len the number of elements to swap starting with the given indices
     * @since 3.5
     */
    public static void swap(final int[] array,  int offset1, int offset2, int len) {try{__CLR4_5_27070lvha78c4.R.inc(1063);
        __CLR4_5_27070lvha78c4.R.inc(1064);if ((((array == null || array.length == 0 || offset1 >= array.length || offset2 >= array.length)&&(__CLR4_5_27070lvha78c4.R.iget(1065)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1066)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(1067);return;
        }
        }__CLR4_5_27070lvha78c4.R.inc(1068);if ((((offset1 < 0)&&(__CLR4_5_27070lvha78c4.R.iget(1069)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1070)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(1071);offset1 = 0;
        }
        }__CLR4_5_27070lvha78c4.R.inc(1072);if ((((offset2 < 0)&&(__CLR4_5_27070lvha78c4.R.iget(1073)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1074)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(1075);offset2 = 0;
        }
        }__CLR4_5_27070lvha78c4.R.inc(1076);len = Math.min(Math.min(len, array.length - offset1), array.length - offset2);
        __CLR4_5_27070lvha78c4.R.inc(1077);for (int i = 0; (((i < len)&&(__CLR4_5_27070lvha78c4.R.iget(1078)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1079)==0&false)); i++, offset1++, offset2++) {{
            __CLR4_5_27070lvha78c4.R.inc(1080);final int aux = array[offset1];
            __CLR4_5_27070lvha78c4.R.inc(1081);array[offset1] = array[offset2];
            __CLR4_5_27070lvha78c4.R.inc(1082);array[offset2] = aux;
        }
    }}finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * Swaps a series of elements in the given long array.
     *
     * <p>This method does nothing for a {@code null} or empty input array or
     * for overflow indices. Negative indices are promoted to 0(zero). If any
     * of the sub-arrays to swap falls outside of the given array, then the
     * swap is stopped at the end of the array and as many as possible elements
     * are swapped.</p>
     *
     * Examples:
     * <ul>
     *     <li>ArrayUtils.swap([1, 2, 3, 4], 0, 2, 1) -&gt; [3, 2, 1, 4]</li>
     *     <li>ArrayUtils.swap([1, 2, 3, 4], 0, 0, 1) -&gt; [1, 2, 3, 4]</li>
     *     <li>ArrayUtils.swap([1, 2, 3, 4], 2, 0, 2) -&gt; [3, 4, 1, 2]</li>
     *     <li>ArrayUtils.swap([1, 2, 3, 4], -3, 2, 2) -&gt; [3, 4, 1, 2]</li>
     *     <li>ArrayUtils.swap([1, 2, 3, 4], 0, 3, 3) -&gt; [4, 2, 3, 1]</li>
     * </ul>
     *
     * @param array the array to swap, may be {@code null}
     * @param offset1 the index of the first element in the series to swap
     * @param offset2 the index of the second element in the series to swap
     * @param len the number of elements to swap starting with the given indices
     * @since 3.5
     */
    public static void swap(final long[] array,  int offset1, int offset2, int len) {try{__CLR4_5_27070lvha78c4.R.inc(1083);
        __CLR4_5_27070lvha78c4.R.inc(1084);if ((((array == null || array.length == 0 || offset1 >= array.length || offset2 >= array.length)&&(__CLR4_5_27070lvha78c4.R.iget(1085)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1086)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(1087);return;
        }
        }__CLR4_5_27070lvha78c4.R.inc(1088);if ((((offset1 < 0)&&(__CLR4_5_27070lvha78c4.R.iget(1089)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1090)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(1091);offset1 = 0;
        }
        }__CLR4_5_27070lvha78c4.R.inc(1092);if ((((offset2 < 0)&&(__CLR4_5_27070lvha78c4.R.iget(1093)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1094)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(1095);offset2 = 0;
        }
        }__CLR4_5_27070lvha78c4.R.inc(1096);len = Math.min(Math.min(len, array.length - offset1), array.length - offset2);
        __CLR4_5_27070lvha78c4.R.inc(1097);for (int i = 0; (((i < len)&&(__CLR4_5_27070lvha78c4.R.iget(1098)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1099)==0&false)); i++, offset1++, offset2++) {{
            __CLR4_5_27070lvha78c4.R.inc(1100);final long aux = array[offset1];
            __CLR4_5_27070lvha78c4.R.inc(1101);array[offset1] = array[offset2];
            __CLR4_5_27070lvha78c4.R.inc(1102);array[offset2] = aux;
        }
    }}finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * Swaps a series of elements in the given array.
     *
     * <p>This method does nothing for a {@code null} or empty input array or
     * for overflow indices. Negative indices are promoted to 0(zero). If any
     * of the sub-arrays to swap falls outside of the given array, then the
     * swap is stopped at the end of the array and as many as possible elements
     * are swapped.</p>
     *
     * Examples:
     * <ul>
     *     <li>ArrayUtils.swap(["1", "2", "3", "4"], 0, 2, 1) -&gt; ["3", "2", "1", "4"]</li>
     *     <li>ArrayUtils.swap(["1", "2", "3", "4"], 0, 0, 1) -&gt; ["1", "2", "3", "4"]</li>
     *     <li>ArrayUtils.swap(["1", "2", "3", "4"], 2, 0, 2) -&gt; ["3", "4", "1", "2"]</li>
     *     <li>ArrayUtils.swap(["1", "2", "3", "4"], -3, 2, 2) -&gt; ["3", "4", "1", "2"]</li>
     *     <li>ArrayUtils.swap(["1", "2", "3", "4"], 0, 3, 3) -&gt; ["4", "2", "3", "1"]</li>
     * </ul>
     *
     * @param array the array to swap, may be {@code null}
     * @param offset1 the index of the first element in the series to swap
     * @param offset2 the index of the second element in the series to swap
     * @param len the number of elements to swap starting with the given indices
     * @since 3.5
     */
    public static void swap(final Object[] array,  int offset1, int offset2, int len) {try{__CLR4_5_27070lvha78c4.R.inc(1103);
        __CLR4_5_27070lvha78c4.R.inc(1104);if ((((array == null || array.length == 0 || offset1 >= array.length || offset2 >= array.length)&&(__CLR4_5_27070lvha78c4.R.iget(1105)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1106)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(1107);return;
        }
        }__CLR4_5_27070lvha78c4.R.inc(1108);if ((((offset1 < 0)&&(__CLR4_5_27070lvha78c4.R.iget(1109)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1110)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(1111);offset1 = 0;
        }
        }__CLR4_5_27070lvha78c4.R.inc(1112);if ((((offset2 < 0)&&(__CLR4_5_27070lvha78c4.R.iget(1113)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1114)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(1115);offset2 = 0;
        }
        }__CLR4_5_27070lvha78c4.R.inc(1116);len = Math.min(Math.min(len, array.length - offset1), array.length - offset2);
        __CLR4_5_27070lvha78c4.R.inc(1117);for (int i = 0; (((i < len)&&(__CLR4_5_27070lvha78c4.R.iget(1118)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1119)==0&false)); i++, offset1++, offset2++) {{
            __CLR4_5_27070lvha78c4.R.inc(1120);final Object aux = array[offset1];
            __CLR4_5_27070lvha78c4.R.inc(1121);array[offset1] = array[offset2];
            __CLR4_5_27070lvha78c4.R.inc(1122);array[offset2] = aux;
        }
    }}finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

   /**
    * Swaps a series of elements in the given short array.
    *
    * <p>This method does nothing for a {@code null} or empty input array or
    * for overflow indices. Negative indices are promoted to 0(zero). If any
    * of the sub-arrays to swap falls outside of the given array, then the
    * swap is stopped at the end of the array and as many as possible elements
    * are swapped.</p>
    *
    * Examples:
    * <ul>
    *     <li>ArrayUtils.swap([1, 2, 3, 4], 0, 2, 1) -&gt; [3, 2, 1, 4]</li>
    *     <li>ArrayUtils.swap([1, 2, 3, 4], 0, 0, 1) -&gt; [1, 2, 3, 4]</li>
    *     <li>ArrayUtils.swap([1, 2, 3, 4], 2, 0, 2) -&gt; [3, 4, 1, 2]</li>
    *     <li>ArrayUtils.swap([1, 2, 3, 4], -3, 2, 2) -&gt; [3, 4, 1, 2]</li>
    *     <li>ArrayUtils.swap([1, 2, 3, 4], 0, 3, 3) -&gt; [4, 2, 3, 1]</li>
    * </ul>
    *
    * @param array the array to swap, may be {@code null}
    * @param offset1 the index of the first element in the series to swap
    * @param offset2 the index of the second element in the series to swap
    * @param len the number of elements to swap starting with the given indices
    * @since 3.5
    */
    public static void swap(final short[] array,  int offset1, int offset2, int len) {try{__CLR4_5_27070lvha78c4.R.inc(1123);
        __CLR4_5_27070lvha78c4.R.inc(1124);if ((((array == null || array.length == 0 || offset1 >= array.length || offset2 >= array.length)&&(__CLR4_5_27070lvha78c4.R.iget(1125)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1126)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(1127);return;
        }
        }__CLR4_5_27070lvha78c4.R.inc(1128);if ((((offset1 < 0)&&(__CLR4_5_27070lvha78c4.R.iget(1129)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1130)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(1131);offset1 = 0;
        }
        }__CLR4_5_27070lvha78c4.R.inc(1132);if ((((offset2 < 0)&&(__CLR4_5_27070lvha78c4.R.iget(1133)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1134)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(1135);offset2 = 0;
        }
        }__CLR4_5_27070lvha78c4.R.inc(1136);if ((((offset1 == offset2)&&(__CLR4_5_27070lvha78c4.R.iget(1137)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1138)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(1139);return;
        }
        }__CLR4_5_27070lvha78c4.R.inc(1140);len = Math.min(Math.min(len, array.length - offset1), array.length - offset2);
        __CLR4_5_27070lvha78c4.R.inc(1141);for (int i = 0; (((i < len)&&(__CLR4_5_27070lvha78c4.R.iget(1142)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1143)==0&false)); i++, offset1++, offset2++) {{
            __CLR4_5_27070lvha78c4.R.inc(1144);final short aux = array[offset1];
            __CLR4_5_27070lvha78c4.R.inc(1145);array[offset1] = array[offset2];
            __CLR4_5_27070lvha78c4.R.inc(1146);array[offset2] = aux;
        }
    }}finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    // Shift
    //-----------------------------------------------------------------------
    /**
     * Shifts the order of the given array.
     *
     * <p>There is no special handling for multi-dimensional arrays. This method
     * does nothing for {@code null} or empty input arrays.</p>
     *
     * @param array  the array to shift, may be {@code null}
     * @param offset
     *          The number of positions to rotate the elements.  If the offset is larger than the number of elements to
     *          rotate, than the effective offset is modulo the number of elements to rotate.
     * @since 3.5
     */
    public static void shift(final Object[] array, final int offset) {try{__CLR4_5_27070lvha78c4.R.inc(1147);
        __CLR4_5_27070lvha78c4.R.inc(1148);if ((((array == null)&&(__CLR4_5_27070lvha78c4.R.iget(1149)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1150)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(1151);return;
        }
        }__CLR4_5_27070lvha78c4.R.inc(1152);shift(array, 0, array.length, offset);
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * Shifts the order of the given long array.
     *
     * <p>There is no special handling for multi-dimensional arrays. This method
     * does nothing for {@code null} or empty input arrays.</p>
     *
     * @param array  the array to shift, may be {@code null}
     * @param offset
     *          The number of positions to rotate the elements.  If the offset is larger than the number of elements to
     *          rotate, than the effective offset is modulo the number of elements to rotate.
     * @since 3.5
     */
    public static void shift(final long[] array, final int offset) {try{__CLR4_5_27070lvha78c4.R.inc(1153);
        __CLR4_5_27070lvha78c4.R.inc(1154);if ((((array == null)&&(__CLR4_5_27070lvha78c4.R.iget(1155)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1156)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(1157);return;
        }
        }__CLR4_5_27070lvha78c4.R.inc(1158);shift(array, 0, array.length, offset);
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * Shifts the order of the given int array.
     *
     * <p>There is no special handling for multi-dimensional arrays. This method
     * does nothing for {@code null} or empty input arrays.</p>
     *
     * @param array  the array to shift, may be {@code null}
     * @param offset
     *          The number of positions to rotate the elements.  If the offset is larger than the number of elements to
     *          rotate, than the effective offset is modulo the number of elements to rotate.
     * @since 3.5
     */
    public static void shift(final int[] array, final int offset) {try{__CLR4_5_27070lvha78c4.R.inc(1159);
        __CLR4_5_27070lvha78c4.R.inc(1160);if ((((array == null)&&(__CLR4_5_27070lvha78c4.R.iget(1161)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1162)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(1163);return;
        }
        }__CLR4_5_27070lvha78c4.R.inc(1164);shift(array, 0, array.length, offset);
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * Shifts the order of the given short array.
     *
     * <p>There is no special handling for multi-dimensional arrays. This method
     * does nothing for {@code null} or empty input arrays.</p>
     *
     * @param array  the array to shift, may be {@code null}
     * @param offset
     *          The number of positions to rotate the elements.  If the offset is larger than the number of elements to
     *          rotate, than the effective offset is modulo the number of elements to rotate.
     * @since 3.5
     */
    public static void shift(final short[] array, final int offset) {try{__CLR4_5_27070lvha78c4.R.inc(1165);
        __CLR4_5_27070lvha78c4.R.inc(1166);if ((((array == null)&&(__CLR4_5_27070lvha78c4.R.iget(1167)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1168)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(1169);return;
        }
        }__CLR4_5_27070lvha78c4.R.inc(1170);shift(array, 0, array.length, offset);
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * Shifts the order of the given char array.
     *
     * <p>There is no special handling for multi-dimensional arrays. This method
     * does nothing for {@code null} or empty input arrays.</p>
     *
     * @param array  the array to shift, may be {@code null}
     * @param offset
     *          The number of positions to rotate the elements.  If the offset is larger than the number of elements to
     *          rotate, than the effective offset is modulo the number of elements to rotate.
     * @since 3.5
     */
    public static void shift(final char[] array, final int offset) {try{__CLR4_5_27070lvha78c4.R.inc(1171);
        __CLR4_5_27070lvha78c4.R.inc(1172);if ((((array == null)&&(__CLR4_5_27070lvha78c4.R.iget(1173)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1174)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(1175);return;
        }
        }__CLR4_5_27070lvha78c4.R.inc(1176);shift(array, 0, array.length, offset);
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * Shifts the order of the given byte array.
     *
     * <p>There is no special handling for multi-dimensional arrays. This method
     * does nothing for {@code null} or empty input arrays.</p>
     *
     * @param array  the array to shift, may be {@code null}
     * @param offset
     *          The number of positions to rotate the elements.  If the offset is larger than the number of elements to
     *          rotate, than the effective offset is modulo the number of elements to rotate.
     * @since 3.5
     */
    public static void shift(final byte[] array, final int offset) {try{__CLR4_5_27070lvha78c4.R.inc(1177);
        __CLR4_5_27070lvha78c4.R.inc(1178);if ((((array == null)&&(__CLR4_5_27070lvha78c4.R.iget(1179)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1180)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(1181);return;
        }
        }__CLR4_5_27070lvha78c4.R.inc(1182);shift(array, 0, array.length, offset);
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * Shifts the order of the given double array.
     *
     * <p>There is no special handling for multi-dimensional arrays. This method
     * does nothing for {@code null} or empty input arrays.</p>
     *
     * @param array  the array to shift, may be {@code null}
     * @param offset
     *          The number of positions to rotate the elements.  If the offset is larger than the number of elements to
     *          rotate, than the effective offset is modulo the number of elements to rotate.
     * @since 3.5
     */
    public static void shift(final double[] array, final int offset) {try{__CLR4_5_27070lvha78c4.R.inc(1183);
        __CLR4_5_27070lvha78c4.R.inc(1184);if ((((array == null)&&(__CLR4_5_27070lvha78c4.R.iget(1185)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1186)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(1187);return;
        }
        }__CLR4_5_27070lvha78c4.R.inc(1188);shift(array, 0, array.length, offset);
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * Shifts the order of the given float array.
     *
     * <p>There is no special handling for multi-dimensional arrays. This method
     * does nothing for {@code null} or empty input arrays.</p>
     *
     * @param array  the array to shift, may be {@code null}
     * @param offset
     *          The number of positions to rotate the elements.  If the offset is larger than the number of elements to
     *          rotate, than the effective offset is modulo the number of elements to rotate.
     * @since 3.5
     */
    public static void shift(final float[] array, final int offset) {try{__CLR4_5_27070lvha78c4.R.inc(1189);
        __CLR4_5_27070lvha78c4.R.inc(1190);if ((((array == null)&&(__CLR4_5_27070lvha78c4.R.iget(1191)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1192)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(1193);return;
        }
        }__CLR4_5_27070lvha78c4.R.inc(1194);shift(array, 0, array.length, offset);
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * Shifts the order of the given boolean array.
     *
     * <p>There is no special handling for multi-dimensional arrays. This method
     * does nothing for {@code null} or empty input arrays.</p>
     *
     * @param array  the array to shift, may be {@code null}
     * @param offset
     *          The number of positions to rotate the elements.  If the offset is larger than the number of elements to
     *          rotate, than the effective offset is modulo the number of elements to rotate.
     * @since 3.5
     */
    public static void shift(final boolean[] array, final int offset) {try{__CLR4_5_27070lvha78c4.R.inc(1195);
        __CLR4_5_27070lvha78c4.R.inc(1196);if ((((array == null)&&(__CLR4_5_27070lvha78c4.R.iget(1197)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1198)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(1199);return;
        }
        }__CLR4_5_27070lvha78c4.R.inc(1200);shift(array, 0, array.length, offset);
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * Shifts the order of a series of elements in the given boolean array.
     *
     * <p>There is no special handling for multi-dimensional arrays. This method
     * does nothing for {@code null} or empty input arrays.</p>
     * 
     * @param array
     *            the array to shift, may be {@code null}
     * @param startIndexInclusive
     *            the starting index. Undervalue (&lt;0) is promoted to 0, overvalue (&gt;array.length) results in no
     *            change.
     * @param endIndexExclusive
     *            elements up to endIndex-1 are shifted in the array. Undervalue (&lt; start index) results in no
     *            change. Overvalue (&gt;array.length) is demoted to array length.
     * @param offset
     *          The number of positions to rotate the elements.  If the offset is larger than the number of elements to
     *          rotate, than the effective offset is modulo the number of elements to rotate.
     * @since 3.5
     */
    public static void shift(final boolean[] array, int startIndexInclusive, int endIndexExclusive, int offset) {try{__CLR4_5_27070lvha78c4.R.inc(1201);
        __CLR4_5_27070lvha78c4.R.inc(1202);if ((((array == null)&&(__CLR4_5_27070lvha78c4.R.iget(1203)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1204)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(1205);return;
        }
        }__CLR4_5_27070lvha78c4.R.inc(1206);if ((((startIndexInclusive >= array.length - 1 || endIndexExclusive <= 0)&&(__CLR4_5_27070lvha78c4.R.iget(1207)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1208)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(1209);return;
        }
        }__CLR4_5_27070lvha78c4.R.inc(1210);if ((((startIndexInclusive < 0)&&(__CLR4_5_27070lvha78c4.R.iget(1211)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1212)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(1213);startIndexInclusive = 0;
        } 
        }__CLR4_5_27070lvha78c4.R.inc(1214);if ((((endIndexExclusive >= array.length)&&(__CLR4_5_27070lvha78c4.R.iget(1215)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1216)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(1217);endIndexExclusive = array.length;
        }        
        }__CLR4_5_27070lvha78c4.R.inc(1218);int n = endIndexExclusive - startIndexInclusive;
        __CLR4_5_27070lvha78c4.R.inc(1219);if ((((n <= 1)&&(__CLR4_5_27070lvha78c4.R.iget(1220)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1221)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(1222);return;
        }
        }__CLR4_5_27070lvha78c4.R.inc(1223);offset %= n;
        __CLR4_5_27070lvha78c4.R.inc(1224);if ((((offset < 0)&&(__CLR4_5_27070lvha78c4.R.iget(1225)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1226)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(1227);offset += n;
        }
        // For algorithm explanations and proof of O(n) time complexity and O(1) space complexity
        // see https://beradrian.wordpress.com/2015/04/07/shift-an-array-in-on-in-place/
        }__CLR4_5_27070lvha78c4.R.inc(1228);while ((((n > 1 && offset > 0)&&(__CLR4_5_27070lvha78c4.R.iget(1229)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1230)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(1231);final int n_offset = n - offset;
            
            __CLR4_5_27070lvha78c4.R.inc(1232);if ((((offset > n_offset)&&(__CLR4_5_27070lvha78c4.R.iget(1233)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1234)==0&false))) {{
                __CLR4_5_27070lvha78c4.R.inc(1235);swap(array, startIndexInclusive, startIndexInclusive + n - n_offset,  n_offset);
                __CLR4_5_27070lvha78c4.R.inc(1236);n = offset;
                __CLR4_5_27070lvha78c4.R.inc(1237);offset -= n_offset;
            } }else {__CLR4_5_27070lvha78c4.R.inc(1238);if ((((offset < n_offset)&&(__CLR4_5_27070lvha78c4.R.iget(1239)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1240)==0&false))) {{
                __CLR4_5_27070lvha78c4.R.inc(1241);swap(array, startIndexInclusive, startIndexInclusive + n_offset,  offset);
                __CLR4_5_27070lvha78c4.R.inc(1242);startIndexInclusive += offset;
                __CLR4_5_27070lvha78c4.R.inc(1243);n = n_offset;
            } }else {{
                __CLR4_5_27070lvha78c4.R.inc(1244);swap(array, startIndexInclusive, startIndexInclusive + n_offset, offset);
                __CLR4_5_27070lvha78c4.R.inc(1245);break;
            }
        }}}
    }}finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * Shifts the order of a series of elements in the given byte array.
     *
     * <p>There is no special handling for multi-dimensional arrays. This method
     * does nothing for {@code null} or empty input arrays.</p>
     * 
     * @param array
     *            the array to shift, may be {@code null}
     * @param startIndexInclusive
     *            the starting index. Undervalue (&lt;0) is promoted to 0, overvalue (&gt;array.length) results in no
     *            change.
     * @param endIndexExclusive
     *            elements up to endIndex-1 are shifted in the array. Undervalue (&lt; start index) results in no
     *            change. Overvalue (&gt;array.length) is demoted to array length.
     * @param offset
     *          The number of positions to rotate the elements.  If the offset is larger than the number of elements to
     *          rotate, than the effective offset is modulo the number of elements to rotate.
     * @since 3.5
     */
    public static void shift(final byte[] array, int startIndexInclusive, int endIndexExclusive, int offset) {try{__CLR4_5_27070lvha78c4.R.inc(1246);
        __CLR4_5_27070lvha78c4.R.inc(1247);if ((((array == null)&&(__CLR4_5_27070lvha78c4.R.iget(1248)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1249)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(1250);return;
        }
        }__CLR4_5_27070lvha78c4.R.inc(1251);if ((((startIndexInclusive >= array.length - 1 || endIndexExclusive <= 0)&&(__CLR4_5_27070lvha78c4.R.iget(1252)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1253)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(1254);return;
        }
        }__CLR4_5_27070lvha78c4.R.inc(1255);if ((((startIndexInclusive < 0)&&(__CLR4_5_27070lvha78c4.R.iget(1256)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1257)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(1258);startIndexInclusive = 0;
        } 
        }__CLR4_5_27070lvha78c4.R.inc(1259);if ((((endIndexExclusive >= array.length)&&(__CLR4_5_27070lvha78c4.R.iget(1260)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1261)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(1262);endIndexExclusive = array.length;
        }        
        }__CLR4_5_27070lvha78c4.R.inc(1263);int n = endIndexExclusive - startIndexInclusive;
        __CLR4_5_27070lvha78c4.R.inc(1264);if ((((n <= 1)&&(__CLR4_5_27070lvha78c4.R.iget(1265)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1266)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(1267);return;
        }
        }__CLR4_5_27070lvha78c4.R.inc(1268);offset %= n;
        __CLR4_5_27070lvha78c4.R.inc(1269);if ((((offset < 0)&&(__CLR4_5_27070lvha78c4.R.iget(1270)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1271)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(1272);offset += n;
        }
        // For algorithm explanations and proof of O(n) time complexity and O(1) space complexity
        // see https://beradrian.wordpress.com/2015/04/07/shift-an-array-in-on-in-place/
        }__CLR4_5_27070lvha78c4.R.inc(1273);while ((((n > 1 && offset > 0)&&(__CLR4_5_27070lvha78c4.R.iget(1274)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1275)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(1276);final int n_offset = n - offset;
            
            __CLR4_5_27070lvha78c4.R.inc(1277);if ((((offset > n_offset)&&(__CLR4_5_27070lvha78c4.R.iget(1278)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1279)==0&false))) {{
                __CLR4_5_27070lvha78c4.R.inc(1280);swap(array, startIndexInclusive, startIndexInclusive + n - n_offset,  n_offset);
                __CLR4_5_27070lvha78c4.R.inc(1281);n = offset;
                __CLR4_5_27070lvha78c4.R.inc(1282);offset -= n_offset;
            } }else {__CLR4_5_27070lvha78c4.R.inc(1283);if ((((offset < n_offset)&&(__CLR4_5_27070lvha78c4.R.iget(1284)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1285)==0&false))) {{
                __CLR4_5_27070lvha78c4.R.inc(1286);swap(array, startIndexInclusive, startIndexInclusive + n_offset,  offset);
                __CLR4_5_27070lvha78c4.R.inc(1287);startIndexInclusive += offset;
                __CLR4_5_27070lvha78c4.R.inc(1288);n = n_offset;
            } }else {{
                __CLR4_5_27070lvha78c4.R.inc(1289);swap(array, startIndexInclusive, startIndexInclusive + n_offset, offset);
                __CLR4_5_27070lvha78c4.R.inc(1290);break;
            }
        }}}
    }}finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * Shifts the order of a series of elements in the given char array.
     *
     * <p>There is no special handling for multi-dimensional arrays. This method
     * does nothing for {@code null} or empty input arrays.</p>
     *
     * @param array
     *            the array to shift, may be {@code null}
     * @param startIndexInclusive
     *            the starting index. Undervalue (&lt;0) is promoted to 0, overvalue (&gt;array.length) results in no
     *            change.
     * @param endIndexExclusive
     *            elements up to endIndex-1 are shifted in the array. Undervalue (&lt; start index) results in no
     *            change. Overvalue (&gt;array.length) is demoted to array length.
     * @param offset
     *          The number of positions to rotate the elements.  If the offset is larger than the number of elements to
     *          rotate, than the effective offset is modulo the number of elements to rotate.
     * @since 3.5
     */
    public static void shift(final char[] array, int startIndexInclusive, int endIndexExclusive, int offset) {try{__CLR4_5_27070lvha78c4.R.inc(1291);
        __CLR4_5_27070lvha78c4.R.inc(1292);if ((((array == null)&&(__CLR4_5_27070lvha78c4.R.iget(1293)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1294)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(1295);return;
        }
        }__CLR4_5_27070lvha78c4.R.inc(1296);if ((((startIndexInclusive >= array.length - 1 || endIndexExclusive <= 0)&&(__CLR4_5_27070lvha78c4.R.iget(1297)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1298)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(1299);return;
        }
        }__CLR4_5_27070lvha78c4.R.inc(1300);if ((((startIndexInclusive < 0)&&(__CLR4_5_27070lvha78c4.R.iget(1301)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1302)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(1303);startIndexInclusive = 0;
        } 
        }__CLR4_5_27070lvha78c4.R.inc(1304);if ((((endIndexExclusive >= array.length)&&(__CLR4_5_27070lvha78c4.R.iget(1305)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1306)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(1307);endIndexExclusive = array.length;
        }        
        }__CLR4_5_27070lvha78c4.R.inc(1308);int n = endIndexExclusive - startIndexInclusive;
        __CLR4_5_27070lvha78c4.R.inc(1309);if ((((n <= 1)&&(__CLR4_5_27070lvha78c4.R.iget(1310)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1311)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(1312);return;
        }
        }__CLR4_5_27070lvha78c4.R.inc(1313);offset %= n;
        __CLR4_5_27070lvha78c4.R.inc(1314);if ((((offset < 0)&&(__CLR4_5_27070lvha78c4.R.iget(1315)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1316)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(1317);offset += n;
        }
        // For algorithm explanations and proof of O(n) time complexity and O(1) space complexity
        // see https://beradrian.wordpress.com/2015/04/07/shift-an-array-in-on-in-place/
        }__CLR4_5_27070lvha78c4.R.inc(1318);while ((((n > 1 && offset > 0)&&(__CLR4_5_27070lvha78c4.R.iget(1319)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1320)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(1321);final int n_offset = n - offset;
            
            __CLR4_5_27070lvha78c4.R.inc(1322);if ((((offset > n_offset)&&(__CLR4_5_27070lvha78c4.R.iget(1323)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1324)==0&false))) {{
                __CLR4_5_27070lvha78c4.R.inc(1325);swap(array, startIndexInclusive, startIndexInclusive + n - n_offset,  n_offset);
                __CLR4_5_27070lvha78c4.R.inc(1326);n = offset;
                __CLR4_5_27070lvha78c4.R.inc(1327);offset -= n_offset;
            } }else {__CLR4_5_27070lvha78c4.R.inc(1328);if ((((offset < n_offset)&&(__CLR4_5_27070lvha78c4.R.iget(1329)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1330)==0&false))) {{
                __CLR4_5_27070lvha78c4.R.inc(1331);swap(array, startIndexInclusive, startIndexInclusive + n_offset,  offset);
                __CLR4_5_27070lvha78c4.R.inc(1332);startIndexInclusive += offset;
                __CLR4_5_27070lvha78c4.R.inc(1333);n = n_offset;
            } }else {{
                __CLR4_5_27070lvha78c4.R.inc(1334);swap(array, startIndexInclusive, startIndexInclusive + n_offset, offset);
                __CLR4_5_27070lvha78c4.R.inc(1335);break;
            }
        }}}
    }}finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * Shifts the order of a series of elements in the given double array.
     *
     * <p>There is no special handling for multi-dimensional arrays. This method
     * does nothing for {@code null} or empty input arrays.</p>
     *
     * @param array
     *            the array to shift, may be {@code null}
     * @param startIndexInclusive
     *            the starting index. Undervalue (&lt;0) is promoted to 0, overvalue (&gt;array.length) results in no
     *            change.
     * @param endIndexExclusive
     *            elements up to endIndex-1 are shifted in the array. Undervalue (&lt; start index) results in no
     *            change. Overvalue (&gt;array.length) is demoted to array length.
     * @param offset
     *          The number of positions to rotate the elements.  If the offset is larger than the number of elements to
     *          rotate, than the effective offset is modulo the number of elements to rotate.
     * @since 3.5
     */
    public static void shift(final double[] array, int startIndexInclusive, int endIndexExclusive, int offset) {try{__CLR4_5_27070lvha78c4.R.inc(1336);
        __CLR4_5_27070lvha78c4.R.inc(1337);if ((((array == null)&&(__CLR4_5_27070lvha78c4.R.iget(1338)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1339)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(1340);return;
        }
        }__CLR4_5_27070lvha78c4.R.inc(1341);if ((((startIndexInclusive >= array.length - 1 || endIndexExclusive <= 0)&&(__CLR4_5_27070lvha78c4.R.iget(1342)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1343)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(1344);return;
        }
        }__CLR4_5_27070lvha78c4.R.inc(1345);if ((((startIndexInclusive < 0)&&(__CLR4_5_27070lvha78c4.R.iget(1346)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1347)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(1348);startIndexInclusive = 0;
        } 
        }__CLR4_5_27070lvha78c4.R.inc(1349);if ((((endIndexExclusive >= array.length)&&(__CLR4_5_27070lvha78c4.R.iget(1350)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1351)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(1352);endIndexExclusive = array.length;
        }        
        }__CLR4_5_27070lvha78c4.R.inc(1353);int n = endIndexExclusive - startIndexInclusive;
        __CLR4_5_27070lvha78c4.R.inc(1354);if ((((n <= 1)&&(__CLR4_5_27070lvha78c4.R.iget(1355)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1356)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(1357);return;
        }
        }__CLR4_5_27070lvha78c4.R.inc(1358);offset %= n;
        __CLR4_5_27070lvha78c4.R.inc(1359);if ((((offset < 0)&&(__CLR4_5_27070lvha78c4.R.iget(1360)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1361)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(1362);offset += n;
        }
        // For algorithm explanations and proof of O(n) time complexity and O(1) space complexity
        // see https://beradrian.wordpress.com/2015/04/07/shift-an-array-in-on-in-place/
        }__CLR4_5_27070lvha78c4.R.inc(1363);while ((((n > 1 && offset > 0)&&(__CLR4_5_27070lvha78c4.R.iget(1364)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1365)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(1366);final int n_offset = n - offset;
            
            __CLR4_5_27070lvha78c4.R.inc(1367);if ((((offset > n_offset)&&(__CLR4_5_27070lvha78c4.R.iget(1368)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1369)==0&false))) {{
                __CLR4_5_27070lvha78c4.R.inc(1370);swap(array, startIndexInclusive, startIndexInclusive + n - n_offset,  n_offset);
                __CLR4_5_27070lvha78c4.R.inc(1371);n = offset;
                __CLR4_5_27070lvha78c4.R.inc(1372);offset -= n_offset;
            } }else {__CLR4_5_27070lvha78c4.R.inc(1373);if ((((offset < n_offset)&&(__CLR4_5_27070lvha78c4.R.iget(1374)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1375)==0&false))) {{
                __CLR4_5_27070lvha78c4.R.inc(1376);swap(array, startIndexInclusive, startIndexInclusive + n_offset,  offset);
                __CLR4_5_27070lvha78c4.R.inc(1377);startIndexInclusive += offset;
                __CLR4_5_27070lvha78c4.R.inc(1378);n = n_offset;
            } }else {{
                __CLR4_5_27070lvha78c4.R.inc(1379);swap(array, startIndexInclusive, startIndexInclusive + n_offset, offset);
                __CLR4_5_27070lvha78c4.R.inc(1380);break;
            }
        }}}
    }}finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * Shifts the order of a series of elements in the given float array.
     *
     * <p>There is no special handling for multi-dimensional arrays. This method
     * does nothing for {@code null} or empty input arrays.</p>
     *
     * @param array
     *            the array to shift, may be {@code null}
     * @param startIndexInclusive
     *            the starting index. Undervalue (&lt;0) is promoted to 0, overvalue (&gt;array.length) results in no
     *            change.
     * @param endIndexExclusive
     *            elements up to endIndex-1 are shifted in the array. Undervalue (&lt; start index) results in no
     *            change. Overvalue (&gt;array.length) is demoted to array length.
     * @param offset
     *          The number of positions to rotate the elements.  If the offset is larger than the number of elements to
     *          rotate, than the effective offset is modulo the number of elements to rotate.
     * @since 3.5
     */
    public static void shift(final float[] array, int startIndexInclusive, int endIndexExclusive, int offset) {try{__CLR4_5_27070lvha78c4.R.inc(1381);
        __CLR4_5_27070lvha78c4.R.inc(1382);if ((((array == null)&&(__CLR4_5_27070lvha78c4.R.iget(1383)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1384)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(1385);return;
        }
        }__CLR4_5_27070lvha78c4.R.inc(1386);if ((((startIndexInclusive >= array.length - 1 || endIndexExclusive <= 0)&&(__CLR4_5_27070lvha78c4.R.iget(1387)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1388)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(1389);return;
        }
        }__CLR4_5_27070lvha78c4.R.inc(1390);if ((((startIndexInclusive < 0)&&(__CLR4_5_27070lvha78c4.R.iget(1391)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1392)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(1393);startIndexInclusive = 0;
        } 
        }__CLR4_5_27070lvha78c4.R.inc(1394);if ((((endIndexExclusive >= array.length)&&(__CLR4_5_27070lvha78c4.R.iget(1395)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1396)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(1397);endIndexExclusive = array.length;
        }        
        }__CLR4_5_27070lvha78c4.R.inc(1398);int n = endIndexExclusive - startIndexInclusive;
        __CLR4_5_27070lvha78c4.R.inc(1399);if ((((n <= 1)&&(__CLR4_5_27070lvha78c4.R.iget(1400)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1401)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(1402);return;
        }
        }__CLR4_5_27070lvha78c4.R.inc(1403);offset %= n;
        __CLR4_5_27070lvha78c4.R.inc(1404);if ((((offset < 0)&&(__CLR4_5_27070lvha78c4.R.iget(1405)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1406)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(1407);offset += n;
        }
        // For algorithm explanations and proof of O(n) time complexity and O(1) space complexity
        // see https://beradrian.wordpress.com/2015/04/07/shift-an-array-in-on-in-place/
        }__CLR4_5_27070lvha78c4.R.inc(1408);while ((((n > 1 && offset > 0)&&(__CLR4_5_27070lvha78c4.R.iget(1409)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1410)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(1411);final int n_offset = n - offset;
            
            __CLR4_5_27070lvha78c4.R.inc(1412);if ((((offset > n_offset)&&(__CLR4_5_27070lvha78c4.R.iget(1413)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1414)==0&false))) {{
                __CLR4_5_27070lvha78c4.R.inc(1415);swap(array, startIndexInclusive, startIndexInclusive + n - n_offset,  n_offset);
                __CLR4_5_27070lvha78c4.R.inc(1416);n = offset;
                __CLR4_5_27070lvha78c4.R.inc(1417);offset -= n_offset;
            } }else {__CLR4_5_27070lvha78c4.R.inc(1418);if ((((offset < n_offset)&&(__CLR4_5_27070lvha78c4.R.iget(1419)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1420)==0&false))) {{
                __CLR4_5_27070lvha78c4.R.inc(1421);swap(array, startIndexInclusive, startIndexInclusive + n_offset,  offset);
                __CLR4_5_27070lvha78c4.R.inc(1422);startIndexInclusive += offset;
                __CLR4_5_27070lvha78c4.R.inc(1423);n = n_offset;
            } }else {{
                __CLR4_5_27070lvha78c4.R.inc(1424);swap(array, startIndexInclusive, startIndexInclusive + n_offset, offset);
                __CLR4_5_27070lvha78c4.R.inc(1425);break;
            }
        }}}
    }}finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * Shifts the order of a series of elements in the given int array.
     *
     * <p>There is no special handling for multi-dimensional arrays. This method
     * does nothing for {@code null} or empty input arrays.</p>
     *
     * @param array
     *            the array to shift, may be {@code null}
     * @param startIndexInclusive
     *            the starting index. Undervalue (&lt;0) is promoted to 0, overvalue (&gt;array.length) results in no
     *            change.
     * @param endIndexExclusive
     *            elements up to endIndex-1 are shifted in the array. Undervalue (&lt; start index) results in no
     *            change. Overvalue (&gt;array.length) is demoted to array length.
     * @param offset
     *          The number of positions to rotate the elements.  If the offset is larger than the number of elements to
     *          rotate, than the effective offset is modulo the number of elements to rotate.
     * @since 3.5
     */
    public static void shift(final int[] array, int startIndexInclusive, int endIndexExclusive, int offset) {try{__CLR4_5_27070lvha78c4.R.inc(1426);
        __CLR4_5_27070lvha78c4.R.inc(1427);if ((((array == null)&&(__CLR4_5_27070lvha78c4.R.iget(1428)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1429)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(1430);return;
        }
        }__CLR4_5_27070lvha78c4.R.inc(1431);if ((((startIndexInclusive >= array.length - 1 || endIndexExclusive <= 0)&&(__CLR4_5_27070lvha78c4.R.iget(1432)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1433)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(1434);return;
        }
        }__CLR4_5_27070lvha78c4.R.inc(1435);if ((((startIndexInclusive < 0)&&(__CLR4_5_27070lvha78c4.R.iget(1436)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1437)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(1438);startIndexInclusive = 0;
        } 
        }__CLR4_5_27070lvha78c4.R.inc(1439);if ((((endIndexExclusive >= array.length)&&(__CLR4_5_27070lvha78c4.R.iget(1440)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1441)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(1442);endIndexExclusive = array.length;
        }        
        }__CLR4_5_27070lvha78c4.R.inc(1443);int n = endIndexExclusive - startIndexInclusive;
        __CLR4_5_27070lvha78c4.R.inc(1444);if ((((n <= 1)&&(__CLR4_5_27070lvha78c4.R.iget(1445)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1446)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(1447);return;
        }
        }__CLR4_5_27070lvha78c4.R.inc(1448);offset %= n;
        __CLR4_5_27070lvha78c4.R.inc(1449);if ((((offset < 0)&&(__CLR4_5_27070lvha78c4.R.iget(1450)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1451)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(1452);offset += n;
        }
        // For algorithm explanations and proof of O(n) time complexity and O(1) space complexity
        // see https://beradrian.wordpress.com/2015/04/07/shift-an-array-in-on-in-place/
        }__CLR4_5_27070lvha78c4.R.inc(1453);while ((((n > 1 && offset > 0)&&(__CLR4_5_27070lvha78c4.R.iget(1454)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1455)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(1456);final int n_offset = n - offset;
            
            __CLR4_5_27070lvha78c4.R.inc(1457);if ((((offset > n_offset)&&(__CLR4_5_27070lvha78c4.R.iget(1458)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1459)==0&false))) {{
                __CLR4_5_27070lvha78c4.R.inc(1460);swap(array, startIndexInclusive, startIndexInclusive + n - n_offset,  n_offset);
                __CLR4_5_27070lvha78c4.R.inc(1461);n = offset;
                __CLR4_5_27070lvha78c4.R.inc(1462);offset -= n_offset;
            } }else {__CLR4_5_27070lvha78c4.R.inc(1463);if ((((offset < n_offset)&&(__CLR4_5_27070lvha78c4.R.iget(1464)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1465)==0&false))) {{
                __CLR4_5_27070lvha78c4.R.inc(1466);swap(array, startIndexInclusive, startIndexInclusive + n_offset,  offset);
                __CLR4_5_27070lvha78c4.R.inc(1467);startIndexInclusive += offset;
                __CLR4_5_27070lvha78c4.R.inc(1468);n = n_offset;
            } }else {{
                __CLR4_5_27070lvha78c4.R.inc(1469);swap(array, startIndexInclusive, startIndexInclusive + n_offset, offset);
                __CLR4_5_27070lvha78c4.R.inc(1470);break;
            }
        }}}
    }}finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * Shifts the order of a series of elements in the given long array.
     *
     * <p>There is no special handling for multi-dimensional arrays. This method
     * does nothing for {@code null} or empty input arrays.</p>
     *
     * @param array
     *            the array to shift, may be {@code null}
     * @param startIndexInclusive
     *            the starting index. Undervalue (&lt;0) is promoted to 0, overvalue (&gt;array.length) results in no
     *            change.
     * @param endIndexExclusive
     *            elements up to endIndex-1 are shifted in the array. Undervalue (&lt; start index) results in no
     *            change. Overvalue (&gt;array.length) is demoted to array length.
     * @param offset
     *          The number of positions to rotate the elements.  If the offset is larger than the number of elements to
     *          rotate, than the effective offset is modulo the number of elements to rotate.
     * @since 3.5
     */
    public static void shift(final long[] array, int startIndexInclusive, int endIndexExclusive, int offset) {try{__CLR4_5_27070lvha78c4.R.inc(1471);
        __CLR4_5_27070lvha78c4.R.inc(1472);if ((((array == null)&&(__CLR4_5_27070lvha78c4.R.iget(1473)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1474)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(1475);return;
        }
        }__CLR4_5_27070lvha78c4.R.inc(1476);if ((((startIndexInclusive >= array.length - 1 || endIndexExclusive <= 0)&&(__CLR4_5_27070lvha78c4.R.iget(1477)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1478)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(1479);return;
        }
        }__CLR4_5_27070lvha78c4.R.inc(1480);if ((((startIndexInclusive < 0)&&(__CLR4_5_27070lvha78c4.R.iget(1481)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1482)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(1483);startIndexInclusive = 0;
        } 
        }__CLR4_5_27070lvha78c4.R.inc(1484);if ((((endIndexExclusive >= array.length)&&(__CLR4_5_27070lvha78c4.R.iget(1485)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1486)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(1487);endIndexExclusive = array.length;
        }        
        }__CLR4_5_27070lvha78c4.R.inc(1488);int n = endIndexExclusive - startIndexInclusive;
        __CLR4_5_27070lvha78c4.R.inc(1489);if ((((n <= 1)&&(__CLR4_5_27070lvha78c4.R.iget(1490)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1491)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(1492);return;
        }
        }__CLR4_5_27070lvha78c4.R.inc(1493);offset %= n;
        __CLR4_5_27070lvha78c4.R.inc(1494);if ((((offset < 0)&&(__CLR4_5_27070lvha78c4.R.iget(1495)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1496)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(1497);offset += n;
        }
        // For algorithm explanations and proof of O(n) time complexity and O(1) space complexity
        // see https://beradrian.wordpress.com/2015/04/07/shift-an-array-in-on-in-place/
        }__CLR4_5_27070lvha78c4.R.inc(1498);while ((((n > 1 && offset > 0)&&(__CLR4_5_27070lvha78c4.R.iget(1499)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1500)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(1501);final int n_offset = n - offset;
            
            __CLR4_5_27070lvha78c4.R.inc(1502);if ((((offset > n_offset)&&(__CLR4_5_27070lvha78c4.R.iget(1503)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1504)==0&false))) {{
                __CLR4_5_27070lvha78c4.R.inc(1505);swap(array, startIndexInclusive, startIndexInclusive + n - n_offset,  n_offset);
                __CLR4_5_27070lvha78c4.R.inc(1506);n = offset;
                __CLR4_5_27070lvha78c4.R.inc(1507);offset -= n_offset;
            } }else {__CLR4_5_27070lvha78c4.R.inc(1508);if ((((offset < n_offset)&&(__CLR4_5_27070lvha78c4.R.iget(1509)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1510)==0&false))) {{
                __CLR4_5_27070lvha78c4.R.inc(1511);swap(array, startIndexInclusive, startIndexInclusive + n_offset,  offset);
                __CLR4_5_27070lvha78c4.R.inc(1512);startIndexInclusive += offset;
                __CLR4_5_27070lvha78c4.R.inc(1513);n = n_offset;
            } }else {{
                __CLR4_5_27070lvha78c4.R.inc(1514);swap(array, startIndexInclusive, startIndexInclusive + n_offset, offset);
                __CLR4_5_27070lvha78c4.R.inc(1515);break;
            }
        }}}
    }}finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * Shifts the order of a series of elements in the given array.
     *
     * <p>There is no special handling for multi-dimensional arrays. This method
     * does nothing for {@code null} or empty input arrays.</p>
     *
     * @param array
     *            the array to shift, may be {@code null}
     * @param startIndexInclusive
     *            the starting index. Undervalue (&lt;0) is promoted to 0, overvalue (&gt;array.length) results in no
     *            change.
     * @param endIndexExclusive
     *            elements up to endIndex-1 are shifted in the array. Undervalue (&lt; start index) results in no
     *            change. Overvalue (&gt;array.length) is demoted to array length.
     * @param offset
     *          The number of positions to rotate the elements.  If the offset is larger than the number of elements to
     *          rotate, than the effective offset is modulo the number of elements to rotate.
     * @since 3.5
     */
    public static void shift(final Object[] array, int startIndexInclusive, int endIndexExclusive, int offset) {try{__CLR4_5_27070lvha78c4.R.inc(1516);
        __CLR4_5_27070lvha78c4.R.inc(1517);if ((((array == null)&&(__CLR4_5_27070lvha78c4.R.iget(1518)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1519)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(1520);return;
        }
        }__CLR4_5_27070lvha78c4.R.inc(1521);if ((((startIndexInclusive >= array.length - 1 || endIndexExclusive <= 0)&&(__CLR4_5_27070lvha78c4.R.iget(1522)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1523)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(1524);return;
        }
        }__CLR4_5_27070lvha78c4.R.inc(1525);if ((((startIndexInclusive < 0)&&(__CLR4_5_27070lvha78c4.R.iget(1526)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1527)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(1528);startIndexInclusive = 0;
        } 
        }__CLR4_5_27070lvha78c4.R.inc(1529);if ((((endIndexExclusive >= array.length)&&(__CLR4_5_27070lvha78c4.R.iget(1530)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1531)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(1532);endIndexExclusive = array.length;
        }        
        }__CLR4_5_27070lvha78c4.R.inc(1533);int n = endIndexExclusive - startIndexInclusive;
        __CLR4_5_27070lvha78c4.R.inc(1534);if ((((n <= 1)&&(__CLR4_5_27070lvha78c4.R.iget(1535)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1536)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(1537);return;
        }
        }__CLR4_5_27070lvha78c4.R.inc(1538);offset %= n;
        __CLR4_5_27070lvha78c4.R.inc(1539);if ((((offset < 0)&&(__CLR4_5_27070lvha78c4.R.iget(1540)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1541)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(1542);offset += n;
        }
        // For algorithm explanations and proof of O(n) time complexity and O(1) space complexity
        // see https://beradrian.wordpress.com/2015/04/07/shift-an-array-in-on-in-place/
        }__CLR4_5_27070lvha78c4.R.inc(1543);while ((((n > 1 && offset > 0)&&(__CLR4_5_27070lvha78c4.R.iget(1544)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1545)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(1546);final int n_offset = n - offset;
            
            __CLR4_5_27070lvha78c4.R.inc(1547);if ((((offset > n_offset)&&(__CLR4_5_27070lvha78c4.R.iget(1548)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1549)==0&false))) {{
                __CLR4_5_27070lvha78c4.R.inc(1550);swap(array, startIndexInclusive, startIndexInclusive + n - n_offset,  n_offset);
                __CLR4_5_27070lvha78c4.R.inc(1551);n = offset;
                __CLR4_5_27070lvha78c4.R.inc(1552);offset -= n_offset;
            } }else {__CLR4_5_27070lvha78c4.R.inc(1553);if ((((offset < n_offset)&&(__CLR4_5_27070lvha78c4.R.iget(1554)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1555)==0&false))) {{
                __CLR4_5_27070lvha78c4.R.inc(1556);swap(array, startIndexInclusive, startIndexInclusive + n_offset,  offset);
                __CLR4_5_27070lvha78c4.R.inc(1557);startIndexInclusive += offset;
                __CLR4_5_27070lvha78c4.R.inc(1558);n = n_offset;
            } }else {{
                __CLR4_5_27070lvha78c4.R.inc(1559);swap(array, startIndexInclusive, startIndexInclusive + n_offset, offset);
                __CLR4_5_27070lvha78c4.R.inc(1560);break;
            }
        }}}
    }}finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * Shifts the order of a series of elements in the given short array.
     *
     * <p>There is no special handling for multi-dimensional arrays. This method
     * does nothing for {@code null} or empty input arrays.</p>
     *
     * @param array
     *            the array to shift, may be {@code null}
     * @param startIndexInclusive
     *            the starting index. Undervalue (&lt;0) is promoted to 0, overvalue (&gt;array.length) results in no
     *            change.
     * @param endIndexExclusive
     *            elements up to endIndex-1 are shifted in the array. Undervalue (&lt; start index) results in no
     *            change. Overvalue (&gt;array.length) is demoted to array length.
     * @param offset
     *          The number of positions to rotate the elements.  If the offset is larger than the number of elements to
     *          rotate, than the effective offset is modulo the number of elements to rotate.
     * @since 3.5
     */
    public static void shift(final short[] array, int startIndexInclusive, int endIndexExclusive, int offset) {try{__CLR4_5_27070lvha78c4.R.inc(1561);
        __CLR4_5_27070lvha78c4.R.inc(1562);if ((((array == null)&&(__CLR4_5_27070lvha78c4.R.iget(1563)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1564)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(1565);return;
        }
        }__CLR4_5_27070lvha78c4.R.inc(1566);if ((((startIndexInclusive >= array.length - 1 || endIndexExclusive <= 0)&&(__CLR4_5_27070lvha78c4.R.iget(1567)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1568)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(1569);return;
        }
        }__CLR4_5_27070lvha78c4.R.inc(1570);if ((((startIndexInclusive < 0)&&(__CLR4_5_27070lvha78c4.R.iget(1571)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1572)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(1573);startIndexInclusive = 0;
        } 
        }__CLR4_5_27070lvha78c4.R.inc(1574);if ((((endIndexExclusive >= array.length)&&(__CLR4_5_27070lvha78c4.R.iget(1575)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1576)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(1577);endIndexExclusive = array.length;
        }        
        }__CLR4_5_27070lvha78c4.R.inc(1578);int n = endIndexExclusive - startIndexInclusive;
        __CLR4_5_27070lvha78c4.R.inc(1579);if ((((n <= 1)&&(__CLR4_5_27070lvha78c4.R.iget(1580)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1581)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(1582);return;
        }
        }__CLR4_5_27070lvha78c4.R.inc(1583);offset %= n;
        __CLR4_5_27070lvha78c4.R.inc(1584);if ((((offset < 0)&&(__CLR4_5_27070lvha78c4.R.iget(1585)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1586)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(1587);offset += n;
        }
        // For algorithm explanations and proof of O(n) time complexity and O(1) space complexity
        // see https://beradrian.wordpress.com/2015/04/07/shift-an-array-in-on-in-place/
        }__CLR4_5_27070lvha78c4.R.inc(1588);while ((((n > 1 && offset > 0)&&(__CLR4_5_27070lvha78c4.R.iget(1589)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1590)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(1591);final int n_offset = n - offset;
            
            __CLR4_5_27070lvha78c4.R.inc(1592);if ((((offset > n_offset)&&(__CLR4_5_27070lvha78c4.R.iget(1593)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1594)==0&false))) {{
                __CLR4_5_27070lvha78c4.R.inc(1595);swap(array, startIndexInclusive, startIndexInclusive + n - n_offset,  n_offset);
                __CLR4_5_27070lvha78c4.R.inc(1596);n = offset;
                __CLR4_5_27070lvha78c4.R.inc(1597);offset -= n_offset;
            } }else {__CLR4_5_27070lvha78c4.R.inc(1598);if ((((offset < n_offset)&&(__CLR4_5_27070lvha78c4.R.iget(1599)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1600)==0&false))) {{
                __CLR4_5_27070lvha78c4.R.inc(1601);swap(array, startIndexInclusive, startIndexInclusive + n_offset,  offset);
                __CLR4_5_27070lvha78c4.R.inc(1602);startIndexInclusive += offset;
                __CLR4_5_27070lvha78c4.R.inc(1603);n = n_offset;
            } }else {{
                __CLR4_5_27070lvha78c4.R.inc(1604);swap(array, startIndexInclusive, startIndexInclusive + n_offset, offset);
                __CLR4_5_27070lvha78c4.R.inc(1605);break;
            }
        }}}
    }}finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    // IndexOf search
    // ----------------------------------------------------------------------

    // Object IndexOf
    //-----------------------------------------------------------------------
    /**
     * <p>Finds the index of the given object in the array.
     *
     * <p>This method returns {@link #INDEX_NOT_FOUND} ({@code -1}) for a {@code null} input array.
     *
     * @param array  the array to search through for the object, may be {@code null}
     * @param objectToFind  the object to find, may be {@code null}
     * @return the index of the object within the array,
     *  {@link #INDEX_NOT_FOUND} ({@code -1}) if not found or {@code null} array input
     */
    public static int indexOf(final Object[] array, final Object objectToFind) {try{__CLR4_5_27070lvha78c4.R.inc(1606);
        __CLR4_5_27070lvha78c4.R.inc(1607);return indexOf(array, objectToFind, 0);
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Finds the index of the given object in the array starting at the given index.
     *
     * <p>This method returns {@link #INDEX_NOT_FOUND} ({@code -1}) for a {@code null} input array.
     *
     * <p>A negative startIndex is treated as zero. A startIndex larger than the array
     * length will return {@link #INDEX_NOT_FOUND} ({@code -1}).
     *
     * @param array  the array to search through for the object, may be {@code null}
     * @param objectToFind  the object to find, may be {@code null}
     * @param startIndex  the index to start searching at
     * @return the index of the object within the array starting at the index,
     *  {@link #INDEX_NOT_FOUND} ({@code -1}) if not found or {@code null} array input
     */
    public static int indexOf(final Object[] array, final Object objectToFind, int startIndex) {try{__CLR4_5_27070lvha78c4.R.inc(1608);
        __CLR4_5_27070lvha78c4.R.inc(1609);if ((((array == null)&&(__CLR4_5_27070lvha78c4.R.iget(1610)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1611)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(1612);return INDEX_NOT_FOUND;
        }
        }__CLR4_5_27070lvha78c4.R.inc(1613);if ((((startIndex < 0)&&(__CLR4_5_27070lvha78c4.R.iget(1614)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1615)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(1616);startIndex = 0;
        }
        }__CLR4_5_27070lvha78c4.R.inc(1617);if ((((objectToFind == null)&&(__CLR4_5_27070lvha78c4.R.iget(1618)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1619)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(1620);for (int i = startIndex; (((i < array.length)&&(__CLR4_5_27070lvha78c4.R.iget(1621)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1622)==0&false)); i++) {{
                __CLR4_5_27070lvha78c4.R.inc(1623);if ((((array[i] == null)&&(__CLR4_5_27070lvha78c4.R.iget(1624)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1625)==0&false))) {{
                    __CLR4_5_27070lvha78c4.R.inc(1626);return i;
                }
            }}
        }} }else {{
            __CLR4_5_27070lvha78c4.R.inc(1627);for (int i = startIndex; (((i < array.length)&&(__CLR4_5_27070lvha78c4.R.iget(1628)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1629)==0&false)); i++) {{
                __CLR4_5_27070lvha78c4.R.inc(1630);if ((((objectToFind.equals(array[i]))&&(__CLR4_5_27070lvha78c4.R.iget(1631)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1632)==0&false))) {{
                    __CLR4_5_27070lvha78c4.R.inc(1633);return i;
                }
            }}
        }}
        }__CLR4_5_27070lvha78c4.R.inc(1634);return INDEX_NOT_FOUND;
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Finds the last index of the given object within the array.
     *
     * <p>This method returns {@link #INDEX_NOT_FOUND} ({@code -1}) for a {@code null} input array.
     *
     * @param array  the array to traverse backwards looking for the object, may be {@code null}
     * @param objectToFind  the object to find, may be {@code null}
     * @return the last index of the object within the array,
     *  {@link #INDEX_NOT_FOUND} ({@code -1}) if not found or {@code null} array input
     */
    public static int lastIndexOf(final Object[] array, final Object objectToFind) {try{__CLR4_5_27070lvha78c4.R.inc(1635);
        __CLR4_5_27070lvha78c4.R.inc(1636);return lastIndexOf(array, objectToFind, Integer.MAX_VALUE);
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Finds the last index of the given object in the array starting at the given index.
     *
     * <p>This method returns {@link #INDEX_NOT_FOUND} ({@code -1}) for a {@code null} input array.
     *
     * <p>A negative startIndex will return {@link #INDEX_NOT_FOUND} ({@code -1}). A startIndex larger than
     * the array length will search from the end of the array.
     *
     * @param array  the array to traverse for looking for the object, may be {@code null}
     * @param objectToFind  the object to find, may be {@code null}
     * @param startIndex  the start index to traverse backwards from
     * @return the last index of the object within the array,
     *  {@link #INDEX_NOT_FOUND} ({@code -1}) if not found or {@code null} array input
     */
    public static int lastIndexOf(final Object[] array, final Object objectToFind, int startIndex) {try{__CLR4_5_27070lvha78c4.R.inc(1637);
        __CLR4_5_27070lvha78c4.R.inc(1638);if ((((array == null)&&(__CLR4_5_27070lvha78c4.R.iget(1639)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1640)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(1641);return INDEX_NOT_FOUND;
        }
        }__CLR4_5_27070lvha78c4.R.inc(1642);if ((((startIndex < 0)&&(__CLR4_5_27070lvha78c4.R.iget(1643)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1644)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(1645);return INDEX_NOT_FOUND;
        } }else {__CLR4_5_27070lvha78c4.R.inc(1646);if ((((startIndex >= array.length)&&(__CLR4_5_27070lvha78c4.R.iget(1647)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1648)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(1649);startIndex = array.length - 1;
        }
        }}__CLR4_5_27070lvha78c4.R.inc(1650);if ((((objectToFind == null)&&(__CLR4_5_27070lvha78c4.R.iget(1651)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1652)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(1653);for (int i = startIndex; (((i >= 0)&&(__CLR4_5_27070lvha78c4.R.iget(1654)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1655)==0&false)); i--) {{
                __CLR4_5_27070lvha78c4.R.inc(1656);if ((((array[i] == null)&&(__CLR4_5_27070lvha78c4.R.iget(1657)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1658)==0&false))) {{
                    __CLR4_5_27070lvha78c4.R.inc(1659);return i;
                }
            }}
        }} }else {__CLR4_5_27070lvha78c4.R.inc(1660);if ((((array.getClass().getComponentType().isInstance(objectToFind))&&(__CLR4_5_27070lvha78c4.R.iget(1661)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1662)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(1663);for (int i = startIndex; (((i >= 0)&&(__CLR4_5_27070lvha78c4.R.iget(1664)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1665)==0&false)); i--) {{
                __CLR4_5_27070lvha78c4.R.inc(1666);if ((((objectToFind.equals(array[i]))&&(__CLR4_5_27070lvha78c4.R.iget(1667)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1668)==0&false))) {{
                    __CLR4_5_27070lvha78c4.R.inc(1669);return i;
                }
            }}
        }}
        }}__CLR4_5_27070lvha78c4.R.inc(1670);return INDEX_NOT_FOUND;
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Checks if the object is in the given array.
     *
     * <p>The method returns {@code false} if a {@code null} array is passed in.
     *
     * @param array  the array to search through
     * @param objectToFind  the object to find
     * @return {@code true} if the array contains the object
     */
    public static boolean contains(final Object[] array, final Object objectToFind) {try{__CLR4_5_27070lvha78c4.R.inc(1671);
        __CLR4_5_27070lvha78c4.R.inc(1672);return indexOf(array, objectToFind) != INDEX_NOT_FOUND;
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    // long IndexOf
    //-----------------------------------------------------------------------
    /**
     * <p>Finds the index of the given value in the array.
     *
     * <p>This method returns {@link #INDEX_NOT_FOUND} ({@code -1}) for a {@code null} input array.
     *
     * @param array  the array to search through for the object, may be {@code null}
     * @param valueToFind  the value to find
     * @return the index of the value within the array,
     *  {@link #INDEX_NOT_FOUND} ({@code -1}) if not found or {@code null} array input
     */
    public static int indexOf(final long[] array, final long valueToFind) {try{__CLR4_5_27070lvha78c4.R.inc(1673);
        __CLR4_5_27070lvha78c4.R.inc(1674);return indexOf(array, valueToFind, 0);
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Finds the index of the given value in the array starting at the given index.
     *
     * <p>This method returns {@link #INDEX_NOT_FOUND} ({@code -1}) for a {@code null} input array.
     *
     * <p>A negative startIndex is treated as zero. A startIndex larger than the array
     * length will return {@link #INDEX_NOT_FOUND} ({@code -1}).
     *
     * @param array  the array to search through for the object, may be {@code null}
     * @param valueToFind  the value to find
     * @param startIndex  the index to start searching at
     * @return the index of the value within the array,
     *  {@link #INDEX_NOT_FOUND} ({@code -1}) if not found or {@code null} array input
     */
    public static int indexOf(final long[] array, final long valueToFind, int startIndex) {try{__CLR4_5_27070lvha78c4.R.inc(1675);
        __CLR4_5_27070lvha78c4.R.inc(1676);if ((((array == null)&&(__CLR4_5_27070lvha78c4.R.iget(1677)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1678)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(1679);return INDEX_NOT_FOUND;
        }
        }__CLR4_5_27070lvha78c4.R.inc(1680);if ((((startIndex < 0)&&(__CLR4_5_27070lvha78c4.R.iget(1681)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1682)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(1683);startIndex = 0;
        }
        }__CLR4_5_27070lvha78c4.R.inc(1684);for (int i = startIndex; (((i < array.length)&&(__CLR4_5_27070lvha78c4.R.iget(1685)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1686)==0&false)); i++) {{
            __CLR4_5_27070lvha78c4.R.inc(1687);if ((((valueToFind == array[i])&&(__CLR4_5_27070lvha78c4.R.iget(1688)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1689)==0&false))) {{
                __CLR4_5_27070lvha78c4.R.inc(1690);return i;
            }
        }}
        }__CLR4_5_27070lvha78c4.R.inc(1691);return INDEX_NOT_FOUND;
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Finds the last index of the given value within the array.
     *
     * <p>This method returns {@link #INDEX_NOT_FOUND} ({@code -1}) for a {@code null} input array.
     *
     * @param array  the array to traverse backwards looking for the object, may be {@code null}
     * @param valueToFind  the object to find
     * @return the last index of the value within the array,
     *  {@link #INDEX_NOT_FOUND} ({@code -1}) if not found or {@code null} array input
     */
    public static int lastIndexOf(final long[] array, final long valueToFind) {try{__CLR4_5_27070lvha78c4.R.inc(1692);
        __CLR4_5_27070lvha78c4.R.inc(1693);return lastIndexOf(array, valueToFind, Integer.MAX_VALUE);
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Finds the last index of the given value in the array starting at the given index.
     *
     * <p>This method returns {@link #INDEX_NOT_FOUND} ({@code -1}) for a {@code null} input array.
     *
     * <p>A negative startIndex will return {@link #INDEX_NOT_FOUND} ({@code -1}). A startIndex larger than the
     * array length will search from the end of the array.
     *
     * @param array  the array to traverse for looking for the object, may be {@code null}
     * @param valueToFind  the value to find
     * @param startIndex  the start index to traverse backwards from
     * @return the last index of the value within the array,
     *  {@link #INDEX_NOT_FOUND} ({@code -1}) if not found or {@code null} array input
     */
    public static int lastIndexOf(final long[] array, final long valueToFind, int startIndex) {try{__CLR4_5_27070lvha78c4.R.inc(1694);
        __CLR4_5_27070lvha78c4.R.inc(1695);if ((((array == null)&&(__CLR4_5_27070lvha78c4.R.iget(1696)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1697)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(1698);return INDEX_NOT_FOUND;
        }
        }__CLR4_5_27070lvha78c4.R.inc(1699);if ((((startIndex < 0)&&(__CLR4_5_27070lvha78c4.R.iget(1700)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1701)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(1702);return INDEX_NOT_FOUND;
        } }else {__CLR4_5_27070lvha78c4.R.inc(1703);if ((((startIndex >= array.length)&&(__CLR4_5_27070lvha78c4.R.iget(1704)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1705)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(1706);startIndex = array.length - 1;
        }
        }}__CLR4_5_27070lvha78c4.R.inc(1707);for (int i = startIndex; (((i >= 0)&&(__CLR4_5_27070lvha78c4.R.iget(1708)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1709)==0&false)); i--) {{
            __CLR4_5_27070lvha78c4.R.inc(1710);if ((((valueToFind == array[i])&&(__CLR4_5_27070lvha78c4.R.iget(1711)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1712)==0&false))) {{
                __CLR4_5_27070lvha78c4.R.inc(1713);return i;
            }
        }}
        }__CLR4_5_27070lvha78c4.R.inc(1714);return INDEX_NOT_FOUND;
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Checks if the value is in the given array.
     *
     * <p>The method returns {@code false} if a {@code null} array is passed in.
     *
     * @param array  the array to search through
     * @param valueToFind  the value to find
     * @return {@code true} if the array contains the object
     */
    public static boolean contains(final long[] array, final long valueToFind) {try{__CLR4_5_27070lvha78c4.R.inc(1715);
        __CLR4_5_27070lvha78c4.R.inc(1716);return indexOf(array, valueToFind) != INDEX_NOT_FOUND;
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    // int IndexOf
    //-----------------------------------------------------------------------
    /**
     * <p>Finds the index of the given value in the array.
     *
     * <p>This method returns {@link #INDEX_NOT_FOUND} ({@code -1}) for a {@code null} input array.
     *
     * @param array  the array to search through for the object, may be {@code null}
     * @param valueToFind  the value to find
     * @return the index of the value within the array,
     *  {@link #INDEX_NOT_FOUND} ({@code -1}) if not found or {@code null} array input
     */
    public static int indexOf(final int[] array, final int valueToFind) {try{__CLR4_5_27070lvha78c4.R.inc(1717);
        __CLR4_5_27070lvha78c4.R.inc(1718);return indexOf(array, valueToFind, 0);
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Finds the index of the given value in the array starting at the given index.
     *
     * <p>This method returns {@link #INDEX_NOT_FOUND} ({@code -1}) for a {@code null} input array.
     *
     * <p>A negative startIndex is treated as zero. A startIndex larger than the array
     * length will return {@link #INDEX_NOT_FOUND} ({@code -1}).
     *
     * @param array  the array to search through for the object, may be {@code null}
     * @param valueToFind  the value to find
     * @param startIndex  the index to start searching at
     * @return the index of the value within the array,
     *  {@link #INDEX_NOT_FOUND} ({@code -1}) if not found or {@code null} array input
     */
    public static int indexOf(final int[] array, final int valueToFind, int startIndex) {try{__CLR4_5_27070lvha78c4.R.inc(1719);
        __CLR4_5_27070lvha78c4.R.inc(1720);if ((((array == null)&&(__CLR4_5_27070lvha78c4.R.iget(1721)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1722)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(1723);return INDEX_NOT_FOUND;
        }
        }__CLR4_5_27070lvha78c4.R.inc(1724);if ((((startIndex < 0)&&(__CLR4_5_27070lvha78c4.R.iget(1725)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1726)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(1727);startIndex = 0;
        }
        }__CLR4_5_27070lvha78c4.R.inc(1728);for (int i = startIndex; (((i < array.length)&&(__CLR4_5_27070lvha78c4.R.iget(1729)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1730)==0&false)); i++) {{
            __CLR4_5_27070lvha78c4.R.inc(1731);if ((((valueToFind == array[i])&&(__CLR4_5_27070lvha78c4.R.iget(1732)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1733)==0&false))) {{
                __CLR4_5_27070lvha78c4.R.inc(1734);return i;
            }
        }}
        }__CLR4_5_27070lvha78c4.R.inc(1735);return INDEX_NOT_FOUND;
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Finds the last index of the given value within the array.
     *
     * <p>This method returns {@link #INDEX_NOT_FOUND} ({@code -1}) for a {@code null} input array.
     *
     * @param array  the array to traverse backwards looking for the object, may be {@code null}
     * @param valueToFind  the object to find
     * @return the last index of the value within the array,
     *  {@link #INDEX_NOT_FOUND} ({@code -1}) if not found or {@code null} array input
     */
    public static int lastIndexOf(final int[] array, final int valueToFind) {try{__CLR4_5_27070lvha78c4.R.inc(1736);
        __CLR4_5_27070lvha78c4.R.inc(1737);return lastIndexOf(array, valueToFind, Integer.MAX_VALUE);
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Finds the last index of the given value in the array starting at the given index.
     *
     * <p>This method returns {@link #INDEX_NOT_FOUND} ({@code -1}) for a {@code null} input array.
     *
     * <p>A negative startIndex will return {@link #INDEX_NOT_FOUND} ({@code -1}). A startIndex larger than the
     * array length will search from the end of the array.
     *
     * @param array  the array to traverse for looking for the object, may be {@code null}
     * @param valueToFind  the value to find
     * @param startIndex  the start index to traverse backwards from
     * @return the last index of the value within the array,
     *  {@link #INDEX_NOT_FOUND} ({@code -1}) if not found or {@code null} array input
     */
    public static int lastIndexOf(final int[] array, final int valueToFind, int startIndex) {try{__CLR4_5_27070lvha78c4.R.inc(1738);
        __CLR4_5_27070lvha78c4.R.inc(1739);if ((((array == null)&&(__CLR4_5_27070lvha78c4.R.iget(1740)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1741)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(1742);return INDEX_NOT_FOUND;
        }
        }__CLR4_5_27070lvha78c4.R.inc(1743);if ((((startIndex < 0)&&(__CLR4_5_27070lvha78c4.R.iget(1744)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1745)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(1746);return INDEX_NOT_FOUND;
        } }else {__CLR4_5_27070lvha78c4.R.inc(1747);if ((((startIndex >= array.length)&&(__CLR4_5_27070lvha78c4.R.iget(1748)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1749)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(1750);startIndex = array.length - 1;
        }
        }}__CLR4_5_27070lvha78c4.R.inc(1751);for (int i = startIndex; (((i >= 0)&&(__CLR4_5_27070lvha78c4.R.iget(1752)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1753)==0&false)); i--) {{
            __CLR4_5_27070lvha78c4.R.inc(1754);if ((((valueToFind == array[i])&&(__CLR4_5_27070lvha78c4.R.iget(1755)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1756)==0&false))) {{
                __CLR4_5_27070lvha78c4.R.inc(1757);return i;
            }
        }}
        }__CLR4_5_27070lvha78c4.R.inc(1758);return INDEX_NOT_FOUND;
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Checks if the value is in the given array.
     *
     * <p>The method returns {@code false} if a {@code null} array is passed in.
     *
     * @param array  the array to search through
     * @param valueToFind  the value to find
     * @return {@code true} if the array contains the object
     */
    public static boolean contains(final int[] array, final int valueToFind) {try{__CLR4_5_27070lvha78c4.R.inc(1759);
        __CLR4_5_27070lvha78c4.R.inc(1760);return indexOf(array, valueToFind) != INDEX_NOT_FOUND;
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    // short IndexOf
    //-----------------------------------------------------------------------
    /**
     * <p>Finds the index of the given value in the array.
     *
     * <p>This method returns {@link #INDEX_NOT_FOUND} ({@code -1}) for a {@code null} input array.
     *
     * @param array  the array to search through for the object, may be {@code null}
     * @param valueToFind  the value to find
     * @return the index of the value within the array,
     *  {@link #INDEX_NOT_FOUND} ({@code -1}) if not found or {@code null} array input
     */
    public static int indexOf(final short[] array, final short valueToFind) {try{__CLR4_5_27070lvha78c4.R.inc(1761);
        __CLR4_5_27070lvha78c4.R.inc(1762);return indexOf(array, valueToFind, 0);
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Finds the index of the given value in the array starting at the given index.
     *
     * <p>This method returns {@link #INDEX_NOT_FOUND} ({@code -1}) for a {@code null} input array.
     *
     * <p>A negative startIndex is treated as zero. A startIndex larger than the array
     * length will return {@link #INDEX_NOT_FOUND} ({@code -1}).
     *
     * @param array  the array to search through for the object, may be {@code null}
     * @param valueToFind  the value to find
     * @param startIndex  the index to start searching at
     * @return the index of the value within the array,
     *  {@link #INDEX_NOT_FOUND} ({@code -1}) if not found or {@code null} array input
     */
    public static int indexOf(final short[] array, final short valueToFind, int startIndex) {try{__CLR4_5_27070lvha78c4.R.inc(1763);
        __CLR4_5_27070lvha78c4.R.inc(1764);if ((((array == null)&&(__CLR4_5_27070lvha78c4.R.iget(1765)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1766)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(1767);return INDEX_NOT_FOUND;
        }
        }__CLR4_5_27070lvha78c4.R.inc(1768);if ((((startIndex < 0)&&(__CLR4_5_27070lvha78c4.R.iget(1769)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1770)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(1771);startIndex = 0;
        }
        }__CLR4_5_27070lvha78c4.R.inc(1772);for (int i = startIndex; (((i < array.length)&&(__CLR4_5_27070lvha78c4.R.iget(1773)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1774)==0&false)); i++) {{
            __CLR4_5_27070lvha78c4.R.inc(1775);if ((((valueToFind == array[i])&&(__CLR4_5_27070lvha78c4.R.iget(1776)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1777)==0&false))) {{
                __CLR4_5_27070lvha78c4.R.inc(1778);return i;
            }
        }}
        }__CLR4_5_27070lvha78c4.R.inc(1779);return INDEX_NOT_FOUND;
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Finds the last index of the given value within the array.
     *
     * <p>This method returns {@link #INDEX_NOT_FOUND} ({@code -1}) for a {@code null} input array.
     *
     * @param array  the array to traverse backwards looking for the object, may be {@code null}
     * @param valueToFind  the object to find
     * @return the last index of the value within the array,
     *  {@link #INDEX_NOT_FOUND} ({@code -1}) if not found or {@code null} array input
     */
    public static int lastIndexOf(final short[] array, final short valueToFind) {try{__CLR4_5_27070lvha78c4.R.inc(1780);
        __CLR4_5_27070lvha78c4.R.inc(1781);return lastIndexOf(array, valueToFind, Integer.MAX_VALUE);
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Finds the last index of the given value in the array starting at the given index.
     *
     * <p>This method returns {@link #INDEX_NOT_FOUND} ({@code -1}) for a {@code null} input array.
     *
     * <p>A negative startIndex will return {@link #INDEX_NOT_FOUND} ({@code -1}). A startIndex larger than the
     * array length will search from the end of the array.
     *
     * @param array  the array to traverse for looking for the object, may be {@code null}
     * @param valueToFind  the value to find
     * @param startIndex  the start index to traverse backwards from
     * @return the last index of the value within the array,
     *  {@link #INDEX_NOT_FOUND} ({@code -1}) if not found or {@code null} array input
     */
    public static int lastIndexOf(final short[] array, final short valueToFind, int startIndex) {try{__CLR4_5_27070lvha78c4.R.inc(1782);
        __CLR4_5_27070lvha78c4.R.inc(1783);if ((((array == null)&&(__CLR4_5_27070lvha78c4.R.iget(1784)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1785)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(1786);return INDEX_NOT_FOUND;
        }
        }__CLR4_5_27070lvha78c4.R.inc(1787);if ((((startIndex < 0)&&(__CLR4_5_27070lvha78c4.R.iget(1788)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1789)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(1790);return INDEX_NOT_FOUND;
        } }else {__CLR4_5_27070lvha78c4.R.inc(1791);if ((((startIndex >= array.length)&&(__CLR4_5_27070lvha78c4.R.iget(1792)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1793)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(1794);startIndex = array.length - 1;
        }
        }}__CLR4_5_27070lvha78c4.R.inc(1795);for (int i = startIndex; (((i >= 0)&&(__CLR4_5_27070lvha78c4.R.iget(1796)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1797)==0&false)); i--) {{
            __CLR4_5_27070lvha78c4.R.inc(1798);if ((((valueToFind == array[i])&&(__CLR4_5_27070lvha78c4.R.iget(1799)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1800)==0&false))) {{
                __CLR4_5_27070lvha78c4.R.inc(1801);return i;
            }
        }}
        }__CLR4_5_27070lvha78c4.R.inc(1802);return INDEX_NOT_FOUND;
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Checks if the value is in the given array.
     *
     * <p>The method returns {@code false} if a {@code null} array is passed in.
     *
     * @param array  the array to search through
     * @param valueToFind  the value to find
     * @return {@code true} if the array contains the object
     */
    public static boolean contains(final short[] array, final short valueToFind) {try{__CLR4_5_27070lvha78c4.R.inc(1803);
        __CLR4_5_27070lvha78c4.R.inc(1804);return indexOf(array, valueToFind) != INDEX_NOT_FOUND;
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    // char IndexOf
    //-----------------------------------------------------------------------
    /**
     * <p>Finds the index of the given value in the array.
     *
     * <p>This method returns {@link #INDEX_NOT_FOUND} ({@code -1}) for a {@code null} input array.
     *
     * @param array  the array to search through for the object, may be {@code null}
     * @param valueToFind  the value to find
     * @return the index of the value within the array,
     *  {@link #INDEX_NOT_FOUND} ({@code -1}) if not found or {@code null} array input
     * @since 2.1
     */
    public static int indexOf(final char[] array, final char valueToFind) {try{__CLR4_5_27070lvha78c4.R.inc(1805);
        __CLR4_5_27070lvha78c4.R.inc(1806);return indexOf(array, valueToFind, 0);
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Finds the index of the given value in the array starting at the given index.
     *
     * <p>This method returns {@link #INDEX_NOT_FOUND} ({@code -1}) for a {@code null} input array.
     *
     * <p>A negative startIndex is treated as zero. A startIndex larger than the array
     * length will return {@link #INDEX_NOT_FOUND} ({@code -1}).
     *
     * @param array  the array to search through for the object, may be {@code null}
     * @param valueToFind  the value to find
     * @param startIndex  the index to start searching at
     * @return the index of the value within the array,
     *  {@link #INDEX_NOT_FOUND} ({@code -1}) if not found or {@code null} array input
     * @since 2.1
     */
    public static int indexOf(final char[] array, final char valueToFind, int startIndex) {try{__CLR4_5_27070lvha78c4.R.inc(1807);
        __CLR4_5_27070lvha78c4.R.inc(1808);if ((((array == null)&&(__CLR4_5_27070lvha78c4.R.iget(1809)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1810)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(1811);return INDEX_NOT_FOUND;
        }
        }__CLR4_5_27070lvha78c4.R.inc(1812);if ((((startIndex < 0)&&(__CLR4_5_27070lvha78c4.R.iget(1813)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1814)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(1815);startIndex = 0;
        }
        }__CLR4_5_27070lvha78c4.R.inc(1816);for (int i = startIndex; (((i < array.length)&&(__CLR4_5_27070lvha78c4.R.iget(1817)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1818)==0&false)); i++) {{
            __CLR4_5_27070lvha78c4.R.inc(1819);if ((((valueToFind == array[i])&&(__CLR4_5_27070lvha78c4.R.iget(1820)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1821)==0&false))) {{
                __CLR4_5_27070lvha78c4.R.inc(1822);return i;
            }
        }}
        }__CLR4_5_27070lvha78c4.R.inc(1823);return INDEX_NOT_FOUND;
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Finds the last index of the given value within the array.
     *
     * <p>This method returns {@link #INDEX_NOT_FOUND} ({@code -1}) for a {@code null} input array.
     *
     * @param array  the array to traverse backwards looking for the object, may be {@code null}
     * @param valueToFind  the object to find
     * @return the last index of the value within the array,
     *  {@link #INDEX_NOT_FOUND} ({@code -1}) if not found or {@code null} array input
     * @since 2.1
     */
    public static int lastIndexOf(final char[] array, final char valueToFind) {try{__CLR4_5_27070lvha78c4.R.inc(1824);
        __CLR4_5_27070lvha78c4.R.inc(1825);return lastIndexOf(array, valueToFind, Integer.MAX_VALUE);
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Finds the last index of the given value in the array starting at the given index.
     *
     * <p>This method returns {@link #INDEX_NOT_FOUND} ({@code -1}) for a {@code null} input array.
     *
     * <p>A negative startIndex will return {@link #INDEX_NOT_FOUND} ({@code -1}). A startIndex larger than the
     * array length will search from the end of the array.
     *
     * @param array  the array to traverse for looking for the object, may be {@code null}
     * @param valueToFind  the value to find
     * @param startIndex  the start index to traverse backwards from
     * @return the last index of the value within the array,
     *  {@link #INDEX_NOT_FOUND} ({@code -1}) if not found or {@code null} array input
     * @since 2.1
     */
    public static int lastIndexOf(final char[] array, final char valueToFind, int startIndex) {try{__CLR4_5_27070lvha78c4.R.inc(1826);
        __CLR4_5_27070lvha78c4.R.inc(1827);if ((((array == null)&&(__CLR4_5_27070lvha78c4.R.iget(1828)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1829)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(1830);return INDEX_NOT_FOUND;
        }
        }__CLR4_5_27070lvha78c4.R.inc(1831);if ((((startIndex < 0)&&(__CLR4_5_27070lvha78c4.R.iget(1832)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1833)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(1834);return INDEX_NOT_FOUND;
        } }else {__CLR4_5_27070lvha78c4.R.inc(1835);if ((((startIndex >= array.length)&&(__CLR4_5_27070lvha78c4.R.iget(1836)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1837)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(1838);startIndex = array.length - 1;
        }
        }}__CLR4_5_27070lvha78c4.R.inc(1839);for (int i = startIndex; (((i >= 0)&&(__CLR4_5_27070lvha78c4.R.iget(1840)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1841)==0&false)); i--) {{
            __CLR4_5_27070lvha78c4.R.inc(1842);if ((((valueToFind == array[i])&&(__CLR4_5_27070lvha78c4.R.iget(1843)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1844)==0&false))) {{
                __CLR4_5_27070lvha78c4.R.inc(1845);return i;
            }
        }}
        }__CLR4_5_27070lvha78c4.R.inc(1846);return INDEX_NOT_FOUND;
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Checks if the value is in the given array.
     *
     * <p>The method returns {@code false} if a {@code null} array is passed in.
     *
     * @param array  the array to search through
     * @param valueToFind  the value to find
     * @return {@code true} if the array contains the object
     * @since 2.1
     */
    public static boolean contains(final char[] array, final char valueToFind) {try{__CLR4_5_27070lvha78c4.R.inc(1847);
        __CLR4_5_27070lvha78c4.R.inc(1848);return indexOf(array, valueToFind) != INDEX_NOT_FOUND;
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    // byte IndexOf
    //-----------------------------------------------------------------------
    /**
     * <p>Finds the index of the given value in the array.
     *
     * <p>This method returns {@link #INDEX_NOT_FOUND} ({@code -1}) for a {@code null} input array.
     *
     * @param array  the array to search through for the object, may be {@code null}
     * @param valueToFind  the value to find
     * @return the index of the value within the array,
     *  {@link #INDEX_NOT_FOUND} ({@code -1}) if not found or {@code null} array input
     */
    public static int indexOf(final byte[] array, final byte valueToFind) {try{__CLR4_5_27070lvha78c4.R.inc(1849);
        __CLR4_5_27070lvha78c4.R.inc(1850);return indexOf(array, valueToFind, 0);
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Finds the index of the given value in the array starting at the given index.
     *
     * <p>This method returns {@link #INDEX_NOT_FOUND} ({@code -1}) for a {@code null} input array.
     *
     * <p>A negative startIndex is treated as zero. A startIndex larger than the array
     * length will return {@link #INDEX_NOT_FOUND} ({@code -1}).
     *
     * @param array  the array to search through for the object, may be {@code null}
     * @param valueToFind  the value to find
     * @param startIndex  the index to start searching at
     * @return the index of the value within the array,
     *  {@link #INDEX_NOT_FOUND} ({@code -1}) if not found or {@code null} array input
     */
    public static int indexOf(final byte[] array, final byte valueToFind, int startIndex) {try{__CLR4_5_27070lvha78c4.R.inc(1851);
        __CLR4_5_27070lvha78c4.R.inc(1852);if ((((array == null)&&(__CLR4_5_27070lvha78c4.R.iget(1853)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1854)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(1855);return INDEX_NOT_FOUND;
        }
        }__CLR4_5_27070lvha78c4.R.inc(1856);if ((((startIndex < 0)&&(__CLR4_5_27070lvha78c4.R.iget(1857)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1858)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(1859);startIndex = 0;
        }
        }__CLR4_5_27070lvha78c4.R.inc(1860);for (int i = startIndex; (((i < array.length)&&(__CLR4_5_27070lvha78c4.R.iget(1861)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1862)==0&false)); i++) {{
            __CLR4_5_27070lvha78c4.R.inc(1863);if ((((valueToFind == array[i])&&(__CLR4_5_27070lvha78c4.R.iget(1864)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1865)==0&false))) {{
                __CLR4_5_27070lvha78c4.R.inc(1866);return i;
            }
        }}
        }__CLR4_5_27070lvha78c4.R.inc(1867);return INDEX_NOT_FOUND;
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Finds the last index of the given value within the array.
     *
     * <p>This method returns {@link #INDEX_NOT_FOUND} ({@code -1}) for a {@code null} input array.
     *
     * @param array  the array to traverse backwards looking for the object, may be {@code null}
     * @param valueToFind  the object to find
     * @return the last index of the value within the array,
     *  {@link #INDEX_NOT_FOUND} ({@code -1}) if not found or {@code null} array input
     */
    public static int lastIndexOf(final byte[] array, final byte valueToFind) {try{__CLR4_5_27070lvha78c4.R.inc(1868);
        __CLR4_5_27070lvha78c4.R.inc(1869);return lastIndexOf(array, valueToFind, Integer.MAX_VALUE);
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Finds the last index of the given value in the array starting at the given index.
     *
     * <p>This method returns {@link #INDEX_NOT_FOUND} ({@code -1}) for a {@code null} input array.
     *
     * <p>A negative startIndex will return {@link #INDEX_NOT_FOUND} ({@code -1}). A startIndex larger than the
     * array length will search from the end of the array.
     *
     * @param array  the array to traverse for looking for the object, may be {@code null}
     * @param valueToFind  the value to find
     * @param startIndex  the start index to traverse backwards from
     * @return the last index of the value within the array,
     *  {@link #INDEX_NOT_FOUND} ({@code -1}) if not found or {@code null} array input
     */
    public static int lastIndexOf(final byte[] array, final byte valueToFind, int startIndex) {try{__CLR4_5_27070lvha78c4.R.inc(1870);
        __CLR4_5_27070lvha78c4.R.inc(1871);if ((((array == null)&&(__CLR4_5_27070lvha78c4.R.iget(1872)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1873)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(1874);return INDEX_NOT_FOUND;
        }
        }__CLR4_5_27070lvha78c4.R.inc(1875);if ((((startIndex < 0)&&(__CLR4_5_27070lvha78c4.R.iget(1876)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1877)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(1878);return INDEX_NOT_FOUND;
        } }else {__CLR4_5_27070lvha78c4.R.inc(1879);if ((((startIndex >= array.length)&&(__CLR4_5_27070lvha78c4.R.iget(1880)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1881)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(1882);startIndex = array.length - 1;
        }
        }}__CLR4_5_27070lvha78c4.R.inc(1883);for (int i = startIndex; (((i >= 0)&&(__CLR4_5_27070lvha78c4.R.iget(1884)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1885)==0&false)); i--) {{
            __CLR4_5_27070lvha78c4.R.inc(1886);if ((((valueToFind == array[i])&&(__CLR4_5_27070lvha78c4.R.iget(1887)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1888)==0&false))) {{
                __CLR4_5_27070lvha78c4.R.inc(1889);return i;
            }
        }}
        }__CLR4_5_27070lvha78c4.R.inc(1890);return INDEX_NOT_FOUND;
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Checks if the value is in the given array.
     *
     * <p>The method returns {@code false} if a {@code null} array is passed in.
     *
     * @param array  the array to search through
     * @param valueToFind  the value to find
     * @return {@code true} if the array contains the object
     */
    public static boolean contains(final byte[] array, final byte valueToFind) {try{__CLR4_5_27070lvha78c4.R.inc(1891);
        __CLR4_5_27070lvha78c4.R.inc(1892);return indexOf(array, valueToFind) != INDEX_NOT_FOUND;
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    // double IndexOf
    //-----------------------------------------------------------------------
    /**
     * <p>Finds the index of the given value in the array.
     *
     * <p>This method returns {@link #INDEX_NOT_FOUND} ({@code -1}) for a {@code null} input array.
     *
     * @param array  the array to search through for the object, may be {@code null}
     * @param valueToFind  the value to find
     * @return the index of the value within the array,
     *  {@link #INDEX_NOT_FOUND} ({@code -1}) if not found or {@code null} array input
     */
    public static int indexOf(final double[] array, final double valueToFind) {try{__CLR4_5_27070lvha78c4.R.inc(1893);
        __CLR4_5_27070lvha78c4.R.inc(1894);return indexOf(array, valueToFind, 0);
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Finds the index of the given value within a given tolerance in the array.
     * This method will return the index of the first value which falls between the region
     * defined by valueToFind - tolerance and valueToFind + tolerance.
     *
     * <p>This method returns {@link #INDEX_NOT_FOUND} ({@code -1}) for a {@code null} input array.
     *
     * @param array  the array to search through for the object, may be {@code null}
     * @param valueToFind  the value to find
     * @param tolerance tolerance of the search
     * @return the index of the value within the array,
     *  {@link #INDEX_NOT_FOUND} ({@code -1}) if not found or {@code null} array input
     */
    public static int indexOf(final double[] array, final double valueToFind, final double tolerance) {try{__CLR4_5_27070lvha78c4.R.inc(1895);
        __CLR4_5_27070lvha78c4.R.inc(1896);return indexOf(array, valueToFind, 0, tolerance);
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Finds the index of the given value in the array starting at the given index.
     *
     * <p>This method returns {@link #INDEX_NOT_FOUND} ({@code -1}) for a {@code null} input array.
     *
     * <p>A negative startIndex is treated as zero. A startIndex larger than the array
     * length will return {@link #INDEX_NOT_FOUND} ({@code -1}).
     *
     * @param array  the array to search through for the object, may be {@code null}
     * @param valueToFind  the value to find
     * @param startIndex  the index to start searching at
     * @return the index of the value within the array,
     *  {@link #INDEX_NOT_FOUND} ({@code -1}) if not found or {@code null} array input
     */
    public static int indexOf(final double[] array, final double valueToFind, int startIndex) {try{__CLR4_5_27070lvha78c4.R.inc(1897);
        __CLR4_5_27070lvha78c4.R.inc(1898);if ((((ArrayUtils.isEmpty(array))&&(__CLR4_5_27070lvha78c4.R.iget(1899)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1900)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(1901);return INDEX_NOT_FOUND;
        }
        }__CLR4_5_27070lvha78c4.R.inc(1902);if ((((startIndex < 0)&&(__CLR4_5_27070lvha78c4.R.iget(1903)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1904)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(1905);startIndex = 0;
        }
        }__CLR4_5_27070lvha78c4.R.inc(1906);for (int i = startIndex; (((i < array.length)&&(__CLR4_5_27070lvha78c4.R.iget(1907)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1908)==0&false)); i++) {{
            __CLR4_5_27070lvha78c4.R.inc(1909);if ((((valueToFind == array[i])&&(__CLR4_5_27070lvha78c4.R.iget(1910)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1911)==0&false))) {{
                __CLR4_5_27070lvha78c4.R.inc(1912);return i;
            }
        }}
        }__CLR4_5_27070lvha78c4.R.inc(1913);return INDEX_NOT_FOUND;
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Finds the index of the given value in the array starting at the given index.
     * This method will return the index of the first value which falls between the region
     * defined by valueToFind - tolerance and valueToFind + tolerance.
     *
     * <p>This method returns {@link #INDEX_NOT_FOUND} ({@code -1}) for a {@code null} input array.
     *
     * <p>A negative startIndex is treated as zero. A startIndex larger than the array
     * length will return {@link #INDEX_NOT_FOUND} ({@code -1}).
     *
     * @param array  the array to search through for the object, may be {@code null}
     * @param valueToFind  the value to find
     * @param startIndex  the index to start searching at
     * @param tolerance tolerance of the search
     * @return the index of the value within the array,
     *  {@link #INDEX_NOT_FOUND} ({@code -1}) if not found or {@code null} array input
     */
    public static int indexOf(final double[] array, final double valueToFind, int startIndex, final double tolerance) {try{__CLR4_5_27070lvha78c4.R.inc(1914);
        __CLR4_5_27070lvha78c4.R.inc(1915);if ((((ArrayUtils.isEmpty(array))&&(__CLR4_5_27070lvha78c4.R.iget(1916)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1917)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(1918);return INDEX_NOT_FOUND;
        }
        }__CLR4_5_27070lvha78c4.R.inc(1919);if ((((startIndex < 0)&&(__CLR4_5_27070lvha78c4.R.iget(1920)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1921)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(1922);startIndex = 0;
        }
        }__CLR4_5_27070lvha78c4.R.inc(1923);final double min = valueToFind - tolerance;
        __CLR4_5_27070lvha78c4.R.inc(1924);final double max = valueToFind + tolerance;
        __CLR4_5_27070lvha78c4.R.inc(1925);for (int i = startIndex; (((i < array.length)&&(__CLR4_5_27070lvha78c4.R.iget(1926)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1927)==0&false)); i++) {{
            __CLR4_5_27070lvha78c4.R.inc(1928);if ((((array[i] >= min && array[i] <= max)&&(__CLR4_5_27070lvha78c4.R.iget(1929)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1930)==0&false))) {{
                __CLR4_5_27070lvha78c4.R.inc(1931);return i;
            }
        }}
        }__CLR4_5_27070lvha78c4.R.inc(1932);return INDEX_NOT_FOUND;
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Finds the last index of the given value within the array.
     *
     * <p>This method returns {@link #INDEX_NOT_FOUND} ({@code -1}) for a {@code null} input array.
     *
     * @param array  the array to traverse backwards looking for the object, may be {@code null}
     * @param valueToFind  the object to find
     * @return the last index of the value within the array,
     *  {@link #INDEX_NOT_FOUND} ({@code -1}) if not found or {@code null} array input
     */
    public static int lastIndexOf(final double[] array, final double valueToFind) {try{__CLR4_5_27070lvha78c4.R.inc(1933);
        __CLR4_5_27070lvha78c4.R.inc(1934);return lastIndexOf(array, valueToFind, Integer.MAX_VALUE);
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Finds the last index of the given value within a given tolerance in the array.
     * This method will return the index of the last value which falls between the region
     * defined by valueToFind - tolerance and valueToFind + tolerance.
     *
     * <p>This method returns {@link #INDEX_NOT_FOUND} ({@code -1}) for a {@code null} input array.
     *
     * @param array  the array to search through for the object, may be {@code null}
     * @param valueToFind  the value to find
     * @param tolerance tolerance of the search
     * @return the index of the value within the array,
     *  {@link #INDEX_NOT_FOUND} ({@code -1}) if not found or {@code null} array input
     */
    public static int lastIndexOf(final double[] array, final double valueToFind, final double tolerance) {try{__CLR4_5_27070lvha78c4.R.inc(1935);
        __CLR4_5_27070lvha78c4.R.inc(1936);return lastIndexOf(array, valueToFind, Integer.MAX_VALUE, tolerance);
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Finds the last index of the given value in the array starting at the given index.
     *
     * <p>This method returns {@link #INDEX_NOT_FOUND} ({@code -1}) for a {@code null} input array.
     *
     * <p>A negative startIndex will return {@link #INDEX_NOT_FOUND} ({@code -1}). A startIndex larger than the
     * array length will search from the end of the array.
     *
     * @param array  the array to traverse for looking for the object, may be {@code null}
     * @param valueToFind  the value to find
     * @param startIndex  the start index to traverse backwards from
     * @return the last index of the value within the array,
     *  {@link #INDEX_NOT_FOUND} ({@code -1}) if not found or {@code null} array input
     */
    public static int lastIndexOf(final double[] array, final double valueToFind, int startIndex) {try{__CLR4_5_27070lvha78c4.R.inc(1937);
        __CLR4_5_27070lvha78c4.R.inc(1938);if ((((ArrayUtils.isEmpty(array))&&(__CLR4_5_27070lvha78c4.R.iget(1939)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1940)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(1941);return INDEX_NOT_FOUND;
        }
        }__CLR4_5_27070lvha78c4.R.inc(1942);if ((((startIndex < 0)&&(__CLR4_5_27070lvha78c4.R.iget(1943)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1944)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(1945);return INDEX_NOT_FOUND;
        } }else {__CLR4_5_27070lvha78c4.R.inc(1946);if ((((startIndex >= array.length)&&(__CLR4_5_27070lvha78c4.R.iget(1947)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1948)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(1949);startIndex = array.length - 1;
        }
        }}__CLR4_5_27070lvha78c4.R.inc(1950);for (int i = startIndex; (((i >= 0)&&(__CLR4_5_27070lvha78c4.R.iget(1951)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1952)==0&false)); i--) {{
            __CLR4_5_27070lvha78c4.R.inc(1953);if ((((valueToFind == array[i])&&(__CLR4_5_27070lvha78c4.R.iget(1954)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1955)==0&false))) {{
                __CLR4_5_27070lvha78c4.R.inc(1956);return i;
            }
        }}
        }__CLR4_5_27070lvha78c4.R.inc(1957);return INDEX_NOT_FOUND;
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Finds the last index of the given value in the array starting at the given index.
     * This method will return the index of the last value which falls between the region
     * defined by valueToFind - tolerance and valueToFind + tolerance.
     *
     * <p>This method returns {@link #INDEX_NOT_FOUND} ({@code -1}) for a {@code null} input array.
     *
     * <p>A negative startIndex will return {@link #INDEX_NOT_FOUND} ({@code -1}). A startIndex larger than the
     * array length will search from the end of the array.
     *
     * @param array  the array to traverse for looking for the object, may be {@code null}
     * @param valueToFind  the value to find
     * @param startIndex  the start index to traverse backwards from
     * @param tolerance  search for value within plus/minus this amount
     * @return the last index of the value within the array,
     *  {@link #INDEX_NOT_FOUND} ({@code -1}) if not found or {@code null} array input
     */
    public static int lastIndexOf(final double[] array, final double valueToFind, int startIndex, final double tolerance) {try{__CLR4_5_27070lvha78c4.R.inc(1958);
        __CLR4_5_27070lvha78c4.R.inc(1959);if ((((ArrayUtils.isEmpty(array))&&(__CLR4_5_27070lvha78c4.R.iget(1960)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1961)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(1962);return INDEX_NOT_FOUND;
        }
        }__CLR4_5_27070lvha78c4.R.inc(1963);if ((((startIndex < 0)&&(__CLR4_5_27070lvha78c4.R.iget(1964)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1965)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(1966);return INDEX_NOT_FOUND;
        } }else {__CLR4_5_27070lvha78c4.R.inc(1967);if ((((startIndex >= array.length)&&(__CLR4_5_27070lvha78c4.R.iget(1968)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1969)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(1970);startIndex = array.length - 1;
        }
        }}__CLR4_5_27070lvha78c4.R.inc(1971);final double min = valueToFind - tolerance;
        __CLR4_5_27070lvha78c4.R.inc(1972);final double max = valueToFind + tolerance;
        __CLR4_5_27070lvha78c4.R.inc(1973);for (int i = startIndex; (((i >= 0)&&(__CLR4_5_27070lvha78c4.R.iget(1974)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1975)==0&false)); i--) {{
            __CLR4_5_27070lvha78c4.R.inc(1976);if ((((array[i] >= min && array[i] <= max)&&(__CLR4_5_27070lvha78c4.R.iget(1977)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1978)==0&false))) {{
                __CLR4_5_27070lvha78c4.R.inc(1979);return i;
            }
        }}
        }__CLR4_5_27070lvha78c4.R.inc(1980);return INDEX_NOT_FOUND;
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Checks if the value is in the given array.
     *
     * <p>The method returns {@code false} if a {@code null} array is passed in.
     *
     * @param array  the array to search through
     * @param valueToFind  the value to find
     * @return {@code true} if the array contains the object
     */
    public static boolean contains(final double[] array, final double valueToFind) {try{__CLR4_5_27070lvha78c4.R.inc(1981);
        __CLR4_5_27070lvha78c4.R.inc(1982);return indexOf(array, valueToFind) != INDEX_NOT_FOUND;
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Checks if a value falling within the given tolerance is in the
     * given array.  If the array contains a value within the inclusive range
     * defined by (value - tolerance) to (value + tolerance).
     *
     * <p>The method returns {@code false} if a {@code null} array
     * is passed in.
     *
     * @param array  the array to search
     * @param valueToFind  the value to find
     * @param tolerance  the array contains the tolerance of the search
     * @return true if value falling within tolerance is in array
     */
    public static boolean contains(final double[] array, final double valueToFind, final double tolerance) {try{__CLR4_5_27070lvha78c4.R.inc(1983);
        __CLR4_5_27070lvha78c4.R.inc(1984);return indexOf(array, valueToFind, 0, tolerance) != INDEX_NOT_FOUND;
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    // float IndexOf
    //-----------------------------------------------------------------------
    /**
     * <p>Finds the index of the given value in the array.
     *
     * <p>This method returns {@link #INDEX_NOT_FOUND} ({@code -1}) for a {@code null} input array.
     *
     * @param array  the array to search through for the object, may be {@code null}
     * @param valueToFind  the value to find
     * @return the index of the value within the array,
     *  {@link #INDEX_NOT_FOUND} ({@code -1}) if not found or {@code null} array input
     */
    public static int indexOf(final float[] array, final float valueToFind) {try{__CLR4_5_27070lvha78c4.R.inc(1985);
        __CLR4_5_27070lvha78c4.R.inc(1986);return indexOf(array, valueToFind, 0);
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Finds the index of the given value in the array starting at the given index.
     *
     * <p>This method returns {@link #INDEX_NOT_FOUND} ({@code -1}) for a {@code null} input array.
     *
     * <p>A negative startIndex is treated as zero. A startIndex larger than the array
     * length will return {@link #INDEX_NOT_FOUND} ({@code -1}).
     *
     * @param array  the array to search through for the object, may be {@code null}
     * @param valueToFind  the value to find
     * @param startIndex  the index to start searching at
     * @return the index of the value within the array,
     *  {@link #INDEX_NOT_FOUND} ({@code -1}) if not found or {@code null} array input
     */
    public static int indexOf(final float[] array, final float valueToFind, int startIndex) {try{__CLR4_5_27070lvha78c4.R.inc(1987);
        __CLR4_5_27070lvha78c4.R.inc(1988);if ((((ArrayUtils.isEmpty(array))&&(__CLR4_5_27070lvha78c4.R.iget(1989)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1990)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(1991);return INDEX_NOT_FOUND;
        }
        }__CLR4_5_27070lvha78c4.R.inc(1992);if ((((startIndex < 0)&&(__CLR4_5_27070lvha78c4.R.iget(1993)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1994)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(1995);startIndex = 0;
        }
        }__CLR4_5_27070lvha78c4.R.inc(1996);for (int i = startIndex; (((i < array.length)&&(__CLR4_5_27070lvha78c4.R.iget(1997)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(1998)==0&false)); i++) {{
            __CLR4_5_27070lvha78c4.R.inc(1999);if ((((valueToFind == array[i])&&(__CLR4_5_27070lvha78c4.R.iget(2000)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(2001)==0&false))) {{
                __CLR4_5_27070lvha78c4.R.inc(2002);return i;
            }
        }}
        }__CLR4_5_27070lvha78c4.R.inc(2003);return INDEX_NOT_FOUND;
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Finds the last index of the given value within the array.
     *
     * <p>This method returns {@link #INDEX_NOT_FOUND} ({@code -1}) for a {@code null} input array.
     *
     * @param array  the array to traverse backwards looking for the object, may be {@code null}
     * @param valueToFind  the object to find
     * @return the last index of the value within the array,
     *  {@link #INDEX_NOT_FOUND} ({@code -1}) if not found or {@code null} array input
     */
    public static int lastIndexOf(final float[] array, final float valueToFind) {try{__CLR4_5_27070lvha78c4.R.inc(2004);
        __CLR4_5_27070lvha78c4.R.inc(2005);return lastIndexOf(array, valueToFind, Integer.MAX_VALUE);
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Finds the last index of the given value in the array starting at the given index.
     *
     * <p>This method returns {@link #INDEX_NOT_FOUND} ({@code -1}) for a {@code null} input array.
     *
     * <p>A negative startIndex will return {@link #INDEX_NOT_FOUND} ({@code -1}). A startIndex larger than the
     * array length will search from the end of the array.
     *
     * @param array  the array to traverse for looking for the object, may be {@code null}
     * @param valueToFind  the value to find
     * @param startIndex  the start index to traverse backwards from
     * @return the last index of the value within the array,
     *  {@link #INDEX_NOT_FOUND} ({@code -1}) if not found or {@code null} array input
     */
    public static int lastIndexOf(final float[] array, final float valueToFind, int startIndex) {try{__CLR4_5_27070lvha78c4.R.inc(2006);
        __CLR4_5_27070lvha78c4.R.inc(2007);if ((((ArrayUtils.isEmpty(array))&&(__CLR4_5_27070lvha78c4.R.iget(2008)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(2009)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(2010);return INDEX_NOT_FOUND;
        }
        }__CLR4_5_27070lvha78c4.R.inc(2011);if ((((startIndex < 0)&&(__CLR4_5_27070lvha78c4.R.iget(2012)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(2013)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(2014);return INDEX_NOT_FOUND;
        } }else {__CLR4_5_27070lvha78c4.R.inc(2015);if ((((startIndex >= array.length)&&(__CLR4_5_27070lvha78c4.R.iget(2016)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(2017)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(2018);startIndex = array.length - 1;
        }
        }}__CLR4_5_27070lvha78c4.R.inc(2019);for (int i = startIndex; (((i >= 0)&&(__CLR4_5_27070lvha78c4.R.iget(2020)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(2021)==0&false)); i--) {{
            __CLR4_5_27070lvha78c4.R.inc(2022);if ((((valueToFind == array[i])&&(__CLR4_5_27070lvha78c4.R.iget(2023)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(2024)==0&false))) {{
                __CLR4_5_27070lvha78c4.R.inc(2025);return i;
            }
        }}
        }__CLR4_5_27070lvha78c4.R.inc(2026);return INDEX_NOT_FOUND;
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Checks if the value is in the given array.
     *
     * <p>The method returns {@code false} if a {@code null} array is passed in.
     *
     * @param array  the array to search through
     * @param valueToFind  the value to find
     * @return {@code true} if the array contains the object
     */
    public static boolean contains(final float[] array, final float valueToFind) {try{__CLR4_5_27070lvha78c4.R.inc(2027);
        __CLR4_5_27070lvha78c4.R.inc(2028);return indexOf(array, valueToFind) != INDEX_NOT_FOUND;
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    // boolean IndexOf
    //-----------------------------------------------------------------------
    /**
     * <p>Finds the index of the given value in the array.
     *
     * <p>This method returns {@link #INDEX_NOT_FOUND} ({@code -1}) for a {@code null} input array.
     *
     * @param array  the array to search through for the object, may be {@code null}
     * @param valueToFind  the value to find
     * @return the index of the value within the array,
     *  {@link #INDEX_NOT_FOUND} ({@code -1}) if not found or {@code null} array input
     */
    public static int indexOf(final boolean[] array, final boolean valueToFind) {try{__CLR4_5_27070lvha78c4.R.inc(2029);
        __CLR4_5_27070lvha78c4.R.inc(2030);return indexOf(array, valueToFind, 0);
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Finds the index of the given value in the array starting at the given index.
     *
     * <p>This method returns {@link #INDEX_NOT_FOUND} ({@code -1}) for a {@code null} input array.
     *
     * <p>A negative startIndex is treated as zero. A startIndex larger than the array
     * length will return {@link #INDEX_NOT_FOUND} ({@code -1}).
     *
     * @param array  the array to search through for the object, may be {@code null}
     * @param valueToFind  the value to find
     * @param startIndex  the index to start searching at
     * @return the index of the value within the array,
     *  {@link #INDEX_NOT_FOUND} ({@code -1}) if not found or {@code null}
     *  array input
     */
    public static int indexOf(final boolean[] array, final boolean valueToFind, int startIndex) {try{__CLR4_5_27070lvha78c4.R.inc(2031);
        __CLR4_5_27070lvha78c4.R.inc(2032);if ((((ArrayUtils.isEmpty(array))&&(__CLR4_5_27070lvha78c4.R.iget(2033)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(2034)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(2035);return INDEX_NOT_FOUND;
        }
        }__CLR4_5_27070lvha78c4.R.inc(2036);if ((((startIndex < 0)&&(__CLR4_5_27070lvha78c4.R.iget(2037)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(2038)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(2039);startIndex = 0;
        }
        }__CLR4_5_27070lvha78c4.R.inc(2040);for (int i = startIndex; (((i < array.length)&&(__CLR4_5_27070lvha78c4.R.iget(2041)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(2042)==0&false)); i++) {{
            __CLR4_5_27070lvha78c4.R.inc(2043);if ((((valueToFind == array[i])&&(__CLR4_5_27070lvha78c4.R.iget(2044)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(2045)==0&false))) {{
                __CLR4_5_27070lvha78c4.R.inc(2046);return i;
            }
        }}
        }__CLR4_5_27070lvha78c4.R.inc(2047);return INDEX_NOT_FOUND;
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Finds the last index of the given value within the array.
     *
     * <p>This method returns {@link #INDEX_NOT_FOUND} ({@code -1}) if
     * {@code null} array input.
     *
     * @param array  the array to traverse backwards looking for the object, may be {@code null}
     * @param valueToFind  the object to find
     * @return the last index of the value within the array,
     *  {@link #INDEX_NOT_FOUND} ({@code -1}) if not found or {@code null} array input
     */
    public static int lastIndexOf(final boolean[] array, final boolean valueToFind) {try{__CLR4_5_27070lvha78c4.R.inc(2048);
        __CLR4_5_27070lvha78c4.R.inc(2049);return lastIndexOf(array, valueToFind, Integer.MAX_VALUE);
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Finds the last index of the given value in the array starting at the given index.
     *
     * <p>This method returns {@link #INDEX_NOT_FOUND} ({@code -1}) for a {@code null} input array.
     *
     * <p>A negative startIndex will return {@link #INDEX_NOT_FOUND} ({@code -1}). A startIndex larger than
     * the array length will search from the end of the array.
     *
     * @param array  the array to traverse for looking for the object, may be {@code null}
     * @param valueToFind  the value to find
     * @param startIndex  the start index to traverse backwards from
     * @return the last index of the value within the array,
     *  {@link #INDEX_NOT_FOUND} ({@code -1}) if not found or {@code null} array input
     */
    public static int lastIndexOf(final boolean[] array, final boolean valueToFind, int startIndex) {try{__CLR4_5_27070lvha78c4.R.inc(2050);
        __CLR4_5_27070lvha78c4.R.inc(2051);if ((((ArrayUtils.isEmpty(array))&&(__CLR4_5_27070lvha78c4.R.iget(2052)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(2053)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(2054);return INDEX_NOT_FOUND;
        }
        }__CLR4_5_27070lvha78c4.R.inc(2055);if ((((startIndex < 0)&&(__CLR4_5_27070lvha78c4.R.iget(2056)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(2057)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(2058);return INDEX_NOT_FOUND;
        } }else {__CLR4_5_27070lvha78c4.R.inc(2059);if ((((startIndex >= array.length)&&(__CLR4_5_27070lvha78c4.R.iget(2060)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(2061)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(2062);startIndex = array.length - 1;
        }
        }}__CLR4_5_27070lvha78c4.R.inc(2063);for (int i = startIndex; (((i >= 0)&&(__CLR4_5_27070lvha78c4.R.iget(2064)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(2065)==0&false)); i--) {{
            __CLR4_5_27070lvha78c4.R.inc(2066);if ((((valueToFind == array[i])&&(__CLR4_5_27070lvha78c4.R.iget(2067)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(2068)==0&false))) {{
                __CLR4_5_27070lvha78c4.R.inc(2069);return i;
            }
        }}
        }__CLR4_5_27070lvha78c4.R.inc(2070);return INDEX_NOT_FOUND;
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Checks if the value is in the given array.
     *
     * <p>The method returns {@code false} if a {@code null} array is passed in.
     *
     * @param array  the array to search through
     * @param valueToFind  the value to find
     * @return {@code true} if the array contains the object
     */
    public static boolean contains(final boolean[] array, final boolean valueToFind) {try{__CLR4_5_27070lvha78c4.R.inc(2071);
        __CLR4_5_27070lvha78c4.R.inc(2072);return indexOf(array, valueToFind) != INDEX_NOT_FOUND;
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    // Primitive/Object array converters
    // ----------------------------------------------------------------------

    // Character array converters
    // ----------------------------------------------------------------------
    /**
     * <p>Converts an array of object Characters to primitives.
     *
     * <p>This method returns {@code null} for a {@code null} input array.
     *
     * @param array  a {@code Character} array, may be {@code null}
     * @return a {@code char} array, {@code null} if null array input
     * @throws NullPointerException if array content is {@code null}
     */
    public static char[] toPrimitive(final Character[] array) {try{__CLR4_5_27070lvha78c4.R.inc(2073);
        __CLR4_5_27070lvha78c4.R.inc(2074);if ((((array == null)&&(__CLR4_5_27070lvha78c4.R.iget(2075)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(2076)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(2077);return null;
        } }else {__CLR4_5_27070lvha78c4.R.inc(2078);if ((((array.length == 0)&&(__CLR4_5_27070lvha78c4.R.iget(2079)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(2080)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(2081);return EMPTY_CHAR_ARRAY;
        }
        }}__CLR4_5_27070lvha78c4.R.inc(2082);final char[] result = new char[array.length];
        __CLR4_5_27070lvha78c4.R.inc(2083);for (int i = 0; (((i < array.length)&&(__CLR4_5_27070lvha78c4.R.iget(2084)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(2085)==0&false)); i++) {{
            __CLR4_5_27070lvha78c4.R.inc(2086);result[i] = array[i].charValue();
        }
        }__CLR4_5_27070lvha78c4.R.inc(2087);return result;
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Converts an array of object Character to primitives handling {@code null}.
     *
     * <p>This method returns {@code null} for a {@code null} input array.
     *
     * @param array  a {@code Character} array, may be {@code null}
     * @param valueForNull  the value to insert if {@code null} found
     * @return a {@code char} array, {@code null} if null array input
     */
    public static char[] toPrimitive(final Character[] array, final char valueForNull) {try{__CLR4_5_27070lvha78c4.R.inc(2088);
        __CLR4_5_27070lvha78c4.R.inc(2089);if ((((array == null)&&(__CLR4_5_27070lvha78c4.R.iget(2090)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(2091)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(2092);return null;
        } }else {__CLR4_5_27070lvha78c4.R.inc(2093);if ((((array.length == 0)&&(__CLR4_5_27070lvha78c4.R.iget(2094)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(2095)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(2096);return EMPTY_CHAR_ARRAY;
        }
        }}__CLR4_5_27070lvha78c4.R.inc(2097);final char[] result = new char[array.length];
        __CLR4_5_27070lvha78c4.R.inc(2098);for (int i = 0; (((i < array.length)&&(__CLR4_5_27070lvha78c4.R.iget(2099)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(2100)==0&false)); i++) {{
            __CLR4_5_27070lvha78c4.R.inc(2101);final Character b = array[i];
            __CLR4_5_27070lvha78c4.R.inc(2102);result[i] = ((((b == null )&&(__CLR4_5_27070lvha78c4.R.iget(2103)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(2104)==0&false))? valueForNull : b.charValue());
        }
        }__CLR4_5_27070lvha78c4.R.inc(2105);return result;
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Converts an array of primitive chars to objects.
     *
     * <p>This method returns {@code null} for a {@code null} input array.
     *
     * @param array a {@code char} array
     * @return a {@code Character} array, {@code null} if null array input
     */
    public static Character[] toObject(final char[] array) {try{__CLR4_5_27070lvha78c4.R.inc(2106);
        __CLR4_5_27070lvha78c4.R.inc(2107);if ((((array == null)&&(__CLR4_5_27070lvha78c4.R.iget(2108)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(2109)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(2110);return null;
        } }else {__CLR4_5_27070lvha78c4.R.inc(2111);if ((((array.length == 0)&&(__CLR4_5_27070lvha78c4.R.iget(2112)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(2113)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(2114);return EMPTY_CHARACTER_OBJECT_ARRAY;
        }
        }}__CLR4_5_27070lvha78c4.R.inc(2115);final Character[] result = new Character[array.length];
        __CLR4_5_27070lvha78c4.R.inc(2116);for (int i = 0; (((i < array.length)&&(__CLR4_5_27070lvha78c4.R.iget(2117)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(2118)==0&false)); i++) {{
            __CLR4_5_27070lvha78c4.R.inc(2119);result[i] = Character.valueOf(array[i]);
        }
        }__CLR4_5_27070lvha78c4.R.inc(2120);return result;
     }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    // Long array converters
    // ----------------------------------------------------------------------
    /**
     * <p>Converts an array of object Longs to primitives.
     *
     * <p>This method returns {@code null} for a {@code null} input array.
     *
     * @param array  a {@code Long} array, may be {@code null}
     * @return a {@code long} array, {@code null} if null array input
     * @throws NullPointerException if array content is {@code null}
     */
    public static long[] toPrimitive(final Long[] array) {try{__CLR4_5_27070lvha78c4.R.inc(2121);
        __CLR4_5_27070lvha78c4.R.inc(2122);if ((((array == null)&&(__CLR4_5_27070lvha78c4.R.iget(2123)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(2124)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(2125);return null;
        } }else {__CLR4_5_27070lvha78c4.R.inc(2126);if ((((array.length == 0)&&(__CLR4_5_27070lvha78c4.R.iget(2127)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(2128)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(2129);return EMPTY_LONG_ARRAY;
        }
        }}__CLR4_5_27070lvha78c4.R.inc(2130);final long[] result = new long[array.length];
        __CLR4_5_27070lvha78c4.R.inc(2131);for (int i = 0; (((i < array.length)&&(__CLR4_5_27070lvha78c4.R.iget(2132)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(2133)==0&false)); i++) {{
            __CLR4_5_27070lvha78c4.R.inc(2134);result[i] = array[i].longValue();
        }
        }__CLR4_5_27070lvha78c4.R.inc(2135);return result;
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Converts an array of object Long to primitives handling {@code null}.
     *
     * <p>This method returns {@code null} for a {@code null} input array.
     *
     * @param array  a {@code Long} array, may be {@code null}
     * @param valueForNull  the value to insert if {@code null} found
     * @return a {@code long} array, {@code null} if null array input
     */
    public static long[] toPrimitive(final Long[] array, final long valueForNull) {try{__CLR4_5_27070lvha78c4.R.inc(2136);
        __CLR4_5_27070lvha78c4.R.inc(2137);if ((((array == null)&&(__CLR4_5_27070lvha78c4.R.iget(2138)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(2139)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(2140);return null;
        } }else {__CLR4_5_27070lvha78c4.R.inc(2141);if ((((array.length == 0)&&(__CLR4_5_27070lvha78c4.R.iget(2142)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(2143)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(2144);return EMPTY_LONG_ARRAY;
        }
        }}__CLR4_5_27070lvha78c4.R.inc(2145);final long[] result = new long[array.length];
        __CLR4_5_27070lvha78c4.R.inc(2146);for (int i = 0; (((i < array.length)&&(__CLR4_5_27070lvha78c4.R.iget(2147)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(2148)==0&false)); i++) {{
            __CLR4_5_27070lvha78c4.R.inc(2149);final Long b = array[i];
            __CLR4_5_27070lvha78c4.R.inc(2150);result[i] = ((((b == null )&&(__CLR4_5_27070lvha78c4.R.iget(2151)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(2152)==0&false))? valueForNull : b.longValue());
        }
        }__CLR4_5_27070lvha78c4.R.inc(2153);return result;
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Converts an array of primitive longs to objects.
     *
     * <p>This method returns {@code null} for a {@code null} input array.
     *
     * @param array  a {@code long} array
     * @return a {@code Long} array, {@code null} if null array input
     */
    public static Long[] toObject(final long[] array) {try{__CLR4_5_27070lvha78c4.R.inc(2154);
        __CLR4_5_27070lvha78c4.R.inc(2155);if ((((array == null)&&(__CLR4_5_27070lvha78c4.R.iget(2156)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(2157)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(2158);return null;
        } }else {__CLR4_5_27070lvha78c4.R.inc(2159);if ((((array.length == 0)&&(__CLR4_5_27070lvha78c4.R.iget(2160)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(2161)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(2162);return EMPTY_LONG_OBJECT_ARRAY;
        }
        }}__CLR4_5_27070lvha78c4.R.inc(2163);final Long[] result = new Long[array.length];
        __CLR4_5_27070lvha78c4.R.inc(2164);for (int i = 0; (((i < array.length)&&(__CLR4_5_27070lvha78c4.R.iget(2165)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(2166)==0&false)); i++) {{
            __CLR4_5_27070lvha78c4.R.inc(2167);result[i] = Long.valueOf(array[i]);
        }
        }__CLR4_5_27070lvha78c4.R.inc(2168);return result;
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    // Int array converters
    // ----------------------------------------------------------------------
    /**
     * <p>Converts an array of object Integers to primitives.
     *
     * <p>This method returns {@code null} for a {@code null} input array.
     *
     * @param array  a {@code Integer} array, may be {@code null}
     * @return an {@code int} array, {@code null} if null array input
     * @throws NullPointerException if array content is {@code null}
     */
    public static int[] toPrimitive(final Integer[] array) {try{__CLR4_5_27070lvha78c4.R.inc(2169);
        __CLR4_5_27070lvha78c4.R.inc(2170);if ((((array == null)&&(__CLR4_5_27070lvha78c4.R.iget(2171)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(2172)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(2173);return null;
        } }else {__CLR4_5_27070lvha78c4.R.inc(2174);if ((((array.length == 0)&&(__CLR4_5_27070lvha78c4.R.iget(2175)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(2176)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(2177);return EMPTY_INT_ARRAY;
        }
        }}__CLR4_5_27070lvha78c4.R.inc(2178);final int[] result = new int[array.length];
        __CLR4_5_27070lvha78c4.R.inc(2179);for (int i = 0; (((i < array.length)&&(__CLR4_5_27070lvha78c4.R.iget(2180)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(2181)==0&false)); i++) {{
            __CLR4_5_27070lvha78c4.R.inc(2182);result[i] = array[i].intValue();
        }
        }__CLR4_5_27070lvha78c4.R.inc(2183);return result;
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Converts an array of object Integer to primitives handling {@code null}.
     *
     * <p>This method returns {@code null} for a {@code null} input array.
     *
     * @param array  a {@code Integer} array, may be {@code null}
     * @param valueForNull  the value to insert if {@code null} found
     * @return an {@code int} array, {@code null} if null array input
     */
    public static int[] toPrimitive(final Integer[] array, final int valueForNull) {try{__CLR4_5_27070lvha78c4.R.inc(2184);
        __CLR4_5_27070lvha78c4.R.inc(2185);if ((((array == null)&&(__CLR4_5_27070lvha78c4.R.iget(2186)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(2187)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(2188);return null;
        } }else {__CLR4_5_27070lvha78c4.R.inc(2189);if ((((array.length == 0)&&(__CLR4_5_27070lvha78c4.R.iget(2190)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(2191)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(2192);return EMPTY_INT_ARRAY;
        }
        }}__CLR4_5_27070lvha78c4.R.inc(2193);final int[] result = new int[array.length];
        __CLR4_5_27070lvha78c4.R.inc(2194);for (int i = 0; (((i < array.length)&&(__CLR4_5_27070lvha78c4.R.iget(2195)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(2196)==0&false)); i++) {{
            __CLR4_5_27070lvha78c4.R.inc(2197);final Integer b = array[i];
            __CLR4_5_27070lvha78c4.R.inc(2198);result[i] = ((((b == null )&&(__CLR4_5_27070lvha78c4.R.iget(2199)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(2200)==0&false))? valueForNull : b.intValue());
        }
        }__CLR4_5_27070lvha78c4.R.inc(2201);return result;
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Converts an array of primitive ints to objects.
     *
     * <p>This method returns {@code null} for a {@code null} input array.
     *
     * @param array  an {@code int} array
     * @return an {@code Integer} array, {@code null} if null array input
     */
    public static Integer[] toObject(final int[] array) {try{__CLR4_5_27070lvha78c4.R.inc(2202);
        __CLR4_5_27070lvha78c4.R.inc(2203);if ((((array == null)&&(__CLR4_5_27070lvha78c4.R.iget(2204)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(2205)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(2206);return null;
        } }else {__CLR4_5_27070lvha78c4.R.inc(2207);if ((((array.length == 0)&&(__CLR4_5_27070lvha78c4.R.iget(2208)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(2209)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(2210);return EMPTY_INTEGER_OBJECT_ARRAY;
        }
        }}__CLR4_5_27070lvha78c4.R.inc(2211);final Integer[] result = new Integer[array.length];
        __CLR4_5_27070lvha78c4.R.inc(2212);for (int i = 0; (((i < array.length)&&(__CLR4_5_27070lvha78c4.R.iget(2213)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(2214)==0&false)); i++) {{
            __CLR4_5_27070lvha78c4.R.inc(2215);result[i] = Integer.valueOf(array[i]);
        }
        }__CLR4_5_27070lvha78c4.R.inc(2216);return result;
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    // Short array converters
    // ----------------------------------------------------------------------
    /**
     * <p>Converts an array of object Shorts to primitives.
     *
     * <p>This method returns {@code null} for a {@code null} input array.
     *
     * @param array  a {@code Short} array, may be {@code null}
     * @return a {@code byte} array, {@code null} if null array input
     * @throws NullPointerException if array content is {@code null}
     */
    public static short[] toPrimitive(final Short[] array) {try{__CLR4_5_27070lvha78c4.R.inc(2217);
        __CLR4_5_27070lvha78c4.R.inc(2218);if ((((array == null)&&(__CLR4_5_27070lvha78c4.R.iget(2219)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(2220)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(2221);return null;
        } }else {__CLR4_5_27070lvha78c4.R.inc(2222);if ((((array.length == 0)&&(__CLR4_5_27070lvha78c4.R.iget(2223)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(2224)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(2225);return EMPTY_SHORT_ARRAY;
        }
        }}__CLR4_5_27070lvha78c4.R.inc(2226);final short[] result = new short[array.length];
        __CLR4_5_27070lvha78c4.R.inc(2227);for (int i = 0; (((i < array.length)&&(__CLR4_5_27070lvha78c4.R.iget(2228)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(2229)==0&false)); i++) {{
            __CLR4_5_27070lvha78c4.R.inc(2230);result[i] = array[i].shortValue();
        }
        }__CLR4_5_27070lvha78c4.R.inc(2231);return result;
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Converts an array of object Short to primitives handling {@code null}.
     *
     * <p>This method returns {@code null} for a {@code null} input array.
     *
     * @param array  a {@code Short} array, may be {@code null}
     * @param valueForNull  the value to insert if {@code null} found
     * @return a {@code byte} array, {@code null} if null array input
     */
    public static short[] toPrimitive(final Short[] array, final short valueForNull) {try{__CLR4_5_27070lvha78c4.R.inc(2232);
        __CLR4_5_27070lvha78c4.R.inc(2233);if ((((array == null)&&(__CLR4_5_27070lvha78c4.R.iget(2234)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(2235)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(2236);return null;
        } }else {__CLR4_5_27070lvha78c4.R.inc(2237);if ((((array.length == 0)&&(__CLR4_5_27070lvha78c4.R.iget(2238)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(2239)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(2240);return EMPTY_SHORT_ARRAY;
        }
        }}__CLR4_5_27070lvha78c4.R.inc(2241);final short[] result = new short[array.length];
        __CLR4_5_27070lvha78c4.R.inc(2242);for (int i = 0; (((i < array.length)&&(__CLR4_5_27070lvha78c4.R.iget(2243)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(2244)==0&false)); i++) {{
            __CLR4_5_27070lvha78c4.R.inc(2245);final Short b = array[i];
            __CLR4_5_27070lvha78c4.R.inc(2246);result[i] = ((((b == null )&&(__CLR4_5_27070lvha78c4.R.iget(2247)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(2248)==0&false))? valueForNull : b.shortValue());
        }
        }__CLR4_5_27070lvha78c4.R.inc(2249);return result;
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Converts an array of primitive shorts to objects.
     *
     * <p>This method returns {@code null} for a {@code null} input array.
     *
     * @param array  a {@code short} array
     * @return a {@code Short} array, {@code null} if null array input
     */
    public static Short[] toObject(final short[] array) {try{__CLR4_5_27070lvha78c4.R.inc(2250);
        __CLR4_5_27070lvha78c4.R.inc(2251);if ((((array == null)&&(__CLR4_5_27070lvha78c4.R.iget(2252)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(2253)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(2254);return null;
        } }else {__CLR4_5_27070lvha78c4.R.inc(2255);if ((((array.length == 0)&&(__CLR4_5_27070lvha78c4.R.iget(2256)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(2257)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(2258);return EMPTY_SHORT_OBJECT_ARRAY;
        }
        }}__CLR4_5_27070lvha78c4.R.inc(2259);final Short[] result = new Short[array.length];
        __CLR4_5_27070lvha78c4.R.inc(2260);for (int i = 0; (((i < array.length)&&(__CLR4_5_27070lvha78c4.R.iget(2261)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(2262)==0&false)); i++) {{
            __CLR4_5_27070lvha78c4.R.inc(2263);result[i] = Short.valueOf(array[i]);
        }
        }__CLR4_5_27070lvha78c4.R.inc(2264);return result;
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    // Byte array converters
    // ----------------------------------------------------------------------
    /**
     * <p>Converts an array of object Bytes to primitives.
     *
     * <p>This method returns {@code null} for a {@code null} input array.
     *
     * @param array  a {@code Byte} array, may be {@code null}
     * @return a {@code byte} array, {@code null} if null array input
     * @throws NullPointerException if array content is {@code null}
     */
    public static byte[] toPrimitive(final Byte[] array) {try{__CLR4_5_27070lvha78c4.R.inc(2265);
        __CLR4_5_27070lvha78c4.R.inc(2266);if ((((array == null)&&(__CLR4_5_27070lvha78c4.R.iget(2267)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(2268)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(2269);return null;
        } }else {__CLR4_5_27070lvha78c4.R.inc(2270);if ((((array.length == 0)&&(__CLR4_5_27070lvha78c4.R.iget(2271)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(2272)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(2273);return EMPTY_BYTE_ARRAY;
        }
        }}__CLR4_5_27070lvha78c4.R.inc(2274);final byte[] result = new byte[array.length];
        __CLR4_5_27070lvha78c4.R.inc(2275);for (int i = 0; (((i < array.length)&&(__CLR4_5_27070lvha78c4.R.iget(2276)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(2277)==0&false)); i++) {{
            __CLR4_5_27070lvha78c4.R.inc(2278);result[i] = array[i].byteValue();
        }
        }__CLR4_5_27070lvha78c4.R.inc(2279);return result;
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Converts an array of object Bytes to primitives handling {@code null}.
     *
     * <p>This method returns {@code null} for a {@code null} input array.
     *
     * @param array  a {@code Byte} array, may be {@code null}
     * @param valueForNull  the value to insert if {@code null} found
     * @return a {@code byte} array, {@code null} if null array input
     */
    public static byte[] toPrimitive(final Byte[] array, final byte valueForNull) {try{__CLR4_5_27070lvha78c4.R.inc(2280);
        __CLR4_5_27070lvha78c4.R.inc(2281);if ((((array == null)&&(__CLR4_5_27070lvha78c4.R.iget(2282)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(2283)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(2284);return null;
        } }else {__CLR4_5_27070lvha78c4.R.inc(2285);if ((((array.length == 0)&&(__CLR4_5_27070lvha78c4.R.iget(2286)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(2287)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(2288);return EMPTY_BYTE_ARRAY;
        }
        }}__CLR4_5_27070lvha78c4.R.inc(2289);final byte[] result = new byte[array.length];
        __CLR4_5_27070lvha78c4.R.inc(2290);for (int i = 0; (((i < array.length)&&(__CLR4_5_27070lvha78c4.R.iget(2291)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(2292)==0&false)); i++) {{
            __CLR4_5_27070lvha78c4.R.inc(2293);final Byte b = array[i];
            __CLR4_5_27070lvha78c4.R.inc(2294);result[i] = ((((b == null )&&(__CLR4_5_27070lvha78c4.R.iget(2295)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(2296)==0&false))? valueForNull : b.byteValue());
        }
        }__CLR4_5_27070lvha78c4.R.inc(2297);return result;
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Converts an array of primitive bytes to objects.
     *
     * <p>This method returns {@code null} for a {@code null} input array.
     *
     * @param array  a {@code byte} array
     * @return a {@code Byte} array, {@code null} if null array input
     */
    public static Byte[] toObject(final byte[] array) {try{__CLR4_5_27070lvha78c4.R.inc(2298);
        __CLR4_5_27070lvha78c4.R.inc(2299);if ((((array == null)&&(__CLR4_5_27070lvha78c4.R.iget(2300)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(2301)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(2302);return null;
        } }else {__CLR4_5_27070lvha78c4.R.inc(2303);if ((((array.length == 0)&&(__CLR4_5_27070lvha78c4.R.iget(2304)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(2305)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(2306);return EMPTY_BYTE_OBJECT_ARRAY;
        }
        }}__CLR4_5_27070lvha78c4.R.inc(2307);final Byte[] result = new Byte[array.length];
        __CLR4_5_27070lvha78c4.R.inc(2308);for (int i = 0; (((i < array.length)&&(__CLR4_5_27070lvha78c4.R.iget(2309)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(2310)==0&false)); i++) {{
            __CLR4_5_27070lvha78c4.R.inc(2311);result[i] = Byte.valueOf(array[i]);
        }
        }__CLR4_5_27070lvha78c4.R.inc(2312);return result;
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    // Double array converters
    // ----------------------------------------------------------------------
    /**
     * <p>Converts an array of object Doubles to primitives.
     *
     * <p>This method returns {@code null} for a {@code null} input array.
     *
     * @param array  a {@code Double} array, may be {@code null}
     * @return a {@code double} array, {@code null} if null array input
     * @throws NullPointerException if array content is {@code null}
     */
    public static double[] toPrimitive(final Double[] array) {try{__CLR4_5_27070lvha78c4.R.inc(2313);
        __CLR4_5_27070lvha78c4.R.inc(2314);if ((((array == null)&&(__CLR4_5_27070lvha78c4.R.iget(2315)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(2316)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(2317);return null;
        } }else {__CLR4_5_27070lvha78c4.R.inc(2318);if ((((array.length == 0)&&(__CLR4_5_27070lvha78c4.R.iget(2319)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(2320)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(2321);return EMPTY_DOUBLE_ARRAY;
        }
        }}__CLR4_5_27070lvha78c4.R.inc(2322);final double[] result = new double[array.length];
        __CLR4_5_27070lvha78c4.R.inc(2323);for (int i = 0; (((i < array.length)&&(__CLR4_5_27070lvha78c4.R.iget(2324)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(2325)==0&false)); i++) {{
            __CLR4_5_27070lvha78c4.R.inc(2326);result[i] = array[i].doubleValue();
        }
        }__CLR4_5_27070lvha78c4.R.inc(2327);return result;
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Converts an array of object Doubles to primitives handling {@code null}.
     *
     * <p>This method returns {@code null} for a {@code null} input array.
     *
     * @param array  a {@code Double} array, may be {@code null}
     * @param valueForNull  the value to insert if {@code null} found
     * @return a {@code double} array, {@code null} if null array input
     */
    public static double[] toPrimitive(final Double[] array, final double valueForNull) {try{__CLR4_5_27070lvha78c4.R.inc(2328);
        __CLR4_5_27070lvha78c4.R.inc(2329);if ((((array == null)&&(__CLR4_5_27070lvha78c4.R.iget(2330)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(2331)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(2332);return null;
        } }else {__CLR4_5_27070lvha78c4.R.inc(2333);if ((((array.length == 0)&&(__CLR4_5_27070lvha78c4.R.iget(2334)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(2335)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(2336);return EMPTY_DOUBLE_ARRAY;
        }
        }}__CLR4_5_27070lvha78c4.R.inc(2337);final double[] result = new double[array.length];
        __CLR4_5_27070lvha78c4.R.inc(2338);for (int i = 0; (((i < array.length)&&(__CLR4_5_27070lvha78c4.R.iget(2339)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(2340)==0&false)); i++) {{
            __CLR4_5_27070lvha78c4.R.inc(2341);final Double b = array[i];
            __CLR4_5_27070lvha78c4.R.inc(2342);result[i] = ((((b == null )&&(__CLR4_5_27070lvha78c4.R.iget(2343)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(2344)==0&false))? valueForNull : b.doubleValue());
        }
        }__CLR4_5_27070lvha78c4.R.inc(2345);return result;
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Converts an array of primitive doubles to objects.
     *
     * <p>This method returns {@code null} for a {@code null} input array.
     *
     * @param array  a {@code double} array
     * @return a {@code Double} array, {@code null} if null array input
     */
    public static Double[] toObject(final double[] array) {try{__CLR4_5_27070lvha78c4.R.inc(2346);
        __CLR4_5_27070lvha78c4.R.inc(2347);if ((((array == null)&&(__CLR4_5_27070lvha78c4.R.iget(2348)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(2349)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(2350);return null;
        } }else {__CLR4_5_27070lvha78c4.R.inc(2351);if ((((array.length == 0)&&(__CLR4_5_27070lvha78c4.R.iget(2352)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(2353)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(2354);return EMPTY_DOUBLE_OBJECT_ARRAY;
        }
        }}__CLR4_5_27070lvha78c4.R.inc(2355);final Double[] result = new Double[array.length];
        __CLR4_5_27070lvha78c4.R.inc(2356);for (int i = 0; (((i < array.length)&&(__CLR4_5_27070lvha78c4.R.iget(2357)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(2358)==0&false)); i++) {{
            __CLR4_5_27070lvha78c4.R.inc(2359);result[i] = Double.valueOf(array[i]);
        }
        }__CLR4_5_27070lvha78c4.R.inc(2360);return result;
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    //   Float array converters
    // ----------------------------------------------------------------------
    /**
     * <p>Converts an array of object Floats to primitives.
     *
     * <p>This method returns {@code null} for a {@code null} input array.
     *
     * @param array  a {@code Float} array, may be {@code null}
     * @return a {@code float} array, {@code null} if null array input
     * @throws NullPointerException if array content is {@code null}
     */
    public static float[] toPrimitive(final Float[] array) {try{__CLR4_5_27070lvha78c4.R.inc(2361);
        __CLR4_5_27070lvha78c4.R.inc(2362);if ((((array == null)&&(__CLR4_5_27070lvha78c4.R.iget(2363)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(2364)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(2365);return null;
        } }else {__CLR4_5_27070lvha78c4.R.inc(2366);if ((((array.length == 0)&&(__CLR4_5_27070lvha78c4.R.iget(2367)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(2368)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(2369);return EMPTY_FLOAT_ARRAY;
        }
        }}__CLR4_5_27070lvha78c4.R.inc(2370);final float[] result = new float[array.length];
        __CLR4_5_27070lvha78c4.R.inc(2371);for (int i = 0; (((i < array.length)&&(__CLR4_5_27070lvha78c4.R.iget(2372)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(2373)==0&false)); i++) {{
            __CLR4_5_27070lvha78c4.R.inc(2374);result[i] = array[i].floatValue();
        }
        }__CLR4_5_27070lvha78c4.R.inc(2375);return result;
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Converts an array of object Floats to primitives handling {@code null}.
     *
     * <p>This method returns {@code null} for a {@code null} input array.
     *
     * @param array  a {@code Float} array, may be {@code null}
     * @param valueForNull  the value to insert if {@code null} found
     * @return a {@code float} array, {@code null} if null array input
     */
    public static float[] toPrimitive(final Float[] array, final float valueForNull) {try{__CLR4_5_27070lvha78c4.R.inc(2376);
        __CLR4_5_27070lvha78c4.R.inc(2377);if ((((array == null)&&(__CLR4_5_27070lvha78c4.R.iget(2378)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(2379)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(2380);return null;
        } }else {__CLR4_5_27070lvha78c4.R.inc(2381);if ((((array.length == 0)&&(__CLR4_5_27070lvha78c4.R.iget(2382)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(2383)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(2384);return EMPTY_FLOAT_ARRAY;
        }
        }}__CLR4_5_27070lvha78c4.R.inc(2385);final float[] result = new float[array.length];
        __CLR4_5_27070lvha78c4.R.inc(2386);for (int i = 0; (((i < array.length)&&(__CLR4_5_27070lvha78c4.R.iget(2387)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(2388)==0&false)); i++) {{
            __CLR4_5_27070lvha78c4.R.inc(2389);final Float b = array[i];
            __CLR4_5_27070lvha78c4.R.inc(2390);result[i] = ((((b == null )&&(__CLR4_5_27070lvha78c4.R.iget(2391)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(2392)==0&false))? valueForNull : b.floatValue());
        }
        }__CLR4_5_27070lvha78c4.R.inc(2393);return result;
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Converts an array of primitive floats to objects.
     *
     * <p>This method returns {@code null} for a {@code null} input array.
     *
     * @param array  a {@code float} array
     * @return a {@code Float} array, {@code null} if null array input
     */
    public static Float[] toObject(final float[] array) {try{__CLR4_5_27070lvha78c4.R.inc(2394);
        __CLR4_5_27070lvha78c4.R.inc(2395);if ((((array == null)&&(__CLR4_5_27070lvha78c4.R.iget(2396)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(2397)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(2398);return null;
        } }else {__CLR4_5_27070lvha78c4.R.inc(2399);if ((((array.length == 0)&&(__CLR4_5_27070lvha78c4.R.iget(2400)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(2401)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(2402);return EMPTY_FLOAT_OBJECT_ARRAY;
        }
        }}__CLR4_5_27070lvha78c4.R.inc(2403);final Float[] result = new Float[array.length];
        __CLR4_5_27070lvha78c4.R.inc(2404);for (int i = 0; (((i < array.length)&&(__CLR4_5_27070lvha78c4.R.iget(2405)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(2406)==0&false)); i++) {{
            __CLR4_5_27070lvha78c4.R.inc(2407);result[i] = Float.valueOf(array[i]);
        }
        }__CLR4_5_27070lvha78c4.R.inc(2408);return result;
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Create an array of primitive type from an array of wrapper types.
     *
     * <p>This method returns {@code null} for a {@code null} input array.
     *
     * @param array  an array of wrapper object
     * @return an array of the corresponding primitive type, or the original array
     * @since 3.5
     */
    public static Object toPrimitive(final Object array) {try{__CLR4_5_27070lvha78c4.R.inc(2409);
        __CLR4_5_27070lvha78c4.R.inc(2410);if ((((array == null)&&(__CLR4_5_27070lvha78c4.R.iget(2411)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(2412)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(2413);return null;
        }
        }__CLR4_5_27070lvha78c4.R.inc(2414);final Class<?> ct = array.getClass().getComponentType();
        __CLR4_5_27070lvha78c4.R.inc(2415);final Class<?> pt = ClassUtils.wrapperToPrimitive(ct);
        __CLR4_5_27070lvha78c4.R.inc(2416);if((((Integer.TYPE.equals(pt))&&(__CLR4_5_27070lvha78c4.R.iget(2417)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(2418)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(2419);return toPrimitive((Integer[]) array);
        }
        }__CLR4_5_27070lvha78c4.R.inc(2420);if((((Long.TYPE.equals(pt))&&(__CLR4_5_27070lvha78c4.R.iget(2421)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(2422)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(2423);return toPrimitive((Long[]) array);
        }
        }__CLR4_5_27070lvha78c4.R.inc(2424);if((((Short.TYPE.equals(pt))&&(__CLR4_5_27070lvha78c4.R.iget(2425)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(2426)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(2427);return toPrimitive((Short[]) array);
        }
        }__CLR4_5_27070lvha78c4.R.inc(2428);if((((Double.TYPE.equals(pt))&&(__CLR4_5_27070lvha78c4.R.iget(2429)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(2430)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(2431);return toPrimitive((Double[]) array);
        }
        }__CLR4_5_27070lvha78c4.R.inc(2432);if((((Float.TYPE.equals(pt))&&(__CLR4_5_27070lvha78c4.R.iget(2433)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(2434)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(2435);return toPrimitive((Float[]) array);
        }
        }__CLR4_5_27070lvha78c4.R.inc(2436);return array;
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    // Boolean array converters
    // ----------------------------------------------------------------------
    /**
     * <p>Converts an array of object Booleans to primitives.
     *
     * <p>This method returns {@code null} for a {@code null} input array.
     *
     * @param array  a {@code Boolean} array, may be {@code null}
     * @return a {@code boolean} array, {@code null} if null array input
     * @throws NullPointerException if array content is {@code null}
     */
    public static boolean[] toPrimitive(final Boolean[] array) {try{__CLR4_5_27070lvha78c4.R.inc(2437);
        __CLR4_5_27070lvha78c4.R.inc(2438);if ((((array == null)&&(__CLR4_5_27070lvha78c4.R.iget(2439)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(2440)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(2441);return null;
        } }else {__CLR4_5_27070lvha78c4.R.inc(2442);if ((((array.length == 0)&&(__CLR4_5_27070lvha78c4.R.iget(2443)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(2444)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(2445);return EMPTY_BOOLEAN_ARRAY;
        }
        }}__CLR4_5_27070lvha78c4.R.inc(2446);final boolean[] result = new boolean[array.length];
        __CLR4_5_27070lvha78c4.R.inc(2447);for (int i = 0; (((i < array.length)&&(__CLR4_5_27070lvha78c4.R.iget(2448)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(2449)==0&false)); i++) {{
            __CLR4_5_27070lvha78c4.R.inc(2450);result[i] = array[i].booleanValue();
        }
        }__CLR4_5_27070lvha78c4.R.inc(2451);return result;
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Converts an array of object Booleans to primitives handling {@code null}.
     *
     * <p>This method returns {@code null} for a {@code null} input array.
     *
     * @param array  a {@code Boolean} array, may be {@code null}
     * @param valueForNull  the value to insert if {@code null} found
     * @return a {@code boolean} array, {@code null} if null array input
     */
    public static boolean[] toPrimitive(final Boolean[] array, final boolean valueForNull) {try{__CLR4_5_27070lvha78c4.R.inc(2452);
        __CLR4_5_27070lvha78c4.R.inc(2453);if ((((array == null)&&(__CLR4_5_27070lvha78c4.R.iget(2454)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(2455)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(2456);return null;
        } }else {__CLR4_5_27070lvha78c4.R.inc(2457);if ((((array.length == 0)&&(__CLR4_5_27070lvha78c4.R.iget(2458)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(2459)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(2460);return EMPTY_BOOLEAN_ARRAY;
        }
        }}__CLR4_5_27070lvha78c4.R.inc(2461);final boolean[] result = new boolean[array.length];
        __CLR4_5_27070lvha78c4.R.inc(2462);for (int i = 0; (((i < array.length)&&(__CLR4_5_27070lvha78c4.R.iget(2463)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(2464)==0&false)); i++) {{
            __CLR4_5_27070lvha78c4.R.inc(2465);final Boolean b = array[i];
            __CLR4_5_27070lvha78c4.R.inc(2466);result[i] = ((((b == null )&&(__CLR4_5_27070lvha78c4.R.iget(2467)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(2468)==0&false))? valueForNull : b.booleanValue());
        }
        }__CLR4_5_27070lvha78c4.R.inc(2469);return result;
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Converts an array of primitive booleans to objects.
     *
     * <p>This method returns {@code null} for a {@code null} input array.
     *
     * @param array  a {@code boolean} array
     * @return a {@code Boolean} array, {@code null} if null array input
     */
    public static Boolean[] toObject(final boolean[] array) {try{__CLR4_5_27070lvha78c4.R.inc(2470);
        __CLR4_5_27070lvha78c4.R.inc(2471);if ((((array == null)&&(__CLR4_5_27070lvha78c4.R.iget(2472)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(2473)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(2474);return null;
        } }else {__CLR4_5_27070lvha78c4.R.inc(2475);if ((((array.length == 0)&&(__CLR4_5_27070lvha78c4.R.iget(2476)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(2477)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(2478);return EMPTY_BOOLEAN_OBJECT_ARRAY;
        }
        }}__CLR4_5_27070lvha78c4.R.inc(2479);final Boolean[] result = new Boolean[array.length];
        __CLR4_5_27070lvha78c4.R.inc(2480);for (int i = 0; (((i < array.length)&&(__CLR4_5_27070lvha78c4.R.iget(2481)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(2482)==0&false)); i++) {{
            __CLR4_5_27070lvha78c4.R.inc(2483);result[i] = ((((array[i] )&&(__CLR4_5_27070lvha78c4.R.iget(2484)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(2485)==0&false))? Boolean.TRUE : Boolean.FALSE);
        }
        }__CLR4_5_27070lvha78c4.R.inc(2486);return result;
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    // ----------------------------------------------------------------------
    /**
     * <p>Checks if an array of Objects is empty or {@code null}.
     *
     * @param array  the array to test
     * @return {@code true} if the array is empty or {@code null}
     * @since 2.1
     */
    public static boolean isEmpty(final Object[] array) {try{__CLR4_5_27070lvha78c4.R.inc(2487);
        __CLR4_5_27070lvha78c4.R.inc(2488);return getLength(array) == 0;
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Checks if an array of primitive longs is empty or {@code null}.
     *
     * @param array  the array to test
     * @return {@code true} if the array is empty or {@code null}
     * @since 2.1
     */
    public static boolean isEmpty(final long[] array) {try{__CLR4_5_27070lvha78c4.R.inc(2489);
        __CLR4_5_27070lvha78c4.R.inc(2490);return getLength(array) == 0;
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Checks if an array of primitive ints is empty or {@code null}.
     *
     * @param array  the array to test
     * @return {@code true} if the array is empty or {@code null}
     * @since 2.1
     */
    public static boolean isEmpty(final int[] array) {try{__CLR4_5_27070lvha78c4.R.inc(2491);
        __CLR4_5_27070lvha78c4.R.inc(2492);return getLength(array) == 0;
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Checks if an array of primitive shorts is empty or {@code null}.
     *
     * @param array  the array to test
     * @return {@code true} if the array is empty or {@code null}
     * @since 2.1
     */
    public static boolean isEmpty(final short[] array) {try{__CLR4_5_27070lvha78c4.R.inc(2493);
        __CLR4_5_27070lvha78c4.R.inc(2494);return getLength(array) == 0;
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Checks if an array of primitive chars is empty or {@code null}.
     *
     * @param array  the array to test
     * @return {@code true} if the array is empty or {@code null}
     * @since 2.1
     */
    public static boolean isEmpty(final char[] array) {try{__CLR4_5_27070lvha78c4.R.inc(2495);
        __CLR4_5_27070lvha78c4.R.inc(2496);return getLength(array) == 0;
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Checks if an array of primitive bytes is empty or {@code null}.
     *
     * @param array  the array to test
     * @return {@code true} if the array is empty or {@code null}
     * @since 2.1
     */
    public static boolean isEmpty(final byte[] array) {try{__CLR4_5_27070lvha78c4.R.inc(2497);
        __CLR4_5_27070lvha78c4.R.inc(2498);return getLength(array) == 0;
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Checks if an array of primitive doubles is empty or {@code null}.
     *
     * @param array  the array to test
     * @return {@code true} if the array is empty or {@code null}
     * @since 2.1
     */
    public static boolean isEmpty(final double[] array) {try{__CLR4_5_27070lvha78c4.R.inc(2499);
        __CLR4_5_27070lvha78c4.R.inc(2500);return getLength(array) == 0;
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Checks if an array of primitive floats is empty or {@code null}.
     *
     * @param array  the array to test
     * @return {@code true} if the array is empty or {@code null}
     * @since 2.1
     */
    public static boolean isEmpty(final float[] array) {try{__CLR4_5_27070lvha78c4.R.inc(2501);
        __CLR4_5_27070lvha78c4.R.inc(2502);return getLength(array) == 0;
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Checks if an array of primitive booleans is empty or {@code null}.
     *
     * @param array  the array to test
     * @return {@code true} if the array is empty or {@code null}
     * @since 2.1
     */
    public static boolean isEmpty(final boolean[] array) {try{__CLR4_5_27070lvha78c4.R.inc(2503);
        __CLR4_5_27070lvha78c4.R.inc(2504);return getLength(array) == 0;
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    // ----------------------------------------------------------------------
    /**
     * <p>Checks if an array of Objects is not empty and not {@code null}.
     *
     * @param <T> the component type of the array
     * @param array  the array to test
     * @return {@code true} if the array is not empty and not {@code null}
     * @since 2.5
     */
     public static <T> boolean isNotEmpty(final T[] array) {try{__CLR4_5_27070lvha78c4.R.inc(2505);
         __CLR4_5_27070lvha78c4.R.inc(2506);return !isEmpty(array);
     }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Checks if an array of primitive longs is not empty and not {@code null}.
     *
     * @param array  the array to test
     * @return {@code true} if the array is not empty and not {@code null}
     * @since 2.5
     */
    public static boolean isNotEmpty(final long[] array) {try{__CLR4_5_27070lvha78c4.R.inc(2507);
        __CLR4_5_27070lvha78c4.R.inc(2508);return !isEmpty(array);
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Checks if an array of primitive ints is not empty and not {@code null}.
     *
     * @param array  the array to test
     * @return {@code true} if the array is not empty and not {@code null}
     * @since 2.5
     */
    public static boolean isNotEmpty(final int[] array) {try{__CLR4_5_27070lvha78c4.R.inc(2509);
        __CLR4_5_27070lvha78c4.R.inc(2510);return !isEmpty(array);
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Checks if an array of primitive shorts is not empty and not {@code null}.
     *
     * @param array  the array to test
     * @return {@code true} if the array is not empty and not {@code null}
     * @since 2.5
     */
    public static boolean isNotEmpty(final short[] array) {try{__CLR4_5_27070lvha78c4.R.inc(2511);
        __CLR4_5_27070lvha78c4.R.inc(2512);return !isEmpty(array);
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Checks if an array of primitive chars is not empty and not {@code null}.
     *
     * @param array  the array to test
     * @return {@code true} if the array is not empty and not {@code null}
     * @since 2.5
     */
    public static boolean isNotEmpty(final char[] array) {try{__CLR4_5_27070lvha78c4.R.inc(2513);
        __CLR4_5_27070lvha78c4.R.inc(2514);return !isEmpty(array);
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Checks if an array of primitive bytes is not empty and not {@code null}.
     *
     * @param array  the array to test
     * @return {@code true} if the array is not empty and not {@code null}
     * @since 2.5
     */
    public static boolean isNotEmpty(final byte[] array) {try{__CLR4_5_27070lvha78c4.R.inc(2515);
        __CLR4_5_27070lvha78c4.R.inc(2516);return !isEmpty(array);
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Checks if an array of primitive doubles is not empty and not {@code null}.
     *
     * @param array  the array to test
     * @return {@code true} if the array is not empty and not {@code null}
     * @since 2.5
     */
    public static boolean isNotEmpty(final double[] array) {try{__CLR4_5_27070lvha78c4.R.inc(2517);
        __CLR4_5_27070lvha78c4.R.inc(2518);return !isEmpty(array);
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Checks if an array of primitive floats is not empty and not {@code null}.
     *
     * @param array  the array to test
     * @return {@code true} if the array is not empty and not {@code null}
     * @since 2.5
     */
    public static boolean isNotEmpty(final float[] array) {try{__CLR4_5_27070lvha78c4.R.inc(2519);
        __CLR4_5_27070lvha78c4.R.inc(2520);return !isEmpty(array);
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Checks if an array of primitive booleans is not empty and not {@code null}.
     *
     * @param array  the array to test
     * @return {@code true} if the array is not empty and not {@code null}
     * @since 2.5
     */
    public static boolean isNotEmpty(final boolean[] array) {try{__CLR4_5_27070lvha78c4.R.inc(2521);
        __CLR4_5_27070lvha78c4.R.inc(2522);return !isEmpty(array);
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Adds all the elements of the given arrays into a new array.
     * <p>The new array contains all of the element of {@code array1} followed
     * by all of the elements {@code array2}. When an array is returned, it is always
     * a new array.
     *
     * <pre>
     * ArrayUtils.addAll(null, null)     = null
     * ArrayUtils.addAll(array1, null)   = cloned copy of array1
     * ArrayUtils.addAll(null, array2)   = cloned copy of array2
     * ArrayUtils.addAll([], [])         = []
     * ArrayUtils.addAll([null], [null]) = [null, null]
     * ArrayUtils.addAll(["a", "b", "c"], ["1", "2", "3"]) = ["a", "b", "c", "1", "2", "3"]
     * </pre>
     *
     * @param <T> the component type of the array
     * @param array1  the first array whose elements are added to the new array, may be {@code null}
     * @param array2  the second array whose elements are added to the new array, may be {@code null}
     * @return The new array, {@code null} if both arrays are {@code null}.
     *      The type of the new array is the type of the first array,
     *      unless the first array is null, in which case the type is the same as the second array.
     * @since 2.1
     * @throws IllegalArgumentException if the array types are incompatible
     */
    public static <T> T[] addAll(final T[] array1, final T... array2) {try{__CLR4_5_27070lvha78c4.R.inc(2523);
        __CLR4_5_27070lvha78c4.R.inc(2524);if ((((array1 == null)&&(__CLR4_5_27070lvha78c4.R.iget(2525)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(2526)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(2527);return clone(array2);
        } }else {__CLR4_5_27070lvha78c4.R.inc(2528);if ((((array2 == null)&&(__CLR4_5_27070lvha78c4.R.iget(2529)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(2530)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(2531);return clone(array1);
        }
        }}__CLR4_5_27070lvha78c4.R.inc(2532);final Class<?> type1 = array1.getClass().getComponentType();
        __CLR4_5_27070lvha78c4.R.inc(2533);@SuppressWarnings("unchecked") // OK, because array is of type T
        final T[] joinedArray = (T[]) Array.newInstance(type1, array1.length + array2.length);
        __CLR4_5_27070lvha78c4.R.inc(2534);System.arraycopy(array1, 0, joinedArray, 0, array1.length);
        __CLR4_5_27070lvha78c4.R.inc(2535);try {
            __CLR4_5_27070lvha78c4.R.inc(2536);System.arraycopy(array2, 0, joinedArray, array1.length, array2.length);
        } catch (final ArrayStoreException ase) {
            // Check if problem was due to incompatible types
            /*
             * We do this here, rather than before the copy because:
             * - it would be a wasted check most of the time
             * - safer, in case check turns out to be too strict
             */
            __CLR4_5_27070lvha78c4.R.inc(2537);final Class<?> type2 = array2.getClass().getComponentType();
            __CLR4_5_27070lvha78c4.R.inc(2538);if ((((!type1.isAssignableFrom(type2))&&(__CLR4_5_27070lvha78c4.R.iget(2539)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(2540)==0&false))) {{
                __CLR4_5_27070lvha78c4.R.inc(2541);throw new IllegalArgumentException("Cannot store " + type2.getName() + " in an array of "
                        + type1.getName(), ase);
            }
            }__CLR4_5_27070lvha78c4.R.inc(2542);throw ase; // No, so rethrow original
        }
        __CLR4_5_27070lvha78c4.R.inc(2543);return joinedArray;
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Adds all the elements of the given arrays into a new array.
     * <p>The new array contains all of the element of {@code array1} followed
     * by all of the elements {@code array2}. When an array is returned, it is always
     * a new array.
     *
     * <pre>
     * ArrayUtils.addAll(array1, null)   = cloned copy of array1
     * ArrayUtils.addAll(null, array2)   = cloned copy of array2
     * ArrayUtils.addAll([], [])         = []
     * </pre>
     *
     * @param array1  the first array whose elements are added to the new array.
     * @param array2  the second array whose elements are added to the new array.
     * @return The new boolean[] array.
     * @since 2.1
     */
    public static boolean[] addAll(final boolean[] array1, final boolean... array2) {try{__CLR4_5_27070lvha78c4.R.inc(2544);
        __CLR4_5_27070lvha78c4.R.inc(2545);if ((((array1 == null)&&(__CLR4_5_27070lvha78c4.R.iget(2546)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(2547)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(2548);return clone(array2);
        } }else {__CLR4_5_27070lvha78c4.R.inc(2549);if ((((array2 == null)&&(__CLR4_5_27070lvha78c4.R.iget(2550)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(2551)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(2552);return clone(array1);
        }
        }}__CLR4_5_27070lvha78c4.R.inc(2553);final boolean[] joinedArray = new boolean[array1.length + array2.length];
        __CLR4_5_27070lvha78c4.R.inc(2554);System.arraycopy(array1, 0, joinedArray, 0, array1.length);
        __CLR4_5_27070lvha78c4.R.inc(2555);System.arraycopy(array2, 0, joinedArray, array1.length, array2.length);
        __CLR4_5_27070lvha78c4.R.inc(2556);return joinedArray;
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Adds all the elements of the given arrays into a new array.
     * <p>The new array contains all of the element of {@code array1} followed
     * by all of the elements {@code array2}. When an array is returned, it is always
     * a new array.
     *
     * <pre>
     * ArrayUtils.addAll(array1, null)   = cloned copy of array1
     * ArrayUtils.addAll(null, array2)   = cloned copy of array2
     * ArrayUtils.addAll([], [])         = []
     * </pre>
     *
     * @param array1  the first array whose elements are added to the new array.
     * @param array2  the second array whose elements are added to the new array.
     * @return The new char[] array.
     * @since 2.1
     */
    public static char[] addAll(final char[] array1, final char... array2) {try{__CLR4_5_27070lvha78c4.R.inc(2557);
        __CLR4_5_27070lvha78c4.R.inc(2558);if ((((array1 == null)&&(__CLR4_5_27070lvha78c4.R.iget(2559)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(2560)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(2561);return clone(array2);
        } }else {__CLR4_5_27070lvha78c4.R.inc(2562);if ((((array2 == null)&&(__CLR4_5_27070lvha78c4.R.iget(2563)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(2564)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(2565);return clone(array1);
        }
        }}__CLR4_5_27070lvha78c4.R.inc(2566);final char[] joinedArray = new char[array1.length + array2.length];
        __CLR4_5_27070lvha78c4.R.inc(2567);System.arraycopy(array1, 0, joinedArray, 0, array1.length);
        __CLR4_5_27070lvha78c4.R.inc(2568);System.arraycopy(array2, 0, joinedArray, array1.length, array2.length);
        __CLR4_5_27070lvha78c4.R.inc(2569);return joinedArray;
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Adds all the elements of the given arrays into a new array.
     * <p>The new array contains all of the element of {@code array1} followed
     * by all of the elements {@code array2}. When an array is returned, it is always
     * a new array.
     *
     * <pre>
     * ArrayUtils.addAll(array1, null)   = cloned copy of array1
     * ArrayUtils.addAll(null, array2)   = cloned copy of array2
     * ArrayUtils.addAll([], [])         = []
     * </pre>
     *
     * @param array1  the first array whose elements are added to the new array.
     * @param array2  the second array whose elements are added to the new array.
     * @return The new byte[] array.
     * @since 2.1
     */
    public static byte[] addAll(final byte[] array1, final byte... array2) {try{__CLR4_5_27070lvha78c4.R.inc(2570);
        __CLR4_5_27070lvha78c4.R.inc(2571);if ((((array1 == null)&&(__CLR4_5_27070lvha78c4.R.iget(2572)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(2573)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(2574);return clone(array2);
        } }else {__CLR4_5_27070lvha78c4.R.inc(2575);if ((((array2 == null)&&(__CLR4_5_27070lvha78c4.R.iget(2576)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(2577)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(2578);return clone(array1);
        }
        }}__CLR4_5_27070lvha78c4.R.inc(2579);final byte[] joinedArray = new byte[array1.length + array2.length];
        __CLR4_5_27070lvha78c4.R.inc(2580);System.arraycopy(array1, 0, joinedArray, 0, array1.length);
        __CLR4_5_27070lvha78c4.R.inc(2581);System.arraycopy(array2, 0, joinedArray, array1.length, array2.length);
        __CLR4_5_27070lvha78c4.R.inc(2582);return joinedArray;
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Adds all the elements of the given arrays into a new array.
     * <p>The new array contains all of the element of {@code array1} followed
     * by all of the elements {@code array2}. When an array is returned, it is always
     * a new array.
     *
     * <pre>
     * ArrayUtils.addAll(array1, null)   = cloned copy of array1
     * ArrayUtils.addAll(null, array2)   = cloned copy of array2
     * ArrayUtils.addAll([], [])         = []
     * </pre>
     *
     * @param array1  the first array whose elements are added to the new array.
     * @param array2  the second array whose elements are added to the new array.
     * @return The new short[] array.
     * @since 2.1
     */
    public static short[] addAll(final short[] array1, final short... array2) {try{__CLR4_5_27070lvha78c4.R.inc(2583);
        __CLR4_5_27070lvha78c4.R.inc(2584);if ((((array1 == null)&&(__CLR4_5_27070lvha78c4.R.iget(2585)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(2586)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(2587);return clone(array2);
        } }else {__CLR4_5_27070lvha78c4.R.inc(2588);if ((((array2 == null)&&(__CLR4_5_27070lvha78c4.R.iget(2589)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(2590)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(2591);return clone(array1);
        }
        }}__CLR4_5_27070lvha78c4.R.inc(2592);final short[] joinedArray = new short[array1.length + array2.length];
        __CLR4_5_27070lvha78c4.R.inc(2593);System.arraycopy(array1, 0, joinedArray, 0, array1.length);
        __CLR4_5_27070lvha78c4.R.inc(2594);System.arraycopy(array2, 0, joinedArray, array1.length, array2.length);
        __CLR4_5_27070lvha78c4.R.inc(2595);return joinedArray;
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Adds all the elements of the given arrays into a new array.
     * <p>The new array contains all of the element of {@code array1} followed
     * by all of the elements {@code array2}. When an array is returned, it is always
     * a new array.
     *
     * <pre>
     * ArrayUtils.addAll(array1, null)   = cloned copy of array1
     * ArrayUtils.addAll(null, array2)   = cloned copy of array2
     * ArrayUtils.addAll([], [])         = []
     * </pre>
     *
     * @param array1  the first array whose elements are added to the new array.
     * @param array2  the second array whose elements are added to the new array.
     * @return The new int[] array.
     * @since 2.1
     */
    public static int[] addAll(final int[] array1, final int... array2) {try{__CLR4_5_27070lvha78c4.R.inc(2596);
        __CLR4_5_27070lvha78c4.R.inc(2597);if ((((array1 == null)&&(__CLR4_5_27070lvha78c4.R.iget(2598)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(2599)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(2600);return clone(array2);
        } }else {__CLR4_5_27070lvha78c4.R.inc(2601);if ((((array2 == null)&&(__CLR4_5_27070lvha78c4.R.iget(2602)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(2603)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(2604);return clone(array1);
        }
        }}__CLR4_5_27070lvha78c4.R.inc(2605);final int[] joinedArray = new int[array1.length + array2.length];
        __CLR4_5_27070lvha78c4.R.inc(2606);System.arraycopy(array1, 0, joinedArray, 0, array1.length);
        __CLR4_5_27070lvha78c4.R.inc(2607);System.arraycopy(array2, 0, joinedArray, array1.length, array2.length);
        __CLR4_5_27070lvha78c4.R.inc(2608);return joinedArray;
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Adds all the elements of the given arrays into a new array.
     * <p>The new array contains all of the element of {@code array1} followed
     * by all of the elements {@code array2}. When an array is returned, it is always
     * a new array.
     *
     * <pre>
     * ArrayUtils.addAll(array1, null)   = cloned copy of array1
     * ArrayUtils.addAll(null, array2)   = cloned copy of array2
     * ArrayUtils.addAll([], [])         = []
     * </pre>
     *
     * @param array1  the first array whose elements are added to the new array.
     * @param array2  the second array whose elements are added to the new array.
     * @return The new long[] array.
     * @since 2.1
     */
    public static long[] addAll(final long[] array1, final long... array2) {try{__CLR4_5_27070lvha78c4.R.inc(2609);
        __CLR4_5_27070lvha78c4.R.inc(2610);if ((((array1 == null)&&(__CLR4_5_27070lvha78c4.R.iget(2611)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(2612)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(2613);return clone(array2);
        } }else {__CLR4_5_27070lvha78c4.R.inc(2614);if ((((array2 == null)&&(__CLR4_5_27070lvha78c4.R.iget(2615)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(2616)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(2617);return clone(array1);
        }
        }}__CLR4_5_27070lvha78c4.R.inc(2618);final long[] joinedArray = new long[array1.length + array2.length];
        __CLR4_5_27070lvha78c4.R.inc(2619);System.arraycopy(array1, 0, joinedArray, 0, array1.length);
        __CLR4_5_27070lvha78c4.R.inc(2620);System.arraycopy(array2, 0, joinedArray, array1.length, array2.length);
        __CLR4_5_27070lvha78c4.R.inc(2621);return joinedArray;
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Adds all the elements of the given arrays into a new array.
     * <p>The new array contains all of the element of {@code array1} followed
     * by all of the elements {@code array2}. When an array is returned, it is always
     * a new array.
     *
     * <pre>
     * ArrayUtils.addAll(array1, null)   = cloned copy of array1
     * ArrayUtils.addAll(null, array2)   = cloned copy of array2
     * ArrayUtils.addAll([], [])         = []
     * </pre>
     *
     * @param array1  the first array whose elements are added to the new array.
     * @param array2  the second array whose elements are added to the new array.
     * @return The new float[] array.
     * @since 2.1
     */
    public static float[] addAll(final float[] array1, final float... array2) {try{__CLR4_5_27070lvha78c4.R.inc(2622);
        __CLR4_5_27070lvha78c4.R.inc(2623);if ((((array1 == null)&&(__CLR4_5_27070lvha78c4.R.iget(2624)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(2625)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(2626);return clone(array2);
        } }else {__CLR4_5_27070lvha78c4.R.inc(2627);if ((((array2 == null)&&(__CLR4_5_27070lvha78c4.R.iget(2628)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(2629)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(2630);return clone(array1);
        }
        }}__CLR4_5_27070lvha78c4.R.inc(2631);final float[] joinedArray = new float[array1.length + array2.length];
        __CLR4_5_27070lvha78c4.R.inc(2632);System.arraycopy(array1, 0, joinedArray, 0, array1.length);
        __CLR4_5_27070lvha78c4.R.inc(2633);System.arraycopy(array2, 0, joinedArray, array1.length, array2.length);
        __CLR4_5_27070lvha78c4.R.inc(2634);return joinedArray;
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Adds all the elements of the given arrays into a new array.
     * <p>The new array contains all of the element of {@code array1} followed
     * by all of the elements {@code array2}. When an array is returned, it is always
     * a new array.
     *
     * <pre>
     * ArrayUtils.addAll(array1, null)   = cloned copy of array1
     * ArrayUtils.addAll(null, array2)   = cloned copy of array2
     * ArrayUtils.addAll([], [])         = []
     * </pre>
     *
     * @param array1  the first array whose elements are added to the new array.
     * @param array2  the second array whose elements are added to the new array.
     * @return The new double[] array.
     * @since 2.1
     */
    public static double[] addAll(final double[] array1, final double... array2) {try{__CLR4_5_27070lvha78c4.R.inc(2635);
        __CLR4_5_27070lvha78c4.R.inc(2636);if ((((array1 == null)&&(__CLR4_5_27070lvha78c4.R.iget(2637)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(2638)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(2639);return clone(array2);
        } }else {__CLR4_5_27070lvha78c4.R.inc(2640);if ((((array2 == null)&&(__CLR4_5_27070lvha78c4.R.iget(2641)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(2642)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(2643);return clone(array1);
        }
        }}__CLR4_5_27070lvha78c4.R.inc(2644);final double[] joinedArray = new double[array1.length + array2.length];
        __CLR4_5_27070lvha78c4.R.inc(2645);System.arraycopy(array1, 0, joinedArray, 0, array1.length);
        __CLR4_5_27070lvha78c4.R.inc(2646);System.arraycopy(array2, 0, joinedArray, array1.length, array2.length);
        __CLR4_5_27070lvha78c4.R.inc(2647);return joinedArray;
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Copies the given array and adds the given element at the end of the new array.
     *
     * <p>The new array contains the same elements of the input
     * array plus the given element in the last position. The component type of
     * the new array is the same as that of the input array.
     *
     * <p>If the input array is {@code null}, a new one element array is returned
     *  whose component type is the same as the element, unless the element itself is null,
     *  in which case the return type is Object[]
     *
     * <pre>
     * ArrayUtils.add(null, null)      = IllegalArgumentException
     * ArrayUtils.add(null, "a")       = ["a"]
     * ArrayUtils.add(["a"], null)     = ["a", null]
     * ArrayUtils.add(["a"], "b")      = ["a", "b"]
     * ArrayUtils.add(["a", "b"], "c") = ["a", "b", "c"]
     * </pre>
     *
     * @param <T> the component type of the array
     * @param array  the array to "add" the element to, may be {@code null}
     * @param element  the object to add, may be {@code null}
     * @return A new array containing the existing elements plus the new element
     * The returned array type will be that of the input array (unless null),
     * in which case it will have the same type as the element.
     * If both are null, an IllegalArgumentException is thrown
     * @since 2.1
     * @throws IllegalArgumentException if both arguments are null
     */
    public static <T> T[] add(final T[] array, final T element) {try{__CLR4_5_27070lvha78c4.R.inc(2648);
        __CLR4_5_27070lvha78c4.R.inc(2649);Class<?> type;
        __CLR4_5_27070lvha78c4.R.inc(2650);if ((((array != null)&&(__CLR4_5_27070lvha78c4.R.iget(2651)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(2652)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(2653);type = array.getClass().getComponentType();
        } }else {__CLR4_5_27070lvha78c4.R.inc(2654);if ((((element != null)&&(__CLR4_5_27070lvha78c4.R.iget(2655)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(2656)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(2657);type = element.getClass();
        } }else {{
            __CLR4_5_27070lvha78c4.R.inc(2658);throw new IllegalArgumentException("Arguments cannot both be null");
        }
        }}__CLR4_5_27070lvha78c4.R.inc(2659);@SuppressWarnings("unchecked") // type must be T
        final
        T[] newArray = (T[]) copyArrayGrow1(array, type);
        __CLR4_5_27070lvha78c4.R.inc(2660);newArray[newArray.length - 1] = element;
        __CLR4_5_27070lvha78c4.R.inc(2661);return newArray;
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Copies the given array and adds the given element at the end of the new array.
     *
     * <p>The new array contains the same elements of the input
     * array plus the given element in the last position. The component type of
     * the new array is the same as that of the input array.
     *
     * <p>If the input array is {@code null}, a new one element array is returned
     *  whose component type is the same as the element.
     *
     * <pre>
     * ArrayUtils.add(null, true)          = [true]
     * ArrayUtils.add([true], false)       = [true, false]
     * ArrayUtils.add([true, false], true) = [true, false, true]
     * </pre>
     *
     * @param array  the array to copy and add the element to, may be {@code null}
     * @param element  the object to add at the last index of the new array
     * @return A new array containing the existing elements plus the new element
     * @since 2.1
     */
    public static boolean[] add(final boolean[] array, final boolean element) {try{__CLR4_5_27070lvha78c4.R.inc(2662);
        __CLR4_5_27070lvha78c4.R.inc(2663);final boolean[] newArray = (boolean[])copyArrayGrow1(array, Boolean.TYPE);
        __CLR4_5_27070lvha78c4.R.inc(2664);newArray[newArray.length - 1] = element;
        __CLR4_5_27070lvha78c4.R.inc(2665);return newArray;
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Copies the given array and adds the given element at the end of the new array.
     *
     * <p>The new array contains the same elements of the input
     * array plus the given element in the last position. The component type of
     * the new array is the same as that of the input array.
     *
     * <p>If the input array is {@code null}, a new one element array is returned
     *  whose component type is the same as the element.
     *
     * <pre>
     * ArrayUtils.add(null, 0)   = [0]
     * ArrayUtils.add([1], 0)    = [1, 0]
     * ArrayUtils.add([1, 0], 1) = [1, 0, 1]
     * </pre>
     *
     * @param array  the array to copy and add the element to, may be {@code null}
     * @param element  the object to add at the last index of the new array
     * @return A new array containing the existing elements plus the new element
     * @since 2.1
     */
    public static byte[] add(final byte[] array, final byte element) {try{__CLR4_5_27070lvha78c4.R.inc(2666);
        __CLR4_5_27070lvha78c4.R.inc(2667);final byte[] newArray = (byte[])copyArrayGrow1(array, Byte.TYPE);
        __CLR4_5_27070lvha78c4.R.inc(2668);newArray[newArray.length - 1] = element;
        __CLR4_5_27070lvha78c4.R.inc(2669);return newArray;
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Copies the given array and adds the given element at the end of the new array.
     *
     * <p>The new array contains the same elements of the input
     * array plus the given element in the last position. The component type of
     * the new array is the same as that of the input array.
     *
     * <p>If the input array is {@code null}, a new one element array is returned
     *  whose component type is the same as the element.
     *
     * <pre>
     * ArrayUtils.add(null, '0')       = ['0']
     * ArrayUtils.add(['1'], '0')      = ['1', '0']
     * ArrayUtils.add(['1', '0'], '1') = ['1', '0', '1']
     * </pre>
     *
     * @param array  the array to copy and add the element to, may be {@code null}
     * @param element  the object to add at the last index of the new array
     * @return A new array containing the existing elements plus the new element
     * @since 2.1
     */
    public static char[] add(final char[] array, final char element) {try{__CLR4_5_27070lvha78c4.R.inc(2670);
        __CLR4_5_27070lvha78c4.R.inc(2671);final char[] newArray = (char[])copyArrayGrow1(array, Character.TYPE);
        __CLR4_5_27070lvha78c4.R.inc(2672);newArray[newArray.length - 1] = element;
        __CLR4_5_27070lvha78c4.R.inc(2673);return newArray;
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Copies the given array and adds the given element at the end of the new array.
     *
     * <p>The new array contains the same elements of the input
     * array plus the given element in the last position. The component type of
     * the new array is the same as that of the input array.
     *
     * <p>If the input array is {@code null}, a new one element array is returned
     *  whose component type is the same as the element.
     *
     * <pre>
     * ArrayUtils.add(null, 0)   = [0]
     * ArrayUtils.add([1], 0)    = [1, 0]
     * ArrayUtils.add([1, 0], 1) = [1, 0, 1]
     * </pre>
     *
     * @param array  the array to copy and add the element to, may be {@code null}
     * @param element  the object to add at the last index of the new array
     * @return A new array containing the existing elements plus the new element
     * @since 2.1
     */
    public static double[] add(final double[] array, final double element) {try{__CLR4_5_27070lvha78c4.R.inc(2674);
        __CLR4_5_27070lvha78c4.R.inc(2675);final double[] newArray = (double[])copyArrayGrow1(array, Double.TYPE);
        __CLR4_5_27070lvha78c4.R.inc(2676);newArray[newArray.length - 1] = element;
        __CLR4_5_27070lvha78c4.R.inc(2677);return newArray;
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Copies the given array and adds the given element at the end of the new array.
     *
     * <p>The new array contains the same elements of the input
     * array plus the given element in the last position. The component type of
     * the new array is the same as that of the input array.
     *
     * <p>If the input array is {@code null}, a new one element array is returned
     *  whose component type is the same as the element.
     *
     * <pre>
     * ArrayUtils.add(null, 0)   = [0]
     * ArrayUtils.add([1], 0)    = [1, 0]
     * ArrayUtils.add([1, 0], 1) = [1, 0, 1]
     * </pre>
     *
     * @param array  the array to copy and add the element to, may be {@code null}
     * @param element  the object to add at the last index of the new array
     * @return A new array containing the existing elements plus the new element
     * @since 2.1
     */
    public static float[] add(final float[] array, final float element) {try{__CLR4_5_27070lvha78c4.R.inc(2678);
        __CLR4_5_27070lvha78c4.R.inc(2679);final float[] newArray = (float[])copyArrayGrow1(array, Float.TYPE);
        __CLR4_5_27070lvha78c4.R.inc(2680);newArray[newArray.length - 1] = element;
        __CLR4_5_27070lvha78c4.R.inc(2681);return newArray;
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Copies the given array and adds the given element at the end of the new array.
     *
     * <p>The new array contains the same elements of the input
     * array plus the given element in the last position. The component type of
     * the new array is the same as that of the input array.
     *
     * <p>If the input array is {@code null}, a new one element array is returned
     *  whose component type is the same as the element.
     *
     * <pre>
     * ArrayUtils.add(null, 0)   = [0]
     * ArrayUtils.add([1], 0)    = [1, 0]
     * ArrayUtils.add([1, 0], 1) = [1, 0, 1]
     * </pre>
     *
     * @param array  the array to copy and add the element to, may be {@code null}
     * @param element  the object to add at the last index of the new array
     * @return A new array containing the existing elements plus the new element
     * @since 2.1
     */
    public static int[] add(final int[] array, final int element) {try{__CLR4_5_27070lvha78c4.R.inc(2682);
        __CLR4_5_27070lvha78c4.R.inc(2683);final int[] newArray = (int[])copyArrayGrow1(array, Integer.TYPE);
        __CLR4_5_27070lvha78c4.R.inc(2684);newArray[newArray.length - 1] = element;
        __CLR4_5_27070lvha78c4.R.inc(2685);return newArray;
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Copies the given array and adds the given element at the end of the new array.
     *
     * <p>The new array contains the same elements of the input
     * array plus the given element in the last position. The component type of
     * the new array is the same as that of the input array.
     *
     * <p>If the input array is {@code null}, a new one element array is returned
     *  whose component type is the same as the element.
     *
     * <pre>
     * ArrayUtils.add(null, 0)   = [0]
     * ArrayUtils.add([1], 0)    = [1, 0]
     * ArrayUtils.add([1, 0], 1) = [1, 0, 1]
     * </pre>
     *
     * @param array  the array to copy and add the element to, may be {@code null}
     * @param element  the object to add at the last index of the new array
     * @return A new array containing the existing elements plus the new element
     * @since 2.1
     */
    public static long[] add(final long[] array, final long element) {try{__CLR4_5_27070lvha78c4.R.inc(2686);
        __CLR4_5_27070lvha78c4.R.inc(2687);final long[] newArray = (long[])copyArrayGrow1(array, Long.TYPE);
        __CLR4_5_27070lvha78c4.R.inc(2688);newArray[newArray.length - 1] = element;
        __CLR4_5_27070lvha78c4.R.inc(2689);return newArray;
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Copies the given array and adds the given element at the end of the new array.
     *
     * <p>The new array contains the same elements of the input
     * array plus the given element in the last position. The component type of
     * the new array is the same as that of the input array.
     *
     * <p>If the input array is {@code null}, a new one element array is returned
     *  whose component type is the same as the element.
     *
     * <pre>
     * ArrayUtils.add(null, 0)   = [0]
     * ArrayUtils.add([1], 0)    = [1, 0]
     * ArrayUtils.add([1, 0], 1) = [1, 0, 1]
     * </pre>
     *
     * @param array  the array to copy and add the element to, may be {@code null}
     * @param element  the object to add at the last index of the new array
     * @return A new array containing the existing elements plus the new element
     * @since 2.1
     */
    public static short[] add(final short[] array, final short element) {try{__CLR4_5_27070lvha78c4.R.inc(2690);
        __CLR4_5_27070lvha78c4.R.inc(2691);final short[] newArray = (short[]) copyArrayGrow1(array, Short.TYPE);
        __CLR4_5_27070lvha78c4.R.inc(2692);newArray[newArray.length - 1] = element;
        __CLR4_5_27070lvha78c4.R.inc(2693);return newArray;
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * Returns a copy of the given array of size 1 greater than the argument.
     * The last value of the array is left to the default value.
     *
     * @param array The array to copy, must not be {@code null}.
     * @param newArrayComponentType If {@code array} is {@code null}, create a
     * size 1 array of this type.
     * @return A new copy of the array of size 1 greater than the input.
     */
    private static Object copyArrayGrow1(final Object array, final Class<?> newArrayComponentType) {try{__CLR4_5_27070lvha78c4.R.inc(2694);
        __CLR4_5_27070lvha78c4.R.inc(2695);if ((((array != null)&&(__CLR4_5_27070lvha78c4.R.iget(2696)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(2697)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(2698);final int arrayLength = Array.getLength(array);
            __CLR4_5_27070lvha78c4.R.inc(2699);final Object newArray = Array.newInstance(array.getClass().getComponentType(), arrayLength + 1);
            __CLR4_5_27070lvha78c4.R.inc(2700);System.arraycopy(array, 0, newArray, 0, arrayLength);
            __CLR4_5_27070lvha78c4.R.inc(2701);return newArray;
        }
        }__CLR4_5_27070lvha78c4.R.inc(2702);return Array.newInstance(newArrayComponentType, 1);
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Inserts the specified element at the specified position in the array.
     * Shifts the element currently at that position (if any) and any subsequent
     * elements to the right (adds one to their indices).
     *
     * <p>This method returns a new array with the same elements of the input
     * array plus the given element on the specified position. The component
     * type of the returned array is always the same as that of the input
     * array.
     *
     * <p>If the input array is {@code null}, a new one element array is returned
     *  whose component type is the same as the element.
     *
     * <pre>
     * ArrayUtils.add(null, 0, null)      = IllegalArgumentException
     * ArrayUtils.add(null, 0, "a")       = ["a"]
     * ArrayUtils.add(["a"], 1, null)     = ["a", null]
     * ArrayUtils.add(["a"], 1, "b")      = ["a", "b"]
     * ArrayUtils.add(["a", "b"], 3, "c") = ["a", "b", "c"]
     * </pre>
     *
     * @param <T> the component type of the array
     * @param array  the array to add the element to, may be {@code null}
     * @param index  the position of the new object
     * @param element  the object to add
     * @return A new array containing the existing elements and the new element
     * @throws IndexOutOfBoundsException if the index is out of range (index &lt; 0 || index &gt; array.length).
     * @throws IllegalArgumentException if both array and element are null
     * @deprecated this method has been superseded by {@link #insert(int, Object[], Object...) insert(int, T[], T...)} and
     * may be removed in a future release. Please note the handling of {@code null} input arrays differs
     * in the new method: inserting {@code X} into a {@code null} array results in {@code null} not {@code X}.
     */
    @Deprecated
    public static <T> T[] add(final T[] array, final int index, final T element) {try{__CLR4_5_27070lvha78c4.R.inc(2703);
        __CLR4_5_27070lvha78c4.R.inc(2704);Class<?> clss = null;
        __CLR4_5_27070lvha78c4.R.inc(2705);if ((((array != null)&&(__CLR4_5_27070lvha78c4.R.iget(2706)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(2707)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(2708);clss = array.getClass().getComponentType();
        } }else {__CLR4_5_27070lvha78c4.R.inc(2709);if ((((element != null)&&(__CLR4_5_27070lvha78c4.R.iget(2710)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(2711)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(2712);clss = element.getClass();
        } }else {{
            __CLR4_5_27070lvha78c4.R.inc(2713);throw new IllegalArgumentException("Array and element cannot both be null");
        }
        }}__CLR4_5_27070lvha78c4.R.inc(2714);@SuppressWarnings("unchecked") // the add method creates an array of type clss, which is type T
        final T[] newArray = (T[]) add(array, index, element, clss);
        __CLR4_5_27070lvha78c4.R.inc(2715);return newArray;
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Inserts the specified element at the specified position in the array.
     * Shifts the element currently at that position (if any) and any subsequent
     * elements to the right (adds one to their indices).
     *
     * <p>This method returns a new array with the same elements of the input
     * array plus the given element on the specified position. The component
     * type of the returned array is always the same as that of the input
     * array.
     *
     * <p>If the input array is {@code null}, a new one element array is returned
     *  whose component type is the same as the element.
     *
     * <pre>
     * ArrayUtils.add(null, 0, true)          = [true]
     * ArrayUtils.add([true], 0, false)       = [false, true]
     * ArrayUtils.add([false], 1, true)       = [false, true]
     * ArrayUtils.add([true, false], 1, true) = [true, true, false]
     * </pre>
     *
     * @param array  the array to add the element to, may be {@code null}
     * @param index  the position of the new object
     * @param element  the object to add
     * @return A new array containing the existing elements and the new element
     * @throws IndexOutOfBoundsException if the index is out of range (index &lt; 0 || index &gt; array.length).
     * @deprecated this method has been superseded by {@link #insert(int, boolean[], boolean...)} and
     * may be removed in a future release. Please note the handling of {@code null} input arrays differs
     * in the new method: inserting {@code X} into a {@code null} array results in {@code null} not {@code X}.
     */
    @Deprecated
    public static boolean[] add(final boolean[] array, final int index, final boolean element) {try{__CLR4_5_27070lvha78c4.R.inc(2716);
        __CLR4_5_27070lvha78c4.R.inc(2717);return (boolean[]) add(array, index, Boolean.valueOf(element), Boolean.TYPE);
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Inserts the specified element at the specified position in the array.
     * Shifts the element currently at that position (if any) and any subsequent
     * elements to the right (adds one to their indices).
     *
     * <p>This method returns a new array with the same elements of the input
     * array plus the given element on the specified position. The component
     * type of the returned array is always the same as that of the input
     * array.
     *
     * <p>If the input array is {@code null}, a new one element array is returned
     *  whose component type is the same as the element.
     *
     * <pre>
     * ArrayUtils.add(null, 0, 'a')            = ['a']
     * ArrayUtils.add(['a'], 0, 'b')           = ['b', 'a']
     * ArrayUtils.add(['a', 'b'], 0, 'c')      = ['c', 'a', 'b']
     * ArrayUtils.add(['a', 'b'], 1, 'k')      = ['a', 'k', 'b']
     * ArrayUtils.add(['a', 'b', 'c'], 1, 't') = ['a', 't', 'b', 'c']
     * </pre>
     *
     * @param array  the array to add the element to, may be {@code null}
     * @param index  the position of the new object
     * @param element  the object to add
     * @return A new array containing the existing elements and the new element
     * @throws IndexOutOfBoundsException if the index is out of range
     * (index &lt; 0 || index &gt; array.length).
     * @deprecated this method has been superseded by {@link #insert(int, char[], char...)} and
     * may be removed in a future release. Please note the handling of {@code null} input arrays differs
     * in the new method: inserting {@code X} into a {@code null} array results in {@code null} not {@code X}.
     */
    @Deprecated
    public static char[] add(final char[] array, final int index, final char element) {try{__CLR4_5_27070lvha78c4.R.inc(2718);
        __CLR4_5_27070lvha78c4.R.inc(2719);return (char[]) add(array, index, Character.valueOf(element), Character.TYPE);
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Inserts the specified element at the specified position in the array.
     * Shifts the element currently at that position (if any) and any subsequent
     * elements to the right (adds one to their indices).
     *
     * <p>This method returns a new array with the same elements of the input
     * array plus the given element on the specified position. The component
     * type of the returned array is always the same as that of the input
     * array.
     *
     * <p>If the input array is {@code null}, a new one element array is returned
     *  whose component type is the same as the element.
     *
     * <pre>
     * ArrayUtils.add([1], 0, 2)         = [2, 1]
     * ArrayUtils.add([2, 6], 2, 3)      = [2, 6, 3]
     * ArrayUtils.add([2, 6], 0, 1)      = [1, 2, 6]
     * ArrayUtils.add([2, 6, 3], 2, 1)   = [2, 6, 1, 3]
     * </pre>
     *
     * @param array  the array to add the element to, may be {@code null}
     * @param index  the position of the new object
     * @param element  the object to add
     * @return A new array containing the existing elements and the new element
     * @throws IndexOutOfBoundsException if the index is out of range
     * (index &lt; 0 || index &gt; array.length).
     * @deprecated this method has been superseded by {@link #insert(int, byte[], byte...)} and
     * may be removed in a future release. Please note the handling of {@code null} input arrays differs
     * in the new method: inserting {@code X} into a {@code null} array results in {@code null} not {@code X}.
     */
    @Deprecated
    public static byte[] add(final byte[] array, final int index, final byte element) {try{__CLR4_5_27070lvha78c4.R.inc(2720);
        __CLR4_5_27070lvha78c4.R.inc(2721);return (byte[]) add(array, index, Byte.valueOf(element), Byte.TYPE);
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Inserts the specified element at the specified position in the array.
     * Shifts the element currently at that position (if any) and any subsequent
     * elements to the right (adds one to their indices).
     *
     * <p>This method returns a new array with the same elements of the input
     * array plus the given element on the specified position. The component
     * type of the returned array is always the same as that of the input
     * array.
     *
     * <p>If the input array is {@code null}, a new one element array is returned
     *  whose component type is the same as the element.
     *
     * <pre>
     * ArrayUtils.add([1], 0, 2)         = [2, 1]
     * ArrayUtils.add([2, 6], 2, 10)     = [2, 6, 10]
     * ArrayUtils.add([2, 6], 0, -4)     = [-4, 2, 6]
     * ArrayUtils.add([2, 6, 3], 2, 1)   = [2, 6, 1, 3]
     * </pre>
     *
     * @param array  the array to add the element to, may be {@code null}
     * @param index  the position of the new object
     * @param element  the object to add
     * @return A new array containing the existing elements and the new element
     * @throws IndexOutOfBoundsException if the index is out of range
     * (index &lt; 0 || index &gt; array.length).
     * @deprecated this method has been superseded by {@link #insert(int, short[], short...)} and
     * may be removed in a future release. Please note the handling of {@code null} input arrays differs
     * in the new method: inserting {@code X} into a {@code null} array results in {@code null} not {@code X}.
     */
    @Deprecated
    public static short[] add(final short[] array, final int index, final short element) {try{__CLR4_5_27070lvha78c4.R.inc(2722);
        __CLR4_5_27070lvha78c4.R.inc(2723);return (short[]) add(array, index, Short.valueOf(element), Short.TYPE);
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Inserts the specified element at the specified position in the array.
     * Shifts the element currently at that position (if any) and any subsequent
     * elements to the right (adds one to their indices).
     *
     * <p>This method returns a new array with the same elements of the input
     * array plus the given element on the specified position. The component
     * type of the returned array is always the same as that of the input
     * array.
     *
     * <p>If the input array is {@code null}, a new one element array is returned
     *  whose component type is the same as the element.
     *
     * <pre>
     * ArrayUtils.add([1], 0, 2)         = [2, 1]
     * ArrayUtils.add([2, 6], 2, 10)     = [2, 6, 10]
     * ArrayUtils.add([2, 6], 0, -4)     = [-4, 2, 6]
     * ArrayUtils.add([2, 6, 3], 2, 1)   = [2, 6, 1, 3]
     * </pre>
     *
     * @param array  the array to add the element to, may be {@code null}
     * @param index  the position of the new object
     * @param element  the object to add
     * @return A new array containing the existing elements and the new element
     * @throws IndexOutOfBoundsException if the index is out of range
     * (index &lt; 0 || index &gt; array.length).
     * @deprecated this method has been superseded by {@link #insert(int, int[], int...)} and
     * may be removed in a future release. Please note the handling of {@code null} input arrays differs
     * in the new method: inserting {@code X} into a {@code null} array results in {@code null} not {@code X}.
     */
    @Deprecated
    public static int[] add(final int[] array, final int index, final int element) {try{__CLR4_5_27070lvha78c4.R.inc(2724);
        __CLR4_5_27070lvha78c4.R.inc(2725);return (int[]) add(array, index, Integer.valueOf(element), Integer.TYPE);
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Inserts the specified element at the specified position in the array.
     * Shifts the element currently at that position (if any) and any subsequent
     * elements to the right (adds one to their indices).
     *
     * <p>This method returns a new array with the same elements of the input
     * array plus the given element on the specified position. The component
     * type of the returned array is always the same as that of the input
     * array.
     *
     * <p>If the input array is {@code null}, a new one element array is returned
     *  whose component type is the same as the element.
     *
     * <pre>
     * ArrayUtils.add([1L], 0, 2L)           = [2L, 1L]
     * ArrayUtils.add([2L, 6L], 2, 10L)      = [2L, 6L, 10L]
     * ArrayUtils.add([2L, 6L], 0, -4L)      = [-4L, 2L, 6L]
     * ArrayUtils.add([2L, 6L, 3L], 2, 1L)   = [2L, 6L, 1L, 3L]
     * </pre>
     *
     * @param array  the array to add the element to, may be {@code null}
     * @param index  the position of the new object
     * @param element  the object to add
     * @return A new array containing the existing elements and the new element
     * @throws IndexOutOfBoundsException if the index is out of range
     * (index &lt; 0 || index &gt; array.length).
     * @deprecated this method has been superseded by {@link #insert(int, long[], long...)} and
     * may be removed in a future release. Please note the handling of {@code null} input arrays differs
     * in the new method: inserting {@code X} into a {@code null} array results in {@code null} not {@code X}.
     */
    @Deprecated
    public static long[] add(final long[] array, final int index, final long element) {try{__CLR4_5_27070lvha78c4.R.inc(2726);
        __CLR4_5_27070lvha78c4.R.inc(2727);return (long[]) add(array, index, Long.valueOf(element), Long.TYPE);
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Inserts the specified element at the specified position in the array.
     * Shifts the element currently at that position (if any) and any subsequent
     * elements to the right (adds one to their indices).
     *
     * <p>This method returns a new array with the same elements of the input
     * array plus the given element on the specified position. The component
     * type of the returned array is always the same as that of the input
     * array.
     *
     * <p>If the input array is {@code null}, a new one element array is returned
     *  whose component type is the same as the element.
     *
     * <pre>
     * ArrayUtils.add([1.1f], 0, 2.2f)               = [2.2f, 1.1f]
     * ArrayUtils.add([2.3f, 6.4f], 2, 10.5f)        = [2.3f, 6.4f, 10.5f]
     * ArrayUtils.add([2.6f, 6.7f], 0, -4.8f)        = [-4.8f, 2.6f, 6.7f]
     * ArrayUtils.add([2.9f, 6.0f, 0.3f], 2, 1.0f)   = [2.9f, 6.0f, 1.0f, 0.3f]
     * </pre>
     *
     * @param array  the array to add the element to, may be {@code null}
     * @param index  the position of the new object
     * @param element  the object to add
     * @return A new array containing the existing elements and the new element
     * @throws IndexOutOfBoundsException if the index is out of range
     * (index &lt; 0 || index &gt; array.length).
     * @deprecated this method has been superseded by {@link #insert(int, float[], float...)} and
     * may be removed in a future release. Please note the handling of {@code null} input arrays differs
     * in the new method: inserting {@code X} into a {@code null} array results in {@code null} not {@code X}.
     */
    @Deprecated
    public static float[] add(final float[] array, final int index, final float element) {try{__CLR4_5_27070lvha78c4.R.inc(2728);
        __CLR4_5_27070lvha78c4.R.inc(2729);return (float[]) add(array, index, Float.valueOf(element), Float.TYPE);
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Inserts the specified element at the specified position in the array.
     * Shifts the element currently at that position (if any) and any subsequent
     * elements to the right (adds one to their indices).
     *
     * <p>This method returns a new array with the same elements of the input
     * array plus the given element on the specified position. The component
     * type of the returned array is always the same as that of the input
     * array.
     *
     * <p>If the input array is {@code null}, a new one element array is returned
     *  whose component type is the same as the element.
     *
     * <pre>
     * ArrayUtils.add([1.1], 0, 2.2)              = [2.2, 1.1]
     * ArrayUtils.add([2.3, 6.4], 2, 10.5)        = [2.3, 6.4, 10.5]
     * ArrayUtils.add([2.6, 6.7], 0, -4.8)        = [-4.8, 2.6, 6.7]
     * ArrayUtils.add([2.9, 6.0, 0.3], 2, 1.0)    = [2.9, 6.0, 1.0, 0.3]
     * </pre>
     *
     * @param array  the array to add the element to, may be {@code null}
     * @param index  the position of the new object
     * @param element  the object to add
     * @return A new array containing the existing elements and the new element
     * @throws IndexOutOfBoundsException if the index is out of range
     * (index &lt; 0 || index &gt; array.length).
     * @deprecated this method has been superseded by {@link #insert(int, double[], double...)} and
     * may be removed in a future release. Please note the handling of {@code null} input arrays differs
     * in the new method: inserting {@code X} into a {@code null} array results in {@code null} not {@code X}.
     */
    @Deprecated
    public static double[] add(final double[] array, final int index, final double element) {try{__CLR4_5_27070lvha78c4.R.inc(2730);
        __CLR4_5_27070lvha78c4.R.inc(2731);return (double[]) add(array, index, Double.valueOf(element), Double.TYPE);
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * Underlying implementation of add(array, index, element) methods.
     * The last parameter is the class, which may not equal element.getClass
     * for primitives.
     *
     * @param array  the array to add the element to, may be {@code null}
     * @param index  the position of the new object
     * @param element  the object to add
     * @param clss the type of the element being added
     * @return A new array containing the existing elements and the new element
     */
    private static Object add(final Object array, final int index, final Object element, final Class<?> clss) {try{__CLR4_5_27070lvha78c4.R.inc(2732);
        __CLR4_5_27070lvha78c4.R.inc(2733);if ((((array == null)&&(__CLR4_5_27070lvha78c4.R.iget(2734)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(2735)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(2736);if ((((index != 0)&&(__CLR4_5_27070lvha78c4.R.iget(2737)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(2738)==0&false))) {{
                __CLR4_5_27070lvha78c4.R.inc(2739);throw new IndexOutOfBoundsException("Index: " + index + ", Length: 0");
            }
            }__CLR4_5_27070lvha78c4.R.inc(2740);final Object joinedArray = Array.newInstance(clss, 1);
            __CLR4_5_27070lvha78c4.R.inc(2741);Array.set(joinedArray, 0, element);
            __CLR4_5_27070lvha78c4.R.inc(2742);return joinedArray;
        }
        }__CLR4_5_27070lvha78c4.R.inc(2743);final int length = Array.getLength(array);
        __CLR4_5_27070lvha78c4.R.inc(2744);if ((((index > length || index < 0)&&(__CLR4_5_27070lvha78c4.R.iget(2745)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(2746)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(2747);throw new IndexOutOfBoundsException("Index: " + index + ", Length: " + length);
        }
        }__CLR4_5_27070lvha78c4.R.inc(2748);final Object result = Array.newInstance(clss, length + 1);
        __CLR4_5_27070lvha78c4.R.inc(2749);System.arraycopy(array, 0, result, 0, index);
        __CLR4_5_27070lvha78c4.R.inc(2750);Array.set(result, index, element);
        __CLR4_5_27070lvha78c4.R.inc(2751);if ((((index < length)&&(__CLR4_5_27070lvha78c4.R.iget(2752)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(2753)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(2754);System.arraycopy(array, index, result, index + 1, length - index);
        }
        }__CLR4_5_27070lvha78c4.R.inc(2755);return result;
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Removes the element at the specified position from the specified array.
     * All subsequent elements are shifted to the left (subtracts one from
     * their indices).
     *
     * <p>This method returns a new array with the same elements of the input
     * array except the element on the specified position. The component
     * type of the returned array is always the same as that of the input
     * array.
     *
     * <p>If the input array is {@code null}, an IndexOutOfBoundsException
     * will be thrown, because in that case no valid index can be specified.
     *
     * <pre>
     * ArrayUtils.remove(["a"], 0)           = []
     * ArrayUtils.remove(["a", "b"], 0)      = ["b"]
     * ArrayUtils.remove(["a", "b"], 1)      = ["a"]
     * ArrayUtils.remove(["a", "b", "c"], 1) = ["a", "c"]
     * </pre>
     *
     * @param <T> the component type of the array
     * @param array  the array to remove the element from, may not be {@code null}
     * @param index  the position of the element to be removed
     * @return A new array containing the existing elements except the element
     *         at the specified position.
     * @throws IndexOutOfBoundsException if the index is out of range
     * (index &lt; 0 || index &gt;= array.length), or if the array is {@code null}.
     * @since 2.1
     */
    @SuppressWarnings("unchecked") // remove() always creates an array of the same type as its input
    public static <T> T[] remove(final T[] array, final int index) {try{__CLR4_5_27070lvha78c4.R.inc(2756);
        __CLR4_5_27070lvha78c4.R.inc(2757);return (T[]) remove((Object) array, index);
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Removes the first occurrence of the specified element from the
     * specified array. All subsequent elements are shifted to the left
     * (subtracts one from their indices). If the array doesn't contains
     * such an element, no elements are removed from the array.
     *
     * <p>This method returns a new array with the same elements of the input
     * array except the first occurrence of the specified element. The component
     * type of the returned array is always the same as that of the input
     * array.
     *
     * <pre>
     * ArrayUtils.removeElement(null, "a")            = null
     * ArrayUtils.removeElement([], "a")              = []
     * ArrayUtils.removeElement(["a"], "b")           = ["a"]
     * ArrayUtils.removeElement(["a", "b"], "a")      = ["b"]
     * ArrayUtils.removeElement(["a", "b", "a"], "a") = ["b", "a"]
     * </pre>
     *
     * @param <T> the component type of the array
     * @param array  the array to remove the element from, may be {@code null}
     * @param element  the element to be removed
     * @return A new array containing the existing elements except the first
     *         occurrence of the specified element.
     * @since 2.1
     */
    public static <T> T[] removeElement(final T[] array, final Object element) {try{__CLR4_5_27070lvha78c4.R.inc(2758);
        __CLR4_5_27070lvha78c4.R.inc(2759);final int index = indexOf(array, element);
        __CLR4_5_27070lvha78c4.R.inc(2760);if ((((index == INDEX_NOT_FOUND)&&(__CLR4_5_27070lvha78c4.R.iget(2761)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(2762)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(2763);return clone(array);
        }
        }__CLR4_5_27070lvha78c4.R.inc(2764);return remove(array, index);
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Removes the element at the specified position from the specified array.
     * All subsequent elements are shifted to the left (subtracts one from
     * their indices).
     *
     * <p>This method returns a new array with the same elements of the input
     * array except the element on the specified position. The component
     * type of the returned array is always the same as that of the input
     * array.
     *
     * <p>If the input array is {@code null}, an IndexOutOfBoundsException
     * will be thrown, because in that case no valid index can be specified.
     *
     * <pre>
     * ArrayUtils.remove([true], 0)              = []
     * ArrayUtils.remove([true, false], 0)       = [false]
     * ArrayUtils.remove([true, false], 1)       = [true]
     * ArrayUtils.remove([true, true, false], 1) = [true, false]
     * </pre>
     *
     * @param array  the array to remove the element from, may not be {@code null}
     * @param index  the position of the element to be removed
     * @return A new array containing the existing elements except the element
     *         at the specified position.
     * @throws IndexOutOfBoundsException if the index is out of range
     * (index &lt; 0 || index &gt;= array.length), or if the array is {@code null}.
     * @since 2.1
     */
    public static boolean[] remove(final boolean[] array, final int index) {try{__CLR4_5_27070lvha78c4.R.inc(2765);
        __CLR4_5_27070lvha78c4.R.inc(2766);return (boolean[]) remove((Object) array, index);
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Removes the first occurrence of the specified element from the
     * specified array. All subsequent elements are shifted to the left
     * (subtracts one from their indices). If the array doesn't contains
     * such an element, no elements are removed from the array.
     *
     * <p>This method returns a new array with the same elements of the input
     * array except the first occurrence of the specified element. The component
     * type of the returned array is always the same as that of the input
     * array.
     *
     * <pre>
     * ArrayUtils.removeElement(null, true)                = null
     * ArrayUtils.removeElement([], true)                  = []
     * ArrayUtils.removeElement([true], false)             = [true]
     * ArrayUtils.removeElement([true, false], false)      = [true]
     * ArrayUtils.removeElement([true, false, true], true) = [false, true]
     * </pre>
     *
     * @param array  the array to remove the element from, may be {@code null}
     * @param element  the element to be removed
     * @return A new array containing the existing elements except the first
     *         occurrence of the specified element.
     * @since 2.1
     */
    public static boolean[] removeElement(final boolean[] array, final boolean element) {try{__CLR4_5_27070lvha78c4.R.inc(2767);
        __CLR4_5_27070lvha78c4.R.inc(2768);final int index = indexOf(array, element);
        __CLR4_5_27070lvha78c4.R.inc(2769);if ((((index == INDEX_NOT_FOUND)&&(__CLR4_5_27070lvha78c4.R.iget(2770)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(2771)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(2772);return clone(array);
        }
        }__CLR4_5_27070lvha78c4.R.inc(2773);return remove(array, index);
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Removes the element at the specified position from the specified array.
     * All subsequent elements are shifted to the left (subtracts one from
     * their indices).
     *
     * <p>This method returns a new array with the same elements of the input
     * array except the element on the specified position. The component
     * type of the returned array is always the same as that of the input
     * array.
     *
     * <p>If the input array is {@code null}, an IndexOutOfBoundsException
     * will be thrown, because in that case no valid index can be specified.
     *
     * <pre>
     * ArrayUtils.remove([1], 0)          = []
     * ArrayUtils.remove([1, 0], 0)       = [0]
     * ArrayUtils.remove([1, 0], 1)       = [1]
     * ArrayUtils.remove([1, 0, 1], 1)    = [1, 1]
     * </pre>
     *
     * @param array  the array to remove the element from, may not be {@code null}
     * @param index  the position of the element to be removed
     * @return A new array containing the existing elements except the element
     *         at the specified position.
     * @throws IndexOutOfBoundsException if the index is out of range
     * (index &lt; 0 || index &gt;= array.length), or if the array is {@code null}.
     * @since 2.1
     */
    public static byte[] remove(final byte[] array, final int index) {try{__CLR4_5_27070lvha78c4.R.inc(2774);
        __CLR4_5_27070lvha78c4.R.inc(2775);return (byte[]) remove((Object) array, index);
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Removes the first occurrence of the specified element from the
     * specified array. All subsequent elements are shifted to the left
     * (subtracts one from their indices). If the array doesn't contains
     * such an element, no elements are removed from the array.
     *
     * <p>This method returns a new array with the same elements of the input
     * array except the first occurrence of the specified element. The component
     * type of the returned array is always the same as that of the input
     * array.
     *
     * <pre>
     * ArrayUtils.removeElement(null, 1)        = null
     * ArrayUtils.removeElement([], 1)          = []
     * ArrayUtils.removeElement([1], 0)         = [1]
     * ArrayUtils.removeElement([1, 0], 0)      = [1]
     * ArrayUtils.removeElement([1, 0, 1], 1)   = [0, 1]
     * </pre>
     *
     * @param array  the array to remove the element from, may be {@code null}
     * @param element  the element to be removed
     * @return A new array containing the existing elements except the first
     *         occurrence of the specified element.
     * @since 2.1
     */
    public static byte[] removeElement(final byte[] array, final byte element) {try{__CLR4_5_27070lvha78c4.R.inc(2776);
        __CLR4_5_27070lvha78c4.R.inc(2777);final int index = indexOf(array, element);
        __CLR4_5_27070lvha78c4.R.inc(2778);if ((((index == INDEX_NOT_FOUND)&&(__CLR4_5_27070lvha78c4.R.iget(2779)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(2780)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(2781);return clone(array);
        }
        }__CLR4_5_27070lvha78c4.R.inc(2782);return remove(array, index);
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Removes the element at the specified position from the specified array.
     * All subsequent elements are shifted to the left (subtracts one from
     * their indices).
     *
     * <p>This method returns a new array with the same elements of the input
     * array except the element on the specified position. The component
     * type of the returned array is always the same as that of the input
     * array.
     *
     * <p>If the input array is {@code null}, an IndexOutOfBoundsException
     * will be thrown, because in that case no valid index can be specified.
     *
     * <pre>
     * ArrayUtils.remove(['a'], 0)           = []
     * ArrayUtils.remove(['a', 'b'], 0)      = ['b']
     * ArrayUtils.remove(['a', 'b'], 1)      = ['a']
     * ArrayUtils.remove(['a', 'b', 'c'], 1) = ['a', 'c']
     * </pre>
     *
     * @param array  the array to remove the element from, may not be {@code null}
     * @param index  the position of the element to be removed
     * @return A new array containing the existing elements except the element
     *         at the specified position.
     * @throws IndexOutOfBoundsException if the index is out of range
     * (index &lt; 0 || index &gt;= array.length), or if the array is {@code null}.
     * @since 2.1
     */
    public static char[] remove(final char[] array, final int index) {try{__CLR4_5_27070lvha78c4.R.inc(2783);
        __CLR4_5_27070lvha78c4.R.inc(2784);return (char[]) remove((Object) array, index);
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Removes the first occurrence of the specified element from the
     * specified array. All subsequent elements are shifted to the left
     * (subtracts one from their indices). If the array doesn't contains
     * such an element, no elements are removed from the array.
     *
     * <p>This method returns a new array with the same elements of the input
     * array except the first occurrence of the specified element. The component
     * type of the returned array is always the same as that of the input
     * array.
     *
     * <pre>
     * ArrayUtils.removeElement(null, 'a')            = null
     * ArrayUtils.removeElement([], 'a')              = []
     * ArrayUtils.removeElement(['a'], 'b')           = ['a']
     * ArrayUtils.removeElement(['a', 'b'], 'a')      = ['b']
     * ArrayUtils.removeElement(['a', 'b', 'a'], 'a') = ['b', 'a']
     * </pre>
     *
     * @param array  the array to remove the element from, may be {@code null}
     * @param element  the element to be removed
     * @return A new array containing the existing elements except the first
     *         occurrence of the specified element.
     * @since 2.1
     */
    public static char[] removeElement(final char[] array, final char element) {try{__CLR4_5_27070lvha78c4.R.inc(2785);
        __CLR4_5_27070lvha78c4.R.inc(2786);final int index = indexOf(array, element);
        __CLR4_5_27070lvha78c4.R.inc(2787);if ((((index == INDEX_NOT_FOUND)&&(__CLR4_5_27070lvha78c4.R.iget(2788)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(2789)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(2790);return clone(array);
        }
        }__CLR4_5_27070lvha78c4.R.inc(2791);return remove(array, index);
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Removes the element at the specified position from the specified array.
     * All subsequent elements are shifted to the left (subtracts one from
     * their indices).
     *
     * <p>This method returns a new array with the same elements of the input
     * array except the element on the specified position. The component
     * type of the returned array is always the same as that of the input
     * array.
     *
     * <p>If the input array is {@code null}, an IndexOutOfBoundsException
     * will be thrown, because in that case no valid index can be specified.
     *
     * <pre>
     * ArrayUtils.remove([1.1], 0)           = []
     * ArrayUtils.remove([2.5, 6.0], 0)      = [6.0]
     * ArrayUtils.remove([2.5, 6.0], 1)      = [2.5]
     * ArrayUtils.remove([2.5, 6.0, 3.8], 1) = [2.5, 3.8]
     * </pre>
     *
     * @param array  the array to remove the element from, may not be {@code null}
     * @param index  the position of the element to be removed
     * @return A new array containing the existing elements except the element
     *         at the specified position.
     * @throws IndexOutOfBoundsException if the index is out of range
     * (index &lt; 0 || index &gt;= array.length), or if the array is {@code null}.
     * @since 2.1
     */
    public static double[] remove(final double[] array, final int index) {try{__CLR4_5_27070lvha78c4.R.inc(2792);
        __CLR4_5_27070lvha78c4.R.inc(2793);return (double[]) remove((Object) array, index);
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Removes the first occurrence of the specified element from the
     * specified array. All subsequent elements are shifted to the left
     * (subtracts one from their indices). If the array doesn't contains
     * such an element, no elements are removed from the array.
     *
     * <p>This method returns a new array with the same elements of the input
     * array except the first occurrence of the specified element. The component
     * type of the returned array is always the same as that of the input
     * array.
     *
     * <pre>
     * ArrayUtils.removeElement(null, 1.1)            = null
     * ArrayUtils.removeElement([], 1.1)              = []
     * ArrayUtils.removeElement([1.1], 1.2)           = [1.1]
     * ArrayUtils.removeElement([1.1, 2.3], 1.1)      = [2.3]
     * ArrayUtils.removeElement([1.1, 2.3, 1.1], 1.1) = [2.3, 1.1]
     * </pre>
     *
     * @param array  the array to remove the element from, may be {@code null}
     * @param element  the element to be removed
     * @return A new array containing the existing elements except the first
     *         occurrence of the specified element.
     * @since 2.1
     */
    public static double[] removeElement(final double[] array, final double element) {try{__CLR4_5_27070lvha78c4.R.inc(2794);
        __CLR4_5_27070lvha78c4.R.inc(2795);final int index = indexOf(array, element);
        __CLR4_5_27070lvha78c4.R.inc(2796);if ((((index == INDEX_NOT_FOUND)&&(__CLR4_5_27070lvha78c4.R.iget(2797)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(2798)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(2799);return clone(array);
        }
        }__CLR4_5_27070lvha78c4.R.inc(2800);return remove(array, index);
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Removes the element at the specified position from the specified array.
     * All subsequent elements are shifted to the left (subtracts one from
     * their indices).
     *
     * <p>This method returns a new array with the same elements of the input
     * array except the element on the specified position. The component
     * type of the returned array is always the same as that of the input
     * array.
     *
     * <p>If the input array is {@code null}, an IndexOutOfBoundsException
     * will be thrown, because in that case no valid index can be specified.
     *
     * <pre>
     * ArrayUtils.remove([1.1], 0)           = []
     * ArrayUtils.remove([2.5, 6.0], 0)      = [6.0]
     * ArrayUtils.remove([2.5, 6.0], 1)      = [2.5]
     * ArrayUtils.remove([2.5, 6.0, 3.8], 1) = [2.5, 3.8]
     * </pre>
     *
     * @param array  the array to remove the element from, may not be {@code null}
     * @param index  the position of the element to be removed
     * @return A new array containing the existing elements except the element
     *         at the specified position.
     * @throws IndexOutOfBoundsException if the index is out of range
     * (index &lt; 0 || index &gt;= array.length), or if the array is {@code null}.
     * @since 2.1
     */
    public static float[] remove(final float[] array, final int index) {try{__CLR4_5_27070lvha78c4.R.inc(2801);
        __CLR4_5_27070lvha78c4.R.inc(2802);return (float[]) remove((Object) array, index);
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Removes the first occurrence of the specified element from the
     * specified array. All subsequent elements are shifted to the left
     * (subtracts one from their indices). If the array doesn't contains
     * such an element, no elements are removed from the array.
     *
     * <p>This method returns a new array with the same elements of the input
     * array except the first occurrence of the specified element. The component
     * type of the returned array is always the same as that of the input
     * array.
     *
     * <pre>
     * ArrayUtils.removeElement(null, 1.1)            = null
     * ArrayUtils.removeElement([], 1.1)              = []
     * ArrayUtils.removeElement([1.1], 1.2)           = [1.1]
     * ArrayUtils.removeElement([1.1, 2.3], 1.1)      = [2.3]
     * ArrayUtils.removeElement([1.1, 2.3, 1.1], 1.1) = [2.3, 1.1]
     * </pre>
     *
     * @param array  the array to remove the element from, may be {@code null}
     * @param element  the element to be removed
     * @return A new array containing the existing elements except the first
     *         occurrence of the specified element.
     * @since 2.1
     */
    public static float[] removeElement(final float[] array, final float element) {try{__CLR4_5_27070lvha78c4.R.inc(2803);
        __CLR4_5_27070lvha78c4.R.inc(2804);final int index = indexOf(array, element);
        __CLR4_5_27070lvha78c4.R.inc(2805);if ((((index == INDEX_NOT_FOUND)&&(__CLR4_5_27070lvha78c4.R.iget(2806)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(2807)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(2808);return clone(array);
        }
        }__CLR4_5_27070lvha78c4.R.inc(2809);return remove(array, index);
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Removes the element at the specified position from the specified array.
     * All subsequent elements are shifted to the left (subtracts one from
     * their indices).
     *
     * <p>This method returns a new array with the same elements of the input
     * array except the element on the specified position. The component
     * type of the returned array is always the same as that of the input
     * array.
     *
     * <p>If the input array is {@code null}, an IndexOutOfBoundsException
     * will be thrown, because in that case no valid index can be specified.
     *
     * <pre>
     * ArrayUtils.remove([1], 0)         = []
     * ArrayUtils.remove([2, 6], 0)      = [6]
     * ArrayUtils.remove([2, 6], 1)      = [2]
     * ArrayUtils.remove([2, 6, 3], 1)   = [2, 3]
     * </pre>
     *
     * @param array  the array to remove the element from, may not be {@code null}
     * @param index  the position of the element to be removed
     * @return A new array containing the existing elements except the element
     *         at the specified position.
     * @throws IndexOutOfBoundsException if the index is out of range
     * (index &lt; 0 || index &gt;= array.length), or if the array is {@code null}.
     * @since 2.1
     */
    public static int[] remove(final int[] array, final int index) {try{__CLR4_5_27070lvha78c4.R.inc(2810);
        __CLR4_5_27070lvha78c4.R.inc(2811);return (int[]) remove((Object) array, index);
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Removes the first occurrence of the specified element from the
     * specified array. All subsequent elements are shifted to the left
     * (subtracts one from their indices). If the array doesn't contains
     * such an element, no elements are removed from the array.
     *
     * <p>This method returns a new array with the same elements of the input
     * array except the first occurrence of the specified element. The component
     * type of the returned array is always the same as that of the input
     * array.
     *
     * <pre>
     * ArrayUtils.removeElement(null, 1)      = null
     * ArrayUtils.removeElement([], 1)        = []
     * ArrayUtils.removeElement([1], 2)       = [1]
     * ArrayUtils.removeElement([1, 3], 1)    = [3]
     * ArrayUtils.removeElement([1, 3, 1], 1) = [3, 1]
     * </pre>
     *
     * @param array  the array to remove the element from, may be {@code null}
     * @param element  the element to be removed
     * @return A new array containing the existing elements except the first
     *         occurrence of the specified element.
     * @since 2.1
     */
    public static int[] removeElement(final int[] array, final int element) {try{__CLR4_5_27070lvha78c4.R.inc(2812);
        __CLR4_5_27070lvha78c4.R.inc(2813);final int index = indexOf(array, element);
        __CLR4_5_27070lvha78c4.R.inc(2814);if ((((index == INDEX_NOT_FOUND)&&(__CLR4_5_27070lvha78c4.R.iget(2815)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(2816)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(2817);return clone(array);
        }
        }__CLR4_5_27070lvha78c4.R.inc(2818);return remove(array, index);
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Removes the element at the specified position from the specified array.
     * All subsequent elements are shifted to the left (subtracts one from
     * their indices).
     *
     * <p>This method returns a new array with the same elements of the input
     * array except the element on the specified position. The component
     * type of the returned array is always the same as that of the input
     * array.
     *
     * <p>If the input array is {@code null}, an IndexOutOfBoundsException
     * will be thrown, because in that case no valid index can be specified.
     *
     * <pre>
     * ArrayUtils.remove([1], 0)         = []
     * ArrayUtils.remove([2, 6], 0)      = [6]
     * ArrayUtils.remove([2, 6], 1)      = [2]
     * ArrayUtils.remove([2, 6, 3], 1)   = [2, 3]
     * </pre>
     *
     * @param array  the array to remove the element from, may not be {@code null}
     * @param index  the position of the element to be removed
     * @return A new array containing the existing elements except the element
     *         at the specified position.
     * @throws IndexOutOfBoundsException if the index is out of range
     * (index &lt; 0 || index &gt;= array.length), or if the array is {@code null}.
     * @since 2.1
     */
    public static long[] remove(final long[] array, final int index) {try{__CLR4_5_27070lvha78c4.R.inc(2819);
        __CLR4_5_27070lvha78c4.R.inc(2820);return (long[]) remove((Object) array, index);
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Removes the first occurrence of the specified element from the
     * specified array. All subsequent elements are shifted to the left
     * (subtracts one from their indices). If the array doesn't contains
     * such an element, no elements are removed from the array.
     *
     * <p>This method returns a new array with the same elements of the input
     * array except the first occurrence of the specified element. The component
     * type of the returned array is always the same as that of the input
     * array.
     *
     * <pre>
     * ArrayUtils.removeElement(null, 1)      = null
     * ArrayUtils.removeElement([], 1)        = []
     * ArrayUtils.removeElement([1], 2)       = [1]
     * ArrayUtils.removeElement([1, 3], 1)    = [3]
     * ArrayUtils.removeElement([1, 3, 1], 1) = [3, 1]
     * </pre>
     *
     * @param array  the array to remove the element from, may be {@code null}
     * @param element  the element to be removed
     * @return A new array containing the existing elements except the first
     *         occurrence of the specified element.
     * @since 2.1
     */
    public static long[] removeElement(final long[] array, final long element) {try{__CLR4_5_27070lvha78c4.R.inc(2821);
        __CLR4_5_27070lvha78c4.R.inc(2822);final int index = indexOf(array, element);
        __CLR4_5_27070lvha78c4.R.inc(2823);if ((((index == INDEX_NOT_FOUND)&&(__CLR4_5_27070lvha78c4.R.iget(2824)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(2825)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(2826);return clone(array);
        }
        }__CLR4_5_27070lvha78c4.R.inc(2827);return remove(array, index);
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Removes the element at the specified position from the specified array.
     * All subsequent elements are shifted to the left (subtracts one from
     * their indices).
     *
     * <p>This method returns a new array with the same elements of the input
     * array except the element on the specified position. The component
     * type of the returned array is always the same as that of the input
     * array.
     *
     * <p>If the input array is {@code null}, an IndexOutOfBoundsException
     * will be thrown, because in that case no valid index can be specified.
     *
     * <pre>
     * ArrayUtils.remove([1], 0)         = []
     * ArrayUtils.remove([2, 6], 0)      = [6]
     * ArrayUtils.remove([2, 6], 1)      = [2]
     * ArrayUtils.remove([2, 6, 3], 1)   = [2, 3]
     * </pre>
     *
     * @param array  the array to remove the element from, may not be {@code null}
     * @param index  the position of the element to be removed
     * @return A new array containing the existing elements except the element
     *         at the specified position.
     * @throws IndexOutOfBoundsException if the index is out of range
     * (index &lt; 0 || index &gt;= array.length), or if the array is {@code null}.
     * @since 2.1
     */
    public static short[] remove(final short[] array, final int index) {try{__CLR4_5_27070lvha78c4.R.inc(2828);
        __CLR4_5_27070lvha78c4.R.inc(2829);return (short[]) remove((Object) array, index);
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Removes the first occurrence of the specified element from the
     * specified array. All subsequent elements are shifted to the left
     * (subtracts one from their indices). If the array doesn't contains
     * such an element, no elements are removed from the array.
     *
     * <p>This method returns a new array with the same elements of the input
     * array except the first occurrence of the specified element. The component
     * type of the returned array is always the same as that of the input
     * array.
     *
     * <pre>
     * ArrayUtils.removeElement(null, 1)      = null
     * ArrayUtils.removeElement([], 1)        = []
     * ArrayUtils.removeElement([1], 2)       = [1]
     * ArrayUtils.removeElement([1, 3], 1)    = [3]
     * ArrayUtils.removeElement([1, 3, 1], 1) = [3, 1]
     * </pre>
     *
     * @param array  the array to remove the element from, may be {@code null}
     * @param element  the element to be removed
     * @return A new array containing the existing elements except the first
     *         occurrence of the specified element.
     * @since 2.1
     */
    public static short[] removeElement(final short[] array, final short element) {try{__CLR4_5_27070lvha78c4.R.inc(2830);
        __CLR4_5_27070lvha78c4.R.inc(2831);final int index = indexOf(array, element);
        __CLR4_5_27070lvha78c4.R.inc(2832);if ((((index == INDEX_NOT_FOUND)&&(__CLR4_5_27070lvha78c4.R.iget(2833)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(2834)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(2835);return clone(array);
        }
        }__CLR4_5_27070lvha78c4.R.inc(2836);return remove(array, index);
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Removes the element at the specified position from the specified array.
     * All subsequent elements are shifted to the left (subtracts one from
     * their indices).
     *
     * <p>This method returns a new array with the same elements of the input
     * array except the element on the specified position. The component
     * type of the returned array is always the same as that of the input
     * array.
     *
     * <p>If the input array is {@code null}, an IndexOutOfBoundsException
     * will be thrown, because in that case no valid index can be specified.
     *
     * @param array  the array to remove the element from, may not be {@code null}
     * @param index  the position of the element to be removed
     * @return A new array containing the existing elements except the element
     *         at the specified position.
     * @throws IndexOutOfBoundsException if the index is out of range
     * (index &lt; 0 || index &gt;= array.length), or if the array is {@code null}.
     * @since 2.1
     */
    private static Object remove(final Object array, final int index) {try{__CLR4_5_27070lvha78c4.R.inc(2837);
        __CLR4_5_27070lvha78c4.R.inc(2838);final int length = getLength(array);
        __CLR4_5_27070lvha78c4.R.inc(2839);if ((((index < 0 || index >= length)&&(__CLR4_5_27070lvha78c4.R.iget(2840)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(2841)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(2842);throw new IndexOutOfBoundsException("Index: " + index + ", Length: " + length);
        }

        }__CLR4_5_27070lvha78c4.R.inc(2843);final Object result = Array.newInstance(array.getClass().getComponentType(), length - 1);
        __CLR4_5_27070lvha78c4.R.inc(2844);System.arraycopy(array, 0, result, 0, index);
        __CLR4_5_27070lvha78c4.R.inc(2845);if ((((index < length - 1)&&(__CLR4_5_27070lvha78c4.R.iget(2846)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(2847)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(2848);System.arraycopy(array, index + 1, result, index, length - index - 1);
        }

        }__CLR4_5_27070lvha78c4.R.inc(2849);return result;
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Removes the elements at the specified positions from the specified array.
     * All remaining elements are shifted to the left.
     *
     * <p>This method returns a new array with the same elements of the input
     * array except those at the specified positions. The component
     * type of the returned array is always the same as that of the input
     * array.
     *
     * <p>If the input array is {@code null}, an IndexOutOfBoundsException
     * will be thrown, because in that case no valid index can be specified.
     *
     * <pre>
     * ArrayUtils.removeAll(["a", "b", "c"], 0, 2) = ["b"]
     * ArrayUtils.removeAll(["a", "b", "c"], 1, 2) = ["a"]
     * </pre>
     *
     * @param <T> the component type of the array
     * @param array   the array to remove the element from, may not be {@code null}
     * @param indices the positions of the elements to be removed
     * @return A new array containing the existing elements except those
     *         at the specified positions.
     * @throws IndexOutOfBoundsException if any index is out of range
     * (index &lt; 0 || index &gt;= array.length), or if the array is {@code null}.
     * @since 3.0.1
     */
    @SuppressWarnings("unchecked") // removeAll() always creates an array of the same type as its input
    public static <T> T[] removeAll(final T[] array, final int... indices) {try{__CLR4_5_27070lvha78c4.R.inc(2850);
        __CLR4_5_27070lvha78c4.R.inc(2851);return (T[]) removeAll((Object) array, indices);
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Removes occurrences of specified elements, in specified quantities,
     * from the specified array. All subsequent elements are shifted left.
     * For any element-to-be-removed specified in greater quantities than
     * contained in the original array, no change occurs beyond the
     * removal of the existing matching items.
     *
     * <p>This method returns a new array with the same elements of the input
     * array except for the earliest-encountered occurrences of the specified
     * elements. The component type of the returned array is always the same
     * as that of the input array.
     *
     * <pre>
     * ArrayUtils.removeElements(null, "a", "b")            = null
     * ArrayUtils.removeElements([], "a", "b")              = []
     * ArrayUtils.removeElements(["a"], "b", "c")           = ["a"]
     * ArrayUtils.removeElements(["a", "b"], "a", "c")      = ["b"]
     * ArrayUtils.removeElements(["a", "b", "a"], "a")      = ["b", "a"]
     * ArrayUtils.removeElements(["a", "b", "a"], "a", "a") = ["b"]
     * </pre>
     *
     * @param <T> the component type of the array
     * @param array  the array to remove the element from, may be {@code null}
     * @param values the elements to be removed
     * @return A new array containing the existing elements except the
     *         earliest-encountered occurrences of the specified elements.
     * @since 3.0.1
     */
    @SafeVarargs
    public static <T> T[] removeElements(final T[] array, final T... values) {try{__CLR4_5_27070lvha78c4.R.inc(2852);
        __CLR4_5_27070lvha78c4.R.inc(2853);if ((((isEmpty(array) || isEmpty(values))&&(__CLR4_5_27070lvha78c4.R.iget(2854)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(2855)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(2856);return clone(array);
        }
        }__CLR4_5_27070lvha78c4.R.inc(2857);final HashMap<T, MutableInt> occurrences = new HashMap<>(values.length);
        __CLR4_5_27070lvha78c4.R.inc(2858);for (final T v : values) {{
            __CLR4_5_27070lvha78c4.R.inc(2859);final MutableInt count = occurrences.get(v);
            __CLR4_5_27070lvha78c4.R.inc(2860);if ((((count == null)&&(__CLR4_5_27070lvha78c4.R.iget(2861)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(2862)==0&false))) {{
                __CLR4_5_27070lvha78c4.R.inc(2863);occurrences.put(v, new MutableInt(1));
            } }else {{
                __CLR4_5_27070lvha78c4.R.inc(2864);count.increment();
            }
        }}
        }__CLR4_5_27070lvha78c4.R.inc(2865);final BitSet toRemove = new BitSet();
        __CLR4_5_27070lvha78c4.R.inc(2866);for (int i = 0; (((i < array.length)&&(__CLR4_5_27070lvha78c4.R.iget(2867)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(2868)==0&false)); i++) {{
            __CLR4_5_27070lvha78c4.R.inc(2869);final T key = array[i];
            __CLR4_5_27070lvha78c4.R.inc(2870);final MutableInt count = occurrences.get(key);
            __CLR4_5_27070lvha78c4.R.inc(2871);if ((((count != null)&&(__CLR4_5_27070lvha78c4.R.iget(2872)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(2873)==0&false))) {{
                __CLR4_5_27070lvha78c4.R.inc(2874);if ((((count.decrementAndGet() == 0)&&(__CLR4_5_27070lvha78c4.R.iget(2875)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(2876)==0&false))) {{
                    __CLR4_5_27070lvha78c4.R.inc(2877);occurrences.remove(key);
                }
                }__CLR4_5_27070lvha78c4.R.inc(2878);toRemove.set(i);
            }
        }}
        }__CLR4_5_27070lvha78c4.R.inc(2879);@SuppressWarnings("unchecked") // removeAll() always creates an array of the same type as its input
        final T[] result = (T[]) removeAll(array, toRemove);
        __CLR4_5_27070lvha78c4.R.inc(2880);return result;
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Removes the elements at the specified positions from the specified array.
     * All remaining elements are shifted to the left.
     *
     * <p>This method returns a new array with the same elements of the input
     * array except those at the specified positions. The component
     * type of the returned array is always the same as that of the input
     * array.
     *
     * <p>If the input array is {@code null}, an IndexOutOfBoundsException
     * will be thrown, because in that case no valid index can be specified.
     *
     * <pre>
     * ArrayUtils.removeAll([1], 0)             = []
     * ArrayUtils.removeAll([2, 6], 0)          = [6]
     * ArrayUtils.removeAll([2, 6], 0, 1)       = []
     * ArrayUtils.removeAll([2, 6, 3], 1, 2)    = [2]
     * ArrayUtils.removeAll([2, 6, 3], 0, 2)    = [6]
     * ArrayUtils.removeAll([2, 6, 3], 0, 1, 2) = []
     * </pre>
     *
     * @param array   the array to remove the element from, may not be {@code null}
     * @param indices the positions of the elements to be removed
     * @return A new array containing the existing elements except those
     *         at the specified positions.
     * @throws IndexOutOfBoundsException if any index is out of range
     * (index &lt; 0 || index &gt;= array.length), or if the array is {@code null}.
     * @since 3.0.1
     */
    public static byte[] removeAll(final byte[] array, final int... indices) {try{__CLR4_5_27070lvha78c4.R.inc(2881);
        __CLR4_5_27070lvha78c4.R.inc(2882);return (byte[]) removeAll((Object) array, indices);
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Removes occurrences of specified elements, in specified quantities,
     * from the specified array. All subsequent elements are shifted left.
     * For any element-to-be-removed specified in greater quantities than
     * contained in the original array, no change occurs beyond the
     * removal of the existing matching items.
     *
     * <p>This method returns a new array with the same elements of the input
     * array except for the earliest-encountered occurrences of the specified
     * elements. The component type of the returned array is always the same
     * as that of the input array.
     *
     * <pre>
     * ArrayUtils.removeElements(null, 1, 2)      = null
     * ArrayUtils.removeElements([], 1, 2)        = []
     * ArrayUtils.removeElements([1], 2, 3)       = [1]
     * ArrayUtils.removeElements([1, 3], 1, 2)    = [3]
     * ArrayUtils.removeElements([1, 3, 1], 1)    = [3, 1]
     * ArrayUtils.removeElements([1, 3, 1], 1, 1) = [3]
     * </pre>
     *
     * @param array  the array to remove the element from, may be {@code null}
     * @param values the elements to be removed
     * @return A new array containing the existing elements except the
     *         earliest-encountered occurrences of the specified elements.
     * @since 3.0.1
     */
    public static byte[] removeElements(final byte[] array, final byte... values) {try{__CLR4_5_27070lvha78c4.R.inc(2883);
        __CLR4_5_27070lvha78c4.R.inc(2884);if ((((isEmpty(array) || isEmpty(values))&&(__CLR4_5_27070lvha78c4.R.iget(2885)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(2886)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(2887);return clone(array);
        }
        }__CLR4_5_27070lvha78c4.R.inc(2888);final Map<Byte, MutableInt> occurrences = new HashMap<>(values.length);
        __CLR4_5_27070lvha78c4.R.inc(2889);for (final byte v : values) {{
            __CLR4_5_27070lvha78c4.R.inc(2890);final Byte boxed = Byte.valueOf(v);
            __CLR4_5_27070lvha78c4.R.inc(2891);final MutableInt count = occurrences.get(boxed);
            __CLR4_5_27070lvha78c4.R.inc(2892);if ((((count == null)&&(__CLR4_5_27070lvha78c4.R.iget(2893)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(2894)==0&false))) {{
                __CLR4_5_27070lvha78c4.R.inc(2895);occurrences.put(boxed, new MutableInt(1));
            } }else {{
                __CLR4_5_27070lvha78c4.R.inc(2896);count.increment();
            }
        }}
        }__CLR4_5_27070lvha78c4.R.inc(2897);final BitSet toRemove = new BitSet();
        __CLR4_5_27070lvha78c4.R.inc(2898);for (int i = 0; (((i < array.length)&&(__CLR4_5_27070lvha78c4.R.iget(2899)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(2900)==0&false)); i++) {{
            __CLR4_5_27070lvha78c4.R.inc(2901);final byte key = array[i];
            __CLR4_5_27070lvha78c4.R.inc(2902);final MutableInt count = occurrences.get(key);
            __CLR4_5_27070lvha78c4.R.inc(2903);if ((((count != null)&&(__CLR4_5_27070lvha78c4.R.iget(2904)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(2905)==0&false))) {{
                __CLR4_5_27070lvha78c4.R.inc(2906);if ((((count.decrementAndGet() == 0)&&(__CLR4_5_27070lvha78c4.R.iget(2907)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(2908)==0&false))) {{
                    __CLR4_5_27070lvha78c4.R.inc(2909);occurrences.remove(key);
                }
                }__CLR4_5_27070lvha78c4.R.inc(2910);toRemove.set(i);
            }
        }}
        }__CLR4_5_27070lvha78c4.R.inc(2911);return (byte[]) removeAll(array, toRemove);
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Removes the elements at the specified positions from the specified array.
     * All remaining elements are shifted to the left.
     *
     * <p>This method returns a new array with the same elements of the input
     * array except those at the specified positions. The component
     * type of the returned array is always the same as that of the input
     * array.
     *
     * <p>If the input array is {@code null}, an IndexOutOfBoundsException
     * will be thrown, because in that case no valid index can be specified.
     *
     * <pre>
     * ArrayUtils.removeAll([1], 0)             = []
     * ArrayUtils.removeAll([2, 6], 0)          = [6]
     * ArrayUtils.removeAll([2, 6], 0, 1)       = []
     * ArrayUtils.removeAll([2, 6, 3], 1, 2)    = [2]
     * ArrayUtils.removeAll([2, 6, 3], 0, 2)    = [6]
     * ArrayUtils.removeAll([2, 6, 3], 0, 1, 2) = []
     * </pre>
     *
     * @param array   the array to remove the element from, may not be {@code null}
     * @param indices the positions of the elements to be removed
     * @return A new array containing the existing elements except those
     *         at the specified positions.
     * @throws IndexOutOfBoundsException if any index is out of range
     * (index &lt; 0 || index &gt;= array.length), or if the array is {@code null}.
     * @since 3.0.1
     */
    public static short[] removeAll(final short[] array, final int... indices) {try{__CLR4_5_27070lvha78c4.R.inc(2912);
        __CLR4_5_27070lvha78c4.R.inc(2913);return (short[]) removeAll((Object) array, indices);
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Removes occurrences of specified elements, in specified quantities,
     * from the specified array. All subsequent elements are shifted left.
     * For any element-to-be-removed specified in greater quantities than
     * contained in the original array, no change occurs beyond the
     * removal of the existing matching items.
     *
     * <p>This method returns a new array with the same elements of the input
     * array except for the earliest-encountered occurrences of the specified
     * elements. The component type of the returned array is always the same
     * as that of the input array.
     *
     * <pre>
     * ArrayUtils.removeElements(null, 1, 2)      = null
     * ArrayUtils.removeElements([], 1, 2)        = []
     * ArrayUtils.removeElements([1], 2, 3)       = [1]
     * ArrayUtils.removeElements([1, 3], 1, 2)    = [3]
     * ArrayUtils.removeElements([1, 3, 1], 1)    = [3, 1]
     * ArrayUtils.removeElements([1, 3, 1], 1, 1) = [3]
     * </pre>
     *
     * @param array  the array to remove the element from, may be {@code null}
     * @param values the elements to be removed
     * @return A new array containing the existing elements except the
     *         earliest-encountered occurrences of the specified elements.
     * @since 3.0.1
     */
    public static short[] removeElements(final short[] array, final short... values) {try{__CLR4_5_27070lvha78c4.R.inc(2914);
        __CLR4_5_27070lvha78c4.R.inc(2915);if ((((isEmpty(array) || isEmpty(values))&&(__CLR4_5_27070lvha78c4.R.iget(2916)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(2917)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(2918);return clone(array);
        }
        }__CLR4_5_27070lvha78c4.R.inc(2919);final HashMap<Short, MutableInt> occurrences = new HashMap<>(values.length);
        __CLR4_5_27070lvha78c4.R.inc(2920);for (final short v : values) {{
            __CLR4_5_27070lvha78c4.R.inc(2921);final Short boxed = Short.valueOf(v);
            __CLR4_5_27070lvha78c4.R.inc(2922);final MutableInt count = occurrences.get(boxed);
            __CLR4_5_27070lvha78c4.R.inc(2923);if ((((count == null)&&(__CLR4_5_27070lvha78c4.R.iget(2924)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(2925)==0&false))) {{
                __CLR4_5_27070lvha78c4.R.inc(2926);occurrences.put(boxed, new MutableInt(1));
            } }else {{
                __CLR4_5_27070lvha78c4.R.inc(2927);count.increment();
            }
        }}
        }__CLR4_5_27070lvha78c4.R.inc(2928);final BitSet toRemove = new BitSet();
        __CLR4_5_27070lvha78c4.R.inc(2929);for (int i = 0; (((i < array.length)&&(__CLR4_5_27070lvha78c4.R.iget(2930)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(2931)==0&false)); i++) {{
            __CLR4_5_27070lvha78c4.R.inc(2932);final short key = array[i];
            __CLR4_5_27070lvha78c4.R.inc(2933);final MutableInt count = occurrences.get(key);
            __CLR4_5_27070lvha78c4.R.inc(2934);if ((((count != null)&&(__CLR4_5_27070lvha78c4.R.iget(2935)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(2936)==0&false))) {{
                __CLR4_5_27070lvha78c4.R.inc(2937);if ((((count.decrementAndGet() == 0)&&(__CLR4_5_27070lvha78c4.R.iget(2938)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(2939)==0&false))) {{
                    __CLR4_5_27070lvha78c4.R.inc(2940);occurrences.remove(key);
                }
                }__CLR4_5_27070lvha78c4.R.inc(2941);toRemove.set(i);
            }
        }}
        }__CLR4_5_27070lvha78c4.R.inc(2942);return (short[]) removeAll(array, toRemove);
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Removes the elements at the specified positions from the specified array.
     * All remaining elements are shifted to the left.
     *
     * <p>This method returns a new array with the same elements of the input
     * array except those at the specified positions. The component
     * type of the returned array is always the same as that of the input
     * array.
     *
     * <p>If the input array is {@code null}, an IndexOutOfBoundsException
     * will be thrown, because in that case no valid index can be specified.
     *
     * <pre>
     * ArrayUtils.removeAll([1], 0)             = []
     * ArrayUtils.removeAll([2, 6], 0)          = [6]
     * ArrayUtils.removeAll([2, 6], 0, 1)       = []
     * ArrayUtils.removeAll([2, 6, 3], 1, 2)    = [2]
     * ArrayUtils.removeAll([2, 6, 3], 0, 2)    = [6]
     * ArrayUtils.removeAll([2, 6, 3], 0, 1, 2) = []
     * </pre>
     *
     * @param array   the array to remove the element from, may not be {@code null}
     * @param indices the positions of the elements to be removed
     * @return A new array containing the existing elements except those
     *         at the specified positions.
     * @throws IndexOutOfBoundsException if any index is out of range
     * (index &lt; 0 || index &gt;= array.length), or if the array is {@code null}.
     * @since 3.0.1
     */
    public static int[] removeAll(final int[] array, final int... indices) {try{__CLR4_5_27070lvha78c4.R.inc(2943);
        __CLR4_5_27070lvha78c4.R.inc(2944);return (int[]) removeAll((Object) array, indices);
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Removes occurrences of specified elements, in specified quantities,
     * from the specified array. All subsequent elements are shifted left.
     * For any element-to-be-removed specified in greater quantities than
     * contained in the original array, no change occurs beyond the
     * removal of the existing matching items.
     *
     * <p>This method returns a new array with the same elements of the input
     * array except for the earliest-encountered occurrences of the specified
     * elements. The component type of the returned array is always the same
     * as that of the input array.
     *
     * <pre>
     * ArrayUtils.removeElements(null, 1, 2)      = null
     * ArrayUtils.removeElements([], 1, 2)        = []
     * ArrayUtils.removeElements([1], 2, 3)       = [1]
     * ArrayUtils.removeElements([1, 3], 1, 2)    = [3]
     * ArrayUtils.removeElements([1, 3, 1], 1)    = [3, 1]
     * ArrayUtils.removeElements([1, 3, 1], 1, 1) = [3]
     * </pre>
     *
     * @param array  the array to remove the element from, may be {@code null}
     * @param values the elements to be removed
     * @return A new array containing the existing elements except the
     *         earliest-encountered occurrences of the specified elements.
     * @since 3.0.1
     */
    public static int[] removeElements(final int[] array, final int... values) {try{__CLR4_5_27070lvha78c4.R.inc(2945);
        __CLR4_5_27070lvha78c4.R.inc(2946);if ((((isEmpty(array) || isEmpty(values))&&(__CLR4_5_27070lvha78c4.R.iget(2947)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(2948)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(2949);return clone(array);
        }
        }__CLR4_5_27070lvha78c4.R.inc(2950);final HashMap<Integer, MutableInt> occurrences = new HashMap<>(values.length);
        __CLR4_5_27070lvha78c4.R.inc(2951);for (final int v : values) {{
            __CLR4_5_27070lvha78c4.R.inc(2952);final Integer boxed = Integer.valueOf(v);
            __CLR4_5_27070lvha78c4.R.inc(2953);final MutableInt count = occurrences.get(boxed);
            __CLR4_5_27070lvha78c4.R.inc(2954);if ((((count == null)&&(__CLR4_5_27070lvha78c4.R.iget(2955)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(2956)==0&false))) {{
                __CLR4_5_27070lvha78c4.R.inc(2957);occurrences.put(boxed, new MutableInt(1));
            } }else {{
                __CLR4_5_27070lvha78c4.R.inc(2958);count.increment();
            }
        }}
        }__CLR4_5_27070lvha78c4.R.inc(2959);final BitSet toRemove = new BitSet();
        __CLR4_5_27070lvha78c4.R.inc(2960);for (int i = 0; (((i < array.length)&&(__CLR4_5_27070lvha78c4.R.iget(2961)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(2962)==0&false)); i++) {{
            __CLR4_5_27070lvha78c4.R.inc(2963);final int key = array[i];
            __CLR4_5_27070lvha78c4.R.inc(2964);final MutableInt count = occurrences.get(key);
            __CLR4_5_27070lvha78c4.R.inc(2965);if ((((count != null)&&(__CLR4_5_27070lvha78c4.R.iget(2966)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(2967)==0&false))) {{
                __CLR4_5_27070lvha78c4.R.inc(2968);if ((((count.decrementAndGet() == 0)&&(__CLR4_5_27070lvha78c4.R.iget(2969)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(2970)==0&false))) {{
                    __CLR4_5_27070lvha78c4.R.inc(2971);occurrences.remove(key);
                }
                }__CLR4_5_27070lvha78c4.R.inc(2972);toRemove.set(i);
            }
        }}
        }__CLR4_5_27070lvha78c4.R.inc(2973);return (int[]) removeAll(array, toRemove);
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Removes the elements at the specified positions from the specified array.
     * All remaining elements are shifted to the left.
     *
     * <p>This method returns a new array with the same elements of the input
     * array except those at the specified positions. The component
     * type of the returned array is always the same as that of the input
     * array.
     *
     * <p>If the input array is {@code null}, an IndexOutOfBoundsException
     * will be thrown, because in that case no valid index can be specified.
     *
     * <pre>
     * ArrayUtils.removeAll([1], 0)             = []
     * ArrayUtils.removeAll([2, 6], 0)          = [6]
     * ArrayUtils.removeAll([2, 6], 0, 1)       = []
     * ArrayUtils.removeAll([2, 6, 3], 1, 2)    = [2]
     * ArrayUtils.removeAll([2, 6, 3], 0, 2)    = [6]
     * ArrayUtils.removeAll([2, 6, 3], 0, 1, 2) = []
     * </pre>
     *
     * @param array   the array to remove the element from, may not be {@code null}
     * @param indices the positions of the elements to be removed
     * @return A new array containing the existing elements except those
     *         at the specified positions.
     * @throws IndexOutOfBoundsException if any index is out of range
     * (index &lt; 0 || index &gt;= array.length), or if the array is {@code null}.
     * @since 3.0.1
     */
    public static char[] removeAll(final char[] array, final int... indices) {try{__CLR4_5_27070lvha78c4.R.inc(2974);
        __CLR4_5_27070lvha78c4.R.inc(2975);return (char[]) removeAll((Object) array, indices);
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Removes occurrences of specified elements, in specified quantities,
     * from the specified array. All subsequent elements are shifted left.
     * For any element-to-be-removed specified in greater quantities than
     * contained in the original array, no change occurs beyond the
     * removal of the existing matching items.
     *
     * <p>This method returns a new array with the same elements of the input
     * array except for the earliest-encountered occurrences of the specified
     * elements. The component type of the returned array is always the same
     * as that of the input array.
     *
     * <pre>
     * ArrayUtils.removeElements(null, 1, 2)      = null
     * ArrayUtils.removeElements([], 1, 2)        = []
     * ArrayUtils.removeElements([1], 2, 3)       = [1]
     * ArrayUtils.removeElements([1, 3], 1, 2)    = [3]
     * ArrayUtils.removeElements([1, 3, 1], 1)    = [3, 1]
     * ArrayUtils.removeElements([1, 3, 1], 1, 1) = [3]
     * </pre>
     *
     * @param array  the array to remove the element from, may be {@code null}
     * @param values the elements to be removed
     * @return A new array containing the existing elements except the
     *         earliest-encountered occurrences of the specified elements.
     * @since 3.0.1
     */
    public static char[] removeElements(final char[] array, final char... values) {try{__CLR4_5_27070lvha78c4.R.inc(2976);
        __CLR4_5_27070lvha78c4.R.inc(2977);if ((((isEmpty(array) || isEmpty(values))&&(__CLR4_5_27070lvha78c4.R.iget(2978)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(2979)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(2980);return clone(array);
        }
        }__CLR4_5_27070lvha78c4.R.inc(2981);final HashMap<Character, MutableInt> occurrences = new HashMap<>(values.length);
        __CLR4_5_27070lvha78c4.R.inc(2982);for (final char v : values) {{
            __CLR4_5_27070lvha78c4.R.inc(2983);final Character boxed = Character.valueOf(v);
            __CLR4_5_27070lvha78c4.R.inc(2984);final MutableInt count = occurrences.get(boxed);
            __CLR4_5_27070lvha78c4.R.inc(2985);if ((((count == null)&&(__CLR4_5_27070lvha78c4.R.iget(2986)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(2987)==0&false))) {{
                __CLR4_5_27070lvha78c4.R.inc(2988);occurrences.put(boxed, new MutableInt(1));
            } }else {{
                __CLR4_5_27070lvha78c4.R.inc(2989);count.increment();
            }
        }}
        }__CLR4_5_27070lvha78c4.R.inc(2990);final BitSet toRemove = new BitSet();
        __CLR4_5_27070lvha78c4.R.inc(2991);for (int i = 0; (((i < array.length)&&(__CLR4_5_27070lvha78c4.R.iget(2992)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(2993)==0&false)); i++) {{
            __CLR4_5_27070lvha78c4.R.inc(2994);final char key = array[i];
            __CLR4_5_27070lvha78c4.R.inc(2995);final MutableInt count = occurrences.get(key);
            __CLR4_5_27070lvha78c4.R.inc(2996);if ((((count != null)&&(__CLR4_5_27070lvha78c4.R.iget(2997)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(2998)==0&false))) {{
                __CLR4_5_27070lvha78c4.R.inc(2999);if ((((count.decrementAndGet() == 0)&&(__CLR4_5_27070lvha78c4.R.iget(3000)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(3001)==0&false))) {{
                    __CLR4_5_27070lvha78c4.R.inc(3002);occurrences.remove(key);
                }
                }__CLR4_5_27070lvha78c4.R.inc(3003);toRemove.set(i);
            }
        }}
        }__CLR4_5_27070lvha78c4.R.inc(3004);return (char[]) removeAll(array, toRemove);
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Removes the elements at the specified positions from the specified array.
     * All remaining elements are shifted to the left.
     *
     * <p>This method returns a new array with the same elements of the input
     * array except those at the specified positions. The component
     * type of the returned array is always the same as that of the input
     * array.
     *
     * <p>If the input array is {@code null}, an IndexOutOfBoundsException
     * will be thrown, because in that case no valid index can be specified.
     *
     * <pre>
     * ArrayUtils.removeAll([1], 0)             = []
     * ArrayUtils.removeAll([2, 6], 0)          = [6]
     * ArrayUtils.removeAll([2, 6], 0, 1)       = []
     * ArrayUtils.removeAll([2, 6, 3], 1, 2)    = [2]
     * ArrayUtils.removeAll([2, 6, 3], 0, 2)    = [6]
     * ArrayUtils.removeAll([2, 6, 3], 0, 1, 2) = []
     * </pre>
     *
     * @param array   the array to remove the element from, may not be {@code null}
     * @param indices the positions of the elements to be removed
     * @return A new array containing the existing elements except those
     *         at the specified positions.
     * @throws IndexOutOfBoundsException if any index is out of range
     * (index &lt; 0 || index &gt;= array.length), or if the array is {@code null}.
     * @since 3.0.1
     */
    public static long[] removeAll(final long[] array, final int... indices) {try{__CLR4_5_27070lvha78c4.R.inc(3005);
        __CLR4_5_27070lvha78c4.R.inc(3006);return (long[]) removeAll((Object) array, indices);
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Removes occurrences of specified elements, in specified quantities,
     * from the specified array. All subsequent elements are shifted left.
     * For any element-to-be-removed specified in greater quantities than
     * contained in the original array, no change occurs beyond the
     * removal of the existing matching items.
     *
     * <p>This method returns a new array with the same elements of the input
     * array except for the earliest-encountered occurrences of the specified
     * elements. The component type of the returned array is always the same
     * as that of the input array.
     *
     * <pre>
     * ArrayUtils.removeElements(null, 1, 2)      = null
     * ArrayUtils.removeElements([], 1, 2)        = []
     * ArrayUtils.removeElements([1], 2, 3)       = [1]
     * ArrayUtils.removeElements([1, 3], 1, 2)    = [3]
     * ArrayUtils.removeElements([1, 3, 1], 1)    = [3, 1]
     * ArrayUtils.removeElements([1, 3, 1], 1, 1) = [3]
     * </pre>
     *
     * @param array  the array to remove the element from, may be {@code null}
     * @param values the elements to be removed
     * @return A new array containing the existing elements except the
     *         earliest-encountered occurrences of the specified elements.
     * @since 3.0.1
     */
    public static long[] removeElements(final long[] array, final long... values) {try{__CLR4_5_27070lvha78c4.R.inc(3007);
        __CLR4_5_27070lvha78c4.R.inc(3008);if ((((isEmpty(array) || isEmpty(values))&&(__CLR4_5_27070lvha78c4.R.iget(3009)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(3010)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(3011);return clone(array);
        }
        }__CLR4_5_27070lvha78c4.R.inc(3012);final HashMap<Long, MutableInt> occurrences = new HashMap<>(values.length);
        __CLR4_5_27070lvha78c4.R.inc(3013);for (final long v : values) {{
            __CLR4_5_27070lvha78c4.R.inc(3014);final Long boxed = Long.valueOf(v);
            __CLR4_5_27070lvha78c4.R.inc(3015);final MutableInt count = occurrences.get(boxed);
            __CLR4_5_27070lvha78c4.R.inc(3016);if ((((count == null)&&(__CLR4_5_27070lvha78c4.R.iget(3017)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(3018)==0&false))) {{
                __CLR4_5_27070lvha78c4.R.inc(3019);occurrences.put(boxed, new MutableInt(1));
            } }else {{
                __CLR4_5_27070lvha78c4.R.inc(3020);count.increment();
            }
        }}
        }__CLR4_5_27070lvha78c4.R.inc(3021);final BitSet toRemove = new BitSet();
        __CLR4_5_27070lvha78c4.R.inc(3022);for (int i = 0; (((i < array.length)&&(__CLR4_5_27070lvha78c4.R.iget(3023)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(3024)==0&false)); i++) {{
            __CLR4_5_27070lvha78c4.R.inc(3025);final long key = array[i];
            __CLR4_5_27070lvha78c4.R.inc(3026);final MutableInt count = occurrences.get(key);
            __CLR4_5_27070lvha78c4.R.inc(3027);if ((((count != null)&&(__CLR4_5_27070lvha78c4.R.iget(3028)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(3029)==0&false))) {{
                __CLR4_5_27070lvha78c4.R.inc(3030);if ((((count.decrementAndGet() == 0)&&(__CLR4_5_27070lvha78c4.R.iget(3031)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(3032)==0&false))) {{
                    __CLR4_5_27070lvha78c4.R.inc(3033);occurrences.remove(key);
                }
                }__CLR4_5_27070lvha78c4.R.inc(3034);toRemove.set(i);
            }
        }}
        }__CLR4_5_27070lvha78c4.R.inc(3035);return (long[]) removeAll(array, toRemove);
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Removes the elements at the specified positions from the specified array.
     * All remaining elements are shifted to the left.
     *
     * <p>This method returns a new array with the same elements of the input
     * array except those at the specified positions. The component
     * type of the returned array is always the same as that of the input
     * array.
     *
     * <p>If the input array is {@code null}, an IndexOutOfBoundsException
     * will be thrown, because in that case no valid index can be specified.
     *
     * <pre>
     * ArrayUtils.removeAll([1], 0)             = []
     * ArrayUtils.removeAll([2, 6], 0)          = [6]
     * ArrayUtils.removeAll([2, 6], 0, 1)       = []
     * ArrayUtils.removeAll([2, 6, 3], 1, 2)    = [2]
     * ArrayUtils.removeAll([2, 6, 3], 0, 2)    = [6]
     * ArrayUtils.removeAll([2, 6, 3], 0, 1, 2) = []
     * </pre>
     *
     * @param array   the array to remove the element from, may not be {@code null}
     * @param indices the positions of the elements to be removed
     * @return A new array containing the existing elements except those
     *         at the specified positions.
     * @throws IndexOutOfBoundsException if any index is out of range
     * (index &lt; 0 || index &gt;= array.length), or if the array is {@code null}.
     * @since 3.0.1
     */
    public static float[] removeAll(final float[] array, final int... indices) {try{__CLR4_5_27070lvha78c4.R.inc(3036);
        __CLR4_5_27070lvha78c4.R.inc(3037);return (float[]) removeAll((Object) array, indices);
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Removes occurrences of specified elements, in specified quantities,
     * from the specified array. All subsequent elements are shifted left.
     * For any element-to-be-removed specified in greater quantities than
     * contained in the original array, no change occurs beyond the
     * removal of the existing matching items.
     *
     * <p>This method returns a new array with the same elements of the input
     * array except for the earliest-encountered occurrences of the specified
     * elements. The component type of the returned array is always the same
     * as that of the input array.
     *
     * <pre>
     * ArrayUtils.removeElements(null, 1, 2)      = null
     * ArrayUtils.removeElements([], 1, 2)        = []
     * ArrayUtils.removeElements([1], 2, 3)       = [1]
     * ArrayUtils.removeElements([1, 3], 1, 2)    = [3]
     * ArrayUtils.removeElements([1, 3, 1], 1)    = [3, 1]
     * ArrayUtils.removeElements([1, 3, 1], 1, 1) = [3]
     * </pre>
     *
     * @param array  the array to remove the element from, may be {@code null}
     * @param values the elements to be removed
     * @return A new array containing the existing elements except the
     *         earliest-encountered occurrences of the specified elements.
     * @since 3.0.1
     */
    public static float[] removeElements(final float[] array, final float... values) {try{__CLR4_5_27070lvha78c4.R.inc(3038);
        __CLR4_5_27070lvha78c4.R.inc(3039);if ((((isEmpty(array) || isEmpty(values))&&(__CLR4_5_27070lvha78c4.R.iget(3040)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(3041)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(3042);return clone(array);
        }
        }__CLR4_5_27070lvha78c4.R.inc(3043);final HashMap<Float, MutableInt> occurrences = new HashMap<>(values.length);
        __CLR4_5_27070lvha78c4.R.inc(3044);for (final float v : values) {{
            __CLR4_5_27070lvha78c4.R.inc(3045);final Float boxed = Float.valueOf(v);
            __CLR4_5_27070lvha78c4.R.inc(3046);final MutableInt count = occurrences.get(boxed);
            __CLR4_5_27070lvha78c4.R.inc(3047);if ((((count == null)&&(__CLR4_5_27070lvha78c4.R.iget(3048)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(3049)==0&false))) {{
                __CLR4_5_27070lvha78c4.R.inc(3050);occurrences.put(boxed, new MutableInt(1));
            } }else {{
                __CLR4_5_27070lvha78c4.R.inc(3051);count.increment();
            }
        }}
        }__CLR4_5_27070lvha78c4.R.inc(3052);final BitSet toRemove = new BitSet();
        __CLR4_5_27070lvha78c4.R.inc(3053);for (int i = 0; (((i < array.length)&&(__CLR4_5_27070lvha78c4.R.iget(3054)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(3055)==0&false)); i++) {{
            __CLR4_5_27070lvha78c4.R.inc(3056);final float key = array[i];
            __CLR4_5_27070lvha78c4.R.inc(3057);final MutableInt count = occurrences.get(key);
            __CLR4_5_27070lvha78c4.R.inc(3058);if ((((count != null)&&(__CLR4_5_27070lvha78c4.R.iget(3059)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(3060)==0&false))) {{
                __CLR4_5_27070lvha78c4.R.inc(3061);if ((((count.decrementAndGet() == 0)&&(__CLR4_5_27070lvha78c4.R.iget(3062)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(3063)==0&false))) {{
                    __CLR4_5_27070lvha78c4.R.inc(3064);occurrences.remove(key);
                }
                }__CLR4_5_27070lvha78c4.R.inc(3065);toRemove.set(i);
            }
        }}
        }__CLR4_5_27070lvha78c4.R.inc(3066);return (float[]) removeAll(array, toRemove);
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Removes the elements at the specified positions from the specified array.
     * All remaining elements are shifted to the left.
     *
     * <p>This method returns a new array with the same elements of the input
     * array except those at the specified positions. The component
     * type of the returned array is always the same as that of the input
     * array.
     *
     * <p>If the input array is {@code null}, an IndexOutOfBoundsException
     * will be thrown, because in that case no valid index can be specified.
     *
     * <pre>
     * ArrayUtils.removeAll([1], 0)             = []
     * ArrayUtils.removeAll([2, 6], 0)          = [6]
     * ArrayUtils.removeAll([2, 6], 0, 1)       = []
     * ArrayUtils.removeAll([2, 6, 3], 1, 2)    = [2]
     * ArrayUtils.removeAll([2, 6, 3], 0, 2)    = [6]
     * ArrayUtils.removeAll([2, 6, 3], 0, 1, 2) = []
     * </pre>
     *
     * @param array   the array to remove the element from, may not be {@code null}
     * @param indices the positions of the elements to be removed
     * @return A new array containing the existing elements except those
     *         at the specified positions.
     * @throws IndexOutOfBoundsException if any index is out of range
     * (index &lt; 0 || index &gt;= array.length), or if the array is {@code null}.
     * @since 3.0.1
     */
    public static double[] removeAll(final double[] array, final int... indices) {try{__CLR4_5_27070lvha78c4.R.inc(3067);
        __CLR4_5_27070lvha78c4.R.inc(3068);return (double[]) removeAll((Object) array, indices);
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Removes occurrences of specified elements, in specified quantities,
     * from the specified array. All subsequent elements are shifted left.
     * For any element-to-be-removed specified in greater quantities than
     * contained in the original array, no change occurs beyond the
     * removal of the existing matching items.
     *
     * <p>This method returns a new array with the same elements of the input
     * array except for the earliest-encountered occurrences of the specified
     * elements. The component type of the returned array is always the same
     * as that of the input array.
     *
     * <pre>
     * ArrayUtils.removeElements(null, 1, 2)      = null
     * ArrayUtils.removeElements([], 1, 2)        = []
     * ArrayUtils.removeElements([1], 2, 3)       = [1]
     * ArrayUtils.removeElements([1, 3], 1, 2)    = [3]
     * ArrayUtils.removeElements([1, 3, 1], 1)    = [3, 1]
     * ArrayUtils.removeElements([1, 3, 1], 1, 1) = [3]
     * </pre>
     *
     * @param array  the array to remove the element from, may be {@code null}
     * @param values the elements to be removed
     * @return A new array containing the existing elements except the
     *         earliest-encountered occurrences of the specified elements.
     * @since 3.0.1
     */
    public static double[] removeElements(final double[] array, final double... values) {try{__CLR4_5_27070lvha78c4.R.inc(3069);
        __CLR4_5_27070lvha78c4.R.inc(3070);if ((((isEmpty(array) || isEmpty(values))&&(__CLR4_5_27070lvha78c4.R.iget(3071)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(3072)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(3073);return clone(array);
        }
        }__CLR4_5_27070lvha78c4.R.inc(3074);final HashMap<Double, MutableInt> occurrences = new HashMap<>(values.length);
        __CLR4_5_27070lvha78c4.R.inc(3075);for (final double v : values) {{
            __CLR4_5_27070lvha78c4.R.inc(3076);final Double boxed = Double.valueOf(v);
            __CLR4_5_27070lvha78c4.R.inc(3077);final MutableInt count = occurrences.get(boxed);
            __CLR4_5_27070lvha78c4.R.inc(3078);if ((((count == null)&&(__CLR4_5_27070lvha78c4.R.iget(3079)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(3080)==0&false))) {{
                __CLR4_5_27070lvha78c4.R.inc(3081);occurrences.put(boxed, new MutableInt(1));
            } }else {{
                __CLR4_5_27070lvha78c4.R.inc(3082);count.increment();
            }
        }}
        }__CLR4_5_27070lvha78c4.R.inc(3083);final BitSet toRemove = new BitSet();
        __CLR4_5_27070lvha78c4.R.inc(3084);for (int i = 0; (((i < array.length)&&(__CLR4_5_27070lvha78c4.R.iget(3085)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(3086)==0&false)); i++) {{
            __CLR4_5_27070lvha78c4.R.inc(3087);final double key = array[i];
            __CLR4_5_27070lvha78c4.R.inc(3088);final MutableInt count = occurrences.get(key);
            __CLR4_5_27070lvha78c4.R.inc(3089);if ((((count != null)&&(__CLR4_5_27070lvha78c4.R.iget(3090)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(3091)==0&false))) {{
                __CLR4_5_27070lvha78c4.R.inc(3092);if ((((count.decrementAndGet() == 0)&&(__CLR4_5_27070lvha78c4.R.iget(3093)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(3094)==0&false))) {{
                    __CLR4_5_27070lvha78c4.R.inc(3095);occurrences.remove(key);
                }
                }__CLR4_5_27070lvha78c4.R.inc(3096);toRemove.set(i);
            }
        }}
        }__CLR4_5_27070lvha78c4.R.inc(3097);return (double[]) removeAll(array, toRemove);
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Removes the elements at the specified positions from the specified array.
     * All remaining elements are shifted to the left.
     *
     * <p>This method returns a new array with the same elements of the input
     * array except those at the specified positions. The component
     * type of the returned array is always the same as that of the input
     * array.
     *
     * <p>If the input array is {@code null}, an IndexOutOfBoundsException
     * will be thrown, because in that case no valid index can be specified.
     *
     * <pre>
     * ArrayUtils.removeAll([true, false, true], 0, 2) = [false]
     * ArrayUtils.removeAll([true, false, true], 1, 2) = [true]
     * </pre>
     *
     * @param array   the array to remove the element from, may not be {@code null}
     * @param indices the positions of the elements to be removed
     * @return A new array containing the existing elements except those
     *         at the specified positions.
     * @throws IndexOutOfBoundsException if any index is out of range
     * (index &lt; 0 || index &gt;= array.length), or if the array is {@code null}.
     * @since 3.0.1
     */
    public static boolean[] removeAll(final boolean[] array, final int... indices) {try{__CLR4_5_27070lvha78c4.R.inc(3098);
        __CLR4_5_27070lvha78c4.R.inc(3099);return (boolean[]) removeAll((Object) array, indices);
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Removes occurrences of specified elements, in specified quantities,
     * from the specified array. All subsequent elements are shifted left.
     * For any element-to-be-removed specified in greater quantities than
     * contained in the original array, no change occurs beyond the
     * removal of the existing matching items.
     *
     * <p>This method returns a new array with the same elements of the input
     * array except for the earliest-encountered occurrences of the specified
     * elements. The component type of the returned array is always the same
     * as that of the input array.
     *
     * <pre>
     * ArrayUtils.removeElements(null, true, false)               = null
     * ArrayUtils.removeElements([], true, false)                 = []
     * ArrayUtils.removeElements([true], false, false)            = [true]
     * ArrayUtils.removeElements([true, false], true, true)       = [false]
     * ArrayUtils.removeElements([true, false, true], true)       = [false, true]
     * ArrayUtils.removeElements([true, false, true], true, true) = [false]
     * </pre>
     *
     * @param array  the array to remove the element from, may be {@code null}
     * @param values the elements to be removed
     * @return A new array containing the existing elements except the
     *         earliest-encountered occurrences of the specified elements.
     * @since 3.0.1
     */
    public static boolean[] removeElements(final boolean[] array, final boolean... values) {try{__CLR4_5_27070lvha78c4.R.inc(3100);
        __CLR4_5_27070lvha78c4.R.inc(3101);if ((((isEmpty(array) || isEmpty(values))&&(__CLR4_5_27070lvha78c4.R.iget(3102)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(3103)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(3104);return clone(array);
        }
        }__CLR4_5_27070lvha78c4.R.inc(3105);final HashMap<Boolean, MutableInt> occurrences = new HashMap<>(2); // only two possible values here
        __CLR4_5_27070lvha78c4.R.inc(3106);for (final boolean v : values) {{
            __CLR4_5_27070lvha78c4.R.inc(3107);final Boolean boxed = Boolean.valueOf(v);
            __CLR4_5_27070lvha78c4.R.inc(3108);final MutableInt count = occurrences.get(boxed);
            __CLR4_5_27070lvha78c4.R.inc(3109);if ((((count == null)&&(__CLR4_5_27070lvha78c4.R.iget(3110)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(3111)==0&false))) {{
                __CLR4_5_27070lvha78c4.R.inc(3112);occurrences.put(boxed, new MutableInt(1));
            } }else {{
                __CLR4_5_27070lvha78c4.R.inc(3113);count.increment();
            }
        }}
        }__CLR4_5_27070lvha78c4.R.inc(3114);final BitSet toRemove = new BitSet();
        __CLR4_5_27070lvha78c4.R.inc(3115);for (int i = 0; (((i < array.length)&&(__CLR4_5_27070lvha78c4.R.iget(3116)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(3117)==0&false)); i++) {{
            __CLR4_5_27070lvha78c4.R.inc(3118);final boolean key = array[i];
            __CLR4_5_27070lvha78c4.R.inc(3119);final MutableInt count = occurrences.get(key);
            __CLR4_5_27070lvha78c4.R.inc(3120);if ((((count != null)&&(__CLR4_5_27070lvha78c4.R.iget(3121)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(3122)==0&false))) {{
                __CLR4_5_27070lvha78c4.R.inc(3123);if ((((count.decrementAndGet() == 0)&&(__CLR4_5_27070lvha78c4.R.iget(3124)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(3125)==0&false))) {{
                    __CLR4_5_27070lvha78c4.R.inc(3126);occurrences.remove(key);
                }
                }__CLR4_5_27070lvha78c4.R.inc(3127);toRemove.set(i);
            }
        }}
        }__CLR4_5_27070lvha78c4.R.inc(3128);return (boolean[]) removeAll(array, toRemove);
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * Removes multiple array elements specified by index.
     * @param array source
     * @param indices to remove
     * @return new array of same type minus elements specified by unique values of {@code indices}
     * @since 3.0.1
     */
    // package protected for access by unit tests
    static Object removeAll(final Object array, final int... indices) {try{__CLR4_5_27070lvha78c4.R.inc(3129);
        __CLR4_5_27070lvha78c4.R.inc(3130);final int length = getLength(array);
        __CLR4_5_27070lvha78c4.R.inc(3131);int diff = 0; // number of distinct indexes, i.e. number of entries that will be removed
        __CLR4_5_27070lvha78c4.R.inc(3132);final int[] clonedIndices = clone(indices);
        __CLR4_5_27070lvha78c4.R.inc(3133);Arrays.sort(clonedIndices);

        // identify length of result array
        __CLR4_5_27070lvha78c4.R.inc(3134);if ((((isNotEmpty(clonedIndices))&&(__CLR4_5_27070lvha78c4.R.iget(3135)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(3136)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(3137);int i = clonedIndices.length;
            __CLR4_5_27070lvha78c4.R.inc(3138);int prevIndex = length;
            __CLR4_5_27070lvha78c4.R.inc(3139);while ((((--i >= 0)&&(__CLR4_5_27070lvha78c4.R.iget(3140)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(3141)==0&false))) {{
                __CLR4_5_27070lvha78c4.R.inc(3142);final int index = clonedIndices[i];
                __CLR4_5_27070lvha78c4.R.inc(3143);if ((((index < 0 || index >= length)&&(__CLR4_5_27070lvha78c4.R.iget(3144)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(3145)==0&false))) {{
                    __CLR4_5_27070lvha78c4.R.inc(3146);throw new IndexOutOfBoundsException("Index: " + index + ", Length: " + length);
                }
                }__CLR4_5_27070lvha78c4.R.inc(3147);if ((((index >= prevIndex)&&(__CLR4_5_27070lvha78c4.R.iget(3148)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(3149)==0&false))) {{
                    __CLR4_5_27070lvha78c4.R.inc(3150);continue;
                }
                }__CLR4_5_27070lvha78c4.R.inc(3151);diff++;
                __CLR4_5_27070lvha78c4.R.inc(3152);prevIndex = index;
            }
        }}

        // create result array
        }__CLR4_5_27070lvha78c4.R.inc(3153);final Object result = Array.newInstance(array.getClass().getComponentType(), length - diff);
        __CLR4_5_27070lvha78c4.R.inc(3154);if ((((diff < length)&&(__CLR4_5_27070lvha78c4.R.iget(3155)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(3156)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(3157);int end = length; // index just after last copy
            __CLR4_5_27070lvha78c4.R.inc(3158);int dest = length - diff; // number of entries so far not copied
            __CLR4_5_27070lvha78c4.R.inc(3159);for (int i = clonedIndices.length - 1; (((i >= 0)&&(__CLR4_5_27070lvha78c4.R.iget(3160)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(3161)==0&false)); i--) {{
                __CLR4_5_27070lvha78c4.R.inc(3162);final int index = clonedIndices[i];
                __CLR4_5_27070lvha78c4.R.inc(3163);if ((((end - index > 1)&&(__CLR4_5_27070lvha78c4.R.iget(3164)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(3165)==0&false))) {{ // same as (cp > 0)
                    __CLR4_5_27070lvha78c4.R.inc(3166);final int cp = end - index - 1;
                    __CLR4_5_27070lvha78c4.R.inc(3167);dest -= cp;
                    __CLR4_5_27070lvha78c4.R.inc(3168);System.arraycopy(array, index + 1, result, dest, cp);
                    // Afer this copy, we still have room for dest items.
                }
                }__CLR4_5_27070lvha78c4.R.inc(3169);end = index;
            }
            }__CLR4_5_27070lvha78c4.R.inc(3170);if ((((end > 0)&&(__CLR4_5_27070lvha78c4.R.iget(3171)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(3172)==0&false))) {{
                __CLR4_5_27070lvha78c4.R.inc(3173);System.arraycopy(array, 0, result, 0, end);
            }
        }}
        }__CLR4_5_27070lvha78c4.R.inc(3174);return result;
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * Removes multiple array elements specified by indices.
     * 
     * @param array source
     * @param indices to remove
     * @return new array of same type minus elements specified by the set bits in {@code indices}
     * @since 3.2
     */
    // package protected for access by unit tests
    static Object removeAll(final Object array, final BitSet indices) {try{__CLR4_5_27070lvha78c4.R.inc(3175);
        __CLR4_5_27070lvha78c4.R.inc(3176);final int srcLength = ArrayUtils.getLength(array);
        // No need to check maxIndex here, because method only currently called from removeElements()
        // which guarantee to generate on;y valid bit entries.
//        final int maxIndex = indices.length();
//        if (maxIndex > srcLength) { 
//            throw new IndexOutOfBoundsException("Index: " + (maxIndex-1) + ", Length: " + srcLength);
//        }
        __CLR4_5_27070lvha78c4.R.inc(3177);final int removals = indices.cardinality(); // true bits are items to remove
        __CLR4_5_27070lvha78c4.R.inc(3178);final Object result = Array.newInstance(array.getClass().getComponentType(), srcLength - removals);
        __CLR4_5_27070lvha78c4.R.inc(3179);int srcIndex = 0;
        __CLR4_5_27070lvha78c4.R.inc(3180);int destIndex = 0;
        __CLR4_5_27070lvha78c4.R.inc(3181);int count;
        __CLR4_5_27070lvha78c4.R.inc(3182);int set;
        __CLR4_5_27070lvha78c4.R.inc(3183);while ((set = indices.nextSetBit(srcIndex)) != -1) {{
            __CLR4_5_27070lvha78c4.R.inc(3186);count = set - srcIndex;
            __CLR4_5_27070lvha78c4.R.inc(3187);if ((((count > 0)&&(__CLR4_5_27070lvha78c4.R.iget(3188)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(3189)==0&false))) {{
                __CLR4_5_27070lvha78c4.R.inc(3190);System.arraycopy(array, srcIndex, result, destIndex, count);
                __CLR4_5_27070lvha78c4.R.inc(3191);destIndex += count;
            }
            }__CLR4_5_27070lvha78c4.R.inc(3192);srcIndex = indices.nextClearBit(set);
        }
        }__CLR4_5_27070lvha78c4.R.inc(3193);count = srcLength - srcIndex;
        __CLR4_5_27070lvha78c4.R.inc(3194);if ((((count > 0)&&(__CLR4_5_27070lvha78c4.R.iget(3195)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(3196)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(3197);System.arraycopy(array, srcIndex, result, destIndex, count);            
        }
        }__CLR4_5_27070lvha78c4.R.inc(3198);return result;
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>This method checks whether the provided array is sorted according to the class's 
     * {@code compareTo} method.
     *
     * @param array the array to check
     * @param <T> the datatype of the array to check, it must implement {@code Comparable}
     * @return whether the array is sorted
     * @since 3.4
     */
    public static <T extends Comparable<? super T>> boolean isSorted(final T[] array) {try{__CLR4_5_27070lvha78c4.R.inc(3199);
        __CLR4_5_27070lvha78c4.R.inc(3200);return isSorted(array, new Comparator<T>() {
            @Override
            public int compare(final T o1, final T o2) {try{__CLR4_5_27070lvha78c4.R.inc(3201);
                __CLR4_5_27070lvha78c4.R.inc(3202);return o1.compareTo(o2);
            }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}
        });
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}
   

    /**
     * <p>This method checks whether the provided array is sorted according to the provided {@code Comparator}.
     *
     * @param array the array to check
     * @param comparator the {@code Comparator} to compare over
     * @param <T> the datatype of the array
     * @return whether the array is sorted
     * @since 3.4
     */
    public static <T> boolean isSorted(final T[] array, final Comparator<T> comparator) {try{__CLR4_5_27070lvha78c4.R.inc(3203);
        __CLR4_5_27070lvha78c4.R.inc(3204);if ((((comparator == null)&&(__CLR4_5_27070lvha78c4.R.iget(3205)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(3206)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(3207);throw new IllegalArgumentException("Comparator should not be null.");
        }
        
        }__CLR4_5_27070lvha78c4.R.inc(3208);if ((((array == null || array.length < 2)&&(__CLR4_5_27070lvha78c4.R.iget(3209)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(3210)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(3211);return true;
        }

        }__CLR4_5_27070lvha78c4.R.inc(3212);T previous = array[0];
        __CLR4_5_27070lvha78c4.R.inc(3213);final int n = array.length;
        __CLR4_5_27070lvha78c4.R.inc(3214);for (int i = 1; (((i < n)&&(__CLR4_5_27070lvha78c4.R.iget(3215)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(3216)==0&false)); i++) {{
            __CLR4_5_27070lvha78c4.R.inc(3217);final T current = array[i];
            __CLR4_5_27070lvha78c4.R.inc(3218);if ((((comparator.compare(previous, current) > 0)&&(__CLR4_5_27070lvha78c4.R.iget(3219)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(3220)==0&false))) {{
                __CLR4_5_27070lvha78c4.R.inc(3221);return false;
            }

            }__CLR4_5_27070lvha78c4.R.inc(3222);previous = current;
        }
        }__CLR4_5_27070lvha78c4.R.inc(3223);return true;
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>This method checks whether the provided array is sorted according to natural ordering.
     *
     * @param array the array to check
     * @return whether the array is sorted according to natural ordering
     * @since 3.4
     */
    public static boolean isSorted(final int[] array) {try{__CLR4_5_27070lvha78c4.R.inc(3224);
        __CLR4_5_27070lvha78c4.R.inc(3225);if ((((array == null || array.length < 2)&&(__CLR4_5_27070lvha78c4.R.iget(3226)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(3227)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(3228);return true;
        }

        }__CLR4_5_27070lvha78c4.R.inc(3229);int previous = array[0];
        __CLR4_5_27070lvha78c4.R.inc(3230);final int n = array.length;
        __CLR4_5_27070lvha78c4.R.inc(3231);for (int i = 1; (((i < n)&&(__CLR4_5_27070lvha78c4.R.iget(3232)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(3233)==0&false)); i++) {{
            __CLR4_5_27070lvha78c4.R.inc(3234);final int current = array[i];
            __CLR4_5_27070lvha78c4.R.inc(3235);if ((((NumberUtils.compare(previous, current) > 0)&&(__CLR4_5_27070lvha78c4.R.iget(3236)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(3237)==0&false))) {{
                __CLR4_5_27070lvha78c4.R.inc(3238);return false;
            }

            }__CLR4_5_27070lvha78c4.R.inc(3239);previous = current;
        }
        }__CLR4_5_27070lvha78c4.R.inc(3240);return true;
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>This method checks whether the provided array is sorted according to natural ordering.
     *
     * @param array the array to check
     * @return whether the array is sorted according to natural ordering
     * @since 3.4
     */
    public static boolean isSorted(final long[] array) {try{__CLR4_5_27070lvha78c4.R.inc(3241);
        __CLR4_5_27070lvha78c4.R.inc(3242);if ((((array == null || array.length < 2)&&(__CLR4_5_27070lvha78c4.R.iget(3243)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(3244)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(3245);return true;
        }

        }__CLR4_5_27070lvha78c4.R.inc(3246);long previous = array[0];
        __CLR4_5_27070lvha78c4.R.inc(3247);final int n = array.length;
        __CLR4_5_27070lvha78c4.R.inc(3248);for (int i = 1; (((i < n)&&(__CLR4_5_27070lvha78c4.R.iget(3249)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(3250)==0&false)); i++) {{
            __CLR4_5_27070lvha78c4.R.inc(3251);final long current = array[i];
            __CLR4_5_27070lvha78c4.R.inc(3252);if ((((NumberUtils.compare(previous, current) > 0)&&(__CLR4_5_27070lvha78c4.R.iget(3253)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(3254)==0&false))) {{
                __CLR4_5_27070lvha78c4.R.inc(3255);return false;
            }

            }__CLR4_5_27070lvha78c4.R.inc(3256);previous = current;
        }
        }__CLR4_5_27070lvha78c4.R.inc(3257);return true;
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>This method checks whether the provided array is sorted according to natural ordering.
     *
     * @param array the array to check
     * @return whether the array is sorted according to natural ordering
     * @since 3.4
     */
    public static boolean isSorted(final short[] array) {try{__CLR4_5_27070lvha78c4.R.inc(3258);
        __CLR4_5_27070lvha78c4.R.inc(3259);if ((((array == null || array.length < 2)&&(__CLR4_5_27070lvha78c4.R.iget(3260)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(3261)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(3262);return true;
        }

        }__CLR4_5_27070lvha78c4.R.inc(3263);short previous = array[0];
        __CLR4_5_27070lvha78c4.R.inc(3264);final int n = array.length;
        __CLR4_5_27070lvha78c4.R.inc(3265);for (int i = 1; (((i < n)&&(__CLR4_5_27070lvha78c4.R.iget(3266)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(3267)==0&false)); i++) {{
            __CLR4_5_27070lvha78c4.R.inc(3268);final short current = array[i];
            __CLR4_5_27070lvha78c4.R.inc(3269);if ((((NumberUtils.compare(previous, current) > 0)&&(__CLR4_5_27070lvha78c4.R.iget(3270)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(3271)==0&false))) {{
                __CLR4_5_27070lvha78c4.R.inc(3272);return false;
            }

            }__CLR4_5_27070lvha78c4.R.inc(3273);previous = current;
        }
        }__CLR4_5_27070lvha78c4.R.inc(3274);return true;
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>This method checks whether the provided array is sorted according to natural ordering.
     *
     * @param array the array to check
     * @return whether the array is sorted according to natural ordering
     * @since 3.4
     */
    public static boolean isSorted(final double[] array) {try{__CLR4_5_27070lvha78c4.R.inc(3275);
        __CLR4_5_27070lvha78c4.R.inc(3276);if ((((array == null || array.length < 2)&&(__CLR4_5_27070lvha78c4.R.iget(3277)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(3278)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(3279);return true;
        }

        }__CLR4_5_27070lvha78c4.R.inc(3280);double previous = array[0];
        __CLR4_5_27070lvha78c4.R.inc(3281);final int n = array.length;
        __CLR4_5_27070lvha78c4.R.inc(3282);for (int i = 1; (((i < n)&&(__CLR4_5_27070lvha78c4.R.iget(3283)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(3284)==0&false)); i++) {{
            __CLR4_5_27070lvha78c4.R.inc(3285);final double current = array[i];
            __CLR4_5_27070lvha78c4.R.inc(3286);if ((((Double.compare(previous, current) > 0)&&(__CLR4_5_27070lvha78c4.R.iget(3287)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(3288)==0&false))) {{
                __CLR4_5_27070lvha78c4.R.inc(3289);return false;
            }

            }__CLR4_5_27070lvha78c4.R.inc(3290);previous = current;
        }
        }__CLR4_5_27070lvha78c4.R.inc(3291);return true;
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>This method checks whether the provided array is sorted according to natural ordering.
     *
     * @param array the array to check
     * @return whether the array is sorted according to natural ordering
     * @since 3.4
     */
    public static boolean isSorted(final float[] array) {try{__CLR4_5_27070lvha78c4.R.inc(3292);
        __CLR4_5_27070lvha78c4.R.inc(3293);if ((((array == null || array.length < 2)&&(__CLR4_5_27070lvha78c4.R.iget(3294)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(3295)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(3296);return true;
        }

        }__CLR4_5_27070lvha78c4.R.inc(3297);float previous = array[0];
        __CLR4_5_27070lvha78c4.R.inc(3298);final int n = array.length;
        __CLR4_5_27070lvha78c4.R.inc(3299);for (int i = 1; (((i < n)&&(__CLR4_5_27070lvha78c4.R.iget(3300)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(3301)==0&false)); i++) {{
            __CLR4_5_27070lvha78c4.R.inc(3302);final float current = array[i];
            __CLR4_5_27070lvha78c4.R.inc(3303);if ((((Float.compare(previous, current) > 0)&&(__CLR4_5_27070lvha78c4.R.iget(3304)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(3305)==0&false))) {{
                __CLR4_5_27070lvha78c4.R.inc(3306);return false;
            }

            }__CLR4_5_27070lvha78c4.R.inc(3307);previous = current;
        }
        }__CLR4_5_27070lvha78c4.R.inc(3308);return true;
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>This method checks whether the provided array is sorted according to natural ordering.
     *
     * @param array the array to check
     * @return whether the array is sorted according to natural ordering
     * @since 3.4
     */
    public static boolean isSorted(final byte[] array) {try{__CLR4_5_27070lvha78c4.R.inc(3309);
        __CLR4_5_27070lvha78c4.R.inc(3310);if ((((array == null || array.length < 2)&&(__CLR4_5_27070lvha78c4.R.iget(3311)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(3312)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(3313);return true;
        }

        }__CLR4_5_27070lvha78c4.R.inc(3314);byte previous = array[0];
        __CLR4_5_27070lvha78c4.R.inc(3315);final int n = array.length;
        __CLR4_5_27070lvha78c4.R.inc(3316);for (int i = 1; (((i < n)&&(__CLR4_5_27070lvha78c4.R.iget(3317)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(3318)==0&false)); i++) {{
            __CLR4_5_27070lvha78c4.R.inc(3319);final byte current = array[i];
            __CLR4_5_27070lvha78c4.R.inc(3320);if ((((NumberUtils.compare(previous, current) > 0)&&(__CLR4_5_27070lvha78c4.R.iget(3321)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(3322)==0&false))) {{
                __CLR4_5_27070lvha78c4.R.inc(3323);return false;
            }

            }__CLR4_5_27070lvha78c4.R.inc(3324);previous = current;
        }
        }__CLR4_5_27070lvha78c4.R.inc(3325);return true;
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>This method checks whether the provided array is sorted according to natural ordering.
     *
     * @param array the array to check
     * @return whether the array is sorted according to natural ordering
     * @since 3.4
     */
    public static boolean isSorted(final char[] array) {try{__CLR4_5_27070lvha78c4.R.inc(3326);
        __CLR4_5_27070lvha78c4.R.inc(3327);if ((((array == null || array.length < 2)&&(__CLR4_5_27070lvha78c4.R.iget(3328)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(3329)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(3330);return true;
        }

        }__CLR4_5_27070lvha78c4.R.inc(3331);char previous = array[0];
        __CLR4_5_27070lvha78c4.R.inc(3332);final int n = array.length;
        __CLR4_5_27070lvha78c4.R.inc(3333);for (int i = 1; (((i < n)&&(__CLR4_5_27070lvha78c4.R.iget(3334)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(3335)==0&false)); i++) {{
            __CLR4_5_27070lvha78c4.R.inc(3336);final char current = array[i];
            __CLR4_5_27070lvha78c4.R.inc(3337);if ((((CharUtils.compare(previous, current) > 0)&&(__CLR4_5_27070lvha78c4.R.iget(3338)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(3339)==0&false))) {{
                __CLR4_5_27070lvha78c4.R.inc(3340);return false;
            }

            }__CLR4_5_27070lvha78c4.R.inc(3341);previous = current;
        }
        }__CLR4_5_27070lvha78c4.R.inc(3342);return true;
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>This method checks whether the provided array is sorted according to natural ordering
     * ({@code false} before {@code true}).
     *
     * @param array the array to check
     * @return whether the array is sorted according to natural ordering
     * @since 3.4
     */
    public static boolean isSorted(final boolean[] array) {try{__CLR4_5_27070lvha78c4.R.inc(3343);
        __CLR4_5_27070lvha78c4.R.inc(3344);if ((((array == null || array.length < 2)&&(__CLR4_5_27070lvha78c4.R.iget(3345)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(3346)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(3347);return true;
        }

        }__CLR4_5_27070lvha78c4.R.inc(3348);boolean previous = array[0];
        __CLR4_5_27070lvha78c4.R.inc(3349);final int n = array.length;
        __CLR4_5_27070lvha78c4.R.inc(3350);for (int i = 1; (((i < n)&&(__CLR4_5_27070lvha78c4.R.iget(3351)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(3352)==0&false)); i++) {{
            __CLR4_5_27070lvha78c4.R.inc(3353);final boolean current = array[i];
            __CLR4_5_27070lvha78c4.R.inc(3354);if ((((BooleanUtils.compare(previous, current) > 0)&&(__CLR4_5_27070lvha78c4.R.iget(3355)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(3356)==0&false))) {{
                __CLR4_5_27070lvha78c4.R.inc(3357);return false;
            }

            }__CLR4_5_27070lvha78c4.R.inc(3358);previous = current;
        }
        }__CLR4_5_27070lvha78c4.R.inc(3359);return true;
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * Removes the occurrences of the specified element from the specified boolean array.
     *
     * <p>
     * All subsequent elements are shifted to the left (subtracts one from their indices).
     * If the array doesn't contains such an element, no elements are removed from the array.
     * <code>null</code> will be returned if the input array is <code>null</code>.
     * </p>
     *
     * @param element the element to remove
     * @param array the input array
     *
     * @return A new array containing the existing elements except the occurrences of the specified element.
     * @since 3.5
     */
    public static boolean[] removeAllOccurences(final boolean[] array, final boolean element) {try{__CLR4_5_27070lvha78c4.R.inc(3360);
        __CLR4_5_27070lvha78c4.R.inc(3361);int index = indexOf(array, element);
        __CLR4_5_27070lvha78c4.R.inc(3362);if ((((index == INDEX_NOT_FOUND)&&(__CLR4_5_27070lvha78c4.R.iget(3363)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(3364)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(3365);return clone(array);
        }

        }__CLR4_5_27070lvha78c4.R.inc(3366);final int[] indices = new int[array.length - index];
        __CLR4_5_27070lvha78c4.R.inc(3367);indices[0] = index;
        __CLR4_5_27070lvha78c4.R.inc(3368);int count = 1;

        __CLR4_5_27070lvha78c4.R.inc(3369);while ((index = indexOf(array, element, indices[count - 1] + 1)) != INDEX_NOT_FOUND) {{
            __CLR4_5_27070lvha78c4.R.inc(3372);indices[count++] = index;
        }

        }__CLR4_5_27070lvha78c4.R.inc(3373);return removeAll(array, Arrays.copyOf(indices, count));
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * Removes the occurrences of the specified element from the specified char array.
     *
     * <p>
     * All subsequent elements are shifted to the left (subtracts one from their indices).
     * If the array doesn't contains such an element, no elements are removed from the array.
     * <code>null</code> will be returned if the input array is <code>null</code>.
     * </p>
     *
     * @param element the element to remove
     * @param array the input array
     *
     * @return A new array containing the existing elements except the occurrences of the specified element.
     * @since 3.5
     */
    public static char[] removeAllOccurences(final char[] array, final char element) {try{__CLR4_5_27070lvha78c4.R.inc(3374);
        __CLR4_5_27070lvha78c4.R.inc(3375);int index = indexOf(array, element);
        __CLR4_5_27070lvha78c4.R.inc(3376);if ((((index == INDEX_NOT_FOUND)&&(__CLR4_5_27070lvha78c4.R.iget(3377)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(3378)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(3379);return clone(array);
        }

        }__CLR4_5_27070lvha78c4.R.inc(3380);final int[] indices = new int[array.length - index];
        __CLR4_5_27070lvha78c4.R.inc(3381);indices[0] = index;
        __CLR4_5_27070lvha78c4.R.inc(3382);int count = 1;

        __CLR4_5_27070lvha78c4.R.inc(3383);while ((index = indexOf(array, element, indices[count - 1] + 1)) != INDEX_NOT_FOUND) {{
            __CLR4_5_27070lvha78c4.R.inc(3386);indices[count++] = index;
        }

        }__CLR4_5_27070lvha78c4.R.inc(3387);return removeAll(array, Arrays.copyOf(indices, count));
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * Removes the occurrences of the specified element from the specified byte array.
     *
     * <p>
     * All subsequent elements are shifted to the left (subtracts one from their indices).
     * If the array doesn't contains such an element, no elements are removed from the array.
     * <code>null</code> will be returned if the input array is <code>null</code>.
     * </p>
     *
     * @param element the element to remove
     * @param array the input array
     *
     * @return A new array containing the existing elements except the occurrences of the specified element.
     * @since 3.5
     */
    public static byte[] removeAllOccurences(final byte[] array, final byte element) {try{__CLR4_5_27070lvha78c4.R.inc(3388);
        __CLR4_5_27070lvha78c4.R.inc(3389);int index = indexOf(array, element);
        __CLR4_5_27070lvha78c4.R.inc(3390);if ((((index == INDEX_NOT_FOUND)&&(__CLR4_5_27070lvha78c4.R.iget(3391)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(3392)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(3393);return clone(array);
        }

        }__CLR4_5_27070lvha78c4.R.inc(3394);final int[] indices = new int[array.length - index];
        __CLR4_5_27070lvha78c4.R.inc(3395);indices[0] = index;
        __CLR4_5_27070lvha78c4.R.inc(3396);int count = 1;

        __CLR4_5_27070lvha78c4.R.inc(3397);while ((index = indexOf(array, element, indices[count - 1] + 1)) != INDEX_NOT_FOUND) {{
            __CLR4_5_27070lvha78c4.R.inc(3400);indices[count++] = index;
        }

        }__CLR4_5_27070lvha78c4.R.inc(3401);return removeAll(array, Arrays.copyOf(indices, count));
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * Removes the occurrences of the specified element from the specified short array.
     *
     * <p>
     * All subsequent elements are shifted to the left (subtracts one from their indices).
     * If the array doesn't contains such an element, no elements are removed from the array.
     * <code>null</code> will be returned if the input array is <code>null</code>.
     * </p>
     *
     * @param element the element to remove
     * @param array the input array
     *
     * @return A new array containing the existing elements except the occurrences of the specified element.
     * @since 3.5
     */
    public static short[] removeAllOccurences(final short[] array, final short element) {try{__CLR4_5_27070lvha78c4.R.inc(3402);
        __CLR4_5_27070lvha78c4.R.inc(3403);int index = indexOf(array, element);
        __CLR4_5_27070lvha78c4.R.inc(3404);if ((((index == INDEX_NOT_FOUND)&&(__CLR4_5_27070lvha78c4.R.iget(3405)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(3406)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(3407);return clone(array);
        }

        }__CLR4_5_27070lvha78c4.R.inc(3408);final int[] indices = new int[array.length - index];
        __CLR4_5_27070lvha78c4.R.inc(3409);indices[0] = index;
        __CLR4_5_27070lvha78c4.R.inc(3410);int count = 1;

        __CLR4_5_27070lvha78c4.R.inc(3411);while ((index = indexOf(array, element, indices[count - 1] + 1)) != INDEX_NOT_FOUND) {{
            __CLR4_5_27070lvha78c4.R.inc(3414);indices[count++] = index;
        }

        }__CLR4_5_27070lvha78c4.R.inc(3415);return removeAll(array, Arrays.copyOf(indices, count));
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * Removes the occurrences of the specified element from the specified int array.
     *
     * <p>
     * All subsequent elements are shifted to the left (subtracts one from their indices).
     * If the array doesn't contains such an element, no elements are removed from the array.
     * <code>null</code> will be returned if the input array is <code>null</code>.
     * </p>
     *
     * @param element the element to remove
     * @param array the input array
     *
     * @return A new array containing the existing elements except the occurrences of the specified element.
     * @since 3.5
     */
    public static int[] removeAllOccurences(final int[] array, final int element) {try{__CLR4_5_27070lvha78c4.R.inc(3416);
        __CLR4_5_27070lvha78c4.R.inc(3417);int index = indexOf(array, element);
        __CLR4_5_27070lvha78c4.R.inc(3418);if ((((index == INDEX_NOT_FOUND)&&(__CLR4_5_27070lvha78c4.R.iget(3419)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(3420)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(3421);return clone(array);
        }

        }__CLR4_5_27070lvha78c4.R.inc(3422);final int[] indices = new int[array.length - index];
        __CLR4_5_27070lvha78c4.R.inc(3423);indices[0] = index;
        __CLR4_5_27070lvha78c4.R.inc(3424);int count = 1;

        __CLR4_5_27070lvha78c4.R.inc(3425);while ((index = indexOf(array, element, indices[count - 1] + 1)) != INDEX_NOT_FOUND) {{
            __CLR4_5_27070lvha78c4.R.inc(3428);indices[count++] = index;
        }

        }__CLR4_5_27070lvha78c4.R.inc(3429);return removeAll(array, Arrays.copyOf(indices, count));
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * Removes the occurrences of the specified element from the specified long array.
     *
     * <p>
     * All subsequent elements are shifted to the left (subtracts one from their indices).
     * If the array doesn't contains such an element, no elements are removed from the array.
     * <code>null</code> will be returned if the input array is <code>null</code>.
     * </p>
     *
     * @param element the element to remove
     * @param array the input array
     *
     * @return A new array containing the existing elements except the occurrences of the specified element.
     * @since 3.5
     */
    public static long[] removeAllOccurences(final long[] array, final long element) {try{__CLR4_5_27070lvha78c4.R.inc(3430);
        __CLR4_5_27070lvha78c4.R.inc(3431);int index = indexOf(array, element);
        __CLR4_5_27070lvha78c4.R.inc(3432);if ((((index == INDEX_NOT_FOUND)&&(__CLR4_5_27070lvha78c4.R.iget(3433)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(3434)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(3435);return clone(array);
        }

        }__CLR4_5_27070lvha78c4.R.inc(3436);final int[] indices = new int[array.length - index];
        __CLR4_5_27070lvha78c4.R.inc(3437);indices[0] = index;
        __CLR4_5_27070lvha78c4.R.inc(3438);int count = 1;

        __CLR4_5_27070lvha78c4.R.inc(3439);while ((index = indexOf(array, element, indices[count - 1] + 1)) != INDEX_NOT_FOUND) {{
            __CLR4_5_27070lvha78c4.R.inc(3442);indices[count++] = index;
        }

        }__CLR4_5_27070lvha78c4.R.inc(3443);return removeAll(array, Arrays.copyOf(indices, count));
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * Removes the occurrences of the specified element from the specified float array.
     *
     * <p>
     * All subsequent elements are shifted to the left (subtracts one from their indices).
     * If the array doesn't contains such an element, no elements are removed from the array.
     * <code>null</code> will be returned if the input array is <code>null</code>.
     * </p>
     *
     * @param element the element to remove
     * @param array the input array
     *
     * @return A new array containing the existing elements except the occurrences of the specified element.
     * @since 3.5
     */
    public static float[] removeAllOccurences(final float[] array, final float element) {try{__CLR4_5_27070lvha78c4.R.inc(3444);
        __CLR4_5_27070lvha78c4.R.inc(3445);int index = indexOf(array, element);
        __CLR4_5_27070lvha78c4.R.inc(3446);if ((((index == INDEX_NOT_FOUND)&&(__CLR4_5_27070lvha78c4.R.iget(3447)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(3448)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(3449);return clone(array);
        }

        }__CLR4_5_27070lvha78c4.R.inc(3450);final int[] indices = new int[array.length - index];
        __CLR4_5_27070lvha78c4.R.inc(3451);indices[0] = index;
        __CLR4_5_27070lvha78c4.R.inc(3452);int count = 1;

        __CLR4_5_27070lvha78c4.R.inc(3453);while ((index = indexOf(array, element, indices[count - 1] + 1)) != INDEX_NOT_FOUND) {{
            __CLR4_5_27070lvha78c4.R.inc(3456);indices[count++] = index;
        }

        }__CLR4_5_27070lvha78c4.R.inc(3457);return removeAll(array, Arrays.copyOf(indices, count));
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * Removes the occurrences of the specified element from the specified double array.
     *
     * <p>
     * All subsequent elements are shifted to the left (subtracts one from their indices).
     * If the array doesn't contains such an element, no elements are removed from the array.
     * <code>null</code> will be returned if the input array is <code>null</code>.
     * </p>
     *
     * @param element the element to remove
     * @param array the input array
     *
     * @return A new array containing the existing elements except the occurrences of the specified element.
     * @since 3.5
     */
    public static double[] removeAllOccurences(final double[] array, final double element) {try{__CLR4_5_27070lvha78c4.R.inc(3458);
        __CLR4_5_27070lvha78c4.R.inc(3459);int index = indexOf(array, element);
        __CLR4_5_27070lvha78c4.R.inc(3460);if ((((index == INDEX_NOT_FOUND)&&(__CLR4_5_27070lvha78c4.R.iget(3461)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(3462)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(3463);return clone(array);
        }

        }__CLR4_5_27070lvha78c4.R.inc(3464);final int[] indices = new int[array.length - index];
        __CLR4_5_27070lvha78c4.R.inc(3465);indices[0] = index;
        __CLR4_5_27070lvha78c4.R.inc(3466);int count = 1;

        __CLR4_5_27070lvha78c4.R.inc(3467);while ((index = indexOf(array, element, indices[count - 1] + 1)) != INDEX_NOT_FOUND) {{
            __CLR4_5_27070lvha78c4.R.inc(3470);indices[count++] = index;
        }

        }__CLR4_5_27070lvha78c4.R.inc(3471);return removeAll(array, Arrays.copyOf(indices, count));
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * Removes the occurrences of the specified element from the specified array.
     *
     * <p>
     * All subsequent elements are shifted to the left (subtracts one from their indices).
     * If the array doesn't contains such an element, no elements are removed from the array.
     * <code>null</code> will be returned if the input array is <code>null</code>.
     * </p>
     *
     * @param <T> the type of object in the array
     * @param element the element to remove
     * @param array the input array
     *
     * @return A new array containing the existing elements except the occurrences of the specified element.
     * @since 3.5
     */
    public static <T> T[] removeAllOccurences(final T[] array, final T element) {try{__CLR4_5_27070lvha78c4.R.inc(3472);
        __CLR4_5_27070lvha78c4.R.inc(3473);int index = indexOf(array, element);
        __CLR4_5_27070lvha78c4.R.inc(3474);if ((((index == INDEX_NOT_FOUND)&&(__CLR4_5_27070lvha78c4.R.iget(3475)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(3476)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(3477);return clone(array);
        }

        }__CLR4_5_27070lvha78c4.R.inc(3478);final int[] indices = new int[array.length - index];
        __CLR4_5_27070lvha78c4.R.inc(3479);indices[0] = index;
        __CLR4_5_27070lvha78c4.R.inc(3480);int count = 1;

        __CLR4_5_27070lvha78c4.R.inc(3481);while ((index = indexOf(array, element, indices[count - 1] + 1)) != INDEX_NOT_FOUND) {{
            __CLR4_5_27070lvha78c4.R.inc(3484);indices[count++] = index;
        }

        }__CLR4_5_27070lvha78c4.R.inc(3485);return removeAll(array, Arrays.copyOf(indices, count));
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Returns an array containing the string representation of each element in the argument array.</p>
     *
     * <p>This method returns {@code null} for a {@code null} input array.</p>
     *
     * @param array the {@code Object[]} to be processed, may be null
     * @return {@code String[]} of the same size as the source with its element's string representation,
     * {@code null} if null array input
     * @throws NullPointerException if array contains {@code null}
     * @since 3.6
     */
    public static String[] toStringArray(final Object[] array) {try{__CLR4_5_27070lvha78c4.R.inc(3486);
        __CLR4_5_27070lvha78c4.R.inc(3487);if ((((array == null)&&(__CLR4_5_27070lvha78c4.R.iget(3488)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(3489)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(3490);return null;
        } }else {__CLR4_5_27070lvha78c4.R.inc(3491);if ((((array.length == 0)&&(__CLR4_5_27070lvha78c4.R.iget(3492)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(3493)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(3494);return EMPTY_STRING_ARRAY;
        }

        }}__CLR4_5_27070lvha78c4.R.inc(3495);final String[] result = new String[array.length];
        __CLR4_5_27070lvha78c4.R.inc(3496);for (int i = 0; (((i < array.length)&&(__CLR4_5_27070lvha78c4.R.iget(3497)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(3498)==0&false)); i++) {{
            __CLR4_5_27070lvha78c4.R.inc(3499);result[i] = array[i].toString();
        }

        }__CLR4_5_27070lvha78c4.R.inc(3500);return result;
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Returns an array containing the string representation of each element in the argument
     * array handling {@code null} elements.</p>
     *
     * <p>This method returns {@code null} for a {@code null} input array.</p>
     *
     * @param array the Object[] to be processed, may be null
     * @param valueForNullElements the value to insert if {@code null} is found
     * @return a {@code String} array, {@code null} if null array input
     * @since 3.6
     */
    public static String[] toStringArray(final Object[] array, final String valueForNullElements) {try{__CLR4_5_27070lvha78c4.R.inc(3501);
        __CLR4_5_27070lvha78c4.R.inc(3502);if ((((null == array)&&(__CLR4_5_27070lvha78c4.R.iget(3503)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(3504)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(3505);return null;
        } }else {__CLR4_5_27070lvha78c4.R.inc(3506);if ((((array.length == 0)&&(__CLR4_5_27070lvha78c4.R.iget(3507)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(3508)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(3509);return EMPTY_STRING_ARRAY;
        }

        }}__CLR4_5_27070lvha78c4.R.inc(3510);final String[] result = new String[array.length];
        __CLR4_5_27070lvha78c4.R.inc(3511);for (int i = 0; (((i < array.length)&&(__CLR4_5_27070lvha78c4.R.iget(3512)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(3513)==0&false)); i++) {{
            __CLR4_5_27070lvha78c4.R.inc(3514);final Object object = array[i]; 
            __CLR4_5_27070lvha78c4.R.inc(3515);result[i] = ((((object == null )&&(__CLR4_5_27070lvha78c4.R.iget(3516)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(3517)==0&false))? valueForNullElements : object.toString());
        }

        }__CLR4_5_27070lvha78c4.R.inc(3518);return result;
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Inserts elements into an array at the given index (starting from zero).</p>
     *
     * <p>When an array is returned, it is always a new array.</p>
     *
     * <pre>
     * ArrayUtils.insert(index, null, null)      = null
     * ArrayUtils.insert(index, array, null)     = cloned copy of 'array'
     * ArrayUtils.insert(index, null, values)    = null
     * </pre>
     *
     * @param index the position within {@code array} to insert the new values
     * @param array the array to insert the values into, may be {@code null}
     * @param values the new values to insert, may be {@code null}
     * @return The new array.
     * @throws IndexOutOfBoundsException if {@code array} is provided 
     * and either {@code index < 0} or {@code index > array.length}
     * @since 3.6
     */
    public static boolean[] insert(final int index, final boolean[] array, final boolean... values) {try{__CLR4_5_27070lvha78c4.R.inc(3519);
        __CLR4_5_27070lvha78c4.R.inc(3520);if ((((array == null)&&(__CLR4_5_27070lvha78c4.R.iget(3521)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(3522)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(3523);return null;
        }
        }__CLR4_5_27070lvha78c4.R.inc(3524);if ((((values == null || values.length == 0)&&(__CLR4_5_27070lvha78c4.R.iget(3525)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(3526)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(3527);return clone(array);
        }
        }__CLR4_5_27070lvha78c4.R.inc(3528);if ((((index < 0 || index > array.length)&&(__CLR4_5_27070lvha78c4.R.iget(3529)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(3530)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(3531);throw new IndexOutOfBoundsException("Index: " + index + ", Length: " + array.length);
        }

        }__CLR4_5_27070lvha78c4.R.inc(3532);boolean[] result = new boolean[array.length + values.length];

        __CLR4_5_27070lvha78c4.R.inc(3533);System.arraycopy(values, 0, result, index, values.length);
        __CLR4_5_27070lvha78c4.R.inc(3534);if ((((index > 0)&&(__CLR4_5_27070lvha78c4.R.iget(3535)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(3536)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(3537);System.arraycopy(array, 0, result, 0, index);
        }
        }__CLR4_5_27070lvha78c4.R.inc(3538);if ((((index < array.length)&&(__CLR4_5_27070lvha78c4.R.iget(3539)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(3540)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(3541);System.arraycopy(array, index, result, index + values.length, array.length - index);
        }
        }__CLR4_5_27070lvha78c4.R.inc(3542);return result;
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Inserts elements into an array at the given index (starting from zero).</p>
     *
     * <p>When an array is returned, it is always a new array.</p>
     *
     * <pre>
     * ArrayUtils.insert(index, null, null)      = null
     * ArrayUtils.insert(index, array, null)     = cloned copy of 'array'
     * ArrayUtils.insert(index, null, values)    = null
     * </pre>
     *
     * @param index the position within {@code array} to insert the new values
     * @param array the array to insert the values into, may be {@code null}
     * @param values the new values to insert, may be {@code null}
     * @return The new array.
     * @throws IndexOutOfBoundsException if {@code array} is provided 
     * and either {@code index < 0} or {@code index > array.length}
     * @since 3.6
     */
    public static byte[] insert(final int index, final byte[] array, final byte... values) {try{__CLR4_5_27070lvha78c4.R.inc(3543);
        __CLR4_5_27070lvha78c4.R.inc(3544);if ((((array == null)&&(__CLR4_5_27070lvha78c4.R.iget(3545)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(3546)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(3547);return null;
        }
        }__CLR4_5_27070lvha78c4.R.inc(3548);if ((((values == null || values.length == 0)&&(__CLR4_5_27070lvha78c4.R.iget(3549)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(3550)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(3551);return clone(array);
        }
        }__CLR4_5_27070lvha78c4.R.inc(3552);if ((((index < 0 || index > array.length)&&(__CLR4_5_27070lvha78c4.R.iget(3553)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(3554)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(3555);throw new IndexOutOfBoundsException("Index: " + index + ", Length: " + array.length);
        }

        }__CLR4_5_27070lvha78c4.R.inc(3556);byte[] result = new byte[array.length + values.length];

        __CLR4_5_27070lvha78c4.R.inc(3557);System.arraycopy(values, 0, result, index, values.length);
        __CLR4_5_27070lvha78c4.R.inc(3558);if ((((index > 0)&&(__CLR4_5_27070lvha78c4.R.iget(3559)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(3560)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(3561);System.arraycopy(array, 0, result, 0, index);
        }
        }__CLR4_5_27070lvha78c4.R.inc(3562);if ((((index < array.length)&&(__CLR4_5_27070lvha78c4.R.iget(3563)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(3564)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(3565);System.arraycopy(array, index, result, index + values.length, array.length - index);
        }
        }__CLR4_5_27070lvha78c4.R.inc(3566);return result;
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Inserts elements into an array at the given index (starting from zero).</p>
     *
     * <p>When an array is returned, it is always a new array.</p>
     *
     * <pre>
     * ArrayUtils.insert(index, null, null)      = null
     * ArrayUtils.insert(index, array, null)     = cloned copy of 'array'
     * ArrayUtils.insert(index, null, values)    = null
     * </pre>
     *
     * @param index the position within {@code array} to insert the new values
     * @param array the array to insert the values into, may be {@code null}
     * @param values the new values to insert, may be {@code null}
     * @return The new array.
     * @throws IndexOutOfBoundsException if {@code array} is provided 
     * and either {@code index < 0} or {@code index > array.length}
     * @since 3.6
     */
    public static char[] insert(final int index, final char[] array, final char... values) {try{__CLR4_5_27070lvha78c4.R.inc(3567);
        __CLR4_5_27070lvha78c4.R.inc(3568);if ((((array == null)&&(__CLR4_5_27070lvha78c4.R.iget(3569)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(3570)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(3571);return null;
        }
        }__CLR4_5_27070lvha78c4.R.inc(3572);if ((((values == null || values.length == 0)&&(__CLR4_5_27070lvha78c4.R.iget(3573)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(3574)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(3575);return clone(array);
        }
        }__CLR4_5_27070lvha78c4.R.inc(3576);if ((((index < 0 || index > array.length)&&(__CLR4_5_27070lvha78c4.R.iget(3577)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(3578)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(3579);throw new IndexOutOfBoundsException("Index: " + index + ", Length: " + array.length);
        }

        }__CLR4_5_27070lvha78c4.R.inc(3580);char[] result = new char[array.length + values.length];

        __CLR4_5_27070lvha78c4.R.inc(3581);System.arraycopy(values, 0, result, index, values.length);
        __CLR4_5_27070lvha78c4.R.inc(3582);if ((((index > 0)&&(__CLR4_5_27070lvha78c4.R.iget(3583)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(3584)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(3585);System.arraycopy(array, 0, result, 0, index);
        }
        }__CLR4_5_27070lvha78c4.R.inc(3586);if ((((index < array.length)&&(__CLR4_5_27070lvha78c4.R.iget(3587)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(3588)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(3589);System.arraycopy(array, index, result, index + values.length, array.length - index);
        }
        }__CLR4_5_27070lvha78c4.R.inc(3590);return result;
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Inserts elements into an array at the given index (starting from zero).</p>
     *
     * <p>When an array is returned, it is always a new array.</p>
     *
     * <pre>
     * ArrayUtils.insert(index, null, null)      = null
     * ArrayUtils.insert(index, array, null)     = cloned copy of 'array'
     * ArrayUtils.insert(index, null, values)    = null
     * </pre>
     *
     * @param index the position within {@code array} to insert the new values
     * @param array the array to insert the values into, may be {@code null}
     * @param values the new values to insert, may be {@code null}
     * @return The new array.
     * @throws IndexOutOfBoundsException if {@code array} is provided 
     * and either {@code index < 0} or {@code index > array.length}
     * @since 3.6
     */
    public static double[] insert(final int index, final double[] array, final double... values) {try{__CLR4_5_27070lvha78c4.R.inc(3591);
        __CLR4_5_27070lvha78c4.R.inc(3592);if ((((array == null)&&(__CLR4_5_27070lvha78c4.R.iget(3593)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(3594)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(3595);return null;
        }
        }__CLR4_5_27070lvha78c4.R.inc(3596);if ((((values == null || values.length == 0)&&(__CLR4_5_27070lvha78c4.R.iget(3597)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(3598)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(3599);return clone(array);
        }
        }__CLR4_5_27070lvha78c4.R.inc(3600);if ((((index < 0 || index > array.length)&&(__CLR4_5_27070lvha78c4.R.iget(3601)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(3602)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(3603);throw new IndexOutOfBoundsException("Index: " + index + ", Length: " + array.length);
        }

        }__CLR4_5_27070lvha78c4.R.inc(3604);double[] result = new double[array.length + values.length];

        __CLR4_5_27070lvha78c4.R.inc(3605);System.arraycopy(values, 0, result, index, values.length);
        __CLR4_5_27070lvha78c4.R.inc(3606);if ((((index > 0)&&(__CLR4_5_27070lvha78c4.R.iget(3607)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(3608)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(3609);System.arraycopy(array, 0, result, 0, index);
        }
        }__CLR4_5_27070lvha78c4.R.inc(3610);if ((((index < array.length)&&(__CLR4_5_27070lvha78c4.R.iget(3611)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(3612)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(3613);System.arraycopy(array, index, result, index + values.length, array.length - index);
        }
        }__CLR4_5_27070lvha78c4.R.inc(3614);return result;
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Inserts elements into an array at the given index (starting from zero).</p>
     *
     * <p>When an array is returned, it is always a new array.</p>
     *
     * <pre>
     * ArrayUtils.insert(index, null, null)      = null
     * ArrayUtils.insert(index, array, null)     = cloned copy of 'array'
     * ArrayUtils.insert(index, null, values)    = null
     * </pre>
     *
     * @param index the position within {@code array} to insert the new values
     * @param array the array to insert the values into, may be {@code null}
     * @param values the new values to insert, may be {@code null}
     * @return The new array.
     * @throws IndexOutOfBoundsException if {@code array} is provided 
     * and either {@code index < 0} or {@code index > array.length}
     * @since 3.6
     */
    public static float[] insert(final int index, final float[] array, final float... values) {try{__CLR4_5_27070lvha78c4.R.inc(3615);
        __CLR4_5_27070lvha78c4.R.inc(3616);if ((((array == null)&&(__CLR4_5_27070lvha78c4.R.iget(3617)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(3618)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(3619);return null;
        }
        }__CLR4_5_27070lvha78c4.R.inc(3620);if ((((values == null || values.length == 0)&&(__CLR4_5_27070lvha78c4.R.iget(3621)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(3622)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(3623);return clone(array);
        }
        }__CLR4_5_27070lvha78c4.R.inc(3624);if ((((index < 0 || index > array.length)&&(__CLR4_5_27070lvha78c4.R.iget(3625)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(3626)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(3627);throw new IndexOutOfBoundsException("Index: " + index + ", Length: " + array.length);
        }

        }__CLR4_5_27070lvha78c4.R.inc(3628);float[] result = new float[array.length + values.length];

        __CLR4_5_27070lvha78c4.R.inc(3629);System.arraycopy(values, 0, result, index, values.length);
        __CLR4_5_27070lvha78c4.R.inc(3630);if ((((index > 0)&&(__CLR4_5_27070lvha78c4.R.iget(3631)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(3632)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(3633);System.arraycopy(array, 0, result, 0, index);
        }
        }__CLR4_5_27070lvha78c4.R.inc(3634);if ((((index < array.length)&&(__CLR4_5_27070lvha78c4.R.iget(3635)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(3636)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(3637);System.arraycopy(array, index, result, index + values.length, array.length - index);
        }
        }__CLR4_5_27070lvha78c4.R.inc(3638);return result;
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Inserts elements into an array at the given index (starting from zero).</p>
     *
     * <p>When an array is returned, it is always a new array.</p>
     *
     * <pre>
     * ArrayUtils.insert(index, null, null)      = null
     * ArrayUtils.insert(index, array, null)     = cloned copy of 'array'
     * ArrayUtils.insert(index, null, values)    = null
     * </pre>
     *
     * @param index the position within {@code array} to insert the new values
     * @param array the array to insert the values into, may be {@code null}
     * @param values the new values to insert, may be {@code null}
     * @return The new array.
     * @throws IndexOutOfBoundsException if {@code array} is provided 
     * and either {@code index < 0} or {@code index > array.length}
     * @since 3.6
     */
    public static int[] insert(final int index, final int[] array, final int... values) {try{__CLR4_5_27070lvha78c4.R.inc(3639);
        __CLR4_5_27070lvha78c4.R.inc(3640);if ((((array == null)&&(__CLR4_5_27070lvha78c4.R.iget(3641)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(3642)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(3643);return null;
        }
        }__CLR4_5_27070lvha78c4.R.inc(3644);if ((((values == null || values.length == 0)&&(__CLR4_5_27070lvha78c4.R.iget(3645)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(3646)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(3647);return clone(array);
        }
        }__CLR4_5_27070lvha78c4.R.inc(3648);if ((((index < 0 || index > array.length)&&(__CLR4_5_27070lvha78c4.R.iget(3649)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(3650)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(3651);throw new IndexOutOfBoundsException("Index: " + index + ", Length: " + array.length);
        }

        }__CLR4_5_27070lvha78c4.R.inc(3652);int[] result = new int[array.length + values.length];

        __CLR4_5_27070lvha78c4.R.inc(3653);System.arraycopy(values, 0, result, index, values.length);
        __CLR4_5_27070lvha78c4.R.inc(3654);if ((((index > 0)&&(__CLR4_5_27070lvha78c4.R.iget(3655)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(3656)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(3657);System.arraycopy(array, 0, result, 0, index);
        }
        }__CLR4_5_27070lvha78c4.R.inc(3658);if ((((index < array.length)&&(__CLR4_5_27070lvha78c4.R.iget(3659)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(3660)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(3661);System.arraycopy(array, index, result, index + values.length, array.length - index);
        }
        }__CLR4_5_27070lvha78c4.R.inc(3662);return result;
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Inserts elements into an array at the given index (starting from zero).</p>
     *
     * <p>When an array is returned, it is always a new array.</p>
     *
     * <pre>
     * ArrayUtils.insert(index, null, null)      = null
     * ArrayUtils.insert(index, array, null)     = cloned copy of 'array'
     * ArrayUtils.insert(index, null, values)    = null
     * </pre>
     *
     * @param index the position within {@code array} to insert the new values
     * @param array the array to insert the values into, may be {@code null}
     * @param values the new values to insert, may be {@code null}
     * @return The new array.
     * @throws IndexOutOfBoundsException if {@code array} is provided 
     * and either {@code index < 0} or {@code index > array.length}
     * @since 3.6
     */
    public static long[] insert(final int index, final long[] array, final long... values) {try{__CLR4_5_27070lvha78c4.R.inc(3663);
        __CLR4_5_27070lvha78c4.R.inc(3664);if ((((array == null)&&(__CLR4_5_27070lvha78c4.R.iget(3665)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(3666)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(3667);return null;
        }
        }__CLR4_5_27070lvha78c4.R.inc(3668);if ((((values == null || values.length == 0)&&(__CLR4_5_27070lvha78c4.R.iget(3669)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(3670)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(3671);return clone(array);
        }
        }__CLR4_5_27070lvha78c4.R.inc(3672);if ((((index < 0 || index > array.length)&&(__CLR4_5_27070lvha78c4.R.iget(3673)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(3674)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(3675);throw new IndexOutOfBoundsException("Index: " + index + ", Length: " + array.length);
        }

        }__CLR4_5_27070lvha78c4.R.inc(3676);long[] result = new long[array.length + values.length];

        __CLR4_5_27070lvha78c4.R.inc(3677);System.arraycopy(values, 0, result, index, values.length);
        __CLR4_5_27070lvha78c4.R.inc(3678);if ((((index > 0)&&(__CLR4_5_27070lvha78c4.R.iget(3679)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(3680)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(3681);System.arraycopy(array, 0, result, 0, index);
        }
        }__CLR4_5_27070lvha78c4.R.inc(3682);if ((((index < array.length)&&(__CLR4_5_27070lvha78c4.R.iget(3683)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(3684)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(3685);System.arraycopy(array, index, result, index + values.length, array.length - index);
        }
        }__CLR4_5_27070lvha78c4.R.inc(3686);return result;
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Inserts elements into an array at the given index (starting from zero).</p>
     *
     * <p>When an array is returned, it is always a new array.</p>
     *
     * <pre>
     * ArrayUtils.insert(index, null, null)      = null
     * ArrayUtils.insert(index, array, null)     = cloned copy of 'array'
     * ArrayUtils.insert(index, null, values)    = null
     * </pre>
     *
     * @param index the position within {@code array} to insert the new values
     * @param array the array to insert the values into, may be {@code null}
     * @param values the new values to insert, may be {@code null}
     * @return The new array.
     * @throws IndexOutOfBoundsException if {@code array} is provided 
     * and either {@code index < 0} or {@code index > array.length}
     * @since 3.6
     */
    public static short[] insert(final int index, final short[] array, final short... values) {try{__CLR4_5_27070lvha78c4.R.inc(3687);
        __CLR4_5_27070lvha78c4.R.inc(3688);if ((((array == null)&&(__CLR4_5_27070lvha78c4.R.iget(3689)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(3690)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(3691);return null;
        }
        }__CLR4_5_27070lvha78c4.R.inc(3692);if ((((values == null || values.length == 0)&&(__CLR4_5_27070lvha78c4.R.iget(3693)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(3694)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(3695);return clone(array);
        }
        }__CLR4_5_27070lvha78c4.R.inc(3696);if ((((index < 0 || index > array.length)&&(__CLR4_5_27070lvha78c4.R.iget(3697)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(3698)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(3699);throw new IndexOutOfBoundsException("Index: " + index + ", Length: " + array.length);
        }

        }__CLR4_5_27070lvha78c4.R.inc(3700);short[] result = new short[array.length + values.length];

        __CLR4_5_27070lvha78c4.R.inc(3701);System.arraycopy(values, 0, result, index, values.length);
        __CLR4_5_27070lvha78c4.R.inc(3702);if ((((index > 0)&&(__CLR4_5_27070lvha78c4.R.iget(3703)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(3704)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(3705);System.arraycopy(array, 0, result, 0, index);
        }
        }__CLR4_5_27070lvha78c4.R.inc(3706);if ((((index < array.length)&&(__CLR4_5_27070lvha78c4.R.iget(3707)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(3708)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(3709);System.arraycopy(array, index, result, index + values.length, array.length - index);
        }
        }__CLR4_5_27070lvha78c4.R.inc(3710);return result;
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * <p>Inserts elements into an array at the given index (starting from zero).</p>
     *
     * <p>When an array is returned, it is always a new array.</p>
     *
     * <pre>
     * ArrayUtils.insert(index, null, null)      = null
     * ArrayUtils.insert(index, array, null)     = cloned copy of 'array'
     * ArrayUtils.insert(index, null, values)    = null
     * </pre>
     *
     * @param <T> The type of elements in {@code array} and {@code values}
     * @param index the position within {@code array} to insert the new values
     * @param array the array to insert the values into, may be {@code null}
     * @param values the new values to insert, may be {@code null}
     * @return The new array.
     * @throws IndexOutOfBoundsException if {@code array} is provided
     * and either {@code index < 0} or {@code index > array.length}
     * @since 3.6
     */
    @SafeVarargs
    public static <T> T[] insert(final int index, final T[] array, final T... values) {try{__CLR4_5_27070lvha78c4.R.inc(3711);
        /*
         * Note on use of @SafeVarargs:
         * 
         * By returning null when 'array' is null, we avoid returning the vararg
         * array to the caller. We also avoid relying on the type of the vararg
         * array, by inspecting the component type of 'array'.
         */

        __CLR4_5_27070lvha78c4.R.inc(3712);if ((((array == null)&&(__CLR4_5_27070lvha78c4.R.iget(3713)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(3714)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(3715);return null;
        }
        }__CLR4_5_27070lvha78c4.R.inc(3716);if ((((values == null || values.length == 0)&&(__CLR4_5_27070lvha78c4.R.iget(3717)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(3718)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(3719);return clone(array);
        }
        }__CLR4_5_27070lvha78c4.R.inc(3720);if ((((index < 0 || index > array.length)&&(__CLR4_5_27070lvha78c4.R.iget(3721)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(3722)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(3723);throw new IndexOutOfBoundsException("Index: " + index + ", Length: " + array.length);
        }

        }__CLR4_5_27070lvha78c4.R.inc(3724);final Class<?> type = array.getClass().getComponentType();
        __CLR4_5_27070lvha78c4.R.inc(3725);@SuppressWarnings("unchecked") // OK, because array and values are of type T
        T[] result = (T[]) Array.newInstance(type, array.length + values.length);

        __CLR4_5_27070lvha78c4.R.inc(3726);System.arraycopy(values, 0, result, index, values.length);
        __CLR4_5_27070lvha78c4.R.inc(3727);if ((((index > 0)&&(__CLR4_5_27070lvha78c4.R.iget(3728)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(3729)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(3730);System.arraycopy(array, 0, result, 0, index);
        }
        }__CLR4_5_27070lvha78c4.R.inc(3731);if ((((index < array.length)&&(__CLR4_5_27070lvha78c4.R.iget(3732)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(3733)==0&false))) {{
            __CLR4_5_27070lvha78c4.R.inc(3734);System.arraycopy(array, index, result, index + values.length, array.length - index);
        }
        }__CLR4_5_27070lvha78c4.R.inc(3735);return result;
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * Randomly permutes the elements of the specified array using the Fisher-Yates algorithm.
     *
     * @param array   the array to shuffle
     * @see <a href="https://en.wikipedia.org/wiki/Fisher%E2%80%93Yates_shuffle">Fisher-Yates shuffle algorithm</a>
     * @since 3.6
     */
    public static void shuffle(Object[] array) {try{__CLR4_5_27070lvha78c4.R.inc(3736);
        __CLR4_5_27070lvha78c4.R.inc(3737);shuffle(array, new Random());
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * Randomly permutes the elements of the specified array using the Fisher-Yates algorithm.
     *
     * @param array   the array to shuffle
     * @param random  the source of randomness used to permute the elements
     * @see <a href="https://en.wikipedia.org/wiki/Fisher%E2%80%93Yates_shuffle">Fisher-Yates shuffle algorithm</a>
     * @since 3.6
     */
    public static void shuffle(Object[] array, Random random) {try{__CLR4_5_27070lvha78c4.R.inc(3738);
        __CLR4_5_27070lvha78c4.R.inc(3739);for (int i = array.length; (((i > 1)&&(__CLR4_5_27070lvha78c4.R.iget(3740)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(3741)==0&false)); i--) {{
            __CLR4_5_27070lvha78c4.R.inc(3742);swap(array, i - 1, random.nextInt(i), 1);
        }
    }}finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * Randomly permutes the elements of the specified array using the Fisher-Yates algorithm.
     *
     * @param array   the array to shuffle
     * @see <a href="https://en.wikipedia.org/wiki/Fisher%E2%80%93Yates_shuffle">Fisher-Yates shuffle algorithm</a>
     * @since 3.6
     */
    public static void shuffle(boolean[] array) {try{__CLR4_5_27070lvha78c4.R.inc(3743);
        __CLR4_5_27070lvha78c4.R.inc(3744);shuffle(array, new Random());
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * Randomly permutes the elements of the specified array using the Fisher-Yates algorithm.
     *
     * @param array   the array to shuffle
     * @param random  the source of randomness used to permute the elements
     * @see <a href="https://en.wikipedia.org/wiki/Fisher%E2%80%93Yates_shuffle">Fisher-Yates shuffle algorithm</a>
     * @since 3.6
     */
    public static void shuffle(boolean[] array, Random random) {try{__CLR4_5_27070lvha78c4.R.inc(3745);
        __CLR4_5_27070lvha78c4.R.inc(3746);for (int i = array.length; (((i > 1)&&(__CLR4_5_27070lvha78c4.R.iget(3747)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(3748)==0&false)); i--) {{
            __CLR4_5_27070lvha78c4.R.inc(3749);swap(array, i - 1, random.nextInt(i), 1);
        }
    }}finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * Randomly permutes the elements of the specified array using the Fisher-Yates algorithm.
     *
     * @param array   the array to shuffle
     * @see <a href="https://en.wikipedia.org/wiki/Fisher%E2%80%93Yates_shuffle">Fisher-Yates shuffle algorithm</a>
     * @since 3.6
     */
    public static void shuffle(byte[] array) {try{__CLR4_5_27070lvha78c4.R.inc(3750);
        __CLR4_5_27070lvha78c4.R.inc(3751);shuffle(array, new Random());
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * Randomly permutes the elements of the specified array using the Fisher-Yates algorithm.
     *
     * @param array   the array to shuffle
     * @param random  the source of randomness used to permute the elements
     * @see <a href="https://en.wikipedia.org/wiki/Fisher%E2%80%93Yates_shuffle">Fisher-Yates shuffle algorithm</a>
     * @since 3.6
     */
    public static void shuffle(byte[] array, Random random) {try{__CLR4_5_27070lvha78c4.R.inc(3752);
        __CLR4_5_27070lvha78c4.R.inc(3753);for (int i = array.length; (((i > 1)&&(__CLR4_5_27070lvha78c4.R.iget(3754)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(3755)==0&false)); i--) {{
            __CLR4_5_27070lvha78c4.R.inc(3756);swap(array, i - 1, random.nextInt(i), 1);
        }
    }}finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * Randomly permutes the elements of the specified array using the Fisher-Yates algorithm.
     *
     * @param array   the array to shuffle
     * @see <a href="https://en.wikipedia.org/wiki/Fisher%E2%80%93Yates_shuffle">Fisher-Yates shuffle algorithm</a>
     * @since 3.6
     */
    public static void shuffle(char[] array) {try{__CLR4_5_27070lvha78c4.R.inc(3757);
        __CLR4_5_27070lvha78c4.R.inc(3758);shuffle(array, new Random());
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * Randomly permutes the elements of the specified array using the Fisher-Yates algorithm.
     *
     * @param array   the array to shuffle
     * @param random  the source of randomness used to permute the elements
     * @see <a href="https://en.wikipedia.org/wiki/Fisher%E2%80%93Yates_shuffle">Fisher-Yates shuffle algorithm</a>
     * @since 3.6
     */
    public static void shuffle(char[] array, Random random) {try{__CLR4_5_27070lvha78c4.R.inc(3759);
        __CLR4_5_27070lvha78c4.R.inc(3760);for (int i = array.length; (((i > 1)&&(__CLR4_5_27070lvha78c4.R.iget(3761)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(3762)==0&false)); i--) {{
            __CLR4_5_27070lvha78c4.R.inc(3763);swap(array, i - 1, random.nextInt(i), 1);
        }
    }}finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * Randomly permutes the elements of the specified array using the Fisher-Yates algorithm.
     *
     * @param array   the array to shuffle
     * @see <a href="https://en.wikipedia.org/wiki/Fisher%E2%80%93Yates_shuffle">Fisher-Yates shuffle algorithm</a>
     * @since 3.6
     */
    public static void shuffle(short[] array) {try{__CLR4_5_27070lvha78c4.R.inc(3764);
        __CLR4_5_27070lvha78c4.R.inc(3765);shuffle(array, new Random());
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * Randomly permutes the elements of the specified array using the Fisher-Yates algorithm.
     *
     * @param array   the array to shuffle
     * @param random  the source of randomness used to permute the elements
     * @see <a href="https://en.wikipedia.org/wiki/Fisher%E2%80%93Yates_shuffle">Fisher-Yates shuffle algorithm</a>
     * @since 3.6
     */
    public static void shuffle(short[] array, Random random) {try{__CLR4_5_27070lvha78c4.R.inc(3766);
        __CLR4_5_27070lvha78c4.R.inc(3767);for (int i = array.length; (((i > 1)&&(__CLR4_5_27070lvha78c4.R.iget(3768)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(3769)==0&false)); i--) {{
            __CLR4_5_27070lvha78c4.R.inc(3770);swap(array, i - 1, random.nextInt(i), 1);
        }
    }}finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * Randomly permutes the elements of the specified array using the Fisher-Yates algorithm.
     *
     * @param array   the array to shuffle
     * @see <a href="https://en.wikipedia.org/wiki/Fisher%E2%80%93Yates_shuffle">Fisher-Yates shuffle algorithm</a>
     * @since 3.6
     */
    public static void shuffle(int[] array) {try{__CLR4_5_27070lvha78c4.R.inc(3771);
        __CLR4_5_27070lvha78c4.R.inc(3772);shuffle(array, new Random());
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * Randomly permutes the elements of the specified array using the Fisher-Yates algorithm.
     *
     * @param array   the array to shuffle
     * @param random  the source of randomness used to permute the elements
     * @see <a href="https://en.wikipedia.org/wiki/Fisher%E2%80%93Yates_shuffle">Fisher-Yates shuffle algorithm</a>
     * @since 3.6
     */
    public static void shuffle(int[] array, Random random) {try{__CLR4_5_27070lvha78c4.R.inc(3773);
        __CLR4_5_27070lvha78c4.R.inc(3774);for (int i = array.length; (((i > 1)&&(__CLR4_5_27070lvha78c4.R.iget(3775)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(3776)==0&false)); i--) {{
            __CLR4_5_27070lvha78c4.R.inc(3777);swap(array, i - 1, random.nextInt(i), 1);
        }
    }}finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * Randomly permutes the elements of the specified array using the Fisher-Yates algorithm.
     *
     * @param array   the array to shuffle
     * @see <a href="https://en.wikipedia.org/wiki/Fisher%E2%80%93Yates_shuffle">Fisher-Yates shuffle algorithm</a>
     * @since 3.6
     */
    public static void shuffle(long[] array) {try{__CLR4_5_27070lvha78c4.R.inc(3778);
        __CLR4_5_27070lvha78c4.R.inc(3779);shuffle(array, new Random());
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * Randomly permutes the elements of the specified array using the Fisher-Yates algorithm.
     *
     * @param array   the array to shuffle
     * @param random  the source of randomness used to permute the elements
     * @see <a href="https://en.wikipedia.org/wiki/Fisher%E2%80%93Yates_shuffle">Fisher-Yates shuffle algorithm</a>
     * @since 3.6
     */
    public static void shuffle(long[] array, Random random) {try{__CLR4_5_27070lvha78c4.R.inc(3780);
        __CLR4_5_27070lvha78c4.R.inc(3781);for (int i = array.length; (((i > 1)&&(__CLR4_5_27070lvha78c4.R.iget(3782)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(3783)==0&false)); i--) {{
            __CLR4_5_27070lvha78c4.R.inc(3784);swap(array, i - 1, random.nextInt(i), 1);
        }
    }}finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * Randomly permutes the elements of the specified array using the Fisher-Yates algorithm.
     *
     * @param array   the array to shuffle
     * @see <a href="https://en.wikipedia.org/wiki/Fisher%E2%80%93Yates_shuffle">Fisher-Yates shuffle algorithm</a>
     * @since 3.6
     */
    public static void shuffle(float[] array) {try{__CLR4_5_27070lvha78c4.R.inc(3785);
        __CLR4_5_27070lvha78c4.R.inc(3786);shuffle(array, new Random());
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * Randomly permutes the elements of the specified array using the Fisher-Yates algorithm.
     *
     * @param array   the array to shuffle
     * @param random  the source of randomness used to permute the elements
     * @see <a href="https://en.wikipedia.org/wiki/Fisher%E2%80%93Yates_shuffle">Fisher-Yates shuffle algorithm</a>
     * @since 3.6
     */
    public static void shuffle(float[] array, Random random) {try{__CLR4_5_27070lvha78c4.R.inc(3787);
        __CLR4_5_27070lvha78c4.R.inc(3788);for (int i = array.length; (((i > 1)&&(__CLR4_5_27070lvha78c4.R.iget(3789)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(3790)==0&false)); i--) {{
            __CLR4_5_27070lvha78c4.R.inc(3791);swap(array, i - 1, random.nextInt(i), 1);
        }
    }}finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * Randomly permutes the elements of the specified array using the Fisher-Yates algorithm.
     *
     * @param array   the array to shuffle
     * @see <a href="https://en.wikipedia.org/wiki/Fisher%E2%80%93Yates_shuffle">Fisher-Yates shuffle algorithm</a>
     * @since 3.6
     */
    public static void shuffle(double[] array) {try{__CLR4_5_27070lvha78c4.R.inc(3792);
        __CLR4_5_27070lvha78c4.R.inc(3793);shuffle(array, new Random());
    }finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}

    /**
     * Randomly permutes the elements of the specified array using the Fisher-Yates algorithm.
     *
     * @param array   the array to shuffle
     * @param random  the source of randomness used to permute the elements
     * @see <a href="https://en.wikipedia.org/wiki/Fisher%E2%80%93Yates_shuffle">Fisher-Yates shuffle algorithm</a>
     * @since 3.6
     */
    public static void shuffle(double[] array, Random random) {try{__CLR4_5_27070lvha78c4.R.inc(3794);
        __CLR4_5_27070lvha78c4.R.inc(3795);for (int i = array.length; (((i > 1)&&(__CLR4_5_27070lvha78c4.R.iget(3796)!=0|true))||(__CLR4_5_27070lvha78c4.R.iget(3797)==0&false)); i--) {{
            __CLR4_5_27070lvha78c4.R.inc(3798);swap(array, i - 1, random.nextInt(i), 1);
        }
    }}finally{__CLR4_5_27070lvha78c4.R.flushNeeded();}}
}
