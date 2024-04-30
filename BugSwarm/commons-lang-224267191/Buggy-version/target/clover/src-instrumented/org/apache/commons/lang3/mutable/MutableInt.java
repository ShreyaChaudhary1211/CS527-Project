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
 * A mutable <code>int</code> wrapper.
 * <p>
 * Note that as MutableInt does not extend Integer, it is not treated by String.format as an Integer parameter. 
 * 
 * @see Integer
 * @since 2.1
 */
public class MutableInt extends Number implements Comparable<MutableInt>, Mutable<Number> {public static class __CLR4_5_2cn8cn8lvha7aye{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172755542L,8589935092L,16467,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Required for serialization support.
     * 
     * @see java.io.Serializable
     */
    private static final long serialVersionUID = 512176391864L;

    /** The mutable value. */
    private int value;

    /**
     * Constructs a new MutableInt with the default value of zero.
     */
    public MutableInt() {
        super();__CLR4_5_2cn8cn8lvha7aye.R.inc(16389);try{__CLR4_5_2cn8cn8lvha7aye.R.inc(16388);
    }finally{__CLR4_5_2cn8cn8lvha7aye.R.flushNeeded();}}

    /**
     * Constructs a new MutableInt with the specified value.
     * 
     * @param value  the initial value to store
     */
    public MutableInt(final int value) {
        super();__CLR4_5_2cn8cn8lvha7aye.R.inc(16391);try{__CLR4_5_2cn8cn8lvha7aye.R.inc(16390);
        __CLR4_5_2cn8cn8lvha7aye.R.inc(16392);this.value = value;
    }finally{__CLR4_5_2cn8cn8lvha7aye.R.flushNeeded();}}

    /**
     * Constructs a new MutableInt with the specified value.
     * 
     * @param value  the initial value to store, not null
     * @throws NullPointerException if the object is null
     */
    public MutableInt(final Number value) {
        super();__CLR4_5_2cn8cn8lvha7aye.R.inc(16394);try{__CLR4_5_2cn8cn8lvha7aye.R.inc(16393);
        __CLR4_5_2cn8cn8lvha7aye.R.inc(16395);this.value = value.intValue();
    }finally{__CLR4_5_2cn8cn8lvha7aye.R.flushNeeded();}}

