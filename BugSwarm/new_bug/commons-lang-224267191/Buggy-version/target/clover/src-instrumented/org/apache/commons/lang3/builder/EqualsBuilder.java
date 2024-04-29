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
import org.apache.commons.lang3.ClassUtils;
import org.apache.commons.lang3.tuple.Pair;

/**
 * <p>Assists in implementing {@link Object#equals(Object)} methods.</p>
 *
 * <p> This class provides methods to build a good equals method for any
 * class. It follows rules laid out in
 * <a href="http://www.oracle.com/technetwork/java/effectivejava-136174.html">Effective Java</a>
 * , by Joshua Bloch. In particular the rule for comparing <code>doubles</code>,
 * <code>floats</code>, and arrays can be tricky. Also, making sure that
 * <code>equals()</code> and <code>hashCode()</code> are consistent can be
 * difficult.</p>
 *
 * <p>Two Objects that compare as equals must generate the same hash code,
 * but two Objects with the same hash code do not have to be equal.</p>
 *
 * <p>All relevant fields should be included in the calculation of equals.
 * Derived fields may be ignored. In particular, any field used in
 * generating a hash code must be used in the equals method, and vice
 * versa.</p>
 *
 * <p>Typical use for the code is as follows:</p>
 * <pre>
 * public boolean equals(Object obj) {
 *   if (obj == null) { return false; }
 *   if (obj == this) { return true; }
 *   if (obj.getClass() != getClass()) {
 *     return false;
 *   }
 *   MyClass rhs = (MyClass) obj;
 *   return new EqualsBuilder()
 *                 .appendSuper(super.equals(obj))
 *                 .append(field1, rhs.field1)
 *                 .append(field2, rhs.field2)
 *                 .append(field3, rhs.field3)
 *                 .isEquals();
 *  }
 * </pre>
 *
 * <p> Alternatively, there is a method that uses reflection to determine
 * the fields to test. Because these fields are usually private, the method,
 * <code>reflectionEquals</code>, uses <code>AccessibleObject.setAccessible</code> to
 * change the visibility of the fields. This will fail under a security
 * manager, unless the appropriate permissions are set up correctly. It is
 * also slower than testing explicitly.  Non-primitive fields are compared using 
 * <code>equals()</code>.</p>
 *
 * <p> A typical invocation for this method would look like:</p>
 * <pre>
 * public boolean equals(Object obj) {
 *   return EqualsBuilder.reflectionEquals(this, obj);
 * }
 * </pre>
 * 
 * <p>The {@link EqualsExclude} annotation can be used to exclude fields from being
 * used by the <code>reflectionEquals</code> methods.</p>
 *
 * @since 1.0
 */
public class EqualsBuilder implements Builder<Boolean> {public static class __CLR4_5_28yq8yqlvha7a99{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172755542L,8589935092L,12097,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * <p>
     * A registry of objects used by reflection methods to detect cyclical object references and avoid infinite loops.
     * </p>
     *
     * @since 3.0
     */
    private static final ThreadLocal<Set<Pair<IDKey, IDKey>>> REGISTRY = new ThreadLocal<>();

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
     * Returns the registry of object pairs being traversed by the reflection
     * methods in the current thread.
     * </p>
     *
     * @return Set the registry of objects being traversed
     * @since 3.0
     */
    static Set<Pair<IDKey, IDKey>> getRegistry() {try{__CLR4_5_28yq8yqlvha7a99.R.inc(11618);
        __CLR4_5_28yq8yqlvha7a99.R.inc(11619);return REGISTRY.get();
    }finally{__CLR4_5_28yq8yqlvha7a99.R.flushNeeded();}}

    /**
     * <p>
     * Converters value pair into a register pair.
     * </p>
     *
     * @param lhs <code>this</code> object
     * @param rhs the other object
     *
     * @return the pair
     */
    static Pair<IDKey, IDKey> getRegisterPair(final Object lhs, final Object rhs) {try{__CLR4_5_28yq8yqlvha7a99.R.inc(11620);
        __CLR4_5_28yq8yqlvha7a99.R.inc(11621);final IDKey left = new IDKey(lhs);
        __CLR4_5_28yq8yqlvha7a99.R.inc(11622);final IDKey right = new IDKey(rhs);
        __CLR4_5_28yq8yqlvha7a99.R.inc(11623);return Pair.of(left, right);
    }finally{__CLR4_5_28yq8yqlvha7a99.R.flushNeeded();}}

    /**
     * <p>
     * Returns <code>true</code> if the registry contains the given object pair.
     * Used by the reflection methods to avoid infinite loops.
     * Objects might be swapped therefore a check is needed if the object pair
     * is registered in given or swapped order.
     * </p>
     *
     * @param lhs <code>this</code> object to lookup in registry
     * @param rhs the other object to lookup on registry
     * @return boolean <code>true</code> if the registry contains the given object.
     * @since 3.0
     */
    static boolean isRegistered(final Object lhs, final Object rhs) {try{__CLR4_5_28yq8yqlvha7a99.R.inc(11624);
        __CLR4_5_28yq8yqlvha7a99.R.inc(11625);final Set<Pair<IDKey, IDKey>> registry = getRegistry();
        __CLR4_5_28yq8yqlvha7a99.R.inc(11626);final Pair<IDKey, IDKey> pair = getRegisterPair(lhs, rhs);
        __CLR4_5_28yq8yqlvha7a99.R.inc(11627);final Pair<IDKey, IDKey> swappedPair = Pair.of(pair.getLeft(), pair.getRight());

        __CLR4_5_28yq8yqlvha7a99.R.inc(11628);return registry != null
                && (registry.contains(pair) || registry.contains(swappedPair));
    }finally{__CLR4_5_28yq8yqlvha7a99.R.flushNeeded();}}

    /**
     * <p>
     * Registers the given object pair.
     * Used by the reflection methods to avoid infinite loops.
     * </p>
     *
     * @param lhs <code>this</code> object to register
     * @param rhs the other object to register
     */
    private static void register(final Object lhs, final Object rhs) {try{__CLR4_5_28yq8yqlvha7a99.R.inc(11629);
        __CLR4_5_28yq8yqlvha7a99.R.inc(11630);Set<Pair<IDKey, IDKey>> registry = getRegistry();
        __CLR4_5_28yq8yqlvha7a99.R.inc(11631);if ((((registry == null)&&(__CLR4_5_28yq8yqlvha7a99.R.iget(11632)!=0|true))||(__CLR4_5_28yq8yqlvha7a99.R.iget(11633)==0&false))) {{
            __CLR4_5_28yq8yqlvha7a99.R.inc(11634);registry = new HashSet<>();
            __CLR4_5_28yq8yqlvha7a99.R.inc(11635);REGISTRY.set(registry);
        }
        }__CLR4_5_28yq8yqlvha7a99.R.inc(11636);final Pair<IDKey, IDKey> pair = getRegisterPair(lhs, rhs);
        __CLR4_5_28yq8yqlvha7a99.R.inc(11637);registry.add(pair);
    }finally{__CLR4_5_28yq8yqlvha7a99.R.flushNeeded();}}

    /**
     * <p>
     * Unregisters the given object pair.
     * </p>
     *
     * <p>
     * Used by the reflection methods to avoid infinite loops.
     *
     * @param lhs <code>this</code> object to unregister
     * @param rhs the other object to unregister
     * @since 3.0
     */
    private static void unregister(final Object lhs, final Object rhs) {try{__CLR4_5_28yq8yqlvha7a99.R.inc(11638);
        __CLR4_5_28yq8yqlvha7a99.R.inc(11639);final Set<Pair<IDKey, IDKey>> registry = getRegistry();
        __CLR4_5_28yq8yqlvha7a99.R.inc(11640);if ((((registry != null)&&(__CLR4_5_28yq8yqlvha7a99.R.iget(11641)!=0|true))||(__CLR4_5_28yq8yqlvha7a99.R.iget(11642)==0&false))) {{
            __CLR4_5_28yq8yqlvha7a99.R.inc(11643);final Pair<IDKey, IDKey> pair = getRegisterPair(lhs, rhs);
            __CLR4_5_28yq8yqlvha7a99.R.inc(11644);registry.remove(pair);
            __CLR4_5_28yq8yqlvha7a99.R.inc(11645);if ((((registry.isEmpty())&&(__CLR4_5_28yq8yqlvha7a99.R.iget(11646)!=0|true))||(__CLR4_5_28yq8yqlvha7a99.R.iget(11647)==0&false))) {{
                __CLR4_5_28yq8yqlvha7a99.R.inc(11648);REGISTRY.remove();
            }
        }}
    }}finally{__CLR4_5_28yq8yqlvha7a99.R.flushNeeded();}}

    /**
     * If the fields tested are equals.
     * The default value is <code>true</code>.
     */
    private boolean isEquals = true;

    private boolean testTransients = false;
    private boolean testRecursive = false;
    private Class<?> reflectUpToClass = null;
    private String[] excludeFields = null;

    /**
     * <p>Constructor for EqualsBuilder.</p>
     *
     * <p>Starts off assuming that equals is <code>true</code>.</p>
     * @see Object#equals(Object)
     */
    public EqualsBuilder() {try{__CLR4_5_28yq8yqlvha7a99.R.inc(11649);
        // do nothing for now.
    }finally{__CLR4_5_28yq8yqlvha7a99.R.flushNeeded();}}

    //-------------------------------------------------------------------------

