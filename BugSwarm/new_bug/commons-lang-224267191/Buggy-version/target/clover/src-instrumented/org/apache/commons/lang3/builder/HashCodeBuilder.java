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

package org.apache.commons.lang3.builder;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.Validate;

/**
 * <p>
 * Assists in implementing {@link Object#hashCode()} methods.
 * </p>
 *
 * <p>
 * This class enables a good <code>hashCode</code> method to be built for any class. It follows the rules laid out in
 * the book <a href="http://www.oracle.com/technetwork/java/effectivejava-136174.html">Effective Java</a> by Joshua Bloch. Writing a
 * good <code>hashCode</code> method is actually quite difficult. This class aims to simplify the process.
 * </p>
 *
 * <p>
 * The following is the approach taken. When appending a data field, the current total is multiplied by the
 * multiplier then a relevant value
 * for that data type is added. For example, if the current hashCode is 17, and the multiplier is 37, then
 * appending the integer 45 will create a hash code of 674, namely 17 * 37 + 45.
 * </p>
 *
 * <p>
 * All relevant fields from the object should be included in the <code>hashCode</code> method. Derived fields may be
 * excluded. In general, any field used in the <code>equals</code> method must be used in the <code>hashCode</code>
 * method.
 * </p>
 *
 * <p>
 * To use this class write code as follows:
 * </p>
 *
 * <pre>
 * public class Person {
 *   String name;
 *   int age;
 *   boolean smoker;
 *   ...
 *
 *   public int hashCode() {
 *     // you pick a hard-coded, randomly chosen, non-zero, odd number
 *     // ideally different for each class
 *     return new HashCodeBuilder(17, 37).
 *       append(name).
 *       append(age).
 *       append(smoker).
 *       toHashCode();
 *   }
 * }
 * </pre>
 *
 * <p>
 * If required, the superclass <code>hashCode()</code> can be added using {@link #appendSuper}.
 * </p>
 *
 * <p>
 * Alternatively, there is a method that uses reflection to determine the fields to test. Because these fields are
 * usually private, the method, <code>reflectionHashCode</code>, uses <code>AccessibleObject.setAccessible</code>
 * to change the visibility of the fields. This will fail under a security manager, unless the appropriate permissions
 * are set up correctly. It is also slower than testing explicitly.
 * </p>
 *
 * <p>
 * A typical invocation for this method would look like:
 * </p>
 *
 * <pre>
 * public int hashCode() {
 *   return HashCodeBuilder.reflectionHashCode(this);
 * }
 * </pre>
 * 
 * <p>The {@link HashCodeExclude} annotation can be used to exclude fields from being
 * used by the <code>reflectionHashCode</code> methods.</p>
 *
 * @since 1.0
 */
public class HashCodeBuilder implements Builder<Integer> {public static class __CLR4_5_29c19c1lvha7aa6{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172755542L,8589935092L,12318,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /**
     * The default initial value to use in reflection hash code building.
     */
    private static final int DEFAULT_INITIAL_VALUE = 17;
    
    /**
     * The default multiplier value to use in reflection hash code building.
     */
    private static final int DEFAULT_MULTIPLIER_VALUE = 37;
    
    /**
     * <p>
     * A registry of objects used by reflection methods to detect cyclical object references and avoid infinite loops.
     * </p>
     *
     * @since 2.3
     */
    private static final ThreadLocal<Set<IDKey>> REGISTRY = new ThreadLocal<>();

    /*
     * NOTE: we cannot store the actual objects in a HashSet, as that would use the very hashCode()
     * we are in the process of calculating.
     *
     * So we generate a one-to-one mapping from the original object to a new object.
     *
     * Now HashSet uses equals() to determine if two elements with the same hash code really
     * are equal, so we also need to ensure that the replacement objects are only equal
     * if the original objects are identical.
     *
     * The original implementation (2.4 and before) used the System.identityHashCode()
     * method - however this is not guaranteed to generate unique ids (e.g. LANG-459)
     *
     * We now use the IDKey helper class (adapted from org.apache.axis.utils.IDKey)
     * to disambiguate the duplicate ids.
     */

    /**
     * <p>
     * Returns the registry of objects being traversed by the reflection methods in the current thread.
     * </p>
     *
     * @return Set the registry of objects being traversed
     * @since 2.3
     */
    static Set<IDKey> getRegistry() {try{__CLR4_5_29c19c1lvha7aa6.R.inc(12097);
        __CLR4_5_29c19c1lvha7aa6.R.inc(12098);return REGISTRY.get();
    }finally{__CLR4_5_29c19c1lvha7aa6.R.flushNeeded();}}

    /**
     * <p>
     * Returns <code>true</code> if the registry contains the given object. Used by the reflection methods to avoid
     * infinite loops.
     * </p>
     *
     * @param value
     *            The object to lookup in the registry.
     * @return boolean <code>true</code> if the registry contains the given object.
     * @since 2.3
     */
    static boolean isRegistered(final Object value) {try{__CLR4_5_29c19c1lvha7aa6.R.inc(12099);
        __CLR4_5_29c19c1lvha7aa6.R.inc(12100);final Set<IDKey> registry = getRegistry();
        __CLR4_5_29c19c1lvha7aa6.R.inc(12101);return registry != null && registry.contains(new IDKey(value));
    }finally{__CLR4_5_29c19c1lvha7aa6.R.flushNeeded();}}

