/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.commons.lang3;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

/**
 * 
 */
public class EnumUtilsTest {static class __CLR4_5_2otiotilvha7fue{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172763741L,8589935092L,32389,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testConstructable() {__CLR4_5_2otiotilvha7fue.R.globalSliceStart(getClass().getName(),32166);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26t3r8moti();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2otiotilvha7fue.R.rethrow($CLV_t2$);}finally{__CLR4_5_2otiotilvha7fue.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.EnumUtilsTest.testConstructable",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),32166,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26t3r8moti(){try{__CLR4_5_2otiotilvha7fue.R.inc(32166);
        // enforce public constructor
        __CLR4_5_2otiotilvha7fue.R.inc(32167);new EnumUtils();
    }finally{__CLR4_5_2otiotilvha7fue.R.flushNeeded();}}

    @Test
    public void test_getEnumMap() {__CLR4_5_2otiotilvha7fue.R.globalSliceStart(getClass().getName(),32168);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_216e9xjotk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2otiotilvha7fue.R.rethrow($CLV_t2$);}finally{__CLR4_5_2otiotilvha7fue.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.EnumUtilsTest.test_getEnumMap",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),32168,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_216e9xjotk(){try{__CLR4_5_2otiotilvha7fue.R.inc(32168);
        __CLR4_5_2otiotilvha7fue.R.inc(32169);final Map<String, Traffic> test = EnumUtils.getEnumMap(Traffic.class);
        __CLR4_5_2otiotilvha7fue.R.inc(32170);assertEquals( "getEnumMap not created correctly", "{RED=RED, AMBER=AMBER, GREEN=GREEN}", test.toString());
        __CLR4_5_2otiotilvha7fue.R.inc(32171);assertEquals(3, test.size());
        __CLR4_5_2otiotilvha7fue.R.inc(32172);assertTrue(test.containsKey("RED"));
        __CLR4_5_2otiotilvha7fue.R.inc(32173);assertEquals(Traffic.RED, test.get("RED"));
        __CLR4_5_2otiotilvha7fue.R.inc(32174);assertTrue(test.containsKey("AMBER"));
        __CLR4_5_2otiotilvha7fue.R.inc(32175);assertEquals(Traffic.AMBER, test.get("AMBER"));
        __CLR4_5_2otiotilvha7fue.R.inc(32176);assertTrue(test.containsKey("GREEN"));
        __CLR4_5_2otiotilvha7fue.R.inc(32177);assertEquals(Traffic.GREEN, test.get("GREEN"));
        __CLR4_5_2otiotilvha7fue.R.inc(32178);assertFalse(test.containsKey("PURPLE"));
    }finally{__CLR4_5_2otiotilvha7fue.R.flushNeeded();}}

    @Test
    public void test_getEnumList() {__CLR4_5_2otiotilvha7fue.R.globalSliceStart(getClass().getName(),32179);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23vpsjzotv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2otiotilvha7fue.R.rethrow($CLV_t2$);}finally{__CLR4_5_2otiotilvha7fue.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.EnumUtilsTest.test_getEnumList",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),32179,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23vpsjzotv(){try{__CLR4_5_2otiotilvha7fue.R.inc(32179);
        __CLR4_5_2otiotilvha7fue.R.inc(32180);final List<Traffic> test = EnumUtils.getEnumList(Traffic.class);
        __CLR4_5_2otiotilvha7fue.R.inc(32181);assertEquals(3, test.size());
        __CLR4_5_2otiotilvha7fue.R.inc(32182);assertEquals(Traffic.RED, test.get(0));
        __CLR4_5_2otiotilvha7fue.R.inc(32183);assertEquals(Traffic.AMBER, test.get(1));
        __CLR4_5_2otiotilvha7fue.R.inc(32184);assertEquals(Traffic.GREEN, test.get(2));
    }finally{__CLR4_5_2otiotilvha7fue.R.flushNeeded();}}

    @Test
    public void test_isEnum() {__CLR4_5_2otiotilvha7fue.R.globalSliceStart(getClass().getName(),32185);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vk417lou1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2otiotilvha7fue.R.rethrow($CLV_t2$);}finally{__CLR4_5_2otiotilvha7fue.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.EnumUtilsTest.test_isEnum",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),32185,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vk417lou1(){try{__CLR4_5_2otiotilvha7fue.R.inc(32185);
        __CLR4_5_2otiotilvha7fue.R.inc(32186);assertTrue(EnumUtils.isValidEnum(Traffic.class, "RED"));
        __CLR4_5_2otiotilvha7fue.R.inc(32187);assertTrue(EnumUtils.isValidEnum(Traffic.class, "AMBER"));
        __CLR4_5_2otiotilvha7fue.R.inc(32188);assertTrue(EnumUtils.isValidEnum(Traffic.class, "GREEN"));
        __CLR4_5_2otiotilvha7fue.R.inc(32189);assertFalse(EnumUtils.isValidEnum(Traffic.class, "PURPLE"));
        __CLR4_5_2otiotilvha7fue.R.inc(32190);assertFalse(EnumUtils.isValidEnum(Traffic.class, null));
    }finally{__CLR4_5_2otiotilvha7fue.R.flushNeeded();}}

    @Test(expected=NullPointerException.class)
    public void test_isEnum_nullClass() {__CLR4_5_2otiotilvha7fue.R.globalSliceStart(getClass().getName(),32191);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2acnj9tou7();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,95,105,115,69,110,117,109,95,110,117,108,108,67,108,97,115,115,58,32,91,78,117,108,108,80,111,105,110,116,101,114,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NullPointerException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2otiotilvha7fue.R.rethrow($CLV_t2$);}finally{__CLR4_5_2otiotilvha7fue.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.EnumUtilsTest.test_isEnum_nullClass",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),32191,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2acnj9tou7(){try{__CLR4_5_2otiotilvha7fue.R.inc(32191);
        __CLR4_5_2otiotilvha7fue.R.inc(32192);EnumUtils.isValidEnum(null, "PURPLE");
    }finally{__CLR4_5_2otiotilvha7fue.R.flushNeeded();}}

    @Test
    public void test_getEnum() {__CLR4_5_2otiotilvha7fue.R.globalSliceStart(getClass().getName(),32193);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2z3ex1tou9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2otiotilvha7fue.R.rethrow($CLV_t2$);}finally{__CLR4_5_2otiotilvha7fue.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.EnumUtilsTest.test_getEnum",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),32193,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2z3ex1tou9(){try{__CLR4_5_2otiotilvha7fue.R.inc(32193);
        __CLR4_5_2otiotilvha7fue.R.inc(32194);assertEquals(Traffic.RED, EnumUtils.getEnum(Traffic.class, "RED"));
        __CLR4_5_2otiotilvha7fue.R.inc(32195);assertEquals(Traffic.AMBER, EnumUtils.getEnum(Traffic.class, "AMBER"));
        __CLR4_5_2otiotilvha7fue.R.inc(32196);assertEquals(Traffic.GREEN, EnumUtils.getEnum(Traffic.class, "GREEN"));
        __CLR4_5_2otiotilvha7fue.R.inc(32197);assertEquals(null, EnumUtils.getEnum(Traffic.class, "PURPLE"));
        __CLR4_5_2otiotilvha7fue.R.inc(32198);assertEquals(null, EnumUtils.getEnum(Traffic.class, null));
    }finally{__CLR4_5_2otiotilvha7fue.R.flushNeeded();}}

    @Test(expected=NullPointerException.class)
    public void test_getEnum_nullClass() {__CLR4_5_2otiotilvha7fue.R.globalSliceStart(getClass().getName(),32199);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gqzkcjouf();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,95,103,101,116,69,110,117,109,95,110,117,108,108,67,108,97,115,115,58,32,91,78,117,108,108,80,111,105,110,116,101,114,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NullPointerException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2otiotilvha7fue.R.rethrow($CLV_t2$);}finally{__CLR4_5_2otiotilvha7fue.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.EnumUtilsTest.test_getEnum_nullClass",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),32199,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gqzkcjouf(){try{__CLR4_5_2otiotilvha7fue.R.inc(32199);
        __CLR4_5_2otiotilvha7fue.R.inc(32200);EnumUtils.getEnum((Class<Traffic>) null, "PURPLE");
    }finally{__CLR4_5_2otiotilvha7fue.R.flushNeeded();}}

    @Test(expected=NullPointerException.class)
    public void test_generateBitVector_nullClass() {__CLR4_5_2otiotilvha7fue.R.globalSliceStart(getClass().getName(),32201);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2wii093ouh();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,95,103,101,110,101,114,97,116,101,66,105,116,86,101,99,116,111,114,95,110,117,108,108,67,108,97,115,115,58,32,91,78,117,108,108,80,111,105,110,116,101,114,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NullPointerException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2otiotilvha7fue.R.rethrow($CLV_t2$);}finally{__CLR4_5_2otiotilvha7fue.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.EnumUtilsTest.test_generateBitVector_nullClass",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),32201,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2wii093ouh(){try{__CLR4_5_2otiotilvha7fue.R.inc(32201);
        __CLR4_5_2otiotilvha7fue.R.inc(32202);EnumUtils.generateBitVector(null, EnumSet.of(Traffic.RED));
    }finally{__CLR4_5_2otiotilvha7fue.R.flushNeeded();}}

    @Test(expected=NullPointerException.class)
    public void test_generateBitVectors_nullClass() {__CLR4_5_2otiotilvha7fue.R.globalSliceStart(getClass().getName(),32203);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2nt7anyouj();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,95,103,101,110,101,114,97,116,101,66,105,116,86,101,99,116,111,114,115,95,110,117,108,108,67,108,97,115,115,58,32,91,78,117,108,108,80,111,105,110,116,101,114,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NullPointerException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2otiotilvha7fue.R.rethrow($CLV_t2$);}finally{__CLR4_5_2otiotilvha7fue.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.EnumUtilsTest.test_generateBitVectors_nullClass",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),32203,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2nt7anyouj(){try{__CLR4_5_2otiotilvha7fue.R.inc(32203);
        __CLR4_5_2otiotilvha7fue.R.inc(32204);EnumUtils.generateBitVectors(null, EnumSet.of(Traffic.RED));
    }finally{__CLR4_5_2otiotilvha7fue.R.flushNeeded();}}
    
    @Test(expected=NullPointerException.class)
    public void test_generateBitVector_nullIterable() {__CLR4_5_2otiotilvha7fue.R.globalSliceStart(getClass().getName(),32205);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2kd3hwxoul();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,95,103,101,110,101,114,97,116,101,66,105,116,86,101,99,116,111,114,95,110,117,108,108,73,116,101,114,97,98,108,101,58,32,91,78,117,108,108,80,111,105,110,116,101,114,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NullPointerException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2otiotilvha7fue.R.rethrow($CLV_t2$);}finally{__CLR4_5_2otiotilvha7fue.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.EnumUtilsTest.test_generateBitVector_nullIterable",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),32205,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2kd3hwxoul(){try{__CLR4_5_2otiotilvha7fue.R.inc(32205);
        __CLR4_5_2otiotilvha7fue.R.inc(32206);EnumUtils.generateBitVector(Traffic.class, (Iterable<Traffic>) null);
    }finally{__CLR4_5_2otiotilvha7fue.R.flushNeeded();}}

    @Test(expected=NullPointerException.class)
    public void test_generateBitVectors_nullIterable() {__CLR4_5_2otiotilvha7fue.R.globalSliceStart(getClass().getName(),32207);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2krrnruoun();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,95,103,101,110,101,114,97,116,101,66,105,116,86,101,99,116,111,114,115,95,110,117,108,108,73,116,101,114,97,98,108,101,58,32,91,78,117,108,108,80,111,105,110,116,101,114,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NullPointerException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2otiotilvha7fue.R.rethrow($CLV_t2$);}finally{__CLR4_5_2otiotilvha7fue.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.EnumUtilsTest.test_generateBitVectors_nullIterable",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),32207,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2krrnruoun(){try{__CLR4_5_2otiotilvha7fue.R.inc(32207);
        __CLR4_5_2otiotilvha7fue.R.inc(32208);EnumUtils.generateBitVectors(null, (Iterable<Traffic>) null);
    }finally{__CLR4_5_2otiotilvha7fue.R.flushNeeded();}}
    
    @Test(expected=IllegalArgumentException.class)
    public void test_generateBitVector_nullElement() {__CLR4_5_2otiotilvha7fue.R.globalSliceStart(getClass().getName(),32209);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2rbzd7oup();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,95,103,101,110,101,114,97,116,101,66,105,116,86,101,99,116,111,114,95,110,117,108,108,69,108,101,109,101,110,116,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2otiotilvha7fue.R.rethrow($CLV_t2$);}finally{__CLR4_5_2otiotilvha7fue.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.EnumUtilsTest.test_generateBitVector_nullElement",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),32209,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2rbzd7oup(){try{__CLR4_5_2otiotilvha7fue.R.inc(32209);
        __CLR4_5_2otiotilvha7fue.R.inc(32210);EnumUtils.generateBitVector(Traffic.class, Arrays.asList(Traffic.RED, null));
    }finally{__CLR4_5_2otiotilvha7fue.R.flushNeeded();}}
    
    @Test(expected=IllegalArgumentException.class)
    public void test_generateBitVectors_nullElement() {__CLR4_5_2otiotilvha7fue.R.globalSliceStart(getClass().getName(),32211);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2j3pf5uour();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,95,103,101,110,101,114,97,116,101,66,105,116,86,101,99,116,111,114,115,95,110,117,108,108,69,108,101,109,101,110,116,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2otiotilvha7fue.R.rethrow($CLV_t2$);}finally{__CLR4_5_2otiotilvha7fue.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.EnumUtilsTest.test_generateBitVectors_nullElement",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),32211,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2j3pf5uour(){try{__CLR4_5_2otiotilvha7fue.R.inc(32211);
        __CLR4_5_2otiotilvha7fue.R.inc(32212);EnumUtils.generateBitVectors(Traffic.class, Arrays.asList(Traffic.RED, null));
    }finally{__CLR4_5_2otiotilvha7fue.R.flushNeeded();}}
    
    @Test(expected=NullPointerException.class)
    public void test_generateBitVector_nullClassWithArray() {__CLR4_5_2otiotilvha7fue.R.globalSliceStart(getClass().getName(),32213);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_247fgjeout();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,95,103,101,110,101,114,97,116,101,66,105,116,86,101,99,116,111,114,95,110,117,108,108,67,108,97,115,115,87,105,116,104,65,114,114,97,121,58,32,91,78,117,108,108,80,111,105,110,116,101,114,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NullPointerException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2otiotilvha7fue.R.rethrow($CLV_t2$);}finally{__CLR4_5_2otiotilvha7fue.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.EnumUtilsTest.test_generateBitVector_nullClassWithArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),32213,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_247fgjeout(){try{__CLR4_5_2otiotilvha7fue.R.inc(32213);
        __CLR4_5_2otiotilvha7fue.R.inc(32214);EnumUtils.generateBitVector(null, Traffic.RED);
    }finally{__CLR4_5_2otiotilvha7fue.R.flushNeeded();}}
    
    @Test(expected=NullPointerException.class)
    public void test_generateBitVectors_nullClassWithArray() {__CLR4_5_2otiotilvha7fue.R.globalSliceStart(getClass().getName(),32215);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26f8yotouv();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,95,103,101,110,101,114,97,116,101,66,105,116,86,101,99,116,111,114,115,95,110,117,108,108,67,108,97,115,115,87,105,116,104,65,114,114,97,121,58,32,91,78,117,108,108,80,111,105,110,116,101,114,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NullPointerException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2otiotilvha7fue.R.rethrow($CLV_t2$);}finally{__CLR4_5_2otiotilvha7fue.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.EnumUtilsTest.test_generateBitVectors_nullClassWithArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),32215,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26f8yotouv(){try{__CLR4_5_2otiotilvha7fue.R.inc(32215);
        __CLR4_5_2otiotilvha7fue.R.inc(32216);EnumUtils.generateBitVectors(null, Traffic.RED);
    }finally{__CLR4_5_2otiotilvha7fue.R.flushNeeded();}}
    
    @Test(expected=NullPointerException.class)
    public void test_generateBitVector_nullArray() {__CLR4_5_2otiotilvha7fue.R.globalSliceStart(getClass().getName(),32217);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_29ljpfcoux();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,95,103,101,110,101,114,97,116,101,66,105,116,86,101,99,116,111,114,95,110,117,108,108,65,114,114,97,121,58,32,91,78,117,108,108,80,111,105,110,116,101,114,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NullPointerException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2otiotilvha7fue.R.rethrow($CLV_t2$);}finally{__CLR4_5_2otiotilvha7fue.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.EnumUtilsTest.test_generateBitVector_nullArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),32217,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_29ljpfcoux(){try{__CLR4_5_2otiotilvha7fue.R.inc(32217);
        __CLR4_5_2otiotilvha7fue.R.inc(32218);EnumUtils.generateBitVector(Traffic.class, (Traffic[]) null);
    }finally{__CLR4_5_2otiotilvha7fue.R.flushNeeded();}}

    @Test(expected=NullPointerException.class)
    public void test_generateBitVectors_nullArray() {__CLR4_5_2otiotilvha7fue.R.globalSliceStart(getClass().getName(),32219);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2iauf0houz();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,95,103,101,110,101,114,97,116,101,66,105,116,86,101,99,116,111,114,115,95,110,117,108,108,65,114,114,97,121,58,32,91,78,117,108,108,80,111,105,110,116,101,114,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NullPointerException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2otiotilvha7fue.R.rethrow($CLV_t2$);}finally{__CLR4_5_2otiotilvha7fue.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.EnumUtilsTest.test_generateBitVectors_nullArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),32219,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2iauf0houz(){try{__CLR4_5_2otiotilvha7fue.R.inc(32219);
        __CLR4_5_2otiotilvha7fue.R.inc(32220);EnumUtils.generateBitVectors(Traffic.class, (Traffic[]) null);
    }finally{__CLR4_5_2otiotilvha7fue.R.flushNeeded();}}
    
    @Test(expected=IllegalArgumentException.class)
    public void test_generateBitVector_nullArrayElement() {__CLR4_5_2otiotilvha7fue.R.globalSliceStart(getClass().getName(),32221);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_222237iov1();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,95,103,101,110,101,114,97,116,101,66,105,116,86,101,99,116,111,114,95,110,117,108,108,65,114,114,97,121,69,108,101,109,101,110,116,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2otiotilvha7fue.R.rethrow($CLV_t2$);}finally{__CLR4_5_2otiotilvha7fue.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.EnumUtilsTest.test_generateBitVector_nullArrayElement",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),32221,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_222237iov1(){try{__CLR4_5_2otiotilvha7fue.R.inc(32221);
        __CLR4_5_2otiotilvha7fue.R.inc(32222);EnumUtils.generateBitVector(Traffic.class, Traffic.RED, null);
    }finally{__CLR4_5_2otiotilvha7fue.R.flushNeeded();}}
    
    @Test(expected=IllegalArgumentException.class)
    public void test_generateBitVectors_nullArrayElement() {__CLR4_5_2otiotilvha7fue.R.globalSliceStart(getClass().getName(),32223);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2tkb0ydov3();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,95,103,101,110,101,114,97,116,101,66,105,116,86,101,99,116,111,114,115,95,110,117,108,108,65,114,114,97,121,69,108,101,109,101,110,116,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2otiotilvha7fue.R.rethrow($CLV_t2$);}finally{__CLR4_5_2otiotilvha7fue.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.EnumUtilsTest.test_generateBitVectors_nullArrayElement",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),32223,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2tkb0ydov3(){try{__CLR4_5_2otiotilvha7fue.R.inc(32223);
        __CLR4_5_2otiotilvha7fue.R.inc(32224);EnumUtils.generateBitVectors(Traffic.class, Traffic.RED, null);
    }finally{__CLR4_5_2otiotilvha7fue.R.flushNeeded();}}
    
    @Test(expected=IllegalArgumentException.class)
    public void test_generateBitVector_longClass() {__CLR4_5_2otiotilvha7fue.R.globalSliceStart(getClass().getName(),32225);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28r5je6ov5();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,95,103,101,110,101,114,97,116,101,66,105,116,86,101,99,116,111,114,95,108,111,110,103,67,108,97,115,115,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2otiotilvha7fue.R.rethrow($CLV_t2$);}finally{__CLR4_5_2otiotilvha7fue.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.EnumUtilsTest.test_generateBitVector_longClass",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),32225,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28r5je6ov5(){try{__CLR4_5_2otiotilvha7fue.R.inc(32225);
        __CLR4_5_2otiotilvha7fue.R.inc(32226);EnumUtils.generateBitVector(TooMany.class, EnumSet.of(TooMany.A1));
    }finally{__CLR4_5_2otiotilvha7fue.R.flushNeeded();}}

    @Test(expected=IllegalArgumentException.class)
    public void test_generateBitVector_longClassWithArray() {__CLR4_5_2otiotilvha7fue.R.globalSliceStart(getClass().getName(),32227);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2v84panov7();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,95,103,101,110,101,114,97,116,101,66,105,116,86,101,99,116,111,114,95,108,111,110,103,67,108,97,115,115,87,105,116,104,65,114,114,97,121,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2otiotilvha7fue.R.rethrow($CLV_t2$);}finally{__CLR4_5_2otiotilvha7fue.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.EnumUtilsTest.test_generateBitVector_longClassWithArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),32227,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2v84panov7(){try{__CLR4_5_2otiotilvha7fue.R.inc(32227);
        __CLR4_5_2otiotilvha7fue.R.inc(32228);EnumUtils.generateBitVector(TooMany.class, TooMany.A1);
    }finally{__CLR4_5_2otiotilvha7fue.R.flushNeeded();}}

    @SuppressWarnings("unchecked")
    @Test(expected=IllegalArgumentException.class)
    public void test_generateBitVector_nonEnumClass() {__CLR4_5_2otiotilvha7fue.R.globalSliceStart(getClass().getName(),32229);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2xohmamov9();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,95,103,101,110,101,114,97,116,101,66,105,116,86,101,99,116,111,114,95,110,111,110,69,110,117,109,67,108,97,115,115,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2otiotilvha7fue.R.rethrow($CLV_t2$);}finally{__CLR4_5_2otiotilvha7fue.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.EnumUtilsTest.test_generateBitVector_nonEnumClass",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),32229,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2xohmamov9(){try{__CLR4_5_2otiotilvha7fue.R.inc(32229);
        __CLR4_5_2otiotilvha7fue.R.inc(32230);@SuppressWarnings("rawtypes")
        final
        Class rawType = Object.class;
        __CLR4_5_2otiotilvha7fue.R.inc(32231);@SuppressWarnings("rawtypes")
        final
        List rawList = new ArrayList();
        __CLR4_5_2otiotilvha7fue.R.inc(32232);EnumUtils.generateBitVector(rawType, rawList);
    }finally{__CLR4_5_2otiotilvha7fue.R.flushNeeded();}}
    
    @SuppressWarnings("unchecked")
    @Test(expected=IllegalArgumentException.class)
    public void test_generateBitVectors_nonEnumClass() {__CLR4_5_2otiotilvha7fue.R.globalSliceStart(getClass().getName(),32233);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2x9tgfpovd();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,95,103,101,110,101,114,97,116,101,66,105,116,86,101,99,116,111,114,115,95,110,111,110,69,110,117,109,67,108,97,115,115,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2otiotilvha7fue.R.rethrow($CLV_t2$);}finally{__CLR4_5_2otiotilvha7fue.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.EnumUtilsTest.test_generateBitVectors_nonEnumClass",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),32233,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2x9tgfpovd(){try{__CLR4_5_2otiotilvha7fue.R.inc(32233);
        __CLR4_5_2otiotilvha7fue.R.inc(32234);@SuppressWarnings("rawtypes")
        final
        Class rawType = Object.class;
        __CLR4_5_2otiotilvha7fue.R.inc(32235);@SuppressWarnings("rawtypes")
        final
        List rawList = new ArrayList();
        __CLR4_5_2otiotilvha7fue.R.inc(32236);EnumUtils.generateBitVectors(rawType, rawList);
    }finally{__CLR4_5_2otiotilvha7fue.R.flushNeeded();}}
    
    @SuppressWarnings("unchecked")
    @Test(expected=IllegalArgumentException.class)
    public void test_generateBitVector_nonEnumClassWithArray() {__CLR4_5_2otiotilvha7fue.R.globalSliceStart(getClass().getName(),32237);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gnzfsvovh();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,95,103,101,110,101,114,97,116,101,66,105,116,86,101,99,116,111,114,95,110,111,110,69,110,117,109,67,108,97,115,115,87,105,116,104,65,114,114,97,121,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2otiotilvha7fue.R.rethrow($CLV_t2$);}finally{__CLR4_5_2otiotilvha7fue.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.EnumUtilsTest.test_generateBitVector_nonEnumClassWithArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),32237,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gnzfsvovh(){try{__CLR4_5_2otiotilvha7fue.R.inc(32237);
        __CLR4_5_2otiotilvha7fue.R.inc(32238);@SuppressWarnings("rawtypes")
        final
        Class rawType = Object.class;
        __CLR4_5_2otiotilvha7fue.R.inc(32239);EnumUtils.generateBitVector(rawType);
    }finally{__CLR4_5_2otiotilvha7fue.R.flushNeeded();}}

    @SuppressWarnings("unchecked")
    @Test(expected=IllegalArgumentException.class)
    public void test_generateBitVectors_nonEnumClassWithArray() {__CLR4_5_2otiotilvha7fue.R.globalSliceStart(getClass().getName(),32240);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24kl8eiovk();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,95,103,101,110,101,114,97,116,101,66,105,116,86,101,99,116,111,114,115,95,110,111,110,69,110,117,109,67,108,97,115,115,87,105,116,104,65,114,114,97,121,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2otiotilvha7fue.R.rethrow($CLV_t2$);}finally{__CLR4_5_2otiotilvha7fue.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.EnumUtilsTest.test_generateBitVectors_nonEnumClassWithArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),32240,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24kl8eiovk(){try{__CLR4_5_2otiotilvha7fue.R.inc(32240);
        __CLR4_5_2otiotilvha7fue.R.inc(32241);@SuppressWarnings("rawtypes")
        final
        Class rawType = Object.class;
        __CLR4_5_2otiotilvha7fue.R.inc(32242);EnumUtils.generateBitVectors(rawType);
    }finally{__CLR4_5_2otiotilvha7fue.R.flushNeeded();}}
    
    @Test
    public void test_generateBitVector() {__CLR4_5_2otiotilvha7fue.R.globalSliceStart(getClass().getName(),32243);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24rr6lnovn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2otiotilvha7fue.R.rethrow($CLV_t2$);}finally{__CLR4_5_2otiotilvha7fue.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.EnumUtilsTest.test_generateBitVector",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),32243,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24rr6lnovn(){try{__CLR4_5_2otiotilvha7fue.R.inc(32243);
        __CLR4_5_2otiotilvha7fue.R.inc(32244);assertEquals(0L, EnumUtils.generateBitVector(Traffic.class, EnumSet.noneOf(Traffic.class)));
        __CLR4_5_2otiotilvha7fue.R.inc(32245);assertEquals(1L, EnumUtils.generateBitVector(Traffic.class, EnumSet.of(Traffic.RED)));
        __CLR4_5_2otiotilvha7fue.R.inc(32246);assertEquals(2L, EnumUtils.generateBitVector(Traffic.class, EnumSet.of(Traffic.AMBER)));
        __CLR4_5_2otiotilvha7fue.R.inc(32247);assertEquals(4L, EnumUtils.generateBitVector(Traffic.class, EnumSet.of(Traffic.GREEN)));
        __CLR4_5_2otiotilvha7fue.R.inc(32248);assertEquals(3L, EnumUtils.generateBitVector(Traffic.class, EnumSet.of(Traffic.RED, Traffic.AMBER)));
        __CLR4_5_2otiotilvha7fue.R.inc(32249);assertEquals(5L, EnumUtils.generateBitVector(Traffic.class, EnumSet.of(Traffic.RED, Traffic.GREEN)));
        __CLR4_5_2otiotilvha7fue.R.inc(32250);assertEquals(6L, EnumUtils.generateBitVector(Traffic.class, EnumSet.of(Traffic.AMBER, Traffic.GREEN)));
        __CLR4_5_2otiotilvha7fue.R.inc(32251);assertEquals(7L, EnumUtils.generateBitVector(Traffic.class, EnumSet.of(Traffic.RED, Traffic.AMBER, Traffic.GREEN)));

        // 64 values Enum (to test whether no int<->long jdk convertion issue exists)
        __CLR4_5_2otiotilvha7fue.R.inc(32252);assertEquals((1L << 31), EnumUtils.generateBitVector(Enum64.class, EnumSet.of(Enum64.A31)));
        __CLR4_5_2otiotilvha7fue.R.inc(32253);assertEquals((1L << 32), EnumUtils.generateBitVector(Enum64.class, EnumSet.of(Enum64.A32)));
        __CLR4_5_2otiotilvha7fue.R.inc(32254);assertEquals((1L << 63), EnumUtils.generateBitVector(Enum64.class, EnumSet.of(Enum64.A63)));
        __CLR4_5_2otiotilvha7fue.R.inc(32255);assertEquals(Long.MIN_VALUE, EnumUtils.generateBitVector(Enum64.class, EnumSet.of(Enum64.A63)));
    }finally{__CLR4_5_2otiotilvha7fue.R.flushNeeded();}}

    @Test
    public void test_generateBitVectors() {__CLR4_5_2otiotilvha7fue.R.globalSliceStart(getClass().getName(),32256);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2z3vbf0ow0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2otiotilvha7fue.R.rethrow($CLV_t2$);}finally{__CLR4_5_2otiotilvha7fue.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.EnumUtilsTest.test_generateBitVectors",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),32256,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2z3vbf0ow0(){try{__CLR4_5_2otiotilvha7fue.R.inc(32256);
        __CLR4_5_2otiotilvha7fue.R.inc(32257);assertArrayEquals(EnumUtils.generateBitVectors(Traffic.class, EnumSet.noneOf(Traffic.class)), 0L);
        __CLR4_5_2otiotilvha7fue.R.inc(32258);assertArrayEquals(EnumUtils.generateBitVectors(Traffic.class, EnumSet.of(Traffic.RED)), 1L);
        __CLR4_5_2otiotilvha7fue.R.inc(32259);assertArrayEquals(EnumUtils.generateBitVectors(Traffic.class, EnumSet.of(Traffic.AMBER)), 2L);
        __CLR4_5_2otiotilvha7fue.R.inc(32260);assertArrayEquals(EnumUtils.generateBitVectors(Traffic.class, EnumSet.of(Traffic.GREEN)), 4L);
        __CLR4_5_2otiotilvha7fue.R.inc(32261);assertArrayEquals(EnumUtils.generateBitVectors(Traffic.class, EnumSet.of(Traffic.RED, Traffic.AMBER)), 3L);
        __CLR4_5_2otiotilvha7fue.R.inc(32262);assertArrayEquals(EnumUtils.generateBitVectors(Traffic.class, EnumSet.of(Traffic.RED, Traffic.GREEN)), 5L);
        __CLR4_5_2otiotilvha7fue.R.inc(32263);assertArrayEquals(EnumUtils.generateBitVectors(Traffic.class, EnumSet.of(Traffic.AMBER, Traffic.GREEN)), 6L);
        __CLR4_5_2otiotilvha7fue.R.inc(32264);assertArrayEquals(EnumUtils.generateBitVectors(Traffic.class, EnumSet.of(Traffic.RED, Traffic.AMBER, Traffic.GREEN)), 7L);

        // 64 values Enum (to test whether no int<->long jdk convertion issue exists)
        __CLR4_5_2otiotilvha7fue.R.inc(32265);assertArrayEquals(EnumUtils.generateBitVectors(Enum64.class, EnumSet.of(Enum64.A31)), (1L << 31));
        __CLR4_5_2otiotilvha7fue.R.inc(32266);assertArrayEquals(EnumUtils.generateBitVectors(Enum64.class, EnumSet.of(Enum64.A32)), (1L << 32));
        __CLR4_5_2otiotilvha7fue.R.inc(32267);assertArrayEquals(EnumUtils.generateBitVectors(Enum64.class, EnumSet.of(Enum64.A63)), (1L << 63));
        __CLR4_5_2otiotilvha7fue.R.inc(32268);assertArrayEquals(EnumUtils.generateBitVectors(Enum64.class, EnumSet.of(Enum64.A63)), Long.MIN_VALUE);

        // More than 64 values Enum
        __CLR4_5_2otiotilvha7fue.R.inc(32269);assertArrayEquals(EnumUtils.generateBitVectors(TooMany.class, EnumSet.of(TooMany.M2)), 1L, 0L);
        __CLR4_5_2otiotilvha7fue.R.inc(32270);assertArrayEquals(EnumUtils.generateBitVectors(TooMany.class, EnumSet.of(TooMany.L2, TooMany.M2)), 1L, (1L << 63));
    }finally{__CLR4_5_2otiotilvha7fue.R.flushNeeded();}}

    @Test
    public void test_generateBitVectorFromArray() {__CLR4_5_2otiotilvha7fue.R.globalSliceStart(getClass().getName(),32271);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2nxyhc8owf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2otiotilvha7fue.R.rethrow($CLV_t2$);}finally{__CLR4_5_2otiotilvha7fue.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.EnumUtilsTest.test_generateBitVectorFromArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),32271,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2nxyhc8owf(){try{__CLR4_5_2otiotilvha7fue.R.inc(32271);
        __CLR4_5_2otiotilvha7fue.R.inc(32272);assertEquals(0L, EnumUtils.generateBitVector(Traffic.class));
        __CLR4_5_2otiotilvha7fue.R.inc(32273);assertEquals(1L, EnumUtils.generateBitVector(Traffic.class, Traffic.RED));
        __CLR4_5_2otiotilvha7fue.R.inc(32274);assertEquals(2L, EnumUtils.generateBitVector(Traffic.class, Traffic.AMBER));
        __CLR4_5_2otiotilvha7fue.R.inc(32275);assertEquals(4L, EnumUtils.generateBitVector(Traffic.class, Traffic.GREEN));
        __CLR4_5_2otiotilvha7fue.R.inc(32276);assertEquals(3L, EnumUtils.generateBitVector(Traffic.class, Traffic.RED, Traffic.AMBER));
        __CLR4_5_2otiotilvha7fue.R.inc(32277);assertEquals(5L, EnumUtils.generateBitVector(Traffic.class, Traffic.RED, Traffic.GREEN));
        __CLR4_5_2otiotilvha7fue.R.inc(32278);assertEquals(6L, EnumUtils.generateBitVector(Traffic.class, Traffic.AMBER, Traffic.GREEN));
        __CLR4_5_2otiotilvha7fue.R.inc(32279);assertEquals(7L, EnumUtils.generateBitVector(Traffic.class, Traffic.RED, Traffic.AMBER, Traffic.GREEN));
        //gracefully handles duplicates:
        __CLR4_5_2otiotilvha7fue.R.inc(32280);assertEquals(7L, EnumUtils.generateBitVector(Traffic.class, Traffic.RED, Traffic.AMBER, Traffic.GREEN, Traffic.GREEN));

        // 64 values Enum (to test whether no int<->long jdk convertion issue exists)
        __CLR4_5_2otiotilvha7fue.R.inc(32281);assertEquals((1L << 31), EnumUtils.generateBitVector(Enum64.class, Enum64.A31));
        __CLR4_5_2otiotilvha7fue.R.inc(32282);assertEquals((1L << 32), EnumUtils.generateBitVector(Enum64.class, Enum64.A32));
        __CLR4_5_2otiotilvha7fue.R.inc(32283);assertEquals((1L << 63), EnumUtils.generateBitVector(Enum64.class, Enum64.A63));
        __CLR4_5_2otiotilvha7fue.R.inc(32284);assertEquals(Long.MIN_VALUE, EnumUtils.generateBitVector(Enum64.class, Enum64.A63));
    }finally{__CLR4_5_2otiotilvha7fue.R.flushNeeded();}}
    
    @Test
    public void test_generateBitVectorsFromArray() {__CLR4_5_2otiotilvha7fue.R.globalSliceStart(getClass().getName(),32285);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2wtsupdowt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2otiotilvha7fue.R.rethrow($CLV_t2$);}finally{__CLR4_5_2otiotilvha7fue.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.EnumUtilsTest.test_generateBitVectorsFromArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),32285,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2wtsupdowt(){try{__CLR4_5_2otiotilvha7fue.R.inc(32285);
        __CLR4_5_2otiotilvha7fue.R.inc(32286);assertArrayEquals(EnumUtils.generateBitVectors(Traffic.class), 0L);
        __CLR4_5_2otiotilvha7fue.R.inc(32287);assertArrayEquals(EnumUtils.generateBitVectors(Traffic.class, Traffic.RED), 1L);
        __CLR4_5_2otiotilvha7fue.R.inc(32288);assertArrayEquals(EnumUtils.generateBitVectors(Traffic.class, Traffic.AMBER), 2L);
        __CLR4_5_2otiotilvha7fue.R.inc(32289);assertArrayEquals(EnumUtils.generateBitVectors(Traffic.class, Traffic.GREEN), 4L);
        __CLR4_5_2otiotilvha7fue.R.inc(32290);assertArrayEquals(EnumUtils.generateBitVectors(Traffic.class, Traffic.RED, Traffic.AMBER), 3L);
        __CLR4_5_2otiotilvha7fue.R.inc(32291);assertArrayEquals(EnumUtils.generateBitVectors(Traffic.class, Traffic.RED, Traffic.GREEN), 5L);
        __CLR4_5_2otiotilvha7fue.R.inc(32292);assertArrayEquals(EnumUtils.generateBitVectors(Traffic.class, Traffic.AMBER, Traffic.GREEN), 6L);
        __CLR4_5_2otiotilvha7fue.R.inc(32293);assertArrayEquals(EnumUtils.generateBitVectors(Traffic.class, Traffic.RED, Traffic.AMBER, Traffic.GREEN), 7L);
        //gracefully handles duplicates:
        __CLR4_5_2otiotilvha7fue.R.inc(32294);assertArrayEquals(EnumUtils.generateBitVectors(Traffic.class, Traffic.RED, Traffic.AMBER, Traffic.GREEN, Traffic.GREEN), 7L);

        // 64 values Enum (to test whether no int<->long jdk convertion issue exists)
        __CLR4_5_2otiotilvha7fue.R.inc(32295);assertArrayEquals(EnumUtils.generateBitVectors(Enum64.class, Enum64.A31), (1L << 31));
        __CLR4_5_2otiotilvha7fue.R.inc(32296);assertArrayEquals(EnumUtils.generateBitVectors(Enum64.class, Enum64.A32), (1L << 32));
        __CLR4_5_2otiotilvha7fue.R.inc(32297);assertArrayEquals(EnumUtils.generateBitVectors(Enum64.class, Enum64.A63), (1L << 63));
        __CLR4_5_2otiotilvha7fue.R.inc(32298);assertArrayEquals(EnumUtils.generateBitVectors(Enum64.class, Enum64.A63), Long.MIN_VALUE);

        // More than 64 values Enum
        __CLR4_5_2otiotilvha7fue.R.inc(32299);assertArrayEquals(EnumUtils.generateBitVectors(TooMany.class, TooMany.M2), 1L, 0L);
        __CLR4_5_2otiotilvha7fue.R.inc(32300);assertArrayEquals(EnumUtils.generateBitVectors(TooMany.class, TooMany.L2, TooMany.M2), 1L, (1L << 63));

    }finally{__CLR4_5_2otiotilvha7fue.R.flushNeeded();}}

    private void assertArrayEquals(final long[] actual, final long... expected) {try{__CLR4_5_2otiotilvha7fue.R.inc(32301);
        __CLR4_5_2otiotilvha7fue.R.inc(32302);Assert.assertArrayEquals(expected, actual);
    }finally{__CLR4_5_2otiotilvha7fue.R.flushNeeded();}}

    @Test(expected=NullPointerException.class)
    public void test_processBitVector_nullClass() {__CLR4_5_2otiotilvha7fue.R.globalSliceStart(getClass().getName(),32303);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2uaay61oxb();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,95,112,114,111,99,101,115,115,66,105,116,86,101,99,116,111,114,95,110,117,108,108,67,108,97,115,115,58,32,91,78,117,108,108,80,111,105,110,116,101,114,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NullPointerException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2otiotilvha7fue.R.rethrow($CLV_t2$);}finally{__CLR4_5_2otiotilvha7fue.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.EnumUtilsTest.test_processBitVector_nullClass",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),32303,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2uaay61oxb(){try{__CLR4_5_2otiotilvha7fue.R.inc(32303);
        __CLR4_5_2otiotilvha7fue.R.inc(32304);final Class<Traffic> empty = null;
        __CLR4_5_2otiotilvha7fue.R.inc(32305);EnumUtils.processBitVector(empty, 0L);
    }finally{__CLR4_5_2otiotilvha7fue.R.flushNeeded();}}

    @Test(expected=NullPointerException.class)
    public void test_processBitVectors_nullClass() {__CLR4_5_2otiotilvha7fue.R.globalSliceStart(getClass().getName(),32306);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_255ov0ioxe();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,95,112,114,111,99,101,115,115,66,105,116,86,101,99,116,111,114,115,95,110,117,108,108,67,108,97,115,115,58,32,91,78,117,108,108,80,111,105,110,116,101,114,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NullPointerException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2otiotilvha7fue.R.rethrow($CLV_t2$);}finally{__CLR4_5_2otiotilvha7fue.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.EnumUtilsTest.test_processBitVectors_nullClass",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),32306,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_255ov0ioxe(){try{__CLR4_5_2otiotilvha7fue.R.inc(32306);
        __CLR4_5_2otiotilvha7fue.R.inc(32307);final Class<Traffic> empty = null;
        __CLR4_5_2otiotilvha7fue.R.inc(32308);EnumUtils.processBitVectors(empty, 0L);
    }finally{__CLR4_5_2otiotilvha7fue.R.flushNeeded();}}

    @Test
    public void test_processBitVector() {__CLR4_5_2otiotilvha7fue.R.globalSliceStart(getClass().getName(),32309);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hp3wx7oxh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2otiotilvha7fue.R.rethrow($CLV_t2$);}finally{__CLR4_5_2otiotilvha7fue.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.EnumUtilsTest.test_processBitVector",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),32309,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hp3wx7oxh(){try{__CLR4_5_2otiotilvha7fue.R.inc(32309);
        __CLR4_5_2otiotilvha7fue.R.inc(32310);assertEquals(EnumSet.noneOf(Traffic.class), EnumUtils.processBitVector(Traffic.class, 0L));
        __CLR4_5_2otiotilvha7fue.R.inc(32311);assertEquals(EnumSet.of(Traffic.RED), EnumUtils.processBitVector(Traffic.class, 1L));
        __CLR4_5_2otiotilvha7fue.R.inc(32312);assertEquals(EnumSet.of(Traffic.AMBER), EnumUtils.processBitVector(Traffic.class, 2L));
        __CLR4_5_2otiotilvha7fue.R.inc(32313);assertEquals(EnumSet.of(Traffic.RED, Traffic.AMBER), EnumUtils.processBitVector(Traffic.class, 3L));
        __CLR4_5_2otiotilvha7fue.R.inc(32314);assertEquals(EnumSet.of(Traffic.GREEN), EnumUtils.processBitVector(Traffic.class, 4L));
        __CLR4_5_2otiotilvha7fue.R.inc(32315);assertEquals(EnumSet.of(Traffic.RED, Traffic.GREEN), EnumUtils.processBitVector(Traffic.class, 5L));
        __CLR4_5_2otiotilvha7fue.R.inc(32316);assertEquals(EnumSet.of(Traffic.AMBER, Traffic.GREEN), EnumUtils.processBitVector(Traffic.class, 6L));
        __CLR4_5_2otiotilvha7fue.R.inc(32317);assertEquals(EnumSet.of(Traffic.RED, Traffic.AMBER, Traffic.GREEN), EnumUtils.processBitVector(Traffic.class, 7L));

        // 64 values Enum (to test whether no int<->long jdk convertion issue exists)
        __CLR4_5_2otiotilvha7fue.R.inc(32318);assertEquals(EnumSet.of(Enum64.A31), EnumUtils.processBitVector(Enum64.class, (1L << 31)));
        __CLR4_5_2otiotilvha7fue.R.inc(32319);assertEquals(EnumSet.of(Enum64.A32), EnumUtils.processBitVector(Enum64.class, (1L << 32)));
        __CLR4_5_2otiotilvha7fue.R.inc(32320);assertEquals(EnumSet.of(Enum64.A63), EnumUtils.processBitVector(Enum64.class, (1L << 63)));
        __CLR4_5_2otiotilvha7fue.R.inc(32321);assertEquals(EnumSet.of(Enum64.A63), EnumUtils.processBitVector(Enum64.class, Long.MIN_VALUE));
    }finally{__CLR4_5_2otiotilvha7fue.R.flushNeeded();}}

    @Test
    public void test_processBitVectors() {__CLR4_5_2otiotilvha7fue.R.globalSliceStart(getClass().getName(),32322);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2agj2nooxu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2otiotilvha7fue.R.rethrow($CLV_t2$);}finally{__CLR4_5_2otiotilvha7fue.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.EnumUtilsTest.test_processBitVectors",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),32322,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2agj2nooxu(){try{__CLR4_5_2otiotilvha7fue.R.inc(32322);
        __CLR4_5_2otiotilvha7fue.R.inc(32323);assertEquals(EnumSet.noneOf(Traffic.class), EnumUtils.processBitVectors(Traffic.class, 0L));
        __CLR4_5_2otiotilvha7fue.R.inc(32324);assertEquals(EnumSet.of(Traffic.RED), EnumUtils.processBitVectors(Traffic.class, 1L));
        __CLR4_5_2otiotilvha7fue.R.inc(32325);assertEquals(EnumSet.of(Traffic.AMBER), EnumUtils.processBitVectors(Traffic.class, 2L));
        __CLR4_5_2otiotilvha7fue.R.inc(32326);assertEquals(EnumSet.of(Traffic.RED, Traffic.AMBER), EnumUtils.processBitVectors(Traffic.class, 3L));
        __CLR4_5_2otiotilvha7fue.R.inc(32327);assertEquals(EnumSet.of(Traffic.GREEN), EnumUtils.processBitVectors(Traffic.class, 4L));
        __CLR4_5_2otiotilvha7fue.R.inc(32328);assertEquals(EnumSet.of(Traffic.RED, Traffic.GREEN), EnumUtils.processBitVectors(Traffic.class, 5L));
        __CLR4_5_2otiotilvha7fue.R.inc(32329);assertEquals(EnumSet.of(Traffic.AMBER, Traffic.GREEN), EnumUtils.processBitVectors(Traffic.class, 6L));
        __CLR4_5_2otiotilvha7fue.R.inc(32330);assertEquals(EnumSet.of(Traffic.RED, Traffic.AMBER, Traffic.GREEN), EnumUtils.processBitVectors(Traffic.class, 7L));

        __CLR4_5_2otiotilvha7fue.R.inc(32331);assertEquals(EnumSet.noneOf(Traffic.class), EnumUtils.processBitVectors(Traffic.class, 0L, 0L));
        __CLR4_5_2otiotilvha7fue.R.inc(32332);assertEquals(EnumSet.of(Traffic.RED), EnumUtils.processBitVectors(Traffic.class, 0L, 1L));
        __CLR4_5_2otiotilvha7fue.R.inc(32333);assertEquals(EnumSet.of(Traffic.AMBER), EnumUtils.processBitVectors(Traffic.class, 0L, 2L));
        __CLR4_5_2otiotilvha7fue.R.inc(32334);assertEquals(EnumSet.of(Traffic.RED, Traffic.AMBER), EnumUtils.processBitVectors(Traffic.class, 0L, 3L));
        __CLR4_5_2otiotilvha7fue.R.inc(32335);assertEquals(EnumSet.of(Traffic.GREEN), EnumUtils.processBitVectors(Traffic.class, 0L, 4L));
        __CLR4_5_2otiotilvha7fue.R.inc(32336);assertEquals(EnumSet.of(Traffic.RED, Traffic.GREEN), EnumUtils.processBitVectors(Traffic.class, 0L, 5L));
        __CLR4_5_2otiotilvha7fue.R.inc(32337);assertEquals(EnumSet.of(Traffic.AMBER, Traffic.GREEN), EnumUtils.processBitVectors(Traffic.class, 0L, 6L));
        __CLR4_5_2otiotilvha7fue.R.inc(32338);assertEquals(EnumSet.of(Traffic.RED, Traffic.AMBER, Traffic.GREEN), EnumUtils.processBitVectors(Traffic.class, 0L, 7L));

        // demonstrate tolerance of irrelevant high-order digits:
        __CLR4_5_2otiotilvha7fue.R.inc(32339);assertEquals(EnumSet.noneOf(Traffic.class), EnumUtils.processBitVectors(Traffic.class, 666L, 0L));
        __CLR4_5_2otiotilvha7fue.R.inc(32340);assertEquals(EnumSet.of(Traffic.RED), EnumUtils.processBitVectors(Traffic.class, 666L, 1L));
        __CLR4_5_2otiotilvha7fue.R.inc(32341);assertEquals(EnumSet.of(Traffic.AMBER), EnumUtils.processBitVectors(Traffic.class, 666L, 2L));
        __CLR4_5_2otiotilvha7fue.R.inc(32342);assertEquals(EnumSet.of(Traffic.RED, Traffic.AMBER), EnumUtils.processBitVectors(Traffic.class, 666L, 3L));
        __CLR4_5_2otiotilvha7fue.R.inc(32343);assertEquals(EnumSet.of(Traffic.GREEN), EnumUtils.processBitVectors(Traffic.class, 666L, 4L));
        __CLR4_5_2otiotilvha7fue.R.inc(32344);assertEquals(EnumSet.of(Traffic.RED, Traffic.GREEN), EnumUtils.processBitVectors(Traffic.class, 666L, 5L));
        __CLR4_5_2otiotilvha7fue.R.inc(32345);assertEquals(EnumSet.of(Traffic.AMBER, Traffic.GREEN), EnumUtils.processBitVectors(Traffic.class, 666L, 6L));
        __CLR4_5_2otiotilvha7fue.R.inc(32346);assertEquals(EnumSet.of(Traffic.RED, Traffic.AMBER, Traffic.GREEN), EnumUtils.processBitVectors(Traffic.class, 666L, 7L));

        // 64 values Enum (to test whether no int<->long jdk convertion issue exists)
        __CLR4_5_2otiotilvha7fue.R.inc(32347);assertEquals(EnumSet.of(Enum64.A31), EnumUtils.processBitVectors(Enum64.class, (1L << 31)));
        __CLR4_5_2otiotilvha7fue.R.inc(32348);assertEquals(EnumSet.of(Enum64.A32), EnumUtils.processBitVectors(Enum64.class, (1L << 32)));
        __CLR4_5_2otiotilvha7fue.R.inc(32349);assertEquals(EnumSet.of(Enum64.A63), EnumUtils.processBitVectors(Enum64.class, (1L << 63)));
        __CLR4_5_2otiotilvha7fue.R.inc(32350);assertEquals(EnumSet.of(Enum64.A63), EnumUtils.processBitVectors(Enum64.class, Long.MIN_VALUE));
    }finally{__CLR4_5_2otiotilvha7fue.R.flushNeeded();}}

    @Test(expected=IllegalArgumentException.class)
    public void test_processBitVector_longClass() {__CLR4_5_2otiotilvha7fue.R.globalSliceStart(getClass().getName(),32351);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2iufu6oyn();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,95,112,114,111,99,101,115,115,66,105,116,86,101,99,116,111,114,95,108,111,110,103,67,108,97,115,115,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2otiotilvha7fue.R.rethrow($CLV_t2$);}finally{__CLR4_5_2otiotilvha7fue.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.EnumUtilsTest.test_processBitVector_longClass",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),32351,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2iufu6oyn(){try{__CLR4_5_2otiotilvha7fue.R.inc(32351);
        __CLR4_5_2otiotilvha7fue.R.inc(32352);EnumUtils.processBitVector(TooMany.class, 0L);
    }finally{__CLR4_5_2otiotilvha7fue.R.flushNeeded();}}
    
    public void test_processBitVectors_longClass() {__CLR4_5_2otiotilvha7fue.R.globalSliceStart(getClass().getName(),32353);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2olrnbdoyp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2otiotilvha7fue.R.rethrow($CLV_t2$);}finally{__CLR4_5_2otiotilvha7fue.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.EnumUtilsTest.test_processBitVectors_longClass",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),32353,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2olrnbdoyp(){try{__CLR4_5_2otiotilvha7fue.R.inc(32353);
        __CLR4_5_2otiotilvha7fue.R.inc(32354);assertEquals(EnumSet.noneOf(TooMany.class), EnumUtils.processBitVectors(TooMany.class, 0L));
        __CLR4_5_2otiotilvha7fue.R.inc(32355);assertEquals(EnumSet.of(TooMany.A), EnumUtils.processBitVectors(TooMany.class, 1L));
        __CLR4_5_2otiotilvha7fue.R.inc(32356);assertEquals(EnumSet.of(TooMany.B), EnumUtils.processBitVectors(TooMany.class, 2L));
        __CLR4_5_2otiotilvha7fue.R.inc(32357);assertEquals(EnumSet.of(TooMany.A, TooMany.B), EnumUtils.processBitVectors(TooMany.class, 3L));
        __CLR4_5_2otiotilvha7fue.R.inc(32358);assertEquals(EnumSet.of(TooMany.C), EnumUtils.processBitVectors(TooMany.class, 4L));
        __CLR4_5_2otiotilvha7fue.R.inc(32359);assertEquals(EnumSet.of(TooMany.A, TooMany.C), EnumUtils.processBitVectors(TooMany.class, 5L));
        __CLR4_5_2otiotilvha7fue.R.inc(32360);assertEquals(EnumSet.of(TooMany.B, TooMany.C), EnumUtils.processBitVectors(TooMany.class, 6L));
        __CLR4_5_2otiotilvha7fue.R.inc(32361);assertEquals(EnumSet.of(TooMany.A, TooMany.B, TooMany.C), EnumUtils.processBitVectors(TooMany.class, 7L));

        __CLR4_5_2otiotilvha7fue.R.inc(32362);assertEquals(EnumSet.noneOf(TooMany.class), EnumUtils.processBitVectors(TooMany.class, 0L, 0L));
        __CLR4_5_2otiotilvha7fue.R.inc(32363);assertEquals(EnumSet.of(TooMany.A), EnumUtils.processBitVectors(TooMany.class, 0L, 1L));
        __CLR4_5_2otiotilvha7fue.R.inc(32364);assertEquals(EnumSet.of(TooMany.B), EnumUtils.processBitVectors(TooMany.class, 0L, 2L));
        __CLR4_5_2otiotilvha7fue.R.inc(32365);assertEquals(EnumSet.of(TooMany.A, TooMany.B), EnumUtils.processBitVectors(TooMany.class, 0L, 3L));
        __CLR4_5_2otiotilvha7fue.R.inc(32366);assertEquals(EnumSet.of(TooMany.C), EnumUtils.processBitVectors(TooMany.class, 0L, 4L));
        __CLR4_5_2otiotilvha7fue.R.inc(32367);assertEquals(EnumSet.of(TooMany.A, TooMany.C), EnumUtils.processBitVectors(TooMany.class, 0L, 5L));
        __CLR4_5_2otiotilvha7fue.R.inc(32368);assertEquals(EnumSet.of(TooMany.B, TooMany.C), EnumUtils.processBitVectors(TooMany.class, 0L, 6L));
        __CLR4_5_2otiotilvha7fue.R.inc(32369);assertEquals(EnumSet.of(TooMany.A, TooMany.B, TooMany.C), EnumUtils.processBitVectors(TooMany.class, 0L, 7L));
        __CLR4_5_2otiotilvha7fue.R.inc(32370);assertEquals(EnumSet.of(TooMany.A, TooMany.B, TooMany.C), EnumUtils.processBitVectors(TooMany.class, 0L, 7L));

        __CLR4_5_2otiotilvha7fue.R.inc(32371);assertEquals(EnumSet.of(TooMany.M2), EnumUtils.processBitVectors(TooMany.class, 1L, 0L));
        __CLR4_5_2otiotilvha7fue.R.inc(32372);assertEquals(EnumSet.of(TooMany.A, TooMany.M2), EnumUtils.processBitVectors(TooMany.class, 1L, 1L));
        __CLR4_5_2otiotilvha7fue.R.inc(32373);assertEquals(EnumSet.of(TooMany.B, TooMany.M2), EnumUtils.processBitVectors(TooMany.class, 1L, 2L));
        __CLR4_5_2otiotilvha7fue.R.inc(32374);assertEquals(EnumSet.of(TooMany.A, TooMany.B, TooMany.M2), EnumUtils.processBitVectors(TooMany.class, 1L, 3L));
        __CLR4_5_2otiotilvha7fue.R.inc(32375);assertEquals(EnumSet.of(TooMany.C, TooMany.M2), EnumUtils.processBitVectors(TooMany.class, 1L, 4L));
        __CLR4_5_2otiotilvha7fue.R.inc(32376);assertEquals(EnumSet.of(TooMany.A, TooMany.C, TooMany.M2), EnumUtils.processBitVectors(TooMany.class, 1L, 5L));
        __CLR4_5_2otiotilvha7fue.R.inc(32377);assertEquals(EnumSet.of(TooMany.B, TooMany.C, TooMany.M2), EnumUtils.processBitVectors(TooMany.class, 1L, 6L));
        __CLR4_5_2otiotilvha7fue.R.inc(32378);assertEquals(EnumSet.of(TooMany.A, TooMany.B, TooMany.C, TooMany.M2), EnumUtils.processBitVectors(TooMany.class, 1L, 7L));
        __CLR4_5_2otiotilvha7fue.R.inc(32379);assertEquals(EnumSet.of(TooMany.A, TooMany.B, TooMany.C, TooMany.M2), EnumUtils.processBitVectors(TooMany.class, 1L, 7L));

        // demonstrate tolerance of irrelevant high-order digits:
        __CLR4_5_2otiotilvha7fue.R.inc(32380);assertEquals(EnumSet.of(TooMany.M2), EnumUtils.processBitVectors(TooMany.class, 9L, 0L));
        __CLR4_5_2otiotilvha7fue.R.inc(32381);assertEquals(EnumSet.of(TooMany.A, TooMany.M2), EnumUtils.processBitVectors(TooMany.class, 9L, 1L));
        __CLR4_5_2otiotilvha7fue.R.inc(32382);assertEquals(EnumSet.of(TooMany.B, TooMany.M2), EnumUtils.processBitVectors(TooMany.class, 9L, 2L));
        __CLR4_5_2otiotilvha7fue.R.inc(32383);assertEquals(EnumSet.of(TooMany.A, TooMany.B, TooMany.M2), EnumUtils.processBitVectors(TooMany.class, 9L, 3L));
        __CLR4_5_2otiotilvha7fue.R.inc(32384);assertEquals(EnumSet.of(TooMany.C, TooMany.M2), EnumUtils.processBitVectors(TooMany.class, 9L, 4L));
        __CLR4_5_2otiotilvha7fue.R.inc(32385);assertEquals(EnumSet.of(TooMany.A, TooMany.C, TooMany.M2), EnumUtils.processBitVectors(TooMany.class, 9L, 5L));
        __CLR4_5_2otiotilvha7fue.R.inc(32386);assertEquals(EnumSet.of(TooMany.B, TooMany.C, TooMany.M2), EnumUtils.processBitVectors(TooMany.class, 9L, 6L));
        __CLR4_5_2otiotilvha7fue.R.inc(32387);assertEquals(EnumSet.of(TooMany.A, TooMany.B, TooMany.C, TooMany.M2), EnumUtils.processBitVectors(TooMany.class, 9L, 7L));
        __CLR4_5_2otiotilvha7fue.R.inc(32388);assertEquals(EnumSet.of(TooMany.A, TooMany.B, TooMany.C, TooMany.M2), EnumUtils.processBitVectors(TooMany.class, 9L, 7L));
    }finally{__CLR4_5_2otiotilvha7fue.R.flushNeeded();}}

}

enum Traffic {
    RED, AMBER, GREEN
}

enum Enum64 {
    A00, A01, A02, A03, A04, A05, A06, A07, A08, A09, A10, A11, A12, A13, A14, A15,
    A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31,
    A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47,
    A48, A49, A50, A51, A52, A53, A54, A55, A56, A57, A58, A59, A60, A61, A62, A63
}

enum TooMany {
    A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z,
    A1, B1, C1, D1, E1, F1, G1, H1, I1, J1, K1, L1, M1, N1, O1, P1, Q1, R1, S1, T1,
    U1, V1, W1, X1, Y1, Z1, A2, B2, C2, D2, E2, F2, G2, H2, I2, J2, K2, L2, M2
}
