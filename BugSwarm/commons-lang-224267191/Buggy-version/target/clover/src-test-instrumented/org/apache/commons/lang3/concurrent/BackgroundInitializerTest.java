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

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

public class BackgroundInitializerTest {static class __CLR4_5_2yapyaplvha7hn0{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172763741L,8589935092L,44581,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /**
     * Helper method for checking whether the initialize() method was correctly
     * called. start() must already have been invoked.
     *
     * @param init the initializer to test
     */
    private void checkInitialize(final BackgroundInitializerTestImpl init) {try{__CLR4_5_2yapyaplvha7hn0.R.inc(44449);
        __CLR4_5_2yapyaplvha7hn0.R.inc(44450);try {
            __CLR4_5_2yapyaplvha7hn0.R.inc(44451);final Integer result = init.get();
            __CLR4_5_2yapyaplvha7hn0.R.inc(44452);assertEquals("Wrong result", 1, result.intValue());
            __CLR4_5_2yapyaplvha7hn0.R.inc(44453);assertEquals("Wrong number of invocations", 1, init.initializeCalls);
            __CLR4_5_2yapyaplvha7hn0.R.inc(44454);assertNotNull("No future", init.getFuture());
        } catch (final ConcurrentException cex) {
            __CLR4_5_2yapyaplvha7hn0.R.inc(44455);fail("Unexpected exception: " + cex);
        }
    }finally{__CLR4_5_2yapyaplvha7hn0.R.flushNeeded();}}

    /**
     * Tests whether initialize() is invoked.
     */
    @Test
    public void testInitialize() {__CLR4_5_2yapyaplvha7hn0.R.globalSliceStart(getClass().getName(),44456);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_25j52d3yaw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2yapyaplvha7hn0.R.rethrow($CLV_t2$);}finally{__CLR4_5_2yapyaplvha7hn0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.BackgroundInitializerTest.testInitialize",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44456,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_25j52d3yaw(){try{__CLR4_5_2yapyaplvha7hn0.R.inc(44456);
        __CLR4_5_2yapyaplvha7hn0.R.inc(44457);final BackgroundInitializerTestImpl init = new BackgroundInitializerTestImpl();
        __CLR4_5_2yapyaplvha7hn0.R.inc(44458);init.start();
        __CLR4_5_2yapyaplvha7hn0.R.inc(44459);checkInitialize(init);
    }finally{__CLR4_5_2yapyaplvha7hn0.R.flushNeeded();}}

