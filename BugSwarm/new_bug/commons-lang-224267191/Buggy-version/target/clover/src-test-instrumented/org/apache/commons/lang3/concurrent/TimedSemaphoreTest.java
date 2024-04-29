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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import org.easymock.EasyMock;
import org.junit.Test;

/**
 * Test class for TimedSemaphore.
 */
public class TimedSemaphoreTest {static class __CLR4_5_2z17z17lvha7hq7{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172763741L,8589935092L,45645,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /** Constant for the time period. */
    private static final long PERIOD = 500;

    /** Constant for the time unit. */
    private static final TimeUnit UNIT = TimeUnit.MILLISECONDS;

    /** Constant for the default limit. */
    private static final int LIMIT = 10;

    /**
     * Tests creating a new instance.
     */
    @Test
    public void testInit() {__CLR4_5_2z17z17lvha7hq7.R.globalSliceStart(getClass().getName(),45403);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ai0cvrz17();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2z17z17lvha7hq7.R.rethrow($CLV_t2$);}finally{__CLR4_5_2z17z17lvha7hq7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.TimedSemaphoreTest.testInit",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),45403,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ai0cvrz17(){try{__CLR4_5_2z17z17lvha7hq7.R.inc(45403);
        __CLR4_5_2z17z17lvha7hq7.R.inc(45404);final ScheduledExecutorService service = EasyMock
                .createMock(ScheduledExecutorService.class);
        __CLR4_5_2z17z17lvha7hq7.R.inc(45405);EasyMock.replay(service);
        __CLR4_5_2z17z17lvha7hq7.R.inc(45406);final TimedSemaphore semaphore = new TimedSemaphore(service, PERIOD, UNIT,
                LIMIT);
        __CLR4_5_2z17z17lvha7hq7.R.inc(45407);EasyMock.verify(service);
        __CLR4_5_2z17z17lvha7hq7.R.inc(45408);assertEquals("Wrong service", service, semaphore.getExecutorService());
        __CLR4_5_2z17z17lvha7hq7.R.inc(45409);assertEquals("Wrong period", PERIOD, semaphore.getPeriod());
        __CLR4_5_2z17z17lvha7hq7.R.inc(45410);assertEquals("Wrong unit", UNIT, semaphore.getUnit());
        __CLR4_5_2z17z17lvha7hq7.R.inc(45411);assertEquals("Statistic available", 0, semaphore
                .getLastAcquiresPerPeriod());
        __CLR4_5_2z17z17lvha7hq7.R.inc(45412);assertEquals("Average available", 0.0, semaphore
                .getAverageCallsPerPeriod(), .05);
        __CLR4_5_2z17z17lvha7hq7.R.inc(45413);assertFalse("Already shutdown", semaphore.isShutdown());
        __CLR4_5_2z17z17lvha7hq7.R.inc(45414);assertEquals("Wrong limit", LIMIT, semaphore.getLimit());
    }finally{__CLR4_5_2z17z17lvha7hq7.R.flushNeeded();}}

