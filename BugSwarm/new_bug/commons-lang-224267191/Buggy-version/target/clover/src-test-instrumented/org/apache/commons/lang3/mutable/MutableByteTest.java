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
 * @see MutableByte
 */
public class MutableByteTest {static class __CLR4_5_211bk11bklvha7i1q{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172763741L,8589935092L,48507,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    // ----------------------------------------------------------------
    @Test
    public void testConstructors() {__CLR4_5_211bk11bklvha7i1q.R.globalSliceStart(getClass().getName(),48368);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2lwxahe11bk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_211bk11bklvha7i1q.R.rethrow($CLV_t2$);}finally{__CLR4_5_211bk11bklvha7i1q.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableByteTest.testConstructors",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),48368,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2lwxahe11bk(){try{__CLR4_5_211bk11bklvha7i1q.R.inc(48368);
        __CLR4_5_211bk11bklvha7i1q.R.inc(48369);assertEquals((byte) 0, new MutableByte().byteValue());
        
        __CLR4_5_211bk11bklvha7i1q.R.inc(48370);assertEquals((byte) 1, new MutableByte((byte) 1).byteValue());
        
        __CLR4_5_211bk11bklvha7i1q.R.inc(48371);assertEquals((byte) 2, new MutableByte(Byte.valueOf((byte) 2)).byteValue());
        __CLR4_5_211bk11bklvha7i1q.R.inc(48372);assertEquals((byte) 3, new MutableByte(new MutableByte((byte) 3)).byteValue());

        __CLR4_5_211bk11bklvha7i1q.R.inc(48373);assertEquals((byte) 2, new MutableByte("2").byteValue());

    }finally{__CLR4_5_211bk11bklvha7i1q.R.flushNeeded();}}

