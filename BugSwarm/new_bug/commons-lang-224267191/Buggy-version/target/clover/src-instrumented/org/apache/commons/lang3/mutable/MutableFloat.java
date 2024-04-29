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
 * A mutable <code>float</code> wrapper.
 * <p>
 * Note that as MutableFloat does not extend Float, it is not treated by String.format as a Float parameter. 
 * 
 * @see Float
 * @since 2.1
 */
public class MutableFloat extends Number implements Comparable<MutableFloat>, Mutable<Number> {public static class __CLR4_5_2cl1cl1lvha7ay5{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172755542L,8589935092L,16388,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Required for serialization support.
     * 
     * @see java.io.Serializable
     */
    private static final long serialVersionUID = 5787169186L;

    /** The mutable value. */
    private float value;

    /**
     * Constructs a new MutableFloat with the default value of zero.
     */
    public MutableFloat() {
        super();__CLR4_5_2cl1cl1lvha7ay5.R.inc(16310);try{__CLR4_5_2cl1cl1lvha7ay5.R.inc(16309);
    }finally{__CLR4_5_2cl1cl1lvha7ay5.R.flushNeeded();}}

    /**
     * Constructs a new MutableFloat with the specified value.
     * 
     * @param value  the initial value to store
     */
    public MutableFloat(final float value) {
        super();__CLR4_5_2cl1cl1lvha7ay5.R.inc(16312);try{__CLR4_5_2cl1cl1lvha7ay5.R.inc(16311);
        __CLR4_5_2cl1cl1lvha7ay5.R.inc(16313);this.value = value;
    }finally{__CLR4_5_2cl1cl1lvha7ay5.R.flushNeeded();}}

    /**
     * Constructs a new MutableFloat with the specified value.
     * 
     * @param value  the initial value to store, not null
     * @throws NullPointerException if the object is null
     */
    public MutableFloat(final Number value) {
        super();__CLR4_5_2cl1cl1lvha7ay5.R.inc(16315);try{__CLR4_5_2cl1cl1lvha7ay5.R.inc(16314);
        __CLR4_5_2cl1cl1lvha7ay5.R.inc(16316);this.value = value.floatValue();
    }finally{__CLR4_5_2cl1cl1lvha7ay5.R.flushNeeded();}}

