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

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

/**
 * JUnit tests for {@link CloneFailedExceptionTest}.
 */
public class CloneFailedExceptionTest extends AbstractExceptionTest {static class __CLR4_5_2zhkzhklvha7hsy{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172763741L,8589935092L,46018,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    
    @Test(expected = CloneFailedException.class)
    public void testThrowingInformativeException() throws Exception {__CLR4_5_2zhkzhklvha7hsy.R.globalSliceStart(getClass().getName(),45992);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_29uobh4zhk();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,84,104,114,111,119,105,110,103,73,110,102,111,114,109,97,116,105,118,101,69,120,99,101,112,116,105,111,110,58,32,91,67,108,111,110,101,70,97,105,108,101,100,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof CloneFailedException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2zhkzhklvha7hsy.R.rethrow($CLV_t2$);}finally{__CLR4_5_2zhkzhklvha7hsy.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.exception.CloneFailedExceptionTest.testThrowingInformativeException",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),45992,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_29uobh4zhk() throws Exception{try{__CLR4_5_2zhkzhklvha7hsy.R.inc(45992);
        __CLR4_5_2zhkzhklvha7hsy.R.inc(45993);throw new CloneFailedException(EXCEPTION_MESSAGE, generateCause());
    }finally{__CLR4_5_2zhkzhklvha7hsy.R.flushNeeded();}}
    
