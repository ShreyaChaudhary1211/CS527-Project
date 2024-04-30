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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>Utility library to provide helper methods for Java enums.</p>
 *
 * <p>#ThreadSafe#</p>
 *
 * @since 3.0
 */
public class EnumUtils {public static class __CLR4_5_24tb4tblvha792a{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172755542L,8589935092L,6319,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final String NULL_ELEMENTS_NOT_PERMITTED = "null elements not permitted";
    private static final String CANNOT_STORE_S_S_VALUES_IN_S_BITS = "Cannot store %s %s values in %s bits";
    private static final String S_DOES_NOT_SEEM_TO_BE_AN_ENUM_TYPE = "%s does not seem to be an Enum type";
    private static final String ENUM_CLASS_MUST_BE_DEFINED = "EnumClass must be defined.";

    /**
     * This constructor is public to permit tools that require a JavaBean
     * instance to operate.
     */
    public EnumUtils() {try{__CLR4_5_24tb4tblvha792a.R.inc(6239);
    }finally{__CLR4_5_24tb4tblvha792a.R.flushNeeded();}}

    /**
     * <p>Gets the {@code Map} of enums by name.</p>
     *
     * <p>This method is useful when you need a map of enums by name.</p>
     *
     * @param <E> the type of the enumeration
     * @param enumClass  the class of the enum to query, not null
     * @return the modifiable map of enum names to enums, never null
     */
    public static <E extends Enum<E>> Map<String, E> getEnumMap(final Class<E> enumClass) {try{__CLR4_5_24tb4tblvha792a.R.inc(6240);
        __CLR4_5_24tb4tblvha792a.R.inc(6241);final Map<String, E> map = new LinkedHashMap<>();
        __CLR4_5_24tb4tblvha792a.R.inc(6242);for (final E e: enumClass.getEnumConstants()) {{
            __CLR4_5_24tb4tblvha792a.R.inc(6243);map.put(e.name(), e);
        }
        }__CLR4_5_24tb4tblvha792a.R.inc(6244);return map;
    }finally{__CLR4_5_24tb4tblvha792a.R.flushNeeded();}}

    /**
     * <p>Gets the {@code List} of enums.</p>
     *
     * <p>This method is useful when you need a list of enums rather than an array.</p>
     *
     * @param <E> the type of the enumeration
     * @param enumClass  the class of the enum to query, not null
     * @return the modifiable list of enums, never null
     */
    public static <E extends Enum<E>> List<E> getEnumList(final Class<E> enumClass) {try{__CLR4_5_24tb4tblvha792a.R.inc(6245);
        __CLR4_5_24tb4tblvha792a.R.inc(6246);return new ArrayList<>(Arrays.asList(enumClass.getEnumConstants()));
    }finally{__CLR4_5_24tb4tblvha792a.R.flushNeeded();}}

    /**
     * <p>Checks if the specified name is a valid enum for the class.</p>
     *
     * <p>This method differs from {@link Enum#valueOf} in that checks if the name is
     * a valid enum without needing to catch the exception.</p>
     *
     * @param <E> the type of the enumeration
     * @param enumClass  the class of the enum to query, not null
     * @param enumName   the enum name, null returns false
     * @return true if the enum name is valid, otherwise false
     */
    public static <E extends Enum<E>> boolean isValidEnum(final Class<E> enumClass, final String enumName) {try{__CLR4_5_24tb4tblvha792a.R.inc(6247);
        __CLR4_5_24tb4tblvha792a.R.inc(6248);if ((((enumName == null)&&(__CLR4_5_24tb4tblvha792a.R.iget(6249)!=0|true))||(__CLR4_5_24tb4tblvha792a.R.iget(6250)==0&false))) {{
            __CLR4_5_24tb4tblvha792a.R.inc(6251);return false;
        }
        }__CLR4_5_24tb4tblvha792a.R.inc(6252);try {
            __CLR4_5_24tb4tblvha792a.R.inc(6253);Enum.valueOf(enumClass, enumName);
            __CLR4_5_24tb4tblvha792a.R.inc(6254);return true;
        } catch (final IllegalArgumentException ex) {
            __CLR4_5_24tb4tblvha792a.R.inc(6255);return false;
        }
    }finally{__CLR4_5_24tb4tblvha792a.R.flushNeeded();}}

