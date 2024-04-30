/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*******************************************************************************
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 *******************************************************************************/
package org.apache.commons.lang3;

import java.util.UUID;


/**
 * <p>
 * Static methods to convert a type into another, with endianness and bit ordering awareness.
 * </p>
 * <p>
 * The methods names follow a naming rule:<br>
 * {@code <source type>[source endianness][source bit ordering]To<destination type>[destination endianness][destination bit ordering]}
 * </p>
 * <p>
 * Source/destination type fields is one of the following:
 * </p>
 * <ul>
 * <li>binary: an array of booleans</li>
 * <li>byte or byteArray</li>
 * <li>int or intArray</li>
 * <li>long or longArray</li>
 * <li>hex: a String containing hexadecimal digits (lowercase in destination)</li>
 * <li>hexDigit: a Char containing a hexadecimal digit (lowercase in destination)</li>
 * <li>uuid</li>
 * </ul>
 * <p>
 * Endianness field: little endian is the default, in this case the field is absent. In case of
 * big endian, the field is "Be".<br> Bit ordering: Lsb0 is the default, in this case the field
 * is absent. In case of Msb0, the field is "Msb0".
 * </p>
 * <p>
 * Example: intBeMsb0ToHex convert an int with big endian byte order and Msb0 bit order into its
 * hexadecimal string representation
 * </p>
 * <p>
 * Most of the methods provide only default encoding for destination, this limits the number of
 * ways to do one thing. Unless you are dealing with data from/to outside of the JVM platform,
 * you should not need to use "Be" and "Msb0" methods.
 * </p>
 * <p>
 * Development status: work on going, only a part of the little endian, Lsb0 methods implemented
 * so far.
 * </p>
 * 
 * @since Lang 3.2
 */

