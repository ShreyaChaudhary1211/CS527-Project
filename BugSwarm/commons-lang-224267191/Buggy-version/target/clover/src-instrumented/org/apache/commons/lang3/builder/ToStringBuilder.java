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

import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.Validate;

/**
 * <p>Assists in implementing {@link Object#toString()} methods.</p>
 *
 * <p>This class enables a good and consistent <code>toString()</code> to be built for any
 * class or object. This class aims to simplify the process by:</p>
 * <ul>
 *  <li>allowing field names</li>
 *  <li>handling all types consistently</li>
 *  <li>handling nulls consistently</li>
 *  <li>outputting arrays and multi-dimensional arrays</li>
 *  <li>enabling the detail level to be controlled for Objects and Collections</li>
 *  <li>handling class hierarchies</li>
 * </ul>
 *
 * <p>To use this class write code as follows:</p>
 *
 * <pre>
 * public class Person {
 *   String name;
 *   int age;
 *   boolean smoker;
 *
 *   ...
 *
 *   public String toString() {
 *     return new ToStringBuilder(this).
 *       append("name", name).
 *       append("age", age).
 *       append("smoker", smoker).
 *       toString();
 *   }
 * }
 * </pre>
 *
 * <p>This will produce a toString of the format:
 * <code>Person@7f54[name=Stephen,age=29,smoker=false]</code></p>
 *
 * <p>To add the superclass <code>toString</code>, use {@link #appendSuper}.
 * To append the <code>toString</code> from an object that is delegated
 * to (or any other object), use {@link #appendToString}.</p>
 *
 * <p>Alternatively, there is a method that uses reflection to determine
 * the fields to test. Because these fields are usually private, the method,
 * <code>reflectionToString</code>, uses <code>AccessibleObject.setAccessible</code> to
 * change the visibility of the fields. This will fail under a security manager,
 * unless the appropriate permissions are set up correctly. It is also
 * slower than testing explicitly.</p>
 *
 * <p>A typical invocation for this method would look like:</p>
 *
 * <pre>
 * public String toString() {
 *   return ToStringBuilder.reflectionToString(this);
 * }
 * </pre>
 *
 * <p>You can also use the builder to debug 3rd party objects:</p>
 *
 * <pre>
 * System.out.println("An object: " + ToStringBuilder.reflectionToString(anObject));
 * </pre>
 *
 * <p>The exact format of the <code>toString</code> is determined by
 * the {@link ToStringStyle} passed into the constructor.</p>
 *
 * @since 1.0
 */
public class ToStringBuilder implements Builder<String> {public static class __CLR4_5_29sm9smlvha7acz{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172755542L,8589935092L,12892,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * The default style of output to use, not null.
     */
    private static volatile ToStringStyle defaultStyle = ToStringStyle.DEFAULT_STYLE;

    //----------------------------------------------------------------------------

    /**
     * <p>Gets the default <code>ToStringStyle</code> to use.</p>
     *
     * <p>This method gets a singleton default value, typically for the whole JVM.
     * Changing this default should generally only be done during application startup.
     * It is recommended to pass a <code>ToStringStyle</code> to the constructor instead
     * of using this global default.</p>
     *
     * <p>This method can be used from multiple threads.
     * Internally, a <code>volatile</code> variable is used to provide the guarantee
     * that the latest value set using {@link #setDefaultStyle} is the value returned.
     * It is strongly recommended that the default style is only changed during application startup.</p>
     *
     * <p>One reason for changing the default could be to have a verbose style during
     * development and a compact style in production.</p>
     *
     * @return the default <code>ToStringStyle</code>, never null
     */
    public static ToStringStyle getDefaultStyle() {try{__CLR4_5_29sm9smlvha7acz.R.inc(12694);
        __CLR4_5_29sm9smlvha7acz.R.inc(12695);return defaultStyle;
    }finally{__CLR4_5_29sm9smlvha7acz.R.flushNeeded();}}

    /**
     * <p>Sets the default <code>ToStringStyle</code> to use.</p>
     *
     * <p>This method sets a singleton default value, typically for the whole JVM.
     * Changing this default should generally only be done during application startup.
     * It is recommended to pass a <code>ToStringStyle</code> to the constructor instead
     * of changing this global default.</p>
     *
     * <p>This method is not intended for use from multiple threads.
     * Internally, a <code>volatile</code> variable is used to provide the guarantee
     * that the latest value set is the value returned from {@link #getDefaultStyle}.</p>
     *
     * @param style  the default <code>ToStringStyle</code>
     * @throws IllegalArgumentException if the style is <code>null</code>
     */
    public static void setDefaultStyle(final ToStringStyle style) {try{__CLR4_5_29sm9smlvha7acz.R.inc(12696);
        __CLR4_5_29sm9smlvha7acz.R.inc(12697);Validate.isTrue(style != null, "The style must not be null");
        __CLR4_5_29sm9smlvha7acz.R.inc(12698);defaultStyle = style;
    }finally{__CLR4_5_29sm9smlvha7acz.R.flushNeeded();}}

    //----------------------------------------------------------------------------
    /**
     * <p>Uses <code>ReflectionToStringBuilder</code> to generate a
     * <code>toString</code> for the specified object.</p>
     *
     * @param object  the Object to be output
     * @return the String result
     * @see ReflectionToStringBuilder#toString(Object)
     */
    public static String reflectionToString(final Object object) {try{__CLR4_5_29sm9smlvha7acz.R.inc(12699);
        __CLR4_5_29sm9smlvha7acz.R.inc(12700);return ReflectionToStringBuilder.toString(object);
    }finally{__CLR4_5_29sm9smlvha7acz.R.flushNeeded();}}

    /**
     * <p>Uses <code>ReflectionToStringBuilder</code> to generate a
     * <code>toString</code> for the specified object.</p>
     *
     * @param object  the Object to be output
     * @param style  the style of the <code>toString</code> to create, may be <code>null</code>
     * @return the String result
     * @see ReflectionToStringBuilder#toString(Object,ToStringStyle)
     */
    public static String reflectionToString(final Object object, final ToStringStyle style) {try{__CLR4_5_29sm9smlvha7acz.R.inc(12701);
        __CLR4_5_29sm9smlvha7acz.R.inc(12702);return ReflectionToStringBuilder.toString(object, style);
    }finally{__CLR4_5_29sm9smlvha7acz.R.flushNeeded();}}