    /**
     * <p>
     * Appends the fields and values defined by the given object of the given <code>Class</code>.
     * </p>
     *
     * @param object
     *            the object to append details of
     * @param clazz
     *            the class to append details of
     * @param builder
     *            the builder to append to
     * @param useTransients
     *            whether to use transient fields
     * @param excludeFields
     *            Collection of String field names to exclude from use in calculation of hash code
     */
    private static void reflectionAppend(final Object object, final Class<?> clazz, final HashCodeBuilder builder, final boolean useTransients,
            final String[] excludeFields) {try{__CLR4_5_29c19c1lvha7aa6.R.inc(12102);
        __CLR4_5_29c19c1lvha7aa6.R.inc(12103);if ((((isRegistered(object))&&(__CLR4_5_29c19c1lvha7aa6.R.iget(12104)!=0|true))||(__CLR4_5_29c19c1lvha7aa6.R.iget(12105)==0&false))) {{
            __CLR4_5_29c19c1lvha7aa6.R.inc(12106);return;
        }
        }__CLR4_5_29c19c1lvha7aa6.R.inc(12107);try {
            __CLR4_5_29c19c1lvha7aa6.R.inc(12108);register(object);
            __CLR4_5_29c19c1lvha7aa6.R.inc(12109);final Field[] fields = clazz.getDeclaredFields();
            __CLR4_5_29c19c1lvha7aa6.R.inc(12110);AccessibleObject.setAccessible(fields, true);
            __CLR4_5_29c19c1lvha7aa6.R.inc(12111);for (final Field field : fields) {{
                __CLR4_5_29c19c1lvha7aa6.R.inc(12112);if ((((!ArrayUtils.contains(excludeFields, field.getName())
                    && !field.getName().contains("$")
                    && (useTransients || !Modifier.isTransient(field.getModifiers()))
                    && !Modifier.isStatic(field.getModifiers())
                    && !field.isAnnotationPresent(HashCodeExclude.class))&&(__CLR4_5_29c19c1lvha7aa6.R.iget(12113)!=0|true))||(__CLR4_5_29c19c1lvha7aa6.R.iget(12114)==0&false))) {{
                    __CLR4_5_29c19c1lvha7aa6.R.inc(12115);try {
                        __CLR4_5_29c19c1lvha7aa6.R.inc(12116);final Object fieldValue = field.get(object);
                        __CLR4_5_29c19c1lvha7aa6.R.inc(12117);builder.append(fieldValue);
                    } catch (final IllegalAccessException e) {
                        // this can't happen. Would get a Security exception instead
                        // throw a runtime exception in case the impossible happens.
                        __CLR4_5_29c19c1lvha7aa6.R.inc(12118);throw new InternalError("Unexpected IllegalAccessException");
                    }
                }
            }}
        }} finally {
            __CLR4_5_29c19c1lvha7aa6.R.inc(12119);unregister(object);
        }
    }finally{__CLR4_5_29c19c1lvha7aa6.R.flushNeeded();}}

    /**
     * <p>
     * Uses reflection to build a valid hash code from the fields of {@code object}.
     * </p>
     *
     * <p>
     * It uses <code>AccessibleObject.setAccessible</code> to gain access to private fields. This means that it will
     * throw a security exception if run under a security manager, if the permissions are not set up correctly. It is
     * also not as efficient as testing explicitly.
     * </p>
     *
     * <p>
     * Transient members will be not be used, as they are likely derived fields, and not part of the value of the
     * <code>Object</code>.
     * </p>
     *
     * <p>
     * Static fields will not be tested. Superclass fields will be included.
     * </p>
     *
     * <p>
     * Two randomly chosen, non-zero, odd numbers must be passed in. Ideally these should be different for each class,
     * however this is not vital. Prime numbers are preferred, especially for the multiplier.
     * </p>
     *
     * @param initialNonZeroOddNumber
     *            a non-zero, odd number used as the initial value. This will be the returned
     *            value if no fields are found to include in the hash code
     * @param multiplierNonZeroOddNumber
     *            a non-zero, odd number used as the multiplier
     * @param object
     *            the Object to create a <code>hashCode</code> for
     * @return int hash code
     * @throws IllegalArgumentException
     *             if the Object is <code>null</code>
     * @throws IllegalArgumentException
     *             if the number is zero or even
     *
     * @see HashCodeExclude
     */
    public static int reflectionHashCode(final int initialNonZeroOddNumber, final int multiplierNonZeroOddNumber, final Object object) {try{__CLR4_5_29c19c1lvha7aa6.R.inc(12120);
        __CLR4_5_29c19c1lvha7aa6.R.inc(12121);return reflectionHashCode(initialNonZeroOddNumber, multiplierNonZeroOddNumber, object, false, null);
    }finally{__CLR4_5_29c19c1lvha7aa6.R.flushNeeded();}}

    /**
     * <p>
     * Uses reflection to build a valid hash code from the fields of {@code object}.
     * </p>
     *
     * <p>
     * It uses <code>AccessibleObject.setAccessible</code> to gain access to private fields. This means that it will
     * throw a security exception if run under a security manager, if the permissions are not set up correctly. It is
     * also not as efficient as testing explicitly.
     * </p>
     *
     * <p>
     * If the TestTransients parameter is set to <code>true</code>, transient members will be tested, otherwise they
     * are ignored, as they are likely derived fields, and not part of the value of the <code>Object</code>.
     * </p>
     *
     * <p>
     * Static fields will not be tested. Superclass fields will be included.
     * </p>
     *
     * <p>
     * Two randomly chosen, non-zero, odd numbers must be passed in. Ideally these should be different for each class,
     * however this is not vital. Prime numbers are preferred, especially for the multiplier.
     * </p>
     *
     * @param initialNonZeroOddNumber
     *            a non-zero, odd number used as the initial value. This will be the returned
     *            value if no fields are found to include in the hash code
     * @param multiplierNonZeroOddNumber
     *            a non-zero, odd number used as the multiplier
     * @param object
     *            the Object to create a <code>hashCode</code> for
     * @param testTransients
     *            whether to include transient fields
     * @return int hash code
     * @throws IllegalArgumentException
     *             if the Object is <code>null</code>
     * @throws IllegalArgumentException
     *             if the number is zero or even
     *
     * @see HashCodeExclude
     */
    public static int reflectionHashCode(final int initialNonZeroOddNumber, final int multiplierNonZeroOddNumber, final Object object,
            final boolean testTransients) {try{__CLR4_5_29c19c1lvha7aa6.R.inc(12122);
        __CLR4_5_29c19c1lvha7aa6.R.inc(12123);return reflectionHashCode(initialNonZeroOddNumber, multiplierNonZeroOddNumber, object, testTransients, null);
    }finally{__CLR4_5_29c19c1lvha7aa6.R.flushNeeded();}}

