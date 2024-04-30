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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.ClassUtils;
import org.apache.commons.lang3.Validate;

/**
 * <p>
 * Assists in implementing {@link Object#toString()} methods using reflection.
 * </p>
 * <p>
 * This class uses reflection to determine the fields to append. Because these fields are usually private, the class
 * uses {@link java.lang.reflect.AccessibleObject#setAccessible(java.lang.reflect.AccessibleObject[], boolean)} to
 * change the visibility of the fields. This will fail under a security manager, unless the appropriate permissions are
 * set up correctly.
 * </p>
 * <p>
 * Using reflection to access (private) fields circumvents any synchronization protection guarding access to these
 * fields. If a toString method cannot safely read a field, you should exclude it from the toString method, or use
 * synchronization consistent with the class' lock management around the invocation of the method. Take special care to
 * exclude non-thread-safe collection classes, because these classes may throw ConcurrentModificationException if
 * modified while the toString method is executing.
 * </p>
 * <p>
 * A typical invocation for this method would look like:
 * </p>
 * <pre>
 * public String toString() {
 *     return ReflectionToStringBuilder.toString(this);
 * }
 * </pre>
 * <p>
 * You can also use the builder to debug 3rd party objects:
 * </p>
 * <pre>
 * System.out.println(&quot;An object: &quot; + ReflectionToStringBuilder.toString(anObject));
 * </pre>
 * <p>
 * A subclass can control field output by overriding the methods:
 * </p>
 * <ul>
 * <li>{@link #accept(java.lang.reflect.Field)}</li>
 * <li>{@link #getValue(java.lang.reflect.Field)}</li>
 * </ul>
 * <p>
 * For example, this method does <i>not</i> include the <code>password</code> field in the returned <code>String</code>:
 * </p>
 * <pre>
 * public String toString() {
 *     return (new ReflectionToStringBuilder(this) {
 *         protected boolean accept(Field f) {
 *             return super.accept(f) &amp;&amp; !f.getName().equals(&quot;password&quot;);
 *         }
 *     }).toString();
 * }
 * </pre>
 * <p>
 * Alternatively the {@link ToStringExclude} annotation can be used to exclude fields from being incorporated in the 
 * result.
 * </p>
 * <p>
 * The exact format of the <code>toString</code> is determined by the {@link ToStringStyle} passed into the constructor.
 * </p>
 *
 * <p>
 * <b>Note:</b> the default {@link ToStringStyle} will only do a "shallow" formatting, i.e. composed objects are not
 * further traversed. To get "deep" formatting, use an instance of {@link RecursiveToStringStyle}.
 * </p>
 *
 * @since 2.0
 */
public class ReflectionToStringBuilder extends ToStringBuilder {public static class __CLR4_5_29mc9mclvha7ac6{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172755542L,8589935092L,12612,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * <p>
     * Builds a <code>toString</code> value using the default <code>ToStringStyle</code> through reflection.
     * </p>
     *
     * <p>
     * It uses <code>AccessibleObject.setAccessible</code> to gain access to private fields. This means that it will
     * throw a security exception if run under a security manager, if the permissions are not set up correctly. It is
     * also not as efficient as testing explicitly.
     * </p>
     *
     * <p>
     * Transient members will be not be included, as they are likely derived. Static fields will not be included.
     * Superclass fields will be appended.
     * </p>
     *
     * @param object
     *            the Object to be output
     * @return the String result
     * @throws IllegalArgumentException
     *             if the Object is <code>null</code>
     *
     * @see ToStringExclude
     */
    public static String toString(final Object object) {try{__CLR4_5_29mc9mclvha7ac6.R.inc(12468);
        __CLR4_5_29mc9mclvha7ac6.R.inc(12469);return toString(object, null, false, false, null);
    }finally{__CLR4_5_29mc9mclvha7ac6.R.flushNeeded();}}

    /**
     * <p>
     * Builds a <code>toString</code> value through reflection.
     * </p>
     *
     * <p>
     * It uses <code>AccessibleObject.setAccessible</code> to gain access to private fields. This means that it will
     * throw a security exception if run under a security manager, if the permissions are not set up correctly. It is
     * also not as efficient as testing explicitly.
     * </p>
     *
     * <p>
     * Transient members will be not be included, as they are likely derived. Static fields will not be included.
     * Superclass fields will be appended.
     * </p>
     *
     * <p>
     * If the style is <code>null</code>, the default <code>ToStringStyle</code> is used.
     * </p>
     *
     * @param object
     *            the Object to be output
     * @param style
     *            the style of the <code>toString</code> to create, may be <code>null</code>
     * @return the String result
     * @throws IllegalArgumentException
     *             if the Object or <code>ToStringStyle</code> is <code>null</code>
     *
     * @see ToStringExclude
     */
    public static String toString(final Object object, final ToStringStyle style) {try{__CLR4_5_29mc9mclvha7ac6.R.inc(12470);
        __CLR4_5_29mc9mclvha7ac6.R.inc(12471);return toString(object, style, false, false, null);
    }finally{__CLR4_5_29mc9mclvha7ac6.R.flushNeeded();}}