    /**
     * Set whether to include transient fields when reflectively comparing objects.
     * @param testTransients whether to test transient fields
     * @return EqualsBuilder - used to chain calls.
     * @since 3.6
     */
    public EqualsBuilder setTestTransients(final boolean testTransients) {try{__CLR4_5_28yq8yqlvha7a99.R.inc(11650);
        __CLR4_5_28yq8yqlvha7a99.R.inc(11651);this.testTransients = testTransients;
        __CLR4_5_28yq8yqlvha7a99.R.inc(11652);return this;
    }finally{__CLR4_5_28yq8yqlvha7a99.R.flushNeeded();}}

    /**
     * Set whether to include transient fields when reflectively comparing objects.
     * @param testRecursive  whether to do a recursive test
     * @return EqualsBuilder - used to chain calls.
     * @since 3.6
     */
    public EqualsBuilder setTestRecursive(final boolean testRecursive) {try{__CLR4_5_28yq8yqlvha7a99.R.inc(11653);
        __CLR4_5_28yq8yqlvha7a99.R.inc(11654);this.testRecursive = testRecursive;
        __CLR4_5_28yq8yqlvha7a99.R.inc(11655);return this;
    }finally{__CLR4_5_28yq8yqlvha7a99.R.flushNeeded();}}

    /**
     * Set the superclass to reflect up to at reflective tests.
     * @param reflectUpToClass the super class to reflect up to
     * @return EqualsBuilder - used to chain calls.
     * @since 3.6
     */
    public EqualsBuilder setReflectUpToClass(final Class<?> reflectUpToClass) {try{__CLR4_5_28yq8yqlvha7a99.R.inc(11656);
        __CLR4_5_28yq8yqlvha7a99.R.inc(11657);this.reflectUpToClass = reflectUpToClass;
        __CLR4_5_28yq8yqlvha7a99.R.inc(11658);return this;
    }finally{__CLR4_5_28yq8yqlvha7a99.R.flushNeeded();}}

    /**
     * Set field names to be excluded by reflection tests.
     * @param excludeFields the fields to exclude
     * @return EqualsBuilder - used to chain calls.
     * @since 3.6
     */
    public EqualsBuilder setExcludeFields(final String... excludeFields) {try{__CLR4_5_28yq8yqlvha7a99.R.inc(11659);
        __CLR4_5_28yq8yqlvha7a99.R.inc(11660);this.excludeFields = excludeFields;
        __CLR4_5_28yq8yqlvha7a99.R.inc(11661);return this;
    }finally{__CLR4_5_28yq8yqlvha7a99.R.flushNeeded();}}
    

    /**
     * <p>This method uses reflection to determine if the two <code>Object</code>s
     * are equal.</p>
     *
     * <p>It uses <code>AccessibleObject.setAccessible</code> to gain access to private
     * fields. This means that it will throw a security exception if run under
     * a security manager, if the permissions are not set up correctly. It is also
     * not as efficient as testing explicitly. Non-primitive fields are compared using 
     * <code>equals()</code>.</p>
     * 
     * <p>Transient members will be not be tested, as they are likely derived
     * fields, and not part of the value of the Object.</p>
     *
     * <p>Static fields will not be tested. Superclass fields will be included.</p>
     *
     * @param lhs  <code>this</code> object
     * @param rhs  the other object
     * @param excludeFields  Collection of String field names to exclude from testing
     * @return <code>true</code> if the two Objects have tested equals.
     * 
     * @see EqualsExclude
     */
    public static boolean reflectionEquals(final Object lhs, final Object rhs, final Collection<String> excludeFields) {try{__CLR4_5_28yq8yqlvha7a99.R.inc(11662);
        __CLR4_5_28yq8yqlvha7a99.R.inc(11663);return reflectionEquals(lhs, rhs, ReflectionToStringBuilder.toNoNullStringArray(excludeFields));
    }finally{__CLR4_5_28yq8yqlvha7a99.R.flushNeeded();}}

    /**
     * <p>This method uses reflection to determine if the two <code>Object</code>s
     * are equal.</p>
     *
     * <p>It uses <code>AccessibleObject.setAccessible</code> to gain access to private
     * fields. This means that it will throw a security exception if run under
     * a security manager, if the permissions are not set up correctly. It is also
     * not as efficient as testing explicitly. Non-primitive fields are compared using 
     * <code>equals()</code>.</p>
     *
     * <p>Transient members will be not be tested, as they are likely derived
     * fields, and not part of the value of the Object.</p>
     *
     * <p>Static fields will not be tested. Superclass fields will be included.</p>
     *
     * @param lhs  <code>this</code> object
     * @param rhs  the other object
     * @param excludeFields  array of field names to exclude from testing
     * @return <code>true</code> if the two Objects have tested equals.
     * 
     * @see EqualsExclude
     */
    public static boolean reflectionEquals(final Object lhs, final Object rhs, final String... excludeFields) {try{__CLR4_5_28yq8yqlvha7a99.R.inc(11664);
        __CLR4_5_28yq8yqlvha7a99.R.inc(11665);return reflectionEquals(lhs, rhs, false, null, excludeFields);
    }finally{__CLR4_5_28yq8yqlvha7a99.R.flushNeeded();}}

    /**
     * <p>This method uses reflection to determine if the two <code>Object</code>s
     * are equal.</p>
     *
     * <p>It uses <code>AccessibleObject.setAccessible</code> to gain access to private
     * fields. This means that it will throw a security exception if run under
     * a security manager, if the permissions are not set up correctly. It is also
     * not as efficient as testing explicitly. Non-primitive fields are compared using 
     * <code>equals()</code>.</p>
     *
     * <p>If the TestTransients parameter is set to <code>true</code>, transient
     * members will be tested, otherwise they are ignored, as they are likely
     * derived fields, and not part of the value of the <code>Object</code>.</p>
     *
     * <p>Static fields will not be tested. Superclass fields will be included.</p>
     *
     * @param lhs  <code>this</code> object
     * @param rhs  the other object
     * @param testTransients  whether to include transient fields
     * @return <code>true</code> if the two Objects have tested equals.
     * 
     * @see EqualsExclude
     */
    public static boolean reflectionEquals(final Object lhs, final Object rhs, final boolean testTransients) {try{__CLR4_5_28yq8yqlvha7a99.R.inc(11666);
        __CLR4_5_28yq8yqlvha7a99.R.inc(11667);return reflectionEquals(lhs, rhs, testTransients, null);
    }finally{__CLR4_5_28yq8yqlvha7a99.R.flushNeeded();}}

    /**
     * <p>This method uses reflection to determine if the two <code>Object</code>s
     * are equal.</p>
     *
     * <p>It uses <code>AccessibleObject.setAccessible</code> to gain access to private
     * fields. This means that it will throw a security exception if run under
     * a security manager, if the permissions are not set up correctly. It is also
     * not as efficient as testing explicitly. Non-primitive fields are compared using 
     * <code>equals()</code>.</p>
     *
     * <p>If the testTransients parameter is set to <code>true</code>, transient
     * members will be tested, otherwise they are ignored, as they are likely
     * derived fields, and not part of the value of the <code>Object</code>.</p>
     *
     * <p>Static fields will not be included. Superclass fields will be appended
     * up to and including the specified superclass. A null superclass is treated
     * as java.lang.Object.</p>
     *
     * @param lhs  <code>this</code> object
     * @param rhs  the other object
     * @param testTransients  whether to include transient fields
     * @param reflectUpToClass  the superclass to reflect up to (inclusive),
     *  may be <code>null</code>
     * @param excludeFields  array of field names to exclude from testing
     * @return <code>true</code> if the two Objects have tested equals.
     * 
     * @see EqualsExclude
     * @since 2.0
     */
    public static boolean reflectionEquals(final Object lhs, final Object rhs, final boolean testTransients, final Class<?> reflectUpToClass,
            final String... excludeFields) {try{__CLR4_5_28yq8yqlvha7a99.R.inc(11668);
        __CLR4_5_28yq8yqlvha7a99.R.inc(11669);return reflectionEquals(lhs, rhs, testTransients, reflectUpToClass, false, excludeFields);
    }finally{__CLR4_5_28yq8yqlvha7a99.R.flushNeeded();}}
    
    /**
     * <p>This method uses reflection to determine if the two <code>Object</code>s
     * are equal.</p>
     *
     * <p>It uses <code>AccessibleObject.setAccessible</code> to gain access to private
     * fields. This means that it will throw a security exception if run under
     * a security manager, if the permissions are not set up correctly. It is also
     * not as efficient as testing explicitly. Non-primitive fields are compared using
     * <code>equals()</code>.</p>
     *
     * <p>If the testTransients parameter is set to <code>true</code>, transient
     * members will be tested, otherwise they are ignored, as they are likely
     * derived fields, and not part of the value of the <code>Object</code>.</p>
     *
     * <p>Static fields will not be included. Superclass fields will be appended
     * up to and including the specified superclass. A null superclass is treated
     * as java.lang.Object.</p>
     * 
     * <p>If the testRecursive parameter is set to <code>true</code>, non primitive
     * (and non primitive wrapper) field types will be compared by 
     * <code>EqualsBuilder</code> recursively instead of invoking their 
     * <code>equals()</code> method. Leading to a deep reflection equals test.
     *
     * @param lhs  <code>this</code> object
     * @param rhs  the other object
     * @param testTransients  whether to include transient fields
     * @param reflectUpToClass  the superclass to reflect up to (inclusive),
     *  may be <code>null</code>
     * @param testRecursive  whether to call reflection equals on non primitive
     *  fields recursively. 
     * @param excludeFields  array of field names to exclude from testing
     * @return <code>true</code> if the two Objects have tested equals.
     * 
     * @see EqualsExclude
     * @since 3.6
     */
    public static boolean reflectionEquals(final Object lhs, final Object rhs, final boolean testTransients, final Class<?> reflectUpToClass,
            final boolean testRecursive, final String... excludeFields) {try{__CLR4_5_28yq8yqlvha7a99.R.inc(11670);
        __CLR4_5_28yq8yqlvha7a99.R.inc(11671);if ((((lhs == rhs)&&(__CLR4_5_28yq8yqlvha7a99.R.iget(11672)!=0|true))||(__CLR4_5_28yq8yqlvha7a99.R.iget(11673)==0&false))) {{
            __CLR4_5_28yq8yqlvha7a99.R.inc(11674);return true;
        }
        }__CLR4_5_28yq8yqlvha7a99.R.inc(11675);if ((((lhs == null || rhs == null)&&(__CLR4_5_28yq8yqlvha7a99.R.iget(11676)!=0|true))||(__CLR4_5_28yq8yqlvha7a99.R.iget(11677)==0&false))) {{
            __CLR4_5_28yq8yqlvha7a99.R.inc(11678);return false;
        }
        }__CLR4_5_28yq8yqlvha7a99.R.inc(11679);return new EqualsBuilder()
                    .setExcludeFields(excludeFields)
                    .setReflectUpToClass(reflectUpToClass)
                    .setTestTransients(testTransients)
                    .setTestRecursive(testRecursive)
                    .reflectionAppend(lhs, rhs)
                    .isEquals();
    }finally{__CLR4_5_28yq8yqlvha7a99.R.flushNeeded();}}
    
