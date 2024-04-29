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
import static org.junit.Assert.assertNotNull;

import java.util.concurrent.CountDownLatch;

import org.junit.Test;

/**
 * <p>
 * An abstract base class for tests of concrete {@code ConcurrentInitializer}
 * implementations.
 * </p>
 * <p>
 * This class provides some basic tests for initializer implementations. Derived
 * class have to create a {@link ConcurrentInitializer} object on which the
 * tests are executed.
 * </p>
 */
public abstract class AbstractConcurrentInitializerTest {static class __CLR4_5_2y9hy9hlvha7hmp{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172763741L,8589935092L,44435,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /**
     * Tests a simple invocation of the get() method.
     *
     * @throws org.apache.commons.lang3.concurrent.ConcurrentException because the object under test may throw it
     */
    @Test
    public void testGet() throws ConcurrentException {__CLR4_5_2y9hy9hlvha7hmp.R.globalSliceStart(getClass().getName(),44405);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2tpje3vy9h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2y9hy9hlvha7hmp.R.rethrow($CLV_t2$);}finally{__CLR4_5_2y9hy9hlvha7hmp.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.AbstractConcurrentInitializerTest.testGet",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44405,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2tpje3vy9h() throws ConcurrentException{try{__CLR4_5_2y9hy9hlvha7hmp.R.inc(44405);
        __CLR4_5_2y9hy9hlvha7hmp.R.inc(44406);assertNotNull("No managed object", createInitializer().get());
    }finally{__CLR4_5_2y9hy9hlvha7hmp.R.flushNeeded();}}

    /**
     * Tests whether sequential get() invocations always return the same
     * instance.
     *
     * @throws org.apache.commons.lang3.concurrent.ConcurrentException because the object under test may throw it
     */
    @Test
    public void testGetMultipleTimes() throws ConcurrentException {__CLR4_5_2y9hy9hlvha7hmp.R.globalSliceStart(getClass().getName(),44407);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2d95srry9j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2y9hy9hlvha7hmp.R.rethrow($CLV_t2$);}finally{__CLR4_5_2y9hy9hlvha7hmp.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.AbstractConcurrentInitializerTest.testGetMultipleTimes",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44407,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2d95srry9j() throws ConcurrentException{try{__CLR4_5_2y9hy9hlvha7hmp.R.inc(44407);
        __CLR4_5_2y9hy9hlvha7hmp.R.inc(44408);final ConcurrentInitializer<Object> initializer = createInitializer();
        __CLR4_5_2y9hy9hlvha7hmp.R.inc(44409);final Object obj = initializer.get();
        __CLR4_5_2y9hy9hlvha7hmp.R.inc(44410);for (int i = 0; (((i < 10)&&(__CLR4_5_2y9hy9hlvha7hmp.R.iget(44411)!=0|true))||(__CLR4_5_2y9hy9hlvha7hmp.R.iget(44412)==0&false)); i++) {{
            __CLR4_5_2y9hy9hlvha7hmp.R.inc(44413);assertEquals("Got different object at " + i, obj, initializer.get());
        }
    }}finally{__CLR4_5_2y9hy9hlvha7hmp.R.flushNeeded();}}

    /**
     * Tests whether get() can be invoked from multiple threads concurrently.
     * Always the same object should be returned.
     *
     * @throws org.apache.commons.lang3.concurrent.ConcurrentException because the object under test may throw it
     * @throws java.lang.InterruptedException because the threading API my throw it
     */
    @Test
    public void testGetConcurrent() throws ConcurrentException,
            InterruptedException {__CLR4_5_2y9hy9hlvha7hmp.R.globalSliceStart(getClass().getName(),44414);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2qz7l5qy9q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2y9hy9hlvha7hmp.R.rethrow($CLV_t2$);}finally{__CLR4_5_2y9hy9hlvha7hmp.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.AbstractConcurrentInitializerTest.testGetConcurrent",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44414,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2qz7l5qy9q() throws ConcurrentException, InterruptedException{try{__CLR4_5_2y9hy9hlvha7hmp.R.inc(44414);
        __CLR4_5_2y9hy9hlvha7hmp.R.inc(44415);final ConcurrentInitializer<Object> initializer = createInitializer();
        __CLR4_5_2y9hy9hlvha7hmp.R.inc(44416);final int threadCount = 20;
        __CLR4_5_2y9hy9hlvha7hmp.R.inc(44417);final CountDownLatch startLatch = new CountDownLatch(1);
        class GetThread extends Thread {
            Object object;

            @Override
            public void run() {try{__CLR4_5_2y9hy9hlvha7hmp.R.inc(44418);
                __CLR4_5_2y9hy9hlvha7hmp.R.inc(44419);try {
                    // wait until all threads are ready for maximum parallelism
                    __CLR4_5_2y9hy9hlvha7hmp.R.inc(44420);startLatch.await();
                    // access the initializer
                    __CLR4_5_2y9hy9hlvha7hmp.R.inc(44421);object = initializer.get();
                } catch (final InterruptedException iex) {
                    // ignore
                } catch (final ConcurrentException cex) {
                    __CLR4_5_2y9hy9hlvha7hmp.R.inc(44422);object = cex;
                }
            }finally{__CLR4_5_2y9hy9hlvha7hmp.R.flushNeeded();}}
        }

        __CLR4_5_2y9hy9hlvha7hmp.R.inc(44423);final GetThread[] threads = new GetThread[threadCount];
        __CLR4_5_2y9hy9hlvha7hmp.R.inc(44424);for (int i = 0; (((i < threadCount)&&(__CLR4_5_2y9hy9hlvha7hmp.R.iget(44425)!=0|true))||(__CLR4_5_2y9hy9hlvha7hmp.R.iget(44426)==0&false)); i++) {{
            __CLR4_5_2y9hy9hlvha7hmp.R.inc(44427);threads[i] = new GetThread();
            __CLR4_5_2y9hy9hlvha7hmp.R.inc(44428);threads[i].start();
        }

        // fire all threads and wait until they are ready
        }__CLR4_5_2y9hy9hlvha7hmp.R.inc(44429);startLatch.countDown();
        __CLR4_5_2y9hy9hlvha7hmp.R.inc(44430);for (final Thread t : threads) {{
            __CLR4_5_2y9hy9hlvha7hmp.R.inc(44431);t.join();
        }

        // check results
        }__CLR4_5_2y9hy9hlvha7hmp.R.inc(44432);final Object managedObject = initializer.get();
        __CLR4_5_2y9hy9hlvha7hmp.R.inc(44433);for (final GetThread t : threads) {{
            __CLR4_5_2y9hy9hlvha7hmp.R.inc(44434);assertEquals("Wrong object", managedObject, t.object);
        }
    }}finally{__CLR4_5_2y9hy9hlvha7hmp.R.flushNeeded();}}

    /**
     * Creates the {@link ConcurrentInitializer} object to be tested. This
     * method is called whenever the test fixture needs to be obtained.
     *
     * @return the initializer object to be tested
     */
    protected abstract ConcurrentInitializer<Object> createInitializer();
}
