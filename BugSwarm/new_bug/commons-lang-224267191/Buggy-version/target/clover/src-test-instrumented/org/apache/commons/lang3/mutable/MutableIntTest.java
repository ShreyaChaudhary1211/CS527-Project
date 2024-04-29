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
 * @see MutableInt
 */
public class MutableIntTest {static class __CLR4_5_211nj11njlvha7i4o{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172763741L,8589935092L,48940,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    // ----------------------------------------------------------------
    @Test
    public void testConstructors() {__CLR4_5_211nj11njlvha7i4o.R.globalSliceStart(getClass().getName(),48799);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2lwxahe11nj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_211nj11njlvha7i4o.R.rethrow($CLV_t2$);}finally{__CLR4_5_211nj11njlvha7i4o.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableIntTest.testConstructors",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),48799,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2lwxahe11nj(){try{__CLR4_5_211nj11njlvha7i4o.R.inc(48799);
        __CLR4_5_211nj11njlvha7i4o.R.inc(48800);assertEquals(0, new MutableInt().intValue());
        
        __CLR4_5_211nj11njlvha7i4o.R.inc(48801);assertEquals(1, new MutableInt(1).intValue());
        
        __CLR4_5_211nj11njlvha7i4o.R.inc(48802);assertEquals(2, new MutableInt(Integer.valueOf(2)).intValue());
        __CLR4_5_211nj11njlvha7i4o.R.inc(48803);assertEquals(3, new MutableInt(new MutableLong(3)).intValue());

        __CLR4_5_211nj11njlvha7i4o.R.inc(48804);assertEquals(2, new MutableInt("2").intValue());

    }finally{__CLR4_5_211nj11njlvha7i4o.R.flushNeeded();}}