    /**
     * <p>Tests if two <code>objects</code> by using reflection.</p>
     * 
     * <p>It uses <code>AccessibleObject.setAccessible</code> to gain access to private
     * fields. This means that it will throw a security exception if run under
     * a security manager, if the permissions are not set up correctly. It is also
     * not as efficient as testing explicitly. Non-primitive fields are compared using 
     * <code>equals()</code>.</p>
     * 
     * <p>If the testTransients field is set to <code>true</code>, transient
     * members will be tested, otherwise they are ignored, as they are likely
     * derived fields, and not part of the value of the <code>Object</code>.</p>
     *
     * <p>Static fields will not be included. Superclass fields will be appended
     * up to and including the specified superclass in field <code>reflectUpToClass</code>.
     * A null superclass is treated as java.lang.Object.</p>
     * 
     * <p>Field names listed in field <code>excludeFields</code> will be ignored.</p>
     * 
     * @param lhs  the left hand object
     * @param rhs  the left hand object
     * @return EqualsBuilder - used to chain calls.
     */
    public EqualsBuilder reflectionAppend(final Object lhs, final Object rhs) {try{__CLR4_5_28yq8yqlvha7a99.R.inc(11680);
        __CLR4_5_28yq8yqlvha7a99.R.inc(11681);if ((((!isEquals)&&(__CLR4_5_28yq8yqlvha7a99.R.iget(11682)!=0|true))||(__CLR4_5_28yq8yqlvha7a99.R.iget(11683)==0&false))) {{
            __CLR4_5_28yq8yqlvha7a99.R.inc(11684);return this;
        }
        }__CLR4_5_28yq8yqlvha7a99.R.inc(11685);if ((((lhs == rhs)&&(__CLR4_5_28yq8yqlvha7a99.R.iget(11686)!=0|true))||(__CLR4_5_28yq8yqlvha7a99.R.iget(11687)==0&false))) {{
            __CLR4_5_28yq8yqlvha7a99.R.inc(11688);return this;
        }
        }__CLR4_5_28yq8yqlvha7a99.R.inc(11689);if ((((lhs == null || rhs == null)&&(__CLR4_5_28yq8yqlvha7a99.R.iget(11690)!=0|true))||(__CLR4_5_28yq8yqlvha7a99.R.iget(11691)==0&false))) {{
            __CLR4_5_28yq8yqlvha7a99.R.inc(11692);isEquals = false;
            __CLR4_5_28yq8yqlvha7a99.R.inc(11693);return this;
        }

        // Find the leaf class since there may be transients in the leaf
        // class or in classes between the leaf and root.
        // If we are not testing transients or a subclass has no ivars,
        // then a subclass can test equals to a superclass.
        }__CLR4_5_28yq8yqlvha7a99.R.inc(11694);final Class<?> lhsClass = lhs.getClass();
        __CLR4_5_28yq8yqlvha7a99.R.inc(11695);final Class<?> rhsClass = rhs.getClass();
        __CLR4_5_28yq8yqlvha7a99.R.inc(11696);Class<?> testClass;
        __CLR4_5_28yq8yqlvha7a99.R.inc(11697);if ((((lhsClass.isInstance(rhs))&&(__CLR4_5_28yq8yqlvha7a99.R.iget(11698)!=0|true))||(__CLR4_5_28yq8yqlvha7a99.R.iget(11699)==0&false))) {{
            __CLR4_5_28yq8yqlvha7a99.R.inc(11700);testClass = lhsClass;
            __CLR4_5_28yq8yqlvha7a99.R.inc(11701);if ((((!rhsClass.isInstance(lhs))&&(__CLR4_5_28yq8yqlvha7a99.R.iget(11702)!=0|true))||(__CLR4_5_28yq8yqlvha7a99.R.iget(11703)==0&false))) {{
                // rhsClass is a subclass of lhsClass
                __CLR4_5_28yq8yqlvha7a99.R.inc(11704);testClass = rhsClass;
            }
        }} }else {__CLR4_5_28yq8yqlvha7a99.R.inc(11705);if ((((rhsClass.isInstance(lhs))&&(__CLR4_5_28yq8yqlvha7a99.R.iget(11706)!=0|true))||(__CLR4_5_28yq8yqlvha7a99.R.iget(11707)==0&false))) {{
            __CLR4_5_28yq8yqlvha7a99.R.inc(11708);testClass = rhsClass;
            __CLR4_5_28yq8yqlvha7a99.R.inc(11709);if ((((!lhsClass.isInstance(rhs))&&(__CLR4_5_28yq8yqlvha7a99.R.iget(11710)!=0|true))||(__CLR4_5_28yq8yqlvha7a99.R.iget(11711)==0&false))) {{
                // lhsClass is a subclass of rhsClass
                __CLR4_5_28yq8yqlvha7a99.R.inc(11712);testClass = lhsClass;
            }
        }} }else {{
            // The two classes are not related.
            __CLR4_5_28yq8yqlvha7a99.R.inc(11713);isEquals = false;
            __CLR4_5_28yq8yqlvha7a99.R.inc(11714);return this;
        }

        }}__CLR4_5_28yq8yqlvha7a99.R.inc(11715);try {
            __CLR4_5_28yq8yqlvha7a99.R.inc(11716);if ((((testClass.isArray())&&(__CLR4_5_28yq8yqlvha7a99.R.iget(11717)!=0|true))||(__CLR4_5_28yq8yqlvha7a99.R.iget(11718)==0&false))) {{
                __CLR4_5_28yq8yqlvha7a99.R.inc(11719);append(lhs, rhs);
            } }else {{
                __CLR4_5_28yq8yqlvha7a99.R.inc(11720);reflectionAppend(lhs, rhs, testClass);
                __CLR4_5_28yq8yqlvha7a99.R.inc(11721);while ((((testClass.getSuperclass() != null && testClass != reflectUpToClass)&&(__CLR4_5_28yq8yqlvha7a99.R.iget(11722)!=0|true))||(__CLR4_5_28yq8yqlvha7a99.R.iget(11723)==0&false))) {{
                    __CLR4_5_28yq8yqlvha7a99.R.inc(11724);testClass = testClass.getSuperclass();
                    __CLR4_5_28yq8yqlvha7a99.R.inc(11725);reflectionAppend(lhs, rhs, testClass);
                }
            }}
        }} catch (final IllegalArgumentException e) {
            // In this case, we tried to test a subclass vs. a superclass and
            // the subclass has ivars or the ivars are transient and
            // we are testing transients.
            // If a subclass has ivars that we are trying to test them, we get an
            // exception and we know that the objects are not equal.
            __CLR4_5_28yq8yqlvha7a99.R.inc(11726);isEquals = false;
            __CLR4_5_28yq8yqlvha7a99.R.inc(11727);return this;
        }
        __CLR4_5_28yq8yqlvha7a99.R.inc(11728);return this;
    }finally{__CLR4_5_28yq8yqlvha7a99.R.flushNeeded();}}

