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
package org.apache.commons.lang3.mutable;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * JUnit tests.
 * 
 * @see MutableDouble
 */
public class MutableDoubleTest {static class __CLR4_5_211ff11fflvha7i43{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172763741L,8589935092L,48653,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    // ----------------------------------------------------------------
    @Test
    public void testConstructors() {__CLR4_5_211ff11fflvha7i43.R.globalSliceStart(getClass().getName(),48507);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2lwxahe11ff();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_211ff11fflvha7i43.R.rethrow($CLV_t2$);}finally{__CLR4_5_211ff11fflvha7i43.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableDoubleTest.testConstructors",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),48507,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2lwxahe11ff(){try{__CLR4_5_211ff11fflvha7i43.R.inc(48507);
        __CLR4_5_211ff11fflvha7i43.R.inc(48508);assertEquals(0d, new MutableDouble().doubleValue(), 0.0001d);
        
        __CLR4_5_211ff11fflvha7i43.R.inc(48509);assertEquals(1d, new MutableDouble(1d).doubleValue(), 0.0001d);
        
        __CLR4_5_211ff11fflvha7i43.R.inc(48510);assertEquals(2d, new MutableDouble(Double.valueOf(2d)).doubleValue(), 0.0001d);
        __CLR4_5_211ff11fflvha7i43.R.inc(48511);assertEquals(3d, new MutableDouble(new MutableDouble(3d)).doubleValue(), 0.0001d);
        
        __CLR4_5_211ff11fflvha7i43.R.inc(48512);assertEquals(2d, new MutableDouble("2.0").doubleValue(), 0.0001d);

    }finally{__CLR4_5_211ff11fflvha7i43.R.flushNeeded();}}

