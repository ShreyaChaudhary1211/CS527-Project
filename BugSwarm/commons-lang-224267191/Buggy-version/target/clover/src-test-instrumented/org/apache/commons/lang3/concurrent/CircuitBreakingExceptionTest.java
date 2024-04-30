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

import org.apache.commons.lang3.exception.AbstractExceptionTest;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;


/**
 * JUnit tests for {@link CircuitBreakingException}.
 */
public class CircuitBreakingExceptionTest extends AbstractExceptionTest {static class __CLR4_5_2yipyiplvha7hnk{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172763741L,8589935092L,44765,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    
    @Test(expected = CircuitBreakingException.class)
    public void testThrowingInformativeException() throws Exception {__CLR4_5_2yipyiplvha7hnk.R.globalSliceStart(getClass().getName(),44737);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_29uobh4yip();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,84,104,114,111,119,105,110,103,73,110,102,111,114,109,97,116,105,118,101,69,120,99,101,112,116,105,111,110,58,32,91,67,105,114,99,117,105,116,66,114,101,97,107,105,110,103,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof CircuitBreakingException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2yipyiplvha7hnk.R.rethrow($CLV_t2$);}finally{__CLR4_5_2yipyiplvha7hnk.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.CircuitBreakingExceptionTest.testThrowingInformativeException",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44737,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_29uobh4yip() throws Exception{try{__CLR4_5_2yipyiplvha7hnk.R.inc(44737);
        __CLR4_5_2yipyiplvha7hnk.R.inc(44738);throw new CircuitBreakingException(EXCEPTION_MESSAGE, generateCause());
    }finally{__CLR4_5_2yipyiplvha7hnk.R.flushNeeded();}}
    
