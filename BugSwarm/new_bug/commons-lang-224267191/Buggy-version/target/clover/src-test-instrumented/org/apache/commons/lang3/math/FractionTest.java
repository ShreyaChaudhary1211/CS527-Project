/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
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
 */
package org.apache.commons.lang3.math;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

/**
 * Test cases for the {@link Fraction} class
 */
public class FractionTest  {static class __CLR4_5_2zu7zu7lvha7hvf{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172763741L,8589935092L,47357,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    
    private static final int SKIP = 500;  //53

    //--------------------------------------------------------------------------
    @Test
    public void testConstants() {__CLR4_5_2zu7zu7lvha7hvf.R.globalSliceStart(getClass().getName(),46447);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_25epzlwzu7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2zu7zu7lvha7hvf.R.rethrow($CLV_t2$);}finally{__CLR4_5_2zu7zu7lvha7hvf.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.FractionTest.testConstants",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),46447,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_25epzlwzu7(){try{__CLR4_5_2zu7zu7lvha7hvf.R.inc(46447);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46448);assertEquals(0, Fraction.ZERO.getNumerator());
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46449);assertEquals(1, Fraction.ZERO.getDenominator());
        
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46450);assertEquals(1, Fraction.ONE.getNumerator());
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46451);assertEquals(1, Fraction.ONE.getDenominator());
        
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46452);assertEquals(1, Fraction.ONE_HALF.getNumerator());
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46453);assertEquals(2, Fraction.ONE_HALF.getDenominator());
        
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46454);assertEquals(1, Fraction.ONE_THIRD.getNumerator());
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46455);assertEquals(3, Fraction.ONE_THIRD.getDenominator());
        
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46456);assertEquals(2, Fraction.TWO_THIRDS.getNumerator());
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46457);assertEquals(3, Fraction.TWO_THIRDS.getDenominator());
        
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46458);assertEquals(1, Fraction.ONE_QUARTER.getNumerator());
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46459);assertEquals(4, Fraction.ONE_QUARTER.getDenominator());
        
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46460);assertEquals(2, Fraction.TWO_QUARTERS.getNumerator());
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46461);assertEquals(4, Fraction.TWO_QUARTERS.getDenominator());
        
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46462);assertEquals(3, Fraction.THREE_QUARTERS.getNumerator());
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46463);assertEquals(4, Fraction.THREE_QUARTERS.getDenominator());
        
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46464);assertEquals(1, Fraction.ONE_FIFTH.getNumerator());
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46465);assertEquals(5, Fraction.ONE_FIFTH.getDenominator());
        
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46466);assertEquals(2, Fraction.TWO_FIFTHS.getNumerator());
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46467);assertEquals(5, Fraction.TWO_FIFTHS.getDenominator());
        
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46468);assertEquals(3, Fraction.THREE_FIFTHS.getNumerator());
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46469);assertEquals(5, Fraction.THREE_FIFTHS.getDenominator());
        
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46470);assertEquals(4, Fraction.FOUR_FIFTHS.getNumerator());
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46471);assertEquals(5, Fraction.FOUR_FIFTHS.getDenominator());
    }finally{__CLR4_5_2zu7zu7lvha7hvf.R.flushNeeded();}}

    @Test
    public void testFactory_int_int() {__CLR4_5_2zu7zu7lvha7hvf.R.globalSliceStart(getClass().getName(),46472);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2lgzp33zuw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2zu7zu7lvha7hvf.R.rethrow($CLV_t2$);}finally{__CLR4_5_2zu7zu7lvha7hvf.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.FractionTest.testFactory_int_int",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),46472,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2lgzp33zuw(){try{__CLR4_5_2zu7zu7lvha7hvf.R.inc(46472);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46473);Fraction f = null;
        
        // zero
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46474);f = Fraction.getFraction(0, 1);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46475);assertEquals(0, f.getNumerator());
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46476);assertEquals(1, f.getDenominator());
        
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46477);f = Fraction.getFraction(0, 2);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46478);assertEquals(0, f.getNumerator());
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46479);assertEquals(2, f.getDenominator());
        
        // normal
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46480);f = Fraction.getFraction(1, 1);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46481);assertEquals(1, f.getNumerator());
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46482);assertEquals(1, f.getDenominator());
        
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46483);f = Fraction.getFraction(2, 1);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46484);assertEquals(2, f.getNumerator());
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46485);assertEquals(1, f.getDenominator());
        
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46486);f = Fraction.getFraction(23, 345);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46487);assertEquals(23, f.getNumerator());
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46488);assertEquals(345, f.getDenominator());
        
        // improper
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46489);f = Fraction.getFraction(22, 7);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46490);assertEquals(22, f.getNumerator());
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46491);assertEquals(7, f.getDenominator());
        
        // negatives
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46492);f = Fraction.getFraction(-6, 10);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46493);assertEquals(-6, f.getNumerator());
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46494);assertEquals(10, f.getDenominator());
        
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46495);f = Fraction.getFraction(6, -10);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46496);assertEquals(-6, f.getNumerator());
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46497);assertEquals(10, f.getDenominator());
        
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46498);f = Fraction.getFraction(-6, -10);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46499);assertEquals(6, f.getNumerator());
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46500);assertEquals(10, f.getDenominator());
        
        // zero denominator
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46501);try {
            __CLR4_5_2zu7zu7lvha7hvf.R.inc(46502);f = Fraction.getFraction(1, 0);
            __CLR4_5_2zu7zu7lvha7hvf.R.inc(46503);fail("expecting ArithmeticException");
        } catch (final ArithmeticException ex) {}
        
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46504);try {
            __CLR4_5_2zu7zu7lvha7hvf.R.inc(46505);f = Fraction.getFraction(2, 0);
            __CLR4_5_2zu7zu7lvha7hvf.R.inc(46506);fail("expecting ArithmeticException");
        } catch (final ArithmeticException ex) {}
        
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46507);try {
            __CLR4_5_2zu7zu7lvha7hvf.R.inc(46508);f = Fraction.getFraction(-3, 0);
            __CLR4_5_2zu7zu7lvha7hvf.R.inc(46509);fail("expecting ArithmeticException");
        } catch (final ArithmeticException ex) {}

        // very large: can't represent as unsimplified fraction, although
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46510);try {
            __CLR4_5_2zu7zu7lvha7hvf.R.inc(46511);f = Fraction.getFraction(4, Integer.MIN_VALUE);
            __CLR4_5_2zu7zu7lvha7hvf.R.inc(46512);fail("expecting ArithmeticException");
        } catch (final ArithmeticException ex) {}
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46513);try {
            __CLR4_5_2zu7zu7lvha7hvf.R.inc(46514);f = Fraction.getFraction(1, Integer.MIN_VALUE);
            __CLR4_5_2zu7zu7lvha7hvf.R.inc(46515);fail("expecting ArithmeticException");
        } catch (final ArithmeticException ex) {}
    }finally{__CLR4_5_2zu7zu7lvha7hvf.R.flushNeeded();}}

    @Test
    public void testFactory_int_int_int() {__CLR4_5_2zu7zu7lvha7hvf.R.globalSliceStart(getClass().getName(),46516);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2j6mqr3zw4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2zu7zu7lvha7hvf.R.rethrow($CLV_t2$);}finally{__CLR4_5_2zu7zu7lvha7hvf.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.FractionTest.testFactory_int_int_int",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),46516,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2j6mqr3zw4(){try{__CLR4_5_2zu7zu7lvha7hvf.R.inc(46516);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46517);Fraction f = null;
        
        // zero
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46518);f = Fraction.getFraction(0, 0, 2);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46519);assertEquals(0, f.getNumerator());
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46520);assertEquals(2, f.getDenominator());
        
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46521);f = Fraction.getFraction(2, 0, 2);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46522);assertEquals(4, f.getNumerator());
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46523);assertEquals(2, f.getDenominator());
        
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46524);f = Fraction.getFraction(0, 1, 2);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46525);assertEquals(1, f.getNumerator());
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46526);assertEquals(2, f.getDenominator());
        
        // normal
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46527);f = Fraction.getFraction(1, 1, 2);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46528);assertEquals(3, f.getNumerator());
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46529);assertEquals(2, f.getDenominator());
        
        // negatives
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46530);try {
            __CLR4_5_2zu7zu7lvha7hvf.R.inc(46531);f = Fraction.getFraction(1, -6, -10);
            __CLR4_5_2zu7zu7lvha7hvf.R.inc(46532);fail("expecting ArithmeticException");
        } catch (final ArithmeticException ex) {}

        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46533);try {
            __CLR4_5_2zu7zu7lvha7hvf.R.inc(46534);f = Fraction.getFraction(1, -6, -10);
            __CLR4_5_2zu7zu7lvha7hvf.R.inc(46535);fail("expecting ArithmeticException");
        } catch (final ArithmeticException ex) {}

        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46536);try {
            __CLR4_5_2zu7zu7lvha7hvf.R.inc(46537);f = Fraction.getFraction(1, -6, -10);
            __CLR4_5_2zu7zu7lvha7hvf.R.inc(46538);fail("expecting ArithmeticException");
        } catch (final ArithmeticException ex) {}
        
        // negative whole
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46539);f = Fraction.getFraction(-1, 6, 10);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46540);assertEquals(-16, f.getNumerator());
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46541);assertEquals(10, f.getDenominator());
        
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46542);try {
            __CLR4_5_2zu7zu7lvha7hvf.R.inc(46543);f = Fraction.getFraction(-1, -6, 10);
            __CLR4_5_2zu7zu7lvha7hvf.R.inc(46544);fail("expecting ArithmeticException");
        } catch (final ArithmeticException ex) {}

        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46545);try {
            __CLR4_5_2zu7zu7lvha7hvf.R.inc(46546);f = Fraction.getFraction(-1, 6, -10);
            __CLR4_5_2zu7zu7lvha7hvf.R.inc(46547);fail("expecting ArithmeticException");
        } catch (final ArithmeticException ex) {}
        
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46548);try {
            __CLR4_5_2zu7zu7lvha7hvf.R.inc(46549);f = Fraction.getFraction(-1, -6, -10);
            __CLR4_5_2zu7zu7lvha7hvf.R.inc(46550);fail("expecting ArithmeticException");
        } catch (final ArithmeticException ex) {}
        
        // zero denominator
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46551);try {
            __CLR4_5_2zu7zu7lvha7hvf.R.inc(46552);f = Fraction.getFraction(0, 1, 0);
            __CLR4_5_2zu7zu7lvha7hvf.R.inc(46553);fail("expecting ArithmeticException");
        } catch (final ArithmeticException ex) {}
        
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46554);try {
            __CLR4_5_2zu7zu7lvha7hvf.R.inc(46555);f = Fraction.getFraction(1, 2, 0);
            __CLR4_5_2zu7zu7lvha7hvf.R.inc(46556);fail("expecting ArithmeticException");
        } catch (final ArithmeticException ex) {}
        
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46557);try {
            __CLR4_5_2zu7zu7lvha7hvf.R.inc(46558);f = Fraction.getFraction(-1, -3, 0);
            __CLR4_5_2zu7zu7lvha7hvf.R.inc(46559);fail("expecting ArithmeticException");
        } catch (final ArithmeticException ex) {}
        
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46560);try {
            __CLR4_5_2zu7zu7lvha7hvf.R.inc(46561);f = Fraction.getFraction(Integer.MAX_VALUE, 1, 2); 
            __CLR4_5_2zu7zu7lvha7hvf.R.inc(46562);fail("expecting ArithmeticException");
        } catch (final ArithmeticException ex) {}
        
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46563);try {
            __CLR4_5_2zu7zu7lvha7hvf.R.inc(46564);f = Fraction.getFraction(-Integer.MAX_VALUE, 1, 2);
            __CLR4_5_2zu7zu7lvha7hvf.R.inc(46565);fail("expecting ArithmeticException");
        } catch (final ArithmeticException ex) {}

        // very large
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46566);f = Fraction.getFraction(-1, 0, Integer.MAX_VALUE);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46567);assertEquals(-Integer.MAX_VALUE, f.getNumerator());
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46568);assertEquals(Integer.MAX_VALUE, f.getDenominator());

        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46569);try {
            // negative denominators not allowed in this constructor.
            __CLR4_5_2zu7zu7lvha7hvf.R.inc(46570);f = Fraction.getFraction(0, 4, Integer.MIN_VALUE);
            __CLR4_5_2zu7zu7lvha7hvf.R.inc(46571);fail("expecting ArithmeticException");
        } catch (final ArithmeticException ex) {}
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46572);try {
            __CLR4_5_2zu7zu7lvha7hvf.R.inc(46573);f = Fraction.getFraction(1, 1, Integer.MAX_VALUE);
            __CLR4_5_2zu7zu7lvha7hvf.R.inc(46574);fail("expecting ArithmeticException");
        } catch (final ArithmeticException ex) {}
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46575);try {
            __CLR4_5_2zu7zu7lvha7hvf.R.inc(46576);f = Fraction.getFraction(-1, 2, Integer.MAX_VALUE);
            __CLR4_5_2zu7zu7lvha7hvf.R.inc(46577);fail("expecting ArithmeticException");
        } catch (final ArithmeticException ex) {}
    }finally{__CLR4_5_2zu7zu7lvha7hvf.R.flushNeeded();}}
    @Test
    public void testReducedFactory_int_int() {__CLR4_5_2zu7zu7lvha7hvf.R.globalSliceStart(getClass().getName(),46578);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27ykps5zxu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2zu7zu7lvha7hvf.R.rethrow($CLV_t2$);}finally{__CLR4_5_2zu7zu7lvha7hvf.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.FractionTest.testReducedFactory_int_int",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),46578,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27ykps5zxu(){try{__CLR4_5_2zu7zu7lvha7hvf.R.inc(46578);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46579);Fraction f = null;
        
        // zero
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46580);f = Fraction.getReducedFraction(0, 1);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46581);assertEquals(0, f.getNumerator());
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46582);assertEquals(1, f.getDenominator());
        
        // normal
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46583);f = Fraction.getReducedFraction(1, 1);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46584);assertEquals(1, f.getNumerator());
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46585);assertEquals(1, f.getDenominator());
        
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46586);f = Fraction.getReducedFraction(2, 1);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46587);assertEquals(2, f.getNumerator());
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46588);assertEquals(1, f.getDenominator());
        
        // improper
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46589);f = Fraction.getReducedFraction(22, 7);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46590);assertEquals(22, f.getNumerator());
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46591);assertEquals(7, f.getDenominator());
        
        // negatives
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46592);f = Fraction.getReducedFraction(-6, 10);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46593);assertEquals(-3, f.getNumerator());
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46594);assertEquals(5, f.getDenominator());
        
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46595);f = Fraction.getReducedFraction(6, -10);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46596);assertEquals(-3, f.getNumerator());
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46597);assertEquals(5, f.getDenominator());
        
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46598);f = Fraction.getReducedFraction(-6, -10);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46599);assertEquals(3, f.getNumerator());
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46600);assertEquals(5, f.getDenominator());
        
        // zero denominator
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46601);try {
            __CLR4_5_2zu7zu7lvha7hvf.R.inc(46602);f = Fraction.getReducedFraction(1, 0);
            __CLR4_5_2zu7zu7lvha7hvf.R.inc(46603);fail("expecting ArithmeticException");
        } catch (final ArithmeticException ex) {}
        
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46604);try {
            __CLR4_5_2zu7zu7lvha7hvf.R.inc(46605);f = Fraction.getReducedFraction(2, 0);
            __CLR4_5_2zu7zu7lvha7hvf.R.inc(46606);fail("expecting ArithmeticException");
        } catch (final ArithmeticException ex) {}
        
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46607);try {
            __CLR4_5_2zu7zu7lvha7hvf.R.inc(46608);f = Fraction.getReducedFraction(-3, 0);
            __CLR4_5_2zu7zu7lvha7hvf.R.inc(46609);fail("expecting ArithmeticException");
        } catch (final ArithmeticException ex) {}

        // reduced        
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46610);f = Fraction.getReducedFraction(0, 2);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46611);assertEquals(0, f.getNumerator());
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46612);assertEquals(1, f.getDenominator());
        
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46613);f = Fraction.getReducedFraction(2, 2);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46614);assertEquals(1, f.getNumerator());
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46615);assertEquals(1, f.getDenominator());
        
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46616);f = Fraction.getReducedFraction(2, 4);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46617);assertEquals(1, f.getNumerator());
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46618);assertEquals(2, f.getDenominator());
        
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46619);f = Fraction.getReducedFraction(15, 10);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46620);assertEquals(3, f.getNumerator());
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46621);assertEquals(2, f.getDenominator());
        
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46622);f = Fraction.getReducedFraction(121, 22);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46623);assertEquals(11, f.getNumerator());
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46624);assertEquals(2, f.getDenominator());
        
        // Extreme values 
        // OK, can reduce before negating
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46625);f = Fraction.getReducedFraction(-2, Integer.MIN_VALUE);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46626);assertEquals(1, f.getNumerator());
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46627);assertEquals(-(Integer.MIN_VALUE / 2), f.getDenominator());
        
        // Can't reduce, negation will throw
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46628);try { 
            __CLR4_5_2zu7zu7lvha7hvf.R.inc(46629);f = Fraction.getReducedFraction(-7, Integer.MIN_VALUE);  
            __CLR4_5_2zu7zu7lvha7hvf.R.inc(46630);fail("Expecting ArithmeticException");
        } catch (final ArithmeticException ex) {}      

        // LANG-662
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46631);f = Fraction.getReducedFraction(Integer.MIN_VALUE, 2);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46632);assertEquals(Integer.MIN_VALUE / 2, f.getNumerator());
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46633);assertEquals(1, f.getDenominator());
    }finally{__CLR4_5_2zu7zu7lvha7hvf.R.flushNeeded();}}

    @Test
    public void testFactory_double() {__CLR4_5_2zu7zu7lvha7hvf.R.globalSliceStart(getClass().getName(),46634);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27c3s4fzze();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2zu7zu7lvha7hvf.R.rethrow($CLV_t2$);}finally{__CLR4_5_2zu7zu7lvha7hvf.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.FractionTest.testFactory_double",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),46634,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27c3s4fzze(){try{__CLR4_5_2zu7zu7lvha7hvf.R.inc(46634);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46635);Fraction f = null;
        
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46636);try {
            __CLR4_5_2zu7zu7lvha7hvf.R.inc(46637);f = Fraction.getFraction(Double.NaN);
            __CLR4_5_2zu7zu7lvha7hvf.R.inc(46638);fail("expecting ArithmeticException");
        } catch (final ArithmeticException ex) {}
        
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46639);try {
            __CLR4_5_2zu7zu7lvha7hvf.R.inc(46640);f = Fraction.getFraction(Double.POSITIVE_INFINITY);
            __CLR4_5_2zu7zu7lvha7hvf.R.inc(46641);fail("expecting ArithmeticException");
        } catch (final ArithmeticException ex) {}
        
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46642);try {
            __CLR4_5_2zu7zu7lvha7hvf.R.inc(46643);f = Fraction.getFraction(Double.NEGATIVE_INFINITY);
            __CLR4_5_2zu7zu7lvha7hvf.R.inc(46644);fail("expecting ArithmeticException");
        } catch (final ArithmeticException ex) {}
        
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46645);try {
            __CLR4_5_2zu7zu7lvha7hvf.R.inc(46646);f = Fraction.getFraction((double) Integer.MAX_VALUE + 1);
            __CLR4_5_2zu7zu7lvha7hvf.R.inc(46647);fail("expecting ArithmeticException");
        } catch (final ArithmeticException ex) {}
        
        // zero
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46648);f = Fraction.getFraction(0.0d);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46649);assertEquals(0, f.getNumerator());
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46650);assertEquals(1, f.getDenominator());
        
        // one
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46651);f = Fraction.getFraction(1.0d);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46652);assertEquals(1, f.getNumerator());
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46653);assertEquals(1, f.getDenominator());
        
        // one half
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46654);f = Fraction.getFraction(0.5d);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46655);assertEquals(1, f.getNumerator());
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46656);assertEquals(2, f.getDenominator());
        
        // negative
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46657);f = Fraction.getFraction(-0.875d);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46658);assertEquals(-7, f.getNumerator());
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46659);assertEquals(8, f.getDenominator());
        
        // over 1
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46660);f = Fraction.getFraction(1.25d);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46661);assertEquals(5, f.getNumerator());
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46662);assertEquals(4, f.getDenominator());
        
        // two thirds
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46663);f = Fraction.getFraction(0.66666d);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46664);assertEquals(2, f.getNumerator());
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46665);assertEquals(3, f.getDenominator());
        
        // small
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46666);f = Fraction.getFraction(1.0d/10001d);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46667);assertEquals(0, f.getNumerator());
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46668);assertEquals(1, f.getDenominator());
        
        // normal
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46669);Fraction f2 = null;
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46670);for (int i = 1; (((i <= 100)&&(__CLR4_5_2zu7zu7lvha7hvf.R.iget(46671)!=0|true))||(__CLR4_5_2zu7zu7lvha7hvf.R.iget(46672)==0&false)); i++) {{  // denominator
            __CLR4_5_2zu7zu7lvha7hvf.R.inc(46673);for (int j = 1; (((j <= i)&&(__CLR4_5_2zu7zu7lvha7hvf.R.iget(46674)!=0|true))||(__CLR4_5_2zu7zu7lvha7hvf.R.iget(46675)==0&false)); j++) {{  // numerator
                __CLR4_5_2zu7zu7lvha7hvf.R.inc(46676);try {
                    __CLR4_5_2zu7zu7lvha7hvf.R.inc(46677);f = Fraction.getFraction((double) j / (double) i);
                } catch (final ArithmeticException ex) {
                    __CLR4_5_2zu7zu7lvha7hvf.R.inc(46678);System.err.println(j + " " + i);
                    __CLR4_5_2zu7zu7lvha7hvf.R.inc(46679);throw ex;
                }
                __CLR4_5_2zu7zu7lvha7hvf.R.inc(46680);f2 = Fraction.getReducedFraction(j, i);
                __CLR4_5_2zu7zu7lvha7hvf.R.inc(46681);assertEquals(f2.getNumerator(), f.getNumerator());
                __CLR4_5_2zu7zu7lvha7hvf.R.inc(46682);assertEquals(f2.getDenominator(), f.getDenominator());
            }
        }}
        // save time by skipping some tests!  (
        }__CLR4_5_2zu7zu7lvha7hvf.R.inc(46683);for (int i = 1001; (((i <= 10000)&&(__CLR4_5_2zu7zu7lvha7hvf.R.iget(46684)!=0|true))||(__CLR4_5_2zu7zu7lvha7hvf.R.iget(46685)==0&false)); i+=SKIP) {{  // denominator
            __CLR4_5_2zu7zu7lvha7hvf.R.inc(46686);for (int j = 1; (((j <= i)&&(__CLR4_5_2zu7zu7lvha7hvf.R.iget(46687)!=0|true))||(__CLR4_5_2zu7zu7lvha7hvf.R.iget(46688)==0&false)); j++) {{  // numerator
                __CLR4_5_2zu7zu7lvha7hvf.R.inc(46689);try {
                    __CLR4_5_2zu7zu7lvha7hvf.R.inc(46690);f = Fraction.getFraction((double) j / (double) i);
                } catch (final ArithmeticException ex) {
                    __CLR4_5_2zu7zu7lvha7hvf.R.inc(46691);System.err.println(j + " " + i);
                    __CLR4_5_2zu7zu7lvha7hvf.R.inc(46692);throw ex;
                }
                __CLR4_5_2zu7zu7lvha7hvf.R.inc(46693);f2 = Fraction.getReducedFraction(j, i);
                __CLR4_5_2zu7zu7lvha7hvf.R.inc(46694);assertEquals(f2.getNumerator(), f.getNumerator());
                __CLR4_5_2zu7zu7lvha7hvf.R.inc(46695);assertEquals(f2.getDenominator(), f.getDenominator());
            }
        }}
    }}finally{__CLR4_5_2zu7zu7lvha7hvf.R.flushNeeded();}}

    @Test(expected=IllegalArgumentException.class)
    public void testFactory_String() {__CLR4_5_2zu7zu7lvha7hvf.R.globalSliceStart(getClass().getName(),46696);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2c7gw3j1014();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,70,97,99,116,111,114,121,95,83,116,114,105,110,103,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2zu7zu7lvha7hvf.R.rethrow($CLV_t2$);}finally{__CLR4_5_2zu7zu7lvha7hvf.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.FractionTest.testFactory_String",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),46696,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2c7gw3j1014(){try{__CLR4_5_2zu7zu7lvha7hvf.R.inc(46696);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46697);Fraction.getFraction(null);
    }finally{__CLR4_5_2zu7zu7lvha7hvf.R.flushNeeded();}}
    
    
    @Test
    public void testFactory_String_double() {__CLR4_5_2zu7zu7lvha7hvf.R.globalSliceStart(getClass().getName(),46698);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2lwapdr1016();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2zu7zu7lvha7hvf.R.rethrow($CLV_t2$);}finally{__CLR4_5_2zu7zu7lvha7hvf.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.FractionTest.testFactory_String_double",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),46698,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2lwapdr1016(){try{__CLR4_5_2zu7zu7lvha7hvf.R.inc(46698);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46699);Fraction f = null;
        
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46700);f = Fraction.getFraction("0.0");
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46701);assertEquals(0, f.getNumerator());
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46702);assertEquals(1, f.getDenominator());
        
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46703);f = Fraction.getFraction("0.2");
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46704);assertEquals(1, f.getNumerator());
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46705);assertEquals(5, f.getDenominator());
        
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46706);f = Fraction.getFraction("0.5");
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46707);assertEquals(1, f.getNumerator());
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46708);assertEquals(2, f.getDenominator());
        
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46709);f = Fraction.getFraction("0.66666");
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46710);assertEquals(2, f.getNumerator());
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46711);assertEquals(3, f.getDenominator());
        
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46712);try {
            __CLR4_5_2zu7zu7lvha7hvf.R.inc(46713);f = Fraction.getFraction("2.3R");
            __CLR4_5_2zu7zu7lvha7hvf.R.inc(46714);fail("Expecting NumberFormatException");
        } catch (final NumberFormatException ex) {}
        
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46715);try {
            __CLR4_5_2zu7zu7lvha7hvf.R.inc(46716);f = Fraction.getFraction("2147483648"); // too big
            __CLR4_5_2zu7zu7lvha7hvf.R.inc(46717);fail("Expecting NumberFormatException");
        } catch (final NumberFormatException ex) {}
        
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46718);try {
            __CLR4_5_2zu7zu7lvha7hvf.R.inc(46719);f = Fraction.getFraction(".");
            __CLR4_5_2zu7zu7lvha7hvf.R.inc(46720);fail("Expecting NumberFormatException");
        } catch (final NumberFormatException ex) {}
    }finally{__CLR4_5_2zu7zu7lvha7hvf.R.flushNeeded();}}

    @Test
    public void testFactory_String_proper() {__CLR4_5_2zu7zu7lvha7hvf.R.globalSliceStart(getClass().getName(),46721);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2k8blwe101t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2zu7zu7lvha7hvf.R.rethrow($CLV_t2$);}finally{__CLR4_5_2zu7zu7lvha7hvf.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.FractionTest.testFactory_String_proper",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),46721,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2k8blwe101t(){try{__CLR4_5_2zu7zu7lvha7hvf.R.inc(46721);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46722);Fraction f = null;
        
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46723);f = Fraction.getFraction("0 0/1");
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46724);assertEquals(0, f.getNumerator());
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46725);assertEquals(1, f.getDenominator());
        
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46726);f = Fraction.getFraction("1 1/5");
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46727);assertEquals(6, f.getNumerator());
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46728);assertEquals(5, f.getDenominator());
        
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46729);f = Fraction.getFraction("7 1/2");
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46730);assertEquals(15, f.getNumerator());
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46731);assertEquals(2, f.getDenominator());
        
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46732);f = Fraction.getFraction("1 2/4");
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46733);assertEquals(6, f.getNumerator());
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46734);assertEquals(4, f.getDenominator());
        
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46735);f = Fraction.getFraction("-7 1/2");
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46736);assertEquals(-15, f.getNumerator());
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46737);assertEquals(2, f.getDenominator());
        
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46738);f = Fraction.getFraction("-1 2/4");
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46739);assertEquals(-6, f.getNumerator());
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46740);assertEquals(4, f.getDenominator());
        
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46741);try {
            __CLR4_5_2zu7zu7lvha7hvf.R.inc(46742);f = Fraction.getFraction("2 3");
            __CLR4_5_2zu7zu7lvha7hvf.R.inc(46743);fail("expecting NumberFormatException");
        } catch (final NumberFormatException ex) {}
        
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46744);try {
            __CLR4_5_2zu7zu7lvha7hvf.R.inc(46745);f = Fraction.getFraction("a 3");
            __CLR4_5_2zu7zu7lvha7hvf.R.inc(46746);fail("expecting NumberFormatException");
        } catch (final NumberFormatException ex) {}
        
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46747);try {
            __CLR4_5_2zu7zu7lvha7hvf.R.inc(46748);f = Fraction.getFraction("2 b/4");
            __CLR4_5_2zu7zu7lvha7hvf.R.inc(46749);fail("expecting NumberFormatException");
        } catch (final NumberFormatException ex) {}
        
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46750);try {
            __CLR4_5_2zu7zu7lvha7hvf.R.inc(46751);f = Fraction.getFraction("2 ");
            __CLR4_5_2zu7zu7lvha7hvf.R.inc(46752);fail("expecting NumberFormatException");
        } catch (final NumberFormatException ex) {}

        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46753);try {
            __CLR4_5_2zu7zu7lvha7hvf.R.inc(46754);f = Fraction.getFraction(" 3");
            __CLR4_5_2zu7zu7lvha7hvf.R.inc(46755);fail("expecting NumberFormatException");
        } catch (final NumberFormatException ex) {}
        
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46756);try {
            __CLR4_5_2zu7zu7lvha7hvf.R.inc(46757);f = Fraction.getFraction(" ");
            __CLR4_5_2zu7zu7lvha7hvf.R.inc(46758);fail("expecting NumberFormatException");
        } catch (final NumberFormatException ex) {}
    }finally{__CLR4_5_2zu7zu7lvha7hvf.R.flushNeeded();}}

    @Test
    public void testFactory_String_improper() {__CLR4_5_2zu7zu7lvha7hvf.R.globalSliceStart(getClass().getName(),46759);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2z9dhmq102v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2zu7zu7lvha7hvf.R.rethrow($CLV_t2$);}finally{__CLR4_5_2zu7zu7lvha7hvf.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.FractionTest.testFactory_String_improper",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),46759,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2z9dhmq102v(){try{__CLR4_5_2zu7zu7lvha7hvf.R.inc(46759);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46760);Fraction f = null;
        
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46761);f = Fraction.getFraction("0/1");
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46762);assertEquals(0, f.getNumerator());
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46763);assertEquals(1, f.getDenominator());
        
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46764);f = Fraction.getFraction("1/5");
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46765);assertEquals(1, f.getNumerator());
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46766);assertEquals(5, f.getDenominator());
        
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46767);f = Fraction.getFraction("1/2");
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46768);assertEquals(1, f.getNumerator());
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46769);assertEquals(2, f.getDenominator());
        
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46770);f = Fraction.getFraction("2/3");
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46771);assertEquals(2, f.getNumerator());
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46772);assertEquals(3, f.getDenominator());
        
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46773);f = Fraction.getFraction("7/3");
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46774);assertEquals(7, f.getNumerator());
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46775);assertEquals(3, f.getDenominator());
        
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46776);f = Fraction.getFraction("2/4");
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46777);assertEquals(2, f.getNumerator());
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46778);assertEquals(4, f.getDenominator());
        
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46779);try {
            __CLR4_5_2zu7zu7lvha7hvf.R.inc(46780);f = Fraction.getFraction("2/d");
            __CLR4_5_2zu7zu7lvha7hvf.R.inc(46781);fail("expecting NumberFormatException");
        } catch (final NumberFormatException ex) {}
        
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46782);try {
            __CLR4_5_2zu7zu7lvha7hvf.R.inc(46783);f = Fraction.getFraction("2e/3");
            __CLR4_5_2zu7zu7lvha7hvf.R.inc(46784);fail("expecting NumberFormatException");
        } catch (final NumberFormatException ex) {}
        
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46785);try {
            __CLR4_5_2zu7zu7lvha7hvf.R.inc(46786);f = Fraction.getFraction("2/");
            __CLR4_5_2zu7zu7lvha7hvf.R.inc(46787);fail("expecting NumberFormatException");
        } catch (final NumberFormatException ex) {}
        
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46788);try {
            __CLR4_5_2zu7zu7lvha7hvf.R.inc(46789);f = Fraction.getFraction("/");
            __CLR4_5_2zu7zu7lvha7hvf.R.inc(46790);fail("expecting NumberFormatException");
        } catch (final NumberFormatException ex) {}
    }finally{__CLR4_5_2zu7zu7lvha7hvf.R.flushNeeded();}}

    @Test
    public void testGets() {__CLR4_5_2zu7zu7lvha7hvf.R.globalSliceStart(getClass().getName(),46791);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2whtq8a103r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2zu7zu7lvha7hvf.R.rethrow($CLV_t2$);}finally{__CLR4_5_2zu7zu7lvha7hvf.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.FractionTest.testGets",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),46791,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2whtq8a103r(){try{__CLR4_5_2zu7zu7lvha7hvf.R.inc(46791);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46792);Fraction f = null;
        
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46793);f = Fraction.getFraction(3, 5, 6);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46794);assertEquals(23, f.getNumerator());
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46795);assertEquals(3, f.getProperWhole());
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46796);assertEquals(5, f.getProperNumerator());
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46797);assertEquals(6, f.getDenominator());
        
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46798);f = Fraction.getFraction(-3, 5, 6);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46799);assertEquals(-23, f.getNumerator());
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46800);assertEquals(-3, f.getProperWhole());
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46801);assertEquals(5, f.getProperNumerator());
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46802);assertEquals(6, f.getDenominator());

        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46803);f = Fraction.getFraction(Integer.MIN_VALUE, 0, 1);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46804);assertEquals(Integer.MIN_VALUE, f.getNumerator());
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46805);assertEquals(Integer.MIN_VALUE, f.getProperWhole());
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46806);assertEquals(0, f.getProperNumerator());
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46807);assertEquals(1, f.getDenominator());
    }finally{__CLR4_5_2zu7zu7lvha7hvf.R.flushNeeded();}}
            
    @Test
    public void testConversions() {__CLR4_5_2zu7zu7lvha7hvf.R.globalSliceStart(getClass().getName(),46808);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ei559q1048();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2zu7zu7lvha7hvf.R.rethrow($CLV_t2$);}finally{__CLR4_5_2zu7zu7lvha7hvf.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.FractionTest.testConversions",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),46808,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ei559q1048(){try{__CLR4_5_2zu7zu7lvha7hvf.R.inc(46808);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46809);Fraction f = null;
        
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46810);f = Fraction.getFraction(3, 7, 8);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46811);assertEquals(3, f.intValue());
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46812);assertEquals(3L, f.longValue());
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46813);assertEquals(3.875f, f.floatValue(), 0.00001f);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46814);assertEquals(3.875d, f.doubleValue(), 0.00001d);
    }finally{__CLR4_5_2zu7zu7lvha7hvf.R.flushNeeded();}}
    
    @Test
    public void testReduce() {__CLR4_5_2zu7zu7lvha7hvf.R.globalSliceStart(getClass().getName(),46815);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2wogq1r104f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2zu7zu7lvha7hvf.R.rethrow($CLV_t2$);}finally{__CLR4_5_2zu7zu7lvha7hvf.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.FractionTest.testReduce",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),46815,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2wogq1r104f(){try{__CLR4_5_2zu7zu7lvha7hvf.R.inc(46815);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46816);Fraction f = null;
        
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46817);f = Fraction.getFraction(50, 75);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46818);Fraction result = f.reduce();
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46819);assertEquals(2, result.getNumerator());
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46820);assertEquals(3, result.getDenominator());

        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46821);f = Fraction.getFraction(-2, -3);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46822);result = f.reduce();
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46823);assertEquals(2, result.getNumerator());
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46824);assertEquals(3, result.getDenominator());

        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46825);f = Fraction.getFraction(2, -3);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46826);result = f.reduce();
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46827);assertEquals(-2, result.getNumerator());
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46828);assertEquals(3, result.getDenominator());

        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46829);f = Fraction.getFraction(-2, 3);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46830);result = f.reduce();
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46831);assertEquals(-2, result.getNumerator());
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46832);assertEquals(3, result.getDenominator());
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46833);assertSame(f, result);

        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46834);f = Fraction.getFraction(2, 3);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46835);result = f.reduce();
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46836);assertEquals(2, result.getNumerator());
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46837);assertEquals(3, result.getDenominator());
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46838);assertSame(f, result);

        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46839);f = Fraction.getFraction(0, 1);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46840);result = f.reduce();
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46841);assertEquals(0, result.getNumerator());
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46842);assertEquals(1, result.getDenominator());
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46843);assertSame(f, result);

        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46844);f = Fraction.getFraction(0, 100);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46845);result = f.reduce();
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46846);assertEquals(0, result.getNumerator());
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46847);assertEquals(1, result.getDenominator());
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46848);assertSame(result, Fraction.ZERO);

        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46849);f = Fraction.getFraction(Integer.MIN_VALUE, 2);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46850);result = f.reduce();
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46851);assertEquals(Integer.MIN_VALUE / 2, result.getNumerator());
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46852);assertEquals(1, result.getDenominator());
    }finally{__CLR4_5_2zu7zu7lvha7hvf.R.flushNeeded();}}
    
    @Test
    public void testInvert() {__CLR4_5_2zu7zu7lvha7hvf.R.globalSliceStart(getClass().getName(),46853);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2oxt7in105h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2zu7zu7lvha7hvf.R.rethrow($CLV_t2$);}finally{__CLR4_5_2zu7zu7lvha7hvf.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.FractionTest.testInvert",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),46853,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2oxt7in105h(){try{__CLR4_5_2zu7zu7lvha7hvf.R.inc(46853);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46854);Fraction f = null;
        
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46855);f = Fraction.getFraction(50, 75);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46856);f = f.invert();
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46857);assertEquals(75, f.getNumerator());
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46858);assertEquals(50, f.getDenominator());
        
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46859);f = Fraction.getFraction(4, 3);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46860);f = f.invert();
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46861);assertEquals(3, f.getNumerator());
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46862);assertEquals(4, f.getDenominator());
        
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46863);f = Fraction.getFraction(-15, 47);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46864);f = f.invert();
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46865);assertEquals(-47, f.getNumerator());
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46866);assertEquals(15, f.getDenominator());
        
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46867);f = Fraction.getFraction(0, 3);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46868);try {
            __CLR4_5_2zu7zu7lvha7hvf.R.inc(46869);f = f.invert();
            __CLR4_5_2zu7zu7lvha7hvf.R.inc(46870);fail("expecting ArithmeticException");
        } catch (final ArithmeticException ex) {}

        // large values
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46871);f = Fraction.getFraction(Integer.MIN_VALUE, 1);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46872);try {
            __CLR4_5_2zu7zu7lvha7hvf.R.inc(46873);f = f.invert();
            __CLR4_5_2zu7zu7lvha7hvf.R.inc(46874);fail("expecting ArithmeticException");
        } catch (final ArithmeticException ex) {}

        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46875);f = Fraction.getFraction(Integer.MAX_VALUE, 1);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46876);f = f.invert();
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46877);assertEquals(1, f.getNumerator());
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46878);assertEquals(Integer.MAX_VALUE, f.getDenominator());
    }finally{__CLR4_5_2zu7zu7lvha7hvf.R.flushNeeded();}}
    
    @Test
    public void testNegate() {__CLR4_5_2zu7zu7lvha7hvf.R.globalSliceStart(getClass().getName(),46879);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ffqfwl1067();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2zu7zu7lvha7hvf.R.rethrow($CLV_t2$);}finally{__CLR4_5_2zu7zu7lvha7hvf.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.FractionTest.testNegate",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),46879,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ffqfwl1067(){try{__CLR4_5_2zu7zu7lvha7hvf.R.inc(46879);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46880);Fraction f = null;
        
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46881);f = Fraction.getFraction(50, 75);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46882);f = f.negate();
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46883);assertEquals(-50, f.getNumerator());
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46884);assertEquals(75, f.getDenominator());
        
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46885);f = Fraction.getFraction(-50, 75);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46886);f = f.negate();
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46887);assertEquals(50, f.getNumerator());
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46888);assertEquals(75, f.getDenominator());

        // large values
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46889);f = Fraction.getFraction(Integer.MAX_VALUE-1, Integer.MAX_VALUE);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46890);f = f.negate();
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46891);assertEquals(Integer.MIN_VALUE+2, f.getNumerator());
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46892);assertEquals(Integer.MAX_VALUE, f.getDenominator());

        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46893);f = Fraction.getFraction(Integer.MIN_VALUE, 1);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46894);try {
            __CLR4_5_2zu7zu7lvha7hvf.R.inc(46895);f = f.negate();
            __CLR4_5_2zu7zu7lvha7hvf.R.inc(46896);fail("expecting ArithmeticException");
        } catch (final ArithmeticException ex) {}
    }finally{__CLR4_5_2zu7zu7lvha7hvf.R.flushNeeded();}}
    
    @Test
    public void testAbs() {__CLR4_5_2zu7zu7lvha7hvf.R.globalSliceStart(getClass().getName(),46897);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2l56wuf106p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2zu7zu7lvha7hvf.R.rethrow($CLV_t2$);}finally{__CLR4_5_2zu7zu7lvha7hvf.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.FractionTest.testAbs",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),46897,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2l56wuf106p(){try{__CLR4_5_2zu7zu7lvha7hvf.R.inc(46897);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46898);Fraction f = null;
        
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46899);f = Fraction.getFraction(50, 75);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46900);f = f.abs();
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46901);assertEquals(50, f.getNumerator());
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46902);assertEquals(75, f.getDenominator());
        
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46903);f = Fraction.getFraction(-50, 75);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46904);f = f.abs();
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46905);assertEquals(50, f.getNumerator());
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46906);assertEquals(75, f.getDenominator());

        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46907);f = Fraction.getFraction(Integer.MAX_VALUE, 1);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46908);f = f.abs();
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46909);assertEquals(Integer.MAX_VALUE, f.getNumerator());
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46910);assertEquals(1, f.getDenominator());

        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46911);f = Fraction.getFraction(Integer.MAX_VALUE, -1);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46912);f = f.abs();
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46913);assertEquals(Integer.MAX_VALUE, f.getNumerator());
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46914);assertEquals(1, f.getDenominator());

        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46915);f = Fraction.getFraction(Integer.MIN_VALUE, 1);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46916);try {
            __CLR4_5_2zu7zu7lvha7hvf.R.inc(46917);f = f.abs();
            __CLR4_5_2zu7zu7lvha7hvf.R.inc(46918);fail("expecting ArithmeticException");
        } catch (final ArithmeticException ex) {}
    }finally{__CLR4_5_2zu7zu7lvha7hvf.R.flushNeeded();}}
    
    @Test
    public void testPow() {__CLR4_5_2zu7zu7lvha7hvf.R.globalSliceStart(getClass().getName(),46919);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2xazw8d107b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2zu7zu7lvha7hvf.R.rethrow($CLV_t2$);}finally{__CLR4_5_2zu7zu7lvha7hvf.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.FractionTest.testPow",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),46919,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2xazw8d107b(){try{__CLR4_5_2zu7zu7lvha7hvf.R.inc(46919);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46920);Fraction f = null;
        
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46921);f = Fraction.getFraction(3, 5);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46922);assertEquals(Fraction.ONE, f.pow(0));
        
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46923);f = Fraction.getFraction(3, 5);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46924);assertSame(f, f.pow(1));
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46925);assertEquals(f, f.pow(1));

        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46926);f = Fraction.getFraction(3, 5);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46927);f = f.pow(2);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46928);assertEquals(9, f.getNumerator());
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46929);assertEquals(25, f.getDenominator());
        
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46930);f = Fraction.getFraction(3, 5);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46931);f = f.pow(3);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46932);assertEquals(27, f.getNumerator());
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46933);assertEquals(125, f.getDenominator());
        
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46934);f = Fraction.getFraction(3, 5);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46935);f = f.pow(-1);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46936);assertEquals(5, f.getNumerator());
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46937);assertEquals(3, f.getDenominator());
        
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46938);f = Fraction.getFraction(3, 5);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46939);f = f.pow(-2);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46940);assertEquals(25, f.getNumerator());
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46941);assertEquals(9, f.getDenominator());
        
        // check unreduced fractions stay that way.
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46942);f = Fraction.getFraction(6, 10);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46943);assertEquals(Fraction.ONE, f.pow(0));
        
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46944);f = Fraction.getFraction(6, 10);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46945);assertEquals(f, f.pow(1));
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46946);assertFalse(f.pow(1).equals(Fraction.getFraction(3,5)));

        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46947);f = Fraction.getFraction(6, 10);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46948);f = f.pow(2);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46949);assertEquals(9, f.getNumerator());
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46950);assertEquals(25, f.getDenominator());
        
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46951);f = Fraction.getFraction(6, 10);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46952);f = f.pow(3);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46953);assertEquals(27, f.getNumerator());
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46954);assertEquals(125, f.getDenominator());
        
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46955);f = Fraction.getFraction(6, 10);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46956);f = f.pow(-1);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46957);assertEquals(10, f.getNumerator());
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46958);assertEquals(6, f.getDenominator());
        
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46959);f = Fraction.getFraction(6, 10);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46960);f = f.pow(-2);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46961);assertEquals(25, f.getNumerator());
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46962);assertEquals(9, f.getDenominator());
        
        // zero to any positive power is still zero.
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46963);f = Fraction.getFraction(0, 1231);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46964);f = f.pow(1);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46965);assertTrue(0==f.compareTo(Fraction.ZERO));
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46966);assertEquals(0, f.getNumerator());
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46967);assertEquals(1231, f.getDenominator());
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46968);f = f.pow(2);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46969);assertTrue(0==f.compareTo(Fraction.ZERO));
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46970);assertEquals(0, f.getNumerator());
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46971);assertEquals(1, f.getDenominator());

        // zero to negative powers should throw an exception
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46972);try {
            __CLR4_5_2zu7zu7lvha7hvf.R.inc(46973);f = f.pow(-1);
            __CLR4_5_2zu7zu7lvha7hvf.R.inc(46974);fail("expecting ArithmeticException");
        } catch (final ArithmeticException ex) {}
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46975);try {
            __CLR4_5_2zu7zu7lvha7hvf.R.inc(46976);f = f.pow(Integer.MIN_VALUE);
            __CLR4_5_2zu7zu7lvha7hvf.R.inc(46977);fail("expecting ArithmeticException");
        } catch (final ArithmeticException ex) {}

        // one to any power is still one.
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46978);f = Fraction.getFraction(1, 1);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46979);f = f.pow(0);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46980);assertEquals(f, Fraction.ONE);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46981);f = f.pow(1);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46982);assertEquals(f, Fraction.ONE);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46983);f = f.pow(-1);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46984);assertEquals(f, Fraction.ONE);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46985);f = f.pow(Integer.MAX_VALUE);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46986);assertEquals(f, Fraction.ONE);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46987);f = f.pow(Integer.MIN_VALUE);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46988);assertEquals(f, Fraction.ONE);

        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46989);f = Fraction.getFraction(Integer.MAX_VALUE, 1);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46990);try {
            __CLR4_5_2zu7zu7lvha7hvf.R.inc(46991);f = f.pow(2);
            __CLR4_5_2zu7zu7lvha7hvf.R.inc(46992);fail("expecting ArithmeticException");
        } catch (final ArithmeticException ex) {}

        // Numerator growing too negative during the pow operation.
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46993);f = Fraction.getFraction(Integer.MIN_VALUE, 1);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46994);try {
            __CLR4_5_2zu7zu7lvha7hvf.R.inc(46995);f = f.pow(3);
            __CLR4_5_2zu7zu7lvha7hvf.R.inc(46996);fail("expecting ArithmeticException");
        } catch (final ArithmeticException ex) {}

        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46997);f = Fraction.getFraction(65536, 1);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(46998);try {
            __CLR4_5_2zu7zu7lvha7hvf.R.inc(46999);f = f.pow(2);
            __CLR4_5_2zu7zu7lvha7hvf.R.inc(47000);fail("expecting ArithmeticException");
        } catch (final ArithmeticException ex) {}
    }finally{__CLR4_5_2zu7zu7lvha7hvf.R.flushNeeded();}}
    
    @Test
    public void testAdd() {__CLR4_5_2zu7zu7lvha7hvf.R.globalSliceStart(getClass().getName(),47001);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vtx82e109l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2zu7zu7lvha7hvf.R.rethrow($CLV_t2$);}finally{__CLR4_5_2zu7zu7lvha7hvf.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.FractionTest.testAdd",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),47001,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vtx82e109l(){try{__CLR4_5_2zu7zu7lvha7hvf.R.inc(47001);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47002);Fraction f = null;
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47003);Fraction f1 = null;
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47004);Fraction f2 = null;
        
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47005);f1 = Fraction.getFraction(3, 5);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47006);f2 = Fraction.getFraction(1, 5);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47007);f = f1.add(f2);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47008);assertEquals(4, f.getNumerator());
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47009);assertEquals(5, f.getDenominator());
        
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47010);f1 = Fraction.getFraction(3, 5);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47011);f2 = Fraction.getFraction(2, 5);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47012);f = f1.add(f2);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47013);assertEquals(1, f.getNumerator());
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47014);assertEquals(1, f.getDenominator());
        
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47015);f1 = Fraction.getFraction(3, 5);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47016);f2 = Fraction.getFraction(3, 5);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47017);f = f1.add(f2);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47018);assertEquals(6, f.getNumerator());
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47019);assertEquals(5, f.getDenominator());
        
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47020);f1 = Fraction.getFraction(3, 5);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47021);f2 = Fraction.getFraction(-4, 5);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47022);f = f1.add(f2);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47023);assertEquals(-1, f.getNumerator());
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47024);assertEquals(5, f.getDenominator());
        
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47025);f1 = Fraction.getFraction(Integer.MAX_VALUE - 1, 1);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47026);f2 = Fraction.ONE;
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47027);f = f1.add(f2);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47028);assertEquals(Integer.MAX_VALUE, f.getNumerator());
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47029);assertEquals(1, f.getDenominator());
        
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47030);f1 = Fraction.getFraction(3, 5);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47031);f2 = Fraction.getFraction(1, 2);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47032);f = f1.add(f2);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47033);assertEquals(11, f.getNumerator());
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47034);assertEquals(10, f.getDenominator());
        
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47035);f1 = Fraction.getFraction(3, 8);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47036);f2 = Fraction.getFraction(1, 6);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47037);f = f1.add(f2);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47038);assertEquals(13, f.getNumerator());
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47039);assertEquals(24, f.getDenominator());
        
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47040);f1 = Fraction.getFraction(0, 5);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47041);f2 = Fraction.getFraction(1, 5);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47042);f = f1.add(f2);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47043);assertSame(f2, f);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47044);f = f2.add(f1);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47045);assertSame(f2, f);
        
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47046);f1 = Fraction.getFraction(-1, 13*13*2*2);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47047);f2 = Fraction.getFraction(-2, 13*17*2);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47048);f = f1.add(f2);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47049);assertEquals(13*13*17*2*2, f.getDenominator());
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47050);assertEquals(-17 - 2*13*2, f.getNumerator());
        
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47051);try {
            __CLR4_5_2zu7zu7lvha7hvf.R.inc(47052);f.add(null);
            __CLR4_5_2zu7zu7lvha7hvf.R.inc(47053);fail("expecting IllegalArgumentException");
        } catch (final IllegalArgumentException ex) {}
        
        // if this fraction is added naively, it will overflow.
        // check that it doesn't.
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47054);f1 = Fraction.getFraction(1,32768*3);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47055);f2 = Fraction.getFraction(1,59049);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47056);f = f1.add(f2);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47057);assertEquals(52451, f.getNumerator());
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47058);assertEquals(1934917632, f.getDenominator());

        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47059);f1 = Fraction.getFraction(Integer.MIN_VALUE, 3);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47060);f2 = Fraction.ONE_THIRD;
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47061);f = f1.add(f2);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47062);assertEquals(Integer.MIN_VALUE+1, f.getNumerator());
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47063);assertEquals(3, f.getDenominator());
        
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47064);f1 = Fraction.getFraction(Integer.MAX_VALUE - 1, 1);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47065);f2 = Fraction.ONE;
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47066);f = f1.add(f2);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47067);assertEquals(Integer.MAX_VALUE, f.getNumerator());
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47068);assertEquals(1, f.getDenominator());
        
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47069);try {
            __CLR4_5_2zu7zu7lvha7hvf.R.inc(47070);f = f.add(Fraction.ONE); // should overflow
            __CLR4_5_2zu7zu7lvha7hvf.R.inc(47071);fail("expecting ArithmeticException but got: " + f.toString());
        } catch (final ArithmeticException ex) {}
        
        // denominator should not be a multiple of 2 or 3 to trigger overflow
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47072);f1 = Fraction.getFraction(Integer.MIN_VALUE, 5);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47073);f2 = Fraction.getFraction(-1,5);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47074);try {
            __CLR4_5_2zu7zu7lvha7hvf.R.inc(47075);f = f1.add(f2); // should overflow
            __CLR4_5_2zu7zu7lvha7hvf.R.inc(47076);fail("expecting ArithmeticException but got: " + f.toString());
        } catch (final ArithmeticException ex) {}
        
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47077);try {
            __CLR4_5_2zu7zu7lvha7hvf.R.inc(47078);f= Fraction.getFraction(-Integer.MAX_VALUE, 1);
            __CLR4_5_2zu7zu7lvha7hvf.R.inc(47079);f = f.add(f);
            __CLR4_5_2zu7zu7lvha7hvf.R.inc(47080);fail("expecting ArithmeticException");
        } catch (final ArithmeticException ex) {}
            
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47081);try {
            __CLR4_5_2zu7zu7lvha7hvf.R.inc(47082);f= Fraction.getFraction(-Integer.MAX_VALUE, 1);
            __CLR4_5_2zu7zu7lvha7hvf.R.inc(47083);f = f.add(f);
            __CLR4_5_2zu7zu7lvha7hvf.R.inc(47084);fail("expecting ArithmeticException");
        } catch (final ArithmeticException ex) {}
            
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47085);f1 = Fraction.getFraction(3,327680);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47086);f2 = Fraction.getFraction(2,59049);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47087);try {
            __CLR4_5_2zu7zu7lvha7hvf.R.inc(47088);f = f1.add(f2); // should overflow
            __CLR4_5_2zu7zu7lvha7hvf.R.inc(47089);fail("expecting ArithmeticException but got: " + f.toString());
        } catch (final ArithmeticException ex) {}
    }finally{__CLR4_5_2zu7zu7lvha7hvf.R.flushNeeded();}}
            
    @Test
    public void testSubtract() {__CLR4_5_2zu7zu7lvha7hvf.R.globalSliceStart(getClass().getName(),47090);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hib6tp10c2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2zu7zu7lvha7hvf.R.rethrow($CLV_t2$);}finally{__CLR4_5_2zu7zu7lvha7hvf.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.FractionTest.testSubtract",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),47090,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hib6tp10c2(){try{__CLR4_5_2zu7zu7lvha7hvf.R.inc(47090);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47091);Fraction f = null;
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47092);Fraction f1 = null;
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47093);Fraction f2 = null;
        
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47094);f1 = Fraction.getFraction(3, 5);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47095);f2 = Fraction.getFraction(1, 5);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47096);f = f1.subtract(f2);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47097);assertEquals(2, f.getNumerator());
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47098);assertEquals(5, f.getDenominator());
        
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47099);f1 = Fraction.getFraction(7, 5);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47100);f2 = Fraction.getFraction(2, 5);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47101);f = f1.subtract(f2);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47102);assertEquals(1, f.getNumerator());
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47103);assertEquals(1, f.getDenominator());
        
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47104);f1 = Fraction.getFraction(3, 5);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47105);f2 = Fraction.getFraction(3, 5);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47106);f = f1.subtract(f2);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47107);assertEquals(0, f.getNumerator());
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47108);assertEquals(1, f.getDenominator());
        
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47109);f1 = Fraction.getFraction(3, 5);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47110);f2 = Fraction.getFraction(-4, 5);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47111);f = f1.subtract(f2);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47112);assertEquals(7, f.getNumerator());
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47113);assertEquals(5, f.getDenominator());
        
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47114);f1 = Fraction.getFraction(0, 5);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47115);f2 = Fraction.getFraction(4, 5);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47116);f = f1.subtract(f2);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47117);assertEquals(-4, f.getNumerator());
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47118);assertEquals(5, f.getDenominator());
        
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47119);f1 = Fraction.getFraction(0, 5);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47120);f2 = Fraction.getFraction(-4, 5);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47121);f = f1.subtract(f2);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47122);assertEquals(4, f.getNumerator());
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47123);assertEquals(5, f.getDenominator());
        
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47124);f1 = Fraction.getFraction(3, 5);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47125);f2 = Fraction.getFraction(1, 2);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47126);f = f1.subtract(f2);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47127);assertEquals(1, f.getNumerator());
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47128);assertEquals(10, f.getDenominator());
        
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47129);f1 = Fraction.getFraction(0, 5);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47130);f2 = Fraction.getFraction(1, 5);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47131);f = f2.subtract(f1);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47132);assertSame(f2, f);
        
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47133);try {
            __CLR4_5_2zu7zu7lvha7hvf.R.inc(47134);f.subtract(null);
            __CLR4_5_2zu7zu7lvha7hvf.R.inc(47135);fail("expecting IllegalArgumentException");
        } catch (final IllegalArgumentException ex) {}
        
        // if this fraction is subtracted naively, it will overflow.
        // check that it doesn't.
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47136);f1 = Fraction.getFraction(1,32768*3);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47137);f2 = Fraction.getFraction(1,59049);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47138);f = f1.subtract(f2);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47139);assertEquals(-13085, f.getNumerator());
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47140);assertEquals(1934917632, f.getDenominator());

        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47141);f1 = Fraction.getFraction(Integer.MIN_VALUE, 3);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47142);f2 = Fraction.ONE_THIRD.negate();
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47143);f = f1.subtract(f2);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47144);assertEquals(Integer.MIN_VALUE+1, f.getNumerator());
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47145);assertEquals(3, f.getDenominator());
        
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47146);f1 = Fraction.getFraction(Integer.MAX_VALUE, 1);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47147);f2 = Fraction.ONE;
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47148);f = f1.subtract(f2);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47149);assertEquals(Integer.MAX_VALUE-1, f.getNumerator());
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47150);assertEquals(1, f.getDenominator());

        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47151);try {
            __CLR4_5_2zu7zu7lvha7hvf.R.inc(47152);f1 = Fraction.getFraction(1, Integer.MAX_VALUE);
            __CLR4_5_2zu7zu7lvha7hvf.R.inc(47153);f2 = Fraction.getFraction(1, Integer.MAX_VALUE - 1);
            __CLR4_5_2zu7zu7lvha7hvf.R.inc(47154);f = f1.subtract(f2);
            __CLR4_5_2zu7zu7lvha7hvf.R.inc(47155);fail("expecting ArithmeticException");  //should overflow
        } catch (final ArithmeticException ex) {}
            
        // denominator should not be a multiple of 2 or 3 to trigger overflow
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47156);f1 = Fraction.getFraction(Integer.MIN_VALUE, 5);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47157);f2 = Fraction.getFraction(1,5);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47158);try {
            __CLR4_5_2zu7zu7lvha7hvf.R.inc(47159);f = f1.subtract(f2); // should overflow
            __CLR4_5_2zu7zu7lvha7hvf.R.inc(47160);fail("expecting ArithmeticException but got: " + f.toString());
        } catch (final ArithmeticException ex) {}
        
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47161);try {
            __CLR4_5_2zu7zu7lvha7hvf.R.inc(47162);f= Fraction.getFraction(Integer.MIN_VALUE, 1);
            __CLR4_5_2zu7zu7lvha7hvf.R.inc(47163);f = f.subtract(Fraction.ONE);
            __CLR4_5_2zu7zu7lvha7hvf.R.inc(47164);fail("expecting ArithmeticException");
        } catch (final ArithmeticException ex) {}
            
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47165);try {
            __CLR4_5_2zu7zu7lvha7hvf.R.inc(47166);f= Fraction.getFraction(Integer.MAX_VALUE, 1);
            __CLR4_5_2zu7zu7lvha7hvf.R.inc(47167);f = f.subtract(Fraction.ONE.negate());
            __CLR4_5_2zu7zu7lvha7hvf.R.inc(47168);fail("expecting ArithmeticException");
        } catch (final ArithmeticException ex) {}
            
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47169);f1 = Fraction.getFraction(3,327680);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47170);f2 = Fraction.getFraction(2,59049);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47171);try {
            __CLR4_5_2zu7zu7lvha7hvf.R.inc(47172);f = f1.subtract(f2); // should overflow
            __CLR4_5_2zu7zu7lvha7hvf.R.inc(47173);fail("expecting ArithmeticException but got: " + f.toString());
        } catch (final ArithmeticException ex) {}
    }finally{__CLR4_5_2zu7zu7lvha7hvf.R.flushNeeded();}}
            
    @Test
    public void testMultiply() {__CLR4_5_2zu7zu7lvha7hvf.R.globalSliceStart(getClass().getName(),47174);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vkd1nn10ee();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2zu7zu7lvha7hvf.R.rethrow($CLV_t2$);}finally{__CLR4_5_2zu7zu7lvha7hvf.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.FractionTest.testMultiply",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),47174,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vkd1nn10ee(){try{__CLR4_5_2zu7zu7lvha7hvf.R.inc(47174);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47175);Fraction f = null;
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47176);Fraction f1 = null;
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47177);Fraction f2 = null;
        
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47178);f1 = Fraction.getFraction(3, 5);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47179);f2 = Fraction.getFraction(2, 5);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47180);f = f1.multiplyBy(f2);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47181);assertEquals(6, f.getNumerator());
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47182);assertEquals(25, f.getDenominator());
        
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47183);f1 = Fraction.getFraction(6, 10);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47184);f2 = Fraction.getFraction(6, 10);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47185);f = f1.multiplyBy(f2);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47186);assertEquals(9, f.getNumerator());
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47187);assertEquals(25, f.getDenominator());
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47188);f = f.multiplyBy(f2);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47189);assertEquals(27, f.getNumerator());
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47190);assertEquals(125, f.getDenominator());
        
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47191);f1 = Fraction.getFraction(3, 5);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47192);f2 = Fraction.getFraction(-2, 5);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47193);f = f1.multiplyBy(f2);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47194);assertEquals(-6, f.getNumerator());
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47195);assertEquals(25, f.getDenominator());
        
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47196);f1 = Fraction.getFraction(-3, 5);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47197);f2 = Fraction.getFraction(-2, 5);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47198);f = f1.multiplyBy(f2);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47199);assertEquals(6, f.getNumerator());
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47200);assertEquals(25, f.getDenominator());
        
        
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47201);f1 = Fraction.getFraction(0, 5);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47202);f2 = Fraction.getFraction(2, 7);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47203);f = f1.multiplyBy(f2);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47204);assertSame(Fraction.ZERO, f);
        
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47205);f1 = Fraction.getFraction(2, 7);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47206);f2 = Fraction.ONE;
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47207);f = f1.multiplyBy(f2);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47208);assertEquals(2, f.getNumerator());
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47209);assertEquals(7, f.getDenominator());
        
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47210);f1 = Fraction.getFraction(Integer.MAX_VALUE, 1);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47211);f2 = Fraction.getFraction(Integer.MIN_VALUE, Integer.MAX_VALUE);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47212);f = f1.multiplyBy(f2);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47213);assertEquals(Integer.MIN_VALUE, f.getNumerator());
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47214);assertEquals(1, f.getDenominator());

        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47215);try {
            __CLR4_5_2zu7zu7lvha7hvf.R.inc(47216);f.multiplyBy(null);
            __CLR4_5_2zu7zu7lvha7hvf.R.inc(47217);fail("expecting IllegalArgumentException");
        } catch (final IllegalArgumentException ex) {}
        
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47218);try {
            __CLR4_5_2zu7zu7lvha7hvf.R.inc(47219);f1 = Fraction.getFraction(1, Integer.MAX_VALUE);
            __CLR4_5_2zu7zu7lvha7hvf.R.inc(47220);f = f1.multiplyBy(f1);  // should overflow
            __CLR4_5_2zu7zu7lvha7hvf.R.inc(47221);fail("expecting ArithmeticException");
        } catch (final ArithmeticException ex) {}
            
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47222);try {
            __CLR4_5_2zu7zu7lvha7hvf.R.inc(47223);f1 = Fraction.getFraction(1, -Integer.MAX_VALUE);
            __CLR4_5_2zu7zu7lvha7hvf.R.inc(47224);f = f1.multiplyBy(f1);  // should overflow
            __CLR4_5_2zu7zu7lvha7hvf.R.inc(47225);fail("expecting ArithmeticException");
        } catch (final ArithmeticException ex) {}
    }finally{__CLR4_5_2zu7zu7lvha7hvf.R.flushNeeded();}}
            
    @Test
    public void testDivide() {__CLR4_5_2zu7zu7lvha7hvf.R.globalSliceStart(getClass().getName(),47226);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ae8h2m10fu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2zu7zu7lvha7hvf.R.rethrow($CLV_t2$);}finally{__CLR4_5_2zu7zu7lvha7hvf.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.FractionTest.testDivide",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),47226,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ae8h2m10fu(){try{__CLR4_5_2zu7zu7lvha7hvf.R.inc(47226);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47227);Fraction f = null;
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47228);Fraction f1 = null;
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47229);Fraction f2 = null;
        
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47230);f1 = Fraction.getFraction(3, 5);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47231);f2 = Fraction.getFraction(2, 5);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47232);f = f1.divideBy(f2);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47233);assertEquals(3, f.getNumerator());
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47234);assertEquals(2, f.getDenominator());
        
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47235);f1 = Fraction.getFraction(3, 5);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47236);f2 = Fraction.ZERO;
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47237);try {
            __CLR4_5_2zu7zu7lvha7hvf.R.inc(47238);f = f1.divideBy(f2);
            __CLR4_5_2zu7zu7lvha7hvf.R.inc(47239);fail("expecting ArithmeticException");
        } catch (final ArithmeticException ex) {}
        
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47240);f1 = Fraction.getFraction(0, 5);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47241);f2 = Fraction.getFraction(2, 7);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47242);f = f1.divideBy(f2);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47243);assertSame(Fraction.ZERO, f);
        
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47244);f1 = Fraction.getFraction(2, 7);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47245);f2 = Fraction.ONE;
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47246);f = f1.divideBy(f2);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47247);assertEquals(2, f.getNumerator());
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47248);assertEquals(7, f.getDenominator());
        
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47249);f1 = Fraction.getFraction(1, Integer.MAX_VALUE);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47250);f = f1.divideBy(f1);  
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47251);assertEquals(1, f.getNumerator());
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47252);assertEquals(1, f.getDenominator());
        
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47253);f1 = Fraction.getFraction(Integer.MIN_VALUE, Integer.MAX_VALUE);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47254);f2 = Fraction.getFraction(1, Integer.MAX_VALUE);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47255);f = f1.divideBy(f2);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47256);assertEquals(Integer.MIN_VALUE, f.getNumerator());
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47257);assertEquals(1, f.getDenominator());

        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47258);try {
            __CLR4_5_2zu7zu7lvha7hvf.R.inc(47259);f.divideBy(null);
            __CLR4_5_2zu7zu7lvha7hvf.R.inc(47260);fail("IllegalArgumentException");
        } catch (final IllegalArgumentException ex) {}
        
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47261);try {
            __CLR4_5_2zu7zu7lvha7hvf.R.inc(47262);f1 = Fraction.getFraction(1, Integer.MAX_VALUE);
            __CLR4_5_2zu7zu7lvha7hvf.R.inc(47263);f = f1.divideBy(f1.invert());  // should overflow
            __CLR4_5_2zu7zu7lvha7hvf.R.inc(47264);fail("expecting ArithmeticException");
        } catch (final ArithmeticException ex) {}
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47265);try {
            __CLR4_5_2zu7zu7lvha7hvf.R.inc(47266);f1 = Fraction.getFraction(1, -Integer.MAX_VALUE);
            __CLR4_5_2zu7zu7lvha7hvf.R.inc(47267);f = f1.divideBy(f1.invert());  // should overflow
            __CLR4_5_2zu7zu7lvha7hvf.R.inc(47268);fail("expecting ArithmeticException");
        } catch (final ArithmeticException ex) {}
    }finally{__CLR4_5_2zu7zu7lvha7hvf.R.flushNeeded();}}
            
    @Test
    public void testEquals() {__CLR4_5_2zu7zu7lvha7hvf.R.globalSliceStart(getClass().getName(),47269);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2s4e60810h1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2zu7zu7lvha7hvf.R.rethrow($CLV_t2$);}finally{__CLR4_5_2zu7zu7lvha7hvf.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.FractionTest.testEquals",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),47269,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2s4e60810h1(){try{__CLR4_5_2zu7zu7lvha7hvf.R.inc(47269);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47270);Fraction f1 = null;
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47271);Fraction f2 = null;
        
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47272);f1 = Fraction.getFraction(3, 5);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47273);assertFalse(f1.equals(null));
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47274);assertFalse(f1.equals(new Object()));
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47275);assertFalse(f1.equals(Integer.valueOf(6)));
        
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47276);f1 = Fraction.getFraction(3, 5);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47277);f2 = Fraction.getFraction(2, 5);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47278);assertFalse(f1.equals(f2));
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47279);assertTrue(f1.equals(f1));
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47280);assertTrue(f2.equals(f2));
        
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47281);f2 = Fraction.getFraction(3, 5);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47282);assertTrue(f1.equals(f2));
        
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47283);f2 = Fraction.getFraction(6, 10);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47284);assertFalse(f1.equals(f2));
    }finally{__CLR4_5_2zu7zu7lvha7hvf.R.flushNeeded();}}
    
    @Test
    public void testHashCode() {__CLR4_5_2zu7zu7lvha7hvf.R.globalSliceStart(getClass().getName(),47285);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23zkhv810hh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2zu7zu7lvha7hvf.R.rethrow($CLV_t2$);}finally{__CLR4_5_2zu7zu7lvha7hvf.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.FractionTest.testHashCode",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),47285,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23zkhv810hh(){try{__CLR4_5_2zu7zu7lvha7hvf.R.inc(47285);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47286);final Fraction f1 = Fraction.getFraction(3, 5);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47287);Fraction f2 = Fraction.getFraction(3, 5);
        
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47288);assertTrue(f1.hashCode() == f2.hashCode());
        
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47289);f2 = Fraction.getFraction(2, 5);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47290);assertTrue(f1.hashCode() != f2.hashCode());
        
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47291);f2 = Fraction.getFraction(6, 10);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47292);assertTrue(f1.hashCode() != f2.hashCode());
    }finally{__CLR4_5_2zu7zu7lvha7hvf.R.flushNeeded();}}
    
    @Test
    public void testCompareTo() {__CLR4_5_2zu7zu7lvha7hvf.R.globalSliceStart(getClass().getName(),47293);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2pz6vfv10hp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2zu7zu7lvha7hvf.R.rethrow($CLV_t2$);}finally{__CLR4_5_2zu7zu7lvha7hvf.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.FractionTest.testCompareTo",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),47293,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2pz6vfv10hp(){try{__CLR4_5_2zu7zu7lvha7hvf.R.inc(47293);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47294);Fraction f1 = null;
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47295);Fraction f2 = null;
        
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47296);f1 = Fraction.getFraction(3, 5);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47297);assertTrue(f1.compareTo(f1) == 0);
        
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47298);try {
            __CLR4_5_2zu7zu7lvha7hvf.R.inc(47299);f1.compareTo(null);
            __CLR4_5_2zu7zu7lvha7hvf.R.inc(47300);fail("expecting NullPointerException");
        } catch (final NullPointerException ex) {}
        
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47301);f2 = Fraction.getFraction(2, 5);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47302);assertTrue(f1.compareTo(f2) > 0);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47303);assertTrue(f2.compareTo(f2) == 0);
        
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47304);f2 = Fraction.getFraction(4, 5);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47305);assertTrue(f1.compareTo(f2) < 0);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47306);assertTrue(f2.compareTo(f2) == 0);
        
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47307);f2 = Fraction.getFraction(3, 5);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47308);assertTrue(f1.compareTo(f2) == 0);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47309);assertTrue(f2.compareTo(f2) == 0);
        
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47310);f2 = Fraction.getFraction(6, 10);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47311);assertTrue(f1.compareTo(f2) == 0);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47312);assertTrue(f2.compareTo(f2) == 0);

        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47313);f2 = Fraction.getFraction(-1, 1, Integer.MAX_VALUE);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47314);assertTrue(f1.compareTo(f2) > 0);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47315);assertTrue(f2.compareTo(f2) == 0);

    }finally{__CLR4_5_2zu7zu7lvha7hvf.R.flushNeeded();}}
    
    @Test
    public void testToString() {__CLR4_5_2zu7zu7lvha7hvf.R.globalSliceStart(getClass().getName(),47316);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hrxdid10ic();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2zu7zu7lvha7hvf.R.rethrow($CLV_t2$);}finally{__CLR4_5_2zu7zu7lvha7hvf.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.FractionTest.testToString",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),47316,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hrxdid10ic(){try{__CLR4_5_2zu7zu7lvha7hvf.R.inc(47316);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47317);Fraction f = null;

        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47318);f = Fraction.getFraction(3, 5);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47319);final String str = f.toString();
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47320);assertEquals("3/5", str);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47321);assertSame(str, f.toString());
        
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47322);f = Fraction.getFraction(7, 5);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47323);assertEquals("7/5", f.toString());        
        
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47324);f = Fraction.getFraction(4, 2);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47325);assertEquals("4/2", f.toString());        
        
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47326);f = Fraction.getFraction(0, 2);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47327);assertEquals("0/2", f.toString());        
        
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47328);f = Fraction.getFraction(2, 2);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47329);assertEquals("2/2", f.toString());        

        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47330);f = Fraction.getFraction(Integer.MIN_VALUE, 0, 1);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47331);assertEquals("-2147483648/1", f.toString());        

        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47332);f = Fraction.getFraction(-1, 1, Integer.MAX_VALUE);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47333);assertEquals("-2147483648/2147483647", f.toString());
    }finally{__CLR4_5_2zu7zu7lvha7hvf.R.flushNeeded();}}
    
    @Test
    public void testToProperString() {__CLR4_5_2zu7zu7lvha7hvf.R.globalSliceStart(getClass().getName(),47334);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2sj4a0b10iu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2zu7zu7lvha7hvf.R.rethrow($CLV_t2$);}finally{__CLR4_5_2zu7zu7lvha7hvf.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.FractionTest.testToProperString",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),47334,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2sj4a0b10iu(){try{__CLR4_5_2zu7zu7lvha7hvf.R.inc(47334);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47335);Fraction f = null;

        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47336);f = Fraction.getFraction(3, 5);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47337);final String str = f.toProperString();
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47338);assertEquals("3/5", str);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47339);assertSame(str, f.toProperString());
        
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47340);f = Fraction.getFraction(7, 5);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47341);assertEquals("1 2/5", f.toProperString());        
        
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47342);f = Fraction.getFraction(14, 10);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47343);assertEquals("1 4/10", f.toProperString());        
        
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47344);f = Fraction.getFraction(4, 2);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47345);assertEquals("2", f.toProperString());        
        
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47346);f = Fraction.getFraction(0, 2);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47347);assertEquals("0", f.toProperString());        
        
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47348);f = Fraction.getFraction(2, 2);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47349);assertEquals("1", f.toProperString());        
        
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47350);f = Fraction.getFraction(-7, 5);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47351);assertEquals("-1 2/5", f.toProperString());        

        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47352);f = Fraction.getFraction(Integer.MIN_VALUE, 0, 1);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47353);assertEquals("-2147483648", f.toProperString());        

        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47354);f = Fraction.getFraction(-1, 1, Integer.MAX_VALUE);
        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47355);assertEquals("-1 1/2147483647", f.toProperString());

        __CLR4_5_2zu7zu7lvha7hvf.R.inc(47356);assertEquals("-1", Fraction.getFraction(-1).toProperString());
    }finally{__CLR4_5_2zu7zu7lvha7hvf.R.flushNeeded();}}
}