    /**
     * <p>Uses <code>ReflectionToStringBuilder</code> to generate a
     * <code>toString</code> for the specified object.</p>
     *
     * @param object  the Object to be output
     * @param style  the style of the <code>toString</code> to create, may be <code>null</code>
     * @param outputTransients  whether to include transient fields
     * @return the String result
     * @see ReflectionToStringBuilder#toString(Object,ToStringStyle,boolean)
     */
    public static String reflectionToString(final Object object, final ToStringStyle style, final boolean outputTransients) {try{__CLR4_5_29sm9smlvha7acz.R.inc(12703);
        __CLR4_5_29sm9smlvha7acz.R.inc(12704);return ReflectionToStringBuilder.toString(object, style, outputTransients, false, null);
    }finally{__CLR4_5_29sm9smlvha7acz.R.flushNeeded();}}

    /**
     * <p>Uses <code>ReflectionToStringBuilder</code> to generate a
     * <code>toString</code> for the specified object.</p>
     *
     * @param <T> the type of the object
     * @param object  the Object to be output
     * @param style  the style of the <code>toString</code> to create, may be <code>null</code>
     * @param outputTransients  whether to include transient fields
     * @param reflectUpToClass  the superclass to reflect up to (inclusive), may be <code>null</code>
     * @return the String result
     * @see ReflectionToStringBuilder#toString(Object,ToStringStyle,boolean,boolean,Class)
     * @since 2.0
     */
    public static <T> String reflectionToString(
        final T object,
        final ToStringStyle style,
        final boolean outputTransients,
        final Class<? super T> reflectUpToClass) {try{__CLR4_5_29sm9smlvha7acz.R.inc(12705);
        __CLR4_5_29sm9smlvha7acz.R.inc(12706);return ReflectionToStringBuilder.toString(object, style, outputTransients, false, reflectUpToClass);
    }finally{__CLR4_5_29sm9smlvha7acz.R.flushNeeded();}}

    //----------------------------------------------------------------------------

    /**
     * Current toString buffer, not null.
     */
    private final StringBuffer buffer;
    /**
     * The object being output, may be null.
     */
    private final Object object;
    /**
     * The style of output to use, not null.
     */
    private final ToStringStyle style;

    /**
     * <p>Constructs a builder for the specified object using the default output style.</p>
     *
     * <p>This default style is obtained from {@link #getDefaultStyle()}.</p>
     *
     * @param object  the Object to build a <code>toString</code> for, not recommended to be null
     */
    public ToStringBuilder(final Object object) {
        this(object, null, null);__CLR4_5_29sm9smlvha7acz.R.inc(12708);try{__CLR4_5_29sm9smlvha7acz.R.inc(12707);
    }finally{__CLR4_5_29sm9smlvha7acz.R.flushNeeded();}}

    /**
     * <p>Constructs a builder for the specified object using the a defined output style.</p>
     *
     * <p>If the style is <code>null</code>, the default style is used.</p>
     *
     * @param object  the Object to build a <code>toString</code> for, not recommended to be null
     * @param style  the style of the <code>toString</code> to create, null uses the default style
     */
    public ToStringBuilder(final Object object, final ToStringStyle style) {
        this(object, style, null);__CLR4_5_29sm9smlvha7acz.R.inc(12710);try{__CLR4_5_29sm9smlvha7acz.R.inc(12709);
    }finally{__CLR4_5_29sm9smlvha7acz.R.flushNeeded();}}

    /**
     * <p>Constructs a builder for the specified object.</p>
     *
     * <p>If the style is <code>null</code>, the default style is used.</p>
     *
     * <p>If the buffer is <code>null</code>, a new one is created.</p>
     *
     * @param object  the Object to build a <code>toString</code> for, not recommended to be null
     * @param style  the style of the <code>toString</code> to create, null uses the default style
     * @param buffer  the <code>StringBuffer</code> to populate, may be null
     */
    public ToStringBuilder(final Object object, ToStringStyle style, StringBuffer buffer) {try{__CLR4_5_29sm9smlvha7acz.R.inc(12711);
        __CLR4_5_29sm9smlvha7acz.R.inc(12712);if ((((style == null)&&(__CLR4_5_29sm9smlvha7acz.R.iget(12713)!=0|true))||(__CLR4_5_29sm9smlvha7acz.R.iget(12714)==0&false))) {{
            __CLR4_5_29sm9smlvha7acz.R.inc(12715);style = getDefaultStyle();
        }
        }__CLR4_5_29sm9smlvha7acz.R.inc(12716);if ((((buffer == null)&&(__CLR4_5_29sm9smlvha7acz.R.iget(12717)!=0|true))||(__CLR4_5_29sm9smlvha7acz.R.iget(12718)==0&false))) {{
            __CLR4_5_29sm9smlvha7acz.R.inc(12719);buffer = new StringBuffer(512);
        }
        }__CLR4_5_29sm9smlvha7acz.R.inc(12720);this.buffer = buffer;
        __CLR4_5_29sm9smlvha7acz.R.inc(12721);this.style = style;
        __CLR4_5_29sm9smlvha7acz.R.inc(12722);this.object = object;

        __CLR4_5_29sm9smlvha7acz.R.inc(12723);style.appendStart(buffer, object);
    }finally{__CLR4_5_29sm9smlvha7acz.R.flushNeeded();}}

    //----------------------------------------------------------------------------

    /**
     * <p>Append to the <code>toString</code> a <code>boolean</code>
     * value.</p>
     *
     * @param value  the value to add to the <code>toString</code>
     * @return this
     */
    public ToStringBuilder append(final boolean value) {try{__CLR4_5_29sm9smlvha7acz.R.inc(12724);
        __CLR4_5_29sm9smlvha7acz.R.inc(12725);style.append(buffer, null, value);
        __CLR4_5_29sm9smlvha7acz.R.inc(12726);return this;
    }finally{__CLR4_5_29sm9smlvha7acz.R.flushNeeded();}}

    //----------------------------------------------------------------------------

    /**
     * <p>Append to the <code>toString</code> a <code>boolean</code>
     * array.</p>
     *
     * @param array  the array to add to the <code>toString</code>
     * @return this
     */
    public ToStringBuilder append(final boolean[] array) {try{__CLR4_5_29sm9smlvha7acz.R.inc(12727);
        __CLR4_5_29sm9smlvha7acz.R.inc(12728);style.append(buffer, null, array, null);
        __CLR4_5_29sm9smlvha7acz.R.inc(12729);return this;
    }finally{__CLR4_5_29sm9smlvha7acz.R.flushNeeded();}}