    @Test(expected = CircuitBreakingException.class)
    public void testThrowingExceptionWithMessage() throws Exception {__CLR4_5_2yipyiplvha7hnk.R.globalSliceStart(getClass().getName(),44739);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ur66xyir();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,84,104,114,111,119,105,110,103,69,120,99,101,112,116,105,111,110,87,105,116,104,77,101,115,115,97,103,101,58,32,91,67,105,114,99,117,105,116,66,114,101,97,107,105,110,103,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof CircuitBreakingException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2yipyiplvha7hnk.R.rethrow($CLV_t2$);}finally{__CLR4_5_2yipyiplvha7hnk.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.CircuitBreakingExceptionTest.testThrowingExceptionWithMessage",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44739,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ur66xyir() throws Exception{try{__CLR4_5_2yipyiplvha7hnk.R.inc(44739);
        __CLR4_5_2yipyiplvha7hnk.R.inc(44740);throw new CircuitBreakingException(EXCEPTION_MESSAGE);
    }finally{__CLR4_5_2yipyiplvha7hnk.R.flushNeeded();}}
    
    @Test(expected = CircuitBreakingException.class)
    public void testThrowingExceptionWithCause() throws Exception {__CLR4_5_2yipyiplvha7hnk.R.globalSliceStart(getClass().getName(),44741);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2fepfp3yit();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,84,104,114,111,119,105,110,103,69,120,99,101,112,116,105,111,110,87,105,116,104,67,97,117,115,101,58,32,91,67,105,114,99,117,105,116,66,114,101,97,107,105,110,103,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof CircuitBreakingException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2yipyiplvha7hnk.R.rethrow($CLV_t2$);}finally{__CLR4_5_2yipyiplvha7hnk.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.CircuitBreakingExceptionTest.testThrowingExceptionWithCause",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44741,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2fepfp3yit() throws Exception{try{__CLR4_5_2yipyiplvha7hnk.R.inc(44741);
        __CLR4_5_2yipyiplvha7hnk.R.inc(44742);throw new CircuitBreakingException(generateCause());
    }finally{__CLR4_5_2yipyiplvha7hnk.R.flushNeeded();}}
    
    @Test(expected = CircuitBreakingException.class)
    public void testThrowingEmptyException() throws Exception {__CLR4_5_2yipyiplvha7hnk.R.globalSliceStart(getClass().getName(),44743);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2mgjlplyiv();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,84,104,114,111,119,105,110,103,69,109,112,116,121,69,120,99,101,112,116,105,111,110,58,32,91,67,105,114,99,117,105,116,66,114,101,97,107,105,110,103,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof CircuitBreakingException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2yipyiplvha7hnk.R.rethrow($CLV_t2$);}finally{__CLR4_5_2yipyiplvha7hnk.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.CircuitBreakingExceptionTest.testThrowingEmptyException",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44743,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2mgjlplyiv() throws Exception{try{__CLR4_5_2yipyiplvha7hnk.R.inc(44743);
        __CLR4_5_2yipyiplvha7hnk.R.inc(44744);throw new CircuitBreakingException();
    }finally{__CLR4_5_2yipyiplvha7hnk.R.flushNeeded();}}
    
    @Test
    public void testWithCauseAndMessage() throws Exception {__CLR4_5_2yipyiplvha7hnk.R.globalSliceStart(getClass().getName(),44745);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ub8ft4yix();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2yipyiplvha7hnk.R.rethrow($CLV_t2$);}finally{__CLR4_5_2yipyiplvha7hnk.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.CircuitBreakingExceptionTest.testWithCauseAndMessage",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44745,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ub8ft4yix() throws Exception{try{__CLR4_5_2yipyiplvha7hnk.R.inc(44745);
        __CLR4_5_2yipyiplvha7hnk.R.inc(44746);final Exception exception = new CircuitBreakingException(EXCEPTION_MESSAGE, generateCause());
        __CLR4_5_2yipyiplvha7hnk.R.inc(44747);assertNotNull(exception);
        __CLR4_5_2yipyiplvha7hnk.R.inc(44748);assertEquals(WRONG_EXCEPTION_MESSAGE, EXCEPTION_MESSAGE, exception.getMessage());
        
        __CLR4_5_2yipyiplvha7hnk.R.inc(44749);final Throwable cause = exception.getCause();
        __CLR4_5_2yipyiplvha7hnk.R.inc(44750);assertNotNull(cause);
        __CLR4_5_2yipyiplvha7hnk.R.inc(44751);assertEquals(WRONG_CAUSE_MESSAGE, CAUSE_MESSAGE, cause.getMessage());
    }finally{__CLR4_5_2yipyiplvha7hnk.R.flushNeeded();}}
    
    @Test
    public void testWithoutCause() throws Exception {__CLR4_5_2yipyiplvha7hnk.R.globalSliceStart(getClass().getName(),44752);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2dv5uzeyj4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2yipyiplvha7hnk.R.rethrow($CLV_t2$);}finally{__CLR4_5_2yipyiplvha7hnk.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.CircuitBreakingExceptionTest.testWithoutCause",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44752,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2dv5uzeyj4() throws Exception{try{__CLR4_5_2yipyiplvha7hnk.R.inc(44752);
        __CLR4_5_2yipyiplvha7hnk.R.inc(44753);final Exception exception = new CircuitBreakingException(EXCEPTION_MESSAGE);
        __CLR4_5_2yipyiplvha7hnk.R.inc(44754);assertNotNull(exception);
        __CLR4_5_2yipyiplvha7hnk.R.inc(44755);assertEquals(WRONG_EXCEPTION_MESSAGE, EXCEPTION_MESSAGE, exception.getMessage());
        
        __CLR4_5_2yipyiplvha7hnk.R.inc(44756);final Throwable cause = exception.getCause();
        __CLR4_5_2yipyiplvha7hnk.R.inc(44757);assertNull(cause);
    }finally{__CLR4_5_2yipyiplvha7hnk.R.flushNeeded();}}
    
    @Test
    public void testWithoutMessage() throws Exception {__CLR4_5_2yipyiplvha7hnk.R.globalSliceStart(getClass().getName(),44758);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23d36uwyja();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2yipyiplvha7hnk.R.rethrow($CLV_t2$);}finally{__CLR4_5_2yipyiplvha7hnk.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.CircuitBreakingExceptionTest.testWithoutMessage",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44758,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23d36uwyja() throws Exception{try{__CLR4_5_2yipyiplvha7hnk.R.inc(44758);
        __CLR4_5_2yipyiplvha7hnk.R.inc(44759);final Exception exception = new CircuitBreakingException(generateCause());
        __CLR4_5_2yipyiplvha7hnk.R.inc(44760);assertNotNull(exception);
        __CLR4_5_2yipyiplvha7hnk.R.inc(44761);assertNotNull(exception.getMessage());
        
        __CLR4_5_2yipyiplvha7hnk.R.inc(44762);final Throwable cause = exception.getCause();
        __CLR4_5_2yipyiplvha7hnk.R.inc(44763);assertNotNull(cause);
        __CLR4_5_2yipyiplvha7hnk.R.inc(44764);assertEquals(WRONG_CAUSE_MESSAGE, CAUSE_MESSAGE, cause.getMessage());
    }finally{__CLR4_5_2yipyiplvha7hnk.R.flushNeeded();}}
}