    /**
     * <p>
     * Builds a <code>toString</code> value through reflection.
     * </p>
     *
     * <p>
     * It uses <code>AccessibleObject.setAccessible</code> to gain access to private fields. This means that it will
     * throw a security exception if run under a security manager, if the permissions are not set up correctly. It is
     * also not as efficient as testing explicitly.
     * </p>
     *
     * <p>
     * If the <code>outputTransients</code> is <code>true</code>, transient members will be output, otherwise they
     * are ignored, as they are likely derived fields, and not part of the value of the Object.
     * </p>
     *
     * <p>
     * Static fields will not be included. Superclass fields will be appended.
     * </p>
     *
     * <p>
     * If the style is <code>null</code>, the default <code>ToStringStyle</code> is used.
     * </p>
     *
     * @param object
     *            the Object to be output
     * @param style
     *            the style of the <code>toString</code> to create, may be <code>null</code>
     * @param outputTransients
     *            whether to include transient fields
     * @return the String result
     * @throws IllegalArgumentException
     *             if the Object is <code>null</code>
     *
     * @see ToStringExclude
     */
    public static String toString(final Object object, final ToStringStyle style, final boolean outputTransients) {try{__CLR4_5_29mc9mclvha7ac6.R.inc(12472);
        __CLR4_5_29mc9mclvha7ac6.R.inc(12473);return toString(object, style, outputTransients, false, null);
    }finally{__CLR4_5_29mc9mclvha7ac6.R.flushNeeded();}}

    /**
     * <p>
     * Builds a <code>toString</code> value through reflection.
     * </p>
     *
     * <p>
     * It uses <code>AccessibleObject.setAccessible</code> to gain access to private fields. This means that it will
     * throw a security exception if run under a security manager, if the permissions are not set up correctly. It is
     * also not as efficient as testing explicitly.
     * </p>
     *
     * <p>
     * If the <code>outputTransients</code> is <code>true</code>, transient fields will be output, otherwise they
     * are ignored, as they are likely derived fields, and not part of the value of the Object.
     * </p>
     *
     * <p>
     * If the <code>outputStatics</code> is <code>true</code>, static fields will be output, otherwise they are
     * ignored.
     * </p>
     *
     * <p>
     * Static fields will not be included. Superclass fields will be appended.
     * </p>
     *
     * <p>
     * If the style is <code>null</code>, the default <code>ToStringStyle</code> is used.
     * </p>
     *
     * @param object
     *            the Object to be output
     * @param style
     *            the style of the <code>toString</code> to create, may be <code>null</code>
     * @param outputTransients
     *            whether to include transient fields
     * @param outputStatics
     *            whether to include static fields
     * @return the String result
     * @throws IllegalArgumentException
     *             if the Object is <code>null</code>
     * 
     * @see ToStringExclude
     * @since 2.1
     */
    public static String toString(final Object object, final ToStringStyle style, final boolean outputTransients, final boolean outputStatics) {try{__CLR4_5_29mc9mclvha7ac6.R.inc(12474);
        __CLR4_5_29mc9mclvha7ac6.R.inc(12475);return toString(object, style, outputTransients, outputStatics, null);
    }finally{__CLR4_5_29mc9mclvha7ac6.R.flushNeeded();}}

    /**
     * <p>
     * Builds a <code>toString</code> value through reflection.
     * </p>
     *
     * <p>
     * It uses <code>AccessibleObject.setAccessible</code> to gain access to private fields. This means that it will
     * throw a security exception if run under a security manager, if the permissions are not set up correctly. It is
     * also not as efficient as testing explicitly.
     * </p>
     *
     * <p>
     * If the <code>outputTransients</code> is <code>true</code>, transient fields will be output, otherwise they
     * are ignored, as they are likely derived fields, and not part of the value of the Object.
     * </p>
     *
     * <p>
     * If the <code>outputStatics</code> is <code>true</code>, static fields will be output, otherwise they are
     * ignored.
     * </p>
     *
     * <p>
     * Superclass fields will be appended up to and including the specified superclass. A null superclass is treated as
     * <code>java.lang.Object</code>.
     * </p>
     *
     * <p>
     * If the style is <code>null</code>, the default <code>ToStringStyle</code> is used.
     * </p>
     *
     * @param <T>
     *            the type of the object
     * @param object
     *            the Object to be output
     * @param style
     *            the style of the <code>toString</code> to create, may be <code>null</code>
     * @param outputTransients
     *            whether to include transient fields
     * @param outputStatics
     *            whether to include static fields
     * @param reflectUpToClass
     *            the superclass to reflect up to (inclusive), may be <code>null</code>
     * @return the String result
     * @throws IllegalArgumentException
     *             if the Object is <code>null</code>
     * 
     * @see ToStringExclude
     * @since 2.1
     */
    public static <T> String toString(
            final T object, final ToStringStyle style, final boolean outputTransients,
            final boolean outputStatics, final Class<? super T> reflectUpToClass) {try{__CLR4_5_29mc9mclvha7ac6.R.inc(12476);
        __CLR4_5_29mc9mclvha7ac6.R.inc(12477);return new ReflectionToStringBuilder(object, style, null, reflectUpToClass, outputTransients, outputStatics)
                .toString();
    }finally{__CLR4_5_29mc9mclvha7ac6.R.flushNeeded();}}
    