    //----------------------------------------------------------------------------

    /**
     * <p>Append to the <code>toString</code> a <code>byte</code>
     * value.</p>
     *
     * @param value  the value to add to the <code>toString</code>
     * @return this
     */
    public ToStringBuilder append(final byte value) {try{__CLR4_5_29sm9smlvha7acz.R.inc(12730);
        __CLR4_5_29sm9smlvha7acz.R.inc(12731);style.append(buffer, null, value);
        __CLR4_5_29sm9smlvha7acz.R.inc(12732);return this;
    }finally{__CLR4_5_29sm9smlvha7acz.R.flushNeeded();}}

    //----------------------------------------------------------------------------

    /**
     * <p>Append to the <code>toString</code> a <code>byte</code>
     * array.</p>
     *
     * @param array  the array to add to the <code>toString</code>
     * @return this
     */
    public ToStringBuilder append(final byte[] array) {try{__CLR4_5_29sm9smlvha7acz.R.inc(12733);
        __CLR4_5_29sm9smlvha7acz.R.inc(12734);style.append(buffer, null, array, null);
        __CLR4_5_29sm9smlvha7acz.R.inc(12735);return this;
    }finally{__CLR4_5_29sm9smlvha7acz.R.flushNeeded();}}

    //----------------------------------------------------------------------------

    /**
     * <p>Append to the <code>toString</code> a <code>char</code>
     * value.</p>
     *
     * @param value  the value to add to the <code>toString</code>
     * @return this
     */
    public ToStringBuilder append(final char value) {try{__CLR4_5_29sm9smlvha7acz.R.inc(12736);
        __CLR4_5_29sm9smlvha7acz.R.inc(12737);style.append(buffer, null, value);
        __CLR4_5_29sm9smlvha7acz.R.inc(12738);return this;
    }finally{__CLR4_5_29sm9smlvha7acz.R.flushNeeded();}}

    //----------------------------------------------------------------------------

    /**
     * <p>Append to the <code>toString</code> a <code>char</code>
     * array.</p>
     *
     * @param array  the array to add to the <code>toString</code>
     * @return this
     */
    public ToStringBuilder append(final char[] array) {try{__CLR4_5_29sm9smlvha7acz.R.inc(12739);
        __CLR4_5_29sm9smlvha7acz.R.inc(12740);style.append(buffer, null, array, null);
        __CLR4_5_29sm9smlvha7acz.R.inc(12741);return this;
    }finally{__CLR4_5_29sm9smlvha7acz.R.flushNeeded();}}

    //----------------------------------------------------------------------------

    /**
     * <p>Append to the <code>toString</code> a <code>double</code>
     * value.</p>
     *
     * @param value  the value to add to the <code>toString</code>
     * @return this
     */
    public ToStringBuilder append(final double value) {try{__CLR4_5_29sm9smlvha7acz.R.inc(12742);
        __CLR4_5_29sm9smlvha7acz.R.inc(12743);style.append(buffer, null, value);
        __CLR4_5_29sm9smlvha7acz.R.inc(12744);return this;
    }finally{__CLR4_5_29sm9smlvha7acz.R.flushNeeded();}}

    //----------------------------------------------------------------------------

    /**
     * <p>Append to the <code>toString</code> a <code>double</code>
     * array.</p>
     *
     * @param array  the array to add to the <code>toString</code>
     * @return this
     */
    public ToStringBuilder append(final double[] array) {try{__CLR4_5_29sm9smlvha7acz.R.inc(12745);
        __CLR4_5_29sm9smlvha7acz.R.inc(12746);style.append(buffer, null, array, null);
        __CLR4_5_29sm9smlvha7acz.R.inc(12747);return this;
    }finally{__CLR4_5_29sm9smlvha7acz.R.flushNeeded();}}

    //----------------------------------------------------------------------------

    /**
     * <p>Append to the <code>toString</code> a <code>float</code>
     * value.</p>
     *
     * @param value  the value to add to the <code>toString</code>
     * @return this
     */
    public ToStringBuilder append(final float value) {try{__CLR4_5_29sm9smlvha7acz.R.inc(12748);
        __CLR4_5_29sm9smlvha7acz.R.inc(12749);style.append(buffer, null, value);
        __CLR4_5_29sm9smlvha7acz.R.inc(12750);return this;
    }finally{__CLR4_5_29sm9smlvha7acz.R.flushNeeded();}}

    //----------------------------------------------------------------------------

    /**
     * <p>Append to the <code>toString</code> a <code>float</code>
     * array.</p>
     *
     * @param array  the array to add to the <code>toString</code>
     * @return this
     */
    public ToStringBuilder append(final float[] array) {try{__CLR4_5_29sm9smlvha7acz.R.inc(12751);
        __CLR4_5_29sm9smlvha7acz.R.inc(12752);style.append(buffer, null, array, null);
        __CLR4_5_29sm9smlvha7acz.R.inc(12753);return this;
    }finally{__CLR4_5_29sm9smlvha7acz.R.flushNeeded();}}

    //----------------------------------------------------------------------------

    /**
     * <p>Append to the <code>toString</code> an <code>int</code>
     * value.</p>
     *
     * @param value  the value to add to the <code>toString</code>
     * @return this
     */
    public ToStringBuilder append(final int value) {try{__CLR4_5_29sm9smlvha7acz.R.inc(12754);
        __CLR4_5_29sm9smlvha7acz.R.inc(12755);style.append(buffer, null, value);
        __CLR4_5_29sm9smlvha7acz.R.inc(12756);return this;
    }finally{__CLR4_5_29sm9smlvha7acz.R.flushNeeded();}}

    //----------------------------------------------------------------------------

    /**
     * <p>Append to the <code>toString</code> an <code>int</code>
     * array.</p>
     *
     * @param array  the array to add to the <code>toString</code>
     * @return this
     */
    public ToStringBuilder append(final int[] array) {try{__CLR4_5_29sm9smlvha7acz.R.inc(12757);
        __CLR4_5_29sm9smlvha7acz.R.inc(12758);style.append(buffer, null, array, null);
        __CLR4_5_29sm9smlvha7acz.R.inc(12759);return this;
    }finally{__CLR4_5_29sm9smlvha7acz.R.flushNeeded();}}