@java.lang.SuppressWarnings({"fallthrough"}) public class Conversion {public static class __CLR4_5_2456456lvha78yo{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172755542L,8589935092L,6239,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    
    private static final boolean[] TTTT = new boolean[] { true, true, true, true };
    private static final boolean[] FTTT = new boolean[] { false, true, true, true };
    private static final boolean[] TFTT = new boolean[] { true, false, true, true };
    private static final boolean[] FFTT = new boolean[] { false, false, true, true };
    private static final boolean[] TTFT = new boolean[] { true, true, false, true };
    private static final boolean[] FTFT = new boolean[] { false, true, false, true };
    private static final boolean[] TFFT = new boolean[] { true, false, false, true };
    private static final boolean[] FFFT = new boolean[] { false, false, false, true };
    private static final boolean[] TTTF = new boolean[] { true, true, true, false };
    private static final boolean[] FTTF = new boolean[] { false, true, true, false };
    private static final boolean[] TFTF = new boolean[] { true, false, true, false };
    private static final boolean[] FFTF = new boolean[] { false, false, true, false };
    private static final boolean[] TTFF = new boolean[] { true, true, false, false };
    private static final boolean[] FTFF = new boolean[] { false, true, false, false };
    private static final boolean[] TFFF = new boolean[] { true, false, false, false };
    private static final boolean[] FFFF = new boolean[] { false, false, false, false };

    /**
     * <p>
     * Converts a hexadecimal digit into an int using the default (Lsb0) bit ordering.
     * </p>
     * <p>
     * '1' is converted to 1
     * </p>
     * 
     * @param hexDigit the hexadecimal digit to convert
     * @return an int equals to {@code hexDigit}
     * @throws IllegalArgumentException if {@code hexDigit} is not a hexadecimal digit
     */
    public static int hexDigitToInt(final char hexDigit) {try{__CLR4_5_2456456lvha78yo.R.inc(5370);
        __CLR4_5_2456456lvha78yo.R.inc(5371);final int digit = Character.digit(hexDigit, 16);
        __CLR4_5_2456456lvha78yo.R.inc(5372);if ((((digit < 0)&&(__CLR4_5_2456456lvha78yo.R.iget(5373)!=0|true))||(__CLR4_5_2456456lvha78yo.R.iget(5374)==0&false))) {{
            __CLR4_5_2456456lvha78yo.R.inc(5375);throw new IllegalArgumentException("Cannot interpret '" + hexDigit + "' as a hexadecimal digit");
        }
        }__CLR4_5_2456456lvha78yo.R.inc(5376);return digit;
    }finally{__CLR4_5_2456456lvha78yo.R.flushNeeded();}}

    /**
     * <p>
     * Converts a hexadecimal digit into an int using the Msb0 bit ordering.
     * </p>
     * <p>
     * '1' is converted to 8
     * </p>
     * 
     * @param hexDigit the hexadecimal digit to convert
     * @return an int equals to {@code hexDigit}
     * @throws IllegalArgumentException if {@code hexDigit} is not a hexadecimal digit
     */
    public static int hexDigitMsb0ToInt(final char hexDigit) {try{__CLR4_5_2456456lvha78yo.R.inc(5377);
        boolean __CLB4_5_2_bool0=false;__CLR4_5_2456456lvha78yo.R.inc(5378);switch (hexDigit) {
        case '0':if (!__CLB4_5_2_bool0) {__CLR4_5_2456456lvha78yo.R.inc(5379);__CLB4_5_2_bool0=true;}
            __CLR4_5_2456456lvha78yo.R.inc(5380);return 0x0;
        case '1':if (!__CLB4_5_2_bool0) {__CLR4_5_2456456lvha78yo.R.inc(5381);__CLB4_5_2_bool0=true;}
            __CLR4_5_2456456lvha78yo.R.inc(5382);return 0x8;
        case '2':if (!__CLB4_5_2_bool0) {__CLR4_5_2456456lvha78yo.R.inc(5383);__CLB4_5_2_bool0=true;}
            __CLR4_5_2456456lvha78yo.R.inc(5384);return 0x4;
        case '3':if (!__CLB4_5_2_bool0) {__CLR4_5_2456456lvha78yo.R.inc(5385);__CLB4_5_2_bool0=true;}
            __CLR4_5_2456456lvha78yo.R.inc(5386);return 0xC;
        case '4':if (!__CLB4_5_2_bool0) {__CLR4_5_2456456lvha78yo.R.inc(5387);__CLB4_5_2_bool0=true;}
            __CLR4_5_2456456lvha78yo.R.inc(5388);return 0x2;
        case '5':if (!__CLB4_5_2_bool0) {__CLR4_5_2456456lvha78yo.R.inc(5389);__CLB4_5_2_bool0=true;}
            __CLR4_5_2456456lvha78yo.R.inc(5390);return 0xA;
        case '6':if (!__CLB4_5_2_bool0) {__CLR4_5_2456456lvha78yo.R.inc(5391);__CLB4_5_2_bool0=true;}
            __CLR4_5_2456456lvha78yo.R.inc(5392);return 0x6;
        case '7':if (!__CLB4_5_2_bool0) {__CLR4_5_2456456lvha78yo.R.inc(5393);__CLB4_5_2_bool0=true;}
            __CLR4_5_2456456lvha78yo.R.inc(5394);return 0xE;
        case '8':if (!__CLB4_5_2_bool0) {__CLR4_5_2456456lvha78yo.R.inc(5395);__CLB4_5_2_bool0=true;}
            __CLR4_5_2456456lvha78yo.R.inc(5396);return 0x1;
        case '9':if (!__CLB4_5_2_bool0) {__CLR4_5_2456456lvha78yo.R.inc(5397);__CLB4_5_2_bool0=true;}
            __CLR4_5_2456456lvha78yo.R.inc(5398);return 0x9;
        case 'a':if (!__CLB4_5_2_bool0) {__CLR4_5_2456456lvha78yo.R.inc(5399);__CLB4_5_2_bool0=true;}// fall through
        case 'A':if (!__CLB4_5_2_bool0) {__CLR4_5_2456456lvha78yo.R.inc(5400);__CLB4_5_2_bool0=true;}
            __CLR4_5_2456456lvha78yo.R.inc(5401);return 0x5;
        case 'b':if (!__CLB4_5_2_bool0) {__CLR4_5_2456456lvha78yo.R.inc(5402);__CLB4_5_2_bool0=true;}// fall through
        case 'B':if (!__CLB4_5_2_bool0) {__CLR4_5_2456456lvha78yo.R.inc(5403);__CLB4_5_2_bool0=true;}
            __CLR4_5_2456456lvha78yo.R.inc(5404);return 0xD;
        case 'c':if (!__CLB4_5_2_bool0) {__CLR4_5_2456456lvha78yo.R.inc(5405);__CLB4_5_2_bool0=true;}// fall through
        case 'C':if (!__CLB4_5_2_bool0) {__CLR4_5_2456456lvha78yo.R.inc(5406);__CLB4_5_2_bool0=true;}
            __CLR4_5_2456456lvha78yo.R.inc(5407);return 0x3;
        case 'd':if (!__CLB4_5_2_bool0) {__CLR4_5_2456456lvha78yo.R.inc(5408);__CLB4_5_2_bool0=true;}// fall through
        case 'D':if (!__CLB4_5_2_bool0) {__CLR4_5_2456456lvha78yo.R.inc(5409);__CLB4_5_2_bool0=true;}
            __CLR4_5_2456456lvha78yo.R.inc(5410);return 0xB;
        case 'e':if (!__CLB4_5_2_bool0) {__CLR4_5_2456456lvha78yo.R.inc(5411);__CLB4_5_2_bool0=true;}// fall through
        case 'E':if (!__CLB4_5_2_bool0) {__CLR4_5_2456456lvha78yo.R.inc(5412);__CLB4_5_2_bool0=true;}
            __CLR4_5_2456456lvha78yo.R.inc(5413);return 0x7;
        case 'f':if (!__CLB4_5_2_bool0) {__CLR4_5_2456456lvha78yo.R.inc(5414);__CLB4_5_2_bool0=true;}// fall through
        case 'F':if (!__CLB4_5_2_bool0) {__CLR4_5_2456456lvha78yo.R.inc(5415);__CLB4_5_2_bool0=true;}
            __CLR4_5_2456456lvha78yo.R.inc(5416);return 0xF;
        default:if (!__CLB4_5_2_bool0) {__CLR4_5_2456456lvha78yo.R.inc(5417);__CLB4_5_2_bool0=true;}
            __CLR4_5_2456456lvha78yo.R.inc(5418);throw new IllegalArgumentException("Cannot interpret '" + hexDigit + "' as a hexadecimal digit");
        }
    }finally{__CLR4_5_2456456lvha78yo.R.flushNeeded();}}

    /**
     * <p>
     * Converts a hexadecimal digit into binary (represented as boolean array) using the default
     * (Lsb0) bit ordering.
     * </p>
     * <p>
     * '1' is converted as follow: (1, 0, 0, 0)
     * </p>
     * 
     * @param hexDigit the hexadecimal digit to convert
     * @return a boolean array with the binary representation of {@code hexDigit}
     * @throws IllegalArgumentException if {@code hexDigit} is not a hexadecimal digit
     */
    public static boolean[] hexDigitToBinary(final char hexDigit) {try{__CLR4_5_2456456lvha78yo.R.inc(5419);
        boolean __CLB4_5_2_bool1=false;__CLR4_5_2456456lvha78yo.R.inc(5420);switch (hexDigit) {
        case '0':if (!__CLB4_5_2_bool1) {__CLR4_5_2456456lvha78yo.R.inc(5421);__CLB4_5_2_bool1=true;}
            __CLR4_5_2456456lvha78yo.R.inc(5422);return FFFF.clone();
        case '1':if (!__CLB4_5_2_bool1) {__CLR4_5_2456456lvha78yo.R.inc(5423);__CLB4_5_2_bool1=true;}
            __CLR4_5_2456456lvha78yo.R.inc(5424);return TFFF.clone();
        case '2':if (!__CLB4_5_2_bool1) {__CLR4_5_2456456lvha78yo.R.inc(5425);__CLB4_5_2_bool1=true;}
            __CLR4_5_2456456lvha78yo.R.inc(5426);return FTFF.clone();
        case '3':if (!__CLB4_5_2_bool1) {__CLR4_5_2456456lvha78yo.R.inc(5427);__CLB4_5_2_bool1=true;}
            __CLR4_5_2456456lvha78yo.R.inc(5428);return TTFF.clone();
        case '4':if (!__CLB4_5_2_bool1) {__CLR4_5_2456456lvha78yo.R.inc(5429);__CLB4_5_2_bool1=true;}
            __CLR4_5_2456456lvha78yo.R.inc(5430);return FFTF.clone();
        case '5':if (!__CLB4_5_2_bool1) {__CLR4_5_2456456lvha78yo.R.inc(5431);__CLB4_5_2_bool1=true;}
            __CLR4_5_2456456lvha78yo.R.inc(5432);return TFTF.clone();
        case '6':if (!__CLB4_5_2_bool1) {__CLR4_5_2456456lvha78yo.R.inc(5433);__CLB4_5_2_bool1=true;}
            __CLR4_5_2456456lvha78yo.R.inc(5434);return FTTF.clone();
        case '7':if (!__CLB4_5_2_bool1) {__CLR4_5_2456456lvha78yo.R.inc(5435);__CLB4_5_2_bool1=true;}
            __CLR4_5_2456456lvha78yo.R.inc(5436);return TTTF.clone();
        case '8':if (!__CLB4_5_2_bool1) {__CLR4_5_2456456lvha78yo.R.inc(5437);__CLB4_5_2_bool1=true;}
            __CLR4_5_2456456lvha78yo.R.inc(5438);return FFFT.clone();
        case '9':if (!__CLB4_5_2_bool1) {__CLR4_5_2456456lvha78yo.R.inc(5439);__CLB4_5_2_bool1=true;}
            __CLR4_5_2456456lvha78yo.R.inc(5440);return TFFT.clone();
        case 'a':if (!__CLB4_5_2_bool1) {__CLR4_5_2456456lvha78yo.R.inc(5441);__CLB4_5_2_bool1=true;}// fall through
        case 'A':if (!__CLB4_5_2_bool1) {__CLR4_5_2456456lvha78yo.R.inc(5442);__CLB4_5_2_bool1=true;}
            __CLR4_5_2456456lvha78yo.R.inc(5443);return FTFT.clone();
        case 'b':if (!__CLB4_5_2_bool1) {__CLR4_5_2456456lvha78yo.R.inc(5444);__CLB4_5_2_bool1=true;}// fall through
        case 'B':if (!__CLB4_5_2_bool1) {__CLR4_5_2456456lvha78yo.R.inc(5445);__CLB4_5_2_bool1=true;}
            __CLR4_5_2456456lvha78yo.R.inc(5446);return TTFT.clone();
        case 'c':if (!__CLB4_5_2_bool1) {__CLR4_5_2456456lvha78yo.R.inc(5447);__CLB4_5_2_bool1=true;}// fall through
        case 'C':if (!__CLB4_5_2_bool1) {__CLR4_5_2456456lvha78yo.R.inc(5448);__CLB4_5_2_bool1=true;}
            __CLR4_5_2456456lvha78yo.R.inc(5449);return FFTT.clone();
        case 'd':if (!__CLB4_5_2_bool1) {__CLR4_5_2456456lvha78yo.R.inc(5450);__CLB4_5_2_bool1=true;}// fall through
        case 'D':if (!__CLB4_5_2_bool1) {__CLR4_5_2456456lvha78yo.R.inc(5451);__CLB4_5_2_bool1=true;}
            __CLR4_5_2456456lvha78yo.R.inc(5452);return TFTT.clone();
        case 'e':if (!__CLB4_5_2_bool1) {__CLR4_5_2456456lvha78yo.R.inc(5453);__CLB4_5_2_bool1=true;}// fall through
        case 'E':if (!__CLB4_5_2_bool1) {__CLR4_5_2456456lvha78yo.R.inc(5454);__CLB4_5_2_bool1=true;}
            __CLR4_5_2456456lvha78yo.R.inc(5455);return FTTT.clone();
        case 'f':if (!__CLB4_5_2_bool1) {__CLR4_5_2456456lvha78yo.R.inc(5456);__CLB4_5_2_bool1=true;}// fall through
        case 'F':if (!__CLB4_5_2_bool1) {__CLR4_5_2456456lvha78yo.R.inc(5457);__CLB4_5_2_bool1=true;}
            __CLR4_5_2456456lvha78yo.R.inc(5458);return TTTT.clone();
        default:if (!__CLB4_5_2_bool1) {__CLR4_5_2456456lvha78yo.R.inc(5459);__CLB4_5_2_bool1=true;}
            __CLR4_5_2456456lvha78yo.R.inc(5460);throw new IllegalArgumentException("Cannot interpret '" + hexDigit + "' as a hexadecimal digit");
        }
    }finally{__CLR4_5_2456456lvha78yo.R.flushNeeded();}}

    /**
     * <p>
     * Converts a hexadecimal digit into binary (represented as boolean array) using the Msb0
     * bit ordering.
     * </p>
     * <p>
     * '1' is converted as follow: (0, 0, 0, 1)
     * </p>
     * 
     * @param hexDigit the hexadecimal digit to convert
     * @return a boolean array with the binary representation of {@code hexDigit}
     * @throws IllegalArgumentException if {@code hexDigit} is not a hexadecimal digit
     */
    public static boolean[] hexDigitMsb0ToBinary(final char hexDigit) {try{__CLR4_5_2456456lvha78yo.R.inc(5461);
        boolean __CLB4_5_2_bool2=false;__CLR4_5_2456456lvha78yo.R.inc(5462);switch (hexDigit) {
        case '0':if (!__CLB4_5_2_bool2) {__CLR4_5_2456456lvha78yo.R.inc(5463);__CLB4_5_2_bool2=true;}
            __CLR4_5_2456456lvha78yo.R.inc(5464);return FFFF.clone();
        case '1':if (!__CLB4_5_2_bool2) {__CLR4_5_2456456lvha78yo.R.inc(5465);__CLB4_5_2_bool2=true;}
            __CLR4_5_2456456lvha78yo.R.inc(5466);return FFFT.clone();
        case '2':if (!__CLB4_5_2_bool2) {__CLR4_5_2456456lvha78yo.R.inc(5467);__CLB4_5_2_bool2=true;}
            __CLR4_5_2456456lvha78yo.R.inc(5468);return FFTF.clone();
        case '3':if (!__CLB4_5_2_bool2) {__CLR4_5_2456456lvha78yo.R.inc(5469);__CLB4_5_2_bool2=true;}
            __CLR4_5_2456456lvha78yo.R.inc(5470);return FFTT.clone();
        case '4':if (!__CLB4_5_2_bool2) {__CLR4_5_2456456lvha78yo.R.inc(5471);__CLB4_5_2_bool2=true;}
            __CLR4_5_2456456lvha78yo.R.inc(5472);return FTFF.clone();
        case '5':if (!__CLB4_5_2_bool2) {__CLR4_5_2456456lvha78yo.R.inc(5473);__CLB4_5_2_bool2=true;}
            __CLR4_5_2456456lvha78yo.R.inc(5474);return FTFT.clone();
        case '6':if (!__CLB4_5_2_bool2) {__CLR4_5_2456456lvha78yo.R.inc(5475);__CLB4_5_2_bool2=true;}
            __CLR4_5_2456456lvha78yo.R.inc(5476);return FTTF.clone();
        case '7':if (!__CLB4_5_2_bool2) {__CLR4_5_2456456lvha78yo.R.inc(5477);__CLB4_5_2_bool2=true;}
            __CLR4_5_2456456lvha78yo.R.inc(5478);return FTTT.clone();
        case '8':if (!__CLB4_5_2_bool2) {__CLR4_5_2456456lvha78yo.R.inc(5479);__CLB4_5_2_bool2=true;}
            __CLR4_5_2456456lvha78yo.R.inc(5480);return TFFF.clone();
        case '9':if (!__CLB4_5_2_bool2) {__CLR4_5_2456456lvha78yo.R.inc(5481);__CLB4_5_2_bool2=true;}
            __CLR4_5_2456456lvha78yo.R.inc(5482);return TFFT.clone();
        case 'a':if (!__CLB4_5_2_bool2) {__CLR4_5_2456456lvha78yo.R.inc(5483);__CLB4_5_2_bool2=true;}// fall through
        case 'A':if (!__CLB4_5_2_bool2) {__CLR4_5_2456456lvha78yo.R.inc(5484);__CLB4_5_2_bool2=true;}
            __CLR4_5_2456456lvha78yo.R.inc(5485);return TFTF.clone();
        case 'b':if (!__CLB4_5_2_bool2) {__CLR4_5_2456456lvha78yo.R.inc(5486);__CLB4_5_2_bool2=true;}// fall through
        case 'B':if (!__CLB4_5_2_bool2) {__CLR4_5_2456456lvha78yo.R.inc(5487);__CLB4_5_2_bool2=true;}
            __CLR4_5_2456456lvha78yo.R.inc(5488);return TFTT.clone();
        case 'c':if (!__CLB4_5_2_bool2) {__CLR4_5_2456456lvha78yo.R.inc(5489);__CLB4_5_2_bool2=true;}// fall through
        case 'C':if (!__CLB4_5_2_bool2) {__CLR4_5_2456456lvha78yo.R.inc(5490);__CLB4_5_2_bool2=true;}
            __CLR4_5_2456456lvha78yo.R.inc(5491);return TTFF.clone();
        case 'd':if (!__CLB4_5_2_bool2) {__CLR4_5_2456456lvha78yo.R.inc(5492);__CLB4_5_2_bool2=true;}// fall through
        case 'D':if (!__CLB4_5_2_bool2) {__CLR4_5_2456456lvha78yo.R.inc(5493);__CLB4_5_2_bool2=true;}
            __CLR4_5_2456456lvha78yo.R.inc(5494);return TTFT.clone();
        case 'e':if (!__CLB4_5_2_bool2) {__CLR4_5_2456456lvha78yo.R.inc(5495);__CLB4_5_2_bool2=true;}// fall through
        case 'E':if (!__CLB4_5_2_bool2) {__CLR4_5_2456456lvha78yo.R.inc(5496);__CLB4_5_2_bool2=true;}
            __CLR4_5_2456456lvha78yo.R.inc(5497);return TTTF.clone();
        case 'f':if (!__CLB4_5_2_bool2) {__CLR4_5_2456456lvha78yo.R.inc(5498);__CLB4_5_2_bool2=true;}// fall through
        case 'F':if (!__CLB4_5_2_bool2) {__CLR4_5_2456456lvha78yo.R.inc(5499);__CLB4_5_2_bool2=true;}
            __CLR4_5_2456456lvha78yo.R.inc(5500);return TTTT.clone();
        default:if (!__CLB4_5_2_bool2) {__CLR4_5_2456456lvha78yo.R.inc(5501);__CLB4_5_2_bool2=true;}
            __CLR4_5_2456456lvha78yo.R.inc(5502);throw new IllegalArgumentException("Cannot interpret '" + hexDigit + "' as a hexadecimal digit");
        }
    }finally{__CLR4_5_2456456lvha78yo.R.flushNeeded();}}

    /**
     * <p>
     * Converts binary (represented as boolean array) to a hexadecimal digit using the default
     * (Lsb0) bit ordering.
     * </p>
     * <p>
     * (1, 0, 0, 0) is converted as follow: '1'
     * </p>
     * 
     * @param src the binary to convert
     * @return a hexadecimal digit representing the selected bits
     * @throws IllegalArgumentException if {@code src} is empty
     * @throws NullPointerException if {@code src} is {@code null}
     */
    public static char binaryToHexDigit(final boolean[] src) {try{__CLR4_5_2456456lvha78yo.R.inc(5503);
        __CLR4_5_2456456lvha78yo.R.inc(5504);return binaryToHexDigit(src, 0);
    }finally{__CLR4_5_2456456lvha78yo.R.flushNeeded();}}

    /**
     * <p>
     * Converts binary (represented as boolean array) to a hexadecimal digit using the default
     * (Lsb0) bit ordering.
     * </p>
     * <p>
     * (1, 0, 0, 0) is converted as follow: '1'
     * </p>
     * 
     * @param src the binary to convert
     * @param srcPos the position of the lsb to start the conversion
     * @return a hexadecimal digit representing the selected bits
     * @throws IllegalArgumentException if {@code src} is empty
     * @throws NullPointerException if {@code src} is {@code null}
     */
    public static char binaryToHexDigit(final boolean[] src, final int srcPos) {try{__CLR4_5_2456456lvha78yo.R.inc(5505);
        __CLR4_5_2456456lvha78yo.R.inc(5506);if ((((src.length == 0)&&(__CLR4_5_2456456lvha78yo.R.iget(5507)!=0|true))||(__CLR4_5_2456456lvha78yo.R.iget(5508)==0&false))) {{
            __CLR4_5_2456456lvha78yo.R.inc(5509);throw new IllegalArgumentException("Cannot convert an empty array.");
        }
        }__CLR4_5_2456456lvha78yo.R.inc(5510);if ((((src.length > srcPos + 3 && src[srcPos + 3])&&(__CLR4_5_2456456lvha78yo.R.iget(5511)!=0|true))||(__CLR4_5_2456456lvha78yo.R.iget(5512)==0&false))) {{
            __CLR4_5_2456456lvha78yo.R.inc(5513);if ((((src.length > srcPos + 2 && src[srcPos + 2])&&(__CLR4_5_2456456lvha78yo.R.iget(5514)!=0|true))||(__CLR4_5_2456456lvha78yo.R.iget(5515)==0&false))) {{
                __CLR4_5_2456456lvha78yo.R.inc(5516);if ((((src.length > srcPos + 1 && src[srcPos + 1])&&(__CLR4_5_2456456lvha78yo.R.iget(5517)!=0|true))||(__CLR4_5_2456456lvha78yo.R.iget(5518)==0&false))) {{
                    __CLR4_5_2456456lvha78yo.R.inc(5519);return (((src[srcPos] )&&(__CLR4_5_2456456lvha78yo.R.iget(5520)!=0|true))||(__CLR4_5_2456456lvha78yo.R.iget(5521)==0&false))? 'f' : 'e';
                }
                }__CLR4_5_2456456lvha78yo.R.inc(5522);return (((src[srcPos] )&&(__CLR4_5_2456456lvha78yo.R.iget(5523)!=0|true))||(__CLR4_5_2456456lvha78yo.R.iget(5524)==0&false))? 'd' : 'c';
            }
            }__CLR4_5_2456456lvha78yo.R.inc(5525);if ((((src.length > srcPos + 1 && src[srcPos + 1])&&(__CLR4_5_2456456lvha78yo.R.iget(5526)!=0|true))||(__CLR4_5_2456456lvha78yo.R.iget(5527)==0&false))) {{
                __CLR4_5_2456456lvha78yo.R.inc(5528);return (((src[srcPos] )&&(__CLR4_5_2456456lvha78yo.R.iget(5529)!=0|true))||(__CLR4_5_2456456lvha78yo.R.iget(5530)==0&false))? 'b' : 'a';
            }
            }__CLR4_5_2456456lvha78yo.R.inc(5531);return (((src[srcPos] )&&(__CLR4_5_2456456lvha78yo.R.iget(5532)!=0|true))||(__CLR4_5_2456456lvha78yo.R.iget(5533)==0&false))? '9' : '8';
        }
        }__CLR4_5_2456456lvha78yo.R.inc(5534);if ((((src.length > srcPos + 2 && src[srcPos + 2])&&(__CLR4_5_2456456lvha78yo.R.iget(5535)!=0|true))||(__CLR4_5_2456456lvha78yo.R.iget(5536)==0&false))) {{
            __CLR4_5_2456456lvha78yo.R.inc(5537);if ((((src.length > srcPos + 1 && src[srcPos + 1])&&(__CLR4_5_2456456lvha78yo.R.iget(5538)!=0|true))||(__CLR4_5_2456456lvha78yo.R.iget(5539)==0&false))) {{
                __CLR4_5_2456456lvha78yo.R.inc(5540);return (((src[srcPos] )&&(__CLR4_5_2456456lvha78yo.R.iget(5541)!=0|true))||(__CLR4_5_2456456lvha78yo.R.iget(5542)==0&false))? '7' : '6';
            }
            }__CLR4_5_2456456lvha78yo.R.inc(5543);return (((src[srcPos] )&&(__CLR4_5_2456456lvha78yo.R.iget(5544)!=0|true))||(__CLR4_5_2456456lvha78yo.R.iget(5545)==0&false))? '5' : '4';
        }
        }__CLR4_5_2456456lvha78yo.R.inc(5546);if ((((src.length > srcPos + 1 && src[srcPos + 1])&&(__CLR4_5_2456456lvha78yo.R.iget(5547)!=0|true))||(__CLR4_5_2456456lvha78yo.R.iget(5548)==0&false))) {{
            __CLR4_5_2456456lvha78yo.R.inc(5549);return (((src[srcPos] )&&(__CLR4_5_2456456lvha78yo.R.iget(5550)!=0|true))||(__CLR4_5_2456456lvha78yo.R.iget(5551)==0&false))? '3' : '2';
        }
        }__CLR4_5_2456456lvha78yo.R.inc(5552);return (((src[srcPos] )&&(__CLR4_5_2456456lvha78yo.R.iget(5553)!=0|true))||(__CLR4_5_2456456lvha78yo.R.iget(5554)==0&false))? '1' : '0';
    }finally{__CLR4_5_2456456lvha78yo.R.flushNeeded();}}

    /**
     * <p>
     * Converts binary (represented as boolean array) to a hexadecimal digit using the Msb0 bit
     * ordering.
     * </p>
     * <p>
     * (1, 0, 0, 0) is converted as follow: '8'
     * </p>
     * 
     * @param src the binary to convert
     * @return a hexadecimal digit representing the selected bits
     * @throws IllegalArgumentException if {@code src} is empty, {@code src.length < 4} or
     *             {@code src.length > 8}
     * @throws NullPointerException if {@code src} is {@code null}
     */
    public static char binaryToHexDigitMsb0_4bits(final boolean[] src) {try{__CLR4_5_2456456lvha78yo.R.inc(5555);
        __CLR4_5_2456456lvha78yo.R.inc(5556);return binaryToHexDigitMsb0_4bits(src, 0);
    }finally{__CLR4_5_2456456lvha78yo.R.flushNeeded();}}

    /**
     * <p>
     * Converts binary (represented as boolean array) to a hexadecimal digit using the Msb0 bit
     * ordering.
     * </p>
     * <p>
     * (1, 0, 0, 0) is converted as follow: '8' (1,0,0,1,1,0,1,0) with srcPos = 3 is converted
     * to 'D'
     * </p>
     * 
     * @param src the binary to convert
     * @param srcPos the position of the lsb to start the conversion
     * @return a hexadecimal digit representing the selected bits
     * @throws IllegalArgumentException if {@code src} is empty, {@code src.length > 8} or
     *             {@code src.length - srcPos < 4}
     * @throws NullPointerException if {@code src} is {@code null}
     */
    public static char binaryToHexDigitMsb0_4bits(final boolean[] src, final int srcPos) {try{__CLR4_5_2456456lvha78yo.R.inc(5557);
        __CLR4_5_2456456lvha78yo.R.inc(5558);if ((((src.length > 8)&&(__CLR4_5_2456456lvha78yo.R.iget(5559)!=0|true))||(__CLR4_5_2456456lvha78yo.R.iget(5560)==0&false))) {{
            __CLR4_5_2456456lvha78yo.R.inc(5561);throw new IllegalArgumentException("src.length>8: src.length=" + src.length);
        }
        }__CLR4_5_2456456lvha78yo.R.inc(5562);if ((((src.length - srcPos < 4)&&(__CLR4_5_2456456lvha78yo.R.iget(5563)!=0|true))||(__CLR4_5_2456456lvha78yo.R.iget(5564)==0&false))) {{
            __CLR4_5_2456456lvha78yo.R.inc(5565);throw new IllegalArgumentException("src.length-srcPos<4: src.length=" + src.length + ", srcPos=" + srcPos);
        }
        }__CLR4_5_2456456lvha78yo.R.inc(5566);if ((((src[srcPos + 3])&&(__CLR4_5_2456456lvha78yo.R.iget(5567)!=0|true))||(__CLR4_5_2456456lvha78yo.R.iget(5568)==0&false))) {{
            __CLR4_5_2456456lvha78yo.R.inc(5569);if ((((src[srcPos + 2])&&(__CLR4_5_2456456lvha78yo.R.iget(5570)!=0|true))||(__CLR4_5_2456456lvha78yo.R.iget(5571)==0&false))) {{
                __CLR4_5_2456456lvha78yo.R.inc(5572);if ((((src[srcPos + 1])&&(__CLR4_5_2456456lvha78yo.R.iget(5573)!=0|true))||(__CLR4_5_2456456lvha78yo.R.iget(5574)==0&false))) {{
                    __CLR4_5_2456456lvha78yo.R.inc(5575);return (((src[srcPos] )&&(__CLR4_5_2456456lvha78yo.R.iget(5576)!=0|true))||(__CLR4_5_2456456lvha78yo.R.iget(5577)==0&false))? 'f' : '7';
                }
                }__CLR4_5_2456456lvha78yo.R.inc(5578);return (((src[srcPos] )&&(__CLR4_5_2456456lvha78yo.R.iget(5579)!=0|true))||(__CLR4_5_2456456lvha78yo.R.iget(5580)==0&false))? 'b' : '3';
            }
            }__CLR4_5_2456456lvha78yo.R.inc(5581);if ((((src[srcPos + 1])&&(__CLR4_5_2456456lvha78yo.R.iget(5582)!=0|true))||(__CLR4_5_2456456lvha78yo.R.iget(5583)==0&false))) {{
                __CLR4_5_2456456lvha78yo.R.inc(5584);return (((src[srcPos] )&&(__CLR4_5_2456456lvha78yo.R.iget(5585)!=0|true))||(__CLR4_5_2456456lvha78yo.R.iget(5586)==0&false))? 'd' : '5';
            }
            }__CLR4_5_2456456lvha78yo.R.inc(5587);return (((src[srcPos] )&&(__CLR4_5_2456456lvha78yo.R.iget(5588)!=0|true))||(__CLR4_5_2456456lvha78yo.R.iget(5589)==0&false))? '9' : '1';
        }
        }__CLR4_5_2456456lvha78yo.R.inc(5590);if ((((src[srcPos + 2])&&(__CLR4_5_2456456lvha78yo.R.iget(5591)!=0|true))||(__CLR4_5_2456456lvha78yo.R.iget(5592)==0&false))) {{
            __CLR4_5_2456456lvha78yo.R.inc(5593);if ((((src[srcPos + 1])&&(__CLR4_5_2456456lvha78yo.R.iget(5594)!=0|true))||(__CLR4_5_2456456lvha78yo.R.iget(5595)==0&false))) {{
                __CLR4_5_2456456lvha78yo.R.inc(5596);return (((src[srcPos] )&&(__CLR4_5_2456456lvha78yo.R.iget(5597)!=0|true))||(__CLR4_5_2456456lvha78yo.R.iget(5598)==0&false))? 'e' : '6';
            }
            }__CLR4_5_2456456lvha78yo.R.inc(5599);return (((src[srcPos] )&&(__CLR4_5_2456456lvha78yo.R.iget(5600)!=0|true))||(__CLR4_5_2456456lvha78yo.R.iget(5601)==0&false))? 'a' : '2';
        }
        }__CLR4_5_2456456lvha78yo.R.inc(5602);if ((((src[srcPos + 1])&&(__CLR4_5_2456456lvha78yo.R.iget(5603)!=0|true))||(__CLR4_5_2456456lvha78yo.R.iget(5604)==0&false))) {{
            __CLR4_5_2456456lvha78yo.R.inc(5605);return (((src[srcPos] )&&(__CLR4_5_2456456lvha78yo.R.iget(5606)!=0|true))||(__CLR4_5_2456456lvha78yo.R.iget(5607)==0&false))? 'c' : '4';
        }
        }__CLR4_5_2456456lvha78yo.R.inc(5608);return (((src[srcPos] )&&(__CLR4_5_2456456lvha78yo.R.iget(5609)!=0|true))||(__CLR4_5_2456456lvha78yo.R.iget(5610)==0&false))? '8' : '0';
    }finally{__CLR4_5_2456456lvha78yo.R.flushNeeded();}}

    /**
     * <p>
     * Converts the first 4 bits of a binary (represented as boolean array) in big endian Msb0
     * bit ordering to a hexadecimal digit.
     * </p>
     * <p>
     * (1, 0, 0, 0) is converted as follow: '8' (1,0,0,0,0,0,0,0, 0,0,0,0,0,1,0,0) is converted
     * to '4'
     * </p>
     * 
     * @param src the binary to convert
     * @return a hexadecimal digit representing the selected bits
     * @throws IllegalArgumentException if {@code src} is empty
     * @throws NullPointerException if {@code src} is {@code null}
     */
    public static char binaryBeMsb0ToHexDigit(final boolean[] src) {try{__CLR4_5_2456456lvha78yo.R.inc(5611);
        __CLR4_5_2456456lvha78yo.R.inc(5612);return binaryBeMsb0ToHexDigit(src, 0);
    }finally{__CLR4_5_2456456lvha78yo.R.flushNeeded();}}

    /**
     * <p>
     * Converts a binary (represented as boolean array) in big endian Msb0 bit ordering to a
     * hexadecimal digit.
     * </p>
     * <p>
     * (1, 0, 0, 0) with srcPos = 0 is converted as follow: '8' (1,0,0,0,0,0,0,0,
     * 0,0,0,1,0,1,0,0) with srcPos = 2 is converted to '5'
     * </p>
     * 
     * @param src the binary to convert
     * @param srcPos the position of the lsb to start the conversion
     * @return a hexadecimal digit representing the selected bits
     * @throws IllegalArgumentException if {@code src} is empty
     * @throws NullPointerException if {@code src} is {@code null}
     */
    public static char binaryBeMsb0ToHexDigit(boolean[] src, int srcPos) {try{__CLR4_5_2456456lvha78yo.R.inc(5613);
        __CLR4_5_2456456lvha78yo.R.inc(5614);if ((((src.length == 0)&&(__CLR4_5_2456456lvha78yo.R.iget(5615)!=0|true))||(__CLR4_5_2456456lvha78yo.R.iget(5616)==0&false))) {{
            __CLR4_5_2456456lvha78yo.R.inc(5617);throw new IllegalArgumentException("Cannot convert an empty array.");
        }
        }__CLR4_5_2456456lvha78yo.R.inc(5618);final int beSrcPos = src.length - 1 - srcPos;
        __CLR4_5_2456456lvha78yo.R.inc(5619);final int srcLen = Math.min(4, beSrcPos + 1);
        __CLR4_5_2456456lvha78yo.R.inc(5620);final boolean[] paddedSrc = new boolean[4];
        __CLR4_5_2456456lvha78yo.R.inc(5621);System.arraycopy(src, beSrcPos + 1 - srcLen, paddedSrc, 4 - srcLen, srcLen);
        __CLR4_5_2456456lvha78yo.R.inc(5622);src = paddedSrc;
        __CLR4_5_2456456lvha78yo.R.inc(5623);srcPos = 0;
        __CLR4_5_2456456lvha78yo.R.inc(5624);if ((((src[srcPos])&&(__CLR4_5_2456456lvha78yo.R.iget(5625)!=0|true))||(__CLR4_5_2456456lvha78yo.R.iget(5626)==0&false))) {{
            __CLR4_5_2456456lvha78yo.R.inc(5627);if ((((src.length > srcPos + 1 && src[srcPos + 1])&&(__CLR4_5_2456456lvha78yo.R.iget(5628)!=0|true))||(__CLR4_5_2456456lvha78yo.R.iget(5629)==0&false))) {{
                __CLR4_5_2456456lvha78yo.R.inc(5630);if ((((src.length > srcPos + 2 && src[srcPos + 2])&&(__CLR4_5_2456456lvha78yo.R.iget(5631)!=0|true))||(__CLR4_5_2456456lvha78yo.R.iget(5632)==0&false))) {{
                    __CLR4_5_2456456lvha78yo.R.inc(5633);return (((src.length > srcPos + 3 && src[srcPos + 3] )&&(__CLR4_5_2456456lvha78yo.R.iget(5634)!=0|true))||(__CLR4_5_2456456lvha78yo.R.iget(5635)==0&false))? 'f' : 'e';
                }
                }__CLR4_5_2456456lvha78yo.R.inc(5636);return (((src.length > srcPos + 3 && src[srcPos + 3] )&&(__CLR4_5_2456456lvha78yo.R.iget(5637)!=0|true))||(__CLR4_5_2456456lvha78yo.R.iget(5638)==0&false))? 'd' : 'c';
            }
            }__CLR4_5_2456456lvha78yo.R.inc(5639);if ((((src.length > srcPos + 2 && src[srcPos + 2])&&(__CLR4_5_2456456lvha78yo.R.iget(5640)!=0|true))||(__CLR4_5_2456456lvha78yo.R.iget(5641)==0&false))) {{
                __CLR4_5_2456456lvha78yo.R.inc(5642);return (((src.length > srcPos + 3 && src[srcPos + 3] )&&(__CLR4_5_2456456lvha78yo.R.iget(5643)!=0|true))||(__CLR4_5_2456456lvha78yo.R.iget(5644)==0&false))? 'b' : 'a';
            }
            }__CLR4_5_2456456lvha78yo.R.inc(5645);return (((src.length > srcPos + 3 && src[srcPos + 3] )&&(__CLR4_5_2456456lvha78yo.R.iget(5646)!=0|true))||(__CLR4_5_2456456lvha78yo.R.iget(5647)==0&false))? '9' : '8';
        }
        }__CLR4_5_2456456lvha78yo.R.inc(5648);if ((((src.length > srcPos + 1 && src[srcPos + 1])&&(__CLR4_5_2456456lvha78yo.R.iget(5649)!=0|true))||(__CLR4_5_2456456lvha78yo.R.iget(5650)==0&false))) {{
            __CLR4_5_2456456lvha78yo.R.inc(5651);if ((((src.length > srcPos + 2 && src[srcPos + 2])&&(__CLR4_5_2456456lvha78yo.R.iget(5652)!=0|true))||(__CLR4_5_2456456lvha78yo.R.iget(5653)==0&false))) {{
                __CLR4_5_2456456lvha78yo.R.inc(5654);return (((src.length > srcPos + 3 && src[srcPos + 3] )&&(__CLR4_5_2456456lvha78yo.R.iget(5655)!=0|true))||(__CLR4_5_2456456lvha78yo.R.iget(5656)==0&false))? '7' : '6';
            }
            }__CLR4_5_2456456lvha78yo.R.inc(5657);return (((src.length > srcPos + 3 && src[srcPos + 3] )&&(__CLR4_5_2456456lvha78yo.R.iget(5658)!=0|true))||(__CLR4_5_2456456lvha78yo.R.iget(5659)==0&false))? '5' : '4';
        }
        }__CLR4_5_2456456lvha78yo.R.inc(5660);if ((((src.length > srcPos + 2 && src[srcPos + 2])&&(__CLR4_5_2456456lvha78yo.R.iget(5661)!=0|true))||(__CLR4_5_2456456lvha78yo.R.iget(5662)==0&false))) {{
            __CLR4_5_2456456lvha78yo.R.inc(5663);return (((src.length > srcPos + 3 && src[srcPos + 3] )&&(__CLR4_5_2456456lvha78yo.R.iget(5664)!=0|true))||(__CLR4_5_2456456lvha78yo.R.iget(5665)==0&false))? '3' : '2';
        }
        }__CLR4_5_2456456lvha78yo.R.inc(5666);return (((src.length > srcPos + 3 && src[srcPos + 3] )&&(__CLR4_5_2456456lvha78yo.R.iget(5667)!=0|true))||(__CLR4_5_2456456lvha78yo.R.iget(5668)==0&false))? '1' : '0';
    }finally{__CLR4_5_2456456lvha78yo.R.flushNeeded();}}

    /**
     * <p>
     * Converts the 4 lsb of an int to a hexadecimal digit.
     * </p>
     * <p>
     * 0 returns '0'
     * </p>
     * <p>
     * 1 returns '1'
     * </p>
     * <p>
     * 10 returns 'A' and so on...
     * </p>
     * 
     * @param nibble the 4 bits to convert
     * @return a hexadecimal digit representing the 4 lsb of {@code nibble}
     * @throws IllegalArgumentException if {@code nibble < 0} or {@code nibble > 15}
     */
    public static char intToHexDigit(final int nibble) {try{__CLR4_5_2456456lvha78yo.R.inc(5669);
        __CLR4_5_2456456lvha78yo.R.inc(5670);final char c = Character.forDigit(nibble, 16);
        __CLR4_5_2456456lvha78yo.R.inc(5671);if ((((c == Character.MIN_VALUE)&&(__CLR4_5_2456456lvha78yo.R.iget(5672)!=0|true))||(__CLR4_5_2456456lvha78yo.R.iget(5673)==0&false))) {{
            __CLR4_5_2456456lvha78yo.R.inc(5674);throw new IllegalArgumentException("nibble value not between 0 and 15: " + nibble);
        }
        }__CLR4_5_2456456lvha78yo.R.inc(5675);return c;
    }finally{__CLR4_5_2456456lvha78yo.R.flushNeeded();}}

    /**
     * <p>
     * Converts the 4 lsb of an int to a hexadecimal digit encoded using the Msb0 bit ordering.
     * </p>
     * <p>
     * 0 returns '0'
     * </p>
     * <p>
     * 1 returns '8'
     * </p>
     * <p>
     * 10 returns '5' and so on...
     * </p>
     * 
     * @param nibble the 4 bits to convert
     * @return a hexadecimal digit representing the 4 lsb of {@code nibble}
     * @throws IllegalArgumentException if {@code nibble < 0} or {@code nibble > 15}
     */
    public static char intToHexDigitMsb0(final int nibble) {try{__CLR4_5_2456456lvha78yo.R.inc(5676);
        boolean __CLB4_5_2_bool3=false;__CLR4_5_2456456lvha78yo.R.inc(5677);switch (nibble) {
        case 0x0:if (!__CLB4_5_2_bool3) {__CLR4_5_2456456lvha78yo.R.inc(5678);__CLB4_5_2_bool3=true;}
            __CLR4_5_2456456lvha78yo.R.inc(5679);return '0';
        case 0x1:if (!__CLB4_5_2_bool3) {__CLR4_5_2456456lvha78yo.R.inc(5680);__CLB4_5_2_bool3=true;}
            __CLR4_5_2456456lvha78yo.R.inc(5681);return '8';
        case 0x2:if (!__CLB4_5_2_bool3) {__CLR4_5_2456456lvha78yo.R.inc(5682);__CLB4_5_2_bool3=true;}
            __CLR4_5_2456456lvha78yo.R.inc(5683);return '4';
        case 0x3:if (!__CLB4_5_2_bool3) {__CLR4_5_2456456lvha78yo.R.inc(5684);__CLB4_5_2_bool3=true;}
            __CLR4_5_2456456lvha78yo.R.inc(5685);return 'c';
        case 0x4:if (!__CLB4_5_2_bool3) {__CLR4_5_2456456lvha78yo.R.inc(5686);__CLB4_5_2_bool3=true;}
            __CLR4_5_2456456lvha78yo.R.inc(5687);return '2';
        case 0x5:if (!__CLB4_5_2_bool3) {__CLR4_5_2456456lvha78yo.R.inc(5688);__CLB4_5_2_bool3=true;}
            __CLR4_5_2456456lvha78yo.R.inc(5689);return 'a';
        case 0x6:if (!__CLB4_5_2_bool3) {__CLR4_5_2456456lvha78yo.R.inc(5690);__CLB4_5_2_bool3=true;}
            __CLR4_5_2456456lvha78yo.R.inc(5691);return '6';
        case 0x7:if (!__CLB4_5_2_bool3) {__CLR4_5_2456456lvha78yo.R.inc(5692);__CLB4_5_2_bool3=true;}
            __CLR4_5_2456456lvha78yo.R.inc(5693);return 'e';
        case 0x8:if (!__CLB4_5_2_bool3) {__CLR4_5_2456456lvha78yo.R.inc(5694);__CLB4_5_2_bool3=true;}
            __CLR4_5_2456456lvha78yo.R.inc(5695);return '1';
        case 0x9:if (!__CLB4_5_2_bool3) {__CLR4_5_2456456lvha78yo.R.inc(5696);__CLB4_5_2_bool3=true;}
            __CLR4_5_2456456lvha78yo.R.inc(5697);return '9';
        case 0xA:if (!__CLB4_5_2_bool3) {__CLR4_5_2456456lvha78yo.R.inc(5698);__CLB4_5_2_bool3=true;}
            __CLR4_5_2456456lvha78yo.R.inc(5699);return '5';
        case 0xB:if (!__CLB4_5_2_bool3) {__CLR4_5_2456456lvha78yo.R.inc(5700);__CLB4_5_2_bool3=true;}
            __CLR4_5_2456456lvha78yo.R.inc(5701);return 'd';
        case 0xC:if (!__CLB4_5_2_bool3) {__CLR4_5_2456456lvha78yo.R.inc(5702);__CLB4_5_2_bool3=true;}
            __CLR4_5_2456456lvha78yo.R.inc(5703);return '3';
        case 0xD:if (!__CLB4_5_2_bool3) {__CLR4_5_2456456lvha78yo.R.inc(5704);__CLB4_5_2_bool3=true;}
            __CLR4_5_2456456lvha78yo.R.inc(5705);return 'b';
        case 0xE:if (!__CLB4_5_2_bool3) {__CLR4_5_2456456lvha78yo.R.inc(5706);__CLB4_5_2_bool3=true;}
            __CLR4_5_2456456lvha78yo.R.inc(5707);return '7';
        case 0xF:if (!__CLB4_5_2_bool3) {__CLR4_5_2456456lvha78yo.R.inc(5708);__CLB4_5_2_bool3=true;}
            __CLR4_5_2456456lvha78yo.R.inc(5709);return 'f';
        default:if (!__CLB4_5_2_bool3) {__CLR4_5_2456456lvha78yo.R.inc(5710);__CLB4_5_2_bool3=true;}
            __CLR4_5_2456456lvha78yo.R.inc(5711);throw new IllegalArgumentException("nibble value not between 0 and 15: " + nibble);
        }
    }finally{__CLR4_5_2456456lvha78yo.R.flushNeeded();}}

    /**
     * <p>
     * Converts an array of int into a long using the default (little endian, Lsb0) byte and bit
     * ordering.
     * </p>
     * 
     * @param src the int array to convert
     * @param srcPos the position in {@code src}, in int unit, from where to start the
     *            conversion
     * @param dstInit initial value of the destination long
     * @param dstPos the position of the lsb, in bits, in the result long
     * @param nInts the number of ints to convert
     * @return a long containing the selected bits
     * @throws IllegalArgumentException if {@code (nInts-1)*32+dstPos >= 64}
     * @throws NullPointerException if {@code src} is {@code null}
     * @throws ArrayIndexOutOfBoundsException if {@code srcPos + nInts > src.length}
     */
    public static long intArrayToLong(final int[] src, final int srcPos, final long dstInit, final int dstPos,
            final int nInts) {try{__CLR4_5_2456456lvha78yo.R.inc(5712);
        __CLR4_5_2456456lvha78yo.R.inc(5713);if ((((src.length == 0 && srcPos == 0 || 0 == nInts)&&(__CLR4_5_2456456lvha78yo.R.iget(5714)!=0|true))||(__CLR4_5_2456456lvha78yo.R.iget(5715)==0&false))) {{
            __CLR4_5_2456456lvha78yo.R.inc(5716);return dstInit;
        }
        }__CLR4_5_2456456lvha78yo.R.inc(5717);if (((((nInts - 1) * 32 + dstPos >= 64)&&(__CLR4_5_2456456lvha78yo.R.iget(5718)!=0|true))||(__CLR4_5_2456456lvha78yo.R.iget(5719)==0&false))) {{
            __CLR4_5_2456456lvha78yo.R.inc(5720);throw new IllegalArgumentException("(nInts-1)*32+dstPos is greater or equal to than 64");
        }
        }__CLR4_5_2456456lvha78yo.R.inc(5721);long out = dstInit;
        __CLR4_5_2456456lvha78yo.R.inc(5722);for (int i = 0; (((i < nInts)&&(__CLR4_5_2456456lvha78yo.R.iget(5723)!=0|true))||(__CLR4_5_2456456lvha78yo.R.iget(5724)==0&false)); i++) {{
            __CLR4_5_2456456lvha78yo.R.inc(5725);final int shift = i * 32 + dstPos;
            __CLR4_5_2456456lvha78yo.R.inc(5726);final long bits = (0xffffffffL & src[i + srcPos]) << shift;
            __CLR4_5_2456456lvha78yo.R.inc(5727);final long mask = 0xffffffffL << shift;
            __CLR4_5_2456456lvha78yo.R.inc(5728);out = (out & ~mask) | bits;
        }
        }__CLR4_5_2456456lvha78yo.R.inc(5729);return out;
    }finally{__CLR4_5_2456456lvha78yo.R.flushNeeded();}}

    /**
     * <p>
     * Converts an array of short into a long using the default (little endian, Lsb0) byte and
     * bit ordering.
     * </p>
     * 
     * @param src the short array to convert
     * @param srcPos the position in {@code src}, in short unit, from where to start the
     *            conversion
     * @param dstInit initial value of the destination long
     * @param dstPos the position of the lsb, in bits, in the result long
     * @param nShorts the number of shorts to convert
     * @return a long containing the selected bits
     * @throws NullPointerException if {@code src} is {@code null}
     * @throws IllegalArgumentException if {@code (nShorts-1)*16+dstPos >= 64}
     * @throws ArrayIndexOutOfBoundsException if {@code srcPos + nShorts > src.length}
     */
    public static long shortArrayToLong(final short[] src, final int srcPos, final long dstInit, final int dstPos,
            final int nShorts) {try{__CLR4_5_2456456lvha78yo.R.inc(5730);
        __CLR4_5_2456456lvha78yo.R.inc(5731);if ((((src.length == 0 && srcPos == 0 || 0 == nShorts)&&(__CLR4_5_2456456lvha78yo.R.iget(5732)!=0|true))||(__CLR4_5_2456456lvha78yo.R.iget(5733)==0&false))) {{
            __CLR4_5_2456456lvha78yo.R.inc(5734);return dstInit;
        }
        }__CLR4_5_2456456lvha78yo.R.inc(5735);if (((((nShorts - 1) * 16 + dstPos >= 64)&&(__CLR4_5_2456456lvha78yo.R.iget(5736)!=0|true))||(__CLR4_5_2456456lvha78yo.R.iget(5737)==0&false))) {{
            __CLR4_5_2456456lvha78yo.R.inc(5738);throw new IllegalArgumentException("(nShorts-1)*16+dstPos is greater or equal to than 64");
        }
        }__CLR4_5_2456456lvha78yo.R.inc(5739);long out = dstInit;
        __CLR4_5_2456456lvha78yo.R.inc(5740);for (int i = 0; (((i < nShorts)&&(__CLR4_5_2456456lvha78yo.R.iget(5741)!=0|true))||(__CLR4_5_2456456lvha78yo.R.iget(5742)==0&false)); i++) {{
            __CLR4_5_2456456lvha78yo.R.inc(5743);final int shift = i * 16 + dstPos;
            __CLR4_5_2456456lvha78yo.R.inc(5744);final long bits = (0xffffL & src[i + srcPos]) << shift;
            __CLR4_5_2456456lvha78yo.R.inc(5745);final long mask = 0xffffL << shift;
            __CLR4_5_2456456lvha78yo.R.inc(5746);out = (out & ~mask) | bits;
        }
        }__CLR4_5_2456456lvha78yo.R.inc(5747);return out;
    }finally{__CLR4_5_2456456lvha78yo.R.flushNeeded();}}

    /**
     * <p>
     * Converts an array of short into an int using the default (little endian, Lsb0) byte and
     * bit ordering.
     * </p>
     * 
     * @param src the short array to convert
     * @param srcPos the position in {@code src}, in short unit, from where to start the
     *            conversion
     * @param dstInit initial value of the destination int
     * @param dstPos the position of the lsb, in bits, in the result int
     * @param nShorts the number of shorts to convert
     * @return an int containing the selected bits
     * @throws NullPointerException if {@code src} is {@code null}
     * @throws IllegalArgumentException if {@code (nShorts-1)*16+dstPos >= 32}
     * @throws ArrayIndexOutOfBoundsException if {@code srcPos + nShorts > src.length}
     */
    public static int shortArrayToInt(final short[] src, final int srcPos, final int dstInit, final int dstPos,
            final int nShorts) {try{__CLR4_5_2456456lvha78yo.R.inc(5748);
        __CLR4_5_2456456lvha78yo.R.inc(5749);if ((((src.length == 0 && srcPos == 0 || 0 == nShorts)&&(__CLR4_5_2456456lvha78yo.R.iget(5750)!=0|true))||(__CLR4_5_2456456lvha78yo.R.iget(5751)==0&false))) {{
            __CLR4_5_2456456lvha78yo.R.inc(5752);return dstInit;
        }
        }__CLR4_5_2456456lvha78yo.R.inc(5753);if (((((nShorts - 1) * 16 + dstPos >= 32)&&(__CLR4_5_2456456lvha78yo.R.iget(5754)!=0|true))||(__CLR4_5_2456456lvha78yo.R.iget(5755)==0&false))) {{
            __CLR4_5_2456456lvha78yo.R.inc(5756);throw new IllegalArgumentException("(nShorts-1)*16+dstPos is greater or equal to than 32");
        }
        }__CLR4_5_2456456lvha78yo.R.inc(5757);int out = dstInit;
        __CLR4_5_2456456lvha78yo.R.inc(5758);for (int i = 0; (((i < nShorts)&&(__CLR4_5_2456456lvha78yo.R.iget(5759)!=0|true))||(__CLR4_5_2456456lvha78yo.R.iget(5760)==0&false)); i++) {{
            __CLR4_5_2456456lvha78yo.R.inc(5761);final int shift = i * 16 + dstPos;
            __CLR4_5_2456456lvha78yo.R.inc(5762);final int bits = (0xffff & src[i + srcPos]) << shift;
            __CLR4_5_2456456lvha78yo.R.inc(5763);final int mask = 0xffff << shift;
            __CLR4_5_2456456lvha78yo.R.inc(5764);out = (out & ~mask) | bits;
        }
        }__CLR4_5_2456456lvha78yo.R.inc(5765);return out;
    }finally{__CLR4_5_2456456lvha78yo.R.flushNeeded();}}

    /**
     * <p>
     * Converts an array of byte into a long using the default (little endian, Lsb0) byte and
     * bit ordering.
     * </p>
     * 
     * @param src the byte array to convert
     * @param srcPos the position in {@code src}, in byte unit, from where to start the
     *            conversion
     * @param dstInit initial value of the destination long
     * @param dstPos the position of the lsb, in bits, in the result long
     * @param nBytes the number of bytes to convert
     * @return a long containing the selected bits
     * @throws NullPointerException if {@code src} is {@code null}
     * @throws IllegalArgumentException if {@code (nBytes-1)*8+dstPos >= 64}
     * @throws ArrayIndexOutOfBoundsException if {@code srcPos + nBytes > src.length}
     */
    public static long byteArrayToLong(final byte[] src, final int srcPos, final long dstInit, final int dstPos,
            final int nBytes) {try{__CLR4_5_2456456lvha78yo.R.inc(5766);
        __CLR4_5_2456456lvha78yo.R.inc(5767);if ((((src.length == 0 && srcPos == 0 || 0 == nBytes)&&(__CLR4_5_2456456lvha78yo.R.iget(5768)!=0|true))||(__CLR4_5_2456456lvha78yo.R.iget(5769)==0&false))) {{
            __CLR4_5_2456456lvha78yo.R.inc(5770);return dstInit;
        }
        }__CLR4_5_2456456lvha78yo.R.inc(5771);if (((((nBytes - 1) * 8 + dstPos >= 64)&&(__CLR4_5_2456456lvha78yo.R.iget(5772)!=0|true))||(__CLR4_5_2456456lvha78yo.R.iget(5773)==0&false))) {{
            __CLR4_5_2456456lvha78yo.R.inc(5774);throw new IllegalArgumentException("(nBytes-1)*8+dstPos is greater or equal to than 64");
        }
        }__CLR4_5_2456456lvha78yo.R.inc(5775);long out = dstInit;
        __CLR4_5_2456456lvha78yo.R.inc(5776);for (int i = 0; (((i < nBytes)&&(__CLR4_5_2456456lvha78yo.R.iget(5777)!=0|true))||(__CLR4_5_2456456lvha78yo.R.iget(5778)==0&false)); i++) {{
            __CLR4_5_2456456lvha78yo.R.inc(5779);final int shift = i * 8 + dstPos;
            __CLR4_5_2456456lvha78yo.R.inc(5780);final long bits = (0xffL & src[i + srcPos]) << shift;
            __CLR4_5_2456456lvha78yo.R.inc(5781);final long mask = 0xffL << shift;
            __CLR4_5_2456456lvha78yo.R.inc(5782);out = (out & ~mask) | bits;
        }
        }__CLR4_5_2456456lvha78yo.R.inc(5783);return out;
    }finally{__CLR4_5_2456456lvha78yo.R.flushNeeded();}}

    /**
     * <p>
     * Converts an array of byte into an int using the default (little endian, Lsb0) byte and bit
     * ordering.
     * </p>
     * 
     * @param src the byte array to convert
     * @param srcPos the position in {@code src}, in byte unit, from where to start the
     *            conversion
     * @param dstInit initial value of the destination int
     * @param dstPos the position of the lsb, in bits, in the result int
     * @param nBytes the number of bytes to convert
     * @return an int containing the selected bits
     * @throws NullPointerException if {@code src} is {@code null}
     * @throws IllegalArgumentException if {@code (nBytes-1)*8+dstPos >= 32}
     * @throws ArrayIndexOutOfBoundsException if {@code srcPos + nBytes > src.length}
     */
    public static int byteArrayToInt(final byte[] src, final int srcPos, final int dstInit, final int dstPos,
            final int nBytes) {try{__CLR4_5_2456456lvha78yo.R.inc(5784);
        __CLR4_5_2456456lvha78yo.R.inc(5785);if ((((src.length == 0 && srcPos == 0 || 0 == nBytes)&&(__CLR4_5_2456456lvha78yo.R.iget(5786)!=0|true))||(__CLR4_5_2456456lvha78yo.R.iget(5787)==0&false))) {{
            __CLR4_5_2456456lvha78yo.R.inc(5788);return dstInit;
        }
        }__CLR4_5_2456456lvha78yo.R.inc(5789);if (((((nBytes - 1) * 8 + dstPos >= 32)&&(__CLR4_5_2456456lvha78yo.R.iget(5790)!=0|true))||(__CLR4_5_2456456lvha78yo.R.iget(5791)==0&false))) {{
            __CLR4_5_2456456lvha78yo.R.inc(5792);throw new IllegalArgumentException("(nBytes-1)*8+dstPos is greater or equal to than 32");
        }
        }__CLR4_5_2456456lvha78yo.R.inc(5793);int out = dstInit;
        __CLR4_5_2456456lvha78yo.R.inc(5794);for (int i = 0; (((i < nBytes)&&(__CLR4_5_2456456lvha78yo.R.iget(5795)!=0|true))||(__CLR4_5_2456456lvha78yo.R.iget(5796)==0&false)); i++) {{
            __CLR4_5_2456456lvha78yo.R.inc(5797);final int shift = i * 8 + dstPos;
            __CLR4_5_2456456lvha78yo.R.inc(5798);final int bits = (0xff & src[i + srcPos]) << shift;
            __CLR4_5_2456456lvha78yo.R.inc(5799);final int mask = 0xff << shift;
            __CLR4_5_2456456lvha78yo.R.inc(5800);out = (out & ~mask) | bits;
        }
        }__CLR4_5_2456456lvha78yo.R.inc(5801);return out;
    }finally{__CLR4_5_2456456lvha78yo.R.flushNeeded();}}

    /**
     * <p>
     * Converts an array of byte into a short using the default (little endian, Lsb0) byte and
     * bit ordering.
     * </p>
     * 
     * @param src the byte array to convert
     * @param srcPos the position in {@code src}, in byte unit, from where to start the
     *            conversion
     * @param dstInit initial value of the destination short
     * @param dstPos the position of the lsb, in bits, in the result short
     * @param nBytes the number of bytes to convert
     * @return a short containing the selected bits
     * @throws NullPointerException if {@code src} is {@code null}
     * @throws IllegalArgumentException if {@code (nBytes-1)*8+dstPos >= 16}
     * @throws ArrayIndexOutOfBoundsException if {@code srcPos + nBytes > src.length}
     */
    public static short byteArrayToShort(final byte[] src, final int srcPos, final short dstInit, final int dstPos,
            final int nBytes) {try{__CLR4_5_2456456lvha78yo.R.inc(5802);
        __CLR4_5_2456456lvha78yo.R.inc(5803);if ((((src.length == 0 && srcPos == 0 || 0 == nBytes)&&(__CLR4_5_2456456lvha78yo.R.iget(5804)!=0|true))||(__CLR4_5_2456456lvha78yo.R.iget(5805)==0&false))) {{
            __CLR4_5_2456456lvha78yo.R.inc(5806);return dstInit;
        }
        }__CLR4_5_2456456lvha78yo.R.inc(5807);if (((((nBytes - 1) * 8 + dstPos >= 16)&&(__CLR4_5_2456456lvha78yo.R.iget(5808)!=0|true))||(__CLR4_5_2456456lvha78yo.R.iget(5809)==0&false))) {{
            __CLR4_5_2456456lvha78yo.R.inc(5810);throw new IllegalArgumentException("(nBytes-1)*8+dstPos is greater or equal to than 16");
        }
        }__CLR4_5_2456456lvha78yo.R.inc(5811);short out = dstInit;
        __CLR4_5_2456456lvha78yo.R.inc(5812);for (int i = 0; (((i < nBytes)&&(__CLR4_5_2456456lvha78yo.R.iget(5813)!=0|true))||(__CLR4_5_2456456lvha78yo.R.iget(5814)==0&false)); i++) {{
            __CLR4_5_2456456lvha78yo.R.inc(5815);final int shift = i * 8 + dstPos;
            __CLR4_5_2456456lvha78yo.R.inc(5816);final int bits = (0xff & src[i + srcPos]) << shift;
            __CLR4_5_2456456lvha78yo.R.inc(5817);final int mask = 0xff << shift;
            __CLR4_5_2456456lvha78yo.R.inc(5818);out = (short) ((out & ~mask) | bits);
        }
        }__CLR4_5_2456456lvha78yo.R.inc(5819);return out;
    }finally{__CLR4_5_2456456lvha78yo.R.flushNeeded();}}

    /**
     * <p>
     * Converts an array of Char into a long using the default (little endian, Lsb0) byte and
     * bit ordering.
     * </p>
     * 
     * @param src the hex string to convert
     * @param srcPos the position in {@code src}, in Char unit, from where to start the
     *            conversion
     * @param dstInit initial value of the destination long
     * @param dstPos the position of the lsb, in bits, in the result long
     * @param nHex the number of Chars to convert
     * @return a long containing the selected bits
     * @throws IllegalArgumentException if {@code (nHexs-1)*4+dstPos >= 64}
     */
    public static long hexToLong(final String src, final int srcPos, final long dstInit, final int dstPos,
            final int nHex) {try{__CLR4_5_2456456lvha78yo.R.inc(5820);
        __CLR4_5_2456456lvha78yo.R.inc(5821);if ((((0 == nHex)&&(__CLR4_5_2456456lvha78yo.R.iget(5822)!=0|true))||(__CLR4_5_2456456lvha78yo.R.iget(5823)==0&false))) {{
            __CLR4_5_2456456lvha78yo.R.inc(5824);return dstInit;
        }
        }__CLR4_5_2456456lvha78yo.R.inc(5825);if (((((nHex - 1) * 4 + dstPos >= 64)&&(__CLR4_5_2456456lvha78yo.R.iget(5826)!=0|true))||(__CLR4_5_2456456lvha78yo.R.iget(5827)==0&false))) {{
            __CLR4_5_2456456lvha78yo.R.inc(5828);throw new IllegalArgumentException("(nHexs-1)*4+dstPos is greater or equal to than 64");
        }
        }__CLR4_5_2456456lvha78yo.R.inc(5829);long out = dstInit;
        __CLR4_5_2456456lvha78yo.R.inc(5830);for (int i = 0; (((i < nHex)&&(__CLR4_5_2456456lvha78yo.R.iget(5831)!=0|true))||(__CLR4_5_2456456lvha78yo.R.iget(5832)==0&false)); i++) {{
            __CLR4_5_2456456lvha78yo.R.inc(5833);final int shift = i * 4 + dstPos;
            __CLR4_5_2456456lvha78yo.R.inc(5834);final long bits = (0xfL & hexDigitToInt(src.charAt(i + srcPos))) << shift;
            __CLR4_5_2456456lvha78yo.R.inc(5835);final long mask = 0xfL << shift;
            __CLR4_5_2456456lvha78yo.R.inc(5836);out = (out & ~mask) | bits;
        }
        }__CLR4_5_2456456lvha78yo.R.inc(5837);return out;
    }finally{__CLR4_5_2456456lvha78yo.R.flushNeeded();}}

    /**
     * <p>
     * Converts an array of Char into an int using the default (little endian, Lsb0) byte and bit
     * ordering.
     * </p>
     * 
     * @param src the hex string to convert
     * @param srcPos the position in {@code src}, in Char unit, from where to start the
     *            conversion
     * @param dstInit initial value of the destination int
     * @param dstPos the position of the lsb, in bits, in the result int
     * @param nHex the number of Chars to convert
     * @return an int containing the selected bits
     * @throws IllegalArgumentException if {@code (nHexs-1)*4+dstPos >= 32}
     */
    public static int hexToInt(final String src, final int srcPos, final int dstInit, final int dstPos, final int nHex) {try{__CLR4_5_2456456lvha78yo.R.inc(5838);
        __CLR4_5_2456456lvha78yo.R.inc(5839);if ((((0 == nHex)&&(__CLR4_5_2456456lvha78yo.R.iget(5840)!=0|true))||(__CLR4_5_2456456lvha78yo.R.iget(5841)==0&false))) {{
            __CLR4_5_2456456lvha78yo.R.inc(5842);return dstInit;
        }
        }__CLR4_5_2456456lvha78yo.R.inc(5843);if (((((nHex - 1) * 4 + dstPos >= 32)&&(__CLR4_5_2456456lvha78yo.R.iget(5844)!=0|true))||(__CLR4_5_2456456lvha78yo.R.iget(5845)==0&false))) {{
            __CLR4_5_2456456lvha78yo.R.inc(5846);throw new IllegalArgumentException("(nHexs-1)*4+dstPos is greater or equal to than 32");
        }
        }__CLR4_5_2456456lvha78yo.R.inc(5847);int out = dstInit;
        __CLR4_5_2456456lvha78yo.R.inc(5848);for (int i = 0; (((i < nHex)&&(__CLR4_5_2456456lvha78yo.R.iget(5849)!=0|true))||(__CLR4_5_2456456lvha78yo.R.iget(5850)==0&false)); i++) {{
            __CLR4_5_2456456lvha78yo.R.inc(5851);final int shift = i * 4 + dstPos;
            __CLR4_5_2456456lvha78yo.R.inc(5852);final int bits = (0xf & hexDigitToInt(src.charAt(i + srcPos))) << shift;
            __CLR4_5_2456456lvha78yo.R.inc(5853);final int mask = 0xf << shift;
            __CLR4_5_2456456lvha78yo.R.inc(5854);out = (out & ~mask) | bits;
        }
        }__CLR4_5_2456456lvha78yo.R.inc(5855);return out;
    }finally{__CLR4_5_2456456lvha78yo.R.flushNeeded();}}

    /**
     * <p>
     * Converts an array of Char into a short using the default (little endian, Lsb0) byte and
     * bit ordering.
     * </p>
     * 
     * @param src the hex string to convert
     * @param srcPos the position in {@code src}, in Char unit, from where to start the
     *            conversion
     * @param dstInit initial value of the destination short
     * @param dstPos the position of the lsb, in bits, in the result short
     * @param nHex the number of Chars to convert
     * @return a short containing the selected bits
     * @throws IllegalArgumentException if {@code (nHexs-1)*4+dstPos >= 16}
     */
    public static short hexToShort(final String src, final int srcPos, final short dstInit, final int dstPos,
            final int nHex) {try{__CLR4_5_2456456lvha78yo.R.inc(5856);
        __CLR4_5_2456456lvha78yo.R.inc(5857);if ((((0 == nHex)&&(__CLR4_5_2456456lvha78yo.R.iget(5858)!=0|true))||(__CLR4_5_2456456lvha78yo.R.iget(5859)==0&false))) {{
            __CLR4_5_2456456lvha78yo.R.inc(5860);return dstInit;
        }
        }__CLR4_5_2456456lvha78yo.R.inc(5861);if (((((nHex - 1) * 4 + dstPos >= 16)&&(__CLR4_5_2456456lvha78yo.R.iget(5862)!=0|true))||(__CLR4_5_2456456lvha78yo.R.iget(5863)==0&false))) {{
            __CLR4_5_2456456lvha78yo.R.inc(5864);throw new IllegalArgumentException("(nHexs-1)*4+dstPos is greater or equal to than 16");
        }
        }__CLR4_5_2456456lvha78yo.R.inc(5865);short out = dstInit;
        __CLR4_5_2456456lvha78yo.R.inc(5866);for (int i = 0; (((i < nHex)&&(__CLR4_5_2456456lvha78yo.R.iget(5867)!=0|true))||(__CLR4_5_2456456lvha78yo.R.iget(5868)==0&false)); i++) {{
            __CLR4_5_2456456lvha78yo.R.inc(5869);final int shift = i * 4 + dstPos;
            __CLR4_5_2456456lvha78yo.R.inc(5870);final int bits = (0xf & hexDigitToInt(src.charAt(i + srcPos))) << shift;
            __CLR4_5_2456456lvha78yo.R.inc(5871);final int mask = 0xf << shift;
            __CLR4_5_2456456lvha78yo.R.inc(5872);out = (short) ((out & ~mask) | bits);
        }
        }__CLR4_5_2456456lvha78yo.R.inc(5873);return out;
    }finally{__CLR4_5_2456456lvha78yo.R.flushNeeded();}}

    /**
     * <p>
     * Converts an array of Char into a byte using the default (little endian, Lsb0) byte and
     * bit ordering.
     * </p>
     * 
     * @param src the hex string to convert
     * @param srcPos the position in {@code src}, in Char unit, from where to start the
     *            conversion
     * @param dstInit initial value of the destination byte
     * @param dstPos the position of the lsb, in bits, in the result byte
     * @param nHex the number of Chars to convert
     * @return a byte containing the selected bits
     * @throws IllegalArgumentException if {@code (nHexs-1)*4+dstPos >= 8}
     */
    public static byte hexToByte(final String src, final int srcPos, final byte dstInit, final int dstPos,
            final int nHex) {try{__CLR4_5_2456456lvha78yo.R.inc(5874);
        __CLR4_5_2456456lvha78yo.R.inc(5875);if ((((0 == nHex)&&(__CLR4_5_2456456lvha78yo.R.iget(5876)!=0|true))||(__CLR4_5_2456456lvha78yo.R.iget(5877)==0&false))) {{
            __CLR4_5_2456456lvha78yo.R.inc(5878);return dstInit;
        }
        }__CLR4_5_2456456lvha78yo.R.inc(5879);if (((((nHex - 1) * 4 + dstPos >= 8)&&(__CLR4_5_2456456lvha78yo.R.iget(5880)!=0|true))||(__CLR4_5_2456456lvha78yo.R.iget(5881)==0&false))) {{
            __CLR4_5_2456456lvha78yo.R.inc(5882);throw new IllegalArgumentException("(nHexs-1)*4+dstPos is greater or equal to than 8");
        }
        }__CLR4_5_2456456lvha78yo.R.inc(5883);byte out = dstInit;
        __CLR4_5_2456456lvha78yo.R.inc(5884);for (int i = 0; (((i < nHex)&&(__CLR4_5_2456456lvha78yo.R.iget(5885)!=0|true))||(__CLR4_5_2456456lvha78yo.R.iget(5886)==0&false)); i++) {{
            __CLR4_5_2456456lvha78yo.R.inc(5887);final int shift = i * 4 + dstPos;
            __CLR4_5_2456456lvha78yo.R.inc(5888);final int bits = (0xf & hexDigitToInt(src.charAt(i + srcPos))) << shift;
            __CLR4_5_2456456lvha78yo.R.inc(5889);final int mask = 0xf << shift;
            __CLR4_5_2456456lvha78yo.R.inc(5890);out = (byte) ((out & ~mask) | bits);
        }
        }__CLR4_5_2456456lvha78yo.R.inc(5891);return out;
    }finally{__CLR4_5_2456456lvha78yo.R.flushNeeded();}}

    /**
     * <p>
     * Converts binary (represented as boolean array) into a long using the default (little
     * endian, Lsb0) byte and bit ordering.
     * </p>
     * 
     * @param src the binary to convert
     * @param srcPos the position in {@code src}, in boolean unit, from where to start the
     *            conversion
     * @param dstInit initial value of the destination long
     * @param dstPos the position of the lsb, in bits, in the result long
     * @param nBools the number of booleans to convert
     * @return a long containing the selected bits
     * @throws NullPointerException if {@code src} is {@code null}
     * @throws IllegalArgumentException if {@code nBools-1+dstPos >= 64}
     * @throws ArrayIndexOutOfBoundsException if {@code srcPos + nBools > src.length}
     */
    public static long binaryToLong(final boolean[] src, final int srcPos, final long dstInit, final int dstPos,
            final int nBools) {try{__CLR4_5_2456456lvha78yo.R.inc(5892);
        __CLR4_5_2456456lvha78yo.R.inc(5893);if ((((src.length == 0 && srcPos == 0 || 0 == nBools)&&(__CLR4_5_2456456lvha78yo.R.iget(5894)!=0|true))||(__CLR4_5_2456456lvha78yo.R.iget(5895)==0&false))) {{
            __CLR4_5_2456456lvha78yo.R.inc(5896);return dstInit;
        }
        }__CLR4_5_2456456lvha78yo.R.inc(5897);if ((((nBools - 1 + dstPos >= 64)&&(__CLR4_5_2456456lvha78yo.R.iget(5898)!=0|true))||(__CLR4_5_2456456lvha78yo.R.iget(5899)==0&false))) {{
            __CLR4_5_2456456lvha78yo.R.inc(5900);throw new IllegalArgumentException("nBools-1+dstPos is greater or equal to than 64");
        }
        }__CLR4_5_2456456lvha78yo.R.inc(5901);long out = dstInit;
        __CLR4_5_2456456lvha78yo.R.inc(5902);for (int i = 0; (((i < nBools)&&(__CLR4_5_2456456lvha78yo.R.iget(5903)!=0|true))||(__CLR4_5_2456456lvha78yo.R.iget(5904)==0&false)); i++) {{
            __CLR4_5_2456456lvha78yo.R.inc(5905);final int shift = i + dstPos;
            __CLR4_5_2456456lvha78yo.R.inc(5906);final long bits = ((((src[i + srcPos] )&&(__CLR4_5_2456456lvha78yo.R.iget(5907)!=0|true))||(__CLR4_5_2456456lvha78yo.R.iget(5908)==0&false))? 1L : 0) << shift;
            __CLR4_5_2456456lvha78yo.R.inc(5909);final long mask = 0x1L << shift;
            __CLR4_5_2456456lvha78yo.R.inc(5910);out = (out & ~mask) | bits;
        }
        }__CLR4_5_2456456lvha78yo.R.inc(5911);return out;
    }finally{__CLR4_5_2456456lvha78yo.R.flushNeeded();}}

    /**
     * <p>
     * Converts binary (represented as boolean array) into an int using the default (little
     * endian, Lsb0) byte and bit ordering.
     * </p>
     * 
     * @param src the binary to convert
     * @param srcPos the position in {@code src}, in boolean unit, from where to start the
     *            conversion
     * @param dstInit initial value of the destination int
     * @param dstPos the position of the lsb, in bits, in the result int
     * @param nBools the number of booleans to convert
     * @return an int containing the selected bits
     * @throws NullPointerException if {@code src} is {@code null}
     * @throws IllegalArgumentException if {@code nBools-1+dstPos >= 32}
     * @throws ArrayIndexOutOfBoundsException if {@code srcPos + nBools > src.length}
     */
    public static int binaryToInt(final boolean[] src, final int srcPos, final int dstInit, final int dstPos,
            final int nBools) {try{__CLR4_5_2456456lvha78yo.R.inc(5912);
        __CLR4_5_2456456lvha78yo.R.inc(5913);if ((((src.length == 0 && srcPos == 0 || 0 == nBools)&&(__CLR4_5_2456456lvha78yo.R.iget(5914)!=0|true))||(__CLR4_5_2456456lvha78yo.R.iget(5915)==0&false))) {{
            __CLR4_5_2456456lvha78yo.R.inc(5916);return dstInit;
        }
        }__CLR4_5_2456456lvha78yo.R.inc(5917);if ((((nBools - 1 + dstPos >= 32)&&(__CLR4_5_2456456lvha78yo.R.iget(5918)!=0|true))||(__CLR4_5_2456456lvha78yo.R.iget(5919)==0&false))) {{
            __CLR4_5_2456456lvha78yo.R.inc(5920);throw new IllegalArgumentException("nBools-1+dstPos is greater or equal to than 32");
        }
        }__CLR4_5_2456456lvha78yo.R.inc(5921);int out = dstInit;
        __CLR4_5_2456456lvha78yo.R.inc(5922);for (int i = 0; (((i < nBools)&&(__CLR4_5_2456456lvha78yo.R.iget(5923)!=0|true))||(__CLR4_5_2456456lvha78yo.R.iget(5924)==0&false)); i++) {{
            __CLR4_5_2456456lvha78yo.R.inc(5925);final int shift = i + dstPos;
            __CLR4_5_2456456lvha78yo.R.inc(5926);final int bits = ((((src[i + srcPos] )&&(__CLR4_5_2456456lvha78yo.R.iget(5927)!=0|true))||(__CLR4_5_2456456lvha78yo.R.iget(5928)==0&false))? 1 : 0) << shift;
            __CLR4_5_2456456lvha78yo.R.inc(5929);final int mask = 0x1 << shift;
            __CLR4_5_2456456lvha78yo.R.inc(5930);out = (out & ~mask) | bits;
        }
        }__CLR4_5_2456456lvha78yo.R.inc(5931);return out;
    }finally{__CLR4_5_2456456lvha78yo.R.flushNeeded();}}

    /**
     * <p>
     * Converts binary (represented as boolean array) into a short using the default (little
     * endian, Lsb0) byte and bit ordering.
     * </p>
     * 
     * @param src the binary to convert
     * @param srcPos the position in {@code src}, in boolean unit, from where to start the
     *            conversion
     * @param dstInit initial value of the destination short
     * @param dstPos the position of the lsb, in bits, in the result short
     * @param nBools the number of booleans to convert
     * @return a short containing the selected bits
     * @throws NullPointerException if {@code src} is {@code null}
     * @throws IllegalArgumentException if {@code nBools-1+dstPos >= 16}
     * @throws ArrayIndexOutOfBoundsException if {@code srcPos + nBools > src.length}
     */
    public static short binaryToShort(final boolean[] src, final int srcPos, final short dstInit, final int dstPos,
            final int nBools) {try{__CLR4_5_2456456lvha78yo.R.inc(5932);
        __CLR4_5_2456456lvha78yo.R.inc(5933);if ((((src.length == 0 && srcPos == 0 || 0 == nBools)&&(__CLR4_5_2456456lvha78yo.R.iget(5934)!=0|true))||(__CLR4_5_2456456lvha78yo.R.iget(5935)==0&false))) {{
            __CLR4_5_2456456lvha78yo.R.inc(5936);return dstInit;
        }
        }__CLR4_5_2456456lvha78yo.R.inc(5937);if ((((nBools - 1 + dstPos >= 16)&&(__CLR4_5_2456456lvha78yo.R.iget(5938)!=0|true))||(__CLR4_5_2456456lvha78yo.R.iget(5939)==0&false))) {{
            __CLR4_5_2456456lvha78yo.R.inc(5940);throw new IllegalArgumentException("nBools-1+dstPos is greater or equal to than 16");
        }
        }__CLR4_5_2456456lvha78yo.R.inc(5941);short out = dstInit;
        __CLR4_5_2456456lvha78yo.R.inc(5942);for (int i = 0; (((i < nBools)&&(__CLR4_5_2456456lvha78yo.R.iget(5943)!=0|true))||(__CLR4_5_2456456lvha78yo.R.iget(5944)==0&false)); i++) {{
            __CLR4_5_2456456lvha78yo.R.inc(5945);final int shift = i + dstPos;
            __CLR4_5_2456456lvha78yo.R.inc(5946);final int bits = ((((src[i + srcPos] )&&(__CLR4_5_2456456lvha78yo.R.iget(5947)!=0|true))||(__CLR4_5_2456456lvha78yo.R.iget(5948)==0&false))? 1 : 0) << shift;
            __CLR4_5_2456456lvha78yo.R.inc(5949);final int mask = 0x1 << shift;
            __CLR4_5_2456456lvha78yo.R.inc(5950);out = (short) ((out & ~mask) | bits);
        }
        }__CLR4_5_2456456lvha78yo.R.inc(5951);return out;
    }finally{__CLR4_5_2456456lvha78yo.R.flushNeeded();}}

    /**
     * <p>
     * Converts binary (represented as boolean array) into a byte using the default (little
     * endian, Lsb0) byte and bit ordering.
     * </p>
     * 
     * @param src the binary to convert
     * @param srcPos the position in {@code src}, in boolean unit, from where to start the
     *            conversion
     * @param dstInit initial value of the destination byte
     * @param dstPos the position of the lsb, in bits, in the result byte
     * @param nBools the number of booleans to convert
     * @return a byte containing the selected bits
     * @throws NullPointerException if {@code src} is {@code null}
     * @throws IllegalArgumentException if {@code nBools-1+dstPos >= 8}
     * @throws ArrayIndexOutOfBoundsException if {@code srcPos + nBools > src.length}
     */
    public static byte binaryToByte(final boolean[] src, final int srcPos, final byte dstInit, final int dstPos,
            final int nBools) {try{__CLR4_5_2456456lvha78yo.R.inc(5952);
        __CLR4_5_2456456lvha78yo.R.inc(5953);if ((((src.length == 0 && srcPos == 0 || 0 == nBools)&&(__CLR4_5_2456456lvha78yo.R.iget(5954)!=0|true))||(__CLR4_5_2456456lvha78yo.R.iget(5955)==0&false))) {{
            __CLR4_5_2456456lvha78yo.R.inc(5956);return dstInit;
        }
        }__CLR4_5_2456456lvha78yo.R.inc(5957);if ((((nBools - 1 + dstPos >= 8)&&(__CLR4_5_2456456lvha78yo.R.iget(5958)!=0|true))||(__CLR4_5_2456456lvha78yo.R.iget(5959)==0&false))) {{
            __CLR4_5_2456456lvha78yo.R.inc(5960);throw new IllegalArgumentException("nBools-1+dstPos is greater or equal to than 8");
        }
        }__CLR4_5_2456456lvha78yo.R.inc(5961);byte out = dstInit;
        __CLR4_5_2456456lvha78yo.R.inc(5962);for (int i = 0; (((i < nBools)&&(__CLR4_5_2456456lvha78yo.R.iget(5963)!=0|true))||(__CLR4_5_2456456lvha78yo.R.iget(5964)==0&false)); i++) {{
            __CLR4_5_2456456lvha78yo.R.inc(5965);final int shift = i + dstPos;
            __CLR4_5_2456456lvha78yo.R.inc(5966);final int bits = ((((src[i + srcPos] )&&(__CLR4_5_2456456lvha78yo.R.iget(5967)!=0|true))||(__CLR4_5_2456456lvha78yo.R.iget(5968)==0&false))? 1 : 0) << shift;
            __CLR4_5_2456456lvha78yo.R.inc(5969);final int mask = 0x1 << shift;
            __CLR4_5_2456456lvha78yo.R.inc(5970);out = (byte) ((out & ~mask) | bits);
        }
        }__CLR4_5_2456456lvha78yo.R.inc(5971);return out;
    }finally{__CLR4_5_2456456lvha78yo.R.flushNeeded();}}

    /**
     * <p>
     * Converts a long into an array of int using the default (little endian, Lsb0) byte and bit
     * ordering.
     * </p>
     * 
     * @param src the long to convert
     * @param srcPos the position in {@code src}, in bits, from where to start the conversion
     * @param dst the destination array
     * @param dstPos the position in {@code dst} where to copy the result
     * @param nInts the number of ints to copy to {@code dst}, must be smaller or equal to the
     *            width of the input (from srcPos to msb)
     * @return {@code dst}
     * @throws NullPointerException if {@code dst} is {@code null} and {@code nInts > 0}
     * @throws IllegalArgumentException if {@code (nInts-1)*32+srcPos >= 64}
     * @throws ArrayIndexOutOfBoundsException if {@code dstPos + nInts > dst.length}
     */
    public static int[] longToIntArray(final long src, final int srcPos, final int[] dst, final int dstPos,
            final int nInts) {try{__CLR4_5_2456456lvha78yo.R.inc(5972);
        __CLR4_5_2456456lvha78yo.R.inc(5973);if ((((0 == nInts)&&(__CLR4_5_2456456lvha78yo.R.iget(5974)!=0|true))||(__CLR4_5_2456456lvha78yo.R.iget(5975)==0&false))) {{
            __CLR4_5_2456456lvha78yo.R.inc(5976);return dst;
        }
        }__CLR4_5_2456456lvha78yo.R.inc(5977);if (((((nInts - 1) * 32 + srcPos >= 64)&&(__CLR4_5_2456456lvha78yo.R.iget(5978)!=0|true))||(__CLR4_5_2456456lvha78yo.R.iget(5979)==0&false))) {{
            __CLR4_5_2456456lvha78yo.R.inc(5980);throw new IllegalArgumentException("(nInts-1)*32+srcPos is greater or equal to than 64");
        }
        }__CLR4_5_2456456lvha78yo.R.inc(5981);for (int i = 0; (((i < nInts)&&(__CLR4_5_2456456lvha78yo.R.iget(5982)!=0|true))||(__CLR4_5_2456456lvha78yo.R.iget(5983)==0&false)); i++) {{
            __CLR4_5_2456456lvha78yo.R.inc(5984);final int shift = i * 32 + srcPos;
            __CLR4_5_2456456lvha78yo.R.inc(5985);dst[dstPos + i] = (int) (0xffffffff & (src >> shift));
        }
        }__CLR4_5_2456456lvha78yo.R.inc(5986);return dst;
    }finally{__CLR4_5_2456456lvha78yo.R.flushNeeded();}}

    /**
     * <p>
     * Converts a long into an array of short using the default (little endian, Lsb0) byte and
     * bit ordering.
     * </p>
     * 
     * @param src the long to convert
     * @param srcPos the position in {@code src}, in bits, from where to start the conversion
     * @param dst the destination array
     * @param dstPos the position in {@code dst} where to copy the result
     * @param nShorts the number of shorts to copy to {@code dst}, must be smaller or equal to
     *            the width of the input (from srcPos to msb)
     * @return {@code dst}
     * @throws NullPointerException if {@code dst} is {@code null}
     * @throws IllegalArgumentException if {@code (nShorts-1)*16+srcPos >= 64}
     * @throws ArrayIndexOutOfBoundsException if {@code dstPos + nShorts > dst.length}
     */
    public static short[] longToShortArray(final long src, final int srcPos, final short[] dst, final int dstPos,
            final int nShorts) {try{__CLR4_5_2456456lvha78yo.R.inc(5987);
        __CLR4_5_2456456lvha78yo.R.inc(5988);if ((((0 == nShorts)&&(__CLR4_5_2456456lvha78yo.R.iget(5989)!=0|true))||(__CLR4_5_2456456lvha78yo.R.iget(5990)==0&false))) {{
            __CLR4_5_2456456lvha78yo.R.inc(5991);return dst;
        }
        }__CLR4_5_2456456lvha78yo.R.inc(5992);if (((((nShorts - 1) * 16 + srcPos >= 64)&&(__CLR4_5_2456456lvha78yo.R.iget(5993)!=0|true))||(__CLR4_5_2456456lvha78yo.R.iget(5994)==0&false))) {{
            __CLR4_5_2456456lvha78yo.R.inc(5995);throw new IllegalArgumentException("(nShorts-1)*16+srcPos is greater or equal to than 64");
        }
        }__CLR4_5_2456456lvha78yo.R.inc(5996);for (int i = 0; (((i < nShorts)&&(__CLR4_5_2456456lvha78yo.R.iget(5997)!=0|true))||(__CLR4_5_2456456lvha78yo.R.iget(5998)==0&false)); i++) {{
            __CLR4_5_2456456lvha78yo.R.inc(5999);final int shift = i * 16 + srcPos;
            __CLR4_5_2456456lvha78yo.R.inc(6000);dst[dstPos + i] = (short) (0xffff & (src >> shift));
        }
        }__CLR4_5_2456456lvha78yo.R.inc(6001);return dst;
    }finally{__CLR4_5_2456456lvha78yo.R.flushNeeded();}}

    /**
     * <p>
     * Converts an int into an array of short using the default (little endian, Lsb0) byte and
     * bit ordering.
     * </p>
     * 
     * @param src the int to convert
     * @param srcPos the position in {@code src}, in bits, from where to start the conversion
     * @param dst the destination array
     * @param dstPos the position in {@code dst} where to copy the result
     * @param nShorts the number of shorts to copy to {@code dst}, must be smaller or equal to
     *            the width of the input (from srcPos to msb)
     * @return {@code dst}
     * @throws NullPointerException if {@code dst} is {@code null}
     * @throws IllegalArgumentException if {@code (nShorts-1)*16+srcPos >= 32}
     * @throws ArrayIndexOutOfBoundsException if {@code dstPos + nShorts > dst.length}
     */
    public static short[] intToShortArray(final int src, final int srcPos, final short[] dst, final int dstPos,
            final int nShorts) {try{__CLR4_5_2456456lvha78yo.R.inc(6002);
        __CLR4_5_2456456lvha78yo.R.inc(6003);if ((((0 == nShorts)&&(__CLR4_5_2456456lvha78yo.R.iget(6004)!=0|true))||(__CLR4_5_2456456lvha78yo.R.iget(6005)==0&false))) {{
            __CLR4_5_2456456lvha78yo.R.inc(6006);return dst;
        }
        }__CLR4_5_2456456lvha78yo.R.inc(6007);if (((((nShorts - 1) * 16 + srcPos >= 32)&&(__CLR4_5_2456456lvha78yo.R.iget(6008)!=0|true))||(__CLR4_5_2456456lvha78yo.R.iget(6009)==0&false))) {{
            __CLR4_5_2456456lvha78yo.R.inc(6010);throw new IllegalArgumentException("(nShorts-1)*16+srcPos is greater or equal to than 32");
        }
        }__CLR4_5_2456456lvha78yo.R.inc(6011);for (int i = 0; (((i < nShorts)&&(__CLR4_5_2456456lvha78yo.R.iget(6012)!=0|true))||(__CLR4_5_2456456lvha78yo.R.iget(6013)==0&false)); i++) {{
            __CLR4_5_2456456lvha78yo.R.inc(6014);final int shift = i * 16 + srcPos;
            __CLR4_5_2456456lvha78yo.R.inc(6015);dst[dstPos + i] = (short) (0xffff & (src >> shift));
        }
        }__CLR4_5_2456456lvha78yo.R.inc(6016);return dst;
    }finally{__CLR4_5_2456456lvha78yo.R.flushNeeded();}}

    /**
     * <p>
     * Converts a long into an array of byte using the default (little endian, Lsb0) byte and
     * bit ordering.
     * </p>
     * 
     * @param src the long to convert
     * @param srcPos the position in {@code src}, in bits, from where to start the conversion
     * @param dst the destination array
     * @param dstPos the position in {@code dst} where to copy the result
     * @param nBytes the number of bytes to copy to {@code dst}, must be smaller or equal to the
     *            width of the input (from srcPos to msb)
     * @return {@code dst}
     * @throws NullPointerException if {@code dst} is {@code null}
     * @throws IllegalArgumentException if {@code (nBytes-1)*8+srcPos >= 64}
     * @throws ArrayIndexOutOfBoundsException if {@code dstPos + nBytes > dst.length}
     */
    public static byte[] longToByteArray(final long src, final int srcPos, final byte[] dst, final int dstPos,
            final int nBytes) {try{__CLR4_5_2456456lvha78yo.R.inc(6017);
        __CLR4_5_2456456lvha78yo.R.inc(6018);if ((((0 == nBytes)&&(__CLR4_5_2456456lvha78yo.R.iget(6019)!=0|true))||(__CLR4_5_2456456lvha78yo.R.iget(6020)==0&false))) {{
            __CLR4_5_2456456lvha78yo.R.inc(6021);return dst;
        }
        }__CLR4_5_2456456lvha78yo.R.inc(6022);if (((((nBytes - 1) * 8 + srcPos >= 64)&&(__CLR4_5_2456456lvha78yo.R.iget(6023)!=0|true))||(__CLR4_5_2456456lvha78yo.R.iget(6024)==0&false))) {{
            __CLR4_5_2456456lvha78yo.R.inc(6025);throw new IllegalArgumentException("(nBytes-1)*8+srcPos is greater or equal to than 64");
        }
        }__CLR4_5_2456456lvha78yo.R.inc(6026);for (int i = 0; (((i < nBytes)&&(__CLR4_5_2456456lvha78yo.R.iget(6027)!=0|true))||(__CLR4_5_2456456lvha78yo.R.iget(6028)==0&false)); i++) {{
            __CLR4_5_2456456lvha78yo.R.inc(6029);final int shift = i * 8 + srcPos;
            __CLR4_5_2456456lvha78yo.R.inc(6030);dst[dstPos + i] = (byte) (0xff & (src >> shift));
        }
        }__CLR4_5_2456456lvha78yo.R.inc(6031);return dst;
    }finally{__CLR4_5_2456456lvha78yo.R.flushNeeded();}}

    /**
     * <p>
     * Converts an int into an array of byte using the default (little endian, Lsb0) byte and bit
     * ordering.
     * </p>
     * 
     * @param src the int to convert
     * @param srcPos the position in {@code src}, in bits, from where to start the conversion
     * @param dst the destination array
     * @param dstPos the position in {@code dst} where to copy the result
     * @param nBytes the number of bytes to copy to {@code dst}, must be smaller or equal to the
     *            width of the input (from srcPos to msb)
     * @return {@code dst}
     * @throws NullPointerException if {@code dst} is {@code null}
     * @throws IllegalArgumentException if {@code (nBytes-1)*8+srcPos >= 32}
     * @throws ArrayIndexOutOfBoundsException if {@code dstPos + nBytes > dst.length}
     */
    public static byte[] intToByteArray(final int src, final int srcPos, final byte[] dst, final int dstPos,
            final int nBytes) {try{__CLR4_5_2456456lvha78yo.R.inc(6032);
        __CLR4_5_2456456lvha78yo.R.inc(6033);if ((((0 == nBytes)&&(__CLR4_5_2456456lvha78yo.R.iget(6034)!=0|true))||(__CLR4_5_2456456lvha78yo.R.iget(6035)==0&false))) {{
            __CLR4_5_2456456lvha78yo.R.inc(6036);return dst;
        }
        }__CLR4_5_2456456lvha78yo.R.inc(6037);if (((((nBytes - 1) * 8 + srcPos >= 32)&&(__CLR4_5_2456456lvha78yo.R.iget(6038)!=0|true))||(__CLR4_5_2456456lvha78yo.R.iget(6039)==0&false))) {{
            __CLR4_5_2456456lvha78yo.R.inc(6040);throw new IllegalArgumentException("(nBytes-1)*8+srcPos is greater or equal to than 32");
        }
        }__CLR4_5_2456456lvha78yo.R.inc(6041);for (int i = 0; (((i < nBytes)&&(__CLR4_5_2456456lvha78yo.R.iget(6042)!=0|true))||(__CLR4_5_2456456lvha78yo.R.iget(6043)==0&false)); i++) {{
            __CLR4_5_2456456lvha78yo.R.inc(6044);final int shift = i * 8 + srcPos;
            __CLR4_5_2456456lvha78yo.R.inc(6045);dst[dstPos + i] = (byte) (0xff & (src >> shift));
        }
        }__CLR4_5_2456456lvha78yo.R.inc(6046);return dst;
    }finally{__CLR4_5_2456456lvha78yo.R.flushNeeded();}}

    /**
     * <p>
     * Converts a short into an array of byte using the default (little endian, Lsb0) byte and
     * bit ordering.
     * </p>
     * 
     * @param src the short to convert
     * @param srcPos the position in {@code src}, in bits, from where to start the conversion
     * @param dst the destination array
     * @param dstPos the position in {@code dst} where to copy the result
     * @param nBytes the number of bytes to copy to {@code dst}, must be smaller or equal to the
     *            width of the input (from srcPos to msb)
     * @return {@code dst}
     * @throws NullPointerException if {@code dst} is {@code null}
     * @throws IllegalArgumentException if {@code (nBytes-1)*8+srcPos >= 16}
     * @throws ArrayIndexOutOfBoundsException if {@code dstPos + nBytes > dst.length}
     */
    public static byte[] shortToByteArray(final short src, final int srcPos, final byte[] dst, final int dstPos,
            final int nBytes) {try{__CLR4_5_2456456lvha78yo.R.inc(6047);
        __CLR4_5_2456456lvha78yo.R.inc(6048);if ((((0 == nBytes)&&(__CLR4_5_2456456lvha78yo.R.iget(6049)!=0|true))||(__CLR4_5_2456456lvha78yo.R.iget(6050)==0&false))) {{
            __CLR4_5_2456456lvha78yo.R.inc(6051);return dst;
        }
        }__CLR4_5_2456456lvha78yo.R.inc(6052);if (((((nBytes - 1) * 8 + srcPos >= 16)&&(__CLR4_5_2456456lvha78yo.R.iget(6053)!=0|true))||(__CLR4_5_2456456lvha78yo.R.iget(6054)==0&false))) {{
            __CLR4_5_2456456lvha78yo.R.inc(6055);throw new IllegalArgumentException("(nBytes-1)*8+srcPos is greater or equal to than 16");
        }
        }__CLR4_5_2456456lvha78yo.R.inc(6056);for (int i = 0; (((i < nBytes)&&(__CLR4_5_2456456lvha78yo.R.iget(6057)!=0|true))||(__CLR4_5_2456456lvha78yo.R.iget(6058)==0&false)); i++) {{
            __CLR4_5_2456456lvha78yo.R.inc(6059);final int shift = i * 8 + srcPos;
            __CLR4_5_2456456lvha78yo.R.inc(6060);dst[dstPos + i] = (byte) (0xff & (src >> shift));
        }
        }__CLR4_5_2456456lvha78yo.R.inc(6061);return dst;
    }finally{__CLR4_5_2456456lvha78yo.R.flushNeeded();}}

    /**
     * <p>
     * Converts a long into an array of Char using the default (little endian, Lsb0) byte and
     * bit ordering.
     * </p>
     * 
     * @param src the long to convert
     * @param srcPos the position in {@code src}, in bits, from where to start the conversion
     * @param dstInit the initial value for the result String
     * @param dstPos the position in {@code dst} where to copy the result
     * @param nHexs the number of Chars to copy to {@code dst}, must be smaller or equal to the
     *            width of the input (from srcPos to msb)
     * @return {@code dst}
     * @throws IllegalArgumentException if {@code (nHexs-1)*4+srcPos >= 64}
     * @throws StringIndexOutOfBoundsException if {@code dst.init.length() < dstPos}
     */
    public static String longToHex(final long src, final int srcPos, final String dstInit, final int dstPos,
            final int nHexs) {try{__CLR4_5_2456456lvha78yo.R.inc(6062);
        __CLR4_5_2456456lvha78yo.R.inc(6063);if ((((0 == nHexs)&&(__CLR4_5_2456456lvha78yo.R.iget(6064)!=0|true))||(__CLR4_5_2456456lvha78yo.R.iget(6065)==0&false))) {{
            __CLR4_5_2456456lvha78yo.R.inc(6066);return dstInit;
        }
        }__CLR4_5_2456456lvha78yo.R.inc(6067);if (((((nHexs - 1) * 4 + srcPos >= 64)&&(__CLR4_5_2456456lvha78yo.R.iget(6068)!=0|true))||(__CLR4_5_2456456lvha78yo.R.iget(6069)==0&false))) {{
            __CLR4_5_2456456lvha78yo.R.inc(6070);throw new IllegalArgumentException("(nHexs-1)*4+srcPos is greater or equal to than 64");
        }
        }__CLR4_5_2456456lvha78yo.R.inc(6071);final StringBuilder sb = new StringBuilder(dstInit);
        __CLR4_5_2456456lvha78yo.R.inc(6072);int append = sb.length();
        __CLR4_5_2456456lvha78yo.R.inc(6073);for (int i = 0; (((i < nHexs)&&(__CLR4_5_2456456lvha78yo.R.iget(6074)!=0|true))||(__CLR4_5_2456456lvha78yo.R.iget(6075)==0&false)); i++) {{
            __CLR4_5_2456456lvha78yo.R.inc(6076);final int shift = i * 4 + srcPos;
            __CLR4_5_2456456lvha78yo.R.inc(6077);final int bits = (int) (0xF & (src >> shift));
            __CLR4_5_2456456lvha78yo.R.inc(6078);if ((((dstPos + i == append)&&(__CLR4_5_2456456lvha78yo.R.iget(6079)!=0|true))||(__CLR4_5_2456456lvha78yo.R.iget(6080)==0&false))) {{
                __CLR4_5_2456456lvha78yo.R.inc(6081);++append;
                __CLR4_5_2456456lvha78yo.R.inc(6082);sb.append(intToHexDigit(bits));
            } }else {{
                __CLR4_5_2456456lvha78yo.R.inc(6083);sb.setCharAt(dstPos + i, intToHexDigit(bits));
            }
        }}
        }__CLR4_5_2456456lvha78yo.R.inc(6084);return sb.toString();
    }finally{__CLR4_5_2456456lvha78yo.R.flushNeeded();}}

    /**
     * <p>
     * Converts an int into an array of Char using the default (little endian, Lsb0) byte and bit
     * ordering.
     * </p>
     * 
     * @param src the int to convert
     * @param srcPos the position in {@code src}, in bits, from where to start the conversion
     * @param dstInit the initial value for the result String
     * @param dstPos the position in {@code dst} where to copy the result
     * @param nHexs the number of Chars to copy to {@code dst}, must be smaller or equal to the
     *            width of the input (from srcPos to msb)
     * @return {@code dst}
     * @throws IllegalArgumentException if {@code (nHexs-1)*4+srcPos >= 32}
     * @throws StringIndexOutOfBoundsException if {@code dst.init.length() < dstPos}
     */
    public static String intToHex(final int src, final int srcPos, final String dstInit, final int dstPos,
            final int nHexs) {try{__CLR4_5_2456456lvha78yo.R.inc(6085);
        __CLR4_5_2456456lvha78yo.R.inc(6086);if ((((0 == nHexs)&&(__CLR4_5_2456456lvha78yo.R.iget(6087)!=0|true))||(__CLR4_5_2456456lvha78yo.R.iget(6088)==0&false))) {{
            __CLR4_5_2456456lvha78yo.R.inc(6089);return dstInit;
        }
        }__CLR4_5_2456456lvha78yo.R.inc(6090);if (((((nHexs - 1) * 4 + srcPos >= 32)&&(__CLR4_5_2456456lvha78yo.R.iget(6091)!=0|true))||(__CLR4_5_2456456lvha78yo.R.iget(6092)==0&false))) {{
            __CLR4_5_2456456lvha78yo.R.inc(6093);throw new IllegalArgumentException("(nHexs-1)*4+srcPos is greater or equal to than 32");
        }
        }__CLR4_5_2456456lvha78yo.R.inc(6094);final StringBuilder sb = new StringBuilder(dstInit);
        __CLR4_5_2456456lvha78yo.R.inc(6095);int append = sb.length();
        __CLR4_5_2456456lvha78yo.R.inc(6096);for (int i = 0; (((i < nHexs)&&(__CLR4_5_2456456lvha78yo.R.iget(6097)!=0|true))||(__CLR4_5_2456456lvha78yo.R.iget(6098)==0&false)); i++) {{
            __CLR4_5_2456456lvha78yo.R.inc(6099);final int shift = i * 4 + srcPos;
            __CLR4_5_2456456lvha78yo.R.inc(6100);final int bits = 0xF & (src >> shift);
            __CLR4_5_2456456lvha78yo.R.inc(6101);if ((((dstPos + i == append)&&(__CLR4_5_2456456lvha78yo.R.iget(6102)!=0|true))||(__CLR4_5_2456456lvha78yo.R.iget(6103)==0&false))) {{
                __CLR4_5_2456456lvha78yo.R.inc(6104);++append;
                __CLR4_5_2456456lvha78yo.R.inc(6105);sb.append(intToHexDigit(bits));
            } }else {{
                __CLR4_5_2456456lvha78yo.R.inc(6106);sb.setCharAt(dstPos + i, intToHexDigit(bits));
            }
        }}
        }__CLR4_5_2456456lvha78yo.R.inc(6107);return sb.toString();
    }finally{__CLR4_5_2456456lvha78yo.R.flushNeeded();}}

    /**
     * <p>
     * Converts a short into an array of Char using the default (little endian, Lsb0) byte and
     * bit ordering.
     * </p>
     * 
     * @param src the short to convert
     * @param srcPos the position in {@code src}, in bits, from where to start the conversion
     * @param dstInit the initial value for the result String
     * @param dstPos the position in {@code dst} where to copy the result
     * @param nHexs the number of Chars to copy to {@code dst}, must be smaller or equal to the
     *            width of the input (from srcPos to msb)
     * @return {@code dst}
     * @throws IllegalArgumentException if {@code (nHexs-1)*4+srcPos >= 16}
     * @throws StringIndexOutOfBoundsException if {@code dst.init.length() < dstPos}
     */
    public static String shortToHex(final short src, final int srcPos, final String dstInit, final int dstPos,
            final int nHexs) {try{__CLR4_5_2456456lvha78yo.R.inc(6108);
        __CLR4_5_2456456lvha78yo.R.inc(6109);if ((((0 == nHexs)&&(__CLR4_5_2456456lvha78yo.R.iget(6110)!=0|true))||(__CLR4_5_2456456lvha78yo.R.iget(6111)==0&false))) {{
            __CLR4_5_2456456lvha78yo.R.inc(6112);return dstInit;
        }
        }__CLR4_5_2456456lvha78yo.R.inc(6113);if (((((nHexs - 1) * 4 + srcPos >= 16)&&(__CLR4_5_2456456lvha78yo.R.iget(6114)!=0|true))||(__CLR4_5_2456456lvha78yo.R.iget(6115)==0&false))) {{
            __CLR4_5_2456456lvha78yo.R.inc(6116);throw new IllegalArgumentException("(nHexs-1)*4+srcPos is greater or equal to than 16");
        }
        }__CLR4_5_2456456lvha78yo.R.inc(6117);final StringBuilder sb = new StringBuilder(dstInit);
        __CLR4_5_2456456lvha78yo.R.inc(6118);int append = sb.length();
        __CLR4_5_2456456lvha78yo.R.inc(6119);for (int i = 0; (((i < nHexs)&&(__CLR4_5_2456456lvha78yo.R.iget(6120)!=0|true))||(__CLR4_5_2456456lvha78yo.R.iget(6121)==0&false)); i++) {{
            __CLR4_5_2456456lvha78yo.R.inc(6122);final int shift = i * 4 + srcPos;
            __CLR4_5_2456456lvha78yo.R.inc(6123);final int bits = 0xF & (src >> shift);
            __CLR4_5_2456456lvha78yo.R.inc(6124);if ((((dstPos + i == append)&&(__CLR4_5_2456456lvha78yo.R.iget(6125)!=0|true))||(__CLR4_5_2456456lvha78yo.R.iget(6126)==0&false))) {{
                __CLR4_5_2456456lvha78yo.R.inc(6127);++append;
                __CLR4_5_2456456lvha78yo.R.inc(6128);sb.append(intToHexDigit(bits));
            } }else {{
                __CLR4_5_2456456lvha78yo.R.inc(6129);sb.setCharAt(dstPos + i, intToHexDigit(bits));
            }
        }}
        }__CLR4_5_2456456lvha78yo.R.inc(6130);return sb.toString();
    }finally{__CLR4_5_2456456lvha78yo.R.flushNeeded();}}

    /**
     * <p>
     * Converts a byte into an array of Char using the default (little endian, Lsb0) byte and
     * bit ordering.
     * </p>
     * 
     * @param src the byte to convert
     * @param srcPos the position in {@code src}, in bits, from where to start the conversion
     * @param dstInit the initial value for the result String
     * @param dstPos the position in {@code dst} where to copy the result
     * @param nHexs the number of Chars to copy to {@code dst}, must be smaller or equal to the
     *            width of the input (from srcPos to msb)
     * @return {@code dst}
     * @throws IllegalArgumentException if {@code (nHexs-1)*4+srcPos >= 8}
     * @throws StringIndexOutOfBoundsException if {@code dst.init.length() < dstPos}
     */
    public static String byteToHex(final byte src, final int srcPos, final String dstInit, final int dstPos,
            final int nHexs) {try{__CLR4_5_2456456lvha78yo.R.inc(6131);
        __CLR4_5_2456456lvha78yo.R.inc(6132);if ((((0 == nHexs)&&(__CLR4_5_2456456lvha78yo.R.iget(6133)!=0|true))||(__CLR4_5_2456456lvha78yo.R.iget(6134)==0&false))) {{
            __CLR4_5_2456456lvha78yo.R.inc(6135);return dstInit;
        }
        }__CLR4_5_2456456lvha78yo.R.inc(6136);if (((((nHexs - 1) * 4 + srcPos >= 8)&&(__CLR4_5_2456456lvha78yo.R.iget(6137)!=0|true))||(__CLR4_5_2456456lvha78yo.R.iget(6138)==0&false))) {{
            __CLR4_5_2456456lvha78yo.R.inc(6139);throw new IllegalArgumentException("(nHexs-1)*4+srcPos is greater or equal to than 8");
        }
        }__CLR4_5_2456456lvha78yo.R.inc(6140);final StringBuilder sb = new StringBuilder(dstInit);
        __CLR4_5_2456456lvha78yo.R.inc(6141);int append = sb.length();
        __CLR4_5_2456456lvha78yo.R.inc(6142);for (int i = 0; (((i < nHexs)&&(__CLR4_5_2456456lvha78yo.R.iget(6143)!=0|true))||(__CLR4_5_2456456lvha78yo.R.iget(6144)==0&false)); i++) {{
            __CLR4_5_2456456lvha78yo.R.inc(6145);final int shift = i * 4 + srcPos;
            __CLR4_5_2456456lvha78yo.R.inc(6146);final int bits = 0xF & (src >> shift);
            __CLR4_5_2456456lvha78yo.R.inc(6147);if ((((dstPos + i == append)&&(__CLR4_5_2456456lvha78yo.R.iget(6148)!=0|true))||(__CLR4_5_2456456lvha78yo.R.iget(6149)==0&false))) {{
                __CLR4_5_2456456lvha78yo.R.inc(6150);++append;
                __CLR4_5_2456456lvha78yo.R.inc(6151);sb.append(intToHexDigit(bits));
            } }else {{
                __CLR4_5_2456456lvha78yo.R.inc(6152);sb.setCharAt(dstPos + i, intToHexDigit(bits));
            }
        }}
        }__CLR4_5_2456456lvha78yo.R.inc(6153);return sb.toString();
    }finally{__CLR4_5_2456456lvha78yo.R.flushNeeded();}}

    /**
     * <p>
     * Converts a long into an array of boolean using the default (little endian, Lsb0) byte and
     * bit ordering.
     * </p>
     * 
     * @param src the long to convert
     * @param srcPos the position in {@code src}, in bits, from where to start the conversion
     * @param dst the destination array
     * @param dstPos the position in {@code dst} where to copy the result
     * @param nBools the number of booleans to copy to {@code dst}, must be smaller or equal to
     *            the width of the input (from srcPos to msb)
     * @return {@code dst}
     * @throws NullPointerException if {@code dst} is {@code null}
     * @throws IllegalArgumentException if {@code nBools-1+srcPos >= 64}
     * @throws ArrayIndexOutOfBoundsException if {@code dstPos + nBools > dst.length}
     */
    public static boolean[] longToBinary(final long src, final int srcPos, final boolean[] dst, final int dstPos,
            final int nBools) {try{__CLR4_5_2456456lvha78yo.R.inc(6154);
        __CLR4_5_2456456lvha78yo.R.inc(6155);if ((((0 == nBools)&&(__CLR4_5_2456456lvha78yo.R.iget(6156)!=0|true))||(__CLR4_5_2456456lvha78yo.R.iget(6157)==0&false))) {{
            __CLR4_5_2456456lvha78yo.R.inc(6158);return dst;
        }
        }__CLR4_5_2456456lvha78yo.R.inc(6159);if ((((nBools - 1 + srcPos >= 64)&&(__CLR4_5_2456456lvha78yo.R.iget(6160)!=0|true))||(__CLR4_5_2456456lvha78yo.R.iget(6161)==0&false))) {{
            __CLR4_5_2456456lvha78yo.R.inc(6162);throw new IllegalArgumentException("nBools-1+srcPos is greater or equal to than 64");
        }
        }__CLR4_5_2456456lvha78yo.R.inc(6163);for (int i = 0; (((i < nBools)&&(__CLR4_5_2456456lvha78yo.R.iget(6164)!=0|true))||(__CLR4_5_2456456lvha78yo.R.iget(6165)==0&false)); i++) {{
            __CLR4_5_2456456lvha78yo.R.inc(6166);final int shift = i + srcPos;
            __CLR4_5_2456456lvha78yo.R.inc(6167);dst[dstPos + i] = (0x1 & (src >> shift)) != 0;
        }
        }__CLR4_5_2456456lvha78yo.R.inc(6168);return dst;
    }finally{__CLR4_5_2456456lvha78yo.R.flushNeeded();}}

    /**
     * <p>
     * Converts an int into an array of boolean using the default (little endian, Lsb0) byte and
     * bit ordering.
     * </p>
     * 
     * @param src the int to convert
     * @param srcPos the position in {@code src}, in bits, from where to start the conversion
     * @param dst the destination array
     * @param dstPos the position in {@code dst} where to copy the result
     * @param nBools the number of booleans to copy to {@code dst}, must be smaller or equal to
     *            the width of the input (from srcPos to msb)
     * @return {@code dst}
     * @throws NullPointerException if {@code dst} is {@code null}
     * @throws IllegalArgumentException if {@code nBools-1+srcPos >= 32}
     * @throws ArrayIndexOutOfBoundsException if {@code dstPos + nBools > dst.length}
     */
    public static boolean[] intToBinary(final int src, final int srcPos, final boolean[] dst, final int dstPos,
            final int nBools) {try{__CLR4_5_2456456lvha78yo.R.inc(6169);
        __CLR4_5_2456456lvha78yo.R.inc(6170);if ((((0 == nBools)&&(__CLR4_5_2456456lvha78yo.R.iget(6171)!=0|true))||(__CLR4_5_2456456lvha78yo.R.iget(6172)==0&false))) {{
            __CLR4_5_2456456lvha78yo.R.inc(6173);return dst;
        }
        }__CLR4_5_2456456lvha78yo.R.inc(6174);if ((((nBools - 1 + srcPos >= 32)&&(__CLR4_5_2456456lvha78yo.R.iget(6175)!=0|true))||(__CLR4_5_2456456lvha78yo.R.iget(6176)==0&false))) {{
            __CLR4_5_2456456lvha78yo.R.inc(6177);throw new IllegalArgumentException("nBools-1+srcPos is greater or equal to than 32");
        }
        }__CLR4_5_2456456lvha78yo.R.inc(6178);for (int i = 0; (((i < nBools)&&(__CLR4_5_2456456lvha78yo.R.iget(6179)!=0|true))||(__CLR4_5_2456456lvha78yo.R.iget(6180)==0&false)); i++) {{
            __CLR4_5_2456456lvha78yo.R.inc(6181);final int shift = i + srcPos;
            __CLR4_5_2456456lvha78yo.R.inc(6182);dst[dstPos + i] = (0x1 & (src >> shift)) != 0;
        }
        }__CLR4_5_2456456lvha78yo.R.inc(6183);return dst;
    }finally{__CLR4_5_2456456lvha78yo.R.flushNeeded();}}

    /**
     * <p>
     * Converts a short into an array of boolean using the default (little endian, Lsb0) byte
     * and bit ordering.
     * </p>
     * 
     * @param src the short to convert
     * @param srcPos the position in {@code src}, in bits, from where to start the conversion
     * @param dst the destination array
     * @param dstPos the position in {@code dst} where to copy the result
     * @param nBools the number of booleans to copy to {@code dst}, must be smaller or equal to
     *            the width of the input (from srcPos to msb)
     * @return {@code dst}
     * @throws NullPointerException if {@code dst} is {@code null}
     * @throws IllegalArgumentException if {@code nBools-1+srcPos >= 16}
     * @throws ArrayIndexOutOfBoundsException if {@code dstPos + nBools > dst.length}
     */
    public static boolean[] shortToBinary(final short src, final int srcPos, final boolean[] dst, final int dstPos,
            final int nBools) {try{__CLR4_5_2456456lvha78yo.R.inc(6184);
        __CLR4_5_2456456lvha78yo.R.inc(6185);if ((((0 == nBools)&&(__CLR4_5_2456456lvha78yo.R.iget(6186)!=0|true))||(__CLR4_5_2456456lvha78yo.R.iget(6187)==0&false))) {{
            __CLR4_5_2456456lvha78yo.R.inc(6188);return dst;
        }
        }__CLR4_5_2456456lvha78yo.R.inc(6189);if ((((nBools - 1 + srcPos >= 16)&&(__CLR4_5_2456456lvha78yo.R.iget(6190)!=0|true))||(__CLR4_5_2456456lvha78yo.R.iget(6191)==0&false))) {{
            __CLR4_5_2456456lvha78yo.R.inc(6192);throw new IllegalArgumentException("nBools-1+srcPos is greater or equal to than 16");
        }
        }assert ((((nBools - 1) < 16 - srcPos)&&(__CLR4_5_2456456lvha78yo.R.iget(6193)!=0|true))||(__CLR4_5_2456456lvha78yo.R.iget(6194)==0&false));
        __CLR4_5_2456456lvha78yo.R.inc(6195);for (int i = 0; (((i < nBools)&&(__CLR4_5_2456456lvha78yo.R.iget(6196)!=0|true))||(__CLR4_5_2456456lvha78yo.R.iget(6197)==0&false)); i++) {{
            __CLR4_5_2456456lvha78yo.R.inc(6198);final int shift = i + srcPos;
            __CLR4_5_2456456lvha78yo.R.inc(6199);dst[dstPos + i] = (0x1 & (src >> shift)) != 0;
        }
        }__CLR4_5_2456456lvha78yo.R.inc(6200);return dst;
    }finally{__CLR4_5_2456456lvha78yo.R.flushNeeded();}}

    /**
     * <p>
     * Converts a byte into an array of boolean using the default (little endian, Lsb0) byte and
     * bit ordering.
     * </p>
     * 
     * @param src the byte to convert
     * @param srcPos the position in {@code src}, in bits, from where to start the conversion
     * @param dst the destination array
     * @param dstPos the position in {@code dst} where to copy the result
     * @param nBools the number of booleans to copy to {@code dst}, must be smaller or equal to
     *            the width of the input (from srcPos to msb)
     * @return {@code dst}
     * @throws NullPointerException if {@code dst} is {@code null}
     * @throws IllegalArgumentException if {@code nBools-1+srcPos >= 8}
     * @throws ArrayIndexOutOfBoundsException if {@code dstPos + nBools > dst.length}
     */
    public static boolean[] byteToBinary(final byte src, final int srcPos, final boolean[] dst, final int dstPos,
            final int nBools) {try{__CLR4_5_2456456lvha78yo.R.inc(6201);
        __CLR4_5_2456456lvha78yo.R.inc(6202);if ((((0 == nBools)&&(__CLR4_5_2456456lvha78yo.R.iget(6203)!=0|true))||(__CLR4_5_2456456lvha78yo.R.iget(6204)==0&false))) {{
            __CLR4_5_2456456lvha78yo.R.inc(6205);return dst;
        }
        }__CLR4_5_2456456lvha78yo.R.inc(6206);if ((((nBools - 1 + srcPos >= 8)&&(__CLR4_5_2456456lvha78yo.R.iget(6207)!=0|true))||(__CLR4_5_2456456lvha78yo.R.iget(6208)==0&false))) {{
            __CLR4_5_2456456lvha78yo.R.inc(6209);throw new IllegalArgumentException("nBools-1+srcPos is greater or equal to than 8");
        }
        }__CLR4_5_2456456lvha78yo.R.inc(6210);for (int i = 0; (((i < nBools)&&(__CLR4_5_2456456lvha78yo.R.iget(6211)!=0|true))||(__CLR4_5_2456456lvha78yo.R.iget(6212)==0&false)); i++) {{
            __CLR4_5_2456456lvha78yo.R.inc(6213);final int shift = i + srcPos;
            __CLR4_5_2456456lvha78yo.R.inc(6214);dst[dstPos + i] = (0x1 & (src >> shift)) != 0;
        }
        }__CLR4_5_2456456lvha78yo.R.inc(6215);return dst;
    }finally{__CLR4_5_2456456lvha78yo.R.flushNeeded();}}

    /**
     * <p>
     * Converts UUID into an array of byte using the default (little endian, Lsb0) byte and bit
     * ordering.
     * </p>
     * 
     * @param src the UUID to convert
     * @param dst the destination array
     * @param dstPos the position in {@code dst} where to copy the result
     * @param nBytes the number of bytes to copy to {@code dst}, must be smaller or equal to the
     *            width of the input (from srcPos to msb)
     * @return {@code dst}
     * @throws NullPointerException if {@code dst} is {@code null}
     * @throws IllegalArgumentException if {@code nBytes > 16}
     * @throws ArrayIndexOutOfBoundsException if {@code dstPos + nBytes > dst.length}
     */
    public static byte[] uuidToByteArray(final UUID src, final byte[] dst, final int dstPos, final int nBytes) {try{__CLR4_5_2456456lvha78yo.R.inc(6216);
        __CLR4_5_2456456lvha78yo.R.inc(6217);if ((((0 == nBytes)&&(__CLR4_5_2456456lvha78yo.R.iget(6218)!=0|true))||(__CLR4_5_2456456lvha78yo.R.iget(6219)==0&false))) {{
            __CLR4_5_2456456lvha78yo.R.inc(6220);return dst;
        }
        }__CLR4_5_2456456lvha78yo.R.inc(6221);if ((((nBytes > 16)&&(__CLR4_5_2456456lvha78yo.R.iget(6222)!=0|true))||(__CLR4_5_2456456lvha78yo.R.iget(6223)==0&false))) {{
            __CLR4_5_2456456lvha78yo.R.inc(6224);throw new IllegalArgumentException("nBytes is greater than 16");
        }
        }__CLR4_5_2456456lvha78yo.R.inc(6225);longToByteArray(src.getMostSignificantBits(), 0, dst, dstPos, (((nBytes > 8 )&&(__CLR4_5_2456456lvha78yo.R.iget(6226)!=0|true))||(__CLR4_5_2456456lvha78yo.R.iget(6227)==0&false))? 8 : nBytes);
        __CLR4_5_2456456lvha78yo.R.inc(6228);if ((((nBytes >= 8)&&(__CLR4_5_2456456lvha78yo.R.iget(6229)!=0|true))||(__CLR4_5_2456456lvha78yo.R.iget(6230)==0&false))) {{
            __CLR4_5_2456456lvha78yo.R.inc(6231);longToByteArray(src.getLeastSignificantBits(), 0, dst, dstPos + 8, nBytes - 8);
        }
        }__CLR4_5_2456456lvha78yo.R.inc(6232);return dst;
    }finally{__CLR4_5_2456456lvha78yo.R.flushNeeded();}}

    /**
     * <p>
     * Converts bytes from an array into a UUID using the default (little endian, Lsb0) byte and
     * bit ordering.
     * </p>
     * 
     * @param src the byte array to convert
     * @param srcPos the position in {@code src} where to copy the result from
     * @return a UUID
     * @throws NullPointerException if {@code src} is {@code null}
     * @throws IllegalArgumentException if array does not contain at least 16 bytes beginning
     *             with {@code srcPos}
     */
    public static UUID byteArrayToUuid(final byte[] src, final int srcPos) {try{__CLR4_5_2456456lvha78yo.R.inc(6233);
        __CLR4_5_2456456lvha78yo.R.inc(6234);if ((((src.length - srcPos < 16)&&(__CLR4_5_2456456lvha78yo.R.iget(6235)!=0|true))||(__CLR4_5_2456456lvha78yo.R.iget(6236)==0&false))) {{
            __CLR4_5_2456456lvha78yo.R.inc(6237);throw new IllegalArgumentException("Need at least 16 bytes for UUID");
        }
        }__CLR4_5_2456456lvha78yo.R.inc(6238);return new UUID(byteArrayToLong(src, srcPos, 0, 0, 8), byteArrayToLong(src, srcPos + 8, 0, 0, 8));
    }finally{__CLR4_5_2456456lvha78yo.R.flushNeeded();}}
}
