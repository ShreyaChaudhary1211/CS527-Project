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
package org.apache.commons.lang3.concurrent;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

import org.easymock.EasyMock;
import org.junit.Test;

/**
 * Test class for {@link ConcurrentUtils}.
 */
public class ConcurrentUtilsTest {static class __CLR4_5_2yjhyjhlvha7ho0{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172763741L,8589935092L,44972,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /**
     * Tests creating a ConcurrentException with a runtime exception as cause.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testConcurrentExceptionCauseUnchecked() {__CLR4_5_2yjhyjhlvha7ho0.R.globalSliceStart(getClass().getName(),44765);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2j73lgyyjh();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,67,111,110,99,117,114,114,101,110,116,69,120,99,101,112,116,105,111,110,67,97,117,115,101,85,110,99,104,101,99,107,101,100,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2yjhyjhlvha7ho0.R.rethrow($CLV_t2$);}finally{__CLR4_5_2yjhyjhlvha7ho0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testConcurrentExceptionCauseUnchecked",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44765,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2j73lgyyjh(){try{__CLR4_5_2yjhyjhlvha7ho0.R.inc(44765);
        __CLR4_5_2yjhyjhlvha7ho0.R.inc(44766);new ConcurrentException(new RuntimeException());
    }finally{__CLR4_5_2yjhyjhlvha7ho0.R.flushNeeded();}}

    /**
     * Tests creating a ConcurrentException with an error as cause.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testConcurrentExceptionCauseError() {__CLR4_5_2yjhyjhlvha7ho0.R.globalSliceStart(getClass().getName(),44767);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23kr3kcyjj();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,67,111,110,99,117,114,114,101,110,116,69,120,99,101,112,116,105,111,110,67,97,117,115,101,69,114,114,111,114,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2yjhyjhlvha7ho0.R.rethrow($CLV_t2$);}finally{__CLR4_5_2yjhyjhlvha7ho0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testConcurrentExceptionCauseError",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44767,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23kr3kcyjj(){try{__CLR4_5_2yjhyjhlvha7ho0.R.inc(44767);
        __CLR4_5_2yjhyjhlvha7ho0.R.inc(44768);new ConcurrentException("An error", new Error());
    }finally{__CLR4_5_2yjhyjhlvha7ho0.R.flushNeeded();}}

    /**
     * Tests creating a ConcurrentException with null as cause.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testConcurrentExceptionCauseNull() {__CLR4_5_2yjhyjhlvha7ho0.R.globalSliceStart(getClass().getName(),44769);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2c4fg33yjl();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,67,111,110,99,117,114,114,101,110,116,69,120,99,101,112,116,105,111,110,67,97,117,115,101,78,117,108,108,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2yjhyjhlvha7ho0.R.rethrow($CLV_t2$);}finally{__CLR4_5_2yjhyjhlvha7ho0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testConcurrentExceptionCauseNull",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44769,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2c4fg33yjl(){try{__CLR4_5_2yjhyjhlvha7ho0.R.inc(44769);
        __CLR4_5_2yjhyjhlvha7ho0.R.inc(44770);new ConcurrentException(null);
    }finally{__CLR4_5_2yjhyjhlvha7ho0.R.flushNeeded();}}

    /**
     * Tries to create a ConcurrentRuntimeException with a runtime as cause.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testConcurrentRuntimeExceptionCauseUnchecked() {__CLR4_5_2yjhyjhlvha7ho0.R.globalSliceStart(getClass().getName(),44771);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2t2px9oyjn();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,67,111,110,99,117,114,114,101,110,116,82,117,110,116,105,109,101,69,120,99,101,112,116,105,111,110,67,97,117,115,101,85,110,99,104,101,99,107,101,100,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2yjhyjhlvha7ho0.R.rethrow($CLV_t2$);}finally{__CLR4_5_2yjhyjhlvha7ho0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testConcurrentRuntimeExceptionCauseUnchecked",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44771,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2t2px9oyjn(){try{__CLR4_5_2yjhyjhlvha7ho0.R.inc(44771);
        __CLR4_5_2yjhyjhlvha7ho0.R.inc(44772);new ConcurrentRuntimeException(new RuntimeException());
    }finally{__CLR4_5_2yjhyjhlvha7ho0.R.flushNeeded();}}

    /**
     * Tries to create a ConcurrentRuntimeException with an error as cause.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testConcurrentRuntimeExceptionCauseError() {__CLR4_5_2yjhyjhlvha7ho0.R.globalSliceStart(getClass().getName(),44773);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21dwqo6yjp();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,67,111,110,99,117,114,114,101,110,116,82,117,110,116,105,109,101,69,120,99,101,112,116,105,111,110,67,97,117,115,101,69,114,114,111,114,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2yjhyjhlvha7ho0.R.rethrow($CLV_t2$);}finally{__CLR4_5_2yjhyjhlvha7ho0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testConcurrentRuntimeExceptionCauseError",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44773,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21dwqo6yjp(){try{__CLR4_5_2yjhyjhlvha7ho0.R.inc(44773);
        __CLR4_5_2yjhyjhlvha7ho0.R.inc(44774);new ConcurrentRuntimeException("An error", new Error());
    }finally{__CLR4_5_2yjhyjhlvha7ho0.R.flushNeeded();}}

    /**
     * Tries to create a ConcurrentRuntimeException with null as cause.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testConcurrentRuntimeExceptionCauseNull() {__CLR4_5_2yjhyjhlvha7ho0.R.globalSliceStart(getClass().getName(),44775);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2xmrzvbyjr();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,67,111,110,99,117,114,114,101,110,116,82,117,110,116,105,109,101,69,120,99,101,112,116,105,111,110,67,97,117,115,101,78,117,108,108,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2yjhyjhlvha7ho0.R.rethrow($CLV_t2$);}finally{__CLR4_5_2yjhyjhlvha7ho0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testConcurrentRuntimeExceptionCauseNull",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44775,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2xmrzvbyjr(){try{__CLR4_5_2yjhyjhlvha7ho0.R.inc(44775);
        __CLR4_5_2yjhyjhlvha7ho0.R.inc(44776);new ConcurrentRuntimeException(null);
    }finally{__CLR4_5_2yjhyjhlvha7ho0.R.flushNeeded();}}

    /**
     * Tests extractCause() for a null exception.
     */
    @Test
    public void testExtractCauseNull() {__CLR4_5_2yjhyjhlvha7ho0.R.globalSliceStart(getClass().getName(),44777);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2tal59kyjt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2yjhyjhlvha7ho0.R.rethrow($CLV_t2$);}finally{__CLR4_5_2yjhyjhlvha7ho0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testExtractCauseNull",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44777,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2tal59kyjt(){try{__CLR4_5_2yjhyjhlvha7ho0.R.inc(44777);
        __CLR4_5_2yjhyjhlvha7ho0.R.inc(44778);assertNull("Non null result", ConcurrentUtils.extractCause(null));
    }finally{__CLR4_5_2yjhyjhlvha7ho0.R.flushNeeded();}}