    //----------------------------------------------------------------------------

    /**
     * <p>Append to the <code>toString</code> a <code>long</code>
     * value.</p>
     *
     * @param value  the value to add to the <code>toString</code>
     * @return this
     */
    public ToStringBuilder append(final long value) {try{__CLR4_5_29sm9smlvha7acz.R.inc(12760);
        __CLR4_5_29sm9smlvha7acz.R.inc(12761);style.append(buffer, null, value);
        __CLR4_5_29sm9smlvha7acz.R.inc(12762);return this;
    }finally{__CLR4_5_29sm9smlvha7acz.R.flushNeeded();}}

    //----------------------------------------------------------------------------

    /**
     * <p>Append to the <code>toString</code> a <code>long</code>
     * array.</p>
     *
     * @param array  the array to add to the <code>toString</code>
     * @return this
     */
    public ToStringBuilder append(final long[] array) {try{__CLR4_5_29sm9smlvha7acz.R.inc(12763);
        __CLR4_5_29sm9smlvha7acz.R.inc(12764);style.append(buffer, null, array, null);
        __CLR4_5_29sm9smlvha7acz.R.inc(12765);return this;
    }finally{__CLR4_5_29sm9smlvha7acz.R.flushNeeded();}}

    //----------------------------------------------------------------------------

    /**
     * <p>Append to the <code>toString</code> an <code>Object</code>
     * value.</p>
     *
     * @param obj  the value to add to the <code>toString</code>
     * @return this
     */
    public ToStringBuilder append(final Object obj) {try{__CLR4_5_29sm9smlvha7acz.R.inc(12766);
        __CLR4_5_29sm9smlvha7acz.R.inc(12767);style.append(buffer, null, obj, null);
        __CLR4_5_29sm9smlvha7acz.R.inc(12768);return this;
    }finally{__CLR4_5_29sm9smlvha7acz.R.flushNeeded();}}

    //----------------------------------------------------------------------------

    /**
     * <p>Append to the <code>toString</code> an <code>Object</code>
     * array.</p>
     *
     * @param array  the array to add to the <code>toString</code>
     * @return this
     */
    public ToStringBuilder append(final Object[] array) {try{__CLR4_5_29sm9smlvha7acz.R.inc(12769);
        __CLR4_5_29sm9smlvha7acz.R.inc(12770);style.append(buffer, null, array, null);
        __CLR4_5_29sm9smlvha7acz.R.inc(12771);return this;
    }finally{__CLR4_5_29sm9smlvha7acz.R.flushNeeded();}}

    //----------------------------------------------------------------------------

    /**
     * <p>Append to the <code>toString</code> a <code>short</code>
     * value.</p>
     *
     * @param value  the value to add to the <code>toString</code>
     * @return this
     */
    public ToStringBuilder append(final short value) {try{__CLR4_5_29sm9smlvha7acz.R.inc(12772);
        __CLR4_5_29sm9smlvha7acz.R.inc(12773);style.append(buffer, null, value);
        __CLR4_5_29sm9smlvha7acz.R.inc(12774);return this;
    }finally{__CLR4_5_29sm9smlvha7acz.R.flushNeeded();}}

    //----------------------------------------------------------------------------

    /**
     * <p>Append to the <code>toString</code> a <code>short</code>
     * array.</p>
     *
     * @param array  the array to add to the <code>toString</code>
     * @return this
     */
    public ToStringBuilder append(final short[] array) {try{__CLR4_5_29sm9smlvha7acz.R.inc(12775);
        __CLR4_5_29sm9smlvha7acz.R.inc(12776);style.append(buffer, null, array, null);
        __CLR4_5_29sm9smlvha7acz.R.inc(12777);return this;
    }finally{__CLR4_5_29sm9smlvha7acz.R.flushNeeded();}}

    /**
     * <p>Append to the <code>toString</code> a <code>boolean</code>
     * value.</p>
     *
     * @param fieldName  the field name
     * @param value  the value to add to the <code>toString</code>
     * @return this
     */
    public ToStringBuilder append(final String fieldName, final boolean value) {try{__CLR4_5_29sm9smlvha7acz.R.inc(12778);
        __CLR4_5_29sm9smlvha7acz.R.inc(12779);style.append(buffer, fieldName, value);
        __CLR4_5_29sm9smlvha7acz.R.inc(12780);return this;
    }finally{__CLR4_5_29sm9smlvha7acz.R.flushNeeded();}}

    /**
     * <p>Append to the <code>toString</code> a <code>boolean</code>
     * array.</p>
     *
     * @param fieldName  the field name
     * @param array  the array to add to the <code>hashCode</code>
     * @return this
     */
    public ToStringBuilder append(final String fieldName, final boolean[] array) {try{__CLR4_5_29sm9smlvha7acz.R.inc(12781);
        __CLR4_5_29sm9smlvha7acz.R.inc(12782);style.append(buffer, fieldName, array, null);
        __CLR4_5_29sm9smlvha7acz.R.inc(12783);return this;
    }finally{__CLR4_5_29sm9smlvha7acz.R.flushNeeded();}}

    /**
     * <p>Append to the <code>toString</code> a <code>boolean</code>
     * array.</p>
     *
     * <p>A boolean parameter controls the level of detail to show.
     * Setting <code>true</code> will output the array in full. Setting
     * <code>false</code> will output a summary, typically the size of
     * the array.</p>
     *
     * @param fieldName  the field name
     * @param array  the array to add to the <code>toString</code>
     * @param fullDetail  <code>true</code> for detail, <code>false</code>
     *  for summary info
     * @return this
     */
    public ToStringBuilder append(final String fieldName, final boolean[] array, final boolean fullDetail) {try{__CLR4_5_29sm9smlvha7acz.R.inc(12784);
        __CLR4_5_29sm9smlvha7acz.R.inc(12785);style.append(buffer, fieldName, array, Boolean.valueOf(fullDetail));
        __CLR4_5_29sm9smlvha7acz.R.inc(12786);return this;
    }finally{__CLR4_5_29sm9smlvha7acz.R.flushNeeded();}}

