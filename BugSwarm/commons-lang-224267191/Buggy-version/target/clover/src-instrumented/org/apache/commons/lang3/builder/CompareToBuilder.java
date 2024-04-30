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
import java.util.Comparator;

import org.apache.commons.lang3.ArrayUtils;

/** 
 * Assists in implementing {@link java.lang.Comparable#compareTo(Object)} methods.
 *
 * <p>It is consistent with <code>equals(Object)</code> and
 * <code>hashcode()</code> built with {@link EqualsBuilder} and
 * {@link HashCodeBuilder}.</p>
 *
 * <p>Two Objects that compare equal using <code>equals(Object)</code> should normally
 * also compare equal using <code>compareTo(Object)</code>.</p>
 *
 * <p>All relevant fields should be included in the calculation of the
 * comparison. Derived fields may be ignored. The same fields, in the same
 * order, should be used in both <code>compareTo(Object)</code> and
 * <code>equals(Object)</code>.</p>
 *
 * <p>To use this class write code as follows:</p>
 *
 * <pre>
 * public class MyClass {
 *   String field1;
 *   int field2;
 *   boolean field3;
 *
 *   ...
 *
 *   public int compareTo(Object o) {
 *     MyClass myClass = (MyClass) o;
 *     return new CompareToBuilder()
 *       .appendSuper(super.compareTo(o)
 *       .append(this.field1, myClass.field1)
 *       .append(this.field2, myClass.field2)
 *       .append(this.field3, myClass.field3)
 *       .toComparison();
 *   }
 * }
 * </pre>
 * 
 * <p>Values are compared in the order they are appended to the builder. If any comparison returns
 * a non-zero result, then that value will be the result returned by {@code toComparison()} and all
 * subsequent comparisons are skipped.</p>
 *
 * <p>Alternatively, there are {@link #reflectionCompare(Object, Object) reflectionCompare} methods that use
 * reflection to determine the fields to append. Because fields can be private,
 * <code>reflectionCompare</code> uses {@link java.lang.reflect.AccessibleObject#setAccessible(boolean)} to
 * bypass normal access control checks. This will fail under a security manager,
 * unless the appropriate permissions are set up correctly. It is also
 * slower than appending explicitly.</p>
 *
 * <p>A typical implementation of <code>compareTo(Object)</code> using
 * <code>reflectionCompare</code> looks like:</p>

 * <pre>
 * public int compareTo(Object o) {
 *   return CompareToBuilder.reflectionCompare(this, o);
 * }
 * </pre>
 * 
 * <p>The reflective methods compare object fields in the order returned by 
 * {@link Class#getDeclaredFields()}. The fields of the class are compared first, followed by those
 * of its parent classes (in order from the bottom to the top of the class hierarchy).</p>
 *
 * @see java.lang.Comparable
 * @see java.lang.Object#equals(Object)
 * @see java.lang.Object#hashCode()
 * @see EqualsBuilder
 * @see HashCodeBuilder
 * @since 1.0
 */
public class CompareToBuilder implements Builder<Integer> {public static class __CLR4_5_28ag8aglvha7a5g{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172755542L,8589935092L,11233,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    
    /**
     * Current state of the comparison as appended fields are checked.
     */
    private int comparison;

