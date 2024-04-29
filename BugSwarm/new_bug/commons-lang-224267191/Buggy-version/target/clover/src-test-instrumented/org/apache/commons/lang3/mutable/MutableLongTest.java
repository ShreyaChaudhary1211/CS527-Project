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
 * @see MutableLong
 */
public class MutableLongTest {static class __CLR4_5_211rg11rglvha7i4w{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172763741L,8589935092L,49083,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    // ----------------------------------------------------------------
    @Test
    public void testConstructors() {__CLR4_5_211rg11rglvha7i4w.R.globalSliceStart(getClass().getName(),48940);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2lwxahe11rg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_211rg11rglvha7i4w.R.rethrow($CLV_t2$);}finally{__CLR4_5_211rg11rglvha7i4w.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableLongTest.testConstructors",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),48940,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2lwxahe11rg(){try{__CLR4_5_211rg11rglvha7i4w.R.inc(48940);
        __CLR4_5_211rg11rglvha7i4w.R.inc(48941);assertEquals(0, new MutableLong().longValue());
        
        __CLR4_5_211rg11rglvha7i4w.R.inc(48942);assertEquals(1, new MutableLong(1).longValue());
        
        __CLR4_5_211rg11rglvha7i4w.R.inc(48943);assertEquals(2, new MutableLong(Long.valueOf(2)).longValue());
        __CLR4_5_211rg11rglvha7i4w.R.inc(48944);assertEquals(3, new MutableLong(new MutableLong(3)).longValue());

        __CLR4_5_211rg11rglvha7i4w.R.inc(48945);assertEquals(2, new MutableLong("2").longValue());

    }finally{__CLR4_5_211rg11rglvha7i4w.R.flushNeeded();}}