    /**
     * Tests extractCause() if the cause of the passed in exception is null.
     */
    @Test
    public void testExtractCauseNullCause() {__CLR4_5_2yjhyjhlvha7ho0.R.globalSliceStart(getClass().getName(),44779);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vw4pzlyjv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2yjhyjhlvha7ho0.R.rethrow($CLV_t2$);}finally{__CLR4_5_2yjhyjhlvha7ho0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testExtractCauseNullCause",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44779,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vw4pzlyjv(){try{__CLR4_5_2yjhyjhlvha7ho0.R.inc(44779);
        __CLR4_5_2yjhyjhlvha7ho0.R.inc(44780);assertNull("Non null result", ConcurrentUtils
                .extractCause(new ExecutionException("Test", null)));
    }finally{__CLR4_5_2yjhyjhlvha7ho0.R.flushNeeded();}}

    /**
     * Tests extractCause() if the cause is an error.
     */
    @Test
    public void testExtractCauseError() {__CLR4_5_2yjhyjhlvha7ho0.R.globalSliceStart(getClass().getName(),44781);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28y8hw5yjx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2yjhyjhlvha7ho0.R.rethrow($CLV_t2$);}finally{__CLR4_5_2yjhyjhlvha7ho0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testExtractCauseError",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44781,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28y8hw5yjx(){try{__CLR4_5_2yjhyjhlvha7ho0.R.inc(44781);
        __CLR4_5_2yjhyjhlvha7ho0.R.inc(44782);final Error err = new AssertionError("Test");
        __CLR4_5_2yjhyjhlvha7ho0.R.inc(44783);try {
            __CLR4_5_2yjhyjhlvha7ho0.R.inc(44784);ConcurrentUtils.extractCause(new ExecutionException(err));
            __CLR4_5_2yjhyjhlvha7ho0.R.inc(44785);fail("Error not thrown!");
        } catch (final Error e) {
            __CLR4_5_2yjhyjhlvha7ho0.R.inc(44786);assertEquals("Wrong error", err, e);
        }
    }finally{__CLR4_5_2yjhyjhlvha7ho0.R.flushNeeded();}}

    /**
     * Tests extractCause() if the cause is an unchecked exception.
     */
    @Test
    public void testExtractCauseUncheckedException() {__CLR4_5_2yjhyjhlvha7ho0.R.globalSliceStart(getClass().getName(),44787);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2w8etzyyk3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2yjhyjhlvha7ho0.R.rethrow($CLV_t2$);}finally{__CLR4_5_2yjhyjhlvha7ho0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testExtractCauseUncheckedException",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44787,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2w8etzyyk3(){try{__CLR4_5_2yjhyjhlvha7ho0.R.inc(44787);
        __CLR4_5_2yjhyjhlvha7ho0.R.inc(44788);final RuntimeException rex = new RuntimeException("Test");
        __CLR4_5_2yjhyjhlvha7ho0.R.inc(44789);try {
            __CLR4_5_2yjhyjhlvha7ho0.R.inc(44790);ConcurrentUtils.extractCause(new ExecutionException(rex));
            __CLR4_5_2yjhyjhlvha7ho0.R.inc(44791);fail("Runtime exception not thrown!");
        } catch (final RuntimeException r) {
            __CLR4_5_2yjhyjhlvha7ho0.R.inc(44792);assertEquals("Wrong exception", rex, r);
        }
    }finally{__CLR4_5_2yjhyjhlvha7ho0.R.flushNeeded();}}

    /**
     * Tests extractCause() if the cause is a checked exception.
     */
    @Test
    public void testExtractCauseChecked() {__CLR4_5_2yjhyjhlvha7ho0.R.globalSliceStart(getClass().getName(),44793);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_29ov0esyk9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2yjhyjhlvha7ho0.R.rethrow($CLV_t2$);}finally{__CLR4_5_2yjhyjhlvha7ho0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testExtractCauseChecked",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44793,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_29ov0esyk9(){try{__CLR4_5_2yjhyjhlvha7ho0.R.inc(44793);
        __CLR4_5_2yjhyjhlvha7ho0.R.inc(44794);final Exception ex = new Exception("Test");
        __CLR4_5_2yjhyjhlvha7ho0.R.inc(44795);final ConcurrentException cex = ConcurrentUtils
                .extractCause(new ExecutionException(ex));
        __CLR4_5_2yjhyjhlvha7ho0.R.inc(44796);assertSame("Wrong cause", ex, cex.getCause());
    }finally{__CLR4_5_2yjhyjhlvha7ho0.R.flushNeeded();}}

    /**
     * Tests extractCauseUnchecked() for a null exception.
     */
    @Test
    public void testExtractCauseUncheckedNull() {__CLR4_5_2yjhyjhlvha7ho0.R.globalSliceStart(getClass().getName(),44797);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27jgo76ykd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2yjhyjhlvha7ho0.R.rethrow($CLV_t2$);}finally{__CLR4_5_2yjhyjhlvha7ho0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testExtractCauseUncheckedNull",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44797,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27jgo76ykd(){try{__CLR4_5_2yjhyjhlvha7ho0.R.inc(44797);
        __CLR4_5_2yjhyjhlvha7ho0.R.inc(44798);assertNull("Non null result", ConcurrentUtils.extractCauseUnchecked(null));
    }finally{__CLR4_5_2yjhyjhlvha7ho0.R.flushNeeded();}}

    /**
     * Tests extractCauseUnchecked() if the cause of the passed in exception is null.
     */
    @Test
    public void testExtractCauseUncheckedNullCause() {__CLR4_5_2yjhyjhlvha7ho0.R.globalSliceStart(getClass().getName(),44799);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2zi3gutykf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2yjhyjhlvha7ho0.R.rethrow($CLV_t2$);}finally{__CLR4_5_2yjhyjhlvha7ho0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testExtractCauseUncheckedNullCause",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44799,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2zi3gutykf(){try{__CLR4_5_2yjhyjhlvha7ho0.R.inc(44799);
        __CLR4_5_2yjhyjhlvha7ho0.R.inc(44800);assertNull("Non null result", ConcurrentUtils
                .extractCauseUnchecked(new ExecutionException("Test", null)));
    }finally{__CLR4_5_2yjhyjhlvha7ho0.R.flushNeeded();}}

    /**
     * Tests extractCauseUnchecked() if the cause is an error.
     */
    @Test
    public void testExtractCauseUncheckedError() {__CLR4_5_2yjhyjhlvha7ho0.R.globalSliceStart(getClass().getName(),44801);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2q4lpdxykh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2yjhyjhlvha7ho0.R.rethrow($CLV_t2$);}finally{__CLR4_5_2yjhyjhlvha7ho0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testExtractCauseUncheckedError",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44801,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2q4lpdxykh(){try{__CLR4_5_2yjhyjhlvha7ho0.R.inc(44801);
        __CLR4_5_2yjhyjhlvha7ho0.R.inc(44802);final Error err = new AssertionError("Test");
        __CLR4_5_2yjhyjhlvha7ho0.R.inc(44803);try {
            __CLR4_5_2yjhyjhlvha7ho0.R.inc(44804);ConcurrentUtils.extractCauseUnchecked(new ExecutionException(err));
            __CLR4_5_2yjhyjhlvha7ho0.R.inc(44805);fail("Error not thrown!");
        } catch (final Error e) {
            __CLR4_5_2yjhyjhlvha7ho0.R.inc(44806);assertEquals("Wrong error", err, e);
        }
    }finally{__CLR4_5_2yjhyjhlvha7ho0.R.flushNeeded();}}

    /**
     * Tests extractCauseUnchecked() if the cause is an unchecked exception.
     */
    @Test
    public void testExtractCauseUncheckedUncheckedException() {__CLR4_5_2yjhyjhlvha7ho0.R.globalSliceStart(getClass().getName(),44807);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2d0qv98ykn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2yjhyjhlvha7ho0.R.rethrow($CLV_t2$);}finally{__CLR4_5_2yjhyjhlvha7ho0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testExtractCauseUncheckedUncheckedException",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44807,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2d0qv98ykn(){try{__CLR4_5_2yjhyjhlvha7ho0.R.inc(44807);
        __CLR4_5_2yjhyjhlvha7ho0.R.inc(44808);final RuntimeException rex = new RuntimeException("Test");
        __CLR4_5_2yjhyjhlvha7ho0.R.inc(44809);try {
            __CLR4_5_2yjhyjhlvha7ho0.R.inc(44810);ConcurrentUtils.extractCauseUnchecked(new ExecutionException(rex));
            __CLR4_5_2yjhyjhlvha7ho0.R.inc(44811);fail("Runtime exception not thrown!");
        } catch (final RuntimeException r) {
            __CLR4_5_2yjhyjhlvha7ho0.R.inc(44812);assertEquals("Wrong exception", rex, r);
        }
    }finally{__CLR4_5_2yjhyjhlvha7ho0.R.flushNeeded();}}

    /**
     * Tests extractCauseUnchecked() if the cause is a checked exception.
     */
    @Test
    public void testExtractCauseUncheckedChecked() {__CLR4_5_2yjhyjhlvha7ho0.R.globalSliceStart(getClass().getName(),44813);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2wfzapyykt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2yjhyjhlvha7ho0.R.rethrow($CLV_t2$);}finally{__CLR4_5_2yjhyjhlvha7ho0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testExtractCauseUncheckedChecked",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44813,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2wfzapyykt(){try{__CLR4_5_2yjhyjhlvha7ho0.R.inc(44813);
        __CLR4_5_2yjhyjhlvha7ho0.R.inc(44814);final Exception ex = new Exception("Test");
        __CLR4_5_2yjhyjhlvha7ho0.R.inc(44815);final ConcurrentRuntimeException cex = ConcurrentUtils
                .extractCauseUnchecked(new ExecutionException(ex));
        __CLR4_5_2yjhyjhlvha7ho0.R.inc(44816);assertSame("Wrong cause", ex, cex.getCause());
    }finally{__CLR4_5_2yjhyjhlvha7ho0.R.flushNeeded();}}

    /**
     * Tests handleCause() if the cause is an error.
     *
     * @throws org.apache.commons.lang3.concurrent.ConcurrentException so we don't have to catch it
     */
    @Test
    public void testHandleCauseError() throws ConcurrentException {__CLR4_5_2yjhyjhlvha7ho0.R.globalSliceStart(getClass().getName(),44817);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2iwrmf4ykx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2yjhyjhlvha7ho0.R.rethrow($CLV_t2$);}finally{__CLR4_5_2yjhyjhlvha7ho0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testHandleCauseError",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44817,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2iwrmf4ykx() throws ConcurrentException{try{__CLR4_5_2yjhyjhlvha7ho0.R.inc(44817);
        __CLR4_5_2yjhyjhlvha7ho0.R.inc(44818);final Error err = new AssertionError("Test");
        __CLR4_5_2yjhyjhlvha7ho0.R.inc(44819);try {
            __CLR4_5_2yjhyjhlvha7ho0.R.inc(44820);ConcurrentUtils.handleCause(new ExecutionException(err));
            __CLR4_5_2yjhyjhlvha7ho0.R.inc(44821);fail("Error not thrown!");
        } catch (final Error e) {
            __CLR4_5_2yjhyjhlvha7ho0.R.inc(44822);assertEquals("Wrong error", err, e);
        }
    }finally{__CLR4_5_2yjhyjhlvha7ho0.R.flushNeeded();}}

    /**
     * Tests handleCause() if the cause is an unchecked exception.
     *
     * @throws org.apache.commons.lang3.concurrent.ConcurrentException so we don't have to catch it
     */
    @Test
    public void testHandleCauseUncheckedException() throws ConcurrentException {__CLR4_5_2yjhyjhlvha7ho0.R.globalSliceStart(getClass().getName(),44823);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2nteiaxyl3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2yjhyjhlvha7ho0.R.rethrow($CLV_t2$);}finally{__CLR4_5_2yjhyjhlvha7ho0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testHandleCauseUncheckedException",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44823,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2nteiaxyl3() throws ConcurrentException{try{__CLR4_5_2yjhyjhlvha7ho0.R.inc(44823);
        __CLR4_5_2yjhyjhlvha7ho0.R.inc(44824);final RuntimeException rex = new RuntimeException("Test");
        __CLR4_5_2yjhyjhlvha7ho0.R.inc(44825);try {
            __CLR4_5_2yjhyjhlvha7ho0.R.inc(44826);ConcurrentUtils.handleCause(new ExecutionException(rex));
            __CLR4_5_2yjhyjhlvha7ho0.R.inc(44827);fail("Runtime exception not thrown!");
        } catch (final RuntimeException r) {
            __CLR4_5_2yjhyjhlvha7ho0.R.inc(44828);assertEquals("Wrong exception", rex, r);
        }
    }finally{__CLR4_5_2yjhyjhlvha7ho0.R.flushNeeded();}}

    /**
     * Tests handleCause() if the cause is a checked exception.
     */
    @Test
    public void testHandleCauseChecked() {__CLR4_5_2yjhyjhlvha7ho0.R.globalSliceStart(getClass().getName(),44829);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28osjsxyl9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2yjhyjhlvha7ho0.R.rethrow($CLV_t2$);}finally{__CLR4_5_2yjhyjhlvha7ho0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testHandleCauseChecked",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44829,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28osjsxyl9(){try{__CLR4_5_2yjhyjhlvha7ho0.R.inc(44829);
        __CLR4_5_2yjhyjhlvha7ho0.R.inc(44830);final Exception ex = new Exception("Test");
        __CLR4_5_2yjhyjhlvha7ho0.R.inc(44831);try {
            __CLR4_5_2yjhyjhlvha7ho0.R.inc(44832);ConcurrentUtils.handleCause(new ExecutionException(ex));
            __CLR4_5_2yjhyjhlvha7ho0.R.inc(44833);fail("ConcurrentException not thrown!");
        } catch (final ConcurrentException cex) {
            __CLR4_5_2yjhyjhlvha7ho0.R.inc(44834);assertEquals("Wrong cause", ex, cex.getCause());
        }
    }finally{__CLR4_5_2yjhyjhlvha7ho0.R.flushNeeded();}}

    /**
     * Tests handleCause() for a null parameter or a null cause. In this case
     * the method should do nothing. We can only test that no exception is
     * thrown.
     *
     * @throws org.apache.commons.lang3.concurrent.ConcurrentException so we don't have to catch it
     */
    @Test
    public void testHandleCauseNull() throws ConcurrentException {__CLR4_5_2yjhyjhlvha7ho0.R.globalSliceStart(getClass().getName(),44835);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2yjhwdfylf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2yjhyjhlvha7ho0.R.rethrow($CLV_t2$);}finally{__CLR4_5_2yjhyjhlvha7ho0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testHandleCauseNull",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44835,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2yjhwdfylf() throws ConcurrentException{try{__CLR4_5_2yjhyjhlvha7ho0.R.inc(44835);
        __CLR4_5_2yjhyjhlvha7ho0.R.inc(44836);ConcurrentUtils.handleCause(null);
        __CLR4_5_2yjhyjhlvha7ho0.R.inc(44837);ConcurrentUtils.handleCause(new ExecutionException("Test", null));
    }finally{__CLR4_5_2yjhyjhlvha7ho0.R.flushNeeded();}}

    /**
     * Tests handleCauseUnchecked() if the cause is an error.
     */
    @Test
    public void testHandleCauseUncheckedError() {__CLR4_5_2yjhyjhlvha7ho0.R.globalSliceStart(getClass().getName(),44838);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ioktn4yli();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2yjhyjhlvha7ho0.R.rethrow($CLV_t2$);}finally{__CLR4_5_2yjhyjhlvha7ho0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testHandleCauseUncheckedError",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44838,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ioktn4yli(){try{__CLR4_5_2yjhyjhlvha7ho0.R.inc(44838);
        __CLR4_5_2yjhyjhlvha7ho0.R.inc(44839);final Error err = new AssertionError("Test");
        __CLR4_5_2yjhyjhlvha7ho0.R.inc(44840);try {
            __CLR4_5_2yjhyjhlvha7ho0.R.inc(44841);ConcurrentUtils.handleCauseUnchecked(new ExecutionException(err));
            __CLR4_5_2yjhyjhlvha7ho0.R.inc(44842);fail("Error not thrown!");
        } catch (final Error e) {
            __CLR4_5_2yjhyjhlvha7ho0.R.inc(44843);assertEquals("Wrong error", err, e);
        }
    }finally{__CLR4_5_2yjhyjhlvha7ho0.R.flushNeeded();}}

    /**
     * Tests handleCauseUnchecked() if the cause is an unchecked exception.
     */
    @Test
    public void testHandleCauseUncheckedUncheckedException() {__CLR4_5_2yjhyjhlvha7ho0.R.globalSliceStart(getClass().getName(),44844);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_270v5jtylo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2yjhyjhlvha7ho0.R.rethrow($CLV_t2$);}finally{__CLR4_5_2yjhyjhlvha7ho0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testHandleCauseUncheckedUncheckedException",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44844,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_270v5jtylo(){try{__CLR4_5_2yjhyjhlvha7ho0.R.inc(44844);
        __CLR4_5_2yjhyjhlvha7ho0.R.inc(44845);final RuntimeException rex = new RuntimeException("Test");
        __CLR4_5_2yjhyjhlvha7ho0.R.inc(44846);try {
            __CLR4_5_2yjhyjhlvha7ho0.R.inc(44847);ConcurrentUtils.handleCauseUnchecked(new ExecutionException(rex));
            __CLR4_5_2yjhyjhlvha7ho0.R.inc(44848);fail("Runtime exception not thrown!");
        } catch (final RuntimeException r) {
            __CLR4_5_2yjhyjhlvha7ho0.R.inc(44849);assertEquals("Wrong exception", rex, r);
        }
    }finally{__CLR4_5_2yjhyjhlvha7ho0.R.flushNeeded();}}

    /**
     * Tests handleCauseUnchecked() if the cause is a checked exception.
     */
    @Test
    public void testHandleCauseUncheckedChecked() {__CLR4_5_2yjhyjhlvha7ho0.R.globalSliceStart(getClass().getName(),44850);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2j8amb3ylu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2yjhyjhlvha7ho0.R.rethrow($CLV_t2$);}finally{__CLR4_5_2yjhyjhlvha7ho0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testHandleCauseUncheckedChecked",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44850,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2j8amb3ylu(){try{__CLR4_5_2yjhyjhlvha7ho0.R.inc(44850);
        __CLR4_5_2yjhyjhlvha7ho0.R.inc(44851);final Exception ex = new Exception("Test");
        __CLR4_5_2yjhyjhlvha7ho0.R.inc(44852);try {
            __CLR4_5_2yjhyjhlvha7ho0.R.inc(44853);ConcurrentUtils.handleCauseUnchecked(new ExecutionException(ex));
            __CLR4_5_2yjhyjhlvha7ho0.R.inc(44854);fail("ConcurrentRuntimeException not thrown!");
        } catch (final ConcurrentRuntimeException crex) {
            __CLR4_5_2yjhyjhlvha7ho0.R.inc(44855);assertEquals("Wrong cause", ex, crex.getCause());
        }
    }finally{__CLR4_5_2yjhyjhlvha7ho0.R.flushNeeded();}}

    /**
     * Tests handleCauseUnchecked() for a null parameter or a null cause. In
     * this case the method should do nothing. We can only test that no
     * exception is thrown.
     */
    @Test
    public void testHandleCauseUncheckedNull() {__CLR4_5_2yjhyjhlvha7ho0.R.globalSliceStart(getClass().getName(),44856);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2j8jodpym0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2yjhyjhlvha7ho0.R.rethrow($CLV_t2$);}finally{__CLR4_5_2yjhyjhlvha7ho0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testHandleCauseUncheckedNull",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44856,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2j8jodpym0(){try{__CLR4_5_2yjhyjhlvha7ho0.R.inc(44856);
        __CLR4_5_2yjhyjhlvha7ho0.R.inc(44857);ConcurrentUtils.handleCauseUnchecked(null);
        __CLR4_5_2yjhyjhlvha7ho0.R.inc(44858);ConcurrentUtils.handleCauseUnchecked(new ExecutionException("Test",
                null));
    }finally{__CLR4_5_2yjhyjhlvha7ho0.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Tests initialize() for a null argument.
     *
     * @throws org.apache.commons.lang3.concurrent.ConcurrentException so we don't have to catch it
     */
    @Test
    public void testInitializeNull() throws ConcurrentException {__CLR4_5_2yjhyjhlvha7ho0.R.globalSliceStart(getClass().getName(),44859);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2w3dh1sym3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2yjhyjhlvha7ho0.R.rethrow($CLV_t2$);}finally{__CLR4_5_2yjhyjhlvha7ho0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testInitializeNull",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44859,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2w3dh1sym3() throws ConcurrentException{try{__CLR4_5_2yjhyjhlvha7ho0.R.inc(44859);
        __CLR4_5_2yjhyjhlvha7ho0.R.inc(44860);assertNull("Got a result", ConcurrentUtils.initialize(null));
    }finally{__CLR4_5_2yjhyjhlvha7ho0.R.flushNeeded();}}

    /**
     * Tests a successful initialize() operation.
     *
     * @throws org.apache.commons.lang3.concurrent.ConcurrentException so we don't have to catch it
     */
    @Test
    public void testInitialize() throws ConcurrentException {__CLR4_5_2yjhyjhlvha7ho0.R.globalSliceStart(getClass().getName(),44861);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_25j52d3ym5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2yjhyjhlvha7ho0.R.rethrow($CLV_t2$);}finally{__CLR4_5_2yjhyjhlvha7ho0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testInitialize",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44861,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_25j52d3ym5() throws ConcurrentException{try{__CLR4_5_2yjhyjhlvha7ho0.R.inc(44861);
        __CLR4_5_2yjhyjhlvha7ho0.R.inc(44862);@SuppressWarnings("unchecked")
        final
        ConcurrentInitializer<Object> init = EasyMock
                .createMock(ConcurrentInitializer.class);
        __CLR4_5_2yjhyjhlvha7ho0.R.inc(44863);final Object result = new Object();
        __CLR4_5_2yjhyjhlvha7ho0.R.inc(44864);EasyMock.expect(init.get()).andReturn(result);
        __CLR4_5_2yjhyjhlvha7ho0.R.inc(44865);EasyMock.replay(init);
        __CLR4_5_2yjhyjhlvha7ho0.R.inc(44866);assertSame("Wrong result object", result, ConcurrentUtils
                .initialize(init));
        __CLR4_5_2yjhyjhlvha7ho0.R.inc(44867);EasyMock.verify(init);
    }finally{__CLR4_5_2yjhyjhlvha7ho0.R.flushNeeded();}}

    /**
     * Tests initializeUnchecked() for a null argument.
     */
    @Test
    public void testInitializeUncheckedNull() {__CLR4_5_2yjhyjhlvha7ho0.R.globalSliceStart(getClass().getName(),44868);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2di05yeymc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2yjhyjhlvha7ho0.R.rethrow($CLV_t2$);}finally{__CLR4_5_2yjhyjhlvha7ho0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testInitializeUncheckedNull",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44868,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2di05yeymc(){try{__CLR4_5_2yjhyjhlvha7ho0.R.inc(44868);
        __CLR4_5_2yjhyjhlvha7ho0.R.inc(44869);assertNull("Got a result", ConcurrentUtils.initializeUnchecked(null));
    }finally{__CLR4_5_2yjhyjhlvha7ho0.R.flushNeeded();}}

    /**
     * Tests creating ConcurrentRuntimeException with no arguments.
     */
    @Test
    public void testUninitializedConcurrentRuntimeException() {__CLR4_5_2yjhyjhlvha7ho0.R.globalSliceStart(getClass().getName(),44870);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_291b0riyme();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2yjhyjhlvha7ho0.R.rethrow($CLV_t2$);}finally{__CLR4_5_2yjhyjhlvha7ho0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testUninitializedConcurrentRuntimeException",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44870,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_291b0riyme(){try{__CLR4_5_2yjhyjhlvha7ho0.R.inc(44870);
        __CLR4_5_2yjhyjhlvha7ho0.R.inc(44871);assertNotNull("Error creating empty ConcurrentRuntimeException", new ConcurrentRuntimeException());
    }finally{__CLR4_5_2yjhyjhlvha7ho0.R.flushNeeded();}}

    /**
     * Tests a successful initializeUnchecked() operation.
     *
     * @throws org.apache.commons.lang3.concurrent.ConcurrentException so we don't have to catch it
     */
    @Test
    public void testInitializeUnchecked() throws ConcurrentException {__CLR4_5_2yjhyjhlvha7ho0.R.globalSliceStart(getClass().getName(),44872);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24mgpnxymg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2yjhyjhlvha7ho0.R.rethrow($CLV_t2$);}finally{__CLR4_5_2yjhyjhlvha7ho0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testInitializeUnchecked",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44872,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24mgpnxymg() throws ConcurrentException{try{__CLR4_5_2yjhyjhlvha7ho0.R.inc(44872);
        __CLR4_5_2yjhyjhlvha7ho0.R.inc(44873);@SuppressWarnings("unchecked")
        final
        ConcurrentInitializer<Object> init = EasyMock
                .createMock(ConcurrentInitializer.class);
        __CLR4_5_2yjhyjhlvha7ho0.R.inc(44874);final Object result = new Object();
        __CLR4_5_2yjhyjhlvha7ho0.R.inc(44875);EasyMock.expect(init.get()).andReturn(result);
        __CLR4_5_2yjhyjhlvha7ho0.R.inc(44876);EasyMock.replay(init);
        __CLR4_5_2yjhyjhlvha7ho0.R.inc(44877);assertSame("Wrong result object", result, ConcurrentUtils
                .initializeUnchecked(init));
        __CLR4_5_2yjhyjhlvha7ho0.R.inc(44878);EasyMock.verify(init);
    }finally{__CLR4_5_2yjhyjhlvha7ho0.R.flushNeeded();}}

    /**
     * Tests whether exceptions are correctly handled by initializeUnchecked().
     *
     * @throws org.apache.commons.lang3.concurrent.ConcurrentException so we don't have to catch it
     */
    @Test
    public void testInitializeUncheckedEx() throws ConcurrentException {__CLR4_5_2yjhyjhlvha7ho0.R.globalSliceStart(getClass().getName(),44879);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_298uut6ymn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2yjhyjhlvha7ho0.R.rethrow($CLV_t2$);}finally{__CLR4_5_2yjhyjhlvha7ho0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testInitializeUncheckedEx",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44879,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_298uut6ymn() throws ConcurrentException{try{__CLR4_5_2yjhyjhlvha7ho0.R.inc(44879);
        __CLR4_5_2yjhyjhlvha7ho0.R.inc(44880);@SuppressWarnings("unchecked")
        final
        ConcurrentInitializer<Object> init = EasyMock
                .createMock(ConcurrentInitializer.class);
        __CLR4_5_2yjhyjhlvha7ho0.R.inc(44881);final Exception cause = new Exception();
        __CLR4_5_2yjhyjhlvha7ho0.R.inc(44882);EasyMock.expect(init.get()).andThrow(new ConcurrentException(cause));
        __CLR4_5_2yjhyjhlvha7ho0.R.inc(44883);EasyMock.replay(init);
        __CLR4_5_2yjhyjhlvha7ho0.R.inc(44884);try {
            __CLR4_5_2yjhyjhlvha7ho0.R.inc(44885);ConcurrentUtils.initializeUnchecked(init);
            __CLR4_5_2yjhyjhlvha7ho0.R.inc(44886);fail("Exception not thrown!");
        } catch (final ConcurrentRuntimeException crex) {
            __CLR4_5_2yjhyjhlvha7ho0.R.inc(44887);assertSame("Wrong cause", cause, crex.getCause());
        }
        __CLR4_5_2yjhyjhlvha7ho0.R.inc(44888);EasyMock.verify(init);
    }finally{__CLR4_5_2yjhyjhlvha7ho0.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Tests constant future.
     *
     * @throws java.lang.Exception so we don't have to catch it
     */
    @Test
    public void testConstantFuture_Integer() throws Exception {__CLR4_5_2yjhyjhlvha7ho0.R.globalSliceStart(getClass().getName(),44889);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2wm2cinymx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2yjhyjhlvha7ho0.R.rethrow($CLV_t2$);}finally{__CLR4_5_2yjhyjhlvha7ho0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testConstantFuture_Integer",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44889,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2wm2cinymx() throws Exception{try{__CLR4_5_2yjhyjhlvha7ho0.R.inc(44889);
        __CLR4_5_2yjhyjhlvha7ho0.R.inc(44890);final Integer value = Integer.valueOf(5);
        __CLR4_5_2yjhyjhlvha7ho0.R.inc(44891);final Future<Integer> test = ConcurrentUtils.constantFuture(value);
        __CLR4_5_2yjhyjhlvha7ho0.R.inc(44892);assertTrue(test.isDone());
        __CLR4_5_2yjhyjhlvha7ho0.R.inc(44893);assertSame(value, test.get());
        __CLR4_5_2yjhyjhlvha7ho0.R.inc(44894);assertSame(value, test.get(1000, TimeUnit.SECONDS));
        __CLR4_5_2yjhyjhlvha7ho0.R.inc(44895);assertSame(value, test.get(1000, null));
        __CLR4_5_2yjhyjhlvha7ho0.R.inc(44896);assertFalse(test.isCancelled());
        __CLR4_5_2yjhyjhlvha7ho0.R.inc(44897);assertFalse(test.cancel(true));
        __CLR4_5_2yjhyjhlvha7ho0.R.inc(44898);assertFalse(test.cancel(false));
    }finally{__CLR4_5_2yjhyjhlvha7ho0.R.flushNeeded();}}

    /**
     * Tests constant future.
     *
     * @throws java.lang.Exception so we don't have to catch it
     */
    @Test
    public void testConstantFuture_null() throws Exception {__CLR4_5_2yjhyjhlvha7ho0.R.globalSliceStart(getClass().getName(),44899);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2xwkvskyn7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2yjhyjhlvha7ho0.R.rethrow($CLV_t2$);}finally{__CLR4_5_2yjhyjhlvha7ho0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testConstantFuture_null",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44899,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2xwkvskyn7() throws Exception{try{__CLR4_5_2yjhyjhlvha7ho0.R.inc(44899);
        __CLR4_5_2yjhyjhlvha7ho0.R.inc(44900);final Integer value = null;
        __CLR4_5_2yjhyjhlvha7ho0.R.inc(44901);final Future<Integer> test = ConcurrentUtils.constantFuture(value);
        __CLR4_5_2yjhyjhlvha7ho0.R.inc(44902);assertTrue(test.isDone());
        __CLR4_5_2yjhyjhlvha7ho0.R.inc(44903);assertSame(value, test.get());
        __CLR4_5_2yjhyjhlvha7ho0.R.inc(44904);assertSame(value, test.get(1000, TimeUnit.SECONDS));
        __CLR4_5_2yjhyjhlvha7ho0.R.inc(44905);assertSame(value, test.get(1000, null));
        __CLR4_5_2yjhyjhlvha7ho0.R.inc(44906);assertFalse(test.isCancelled());
        __CLR4_5_2yjhyjhlvha7ho0.R.inc(44907);assertFalse(test.cancel(true));
        __CLR4_5_2yjhyjhlvha7ho0.R.inc(44908);assertFalse(test.cancel(false));
    }finally{__CLR4_5_2yjhyjhlvha7ho0.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Tests putIfAbsent() if the map contains the key in question.
     */
    @Test
    public void testPutIfAbsentKeyPresent() {__CLR4_5_2yjhyjhlvha7ho0.R.globalSliceStart(getClass().getName(),44909);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2lxlmgaynh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2yjhyjhlvha7ho0.R.rethrow($CLV_t2$);}finally{__CLR4_5_2yjhyjhlvha7ho0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testPutIfAbsentKeyPresent",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44909,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2lxlmgaynh(){try{__CLR4_5_2yjhyjhlvha7ho0.R.inc(44909);
        __CLR4_5_2yjhyjhlvha7ho0.R.inc(44910);final String key = "testKey";
        __CLR4_5_2yjhyjhlvha7ho0.R.inc(44911);final Integer value = 42;
        __CLR4_5_2yjhyjhlvha7ho0.R.inc(44912);final ConcurrentMap<String, Integer> map = new ConcurrentHashMap<>();
        __CLR4_5_2yjhyjhlvha7ho0.R.inc(44913);map.put(key, value);
        __CLR4_5_2yjhyjhlvha7ho0.R.inc(44914);assertEquals("Wrong result", value,
                ConcurrentUtils.putIfAbsent(map, key, 0));
        __CLR4_5_2yjhyjhlvha7ho0.R.inc(44915);assertEquals("Wrong value in map", value, map.get(key));
    }finally{__CLR4_5_2yjhyjhlvha7ho0.R.flushNeeded();}}

    /**
     * Tests putIfAbsent() if the map does not contain the key in question.
     */
    @Test
    public void testPutIfAbsentKeyNotPresent() {__CLR4_5_2yjhyjhlvha7ho0.R.globalSliceStart(getClass().getName(),44916);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_25ngipnyno();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2yjhyjhlvha7ho0.R.rethrow($CLV_t2$);}finally{__CLR4_5_2yjhyjhlvha7ho0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testPutIfAbsentKeyNotPresent",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44916,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_25ngipnyno(){try{__CLR4_5_2yjhyjhlvha7ho0.R.inc(44916);
        __CLR4_5_2yjhyjhlvha7ho0.R.inc(44917);final String key = "testKey";
        __CLR4_5_2yjhyjhlvha7ho0.R.inc(44918);final Integer value = 42;
        __CLR4_5_2yjhyjhlvha7ho0.R.inc(44919);final ConcurrentMap<String, Integer> map = new ConcurrentHashMap<>();
        __CLR4_5_2yjhyjhlvha7ho0.R.inc(44920);assertEquals("Wrong result", value,
                ConcurrentUtils.putIfAbsent(map, key, value));
        __CLR4_5_2yjhyjhlvha7ho0.R.inc(44921);assertEquals("Wrong value in map", value, map.get(key));
    }finally{__CLR4_5_2yjhyjhlvha7ho0.R.flushNeeded();}}

    /**
     * Tests putIfAbsent() if a null map is passed in.
     */
    @Test
    public void testPutIfAbsentNullMap() {__CLR4_5_2yjhyjhlvha7ho0.R.globalSliceStart(getClass().getName(),44922);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2dsak15ynu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2yjhyjhlvha7ho0.R.rethrow($CLV_t2$);}finally{__CLR4_5_2yjhyjhlvha7ho0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testPutIfAbsentNullMap",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44922,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2dsak15ynu(){try{__CLR4_5_2yjhyjhlvha7ho0.R.inc(44922);
        __CLR4_5_2yjhyjhlvha7ho0.R.inc(44923);assertNull("Wrong result",
                ConcurrentUtils.putIfAbsent(null, "test", 100));
    }finally{__CLR4_5_2yjhyjhlvha7ho0.R.flushNeeded();}}

    /**
     * Tests createIfAbsent() if the key is found in the map.
     *
     * @throws org.apache.commons.lang3.concurrent.ConcurrentException so we don't have to catch it
     */
    @Test
    public void testCreateIfAbsentKeyPresent() throws ConcurrentException {__CLR4_5_2yjhyjhlvha7ho0.R.globalSliceStart(getClass().getName(),44924);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2tqh1hjynw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2yjhyjhlvha7ho0.R.rethrow($CLV_t2$);}finally{__CLR4_5_2yjhyjhlvha7ho0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testCreateIfAbsentKeyPresent",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44924,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2tqh1hjynw() throws ConcurrentException{try{__CLR4_5_2yjhyjhlvha7ho0.R.inc(44924);
        __CLR4_5_2yjhyjhlvha7ho0.R.inc(44925);@SuppressWarnings("unchecked")
        final
        ConcurrentInitializer<Integer> init = EasyMock
                .createMock(ConcurrentInitializer.class);
        __CLR4_5_2yjhyjhlvha7ho0.R.inc(44926);EasyMock.replay(init);
        __CLR4_5_2yjhyjhlvha7ho0.R.inc(44927);final String key = "testKey";
        __CLR4_5_2yjhyjhlvha7ho0.R.inc(44928);final Integer value = 42;
        __CLR4_5_2yjhyjhlvha7ho0.R.inc(44929);final ConcurrentMap<String, Integer> map = new ConcurrentHashMap<>();
        __CLR4_5_2yjhyjhlvha7ho0.R.inc(44930);map.put(key, value);
        __CLR4_5_2yjhyjhlvha7ho0.R.inc(44931);assertEquals("Wrong result", value,
                ConcurrentUtils.createIfAbsent(map, key, init));
        __CLR4_5_2yjhyjhlvha7ho0.R.inc(44932);assertEquals("Wrong value in map", value, map.get(key));
        __CLR4_5_2yjhyjhlvha7ho0.R.inc(44933);EasyMock.verify(init);
    }finally{__CLR4_5_2yjhyjhlvha7ho0.R.flushNeeded();}}

    /**
     * Tests createIfAbsent() if the map does not contain the key in question.
     *
     * @throws org.apache.commons.lang3.concurrent.ConcurrentException so we don't have to catch it
     */
    @Test
    public void testCreateIfAbsentKeyNotPresent() throws ConcurrentException {__CLR4_5_2yjhyjhlvha7ho0.R.globalSliceStart(getClass().getName(),44934);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2stzpt6yo6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2yjhyjhlvha7ho0.R.rethrow($CLV_t2$);}finally{__CLR4_5_2yjhyjhlvha7ho0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testCreateIfAbsentKeyNotPresent",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44934,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2stzpt6yo6() throws ConcurrentException{try{__CLR4_5_2yjhyjhlvha7ho0.R.inc(44934);
        __CLR4_5_2yjhyjhlvha7ho0.R.inc(44935);@SuppressWarnings("unchecked")
        final
        ConcurrentInitializer<Integer> init = EasyMock
                .createMock(ConcurrentInitializer.class);
        __CLR4_5_2yjhyjhlvha7ho0.R.inc(44936);final String key = "testKey";
        __CLR4_5_2yjhyjhlvha7ho0.R.inc(44937);final Integer value = 42;
        __CLR4_5_2yjhyjhlvha7ho0.R.inc(44938);EasyMock.expect(init.get()).andReturn(value);
        __CLR4_5_2yjhyjhlvha7ho0.R.inc(44939);EasyMock.replay(init);
        __CLR4_5_2yjhyjhlvha7ho0.R.inc(44940);final ConcurrentMap<String, Integer> map = new ConcurrentHashMap<>();
        __CLR4_5_2yjhyjhlvha7ho0.R.inc(44941);assertEquals("Wrong result", value,
                ConcurrentUtils.createIfAbsent(map, key, init));
        __CLR4_5_2yjhyjhlvha7ho0.R.inc(44942);assertEquals("Wrong value in map", value, map.get(key));
        __CLR4_5_2yjhyjhlvha7ho0.R.inc(44943);EasyMock.verify(init);
    }finally{__CLR4_5_2yjhyjhlvha7ho0.R.flushNeeded();}}

    /**
     * Tests createIfAbsent() if a null map is passed in.
     *
     * @throws org.apache.commons.lang3.concurrent.ConcurrentException so we don't have to catch it
     */
    @Test
    public void testCreateIfAbsentNullMap() throws ConcurrentException {__CLR4_5_2yjhyjhlvha7ho0.R.globalSliceStart(getClass().getName(),44944);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21l0tuwyog();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2yjhyjhlvha7ho0.R.rethrow($CLV_t2$);}finally{__CLR4_5_2yjhyjhlvha7ho0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testCreateIfAbsentNullMap",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44944,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21l0tuwyog() throws ConcurrentException{try{__CLR4_5_2yjhyjhlvha7ho0.R.inc(44944);
        __CLR4_5_2yjhyjhlvha7ho0.R.inc(44945);@SuppressWarnings("unchecked")
        final
        ConcurrentInitializer<Integer> init = EasyMock
                .createMock(ConcurrentInitializer.class);
        __CLR4_5_2yjhyjhlvha7ho0.R.inc(44946);EasyMock.replay(init);
        __CLR4_5_2yjhyjhlvha7ho0.R.inc(44947);assertNull("Wrong result",
                ConcurrentUtils.createIfAbsent(null, "test", init));
        __CLR4_5_2yjhyjhlvha7ho0.R.inc(44948);EasyMock.verify(init);
    }finally{__CLR4_5_2yjhyjhlvha7ho0.R.flushNeeded();}}

    /**
     * Tests createIfAbsent() if a null initializer is passed in.
     *
     * @throws org.apache.commons.lang3.concurrent.ConcurrentException so we don't have to catch it
     */
    @Test
    public void testCreateIfAbsentNullInit() throws ConcurrentException {__CLR4_5_2yjhyjhlvha7ho0.R.globalSliceStart(getClass().getName(),44949);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2o0yhc2yol();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2yjhyjhlvha7ho0.R.rethrow($CLV_t2$);}finally{__CLR4_5_2yjhyjhlvha7ho0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testCreateIfAbsentNullInit",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44949,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2o0yhc2yol() throws ConcurrentException{try{__CLR4_5_2yjhyjhlvha7ho0.R.inc(44949);
        __CLR4_5_2yjhyjhlvha7ho0.R.inc(44950);final ConcurrentMap<String, Integer> map = new ConcurrentHashMap<>();
        __CLR4_5_2yjhyjhlvha7ho0.R.inc(44951);final String key = "testKey";
        __CLR4_5_2yjhyjhlvha7ho0.R.inc(44952);final Integer value = 42;
        __CLR4_5_2yjhyjhlvha7ho0.R.inc(44953);map.put(key, value);
        __CLR4_5_2yjhyjhlvha7ho0.R.inc(44954);assertNull("Wrong result",
                ConcurrentUtils.createIfAbsent(map, key, null));
        __CLR4_5_2yjhyjhlvha7ho0.R.inc(44955);assertEquals("Map was changed", value, map.get(key));
    }finally{__CLR4_5_2yjhyjhlvha7ho0.R.flushNeeded();}}

    /**
     * Tests createIfAbsentUnchecked() if no exception is thrown.
     */
    @Test
    public void testCreateIfAbsentUncheckedSuccess() {__CLR4_5_2yjhyjhlvha7ho0.R.globalSliceStart(getClass().getName(),44956);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22gzuoyos();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2yjhyjhlvha7ho0.R.rethrow($CLV_t2$);}finally{__CLR4_5_2yjhyjhlvha7ho0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testCreateIfAbsentUncheckedSuccess",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44956,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22gzuoyos(){try{__CLR4_5_2yjhyjhlvha7ho0.R.inc(44956);
        __CLR4_5_2yjhyjhlvha7ho0.R.inc(44957);final String key = "testKey";
        __CLR4_5_2yjhyjhlvha7ho0.R.inc(44958);final Integer value = 42;
        __CLR4_5_2yjhyjhlvha7ho0.R.inc(44959);final ConcurrentMap<String, Integer> map = new ConcurrentHashMap<>();
        __CLR4_5_2yjhyjhlvha7ho0.R.inc(44960);assertEquals("Wrong result", value,
                ConcurrentUtils.createIfAbsentUnchecked(map, key,
                        new ConstantInitializer<>(value)));
        __CLR4_5_2yjhyjhlvha7ho0.R.inc(44961);assertEquals("Wrong value in map", value, map.get(key));
    }finally{__CLR4_5_2yjhyjhlvha7ho0.R.flushNeeded();}}

    /**
     * Tests createIfAbsentUnchecked() if an exception is thrown.
     *
     * @throws org.apache.commons.lang3.concurrent.ConcurrentException so we don't have to catch it
     */
    @Test
    public void testCreateIfAbsentUncheckedException()
            throws ConcurrentException {__CLR4_5_2yjhyjhlvha7ho0.R.globalSliceStart(getClass().getName(),44962);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2r38yx8yoy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2yjhyjhlvha7ho0.R.rethrow($CLV_t2$);}finally{__CLR4_5_2yjhyjhlvha7ho0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testCreateIfAbsentUncheckedException",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44962,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2r38yx8yoy() throws ConcurrentException{try{__CLR4_5_2yjhyjhlvha7ho0.R.inc(44962);
        __CLR4_5_2yjhyjhlvha7ho0.R.inc(44963);@SuppressWarnings("unchecked")
        final
        ConcurrentInitializer<Integer> init = EasyMock
                .createMock(ConcurrentInitializer.class);
        __CLR4_5_2yjhyjhlvha7ho0.R.inc(44964);final Exception ex = new Exception();
        __CLR4_5_2yjhyjhlvha7ho0.R.inc(44965);EasyMock.expect(init.get()).andThrow(new ConcurrentException(ex));
        __CLR4_5_2yjhyjhlvha7ho0.R.inc(44966);EasyMock.replay(init);
        __CLR4_5_2yjhyjhlvha7ho0.R.inc(44967);try {
            __CLR4_5_2yjhyjhlvha7ho0.R.inc(44968);ConcurrentUtils.createIfAbsentUnchecked(
                    new ConcurrentHashMap<String, Integer>(), "test", init);
            __CLR4_5_2yjhyjhlvha7ho0.R.inc(44969);fail("Exception not thrown!");
        } catch (final ConcurrentRuntimeException crex) {
            __CLR4_5_2yjhyjhlvha7ho0.R.inc(44970);assertEquals("Wrong cause", ex, crex.getCause());
        }
        __CLR4_5_2yjhyjhlvha7ho0.R.inc(44971);EasyMock.verify(init);
    }finally{__CLR4_5_2yjhyjhlvha7ho0.R.flushNeeded();}}
}
