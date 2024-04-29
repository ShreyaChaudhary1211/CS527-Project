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
 * A mutable <code>long</code> wrapper.
 * <p>
 * Note that as MutableLong does not extend Long, it is not treated by String.format as a Long parameter. 
 * 
 * @see Long
 * @since 2.1
 */
public class MutableLong extends Number implements Comparable<MutableLong>, Mutable<Number> {public static class __CLR4_5_2cpfcpflvha7aym{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172755542L,8589935092L,16546,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Required for serialization support.
     * 
     * @see java.io.Serializable
     */
    private static final long serialVersionUID = 62986528375L;

    /** The mutable value. */
    private long value;

    /**
     * Constructs a new MutableLong with the default value of zero.
     */
    public MutableLong() {
        super();__CLR4_5_2cpfcpflvha7aym.R.inc(16468);try{__CLR4_5_2cpfcpflvha7aym.R.inc(16467);
    }finally{__CLR4_5_2cpfcpflvha7aym.R.flushNeeded();}}

    /**
     * Constructs a new MutableLong with the specified value.
     * 
     * @param value  the initial value to store
     */
    public MutableLong(final long value) {
        super();__CLR4_5_2cpfcpflvha7aym.R.inc(16470);try{__CLR4_5_2cpfcpflvha7aym.R.inc(16469);
        __CLR4_5_2cpfcpflvha7aym.R.inc(16471);this.value = value;
    }finally{__CLR4_5_2cpfcpflvha7aym.R.flushNeeded();}}

    /**
     * Constructs a new MutableLong with the specified value.
     * 
     * @param value  the initial value to store, not null
     * @throws NullPointerException if the object is null
     */
    public MutableLong(final Number value) {
        super();__CLR4_5_2cpfcpflvha7aym.R.inc(16473);try{__CLR4_5_2cpfcpflvha7aym.R.inc(16472);
        __CLR4_5_2cpfcpflvha7aym.R.inc(16474);this.value = value.longValue();
    }finally{__CLR4_5_2cpfcpflvha7aym.R.flushNeeded();}}

