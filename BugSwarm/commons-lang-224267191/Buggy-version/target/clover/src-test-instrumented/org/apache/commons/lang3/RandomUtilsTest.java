/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.commons.lang3;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

/**
 * Tests for {@link RandomUtils}
 */
public class RandomUtilsTest {static class __CLR4_5_2pw5pw5lvha7g1f{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172763741L,8589935092L,33638,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * For comparing doubles and floats
     */
    private static final double DELTA = 1e-5;

    @Test
    public void testConstructor() {__CLR4_5_2pw5pw5lvha7g1f.R.globalSliceStart(getClass().getName(),33557);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2uefs8hpw5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2pw5pw5lvha7g1f.R.rethrow($CLV_t2$);}finally{__CLR4_5_2pw5pw5lvha7g1f.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.RandomUtilsTest.testConstructor",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),33557,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2uefs8hpw5(){try{__CLR4_5_2pw5pw5lvha7g1f.R.inc(33557);
        __CLR4_5_2pw5pw5lvha7g1f.R.inc(33558);assertNotNull(new RandomUtils());
        __CLR4_5_2pw5pw5lvha7g1f.R.inc(33559);final Constructor<?>[] cons = RandomUtils.class.getDeclaredConstructors();
        __CLR4_5_2pw5pw5lvha7g1f.R.inc(33560);assertEquals(1, cons.length);
        __CLR4_5_2pw5pw5lvha7g1f.R.inc(33561);assertTrue(Modifier.isPublic(cons[0].getModifiers()));
        __CLR4_5_2pw5pw5lvha7g1f.R.inc(33562);assertTrue(Modifier.isPublic(RandomUtils.class.getModifiers()));
        __CLR4_5_2pw5pw5lvha7g1f.R.inc(33563);assertFalse(Modifier.isFinal(RandomUtils.class.getModifiers()));
    }finally{__CLR4_5_2pw5pw5lvha7g1f.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class)
    public void testNextBytesNegative() throws Exception {__CLR4_5_2pw5pw5lvha7g1f.R.globalSliceStart(getClass().getName(),33564);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2rc8yyqpwc();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,78,101,120,116,66,121,116,101,115,78,101,103,97,116,105,118,101,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2pw5pw5lvha7g1f.R.rethrow($CLV_t2$);}finally{__CLR4_5_2pw5pw5lvha7g1f.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.RandomUtilsTest.testNextBytesNegative",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),33564,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2rc8yyqpwc() throws Exception{try{__CLR4_5_2pw5pw5lvha7g1f.R.inc(33564);
        __CLR4_5_2pw5pw5lvha7g1f.R.inc(33565);RandomUtils.nextBytes(-1);
    }finally{__CLR4_5_2pw5pw5lvha7g1f.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class)
    public void testNextIntNegative() throws Exception {__CLR4_5_2pw5pw5lvha7g1f.R.globalSliceStart(getClass().getName(),33566);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_29k262ipwe();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,78,101,120,116,73,110,116,78,101,103,97,116,105,118,101,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2pw5pw5lvha7g1f.R.rethrow($CLV_t2$);}finally{__CLR4_5_2pw5pw5lvha7g1f.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.RandomUtilsTest.testNextIntNegative",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),33566,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_29k262ipwe() throws Exception{try{__CLR4_5_2pw5pw5lvha7g1f.R.inc(33566);
        __CLR4_5_2pw5pw5lvha7g1f.R.inc(33567);RandomUtils.nextInt(-1, 1);
    }finally{__CLR4_5_2pw5pw5lvha7g1f.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class)
    public void testNextLongNegative() throws Exception {__CLR4_5_2pw5pw5lvha7g1f.R.globalSliceStart(getClass().getName(),33568);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ibojh9pwg();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,78,101,120,116,76,111,110,103,78,101,103,97,116,105,118,101,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2pw5pw5lvha7g1f.R.rethrow($CLV_t2$);}finally{__CLR4_5_2pw5pw5lvha7g1f.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.RandomUtilsTest.testNextLongNegative",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),33568,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ibojh9pwg() throws Exception{try{__CLR4_5_2pw5pw5lvha7g1f.R.inc(33568);
        __CLR4_5_2pw5pw5lvha7g1f.R.inc(33569);RandomUtils.nextLong(-1, 1);
    }finally{__CLR4_5_2pw5pw5lvha7g1f.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class)
    public void testNextDoubleNegative() throws Exception {__CLR4_5_2pw5pw5lvha7g1f.R.globalSliceStart(getClass().getName(),33570);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26lwd1upwi();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,78,101,120,116,68,111,117,98,108,101,78,101,103,97,116,105,118,101,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2pw5pw5lvha7g1f.R.rethrow($CLV_t2$);}finally{__CLR4_5_2pw5pw5lvha7g1f.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.RandomUtilsTest.testNextDoubleNegative",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),33570,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26lwd1upwi() throws Exception{try{__CLR4_5_2pw5pw5lvha7g1f.R.inc(33570);
        __CLR4_5_2pw5pw5lvha7g1f.R.inc(33571);RandomUtils.nextDouble(-1, 1);
    }finally{__CLR4_5_2pw5pw5lvha7g1f.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class)
    public void testNextFloatNegative() throws Exception {__CLR4_5_2pw5pw5lvha7g1f.R.globalSliceStart(getClass().getName(),33572);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27n0m5ppwk();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,78,101,120,116,70,108,111,97,116,78,101,103,97,116,105,118,101,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2pw5pw5lvha7g1f.R.rethrow($CLV_t2$);}finally{__CLR4_5_2pw5pw5lvha7g1f.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.RandomUtilsTest.testNextFloatNegative",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),33572,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27n0m5ppwk() throws Exception{try{__CLR4_5_2pw5pw5lvha7g1f.R.inc(33572);
        __CLR4_5_2pw5pw5lvha7g1f.R.inc(33573);RandomUtils.nextFloat(-1, 1);
    }finally{__CLR4_5_2pw5pw5lvha7g1f.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class)
    public void testNextIntLowerGreaterUpper() throws Exception {__CLR4_5_2pw5pw5lvha7g1f.R.globalSliceStart(getClass().getName(),33574);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_29dxee2pwm();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,78,101,120,116,73,110,116,76,111,119,101,114,71,114,101,97,116,101,114,85,112,112,101,114,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2pw5pw5lvha7g1f.R.rethrow($CLV_t2$);}finally{__CLR4_5_2pw5pw5lvha7g1f.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.RandomUtilsTest.testNextIntLowerGreaterUpper",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),33574,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_29dxee2pwm() throws Exception{try{__CLR4_5_2pw5pw5lvha7g1f.R.inc(33574);
        __CLR4_5_2pw5pw5lvha7g1f.R.inc(33575);RandomUtils.nextInt(2, 1);
    }finally{__CLR4_5_2pw5pw5lvha7g1f.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class)
    public void testNextLongLowerGreaterUpper() throws Exception {__CLR4_5_2pw5pw5lvha7g1f.R.globalSliceStart(getClass().getName(),33576);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_226tqsvpwo();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,78,101,120,116,76,111,110,103,76,111,119,101,114,71,114,101,97,116,101,114,85,112,112,101,114,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2pw5pw5lvha7g1f.R.rethrow($CLV_t2$);}finally{__CLR4_5_2pw5pw5lvha7g1f.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.RandomUtilsTest.testNextLongLowerGreaterUpper",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),33576,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_226tqsvpwo() throws Exception{try{__CLR4_5_2pw5pw5lvha7g1f.R.inc(33576);
        __CLR4_5_2pw5pw5lvha7g1f.R.inc(33577);RandomUtils.nextLong(2, 1);
    }finally{__CLR4_5_2pw5pw5lvha7g1f.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class)
    public void testNextDoubleLowerGreaterUpper() throws Exception {__CLR4_5_2pw5pw5lvha7g1f.R.globalSliceStart(getClass().getName(),33578);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2l7h922pwq();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,78,101,120,116,68,111,117,98,108,101,76,111,119,101,114,71,114,101,97,116,101,114,85,112,112,101,114,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2pw5pw5lvha7g1f.R.rethrow($CLV_t2$);}finally{__CLR4_5_2pw5pw5lvha7g1f.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.RandomUtilsTest.testNextDoubleLowerGreaterUpper",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),33578,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2l7h922pwq() throws Exception{try{__CLR4_5_2pw5pw5lvha7g1f.R.inc(33578);
        __CLR4_5_2pw5pw5lvha7g1f.R.inc(33579);RandomUtils.nextDouble(2, 1);
    }finally{__CLR4_5_2pw5pw5lvha7g1f.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class)
    public void testNextFloatLowerGreaterUpper() throws Exception {__CLR4_5_2pw5pw5lvha7g1f.R.globalSliceStart(getClass().getName(),33580);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2mubyivpws();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,78,101,120,116,70,108,111,97,116,76,111,119,101,114,71,114,101,97,116,101,114,85,112,112,101,114,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2pw5pw5lvha7g1f.R.rethrow($CLV_t2$);}finally{__CLR4_5_2pw5pw5lvha7g1f.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.RandomUtilsTest.testNextFloatLowerGreaterUpper",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),33580,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2mubyivpws() throws Exception{try{__CLR4_5_2pw5pw5lvha7g1f.R.inc(33580);
        __CLR4_5_2pw5pw5lvha7g1f.R.inc(33581);RandomUtils.nextFloat(2, 1);
    }finally{__CLR4_5_2pw5pw5lvha7g1f.R.flushNeeded();}}

