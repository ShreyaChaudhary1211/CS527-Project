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
import org.junit.Before;
import org.junit.Test;

/**
 * JUnit tests for ContextedRuntimeException.
 */
public class ContextedRuntimeExceptionTest extends AbstractExceptionContextTest<ContextedRuntimeException> {static class __CLR4_5_2zjlzjllvha7hti{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172763741L,8589935092L,46112,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    
    @Override
    @Before
    public void setUp() throws Exception {try{__CLR4_5_2zjlzjllvha7hti.R.inc(46065);
        __CLR4_5_2zjlzjllvha7hti.R.inc(46066);exceptionContext = new ContextedRuntimeException(new Exception(TEST_MESSAGE));
        __CLR4_5_2zjlzjllvha7hti.R.inc(46067);super.setUp();
    }finally{__CLR4_5_2zjlzjllvha7hti.R.flushNeeded();}}

    @Test
    public void testContextedException() {__CLR4_5_2zjlzjllvha7hti.R.globalSliceStart(getClass().getName(),46068);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2bsrjayzjo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2zjlzjllvha7hti.R.rethrow($CLV_t2$);}finally{__CLR4_5_2zjlzjllvha7hti.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.exception.ContextedRuntimeExceptionTest.testContextedException",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),46068,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2bsrjayzjo(){try{__CLR4_5_2zjlzjllvha7hti.R.inc(46068);
        __CLR4_5_2zjlzjllvha7hti.R.inc(46069);exceptionContext = new ContextedRuntimeException();
        __CLR4_5_2zjlzjllvha7hti.R.inc(46070);final String message = exceptionContext.getMessage();
        __CLR4_5_2zjlzjllvha7hti.R.inc(46071);final String trace = ExceptionUtils.getStackTrace(exceptionContext);
        __CLR4_5_2zjlzjllvha7hti.R.inc(46072);assertTrue(trace.indexOf("ContextedException")>=0);
        __CLR4_5_2zjlzjllvha7hti.R.inc(46073);assertTrue(StringUtils.isEmpty(message));
    }finally{__CLR4_5_2zjlzjllvha7hti.R.flushNeeded();}}

