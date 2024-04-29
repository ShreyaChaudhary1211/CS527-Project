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
package org.apache.commons.lang3.math;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

/**
 * Unit tests {@link org.apache.commons.lang3.math.IEEE754rUtils}.
 */
public class IEEE754rUtilsTest  {static class __CLR4_5_210jh10jhlvha7hvr{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172763741L,8589935092L,47403,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testLang381() {__CLR4_5_210jh10jhlvha7hvr.R.globalSliceStart(getClass().getName(),47357);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ok868j10jh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_210jh10jhlvha7hvr.R.rethrow($CLV_t2$);}finally{__CLR4_5_210jh10jhlvha7hvr.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.IEEE754rUtilsTest.testLang381",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),47357,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ok868j10jh(){try{__CLR4_5_210jh10jhlvha7hvr.R.inc(47357);
        __CLR4_5_210jh10jhlvha7hvr.R.inc(47358);assertEquals(1.2, IEEE754rUtils.min(1.2, 2.5, Double.NaN), 0.01);
        __CLR4_5_210jh10jhlvha7hvr.R.inc(47359);assertEquals(2.5, IEEE754rUtils.max(1.2, 2.5, Double.NaN), 0.01);
        __CLR4_5_210jh10jhlvha7hvr.R.inc(47360);assertTrue(Double.isNaN(IEEE754rUtils.max(Double.NaN, Double.NaN, Double.NaN)));
        __CLR4_5_210jh10jhlvha7hvr.R.inc(47361);assertEquals(1.2f, IEEE754rUtils.min(1.2f, 2.5f, Float.NaN), 0.01);
        __CLR4_5_210jh10jhlvha7hvr.R.inc(47362);assertEquals(2.5f, IEEE754rUtils.max(1.2f, 2.5f, Float.NaN), 0.01);
        __CLR4_5_210jh10jhlvha7hvr.R.inc(47363);assertTrue(Float.isNaN(IEEE754rUtils.max(Float.NaN, Float.NaN, Float.NaN)));

        __CLR4_5_210jh10jhlvha7hvr.R.inc(47364);final double[] a = new double[] { 1.2, Double.NaN, 3.7, 27.0, 42.0, Double.NaN };
        __CLR4_5_210jh10jhlvha7hvr.R.inc(47365);assertEquals(42.0, IEEE754rUtils.max(a), 0.01);
        __CLR4_5_210jh10jhlvha7hvr.R.inc(47366);assertEquals(1.2, IEEE754rUtils.min(a), 0.01);

        __CLR4_5_210jh10jhlvha7hvr.R.inc(47367);final double[] b = new double[] { Double.NaN, 1.2, Double.NaN, 3.7, 27.0, 42.0, Double.NaN };
        __CLR4_5_210jh10jhlvha7hvr.R.inc(47368);assertEquals(42.0, IEEE754rUtils.max(b), 0.01);
        __CLR4_5_210jh10jhlvha7hvr.R.inc(47369);assertEquals(1.2, IEEE754rUtils.min(b), 0.01);

        __CLR4_5_210jh10jhlvha7hvr.R.inc(47370);final float[] aF = new float[] { 1.2f, Float.NaN, 3.7f, 27.0f, 42.0f, Float.NaN };
        __CLR4_5_210jh10jhlvha7hvr.R.inc(47371);assertEquals(1.2f, IEEE754rUtils.min(aF), 0.01);
        __CLR4_5_210jh10jhlvha7hvr.R.inc(47372);assertEquals(42.0f, IEEE754rUtils.max(aF), 0.01);

        __CLR4_5_210jh10jhlvha7hvr.R.inc(47373);final float[] bF = new float[] { Float.NaN, 1.2f, Float.NaN, 3.7f, 27.0f, 42.0f, Float.NaN };
        __CLR4_5_210jh10jhlvha7hvr.R.inc(47374);assertEquals(1.2f, IEEE754rUtils.min(bF), 0.01);
        __CLR4_5_210jh10jhlvha7hvr.R.inc(47375);assertEquals(42.0f, IEEE754rUtils.max(bF), 0.01);
    }finally{__CLR4_5_210jh10jhlvha7hvr.R.flushNeeded();}}