    /**
     * <p>
     * Uses reflection to build a valid hash code from the fields of {@code object}.
     * </p>
     *
     * <p>
     * It uses <code>AccessibleObject.setAccessible</code> to gain access to private fields. This means that it will
     * throw a security exception if run under a security manager, if the permissions are not set up correctly. It is
     * also not as efficient as testing explicitly.
     * </p>
     *
     * <p>
     * If the TestTransients parameter is set to <code>true</code>, transient members will be tested, otherwise they
     * are ignored, as they are likely derived fields, and not part of the value of the <code>Object</code>.
     * </p>
     *
     * <p>
     * Static fields will not be included. Superclass fields will be included up to and including the specified
     * superclass. A null superclass is treated as java.lang.Object.
     * </p>
     *
     * <p>
     * Two randomly chosen, non-zero, odd numbers must be passed in. Ideally these should be different for each class,
     * however this is not vital. Prime numbers are preferred, especially for the multiplier.
     * </p>
     *
     * @param <T>
     *            the type of the object involved
     * @param initialNonZeroOddNumber
     *            a non-zero, odd number used as the initial value. This will be the returned
     *            value if no fields are found to include in the hash code
     * @param multiplierNonZeroOddNumber
     *            a non-zero, odd number used as the multiplier
     * @param object
     *            the Object to create a <code>hashCode</code> for
     * @param testTransients
     *            whether to include transient fields
     * @param reflectUpToClass
     *            the superclass to reflect up to (inclusive), may be <code>null</code>
     * @param excludeFields
     *            array of field names to exclude from use in calculation of hash code
     * @return int hash code
     * @throws IllegalArgumentException
     *             if the Object is <code>null</code>
     * @throws IllegalArgumentException
     *             if the number is zero or even
     *
     * @see HashCodeExclude
     * @since 2.0
     */
    public static <T> int reflectionHashCode(final int initialNonZeroOddNumber, final int multiplierNonZeroOddNumber, final T object,
            final boolean testTransients, final Class<? super T> reflectUpToClass, final String... excludeFields) {try{__CLR4_5_29c19c1lvha7aa6.R.inc(12124);
        __CLR4_5_29c19c1lvha7aa6.R.inc(12125);Validate.isTrue(object != null, "The object to build a hash code for must not be null");
        __CLR4_5_29c19c1lvha7aa6.R.inc(12126);final HashCodeBuilder builder = new HashCodeBuilder(initialNonZeroOddNumber, multiplierNonZeroOddNumber);
        __CLR4_5_29c19c1lvha7aa6.R.inc(12127);Class<?> clazz = object.getClass();
        __CLR4_5_29c19c1lvha7aa6.R.inc(12128);reflectionAppend(object, clazz, builder, testTransients, excludeFields);
        __CLR4_5_29c19c1lvha7aa6.R.inc(12129);while ((((clazz.getSuperclass() != null && clazz != reflectUpToClass)&&(__CLR4_5_29c19c1lvha7aa6.R.iget(12130)!=0|true))||(__CLR4_5_29c19c1lvha7aa6.R.iget(12131)==0&false))) {{
            __CLR4_5_29c19c1lvha7aa6.R.inc(12132);clazz = clazz.getSuperclass();
            __CLR4_5_29c19c1lvha7aa6.R.inc(12133);reflectionAppend(object, clazz, builder, testTransients, excludeFields);
        }
        }__CLR4_5_29c19c1lvha7aa6.R.inc(12134);return builder.toHashCode();
    }finally{__CLR4_5_29c19c1lvha7aa6.R.flushNeeded();}}

    /**
     * <p>
     * Uses reflection to build a valid hash code from the fields of {@code object}.
     * </p>
     *
     * <p>
     * This constructor uses two hard coded choices for the constants needed to build a hash code.
     * </p>
     *
     * <p>
     * It uses <code>AccessibleObject.setAccessible</code> to gain access to private fields. This means that it will
     * throw a security exception if run under a security manager, if the permissions are not set up correctly. It is
     * also not as efficient as testing explicitly.
     * </p>
     *
     * <P>
     * If the TestTransients parameter is set to <code>true</code>, transient members will be tested, otherwise they
     * are ignored, as they are likely derived fields, and not part of the value of the <code>Object</code>.
     * </p>
     *
     * <p>
     * Static fields will not be tested. Superclass fields will be included. If no fields are found to include
     * in the hash code, the result of this method will be constant.
     * </p>
     *
     * @param object
     *            the Object to create a <code>hashCode</code> for
     * @param testTransients
     *            whether to include transient fields
     * @return int hash code
     * @throws IllegalArgumentException
     *             if the object is <code>null</code>
     *
     * @see HashCodeExclude
     */
    public static int reflectionHashCode(final Object object, final boolean testTransients) {try{__CLR4_5_29c19c1lvha7aa6.R.inc(12135);
        __CLR4_5_29c19c1lvha7aa6.R.inc(12136);return reflectionHashCode(DEFAULT_INITIAL_VALUE, DEFAULT_MULTIPLIER_VALUE, object, 
                testTransients, null);
    }finally{__CLR4_5_29c19c1lvha7aa6.R.flushNeeded();}}

    /**
     * <p>
     * Uses reflection to build a valid hash code from the fields of {@code object}.
     * </p>
     *
     * <p>
     * This constructor uses two hard coded choices for the constants needed to build a hash code.
     * </p>
     *
     * <p>
     * It uses <code>AccessibleObject.setAccessible</code> to gain access to private fields. This means that it will
     * throw a security exception if run under a security manager, if the permissions are not set up correctly. It is
     * also not as efficient as testing explicitly.
     * </p>
     *
     * <p>
     * Transient members will be not be used, as they are likely derived fields, and not part of the value of the
     * <code>Object</code>.
     * </p>
     *
     * <p>
     * Static fields will not be tested. Superclass fields will be included. If no fields are found to include
     * in the hash code, the result of this method will be constant.
     * </p>
     *
     * @param object
     *            the Object to create a <code>hashCode</code> for
     * @param excludeFields
     *            Collection of String field names to exclude from use in calculation of hash code
     * @return int hash code
     * @throws IllegalArgumentException
     *             if the object is <code>null</code>
     *
     * @see HashCodeExclude
     */
    public static int reflectionHashCode(final Object object, final Collection<String> excludeFields) {try{__CLR4_5_29c19c1lvha7aa6.R.inc(12137);
        __CLR4_5_29c19c1lvha7aa6.R.inc(12138);return reflectionHashCode(object, ReflectionToStringBuilder.toNoNullStringArray(excludeFields));
    }finally{__CLR4_5_29c19c1lvha7aa6.R.flushNeeded();}}

