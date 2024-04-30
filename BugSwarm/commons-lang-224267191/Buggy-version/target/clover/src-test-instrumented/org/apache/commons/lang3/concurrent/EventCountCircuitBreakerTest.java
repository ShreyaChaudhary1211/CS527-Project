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
package org.apache.commons.lang3.concurrent;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import org.junit.Test;

/**
 * Test class for {@code EventCountCircuitBreaker}.
 */
public class EventCountCircuitBreakerTest {static class __CLR4_5_2yqbyqblvha7hoq{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172763741L,8589935092L,45175,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /** Constant for the opening threshold. */
    private static final int OPENING_THRESHOLD = 10;

    /** Constant for the closing threshold. */
    private static final int CLOSING_THRESHOLD = 5;

    /** Constant for the factor for converting nanoseconds. */
    private static final long NANO_FACTOR = 1000L * 1000L * 1000L;

    /**
     * Tests that time units are correctly taken into account by constructors.
     */
    @Test
    public void testIntervalCalculation() {__CLR4_5_2yqbyqblvha7hoq.R.globalSliceStart(getClass().getName(),45011);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2e4w449yqb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2yqbyqblvha7hoq.R.rethrow($CLV_t2$);}finally{__CLR4_5_2yqbyqblvha7hoq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.EventCountCircuitBreakerTest.testIntervalCalculation",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),45011,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2e4w449yqb(){try{__CLR4_5_2yqbyqblvha7hoq.R.inc(45011);
        __CLR4_5_2yqbyqblvha7hoq.R.inc(45012);final EventCountCircuitBreaker breaker = new EventCountCircuitBreaker(OPENING_THRESHOLD, 1,
                TimeUnit.SECONDS, CLOSING_THRESHOLD, 2, TimeUnit.MILLISECONDS);
        __CLR4_5_2yqbyqblvha7hoq.R.inc(45013);assertEquals("Wrong opening interval", NANO_FACTOR, breaker.getOpeningInterval());
        __CLR4_5_2yqbyqblvha7hoq.R.inc(45014);assertEquals("Wrong closing interval", 2 * NANO_FACTOR / 1000,
                breaker.getClosingInterval());
    }finally{__CLR4_5_2yqbyqblvha7hoq.R.flushNeeded();}}

