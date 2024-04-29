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
package org.apache.commons.lang3.concurrent.annotation;

import org.apache.bcel.Repository;
import org.apache.bcel.classfile.AnnotationEntry;
import org.apache.bcel.classfile.ElementValue;
import org.apache.bcel.classfile.ElementValuePair;
import org.apache.bcel.classfile.JavaClass;
import org.junit.Assert;
import org.junit.Test;

/**
 * Tests {@link GuardedBy}.
 */
public class GuardedByTest {static class __CLR4_5_2z8fz8flvha7hqj{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172763741L,8589935092L,45688,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private org.apache.bcel.classfile.Method getBcelMethod(final JavaClass clazz, final String name) {try{__CLR4_5_2z8fz8flvha7hqj.R.inc(45663);
        __CLR4_5_2z8fz8flvha7hqj.R.inc(45664);for (final org.apache.bcel.classfile.Method method : clazz.getMethods()) {{
            __CLR4_5_2z8fz8flvha7hqj.R.inc(45665);if ((((method.getName().equals(name))&&(__CLR4_5_2z8fz8flvha7hqj.R.iget(45666)!=0|true))||(__CLR4_5_2z8fz8flvha7hqj.R.iget(45667)==0&false))) {{
                __CLR4_5_2z8fz8flvha7hqj.R.inc(45668);return method;
            }
        }}
        }__CLR4_5_2z8fz8flvha7hqj.R.inc(45669);return null;
    }finally{__CLR4_5_2z8fz8flvha7hqj.R.flushNeeded();}}

    @Test
    public void testMethodAnnotationInClassFile() throws Exception {__CLR4_5_2z8fz8flvha7hqj.R.globalSliceStart(getClass().getName(),45670);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26solbgz8m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2z8fz8flvha7hqj.R.rethrow($CLV_t2$);}finally{__CLR4_5_2z8fz8flvha7hqj.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.annotation.GuardedByTest.testMethodAnnotationInClassFile",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),45670,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26solbgz8m() throws Exception{try{__CLR4_5_2z8fz8flvha7hqj.R.inc(45670);
        __CLR4_5_2z8fz8flvha7hqj.R.inc(45671);final JavaClass clazz = Repository.lookupClass("org.apache.commons.lang3.concurrent.annotation.GuardedByTestFixture");
        __CLR4_5_2z8fz8flvha7hqj.R.inc(45672);final org.apache.bcel.classfile.Method method = getBcelMethod(clazz, "foo");
        __CLR4_5_2z8fz8flvha7hqj.R.inc(45673);Assert.assertNotNull(method);
        __CLR4_5_2z8fz8flvha7hqj.R.inc(45674);final AnnotationEntry[] annotationEntries = method.getAnnotationEntries();
        __CLR4_5_2z8fz8flvha7hqj.R.inc(45675);Assert.assertNotNull(annotationEntries);
        __CLR4_5_2z8fz8flvha7hqj.R.inc(45676);Assert.assertEquals(1, annotationEntries.length);
        __CLR4_5_2z8fz8flvha7hqj.R.inc(45677);final AnnotationEntry annotationEntry = annotationEntries[0];
        __CLR4_5_2z8fz8flvha7hqj.R.inc(45678);Assert.assertEquals("Lorg/apache/commons/lang3/concurrent/annotation/GuardedBy;", annotationEntry .getAnnotationType());
        __CLR4_5_2z8fz8flvha7hqj.R.inc(45679);final ElementValuePair[] elementValuePairs = annotationEntry.getElementValuePairs();
        __CLR4_5_2z8fz8flvha7hqj.R.inc(45680);Assert.assertNotNull(elementValuePairs);
        __CLR4_5_2z8fz8flvha7hqj.R.inc(45681);Assert.assertEquals(1, elementValuePairs.length);
        __CLR4_5_2z8fz8flvha7hqj.R.inc(45682);final ElementValuePair elementValuePair = elementValuePairs[0];
        __CLR4_5_2z8fz8flvha7hqj.R.inc(45683);final ElementValue value = elementValuePair.getValue();
        __CLR4_5_2z8fz8flvha7hqj.R.inc(45684);Assert.assertNotNull(value);
        __CLR4_5_2z8fz8flvha7hqj.R.inc(45685);Assert.assertEquals("bar", value.toString());
    }finally{__CLR4_5_2z8fz8flvha7hqj.R.flushNeeded();}}

    @Test
    public void testMethodAnnotationNotRetainedAtRuntime() {__CLR4_5_2z8fz8flvha7hqj.R.globalSliceStart(getClass().getName(),45686);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2s3vgbtz92();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2z8fz8flvha7hqj.R.rethrow($CLV_t2$);}finally{__CLR4_5_2z8fz8flvha7hqj.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.annotation.GuardedByTest.testMethodAnnotationNotRetainedAtRuntime",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),45686,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2s3vgbtz92(){try{__CLR4_5_2z8fz8flvha7hqj.R.inc(45686);
        __CLR4_5_2z8fz8flvha7hqj.R.inc(45687);AnnotationTestUtils.testMethodAnnotationNotRetainedAtRuntime(GuardedByTestFixture.class, GuardedBy.class);
    }finally{__CLR4_5_2z8fz8flvha7hqj.R.flushNeeded();}}

}
