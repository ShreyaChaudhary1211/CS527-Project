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

import org.apache.commons.lang3.math.NumberUtils;

/**
 * A mutable <code>byte</code> wrapper.
 * <p>
 * Note that as MutableByte does not extend Byte, it is not treated by String.format as a Byte parameter. 
 * 
 * @see Byte
 * @since 2.1
 */
public class MutableByte extends Number implements Comparable<MutableByte>, Mutable<Number> {public static class __CLR4_5_2cgkcgklvha7aw7{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172755542L,8589935092L,16229,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Required for serialization support.
     * 
     * @see java.io.Serializable
     */
    private static final long serialVersionUID = -1585823265L;

    /** The mutable value. */
    private byte value;

    /**
     * Constructs a new MutableByte with the default value of zero.
     */
    public MutableByte() {
        super();__CLR4_5_2cgkcgklvha7aw7.R.inc(16149);try{__CLR4_5_2cgkcgklvha7aw7.R.inc(16148);
    }finally{__CLR4_5_2cgkcgklvha7aw7.R.flushNeeded();}}

    /**
     * Constructs a new MutableByte with the specified value.
     * 
     * @param value  the initial value to store
     */
    public MutableByte(final byte value) {
        super();__CLR4_5_2cgkcgklvha7aw7.R.inc(16151);try{__CLR4_5_2cgkcgklvha7aw7.R.inc(16150);
        __CLR4_5_2cgkcgklvha7aw7.R.inc(16152);this.value = value;
    }finally{__CLR4_5_2cgkcgklvha7aw7.R.flushNeeded();}}

    /**
     * Constructs a new MutableByte with the specified value.
     * 
     * @param value  the initial value to store, not null
     * @throws NullPointerException if the object is null
     */
    public MutableByte(final Number value) {
        super();__CLR4_5_2cgkcgklvha7aw7.R.inc(16154);try{__CLR4_5_2cgkcgklvha7aw7.R.inc(16153);
        __CLR4_5_2cgkcgklvha7aw7.R.inc(16155);this.value = value.byteValue();
    }finally{__CLR4_5_2cgkcgklvha7aw7.R.flushNeeded();}}