    @Test(expected=NullPointerException.class)
    public void testConstructorNull() {__CLR4_5_211rg11rglvha7i4w.R.globalSliceStart(getClass().getName(),48946);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hqkc8a11rm();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,67,111,110,115,116,114,117,99,116,111,114,78,117,108,108,58,32,91,78,117,108,108,80,111,105,110,116,101,114,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NullPointerException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_211rg11rglvha7i4w.R.rethrow($CLV_t2$);}finally{__CLR4_5_211rg11rglvha7i4w.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableLongTest.testConstructorNull",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),48946,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hqkc8a11rm(){try{__CLR4_5_211rg11rglvha7i4w.R.inc(48946);
        __CLR4_5_211rg11rglvha7i4w.R.inc(48947);new MutableLong((Number)null);
    }finally{__CLR4_5_211rg11rglvha7i4w.R.flushNeeded();}}

    @Test
    public void testGetSet() {__CLR4_5_211rg11rglvha7i4w.R.globalSliceStart(getClass().getName(),48948);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22wnvh711ro();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_211rg11rglvha7i4w.R.rethrow($CLV_t2$);}finally{__CLR4_5_211rg11rglvha7i4w.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableLongTest.testGetSet",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),48948,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22wnvh711ro(){try{__CLR4_5_211rg11rglvha7i4w.R.inc(48948);
        __CLR4_5_211rg11rglvha7i4w.R.inc(48949);final MutableLong mutNum = new MutableLong(0);
        __CLR4_5_211rg11rglvha7i4w.R.inc(48950);assertEquals(0, new MutableLong().longValue());
        __CLR4_5_211rg11rglvha7i4w.R.inc(48951);assertEquals(Long.valueOf(0), new MutableLong().getValue());
        
        __CLR4_5_211rg11rglvha7i4w.R.inc(48952);mutNum.setValue(1);
        __CLR4_5_211rg11rglvha7i4w.R.inc(48953);assertEquals(1, mutNum.longValue());
        __CLR4_5_211rg11rglvha7i4w.R.inc(48954);assertEquals(Long.valueOf(1), mutNum.getValue());
        
        __CLR4_5_211rg11rglvha7i4w.R.inc(48955);mutNum.setValue(Long.valueOf(2));
        __CLR4_5_211rg11rglvha7i4w.R.inc(48956);assertEquals(2, mutNum.longValue());
        __CLR4_5_211rg11rglvha7i4w.R.inc(48957);assertEquals(Long.valueOf(2), mutNum.getValue());
        
        __CLR4_5_211rg11rglvha7i4w.R.inc(48958);mutNum.setValue(new MutableLong(3));
        __CLR4_5_211rg11rglvha7i4w.R.inc(48959);assertEquals(3, mutNum.longValue());
        __CLR4_5_211rg11rglvha7i4w.R.inc(48960);assertEquals(Long.valueOf(3), mutNum.getValue());
    }finally{__CLR4_5_211rg11rglvha7i4w.R.flushNeeded();}}

    @Test(expected=NullPointerException.class)
    public void testSetNull() {__CLR4_5_211rg11rglvha7i4w.R.globalSliceStart(getClass().getName(),48961);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hciyri11s1();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,83,101,116,78,117,108,108,58,32,91,78,117,108,108,80,111,105,110,116,101,114,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NullPointerException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_211rg11rglvha7i4w.R.rethrow($CLV_t2$);}finally{__CLR4_5_211rg11rglvha7i4w.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableLongTest.testSetNull",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),48961,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hciyri11s1(){try{__CLR4_5_211rg11rglvha7i4w.R.inc(48961);
        __CLR4_5_211rg11rglvha7i4w.R.inc(48962);final MutableLong mutNum = new MutableLong(0);
        __CLR4_5_211rg11rglvha7i4w.R.inc(48963);mutNum.setValue(null);
    }finally{__CLR4_5_211rg11rglvha7i4w.R.flushNeeded();}}

    @Test
    public void testEquals() {__CLR4_5_211rg11rglvha7i4w.R.globalSliceStart(getClass().getName(),48964);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2s4e60811s4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_211rg11rglvha7i4w.R.rethrow($CLV_t2$);}finally{__CLR4_5_211rg11rglvha7i4w.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableLongTest.testEquals",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),48964,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2s4e60811s4(){try{__CLR4_5_211rg11rglvha7i4w.R.inc(48964);
        __CLR4_5_211rg11rglvha7i4w.R.inc(48965);final MutableLong mutNumA = new MutableLong(0);
        __CLR4_5_211rg11rglvha7i4w.R.inc(48966);final MutableLong mutNumB = new MutableLong(0);
        __CLR4_5_211rg11rglvha7i4w.R.inc(48967);final MutableLong mutNumC = new MutableLong(1);

        __CLR4_5_211rg11rglvha7i4w.R.inc(48968);assertTrue(mutNumA.equals(mutNumA));
        __CLR4_5_211rg11rglvha7i4w.R.inc(48969);assertTrue(mutNumA.equals(mutNumB));
        __CLR4_5_211rg11rglvha7i4w.R.inc(48970);assertTrue(mutNumB.equals(mutNumA));
        __CLR4_5_211rg11rglvha7i4w.R.inc(48971);assertTrue(mutNumB.equals(mutNumB));
        __CLR4_5_211rg11rglvha7i4w.R.inc(48972);assertFalse(mutNumA.equals(mutNumC));
        __CLR4_5_211rg11rglvha7i4w.R.inc(48973);assertFalse(mutNumB.equals(mutNumC));
        __CLR4_5_211rg11rglvha7i4w.R.inc(48974);assertTrue(mutNumC.equals(mutNumC));
        __CLR4_5_211rg11rglvha7i4w.R.inc(48975);assertFalse(mutNumA.equals(null));
        __CLR4_5_211rg11rglvha7i4w.R.inc(48976);assertFalse(mutNumA.equals(Long.valueOf(0)));
        __CLR4_5_211rg11rglvha7i4w.R.inc(48977);assertFalse(mutNumA.equals("0"));
    }finally{__CLR4_5_211rg11rglvha7i4w.R.flushNeeded();}}

    @Test
    public void testHashCode() {__CLR4_5_211rg11rglvha7i4w.R.globalSliceStart(getClass().getName(),48978);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23zkhv811si();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_211rg11rglvha7i4w.R.rethrow($CLV_t2$);}finally{__CLR4_5_211rg11rglvha7i4w.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableLongTest.testHashCode",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),48978,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23zkhv811si(){try{__CLR4_5_211rg11rglvha7i4w.R.inc(48978);
        __CLR4_5_211rg11rglvha7i4w.R.inc(48979);final MutableLong mutNumA = new MutableLong(0);
        __CLR4_5_211rg11rglvha7i4w.R.inc(48980);final MutableLong mutNumB = new MutableLong(0);
        __CLR4_5_211rg11rglvha7i4w.R.inc(48981);final MutableLong mutNumC = new MutableLong(1);

        __CLR4_5_211rg11rglvha7i4w.R.inc(48982);assertTrue(mutNumA.hashCode() == mutNumA.hashCode());
        __CLR4_5_211rg11rglvha7i4w.R.inc(48983);assertTrue(mutNumA.hashCode() == mutNumB.hashCode());
        __CLR4_5_211rg11rglvha7i4w.R.inc(48984);assertFalse(mutNumA.hashCode() == mutNumC.hashCode());
        __CLR4_5_211rg11rglvha7i4w.R.inc(48985);assertTrue(mutNumA.hashCode() == Long.valueOf(0).hashCode());
    }finally{__CLR4_5_211rg11rglvha7i4w.R.flushNeeded();}}

    @Test
    public void testCompareTo() {__CLR4_5_211rg11rglvha7i4w.R.globalSliceStart(getClass().getName(),48986);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2pz6vfv11sq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_211rg11rglvha7i4w.R.rethrow($CLV_t2$);}finally{__CLR4_5_211rg11rglvha7i4w.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableLongTest.testCompareTo",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),48986,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2pz6vfv11sq(){try{__CLR4_5_211rg11rglvha7i4w.R.inc(48986);
        __CLR4_5_211rg11rglvha7i4w.R.inc(48987);final MutableLong mutNum = new MutableLong(0);

        __CLR4_5_211rg11rglvha7i4w.R.inc(48988);assertEquals(0, mutNum.compareTo(new MutableLong(0)));
        __CLR4_5_211rg11rglvha7i4w.R.inc(48989);assertEquals(+1, mutNum.compareTo(new MutableLong(-1)));
        __CLR4_5_211rg11rglvha7i4w.R.inc(48990);assertEquals(-1, mutNum.compareTo(new MutableLong(1)));
    }finally{__CLR4_5_211rg11rglvha7i4w.R.flushNeeded();}}

    @Test(expected=NullPointerException.class)
    public void testCompareToNull() {__CLR4_5_211rg11rglvha7i4w.R.globalSliceStart(getClass().getName(),48991);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2g1nl0c11sv();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,67,111,109,112,97,114,101,84,111,78,117,108,108,58,32,91,78,117,108,108,80,111,105,110,116,101,114,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NullPointerException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_211rg11rglvha7i4w.R.rethrow($CLV_t2$);}finally{__CLR4_5_211rg11rglvha7i4w.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableLongTest.testCompareToNull",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),48991,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2g1nl0c11sv(){try{__CLR4_5_211rg11rglvha7i4w.R.inc(48991);
        __CLR4_5_211rg11rglvha7i4w.R.inc(48992);final MutableLong mutNum = new MutableLong(0);
        __CLR4_5_211rg11rglvha7i4w.R.inc(48993);mutNum.compareTo(null);
    }finally{__CLR4_5_211rg11rglvha7i4w.R.flushNeeded();}}

    @Test
    public void testPrimitiveValues() {__CLR4_5_211rg11rglvha7i4w.R.globalSliceStart(getClass().getName(),48994);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2uifry11sy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_211rg11rglvha7i4w.R.rethrow($CLV_t2$);}finally{__CLR4_5_211rg11rglvha7i4w.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableLongTest.testPrimitiveValues",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),48994,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2uifry11sy(){try{__CLR4_5_211rg11rglvha7i4w.R.inc(48994);
        __CLR4_5_211rg11rglvha7i4w.R.inc(48995);final MutableLong mutNum = new MutableLong(1L);

        __CLR4_5_211rg11rglvha7i4w.R.inc(48996);assertEquals( 1.0F, mutNum.floatValue(), 0 );
        __CLR4_5_211rg11rglvha7i4w.R.inc(48997);assertEquals( 1.0, mutNum.doubleValue(), 0 );
        __CLR4_5_211rg11rglvha7i4w.R.inc(48998);assertEquals( (byte) 1, mutNum.byteValue() );
        __CLR4_5_211rg11rglvha7i4w.R.inc(48999);assertEquals( (short) 1, mutNum.shortValue() );
        __CLR4_5_211rg11rglvha7i4w.R.inc(49000);assertEquals( 1, mutNum.intValue() );
        __CLR4_5_211rg11rglvha7i4w.R.inc(49001);assertEquals( 1L, mutNum.longValue() );
    }finally{__CLR4_5_211rg11rglvha7i4w.R.flushNeeded();}}

    @Test
    public void testToLong() {__CLR4_5_211rg11rglvha7i4w.R.globalSliceStart(getClass().getName(),49002);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2c1zoc011t6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_211rg11rglvha7i4w.R.rethrow($CLV_t2$);}finally{__CLR4_5_211rg11rglvha7i4w.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableLongTest.testToLong",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),49002,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2c1zoc011t6(){try{__CLR4_5_211rg11rglvha7i4w.R.inc(49002);
        __CLR4_5_211rg11rglvha7i4w.R.inc(49003);assertEquals(Long.valueOf(0L), new MutableLong(0L).toLong());
        __CLR4_5_211rg11rglvha7i4w.R.inc(49004);assertEquals(Long.valueOf(123L), new MutableLong(123L).toLong());
    }finally{__CLR4_5_211rg11rglvha7i4w.R.flushNeeded();}}

    @Test
    public void testIncrement() {__CLR4_5_211rg11rglvha7i4w.R.globalSliceStart(getClass().getName(),49005);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2m6qqn011t9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_211rg11rglvha7i4w.R.rethrow($CLV_t2$);}finally{__CLR4_5_211rg11rglvha7i4w.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableLongTest.testIncrement",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),49005,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2m6qqn011t9(){try{__CLR4_5_211rg11rglvha7i4w.R.inc(49005);
        __CLR4_5_211rg11rglvha7i4w.R.inc(49006);final MutableLong mutNum = new MutableLong(1);
        __CLR4_5_211rg11rglvha7i4w.R.inc(49007);mutNum.increment();
        
        __CLR4_5_211rg11rglvha7i4w.R.inc(49008);assertEquals(2, mutNum.intValue());
        __CLR4_5_211rg11rglvha7i4w.R.inc(49009);assertEquals(2L, mutNum.longValue());
    }finally{__CLR4_5_211rg11rglvha7i4w.R.flushNeeded();}}

    @Test
    public void testIncrementAndGet() {__CLR4_5_211rg11rglvha7i4w.R.globalSliceStart(getClass().getName(),49010);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2qa1xk311te();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_211rg11rglvha7i4w.R.rethrow($CLV_t2$);}finally{__CLR4_5_211rg11rglvha7i4w.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableLongTest.testIncrementAndGet",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),49010,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2qa1xk311te(){try{__CLR4_5_211rg11rglvha7i4w.R.inc(49010);
        __CLR4_5_211rg11rglvha7i4w.R.inc(49011);final MutableLong mutNum = new MutableLong(1L);
        __CLR4_5_211rg11rglvha7i4w.R.inc(49012);final long result = mutNum.incrementAndGet();

        __CLR4_5_211rg11rglvha7i4w.R.inc(49013);assertEquals(2, result);
        __CLR4_5_211rg11rglvha7i4w.R.inc(49014);assertEquals(2, mutNum.intValue());
        __CLR4_5_211rg11rglvha7i4w.R.inc(49015);assertEquals(2L, mutNum.longValue());
    }finally{__CLR4_5_211rg11rglvha7i4w.R.flushNeeded();}}

    @Test
    public void testGetAndIncrement() {__CLR4_5_211rg11rglvha7i4w.R.globalSliceStart(getClass().getName(),49016);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2f0tjtv11tk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_211rg11rglvha7i4w.R.rethrow($CLV_t2$);}finally{__CLR4_5_211rg11rglvha7i4w.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableLongTest.testGetAndIncrement",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),49016,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2f0tjtv11tk(){try{__CLR4_5_211rg11rglvha7i4w.R.inc(49016);
        __CLR4_5_211rg11rglvha7i4w.R.inc(49017);final MutableLong mutNum = new MutableLong(1L);
        __CLR4_5_211rg11rglvha7i4w.R.inc(49018);final long result = mutNum.getAndIncrement();

        __CLR4_5_211rg11rglvha7i4w.R.inc(49019);assertEquals(1, result);
        __CLR4_5_211rg11rglvha7i4w.R.inc(49020);assertEquals(2, mutNum.intValue());
        __CLR4_5_211rg11rglvha7i4w.R.inc(49021);assertEquals(2L, mutNum.longValue());
    }finally{__CLR4_5_211rg11rglvha7i4w.R.flushNeeded();}}

    @Test
    public void testDecrement() {__CLR4_5_211rg11rglvha7i4w.R.globalSliceStart(getClass().getName(),49022);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2pripmw11tq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_211rg11rglvha7i4w.R.rethrow($CLV_t2$);}finally{__CLR4_5_211rg11rglvha7i4w.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableLongTest.testDecrement",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),49022,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2pripmw11tq(){try{__CLR4_5_211rg11rglvha7i4w.R.inc(49022);
        __CLR4_5_211rg11rglvha7i4w.R.inc(49023);final MutableLong mutNum = new MutableLong(1);
        __CLR4_5_211rg11rglvha7i4w.R.inc(49024);mutNum.decrement();
        
        __CLR4_5_211rg11rglvha7i4w.R.inc(49025);assertEquals(0, mutNum.intValue());
        __CLR4_5_211rg11rglvha7i4w.R.inc(49026);assertEquals(0L, mutNum.longValue());
    }finally{__CLR4_5_211rg11rglvha7i4w.R.flushNeeded();}}

    @Test
    public void testDecrementAndGet() {__CLR4_5_211rg11rglvha7i4w.R.globalSliceStart(getClass().getName(),49027);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_272ukah11tv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_211rg11rglvha7i4w.R.rethrow($CLV_t2$);}finally{__CLR4_5_211rg11rglvha7i4w.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableLongTest.testDecrementAndGet",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),49027,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_272ukah11tv(){try{__CLR4_5_211rg11rglvha7i4w.R.inc(49027);
        __CLR4_5_211rg11rglvha7i4w.R.inc(49028);final MutableLong mutNum = new MutableLong(1L);
        __CLR4_5_211rg11rglvha7i4w.R.inc(49029);final long result = mutNum.decrementAndGet();

        __CLR4_5_211rg11rglvha7i4w.R.inc(49030);assertEquals(0, result);
        __CLR4_5_211rg11rglvha7i4w.R.inc(49031);assertEquals(0, mutNum.intValue());
        __CLR4_5_211rg11rglvha7i4w.R.inc(49032);assertEquals(0L, mutNum.longValue());
    }finally{__CLR4_5_211rg11rglvha7i4w.R.flushNeeded();}}

    @Test
    public void testGetAndDecrement() {__CLR4_5_211rg11rglvha7i4w.R.globalSliceStart(getClass().getName(),49033);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28211vd11u1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_211rg11rglvha7i4w.R.rethrow($CLV_t2$);}finally{__CLR4_5_211rg11rglvha7i4w.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableLongTest.testGetAndDecrement",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),49033,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28211vd11u1(){try{__CLR4_5_211rg11rglvha7i4w.R.inc(49033);
        __CLR4_5_211rg11rglvha7i4w.R.inc(49034);final MutableLong mutNum = new MutableLong(1L);
        __CLR4_5_211rg11rglvha7i4w.R.inc(49035);final long result = mutNum.getAndDecrement();

        __CLR4_5_211rg11rglvha7i4w.R.inc(49036);assertEquals(1, result);
        __CLR4_5_211rg11rglvha7i4w.R.inc(49037);assertEquals(0, mutNum.intValue());
        __CLR4_5_211rg11rglvha7i4w.R.inc(49038);assertEquals(0L, mutNum.longValue());
    }finally{__CLR4_5_211rg11rglvha7i4w.R.flushNeeded();}}

    @Test
    public void testAddValuePrimitive() {__CLR4_5_211rg11rglvha7i4w.R.globalSliceStart(getClass().getName(),49039);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2nrme6s11u7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_211rg11rglvha7i4w.R.rethrow($CLV_t2$);}finally{__CLR4_5_211rg11rglvha7i4w.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableLongTest.testAddValuePrimitive",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),49039,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2nrme6s11u7(){try{__CLR4_5_211rg11rglvha7i4w.R.inc(49039);
        __CLR4_5_211rg11rglvha7i4w.R.inc(49040);final MutableLong mutNum = new MutableLong(1);
        __CLR4_5_211rg11rglvha7i4w.R.inc(49041);mutNum.add(1);
        
        __CLR4_5_211rg11rglvha7i4w.R.inc(49042);assertEquals(2, mutNum.intValue());
        __CLR4_5_211rg11rglvha7i4w.R.inc(49043);assertEquals(2L, mutNum.longValue());
    }finally{__CLR4_5_211rg11rglvha7i4w.R.flushNeeded();}}

    @Test
    public void testAddValueObject() {__CLR4_5_211rg11rglvha7i4w.R.globalSliceStart(getClass().getName(),49044);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2cu6v3s11uc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_211rg11rglvha7i4w.R.rethrow($CLV_t2$);}finally{__CLR4_5_211rg11rglvha7i4w.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableLongTest.testAddValueObject",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),49044,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2cu6v3s11uc(){try{__CLR4_5_211rg11rglvha7i4w.R.inc(49044);
        __CLR4_5_211rg11rglvha7i4w.R.inc(49045);final MutableLong mutNum = new MutableLong(1);
        __CLR4_5_211rg11rglvha7i4w.R.inc(49046);mutNum.add(Long.valueOf(1));
        
        __CLR4_5_211rg11rglvha7i4w.R.inc(49047);assertEquals(2, mutNum.intValue());
        __CLR4_5_211rg11rglvha7i4w.R.inc(49048);assertEquals(2L, mutNum.longValue());
    }finally{__CLR4_5_211rg11rglvha7i4w.R.flushNeeded();}}

    @Test
    public void testGetAndAddValuePrimitive() {__CLR4_5_211rg11rglvha7i4w.R.globalSliceStart(getClass().getName(),49049);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n5m0b11uh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_211rg11rglvha7i4w.R.rethrow($CLV_t2$);}finally{__CLR4_5_211rg11rglvha7i4w.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableLongTest.testGetAndAddValuePrimitive",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),49049,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n5m0b11uh(){try{__CLR4_5_211rg11rglvha7i4w.R.inc(49049);
        __CLR4_5_211rg11rglvha7i4w.R.inc(49050);final MutableLong mutableLong = new MutableLong(0L);
        __CLR4_5_211rg11rglvha7i4w.R.inc(49051);final long result = mutableLong.getAndAdd(1L);

        __CLR4_5_211rg11rglvha7i4w.R.inc(49052);assertEquals(0L, result);
        __CLR4_5_211rg11rglvha7i4w.R.inc(49053);assertEquals(1L, mutableLong.longValue());
    }finally{__CLR4_5_211rg11rglvha7i4w.R.flushNeeded();}}

    @Test
    public void testGetAndAddValueObject() {__CLR4_5_211rg11rglvha7i4w.R.globalSliceStart(getClass().getName(),49054);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2yzlrhl11um();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_211rg11rglvha7i4w.R.rethrow($CLV_t2$);}finally{__CLR4_5_211rg11rglvha7i4w.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableLongTest.testGetAndAddValueObject",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),49054,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2yzlrhl11um(){try{__CLR4_5_211rg11rglvha7i4w.R.inc(49054);
        __CLR4_5_211rg11rglvha7i4w.R.inc(49055);final MutableLong mutableLong = new MutableLong(0L);
        __CLR4_5_211rg11rglvha7i4w.R.inc(49056);final long result = mutableLong.getAndAdd(Long.valueOf(1L));

        __CLR4_5_211rg11rglvha7i4w.R.inc(49057);assertEquals(0L, result);
        __CLR4_5_211rg11rglvha7i4w.R.inc(49058);assertEquals(1L, mutableLong.longValue());
    }finally{__CLR4_5_211rg11rglvha7i4w.R.flushNeeded();}}

    @Test
    public void testAddAndGetValuePrimitive() {__CLR4_5_211rg11rglvha7i4w.R.globalSliceStart(getClass().getName(),49059);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_211nwiz11ur();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_211rg11rglvha7i4w.R.rethrow($CLV_t2$);}finally{__CLR4_5_211rg11rglvha7i4w.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableLongTest.testAddAndGetValuePrimitive",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),49059,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_211nwiz11ur(){try{__CLR4_5_211rg11rglvha7i4w.R.inc(49059);
        __CLR4_5_211rg11rglvha7i4w.R.inc(49060);final MutableLong mutableLong = new MutableLong(0L);
        __CLR4_5_211rg11rglvha7i4w.R.inc(49061);final long result = mutableLong.addAndGet(1L);

        __CLR4_5_211rg11rglvha7i4w.R.inc(49062);assertEquals(1L, result);
        __CLR4_5_211rg11rglvha7i4w.R.inc(49063);assertEquals(1L, mutableLong.longValue());
    }finally{__CLR4_5_211rg11rglvha7i4w.R.flushNeeded();}}

    @Test
    public void testAddAndGetValueObject() {__CLR4_5_211rg11rglvha7i4w.R.globalSliceStart(getClass().getName(),49064);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24to31311uw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_211rg11rglvha7i4w.R.rethrow($CLV_t2$);}finally{__CLR4_5_211rg11rglvha7i4w.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableLongTest.testAddAndGetValueObject",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),49064,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24to31311uw(){try{__CLR4_5_211rg11rglvha7i4w.R.inc(49064);
        __CLR4_5_211rg11rglvha7i4w.R.inc(49065);final MutableLong mutableLong = new MutableLong(0L);
        __CLR4_5_211rg11rglvha7i4w.R.inc(49066);final long result = mutableLong.addAndGet(Long.valueOf(1L));

        __CLR4_5_211rg11rglvha7i4w.R.inc(49067);assertEquals(1L, result);
        __CLR4_5_211rg11rglvha7i4w.R.inc(49068);assertEquals(1L, mutableLong.longValue());
    }finally{__CLR4_5_211rg11rglvha7i4w.R.flushNeeded();}}

    @Test
    public void testSubtractValuePrimitive() {__CLR4_5_211rg11rglvha7i4w.R.globalSliceStart(getClass().getName(),49069);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2w07icj11v1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_211rg11rglvha7i4w.R.rethrow($CLV_t2$);}finally{__CLR4_5_211rg11rglvha7i4w.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableLongTest.testSubtractValuePrimitive",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),49069,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2w07icj11v1(){try{__CLR4_5_211rg11rglvha7i4w.R.inc(49069);
        __CLR4_5_211rg11rglvha7i4w.R.inc(49070);final MutableLong mutNum = new MutableLong(1);
        __CLR4_5_211rg11rglvha7i4w.R.inc(49071);mutNum.subtract(1);
        
        __CLR4_5_211rg11rglvha7i4w.R.inc(49072);assertEquals(0, mutNum.intValue());
        __CLR4_5_211rg11rglvha7i4w.R.inc(49073);assertEquals(0L, mutNum.longValue());
    }finally{__CLR4_5_211rg11rglvha7i4w.R.flushNeeded();}}

    @Test
    public void testSubtractValueObject() {__CLR4_5_211rg11rglvha7i4w.R.globalSliceStart(getClass().getName(),49074);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2xnns6p11v6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_211rg11rglvha7i4w.R.rethrow($CLV_t2$);}finally{__CLR4_5_211rg11rglvha7i4w.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableLongTest.testSubtractValueObject",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),49074,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2xnns6p11v6(){try{__CLR4_5_211rg11rglvha7i4w.R.inc(49074);
        __CLR4_5_211rg11rglvha7i4w.R.inc(49075);final MutableLong mutNum = new MutableLong(1);
        __CLR4_5_211rg11rglvha7i4w.R.inc(49076);mutNum.subtract(Long.valueOf(1));
        
        __CLR4_5_211rg11rglvha7i4w.R.inc(49077);assertEquals(0, mutNum.intValue());
        __CLR4_5_211rg11rglvha7i4w.R.inc(49078);assertEquals(0L, mutNum.longValue());
    }finally{__CLR4_5_211rg11rglvha7i4w.R.flushNeeded();}}

    @Test
    public void testToString() {__CLR4_5_211rg11rglvha7i4w.R.globalSliceStart(getClass().getName(),49079);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hrxdid11vb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_211rg11rglvha7i4w.R.rethrow($CLV_t2$);}finally{__CLR4_5_211rg11rglvha7i4w.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableLongTest.testToString",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),49079,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hrxdid11vb(){try{__CLR4_5_211rg11rglvha7i4w.R.inc(49079);
        __CLR4_5_211rg11rglvha7i4w.R.inc(49080);assertEquals("0", new MutableLong(0).toString());
        __CLR4_5_211rg11rglvha7i4w.R.inc(49081);assertEquals("10", new MutableLong(10).toString());
        __CLR4_5_211rg11rglvha7i4w.R.inc(49082);assertEquals("-123", new MutableLong(-123).toString());
    }finally{__CLR4_5_211rg11rglvha7i4w.R.flushNeeded();}}

}
