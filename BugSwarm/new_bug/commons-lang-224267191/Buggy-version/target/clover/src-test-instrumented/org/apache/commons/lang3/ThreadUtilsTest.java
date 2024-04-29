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
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CountDownLatch;

import org.junit.Test;

/**
 * Unit tests {@link org.apache.commons.lang3.ThreadUtils}.
 */
public class ThreadUtilsTest {static class __CLR4_5_2tm8tm8lvha7gr1{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172763741L,8589935092L,38584,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test(expected=IllegalArgumentException.class)
    public void testNullThreadName() throws InterruptedException {__CLR4_5_2tm8tm8lvha7gr1.R.globalSliceStart(getClass().getName(),38384);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26ywzvvtm8();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,78,117,108,108,84,104,114,101,97,100,78,97,109,101,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2tm8tm8lvha7gr1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2tm8tm8lvha7gr1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ThreadUtilsTest.testNullThreadName",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),38384,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26ywzvvtm8() throws InterruptedException{try{__CLR4_5_2tm8tm8lvha7gr1.R.inc(38384);
        __CLR4_5_2tm8tm8lvha7gr1.R.inc(38385);ThreadUtils.findThreadsByName(null);
    }finally{__CLR4_5_2tm8tm8lvha7gr1.R.flushNeeded();}}