    /**
     * Constructs a new MutableByte parsing the given string.
     * 
     * @param value  the string to parse, not null
     * @throws NumberFormatException if the string cannot be parsed into a byte
     * @since 2.5
     */
    public MutableByte(final String value) throws NumberFormatException {
        super();__CLR4_5_2cgkcgklvha7aw7.R.inc(16157);try{__CLR4_5_2cgkcgklvha7aw7.R.inc(16156);
        __CLR4_5_2cgkcgklvha7aw7.R.inc(16158);this.value = Byte.parseByte(value);
    }finally{__CLR4_5_2cgkcgklvha7aw7.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Gets the value as a Byte instance.
     * 
     * @return the value as a Byte, never null
     */
    @Override
    public Byte getValue() {try{__CLR4_5_2cgkcgklvha7aw7.R.inc(16159);
        __CLR4_5_2cgkcgklvha7aw7.R.inc(16160);return Byte.valueOf(this.value);
    }finally{__CLR4_5_2cgkcgklvha7aw7.R.flushNeeded();}}

    /**
     * Sets the value.
     * 
     * @param value  the value to set
     */
    public void setValue(final byte value) {try{__CLR4_5_2cgkcgklvha7aw7.R.inc(16161);
        __CLR4_5_2cgkcgklvha7aw7.R.inc(16162);this.value = value;
    }finally{__CLR4_5_2cgkcgklvha7aw7.R.flushNeeded();}}

    /**
     * Sets the value from any Number instance.
     * 
     * @param value  the value to set, not null
     * @throws NullPointerException if the object is null
     */
    @Override
    public void setValue(final Number value) {try{__CLR4_5_2cgkcgklvha7aw7.R.inc(16163);
        __CLR4_5_2cgkcgklvha7aw7.R.inc(16164);this.value = value.byteValue();
    }finally{__CLR4_5_2cgkcgklvha7aw7.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Increments the value.
     *
     * @since Commons Lang 2.2
     */
    public void increment() {try{__CLR4_5_2cgkcgklvha7aw7.R.inc(16165);
        __CLR4_5_2cgkcgklvha7aw7.R.inc(16166);value++;
    }finally{__CLR4_5_2cgkcgklvha7aw7.R.flushNeeded();}}

    /**
     * Increments this instance's value by 1; this method returns the value associated with the instance
     * immediately prior to the increment operation. This method is not thread safe.
     *
     * @return the value associated with the instance before it was incremented
     * @since 3.5
     */
    public byte getAndIncrement() {try{__CLR4_5_2cgkcgklvha7aw7.R.inc(16167);
        __CLR4_5_2cgkcgklvha7aw7.R.inc(16168);final byte last = value;
        __CLR4_5_2cgkcgklvha7aw7.R.inc(16169);value++;
        __CLR4_5_2cgkcgklvha7aw7.R.inc(16170);return last;
    }finally{__CLR4_5_2cgkcgklvha7aw7.R.flushNeeded();}}

    /**
     * Increments this instance's value by 1; this method returns the value associated with the instance
     * immediately after the increment operation. This method is not thread safe.
     *
     * @return the value associated with the instance after it is incremented
     * @since 3.5
     */
    public byte incrementAndGet() {try{__CLR4_5_2cgkcgklvha7aw7.R.inc(16171);
        __CLR4_5_2cgkcgklvha7aw7.R.inc(16172);value++;
        __CLR4_5_2cgkcgklvha7aw7.R.inc(16173);return value;
    }finally{__CLR4_5_2cgkcgklvha7aw7.R.flushNeeded();}}

    /**
     * Decrements the value.
     *
     * @since Commons Lang 2.2
     */
    public void decrement() {try{__CLR4_5_2cgkcgklvha7aw7.R.inc(16174);
        __CLR4_5_2cgkcgklvha7aw7.R.inc(16175);value--;
    }finally{__CLR4_5_2cgkcgklvha7aw7.R.flushNeeded();}}

    /**
     * Decrements this instance's value by 1; this method returns the value associated with the instance
     * immediately prior to the decrement operation. This method is not thread safe.
     *
     * @return the value associated with the instance before it was decremented
     * @since 3.5
     */
    public byte getAndDecrement() {try{__CLR4_5_2cgkcgklvha7aw7.R.inc(16176);
        __CLR4_5_2cgkcgklvha7aw7.R.inc(16177);final byte last = value;
        __CLR4_5_2cgkcgklvha7aw7.R.inc(16178);value--;
        __CLR4_5_2cgkcgklvha7aw7.R.inc(16179);return last;
    }finally{__CLR4_5_2cgkcgklvha7aw7.R.flushNeeded();}}

    /**
     * Decrements this instance's value by 1; this method returns the value associated with the instance
     * immediately after the decrement operation. This method is not thread safe.
     *
     * @return the value associated with the instance after it is decremented
     * @since 3.5
     */
    public byte decrementAndGet() {try{__CLR4_5_2cgkcgklvha7aw7.R.inc(16180);
        __CLR4_5_2cgkcgklvha7aw7.R.inc(16181);value--;
        __CLR4_5_2cgkcgklvha7aw7.R.inc(16182);return value;
    }finally{__CLR4_5_2cgkcgklvha7aw7.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Adds a value to the value of this instance.
     * 
     * @param operand  the value to add, not null
     * @since Commons Lang 2.2
     */
    public void add(final byte operand) {try{__CLR4_5_2cgkcgklvha7aw7.R.inc(16183);
        __CLR4_5_2cgkcgklvha7aw7.R.inc(16184);this.value += operand;
    }finally{__CLR4_5_2cgkcgklvha7aw7.R.flushNeeded();}}

    /**
     * Adds a value to the value of this instance.
     * 
     * @param operand  the value to add, not null
     * @throws NullPointerException if the object is null
     * @since Commons Lang 2.2
     */
    public void add(final Number operand) {try{__CLR4_5_2cgkcgklvha7aw7.R.inc(16185);
        __CLR4_5_2cgkcgklvha7aw7.R.inc(16186);this.value += operand.byteValue();
    }finally{__CLR4_5_2cgkcgklvha7aw7.R.flushNeeded();}}

    /**
     * Subtracts a value from the value of this instance.
     * 
     * @param operand  the value to subtract, not null
     * @since Commons Lang 2.2
     */
    public void subtract(final byte operand) {try{__CLR4_5_2cgkcgklvha7aw7.R.inc(16187);
        __CLR4_5_2cgkcgklvha7aw7.R.inc(16188);this.value -= operand;
    }finally{__CLR4_5_2cgkcgklvha7aw7.R.flushNeeded();}}

    /**
     * Subtracts a value from the value of this instance.
     * 
     * @param operand  the value to subtract, not null
     * @throws NullPointerException if the object is null
     * @since Commons Lang 2.2
     */
    public void subtract(final Number operand) {try{__CLR4_5_2cgkcgklvha7aw7.R.inc(16189);
        __CLR4_5_2cgkcgklvha7aw7.R.inc(16190);this.value -= operand.byteValue();
    }finally{__CLR4_5_2cgkcgklvha7aw7.R.flushNeeded();}}

    /**
     * Increments this instance's value by {@code operand}; this method returns the value associated with the instance
     * immediately after the addition operation. This method is not thread safe.
     *
     * @param operand the quantity to add, not null
     * @return the value associated with this instance after adding the operand
     * @since 3.5
     */
    public byte addAndGet(final byte operand) {try{__CLR4_5_2cgkcgklvha7aw7.R.inc(16191);
        __CLR4_5_2cgkcgklvha7aw7.R.inc(16192);this.value += operand;
        __CLR4_5_2cgkcgklvha7aw7.R.inc(16193);return value;
    }finally{__CLR4_5_2cgkcgklvha7aw7.R.flushNeeded();}}

    /**
     * Increments this instance's value by {@code operand}; this method returns the value associated with the instance
     * immediately after the addition operation. This method is not thread safe.
     *
     * @param operand the quantity to add, not null
     * @throws NullPointerException if {@code operand} is null
     * @return the value associated with this instance after adding the operand
     * @since 3.5
     */
    public byte addAndGet(final Number operand) {try{__CLR4_5_2cgkcgklvha7aw7.R.inc(16194);
        __CLR4_5_2cgkcgklvha7aw7.R.inc(16195);this.value += operand.byteValue();
        __CLR4_5_2cgkcgklvha7aw7.R.inc(16196);return value;
    }finally{__CLR4_5_2cgkcgklvha7aw7.R.flushNeeded();}}

    /**
     * Increments this instance's value by {@code operand}; this method returns the value associated with the instance
     * immediately prior to the addition operation. This method is not thread safe.
     *
     * @param operand the quantity to add, not null
     * @return the value associated with this instance immediately before the operand was added
     * @since 3.5
     */
    public byte getAndAdd(final byte operand) {try{__CLR4_5_2cgkcgklvha7aw7.R.inc(16197);
        __CLR4_5_2cgkcgklvha7aw7.R.inc(16198);final byte last = value;
        __CLR4_5_2cgkcgklvha7aw7.R.inc(16199);this.value += operand;
        __CLR4_5_2cgkcgklvha7aw7.R.inc(16200);return last;
    }finally{__CLR4_5_2cgkcgklvha7aw7.R.flushNeeded();}}

    /**
     * Increments this instance's value by {@code operand}; this method returns the value associated with the instance
     * immediately prior to the addition operation. This method is not thread safe.
     *
     * @param operand the quantity to add, not null
     * @throws NullPointerException if {@code operand} is null
     * @return the value associated with this instance immediately before the operand was added
     * @since 3.5
     */
    public byte getAndAdd(final Number operand) {try{__CLR4_5_2cgkcgklvha7aw7.R.inc(16201);
        __CLR4_5_2cgkcgklvha7aw7.R.inc(16202);final byte last = value;
        __CLR4_5_2cgkcgklvha7aw7.R.inc(16203);this.value += operand.byteValue();
        __CLR4_5_2cgkcgklvha7aw7.R.inc(16204);return last;
    }finally{__CLR4_5_2cgkcgklvha7aw7.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    // shortValue relies on Number implementation
    /**
     * Returns the value of this MutableByte as a byte.
     *
     * @return the numeric value represented by this object after conversion to type byte.
     */
    @Override
    public byte byteValue() {try{__CLR4_5_2cgkcgklvha7aw7.R.inc(16205);
        __CLR4_5_2cgkcgklvha7aw7.R.inc(16206);return value;
    }finally{__CLR4_5_2cgkcgklvha7aw7.R.flushNeeded();}}

    /**
     * Returns the value of this MutableByte as an int.
     *
     * @return the numeric value represented by this object after conversion to type int.
     */
    @Override
    public int intValue() {try{__CLR4_5_2cgkcgklvha7aw7.R.inc(16207);
        __CLR4_5_2cgkcgklvha7aw7.R.inc(16208);return value;
    }finally{__CLR4_5_2cgkcgklvha7aw7.R.flushNeeded();}}

    /**
     * Returns the value of this MutableByte as a long.
     *
     * @return the numeric value represented by this object after conversion to type long.
     */
    @Override
    public long longValue() {try{__CLR4_5_2cgkcgklvha7aw7.R.inc(16209);
        __CLR4_5_2cgkcgklvha7aw7.R.inc(16210);return value;
    }finally{__CLR4_5_2cgkcgklvha7aw7.R.flushNeeded();}}

    /**
     * Returns the value of this MutableByte as a float.
     *
     * @return the numeric value represented by this object after conversion to type float.
     */
    @Override
    public float floatValue() {try{__CLR4_5_2cgkcgklvha7aw7.R.inc(16211);
        __CLR4_5_2cgkcgklvha7aw7.R.inc(16212);return value;
    }finally{__CLR4_5_2cgkcgklvha7aw7.R.flushNeeded();}}

    /**
     * Returns the value of this MutableByte as a double.
     *
     * @return the numeric value represented by this object after conversion to type double.
     */
    @Override
    public double doubleValue() {try{__CLR4_5_2cgkcgklvha7aw7.R.inc(16213);
        __CLR4_5_2cgkcgklvha7aw7.R.inc(16214);return value;
    }finally{__CLR4_5_2cgkcgklvha7aw7.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Gets this mutable as an instance of Byte.
     *
     * @return a Byte instance containing the value from this mutable
     */
    public Byte toByte() {try{__CLR4_5_2cgkcgklvha7aw7.R.inc(16215);
        __CLR4_5_2cgkcgklvha7aw7.R.inc(16216);return Byte.valueOf(byteValue());
    }finally{__CLR4_5_2cgkcgklvha7aw7.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Compares this object to the specified object. The result is <code>true</code> if and only if the argument is
     * not <code>null</code> and is a <code>MutableByte</code> object that contains the same <code>byte</code> value
     * as this object.
     * 
     * @param obj  the object to compare with, null returns false
     * @return <code>true</code> if the objects are the same; <code>false</code> otherwise.
     */
    @Override
    public boolean equals(final Object obj) {try{__CLR4_5_2cgkcgklvha7aw7.R.inc(16217);
        __CLR4_5_2cgkcgklvha7aw7.R.inc(16218);if ((((obj instanceof MutableByte)&&(__CLR4_5_2cgkcgklvha7aw7.R.iget(16219)!=0|true))||(__CLR4_5_2cgkcgklvha7aw7.R.iget(16220)==0&false))) {{
            __CLR4_5_2cgkcgklvha7aw7.R.inc(16221);return value == ((MutableByte) obj).byteValue();
        }
        }__CLR4_5_2cgkcgklvha7aw7.R.inc(16222);return false;
    }finally{__CLR4_5_2cgkcgklvha7aw7.R.flushNeeded();}}

    /**
     * Returns a suitable hash code for this mutable.
     * 
     * @return a suitable hash code
     */
    @Override
    public int hashCode() {try{__CLR4_5_2cgkcgklvha7aw7.R.inc(16223);
        __CLR4_5_2cgkcgklvha7aw7.R.inc(16224);return value;
    }finally{__CLR4_5_2cgkcgklvha7aw7.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Compares this mutable to another in ascending order.
     * 
     * @param other  the other mutable to compare to, not null
     * @return negative if this is less, zero if equal, positive if greater
     */
    @Override
    public int compareTo(final MutableByte other) {try{__CLR4_5_2cgkcgklvha7aw7.R.inc(16225);
        __CLR4_5_2cgkcgklvha7aw7.R.inc(16226);return NumberUtils.compare(this.value, other.value);
    }finally{__CLR4_5_2cgkcgklvha7aw7.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Returns the String value of this mutable.
     * 
     * @return the mutable value as a string
     */
    @Override
    public String toString() {try{__CLR4_5_2cgkcgklvha7aw7.R.inc(16227);
        __CLR4_5_2cgkcgklvha7aw7.R.inc(16228);return String.valueOf(value);
    }finally{__CLR4_5_2cgkcgklvha7aw7.R.flushNeeded();}}

}