    /**
     * <p>Gets the enum for the class, returning {@code null} if not found.</p>
     *
     * <p>This method differs from {@link Enum#valueOf} in that it does not throw an exception
     * for an invalid enum name.</p>
     *
     * @param <E> the type of the enumeration
     * @param enumClass  the class of the enum to query, not null
     * @param enumName   the enum name, null returns null
     * @return the enum, null if not found
     */
    public static <E extends Enum<E>> E getEnum(final Class<E> enumClass, final String enumName) {try{__CLR4_5_24tb4tblvha792a.R.inc(6256);
        __CLR4_5_24tb4tblvha792a.R.inc(6257);if ((((enumName == null)&&(__CLR4_5_24tb4tblvha792a.R.iget(6258)!=0|true))||(__CLR4_5_24tb4tblvha792a.R.iget(6259)==0&false))) {{
            __CLR4_5_24tb4tblvha792a.R.inc(6260);return null;
        }
        }__CLR4_5_24tb4tblvha792a.R.inc(6261);try {
            __CLR4_5_24tb4tblvha792a.R.inc(6262);return Enum.valueOf(enumClass, enumName);
        } catch (final IllegalArgumentException ex) {
            __CLR4_5_24tb4tblvha792a.R.inc(6263);return null;
        }
    }finally{__CLR4_5_24tb4tblvha792a.R.flushNeeded();}}

    /**
     * <p>Creates a long bit vector representation of the given subset of an Enum.</p>
     *
     * <p>This generates a value that is usable by {@link EnumUtils#processBitVector}.</p>
     *
     * <p>Do not use this method if you have more than 64 values in your Enum, as this
     * would create a value greater than a long can hold.</p>
     *
     * @param enumClass the class of the enum we are working with, not {@code null}
     * @param values    the values we want to convert, not {@code null}, neither containing {@code null}
     * @param <E>       the type of the enumeration
     * @return a long whose value provides a binary representation of the given set of enum values.
     * @throws NullPointerException if {@code enumClass} or {@code values} is {@code null}
     * @throws IllegalArgumentException if {@code enumClass} is not an enum class or has more than 64 values,
     *                                  or if any {@code values} {@code null}
     * @since 3.0.1
     * @see #generateBitVectors(Class, Iterable)
     */
    public static <E extends Enum<E>> long generateBitVector(final Class<E> enumClass, final Iterable<? extends E> values) {try{__CLR4_5_24tb4tblvha792a.R.inc(6264);
        __CLR4_5_24tb4tblvha792a.R.inc(6265);checkBitVectorable(enumClass);
        __CLR4_5_24tb4tblvha792a.R.inc(6266);Validate.notNull(values);
        __CLR4_5_24tb4tblvha792a.R.inc(6267);long total = 0;
        __CLR4_5_24tb4tblvha792a.R.inc(6268);for (final E constant : values) {{
            __CLR4_5_24tb4tblvha792a.R.inc(6269);Validate.isTrue(constant != null, NULL_ELEMENTS_NOT_PERMITTED);
            __CLR4_5_24tb4tblvha792a.R.inc(6270);total |= 1L << constant.ordinal();
        }
        }__CLR4_5_24tb4tblvha792a.R.inc(6271);return total;
    }finally{__CLR4_5_24tb4tblvha792a.R.flushNeeded();}}

    /**
     * <p>Creates a bit vector representation of the given subset of an Enum using as many {@code long}s as needed.</p>
     *
     * <p>This generates a value that is usable by {@link EnumUtils#processBitVectors}.</p>
     *
     * <p>Use this method if you have more than 64 values in your Enum.</p>
     *
     * @param enumClass the class of the enum we are working with, not {@code null}
     * @param values    the values we want to convert, not {@code null}, neither containing {@code null}
     * @param <E>       the type of the enumeration
     * @return a long[] whose values provide a binary representation of the given set of enum values
     *         with least significant digits rightmost.
     * @throws NullPointerException if {@code enumClass} or {@code values} is {@code null}
     * @throws IllegalArgumentException if {@code enumClass} is not an enum class, or if any {@code values} {@code null}
     * @since 3.2
     */
    public static <E extends Enum<E>> long[] generateBitVectors(final Class<E> enumClass, final Iterable<? extends E> values) {try{__CLR4_5_24tb4tblvha792a.R.inc(6272);
        __CLR4_5_24tb4tblvha792a.R.inc(6273);asEnum(enumClass);
        __CLR4_5_24tb4tblvha792a.R.inc(6274);Validate.notNull(values);
        __CLR4_5_24tb4tblvha792a.R.inc(6275);final EnumSet<E> condensed = EnumSet.noneOf(enumClass);
        __CLR4_5_24tb4tblvha792a.R.inc(6276);for (final E constant : values) {{
            __CLR4_5_24tb4tblvha792a.R.inc(6277);Validate.isTrue(constant != null, NULL_ELEMENTS_NOT_PERMITTED);
            __CLR4_5_24tb4tblvha792a.R.inc(6278);condensed.add(constant);
        }
        }__CLR4_5_24tb4tblvha792a.R.inc(6279);final long[] result = new long[(enumClass.getEnumConstants().length - 1) / Long.SIZE + 1];
        __CLR4_5_24tb4tblvha792a.R.inc(6280);for (final E value : condensed) {{
            __CLR4_5_24tb4tblvha792a.R.inc(6281);result[value.ordinal() / Long.SIZE] |= 1L << (value.ordinal() % Long.SIZE);
        }
        }__CLR4_5_24tb4tblvha792a.R.inc(6282);ArrayUtils.reverse(result);
        __CLR4_5_24tb4tblvha792a.R.inc(6283);return result;
    }finally{__CLR4_5_24tb4tblvha792a.R.flushNeeded();}}