    /**
     * <p>Appends the fields and values defined by the given object of the
     * given Class.</p>
     *
     * @param lhs  the left hand object
     * @param rhs  the right hand object
     * @param clazz  the class to append details of
     */
    private void reflectionAppend(
        final Object lhs,
        final Object rhs,
        final Class<?> clazz) {try{__CLR4_5_28yq8yqlvha7a99.R.inc(11729);

        __CLR4_5_28yq8yqlvha7a99.R.inc(11730);if ((((isRegistered(lhs, rhs))&&(__CLR4_5_28yq8yqlvha7a99.R.iget(11731)!=0|true))||(__CLR4_5_28yq8yqlvha7a99.R.iget(11732)==0&false))) {{
            __CLR4_5_28yq8yqlvha7a99.R.inc(11733);return;
        }

        }__CLR4_5_28yq8yqlvha7a99.R.inc(11734);try {
            __CLR4_5_28yq8yqlvha7a99.R.inc(11735);register(lhs, rhs);
            __CLR4_5_28yq8yqlvha7a99.R.inc(11736);final Field[] fields = clazz.getDeclaredFields();
            __CLR4_5_28yq8yqlvha7a99.R.inc(11737);AccessibleObject.setAccessible(fields, true);
            __CLR4_5_28yq8yqlvha7a99.R.inc(11738);for (int i = 0; (((i < fields.length && isEquals)&&(__CLR4_5_28yq8yqlvha7a99.R.iget(11739)!=0|true))||(__CLR4_5_28yq8yqlvha7a99.R.iget(11740)==0&false)); i++) {{
                __CLR4_5_28yq8yqlvha7a99.R.inc(11741);final Field f = fields[i];
                __CLR4_5_28yq8yqlvha7a99.R.inc(11742);if ((((!ArrayUtils.contains(excludeFields, f.getName())
                    && !f.getName().contains("$")
                    && (testTransients || !Modifier.isTransient(f.getModifiers()))
                    && !Modifier.isStatic(f.getModifiers())
                    && !f.isAnnotationPresent(EqualsExclude.class))&&(__CLR4_5_28yq8yqlvha7a99.R.iget(11743)!=0|true))||(__CLR4_5_28yq8yqlvha7a99.R.iget(11744)==0&false))) {{
                    __CLR4_5_28yq8yqlvha7a99.R.inc(11745);try {
                        __CLR4_5_28yq8yqlvha7a99.R.inc(11746);append(f.get(lhs), f.get(rhs));
                    } catch (final IllegalAccessException e) {
                        //this can't happen. Would get a Security exception instead
                        //throw a runtime exception in case the impossible happens.
                        __CLR4_5_28yq8yqlvha7a99.R.inc(11747);throw new InternalError("Unexpected IllegalAccessException");
                    }
                }
            }}
        }} finally {
            __CLR4_5_28yq8yqlvha7a99.R.inc(11748);unregister(lhs, rhs);
        }
    }finally{__CLR4_5_28yq8yqlvha7a99.R.flushNeeded();}}

    //-------------------------------------------------------------------------

    /**
     * <p>Adds the result of <code>super.equals()</code> to this builder.</p>
     *
     * @param superEquals  the result of calling <code>super.equals()</code>
     * @return EqualsBuilder - used to chain calls.
     * @since 2.0
     */
    public EqualsBuilder appendSuper(final boolean superEquals) {try{__CLR4_5_28yq8yqlvha7a99.R.inc(11749);
        __CLR4_5_28yq8yqlvha7a99.R.inc(11750);if ((((!isEquals)&&(__CLR4_5_28yq8yqlvha7a99.R.iget(11751)!=0|true))||(__CLR4_5_28yq8yqlvha7a99.R.iget(11752)==0&false))) {{
            __CLR4_5_28yq8yqlvha7a99.R.inc(11753);return this;
        }
        }__CLR4_5_28yq8yqlvha7a99.R.inc(11754);isEquals = superEquals;
        __CLR4_5_28yq8yqlvha7a99.R.inc(11755);return this;
    }finally{__CLR4_5_28yq8yqlvha7a99.R.flushNeeded();}}

    //-------------------------------------------------------------------------

    /**
     * <p>Test if two <code>Object</code>s are equal using either 
     * #{@link #reflectionAppend(Object, Object)}, if object are non
     * primitives (or wrapper of primitives) or if field <code>testRecursive</code> 
     * is set to <code>false</code>. Otherwise, using their 
     * <code>equals</code> method.</p>
     *
     * @param lhs  the left hand object
     * @param rhs  the right hand object
     * @return EqualsBuilder - used to chain calls.
     */
    public EqualsBuilder append(final Object lhs, final Object rhs) {try{__CLR4_5_28yq8yqlvha7a99.R.inc(11756);
        __CLR4_5_28yq8yqlvha7a99.R.inc(11757);if ((((!isEquals)&&(__CLR4_5_28yq8yqlvha7a99.R.iget(11758)!=0|true))||(__CLR4_5_28yq8yqlvha7a99.R.iget(11759)==0&false))) {{
            __CLR4_5_28yq8yqlvha7a99.R.inc(11760);return this;
        }
        }__CLR4_5_28yq8yqlvha7a99.R.inc(11761);if ((((lhs == rhs)&&(__CLR4_5_28yq8yqlvha7a99.R.iget(11762)!=0|true))||(__CLR4_5_28yq8yqlvha7a99.R.iget(11763)==0&false))) {{
            __CLR4_5_28yq8yqlvha7a99.R.inc(11764);return this;
        }
        }__CLR4_5_28yq8yqlvha7a99.R.inc(11765);if ((((lhs == null || rhs == null)&&(__CLR4_5_28yq8yqlvha7a99.R.iget(11766)!=0|true))||(__CLR4_5_28yq8yqlvha7a99.R.iget(11767)==0&false))) {{
            __CLR4_5_28yq8yqlvha7a99.R.inc(11768);this.setEquals(false);
            __CLR4_5_28yq8yqlvha7a99.R.inc(11769);return this;
        }
        }__CLR4_5_28yq8yqlvha7a99.R.inc(11770);final Class<?> lhsClass = lhs.getClass();
        __CLR4_5_28yq8yqlvha7a99.R.inc(11771);if ((((!lhsClass.isArray())&&(__CLR4_5_28yq8yqlvha7a99.R.iget(11772)!=0|true))||(__CLR4_5_28yq8yqlvha7a99.R.iget(11773)==0&false))) {{
            // The simple case, not an array, just test the element
            __CLR4_5_28yq8yqlvha7a99.R.inc(11774);if ((((testRecursive && !ClassUtils.isPrimitiveOrWrapper(lhsClass))&&(__CLR4_5_28yq8yqlvha7a99.R.iget(11775)!=0|true))||(__CLR4_5_28yq8yqlvha7a99.R.iget(11776)==0&false))) {{
                __CLR4_5_28yq8yqlvha7a99.R.inc(11777);reflectionAppend(lhs, rhs);
            } }else {{
                __CLR4_5_28yq8yqlvha7a99.R.inc(11778);isEquals = lhs.equals(rhs);
            }
        }} }else {{
            // factor out array case in order to keep method small enough
            // to be inlined
            __CLR4_5_28yq8yqlvha7a99.R.inc(11779);appendArray(lhs, rhs);
        }
        }__CLR4_5_28yq8yqlvha7a99.R.inc(11780);return this;
    }finally{__CLR4_5_28yq8yqlvha7a99.R.flushNeeded();}}

    /**
     * <p>Test if an <code>Object</code> is equal to an array.</p>
     *
     * @param lhs  the left hand object, an array
     * @param rhs  the right hand object
     */
    private void appendArray(final Object lhs, final Object rhs) {try{__CLR4_5_28yq8yqlvha7a99.R.inc(11781);
        __CLR4_5_28yq8yqlvha7a99.R.inc(11782);if ((((lhs.getClass() != rhs.getClass())&&(__CLR4_5_28yq8yqlvha7a99.R.iget(11783)!=0|true))||(__CLR4_5_28yq8yqlvha7a99.R.iget(11784)==0&false))) {{
            // Here when we compare different dimensions, for example: a boolean[][] to a boolean[]
            __CLR4_5_28yq8yqlvha7a99.R.inc(11785);this.setEquals(false);
        }
        // 'Switch' on type of array, to dispatch to the correct handler
        // This handles multi dimensional arrays of the same depth
        }else {__CLR4_5_28yq8yqlvha7a99.R.inc(11786);if ((((lhs instanceof long[])&&(__CLR4_5_28yq8yqlvha7a99.R.iget(11787)!=0|true))||(__CLR4_5_28yq8yqlvha7a99.R.iget(11788)==0&false))) {{
            __CLR4_5_28yq8yqlvha7a99.R.inc(11789);append((long[]) lhs, (long[]) rhs);
        } }else {__CLR4_5_28yq8yqlvha7a99.R.inc(11790);if ((((lhs instanceof int[])&&(__CLR4_5_28yq8yqlvha7a99.R.iget(11791)!=0|true))||(__CLR4_5_28yq8yqlvha7a99.R.iget(11792)==0&false))) {{
            __CLR4_5_28yq8yqlvha7a99.R.inc(11793);append((int[]) lhs, (int[]) rhs);
        } }else {__CLR4_5_28yq8yqlvha7a99.R.inc(11794);if ((((lhs instanceof short[])&&(__CLR4_5_28yq8yqlvha7a99.R.iget(11795)!=0|true))||(__CLR4_5_28yq8yqlvha7a99.R.iget(11796)==0&false))) {{
            __CLR4_5_28yq8yqlvha7a99.R.inc(11797);append((short[]) lhs, (short[]) rhs);
        } }else {__CLR4_5_28yq8yqlvha7a99.R.inc(11798);if ((((lhs instanceof char[])&&(__CLR4_5_28yq8yqlvha7a99.R.iget(11799)!=0|true))||(__CLR4_5_28yq8yqlvha7a99.R.iget(11800)==0&false))) {{
            __CLR4_5_28yq8yqlvha7a99.R.inc(11801);append((char[]) lhs, (char[]) rhs);
        } }else {__CLR4_5_28yq8yqlvha7a99.R.inc(11802);if ((((lhs instanceof byte[])&&(__CLR4_5_28yq8yqlvha7a99.R.iget(11803)!=0|true))||(__CLR4_5_28yq8yqlvha7a99.R.iget(11804)==0&false))) {{
            __CLR4_5_28yq8yqlvha7a99.R.inc(11805);append((byte[]) lhs, (byte[]) rhs);
        } }else {__CLR4_5_28yq8yqlvha7a99.R.inc(11806);if ((((lhs instanceof double[])&&(__CLR4_5_28yq8yqlvha7a99.R.iget(11807)!=0|true))||(__CLR4_5_28yq8yqlvha7a99.R.iget(11808)==0&false))) {{
            __CLR4_5_28yq8yqlvha7a99.R.inc(11809);append((double[]) lhs, (double[]) rhs);
        } }else {__CLR4_5_28yq8yqlvha7a99.R.inc(11810);if ((((lhs instanceof float[])&&(__CLR4_5_28yq8yqlvha7a99.R.iget(11811)!=0|true))||(__CLR4_5_28yq8yqlvha7a99.R.iget(11812)==0&false))) {{
            __CLR4_5_28yq8yqlvha7a99.R.inc(11813);append((float[]) lhs, (float[]) rhs);
        } }else {__CLR4_5_28yq8yqlvha7a99.R.inc(11814);if ((((lhs instanceof boolean[])&&(__CLR4_5_28yq8yqlvha7a99.R.iget(11815)!=0|true))||(__CLR4_5_28yq8yqlvha7a99.R.iget(11816)==0&false))) {{
            __CLR4_5_28yq8yqlvha7a99.R.inc(11817);append((boolean[]) lhs, (boolean[]) rhs);
        } }else {{
            // Not an array of primitives
            __CLR4_5_28yq8yqlvha7a99.R.inc(11818);append((Object[]) lhs, (Object[]) rhs);
        }
    }}}}}}}}}}finally{__CLR4_5_28yq8yqlvha7a99.R.flushNeeded();}}