    /**
     * <p>
     * Builds a <code>toString</code> value through reflection.
     * </p>
     *
     * <p>
     * It uses <code>AccessibleObject.setAccessible</code> to gain access to private fields. This means that it will
     * throw a security exception if run under a security manager, if the permissions are not set up correctly. It is
     * also not as efficient as testing explicitly.
     * </p>
     *
     * <p>
     * If the <code>outputTransients</code> is <code>true</code>, transient fields will be output, otherwise they
     * are ignored, as they are likely derived fields, and not part of the value of the Object.
     * </p>
     *
     * <p>
     * If the <code>outputStatics</code> is <code>true</code>, static fields will be output, otherwise they are
     * ignored.
     * </p>
     *
     * <p>
     * Superclass fields will be appended up to and including the specified superclass. A null superclass is treated as
     * <code>java.lang.Object</code>.
     * </p>
     *
     * <p>
     * If the style is <code>null</code>, the default <code>ToStringStyle</code> is used.
     * </p>
     *
     * @param <T>
     *            the type of the object
     * @param object
     *            the Object to be output
     * @param style
     *            the style of the <code>toString</code> to create, may be <code>null</code>
     * @param outputTransients
     *            whether to include transient fields
     * @param outputStatics
     *            whether to include static fields
     * @param excludeNullValues
     *            whether to exclude fields whose values are null
     * @param reflectUpToClass
     *            the superclass to reflect up to (inclusive), may be <code>null</code>
     * @return the String result
     * @throws IllegalArgumentException
     *             if the Object is <code>null</code>
     * 
     * @see ToStringExclude
     * @since 3.6
     */
    public static <T> String toString(
            final T object, final ToStringStyle style, final boolean outputTransients,
            final boolean outputStatics, boolean excludeNullValues, final Class<? super T> reflectUpToClass) {try{__CLR4_5_29mc9mclvha7ac6.R.inc(12478);
        __CLR4_5_29mc9mclvha7ac6.R.inc(12479);return new ReflectionToStringBuilder(object, style, null, reflectUpToClass, outputTransients, outputStatics, excludeNullValues)
                .toString();
    }finally{__CLR4_5_29mc9mclvha7ac6.R.flushNeeded();}}

    /**
     * Builds a String for a toString method excluding the given field names.
     *
     * @param object
     *            The object to "toString".
     * @param excludeFieldNames
     *            The field names to exclude. Null excludes nothing.
     * @return The toString value.
     */
    public static String toStringExclude(final Object object, final Collection<String> excludeFieldNames) {try{__CLR4_5_29mc9mclvha7ac6.R.inc(12480);
        __CLR4_5_29mc9mclvha7ac6.R.inc(12481);return toStringExclude(object, toNoNullStringArray(excludeFieldNames));
    }finally{__CLR4_5_29mc9mclvha7ac6.R.flushNeeded();}}

    /**
     * Converts the given Collection into an array of Strings. The returned array does not contain <code>null</code>
     * entries. Note that {@link Arrays#sort(Object[])} will throw an {@link NullPointerException} if an array element
     * is <code>null</code>.
     *
     * @param collection
     *            The collection to convert
     * @return A new array of Strings.
     */
    static String[] toNoNullStringArray(final Collection<String> collection) {try{__CLR4_5_29mc9mclvha7ac6.R.inc(12482);
        __CLR4_5_29mc9mclvha7ac6.R.inc(12483);if ((((collection == null)&&(__CLR4_5_29mc9mclvha7ac6.R.iget(12484)!=0|true))||(__CLR4_5_29mc9mclvha7ac6.R.iget(12485)==0&false))) {{
            __CLR4_5_29mc9mclvha7ac6.R.inc(12486);return ArrayUtils.EMPTY_STRING_ARRAY;
        }
        }__CLR4_5_29mc9mclvha7ac6.R.inc(12487);return toNoNullStringArray(collection.toArray());
    }finally{__CLR4_5_29mc9mclvha7ac6.R.flushNeeded();}}

