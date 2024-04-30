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
package org.apache.commons.lang3.exception;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.Date;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

/**
 * JUnit tests for ContextedException.
 */
public class ContextedExceptionTest extends AbstractExceptionContextTest<ContextedException> {static class __CLR4_5_2ziazialvha7ht6{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172763741L,8589935092L,46065,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    
    @Override
    public void setUp() throws Exception {try{__CLR4_5_2ziazialvha7ht6.R.inc(46018);
        __CLR4_5_2ziazialvha7ht6.R.inc(46019);exceptionContext = new ContextedException(new Exception(TEST_MESSAGE));
        __CLR4_5_2ziazialvha7ht6.R.inc(46020);super.setUp();
    }finally{__CLR4_5_2ziazialvha7ht6.R.flushNeeded();}}

    @Test
    public void testContextedException() {__CLR4_5_2ziazialvha7ht6.R.globalSliceStart(getClass().getName(),46021);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2bsrjayzid();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ziazialvha7ht6.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ziazialvha7ht6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.exception.ContextedExceptionTest.testContextedException",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),46021,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2bsrjayzid(){try{__CLR4_5_2ziazialvha7ht6.R.inc(46021);
        __CLR4_5_2ziazialvha7ht6.R.inc(46022);exceptionContext = new ContextedException();
        __CLR4_5_2ziazialvha7ht6.R.inc(46023);final String message = exceptionContext.getMessage();
        __CLR4_5_2ziazialvha7ht6.R.inc(46024);final String trace = ExceptionUtils.getStackTrace(exceptionContext);
        __CLR4_5_2ziazialvha7ht6.R.inc(46025);assertTrue(trace.indexOf("ContextedException")>=0);
        __CLR4_5_2ziazialvha7ht6.R.inc(46026);assertTrue(StringUtils.isEmpty(message));
    }finally{__CLR4_5_2ziazialvha7ht6.R.flushNeeded();}}