    /**
     * <p>
     * Test if two <code>long</code> s are equal.
     * </p>
     *
     * @param lhs
     *                  the left hand <code>long</code>
     * @param rhs
     *                  the right hand <code>long</code>
     * @return EqualsBuilder - used to chain calls.
     */
    public EqualsBuilder append(final long lhs, final long rhs) {try{__CLR4_5_28yq8yqlvha7a99.R.inc(11819);
        __CLR4_5_28yq8yqlvha7a99.R.inc(11820);if ((((!isEquals)&&(__CLR4_5_28yq8yqlvha7a99.R.iget(11821)!=0|true))||(__CLR4_5_28yq8yqlvha7a99.R.iget(11822)==0&false))) {{
            __CLR4_5_28yq8yqlvha7a99.R.inc(11823);return this;
        }
        }__CLR4_5_28yq8yqlvha7a99.R.inc(11824);isEquals = lhs == rhs;
        __CLR4_5_28yq8yqlvha7a99.R.inc(11825);return this;
    }finally{__CLR4_5_28yq8yqlvha7a99.R.flushNeeded();}}

    /**
     * <p>Test if two <code>int</code>s are equal.</p>
     *
     * @param lhs  the left hand <code>int</code>
     * @param rhs  the right hand <code>int</code>
     * @return EqualsBuilder - used to chain calls.
     */
    public EqualsBuilder append(final int lhs, final int rhs) {try{__CLR4_5_28yq8yqlvha7a99.R.inc(11826);
        __CLR4_5_28yq8yqlvha7a99.R.inc(11827);if ((((!isEquals)&&(__CLR4_5_28yq8yqlvha7a99.R.iget(11828)!=0|true))||(__CLR4_5_28yq8yqlvha7a99.R.iget(11829)==0&false))) {{
            __CLR4_5_28yq8yqlvha7a99.R.inc(11830);return this;
        }
        }__CLR4_5_28yq8yqlvha7a99.R.inc(11831);isEquals = lhs == rhs;
        __CLR4_5_28yq8yqlvha7a99.R.inc(11832);return this;
    }finally{__CLR4_5_28yq8yqlvha7a99.R.flushNeeded();}}

    /**
     * <p>Test if two <code>short</code>s are equal.</p>
     *
     * @param lhs  the left hand <code>short</code>
     * @param rhs  the right hand <code>short</code>
     * @return EqualsBuilder - used to chain calls.
     */
    public EqualsBuilder append(final short lhs, final short rhs) {try{__CLR4_5_28yq8yqlvha7a99.R.inc(11833);
        __CLR4_5_28yq8yqlvha7a99.R.inc(11834);if ((((!isEquals)&&(__CLR4_5_28yq8yqlvha7a99.R.iget(11835)!=0|true))||(__CLR4_5_28yq8yqlvha7a99.R.iget(11836)==0&false))) {{
            __CLR4_5_28yq8yqlvha7a99.R.inc(11837);return this;
        }
        }__CLR4_5_28yq8yqlvha7a99.R.inc(11838);isEquals = lhs == rhs;
        __CLR4_5_28yq8yqlvha7a99.R.inc(11839);return this;
    }finally{__CLR4_5_28yq8yqlvha7a99.R.flushNeeded();}}

    /**
     * <p>Test if two <code>char</code>s are equal.</p>
     *
     * @param lhs  the left hand <code>char</code>
     * @param rhs  the right hand <code>char</code>
     * @return EqualsBuilder - used to chain calls.
     */
    public EqualsBuilder append(final char lhs, final char rhs) {try{__CLR4_5_28yq8yqlvha7a99.R.inc(11840);
        __CLR4_5_28yq8yqlvha7a99.R.inc(11841);if ((((!isEquals)&&(__CLR4_5_28yq8yqlvha7a99.R.iget(11842)!=0|true))||(__CLR4_5_28yq8yqlvha7a99.R.iget(11843)==0&false))) {{
            __CLR4_5_28yq8yqlvha7a99.R.inc(11844);return this;
        }
        }__CLR4_5_28yq8yqlvha7a99.R.inc(11845);isEquals = lhs == rhs;
        __CLR4_5_28yq8yqlvha7a99.R.inc(11846);return this;
    }finally{__CLR4_5_28yq8yqlvha7a99.R.flushNeeded();}}

    /**
     * <p>Test if two <code>byte</code>s are equal.</p>
     *
     * @param lhs  the left hand <code>byte</code>
     * @param rhs  the right hand <code>byte</code>
     * @return EqualsBuilder - used to chain calls.
     */
    public EqualsBuilder append(final byte lhs, final byte rhs) {try{__CLR4_5_28yq8yqlvha7a99.R.inc(11847);
        __CLR4_5_28yq8yqlvha7a99.R.inc(11848);if ((((!isEquals)&&(__CLR4_5_28yq8yqlvha7a99.R.iget(11849)!=0|true))||(__CLR4_5_28yq8yqlvha7a99.R.iget(11850)==0&false))) {{
            __CLR4_5_28yq8yqlvha7a99.R.inc(11851);return this;
        }
        }__CLR4_5_28yq8yqlvha7a99.R.inc(11852);isEquals = lhs == rhs;
        __CLR4_5_28yq8yqlvha7a99.R.inc(11853);return this;
    }finally{__CLR4_5_28yq8yqlvha7a99.R.flushNeeded();}}

    /**
     * <p>Test if two <code>double</code>s are equal by testing that the
     * pattern of bits returned by <code>doubleToLong</code> are equal.</p>
     *
     * <p>This handles NaNs, Infinities, and <code>-0.0</code>.</p>
     *
     * <p>It is compatible with the hash code generated by
     * <code>HashCodeBuilder</code>.</p>
     *
     * @param lhs  the left hand <code>double</code>
     * @param rhs  the right hand <code>double</code>
     * @return EqualsBuilder - used to chain calls.
     */
    public EqualsBuilder append(final double lhs, final double rhs) {try{__CLR4_5_28yq8yqlvha7a99.R.inc(11854);
        __CLR4_5_28yq8yqlvha7a99.R.inc(11855);if ((((!isEquals)&&(__CLR4_5_28yq8yqlvha7a99.R.iget(11856)!=0|true))||(__CLR4_5_28yq8yqlvha7a99.R.iget(11857)==0&false))) {{
            __CLR4_5_28yq8yqlvha7a99.R.inc(11858);return this;
        }
        }__CLR4_5_28yq8yqlvha7a99.R.inc(11859);return append(Double.doubleToLongBits(lhs), Double.doubleToLongBits(rhs));
    }finally{__CLR4_5_28yq8yqlvha7a99.R.flushNeeded();}}

    /**
     * <p>Test if two <code>float</code>s are equal byt testing that the
     * pattern of bits returned by doubleToLong are equal.</p>
     *
     * <p>This handles NaNs, Infinities, and <code>-0.0</code>.</p>
     *
     * <p>It is compatible with the hash code generated by
     * <code>HashCodeBuilder</code>.</p>
     *
     * @param lhs  the left hand <code>float</code>
     * @param rhs  the right hand <code>float</code>
     * @return EqualsBuilder - used to chain calls.
     */
    public EqualsBuilder append(final float lhs, final float rhs) {try{__CLR4_5_28yq8yqlvha7a99.R.inc(11860);
        __CLR4_5_28yq8yqlvha7a99.R.inc(11861);if ((((!isEquals)&&(__CLR4_5_28yq8yqlvha7a99.R.iget(11862)!=0|true))||(__CLR4_5_28yq8yqlvha7a99.R.iget(11863)==0&false))) {{
            __CLR4_5_28yq8yqlvha7a99.R.inc(11864);return this;
        }
        }__CLR4_5_28yq8yqlvha7a99.R.inc(11865);return append(Float.floatToIntBits(lhs), Float.floatToIntBits(rhs));
    }finally{__CLR4_5_28yq8yqlvha7a99.R.flushNeeded();}}

