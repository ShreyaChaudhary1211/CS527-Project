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
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;

/**
 * Test class for {@link MultiBackgroundInitializer}.
 */
public class MultiBackgroundInitializerTest {static class __CLR4_5_2ywhywhlvha7hp7{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172763741L,8589935092L,45384,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /** Constant for the names of the child initializers. */
    private static final String CHILD_INIT = "childInitializer";

    /** The initializer to be tested. */
    private MultiBackgroundInitializer initializer;

    @Before
    public void setUp() throws Exception {try{__CLR4_5_2ywhywhlvha7hp7.R.inc(45233);
        __CLR4_5_2ywhywhlvha7hp7.R.inc(45234);initializer = new MultiBackgroundInitializer();
    }finally{__CLR4_5_2ywhywhlvha7hp7.R.flushNeeded();}}

    /**
     * Tests whether a child initializer has been executed. Optionally the
     * expected executor service can be checked, too.
     *
     * @param child the child initializer
     * @param expExec the expected executor service (null if the executor should
     * not be checked)
     * @throws ConcurrentException if an error occurs
     */
    private void checkChild(final BackgroundInitializer<?> child,
            final ExecutorService expExec) throws ConcurrentException {try{__CLR4_5_2ywhywhlvha7hp7.R.inc(45235);
        __CLR4_5_2ywhywhlvha7hp7.R.inc(45236);final ChildBackgroundInitializer cinit = (ChildBackgroundInitializer) child;
        __CLR4_5_2ywhywhlvha7hp7.R.inc(45237);final Integer result = cinit.get();
        __CLR4_5_2ywhywhlvha7hp7.R.inc(45238);assertEquals("Wrong result", 1, result.intValue());
        __CLR4_5_2ywhywhlvha7hp7.R.inc(45239);assertEquals("Wrong number of executions", 1, cinit.initializeCalls);
        __CLR4_5_2ywhywhlvha7hp7.R.inc(45240);if ((((expExec != null)&&(__CLR4_5_2ywhywhlvha7hp7.R.iget(45241)!=0|true))||(__CLR4_5_2ywhywhlvha7hp7.R.iget(45242)==0&false))) {{
            __CLR4_5_2ywhywhlvha7hp7.R.inc(45243);assertEquals("Wrong executor service", expExec,
                    cinit.currentExecutor);
        }
    }}finally{__CLR4_5_2ywhywhlvha7hp7.R.flushNeeded();}}

    /**
     * Tests addInitializer() if a null name is passed in. This should cause an
     * exception.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testAddInitializerNullName() {__CLR4_5_2ywhywhlvha7hp7.R.globalSliceStart(getClass().getName(),45244);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28eblqsyws();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,65,100,100,73,110,105,116,105,97,108,105,122,101,114,78,117,108,108,78,97,109,101,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ywhywhlvha7hp7.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ywhywhlvha7hp7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.MultiBackgroundInitializerTest.testAddInitializerNullName",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),45244,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28eblqsyws(){try{__CLR4_5_2ywhywhlvha7hp7.R.inc(45244);
        __CLR4_5_2ywhywhlvha7hp7.R.inc(45245);initializer.addInitializer(null, new ChildBackgroundInitializer());
    }finally{__CLR4_5_2ywhywhlvha7hp7.R.flushNeeded();}}

    /**
     * Tests addInitializer() if a null initializer is passed in. This should
     * cause an exception.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testAddInitializerNullInit() {__CLR4_5_2ywhywhlvha7hp7.R.globalSliceStart(getClass().getName(),45246);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2biy6mpywu();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,65,100,100,73,110,105,116,105,97,108,105,122,101,114,78,117,108,108,73,110,105,116,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ywhywhlvha7hp7.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ywhywhlvha7hp7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.MultiBackgroundInitializerTest.testAddInitializerNullInit",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),45246,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2biy6mpywu(){try{__CLR4_5_2ywhywhlvha7hp7.R.inc(45246);
        __CLR4_5_2ywhywhlvha7hp7.R.inc(45247);initializer.addInitializer(CHILD_INIT, null);
    }finally{__CLR4_5_2ywhywhlvha7hp7.R.flushNeeded();}}

    /**
     * Tests the background processing if there are no child initializers.
     *
     * @throws org.apache.commons.lang3.concurrent.ConcurrentException so we don't have to catch it
     */
    @Test
    public void testInitializeNoChildren() throws ConcurrentException {__CLR4_5_2ywhywhlvha7hp7.R.globalSliceStart(getClass().getName(),45248);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2xm4l6xyww();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ywhywhlvha7hp7.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ywhywhlvha7hp7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.MultiBackgroundInitializerTest.testInitializeNoChildren",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),45248,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2xm4l6xyww() throws ConcurrentException{try{__CLR4_5_2ywhywhlvha7hp7.R.inc(45248);
        __CLR4_5_2ywhywhlvha7hp7.R.inc(45249);assertTrue("Wrong result of start()", initializer.start());
        __CLR4_5_2ywhywhlvha7hp7.R.inc(45250);final MultiBackgroundInitializer.MultiBackgroundInitializerResults res = initializer
                .get();
        __CLR4_5_2ywhywhlvha7hp7.R.inc(45251);assertTrue("Got child initializers", res.initializerNames().isEmpty());
        __CLR4_5_2ywhywhlvha7hp7.R.inc(45252);assertTrue("Executor not shutdown", initializer.getActiveExecutor()
                .isShutdown());
    }finally{__CLR4_5_2ywhywhlvha7hp7.R.flushNeeded();}}