    @Test
    public void testContextedExceptionString() {__CLR4_5_2ziazialvha7ht6.R.globalSliceStart(getClass().getName(),46027);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_29iknn9zij();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ziazialvha7ht6.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ziazialvha7ht6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.exception.ContextedExceptionTest.testContextedExceptionString",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),46027,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_29iknn9zij(){try{__CLR4_5_2ziazialvha7ht6.R.inc(46027);
        __CLR4_5_2ziazialvha7ht6.R.inc(46028);exceptionContext = new ContextedException(TEST_MESSAGE);
        __CLR4_5_2ziazialvha7ht6.R.inc(46029);assertEquals(TEST_MESSAGE, exceptionContext.getMessage());
        
        __CLR4_5_2ziazialvha7ht6.R.inc(46030);final String trace = ExceptionUtils.getStackTrace(exceptionContext);
        __CLR4_5_2ziazialvha7ht6.R.inc(46031);assertTrue(trace.indexOf(TEST_MESSAGE)>=0);
    }finally{__CLR4_5_2ziazialvha7ht6.R.flushNeeded();}}

    @Test
    public void testContextedExceptionThrowable() {__CLR4_5_2ziazialvha7ht6.R.globalSliceStart(getClass().getName(),46032);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2b0gvhozio();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ziazialvha7ht6.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ziazialvha7ht6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.exception.ContextedExceptionTest.testContextedExceptionThrowable",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),46032,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2b0gvhozio(){try{__CLR4_5_2ziazialvha7ht6.R.inc(46032);
        __CLR4_5_2ziazialvha7ht6.R.inc(46033);exceptionContext = new ContextedException(new Exception(TEST_MESSAGE));
        __CLR4_5_2ziazialvha7ht6.R.inc(46034);final String message = exceptionContext.getMessage();
        __CLR4_5_2ziazialvha7ht6.R.inc(46035);final String trace = ExceptionUtils.getStackTrace(exceptionContext);
        __CLR4_5_2ziazialvha7ht6.R.inc(46036);assertTrue(trace.indexOf("ContextedException")>=0);
        __CLR4_5_2ziazialvha7ht6.R.inc(46037);assertTrue(trace.indexOf(TEST_MESSAGE)>=0);
        __CLR4_5_2ziazialvha7ht6.R.inc(46038);assertTrue(message.indexOf(TEST_MESSAGE)>=0);
    }finally{__CLR4_5_2ziazialvha7ht6.R.flushNeeded();}}

    @Test
    public void testContextedExceptionStringThrowable() {__CLR4_5_2ziazialvha7ht6.R.globalSliceStart(getClass().getName(),46039);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2j1qehvziv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ziazialvha7ht6.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ziazialvha7ht6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.exception.ContextedExceptionTest.testContextedExceptionStringThrowable",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),46039,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2j1qehvziv(){try{__CLR4_5_2ziazialvha7ht6.R.inc(46039);
        __CLR4_5_2ziazialvha7ht6.R.inc(46040);exceptionContext = new ContextedException(TEST_MESSAGE_2, new Exception(TEST_MESSAGE));
        __CLR4_5_2ziazialvha7ht6.R.inc(46041);final String message = exceptionContext.getMessage();
        __CLR4_5_2ziazialvha7ht6.R.inc(46042);final String trace = ExceptionUtils.getStackTrace(exceptionContext);
        __CLR4_5_2ziazialvha7ht6.R.inc(46043);assertTrue(trace.indexOf("ContextedException")>=0);
        __CLR4_5_2ziazialvha7ht6.R.inc(46044);assertTrue(trace.indexOf(TEST_MESSAGE)>=0);
        __CLR4_5_2ziazialvha7ht6.R.inc(46045);assertTrue(trace.indexOf(TEST_MESSAGE_2)>=0);
        __CLR4_5_2ziazialvha7ht6.R.inc(46046);assertTrue(message.indexOf(TEST_MESSAGE_2)>=0);
    }finally{__CLR4_5_2ziazialvha7ht6.R.flushNeeded();}}
    
    @Test
    public void testContextedExceptionStringThrowableContext() {__CLR4_5_2ziazialvha7ht6.R.globalSliceStart(getClass().getName(),46047);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2z5npayzj3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ziazialvha7ht6.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ziazialvha7ht6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.exception.ContextedExceptionTest.testContextedExceptionStringThrowableContext",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),46047,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2z5npayzj3(){try{__CLR4_5_2ziazialvha7ht6.R.inc(46047);
        __CLR4_5_2ziazialvha7ht6.R.inc(46048);exceptionContext = new ContextedException(TEST_MESSAGE_2, new Exception(TEST_MESSAGE), new DefaultExceptionContext());
        __CLR4_5_2ziazialvha7ht6.R.inc(46049);final String message = exceptionContext.getMessage();
        __CLR4_5_2ziazialvha7ht6.R.inc(46050);final String trace = ExceptionUtils.getStackTrace(exceptionContext);
        __CLR4_5_2ziazialvha7ht6.R.inc(46051);assertTrue(trace.indexOf("ContextedException")>=0);
        __CLR4_5_2ziazialvha7ht6.R.inc(46052);assertTrue(trace.indexOf(TEST_MESSAGE)>=0);
        __CLR4_5_2ziazialvha7ht6.R.inc(46053);assertTrue(trace.indexOf(TEST_MESSAGE_2)>=0);
        __CLR4_5_2ziazialvha7ht6.R.inc(46054);assertTrue(message.indexOf(TEST_MESSAGE_2)>=0);
    }finally{__CLR4_5_2ziazialvha7ht6.R.flushNeeded();}}

    @Test
    public void testNullExceptionPassing() {__CLR4_5_2ziazialvha7ht6.R.globalSliceStart(getClass().getName(),46055);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n2zwo2zjb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ziazialvha7ht6.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ziazialvha7ht6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.exception.ContextedExceptionTest.testNullExceptionPassing",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),46055,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n2zwo2zjb(){try{__CLR4_5_2ziazialvha7ht6.R.inc(46055);
        __CLR4_5_2ziazialvha7ht6.R.inc(46056);exceptionContext = new ContextedException(TEST_MESSAGE_2, new Exception(TEST_MESSAGE), null)
        .addContextValue("test1", null)
        .addContextValue("test2", "some value")
        .addContextValue("test Date", new Date())
        .addContextValue("test Nbr", Integer.valueOf(5))
        .addContextValue("test Poorly written obj", new ObjectWithFaultyToString());
        
        __CLR4_5_2ziazialvha7ht6.R.inc(46057);final String message = exceptionContext.getMessage();
        __CLR4_5_2ziazialvha7ht6.R.inc(46058);assertTrue(message != null);
    }finally{__CLR4_5_2ziazialvha7ht6.R.flushNeeded();}}

    @Test
    public void testRawMessage() {__CLR4_5_2ziazialvha7ht6.R.globalSliceStart(getClass().getName(),46059);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_25rv2zszjf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ziazialvha7ht6.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ziazialvha7ht6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.exception.ContextedExceptionTest.testRawMessage",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),46059,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_25rv2zszjf(){try{__CLR4_5_2ziazialvha7ht6.R.inc(46059);
        __CLR4_5_2ziazialvha7ht6.R.inc(46060);assertEquals(Exception.class.getName() + ": " + TEST_MESSAGE, exceptionContext.getRawMessage());
        __CLR4_5_2ziazialvha7ht6.R.inc(46061);exceptionContext = new ContextedException(TEST_MESSAGE_2, new Exception(TEST_MESSAGE), new DefaultExceptionContext());
        __CLR4_5_2ziazialvha7ht6.R.inc(46062);assertEquals(TEST_MESSAGE_2, exceptionContext.getRawMessage());
        __CLR4_5_2ziazialvha7ht6.R.inc(46063);exceptionContext = new ContextedException(null, new Exception(TEST_MESSAGE), new DefaultExceptionContext());
        __CLR4_5_2ziazialvha7ht6.R.inc(46064);assertNull(exceptionContext.getRawMessage());
    }finally{__CLR4_5_2ziazialvha7ht6.R.flushNeeded();}}
}