    /**
     * Returns a new array of Strings without null elements. Internal method used to normalize exclude lists
     * (arrays and collections). Note that {@link Arrays#sort(Object[])} will throw an {@link NullPointerException}
     * if an array element is <code>null</code>.
     *
     * @param array
     *            The array to check
     * @return The given array or a new array without null.
     */
    static String[] toNoNullStringArray(final Object[] array) {try{__CLR4_5_29mc9mclvha7ac6.R.inc(12488);
        __CLR4_5_29mc9mclvha7ac6.R.inc(12489);final List<String> list = new ArrayList<>(array.length);
        __CLR4_5_29mc9mclvha7ac6.R.inc(12490);for (final Object e : array) {{
            __CLR4_5_29mc9mclvha7ac6.R.inc(12491);if ((((e != null)&&(__CLR4_5_29mc9mclvha7ac6.R.iget(12492)!=0|true))||(__CLR4_5_29mc9mclvha7ac6.R.iget(12493)==0&false))) {{
                __CLR4_5_29mc9mclvha7ac6.R.inc(12494);list.add(e.toString());
            }
        }}
        }__CLR4_5_29mc9mclvha7ac6.R.inc(12495);return list.toArray(ArrayUtils.EMPTY_STRING_ARRAY);
    }finally{__CLR4_5_29mc9mclvha7ac6.R.flushNeeded();}}


    /**
     * Builds a String for a toString method excluding the given field names.
     *
     * @param object
     *            The object to "toString".
     * @param excludeFieldNames
     *            The field names to exclude
     * @return The toString value.
     */
    public static String toStringExclude(final Object object, final String... excludeFieldNames) {try{__CLR4_5_29mc9mclvha7ac6.R.inc(12496);
        __CLR4_5_29mc9mclvha7ac6.R.inc(12497);return new ReflectionToStringBuilder(object).setExcludeFieldNames(excludeFieldNames).toString();
    }finally{__CLR4_5_29mc9mclvha7ac6.R.flushNeeded();}}
    
    private static Object checkNotNull(final Object obj) {try{__CLR4_5_29mc9mclvha7ac6.R.inc(12498);
        __CLR4_5_29mc9mclvha7ac6.R.inc(12499);Validate.isTrue(obj != null, "The Object passed in should not be null.");
        __CLR4_5_29mc9mclvha7ac6.R.inc(12500);return obj;
    }finally{__CLR4_5_29mc9mclvha7ac6.R.flushNeeded();}}

    /**
     * Whether or not to append static fields.
     */
    private boolean appendStatics = false;

    /**
     * Whether or not to append transient fields.
     */
    private boolean appendTransients = false;
    
    /**
     * Whether or not to append fields that are null.
     */
    private boolean excludeNullValues;

    /**
     * Which field names to exclude from output. Intended for fields like <code>"password"</code>.
     *
     * @since 3.0 this is protected instead of private
     */
    protected String[] excludeFieldNames;

    /**
     * The last super class to stop appending fields for.
     */
    private Class<?> upToClass = null;

    /**
     * <p>
     * Constructor.
     * </p>
     *
     * <p>
     * This constructor outputs using the default style set with <code>setDefaultStyle</code>.
     * </p>
     *
     * @param object
     *            the Object to build a <code>toString</code> for, must not be <code>null</code>
     * @throws IllegalArgumentException
     *             if the Object passed in is <code>null</code>
     */
    public ReflectionToStringBuilder(final Object object) {
        super(checkNotNull(object));__CLR4_5_29mc9mclvha7ac6.R.inc(12502);try{__CLR4_5_29mc9mclvha7ac6.R.inc(12501);
    }finally{__CLR4_5_29mc9mclvha7ac6.R.flushNeeded();}}

    /**
     * <p>
     * Constructor.
     * </p>
     *
     * <p>
     * If the style is <code>null</code>, the default style is used.
     * </p>
     *
     * @param object
     *            the Object to build a <code>toString</code> for, must not be <code>null</code>
     * @param style
     *            the style of the <code>toString</code> to create, may be <code>null</code>
     * @throws IllegalArgumentException
     *             if the Object passed in is <code>null</code>
     */
    public ReflectionToStringBuilder(final Object object, final ToStringStyle style) {
        super(checkNotNull(object), style);__CLR4_5_29mc9mclvha7ac6.R.inc(12504);try{__CLR4_5_29mc9mclvha7ac6.R.inc(12503);
    }finally{__CLR4_5_29mc9mclvha7ac6.R.flushNeeded();}}

    /**
     * <p>
     * Constructor.
     * </p>
     *
     * <p>
     * If the style is <code>null</code>, the default style is used.
     * </p>
     *
     * <p>
     * If the buffer is <code>null</code>, a new one is created.
     * </p>
     *
     * @param object
     *            the Object to build a <code>toString</code> for
     * @param style
     *            the style of the <code>toString</code> to create, may be <code>null</code>
     * @param buffer
     *            the <code>StringBuffer</code> to populate, may be <code>null</code>
     * @throws IllegalArgumentException
     *             if the Object passed in is <code>null</code>
     */
    public ReflectionToStringBuilder(final Object object, final ToStringStyle style, final StringBuffer buffer) {
        super(checkNotNull(object), style, buffer);__CLR4_5_29mc9mclvha7ac6.R.inc(12506);try{__CLR4_5_29mc9mclvha7ac6.R.inc(12505);
    }finally{__CLR4_5_29mc9mclvha7ac6.R.flushNeeded();}}