    /**
     * Constructs a new MutableInt parsing the given string.
     * 
     * @param value  the string to parse, not null
     * @throws NumberFormatException if the string cannot be parsed into an int
     * @since 2.5
     */
    public MutableInt(final String value) throws NumberFormatException {
        super();__CLR4_5_2cn8cn8lvha7aye.R.inc(16397);try{__CLR4_5_2cn8cn8lvha7aye.R.inc(16396);
        __CLR4_5_2cn8cn8lvha7aye.R.inc(16398);this.value = Integer.parseInt(value);
    }finally{__CLR4_5_2cn8cn8lvha7aye.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Gets the value as a Integer instance.
     * 
     * @return the value as a Integer, never null
     */
    @Override
    public Integer getValue() {try{__CLR4_5_2cn8cn8lvha7aye.R.inc(16399);
        __CLR4_5_2cn8cn8lvha7aye.R.inc(16400);return Integer.valueOf(this.value);
    }finally{__CLR4_5_2cn8cn8lvha7aye.R.flushNeeded();}}

    /**
     * Sets the value.
     * 
     * @param value  the value to set
     */
    public void setValue(final int value) {try{__CLR4_5_2cn8cn8lvha7aye.R.inc(16401);
        __CLR4_5_2cn8cn8lvha7aye.R.inc(16402);this.value = value;
    }finally{__CLR4_5_2cn8cn8lvha7aye.R.flushNeeded();}}

    /**
     * Sets the value from any Number instance.
     * 
     * @param value  the value to set, not null
     * @throws NullPointerException if the object is null
     */
    @Override
    public void setValue(final Number value) {try{__CLR4_5_2cn8cn8lvha7aye.R.inc(16403);
        __CLR4_5_2cn8cn8lvha7aye.R.inc(16404);this.value = value.intValue();
    }finally{__CLR4_5_2cn8cn8lvha7aye.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Increments the value.
     *
     * @since Commons Lang 2.2
     */
    public void increment() {try{__CLR4_5_2cn8cn8lvha7aye.R.inc(16405);
        __CLR4_5_2cn8cn8lvha7aye.R.inc(16406);value++;
    }finally{__CLR4_5_2cn8cn8lvha7aye.R.flushNeeded();}}

    /**
     * Increments this instance's value by 1; this method returns the value associated with the instance
     * immediately prior to the increment operation. This method is not thread safe.
     *
     * @return the value associated with the instance before it was incremented
     * @since 3.5
     */
    public int getAndIncrement() {try{__CLR4_5_2cn8cn8lvha7aye.R.inc(16407);
        __CLR4_5_2cn8cn8lvha7aye.R.inc(16408);final int last = value;
        __CLR4_5_2cn8cn8lvha7aye.R.inc(16409);value++;
        __CLR4_5_2cn8cn8lvha7aye.R.inc(16410);return last;
    }finally{__CLR4_5_2cn8cn8lvha7aye.R.flushNeeded();}}

    /**
     * Increments this instance's value by 1; this method returns the value associated with the instance
     * immediately after the increment operation. This method is not thread safe.
     *
     * @return the value associated with the instance after it is incremented
     * @since 3.5
     */
    public int incrementAndGet() {try{__CLR4_5_2cn8cn8lvha7aye.R.inc(16411);
        __CLR4_5_2cn8cn8lvha7aye.R.inc(16412);value++;
        __CLR4_5_2cn8cn8lvha7aye.R.inc(16413);return value;
    }finally{__CLR4_5_2cn8cn8lvha7aye.R.flushNeeded();}}

    /**
     * Decrements the value.
     *
     * @since Commons Lang 2.2
     */
    public void decrement() {try{__CLR4_5_2cn8cn8lvha7aye.R.inc(16414);
        __CLR4_5_2cn8cn8lvha7aye.R.inc(16415);value--;
    }finally{__CLR4_5_2cn8cn8lvha7aye.R.flushNeeded();}}

    /**
     * Decrements this instance's value by 1; this method returns the value associated with the instance
     * immediately prior to the decrement operation. This method is not thread safe.
     *
     * @return the value associated with the instance before it was decremented
     * @since 3.5
     */
    public int getAndDecrement() {try{__CLR4_5_2cn8cn8lvha7aye.R.inc(16416);
        __CLR4_5_2cn8cn8lvha7aye.R.inc(16417);final int last = value;
        __CLR4_5_2cn8cn8lvha7aye.R.inc(16418);value--;
        __CLR4_5_2cn8cn8lvha7aye.R.inc(16419);return last;
    }finally{__CLR4_5_2cn8cn8lvha7aye.R.flushNeeded();}}

    /**
     * Decrements this instance's value by 1; this method returns the value associated with the instance
     * immediately after the decrement operation. This method is not thread safe.
     *
     * @return the value associated with the instance after it is decremented
     * @since 3.5
     */
    public int decrementAndGet() {try{__CLR4_5_2cn8cn8lvha7aye.R.inc(16420);
        __CLR4_5_2cn8cn8lvha7aye.R.inc(16421);value--;
        __CLR4_5_2cn8cn8lvha7aye.R.inc(16422);return value;
    }finally{__CLR4_5_2cn8cn8lvha7aye.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Adds a value to the value of this instance.
     * 
     * @param operand  the value to add, not null
     * @since Commons Lang 2.2
     */
    public void add(final int operand) {try{__CLR4_5_2cn8cn8lvha7aye.R.inc(16423);
        __CLR4_5_2cn8cn8lvha7aye.R.inc(16424);this.value += operand;
    }finally{__CLR4_5_2cn8cn8lvha7aye.R.flushNeeded();}}

    /**
     * Adds a value to the value of this instance.
     * 
     * @param operand  the value to add, not null
     * @throws NullPointerException if the object is null
     * @since Commons Lang 2.2
     */
    public void add(final Number operand) {try{__CLR4_5_2cn8cn8lvha7aye.R.inc(16425);
        __CLR4_5_2cn8cn8lvha7aye.R.inc(16426);this.value += operand.intValue();
    }finally{__CLR4_5_2cn8cn8lvha7aye.R.flushNeeded();}}

    /**
     * Subtracts a value from the value of this instance.
     * 
     * @param operand  the value to subtract, not null
     * @since Commons Lang 2.2
     */
    public void subtract(final int operand) {try{__CLR4_5_2cn8cn8lvha7aye.R.inc(16427);
        __CLR4_5_2cn8cn8lvha7aye.R.inc(16428);this.value -= operand;
    }finally{__CLR4_5_2cn8cn8lvha7aye.R.flushNeeded();}}

    /**
     * Subtracts a value from the value of this instance.
     * 
     * @param operand  the value to subtract, not null
     * @throws NullPointerException if the object is null
     * @since Commons Lang 2.2
     */
    public void subtract(final Number operand) {try{__CLR4_5_2cn8cn8lvha7aye.R.inc(16429);
        __CLR4_5_2cn8cn8lvha7aye.R.inc(16430);this.value -= operand.intValue();
    }finally{__CLR4_5_2cn8cn8lvha7aye.R.flushNeeded();}}

    /**
     * Increments this instance's value by {@code operand}; this method returns the value associated with the instance
     * immediately after the addition operation. This method is not thread safe.
     *
     * @param operand the quantity to add, not null
     * @return the value associated with this instance after adding the operand
     * @since 3.5
     */
    public int addAndGet(final int operand) {try{__CLR4_5_2cn8cn8lvha7aye.R.inc(16431);
        __CLR4_5_2cn8cn8lvha7aye.R.inc(16432);this.value += operand;
        __CLR4_5_2cn8cn8lvha7aye.R.inc(16433);return value;
    }finally{__CLR4_5_2cn8cn8lvha7aye.R.flushNeeded();}}

    /**
     * Increments this instance's value by {@code operand}; this method returns the value associated with the instance
     * immediately after the addition operation. This method is not thread safe.
     *
     * @param operand the quantity to add, not null
     * @throws NullPointerException if {@code operand} is null
     * @return the value associated with this instance after adding the operand
     * @since 3.5
     */
    public int addAndGet(final Number operand) {try{__CLR4_5_2cn8cn8lvha7aye.R.inc(16434);
        __CLR4_5_2cn8cn8lvha7aye.R.inc(16435);this.value += operand.intValue();
        __CLR4_5_2cn8cn8lvha7aye.R.inc(16436);return value;
    }finally{__CLR4_5_2cn8cn8lvha7aye.R.flushNeeded();}}

    /**
     * Increments this instance's value by {@code operand}; this method returns the value associated with the instance
     * immediately prior to the addition operation. This method is not thread safe.
     *
     * @param operand the quantity to add, not null
     * @return the value associated with this instance immediately before the operand was added
     * @since 3.5
     */
    public int getAndAdd(final int operand) {try{__CLR4_5_2cn8cn8lvha7aye.R.inc(16437);
        __CLR4_5_2cn8cn8lvha7aye.R.inc(16438);final int last = value;
        __CLR4_5_2cn8cn8lvha7aye.R.inc(16439);this.value += operand;
        __CLR4_5_2cn8cn8lvha7aye.R.inc(16440);return last;
    }finally{__CLR4_5_2cn8cn8lvha7aye.R.flushNeeded();}}

    /**
     * Increments this instance's value by {@code operand}; this method returns the value associated with the instance
     * immediately prior to the addition operation. This method is not thread safe.
     *
     * @param operand the quantity to add, not null
     * @throws NullPointerException if {@code operand} is null
     * @return the value associated with this instance immediately before the operand was added
     * @since 3.5
     */
    public int getAndAdd(final Number operand) {try{__CLR4_5_2cn8cn8lvha7aye.R.inc(16441);
        __CLR4_5_2cn8cn8lvha7aye.R.inc(16442);final int last = value;
        __CLR4_5_2cn8cn8lvha7aye.R.inc(16443);this.value += operand.intValue();
        __CLR4_5_2cn8cn8lvha7aye.R.inc(16444);return last;
    }finally{__CLR4_5_2cn8cn8lvha7aye.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    // shortValue and byteValue rely on Number implementation
    /**
     * Returns the value of this MutableInt as an int.
     *
     * @return the numeric value represented by this object after conversion to type int.
     */
    @Override
    public int intValue() {try{__CLR4_5_2cn8cn8lvha7aye.R.inc(16445);
        __CLR4_5_2cn8cn8lvha7aye.R.inc(16446);return value;
    }finally{__CLR4_5_2cn8cn8lvha7aye.R.flushNeeded();}}

    /**
     * Returns the value of this MutableInt as a long.
     *
     * @return the numeric value represented by this object after conversion to type long.
     */
    @Override
    public long longValue() {try{__CLR4_5_2cn8cn8lvha7aye.R.inc(16447);
        __CLR4_5_2cn8cn8lvha7aye.R.inc(16448);return value;
    }finally{__CLR4_5_2cn8cn8lvha7aye.R.flushNeeded();}}

    /**
     * Returns the value of this MutableInt as a float.
     *
     * @return the numeric value represented by this object after conversion to type float.
     */
    @Override
    public float floatValue() {try{__CLR4_5_2cn8cn8lvha7aye.R.inc(16449);
        __CLR4_5_2cn8cn8lvha7aye.R.inc(16450);return value;
    }finally{__CLR4_5_2cn8cn8lvha7aye.R.flushNeeded();}}

    /**
     * Returns the value of this MutableInt as a double.
     *
     * @return the numeric value represented by this object after conversion to type double.
     */
    @Override
    public double doubleValue() {try{__CLR4_5_2cn8cn8lvha7aye.R.inc(16451);
        __CLR4_5_2cn8cn8lvha7aye.R.inc(16452);return value;
    }finally{__CLR4_5_2cn8cn8lvha7aye.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Gets this mutable as an instance of Integer.
     *
     * @return a Integer instance containing the value from this mutable, never null
     */
    public Integer toInteger() {try{__CLR4_5_2cn8cn8lvha7aye.R.inc(16453);
        __CLR4_5_2cn8cn8lvha7aye.R.inc(16454);return Integer.valueOf(intValue());
    }finally{__CLR4_5_2cn8cn8lvha7aye.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Compares this object to the specified object. The result is <code>true</code> if and only if the argument is
     * not <code>null</code> and is a <code>MutableInt</code> object that contains the same <code>int</code> value
     * as this object.
     * 
     * @param obj  the object to compare with, null returns false
     * @return <code>true</code> if the objects are the same; <code>false</code> otherwise.
     */
    @Override
    public boolean equals(final Object obj) {try{__CLR4_5_2cn8cn8lvha7aye.R.inc(16455);
        __CLR4_5_2cn8cn8lvha7aye.R.inc(16456);if ((((obj instanceof MutableInt)&&(__CLR4_5_2cn8cn8lvha7aye.R.iget(16457)!=0|true))||(__CLR4_5_2cn8cn8lvha7aye.R.iget(16458)==0&false))) {{
            __CLR4_5_2cn8cn8lvha7aye.R.inc(16459);return value == ((MutableInt) obj).intValue();
        }
        }__CLR4_5_2cn8cn8lvha7aye.R.inc(16460);return false;
    }finally{__CLR4_5_2cn8cn8lvha7aye.R.flushNeeded();}}

    /**
     * Returns a suitable hash code for this mutable.
     * 
     * @return a suitable hash code
     */
    @Override
    public int hashCode() {try{__CLR4_5_2cn8cn8lvha7aye.R.inc(16461);
        __CLR4_5_2cn8cn8lvha7aye.R.inc(16462);return value;
    }finally{__CLR4_5_2cn8cn8lvha7aye.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Compares this mutable to another in ascending order.
     * 
     * @param other  the other mutable to compare to, not null
     * @return negative if this is less, zero if equal, positive if greater
     */
    @Override
    public int compareTo(final MutableInt other) {try{__CLR4_5_2cn8cn8lvha7aye.R.inc(16463);
        __CLR4_5_2cn8cn8lvha7aye.R.inc(16464);return NumberUtils.compare(this.value, other.value);
    }finally{__CLR4_5_2cn8cn8lvha7aye.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Returns the String value of this mutable.
     * 
     * @return the mutable value as a string
     */
    @Override
    public String toString() {try{__CLR4_5_2cn8cn8lvha7aye.R.inc(16465);
        __CLR4_5_2cn8cn8lvha7aye.R.inc(16466);return String.valueOf(value);
    }finally{__CLR4_5_2cn8cn8lvha7aye.R.flushNeeded();}}

}