    /**
     * <p>Test if two <code>booleans</code>s are equal.</p>
     *
     * @param lhs  the left hand <code>boolean</code>
     * @param rhs  the right hand <code>boolean</code>
     * @return EqualsBuilder - used to chain calls.
      */
    public EqualsBuilder append(final boolean lhs, final boolean rhs) {try{__CLR4_5_28yq8yqlvha7a99.R.inc(11866);
        __CLR4_5_28yq8yqlvha7a99.R.inc(11867);if ((((!isEquals)&&(__CLR4_5_28yq8yqlvha7a99.R.iget(11868)!=0|true))||(__CLR4_5_28yq8yqlvha7a99.R.iget(11869)==0&false))) {{
            __CLR4_5_28yq8yqlvha7a99.R.inc(11870);return this;
        }
        }__CLR4_5_28yq8yqlvha7a99.R.inc(11871);isEquals = lhs == rhs;
        __CLR4_5_28yq8yqlvha7a99.R.inc(11872);return this;
    }finally{__CLR4_5_28yq8yqlvha7a99.R.flushNeeded();}}

    /**
     * <p>Performs a deep comparison of two <code>Object</code> arrays.</p>
     *
     * <p>This also will be called for the top level of
     * multi-dimensional, ragged, and multi-typed arrays.</p>
     * 
     * <p>Note that this method does not compare the type of the arrays; it only
     * compares the contents.</p>
     *
     * @param lhs  the left hand <code>Object[]</code>
     * @param rhs  the right hand <code>Object[]</code>
     * @return EqualsBuilder - used to chain calls.
     */
    public EqualsBuilder append(final Object[] lhs, final Object[] rhs) {try{__CLR4_5_28yq8yqlvha7a99.R.inc(11873);
        __CLR4_5_28yq8yqlvha7a99.R.inc(11874);if ((((!isEquals)&&(__CLR4_5_28yq8yqlvha7a99.R.iget(11875)!=0|true))||(__CLR4_5_28yq8yqlvha7a99.R.iget(11876)==0&false))) {{
            __CLR4_5_28yq8yqlvha7a99.R.inc(11877);return this;
        }
        }__CLR4_5_28yq8yqlvha7a99.R.inc(11878);if ((((lhs == rhs)&&(__CLR4_5_28yq8yqlvha7a99.R.iget(11879)!=0|true))||(__CLR4_5_28yq8yqlvha7a99.R.iget(11880)==0&false))) {{
            __CLR4_5_28yq8yqlvha7a99.R.inc(11881);return this;
        }
        }__CLR4_5_28yq8yqlvha7a99.R.inc(11882);if ((((lhs == null || rhs == null)&&(__CLR4_5_28yq8yqlvha7a99.R.iget(11883)!=0|true))||(__CLR4_5_28yq8yqlvha7a99.R.iget(11884)==0&false))) {{
            __CLR4_5_28yq8yqlvha7a99.R.inc(11885);this.setEquals(false);
            __CLR4_5_28yq8yqlvha7a99.R.inc(11886);return this;
        }
        }__CLR4_5_28yq8yqlvha7a99.R.inc(11887);if ((((lhs.length != rhs.length)&&(__CLR4_5_28yq8yqlvha7a99.R.iget(11888)!=0|true))||(__CLR4_5_28yq8yqlvha7a99.R.iget(11889)==0&false))) {{
            __CLR4_5_28yq8yqlvha7a99.R.inc(11890);this.setEquals(false);
            __CLR4_5_28yq8yqlvha7a99.R.inc(11891);return this;
        }
        }__CLR4_5_28yq8yqlvha7a99.R.inc(11892);for (int i = 0; (((i < lhs.length && isEquals)&&(__CLR4_5_28yq8yqlvha7a99.R.iget(11893)!=0|true))||(__CLR4_5_28yq8yqlvha7a99.R.iget(11894)==0&false)); ++i) {{
            __CLR4_5_28yq8yqlvha7a99.R.inc(11895);append(lhs[i], rhs[i]);
        }
        }__CLR4_5_28yq8yqlvha7a99.R.inc(11896);return this;
    }finally{__CLR4_5_28yq8yqlvha7a99.R.flushNeeded();}}

    /**
     * <p>Deep comparison of array of <code>long</code>. Length and all
     * values are compared.</p>
     *
     * <p>The method {@link #append(long, long)} is used.</p>
     *
     * @param lhs  the left hand <code>long[]</code>
     * @param rhs  the right hand <code>long[]</code>
     * @return EqualsBuilder - used to chain calls.
     */
    public EqualsBuilder append(final long[] lhs, final long[] rhs) {try{__CLR4_5_28yq8yqlvha7a99.R.inc(11897);
        __CLR4_5_28yq8yqlvha7a99.R.inc(11898);if ((((!isEquals)&&(__CLR4_5_28yq8yqlvha7a99.R.iget(11899)!=0|true))||(__CLR4_5_28yq8yqlvha7a99.R.iget(11900)==0&false))) {{
            __CLR4_5_28yq8yqlvha7a99.R.inc(11901);return this;
        }
        }__CLR4_5_28yq8yqlvha7a99.R.inc(11902);if ((((lhs == rhs)&&(__CLR4_5_28yq8yqlvha7a99.R.iget(11903)!=0|true))||(__CLR4_5_28yq8yqlvha7a99.R.iget(11904)==0&false))) {{
            __CLR4_5_28yq8yqlvha7a99.R.inc(11905);return this;
        }
        }__CLR4_5_28yq8yqlvha7a99.R.inc(11906);if ((((lhs == null || rhs == null)&&(__CLR4_5_28yq8yqlvha7a99.R.iget(11907)!=0|true))||(__CLR4_5_28yq8yqlvha7a99.R.iget(11908)==0&false))) {{
            __CLR4_5_28yq8yqlvha7a99.R.inc(11909);this.setEquals(false);
            __CLR4_5_28yq8yqlvha7a99.R.inc(11910);return this;
        }
        }__CLR4_5_28yq8yqlvha7a99.R.inc(11911);if ((((lhs.length != rhs.length)&&(__CLR4_5_28yq8yqlvha7a99.R.iget(11912)!=0|true))||(__CLR4_5_28yq8yqlvha7a99.R.iget(11913)==0&false))) {{
            __CLR4_5_28yq8yqlvha7a99.R.inc(11914);this.setEquals(false);
            __CLR4_5_28yq8yqlvha7a99.R.inc(11915);return this;
        }
        }__CLR4_5_28yq8yqlvha7a99.R.inc(11916);for (int i = 0; (((i < lhs.length && isEquals)&&(__CLR4_5_28yq8yqlvha7a99.R.iget(11917)!=0|true))||(__CLR4_5_28yq8yqlvha7a99.R.iget(11918)==0&false)); ++i) {{
            __CLR4_5_28yq8yqlvha7a99.R.inc(11919);append(lhs[i], rhs[i]);
        }
        }__CLR4_5_28yq8yqlvha7a99.R.inc(11920);return this;
    }finally{__CLR4_5_28yq8yqlvha7a99.R.flushNeeded();}}

    /**
     * <p>Deep comparison of array of <code>int</code>. Length and all
     * values are compared.</p>
     *
     * <p>The method {@link #append(int, int)} is used.</p>
     *
     * @param lhs  the left hand <code>int[]</code>
     * @param rhs  the right hand <code>int[]</code>
     * @return EqualsBuilder - used to chain calls.
     */
    public EqualsBuilder append(final int[] lhs, final int[] rhs) {try{__CLR4_5_28yq8yqlvha7a99.R.inc(11921);
        __CLR4_5_28yq8yqlvha7a99.R.inc(11922);if ((((!isEquals)&&(__CLR4_5_28yq8yqlvha7a99.R.iget(11923)!=0|true))||(__CLR4_5_28yq8yqlvha7a99.R.iget(11924)==0&false))) {{
            __CLR4_5_28yq8yqlvha7a99.R.inc(11925);return this;
        }
        }__CLR4_5_28yq8yqlvha7a99.R.inc(11926);if ((((lhs == rhs)&&(__CLR4_5_28yq8yqlvha7a99.R.iget(11927)!=0|true))||(__CLR4_5_28yq8yqlvha7a99.R.iget(11928)==0&false))) {{
            __CLR4_5_28yq8yqlvha7a99.R.inc(11929);return this;
        }
        }__CLR4_5_28yq8yqlvha7a99.R.inc(11930);if ((((lhs == null || rhs == null)&&(__CLR4_5_28yq8yqlvha7a99.R.iget(11931)!=0|true))||(__CLR4_5_28yq8yqlvha7a99.R.iget(11932)==0&false))) {{
            __CLR4_5_28yq8yqlvha7a99.R.inc(11933);this.setEquals(false);
            __CLR4_5_28yq8yqlvha7a99.R.inc(11934);return this;
        }
        }__CLR4_5_28yq8yqlvha7a99.R.inc(11935);if ((((lhs.length != rhs.length)&&(__CLR4_5_28yq8yqlvha7a99.R.iget(11936)!=0|true))||(__CLR4_5_28yq8yqlvha7a99.R.iget(11937)==0&false))) {{
            __CLR4_5_28yq8yqlvha7a99.R.inc(11938);this.setEquals(false);
            __CLR4_5_28yq8yqlvha7a99.R.inc(11939);return this;
        }
        }__CLR4_5_28yq8yqlvha7a99.R.inc(11940);for (int i = 0; (((i < lhs.length && isEquals)&&(__CLR4_5_28yq8yqlvha7a99.R.iget(11941)!=0|true))||(__CLR4_5_28yq8yqlvha7a99.R.iget(11942)==0&false)); ++i) {{
            __CLR4_5_28yq8yqlvha7a99.R.inc(11943);append(lhs[i], rhs[i]);
        }
        }__CLR4_5_28yq8yqlvha7a99.R.inc(11944);return this;
    }finally{__CLR4_5_28yq8yqlvha7a99.R.flushNeeded();}}