    /**
     * Constructor.
     *
     * @param <T>
     *            the type of the object
     * @param object
     *            the Object to build a <code>toString</code> for
     * @param style
     *            the style of the <code>toString</code> to create, may be <code>null</code>
     * @param buffer
     *            the <code>StringBuffer</code> to populate, may be <code>null</code>
     * @param reflectUpToClass
     *            the superclass to reflect up to (inclusive), may be <code>null</code>
     * @param outputTransients
     *            whether to include transient fields
     * @param outputStatics
     *            whether to include static fields
     * @since 2.1
     */
    public <T> ReflectionToStringBuilder(
            final T object, final ToStringStyle style, final StringBuffer buffer,
            final Class<? super T> reflectUpToClass, final boolean outputTransients, final boolean outputStatics) {
        super(checkNotNull(object), style, buffer);__CLR4_5_29mc9mclvha7ac6.R.inc(12508);try{__CLR4_5_29mc9mclvha7ac6.R.inc(12507);
        __CLR4_5_29mc9mclvha7ac6.R.inc(12509);this.setUpToClass(reflectUpToClass);
        __CLR4_5_29mc9mclvha7ac6.R.inc(12510);this.setAppendTransients(outputTransients);
        __CLR4_5_29mc9mclvha7ac6.R.inc(12511);this.setAppendStatics(outputStatics);
    }finally{__CLR4_5_29mc9mclvha7ac6.R.flushNeeded();}}
    
    /**
     * Constructor.
     *
     * @param <T>
     *            the type of the object
     * @param object
     *            the Object to build a <code>toString</code> for
     * @param style
     *            the style of the <code>toString</code> to create, may be <code>null</code>
     * @param buffer
     *            the <code>StringBuffer</code> to populate, may be <code>null</code>
     * @param reflectUpToClass
     *            the superclass to reflect up to (inclusive), may be <code>null</code>
     * @param outputTransients
     *            whether to include transient fields
     * @param outputStatics
     *            whether to include static fields
     * @param excludeNullValues
     *            whether to exclude fields who value is null
     * @since 3.6
     */
    public <T> ReflectionToStringBuilder(
            final T object, final ToStringStyle style, final StringBuffer buffer,
            final Class<? super T> reflectUpToClass, final boolean outputTransients, final boolean outputStatics,
            final boolean excludeNullValues) {
        super(checkNotNull(object), style, buffer);__CLR4_5_29mc9mclvha7ac6.R.inc(12513);try{__CLR4_5_29mc9mclvha7ac6.R.inc(12512);
        __CLR4_5_29mc9mclvha7ac6.R.inc(12514);this.setUpToClass(reflectUpToClass);
        __CLR4_5_29mc9mclvha7ac6.R.inc(12515);this.setAppendTransients(outputTransients);
        __CLR4_5_29mc9mclvha7ac6.R.inc(12516);this.setAppendStatics(outputStatics);
        __CLR4_5_29mc9mclvha7ac6.R.inc(12517);this.setExcludeNullValues(excludeNullValues);
    }finally{__CLR4_5_29mc9mclvha7ac6.R.flushNeeded();}}