    /**
     * Helper method for testing the initialize() method. This method can
     * operate with both an external and a temporary executor service.
     *
     * @return the result object produced by the initializer
     *
     * @throws org.apache.commons.lang3.concurrent.ConcurrentException so we don't have to catch it
     */
    private MultiBackgroundInitializer.MultiBackgroundInitializerResults checkInitialize()
            throws ConcurrentException {try{__CLR4_5_2ywhywhlvha7hp7.R.inc(45253);
        __CLR4_5_2ywhywhlvha7hp7.R.inc(45254);final int count = 5;
        __CLR4_5_2ywhywhlvha7hp7.R.inc(45255);for (int i = 0; (((i < count)&&(__CLR4_5_2ywhywhlvha7hp7.R.iget(45256)!=0|true))||(__CLR4_5_2ywhywhlvha7hp7.R.iget(45257)==0&false)); i++) {{
            __CLR4_5_2ywhywhlvha7hp7.R.inc(45258);initializer.addInitializer(CHILD_INIT + i,
                    new ChildBackgroundInitializer());
        }
        }__CLR4_5_2ywhywhlvha7hp7.R.inc(45259);initializer.start();
        __CLR4_5_2ywhywhlvha7hp7.R.inc(45260);final MultiBackgroundInitializer.MultiBackgroundInitializerResults res = initializer
                .get();
        __CLR4_5_2ywhywhlvha7hp7.R.inc(45261);assertEquals("Wrong number of child initializers", count, res
                .initializerNames().size());
        __CLR4_5_2ywhywhlvha7hp7.R.inc(45262);for (int i = 0; (((i < count)&&(__CLR4_5_2ywhywhlvha7hp7.R.iget(45263)!=0|true))||(__CLR4_5_2ywhywhlvha7hp7.R.iget(45264)==0&false)); i++) {{
            __CLR4_5_2ywhywhlvha7hp7.R.inc(45265);final String key = CHILD_INIT + i;
            __CLR4_5_2ywhywhlvha7hp7.R.inc(45266);assertTrue("Name not found: " + key, res.initializerNames()
                    .contains(key));
            __CLR4_5_2ywhywhlvha7hp7.R.inc(45267);assertEquals("Wrong result object", Integer.valueOf(1), res
                    .getResultObject(key));
            __CLR4_5_2ywhywhlvha7hp7.R.inc(45268);assertFalse("Exception flag", res.isException(key));
            __CLR4_5_2ywhywhlvha7hp7.R.inc(45269);assertNull("Got an exception", res.getException(key));
            __CLR4_5_2ywhywhlvha7hp7.R.inc(45270);checkChild(res.getInitializer(key), initializer.getActiveExecutor());
        }
        }__CLR4_5_2ywhywhlvha7hp7.R.inc(45271);return res;
    }finally{__CLR4_5_2ywhywhlvha7hp7.R.flushNeeded();}}

