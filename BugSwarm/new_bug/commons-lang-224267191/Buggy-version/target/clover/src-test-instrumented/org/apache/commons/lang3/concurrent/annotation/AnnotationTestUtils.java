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

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

import org.apache.bcel.Repository;
import org.apache.bcel.classfile.AnnotationEntry;
import org.apache.bcel.classfile.ElementValuePair;
import org.apache.bcel.classfile.JavaClass;
import org.apache.commons.lang3.reflect.MethodUtils;
import org.junit.Assert;

class AnnotationTestUtils {static class __CLR4_5_2z7xz7xlvha7hqd{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172763741L,8589935092L,45659,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static void testClassAnnotationInClassFile(final String className, final String annotationType) throws Exception {try{__CLR4_5_2z7xz7xlvha7hqd.R.inc(45645);
        __CLR4_5_2z7xz7xlvha7hqd.R.inc(45646);final JavaClass clazz = Repository.lookupClass(className);
        __CLR4_5_2z7xz7xlvha7hqd.R.inc(45647);final AnnotationEntry[] annotationEntries = clazz.getAnnotationEntries();
        __CLR4_5_2z7xz7xlvha7hqd.R.inc(45648);Assert.assertNotNull(annotationEntries);
        __CLR4_5_2z7xz7xlvha7hqd.R.inc(45649);Assert.assertEquals(1, annotationEntries.length);
        __CLR4_5_2z7xz7xlvha7hqd.R.inc(45650);final AnnotationEntry annotationEntry = annotationEntries[0];
        __CLR4_5_2z7xz7xlvha7hqd.R.inc(45651);Assert.assertEquals(annotationType, annotationEntry .getAnnotationType());
        __CLR4_5_2z7xz7xlvha7hqd.R.inc(45652);final ElementValuePair[] elementValuePairs = annotationEntry.getElementValuePairs();
        __CLR4_5_2z7xz7xlvha7hqd.R.inc(45653);Assert.assertNotNull(elementValuePairs);
        __CLR4_5_2z7xz7xlvha7hqd.R.inc(45654);Assert.assertEquals(0, elementValuePairs.length);
    }finally{__CLR4_5_2z7xz7xlvha7hqd.R.flushNeeded();}}

    public static void testMethodAnnotationNotRetainedAtRuntime(final Class<?> cls,
            final Class<? extends Annotation> annotationCls) {try{__CLR4_5_2z7xz7xlvha7hqd.R.inc(45655);
        __CLR4_5_2z7xz7xlvha7hqd.R.inc(45656);final Method[] methods = MethodUtils.getMethodsWithAnnotation(cls, annotationCls);
        __CLR4_5_2z7xz7xlvha7hqd.R.inc(45657);Assert.assertNotNull(methods);
        __CLR4_5_2z7xz7xlvha7hqd.R.inc(45658);Assert.assertEquals(0, methods.length);
    }finally{__CLR4_5_2z7xz7xlvha7hqd.R.flushNeeded();}}

}
