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
package org.apache.commons.lang3.mutable;

/**
 * A mutable <code>double</code> wrapper.
 * <p>
 * Note that as MutableDouble does not extend Double, it is not treated by String.format as a Double parameter. 
 * 
 * @see Double
 * @since 2.1
 */
public class MutableDouble extends Number implements Comparable<MutableDouble>, Mutable<Number> {public static class __CLR4_5_2citcitlvha7aww{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172755542L,8589935092L,16309,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Required for serialization support.
     * 
     * @see java.io.Serializable
     */
    private static final long serialVersionUID = 1587163916L;

    /** The mutable value. */
    private double value;

    /**
     * Constructs a new MutableDouble with the default value of zero.
     */
    public MutableDouble() {
        super();__CLR4_5_2citcitlvha7aww.R.inc(16230);try{__CLR4_5_2citcitlvha7aww.R.inc(16229);
    }finally{__CLR4_5_2citcitlvha7aww.R.flushNeeded();}}

    /**
     * Constructs a new MutableDouble with the specified value.
     * 
     * @param value  the initial value to store
     */
    public MutableDouble(final double value) {
        super();__CLR4_5_2citcitlvha7aww.R.inc(16232);try{__CLR4_5_2citcitlvha7aww.R.inc(16231);
        __CLR4_5_2citcitlvha7aww.R.inc(16233);this.value = value;
    }finally{__CLR4_5_2citcitlvha7aww.R.flushNeeded();}}

    /**
     * Constructs a new MutableDouble with the specified value.
     * 
     * @param value  the initial value to store, not null
     * @throws NullPointerException if the object is null
     */
    public MutableDouble(final Number value) {
        super();__CLR4_5_2citcitlvha7aww.R.inc(16235);try{__CLR4_5_2citcitlvha7aww.R.inc(16234);
        __CLR4_5_2citcitlvha7aww.R.inc(16236);this.value = value.doubleValue();
    }finally{__CLR4_5_2citcitlvha7aww.R.flushNeeded();}}