    /**
     * <p>Constructor for CompareToBuilder.</p>
     *
     * <p>Starts off assuming that the objects are equal. Multiple calls are 
     * then made to the various append methods, followed by a call to 
     * {@link #toComparison} to get the result.</p>
     */
    public CompareToBuilder() {
        super();__CLR4_5_28ag8aglvha7a5g.R.inc(10745);try{__CLR4_5_28ag8aglvha7a5g.R.inc(10744);
        __CLR4_5_28ag8aglvha7a5g.R.inc(10746);comparison = 0;
    }finally{__CLR4_5_28ag8aglvha7a5g.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /** 
     * <p>Compares two <code>Object</code>s via reflection.</p>
     *
     * <p>Fields can be private, thus <code>AccessibleObject.setAccessible</code>
     * is used to bypass normal access control checks. This will fail under a 
     * security manager unless the appropriate permissions are set.</p>
     *
     * <ul>
     * <li>Static fields will not be compared</li>
     * <li>Transient members will be not be compared, as they are likely derived
     *     fields</li>
     * <li>Superclass fields will be compared</li>
     * </ul>
     *
     * <p>If both <code>lhs</code> and <code>rhs</code> are <code>null</code>,
     * they are considered equal.</p>
     *
     * @param lhs  left-hand object
     * @param rhs  right-hand object
     * @return a negative integer, zero, or a positive integer as <code>lhs</code>
     *  is less than, equal to, or greater than <code>rhs</code>
     * @throws NullPointerException  if either (but not both) parameters are
     *  <code>null</code>
     * @throws ClassCastException  if <code>rhs</code> is not assignment-compatible
     *  with <code>lhs</code>
     */
    public static int reflectionCompare(final Object lhs, final Object rhs) {try{__CLR4_5_28ag8aglvha7a5g.R.inc(10747);
        __CLR4_5_28ag8aglvha7a5g.R.inc(10748);return reflectionCompare(lhs, rhs, false, null);
    }finally{__CLR4_5_28ag8aglvha7a5g.R.flushNeeded();}}

    /**
     * <p>Compares two <code>Object</code>s via reflection.</p>
     *
     * <p>Fields can be private, thus <code>AccessibleObject.setAccessible</code>
     * is used to bypass normal access control checks. This will fail under a 
     * security manager unless the appropriate permissions are set.</p>
     *
     * <ul>
     * <li>Static fields will not be compared</li>
     * <li>If <code>compareTransients</code> is <code>true</code>,
     *     compares transient members.  Otherwise ignores them, as they
     *     are likely derived fields.</li>
     * <li>Superclass fields will be compared</li>
     * </ul>
     *
     * <p>If both <code>lhs</code> and <code>rhs</code> are <code>null</code>,
     * they are considered equal.</p>
     *
     * @param lhs  left-hand object
     * @param rhs  right-hand object
     * @param compareTransients  whether to compare transient fields
     * @return a negative integer, zero, or a positive integer as <code>lhs</code>
     *  is less than, equal to, or greater than <code>rhs</code>
     * @throws NullPointerException  if either <code>lhs</code> or <code>rhs</code>
     *  (but not both) is <code>null</code>
     * @throws ClassCastException  if <code>rhs</code> is not assignment-compatible
     *  with <code>lhs</code>
     */
    public static int reflectionCompare(final Object lhs, final Object rhs, final boolean compareTransients) {try{__CLR4_5_28ag8aglvha7a5g.R.inc(10749);
        __CLR4_5_28ag8aglvha7a5g.R.inc(10750);return reflectionCompare(lhs, rhs, compareTransients, null);
    }finally{__CLR4_5_28ag8aglvha7a5g.R.flushNeeded();}}

    /**
     * <p>Compares two <code>Object</code>s via reflection.</p>
     *
     * <p>Fields can be private, thus <code>AccessibleObject.setAccessible</code>
     * is used to bypass normal access control checks. This will fail under a 
     * security manager unless the appropriate permissions are set.</p>
     *
     * <ul>
     * <li>Static fields will not be compared</li>
     * <li>If <code>compareTransients</code> is <code>true</code>,
     *     compares transient members.  Otherwise ignores them, as they
     *     are likely derived fields.</li>
     * <li>Superclass fields will be compared</li>
     * </ul>
     *
     * <p>If both <code>lhs</code> and <code>rhs</code> are <code>null</code>,
     * they are considered equal.</p>
     *
     * @param lhs  left-hand object
     * @param rhs  right-hand object
     * @param excludeFields  Collection of String fields to exclude
     * @return a negative integer, zero, or a positive integer as <code>lhs</code>
     *  is less than, equal to, or greater than <code>rhs</code>
     * @throws NullPointerException  if either <code>lhs</code> or <code>rhs</code>
     *  (but not both) is <code>null</code>
     * @throws ClassCastException  if <code>rhs</code> is not assignment-compatible
     *  with <code>lhs</code>
     * @since 2.2
     */
    public static int reflectionCompare(final Object lhs, final Object rhs, final Collection<String> excludeFields) {try{__CLR4_5_28ag8aglvha7a5g.R.inc(10751);
        __CLR4_5_28ag8aglvha7a5g.R.inc(10752);return reflectionCompare(lhs, rhs, ReflectionToStringBuilder.toNoNullStringArray(excludeFields));
    }finally{__CLR4_5_28ag8aglvha7a5g.R.flushNeeded();}}

    /**
     * <p>Compares two <code>Object</code>s via reflection.</p>
     *
     * <p>Fields can be private, thus <code>AccessibleObject.setAccessible</code>
     * is used to bypass normal access control checks. This will fail under a 
     * security manager unless the appropriate permissions are set.</p>
     *
     * <ul>
     * <li>Static fields will not be compared</li>
     * <li>If <code>compareTransients</code> is <code>true</code>,
     *     compares transient members.  Otherwise ignores them, as they
     *     are likely derived fields.</li>
     * <li>Superclass fields will be compared</li>
     * </ul>
     *
     * <p>If both <code>lhs</code> and <code>rhs</code> are <code>null</code>,
     * they are considered equal.</p>
     *
     * @param lhs  left-hand object
     * @param rhs  right-hand object
     * @param excludeFields  array of fields to exclude
     * @return a negative integer, zero, or a positive integer as <code>lhs</code>
     *  is less than, equal to, or greater than <code>rhs</code>
     * @throws NullPointerException  if either <code>lhs</code> or <code>rhs</code>
     *  (but not both) is <code>null</code>
     * @throws ClassCastException  if <code>rhs</code> is not assignment-compatible
     *  with <code>lhs</code>
     * @since 2.2
     */
    public static int reflectionCompare(final Object lhs, final Object rhs, final String... excludeFields) {try{__CLR4_5_28ag8aglvha7a5g.R.inc(10753);
        __CLR4_5_28ag8aglvha7a5g.R.inc(10754);return reflectionCompare(lhs, rhs, false, null, excludeFields);
    }finally{__CLR4_5_28ag8aglvha7a5g.R.flushNeeded();}}

    /**
     * <p>Compares two <code>Object</code>s via reflection.</p>
     *
     * <p>Fields can be private, thus <code>AccessibleObject.setAccessible</code>
     * is used to bypass normal access control checks. This will fail under a 
     * security manager unless the appropriate permissions are set.</p>
     *
     * <ul>
     * <li>Static fields will not be compared</li>
     * <li>If the <code>compareTransients</code> is <code>true</code>,
     *     compares transient members.  Otherwise ignores them, as they
     *     are likely derived fields.</li>
     * <li>Compares superclass fields up to and including <code>reflectUpToClass</code>.
     *     If <code>reflectUpToClass</code> is <code>null</code>, compares all superclass fields.</li>
     * </ul>
     *
     * <p>If both <code>lhs</code> and <code>rhs</code> are <code>null</code>,
     * they are considered equal.</p>
     *
     * @param lhs  left-hand object
     * @param rhs  right-hand object
     * @param compareTransients  whether to compare transient fields
     * @param reflectUpToClass  last superclass for which fields are compared
     * @param excludeFields  fields to exclude
     * @return a negative integer, zero, or a positive integer as <code>lhs</code>
     *  is less than, equal to, or greater than <code>rhs</code>
     * @throws NullPointerException  if either <code>lhs</code> or <code>rhs</code>
     *  (but not both) is <code>null</code>
     * @throws ClassCastException  if <code>rhs</code> is not assignment-compatible
     *  with <code>lhs</code>
     * @since 2.2 (2.0 as <code>reflectionCompare(Object, Object, boolean, Class)</code>)
     */
    public static int reflectionCompare(
        final Object lhs, 
        final Object rhs, 
        final boolean compareTransients, 
        final Class<?> reflectUpToClass, 
        final String... excludeFields) {try{__CLR4_5_28ag8aglvha7a5g.R.inc(10755);

        __CLR4_5_28ag8aglvha7a5g.R.inc(10756);if ((((lhs == rhs)&&(__CLR4_5_28ag8aglvha7a5g.R.iget(10757)!=0|true))||(__CLR4_5_28ag8aglvha7a5g.R.iget(10758)==0&false))) {{
            __CLR4_5_28ag8aglvha7a5g.R.inc(10759);return 0;
        }
        }__CLR4_5_28ag8aglvha7a5g.R.inc(10760);if ((((lhs == null || rhs == null)&&(__CLR4_5_28ag8aglvha7a5g.R.iget(10761)!=0|true))||(__CLR4_5_28ag8aglvha7a5g.R.iget(10762)==0&false))) {{
            __CLR4_5_28ag8aglvha7a5g.R.inc(10763);throw new NullPointerException();
        }
        }__CLR4_5_28ag8aglvha7a5g.R.inc(10764);Class<?> lhsClazz = lhs.getClass();
        __CLR4_5_28ag8aglvha7a5g.R.inc(10765);if ((((!lhsClazz.isInstance(rhs))&&(__CLR4_5_28ag8aglvha7a5g.R.iget(10766)!=0|true))||(__CLR4_5_28ag8aglvha7a5g.R.iget(10767)==0&false))) {{
            __CLR4_5_28ag8aglvha7a5g.R.inc(10768);throw new ClassCastException();
        }
        }__CLR4_5_28ag8aglvha7a5g.R.inc(10769);final CompareToBuilder compareToBuilder = new CompareToBuilder();
        __CLR4_5_28ag8aglvha7a5g.R.inc(10770);reflectionAppend(lhs, rhs, lhsClazz, compareToBuilder, compareTransients, excludeFields);
        __CLR4_5_28ag8aglvha7a5g.R.inc(10771);while ((((lhsClazz.getSuperclass() != null && lhsClazz != reflectUpToClass)&&(__CLR4_5_28ag8aglvha7a5g.R.iget(10772)!=0|true))||(__CLR4_5_28ag8aglvha7a5g.R.iget(10773)==0&false))) {{
            __CLR4_5_28ag8aglvha7a5g.R.inc(10774);lhsClazz = lhsClazz.getSuperclass();
            __CLR4_5_28ag8aglvha7a5g.R.inc(10775);reflectionAppend(lhs, rhs, lhsClazz, compareToBuilder, compareTransients, excludeFields);
        }
        }__CLR4_5_28ag8aglvha7a5g.R.inc(10776);return compareToBuilder.toComparison();
    }finally{__CLR4_5_28ag8aglvha7a5g.R.flushNeeded();}}

    /**
     * <p>Appends to <code>builder</code> the comparison of <code>lhs</code>
     * to <code>rhs</code> using the fields defined in <code>clazz</code>.</p>
     * 
     * @param lhs  left-hand object
     * @param rhs  right-hand object
     * @param clazz  <code>Class</code> that defines fields to be compared
     * @param builder  <code>CompareToBuilder</code> to append to
     * @param useTransients  whether to compare transient fields
     * @param excludeFields  fields to exclude
     */
    private static void reflectionAppend(
        final Object lhs,
        final Object rhs,
        final Class<?> clazz,
        final CompareToBuilder builder,
        final boolean useTransients,
        final String[] excludeFields) {try{__CLR4_5_28ag8aglvha7a5g.R.inc(10777);
        
        __CLR4_5_28ag8aglvha7a5g.R.inc(10778);final Field[] fields = clazz.getDeclaredFields();
        __CLR4_5_28ag8aglvha7a5g.R.inc(10779);AccessibleObject.setAccessible(fields, true);
        __CLR4_5_28ag8aglvha7a5g.R.inc(10780);for (int i = 0; (((i < fields.length && builder.comparison == 0)&&(__CLR4_5_28ag8aglvha7a5g.R.iget(10781)!=0|true))||(__CLR4_5_28ag8aglvha7a5g.R.iget(10782)==0&false)); i++) {{
            __CLR4_5_28ag8aglvha7a5g.R.inc(10783);final Field f = fields[i];
            __CLR4_5_28ag8aglvha7a5g.R.inc(10784);if ((((!ArrayUtils.contains(excludeFields, f.getName())
                && !f.getName().contains("$")
                && (useTransients || !Modifier.isTransient(f.getModifiers()))
                && !Modifier.isStatic(f.getModifiers()))&&(__CLR4_5_28ag8aglvha7a5g.R.iget(10785)!=0|true))||(__CLR4_5_28ag8aglvha7a5g.R.iget(10786)==0&false))) {{
                __CLR4_5_28ag8aglvha7a5g.R.inc(10787);try {
                    __CLR4_5_28ag8aglvha7a5g.R.inc(10788);builder.append(f.get(lhs), f.get(rhs));
                } catch (final IllegalAccessException e) {
                    // This can't happen. Would get a Security exception instead.
                    // Throw a runtime exception in case the impossible happens.
                    __CLR4_5_28ag8aglvha7a5g.R.inc(10789);throw new InternalError("Unexpected IllegalAccessException");
                }
            }
        }}
    }}finally{__CLR4_5_28ag8aglvha7a5g.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * <p>Appends to the <code>builder</code> the <code>compareTo(Object)</code>
     * result of the superclass.</p>
     *
     * @param superCompareTo  result of calling <code>super.compareTo(Object)</code>
     * @return this - used to chain append calls
     * @since 2.0
     */
    public CompareToBuilder appendSuper(final int superCompareTo) {try{__CLR4_5_28ag8aglvha7a5g.R.inc(10790);
        __CLR4_5_28ag8aglvha7a5g.R.inc(10791);if ((((comparison != 0)&&(__CLR4_5_28ag8aglvha7a5g.R.iget(10792)!=0|true))||(__CLR4_5_28ag8aglvha7a5g.R.iget(10793)==0&false))) {{
            __CLR4_5_28ag8aglvha7a5g.R.inc(10794);return this;
        }
        }__CLR4_5_28ag8aglvha7a5g.R.inc(10795);comparison = superCompareTo;
        __CLR4_5_28ag8aglvha7a5g.R.inc(10796);return this;
    }finally{__CLR4_5_28ag8aglvha7a5g.R.flushNeeded();}}
    
    //-----------------------------------------------------------------------
    /**
     * <p>Appends to the <code>builder</code> the comparison of
     * two <code>Object</code>s.</p>
     *
     * <ol>
     * <li>Check if <code>lhs == rhs</code></li>
     * <li>Check if either <code>lhs</code> or <code>rhs</code> is <code>null</code>,
     *     a <code>null</code> object is less than a non-<code>null</code> object</li>
     * <li>Check the object contents</li>
     * </ol>
     * 
     * <p><code>lhs</code> must either be an array or implement {@link Comparable}.</p>
     *
     * @param lhs  left-hand object
     * @param rhs  right-hand object
     * @return this - used to chain append calls
     * @throws ClassCastException  if <code>rhs</code> is not assignment-compatible
     *  with <code>lhs</code>
     */
    public CompareToBuilder append(final Object lhs, final Object rhs) {try{__CLR4_5_28ag8aglvha7a5g.R.inc(10797);
        __CLR4_5_28ag8aglvha7a5g.R.inc(10798);return append(lhs, rhs, null);
    }finally{__CLR4_5_28ag8aglvha7a5g.R.flushNeeded();}}

    /**
     * <p>Appends to the <code>builder</code> the comparison of
     * two <code>Object</code>s.</p>
     *
     * <ol>
     * <li>Check if <code>lhs == rhs</code></li>
     * <li>Check if either <code>lhs</code> or <code>rhs</code> is <code>null</code>,
     *     a <code>null</code> object is less than a non-<code>null</code> object</li>
     * <li>Check the object contents</li>
     * </ol>
     *
     * <p>If <code>lhs</code> is an array, array comparison methods will be used.
     * Otherwise <code>comparator</code> will be used to compare the objects.
     * If <code>comparator</code> is <code>null</code>, <code>lhs</code> must
     * implement {@link Comparable} instead.</p>
     *
     * @param lhs  left-hand object
     * @param rhs  right-hand object
     * @param comparator  <code>Comparator</code> used to compare the objects,
     *  <code>null</code> means treat lhs as <code>Comparable</code>
     * @return this - used to chain append calls
     * @throws ClassCastException  if <code>rhs</code> is not assignment-compatible
     *  with <code>lhs</code>
     * @since 2.0
     */
    public CompareToBuilder append(final Object lhs, final Object rhs, final Comparator<?> comparator) {try{__CLR4_5_28ag8aglvha7a5g.R.inc(10799);
        __CLR4_5_28ag8aglvha7a5g.R.inc(10800);if ((((comparison != 0)&&(__CLR4_5_28ag8aglvha7a5g.R.iget(10801)!=0|true))||(__CLR4_5_28ag8aglvha7a5g.R.iget(10802)==0&false))) {{
            __CLR4_5_28ag8aglvha7a5g.R.inc(10803);return this;
        }
        }__CLR4_5_28ag8aglvha7a5g.R.inc(10804);if ((((lhs == rhs)&&(__CLR4_5_28ag8aglvha7a5g.R.iget(10805)!=0|true))||(__CLR4_5_28ag8aglvha7a5g.R.iget(10806)==0&false))) {{
            __CLR4_5_28ag8aglvha7a5g.R.inc(10807);return this;
        }
        }__CLR4_5_28ag8aglvha7a5g.R.inc(10808);if ((((lhs == null)&&(__CLR4_5_28ag8aglvha7a5g.R.iget(10809)!=0|true))||(__CLR4_5_28ag8aglvha7a5g.R.iget(10810)==0&false))) {{
            __CLR4_5_28ag8aglvha7a5g.R.inc(10811);comparison = -1;
            __CLR4_5_28ag8aglvha7a5g.R.inc(10812);return this;
        }
        }__CLR4_5_28ag8aglvha7a5g.R.inc(10813);if ((((rhs == null)&&(__CLR4_5_28ag8aglvha7a5g.R.iget(10814)!=0|true))||(__CLR4_5_28ag8aglvha7a5g.R.iget(10815)==0&false))) {{
            __CLR4_5_28ag8aglvha7a5g.R.inc(10816);comparison = +1;
            __CLR4_5_28ag8aglvha7a5g.R.inc(10817);return this;
        }
        }__CLR4_5_28ag8aglvha7a5g.R.inc(10818);if ((((lhs.getClass().isArray())&&(__CLR4_5_28ag8aglvha7a5g.R.iget(10819)!=0|true))||(__CLR4_5_28ag8aglvha7a5g.R.iget(10820)==0&false))) {{
            // factor out array case in order to keep method small enough to be inlined
            __CLR4_5_28ag8aglvha7a5g.R.inc(10821);appendArray(lhs, rhs, comparator);
        } }else {{
            // the simple case, not an array, just test the element
            __CLR4_5_28ag8aglvha7a5g.R.inc(10822);if ((((comparator == null)&&(__CLR4_5_28ag8aglvha7a5g.R.iget(10823)!=0|true))||(__CLR4_5_28ag8aglvha7a5g.R.iget(10824)==0&false))) {{
                __CLR4_5_28ag8aglvha7a5g.R.inc(10825);@SuppressWarnings("unchecked") // assume this can be done; if not throw CCE as per Javadoc
                final Comparable<Object> comparable = (Comparable<Object>) lhs;
                __CLR4_5_28ag8aglvha7a5g.R.inc(10826);comparison = comparable.compareTo(rhs);
            } }else {{
                __CLR4_5_28ag8aglvha7a5g.R.inc(10827);@SuppressWarnings("unchecked") // assume this can be done; if not throw CCE as per Javadoc
                final Comparator<Object> comparator2 = (Comparator<Object>) comparator;
                __CLR4_5_28ag8aglvha7a5g.R.inc(10828);comparison = comparator2.compare(lhs, rhs);
            }
        }}
        }__CLR4_5_28ag8aglvha7a5g.R.inc(10829);return this;
    }finally{__CLR4_5_28ag8aglvha7a5g.R.flushNeeded();}}

    private void appendArray(final Object lhs, final Object rhs, final Comparator<?> comparator) {try{__CLR4_5_28ag8aglvha7a5g.R.inc(10830);
        // switch on type of array, to dispatch to the correct handler
        // handles multi dimensional arrays
        // throws a ClassCastException if rhs is not the correct array type
        __CLR4_5_28ag8aglvha7a5g.R.inc(10831);if ((((lhs instanceof long[])&&(__CLR4_5_28ag8aglvha7a5g.R.iget(10832)!=0|true))||(__CLR4_5_28ag8aglvha7a5g.R.iget(10833)==0&false))) {{
            __CLR4_5_28ag8aglvha7a5g.R.inc(10834);append((long[]) lhs, (long[]) rhs);
        } }else {__CLR4_5_28ag8aglvha7a5g.R.inc(10835);if ((((lhs instanceof int[])&&(__CLR4_5_28ag8aglvha7a5g.R.iget(10836)!=0|true))||(__CLR4_5_28ag8aglvha7a5g.R.iget(10837)==0&false))) {{
            __CLR4_5_28ag8aglvha7a5g.R.inc(10838);append((int[]) lhs, (int[]) rhs);
        } }else {__CLR4_5_28ag8aglvha7a5g.R.inc(10839);if ((((lhs instanceof short[])&&(__CLR4_5_28ag8aglvha7a5g.R.iget(10840)!=0|true))||(__CLR4_5_28ag8aglvha7a5g.R.iget(10841)==0&false))) {{
            __CLR4_5_28ag8aglvha7a5g.R.inc(10842);append((short[]) lhs, (short[]) rhs);
        } }else {__CLR4_5_28ag8aglvha7a5g.R.inc(10843);if ((((lhs instanceof char[])&&(__CLR4_5_28ag8aglvha7a5g.R.iget(10844)!=0|true))||(__CLR4_5_28ag8aglvha7a5g.R.iget(10845)==0&false))) {{
            __CLR4_5_28ag8aglvha7a5g.R.inc(10846);append((char[]) lhs, (char[]) rhs);
        } }else {__CLR4_5_28ag8aglvha7a5g.R.inc(10847);if ((((lhs instanceof byte[])&&(__CLR4_5_28ag8aglvha7a5g.R.iget(10848)!=0|true))||(__CLR4_5_28ag8aglvha7a5g.R.iget(10849)==0&false))) {{
            __CLR4_5_28ag8aglvha7a5g.R.inc(10850);append((byte[]) lhs, (byte[]) rhs);
        } }else {__CLR4_5_28ag8aglvha7a5g.R.inc(10851);if ((((lhs instanceof double[])&&(__CLR4_5_28ag8aglvha7a5g.R.iget(10852)!=0|true))||(__CLR4_5_28ag8aglvha7a5g.R.iget(10853)==0&false))) {{
            __CLR4_5_28ag8aglvha7a5g.R.inc(10854);append((double[]) lhs, (double[]) rhs);
        } }else {__CLR4_5_28ag8aglvha7a5g.R.inc(10855);if ((((lhs instanceof float[])&&(__CLR4_5_28ag8aglvha7a5g.R.iget(10856)!=0|true))||(__CLR4_5_28ag8aglvha7a5g.R.iget(10857)==0&false))) {{
            __CLR4_5_28ag8aglvha7a5g.R.inc(10858);append((float[]) lhs, (float[]) rhs);
        } }else {__CLR4_5_28ag8aglvha7a5g.R.inc(10859);if ((((lhs instanceof boolean[])&&(__CLR4_5_28ag8aglvha7a5g.R.iget(10860)!=0|true))||(__CLR4_5_28ag8aglvha7a5g.R.iget(10861)==0&false))) {{
            __CLR4_5_28ag8aglvha7a5g.R.inc(10862);append((boolean[]) lhs, (boolean[]) rhs);
        } }else {{
            // not an array of primitives
            // throws a ClassCastException if rhs is not an array
            __CLR4_5_28ag8aglvha7a5g.R.inc(10863);append((Object[]) lhs, (Object[]) rhs, comparator);
        }
    }}}}}}}}}finally{__CLR4_5_28ag8aglvha7a5g.R.flushNeeded();}}

    //-------------------------------------------------------------------------
    /**
     * Appends to the <code>builder</code> the comparison of
     * two <code>long</code>s.
     *
     * @param lhs  left-hand value
     * @param rhs  right-hand value
     * @return this - used to chain append calls
     */
    public CompareToBuilder append(final long lhs, final long rhs) {try{__CLR4_5_28ag8aglvha7a5g.R.inc(10864);
        __CLR4_5_28ag8aglvha7a5g.R.inc(10865);if ((((comparison != 0)&&(__CLR4_5_28ag8aglvha7a5g.R.iget(10866)!=0|true))||(__CLR4_5_28ag8aglvha7a5g.R.iget(10867)==0&false))) {{
            __CLR4_5_28ag8aglvha7a5g.R.inc(10868);return this;
        }
        }__CLR4_5_28ag8aglvha7a5g.R.inc(10869);comparison = (((lhs < rhs )&&(__CLR4_5_28ag8aglvha7a5g.R.iget(10870)!=0|true))||(__CLR4_5_28ag8aglvha7a5g.R.iget(10871)==0&false))? -1 : (((lhs > rhs )&&(__CLR4_5_28ag8aglvha7a5g.R.iget(10872)!=0|true))||(__CLR4_5_28ag8aglvha7a5g.R.iget(10873)==0&false))? 1 : 0;
        __CLR4_5_28ag8aglvha7a5g.R.inc(10874);return this;
    }finally{__CLR4_5_28ag8aglvha7a5g.R.flushNeeded();}}

    /**
     * Appends to the <code>builder</code> the comparison of
     * two <code>int</code>s.
     *
     * @param lhs  left-hand value
     * @param rhs  right-hand value
     * @return this - used to chain append calls
     */
    public CompareToBuilder append(final int lhs, final int rhs) {try{__CLR4_5_28ag8aglvha7a5g.R.inc(10875);
        __CLR4_5_28ag8aglvha7a5g.R.inc(10876);if ((((comparison != 0)&&(__CLR4_5_28ag8aglvha7a5g.R.iget(10877)!=0|true))||(__CLR4_5_28ag8aglvha7a5g.R.iget(10878)==0&false))) {{
            __CLR4_5_28ag8aglvha7a5g.R.inc(10879);return this;
        }
        }__CLR4_5_28ag8aglvha7a5g.R.inc(10880);comparison = (((lhs < rhs )&&(__CLR4_5_28ag8aglvha7a5g.R.iget(10881)!=0|true))||(__CLR4_5_28ag8aglvha7a5g.R.iget(10882)==0&false))? -1 : (((lhs > rhs )&&(__CLR4_5_28ag8aglvha7a5g.R.iget(10883)!=0|true))||(__CLR4_5_28ag8aglvha7a5g.R.iget(10884)==0&false))? 1 : 0;
        __CLR4_5_28ag8aglvha7a5g.R.inc(10885);return this;
    }finally{__CLR4_5_28ag8aglvha7a5g.R.flushNeeded();}}

    /**
     * Appends to the <code>builder</code> the comparison of
     * two <code>short</code>s.
     * 
     * @param lhs  left-hand value
     * @param rhs  right-hand value
     * @return this - used to chain append calls
     */
    public CompareToBuilder append(final short lhs, final short rhs) {try{__CLR4_5_28ag8aglvha7a5g.R.inc(10886);
        __CLR4_5_28ag8aglvha7a5g.R.inc(10887);if ((((comparison != 0)&&(__CLR4_5_28ag8aglvha7a5g.R.iget(10888)!=0|true))||(__CLR4_5_28ag8aglvha7a5g.R.iget(10889)==0&false))) {{
            __CLR4_5_28ag8aglvha7a5g.R.inc(10890);return this;
        }
        }__CLR4_5_28ag8aglvha7a5g.R.inc(10891);comparison = (((lhs < rhs )&&(__CLR4_5_28ag8aglvha7a5g.R.iget(10892)!=0|true))||(__CLR4_5_28ag8aglvha7a5g.R.iget(10893)==0&false))? -1 : (((lhs > rhs )&&(__CLR4_5_28ag8aglvha7a5g.R.iget(10894)!=0|true))||(__CLR4_5_28ag8aglvha7a5g.R.iget(10895)==0&false))? 1 : 0;
        __CLR4_5_28ag8aglvha7a5g.R.inc(10896);return this;
    }finally{__CLR4_5_28ag8aglvha7a5g.R.flushNeeded();}}

    /**
     * Appends to the <code>builder</code> the comparison of
     * two <code>char</code>s.
     *
     * @param lhs  left-hand value
     * @param rhs  right-hand value
     * @return this - used to chain append calls
     */
    public CompareToBuilder append(final char lhs, final char rhs) {try{__CLR4_5_28ag8aglvha7a5g.R.inc(10897);
        __CLR4_5_28ag8aglvha7a5g.R.inc(10898);if ((((comparison != 0)&&(__CLR4_5_28ag8aglvha7a5g.R.iget(10899)!=0|true))||(__CLR4_5_28ag8aglvha7a5g.R.iget(10900)==0&false))) {{
            __CLR4_5_28ag8aglvha7a5g.R.inc(10901);return this;
        }
        }__CLR4_5_28ag8aglvha7a5g.R.inc(10902);comparison = (((lhs < rhs )&&(__CLR4_5_28ag8aglvha7a5g.R.iget(10903)!=0|true))||(__CLR4_5_28ag8aglvha7a5g.R.iget(10904)==0&false))? -1 : (((lhs > rhs )&&(__CLR4_5_28ag8aglvha7a5g.R.iget(10905)!=0|true))||(__CLR4_5_28ag8aglvha7a5g.R.iget(10906)==0&false))? 1 : 0;
        __CLR4_5_28ag8aglvha7a5g.R.inc(10907);return this;
    }finally{__CLR4_5_28ag8aglvha7a5g.R.flushNeeded();}}

    /**
     * Appends to the <code>builder</code> the comparison of
     * two <code>byte</code>s.
     * 
     * @param lhs  left-hand value
     * @param rhs  right-hand value
     * @return this - used to chain append calls
     */
    public CompareToBuilder append(final byte lhs, final byte rhs) {try{__CLR4_5_28ag8aglvha7a5g.R.inc(10908);
        __CLR4_5_28ag8aglvha7a5g.R.inc(10909);if ((((comparison != 0)&&(__CLR4_5_28ag8aglvha7a5g.R.iget(10910)!=0|true))||(__CLR4_5_28ag8aglvha7a5g.R.iget(10911)==0&false))) {{
            __CLR4_5_28ag8aglvha7a5g.R.inc(10912);return this;
        }
        }__CLR4_5_28ag8aglvha7a5g.R.inc(10913);comparison = (((lhs < rhs )&&(__CLR4_5_28ag8aglvha7a5g.R.iget(10914)!=0|true))||(__CLR4_5_28ag8aglvha7a5g.R.iget(10915)==0&false))? -1 : (((lhs > rhs )&&(__CLR4_5_28ag8aglvha7a5g.R.iget(10916)!=0|true))||(__CLR4_5_28ag8aglvha7a5g.R.iget(10917)==0&false))? 1 : 0;
        __CLR4_5_28ag8aglvha7a5g.R.inc(10918);return this;
    }finally{__CLR4_5_28ag8aglvha7a5g.R.flushNeeded();}}

    /**
     * <p>Appends to the <code>builder</code> the comparison of
     * two <code>double</code>s.</p>
     *
     * <p>This handles NaNs, Infinities, and <code>-0.0</code>.</p>
     *
     * <p>It is compatible with the hash code generated by
     * <code>HashCodeBuilder</code>.</p>
     *
     * @param lhs  left-hand value
     * @param rhs  right-hand value
     * @return this - used to chain append calls
     */
    public CompareToBuilder append(final double lhs, final double rhs) {try{__CLR4_5_28ag8aglvha7a5g.R.inc(10919);
        __CLR4_5_28ag8aglvha7a5g.R.inc(10920);if ((((comparison != 0)&&(__CLR4_5_28ag8aglvha7a5g.R.iget(10921)!=0|true))||(__CLR4_5_28ag8aglvha7a5g.R.iget(10922)==0&false))) {{
            __CLR4_5_28ag8aglvha7a5g.R.inc(10923);return this;
        }
        }__CLR4_5_28ag8aglvha7a5g.R.inc(10924);comparison = Double.compare(lhs, rhs);
        __CLR4_5_28ag8aglvha7a5g.R.inc(10925);return this;
    }finally{__CLR4_5_28ag8aglvha7a5g.R.flushNeeded();}}

    /**
     * <p>Appends to the <code>builder</code> the comparison of
     * two <code>float</code>s.</p>
     *
     * <p>This handles NaNs, Infinities, and <code>-0.0</code>.</p>
     *
     * <p>It is compatible with the hash code generated by
     * <code>HashCodeBuilder</code>.</p>
     *
     * @param lhs  left-hand value
     * @param rhs  right-hand value
     * @return this - used to chain append calls
     */
    public CompareToBuilder append(final float lhs, final float rhs) {try{__CLR4_5_28ag8aglvha7a5g.R.inc(10926);
        __CLR4_5_28ag8aglvha7a5g.R.inc(10927);if ((((comparison != 0)&&(__CLR4_5_28ag8aglvha7a5g.R.iget(10928)!=0|true))||(__CLR4_5_28ag8aglvha7a5g.R.iget(10929)==0&false))) {{
            __CLR4_5_28ag8aglvha7a5g.R.inc(10930);return this;
        }
        }__CLR4_5_28ag8aglvha7a5g.R.inc(10931);comparison = Float.compare(lhs, rhs);
        __CLR4_5_28ag8aglvha7a5g.R.inc(10932);return this;
    }finally{__CLR4_5_28ag8aglvha7a5g.R.flushNeeded();}}

    /**
     * Appends to the <code>builder</code> the comparison of
     * two <code>booleans</code>s.
     *
     * @param lhs  left-hand value
     * @param rhs  right-hand value
     * @return this - used to chain append calls
      */
    public CompareToBuilder append(final boolean lhs, final boolean rhs) {try{__CLR4_5_28ag8aglvha7a5g.R.inc(10933);
        __CLR4_5_28ag8aglvha7a5g.R.inc(10934);if ((((comparison != 0)&&(__CLR4_5_28ag8aglvha7a5g.R.iget(10935)!=0|true))||(__CLR4_5_28ag8aglvha7a5g.R.iget(10936)==0&false))) {{
            __CLR4_5_28ag8aglvha7a5g.R.inc(10937);return this;
        }
        }__CLR4_5_28ag8aglvha7a5g.R.inc(10938);if ((((lhs == rhs)&&(__CLR4_5_28ag8aglvha7a5g.R.iget(10939)!=0|true))||(__CLR4_5_28ag8aglvha7a5g.R.iget(10940)==0&false))) {{
            __CLR4_5_28ag8aglvha7a5g.R.inc(10941);return this;
        }
        }__CLR4_5_28ag8aglvha7a5g.R.inc(10942);if ((((lhs == false)&&(__CLR4_5_28ag8aglvha7a5g.R.iget(10943)!=0|true))||(__CLR4_5_28ag8aglvha7a5g.R.iget(10944)==0&false))) {{
            __CLR4_5_28ag8aglvha7a5g.R.inc(10945);comparison = -1;
        } }else {{
            __CLR4_5_28ag8aglvha7a5g.R.inc(10946);comparison = +1;
        }
        }__CLR4_5_28ag8aglvha7a5g.R.inc(10947);return this;
    }finally{__CLR4_5_28ag8aglvha7a5g.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * <p>Appends to the <code>builder</code> the deep comparison of
     * two <code>Object</code> arrays.</p>
     *
     * <ol>
     *  <li>Check if arrays are the same using <code>==</code></li>
     *  <li>Check if for <code>null</code>, <code>null</code> is less than non-<code>null</code></li>
     *  <li>Check array length, a short length array is less than a long length array</li>
     *  <li>Check array contents element by element using {@link #append(Object, Object, Comparator)}</li>
     * </ol>
     *
     * <p>This method will also will be called for the top level of multi-dimensional,
     * ragged, and multi-typed arrays.</p>
     *
     * @param lhs  left-hand array
     * @param rhs  right-hand array
     * @return this - used to chain append calls
     * @throws ClassCastException  if <code>rhs</code> is not assignment-compatible
     *  with <code>lhs</code>
     */
    public CompareToBuilder append(final Object[] lhs, final Object[] rhs) {try{__CLR4_5_28ag8aglvha7a5g.R.inc(10948);
        __CLR4_5_28ag8aglvha7a5g.R.inc(10949);return append(lhs, rhs, null);
    }finally{__CLR4_5_28ag8aglvha7a5g.R.flushNeeded();}}
    
    /**
     * <p>Appends to the <code>builder</code> the deep comparison of
     * two <code>Object</code> arrays.</p>
     *
     * <ol>
     *  <li>Check if arrays are the same using <code>==</code></li>
     *  <li>Check if for <code>null</code>, <code>null</code> is less than non-<code>null</code></li>
     *  <li>Check array length, a short length array is less than a long length array</li>
     *  <li>Check array contents element by element using {@link #append(Object, Object, Comparator)}</li>
     * </ol>
     *
     * <p>This method will also will be called for the top level of multi-dimensional,
     * ragged, and multi-typed arrays.</p>
     *
     * @param lhs  left-hand array
     * @param rhs  right-hand array
     * @param comparator  <code>Comparator</code> to use to compare the array elements,
     *  <code>null</code> means to treat <code>lhs</code> elements as <code>Comparable</code>.
     * @return this - used to chain append calls
     * @throws ClassCastException  if <code>rhs</code> is not assignment-compatible
     *  with <code>lhs</code>
     * @since 2.0
     */
    public CompareToBuilder append(final Object[] lhs, final Object[] rhs, final Comparator<?> comparator) {try{__CLR4_5_28ag8aglvha7a5g.R.inc(10950);
        __CLR4_5_28ag8aglvha7a5g.R.inc(10951);if ((((comparison != 0)&&(__CLR4_5_28ag8aglvha7a5g.R.iget(10952)!=0|true))||(__CLR4_5_28ag8aglvha7a5g.R.iget(10953)==0&false))) {{
            __CLR4_5_28ag8aglvha7a5g.R.inc(10954);return this;
        }
        }__CLR4_5_28ag8aglvha7a5g.R.inc(10955);if ((((lhs == rhs)&&(__CLR4_5_28ag8aglvha7a5g.R.iget(10956)!=0|true))||(__CLR4_5_28ag8aglvha7a5g.R.iget(10957)==0&false))) {{
            __CLR4_5_28ag8aglvha7a5g.R.inc(10958);return this;
        }
        }__CLR4_5_28ag8aglvha7a5g.R.inc(10959);if ((((lhs == null)&&(__CLR4_5_28ag8aglvha7a5g.R.iget(10960)!=0|true))||(__CLR4_5_28ag8aglvha7a5g.R.iget(10961)==0&false))) {{
            __CLR4_5_28ag8aglvha7a5g.R.inc(10962);comparison = -1;
            __CLR4_5_28ag8aglvha7a5g.R.inc(10963);return this;
        }
        }__CLR4_5_28ag8aglvha7a5g.R.inc(10964);if ((((rhs == null)&&(__CLR4_5_28ag8aglvha7a5g.R.iget(10965)!=0|true))||(__CLR4_5_28ag8aglvha7a5g.R.iget(10966)==0&false))) {{
            __CLR4_5_28ag8aglvha7a5g.R.inc(10967);comparison = +1;
            __CLR4_5_28ag8aglvha7a5g.R.inc(10968);return this;
        }
        }__CLR4_5_28ag8aglvha7a5g.R.inc(10969);if ((((lhs.length != rhs.length)&&(__CLR4_5_28ag8aglvha7a5g.R.iget(10970)!=0|true))||(__CLR4_5_28ag8aglvha7a5g.R.iget(10971)==0&false))) {{
            __CLR4_5_28ag8aglvha7a5g.R.inc(10972);comparison = (((lhs.length < rhs.length )&&(__CLR4_5_28ag8aglvha7a5g.R.iget(10973)!=0|true))||(__CLR4_5_28ag8aglvha7a5g.R.iget(10974)==0&false))? -1 : +1;
            __CLR4_5_28ag8aglvha7a5g.R.inc(10975);return this;
        }
        }__CLR4_5_28ag8aglvha7a5g.R.inc(10976);for (int i = 0; (((i < lhs.length && comparison == 0)&&(__CLR4_5_28ag8aglvha7a5g.R.iget(10977)!=0|true))||(__CLR4_5_28ag8aglvha7a5g.R.iget(10978)==0&false)); i++) {{
            __CLR4_5_28ag8aglvha7a5g.R.inc(10979);append(lhs[i], rhs[i], comparator);
        }
        }__CLR4_5_28ag8aglvha7a5g.R.inc(10980);return this;
    }finally{__CLR4_5_28ag8aglvha7a5g.R.flushNeeded();}}

    /**
     * <p>Appends to the <code>builder</code> the deep comparison of
     * two <code>long</code> arrays.</p>
     *
     * <ol>
     *  <li>Check if arrays are the same using <code>==</code></li>
     *  <li>Check if for <code>null</code>, <code>null</code> is less than non-<code>null</code></li>
     *  <li>Check array length, a shorter length array is less than a longer length array</li>
     *  <li>Check array contents element by element using {@link #append(long, long)}</li>
     * </ol>
     *
     * @param lhs  left-hand array
     * @param rhs  right-hand array
     * @return this - used to chain append calls
     */
    public CompareToBuilder append(final long[] lhs, final long[] rhs) {try{__CLR4_5_28ag8aglvha7a5g.R.inc(10981);
        __CLR4_5_28ag8aglvha7a5g.R.inc(10982);if ((((comparison != 0)&&(__CLR4_5_28ag8aglvha7a5g.R.iget(10983)!=0|true))||(__CLR4_5_28ag8aglvha7a5g.R.iget(10984)==0&false))) {{
            __CLR4_5_28ag8aglvha7a5g.R.inc(10985);return this;
        }
        }__CLR4_5_28ag8aglvha7a5g.R.inc(10986);if ((((lhs == rhs)&&(__CLR4_5_28ag8aglvha7a5g.R.iget(10987)!=0|true))||(__CLR4_5_28ag8aglvha7a5g.R.iget(10988)==0&false))) {{
            __CLR4_5_28ag8aglvha7a5g.R.inc(10989);return this;
        }
        }__CLR4_5_28ag8aglvha7a5g.R.inc(10990);if ((((lhs == null)&&(__CLR4_5_28ag8aglvha7a5g.R.iget(10991)!=0|true))||(__CLR4_5_28ag8aglvha7a5g.R.iget(10992)==0&false))) {{
            __CLR4_5_28ag8aglvha7a5g.R.inc(10993);comparison = -1;
            __CLR4_5_28ag8aglvha7a5g.R.inc(10994);return this;
        }
        }__CLR4_5_28ag8aglvha7a5g.R.inc(10995);if ((((rhs == null)&&(__CLR4_5_28ag8aglvha7a5g.R.iget(10996)!=0|true))||(__CLR4_5_28ag8aglvha7a5g.R.iget(10997)==0&false))) {{
            __CLR4_5_28ag8aglvha7a5g.R.inc(10998);comparison = +1;
            __CLR4_5_28ag8aglvha7a5g.R.inc(10999);return this;
        }
        }__CLR4_5_28ag8aglvha7a5g.R.inc(11000);if ((((lhs.length != rhs.length)&&(__CLR4_5_28ag8aglvha7a5g.R.iget(11001)!=0|true))||(__CLR4_5_28ag8aglvha7a5g.R.iget(11002)==0&false))) {{
            __CLR4_5_28ag8aglvha7a5g.R.inc(11003);comparison = (((lhs.length < rhs.length )&&(__CLR4_5_28ag8aglvha7a5g.R.iget(11004)!=0|true))||(__CLR4_5_28ag8aglvha7a5g.R.iget(11005)==0&false))? -1 : +1;
            __CLR4_5_28ag8aglvha7a5g.R.inc(11006);return this;
        }
        }__CLR4_5_28ag8aglvha7a5g.R.inc(11007);for (int i = 0; (((i < lhs.length && comparison == 0)&&(__CLR4_5_28ag8aglvha7a5g.R.iget(11008)!=0|true))||(__CLR4_5_28ag8aglvha7a5g.R.iget(11009)==0&false)); i++) {{
            __CLR4_5_28ag8aglvha7a5g.R.inc(11010);append(lhs[i], rhs[i]);
        }
        }__CLR4_5_28ag8aglvha7a5g.R.inc(11011);return this;
    }finally{__CLR4_5_28ag8aglvha7a5g.R.flushNeeded();}}

    /**
     * <p>Appends to the <code>builder</code> the deep comparison of
     * two <code>int</code> arrays.</p>
     *
     * <ol>
     *  <li>Check if arrays are the same using <code>==</code></li>
     *  <li>Check if for <code>null</code>, <code>null</code> is less than non-<code>null</code></li>
     *  <li>Check array length, a shorter length array is less than a longer length array</li>
     *  <li>Check array contents element by element using {@link #append(int, int)}</li>
     * </ol>
     *
     * @param lhs  left-hand array
     * @param rhs  right-hand array
     * @return this - used to chain append calls
     */
    public CompareToBuilder append(final int[] lhs, final int[] rhs) {try{__CLR4_5_28ag8aglvha7a5g.R.inc(11012);
        __CLR4_5_28ag8aglvha7a5g.R.inc(11013);if ((((comparison != 0)&&(__CLR4_5_28ag8aglvha7a5g.R.iget(11014)!=0|true))||(__CLR4_5_28ag8aglvha7a5g.R.iget(11015)==0&false))) {{
            __CLR4_5_28ag8aglvha7a5g.R.inc(11016);return this;
        }
        }__CLR4_5_28ag8aglvha7a5g.R.inc(11017);if ((((lhs == rhs)&&(__CLR4_5_28ag8aglvha7a5g.R.iget(11018)!=0|true))||(__CLR4_5_28ag8aglvha7a5g.R.iget(11019)==0&false))) {{
            __CLR4_5_28ag8aglvha7a5g.R.inc(11020);return this;
        }
        }__CLR4_5_28ag8aglvha7a5g.R.inc(11021);if ((((lhs == null)&&(__CLR4_5_28ag8aglvha7a5g.R.iget(11022)!=0|true))||(__CLR4_5_28ag8aglvha7a5g.R.iget(11023)==0&false))) {{
            __CLR4_5_28ag8aglvha7a5g.R.inc(11024);comparison = -1;
            __CLR4_5_28ag8aglvha7a5g.R.inc(11025);return this;
        }
        }__CLR4_5_28ag8aglvha7a5g.R.inc(11026);if ((((rhs == null)&&(__CLR4_5_28ag8aglvha7a5g.R.iget(11027)!=0|true))||(__CLR4_5_28ag8aglvha7a5g.R.iget(11028)==0&false))) {{
            __CLR4_5_28ag8aglvha7a5g.R.inc(11029);comparison = +1;
            __CLR4_5_28ag8aglvha7a5g.R.inc(11030);return this;
        }
        }__CLR4_5_28ag8aglvha7a5g.R.inc(11031);if ((((lhs.length != rhs.length)&&(__CLR4_5_28ag8aglvha7a5g.R.iget(11032)!=0|true))||(__CLR4_5_28ag8aglvha7a5g.R.iget(11033)==0&false))) {{
            __CLR4_5_28ag8aglvha7a5g.R.inc(11034);comparison = (((lhs.length < rhs.length )&&(__CLR4_5_28ag8aglvha7a5g.R.iget(11035)!=0|true))||(__CLR4_5_28ag8aglvha7a5g.R.iget(11036)==0&false))? -1 : +1;
            __CLR4_5_28ag8aglvha7a5g.R.inc(11037);return this;
        }
        }__CLR4_5_28ag8aglvha7a5g.R.inc(11038);for (int i = 0; (((i < lhs.length && comparison == 0)&&(__CLR4_5_28ag8aglvha7a5g.R.iget(11039)!=0|true))||(__CLR4_5_28ag8aglvha7a5g.R.iget(11040)==0&false)); i++) {{
            __CLR4_5_28ag8aglvha7a5g.R.inc(11041);append(lhs[i], rhs[i]);
        }
        }__CLR4_5_28ag8aglvha7a5g.R.inc(11042);return this;
    }finally{__CLR4_5_28ag8aglvha7a5g.R.flushNeeded();}}

    /**
     * <p>Appends to the <code>builder</code> the deep comparison of
     * two <code>short</code> arrays.</p>
     *
     * <ol>
     *  <li>Check if arrays are the same using <code>==</code></li>
     *  <li>Check if for <code>null</code>, <code>null</code> is less than non-<code>null</code></li>
     *  <li>Check array length, a shorter length array is less than a longer length array</li>
     *  <li>Check array contents element by element using {@link #append(short, short)}</li>
     * </ol>
     *
     * @param lhs  left-hand array
     * @param rhs  right-hand array
     * @return this - used to chain append calls
     */
    public CompareToBuilder append(final short[] lhs, final short[] rhs) {try{__CLR4_5_28ag8aglvha7a5g.R.inc(11043);
        __CLR4_5_28ag8aglvha7a5g.R.inc(11044);if ((((comparison != 0)&&(__CLR4_5_28ag8aglvha7a5g.R.iget(11045)!=0|true))||(__CLR4_5_28ag8aglvha7a5g.R.iget(11046)==0&false))) {{
            __CLR4_5_28ag8aglvha7a5g.R.inc(11047);return this;
        }
        }__CLR4_5_28ag8aglvha7a5g.R.inc(11048);if ((((lhs == rhs)&&(__CLR4_5_28ag8aglvha7a5g.R.iget(11049)!=0|true))||(__CLR4_5_28ag8aglvha7a5g.R.iget(11050)==0&false))) {{
            __CLR4_5_28ag8aglvha7a5g.R.inc(11051);return this;
        }
        }__CLR4_5_28ag8aglvha7a5g.R.inc(11052);if ((((lhs == null)&&(__CLR4_5_28ag8aglvha7a5g.R.iget(11053)!=0|true))||(__CLR4_5_28ag8aglvha7a5g.R.iget(11054)==0&false))) {{
            __CLR4_5_28ag8aglvha7a5g.R.inc(11055);comparison = -1;
            __CLR4_5_28ag8aglvha7a5g.R.inc(11056);return this;
        }
        }__CLR4_5_28ag8aglvha7a5g.R.inc(11057);if ((((rhs == null)&&(__CLR4_5_28ag8aglvha7a5g.R.iget(11058)!=0|true))||(__CLR4_5_28ag8aglvha7a5g.R.iget(11059)==0&false))) {{
            __CLR4_5_28ag8aglvha7a5g.R.inc(11060);comparison = +1;
            __CLR4_5_28ag8aglvha7a5g.R.inc(11061);return this;
        }
        }__CLR4_5_28ag8aglvha7a5g.R.inc(11062);if ((((lhs.length != rhs.length)&&(__CLR4_5_28ag8aglvha7a5g.R.iget(11063)!=0|true))||(__CLR4_5_28ag8aglvha7a5g.R.iget(11064)==0&false))) {{
            __CLR4_5_28ag8aglvha7a5g.R.inc(11065);comparison = (((lhs.length < rhs.length )&&(__CLR4_5_28ag8aglvha7a5g.R.iget(11066)!=0|true))||(__CLR4_5_28ag8aglvha7a5g.R.iget(11067)==0&false))? -1 : +1;
            __CLR4_5_28ag8aglvha7a5g.R.inc(11068);return this;
        }
        }__CLR4_5_28ag8aglvha7a5g.R.inc(11069);for (int i = 0; (((i < lhs.length && comparison == 0)&&(__CLR4_5_28ag8aglvha7a5g.R.iget(11070)!=0|true))||(__CLR4_5_28ag8aglvha7a5g.R.iget(11071)==0&false)); i++) {{
            __CLR4_5_28ag8aglvha7a5g.R.inc(11072);append(lhs[i], rhs[i]);
        }
        }__CLR4_5_28ag8aglvha7a5g.R.inc(11073);return this;
    }finally{__CLR4_5_28ag8aglvha7a5g.R.flushNeeded();}}

    /**
     * <p>Appends to the <code>builder</code> the deep comparison of
     * two <code>char</code> arrays.</p>
     *
     * <ol>
     *  <li>Check if arrays are the same using <code>==</code></li>
     *  <li>Check if for <code>null</code>, <code>null</code> is less than non-<code>null</code></li>
     *  <li>Check array length, a shorter length array is less than a longer length array</li>
     *  <li>Check array contents element by element using {@link #append(char, char)}</li>
     * </ol>
     *
     * @param lhs  left-hand array
     * @param rhs  right-hand array
     * @return this - used to chain append calls
     */
    public CompareToBuilder append(final char[] lhs, final char[] rhs) {try{__CLR4_5_28ag8aglvha7a5g.R.inc(11074);
        __CLR4_5_28ag8aglvha7a5g.R.inc(11075);if ((((comparison != 0)&&(__CLR4_5_28ag8aglvha7a5g.R.iget(11076)!=0|true))||(__CLR4_5_28ag8aglvha7a5g.R.iget(11077)==0&false))) {{
            __CLR4_5_28ag8aglvha7a5g.R.inc(11078);return this;
        }
        }__CLR4_5_28ag8aglvha7a5g.R.inc(11079);if ((((lhs == rhs)&&(__CLR4_5_28ag8aglvha7a5g.R.iget(11080)!=0|true))||(__CLR4_5_28ag8aglvha7a5g.R.iget(11081)==0&false))) {{
            __CLR4_5_28ag8aglvha7a5g.R.inc(11082);return this;
        }
        }__CLR4_5_28ag8aglvha7a5g.R.inc(11083);if ((((lhs == null)&&(__CLR4_5_28ag8aglvha7a5g.R.iget(11084)!=0|true))||(__CLR4_5_28ag8aglvha7a5g.R.iget(11085)==0&false))) {{
            __CLR4_5_28ag8aglvha7a5g.R.inc(11086);comparison = -1;
            __CLR4_5_28ag8aglvha7a5g.R.inc(11087);return this;
        }
        }__CLR4_5_28ag8aglvha7a5g.R.inc(11088);if ((((rhs == null)&&(__CLR4_5_28ag8aglvha7a5g.R.iget(11089)!=0|true))||(__CLR4_5_28ag8aglvha7a5g.R.iget(11090)==0&false))) {{
            __CLR4_5_28ag8aglvha7a5g.R.inc(11091);comparison = +1;
            __CLR4_5_28ag8aglvha7a5g.R.inc(11092);return this;
        }
        }__CLR4_5_28ag8aglvha7a5g.R.inc(11093);if ((((lhs.length != rhs.length)&&(__CLR4_5_28ag8aglvha7a5g.R.iget(11094)!=0|true))||(__CLR4_5_28ag8aglvha7a5g.R.iget(11095)==0&false))) {{
            __CLR4_5_28ag8aglvha7a5g.R.inc(11096);comparison = (((lhs.length < rhs.length )&&(__CLR4_5_28ag8aglvha7a5g.R.iget(11097)!=0|true))||(__CLR4_5_28ag8aglvha7a5g.R.iget(11098)==0&false))? -1 : +1;
            __CLR4_5_28ag8aglvha7a5g.R.inc(11099);return this;
        }
        }__CLR4_5_28ag8aglvha7a5g.R.inc(11100);for (int i = 0; (((i < lhs.length && comparison == 0)&&(__CLR4_5_28ag8aglvha7a5g.R.iget(11101)!=0|true))||(__CLR4_5_28ag8aglvha7a5g.R.iget(11102)==0&false)); i++) {{
            __CLR4_5_28ag8aglvha7a5g.R.inc(11103);append(lhs[i], rhs[i]);
        }
        }__CLR4_5_28ag8aglvha7a5g.R.inc(11104);return this;
    }finally{__CLR4_5_28ag8aglvha7a5g.R.flushNeeded();}}

    /**
     * <p>Appends to the <code>builder</code> the deep comparison of
     * two <code>byte</code> arrays.</p>
     *
     * <ol>
     *  <li>Check if arrays are the same using <code>==</code></li>
     *  <li>Check if for <code>null</code>, <code>null</code> is less than non-<code>null</code></li>
     *  <li>Check array length, a shorter length array is less than a longer length array</li>
     *  <li>Check array contents element by element using {@link #append(byte, byte)}</li>
     * </ol>
     *
     * @param lhs  left-hand array
     * @param rhs  right-hand array
     * @return this - used to chain append calls
     */
    public CompareToBuilder append(final byte[] lhs, final byte[] rhs) {try{__CLR4_5_28ag8aglvha7a5g.R.inc(11105);
        __CLR4_5_28ag8aglvha7a5g.R.inc(11106);if ((((comparison != 0)&&(__CLR4_5_28ag8aglvha7a5g.R.iget(11107)!=0|true))||(__CLR4_5_28ag8aglvha7a5g.R.iget(11108)==0&false))) {{
            __CLR4_5_28ag8aglvha7a5g.R.inc(11109);return this;
        }
        }__CLR4_5_28ag8aglvha7a5g.R.inc(11110);if ((((lhs == rhs)&&(__CLR4_5_28ag8aglvha7a5g.R.iget(11111)!=0|true))||(__CLR4_5_28ag8aglvha7a5g.R.iget(11112)==0&false))) {{
            __CLR4_5_28ag8aglvha7a5g.R.inc(11113);return this;
        }
        }__CLR4_5_28ag8aglvha7a5g.R.inc(11114);if ((((lhs == null)&&(__CLR4_5_28ag8aglvha7a5g.R.iget(11115)!=0|true))||(__CLR4_5_28ag8aglvha7a5g.R.iget(11116)==0&false))) {{
            __CLR4_5_28ag8aglvha7a5g.R.inc(11117);comparison = -1;
            __CLR4_5_28ag8aglvha7a5g.R.inc(11118);return this;
        }
        }__CLR4_5_28ag8aglvha7a5g.R.inc(11119);if ((((rhs == null)&&(__CLR4_5_28ag8aglvha7a5g.R.iget(11120)!=0|true))||(__CLR4_5_28ag8aglvha7a5g.R.iget(11121)==0&false))) {{
            __CLR4_5_28ag8aglvha7a5g.R.inc(11122);comparison = +1;
            __CLR4_5_28ag8aglvha7a5g.R.inc(11123);return this;
        }
        }__CLR4_5_28ag8aglvha7a5g.R.inc(11124);if ((((lhs.length != rhs.length)&&(__CLR4_5_28ag8aglvha7a5g.R.iget(11125)!=0|true))||(__CLR4_5_28ag8aglvha7a5g.R.iget(11126)==0&false))) {{
            __CLR4_5_28ag8aglvha7a5g.R.inc(11127);comparison = (((lhs.length < rhs.length )&&(__CLR4_5_28ag8aglvha7a5g.R.iget(11128)!=0|true))||(__CLR4_5_28ag8aglvha7a5g.R.iget(11129)==0&false))? -1 : +1;
            __CLR4_5_28ag8aglvha7a5g.R.inc(11130);return this;
        }
        }__CLR4_5_28ag8aglvha7a5g.R.inc(11131);for (int i = 0; (((i < lhs.length && comparison == 0)&&(__CLR4_5_28ag8aglvha7a5g.R.iget(11132)!=0|true))||(__CLR4_5_28ag8aglvha7a5g.R.iget(11133)==0&false)); i++) {{
            __CLR4_5_28ag8aglvha7a5g.R.inc(11134);append(lhs[i], rhs[i]);
        }
        }__CLR4_5_28ag8aglvha7a5g.R.inc(11135);return this;
    }finally{__CLR4_5_28ag8aglvha7a5g.R.flushNeeded();}}

    /**
     * <p>Appends to the <code>builder</code> the deep comparison of
     * two <code>double</code> arrays.</p>
     *
     * <ol>
     *  <li>Check if arrays are the same using <code>==</code></li>
     *  <li>Check if for <code>null</code>, <code>null</code> is less than non-<code>null</code></li>
     *  <li>Check array length, a shorter length array is less than a longer length array</li>
     *  <li>Check array contents element by element using {@link #append(double, double)}</li>
     * </ol>
     *
     * @param lhs  left-hand array
     * @param rhs  right-hand array
     * @return this - used to chain append calls
     */
    public CompareToBuilder append(final double[] lhs, final double[] rhs) {try{__CLR4_5_28ag8aglvha7a5g.R.inc(11136);
        __CLR4_5_28ag8aglvha7a5g.R.inc(11137);if ((((comparison != 0)&&(__CLR4_5_28ag8aglvha7a5g.R.iget(11138)!=0|true))||(__CLR4_5_28ag8aglvha7a5g.R.iget(11139)==0&false))) {{
            __CLR4_5_28ag8aglvha7a5g.R.inc(11140);return this;
        }
        }__CLR4_5_28ag8aglvha7a5g.R.inc(11141);if ((((lhs == rhs)&&(__CLR4_5_28ag8aglvha7a5g.R.iget(11142)!=0|true))||(__CLR4_5_28ag8aglvha7a5g.R.iget(11143)==0&false))) {{
            __CLR4_5_28ag8aglvha7a5g.R.inc(11144);return this;
        }
        }__CLR4_5_28ag8aglvha7a5g.R.inc(11145);if ((((lhs == null)&&(__CLR4_5_28ag8aglvha7a5g.R.iget(11146)!=0|true))||(__CLR4_5_28ag8aglvha7a5g.R.iget(11147)==0&false))) {{
            __CLR4_5_28ag8aglvha7a5g.R.inc(11148);comparison = -1;
            __CLR4_5_28ag8aglvha7a5g.R.inc(11149);return this;
        }
        }__CLR4_5_28ag8aglvha7a5g.R.inc(11150);if ((((rhs == null)&&(__CLR4_5_28ag8aglvha7a5g.R.iget(11151)!=0|true))||(__CLR4_5_28ag8aglvha7a5g.R.iget(11152)==0&false))) {{
            __CLR4_5_28ag8aglvha7a5g.R.inc(11153);comparison = +1;
            __CLR4_5_28ag8aglvha7a5g.R.inc(11154);return this;
        }
        }__CLR4_5_28ag8aglvha7a5g.R.inc(11155);if ((((lhs.length != rhs.length)&&(__CLR4_5_28ag8aglvha7a5g.R.iget(11156)!=0|true))||(__CLR4_5_28ag8aglvha7a5g.R.iget(11157)==0&false))) {{
            __CLR4_5_28ag8aglvha7a5g.R.inc(11158);comparison = (((lhs.length < rhs.length )&&(__CLR4_5_28ag8aglvha7a5g.R.iget(11159)!=0|true))||(__CLR4_5_28ag8aglvha7a5g.R.iget(11160)==0&false))? -1 : +1;
            __CLR4_5_28ag8aglvha7a5g.R.inc(11161);return this;
        }
        }__CLR4_5_28ag8aglvha7a5g.R.inc(11162);for (int i = 0; (((i < lhs.length && comparison == 0)&&(__CLR4_5_28ag8aglvha7a5g.R.iget(11163)!=0|true))||(__CLR4_5_28ag8aglvha7a5g.R.iget(11164)==0&false)); i++) {{
            __CLR4_5_28ag8aglvha7a5g.R.inc(11165);append(lhs[i], rhs[i]);
        }
        }__CLR4_5_28ag8aglvha7a5g.R.inc(11166);return this;
    }finally{__CLR4_5_28ag8aglvha7a5g.R.flushNeeded();}}

    /**
     * <p>Appends to the <code>builder</code> the deep comparison of
     * two <code>float</code> arrays.</p>
     *
     * <ol>
     *  <li>Check if arrays are the same using <code>==</code></li>
     *  <li>Check if for <code>null</code>, <code>null</code> is less than non-<code>null</code></li>
     *  <li>Check array length, a shorter length array is less than a longer length array</li>
     *  <li>Check array contents element by element using {@link #append(float, float)}</li>
     * </ol>
     *
     * @param lhs  left-hand array
     * @param rhs  right-hand array
     * @return this - used to chain append calls
     */
    public CompareToBuilder append(final float[] lhs, final float[] rhs) {try{__CLR4_5_28ag8aglvha7a5g.R.inc(11167);
        __CLR4_5_28ag8aglvha7a5g.R.inc(11168);if ((((comparison != 0)&&(__CLR4_5_28ag8aglvha7a5g.R.iget(11169)!=0|true))||(__CLR4_5_28ag8aglvha7a5g.R.iget(11170)==0&false))) {{
            __CLR4_5_28ag8aglvha7a5g.R.inc(11171);return this;
        }
        }__CLR4_5_28ag8aglvha7a5g.R.inc(11172);if ((((lhs == rhs)&&(__CLR4_5_28ag8aglvha7a5g.R.iget(11173)!=0|true))||(__CLR4_5_28ag8aglvha7a5g.R.iget(11174)==0&false))) {{
            __CLR4_5_28ag8aglvha7a5g.R.inc(11175);return this;
        }
        }__CLR4_5_28ag8aglvha7a5g.R.inc(11176);if ((((lhs == null)&&(__CLR4_5_28ag8aglvha7a5g.R.iget(11177)!=0|true))||(__CLR4_5_28ag8aglvha7a5g.R.iget(11178)==0&false))) {{
            __CLR4_5_28ag8aglvha7a5g.R.inc(11179);comparison = -1;
            __CLR4_5_28ag8aglvha7a5g.R.inc(11180);return this;
        }
        }__CLR4_5_28ag8aglvha7a5g.R.inc(11181);if ((((rhs == null)&&(__CLR4_5_28ag8aglvha7a5g.R.iget(11182)!=0|true))||(__CLR4_5_28ag8aglvha7a5g.R.iget(11183)==0&false))) {{
            __CLR4_5_28ag8aglvha7a5g.R.inc(11184);comparison = +1;
            __CLR4_5_28ag8aglvha7a5g.R.inc(11185);return this;
        }
        }__CLR4_5_28ag8aglvha7a5g.R.inc(11186);if ((((lhs.length != rhs.length)&&(__CLR4_5_28ag8aglvha7a5g.R.iget(11187)!=0|true))||(__CLR4_5_28ag8aglvha7a5g.R.iget(11188)==0&false))) {{
            __CLR4_5_28ag8aglvha7a5g.R.inc(11189);comparison = (((lhs.length < rhs.length )&&(__CLR4_5_28ag8aglvha7a5g.R.iget(11190)!=0|true))||(__CLR4_5_28ag8aglvha7a5g.R.iget(11191)==0&false))? -1 : +1;
            __CLR4_5_28ag8aglvha7a5g.R.inc(11192);return this;
        }
        }__CLR4_5_28ag8aglvha7a5g.R.inc(11193);for (int i = 0; (((i < lhs.length && comparison == 0)&&(__CLR4_5_28ag8aglvha7a5g.R.iget(11194)!=0|true))||(__CLR4_5_28ag8aglvha7a5g.R.iget(11195)==0&false)); i++) {{
            __CLR4_5_28ag8aglvha7a5g.R.inc(11196);append(lhs[i], rhs[i]);
        }
        }__CLR4_5_28ag8aglvha7a5g.R.inc(11197);return this;
    }finally{__CLR4_5_28ag8aglvha7a5g.R.flushNeeded();}}

    /**
     * <p>Appends to the <code>builder</code> the deep comparison of
     * two <code>boolean</code> arrays.</p>
     *
     * <ol>
     *  <li>Check if arrays are the same using <code>==</code></li>
     *  <li>Check if for <code>null</code>, <code>null</code> is less than non-<code>null</code></li>
     *  <li>Check array length, a shorter length array is less than a longer length array</li>
     *  <li>Check array contents element by element using {@link #append(boolean, boolean)}</li>
     * </ol>
     *
     * @param lhs  left-hand array
     * @param rhs  right-hand array
     * @return this - used to chain append calls
     */
    public CompareToBuilder append(final boolean[] lhs, final boolean[] rhs) {try{__CLR4_5_28ag8aglvha7a5g.R.inc(11198);
        __CLR4_5_28ag8aglvha7a5g.R.inc(11199);if ((((comparison != 0)&&(__CLR4_5_28ag8aglvha7a5g.R.iget(11200)!=0|true))||(__CLR4_5_28ag8aglvha7a5g.R.iget(11201)==0&false))) {{
            __CLR4_5_28ag8aglvha7a5g.R.inc(11202);return this;
        }
        }__CLR4_5_28ag8aglvha7a5g.R.inc(11203);if ((((lhs == rhs)&&(__CLR4_5_28ag8aglvha7a5g.R.iget(11204)!=0|true))||(__CLR4_5_28ag8aglvha7a5g.R.iget(11205)==0&false))) {{
            __CLR4_5_28ag8aglvha7a5g.R.inc(11206);return this;
        }
        }__CLR4_5_28ag8aglvha7a5g.R.inc(11207);if ((((lhs == null)&&(__CLR4_5_28ag8aglvha7a5g.R.iget(11208)!=0|true))||(__CLR4_5_28ag8aglvha7a5g.R.iget(11209)==0&false))) {{
            __CLR4_5_28ag8aglvha7a5g.R.inc(11210);comparison = -1;
            __CLR4_5_28ag8aglvha7a5g.R.inc(11211);return this;
        }
        }__CLR4_5_28ag8aglvha7a5g.R.inc(11212);if ((((rhs == null)&&(__CLR4_5_28ag8aglvha7a5g.R.iget(11213)!=0|true))||(__CLR4_5_28ag8aglvha7a5g.R.iget(11214)==0&false))) {{
            __CLR4_5_28ag8aglvha7a5g.R.inc(11215);comparison = +1;
            __CLR4_5_28ag8aglvha7a5g.R.inc(11216);return this;
        }
        }__CLR4_5_28ag8aglvha7a5g.R.inc(11217);if ((((lhs.length != rhs.length)&&(__CLR4_5_28ag8aglvha7a5g.R.iget(11218)!=0|true))||(__CLR4_5_28ag8aglvha7a5g.R.iget(11219)==0&false))) {{
            __CLR4_5_28ag8aglvha7a5g.R.inc(11220);comparison = (((lhs.length < rhs.length )&&(__CLR4_5_28ag8aglvha7a5g.R.iget(11221)!=0|true))||(__CLR4_5_28ag8aglvha7a5g.R.iget(11222)==0&false))? -1 : +1;
            __CLR4_5_28ag8aglvha7a5g.R.inc(11223);return this;
        }
        }__CLR4_5_28ag8aglvha7a5g.R.inc(11224);for (int i = 0; (((i < lhs.length && comparison == 0)&&(__CLR4_5_28ag8aglvha7a5g.R.iget(11225)!=0|true))||(__CLR4_5_28ag8aglvha7a5g.R.iget(11226)==0&false)); i++) {{
            __CLR4_5_28ag8aglvha7a5g.R.inc(11227);append(lhs[i], rhs[i]);
        }
        }__CLR4_5_28ag8aglvha7a5g.R.inc(11228);return this;
    }finally{__CLR4_5_28ag8aglvha7a5g.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Returns a negative integer, a positive integer, or zero as
     * the <code>builder</code> has judged the "left-hand" side
     * as less than, greater than, or equal to the "right-hand"
     * side.
     * 
     * @return final comparison result
     * @see #build()
     */
    public int toComparison() {try{__CLR4_5_28ag8aglvha7a5g.R.inc(11229);
        __CLR4_5_28ag8aglvha7a5g.R.inc(11230);return comparison;
    }finally{__CLR4_5_28ag8aglvha7a5g.R.flushNeeded();}}

    /**
     * Returns a negative Integer, a positive Integer, or zero as
     * the <code>builder</code> has judged the "left-hand" side
     * as less than, greater than, or equal to the "right-hand"
     * side.
     * 
     * @return final comparison result as an Integer
     * @see #toComparison()
     * @since 3.0
     */
    @Override
    public Integer build() {try{__CLR4_5_28ag8aglvha7a5g.R.inc(11231);
        __CLR4_5_28ag8aglvha7a5g.R.inc(11232);return Integer.valueOf(toComparison());
    }finally{__CLR4_5_28ag8aglvha7a5g.R.flushNeeded();}}
}