    /**
     * Tests that the closing interval is the same as the opening interval if it is not
     * specified.
     */
    @Test
    public void testDefaultClosingInterval() {__CLR4_5_2yqbyqblvha7hoq.R.globalSliceStart(getClass().getName(),45015);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_29h7acyyqf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2yqbyqblvha7hoq.R.rethrow($CLV_t2$);}finally{__CLR4_5_2yqbyqblvha7hoq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.EventCountCircuitBreakerTest.testDefaultClosingInterval",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),45015,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_29h7acyyqf(){try{__CLR4_5_2yqbyqblvha7hoq.R.inc(45015);
        __CLR4_5_2yqbyqblvha7hoq.R.inc(45016);final EventCountCircuitBreaker breaker = new EventCountCircuitBreaker(OPENING_THRESHOLD, 1,
                TimeUnit.SECONDS, CLOSING_THRESHOLD);
        __CLR4_5_2yqbyqblvha7hoq.R.inc(45017);assertEquals("Wrong closing interval", NANO_FACTOR, breaker.getClosingInterval());
    }finally{__CLR4_5_2yqbyqblvha7hoq.R.flushNeeded();}}

    /**
     * Tests that the closing threshold is the same as the opening threshold if not
     * specified otherwise.
     */
    @Test
    public void testDefaultClosingThreshold() {__CLR4_5_2yqbyqblvha7hoq.R.globalSliceStart(getClass().getName(),45018);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21vl96cyqi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2yqbyqblvha7hoq.R.rethrow($CLV_t2$);}finally{__CLR4_5_2yqbyqblvha7hoq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.EventCountCircuitBreakerTest.testDefaultClosingThreshold",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),45018,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21vl96cyqi(){try{__CLR4_5_2yqbyqblvha7hoq.R.inc(45018);
        __CLR4_5_2yqbyqblvha7hoq.R.inc(45019);final EventCountCircuitBreaker breaker = new EventCountCircuitBreaker(OPENING_THRESHOLD, 1,
                TimeUnit.SECONDS);
        __CLR4_5_2yqbyqblvha7hoq.R.inc(45020);assertEquals("Wrong closing interval", NANO_FACTOR, breaker.getClosingInterval());
        __CLR4_5_2yqbyqblvha7hoq.R.inc(45021);assertEquals("Wrong closing threshold", OPENING_THRESHOLD,
                breaker.getClosingThreshold());
    }finally{__CLR4_5_2yqbyqblvha7hoq.R.flushNeeded();}}

    /**
     * Tests that a circuit breaker is closed after its creation.
     */
    @Test
    public void testInitiallyClosed() {__CLR4_5_2yqbyqblvha7hoq.R.globalSliceStart(getClass().getName(),45022);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2htinhqyqm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2yqbyqblvha7hoq.R.rethrow($CLV_t2$);}finally{__CLR4_5_2yqbyqblvha7hoq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.EventCountCircuitBreakerTest.testInitiallyClosed",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),45022,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2htinhqyqm(){try{__CLR4_5_2yqbyqblvha7hoq.R.inc(45022);
        __CLR4_5_2yqbyqblvha7hoq.R.inc(45023);final EventCountCircuitBreaker breaker = new EventCountCircuitBreaker(OPENING_THRESHOLD, 1,
                TimeUnit.SECONDS);
        __CLR4_5_2yqbyqblvha7hoq.R.inc(45024);assertFalse("Open", breaker.isOpen());
        __CLR4_5_2yqbyqblvha7hoq.R.inc(45025);assertTrue("Not closed", breaker.isClosed());
    }finally{__CLR4_5_2yqbyqblvha7hoq.R.flushNeeded();}}

    /**
     * Tests whether the current time is correctly determined.
     */
    @Test
    public void testNow() {__CLR4_5_2yqbyqblvha7hoq.R.globalSliceStart(getClass().getName(),45026);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2xges0lyqq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2yqbyqblvha7hoq.R.rethrow($CLV_t2$);}finally{__CLR4_5_2yqbyqblvha7hoq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.EventCountCircuitBreakerTest.testNow",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),45026,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2xges0lyqq(){try{__CLR4_5_2yqbyqblvha7hoq.R.inc(45026);
        __CLR4_5_2yqbyqblvha7hoq.R.inc(45027);final EventCountCircuitBreaker breaker = new EventCountCircuitBreaker(OPENING_THRESHOLD, 1,
                TimeUnit.SECONDS);
        __CLR4_5_2yqbyqblvha7hoq.R.inc(45028);final long now = breaker.now();
        __CLR4_5_2yqbyqblvha7hoq.R.inc(45029);final long delta = Math.abs(System.nanoTime() - now);
        __CLR4_5_2yqbyqblvha7hoq.R.inc(45030);assertTrue("Delta to current time too large", delta < 100000);
    }finally{__CLR4_5_2yqbyqblvha7hoq.R.flushNeeded();}}

    /**
     * Tests that the circuit breaker stays closed if the number of received events stays
     * below the threshold.
     */
    @Test
    public void testNotOpeningUnderThreshold() {__CLR4_5_2yqbyqblvha7hoq.R.globalSliceStart(getClass().getName(),45031);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ow5n69yqv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2yqbyqblvha7hoq.R.rethrow($CLV_t2$);}finally{__CLR4_5_2yqbyqblvha7hoq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.EventCountCircuitBreakerTest.testNotOpeningUnderThreshold",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),45031,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ow5n69yqv(){try{__CLR4_5_2yqbyqblvha7hoq.R.inc(45031);
        __CLR4_5_2yqbyqblvha7hoq.R.inc(45032);long startTime = 1000;
        __CLR4_5_2yqbyqblvha7hoq.R.inc(45033);final EventCountCircuitBreakerTestImpl breaker = new EventCountCircuitBreakerTestImpl(OPENING_THRESHOLD, 1,
                TimeUnit.SECONDS, CLOSING_THRESHOLD, 1, TimeUnit.SECONDS);
        __CLR4_5_2yqbyqblvha7hoq.R.inc(45034);for (int i = 0; (((i < OPENING_THRESHOLD - 1)&&(__CLR4_5_2yqbyqblvha7hoq.R.iget(45035)!=0|true))||(__CLR4_5_2yqbyqblvha7hoq.R.iget(45036)==0&false)); i++) {{
            __CLR4_5_2yqbyqblvha7hoq.R.inc(45037);assertTrue("In open state", breaker.at(startTime).incrementAndCheckState());
            __CLR4_5_2yqbyqblvha7hoq.R.inc(45038);startTime++;
        }
        }__CLR4_5_2yqbyqblvha7hoq.R.inc(45039);assertTrue("Not closed", breaker.isClosed());
    }finally{__CLR4_5_2yqbyqblvha7hoq.R.flushNeeded();}}

    /**
     * Tests that the circuit breaker stays closed if there are a number of received
     * events, but not in a single check interval.
     */
    @Test
    public void testNotOpeningCheckIntervalExceeded() {__CLR4_5_2yqbyqblvha7hoq.R.globalSliceStart(getClass().getName(),45040);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2b5x7cgyr4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2yqbyqblvha7hoq.R.rethrow($CLV_t2$);}finally{__CLR4_5_2yqbyqblvha7hoq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.EventCountCircuitBreakerTest.testNotOpeningCheckIntervalExceeded",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),45040,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2b5x7cgyr4(){try{__CLR4_5_2yqbyqblvha7hoq.R.inc(45040);
        __CLR4_5_2yqbyqblvha7hoq.R.inc(45041);long startTime = 0L;
        __CLR4_5_2yqbyqblvha7hoq.R.inc(45042);final long timeIncrement = 3 * NANO_FACTOR / (2 * OPENING_THRESHOLD);
        __CLR4_5_2yqbyqblvha7hoq.R.inc(45043);final EventCountCircuitBreakerTestImpl breaker = new EventCountCircuitBreakerTestImpl(OPENING_THRESHOLD, 1,
                TimeUnit.SECONDS, CLOSING_THRESHOLD, 1, TimeUnit.SECONDS);
        __CLR4_5_2yqbyqblvha7hoq.R.inc(45044);for (int i = 0; (((i < 5 * OPENING_THRESHOLD)&&(__CLR4_5_2yqbyqblvha7hoq.R.iget(45045)!=0|true))||(__CLR4_5_2yqbyqblvha7hoq.R.iget(45046)==0&false)); i++) {{
            __CLR4_5_2yqbyqblvha7hoq.R.inc(45047);assertTrue("In open state", breaker.at(startTime).incrementAndCheckState());
            __CLR4_5_2yqbyqblvha7hoq.R.inc(45048);startTime += timeIncrement;
        }
        }__CLR4_5_2yqbyqblvha7hoq.R.inc(45049);assertTrue("Not closed", breaker.isClosed());
    }finally{__CLR4_5_2yqbyqblvha7hoq.R.flushNeeded();}}

    /**
     * Tests that the circuit breaker opens if all conditions are met.
     */
    @Test
    public void testOpeningWhenThresholdReached() {__CLR4_5_2yqbyqblvha7hoq.R.globalSliceStart(getClass().getName(),45050);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2k3yilqyre();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2yqbyqblvha7hoq.R.rethrow($CLV_t2$);}finally{__CLR4_5_2yqbyqblvha7hoq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.EventCountCircuitBreakerTest.testOpeningWhenThresholdReached",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),45050,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2k3yilqyre(){try{__CLR4_5_2yqbyqblvha7hoq.R.inc(45050);
        __CLR4_5_2yqbyqblvha7hoq.R.inc(45051);long startTime = 0;
        __CLR4_5_2yqbyqblvha7hoq.R.inc(45052);final long timeIncrement = NANO_FACTOR / OPENING_THRESHOLD - 1;
        __CLR4_5_2yqbyqblvha7hoq.R.inc(45053);final EventCountCircuitBreakerTestImpl breaker = new EventCountCircuitBreakerTestImpl(OPENING_THRESHOLD, 1,
                TimeUnit.SECONDS, CLOSING_THRESHOLD, 1, TimeUnit.SECONDS);
        __CLR4_5_2yqbyqblvha7hoq.R.inc(45054);boolean open = false;
        __CLR4_5_2yqbyqblvha7hoq.R.inc(45055);for (int i = 0; (((i < OPENING_THRESHOLD + 1)&&(__CLR4_5_2yqbyqblvha7hoq.R.iget(45056)!=0|true))||(__CLR4_5_2yqbyqblvha7hoq.R.iget(45057)==0&false)); i++) {{
            __CLR4_5_2yqbyqblvha7hoq.R.inc(45058);open = !breaker.at(startTime).incrementAndCheckState();
            __CLR4_5_2yqbyqblvha7hoq.R.inc(45059);startTime += timeIncrement;
        }
        }__CLR4_5_2yqbyqblvha7hoq.R.inc(45060);assertTrue("Not open", open);
        __CLR4_5_2yqbyqblvha7hoq.R.inc(45061);assertFalse("Closed", breaker.isClosed());
    }finally{__CLR4_5_2yqbyqblvha7hoq.R.flushNeeded();}}

    /**
     * Tests that an open circuit breaker does not close itself when the number of events
     * received is over the threshold.
     */
    @Test
    public void testNotClosingOverThreshold() {__CLR4_5_2yqbyqblvha7hoq.R.globalSliceStart(getClass().getName(),45062);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hfbexiyrq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2yqbyqblvha7hoq.R.rethrow($CLV_t2$);}finally{__CLR4_5_2yqbyqblvha7hoq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.EventCountCircuitBreakerTest.testNotClosingOverThreshold",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),45062,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hfbexiyrq(){try{__CLR4_5_2yqbyqblvha7hoq.R.inc(45062);
        __CLR4_5_2yqbyqblvha7hoq.R.inc(45063);final EventCountCircuitBreakerTestImpl breaker = new EventCountCircuitBreakerTestImpl(OPENING_THRESHOLD,
                10, TimeUnit.SECONDS, CLOSING_THRESHOLD, 1, TimeUnit.SECONDS);
        __CLR4_5_2yqbyqblvha7hoq.R.inc(45064);long startTime = 0;
        __CLR4_5_2yqbyqblvha7hoq.R.inc(45065);breaker.open();
        __CLR4_5_2yqbyqblvha7hoq.R.inc(45066);for (int i = 0; (((i <= CLOSING_THRESHOLD)&&(__CLR4_5_2yqbyqblvha7hoq.R.iget(45067)!=0|true))||(__CLR4_5_2yqbyqblvha7hoq.R.iget(45068)==0&false)); i++) {{
            __CLR4_5_2yqbyqblvha7hoq.R.inc(45069);assertFalse("Not open", breaker.at(startTime).incrementAndCheckState());
            __CLR4_5_2yqbyqblvha7hoq.R.inc(45070);startTime += 1000;
        }
        }__CLR4_5_2yqbyqblvha7hoq.R.inc(45071);assertFalse("Closed in new interval", breaker.at(startTime + NANO_FACTOR)
                .incrementAndCheckState());
        __CLR4_5_2yqbyqblvha7hoq.R.inc(45072);assertTrue("Not open at end", breaker.isOpen());
    }finally{__CLR4_5_2yqbyqblvha7hoq.R.flushNeeded();}}

    /**
     * Tests that the circuit breaker closes automatically if the number of events
     * received goes under the closing threshold.
     */
    @Test
    public void testClosingWhenThresholdReached() {__CLR4_5_2yqbyqblvha7hoq.R.globalSliceStart(getClass().getName(),45073);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2z2b3e3ys1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2yqbyqblvha7hoq.R.rethrow($CLV_t2$);}finally{__CLR4_5_2yqbyqblvha7hoq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.EventCountCircuitBreakerTest.testClosingWhenThresholdReached",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),45073,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2z2b3e3ys1(){try{__CLR4_5_2yqbyqblvha7hoq.R.inc(45073);
        __CLR4_5_2yqbyqblvha7hoq.R.inc(45074);final EventCountCircuitBreakerTestImpl breaker = new EventCountCircuitBreakerTestImpl(OPENING_THRESHOLD,
                10, TimeUnit.SECONDS, CLOSING_THRESHOLD, 1, TimeUnit.SECONDS);
        __CLR4_5_2yqbyqblvha7hoq.R.inc(45075);breaker.open();
        __CLR4_5_2yqbyqblvha7hoq.R.inc(45076);breaker.at(1000).incrementAndCheckState();
        __CLR4_5_2yqbyqblvha7hoq.R.inc(45077);assertFalse("Already closed", breaker.at(2000).checkState());
        __CLR4_5_2yqbyqblvha7hoq.R.inc(45078);assertFalse("Closed at interval end", breaker.at(NANO_FACTOR).checkState());
        __CLR4_5_2yqbyqblvha7hoq.R.inc(45079);assertTrue("Not closed after interval end", breaker.at(NANO_FACTOR + 1)
                .checkState());
        __CLR4_5_2yqbyqblvha7hoq.R.inc(45080);assertTrue("Not closed at end", breaker.isClosed());
    }finally{__CLR4_5_2yqbyqblvha7hoq.R.flushNeeded();}}

    /**
     * Tests whether an explicit open operation fully initializes the internal check data
     * object. Otherwise, the circuit breaker may close itself directly afterwards.
     */
    @Test
    public void testOpenStartsNewCheckInterval() {__CLR4_5_2yqbyqblvha7hoq.R.globalSliceStart(getClass().getName(),45081);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2e7spttys9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2yqbyqblvha7hoq.R.rethrow($CLV_t2$);}finally{__CLR4_5_2yqbyqblvha7hoq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.EventCountCircuitBreakerTest.testOpenStartsNewCheckInterval",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),45081,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2e7spttys9(){try{__CLR4_5_2yqbyqblvha7hoq.R.inc(45081);
        __CLR4_5_2yqbyqblvha7hoq.R.inc(45082);final EventCountCircuitBreakerTestImpl breaker = new EventCountCircuitBreakerTestImpl(OPENING_THRESHOLD, 2,
                TimeUnit.SECONDS, CLOSING_THRESHOLD, 1, TimeUnit.SECONDS);
        __CLR4_5_2yqbyqblvha7hoq.R.inc(45083);breaker.at(NANO_FACTOR - 1000).open();
        __CLR4_5_2yqbyqblvha7hoq.R.inc(45084);assertTrue("Not open", breaker.isOpen());
        __CLR4_5_2yqbyqblvha7hoq.R.inc(45085);assertFalse("Already closed", breaker.at(NANO_FACTOR + 100).checkState());
    }finally{__CLR4_5_2yqbyqblvha7hoq.R.flushNeeded();}}

    /**
     * Tests whether a new check interval is started if the circuit breaker has a
     * transition to open state.
     */
    @Test
    public void testAutomaticOpenStartsNewCheckInterval() {__CLR4_5_2yqbyqblvha7hoq.R.globalSliceStart(getClass().getName(),45086);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2l9wd3cyse();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2yqbyqblvha7hoq.R.rethrow($CLV_t2$);}finally{__CLR4_5_2yqbyqblvha7hoq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.EventCountCircuitBreakerTest.testAutomaticOpenStartsNewCheckInterval",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),45086,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2l9wd3cyse(){try{__CLR4_5_2yqbyqblvha7hoq.R.inc(45086);
        __CLR4_5_2yqbyqblvha7hoq.R.inc(45087);final EventCountCircuitBreakerTestImpl breaker = new EventCountCircuitBreakerTestImpl(OPENING_THRESHOLD, 2,
                TimeUnit.SECONDS, CLOSING_THRESHOLD, 1, TimeUnit.SECONDS);
        __CLR4_5_2yqbyqblvha7hoq.R.inc(45088);long time = 10 * NANO_FACTOR;
        __CLR4_5_2yqbyqblvha7hoq.R.inc(45089);for (int i = 0; (((i <= OPENING_THRESHOLD)&&(__CLR4_5_2yqbyqblvha7hoq.R.iget(45090)!=0|true))||(__CLR4_5_2yqbyqblvha7hoq.R.iget(45091)==0&false)); i++) {{
            __CLR4_5_2yqbyqblvha7hoq.R.inc(45092);breaker.at(time++).incrementAndCheckState();
        }
        }__CLR4_5_2yqbyqblvha7hoq.R.inc(45093);assertTrue("Not open", breaker.isOpen());
        __CLR4_5_2yqbyqblvha7hoq.R.inc(45094);time += NANO_FACTOR - 1000;
        __CLR4_5_2yqbyqblvha7hoq.R.inc(45095);assertFalse("Already closed", breaker.at(time).incrementAndCheckState());
        __CLR4_5_2yqbyqblvha7hoq.R.inc(45096);time += 1001;
        __CLR4_5_2yqbyqblvha7hoq.R.inc(45097);assertTrue("Not closed in time interval", breaker.at(time).checkState());
    }finally{__CLR4_5_2yqbyqblvha7hoq.R.flushNeeded();}}

    /**
     * Tests whether the circuit breaker can be closed explicitly.
     */
    @Test
    public void testClose() {__CLR4_5_2yqbyqblvha7hoq.R.globalSliceStart(getClass().getName(),45098);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_269vzsjysq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2yqbyqblvha7hoq.R.rethrow($CLV_t2$);}finally{__CLR4_5_2yqbyqblvha7hoq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.EventCountCircuitBreakerTest.testClose",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),45098,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_269vzsjysq(){try{__CLR4_5_2yqbyqblvha7hoq.R.inc(45098);
        __CLR4_5_2yqbyqblvha7hoq.R.inc(45099);final EventCountCircuitBreakerTestImpl breaker = new EventCountCircuitBreakerTestImpl(OPENING_THRESHOLD, 2,
                TimeUnit.SECONDS, CLOSING_THRESHOLD, 1, TimeUnit.SECONDS);
        __CLR4_5_2yqbyqblvha7hoq.R.inc(45100);long time = 0;
        __CLR4_5_2yqbyqblvha7hoq.R.inc(45101);for (int i = 0; (((i <= OPENING_THRESHOLD)&&(__CLR4_5_2yqbyqblvha7hoq.R.iget(45102)!=0|true))||(__CLR4_5_2yqbyqblvha7hoq.R.iget(45103)==0&false)); i++, time += 1000) {{
            __CLR4_5_2yqbyqblvha7hoq.R.inc(45104);breaker.at(time).incrementAndCheckState();
        }
        }__CLR4_5_2yqbyqblvha7hoq.R.inc(45105);assertTrue("Not open", breaker.isOpen());
        __CLR4_5_2yqbyqblvha7hoq.R.inc(45106);breaker.close();
        __CLR4_5_2yqbyqblvha7hoq.R.inc(45107);assertTrue("Not closed", breaker.isClosed());
        __CLR4_5_2yqbyqblvha7hoq.R.inc(45108);assertTrue("Open again", breaker.at(time + 1000).incrementAndCheckState());
    }finally{__CLR4_5_2yqbyqblvha7hoq.R.flushNeeded();}}

    /**
     * Tests whether events are generated when the state is changed.
     */
    @Test
    public void testChangeEvents() {__CLR4_5_2yqbyqblvha7hoq.R.globalSliceStart(getClass().getName(),45109);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2smw4uayt1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2yqbyqblvha7hoq.R.rethrow($CLV_t2$);}finally{__CLR4_5_2yqbyqblvha7hoq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.EventCountCircuitBreakerTest.testChangeEvents",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),45109,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2smw4uayt1(){try{__CLR4_5_2yqbyqblvha7hoq.R.inc(45109);
        __CLR4_5_2yqbyqblvha7hoq.R.inc(45110);final EventCountCircuitBreaker breaker = new EventCountCircuitBreaker(OPENING_THRESHOLD, 1,
                TimeUnit.SECONDS);
        __CLR4_5_2yqbyqblvha7hoq.R.inc(45111);final ChangeListener listener = new ChangeListener(breaker);
        __CLR4_5_2yqbyqblvha7hoq.R.inc(45112);breaker.addChangeListener(listener);
        __CLR4_5_2yqbyqblvha7hoq.R.inc(45113);breaker.open();
        __CLR4_5_2yqbyqblvha7hoq.R.inc(45114);breaker.close();
        __CLR4_5_2yqbyqblvha7hoq.R.inc(45115);listener.verify(Boolean.TRUE, Boolean.FALSE);
    }finally{__CLR4_5_2yqbyqblvha7hoq.R.flushNeeded();}}

    /**
     * Tests whether a change listener can be removed.
     */
    @Test
    public void testRemoveChangeListener() {__CLR4_5_2yqbyqblvha7hoq.R.globalSliceStart(getClass().getName(),45116);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2atxazlyt8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2yqbyqblvha7hoq.R.rethrow($CLV_t2$);}finally{__CLR4_5_2yqbyqblvha7hoq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.EventCountCircuitBreakerTest.testRemoveChangeListener",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),45116,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2atxazlyt8(){try{__CLR4_5_2yqbyqblvha7hoq.R.inc(45116);
        __CLR4_5_2yqbyqblvha7hoq.R.inc(45117);final EventCountCircuitBreaker breaker = new EventCountCircuitBreaker(OPENING_THRESHOLD, 1,
                TimeUnit.SECONDS);
        __CLR4_5_2yqbyqblvha7hoq.R.inc(45118);final ChangeListener listener = new ChangeListener(breaker);
        __CLR4_5_2yqbyqblvha7hoq.R.inc(45119);breaker.addChangeListener(listener);
        __CLR4_5_2yqbyqblvha7hoq.R.inc(45120);breaker.open();
        __CLR4_5_2yqbyqblvha7hoq.R.inc(45121);breaker.removeChangeListener(listener);
        __CLR4_5_2yqbyqblvha7hoq.R.inc(45122);breaker.close();
        __CLR4_5_2yqbyqblvha7hoq.R.inc(45123);listener.verify(Boolean.TRUE);
    }finally{__CLR4_5_2yqbyqblvha7hoq.R.flushNeeded();}}

    /**
     * Tests that a state transition triggered by multiple threads is handled correctly.
     * Only the first transition should cause an event to be sent.
     */
    @Test
    public void testStateTransitionGuarded() throws InterruptedException {__CLR4_5_2yqbyqblvha7hoq.R.globalSliceStart(getClass().getName(),45124);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2xvqn1lytg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2yqbyqblvha7hoq.R.rethrow($CLV_t2$);}finally{__CLR4_5_2yqbyqblvha7hoq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.EventCountCircuitBreakerTest.testStateTransitionGuarded",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),45124,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2xvqn1lytg() throws InterruptedException{try{__CLR4_5_2yqbyqblvha7hoq.R.inc(45124);
        __CLR4_5_2yqbyqblvha7hoq.R.inc(45125);final EventCountCircuitBreaker breaker = new EventCountCircuitBreaker(OPENING_THRESHOLD, 1,
                TimeUnit.SECONDS);
        __CLR4_5_2yqbyqblvha7hoq.R.inc(45126);final ChangeListener listener = new ChangeListener(breaker);
        __CLR4_5_2yqbyqblvha7hoq.R.inc(45127);breaker.addChangeListener(listener);

        __CLR4_5_2yqbyqblvha7hoq.R.inc(45128);final int threadCount = 128;
        __CLR4_5_2yqbyqblvha7hoq.R.inc(45129);final CountDownLatch latch = new CountDownLatch(1);
        __CLR4_5_2yqbyqblvha7hoq.R.inc(45130);final Thread[] threads = new Thread[threadCount];
        __CLR4_5_2yqbyqblvha7hoq.R.inc(45131);for (int i = 0; (((i < threadCount)&&(__CLR4_5_2yqbyqblvha7hoq.R.iget(45132)!=0|true))||(__CLR4_5_2yqbyqblvha7hoq.R.iget(45133)==0&false)); i++) {{
            __CLR4_5_2yqbyqblvha7hoq.R.inc(45134);threads[i] = new Thread() {
                @Override
                public void run() {try{__CLR4_5_2yqbyqblvha7hoq.R.inc(45135);
                    __CLR4_5_2yqbyqblvha7hoq.R.inc(45136);try {
                        __CLR4_5_2yqbyqblvha7hoq.R.inc(45137);latch.await();
                    } catch (final InterruptedException iex) {
                        // ignore
                    }
                    __CLR4_5_2yqbyqblvha7hoq.R.inc(45138);breaker.open();
                }finally{__CLR4_5_2yqbyqblvha7hoq.R.flushNeeded();}}
            };
            __CLR4_5_2yqbyqblvha7hoq.R.inc(45139);threads[i].start();
        }
        }__CLR4_5_2yqbyqblvha7hoq.R.inc(45140);latch.countDown();
        __CLR4_5_2yqbyqblvha7hoq.R.inc(45141);for (final Thread thread : threads) {{
            __CLR4_5_2yqbyqblvha7hoq.R.inc(45142);thread.join();
        }
        }__CLR4_5_2yqbyqblvha7hoq.R.inc(45143);listener.verify(Boolean.TRUE);
    }finally{__CLR4_5_2yqbyqblvha7hoq.R.flushNeeded();}}

    /**
     * Tests that automatic state transitions generate change events as well.
     */
    @Test
    public void testChangeEventsGeneratedByAutomaticTransitions() {__CLR4_5_2yqbyqblvha7hoq.R.globalSliceStart(getClass().getName(),45144);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_25oggo5yu0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2yqbyqblvha7hoq.R.rethrow($CLV_t2$);}finally{__CLR4_5_2yqbyqblvha7hoq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.EventCountCircuitBreakerTest.testChangeEventsGeneratedByAutomaticTransitions",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),45144,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_25oggo5yu0(){try{__CLR4_5_2yqbyqblvha7hoq.R.inc(45144);
        __CLR4_5_2yqbyqblvha7hoq.R.inc(45145);final EventCountCircuitBreakerTestImpl breaker = new EventCountCircuitBreakerTestImpl(OPENING_THRESHOLD, 2,
                TimeUnit.SECONDS, CLOSING_THRESHOLD, 1, TimeUnit.SECONDS);
        __CLR4_5_2yqbyqblvha7hoq.R.inc(45146);final ChangeListener listener = new ChangeListener(breaker);
        __CLR4_5_2yqbyqblvha7hoq.R.inc(45147);breaker.addChangeListener(listener);
        __CLR4_5_2yqbyqblvha7hoq.R.inc(45148);long time = 0;
        __CLR4_5_2yqbyqblvha7hoq.R.inc(45149);for (int i = 0; (((i <= OPENING_THRESHOLD)&&(__CLR4_5_2yqbyqblvha7hoq.R.iget(45150)!=0|true))||(__CLR4_5_2yqbyqblvha7hoq.R.iget(45151)==0&false)); i++, time += 1000) {{
            __CLR4_5_2yqbyqblvha7hoq.R.inc(45152);breaker.at(time).incrementAndCheckState();
        }
        }__CLR4_5_2yqbyqblvha7hoq.R.inc(45153);breaker.at(NANO_FACTOR + 1).checkState();
        __CLR4_5_2yqbyqblvha7hoq.R.inc(45154);breaker.at(3 * NANO_FACTOR).checkState();
        __CLR4_5_2yqbyqblvha7hoq.R.inc(45155);listener.verify(Boolean.TRUE, Boolean.FALSE);
    }finally{__CLR4_5_2yqbyqblvha7hoq.R.flushNeeded();}}

    /**
     * A test implementation of {@code EventCountCircuitBreaker} which supports mocking the timer.
     * This is useful for the creation of deterministic tests for switching the circuit
     * breaker's state.
     */
    private static class EventCountCircuitBreakerTestImpl extends EventCountCircuitBreaker {
        /** The current time in nanoseconds. */
        private long currentTime;

        public EventCountCircuitBreakerTestImpl(final int openingThreshold, final long openingInterval,
                                                final TimeUnit openingUnit, final int closingThreshold, final long closingInterval,
                                                final TimeUnit closingUnit) {
            super(openingThreshold, openingInterval, openingUnit, closingThreshold,
                    closingInterval, closingUnit);__CLR4_5_2yqbyqblvha7hoq.R.inc(45157);try{__CLR4_5_2yqbyqblvha7hoq.R.inc(45156);
        }finally{__CLR4_5_2yqbyqblvha7hoq.R.flushNeeded();}}

        /**
         * Sets the current time to be used by this test object for the next operation.
         *
         * @param time the time to set
         * @return a reference to this object
         */
        public EventCountCircuitBreakerTestImpl at(final long time) {try{__CLR4_5_2yqbyqblvha7hoq.R.inc(45158);
            __CLR4_5_2yqbyqblvha7hoq.R.inc(45159);currentTime = time;
            __CLR4_5_2yqbyqblvha7hoq.R.inc(45160);return this;
        }finally{__CLR4_5_2yqbyqblvha7hoq.R.flushNeeded();}}

        /**
         * {@inheritDoc} This implementation returns the value passed to the {@code at()}
         * method.
         */
        @Override
        long now() {try{__CLR4_5_2yqbyqblvha7hoq.R.inc(45161);
            __CLR4_5_2yqbyqblvha7hoq.R.inc(45162);return currentTime;
        }finally{__CLR4_5_2yqbyqblvha7hoq.R.flushNeeded();}}
    }

    /**
     * A test change listener for checking whether correct change events are generated.
     */
    private static class ChangeListener implements PropertyChangeListener {
        /** The expected event source. */
        private final Object expectedSource;

        /** A list with the updated values extracted from received change events. */
        private final List<Boolean> changedValues;

        /**
         * Creates a new instance of {@code ChangeListener} and sets the expected event
         * source.
         *
         * @param source the expected event source
         */
        public ChangeListener(final Object source) {try{__CLR4_5_2yqbyqblvha7hoq.R.inc(45163);
            __CLR4_5_2yqbyqblvha7hoq.R.inc(45164);expectedSource = source;
            __CLR4_5_2yqbyqblvha7hoq.R.inc(45165);changedValues = new ArrayList<>();
        }finally{__CLR4_5_2yqbyqblvha7hoq.R.flushNeeded();}}

        @Override
        public void propertyChange(final PropertyChangeEvent evt) {try{__CLR4_5_2yqbyqblvha7hoq.R.inc(45166);
            __CLR4_5_2yqbyqblvha7hoq.R.inc(45167);assertEquals("Wrong event source", expectedSource, evt.getSource());
            __CLR4_5_2yqbyqblvha7hoq.R.inc(45168);assertEquals("Wrong property name", "open", evt.getPropertyName());
            __CLR4_5_2yqbyqblvha7hoq.R.inc(45169);final Boolean newValue = (Boolean) evt.getNewValue();
            __CLR4_5_2yqbyqblvha7hoq.R.inc(45170);final Boolean oldValue = (Boolean) evt.getOldValue();
            __CLR4_5_2yqbyqblvha7hoq.R.inc(45171);assertNotEquals("Old and new value are equal", newValue, oldValue);
            __CLR4_5_2yqbyqblvha7hoq.R.inc(45172);changedValues.add(newValue);
        }finally{__CLR4_5_2yqbyqblvha7hoq.R.flushNeeded();}}

        /**
         * Verifies that change events for the expected values have been received.
         *
         * @param values the expected values
         */
        public void verify(final Boolean... values) {try{__CLR4_5_2yqbyqblvha7hoq.R.inc(45173);
            __CLR4_5_2yqbyqblvha7hoq.R.inc(45174);assertArrayEquals(values,
                    changedValues.toArray(new Boolean[changedValues.size()]));
        }finally{__CLR4_5_2yqbyqblvha7hoq.R.flushNeeded();}}
    }
}