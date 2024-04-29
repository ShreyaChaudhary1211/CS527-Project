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
package org.apache.commons.lang3;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

import org.junit.Test;

/**
 * Unit tests {@link org.apache.commons.lang3.BooleanUtils}.
 */
public class BooleanUtilsTest {static class __CLR4_5_2mhnmhnlvha7fd9{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172763741L,8589935092L,29510,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    //-----------------------------------------------------------------------
    @Test
    public void testConstructor() {__CLR4_5_2mhnmhnlvha7fd9.R.globalSliceStart(getClass().getName(),29147);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2uefs8hmhn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2mhnmhnlvha7fd9.R.rethrow($CLV_t2$);}finally{__CLR4_5_2mhnmhnlvha7fd9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.BooleanUtilsTest.testConstructor",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),29147,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2uefs8hmhn(){try{__CLR4_5_2mhnmhnlvha7fd9.R.inc(29147);
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29148);assertNotNull(new BooleanUtils());
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29149);final Constructor<?>[] cons = BooleanUtils.class.getDeclaredConstructors();
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29150);assertEquals(1, cons.length);
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29151);assertTrue(Modifier.isPublic(cons[0].getModifiers()));
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29152);assertTrue(Modifier.isPublic(BooleanUtils.class.getModifiers()));
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29153);assertFalse(Modifier.isFinal(BooleanUtils.class.getModifiers()));
    }finally{__CLR4_5_2mhnmhnlvha7fd9.R.flushNeeded();}}
    
    //-----------------------------------------------------------------------
    @Test
    public void test_negate_Boolean() {__CLR4_5_2mhnmhnlvha7fd9.R.globalSliceStart(getClass().getName(),29154);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2otwnttmhu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2mhnmhnlvha7fd9.R.rethrow($CLV_t2$);}finally{__CLR4_5_2mhnmhnlvha7fd9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.BooleanUtilsTest.test_negate_Boolean",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),29154,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2otwnttmhu(){try{__CLR4_5_2mhnmhnlvha7fd9.R.inc(29154);
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29155);assertSame(null, BooleanUtils.negate(null));
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29156);assertSame(Boolean.TRUE, BooleanUtils.negate(Boolean.FALSE));
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29157);assertSame(Boolean.FALSE, BooleanUtils.negate(Boolean.TRUE));
    }finally{__CLR4_5_2mhnmhnlvha7fd9.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void test_isTrue_Boolean() {__CLR4_5_2mhnmhnlvha7fd9.R.globalSliceStart(getClass().getName(),29158);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2yzm3jpmhy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2mhnmhnlvha7fd9.R.rethrow($CLV_t2$);}finally{__CLR4_5_2mhnmhnlvha7fd9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.BooleanUtilsTest.test_isTrue_Boolean",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),29158,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2yzm3jpmhy(){try{__CLR4_5_2mhnmhnlvha7fd9.R.inc(29158);
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29159);assertTrue(BooleanUtils.isTrue(Boolean.TRUE));
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29160);assertFalse(BooleanUtils.isTrue(Boolean.FALSE));
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29161);assertFalse(BooleanUtils.isTrue(null));
    }finally{__CLR4_5_2mhnmhnlvha7fd9.R.flushNeeded();}}

    @Test
    public void test_isNotTrue_Boolean() {__CLR4_5_2mhnmhnlvha7fd9.R.globalSliceStart(getClass().getName(),29162);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2sorarqmi2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2mhnmhnlvha7fd9.R.rethrow($CLV_t2$);}finally{__CLR4_5_2mhnmhnlvha7fd9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.BooleanUtilsTest.test_isNotTrue_Boolean",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),29162,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2sorarqmi2(){try{__CLR4_5_2mhnmhnlvha7fd9.R.inc(29162);
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29163);assertFalse(BooleanUtils.isNotTrue(Boolean.TRUE));
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29164);assertTrue(BooleanUtils.isNotTrue(Boolean.FALSE));
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29165);assertTrue(BooleanUtils.isNotTrue(null));
    }finally{__CLR4_5_2mhnmhnlvha7fd9.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void test_isFalse_Boolean() {__CLR4_5_2mhnmhnlvha7fd9.R.globalSliceStart(getClass().getName(),29166);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_284ppusmi6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2mhnmhnlvha7fd9.R.rethrow($CLV_t2$);}finally{__CLR4_5_2mhnmhnlvha7fd9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.BooleanUtilsTest.test_isFalse_Boolean",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),29166,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_284ppusmi6(){try{__CLR4_5_2mhnmhnlvha7fd9.R.inc(29166);
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29167);assertFalse(BooleanUtils.isFalse(Boolean.TRUE));
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29168);assertTrue(BooleanUtils.isFalse(Boolean.FALSE));
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29169);assertFalse(BooleanUtils.isFalse(null));
    }finally{__CLR4_5_2mhnmhnlvha7fd9.R.flushNeeded();}}

    @Test
    public void test_isNotFalse_Boolean() {__CLR4_5_2mhnmhnlvha7fd9.R.globalSliceStart(getClass().getName(),29170);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26qwhmfmia();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2mhnmhnlvha7fd9.R.rethrow($CLV_t2$);}finally{__CLR4_5_2mhnmhnlvha7fd9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.BooleanUtilsTest.test_isNotFalse_Boolean",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),29170,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26qwhmfmia(){try{__CLR4_5_2mhnmhnlvha7fd9.R.inc(29170);
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29171);assertTrue(BooleanUtils.isNotFalse(Boolean.TRUE));
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29172);assertFalse(BooleanUtils.isNotFalse(Boolean.FALSE));
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29173);assertTrue(BooleanUtils.isNotFalse(null));
    }finally{__CLR4_5_2mhnmhnlvha7fd9.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void test_toBoolean_Boolean() {__CLR4_5_2mhnmhnlvha7fd9.R.globalSliceStart(getClass().getName(),29174);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gzm0k0mie();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2mhnmhnlvha7fd9.R.rethrow($CLV_t2$);}finally{__CLR4_5_2mhnmhnlvha7fd9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.BooleanUtilsTest.test_toBoolean_Boolean",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),29174,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gzm0k0mie(){try{__CLR4_5_2mhnmhnlvha7fd9.R.inc(29174);
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29175);assertTrue(BooleanUtils.toBoolean(Boolean.TRUE));
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29176);assertFalse(BooleanUtils.toBoolean(Boolean.FALSE));
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29177);assertFalse(BooleanUtils.toBoolean((Boolean) null));
    }finally{__CLR4_5_2mhnmhnlvha7fd9.R.flushNeeded();}}

    @Test
    public void test_toBooleanDefaultIfNull_Boolean_boolean() {__CLR4_5_2mhnmhnlvha7fd9.R.globalSliceStart(getClass().getName(),29178);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hwzb4umii();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2mhnmhnlvha7fd9.R.rethrow($CLV_t2$);}finally{__CLR4_5_2mhnmhnlvha7fd9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.BooleanUtilsTest.test_toBooleanDefaultIfNull_Boolean_boolean",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),29178,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hwzb4umii(){try{__CLR4_5_2mhnmhnlvha7fd9.R.inc(29178);
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29179);assertTrue(BooleanUtils.toBooleanDefaultIfNull(Boolean.TRUE, true));
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29180);assertTrue(BooleanUtils.toBooleanDefaultIfNull(Boolean.TRUE, false));
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29181);assertFalse(BooleanUtils.toBooleanDefaultIfNull(Boolean.FALSE, true));
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29182);assertFalse(BooleanUtils.toBooleanDefaultIfNull(Boolean.FALSE, false));
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29183);assertTrue(BooleanUtils.toBooleanDefaultIfNull(null, true));
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29184);assertFalse(BooleanUtils.toBooleanDefaultIfNull(null, false));
    }finally{__CLR4_5_2mhnmhnlvha7fd9.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    //-----------------------------------------------------------------------
    @Test
    public void test_toBoolean_int() {__CLR4_5_2mhnmhnlvha7fd9.R.globalSliceStart(getClass().getName(),29185);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2r4o6yfmip();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2mhnmhnlvha7fd9.R.rethrow($CLV_t2$);}finally{__CLR4_5_2mhnmhnlvha7fd9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.BooleanUtilsTest.test_toBoolean_int",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),29185,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2r4o6yfmip(){try{__CLR4_5_2mhnmhnlvha7fd9.R.inc(29185);
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29186);assertTrue(BooleanUtils.toBoolean(1));
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29187);assertTrue(BooleanUtils.toBoolean(-1));
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29188);assertFalse(BooleanUtils.toBoolean(0));
    }finally{__CLR4_5_2mhnmhnlvha7fd9.R.flushNeeded();}}
    
    @Test
    public void test_toBooleanObject_int() {__CLR4_5_2mhnmhnlvha7fd9.R.globalSliceStart(getClass().getName(),29189);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2b2cc3amit();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2mhnmhnlvha7fd9.R.rethrow($CLV_t2$);}finally{__CLR4_5_2mhnmhnlvha7fd9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.BooleanUtilsTest.test_toBooleanObject_int",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),29189,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2b2cc3amit(){try{__CLR4_5_2mhnmhnlvha7fd9.R.inc(29189);
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29190);assertEquals(Boolean.TRUE, BooleanUtils.toBooleanObject(1));
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29191);assertEquals(Boolean.TRUE, BooleanUtils.toBooleanObject(-1));
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29192);assertEquals(Boolean.FALSE, BooleanUtils.toBooleanObject(0));
    }finally{__CLR4_5_2mhnmhnlvha7fd9.R.flushNeeded();}}
    
    @Test
    public void test_toBooleanObject_Integer() {__CLR4_5_2mhnmhnlvha7fd9.R.globalSliceStart(getClass().getName(),29193);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jf06t7mix();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2mhnmhnlvha7fd9.R.rethrow($CLV_t2$);}finally{__CLR4_5_2mhnmhnlvha7fd9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.BooleanUtilsTest.test_toBooleanObject_Integer",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),29193,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jf06t7mix(){try{__CLR4_5_2mhnmhnlvha7fd9.R.inc(29193);
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29194);assertEquals(Boolean.TRUE, BooleanUtils.toBooleanObject(Integer.valueOf(1)));
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29195);assertEquals(Boolean.TRUE, BooleanUtils.toBooleanObject(Integer.valueOf(-1)));
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29196);assertEquals(Boolean.FALSE, BooleanUtils.toBooleanObject(Integer.valueOf(0)));
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29197);assertEquals(null, BooleanUtils.toBooleanObject((Integer) null));
    }finally{__CLR4_5_2mhnmhnlvha7fd9.R.flushNeeded();}}
    
    //-----------------------------------------------------------------------
    @Test
    public void test_toBoolean_int_int_int() {__CLR4_5_2mhnmhnlvha7fd9.R.globalSliceStart(getClass().getName(),29198);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2wpvg4pmj2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2mhnmhnlvha7fd9.R.rethrow($CLV_t2$);}finally{__CLR4_5_2mhnmhnlvha7fd9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.BooleanUtilsTest.test_toBoolean_int_int_int",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),29198,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2wpvg4pmj2(){try{__CLR4_5_2mhnmhnlvha7fd9.R.inc(29198);
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29199);assertTrue(BooleanUtils.toBoolean(6, 6, 7));
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29200);assertFalse(BooleanUtils.toBoolean(7, 6, 7));
    }finally{__CLR4_5_2mhnmhnlvha7fd9.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class)
    public void test_toBoolean_int_int_int_noMatch() {__CLR4_5_2mhnmhnlvha7fd9.R.globalSliceStart(getClass().getName(),29201);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23jh9h8mj5();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,95,116,111,66,111,111,108,101,97,110,95,105,110,116,95,105,110,116,95,105,110,116,95,110,111,77,97,116,99,104,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2mhnmhnlvha7fd9.R.rethrow($CLV_t2$);}finally{__CLR4_5_2mhnmhnlvha7fd9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.BooleanUtilsTest.test_toBoolean_int_int_int_noMatch",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),29201,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23jh9h8mj5(){try{__CLR4_5_2mhnmhnlvha7fd9.R.inc(29201);
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29202);BooleanUtils.toBoolean(8, 6, 7);
    }finally{__CLR4_5_2mhnmhnlvha7fd9.R.flushNeeded();}}
    
    @Test
    public void test_toBoolean_Integer_Integer_Integer() {__CLR4_5_2mhnmhnlvha7fd9.R.globalSliceStart(getClass().getName(),29203);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2tlqio4mj7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2mhnmhnlvha7fd9.R.rethrow($CLV_t2$);}finally{__CLR4_5_2mhnmhnlvha7fd9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.BooleanUtilsTest.test_toBoolean_Integer_Integer_Integer",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),29203,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2tlqio4mj7(){try{__CLR4_5_2mhnmhnlvha7fd9.R.inc(29203);
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29204);final Integer six = Integer.valueOf(6);
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29205);final Integer seven = Integer.valueOf(7);

        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29206);assertTrue(BooleanUtils.toBoolean(null, null, seven));
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29207);assertFalse(BooleanUtils.toBoolean(null, six, null));

        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29208);assertTrue(BooleanUtils.toBoolean(Integer.valueOf(6), six, seven));
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29209);assertFalse(BooleanUtils.toBoolean(Integer.valueOf(7), six, seven));
    }finally{__CLR4_5_2mhnmhnlvha7fd9.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class)
    public void test_toBoolean_Integer_Integer_Integer_nullValue() {__CLR4_5_2mhnmhnlvha7fd9.R.globalSliceStart(getClass().getName(),29210);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_294uvprmje();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,95,116,111,66,111,111,108,101,97,110,95,73,110,116,101,103,101,114,95,73,110,116,101,103,101,114,95,73,110,116,101,103,101,114,95,110,117,108,108,86,97,108,117,101,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2mhnmhnlvha7fd9.R.rethrow($CLV_t2$);}finally{__CLR4_5_2mhnmhnlvha7fd9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.BooleanUtilsTest.test_toBoolean_Integer_Integer_Integer_nullValue",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),29210,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_294uvprmje(){try{__CLR4_5_2mhnmhnlvha7fd9.R.inc(29210);
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29211);BooleanUtils.toBoolean(null, Integer.valueOf(6), Integer.valueOf(7));
    }finally{__CLR4_5_2mhnmhnlvha7fd9.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class)
    public void test_toBoolean_Integer_Integer_Integer_noMatch() {__CLR4_5_2mhnmhnlvha7fd9.R.globalSliceStart(getClass().getName(),29212);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2b4vxw7mjg();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,95,116,111,66,111,111,108,101,97,110,95,73,110,116,101,103,101,114,95,73,110,116,101,103,101,114,95,73,110,116,101,103,101,114,95,110,111,77,97,116,99,104,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2mhnmhnlvha7fd9.R.rethrow($CLV_t2$);}finally{__CLR4_5_2mhnmhnlvha7fd9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.BooleanUtilsTest.test_toBoolean_Integer_Integer_Integer_noMatch",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),29212,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2b4vxw7mjg(){try{__CLR4_5_2mhnmhnlvha7fd9.R.inc(29212);
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29213);BooleanUtils.toBoolean(Integer.valueOf(8), Integer.valueOf(6), Integer.valueOf(7));
    }finally{__CLR4_5_2mhnmhnlvha7fd9.R.flushNeeded();}}
    
    //-----------------------------------------------------------------------
    @Test
    public void test_toBooleanObject_int_int_int() {__CLR4_5_2mhnmhnlvha7fd9.R.globalSliceStart(getClass().getName(),29214);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ya44gmmji();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2mhnmhnlvha7fd9.R.rethrow($CLV_t2$);}finally{__CLR4_5_2mhnmhnlvha7fd9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.BooleanUtilsTest.test_toBooleanObject_int_int_int",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),29214,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ya44gmmji(){try{__CLR4_5_2mhnmhnlvha7fd9.R.inc(29214);
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29215);assertEquals(Boolean.TRUE, BooleanUtils.toBooleanObject(6, 6, 7, 8));
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29216);assertEquals(Boolean.FALSE, BooleanUtils.toBooleanObject(7, 6, 7, 8));
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29217);assertEquals(null, BooleanUtils.toBooleanObject(8, 6, 7, 8));
    }finally{__CLR4_5_2mhnmhnlvha7fd9.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class)
    public void test_toBooleanObject_int_int_int_noMatch() {__CLR4_5_2mhnmhnlvha7fd9.R.globalSliceStart(getClass().getName(),29218);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2mmc98lmjm();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,95,116,111,66,111,111,108,101,97,110,79,98,106,101,99,116,95,105,110,116,95,105,110,116,95,105,110,116,95,110,111,77,97,116,99,104,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2mhnmhnlvha7fd9.R.rethrow($CLV_t2$);}finally{__CLR4_5_2mhnmhnlvha7fd9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.BooleanUtilsTest.test_toBooleanObject_int_int_int_noMatch",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),29218,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2mmc98lmjm(){try{__CLR4_5_2mhnmhnlvha7fd9.R.inc(29218);
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29219);BooleanUtils.toBooleanObject(9, 6, 7, 8);
    }finally{__CLR4_5_2mhnmhnlvha7fd9.R.flushNeeded();}}
    
    @Test
    public void test_toBooleanObject_Integer_Integer_Integer_Integer() {__CLR4_5_2mhnmhnlvha7fd9.R.globalSliceStart(getClass().getName(),29220);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2fqndkymjo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2mhnmhnlvha7fd9.R.rethrow($CLV_t2$);}finally{__CLR4_5_2mhnmhnlvha7fd9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.BooleanUtilsTest.test_toBooleanObject_Integer_Integer_Integer_Integer",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),29220,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2fqndkymjo(){try{__CLR4_5_2mhnmhnlvha7fd9.R.inc(29220);
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29221);final Integer six = Integer.valueOf(6);
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29222);final Integer seven = Integer.valueOf(7);
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29223);final Integer eight = Integer.valueOf(8);

        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29224);assertSame(Boolean.TRUE, BooleanUtils.toBooleanObject(null, null, seven, eight));
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29225);assertSame(Boolean.FALSE, BooleanUtils.toBooleanObject(null, six, null, eight));
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29226);assertSame(null, BooleanUtils.toBooleanObject(null, six, seven, null));

        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29227);assertEquals(Boolean.TRUE, BooleanUtils.toBooleanObject(Integer.valueOf(6), six, seven, eight));
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29228);assertEquals(Boolean.FALSE, BooleanUtils.toBooleanObject(Integer.valueOf(7), six, seven, eight));
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29229);assertEquals(null, BooleanUtils.toBooleanObject(Integer.valueOf(8), six, seven, eight));
    }finally{__CLR4_5_2mhnmhnlvha7fd9.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class)
    public void test_toBooleanObject_Integer_Integer_Integer_Integer_nullValue() {__CLR4_5_2mhnmhnlvha7fd9.R.globalSliceStart(getClass().getName(),29230);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ks667nmjy();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,95,116,111,66,111,111,108,101,97,110,79,98,106,101,99,116,95,73,110,116,101,103,101,114,95,73,110,116,101,103,101,114,95,73,110,116,101,103,101,114,95,73,110,116,101,103,101,114,95,110,117,108,108,86,97,108,117,101,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2mhnmhnlvha7fd9.R.rethrow($CLV_t2$);}finally{__CLR4_5_2mhnmhnlvha7fd9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.BooleanUtilsTest.test_toBooleanObject_Integer_Integer_Integer_Integer_nullValue",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),29230,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ks667nmjy(){try{__CLR4_5_2mhnmhnlvha7fd9.R.inc(29230);
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29231);BooleanUtils.toBooleanObject(null, Integer.valueOf(6), Integer.valueOf(7), Integer.valueOf(8));
    }finally{__CLR4_5_2mhnmhnlvha7fd9.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class)
    public void test_toBooleanObject_Integer_Integer_Integer_Integer_noMatch() {__CLR4_5_2mhnmhnlvha7fd9.R.globalSliceStart(getClass().getName(),29232);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hnqkh3mk0();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,95,116,111,66,111,111,108,101,97,110,79,98,106,101,99,116,95,73,110,116,101,103,101,114,95,73,110,116,101,103,101,114,95,73,110,116,101,103,101,114,95,73,110,116,101,103,101,114,95,110,111,77,97,116,99,104,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2mhnmhnlvha7fd9.R.rethrow($CLV_t2$);}finally{__CLR4_5_2mhnmhnlvha7fd9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.BooleanUtilsTest.test_toBooleanObject_Integer_Integer_Integer_Integer_noMatch",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),29232,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hnqkh3mk0(){try{__CLR4_5_2mhnmhnlvha7fd9.R.inc(29232);
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29233);BooleanUtils.toBooleanObject(Integer.valueOf(9), Integer.valueOf(6), Integer.valueOf(7), Integer.valueOf(8));
    }finally{__CLR4_5_2mhnmhnlvha7fd9.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void test_toInteger_boolean() {__CLR4_5_2mhnmhnlvha7fd9.R.globalSliceStart(getClass().getName(),29234);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2tea76imk2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2mhnmhnlvha7fd9.R.rethrow($CLV_t2$);}finally{__CLR4_5_2mhnmhnlvha7fd9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.BooleanUtilsTest.test_toInteger_boolean",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),29234,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2tea76imk2(){try{__CLR4_5_2mhnmhnlvha7fd9.R.inc(29234);
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29235);assertEquals(1, BooleanUtils.toInteger(true));
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29236);assertEquals(0, BooleanUtils.toInteger(false));
    }finally{__CLR4_5_2mhnmhnlvha7fd9.R.flushNeeded();}}
    
    @Test
    public void test_toIntegerObject_boolean() {__CLR4_5_2mhnmhnlvha7fd9.R.globalSliceStart(getClass().getName(),29237);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2uj02lhmk5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2mhnmhnlvha7fd9.R.rethrow($CLV_t2$);}finally{__CLR4_5_2mhnmhnlvha7fd9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.BooleanUtilsTest.test_toIntegerObject_boolean",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),29237,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2uj02lhmk5(){try{__CLR4_5_2mhnmhnlvha7fd9.R.inc(29237);
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29238);assertEquals(Integer.valueOf(1), BooleanUtils.toIntegerObject(true));
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29239);assertEquals(Integer.valueOf(0), BooleanUtils.toIntegerObject(false));
    }finally{__CLR4_5_2mhnmhnlvha7fd9.R.flushNeeded();}}
    
    @Test
    public void test_toIntegerObject_Boolean() {__CLR4_5_2mhnmhnlvha7fd9.R.globalSliceStart(getClass().getName(),29240);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2qkcdmjmk8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2mhnmhnlvha7fd9.R.rethrow($CLV_t2$);}finally{__CLR4_5_2mhnmhnlvha7fd9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.BooleanUtilsTest.test_toIntegerObject_Boolean",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),29240,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2qkcdmjmk8(){try{__CLR4_5_2mhnmhnlvha7fd9.R.inc(29240);
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29241);assertEquals(Integer.valueOf(1), BooleanUtils.toIntegerObject(Boolean.TRUE));
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29242);assertEquals(Integer.valueOf(0), BooleanUtils.toIntegerObject(Boolean.FALSE));
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29243);assertEquals(null, BooleanUtils.toIntegerObject(null));
    }finally{__CLR4_5_2mhnmhnlvha7fd9.R.flushNeeded();}}
    
    //-----------------------------------------------------------------------
    @Test
    public void test_toInteger_boolean_int_int() {__CLR4_5_2mhnmhnlvha7fd9.R.globalSliceStart(getClass().getName(),29244);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2c15nd2mkc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2mhnmhnlvha7fd9.R.rethrow($CLV_t2$);}finally{__CLR4_5_2mhnmhnlvha7fd9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.BooleanUtilsTest.test_toInteger_boolean_int_int",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),29244,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2c15nd2mkc(){try{__CLR4_5_2mhnmhnlvha7fd9.R.inc(29244);
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29245);assertEquals(6, BooleanUtils.toInteger(true, 6, 7));
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29246);assertEquals(7, BooleanUtils.toInteger(false, 6, 7));
    }finally{__CLR4_5_2mhnmhnlvha7fd9.R.flushNeeded();}}
    
    @Test
    public void test_toInteger_Boolean_int_int_int() {__CLR4_5_2mhnmhnlvha7fd9.R.globalSliceStart(getClass().getName(),29247);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2we680mmkf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2mhnmhnlvha7fd9.R.rethrow($CLV_t2$);}finally{__CLR4_5_2mhnmhnlvha7fd9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.BooleanUtilsTest.test_toInteger_Boolean_int_int_int",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),29247,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2we680mmkf(){try{__CLR4_5_2mhnmhnlvha7fd9.R.inc(29247);
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29248);assertEquals(6, BooleanUtils.toInteger(Boolean.TRUE, 6, 7, 8));
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29249);assertEquals(7, BooleanUtils.toInteger(Boolean.FALSE, 6, 7, 8));
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29250);assertEquals(8, BooleanUtils.toInteger(null, 6, 7, 8));
    }finally{__CLR4_5_2mhnmhnlvha7fd9.R.flushNeeded();}}
    
    @Test
    public void test_toIntegerObject_boolean_Integer_Integer() {__CLR4_5_2mhnmhnlvha7fd9.R.globalSliceStart(getClass().getName(),29251);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2xho5wdmkj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2mhnmhnlvha7fd9.R.rethrow($CLV_t2$);}finally{__CLR4_5_2mhnmhnlvha7fd9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.BooleanUtilsTest.test_toIntegerObject_boolean_Integer_Integer",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),29251,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2xho5wdmkj(){try{__CLR4_5_2mhnmhnlvha7fd9.R.inc(29251);
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29252);final Integer six = Integer.valueOf(6);
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29253);final Integer seven = Integer.valueOf(7);
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29254);assertEquals(six, BooleanUtils.toIntegerObject(true, six, seven));
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29255);assertEquals(seven, BooleanUtils.toIntegerObject(false, six, seven));
    }finally{__CLR4_5_2mhnmhnlvha7fd9.R.flushNeeded();}}
    
    @Test
    public void test_toIntegerObject_Boolean_Integer_Integer_Integer() {__CLR4_5_2mhnmhnlvha7fd9.R.globalSliceStart(getClass().getName(),29256);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2obgq9qmko();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2mhnmhnlvha7fd9.R.rethrow($CLV_t2$);}finally{__CLR4_5_2mhnmhnlvha7fd9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.BooleanUtilsTest.test_toIntegerObject_Boolean_Integer_Integer_Integer",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),29256,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2obgq9qmko(){try{__CLR4_5_2mhnmhnlvha7fd9.R.inc(29256);
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29257);final Integer six = Integer.valueOf(6);
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29258);final Integer seven = Integer.valueOf(7);
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29259);final Integer eight = Integer.valueOf(8);
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29260);assertEquals(six, BooleanUtils.toIntegerObject(Boolean.TRUE, six, seven, eight));
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29261);assertEquals(seven, BooleanUtils.toIntegerObject(Boolean.FALSE, six, seven, eight));
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29262);assertEquals(eight, BooleanUtils.toIntegerObject(null, six, seven, eight));
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29263);assertEquals(null, BooleanUtils.toIntegerObject(null, six, seven, null));
    }finally{__CLR4_5_2mhnmhnlvha7fd9.R.flushNeeded();}}
    
    //-----------------------------------------------------------------------
    //-----------------------------------------------------------------------
    @Test
    public void test_toBooleanObject_String() {__CLR4_5_2mhnmhnlvha7fd9.R.globalSliceStart(getClass().getName(),29264);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2bbpym0mkw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2mhnmhnlvha7fd9.R.rethrow($CLV_t2$);}finally{__CLR4_5_2mhnmhnlvha7fd9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.BooleanUtilsTest.test_toBooleanObject_String",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),29264,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2bbpym0mkw(){try{__CLR4_5_2mhnmhnlvha7fd9.R.inc(29264);
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29265);assertEquals(null, BooleanUtils.toBooleanObject((String) null));
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29266);assertEquals(null, BooleanUtils.toBooleanObject(""));
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29267);assertEquals(Boolean.FALSE, BooleanUtils.toBooleanObject("false"));
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29268);assertEquals(Boolean.FALSE, BooleanUtils.toBooleanObject("no"));
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29269);assertEquals(Boolean.FALSE, BooleanUtils.toBooleanObject("off"));
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29270);assertEquals(Boolean.FALSE, BooleanUtils.toBooleanObject("FALSE"));
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29271);assertEquals(Boolean.FALSE, BooleanUtils.toBooleanObject("NO"));
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29272);assertEquals(Boolean.FALSE, BooleanUtils.toBooleanObject("OFF"));
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29273);assertEquals(null, BooleanUtils.toBooleanObject("oof"));
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29274);assertEquals(Boolean.TRUE, BooleanUtils.toBooleanObject("true"));
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29275);assertEquals(Boolean.TRUE, BooleanUtils.toBooleanObject("yes"));
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29276);assertEquals(Boolean.TRUE, BooleanUtils.toBooleanObject("on"));
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29277);assertEquals(Boolean.TRUE, BooleanUtils.toBooleanObject("TRUE"));
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29278);assertEquals(Boolean.TRUE, BooleanUtils.toBooleanObject("ON"));
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29279);assertEquals(Boolean.TRUE, BooleanUtils.toBooleanObject("YES"));
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29280);assertEquals(Boolean.TRUE, BooleanUtils.toBooleanObject("TruE"));
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29281);assertEquals(Boolean.TRUE, BooleanUtils.toBooleanObject("TruE"));

        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29282);assertEquals(Boolean.TRUE, BooleanUtils.toBooleanObject("y")); // yes
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29283);assertEquals(Boolean.TRUE, BooleanUtils.toBooleanObject("Y"));
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29284);assertEquals(Boolean.TRUE, BooleanUtils.toBooleanObject("t")); // true
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29285);assertEquals(Boolean.TRUE, BooleanUtils.toBooleanObject("T"));
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29286);assertEquals(Boolean.FALSE, BooleanUtils.toBooleanObject("f")); // false
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29287);assertEquals(Boolean.FALSE, BooleanUtils.toBooleanObject("F"));
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29288);assertEquals(Boolean.FALSE, BooleanUtils.toBooleanObject("n")); // No
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29289);assertEquals(Boolean.FALSE, BooleanUtils.toBooleanObject("N"));
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29290);assertEquals(null, BooleanUtils.toBooleanObject("z"));

        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29291);assertEquals(null, BooleanUtils.toBooleanObject("ab"));
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29292);assertEquals(null, BooleanUtils.toBooleanObject("yoo"));
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29293);assertEquals(null, BooleanUtils.toBooleanObject("true "));
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29294);assertEquals(null, BooleanUtils.toBooleanObject("ono"));
    }finally{__CLR4_5_2mhnmhnlvha7fd9.R.flushNeeded();}}
    
    @Test
    public void test_toBooleanObject_String_String_String_String() {__CLR4_5_2mhnmhnlvha7fd9.R.globalSliceStart(getClass().getName(),29295);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28ckmpmmlr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2mhnmhnlvha7fd9.R.rethrow($CLV_t2$);}finally{__CLR4_5_2mhnmhnlvha7fd9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.BooleanUtilsTest.test_toBooleanObject_String_String_String_String",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),29295,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28ckmpmmlr(){try{__CLR4_5_2mhnmhnlvha7fd9.R.inc(29295);
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29296);assertSame(Boolean.TRUE, BooleanUtils.toBooleanObject(null, null, "N", "U"));
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29297);assertSame(Boolean.FALSE, BooleanUtils.toBooleanObject(null, "Y", null, "U"));
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29298);assertSame(null, BooleanUtils.toBooleanObject(null, "Y", "N", null));

        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29299);assertEquals(Boolean.TRUE, BooleanUtils.toBooleanObject("Y", "Y", "N", "U"));
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29300);assertEquals(Boolean.FALSE, BooleanUtils.toBooleanObject("N", "Y", "N", "U"));
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29301);assertEquals(null, BooleanUtils.toBooleanObject("U", "Y", "N", "U"));
    }finally{__CLR4_5_2mhnmhnlvha7fd9.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class)
    public void test_toBooleanObject_String_String_String_String_nullValue() {__CLR4_5_2mhnmhnlvha7fd9.R.globalSliceStart(getClass().getName(),29302);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23lpaq9mly();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,95,116,111,66,111,111,108,101,97,110,79,98,106,101,99,116,95,83,116,114,105,110,103,95,83,116,114,105,110,103,95,83,116,114,105,110,103,95,83,116,114,105,110,103,95,110,117,108,108,86,97,108,117,101,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2mhnmhnlvha7fd9.R.rethrow($CLV_t2$);}finally{__CLR4_5_2mhnmhnlvha7fd9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.BooleanUtilsTest.test_toBooleanObject_String_String_String_String_nullValue",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),29302,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23lpaq9mly(){try{__CLR4_5_2mhnmhnlvha7fd9.R.inc(29302);
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29303);BooleanUtils.toBooleanObject(null, "Y", "N", "U");
    }finally{__CLR4_5_2mhnmhnlvha7fd9.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class)
    public void test_toBooleanObject_String_String_String_String_noMatch() {__CLR4_5_2mhnmhnlvha7fd9.R.globalSliceStart(getClass().getName(),29304);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2kj0z85mm0();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,95,116,111,66,111,111,108,101,97,110,79,98,106,101,99,116,95,83,116,114,105,110,103,95,83,116,114,105,110,103,95,83,116,114,105,110,103,95,83,116,114,105,110,103,95,110,111,77,97,116,99,104,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2mhnmhnlvha7fd9.R.rethrow($CLV_t2$);}finally{__CLR4_5_2mhnmhnlvha7fd9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.BooleanUtilsTest.test_toBooleanObject_String_String_String_String_noMatch",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),29304,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2kj0z85mm0(){try{__CLR4_5_2mhnmhnlvha7fd9.R.inc(29304);
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29305);BooleanUtils.toBooleanObject("X", "Y", "N", "U");
    }finally{__CLR4_5_2mhnmhnlvha7fd9.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void test_toBoolean_String() {__CLR4_5_2mhnmhnlvha7fd9.R.globalSliceStart(getClass().getName(),29306);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2bax4q1mm2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2mhnmhnlvha7fd9.R.rethrow($CLV_t2$);}finally{__CLR4_5_2mhnmhnlvha7fd9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.BooleanUtilsTest.test_toBoolean_String",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),29306,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2bax4q1mm2(){try{__CLR4_5_2mhnmhnlvha7fd9.R.inc(29306);
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29307);assertFalse(BooleanUtils.toBoolean((String) null));
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29308);assertFalse(BooleanUtils.toBoolean(""));
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29309);assertFalse(BooleanUtils.toBoolean("off"));
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29310);assertFalse(BooleanUtils.toBoolean("oof"));
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29311);assertFalse(BooleanUtils.toBoolean("yep"));
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29312);assertFalse(BooleanUtils.toBoolean("trux"));
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29313);assertFalse(BooleanUtils.toBoolean("false"));
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29314);assertFalse(BooleanUtils.toBoolean("a"));
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29315);assertTrue(BooleanUtils.toBoolean("true")); // interned handled differently
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29316);assertTrue(BooleanUtils.toBoolean(new StringBuilder("tr").append("ue").toString()));
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29317);assertTrue(BooleanUtils.toBoolean("truE"));
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29318);assertTrue(BooleanUtils.toBoolean("trUe"));
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29319);assertTrue(BooleanUtils.toBoolean("trUE"));
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29320);assertTrue(BooleanUtils.toBoolean("tRue"));
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29321);assertTrue(BooleanUtils.toBoolean("tRuE"));
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29322);assertTrue(BooleanUtils.toBoolean("tRUe"));
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29323);assertTrue(BooleanUtils.toBoolean("tRUE"));
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29324);assertTrue(BooleanUtils.toBoolean("TRUE"));
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29325);assertTrue(BooleanUtils.toBoolean("TRUe"));
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29326);assertTrue(BooleanUtils.toBoolean("TRuE"));
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29327);assertTrue(BooleanUtils.toBoolean("TRue"));
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29328);assertTrue(BooleanUtils.toBoolean("TrUE"));
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29329);assertTrue(BooleanUtils.toBoolean("TrUe"));
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29330);assertTrue(BooleanUtils.toBoolean("TruE"));
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29331);assertTrue(BooleanUtils.toBoolean("True"));
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29332);assertTrue(BooleanUtils.toBoolean("on"));
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29333);assertTrue(BooleanUtils.toBoolean("oN"));
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29334);assertTrue(BooleanUtils.toBoolean("On"));
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29335);assertTrue(BooleanUtils.toBoolean("ON"));
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29336);assertTrue(BooleanUtils.toBoolean("yes"));
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29337);assertTrue(BooleanUtils.toBoolean("yeS"));
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29338);assertTrue(BooleanUtils.toBoolean("yEs"));
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29339);assertTrue(BooleanUtils.toBoolean("yES"));
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29340);assertTrue(BooleanUtils.toBoolean("Yes"));
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29341);assertTrue(BooleanUtils.toBoolean("YeS"));
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29342);assertTrue(BooleanUtils.toBoolean("YEs"));
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29343);assertTrue(BooleanUtils.toBoolean("YES"));
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29344);assertFalse(BooleanUtils.toBoolean("yes?"));
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29345);assertFalse(BooleanUtils.toBoolean("tru"));

        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29346);assertFalse(BooleanUtils.toBoolean("no"));
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29347);assertFalse(BooleanUtils.toBoolean("off"));
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29348);assertFalse(BooleanUtils.toBoolean("yoo"));
    }finally{__CLR4_5_2mhnmhnlvha7fd9.R.flushNeeded();}}

    @Test
    public void test_toBoolean_String_String_String() {__CLR4_5_2mhnmhnlvha7fd9.R.globalSliceStart(getClass().getName(),29349);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2oa98lzmn9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2mhnmhnlvha7fd9.R.rethrow($CLV_t2$);}finally{__CLR4_5_2mhnmhnlvha7fd9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.BooleanUtilsTest.test_toBoolean_String_String_String",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),29349,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2oa98lzmn9(){try{__CLR4_5_2mhnmhnlvha7fd9.R.inc(29349);
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29350);assertTrue(BooleanUtils.toBoolean(null, null, "N"));
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29351);assertFalse(BooleanUtils.toBoolean(null, "Y", null));
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29352);assertTrue(BooleanUtils.toBoolean("Y", "Y", "N"));
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29353);assertTrue(BooleanUtils.toBoolean("Y", new String("Y"), new String("N")));
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29354);assertFalse(BooleanUtils.toBoolean("N", "Y", "N"));
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29355);assertFalse(BooleanUtils.toBoolean("N", new String("Y"), new String("N")));
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29356);assertTrue(BooleanUtils.toBoolean((String) null, null, null));
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29357);assertTrue(BooleanUtils.toBoolean("Y", "Y", "Y"));
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29358);assertTrue(BooleanUtils.toBoolean("Y", new String("Y"), new String("Y")));
    }finally{__CLR4_5_2mhnmhnlvha7fd9.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class)
    public void test_toBoolean_String_String_String_nullValue() {__CLR4_5_2mhnmhnlvha7fd9.R.globalSliceStart(getClass().getName(),29359);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28uk9pemnj();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,95,116,111,66,111,111,108,101,97,110,95,83,116,114,105,110,103,95,83,116,114,105,110,103,95,83,116,114,105,110,103,95,110,117,108,108,86,97,108,117,101,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2mhnmhnlvha7fd9.R.rethrow($CLV_t2$);}finally{__CLR4_5_2mhnmhnlvha7fd9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.BooleanUtilsTest.test_toBoolean_String_String_String_nullValue",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),29359,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28uk9pemnj(){try{__CLR4_5_2mhnmhnlvha7fd9.R.inc(29359);
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29360);BooleanUtils.toBoolean(null, "Y", "N");
    }finally{__CLR4_5_2mhnmhnlvha7fd9.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class)
    public void test_toBoolean_String_String_String_noMatch() {__CLR4_5_2mhnmhnlvha7fd9.R.globalSliceStart(getClass().getName(),29361);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2dju6ikmnl();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,95,116,111,66,111,111,108,101,97,110,95,83,116,114,105,110,103,95,83,116,114,105,110,103,95,83,116,114,105,110,103,95,110,111,77,97,116,99,104,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2mhnmhnlvha7fd9.R.rethrow($CLV_t2$);}finally{__CLR4_5_2mhnmhnlvha7fd9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.BooleanUtilsTest.test_toBoolean_String_String_String_noMatch",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),29361,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2dju6ikmnl(){try{__CLR4_5_2mhnmhnlvha7fd9.R.inc(29361);
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29362);BooleanUtils.toBoolean("X", "Y", "N");
    }finally{__CLR4_5_2mhnmhnlvha7fd9.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void test_toStringTrueFalse_Boolean() {__CLR4_5_2mhnmhnlvha7fd9.R.globalSliceStart(getClass().getName(),29363);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2esvfhomnn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2mhnmhnlvha7fd9.R.rethrow($CLV_t2$);}finally{__CLR4_5_2mhnmhnlvha7fd9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.BooleanUtilsTest.test_toStringTrueFalse_Boolean",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),29363,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2esvfhomnn(){try{__CLR4_5_2mhnmhnlvha7fd9.R.inc(29363);
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29364);assertEquals(null, BooleanUtils.toStringTrueFalse(null));
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29365);assertEquals("true", BooleanUtils.toStringTrueFalse(Boolean.TRUE));
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29366);assertEquals("false", BooleanUtils.toStringTrueFalse(Boolean.FALSE));
    }finally{__CLR4_5_2mhnmhnlvha7fd9.R.flushNeeded();}}
    
    @Test
    public void test_toStringOnOff_Boolean() {__CLR4_5_2mhnmhnlvha7fd9.R.globalSliceStart(getClass().getName(),29367);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2nggkrrmnr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2mhnmhnlvha7fd9.R.rethrow($CLV_t2$);}finally{__CLR4_5_2mhnmhnlvha7fd9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.BooleanUtilsTest.test_toStringOnOff_Boolean",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),29367,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2nggkrrmnr(){try{__CLR4_5_2mhnmhnlvha7fd9.R.inc(29367);
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29368);assertEquals(null, BooleanUtils.toStringOnOff(null));
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29369);assertEquals("on", BooleanUtils.toStringOnOff(Boolean.TRUE));
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29370);assertEquals("off", BooleanUtils.toStringOnOff(Boolean.FALSE));
    }finally{__CLR4_5_2mhnmhnlvha7fd9.R.flushNeeded();}}
    
    @Test
    public void test_toStringYesNo_Boolean() {__CLR4_5_2mhnmhnlvha7fd9.R.globalSliceStart(getClass().getName(),29371);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2mewgm7mnv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2mhnmhnlvha7fd9.R.rethrow($CLV_t2$);}finally{__CLR4_5_2mhnmhnlvha7fd9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.BooleanUtilsTest.test_toStringYesNo_Boolean",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),29371,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2mewgm7mnv(){try{__CLR4_5_2mhnmhnlvha7fd9.R.inc(29371);
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29372);assertEquals(null, BooleanUtils.toStringYesNo(null));
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29373);assertEquals("yes", BooleanUtils.toStringYesNo(Boolean.TRUE));
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29374);assertEquals("no", BooleanUtils.toStringYesNo(Boolean.FALSE));
    }finally{__CLR4_5_2mhnmhnlvha7fd9.R.flushNeeded();}}
    
    @Test
    public void test_toString_Boolean_String_String_String() {__CLR4_5_2mhnmhnlvha7fd9.R.globalSliceStart(getClass().getName(),29375);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2mg4vu3mnz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2mhnmhnlvha7fd9.R.rethrow($CLV_t2$);}finally{__CLR4_5_2mhnmhnlvha7fd9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.BooleanUtilsTest.test_toString_Boolean_String_String_String",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),29375,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2mg4vu3mnz(){try{__CLR4_5_2mhnmhnlvha7fd9.R.inc(29375);
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29376);assertEquals("U", BooleanUtils.toString(null, "Y", "N", "U"));
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29377);assertEquals("Y", BooleanUtils.toString(Boolean.TRUE, "Y", "N", "U"));
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29378);assertEquals("N", BooleanUtils.toString(Boolean.FALSE, "Y", "N", "U"));
    }finally{__CLR4_5_2mhnmhnlvha7fd9.R.flushNeeded();}}
    
    //-----------------------------------------------------------------------
    @Test
    public void test_toStringTrueFalse_boolean() {__CLR4_5_2mhnmhnlvha7fd9.R.globalSliceStart(getClass().getName(),29379);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2v3tqkmo3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2mhnmhnlvha7fd9.R.rethrow($CLV_t2$);}finally{__CLR4_5_2mhnmhnlvha7fd9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.BooleanUtilsTest.test_toStringTrueFalse_boolean",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),29379,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2v3tqkmo3(){try{__CLR4_5_2mhnmhnlvha7fd9.R.inc(29379);
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29380);assertEquals("true", BooleanUtils.toStringTrueFalse(true));
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29381);assertEquals("false", BooleanUtils.toStringTrueFalse(false));
    }finally{__CLR4_5_2mhnmhnlvha7fd9.R.flushNeeded();}}
    
    @Test
    public void test_toStringOnOff_boolean() {__CLR4_5_2mhnmhnlvha7fd9.R.globalSliceStart(getClass().getName(),29382);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_29ioz0nmo6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2mhnmhnlvha7fd9.R.rethrow($CLV_t2$);}finally{__CLR4_5_2mhnmhnlvha7fd9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.BooleanUtilsTest.test_toStringOnOff_boolean",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),29382,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_29ioz0nmo6(){try{__CLR4_5_2mhnmhnlvha7fd9.R.inc(29382);
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29383);assertEquals("on", BooleanUtils.toStringOnOff(true));
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29384);assertEquals("off", BooleanUtils.toStringOnOff(false));
    }finally{__CLR4_5_2mhnmhnlvha7fd9.R.flushNeeded();}}
    
    @Test
    public void test_toStringYesNo_boolean() {__CLR4_5_2mhnmhnlvha7fd9.R.globalSliceStart(getClass().getName(),29385);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28h4uv3mo9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2mhnmhnlvha7fd9.R.rethrow($CLV_t2$);}finally{__CLR4_5_2mhnmhnlvha7fd9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.BooleanUtilsTest.test_toStringYesNo_boolean",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),29385,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28h4uv3mo9(){try{__CLR4_5_2mhnmhnlvha7fd9.R.inc(29385);
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29386);assertEquals("yes", BooleanUtils.toStringYesNo(true));
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29387);assertEquals("no", BooleanUtils.toStringYesNo(false));
    }finally{__CLR4_5_2mhnmhnlvha7fd9.R.flushNeeded();}}
    
    @Test
    public void test_toString_boolean_String_String_String() {__CLR4_5_2mhnmhnlvha7fd9.R.globalSliceStart(getClass().getName(),29388);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2g4ihmdmoc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2mhnmhnlvha7fd9.R.rethrow($CLV_t2$);}finally{__CLR4_5_2mhnmhnlvha7fd9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.BooleanUtilsTest.test_toString_boolean_String_String_String",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),29388,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2g4ihmdmoc(){try{__CLR4_5_2mhnmhnlvha7fd9.R.inc(29388);
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29389);assertEquals("Y", BooleanUtils.toString(true, "Y", "N"));
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29390);assertEquals("N", BooleanUtils.toString(false, "Y", "N"));
    }finally{__CLR4_5_2mhnmhnlvha7fd9.R.flushNeeded();}}
    
    //  testXor
    //  -----------------------------------------------------------------------
    @Test(expected = IllegalArgumentException.class)
    public void testXor_primitive_nullInput() {__CLR4_5_2mhnmhnlvha7fd9.R.globalSliceStart(getClass().getName(),29391);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23c05c4mof();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,88,111,114,95,112,114,105,109,105,116,105,118,101,95,110,117,108,108,73,110,112,117,116,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2mhnmhnlvha7fd9.R.rethrow($CLV_t2$);}finally{__CLR4_5_2mhnmhnlvha7fd9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.BooleanUtilsTest.testXor_primitive_nullInput",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),29391,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23c05c4mof(){try{__CLR4_5_2mhnmhnlvha7fd9.R.inc(29391);
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29392);BooleanUtils.xor((boolean[]) null);
    }finally{__CLR4_5_2mhnmhnlvha7fd9.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class)
    public void testXor_primitive_emptyInput() {__CLR4_5_2mhnmhnlvha7fd9.R.globalSliceStart(getClass().getName(),29393);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2wnpck2moh();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,88,111,114,95,112,114,105,109,105,116,105,118,101,95,101,109,112,116,121,73,110,112,117,116,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2mhnmhnlvha7fd9.R.rethrow($CLV_t2$);}finally{__CLR4_5_2mhnmhnlvha7fd9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.BooleanUtilsTest.testXor_primitive_emptyInput",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),29393,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2wnpck2moh(){try{__CLR4_5_2mhnmhnlvha7fd9.R.inc(29393);
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29394);BooleanUtils.xor(new boolean[] {});
    }finally{__CLR4_5_2mhnmhnlvha7fd9.R.flushNeeded();}}

    @Test
    public void testXor_primitive_validInput_2items() {__CLR4_5_2mhnmhnlvha7fd9.R.globalSliceStart(getClass().getName(),29395);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2x6qmtkmoj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2mhnmhnlvha7fd9.R.rethrow($CLV_t2$);}finally{__CLR4_5_2mhnmhnlvha7fd9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.BooleanUtilsTest.testXor_primitive_validInput_2items",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),29395,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2x6qmtkmoj(){try{__CLR4_5_2mhnmhnlvha7fd9.R.inc(29395);
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29396);assertEquals(
            "true ^ true",
            true ^ true ,
            BooleanUtils.xor(new boolean[] { true, true }));

        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29397);assertEquals(
            "false ^ false",
            false ^ false,
            BooleanUtils.xor(new boolean[] { false, false }));

        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29398);assertEquals(
            "true ^ false",
            true ^ false,
            BooleanUtils.xor(new boolean[] { true, false }));

        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29399);assertEquals(
            "false ^ true",
            false ^ true,
            BooleanUtils.xor(new boolean[] { false, true }));
    }finally{__CLR4_5_2mhnmhnlvha7fd9.R.flushNeeded();}}

    @Test
    public void testXor_primitive_validInput_3items() {__CLR4_5_2mhnmhnlvha7fd9.R.globalSliceStart(getClass().getName(),29400);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2cwtcqfmoo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2mhnmhnlvha7fd9.R.rethrow($CLV_t2$);}finally{__CLR4_5_2mhnmhnlvha7fd9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.BooleanUtilsTest.testXor_primitive_validInput_3items",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),29400,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2cwtcqfmoo(){try{__CLR4_5_2mhnmhnlvha7fd9.R.inc(29400);
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29401);assertEquals(
            "false ^ false ^ false",
            false ^ false ^ false,
            BooleanUtils.xor(new boolean[] { false, false, false }));

        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29402);assertEquals(
            "false ^ false ^ true",
            false ^ false ^ true,
            BooleanUtils.xor(new boolean[] { false, false, true }));

        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29403);assertEquals(
            "false ^ true ^ false",
            false ^ true ^ false,
            BooleanUtils.xor(new boolean[] { false, true, false }));

        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29404);assertEquals(
            "false ^ true ^ true",
            false ^ true ^ true,
            BooleanUtils.xor(new boolean[] { false, true, true }));

        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29405);assertEquals(
            "true ^ false ^ false",
            true ^ false ^ false,
            BooleanUtils.xor(new boolean[] { true, false, false }));

        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29406);assertEquals(
            "true ^ false ^ true",
            true ^ false ^ true,
            BooleanUtils.xor(new boolean[] { true, false, true }));

        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29407);assertEquals(
            "true ^ true ^ false",
            true ^ true ^ false,
            BooleanUtils.xor(new boolean[] { true, true, false }));

        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29408);assertEquals(
            "true ^ true ^ true",
            true ^ true ^ true,
            BooleanUtils.xor(new boolean[] { true, true, true }));
    }finally{__CLR4_5_2mhnmhnlvha7fd9.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class)
    public void testXor_object_nullInput() {__CLR4_5_2mhnmhnlvha7fd9.R.globalSliceStart(getClass().getName(),29409);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ft11z4mox();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,88,111,114,95,111,98,106,101,99,116,95,110,117,108,108,73,110,112,117,116,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2mhnmhnlvha7fd9.R.rethrow($CLV_t2$);}finally{__CLR4_5_2mhnmhnlvha7fd9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.BooleanUtilsTest.testXor_object_nullInput",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),29409,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ft11z4mox(){try{__CLR4_5_2mhnmhnlvha7fd9.R.inc(29409);
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29410);BooleanUtils.xor((Boolean[]) null);
    }finally{__CLR4_5_2mhnmhnlvha7fd9.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class)
    public void testXor_object_emptyInput() {__CLR4_5_2mhnmhnlvha7fd9.R.globalSliceStart(getClass().getName(),29411);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_215himmmoz();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,88,111,114,95,111,98,106,101,99,116,95,101,109,112,116,121,73,110,112,117,116,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2mhnmhnlvha7fd9.R.rethrow($CLV_t2$);}finally{__CLR4_5_2mhnmhnlvha7fd9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.BooleanUtilsTest.testXor_object_emptyInput",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),29411,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_215himmmoz(){try{__CLR4_5_2mhnmhnlvha7fd9.R.inc(29411);
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29412);BooleanUtils.xor(new Boolean[] {});
    }finally{__CLR4_5_2mhnmhnlvha7fd9.R.flushNeeded();}}
    
    @Test(expected = IllegalArgumentException.class)
    public void testXor_object_nullElementInput() {__CLR4_5_2mhnmhnlvha7fd9.R.globalSliceStart(getClass().getName(),29413);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2w0p90mmp1();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,88,111,114,95,111,98,106,101,99,116,95,110,117,108,108,69,108,101,109,101,110,116,73,110,112,117,116,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2mhnmhnlvha7fd9.R.rethrow($CLV_t2$);}finally{__CLR4_5_2mhnmhnlvha7fd9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.BooleanUtilsTest.testXor_object_nullElementInput",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),29413,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2w0p90mmp1(){try{__CLR4_5_2mhnmhnlvha7fd9.R.inc(29413);
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29414);BooleanUtils.xor(new Boolean[] {null});
    }finally{__CLR4_5_2mhnmhnlvha7fd9.R.flushNeeded();}}

    @Test
    public void testXor_object_validInput_2items() {__CLR4_5_2mhnmhnlvha7fd9.R.globalSliceStart(getClass().getName(),29415);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2endk1omp3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2mhnmhnlvha7fd9.R.rethrow($CLV_t2$);}finally{__CLR4_5_2mhnmhnlvha7fd9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.BooleanUtilsTest.testXor_object_validInput_2items",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),29415,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2endk1omp3(){try{__CLR4_5_2mhnmhnlvha7fd9.R.inc(29415);
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29416);assertEquals(
            "false ^ false",
            false ^ false,
            BooleanUtils
                .xor(new Boolean[] { Boolean.FALSE, Boolean.FALSE })
                .booleanValue());

        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29417);assertEquals(
            "false ^ true",
            false ^ true,
            BooleanUtils
                .xor(new Boolean[] { Boolean.FALSE, Boolean.TRUE })
                .booleanValue());

        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29418);assertEquals(
            "true ^ false",
            true ^ false,
            BooleanUtils
                .xor(new Boolean[] { Boolean.TRUE, Boolean.FALSE })
                .booleanValue());

        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29419);assertEquals(
            "true ^ true",
            true ^ true,
            BooleanUtils
                .xor(new Boolean[] { Boolean.TRUE, Boolean.TRUE })
                .booleanValue());
    }finally{__CLR4_5_2mhnmhnlvha7fd9.R.flushNeeded();}}

    @Test
    public void testXor_object_validInput_3items() {__CLR4_5_2mhnmhnlvha7fd9.R.globalSliceStart(getClass().getName(),29420);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2aa6idhmp8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2mhnmhnlvha7fd9.R.rethrow($CLV_t2$);}finally{__CLR4_5_2mhnmhnlvha7fd9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.BooleanUtilsTest.testXor_object_validInput_3items",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),29420,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2aa6idhmp8(){try{__CLR4_5_2mhnmhnlvha7fd9.R.inc(29420);
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29421);assertEquals(
                "false ^ false ^ false",
                false ^ false ^ false,
                BooleanUtils.xor(
                        new Boolean[] {
                                Boolean.FALSE,
                                Boolean.FALSE,
                                Boolean.FALSE })
                        .booleanValue());

        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29422);assertEquals(
            "false ^ false ^ true",
            false ^ false ^ true,
            BooleanUtils
                .xor(
                    new Boolean[] {
                        Boolean.FALSE,
                        Boolean.FALSE,
                        Boolean.TRUE })
                .booleanValue());

        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29423);assertEquals(
            "false ^ true ^ false",
            false ^ true ^ false,
            BooleanUtils
                .xor(
                    new Boolean[] {
                        Boolean.FALSE,
                        Boolean.TRUE,
                        Boolean.FALSE })
                .booleanValue());

        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29424);assertEquals(
            "true ^ false ^ false",
            true ^ false ^ false,
            BooleanUtils
                .xor(
                    new Boolean[] {
                        Boolean.TRUE,
                        Boolean.FALSE,
                        Boolean.FALSE })
                .booleanValue());

        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29425);assertEquals(
                "true ^ false ^ true",
                true ^ false ^ true,
                BooleanUtils.xor(
                        new Boolean[] {
                                Boolean.TRUE,
                                Boolean.FALSE,
                                Boolean.TRUE })
                        .booleanValue());

        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29426);assertEquals(
            "true ^ true ^ false",
            true ^ true ^ false,
            BooleanUtils.xor(
                    new Boolean[] {
                        Boolean.TRUE,
                        Boolean.TRUE,
                        Boolean.FALSE })
                .booleanValue());

        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29427);assertEquals(
            "false ^ true ^ true",
            false ^ true ^ true,
            BooleanUtils.xor(
                    new Boolean[] {
                        Boolean.FALSE,
                        Boolean.TRUE,
                        Boolean.TRUE })
                .booleanValue());

        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29428);assertEquals(
                "true ^ true ^ true",
                true ^ true ^ true,
                BooleanUtils
                        .xor(new Boolean[] { Boolean.TRUE, Boolean.TRUE, Boolean.TRUE })
                        .booleanValue());
    }finally{__CLR4_5_2mhnmhnlvha7fd9.R.flushNeeded();}}

    //  testAnd
    //  -----------------------------------------------------------------------
    @Test(expected = IllegalArgumentException.class)
    public void testAnd_primitive_nullInput() {__CLR4_5_2mhnmhnlvha7fd9.R.globalSliceStart(getClass().getName(),29429);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ltuebcmph();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,65,110,100,95,112,114,105,109,105,116,105,118,101,95,110,117,108,108,73,110,112,117,116,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2mhnmhnlvha7fd9.R.rethrow($CLV_t2$);}finally{__CLR4_5_2mhnmhnlvha7fd9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.BooleanUtilsTest.testAnd_primitive_nullInput",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),29429,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ltuebcmph(){try{__CLR4_5_2mhnmhnlvha7fd9.R.inc(29429);
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29430);BooleanUtils.and((boolean[]) null);
    }finally{__CLR4_5_2mhnmhnlvha7fd9.R.flushNeeded();}}
    
    @Test(expected = IllegalArgumentException.class)
    public void testAnd_primitive_emptyInput() {__CLR4_5_2mhnmhnlvha7fd9.R.globalSliceStart(getClass().getName(),29431);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vcro0mmpj();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,65,110,100,95,112,114,105,109,105,116,105,118,101,95,101,109,112,116,121,73,110,112,117,116,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2mhnmhnlvha7fd9.R.rethrow($CLV_t2$);}finally{__CLR4_5_2mhnmhnlvha7fd9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.BooleanUtilsTest.testAnd_primitive_emptyInput",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),29431,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vcro0mmpj(){try{__CLR4_5_2mhnmhnlvha7fd9.R.inc(29431);
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29432);BooleanUtils.and(new boolean[] {});
    }finally{__CLR4_5_2mhnmhnlvha7fd9.R.flushNeeded();}}
    
    @Test
    public void testAnd_primitive_validInput_2items() {__CLR4_5_2mhnmhnlvha7fd9.R.globalSliceStart(getClass().getName(),29433);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2x6of04mpl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2mhnmhnlvha7fd9.R.rethrow($CLV_t2$);}finally{__CLR4_5_2mhnmhnlvha7fd9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.BooleanUtilsTest.testAnd_primitive_validInput_2items",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),29433,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2x6of04mpl(){try{__CLR4_5_2mhnmhnlvha7fd9.R.inc(29433);
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29434);assertTrue(
            "False result for (true, true)",
            BooleanUtils.and(new boolean[] { true, true }));
        
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29435);assertTrue(
            "True result for (false, false)",
            ! BooleanUtils.and(new boolean[] { false, false }));
        
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29436);assertTrue(
            "True result for (true, false)",
            ! BooleanUtils.and(new boolean[] { true, false }));
        
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29437);assertTrue(
            "True result for (false, true)",
            ! BooleanUtils.and(new boolean[] { false, true }));
    }finally{__CLR4_5_2mhnmhnlvha7fd9.R.flushNeeded();}}
    
    @Test
    public void testAnd_primitive_validInput_3items() {__CLR4_5_2mhnmhnlvha7fd9.R.globalSliceStart(getClass().getName(),29438);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2894ckzmpq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2mhnmhnlvha7fd9.R.rethrow($CLV_t2$);}finally{__CLR4_5_2mhnmhnlvha7fd9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.BooleanUtilsTest.testAnd_primitive_validInput_3items",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),29438,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2894ckzmpq(){try{__CLR4_5_2mhnmhnlvha7fd9.R.inc(29438);
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29439);assertTrue(
            "True result for (false, false, true)",
            ! BooleanUtils.and(new boolean[] { false, false, true }));
        
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29440);assertTrue(
            "True result for (false, true, false)",
            ! BooleanUtils.and(new boolean[] { false, true, false }));
        
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29441);assertTrue(
            "True result for (true, false, false)",
            ! BooleanUtils.and(new boolean[] { true, false, false }));
        
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29442);assertTrue(
            "False result for (true, true, true)",
            BooleanUtils.and(new boolean[] { true, true, true }));
        
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29443);assertTrue(
            "True result for (false, false)",
            ! BooleanUtils.and(new boolean[] { false, false, false }));
        
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29444);assertTrue(
            "True result for (true, true, false)",
            ! BooleanUtils.and(new boolean[] { true, true, false }));
        
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29445);assertTrue(
            "True result for (true, false, true)",
            ! BooleanUtils.and(new boolean[] { true, false, true }));
        
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29446);assertTrue(
            "True result for (false, true, true)",
            ! BooleanUtils.and(new boolean[] { false, true, true }));
    }finally{__CLR4_5_2mhnmhnlvha7fd9.R.flushNeeded();}}
    
    @Test(expected = IllegalArgumentException.class)
    public void testAnd_object_nullInput() {__CLR4_5_2mhnmhnlvha7fd9.R.globalSliceStart(getClass().getName(),29447);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2uy4y4cmpz();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,65,110,100,95,111,98,106,101,99,116,95,110,117,108,108,73,110,112,117,116,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2mhnmhnlvha7fd9.R.rethrow($CLV_t2$);}finally{__CLR4_5_2mhnmhnlvha7fd9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.BooleanUtilsTest.testAnd_object_nullInput",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),29447,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2uy4y4cmpz(){try{__CLR4_5_2mhnmhnlvha7fd9.R.inc(29447);
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29448);BooleanUtils.and((Boolean[]) null);
    }finally{__CLR4_5_2mhnmhnlvha7fd9.R.flushNeeded();}}
    
    @Test(expected = IllegalArgumentException.class)
    public void testAnd_object_emptyInput() {__CLR4_5_2mhnmhnlvha7fd9.R.globalSliceStart(getClass().getName(),29449);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2syx7yimq1();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,65,110,100,95,111,98,106,101,99,116,95,101,109,112,116,121,73,110,112,117,116,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2mhnmhnlvha7fd9.R.rethrow($CLV_t2$);}finally{__CLR4_5_2mhnmhnlvha7fd9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.BooleanUtilsTest.testAnd_object_emptyInput",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),29449,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2syx7yimq1(){try{__CLR4_5_2mhnmhnlvha7fd9.R.inc(29449);
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29450);BooleanUtils.and(new Boolean[] {});
    }finally{__CLR4_5_2mhnmhnlvha7fd9.R.flushNeeded();}}
    
    @Test(expected = IllegalArgumentException.class)
    public void testAnd_object_nullElementInput() {__CLR4_5_2mhnmhnlvha7fd9.R.globalSliceStart(getClass().getName(),29451);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2pmbfa6mq3();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,65,110,100,95,111,98,106,101,99,116,95,110,117,108,108,69,108,101,109,101,110,116,73,110,112,117,116,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2mhnmhnlvha7fd9.R.rethrow($CLV_t2$);}finally{__CLR4_5_2mhnmhnlvha7fd9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.BooleanUtilsTest.testAnd_object_nullElementInput",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),29451,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2pmbfa6mq3(){try{__CLR4_5_2mhnmhnlvha7fd9.R.inc(29451);
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29452);BooleanUtils.and(new Boolean[] {null});
    }finally{__CLR4_5_2mhnmhnlvha7fd9.R.flushNeeded();}}
    
    @Test
    public void testAnd_object_validInput_2items() {__CLR4_5_2mhnmhnlvha7fd9.R.globalSliceStart(getClass().getName(),29453);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23lm05cmq5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2mhnmhnlvha7fd9.R.rethrow($CLV_t2$);}finally{__CLR4_5_2mhnmhnlvha7fd9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.BooleanUtilsTest.testAnd_object_validInput_2items",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),29453,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23lm05cmq5(){try{__CLR4_5_2mhnmhnlvha7fd9.R.inc(29453);
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29454);assertTrue(
            "False result for (true, true)",
            BooleanUtils
            .and(new Boolean[] { Boolean.TRUE, Boolean.TRUE })
            .booleanValue());
        
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29455);assertTrue(
            "True result for (false, false)",
            ! BooleanUtils
            .and(new Boolean[] { Boolean.FALSE, Boolean.FALSE })
            .booleanValue());
        
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29456);assertTrue(
            "True result for (true, false)",
            ! BooleanUtils
            .and(new Boolean[] { Boolean.TRUE, Boolean.FALSE })
            .booleanValue());
        
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29457);assertTrue(
            "True result for (false, true)",
            ! BooleanUtils
            .and(new Boolean[] { Boolean.FALSE, Boolean.TRUE })
            .booleanValue());
    }finally{__CLR4_5_2mhnmhnlvha7fd9.R.flushNeeded();}}
    
    @Test
    public void testAnd_object_validInput_3items() {__CLR4_5_2mhnmhnlvha7fd9.R.globalSliceStart(getClass().getName(),29458);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2lby29tmqa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2mhnmhnlvha7fd9.R.rethrow($CLV_t2$);}finally{__CLR4_5_2mhnmhnlvha7fd9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.BooleanUtilsTest.testAnd_object_validInput_3items",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),29458,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2lby29tmqa(){try{__CLR4_5_2mhnmhnlvha7fd9.R.inc(29458);
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29459);assertTrue(
            "True result for (false, false, true)",
            ! BooleanUtils
            .and(
                new Boolean[] {
                    Boolean.FALSE,
                    Boolean.FALSE,
                    Boolean.TRUE })
                    .booleanValue());
        
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29460);assertTrue(
            "True result for (false, true, false)",
            ! BooleanUtils
            .and(
                new Boolean[] {
                    Boolean.FALSE,
                    Boolean.TRUE,
                    Boolean.FALSE })
                    .booleanValue());
        
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29461);assertTrue(
            "True result for (true, false, false)",
            ! BooleanUtils
            .and(
                new Boolean[] {
                    Boolean.TRUE,
                    Boolean.FALSE,
                    Boolean.FALSE })
                    .booleanValue());
        
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29462);assertTrue(
            "False result for (true, true, true)",
            BooleanUtils
            .and(new Boolean[] { Boolean.TRUE, Boolean.TRUE, Boolean.TRUE })
            .booleanValue());
        
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29463);assertTrue(
            "True result for (false, false)",
            ! BooleanUtils.and(
                new Boolean[] {
                    Boolean.FALSE,
                    Boolean.FALSE,
                    Boolean.FALSE })
                    .booleanValue());
        
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29464);assertTrue(
            "True result for (true, true, false)",
            ! BooleanUtils.and(
                new Boolean[] {
                    Boolean.TRUE,
                    Boolean.TRUE,
                    Boolean.FALSE })
                    .booleanValue());
        
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29465);assertTrue(
            "True result for (true, false, true)",
            ! BooleanUtils.and(
                new Boolean[] {
                    Boolean.TRUE,
                    Boolean.FALSE,
                    Boolean.TRUE })
                    .booleanValue());
        
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29466);assertTrue(
            "True result for (false, true, true)",
            ! BooleanUtils.and(
                new Boolean[] {
                    Boolean.FALSE,
                    Boolean.TRUE,
                    Boolean.TRUE })
                    .booleanValue());
    }finally{__CLR4_5_2mhnmhnlvha7fd9.R.flushNeeded();}}
    
    //  testOr
    //  -----------------------------------------------------------------------
    @Test(expected = IllegalArgumentException.class)
    public void testOr_primitive_nullInput() {__CLR4_5_2mhnmhnlvha7fd9.R.globalSliceStart(getClass().getName(),29467);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2awvwa0mqj();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,79,114,95,112,114,105,109,105,116,105,118,101,95,110,117,108,108,73,110,112,117,116,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2mhnmhnlvha7fd9.R.rethrow($CLV_t2$);}finally{__CLR4_5_2mhnmhnlvha7fd9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.BooleanUtilsTest.testOr_primitive_nullInput",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),29467,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2awvwa0mqj(){try{__CLR4_5_2mhnmhnlvha7fd9.R.inc(29467);
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29468);BooleanUtils.or((boolean[]) null);
    }finally{__CLR4_5_2mhnmhnlvha7fd9.R.flushNeeded();}}
    
    @Test(expected = IllegalArgumentException.class)
    public void testOr_primitive_emptyInput() {__CLR4_5_2mhnmhnlvha7fd9.R.globalSliceStart(getClass().getName(),29469);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2mwhn8amql();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,79,114,95,112,114,105,109,105,116,105,118,101,95,101,109,112,116,121,73,110,112,117,116,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2mhnmhnlvha7fd9.R.rethrow($CLV_t2$);}finally{__CLR4_5_2mhnmhnlvha7fd9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.BooleanUtilsTest.testOr_primitive_emptyInput",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),29469,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2mwhn8amql(){try{__CLR4_5_2mhnmhnlvha7fd9.R.inc(29469);
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29470);BooleanUtils.or(new boolean[] {});
    }finally{__CLR4_5_2mhnmhnlvha7fd9.R.flushNeeded();}}
    
    @Test
    public void testOr_primitive_validInput_2items() {__CLR4_5_2mhnmhnlvha7fd9.R.globalSliceStart(getClass().getName(),29471);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21r1wwsmqn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2mhnmhnlvha7fd9.R.rethrow($CLV_t2$);}finally{__CLR4_5_2mhnmhnlvha7fd9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.BooleanUtilsTest.testOr_primitive_validInput_2items",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),29471,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21r1wwsmqn(){try{__CLR4_5_2mhnmhnlvha7fd9.R.inc(29471);
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29472);assertTrue(
            "False result for (true, true)",
            BooleanUtils.or(new boolean[] { true, true }));
        
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29473);assertTrue(
            "True result for (false, false)",
            ! BooleanUtils.or(new boolean[] { false, false }));
        
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29474);assertTrue(
            "False result for (true, false)",
            BooleanUtils.or(new boolean[] { true, false }));
        
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29475);assertTrue(
            "False result for (false, true)",
            BooleanUtils.or(new boolean[] { false, true }));
    }finally{__CLR4_5_2mhnmhnlvha7fd9.R.flushNeeded();}}
    
    @Test
    public void testOr_primitive_validInput_3items() {__CLR4_5_2mhnmhnlvha7fd9.R.globalSliceStart(getClass().getName(),29476);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2qolzbxmqs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2mhnmhnlvha7fd9.R.rethrow($CLV_t2$);}finally{__CLR4_5_2mhnmhnlvha7fd9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.BooleanUtilsTest.testOr_primitive_validInput_3items",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),29476,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2qolzbxmqs(){try{__CLR4_5_2mhnmhnlvha7fd9.R.inc(29476);
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29477);assertTrue(
            "False result for (false, false, true)",
            BooleanUtils.or(new boolean[] { false, false, true }));
        
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29478);assertTrue(
            "False result for (false, true, false)",
            BooleanUtils.or(new boolean[] { false, true, false }));
        
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29479);assertTrue(
            "False result for (true, false, false)",
            BooleanUtils.or(new boolean[] { true, false, false }));
        
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29480);assertTrue(
            "False result for (true, true, true)",
            BooleanUtils.or(new boolean[] { true, true, true }));
        
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29481);assertTrue(
            "True result for (false, false)",
            ! BooleanUtils.or(new boolean[] { false, false, false }));
        
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29482);assertTrue(
            "False result for (true, true, false)",
            BooleanUtils.or(new boolean[] { true, true, false }));
        
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29483);assertTrue(
            "False result for (true, false, true)",
            BooleanUtils.or(new boolean[] { true, false, true }));
        
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29484);assertTrue(
            "False result for (false, true, true)",
            BooleanUtils.or(new boolean[] { false, true, true }));
    
    }finally{__CLR4_5_2mhnmhnlvha7fd9.R.flushNeeded();}}
    @Test(expected = IllegalArgumentException.class)
    public void testOr_object_nullInput() {__CLR4_5_2mhnmhnlvha7fd9.R.globalSliceStart(getClass().getName(),29485);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vz58mkmr1();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,79,114,95,111,98,106,101,99,116,95,110,117,108,108,73,110,112,117,116,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2mhnmhnlvha7fd9.R.rethrow($CLV_t2$);}finally{__CLR4_5_2mhnmhnlvha7fd9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.BooleanUtilsTest.testOr_object_nullInput",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),29485,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vz58mkmr1(){try{__CLR4_5_2mhnmhnlvha7fd9.R.inc(29485);
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29486);BooleanUtils.or((Boolean[]) null);
    }finally{__CLR4_5_2mhnmhnlvha7fd9.R.flushNeeded();}}
    
    @Test(expected = IllegalArgumentException.class)
    public void testOr_object_emptyInput() {__CLR4_5_2mhnmhnlvha7fd9.R.globalSliceStart(getClass().getName(),29487);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22wbtqemr3();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,79,114,95,111,98,106,101,99,116,95,101,109,112,116,121,73,110,112,117,116,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2mhnmhnlvha7fd9.R.rethrow($CLV_t2$);}finally{__CLR4_5_2mhnmhnlvha7fd9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.BooleanUtilsTest.testOr_object_emptyInput",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),29487,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22wbtqemr3(){try{__CLR4_5_2mhnmhnlvha7fd9.R.inc(29487);
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29488);BooleanUtils.or(new Boolean[] {});
    }finally{__CLR4_5_2mhnmhnlvha7fd9.R.flushNeeded();}}
    
    @Test(expected = IllegalArgumentException.class)
    public void testOr_object_nullElementInput() {__CLR4_5_2mhnmhnlvha7fd9.R.globalSliceStart(getClass().getName(),29489);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2m4gxymmr5();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,79,114,95,111,98,106,101,99,116,95,110,117,108,108,69,108,101,109,101,110,116,73,110,112,117,116,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2mhnmhnlvha7fd9.R.rethrow($CLV_t2$);}finally{__CLR4_5_2mhnmhnlvha7fd9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.BooleanUtilsTest.testOr_object_nullElementInput",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),29489,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2m4gxymmr5(){try{__CLR4_5_2mhnmhnlvha7fd9.R.inc(29489);
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29490);BooleanUtils.or(new Boolean[] {null});
    }finally{__CLR4_5_2mhnmhnlvha7fd9.R.flushNeeded();}}
    
    @Test
    public void testOr_object_validInput_2items() {__CLR4_5_2mhnmhnlvha7fd9.R.globalSliceStart(getClass().getName(),29491);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2u3d6uomr7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2mhnmhnlvha7fd9.R.rethrow($CLV_t2$);}finally{__CLR4_5_2mhnmhnlvha7fd9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.BooleanUtilsTest.testOr_object_validInput_2items",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),29491,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2u3d6uomr7(){try{__CLR4_5_2mhnmhnlvha7fd9.R.inc(29491);
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29492);assertTrue(
            "False result for (true, true)",
            BooleanUtils
            .or(new Boolean[] { Boolean.TRUE, Boolean.TRUE })
            .booleanValue());
        
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29493);assertTrue(
            "True result for (false, false)",
            ! BooleanUtils
            .or(new Boolean[] { Boolean.FALSE, Boolean.FALSE })
            .booleanValue());
        
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29494);assertTrue(
            "False result for (true, false)",
            BooleanUtils
            .or(new Boolean[] { Boolean.TRUE, Boolean.FALSE })
            .booleanValue());
        
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29495);assertTrue(
            "False result for (false, true)",
            BooleanUtils
            .or(new Boolean[] { Boolean.FALSE, Boolean.TRUE })
            .booleanValue());
    }finally{__CLR4_5_2mhnmhnlvha7fd9.R.flushNeeded();}}
    
    @Test
    public void testOr_object_validInput_3items() {__CLR4_5_2mhnmhnlvha7fd9.R.globalSliceStart(getClass().getName(),29496);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2g06spbmrc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2mhnmhnlvha7fd9.R.rethrow($CLV_t2$);}finally{__CLR4_5_2mhnmhnlvha7fd9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.BooleanUtilsTest.testOr_object_validInput_3items",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),29496,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2g06spbmrc(){try{__CLR4_5_2mhnmhnlvha7fd9.R.inc(29496);
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29497);assertTrue(
            "False result for (false, false, true)",
            BooleanUtils
            .or(
                new Boolean[] {
                    Boolean.FALSE,
                    Boolean.FALSE,
                    Boolean.TRUE })
                    .booleanValue());
        
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29498);assertTrue(
            "False result for (false, true, false)",
            BooleanUtils
            .or(
                new Boolean[] {
                    Boolean.FALSE,
                    Boolean.TRUE,
                    Boolean.FALSE })
                    .booleanValue());
        
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29499);assertTrue(
            "False result for (true, false, false)",
            BooleanUtils
            .or(
                new Boolean[] {
                    Boolean.TRUE,
                    Boolean.FALSE,
                    Boolean.FALSE })
                    .booleanValue());
        
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29500);assertTrue(
            "False result for (true, true, true)",
            BooleanUtils
            .or(new Boolean[] { Boolean.TRUE, Boolean.TRUE, Boolean.TRUE })
            .booleanValue());
        
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29501);assertTrue(
            "True result for (false, false)",
            ! BooleanUtils.or(
                new Boolean[] {
                    Boolean.FALSE,
                    Boolean.FALSE,
                    Boolean.FALSE })
                    .booleanValue());
        
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29502);assertTrue(
            "False result for (true, true, false)",
            BooleanUtils.or(
                new Boolean[] {
                    Boolean.TRUE,
                    Boolean.TRUE,
                    Boolean.FALSE })
                    .booleanValue());
        
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29503);assertTrue(
            "False result for (true, false, true)",
            BooleanUtils.or(
                new Boolean[] {
                    Boolean.TRUE,
                    Boolean.FALSE,
                    Boolean.TRUE })
                    .booleanValue());
        
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29504);assertTrue(
            "False result for (false, true, true)",
            BooleanUtils.or(
                new Boolean[] {
                    Boolean.FALSE,
                    Boolean.TRUE,
                    Boolean.TRUE })
                    .booleanValue());
    }finally{__CLR4_5_2mhnmhnlvha7fd9.R.flushNeeded();}}

    @Test
    public void testCompare(){__CLR4_5_2mhnmhnlvha7fd9.R.globalSliceStart(getClass().getName(),29505);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28o8au2mrl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2mhnmhnlvha7fd9.R.rethrow($CLV_t2$);}finally{__CLR4_5_2mhnmhnlvha7fd9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.BooleanUtilsTest.testCompare",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),29505,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28o8au2mrl(){try{__CLR4_5_2mhnmhnlvha7fd9.R.inc(29505);
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29506);assertTrue(BooleanUtils.compare(true, false) > 0);
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29507);assertTrue(BooleanUtils.compare(true, true) == 0);
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29508);assertTrue(BooleanUtils.compare(false, false) == 0);
        __CLR4_5_2mhnmhnlvha7fd9.R.inc(29509);assertTrue(BooleanUtils.compare(false, true) < 0);
    }finally{__CLR4_5_2mhnmhnlvha7fd9.R.flushNeeded();}}
    
}