    @Test(expected=NullPointerException.class)
    public void testConstructorNull() {__CLR4_5_211bk11bklvha7i1q.R.globalSliceStart(getClass().getName(),48374);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hqkc8a11bq();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,67,111,110,115,116,114,117,99,116,111,114,78,117,108,108,58,32,91,78,117,108,108,80,111,105,110,116,101,114,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NullPointerException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_211bk11bklvha7i1q.R.rethrow($CLV_t2$);}finally{__CLR4_5_211bk11bklvha7i1q.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableByteTest.testConstructorNull",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),48374,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hqkc8a11bq(){try{__CLR4_5_211bk11bklvha7i1q.R.inc(48374);
        __CLR4_5_211bk11bklvha7i1q.R.inc(48375);new MutableByte((Number)null);
    }finally{__CLR4_5_211bk11bklvha7i1q.R.flushNeeded();}}

    @Test
    public void testGetSet() {__CLR4_5_211bk11bklvha7i1q.R.globalSliceStart(getClass().getName(),48376);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22wnvh711bs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_211bk11bklvha7i1q.R.rethrow($CLV_t2$);}finally{__CLR4_5_211bk11bklvha7i1q.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableByteTest.testGetSet",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),48376,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22wnvh711bs(){try{__CLR4_5_211bk11bklvha7i1q.R.inc(48376);
        __CLR4_5_211bk11bklvha7i1q.R.inc(48377);final MutableByte mutNum = new MutableByte((byte) 0);
        __CLR4_5_211bk11bklvha7i1q.R.inc(48378);assertEquals((byte) 0, new MutableByte().byteValue());
        __CLR4_5_211bk11bklvha7i1q.R.inc(48379);assertEquals(Byte.valueOf((byte) 0), new MutableByte().getValue());
        
        __CLR4_5_211bk11bklvha7i1q.R.inc(48380);mutNum.setValue((byte) 1);
        __CLR4_5_211bk11bklvha7i1q.R.inc(48381);assertEquals((byte) 1, mutNum.byteValue());
        __CLR4_5_211bk11bklvha7i1q.R.inc(48382);assertEquals(Byte.valueOf((byte) 1), mutNum.getValue());
        
        __CLR4_5_211bk11bklvha7i1q.R.inc(48383);mutNum.setValue(Byte.valueOf((byte) 2));
        __CLR4_5_211bk11bklvha7i1q.R.inc(48384);assertEquals((byte) 2, mutNum.byteValue());
        __CLR4_5_211bk11bklvha7i1q.R.inc(48385);assertEquals(Byte.valueOf((byte) 2), mutNum.getValue());
        
        __CLR4_5_211bk11bklvha7i1q.R.inc(48386);mutNum.setValue(new MutableByte((byte) 3));
        __CLR4_5_211bk11bklvha7i1q.R.inc(48387);assertEquals((byte) 3, mutNum.byteValue());
        __CLR4_5_211bk11bklvha7i1q.R.inc(48388);assertEquals(Byte.valueOf((byte) 3), mutNum.getValue());
    }finally{__CLR4_5_211bk11bklvha7i1q.R.flushNeeded();}}

    @Test(expected=NullPointerException.class)
    public void testSetNull() {__CLR4_5_211bk11bklvha7i1q.R.globalSliceStart(getClass().getName(),48389);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hciyri11c5();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,83,101,116,78,117,108,108,58,32,91,78,117,108,108,80,111,105,110,116,101,114,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NullPointerException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_211bk11bklvha7i1q.R.rethrow($CLV_t2$);}finally{__CLR4_5_211bk11bklvha7i1q.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableByteTest.testSetNull",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),48389,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hciyri11c5(){try{__CLR4_5_211bk11bklvha7i1q.R.inc(48389);
        __CLR4_5_211bk11bklvha7i1q.R.inc(48390);final MutableByte mutNum = new MutableByte((byte) 0);
        __CLR4_5_211bk11bklvha7i1q.R.inc(48391);mutNum.setValue(null);
    }finally{__CLR4_5_211bk11bklvha7i1q.R.flushNeeded();}}

    @Test
    public void testEquals() {__CLR4_5_211bk11bklvha7i1q.R.globalSliceStart(getClass().getName(),48392);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2s4e60811c8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_211bk11bklvha7i1q.R.rethrow($CLV_t2$);}finally{__CLR4_5_211bk11bklvha7i1q.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableByteTest.testEquals",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),48392,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2s4e60811c8(){try{__CLR4_5_211bk11bklvha7i1q.R.inc(48392);
        __CLR4_5_211bk11bklvha7i1q.R.inc(48393);final MutableByte mutNumA = new MutableByte((byte) 0);
        __CLR4_5_211bk11bklvha7i1q.R.inc(48394);final MutableByte mutNumB = new MutableByte((byte) 0);
        __CLR4_5_211bk11bklvha7i1q.R.inc(48395);final MutableByte mutNumC = new MutableByte((byte) 1);

        __CLR4_5_211bk11bklvha7i1q.R.inc(48396);assertTrue(mutNumA.equals(mutNumA));
        __CLR4_5_211bk11bklvha7i1q.R.inc(48397);assertTrue(mutNumA.equals(mutNumB));
        __CLR4_5_211bk11bklvha7i1q.R.inc(48398);assertTrue(mutNumB.equals(mutNumA));
        __CLR4_5_211bk11bklvha7i1q.R.inc(48399);assertTrue(mutNumB.equals(mutNumB));
        __CLR4_5_211bk11bklvha7i1q.R.inc(48400);assertFalse(mutNumA.equals(mutNumC));
        __CLR4_5_211bk11bklvha7i1q.R.inc(48401);assertFalse(mutNumB.equals(mutNumC));
        __CLR4_5_211bk11bklvha7i1q.R.inc(48402);assertTrue(mutNumC.equals(mutNumC));
        __CLR4_5_211bk11bklvha7i1q.R.inc(48403);assertFalse(mutNumA.equals(null));
        __CLR4_5_211bk11bklvha7i1q.R.inc(48404);assertFalse(mutNumA.equals(Byte.valueOf((byte) 0)));
        __CLR4_5_211bk11bklvha7i1q.R.inc(48405);assertFalse(mutNumA.equals("0"));
    }finally{__CLR4_5_211bk11bklvha7i1q.R.flushNeeded();}}

    @Test
    public void testHashCode() {__CLR4_5_211bk11bklvha7i1q.R.globalSliceStart(getClass().getName(),48406);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23zkhv811cm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_211bk11bklvha7i1q.R.rethrow($CLV_t2$);}finally{__CLR4_5_211bk11bklvha7i1q.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableByteTest.testHashCode",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),48406,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23zkhv811cm(){try{__CLR4_5_211bk11bklvha7i1q.R.inc(48406);
        __CLR4_5_211bk11bklvha7i1q.R.inc(48407);final MutableByte mutNumA = new MutableByte((byte) 0);
        __CLR4_5_211bk11bklvha7i1q.R.inc(48408);final MutableByte mutNumB = new MutableByte((byte) 0);
        __CLR4_5_211bk11bklvha7i1q.R.inc(48409);final MutableByte mutNumC = new MutableByte((byte) 1);

        __CLR4_5_211bk11bklvha7i1q.R.inc(48410);assertTrue(mutNumA.hashCode() == mutNumA.hashCode());
        __CLR4_5_211bk11bklvha7i1q.R.inc(48411);assertTrue(mutNumA.hashCode() == mutNumB.hashCode());
        __CLR4_5_211bk11bklvha7i1q.R.inc(48412);assertFalse(mutNumA.hashCode() == mutNumC.hashCode());
        __CLR4_5_211bk11bklvha7i1q.R.inc(48413);assertTrue(mutNumA.hashCode() == Byte.valueOf((byte) 0).hashCode());
    }finally{__CLR4_5_211bk11bklvha7i1q.R.flushNeeded();}}

    @Test
    public void testCompareTo() {__CLR4_5_211bk11bklvha7i1q.R.globalSliceStart(getClass().getName(),48414);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2pz6vfv11cu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_211bk11bklvha7i1q.R.rethrow($CLV_t2$);}finally{__CLR4_5_211bk11bklvha7i1q.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableByteTest.testCompareTo",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),48414,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2pz6vfv11cu(){try{__CLR4_5_211bk11bklvha7i1q.R.inc(48414);
        __CLR4_5_211bk11bklvha7i1q.R.inc(48415);final MutableByte mutNum = new MutableByte((byte) 0);

        __CLR4_5_211bk11bklvha7i1q.R.inc(48416);assertEquals((byte) 0, mutNum.compareTo(new MutableByte((byte) 0)));
        __CLR4_5_211bk11bklvha7i1q.R.inc(48417);assertEquals((byte) +1, mutNum.compareTo(new MutableByte((byte) -1)));
        __CLR4_5_211bk11bklvha7i1q.R.inc(48418);assertEquals((byte) -1, mutNum.compareTo(new MutableByte((byte) 1)));
    }finally{__CLR4_5_211bk11bklvha7i1q.R.flushNeeded();}}

    @Test(expected=NullPointerException.class)
    public void testCompareToNull() {__CLR4_5_211bk11bklvha7i1q.R.globalSliceStart(getClass().getName(),48419);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2g1nl0c11cz();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,67,111,109,112,97,114,101,84,111,78,117,108,108,58,32,91,78,117,108,108,80,111,105,110,116,101,114,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NullPointerException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_211bk11bklvha7i1q.R.rethrow($CLV_t2$);}finally{__CLR4_5_211bk11bklvha7i1q.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableByteTest.testCompareToNull",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),48419,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2g1nl0c11cz(){try{__CLR4_5_211bk11bklvha7i1q.R.inc(48419);
        __CLR4_5_211bk11bklvha7i1q.R.inc(48420);final MutableByte mutNum = new MutableByte((byte) 0);
        __CLR4_5_211bk11bklvha7i1q.R.inc(48421);mutNum.compareTo(null);
    }finally{__CLR4_5_211bk11bklvha7i1q.R.flushNeeded();}}

    @Test
    public void testPrimitiveValues() {__CLR4_5_211bk11bklvha7i1q.R.globalSliceStart(getClass().getName(),48422);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2uifry11d2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_211bk11bklvha7i1q.R.rethrow($CLV_t2$);}finally{__CLR4_5_211bk11bklvha7i1q.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableByteTest.testPrimitiveValues",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),48422,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2uifry11d2(){try{__CLR4_5_211bk11bklvha7i1q.R.inc(48422);
        __CLR4_5_211bk11bklvha7i1q.R.inc(48423);final MutableByte mutNum = new MutableByte( (byte) 1 );
        
        __CLR4_5_211bk11bklvha7i1q.R.inc(48424);assertEquals( 1.0F, mutNum.floatValue(), 0 );
        __CLR4_5_211bk11bklvha7i1q.R.inc(48425);assertEquals( 1.0, mutNum.doubleValue(), 0 );
        __CLR4_5_211bk11bklvha7i1q.R.inc(48426);assertEquals( (byte) 1, mutNum.byteValue() );
        __CLR4_5_211bk11bklvha7i1q.R.inc(48427);assertEquals( (short) 1, mutNum.shortValue() );
        __CLR4_5_211bk11bklvha7i1q.R.inc(48428);assertEquals( 1, mutNum.intValue() );
        __CLR4_5_211bk11bklvha7i1q.R.inc(48429);assertEquals( 1L, mutNum.longValue() );
    }finally{__CLR4_5_211bk11bklvha7i1q.R.flushNeeded();}}

    @Test
    public void testToByte() {__CLR4_5_211bk11bklvha7i1q.R.globalSliceStart(getClass().getName(),48430);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2s2gao411da();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_211bk11bklvha7i1q.R.rethrow($CLV_t2$);}finally{__CLR4_5_211bk11bklvha7i1q.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableByteTest.testToByte",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),48430,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2s2gao411da(){try{__CLR4_5_211bk11bklvha7i1q.R.inc(48430);
        __CLR4_5_211bk11bklvha7i1q.R.inc(48431);assertEquals(Byte.valueOf((byte) 0), new MutableByte((byte) 0).toByte());
        __CLR4_5_211bk11bklvha7i1q.R.inc(48432);assertEquals(Byte.valueOf((byte) 123), new MutableByte((byte) 123).toByte());
    }finally{__CLR4_5_211bk11bklvha7i1q.R.flushNeeded();}}

    @Test
    public void testIncrement() {__CLR4_5_211bk11bklvha7i1q.R.globalSliceStart(getClass().getName(),48433);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2m6qqn011dd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_211bk11bklvha7i1q.R.rethrow($CLV_t2$);}finally{__CLR4_5_211bk11bklvha7i1q.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableByteTest.testIncrement",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),48433,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2m6qqn011dd(){try{__CLR4_5_211bk11bklvha7i1q.R.inc(48433);
        __CLR4_5_211bk11bklvha7i1q.R.inc(48434);final MutableByte mutNum = new MutableByte((byte) 1);
        __CLR4_5_211bk11bklvha7i1q.R.inc(48435);mutNum.increment();
        
        __CLR4_5_211bk11bklvha7i1q.R.inc(48436);assertEquals(2, mutNum.intValue());
        __CLR4_5_211bk11bklvha7i1q.R.inc(48437);assertEquals(2L, mutNum.longValue());
    }finally{__CLR4_5_211bk11bklvha7i1q.R.flushNeeded();}}

    @Test
    public void testIncrementAndGet() {__CLR4_5_211bk11bklvha7i1q.R.globalSliceStart(getClass().getName(),48438);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2qa1xk311di();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_211bk11bklvha7i1q.R.rethrow($CLV_t2$);}finally{__CLR4_5_211bk11bklvha7i1q.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableByteTest.testIncrementAndGet",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),48438,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2qa1xk311di(){try{__CLR4_5_211bk11bklvha7i1q.R.inc(48438);
        __CLR4_5_211bk11bklvha7i1q.R.inc(48439);final MutableByte mutNum = new MutableByte((byte) 1);
        __CLR4_5_211bk11bklvha7i1q.R.inc(48440);final byte result = mutNum.incrementAndGet();

        __CLR4_5_211bk11bklvha7i1q.R.inc(48441);assertEquals(2, result);
        __CLR4_5_211bk11bklvha7i1q.R.inc(48442);assertEquals(2, mutNum.intValue());
        __CLR4_5_211bk11bklvha7i1q.R.inc(48443);assertEquals(2L, mutNum.longValue());
    }finally{__CLR4_5_211bk11bklvha7i1q.R.flushNeeded();}}

    @Test
    public void testGetAndIncrement() {__CLR4_5_211bk11bklvha7i1q.R.globalSliceStart(getClass().getName(),48444);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2f0tjtv11do();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_211bk11bklvha7i1q.R.rethrow($CLV_t2$);}finally{__CLR4_5_211bk11bklvha7i1q.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableByteTest.testGetAndIncrement",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),48444,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2f0tjtv11do(){try{__CLR4_5_211bk11bklvha7i1q.R.inc(48444);
        __CLR4_5_211bk11bklvha7i1q.R.inc(48445);final MutableByte mutNum = new MutableByte((byte) 1);
        __CLR4_5_211bk11bklvha7i1q.R.inc(48446);final byte result = mutNum.getAndIncrement();

        __CLR4_5_211bk11bklvha7i1q.R.inc(48447);assertEquals(1, result);
        __CLR4_5_211bk11bklvha7i1q.R.inc(48448);assertEquals(2, mutNum.intValue());
        __CLR4_5_211bk11bklvha7i1q.R.inc(48449);assertEquals(2L, mutNum.longValue());
    }finally{__CLR4_5_211bk11bklvha7i1q.R.flushNeeded();}}

    @Test
    public void testDecrement() {__CLR4_5_211bk11bklvha7i1q.R.globalSliceStart(getClass().getName(),48450);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2pripmw11du();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_211bk11bklvha7i1q.R.rethrow($CLV_t2$);}finally{__CLR4_5_211bk11bklvha7i1q.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableByteTest.testDecrement",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),48450,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2pripmw11du(){try{__CLR4_5_211bk11bklvha7i1q.R.inc(48450);
        __CLR4_5_211bk11bklvha7i1q.R.inc(48451);final MutableByte mutNum = new MutableByte((byte) 1);
        __CLR4_5_211bk11bklvha7i1q.R.inc(48452);mutNum.decrement();
        
        __CLR4_5_211bk11bklvha7i1q.R.inc(48453);assertEquals(0, mutNum.intValue());
        __CLR4_5_211bk11bklvha7i1q.R.inc(48454);assertEquals(0L, mutNum.longValue());
    }finally{__CLR4_5_211bk11bklvha7i1q.R.flushNeeded();}}

    @Test
    public void testDecrementAndGet() {__CLR4_5_211bk11bklvha7i1q.R.globalSliceStart(getClass().getName(),48455);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_272ukah11dz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_211bk11bklvha7i1q.R.rethrow($CLV_t2$);}finally{__CLR4_5_211bk11bklvha7i1q.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableByteTest.testDecrementAndGet",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),48455,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_272ukah11dz(){try{__CLR4_5_211bk11bklvha7i1q.R.inc(48455);
        __CLR4_5_211bk11bklvha7i1q.R.inc(48456);final MutableByte mutNum = new MutableByte((byte) 1);
        __CLR4_5_211bk11bklvha7i1q.R.inc(48457);final byte result = mutNum.decrementAndGet();

        __CLR4_5_211bk11bklvha7i1q.R.inc(48458);assertEquals(0, result);
        __CLR4_5_211bk11bklvha7i1q.R.inc(48459);assertEquals(0, mutNum.intValue());
        __CLR4_5_211bk11bklvha7i1q.R.inc(48460);assertEquals(0L, mutNum.longValue());
    }finally{__CLR4_5_211bk11bklvha7i1q.R.flushNeeded();}}

    @Test
    public void testGetAndDecrement() {__CLR4_5_211bk11bklvha7i1q.R.globalSliceStart(getClass().getName(),48461);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28211vd11e5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_211bk11bklvha7i1q.R.rethrow($CLV_t2$);}finally{__CLR4_5_211bk11bklvha7i1q.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableByteTest.testGetAndDecrement",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),48461,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28211vd11e5(){try{__CLR4_5_211bk11bklvha7i1q.R.inc(48461);
        __CLR4_5_211bk11bklvha7i1q.R.inc(48462);final MutableByte mutNum = new MutableByte((byte) 1);
        __CLR4_5_211bk11bklvha7i1q.R.inc(48463);final byte result = mutNum.getAndDecrement();

        __CLR4_5_211bk11bklvha7i1q.R.inc(48464);assertEquals(1, result);
        __CLR4_5_211bk11bklvha7i1q.R.inc(48465);assertEquals(0, mutNum.intValue());
        __CLR4_5_211bk11bklvha7i1q.R.inc(48466);assertEquals(0L, mutNum.longValue());
    }finally{__CLR4_5_211bk11bklvha7i1q.R.flushNeeded();}}

    @Test
    public void testAddValuePrimitive() {__CLR4_5_211bk11bklvha7i1q.R.globalSliceStart(getClass().getName(),48467);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2nrme6s11eb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_211bk11bklvha7i1q.R.rethrow($CLV_t2$);}finally{__CLR4_5_211bk11bklvha7i1q.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableByteTest.testAddValuePrimitive",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),48467,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2nrme6s11eb(){try{__CLR4_5_211bk11bklvha7i1q.R.inc(48467);
        __CLR4_5_211bk11bklvha7i1q.R.inc(48468);final MutableByte mutNum = new MutableByte((byte) 1);
        __CLR4_5_211bk11bklvha7i1q.R.inc(48469);mutNum.add((byte)1);
        
        __CLR4_5_211bk11bklvha7i1q.R.inc(48470);assertEquals((byte) 2, mutNum.byteValue());
    }finally{__CLR4_5_211bk11bklvha7i1q.R.flushNeeded();}}

    @Test
    public void testAddValueObject() {__CLR4_5_211bk11bklvha7i1q.R.globalSliceStart(getClass().getName(),48471);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2cu6v3s11ef();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_211bk11bklvha7i1q.R.rethrow($CLV_t2$);}finally{__CLR4_5_211bk11bklvha7i1q.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableByteTest.testAddValueObject",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),48471,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2cu6v3s11ef(){try{__CLR4_5_211bk11bklvha7i1q.R.inc(48471);
        __CLR4_5_211bk11bklvha7i1q.R.inc(48472);final MutableByte mutNum = new MutableByte((byte) 1);
        __CLR4_5_211bk11bklvha7i1q.R.inc(48473);mutNum.add(Integer.valueOf(1));
        
        __CLR4_5_211bk11bklvha7i1q.R.inc(48474);assertEquals((byte) 2, mutNum.byteValue());
    }finally{__CLR4_5_211bk11bklvha7i1q.R.flushNeeded();}}

    @Test
    public void testGetAndAddValuePrimitive() {__CLR4_5_211bk11bklvha7i1q.R.globalSliceStart(getClass().getName(),48475);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n5m0b11ej();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_211bk11bklvha7i1q.R.rethrow($CLV_t2$);}finally{__CLR4_5_211bk11bklvha7i1q.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableByteTest.testGetAndAddValuePrimitive",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),48475,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n5m0b11ej(){try{__CLR4_5_211bk11bklvha7i1q.R.inc(48475);
        __CLR4_5_211bk11bklvha7i1q.R.inc(48476);final MutableByte mutableByte = new MutableByte((byte)0);
        __CLR4_5_211bk11bklvha7i1q.R.inc(48477);final byte result = mutableByte.getAndAdd((byte) 1);

        __CLR4_5_211bk11bklvha7i1q.R.inc(48478);assertEquals((byte) 0, result);
        __CLR4_5_211bk11bklvha7i1q.R.inc(48479);assertEquals((byte) 1, mutableByte.byteValue());
    }finally{__CLR4_5_211bk11bklvha7i1q.R.flushNeeded();}}

    @Test
    public void testGetAndAddValueObject() {__CLR4_5_211bk11bklvha7i1q.R.globalSliceStart(getClass().getName(),48480);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2yzlrhl11eo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_211bk11bklvha7i1q.R.rethrow($CLV_t2$);}finally{__CLR4_5_211bk11bklvha7i1q.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableByteTest.testGetAndAddValueObject",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),48480,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2yzlrhl11eo(){try{__CLR4_5_211bk11bklvha7i1q.R.inc(48480);
        __CLR4_5_211bk11bklvha7i1q.R.inc(48481);final MutableByte mutableByte = new MutableByte((byte)0);
        __CLR4_5_211bk11bklvha7i1q.R.inc(48482);final byte result = mutableByte.getAndAdd(Byte.valueOf((byte) 1));

        __CLR4_5_211bk11bklvha7i1q.R.inc(48483);assertEquals((byte) 0, result);
        __CLR4_5_211bk11bklvha7i1q.R.inc(48484);assertEquals((byte) 1, mutableByte.byteValue());
    }finally{__CLR4_5_211bk11bklvha7i1q.R.flushNeeded();}}

    @Test
    public void testAddAndGetValuePrimitive() {__CLR4_5_211bk11bklvha7i1q.R.globalSliceStart(getClass().getName(),48485);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_211nwiz11et();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_211bk11bklvha7i1q.R.rethrow($CLV_t2$);}finally{__CLR4_5_211bk11bklvha7i1q.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableByteTest.testAddAndGetValuePrimitive",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),48485,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_211nwiz11et(){try{__CLR4_5_211bk11bklvha7i1q.R.inc(48485);
        __CLR4_5_211bk11bklvha7i1q.R.inc(48486);final MutableByte mutableByte = new MutableByte((byte)0);
        __CLR4_5_211bk11bklvha7i1q.R.inc(48487);final byte result = mutableByte.addAndGet((byte) 1);

        __CLR4_5_211bk11bklvha7i1q.R.inc(48488);assertEquals((byte) 1, result);
        __CLR4_5_211bk11bklvha7i1q.R.inc(48489);assertEquals((byte) 1, mutableByte.byteValue());
    }finally{__CLR4_5_211bk11bklvha7i1q.R.flushNeeded();}}

    @Test
    public void testAddAndGetValueObject() {__CLR4_5_211bk11bklvha7i1q.R.globalSliceStart(getClass().getName(),48490);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24to31311ey();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_211bk11bklvha7i1q.R.rethrow($CLV_t2$);}finally{__CLR4_5_211bk11bklvha7i1q.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableByteTest.testAddAndGetValueObject",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),48490,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24to31311ey(){try{__CLR4_5_211bk11bklvha7i1q.R.inc(48490);
        __CLR4_5_211bk11bklvha7i1q.R.inc(48491);final MutableByte mutableByte = new MutableByte((byte)0);
        __CLR4_5_211bk11bklvha7i1q.R.inc(48492);final byte result = mutableByte.addAndGet(Byte.valueOf((byte) 1));

        __CLR4_5_211bk11bklvha7i1q.R.inc(48493);assertEquals((byte) 1, result);
        __CLR4_5_211bk11bklvha7i1q.R.inc(48494);assertEquals((byte) 1, mutableByte.byteValue());
    }finally{__CLR4_5_211bk11bklvha7i1q.R.flushNeeded();}}

    @Test
    public void testSubtractValuePrimitive() {__CLR4_5_211bk11bklvha7i1q.R.globalSliceStart(getClass().getName(),48495);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2w07icj11f3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_211bk11bklvha7i1q.R.rethrow($CLV_t2$);}finally{__CLR4_5_211bk11bklvha7i1q.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableByteTest.testSubtractValuePrimitive",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),48495,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2w07icj11f3(){try{__CLR4_5_211bk11bklvha7i1q.R.inc(48495);
        __CLR4_5_211bk11bklvha7i1q.R.inc(48496);final MutableByte mutNum = new MutableByte((byte) 1);
        __CLR4_5_211bk11bklvha7i1q.R.inc(48497);mutNum.subtract((byte) 1);
        
        __CLR4_5_211bk11bklvha7i1q.R.inc(48498);assertEquals((byte) 0, mutNum.byteValue());
    }finally{__CLR4_5_211bk11bklvha7i1q.R.flushNeeded();}}

    @Test
    public void testSubtractValueObject() {__CLR4_5_211bk11bklvha7i1q.R.globalSliceStart(getClass().getName(),48499);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2xnns6p11f7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_211bk11bklvha7i1q.R.rethrow($CLV_t2$);}finally{__CLR4_5_211bk11bklvha7i1q.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableByteTest.testSubtractValueObject",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),48499,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2xnns6p11f7(){try{__CLR4_5_211bk11bklvha7i1q.R.inc(48499);
        __CLR4_5_211bk11bklvha7i1q.R.inc(48500);final MutableByte mutNum = new MutableByte((byte) 1);
        __CLR4_5_211bk11bklvha7i1q.R.inc(48501);mutNum.subtract(Integer.valueOf(1));
        
        __CLR4_5_211bk11bklvha7i1q.R.inc(48502);assertEquals((byte) 0, mutNum.byteValue());
    }finally{__CLR4_5_211bk11bklvha7i1q.R.flushNeeded();}}

    @Test
    public void testToString() {__CLR4_5_211bk11bklvha7i1q.R.globalSliceStart(getClass().getName(),48503);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hrxdid11fb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_211bk11bklvha7i1q.R.rethrow($CLV_t2$);}finally{__CLR4_5_211bk11bklvha7i1q.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableByteTest.testToString",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),48503,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hrxdid11fb(){try{__CLR4_5_211bk11bklvha7i1q.R.inc(48503);
        __CLR4_5_211bk11bklvha7i1q.R.inc(48504);assertEquals("0", new MutableByte((byte) 0).toString());
        __CLR4_5_211bk11bklvha7i1q.R.inc(48505);assertEquals("10", new MutableByte((byte) 10).toString());
        __CLR4_5_211bk11bklvha7i1q.R.inc(48506);assertEquals("-123", new MutableByte((byte) -123).toString());
    }finally{__CLR4_5_211bk11bklvha7i1q.R.flushNeeded();}}

}