    @Test
    public void testEnforceExceptions() {__CLR4_5_210jh10jhlvha7hvr.R.globalSliceStart(getClass().getName(),47376);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26o6w9n10k0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_210jh10jhlvha7hvr.R.rethrow($CLV_t2$);}finally{__CLR4_5_210jh10jhlvha7hvr.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.IEEE754rUtilsTest.testEnforceExceptions",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),47376,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26o6w9n10k0(){try{__CLR4_5_210jh10jhlvha7hvr.R.inc(47376);
        __CLR4_5_210jh10jhlvha7hvr.R.inc(47377);try {
            __CLR4_5_210jh10jhlvha7hvr.R.inc(47378);IEEE754rUtils.min( (float[]) null);
            __CLR4_5_210jh10jhlvha7hvr.R.inc(47379);fail("IllegalArgumentException expected for null input");
        } catch(final IllegalArgumentException iae) { /* expected */ }

        __CLR4_5_210jh10jhlvha7hvr.R.inc(47380);try {
            __CLR4_5_210jh10jhlvha7hvr.R.inc(47381);IEEE754rUtils.min(new float[0]);
            __CLR4_5_210jh10jhlvha7hvr.R.inc(47382);fail("IllegalArgumentException expected for empty input");
        } catch(final IllegalArgumentException iae) { /* expected */ }

        __CLR4_5_210jh10jhlvha7hvr.R.inc(47383);try {
            __CLR4_5_210jh10jhlvha7hvr.R.inc(47384);IEEE754rUtils.max( (float[]) null);
            __CLR4_5_210jh10jhlvha7hvr.R.inc(47385);fail("IllegalArgumentException expected for null input");
        } catch(final IllegalArgumentException iae) { /* expected */ }

        __CLR4_5_210jh10jhlvha7hvr.R.inc(47386);try {
            __CLR4_5_210jh10jhlvha7hvr.R.inc(47387);IEEE754rUtils.max(new float[0]);
            __CLR4_5_210jh10jhlvha7hvr.R.inc(47388);fail("IllegalArgumentException expected for empty input");
        } catch(final IllegalArgumentException iae) { /* expected */ }

        __CLR4_5_210jh10jhlvha7hvr.R.inc(47389);try {
            __CLR4_5_210jh10jhlvha7hvr.R.inc(47390);IEEE754rUtils.min( (double[]) null);
            __CLR4_5_210jh10jhlvha7hvr.R.inc(47391);fail("IllegalArgumentException expected for null input");
        } catch(final IllegalArgumentException iae) { /* expected */ }

        __CLR4_5_210jh10jhlvha7hvr.R.inc(47392);try {
            __CLR4_5_210jh10jhlvha7hvr.R.inc(47393);IEEE754rUtils.min(new double[0]);
            __CLR4_5_210jh10jhlvha7hvr.R.inc(47394);fail("IllegalArgumentException expected for empty input");
        } catch(final IllegalArgumentException iae) { /* expected */ }

        __CLR4_5_210jh10jhlvha7hvr.R.inc(47395);try {
            __CLR4_5_210jh10jhlvha7hvr.R.inc(47396);IEEE754rUtils.max( (double[]) null);
            __CLR4_5_210jh10jhlvha7hvr.R.inc(47397);fail("IllegalArgumentException expected for null input");
        } catch(final IllegalArgumentException iae) { /* expected */ }

        __CLR4_5_210jh10jhlvha7hvr.R.inc(47398);try {
            __CLR4_5_210jh10jhlvha7hvr.R.inc(47399);IEEE754rUtils.max(new double[0]);
            __CLR4_5_210jh10jhlvha7hvr.R.inc(47400);fail("IllegalArgumentException expected for empty input");
        } catch(final IllegalArgumentException iae) { /* expected */ }

    }finally{__CLR4_5_210jh10jhlvha7hvr.R.flushNeeded();}}

    @Test
    public void testConstructorExists() {__CLR4_5_210jh10jhlvha7hvr.R.globalSliceStart(getClass().getName(),47401);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21fvlx110kp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_210jh10jhlvha7hvr.R.rethrow($CLV_t2$);}finally{__CLR4_5_210jh10jhlvha7hvr.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.IEEE754rUtilsTest.testConstructorExists",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),47401,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21fvlx110kp(){try{__CLR4_5_210jh10jhlvha7hvr.R.inc(47401);
        __CLR4_5_210jh10jhlvha7hvr.R.inc(47402);new IEEE754rUtils();
    }finally{__CLR4_5_210jh10jhlvha7hvr.R.flushNeeded();}}
    
}
