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
package org.apache.commons.lang3;

/**
 * <p>Supports operations on bit-mapped fields. Instances of this class can be 
 * used to store a flag or data within an {@code int}, {@code short} or 
 * {@code byte}.</p>
 * 
 * <p>Each {@code BitField} is constructed with a mask value, which indicates
 * the bits that will be used to store and retrieve the data for that field. 
 * For instance, the mask {@code 0xFF} indicates the least-significant byte 
 * should be used to store the data.</p>
 * 
 * <p>As an example, consider a car painting machine that accepts
 * paint instructions as integers. Bit fields can be used to encode this:</p>
 *
 *<pre>
 *    // blue, green and red are 1 byte values (0-255) stored in the three least 
 *    // significant bytes
 *    BitField blue = new BitField(0xFF);
 *    BitField green = new BitField(0xFF00);
 *    BitField red = new BitField(0xFF0000);
 * 
 *    // anyColor is a flag triggered if any color is used
 *    BitField anyColor = new BitField(0xFFFFFF);
 * 
 *    // isMetallic is a single bit flag
 *    BitField isMetallic = new BitField(0x1000000);
 *</pre>
 *
 * <p>Using these {@code BitField} instances, a paint instruction can be
 * encoded into an integer:</p>
 *
 *<pre>
 *    int paintInstruction = 0;
 *    paintInstruction = red.setValue(paintInstruction, 35);
 *    paintInstruction = green.setValue(paintInstruction, 100);
 *    paintInstruction = blue.setValue(paintInstruction, 255);
 *</pre>
 *
 * <p>Flags and data can be retrieved from the integer:</p>
 * 
 *<pre>
 *    // Prints true if red, green or blue is non-zero
 *    System.out.println(anyColor.isSet(paintInstruction));   // prints true
 *   
 *    // Prints value of red, green and blue
 *    System.out.println(red.getValue(paintInstruction));     // prints 35
 *    System.out.println(green.getValue(paintInstruction));   // prints 100
 *    System.out.println(blue.getValue(paintInstruction));    // prints 255
 *   
 *    // Prints true if isMetallic was set 
 *    System.out.println(isMetallic.isSet(paintInstruction)); // prints false
 *</pre>
 *
 * @since 2.0
 */
public class BitField {public static class __CLR4_5_22xj2xjlvha78ge{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172755542L,8589935092L,3844,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    
    private final int _mask;
    private final int _shift_count;

    /**
     * <p>Creates a BitField instance.</p>
     *
     * @param mask the mask specifying which bits apply to this
     *  BitField. Bits that are set in this mask are the bits
     *  that this BitField operates on
     */
    public BitField(final int mask) {try{__CLR4_5_22xj2xjlvha78ge.R.inc(3799);
        __CLR4_5_22xj2xjlvha78ge.R.inc(3800);_mask = mask;
        __CLR4_5_22xj2xjlvha78ge.R.inc(3801);_shift_count = (((mask != 0 )&&(__CLR4_5_22xj2xjlvha78ge.R.iget(3802)!=0|true))||(__CLR4_5_22xj2xjlvha78ge.R.iget(3803)==0&false))? Integer.numberOfTrailingZeros(mask) : 0;
    }finally{__CLR4_5_22xj2xjlvha78ge.R.flushNeeded();}}

    /**
     * <p>Obtains the value for the specified BitField, appropriately
     * shifted right.</p>
     *
     * <p>Many users of a BitField will want to treat the specified
     * bits as an int value, and will not want to be aware that the
     * value is stored as a BitField (and so shifted left so many
     * bits).</p>
     *
     * @see #setValue(int,int)
     * @param holder the int data containing the bits we're interested
     *  in
     * @return the selected bits, shifted right appropriately
     */
    public int getValue(final int holder) {try{__CLR4_5_22xj2xjlvha78ge.R.inc(3804);
        __CLR4_5_22xj2xjlvha78ge.R.inc(3805);return getRawValue(holder) >> _shift_count;
    }finally{__CLR4_5_22xj2xjlvha78ge.R.flushNeeded();}}

    /**
     * <p>Obtains the value for the specified BitField, appropriately
     * shifted right, as a short.</p>
     *
     * <p>Many users of a BitField will want to treat the specified
     * bits as an int value, and will not want to be aware that the
     * value is stored as a BitField (and so shifted left so many
     * bits).</p>
     *
     * @see #setShortValue(short,short)
     * @param holder the short data containing the bits we're
     *  interested in
     * @return the selected bits, shifted right appropriately
     */
    public short getShortValue(final short holder) {try{__CLR4_5_22xj2xjlvha78ge.R.inc(3806);
        __CLR4_5_22xj2xjlvha78ge.R.inc(3807);return (short) getValue(holder);
    }finally{__CLR4_5_22xj2xjlvha78ge.R.flushNeeded();}}