    @Test(expected=NullPointerException.class)
    public void testConstructorNull() {__CLR4_5_211ff11fflvha7i43.R.globalSliceStart(getClass().getName(),48513);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hqkc8a11fl();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,67,111,110,115,116,114,117,99,116,111,114,78,117,108,108,58,32,91,78,117,108,108,80,111,105,110,116,101,114,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NullPointerException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_211ff11fflvha7i43.R.rethrow($CLV_t2$);}finally{__CLR4_5_211ff11fflvha7i43.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableDoubleTest.testConstructorNull",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),48513,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hqkc8a11fl(){try{__CLR4_5_211ff11fflvha7i43.R.inc(48513);
        __CLR4_5_211ff11fflvha7i43.R.inc(48514);new MutableDouble((Number)null);
    }finally{__CLR4_5_211ff11fflvha7i43.R.flushNeeded();}}

    @Test
    public void testGetSet() {__CLR4_5_211ff11fflvha7i43.R.globalSliceStart(getClass().getName(),48515);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22wnvh711fn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_211ff11fflvha7i43.R.rethrow($CLV_t2$);}finally{__CLR4_5_211ff11fflvha7i43.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableDoubleTest.testGetSet",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),48515,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22wnvh711fn(){try{__CLR4_5_211ff11fflvha7i43.R.inc(48515);
        __CLR4_5_211ff11fflvha7i43.R.inc(48516);final MutableDouble mutNum = new MutableDouble(0d);
        __CLR4_5_211ff11fflvha7i43.R.inc(48517);assertEquals(0d, new MutableDouble().doubleValue(), 0.0001d);
        __CLR4_5_211ff11fflvha7i43.R.inc(48518);assertEquals(Double.valueOf(0), new MutableDouble().getValue());
        
        __CLR4_5_211ff11fflvha7i43.R.inc(48519);mutNum.setValue(1);
        __CLR4_5_211ff11fflvha7i43.R.inc(48520);assertEquals(1d, mutNum.doubleValue(), 0.0001d);
        __CLR4_5_211ff11fflvha7i43.R.inc(48521);assertEquals(Double.valueOf(1d), mutNum.getValue());
        
        __CLR4_5_211ff11fflvha7i43.R.inc(48522);mutNum.setValue(Double.valueOf(2d));
        __CLR4_5_211ff11fflvha7i43.R.inc(48523);assertEquals(2d, mutNum.doubleValue(), 0.0001d);
        __CLR4_5_211ff11fflvha7i43.R.inc(48524);assertEquals(Double.valueOf(2d), mutNum.getValue());
        
        __CLR4_5_211ff11fflvha7i43.R.inc(48525);mutNum.setValue(new MutableDouble(3d));
        __CLR4_5_211ff11fflvha7i43.R.inc(48526);assertEquals(3d, mutNum.doubleValue(), 0.0001d);
        __CLR4_5_211ff11fflvha7i43.R.inc(48527);assertEquals(Double.valueOf(3d), mutNum.getValue());
    }finally{__CLR4_5_211ff11fflvha7i43.R.flushNeeded();}}

    @Test(expected=NullPointerException.class)
    public void testSetNull() {__CLR4_5_211ff11fflvha7i43.R.globalSliceStart(getClass().getName(),48528);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hciyri11g0();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,83,101,116,78,117,108,108,58,32,91,78,117,108,108,80,111,105,110,116,101,114,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NullPointerException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_211ff11fflvha7i43.R.rethrow($CLV_t2$);}finally{__CLR4_5_211ff11fflvha7i43.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableDoubleTest.testSetNull",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),48528,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hciyri11g0(){try{__CLR4_5_211ff11fflvha7i43.R.inc(48528);
        __CLR4_5_211ff11fflvha7i43.R.inc(48529);final MutableDouble mutNum = new MutableDouble(0d);
        __CLR4_5_211ff11fflvha7i43.R.inc(48530);mutNum.setValue(null);
    }finally{__CLR4_5_211ff11fflvha7i43.R.flushNeeded();}}

    @Test
    public void testNanInfinite() {__CLR4_5_211ff11fflvha7i43.R.globalSliceStart(getClass().getName(),48531);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gn0e0s11g3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_211ff11fflvha7i43.R.rethrow($CLV_t2$);}finally{__CLR4_5_211ff11fflvha7i43.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableDoubleTest.testNanInfinite",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),48531,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gn0e0s11g3(){try{__CLR4_5_211ff11fflvha7i43.R.inc(48531);
        __CLR4_5_211ff11fflvha7i43.R.inc(48532);MutableDouble mutNum = new MutableDouble(Double.NaN);
        __CLR4_5_211ff11fflvha7i43.R.inc(48533);assertTrue(mutNum.isNaN());
        
        __CLR4_5_211ff11fflvha7i43.R.inc(48534);mutNum = new MutableDouble(Double.POSITIVE_INFINITY);
        __CLR4_5_211ff11fflvha7i43.R.inc(48535);assertTrue(mutNum.isInfinite());
        
        __CLR4_5_211ff11fflvha7i43.R.inc(48536);mutNum = new MutableDouble(Double.NEGATIVE_INFINITY);
        __CLR4_5_211ff11fflvha7i43.R.inc(48537);assertTrue(mutNum.isInfinite());
    }finally{__CLR4_5_211ff11fflvha7i43.R.flushNeeded();}}

    @Test
    public void testEquals() {__CLR4_5_211ff11fflvha7i43.R.globalSliceStart(getClass().getName(),48538);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2s4e60811ga();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_211ff11fflvha7i43.R.rethrow($CLV_t2$);}finally{__CLR4_5_211ff11fflvha7i43.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableDoubleTest.testEquals",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),48538,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2s4e60811ga(){try{__CLR4_5_211ff11fflvha7i43.R.inc(48538);
        __CLR4_5_211ff11fflvha7i43.R.inc(48539);final MutableDouble mutNumA = new MutableDouble(0d);
        __CLR4_5_211ff11fflvha7i43.R.inc(48540);final MutableDouble mutNumB = new MutableDouble(0d);
        __CLR4_5_211ff11fflvha7i43.R.inc(48541);final MutableDouble mutNumC = new MutableDouble(1d);

        __CLR4_5_211ff11fflvha7i43.R.inc(48542);assertTrue(mutNumA.equals(mutNumA));
        __CLR4_5_211ff11fflvha7i43.R.inc(48543);assertTrue(mutNumA.equals(mutNumB));
        __CLR4_5_211ff11fflvha7i43.R.inc(48544);assertTrue(mutNumB.equals(mutNumA));
        __CLR4_5_211ff11fflvha7i43.R.inc(48545);assertTrue(mutNumB.equals(mutNumB));
        __CLR4_5_211ff11fflvha7i43.R.inc(48546);assertFalse(mutNumA.equals(mutNumC));
        __CLR4_5_211ff11fflvha7i43.R.inc(48547);assertFalse(mutNumB.equals(mutNumC));
        __CLR4_5_211ff11fflvha7i43.R.inc(48548);assertTrue(mutNumC.equals(mutNumC));
        __CLR4_5_211ff11fflvha7i43.R.inc(48549);assertFalse(mutNumA.equals(null));
        __CLR4_5_211ff11fflvha7i43.R.inc(48550);assertFalse(mutNumA.equals(Double.valueOf(0d)));
        __CLR4_5_211ff11fflvha7i43.R.inc(48551);assertFalse(mutNumA.equals("0"));
    }finally{__CLR4_5_211ff11fflvha7i43.R.flushNeeded();}}

    @Test
    public void testHashCode() {__CLR4_5_211ff11fflvha7i43.R.globalSliceStart(getClass().getName(),48552);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23zkhv811go();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_211ff11fflvha7i43.R.rethrow($CLV_t2$);}finally{__CLR4_5_211ff11fflvha7i43.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableDoubleTest.testHashCode",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),48552,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23zkhv811go(){try{__CLR4_5_211ff11fflvha7i43.R.inc(48552);
        __CLR4_5_211ff11fflvha7i43.R.inc(48553);final MutableDouble mutNumA = new MutableDouble(0d);
        __CLR4_5_211ff11fflvha7i43.R.inc(48554);final MutableDouble mutNumB = new MutableDouble(0d);
        __CLR4_5_211ff11fflvha7i43.R.inc(48555);final MutableDouble mutNumC = new MutableDouble(1d);

        __CLR4_5_211ff11fflvha7i43.R.inc(48556);assertTrue(mutNumA.hashCode() == mutNumA.hashCode());
        __CLR4_5_211ff11fflvha7i43.R.inc(48557);assertTrue(mutNumA.hashCode() == mutNumB.hashCode());
        __CLR4_5_211ff11fflvha7i43.R.inc(48558);assertFalse(mutNumA.hashCode() == mutNumC.hashCode());
        __CLR4_5_211ff11fflvha7i43.R.inc(48559);assertTrue(mutNumA.hashCode() == Double.valueOf(0d).hashCode());
    }finally{__CLR4_5_211ff11fflvha7i43.R.flushNeeded();}}

    @Test
    public void testCompareTo() {__CLR4_5_211ff11fflvha7i43.R.globalSliceStart(getClass().getName(),48560);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2pz6vfv11gw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_211ff11fflvha7i43.R.rethrow($CLV_t2$);}finally{__CLR4_5_211ff11fflvha7i43.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableDoubleTest.testCompareTo",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),48560,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2pz6vfv11gw(){try{__CLR4_5_211ff11fflvha7i43.R.inc(48560);
        __CLR4_5_211ff11fflvha7i43.R.inc(48561);final MutableDouble mutNum = new MutableDouble(0d);

        __CLR4_5_211ff11fflvha7i43.R.inc(48562);assertEquals(0, mutNum.compareTo(new MutableDouble(0d)));
        __CLR4_5_211ff11fflvha7i43.R.inc(48563);assertEquals(+1, mutNum.compareTo(new MutableDouble(-1d)));
        __CLR4_5_211ff11fflvha7i43.R.inc(48564);assertEquals(-1, mutNum.compareTo(new MutableDouble(1d)));
    }finally{__CLR4_5_211ff11fflvha7i43.R.flushNeeded();}}

    @Test(expected=NullPointerException.class)
    public void testCompareToNull() {__CLR4_5_211ff11fflvha7i43.R.globalSliceStart(getClass().getName(),48565);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2g1nl0c11h1();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,67,111,109,112,97,114,101,84,111,78,117,108,108,58,32,91,78,117,108,108,80,111,105,110,116,101,114,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NullPointerException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_211ff11fflvha7i43.R.rethrow($CLV_t2$);}finally{__CLR4_5_211ff11fflvha7i43.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableDoubleTest.testCompareToNull",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),48565,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2g1nl0c11h1(){try{__CLR4_5_211ff11fflvha7i43.R.inc(48565);
        __CLR4_5_211ff11fflvha7i43.R.inc(48566);final MutableDouble mutNum = new MutableDouble(0d);
        __CLR4_5_211ff11fflvha7i43.R.inc(48567);mutNum.compareTo(null);
    }finally{__CLR4_5_211ff11fflvha7i43.R.flushNeeded();}}

    @Test
    public void testPrimitiveValues() {__CLR4_5_211ff11fflvha7i43.R.globalSliceStart(getClass().getName(),48568);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2uifry11h4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_211ff11fflvha7i43.R.rethrow($CLV_t2$);}finally{__CLR4_5_211ff11fflvha7i43.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableDoubleTest.testPrimitiveValues",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),48568,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2uifry11h4(){try{__CLR4_5_211ff11fflvha7i43.R.inc(48568);
        __CLR4_5_211ff11fflvha7i43.R.inc(48569);final MutableDouble mutNum = new MutableDouble(1.7);
        
        __CLR4_5_211ff11fflvha7i43.R.inc(48570);assertEquals( 1.7F, mutNum.floatValue(), 0 );
        __CLR4_5_211ff11fflvha7i43.R.inc(48571);assertEquals( 1.7, mutNum.doubleValue(), 0 );
        __CLR4_5_211ff11fflvha7i43.R.inc(48572);assertEquals( (byte) 1, mutNum.byteValue() );
        __CLR4_5_211ff11fflvha7i43.R.inc(48573);assertEquals( (short) 1, mutNum.shortValue() );
        __CLR4_5_211ff11fflvha7i43.R.inc(48574);assertEquals( 1, mutNum.intValue() );
        __CLR4_5_211ff11fflvha7i43.R.inc(48575);assertEquals( 1L, mutNum.longValue() );
    }finally{__CLR4_5_211ff11fflvha7i43.R.flushNeeded();}}

    @Test
    public void testToDouble() {__CLR4_5_211ff11fflvha7i43.R.globalSliceStart(getClass().getName(),48576);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2te5t9h11hc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_211ff11fflvha7i43.R.rethrow($CLV_t2$);}finally{__CLR4_5_211ff11fflvha7i43.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableDoubleTest.testToDouble",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),48576,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2te5t9h11hc(){try{__CLR4_5_211ff11fflvha7i43.R.inc(48576);
        __CLR4_5_211ff11fflvha7i43.R.inc(48577);assertEquals(Double.valueOf(0d), new MutableDouble(0d).toDouble());
        __CLR4_5_211ff11fflvha7i43.R.inc(48578);assertEquals(Double.valueOf(12.3d), new MutableDouble(12.3d).toDouble());
    }finally{__CLR4_5_211ff11fflvha7i43.R.flushNeeded();}}

    @Test
    public void testIncrement() {__CLR4_5_211ff11fflvha7i43.R.globalSliceStart(getClass().getName(),48579);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2m6qqn011hf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_211ff11fflvha7i43.R.rethrow($CLV_t2$);}finally{__CLR4_5_211ff11fflvha7i43.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableDoubleTest.testIncrement",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),48579,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2m6qqn011hf(){try{__CLR4_5_211ff11fflvha7i43.R.inc(48579);
        __CLR4_5_211ff11fflvha7i43.R.inc(48580);final MutableDouble mutNum = new MutableDouble(1);
        __CLR4_5_211ff11fflvha7i43.R.inc(48581);mutNum.increment();
        
        __CLR4_5_211ff11fflvha7i43.R.inc(48582);assertEquals(2, mutNum.intValue());
        __CLR4_5_211ff11fflvha7i43.R.inc(48583);assertEquals(2L, mutNum.longValue());
    }finally{__CLR4_5_211ff11fflvha7i43.R.flushNeeded();}}

    @Test
    public void testIncrementAndGet() {__CLR4_5_211ff11fflvha7i43.R.globalSliceStart(getClass().getName(),48584);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2qa1xk311hk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_211ff11fflvha7i43.R.rethrow($CLV_t2$);}finally{__CLR4_5_211ff11fflvha7i43.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableDoubleTest.testIncrementAndGet",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),48584,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2qa1xk311hk(){try{__CLR4_5_211ff11fflvha7i43.R.inc(48584);
        __CLR4_5_211ff11fflvha7i43.R.inc(48585);final MutableDouble mutNum = new MutableDouble(1d);
        __CLR4_5_211ff11fflvha7i43.R.inc(48586);final double result = mutNum.incrementAndGet();

        __CLR4_5_211ff11fflvha7i43.R.inc(48587);assertEquals(2d, result, 0.01d);
        __CLR4_5_211ff11fflvha7i43.R.inc(48588);assertEquals(2, mutNum.intValue());
        __CLR4_5_211ff11fflvha7i43.R.inc(48589);assertEquals(2L, mutNum.longValue());
    }finally{__CLR4_5_211ff11fflvha7i43.R.flushNeeded();}}

    @Test
    public void testGetAndIncrement() {__CLR4_5_211ff11fflvha7i43.R.globalSliceStart(getClass().getName(),48590);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2f0tjtv11hq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_211ff11fflvha7i43.R.rethrow($CLV_t2$);}finally{__CLR4_5_211ff11fflvha7i43.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableDoubleTest.testGetAndIncrement",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),48590,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2f0tjtv11hq(){try{__CLR4_5_211ff11fflvha7i43.R.inc(48590);
        __CLR4_5_211ff11fflvha7i43.R.inc(48591);final MutableDouble mutNum = new MutableDouble(1d);
        __CLR4_5_211ff11fflvha7i43.R.inc(48592);final double result = mutNum.getAndIncrement();

        __CLR4_5_211ff11fflvha7i43.R.inc(48593);assertEquals(1d, result, 0.01d);
        __CLR4_5_211ff11fflvha7i43.R.inc(48594);assertEquals(2, mutNum.intValue());
        __CLR4_5_211ff11fflvha7i43.R.inc(48595);assertEquals(2L, mutNum.longValue());
    }finally{__CLR4_5_211ff11fflvha7i43.R.flushNeeded();}}

    @Test
    public void testDecrement() {__CLR4_5_211ff11fflvha7i43.R.globalSliceStart(getClass().getName(),48596);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2pripmw11hw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_211ff11fflvha7i43.R.rethrow($CLV_t2$);}finally{__CLR4_5_211ff11fflvha7i43.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableDoubleTest.testDecrement",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),48596,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2pripmw11hw(){try{__CLR4_5_211ff11fflvha7i43.R.inc(48596);
        __CLR4_5_211ff11fflvha7i43.R.inc(48597);final MutableDouble mutNum = new MutableDouble(1);
        __CLR4_5_211ff11fflvha7i43.R.inc(48598);mutNum.decrement();
        
        __CLR4_5_211ff11fflvha7i43.R.inc(48599);assertEquals(0, mutNum.intValue());
        __CLR4_5_211ff11fflvha7i43.R.inc(48600);assertEquals(0L, mutNum.longValue());
    }finally{__CLR4_5_211ff11fflvha7i43.R.flushNeeded();}}

    @Test
    public void testDecrementAndGet() {__CLR4_5_211ff11fflvha7i43.R.globalSliceStart(getClass().getName(),48601);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_272ukah11i1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_211ff11fflvha7i43.R.rethrow($CLV_t2$);}finally{__CLR4_5_211ff11fflvha7i43.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableDoubleTest.testDecrementAndGet",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),48601,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_272ukah11i1(){try{__CLR4_5_211ff11fflvha7i43.R.inc(48601);
        __CLR4_5_211ff11fflvha7i43.R.inc(48602);final MutableDouble mutNum = new MutableDouble(1d);
        __CLR4_5_211ff11fflvha7i43.R.inc(48603);final double result = mutNum.decrementAndGet();

        __CLR4_5_211ff11fflvha7i43.R.inc(48604);assertEquals(0d, result, 0.01d);
        __CLR4_5_211ff11fflvha7i43.R.inc(48605);assertEquals(0, mutNum.intValue());
        __CLR4_5_211ff11fflvha7i43.R.inc(48606);assertEquals(0L, mutNum.longValue());
    }finally{__CLR4_5_211ff11fflvha7i43.R.flushNeeded();}}

    @Test
    public void testGetAndDecrement() {__CLR4_5_211ff11fflvha7i43.R.globalSliceStart(getClass().getName(),48607);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28211vd11i7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_211ff11fflvha7i43.R.rethrow($CLV_t2$);}finally{__CLR4_5_211ff11fflvha7i43.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableDoubleTest.testGetAndDecrement",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),48607,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28211vd11i7(){try{__CLR4_5_211ff11fflvha7i43.R.inc(48607);
        __CLR4_5_211ff11fflvha7i43.R.inc(48608);final MutableDouble mutNum = new MutableDouble(1d);
        __CLR4_5_211ff11fflvha7i43.R.inc(48609);final double result = mutNum.getAndDecrement();

        __CLR4_5_211ff11fflvha7i43.R.inc(48610);assertEquals(1d, result, 0.01d);
        __CLR4_5_211ff11fflvha7i43.R.inc(48611);assertEquals(0, mutNum.intValue());
        __CLR4_5_211ff11fflvha7i43.R.inc(48612);assertEquals(0L, mutNum.longValue());
    }finally{__CLR4_5_211ff11fflvha7i43.R.flushNeeded();}}

    @Test
    public void testAddValuePrimitive() {__CLR4_5_211ff11fflvha7i43.R.globalSliceStart(getClass().getName(),48613);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2nrme6s11id();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_211ff11fflvha7i43.R.rethrow($CLV_t2$);}finally{__CLR4_5_211ff11fflvha7i43.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableDoubleTest.testAddValuePrimitive",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),48613,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2nrme6s11id(){try{__CLR4_5_211ff11fflvha7i43.R.inc(48613);
        __CLR4_5_211ff11fflvha7i43.R.inc(48614);final MutableDouble mutNum = new MutableDouble(1);
        __CLR4_5_211ff11fflvha7i43.R.inc(48615);mutNum.add(1.1d);
        
        __CLR4_5_211ff11fflvha7i43.R.inc(48616);assertEquals(2.1d, mutNum.doubleValue(), 0.01d);
    }finally{__CLR4_5_211ff11fflvha7i43.R.flushNeeded();}}

    @Test
    public void testAddValueObject() {__CLR4_5_211ff11fflvha7i43.R.globalSliceStart(getClass().getName(),48617);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2cu6v3s11ih();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_211ff11fflvha7i43.R.rethrow($CLV_t2$);}finally{__CLR4_5_211ff11fflvha7i43.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableDoubleTest.testAddValueObject",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),48617,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2cu6v3s11ih(){try{__CLR4_5_211ff11fflvha7i43.R.inc(48617);
        __CLR4_5_211ff11fflvha7i43.R.inc(48618);final MutableDouble mutNum = new MutableDouble(1);
        __CLR4_5_211ff11fflvha7i43.R.inc(48619);mutNum.add(Double.valueOf(1.1d));
        
        __CLR4_5_211ff11fflvha7i43.R.inc(48620);assertEquals(2.1d, mutNum.doubleValue(), 0.01d);
    }finally{__CLR4_5_211ff11fflvha7i43.R.flushNeeded();}}

    @Test
    public void testGetAndAddValuePrimitive() {__CLR4_5_211ff11fflvha7i43.R.globalSliceStart(getClass().getName(),48621);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n5m0b11il();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_211ff11fflvha7i43.R.rethrow($CLV_t2$);}finally{__CLR4_5_211ff11fflvha7i43.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableDoubleTest.testGetAndAddValuePrimitive",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),48621,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n5m0b11il(){try{__CLR4_5_211ff11fflvha7i43.R.inc(48621);
        __CLR4_5_211ff11fflvha7i43.R.inc(48622);final MutableDouble mutableDouble = new MutableDouble(0.5d);
        __CLR4_5_211ff11fflvha7i43.R.inc(48623);final double result = mutableDouble.getAndAdd(1d);

        __CLR4_5_211ff11fflvha7i43.R.inc(48624);assertEquals(0.5d, result, 0.01d);
        __CLR4_5_211ff11fflvha7i43.R.inc(48625);assertEquals(1.5d, mutableDouble.doubleValue(), 0.01d);
    }finally{__CLR4_5_211ff11fflvha7i43.R.flushNeeded();}}

    @Test
    public void testGetAndAddValueObject() {__CLR4_5_211ff11fflvha7i43.R.globalSliceStart(getClass().getName(),48626);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2yzlrhl11iq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_211ff11fflvha7i43.R.rethrow($CLV_t2$);}finally{__CLR4_5_211ff11fflvha7i43.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableDoubleTest.testGetAndAddValueObject",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),48626,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2yzlrhl11iq(){try{__CLR4_5_211ff11fflvha7i43.R.inc(48626);
        __CLR4_5_211ff11fflvha7i43.R.inc(48627);final MutableDouble mutableDouble = new MutableDouble(0.5d);
        __CLR4_5_211ff11fflvha7i43.R.inc(48628);final double result = mutableDouble.getAndAdd(Double.valueOf(2d));

        __CLR4_5_211ff11fflvha7i43.R.inc(48629);assertEquals(0.5d, result, 0.01d);
        __CLR4_5_211ff11fflvha7i43.R.inc(48630);assertEquals(2.5d, mutableDouble.doubleValue(), 0.01d);
    }finally{__CLR4_5_211ff11fflvha7i43.R.flushNeeded();}}

    @Test
    public void testAddAndGetValuePrimitive() {__CLR4_5_211ff11fflvha7i43.R.globalSliceStart(getClass().getName(),48631);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_211nwiz11iv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_211ff11fflvha7i43.R.rethrow($CLV_t2$);}finally{__CLR4_5_211ff11fflvha7i43.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableDoubleTest.testAddAndGetValuePrimitive",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),48631,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_211nwiz11iv(){try{__CLR4_5_211ff11fflvha7i43.R.inc(48631);
        __CLR4_5_211ff11fflvha7i43.R.inc(48632);final MutableDouble mutableDouble = new MutableDouble(10.5d);
        __CLR4_5_211ff11fflvha7i43.R.inc(48633);final double result = mutableDouble.addAndGet(-0.5d);

        __CLR4_5_211ff11fflvha7i43.R.inc(48634);assertEquals(10d, result, 0.01d);
        __CLR4_5_211ff11fflvha7i43.R.inc(48635);assertEquals(10d, mutableDouble.doubleValue(), 0.01d);
    }finally{__CLR4_5_211ff11fflvha7i43.R.flushNeeded();}}

    @Test
    public void testAddAndGetValueObject() {__CLR4_5_211ff11fflvha7i43.R.globalSliceStart(getClass().getName(),48636);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24to31311j0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_211ff11fflvha7i43.R.rethrow($CLV_t2$);}finally{__CLR4_5_211ff11fflvha7i43.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableDoubleTest.testAddAndGetValueObject",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),48636,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24to31311j0(){try{__CLR4_5_211ff11fflvha7i43.R.inc(48636);
        __CLR4_5_211ff11fflvha7i43.R.inc(48637);final MutableDouble mutableDouble = new MutableDouble(7.5d);
        __CLR4_5_211ff11fflvha7i43.R.inc(48638);final double result = mutableDouble.addAndGet(Double.valueOf(-2.5d));

        __CLR4_5_211ff11fflvha7i43.R.inc(48639);assertEquals(5d, result, 0.01d);
        __CLR4_5_211ff11fflvha7i43.R.inc(48640);assertEquals(5d, mutableDouble.doubleValue(), 0.01d);
    }finally{__CLR4_5_211ff11fflvha7i43.R.flushNeeded();}}

    @Test
    public void testSubtractValuePrimitive() {__CLR4_5_211ff11fflvha7i43.R.globalSliceStart(getClass().getName(),48641);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2w07icj11j5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_211ff11fflvha7i43.R.rethrow($CLV_t2$);}finally{__CLR4_5_211ff11fflvha7i43.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableDoubleTest.testSubtractValuePrimitive",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),48641,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2w07icj11j5(){try{__CLR4_5_211ff11fflvha7i43.R.inc(48641);
        __CLR4_5_211ff11fflvha7i43.R.inc(48642);final MutableDouble mutNum = new MutableDouble(1);
        __CLR4_5_211ff11fflvha7i43.R.inc(48643);mutNum.subtract(0.9d);
        
        __CLR4_5_211ff11fflvha7i43.R.inc(48644);assertEquals(0.1d, mutNum.doubleValue(), 0.01d);
    }finally{__CLR4_5_211ff11fflvha7i43.R.flushNeeded();}}

    @Test
    public void testSubtractValueObject() {__CLR4_5_211ff11fflvha7i43.R.globalSliceStart(getClass().getName(),48645);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2xnns6p11j9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_211ff11fflvha7i43.R.rethrow($CLV_t2$);}finally{__CLR4_5_211ff11fflvha7i43.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableDoubleTest.testSubtractValueObject",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),48645,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2xnns6p11j9(){try{__CLR4_5_211ff11fflvha7i43.R.inc(48645);
        __CLR4_5_211ff11fflvha7i43.R.inc(48646);final MutableDouble mutNum = new MutableDouble(1);
        __CLR4_5_211ff11fflvha7i43.R.inc(48647);mutNum.subtract(Double.valueOf(0.9d));
        
        __CLR4_5_211ff11fflvha7i43.R.inc(48648);assertEquals(0.1d, mutNum.doubleValue(), 0.01d);
    }finally{__CLR4_5_211ff11fflvha7i43.R.flushNeeded();}}

    @Test
    public void testToString() {__CLR4_5_211ff11fflvha7i43.R.globalSliceStart(getClass().getName(),48649);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hrxdid11jd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_211ff11fflvha7i43.R.rethrow($CLV_t2$);}finally{__CLR4_5_211ff11fflvha7i43.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableDoubleTest.testToString",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),48649,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hrxdid11jd(){try{__CLR4_5_211ff11fflvha7i43.R.inc(48649);
        __CLR4_5_211ff11fflvha7i43.R.inc(48650);assertEquals("0.0", new MutableDouble(0d).toString());
        __CLR4_5_211ff11fflvha7i43.R.inc(48651);assertEquals("10.0", new MutableDouble(10d).toString());
        __CLR4_5_211ff11fflvha7i43.R.inc(48652);assertEquals("-123.0", new MutableDouble(-123d).toString());
    }finally{__CLR4_5_211ff11fflvha7i43.R.flushNeeded();}}

}
