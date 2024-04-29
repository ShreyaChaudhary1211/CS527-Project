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

package org.apache.commons.lang3.builder;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

import org.junit.Test;

/**
 * Tests concurrent access for the default {@link ToStringStyle}.
 * <p>
 * The {@link ToStringStyle} class includes a registry to avoid infinite loops for objects with circular references. We
 * want to make sure that we do not get concurrency exceptions accessing this registry.
 * </p>
 * <p>
 * This test passes but only tests one aspect of the issue.
 * </p>
 * 
 * @see <a href="https://issues.apache.org/jira/browse/LANG-762">[LANG-762] Handle or document ReflectionToStringBuilder
 *      and ToStringBuilder for collections that are not thread safe</a>
 * @since 3.1
 */
public class ToStringStyleConcurrencyTest {static class __CLR4_5_2y78y78lvha7hmd{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172763741L,8589935092L,44357,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    static class CollectionHolder<T extends Collection<?>> {
        T collection;

        CollectionHolder(final T collection) {try{__CLR4_5_2y78y78lvha7hmd.R.inc(44324);
            __CLR4_5_2y78y78lvha7hmd.R.inc(44325);this.collection = collection;
        }finally{__CLR4_5_2y78y78lvha7hmd.R.flushNeeded();}}
    }

    private static final List<Integer> LIST;
    private static final int LIST_SIZE = 100000;
    private static final int REPEAT = 100;

    static {try{__CLR4_5_2y78y78lvha7hmd.R.inc(44326);
        __CLR4_5_2y78y78lvha7hmd.R.inc(44327);LIST = new ArrayList<>(LIST_SIZE);
        __CLR4_5_2y78y78lvha7hmd.R.inc(44328);for (int i = 0; (((i < LIST_SIZE)&&(__CLR4_5_2y78y78lvha7hmd.R.iget(44329)!=0|true))||(__CLR4_5_2y78y78lvha7hmd.R.iget(44330)==0&false)); i++) {{
            __CLR4_5_2y78y78lvha7hmd.R.inc(44331);LIST.add(Integer.valueOf(i));
        }
    }}finally{__CLR4_5_2y78y78lvha7hmd.R.flushNeeded();}}

    @Test
    public void testLinkedList() throws InterruptedException, ExecutionException {__CLR4_5_2y78y78lvha7hmd.R.globalSliceStart(getClass().getName(),44332);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22gqoxcy7g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2y78y78lvha7hmd.R.rethrow($CLV_t2$);}finally{__CLR4_5_2y78y78lvha7hmd.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ToStringStyleConcurrencyTest.testLinkedList",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44332,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22gqoxcy7g() throws InterruptedException, ExecutionException{try{__CLR4_5_2y78y78lvha7hmd.R.inc(44332);
        __CLR4_5_2y78y78lvha7hmd.R.inc(44333);this.testConcurrency(new CollectionHolder<List<Integer>>(new LinkedList<Integer>()));
    }finally{__CLR4_5_2y78y78lvha7hmd.R.flushNeeded();}}

    @Test
    public void testArrayList() throws InterruptedException, ExecutionException {__CLR4_5_2y78y78lvha7hmd.R.globalSliceStart(getClass().getName(),44334);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2rtpln0y7i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2y78y78lvha7hmd.R.rethrow($CLV_t2$);}finally{__CLR4_5_2y78y78lvha7hmd.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ToStringStyleConcurrencyTest.testArrayList",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44334,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2rtpln0y7i() throws InterruptedException, ExecutionException{try{__CLR4_5_2y78y78lvha7hmd.R.inc(44334);
        __CLR4_5_2y78y78lvha7hmd.R.inc(44335);this.testConcurrency(new CollectionHolder<List<Integer>>(new ArrayList<Integer>()));
    }finally{__CLR4_5_2y78y78lvha7hmd.R.flushNeeded();}}

    @Test
    public void testCopyOnWriteArrayList() throws InterruptedException, ExecutionException {__CLR4_5_2y78y78lvha7hmd.R.globalSliceStart(getClass().getName(),44336);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2xfxc79y7k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2y78y78lvha7hmd.R.rethrow($CLV_t2$);}finally{__CLR4_5_2y78y78lvha7hmd.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ToStringStyleConcurrencyTest.testCopyOnWriteArrayList",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44336,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2xfxc79y7k() throws InterruptedException, ExecutionException{try{__CLR4_5_2y78y78lvha7hmd.R.inc(44336);
        __CLR4_5_2y78y78lvha7hmd.R.inc(44337);this.testConcurrency(new CollectionHolder<List<Integer>>(new CopyOnWriteArrayList<Integer>()));
    }finally{__CLR4_5_2y78y78lvha7hmd.R.flushNeeded();}}

    private void testConcurrency(final CollectionHolder<List<Integer>> holder) throws InterruptedException,
            ExecutionException {try{__CLR4_5_2y78y78lvha7hmd.R.inc(44338);
        __CLR4_5_2y78y78lvha7hmd.R.inc(44339);final List<Integer> list = holder.collection;
        // make a big array that takes a long time to toString()
        __CLR4_5_2y78y78lvha7hmd.R.inc(44340);list.addAll(LIST);
        // Create a thread pool with two threads to cause the most contention on the underlying resource.
        __CLR4_5_2y78y78lvha7hmd.R.inc(44341);final ExecutorService threadPool = Executors.newFixedThreadPool(2);
        // Consumes toStrings
        __CLR4_5_2y78y78lvha7hmd.R.inc(44342);final Callable<Integer> consumer = new Callable<Integer>() {
            @Override
            public Integer call() {try{__CLR4_5_2y78y78lvha7hmd.R.inc(44343);
                __CLR4_5_2y78y78lvha7hmd.R.inc(44344);for (int i = 0; (((i < REPEAT)&&(__CLR4_5_2y78y78lvha7hmd.R.iget(44345)!=0|true))||(__CLR4_5_2y78y78lvha7hmd.R.iget(44346)==0&false)); i++) {{
                    // Calls ToStringStyle
                    __CLR4_5_2y78y78lvha7hmd.R.inc(44347);new ToStringBuilder(holder).append(holder.collection);
                }
                }__CLR4_5_2y78y78lvha7hmd.R.inc(44348);return Integer.valueOf(REPEAT);
            }finally{__CLR4_5_2y78y78lvha7hmd.R.flushNeeded();}}
        };
        __CLR4_5_2y78y78lvha7hmd.R.inc(44349);final Collection<Callable<Integer>> tasks = new ArrayList<>();
        __CLR4_5_2y78y78lvha7hmd.R.inc(44350);tasks.add(consumer);
        __CLR4_5_2y78y78lvha7hmd.R.inc(44351);tasks.add(consumer);
        __CLR4_5_2y78y78lvha7hmd.R.inc(44352);final List<Future<Integer>> futures = threadPool.invokeAll(tasks);
        __CLR4_5_2y78y78lvha7hmd.R.inc(44353);for (final Future<Integer> future : futures) {{
            __CLR4_5_2y78y78lvha7hmd.R.inc(44354);future.get();
        }
        }__CLR4_5_2y78y78lvha7hmd.R.inc(44355);threadPool.shutdown();
        __CLR4_5_2y78y78lvha7hmd.R.inc(44356);threadPool.awaitTermination(1, TimeUnit.SECONDS);
    }finally{__CLR4_5_2y78y78lvha7hmd.R.flushNeeded();}}
}