    /**
     * <p>Deep comparison of array of <code>short</code>. Length and all
     * values are compared.</p>
     *
     * <p>The method {@link #append(short, short)} is used.</p>
     *
     * @param lhs  the left hand <code>short[]</code>
     * @param rhs  the right hand <code>short[]</code>
     * @return EqualsBuilder - used to chain calls.
     */
    public EqualsBuilder append(final short[] lhs, final short[] rhs) {try{__CLR4_5_28yq8yqlvha7a99.R.inc(11945);
        __CLR4_5_28yq8yqlvha7a99.R.inc(11946);if ((((!isEquals)&&(__CLR4_5_28yq8yqlvha7a99.R.iget(11947)!=0|true))||(__CLR4_5_28yq8yqlvha7a99.R.iget(11948)==0&false))) {{
            __CLR4_5_28yq8yqlvha7a99.R.inc(11949);return this;
        }
        }__CLR4_5_28yq8yqlvha7a99.R.inc(11950);if ((((lhs == rhs)&&(__CLR4_5_28yq8yqlvha7a99.R.iget(11951)!=0|true))||(__CLR4_5_28yq8yqlvha7a99.R.iget(11952)==0&false))) {{
            __CLR4_5_28yq8yqlvha7a99.R.inc(11953);return this;
        }
        }__CLR4_5_28yq8yqlvha7a99.R.inc(11954);if ((((lhs == null || rhs == null)&&(__CLR4_5_28yq8yqlvha7a99.R.iget(11955)!=0|true))||(__CLR4_5_28yq8yqlvha7a99.R.iget(11956)==0&false))) {{
            __CLR4_5_28yq8yqlvha7a99.R.inc(11957);this.setEquals(false);
            __CLR4_5_28yq8yqlvha7a99.R.inc(11958);return this;
        }
        }__CLR4_5_28yq8yqlvha7a99.R.inc(11959);if ((((lhs.length != rhs.length)&&(__CLR4_5_28yq8yqlvha7a99.R.iget(11960)!=0|true))||(__CLR4_5_28yq8yqlvha7a99.R.iget(11961)==0&false))) {{
            __CLR4_5_28yq8yqlvha7a99.R.inc(11962);this.setEquals(false);
            __CLR4_5_28yq8yqlvha7a99.R.inc(11963);return this;
        }
        }__CLR4_5_28yq8yqlvha7a99.R.inc(11964);for (int i = 0; (((i < lhs.length && isEquals)&&(__CLR4_5_28yq8yqlvha7a99.R.iget(11965)!=0|true))||(__CLR4_5_28yq8yqlvha7a99.R.iget(11966)==0&false)); ++i) {{
            __CLR4_5_28yq8yqlvha7a99.R.inc(11967);append(lhs[i], rhs[i]);
        }
        }__CLR4_5_28yq8yqlvha7a99.R.inc(11968);return this;
    }finally{__CLR4_5_28yq8yqlvha7a99.R.flushNeeded();}}

    /**
     * <p>Deep comparison of array of <code>char</code>. Length and all
     * values are compared.</p>
     *
     * <p>The method {@link #append(char, char)} is used.</p>
     *
     * @param lhs  the left hand <code>char[]</code>
     * @param rhs  the right hand <code>char[]</code>
     * @return EqualsBuilder - used to chain calls.
     */
    public EqualsBuilder append(final char[] lhs, final char[] rhs) {try{__CLR4_5_28yq8yqlvha7a99.R.inc(11969);
        __CLR4_5_28yq8yqlvha7a99.R.inc(11970);if ((((!isEquals)&&(__CLR4_5_28yq8yqlvha7a99.R.iget(11971)!=0|true))||(__CLR4_5_28yq8yqlvha7a99.R.iget(11972)==0&false))) {{
            __CLR4_5_28yq8yqlvha7a99.R.inc(11973);return this;
        }
        }__CLR4_5_28yq8yqlvha7a99.R.inc(11974);if ((((lhs == rhs)&&(__CLR4_5_28yq8yqlvha7a99.R.iget(11975)!=0|true))||(__CLR4_5_28yq8yqlvha7a99.R.iget(11976)==0&false))) {{
            __CLR4_5_28yq8yqlvha7a99.R.inc(11977);return this;
        }
        }__CLR4_5_28yq8yqlvha7a99.R.inc(11978);if ((((lhs == null || rhs == null)&&(__CLR4_5_28yq8yqlvha7a99.R.iget(11979)!=0|true))||(__CLR4_5_28yq8yqlvha7a99.R.iget(11980)==0&false))) {{
            __CLR4_5_28yq8yqlvha7a99.R.inc(11981);this.setEquals(false);
            __CLR4_5_28yq8yqlvha7a99.R.inc(11982);return this;
        }
        }__CLR4_5_28yq8yqlvha7a99.R.inc(11983);if ((((lhs.length != rhs.length)&&(__CLR4_5_28yq8yqlvha7a99.R.iget(11984)!=0|true))||(__CLR4_5_28yq8yqlvha7a99.R.iget(11985)==0&false))) {{
            __CLR4_5_28yq8yqlvha7a99.R.inc(11986);this.setEquals(false);
            __CLR4_5_28yq8yqlvha7a99.R.inc(11987);return this;
        }
        }__CLR4_5_28yq8yqlvha7a99.R.inc(11988);for (int i = 0; (((i < lhs.length && isEquals)&&(__CLR4_5_28yq8yqlvha7a99.R.iget(11989)!=0|true))||(__CLR4_5_28yq8yqlvha7a99.R.iget(11990)==0&false)); ++i) {{
            __CLR4_5_28yq8yqlvha7a99.R.inc(11991);append(lhs[i], rhs[i]);
        }
        }__CLR4_5_28yq8yqlvha7a99.R.inc(11992);return this;
    }finally{__CLR4_5_28yq8yqlvha7a99.R.flushNeeded();}}

    /**
     * <p>Deep comparison of array of <code>byte</code>. Length and all
     * values are compared.</p>
     *
     * <p>The method {@link #append(byte, byte)} is used.</p>
     *
     * @param lhs  the left hand <code>byte[]</code>
     * @param rhs  the right hand <code>byte[]</code>
     * @return EqualsBuilder - used to chain calls.
     */
    public EqualsBuilder append(final byte[] lhs, final byte[] rhs) {try{__CLR4_5_28yq8yqlvha7a99.R.inc(11993);
        __CLR4_5_28yq8yqlvha7a99.R.inc(11994);if ((((!isEquals)&&(__CLR4_5_28yq8yqlvha7a99.R.iget(11995)!=0|true))||(__CLR4_5_28yq8yqlvha7a99.R.iget(11996)==0&false))) {{
            __CLR4_5_28yq8yqlvha7a99.R.inc(11997);return this;
        }
        }__CLR4_5_28yq8yqlvha7a99.R.inc(11998);if ((((lhs == rhs)&&(__CLR4_5_28yq8yqlvha7a99.R.iget(11999)!=0|true))||(__CLR4_5_28yq8yqlvha7a99.R.iget(12000)==0&false))) {{
            __CLR4_5_28yq8yqlvha7a99.R.inc(12001);return this;
        }
        }__CLR4_5_28yq8yqlvha7a99.R.inc(12002);if ((((lhs == null || rhs == null)&&(__CLR4_5_28yq8yqlvha7a99.R.iget(12003)!=0|true))||(__CLR4_5_28yq8yqlvha7a99.R.iget(12004)==0&false))) {{
            __CLR4_5_28yq8yqlvha7a99.R.inc(12005);this.setEquals(false);
            __CLR4_5_28yq8yqlvha7a99.R.inc(12006);return this;
        }
        }__CLR4_5_28yq8yqlvha7a99.R.inc(12007);if ((((lhs.length != rhs.length)&&(__CLR4_5_28yq8yqlvha7a99.R.iget(12008)!=0|true))||(__CLR4_5_28yq8yqlvha7a99.R.iget(12009)==0&false))) {{
            __CLR4_5_28yq8yqlvha7a99.R.inc(12010);this.setEquals(false);
            __CLR4_5_28yq8yqlvha7a99.R.inc(12011);return this;
        }
        }__CLR4_5_28yq8yqlvha7a99.R.inc(12012);for (int i = 0; (((i < lhs.length && isEquals)&&(__CLR4_5_28yq8yqlvha7a99.R.iget(12013)!=0|true))||(__CLR4_5_28yq8yqlvha7a99.R.iget(12014)==0&false)); ++i) {{
            __CLR4_5_28yq8yqlvha7a99.R.inc(12015);append(lhs[i], rhs[i]);
        }
        }__CLR4_5_28yq8yqlvha7a99.R.inc(12016);return this;
    }finally{__CLR4_5_28yq8yqlvha7a99.R.flushNeeded();}}