    /**
     * Returns whether or not to append the given <code>Field</code>.
     * <ul>
     * <li>Transient fields are appended only if {@link #isAppendTransients()} returns <code>true</code>.
     * <li>Static fields are appended only if {@link #isAppendStatics()} returns <code>true</code>.
     * <li>Inner class fields are not appended.</li>
     * </ul>
     *
     * @param field
     *            The Field to test.
     * @return Whether or not to append the given <code>Field</code>.
     */
    protected boolean accept(final Field field) {try{__CLR4_5_29mc9mclvha7ac6.R.inc(12518);
        __CLR4_5_29mc9mclvha7ac6.R.inc(12519);if ((((field.getName().indexOf(ClassUtils.INNER_CLASS_SEPARATOR_CHAR) != -1)&&(__CLR4_5_29mc9mclvha7ac6.R.iget(12520)!=0|true))||(__CLR4_5_29mc9mclvha7ac6.R.iget(12521)==0&false))) {{
            // Reject field from inner class.
            __CLR4_5_29mc9mclvha7ac6.R.inc(12522);return false;
        }
        }__CLR4_5_29mc9mclvha7ac6.R.inc(12523);if ((((Modifier.isTransient(field.getModifiers()) && !this.isAppendTransients())&&(__CLR4_5_29mc9mclvha7ac6.R.iget(12524)!=0|true))||(__CLR4_5_29mc9mclvha7ac6.R.iget(12525)==0&false))) {{
            // Reject transient fields.
            __CLR4_5_29mc9mclvha7ac6.R.inc(12526);return false;
        }
        }__CLR4_5_29mc9mclvha7ac6.R.inc(12527);if ((((Modifier.isStatic(field.getModifiers()) && !this.isAppendStatics())&&(__CLR4_5_29mc9mclvha7ac6.R.iget(12528)!=0|true))||(__CLR4_5_29mc9mclvha7ac6.R.iget(12529)==0&false))) {{
            // Reject static fields.
            __CLR4_5_29mc9mclvha7ac6.R.inc(12530);return false;
        }
        }__CLR4_5_29mc9mclvha7ac6.R.inc(12531);if ((((this.excludeFieldNames != null
            && Arrays.binarySearch(this.excludeFieldNames, field.getName()) >= 0)&&(__CLR4_5_29mc9mclvha7ac6.R.iget(12532)!=0|true))||(__CLR4_5_29mc9mclvha7ac6.R.iget(12533)==0&false))) {{
            // Reject fields from the getExcludeFieldNames list.
            __CLR4_5_29mc9mclvha7ac6.R.inc(12534);return false;
        }
        }__CLR4_5_29mc9mclvha7ac6.R.inc(12535);if((((field.isAnnotationPresent(ToStringExclude.class))&&(__CLR4_5_29mc9mclvha7ac6.R.iget(12536)!=0|true))||(__CLR4_5_29mc9mclvha7ac6.R.iget(12537)==0&false))) {{
            __CLR4_5_29mc9mclvha7ac6.R.inc(12538);return false;
        }
        }__CLR4_5_29mc9mclvha7ac6.R.inc(12539);return true;
    }finally{__CLR4_5_29mc9mclvha7ac6.R.flushNeeded();}}

    /**
     * <p>
     * Appends the fields and values defined by the given object of the given Class.
     * </p>
     *
     * <p>
     * If a cycle is detected as an object is &quot;toString()'ed&quot;, such an object is rendered as if
     * <code>Object.toString()</code> had been called and not implemented by the object.
     * </p>
     *
     * @param clazz
     *            The class of object parameter
     */
    protected void appendFieldsIn(final Class<?> clazz) {try{__CLR4_5_29mc9mclvha7ac6.R.inc(12540);
        __CLR4_5_29mc9mclvha7ac6.R.inc(12541);if ((((clazz.isArray())&&(__CLR4_5_29mc9mclvha7ac6.R.iget(12542)!=0|true))||(__CLR4_5_29mc9mclvha7ac6.R.iget(12543)==0&false))) {{
            __CLR4_5_29mc9mclvha7ac6.R.inc(12544);this.reflectionAppendArray(this.getObject());
            __CLR4_5_29mc9mclvha7ac6.R.inc(12545);return;
        }
        }__CLR4_5_29mc9mclvha7ac6.R.inc(12546);final Field[] fields = clazz.getDeclaredFields();
        __CLR4_5_29mc9mclvha7ac6.R.inc(12547);AccessibleObject.setAccessible(fields, true);
        __CLR4_5_29mc9mclvha7ac6.R.inc(12548);for (final Field field : fields) {{
            __CLR4_5_29mc9mclvha7ac6.R.inc(12549);final String fieldName = field.getName();
            __CLR4_5_29mc9mclvha7ac6.R.inc(12550);if ((((this.accept(field))&&(__CLR4_5_29mc9mclvha7ac6.R.iget(12551)!=0|true))||(__CLR4_5_29mc9mclvha7ac6.R.iget(12552)==0&false))) {{
                __CLR4_5_29mc9mclvha7ac6.R.inc(12553);try {
                    // Warning: Field.get(Object) creates wrappers objects
                    // for primitive types.
                    __CLR4_5_29mc9mclvha7ac6.R.inc(12554);final Object fieldValue = this.getValue(field);
                    __CLR4_5_29mc9mclvha7ac6.R.inc(12555);if ((((!excludeNullValues || fieldValue != null)&&(__CLR4_5_29mc9mclvha7ac6.R.iget(12556)!=0|true))||(__CLR4_5_29mc9mclvha7ac6.R.iget(12557)==0&false))) {{
                        __CLR4_5_29mc9mclvha7ac6.R.inc(12558);this.append(fieldName, fieldValue);
                    }
                }} catch (final IllegalAccessException ex) {
                    //this can't happen. Would get a Security exception
                    // instead
                    //throw a runtime exception in case the impossible
                    // happens.
                    __CLR4_5_29mc9mclvha7ac6.R.inc(12559);throw new InternalError("Unexpected IllegalAccessException: " + ex.getMessage());
                }
            }
        }}
    }}finally{__CLR4_5_29mc9mclvha7ac6.R.flushNeeded();}}