    @Test(expected = CloneFailedException.class)
    public void testThrowingExceptionWithMessage() throws Exception {__CLR4_5_2zhkzhklvha7hsy.R.globalSliceStart(getClass().getName(),45994);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ur66xzhm();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,84,104,114,111,119,105,110,103,69,120,99,101,112,116,105,111,110,87,105,116,104,77,101,115,115,97,103,101,58,32,91,67,108,111,110,101,70,97,105,108,101,100,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof CloneFailedException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2zhkzhklvha7hsy.R.rethrow($CLV_t2$);}finally{__CLR4_5_2zhkzhklvha7hsy.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.exception.CloneFailedExceptionTest.testThrowingExceptionWithMessage",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),45994,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ur66xzhm() throws Exception{try{__CLR4_5_2zhkzhklvha7hsy.R.inc(45994);
        __CLR4_5_2zhkzhklvha7hsy.R.inc(45995);throw new CloneFailedException(EXCEPTION_MESSAGE);
    }finally{__CLR4_5_2zhkzhklvha7hsy.R.flushNeeded();}}
    
    @Test(expected = CloneFailedException.class)
    public void testThrowingExceptionWithCause() throws Exception {__CLR4_5_2zhkzhklvha7hsy.R.globalSliceStart(getClass().getName(),45996);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2fepfp3zho();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,84,104,114,111,119,105,110,103,69,120,99,101,112,116,105,111,110,87,105,116,104,67,97,117,115,101,58,32,91,67,108,111,110,101,70,97,105,108,101,100,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof CloneFailedException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2zhkzhklvha7hsy.R.rethrow($CLV_t2$);}finally{__CLR4_5_2zhkzhklvha7hsy.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.exception.CloneFailedExceptionTest.testThrowingExceptionWithCause",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),45996,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2fepfp3zho() throws Exception{try{__CLR4_5_2zhkzhklvha7hsy.R.inc(45996);
        __CLR4_5_2zhkzhklvha7hsy.R.inc(45997);throw new CloneFailedException(generateCause());
    }finally{__CLR4_5_2zhkzhklvha7hsy.R.flushNeeded();}}
    
    @Test
    public void testWithCauseAndMessage() throws Exception {__CLR4_5_2zhkzhklvha7hsy.R.globalSliceStart(getClass().getName(),45998);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ub8ft4zhq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2zhkzhklvha7hsy.R.rethrow($CLV_t2$);}finally{__CLR4_5_2zhkzhklvha7hsy.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.exception.CloneFailedExceptionTest.testWithCauseAndMessage",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),45998,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ub8ft4zhq() throws Exception{try{__CLR4_5_2zhkzhklvha7hsy.R.inc(45998);
        __CLR4_5_2zhkzhklvha7hsy.R.inc(45999);final Exception exception = new CloneFailedException(EXCEPTION_MESSAGE, generateCause());
        __CLR4_5_2zhkzhklvha7hsy.R.inc(46000);assertNotNull(exception);
        __CLR4_5_2zhkzhklvha7hsy.R.inc(46001);assertEquals(WRONG_EXCEPTION_MESSAGE, EXCEPTION_MESSAGE, exception.getMessage());
        
        __CLR4_5_2zhkzhklvha7hsy.R.inc(46002);final Throwable cause = exception.getCause();
        __CLR4_5_2zhkzhklvha7hsy.R.inc(46003);assertNotNull(cause);
        __CLR4_5_2zhkzhklvha7hsy.R.inc(46004);assertEquals(WRONG_CAUSE_MESSAGE, CAUSE_MESSAGE, cause.getMessage());
    }finally{__CLR4_5_2zhkzhklvha7hsy.R.flushNeeded();}}
    
    @Test
    public void testWithoutCause() throws Exception {__CLR4_5_2zhkzhklvha7hsy.R.globalSliceStart(getClass().getName(),46005);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2dv5uzezhx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2zhkzhklvha7hsy.R.rethrow($CLV_t2$);}finally{__CLR4_5_2zhkzhklvha7hsy.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.exception.CloneFailedExceptionTest.testWithoutCause",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),46005,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2dv5uzezhx() throws Exception{try{__CLR4_5_2zhkzhklvha7hsy.R.inc(46005);
        __CLR4_5_2zhkzhklvha7hsy.R.inc(46006);final Exception exception = new CloneFailedException(EXCEPTION_MESSAGE);
        __CLR4_5_2zhkzhklvha7hsy.R.inc(46007);assertNotNull(exception);
        __CLR4_5_2zhkzhklvha7hsy.R.inc(46008);assertEquals(WRONG_EXCEPTION_MESSAGE, EXCEPTION_MESSAGE, exception.getMessage());
        
        __CLR4_5_2zhkzhklvha7hsy.R.inc(46009);final Throwable cause = exception.getCause();
        __CLR4_5_2zhkzhklvha7hsy.R.inc(46010);assertNull(cause);
    }finally{__CLR4_5_2zhkzhklvha7hsy.R.flushNeeded();}}
    
    @Test
    public void testWithoutMessage() throws Exception {__CLR4_5_2zhkzhklvha7hsy.R.globalSliceStart(getClass().getName(),46011);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23d36uwzi3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2zhkzhklvha7hsy.R.rethrow($CLV_t2$);}finally{__CLR4_5_2zhkzhklvha7hsy.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.exception.CloneFailedExceptionTest.testWithoutMessage",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),46011,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23d36uwzi3() throws Exception{try{__CLR4_5_2zhkzhklvha7hsy.R.inc(46011);
        __CLR4_5_2zhkzhklvha7hsy.R.inc(46012);final Exception exception = new CloneFailedException(generateCause());
        __CLR4_5_2zhkzhklvha7hsy.R.inc(46013);assertNotNull(exception);
        __CLR4_5_2zhkzhklvha7hsy.R.inc(46014);assertNotNull(exception.getMessage());
        
        __CLR4_5_2zhkzhklvha7hsy.R.inc(46015);final Throwable cause = exception.getCause();
        __CLR4_5_2zhkzhklvha7hsy.R.inc(46016);assertNotNull(cause);
        __CLR4_5_2zhkzhklvha7hsy.R.inc(46017);assertEquals(WRONG_CAUSE_MESSAGE, CAUSE_MESSAGE, cause.getMessage());
    }finally{__CLR4_5_2zhkzhklvha7hsy.R.flushNeeded();}}
}