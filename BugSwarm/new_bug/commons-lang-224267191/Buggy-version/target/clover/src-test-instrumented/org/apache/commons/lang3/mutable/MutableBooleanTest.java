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
 * @since 2.2
 * @see MutableBoolean
 */
public class MutableBooleanTest {static class __CLR4_5_2119o119olvha7hyw{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172763741L,8589935092L,48368,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testCompareTo() {__CLR4_5_2119o119olvha7hyw.R.globalSliceStart(getClass().getName(),48300);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2pz6vfv119o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2119o119olvha7hyw.R.rethrow($CLV_t2$);}finally{__CLR4_5_2119o119olvha7hyw.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableBooleanTest.testCompareTo",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),48300,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2pz6vfv119o(){try{__CLR4_5_2119o119olvha7hyw.R.inc(48300);
        __CLR4_5_2119o119olvha7hyw.R.inc(48301);final MutableBoolean mutBool = new MutableBoolean(false);

        __CLR4_5_2119o119olvha7hyw.R.inc(48302);assertEquals(0, mutBool.compareTo(new MutableBoolean(false)));
        __CLR4_5_2119o119olvha7hyw.R.inc(48303);assertEquals(-1, mutBool.compareTo(new MutableBoolean(true)));
        __CLR4_5_2119o119olvha7hyw.R.inc(48304);mutBool.setValue(true);
        __CLR4_5_2119o119olvha7hyw.R.inc(48305);assertEquals(+1, mutBool.compareTo(new MutableBoolean(false)));
        __CLR4_5_2119o119olvha7hyw.R.inc(48306);assertEquals(0, mutBool.compareTo(new MutableBoolean(true)));
    }finally{__CLR4_5_2119o119olvha7hyw.R.flushNeeded();}}
    
