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

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import org.junit.Test;

/**
 * Test class for {@code CallableBackgroundInitializer}
 */
public class CallableBackgroundInitializerTest  {static class __CLR4_5_2yi3yi3lvha7hni{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172763741L,8589935092L,44737,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /** Constant for the result of the call() invocation. */
    private static final Integer RESULT = Integer.valueOf(42);

    /**
     * Tries to create an instance without a Callable. This should cause an
     * exception.
     */
    @Test(expected=IllegalArgumentException.class)
    public void testInitNullCallable() {__CLR4_5_2yi3yi3lvha7hni.R.globalSliceStart(getClass().getName(),44715);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2cbejkoyi3();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,73,110,105,116,78,117,108,108,67,97,108,108,97,98,108,101,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2yi3yi3lvha7hni.R.rethrow($CLV_t2$);}finally{__CLR4_5_2yi3yi3lvha7hni.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.CallableBackgroundInitializerTest.testInitNullCallable",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44715,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2cbejkoyi3(){try{__CLR4_5_2yi3yi3lvha7hni.R.inc(44715);
        __CLR4_5_2yi3yi3lvha7hni.R.inc(44716);new CallableBackgroundInitializer<>(null);
    }finally{__CLR4_5_2yi3yi3lvha7hni.R.flushNeeded();}}

    /**
     * Tests whether the executor service is correctly passed to the super
     * class.
     */
    @Test
    public void testInitExecutor() throws InterruptedException {__CLR4_5_2yi3yi3lvha7hni.R.globalSliceStart(getClass().getName(),44717);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_25h8rdwyi5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2yi3yi3lvha7hni.R.rethrow($CLV_t2$);}finally{__CLR4_5_2yi3yi3lvha7hni.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.CallableBackgroundInitializerTest.testInitExecutor",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44717,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_25h8rdwyi5() throws InterruptedException{try{__CLR4_5_2yi3yi3lvha7hni.R.inc(44717);
        __CLR4_5_2yi3yi3lvha7hni.R.inc(44718);final ExecutorService exec = Executors.newSingleThreadExecutor();
        __CLR4_5_2yi3yi3lvha7hni.R.inc(44719);final CallableBackgroundInitializer<Integer> init = new CallableBackgroundInitializer<>(
                new TestCallable(), exec);
        __CLR4_5_2yi3yi3lvha7hni.R.inc(44720);assertEquals("Executor not set", exec, init.getExternalExecutor());
        __CLR4_5_2yi3yi3lvha7hni.R.inc(44721);exec.shutdown();
        __CLR4_5_2yi3yi3lvha7hni.R.inc(44722);exec.awaitTermination(1, TimeUnit.SECONDS);
    }finally{__CLR4_5_2yi3yi3lvha7hni.R.flushNeeded();}}

    /**
     * Tries to pass a null Callable to the constructor that takes an executor.
     * This should cause an exception.
     */
    @Test(expected=IllegalArgumentException.class)
    public void testInitExecutorNullCallable() throws InterruptedException {__CLR4_5_2yi3yi3lvha7hni.R.globalSliceStart(getClass().getName(),44723);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2xg3r7pyib();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,73,110,105,116,69,120,101,99,117,116,111,114,78,117,108,108,67,97,108,108,97,98,108,101,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2yi3yi3lvha7hni.R.rethrow($CLV_t2$);}finally{__CLR4_5_2yi3yi3lvha7hni.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.CallableBackgroundInitializerTest.testInitExecutorNullCallable",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44723,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2xg3r7pyib() throws InterruptedException{try{__CLR4_5_2yi3yi3lvha7hni.R.inc(44723);
        __CLR4_5_2yi3yi3lvha7hni.R.inc(44724);final ExecutorService exec = Executors.newSingleThreadExecutor();
        __CLR4_5_2yi3yi3lvha7hni.R.inc(44725);try {
            __CLR4_5_2yi3yi3lvha7hni.R.inc(44726);new CallableBackgroundInitializer<Integer>(null, exec);
        } finally {
            __CLR4_5_2yi3yi3lvha7hni.R.inc(44727);exec.shutdown();
            __CLR4_5_2yi3yi3lvha7hni.R.inc(44728);exec.awaitTermination(1, TimeUnit.SECONDS);
        }
        
    }finally{__CLR4_5_2yi3yi3lvha7hni.R.flushNeeded();}}

    /**
     * Tests the implementation of initialize().
     *
     * @throws java.lang.Exception so we don't have to catch it
     */
    @Test
    public void testInitialize() throws Exception {__CLR4_5_2yi3yi3lvha7hni.R.globalSliceStart(getClass().getName(),44729);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_25j52d3yih();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2yi3yi3lvha7hni.R.rethrow($CLV_t2$);}finally{__CLR4_5_2yi3yi3lvha7hni.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.CallableBackgroundInitializerTest.testInitialize",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44729,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_25j52d3yih() throws Exception{try{__CLR4_5_2yi3yi3lvha7hni.R.inc(44729);
        __CLR4_5_2yi3yi3lvha7hni.R.inc(44730);final TestCallable call = new TestCallable();
        __CLR4_5_2yi3yi3lvha7hni.R.inc(44731);final CallableBackgroundInitializer<Integer> init = new CallableBackgroundInitializer<>(
                call);
        __CLR4_5_2yi3yi3lvha7hni.R.inc(44732);assertEquals("Wrong result", RESULT, init.initialize());
        __CLR4_5_2yi3yi3lvha7hni.R.inc(44733);assertEquals("Wrong number of invocations", 1, call.callCount);
    }finally{__CLR4_5_2yi3yi3lvha7hni.R.flushNeeded();}}

    /**
     * A test Callable implementation for checking the initializer's
     * implementation of the initialize() method.
     */
    private static class TestCallable implements Callable<Integer> {
        /** A counter for the number of call() invocations. */
        int callCount;

        /**
         * Records this invocation and returns the test result.
         */
        @Override
        public Integer call() throws Exception {try{__CLR4_5_2yi3yi3lvha7hni.R.inc(44734);
            __CLR4_5_2yi3yi3lvha7hni.R.inc(44735);callCount++;
            __CLR4_5_2yi3yi3lvha7hni.R.inc(44736);return RESULT;
        }finally{__CLR4_5_2yi3yi3lvha7hni.R.flushNeeded();}}
    }
}