    /**
     * <p>Obtains the value for the specified BitField, unshifted.</p>
     *
     * @param holder the int data containing the bits we're
     *  interested in
     * @return the selected bits
     */
    public int getRawValue(final int holder) {try{__CLR4_5_22xj2xjlvha78ge.R.inc(3808);
        __CLR4_5_22xj2xjlvha78ge.R.inc(3809);return holder & _mask;
    }finally{__CLR4_5_22xj2xjlvha78ge.R.flushNeeded();}}

    /**
     * <p>Obtains the value for the specified BitField, unshifted.</p>
     *
     * @param holder the short data containing the bits we're
     *  interested in
     * @return the selected bits
     */
    public short getShortRawValue(final short holder) {try{__CLR4_5_22xj2xjlvha78ge.R.inc(3810);
        __CLR4_5_22xj2xjlvha78ge.R.inc(3811);return (short) getRawValue(holder);
    }finally{__CLR4_5_22xj2xjlvha78ge.R.flushNeeded();}}

    /**
     * <p>Returns whether the field is set or not.</p>
     *
     * <p>This is most commonly used for a single-bit field, which is
     * often used to represent a boolean value; the results of using
     * it for a multi-bit field is to determine whether *any* of its
     * bits are set.</p>
     *
     * @param holder the int data containing the bits we're interested
     *  in
     * @return {@code true} if any of the bits are set,
     *  else {@code false}
     */
    public boolean isSet(final int holder) {try{__CLR4_5_22xj2xjlvha78ge.R.inc(3812);
        __CLR4_5_22xj2xjlvha78ge.R.inc(3813);return (holder & _mask) != 0;
    }finally{__CLR4_5_22xj2xjlvha78ge.R.flushNeeded();}}

    /**
     * <p>Returns whether all of the bits are set or not.</p>
     *
     * <p>This is a stricter test than {@link #isSet(int)},
     * in that all of the bits in a multi-bit set must be set
     * for this method to return {@code true}.</p>
     *
     * @param holder the int data containing the bits we're
     *  interested in
     * @return {@code true} if all of the bits are set,
     *  else {@code false}
     */
    public boolean isAllSet(final int holder) {try{__CLR4_5_22xj2xjlvha78ge.R.inc(3814);
        __CLR4_5_22xj2xjlvha78ge.R.inc(3815);return (holder & _mask) == _mask;
    }finally{__CLR4_5_22xj2xjlvha78ge.R.flushNeeded();}}

    /**
     * <p>Replaces the bits with new values.</p>
     *
     * @see #getValue(int)
     * @param holder the int data containing the bits we're
     *  interested in
     * @param value the new value for the specified bits
     * @return the value of holder with the bits from the value
     *  parameter replacing the old bits
     */
    public int setValue(final int holder, final int value) {try{__CLR4_5_22xj2xjlvha78ge.R.inc(3816);
        __CLR4_5_22xj2xjlvha78ge.R.inc(3817);return (holder & ~_mask) | ((value << _shift_count) & _mask);
    }finally{__CLR4_5_22xj2xjlvha78ge.R.flushNeeded();}}

    /**
     * <p>Replaces the bits with new values.</p>
     *
     * @see #getShortValue(short)
     * @param holder the short data containing the bits we're
     *  interested in
     * @param value the new value for the specified bits
     * @return the value of holder with the bits from the value
     *  parameter replacing the old bits
     */
    public short setShortValue(final short holder, final short value) {try{__CLR4_5_22xj2xjlvha78ge.R.inc(3818);
        __CLR4_5_22xj2xjlvha78ge.R.inc(3819);return (short) setValue(holder, value);
    }finally{__CLR4_5_22xj2xjlvha78ge.R.flushNeeded();}}

    /**
     * <p>Clears the bits.</p>
     *
     * @param holder the int data containing the bits we're
     *  interested in
     * @return the value of holder with the specified bits cleared
     *  (set to {@code 0})
     */
    public int clear(final int holder) {try{__CLR4_5_22xj2xjlvha78ge.R.inc(3820);
        __CLR4_5_22xj2xjlvha78ge.R.inc(3821);return holder & ~_mask;
    }finally{__CLR4_5_22xj2xjlvha78ge.R.flushNeeded();}}

    /**
     * <p>Clears the bits.</p>
     *
     * @param holder the short data containing the bits we're
     *  interested in
     * @return the value of holder with the specified bits cleared
     *  (set to {@code 0})
     */
    public short clearShort(final short holder) {try{__CLR4_5_22xj2xjlvha78ge.R.inc(3822);
        __CLR4_5_22xj2xjlvha78ge.R.inc(3823);return (short) clear(holder);
    }finally{__CLR4_5_22xj2xjlvha78ge.R.flushNeeded();}}