    /**
     * Tries to create an instance with a negative period. This should cause an
     * exception.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testInitInvalidPeriod() {__CLR4_5_2z17z17lvha7hq7.R.globalSliceStart(getClass().getName(),45415);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ujj43z1j();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,73,110,105,116,73,110,118,97,108,105,100,80,101,114,105,111,100,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2z17z17lvha7hq7.R.rethrow($CLV_t2$);}finally{__CLR4_5_2z17z17lvha7hq7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.TimedSemaphoreTest.testInitInvalidPeriod",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),45415,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ujj43z1j(){try{__CLR4_5_2z17z17lvha7hq7.R.inc(45415);
        __CLR4_5_2z17z17lvha7hq7.R.inc(45416);new TimedSemaphore(0L, UNIT, LIMIT);
    }finally{__CLR4_5_2z17z17lvha7hq7.R.flushNeeded();}}

    /**
     * Tests whether a default executor service is created if no service is
     * provided.
     */
    @Test
    public void testInitDefaultService() {__CLR4_5_2z17z17lvha7hq7.R.globalSliceStart(getClass().getName(),45417);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22ntkgzz1l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2z17z17lvha7hq7.R.rethrow($CLV_t2$);}finally{__CLR4_5_2z17z17lvha7hq7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.TimedSemaphoreTest.testInitDefaultService",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),45417,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22ntkgzz1l(){try{__CLR4_5_2z17z17lvha7hq7.R.inc(45417);
        __CLR4_5_2z17z17lvha7hq7.R.inc(45418);final TimedSemaphore semaphore = new TimedSemaphore(PERIOD, UNIT, LIMIT);
        __CLR4_5_2z17z17lvha7hq7.R.inc(45419);final ScheduledThreadPoolExecutor exec = (ScheduledThreadPoolExecutor) semaphore
                .getExecutorService();
        __CLR4_5_2z17z17lvha7hq7.R.inc(45420);assertFalse("Wrong periodic task policy", exec
                .getContinueExistingPeriodicTasksAfterShutdownPolicy());
        __CLR4_5_2z17z17lvha7hq7.R.inc(45421);assertFalse("Wrong delayed task policy", exec
                .getExecuteExistingDelayedTasksAfterShutdownPolicy());
        __CLR4_5_2z17z17lvha7hq7.R.inc(45422);assertFalse("Already shutdown", exec.isShutdown());
        __CLR4_5_2z17z17lvha7hq7.R.inc(45423);semaphore.shutdown();
    }finally{__CLR4_5_2z17z17lvha7hq7.R.flushNeeded();}}

    /**
     * Tests starting the timer.
     *
     * @throws java.lang.InterruptedException so we don't have to catch it
     */
    @Test
    public void testStartTimer() throws InterruptedException {__CLR4_5_2z17z17lvha7hq7.R.globalSliceStart(getClass().getName(),45424);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2oedyqsz1s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2z17z17lvha7hq7.R.rethrow($CLV_t2$);}finally{__CLR4_5_2z17z17lvha7hq7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.TimedSemaphoreTest.testStartTimer",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),45424,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2oedyqsz1s() throws InterruptedException{try{__CLR4_5_2z17z17lvha7hq7.R.inc(45424);
        __CLR4_5_2z17z17lvha7hq7.R.inc(45425);final TimedSemaphoreTestImpl semaphore = new TimedSemaphoreTestImpl(PERIOD,
                UNIT, LIMIT);
        __CLR4_5_2z17z17lvha7hq7.R.inc(45426);final ScheduledFuture<?> future = semaphore.startTimer();
        __CLR4_5_2z17z17lvha7hq7.R.inc(45427);assertNotNull("No future returned", future);
        __CLR4_5_2z17z17lvha7hq7.R.inc(45428);Thread.sleep(PERIOD);
        __CLR4_5_2z17z17lvha7hq7.R.inc(45429);final int trials = 10;
        __CLR4_5_2z17z17lvha7hq7.R.inc(45430);int count = 0;
        __CLR4_5_2z17z17lvha7hq7.R.inc(45431);do {{
            __CLR4_5_2z17z17lvha7hq7.R.inc(45432);Thread.sleep(PERIOD);
            __CLR4_5_2z17z17lvha7hq7.R.inc(45433);if ((((count++ > trials)&&(__CLR4_5_2z17z17lvha7hq7.R.iget(45434)!=0|true))||(__CLR4_5_2z17z17lvha7hq7.R.iget(45435)==0&false))) {{
                __CLR4_5_2z17z17lvha7hq7.R.inc(45436);fail("endOfPeriod() not called!");
            }
        }} }while ((((semaphore.getPeriodEnds() <= 0)&&(__CLR4_5_2z17z17lvha7hq7.R.iget(45437)!=0|true))||(__CLR4_5_2z17z17lvha7hq7.R.iget(45438)==0&false)));
        __CLR4_5_2z17z17lvha7hq7.R.inc(45439);semaphore.shutdown();
    }finally{__CLR4_5_2z17z17lvha7hq7.R.flushNeeded();}}

    /**
     * Tests the shutdown() method if the executor belongs to the semaphore. In
     * this case it has to be shut down.
     */
    @Test
    public void testShutdownOwnExecutor() {__CLR4_5_2z17z17lvha7hq7.R.globalSliceStart(getClass().getName(),45440);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27w2xzcz28();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2z17z17lvha7hq7.R.rethrow($CLV_t2$);}finally{__CLR4_5_2z17z17lvha7hq7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.TimedSemaphoreTest.testShutdownOwnExecutor",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),45440,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27w2xzcz28(){try{__CLR4_5_2z17z17lvha7hq7.R.inc(45440);
        __CLR4_5_2z17z17lvha7hq7.R.inc(45441);final TimedSemaphore semaphore = new TimedSemaphore(PERIOD, UNIT, LIMIT);
        __CLR4_5_2z17z17lvha7hq7.R.inc(45442);semaphore.shutdown();
        __CLR4_5_2z17z17lvha7hq7.R.inc(45443);assertTrue("Not shutdown", semaphore.isShutdown());
        __CLR4_5_2z17z17lvha7hq7.R.inc(45444);assertTrue("Executor not shutdown", semaphore.getExecutorService()
                .isShutdown());
    }finally{__CLR4_5_2z17z17lvha7hq7.R.flushNeeded();}}

    /**
     * Tests the shutdown() method for a shared executor service before a task
     * was started. This should do pretty much nothing.
     */
    @Test
    public void testShutdownSharedExecutorNoTask() {__CLR4_5_2z17z17lvha7hq7.R.globalSliceStart(getClass().getName(),45445);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2i9dbt9z2d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2z17z17lvha7hq7.R.rethrow($CLV_t2$);}finally{__CLR4_5_2z17z17lvha7hq7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.TimedSemaphoreTest.testShutdownSharedExecutorNoTask",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),45445,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2i9dbt9z2d(){try{__CLR4_5_2z17z17lvha7hq7.R.inc(45445);
        __CLR4_5_2z17z17lvha7hq7.R.inc(45446);final ScheduledExecutorService service = EasyMock
                .createMock(ScheduledExecutorService.class);
        __CLR4_5_2z17z17lvha7hq7.R.inc(45447);EasyMock.replay(service);
        __CLR4_5_2z17z17lvha7hq7.R.inc(45448);final TimedSemaphore semaphore = new TimedSemaphore(service, PERIOD, UNIT,
                LIMIT);
        __CLR4_5_2z17z17lvha7hq7.R.inc(45449);semaphore.shutdown();
        __CLR4_5_2z17z17lvha7hq7.R.inc(45450);assertTrue("Not shutdown", semaphore.isShutdown());
        __CLR4_5_2z17z17lvha7hq7.R.inc(45451);EasyMock.verify(service);
    }finally{__CLR4_5_2z17z17lvha7hq7.R.flushNeeded();}}

    /**
     * Prepares an executor service mock to expect the start of the timer.
     *
     * @param service the mock
     * @param future the future
     */
    private void prepareStartTimer(final ScheduledExecutorService service,
            final ScheduledFuture<?> future) {try{__CLR4_5_2z17z17lvha7hq7.R.inc(45452);
        __CLR4_5_2z17z17lvha7hq7.R.inc(45453);service.scheduleAtFixedRate((Runnable) EasyMock.anyObject(), EasyMock
                .eq(PERIOD), EasyMock.eq(PERIOD), EasyMock.eq(UNIT));
        __CLR4_5_2z17z17lvha7hq7.R.inc(45454);EasyMock.expectLastCall().andReturn(future);
    }finally{__CLR4_5_2z17z17lvha7hq7.R.flushNeeded();}}

    /**
     * Tests the shutdown() method for a shared executor after the task was
     * started. In this case the task must be canceled.
     *
     * @throws java.lang.InterruptedException so we don't have to catch it
     */
    @Test
    public void testShutdownSharedExecutorTask() throws InterruptedException {__CLR4_5_2z17z17lvha7hq7.R.globalSliceStart(getClass().getName(),45455);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2kf1jv0z2n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2z17z17lvha7hq7.R.rethrow($CLV_t2$);}finally{__CLR4_5_2z17z17lvha7hq7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.TimedSemaphoreTest.testShutdownSharedExecutorTask",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),45455,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2kf1jv0z2n() throws InterruptedException{try{__CLR4_5_2z17z17lvha7hq7.R.inc(45455);
        __CLR4_5_2z17z17lvha7hq7.R.inc(45456);final ScheduledExecutorService service = EasyMock
                .createMock(ScheduledExecutorService.class);
        __CLR4_5_2z17z17lvha7hq7.R.inc(45457);final ScheduledFuture<?> future = EasyMock.createMock(ScheduledFuture.class);
        __CLR4_5_2z17z17lvha7hq7.R.inc(45458);prepareStartTimer(service, future);
        __CLR4_5_2z17z17lvha7hq7.R.inc(45459);EasyMock.expect(Boolean.valueOf(future.cancel(false))).andReturn(Boolean.TRUE);
        __CLR4_5_2z17z17lvha7hq7.R.inc(45460);EasyMock.replay(service, future);
        __CLR4_5_2z17z17lvha7hq7.R.inc(45461);final TimedSemaphoreTestImpl semaphore = new TimedSemaphoreTestImpl(service,
                PERIOD, UNIT, LIMIT);
        __CLR4_5_2z17z17lvha7hq7.R.inc(45462);semaphore.acquire();
        __CLR4_5_2z17z17lvha7hq7.R.inc(45463);semaphore.shutdown();
        __CLR4_5_2z17z17lvha7hq7.R.inc(45464);assertTrue("Not shutdown", semaphore.isShutdown());
        __CLR4_5_2z17z17lvha7hq7.R.inc(45465);EasyMock.verify(service, future);
    }finally{__CLR4_5_2z17z17lvha7hq7.R.flushNeeded();}}

    /**
     * Tests multiple invocations of the shutdown() method.
     *
     * @throws java.lang.InterruptedException so we don't have to catch it
     */
    @Test
    public void testShutdownMultipleTimes() throws InterruptedException {__CLR4_5_2z17z17lvha7hq7.R.globalSliceStart(getClass().getName(),45466);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ikv823z2y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2z17z17lvha7hq7.R.rethrow($CLV_t2$);}finally{__CLR4_5_2z17z17lvha7hq7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.TimedSemaphoreTest.testShutdownMultipleTimes",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),45466,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ikv823z2y() throws InterruptedException{try{__CLR4_5_2z17z17lvha7hq7.R.inc(45466);
        __CLR4_5_2z17z17lvha7hq7.R.inc(45467);final ScheduledExecutorService service = EasyMock
                .createMock(ScheduledExecutorService.class);
        __CLR4_5_2z17z17lvha7hq7.R.inc(45468);final ScheduledFuture<?> future = EasyMock.createMock(ScheduledFuture.class);
        __CLR4_5_2z17z17lvha7hq7.R.inc(45469);prepareStartTimer(service, future);
        __CLR4_5_2z17z17lvha7hq7.R.inc(45470);EasyMock.expect(Boolean.valueOf(future.cancel(false))).andReturn(Boolean.TRUE);
        __CLR4_5_2z17z17lvha7hq7.R.inc(45471);EasyMock.replay(service, future);
        __CLR4_5_2z17z17lvha7hq7.R.inc(45472);final TimedSemaphoreTestImpl semaphore = new TimedSemaphoreTestImpl(service,
                PERIOD, UNIT, LIMIT);
        __CLR4_5_2z17z17lvha7hq7.R.inc(45473);semaphore.acquire();
        __CLR4_5_2z17z17lvha7hq7.R.inc(45474);for (int i = 0; (((i < 10)&&(__CLR4_5_2z17z17lvha7hq7.R.iget(45475)!=0|true))||(__CLR4_5_2z17z17lvha7hq7.R.iget(45476)==0&false)); i++) {{
            __CLR4_5_2z17z17lvha7hq7.R.inc(45477);semaphore.shutdown();
        }
        }__CLR4_5_2z17z17lvha7hq7.R.inc(45478);EasyMock.verify(service, future);
    }finally{__CLR4_5_2z17z17lvha7hq7.R.flushNeeded();}}

    /**
     * Tests the acquire() method if a limit is set.
     *
     * @throws java.lang.InterruptedException so we don't have to catch it
     */
    @Test
    public void testAcquireLimit() throws InterruptedException {__CLR4_5_2z17z17lvha7hq7.R.globalSliceStart(getClass().getName(),45479);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2k2jmhqz3b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2z17z17lvha7hq7.R.rethrow($CLV_t2$);}finally{__CLR4_5_2z17z17lvha7hq7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.TimedSemaphoreTest.testAcquireLimit",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),45479,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2k2jmhqz3b() throws InterruptedException{try{__CLR4_5_2z17z17lvha7hq7.R.inc(45479);
        __CLR4_5_2z17z17lvha7hq7.R.inc(45480);final ScheduledExecutorService service = EasyMock
                .createMock(ScheduledExecutorService.class);
        __CLR4_5_2z17z17lvha7hq7.R.inc(45481);final ScheduledFuture<?> future = EasyMock.createMock(ScheduledFuture.class);
        __CLR4_5_2z17z17lvha7hq7.R.inc(45482);prepareStartTimer(service, future);
        __CLR4_5_2z17z17lvha7hq7.R.inc(45483);EasyMock.replay(service, future);
        __CLR4_5_2z17z17lvha7hq7.R.inc(45484);final int count = 10;
        __CLR4_5_2z17z17lvha7hq7.R.inc(45485);final CountDownLatch latch = new CountDownLatch(count - 1);
        __CLR4_5_2z17z17lvha7hq7.R.inc(45486);final TimedSemaphore semaphore = new TimedSemaphore(service, PERIOD, UNIT, 1);
        __CLR4_5_2z17z17lvha7hq7.R.inc(45487);final SemaphoreThread t = new SemaphoreThread(semaphore, latch, count,
                count - 1);
        __CLR4_5_2z17z17lvha7hq7.R.inc(45488);semaphore.setLimit(count - 1);

        // start a thread that calls the semaphore count times
        __CLR4_5_2z17z17lvha7hq7.R.inc(45489);t.start();
        __CLR4_5_2z17z17lvha7hq7.R.inc(45490);latch.await();
        // now the semaphore's limit should be reached and the thread blocked
        __CLR4_5_2z17z17lvha7hq7.R.inc(45491);assertEquals("Wrong semaphore count", count - 1, semaphore
                .getAcquireCount());

        // this wakes up the thread, it should call the semaphore once more
        __CLR4_5_2z17z17lvha7hq7.R.inc(45492);semaphore.endOfPeriod();
        __CLR4_5_2z17z17lvha7hq7.R.inc(45493);t.join();
        __CLR4_5_2z17z17lvha7hq7.R.inc(45494);assertEquals("Wrong semaphore count (2)", 1, semaphore
                .getAcquireCount());
        __CLR4_5_2z17z17lvha7hq7.R.inc(45495);assertEquals("Wrong acquire() count", count - 1, semaphore
                .getLastAcquiresPerPeriod());
        __CLR4_5_2z17z17lvha7hq7.R.inc(45496);EasyMock.verify(service, future);
    }finally{__CLR4_5_2z17z17lvha7hq7.R.flushNeeded();}}

    /**
     * Tests the acquire() method if more threads are involved than the limit.
     * This method starts a number of threads that all invoke the semaphore. The
     * semaphore's limit is set to 1, so in each period only a single thread can
     * acquire the semaphore.
     *
     * @throws java.lang.InterruptedException so we don't have to catch it
     */
    @Test
    public void testAcquireMultipleThreads() throws InterruptedException {__CLR4_5_2z17z17lvha7hq7.R.globalSliceStart(getClass().getName(),45497);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22tzp0kz3t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2z17z17lvha7hq7.R.rethrow($CLV_t2$);}finally{__CLR4_5_2z17z17lvha7hq7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.TimedSemaphoreTest.testAcquireMultipleThreads",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),45497,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22tzp0kz3t() throws InterruptedException{try{__CLR4_5_2z17z17lvha7hq7.R.inc(45497);
        __CLR4_5_2z17z17lvha7hq7.R.inc(45498);final ScheduledExecutorService service = EasyMock
                .createMock(ScheduledExecutorService.class);
        __CLR4_5_2z17z17lvha7hq7.R.inc(45499);final ScheduledFuture<?> future = EasyMock.createMock(ScheduledFuture.class);
        __CLR4_5_2z17z17lvha7hq7.R.inc(45500);prepareStartTimer(service, future);
        __CLR4_5_2z17z17lvha7hq7.R.inc(45501);EasyMock.replay(service, future);
        __CLR4_5_2z17z17lvha7hq7.R.inc(45502);final TimedSemaphoreTestImpl semaphore = new TimedSemaphoreTestImpl(service,
                PERIOD, UNIT, 1);
        __CLR4_5_2z17z17lvha7hq7.R.inc(45503);semaphore.latch = new CountDownLatch(1);
        __CLR4_5_2z17z17lvha7hq7.R.inc(45504);final int count = 10;
        __CLR4_5_2z17z17lvha7hq7.R.inc(45505);final SemaphoreThread[] threads = new SemaphoreThread[count];
        __CLR4_5_2z17z17lvha7hq7.R.inc(45506);for (int i = 0; (((i < count)&&(__CLR4_5_2z17z17lvha7hq7.R.iget(45507)!=0|true))||(__CLR4_5_2z17z17lvha7hq7.R.iget(45508)==0&false)); i++) {{
            __CLR4_5_2z17z17lvha7hq7.R.inc(45509);threads[i] = new SemaphoreThread(semaphore, null, 1, 0);
            __CLR4_5_2z17z17lvha7hq7.R.inc(45510);threads[i].start();
        }
        }__CLR4_5_2z17z17lvha7hq7.R.inc(45511);for (int i = 0; (((i < count)&&(__CLR4_5_2z17z17lvha7hq7.R.iget(45512)!=0|true))||(__CLR4_5_2z17z17lvha7hq7.R.iget(45513)==0&false)); i++) {{
            __CLR4_5_2z17z17lvha7hq7.R.inc(45514);semaphore.latch.await();
            __CLR4_5_2z17z17lvha7hq7.R.inc(45515);assertEquals("Wrong count", 1, semaphore.getAcquireCount());
            __CLR4_5_2z17z17lvha7hq7.R.inc(45516);semaphore.latch = new CountDownLatch(1);
            __CLR4_5_2z17z17lvha7hq7.R.inc(45517);semaphore.endOfPeriod();
            __CLR4_5_2z17z17lvha7hq7.R.inc(45518);assertEquals("Wrong acquire count", 1, semaphore
                    .getLastAcquiresPerPeriod());
        }
        }__CLR4_5_2z17z17lvha7hq7.R.inc(45519);for (int i = 0; (((i < count)&&(__CLR4_5_2z17z17lvha7hq7.R.iget(45520)!=0|true))||(__CLR4_5_2z17z17lvha7hq7.R.iget(45521)==0&false)); i++) {{
            __CLR4_5_2z17z17lvha7hq7.R.inc(45522);threads[i].join();
        }
        }__CLR4_5_2z17z17lvha7hq7.R.inc(45523);EasyMock.verify(service, future);
    }finally{__CLR4_5_2z17z17lvha7hq7.R.flushNeeded();}}

    /**
     * Tests the acquire() method if no limit is set. A test thread is started
     * that calls the semaphore a large number of times. Even if the semaphore's
     * period does not end, the thread should never block.
     *
     * @throws java.lang.InterruptedException so we don't have to catch it
     */
    @Test
    public void testAcquireNoLimit() throws InterruptedException {__CLR4_5_2z17z17lvha7hq7.R.globalSliceStart(getClass().getName(),45524);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ly32wtz4k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2z17z17lvha7hq7.R.rethrow($CLV_t2$);}finally{__CLR4_5_2z17z17lvha7hq7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.TimedSemaphoreTest.testAcquireNoLimit",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),45524,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ly32wtz4k() throws InterruptedException{try{__CLR4_5_2z17z17lvha7hq7.R.inc(45524);
        __CLR4_5_2z17z17lvha7hq7.R.inc(45525);final ScheduledExecutorService service = EasyMock
                .createMock(ScheduledExecutorService.class);
        __CLR4_5_2z17z17lvha7hq7.R.inc(45526);final ScheduledFuture<?> future = EasyMock.createMock(ScheduledFuture.class);
        __CLR4_5_2z17z17lvha7hq7.R.inc(45527);prepareStartTimer(service, future);
        __CLR4_5_2z17z17lvha7hq7.R.inc(45528);EasyMock.replay(service, future);
        __CLR4_5_2z17z17lvha7hq7.R.inc(45529);final TimedSemaphoreTestImpl semaphore = new TimedSemaphoreTestImpl(service,
                PERIOD, UNIT, TimedSemaphore.NO_LIMIT);
        __CLR4_5_2z17z17lvha7hq7.R.inc(45530);final int count = 1000;
        __CLR4_5_2z17z17lvha7hq7.R.inc(45531);final CountDownLatch latch = new CountDownLatch(count);
        __CLR4_5_2z17z17lvha7hq7.R.inc(45532);final SemaphoreThread t = new SemaphoreThread(semaphore, latch, count, count);
        __CLR4_5_2z17z17lvha7hq7.R.inc(45533);t.start();
        __CLR4_5_2z17z17lvha7hq7.R.inc(45534);latch.await();
        __CLR4_5_2z17z17lvha7hq7.R.inc(45535);EasyMock.verify(service, future);
    }finally{__CLR4_5_2z17z17lvha7hq7.R.flushNeeded();}}

    /**
     * Tries to call acquire() after shutdown(). This should cause an exception.
     *
     * @throws java.lang.InterruptedException so we don't have to catch it
     */
    @Test(expected = IllegalStateException.class)
    public void testPassAfterShutdown() throws InterruptedException {__CLR4_5_2z17z17lvha7hq7.R.globalSliceStart(getClass().getName(),45536);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2wxevrez4w();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,80,97,115,115,65,102,116,101,114,83,104,117,116,100,111,119,110,58,32,91,73,108,108,101,103,97,108,83,116,97,116,101,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalStateException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2z17z17lvha7hq7.R.rethrow($CLV_t2$);}finally{__CLR4_5_2z17z17lvha7hq7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.TimedSemaphoreTest.testPassAfterShutdown",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),45536,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2wxevrez4w() throws InterruptedException{try{__CLR4_5_2z17z17lvha7hq7.R.inc(45536);
        __CLR4_5_2z17z17lvha7hq7.R.inc(45537);final TimedSemaphore semaphore = new TimedSemaphore(PERIOD, UNIT, LIMIT);
        __CLR4_5_2z17z17lvha7hq7.R.inc(45538);semaphore.shutdown();
        __CLR4_5_2z17z17lvha7hq7.R.inc(45539);semaphore.acquire();
    }finally{__CLR4_5_2z17z17lvha7hq7.R.flushNeeded();}}

    /**
     * Tests a bigger number of invocations that span multiple periods. The
     * period is set to a very short time. A background thread calls the
     * semaphore a large number of times. While it runs at last one end of a
     * period should be reached.
     *
     * @throws java.lang.InterruptedException so we don't have to catch it
     */
    @Test
    public void testAcquireMultiplePeriods() throws InterruptedException {__CLR4_5_2z17z17lvha7hq7.R.globalSliceStart(getClass().getName(),45540);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2rpnc85z50();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2z17z17lvha7hq7.R.rethrow($CLV_t2$);}finally{__CLR4_5_2z17z17lvha7hq7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.TimedSemaphoreTest.testAcquireMultiplePeriods",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),45540,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2rpnc85z50() throws InterruptedException{try{__CLR4_5_2z17z17lvha7hq7.R.inc(45540);
        __CLR4_5_2z17z17lvha7hq7.R.inc(45541);final int count = 1000;
        __CLR4_5_2z17z17lvha7hq7.R.inc(45542);final TimedSemaphoreTestImpl semaphore = new TimedSemaphoreTestImpl(
                PERIOD / 10, TimeUnit.MILLISECONDS, 1);
        __CLR4_5_2z17z17lvha7hq7.R.inc(45543);semaphore.setLimit(count / 4);
        __CLR4_5_2z17z17lvha7hq7.R.inc(45544);final CountDownLatch latch = new CountDownLatch(count);
        __CLR4_5_2z17z17lvha7hq7.R.inc(45545);final SemaphoreThread t = new SemaphoreThread(semaphore, latch, count, count);
        __CLR4_5_2z17z17lvha7hq7.R.inc(45546);t.start();
        __CLR4_5_2z17z17lvha7hq7.R.inc(45547);latch.await();
        __CLR4_5_2z17z17lvha7hq7.R.inc(45548);semaphore.shutdown();
        __CLR4_5_2z17z17lvha7hq7.R.inc(45549);assertTrue("End of period not reached", semaphore.getPeriodEnds() > 0);
    }finally{__CLR4_5_2z17z17lvha7hq7.R.flushNeeded();}}

    /**
     * Tests the methods for statistics.
     *
     * @throws java.lang.InterruptedException so we don't have to catch it
     */
    @Test
    public void testGetAverageCallsPerPeriod() throws InterruptedException {__CLR4_5_2z17z17lvha7hq7.R.globalSliceStart(getClass().getName(),45550);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2le4j1lz5a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2z17z17lvha7hq7.R.rethrow($CLV_t2$);}finally{__CLR4_5_2z17z17lvha7hq7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.TimedSemaphoreTest.testGetAverageCallsPerPeriod",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),45550,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2le4j1lz5a() throws InterruptedException{try{__CLR4_5_2z17z17lvha7hq7.R.inc(45550);
        __CLR4_5_2z17z17lvha7hq7.R.inc(45551);final ScheduledExecutorService service = EasyMock
                .createMock(ScheduledExecutorService.class);
        __CLR4_5_2z17z17lvha7hq7.R.inc(45552);final ScheduledFuture<?> future = EasyMock.createMock(ScheduledFuture.class);
        __CLR4_5_2z17z17lvha7hq7.R.inc(45553);prepareStartTimer(service, future);
        __CLR4_5_2z17z17lvha7hq7.R.inc(45554);EasyMock.replay(service, future);
        __CLR4_5_2z17z17lvha7hq7.R.inc(45555);final TimedSemaphore semaphore = new TimedSemaphore(service, PERIOD, UNIT,
                LIMIT);
        __CLR4_5_2z17z17lvha7hq7.R.inc(45556);semaphore.acquire();
        __CLR4_5_2z17z17lvha7hq7.R.inc(45557);semaphore.endOfPeriod();
        __CLR4_5_2z17z17lvha7hq7.R.inc(45558);assertEquals("Wrong average (1)", 1.0, semaphore
                .getAverageCallsPerPeriod(), .005);
        __CLR4_5_2z17z17lvha7hq7.R.inc(45559);semaphore.acquire();
        __CLR4_5_2z17z17lvha7hq7.R.inc(45560);semaphore.acquire();
        __CLR4_5_2z17z17lvha7hq7.R.inc(45561);semaphore.endOfPeriod();
        __CLR4_5_2z17z17lvha7hq7.R.inc(45562);assertEquals("Wrong average (2)", 1.5, semaphore
                .getAverageCallsPerPeriod(), .005);
        __CLR4_5_2z17z17lvha7hq7.R.inc(45563);EasyMock.verify(service, future);
    }finally{__CLR4_5_2z17z17lvha7hq7.R.flushNeeded();}}

    /**
     * Tests whether the available non-blocking calls can be queried.
     *
     * @throws java.lang.InterruptedException so we don't have to catch it
     */
    @Test
    public void testGetAvailablePermits() throws InterruptedException {__CLR4_5_2z17z17lvha7hq7.R.globalSliceStart(getClass().getName(),45564);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23a7x0mz5o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2z17z17lvha7hq7.R.rethrow($CLV_t2$);}finally{__CLR4_5_2z17z17lvha7hq7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.TimedSemaphoreTest.testGetAvailablePermits",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),45564,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23a7x0mz5o() throws InterruptedException{try{__CLR4_5_2z17z17lvha7hq7.R.inc(45564);
        __CLR4_5_2z17z17lvha7hq7.R.inc(45565);final ScheduledExecutorService service = EasyMock
                .createMock(ScheduledExecutorService.class);
        __CLR4_5_2z17z17lvha7hq7.R.inc(45566);final ScheduledFuture<?> future = EasyMock.createMock(ScheduledFuture.class);
        __CLR4_5_2z17z17lvha7hq7.R.inc(45567);prepareStartTimer(service, future);
        __CLR4_5_2z17z17lvha7hq7.R.inc(45568);EasyMock.replay(service, future);
        __CLR4_5_2z17z17lvha7hq7.R.inc(45569);final TimedSemaphore semaphore = new TimedSemaphore(service, PERIOD, UNIT,
                LIMIT);
        __CLR4_5_2z17z17lvha7hq7.R.inc(45570);for (int i = 0; (((i < LIMIT)&&(__CLR4_5_2z17z17lvha7hq7.R.iget(45571)!=0|true))||(__CLR4_5_2z17z17lvha7hq7.R.iget(45572)==0&false)); i++) {{
            __CLR4_5_2z17z17lvha7hq7.R.inc(45573);assertEquals("Wrong available count at " + i, LIMIT - i, semaphore
                    .getAvailablePermits());
            __CLR4_5_2z17z17lvha7hq7.R.inc(45574);semaphore.acquire();
        }
        }__CLR4_5_2z17z17lvha7hq7.R.inc(45575);semaphore.endOfPeriod();
        __CLR4_5_2z17z17lvha7hq7.R.inc(45576);assertEquals("Wrong available count in new period", LIMIT, semaphore
                .getAvailablePermits());
        __CLR4_5_2z17z17lvha7hq7.R.inc(45577);EasyMock.verify(service, future);
    }finally{__CLR4_5_2z17z17lvha7hq7.R.flushNeeded();}}

    /**
     * Tests the tryAcquire() method. It is checked whether the semaphore can be acquired
     * by a bunch of threads the expected number of times and not more.
     */
    @Test
    public void testTryAcquire() throws InterruptedException {__CLR4_5_2z17z17lvha7hq7.R.globalSliceStart(getClass().getName(),45578);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2busbqsz62();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2z17z17lvha7hq7.R.rethrow($CLV_t2$);}finally{__CLR4_5_2z17z17lvha7hq7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.TimedSemaphoreTest.testTryAcquire",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),45578,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2busbqsz62() throws InterruptedException{try{__CLR4_5_2z17z17lvha7hq7.R.inc(45578);
        __CLR4_5_2z17z17lvha7hq7.R.inc(45579);final TimedSemaphore semaphore = new TimedSemaphore(PERIOD, TimeUnit.SECONDS,
                LIMIT);
        __CLR4_5_2z17z17lvha7hq7.R.inc(45580);final TryAcquireThread[] threads = new TryAcquireThread[3 * LIMIT];
        __CLR4_5_2z17z17lvha7hq7.R.inc(45581);final CountDownLatch latch = new CountDownLatch(1);
        __CLR4_5_2z17z17lvha7hq7.R.inc(45582);for (int i = 0; (((i < threads.length)&&(__CLR4_5_2z17z17lvha7hq7.R.iget(45583)!=0|true))||(__CLR4_5_2z17z17lvha7hq7.R.iget(45584)==0&false)); i++) {{
            __CLR4_5_2z17z17lvha7hq7.R.inc(45585);threads[i] = new TryAcquireThread(semaphore, latch);
            __CLR4_5_2z17z17lvha7hq7.R.inc(45586);threads[i].start();
        }

        }__CLR4_5_2z17z17lvha7hq7.R.inc(45587);latch.countDown();
        __CLR4_5_2z17z17lvha7hq7.R.inc(45588);int permits = 0;
        __CLR4_5_2z17z17lvha7hq7.R.inc(45589);for (final TryAcquireThread t : threads) {{
            __CLR4_5_2z17z17lvha7hq7.R.inc(45590);t.join();
            __CLR4_5_2z17z17lvha7hq7.R.inc(45591);if ((((t.acquired)&&(__CLR4_5_2z17z17lvha7hq7.R.iget(45592)!=0|true))||(__CLR4_5_2z17z17lvha7hq7.R.iget(45593)==0&false))) {{
                __CLR4_5_2z17z17lvha7hq7.R.inc(45594);permits++;
            }
        }}
        }__CLR4_5_2z17z17lvha7hq7.R.inc(45595);assertEquals("Wrong number of permits granted", LIMIT, permits);
    }finally{__CLR4_5_2z17z17lvha7hq7.R.flushNeeded();}}

    /**
     * Tries to call tryAcquire() after shutdown(). This should cause an exception.
     */
    @Test(expected = IllegalStateException.class)
    public void testTryAcquireAfterShutdown() {__CLR4_5_2z17z17lvha7hq7.R.globalSliceStart(getClass().getName(),45596);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_224ovroz6k();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,84,114,121,65,99,113,117,105,114,101,65,102,116,101,114,83,104,117,116,100,111,119,110,58,32,91,73,108,108,101,103,97,108,83,116,97,116,101,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalStateException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2z17z17lvha7hq7.R.rethrow($CLV_t2$);}finally{__CLR4_5_2z17z17lvha7hq7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.TimedSemaphoreTest.testTryAcquireAfterShutdown",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),45596,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_224ovroz6k(){try{__CLR4_5_2z17z17lvha7hq7.R.inc(45596);
        __CLR4_5_2z17z17lvha7hq7.R.inc(45597);final TimedSemaphore semaphore = new TimedSemaphore(PERIOD, UNIT, LIMIT);
        __CLR4_5_2z17z17lvha7hq7.R.inc(45598);semaphore.shutdown();
        __CLR4_5_2z17z17lvha7hq7.R.inc(45599);semaphore.tryAcquire();
    }finally{__CLR4_5_2z17z17lvha7hq7.R.flushNeeded();}}

    /**
     * A specialized implementation of {@code TimedSemaphore} that is easier to
     * test.
     */
    private static class TimedSemaphoreTestImpl extends TimedSemaphore {
        /** A mock scheduled future. */
        ScheduledFuture<?> schedFuture;

        /** A latch for synchronizing with the main thread. */
        volatile CountDownLatch latch;

        /** Counter for the endOfPeriod() invocations. */
        private int periodEnds;

        public TimedSemaphoreTestImpl(final long timePeriod, final TimeUnit timeUnit,
                final int limit) {
            super(timePeriod, timeUnit, limit);__CLR4_5_2z17z17lvha7hq7.R.inc(45601);try{__CLR4_5_2z17z17lvha7hq7.R.inc(45600);
        }finally{__CLR4_5_2z17z17lvha7hq7.R.flushNeeded();}}

        public TimedSemaphoreTestImpl(final ScheduledExecutorService service,
                final long timePeriod, final TimeUnit timeUnit, final int limit) {
            super(service, timePeriod, timeUnit, limit);__CLR4_5_2z17z17lvha7hq7.R.inc(45603);try{__CLR4_5_2z17z17lvha7hq7.R.inc(45602);
        }finally{__CLR4_5_2z17z17lvha7hq7.R.flushNeeded();}}

        /**
         * Returns the number of invocations of the endOfPeriod() method.
         *
         * @return the endOfPeriod() invocations
         */
        public int getPeriodEnds() {try{__CLR4_5_2z17z17lvha7hq7.R.inc(45604);
            __CLR4_5_2z17z17lvha7hq7.R.inc(45605);synchronized (this) {
                __CLR4_5_2z17z17lvha7hq7.R.inc(45606);return periodEnds;
            }
        }finally{__CLR4_5_2z17z17lvha7hq7.R.flushNeeded();}}

        /**
         * Invokes the latch if one is set.
         *
         * @throws java.lang.InterruptedException because it is declared that way in TimedSemaphore
         */
        @Override
        public synchronized void acquire() throws InterruptedException {try{__CLR4_5_2z17z17lvha7hq7.R.inc(45607);
            __CLR4_5_2z17z17lvha7hq7.R.inc(45608);super.acquire();
            __CLR4_5_2z17z17lvha7hq7.R.inc(45609);if ((((latch != null)&&(__CLR4_5_2z17z17lvha7hq7.R.iget(45610)!=0|true))||(__CLR4_5_2z17z17lvha7hq7.R.iget(45611)==0&false))) {{
                __CLR4_5_2z17z17lvha7hq7.R.inc(45612);latch.countDown();
            }
        }}finally{__CLR4_5_2z17z17lvha7hq7.R.flushNeeded();}}

        /**
         * Counts the number of invocations.
         */
        @Override
        protected synchronized void endOfPeriod() {try{__CLR4_5_2z17z17lvha7hq7.R.inc(45613);
            __CLR4_5_2z17z17lvha7hq7.R.inc(45614);super.endOfPeriod();
            __CLR4_5_2z17z17lvha7hq7.R.inc(45615);periodEnds++;
        }finally{__CLR4_5_2z17z17lvha7hq7.R.flushNeeded();}}

        /**
         * Either returns the mock future or calls the super method.
         */
        @Override
        protected ScheduledFuture<?> startTimer() {try{__CLR4_5_2z17z17lvha7hq7.R.inc(45616);
            __CLR4_5_2z17z17lvha7hq7.R.inc(45617);return (((schedFuture != null )&&(__CLR4_5_2z17z17lvha7hq7.R.iget(45618)!=0|true))||(__CLR4_5_2z17z17lvha7hq7.R.iget(45619)==0&false))? schedFuture : super.startTimer();
        }finally{__CLR4_5_2z17z17lvha7hq7.R.flushNeeded();}}
    }

    /**
     * A test thread class that will be used by tests for triggering the
     * semaphore. The thread calls the semaphore a configurable number of times.
     * When this is done, it can notify the main thread.
     */
    private static class SemaphoreThread extends Thread {
        /** The semaphore. */
        private final TimedSemaphore semaphore;

        /** A latch for communication with the main thread. */
        private final CountDownLatch latch;

        /** The number of acquire() calls. */
        private final int count;

        /** The number of invocations of the latch. */
        private final int latchCount;

        public SemaphoreThread(final TimedSemaphore b, final CountDownLatch l, final int c, final int lc) {try{__CLR4_5_2z17z17lvha7hq7.R.inc(45620);
            __CLR4_5_2z17z17lvha7hq7.R.inc(45621);semaphore = b;
            __CLR4_5_2z17z17lvha7hq7.R.inc(45622);latch = l;
            __CLR4_5_2z17z17lvha7hq7.R.inc(45623);count = c;
            __CLR4_5_2z17z17lvha7hq7.R.inc(45624);latchCount = lc;
        }finally{__CLR4_5_2z17z17lvha7hq7.R.flushNeeded();}}

        /**
         * Calls acquire() on the semaphore for the specified number of times.
         * Optionally the latch will also be triggered to synchronize with the
         * main test thread.
         */
        @Override
        public void run() {try{__CLR4_5_2z17z17lvha7hq7.R.inc(45625);
            __CLR4_5_2z17z17lvha7hq7.R.inc(45626);try {
                __CLR4_5_2z17z17lvha7hq7.R.inc(45627);for (int i = 0; (((i < count)&&(__CLR4_5_2z17z17lvha7hq7.R.iget(45628)!=0|true))||(__CLR4_5_2z17z17lvha7hq7.R.iget(45629)==0&false)); i++) {{
                    __CLR4_5_2z17z17lvha7hq7.R.inc(45630);semaphore.acquire();

                    __CLR4_5_2z17z17lvha7hq7.R.inc(45631);if ((((i < latchCount)&&(__CLR4_5_2z17z17lvha7hq7.R.iget(45632)!=0|true))||(__CLR4_5_2z17z17lvha7hq7.R.iget(45633)==0&false))) {{
                        __CLR4_5_2z17z17lvha7hq7.R.inc(45634);latch.countDown();
                    }
                }}
            }} catch (final InterruptedException iex) {
                __CLR4_5_2z17z17lvha7hq7.R.inc(45635);Thread.currentThread().interrupt();
            }
        }finally{__CLR4_5_2z17z17lvha7hq7.R.flushNeeded();}}
    }

    /**
     * A test thread class which invokes {@code tryAcquire()} on the test semaphore and
     * records the return value.
     */
    private static class TryAcquireThread extends Thread {
        /** The semaphore. */
        private final TimedSemaphore semaphore;

        /** A latch for communication with the main thread. */
        private final CountDownLatch latch;

        /** Flag whether a permit could be acquired. */
        private boolean acquired;

        public TryAcquireThread(final TimedSemaphore s, final CountDownLatch l) {try{__CLR4_5_2z17z17lvha7hq7.R.inc(45636);
            __CLR4_5_2z17z17lvha7hq7.R.inc(45637);semaphore = s;
            __CLR4_5_2z17z17lvha7hq7.R.inc(45638);latch = l;
        }finally{__CLR4_5_2z17z17lvha7hq7.R.flushNeeded();}}

        @Override
        public void run() {try{__CLR4_5_2z17z17lvha7hq7.R.inc(45639);
            __CLR4_5_2z17z17lvha7hq7.R.inc(45640);try {
                __CLR4_5_2z17z17lvha7hq7.R.inc(45641);if ((((latch.await(10, TimeUnit.SECONDS))&&(__CLR4_5_2z17z17lvha7hq7.R.iget(45642)!=0|true))||(__CLR4_5_2z17z17lvha7hq7.R.iget(45643)==0&false))) {{
                    __CLR4_5_2z17z17lvha7hq7.R.inc(45644);acquired = semaphore.tryAcquire();
                }
            }} catch (final InterruptedException iex) {
                // ignore
            }
        }finally{__CLR4_5_2z17z17lvha7hq7.R.flushNeeded();}}
    }
}