    /**
     * <p>Creates a long bit vector representation of the given array of Enum values.</p>
     *
     * <p>This generates a value that is usable by {@link EnumUtils#processBitVector}.</p>
     *
     * <p>Do not use this method if you have more than 64 values in your Enum, as this
     * would create a value greater than a long can hold.</p>
     *
     * @param enumClass the class of the enum we are working with, not {@code null}
     * @param values    the values we want to convert, not {@code null}
     * @param <E>       the type of the enumeration
     * @return a long whose value provides a binary representation of the given set of enum values.
     * @throws NullPointerException if {@code enumClass} or {@code values} is {@code null}
     * @throws IllegalArgumentException if {@code enumClass} is not an enum class or has more than 64 values
     * @since 3.0.1
     * @see #generateBitVectors(Class, Iterable)
     */
    @SafeVarargs
    public static <E extends Enum<E>> long generateBitVector(final Class<E> enumClass, final E... values) {try{__CLR4_5_24tb4tblvha792a.R.inc(6284);
        __CLR4_5_24tb4tblvha792a.R.inc(6285);Validate.noNullElements(values);
        __CLR4_5_24tb4tblvha792a.R.inc(6286);return generateBitVector(enumClass, Arrays.<E> asList(values));
    }finally{__CLR4_5_24tb4tblvha792a.R.flushNeeded();}}

    /**
     * <p>Creates a bit vector representation of the given subset of an Enum using as many {@code long}s as needed.</p>
     *
     * <p>This generates a value that is usable by {@link EnumUtils#processBitVectors}.</p>
     *
     * <p>Use this method if you have more than 64 values in your Enum.</p>
     *
     * @param enumClass the class of the enum we are working with, not {@code null}
     * @param values    the values we want to convert, not {@code null}, neither containing {@code null}
     * @param <E>       the type of the enumeration
     * @return a long[] whose values provide a binary representation of the given set of enum values
     *         with least significant digits rightmost.
     * @throws NullPointerException if {@code enumClass} or {@code values} is {@code null}
     * @throws IllegalArgumentException if {@code enumClass} is not an enum class, or if any {@code values} {@code null}
     * @since 3.2
     */
    @SafeVarargs
    public static <E extends Enum<E>> long[] generateBitVectors(final Class<E> enumClass, final E... values) {try{__CLR4_5_24tb4tblvha792a.R.inc(6287);
        __CLR4_5_24tb4tblvha792a.R.inc(6288);asEnum(enumClass);
        __CLR4_5_24tb4tblvha792a.R.inc(6289);Validate.noNullElements(values);
        __CLR4_5_24tb4tblvha792a.R.inc(6290);final EnumSet<E> condensed = EnumSet.noneOf(enumClass);
        __CLR4_5_24tb4tblvha792a.R.inc(6291);Collections.addAll(condensed, values);
        __CLR4_5_24tb4tblvha792a.R.inc(6292);final long[] result = new long[(enumClass.getEnumConstants().length - 1) / Long.SIZE + 1];
        __CLR4_5_24tb4tblvha792a.R.inc(6293);for (final E value : condensed) {{
            __CLR4_5_24tb4tblvha792a.R.inc(6294);result[value.ordinal() / Long.SIZE] |= 1L << (value.ordinal() % Long.SIZE);
        }
        }__CLR4_5_24tb4tblvha792a.R.inc(6295);ArrayUtils.reverse(result);
        __CLR4_5_24tb4tblvha792a.R.inc(6296);return result;
    }finally{__CLR4_5_24tb4tblvha792a.R.flushNeeded();}}

    /**
     * <p>Convert a long value created by {@link EnumUtils#generateBitVector} into the set of
     * enum values that it represents.</p>
     *
     * <p>If you store this value, beware any changes to the enum that would affect ordinal values.</p>
     * @param enumClass the class of the enum we are working with, not {@code null}
     * @param value     the long value representation of a set of enum values
     * @param <E>       the type of the enumeration
     * @return a set of enum values
     * @throws NullPointerException if {@code enumClass} is {@code null}
     * @throws IllegalArgumentException if {@code enumClass} is not an enum class or has more than 64 values
     * @since 3.0.1
     */
    public static <E extends Enum<E>> EnumSet<E> processBitVector(final Class<E> enumClass, final long value) {try{__CLR4_5_24tb4tblvha792a.R.inc(6297);
        __CLR4_5_24tb4tblvha792a.R.inc(6298);checkBitVectorable(enumClass).getEnumConstants();
        __CLR4_5_24tb4tblvha792a.R.inc(6299);return processBitVectors(enumClass, value);
    }finally{__CLR4_5_24tb4tblvha792a.R.flushNeeded();}}