    /**
     * Constructs a new MutableFloat parsing the given string.
     * 
     * @param value  the string to parse, not null
     * @throws NumberFormatException if the string cannot be parsed into a float
     * @since 2.5
     */
    public MutableFloat(final String value) throws NumberFormatException {
        super();__CLR4_5_2cl1cl1lvha7ay5.R.inc(16318);try{__CLR4_5_2cl1cl1lvha7ay5.R.inc(16317);
        __CLR4_5_2cl1cl1lvha7ay5.R.inc(16319);this.value = Float.parseFloat(value);
    }finally{__CLR4_5_2cl1cl1lvha7ay5.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Gets the value as a Float instance.
     * 
     * @return the value as a Float, never null
     */
    @Override
    public Float getValue() {try{__CLR4_5_2cl1cl1lvha7ay5.R.inc(16320);
        __CLR4_5_2cl1cl1lvha7ay5.R.inc(16321);return Float.valueOf(this.value);
    }finally{__CLR4_5_2cl1cl1lvha7ay5.R.flushNeeded();}}

    /**
     * Sets the value.
     * 
     * @param value  the value to set
     */
    public void setValue(final float value) {try{__CLR4_5_2cl1cl1lvha7ay5.R.inc(16322);
        __CLR4_5_2cl1cl1lvha7ay5.R.inc(16323);this.value = value;
    }finally{__CLR4_5_2cl1cl1lvha7ay5.R.flushNeeded();}}

    /**
     * Sets the value from any Number instance.
     * 
     * @param value  the value to set, not null
     * @throws NullPointerException if the object is null
     */
    @Override
    public void setValue(final Number value) {try{__CLR4_5_2cl1cl1lvha7ay5.R.inc(16324);
        __CLR4_5_2cl1cl1lvha7ay5.R.inc(16325);this.value = value.floatValue();
    }finally{__CLR4_5_2cl1cl1lvha7ay5.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Checks whether the float value is the special NaN value.
     * 
     * @return true if NaN
     */
    public boolean isNaN() {try{__CLR4_5_2cl1cl1lvha7ay5.R.inc(16326);
        __CLR4_5_2cl1cl1lvha7ay5.R.inc(16327);return Float.isNaN(value);
    }finally{__CLR4_5_2cl1cl1lvha7ay5.R.flushNeeded();}}

    /**
     * Checks whether the float value is infinite.
     * 
     * @return true if infinite
     */
    public boolean isInfinite() {try{__CLR4_5_2cl1cl1lvha7ay5.R.inc(16328);
        __CLR4_5_2cl1cl1lvha7ay5.R.inc(16329);return Float.isInfinite(value);
    }finally{__CLR4_5_2cl1cl1lvha7ay5.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Increments the value.
     *
     * @since Commons Lang 2.2
     */
    public void increment() {try{__CLR4_5_2cl1cl1lvha7ay5.R.inc(16330);
        __CLR4_5_2cl1cl1lvha7ay5.R.inc(16331);value++;
    }finally{__CLR4_5_2cl1cl1lvha7ay5.R.flushNeeded();}}

    /**
     * Increments this instance's value by 1; this method returns the value associated with the instance
     * immediately prior to the increment operation. This method is not thread safe.
     *
     * @return the value associated with the instance before it was incremented
     * @since 3.5
     */
    public float getAndIncrement() {try{__CLR4_5_2cl1cl1lvha7ay5.R.inc(16332);
        __CLR4_5_2cl1cl1lvha7ay5.R.inc(16333);final float last = value;
        __CLR4_5_2cl1cl1lvha7ay5.R.inc(16334);value++;
        __CLR4_5_2cl1cl1lvha7ay5.R.inc(16335);return last;
    }finally{__CLR4_5_2cl1cl1lvha7ay5.R.flushNeeded();}}

    /**
     * Increments this instance's value by 1; this method returns the value associated with the instance
     * immediately after the increment operation. This method is not thread safe.
     *
     * @return the value associated with the instance after it is incremented
     * @since 3.5
     */
    public float incrementAndGet() {try{__CLR4_5_2cl1cl1lvha7ay5.R.inc(16336);
        __CLR4_5_2cl1cl1lvha7ay5.R.inc(16337);value++;
        __CLR4_5_2cl1cl1lvha7ay5.R.inc(16338);return value;
    }finally{__CLR4_5_2cl1cl1lvha7ay5.R.flushNeeded();}}

    /**
     * Decrements the value.
     *
     * @since Commons Lang 2.2
     */
    public void decrement() {try{__CLR4_5_2cl1cl1lvha7ay5.R.inc(16339);
        __CLR4_5_2cl1cl1lvha7ay5.R.inc(16340);value--;
    }finally{__CLR4_5_2cl1cl1lvha7ay5.R.flushNeeded();}}

    /**
     * Decrements this instance's value by 1; this method returns the value associated with the instance
     * immediately prior to the decrement operation. This method is not thread safe.
     *
     * @return the value associated with the instance before it was decremented
     * @since 3.5
     */
    public float getAndDecrement() {try{__CLR4_5_2cl1cl1lvha7ay5.R.inc(16341);
        __CLR4_5_2cl1cl1lvha7ay5.R.inc(16342);final float last = value;
        __CLR4_5_2cl1cl1lvha7ay5.R.inc(16343);value--;
        __CLR4_5_2cl1cl1lvha7ay5.R.inc(16344);return last;
    }finally{__CLR4_5_2cl1cl1lvha7ay5.R.flushNeeded();}}

    /**
     * Decrements this instance's value by 1; this method returns the value associated with the instance
     * immediately after the decrement operation. This method is not thread safe.
     *
     * @return the value associated with the instance after it is decremented
     * @since 3.5
     */
    public float decrementAndGet() {try{__CLR4_5_2cl1cl1lvha7ay5.R.inc(16345);
        __CLR4_5_2cl1cl1lvha7ay5.R.inc(16346);value--;
        __CLR4_5_2cl1cl1lvha7ay5.R.inc(16347);return value;
    }finally{__CLR4_5_2cl1cl1lvha7ay5.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Adds a value to the value of this instance.
     * 
     * @param operand  the value to add, not null
     * @since Commons Lang 2.2
     */
    public void add(final float operand) {try{__CLR4_5_2cl1cl1lvha7ay5.R.inc(16348);
        __CLR4_5_2cl1cl1lvha7ay5.R.inc(16349);this.value += operand;
    }finally{__CLR4_5_2cl1cl1lvha7ay5.R.flushNeeded();}}

    /**
     * Adds a value to the value of this instance.
     * 
     * @param operand  the value to add, not null
     * @throws NullPointerException if the object is null
     * @since Commons Lang 2.2
     */
    public void add(final Number operand) {try{__CLR4_5_2cl1cl1lvha7ay5.R.inc(16350);
        __CLR4_5_2cl1cl1lvha7ay5.R.inc(16351);this.value += operand.floatValue();
    }finally{__CLR4_5_2cl1cl1lvha7ay5.R.flushNeeded();}}

    /**
     * Subtracts a value from the value of this instance.
     * 
     * @param operand  the value to subtract
     * @since Commons Lang 2.2
     */
    public void subtract(final float operand) {try{__CLR4_5_2cl1cl1lvha7ay5.R.inc(16352);
        __CLR4_5_2cl1cl1lvha7ay5.R.inc(16353);this.value -= operand;
    }finally{__CLR4_5_2cl1cl1lvha7ay5.R.flushNeeded();}}

    /**
     * Subtracts a value from the value of this instance.
     * 
     * @param operand  the value to subtract, not null
     * @throws NullPointerException if the object is null
     * @since Commons Lang 2.2
     */
    public void subtract(final Number operand) {try{__CLR4_5_2cl1cl1lvha7ay5.R.inc(16354);
        __CLR4_5_2cl1cl1lvha7ay5.R.inc(16355);this.value -= operand.floatValue();
    }finally{__CLR4_5_2cl1cl1lvha7ay5.R.flushNeeded();}}

    /**
     * Increments this instance's value by {@code operand}; this method returns the value associated with the instance
     * immediately after the addition operation. This method is not thread safe.
     *
     * @param operand the quantity to add, not null
     * @return the value associated with this instance after adding the operand
     * @since 3.5
     */
    public float addAndGet(final float operand) {try{__CLR4_5_2cl1cl1lvha7ay5.R.inc(16356);
        __CLR4_5_2cl1cl1lvha7ay5.R.inc(16357);this.value += operand;
        __CLR4_5_2cl1cl1lvha7ay5.R.inc(16358);return value;
    }finally{__CLR4_5_2cl1cl1lvha7ay5.R.flushNeeded();}}

    /**
     * Increments this instance's value by {@code operand}; this method returns the value associated with the instance
     * immediately after the addition operation. This method is not thread safe.
     *
     * @param operand the quantity to add, not null
     * @throws NullPointerException if {@code operand} is null
     * @return the value associated with this instance after adding the operand
     * @since 3.5
     */
    public float addAndGet(final Number operand) {try{__CLR4_5_2cl1cl1lvha7ay5.R.inc(16359);
        __CLR4_5_2cl1cl1lvha7ay5.R.inc(16360);this.value += operand.floatValue();
        __CLR4_5_2cl1cl1lvha7ay5.R.inc(16361);return value;
    }finally{__CLR4_5_2cl1cl1lvha7ay5.R.flushNeeded();}}

    /**
     * Increments this instance's value by {@code operand}; this method returns the value associated with the instance
     * immediately prior to the addition operation. This method is not thread safe.
     *
     * @param operand the quantity to add, not null
     * @return the value associated with this instance immediately before the operand was added
     * @since 3.5
     */
    public float getAndAdd(final float operand) {try{__CLR4_5_2cl1cl1lvha7ay5.R.inc(16362);
        __CLR4_5_2cl1cl1lvha7ay5.R.inc(16363);final float last = value;
        __CLR4_5_2cl1cl1lvha7ay5.R.inc(16364);this.value += operand;
        __CLR4_5_2cl1cl1lvha7ay5.R.inc(16365);return last;
    }finally{__CLR4_5_2cl1cl1lvha7ay5.R.flushNeeded();}}

    /**
     * Increments this instance's value by {@code operand}; this method returns the value associated with the instance
     * immediately prior to the addition operation. This method is not thread safe.
     *
     * @param operand the quantity to add, not null
     * @throws NullPointerException if {@code operand} is null
     * @return the value associated with this instance immediately before the operand was added
     * @since 3.5
     */
    public float getAndAdd(final Number operand) {try{__CLR4_5_2cl1cl1lvha7ay5.R.inc(16366);
        __CLR4_5_2cl1cl1lvha7ay5.R.inc(16367);final float last = value;
        __CLR4_5_2cl1cl1lvha7ay5.R.inc(16368);this.value += operand.floatValue();
        __CLR4_5_2cl1cl1lvha7ay5.R.inc(16369);return last;
    }finally{__CLR4_5_2cl1cl1lvha7ay5.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    // shortValue and byteValue rely on Number implementation
    /**
     * Returns the value of this MutableFloat as an int.
     *
     * @return the numeric value represented by this object after conversion to type int.
     */
    @Override
    public int intValue() {try{__CLR4_5_2cl1cl1lvha7ay5.R.inc(16370);
        __CLR4_5_2cl1cl1lvha7ay5.R.inc(16371);return (int) value;
    }finally{__CLR4_5_2cl1cl1lvha7ay5.R.flushNeeded();}}

    /**
     * Returns the value of this MutableFloat as a long.
     *
     * @return the numeric value represented by this object after conversion to type long.
     */
    @Override
    public long longValue() {try{__CLR4_5_2cl1cl1lvha7ay5.R.inc(16372);
        __CLR4_5_2cl1cl1lvha7ay5.R.inc(16373);return (long) value;
    }finally{__CLR4_5_2cl1cl1lvha7ay5.R.flushNeeded();}}

    /**
     * Returns the value of this MutableFloat as a float.
     *
     * @return the numeric value represented by this object after conversion to type float.
     */
    @Override
    public float floatValue() {try{__CLR4_5_2cl1cl1lvha7ay5.R.inc(16374);
        __CLR4_5_2cl1cl1lvha7ay5.R.inc(16375);return value;
    }finally{__CLR4_5_2cl1cl1lvha7ay5.R.flushNeeded();}}

    /**
     * Returns the value of this MutableFloat as a double.
     *
     * @return the numeric value represented by this object after conversion to type double.
     */
    @Override
    public double doubleValue() {try{__CLR4_5_2cl1cl1lvha7ay5.R.inc(16376);
        __CLR4_5_2cl1cl1lvha7ay5.R.inc(16377);return value;
    }finally{__CLR4_5_2cl1cl1lvha7ay5.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Gets this mutable as an instance of Float.
     *
     * @return a Float instance containing the value from this mutable, never null
     */
    public Float toFloat() {try{__CLR4_5_2cl1cl1lvha7ay5.R.inc(16378);
        __CLR4_5_2cl1cl1lvha7ay5.R.inc(16379);return Float.valueOf(floatValue());
    }finally{__CLR4_5_2cl1cl1lvha7ay5.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Compares this object against some other object. The result is <code>true</code> if and only if the argument is
     * not <code>null</code> and is a <code>Float</code> object that represents a <code>float</code> that has the
     * identical bit pattern to the bit pattern of the <code>float</code> represented by this object. For this
     * purpose, two float values are considered to be the same if and only if the method
     * {@link Float#floatToIntBits(float)}returns the same int value when applied to each.
     * <p>
     * Note that in most cases, for two instances of class <code>Float</code>,<code>f1</code> and <code>f2</code>,
     * the value of <code>f1.equals(f2)</code> is <code>true</code> if and only if <blockquote>
     * 
     * <pre>
     *   f1.floatValue() == f2.floatValue()
     * </pre>
     * 
     * </blockquote>
     * <p>
     * also has the value <code>true</code>. However, there are two exceptions:
     * <ul>
     * <li>If <code>f1</code> and <code>f2</code> both represent <code>Float.NaN</code>, then the
     * <code>equals</code> method returns <code>true</code>, even though <code>Float.NaN==Float.NaN</code> has
     * the value <code>false</code>.
     * <li>If <code>f1</code> represents <code>+0.0f</code> while <code>f2</code> represents <code>-0.0f</code>,
     * or vice versa, the <code>equal</code> test has the value <code>false</code>, even though
     * <code>0.0f==-0.0f</code> has the value <code>true</code>.
     * </ul>
     * This definition allows hashtables to operate properly.
     * 
     * @param obj  the object to compare with, null returns false
     * @return <code>true</code> if the objects are the same; <code>false</code> otherwise.
     * @see java.lang.Float#floatToIntBits(float)
     */
    @Override
    public boolean equals(final Object obj) {try{__CLR4_5_2cl1cl1lvha7ay5.R.inc(16380);
        __CLR4_5_2cl1cl1lvha7ay5.R.inc(16381);return obj instanceof MutableFloat
            && Float.floatToIntBits(((MutableFloat) obj).value) == Float.floatToIntBits(value);
    }finally{__CLR4_5_2cl1cl1lvha7ay5.R.flushNeeded();}}

    /**
     * Returns a suitable hash code for this mutable.
     * 
     * @return a suitable hash code
     */
    @Override
    public int hashCode() {try{__CLR4_5_2cl1cl1lvha7ay5.R.inc(16382);
        __CLR4_5_2cl1cl1lvha7ay5.R.inc(16383);return Float.floatToIntBits(value);
    }finally{__CLR4_5_2cl1cl1lvha7ay5.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Compares this mutable to another in ascending order.
     * 
     * @param other  the other mutable to compare to, not null
     * @return negative if this is less, zero if equal, positive if greater
     */
    @Override
    public int compareTo(final MutableFloat other) {try{__CLR4_5_2cl1cl1lvha7ay5.R.inc(16384);
        __CLR4_5_2cl1cl1lvha7ay5.R.inc(16385);return Float.compare(this.value, other.value);
    }finally{__CLR4_5_2cl1cl1lvha7ay5.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Returns the String value of this mutable.
     * 
     * @return the mutable value as a string
     */
    @Override
    public String toString() {try{__CLR4_5_2cl1cl1lvha7ay5.R.inc(16386);
        __CLR4_5_2cl1cl1lvha7ay5.R.inc(16387);return String.valueOf(value);
    }finally{__CLR4_5_2cl1cl1lvha7ay5.R.flushNeeded();}}

}