    /**
     * Tests background processing if a temporary executor is used.
     *
     * @throws org.apache.commons.lang3.concurrent.ConcurrentException so we don't have to catch it
     */
    @Test
    public void testInitializeTempExec() throws ConcurrentException {__CLR4_5_2ywhywhlvha7hp7.R.globalSliceStart(getClass().getName(),45272);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2kpq9qmyxk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ywhywhlvha7hp7.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ywhywhlvha7hp7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.MultiBackgroundInitializerTest.testInitializeTempExec",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),45272,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2kpq9qmyxk() throws ConcurrentException{try{__CLR4_5_2ywhywhlvha7hp7.R.inc(45272);
        __CLR4_5_2ywhywhlvha7hp7.R.inc(45273);checkInitialize();
        __CLR4_5_2ywhywhlvha7hp7.R.inc(45274);assertTrue("Executor not shutdown", initializer.getActiveExecutor()
                .isShutdown());
    }finally{__CLR4_5_2ywhywhlvha7hp7.R.flushNeeded();}}

    /**
     * Tests background processing if an external executor service is provided.
     *
     * @throws org.apache.commons.lang3.concurrent.ConcurrentException so we don't have to catch it
     */
    @Test
    public void testInitializeExternalExec() throws ConcurrentException, InterruptedException {__CLR4_5_2ywhywhlvha7hp7.R.globalSliceStart(getClass().getName(),45275);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_29xy4x1yxn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ywhywhlvha7hp7.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ywhywhlvha7hp7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.MultiBackgroundInitializerTest.testInitializeExternalExec",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),45275,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_29xy4x1yxn() throws ConcurrentException, InterruptedException{try{__CLR4_5_2ywhywhlvha7hp7.R.inc(45275);
        __CLR4_5_2ywhywhlvha7hp7.R.inc(45276);final ExecutorService exec = Executors.newCachedThreadPool();
        __CLR4_5_2ywhywhlvha7hp7.R.inc(45277);try {
            __CLR4_5_2ywhywhlvha7hp7.R.inc(45278);initializer = new MultiBackgroundInitializer(exec);
            __CLR4_5_2ywhywhlvha7hp7.R.inc(45279);checkInitialize();
            __CLR4_5_2ywhywhlvha7hp7.R.inc(45280);assertEquals("Wrong executor", exec, initializer
                    .getActiveExecutor());
            __CLR4_5_2ywhywhlvha7hp7.R.inc(45281);assertFalse("Executor was shutdown", exec.isShutdown());
        } finally {
            __CLR4_5_2ywhywhlvha7hp7.R.inc(45282);exec.shutdown();
            __CLR4_5_2ywhywhlvha7hp7.R.inc(45283);exec.awaitTermination(1, TimeUnit.SECONDS);
        }
    }finally{__CLR4_5_2ywhywhlvha7hp7.R.flushNeeded();}}

    /**
     * Tests the behavior of initialize() if a child initializer has a specific
     * executor service. Then this service should not be overridden.
     *
     * @throws org.apache.commons.lang3.concurrent.ConcurrentException so we don't have to catch it
     */
    @Test
    public void testInitializeChildWithExecutor() throws ConcurrentException, InterruptedException {__CLR4_5_2ywhywhlvha7hp7.R.globalSliceStart(getClass().getName(),45284);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28pir0ayxw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ywhywhlvha7hp7.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ywhywhlvha7hp7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.MultiBackgroundInitializerTest.testInitializeChildWithExecutor",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),45284,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28pir0ayxw() throws ConcurrentException, InterruptedException{try{__CLR4_5_2ywhywhlvha7hp7.R.inc(45284);
        __CLR4_5_2ywhywhlvha7hp7.R.inc(45285);final String initExec = "childInitializerWithExecutor";
        __CLR4_5_2ywhywhlvha7hp7.R.inc(45286);final ExecutorService exec = Executors.newSingleThreadExecutor();
        __CLR4_5_2ywhywhlvha7hp7.R.inc(45287);try {
            __CLR4_5_2ywhywhlvha7hp7.R.inc(45288);final ChildBackgroundInitializer c1 = new ChildBackgroundInitializer();
            __CLR4_5_2ywhywhlvha7hp7.R.inc(45289);final ChildBackgroundInitializer c2 = new ChildBackgroundInitializer();
            __CLR4_5_2ywhywhlvha7hp7.R.inc(45290);c2.setExternalExecutor(exec);
            __CLR4_5_2ywhywhlvha7hp7.R.inc(45291);initializer.addInitializer(CHILD_INIT, c1);
            __CLR4_5_2ywhywhlvha7hp7.R.inc(45292);initializer.addInitializer(initExec, c2);
            __CLR4_5_2ywhywhlvha7hp7.R.inc(45293);initializer.start();
            __CLR4_5_2ywhywhlvha7hp7.R.inc(45294);initializer.get();
            __CLR4_5_2ywhywhlvha7hp7.R.inc(45295);checkChild(c1, initializer.getActiveExecutor());
            __CLR4_5_2ywhywhlvha7hp7.R.inc(45296);checkChild(c2, exec);
        } finally {
            __CLR4_5_2ywhywhlvha7hp7.R.inc(45297);exec.shutdown();
            __CLR4_5_2ywhywhlvha7hp7.R.inc(45298);exec.awaitTermination(1, TimeUnit.SECONDS);
        }
    }finally{__CLR4_5_2ywhywhlvha7hp7.R.flushNeeded();}}

    /**
     * Tries to add another child initializer after the start() method has been
     * called. This should not be allowed.
     *
     * @throws org.apache.commons.lang3.concurrent.ConcurrentException so we don't have to catch it
     */
    @Test
    public void testAddInitializerAfterStart() throws ConcurrentException {__CLR4_5_2ywhywhlvha7hp7.R.globalSliceStart(getClass().getName(),45299);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2qzkbogyyb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ywhywhlvha7hp7.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ywhywhlvha7hp7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.MultiBackgroundInitializerTest.testAddInitializerAfterStart",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),45299,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2qzkbogyyb() throws ConcurrentException{try{__CLR4_5_2ywhywhlvha7hp7.R.inc(45299);
        __CLR4_5_2ywhywhlvha7hp7.R.inc(45300);initializer.start();
        __CLR4_5_2ywhywhlvha7hp7.R.inc(45301);try {
            __CLR4_5_2ywhywhlvha7hp7.R.inc(45302);initializer.addInitializer(CHILD_INIT,
                    new ChildBackgroundInitializer());
            __CLR4_5_2ywhywhlvha7hp7.R.inc(45303);fail("Could add initializer after start()!");
        } catch (final IllegalStateException istex) {
            __CLR4_5_2ywhywhlvha7hp7.R.inc(45304);initializer.get();
        }
    }finally{__CLR4_5_2ywhywhlvha7hp7.R.flushNeeded();}}

    /**
     * Tries to query an unknown child initializer from the results object. This
     * should cause an exception.
     *
     * @throws org.apache.commons.lang3.concurrent.ConcurrentException so we don't have to catch it
     */
    @Test(expected = NoSuchElementException.class)
    public void testResultGetInitializerUnknown() throws ConcurrentException {__CLR4_5_2ywhywhlvha7hp7.R.globalSliceStart(getClass().getName(),45305);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2e6mugayyh();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,82,101,115,117,108,116,71,101,116,73,110,105,116,105,97,108,105,122,101,114,85,110,107,110,111,119,110,58,32,91,78,111,83,117,99,104,69,108,101,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NoSuchElementException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ywhywhlvha7hp7.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ywhywhlvha7hp7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.MultiBackgroundInitializerTest.testResultGetInitializerUnknown",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),45305,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2e6mugayyh() throws ConcurrentException{try{__CLR4_5_2ywhywhlvha7hp7.R.inc(45305);
        __CLR4_5_2ywhywhlvha7hp7.R.inc(45306);final MultiBackgroundInitializer.MultiBackgroundInitializerResults res = checkInitialize();
        __CLR4_5_2ywhywhlvha7hp7.R.inc(45307);res.getInitializer("unknown");
    }finally{__CLR4_5_2ywhywhlvha7hp7.R.flushNeeded();}}

    /**
     * Tries to query the results of an unknown child initializer from the
     * results object. This should cause an exception.
     *
     * @throws org.apache.commons.lang3.concurrent.ConcurrentException so we don't have to catch it
     */
    @Test(expected = NoSuchElementException.class)
    public void testResultGetResultObjectUnknown() throws ConcurrentException {__CLR4_5_2ywhywhlvha7hp7.R.globalSliceStart(getClass().getName(),45308);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21yvfwuyyk();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,82,101,115,117,108,116,71,101,116,82,101,115,117,108,116,79,98,106,101,99,116,85,110,107,110,111,119,110,58,32,91,78,111,83,117,99,104,69,108,101,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NoSuchElementException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ywhywhlvha7hp7.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ywhywhlvha7hp7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.MultiBackgroundInitializerTest.testResultGetResultObjectUnknown",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),45308,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21yvfwuyyk() throws ConcurrentException{try{__CLR4_5_2ywhywhlvha7hp7.R.inc(45308);
        __CLR4_5_2ywhywhlvha7hp7.R.inc(45309);final MultiBackgroundInitializer.MultiBackgroundInitializerResults res = checkInitialize();
        __CLR4_5_2ywhywhlvha7hp7.R.inc(45310);res.getResultObject("unknown");
    }finally{__CLR4_5_2ywhywhlvha7hp7.R.flushNeeded();}}

    /**
     * Tries to query the exception of an unknown child initializer from the
     * results object. This should cause an exception.
     *
     * @throws org.apache.commons.lang3.concurrent.ConcurrentException so we don't have to catch it
     */
    @Test(expected = NoSuchElementException.class)
    public void testResultGetExceptionUnknown() throws ConcurrentException {__CLR4_5_2ywhywhlvha7hp7.R.globalSliceStart(getClass().getName(),45311);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2b1227dyyn();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,82,101,115,117,108,116,71,101,116,69,120,99,101,112,116,105,111,110,85,110,107,110,111,119,110,58,32,91,78,111,83,117,99,104,69,108,101,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NoSuchElementException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ywhywhlvha7hp7.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ywhywhlvha7hp7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.MultiBackgroundInitializerTest.testResultGetExceptionUnknown",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),45311,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2b1227dyyn() throws ConcurrentException{try{__CLR4_5_2ywhywhlvha7hp7.R.inc(45311);
        __CLR4_5_2ywhywhlvha7hp7.R.inc(45312);final MultiBackgroundInitializer.MultiBackgroundInitializerResults res = checkInitialize();
        __CLR4_5_2ywhywhlvha7hp7.R.inc(45313);res.getException("unknown");
    }finally{__CLR4_5_2ywhywhlvha7hp7.R.flushNeeded();}}

    /**
     * Tries to query the exception flag of an unknown child initializer from
     * the results object. This should cause an exception.
     *
     * @throws org.apache.commons.lang3.concurrent.ConcurrentException so we don't have to catch it
     */
    @Test(expected = NoSuchElementException.class)
    public void testResultIsExceptionUnknown() throws ConcurrentException {__CLR4_5_2ywhywhlvha7hp7.R.globalSliceStart(getClass().getName(),45314);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26kpf0lyyq();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,82,101,115,117,108,116,73,115,69,120,99,101,112,116,105,111,110,85,110,107,110,111,119,110,58,32,91,78,111,83,117,99,104,69,108,101,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NoSuchElementException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ywhywhlvha7hp7.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ywhywhlvha7hp7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.MultiBackgroundInitializerTest.testResultIsExceptionUnknown",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),45314,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26kpf0lyyq() throws ConcurrentException{try{__CLR4_5_2ywhywhlvha7hp7.R.inc(45314);
        __CLR4_5_2ywhywhlvha7hp7.R.inc(45315);final MultiBackgroundInitializer.MultiBackgroundInitializerResults res = checkInitialize();
        __CLR4_5_2ywhywhlvha7hp7.R.inc(45316);res.isException("unknown");
    }finally{__CLR4_5_2ywhywhlvha7hp7.R.flushNeeded();}}

    /**
     * Tests that the set with the names of the initializers cannot be modified.
     *
     * @throws org.apache.commons.lang3.concurrent.ConcurrentException so we don't have to catch it
     */
    @Test(expected = UnsupportedOperationException.class)
    public void testResultInitializerNamesModify() throws ConcurrentException {__CLR4_5_2ywhywhlvha7hp7.R.globalSliceStart(getClass().getName(),45317);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2yf369iyyt();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,82,101,115,117,108,116,73,110,105,116,105,97,108,105,122,101,114,78,97,109,101,115,77,111,100,105,102,121,58,32,91,85,110,115,117,112,112,111,114,116,101,100,79,112,101,114,97,116,105,111,110,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof UnsupportedOperationException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ywhywhlvha7hp7.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ywhywhlvha7hp7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.MultiBackgroundInitializerTest.testResultInitializerNamesModify",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),45317,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2yf369iyyt() throws ConcurrentException{try{__CLR4_5_2ywhywhlvha7hp7.R.inc(45317);
        __CLR4_5_2ywhywhlvha7hp7.R.inc(45318);checkInitialize();
        __CLR4_5_2ywhywhlvha7hp7.R.inc(45319);final MultiBackgroundInitializer.MultiBackgroundInitializerResults res = initializer
                .get();
        __CLR4_5_2ywhywhlvha7hp7.R.inc(45320);final Iterator<String> it = res.initializerNames().iterator();
        __CLR4_5_2ywhywhlvha7hp7.R.inc(45321);it.next();
        __CLR4_5_2ywhywhlvha7hp7.R.inc(45322);it.remove();
    }finally{__CLR4_5_2ywhywhlvha7hp7.R.flushNeeded();}}

    /**
     * Tests the behavior of the initializer if one of the child initializers
     * throws a runtime exception.
     */
    @Test
    public void testInitializeRuntimeEx() {__CLR4_5_2ywhywhlvha7hp7.R.globalSliceStart(getClass().getName(),45323);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2r7emoyyz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ywhywhlvha7hp7.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ywhywhlvha7hp7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.MultiBackgroundInitializerTest.testInitializeRuntimeEx",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),45323,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2r7emoyyz(){try{__CLR4_5_2ywhywhlvha7hp7.R.inc(45323);
        __CLR4_5_2ywhywhlvha7hp7.R.inc(45324);final ChildBackgroundInitializer child = new ChildBackgroundInitializer();
        __CLR4_5_2ywhywhlvha7hp7.R.inc(45325);child.ex = new RuntimeException();
        __CLR4_5_2ywhywhlvha7hp7.R.inc(45326);initializer.addInitializer(CHILD_INIT, child);
        __CLR4_5_2ywhywhlvha7hp7.R.inc(45327);initializer.start();
        __CLR4_5_2ywhywhlvha7hp7.R.inc(45328);try {
            __CLR4_5_2ywhywhlvha7hp7.R.inc(45329);initializer.get();
            __CLR4_5_2ywhywhlvha7hp7.R.inc(45330);fail("Runtime exception not thrown!");
        } catch (final Exception ex) {
            __CLR4_5_2ywhywhlvha7hp7.R.inc(45331);assertEquals("Wrong exception", child.ex, ex);
        }
    }finally{__CLR4_5_2ywhywhlvha7hp7.R.flushNeeded();}}

    /**
     * Tests the behavior of the initializer if one of the child initializers
     * throws a checked exception.
     *
     * @throws org.apache.commons.lang3.concurrent.ConcurrentException so we don't have to catch it
     */
    @Test
    public void testInitializeEx() throws ConcurrentException {__CLR4_5_2ywhywhlvha7hp7.R.globalSliceStart(getClass().getName(),45332);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2t5l6x0yz8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ywhywhlvha7hp7.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ywhywhlvha7hp7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.MultiBackgroundInitializerTest.testInitializeEx",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),45332,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2t5l6x0yz8() throws ConcurrentException{try{__CLR4_5_2ywhywhlvha7hp7.R.inc(45332);
        __CLR4_5_2ywhywhlvha7hp7.R.inc(45333);final ChildBackgroundInitializer child = new ChildBackgroundInitializer();
        __CLR4_5_2ywhywhlvha7hp7.R.inc(45334);child.ex = new Exception();
        __CLR4_5_2ywhywhlvha7hp7.R.inc(45335);initializer.addInitializer(CHILD_INIT, child);
        __CLR4_5_2ywhywhlvha7hp7.R.inc(45336);initializer.start();
        __CLR4_5_2ywhywhlvha7hp7.R.inc(45337);final MultiBackgroundInitializer.MultiBackgroundInitializerResults res = initializer
                .get();
        __CLR4_5_2ywhywhlvha7hp7.R.inc(45338);assertTrue("No exception flag", res.isException(CHILD_INIT));
        __CLR4_5_2ywhywhlvha7hp7.R.inc(45339);assertNull("Got a results object", res.getResultObject(CHILD_INIT));
        __CLR4_5_2ywhywhlvha7hp7.R.inc(45340);final ConcurrentException cex = res.getException(CHILD_INIT);
        __CLR4_5_2ywhywhlvha7hp7.R.inc(45341);assertEquals("Wrong cause", child.ex, cex.getCause());
    }finally{__CLR4_5_2ywhywhlvha7hp7.R.flushNeeded();}}

    /**
     * Tests the isSuccessful() method of the result object if no child
     * initializer has thrown an exception.
     *
     * @throws org.apache.commons.lang3.concurrent.ConcurrentException so we don't have to catch it
     */
    @Test
    public void testInitializeResultsIsSuccessfulTrue()
            throws ConcurrentException {__CLR4_5_2ywhywhlvha7hp7.R.globalSliceStart(getClass().getName(),45342);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2qsr5o3yzi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ywhywhlvha7hp7.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ywhywhlvha7hp7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.MultiBackgroundInitializerTest.testInitializeResultsIsSuccessfulTrue",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),45342,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2qsr5o3yzi() throws ConcurrentException{try{__CLR4_5_2ywhywhlvha7hp7.R.inc(45342);
        __CLR4_5_2ywhywhlvha7hp7.R.inc(45343);final ChildBackgroundInitializer child = new ChildBackgroundInitializer();
        __CLR4_5_2ywhywhlvha7hp7.R.inc(45344);initializer.addInitializer(CHILD_INIT, child);
        __CLR4_5_2ywhywhlvha7hp7.R.inc(45345);initializer.start();
        __CLR4_5_2ywhywhlvha7hp7.R.inc(45346);final MultiBackgroundInitializer.MultiBackgroundInitializerResults res = initializer
                .get();
        __CLR4_5_2ywhywhlvha7hp7.R.inc(45347);assertTrue("Wrong success flag", res.isSuccessful());
    }finally{__CLR4_5_2ywhywhlvha7hp7.R.flushNeeded();}}

    /**
     * Tests the isSuccessful() method of the result object if at least one
     * child initializer has thrown an exception.
     *
     * @throws org.apache.commons.lang3.concurrent.ConcurrentException so we don't have to catch it
     */
    @Test
    public void testInitializeResultsIsSuccessfulFalse()
            throws ConcurrentException {__CLR4_5_2ywhywhlvha7hp7.R.globalSliceStart(getClass().getName(),45348);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vcbfjiyzo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ywhywhlvha7hp7.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ywhywhlvha7hp7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.MultiBackgroundInitializerTest.testInitializeResultsIsSuccessfulFalse",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),45348,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vcbfjiyzo() throws ConcurrentException{try{__CLR4_5_2ywhywhlvha7hp7.R.inc(45348);
        __CLR4_5_2ywhywhlvha7hp7.R.inc(45349);final ChildBackgroundInitializer child = new ChildBackgroundInitializer();
        __CLR4_5_2ywhywhlvha7hp7.R.inc(45350);child.ex = new Exception();
        __CLR4_5_2ywhywhlvha7hp7.R.inc(45351);initializer.addInitializer(CHILD_INIT, child);
        __CLR4_5_2ywhywhlvha7hp7.R.inc(45352);initializer.start();
        __CLR4_5_2ywhywhlvha7hp7.R.inc(45353);final MultiBackgroundInitializer.MultiBackgroundInitializerResults res = initializer
                .get();
        __CLR4_5_2ywhywhlvha7hp7.R.inc(45354);assertFalse("Wrong success flag", res.isSuccessful());
    }finally{__CLR4_5_2ywhywhlvha7hp7.R.flushNeeded();}}

    /**
     * Tests whether MultiBackgroundInitializers can be combined in a nested
     * way.
     *
     * @throws org.apache.commons.lang3.concurrent.ConcurrentException so we don't have to catch it
     */
    @Test
    public void testInitializeNested() throws ConcurrentException {__CLR4_5_2ywhywhlvha7hp7.R.globalSliceStart(getClass().getName(),45355);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2wxd474yzv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ywhywhlvha7hp7.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ywhywhlvha7hp7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.MultiBackgroundInitializerTest.testInitializeNested",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),45355,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2wxd474yzv() throws ConcurrentException{try{__CLR4_5_2ywhywhlvha7hp7.R.inc(45355);
        __CLR4_5_2ywhywhlvha7hp7.R.inc(45356);final String nameMulti = "multiChildInitializer";
        __CLR4_5_2ywhywhlvha7hp7.R.inc(45357);initializer
                .addInitializer(CHILD_INIT, new ChildBackgroundInitializer());
        __CLR4_5_2ywhywhlvha7hp7.R.inc(45358);final MultiBackgroundInitializer mi2 = new MultiBackgroundInitializer();
        __CLR4_5_2ywhywhlvha7hp7.R.inc(45359);final int count = 3;
        __CLR4_5_2ywhywhlvha7hp7.R.inc(45360);for (int i = 0; (((i < count)&&(__CLR4_5_2ywhywhlvha7hp7.R.iget(45361)!=0|true))||(__CLR4_5_2ywhywhlvha7hp7.R.iget(45362)==0&false)); i++) {{
            __CLR4_5_2ywhywhlvha7hp7.R.inc(45363);mi2
                    .addInitializer(CHILD_INIT + i,
                            new ChildBackgroundInitializer());
        }
        }__CLR4_5_2ywhywhlvha7hp7.R.inc(45364);initializer.addInitializer(nameMulti, mi2);
        __CLR4_5_2ywhywhlvha7hp7.R.inc(45365);initializer.start();
        __CLR4_5_2ywhywhlvha7hp7.R.inc(45366);final MultiBackgroundInitializer.MultiBackgroundInitializerResults res = initializer
                .get();
        __CLR4_5_2ywhywhlvha7hp7.R.inc(45367);final ExecutorService exec = initializer.getActiveExecutor();
        __CLR4_5_2ywhywhlvha7hp7.R.inc(45368);checkChild(res.getInitializer(CHILD_INIT), exec);
        __CLR4_5_2ywhywhlvha7hp7.R.inc(45369);final MultiBackgroundInitializer.MultiBackgroundInitializerResults res2 = (MultiBackgroundInitializer.MultiBackgroundInitializerResults) res
                .getResultObject(nameMulti);
        __CLR4_5_2ywhywhlvha7hp7.R.inc(45370);assertEquals("Wrong number of initializers", count, res2
                .initializerNames().size());
        __CLR4_5_2ywhywhlvha7hp7.R.inc(45371);for (int i = 0; (((i < count)&&(__CLR4_5_2ywhywhlvha7hp7.R.iget(45372)!=0|true))||(__CLR4_5_2ywhywhlvha7hp7.R.iget(45373)==0&false)); i++) {{
            __CLR4_5_2ywhywhlvha7hp7.R.inc(45374);checkChild(res2.getInitializer(CHILD_INIT + i), exec);
        }
        }__CLR4_5_2ywhywhlvha7hp7.R.inc(45375);assertTrue("Executor not shutdown", exec.isShutdown());
    }finally{__CLR4_5_2ywhywhlvha7hp7.R.flushNeeded();}}

    /**
     * A concrete implementation of {@code BackgroundInitializer} used for
     * defining background tasks for {@code MultiBackgroundInitializer}.
     */
    private static class ChildBackgroundInitializer extends
            BackgroundInitializer<Integer> {
        /** Stores the current executor service. */
        volatile ExecutorService currentExecutor;

        /** A counter for the invocations of initialize(). */
        volatile int initializeCalls;

        /** An exception to be thrown by initialize(). */
        Exception ex;

        /**
         * Records this invocation. Optionally throws an exception.
         */
        @Override
        protected Integer initialize() throws Exception {try{__CLR4_5_2ywhywhlvha7hp7.R.inc(45376);
            __CLR4_5_2ywhywhlvha7hp7.R.inc(45377);currentExecutor = getActiveExecutor();
            __CLR4_5_2ywhywhlvha7hp7.R.inc(45378);initializeCalls++;

            __CLR4_5_2ywhywhlvha7hp7.R.inc(45379);if ((((ex != null)&&(__CLR4_5_2ywhywhlvha7hp7.R.iget(45380)!=0|true))||(__CLR4_5_2ywhywhlvha7hp7.R.iget(45381)==0&false))) {{
                __CLR4_5_2ywhywhlvha7hp7.R.inc(45382);throw ex;
            }

            }__CLR4_5_2ywhywhlvha7hp7.R.inc(45383);return Integer.valueOf(initializeCalls);
        }finally{__CLR4_5_2ywhywhlvha7hp7.R.flushNeeded();}}
    }
}