    @Test(expected=NullPointerException.class)
    public void testCompareToNull() {__CLR4_5_2119o119olvha7hyw.R.globalSliceStart(getClass().getName(),48307);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2g1nl0c119v();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,67,111,109,112,97,114,101,84,111,78,117,108,108,58,32,91,78,117,108,108,80,111,105,110,116,101,114,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NullPointerException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2119o119olvha7hyw.R.rethrow($CLV_t2$);}finally{__CLR4_5_2119o119olvha7hyw.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableBooleanTest.testCompareToNull",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),48307,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2g1nl0c119v(){try{__CLR4_5_2119o119olvha7hyw.R.inc(48307);
        __CLR4_5_2119o119olvha7hyw.R.inc(48308);final MutableBoolean mutBool = new MutableBoolean(false);
        __CLR4_5_2119o119olvha7hyw.R.inc(48309);mutBool.compareTo(null);
    }finally{__CLR4_5_2119o119olvha7hyw.R.flushNeeded();}}

    // ----------------------------------------------------------------
    @Test
    public void testConstructors() {__CLR4_5_2119o119olvha7hyw.R.globalSliceStart(getClass().getName(),48310);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2lwxahe119y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2119o119olvha7hyw.R.rethrow($CLV_t2$);}finally{__CLR4_5_2119o119olvha7hyw.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableBooleanTest.testConstructors",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),48310,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2lwxahe119y(){try{__CLR4_5_2119o119olvha7hyw.R.inc(48310);
        __CLR4_5_2119o119olvha7hyw.R.inc(48311);assertFalse(new MutableBoolean().booleanValue());

        __CLR4_5_2119o119olvha7hyw.R.inc(48312);assertTrue(new MutableBoolean(true).booleanValue());
        __CLR4_5_2119o119olvha7hyw.R.inc(48313);assertFalse(new MutableBoolean(false).booleanValue());

        __CLR4_5_2119o119olvha7hyw.R.inc(48314);assertTrue(new MutableBoolean(Boolean.TRUE).booleanValue());
        __CLR4_5_2119o119olvha7hyw.R.inc(48315);assertFalse(new MutableBoolean(Boolean.FALSE).booleanValue());

    }finally{__CLR4_5_2119o119olvha7hyw.R.flushNeeded();}}

    @Test(expected=NullPointerException.class)
    public void testConstructorNull() {__CLR4_5_2119o119olvha7hyw.R.globalSliceStart(getClass().getName(),48316);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hqkc8a11a4();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,67,111,110,115,116,114,117,99,116,111,114,78,117,108,108,58,32,91,78,117,108,108,80,111,105,110,116,101,114,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NullPointerException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2119o119olvha7hyw.R.rethrow($CLV_t2$);}finally{__CLR4_5_2119o119olvha7hyw.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableBooleanTest.testConstructorNull",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),48316,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hqkc8a11a4(){try{__CLR4_5_2119o119olvha7hyw.R.inc(48316);
        __CLR4_5_2119o119olvha7hyw.R.inc(48317);new MutableBoolean(null);
    }finally{__CLR4_5_2119o119olvha7hyw.R.flushNeeded();}}

    @Test
    public void testEquals() {__CLR4_5_2119o119olvha7hyw.R.globalSliceStart(getClass().getName(),48318);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2s4e60811a6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2119o119olvha7hyw.R.rethrow($CLV_t2$);}finally{__CLR4_5_2119o119olvha7hyw.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableBooleanTest.testEquals",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),48318,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2s4e60811a6(){try{__CLR4_5_2119o119olvha7hyw.R.inc(48318);
        __CLR4_5_2119o119olvha7hyw.R.inc(48319);final MutableBoolean mutBoolA = new MutableBoolean(false);
        __CLR4_5_2119o119olvha7hyw.R.inc(48320);final MutableBoolean mutBoolB = new MutableBoolean(false);
        __CLR4_5_2119o119olvha7hyw.R.inc(48321);final MutableBoolean mutBoolC = new MutableBoolean(true);

        __CLR4_5_2119o119olvha7hyw.R.inc(48322);assertTrue(mutBoolA.equals(mutBoolA));
        __CLR4_5_2119o119olvha7hyw.R.inc(48323);assertTrue(mutBoolA.equals(mutBoolB));
        __CLR4_5_2119o119olvha7hyw.R.inc(48324);assertTrue(mutBoolB.equals(mutBoolA));
        __CLR4_5_2119o119olvha7hyw.R.inc(48325);assertTrue(mutBoolB.equals(mutBoolB));
        __CLR4_5_2119o119olvha7hyw.R.inc(48326);assertFalse(mutBoolA.equals(mutBoolC));
        __CLR4_5_2119o119olvha7hyw.R.inc(48327);assertFalse(mutBoolB.equals(mutBoolC));
        __CLR4_5_2119o119olvha7hyw.R.inc(48328);assertTrue(mutBoolC.equals(mutBoolC));
        __CLR4_5_2119o119olvha7hyw.R.inc(48329);assertFalse(mutBoolA.equals(null));
        __CLR4_5_2119o119olvha7hyw.R.inc(48330);assertFalse(mutBoolA.equals(Boolean.FALSE));
        __CLR4_5_2119o119olvha7hyw.R.inc(48331);assertFalse(mutBoolA.equals("false"));
    }finally{__CLR4_5_2119o119olvha7hyw.R.flushNeeded();}}

    @Test
    public void testGetSet() {__CLR4_5_2119o119olvha7hyw.R.globalSliceStart(getClass().getName(),48332);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22wnvh711ak();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2119o119olvha7hyw.R.rethrow($CLV_t2$);}finally{__CLR4_5_2119o119olvha7hyw.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableBooleanTest.testGetSet",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),48332,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22wnvh711ak(){try{__CLR4_5_2119o119olvha7hyw.R.inc(48332);
        __CLR4_5_2119o119olvha7hyw.R.inc(48333);assertFalse(new MutableBoolean().booleanValue());
        __CLR4_5_2119o119olvha7hyw.R.inc(48334);assertEquals(Boolean.FALSE, new MutableBoolean().getValue());
        
        __CLR4_5_2119o119olvha7hyw.R.inc(48335);final MutableBoolean mutBool = new MutableBoolean(false);
        __CLR4_5_2119o119olvha7hyw.R.inc(48336);assertEquals(Boolean.FALSE, mutBool.toBoolean());
        __CLR4_5_2119o119olvha7hyw.R.inc(48337);assertFalse(mutBool.booleanValue());
        __CLR4_5_2119o119olvha7hyw.R.inc(48338);assertTrue(mutBool.isFalse());
        __CLR4_5_2119o119olvha7hyw.R.inc(48339);assertFalse(mutBool.isTrue());

        __CLR4_5_2119o119olvha7hyw.R.inc(48340);mutBool.setValue(Boolean.TRUE);
        __CLR4_5_2119o119olvha7hyw.R.inc(48341);assertEquals(Boolean.TRUE, mutBool.toBoolean());
        __CLR4_5_2119o119olvha7hyw.R.inc(48342);assertTrue(mutBool.booleanValue());
        __CLR4_5_2119o119olvha7hyw.R.inc(48343);assertFalse(mutBool.isFalse());
        __CLR4_5_2119o119olvha7hyw.R.inc(48344);assertTrue(mutBool.isTrue());

        __CLR4_5_2119o119olvha7hyw.R.inc(48345);mutBool.setValue(false);
        __CLR4_5_2119o119olvha7hyw.R.inc(48346);assertFalse(mutBool.booleanValue());

        __CLR4_5_2119o119olvha7hyw.R.inc(48347);mutBool.setValue(true);
        __CLR4_5_2119o119olvha7hyw.R.inc(48348);assertTrue(mutBool.booleanValue());

        __CLR4_5_2119o119olvha7hyw.R.inc(48349);mutBool.setFalse();
        __CLR4_5_2119o119olvha7hyw.R.inc(48350);assertFalse(mutBool.booleanValue());

        __CLR4_5_2119o119olvha7hyw.R.inc(48351);mutBool.setTrue();
        __CLR4_5_2119o119olvha7hyw.R.inc(48352);assertTrue(mutBool.booleanValue());

    }finally{__CLR4_5_2119o119olvha7hyw.R.flushNeeded();}}

    @Test(expected=NullPointerException.class)
    public void testSetNull() {__CLR4_5_2119o119olvha7hyw.R.globalSliceStart(getClass().getName(),48353);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hciyri11b5();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,83,101,116,78,117,108,108,58,32,91,78,117,108,108,80,111,105,110,116,101,114,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NullPointerException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2119o119olvha7hyw.R.rethrow($CLV_t2$);}finally{__CLR4_5_2119o119olvha7hyw.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableBooleanTest.testSetNull",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),48353,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hciyri11b5(){try{__CLR4_5_2119o119olvha7hyw.R.inc(48353);
        __CLR4_5_2119o119olvha7hyw.R.inc(48354);final MutableBoolean mutBool = new MutableBoolean(false);
        __CLR4_5_2119o119olvha7hyw.R.inc(48355);mutBool.setValue(null);
    }finally{__CLR4_5_2119o119olvha7hyw.R.flushNeeded();}}

    @Test
    public void testHashCode() {__CLR4_5_2119o119olvha7hyw.R.globalSliceStart(getClass().getName(),48356);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23zkhv811b8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2119o119olvha7hyw.R.rethrow($CLV_t2$);}finally{__CLR4_5_2119o119olvha7hyw.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableBooleanTest.testHashCode",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),48356,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23zkhv811b8(){try{__CLR4_5_2119o119olvha7hyw.R.inc(48356);
        __CLR4_5_2119o119olvha7hyw.R.inc(48357);final MutableBoolean mutBoolA = new MutableBoolean(false);
        __CLR4_5_2119o119olvha7hyw.R.inc(48358);final MutableBoolean mutBoolB = new MutableBoolean(false);
        __CLR4_5_2119o119olvha7hyw.R.inc(48359);final MutableBoolean mutBoolC = new MutableBoolean(true);

        __CLR4_5_2119o119olvha7hyw.R.inc(48360);assertEquals(mutBoolA.hashCode(), mutBoolA.hashCode());
        __CLR4_5_2119o119olvha7hyw.R.inc(48361);assertEquals(mutBoolA.hashCode(), mutBoolB.hashCode());
        __CLR4_5_2119o119olvha7hyw.R.inc(48362);assertFalse(mutBoolA.hashCode() == mutBoolC.hashCode());
        __CLR4_5_2119o119olvha7hyw.R.inc(48363);assertEquals(mutBoolA.hashCode(), Boolean.FALSE.hashCode());
        __CLR4_5_2119o119olvha7hyw.R.inc(48364);assertEquals(mutBoolC.hashCode(), Boolean.TRUE.hashCode());
    }finally{__CLR4_5_2119o119olvha7hyw.R.flushNeeded();}}

    @Test
    public void testToString() {__CLR4_5_2119o119olvha7hyw.R.globalSliceStart(getClass().getName(),48365);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hrxdid11bh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2119o119olvha7hyw.R.rethrow($CLV_t2$);}finally{__CLR4_5_2119o119olvha7hyw.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableBooleanTest.testToString",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),48365,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hrxdid11bh(){try{__CLR4_5_2119o119olvha7hyw.R.inc(48365);
        __CLR4_5_2119o119olvha7hyw.R.inc(48366);assertEquals(Boolean.FALSE.toString(), new MutableBoolean(false).toString());
        __CLR4_5_2119o119olvha7hyw.R.inc(48367);assertEquals(Boolean.TRUE.toString(), new MutableBoolean(true).toString());
    }finally{__CLR4_5_2119o119olvha7hyw.R.flushNeeded();}}

}
