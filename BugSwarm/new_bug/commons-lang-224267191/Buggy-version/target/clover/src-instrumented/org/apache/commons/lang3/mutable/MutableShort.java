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
 * A mutable <code>short</code> wrapper.
 * <p>
 * Note that as MutableShort does not extend Short, it is not treated by String.format as a Short parameter. 
 * 
 * @see Short
 * @since 2.1
 */
public class MutableShort extends Number implements Comparable<MutableShort>, Mutable<Number> {public static class __CLR4_5_2csicsilvha7b0p{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172755542L,8589935092L,16659,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Required for serialization support.
     * 
     * @see java.io.Serializable
     */
    private static final long serialVersionUID = -2135791679L;

    /** The mutable value. */
    private short value;

    /**
     * Constructs a new MutableShort with the default value of zero.
     */
    public MutableShort() {
        super();__CLR4_5_2csicsilvha7b0p.R.inc(16579);try{__CLR4_5_2csicsilvha7b0p.R.inc(16578);
    }finally{__CLR4_5_2csicsilvha7b0p.R.flushNeeded();}}

    /**
     * Constructs a new MutableShort with the specified value.
     * 
     * @param value  the initial value to store
     */
    public MutableShort(final short value) {
        super();__CLR4_5_2csicsilvha7b0p.R.inc(16581);try{__CLR4_5_2csicsilvha7b0p.R.inc(16580);
        __CLR4_5_2csicsilvha7b0p.R.inc(16582);this.value = value;
    }finally{__CLR4_5_2csicsilvha7b0p.R.flushNeeded();}}

    /**
     * Constructs a new MutableShort with the specified value.
     * 
     * @param value  the initial value to store, not null
     * @throws NullPointerException if the object is null
     */
    public MutableShort(final Number value) {
        super();__CLR4_5_2csicsilvha7b0p.R.inc(16584);try{__CLR4_5_2csicsilvha7b0p.R.inc(16583);
        __CLR4_5_2csicsilvha7b0p.R.inc(16585);this.value = value.shortValue();
    }finally{__CLR4_5_2csicsilvha7b0p.R.flushNeeded();}}