    /**
     * @return Returns the excludeFieldNames.
     */
    public String[] getExcludeFieldNames() {try{__CLR4_5_29mc9mclvha7ac6.R.inc(12560);
        __CLR4_5_29mc9mclvha7ac6.R.inc(12561);return this.excludeFieldNames.clone();
    }finally{__CLR4_5_29mc9mclvha7ac6.R.flushNeeded();}}

    /**
     * <p>
     * Gets the last super class to stop appending fields for.
     * </p>
     *
     * @return The last super class to stop appending fields for.
     */
    public Class<?> getUpToClass() {try{__CLR4_5_29mc9mclvha7ac6.R.inc(12562);
        __CLR4_5_29mc9mclvha7ac6.R.inc(12563);return this.upToClass;
    }finally{__CLR4_5_29mc9mclvha7ac6.R.flushNeeded();}}

    /**
     * <p>
     * Calls <code>java.lang.reflect.Field.get(Object)</code>.
     * </p>
     *
     * @param field
     *            The Field to query.
     * @return The Object from the given Field.
     *
     * @throws IllegalArgumentException
     *             see {@link java.lang.reflect.Field#get(Object)}
     * @throws IllegalAccessException
     *             see {@link java.lang.reflect.Field#get(Object)}
     *
     * @see java.lang.reflect.Field#get(Object)
     */
    protected Object getValue(final Field field) throws IllegalArgumentException, IllegalAccessException {try{__CLR4_5_29mc9mclvha7ac6.R.inc(12564);
        __CLR4_5_29mc9mclvha7ac6.R.inc(12565);return field.get(this.getObject());
    }finally{__CLR4_5_29mc9mclvha7ac6.R.flushNeeded();}}

    /**
     * <p>
     * Gets whether or not to append static fields.
     * </p>
     *
     * @return Whether or not to append static fields.
     * @since 2.1
     */
    public boolean isAppendStatics() {try{__CLR4_5_29mc9mclvha7ac6.R.inc(12566);
        __CLR4_5_29mc9mclvha7ac6.R.inc(12567);return this.appendStatics;
    }finally{__CLR4_5_29mc9mclvha7ac6.R.flushNeeded();}}

    /**
     * <p>
     * Gets whether or not to append transient fields.
     * </p>
     *
     * @return Whether or not to append transient fields.
     */
    public boolean isAppendTransients() {try{__CLR4_5_29mc9mclvha7ac6.R.inc(12568);
        __CLR4_5_29mc9mclvha7ac6.R.inc(12569);return this.appendTransients;
    }finally{__CLR4_5_29mc9mclvha7ac6.R.flushNeeded();}}
    
    /**
     * <p>
     * Gets whether or not to append fields whose values are null.
     * </p>
     *
     * @return Whether or not to append fields whose values are null.
     * @since 3.6
     */
    public boolean isExcludeNullValues() {try{__CLR4_5_29mc9mclvha7ac6.R.inc(12570);
        __CLR4_5_29mc9mclvha7ac6.R.inc(12571);return this.excludeNullValues;
    }finally{__CLR4_5_29mc9mclvha7ac6.R.flushNeeded();}}

    /**
     * <p>
     * Append to the <code>toString</code> an <code>Object</code> array.
     * </p>
     *
     * @param array
     *            the array to add to the <code>toString</code>
     * @return this
     */
    public ReflectionToStringBuilder reflectionAppendArray(final Object array) {try{__CLR4_5_29mc9mclvha7ac6.R.inc(12572);
        __CLR4_5_29mc9mclvha7ac6.R.inc(12573);this.getStyle().reflectionAppendArrayDetail(this.getStringBuffer(), null, array);
        __CLR4_5_29mc9mclvha7ac6.R.inc(12574);return this;
    }finally{__CLR4_5_29mc9mclvha7ac6.R.flushNeeded();}}

    /**
     * <p>
     * Sets whether or not to append static fields.
     * </p>
     *
     * @param appendStatics
     *            Whether or not to append static fields.
     * @since 2.1
     */
    public void setAppendStatics(final boolean appendStatics) {try{__CLR4_5_29mc9mclvha7ac6.R.inc(12575);
        __CLR4_5_29mc9mclvha7ac6.R.inc(12576);this.appendStatics = appendStatics;
    }finally{__CLR4_5_29mc9mclvha7ac6.R.flushNeeded();}}

    /**
     * <p>
     * Sets whether or not to append transient fields.
     * </p>
     *
     * @param appendTransients
     *            Whether or not to append transient fields.
     */
    public void setAppendTransients(final boolean appendTransients) {try{__CLR4_5_29mc9mclvha7ac6.R.inc(12577);
        __CLR4_5_29mc9mclvha7ac6.R.inc(12578);this.appendTransients = appendTransients;
    }finally{__CLR4_5_29mc9mclvha7ac6.R.flushNeeded();}}
    
