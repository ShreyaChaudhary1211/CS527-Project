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

import java.util.LinkedList;
import java.util.Random;

import org.junit.Ignore;
import org.junit.Test;

/**
 * Tests concurrent access for {@link ReflectionToStringBuilder}.
 * <p>
 * The {@link ToStringStyle} class includes a registry to avoid infinite loops for objects with circular references. We
 * want to make sure that we do not get concurrency exceptions accessing this registry.
 * </p>
 * 
 * @see <a href="https://issues.apache.org/jira/browse/LANG-762">[LANG-762] Handle or document ReflectionToStringBuilder
 *      and ToStringBuilder for collections that are not thread safe</a>
 * @since 3.1
 */
public class ReflectionToStringBuilderMutateInspectConcurrencyTest {static class __CLR4_5_2wy5wy5lvha7hhp{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172763741L,8589935092L,42737,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    class TestFixture {
        final private LinkedList<Integer> listField = new LinkedList<>();
        final private Random random = new Random();
        private final int N = 100;

        public TestFixture() {try{__CLR4_5_2wy5wy5lvha7hhp.R.inc(42701);
            __CLR4_5_2wy5wy5lvha7hhp.R.inc(42702);synchronized (this) {
                __CLR4_5_2wy5wy5lvha7hhp.R.inc(42703);for (int i = 0; (((i < N)&&(__CLR4_5_2wy5wy5lvha7hhp.R.iget(42704)!=0|true))||(__CLR4_5_2wy5wy5lvha7hhp.R.iget(42705)==0&false)); i++) {{
                    __CLR4_5_2wy5wy5lvha7hhp.R.inc(42706);listField.add(Integer.valueOf(i));
                }
            }}
        }finally{__CLR4_5_2wy5wy5lvha7hhp.R.flushNeeded();}}

        public synchronized void add() {try{__CLR4_5_2wy5wy5lvha7hhp.R.inc(42707);
            __CLR4_5_2wy5wy5lvha7hhp.R.inc(42708);listField.add(Integer.valueOf(random.nextInt(N)));
        }finally{__CLR4_5_2wy5wy5lvha7hhp.R.flushNeeded();}}

        public synchronized void delete() {try{__CLR4_5_2wy5wy5lvha7hhp.R.inc(42709);
            __CLR4_5_2wy5wy5lvha7hhp.R.inc(42710);listField.remove(Integer.valueOf(random.nextInt(N)));
        }finally{__CLR4_5_2wy5wy5lvha7hhp.R.flushNeeded();}}
    }

    class MutatingClient implements Runnable {
        final private TestFixture testFixture;
        final private Random random = new Random();

        public MutatingClient(final TestFixture testFixture) {try{__CLR4_5_2wy5wy5lvha7hhp.R.inc(42711);
            __CLR4_5_2wy5wy5lvha7hhp.R.inc(42712);this.testFixture = testFixture;
        }finally{__CLR4_5_2wy5wy5lvha7hhp.R.flushNeeded();}}

        @Override
        public void run() {try{__CLR4_5_2wy5wy5lvha7hhp.R.inc(42713);
            __CLR4_5_2wy5wy5lvha7hhp.R.inc(42714);if ((((random.nextBoolean())&&(__CLR4_5_2wy5wy5lvha7hhp.R.iget(42715)!=0|true))||(__CLR4_5_2wy5wy5lvha7hhp.R.iget(42716)==0&false))) {{
                __CLR4_5_2wy5wy5lvha7hhp.R.inc(42717);testFixture.add();
            } }else {{
                __CLR4_5_2wy5wy5lvha7hhp.R.inc(42718);testFixture.delete();
            }
        }}finally{__CLR4_5_2wy5wy5lvha7hhp.R.flushNeeded();}}
    }

    class InspectingClient implements Runnable {
        final private TestFixture testFixture;

        public InspectingClient(final TestFixture testFixture) {try{__CLR4_5_2wy5wy5lvha7hhp.R.inc(42719);
            __CLR4_5_2wy5wy5lvha7hhp.R.inc(42720);this.testFixture = testFixture;
        }finally{__CLR4_5_2wy5wy5lvha7hhp.R.flushNeeded();}}

        @Override
        public void run() {try{__CLR4_5_2wy5wy5lvha7hhp.R.inc(42721);
            __CLR4_5_2wy5wy5lvha7hhp.R.inc(42722);ReflectionToStringBuilder.toString(testFixture);
        }finally{__CLR4_5_2wy5wy5lvha7hhp.R.flushNeeded();}}
    }

    @Test
    @Ignore
    public void testConcurrency() throws Exception {__CLR4_5_2wy5wy5lvha7hhp.R.globalSliceStart(getClass().getName(),42723);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2aoke0wyr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2wy5wy5lvha7hhp.R.rethrow($CLV_t2$);}finally{__CLR4_5_2wy5wy5lvha7hhp.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ReflectionToStringBuilderMutateInspectConcurrencyTest.testConcurrency",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),42723,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2aoke0wyr() throws Exception{try{__CLR4_5_2wy5wy5lvha7hhp.R.inc(42723);
        __CLR4_5_2wy5wy5lvha7hhp.R.inc(42724);final TestFixture testFixture = new TestFixture();
        __CLR4_5_2wy5wy5lvha7hhp.R.inc(42725);final int numMutators = 10;
        __CLR4_5_2wy5wy5lvha7hhp.R.inc(42726);final int numIterations = 10;
        __CLR4_5_2wy5wy5lvha7hhp.R.inc(42727);for (int i = 0; (((i < numIterations)&&(__CLR4_5_2wy5wy5lvha7hhp.R.iget(42728)!=0|true))||(__CLR4_5_2wy5wy5lvha7hhp.R.iget(42729)==0&false)); i++) {{
            __CLR4_5_2wy5wy5lvha7hhp.R.inc(42730);for (int j = 0; (((j < numMutators)&&(__CLR4_5_2wy5wy5lvha7hhp.R.iget(42731)!=0|true))||(__CLR4_5_2wy5wy5lvha7hhp.R.iget(42732)==0&false)); j++) {{
                __CLR4_5_2wy5wy5lvha7hhp.R.inc(42733);final Thread t = new Thread(new MutatingClient(testFixture));
                __CLR4_5_2wy5wy5lvha7hhp.R.inc(42734);t.start();
                __CLR4_5_2wy5wy5lvha7hhp.R.inc(42735);final Thread s = new Thread(new InspectingClient(testFixture));
                __CLR4_5_2wy5wy5lvha7hhp.R.inc(42736);s.start();
            }
        }}
    }}finally{__CLR4_5_2wy5wy5lvha7hhp.R.flushNeeded();}}
}