    /**
     * Constructs a new MutableShort parsing the given string.
     * 
     * @param value  the string to parse, not null
     * @throws NumberFormatException if the string cannot be parsed into a short
     * @since 2.5
     */
    public MutableShort(final String value) throws NumberFormatException {
        super();__CLR4_5_2csicsilvha7b0p.R.inc(16587);try{__CLR4_5_2csicsilvha7b0p.R.inc(16586);
        __CLR4_5_2csicsilvha7b0p.R.inc(16588);this.value = Short.parseShort(value);
    }finally{__CLR4_5_2csicsilvha7b0p.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Gets the value as a Short instance.
     * 
     * @return the value as a Short, never null
     */
    @Override
    public Short getValue() {try{__CLR4_5_2csicsilvha7b0p.R.inc(16589);
        __CLR4_5_2csicsilvha7b0p.R.inc(16590);return Short.valueOf(this.value);
    }finally{__CLR4_5_2csicsilvha7b0p.R.flushNeeded();}}

    /**
     * Sets the value.
     * 
     * @param value  the value to set
     */
    public void setValue(final short value) {try{__CLR4_5_2csicsilvha7b0p.R.inc(16591);
        __CLR4_5_2csicsilvha7b0p.R.inc(16592);this.value = value;
    }finally{__CLR4_5_2csicsilvha7b0p.R.flushNeeded();}}

    /**
     * Sets the value from any Number instance.
     * 
     * @param value  the value to set, not null
     * @throws NullPointerException if the object is null
     */
    @Override
    public void setValue(final Number value) {try{__CLR4_5_2csicsilvha7b0p.R.inc(16593);
        __CLR4_5_2csicsilvha7b0p.R.inc(16594);this.value = value.shortValue();
    }finally{__CLR4_5_2csicsilvha7b0p.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Increments the value.
     *
     * @since Commons Lang 2.2
     */
    public void increment() {try{__CLR4_5_2csicsilvha7b0p.R.inc(16595);
        __CLR4_5_2csicsilvha7b0p.R.inc(16596);value++;
    }finally{__CLR4_5_2csicsilvha7b0p.R.flushNeeded();}}

    /**
     * Increments this instance's value by 1; this method returns the value associated with the instance
     * immediately prior to the increment operation. This method is not thread safe.
     *
     * @return the value associated with the instance before it was incremented
     * @since 3.5
     */
    public short getAndIncrement() {try{__CLR4_5_2csicsilvha7b0p.R.inc(16597);
        __CLR4_5_2csicsilvha7b0p.R.inc(16598);final short last = value;
        __CLR4_5_2csicsilvha7b0p.R.inc(16599);value++;
        __CLR4_5_2csicsilvha7b0p.R.inc(16600);return last;
    }finally{__CLR4_5_2csicsilvha7b0p.R.flushNeeded();}}

    /**
     * Increments this instance's value by 1; this method returns the value associated with the instance
     * immediately after the increment operation. This method is not thread safe.
     *
     * @return the value associated with the instance after it is incremented
     * @since 3.5
     */
    public short incrementAndGet() {try{__CLR4_5_2csicsilvha7b0p.R.inc(16601);
        __CLR4_5_2csicsilvha7b0p.R.inc(16602);value++;
        __CLR4_5_2csicsilvha7b0p.R.inc(16603);return value;
    }finally{__CLR4_5_2csicsilvha7b0p.R.flushNeeded();}}

    /**
     * Decrements the value.
     *
     * @since Commons Lang 2.2
     */
    public void decrement() {try{__CLR4_5_2csicsilvha7b0p.R.inc(16604);
        __CLR4_5_2csicsilvha7b0p.R.inc(16605);value--;
    }finally{__CLR4_5_2csicsilvha7b0p.R.flushNeeded();}}

    /**
     * Decrements this instance's value by 1; this method returns the value associated with the instance
     * immediately prior to the decrement operation. This method is not thread safe.
     *
     * @return the value associated with the instance before it was decremented
     * @since 3.5
     */
    public short getAndDecrement() {try{__CLR4_5_2csicsilvha7b0p.R.inc(16606);
        __CLR4_5_2csicsilvha7b0p.R.inc(16607);final short last = value;
        __CLR4_5_2csicsilvha7b0p.R.inc(16608);value--;
        __CLR4_5_2csicsilvha7b0p.R.inc(16609);return last;
    }finally{__CLR4_5_2csicsilvha7b0p.R.flushNeeded();}}

    /**
     * Decrements this instance's value by 1; this method returns the value associated with the instance
     * immediately after the decrement operation. This method is not thread safe.
     *
     * @return the value associated with the instance after it is decremented
     * @since 3.5
     */
    public short decrementAndGet() {try{__CLR4_5_2csicsilvha7b0p.R.inc(16610);
        __CLR4_5_2csicsilvha7b0p.R.inc(16611);value--;
        __CLR4_5_2csicsilvha7b0p.R.inc(16612);return value;
    }finally{__CLR4_5_2csicsilvha7b0p.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Adds a value to the value of this instance.
     * 
     * @param operand  the value to add, not null
     * @since Commons Lang 2.2
     */
    public void add(final short operand) {try{__CLR4_5_2csicsilvha7b0p.R.inc(16613);
        __CLR4_5_2csicsilvha7b0p.R.inc(16614);this.value += operand;
    }finally{__CLR4_5_2csicsilvha7b0p.R.flushNeeded();}}

    /**
     * Adds a value to the value of this instance.
     * 
     * @param operand  the value to add, not null
     * @throws NullPointerException if the object is null
     * @since Commons Lang 2.2
     */
    public void add(final Number operand) {try{__CLR4_5_2csicsilvha7b0p.R.inc(16615);
        __CLR4_5_2csicsilvha7b0p.R.inc(16616);this.value += operand.shortValue();
    }finally{__CLR4_5_2csicsilvha7b0p.R.flushNeeded();}}

    /**
     * Subtracts a value from the value of this instance.
     * 
     * @param operand  the value to subtract, not null
     * @since Commons Lang 2.2
     */
    public void subtract(final short operand) {try{__CLR4_5_2csicsilvha7b0p.R.inc(16617);
        __CLR4_5_2csicsilvha7b0p.R.inc(16618);this.value -= operand;
    }finally{__CLR4_5_2csicsilvha7b0p.R.flushNeeded();}}

    /**
     * Subtracts a value from the value of this instance.
     * 
     * @param operand  the value to subtract, not null
     * @throws NullPointerException if the object is null
     * @since Commons Lang 2.2
     */
    public void subtract(final Number operand) {try{__CLR4_5_2csicsilvha7b0p.R.inc(16619);
        __CLR4_5_2csicsilvha7b0p.R.inc(16620);this.value -= operand.shortValue();
    }finally{__CLR4_5_2csicsilvha7b0p.R.flushNeeded();}}

    /**
     * Increments this instance's value by {@code operand}; this method returns the value associated with the instance
     * immediately after the addition operation. This method is not thread safe.
     *
     * @param operand the quantity to add, not null
     * @return the value associated with this instance after adding the operand
     * @since 3.5
     */
    public short addAndGet(final short operand) {try{__CLR4_5_2csicsilvha7b0p.R.inc(16621);
        __CLR4_5_2csicsilvha7b0p.R.inc(16622);this.value += operand;
        __CLR4_5_2csicsilvha7b0p.R.inc(16623);return value;
    }finally{__CLR4_5_2csicsilvha7b0p.R.flushNeeded();}}

    /**
     * Increments this instance's value by {@code operand}; this method returns the value associated with the instance
     * immediately after the addition operation. This method is not thread safe.
     *
     * @param operand the quantity to add, not null
     * @throws NullPointerException if {@code operand} is null
     * @return the value associated with this instance after adding the operand
     * @since 3.5
     */
    public short addAndGet(final Number operand) {try{__CLR4_5_2csicsilvha7b0p.R.inc(16624);
        __CLR4_5_2csicsilvha7b0p.R.inc(16625);this.value += operand.shortValue();
        __CLR4_5_2csicsilvha7b0p.R.inc(16626);return value;
    }finally{__CLR4_5_2csicsilvha7b0p.R.flushNeeded();}}

    /**
     * Increments this instance's value by {@code operand}; this method returns the value associated with the instance
     * immediately prior to the addition operation. This method is not thread safe.
     *
     * @param operand the quantity to add, not null
     * @return the value associated with this instance immediately before the operand was added
     * @since 3.5
     */
    public short getAndAdd(final short operand) {try{__CLR4_5_2csicsilvha7b0p.R.inc(16627);
        __CLR4_5_2csicsilvha7b0p.R.inc(16628);final short last = value;
        __CLR4_5_2csicsilvha7b0p.R.inc(16629);this.value += operand;
        __CLR4_5_2csicsilvha7b0p.R.inc(16630);return last;
    }finally{__CLR4_5_2csicsilvha7b0p.R.flushNeeded();}}

    /**
     * Increments this instance's value by {@code operand}; this method returns the value associated with the instance
     * immediately prior to the addition operation. This method is not thread safe.
     *
     * @param operand the quantity to add, not null
     * @throws NullPointerException if {@code operand} is null
     * @return the value associated with this instance immediately before the operand was added
     * @since 3.5
     */
    public short getAndAdd(final Number operand) {try{__CLR4_5_2csicsilvha7b0p.R.inc(16631);
        __CLR4_5_2csicsilvha7b0p.R.inc(16632);final short last = value;
        __CLR4_5_2csicsilvha7b0p.R.inc(16633);this.value += operand.shortValue();
        __CLR4_5_2csicsilvha7b0p.R.inc(16634);return last;
    }finally{__CLR4_5_2csicsilvha7b0p.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    // byteValue relies on Number implementation
    /**
     * Returns the value of this MutableShort as a short.
     *
     * @return the numeric value represented by this object after conversion to type short.
     */
    @Override
    public short shortValue() {try{__CLR4_5_2csicsilvha7b0p.R.inc(16635);
        __CLR4_5_2csicsilvha7b0p.R.inc(16636);return value;
    }finally{__CLR4_5_2csicsilvha7b0p.R.flushNeeded();}}

    /**
     * Returns the value of this MutableShort as an int.
     *
     * @return the numeric value represented by this object after conversion to type int.
     */
    @Override
    public int intValue() {try{__CLR4_5_2csicsilvha7b0p.R.inc(16637);
        __CLR4_5_2csicsilvha7b0p.R.inc(16638);return value;
    }finally{__CLR4_5_2csicsilvha7b0p.R.flushNeeded();}}

    /**
     * Returns the value of this MutableShort as a long.
     *
     * @return the numeric value represented by this object after conversion to type long.
     */
    @Override
    public long longValue() {try{__CLR4_5_2csicsilvha7b0p.R.inc(16639);
        __CLR4_5_2csicsilvha7b0p.R.inc(16640);return value;
    }finally{__CLR4_5_2csicsilvha7b0p.R.flushNeeded();}}

    /**
     * Returns the value of this MutableShort as a float.
     *
     * @return the numeric value represented by this object after conversion to type float.
     */
    @Override
    public float floatValue() {try{__CLR4_5_2csicsilvha7b0p.R.inc(16641);
        __CLR4_5_2csicsilvha7b0p.R.inc(16642);return value;
    }finally{__CLR4_5_2csicsilvha7b0p.R.flushNeeded();}}

    /**
     * Returns the value of this MutableShort as a double.
     *
     * @return the numeric value represented by this object after conversion to type double.
     */
    @Override
    public double doubleValue() {try{__CLR4_5_2csicsilvha7b0p.R.inc(16643);
        __CLR4_5_2csicsilvha7b0p.R.inc(16644);return value;
    }finally{__CLR4_5_2csicsilvha7b0p.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Gets this mutable as an instance of Short.
     *
     * @return a Short instance containing the value from this mutable, never null
     */
    public Short toShort() {try{__CLR4_5_2csicsilvha7b0p.R.inc(16645);
        __CLR4_5_2csicsilvha7b0p.R.inc(16646);return Short.valueOf(shortValue());
    }finally{__CLR4_5_2csicsilvha7b0p.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Compares this object to the specified object. The result is <code>true</code> if and only if the argument
     * is not <code>null</code> and is a <code>MutableShort</code> object that contains the same <code>short</code>
     * value as this object.
     * 
     * @param obj  the object to compare with, null returns false
     * @return <code>true</code> if the objects are the same; <code>false</code> otherwise.
     */
    @Override
    public boolean equals(final Object obj) {try{__CLR4_5_2csicsilvha7b0p.R.inc(16647);
        __CLR4_5_2csicsilvha7b0p.R.inc(16648);if ((((obj instanceof MutableShort)&&(__CLR4_5_2csicsilvha7b0p.R.iget(16649)!=0|true))||(__CLR4_5_2csicsilvha7b0p.R.iget(16650)==0&false))) {{
            __CLR4_5_2csicsilvha7b0p.R.inc(16651);return value == ((MutableShort) obj).shortValue();
        }
        }__CLR4_5_2csicsilvha7b0p.R.inc(16652);return false;
    }finally{__CLR4_5_2csicsilvha7b0p.R.flushNeeded();}}

    /**
     * Returns a suitable hash code for this mutable.
     * 
     * @return a suitable hash code
     */
    @Override
    public int hashCode() {try{__CLR4_5_2csicsilvha7b0p.R.inc(16653);
        __CLR4_5_2csicsilvha7b0p.R.inc(16654);return value;
    }finally{__CLR4_5_2csicsilvha7b0p.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Compares this mutable to another in ascending order.
     * 
     * @param other  the other mutable to compare to, not null
     * @return negative if this is less, zero if equal, positive if greater
     */
    @Override
    public int compareTo(final MutableShort other) {try{__CLR4_5_2csicsilvha7b0p.R.inc(16655);
        __CLR4_5_2csicsilvha7b0p.R.inc(16656);return NumberUtils.compare(this.value, other.value);
    }finally{__CLR4_5_2csicsilvha7b0p.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Returns the String value of this mutable.
     * 
     * @return the mutable value as a string
     */
    @Override
    public String toString() {try{__CLR4_5_2csicsilvha7b0p.R.inc(16657);
        __CLR4_5_2csicsilvha7b0p.R.inc(16658);return String.valueOf(value);
    }finally{__CLR4_5_2csicsilvha7b0p.R.flushNeeded();}}

}