    /**
     * <p>Append to the <code>toString</code> an <code>byte</code>
     * value.</p>
     *
     * @param fieldName  the field name
     * @param value  the value to add to the <code>toString</code>
     * @return this
     */
    public ToStringBuilder append(final String fieldName, final byte value) {try{__CLR4_5_29sm9smlvha7acz.R.inc(12787);
        __CLR4_5_29sm9smlvha7acz.R.inc(12788);style.append(buffer, fieldName, value);
        __CLR4_5_29sm9smlvha7acz.R.inc(12789);return this;
    }finally{__CLR4_5_29sm9smlvha7acz.R.flushNeeded();}}

    /**
     * <p>Append to the <code>toString</code> a <code>byte</code> array.</p>
     *
     * @param fieldName  the field name
     * @param array  the array to add to the <code>toString</code>
     * @return this
     */
    public ToStringBuilder append(final String fieldName, final byte[] array) {try{__CLR4_5_29sm9smlvha7acz.R.inc(12790);
        __CLR4_5_29sm9smlvha7acz.R.inc(12791);style.append(buffer, fieldName, array, null);
        __CLR4_5_29sm9smlvha7acz.R.inc(12792);return this;
    }finally{__CLR4_5_29sm9smlvha7acz.R.flushNeeded();}}

    /**
     * <p>Append to the <code>toString</code> a <code>byte</code>
     * array.</p>
     *
     * <p>A boolean parameter controls the level of detail to show.
     * Setting <code>true</code> will output the array in full. Setting
     * <code>false</code> will output a summary, typically the size of
     * the array.
     *
     * @param fieldName  the field name
     * @param array  the array to add to the <code>toString</code>
     * @param fullDetail  <code>true</code> for detail, <code>false</code>
     *  for summary info
     * @return this
     */
    public ToStringBuilder append(final String fieldName, final byte[] array, final boolean fullDetail) {try{__CLR4_5_29sm9smlvha7acz.R.inc(12793);
        __CLR4_5_29sm9smlvha7acz.R.inc(12794);style.append(buffer, fieldName, array, Boolean.valueOf(fullDetail));
        __CLR4_5_29sm9smlvha7acz.R.inc(12795);return this;
    }finally{__CLR4_5_29sm9smlvha7acz.R.flushNeeded();}}

    /**
     * <p>Append to the <code>toString</code> a <code>char</code>
     * value.</p>
     *
     * @param fieldName  the field name
     * @param value  the value to add to the <code>toString</code>
     * @return this
     */
    public ToStringBuilder append(final String fieldName, final char value) {try{__CLR4_5_29sm9smlvha7acz.R.inc(12796);
        __CLR4_5_29sm9smlvha7acz.R.inc(12797);style.append(buffer, fieldName, value);
        __CLR4_5_29sm9smlvha7acz.R.inc(12798);return this;
    }finally{__CLR4_5_29sm9smlvha7acz.R.flushNeeded();}}

    /**
     * <p>Append to the <code>toString</code> a <code>char</code>
     * array.</p>
     *
     * @param fieldName  the field name
     * @param array  the array to add to the <code>toString</code>
     * @return this
     */
    public ToStringBuilder append(final String fieldName, final char[] array) {try{__CLR4_5_29sm9smlvha7acz.R.inc(12799);
        __CLR4_5_29sm9smlvha7acz.R.inc(12800);style.append(buffer, fieldName, array, null);
        __CLR4_5_29sm9smlvha7acz.R.inc(12801);return this;
    }finally{__CLR4_5_29sm9smlvha7acz.R.flushNeeded();}}

    /**
     * <p>Append to the <code>toString</code> a <code>char</code>
     * array.</p>
     *
     * <p>A boolean parameter controls the level of detail to show.
     * Setting <code>true</code> will output the array in full. Setting
     * <code>false</code> will output a summary, typically the size of
     * the array.</p>
     *
     * @param fieldName  the field name
     * @param array  the array to add to the <code>toString</code>
     * @param fullDetail  <code>true</code> for detail, <code>false</code>
     *  for summary info
     * @return this
     */
    public ToStringBuilder append(final String fieldName, final char[] array, final boolean fullDetail) {try{__CLR4_5_29sm9smlvha7acz.R.inc(12802);
        __CLR4_5_29sm9smlvha7acz.R.inc(12803);style.append(buffer, fieldName, array, Boolean.valueOf(fullDetail));
        __CLR4_5_29sm9smlvha7acz.R.inc(12804);return this;
    }finally{__CLR4_5_29sm9smlvha7acz.R.flushNeeded();}}

    /**
     * <p>Append to the <code>toString</code> a <code>double</code>
     * value.</p>
     *
     * @param fieldName  the field name
     * @param value  the value to add to the <code>toString</code>
     * @return this
     */
    public ToStringBuilder append(final String fieldName, final double value) {try{__CLR4_5_29sm9smlvha7acz.R.inc(12805);
        __CLR4_5_29sm9smlvha7acz.R.inc(12806);style.append(buffer, fieldName, value);
        __CLR4_5_29sm9smlvha7acz.R.inc(12807);return this;
    }finally{__CLR4_5_29sm9smlvha7acz.R.flushNeeded();}}

    /**
     * <p>Append to the <code>toString</code> a <code>double</code>
     * array.</p>
     *
     * @param fieldName  the field name
     * @param array  the array to add to the <code>toString</code>
     * @return this
     */
    public ToStringBuilder append(final String fieldName, final double[] array) {try{__CLR4_5_29sm9smlvha7acz.R.inc(12808);
        __CLR4_5_29sm9smlvha7acz.R.inc(12809);style.append(buffer, fieldName, array, null);
        __CLR4_5_29sm9smlvha7acz.R.inc(12810);return this;
    }finally{__CLR4_5_29sm9smlvha7acz.R.flushNeeded();}}

    /**
     * <p>Append to the <code>toString</code> a <code>double</code>
     * array.</p>
     *
     * <p>A boolean parameter controls the level of detail to show.
     * Setting <code>true</code> will output the array in full. Setting
     * <code>false</code> will output a summary, typically the size of
     * the array.</p>
     *
     * @param fieldName  the field name
     * @param array  the array to add to the <code>toString</code>
     * @param fullDetail  <code>true</code> for detail, <code>false</code>
     *  for summary info
     * @return this
     */
    public ToStringBuilder append(final String fieldName, final double[] array, final boolean fullDetail) {try{__CLR4_5_29sm9smlvha7acz.R.inc(12811);
        __CLR4_5_29sm9smlvha7acz.R.inc(12812);style.append(buffer, fieldName, array, Boolean.valueOf(fullDetail));
        __CLR4_5_29sm9smlvha7acz.R.inc(12813);return this;
    }finally{__CLR4_5_29sm9smlvha7acz.R.flushNeeded();}}