    @Test
    public void testContextedExceptionString() {__CLR4_5_2zjlzjllvha7hti.R.globalSliceStart(getClass().getName(),46074);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_29iknn9zju();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2zjlzjllvha7hti.R.rethrow($CLV_t2$);}finally{__CLR4_5_2zjlzjllvha7hti.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.exception.ContextedRuntimeExceptionTest.testContextedExceptionString",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),46074,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_29iknn9zju(){try{__CLR4_5_2zjlzjllvha7hti.R.inc(46074);
        __CLR4_5_2zjlzjllvha7hti.R.inc(46075);exceptionContext = new ContextedRuntimeException(TEST_MESSAGE);
        __CLR4_5_2zjlzjllvha7hti.R.inc(46076);assertEquals(TEST_MESSAGE, exceptionContext.getMessage());
        
        __CLR4_5_2zjlzjllvha7hti.R.inc(46077);final String trace = ExceptionUtils.getStackTrace(exceptionContext);
        __CLR4_5_2zjlzjllvha7hti.R.inc(46078);assertTrue(trace.indexOf(TEST_MESSAGE)>=0);
    }finally{__CLR4_5_2zjlzjllvha7hti.R.flushNeeded();}}

    @Test
    public void testContextedExceptionThrowable() {__CLR4_5_2zjlzjllvha7hti.R.globalSliceStart(getClass().getName(),46079);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2b0gvhozjz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2zjlzjllvha7hti.R.rethrow($CLV_t2$);}finally{__CLR4_5_2zjlzjllvha7hti.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.exception.ContextedRuntimeExceptionTest.testContextedExceptionThrowable",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),46079,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2b0gvhozjz(){try{__CLR4_5_2zjlzjllvha7hti.R.inc(46079);
        __CLR4_5_2zjlzjllvha7hti.R.inc(46080);exceptionContext = new ContextedRuntimeException(new Exception(TEST_MESSAGE));
        __CLR4_5_2zjlzjllvha7hti.R.inc(46081);final String message = exceptionContext.getMessage();
        __CLR4_5_2zjlzjllvha7hti.R.inc(46082);final String trace = ExceptionUtils.getStackTrace(exceptionContext);
        __CLR4_5_2zjlzjllvha7hti.R.inc(46083);assertTrue(trace.indexOf("ContextedException")>=0);
        __CLR4_5_2zjlzjllvha7hti.R.inc(46084);assertTrue(trace.indexOf(TEST_MESSAGE)>=0);
        __CLR4_5_2zjlzjllvha7hti.R.inc(46085);assertTrue(message.indexOf(TEST_MESSAGE)>=0);
    }finally{__CLR4_5_2zjlzjllvha7hti.R.flushNeeded();}}

    @Test
    public void testContextedExceptionStringThrowable() {__CLR4_5_2zjlzjllvha7hti.R.globalSliceStart(getClass().getName(),46086);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2j1qehvzk6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2zjlzjllvha7hti.R.rethrow($CLV_t2$);}finally{__CLR4_5_2zjlzjllvha7hti.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.exception.ContextedRuntimeExceptionTest.testContextedExceptionStringThrowable",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),46086,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2j1qehvzk6(){try{__CLR4_5_2zjlzjllvha7hti.R.inc(46086);
        __CLR4_5_2zjlzjllvha7hti.R.inc(46087);exceptionContext = new ContextedRuntimeException(TEST_MESSAGE_2, new Exception(TEST_MESSAGE));
        __CLR4_5_2zjlzjllvha7hti.R.inc(46088);final String message = exceptionContext.getMessage();
        __CLR4_5_2zjlzjllvha7hti.R.inc(46089);final String trace = ExceptionUtils.getStackTrace(exceptionContext);
        __CLR4_5_2zjlzjllvha7hti.R.inc(46090);assertTrue(trace.indexOf("ContextedException")>=0);
        __CLR4_5_2zjlzjllvha7hti.R.inc(46091);assertTrue(trace.indexOf(TEST_MESSAGE)>=0);
        __CLR4_5_2zjlzjllvha7hti.R.inc(46092);assertTrue(trace.indexOf(TEST_MESSAGE_2)>=0);
        __CLR4_5_2zjlzjllvha7hti.R.inc(46093);assertTrue(message.indexOf(TEST_MESSAGE_2)>=0);
    }finally{__CLR4_5_2zjlzjllvha7hti.R.flushNeeded();}}
    
    @Test
    public void testContextedExceptionStringThrowableContext() {__CLR4_5_2zjlzjllvha7hti.R.globalSliceStart(getClass().getName(),46094);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2z5npayzke();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2zjlzjllvha7hti.R.rethrow($CLV_t2$);}finally{__CLR4_5_2zjlzjllvha7hti.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.exception.ContextedRuntimeExceptionTest.testContextedExceptionStringThrowableContext",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),46094,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2z5npayzke(){try{__CLR4_5_2zjlzjllvha7hti.R.inc(46094);
        // Use an anonymous subclass to make sure users can provide custom implementations
        __CLR4_5_2zjlzjllvha7hti.R.inc(46095);exceptionContext = new ContextedRuntimeException(TEST_MESSAGE_2, new Exception(TEST_MESSAGE), 
        new DefaultExceptionContext() {private static final long serialVersionUID = 1L;});
        __CLR4_5_2zjlzjllvha7hti.R.inc(46096);final String message = exceptionContext.getMessage();
        __CLR4_5_2zjlzjllvha7hti.R.inc(46097);final String trace = ExceptionUtils.getStackTrace(exceptionContext);
        __CLR4_5_2zjlzjllvha7hti.R.inc(46098);assertTrue(trace.indexOf("ContextedException")>=0);
        __CLR4_5_2zjlzjllvha7hti.R.inc(46099);assertTrue(trace.indexOf(TEST_MESSAGE)>=0);
        __CLR4_5_2zjlzjllvha7hti.R.inc(46100);assertTrue(trace.indexOf(TEST_MESSAGE_2)>=0);
        __CLR4_5_2zjlzjllvha7hti.R.inc(46101);assertTrue(message.indexOf(TEST_MESSAGE_2)>=0);
    }finally{__CLR4_5_2zjlzjllvha7hti.R.flushNeeded();}}

    @Test
    public void testNullExceptionPassing() {__CLR4_5_2zjlzjllvha7hti.R.globalSliceStart(getClass().getName(),46102);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n2zwo2zkm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2zjlzjllvha7hti.R.rethrow($CLV_t2$);}finally{__CLR4_5_2zjlzjllvha7hti.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.exception.ContextedRuntimeExceptionTest.testNullExceptionPassing",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),46102,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n2zwo2zkm(){try{__CLR4_5_2zjlzjllvha7hti.R.inc(46102);
        __CLR4_5_2zjlzjllvha7hti.R.inc(46103);exceptionContext = new ContextedRuntimeException(TEST_MESSAGE_2, new Exception(TEST_MESSAGE), null)
        .addContextValue("test1", null)
        .addContextValue("test2", "some value")
        .addContextValue("test Date", new Date())
        .addContextValue("test Nbr", Integer.valueOf(5))
        .addContextValue("test Poorly written obj", new ObjectWithFaultyToString());
        
        __CLR4_5_2zjlzjllvha7hti.R.inc(46104);final String message = exceptionContext.getMessage();
        __CLR4_5_2zjlzjllvha7hti.R.inc(46105);assertTrue(message != null);
    }finally{__CLR4_5_2zjlzjllvha7hti.R.flushNeeded();}}

    @Test
    public void testRawMessage() {__CLR4_5_2zjlzjllvha7hti.R.globalSliceStart(getClass().getName(),46106);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_25rv2zszkq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2zjlzjllvha7hti.R.rethrow($CLV_t2$);}finally{__CLR4_5_2zjlzjllvha7hti.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.exception.ContextedRuntimeExceptionTest.testRawMessage",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),46106,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_25rv2zszkq(){try{__CLR4_5_2zjlzjllvha7hti.R.inc(46106);
        __CLR4_5_2zjlzjllvha7hti.R.inc(46107);assertEquals(Exception.class.getName() + ": " + TEST_MESSAGE, exceptionContext.getRawMessage());
        __CLR4_5_2zjlzjllvha7hti.R.inc(46108);exceptionContext = new ContextedRuntimeException(TEST_MESSAGE_2, new Exception(TEST_MESSAGE), new DefaultExceptionContext());
        __CLR4_5_2zjlzjllvha7hti.R.inc(46109);assertEquals(TEST_MESSAGE_2, exceptionContext.getRawMessage());
        __CLR4_5_2zjlzjllvha7hti.R.inc(46110);exceptionContext = new ContextedRuntimeException(null, new Exception(TEST_MESSAGE), new DefaultExceptionContext());
        __CLR4_5_2zjlzjllvha7hti.R.inc(46111);assertNull(exceptionContext.getRawMessage());
    }finally{__CLR4_5_2zjlzjllvha7hti.R.flushNeeded();}}
}