    /**
     * Constructs a new MutableLong parsing the given string.
     * 
     * @param value  the string to parse, not null
     * @throws NumberFormatException if the string cannot be parsed into a long
     * @since 2.5
     */
    public MutableLong(final String value) throws NumberFormatException {
        super();__CLR4_5_2cpfcpflvha7aym.R.inc(16476);try{__CLR4_5_2cpfcpflvha7aym.R.inc(16475);
        __CLR4_5_2cpfcpflvha7aym.R.inc(16477);this.value = Long.parseLong(value);
    }finally{__CLR4_5_2cpfcpflvha7aym.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Gets the value as a Long instance.
     * 
     * @return the value as a Long, never null
     */
    @Override
    public Long getValue() {try{__CLR4_5_2cpfcpflvha7aym.R.inc(16478);
        __CLR4_5_2cpfcpflvha7aym.R.inc(16479);return Long.valueOf(this.value);
    }finally{__CLR4_5_2cpfcpflvha7aym.R.flushNeeded();}}

    /**
     * Sets the value.
     * 
     * @param value  the value to set
     */
    public void setValue(final long value) {try{__CLR4_5_2cpfcpflvha7aym.R.inc(16480);
        __CLR4_5_2cpfcpflvha7aym.R.inc(16481);this.value = value;
    }finally{__CLR4_5_2cpfcpflvha7aym.R.flushNeeded();}}

    /**
     * Sets the value from any Number instance.
     * 
     * @param value  the value to set, not null
     * @throws NullPointerException if the object is null
     */
    @Override
    public void setValue(final Number value) {try{__CLR4_5_2cpfcpflvha7aym.R.inc(16482);
        __CLR4_5_2cpfcpflvha7aym.R.inc(16483);this.value = value.longValue();
    }finally{__CLR4_5_2cpfcpflvha7aym.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Increments the value.
     *
     * @since Commons Lang 2.2
     */
    public void increment() {try{__CLR4_5_2cpfcpflvha7aym.R.inc(16484);
        __CLR4_5_2cpfcpflvha7aym.R.inc(16485);value++;
    }finally{__CLR4_5_2cpfcpflvha7aym.R.flushNeeded();}}

    /**
     * Increments this instance's value by 1; this method returns the value associated with the instance
     * immediately prior to the increment operation. This method is not thread safe.
     *
     * @return the value associated with the instance before it was incremented
     * @since 3.5
     */
    public long getAndIncrement() {try{__CLR4_5_2cpfcpflvha7aym.R.inc(16486);
        __CLR4_5_2cpfcpflvha7aym.R.inc(16487);final long last = value;
        __CLR4_5_2cpfcpflvha7aym.R.inc(16488);value++;
        __CLR4_5_2cpfcpflvha7aym.R.inc(16489);return last;
    }finally{__CLR4_5_2cpfcpflvha7aym.R.flushNeeded();}}

    /**
     * Increments this instance's value by 1; this method returns the value associated with the instance
     * immediately after the increment operation. This method is not thread safe.
     *
     * @return the value associated with the instance after it is incremented
     * @since 3.5
     */
    public long incrementAndGet() {try{__CLR4_5_2cpfcpflvha7aym.R.inc(16490);
        __CLR4_5_2cpfcpflvha7aym.R.inc(16491);value++;
        __CLR4_5_2cpfcpflvha7aym.R.inc(16492);return value;
    }finally{__CLR4_5_2cpfcpflvha7aym.R.flushNeeded();}}

    /**
     * Decrements the value.
     *
     * @since Commons Lang 2.2
     */
    public void decrement() {try{__CLR4_5_2cpfcpflvha7aym.R.inc(16493);
        __CLR4_5_2cpfcpflvha7aym.R.inc(16494);value--;
    }finally{__CLR4_5_2cpfcpflvha7aym.R.flushNeeded();}}

    /**
     * Decrements this instance's value by 1; this method returns the value associated with the instance
     * immediately prior to the decrement operation. This method is not thread safe.
     *
     * @return the value associated with the instance before it was decremented
     * @since 3.5
     */
    public long getAndDecrement() {try{__CLR4_5_2cpfcpflvha7aym.R.inc(16495);
        __CLR4_5_2cpfcpflvha7aym.R.inc(16496);final long last = value;
        __CLR4_5_2cpfcpflvha7aym.R.inc(16497);value--;
        __CLR4_5_2cpfcpflvha7aym.R.inc(16498);return last;
    }finally{__CLR4_5_2cpfcpflvha7aym.R.flushNeeded();}}

    /**
     * Decrements this instance's value by 1; this method returns the value associated with the instance
     * immediately after the decrement operation. This method is not thread safe.
     *
     * @return the value associated with the instance after it is decremented
     * @since 3.5
     */
    public long decrementAndGet() {try{__CLR4_5_2cpfcpflvha7aym.R.inc(16499);
        __CLR4_5_2cpfcpflvha7aym.R.inc(16500);value--;
        __CLR4_5_2cpfcpflvha7aym.R.inc(16501);return value;
    }finally{__CLR4_5_2cpfcpflvha7aym.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Adds a value to the value of this instance.
     * 
     * @param operand  the value to add, not null
     * @since Commons Lang 2.2
     */
    public void add(final long operand) {try{__CLR4_5_2cpfcpflvha7aym.R.inc(16502);
        __CLR4_5_2cpfcpflvha7aym.R.inc(16503);this.value += operand;
    }finally{__CLR4_5_2cpfcpflvha7aym.R.flushNeeded();}}

    /**
     * Adds a value to the value of this instance.
     * 
     * @param operand  the value to add, not null
     * @throws NullPointerException if the object is null
     * @since Commons Lang 2.2
     */
    public void add(final Number operand) {try{__CLR4_5_2cpfcpflvha7aym.R.inc(16504);
        __CLR4_5_2cpfcpflvha7aym.R.inc(16505);this.value += operand.longValue();
    }finally{__CLR4_5_2cpfcpflvha7aym.R.flushNeeded();}}

    /**
     * Subtracts a value from the value of this instance.
     * 
     * @param operand  the value to subtract, not null
     * @since Commons Lang 2.2
     */
    public void subtract(final long operand) {try{__CLR4_5_2cpfcpflvha7aym.R.inc(16506);
        __CLR4_5_2cpfcpflvha7aym.R.inc(16507);this.value -= operand;
    }finally{__CLR4_5_2cpfcpflvha7aym.R.flushNeeded();}}

    /**
     * Subtracts a value from the value of this instance.
     * 
     * @param operand  the value to subtract, not null
     * @throws NullPointerException if the object is null
     * @since Commons Lang 2.2
     */
    public void subtract(final Number operand) {try{__CLR4_5_2cpfcpflvha7aym.R.inc(16508);
        __CLR4_5_2cpfcpflvha7aym.R.inc(16509);this.value -= operand.longValue();
    }finally{__CLR4_5_2cpfcpflvha7aym.R.flushNeeded();}}

    /**
     * Increments this instance's value by {@code operand}; this method returns the value associated with the instance
     * immediately after the addition operation. This method is not thread safe.
     *
     * @param operand the quantity to add, not null
     * @return the value associated with this instance after adding the operand
     * @since 3.5
     */
    public long addAndGet(final long operand) {try{__CLR4_5_2cpfcpflvha7aym.R.inc(16510);
        __CLR4_5_2cpfcpflvha7aym.R.inc(16511);this.value += operand;
        __CLR4_5_2cpfcpflvha7aym.R.inc(16512);return value;
    }finally{__CLR4_5_2cpfcpflvha7aym.R.flushNeeded();}}

    /**
     * Increments this instance's value by {@code operand}; this method returns the value associated with the instance
     * immediately after the addition operation. This method is not thread safe.
     *
     * @param operand the quantity to add, not null
     * @throws NullPointerException if {@code operand} is null
     * @return the value associated with this instance after adding the operand
     * @since 3.5
     */
    public long addAndGet(final Number operand) {try{__CLR4_5_2cpfcpflvha7aym.R.inc(16513);
        __CLR4_5_2cpfcpflvha7aym.R.inc(16514);this.value += operand.longValue();
        __CLR4_5_2cpfcpflvha7aym.R.inc(16515);return value;
    }finally{__CLR4_5_2cpfcpflvha7aym.R.flushNeeded();}}

    /**
     * Increments this instance's value by {@code operand}; this method returns the value associated with the instance
     * immediately prior to the addition operation. This method is not thread safe.
     *
     * @param operand the quantity to add, not null
     * @return the value associated with this instance immediately before the operand was added
     * @since 3.5
     */
    public long getAndAdd(final long operand) {try{__CLR4_5_2cpfcpflvha7aym.R.inc(16516);
        __CLR4_5_2cpfcpflvha7aym.R.inc(16517);final long last = value;
        __CLR4_5_2cpfcpflvha7aym.R.inc(16518);this.value += operand;
        __CLR4_5_2cpfcpflvha7aym.R.inc(16519);return last;
    }finally{__CLR4_5_2cpfcpflvha7aym.R.flushNeeded();}}

    /**
     * Increments this instance's value by {@code operand}; this method returns the value associated with the instance
     * immediately prior to the addition operation. This method is not thread safe.
     *
     * @param operand the quantity to add, not null
     * @throws NullPointerException if {@code operand} is null
     * @return the value associated with this instance immediately before the operand was added
     * @since 3.5
     */
    public long getAndAdd(final Number operand) {try{__CLR4_5_2cpfcpflvha7aym.R.inc(16520);
        __CLR4_5_2cpfcpflvha7aym.R.inc(16521);final long last = value;
        __CLR4_5_2cpfcpflvha7aym.R.inc(16522);this.value += operand.longValue();
        __CLR4_5_2cpfcpflvha7aym.R.inc(16523);return last;
    }finally{__CLR4_5_2cpfcpflvha7aym.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    // shortValue and byteValue rely on Number implementation
    /**
     * Returns the value of this MutableLong as an int.
     *
     * @return the numeric value represented by this object after conversion to type int.
     */
    @Override
    public int intValue() {try{__CLR4_5_2cpfcpflvha7aym.R.inc(16524);
        __CLR4_5_2cpfcpflvha7aym.R.inc(16525);return (int) value;
    }finally{__CLR4_5_2cpfcpflvha7aym.R.flushNeeded();}}

    /**
     * Returns the value of this MutableLong as a long.
     *
     * @return the numeric value represented by this object after conversion to type long.
     */
    @Override
    public long longValue() {try{__CLR4_5_2cpfcpflvha7aym.R.inc(16526);
        __CLR4_5_2cpfcpflvha7aym.R.inc(16527);return value;
    }finally{__CLR4_5_2cpfcpflvha7aym.R.flushNeeded();}}

    /**
     * Returns the value of this MutableLong as a float.
     *
     * @return the numeric value represented by this object after conversion to type float.
     */
    @Override
    public float floatValue() {try{__CLR4_5_2cpfcpflvha7aym.R.inc(16528);
        __CLR4_5_2cpfcpflvha7aym.R.inc(16529);return value;
    }finally{__CLR4_5_2cpfcpflvha7aym.R.flushNeeded();}}

    /**
     * Returns the value of this MutableLong as a double.
     *
     * @return the numeric value represented by this object after conversion to type double.
     */
    @Override
    public double doubleValue() {try{__CLR4_5_2cpfcpflvha7aym.R.inc(16530);
        __CLR4_5_2cpfcpflvha7aym.R.inc(16531);return value;
    }finally{__CLR4_5_2cpfcpflvha7aym.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Gets this mutable as an instance of Long.
     *
     * @return a Long instance containing the value from this mutable, never null
     */
    public Long toLong() {try{__CLR4_5_2cpfcpflvha7aym.R.inc(16532);
        __CLR4_5_2cpfcpflvha7aym.R.inc(16533);return Long.valueOf(longValue());
    }finally{__CLR4_5_2cpfcpflvha7aym.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Compares this object to the specified object. The result is <code>true</code> if and only if the argument
     * is not <code>null</code> and is a <code>MutableLong</code> object that contains the same <code>long</code>
     * value as this object.
     * 
     * @param obj  the object to compare with, null returns false
     * @return <code>true</code> if the objects are the same; <code>false</code> otherwise.
     */
    @Override
    public boolean equals(final Object obj) {try{__CLR4_5_2cpfcpflvha7aym.R.inc(16534);
        __CLR4_5_2cpfcpflvha7aym.R.inc(16535);if ((((obj instanceof MutableLong)&&(__CLR4_5_2cpfcpflvha7aym.R.iget(16536)!=0|true))||(__CLR4_5_2cpfcpflvha7aym.R.iget(16537)==0&false))) {{
            __CLR4_5_2cpfcpflvha7aym.R.inc(16538);return value == ((MutableLong) obj).longValue();
        }
        }__CLR4_5_2cpfcpflvha7aym.R.inc(16539);return false;
    }finally{__CLR4_5_2cpfcpflvha7aym.R.flushNeeded();}}

    /**
     * Returns a suitable hash code for this mutable.
     * 
     * @return a suitable hash code
     */
    @Override
    public int hashCode() {try{__CLR4_5_2cpfcpflvha7aym.R.inc(16540);
        __CLR4_5_2cpfcpflvha7aym.R.inc(16541);return (int) (value ^ (value >>> 32));
    }finally{__CLR4_5_2cpfcpflvha7aym.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Compares this mutable to another in ascending order.
     * 
     * @param other  the other mutable to compare to, not null
     * @return negative if this is less, zero if equal, positive if greater
     */
    @Override
    public int compareTo(final MutableLong other) {try{__CLR4_5_2cpfcpflvha7aym.R.inc(16542);
        __CLR4_5_2cpfcpflvha7aym.R.inc(16543);return NumberUtils.compare(this.value, other.value);
    }finally{__CLR4_5_2cpfcpflvha7aym.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Returns the String value of this mutable.
     * 
     * @return the mutable value as a string
     */
    @Override
    public String toString() {try{__CLR4_5_2cpfcpflvha7aym.R.inc(16544);
        __CLR4_5_2cpfcpflvha7aym.R.inc(16545);return String.valueOf(value);
    }finally{__CLR4_5_2cpfcpflvha7aym.R.flushNeeded();}}

}