    /**
     * <p>Append to the <code>toString</code> an <code>float</code>
     * value.</p>
     *
     * @param fieldName  the field name
     * @param value  the value to add to the <code>toString</code>
     * @return this
     */
    public ToStringBuilder append(final String fieldName, final float value) {try{__CLR4_5_29sm9smlvha7acz.R.inc(12814);
        __CLR4_5_29sm9smlvha7acz.R.inc(12815);style.append(buffer, fieldName, value);
        __CLR4_5_29sm9smlvha7acz.R.inc(12816);return this;
    }finally{__CLR4_5_29sm9smlvha7acz.R.flushNeeded();}}

    /**
     * <p>Append to the <code>toString</code> a <code>float</code>
     * array.</p>
     *
     * @param fieldName  the field name
     * @param array  the array to add to the <code>toString</code>
     * @return this
     */
    public ToStringBuilder append(final String fieldName, final float[] array) {try{__CLR4_5_29sm9smlvha7acz.R.inc(12817);
        __CLR4_5_29sm9smlvha7acz.R.inc(12818);style.append(buffer, fieldName, array, null);
        __CLR4_5_29sm9smlvha7acz.R.inc(12819);return this;
    }finally{__CLR4_5_29sm9smlvha7acz.R.flushNeeded();}}

    /**
     * <p>Append to the <code>toString</code> a <code>float</code>
     * array.</p>
     *
     * <p>A boolean parameter controls the level of detail to show.
     * Setting <code>true</code> will output the array in full. Setting
     * <code>false</code> will output a summary, typically the size of
     * the array.</p>
     *
     * @param fieldName  the field name
     * @param array  the array to add to the <code>toString</code>
     * @param fullDetail  <code>true</code> for detail, <code>false</code>
     *  for summary info
     * @return this
     */
    public ToStringBuilder append(final String fieldName, final float[] array, final boolean fullDetail) {try{__CLR4_5_29sm9smlvha7acz.R.inc(12820);
        __CLR4_5_29sm9smlvha7acz.R.inc(12821);style.append(buffer, fieldName, array, Boolean.valueOf(fullDetail));
        __CLR4_5_29sm9smlvha7acz.R.inc(12822);return this;
    }finally{__CLR4_5_29sm9smlvha7acz.R.flushNeeded();}}

    /**
     * <p>Append to the <code>toString</code> an <code>int</code>
     * value.</p>
     *
     * @param fieldName  the field name
     * @param value  the value to add to the <code>toString</code>
     * @return this
     */
    public ToStringBuilder append(final String fieldName, final int value) {try{__CLR4_5_29sm9smlvha7acz.R.inc(12823);
        __CLR4_5_29sm9smlvha7acz.R.inc(12824);style.append(buffer, fieldName, value);
        __CLR4_5_29sm9smlvha7acz.R.inc(12825);return this;
    }finally{__CLR4_5_29sm9smlvha7acz.R.flushNeeded();}}

    /**
     * <p>Append to the <code>toString</code> an <code>int</code>
     * array.</p>
     *
     * @param fieldName  the field name
     * @param array  the array to add to the <code>toString</code>
     * @return this
     */
    public ToStringBuilder append(final String fieldName, final int[] array) {try{__CLR4_5_29sm9smlvha7acz.R.inc(12826);
        __CLR4_5_29sm9smlvha7acz.R.inc(12827);style.append(buffer, fieldName, array, null);
        __CLR4_5_29sm9smlvha7acz.R.inc(12828);return this;
    }finally{__CLR4_5_29sm9smlvha7acz.R.flushNeeded();}}

    /**
     * <p>Append to the <code>toString</code> an <code>int</code>
     * array.</p>
     *
     * <p>A boolean parameter controls the level of detail to show.
     * Setting <code>true</code> will output the array in full. Setting
     * <code>false</code> will output a summary, typically the size of
     * the array.</p>
     *
     * @param fieldName  the field name
     * @param array  the array to add to the <code>toString</code>
     * @param fullDetail  <code>true</code> for detail, <code>false</code>
     *  for summary info
     * @return this
     */
    public ToStringBuilder append(final String fieldName, final int[] array, final boolean fullDetail) {try{__CLR4_5_29sm9smlvha7acz.R.inc(12829);
        __CLR4_5_29sm9smlvha7acz.R.inc(12830);style.append(buffer, fieldName, array, Boolean.valueOf(fullDetail));
        __CLR4_5_29sm9smlvha7acz.R.inc(12831);return this;
    }finally{__CLR4_5_29sm9smlvha7acz.R.flushNeeded();}}

    /**
     * <p>Append to the <code>toString</code> a <code>long</code>
     * value.</p>
     *
     * @param fieldName  the field name
     * @param value  the value to add to the <code>toString</code>
     * @return this
     */
    public ToStringBuilder append(final String fieldName, final long value) {try{__CLR4_5_29sm9smlvha7acz.R.inc(12832);
        __CLR4_5_29sm9smlvha7acz.R.inc(12833);style.append(buffer, fieldName, value);
        __CLR4_5_29sm9smlvha7acz.R.inc(12834);return this;
    }finally{__CLR4_5_29sm9smlvha7acz.R.flushNeeded();}}

    /**
     * <p>Append to the <code>toString</code> a <code>long</code>
     * array.</p>
     *
     * @param fieldName  the field name
     * @param array  the array to add to the <code>toString</code>
     * @return this
     */
    public ToStringBuilder append(final String fieldName, final long[] array) {try{__CLR4_5_29sm9smlvha7acz.R.inc(12835);
        __CLR4_5_29sm9smlvha7acz.R.inc(12836);style.append(buffer, fieldName, array, null);
        __CLR4_5_29sm9smlvha7acz.R.inc(12837);return this;
    }finally{__CLR4_5_29sm9smlvha7acz.R.flushNeeded();}}