    // -------------------------------------------------------------------------

    /**
     * <p>
     * Uses reflection to build a valid hash code from the fields of {@code object}.
     * </p>
     *
     * <p>
     * This constructor uses two hard coded choices for the constants needed to build a hash code.
     * </p>
     *
     * <p>
     * It uses <code>AccessibleObject.setAccessible</code> to gain access to private fields. This means that it will
     * throw a security exception if run under a security manager, if the permissions are not set up correctly. It is
     * also not as efficient as testing explicitly.
     * </p>
     *
     * <p>
     * Transient members will be not be used, as they are likely derived fields, and not part of the value of the
     * <code>Object</code>.
     * </p>
     *
     * <p>
     * Static fields will not be tested. Superclass fields will be included. If no fields are found to include
     * in the hash code, the result of this method will be constant.
     * </p>
     *
     * @param object
     *            the Object to create a <code>hashCode</code> for
     * @param excludeFields
     *            array of field names to exclude from use in calculation of hash code
     * @return int hash code
     * @throws IllegalArgumentException
     *             if the object is <code>null</code>
     *
     * @see HashCodeExclude
     */
    public static int reflectionHashCode(final Object object, final String... excludeFields) {try{__CLR4_5_29c19c1lvha7aa6.R.inc(12139);
        __CLR4_5_29c19c1lvha7aa6.R.inc(12140);return reflectionHashCode(DEFAULT_INITIAL_VALUE, DEFAULT_MULTIPLIER_VALUE, object, false, 
                null, excludeFields);
    }finally{__CLR4_5_29c19c1lvha7aa6.R.flushNeeded();}}

    /**
     * <p>
     * Registers the given object. Used by the reflection methods to avoid infinite loops.
     * </p>
     *
     * @param value
     *            The object to register.
     */
    private static void register(final Object value) {try{__CLR4_5_29c19c1lvha7aa6.R.inc(12141);
        __CLR4_5_29c19c1lvha7aa6.R.inc(12142);Set<IDKey> registry = getRegistry();
        __CLR4_5_29c19c1lvha7aa6.R.inc(12143);if ((((registry == null)&&(__CLR4_5_29c19c1lvha7aa6.R.iget(12144)!=0|true))||(__CLR4_5_29c19c1lvha7aa6.R.iget(12145)==0&false))) {{
            __CLR4_5_29c19c1lvha7aa6.R.inc(12146);registry = new HashSet<>();
            __CLR4_5_29c19c1lvha7aa6.R.inc(12147);REGISTRY.set(registry);
        }
        }__CLR4_5_29c19c1lvha7aa6.R.inc(12148);registry.add(new IDKey(value));
    }finally{__CLR4_5_29c19c1lvha7aa6.R.flushNeeded();}}

    /**
     * <p>
     * Unregisters the given object.
     * </p>
     *
     * <p>
     * Used by the reflection methods to avoid infinite loops.
     *
     * @param value
     *            The object to unregister.
     * @since 2.3
     */
    private static void unregister(final Object value) {try{__CLR4_5_29c19c1lvha7aa6.R.inc(12149);
        __CLR4_5_29c19c1lvha7aa6.R.inc(12150);final Set<IDKey> registry = getRegistry();
        __CLR4_5_29c19c1lvha7aa6.R.inc(12151);if ((((registry != null)&&(__CLR4_5_29c19c1lvha7aa6.R.iget(12152)!=0|true))||(__CLR4_5_29c19c1lvha7aa6.R.iget(12153)==0&false))) {{
            __CLR4_5_29c19c1lvha7aa6.R.inc(12154);registry.remove(new IDKey(value));
            __CLR4_5_29c19c1lvha7aa6.R.inc(12155);if ((((registry.isEmpty())&&(__CLR4_5_29c19c1lvha7aa6.R.iget(12156)!=0|true))||(__CLR4_5_29c19c1lvha7aa6.R.iget(12157)==0&false))) {{
                __CLR4_5_29c19c1lvha7aa6.R.inc(12158);REGISTRY.remove();
            }
        }}
    }}finally{__CLR4_5_29c19c1lvha7aa6.R.flushNeeded();}}

    /**
     * Constant to use in building the hashCode.
     */
    private final int iConstant;

    /**
     * Running total of the hashCode.
     */
    private int iTotal = 0;

    /**
     * <p>
     * Uses two hard coded choices for the constants needed to build a <code>hashCode</code>.
     * </p>
     */
    public HashCodeBuilder() {try{__CLR4_5_29c19c1lvha7aa6.R.inc(12159);
        __CLR4_5_29c19c1lvha7aa6.R.inc(12160);iConstant = 37;
        __CLR4_5_29c19c1lvha7aa6.R.inc(12161);iTotal = 17;
    }finally{__CLR4_5_29c19c1lvha7aa6.R.flushNeeded();}}

    /**
     * <p>
     * Two randomly chosen, odd numbers must be passed in. Ideally these should be different for each class,
     * however this is not vital.
     * </p>
     *
     * <p>
     * Prime numbers are preferred, especially for the multiplier.
     * </p>
     *
     * @param initialOddNumber
     *            an odd number used as the initial value
     * @param multiplierOddNumber
     *            an odd number used as the multiplier
     * @throws IllegalArgumentException
     *             if the number is even
     */
    public HashCodeBuilder(final int initialOddNumber, final int multiplierOddNumber) {try{__CLR4_5_29c19c1lvha7aa6.R.inc(12162);
        __CLR4_5_29c19c1lvha7aa6.R.inc(12163);Validate.isTrue(initialOddNumber % 2 != 0, "HashCodeBuilder requires an odd initial value");
        __CLR4_5_29c19c1lvha7aa6.R.inc(12164);Validate.isTrue(multiplierOddNumber % 2 != 0, "HashCodeBuilder requires an odd multiplier");
        __CLR4_5_29c19c1lvha7aa6.R.inc(12165);iConstant = multiplierOddNumber;
        __CLR4_5_29c19c1lvha7aa6.R.inc(12166);iTotal = initialOddNumber;
    }finally{__CLR4_5_29c19c1lvha7aa6.R.flushNeeded();}}