    /**
     * <p>Convert a {@code long[]} created by {@link EnumUtils#generateBitVectors} into the set of
     * enum values that it represents.</p>
     *
     * <p>If you store this value, beware any changes to the enum that would affect ordinal values.</p>
     * @param enumClass the class of the enum we are working with, not {@code null}
     * @param values     the long[] bearing the representation of a set of enum values, least significant digits rightmost, not {@code null}
     * @param <E>       the type of the enumeration
     * @return a set of enum values
     * @throws NullPointerException if {@code enumClass} is {@code null}
     * @throws IllegalArgumentException if {@code enumClass} is not an enum class
     * @since 3.2
     */
    public static <E extends Enum<E>> EnumSet<E> processBitVectors(final Class<E> enumClass, final long... values) {try{__CLR4_5_24tb4tblvha792a.R.inc(6300);
        __CLR4_5_24tb4tblvha792a.R.inc(6301);final EnumSet<E> results = EnumSet.noneOf(asEnum(enumClass));
        __CLR4_5_24tb4tblvha792a.R.inc(6302);final long[] lvalues = ArrayUtils.clone(Validate.notNull(values));
        __CLR4_5_24tb4tblvha792a.R.inc(6303);ArrayUtils.reverse(lvalues);
        __CLR4_5_24tb4tblvha792a.R.inc(6304);for (final E constant : enumClass.getEnumConstants()) {{
            __CLR4_5_24tb4tblvha792a.R.inc(6305);final int block = constant.ordinal() / Long.SIZE;
            __CLR4_5_24tb4tblvha792a.R.inc(6306);if ((((block < lvalues.length && (lvalues[block] & 1L << (constant.ordinal() % Long.SIZE)) != 0)&&(__CLR4_5_24tb4tblvha792a.R.iget(6307)!=0|true))||(__CLR4_5_24tb4tblvha792a.R.iget(6308)==0&false))) {{
                __CLR4_5_24tb4tblvha792a.R.inc(6309);results.add(constant);
            }
        }}
        }__CLR4_5_24tb4tblvha792a.R.inc(6310);return results;
    }finally{__CLR4_5_24tb4tblvha792a.R.flushNeeded();}}

    /**
     * Validate that {@code enumClass} is compatible with representation in a {@code long}.
     * @param <E> the type of the enumeration
     * @param enumClass to check
     * @return {@code enumClass}
     * @throws NullPointerException if {@code enumClass} is {@code null}
     * @throws IllegalArgumentException if {@code enumClass} is not an enum class or has more than 64 values
     * @since 3.0.1
     */
    private static <E extends Enum<E>> Class<E> checkBitVectorable(final Class<E> enumClass) {try{__CLR4_5_24tb4tblvha792a.R.inc(6311);
        __CLR4_5_24tb4tblvha792a.R.inc(6312);final E[] constants = asEnum(enumClass).getEnumConstants();
        __CLR4_5_24tb4tblvha792a.R.inc(6313);Validate.isTrue(constants.length <= Long.SIZE, CANNOT_STORE_S_S_VALUES_IN_S_BITS, 
            Integer.valueOf(constants.length), enumClass.getSimpleName(), Integer.valueOf(Long.SIZE));

        __CLR4_5_24tb4tblvha792a.R.inc(6314);return enumClass;
    }finally{__CLR4_5_24tb4tblvha792a.R.flushNeeded();}}

    /**
     * Validate {@code enumClass}.
     * @param <E> the type of the enumeration
     * @param enumClass to check
     * @return {@code enumClass}
     * @throws NullPointerException if {@code enumClass} is {@code null}
     * @throws IllegalArgumentException if {@code enumClass} is not an enum class
     * @since 3.2
     */
    private static <E extends Enum<E>> Class<E> asEnum(final Class<E> enumClass) {try{__CLR4_5_24tb4tblvha792a.R.inc(6315);
        __CLR4_5_24tb4tblvha792a.R.inc(6316);Validate.notNull(enumClass, ENUM_CLASS_MUST_BE_DEFINED);
        __CLR4_5_24tb4tblvha792a.R.inc(6317);Validate.isTrue(enumClass.isEnum(), S_DOES_NOT_SEEM_TO_BE_AN_ENUM_TYPE, enumClass);
        __CLR4_5_24tb4tblvha792a.R.inc(6318);return enumClass;
    }finally{__CLR4_5_24tb4tblvha792a.R.flushNeeded();}}
}