    /**
     * <p>Append to the <code>toString</code> a <code>long</code>
     * array.</p>
     *
     * <p>A boolean parameter controls the level of detail to show.
     * Setting <code>true</code> will output the array in full. Setting
     * <code>false</code> will output a summary, typically the size of
     * the array.</p>
     *
     * @param fieldName  the field name
     * @param array  the array to add to the <code>toString</code>
     * @param fullDetail  <code>true</code> for detail, <code>false</code>
     *  for summary info
     * @return this
     */
    public ToStringBuilder append(final String fieldName, final long[] array, final boolean fullDetail) {try{__CLR4_5_29sm9smlvha7acz.R.inc(12838);
        __CLR4_5_29sm9smlvha7acz.R.inc(12839);style.append(buffer, fieldName, array, Boolean.valueOf(fullDetail));
        __CLR4_5_29sm9smlvha7acz.R.inc(12840);return this;
    }finally{__CLR4_5_29sm9smlvha7acz.R.flushNeeded();}}

    /**
     * <p>Append to the <code>toString</code> an <code>Object</code>
     * value.</p>
     *
     * @param fieldName  the field name
     * @param obj  the value to add to the <code>toString</code>
     * @return this
     */
    public ToStringBuilder append(final String fieldName, final Object obj) {try{__CLR4_5_29sm9smlvha7acz.R.inc(12841);
        __CLR4_5_29sm9smlvha7acz.R.inc(12842);style.append(buffer, fieldName, obj, null);
        __CLR4_5_29sm9smlvha7acz.R.inc(12843);return this;
    }finally{__CLR4_5_29sm9smlvha7acz.R.flushNeeded();}}

    /**
     * <p>Append to the <code>toString</code> an <code>Object</code>
     * value.</p>
     *
     * @param fieldName  the field name
     * @param obj  the value to add to the <code>toString</code>
     * @param fullDetail  <code>true</code> for detail,
     *  <code>false</code> for summary info
     * @return this
     */
    public ToStringBuilder append(final String fieldName, final Object obj, final boolean fullDetail) {try{__CLR4_5_29sm9smlvha7acz.R.inc(12844);
        __CLR4_5_29sm9smlvha7acz.R.inc(12845);style.append(buffer, fieldName, obj, Boolean.valueOf(fullDetail));
        __CLR4_5_29sm9smlvha7acz.R.inc(12846);return this;
    }finally{__CLR4_5_29sm9smlvha7acz.R.flushNeeded();}}

    /**
     * <p>Append to the <code>toString</code> an <code>Object</code>
     * array.</p>
     *
     * @param fieldName  the field name
     * @param array  the array to add to the <code>toString</code>
     * @return this
     */
    public ToStringBuilder append(final String fieldName, final Object[] array) {try{__CLR4_5_29sm9smlvha7acz.R.inc(12847);
        __CLR4_5_29sm9smlvha7acz.R.inc(12848);style.append(buffer, fieldName, array, null);
        __CLR4_5_29sm9smlvha7acz.R.inc(12849);return this;
    }finally{__CLR4_5_29sm9smlvha7acz.R.flushNeeded();}}

    /**
     * <p>Append to the <code>toString</code> an <code>Object</code>
     * array.</p>
     *
     * <p>A boolean parameter controls the level of detail to show.
     * Setting <code>true</code> will output the array in full. Setting
     * <code>false</code> will output a summary, typically the size of
     * the array.</p>
     *
     * @param fieldName  the field name
     * @param array  the array to add to the <code>toString</code>
     * @param fullDetail  <code>true</code> for detail, <code>false</code>
     *  for summary info
     * @return this
     */
    public ToStringBuilder append(final String fieldName, final Object[] array, final boolean fullDetail) {try{__CLR4_5_29sm9smlvha7acz.R.inc(12850);
        __CLR4_5_29sm9smlvha7acz.R.inc(12851);style.append(buffer, fieldName, array, Boolean.valueOf(fullDetail));
        __CLR4_5_29sm9smlvha7acz.R.inc(12852);return this;
    }finally{__CLR4_5_29sm9smlvha7acz.R.flushNeeded();}}

    /**
     * <p>Append to the <code>toString</code> an <code>short</code>
     * value.</p>
     *
     * @param fieldName  the field name
     * @param value  the value to add to the <code>toString</code>
     * @return this
     */
    public ToStringBuilder append(final String fieldName, final short value) {try{__CLR4_5_29sm9smlvha7acz.R.inc(12853);
        __CLR4_5_29sm9smlvha7acz.R.inc(12854);style.append(buffer, fieldName, value);
        __CLR4_5_29sm9smlvha7acz.R.inc(12855);return this;
    }finally{__CLR4_5_29sm9smlvha7acz.R.flushNeeded();}}

    /**
     * <p>Append to the <code>toString</code> a <code>short</code>
     * array.</p>
     *
     * @param fieldName  the field name
     * @param array  the array to add to the <code>toString</code>
     * @return this
     */
    public ToStringBuilder append(final String fieldName, final short[] array) {try{__CLR4_5_29sm9smlvha7acz.R.inc(12856);
        __CLR4_5_29sm9smlvha7acz.R.inc(12857);style.append(buffer, fieldName, array, null);
        __CLR4_5_29sm9smlvha7acz.R.inc(12858);return this;
    }finally{__CLR4_5_29sm9smlvha7acz.R.flushNeeded();}}

    /**
     * <p>Append to the <code>toString</code> a <code>short</code>
     * array.</p>
     *
     * <p>A boolean parameter controls the level of detail to show.
     * Setting <code>true</code> will output the array in full. Setting
     * <code>false</code> will output a summary, typically the size of
     * the array.
     *
     * @param fieldName  the field name
     * @param array  the array to add to the <code>toString</code>
     * @param fullDetail  <code>true</code> for detail, <code>false</code>
     *  for summary info
     * @return this
     */
    public ToStringBuilder append(final String fieldName, final short[] array, final boolean fullDetail) {try{__CLR4_5_29sm9smlvha7acz.R.inc(12859);
        __CLR4_5_29sm9smlvha7acz.R.inc(12860);style.append(buffer, fieldName, array, Boolean.valueOf(fullDetail));
        __CLR4_5_29sm9smlvha7acz.R.inc(12861);return this;
    }finally{__CLR4_5_29sm9smlvha7acz.R.flushNeeded();}}