    /**
     * <p>
     * Append a <code>hashCode</code> for a <code>boolean</code>.
     * </p>
     * <p>
     * This adds <code>1</code> when true, and <code>0</code> when false to the <code>hashCode</code>.
     * </p>
     * <p>
     * This is in contrast to the standard <code>java.lang.Boolean.hashCode</code> handling, which computes
     * a <code>hashCode</code> value of <code>1231</code> for <code>java.lang.Boolean</code> instances
     * that represent <code>true</code> or <code>1237</code> for <code>java.lang.Boolean</code> instances
     * that represent <code>false</code>.
     * </p>
     * <p>
     * This is in accordance with the <i>Effective Java</i> design.
     * </p>
     *
     * @param value
     *            the boolean to add to the <code>hashCode</code>
     * @return this
     */
    public HashCodeBuilder append(final boolean value) {try{__CLR4_5_29c19c1lvha7aa6.R.inc(12167);
        __CLR4_5_29c19c1lvha7aa6.R.inc(12168);iTotal = iTotal * iConstant + ((((value )&&(__CLR4_5_29c19c1lvha7aa6.R.iget(12169)!=0|true))||(__CLR4_5_29c19c1lvha7aa6.R.iget(12170)==0&false))? 0 : 1);
        __CLR4_5_29c19c1lvha7aa6.R.inc(12171);return this;
    }finally{__CLR4_5_29c19c1lvha7aa6.R.flushNeeded();}}

    /**
     * <p>
     * Append a <code>hashCode</code> for a <code>boolean</code> array.
     * </p>
     *
     * @param array
     *            the array to add to the <code>hashCode</code>
     * @return this
     */
    public HashCodeBuilder append(final boolean[] array) {try{__CLR4_5_29c19c1lvha7aa6.R.inc(12172);
        __CLR4_5_29c19c1lvha7aa6.R.inc(12173);if ((((array == null)&&(__CLR4_5_29c19c1lvha7aa6.R.iget(12174)!=0|true))||(__CLR4_5_29c19c1lvha7aa6.R.iget(12175)==0&false))) {{
            __CLR4_5_29c19c1lvha7aa6.R.inc(12176);iTotal = iTotal * iConstant;
        } }else {{
            __CLR4_5_29c19c1lvha7aa6.R.inc(12177);for (final boolean element : array) {{
                __CLR4_5_29c19c1lvha7aa6.R.inc(12178);append(element);
            }
        }}
        }__CLR4_5_29c19c1lvha7aa6.R.inc(12179);return this;
    }finally{__CLR4_5_29c19c1lvha7aa6.R.flushNeeded();}}

    // -------------------------------------------------------------------------

    /**
     * <p>
     * Append a <code>hashCode</code> for a <code>byte</code>.
     * </p>
     *
     * @param value
     *            the byte to add to the <code>hashCode</code>
     * @return this
     */
    public HashCodeBuilder append(final byte value) {try{__CLR4_5_29c19c1lvha7aa6.R.inc(12180);
        __CLR4_5_29c19c1lvha7aa6.R.inc(12181);iTotal = iTotal * iConstant + value;
        __CLR4_5_29c19c1lvha7aa6.R.inc(12182);return this;
    }finally{__CLR4_5_29c19c1lvha7aa6.R.flushNeeded();}}

    // -------------------------------------------------------------------------

    /**
     * <p>
     * Append a <code>hashCode</code> for a <code>byte</code> array.
     * </p>
     *
     * @param array
     *            the array to add to the <code>hashCode</code>
     * @return this
     */
    public HashCodeBuilder append(final byte[] array) {try{__CLR4_5_29c19c1lvha7aa6.R.inc(12183);
        __CLR4_5_29c19c1lvha7aa6.R.inc(12184);if ((((array == null)&&(__CLR4_5_29c19c1lvha7aa6.R.iget(12185)!=0|true))||(__CLR4_5_29c19c1lvha7aa6.R.iget(12186)==0&false))) {{
            __CLR4_5_29c19c1lvha7aa6.R.inc(12187);iTotal = iTotal * iConstant;
        } }else {{
            __CLR4_5_29c19c1lvha7aa6.R.inc(12188);for (final byte element : array) {{
                __CLR4_5_29c19c1lvha7aa6.R.inc(12189);append(element);
            }
        }}
        }__CLR4_5_29c19c1lvha7aa6.R.inc(12190);return this;
    }finally{__CLR4_5_29c19c1lvha7aa6.R.flushNeeded();}}

    /**
     * <p>
     * Append a <code>hashCode</code> for a <code>char</code>.
     * </p>
     *
     * @param value
     *            the char to add to the <code>hashCode</code>
     * @return this
     */
    public HashCodeBuilder append(final char value) {try{__CLR4_5_29c19c1lvha7aa6.R.inc(12191);
        __CLR4_5_29c19c1lvha7aa6.R.inc(12192);iTotal = iTotal * iConstant + value;
        __CLR4_5_29c19c1lvha7aa6.R.inc(12193);return this;
    }finally{__CLR4_5_29c19c1lvha7aa6.R.flushNeeded();}}

    /**
     * <p>
     * Append a <code>hashCode</code> for a <code>char</code> array.
     * </p>
     *
     * @param array
     *            the array to add to the <code>hashCode</code>
     * @return this
     */
    public HashCodeBuilder append(final char[] array) {try{__CLR4_5_29c19c1lvha7aa6.R.inc(12194);
        __CLR4_5_29c19c1lvha7aa6.R.inc(12195);if ((((array == null)&&(__CLR4_5_29c19c1lvha7aa6.R.iget(12196)!=0|true))||(__CLR4_5_29c19c1lvha7aa6.R.iget(12197)==0&false))) {{
            __CLR4_5_29c19c1lvha7aa6.R.inc(12198);iTotal = iTotal * iConstant;
        } }else {{
            __CLR4_5_29c19c1lvha7aa6.R.inc(12199);for (final char element : array) {{
                __CLR4_5_29c19c1lvha7aa6.R.inc(12200);append(element);
            }
        }}
        }__CLR4_5_29c19c1lvha7aa6.R.inc(12201);return this;
    }finally{__CLR4_5_29c19c1lvha7aa6.R.flushNeeded();}}