    /**
     * Constructs a new MutableDouble parsing the given string.
     * 
     * @param value  the string to parse, not null
     * @throws NumberFormatException if the string cannot be parsed into a double
     * @since 2.5
     */
    public MutableDouble(final String value) throws NumberFormatException {
        super();__CLR4_5_2citcitlvha7aww.R.inc(16238);try{__CLR4_5_2citcitlvha7aww.R.inc(16237);
        __CLR4_5_2citcitlvha7aww.R.inc(16239);this.value = Double.parseDouble(value);
    }finally{__CLR4_5_2citcitlvha7aww.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Gets the value as a Double instance.
     * 
     * @return the value as a Double, never null
     */
    @Override
    public Double getValue() {try{__CLR4_5_2citcitlvha7aww.R.inc(16240);
        __CLR4_5_2citcitlvha7aww.R.inc(16241);return Double.valueOf(this.value);
    }finally{__CLR4_5_2citcitlvha7aww.R.flushNeeded();}}

    /**
     * Sets the value.
     * 
     * @param value  the value to set
     */
    public void setValue(final double value) {try{__CLR4_5_2citcitlvha7aww.R.inc(16242);
        __CLR4_5_2citcitlvha7aww.R.inc(16243);this.value = value;
    }finally{__CLR4_5_2citcitlvha7aww.R.flushNeeded();}}

    /**
     * Sets the value from any Number instance.
     * 
     * @param value  the value to set, not null
     * @throws NullPointerException if the object is null
     */
    @Override
    public void setValue(final Number value) {try{__CLR4_5_2citcitlvha7aww.R.inc(16244);
        __CLR4_5_2citcitlvha7aww.R.inc(16245);this.value = value.doubleValue();
    }finally{__CLR4_5_2citcitlvha7aww.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Checks whether the double value is the special NaN value.
     * 
     * @return true if NaN
     */
    public boolean isNaN() {try{__CLR4_5_2citcitlvha7aww.R.inc(16246);
        __CLR4_5_2citcitlvha7aww.R.inc(16247);return Double.isNaN(value);
    }finally{__CLR4_5_2citcitlvha7aww.R.flushNeeded();}}

    /**
     * Checks whether the double value is infinite.
     * 
     * @return true if infinite
     */
    public boolean isInfinite() {try{__CLR4_5_2citcitlvha7aww.R.inc(16248);
        __CLR4_5_2citcitlvha7aww.R.inc(16249);return Double.isInfinite(value);
    }finally{__CLR4_5_2citcitlvha7aww.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Increments the value.
     *
     * @since Commons Lang 2.2
     */
    public void increment() {try{__CLR4_5_2citcitlvha7aww.R.inc(16250);
        __CLR4_5_2citcitlvha7aww.R.inc(16251);value++;
    }finally{__CLR4_5_2citcitlvha7aww.R.flushNeeded();}}

    /**
     * Increments this instance's value by 1; this method returns the value associated with the instance
     * immediately prior to the increment operation. This method is not thread safe.
     *
     * @return the value associated with the instance before it was incremented
     * @since 3.5
     */
    public double getAndIncrement() {try{__CLR4_5_2citcitlvha7aww.R.inc(16252);
        __CLR4_5_2citcitlvha7aww.R.inc(16253);final double last = value;
        __CLR4_5_2citcitlvha7aww.R.inc(16254);value++;
        __CLR4_5_2citcitlvha7aww.R.inc(16255);return last;
    }finally{__CLR4_5_2citcitlvha7aww.R.flushNeeded();}}

    /**
     * Increments this instance's value by 1; this method returns the value associated with the instance
     * immediately after the increment operation. This method is not thread safe.
     *
     * @return the value associated with the instance after it is incremented
     * @since 3.5
     */
    public double incrementAndGet() {try{__CLR4_5_2citcitlvha7aww.R.inc(16256);
        __CLR4_5_2citcitlvha7aww.R.inc(16257);value++;
        __CLR4_5_2citcitlvha7aww.R.inc(16258);return value;
    }finally{__CLR4_5_2citcitlvha7aww.R.flushNeeded();}}

    /**
     * Decrements the value.
     *
     * @since Commons Lang 2.2
     */
    public void decrement() {try{__CLR4_5_2citcitlvha7aww.R.inc(16259);
        __CLR4_5_2citcitlvha7aww.R.inc(16260);value--;
    }finally{__CLR4_5_2citcitlvha7aww.R.flushNeeded();}}

    /**
     * Decrements this instance's value by 1; this method returns the value associated with the instance
     * immediately prior to the decrement operation. This method is not thread safe.
     *
     * @return the value associated with the instance before it was decremented
     * @since 3.5
     */
    public double getAndDecrement() {try{__CLR4_5_2citcitlvha7aww.R.inc(16261);
        __CLR4_5_2citcitlvha7aww.R.inc(16262);final double last = value;
        __CLR4_5_2citcitlvha7aww.R.inc(16263);value--;
        __CLR4_5_2citcitlvha7aww.R.inc(16264);return last;
    }finally{__CLR4_5_2citcitlvha7aww.R.flushNeeded();}}

    /**
     * Decrements this instance's value by 1; this method returns the value associated with the instance
     * immediately after the decrement operation. This method is not thread safe.
     *
     * @return the value associated with the instance after it is decremented
     * @since 3.5
     */
    public double decrementAndGet() {try{__CLR4_5_2citcitlvha7aww.R.inc(16265);
        __CLR4_5_2citcitlvha7aww.R.inc(16266);value--;
        __CLR4_5_2citcitlvha7aww.R.inc(16267);return value;
    }finally{__CLR4_5_2citcitlvha7aww.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Adds a value to the value of this instance.
     * 
     * @param operand  the value to add
     * @since Commons Lang 2.2
     */
    public void add(final double operand) {try{__CLR4_5_2citcitlvha7aww.R.inc(16268);
        __CLR4_5_2citcitlvha7aww.R.inc(16269);this.value += operand;
    }finally{__CLR4_5_2citcitlvha7aww.R.flushNeeded();}}

    /**
     * Adds a value to the value of this instance.
     * 
     * @param operand  the value to add, not null
     * @throws NullPointerException if the object is null
     * @since Commons Lang 2.2
     */
    public void add(final Number operand) {try{__CLR4_5_2citcitlvha7aww.R.inc(16270);
        __CLR4_5_2citcitlvha7aww.R.inc(16271);this.value += operand.doubleValue();
    }finally{__CLR4_5_2citcitlvha7aww.R.flushNeeded();}}

    /**
     * Subtracts a value from the value of this instance.
     * 
     * @param operand  the value to subtract, not null
     * @since Commons Lang 2.2
     */
    public void subtract(final double operand) {try{__CLR4_5_2citcitlvha7aww.R.inc(16272);
        __CLR4_5_2citcitlvha7aww.R.inc(16273);this.value -= operand;
    }finally{__CLR4_5_2citcitlvha7aww.R.flushNeeded();}}

    /**
     * Subtracts a value from the value of this instance.
     * 
     * @param operand  the value to subtract, not null
     * @throws NullPointerException if the object is null
     * @since Commons Lang 2.2
     */
    public void subtract(final Number operand) {try{__CLR4_5_2citcitlvha7aww.R.inc(16274);
        __CLR4_5_2citcitlvha7aww.R.inc(16275);this.value -= operand.doubleValue();
    }finally{__CLR4_5_2citcitlvha7aww.R.flushNeeded();}}

    /**
     * Increments this instance's value by {@code operand}; this method returns the value associated with the instance
     * immediately after the addition operation. This method is not thread safe.
     *
     * @param operand the quantity to add, not null
     * @return the value associated with this instance after adding the operand
     * @since 3.5
     */
    public double addAndGet(final double operand) {try{__CLR4_5_2citcitlvha7aww.R.inc(16276);
        __CLR4_5_2citcitlvha7aww.R.inc(16277);this.value += operand;
        __CLR4_5_2citcitlvha7aww.R.inc(16278);return value;
    }finally{__CLR4_5_2citcitlvha7aww.R.flushNeeded();}}

    /**
     * Increments this instance's value by {@code operand}; this method returns the value associated with the instance
     * immediately after the addition operation. This method is not thread safe.
     *
     * @param operand the quantity to add, not null
     * @throws NullPointerException if {@code operand} is null
     * @return the value associated with this instance after adding the operand
     * @since 3.5
     */
    public double addAndGet(final Number operand) {try{__CLR4_5_2citcitlvha7aww.R.inc(16279);
        __CLR4_5_2citcitlvha7aww.R.inc(16280);this.value += operand.doubleValue();
        __CLR4_5_2citcitlvha7aww.R.inc(16281);return value;
    }finally{__CLR4_5_2citcitlvha7aww.R.flushNeeded();}}

    /**
     * Increments this instance's value by {@code operand}; this method returns the value associated with the instance
     * immediately prior to the addition operation. This method is not thread safe.
     *
     * @param operand the quantity to add, not null
     * @return the value associated with this instance immediately before the operand was added
     * @since 3.5
     */
    public double getAndAdd(final double operand) {try{__CLR4_5_2citcitlvha7aww.R.inc(16282);
        __CLR4_5_2citcitlvha7aww.R.inc(16283);final double last = value;
        __CLR4_5_2citcitlvha7aww.R.inc(16284);this.value += operand;
        __CLR4_5_2citcitlvha7aww.R.inc(16285);return last;
    }finally{__CLR4_5_2citcitlvha7aww.R.flushNeeded();}}

    /**
     * Increments this instance's value by {@code operand}; this method returns the value associated with the instance
     * immediately prior to the addition operation. This method is not thread safe.
     *
     * @param operand the quantity to add, not null
     * @throws NullPointerException if {@code operand} is null
     * @return the value associated with this instance immediately before the operand was added
     * @since 3.5
     */
    public double getAndAdd(final Number operand) {try{__CLR4_5_2citcitlvha7aww.R.inc(16286);
        __CLR4_5_2citcitlvha7aww.R.inc(16287);final double last = value;
        __CLR4_5_2citcitlvha7aww.R.inc(16288);this.value += operand.doubleValue();
        __CLR4_5_2citcitlvha7aww.R.inc(16289);return last;
    }finally{__CLR4_5_2citcitlvha7aww.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    // shortValue and byteValue rely on Number implementation
    /**
     * Returns the value of this MutableDouble as an int.
     *
     * @return the numeric value represented by this object after conversion to type int.
     */
    @Override
    public int intValue() {try{__CLR4_5_2citcitlvha7aww.R.inc(16290);
        __CLR4_5_2citcitlvha7aww.R.inc(16291);return (int) value;
    }finally{__CLR4_5_2citcitlvha7aww.R.flushNeeded();}}

    /**
     * Returns the value of this MutableDouble as a long.
     *
     * @return the numeric value represented by this object after conversion to type long.
     */
    @Override
    public long longValue() {try{__CLR4_5_2citcitlvha7aww.R.inc(16292);
        __CLR4_5_2citcitlvha7aww.R.inc(16293);return (long) value;
    }finally{__CLR4_5_2citcitlvha7aww.R.flushNeeded();}}

    /**
     * Returns the value of this MutableDouble as a float.
     *
     * @return the numeric value represented by this object after conversion to type float.
     */
    @Override
    public float floatValue() {try{__CLR4_5_2citcitlvha7aww.R.inc(16294);
        __CLR4_5_2citcitlvha7aww.R.inc(16295);return (float) value;
    }finally{__CLR4_5_2citcitlvha7aww.R.flushNeeded();}}

    /**
     * Returns the value of this MutableDouble as a double.
     *
     * @return the numeric value represented by this object after conversion to type double.
     */
    @Override
    public double doubleValue() {try{__CLR4_5_2citcitlvha7aww.R.inc(16296);
        __CLR4_5_2citcitlvha7aww.R.inc(16297);return value;
    }finally{__CLR4_5_2citcitlvha7aww.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Gets this mutable as an instance of Double.
     *
     * @return a Double instance containing the value from this mutable, never null
     */
    public Double toDouble() {try{__CLR4_5_2citcitlvha7aww.R.inc(16298);
        __CLR4_5_2citcitlvha7aww.R.inc(16299);return Double.valueOf(doubleValue());
    }finally{__CLR4_5_2citcitlvha7aww.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Compares this object against the specified object. The result is <code>true</code> if and only if the argument
     * is not <code>null</code> and is a <code>Double</code> object that represents a double that has the identical
     * bit pattern to the bit pattern of the double represented by this object. For this purpose, two
     * <code>double</code> values are considered to be the same if and only if the method
     * {@link Double#doubleToLongBits(double)}returns the same long value when applied to each.
     * <p>
     * Note that in most cases, for two instances of class <code>Double</code>,<code>d1</code> and <code>d2</code>,
     * the value of <code>d1.equals(d2)</code> is <code>true</code> if and only if <blockquote>
     * 
     * <pre>
     *   d1.doubleValue()&nbsp;== d2.doubleValue()
     * </pre>
     * 
     * </blockquote>
     * <p>
     * also has the value <code>true</code>. However, there are two exceptions:
     * <ul>
     * <li>If <code>d1</code> and <code>d2</code> both represent <code>Double.NaN</code>, then the
     * <code>equals</code> method returns <code>true</code>, even though <code>Double.NaN==Double.NaN</code> has
     * the value <code>false</code>.
     * <li>If <code>d1</code> represents <code>+0.0</code> while <code>d2</code> represents <code>-0.0</code>,
     * or vice versa, the <code>equal</code> test has the value <code>false</code>, even though
     * <code>+0.0==-0.0</code> has the value <code>true</code>. This allows hashtables to operate properly.
     * </ul>
     * 
     * @param obj  the object to compare with, null returns false
     * @return <code>true</code> if the objects are the same; <code>false</code> otherwise.
     */
    @Override
    public boolean equals(final Object obj) {try{__CLR4_5_2citcitlvha7aww.R.inc(16300);
        __CLR4_5_2citcitlvha7aww.R.inc(16301);return obj instanceof MutableDouble
            && Double.doubleToLongBits(((MutableDouble) obj).value) == Double.doubleToLongBits(value);
    }finally{__CLR4_5_2citcitlvha7aww.R.flushNeeded();}}

    /**
     * Returns a suitable hash code for this mutable.
     * 
     * @return a suitable hash code
     */
    @Override
    public int hashCode() {try{__CLR4_5_2citcitlvha7aww.R.inc(16302);
        __CLR4_5_2citcitlvha7aww.R.inc(16303);final long bits = Double.doubleToLongBits(value);
        __CLR4_5_2citcitlvha7aww.R.inc(16304);return (int) (bits ^ bits >>> 32);
    }finally{__CLR4_5_2citcitlvha7aww.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Compares this mutable to another in ascending order.
     * 
     * @param other  the other mutable to compare to, not null
     * @return negative if this is less, zero if equal, positive if greater
     */
    @Override
    public int compareTo(final MutableDouble other) {try{__CLR4_5_2citcitlvha7aww.R.inc(16305);
        __CLR4_5_2citcitlvha7aww.R.inc(16306);return Double.compare(this.value, other.value);
    }finally{__CLR4_5_2citcitlvha7aww.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Returns the String value of this mutable.
     * 
     * @return the mutable value as a string
     */
    @Override
    public String toString() {try{__CLR4_5_2citcitlvha7aww.R.inc(16307);
        __CLR4_5_2citcitlvha7aww.R.inc(16308);return String.valueOf(value);
    }finally{__CLR4_5_2citcitlvha7aww.R.flushNeeded();}}

}
