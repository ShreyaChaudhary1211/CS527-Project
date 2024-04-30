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
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.util.List;

import org.apache.commons.lang3.test.NotVisibleExceptionFactory;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Tests {@link org.apache.commons.lang3.exception.ExceptionUtils}.
 * @since 1.0
 */
public class ExceptionUtilsTest {static class __CLR4_5_2zl2zl2lvha7hu8{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172763741L,8589935092L,46447,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    
    private NestableException nested;
    private Throwable withCause;
    private Throwable withoutCause;
    private Throwable jdkNoCause;
    private ExceptionWithCause cyclicCause;
    private Throwable notVisibleException;


    @Before
    public void setUp() {try{__CLR4_5_2zl2zl2lvha7hu8.R.inc(46118);
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46119);withoutCause = createExceptionWithoutCause();
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46120);nested = new NestableException(withoutCause);
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46121);withCause = new ExceptionWithCause(nested);
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46122);jdkNoCause = new NullPointerException();
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46123);final ExceptionWithCause a = new ExceptionWithCause(null);
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46124);final ExceptionWithCause b = new ExceptionWithCause(a);
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46125);a.setCause(b);
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46126);cyclicCause = new ExceptionWithCause(a);
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46127);notVisibleException = NotVisibleExceptionFactory.createException(withoutCause);
    }finally{__CLR4_5_2zl2zl2lvha7hu8.R.flushNeeded();}}


    @After
    public void tearDown() throws Exception {try{__CLR4_5_2zl2zl2lvha7hu8.R.inc(46128);
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46129);withoutCause = null;
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46130);nested = null;
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46131);withCause = null;
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46132);jdkNoCause = null;
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46133);cyclicCause = null;
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46134);notVisibleException = null;
    }finally{__CLR4_5_2zl2zl2lvha7hu8.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    private Throwable createExceptionWithoutCause() {try{__CLR4_5_2zl2zl2lvha7hu8.R.inc(46135);
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46136);try {
            __CLR4_5_2zl2zl2lvha7hu8.R.inc(46137);throw new ExceptionWithoutCause();
        } catch (final Throwable t) {
            __CLR4_5_2zl2zl2lvha7hu8.R.inc(46138);return t;
        }
    }finally{__CLR4_5_2zl2zl2lvha7hu8.R.flushNeeded();}}

    private Throwable createExceptionWithCause() {try{__CLR4_5_2zl2zl2lvha7hu8.R.inc(46139);
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46140);try {
            __CLR4_5_2zl2zl2lvha7hu8.R.inc(46141);try {
                __CLR4_5_2zl2zl2lvha7hu8.R.inc(46142);throw new ExceptionWithCause(createExceptionWithoutCause());
            } catch (final Throwable t) {
                __CLR4_5_2zl2zl2lvha7hu8.R.inc(46143);throw new ExceptionWithCause(t);
            }
        } catch (final Throwable t) {
            __CLR4_5_2zl2zl2lvha7hu8.R.inc(46144);return t;
        }
    }finally{__CLR4_5_2zl2zl2lvha7hu8.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    
    @Test
    public void testConstructor() {__CLR4_5_2zl2zl2lvha7hu8.R.globalSliceStart(getClass().getName(),46145);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2uefs8hzlt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2zl2zl2lvha7hu8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2zl2zl2lvha7hu8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.exception.ExceptionUtilsTest.testConstructor",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),46145,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2uefs8hzlt(){try{__CLR4_5_2zl2zl2lvha7hu8.R.inc(46145);
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46146);assertNotNull(new ExceptionUtils());
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46147);final Constructor<?>[] cons = ExceptionUtils.class.getDeclaredConstructors();
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46148);assertEquals(1, cons.length);
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46149);assertTrue(Modifier.isPublic(cons[0].getModifiers()));
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46150);assertTrue(Modifier.isPublic(ExceptionUtils.class.getModifiers()));
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46151);assertFalse(Modifier.isFinal(ExceptionUtils.class.getModifiers()));
    }finally{__CLR4_5_2zl2zl2lvha7hu8.R.flushNeeded();}}
    
    //-----------------------------------------------------------------------
    @SuppressWarnings("deprecation") // Specifically tests the deprecated methods
    @Test
    public void testGetCause_Throwable() {__CLR4_5_2zl2zl2lvha7hu8.R.globalSliceStart(getClass().getName(),46152);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2aiond9zm0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2zl2zl2lvha7hu8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2zl2zl2lvha7hu8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.exception.ExceptionUtilsTest.testGetCause_Throwable",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),46152,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2aiond9zm0(){try{__CLR4_5_2zl2zl2lvha7hu8.R.inc(46152);
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46153);assertSame(null, ExceptionUtils.getCause(null));
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46154);assertSame(null, ExceptionUtils.getCause(withoutCause));
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46155);assertSame(withoutCause, ExceptionUtils.getCause(nested));
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46156);assertSame(nested, ExceptionUtils.getCause(withCause));
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46157);assertSame(null, ExceptionUtils.getCause(jdkNoCause));
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46158);assertSame(cyclicCause.getCause(), ExceptionUtils.getCause(cyclicCause));
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46159);assertSame(cyclicCause.getCause().getCause(), ExceptionUtils.getCause(cyclicCause.getCause()));
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46160);assertSame(cyclicCause.getCause(), ExceptionUtils.getCause(cyclicCause.getCause().getCause()));
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46161);assertSame(withoutCause, ExceptionUtils.getCause(notVisibleException));
    }finally{__CLR4_5_2zl2zl2lvha7hu8.R.flushNeeded();}}

    @SuppressWarnings("deprecation") // Specifically tests the deprecated methods
    @Test
    public void testGetCause_ThrowableArray() {__CLR4_5_2zl2zl2lvha7hu8.R.globalSliceStart(getClass().getName(),46162);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27jkp9izma();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2zl2zl2lvha7hu8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2zl2zl2lvha7hu8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.exception.ExceptionUtilsTest.testGetCause_ThrowableArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),46162,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27jkp9izma(){try{__CLR4_5_2zl2zl2lvha7hu8.R.inc(46162);
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46163);assertSame(null, ExceptionUtils.getCause(null, null));
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46164);assertSame(null, ExceptionUtils.getCause(null, new String[0]));

        // not known type, so match on supplied method names
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46165);assertSame(nested, ExceptionUtils.getCause(withCause, null));  // default names
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46166);assertSame(null, ExceptionUtils.getCause(withCause, new String[0]));
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46167);assertSame(null, ExceptionUtils.getCause(withCause, new String[] {null}));
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46168);assertSame(nested, ExceptionUtils.getCause(withCause, new String[] {"getCause"}));
        
        // not known type, so match on supplied method names
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46169);assertSame(null, ExceptionUtils.getCause(withoutCause, null));
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46170);assertSame(null, ExceptionUtils.getCause(withoutCause, new String[0]));
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46171);assertSame(null, ExceptionUtils.getCause(withoutCause, new String[] {null}));
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46172);assertSame(null, ExceptionUtils.getCause(withoutCause, new String[] {"getCause"}));
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46173);assertSame(null, ExceptionUtils.getCause(withoutCause, new String[] {"getTargetException"}));
    }finally{__CLR4_5_2zl2zl2lvha7hu8.R.flushNeeded();}}

    @Test
    public void testGetRootCause_Throwable() {__CLR4_5_2zl2zl2lvha7hu8.R.globalSliceStart(getClass().getName(),46174);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2o8zwdxzmm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2zl2zl2lvha7hu8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2zl2zl2lvha7hu8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.exception.ExceptionUtilsTest.testGetRootCause_Throwable",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),46174,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2o8zwdxzmm(){try{__CLR4_5_2zl2zl2lvha7hu8.R.inc(46174);
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46175);assertSame(null, ExceptionUtils.getRootCause(null));
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46176);assertSame(null, ExceptionUtils.getRootCause(withoutCause));
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46177);assertSame(withoutCause, ExceptionUtils.getRootCause(nested));
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46178);assertSame(withoutCause, ExceptionUtils.getRootCause(withCause));
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46179);assertSame(null, ExceptionUtils.getRootCause(jdkNoCause));
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46180);assertSame(cyclicCause.getCause().getCause(), ExceptionUtils.getRootCause(cyclicCause));
    }finally{__CLR4_5_2zl2zl2lvha7hu8.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testGetThrowableCount_Throwable() {__CLR4_5_2zl2zl2lvha7hu8.R.globalSliceStart(getClass().getName(),46181);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hbqm6zzmt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2zl2zl2lvha7hu8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2zl2zl2lvha7hu8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.exception.ExceptionUtilsTest.testGetThrowableCount_Throwable",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),46181,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hbqm6zzmt(){try{__CLR4_5_2zl2zl2lvha7hu8.R.inc(46181);
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46182);assertEquals(0, ExceptionUtils.getThrowableCount(null));
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46183);assertEquals(1, ExceptionUtils.getThrowableCount(withoutCause));
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46184);assertEquals(2, ExceptionUtils.getThrowableCount(nested));
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46185);assertEquals(3, ExceptionUtils.getThrowableCount(withCause));
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46186);assertEquals(1, ExceptionUtils.getThrowableCount(jdkNoCause));
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46187);assertEquals(3, ExceptionUtils.getThrowableCount(cyclicCause));
    }finally{__CLR4_5_2zl2zl2lvha7hu8.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testGetThrowables_Throwable_null() {__CLR4_5_2zl2zl2lvha7hu8.R.globalSliceStart(getClass().getName(),46188);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2qrgt63zn0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2zl2zl2lvha7hu8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2zl2zl2lvha7hu8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.exception.ExceptionUtilsTest.testGetThrowables_Throwable_null",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),46188,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2qrgt63zn0(){try{__CLR4_5_2zl2zl2lvha7hu8.R.inc(46188);
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46189);assertEquals(0, ExceptionUtils.getThrowables(null).length);
    }finally{__CLR4_5_2zl2zl2lvha7hu8.R.flushNeeded();}}

    @Test
    public void testGetThrowables_Throwable_withoutCause() {__CLR4_5_2zl2zl2lvha7hu8.R.globalSliceStart(getClass().getName(),46190);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2yh7i1bzn2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2zl2zl2lvha7hu8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2zl2zl2lvha7hu8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.exception.ExceptionUtilsTest.testGetThrowables_Throwable_withoutCause",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),46190,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2yh7i1bzn2(){try{__CLR4_5_2zl2zl2lvha7hu8.R.inc(46190);
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46191);final Throwable[] throwables = ExceptionUtils.getThrowables(withoutCause);
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46192);assertEquals(1, throwables.length);
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46193);assertSame(withoutCause, throwables[0]);
    }finally{__CLR4_5_2zl2zl2lvha7hu8.R.flushNeeded();}}

    @Test
    public void testGetThrowables_Throwable_nested() {__CLR4_5_2zl2zl2lvha7hu8.R.globalSliceStart(getClass().getName(),46194);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2c8m0p1zn6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2zl2zl2lvha7hu8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2zl2zl2lvha7hu8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.exception.ExceptionUtilsTest.testGetThrowables_Throwable_nested",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),46194,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2c8m0p1zn6(){try{__CLR4_5_2zl2zl2lvha7hu8.R.inc(46194);
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46195);final Throwable[] throwables = ExceptionUtils.getThrowables(nested);
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46196);assertEquals(2, throwables.length);
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46197);assertSame(nested, throwables[0]);
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46198);assertSame(withoutCause, throwables[1]);
    }finally{__CLR4_5_2zl2zl2lvha7hu8.R.flushNeeded();}}

    @Test
    public void testGetThrowables_Throwable_withCause() {__CLR4_5_2zl2zl2lvha7hu8.R.globalSliceStart(getClass().getName(),46199);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26s4o2lznb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2zl2zl2lvha7hu8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2zl2zl2lvha7hu8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.exception.ExceptionUtilsTest.testGetThrowables_Throwable_withCause",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),46199,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26s4o2lznb(){try{__CLR4_5_2zl2zl2lvha7hu8.R.inc(46199);
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46200);final Throwable[] throwables = ExceptionUtils.getThrowables(withCause);
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46201);assertEquals(3, throwables.length);
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46202);assertSame(withCause, throwables[0]);
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46203);assertSame(nested, throwables[1]);
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46204);assertSame(withoutCause, throwables[2]);
    }finally{__CLR4_5_2zl2zl2lvha7hu8.R.flushNeeded();}}

    @Test
    public void testGetThrowables_Throwable_jdkNoCause() {__CLR4_5_2zl2zl2lvha7hu8.R.globalSliceStart(getClass().getName(),46205);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2wp2h39znh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2zl2zl2lvha7hu8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2zl2zl2lvha7hu8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.exception.ExceptionUtilsTest.testGetThrowables_Throwable_jdkNoCause",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),46205,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2wp2h39znh(){try{__CLR4_5_2zl2zl2lvha7hu8.R.inc(46205);
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46206);final Throwable[] throwables = ExceptionUtils.getThrowables(jdkNoCause);
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46207);assertEquals(1, throwables.length);
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46208);assertSame(jdkNoCause, throwables[0]);
    }finally{__CLR4_5_2zl2zl2lvha7hu8.R.flushNeeded();}}

    @Test
    public void testGetThrowables_Throwable_recursiveCause() {__CLR4_5_2zl2zl2lvha7hu8.R.globalSliceStart(getClass().getName(),46209);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2w1pjffznl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2zl2zl2lvha7hu8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2zl2zl2lvha7hu8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.exception.ExceptionUtilsTest.testGetThrowables_Throwable_recursiveCause",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),46209,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2w1pjffznl(){try{__CLR4_5_2zl2zl2lvha7hu8.R.inc(46209);
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46210);final Throwable[] throwables = ExceptionUtils.getThrowables(cyclicCause);
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46211);assertEquals(3, throwables.length);
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46212);assertSame(cyclicCause, throwables[0]);
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46213);assertSame(cyclicCause.getCause(), throwables[1]);
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46214);assertSame(cyclicCause.getCause().getCause(), throwables[2]);
    }finally{__CLR4_5_2zl2zl2lvha7hu8.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testGetThrowableList_Throwable_null() {__CLR4_5_2zl2zl2lvha7hu8.R.globalSliceStart(getClass().getName(),46215);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2t31jouznr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2zl2zl2lvha7hu8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2zl2zl2lvha7hu8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.exception.ExceptionUtilsTest.testGetThrowableList_Throwable_null",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),46215,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2t31jouznr(){try{__CLR4_5_2zl2zl2lvha7hu8.R.inc(46215);
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46216);final List<?> throwables = ExceptionUtils.getThrowableList(null);
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46217);assertEquals(0, throwables.size());
    }finally{__CLR4_5_2zl2zl2lvha7hu8.R.flushNeeded();}}

    @Test
    public void testGetThrowableList_Throwable_withoutCause() {__CLR4_5_2zl2zl2lvha7hu8.R.globalSliceStart(getClass().getName(),46218);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2uzjmesznu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2zl2zl2lvha7hu8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2zl2zl2lvha7hu8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.exception.ExceptionUtilsTest.testGetThrowableList_Throwable_withoutCause",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),46218,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2uzjmesznu(){try{__CLR4_5_2zl2zl2lvha7hu8.R.inc(46218);
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46219);final List<?> throwables = ExceptionUtils.getThrowableList(withoutCause);
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46220);assertEquals(1, throwables.size());
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46221);assertSame(withoutCause, throwables.get(0));
    }finally{__CLR4_5_2zl2zl2lvha7hu8.R.flushNeeded();}}

    @Test
    public void testGetThrowableList_Throwable_nested() {__CLR4_5_2zl2zl2lvha7hu8.R.globalSliceStart(getClass().getName(),46222);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gtg8lazny();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2zl2zl2lvha7hu8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2zl2zl2lvha7hu8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.exception.ExceptionUtilsTest.testGetThrowableList_Throwable_nested",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),46222,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gtg8lazny(){try{__CLR4_5_2zl2zl2lvha7hu8.R.inc(46222);
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46223);final List<?> throwables = ExceptionUtils.getThrowableList(nested);
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46224);assertEquals(2, throwables.size());
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46225);assertSame(nested, throwables.get(0));
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46226);assertSame(withoutCause, throwables.get(1));
    }finally{__CLR4_5_2zl2zl2lvha7hu8.R.flushNeeded();}}

    @Test
    public void testGetThrowableList_Throwable_withCause() {__CLR4_5_2zl2zl2lvha7hu8.R.globalSliceStart(getClass().getName(),46227);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2x1dvqzo3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2zl2zl2lvha7hu8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2zl2zl2lvha7hu8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.exception.ExceptionUtilsTest.testGetThrowableList_Throwable_withCause",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),46227,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2x1dvqzo3(){try{__CLR4_5_2zl2zl2lvha7hu8.R.inc(46227);
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46228);final List<?> throwables = ExceptionUtils.getThrowableList(withCause);
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46229);assertEquals(3, throwables.size());
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46230);assertSame(withCause, throwables.get(0));
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46231);assertSame(nested, throwables.get(1));
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46232);assertSame(withoutCause, throwables.get(2));
    }finally{__CLR4_5_2zl2zl2lvha7hu8.R.flushNeeded();}}

    @Test
    public void testGetThrowableList_Throwable_jdkNoCause() {__CLR4_5_2zl2zl2lvha7hu8.R.globalSliceStart(getClass().getName(),46233);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2cr629qzo9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2zl2zl2lvha7hu8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2zl2zl2lvha7hu8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.exception.ExceptionUtilsTest.testGetThrowableList_Throwable_jdkNoCause",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),46233,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2cr629qzo9(){try{__CLR4_5_2zl2zl2lvha7hu8.R.inc(46233);
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46234);final List<?> throwables = ExceptionUtils.getThrowableList(jdkNoCause);
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46235);assertEquals(1, throwables.size());
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46236);assertSame(jdkNoCause, throwables.get(0));
    }finally{__CLR4_5_2zl2zl2lvha7hu8.R.flushNeeded();}}

    @Test
    public void testGetThrowableList_Throwable_recursiveCause() {__CLR4_5_2zl2zl2lvha7hu8.R.globalSliceStart(getClass().getName(),46237);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2avymn2zod();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2zl2zl2lvha7hu8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2zl2zl2lvha7hu8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.exception.ExceptionUtilsTest.testGetThrowableList_Throwable_recursiveCause",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),46237,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2avymn2zod(){try{__CLR4_5_2zl2zl2lvha7hu8.R.inc(46237);
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46238);final List<?> throwables = ExceptionUtils.getThrowableList(cyclicCause);
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46239);assertEquals(3, throwables.size());
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46240);assertSame(cyclicCause, throwables.get(0));
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46241);assertSame(cyclicCause.getCause(), throwables.get(1));
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46242);assertSame(cyclicCause.getCause().getCause(), throwables.get(2));
    }finally{__CLR4_5_2zl2zl2lvha7hu8.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testIndexOf_ThrowableClass() {__CLR4_5_2zl2zl2lvha7hu8.R.globalSliceStart(getClass().getName(),46243);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2mh2hk7zoj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2zl2zl2lvha7hu8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2zl2zl2lvha7hu8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.exception.ExceptionUtilsTest.testIndexOf_ThrowableClass",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),46243,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2mh2hk7zoj(){try{__CLR4_5_2zl2zl2lvha7hu8.R.inc(46243);
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46244);assertEquals(-1, ExceptionUtils.indexOfThrowable(null, null));
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46245);assertEquals(-1, ExceptionUtils.indexOfThrowable(null, NestableException.class));
        
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46246);assertEquals(-1, ExceptionUtils.indexOfThrowable(withoutCause, null));
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46247);assertEquals(-1, ExceptionUtils.indexOfThrowable(withoutCause, ExceptionWithCause.class));
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46248);assertEquals(-1, ExceptionUtils.indexOfThrowable(withoutCause, NestableException.class));
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46249);assertEquals(0, ExceptionUtils.indexOfThrowable(withoutCause, ExceptionWithoutCause.class));
        
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46250);assertEquals(-1, ExceptionUtils.indexOfThrowable(nested, null));
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46251);assertEquals(-1, ExceptionUtils.indexOfThrowable(nested, ExceptionWithCause.class));
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46252);assertEquals(0, ExceptionUtils.indexOfThrowable(nested, NestableException.class));
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46253);assertEquals(1, ExceptionUtils.indexOfThrowable(nested, ExceptionWithoutCause.class));
        
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46254);assertEquals(-1, ExceptionUtils.indexOfThrowable(withCause, null));
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46255);assertEquals(0, ExceptionUtils.indexOfThrowable(withCause, ExceptionWithCause.class));
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46256);assertEquals(1, ExceptionUtils.indexOfThrowable(withCause, NestableException.class));
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46257);assertEquals(2, ExceptionUtils.indexOfThrowable(withCause, ExceptionWithoutCause.class));
        
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46258);assertEquals(-1, ExceptionUtils.indexOfThrowable(withCause, Exception.class));
    }finally{__CLR4_5_2zl2zl2lvha7hu8.R.flushNeeded();}}

    @Test
    public void testIndexOf_ThrowableClassInt() {__CLR4_5_2zl2zl2lvha7hu8.R.globalSliceStart(getClass().getName(),46259);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2yseihizoz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2zl2zl2lvha7hu8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2zl2zl2lvha7hu8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.exception.ExceptionUtilsTest.testIndexOf_ThrowableClassInt",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),46259,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2yseihizoz(){try{__CLR4_5_2zl2zl2lvha7hu8.R.inc(46259);
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46260);assertEquals(-1, ExceptionUtils.indexOfThrowable(null, null, 0));
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46261);assertEquals(-1, ExceptionUtils.indexOfThrowable(null, NestableException.class, 0));
        
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46262);assertEquals(-1, ExceptionUtils.indexOfThrowable(withoutCause, null));
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46263);assertEquals(-1, ExceptionUtils.indexOfThrowable(withoutCause, ExceptionWithCause.class, 0));
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46264);assertEquals(-1, ExceptionUtils.indexOfThrowable(withoutCause, NestableException.class, 0));
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46265);assertEquals(0, ExceptionUtils.indexOfThrowable(withoutCause, ExceptionWithoutCause.class, 0));
        
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46266);assertEquals(-1, ExceptionUtils.indexOfThrowable(nested, null, 0));
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46267);assertEquals(-1, ExceptionUtils.indexOfThrowable(nested, ExceptionWithCause.class, 0));
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46268);assertEquals(0, ExceptionUtils.indexOfThrowable(nested, NestableException.class, 0));
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46269);assertEquals(1, ExceptionUtils.indexOfThrowable(nested, ExceptionWithoutCause.class, 0));
        
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46270);assertEquals(-1, ExceptionUtils.indexOfThrowable(withCause, null));
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46271);assertEquals(0, ExceptionUtils.indexOfThrowable(withCause, ExceptionWithCause.class, 0));
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46272);assertEquals(1, ExceptionUtils.indexOfThrowable(withCause, NestableException.class, 0));
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46273);assertEquals(2, ExceptionUtils.indexOfThrowable(withCause, ExceptionWithoutCause.class, 0));

        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46274);assertEquals(0, ExceptionUtils.indexOfThrowable(withCause, ExceptionWithCause.class, -1));
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46275);assertEquals(0, ExceptionUtils.indexOfThrowable(withCause, ExceptionWithCause.class, 0));
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46276);assertEquals(-1, ExceptionUtils.indexOfThrowable(withCause, ExceptionWithCause.class, 1));
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46277);assertEquals(-1, ExceptionUtils.indexOfThrowable(withCause, ExceptionWithCause.class, 9));
        
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46278);assertEquals(-1, ExceptionUtils.indexOfThrowable(withCause, Exception.class, 0));
    }finally{__CLR4_5_2zl2zl2lvha7hu8.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testIndexOfType_ThrowableClass() {__CLR4_5_2zl2zl2lvha7hu8.R.globalSliceStart(getClass().getName(),46279);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2fjmeszzpj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2zl2zl2lvha7hu8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2zl2zl2lvha7hu8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.exception.ExceptionUtilsTest.testIndexOfType_ThrowableClass",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),46279,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2fjmeszzpj(){try{__CLR4_5_2zl2zl2lvha7hu8.R.inc(46279);
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46280);assertEquals(-1, ExceptionUtils.indexOfType(null, null));
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46281);assertEquals(-1, ExceptionUtils.indexOfType(null, NestableException.class));
        
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46282);assertEquals(-1, ExceptionUtils.indexOfType(withoutCause, null));
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46283);assertEquals(-1, ExceptionUtils.indexOfType(withoutCause, ExceptionWithCause.class));
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46284);assertEquals(-1, ExceptionUtils.indexOfType(withoutCause, NestableException.class));
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46285);assertEquals(0, ExceptionUtils.indexOfType(withoutCause, ExceptionWithoutCause.class));
        
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46286);assertEquals(-1, ExceptionUtils.indexOfType(nested, null));
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46287);assertEquals(-1, ExceptionUtils.indexOfType(nested, ExceptionWithCause.class));
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46288);assertEquals(0, ExceptionUtils.indexOfType(nested, NestableException.class));
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46289);assertEquals(1, ExceptionUtils.indexOfType(nested, ExceptionWithoutCause.class));
        
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46290);assertEquals(-1, ExceptionUtils.indexOfType(withCause, null));
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46291);assertEquals(0, ExceptionUtils.indexOfType(withCause, ExceptionWithCause.class));
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46292);assertEquals(1, ExceptionUtils.indexOfType(withCause, NestableException.class));
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46293);assertEquals(2, ExceptionUtils.indexOfType(withCause, ExceptionWithoutCause.class));
        
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46294);assertEquals(0, ExceptionUtils.indexOfType(withCause, Exception.class));
    }finally{__CLR4_5_2zl2zl2lvha7hu8.R.flushNeeded();}}

    @Test
    public void testIndexOfType_ThrowableClassInt() {__CLR4_5_2zl2zl2lvha7hu8.R.globalSliceStart(getClass().getName(),46295);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27ra500zpz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2zl2zl2lvha7hu8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2zl2zl2lvha7hu8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.exception.ExceptionUtilsTest.testIndexOfType_ThrowableClassInt",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),46295,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27ra500zpz(){try{__CLR4_5_2zl2zl2lvha7hu8.R.inc(46295);
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46296);assertEquals(-1, ExceptionUtils.indexOfType(null, null, 0));
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46297);assertEquals(-1, ExceptionUtils.indexOfType(null, NestableException.class, 0));
        
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46298);assertEquals(-1, ExceptionUtils.indexOfType(withoutCause, null));
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46299);assertEquals(-1, ExceptionUtils.indexOfType(withoutCause, ExceptionWithCause.class, 0));
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46300);assertEquals(-1, ExceptionUtils.indexOfType(withoutCause, NestableException.class, 0));
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46301);assertEquals(0, ExceptionUtils.indexOfType(withoutCause, ExceptionWithoutCause.class, 0));
        
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46302);assertEquals(-1, ExceptionUtils.indexOfType(nested, null, 0));
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46303);assertEquals(-1, ExceptionUtils.indexOfType(nested, ExceptionWithCause.class, 0));
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46304);assertEquals(0, ExceptionUtils.indexOfType(nested, NestableException.class, 0));
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46305);assertEquals(1, ExceptionUtils.indexOfType(nested, ExceptionWithoutCause.class, 0));
        
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46306);assertEquals(-1, ExceptionUtils.indexOfType(withCause, null));
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46307);assertEquals(0, ExceptionUtils.indexOfType(withCause, ExceptionWithCause.class, 0));
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46308);assertEquals(1, ExceptionUtils.indexOfType(withCause, NestableException.class, 0));
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46309);assertEquals(2, ExceptionUtils.indexOfType(withCause, ExceptionWithoutCause.class, 0));

        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46310);assertEquals(0, ExceptionUtils.indexOfType(withCause, ExceptionWithCause.class, -1));
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46311);assertEquals(0, ExceptionUtils.indexOfType(withCause, ExceptionWithCause.class, 0));
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46312);assertEquals(-1, ExceptionUtils.indexOfType(withCause, ExceptionWithCause.class, 1));
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46313);assertEquals(-1, ExceptionUtils.indexOfType(withCause, ExceptionWithCause.class, 9));
        
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46314);assertEquals(0, ExceptionUtils.indexOfType(withCause, Exception.class, 0));
    }finally{__CLR4_5_2zl2zl2lvha7hu8.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testPrintRootCauseStackTrace_Throwable() throws Exception {__CLR4_5_2zl2zl2lvha7hu8.R.globalSliceStart(getClass().getName(),46315);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_257c2enzqj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2zl2zl2lvha7hu8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2zl2zl2lvha7hu8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.exception.ExceptionUtilsTest.testPrintRootCauseStackTrace_Throwable",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),46315,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_257c2enzqj() throws Exception{try{__CLR4_5_2zl2zl2lvha7hu8.R.inc(46315);
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46316);ExceptionUtils.printRootCauseStackTrace(null);
        // could pipe system.err to a known stream, but not much point as
        // internally this method calls stream method anyway
    }finally{__CLR4_5_2zl2zl2lvha7hu8.R.flushNeeded();}}
    
    @Test
    public void testPrintRootCauseStackTrace_ThrowableStream() throws Exception {__CLR4_5_2zl2zl2lvha7hu8.R.globalSliceStart(getClass().getName(),46317);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ojxr0vzql();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2zl2zl2lvha7hu8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2zl2zl2lvha7hu8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.exception.ExceptionUtilsTest.testPrintRootCauseStackTrace_ThrowableStream",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),46317,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ojxr0vzql() throws Exception{try{__CLR4_5_2zl2zl2lvha7hu8.R.inc(46317);
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46318);ByteArrayOutputStream out = new ByteArrayOutputStream(1024);
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46319);ExceptionUtils.printRootCauseStackTrace(null, (PrintStream) null);
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46320);ExceptionUtils.printRootCauseStackTrace(null, new PrintStream(out));
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46321);assertEquals(0, out.toString().length());
        
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46322);out = new ByteArrayOutputStream(1024);
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46323);try {
            __CLR4_5_2zl2zl2lvha7hu8.R.inc(46324);ExceptionUtils.printRootCauseStackTrace(withCause, (PrintStream) null);
            __CLR4_5_2zl2zl2lvha7hu8.R.inc(46325);fail();
        } catch (final IllegalArgumentException ex) {
        }
        
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46326);out = new ByteArrayOutputStream(1024);
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46327);final Throwable cause = createExceptionWithCause();
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46328);ExceptionUtils.printRootCauseStackTrace(cause, new PrintStream(out));
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46329);String stackTrace = out.toString();
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46330);assertTrue(stackTrace.indexOf(ExceptionUtils.WRAPPED_MARKER) != -1);
        
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46331);out = new ByteArrayOutputStream(1024);
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46332);ExceptionUtils.printRootCauseStackTrace(withoutCause, new PrintStream(out));
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46333);stackTrace = out.toString();
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46334);assertTrue(stackTrace.indexOf(ExceptionUtils.WRAPPED_MARKER) == -1);
    }finally{__CLR4_5_2zl2zl2lvha7hu8.R.flushNeeded();}}

    @Test
    public void testPrintRootCauseStackTrace_ThrowableWriter() throws Exception {__CLR4_5_2zl2zl2lvha7hu8.R.globalSliceStart(getClass().getName(),46335);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ajkfi4zr3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2zl2zl2lvha7hu8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2zl2zl2lvha7hu8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.exception.ExceptionUtilsTest.testPrintRootCauseStackTrace_ThrowableWriter",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),46335,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ajkfi4zr3() throws Exception{try{__CLR4_5_2zl2zl2lvha7hu8.R.inc(46335);
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46336);StringWriter writer = new StringWriter(1024);
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46337);ExceptionUtils.printRootCauseStackTrace(null, (PrintWriter) null);
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46338);ExceptionUtils.printRootCauseStackTrace(null, new PrintWriter(writer));
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46339);assertEquals(0, writer.getBuffer().length());
        
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46340);writer = new StringWriter(1024);
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46341);try {
            __CLR4_5_2zl2zl2lvha7hu8.R.inc(46342);ExceptionUtils.printRootCauseStackTrace(withCause, (PrintWriter) null);
            __CLR4_5_2zl2zl2lvha7hu8.R.inc(46343);fail();
        } catch (final IllegalArgumentException ex) {
        }
        
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46344);writer = new StringWriter(1024);
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46345);final Throwable cause = createExceptionWithCause();
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46346);ExceptionUtils.printRootCauseStackTrace(cause, new PrintWriter(writer));
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46347);String stackTrace = writer.toString();
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46348);assertTrue(stackTrace.indexOf(ExceptionUtils.WRAPPED_MARKER) != -1);
        
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46349);writer = new StringWriter(1024);
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46350);ExceptionUtils.printRootCauseStackTrace(withoutCause, new PrintWriter(writer));
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46351);stackTrace = writer.toString();
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46352);assertTrue(stackTrace.indexOf(ExceptionUtils.WRAPPED_MARKER) == -1);
    }finally{__CLR4_5_2zl2zl2lvha7hu8.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testGetRootCauseStackTrace_Throwable() throws Exception {__CLR4_5_2zl2zl2lvha7hu8.R.globalSliceStart(getClass().getName(),46353);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ykc7e0zrl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2zl2zl2lvha7hu8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2zl2zl2lvha7hu8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.exception.ExceptionUtilsTest.testGetRootCauseStackTrace_Throwable",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),46353,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ykc7e0zrl() throws Exception{try{__CLR4_5_2zl2zl2lvha7hu8.R.inc(46353);
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46354);assertEquals(0, ExceptionUtils.getRootCauseStackTrace(null).length);
        
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46355);final Throwable cause = createExceptionWithCause();
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46356);String[] stackTrace = ExceptionUtils.getRootCauseStackTrace(cause);
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46357);boolean match = false;
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46358);for (final String element : stackTrace) {{
            __CLR4_5_2zl2zl2lvha7hu8.R.inc(46359);if ((((element.startsWith(ExceptionUtils.WRAPPED_MARKER))&&(__CLR4_5_2zl2zl2lvha7hu8.R.iget(46360)!=0|true))||(__CLR4_5_2zl2zl2lvha7hu8.R.iget(46361)==0&false))) {{
                __CLR4_5_2zl2zl2lvha7hu8.R.inc(46362);match = true;
                __CLR4_5_2zl2zl2lvha7hu8.R.inc(46363);break;
            }
        }}
        }__CLR4_5_2zl2zl2lvha7hu8.R.inc(46364);assertTrue(match);
        
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46365);stackTrace = ExceptionUtils.getRootCauseStackTrace(withoutCause);
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46366);match = false;
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46367);for (final String element : stackTrace) {{
            __CLR4_5_2zl2zl2lvha7hu8.R.inc(46368);if ((((element.startsWith(ExceptionUtils.WRAPPED_MARKER))&&(__CLR4_5_2zl2zl2lvha7hu8.R.iget(46369)!=0|true))||(__CLR4_5_2zl2zl2lvha7hu8.R.iget(46370)==0&false))) {{
                __CLR4_5_2zl2zl2lvha7hu8.R.inc(46371);match = true;
                __CLR4_5_2zl2zl2lvha7hu8.R.inc(46372);break;
            }
        }}
        }__CLR4_5_2zl2zl2lvha7hu8.R.inc(46373);assertFalse(match);
    }finally{__CLR4_5_2zl2zl2lvha7hu8.R.flushNeeded();}}

    @Test(expected=IllegalArgumentException.class)
    public void testRemoveCommonFrames_ListList() throws Exception {__CLR4_5_2zl2zl2lvha7hu8.R.globalSliceStart(getClass().getName(),46374);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2mbghnzs6();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,82,101,109,111,118,101,67,111,109,109,111,110,70,114,97,109,101,115,95,76,105,115,116,76,105,115,116,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2zl2zl2lvha7hu8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2zl2zl2lvha7hu8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.exception.ExceptionUtilsTest.testRemoveCommonFrames_ListList",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),46374,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2mbghnzs6() throws Exception{try{__CLR4_5_2zl2zl2lvha7hu8.R.inc(46374);
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46375);ExceptionUtils.removeCommonFrames(null, null);
    }finally{__CLR4_5_2zl2zl2lvha7hu8.R.flushNeeded();}}

    @Test
    public void test_getMessage_Throwable() {__CLR4_5_2zl2zl2lvha7hu8.R.globalSliceStart(getClass().getName(),46376);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2bj51razs8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2zl2zl2lvha7hu8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2zl2zl2lvha7hu8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.exception.ExceptionUtilsTest.test_getMessage_Throwable",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),46376,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2bj51razs8(){try{__CLR4_5_2zl2zl2lvha7hu8.R.inc(46376);
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46377);Throwable th = null;
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46378);assertEquals("", ExceptionUtils.getMessage(th));
        
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46379);th = new IllegalArgumentException("Base");
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46380);assertEquals("IllegalArgumentException: Base", ExceptionUtils.getMessage(th));
        
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46381);th = new ExceptionWithCause("Wrapper", th);
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46382);assertEquals("ExceptionUtilsTest.ExceptionWithCause: Wrapper", ExceptionUtils.getMessage(th));
    }finally{__CLR4_5_2zl2zl2lvha7hu8.R.flushNeeded();}}

    @Test
    public void test_getRootCauseMessage_Throwable() {__CLR4_5_2zl2zl2lvha7hu8.R.globalSliceStart(getClass().getName(),46383);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2j2nfo1zsf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2zl2zl2lvha7hu8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2zl2zl2lvha7hu8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.exception.ExceptionUtilsTest.test_getRootCauseMessage_Throwable",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),46383,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2j2nfo1zsf(){try{__CLR4_5_2zl2zl2lvha7hu8.R.inc(46383);
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46384);Throwable th = null;
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46385);assertEquals("", ExceptionUtils.getRootCauseMessage(th));
        
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46386);th = new IllegalArgumentException("Base");
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46387);assertEquals("IllegalArgumentException: Base", ExceptionUtils.getRootCauseMessage(th));
        
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46388);th = new ExceptionWithCause("Wrapper", th);
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46389);assertEquals("IllegalArgumentException: Base", ExceptionUtils.getRootCauseMessage(th));
    }finally{__CLR4_5_2zl2zl2lvha7hu8.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Provides a method with a well known chained/nested exception
     * name which matches the full signature (e.g. has a return value
     * of <code>Throwable</code>.
     */
    private static class ExceptionWithCause extends Exception {
        private static final long serialVersionUID = 1L;

        private Throwable cause;

        public ExceptionWithCause(final String str, final Throwable cause) {
            super(str);__CLR4_5_2zl2zl2lvha7hu8.R.inc(46391);try{__CLR4_5_2zl2zl2lvha7hu8.R.inc(46390);
            __CLR4_5_2zl2zl2lvha7hu8.R.inc(46392);setCause(cause);
        }finally{__CLR4_5_2zl2zl2lvha7hu8.R.flushNeeded();}}

        public ExceptionWithCause(final Throwable cause) {
            super();__CLR4_5_2zl2zl2lvha7hu8.R.inc(46394);try{__CLR4_5_2zl2zl2lvha7hu8.R.inc(46393);
            __CLR4_5_2zl2zl2lvha7hu8.R.inc(46395);setCause(cause);
        }finally{__CLR4_5_2zl2zl2lvha7hu8.R.flushNeeded();}}

        @Override
        public Throwable getCause() {try{__CLR4_5_2zl2zl2lvha7hu8.R.inc(46396);
            __CLR4_5_2zl2zl2lvha7hu8.R.inc(46397);return cause;
        }finally{__CLR4_5_2zl2zl2lvha7hu8.R.flushNeeded();}}

        public void setCause(final Throwable cause) {try{__CLR4_5_2zl2zl2lvha7hu8.R.inc(46398);
            __CLR4_5_2zl2zl2lvha7hu8.R.inc(46399);this.cause = cause;
        }finally{__CLR4_5_2zl2zl2lvha7hu8.R.flushNeeded();}}
    }

    /**
     * Provides a method with a well known chained/nested exception
     * name which does not match the full signature (e.g. lacks a
     * return value of <code>Throwable</code>.
     */
    private static class ExceptionWithoutCause extends Exception {
        private static final long serialVersionUID = 1L;

       @SuppressWarnings("unused")
        public void getTargetException() {try{__CLR4_5_2zl2zl2lvha7hu8.R.inc(46400);
        }finally{__CLR4_5_2zl2zl2lvha7hu8.R.flushNeeded();}}
    }

    // Temporary classes to allow the nested exception code to be removed 
    // prior to a rewrite of this test class. 
    private static class NestableException extends Exception { 
        private static final long serialVersionUID = 1L;

        @SuppressWarnings("unused")
        public NestableException() { super();__CLR4_5_2zl2zl2lvha7hu8.R.inc(46402);try{__CLR4_5_2zl2zl2lvha7hu8.R.inc(46401); }finally{__CLR4_5_2zl2zl2lvha7hu8.R.flushNeeded();}}
        public NestableException(final Throwable t) { super(t);__CLR4_5_2zl2zl2lvha7hu8.R.inc(46404);try{__CLR4_5_2zl2zl2lvha7hu8.R.inc(46403); }finally{__CLR4_5_2zl2zl2lvha7hu8.R.flushNeeded();}}
    }

    @Test
    public void testThrow() {__CLR4_5_2zl2zl2lvha7hu8.R.globalSliceStart(getClass().getName(),46405);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2lct139zt1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2zl2zl2lvha7hu8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2zl2zl2lvha7hu8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.exception.ExceptionUtilsTest.testThrow",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),46405,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2lct139zt1(){try{__CLR4_5_2zl2zl2lvha7hu8.R.inc(46405);
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46406);final Exception expected = new InterruptedException();
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46407);try {
            __CLR4_5_2zl2zl2lvha7hu8.R.inc(46408);ExceptionUtils.rethrow(expected);
            __CLR4_5_2zl2zl2lvha7hu8.R.inc(46409);Assert.fail("Exception not thrown");
        }
        catch(final Exception actual) {
            __CLR4_5_2zl2zl2lvha7hu8.R.inc(46410);Assert.assertSame(expected, actual);
        }
    }finally{__CLR4_5_2zl2zl2lvha7hu8.R.flushNeeded();}}

    @Test
    public void testCatchTechniques() {__CLR4_5_2zl2zl2lvha7hu8.R.globalSliceStart(getClass().getName(),46411);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ns2firzt7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2zl2zl2lvha7hu8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2zl2zl2lvha7hu8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.exception.ExceptionUtilsTest.testCatchTechniques",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),46411,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ns2firzt7(){try{__CLR4_5_2zl2zl2lvha7hu8.R.inc(46411);
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46412);try {
            __CLR4_5_2zl2zl2lvha7hu8.R.inc(46413);throwsCheckedException();
            __CLR4_5_2zl2zl2lvha7hu8.R.inc(46414);Assert.fail("Exception not thrown");
        }
        catch(final Exception ioe) {
            __CLR4_5_2zl2zl2lvha7hu8.R.inc(46415);assertTrue(ioe instanceof IOException);
            __CLR4_5_2zl2zl2lvha7hu8.R.inc(46416);assertEquals(1, ExceptionUtils.getThrowableCount(ioe));
        }
        
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46417);try {
            __CLR4_5_2zl2zl2lvha7hu8.R.inc(46418);redeclareCheckedException();
            __CLR4_5_2zl2zl2lvha7hu8.R.inc(46419);Assert.fail("Exception not thrown");
        }
        catch(final IOException ioe) {
            __CLR4_5_2zl2zl2lvha7hu8.R.inc(46420);assertEquals(1, ExceptionUtils.getThrowableCount(ioe));
        }
    }finally{__CLR4_5_2zl2zl2lvha7hu8.R.flushNeeded();}}

    private static int redeclareCheckedException() throws IOException {try{__CLR4_5_2zl2zl2lvha7hu8.R.inc(46421);
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46422);return throwsCheckedException();
    }finally{__CLR4_5_2zl2zl2lvha7hu8.R.flushNeeded();}}

    private static int throwsCheckedException() {try{__CLR4_5_2zl2zl2lvha7hu8.R.inc(46423);
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46424);try {
            __CLR4_5_2zl2zl2lvha7hu8.R.inc(46425);throw new IOException();
        } catch (final Exception e) {
            __CLR4_5_2zl2zl2lvha7hu8.R.inc(46426);return ExceptionUtils.<Integer>rethrow(e);
        }
    }finally{__CLR4_5_2zl2zl2lvha7hu8.R.flushNeeded();}}

    public static class TestThrowable extends Throwable {
        private static final long serialVersionUID = 1L;
    }

    @Test
    public void testWrapAndUnwrapError() {__CLR4_5_2zl2zl2lvha7hu8.R.globalSliceStart(getClass().getName(),46427);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ot85ypztn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2zl2zl2lvha7hu8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2zl2zl2lvha7hu8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.exception.ExceptionUtilsTest.testWrapAndUnwrapError",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),46427,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ot85ypztn(){try{__CLR4_5_2zl2zl2lvha7hu8.R.inc(46427);
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46428);try {
            __CLR4_5_2zl2zl2lvha7hu8.R.inc(46429);ExceptionUtils.wrapAndThrow(new OutOfMemoryError());
            __CLR4_5_2zl2zl2lvha7hu8.R.inc(46430);Assert.fail("Error not thrown");
        }
        catch(final Throwable t) {
            __CLR4_5_2zl2zl2lvha7hu8.R.inc(46431);Assert.assertTrue(ExceptionUtils.hasCause(t, Error.class));
        }
    }finally{__CLR4_5_2zl2zl2lvha7hu8.R.flushNeeded();}}

    @Test
    public void testWrapAndUnwrapRuntimeException() {__CLR4_5_2zl2zl2lvha7hu8.R.globalSliceStart(getClass().getName(),46432);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23vrexwzts();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2zl2zl2lvha7hu8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2zl2zl2lvha7hu8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.exception.ExceptionUtilsTest.testWrapAndUnwrapRuntimeException",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),46432,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23vrexwzts(){try{__CLR4_5_2zl2zl2lvha7hu8.R.inc(46432);
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46433);try {
            __CLR4_5_2zl2zl2lvha7hu8.R.inc(46434);ExceptionUtils.wrapAndThrow(new IllegalArgumentException());
            __CLR4_5_2zl2zl2lvha7hu8.R.inc(46435);Assert.fail("RuntimeException not thrown");
        }
        catch(final Throwable t) {
            __CLR4_5_2zl2zl2lvha7hu8.R.inc(46436);Assert.assertTrue(ExceptionUtils.hasCause(t, RuntimeException.class));
        }
    }finally{__CLR4_5_2zl2zl2lvha7hu8.R.flushNeeded();}}

    @Test
    public void testWrapAndUnwrapCheckedException() {__CLR4_5_2zl2zl2lvha7hu8.R.globalSliceStart(getClass().getName(),46437);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21x86szztx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2zl2zl2lvha7hu8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2zl2zl2lvha7hu8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.exception.ExceptionUtilsTest.testWrapAndUnwrapCheckedException",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),46437,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21x86szztx(){try{__CLR4_5_2zl2zl2lvha7hu8.R.inc(46437);
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46438);try {
            __CLR4_5_2zl2zl2lvha7hu8.R.inc(46439);ExceptionUtils.wrapAndThrow(new IOException());
            __CLR4_5_2zl2zl2lvha7hu8.R.inc(46440);Assert.fail("Checked Exception not thrown");
        }
        catch(final Throwable t) {
            __CLR4_5_2zl2zl2lvha7hu8.R.inc(46441);Assert.assertTrue(ExceptionUtils.hasCause(t, IOException.class));
        }
    }finally{__CLR4_5_2zl2zl2lvha7hu8.R.flushNeeded();}}

    @Test
    public void testWrapAndUnwrapThrowable() {__CLR4_5_2zl2zl2lvha7hu8.R.globalSliceStart(getClass().getName(),46442);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2eibn8pzu2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2zl2zl2lvha7hu8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2zl2zl2lvha7hu8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.exception.ExceptionUtilsTest.testWrapAndUnwrapThrowable",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),46442,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2eibn8pzu2(){try{__CLR4_5_2zl2zl2lvha7hu8.R.inc(46442);
        __CLR4_5_2zl2zl2lvha7hu8.R.inc(46443);try {
            __CLR4_5_2zl2zl2lvha7hu8.R.inc(46444);ExceptionUtils.wrapAndThrow(new TestThrowable());
            __CLR4_5_2zl2zl2lvha7hu8.R.inc(46445);Assert.fail("Checked Exception not thrown");
        }
        catch(final Throwable t) {
            __CLR4_5_2zl2zl2lvha7hu8.R.inc(46446);Assert.assertTrue(ExceptionUtils.hasCause(t, TestThrowable.class));
        }
    }finally{__CLR4_5_2zl2zl2lvha7hu8.R.flushNeeded();}}
}