    /**
     * <p>
     * Append a <code>hashCode</code> for a <code>double</code>.
     * </p>
     *
     * @param value
     *            the double to add to the <code>hashCode</code>
     * @return this
     */
    public HashCodeBuilder append(final double value) {try{__CLR4_5_29c19c1lvha7aa6.R.inc(12202);
        __CLR4_5_29c19c1lvha7aa6.R.inc(12203);return append(Double.doubleToLongBits(value));
    }finally{__CLR4_5_29c19c1lvha7aa6.R.flushNeeded();}}

    /**
     * <p>
     * Append a <code>hashCode</code> for a <code>double</code> array.
     * </p>
     *
     * @param array
     *            the array to add to the <code>hashCode</code>
     * @return this
     */
    public HashCodeBuilder append(final double[] array) {try{__CLR4_5_29c19c1lvha7aa6.R.inc(12204);
        __CLR4_5_29c19c1lvha7aa6.R.inc(12205);if ((((array == null)&&(__CLR4_5_29c19c1lvha7aa6.R.iget(12206)!=0|true))||(__CLR4_5_29c19c1lvha7aa6.R.iget(12207)==0&false))) {{
            __CLR4_5_29c19c1lvha7aa6.R.inc(12208);iTotal = iTotal * iConstant;
        } }else {{
            __CLR4_5_29c19c1lvha7aa6.R.inc(12209);for (final double element : array) {{
                __CLR4_5_29c19c1lvha7aa6.R.inc(12210);append(element);
            }
        }}
        }__CLR4_5_29c19c1lvha7aa6.R.inc(12211);return this;
    }finally{__CLR4_5_29c19c1lvha7aa6.R.flushNeeded();}}

    /**
     * <p>
     * Append a <code>hashCode</code> for a <code>float</code>.
     * </p>
     *
     * @param value
     *            the float to add to the <code>hashCode</code>
     * @return this
     */
    public HashCodeBuilder append(final float value) {try{__CLR4_5_29c19c1lvha7aa6.R.inc(12212);
        __CLR4_5_29c19c1lvha7aa6.R.inc(12213);iTotal = iTotal * iConstant + Float.floatToIntBits(value);
        __CLR4_5_29c19c1lvha7aa6.R.inc(12214);return this;
    }finally{__CLR4_5_29c19c1lvha7aa6.R.flushNeeded();}}

    /**
     * <p>
     * Append a <code>hashCode</code> for a <code>float</code> array.
     * </p>
     *
     * @param array
     *            the array to add to the <code>hashCode</code>
     * @return this
     */
    public HashCodeBuilder append(final float[] array) {try{__CLR4_5_29c19c1lvha7aa6.R.inc(12215);
        __CLR4_5_29c19c1lvha7aa6.R.inc(12216);if ((((array == null)&&(__CLR4_5_29c19c1lvha7aa6.R.iget(12217)!=0|true))||(__CLR4_5_29c19c1lvha7aa6.R.iget(12218)==0&false))) {{
            __CLR4_5_29c19c1lvha7aa6.R.inc(12219);iTotal = iTotal * iConstant;
        } }else {{
            __CLR4_5_29c19c1lvha7aa6.R.inc(12220);for (final float element : array) {{
                __CLR4_5_29c19c1lvha7aa6.R.inc(12221);append(element);
            }
        }}
        }__CLR4_5_29c19c1lvha7aa6.R.inc(12222);return this;
    }finally{__CLR4_5_29c19c1lvha7aa6.R.flushNeeded();}}

    /**
     * <p>
     * Append a <code>hashCode</code> for an <code>int</code>.
     * </p>
     *
     * @param value
     *            the int to add to the <code>hashCode</code>
     * @return this
     */
    public HashCodeBuilder append(final int value) {try{__CLR4_5_29c19c1lvha7aa6.R.inc(12223);
        __CLR4_5_29c19c1lvha7aa6.R.inc(12224);iTotal = iTotal * iConstant + value;
        __CLR4_5_29c19c1lvha7aa6.R.inc(12225);return this;
    }finally{__CLR4_5_29c19c1lvha7aa6.R.flushNeeded();}}

    /**
     * <p>
     * Append a <code>hashCode</code> for an <code>int</code> array.
     * </p>
     *
     * @param array
     *            the array to add to the <code>hashCode</code>
     * @return this
     */
    public HashCodeBuilder append(final int[] array) {try{__CLR4_5_29c19c1lvha7aa6.R.inc(12226);
        __CLR4_5_29c19c1lvha7aa6.R.inc(12227);if ((((array == null)&&(__CLR4_5_29c19c1lvha7aa6.R.iget(12228)!=0|true))||(__CLR4_5_29c19c1lvha7aa6.R.iget(12229)==0&false))) {{
            __CLR4_5_29c19c1lvha7aa6.R.inc(12230);iTotal = iTotal * iConstant;
        } }else {{
            __CLR4_5_29c19c1lvha7aa6.R.inc(12231);for (final int element : array) {{
                __CLR4_5_29c19c1lvha7aa6.R.inc(12232);append(element);
            }
        }}
        }__CLR4_5_29c19c1lvha7aa6.R.inc(12233);return this;
    }finally{__CLR4_5_29c19c1lvha7aa6.R.flushNeeded();}}

