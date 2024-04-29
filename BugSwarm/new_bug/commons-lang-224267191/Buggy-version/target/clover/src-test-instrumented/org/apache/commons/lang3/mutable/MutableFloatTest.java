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
 * @see MutableFloat
 */
public class MutableFloatTest {static class __CLR4_5_211jh11jhlvha7i4f{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172763741L,8589935092L,48799,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    // ----------------------------------------------------------------
    @Test
    public void testConstructors() {__CLR4_5_211jh11jhlvha7i4f.R.globalSliceStart(getClass().getName(),48653);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2lwxahe11jh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_211jh11jhlvha7i4f.R.rethrow($CLV_t2$);}finally{__CLR4_5_211jh11jhlvha7i4f.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableFloatTest.testConstructors",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),48653,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2lwxahe11jh(){try{__CLR4_5_211jh11jhlvha7i4f.R.inc(48653);
        __CLR4_5_211jh11jhlvha7i4f.R.inc(48654);assertEquals(0f, new MutableFloat().floatValue(), 0.0001f);
        
        __CLR4_5_211jh11jhlvha7i4f.R.inc(48655);assertEquals(1f, new MutableFloat(1f).floatValue(), 0.0001f);
        
        __CLR4_5_211jh11jhlvha7i4f.R.inc(48656);assertEquals(2f, new MutableFloat(Float.valueOf(2f)).floatValue(), 0.0001f);
        __CLR4_5_211jh11jhlvha7i4f.R.inc(48657);assertEquals(3f, new MutableFloat(new MutableFloat(3f)).floatValue(), 0.0001f);

        __CLR4_5_211jh11jhlvha7i4f.R.inc(48658);assertEquals(2f, new MutableFloat("2.0").floatValue(), 0.0001f);

    }finally{__CLR4_5_211jh11jhlvha7i4f.R.flushNeeded();}}

