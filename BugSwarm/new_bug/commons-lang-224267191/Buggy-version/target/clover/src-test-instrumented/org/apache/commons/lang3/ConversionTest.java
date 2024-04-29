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

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.UUID;

import org.junit.Test;


/**
 * Unit tests {@link Conversion}.
 */
public class ConversionTest {static class __CLR4_5_2obhobhlvha7ft6{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172763741L,8589935092L,32166,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Tests {@link Conversion#hexDigitToInt(char)}.
     */
    @Test
    public void testHexDigitToInt() {__CLR4_5_2obhobhlvha7ft6.R.globalSliceStart(getClass().getName(),31517);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ojw2g9obh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2obhobhlvha7ft6.R.rethrow($CLV_t2$);}finally{__CLR4_5_2obhobhlvha7ft6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ConversionTest.testHexDigitToInt",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),31517,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ojw2g9obh(){try{__CLR4_5_2obhobhlvha7ft6.R.inc(31517);
        __CLR4_5_2obhobhlvha7ft6.R.inc(31518);assertEquals(0, Conversion.hexDigitToInt('0'));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31519);assertEquals(1, Conversion.hexDigitToInt('1'));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31520);assertEquals(2, Conversion.hexDigitToInt('2'));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31521);assertEquals(3, Conversion.hexDigitToInt('3'));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31522);assertEquals(4, Conversion.hexDigitToInt('4'));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31523);assertEquals(5, Conversion.hexDigitToInt('5'));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31524);assertEquals(6, Conversion.hexDigitToInt('6'));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31525);assertEquals(7, Conversion.hexDigitToInt('7'));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31526);assertEquals(8, Conversion.hexDigitToInt('8'));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31527);assertEquals(9, Conversion.hexDigitToInt('9'));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31528);assertEquals(10, Conversion.hexDigitToInt('A'));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31529);assertEquals(10, Conversion.hexDigitToInt('a'));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31530);assertEquals(11, Conversion.hexDigitToInt('B'));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31531);assertEquals(11, Conversion.hexDigitToInt('b'));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31532);assertEquals(12, Conversion.hexDigitToInt('C'));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31533);assertEquals(12, Conversion.hexDigitToInt('c'));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31534);assertEquals(13, Conversion.hexDigitToInt('D'));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31535);assertEquals(13, Conversion.hexDigitToInt('d'));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31536);assertEquals(14, Conversion.hexDigitToInt('E'));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31537);assertEquals(14, Conversion.hexDigitToInt('e'));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31538);assertEquals(15, Conversion.hexDigitToInt('F'));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31539);assertEquals(15, Conversion.hexDigitToInt('f'));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31540);try {
            __CLR4_5_2obhobhlvha7ft6.R.inc(31541);Conversion.hexDigitToInt('G');
            __CLR4_5_2obhobhlvha7ft6.R.inc(31542);fail("Thrown " + IllegalArgumentException.class.getName() + " expected");
        } catch (final IllegalArgumentException e) {
            // OK
        }
    }finally{__CLR4_5_2obhobhlvha7ft6.R.flushNeeded();}}

    /**
     * Tests {@link Conversion#hexDigitMsb0ToInt(char)}.
     */
    @Test
    public void testHexDigitMsb0ToInt() {__CLR4_5_2obhobhlvha7ft6.R.globalSliceStart(getClass().getName(),31543);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2x9l60toc7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2obhobhlvha7ft6.R.rethrow($CLV_t2$);}finally{__CLR4_5_2obhobhlvha7ft6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ConversionTest.testHexDigitMsb0ToInt",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),31543,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2x9l60toc7(){try{__CLR4_5_2obhobhlvha7ft6.R.inc(31543);
        __CLR4_5_2obhobhlvha7ft6.R.inc(31544);assertEquals(0x0, Conversion.hexDigitMsb0ToInt('0'));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31545);assertEquals(0x8, Conversion.hexDigitMsb0ToInt('1'));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31546);assertEquals(0x4, Conversion.hexDigitMsb0ToInt('2'));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31547);assertEquals(0xC, Conversion.hexDigitMsb0ToInt('3'));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31548);assertEquals(0x2, Conversion.hexDigitMsb0ToInt('4'));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31549);assertEquals(0xA, Conversion.hexDigitMsb0ToInt('5'));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31550);assertEquals(0x6, Conversion.hexDigitMsb0ToInt('6'));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31551);assertEquals(0xE, Conversion.hexDigitMsb0ToInt('7'));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31552);assertEquals(0x1, Conversion.hexDigitMsb0ToInt('8'));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31553);assertEquals(0x9, Conversion.hexDigitMsb0ToInt('9'));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31554);assertEquals(0x5, Conversion.hexDigitMsb0ToInt('A'));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31555);assertEquals(0x5, Conversion.hexDigitMsb0ToInt('a'));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31556);assertEquals(0xD, Conversion.hexDigitMsb0ToInt('B'));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31557);assertEquals(0xD, Conversion.hexDigitMsb0ToInt('b'));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31558);assertEquals(0x3, Conversion.hexDigitMsb0ToInt('C'));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31559);assertEquals(0x3, Conversion.hexDigitMsb0ToInt('c'));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31560);assertEquals(0xB, Conversion.hexDigitMsb0ToInt('D'));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31561);assertEquals(0xB, Conversion.hexDigitMsb0ToInt('d'));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31562);assertEquals(0x7, Conversion.hexDigitMsb0ToInt('E'));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31563);assertEquals(0x7, Conversion.hexDigitMsb0ToInt('e'));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31564);assertEquals(0xF, Conversion.hexDigitMsb0ToInt('F'));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31565);assertEquals(0xF, Conversion.hexDigitMsb0ToInt('f'));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31566);try {
            __CLR4_5_2obhobhlvha7ft6.R.inc(31567);Conversion.hexDigitMsb0ToInt('G');
            __CLR4_5_2obhobhlvha7ft6.R.inc(31568);fail("Thrown " + IllegalArgumentException.class.getName() + " expected");
        } catch (final IllegalArgumentException e) {
            // OK
        }
    }finally{__CLR4_5_2obhobhlvha7ft6.R.flushNeeded();}}

    /**
     * Tests {@link Conversion#hexDigitToBinary(char)}.
     */
    @Test
    public void testHexDigitToBinary() {__CLR4_5_2obhobhlvha7ft6.R.globalSliceStart(getClass().getName(),31569);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jkm4s9ocx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2obhobhlvha7ft6.R.rethrow($CLV_t2$);}finally{__CLR4_5_2obhobhlvha7ft6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ConversionTest.testHexDigitToBinary",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),31569,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jkm4s9ocx(){try{__CLR4_5_2obhobhlvha7ft6.R.inc(31569);
        __CLR4_5_2obhobhlvha7ft6.R.inc(31570);assertBinaryEquals(
            new boolean[]{false, false, false, false}, Conversion.hexDigitToBinary('0'));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31571);assertBinaryEquals(
            new boolean[]{true, false, false, false}, Conversion.hexDigitToBinary('1'));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31572);assertBinaryEquals(
            new boolean[]{false, true, false, false}, Conversion.hexDigitToBinary('2'));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31573);assertBinaryEquals(
            new boolean[]{true, true, false, false}, Conversion.hexDigitToBinary('3'));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31574);assertBinaryEquals(
            new boolean[]{false, false, true, false}, Conversion.hexDigitToBinary('4'));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31575);assertBinaryEquals(
            new boolean[]{true, false, true, false}, Conversion.hexDigitToBinary('5'));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31576);assertBinaryEquals(
            new boolean[]{false, true, true, false}, Conversion.hexDigitToBinary('6'));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31577);assertBinaryEquals(
            new boolean[]{true, true, true, false}, Conversion.hexDigitToBinary('7'));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31578);assertBinaryEquals(
            new boolean[]{false, false, false, true}, Conversion.hexDigitToBinary('8'));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31579);assertBinaryEquals(
            new boolean[]{true, false, false, true}, Conversion.hexDigitToBinary('9'));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31580);assertBinaryEquals(
            new boolean[]{false, true, false, true}, Conversion.hexDigitToBinary('A'));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31581);assertBinaryEquals(
            new boolean[]{false, true, false, true}, Conversion.hexDigitToBinary('a'));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31582);assertBinaryEquals(
            new boolean[]{true, true, false, true}, Conversion.hexDigitToBinary('B'));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31583);assertBinaryEquals(
            new boolean[]{true, true, false, true}, Conversion.hexDigitToBinary('b'));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31584);assertBinaryEquals(
            new boolean[]{false, false, true, true}, Conversion.hexDigitToBinary('C'));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31585);assertBinaryEquals(
            new boolean[]{false, false, true, true}, Conversion.hexDigitToBinary('c'));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31586);assertBinaryEquals(
            new boolean[]{true, false, true, true}, Conversion.hexDigitToBinary('D'));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31587);assertBinaryEquals(
            new boolean[]{true, false, true, true}, Conversion.hexDigitToBinary('d'));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31588);assertBinaryEquals(
            new boolean[]{false, true, true, true}, Conversion.hexDigitToBinary('E'));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31589);assertBinaryEquals(
            new boolean[]{false, true, true, true}, Conversion.hexDigitToBinary('e'));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31590);assertBinaryEquals(
            new boolean[]{true, true, true, true}, Conversion.hexDigitToBinary('F'));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31591);assertBinaryEquals(
            new boolean[]{true, true, true, true}, Conversion.hexDigitToBinary('f'));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31592);try {
            __CLR4_5_2obhobhlvha7ft6.R.inc(31593);Conversion.hexDigitToBinary('G');
            __CLR4_5_2obhobhlvha7ft6.R.inc(31594);fail("Thrown " + IllegalArgumentException.class.getName() + " expected");
        } catch (final IllegalArgumentException e) {
            // OK
        }
    }finally{__CLR4_5_2obhobhlvha7ft6.R.flushNeeded();}}

    /**
     * Tests {@link Conversion#hexDigitMsb0ToBinary(char)}.
     */
    @Test
    public void testHexDigitMsb0ToBinary() {__CLR4_5_2obhobhlvha7ft6.R.globalSliceStart(getClass().getName(),31595);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_258sbobodn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2obhobhlvha7ft6.R.rethrow($CLV_t2$);}finally{__CLR4_5_2obhobhlvha7ft6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ConversionTest.testHexDigitMsb0ToBinary",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),31595,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_258sbobodn(){try{__CLR4_5_2obhobhlvha7ft6.R.inc(31595);
        __CLR4_5_2obhobhlvha7ft6.R.inc(31596);assertBinaryEquals(
            new boolean[]{false, false, false, false}, Conversion.hexDigitMsb0ToBinary('0'));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31597);assertBinaryEquals(
            new boolean[]{false, false, false, true}, Conversion.hexDigitMsb0ToBinary('1'));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31598);assertBinaryEquals(
            new boolean[]{false, false, true, false}, Conversion.hexDigitMsb0ToBinary('2'));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31599);assertBinaryEquals(
            new boolean[]{false, false, true, true}, Conversion.hexDigitMsb0ToBinary('3'));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31600);assertBinaryEquals(
            new boolean[]{false, true, false, false}, Conversion.hexDigitMsb0ToBinary('4'));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31601);assertBinaryEquals(
            new boolean[]{false, true, false, true}, Conversion.hexDigitMsb0ToBinary('5'));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31602);assertBinaryEquals(
            new boolean[]{false, true, true, false}, Conversion.hexDigitMsb0ToBinary('6'));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31603);assertBinaryEquals(
            new boolean[]{false, true, true, true}, Conversion.hexDigitMsb0ToBinary('7'));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31604);assertBinaryEquals(
            new boolean[]{true, false, false, false}, Conversion.hexDigitMsb0ToBinary('8'));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31605);assertBinaryEquals(
            new boolean[]{true, false, false, true}, Conversion.hexDigitMsb0ToBinary('9'));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31606);assertBinaryEquals(
            new boolean[]{true, false, true, false}, Conversion.hexDigitMsb0ToBinary('A'));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31607);assertBinaryEquals(
            new boolean[]{true, false, true, false}, Conversion.hexDigitMsb0ToBinary('a'));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31608);assertBinaryEquals(
            new boolean[]{true, false, true, true}, Conversion.hexDigitMsb0ToBinary('B'));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31609);assertBinaryEquals(
            new boolean[]{true, false, true, true}, Conversion.hexDigitMsb0ToBinary('b'));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31610);assertBinaryEquals(
            new boolean[]{true, true, false, false}, Conversion.hexDigitMsb0ToBinary('C'));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31611);assertBinaryEquals(
            new boolean[]{true, true, false, false}, Conversion.hexDigitMsb0ToBinary('c'));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31612);assertBinaryEquals(
            new boolean[]{true, true, false, true}, Conversion.hexDigitMsb0ToBinary('D'));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31613);assertBinaryEquals(
            new boolean[]{true, true, false, true}, Conversion.hexDigitMsb0ToBinary('d'));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31614);assertBinaryEquals(
            new boolean[]{true, true, true, false}, Conversion.hexDigitMsb0ToBinary('E'));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31615);assertBinaryEquals(
            new boolean[]{true, true, true, false}, Conversion.hexDigitMsb0ToBinary('e'));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31616);assertBinaryEquals(
            new boolean[]{true, true, true, true}, Conversion.hexDigitMsb0ToBinary('F'));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31617);assertBinaryEquals(
            new boolean[]{true, true, true, true}, Conversion.hexDigitMsb0ToBinary('f'));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31618);try {
            __CLR4_5_2obhobhlvha7ft6.R.inc(31619);Conversion.hexDigitMsb0ToBinary('G');
            __CLR4_5_2obhobhlvha7ft6.R.inc(31620);fail("Thrown " + IllegalArgumentException.class.getName() + " expected");
        } catch (final IllegalArgumentException e) {
            // OK
        }
    }finally{__CLR4_5_2obhobhlvha7ft6.R.flushNeeded();}}

    /**
     * Tests {@link Conversion#binaryToHexDigit(boolean[])}.
     */
    @Test
    public void testBinaryToHexDigit() {__CLR4_5_2obhobhlvha7ft6.R.globalSliceStart(getClass().getName(),31621);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2kqfhhjoed();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2obhobhlvha7ft6.R.rethrow($CLV_t2$);}finally{__CLR4_5_2obhobhlvha7ft6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ConversionTest.testBinaryToHexDigit",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),31621,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2kqfhhjoed(){try{__CLR4_5_2obhobhlvha7ft6.R.inc(31621);
        __CLR4_5_2obhobhlvha7ft6.R.inc(31622);assertEquals(
            '0', Conversion.binaryToHexDigit(new boolean[]{false, false, false, false}));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31623);assertEquals('1', Conversion.binaryToHexDigit(new boolean[]{true, false, false, false}));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31624);assertEquals('2', Conversion.binaryToHexDigit(new boolean[]{false, true, false, false}));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31625);assertEquals('3', Conversion.binaryToHexDigit(new boolean[]{true, true, false, false}));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31626);assertEquals('4', Conversion.binaryToHexDigit(new boolean[]{false, false, true, false}));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31627);assertEquals('5', Conversion.binaryToHexDigit(new boolean[]{true, false, true, false}));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31628);assertEquals('6', Conversion.binaryToHexDigit(new boolean[]{false, true, true, false}));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31629);assertEquals('7', Conversion.binaryToHexDigit(new boolean[]{true, true, true, false}));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31630);assertEquals('8', Conversion.binaryToHexDigit(new boolean[]{false, false, false, true}));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31631);assertEquals('9', Conversion.binaryToHexDigit(new boolean[]{true, false, false, true}));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31632);assertEquals('a', Conversion.binaryToHexDigit(new boolean[]{false, true, false, true}));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31633);assertEquals('b', Conversion.binaryToHexDigit(new boolean[]{true, true, false, true}));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31634);assertEquals('c', Conversion.binaryToHexDigit(new boolean[]{false, false, true, true}));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31635);assertEquals('d', Conversion.binaryToHexDigit(new boolean[]{true, false, true, true}));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31636);assertEquals('e', Conversion.binaryToHexDigit(new boolean[]{false, true, true, true}));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31637);assertEquals('f', Conversion.binaryToHexDigit(new boolean[]{true, true, true, true}));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31638);assertEquals('1', Conversion.binaryToHexDigit(new boolean[]{true}));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31639);assertEquals(
            'f', Conversion.binaryToHexDigit(new boolean[]{true, true, true, true, true}));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31640);try {
            __CLR4_5_2obhobhlvha7ft6.R.inc(31641);Conversion.binaryToHexDigit(new boolean[]{});
            __CLR4_5_2obhobhlvha7ft6.R.inc(31642);fail("Thrown " + IllegalArgumentException.class.getName() + " expected");
        } catch (final IllegalArgumentException e) {
            // OK
        }
    }finally{__CLR4_5_2obhobhlvha7ft6.R.flushNeeded();}}

    /**
     * Tests {@link Conversion#binaryBeMsb0ToHexDigit(boolean[], int)}.
     */
    @Test
    public void testBinaryToHexDigit_2args() {__CLR4_5_2obhobhlvha7ft6.R.globalSliceStart(getClass().getName(),31643);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2yy859loez();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2obhobhlvha7ft6.R.rethrow($CLV_t2$);}finally{__CLR4_5_2obhobhlvha7ft6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ConversionTest.testBinaryToHexDigit_2args",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),31643,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2yy859loez(){try{__CLR4_5_2obhobhlvha7ft6.R.inc(31643);
        __CLR4_5_2obhobhlvha7ft6.R.inc(31644);final boolean[] shortArray = new boolean[]{false, true, true};
        __CLR4_5_2obhobhlvha7ft6.R.inc(31645);assertEquals('6', Conversion.binaryToHexDigit(shortArray, 0));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31646);assertEquals('3', Conversion.binaryToHexDigit(shortArray, 1));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31647);assertEquals('1', Conversion.binaryToHexDigit(shortArray, 2));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31648);final boolean[] longArray = new boolean[]{true, false, true, false, false, true, true};
        __CLR4_5_2obhobhlvha7ft6.R.inc(31649);assertEquals('5', Conversion.binaryToHexDigit(longArray, 0));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31650);assertEquals('2', Conversion.binaryToHexDigit(longArray, 1));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31651);assertEquals('9', Conversion.binaryToHexDigit(longArray, 2));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31652);assertEquals('c', Conversion.binaryToHexDigit(longArray, 3));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31653);assertEquals('6', Conversion.binaryToHexDigit(longArray, 4));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31654);assertEquals('3', Conversion.binaryToHexDigit(longArray, 5));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31655);assertEquals('1', Conversion.binaryToHexDigit(longArray, 6));
    }finally{__CLR4_5_2obhobhlvha7ft6.R.flushNeeded();}}

    /**
     * Tests {@link Conversion#binaryToHexDigitMsb0_4bits(boolean[])}.
     */
    @Test
    public void testBinaryToHexDigitMsb0_bits() {__CLR4_5_2obhobhlvha7ft6.R.globalSliceStart(getClass().getName(),31656);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ktc8oofc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2obhobhlvha7ft6.R.rethrow($CLV_t2$);}finally{__CLR4_5_2obhobhlvha7ft6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ConversionTest.testBinaryToHexDigitMsb0_bits",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),31656,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ktc8oofc(){try{__CLR4_5_2obhobhlvha7ft6.R.inc(31656);
        __CLR4_5_2obhobhlvha7ft6.R.inc(31657);assertEquals(
            '0',
            Conversion.binaryToHexDigitMsb0_4bits(new boolean[]{false, false, false, false}));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31658);assertEquals(
            '1',
            Conversion.binaryToHexDigitMsb0_4bits(new boolean[]{false, false, false, true}));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31659);assertEquals(
            '2',
            Conversion.binaryToHexDigitMsb0_4bits(new boolean[]{false, false, true, false}));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31660);assertEquals(
            '3', Conversion.binaryToHexDigitMsb0_4bits(new boolean[]{false, false, true, true}));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31661);assertEquals(
            '4',
            Conversion.binaryToHexDigitMsb0_4bits(new boolean[]{false, true, false, false}));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31662);assertEquals(
            '5', Conversion.binaryToHexDigitMsb0_4bits(new boolean[]{false, true, false, true}));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31663);assertEquals(
            '6', Conversion.binaryToHexDigitMsb0_4bits(new boolean[]{false, true, true, false}));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31664);assertEquals(
            '7', Conversion.binaryToHexDigitMsb0_4bits(new boolean[]{false, true, true, true}));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31665);assertEquals(
            '8',
            Conversion.binaryToHexDigitMsb0_4bits(new boolean[]{true, false, false, false}));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31666);assertEquals(
            '9', Conversion.binaryToHexDigitMsb0_4bits(new boolean[]{true, false, false, true}));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31667);assertEquals(
            'a', Conversion.binaryToHexDigitMsb0_4bits(new boolean[]{true, false, true, false}));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31668);assertEquals(
            'b', Conversion.binaryToHexDigitMsb0_4bits(new boolean[]{true, false, true, true}));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31669);assertEquals(
            'c', Conversion.binaryToHexDigitMsb0_4bits(new boolean[]{true, true, false, false}));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31670);assertEquals(
            'd', Conversion.binaryToHexDigitMsb0_4bits(new boolean[]{true, true, false, true}));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31671);assertEquals(
            'e', Conversion.binaryToHexDigitMsb0_4bits(new boolean[]{true, true, true, false}));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31672);assertEquals(
            'f', Conversion.binaryToHexDigitMsb0_4bits(new boolean[]{true, true, true, true}));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31673);try {
            __CLR4_5_2obhobhlvha7ft6.R.inc(31674);Conversion.binaryToHexDigitMsb0_4bits(new boolean[]{});
            __CLR4_5_2obhobhlvha7ft6.R.inc(31675);fail("Thrown " + IllegalArgumentException.class.getName() + " expected");
        } catch (final IllegalArgumentException e) {
            // OK
        }
    }finally{__CLR4_5_2obhobhlvha7ft6.R.flushNeeded();}}

    /**
     * Tests {@link Conversion#binaryToHexDigitMsb0_4bits(boolean[], int)}.
     */
    @Test
    public void testBinaryToHexDigitMsb0_4bits_2args() {__CLR4_5_2obhobhlvha7ft6.R.globalSliceStart(getClass().getName(),31676);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22r60jeofw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2obhobhlvha7ft6.R.rethrow($CLV_t2$);}finally{__CLR4_5_2obhobhlvha7ft6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ConversionTest.testBinaryToHexDigitMsb0_4bits_2args",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),31676,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22r60jeofw(){try{__CLR4_5_2obhobhlvha7ft6.R.inc(31676);
        // boolean[] shortArray = new boolean[]{true,true,false};
        // assertEquals('6', Conversion.BinaryToHexDigitMsb0(shortArray,0));
        // assertEquals('3', Conversion.BinaryToHexDigitMsb0(shortArray,1));
        // assertEquals('1', Conversion.BinaryToHexDigitMsb0(shortArray,2));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31677);final boolean[] shortArray = new boolean[]{true, true, false, true};
        __CLR4_5_2obhobhlvha7ft6.R.inc(31678);assertEquals('d', Conversion.binaryToHexDigitMsb0_4bits(shortArray, 0));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31679);final boolean[] longArray = new boolean[]{true, false, true, false, false, true, true};
        __CLR4_5_2obhobhlvha7ft6.R.inc(31680);assertEquals('a', Conversion.binaryToHexDigitMsb0_4bits(longArray, 0));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31681);assertEquals('4', Conversion.binaryToHexDigitMsb0_4bits(longArray, 1));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31682);assertEquals('9', Conversion.binaryToHexDigitMsb0_4bits(longArray, 2));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31683);assertEquals('3', Conversion.binaryToHexDigitMsb0_4bits(longArray, 3));
        // assertEquals('6', Conversion.BinaryToHexDigitMsb0(longArray,4));
        // assertEquals('3', Conversion.BinaryToHexDigitMsb0(longArray,5));
        // assertEquals('1', Conversion.BinaryToHexDigitMsb0(longArray,6));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31684);final boolean[] maxLengthArray = new boolean[]{
            true, false, true, false, false, true, true, true};
        __CLR4_5_2obhobhlvha7ft6.R.inc(31685);assertEquals('a', Conversion.binaryToHexDigitMsb0_4bits(maxLengthArray, 0));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31686);assertEquals('4', Conversion.binaryToHexDigitMsb0_4bits(maxLengthArray, 1));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31687);assertEquals('9', Conversion.binaryToHexDigitMsb0_4bits(maxLengthArray, 2));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31688);assertEquals('3', Conversion.binaryToHexDigitMsb0_4bits(maxLengthArray, 3));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31689);assertEquals('7', Conversion.binaryToHexDigitMsb0_4bits(maxLengthArray, 4));
        // assertEquals('7', Conversion.BinaryToHexDigitMsb0(longArray,5));
        // assertEquals('3', Conversion.BinaryToHexDigitMsb0(longArray,6));
        // assertEquals('1', Conversion.BinaryToHexDigitMsb0(longArray,7));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31690);final boolean[] javaDocCheck = new boolean[]{
            true, false, false, true, true, false, true, false};
        __CLR4_5_2obhobhlvha7ft6.R.inc(31691);assertEquals('d', Conversion.binaryToHexDigitMsb0_4bits(javaDocCheck, 3));

    }finally{__CLR4_5_2obhobhlvha7ft6.R.flushNeeded();}}

    /**
     * Tests {@link Conversion#binaryToHexDigit(boolean[])}.
     */
    @Test
    public void testBinaryBeMsb0ToHexDigit() {__CLR4_5_2obhobhlvha7ft6.R.globalSliceStart(getClass().getName(),31692);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2x3owpqogc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2obhobhlvha7ft6.R.rethrow($CLV_t2$);}finally{__CLR4_5_2obhobhlvha7ft6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ConversionTest.testBinaryBeMsb0ToHexDigit",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),31692,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2x3owpqogc(){try{__CLR4_5_2obhobhlvha7ft6.R.inc(31692);
        __CLR4_5_2obhobhlvha7ft6.R.inc(31693);assertEquals(
            '0', Conversion.binaryBeMsb0ToHexDigit(new boolean[]{false, false, false, false}));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31694);assertEquals(
            '1', Conversion.binaryBeMsb0ToHexDigit(new boolean[]{false, false, false, true}));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31695);assertEquals(
            '2', Conversion.binaryBeMsb0ToHexDigit(new boolean[]{false, false, true, false}));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31696);assertEquals(
            '3', Conversion.binaryBeMsb0ToHexDigit(new boolean[]{false, false, true, true}));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31697);assertEquals(
            '4', Conversion.binaryBeMsb0ToHexDigit(new boolean[]{false, true, false, false}));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31698);assertEquals(
            '5', Conversion.binaryBeMsb0ToHexDigit(new boolean[]{false, true, false, true}));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31699);assertEquals(
            '6', Conversion.binaryBeMsb0ToHexDigit(new boolean[]{false, true, true, false}));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31700);assertEquals(
            '7', Conversion.binaryBeMsb0ToHexDigit(new boolean[]{false, true, true, true}));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31701);assertEquals(
            '8', Conversion.binaryBeMsb0ToHexDigit(new boolean[]{true, false, false, false}));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31702);assertEquals(
            '9', Conversion.binaryBeMsb0ToHexDigit(new boolean[]{true, false, false, true}));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31703);assertEquals(
            'a', Conversion.binaryBeMsb0ToHexDigit(new boolean[]{true, false, true, false}));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31704);assertEquals(
            'b', Conversion.binaryBeMsb0ToHexDigit(new boolean[]{true, false, true, true}));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31705);assertEquals(
            'c', Conversion.binaryBeMsb0ToHexDigit(new boolean[]{true, true, false, false}));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31706);assertEquals(
            'd', Conversion.binaryBeMsb0ToHexDigit(new boolean[]{true, true, false, true}));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31707);assertEquals(
            'e', Conversion.binaryBeMsb0ToHexDigit(new boolean[]{true, true, true, false}));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31708);assertEquals(
            'f', Conversion.binaryBeMsb0ToHexDigit(new boolean[]{true, true, true, true}));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31709);assertEquals(
            '4',
            Conversion.binaryBeMsb0ToHexDigit(new boolean[]{
                true, false, false, false, false, false, false, false, false, false, false,
                false, false, true, false, false}));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31710);try {
            __CLR4_5_2obhobhlvha7ft6.R.inc(31711);Conversion.binaryBeMsb0ToHexDigit(new boolean[]{});
            __CLR4_5_2obhobhlvha7ft6.R.inc(31712);fail("Thrown " + IllegalArgumentException.class.getName() + " expected");
        } catch (final IllegalArgumentException e) {
            // OK
        }
    }finally{__CLR4_5_2obhobhlvha7ft6.R.flushNeeded();}}

    /**
     * Tests {@link Conversion#binaryToHexDigit(boolean[], int)}.
     */
    @Test
    public void testBinaryBeMsb0ToHexDigit_2args() {__CLR4_5_2obhobhlvha7ft6.R.globalSliceStart(getClass().getName(),31713);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21005uaogx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2obhobhlvha7ft6.R.rethrow($CLV_t2$);}finally{__CLR4_5_2obhobhlvha7ft6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ConversionTest.testBinaryBeMsb0ToHexDigit_2args",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),31713,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21005uaogx(){try{__CLR4_5_2obhobhlvha7ft6.R.inc(31713);
        __CLR4_5_2obhobhlvha7ft6.R.inc(31714);assertEquals(
            '5',
            Conversion.binaryBeMsb0ToHexDigit(new boolean[]{
                true, false, false, false, false, false, false, false, false, false, false,
                true, false, true, false, false}, 2));

        __CLR4_5_2obhobhlvha7ft6.R.inc(31715);final boolean[] shortArray = new boolean[]{true, true, false};
        __CLR4_5_2obhobhlvha7ft6.R.inc(31716);assertEquals('6', Conversion.binaryBeMsb0ToHexDigit(shortArray, 0));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31717);assertEquals('3', Conversion.binaryBeMsb0ToHexDigit(shortArray, 1));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31718);assertEquals('1', Conversion.binaryBeMsb0ToHexDigit(shortArray, 2));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31719);final boolean[] shortArray2 = new boolean[]{true, true, true, false, false, true, false, true};
        __CLR4_5_2obhobhlvha7ft6.R.inc(31720);assertEquals('5', Conversion.binaryBeMsb0ToHexDigit(shortArray2, 0));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31721);assertEquals('2', Conversion.binaryBeMsb0ToHexDigit(shortArray2, 1));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31722);assertEquals('9', Conversion.binaryBeMsb0ToHexDigit(shortArray2, 2));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31723);assertEquals('c', Conversion.binaryBeMsb0ToHexDigit(shortArray2, 3));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31724);assertEquals('e', Conversion.binaryBeMsb0ToHexDigit(shortArray2, 4));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31725);assertEquals('7', Conversion.binaryBeMsb0ToHexDigit(shortArray2, 5));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31726);assertEquals('3', Conversion.binaryBeMsb0ToHexDigit(shortArray2, 6));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31727);assertEquals('1', Conversion.binaryBeMsb0ToHexDigit(shortArray2, 7));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31728);final boolean[] multiBytesArray = new boolean[]{
            true, true, false, false, true, false, true, false, true, true, true, false, false,
            true, false, true};
        __CLR4_5_2obhobhlvha7ft6.R.inc(31729);assertEquals('5', Conversion.binaryBeMsb0ToHexDigit(multiBytesArray, 0));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31730);assertEquals('2', Conversion.binaryBeMsb0ToHexDigit(multiBytesArray, 1));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31731);assertEquals('9', Conversion.binaryBeMsb0ToHexDigit(multiBytesArray, 2));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31732);assertEquals('c', Conversion.binaryBeMsb0ToHexDigit(multiBytesArray, 3));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31733);assertEquals('e', Conversion.binaryBeMsb0ToHexDigit(multiBytesArray, 4));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31734);assertEquals('7', Conversion.binaryBeMsb0ToHexDigit(multiBytesArray, 5));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31735);assertEquals('b', Conversion.binaryBeMsb0ToHexDigit(multiBytesArray, 6));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31736);assertEquals('5', Conversion.binaryBeMsb0ToHexDigit(multiBytesArray, 7));

        __CLR4_5_2obhobhlvha7ft6.R.inc(31737);assertEquals('a', Conversion.binaryBeMsb0ToHexDigit(multiBytesArray, 8));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31738);assertEquals('5', Conversion.binaryBeMsb0ToHexDigit(multiBytesArray, 9));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31739);assertEquals('2', Conversion.binaryBeMsb0ToHexDigit(multiBytesArray, 10));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31740);assertEquals('9', Conversion.binaryBeMsb0ToHexDigit(multiBytesArray, 11));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31741);assertEquals('c', Conversion.binaryBeMsb0ToHexDigit(multiBytesArray, 12));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31742);assertEquals('6', Conversion.binaryBeMsb0ToHexDigit(multiBytesArray, 13));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31743);assertEquals('3', Conversion.binaryBeMsb0ToHexDigit(multiBytesArray, 14));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31744);assertEquals('1', Conversion.binaryBeMsb0ToHexDigit(multiBytesArray, 15));

    }finally{__CLR4_5_2obhobhlvha7ft6.R.flushNeeded();}}

    /**
     * Tests {@link Conversion#intToHexDigit(int)}.
     */
    @Test
    public void testIntToHexDigit() {__CLR4_5_2obhobhlvha7ft6.R.globalSliceStart(getClass().getName(),31745);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vngdhtoht();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2obhobhlvha7ft6.R.rethrow($CLV_t2$);}finally{__CLR4_5_2obhobhlvha7ft6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ConversionTest.testIntToHexDigit",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),31745,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vngdhtoht(){try{__CLR4_5_2obhobhlvha7ft6.R.inc(31745);
        __CLR4_5_2obhobhlvha7ft6.R.inc(31746);assertEquals('0', Conversion.intToHexDigit(0));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31747);assertEquals('1', Conversion.intToHexDigit(1));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31748);assertEquals('2', Conversion.intToHexDigit(2));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31749);assertEquals('3', Conversion.intToHexDigit(3));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31750);assertEquals('4', Conversion.intToHexDigit(4));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31751);assertEquals('5', Conversion.intToHexDigit(5));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31752);assertEquals('6', Conversion.intToHexDigit(6));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31753);assertEquals('7', Conversion.intToHexDigit(7));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31754);assertEquals('8', Conversion.intToHexDigit(8));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31755);assertEquals('9', Conversion.intToHexDigit(9));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31756);assertEquals('a', Conversion.intToHexDigit(10));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31757);assertEquals('b', Conversion.intToHexDigit(11));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31758);assertEquals('c', Conversion.intToHexDigit(12));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31759);assertEquals('d', Conversion.intToHexDigit(13));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31760);assertEquals('e', Conversion.intToHexDigit(14));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31761);assertEquals('f', Conversion.intToHexDigit(15));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31762);try {
            __CLR4_5_2obhobhlvha7ft6.R.inc(31763);Conversion.intToHexDigit(16);
            __CLR4_5_2obhobhlvha7ft6.R.inc(31764);fail("Thrown " + IllegalArgumentException.class.getName() + " expected");
        } catch (final IllegalArgumentException e) {
            // OK
        }
    }finally{__CLR4_5_2obhobhlvha7ft6.R.flushNeeded();}}

    /**
     * Tests {@link Conversion#intToHexDigitMsb0(int)}.
     */
    @Test
    public void testIntToHexDigitMsb0() {__CLR4_5_2obhobhlvha7ft6.R.globalSliceStart(getClass().getName(),31765);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2oje9qzoid();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2obhobhlvha7ft6.R.rethrow($CLV_t2$);}finally{__CLR4_5_2obhobhlvha7ft6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ConversionTest.testIntToHexDigitMsb0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),31765,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2oje9qzoid(){try{__CLR4_5_2obhobhlvha7ft6.R.inc(31765);
        __CLR4_5_2obhobhlvha7ft6.R.inc(31766);assertEquals('0', Conversion.intToHexDigitMsb0(0));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31767);assertEquals('8', Conversion.intToHexDigitMsb0(1));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31768);assertEquals('4', Conversion.intToHexDigitMsb0(2));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31769);assertEquals('c', Conversion.intToHexDigitMsb0(3));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31770);assertEquals('2', Conversion.intToHexDigitMsb0(4));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31771);assertEquals('a', Conversion.intToHexDigitMsb0(5));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31772);assertEquals('6', Conversion.intToHexDigitMsb0(6));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31773);assertEquals('e', Conversion.intToHexDigitMsb0(7));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31774);assertEquals('1', Conversion.intToHexDigitMsb0(8));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31775);assertEquals('9', Conversion.intToHexDigitMsb0(9));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31776);assertEquals('5', Conversion.intToHexDigitMsb0(10));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31777);assertEquals('d', Conversion.intToHexDigitMsb0(11));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31778);assertEquals('3', Conversion.intToHexDigitMsb0(12));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31779);assertEquals('b', Conversion.intToHexDigitMsb0(13));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31780);assertEquals('7', Conversion.intToHexDigitMsb0(14));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31781);assertEquals('f', Conversion.intToHexDigitMsb0(15));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31782);try {
            __CLR4_5_2obhobhlvha7ft6.R.inc(31783);Conversion.intToHexDigitMsb0(16);
            __CLR4_5_2obhobhlvha7ft6.R.inc(31784);fail("Thrown " + IllegalArgumentException.class.getName() + " expected");
        } catch (final IllegalArgumentException e) {
            // OK
        }
    }finally{__CLR4_5_2obhobhlvha7ft6.R.flushNeeded();}}

    static String dbgPrint(final boolean[] src) {try{__CLR4_5_2obhobhlvha7ft6.R.inc(31785);
        __CLR4_5_2obhobhlvha7ft6.R.inc(31786);final StringBuilder sb = new StringBuilder();
        __CLR4_5_2obhobhlvha7ft6.R.inc(31787);for (final boolean e : src) {{
            __CLR4_5_2obhobhlvha7ft6.R.inc(31788);if ((((e)&&(__CLR4_5_2obhobhlvha7ft6.R.iget(31789)!=0|true))||(__CLR4_5_2obhobhlvha7ft6.R.iget(31790)==0&false))) {{
                __CLR4_5_2obhobhlvha7ft6.R.inc(31791);sb.append("1,");
            } }else {{
                __CLR4_5_2obhobhlvha7ft6.R.inc(31792);sb.append("0,");
            }
        }}
        }__CLR4_5_2obhobhlvha7ft6.R.inc(31793);final String out = sb.toString();
        __CLR4_5_2obhobhlvha7ft6.R.inc(31794);return out.substring(0, out.length() - 1);
    }finally{__CLR4_5_2obhobhlvha7ft6.R.flushNeeded();}}

    // org.junit.Assert(boolean[], boolean[]) does not exist in JUnit 4.2
    static void assertBinaryEquals(final boolean[] expected, final boolean[] actual) {try{__CLR4_5_2obhobhlvha7ft6.R.inc(31795);
        __CLR4_5_2obhobhlvha7ft6.R.inc(31796);assertEquals(expected.length, actual.length);
        __CLR4_5_2obhobhlvha7ft6.R.inc(31797);for (int i = 0; (((i < expected.length)&&(__CLR4_5_2obhobhlvha7ft6.R.iget(31798)!=0|true))||(__CLR4_5_2obhobhlvha7ft6.R.iget(31799)==0&false)); i++ ) {{
            __CLR4_5_2obhobhlvha7ft6.R.inc(31800);try {
                __CLR4_5_2obhobhlvha7ft6.R.inc(31801);assertEquals(expected[i], actual[i]);
            } catch (final Throwable e) {
                __CLR4_5_2obhobhlvha7ft6.R.inc(31802);final String msg = "Mismatch at index "
                    + i
                    + " between:\n"
                    + dbgPrint(expected)
                    + " and\n"
                    + dbgPrint(actual);
                __CLR4_5_2obhobhlvha7ft6.R.inc(31803);fail(msg + "\n" + e.getMessage());
            }
        }
    }}finally{__CLR4_5_2obhobhlvha7ft6.R.flushNeeded();}}

    /**
     * Tests {@link Conversion#intArrayToLong(int[], int, long, int, int)}.
     */
    @Test
    public void testIntArrayToLong() {__CLR4_5_2obhobhlvha7ft6.R.globalSliceStart(getClass().getName(),31804);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2lsxm2iojg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2obhobhlvha7ft6.R.rethrow($CLV_t2$);}finally{__CLR4_5_2obhobhlvha7ft6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ConversionTest.testIntArrayToLong",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),31804,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2lsxm2iojg(){try{__CLR4_5_2obhobhlvha7ft6.R.inc(31804);
        __CLR4_5_2obhobhlvha7ft6.R.inc(31805);final int[] src = new int[]{0xCDF1F0C1, 0x0F123456, 0x78000000};
        __CLR4_5_2obhobhlvha7ft6.R.inc(31806);assertEquals(0x0000000000000000L, Conversion.intArrayToLong(src, 0, 0L, 0, 0));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31807);assertEquals(0x0000000000000000L, Conversion.intArrayToLong(src, 1, 0L, 0, 0));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31808);assertEquals(0x00000000CDF1F0C1L, Conversion.intArrayToLong(src, 0, 0L, 0, 1));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31809);assertEquals(0x0F123456CDF1F0C1L, Conversion.intArrayToLong(src, 0, 0L, 0, 2));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31810);assertEquals(0x000000000F123456L, Conversion.intArrayToLong(src, 1, 0L, 0, 1));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31811);assertEquals(
            0x123456789ABCDEF0L, Conversion.intArrayToLong(src, 0, 0x123456789ABCDEF0L, 0, 0));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31812);assertEquals(
            0x1234567878000000L, Conversion.intArrayToLong(src, 2, 0x123456789ABCDEF0L, 0, 1));
        // assertEquals(0x0F12345678000000L,Conversion.intsToLong(src,1,0x123456789ABCDEF0L,32,2));
    }finally{__CLR4_5_2obhobhlvha7ft6.R.flushNeeded();}}

    /**
     * Tests {@link Conversion#shortArrayToLong(short[], int, long, int, int)}.
     */
    @Test
    public void testShortArrayToLong() {__CLR4_5_2obhobhlvha7ft6.R.globalSliceStart(getClass().getName(),31813);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2627q8jojp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2obhobhlvha7ft6.R.rethrow($CLV_t2$);}finally{__CLR4_5_2obhobhlvha7ft6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ConversionTest.testShortArrayToLong",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),31813,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2627q8jojp(){try{__CLR4_5_2obhobhlvha7ft6.R.inc(31813);
        __CLR4_5_2obhobhlvha7ft6.R.inc(31814);final short[] src = new short[]{
            (short)0xCDF1, (short)0xF0C1, (short)0x0F12, (short)0x3456, (short)0x7800};
        __CLR4_5_2obhobhlvha7ft6.R.inc(31815);assertEquals(0x0000000000000000L, Conversion.shortArrayToLong(src, 0, 0L, 0, 0));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31816);assertEquals(0x000000000000CDF1L, Conversion.shortArrayToLong(src, 0, 0L, 0, 1));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31817);assertEquals(0x00000000F0C1CDF1L, Conversion.shortArrayToLong(src, 0, 0L, 0, 2));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31818);assertEquals(0x780034560F12F0C1L, Conversion.shortArrayToLong(src, 1, 0L, 0, 4));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31819);assertEquals(
            0x123456789ABCDEF0L, Conversion.shortArrayToLong(src, 0, 0x123456789ABCDEF0L, 0, 0));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31820);assertEquals(
            0x123456CDF1BCDEF0L,
            Conversion.shortArrayToLong(src, 0, 0x123456789ABCDEF0L, 24, 1));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31821);assertEquals(
            0x123478003456DEF0L,
            Conversion.shortArrayToLong(src, 3, 0x123456789ABCDEF0L, 16, 2));
    }finally{__CLR4_5_2obhobhlvha7ft6.R.flushNeeded();}}

    /**
     * Tests {@link Conversion#byteArrayToLong(byte[], int, long, int, int)}.
     */
    @Test
    public void testByteArrayToLong() {__CLR4_5_2obhobhlvha7ft6.R.globalSliceStart(getClass().getName(),31822);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2cnqipvojy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2obhobhlvha7ft6.R.rethrow($CLV_t2$);}finally{__CLR4_5_2obhobhlvha7ft6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ConversionTest.testByteArrayToLong",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),31822,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2cnqipvojy(){try{__CLR4_5_2obhobhlvha7ft6.R.inc(31822);
        __CLR4_5_2obhobhlvha7ft6.R.inc(31823);final byte[] src = new byte[]{
            (byte)0xCD, (byte)0xF1, (byte)0xF0, (byte)0xC1, (byte)0x0F, (byte)0x12, (byte)0x34,
            (byte)0x56, (byte)0x78};
        __CLR4_5_2obhobhlvha7ft6.R.inc(31824);assertEquals(0x0000000000000000L, Conversion.byteArrayToLong(src, 0, 0L, 0, 0));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31825);assertEquals(0x00000000000000CDL, Conversion.byteArrayToLong(src, 0, 0L, 0, 1));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31826);assertEquals(0x00000000C1F0F1CDL, Conversion.byteArrayToLong(src, 0, 0L, 0, 4));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31827);assertEquals(0x000000000FC1F0F1L, Conversion.byteArrayToLong(src, 1, 0L, 0, 4));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31828);assertEquals(
            0x123456789ABCDEF0L, Conversion.byteArrayToLong(src, 0, 0x123456789ABCDEF0L, 0, 0));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31829);assertEquals(
            0x12345678CDBCDEF0L, Conversion.byteArrayToLong(src, 0, 0x123456789ABCDEF0L, 24, 1));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31830);assertEquals(
            0x123456789A7856F0L, Conversion.byteArrayToLong(src, 7, 0x123456789ABCDEF0L, 8, 2));
    }finally{__CLR4_5_2obhobhlvha7ft6.R.flushNeeded();}}

    /**
     * Tests {@link Conversion#shortArrayToInt(short[], int, int, int, int)}.
     */
    @Test
    public void testShortArrayToInt() {__CLR4_5_2obhobhlvha7ft6.R.globalSliceStart(getClass().getName(),31831);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21s49asok7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2obhobhlvha7ft6.R.rethrow($CLV_t2$);}finally{__CLR4_5_2obhobhlvha7ft6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ConversionTest.testShortArrayToInt",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),31831,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21s49asok7(){try{__CLR4_5_2obhobhlvha7ft6.R.inc(31831);
        __CLR4_5_2obhobhlvha7ft6.R.inc(31832);final short[] src = new short[]{
            (short)0xCDF1, (short)0xF0C1, (short)0x0F12, (short)0x3456, (short)0x7800};
        __CLR4_5_2obhobhlvha7ft6.R.inc(31833);assertEquals(0x00000000, Conversion.shortArrayToInt(src, 0, 0, 0, 0));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31834);assertEquals(0x0000CDF1, Conversion.shortArrayToInt(src, 0, 0, 0, 1));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31835);assertEquals(0xF0C1CDF1, Conversion.shortArrayToInt(src, 0, 0, 0, 2));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31836);assertEquals(0x0F12F0C1, Conversion.shortArrayToInt(src, 1, 0, 0, 2));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31837);assertEquals(0x12345678, Conversion.shortArrayToInt(src, 0, 0x12345678, 0, 0));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31838);assertEquals(0xCDF15678, Conversion.shortArrayToInt(src, 0, 0x12345678, 16, 1));
        // assertEquals(0x34567800,Conversion.ShortArrayToInt(src, 3, 0x12345678, 16, 2));
    }finally{__CLR4_5_2obhobhlvha7ft6.R.flushNeeded();}}

    /**
     * Tests {@link Conversion#byteArrayToInt(byte[], int, int, int, int)}.
     */
    @Test
    public void testByteArrayToInt() {__CLR4_5_2obhobhlvha7ft6.R.globalSliceStart(getClass().getName(),31839);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27663z0okf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2obhobhlvha7ft6.R.rethrow($CLV_t2$);}finally{__CLR4_5_2obhobhlvha7ft6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ConversionTest.testByteArrayToInt",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),31839,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27663z0okf(){try{__CLR4_5_2obhobhlvha7ft6.R.inc(31839);
        __CLR4_5_2obhobhlvha7ft6.R.inc(31840);final byte[] src = new byte[]{
            (byte)0xCD, (byte)0xF1, (byte)0xF0, (byte)0xC1, (byte)0x0F, (byte)0x12, (byte)0x34,
            (byte)0x56, (byte)0x78};
        __CLR4_5_2obhobhlvha7ft6.R.inc(31841);assertEquals(0x00000000, Conversion.byteArrayToInt(src, 0, 0, 0, 0));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31842);assertEquals(0x000000CD, Conversion.byteArrayToInt(src, 0, 0, 0, 1));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31843);assertEquals(0xC1F0F1CD, Conversion.byteArrayToInt(src, 0, 0, 0, 4));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31844);assertEquals(0x0FC1F0F1, Conversion.byteArrayToInt(src, 1, 0, 0, 4));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31845);assertEquals(0x12345678, Conversion.byteArrayToInt(src, 0, 0x12345678, 0, 0));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31846);assertEquals(0xCD345678, Conversion.byteArrayToInt(src, 0, 0x12345678, 24, 1));
        // assertEquals(0x56341278,Conversion.ByteArrayToInt(src, 5, 0x01234567, 8, 4));
    }finally{__CLR4_5_2obhobhlvha7ft6.R.flushNeeded();}}

    /**
     * Tests {@link Conversion#byteArrayToShort(byte[], int, short, int, int)}.
     */
    @Test
    public void testByteArrayToShort() {__CLR4_5_2obhobhlvha7ft6.R.globalSliceStart(getClass().getName(),31847);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_212zlzdokn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2obhobhlvha7ft6.R.rethrow($CLV_t2$);}finally{__CLR4_5_2obhobhlvha7ft6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ConversionTest.testByteArrayToShort",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),31847,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_212zlzdokn(){try{__CLR4_5_2obhobhlvha7ft6.R.inc(31847);
        __CLR4_5_2obhobhlvha7ft6.R.inc(31848);final byte[] src = new byte[]{
            (byte)0xCD, (byte)0xF1, (byte)0xF0, (byte)0xC1, (byte)0x0F, (byte)0x12, (byte)0x34,
            (byte)0x56, (byte)0x78};
        __CLR4_5_2obhobhlvha7ft6.R.inc(31849);assertEquals((short)0x0000, Conversion.byteArrayToShort(src, 0, (short)0, 0, 0));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31850);assertEquals((short)0x00CD, Conversion.byteArrayToShort(src, 0, (short)0, 0, 1));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31851);assertEquals((short)0xF1CD, Conversion.byteArrayToShort(src, 0, (short)0, 0, 2));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31852);assertEquals((short)0xF0F1, Conversion.byteArrayToShort(src, 1, (short)0, 0, 2));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31853);assertEquals((short)0x1234, Conversion.byteArrayToShort(src, 0, (short)0x1234, 0, 0));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31854);assertEquals((short)0xCD34, Conversion.byteArrayToShort(src, 0, (short)0x1234, 8, 1));
        // assertEquals((short)0x5678,Conversion.ByteArrayToShort(src, 7, (short) 0x0123, 8,
        // 2));
    }finally{__CLR4_5_2obhobhlvha7ft6.R.flushNeeded();}}

    /**
     * Tests {@link Conversion#hexToLong(String, int, long, int, int)}.
     */
    @Test
    public void testHexToLong() {__CLR4_5_2obhobhlvha7ft6.R.globalSliceStart(getClass().getName(),31855);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2oievdzokv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2obhobhlvha7ft6.R.rethrow($CLV_t2$);}finally{__CLR4_5_2obhobhlvha7ft6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ConversionTest.testHexToLong",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),31855,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2oievdzokv(){try{__CLR4_5_2obhobhlvha7ft6.R.inc(31855);
        __CLR4_5_2obhobhlvha7ft6.R.inc(31856);final String src = "CDF1F0C10F12345678";
        __CLR4_5_2obhobhlvha7ft6.R.inc(31857);assertEquals(0x0000000000000000L, Conversion.hexToLong(src, 0, 0L, 0, 0));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31858);assertEquals(0x000000000000000CL, Conversion.hexToLong(src, 0, 0L, 0, 1));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31859);assertEquals(0x000000001C0F1FDCL, Conversion.hexToLong(src, 0, 0L, 0, 8));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31860);assertEquals(0x0000000001C0F1FDL, Conversion.hexToLong(src, 1, 0L, 0, 8));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31861);assertEquals(
            0x123456798ABCDEF0L, Conversion.hexToLong(src, 0, 0x123456798ABCDEF0L, 0, 0));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31862);assertEquals(
            0x1234567876BCDEF0L, Conversion.hexToLong(src, 15, 0x123456798ABCDEF0L, 24, 3));
    }finally{__CLR4_5_2obhobhlvha7ft6.R.flushNeeded();}}

    /**
     * Tests {@link Conversion#hexToInt(String, int, int, int, int)}.
     */
    @Test
    public void testHexToInt() {__CLR4_5_2obhobhlvha7ft6.R.globalSliceStart(getClass().getName(),31863);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2va7lbmol3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2obhobhlvha7ft6.R.rethrow($CLV_t2$);}finally{__CLR4_5_2obhobhlvha7ft6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ConversionTest.testHexToInt",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),31863,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2va7lbmol3(){try{__CLR4_5_2obhobhlvha7ft6.R.inc(31863);
        __CLR4_5_2obhobhlvha7ft6.R.inc(31864);final String src = "CDF1F0C10F12345678";
        __CLR4_5_2obhobhlvha7ft6.R.inc(31865);assertEquals(0x00000000, Conversion.hexToInt(src, 0, 0, 0, 0));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31866);assertEquals(0x0000000C, Conversion.hexToInt(src, 0, 0, 0, 1));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31867);assertEquals(0x1C0F1FDC, Conversion.hexToInt(src, 0, 0, 0, 8));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31868);assertEquals(0x01C0F1FD, Conversion.hexToInt(src, 1, 0, 0, 8));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31869);assertEquals(0x12345679, Conversion.hexToInt(src, 0, 0x12345679, 0, 0));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31870);assertEquals(0x87645679, Conversion.hexToInt(src, 15, 0x12345679, 20, 3));
    }finally{__CLR4_5_2obhobhlvha7ft6.R.flushNeeded();}}

    /**
     * Tests {@link Conversion#hexToShort(String, int, short, int, int)}.
     */
    @Test
    public void testHexToShort() {__CLR4_5_2obhobhlvha7ft6.R.globalSliceStart(getClass().getName(),31871);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gvtvofolb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2obhobhlvha7ft6.R.rethrow($CLV_t2$);}finally{__CLR4_5_2obhobhlvha7ft6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ConversionTest.testHexToShort",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),31871,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gvtvofolb(){try{__CLR4_5_2obhobhlvha7ft6.R.inc(31871);
        __CLR4_5_2obhobhlvha7ft6.R.inc(31872);final String src = "CDF1F0C10F12345678";
        __CLR4_5_2obhobhlvha7ft6.R.inc(31873);assertEquals((short)0x0000, Conversion.hexToShort(src, 0, (short)0, 0, 0));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31874);assertEquals((short)0x000C, Conversion.hexToShort(src, 0, (short)0, 0, 1));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31875);assertEquals((short)0x1FDC, Conversion.hexToShort(src, 0, (short)0, 0, 4));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31876);assertEquals((short)0xF1FD, Conversion.hexToShort(src, 1, (short)0, 0, 4));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31877);assertEquals((short)0x1234, Conversion.hexToShort(src, 0, (short)0x1234, 0, 0));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31878);assertEquals((short)0x8764, Conversion.hexToShort(src, 15, (short)0x1234, 4, 3));
    }finally{__CLR4_5_2obhobhlvha7ft6.R.flushNeeded();}}

    /**
     * Tests {@link Conversion#hexToByte(String, int, byte, int, int)}.
     */
    @Test
    public void testHexToByte() {__CLR4_5_2obhobhlvha7ft6.R.globalSliceStart(getClass().getName(),31879);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2fm13m5olj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2obhobhlvha7ft6.R.rethrow($CLV_t2$);}finally{__CLR4_5_2obhobhlvha7ft6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ConversionTest.testHexToByte",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),31879,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2fm13m5olj(){try{__CLR4_5_2obhobhlvha7ft6.R.inc(31879);
        __CLR4_5_2obhobhlvha7ft6.R.inc(31880);final String src = "CDF1F0C10F12345678";
        __CLR4_5_2obhobhlvha7ft6.R.inc(31881);assertEquals((byte)0x00, Conversion.hexToByte(src, 0, (byte)0, 0, 0));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31882);assertEquals((byte)0x0C, Conversion.hexToByte(src, 0, (byte)0, 0, 1));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31883);assertEquals((byte)0xDC, Conversion.hexToByte(src, 0, (byte)0, 0, 2));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31884);assertEquals((byte)0xFD, Conversion.hexToByte(src, 1, (byte)0, 0, 2));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31885);assertEquals((byte)0x34, Conversion.hexToByte(src, 0, (byte)0x34, 0, 0));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31886);assertEquals((byte)0x84, Conversion.hexToByte(src, 17, (byte)0x34, 4, 1));
    }finally{__CLR4_5_2obhobhlvha7ft6.R.flushNeeded();}}

    /**
     * Tests {@link Conversion#binaryToLong(boolean[], int, long, int, int)}.
     */
    @Test
    public void testBinaryToLong() {__CLR4_5_2obhobhlvha7ft6.R.globalSliceStart(getClass().getName(),31887);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27v4i41olr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2obhobhlvha7ft6.R.rethrow($CLV_t2$);}finally{__CLR4_5_2obhobhlvha7ft6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ConversionTest.testBinaryToLong",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),31887,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27v4i41olr(){try{__CLR4_5_2obhobhlvha7ft6.R.inc(31887);
        __CLR4_5_2obhobhlvha7ft6.R.inc(31888);final boolean[] src = new boolean[]{
            false, false, true, true, true, false, true, true, true, true, true, true, true,
            false, false, false, true, true, true, true, false, false, false, false, false,
            false, true, true, true, false, false, false, false, false, false, false, true,
            true, true, true, true, false, false, false, false, true, false, false, true, true,
            false, false, false, false, true, false, true, false, true, false, false, true,
            true, false, true, true, true, false, false, false, false, true};
        // conversion of "CDF1F0C10F12345678" by HexToBinary
        __CLR4_5_2obhobhlvha7ft6.R.inc(31889);assertEquals(0x0000000000000000L, Conversion.binaryToLong(src, 0, 0L, 0, 0));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31890);assertEquals(0x000000000000000CL, Conversion.binaryToLong(src, 0, 0L, 0, 1 * 4));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31891);assertEquals(0x000000001C0F1FDCL, Conversion.binaryToLong(src, 0, 0L, 0, 8 * 4));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31892);assertEquals(0x0000000001C0F1FDL, Conversion.binaryToLong(src, 1 * 4, 0L, 0, 8 * 4));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31893);assertEquals(
            0x123456798ABCDEF0L, Conversion.binaryToLong(src, 0, 0x123456798ABCDEF0L, 0, 0));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31894);assertEquals(
            0x1234567876BCDEF0L,
            Conversion.binaryToLong(src, 15 * 4, 0x123456798ABCDEF0L, 24, 3 * 4));
    }finally{__CLR4_5_2obhobhlvha7ft6.R.flushNeeded();}}

    /**
     * Tests {@link Conversion#binaryToInt(boolean[], int, int, int, int)}.
     */
    @Test
    public void testBinaryToInt() {__CLR4_5_2obhobhlvha7ft6.R.globalSliceStart(getClass().getName(),31895);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2cez8rsolz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2obhobhlvha7ft6.R.rethrow($CLV_t2$);}finally{__CLR4_5_2obhobhlvha7ft6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ConversionTest.testBinaryToInt",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),31895,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2cez8rsolz(){try{__CLR4_5_2obhobhlvha7ft6.R.inc(31895);
        __CLR4_5_2obhobhlvha7ft6.R.inc(31896);final boolean[] src = new boolean[]{
            false, false, true, true, true, false, true, true, true, true, true, true, true,
            false, false, false, true, true, true, true, false, false, false, false, false,
            false, true, true, true, false, false, false, false, false, false, false, true,
            true, true, true, true, false, false, false, false, true, false, false, true, true,
            false, false, false, false, true, false, true, false, true, false, false, true,
            true, false, true, true, true, false, false, false, false, true};
        // conversion of "CDF1F0C10F12345678" by HexToBinary
        __CLR4_5_2obhobhlvha7ft6.R.inc(31897);assertEquals(0x00000000, Conversion.binaryToInt(src, 0 * 4, 0, 0, 0 * 4));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31898);assertEquals(0x0000000C, Conversion.binaryToInt(src, 0 * 4, 0, 0, 1 * 4));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31899);assertEquals(0x1C0F1FDC, Conversion.binaryToInt(src, 0 * 4, 0, 0, 8 * 4));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31900);assertEquals(0x01C0F1FD, Conversion.binaryToInt(src, 1 * 4, 0, 0, 8 * 4));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31901);assertEquals(0x12345679, Conversion.binaryToInt(src, 0 * 4, 0x12345679, 0, 0 * 4));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31902);assertEquals(0x87645679, Conversion.binaryToInt(src, 15 * 4, 0x12345679, 20, 3 * 4));
    }finally{__CLR4_5_2obhobhlvha7ft6.R.flushNeeded();}}

    /**
     * Tests {@link Conversion#binaryToShort(boolean[], int, short, int, int)}.
     */
    @Test
    public void testBinaryToShort() {__CLR4_5_2obhobhlvha7ft6.R.globalSliceStart(getClass().getName(),31903);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21yb623om7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2obhobhlvha7ft6.R.rethrow($CLV_t2$);}finally{__CLR4_5_2obhobhlvha7ft6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ConversionTest.testBinaryToShort",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),31903,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21yb623om7(){try{__CLR4_5_2obhobhlvha7ft6.R.inc(31903);
        __CLR4_5_2obhobhlvha7ft6.R.inc(31904);final boolean[] src = new boolean[]{
            false, false, true, true, true, false, true, true, true, true, true, true, true,
            false, false, false, true, true, true, true, false, false, false, false, false,
            false, true, true, true, false, false, false, false, false, false, false, true,
            true, true, true, true, false, false, false, false, true, false, false, true, true,
            false, false, false, false, true, false, true, false, true, false, false, true,
            true, false, true, true, true, false, false, false, false, true};
        // conversion of "CDF1F0C10F12345678" by HexToBinary
        __CLR4_5_2obhobhlvha7ft6.R.inc(31905);assertEquals((short)0x0000, Conversion.binaryToShort(src, 0 * 4, (short)0, 0, 0 * 4));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31906);assertEquals((short)0x000C, Conversion.binaryToShort(src, 0 * 4, (short)0, 0, 1 * 4));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31907);assertEquals((short)0x1FDC, Conversion.binaryToShort(src, 0 * 4, (short)0, 0, 4 * 4));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31908);assertEquals((short)0xF1FD, Conversion.binaryToShort(src, 1 * 4, (short)0, 0, 4 * 4));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31909);assertEquals(
            (short)0x1234, Conversion.binaryToShort(src, 0 * 4, (short)0x1234, 0, 0 * 4));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31910);assertEquals(
            (short)0x8764, Conversion.binaryToShort(src, 15 * 4, (short)0x1234, 4, 3 * 4));
    }finally{__CLR4_5_2obhobhlvha7ft6.R.flushNeeded();}}

    /**
     * Tests {@link Conversion#binaryToByte(boolean[], int, byte, int, int)}.
     */
    @Test
    public void testBinaryToByte() {__CLR4_5_2obhobhlvha7ft6.R.globalSliceStart(getClass().getName(),31911);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2w9bgw3omf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2obhobhlvha7ft6.R.rethrow($CLV_t2$);}finally{__CLR4_5_2obhobhlvha7ft6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ConversionTest.testBinaryToByte",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),31911,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2w9bgw3omf(){try{__CLR4_5_2obhobhlvha7ft6.R.inc(31911);
        __CLR4_5_2obhobhlvha7ft6.R.inc(31912);final boolean[] src = new boolean[]{
            false, false, true, true, true, false, true, true, true, true, true, true, true,
            false, false, false, true, true, true, true, false, false, false, false, false,
            false, true, true, true, false, false, false, false, false, false, false, true,
            true, true, true, true, false, false, false, false, true, false, false, true, true,
            false, false, false, false, true, false, true, false, true, false, false, true,
            true, false, true, true, true, false, false, false, false, true};
        // conversion of "CDF1F0C10F12345678" by HexToBinary
        __CLR4_5_2obhobhlvha7ft6.R.inc(31913);assertEquals((byte)0x00, Conversion.binaryToByte(src, 0 * 4, (byte)0, 0, 0 * 4));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31914);assertEquals((byte)0x0C, Conversion.binaryToByte(src, 0 * 4, (byte)0, 0, 1 * 4));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31915);assertEquals((byte)0xDC, Conversion.binaryToByte(src, 0 * 4, (byte)0, 0, 2 * 4));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31916);assertEquals((byte)0xFD, Conversion.binaryToByte(src, 1 * 4, (byte)0, 0, 2 * 4));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31917);assertEquals((byte)0x34, Conversion.binaryToByte(src, 0 * 4, (byte)0x34, 0, 0 * 4));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31918);assertEquals((byte)0x84, Conversion.binaryToByte(src, 17 * 4, (byte)0x34, 4, 1 * 4));
    }finally{__CLR4_5_2obhobhlvha7ft6.R.flushNeeded();}}

    /**
     * Tests {@link Conversion#longToIntArray(long, int, int[], int, int)}.
     */
    @Test
    public void testLongToIntArray() {__CLR4_5_2obhobhlvha7ft6.R.globalSliceStart(getClass().getName(),31919);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jco8w6omn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2obhobhlvha7ft6.R.rethrow($CLV_t2$);}finally{__CLR4_5_2obhobhlvha7ft6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ConversionTest.testLongToIntArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),31919,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jco8w6omn(){try{__CLR4_5_2obhobhlvha7ft6.R.inc(31919);
        __CLR4_5_2obhobhlvha7ft6.R.inc(31920);assertArrayEquals(
            new int[]{}, Conversion.longToIntArray(0x0000000000000000L, 0, new int[]{}, 0, 0));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31921);assertArrayEquals(
            new int[]{}, Conversion.longToIntArray(0x0000000000000000L, 100, new int[]{}, 0, 0));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31922);assertArrayEquals(
            new int[]{}, Conversion.longToIntArray(0x0000000000000000L, 0, new int[]{}, 100, 0));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31923);assertArrayEquals(
            new int[]{0xFFFFFFFF, 0xFFFFFFFF, 0xFFFFFFFF, 0xFFFFFFFF},
            Conversion.longToIntArray(0x1234567890ABCDEFL, 0, new int[]{-1, -1, -1, -1}, 0, 0));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31924);assertArrayEquals(
            new int[]{0x90ABCDEF, 0xFFFFFFFF, 0xFFFFFFFF, 0xFFFFFFFF},
            Conversion.longToIntArray(0x1234567890ABCDEFL, 0, new int[]{-1, -1, -1, -1}, 0, 1));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31925);assertArrayEquals(
            new int[]{0x90ABCDEF, 0x12345678, 0xFFFFFFFF, 0xFFFFFFFF},
            Conversion.longToIntArray(0x1234567890ABCDEFL, 0, new int[]{-1, -1, -1, -1}, 0, 2));
        // assertArrayEquals(new
        // int[]{0x90ABCDEF,0x12345678,0x90ABCDEF,0x12345678},Conversion.longToIntArray(0x1234567890ABCDEFL,
        // 0,new int[]{-1,-1,-1,-1},0,4));//rejected by assertion
        // assertArrayEquals(new
        // int[]{0xFFFFFFFF,0x90ABCDEF,0x12345678,0x90ABCDEF},Conversion.longToIntArray(0x1234567890ABCDEFL,
        // 0,new int[]{-1,-1,-1,-1},1,3));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31926);assertArrayEquals(
            new int[]{0xFFFFFFFF, 0xFFFFFFFF, 0x90ABCDEF, 0x12345678},
            Conversion.longToIntArray(0x1234567890ABCDEFL, 0, new int[]{-1, -1, -1, -1}, 2, 2));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31927);assertArrayEquals(
            new int[]{0xFFFFFFFF, 0xFFFFFFFF, 0x90ABCDEF, 0xFFFFFFFF},
            Conversion.longToIntArray(0x1234567890ABCDEFL, 0, new int[]{-1, -1, -1, -1}, 2, 1));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31928);assertArrayEquals(
            new int[]{0xFFFFFFFF, 0xFFFFFFFF, 0xFFFFFFFF, 0x90ABCDEF},
            Conversion.longToIntArray(0x1234567890ABCDEFL, 0, new int[]{-1, -1, -1, -1}, 3, 1));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31929);assertArrayEquals(
            new int[]{0xFFFFFFFF, 0xFFFFFFFF, 0x4855E6F7, 0xFFFFFFFF},
            Conversion.longToIntArray(0x1234567890ABCDEFL, 1, new int[]{-1, -1, -1, -1}, 2, 1));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31930);assertArrayEquals(
            new int[]{0xFFFFFFFF, 0xFFFFFFFF, 0x242AF37B, 0xFFFFFFFF},
            Conversion.longToIntArray(0x1234567890ABCDEFL, 2, new int[]{-1, -1, -1, -1}, 2, 1));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31931);assertArrayEquals(
            new int[]{0xFFFFFFFF, 0xFFFFFFFF, 0x121579BD, 0xFFFFFFFF},
            Conversion.longToIntArray(0x1234567890ABCDEFL, 3, new int[]{-1, -1, -1, -1}, 2, 1));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31932);assertArrayEquals(
            new int[]{0xFFFFFFFF, 0xFFFFFFFF, 0x890ABCDE, 0xFFFFFFFF},
            Conversion.longToIntArray(0x1234567890ABCDEFL, 4, new int[]{-1, -1, -1, -1}, 2, 1));
        // assertArrayEquals(new
        // int[]{0x4855E6F7,0x091A2B3C,0x4855E6F7,0x091A2B3C},Conversion.longToIntArray(0x1234567890ABCDEFL,
        // 1,new int[]{-1,-1,-1,-1},0,4));//rejected by assertion
        __CLR4_5_2obhobhlvha7ft6.R.inc(31933);assertArrayEquals(
            new int[]{0x091A2B3C},
            Conversion.longToIntArray(0x1234567890ABCDEFL, 33, new int[]{0}, 0, 1));
    }finally{__CLR4_5_2obhobhlvha7ft6.R.flushNeeded();}}

    /**
     * Tests {@link Conversion#longToShortArray(long, int, short[], int, int)}.
     */
    @Test
    public void testLongToShortArray() {__CLR4_5_2obhobhlvha7ft6.R.globalSliceStart(getClass().getName(),31934);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hf5d65on2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2obhobhlvha7ft6.R.rethrow($CLV_t2$);}finally{__CLR4_5_2obhobhlvha7ft6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ConversionTest.testLongToShortArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),31934,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hf5d65on2(){try{__CLR4_5_2obhobhlvha7ft6.R.inc(31934);
        __CLR4_5_2obhobhlvha7ft6.R.inc(31935);assertArrayEquals(
            new short[]{},
            Conversion.longToShortArray(0x0000000000000000L, 0, new short[]{}, 0, 0));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31936);assertArrayEquals(
            new short[]{},
            Conversion.longToShortArray(0x0000000000000000L, 100, new short[]{}, 0, 0));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31937);assertArrayEquals(
            new short[]{},
            Conversion.longToShortArray(0x0000000000000000L, 0, new short[]{}, 100, 0));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31938);assertArrayEquals(
            new short[]{(short)0xFFFF, (short)0xFFFF, (short)0xFFFF, (short)0xFFFF},
            Conversion.longToShortArray(
                0x1234567890ABCDEFL, 0, new short[]{-1, -1, -1, -1}, 0, 0));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31939);assertArrayEquals(
            new short[]{(short)0xCDEF, (short)0xFFFF, (short)0xFFFF, (short)0xFFFF},
            Conversion.longToShortArray(
                0x1234567890ABCDEFL, 0, new short[]{-1, -1, -1, -1}, 0, 1));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31940);assertArrayEquals(
            new short[]{(short)0xCDEF, (short)0x90AB, (short)0xFFFF, (short)0xFFFF},
            Conversion.longToShortArray(
                0x1234567890ABCDEFL, 0, new short[]{-1, -1, -1, -1}, 0, 2));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31941);assertArrayEquals(
            new short[]{(short)0xCDEF, (short)0x90AB, (short)0x5678, (short)0xFFFF},
            Conversion.longToShortArray(
                0x1234567890ABCDEFL, 0, new short[]{-1, -1, -1, -1}, 0, 3));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31942);assertArrayEquals(
            new short[]{(short)0xCDEF, (short)0x90AB, (short)0x5678, (short)0x1234},
            Conversion.longToShortArray(
                0x1234567890ABCDEFL, 0, new short[]{-1, -1, -1, -1}, 0, 4));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31943);assertArrayEquals(
            new short[]{(short)0xFFFF, (short)0xCDEF, (short)0x90AB, (short)0x5678},
            Conversion.longToShortArray(
                0x1234567890ABCDEFL, 0, new short[]{-1, -1, -1, -1}, 1, 3));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31944);assertArrayEquals(
            new short[]{(short)0xFFFF, (short)0xFFFF, (short)0xCDEF, (short)0x90AB},
            Conversion.longToShortArray(
                0x1234567890ABCDEFL, 0, new short[]{-1, -1, -1, -1}, 2, 2));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31945);assertArrayEquals(
            new short[]{(short)0xFFFF, (short)0xFFFF, (short)0xCDEF, (short)0xFFFF},
            Conversion.longToShortArray(
                0x1234567890ABCDEFL, 0, new short[]{-1, -1, -1, -1}, 2, 1));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31946);assertArrayEquals(
            new short[]{(short)0xFFFF, (short)0xFFFF, (short)0xFFFF, (short)0xCDEF},
            Conversion.longToShortArray(
                0x1234567890ABCDEFL, 0, new short[]{-1, -1, -1, -1}, 3, 1));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31947);assertArrayEquals(
            new short[]{(short)0xFFFF, (short)0xFFFF, (short)0xE6F7, (short)0xFFFF},
            Conversion.longToShortArray(
                0x1234567890ABCDEFL, 1, new short[]{-1, -1, -1, -1}, 2, 1));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31948);assertArrayEquals(
            new short[]{(short)0xFFFF, (short)0xFFFF, (short)0xF37B, (short)0xFFFF},
            Conversion.longToShortArray(
                0x1234567890ABCDEFL, 2, new short[]{-1, -1, -1, -1}, 2, 1));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31949);assertArrayEquals(
            new short[]{(short)0xFFFF, (short)0xFFFF, (short)0x79BD, (short)0xFFFF},
            Conversion.longToShortArray(
                0x1234567890ABCDEFL, 3, new short[]{-1, -1, -1, -1}, 2, 1));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31950);assertArrayEquals(
            new short[]{(short)0xFFFF, (short)0xFFFF, (short)0xBCDE, (short)0xFFFF},
            Conversion.longToShortArray(
                0x1234567890ABCDEFL, 4, new short[]{-1, -1, -1, -1}, 2, 1));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31951);assertArrayEquals(
            new short[]{(short)0xE6F7, (short)0x4855, (short)0x2B3C, (short)0x091A},
            Conversion.longToShortArray(
                0x1234567890ABCDEFL, 1, new short[]{-1, -1, -1, -1}, 0, 4));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31952);assertArrayEquals(
            new short[]{(short)0x2B3C},
            Conversion.longToShortArray(0x1234567890ABCDEFL, 33, new short[]{0}, 0, 1));
    }finally{__CLR4_5_2obhobhlvha7ft6.R.flushNeeded();}}

    /**
     * Tests {@link Conversion#intToShortArray(int, int, short[], int, int)}.
     */
    @Test
    public void testIntToShortArray() {__CLR4_5_2obhobhlvha7ft6.R.globalSliceStart(getClass().getName(),31953);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_25um3s4onl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2obhobhlvha7ft6.R.rethrow($CLV_t2$);}finally{__CLR4_5_2obhobhlvha7ft6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ConversionTest.testIntToShortArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),31953,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_25um3s4onl(){try{__CLR4_5_2obhobhlvha7ft6.R.inc(31953);
        __CLR4_5_2obhobhlvha7ft6.R.inc(31954);assertArrayEquals(
            new short[]{}, Conversion.intToShortArray(0x00000000, 0, new short[]{}, 0, 0));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31955);assertArrayEquals(
            new short[]{}, Conversion.intToShortArray(0x00000000, 100, new short[]{}, 0, 0));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31956);assertArrayEquals(
            new short[]{}, Conversion.intToShortArray(0x00000000, 0, new short[]{}, 100, 0));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31957);assertArrayEquals(
            new short[]{(short)0xFFFF, (short)0xFFFF, (short)0xFFFF, (short)0xFFFF},
            Conversion.intToShortArray(0x12345678, 0, new short[]{-1, -1, -1, -1}, 0, 0));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31958);assertArrayEquals(
            new short[]{(short)0x5678, (short)0xFFFF, (short)0xFFFF, (short)0xFFFF},
            Conversion.intToShortArray(0x12345678, 0, new short[]{-1, -1, -1, -1}, 0, 1));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31959);assertArrayEquals(
            new short[]{(short)0x5678, (short)0x1234, (short)0xFFFF, (short)0xFFFF},
            Conversion.intToShortArray(0x12345678, 0, new short[]{-1, -1, -1, -1}, 0, 2));
        // assertArrayEquals(new
        // short[]{(short)0x5678,(short)0x1234,(short)0x5678,(short)0xFFFF},Conversion.intToShortArray(0x12345678,
        // 0,new short[]{-1,-1,-1,-1},0,3));//rejected by assertion
        // assertArrayEquals(new
        // short[]{(short)0x5678,(short)0x1234,(short)0x5678,(short)0x1234},Conversion.intToShortArray(0x12345678,
        // 0,new short[]{-1,-1,-1,-1},0,4));
        // assertArrayEquals(new
        // short[]{(short)0xFFFF,(short)0x5678,(short)0x1234,(short)0x5678},Conversion.intToShortArray(0x12345678,
        // 0,new short[]{-1,-1,-1,-1},1,3));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31960);assertArrayEquals(
            new short[]{(short)0xFFFF, (short)0xFFFF, (short)0x5678, (short)0x1234},
            Conversion.intToShortArray(0x12345678, 0, new short[]{-1, -1, -1, -1}, 2, 2));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31961);assertArrayEquals(
            new short[]{(short)0xFFFF, (short)0xFFFF, (short)0x5678, (short)0xFFFF},
            Conversion.intToShortArray(0x12345678, 0, new short[]{-1, -1, -1, -1}, 2, 1));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31962);assertArrayEquals(
            new short[]{(short)0xFFFF, (short)0xFFFF, (short)0xFFFF, (short)0x5678},
            Conversion.intToShortArray(0x12345678, 0, new short[]{-1, -1, -1, -1}, 3, 1));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31963);assertArrayEquals(
            new short[]{(short)0xFFFF, (short)0xFFFF, (short)0x2B3C, (short)0xFFFF},
            Conversion.intToShortArray(0x12345678, 1, new short[]{-1, -1, -1, -1}, 2, 1));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31964);assertArrayEquals(
            new short[]{(short)0xFFFF, (short)0xFFFF, (short)0x159E, (short)0xFFFF},
            Conversion.intToShortArray(0x12345678, 2, new short[]{-1, -1, -1, -1}, 2, 1));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31965);assertArrayEquals(
            new short[]{(short)0xFFFF, (short)0xFFFF, (short)0x8ACF, (short)0xFFFF},
            Conversion.intToShortArray(0x12345678, 3, new short[]{-1, -1, -1, -1}, 2, 1));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31966);assertArrayEquals(
            new short[]{(short)0xFFFF, (short)0xFFFF, (short)0x4567, (short)0xFFFF},
            Conversion.intToShortArray(0x12345678, 4, new short[]{-1, -1, -1, -1}, 2, 1));
        // assertArrayEquals(new
        // short[]{(short)0xE6F7,(short)0x4855,(short)0x2B3C,(short)0x091A},Conversion.intToShortArray(0x12345678,
        // 1,new short[]{-1,-1,-1,-1},0,4));//rejected by assertion
        // assertArrayEquals(new
        // short[]{(short)0x2B3C},Conversion.intToShortArray(0x12345678,33,new
        // short[]{0},0,1));//rejected by assertion
        __CLR4_5_2obhobhlvha7ft6.R.inc(31967);assertArrayEquals(
            new short[]{(short)0x091A},
            Conversion.intToShortArray(0x12345678, 17, new short[]{0}, 0, 1));
    }finally{__CLR4_5_2obhobhlvha7ft6.R.flushNeeded();}}

    /**
     * Tests {@link Conversion#longToByteArray(long, int, byte[], int, int)}.
     */
    @Test
    public void testLongToByteArray() {__CLR4_5_2obhobhlvha7ft6.R.globalSliceStart(getClass().getName(),31968);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2pfi5nzoo0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2obhobhlvha7ft6.R.rethrow($CLV_t2$);}finally{__CLR4_5_2obhobhlvha7ft6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ConversionTest.testLongToByteArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),31968,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2pfi5nzoo0(){try{__CLR4_5_2obhobhlvha7ft6.R.inc(31968);
        __CLR4_5_2obhobhlvha7ft6.R.inc(31969);assertArrayEquals(
            new byte[]{},
            Conversion.longToByteArray(0x0000000000000000L, 0, new byte[]{}, 0, 0));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31970);assertArrayEquals(
            new byte[]{},
            Conversion.longToByteArray(0x0000000000000000L, 100, new byte[]{}, 0, 0));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31971);assertArrayEquals(
            new byte[]{},
            Conversion.longToByteArray(0x0000000000000000L, 0, new byte[]{}, 100, 0));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31972);assertArrayEquals(
            new byte[]{
                (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF,
                (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF},
            Conversion.longToByteArray(0x1234567890ABCDEFL, 0, new byte[]{
                -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1}, 0, 0));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31973);assertArrayEquals(
            new byte[]{
                (byte)0xEF, (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF,
                (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF},
            Conversion.longToByteArray(0x1234567890ABCDEFL, 0, new byte[]{
                -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1}, 0, 1));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31974);assertArrayEquals(
            new byte[]{
                (byte)0xEF, (byte)0xCD, (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF,
                (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF},
            Conversion.longToByteArray(0x1234567890ABCDEFL, 0, new byte[]{
                -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1}, 0, 2));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31975);assertArrayEquals(
            new byte[]{
                (byte)0xEF, (byte)0xCD, (byte)0xAB, (byte)0x90, (byte)0xFF, (byte)0xFF,
                (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF},
            Conversion.longToByteArray(0x1234567890ABCDEFL, 0, new byte[]{
                -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1}, 0, 4));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31976);assertArrayEquals(
            new byte[]{
                (byte)0xEF, (byte)0xCD, (byte)0xAB, (byte)0x90, (byte)0x78, (byte)0x56,
                (byte)0x34, (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF},
            Conversion.longToByteArray(0x1234567890ABCDEFL, 0, new byte[]{
                -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1}, 0, 7));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31977);assertArrayEquals(
            new byte[]{
                (byte)0xEF, (byte)0xCD, (byte)0xAB, (byte)0x90, (byte)0x78, (byte)0x56,
                (byte)0x34, (byte)0x12, (byte)0xFF, (byte)0xFF, (byte)0xFF},
            Conversion.longToByteArray(0x1234567890ABCDEFL, 0, new byte[]{
                -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1}, 0, 8));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31978);assertArrayEquals(
            new byte[]{
                (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xEF, (byte)0xFF, (byte)0xFF,
                (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF},
            Conversion.longToByteArray(0x1234567890ABCDEFL, 0, new byte[]{
                -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1}, 3, 1));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31979);assertArrayEquals(
            new byte[]{
                (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xEF, (byte)0xCD, (byte)0xFF,
                (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF},
            Conversion.longToByteArray(0x1234567890ABCDEFL, 0, new byte[]{
                -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1}, 3, 2));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31980);assertArrayEquals(
            new byte[]{
                (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xEF, (byte)0xCD, (byte)0xAB,
                (byte)0x90, (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF},
            Conversion.longToByteArray(0x1234567890ABCDEFL, 0, new byte[]{
                -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1}, 3, 4));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31981);assertArrayEquals(
            new byte[]{
                (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xEF, (byte)0xCD, (byte)0xAB,
                (byte)0x90, (byte)0x78, (byte)0x56, (byte)0x34, (byte)0xFF},
            Conversion.longToByteArray(0x1234567890ABCDEFL, 0, new byte[]{
                -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1}, 3, 7));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31982);assertArrayEquals(
            new byte[]{
                (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xEF, (byte)0xCD, (byte)0xAB,
                (byte)0x90, (byte)0x78, (byte)0x56, (byte)0x34, (byte)0x12},
            Conversion.longToByteArray(0x1234567890ABCDEFL, 0, new byte[]{
                -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1}, 3, 8));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31983);assertArrayEquals(
            new byte[]{
                (byte)0xF7, (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF,
                (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF},
            Conversion.longToByteArray(0x1234567890ABCDEFL, 1, new byte[]{
                -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1}, 0, 1));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31984);assertArrayEquals(
            new byte[]{
                (byte)0x7B, (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF,
                (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF},
            Conversion.longToByteArray(0x1234567890ABCDEFL, 2, new byte[]{
                -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1}, 0, 1));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31985);assertArrayEquals(
            new byte[]{
                (byte)0xFF, (byte)0x00, (byte)0xFF, (byte)0x6F, (byte)0x5E, (byte)0x85,
                (byte)0xC4, (byte)0xB3, (byte)0xA2, (byte)0x91, (byte)0x00},
            Conversion.longToByteArray(0x1234567890ABCDEFL, 5, new byte[]{
                -1, 0, -1, -1, -1, -1, -1, -1, -1, -1, -1}, 3, 8));
        // assertArrayEquals(new
        // byte[]{(byte)0xFF,(byte)0x00,(byte)0xFF,(byte)0x5E,(byte)0x85,(byte)0xC4,(byte)0xB3,(byte)0xA2,(byte)0x91,(byte)0x00,(byte)0x00},Conversion.longToByteArray(0x1234567890ABCDEFL,13,new
        // byte[]{-1, 0,-1,-1,-1,-1,-1,-1,-1,-1,-1},3,8));//rejected by assertion
        __CLR4_5_2obhobhlvha7ft6.R.inc(31986);assertArrayEquals(
            new byte[]{
                (byte)0xFF, (byte)0x00, (byte)0xFF, (byte)0x5E, (byte)0x85, (byte)0xC4,
                (byte)0xB3, (byte)0xA2, (byte)0x91, (byte)0x00, (byte)0xFF},
            Conversion.longToByteArray(0x1234567890ABCDEFL, 13, new byte[]{
                -1, 0, -1, -1, -1, -1, -1, -1, -1, -1, -1}, 3, 7));
    }finally{__CLR4_5_2obhobhlvha7ft6.R.flushNeeded();}}

    /**
     * Tests {@link Conversion#intToByteArray(int, int, byte[], int, int)}.
     */
    @Test
    public void testIntToByteArray() {__CLR4_5_2obhobhlvha7ft6.R.globalSliceStart(getClass().getName(),31987);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ius6jkooj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2obhobhlvha7ft6.R.rethrow($CLV_t2$);}finally{__CLR4_5_2obhobhlvha7ft6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ConversionTest.testIntToByteArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),31987,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ius6jkooj(){try{__CLR4_5_2obhobhlvha7ft6.R.inc(31987);
        __CLR4_5_2obhobhlvha7ft6.R.inc(31988);assertArrayEquals(
            new byte[]{}, Conversion.intToByteArray(0x00000000, 0, new byte[]{}, 0, 0));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31989);assertArrayEquals(
            new byte[]{}, Conversion.intToByteArray(0x00000000, 100, new byte[]{}, 0, 0));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31990);assertArrayEquals(
            new byte[]{}, Conversion.intToByteArray(0x00000000, 0, new byte[]{}, 100, 0));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31991);assertArrayEquals(
            new byte[]{
                (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF,
                (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF},
            Conversion.intToByteArray(0x90ABCDEF, 0, new byte[]{
                -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1}, 0, 0));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31992);assertArrayEquals(
            new byte[]{
                (byte)0xEF, (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF,
                (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF},
            Conversion.intToByteArray(0x90ABCDEF, 0, new byte[]{
                -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1}, 0, 1));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31993);assertArrayEquals(
            new byte[]{
                (byte)0xEF, (byte)0xCD, (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF,
                (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF},
            Conversion.intToByteArray(0x90ABCDEF, 0, new byte[]{
                -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1}, 0, 2));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31994);assertArrayEquals(
            new byte[]{
                (byte)0xEF, (byte)0xCD, (byte)0xAB, (byte)0x90, (byte)0xFF, (byte)0xFF,
                (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF},
            Conversion.intToByteArray(0x90ABCDEF, 0, new byte[]{
                -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1}, 0, 4));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31995);assertArrayEquals(
            new byte[]{
                (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xEF, (byte)0xFF, (byte)0xFF,
                (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF},
            Conversion.intToByteArray(0x90ABCDEF, 0, new byte[]{
                -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1}, 3, 1));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31996);assertArrayEquals(
            new byte[]{
                (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xEF, (byte)0xCD, (byte)0xFF,
                (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF},
            Conversion.intToByteArray(0x90ABCDEF, 0, new byte[]{
                -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1}, 3, 2));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31997);assertArrayEquals(
            new byte[]{
                (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xEF, (byte)0xCD, (byte)0xAB,
                (byte)0x90, (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF},
            Conversion.intToByteArray(0x90ABCDEF, 0, new byte[]{
                -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1}, 3, 4));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31998);assertArrayEquals(
            new byte[]{
                (byte)0xF7, (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF,
                (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF},
            Conversion.intToByteArray(0x90ABCDEF, 1, new byte[]{
                -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1}, 0, 1));
        __CLR4_5_2obhobhlvha7ft6.R.inc(31999);assertArrayEquals(
            new byte[]{
                (byte)0x7B, (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF,
                (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF},
            Conversion.intToByteArray(0x90ABCDEF, 2, new byte[]{
                -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1}, 0, 1));
        __CLR4_5_2obhobhlvha7ft6.R.inc(32000);assertArrayEquals(
            new byte[]{
                (byte)0xFF, (byte)0x00, (byte)0xFF, (byte)0x6F, (byte)0x5E, (byte)0x85,
                (byte)0xFC, (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF},
            Conversion.intToByteArray(0x90ABCDEF, 5, new byte[]{
                -1, 0, -1, -1, -1, -1, -1, -1, -1, -1, -1}, 3, 4));
        // assertArrayEquals(new
        // byte[]{(byte)0xFF,(byte)0x00,(byte)0xFF,(byte)0x5E,(byte)0x85,(byte)0xFC,(byte)0x00,(byte)0xFF,(byte)0xFF,(byte)0xFF,(byte)0xFF},Conversion.intToByteArray(0x90ABCDEF,13,new
        // byte[]{-1, 0,-1,-1,-1,-1,-1,-1,-1,-1,-1},3,4));//rejected by assertion
        __CLR4_5_2obhobhlvha7ft6.R.inc(32001);assertArrayEquals(
            new byte[]{
                (byte)0xFF, (byte)0x00, (byte)0xFF, (byte)0x5E, (byte)0x85, (byte)0xFC,
                (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF},
            Conversion.intToByteArray(0x90ABCDEF, 13, new byte[]{
                -1, 0, -1, -1, -1, -1, -1, -1, -1, -1, -1}, 3, 3));
    }finally{__CLR4_5_2obhobhlvha7ft6.R.flushNeeded();}}

    /**
     * Tests {@link Conversion#shortToByteArray(short, int, byte[], int, int)}.
     */
    @Test
    public void testShortToByteArray() {__CLR4_5_2obhobhlvha7ft6.R.globalSliceStart(getClass().getName(),32002);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ob6j4jooy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2obhobhlvha7ft6.R.rethrow($CLV_t2$);}finally{__CLR4_5_2obhobhlvha7ft6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ConversionTest.testShortToByteArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),32002,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ob6j4jooy(){try{__CLR4_5_2obhobhlvha7ft6.R.inc(32002);
        __CLR4_5_2obhobhlvha7ft6.R.inc(32003);assertArrayEquals(
            new byte[]{}, Conversion.shortToByteArray((short)0x0000, 0, new byte[]{}, 0, 0));
        __CLR4_5_2obhobhlvha7ft6.R.inc(32004);assertArrayEquals(
            new byte[]{}, Conversion.shortToByteArray((short)0x0000, 100, new byte[]{}, 0, 0));
        __CLR4_5_2obhobhlvha7ft6.R.inc(32005);assertArrayEquals(
            new byte[]{}, Conversion.shortToByteArray((short)0x0000, 0, new byte[]{}, 100, 0));
        __CLR4_5_2obhobhlvha7ft6.R.inc(32006);assertArrayEquals(
            new byte[]{
                (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF,
                (byte)0xFF}, Conversion.shortToByteArray((short)0xCDEF, 0, new byte[]{
                -1, -1, -1, -1, -1, -1, -1}, 0, 0));
        __CLR4_5_2obhobhlvha7ft6.R.inc(32007);assertArrayEquals(
            new byte[]{
                (byte)0xEF, (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF,
                (byte)0xFF}, Conversion.shortToByteArray((short)0xCDEF, 0, new byte[]{
                -1, -1, -1, -1, -1, -1, -1}, 0, 1));
        __CLR4_5_2obhobhlvha7ft6.R.inc(32008);assertArrayEquals(
            new byte[]{
                (byte)0xEF, (byte)0xCD, (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF,
                (byte)0xFF}, Conversion.shortToByteArray((short)0xCDEF, 0, new byte[]{
                -1, -1, -1, -1, -1, -1, -1}, 0, 2));
        __CLR4_5_2obhobhlvha7ft6.R.inc(32009);assertArrayEquals(
            new byte[]{
                (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xEF, (byte)0xFF, (byte)0xFF,
                (byte)0xFF}, Conversion.shortToByteArray((short)0xCDEF, 0, new byte[]{
                -1, -1, -1, -1, -1, -1, -1}, 3, 1));
        __CLR4_5_2obhobhlvha7ft6.R.inc(32010);assertArrayEquals(
            new byte[]{
                (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xEF, (byte)0xCD, (byte)0xFF,
                (byte)0xFF}, Conversion.shortToByteArray((short)0xCDEF, 0, new byte[]{
                -1, -1, -1, -1, -1, -1, -1}, 3, 2));
        __CLR4_5_2obhobhlvha7ft6.R.inc(32011);assertArrayEquals(
            new byte[]{
                (byte)0xF7, (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF,
                (byte)0xFF}, Conversion.shortToByteArray((short)0xCDEF, 1, new byte[]{
                -1, -1, -1, -1, -1, -1, -1}, 0, 1));
        __CLR4_5_2obhobhlvha7ft6.R.inc(32012);assertArrayEquals(
            new byte[]{
                (byte)0x7B, (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF,
                (byte)0xFF}, Conversion.shortToByteArray((short)0xCDEF, 2, new byte[]{
                -1, -1, -1, -1, -1, -1, -1}, 0, 1));
        __CLR4_5_2obhobhlvha7ft6.R.inc(32013);assertArrayEquals(
            new byte[]{
                (byte)0xFF, (byte)0x00, (byte)0xFF, (byte)0x6F, (byte)0xFE, (byte)0xFF,
                (byte)0xFF}, Conversion.shortToByteArray((short)0xCDEF, 5, new byte[]{
                -1, 0, -1, -1, -1, -1, -1}, 3, 2));
        // assertArrayEquals(new
        // byte[]{(byte)0xFF,(byte)0x00,(byte)0xFF,(byte)0x5E,(byte)0xFF,(byte)0xFF,(byte)0xFF},Conversion.shortToByteArray((short)0xCDEF,13,new
        // byte[]{-1, 0,-1,-1,-1,-1,-1},3,2));//rejected by assertion
        __CLR4_5_2obhobhlvha7ft6.R.inc(32014);assertArrayEquals(
            new byte[]{
                (byte)0xFF, (byte)0x00, (byte)0xFF, (byte)0xFE, (byte)0xFF, (byte)0xFF,
                (byte)0xFF}, Conversion.shortToByteArray((short)0xCDEF, 13, new byte[]{
                -1, 0, -1, -1, -1, -1, -1}, 3, 1));
    }finally{__CLR4_5_2obhobhlvha7ft6.R.flushNeeded();}}

    /**
     * Tests {@link Conversion#longToHex(long, int, String, int, int)}.
     */
    @Test
    public void testLongToHex() {__CLR4_5_2obhobhlvha7ft6.R.globalSliceStart(getClass().getName(),32015);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2nzl59jopb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2obhobhlvha7ft6.R.rethrow($CLV_t2$);}finally{__CLR4_5_2obhobhlvha7ft6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ConversionTest.testLongToHex",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),32015,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2nzl59jopb(){try{__CLR4_5_2obhobhlvha7ft6.R.inc(32015);
        __CLR4_5_2obhobhlvha7ft6.R.inc(32016);assertEquals("", Conversion.longToHex(0x0000000000000000L, 0, "", 0, 0));
        __CLR4_5_2obhobhlvha7ft6.R.inc(32017);assertEquals("", Conversion.longToHex(0x0000000000000000L, 100, "", 0, 0));
        __CLR4_5_2obhobhlvha7ft6.R.inc(32018);assertEquals("", Conversion.longToHex(0x0000000000000000L, 0, "", 100, 0));
        __CLR4_5_2obhobhlvha7ft6.R.inc(32019);assertEquals(
            "ffffffffffffffffffffffff",
            Conversion.longToHex(0x1234567890ABCDEFL, 0, "ffffffffffffffffffffffff", 0, 0));
        __CLR4_5_2obhobhlvha7ft6.R.inc(32020);assertEquals(
            "3fffffffffffffffffffffff",
            Conversion.longToHex(0x1234567890ABCDE3L, 0, "ffffffffffffffffffffffff", 0, 1));
        __CLR4_5_2obhobhlvha7ft6.R.inc(32021);assertEquals(
            "feffffffffffffffffffffff",
            Conversion.longToHex(0x1234567890ABCDEFL, 0, "ffffffffffffffffffffffff", 0, 2));
        __CLR4_5_2obhobhlvha7ft6.R.inc(32022);assertEquals(
            "fedcffffffffffffffffffff",
            Conversion.longToHex(0x1234567890ABCDEFL, 0, "ffffffffffffffffffffffff", 0, 4));
        __CLR4_5_2obhobhlvha7ft6.R.inc(32023);assertEquals(
            "fedcba098765432fffffffff",
            Conversion.longToHex(0x1234567890ABCDEFL, 0, "ffffffffffffffffffffffff", 0, 15));
        __CLR4_5_2obhobhlvha7ft6.R.inc(32024);assertEquals(
            "fedcba0987654321ffffffff",
            Conversion.longToHex(0x1234567890ABCDEFL, 0, "ffffffffffffffffffffffff", 0, 16));
        __CLR4_5_2obhobhlvha7ft6.R.inc(32025);assertEquals(
            "fff3ffffffffffffffffffff",
            Conversion.longToHex(0x1234567890ABCDE3L, 0, "ffffffffffffffffffffffff", 3, 1));
        __CLR4_5_2obhobhlvha7ft6.R.inc(32026);assertEquals(
            "ffffefffffffffffffffffff",
            Conversion.longToHex(0x1234567890ABCDEFL, 0, "ffffffffffffffffffffffff", 3, 2));
        __CLR4_5_2obhobhlvha7ft6.R.inc(32027);assertEquals(
            "ffffedcfffffffffffffffff",
            Conversion.longToHex(0x1234567890ABCDEFL, 0, "ffffffffffffffffffffffff", 3, 4));
        __CLR4_5_2obhobhlvha7ft6.R.inc(32028);assertEquals(
            "ffffedcba098765432ffffff",
            Conversion.longToHex(0x1234567890ABCDEFL, 0, "ffffffffffffffffffffffff", 3, 15));
        __CLR4_5_2obhobhlvha7ft6.R.inc(32029);assertEquals(
            "ffffedcba0987654321fffff",
            Conversion.longToHex(0x1234567890ABCDEFL, 0, "ffffffffffffffffffffffff", 3, 16));
        __CLR4_5_2obhobhlvha7ft6.R.inc(32030);assertEquals(
            "7fffffffffffffffffffffff",
            Conversion.longToHex(0x1234567890ABCDEFL, 1, "ffffffffffffffffffffffff", 0, 1));
        __CLR4_5_2obhobhlvha7ft6.R.inc(32031);assertEquals(
            "bfffffffffffffffffffffff",
            Conversion.longToHex(0x1234567890ABCDEFL, 2, "ffffffffffffffffffffffff", 0, 1));
        __CLR4_5_2obhobhlvha7ft6.R.inc(32032);assertEquals(
            "fffdb975121fca86420fffff",
            Conversion.longToHex(0x1234567890ABCDEFL, 3, "ffffffffffffffffffffffff", 3, 16));
        // assertEquals("ffffffffffffffffffffffff",Conversion.longToHex(0x1234567890ABCDEFL,4,"ffffffffffffffffffffffff",3,16));//rejected
        // by assertion
        __CLR4_5_2obhobhlvha7ft6.R.inc(32033);assertEquals(
            "fffedcba0987654321ffffff",
            Conversion.longToHex(0x1234567890ABCDEFL, 4, "ffffffffffffffffffffffff", 3, 15));
        __CLR4_5_2obhobhlvha7ft6.R.inc(32034);assertEquals(
            "fedcba0987654321", Conversion.longToHex(0x1234567890ABCDEFL, 0, "", 0, 16));
        __CLR4_5_2obhobhlvha7ft6.R.inc(32035);try {
            __CLR4_5_2obhobhlvha7ft6.R.inc(32036);Conversion.longToHex(0x1234567890ABCDEFL, 0, "", 1, 8);
            __CLR4_5_2obhobhlvha7ft6.R.inc(32037);fail("Thrown " + StringIndexOutOfBoundsException.class.getName() + " expected");
        } catch (final StringIndexOutOfBoundsException e) {
            // OK
        }
    }finally{__CLR4_5_2obhobhlvha7ft6.R.flushNeeded();}}

    /**
     * Tests {@link Conversion#intToHex(int, int, String, int, int)}.
     */
    @Test
    public void testIntToHex() {__CLR4_5_2obhobhlvha7ft6.R.globalSliceStart(getClass().getName(),32038);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23bkvwqopy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2obhobhlvha7ft6.R.rethrow($CLV_t2$);}finally{__CLR4_5_2obhobhlvha7ft6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ConversionTest.testIntToHex",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),32038,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23bkvwqopy(){try{__CLR4_5_2obhobhlvha7ft6.R.inc(32038);
        __CLR4_5_2obhobhlvha7ft6.R.inc(32039);assertEquals("", Conversion.intToHex(0x00000000, 0, "", 0, 0));
        __CLR4_5_2obhobhlvha7ft6.R.inc(32040);assertEquals("", Conversion.intToHex(0x00000000, 100, "", 0, 0));
        __CLR4_5_2obhobhlvha7ft6.R.inc(32041);assertEquals("", Conversion.intToHex(0x00000000, 0, "", 100, 0));
        __CLR4_5_2obhobhlvha7ft6.R.inc(32042);assertEquals(
            "ffffffffffffffffffffffff",
            Conversion.intToHex(0x90ABCDEF, 0, "ffffffffffffffffffffffff", 0, 0));
        __CLR4_5_2obhobhlvha7ft6.R.inc(32043);assertEquals(
            "3fffffffffffffffffffffff",
            Conversion.intToHex(0x90ABCDE3, 0, "ffffffffffffffffffffffff", 0, 1));
        __CLR4_5_2obhobhlvha7ft6.R.inc(32044);assertEquals(
            "feffffffffffffffffffffff",
            Conversion.intToHex(0x90ABCDEF, 0, "ffffffffffffffffffffffff", 0, 2));
        __CLR4_5_2obhobhlvha7ft6.R.inc(32045);assertEquals(
            "fedcffffffffffffffffffff",
            Conversion.intToHex(0x90ABCDEF, 0, "ffffffffffffffffffffffff", 0, 4));
        __CLR4_5_2obhobhlvha7ft6.R.inc(32046);assertEquals(
            "fedcba0fffffffffffffffff",
            Conversion.intToHex(0x90ABCDEF, 0, "ffffffffffffffffffffffff", 0, 7));
        __CLR4_5_2obhobhlvha7ft6.R.inc(32047);assertEquals(
            "fedcba09ffffffffffffffff",
            Conversion.intToHex(0x90ABCDEF, 0, "ffffffffffffffffffffffff", 0, 8));
        __CLR4_5_2obhobhlvha7ft6.R.inc(32048);assertEquals(
            "fff3ffffffffffffffffffff",
            Conversion.intToHex(0x90ABCDE3, 0, "ffffffffffffffffffffffff", 3, 1));
        __CLR4_5_2obhobhlvha7ft6.R.inc(32049);assertEquals(
            "ffffefffffffffffffffffff",
            Conversion.intToHex(0x90ABCDEF, 0, "ffffffffffffffffffffffff", 3, 2));
        __CLR4_5_2obhobhlvha7ft6.R.inc(32050);assertEquals(
            "ffffedcfffffffffffffffff",
            Conversion.intToHex(0x90ABCDEF, 0, "ffffffffffffffffffffffff", 3, 4));
        __CLR4_5_2obhobhlvha7ft6.R.inc(32051);assertEquals(
            "ffffedcba0ffffffffffffff",
            Conversion.intToHex(0x90ABCDEF, 0, "ffffffffffffffffffffffff", 3, 7));
        __CLR4_5_2obhobhlvha7ft6.R.inc(32052);assertEquals(
            "ffffedcba09fffffffffffff",
            Conversion.intToHex(0x90ABCDEF, 0, "ffffffffffffffffffffffff", 3, 8));
        __CLR4_5_2obhobhlvha7ft6.R.inc(32053);assertEquals(
            "7fffffffffffffffffffffff",
            Conversion.intToHex(0x90ABCDEF, 1, "ffffffffffffffffffffffff", 0, 1));
        __CLR4_5_2obhobhlvha7ft6.R.inc(32054);assertEquals(
            "bfffffffffffffffffffffff",
            Conversion.intToHex(0x90ABCDEF, 2, "ffffffffffffffffffffffff", 0, 1));
        __CLR4_5_2obhobhlvha7ft6.R.inc(32055);assertEquals(
            "fffdb97512ffffffffffffff",
            Conversion.intToHex(0x90ABCDEF, 3, "ffffffffffffffffffffffff", 3, 8));
        // assertEquals("ffffffffffffffffffffffff",Conversion.intToHex(0x90ABCDEF,
        // 4,"ffffffffffffffffffffffff",3,8));//rejected by assertion
        __CLR4_5_2obhobhlvha7ft6.R.inc(32056);assertEquals(
            "fffedcba09ffffffffffffff",
            Conversion.intToHex(0x90ABCDEF, 4, "ffffffffffffffffffffffff", 3, 7));
        __CLR4_5_2obhobhlvha7ft6.R.inc(32057);assertEquals("fedcba09", Conversion.intToHex(0x90ABCDEF, 0, "", 0, 8));
        __CLR4_5_2obhobhlvha7ft6.R.inc(32058);try {
            __CLR4_5_2obhobhlvha7ft6.R.inc(32059);Conversion.intToHex(0x90ABCDEF, 0, "", 1, 8);
            __CLR4_5_2obhobhlvha7ft6.R.inc(32060);fail("Thrown " + StringIndexOutOfBoundsException.class.getName() + " expected");
        } catch (final StringIndexOutOfBoundsException e) {
            // OK
        }
    }finally{__CLR4_5_2obhobhlvha7ft6.R.flushNeeded();}}

    /**
     * Tests {@link Conversion#shortToHex(short, int, String, int, int)}.
     */
    @Test
    public void testShortToHex() {__CLR4_5_2obhobhlvha7ft6.R.globalSliceStart(getClass().getName(),32061);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2i677eloql();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2obhobhlvha7ft6.R.rethrow($CLV_t2$);}finally{__CLR4_5_2obhobhlvha7ft6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ConversionTest.testShortToHex",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),32061,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2i677eloql(){try{__CLR4_5_2obhobhlvha7ft6.R.inc(32061);
        __CLR4_5_2obhobhlvha7ft6.R.inc(32062);assertEquals("", Conversion.shortToHex((short)0x0000, 0, "", 0, 0));
        __CLR4_5_2obhobhlvha7ft6.R.inc(32063);assertEquals("", Conversion.shortToHex((short)0x0000, 100, "", 0, 0));
        __CLR4_5_2obhobhlvha7ft6.R.inc(32064);assertEquals("", Conversion.shortToHex((short)0x0000, 0, "", 100, 0));
        __CLR4_5_2obhobhlvha7ft6.R.inc(32065);assertEquals(
            "ffffffffffffffffffffffff",
            Conversion.shortToHex((short)0xCDEF, 0, "ffffffffffffffffffffffff", 0, 0));
        __CLR4_5_2obhobhlvha7ft6.R.inc(32066);assertEquals(
            "3fffffffffffffffffffffff",
            Conversion.shortToHex((short)0xCDE3, 0, "ffffffffffffffffffffffff", 0, 1));
        __CLR4_5_2obhobhlvha7ft6.R.inc(32067);assertEquals(
            "feffffffffffffffffffffff",
            Conversion.shortToHex((short)0xCDEF, 0, "ffffffffffffffffffffffff", 0, 2));
        __CLR4_5_2obhobhlvha7ft6.R.inc(32068);assertEquals(
            "fedfffffffffffffffffffff",
            Conversion.shortToHex((short)0xCDEF, 0, "ffffffffffffffffffffffff", 0, 3));
        __CLR4_5_2obhobhlvha7ft6.R.inc(32069);assertEquals(
            "fedcffffffffffffffffffff",
            Conversion.shortToHex((short)0xCDEF, 0, "ffffffffffffffffffffffff", 0, 4));
        __CLR4_5_2obhobhlvha7ft6.R.inc(32070);assertEquals(
            "fff3ffffffffffffffffffff",
            Conversion.shortToHex((short)0xCDE3, 0, "ffffffffffffffffffffffff", 3, 1));
        __CLR4_5_2obhobhlvha7ft6.R.inc(32071);assertEquals(
            "ffffefffffffffffffffffff",
            Conversion.shortToHex((short)0xCDEF, 0, "ffffffffffffffffffffffff", 3, 2));
        __CLR4_5_2obhobhlvha7ft6.R.inc(32072);assertEquals(
            "7fffffffffffffffffffffff",
            Conversion.shortToHex((short)0xCDEF, 1, "ffffffffffffffffffffffff", 0, 1));
        __CLR4_5_2obhobhlvha7ft6.R.inc(32073);assertEquals(
            "bfffffffffffffffffffffff",
            Conversion.shortToHex((short)0xCDEF, 2, "ffffffffffffffffffffffff", 0, 1));
        __CLR4_5_2obhobhlvha7ft6.R.inc(32074);assertEquals(
            "fffdb9ffffffffffffffffff",
            Conversion.shortToHex((short)0xCDEF, 3, "ffffffffffffffffffffffff", 3, 4));
        // assertEquals("ffffffffffffffffffffffff",Conversion.shortToHex((short)0xCDEF,
        // 4,"ffffffffffffffffffffffff",3,4));//rejected by assertion
        __CLR4_5_2obhobhlvha7ft6.R.inc(32075);assertEquals(
            "fffedcffffffffffffffffff",
            Conversion.shortToHex((short)0xCDEF, 4, "ffffffffffffffffffffffff", 3, 3));
        __CLR4_5_2obhobhlvha7ft6.R.inc(32076);assertEquals("fedc", Conversion.shortToHex((short)0xCDEF, 0, "", 0, 4));
        __CLR4_5_2obhobhlvha7ft6.R.inc(32077);try {
            __CLR4_5_2obhobhlvha7ft6.R.inc(32078);Conversion.shortToHex((short)0xCDEF, 0, "", 1, 4);
            __CLR4_5_2obhobhlvha7ft6.R.inc(32079);fail("Thrown " + StringIndexOutOfBoundsException.class.getName() + " expected");
        } catch (final StringIndexOutOfBoundsException e) {
            // OK
        }
    }finally{__CLR4_5_2obhobhlvha7ft6.R.flushNeeded();}}

    /**
     * Tests {@link Conversion#byteToHex(byte, int, String, int, int)}.
     */
    @Test
    public void testByteToHex() {__CLR4_5_2obhobhlvha7ft6.R.globalSliceStart(getClass().getName(),32080);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2s1u4c3or4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2obhobhlvha7ft6.R.rethrow($CLV_t2$);}finally{__CLR4_5_2obhobhlvha7ft6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ConversionTest.testByteToHex",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),32080,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2s1u4c3or4(){try{__CLR4_5_2obhobhlvha7ft6.R.inc(32080);
        __CLR4_5_2obhobhlvha7ft6.R.inc(32081);assertEquals("", Conversion.byteToHex((byte)0x00, 0, "", 0, 0));
        __CLR4_5_2obhobhlvha7ft6.R.inc(32082);assertEquals("", Conversion.byteToHex((byte)0x00, 100, "", 0, 0));
        __CLR4_5_2obhobhlvha7ft6.R.inc(32083);assertEquals("", Conversion.byteToHex((byte)0x00, 0, "", 100, 0));
        __CLR4_5_2obhobhlvha7ft6.R.inc(32084);assertEquals("00000", Conversion.byteToHex((byte)0xEF, 0, "00000", 0, 0));
        __CLR4_5_2obhobhlvha7ft6.R.inc(32085);assertEquals("f0000", Conversion.byteToHex((byte)0xEF, 0, "00000", 0, 1));
        __CLR4_5_2obhobhlvha7ft6.R.inc(32086);assertEquals("fe000", Conversion.byteToHex((byte)0xEF, 0, "00000", 0, 2));
        __CLR4_5_2obhobhlvha7ft6.R.inc(32087);assertEquals("000f0", Conversion.byteToHex((byte)0xEF, 0, "00000", 3, 1));
        __CLR4_5_2obhobhlvha7ft6.R.inc(32088);assertEquals("000fe", Conversion.byteToHex((byte)0xEF, 0, "00000", 3, 2));
        __CLR4_5_2obhobhlvha7ft6.R.inc(32089);assertEquals("70000", Conversion.byteToHex((byte)0xEF, 1, "00000", 0, 1));
        __CLR4_5_2obhobhlvha7ft6.R.inc(32090);assertEquals("b0000", Conversion.byteToHex((byte)0xEF, 2, "00000", 0, 1));
        __CLR4_5_2obhobhlvha7ft6.R.inc(32091);assertEquals("000df", Conversion.byteToHex((byte)0xEF, 3, "00000", 3, 2));
        // assertEquals("00000",Conversion.byteToHex((byte)0xEF, 4,"00000",3,2));//rejected by
        // assertion
        __CLR4_5_2obhobhlvha7ft6.R.inc(32092);assertEquals("000e0", Conversion.byteToHex((byte)0xEF, 4, "00000", 3, 1));
        __CLR4_5_2obhobhlvha7ft6.R.inc(32093);assertEquals("fe", Conversion.byteToHex((byte)0xEF, 0, "", 0, 2));
        __CLR4_5_2obhobhlvha7ft6.R.inc(32094);try {
            __CLR4_5_2obhobhlvha7ft6.R.inc(32095);Conversion.byteToHex((byte)0xEF, 0, "", 1, 2);
            __CLR4_5_2obhobhlvha7ft6.R.inc(32096);fail("Thrown " + StringIndexOutOfBoundsException.class.getName() + " expected");
        } catch (final StringIndexOutOfBoundsException e) {
            // OK
        }
    }finally{__CLR4_5_2obhobhlvha7ft6.R.flushNeeded();}}

    /**
     * Tests {@link Conversion#longToBinary(long, int, boolean[], int, int)}.
     */
    @Test
    public void testLongToBinary() {__CLR4_5_2obhobhlvha7ft6.R.globalSliceStart(getClass().getName(),32097);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ldhykvorl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2obhobhlvha7ft6.R.rethrow($CLV_t2$);}finally{__CLR4_5_2obhobhlvha7ft6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ConversionTest.testLongToBinary",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),32097,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ldhykvorl(){try{__CLR4_5_2obhobhlvha7ft6.R.inc(32097);
        __CLR4_5_2obhobhlvha7ft6.R.inc(32098);assertBinaryEquals(
            new boolean[]{},
            Conversion.longToBinary(0x0000000000000000L, 0, new boolean[]{}, 0, 0));
        __CLR4_5_2obhobhlvha7ft6.R.inc(32099);assertBinaryEquals(
            new boolean[]{},
            Conversion.longToBinary(0x0000000000000000L, 100, new boolean[]{}, 0, 0));
        __CLR4_5_2obhobhlvha7ft6.R.inc(32100);assertBinaryEquals(
            new boolean[]{},
            Conversion.longToBinary(0x0000000000000000L, 0, new boolean[]{}, 100, 0));
        __CLR4_5_2obhobhlvha7ft6.R.inc(32101);assertBinaryEquals(
            new boolean[69],
            Conversion.longToBinary(0x1234567890ABCDEFL, 0, new boolean[69], 0, 0));

        __CLR4_5_2obhobhlvha7ft6.R.inc(32102);assertBinaryEquals(
            new boolean[]{
                true, false, false, false, false, false, false, false, false, false, false,
                false, false, false, false, false, false, false, false, false, false, false,
                false, false, false, false, false, false, false, false, false, false, false,
                false, false, false, false, false, false, false, false, false, false, false,
                false, false, false, false, false, false, false, false, false, false, false,
                false, false, false, false, false, false, false, false, false, false, false,
                false, false, false},
            Conversion.longToBinary(0x1234567890ABCDEFL, 0, new boolean[69], 0, 1));
        __CLR4_5_2obhobhlvha7ft6.R.inc(32103);assertBinaryEquals(
            new boolean[]{
                true, true, false, false, false, false, false, false, false, false, false,
                false, false, false, false, false, false, false, false, false, false, false,
                false, false, false, false, false, false, false, false, false, false, false,
                false, false, false, false, false, false, false, false, false, false, false,
                false, false, false, false, false, false, false, false, false, false, false,
                false, false, false, false, false, false, false, false, false, false, false,
                false, false, false},
            Conversion.longToBinary(0x1234567890ABCDEFL, 0, new boolean[69], 0, 2));
        __CLR4_5_2obhobhlvha7ft6.R.inc(32104);assertBinaryEquals(
            new boolean[]{
                true, true, true, false, false, false, false, false, false, false, false,
                false, false, false, false, false, false, false, false, false, false, false,
                false, false, false, false, false, false, false, false, false, false, false,
                false, false, false, false, false, false, false, false, false, false, false,
                false, false, false, false, false, false, false, false, false, false, false,
                false, false, false, false, false, false, false, false, false, false, false,
                false, false, false},
            Conversion.longToBinary(0x1234567890ABCDEFL, 0, new boolean[69], 0, 3));
        __CLR4_5_2obhobhlvha7ft6.R.inc(32105);assertBinaryEquals(
            new boolean[]{
                true, true, true, true, false, true, true, true, true, false, true, true,
                false, false, true, true, true, true, false, true, false, true, false, true,
                false, false, false, false, true, false, false, true, false, false, false,
                true, true, true, true, false, false, true, true, false, true, false, true,
                false, false, false, true, false, true, true, false, false, false, true, false,
                false, true, false, false, false, false, false, false, false, false},
            Conversion.longToBinary(0x1234567890ABCDEFL, 0, new boolean[69], 0, 63));
        __CLR4_5_2obhobhlvha7ft6.R.inc(32106);assertBinaryEquals(
            new boolean[]{
                true, true, true, true, false, true, true, true, true, false, true, true,
                false, false, true, true, true, true, false, true, false, true, false, true,
                false, false, false, false, true, false, false, true, false, false, false,
                true, true, true, true, false, false, true, true, false, true, false, true,
                false, false, false, true, false, true, true, false, false, false, true, false,
                false, true, false, false, false, false, false, false, false, false},
            Conversion.longToBinary(0x1234567890ABCDEFL, 0, new boolean[69], 0, 64));
        __CLR4_5_2obhobhlvha7ft6.R.inc(32107);assertBinaryEquals(
            new boolean[]{
                false, false, true, false, false, false, false, false, false, false, false,
                false, false, false, false, false, false, false, false, false, false, false,
                false, false, false, false, false, false, false, false, false, false, false,
                false, false, false, false, false, false, false, false, false, false, false,
                false, false, false, false, false, false, false, false, false, false, false,
                false, false, false, false, false, false, false, false, false, false, false,
                false, false, false},
            Conversion.longToBinary(0x1234567890ABCDEFL, 0, new boolean[69], 2, 1));
        __CLR4_5_2obhobhlvha7ft6.R.inc(32108);assertBinaryEquals(
            new boolean[]{
                false, false, true, true, true, true, false, true, true, true, true, false,
                true, true, false, false, true, true, true, true, false, true, false, true,
                false, true, false, false, false, false, true, false, false, true, false,
                false, false, true, true, true, true, false, false, true, true, false, true,
                false, true, false, false, false, true, false, true, true, false, false, false,
                true, false, false, true, false, false, false, false, false, false},
            Conversion.longToBinary(0x1234567890ABCDEFL, 0, new boolean[69], 2, 64));
        __CLR4_5_2obhobhlvha7ft6.R.inc(32109);assertBinaryEquals(
            new boolean[]{
                true, true, true, false, true, true, true, true, false, true, true, false,
                false, true, true, true, true, false, true, false, true, false, true, false,
                false, false, false, true, false, false, true, false, false, false, true, true,
                true, true, false, false, true, true, false, true, false, true, false, false,
                false, true, false, true, true, false, false, false, true, false, false, true,
                false, false, false, false, false, false, false, false, false},
            Conversion.longToBinary(0x1234567890ABCDEFL, 1, new boolean[69], 0, 63));
        __CLR4_5_2obhobhlvha7ft6.R.inc(32110);assertBinaryEquals(
            new boolean[]{
                true, true, false, true, true, true, true, false, true, true, false, false,
                true, true, true, true, false, true, false, true, false, true, false, false,
                false, false, true, false, false, true, false, false, false, true, true, true,
                true, false, false, true, true, false, true, false, true, false, false, false,
                true, false, true, true, false, false, false, true, false, false, true, false,
                false, false, false, false, false, false, false, false, false},
            Conversion.longToBinary(0x1234567890ABCDEFL, 2, new boolean[69], 0, 62));

        // assertBinaryEquals(new boolean[]{false,false,false, true, true, false, true, true,
        // true, true, false, true, true, false, false, true, true, true, true, false, true,
        // false, true, false, true, false, false, false, false, true, false, false, true,
        // false, false, false, true, true, true, true, false, false, true, true, false, true,
        // false, true, false, false, false, true, false, true, true, false, false, false, true,
        // false, false, true, false, false, false
        // ,false,false,false,false},Conversion.longToBinary(0x1234567890ABCDEFL, 2,new
        // boolean[69], 3, 63));//rejected by assertion
        __CLR4_5_2obhobhlvha7ft6.R.inc(32111);assertBinaryEquals(
            new boolean[]{
                false, false, false, true, true, false, true, true, true, true, false, true,
                true, false, false, true, true, true, true, false, true, false, true, false,
                true, false, false, false, false, true, false, false, true, false, false,
                false, true, true, true, true, false, false, true, true, false, true, false,
                true, false, false, false, true, false, true, true, false, false, false, true,
                false, false, true, false, false, false, false, false, false, false},
            Conversion.longToBinary(0x1234567890ABCDEFL, 2, new boolean[69], 3, 62));
    }finally{__CLR4_5_2obhobhlvha7ft6.R.flushNeeded();}}

    /**
     * Tests {@link Conversion#intToBinary(int, int, boolean[], int, int)}.
     */
    @Test
    public void testIntToBinary() {__CLR4_5_2obhobhlvha7ft6.R.globalSliceStart(getClass().getName(),32112);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2awh8psos0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2obhobhlvha7ft6.R.rethrow($CLV_t2$);}finally{__CLR4_5_2obhobhlvha7ft6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ConversionTest.testIntToBinary",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),32112,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2awh8psos0(){try{__CLR4_5_2obhobhlvha7ft6.R.inc(32112);
        __CLR4_5_2obhobhlvha7ft6.R.inc(32113);assertBinaryEquals(
            new boolean[]{}, Conversion.intToBinary(0x00000000, 0, new boolean[]{}, 0, 0));
        __CLR4_5_2obhobhlvha7ft6.R.inc(32114);assertBinaryEquals(
            new boolean[]{}, Conversion.intToBinary(0x00000000, 100, new boolean[]{}, 0, 0));
        __CLR4_5_2obhobhlvha7ft6.R.inc(32115);assertBinaryEquals(
            new boolean[]{}, Conversion.intToBinary(0x00000000, 0, new boolean[]{}, 100, 0));
        __CLR4_5_2obhobhlvha7ft6.R.inc(32116);assertBinaryEquals(
            new boolean[69], Conversion.intToBinary(0x90ABCDEF, 0, new boolean[69], 0, 0));
        __CLR4_5_2obhobhlvha7ft6.R.inc(32117);assertBinaryEquals(new boolean[]{
            true, false, false, false, false, false, false, false, false, false, false, false,
            false, false, false, false, false, false, false, false, false, false, false, false,
            false, false, false, false, false, false, false, false, false, false, false, false,
            false}, Conversion.intToBinary(0x90ABCDEF, 0, new boolean[37], 0, 1));
        __CLR4_5_2obhobhlvha7ft6.R.inc(32118);assertBinaryEquals(new boolean[]{
            true, true, false, false, false, false, false, false, false, false, false, false,
            false, false, false, false, false, false, false, false, false, false, false, false,
            false, false, false, false, false, false, false, false, false, false, false, false,
            false}, Conversion.intToBinary(0x90ABCDEF, 0, new boolean[37], 0, 2));
        __CLR4_5_2obhobhlvha7ft6.R.inc(32119);assertBinaryEquals(new boolean[]{
            true, true, true, false, false, false, false, false, false, false, false, false,
            false, false, false, false, false, false, false, false, false, false, false, false,
            false, false, false, false, false, false, false, false, false, false, false, false,
            false}, Conversion.intToBinary(0x90ABCDEF, 0, new boolean[37], 0, 3));
        __CLR4_5_2obhobhlvha7ft6.R.inc(32120);assertBinaryEquals(
            new boolean[]{
                true, true, true, true, false, true, true, true, true, false, true, true,
                false, false, true, true, true, true, false, true, false, true, false, true,
                false, false, false, false, true, false, false, false, false, false, false,
                false, false}, Conversion.intToBinary(0x90ABCDEF, 0, new boolean[37], 0, 31));
        __CLR4_5_2obhobhlvha7ft6.R.inc(32121);assertBinaryEquals(
            new boolean[]{
                true, true, true, true, false, true, true, true, true, false, true, true,
                false, false, true, true, true, true, false, true, false, true, false, true,
                false, false, false, false, true, false, false, true, false, false, false,
                false, false}, Conversion.intToBinary(0x90ABCDEF, 0, new boolean[37], 0, 32));
        __CLR4_5_2obhobhlvha7ft6.R.inc(32122);assertBinaryEquals(new boolean[]{
            false, false, true, false, false, false, false, false, false, false, false, false,
            false, false, false, false, false, false, false, false, false, false, false, false,
            false, false, false, false, false, false, false, false, false, false, false, false,
            false}, Conversion.intToBinary(0x90ABCDEF, 0, new boolean[37], 2, 1));
        __CLR4_5_2obhobhlvha7ft6.R.inc(32123);assertBinaryEquals(
            new boolean[]{
                false, false, true, true, true, true, false, true, true, true, true, false,
                true, true, false, false, true, true, true, true, false, true, false, true,
                false, true, false, false, false, false, true, false, false, true, false,
                false, false}, Conversion.intToBinary(0x90ABCDEF, 0, new boolean[37], 2, 32));
        __CLR4_5_2obhobhlvha7ft6.R.inc(32124);assertBinaryEquals(
            new boolean[]{
                true, true, true, false, true, true, true, true, false, true, true, false,
                false, true, true, true, true, false, true, false, true, false, true, false,
                false, false, false, true, false, false, true, false, false, false, false,
                false, false}, Conversion.intToBinary(0x90ABCDEF, 1, new boolean[37], 0, 31));
        __CLR4_5_2obhobhlvha7ft6.R.inc(32125);assertBinaryEquals(
            new boolean[]{
                true, true, false, true, true, true, true, false, true, true, false, false,
                true, true, true, true, false, true, false, true, false, true, false, false,
                false, false, true, false, false, true, false, false, false, false, false,
                false, false}, Conversion.intToBinary(0x90ABCDEF, 2, new boolean[37], 0, 30));
        // assertBinaryEquals(new boolean[]{false, false, false, true, true, false, true,
        // true,
        // true, true, false, true, true, false, false, true, true, true, true, false, true,
        // false, true, false, true, false, false, false, false, true, false, false, false,
        // false, false, false, false},Conversion.intToBinary(0x90ABCDEF, 2,new boolean[37],
        // 3,31));//rejected by assertion
        __CLR4_5_2obhobhlvha7ft6.R.inc(32126);assertBinaryEquals(
            new boolean[]{
                false, false, false, true, true, false, true, true, true, true, false, true,
                true, false, false, true, true, true, true, false, true, false, true, false,
                true, false, false, false, false, true, false, false, true, false, false,
                false, false}, Conversion.intToBinary(0x90ABCDEF, 2, new boolean[37], 3, 30));
    }finally{__CLR4_5_2obhobhlvha7ft6.R.flushNeeded();}}

    /**
     * Tests {@link Conversion#shortToBinary(short, int, boolean[], int, int)}.
     */
    @Test
    public void testShortToBinary() {__CLR4_5_2obhobhlvha7ft6.R.globalSliceStart(getClass().getName(),32127);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2lhwemlosf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2obhobhlvha7ft6.R.rethrow($CLV_t2$);}finally{__CLR4_5_2obhobhlvha7ft6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ConversionTest.testShortToBinary",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),32127,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2lhwemlosf(){try{__CLR4_5_2obhobhlvha7ft6.R.inc(32127);
        __CLR4_5_2obhobhlvha7ft6.R.inc(32128);assertBinaryEquals(
            new boolean[]{}, Conversion.shortToBinary((short)0x0000, 0, new boolean[]{}, 0, 0));
        __CLR4_5_2obhobhlvha7ft6.R.inc(32129);assertBinaryEquals(
            new boolean[]{},
            Conversion.shortToBinary((short)0x0000, 100, new boolean[]{}, 0, 0));
        __CLR4_5_2obhobhlvha7ft6.R.inc(32130);assertBinaryEquals(
            new boolean[]{},
            Conversion.shortToBinary((short)0x0000, 0, new boolean[]{}, 100, 0));
        __CLR4_5_2obhobhlvha7ft6.R.inc(32131);assertBinaryEquals(
            new boolean[69], Conversion.shortToBinary((short)0xCDEF, 0, new boolean[69], 0, 0));
        __CLR4_5_2obhobhlvha7ft6.R.inc(32132);assertBinaryEquals(
            new boolean[]{
                true, false, false, false, false, false, false, false, false, false, false,
                false, false, false, false, false, false, false, false, false, false},
            Conversion.shortToBinary((short)0xCDEF, 0, new boolean[21], 0, 1));
        __CLR4_5_2obhobhlvha7ft6.R.inc(32133);assertBinaryEquals(
            new boolean[]{
                true, true, false, false, false, false, false, false, false, false, false,
                false, false, false, false, false, false, false, false, false, false},
            Conversion.shortToBinary((short)0xCDEF, 0, new boolean[21], 0, 2));
        __CLR4_5_2obhobhlvha7ft6.R.inc(32134);assertBinaryEquals(
            new boolean[]{
                true, true, true, false, false, false, false, false, false, false, false,
                false, false, false, false, false, false, false, false, false, false},
            Conversion.shortToBinary((short)0xCDEF, 0, new boolean[21], 0, 3));
        __CLR4_5_2obhobhlvha7ft6.R.inc(32135);assertBinaryEquals(
            new boolean[]{
                true, true, true, true, false, true, true, true, true, false, true, true,
                false, false, true, false, false, false, false, false, false},
            Conversion.shortToBinary((short)0xCDEF, 0, new boolean[21], 0, 15));
        __CLR4_5_2obhobhlvha7ft6.R.inc(32136);assertBinaryEquals(
            new boolean[]{
                true, true, true, true, false, true, true, true, true, false, true, true,
                false, false, true, true, false, false, false, false, false},
            Conversion.shortToBinary((short)0xCDEF, 0, new boolean[21], 0, 16));
        __CLR4_5_2obhobhlvha7ft6.R.inc(32137);assertBinaryEquals(
            new boolean[]{
                false, false, true, false, false, false, false, false, false, false, false,
                false, false, false, false, false, false, false, false, false, false},
            Conversion.shortToBinary((short)0xCDEF, 0, new boolean[21], 2, 1));
        __CLR4_5_2obhobhlvha7ft6.R.inc(32138);assertBinaryEquals(
            new boolean[]{
                false, false, true, true, true, true, false, true, true, true, true, false,
                true, true, false, false, true, true, false, false, false},
            Conversion.shortToBinary((short)0xCDEF, 0, new boolean[21], 2, 16));
        __CLR4_5_2obhobhlvha7ft6.R.inc(32139);assertBinaryEquals(
            new boolean[]{
                true, true, true, false, true, true, true, true, false, true, true, false,
                false, true, true, false, false, false, false, false, false},
            Conversion.shortToBinary((short)0xCDEF, 1, new boolean[21], 0, 15));
        __CLR4_5_2obhobhlvha7ft6.R.inc(32140);assertBinaryEquals(
            new boolean[]{
                true, true, false, true, true, true, true, false, true, true, false, false,
                true, true, false, false, false, false, false, false, false},
            Conversion.shortToBinary((short)0xCDEF, 2, new boolean[21], 0, 14));
        // assertArrayEquals(new boolean[]{false, false, false, true, true, false, true, true,
        // true, true, false, true, true, false, false, true, false, false, false, false,
        // false},Conversion.shortToBinary((short)0xCDEF, 2,new boolean[21],
        // 3,15));//rejected by
        // assertion
        __CLR4_5_2obhobhlvha7ft6.R.inc(32141);assertBinaryEquals(
            new boolean[]{
                false, false, false, true, true, false, true, true, true, true, false, true,
                true, false, false, true, true, false, false, false, false},
            Conversion.shortToBinary((short)0xCDEF, 2, new boolean[21], 3, 14));
    }finally{__CLR4_5_2obhobhlvha7ft6.R.flushNeeded();}}

    /**
     * Tests {@link Conversion#byteToBinary(byte, int, boolean[], int, int)}.
     */
    @Test
    public void testByteToBinary() {__CLR4_5_2obhobhlvha7ft6.R.globalSliceStart(getClass().getName(),32142);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2a1yog3osu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2obhobhlvha7ft6.R.rethrow($CLV_t2$);}finally{__CLR4_5_2obhobhlvha7ft6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ConversionTest.testByteToBinary",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),32142,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2a1yog3osu(){try{__CLR4_5_2obhobhlvha7ft6.R.inc(32142);
        __CLR4_5_2obhobhlvha7ft6.R.inc(32143);assertBinaryEquals(
            new boolean[]{}, Conversion.byteToBinary((byte)0x00, 0, new boolean[]{}, 0, 0));
        __CLR4_5_2obhobhlvha7ft6.R.inc(32144);assertBinaryEquals(
            new boolean[]{}, Conversion.byteToBinary((byte)0x00, 100, new boolean[]{}, 0, 0));
        __CLR4_5_2obhobhlvha7ft6.R.inc(32145);assertBinaryEquals(
            new boolean[]{}, Conversion.byteToBinary((byte)0x00, 0, new boolean[]{}, 100, 0));
        __CLR4_5_2obhobhlvha7ft6.R.inc(32146);assertBinaryEquals(
            new boolean[69], Conversion.byteToBinary((byte)0xEF, 0, new boolean[69], 0, 0));
        __CLR4_5_2obhobhlvha7ft6.R.inc(32147);assertBinaryEquals(new boolean[]{
            true, false, false, false, false, false, false, false, false, false, false, false,
            false}, Conversion.byteToBinary((byte)0x95, 0, new boolean[13], 0, 1));
        __CLR4_5_2obhobhlvha7ft6.R.inc(32148);assertBinaryEquals(new boolean[]{
            true, false, false, false, false, false, false, false, false, false, false, false,
            false}, Conversion.byteToBinary((byte)0x95, 0, new boolean[13], 0, 2));
        __CLR4_5_2obhobhlvha7ft6.R.inc(32149);assertBinaryEquals(new boolean[]{
            true, false, true, false, false, false, false, false, false, false, false, false,
            false}, Conversion.byteToBinary((byte)0x95, 0, new boolean[13], 0, 3));
        __CLR4_5_2obhobhlvha7ft6.R.inc(32150);assertBinaryEquals(new boolean[]{
            true, false, true, false, true, false, false, false, false, false, false, false,
            false}, Conversion.byteToBinary((byte)0x95, 0, new boolean[13], 0, 7));
        __CLR4_5_2obhobhlvha7ft6.R.inc(32151);assertBinaryEquals(new boolean[]{
            true, false, true, false, true, false, false, true, false, false, false, false,
            false}, Conversion.byteToBinary((byte)0x95, 0, new boolean[13], 0, 8));
        __CLR4_5_2obhobhlvha7ft6.R.inc(32152);assertBinaryEquals(new boolean[]{
            false, false, true, false, false, false, false, false, false, false, false, false,
            false}, Conversion.byteToBinary((byte)0x95, 0, new boolean[13], 2, 1));
        __CLR4_5_2obhobhlvha7ft6.R.inc(32153);assertBinaryEquals(new boolean[]{
            false, false, true, false, true, false, true, false, false, true, false, false,
            false}, Conversion.byteToBinary((byte)0x95, 0, new boolean[13], 2, 8));
        __CLR4_5_2obhobhlvha7ft6.R.inc(32154);assertBinaryEquals(new boolean[]{
            false, true, false, true, false, false, true, false, false, false, false, false,
            false}, Conversion.byteToBinary((byte)0x95, 1, new boolean[13], 0, 7));
        __CLR4_5_2obhobhlvha7ft6.R.inc(32155);assertBinaryEquals(new boolean[]{
            true, false, true, false, false, true, false, false, false, false, false, false,
            false}, Conversion.byteToBinary((byte)0x95, 2, new boolean[13], 0, 6));
        // assertArrayEquals(new boolean[]{false, false, false, true, true, false, true, true,
        // false, false, false, false, false},Conversion.byteToBinary((byte)0x95, 2,new
        // boolean[13], 3, 7));//rejected by assertion
        __CLR4_5_2obhobhlvha7ft6.R.inc(32156);assertBinaryEquals(new boolean[]{
            false, false, false, true, false, true, false, false, true, false, false, false,
            false}, Conversion.byteToBinary((byte)0x95, 2, new boolean[13], 3, 6));
    }finally{__CLR4_5_2obhobhlvha7ft6.R.flushNeeded();}}

    /**
     * Tests {@link Conversion#uuidToByteArray(UUID, byte[], int, int)}.
     */
    @Test
    public void testUuidToByteArray() {__CLR4_5_2obhobhlvha7ft6.R.globalSliceStart(getClass().getName(),32157);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2x28vioot9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2obhobhlvha7ft6.R.rethrow($CLV_t2$);}finally{__CLR4_5_2obhobhlvha7ft6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ConversionTest.testUuidToByteArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),32157,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2x28vioot9(){try{__CLR4_5_2obhobhlvha7ft6.R.inc(32157);
        __CLR4_5_2obhobhlvha7ft6.R.inc(32158);assertArrayEquals(new byte[]{
            (byte)0xff, (byte)0xff, (byte)0xff, (byte)0xff, (byte)0xff, (byte)0xff, (byte)0xff,
            (byte)0xff, (byte)0xff, (byte)0xff, (byte)0xff, (byte)0xff, (byte)0xff, (byte)0xff,
            (byte)0xff, (byte)0xff}, Conversion.uuidToByteArray(new UUID(
            0xFFFFFFFFFFFFFFFFL, 0xFFFFFFFFFFFFFFFFL), new byte[16], 0, 16));
        __CLR4_5_2obhobhlvha7ft6.R.inc(32159);assertArrayEquals(new byte[]{
            (byte)0x88, (byte)0x99, (byte)0xaa, (byte)0xbb, (byte)0xcc, (byte)0xdd, (byte)0xee,
            (byte)0xff, (byte)0x00, (byte)0x11, (byte)0x22, (byte)0x33, (byte)0x44, (byte)0x55,
            (byte)0x66, (byte)0x77}, Conversion.uuidToByteArray(new UUID(
            0xFFEEDDCCBBAA9988L, 0x7766554433221100L), new byte[16], 0, 16));
        __CLR4_5_2obhobhlvha7ft6.R.inc(32160);assertArrayEquals(new byte[]{
            (byte)0x00, (byte)0x00, (byte)0x00, (byte)0x00, (byte)0x88, (byte)0x99, (byte)0xaa,
            (byte)0xbb, (byte)0xcc, (byte)0xdd, (byte)0xee, (byte)0xff, (byte)0x00, (byte)0x00,
            (byte)0x00, (byte)0x00}, Conversion.uuidToByteArray(new UUID(
            0xFFEEDDCCBBAA9988L, 0x7766554433221100L), new byte[16], 4, 8));
        __CLR4_5_2obhobhlvha7ft6.R.inc(32161);assertArrayEquals(new byte[]{
            (byte)0x00, (byte)0x00, (byte)0x88, (byte)0x99, (byte)0xaa, (byte)0xbb, (byte)0xcc,
            (byte)0xdd, (byte)0xee, (byte)0xff, (byte)0x00, (byte)0x11, (byte)0x22, (byte)0x33,
            (byte)0x00, (byte)0x00}, Conversion.uuidToByteArray(new UUID(
            0xFFEEDDCCBBAA9988L, 0x7766554433221100L), new byte[16], 2, 12));
    }finally{__CLR4_5_2obhobhlvha7ft6.R.flushNeeded();}}

    /**
     * Tests {@link Conversion#byteArrayToUuid(byte[], int)}.
     */
    @Test
    public void testByteArrayToUuid() {__CLR4_5_2obhobhlvha7ft6.R.globalSliceStart(getClass().getName(),32162);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21x8tukote();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2obhobhlvha7ft6.R.rethrow($CLV_t2$);}finally{__CLR4_5_2obhobhlvha7ft6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ConversionTest.testByteArrayToUuid",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),32162,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21x8tukote(){try{__CLR4_5_2obhobhlvha7ft6.R.inc(32162);
        __CLR4_5_2obhobhlvha7ft6.R.inc(32163);assertEquals(
            new UUID(0xFFFFFFFFFFFFFFFFL, 0xFFFFFFFFFFFFFFFFL),
            Conversion.byteArrayToUuid(new byte[]{
                (byte)0xff, (byte)0xff, (byte)0xff, (byte)0xff, (byte)0xff, (byte)0xff,
                (byte)0xff, (byte)0xff, (byte)0xff, (byte)0xff, (byte)0xff, (byte)0xff,
                (byte)0xff, (byte)0xff, (byte)0xff, (byte)0xff}, 0));
        __CLR4_5_2obhobhlvha7ft6.R.inc(32164);assertEquals(
            new UUID(0xFFEEDDCCBBAA9988L, 0x7766554433221100L),
            Conversion.byteArrayToUuid(new byte[]{
                (byte)0x88, (byte)0x99, (byte)0xaa, (byte)0xbb, (byte)0xcc, (byte)0xdd,
                (byte)0xee, (byte)0xff, (byte)0x00, (byte)0x11, (byte)0x22, (byte)0x33,
                (byte)0x44, (byte)0x55, (byte)0x66, (byte)0x77}, 0));
        __CLR4_5_2obhobhlvha7ft6.R.inc(32165);assertEquals(
            new UUID(0xFFEEDDCCBBAA9988L, 0x7766554433221100L),
            Conversion.byteArrayToUuid(new byte[]{
                0, 0, (byte)0x88, (byte)0x99, (byte)0xaa, (byte)0xbb, (byte)0xcc, (byte)0xdd,
                (byte)0xee, (byte)0xff, (byte)0x00, (byte)0x11, (byte)0x22, (byte)0x33,
                (byte)0x44, (byte)0x55, (byte)0x66, (byte)0x77}, 2));
    }finally{__CLR4_5_2obhobhlvha7ft6.R.flushNeeded();}}
}