    /**
     * <p>
     * Append a <code>hashCode</code> for a <code>long</code>.
     * </p>
     *
     * @param value
     *            the long to add to the <code>hashCode</code>
     * @return this
     */
    // NOTE: This method uses >> and not >>> as Effective Java and
    //       Long.hashCode do. Ideally we should switch to >>> at
    //       some stage. There are backwards compat issues, so
    //       that will have to wait for the time being. cf LANG-342.
    public HashCodeBuilder append(final long value) {try{__CLR4_5_29c19c1lvha7aa6.R.inc(12234);
        __CLR4_5_29c19c1lvha7aa6.R.inc(12235);iTotal = iTotal * iConstant + ((int) (value ^ (value >> 32)));
        __CLR4_5_29c19c1lvha7aa6.R.inc(12236);return this;
    }finally{__CLR4_5_29c19c1lvha7aa6.R.flushNeeded();}}

    /**
     * <p>
     * Append a <code>hashCode</code> for a <code>long</code> array.
     * </p>
     *
     * @param array
     *            the array to add to the <code>hashCode</code>
     * @return this
     */
    public HashCodeBuilder append(final long[] array) {try{__CLR4_5_29c19c1lvha7aa6.R.inc(12237);
        __CLR4_5_29c19c1lvha7aa6.R.inc(12238);if ((((array == null)&&(__CLR4_5_29c19c1lvha7aa6.R.iget(12239)!=0|true))||(__CLR4_5_29c19c1lvha7aa6.R.iget(12240)==0&false))) {{
            __CLR4_5_29c19c1lvha7aa6.R.inc(12241);iTotal = iTotal * iConstant;
        } }else {{
            __CLR4_5_29c19c1lvha7aa6.R.inc(12242);for (final long element : array) {{
                __CLR4_5_29c19c1lvha7aa6.R.inc(12243);append(element);
            }
        }}
        }__CLR4_5_29c19c1lvha7aa6.R.inc(12244);return this;
    }finally{__CLR4_5_29c19c1lvha7aa6.R.flushNeeded();}}

    /**
     * <p>
     * Append a <code>hashCode</code> for an <code>Object</code>.
     * </p>
     *
     * @param object
     *            the Object to add to the <code>hashCode</code>
     * @return this
     */
    public HashCodeBuilder append(final Object object) {try{__CLR4_5_29c19c1lvha7aa6.R.inc(12245);
        __CLR4_5_29c19c1lvha7aa6.R.inc(12246);if ((((object == null)&&(__CLR4_5_29c19c1lvha7aa6.R.iget(12247)!=0|true))||(__CLR4_5_29c19c1lvha7aa6.R.iget(12248)==0&false))) {{
            __CLR4_5_29c19c1lvha7aa6.R.inc(12249);iTotal = iTotal * iConstant;

        } }else {{
            __CLR4_5_29c19c1lvha7aa6.R.inc(12250);if ((((object.getClass().isArray())&&(__CLR4_5_29c19c1lvha7aa6.R.iget(12251)!=0|true))||(__CLR4_5_29c19c1lvha7aa6.R.iget(12252)==0&false))) {{
                // factor out array case in order to keep method small enough
                // to be inlined
                __CLR4_5_29c19c1lvha7aa6.R.inc(12253);appendArray(object);
            } }else {{
                __CLR4_5_29c19c1lvha7aa6.R.inc(12254);iTotal = iTotal * iConstant + object.hashCode();
            }
        }}
        }__CLR4_5_29c19c1lvha7aa6.R.inc(12255);return this;
    }finally{__CLR4_5_29c19c1lvha7aa6.R.flushNeeded();}}

    /**
     * <p>
     * Append a <code>hashCode</code> for an array.
     * </p>
     *
     * @param object
     *            the array to add to the <code>hashCode</code>
     */
    private void appendArray(final Object object) {try{__CLR4_5_29c19c1lvha7aa6.R.inc(12256);
        // 'Switch' on type of array, to dispatch to the correct handler
        // This handles multi dimensional arrays
        __CLR4_5_29c19c1lvha7aa6.R.inc(12257);if ((((object instanceof long[])&&(__CLR4_5_29c19c1lvha7aa6.R.iget(12258)!=0|true))||(__CLR4_5_29c19c1lvha7aa6.R.iget(12259)==0&false))) {{
            __CLR4_5_29c19c1lvha7aa6.R.inc(12260);append((long[]) object);
        } }else {__CLR4_5_29c19c1lvha7aa6.R.inc(12261);if ((((object instanceof int[])&&(__CLR4_5_29c19c1lvha7aa6.R.iget(12262)!=0|true))||(__CLR4_5_29c19c1lvha7aa6.R.iget(12263)==0&false))) {{
            __CLR4_5_29c19c1lvha7aa6.R.inc(12264);append((int[]) object);
        } }else {__CLR4_5_29c19c1lvha7aa6.R.inc(12265);if ((((object instanceof short[])&&(__CLR4_5_29c19c1lvha7aa6.R.iget(12266)!=0|true))||(__CLR4_5_29c19c1lvha7aa6.R.iget(12267)==0&false))) {{
            __CLR4_5_29c19c1lvha7aa6.R.inc(12268);append((short[]) object);
        } }else {__CLR4_5_29c19c1lvha7aa6.R.inc(12269);if ((((object instanceof char[])&&(__CLR4_5_29c19c1lvha7aa6.R.iget(12270)!=0|true))||(__CLR4_5_29c19c1lvha7aa6.R.iget(12271)==0&false))) {{
            __CLR4_5_29c19c1lvha7aa6.R.inc(12272);append((char[]) object);
        } }else {__CLR4_5_29c19c1lvha7aa6.R.inc(12273);if ((((object instanceof byte[])&&(__CLR4_5_29c19c1lvha7aa6.R.iget(12274)!=0|true))||(__CLR4_5_29c19c1lvha7aa6.R.iget(12275)==0&false))) {{
            __CLR4_5_29c19c1lvha7aa6.R.inc(12276);append((byte[]) object);
        } }else {__CLR4_5_29c19c1lvha7aa6.R.inc(12277);if ((((object instanceof double[])&&(__CLR4_5_29c19c1lvha7aa6.R.iget(12278)!=0|true))||(__CLR4_5_29c19c1lvha7aa6.R.iget(12279)==0&false))) {{
            __CLR4_5_29c19c1lvha7aa6.R.inc(12280);append((double[]) object);
        } }else {__CLR4_5_29c19c1lvha7aa6.R.inc(12281);if ((((object instanceof float[])&&(__CLR4_5_29c19c1lvha7aa6.R.iget(12282)!=0|true))||(__CLR4_5_29c19c1lvha7aa6.R.iget(12283)==0&false))) {{
            __CLR4_5_29c19c1lvha7aa6.R.inc(12284);append((float[]) object);
        } }else {__CLR4_5_29c19c1lvha7aa6.R.inc(12285);if ((((object instanceof boolean[])&&(__CLR4_5_29c19c1lvha7aa6.R.iget(12286)!=0|true))||(__CLR4_5_29c19c1lvha7aa6.R.iget(12287)==0&false))) {{
            __CLR4_5_29c19c1lvha7aa6.R.inc(12288);append((boolean[]) object);
        } }else {{
            // Not an array of primitives
            __CLR4_5_29c19c1lvha7aa6.R.inc(12289);append((Object[]) object);
        }
    }}}}}}}}}finally{__CLR4_5_29c19c1lvha7aa6.R.flushNeeded();}}