    @Test(expected=NullPointerException.class)
    public void testConstructorNull() {__CLR4_5_211jh11jhlvha7i4f.R.globalSliceStart(getClass().getName(),48659);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hqkc8a11jn();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,67,111,110,115,116,114,117,99,116,111,114,78,117,108,108,58,32,91,78,117,108,108,80,111,105,110,116,101,114,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NullPointerException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_211jh11jhlvha7i4f.R.rethrow($CLV_t2$);}finally{__CLR4_5_211jh11jhlvha7i4f.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableFloatTest.testConstructorNull",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),48659,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hqkc8a11jn(){try{__CLR4_5_211jh11jhlvha7i4f.R.inc(48659);
        __CLR4_5_211jh11jhlvha7i4f.R.inc(48660);new MutableFloat((Number)null);
    }finally{__CLR4_5_211jh11jhlvha7i4f.R.flushNeeded();}}

    @Test
    public void testGetSet() {__CLR4_5_211jh11jhlvha7i4f.R.globalSliceStart(getClass().getName(),48661);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22wnvh711jp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_211jh11jhlvha7i4f.R.rethrow($CLV_t2$);}finally{__CLR4_5_211jh11jhlvha7i4f.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableFloatTest.testGetSet",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),48661,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22wnvh711jp(){try{__CLR4_5_211jh11jhlvha7i4f.R.inc(48661);
        __CLR4_5_211jh11jhlvha7i4f.R.inc(48662);final MutableFloat mutNum = new MutableFloat(0f);
        __CLR4_5_211jh11jhlvha7i4f.R.inc(48663);assertEquals(0f, new MutableFloat().floatValue(), 0.0001f);
        __CLR4_5_211jh11jhlvha7i4f.R.inc(48664);assertEquals(Float.valueOf(0), new MutableFloat().getValue());
        
        __CLR4_5_211jh11jhlvha7i4f.R.inc(48665);mutNum.setValue(1);
        __CLR4_5_211jh11jhlvha7i4f.R.inc(48666);assertEquals(1f, mutNum.floatValue(), 0.0001f);
        __CLR4_5_211jh11jhlvha7i4f.R.inc(48667);assertEquals(Float.valueOf(1f), mutNum.getValue());
        
        __CLR4_5_211jh11jhlvha7i4f.R.inc(48668);mutNum.setValue(Float.valueOf(2f));
        __CLR4_5_211jh11jhlvha7i4f.R.inc(48669);assertEquals(2f, mutNum.floatValue(), 0.0001f);
        __CLR4_5_211jh11jhlvha7i4f.R.inc(48670);assertEquals(Float.valueOf(2f), mutNum.getValue());
        
        __CLR4_5_211jh11jhlvha7i4f.R.inc(48671);mutNum.setValue(new MutableFloat(3f));
        __CLR4_5_211jh11jhlvha7i4f.R.inc(48672);assertEquals(3f, mutNum.floatValue(), 0.0001f);
        __CLR4_5_211jh11jhlvha7i4f.R.inc(48673);assertEquals(Float.valueOf(3f), mutNum.getValue());
    }finally{__CLR4_5_211jh11jhlvha7i4f.R.flushNeeded();}}

    @Test(expected=NullPointerException.class)
    public void testSetNull() {__CLR4_5_211jh11jhlvha7i4f.R.globalSliceStart(getClass().getName(),48674);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hciyri11k2();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,83,101,116,78,117,108,108,58,32,91,78,117,108,108,80,111,105,110,116,101,114,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NullPointerException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_211jh11jhlvha7i4f.R.rethrow($CLV_t2$);}finally{__CLR4_5_211jh11jhlvha7i4f.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableFloatTest.testSetNull",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),48674,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hciyri11k2(){try{__CLR4_5_211jh11jhlvha7i4f.R.inc(48674);
        __CLR4_5_211jh11jhlvha7i4f.R.inc(48675);final MutableFloat mutNum = new MutableFloat(0f);
        __CLR4_5_211jh11jhlvha7i4f.R.inc(48676);mutNum.setValue(null);
    }finally{__CLR4_5_211jh11jhlvha7i4f.R.flushNeeded();}}

    @Test
    public void testNanInfinite() {__CLR4_5_211jh11jhlvha7i4f.R.globalSliceStart(getClass().getName(),48677);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gn0e0s11k5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_211jh11jhlvha7i4f.R.rethrow($CLV_t2$);}finally{__CLR4_5_211jh11jhlvha7i4f.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableFloatTest.testNanInfinite",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),48677,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gn0e0s11k5(){try{__CLR4_5_211jh11jhlvha7i4f.R.inc(48677);
        __CLR4_5_211jh11jhlvha7i4f.R.inc(48678);MutableFloat mutNum = new MutableFloat(Float.NaN);
        __CLR4_5_211jh11jhlvha7i4f.R.inc(48679);assertTrue(mutNum.isNaN());
        
        __CLR4_5_211jh11jhlvha7i4f.R.inc(48680);mutNum = new MutableFloat(Float.POSITIVE_INFINITY);
        __CLR4_5_211jh11jhlvha7i4f.R.inc(48681);assertTrue(mutNum.isInfinite());
        
        __CLR4_5_211jh11jhlvha7i4f.R.inc(48682);mutNum = new MutableFloat(Float.NEGATIVE_INFINITY);
        __CLR4_5_211jh11jhlvha7i4f.R.inc(48683);assertTrue(mutNum.isInfinite());
    }finally{__CLR4_5_211jh11jhlvha7i4f.R.flushNeeded();}}

    @Test
    public void testEquals() {__CLR4_5_211jh11jhlvha7i4f.R.globalSliceStart(getClass().getName(),48684);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2s4e60811kc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_211jh11jhlvha7i4f.R.rethrow($CLV_t2$);}finally{__CLR4_5_211jh11jhlvha7i4f.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableFloatTest.testEquals",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),48684,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2s4e60811kc(){try{__CLR4_5_211jh11jhlvha7i4f.R.inc(48684);
        __CLR4_5_211jh11jhlvha7i4f.R.inc(48685);final MutableFloat mutNumA = new MutableFloat(0f);
        __CLR4_5_211jh11jhlvha7i4f.R.inc(48686);final MutableFloat mutNumB = new MutableFloat(0f);
        __CLR4_5_211jh11jhlvha7i4f.R.inc(48687);final MutableFloat mutNumC = new MutableFloat(1f);

        __CLR4_5_211jh11jhlvha7i4f.R.inc(48688);assertTrue(mutNumA.equals(mutNumA));
        __CLR4_5_211jh11jhlvha7i4f.R.inc(48689);assertTrue(mutNumA.equals(mutNumB));
        __CLR4_5_211jh11jhlvha7i4f.R.inc(48690);assertTrue(mutNumB.equals(mutNumA));
        __CLR4_5_211jh11jhlvha7i4f.R.inc(48691);assertTrue(mutNumB.equals(mutNumB));
        __CLR4_5_211jh11jhlvha7i4f.R.inc(48692);assertFalse(mutNumA.equals(mutNumC));
        __CLR4_5_211jh11jhlvha7i4f.R.inc(48693);assertFalse(mutNumB.equals(mutNumC));
        __CLR4_5_211jh11jhlvha7i4f.R.inc(48694);assertTrue(mutNumC.equals(mutNumC));
        __CLR4_5_211jh11jhlvha7i4f.R.inc(48695);assertFalse(mutNumA.equals(null));
        __CLR4_5_211jh11jhlvha7i4f.R.inc(48696);assertFalse(mutNumA.equals(Float.valueOf(0f)));
        __CLR4_5_211jh11jhlvha7i4f.R.inc(48697);assertFalse(mutNumA.equals("0"));
    }finally{__CLR4_5_211jh11jhlvha7i4f.R.flushNeeded();}}

    @Test
    public void testHashCode() {__CLR4_5_211jh11jhlvha7i4f.R.globalSliceStart(getClass().getName(),48698);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23zkhv811kq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_211jh11jhlvha7i4f.R.rethrow($CLV_t2$);}finally{__CLR4_5_211jh11jhlvha7i4f.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableFloatTest.testHashCode",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),48698,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23zkhv811kq(){try{__CLR4_5_211jh11jhlvha7i4f.R.inc(48698);
        __CLR4_5_211jh11jhlvha7i4f.R.inc(48699);final MutableFloat mutNumA = new MutableFloat(0f);
        __CLR4_5_211jh11jhlvha7i4f.R.inc(48700);final MutableFloat mutNumB = new MutableFloat(0f);
        __CLR4_5_211jh11jhlvha7i4f.R.inc(48701);final MutableFloat mutNumC = new MutableFloat(1f);

        __CLR4_5_211jh11jhlvha7i4f.R.inc(48702);assertTrue(mutNumA.hashCode() == mutNumA.hashCode());
        __CLR4_5_211jh11jhlvha7i4f.R.inc(48703);assertTrue(mutNumA.hashCode() == mutNumB.hashCode());
        __CLR4_5_211jh11jhlvha7i4f.R.inc(48704);assertFalse(mutNumA.hashCode() == mutNumC.hashCode());
        __CLR4_5_211jh11jhlvha7i4f.R.inc(48705);assertTrue(mutNumA.hashCode() == Float.valueOf(0f).hashCode());
    }finally{__CLR4_5_211jh11jhlvha7i4f.R.flushNeeded();}}

    @Test
    public void testCompareTo() {__CLR4_5_211jh11jhlvha7i4f.R.globalSliceStart(getClass().getName(),48706);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2pz6vfv11ky();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_211jh11jhlvha7i4f.R.rethrow($CLV_t2$);}finally{__CLR4_5_211jh11jhlvha7i4f.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableFloatTest.testCompareTo",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),48706,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2pz6vfv11ky(){try{__CLR4_5_211jh11jhlvha7i4f.R.inc(48706);
        __CLR4_5_211jh11jhlvha7i4f.R.inc(48707);final MutableFloat mutNum = new MutableFloat(0f);

        __CLR4_5_211jh11jhlvha7i4f.R.inc(48708);assertEquals(0, mutNum.compareTo(new MutableFloat(0f)));
        __CLR4_5_211jh11jhlvha7i4f.R.inc(48709);assertEquals(+1, mutNum.compareTo(new MutableFloat(-1f)));
        __CLR4_5_211jh11jhlvha7i4f.R.inc(48710);assertEquals(-1, mutNum.compareTo(new MutableFloat(1f)));
    }finally{__CLR4_5_211jh11jhlvha7i4f.R.flushNeeded();}}

    @Test(expected=NullPointerException.class)
    public void testCompareToNull() {__CLR4_5_211jh11jhlvha7i4f.R.globalSliceStart(getClass().getName(),48711);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2g1nl0c11l3();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,67,111,109,112,97,114,101,84,111,78,117,108,108,58,32,91,78,117,108,108,80,111,105,110,116,101,114,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NullPointerException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_211jh11jhlvha7i4f.R.rethrow($CLV_t2$);}finally{__CLR4_5_211jh11jhlvha7i4f.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableFloatTest.testCompareToNull",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),48711,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2g1nl0c11l3(){try{__CLR4_5_211jh11jhlvha7i4f.R.inc(48711);
        __CLR4_5_211jh11jhlvha7i4f.R.inc(48712);final MutableFloat mutNum = new MutableFloat(0f);
        __CLR4_5_211jh11jhlvha7i4f.R.inc(48713);mutNum.compareTo(null);
    }finally{__CLR4_5_211jh11jhlvha7i4f.R.flushNeeded();}}

    @Test
    public void testPrimitiveValues() {__CLR4_5_211jh11jhlvha7i4f.R.globalSliceStart(getClass().getName(),48714);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2uifry11l6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_211jh11jhlvha7i4f.R.rethrow($CLV_t2$);}finally{__CLR4_5_211jh11jhlvha7i4f.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableFloatTest.testPrimitiveValues",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),48714,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2uifry11l6(){try{__CLR4_5_211jh11jhlvha7i4f.R.inc(48714);
        __CLR4_5_211jh11jhlvha7i4f.R.inc(48715);final MutableFloat mutNum = new MutableFloat(1.7F);
        
        __CLR4_5_211jh11jhlvha7i4f.R.inc(48716);assertEquals( 1, mutNum.intValue() );
        __CLR4_5_211jh11jhlvha7i4f.R.inc(48717);assertEquals( 1.7, mutNum.doubleValue(), 0.00001 );
        __CLR4_5_211jh11jhlvha7i4f.R.inc(48718);assertEquals( (byte) 1, mutNum.byteValue() );
        __CLR4_5_211jh11jhlvha7i4f.R.inc(48719);assertEquals( (short) 1, mutNum.shortValue() );
        __CLR4_5_211jh11jhlvha7i4f.R.inc(48720);assertEquals( 1, mutNum.intValue() );
        __CLR4_5_211jh11jhlvha7i4f.R.inc(48721);assertEquals( 1L, mutNum.longValue() );
    }finally{__CLR4_5_211jh11jhlvha7i4f.R.flushNeeded();}}

    @Test
    public void testToFloat() {__CLR4_5_211jh11jhlvha7i4f.R.globalSliceStart(getClass().getName(),48722);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2uoiec611le();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_211jh11jhlvha7i4f.R.rethrow($CLV_t2$);}finally{__CLR4_5_211jh11jhlvha7i4f.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableFloatTest.testToFloat",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),48722,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2uoiec611le(){try{__CLR4_5_211jh11jhlvha7i4f.R.inc(48722);
        __CLR4_5_211jh11jhlvha7i4f.R.inc(48723);assertEquals(Float.valueOf(0f), new MutableFloat(0f).toFloat());
        __CLR4_5_211jh11jhlvha7i4f.R.inc(48724);assertEquals(Float.valueOf(12.3f), new MutableFloat(12.3f).toFloat());
    }finally{__CLR4_5_211jh11jhlvha7i4f.R.flushNeeded();}}

    @Test
    public void testIncrement() {__CLR4_5_211jh11jhlvha7i4f.R.globalSliceStart(getClass().getName(),48725);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2m6qqn011lh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_211jh11jhlvha7i4f.R.rethrow($CLV_t2$);}finally{__CLR4_5_211jh11jhlvha7i4f.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableFloatTest.testIncrement",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),48725,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2m6qqn011lh(){try{__CLR4_5_211jh11jhlvha7i4f.R.inc(48725);
        __CLR4_5_211jh11jhlvha7i4f.R.inc(48726);final MutableFloat mutNum = new MutableFloat(1);
        __CLR4_5_211jh11jhlvha7i4f.R.inc(48727);mutNum.increment();
        
        __CLR4_5_211jh11jhlvha7i4f.R.inc(48728);assertEquals(2, mutNum.intValue());
        __CLR4_5_211jh11jhlvha7i4f.R.inc(48729);assertEquals(2L, mutNum.longValue());
    }finally{__CLR4_5_211jh11jhlvha7i4f.R.flushNeeded();}}

    @Test
    public void testIncrementAndGet() {__CLR4_5_211jh11jhlvha7i4f.R.globalSliceStart(getClass().getName(),48730);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2qa1xk311lm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_211jh11jhlvha7i4f.R.rethrow($CLV_t2$);}finally{__CLR4_5_211jh11jhlvha7i4f.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableFloatTest.testIncrementAndGet",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),48730,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2qa1xk311lm(){try{__CLR4_5_211jh11jhlvha7i4f.R.inc(48730);
        __CLR4_5_211jh11jhlvha7i4f.R.inc(48731);final MutableFloat mutNum = new MutableFloat(1f);
        __CLR4_5_211jh11jhlvha7i4f.R.inc(48732);final float result = mutNum.incrementAndGet();

        __CLR4_5_211jh11jhlvha7i4f.R.inc(48733);assertEquals(2f, result, 0.01f);
        __CLR4_5_211jh11jhlvha7i4f.R.inc(48734);assertEquals(2, mutNum.intValue());
        __CLR4_5_211jh11jhlvha7i4f.R.inc(48735);assertEquals(2L, mutNum.longValue());
    }finally{__CLR4_5_211jh11jhlvha7i4f.R.flushNeeded();}}

    @Test
    public void testGetAndIncrement() {__CLR4_5_211jh11jhlvha7i4f.R.globalSliceStart(getClass().getName(),48736);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2f0tjtv11ls();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_211jh11jhlvha7i4f.R.rethrow($CLV_t2$);}finally{__CLR4_5_211jh11jhlvha7i4f.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableFloatTest.testGetAndIncrement",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),48736,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2f0tjtv11ls(){try{__CLR4_5_211jh11jhlvha7i4f.R.inc(48736);
        __CLR4_5_211jh11jhlvha7i4f.R.inc(48737);final MutableFloat mutNum = new MutableFloat(1f);
        __CLR4_5_211jh11jhlvha7i4f.R.inc(48738);final float result = mutNum.getAndIncrement();

        __CLR4_5_211jh11jhlvha7i4f.R.inc(48739);assertEquals(1f, result, 0.01f);
        __CLR4_5_211jh11jhlvha7i4f.R.inc(48740);assertEquals(2, mutNum.intValue());
        __CLR4_5_211jh11jhlvha7i4f.R.inc(48741);assertEquals(2L, mutNum.longValue());
    }finally{__CLR4_5_211jh11jhlvha7i4f.R.flushNeeded();}}

    @Test
    public void testDecrement() {__CLR4_5_211jh11jhlvha7i4f.R.globalSliceStart(getClass().getName(),48742);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2pripmw11ly();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_211jh11jhlvha7i4f.R.rethrow($CLV_t2$);}finally{__CLR4_5_211jh11jhlvha7i4f.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableFloatTest.testDecrement",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),48742,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2pripmw11ly(){try{__CLR4_5_211jh11jhlvha7i4f.R.inc(48742);
        __CLR4_5_211jh11jhlvha7i4f.R.inc(48743);final MutableFloat mutNum = new MutableFloat(1);
        __CLR4_5_211jh11jhlvha7i4f.R.inc(48744);mutNum.decrement();
        
        __CLR4_5_211jh11jhlvha7i4f.R.inc(48745);assertEquals(0, mutNum.intValue());
        __CLR4_5_211jh11jhlvha7i4f.R.inc(48746);assertEquals(0L, mutNum.longValue());
    }finally{__CLR4_5_211jh11jhlvha7i4f.R.flushNeeded();}}

    @Test
    public void testDecrementAndGet() {__CLR4_5_211jh11jhlvha7i4f.R.globalSliceStart(getClass().getName(),48747);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_272ukah11m3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_211jh11jhlvha7i4f.R.rethrow($CLV_t2$);}finally{__CLR4_5_211jh11jhlvha7i4f.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableFloatTest.testDecrementAndGet",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),48747,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_272ukah11m3(){try{__CLR4_5_211jh11jhlvha7i4f.R.inc(48747);
        __CLR4_5_211jh11jhlvha7i4f.R.inc(48748);final MutableFloat mutNum = new MutableFloat(1f);
        __CLR4_5_211jh11jhlvha7i4f.R.inc(48749);final float result = mutNum.decrementAndGet();

        __CLR4_5_211jh11jhlvha7i4f.R.inc(48750);assertEquals(0f, result, 0.01f);
        __CLR4_5_211jh11jhlvha7i4f.R.inc(48751);assertEquals(0, mutNum.intValue());
        __CLR4_5_211jh11jhlvha7i4f.R.inc(48752);assertEquals(0L, mutNum.longValue());
    }finally{__CLR4_5_211jh11jhlvha7i4f.R.flushNeeded();}}

    @Test
    public void testGetAndDecrement() {__CLR4_5_211jh11jhlvha7i4f.R.globalSliceStart(getClass().getName(),48753);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28211vd11m9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_211jh11jhlvha7i4f.R.rethrow($CLV_t2$);}finally{__CLR4_5_211jh11jhlvha7i4f.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableFloatTest.testGetAndDecrement",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),48753,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28211vd11m9(){try{__CLR4_5_211jh11jhlvha7i4f.R.inc(48753);
        __CLR4_5_211jh11jhlvha7i4f.R.inc(48754);final MutableFloat mutNum = new MutableFloat(1f);
        __CLR4_5_211jh11jhlvha7i4f.R.inc(48755);final float result = mutNum.getAndDecrement();

        __CLR4_5_211jh11jhlvha7i4f.R.inc(48756);assertEquals(1f, result, 0.01f);
        __CLR4_5_211jh11jhlvha7i4f.R.inc(48757);assertEquals(0, mutNum.intValue());
        __CLR4_5_211jh11jhlvha7i4f.R.inc(48758);assertEquals(0L, mutNum.longValue());
    }finally{__CLR4_5_211jh11jhlvha7i4f.R.flushNeeded();}}

    @Test
    public void testAddValuePrimitive() {__CLR4_5_211jh11jhlvha7i4f.R.globalSliceStart(getClass().getName(),48759);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2nrme6s11mf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_211jh11jhlvha7i4f.R.rethrow($CLV_t2$);}finally{__CLR4_5_211jh11jhlvha7i4f.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableFloatTest.testAddValuePrimitive",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),48759,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2nrme6s11mf(){try{__CLR4_5_211jh11jhlvha7i4f.R.inc(48759);
        __CLR4_5_211jh11jhlvha7i4f.R.inc(48760);final MutableFloat mutNum = new MutableFloat(1);
        __CLR4_5_211jh11jhlvha7i4f.R.inc(48761);mutNum.add(1.1f);
        
        __CLR4_5_211jh11jhlvha7i4f.R.inc(48762);assertEquals(2.1f, mutNum.floatValue(), 0.01f);
    }finally{__CLR4_5_211jh11jhlvha7i4f.R.flushNeeded();}}

    @Test
    public void testAddValueObject() {__CLR4_5_211jh11jhlvha7i4f.R.globalSliceStart(getClass().getName(),48763);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2cu6v3s11mj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_211jh11jhlvha7i4f.R.rethrow($CLV_t2$);}finally{__CLR4_5_211jh11jhlvha7i4f.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableFloatTest.testAddValueObject",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),48763,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2cu6v3s11mj(){try{__CLR4_5_211jh11jhlvha7i4f.R.inc(48763);
        __CLR4_5_211jh11jhlvha7i4f.R.inc(48764);final MutableFloat mutNum = new MutableFloat(1);
        __CLR4_5_211jh11jhlvha7i4f.R.inc(48765);mutNum.add(Float.valueOf(1.1f));
        
        __CLR4_5_211jh11jhlvha7i4f.R.inc(48766);assertEquals(2.1f, mutNum.floatValue(), 0.01f);
    }finally{__CLR4_5_211jh11jhlvha7i4f.R.flushNeeded();}}

    @Test
    public void testGetAndAddValuePrimitive() {__CLR4_5_211jh11jhlvha7i4f.R.globalSliceStart(getClass().getName(),48767);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n5m0b11mn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_211jh11jhlvha7i4f.R.rethrow($CLV_t2$);}finally{__CLR4_5_211jh11jhlvha7i4f.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableFloatTest.testGetAndAddValuePrimitive",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),48767,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n5m0b11mn(){try{__CLR4_5_211jh11jhlvha7i4f.R.inc(48767);
        __CLR4_5_211jh11jhlvha7i4f.R.inc(48768);final MutableFloat mutableFloat = new MutableFloat(1.25f);
        __CLR4_5_211jh11jhlvha7i4f.R.inc(48769);final float result = mutableFloat.getAndAdd(0.75f);

        __CLR4_5_211jh11jhlvha7i4f.R.inc(48770);assertEquals(1.25f, result, 0.01f);
        __CLR4_5_211jh11jhlvha7i4f.R.inc(48771);assertEquals(2f, mutableFloat.floatValue(), 0.01f);
    }finally{__CLR4_5_211jh11jhlvha7i4f.R.flushNeeded();}}

    @Test
    public void testGetAndAddValueObject() {__CLR4_5_211jh11jhlvha7i4f.R.globalSliceStart(getClass().getName(),48772);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2yzlrhl11ms();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_211jh11jhlvha7i4f.R.rethrow($CLV_t2$);}finally{__CLR4_5_211jh11jhlvha7i4f.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableFloatTest.testGetAndAddValueObject",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),48772,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2yzlrhl11ms(){try{__CLR4_5_211jh11jhlvha7i4f.R.inc(48772);
        __CLR4_5_211jh11jhlvha7i4f.R.inc(48773);final MutableFloat mutableFloat = new MutableFloat(7.75f);
        __CLR4_5_211jh11jhlvha7i4f.R.inc(48774);final float result = mutableFloat.getAndAdd(Float.valueOf(2.25f));

        __CLR4_5_211jh11jhlvha7i4f.R.inc(48775);assertEquals(7.75f, result, 0.01f);
        __CLR4_5_211jh11jhlvha7i4f.R.inc(48776);assertEquals(10f, mutableFloat.floatValue(), 0.01f);
    }finally{__CLR4_5_211jh11jhlvha7i4f.R.flushNeeded();}}

    @Test
    public void testAddAndGetValuePrimitive() {__CLR4_5_211jh11jhlvha7i4f.R.globalSliceStart(getClass().getName(),48777);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_211nwiz11mx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_211jh11jhlvha7i4f.R.rethrow($CLV_t2$);}finally{__CLR4_5_211jh11jhlvha7i4f.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableFloatTest.testAddAndGetValuePrimitive",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),48777,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_211nwiz11mx(){try{__CLR4_5_211jh11jhlvha7i4f.R.inc(48777);
        __CLR4_5_211jh11jhlvha7i4f.R.inc(48778);final MutableFloat mutableFloat = new MutableFloat(0.5f);
        __CLR4_5_211jh11jhlvha7i4f.R.inc(48779);final float result = mutableFloat.addAndGet(1f);

        __CLR4_5_211jh11jhlvha7i4f.R.inc(48780);assertEquals(1.5f, result, 0.01f);
        __CLR4_5_211jh11jhlvha7i4f.R.inc(48781);assertEquals(1.5f, mutableFloat.floatValue(), 0.01f);
    }finally{__CLR4_5_211jh11jhlvha7i4f.R.flushNeeded();}}

    @Test
    public void testAddAndGetValueObject() {__CLR4_5_211jh11jhlvha7i4f.R.globalSliceStart(getClass().getName(),48782);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24to31311n2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_211jh11jhlvha7i4f.R.rethrow($CLV_t2$);}finally{__CLR4_5_211jh11jhlvha7i4f.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableFloatTest.testAddAndGetValueObject",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),48782,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24to31311n2(){try{__CLR4_5_211jh11jhlvha7i4f.R.inc(48782);
        __CLR4_5_211jh11jhlvha7i4f.R.inc(48783);final MutableFloat mutableFloat = new MutableFloat(5f);
        __CLR4_5_211jh11jhlvha7i4f.R.inc(48784);final float result = mutableFloat.addAndGet(Float.valueOf(2.5f));

        __CLR4_5_211jh11jhlvha7i4f.R.inc(48785);assertEquals(7.5f, result, 0.01f);
        __CLR4_5_211jh11jhlvha7i4f.R.inc(48786);assertEquals(7.5f, mutableFloat.floatValue(), 0.01f);
    }finally{__CLR4_5_211jh11jhlvha7i4f.R.flushNeeded();}}

    @Test
    public void testSubtractValuePrimitive() {__CLR4_5_211jh11jhlvha7i4f.R.globalSliceStart(getClass().getName(),48787);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2w07icj11n7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_211jh11jhlvha7i4f.R.rethrow($CLV_t2$);}finally{__CLR4_5_211jh11jhlvha7i4f.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableFloatTest.testSubtractValuePrimitive",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),48787,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2w07icj11n7(){try{__CLR4_5_211jh11jhlvha7i4f.R.inc(48787);
        __CLR4_5_211jh11jhlvha7i4f.R.inc(48788);final MutableFloat mutNum = new MutableFloat(1);
        __CLR4_5_211jh11jhlvha7i4f.R.inc(48789);mutNum.subtract(0.9f);
        
        __CLR4_5_211jh11jhlvha7i4f.R.inc(48790);assertEquals(0.1f, mutNum.floatValue(), 0.01f);
    }finally{__CLR4_5_211jh11jhlvha7i4f.R.flushNeeded();}}

    @Test
    public void testSubtractValueObject() {__CLR4_5_211jh11jhlvha7i4f.R.globalSliceStart(getClass().getName(),48791);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2xnns6p11nb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_211jh11jhlvha7i4f.R.rethrow($CLV_t2$);}finally{__CLR4_5_211jh11jhlvha7i4f.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableFloatTest.testSubtractValueObject",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),48791,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2xnns6p11nb(){try{__CLR4_5_211jh11jhlvha7i4f.R.inc(48791);
        __CLR4_5_211jh11jhlvha7i4f.R.inc(48792);final MutableFloat mutNum = new MutableFloat(1);
        __CLR4_5_211jh11jhlvha7i4f.R.inc(48793);mutNum.subtract(Float.valueOf(0.9f));
        
        __CLR4_5_211jh11jhlvha7i4f.R.inc(48794);assertEquals(0.1f, mutNum.floatValue(), 0.01f);
    }finally{__CLR4_5_211jh11jhlvha7i4f.R.flushNeeded();}}

    @Test
    public void testToString() {__CLR4_5_211jh11jhlvha7i4f.R.globalSliceStart(getClass().getName(),48795);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hrxdid11nf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_211jh11jhlvha7i4f.R.rethrow($CLV_t2$);}finally{__CLR4_5_211jh11jhlvha7i4f.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableFloatTest.testToString",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),48795,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hrxdid11nf(){try{__CLR4_5_211jh11jhlvha7i4f.R.inc(48795);
        __CLR4_5_211jh11jhlvha7i4f.R.inc(48796);assertEquals("0.0", new MutableFloat(0f).toString());
        __CLR4_5_211jh11jhlvha7i4f.R.inc(48797);assertEquals("10.0", new MutableFloat(10f).toString());
        __CLR4_5_211jh11jhlvha7i4f.R.inc(48798);assertEquals("-123.0", new MutableFloat(-123f).toString());
    }finally{__CLR4_5_211jh11jhlvha7i4f.R.flushNeeded();}}

}
