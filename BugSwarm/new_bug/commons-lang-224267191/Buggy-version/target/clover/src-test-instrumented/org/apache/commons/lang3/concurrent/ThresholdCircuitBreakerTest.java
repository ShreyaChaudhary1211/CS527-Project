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
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Test class for {@code ThresholdCircuitBreaker}.
 */
public class ThresholdCircuitBreakerTest {static class __CLR4_5_2z0oz0olvha7hpj{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172763741L,8589935092L,45403,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Threshold used in tests.
     */
    private static final long threshold = 10L;

    private static final long zeroThreshold = 0L;

    /**
     * Tests that the threshold is working as expected when incremented and no exception is thrown.
     */
    @Test
    public void testThreshold() {__CLR4_5_2z0oz0olvha7hpj.R.globalSliceStart(getClass().getName(),45384);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_261n3dsz0o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2z0oz0olvha7hpj.R.rethrow($CLV_t2$);}finally{__CLR4_5_2z0oz0olvha7hpj.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.ThresholdCircuitBreakerTest.testThreshold",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),45384,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_261n3dsz0o(){try{__CLR4_5_2z0oz0olvha7hpj.R.inc(45384);
        __CLR4_5_2z0oz0olvha7hpj.R.inc(45385);final ThresholdCircuitBreaker circuit = new ThresholdCircuitBreaker(threshold);
        __CLR4_5_2z0oz0olvha7hpj.R.inc(45386);circuit.incrementAndCheckState(9L);
        __CLR4_5_2z0oz0olvha7hpj.R.inc(45387);assertFalse("Circuit opened before reaching the threshold", circuit.incrementAndCheckState(1L));
    }finally{__CLR4_5_2z0oz0olvha7hpj.R.flushNeeded();}}

    /**
     * Tests that exceeding the threshold raises an exception.
     */
    @Test
    public void testThresholdCircuitBreakingException() {__CLR4_5_2z0oz0olvha7hpj.R.globalSliceStart(getClass().getName(),45388);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_25wkxs3z0s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2z0oz0olvha7hpj.R.rethrow($CLV_t2$);}finally{__CLR4_5_2z0oz0olvha7hpj.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.ThresholdCircuitBreakerTest.testThresholdCircuitBreakingException",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),45388,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_25wkxs3z0s(){try{__CLR4_5_2z0oz0olvha7hpj.R.inc(45388);
        __CLR4_5_2z0oz0olvha7hpj.R.inc(45389);final ThresholdCircuitBreaker circuit = new ThresholdCircuitBreaker(threshold);
        __CLR4_5_2z0oz0olvha7hpj.R.inc(45390);circuit.incrementAndCheckState(9L);
        __CLR4_5_2z0oz0olvha7hpj.R.inc(45391);assertTrue("The circuit was supposed to be open after increment above the threshold", circuit.incrementAndCheckState(2L));
    }finally{__CLR4_5_2z0oz0olvha7hpj.R.flushNeeded();}}

    /**
     * Test that when threshold is zero, the circuit breaker is always open.
     */
    @Test
    public void testThresholdEqualsZero() {__CLR4_5_2z0oz0olvha7hpj.R.globalSliceStart(getClass().getName(),45392);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2v19yxzz0w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2z0oz0olvha7hpj.R.rethrow($CLV_t2$);}finally{__CLR4_5_2z0oz0olvha7hpj.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.ThresholdCircuitBreakerTest.testThresholdEqualsZero",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),45392,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2v19yxzz0w(){try{__CLR4_5_2z0oz0olvha7hpj.R.inc(45392);
        __CLR4_5_2z0oz0olvha7hpj.R.inc(45393);final ThresholdCircuitBreaker circuit = new ThresholdCircuitBreaker(zeroThreshold);
        __CLR4_5_2z0oz0olvha7hpj.R.inc(45394);assertTrue("When the threshold is zero, the circuit is supposed to be always open", circuit.incrementAndCheckState(0L));
    }finally{__CLR4_5_2z0oz0olvha7hpj.R.flushNeeded();}}

    /**
     * Tests that closing a {@code ThresholdCircuitBreaker} resets the internal counter.
     */
    @Test
    public void testClosingThresholdCircuitBreaker() {__CLR4_5_2z0oz0olvha7hpj.R.globalSliceStart(getClass().getName(),45395);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2oe6tsez0z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2z0oz0olvha7hpj.R.rethrow($CLV_t2$);}finally{__CLR4_5_2z0oz0olvha7hpj.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.ThresholdCircuitBreakerTest.testClosingThresholdCircuitBreaker",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),45395,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2oe6tsez0z(){try{__CLR4_5_2z0oz0olvha7hpj.R.inc(45395);
        __CLR4_5_2z0oz0olvha7hpj.R.inc(45396);final ThresholdCircuitBreaker circuit = new ThresholdCircuitBreaker(threshold);
        __CLR4_5_2z0oz0olvha7hpj.R.inc(45397);circuit.incrementAndCheckState(9L);
        __CLR4_5_2z0oz0olvha7hpj.R.inc(45398);circuit.close();
        // now the internal counter is back at zero, not 9 anymore. So it is safe to increment 9 again
        __CLR4_5_2z0oz0olvha7hpj.R.inc(45399);assertFalse("Internal counter was not reset back to zero", circuit.incrementAndCheckState(9L));
    }finally{__CLR4_5_2z0oz0olvha7hpj.R.flushNeeded();}}

    /**
     * Tests that we can get the threshold value correctly.
     */
    @Test
    public void testGettingThreshold() {__CLR4_5_2z0oz0olvha7hpj.R.globalSliceStart(getClass().getName(),45400);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2np5jmoz14();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2z0oz0olvha7hpj.R.rethrow($CLV_t2$);}finally{__CLR4_5_2z0oz0olvha7hpj.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.ThresholdCircuitBreakerTest.testGettingThreshold",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),45400,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2np5jmoz14(){try{__CLR4_5_2z0oz0olvha7hpj.R.inc(45400);
        __CLR4_5_2z0oz0olvha7hpj.R.inc(45401);final ThresholdCircuitBreaker circuit = new ThresholdCircuitBreaker(threshold);
        __CLR4_5_2z0oz0olvha7hpj.R.inc(45402);assertEquals("Wrong value of threshold", Long.valueOf(threshold), Long.valueOf(circuit.getThreshold()));
    }finally{__CLR4_5_2z0oz0olvha7hpj.R.flushNeeded();}}

}