    /**
     * Tries to obtain the executor before start(). It should not have been
     * initialized yet.
     */
    @Test
    public void testGetActiveExecutorBeforeStart() {__CLR4_5_2yapyaplvha7hn0.R.globalSliceStart(getClass().getName(),44460);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_25fvz71yb0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2yapyaplvha7hn0.R.rethrow($CLV_t2$);}finally{__CLR4_5_2yapyaplvha7hn0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.BackgroundInitializerTest.testGetActiveExecutorBeforeStart",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44460,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_25fvz71yb0(){try{__CLR4_5_2yapyaplvha7hn0.R.inc(44460);
        __CLR4_5_2yapyaplvha7hn0.R.inc(44461);final BackgroundInitializerTestImpl init = new BackgroundInitializerTestImpl();
        __CLR4_5_2yapyaplvha7hn0.R.inc(44462);assertNull("Got an executor", init.getActiveExecutor());
    }finally{__CLR4_5_2yapyaplvha7hn0.R.flushNeeded();}}

    /**
     * Tests whether an external executor is correctly detected.
     */
    @Test
    public void testGetActiveExecutorExternal() throws InterruptedException {__CLR4_5_2yapyaplvha7hn0.R.globalSliceStart(getClass().getName(),44463);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2f9obe7yb3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2yapyaplvha7hn0.R.rethrow($CLV_t2$);}finally{__CLR4_5_2yapyaplvha7hn0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.BackgroundInitializerTest.testGetActiveExecutorExternal",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44463,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2f9obe7yb3() throws InterruptedException{try{__CLR4_5_2yapyaplvha7hn0.R.inc(44463);
        __CLR4_5_2yapyaplvha7hn0.R.inc(44464);final ExecutorService exec = Executors.newSingleThreadExecutor();
        __CLR4_5_2yapyaplvha7hn0.R.inc(44465);try {
            __CLR4_5_2yapyaplvha7hn0.R.inc(44466);final BackgroundInitializerTestImpl init = new BackgroundInitializerTestImpl(
                    exec);
            __CLR4_5_2yapyaplvha7hn0.R.inc(44467);init.start();
            __CLR4_5_2yapyaplvha7hn0.R.inc(44468);assertSame("Wrong executor", exec, init.getActiveExecutor());
            __CLR4_5_2yapyaplvha7hn0.R.inc(44469);checkInitialize(init);
        } finally {
            __CLR4_5_2yapyaplvha7hn0.R.inc(44470);exec.shutdown();
            __CLR4_5_2yapyaplvha7hn0.R.inc(44471);exec.awaitTermination(1, TimeUnit.SECONDS);
        }
    }finally{__CLR4_5_2yapyaplvha7hn0.R.flushNeeded();}}

    /**
     * Tests getActiveExecutor() for a temporary executor.
     */
    @Test
    public void testGetActiveExecutorTemp() {__CLR4_5_2yapyaplvha7hn0.R.globalSliceStart(getClass().getName(),44472);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2x0r76gybc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2yapyaplvha7hn0.R.rethrow($CLV_t2$);}finally{__CLR4_5_2yapyaplvha7hn0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.BackgroundInitializerTest.testGetActiveExecutorTemp",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44472,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2x0r76gybc(){try{__CLR4_5_2yapyaplvha7hn0.R.inc(44472);
        __CLR4_5_2yapyaplvha7hn0.R.inc(44473);final BackgroundInitializerTestImpl init = new BackgroundInitializerTestImpl();
        __CLR4_5_2yapyaplvha7hn0.R.inc(44474);init.start();
        __CLR4_5_2yapyaplvha7hn0.R.inc(44475);assertNotNull("No active executor", init.getActiveExecutor());
        __CLR4_5_2yapyaplvha7hn0.R.inc(44476);checkInitialize(init);
    }finally{__CLR4_5_2yapyaplvha7hn0.R.flushNeeded();}}

    /**
     * Tests the execution of the background task if a temporary executor has to
     * be created.
     */
    @Test
    public void testInitializeTempExecutor() {__CLR4_5_2yapyaplvha7hn0.R.globalSliceStart(getClass().getName(),44477);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23y2lo0ybh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2yapyaplvha7hn0.R.rethrow($CLV_t2$);}finally{__CLR4_5_2yapyaplvha7hn0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.BackgroundInitializerTest.testInitializeTempExecutor",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44477,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23y2lo0ybh(){try{__CLR4_5_2yapyaplvha7hn0.R.inc(44477);
        __CLR4_5_2yapyaplvha7hn0.R.inc(44478);final BackgroundInitializerTestImpl init = new BackgroundInitializerTestImpl();
        __CLR4_5_2yapyaplvha7hn0.R.inc(44479);assertTrue("Wrong result of start()", init.start());
        __CLR4_5_2yapyaplvha7hn0.R.inc(44480);checkInitialize(init);
        __CLR4_5_2yapyaplvha7hn0.R.inc(44481);assertTrue("Executor not shutdown", init.getActiveExecutor()
                .isShutdown());
    }finally{__CLR4_5_2yapyaplvha7hn0.R.flushNeeded();}}

    /**
     * Tests whether an external executor can be set using the
     * setExternalExecutor() method.
     */
    @Test
    public void testSetExternalExecutor() {__CLR4_5_2yapyaplvha7hn0.R.globalSliceStart(getClass().getName(),44482);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28oz7x1ybm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2yapyaplvha7hn0.R.rethrow($CLV_t2$);}finally{__CLR4_5_2yapyaplvha7hn0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.BackgroundInitializerTest.testSetExternalExecutor",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44482,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28oz7x1ybm(){try{__CLR4_5_2yapyaplvha7hn0.R.inc(44482);
        __CLR4_5_2yapyaplvha7hn0.R.inc(44483);final ExecutorService exec = Executors.newCachedThreadPool();
        __CLR4_5_2yapyaplvha7hn0.R.inc(44484);try {
            __CLR4_5_2yapyaplvha7hn0.R.inc(44485);final BackgroundInitializerTestImpl init = new BackgroundInitializerTestImpl();
            __CLR4_5_2yapyaplvha7hn0.R.inc(44486);init.setExternalExecutor(exec);
            __CLR4_5_2yapyaplvha7hn0.R.inc(44487);assertEquals("Wrong executor service", exec, init
                    .getExternalExecutor());
            __CLR4_5_2yapyaplvha7hn0.R.inc(44488);assertTrue("Wrong result of start()", init.start());
            __CLR4_5_2yapyaplvha7hn0.R.inc(44489);assertSame("Wrong active executor", exec, init.getActiveExecutor());
            __CLR4_5_2yapyaplvha7hn0.R.inc(44490);checkInitialize(init);
            __CLR4_5_2yapyaplvha7hn0.R.inc(44491);assertFalse("Executor was shutdown", exec.isShutdown());
        } finally {
            __CLR4_5_2yapyaplvha7hn0.R.inc(44492);exec.shutdown();
        }
    }finally{__CLR4_5_2yapyaplvha7hn0.R.flushNeeded();}}

    /**
     * Tests that setting an executor after start() causes an exception.
     *
     * @throws org.apache.commons.lang3.concurrent.ConcurrentException because the test implementation may throw it
     */
    @Test
    public void testSetExternalExecutorAfterStart() throws ConcurrentException, InterruptedException {__CLR4_5_2yapyaplvha7hn0.R.globalSliceStart(getClass().getName(),44493);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2xc97krybx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2yapyaplvha7hn0.R.rethrow($CLV_t2$);}finally{__CLR4_5_2yapyaplvha7hn0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.BackgroundInitializerTest.testSetExternalExecutorAfterStart",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44493,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2xc97krybx() throws ConcurrentException, InterruptedException{try{__CLR4_5_2yapyaplvha7hn0.R.inc(44493);
        __CLR4_5_2yapyaplvha7hn0.R.inc(44494);final BackgroundInitializerTestImpl init = new BackgroundInitializerTestImpl();
        __CLR4_5_2yapyaplvha7hn0.R.inc(44495);init.start();
        __CLR4_5_2yapyaplvha7hn0.R.inc(44496);final ExecutorService exec = Executors.newSingleThreadExecutor();
        __CLR4_5_2yapyaplvha7hn0.R.inc(44497);try {
            __CLR4_5_2yapyaplvha7hn0.R.inc(44498);init.setExternalExecutor(exec);
            __CLR4_5_2yapyaplvha7hn0.R.inc(44499);fail("Could set executor after start()!");
        } catch (final IllegalStateException istex) {
            __CLR4_5_2yapyaplvha7hn0.R.inc(44500);init.get();
        } finally {
            __CLR4_5_2yapyaplvha7hn0.R.inc(44501);exec.shutdown();
            __CLR4_5_2yapyaplvha7hn0.R.inc(44502);exec.awaitTermination(1, TimeUnit.SECONDS);
        }
    }finally{__CLR4_5_2yapyaplvha7hn0.R.flushNeeded();}}

    /**
     * Tests invoking start() multiple times. Only the first invocation should
     * have an effect.
     */
    @Test
    public void testStartMultipleTimes() {__CLR4_5_2yapyaplvha7hn0.R.globalSliceStart(getClass().getName(),44503);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24o7dsdyc7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2yapyaplvha7hn0.R.rethrow($CLV_t2$);}finally{__CLR4_5_2yapyaplvha7hn0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.BackgroundInitializerTest.testStartMultipleTimes",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44503,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24o7dsdyc7(){try{__CLR4_5_2yapyaplvha7hn0.R.inc(44503);
        __CLR4_5_2yapyaplvha7hn0.R.inc(44504);final BackgroundInitializerTestImpl init = new BackgroundInitializerTestImpl();
        __CLR4_5_2yapyaplvha7hn0.R.inc(44505);assertTrue("Wrong result for start()", init.start());
        __CLR4_5_2yapyaplvha7hn0.R.inc(44506);for (int i = 0; (((i < 10)&&(__CLR4_5_2yapyaplvha7hn0.R.iget(44507)!=0|true))||(__CLR4_5_2yapyaplvha7hn0.R.iget(44508)==0&false)); i++) {{
            __CLR4_5_2yapyaplvha7hn0.R.inc(44509);assertFalse("Could start again", init.start());
        }
        }__CLR4_5_2yapyaplvha7hn0.R.inc(44510);checkInitialize(init);
    }finally{__CLR4_5_2yapyaplvha7hn0.R.flushNeeded();}}

    /**
     * Tests calling get() before start(). This should cause an exception.
     *
     * @throws org.apache.commons.lang3.concurrent.ConcurrentException because the test implementation may throw it
     */
    @Test(expected=IllegalStateException.class)
    public void testGetBeforeStart() throws ConcurrentException {__CLR4_5_2yapyaplvha7hn0.R.globalSliceStart(getClass().getName(),44511);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2k7q8auycf();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,71,101,116,66,101,102,111,114,101,83,116,97,114,116,58,32,91,73,108,108,101,103,97,108,83,116,97,116,101,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalStateException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2yapyaplvha7hn0.R.rethrow($CLV_t2$);}finally{__CLR4_5_2yapyaplvha7hn0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.BackgroundInitializerTest.testGetBeforeStart",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44511,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2k7q8auycf() throws ConcurrentException{try{__CLR4_5_2yapyaplvha7hn0.R.inc(44511);
        __CLR4_5_2yapyaplvha7hn0.R.inc(44512);final BackgroundInitializerTestImpl init = new BackgroundInitializerTestImpl();
        __CLR4_5_2yapyaplvha7hn0.R.inc(44513);init.get();
    }finally{__CLR4_5_2yapyaplvha7hn0.R.flushNeeded();}}

    /**
     * Tests the get() method if background processing causes a runtime
     * exception.
     */
    @Test
    public void testGetRuntimeException() {__CLR4_5_2yapyaplvha7hn0.R.globalSliceStart(getClass().getName(),44514);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2q5fm7yyci();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2yapyaplvha7hn0.R.rethrow($CLV_t2$);}finally{__CLR4_5_2yapyaplvha7hn0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.BackgroundInitializerTest.testGetRuntimeException",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44514,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2q5fm7yyci(){try{__CLR4_5_2yapyaplvha7hn0.R.inc(44514);
        __CLR4_5_2yapyaplvha7hn0.R.inc(44515);final BackgroundInitializerTestImpl init = new BackgroundInitializerTestImpl();
        __CLR4_5_2yapyaplvha7hn0.R.inc(44516);final RuntimeException rex = new RuntimeException();
        __CLR4_5_2yapyaplvha7hn0.R.inc(44517);init.ex = rex;
        __CLR4_5_2yapyaplvha7hn0.R.inc(44518);init.start();
        __CLR4_5_2yapyaplvha7hn0.R.inc(44519);try {
            __CLR4_5_2yapyaplvha7hn0.R.inc(44520);init.get();
            __CLR4_5_2yapyaplvha7hn0.R.inc(44521);fail("Exception not thrown!");
        } catch (final Exception ex) {
            __CLR4_5_2yapyaplvha7hn0.R.inc(44522);assertEquals("Runtime exception not thrown", rex, ex);
        }
    }finally{__CLR4_5_2yapyaplvha7hn0.R.flushNeeded();}}

    /**
     * Tests the get() method if background processing causes a checked
     * exception.
     */
    @Test
    public void testGetCheckedException() {__CLR4_5_2yapyaplvha7hn0.R.globalSliceStart(getClass().getName(),44523);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2o6we31ycr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2yapyaplvha7hn0.R.rethrow($CLV_t2$);}finally{__CLR4_5_2yapyaplvha7hn0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.BackgroundInitializerTest.testGetCheckedException",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44523,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2o6we31ycr(){try{__CLR4_5_2yapyaplvha7hn0.R.inc(44523);
        __CLR4_5_2yapyaplvha7hn0.R.inc(44524);final BackgroundInitializerTestImpl init = new BackgroundInitializerTestImpl();
        __CLR4_5_2yapyaplvha7hn0.R.inc(44525);final Exception ex = new Exception();
        __CLR4_5_2yapyaplvha7hn0.R.inc(44526);init.ex = ex;
        __CLR4_5_2yapyaplvha7hn0.R.inc(44527);init.start();
        __CLR4_5_2yapyaplvha7hn0.R.inc(44528);try {
            __CLR4_5_2yapyaplvha7hn0.R.inc(44529);init.get();
            __CLR4_5_2yapyaplvha7hn0.R.inc(44530);fail("Exception not thrown!");
        } catch (final ConcurrentException cex) {
            __CLR4_5_2yapyaplvha7hn0.R.inc(44531);assertEquals("Exception not thrown", ex, cex.getCause());
        }
    }finally{__CLR4_5_2yapyaplvha7hn0.R.flushNeeded();}}

    /**
     * Tests the get() method if waiting for the initialization is interrupted.
     *
     * @throws java.lang.InterruptedException because we're making use of Java's concurrent API
     */
    @Test
    public void testGetInterruptedException() throws InterruptedException {__CLR4_5_2yapyaplvha7hn0.R.globalSliceStart(getClass().getName(),44532);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2b5lctkyd0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2yapyaplvha7hn0.R.rethrow($CLV_t2$);}finally{__CLR4_5_2yapyaplvha7hn0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.BackgroundInitializerTest.testGetInterruptedException",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44532,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2b5lctkyd0() throws InterruptedException{try{__CLR4_5_2yapyaplvha7hn0.R.inc(44532);
        __CLR4_5_2yapyaplvha7hn0.R.inc(44533);final ExecutorService exec = Executors.newSingleThreadExecutor();
        __CLR4_5_2yapyaplvha7hn0.R.inc(44534);final BackgroundInitializerTestImpl init = new BackgroundInitializerTestImpl(
                exec);
        __CLR4_5_2yapyaplvha7hn0.R.inc(44535);final CountDownLatch latch1 = new CountDownLatch(1);
        __CLR4_5_2yapyaplvha7hn0.R.inc(44536);init.shouldSleep = true;
        __CLR4_5_2yapyaplvha7hn0.R.inc(44537);init.start();
        __CLR4_5_2yapyaplvha7hn0.R.inc(44538);final AtomicReference<InterruptedException> iex = new AtomicReference<>();
        __CLR4_5_2yapyaplvha7hn0.R.inc(44539);final Thread getThread = new Thread() {
            @Override
            public void run() {try{__CLR4_5_2yapyaplvha7hn0.R.inc(44540);
                __CLR4_5_2yapyaplvha7hn0.R.inc(44541);try {
                    __CLR4_5_2yapyaplvha7hn0.R.inc(44542);init.get();
                } catch (final ConcurrentException cex) {
                    __CLR4_5_2yapyaplvha7hn0.R.inc(44543);if ((((cex.getCause() instanceof InterruptedException)&&(__CLR4_5_2yapyaplvha7hn0.R.iget(44544)!=0|true))||(__CLR4_5_2yapyaplvha7hn0.R.iget(44545)==0&false))) {{
                        __CLR4_5_2yapyaplvha7hn0.R.inc(44546);iex.set((InterruptedException) cex.getCause());
                    }
                }} finally {
                    __CLR4_5_2yapyaplvha7hn0.R.inc(44547);assertTrue("Thread not interrupted", isInterrupted());
                    __CLR4_5_2yapyaplvha7hn0.R.inc(44548);latch1.countDown();
                }
            }finally{__CLR4_5_2yapyaplvha7hn0.R.flushNeeded();}}
        };
        __CLR4_5_2yapyaplvha7hn0.R.inc(44549);getThread.start();
        __CLR4_5_2yapyaplvha7hn0.R.inc(44550);getThread.interrupt();
        __CLR4_5_2yapyaplvha7hn0.R.inc(44551);latch1.await();
        __CLR4_5_2yapyaplvha7hn0.R.inc(44552);exec.shutdownNow();
        __CLR4_5_2yapyaplvha7hn0.R.inc(44553);exec.awaitTermination(1, TimeUnit.SECONDS);
        __CLR4_5_2yapyaplvha7hn0.R.inc(44554);assertNotNull("No interrupted exception", iex.get());
    }finally{__CLR4_5_2yapyaplvha7hn0.R.flushNeeded();}}

    /**
     * Tests isStarted() before start() was called.
     */
    @Test
    public void testIsStartedFalse() {__CLR4_5_2yapyaplvha7hn0.R.globalSliceStart(getClass().getName(),44555);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2x2olwbydn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2yapyaplvha7hn0.R.rethrow($CLV_t2$);}finally{__CLR4_5_2yapyaplvha7hn0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.BackgroundInitializerTest.testIsStartedFalse",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44555,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2x2olwbydn(){try{__CLR4_5_2yapyaplvha7hn0.R.inc(44555);
        __CLR4_5_2yapyaplvha7hn0.R.inc(44556);final BackgroundInitializerTestImpl init = new BackgroundInitializerTestImpl();
        __CLR4_5_2yapyaplvha7hn0.R.inc(44557);assertFalse("Already started", init.isStarted());
    }finally{__CLR4_5_2yapyaplvha7hn0.R.flushNeeded();}}

    /**
     * Tests isStarted() after start().
     */
    @Test
    public void testIsStartedTrue() {__CLR4_5_2yapyaplvha7hn0.R.globalSliceStart(getClass().getName(),44558);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2oka15yydq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2yapyaplvha7hn0.R.rethrow($CLV_t2$);}finally{__CLR4_5_2yapyaplvha7hn0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.BackgroundInitializerTest.testIsStartedTrue",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44558,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2oka15yydq(){try{__CLR4_5_2yapyaplvha7hn0.R.inc(44558);
        __CLR4_5_2yapyaplvha7hn0.R.inc(44559);final BackgroundInitializerTestImpl init = new BackgroundInitializerTestImpl();
        __CLR4_5_2yapyaplvha7hn0.R.inc(44560);init.start();
        __CLR4_5_2yapyaplvha7hn0.R.inc(44561);assertTrue("Not started", init.isStarted());
    }finally{__CLR4_5_2yapyaplvha7hn0.R.flushNeeded();}}

    /**
     * Tests isStarted() after the background task has finished.
     */
    @Test
    public void testIsStartedAfterGet() {__CLR4_5_2yapyaplvha7hn0.R.globalSliceStart(getClass().getName(),44562);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2getqmyydu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2yapyaplvha7hn0.R.rethrow($CLV_t2$);}finally{__CLR4_5_2yapyaplvha7hn0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.BackgroundInitializerTest.testIsStartedAfterGet",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44562,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2getqmyydu(){try{__CLR4_5_2yapyaplvha7hn0.R.inc(44562);
        __CLR4_5_2yapyaplvha7hn0.R.inc(44563);final BackgroundInitializerTestImpl init = new BackgroundInitializerTestImpl();
        __CLR4_5_2yapyaplvha7hn0.R.inc(44564);init.start();
        __CLR4_5_2yapyaplvha7hn0.R.inc(44565);checkInitialize(init);
        __CLR4_5_2yapyaplvha7hn0.R.inc(44566);assertTrue("Not started", init.isStarted());
    }finally{__CLR4_5_2yapyaplvha7hn0.R.flushNeeded();}}

    /**
     * A concrete implementation of BackgroundInitializer. It also overloads
     * some methods that simplify testing.
     */
    private static class BackgroundInitializerTestImpl extends
            BackgroundInitializer<Integer> {
        /** An exception to be thrown by initialize(). */
        Exception ex;

        /** A flag whether the background task should sleep a while. */
        boolean shouldSleep;

        /** The number of invocations of initialize(). */
        volatile int initializeCalls;

        public BackgroundInitializerTestImpl() {
            super();__CLR4_5_2yapyaplvha7hn0.R.inc(44568);try{__CLR4_5_2yapyaplvha7hn0.R.inc(44567);
        }finally{__CLR4_5_2yapyaplvha7hn0.R.flushNeeded();}}

        public BackgroundInitializerTestImpl(final ExecutorService exec) {
            super(exec);__CLR4_5_2yapyaplvha7hn0.R.inc(44570);try{__CLR4_5_2yapyaplvha7hn0.R.inc(44569);
        }finally{__CLR4_5_2yapyaplvha7hn0.R.flushNeeded();}}

        /**
         * Records this invocation. Optionally throws an exception or sleeps a
         * while.
         *
         * @throws Exception in case of an error
         */
        @Override
        protected Integer initialize() throws Exception {try{__CLR4_5_2yapyaplvha7hn0.R.inc(44571);
            __CLR4_5_2yapyaplvha7hn0.R.inc(44572);if ((((ex != null)&&(__CLR4_5_2yapyaplvha7hn0.R.iget(44573)!=0|true))||(__CLR4_5_2yapyaplvha7hn0.R.iget(44574)==0&false))) {{
                __CLR4_5_2yapyaplvha7hn0.R.inc(44575);throw ex;
            }
            }__CLR4_5_2yapyaplvha7hn0.R.inc(44576);if ((((shouldSleep)&&(__CLR4_5_2yapyaplvha7hn0.R.iget(44577)!=0|true))||(__CLR4_5_2yapyaplvha7hn0.R.iget(44578)==0&false))) {{
                __CLR4_5_2yapyaplvha7hn0.R.inc(44579);Thread.sleep(60000L);
            }
            }__CLR4_5_2yapyaplvha7hn0.R.inc(44580);return Integer.valueOf(++initializeCalls);
        }finally{__CLR4_5_2yapyaplvha7hn0.R.flushNeeded();}}
    }
}