    @Test(expected=NullPointerException.class)
    public void testConstructorNull() {__CLR4_5_211nj11njlvha7i4o.R.globalSliceStart(getClass().getName(),48805);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hqkc8a11np();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,67,111,110,115,116,114,117,99,116,111,114,78,117,108,108,58,32,91,78,117,108,108,80,111,105,110,116,101,114,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NullPointerException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_211nj11njlvha7i4o.R.rethrow($CLV_t2$);}finally{__CLR4_5_211nj11njlvha7i4o.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableIntTest.testConstructorNull",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),48805,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hqkc8a11np(){try{__CLR4_5_211nj11njlvha7i4o.R.inc(48805);
        __CLR4_5_211nj11njlvha7i4o.R.inc(48806);new MutableInt((Number)null);
    }finally{__CLR4_5_211nj11njlvha7i4o.R.flushNeeded();}}

    @Test
    public void testGetSet() {__CLR4_5_211nj11njlvha7i4o.R.globalSliceStart(getClass().getName(),48807);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22wnvh711nr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_211nj11njlvha7i4o.R.rethrow($CLV_t2$);}finally{__CLR4_5_211nj11njlvha7i4o.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableIntTest.testGetSet",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),48807,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22wnvh711nr(){try{__CLR4_5_211nj11njlvha7i4o.R.inc(48807);
        __CLR4_5_211nj11njlvha7i4o.R.inc(48808);final MutableInt mutNum = new MutableInt(0);
        __CLR4_5_211nj11njlvha7i4o.R.inc(48809);assertEquals(0, new MutableInt().intValue());
        __CLR4_5_211nj11njlvha7i4o.R.inc(48810);assertEquals(Integer.valueOf(0), new MutableInt().getValue());
        
        __CLR4_5_211nj11njlvha7i4o.R.inc(48811);mutNum.setValue(1);
        __CLR4_5_211nj11njlvha7i4o.R.inc(48812);assertEquals(1, mutNum.intValue());
        __CLR4_5_211nj11njlvha7i4o.R.inc(48813);assertEquals(Integer.valueOf(1), mutNum.getValue());
        
        __CLR4_5_211nj11njlvha7i4o.R.inc(48814);mutNum.setValue(Integer.valueOf(2));
        __CLR4_5_211nj11njlvha7i4o.R.inc(48815);assertEquals(2, mutNum.intValue());
        __CLR4_5_211nj11njlvha7i4o.R.inc(48816);assertEquals(Integer.valueOf(2), mutNum.getValue());
        
        __CLR4_5_211nj11njlvha7i4o.R.inc(48817);mutNum.setValue(new MutableLong(3));
        __CLR4_5_211nj11njlvha7i4o.R.inc(48818);assertEquals(3, mutNum.intValue());
        __CLR4_5_211nj11njlvha7i4o.R.inc(48819);assertEquals(Integer.valueOf(3), mutNum.getValue());
    }finally{__CLR4_5_211nj11njlvha7i4o.R.flushNeeded();}}

    @Test(expected=NullPointerException.class)
    public void testSetNull() {__CLR4_5_211nj11njlvha7i4o.R.globalSliceStart(getClass().getName(),48820);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hciyri11o4();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,83,101,116,78,117,108,108,58,32,91,78,117,108,108,80,111,105,110,116,101,114,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NullPointerException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_211nj11njlvha7i4o.R.rethrow($CLV_t2$);}finally{__CLR4_5_211nj11njlvha7i4o.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableIntTest.testSetNull",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),48820,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hciyri11o4(){try{__CLR4_5_211nj11njlvha7i4o.R.inc(48820);
        __CLR4_5_211nj11njlvha7i4o.R.inc(48821);final MutableInt mutNum = new MutableInt(0);
        __CLR4_5_211nj11njlvha7i4o.R.inc(48822);mutNum.setValue(null);
    }finally{__CLR4_5_211nj11njlvha7i4o.R.flushNeeded();}}

    @Test
    public void testEquals() {__CLR4_5_211nj11njlvha7i4o.R.globalSliceStart(getClass().getName(),48823);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2s4e60811o7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_211nj11njlvha7i4o.R.rethrow($CLV_t2$);}finally{__CLR4_5_211nj11njlvha7i4o.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableIntTest.testEquals",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),48823,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2s4e60811o7(){try{__CLR4_5_211nj11njlvha7i4o.R.inc(48823);
        __CLR4_5_211nj11njlvha7i4o.R.inc(48824);this.testEquals(new MutableInt(0), new MutableInt(0), new MutableInt(1));
        // Should Numbers be supported? GaryG July-21-2005.
        //this.testEquals(mutNumA, Integer.valueOf(0), mutNumC);
    }finally{__CLR4_5_211nj11njlvha7i4o.R.flushNeeded();}}

    /**
     * @param numA must not be a 0 Integer; must not equal numC.
     * @param numB must equal numA; must not equal numC.
     * @param numC must not equal numA; must not equal numC.
     */
    void testEquals(final Number numA, final Number numB, final Number numC) {try{__CLR4_5_211nj11njlvha7i4o.R.inc(48825);
        __CLR4_5_211nj11njlvha7i4o.R.inc(48826);assertTrue(numA.equals(numA));
        __CLR4_5_211nj11njlvha7i4o.R.inc(48827);assertTrue(numA.equals(numB));
        __CLR4_5_211nj11njlvha7i4o.R.inc(48828);assertTrue(numB.equals(numA));
        __CLR4_5_211nj11njlvha7i4o.R.inc(48829);assertTrue(numB.equals(numB));
        __CLR4_5_211nj11njlvha7i4o.R.inc(48830);assertFalse(numA.equals(numC));
        __CLR4_5_211nj11njlvha7i4o.R.inc(48831);assertFalse(numB.equals(numC));
        __CLR4_5_211nj11njlvha7i4o.R.inc(48832);assertTrue(numC.equals(numC));
        __CLR4_5_211nj11njlvha7i4o.R.inc(48833);assertFalse(numA.equals(null));
        __CLR4_5_211nj11njlvha7i4o.R.inc(48834);assertFalse(numA.equals(Integer.valueOf(0)));
        __CLR4_5_211nj11njlvha7i4o.R.inc(48835);assertFalse(numA.equals("0"));
    }finally{__CLR4_5_211nj11njlvha7i4o.R.flushNeeded();}}

    @Test
    public void testHashCode() {__CLR4_5_211nj11njlvha7i4o.R.globalSliceStart(getClass().getName(),48836);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23zkhv811ok();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_211nj11njlvha7i4o.R.rethrow($CLV_t2$);}finally{__CLR4_5_211nj11njlvha7i4o.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableIntTest.testHashCode",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),48836,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23zkhv811ok(){try{__CLR4_5_211nj11njlvha7i4o.R.inc(48836);
        __CLR4_5_211nj11njlvha7i4o.R.inc(48837);final MutableInt mutNumA = new MutableInt(0);
        __CLR4_5_211nj11njlvha7i4o.R.inc(48838);final MutableInt mutNumB = new MutableInt(0);
        __CLR4_5_211nj11njlvha7i4o.R.inc(48839);final MutableInt mutNumC = new MutableInt(1);

        __CLR4_5_211nj11njlvha7i4o.R.inc(48840);assertTrue(mutNumA.hashCode() == mutNumA.hashCode());
        __CLR4_5_211nj11njlvha7i4o.R.inc(48841);assertTrue(mutNumA.hashCode() == mutNumB.hashCode());
        __CLR4_5_211nj11njlvha7i4o.R.inc(48842);assertFalse(mutNumA.hashCode() == mutNumC.hashCode());
        __CLR4_5_211nj11njlvha7i4o.R.inc(48843);assertTrue(mutNumA.hashCode() == Integer.valueOf(0).hashCode());
    }finally{__CLR4_5_211nj11njlvha7i4o.R.flushNeeded();}}

    @Test
    public void testCompareTo() {__CLR4_5_211nj11njlvha7i4o.R.globalSliceStart(getClass().getName(),48844);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2pz6vfv11os();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_211nj11njlvha7i4o.R.rethrow($CLV_t2$);}finally{__CLR4_5_211nj11njlvha7i4o.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableIntTest.testCompareTo",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),48844,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2pz6vfv11os(){try{__CLR4_5_211nj11njlvha7i4o.R.inc(48844);
        __CLR4_5_211nj11njlvha7i4o.R.inc(48845);final MutableInt mutNum = new MutableInt(0);

        __CLR4_5_211nj11njlvha7i4o.R.inc(48846);assertEquals(0, mutNum.compareTo(new MutableInt(0)));
        __CLR4_5_211nj11njlvha7i4o.R.inc(48847);assertEquals(+1, mutNum.compareTo(new MutableInt(-1)));
        __CLR4_5_211nj11njlvha7i4o.R.inc(48848);assertEquals(-1, mutNum.compareTo(new MutableInt(1)));
    }finally{__CLR4_5_211nj11njlvha7i4o.R.flushNeeded();}}

    @Test(expected=NullPointerException.class)
    public void testCompareToNull() {__CLR4_5_211nj11njlvha7i4o.R.globalSliceStart(getClass().getName(),48849);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2g1nl0c11ox();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,67,111,109,112,97,114,101,84,111,78,117,108,108,58,32,91,78,117,108,108,80,111,105,110,116,101,114,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NullPointerException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_211nj11njlvha7i4o.R.rethrow($CLV_t2$);}finally{__CLR4_5_211nj11njlvha7i4o.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableIntTest.testCompareToNull",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),48849,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2g1nl0c11ox(){try{__CLR4_5_211nj11njlvha7i4o.R.inc(48849);
        __CLR4_5_211nj11njlvha7i4o.R.inc(48850);final MutableInt mutNum = new MutableInt(0);
        __CLR4_5_211nj11njlvha7i4o.R.inc(48851);mutNum.compareTo(null);
    }finally{__CLR4_5_211nj11njlvha7i4o.R.flushNeeded();}}

    @Test
    public void testPrimitiveValues() {__CLR4_5_211nj11njlvha7i4o.R.globalSliceStart(getClass().getName(),48852);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2uifry11p0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_211nj11njlvha7i4o.R.rethrow($CLV_t2$);}finally{__CLR4_5_211nj11njlvha7i4o.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableIntTest.testPrimitiveValues",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),48852,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2uifry11p0(){try{__CLR4_5_211nj11njlvha7i4o.R.inc(48852);
        __CLR4_5_211nj11njlvha7i4o.R.inc(48853);final MutableInt mutNum = new MutableInt(1);
        
        __CLR4_5_211nj11njlvha7i4o.R.inc(48854);assertEquals( (byte) 1, mutNum.byteValue() );
        __CLR4_5_211nj11njlvha7i4o.R.inc(48855);assertEquals( (short) 1, mutNum.shortValue() );
        __CLR4_5_211nj11njlvha7i4o.R.inc(48856);assertEquals( 1.0F, mutNum.floatValue(), 0 );
        __CLR4_5_211nj11njlvha7i4o.R.inc(48857);assertEquals( 1.0, mutNum.doubleValue(), 0 );
        __CLR4_5_211nj11njlvha7i4o.R.inc(48858);assertEquals( 1L, mutNum.longValue() );
    }finally{__CLR4_5_211nj11njlvha7i4o.R.flushNeeded();}}

    @Test
    public void testToInteger() {__CLR4_5_211nj11njlvha7i4o.R.globalSliceStart(getClass().getName(),48859);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2wjyivc11p7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_211nj11njlvha7i4o.R.rethrow($CLV_t2$);}finally{__CLR4_5_211nj11njlvha7i4o.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableIntTest.testToInteger",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),48859,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2wjyivc11p7(){try{__CLR4_5_211nj11njlvha7i4o.R.inc(48859);
        __CLR4_5_211nj11njlvha7i4o.R.inc(48860);assertEquals(Integer.valueOf(0), new MutableInt(0).toInteger());
        __CLR4_5_211nj11njlvha7i4o.R.inc(48861);assertEquals(Integer.valueOf(123), new MutableInt(123).toInteger());
    }finally{__CLR4_5_211nj11njlvha7i4o.R.flushNeeded();}}

    @Test
    public void testIncrement() {__CLR4_5_211nj11njlvha7i4o.R.globalSliceStart(getClass().getName(),48862);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2m6qqn011pa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_211nj11njlvha7i4o.R.rethrow($CLV_t2$);}finally{__CLR4_5_211nj11njlvha7i4o.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableIntTest.testIncrement",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),48862,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2m6qqn011pa(){try{__CLR4_5_211nj11njlvha7i4o.R.inc(48862);
        __CLR4_5_211nj11njlvha7i4o.R.inc(48863);final MutableInt mutNum = new MutableInt(1);
        __CLR4_5_211nj11njlvha7i4o.R.inc(48864);mutNum.increment();
        
        __CLR4_5_211nj11njlvha7i4o.R.inc(48865);assertEquals(2, mutNum.intValue());
        __CLR4_5_211nj11njlvha7i4o.R.inc(48866);assertEquals(2L, mutNum.longValue());
    }finally{__CLR4_5_211nj11njlvha7i4o.R.flushNeeded();}}

    @Test
    public void testIncrementAndGet() {__CLR4_5_211nj11njlvha7i4o.R.globalSliceStart(getClass().getName(),48867);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2qa1xk311pf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_211nj11njlvha7i4o.R.rethrow($CLV_t2$);}finally{__CLR4_5_211nj11njlvha7i4o.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableIntTest.testIncrementAndGet",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),48867,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2qa1xk311pf(){try{__CLR4_5_211nj11njlvha7i4o.R.inc(48867);
        __CLR4_5_211nj11njlvha7i4o.R.inc(48868);final MutableInt mutNum = new MutableInt(1);
        __CLR4_5_211nj11njlvha7i4o.R.inc(48869);final int result = mutNum.incrementAndGet();

        __CLR4_5_211nj11njlvha7i4o.R.inc(48870);assertEquals(2, result);
        __CLR4_5_211nj11njlvha7i4o.R.inc(48871);assertEquals(2, mutNum.intValue());
        __CLR4_5_211nj11njlvha7i4o.R.inc(48872);assertEquals(2L, mutNum.longValue());
    }finally{__CLR4_5_211nj11njlvha7i4o.R.flushNeeded();}}

    @Test
    public void testGetAndIncrement() {__CLR4_5_211nj11njlvha7i4o.R.globalSliceStart(getClass().getName(),48873);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2f0tjtv11pl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_211nj11njlvha7i4o.R.rethrow($CLV_t2$);}finally{__CLR4_5_211nj11njlvha7i4o.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableIntTest.testGetAndIncrement",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),48873,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2f0tjtv11pl(){try{__CLR4_5_211nj11njlvha7i4o.R.inc(48873);
        __CLR4_5_211nj11njlvha7i4o.R.inc(48874);final MutableInt mutNum = new MutableInt(1);
        __CLR4_5_211nj11njlvha7i4o.R.inc(48875);final int result = mutNum.getAndIncrement();

        __CLR4_5_211nj11njlvha7i4o.R.inc(48876);assertEquals(1, result);
        __CLR4_5_211nj11njlvha7i4o.R.inc(48877);assertEquals(2, mutNum.intValue());
        __CLR4_5_211nj11njlvha7i4o.R.inc(48878);assertEquals(2L, mutNum.longValue());
    }finally{__CLR4_5_211nj11njlvha7i4o.R.flushNeeded();}}

    @Test
    public void testDecrement() {__CLR4_5_211nj11njlvha7i4o.R.globalSliceStart(getClass().getName(),48879);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2pripmw11pr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_211nj11njlvha7i4o.R.rethrow($CLV_t2$);}finally{__CLR4_5_211nj11njlvha7i4o.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableIntTest.testDecrement",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),48879,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2pripmw11pr(){try{__CLR4_5_211nj11njlvha7i4o.R.inc(48879);
        __CLR4_5_211nj11njlvha7i4o.R.inc(48880);final MutableInt mutNum = new MutableInt(1);
        __CLR4_5_211nj11njlvha7i4o.R.inc(48881);mutNum.decrement();
        
        __CLR4_5_211nj11njlvha7i4o.R.inc(48882);assertEquals(0, mutNum.intValue());
        __CLR4_5_211nj11njlvha7i4o.R.inc(48883);assertEquals(0L, mutNum.longValue());
    }finally{__CLR4_5_211nj11njlvha7i4o.R.flushNeeded();}}

    @Test
    public void testDecrementAndGet() {__CLR4_5_211nj11njlvha7i4o.R.globalSliceStart(getClass().getName(),48884);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_272ukah11pw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_211nj11njlvha7i4o.R.rethrow($CLV_t2$);}finally{__CLR4_5_211nj11njlvha7i4o.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableIntTest.testDecrementAndGet",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),48884,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_272ukah11pw(){try{__CLR4_5_211nj11njlvha7i4o.R.inc(48884);
        __CLR4_5_211nj11njlvha7i4o.R.inc(48885);final MutableInt mutNum = new MutableInt(1);
        __CLR4_5_211nj11njlvha7i4o.R.inc(48886);final int result = mutNum.decrementAndGet();

        __CLR4_5_211nj11njlvha7i4o.R.inc(48887);assertEquals(0, result);
        __CLR4_5_211nj11njlvha7i4o.R.inc(48888);assertEquals(0, mutNum.intValue());
        __CLR4_5_211nj11njlvha7i4o.R.inc(48889);assertEquals(0L, mutNum.longValue());
    }finally{__CLR4_5_211nj11njlvha7i4o.R.flushNeeded();}}

    @Test
    public void testGetAndDecrement() {__CLR4_5_211nj11njlvha7i4o.R.globalSliceStart(getClass().getName(),48890);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28211vd11q2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_211nj11njlvha7i4o.R.rethrow($CLV_t2$);}finally{__CLR4_5_211nj11njlvha7i4o.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableIntTest.testGetAndDecrement",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),48890,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28211vd11q2(){try{__CLR4_5_211nj11njlvha7i4o.R.inc(48890);
        __CLR4_5_211nj11njlvha7i4o.R.inc(48891);final MutableInt mutNum = new MutableInt(1);
        __CLR4_5_211nj11njlvha7i4o.R.inc(48892);final int result = mutNum.getAndDecrement();

        __CLR4_5_211nj11njlvha7i4o.R.inc(48893);assertEquals(1, result);
        __CLR4_5_211nj11njlvha7i4o.R.inc(48894);assertEquals(0, mutNum.intValue());
        __CLR4_5_211nj11njlvha7i4o.R.inc(48895);assertEquals(0L, mutNum.longValue());
    }finally{__CLR4_5_211nj11njlvha7i4o.R.flushNeeded();}}

    @Test
    public void testAddValuePrimitive() {__CLR4_5_211nj11njlvha7i4o.R.globalSliceStart(getClass().getName(),48896);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2nrme6s11q8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_211nj11njlvha7i4o.R.rethrow($CLV_t2$);}finally{__CLR4_5_211nj11njlvha7i4o.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableIntTest.testAddValuePrimitive",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),48896,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2nrme6s11q8(){try{__CLR4_5_211nj11njlvha7i4o.R.inc(48896);
        __CLR4_5_211nj11njlvha7i4o.R.inc(48897);final MutableInt mutNum = new MutableInt(1);
        __CLR4_5_211nj11njlvha7i4o.R.inc(48898);mutNum.add(1);
        
        __CLR4_5_211nj11njlvha7i4o.R.inc(48899);assertEquals(2, mutNum.intValue());
        __CLR4_5_211nj11njlvha7i4o.R.inc(48900);assertEquals(2L, mutNum.longValue());
    }finally{__CLR4_5_211nj11njlvha7i4o.R.flushNeeded();}}

    @Test
    public void testAddValueObject() {__CLR4_5_211nj11njlvha7i4o.R.globalSliceStart(getClass().getName(),48901);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2cu6v3s11qd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_211nj11njlvha7i4o.R.rethrow($CLV_t2$);}finally{__CLR4_5_211nj11njlvha7i4o.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableIntTest.testAddValueObject",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),48901,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2cu6v3s11qd(){try{__CLR4_5_211nj11njlvha7i4o.R.inc(48901);
        __CLR4_5_211nj11njlvha7i4o.R.inc(48902);final MutableInt mutNum = new MutableInt(1);
        __CLR4_5_211nj11njlvha7i4o.R.inc(48903);mutNum.add(Integer.valueOf(1));
        
        __CLR4_5_211nj11njlvha7i4o.R.inc(48904);assertEquals(2, mutNum.intValue());
        __CLR4_5_211nj11njlvha7i4o.R.inc(48905);assertEquals(2L, mutNum.longValue());
    }finally{__CLR4_5_211nj11njlvha7i4o.R.flushNeeded();}}

    @Test
    public void testGetAndAddValuePrimitive() {__CLR4_5_211nj11njlvha7i4o.R.globalSliceStart(getClass().getName(),48906);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n5m0b11qi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_211nj11njlvha7i4o.R.rethrow($CLV_t2$);}finally{__CLR4_5_211nj11njlvha7i4o.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableIntTest.testGetAndAddValuePrimitive",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),48906,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n5m0b11qi(){try{__CLR4_5_211nj11njlvha7i4o.R.inc(48906);
        __CLR4_5_211nj11njlvha7i4o.R.inc(48907);final MutableInt mutableInteger = new MutableInt(0);
        __CLR4_5_211nj11njlvha7i4o.R.inc(48908);final int result = mutableInteger.getAndAdd(1);

        __CLR4_5_211nj11njlvha7i4o.R.inc(48909);assertEquals(0, result);
        __CLR4_5_211nj11njlvha7i4o.R.inc(48910);assertEquals(1, mutableInteger.intValue());
    }finally{__CLR4_5_211nj11njlvha7i4o.R.flushNeeded();}}

    @Test
    public void testGetAndAddValueObject() {__CLR4_5_211nj11njlvha7i4o.R.globalSliceStart(getClass().getName(),48911);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2yzlrhl11qn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_211nj11njlvha7i4o.R.rethrow($CLV_t2$);}finally{__CLR4_5_211nj11njlvha7i4o.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableIntTest.testGetAndAddValueObject",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),48911,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2yzlrhl11qn(){try{__CLR4_5_211nj11njlvha7i4o.R.inc(48911);
        __CLR4_5_211nj11njlvha7i4o.R.inc(48912);final MutableInt mutableInteger = new MutableInt(0);
        __CLR4_5_211nj11njlvha7i4o.R.inc(48913);final int result = mutableInteger.getAndAdd(Integer.valueOf(1));

        __CLR4_5_211nj11njlvha7i4o.R.inc(48914);assertEquals(0, result);
        __CLR4_5_211nj11njlvha7i4o.R.inc(48915);assertEquals(1, mutableInteger.intValue());
    }finally{__CLR4_5_211nj11njlvha7i4o.R.flushNeeded();}}

    @Test
    public void testAddAndGetValuePrimitive() {__CLR4_5_211nj11njlvha7i4o.R.globalSliceStart(getClass().getName(),48916);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_211nwiz11qs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_211nj11njlvha7i4o.R.rethrow($CLV_t2$);}finally{__CLR4_5_211nj11njlvha7i4o.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableIntTest.testAddAndGetValuePrimitive",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),48916,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_211nwiz11qs(){try{__CLR4_5_211nj11njlvha7i4o.R.inc(48916);
        __CLR4_5_211nj11njlvha7i4o.R.inc(48917);final MutableInt mutableInteger = new MutableInt(0);
        __CLR4_5_211nj11njlvha7i4o.R.inc(48918);final int result = mutableInteger.addAndGet(1);

        __CLR4_5_211nj11njlvha7i4o.R.inc(48919);assertEquals(1, result);
        __CLR4_5_211nj11njlvha7i4o.R.inc(48920);assertEquals(1, mutableInteger.intValue());
    }finally{__CLR4_5_211nj11njlvha7i4o.R.flushNeeded();}}

    @Test
    public void testAddAndGetValueObject() {__CLR4_5_211nj11njlvha7i4o.R.globalSliceStart(getClass().getName(),48921);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24to31311qx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_211nj11njlvha7i4o.R.rethrow($CLV_t2$);}finally{__CLR4_5_211nj11njlvha7i4o.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableIntTest.testAddAndGetValueObject",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),48921,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24to31311qx(){try{__CLR4_5_211nj11njlvha7i4o.R.inc(48921);
        __CLR4_5_211nj11njlvha7i4o.R.inc(48922);final MutableInt mutableInteger = new MutableInt(0);
        __CLR4_5_211nj11njlvha7i4o.R.inc(48923);final int result = mutableInteger.addAndGet(Integer.valueOf(1));

        __CLR4_5_211nj11njlvha7i4o.R.inc(48924);assertEquals(1, result);
        __CLR4_5_211nj11njlvha7i4o.R.inc(48925);assertEquals(1, mutableInteger.intValue());
    }finally{__CLR4_5_211nj11njlvha7i4o.R.flushNeeded();}}

    @Test
    public void testSubtractValuePrimitive() {__CLR4_5_211nj11njlvha7i4o.R.globalSliceStart(getClass().getName(),48926);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2w07icj11r2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_211nj11njlvha7i4o.R.rethrow($CLV_t2$);}finally{__CLR4_5_211nj11njlvha7i4o.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableIntTest.testSubtractValuePrimitive",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),48926,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2w07icj11r2(){try{__CLR4_5_211nj11njlvha7i4o.R.inc(48926);
        __CLR4_5_211nj11njlvha7i4o.R.inc(48927);final MutableInt mutNum = new MutableInt(1);
        __CLR4_5_211nj11njlvha7i4o.R.inc(48928);mutNum.subtract(1);
        
        __CLR4_5_211nj11njlvha7i4o.R.inc(48929);assertEquals(0, mutNum.intValue());
        __CLR4_5_211nj11njlvha7i4o.R.inc(48930);assertEquals(0L, mutNum.longValue());
    }finally{__CLR4_5_211nj11njlvha7i4o.R.flushNeeded();}}

    @Test
    public void testSubtractValueObject() {__CLR4_5_211nj11njlvha7i4o.R.globalSliceStart(getClass().getName(),48931);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2xnns6p11r7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_211nj11njlvha7i4o.R.rethrow($CLV_t2$);}finally{__CLR4_5_211nj11njlvha7i4o.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableIntTest.testSubtractValueObject",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),48931,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2xnns6p11r7(){try{__CLR4_5_211nj11njlvha7i4o.R.inc(48931);
        __CLR4_5_211nj11njlvha7i4o.R.inc(48932);final MutableInt mutNum = new MutableInt(1);
        __CLR4_5_211nj11njlvha7i4o.R.inc(48933);mutNum.subtract(Integer.valueOf(1));
        
        __CLR4_5_211nj11njlvha7i4o.R.inc(48934);assertEquals(0, mutNum.intValue());
        __CLR4_5_211nj11njlvha7i4o.R.inc(48935);assertEquals(0L, mutNum.longValue());
    }finally{__CLR4_5_211nj11njlvha7i4o.R.flushNeeded();}}

    @Test
    public void testToString() {__CLR4_5_211nj11njlvha7i4o.R.globalSliceStart(getClass().getName(),48936);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hrxdid11rc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_211nj11njlvha7i4o.R.rethrow($CLV_t2$);}finally{__CLR4_5_211nj11njlvha7i4o.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableIntTest.testToString",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),48936,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hrxdid11rc(){try{__CLR4_5_211nj11njlvha7i4o.R.inc(48936);
        __CLR4_5_211nj11njlvha7i4o.R.inc(48937);assertEquals("0", new MutableInt(0).toString());
        __CLR4_5_211nj11njlvha7i4o.R.inc(48938);assertEquals("10", new MutableInt(10).toString());
        __CLR4_5_211nj11njlvha7i4o.R.inc(48939);assertEquals("-123", new MutableInt(-123).toString());
    }finally{__CLR4_5_211nj11njlvha7i4o.R.flushNeeded();}}

}