    /**
     * <p>Appends with the same format as the default <code>Object toString()
     * </code> method. Appends the class name followed by
     * {@link System#identityHashCode(java.lang.Object)}.</p>
     *
     * @param srcObject  the <code>Object</code> whose class name and id to output
     * @return this
     * @since 2.0
     */
    public ToStringBuilder appendAsObjectToString(final Object srcObject) {try{__CLR4_5_29sm9smlvha7acz.R.inc(12862);
        __CLR4_5_29sm9smlvha7acz.R.inc(12863);ObjectUtils.identityToString(this.getStringBuffer(), srcObject);
        __CLR4_5_29sm9smlvha7acz.R.inc(12864);return this;
    }finally{__CLR4_5_29sm9smlvha7acz.R.flushNeeded();}}

    //----------------------------------------------------------------------------

    /**
     * <p>Append the <code>toString</code> from the superclass.</p>
     *
     * <p>This method assumes that the superclass uses the same <code>ToStringStyle</code>
     * as this one.</p>
     *
     * <p>If <code>superToString</code> is <code>null</code>, no change is made.</p>
     *
     * @param superToString  the result of <code>super.toString()</code>
     * @return this
     * @since 2.0
     */
    public ToStringBuilder appendSuper(final String superToString) {try{__CLR4_5_29sm9smlvha7acz.R.inc(12865);
        __CLR4_5_29sm9smlvha7acz.R.inc(12866);if ((((superToString != null)&&(__CLR4_5_29sm9smlvha7acz.R.iget(12867)!=0|true))||(__CLR4_5_29sm9smlvha7acz.R.iget(12868)==0&false))) {{
            __CLR4_5_29sm9smlvha7acz.R.inc(12869);style.appendSuper(buffer, superToString);
        }
        }__CLR4_5_29sm9smlvha7acz.R.inc(12870);return this;
    }finally{__CLR4_5_29sm9smlvha7acz.R.flushNeeded();}}

    /**
     * <p>Append the <code>toString</code> from another object.</p>
     *
     * <p>This method is useful where a class delegates most of the implementation of
     * its properties to another class. You can then call <code>toString()</code> on
     * the other class and pass the result into this method.</p>
     *
     * <pre>
     *   private AnotherObject delegate;
     *   private String fieldInThisClass;
     *
     *   public String toString() {
     *     return new ToStringBuilder(this).
     *       appendToString(delegate.toString()).
     *       append(fieldInThisClass).
     *       toString();
     *   }</pre>
     *
     * <p>This method assumes that the other object uses the same <code>ToStringStyle</code>
     * as this one.</p>
     *
     * <p>If the <code>toString</code> is <code>null</code>, no change is made.</p>
     *
     * @param toString  the result of <code>toString()</code> on another object
     * @return this
     * @since 2.0
     */
    public ToStringBuilder appendToString(final String toString) {try{__CLR4_5_29sm9smlvha7acz.R.inc(12871);
        __CLR4_5_29sm9smlvha7acz.R.inc(12872);if ((((toString != null)&&(__CLR4_5_29sm9smlvha7acz.R.iget(12873)!=0|true))||(__CLR4_5_29sm9smlvha7acz.R.iget(12874)==0&false))) {{
            __CLR4_5_29sm9smlvha7acz.R.inc(12875);style.appendToString(buffer, toString);
        }
        }__CLR4_5_29sm9smlvha7acz.R.inc(12876);return this;
    }finally{__CLR4_5_29sm9smlvha7acz.R.flushNeeded();}}

    /**
     * <p>Returns the <code>Object</code> being output.</p>
     *
     * @return The object being output.
     * @since 2.0
     */
    public Object getObject() {try{__CLR4_5_29sm9smlvha7acz.R.inc(12877);
        __CLR4_5_29sm9smlvha7acz.R.inc(12878);return object;
    }finally{__CLR4_5_29sm9smlvha7acz.R.flushNeeded();}}

    /**
     * <p>Gets the <code>StringBuffer</code> being populated.</p>
     *
     * @return the <code>StringBuffer</code> being populated
     */
    public StringBuffer getStringBuffer() {try{__CLR4_5_29sm9smlvha7acz.R.inc(12879);
        __CLR4_5_29sm9smlvha7acz.R.inc(12880);return buffer;
    }finally{__CLR4_5_29sm9smlvha7acz.R.flushNeeded();}}

    //----------------------------------------------------------------------------

    /**
     * <p>Gets the <code>ToStringStyle</code> being used.</p>
     *
     * @return the <code>ToStringStyle</code> being used
     * @since 2.0
     */
    public ToStringStyle getStyle() {try{__CLR4_5_29sm9smlvha7acz.R.inc(12881);
        __CLR4_5_29sm9smlvha7acz.R.inc(12882);return style;
    }finally{__CLR4_5_29sm9smlvha7acz.R.flushNeeded();}}

    /**
     * <p>Returns the built <code>toString</code>.</p>
     *
     * <p>This method appends the end of data indicator, and can only be called once.
     * Use {@link #getStringBuffer} to get the current string state.</p>
     *
     * <p>If the object is <code>null</code>, return the style's <code>nullText</code></p>
     *
     * @return the String <code>toString</code>
     */
    @Override
    public String toString() {try{__CLR4_5_29sm9smlvha7acz.R.inc(12883);
        __CLR4_5_29sm9smlvha7acz.R.inc(12884);if ((((this.getObject() == null)&&(__CLR4_5_29sm9smlvha7acz.R.iget(12885)!=0|true))||(__CLR4_5_29sm9smlvha7acz.R.iget(12886)==0&false))) {{
            __CLR4_5_29sm9smlvha7acz.R.inc(12887);this.getStringBuffer().append(this.getStyle().getNullText());
        } }else {{
            __CLR4_5_29sm9smlvha7acz.R.inc(12888);style.appendEnd(this.getStringBuffer(), this.getObject());
        }
        }__CLR4_5_29sm9smlvha7acz.R.inc(12889);return this.getStringBuffer().toString();
    }finally{__CLR4_5_29sm9smlvha7acz.R.flushNeeded();}}

    /**
     * Returns the String that was build as an object representation. The
     * default implementation utilizes the {@link #toString()} implementation.
     *
     * @return the String <code>toString</code>
     *
     * @see #toString()
     *
     * @since 3.0
     */
    @Override
    public String build() {try{__CLR4_5_29sm9smlvha7acz.R.inc(12890);
        __CLR4_5_29sm9smlvha7acz.R.inc(12891);return toString();
    }finally{__CLR4_5_29sm9smlvha7acz.R.flushNeeded();}}
}