    /**
     * <p>Deep comparison of array of <code>double</code>. Length and all
     * values are compared.</p>
     *
     * <p>The method {@link #append(double, double)} is used.</p>
     *
     * @param lhs  the left hand <code>double[]</code>
     * @param rhs  the right hand <code>double[]</code>
     * @return EqualsBuilder - used to chain calls.
     */
    public EqualsBuilder append(final double[] lhs, final double[] rhs) {try{__CLR4_5_28yq8yqlvha7a99.R.inc(12017);
        __CLR4_5_28yq8yqlvha7a99.R.inc(12018);if ((((!isEquals)&&(__CLR4_5_28yq8yqlvha7a99.R.iget(12019)!=0|true))||(__CLR4_5_28yq8yqlvha7a99.R.iget(12020)==0&false))) {{
            __CLR4_5_28yq8yqlvha7a99.R.inc(12021);return this;
        }
        }__CLR4_5_28yq8yqlvha7a99.R.inc(12022);if ((((lhs == rhs)&&(__CLR4_5_28yq8yqlvha7a99.R.iget(12023)!=0|true))||(__CLR4_5_28yq8yqlvha7a99.R.iget(12024)==0&false))) {{
            __CLR4_5_28yq8yqlvha7a99.R.inc(12025);return this;
        }
        }__CLR4_5_28yq8yqlvha7a99.R.inc(12026);if ((((lhs == null || rhs == null)&&(__CLR4_5_28yq8yqlvha7a99.R.iget(12027)!=0|true))||(__CLR4_5_28yq8yqlvha7a99.R.iget(12028)==0&false))) {{
            __CLR4_5_28yq8yqlvha7a99.R.inc(12029);this.setEquals(false);
            __CLR4_5_28yq8yqlvha7a99.R.inc(12030);return this;
        }
        }__CLR4_5_28yq8yqlvha7a99.R.inc(12031);if ((((lhs.length != rhs.length)&&(__CLR4_5_28yq8yqlvha7a99.R.iget(12032)!=0|true))||(__CLR4_5_28yq8yqlvha7a99.R.iget(12033)==0&false))) {{
            __CLR4_5_28yq8yqlvha7a99.R.inc(12034);this.setEquals(false);
            __CLR4_5_28yq8yqlvha7a99.R.inc(12035);return this;
        }
        }__CLR4_5_28yq8yqlvha7a99.R.inc(12036);for (int i = 0; (((i < lhs.length && isEquals)&&(__CLR4_5_28yq8yqlvha7a99.R.iget(12037)!=0|true))||(__CLR4_5_28yq8yqlvha7a99.R.iget(12038)==0&false)); ++i) {{
            __CLR4_5_28yq8yqlvha7a99.R.inc(12039);append(lhs[i], rhs[i]);
        }
        }__CLR4_5_28yq8yqlvha7a99.R.inc(12040);return this;
    }finally{__CLR4_5_28yq8yqlvha7a99.R.flushNeeded();}}

    /**
     * <p>Deep comparison of array of <code>float</code>. Length and all
     * values are compared.</p>
     *
     * <p>The method {@link #append(float, float)} is used.</p>
     *
     * @param lhs  the left hand <code>float[]</code>
     * @param rhs  the right hand <code>float[]</code>
     * @return EqualsBuilder - used to chain calls.
     */
    public EqualsBuilder append(final float[] lhs, final float[] rhs) {try{__CLR4_5_28yq8yqlvha7a99.R.inc(12041);
        __CLR4_5_28yq8yqlvha7a99.R.inc(12042);if ((((!isEquals)&&(__CLR4_5_28yq8yqlvha7a99.R.iget(12043)!=0|true))||(__CLR4_5_28yq8yqlvha7a99.R.iget(12044)==0&false))) {{
            __CLR4_5_28yq8yqlvha7a99.R.inc(12045);return this;
        }
        }__CLR4_5_28yq8yqlvha7a99.R.inc(12046);if ((((lhs == rhs)&&(__CLR4_5_28yq8yqlvha7a99.R.iget(12047)!=0|true))||(__CLR4_5_28yq8yqlvha7a99.R.iget(12048)==0&false))) {{
            __CLR4_5_28yq8yqlvha7a99.R.inc(12049);return this;
        }
        }__CLR4_5_28yq8yqlvha7a99.R.inc(12050);if ((((lhs == null || rhs == null)&&(__CLR4_5_28yq8yqlvha7a99.R.iget(12051)!=0|true))||(__CLR4_5_28yq8yqlvha7a99.R.iget(12052)==0&false))) {{
            __CLR4_5_28yq8yqlvha7a99.R.inc(12053);this.setEquals(false);
            __CLR4_5_28yq8yqlvha7a99.R.inc(12054);return this;
        }
        }__CLR4_5_28yq8yqlvha7a99.R.inc(12055);if ((((lhs.length != rhs.length)&&(__CLR4_5_28yq8yqlvha7a99.R.iget(12056)!=0|true))||(__CLR4_5_28yq8yqlvha7a99.R.iget(12057)==0&false))) {{
            __CLR4_5_28yq8yqlvha7a99.R.inc(12058);this.setEquals(false);
            __CLR4_5_28yq8yqlvha7a99.R.inc(12059);return this;
        }
        }__CLR4_5_28yq8yqlvha7a99.R.inc(12060);for (int i = 0; (((i < lhs.length && isEquals)&&(__CLR4_5_28yq8yqlvha7a99.R.iget(12061)!=0|true))||(__CLR4_5_28yq8yqlvha7a99.R.iget(12062)==0&false)); ++i) {{
            __CLR4_5_28yq8yqlvha7a99.R.inc(12063);append(lhs[i], rhs[i]);
        }
        }__CLR4_5_28yq8yqlvha7a99.R.inc(12064);return this;
    }finally{__CLR4_5_28yq8yqlvha7a99.R.flushNeeded();}}

    /**
     * <p>Deep comparison of array of <code>boolean</code>. Length and all
     * values are compared.</p>
     *
     * <p>The method {@link #append(boolean, boolean)} is used.</p>
     *
     * @param lhs  the left hand <code>boolean[]</code>
     * @param rhs  the right hand <code>boolean[]</code>
     * @return EqualsBuilder - used to chain calls.
     */
    public EqualsBuilder append(final boolean[] lhs, final boolean[] rhs) {try{__CLR4_5_28yq8yqlvha7a99.R.inc(12065);
        __CLR4_5_28yq8yqlvha7a99.R.inc(12066);if ((((!isEquals)&&(__CLR4_5_28yq8yqlvha7a99.R.iget(12067)!=0|true))||(__CLR4_5_28yq8yqlvha7a99.R.iget(12068)==0&false))) {{
            __CLR4_5_28yq8yqlvha7a99.R.inc(12069);return this;
        }
        }__CLR4_5_28yq8yqlvha7a99.R.inc(12070);if ((((lhs == rhs)&&(__CLR4_5_28yq8yqlvha7a99.R.iget(12071)!=0|true))||(__CLR4_5_28yq8yqlvha7a99.R.iget(12072)==0&false))) {{
            __CLR4_5_28yq8yqlvha7a99.R.inc(12073);return this;
        }
        }__CLR4_5_28yq8yqlvha7a99.R.inc(12074);if ((((lhs == null || rhs == null)&&(__CLR4_5_28yq8yqlvha7a99.R.iget(12075)!=0|true))||(__CLR4_5_28yq8yqlvha7a99.R.iget(12076)==0&false))) {{
            __CLR4_5_28yq8yqlvha7a99.R.inc(12077);this.setEquals(false);
            __CLR4_5_28yq8yqlvha7a99.R.inc(12078);return this;
        }
        }__CLR4_5_28yq8yqlvha7a99.R.inc(12079);if ((((lhs.length != rhs.length)&&(__CLR4_5_28yq8yqlvha7a99.R.iget(12080)!=0|true))||(__CLR4_5_28yq8yqlvha7a99.R.iget(12081)==0&false))) {{
            __CLR4_5_28yq8yqlvha7a99.R.inc(12082);this.setEquals(false);
            __CLR4_5_28yq8yqlvha7a99.R.inc(12083);return this;
        }
        }__CLR4_5_28yq8yqlvha7a99.R.inc(12084);for (int i = 0; (((i < lhs.length && isEquals)&&(__CLR4_5_28yq8yqlvha7a99.R.iget(12085)!=0|true))||(__CLR4_5_28yq8yqlvha7a99.R.iget(12086)==0&false)); ++i) {{
            __CLR4_5_28yq8yqlvha7a99.R.inc(12087);append(lhs[i], rhs[i]);
        }
        }__CLR4_5_28yq8yqlvha7a99.R.inc(12088);return this;
    }finally{__CLR4_5_28yq8yqlvha7a99.R.flushNeeded();}}

    /**
     * <p>Returns <code>true</code> if the fields that have been checked
     * are all equal.</p>
     *
     * @return boolean
     */
    public boolean isEquals() {try{__CLR4_5_28yq8yqlvha7a99.R.inc(12089);
        __CLR4_5_28yq8yqlvha7a99.R.inc(12090);return this.isEquals;
    }finally{__CLR4_5_28yq8yqlvha7a99.R.flushNeeded();}}

    /**
     * <p>Returns <code>true</code> if the fields that have been checked
     * are all equal.</p>
     *
     * @return <code>true</code> if all of the fields that have been checked
     *         are equal, <code>false</code> otherwise.
     *
     * @since 3.0
     */
    @Override
    public Boolean build() {try{__CLR4_5_28yq8yqlvha7a99.R.inc(12091);
        __CLR4_5_28yq8yqlvha7a99.R.inc(12092);return Boolean.valueOf(isEquals());
    }finally{__CLR4_5_28yq8yqlvha7a99.R.flushNeeded();}}

    /**
     * Sets the <code>isEquals</code> value.
     *
     * @param isEquals The value to set.
     * @since 2.1
     */
    protected void setEquals(final boolean isEquals) {try{__CLR4_5_28yq8yqlvha7a99.R.inc(12093);
        __CLR4_5_28yq8yqlvha7a99.R.inc(12094);this.isEquals = isEquals;
    }finally{__CLR4_5_28yq8yqlvha7a99.R.flushNeeded();}}

    /**
     * Reset the EqualsBuilder so you can use the same object again
     * @since 2.5
     */
    public void reset() {try{__CLR4_5_28yq8yqlvha7a99.R.inc(12095);
        __CLR4_5_28yq8yqlvha7a99.R.inc(12096);this.isEquals = true;
    }finally{__CLR4_5_28yq8yqlvha7a99.R.flushNeeded();}}
}