    /**
     * <p>
     * Append a <code>hashCode</code> for an <code>Object</code> array.
     * </p>
     *
     * @param array
     *            the array to add to the <code>hashCode</code>
     * @return this
     */
    public HashCodeBuilder append(final Object[] array) {try{__CLR4_5_29c19c1lvha7aa6.R.inc(12290);
        __CLR4_5_29c19c1lvha7aa6.R.inc(12291);if ((((array == null)&&(__CLR4_5_29c19c1lvha7aa6.R.iget(12292)!=0|true))||(__CLR4_5_29c19c1lvha7aa6.R.iget(12293)==0&false))) {{
            __CLR4_5_29c19c1lvha7aa6.R.inc(12294);iTotal = iTotal * iConstant;
        } }else {{
            __CLR4_5_29c19c1lvha7aa6.R.inc(12295);for (final Object element : array) {{
                __CLR4_5_29c19c1lvha7aa6.R.inc(12296);append(element);
            }
        }}
        }__CLR4_5_29c19c1lvha7aa6.R.inc(12297);return this;
    }finally{__CLR4_5_29c19c1lvha7aa6.R.flushNeeded();}}

    /**
     * <p>
     * Append a <code>hashCode</code> for a <code>short</code>.
     * </p>
     *
     * @param value
     *            the short to add to the <code>hashCode</code>
     * @return this
     */
    public HashCodeBuilder append(final short value) {try{__CLR4_5_29c19c1lvha7aa6.R.inc(12298);
        __CLR4_5_29c19c1lvha7aa6.R.inc(12299);iTotal = iTotal * iConstant + value;
        __CLR4_5_29c19c1lvha7aa6.R.inc(12300);return this;
    }finally{__CLR4_5_29c19c1lvha7aa6.R.flushNeeded();}}

    /**
     * <p>
     * Append a <code>hashCode</code> for a <code>short</code> array.
     * </p>
     *
     * @param array
     *            the array to add to the <code>hashCode</code>
     * @return this
     */
    public HashCodeBuilder append(final short[] array) {try{__CLR4_5_29c19c1lvha7aa6.R.inc(12301);
        __CLR4_5_29c19c1lvha7aa6.R.inc(12302);if ((((array == null)&&(__CLR4_5_29c19c1lvha7aa6.R.iget(12303)!=0|true))||(__CLR4_5_29c19c1lvha7aa6.R.iget(12304)==0&false))) {{
            __CLR4_5_29c19c1lvha7aa6.R.inc(12305);iTotal = iTotal * iConstant;
        } }else {{
            __CLR4_5_29c19c1lvha7aa6.R.inc(12306);for (final short element : array) {{
                __CLR4_5_29c19c1lvha7aa6.R.inc(12307);append(element);
            }
        }}
        }__CLR4_5_29c19c1lvha7aa6.R.inc(12308);return this;
    }finally{__CLR4_5_29c19c1lvha7aa6.R.flushNeeded();}}

    /**
     * <p>
     * Adds the result of super.hashCode() to this builder.
     * </p>
     *
     * @param superHashCode
     *            the result of calling <code>super.hashCode()</code>
     * @return this HashCodeBuilder, used to chain calls.
     * @since 2.0
     */
    public HashCodeBuilder appendSuper(final int superHashCode) {try{__CLR4_5_29c19c1lvha7aa6.R.inc(12309);
        __CLR4_5_29c19c1lvha7aa6.R.inc(12310);iTotal = iTotal * iConstant + superHashCode;
        __CLR4_5_29c19c1lvha7aa6.R.inc(12311);return this;
    }finally{__CLR4_5_29c19c1lvha7aa6.R.flushNeeded();}}

    /**
     * <p>
     * Return the computed <code>hashCode</code>.
     * </p>
     *
     * @return <code>hashCode</code> based on the fields appended
     */
    public int toHashCode() {try{__CLR4_5_29c19c1lvha7aa6.R.inc(12312);
        __CLR4_5_29c19c1lvha7aa6.R.inc(12313);return iTotal;
    }finally{__CLR4_5_29c19c1lvha7aa6.R.flushNeeded();}}

    /**
     * Returns the computed <code>hashCode</code>.
     *
     * @return <code>hashCode</code> based on the fields appended
     *
     * @since 3.0
     */
    @Override
    public Integer build() {try{__CLR4_5_29c19c1lvha7aa6.R.inc(12314);
        __CLR4_5_29c19c1lvha7aa6.R.inc(12315);return Integer.valueOf(toHashCode());
    }finally{__CLR4_5_29c19c1lvha7aa6.R.flushNeeded();}}

    /**
     * <p>
     * The computed <code>hashCode</code> from toHashCode() is returned due to the likelihood
     * of bugs in mis-calling toHashCode() and the unlikeliness of it mattering what the hashCode for
     * HashCodeBuilder itself is.</p>
     *
     * @return <code>hashCode</code> based on the fields appended
     * @since 2.5
     */
    @Override
    public int hashCode() {try{__CLR4_5_29c19c1lvha7aa6.R.inc(12316);
        __CLR4_5_29c19c1lvha7aa6.R.inc(12317);return toHashCode();
    }finally{__CLR4_5_29c19c1lvha7aa6.R.flushNeeded();}}

}