    @Test(expected=IllegalArgumentException.class)
    public void testNullThreadGroupName() throws InterruptedException {__CLR4_5_2tm8tm8lvha7gr1.R.globalSliceStart(getClass().getName(),38386);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2etrgiatma();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,78,117,108,108,84,104,114,101,97,100,71,114,111,117,112,78,97,109,101,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2tm8tm8lvha7gr1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2tm8tm8lvha7gr1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ThreadUtilsTest.testNullThreadGroupName",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),38386,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2etrgiatma() throws InterruptedException{try{__CLR4_5_2tm8tm8lvha7gr1.R.inc(38386);
        __CLR4_5_2tm8tm8lvha7gr1.R.inc(38387);ThreadUtils.findThreadGroupsByName(null);
    }finally{__CLR4_5_2tm8tm8lvha7gr1.R.flushNeeded();}}

    @Test(expected=IllegalArgumentException.class)
    public void testNullThreadThreadGroupName1() throws InterruptedException {__CLR4_5_2tm8tm8lvha7gr1.R.globalSliceStart(getClass().getName(),38388);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2q4hn97tmc();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,78,117,108,108,84,104,114,101,97,100,84,104,114,101,97,100,71,114,111,117,112,78,97,109,101,49,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2tm8tm8lvha7gr1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2tm8tm8lvha7gr1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ThreadUtilsTest.testNullThreadThreadGroupName1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),38388,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2q4hn97tmc() throws InterruptedException{try{__CLR4_5_2tm8tm8lvha7gr1.R.inc(38388);
        __CLR4_5_2tm8tm8lvha7gr1.R.inc(38389);ThreadUtils.findThreadsByName(null, "tgname");
    }finally{__CLR4_5_2tm8tm8lvha7gr1.R.flushNeeded();}}

    @Test(expected=IllegalArgumentException.class)
    public void testNullThreadThreadGroupName2() throws InterruptedException {__CLR4_5_2tm8tm8lvha7gr1.R.globalSliceStart(getClass().getName(),38390);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2tdhm1otme();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,78,117,108,108,84,104,114,101,97,100,84,104,114,101,97,100,71,114,111,117,112,78,97,109,101,50,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2tm8tm8lvha7gr1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2tm8tm8lvha7gr1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ThreadUtilsTest.testNullThreadThreadGroupName2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),38390,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2tdhm1otme() throws InterruptedException{try{__CLR4_5_2tm8tm8lvha7gr1.R.inc(38390);
        __CLR4_5_2tm8tm8lvha7gr1.R.inc(38391);ThreadUtils.findThreadsByName("tname", (String) null);
    }finally{__CLR4_5_2tm8tm8lvha7gr1.R.flushNeeded();}}

    @Test(expected=IllegalArgumentException.class)
    public void testNullThreadThreadGroupName3() throws InterruptedException {__CLR4_5_2tm8tm8lvha7gr1.R.globalSliceStart(getClass().getName(),38392);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2wmhku5tmg();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,78,117,108,108,84,104,114,101,97,100,84,104,114,101,97,100,71,114,111,117,112,78,97,109,101,51,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2tm8tm8lvha7gr1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2tm8tm8lvha7gr1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ThreadUtilsTest.testNullThreadThreadGroupName3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),38392,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2wmhku5tmg() throws InterruptedException{try{__CLR4_5_2tm8tm8lvha7gr1.R.inc(38392);
        __CLR4_5_2tm8tm8lvha7gr1.R.inc(38393);ThreadUtils.findThreadsByName(null, (String) null);
    }finally{__CLR4_5_2tm8tm8lvha7gr1.R.flushNeeded();}}

    @Test(expected=IllegalArgumentException.class)
    public void testNullThreadThreadGroup1() throws InterruptedException {__CLR4_5_2tm8tm8lvha7gr1.R.globalSliceStart(getClass().getName(),38394);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2pv5k4atmi();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,78,117,108,108,84,104,114,101,97,100,84,104,114,101,97,100,71,114,111,117,112,49,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2tm8tm8lvha7gr1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2tm8tm8lvha7gr1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ThreadUtilsTest.testNullThreadThreadGroup1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),38394,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2pv5k4atmi() throws InterruptedException{try{__CLR4_5_2tm8tm8lvha7gr1.R.inc(38394);
        __CLR4_5_2tm8tm8lvha7gr1.R.inc(38395);ThreadUtils.findThreadsByName("tname", (ThreadGroup) null);
    }finally{__CLR4_5_2tm8tm8lvha7gr1.R.flushNeeded();}}

    @Test(expected=IllegalArgumentException.class)
    public void testNullThreadThreadGroup2() throws InterruptedException {__CLR4_5_2tm8tm8lvha7gr1.R.globalSliceStart(getClass().getName(),38396);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2mm5lbttmk();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,78,117,108,108,84,104,114,101,97,100,84,104,114,101,97,100,71,114,111,117,112,50,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2tm8tm8lvha7gr1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2tm8tm8lvha7gr1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ThreadUtilsTest.testNullThreadThreadGroup2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),38396,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2mm5lbttmk() throws InterruptedException{try{__CLR4_5_2tm8tm8lvha7gr1.R.inc(38396);
        __CLR4_5_2tm8tm8lvha7gr1.R.inc(38397);ThreadUtils.findThreadById(1L, (ThreadGroup) null);
    }finally{__CLR4_5_2tm8tm8lvha7gr1.R.flushNeeded();}}

    @Test(expected=IllegalArgumentException.class)
    public void testNullThreadThreadGroup3() throws InterruptedException {__CLR4_5_2tm8tm8lvha7gr1.R.globalSliceStart(getClass().getName(),38398);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jd5mjctmm();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,78,117,108,108,84,104,114,101,97,100,84,104,114,101,97,100,71,114,111,117,112,51,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2tm8tm8lvha7gr1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2tm8tm8lvha7gr1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ThreadUtilsTest.testNullThreadThreadGroup3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),38398,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jd5mjctmm() throws InterruptedException{try{__CLR4_5_2tm8tm8lvha7gr1.R.inc(38398);
        __CLR4_5_2tm8tm8lvha7gr1.R.inc(38399);ThreadUtils.findThreadsByName(null, (ThreadGroup) null);
    }finally{__CLR4_5_2tm8tm8lvha7gr1.R.flushNeeded();}}

    @Test(expected=IllegalArgumentException.class)
    public void testInvalidThreadId() throws InterruptedException {__CLR4_5_2tm8tm8lvha7gr1.R.globalSliceStart(getClass().getName(),38400);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ad0lxrtmo();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,73,110,118,97,108,105,100,84,104,114,101,97,100,73,100,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2tm8tm8lvha7gr1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2tm8tm8lvha7gr1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ThreadUtilsTest.testInvalidThreadId",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),38400,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ad0lxrtmo() throws InterruptedException{try{__CLR4_5_2tm8tm8lvha7gr1.R.inc(38400);
        __CLR4_5_2tm8tm8lvha7gr1.R.inc(38401);ThreadUtils.findThreadById(-5L);
    }finally{__CLR4_5_2tm8tm8lvha7gr1.R.flushNeeded();}}

    @Test(expected=IllegalArgumentException.class)
    public void testThreadGroupsByIdFail() throws InterruptedException {__CLR4_5_2tm8tm8lvha7gr1.R.globalSliceStart(getClass().getName(),38402);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_236xljttmq();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,84,104,114,101,97,100,71,114,111,117,112,115,66,121,73,100,70,97,105,108,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2tm8tm8lvha7gr1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2tm8tm8lvha7gr1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ThreadUtilsTest.testThreadGroupsByIdFail",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),38402,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_236xljttmq() throws InterruptedException{try{__CLR4_5_2tm8tm8lvha7gr1.R.inc(38402);
        __CLR4_5_2tm8tm8lvha7gr1.R.inc(38403);ThreadUtils.findThreadById(Thread.currentThread().getId(), (String) null);
    }finally{__CLR4_5_2tm8tm8lvha7gr1.R.flushNeeded();}}

    @Test(expected=IllegalArgumentException.class)
    public void testThreadgroupsNullParent() throws InterruptedException {__CLR4_5_2tm8tm8lvha7gr1.R.globalSliceStart(getClass().getName(),38404);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ozn7fstms();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,84,104,114,101,97,100,103,114,111,117,112,115,78,117,108,108,80,97,114,101,110,116,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2tm8tm8lvha7gr1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2tm8tm8lvha7gr1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ThreadUtilsTest.testThreadgroupsNullParent",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),38404,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ozn7fstms() throws InterruptedException{try{__CLR4_5_2tm8tm8lvha7gr1.R.inc(38404);
        __CLR4_5_2tm8tm8lvha7gr1.R.inc(38405);ThreadUtils.findThreadGroups(null, true, ThreadUtils.ALWAYS_TRUE_PREDICATE);
    }finally{__CLR4_5_2tm8tm8lvha7gr1.R.flushNeeded();}}

    @Test(expected=IllegalArgumentException.class)
    public void testThreadgroupsNullPredicate() throws InterruptedException {__CLR4_5_2tm8tm8lvha7gr1.R.globalSliceStart(getClass().getName(),38406);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2y5im7ttmu();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,84,104,114,101,97,100,103,114,111,117,112,115,78,117,108,108,80,114,101,100,105,99,97,116,101,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2tm8tm8lvha7gr1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2tm8tm8lvha7gr1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ThreadUtilsTest.testThreadgroupsNullPredicate",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),38406,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2y5im7ttmu() throws InterruptedException{try{__CLR4_5_2tm8tm8lvha7gr1.R.inc(38406);
        __CLR4_5_2tm8tm8lvha7gr1.R.inc(38407);ThreadUtils.findThreadGroups(null);
    }finally{__CLR4_5_2tm8tm8lvha7gr1.R.flushNeeded();}}

    @Test(expected=IllegalArgumentException.class)
    public void testThreadsNullPredicate() throws InterruptedException {__CLR4_5_2tm8tm8lvha7gr1.R.globalSliceStart(getClass().getName(),38408);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_250tk68tmw();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,84,104,114,101,97,100,115,78,117,108,108,80,114,101,100,105,99,97,116,101,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2tm8tm8lvha7gr1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2tm8tm8lvha7gr1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ThreadUtilsTest.testThreadsNullPredicate",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),38408,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_250tk68tmw() throws InterruptedException{try{__CLR4_5_2tm8tm8lvha7gr1.R.inc(38408);
        __CLR4_5_2tm8tm8lvha7gr1.R.inc(38409);ThreadUtils.findThreads(null);
    }finally{__CLR4_5_2tm8tm8lvha7gr1.R.flushNeeded();}}

    @Test
    public void testNoThread() throws InterruptedException {__CLR4_5_2tm8tm8lvha7gr1.R.globalSliceStart(getClass().getName(),38410);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_25lf2potmy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2tm8tm8lvha7gr1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2tm8tm8lvha7gr1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ThreadUtilsTest.testNoThread",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),38410,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_25lf2potmy() throws InterruptedException{try{__CLR4_5_2tm8tm8lvha7gr1.R.inc(38410);
        __CLR4_5_2tm8tm8lvha7gr1.R.inc(38411);assertEquals(0, ThreadUtils.findThreadsByName("some_thread_which_does_not_exist_18762ZucTT").size());
    }finally{__CLR4_5_2tm8tm8lvha7gr1.R.flushNeeded();}}

    @Test
    public void testNoThreadGroup() throws InterruptedException {__CLR4_5_2tm8tm8lvha7gr1.R.globalSliceStart(getClass().getName(),38412);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n0ae95tn0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2tm8tm8lvha7gr1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2tm8tm8lvha7gr1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ThreadUtilsTest.testNoThreadGroup",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),38412,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n0ae95tn0() throws InterruptedException{try{__CLR4_5_2tm8tm8lvha7gr1.R.inc(38412);
        __CLR4_5_2tm8tm8lvha7gr1.R.inc(38413);assertEquals(0, ThreadUtils.findThreadGroupsByName("some_thread_group_which_does_not_exist_18762ZucTTII").size());
    }finally{__CLR4_5_2tm8tm8lvha7gr1.R.flushNeeded();}}

    @Test
    public void testSystemThreadGroupExists() throws InterruptedException {__CLR4_5_2tm8tm8lvha7gr1.R.globalSliceStart(getClass().getName(),38414);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26td6pjtn2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2tm8tm8lvha7gr1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2tm8tm8lvha7gr1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ThreadUtilsTest.testSystemThreadGroupExists",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),38414,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26td6pjtn2() throws InterruptedException{try{__CLR4_5_2tm8tm8lvha7gr1.R.inc(38414);
        __CLR4_5_2tm8tm8lvha7gr1.R.inc(38415);final ThreadGroup systemThreadGroup = ThreadUtils.getSystemThreadGroup();
        __CLR4_5_2tm8tm8lvha7gr1.R.inc(38416);assertNotNull(systemThreadGroup);
        __CLR4_5_2tm8tm8lvha7gr1.R.inc(38417);assertNull(systemThreadGroup.getParent());
        __CLR4_5_2tm8tm8lvha7gr1.R.inc(38418);assertEquals("system", systemThreadGroup.getName());
    }finally{__CLR4_5_2tm8tm8lvha7gr1.R.flushNeeded();}}

    @Test
    public void testAtLeastOneThreadExists() throws InterruptedException {__CLR4_5_2tm8tm8lvha7gr1.R.globalSliceStart(getClass().getName(),38419);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2wjml75tn7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2tm8tm8lvha7gr1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2tm8tm8lvha7gr1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ThreadUtilsTest.testAtLeastOneThreadExists",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),38419,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2wjml75tn7() throws InterruptedException{try{__CLR4_5_2tm8tm8lvha7gr1.R.inc(38419);
        __CLR4_5_2tm8tm8lvha7gr1.R.inc(38420);assertTrue(ThreadUtils.getAllThreads().size() > 0);
    }finally{__CLR4_5_2tm8tm8lvha7gr1.R.flushNeeded();}}

    @Test
    public void testAtLeastOneThreadGroupsExists() throws InterruptedException {__CLR4_5_2tm8tm8lvha7gr1.R.globalSliceStart(getClass().getName(),38421);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jzp07xtn9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2tm8tm8lvha7gr1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2tm8tm8lvha7gr1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ThreadUtilsTest.testAtLeastOneThreadGroupsExists",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),38421,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jzp07xtn9() throws InterruptedException{try{__CLR4_5_2tm8tm8lvha7gr1.R.inc(38421);
        __CLR4_5_2tm8tm8lvha7gr1.R.inc(38422);assertTrue(ThreadUtils.getAllThreadGroups().size() > 0);
    }finally{__CLR4_5_2tm8tm8lvha7gr1.R.flushNeeded();}}

    @Test
    public void testThreadsSameName() throws InterruptedException {__CLR4_5_2tm8tm8lvha7gr1.R.globalSliceStart(getClass().getName(),38423);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ig2b73tnb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2tm8tm8lvha7gr1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2tm8tm8lvha7gr1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ThreadUtilsTest.testThreadsSameName",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),38423,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ig2b73tnb() throws InterruptedException{try{__CLR4_5_2tm8tm8lvha7gr1.R.inc(38423);
        __CLR4_5_2tm8tm8lvha7gr1.R.inc(38424);final Thread t1 = new TestThread("thread1_XXOOLL__");
        __CLR4_5_2tm8tm8lvha7gr1.R.inc(38425);final Thread alsot1 = new TestThread("thread1_XXOOLL__");

        __CLR4_5_2tm8tm8lvha7gr1.R.inc(38426);try {
            __CLR4_5_2tm8tm8lvha7gr1.R.inc(38427);t1.start();
            __CLR4_5_2tm8tm8lvha7gr1.R.inc(38428);alsot1.start();
            __CLR4_5_2tm8tm8lvha7gr1.R.inc(38429);assertEquals(2, ThreadUtils.findThreadsByName("thread1_XXOOLL__").size());
        } finally {
            __CLR4_5_2tm8tm8lvha7gr1.R.inc(38430);t1.interrupt();
            __CLR4_5_2tm8tm8lvha7gr1.R.inc(38431);alsot1.interrupt();
            __CLR4_5_2tm8tm8lvha7gr1.R.inc(38432);t1.join();
            __CLR4_5_2tm8tm8lvha7gr1.R.inc(38433);alsot1.join();
        }
    }finally{__CLR4_5_2tm8tm8lvha7gr1.R.flushNeeded();}}

    @Test
    public void testThreads() throws InterruptedException {__CLR4_5_2tm8tm8lvha7gr1.R.globalSliceStart(getClass().getName(),38434);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2fmytcutnm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2tm8tm8lvha7gr1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2tm8tm8lvha7gr1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ThreadUtilsTest.testThreads",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),38434,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2fmytcutnm() throws InterruptedException{try{__CLR4_5_2tm8tm8lvha7gr1.R.inc(38434);
        __CLR4_5_2tm8tm8lvha7gr1.R.inc(38435);final Thread t1 = new TestThread("thread1_XXOOLL__");
        __CLR4_5_2tm8tm8lvha7gr1.R.inc(38436);final Thread t2 = new TestThread("thread2_XXOOLL__");

        __CLR4_5_2tm8tm8lvha7gr1.R.inc(38437);try {
            __CLR4_5_2tm8tm8lvha7gr1.R.inc(38438);t1.start();
            __CLR4_5_2tm8tm8lvha7gr1.R.inc(38439);t2.start();
            __CLR4_5_2tm8tm8lvha7gr1.R.inc(38440);assertEquals(1, ThreadUtils.findThreadsByName("thread2_XXOOLL__").size());
        } finally {
            __CLR4_5_2tm8tm8lvha7gr1.R.inc(38441);t1.interrupt();
            __CLR4_5_2tm8tm8lvha7gr1.R.inc(38442);t2.interrupt();
            __CLR4_5_2tm8tm8lvha7gr1.R.inc(38443);t1.join();
            __CLR4_5_2tm8tm8lvha7gr1.R.inc(38444);t2.join();
        }
    }finally{__CLR4_5_2tm8tm8lvha7gr1.R.flushNeeded();}}

    @Test
    public void testThreadsById() throws InterruptedException {__CLR4_5_2tm8tm8lvha7gr1.R.globalSliceStart(getClass().getName(),38445);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2q9ypwwtnx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2tm8tm8lvha7gr1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2tm8tm8lvha7gr1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ThreadUtilsTest.testThreadsById",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),38445,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2q9ypwwtnx() throws InterruptedException{try{__CLR4_5_2tm8tm8lvha7gr1.R.inc(38445);
        __CLR4_5_2tm8tm8lvha7gr1.R.inc(38446);final Thread t1 = new TestThread("thread1_XXOOLL__");
        __CLR4_5_2tm8tm8lvha7gr1.R.inc(38447);final Thread t2 = new TestThread("thread2_XXOOLL__");

        __CLR4_5_2tm8tm8lvha7gr1.R.inc(38448);try {
            __CLR4_5_2tm8tm8lvha7gr1.R.inc(38449);t1.start();
            __CLR4_5_2tm8tm8lvha7gr1.R.inc(38450);t2.start();
            __CLR4_5_2tm8tm8lvha7gr1.R.inc(38451);assertSame(t1, ThreadUtils.findThreadById(t1.getId()));
            __CLR4_5_2tm8tm8lvha7gr1.R.inc(38452);assertSame(t2, ThreadUtils.findThreadById(t2.getId()));
        } finally {
            __CLR4_5_2tm8tm8lvha7gr1.R.inc(38453);t1.interrupt();
            __CLR4_5_2tm8tm8lvha7gr1.R.inc(38454);t2.interrupt();
            __CLR4_5_2tm8tm8lvha7gr1.R.inc(38455);t1.join();
            __CLR4_5_2tm8tm8lvha7gr1.R.inc(38456);t2.join();
        }
    }finally{__CLR4_5_2tm8tm8lvha7gr1.R.flushNeeded();}}

    @Test
    public void testThreadsByIdWrongGroup() throws InterruptedException {__CLR4_5_2tm8tm8lvha7gr1.R.globalSliceStart(getClass().getName(),38457);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2t3yif6to9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2tm8tm8lvha7gr1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2tm8tm8lvha7gr1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ThreadUtilsTest.testThreadsByIdWrongGroup",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),38457,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2t3yif6to9() throws InterruptedException{try{__CLR4_5_2tm8tm8lvha7gr1.R.inc(38457);
        __CLR4_5_2tm8tm8lvha7gr1.R.inc(38458);final Thread t1 = new TestThread("thread1_XXOOLL__");
        __CLR4_5_2tm8tm8lvha7gr1.R.inc(38459);final ThreadGroup tg = new ThreadGroup("tg__HHEE22");

        __CLR4_5_2tm8tm8lvha7gr1.R.inc(38460);try {
            __CLR4_5_2tm8tm8lvha7gr1.R.inc(38461);t1.start();
            __CLR4_5_2tm8tm8lvha7gr1.R.inc(38462);assertNull(ThreadUtils.findThreadById(t1.getId(), tg));
        } finally {
            __CLR4_5_2tm8tm8lvha7gr1.R.inc(38463);t1.interrupt();
            __CLR4_5_2tm8tm8lvha7gr1.R.inc(38464);t1.join();
            __CLR4_5_2tm8tm8lvha7gr1.R.inc(38465);tg.destroy();
        }
    }finally{__CLR4_5_2tm8tm8lvha7gr1.R.flushNeeded();}}


    @Test
    public void testThreadGroups() throws InterruptedException {__CLR4_5_2tm8tm8lvha7gr1.R.globalSliceStart(getClass().getName(),38466);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2fgzvjrtoi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2tm8tm8lvha7gr1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2tm8tm8lvha7gr1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ThreadUtilsTest.testThreadGroups",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),38466,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2fgzvjrtoi() throws InterruptedException{try{__CLR4_5_2tm8tm8lvha7gr1.R.inc(38466);
        __CLR4_5_2tm8tm8lvha7gr1.R.inc(38467);final ThreadGroup threadGroup = new ThreadGroup("thread_group_DDZZ99__");
        __CLR4_5_2tm8tm8lvha7gr1.R.inc(38468);final Thread t1 = new TestThread(threadGroup, "thread1_XXOOPP__");
        __CLR4_5_2tm8tm8lvha7gr1.R.inc(38469);final Thread t2 = new TestThread(threadGroup, "thread2_XXOOPP__");

        __CLR4_5_2tm8tm8lvha7gr1.R.inc(38470);try {
            __CLR4_5_2tm8tm8lvha7gr1.R.inc(38471);t1.start();
            __CLR4_5_2tm8tm8lvha7gr1.R.inc(38472);t2.start();
            __CLR4_5_2tm8tm8lvha7gr1.R.inc(38473);assertEquals(1, ThreadUtils.findThreadsByName("thread1_XXOOPP__").size());
            __CLR4_5_2tm8tm8lvha7gr1.R.inc(38474);assertEquals(1, ThreadUtils.findThreadsByName("thread1_XXOOPP__","thread_group_DDZZ99__").size());
            __CLR4_5_2tm8tm8lvha7gr1.R.inc(38475);assertEquals(1, ThreadUtils.findThreadsByName("thread2_XXOOPP__","thread_group_DDZZ99__").size());
            __CLR4_5_2tm8tm8lvha7gr1.R.inc(38476);assertEquals(0, ThreadUtils.findThreadsByName("thread1_XXOOPP__","non_existent_thread_group_JJHHZZ__").size());
            __CLR4_5_2tm8tm8lvha7gr1.R.inc(38477);assertEquals(0, ThreadUtils.findThreadsByName("non_existent_thread_BBDDWW__","thread_group_DDZZ99__").size());
            __CLR4_5_2tm8tm8lvha7gr1.R.inc(38478);assertEquals(1, ThreadUtils.findThreadGroupsByName("thread_group_DDZZ99__").size());
            __CLR4_5_2tm8tm8lvha7gr1.R.inc(38479);assertEquals(0, ThreadUtils.findThreadGroupsByName("non_existent_thread_group_JJHHZZ__").size());
            __CLR4_5_2tm8tm8lvha7gr1.R.inc(38480);assertNotNull(ThreadUtils.findThreadById(t1.getId(),threadGroup));
        } finally {
            __CLR4_5_2tm8tm8lvha7gr1.R.inc(38481);t1.interrupt();
            __CLR4_5_2tm8tm8lvha7gr1.R.inc(38482);t2.interrupt();
            __CLR4_5_2tm8tm8lvha7gr1.R.inc(38483);t1.join();
            __CLR4_5_2tm8tm8lvha7gr1.R.inc(38484);t2.join();
            __CLR4_5_2tm8tm8lvha7gr1.R.inc(38485);threadGroup.destroy();
        }
    }finally{__CLR4_5_2tm8tm8lvha7gr1.R.flushNeeded();}}

    @Test
    public void testThreadGroupsRef() throws InterruptedException {__CLR4_5_2tm8tm8lvha7gr1.R.globalSliceStart(getClass().getName(),38486);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27h86cqtp2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2tm8tm8lvha7gr1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2tm8tm8lvha7gr1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ThreadUtilsTest.testThreadGroupsRef",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),38486,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27h86cqtp2() throws InterruptedException{try{__CLR4_5_2tm8tm8lvha7gr1.R.inc(38486);
        __CLR4_5_2tm8tm8lvha7gr1.R.inc(38487);final ThreadGroup threadGroup = new ThreadGroup("thread_group_DDZZ99__");
        __CLR4_5_2tm8tm8lvha7gr1.R.inc(38488);final ThreadGroup deadThreadGroup = new ThreadGroup("dead_thread_group_MMQQSS__");
        __CLR4_5_2tm8tm8lvha7gr1.R.inc(38489);deadThreadGroup.destroy();
        __CLR4_5_2tm8tm8lvha7gr1.R.inc(38490);final Thread t1 = new TestThread(threadGroup, "thread1_XXOOPP__");
        __CLR4_5_2tm8tm8lvha7gr1.R.inc(38491);final Thread t2 = new TestThread(threadGroup, "thread2_XXOOPP__");

        __CLR4_5_2tm8tm8lvha7gr1.R.inc(38492);try {
            __CLR4_5_2tm8tm8lvha7gr1.R.inc(38493);t1.start();
            __CLR4_5_2tm8tm8lvha7gr1.R.inc(38494);t2.start();
            __CLR4_5_2tm8tm8lvha7gr1.R.inc(38495);assertEquals(1, ThreadUtils.findThreadsByName("thread1_XXOOPP__").size());
            __CLR4_5_2tm8tm8lvha7gr1.R.inc(38496);assertEquals(1, ThreadUtils.findThreadsByName("thread1_XXOOPP__",threadGroup).size());
            __CLR4_5_2tm8tm8lvha7gr1.R.inc(38497);assertEquals(1, ThreadUtils.findThreadsByName("thread2_XXOOPP__",threadGroup).size());
            __CLR4_5_2tm8tm8lvha7gr1.R.inc(38498);assertEquals(0, ThreadUtils.findThreadsByName("thread1_XXOOPP__",deadThreadGroup).size());
        } finally {
            __CLR4_5_2tm8tm8lvha7gr1.R.inc(38499);t1.interrupt();
            __CLR4_5_2tm8tm8lvha7gr1.R.inc(38500);t2.interrupt();
            __CLR4_5_2tm8tm8lvha7gr1.R.inc(38501);t1.join();
            __CLR4_5_2tm8tm8lvha7gr1.R.inc(38502);t2.join();
            __CLR4_5_2tm8tm8lvha7gr1.R.inc(38503);threadGroup.destroy();
            __CLR4_5_2tm8tm8lvha7gr1.R.inc(38504);assertEquals(0, ThreadUtils.findThreadsByName("thread2_XXOOPP__",threadGroup).size());
        }
    }finally{__CLR4_5_2tm8tm8lvha7gr1.R.flushNeeded();}}

    @Test
    public void testThreadGroupsById() throws InterruptedException {__CLR4_5_2tm8tm8lvha7gr1.R.globalSliceStart(getClass().getName(),38505);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n7g4kptpl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2tm8tm8lvha7gr1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2tm8tm8lvha7gr1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ThreadUtilsTest.testThreadGroupsById",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),38505,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n7g4kptpl() throws InterruptedException{try{__CLR4_5_2tm8tm8lvha7gr1.R.inc(38505);
        __CLR4_5_2tm8tm8lvha7gr1.R.inc(38506);final ThreadGroup threadGroup = new ThreadGroup("thread_group_DDZZ99__");
        __CLR4_5_2tm8tm8lvha7gr1.R.inc(38507);final Thread t1 = new TestThread(threadGroup, "thread1_XXOOPP__");
        __CLR4_5_2tm8tm8lvha7gr1.R.inc(38508);final Thread t2 = new TestThread(threadGroup, "thread2_XXOOPP__");
        __CLR4_5_2tm8tm8lvha7gr1.R.inc(38509);final long nonExistingId = t1.getId()+t2.getId();

        __CLR4_5_2tm8tm8lvha7gr1.R.inc(38510);try {
            __CLR4_5_2tm8tm8lvha7gr1.R.inc(38511);t1.start();
            __CLR4_5_2tm8tm8lvha7gr1.R.inc(38512);t2.start();
            __CLR4_5_2tm8tm8lvha7gr1.R.inc(38513);assertSame(t1, ThreadUtils.findThreadById(t1.getId(),"thread_group_DDZZ99__"));
            __CLR4_5_2tm8tm8lvha7gr1.R.inc(38514);assertSame(t2, ThreadUtils.findThreadById(t2.getId(),"thread_group_DDZZ99__"));
            __CLR4_5_2tm8tm8lvha7gr1.R.inc(38515);assertNull(ThreadUtils.findThreadById(nonExistingId,"non_existent_thread_group_JJHHZZ__"));
            __CLR4_5_2tm8tm8lvha7gr1.R.inc(38516);assertNull(ThreadUtils.findThreadById(nonExistingId,"thread_group_DDZZ99__"));
        } finally {
            __CLR4_5_2tm8tm8lvha7gr1.R.inc(38517);t1.interrupt();
            __CLR4_5_2tm8tm8lvha7gr1.R.inc(38518);t2.interrupt();
            __CLR4_5_2tm8tm8lvha7gr1.R.inc(38519);t1.join();
            __CLR4_5_2tm8tm8lvha7gr1.R.inc(38520);t2.join();
            __CLR4_5_2tm8tm8lvha7gr1.R.inc(38521);threadGroup.destroy();
        }
    }finally{__CLR4_5_2tm8tm8lvha7gr1.R.flushNeeded();}}

    @Test
    public void testConstructor() throws InterruptedException {__CLR4_5_2tm8tm8lvha7gr1.R.globalSliceStart(getClass().getName(),38522);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2uefs8htq2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2tm8tm8lvha7gr1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2tm8tm8lvha7gr1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ThreadUtilsTest.testConstructor",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),38522,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2uefs8htq2() throws InterruptedException{try{__CLR4_5_2tm8tm8lvha7gr1.R.inc(38522);
        __CLR4_5_2tm8tm8lvha7gr1.R.inc(38523);assertNotNull(new ThreadUtils());
        __CLR4_5_2tm8tm8lvha7gr1.R.inc(38524);final Constructor<?>[] cons = ThreadUtils.class.getDeclaredConstructors();
        __CLR4_5_2tm8tm8lvha7gr1.R.inc(38525);assertEquals(1, cons.length);
        __CLR4_5_2tm8tm8lvha7gr1.R.inc(38526);assertTrue(Modifier.isPublic(cons[0].getModifiers()));
        __CLR4_5_2tm8tm8lvha7gr1.R.inc(38527);assertTrue(Modifier.isPublic(ThreadUtils.class.getModifiers()));
        __CLR4_5_2tm8tm8lvha7gr1.R.inc(38528);assertFalse(Modifier.isFinal(ThreadUtils.class.getModifiers()));
    }finally{__CLR4_5_2tm8tm8lvha7gr1.R.flushNeeded();}}

    @Test
    public void testComplexThreadGroups() throws Exception {__CLR4_5_2tm8tm8lvha7gr1.R.globalSliceStart(getClass().getName(),38529);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2larbodtq9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2tm8tm8lvha7gr1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2tm8tm8lvha7gr1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ThreadUtilsTest.testComplexThreadGroups",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),38529,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2larbodtq9() throws Exception{try{__CLR4_5_2tm8tm8lvha7gr1.R.inc(38529);
        __CLR4_5_2tm8tm8lvha7gr1.R.inc(38530);final ThreadGroup threadGroup1 = new ThreadGroup("thread_group_1__");
        __CLR4_5_2tm8tm8lvha7gr1.R.inc(38531);final ThreadGroup threadGroup2 = new ThreadGroup("thread_group_2__");
        __CLR4_5_2tm8tm8lvha7gr1.R.inc(38532);final ThreadGroup threadGroup3 = new ThreadGroup(threadGroup2, "thread_group_3__");
        __CLR4_5_2tm8tm8lvha7gr1.R.inc(38533);final ThreadGroup threadGroup4 = new ThreadGroup(threadGroup2, "thread_group_4__");
        __CLR4_5_2tm8tm8lvha7gr1.R.inc(38534);final ThreadGroup threadGroup5 = new ThreadGroup(threadGroup1, "thread_group_5__");
        __CLR4_5_2tm8tm8lvha7gr1.R.inc(38535);final ThreadGroup threadGroup6 = new ThreadGroup(threadGroup4, "thread_group_6__");
        __CLR4_5_2tm8tm8lvha7gr1.R.inc(38536);final ThreadGroup threadGroup7 = new ThreadGroup(threadGroup4, "thread_group_7__");
        __CLR4_5_2tm8tm8lvha7gr1.R.inc(38537);final ThreadGroup threadGroup7Doubled = new ThreadGroup(threadGroup4, "thread_group_7__");
        __CLR4_5_2tm8tm8lvha7gr1.R.inc(38538);final List<ThreadGroup> threadGroups = Arrays.asList(threadGroup1,threadGroup2,threadGroup3,threadGroup4,threadGroup5,threadGroup6, threadGroup7, threadGroup7Doubled);

        __CLR4_5_2tm8tm8lvha7gr1.R.inc(38539);final Thread t1 = new TestThread("thread1_X__");
        __CLR4_5_2tm8tm8lvha7gr1.R.inc(38540);final Thread t2 = new TestThread(threadGroup1, "thread2_X__");
        __CLR4_5_2tm8tm8lvha7gr1.R.inc(38541);final Thread t3 = new TestThread(threadGroup2, "thread3_X__");
        __CLR4_5_2tm8tm8lvha7gr1.R.inc(38542);final Thread t4 = new TestThread(threadGroup3, "thread4_X__");
        __CLR4_5_2tm8tm8lvha7gr1.R.inc(38543);final Thread t5 = new TestThread(threadGroup4, "thread5_X__");
        __CLR4_5_2tm8tm8lvha7gr1.R.inc(38544);final Thread t6 = new TestThread(threadGroup5, "thread6_X__");
        __CLR4_5_2tm8tm8lvha7gr1.R.inc(38545);final Thread t7 = new TestThread(threadGroup6, "thread7_X__");
        __CLR4_5_2tm8tm8lvha7gr1.R.inc(38546);final Thread t8 = new TestThread(threadGroup4, "thread8_X__");
        __CLR4_5_2tm8tm8lvha7gr1.R.inc(38547);final Thread t9 = new TestThread(threadGroup6, "thread9_X__");
        __CLR4_5_2tm8tm8lvha7gr1.R.inc(38548);final Thread t10 = new TestThread(threadGroup3, "thread10_X__");
        __CLR4_5_2tm8tm8lvha7gr1.R.inc(38549);final Thread t11 = new TestThread(threadGroup7, "thread11_X__");
        __CLR4_5_2tm8tm8lvha7gr1.R.inc(38550);final Thread t11Doubled = new TestThread(threadGroup7Doubled, "thread11_X__");
        __CLR4_5_2tm8tm8lvha7gr1.R.inc(38551);final List<Thread> threads = Arrays.asList(t1,t2,t3,t4,t5,t6,t7,t8,t9,t10, t11, t11Doubled);

        __CLR4_5_2tm8tm8lvha7gr1.R.inc(38552);try {
            __CLR4_5_2tm8tm8lvha7gr1.R.inc(38553);for (final Thread thread : threads) {{
                __CLR4_5_2tm8tm8lvha7gr1.R.inc(38554);thread.start();
            }
            }__CLR4_5_2tm8tm8lvha7gr1.R.inc(38555);assertTrue(ThreadUtils.getAllThreadGroups().size() >= 7);
            __CLR4_5_2tm8tm8lvha7gr1.R.inc(38556);assertTrue(ThreadUtils.getAllThreads().size() >= 11);
            __CLR4_5_2tm8tm8lvha7gr1.R.inc(38557);assertTrue(ThreadUtils.findThreads(ThreadUtils.ALWAYS_TRUE_PREDICATE).size() >= 11);
            __CLR4_5_2tm8tm8lvha7gr1.R.inc(38558);assertEquals(1, ThreadUtils.findThreadsByName(t4.getName(), threadGroup3.getName()).size());
            __CLR4_5_2tm8tm8lvha7gr1.R.inc(38559);assertEquals(0, ThreadUtils.findThreadsByName(t4.getName(), threadGroup2.getName()).size());
            __CLR4_5_2tm8tm8lvha7gr1.R.inc(38560);assertEquals(2, ThreadUtils.findThreadsByName(t11.getName(), threadGroup7.getName()).size());
        }finally {
            __CLR4_5_2tm8tm8lvha7gr1.R.inc(38561);for (final Thread thread : threads) {{
                __CLR4_5_2tm8tm8lvha7gr1.R.inc(38562);thread.interrupt();
                __CLR4_5_2tm8tm8lvha7gr1.R.inc(38563);thread.join();
            }
            }__CLR4_5_2tm8tm8lvha7gr1.R.inc(38564);for (final ThreadGroup threadGroup : threadGroups) {{
                __CLR4_5_2tm8tm8lvha7gr1.R.inc(38565);if ((((!threadGroup.isDestroyed())&&(__CLR4_5_2tm8tm8lvha7gr1.R.iget(38566)!=0|true))||(__CLR4_5_2tm8tm8lvha7gr1.R.iget(38567)==0&false))) {{
                    __CLR4_5_2tm8tm8lvha7gr1.R.inc(38568);threadGroup.destroy();
                }
            }}
        }}
    }finally{__CLR4_5_2tm8tm8lvha7gr1.R.flushNeeded();}}


    private static class TestThread extends Thread {
        private final CountDownLatch latch = new CountDownLatch(1);

        public TestThread(final String name) {
            super(name);__CLR4_5_2tm8tm8lvha7gr1.R.inc(38570);try{__CLR4_5_2tm8tm8lvha7gr1.R.inc(38569);
        }finally{__CLR4_5_2tm8tm8lvha7gr1.R.flushNeeded();}}

        public TestThread(final ThreadGroup group, final String name) {
            super(group, name);__CLR4_5_2tm8tm8lvha7gr1.R.inc(38572);try{__CLR4_5_2tm8tm8lvha7gr1.R.inc(38571);
        }finally{__CLR4_5_2tm8tm8lvha7gr1.R.flushNeeded();}}

        @Override
        public synchronized void start() {try{__CLR4_5_2tm8tm8lvha7gr1.R.inc(38573);
            __CLR4_5_2tm8tm8lvha7gr1.R.inc(38574);super.start();
            __CLR4_5_2tm8tm8lvha7gr1.R.inc(38575);try {
                __CLR4_5_2tm8tm8lvha7gr1.R.inc(38576);latch.await();
            } catch (final InterruptedException e) {
                __CLR4_5_2tm8tm8lvha7gr1.R.inc(38577);Thread.currentThread().interrupt();
            }
        }finally{__CLR4_5_2tm8tm8lvha7gr1.R.flushNeeded();}}

        @Override
        public void run() {try{__CLR4_5_2tm8tm8lvha7gr1.R.inc(38578);
            __CLR4_5_2tm8tm8lvha7gr1.R.inc(38579);latch.countDown();
            __CLR4_5_2tm8tm8lvha7gr1.R.inc(38580);try {
                __CLR4_5_2tm8tm8lvha7gr1.R.inc(38581);synchronized(this){
                    __CLR4_5_2tm8tm8lvha7gr1.R.inc(38582);this.wait();
                }
            } catch (final InterruptedException e) {
                __CLR4_5_2tm8tm8lvha7gr1.R.inc(38583);Thread.currentThread().interrupt();
            }
        }finally{__CLR4_5_2tm8tm8lvha7gr1.R.flushNeeded();}}
    }
}