    /**
     * <p>Clears the bits.</p>
     *
     * @param holder the byte data containing the bits we're
     *  interested in
     *
     * @return the value of holder with the specified bits cleared
     *  (set to {@code 0})
     */
    public byte clearByte(final byte holder) {try{__CLR4_5_22xj2xjlvha78ge.R.inc(3824);
        __CLR4_5_22xj2xjlvha78ge.R.inc(3825);return (byte) clear(holder);
    }finally{__CLR4_5_22xj2xjlvha78ge.R.flushNeeded();}}

    /**
     * <p>Sets the bits.</p>
     *
     * @param holder the int data containing the bits we're
     *  interested in
     * @return the value of holder with the specified bits set
     *  to {@code 1}
     */
    public int set(final int holder) {try{__CLR4_5_22xj2xjlvha78ge.R.inc(3826);
        __CLR4_5_22xj2xjlvha78ge.R.inc(3827);return holder | _mask;
    }finally{__CLR4_5_22xj2xjlvha78ge.R.flushNeeded();}}

    /**
     * <p>Sets the bits.</p>
     *
     * @param holder the short data containing the bits we're
     *  interested in
     * @return the value of holder with the specified bits set
     *  to {@code 1}
     */
    public short setShort(final short holder) {try{__CLR4_5_22xj2xjlvha78ge.R.inc(3828);
        __CLR4_5_22xj2xjlvha78ge.R.inc(3829);return (short) set(holder);
    }finally{__CLR4_5_22xj2xjlvha78ge.R.flushNeeded();}}

    /**
     * <p>Sets the bits.</p>
     *
     * @param holder the byte data containing the bits we're
     *  interested in
     *
     * @return the value of holder with the specified bits set
     *  to {@code 1}
     */
    public byte setByte(final byte holder) {try{__CLR4_5_22xj2xjlvha78ge.R.inc(3830);
        __CLR4_5_22xj2xjlvha78ge.R.inc(3831);return (byte) set(holder);
    }finally{__CLR4_5_22xj2xjlvha78ge.R.flushNeeded();}}

    /**
     * <p>Sets a boolean BitField.</p>
     *
     * @param holder the int data containing the bits we're
     *  interested in
     * @param flag indicating whether to set or clear the bits
     * @return the value of holder with the specified bits set or
     *         cleared
     */
    public int setBoolean(final int holder, final boolean flag) {try{__CLR4_5_22xj2xjlvha78ge.R.inc(3832);
        __CLR4_5_22xj2xjlvha78ge.R.inc(3833);return (((flag )&&(__CLR4_5_22xj2xjlvha78ge.R.iget(3834)!=0|true))||(__CLR4_5_22xj2xjlvha78ge.R.iget(3835)==0&false))? set(holder) : clear(holder);
    }finally{__CLR4_5_22xj2xjlvha78ge.R.flushNeeded();}}

    /**
     * <p>Sets a boolean BitField.</p>
     *
     * @param holder the short data containing the bits we're
     *  interested in
     * @param flag indicating whether to set or clear the bits
     * @return the value of holder with the specified bits set or
     *  cleared
     */
    public short setShortBoolean(final short holder, final boolean flag) {try{__CLR4_5_22xj2xjlvha78ge.R.inc(3836);
        __CLR4_5_22xj2xjlvha78ge.R.inc(3837);return (((flag )&&(__CLR4_5_22xj2xjlvha78ge.R.iget(3838)!=0|true))||(__CLR4_5_22xj2xjlvha78ge.R.iget(3839)==0&false))? setShort(holder) : clearShort(holder);
    }finally{__CLR4_5_22xj2xjlvha78ge.R.flushNeeded();}}

    /**
     * <p>Sets a boolean BitField.</p>
     *
     * @param holder the byte data containing the bits we're
     *  interested in
     * @param flag indicating whether to set or clear the bits
     * @return the value of holder with the specified bits set or
     *  cleared
     */
    public byte setByteBoolean(final byte holder, final boolean flag) {try{__CLR4_5_22xj2xjlvha78ge.R.inc(3840);
        __CLR4_5_22xj2xjlvha78ge.R.inc(3841);return (((flag )&&(__CLR4_5_22xj2xjlvha78ge.R.iget(3842)!=0|true))||(__CLR4_5_22xj2xjlvha78ge.R.iget(3843)==0&false))? setByte(holder) : clearByte(holder);
    }finally{__CLR4_5_22xj2xjlvha78ge.R.flushNeeded();}}

}