    /**
     * Tests next boolean
     */
    @Test
    public void testBoolean() {__CLR4_5_2pw5pw5lvha7g1f.R.globalSliceStart(getClass().getName(),33582);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2a9awn1pwu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2pw5pw5lvha7g1f.R.rethrow($CLV_t2$);}finally{__CLR4_5_2pw5pw5lvha7g1f.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.RandomUtilsTest.testBoolean",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),33582,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2a9awn1pwu(){try{__CLR4_5_2pw5pw5lvha7g1f.R.inc(33582);
        __CLR4_5_2pw5pw5lvha7g1f.R.inc(33583);boolean result = RandomUtils.nextBoolean();
        __CLR4_5_2pw5pw5lvha7g1f.R.inc(33584);assertTrue(result == true || result == false);
    }finally{__CLR4_5_2pw5pw5lvha7g1f.R.flushNeeded();}}

    /**
     * Tests a zero byte array length.
     */
    @Test
    public void testZeroLengthNextBytes() {__CLR4_5_2pw5pw5lvha7g1f.R.globalSliceStart(getClass().getName(),33585);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2fv5b3zpwx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2pw5pw5lvha7g1f.R.rethrow($CLV_t2$);}finally{__CLR4_5_2pw5pw5lvha7g1f.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.RandomUtilsTest.testZeroLengthNextBytes",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),33585,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2fv5b3zpwx(){try{__CLR4_5_2pw5pw5lvha7g1f.R.inc(33585);
        __CLR4_5_2pw5pw5lvha7g1f.R.inc(33586);assertArrayEquals(new byte[0], RandomUtils.nextBytes(0));
    }finally{__CLR4_5_2pw5pw5lvha7g1f.R.flushNeeded();}}

    /**
     * Tests random byte array.
     */
    @Test
    public void testNextBytes() {__CLR4_5_2pw5pw5lvha7g1f.R.globalSliceStart(getClass().getName(),33587);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_25xziybpwz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2pw5pw5lvha7g1f.R.rethrow($CLV_t2$);}finally{__CLR4_5_2pw5pw5lvha7g1f.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.RandomUtilsTest.testNextBytes",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),33587,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_25xziybpwz(){try{__CLR4_5_2pw5pw5lvha7g1f.R.inc(33587);
        __CLR4_5_2pw5pw5lvha7g1f.R.inc(33588);final byte[] result = RandomUtils.nextBytes(20);
        __CLR4_5_2pw5pw5lvha7g1f.R.inc(33589);assertEquals(20, result.length);
    }finally{__CLR4_5_2pw5pw5lvha7g1f.R.flushNeeded();}}

    /**
     * Test next int range with minimal range.
     */
    @Test
    public void testNextIntMinimalRange() {__CLR4_5_2pw5pw5lvha7g1f.R.globalSliceStart(getClass().getName(),33590);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24t7qr7px2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2pw5pw5lvha7g1f.R.rethrow($CLV_t2$);}finally{__CLR4_5_2pw5pw5lvha7g1f.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.RandomUtilsTest.testNextIntMinimalRange",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),33590,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24t7qr7px2(){try{__CLR4_5_2pw5pw5lvha7g1f.R.inc(33590);
        __CLR4_5_2pw5pw5lvha7g1f.R.inc(33591);assertEquals(42, RandomUtils.nextInt(42, 42));
    }finally{__CLR4_5_2pw5pw5lvha7g1f.R.flushNeeded();}}
    
    /**
     * Tests next int range.
     */
    @Test
    public void testNextInt() {__CLR4_5_2pw5pw5lvha7g1f.R.globalSliceStart(getClass().getName(),33592);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2h6e0whpx4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2pw5pw5lvha7g1f.R.rethrow($CLV_t2$);}finally{__CLR4_5_2pw5pw5lvha7g1f.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.RandomUtilsTest.testNextInt",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),33592,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2h6e0whpx4(){try{__CLR4_5_2pw5pw5lvha7g1f.R.inc(33592);
        __CLR4_5_2pw5pw5lvha7g1f.R.inc(33593);final int result = RandomUtils.nextInt(33, 42);
        __CLR4_5_2pw5pw5lvha7g1f.R.inc(33594);assertTrue(result >= 33 && result < 42);
    }finally{__CLR4_5_2pw5pw5lvha7g1f.R.flushNeeded();}}

    /**
     * Tests next double range, random result.
     */
    @Test
    public void testNextIntRandomResult() {__CLR4_5_2pw5pw5lvha7g1f.R.globalSliceStart(getClass().getName(),33595);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jv81sfpx7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2pw5pw5lvha7g1f.R.rethrow($CLV_t2$);}finally{__CLR4_5_2pw5pw5lvha7g1f.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.RandomUtilsTest.testNextIntRandomResult",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),33595,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jv81sfpx7(){try{__CLR4_5_2pw5pw5lvha7g1f.R.inc(33595);
        __CLR4_5_2pw5pw5lvha7g1f.R.inc(33596);final int randomResult = RandomUtils.nextInt();
        __CLR4_5_2pw5pw5lvha7g1f.R.inc(33597);assertTrue(randomResult > 0);
        __CLR4_5_2pw5pw5lvha7g1f.R.inc(33598);assertTrue(randomResult < Integer.MAX_VALUE);
    }finally{__CLR4_5_2pw5pw5lvha7g1f.R.flushNeeded();}}
    
    /**
     * Test next double range with minimal range.
     */
    @Test
    public void testNextDoubleMinimalRange() {__CLR4_5_2pw5pw5lvha7g1f.R.globalSliceStart(getClass().getName(),33599);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_29gfl3pxb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2pw5pw5lvha7g1f.R.rethrow($CLV_t2$);}finally{__CLR4_5_2pw5pw5lvha7g1f.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.RandomUtilsTest.testNextDoubleMinimalRange",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),33599,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_29gfl3pxb(){try{__CLR4_5_2pw5pw5lvha7g1f.R.inc(33599);
        __CLR4_5_2pw5pw5lvha7g1f.R.inc(33600);assertEquals(42.1, RandomUtils.nextDouble(42.1, 42.1), DELTA);
    }finally{__CLR4_5_2pw5pw5lvha7g1f.R.flushNeeded();}}    
    
    /**
     * Test next float range with minimal range.
     */
    @Test
    public void testNextFloatMinimalRange() {__CLR4_5_2pw5pw5lvha7g1f.R.globalSliceStart(getClass().getName(),33601);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2s67yoqpxd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2pw5pw5lvha7g1f.R.rethrow($CLV_t2$);}finally{__CLR4_5_2pw5pw5lvha7g1f.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.RandomUtilsTest.testNextFloatMinimalRange",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),33601,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2s67yoqpxd(){try{__CLR4_5_2pw5pw5lvha7g1f.R.inc(33601);
        __CLR4_5_2pw5pw5lvha7g1f.R.inc(33602);assertEquals(42.1f, RandomUtils.nextFloat(42.1f, 42.1f), DELTA);
    }finally{__CLR4_5_2pw5pw5lvha7g1f.R.flushNeeded();}}     
    
    /**
     * Tests next double range.
     */
    @Test
    public void testNextDouble() {__CLR4_5_2pw5pw5lvha7g1f.R.globalSliceStart(getClass().getName(),33603);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2lul2ubpxf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2pw5pw5lvha7g1f.R.rethrow($CLV_t2$);}finally{__CLR4_5_2pw5pw5lvha7g1f.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.RandomUtilsTest.testNextDouble",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),33603,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2lul2ubpxf(){try{__CLR4_5_2pw5pw5lvha7g1f.R.inc(33603);
        __CLR4_5_2pw5pw5lvha7g1f.R.inc(33604);final double result = RandomUtils.nextDouble(33d, 42d);
        __CLR4_5_2pw5pw5lvha7g1f.R.inc(33605);assertTrue(result >= 33d && result <= 42d);
    }finally{__CLR4_5_2pw5pw5lvha7g1f.R.flushNeeded();}}

    /**
     * Tests next double range, random result.
     */
    @Test
    public void testNextDoubleRandomResult() {__CLR4_5_2pw5pw5lvha7g1f.R.globalSliceStart(getClass().getName(),33606);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2fbgqmbpxi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2pw5pw5lvha7g1f.R.rethrow($CLV_t2$);}finally{__CLR4_5_2pw5pw5lvha7g1f.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.RandomUtilsTest.testNextDoubleRandomResult",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),33606,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2fbgqmbpxi(){try{__CLR4_5_2pw5pw5lvha7g1f.R.inc(33606);
        __CLR4_5_2pw5pw5lvha7g1f.R.inc(33607);final double randomResult = RandomUtils.nextDouble();
        __CLR4_5_2pw5pw5lvha7g1f.R.inc(33608);assertTrue(randomResult > 0);
        __CLR4_5_2pw5pw5lvha7g1f.R.inc(33609);assertTrue(randomResult < Double.MAX_VALUE);
    }finally{__CLR4_5_2pw5pw5lvha7g1f.R.flushNeeded();}}
    
    /**
     * Tests next float range.
     */
    @Test
    public void testNextFloat() {__CLR4_5_2pw5pw5lvha7g1f.R.globalSliceStart(getClass().getName(),33610);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21j5icepxm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2pw5pw5lvha7g1f.R.rethrow($CLV_t2$);}finally{__CLR4_5_2pw5pw5lvha7g1f.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.RandomUtilsTest.testNextFloat",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),33610,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21j5icepxm(){try{__CLR4_5_2pw5pw5lvha7g1f.R.inc(33610);
        __CLR4_5_2pw5pw5lvha7g1f.R.inc(33611);final double result = RandomUtils.nextFloat(33f, 42f);
        __CLR4_5_2pw5pw5lvha7g1f.R.inc(33612);assertTrue(result >= 33f && result <= 42f);
    }finally{__CLR4_5_2pw5pw5lvha7g1f.R.flushNeeded();}}

    /**
     * Tests next float range, random result.
     */
    @Test
    public void testNextFloatRandomResult() {__CLR4_5_2pw5pw5lvha7g1f.R.globalSliceStart(getClass().getName(),33613);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2d47nnipxp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2pw5pw5lvha7g1f.R.rethrow($CLV_t2$);}finally{__CLR4_5_2pw5pw5lvha7g1f.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.RandomUtilsTest.testNextFloatRandomResult",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),33613,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2d47nnipxp(){try{__CLR4_5_2pw5pw5lvha7g1f.R.inc(33613);
        __CLR4_5_2pw5pw5lvha7g1f.R.inc(33614);final float randomResult = RandomUtils.nextFloat();
        __CLR4_5_2pw5pw5lvha7g1f.R.inc(33615);assertTrue(randomResult > 0);
        __CLR4_5_2pw5pw5lvha7g1f.R.inc(33616);assertTrue(randomResult < Float.MAX_VALUE);
    }finally{__CLR4_5_2pw5pw5lvha7g1f.R.flushNeeded();}}

    /**
     * Test next long range with minimal range.
     */
    @Test
    public void testNextLongMinimalRange() {__CLR4_5_2pw5pw5lvha7g1f.R.globalSliceStart(getClass().getName(),33617);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26mn8yspxt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2pw5pw5lvha7g1f.R.rethrow($CLV_t2$);}finally{__CLR4_5_2pw5pw5lvha7g1f.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.RandomUtilsTest.testNextLongMinimalRange",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),33617,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26mn8yspxt(){try{__CLR4_5_2pw5pw5lvha7g1f.R.inc(33617);
        __CLR4_5_2pw5pw5lvha7g1f.R.inc(33618);assertEquals(42L, RandomUtils.nextLong(42L, 42L));
    }finally{__CLR4_5_2pw5pw5lvha7g1f.R.flushNeeded();}}
    
    /**
     * Tests next long range.
     */
    @Test
    public void testNextLong() {__CLR4_5_2pw5pw5lvha7g1f.R.globalSliceStart(getClass().getName(),33619);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2demm7cpxv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2pw5pw5lvha7g1f.R.rethrow($CLV_t2$);}finally{__CLR4_5_2pw5pw5lvha7g1f.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.RandomUtilsTest.testNextLong",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),33619,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2demm7cpxv(){try{__CLR4_5_2pw5pw5lvha7g1f.R.inc(33619);
        __CLR4_5_2pw5pw5lvha7g1f.R.inc(33620);final long result = RandomUtils.nextLong(33L, 42L);
        __CLR4_5_2pw5pw5lvha7g1f.R.inc(33621);assertTrue(result >= 33L && result < 42L);
    }finally{__CLR4_5_2pw5pw5lvha7g1f.R.flushNeeded();}}

    /**
     * Tests next long range, random result.
     */
    @Test
    public void testNextLongRandomResult() {__CLR4_5_2pw5pw5lvha7g1f.R.globalSliceStart(getClass().getName(),33622);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28fd22gpxy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2pw5pw5lvha7g1f.R.rethrow($CLV_t2$);}finally{__CLR4_5_2pw5pw5lvha7g1f.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.RandomUtilsTest.testNextLongRandomResult",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),33622,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28fd22gpxy(){try{__CLR4_5_2pw5pw5lvha7g1f.R.inc(33622);
        __CLR4_5_2pw5pw5lvha7g1f.R.inc(33623);final long randomResult = RandomUtils.nextLong();
        __CLR4_5_2pw5pw5lvha7g1f.R.inc(33624);assertTrue(randomResult > 0);
        __CLR4_5_2pw5pw5lvha7g1f.R.inc(33625);assertTrue(randomResult < Long.MAX_VALUE);
    }finally{__CLR4_5_2pw5pw5lvha7g1f.R.flushNeeded();}}
    
    /**
     * Tests extreme range.
     */
    @Test
    public void testExtremeRangeInt() {__CLR4_5_2pw5pw5lvha7g1f.R.globalSliceStart(getClass().getName(),33626);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2du8dg3py2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2pw5pw5lvha7g1f.R.rethrow($CLV_t2$);}finally{__CLR4_5_2pw5pw5lvha7g1f.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.RandomUtilsTest.testExtremeRangeInt",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),33626,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2du8dg3py2(){try{__CLR4_5_2pw5pw5lvha7g1f.R.inc(33626);
        __CLR4_5_2pw5pw5lvha7g1f.R.inc(33627);final int result = RandomUtils.nextInt(0, Integer.MAX_VALUE);
        __CLR4_5_2pw5pw5lvha7g1f.R.inc(33628);assertTrue(result >= 0 && result < Integer.MAX_VALUE);
    }finally{__CLR4_5_2pw5pw5lvha7g1f.R.flushNeeded();}}
    
    /**
     * Tests extreme range.
     */
    @Test
    public void testExtremeRangeLong() {__CLR4_5_2pw5pw5lvha7g1f.R.globalSliceStart(getClass().getName(),33629);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2j14ixmpy5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2pw5pw5lvha7g1f.R.rethrow($CLV_t2$);}finally{__CLR4_5_2pw5pw5lvha7g1f.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.RandomUtilsTest.testExtremeRangeLong",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),33629,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2j14ixmpy5(){try{__CLR4_5_2pw5pw5lvha7g1f.R.inc(33629);
        __CLR4_5_2pw5pw5lvha7g1f.R.inc(33630);final long result = RandomUtils.nextLong(0, Long.MAX_VALUE);
        __CLR4_5_2pw5pw5lvha7g1f.R.inc(33631);assertTrue(result >= 0 && result < Long.MAX_VALUE);
    }finally{__CLR4_5_2pw5pw5lvha7g1f.R.flushNeeded();}}    
    
    /**
     * Tests extreme range.
     */
    @Test
    public void testExtremeRangeFloat() {__CLR4_5_2pw5pw5lvha7g1f.R.globalSliceStart(getClass().getName(),33632);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_29ln59cpy8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2pw5pw5lvha7g1f.R.rethrow($CLV_t2$);}finally{__CLR4_5_2pw5pw5lvha7g1f.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.RandomUtilsTest.testExtremeRangeFloat",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),33632,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_29ln59cpy8(){try{__CLR4_5_2pw5pw5lvha7g1f.R.inc(33632);
        __CLR4_5_2pw5pw5lvha7g1f.R.inc(33633);final float result = RandomUtils.nextFloat(0, Float.MAX_VALUE);
        __CLR4_5_2pw5pw5lvha7g1f.R.inc(33634);assertTrue(result >= 0f && result <= Float.MAX_VALUE);
    }finally{__CLR4_5_2pw5pw5lvha7g1f.R.flushNeeded();}}    
    
    /**
     * Tests extreme range.
     */
    @Test
    public void testExtremeRangeDouble() {__CLR4_5_2pw5pw5lvha7g1f.R.globalSliceStart(getClass().getName(),33635);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2btp4o5pyb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2pw5pw5lvha7g1f.R.rethrow($CLV_t2$);}finally{__CLR4_5_2pw5pw5lvha7g1f.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.RandomUtilsTest.testExtremeRangeDouble",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),33635,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2btp4o5pyb(){try{__CLR4_5_2pw5pw5lvha7g1f.R.inc(33635);
        __CLR4_5_2pw5pw5lvha7g1f.R.inc(33636);final double result = RandomUtils.nextDouble(0, Double.MAX_VALUE);
        __CLR4_5_2pw5pw5lvha7g1f.R.inc(33637);assertTrue(result >= 0 && result <= Double.MAX_VALUE);
    }finally{__CLR4_5_2pw5pw5lvha7g1f.R.flushNeeded();}}    
}