    /**
     * <p>
     * Sets whether or not to append fields whose values are null.
     * </p>
     *
     * @param excludeNullValues
     *            Whether or not to append fields whose values are null.
     * @since 3.6
     */
    public void setExcludeNullValues(final boolean excludeNullValues) {try{__CLR4_5_29mc9mclvha7ac6.R.inc(12579);
        __CLR4_5_29mc9mclvha7ac6.R.inc(12580);this.excludeNullValues = excludeNullValues;
    }finally{__CLR4_5_29mc9mclvha7ac6.R.flushNeeded();}}

    /**
     * Sets the field names to exclude.
     *
     * @param excludeFieldNamesParam
     *            The excludeFieldNames to excluding from toString or <code>null</code>.
     * @return <code>this</code>
     */
    public ReflectionToStringBuilder setExcludeFieldNames(final String... excludeFieldNamesParam) {try{__CLR4_5_29mc9mclvha7ac6.R.inc(12581);
        __CLR4_5_29mc9mclvha7ac6.R.inc(12582);if ((((excludeFieldNamesParam == null)&&(__CLR4_5_29mc9mclvha7ac6.R.iget(12583)!=0|true))||(__CLR4_5_29mc9mclvha7ac6.R.iget(12584)==0&false))) {{
            __CLR4_5_29mc9mclvha7ac6.R.inc(12585);this.excludeFieldNames = null;
        } }else {{
            //clone and remove nulls
            __CLR4_5_29mc9mclvha7ac6.R.inc(12586);this.excludeFieldNames = toNoNullStringArray(excludeFieldNamesParam);
            __CLR4_5_29mc9mclvha7ac6.R.inc(12587);Arrays.sort(this.excludeFieldNames);
        }
        }__CLR4_5_29mc9mclvha7ac6.R.inc(12588);return this;
    }finally{__CLR4_5_29mc9mclvha7ac6.R.flushNeeded();}}

    /**
     * <p>
     * Sets the last super class to stop appending fields for.
     * </p>
     *
     * @param clazz
     *            The last super class to stop appending fields for.
     */
    public void setUpToClass(final Class<?> clazz) {try{__CLR4_5_29mc9mclvha7ac6.R.inc(12589);
        __CLR4_5_29mc9mclvha7ac6.R.inc(12590);if ((((clazz != null)&&(__CLR4_5_29mc9mclvha7ac6.R.iget(12591)!=0|true))||(__CLR4_5_29mc9mclvha7ac6.R.iget(12592)==0&false))) {{
            __CLR4_5_29mc9mclvha7ac6.R.inc(12593);final Object object = getObject();
            __CLR4_5_29mc9mclvha7ac6.R.inc(12594);if ((((object != null && clazz.isInstance(object) == false)&&(__CLR4_5_29mc9mclvha7ac6.R.iget(12595)!=0|true))||(__CLR4_5_29mc9mclvha7ac6.R.iget(12596)==0&false))) {{
                __CLR4_5_29mc9mclvha7ac6.R.inc(12597);throw new IllegalArgumentException("Specified class is not a superclass of the object");
            }
        }}
        }__CLR4_5_29mc9mclvha7ac6.R.inc(12598);this.upToClass = clazz;
    }finally{__CLR4_5_29mc9mclvha7ac6.R.flushNeeded();}}

    /**
     * <p>
     * Gets the String built by this builder.
     * </p>
     *
     * @return the built string
     */
    @Override
    public String toString() {try{__CLR4_5_29mc9mclvha7ac6.R.inc(12599);
        __CLR4_5_29mc9mclvha7ac6.R.inc(12600);if ((((this.getObject() == null)&&(__CLR4_5_29mc9mclvha7ac6.R.iget(12601)!=0|true))||(__CLR4_5_29mc9mclvha7ac6.R.iget(12602)==0&false))) {{
            __CLR4_5_29mc9mclvha7ac6.R.inc(12603);return this.getStyle().getNullText();
        }
        }__CLR4_5_29mc9mclvha7ac6.R.inc(12604);Class<?> clazz = this.getObject().getClass();
        __CLR4_5_29mc9mclvha7ac6.R.inc(12605);this.appendFieldsIn(clazz);
        __CLR4_5_29mc9mclvha7ac6.R.inc(12606);while ((((clazz.getSuperclass() != null && clazz != this.getUpToClass())&&(__CLR4_5_29mc9mclvha7ac6.R.iget(12607)!=0|true))||(__CLR4_5_29mc9mclvha7ac6.R.iget(12608)==0&false))) {{
            __CLR4_5_29mc9mclvha7ac6.R.inc(12609);clazz = clazz.getSuperclass();
            __CLR4_5_29mc9mclvha7ac6.R.inc(12610);this.appendFieldsIn(clazz);
        }
        }__CLR4_5_29mc9mclvha7ac6.R.inc(12611);return super.toString();
    }finally{__CLR4_5_29mc9mclvha7ac6.R.flushNeeded();}}

}
