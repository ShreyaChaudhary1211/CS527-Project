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
package org.apache.commons.lang3;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.lang3.ClassUtils.Interfaces;
import org.apache.commons.lang3.reflect.testbed.GenericConsumer;
import org.apache.commons.lang3.reflect.testbed.GenericParent;
import org.apache.commons.lang3.reflect.testbed.StringParameterizedChild;
import org.junit.Test;

/**
 * Unit tests {@link org.apache.commons.lang3.ClassUtils}.
 */
@SuppressWarnings("boxing") // JUnit4 does not support primitive equality testing apart from long
public class ClassUtilsTest  {static class __CLR4_5_2npjnpjlvha7fm8{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172763741L,8589935092L,31517,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static class Inner {
        private class DeeplyNested{}
    }

    //-----------------------------------------------------------------------
    @Test
    public void testConstructor() {__CLR4_5_2npjnpjlvha7fm8.R.globalSliceStart(getClass().getName(),30727);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2uefs8hnpj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2npjnpjlvha7fm8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2npjnpjlvha7fm8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ClassUtilsTest.testConstructor",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),30727,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2uefs8hnpj(){try{__CLR4_5_2npjnpjlvha7fm8.R.inc(30727);
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30728);assertNotNull(new ClassUtils());
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30729);final Constructor<?>[] cons = ClassUtils.class.getDeclaredConstructors();
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30730);assertEquals(1, cons.length);
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30731);assertTrue(Modifier.isPublic(cons[0].getModifiers()));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30732);assertTrue(Modifier.isPublic(ClassUtils.class.getModifiers()));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30733);assertFalse(Modifier.isFinal(ClassUtils.class.getModifiers()));
    }finally{__CLR4_5_2npjnpjlvha7fm8.R.flushNeeded();}}

    // -------------------------------------------------------------------------
    @Test
    public void test_getShortClassName_Object() {__CLR4_5_2npjnpjlvha7fm8.R.globalSliceStart(getClass().getName(),30734);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27pwoz9npq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2npjnpjlvha7fm8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2npjnpjlvha7fm8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ClassUtilsTest.test_getShortClassName_Object",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),30734,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27pwoz9npq(){try{__CLR4_5_2npjnpjlvha7fm8.R.inc(30734);
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30735);assertEquals("ClassUtils", ClassUtils.getShortClassName(new ClassUtils(), "<null>"));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30736);assertEquals("ClassUtilsTest.Inner", ClassUtils.getShortClassName(new Inner(), "<null>"));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30737);assertEquals("String", ClassUtils.getShortClassName("hello", "<null>"));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30738);assertEquals("<null>", ClassUtils.getShortClassName(null, "<null>"));

        // Inner types
        class Named {}
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30739);assertEquals("ClassUtilsTest.1", ClassUtils.getShortClassName(new Object(){}, "<null>"));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30740);assertEquals("ClassUtilsTest.1Named", ClassUtils.getShortClassName(new Named(), "<null>"));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30741);assertEquals("ClassUtilsTest.Inner", ClassUtils.getShortClassName(new Inner(), "<null>"));
    }finally{__CLR4_5_2npjnpjlvha7fm8.R.flushNeeded();}}

    @Test
    public void test_getShortClassName_Class() {__CLR4_5_2npjnpjlvha7fm8.R.globalSliceStart(getClass().getName(),30742);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2q9s92onpy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2npjnpjlvha7fm8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2npjnpjlvha7fm8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ClassUtilsTest.test_getShortClassName_Class",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),30742,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2q9s92onpy(){try{__CLR4_5_2npjnpjlvha7fm8.R.inc(30742);
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30743);assertEquals("ClassUtils", ClassUtils.getShortClassName(ClassUtils.class));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30744);assertEquals("Map.Entry", ClassUtils.getShortClassName(Map.Entry.class));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30745);assertEquals("", ClassUtils.getShortClassName((Class<?>) null));

        // LANG-535
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30746);assertEquals("String[]", ClassUtils.getShortClassName(String[].class));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30747);assertEquals("Map.Entry[]", ClassUtils.getShortClassName(Map.Entry[].class));

        // Primitives
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30748);assertEquals("boolean", ClassUtils.getShortClassName(boolean.class));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30749);assertEquals("byte", ClassUtils.getShortClassName(byte.class));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30750);assertEquals("char", ClassUtils.getShortClassName(char.class));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30751);assertEquals("short", ClassUtils.getShortClassName(short.class));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30752);assertEquals("int", ClassUtils.getShortClassName(int.class));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30753);assertEquals("long", ClassUtils.getShortClassName(long.class));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30754);assertEquals("float", ClassUtils.getShortClassName(float.class));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30755);assertEquals("double", ClassUtils.getShortClassName(double.class));

        // Primitive Arrays
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30756);assertEquals("boolean[]", ClassUtils.getShortClassName(boolean[].class));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30757);assertEquals("byte[]", ClassUtils.getShortClassName(byte[].class));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30758);assertEquals("char[]", ClassUtils.getShortClassName(char[].class));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30759);assertEquals("short[]", ClassUtils.getShortClassName(short[].class));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30760);assertEquals("int[]", ClassUtils.getShortClassName(int[].class));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30761);assertEquals("long[]", ClassUtils.getShortClassName(long[].class));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30762);assertEquals("float[]", ClassUtils.getShortClassName(float[].class));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30763);assertEquals("double[]", ClassUtils.getShortClassName(double[].class));

        // Arrays of arrays of ...
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30764);assertEquals("String[][]", ClassUtils.getShortClassName(String[][].class));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30765);assertEquals("String[][][]", ClassUtils.getShortClassName(String[][][].class));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30766);assertEquals("String[][][][]", ClassUtils.getShortClassName(String[][][][].class));
        
        // Inner types
        class Named {}
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30767);assertEquals("ClassUtilsTest.2", ClassUtils.getShortClassName(new Object(){}.getClass()));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30768);assertEquals("ClassUtilsTest.2Named", ClassUtils.getShortClassName(Named.class));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30769);assertEquals("ClassUtilsTest.Inner", ClassUtils.getShortClassName(Inner.class));
    }finally{__CLR4_5_2npjnpjlvha7fm8.R.flushNeeded();}}



    @Test
    public void test_getShortClassName_String() {__CLR4_5_2npjnpjlvha7fm8.R.globalSliceStart(getClass().getName(),30770);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2i9kow7nqq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2npjnpjlvha7fm8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2npjnpjlvha7fm8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ClassUtilsTest.test_getShortClassName_String",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),30770,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2i9kow7nqq(){try{__CLR4_5_2npjnpjlvha7fm8.R.inc(30770);
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30771);assertEquals("ClassUtils", ClassUtils.getShortClassName(ClassUtils.class.getName()));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30772);assertEquals("Map.Entry", ClassUtils.getShortClassName(Map.Entry.class.getName()));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30773);assertEquals("", ClassUtils.getShortClassName((String) null));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30774);assertEquals("", ClassUtils.getShortClassName(""));
    }finally{__CLR4_5_2npjnpjlvha7fm8.R.flushNeeded();}}

    @Test
    public void test_getSimpleName_Class() {__CLR4_5_2npjnpjlvha7fm8.R.globalSliceStart(getClass().getName(),30775);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2spap22nqv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2npjnpjlvha7fm8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2npjnpjlvha7fm8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ClassUtilsTest.test_getSimpleName_Class",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),30775,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2spap22nqv(){try{__CLR4_5_2npjnpjlvha7fm8.R.inc(30775);
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30776);assertEquals("ClassUtils", ClassUtils.getSimpleName(ClassUtils.class));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30777);assertEquals("Entry", ClassUtils.getSimpleName(Map.Entry.class));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30778);assertEquals("", ClassUtils.getSimpleName(null));

        // LANG-535
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30779);assertEquals("String[]", ClassUtils.getSimpleName(String[].class));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30780);assertEquals("Entry[]", ClassUtils.getSimpleName(Map.Entry[].class));

        // Primitives
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30781);assertEquals("boolean", ClassUtils.getSimpleName(boolean.class));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30782);assertEquals("byte", ClassUtils.getSimpleName(byte.class));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30783);assertEquals("char", ClassUtils.getSimpleName(char.class));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30784);assertEquals("short", ClassUtils.getSimpleName(short.class));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30785);assertEquals("int", ClassUtils.getSimpleName(int.class));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30786);assertEquals("long", ClassUtils.getSimpleName(long.class));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30787);assertEquals("float", ClassUtils.getSimpleName(float.class));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30788);assertEquals("double", ClassUtils.getSimpleName(double.class));

        // Primitive Arrays
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30789);assertEquals("boolean[]", ClassUtils.getSimpleName(boolean[].class));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30790);assertEquals("byte[]", ClassUtils.getSimpleName(byte[].class));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30791);assertEquals("char[]", ClassUtils.getSimpleName(char[].class));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30792);assertEquals("short[]", ClassUtils.getSimpleName(short[].class));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30793);assertEquals("int[]", ClassUtils.getSimpleName(int[].class));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30794);assertEquals("long[]", ClassUtils.getSimpleName(long[].class));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30795);assertEquals("float[]", ClassUtils.getSimpleName(float[].class));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30796);assertEquals("double[]", ClassUtils.getSimpleName(double[].class));

        // Arrays of arrays of ...
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30797);assertEquals("String[][]", ClassUtils.getSimpleName(String[][].class));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30798);assertEquals("String[][][]", ClassUtils.getSimpleName(String[][][].class));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30799);assertEquals("String[][][][]", ClassUtils.getSimpleName(String[][][][].class));
        
        // On-the-fly types
        class Named {}
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30800);assertEquals("", ClassUtils.getSimpleName(new Object(){}.getClass()));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30801);assertEquals("Named", ClassUtils.getSimpleName(Named.class));
    }finally{__CLR4_5_2npjnpjlvha7fm8.R.flushNeeded();}}

    @Test
    public void test_getSimpleName_Object() {__CLR4_5_2npjnpjlvha7fm8.R.globalSliceStart(getClass().getName(),30802);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23e4zhbnrm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2npjnpjlvha7fm8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2npjnpjlvha7fm8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ClassUtilsTest.test_getSimpleName_Object",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),30802,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23e4zhbnrm(){try{__CLR4_5_2npjnpjlvha7fm8.R.inc(30802);
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30803);assertEquals("ClassUtils", ClassUtils.getSimpleName(new ClassUtils(), "<null>"));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30804);assertEquals("Inner", ClassUtils.getSimpleName(new Inner(), "<null>"));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30805);assertEquals("String", ClassUtils.getSimpleName("hello", "<null>"));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30806);assertEquals("<null>", ClassUtils.getSimpleName(null, "<null>"));
    }finally{__CLR4_5_2npjnpjlvha7fm8.R.flushNeeded();}}

    // -------------------------------------------------------------------------
    @Test
    public void test_getPackageName_Object() {__CLR4_5_2npjnpjlvha7fm8.R.globalSliceStart(getClass().getName(),30807);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2y37bibnrr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2npjnpjlvha7fm8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2npjnpjlvha7fm8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ClassUtilsTest.test_getPackageName_Object",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),30807,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2y37bibnrr(){try{__CLR4_5_2npjnpjlvha7fm8.R.inc(30807);
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30808);assertEquals("org.apache.commons.lang3", ClassUtils.getPackageName(new ClassUtils(), "<null>"));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30809);assertEquals("org.apache.commons.lang3", ClassUtils.getPackageName(new Inner(), "<null>"));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30810);assertEquals("<null>", ClassUtils.getPackageName(null, "<null>"));
    }finally{__CLR4_5_2npjnpjlvha7fm8.R.flushNeeded();}}

    @Test
    public void test_getPackageName_Class() {__CLR4_5_2npjnpjlvha7fm8.R.globalSliceStart(getClass().getName(),30811);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n1d0u0nrv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2npjnpjlvha7fm8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2npjnpjlvha7fm8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ClassUtilsTest.test_getPackageName_Class",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),30811,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n1d0u0nrv(){try{__CLR4_5_2npjnpjlvha7fm8.R.inc(30811);
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30812);assertEquals("java.lang", ClassUtils.getPackageName(String.class));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30813);assertEquals("java.util", ClassUtils.getPackageName(Map.Entry.class));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30814);assertEquals("", ClassUtils.getPackageName((Class<?>) null));

        // LANG-535
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30815);assertEquals("java.lang", ClassUtils.getPackageName(String[].class));

        // Primitive Arrays
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30816);assertEquals("", ClassUtils.getPackageName(boolean[].class));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30817);assertEquals("", ClassUtils.getPackageName(byte[].class));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30818);assertEquals("", ClassUtils.getPackageName(char[].class));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30819);assertEquals("", ClassUtils.getPackageName(short[].class));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30820);assertEquals("", ClassUtils.getPackageName(int[].class));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30821);assertEquals("", ClassUtils.getPackageName(long[].class));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30822);assertEquals("", ClassUtils.getPackageName(float[].class));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30823);assertEquals("", ClassUtils.getPackageName(double[].class));

        // Arrays of arrays of ...
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30824);assertEquals("java.lang", ClassUtils.getPackageName(String[][].class));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30825);assertEquals("java.lang", ClassUtils.getPackageName(String[][][].class));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30826);assertEquals("java.lang", ClassUtils.getPackageName(String[][][][].class));
        
        // On-the-fly types
        class Named {}
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30827);assertEquals("org.apache.commons.lang3", ClassUtils.getPackageName(new Object() {
        }.getClass()));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30828);assertEquals("org.apache.commons.lang3", ClassUtils.getPackageName(Named.class));
    }finally{__CLR4_5_2npjnpjlvha7fm8.R.flushNeeded();}}

    @Test
    public void test_getPackageName_String() {__CLR4_5_2npjnpjlvha7fm8.R.globalSliceStart(getClass().getName(),30829);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2njjbldnsd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2npjnpjlvha7fm8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2npjnpjlvha7fm8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ClassUtilsTest.test_getPackageName_String",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),30829,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2njjbldnsd(){try{__CLR4_5_2npjnpjlvha7fm8.R.inc(30829);
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30830);assertEquals("org.apache.commons.lang3", ClassUtils.getPackageName(ClassUtils.class.getName()));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30831);assertEquals("java.util", ClassUtils.getPackageName(Map.Entry.class.getName()));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30832);assertEquals("", ClassUtils.getPackageName((String) null));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30833);assertEquals("", ClassUtils.getPackageName(""));
    }finally{__CLR4_5_2npjnpjlvha7fm8.R.flushNeeded();}}

    // -------------------------------------------------------------------------
    @Test
    public void test_getAbbreviatedName_Class() {__CLR4_5_2npjnpjlvha7fm8.R.globalSliceStart(getClass().getName(),30834);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2oxdsjpnsi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2npjnpjlvha7fm8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2npjnpjlvha7fm8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ClassUtilsTest.test_getAbbreviatedName_Class",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),30834,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2oxdsjpnsi(){try{__CLR4_5_2npjnpjlvha7fm8.R.inc(30834);
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30835);assertEquals("", ClassUtils.getAbbreviatedName((Class<?>)null, 1));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30836);assertEquals("j.l.String", ClassUtils.getAbbreviatedName(String.class, 1));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30837);assertEquals("j.l.String", ClassUtils.getAbbreviatedName(String.class, 5));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30838);assertEquals("j.lang.String", ClassUtils.getAbbreviatedName(String.class, 13));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30839);assertEquals("j.lang.String", ClassUtils.getAbbreviatedName(String.class, 15));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30840);assertEquals("java.lang.String", ClassUtils.getAbbreviatedName(String.class, 20));
    }finally{__CLR4_5_2npjnpjlvha7fm8.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class)
    public void test_getAbbreviatedName_Class_ZeroLen() {__CLR4_5_2npjnpjlvha7fm8.R.globalSliceStart(getClass().getName(),30841);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hrpv9znsp();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,95,103,101,116,65,98,98,114,101,118,105,97,116,101,100,78,97,109,101,95,67,108,97,115,115,95,90,101,114,111,76,101,110,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2npjnpjlvha7fm8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2npjnpjlvha7fm8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ClassUtilsTest.test_getAbbreviatedName_Class_ZeroLen",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),30841,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hrpv9znsp(){try{__CLR4_5_2npjnpjlvha7fm8.R.inc(30841);
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30842);ClassUtils.getAbbreviatedName(String.class, 0);
    }finally{__CLR4_5_2npjnpjlvha7fm8.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class)
    public void test_getAbbreviatedName_Class_NegativeLen() {__CLR4_5_2npjnpjlvha7fm8.R.globalSliceStart(getClass().getName(),30843);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2myf8bgnsr();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,95,103,101,116,65,98,98,114,101,118,105,97,116,101,100,78,97,109,101,95,67,108,97,115,115,95,78,101,103,97,116,105,118,101,76,101,110,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2npjnpjlvha7fm8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2npjnpjlvha7fm8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ClassUtilsTest.test_getAbbreviatedName_Class_NegativeLen",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),30843,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2myf8bgnsr(){try{__CLR4_5_2npjnpjlvha7fm8.R.inc(30843);
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30844);ClassUtils.getAbbreviatedName(String.class, -10);
    }finally{__CLR4_5_2npjnpjlvha7fm8.R.flushNeeded();}}

    @Test
    public void test_getAbbreviatedName_String() {__CLR4_5_2npjnpjlvha7fm8.R.globalSliceStart(getClass().getName(),30845);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2b334qsnst();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2npjnpjlvha7fm8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2npjnpjlvha7fm8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ClassUtilsTest.test_getAbbreviatedName_String",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),30845,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2b334qsnst(){try{__CLR4_5_2npjnpjlvha7fm8.R.inc(30845);
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30846);assertEquals("", ClassUtils.getAbbreviatedName((String) null, 1));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30847);assertEquals("WithoutPackage", ClassUtils.getAbbreviatedName("WithoutPackage", 1));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30848);assertEquals("j.l.String", ClassUtils.getAbbreviatedName("java.lang.String", 1));
    }finally{__CLR4_5_2npjnpjlvha7fm8.R.flushNeeded();}}

    // -------------------------------------------------------------------------
    @Test
    public void test_getAllSuperclasses_Class() {__CLR4_5_2npjnpjlvha7fm8.R.globalSliceStart(getClass().getName(),30849);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2z8fim5nsx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2npjnpjlvha7fm8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2npjnpjlvha7fm8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ClassUtilsTest.test_getAllSuperclasses_Class",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),30849,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2z8fim5nsx(){try{__CLR4_5_2npjnpjlvha7fm8.R.inc(30849);
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30850);final List<?> list = ClassUtils.getAllSuperclasses(CY.class);
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30851);assertEquals(2, list.size());
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30852);assertEquals(CX.class, list.get(0));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30853);assertEquals(Object.class, list.get(1));

        __CLR4_5_2npjnpjlvha7fm8.R.inc(30854);assertEquals(null, ClassUtils.getAllSuperclasses(null));
    }finally{__CLR4_5_2npjnpjlvha7fm8.R.flushNeeded();}}

    @Test
    public void test_getAllInterfaces_Class() {__CLR4_5_2npjnpjlvha7fm8.R.globalSliceStart(getClass().getName(),30855);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28upfcint3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2npjnpjlvha7fm8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2npjnpjlvha7fm8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ClassUtilsTest.test_getAllInterfaces_Class",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),30855,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28upfcint3(){try{__CLR4_5_2npjnpjlvha7fm8.R.inc(30855);
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30856);final List<?> list = ClassUtils.getAllInterfaces(CY.class);
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30857);assertEquals(6, list.size());
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30858);assertEquals(IB.class, list.get(0));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30859);assertEquals(IC.class, list.get(1));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30860);assertEquals(ID.class, list.get(2));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30861);assertEquals(IE.class, list.get(3));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30862);assertEquals(IF.class, list.get(4));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30863);assertEquals(IA.class, list.get(5));

        __CLR4_5_2npjnpjlvha7fm8.R.inc(30864);assertEquals(null, ClassUtils.getAllInterfaces(null));
    }finally{__CLR4_5_2npjnpjlvha7fm8.R.flushNeeded();}}

    private static interface IA {
    }
    private static interface IB {
    }
    private static interface IC extends ID, IE {
    }
    private static interface ID {
    }
    private static interface IE extends IF {
    }
    private static interface IF {
    }
    private static class CX implements IB, IA, IE {
    }
    private static class CY extends CX implements IB, IC {
    }

    // -------------------------------------------------------------------------
    @Test
    public void test_convertClassNamesToClasses_List() {__CLR4_5_2npjnpjlvha7fm8.R.globalSliceStart(getClass().getName(),30865);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2nhqzdbntd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2npjnpjlvha7fm8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2npjnpjlvha7fm8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ClassUtilsTest.test_convertClassNamesToClasses_List",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),30865,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2nhqzdbntd(){try{__CLR4_5_2npjnpjlvha7fm8.R.inc(30865);
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30866);final List<String> list = new ArrayList<>();
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30867);List<Class<?>> result = ClassUtils.convertClassNamesToClasses(list);
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30868);assertEquals(0, result.size());

        __CLR4_5_2npjnpjlvha7fm8.R.inc(30869);list.add("java.lang.String");
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30870);list.add("java.lang.xxx");
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30871);list.add("java.lang.Object");
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30872);result = ClassUtils.convertClassNamesToClasses(list);
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30873);assertEquals(3, result.size());
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30874);assertEquals(String.class, result.get(0));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30875);assertEquals(null, result.get(1));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30876);assertEquals(Object.class, result.get(2));

        __CLR4_5_2npjnpjlvha7fm8.R.inc(30877);@SuppressWarnings("unchecked") // test what happens when non-generic code adds wrong type of element
        final
        List<Object> olist = (List<Object>)(List<?>)list;
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30878);olist.add(new Object());
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30879);try {
            __CLR4_5_2npjnpjlvha7fm8.R.inc(30880);ClassUtils.convertClassNamesToClasses(list);
            __CLR4_5_2npjnpjlvha7fm8.R.inc(30881);fail("Should not have been able to convert list");
        } catch (final ClassCastException expected) {}
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30882);assertEquals(null, ClassUtils.convertClassNamesToClasses(null));
    }finally{__CLR4_5_2npjnpjlvha7fm8.R.flushNeeded();}}

    @Test
    public void test_convertClassesToClassNames_List() {__CLR4_5_2npjnpjlvha7fm8.R.globalSliceStart(getClass().getName(),30883);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2re9p47ntv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2npjnpjlvha7fm8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2npjnpjlvha7fm8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ClassUtilsTest.test_convertClassesToClassNames_List",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),30883,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2re9p47ntv(){try{__CLR4_5_2npjnpjlvha7fm8.R.inc(30883);
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30884);final List<Class<?>> list = new ArrayList<>();
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30885);List<String> result = ClassUtils.convertClassesToClassNames(list);
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30886);assertEquals(0, result.size());

        __CLR4_5_2npjnpjlvha7fm8.R.inc(30887);list.add(String.class);
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30888);list.add(null);
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30889);list.add(Object.class);
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30890);result = ClassUtils.convertClassesToClassNames(list);
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30891);assertEquals(3, result.size());
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30892);assertEquals("java.lang.String", result.get(0));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30893);assertEquals(null, result.get(1));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30894);assertEquals("java.lang.Object", result.get(2));

        __CLR4_5_2npjnpjlvha7fm8.R.inc(30895);@SuppressWarnings("unchecked") // test what happens when non-generic code adds wrong type of element
        final
        List<Object> olist = (List<Object>)(List<?>)list;
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30896);olist.add(new Object());
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30897);try {
            __CLR4_5_2npjnpjlvha7fm8.R.inc(30898);ClassUtils.convertClassesToClassNames(list);
            __CLR4_5_2npjnpjlvha7fm8.R.inc(30899);fail("Should not have been able to convert list");
        } catch (final ClassCastException expected) {}
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30900);assertEquals(null, ClassUtils.convertClassesToClassNames(null));
    }finally{__CLR4_5_2npjnpjlvha7fm8.R.flushNeeded();}}

    // -------------------------------------------------------------------------
    @Test
    public void test_isInnerClass_Class() {__CLR4_5_2npjnpjlvha7fm8.R.globalSliceStart(getClass().getName(),30901);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26pbz9jnud();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2npjnpjlvha7fm8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2npjnpjlvha7fm8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ClassUtilsTest.test_isInnerClass_Class",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),30901,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26pbz9jnud(){try{__CLR4_5_2npjnpjlvha7fm8.R.inc(30901);
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30902);assertTrue(ClassUtils.isInnerClass(Inner.class));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30903);assertTrue(ClassUtils.isInnerClass(Map.Entry.class));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30904);assertTrue(ClassUtils.isInnerClass(new Cloneable() {
        }.getClass()));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30905);assertFalse(ClassUtils.isInnerClass(this.getClass()));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30906);assertFalse(ClassUtils.isInnerClass(String.class));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30907);assertFalse(ClassUtils.isInnerClass(null));
    }finally{__CLR4_5_2npjnpjlvha7fm8.R.flushNeeded();}}

    // -------------------------------------------------------------------------
    @Test
    public void test_isAssignable_ClassArray_ClassArray() throws Exception {__CLR4_5_2npjnpjlvha7fm8.R.globalSliceStart(getClass().getName(),30908);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2krre6xnuk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2npjnpjlvha7fm8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2npjnpjlvha7fm8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ClassUtilsTest.test_isAssignable_ClassArray_ClassArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),30908,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2krre6xnuk() throws Exception{try{__CLR4_5_2npjnpjlvha7fm8.R.inc(30908);
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30909);final Class<?>[] array2 = new Class[] {Object.class, Object.class};
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30910);final Class<?>[] array1 = new Class[] {Object.class};
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30911);final Class<?>[] array1s = new Class[] {String.class};
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30912);final Class<?>[] array0 = new Class[] {};
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30913);final Class<?>[] arrayPrimitives = { Integer.TYPE, Boolean.TYPE };
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30914);final Class<?>[] arrayWrappers = { Integer.class, Boolean.class };

        __CLR4_5_2npjnpjlvha7fm8.R.inc(30915);assertFalse(ClassUtils.isAssignable(array1, array2));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30916);assertFalse(ClassUtils.isAssignable(null, array2));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30917);assertTrue(ClassUtils.isAssignable(null, array0));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30918);assertTrue(ClassUtils.isAssignable(array0, array0));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30919);assertTrue(ClassUtils.isAssignable(array0, (Class<?>[]) null)); // explicit cast to avoid warning
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30920);assertTrue(ClassUtils.isAssignable((Class[]) null, (Class<?>[]) null)); // explicit cast to avoid warning

        __CLR4_5_2npjnpjlvha7fm8.R.inc(30921);assertFalse(ClassUtils.isAssignable(array1, array1s));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30922);assertTrue(ClassUtils.isAssignable(array1s, array1s));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30923);assertTrue(ClassUtils.isAssignable(array1s, array1));

        __CLR4_5_2npjnpjlvha7fm8.R.inc(30924);assertTrue(ClassUtils.isAssignable(arrayPrimitives, arrayWrappers));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30925);assertTrue(ClassUtils.isAssignable(arrayWrappers, arrayPrimitives));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30926);assertFalse(ClassUtils.isAssignable(arrayPrimitives, array1));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30927);assertFalse(ClassUtils.isAssignable(arrayWrappers, array1));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30928);assertTrue(ClassUtils.isAssignable(arrayPrimitives, array2));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30929);assertTrue(ClassUtils.isAssignable(arrayWrappers, array2));
    }finally{__CLR4_5_2npjnpjlvha7fm8.R.flushNeeded();}}

    @Test
    public void test_isAssignable_ClassArray_ClassArray_Autoboxing() throws Exception {__CLR4_5_2npjnpjlvha7fm8.R.globalSliceStart(getClass().getName(),30930);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2sicsfgnv6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2npjnpjlvha7fm8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2npjnpjlvha7fm8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ClassUtilsTest.test_isAssignable_ClassArray_ClassArray_Autoboxing",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),30930,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2sicsfgnv6() throws Exception{try{__CLR4_5_2npjnpjlvha7fm8.R.inc(30930);
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30931);final Class<?>[] array2 = new Class[] {Object.class, Object.class};
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30932);final Class<?>[] array1 = new Class[] {Object.class};
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30933);final Class<?>[] array1s = new Class[] {String.class};
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30934);final Class<?>[] array0 = new Class[] {};
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30935);final Class<?>[] arrayPrimitives = { Integer.TYPE, Boolean.TYPE };
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30936);final Class<?>[] arrayWrappers = { Integer.class, Boolean.class };

        __CLR4_5_2npjnpjlvha7fm8.R.inc(30937);assertFalse(ClassUtils.isAssignable(array1, array2, true));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30938);assertFalse(ClassUtils.isAssignable(null, array2, true));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30939);assertTrue(ClassUtils.isAssignable(null, array0, true));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30940);assertTrue(ClassUtils.isAssignable(array0, array0, true));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30941);assertTrue(ClassUtils.isAssignable(array0, null, true));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30942);assertTrue(ClassUtils.isAssignable((Class[]) null, null, true));

        __CLR4_5_2npjnpjlvha7fm8.R.inc(30943);assertFalse(ClassUtils.isAssignable(array1, array1s, true));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30944);assertTrue(ClassUtils.isAssignable(array1s, array1s, true));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30945);assertTrue(ClassUtils.isAssignable(array1s, array1, true));

        __CLR4_5_2npjnpjlvha7fm8.R.inc(30946);assertTrue(ClassUtils.isAssignable(arrayPrimitives, arrayWrappers, true));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30947);assertTrue(ClassUtils.isAssignable(arrayWrappers, arrayPrimitives, true));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30948);assertFalse(ClassUtils.isAssignable(arrayPrimitives, array1, true));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30949);assertFalse(ClassUtils.isAssignable(arrayWrappers, array1, true));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30950);assertTrue(ClassUtils.isAssignable(arrayPrimitives, array2, true));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30951);assertTrue(ClassUtils.isAssignable(arrayWrappers, array2, true));
    }finally{__CLR4_5_2npjnpjlvha7fm8.R.flushNeeded();}}

    @Test
    public void test_isAssignable_ClassArray_ClassArray_NoAutoboxing() throws Exception {__CLR4_5_2npjnpjlvha7fm8.R.globalSliceStart(getClass().getName(),30952);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_246kii5nvs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2npjnpjlvha7fm8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2npjnpjlvha7fm8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ClassUtilsTest.test_isAssignable_ClassArray_ClassArray_NoAutoboxing",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),30952,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_246kii5nvs() throws Exception{try{__CLR4_5_2npjnpjlvha7fm8.R.inc(30952);
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30953);final Class<?>[] array2 = new Class[] {Object.class, Object.class};
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30954);final Class<?>[] array1 = new Class[] {Object.class};
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30955);final Class<?>[] array1s = new Class[] {String.class};
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30956);final Class<?>[] array0 = new Class[] {};
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30957);final Class<?>[] arrayPrimitives = { Integer.TYPE, Boolean.TYPE };
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30958);final Class<?>[] arrayWrappers = { Integer.class, Boolean.class };

        __CLR4_5_2npjnpjlvha7fm8.R.inc(30959);assertFalse(ClassUtils.isAssignable(array1, array2, false));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30960);assertFalse(ClassUtils.isAssignable(null, array2, false));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30961);assertTrue(ClassUtils.isAssignable(null, array0, false));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30962);assertTrue(ClassUtils.isAssignable(array0, array0, false));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30963);assertTrue(ClassUtils.isAssignable(array0, null, false));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30964);assertTrue(ClassUtils.isAssignable((Class[]) null, null, false));

        __CLR4_5_2npjnpjlvha7fm8.R.inc(30965);assertFalse(ClassUtils.isAssignable(array1, array1s, false));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30966);assertTrue(ClassUtils.isAssignable(array1s, array1s, false));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30967);assertTrue(ClassUtils.isAssignable(array1s, array1, false));

        __CLR4_5_2npjnpjlvha7fm8.R.inc(30968);assertFalse(ClassUtils.isAssignable(arrayPrimitives, arrayWrappers, false));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30969);assertFalse(ClassUtils.isAssignable(arrayWrappers, arrayPrimitives, false));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30970);assertFalse(ClassUtils.isAssignable(arrayPrimitives, array1, false));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30971);assertFalse(ClassUtils.isAssignable(arrayWrappers, array1, false));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30972);assertTrue(ClassUtils.isAssignable(arrayWrappers, array2, false));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30973);assertFalse(ClassUtils.isAssignable(arrayPrimitives, array2, false));
    }finally{__CLR4_5_2npjnpjlvha7fm8.R.flushNeeded();}}

    @Test
    public void test_isAssignable() throws Exception {__CLR4_5_2npjnpjlvha7fm8.R.globalSliceStart(getClass().getName(),30974);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gykv3bnwe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2npjnpjlvha7fm8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2npjnpjlvha7fm8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ClassUtilsTest.test_isAssignable",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),30974,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gykv3bnwe() throws Exception{try{__CLR4_5_2npjnpjlvha7fm8.R.inc(30974);
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30975);assertFalse(ClassUtils.isAssignable((Class<?>) null, null));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30976);assertFalse(ClassUtils.isAssignable(String.class, null));

        __CLR4_5_2npjnpjlvha7fm8.R.inc(30977);assertTrue(ClassUtils.isAssignable(null, Object.class));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30978);assertTrue(ClassUtils.isAssignable(null, Integer.class));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30979);assertFalse(ClassUtils.isAssignable(null, Integer.TYPE));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30980);assertTrue(ClassUtils.isAssignable(String.class, Object.class));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30981);assertTrue(ClassUtils.isAssignable(String.class, String.class));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30982);assertFalse(ClassUtils.isAssignable(Object.class, String.class));

        __CLR4_5_2npjnpjlvha7fm8.R.inc(30983);assertTrue(ClassUtils.isAssignable(Integer.TYPE, Integer.class));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30984);assertTrue(ClassUtils.isAssignable(Integer.TYPE, Object.class));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30985);assertTrue(ClassUtils.isAssignable(Integer.class, Integer.TYPE));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30986);assertTrue(ClassUtils.isAssignable(Integer.class, Object.class));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30987);assertTrue(ClassUtils.isAssignable(Integer.TYPE, Integer.TYPE));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30988);assertTrue(ClassUtils.isAssignable(Integer.class, Integer.class));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30989);assertTrue(ClassUtils.isAssignable(Boolean.TYPE, Boolean.class));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30990);assertTrue(ClassUtils.isAssignable(Boolean.TYPE, Object.class));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30991);assertTrue(ClassUtils.isAssignable(Boolean.class, Boolean.TYPE));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30992);assertTrue(ClassUtils.isAssignable(Boolean.class, Object.class));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30993);assertTrue(ClassUtils.isAssignable(Boolean.TYPE, Boolean.TYPE));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30994);assertTrue(ClassUtils.isAssignable(Boolean.class, Boolean.class));
    }finally{__CLR4_5_2npjnpjlvha7fm8.R.flushNeeded();}}

    @Test
    public void test_isAssignable_Autoboxing() throws Exception {__CLR4_5_2npjnpjlvha7fm8.R.globalSliceStart(getClass().getName(),30995);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_254f9bgnwz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2npjnpjlvha7fm8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2npjnpjlvha7fm8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ClassUtilsTest.test_isAssignable_Autoboxing",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),30995,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_254f9bgnwz() throws Exception{try{__CLR4_5_2npjnpjlvha7fm8.R.inc(30995);
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30996);assertFalse(ClassUtils.isAssignable((Class<?>) null, null, true));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30997);assertFalse(ClassUtils.isAssignable(String.class, null, true));

        __CLR4_5_2npjnpjlvha7fm8.R.inc(30998);assertTrue(ClassUtils.isAssignable(null, Object.class, true));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(30999);assertTrue(ClassUtils.isAssignable(null, Integer.class, true));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31000);assertFalse(ClassUtils.isAssignable(null, Integer.TYPE, true));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31001);assertTrue(ClassUtils.isAssignable(String.class, Object.class, true));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31002);assertTrue(ClassUtils.isAssignable(String.class, String.class, true));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31003);assertFalse(ClassUtils.isAssignable(Object.class, String.class, true));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31004);assertTrue(ClassUtils.isAssignable(Integer.TYPE, Integer.class, true));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31005);assertTrue(ClassUtils.isAssignable(Integer.TYPE, Object.class, true));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31006);assertTrue(ClassUtils.isAssignable(Integer.class, Integer.TYPE, true));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31007);assertTrue(ClassUtils.isAssignable(Integer.class, Object.class, true));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31008);assertTrue(ClassUtils.isAssignable(Integer.TYPE, Integer.TYPE, true));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31009);assertTrue(ClassUtils.isAssignable(Integer.class, Integer.class, true));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31010);assertTrue(ClassUtils.isAssignable(Boolean.TYPE, Boolean.class, true));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31011);assertTrue(ClassUtils.isAssignable(Boolean.class, Boolean.TYPE, true));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31012);assertTrue(ClassUtils.isAssignable(Boolean.class, Object.class, true));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31013);assertTrue(ClassUtils.isAssignable(Boolean.TYPE, Boolean.TYPE, true));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31014);assertTrue(ClassUtils.isAssignable(Boolean.class, Boolean.class, true));
    }finally{__CLR4_5_2npjnpjlvha7fm8.R.flushNeeded();}}

    @Test
    public void test_isAssignable_NoAutoboxing() throws Exception {__CLR4_5_2npjnpjlvha7fm8.R.globalSliceStart(getClass().getName(),31015);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2oxxb2rnxj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2npjnpjlvha7fm8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2npjnpjlvha7fm8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ClassUtilsTest.test_isAssignable_NoAutoboxing",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),31015,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2oxxb2rnxj() throws Exception{try{__CLR4_5_2npjnpjlvha7fm8.R.inc(31015);
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31016);assertFalse(ClassUtils.isAssignable((Class<?>) null, null, false));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31017);assertFalse(ClassUtils.isAssignable(String.class, null, false));

        __CLR4_5_2npjnpjlvha7fm8.R.inc(31018);assertTrue(ClassUtils.isAssignable(null, Object.class, false));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31019);assertTrue(ClassUtils.isAssignable(null, Integer.class, false));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31020);assertFalse(ClassUtils.isAssignable(null, Integer.TYPE, false));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31021);assertTrue(ClassUtils.isAssignable(String.class, Object.class, false));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31022);assertTrue(ClassUtils.isAssignable(String.class, String.class, false));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31023);assertFalse(ClassUtils.isAssignable(Object.class, String.class, false));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31024);assertFalse(ClassUtils.isAssignable(Integer.TYPE, Integer.class, false));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31025);assertFalse(ClassUtils.isAssignable(Integer.TYPE, Object.class, false));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31026);assertFalse(ClassUtils.isAssignable(Integer.class, Integer.TYPE, false));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31027);assertTrue(ClassUtils.isAssignable(Integer.TYPE, Integer.TYPE, false));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31028);assertTrue(ClassUtils.isAssignable(Integer.class, Integer.class, false));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31029);assertFalse(ClassUtils.isAssignable(Boolean.TYPE, Boolean.class, false));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31030);assertFalse(ClassUtils.isAssignable(Boolean.TYPE, Object.class, false));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31031);assertFalse(ClassUtils.isAssignable(Boolean.class, Boolean.TYPE, false));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31032);assertTrue(ClassUtils.isAssignable(Boolean.class, Object.class, false));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31033);assertTrue(ClassUtils.isAssignable(Boolean.TYPE, Boolean.TYPE, false));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31034);assertTrue(ClassUtils.isAssignable(Boolean.class, Boolean.class, false));
    }finally{__CLR4_5_2npjnpjlvha7fm8.R.flushNeeded();}}

    @Test
    public void test_isAssignable_Widening() throws Exception {__CLR4_5_2npjnpjlvha7fm8.R.globalSliceStart(getClass().getName(),31035);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2g92xhvny3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2npjnpjlvha7fm8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2npjnpjlvha7fm8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ClassUtilsTest.test_isAssignable_Widening",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),31035,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2g92xhvny3() throws Exception{try{__CLR4_5_2npjnpjlvha7fm8.R.inc(31035);
        // test byte conversions
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31036);assertFalse("byte -> char", ClassUtils.isAssignable(Byte.TYPE, Character.TYPE));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31037);assertTrue("byte -> byte", ClassUtils.isAssignable(Byte.TYPE, Byte.TYPE));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31038);assertTrue("byte -> short", ClassUtils.isAssignable(Byte.TYPE, Short.TYPE));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31039);assertTrue("byte -> int", ClassUtils.isAssignable(Byte.TYPE, Integer.TYPE));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31040);assertTrue("byte -> long", ClassUtils.isAssignable(Byte.TYPE, Long.TYPE));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31041);assertTrue("byte -> float", ClassUtils.isAssignable(Byte.TYPE, Float.TYPE));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31042);assertTrue("byte -> double", ClassUtils.isAssignable(Byte.TYPE, Double.TYPE));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31043);assertFalse("byte -> boolean", ClassUtils.isAssignable(Byte.TYPE, Boolean.TYPE));

        // test short conversions
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31044);assertFalse("short -> char", ClassUtils.isAssignable(Short.TYPE, Character.TYPE));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31045);assertFalse("short -> byte", ClassUtils.isAssignable(Short.TYPE, Byte.TYPE));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31046);assertTrue("short -> short", ClassUtils.isAssignable(Short.TYPE, Short.TYPE));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31047);assertTrue("short -> int", ClassUtils.isAssignable(Short.TYPE, Integer.TYPE));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31048);assertTrue("short -> long", ClassUtils.isAssignable(Short.TYPE, Long.TYPE));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31049);assertTrue("short -> float", ClassUtils.isAssignable(Short.TYPE, Float.TYPE));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31050);assertTrue("short -> double", ClassUtils.isAssignable(Short.TYPE, Double.TYPE));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31051);assertFalse("short -> boolean", ClassUtils.isAssignable(Short.TYPE, Boolean.TYPE));

        // test char conversions
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31052);assertTrue("char -> char", ClassUtils.isAssignable(Character.TYPE, Character.TYPE));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31053);assertFalse("char -> byte", ClassUtils.isAssignable(Character.TYPE, Byte.TYPE));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31054);assertFalse("char -> short", ClassUtils.isAssignable(Character.TYPE, Short.TYPE));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31055);assertTrue("char -> int", ClassUtils.isAssignable(Character.TYPE, Integer.TYPE));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31056);assertTrue("char -> long", ClassUtils.isAssignable(Character.TYPE, Long.TYPE));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31057);assertTrue("char -> float", ClassUtils.isAssignable(Character.TYPE, Float.TYPE));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31058);assertTrue("char -> double", ClassUtils.isAssignable(Character.TYPE, Double.TYPE));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31059);assertFalse("char -> boolean", ClassUtils.isAssignable(Character.TYPE, Boolean.TYPE));

        // test int conversions
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31060);assertFalse("int -> char", ClassUtils.isAssignable(Integer.TYPE, Character.TYPE));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31061);assertFalse("int -> byte", ClassUtils.isAssignable(Integer.TYPE, Byte.TYPE));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31062);assertFalse("int -> short", ClassUtils.isAssignable(Integer.TYPE, Short.TYPE));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31063);assertTrue("int -> int", ClassUtils.isAssignable(Integer.TYPE, Integer.TYPE));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31064);assertTrue("int -> long", ClassUtils.isAssignable(Integer.TYPE, Long.TYPE));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31065);assertTrue("int -> float", ClassUtils.isAssignable(Integer.TYPE, Float.TYPE));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31066);assertTrue("int -> double", ClassUtils.isAssignable(Integer.TYPE, Double.TYPE));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31067);assertFalse("int -> boolean", ClassUtils.isAssignable(Integer.TYPE, Boolean.TYPE));

        // test long conversions
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31068);assertFalse("long -> char", ClassUtils.isAssignable(Long.TYPE, Character.TYPE));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31069);assertFalse("long -> byte", ClassUtils.isAssignable(Long.TYPE, Byte.TYPE));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31070);assertFalse("long -> short", ClassUtils.isAssignable(Long.TYPE, Short.TYPE));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31071);assertFalse("long -> int", ClassUtils.isAssignable(Long.TYPE, Integer.TYPE));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31072);assertTrue("long -> long", ClassUtils.isAssignable(Long.TYPE, Long.TYPE));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31073);assertTrue("long -> float", ClassUtils.isAssignable(Long.TYPE, Float.TYPE));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31074);assertTrue("long -> double", ClassUtils.isAssignable(Long.TYPE, Double.TYPE));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31075);assertFalse("long -> boolean", ClassUtils.isAssignable(Long.TYPE, Boolean.TYPE));

        // test float conversions
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31076);assertFalse("float -> char", ClassUtils.isAssignable(Float.TYPE, Character.TYPE));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31077);assertFalse("float -> byte", ClassUtils.isAssignable(Float.TYPE, Byte.TYPE));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31078);assertFalse("float -> short", ClassUtils.isAssignable(Float.TYPE, Short.TYPE));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31079);assertFalse("float -> int", ClassUtils.isAssignable(Float.TYPE, Integer.TYPE));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31080);assertFalse("float -> long", ClassUtils.isAssignable(Float.TYPE, Long.TYPE));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31081);assertTrue("float -> float", ClassUtils.isAssignable(Float.TYPE, Float.TYPE));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31082);assertTrue("float -> double", ClassUtils.isAssignable(Float.TYPE, Double.TYPE));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31083);assertFalse("float -> boolean", ClassUtils.isAssignable(Float.TYPE, Boolean.TYPE));

        // test double conversions
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31084);assertFalse("double -> char", ClassUtils.isAssignable(Double.TYPE, Character.TYPE));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31085);assertFalse("double -> byte", ClassUtils.isAssignable(Double.TYPE, Byte.TYPE));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31086);assertFalse("double -> short", ClassUtils.isAssignable(Double.TYPE, Short.TYPE));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31087);assertFalse("double -> int", ClassUtils.isAssignable(Double.TYPE, Integer.TYPE));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31088);assertFalse("double -> long", ClassUtils.isAssignable(Double.TYPE, Long.TYPE));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31089);assertFalse("double -> float", ClassUtils.isAssignable(Double.TYPE, Float.TYPE));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31090);assertTrue("double -> double", ClassUtils.isAssignable(Double.TYPE, Double.TYPE));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31091);assertFalse("double -> boolean", ClassUtils.isAssignable(Double.TYPE, Boolean.TYPE));

        // test boolean conversions
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31092);assertFalse("boolean -> char", ClassUtils.isAssignable(Boolean.TYPE, Character.TYPE));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31093);assertFalse("boolean -> byte", ClassUtils.isAssignable(Boolean.TYPE, Byte.TYPE));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31094);assertFalse("boolean -> short", ClassUtils.isAssignable(Boolean.TYPE, Short.TYPE));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31095);assertFalse("boolean -> int", ClassUtils.isAssignable(Boolean.TYPE, Integer.TYPE));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31096);assertFalse("boolean -> long", ClassUtils.isAssignable(Boolean.TYPE, Long.TYPE));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31097);assertFalse("boolean -> float", ClassUtils.isAssignable(Boolean.TYPE, Float.TYPE));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31098);assertFalse("boolean -> double", ClassUtils.isAssignable(Boolean.TYPE, Double.TYPE));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31099);assertTrue("boolean -> boolean", ClassUtils.isAssignable(Boolean.TYPE, Boolean.TYPE));
    }finally{__CLR4_5_2npjnpjlvha7fm8.R.flushNeeded();}}

    @Test
    public void test_isAssignable_DefaultUnboxing_Widening() throws Exception {__CLR4_5_2npjnpjlvha7fm8.R.globalSliceStart(getClass().getName(),31100);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ev99k5nzw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2npjnpjlvha7fm8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2npjnpjlvha7fm8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ClassUtilsTest.test_isAssignable_DefaultUnboxing_Widening",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),31100,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ev99k5nzw() throws Exception{try{__CLR4_5_2npjnpjlvha7fm8.R.inc(31100);
        // test byte conversions
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31101);assertFalse("byte -> char", ClassUtils.isAssignable(Byte.class, Character.TYPE));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31102);assertTrue("byte -> byte", ClassUtils.isAssignable(Byte.class, Byte.TYPE));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31103);assertTrue("byte -> short", ClassUtils.isAssignable(Byte.class, Short.TYPE));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31104);assertTrue("byte -> int", ClassUtils.isAssignable(Byte.class, Integer.TYPE));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31105);assertTrue("byte -> long", ClassUtils.isAssignable(Byte.class, Long.TYPE));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31106);assertTrue("byte -> float", ClassUtils.isAssignable(Byte.class, Float.TYPE));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31107);assertTrue("byte -> double", ClassUtils.isAssignable(Byte.class, Double.TYPE));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31108);assertFalse("byte -> boolean", ClassUtils.isAssignable(Byte.class, Boolean.TYPE));

        // test short conversions
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31109);assertFalse("short -> char", ClassUtils.isAssignable(Short.class, Character.TYPE));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31110);assertFalse("short -> byte", ClassUtils.isAssignable(Short.class, Byte.TYPE));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31111);assertTrue("short -> short", ClassUtils.isAssignable(Short.class, Short.TYPE));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31112);assertTrue("short -> int", ClassUtils.isAssignable(Short.class, Integer.TYPE));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31113);assertTrue("short -> long", ClassUtils.isAssignable(Short.class, Long.TYPE));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31114);assertTrue("short -> float", ClassUtils.isAssignable(Short.class, Float.TYPE));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31115);assertTrue("short -> double", ClassUtils.isAssignable(Short.class, Double.TYPE));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31116);assertFalse("short -> boolean", ClassUtils.isAssignable(Short.class, Boolean.TYPE));

        // test char conversions
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31117);assertTrue("char -> char", ClassUtils.isAssignable(Character.class, Character.TYPE));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31118);assertFalse("char -> byte", ClassUtils.isAssignable(Character.class, Byte.TYPE));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31119);assertFalse("char -> short", ClassUtils.isAssignable(Character.class, Short.TYPE));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31120);assertTrue("char -> int", ClassUtils.isAssignable(Character.class, Integer.TYPE));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31121);assertTrue("char -> long", ClassUtils.isAssignable(Character.class, Long.TYPE));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31122);assertTrue("char -> float", ClassUtils.isAssignable(Character.class, Float.TYPE));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31123);assertTrue("char -> double", ClassUtils.isAssignable(Character.class, Double.TYPE));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31124);assertFalse("char -> boolean", ClassUtils.isAssignable(Character.class, Boolean.TYPE));

        // test int conversions
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31125);assertFalse("int -> char", ClassUtils.isAssignable(Integer.class, Character.TYPE));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31126);assertFalse("int -> byte", ClassUtils.isAssignable(Integer.class, Byte.TYPE));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31127);assertFalse("int -> short", ClassUtils.isAssignable(Integer.class, Short.TYPE));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31128);assertTrue("int -> int", ClassUtils.isAssignable(Integer.class, Integer.TYPE));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31129);assertTrue("int -> long", ClassUtils.isAssignable(Integer.class, Long.TYPE));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31130);assertTrue("int -> float", ClassUtils.isAssignable(Integer.class, Float.TYPE));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31131);assertTrue("int -> double", ClassUtils.isAssignable(Integer.class, Double.TYPE));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31132);assertFalse("int -> boolean", ClassUtils.isAssignable(Integer.class, Boolean.TYPE));

        // test long conversions
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31133);assertFalse("long -> char", ClassUtils.isAssignable(Long.class, Character.TYPE));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31134);assertFalse("long -> byte", ClassUtils.isAssignable(Long.class, Byte.TYPE));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31135);assertFalse("long -> short", ClassUtils.isAssignable(Long.class, Short.TYPE));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31136);assertFalse("long -> int", ClassUtils.isAssignable(Long.class, Integer.TYPE));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31137);assertTrue("long -> long", ClassUtils.isAssignable(Long.class, Long.TYPE));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31138);assertTrue("long -> float", ClassUtils.isAssignable(Long.class, Float.TYPE));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31139);assertTrue("long -> double", ClassUtils.isAssignable(Long.class, Double.TYPE));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31140);assertFalse("long -> boolean", ClassUtils.isAssignable(Long.class, Boolean.TYPE));

        // test float conversions
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31141);assertFalse("float -> char", ClassUtils.isAssignable(Float.class, Character.TYPE));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31142);assertFalse("float -> byte", ClassUtils.isAssignable(Float.class, Byte.TYPE));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31143);assertFalse("float -> short", ClassUtils.isAssignable(Float.class, Short.TYPE));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31144);assertFalse("float -> int", ClassUtils.isAssignable(Float.class, Integer.TYPE));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31145);assertFalse("float -> long", ClassUtils.isAssignable(Float.class, Long.TYPE));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31146);assertTrue("float -> float", ClassUtils.isAssignable(Float.class, Float.TYPE));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31147);assertTrue("float -> double", ClassUtils.isAssignable(Float.class, Double.TYPE));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31148);assertFalse("float -> boolean", ClassUtils.isAssignable(Float.class, Boolean.TYPE));

        // test double conversions
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31149);assertFalse("double -> char", ClassUtils.isAssignable(Double.class, Character.TYPE));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31150);assertFalse("double -> byte", ClassUtils.isAssignable(Double.class, Byte.TYPE));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31151);assertFalse("double -> short", ClassUtils.isAssignable(Double.class, Short.TYPE));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31152);assertFalse("double -> int", ClassUtils.isAssignable(Double.class, Integer.TYPE));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31153);assertFalse("double -> long", ClassUtils.isAssignable(Double.class, Long.TYPE));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31154);assertFalse("double -> float", ClassUtils.isAssignable(Double.class, Float.TYPE));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31155);assertTrue("double -> double", ClassUtils.isAssignable(Double.class, Double.TYPE));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31156);assertFalse("double -> boolean", ClassUtils.isAssignable(Double.class, Boolean.TYPE));

        // test boolean conversions
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31157);assertFalse("boolean -> char", ClassUtils.isAssignable(Boolean.class, Character.TYPE));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31158);assertFalse("boolean -> byte", ClassUtils.isAssignable(Boolean.class, Byte.TYPE));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31159);assertFalse("boolean -> short", ClassUtils.isAssignable(Boolean.class, Short.TYPE));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31160);assertFalse("boolean -> int", ClassUtils.isAssignable(Boolean.class, Integer.TYPE));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31161);assertFalse("boolean -> long", ClassUtils.isAssignable(Boolean.class, Long.TYPE));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31162);assertFalse("boolean -> float", ClassUtils.isAssignable(Boolean.class, Float.TYPE));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31163);assertFalse("boolean -> double", ClassUtils.isAssignable(Boolean.class, Double.TYPE));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31164);assertTrue("boolean -> boolean", ClassUtils.isAssignable(Boolean.class, Boolean.TYPE));
    }finally{__CLR4_5_2npjnpjlvha7fm8.R.flushNeeded();}}

    @Test
    public void test_isAssignable_Unboxing_Widening() throws Exception {__CLR4_5_2npjnpjlvha7fm8.R.globalSliceStart(getClass().getName(),31165);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2dleftuo1p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2npjnpjlvha7fm8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2npjnpjlvha7fm8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ClassUtilsTest.test_isAssignable_Unboxing_Widening",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),31165,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2dleftuo1p() throws Exception{try{__CLR4_5_2npjnpjlvha7fm8.R.inc(31165);
        // test byte conversions
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31166);assertFalse("byte -> char", ClassUtils.isAssignable(Byte.class, Character.TYPE, true));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31167);assertTrue("byte -> byte", ClassUtils.isAssignable(Byte.class, Byte.TYPE, true));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31168);assertTrue("byte -> short", ClassUtils.isAssignable(Byte.class, Short.TYPE, true));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31169);assertTrue("byte -> int", ClassUtils.isAssignable(Byte.class, Integer.TYPE, true));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31170);assertTrue("byte -> long", ClassUtils.isAssignable(Byte.class, Long.TYPE, true));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31171);assertTrue("byte -> float", ClassUtils.isAssignable(Byte.class, Float.TYPE, true));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31172);assertTrue("byte -> double", ClassUtils.isAssignable(Byte.class, Double.TYPE, true));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31173);assertFalse("byte -> boolean", ClassUtils.isAssignable(Byte.class, Boolean.TYPE, true));

        // test short conversions
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31174);assertFalse("short -> char", ClassUtils.isAssignable(Short.class, Character.TYPE, true));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31175);assertFalse("short -> byte", ClassUtils.isAssignable(Short.class, Byte.TYPE, true));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31176);assertTrue("short -> short", ClassUtils.isAssignable(Short.class, Short.TYPE, true));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31177);assertTrue("short -> int", ClassUtils.isAssignable(Short.class, Integer.TYPE, true));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31178);assertTrue("short -> long", ClassUtils.isAssignable(Short.class, Long.TYPE, true));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31179);assertTrue("short -> float", ClassUtils.isAssignable(Short.class, Float.TYPE, true));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31180);assertTrue("short -> double", ClassUtils.isAssignable(Short.class, Double.TYPE, true));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31181);assertFalse("short -> boolean", ClassUtils.isAssignable(Short.class, Boolean.TYPE, true));

        // test char conversions
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31182);assertTrue("char -> char", ClassUtils.isAssignable(Character.class, Character.TYPE, true));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31183);assertFalse("char -> byte", ClassUtils.isAssignable(Character.class, Byte.TYPE, true));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31184);assertFalse("char -> short", ClassUtils.isAssignable(Character.class, Short.TYPE, true));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31185);assertTrue("char -> int", ClassUtils.isAssignable(Character.class, Integer.TYPE, true));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31186);assertTrue("char -> long", ClassUtils.isAssignable(Character.class, Long.TYPE, true));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31187);assertTrue("char -> float", ClassUtils.isAssignable(Character.class, Float.TYPE, true));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31188);assertTrue("char -> double", ClassUtils.isAssignable(Character.class, Double.TYPE, true));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31189);assertFalse("char -> boolean", ClassUtils.isAssignable(Character.class, Boolean.TYPE, true));

        // test int conversions
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31190);assertFalse("int -> char", ClassUtils.isAssignable(Integer.class, Character.TYPE, true));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31191);assertFalse("int -> byte", ClassUtils.isAssignable(Integer.class, Byte.TYPE, true));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31192);assertFalse("int -> short", ClassUtils.isAssignable(Integer.class, Short.TYPE, true));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31193);assertTrue("int -> int", ClassUtils.isAssignable(Integer.class, Integer.TYPE, true));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31194);assertTrue("int -> long", ClassUtils.isAssignable(Integer.class, Long.TYPE, true));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31195);assertTrue("int -> float", ClassUtils.isAssignable(Integer.class, Float.TYPE, true));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31196);assertTrue("int -> double", ClassUtils.isAssignable(Integer.class, Double.TYPE, true));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31197);assertFalse("int -> boolean", ClassUtils.isAssignable(Integer.class, Boolean.TYPE, true));

        // test long conversions
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31198);assertFalse("long -> char", ClassUtils.isAssignable(Long.class, Character.TYPE, true));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31199);assertFalse("long -> byte", ClassUtils.isAssignable(Long.class, Byte.TYPE, true));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31200);assertFalse("long -> short", ClassUtils.isAssignable(Long.class, Short.TYPE, true));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31201);assertFalse("long -> int", ClassUtils.isAssignable(Long.class, Integer.TYPE, true));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31202);assertTrue("long -> long", ClassUtils.isAssignable(Long.class, Long.TYPE, true));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31203);assertTrue("long -> float", ClassUtils.isAssignable(Long.class, Float.TYPE, true));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31204);assertTrue("long -> double", ClassUtils.isAssignable(Long.class, Double.TYPE, true));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31205);assertFalse("long -> boolean", ClassUtils.isAssignable(Long.class, Boolean.TYPE, true));

        // test float conversions
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31206);assertFalse("float -> char", ClassUtils.isAssignable(Float.class, Character.TYPE, true));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31207);assertFalse("float -> byte", ClassUtils.isAssignable(Float.class, Byte.TYPE, true));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31208);assertFalse("float -> short", ClassUtils.isAssignable(Float.class, Short.TYPE, true));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31209);assertFalse("float -> int", ClassUtils.isAssignable(Float.class, Integer.TYPE, true));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31210);assertFalse("float -> long", ClassUtils.isAssignable(Float.class, Long.TYPE, true));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31211);assertTrue("float -> float", ClassUtils.isAssignable(Float.class, Float.TYPE, true));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31212);assertTrue("float -> double", ClassUtils.isAssignable(Float.class, Double.TYPE, true));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31213);assertFalse("float -> boolean", ClassUtils.isAssignable(Float.class, Boolean.TYPE, true));

        // test double conversions
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31214);assertFalse("double -> char", ClassUtils.isAssignable(Double.class, Character.TYPE, true));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31215);assertFalse("double -> byte", ClassUtils.isAssignable(Double.class, Byte.TYPE, true));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31216);assertFalse("double -> short", ClassUtils.isAssignable(Double.class, Short.TYPE, true));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31217);assertFalse("double -> int", ClassUtils.isAssignable(Double.class, Integer.TYPE, true));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31218);assertFalse("double -> long", ClassUtils.isAssignable(Double.class, Long.TYPE, true));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31219);assertFalse("double -> float", ClassUtils.isAssignable(Double.class, Float.TYPE, true));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31220);assertTrue("double -> double", ClassUtils.isAssignable(Double.class, Double.TYPE, true));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31221);assertFalse("double -> boolean", ClassUtils.isAssignable(Double.class, Boolean.TYPE, true));

        // test boolean conversions
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31222);assertFalse("boolean -> char", ClassUtils.isAssignable(Boolean.class, Character.TYPE, true));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31223);assertFalse("boolean -> byte", ClassUtils.isAssignable(Boolean.class, Byte.TYPE, true));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31224);assertFalse("boolean -> short", ClassUtils.isAssignable(Boolean.class, Short.TYPE, true));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31225);assertFalse("boolean -> int", ClassUtils.isAssignable(Boolean.class, Integer.TYPE, true));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31226);assertFalse("boolean -> long", ClassUtils.isAssignable(Boolean.class, Long.TYPE, true));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31227);assertFalse("boolean -> float", ClassUtils.isAssignable(Boolean.class, Float.TYPE, true));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31228);assertFalse("boolean -> double", ClassUtils.isAssignable(Boolean.class, Double.TYPE, true));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31229);assertTrue("boolean -> boolean", ClassUtils.isAssignable(Boolean.class, Boolean.TYPE, true));
    }finally{__CLR4_5_2npjnpjlvha7fm8.R.flushNeeded();}}

    @Test
    public void testIsPrimitiveOrWrapper() {__CLR4_5_2npjnpjlvha7fm8.R.globalSliceStart(getClass().getName(),31230);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_211zy6so3i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2npjnpjlvha7fm8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2npjnpjlvha7fm8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ClassUtilsTest.testIsPrimitiveOrWrapper",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),31230,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_211zy6so3i(){try{__CLR4_5_2npjnpjlvha7fm8.R.inc(31230);

        // test primitive wrapper classes
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31231);assertTrue("Boolean.class", ClassUtils.isPrimitiveOrWrapper(Boolean.class));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31232);assertTrue("Byte.class", ClassUtils.isPrimitiveOrWrapper(Byte.class));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31233);assertTrue("Character.class", ClassUtils.isPrimitiveOrWrapper(Character.class));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31234);assertTrue("Short.class", ClassUtils.isPrimitiveOrWrapper(Short.class));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31235);assertTrue("Integer.class", ClassUtils.isPrimitiveOrWrapper(Integer.class));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31236);assertTrue("Long.class", ClassUtils.isPrimitiveOrWrapper(Long.class));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31237);assertTrue("Double.class", ClassUtils.isPrimitiveOrWrapper(Double.class));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31238);assertTrue("Float.class", ClassUtils.isPrimitiveOrWrapper(Float.class));
        
        // test primitive classes
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31239);assertTrue("boolean", ClassUtils.isPrimitiveOrWrapper(Boolean.TYPE));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31240);assertTrue("byte", ClassUtils.isPrimitiveOrWrapper(Byte.TYPE));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31241);assertTrue("char", ClassUtils.isPrimitiveOrWrapper(Character.TYPE));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31242);assertTrue("short", ClassUtils.isPrimitiveOrWrapper(Short.TYPE));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31243);assertTrue("int", ClassUtils.isPrimitiveOrWrapper(Integer.TYPE));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31244);assertTrue("long", ClassUtils.isPrimitiveOrWrapper(Long.TYPE));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31245);assertTrue("double", ClassUtils.isPrimitiveOrWrapper(Double.TYPE));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31246);assertTrue("float", ClassUtils.isPrimitiveOrWrapper(Float.TYPE));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31247);assertTrue("Void.TYPE", ClassUtils.isPrimitiveOrWrapper(Void.TYPE));
        
        // others
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31248);assertFalse("null", ClassUtils.isPrimitiveOrWrapper(null));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31249);assertFalse("Void.class", ClassUtils.isPrimitiveOrWrapper(Void.class));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31250);assertFalse("String.class", ClassUtils.isPrimitiveOrWrapper(String.class));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31251);assertFalse("this.getClass()", ClassUtils.isPrimitiveOrWrapper(this.getClass()));
    }finally{__CLR4_5_2npjnpjlvha7fm8.R.flushNeeded();}}
    
    @Test
    public void testIsPrimitiveWrapper() {__CLR4_5_2npjnpjlvha7fm8.R.globalSliceStart(getClass().getName(),31252);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23m013lo44();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2npjnpjlvha7fm8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2npjnpjlvha7fm8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ClassUtilsTest.testIsPrimitiveWrapper",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),31252,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23m013lo44(){try{__CLR4_5_2npjnpjlvha7fm8.R.inc(31252);

        // test primitive wrapper classes
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31253);assertTrue("Boolean.class", ClassUtils.isPrimitiveWrapper(Boolean.class));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31254);assertTrue("Byte.class", ClassUtils.isPrimitiveWrapper(Byte.class));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31255);assertTrue("Character.class", ClassUtils.isPrimitiveWrapper(Character.class));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31256);assertTrue("Short.class", ClassUtils.isPrimitiveWrapper(Short.class));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31257);assertTrue("Integer.class", ClassUtils.isPrimitiveWrapper(Integer.class));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31258);assertTrue("Long.class", ClassUtils.isPrimitiveWrapper(Long.class));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31259);assertTrue("Double.class", ClassUtils.isPrimitiveWrapper(Double.class));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31260);assertTrue("Float.class", ClassUtils.isPrimitiveWrapper(Float.class));
        
        // test primitive classes
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31261);assertFalse("boolean", ClassUtils.isPrimitiveWrapper(Boolean.TYPE));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31262);assertFalse("byte", ClassUtils.isPrimitiveWrapper(Byte.TYPE));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31263);assertFalse("char", ClassUtils.isPrimitiveWrapper(Character.TYPE));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31264);assertFalse("short", ClassUtils.isPrimitiveWrapper(Short.TYPE));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31265);assertFalse("int", ClassUtils.isPrimitiveWrapper(Integer.TYPE));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31266);assertFalse("long", ClassUtils.isPrimitiveWrapper(Long.TYPE));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31267);assertFalse("double", ClassUtils.isPrimitiveWrapper(Double.TYPE));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31268);assertFalse("float", ClassUtils.isPrimitiveWrapper(Float.TYPE));
        
        // others
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31269);assertFalse("null", ClassUtils.isPrimitiveWrapper(null));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31270);assertFalse("Void.class", ClassUtils.isPrimitiveWrapper(Void.class));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31271);assertFalse("Void.TYPE", ClassUtils.isPrimitiveWrapper(Void.TYPE));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31272);assertFalse("String.class", ClassUtils.isPrimitiveWrapper(String.class));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31273);assertFalse("this.getClass()", ClassUtils.isPrimitiveWrapper(this.getClass()));
    }finally{__CLR4_5_2npjnpjlvha7fm8.R.flushNeeded();}}
    
    @Test
    public void testPrimitiveToWrapper() {__CLR4_5_2npjnpjlvha7fm8.R.globalSliceStart(getClass().getName(),31274);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_25xvma2o4q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2npjnpjlvha7fm8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2npjnpjlvha7fm8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ClassUtilsTest.testPrimitiveToWrapper",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),31274,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_25xvma2o4q(){try{__CLR4_5_2npjnpjlvha7fm8.R.inc(31274);

        // test primitive classes
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31275);assertEquals("boolean -> Boolean.class",
            Boolean.class, ClassUtils.primitiveToWrapper(Boolean.TYPE));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31276);assertEquals("byte -> Byte.class",
            Byte.class, ClassUtils.primitiveToWrapper(Byte.TYPE));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31277);assertEquals("char -> Character.class",
            Character.class, ClassUtils.primitiveToWrapper(Character.TYPE));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31278);assertEquals("short -> Short.class",
            Short.class, ClassUtils.primitiveToWrapper(Short.TYPE));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31279);assertEquals("int -> Integer.class",
            Integer.class, ClassUtils.primitiveToWrapper(Integer.TYPE));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31280);assertEquals("long -> Long.class",
            Long.class, ClassUtils.primitiveToWrapper(Long.TYPE));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31281);assertEquals("double -> Double.class",
            Double.class, ClassUtils.primitiveToWrapper(Double.TYPE));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31282);assertEquals("float -> Float.class",
            Float.class, ClassUtils.primitiveToWrapper(Float.TYPE));

        // test a few other classes
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31283);assertEquals("String.class -> String.class",
            String.class, ClassUtils.primitiveToWrapper(String.class));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31284);assertEquals("ClassUtils.class -> ClassUtils.class",
            org.apache.commons.lang3.ClassUtils.class,
            ClassUtils.primitiveToWrapper(org.apache.commons.lang3.ClassUtils.class));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31285);assertEquals("Void.TYPE -> Void.TYPE",
            Void.TYPE, ClassUtils.primitiveToWrapper(Void.TYPE));

        // test null
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31286);assertNull("null -> null",
            ClassUtils.primitiveToWrapper(null));
    }finally{__CLR4_5_2npjnpjlvha7fm8.R.flushNeeded();}}

    @Test
    public void testPrimitivesToWrappers() {__CLR4_5_2npjnpjlvha7fm8.R.globalSliceStart(getClass().getName(),31287);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vjzg00o53();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2npjnpjlvha7fm8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2npjnpjlvha7fm8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ClassUtilsTest.testPrimitivesToWrappers",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),31287,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vjzg00o53(){try{__CLR4_5_2npjnpjlvha7fm8.R.inc(31287);
        // test null
//        assertNull("null -> null", ClassUtils.primitivesToWrappers(null)); // generates warning
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31288);assertNull("null -> null", ClassUtils.primitivesToWrappers((Class<?>[]) null)); // equivalent cast to avoid warning
        // Other possible casts for null
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31289);assertTrue("empty -> empty", Arrays.equals(ArrayUtils.EMPTY_CLASS_ARRAY, ClassUtils.primitivesToWrappers()));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31290);final Class<?>[] castNull = ClassUtils.primitivesToWrappers((Class<?>)null); // == new Class<?>[]{null}
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31291);assertTrue("(Class<?>)null -> [null]", Arrays.equals(new Class<?>[]{null}, castNull));
        // test empty array is returned unchanged
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31292);assertArrayEquals("empty -> empty",
                ArrayUtils.EMPTY_CLASS_ARRAY, ClassUtils.primitivesToWrappers(ArrayUtils.EMPTY_CLASS_ARRAY));

        // test an array of various classes
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31293);final Class<?>[] primitives = new Class[] {
                Boolean.TYPE, Byte.TYPE, Character.TYPE, Short.TYPE,
                Integer.TYPE, Long.TYPE, Double.TYPE, Float.TYPE,
                String.class, ClassUtils.class
        };
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31294);final Class<?>[] wrappers= ClassUtils.primitivesToWrappers(primitives);

        __CLR4_5_2npjnpjlvha7fm8.R.inc(31295);for (int i=0; (((i < primitives.length)&&(__CLR4_5_2npjnpjlvha7fm8.R.iget(31296)!=0|true))||(__CLR4_5_2npjnpjlvha7fm8.R.iget(31297)==0&false)); i++) {{
            // test each returned wrapper
            __CLR4_5_2npjnpjlvha7fm8.R.inc(31298);final Class<?> primitive = primitives[i];
            __CLR4_5_2npjnpjlvha7fm8.R.inc(31299);final Class<?> expectedWrapper = ClassUtils.primitiveToWrapper(primitive);

            __CLR4_5_2npjnpjlvha7fm8.R.inc(31300);assertEquals(primitive + " -> " + expectedWrapper, expectedWrapper, wrappers[i]);
        }

        // test an array of no primitive classes
        }__CLR4_5_2npjnpjlvha7fm8.R.inc(31301);final Class<?>[] noPrimitives = new Class[] {
                String.class, ClassUtils.class, Void.TYPE
        };
        // This used to return the exact same array, but no longer does.
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31302);assertNotSame("unmodified", noPrimitives, ClassUtils.primitivesToWrappers(noPrimitives));
    }finally{__CLR4_5_2npjnpjlvha7fm8.R.flushNeeded();}}

    @Test
    public void testWrapperToPrimitive() {__CLR4_5_2npjnpjlvha7fm8.R.globalSliceStart(getClass().getName(),31303);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ebqz7yo5j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2npjnpjlvha7fm8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2npjnpjlvha7fm8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ClassUtilsTest.testWrapperToPrimitive",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),31303,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ebqz7yo5j(){try{__CLR4_5_2npjnpjlvha7fm8.R.inc(31303);
        // an array with classes to convert
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31304);final Class<?>[] primitives = {
                Boolean.TYPE, Byte.TYPE, Character.TYPE, Short.TYPE,
                Integer.TYPE, Long.TYPE, Float.TYPE, Double.TYPE
        };
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31305);for (final Class<?> primitive : primitives) {{
            __CLR4_5_2npjnpjlvha7fm8.R.inc(31306);final Class<?> wrapperCls = ClassUtils.primitiveToWrapper(primitive);
            __CLR4_5_2npjnpjlvha7fm8.R.inc(31307);assertFalse("Still primitive", wrapperCls.isPrimitive());
            __CLR4_5_2npjnpjlvha7fm8.R.inc(31308);assertEquals(wrapperCls + " -> " + primitive, primitive,
                    ClassUtils.wrapperToPrimitive(wrapperCls));
        }
    }}finally{__CLR4_5_2npjnpjlvha7fm8.R.flushNeeded();}}

    @Test
    public void testWrapperToPrimitiveNoWrapper() {__CLR4_5_2npjnpjlvha7fm8.R.globalSliceStart(getClass().getName(),31309);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_25rydimo5p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2npjnpjlvha7fm8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2npjnpjlvha7fm8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ClassUtilsTest.testWrapperToPrimitiveNoWrapper",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),31309,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_25rydimo5p(){try{__CLR4_5_2npjnpjlvha7fm8.R.inc(31309);
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31310);assertNull("Wrong result for non wrapper class", ClassUtils.wrapperToPrimitive(String.class));
    }finally{__CLR4_5_2npjnpjlvha7fm8.R.flushNeeded();}}

    @Test
    public void testWrapperToPrimitiveNull() {__CLR4_5_2npjnpjlvha7fm8.R.globalSliceStart(getClass().getName(),31311);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2fusfifo5r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2npjnpjlvha7fm8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2npjnpjlvha7fm8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ClassUtilsTest.testWrapperToPrimitiveNull",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),31311,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2fusfifo5r(){try{__CLR4_5_2npjnpjlvha7fm8.R.inc(31311);
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31312);assertNull("Wrong result for null class", ClassUtils.wrapperToPrimitive(null));
    }finally{__CLR4_5_2npjnpjlvha7fm8.R.flushNeeded();}}

    @Test
    public void testWrappersToPrimitives() {__CLR4_5_2npjnpjlvha7fm8.R.globalSliceStart(getClass().getName(),31313);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ow2z5so5t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2npjnpjlvha7fm8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2npjnpjlvha7fm8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ClassUtilsTest.testWrappersToPrimitives",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),31313,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ow2z5so5t(){try{__CLR4_5_2npjnpjlvha7fm8.R.inc(31313);
        // an array with classes to test
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31314);final Class<?>[] classes = {
                Boolean.class, Byte.class, Character.class, Short.class,
                Integer.class, Long.class, Float.class, Double.class,
                String.class, ClassUtils.class, null
        };

        __CLR4_5_2npjnpjlvha7fm8.R.inc(31315);final Class<?>[] primitives = ClassUtils.wrappersToPrimitives(classes);
        // now test the result
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31316);assertEquals("Wrong length of result array", classes.length, primitives.length);
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31317);for (int i = 0; (((i < classes.length)&&(__CLR4_5_2npjnpjlvha7fm8.R.iget(31318)!=0|true))||(__CLR4_5_2npjnpjlvha7fm8.R.iget(31319)==0&false)); i++) {{
            __CLR4_5_2npjnpjlvha7fm8.R.inc(31320);final Class<?> expectedPrimitive = ClassUtils.wrapperToPrimitive(classes[i]);
            __CLR4_5_2npjnpjlvha7fm8.R.inc(31321);assertEquals(classes[i] + " -> " + expectedPrimitive, expectedPrimitive,
                    primitives[i]);
        }
    }}finally{__CLR4_5_2npjnpjlvha7fm8.R.flushNeeded();}}

    @Test
    public void testWrappersToPrimitivesNull() {__CLR4_5_2npjnpjlvha7fm8.R.globalSliceStart(getClass().getName(),31322);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2xcgh53o62();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2npjnpjlvha7fm8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2npjnpjlvha7fm8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ClassUtilsTest.testWrappersToPrimitivesNull",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),31322,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2xcgh53o62(){try{__CLR4_5_2npjnpjlvha7fm8.R.inc(31322);
//        assertNull("Wrong result for null input", ClassUtils.wrappersToPrimitives(null)); // generates warning
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31323);assertNull("Wrong result for null input", ClassUtils.wrappersToPrimitives((Class<?>[]) null)); // equivalent cast
        // Other possible casts for null
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31324);assertTrue("empty -> empty", Arrays.equals(ArrayUtils.EMPTY_CLASS_ARRAY, ClassUtils.wrappersToPrimitives()));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31325);final Class<?>[] castNull = ClassUtils.wrappersToPrimitives((Class<?>)null); // == new Class<?>[]{null}
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31326);assertTrue("(Class<?>)null -> [null]", Arrays.equals(new Class<?>[]{null}, castNull));
}finally{__CLR4_5_2npjnpjlvha7fm8.R.flushNeeded();}}

    @Test
    public void testWrappersToPrimitivesEmpty() {__CLR4_5_2npjnpjlvha7fm8.R.globalSliceStart(getClass().getName(),31327);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21sby2jo67();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2npjnpjlvha7fm8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2npjnpjlvha7fm8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ClassUtilsTest.testWrappersToPrimitivesEmpty",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),31327,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21sby2jo67(){try{__CLR4_5_2npjnpjlvha7fm8.R.inc(31327);
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31328);final Class<?>[] empty = new Class[0];
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31329);assertArrayEquals("Wrong result for empty input", empty, ClassUtils.wrappersToPrimitives(empty));
    }finally{__CLR4_5_2npjnpjlvha7fm8.R.flushNeeded();}}

    @Test
    public void testGetClassClassNotFound() throws Exception {__CLR4_5_2npjnpjlvha7fm8.R.globalSliceStart(getClass().getName(),31330);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2fwwreo6a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2npjnpjlvha7fm8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2npjnpjlvha7fm8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ClassUtilsTest.testGetClassClassNotFound",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),31330,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2fwwreo6a() throws Exception{try{__CLR4_5_2npjnpjlvha7fm8.R.inc(31330);
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31331);assertGetClassThrowsClassNotFound( "bool" );
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31332);assertGetClassThrowsClassNotFound( "bool[]" );
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31333);assertGetClassThrowsClassNotFound( "integer[]" );
    }finally{__CLR4_5_2npjnpjlvha7fm8.R.flushNeeded();}}

    @Test
    public void testGetClassInvalidArguments() throws Exception {__CLR4_5_2npjnpjlvha7fm8.R.globalSliceStart(getClass().getName(),31334);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ia7jaeo6e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2npjnpjlvha7fm8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2npjnpjlvha7fm8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ClassUtilsTest.testGetClassInvalidArguments",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),31334,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ia7jaeo6e() throws Exception{try{__CLR4_5_2npjnpjlvha7fm8.R.inc(31334);
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31335);assertGetClassThrowsNullPointerException( null );
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31336);assertGetClassThrowsClassNotFound( "[][][]" );
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31337);assertGetClassThrowsClassNotFound( "[[]" );
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31338);assertGetClassThrowsClassNotFound( "[" );
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31339);assertGetClassThrowsClassNotFound( "java.lang.String][" );
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31340);assertGetClassThrowsClassNotFound( ".hello.world" );
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31341);assertGetClassThrowsClassNotFound( "hello..world" );
    }finally{__CLR4_5_2npjnpjlvha7fm8.R.flushNeeded();}}

    @Test
    public void testWithInterleavingWhitespace() throws ClassNotFoundException {__CLR4_5_2npjnpjlvha7fm8.R.globalSliceStart(getClass().getName(),31342);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2i1cjpoo6m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2npjnpjlvha7fm8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2npjnpjlvha7fm8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ClassUtilsTest.testWithInterleavingWhitespace",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),31342,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2i1cjpoo6m() throws ClassNotFoundException{try{__CLR4_5_2npjnpjlvha7fm8.R.inc(31342);
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31343);assertEquals( int[].class, ClassUtils.getClass( " int [ ] " ) );
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31344);assertEquals( long[].class, ClassUtils.getClass( "\rlong\t[\n]\r" ) );
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31345);assertEquals( short[].class, ClassUtils.getClass( "\tshort                \t\t[]" ) );
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31346);assertEquals( byte[].class, ClassUtils.getClass( "byte[\t\t\n\r]   " ) );
    }finally{__CLR4_5_2npjnpjlvha7fm8.R.flushNeeded();}}

    @Test
    public void testGetInnerClass() throws ClassNotFoundException {__CLR4_5_2npjnpjlvha7fm8.R.globalSliceStart(getClass().getName(),31347);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_25ve3m5o6r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2npjnpjlvha7fm8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2npjnpjlvha7fm8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ClassUtilsTest.testGetInnerClass",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),31347,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_25ve3m5o6r() throws ClassNotFoundException{try{__CLR4_5_2npjnpjlvha7fm8.R.inc(31347);
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31348);assertEquals( Inner.DeeplyNested.class, ClassUtils.getClass( "org.apache.commons.lang3.ClassUtilsTest.Inner.DeeplyNested" ) );
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31349);assertEquals( Inner.DeeplyNested.class, ClassUtils.getClass( "org.apache.commons.lang3.ClassUtilsTest.Inner$DeeplyNested" ) );
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31350);assertEquals( Inner.DeeplyNested.class, ClassUtils.getClass( "org.apache.commons.lang3.ClassUtilsTest$Inner$DeeplyNested" ) );
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31351);assertEquals( Inner.DeeplyNested.class, ClassUtils.getClass( "org.apache.commons.lang3.ClassUtilsTest$Inner.DeeplyNested" ) );
    }finally{__CLR4_5_2npjnpjlvha7fm8.R.flushNeeded();}}

    @Test
    public void testGetClassByNormalNameArrays() throws ClassNotFoundException {__CLR4_5_2npjnpjlvha7fm8.R.globalSliceStart(getClass().getName(),31352);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22nh3mqo6w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2npjnpjlvha7fm8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2npjnpjlvha7fm8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ClassUtilsTest.testGetClassByNormalNameArrays",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),31352,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22nh3mqo6w() throws ClassNotFoundException{try{__CLR4_5_2npjnpjlvha7fm8.R.inc(31352);
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31353);assertEquals( int[].class, ClassUtils.getClass( "int[]" ) );
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31354);assertEquals( long[].class, ClassUtils.getClass( "long[]" ) );
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31355);assertEquals( short[].class, ClassUtils.getClass( "short[]" ) );
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31356);assertEquals( byte[].class, ClassUtils.getClass( "byte[]" ) );
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31357);assertEquals( char[].class, ClassUtils.getClass( "char[]" ) );
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31358);assertEquals( float[].class, ClassUtils.getClass( "float[]" ) );
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31359);assertEquals( double[].class, ClassUtils.getClass( "double[]" ) );
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31360);assertEquals( boolean[].class, ClassUtils.getClass( "boolean[]" ) );
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31361);assertEquals( String[].class, ClassUtils.getClass( "java.lang.String[]" ) );
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31362);assertEquals( java.util.Map.Entry[].class, ClassUtils.getClass( "java.util.Map.Entry[]" ) );
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31363);assertEquals( java.util.Map.Entry[].class, ClassUtils.getClass( "java.util.Map$Entry[]" ) );
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31364);assertEquals( java.util.Map.Entry[].class, ClassUtils.getClass( "[Ljava.util.Map.Entry;" ) );
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31365);assertEquals( java.util.Map.Entry[].class, ClassUtils.getClass( "[Ljava.util.Map$Entry;" ) );
    }finally{__CLR4_5_2npjnpjlvha7fm8.R.flushNeeded();}}

    @Test
    public void testGetClassByNormalNameArrays2D() throws ClassNotFoundException {__CLR4_5_2npjnpjlvha7fm8.R.globalSliceStart(getClass().getName(),31366);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2fmq01co7a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2npjnpjlvha7fm8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2npjnpjlvha7fm8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ClassUtilsTest.testGetClassByNormalNameArrays2D",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),31366,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2fmq01co7a() throws ClassNotFoundException{try{__CLR4_5_2npjnpjlvha7fm8.R.inc(31366);
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31367);assertEquals( int[][].class, ClassUtils.getClass( "int[][]" ) );
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31368);assertEquals( long[][].class, ClassUtils.getClass( "long[][]" ) );
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31369);assertEquals( short[][].class, ClassUtils.getClass( "short[][]" ) );
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31370);assertEquals( byte[][].class, ClassUtils.getClass( "byte[][]" ) );
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31371);assertEquals( char[][].class, ClassUtils.getClass( "char[][]" ) );
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31372);assertEquals( float[][].class, ClassUtils.getClass( "float[][]" ) );
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31373);assertEquals( double[][].class, ClassUtils.getClass( "double[][]" ) );
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31374);assertEquals( boolean[][].class, ClassUtils.getClass( "boolean[][]" ) );
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31375);assertEquals( String[][].class, ClassUtils.getClass( "java.lang.String[][]" ) );
    }finally{__CLR4_5_2npjnpjlvha7fm8.R.flushNeeded();}}

    @Test
    public void testGetClassWithArrayClasses2D() throws Exception {__CLR4_5_2npjnpjlvha7fm8.R.globalSliceStart(getClass().getName(),31376);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23ov134o7k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2npjnpjlvha7fm8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2npjnpjlvha7fm8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ClassUtilsTest.testGetClassWithArrayClasses2D",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),31376,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23ov134o7k() throws Exception{try{__CLR4_5_2npjnpjlvha7fm8.R.inc(31376);
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31377);assertGetClassReturnsClass( String[][].class );
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31378);assertGetClassReturnsClass( int[][].class );
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31379);assertGetClassReturnsClass( long[][].class );
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31380);assertGetClassReturnsClass( short[][].class );
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31381);assertGetClassReturnsClass( byte[][].class );
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31382);assertGetClassReturnsClass( char[][].class );
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31383);assertGetClassReturnsClass( float[][].class );
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31384);assertGetClassReturnsClass( double[][].class );
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31385);assertGetClassReturnsClass( boolean[][].class );
    }finally{__CLR4_5_2npjnpjlvha7fm8.R.flushNeeded();}}

    @Test
    public void testGetClassWithArrayClasses() throws Exception {__CLR4_5_2npjnpjlvha7fm8.R.globalSliceStart(getClass().getName(),31386);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2k3crceo7u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2npjnpjlvha7fm8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2npjnpjlvha7fm8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ClassUtilsTest.testGetClassWithArrayClasses",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),31386,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2k3crceo7u() throws Exception{try{__CLR4_5_2npjnpjlvha7fm8.R.inc(31386);
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31387);assertGetClassReturnsClass( String[].class );
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31388);assertGetClassReturnsClass( int[].class );
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31389);assertGetClassReturnsClass( long[].class );
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31390);assertGetClassReturnsClass( short[].class );
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31391);assertGetClassReturnsClass( byte[].class );
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31392);assertGetClassReturnsClass( char[].class );
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31393);assertGetClassReturnsClass( float[].class );
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31394);assertGetClassReturnsClass( double[].class );
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31395);assertGetClassReturnsClass( boolean[].class );
    }finally{__CLR4_5_2npjnpjlvha7fm8.R.flushNeeded();}}

    @Test
    public void testGetClassRawPrimitives() throws ClassNotFoundException {__CLR4_5_2npjnpjlvha7fm8.R.globalSliceStart(getClass().getName(),31396);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2od0gm1o84();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2npjnpjlvha7fm8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2npjnpjlvha7fm8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ClassUtilsTest.testGetClassRawPrimitives",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),31396,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2od0gm1o84() throws ClassNotFoundException{try{__CLR4_5_2npjnpjlvha7fm8.R.inc(31396);
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31397);assertEquals( int.class, ClassUtils.getClass( "int" ) );
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31398);assertEquals( long.class, ClassUtils.getClass( "long" ) );
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31399);assertEquals( short.class, ClassUtils.getClass( "short" ) );
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31400);assertEquals( byte.class, ClassUtils.getClass( "byte" ) );
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31401);assertEquals( char.class, ClassUtils.getClass( "char" ) );
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31402);assertEquals( float.class, ClassUtils.getClass( "float" ) );
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31403);assertEquals( double.class, ClassUtils.getClass( "double" ) );
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31404);assertEquals( boolean.class, ClassUtils.getClass( "boolean" ) );
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31405);assertEquals( void.class, ClassUtils.getClass( "void" ) );
    }finally{__CLR4_5_2npjnpjlvha7fm8.R.flushNeeded();}}

    private void assertGetClassReturnsClass( final Class<?> c ) throws Exception {try{__CLR4_5_2npjnpjlvha7fm8.R.inc(31406);
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31407);assertEquals( c, ClassUtils.getClass( c.getName() ) );
    }finally{__CLR4_5_2npjnpjlvha7fm8.R.flushNeeded();}}

    private void assertGetClassThrowsException( final String className, final Class<?> exceptionType ) throws Exception {try{__CLR4_5_2npjnpjlvha7fm8.R.inc(31408);
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31409);try {
            __CLR4_5_2npjnpjlvha7fm8.R.inc(31410);ClassUtils.getClass( className );
            __CLR4_5_2npjnpjlvha7fm8.R.inc(31411);fail( "ClassUtils.getClass() should fail with an exception of type " + exceptionType.getName() + " when given class name \"" + className + "\"." );
        }
        catch( final Exception e ) {
            __CLR4_5_2npjnpjlvha7fm8.R.inc(31412);assertTrue( exceptionType.isAssignableFrom( e.getClass() ) );
        }
    }finally{__CLR4_5_2npjnpjlvha7fm8.R.flushNeeded();}}

    private void assertGetClassThrowsNullPointerException( final String className ) throws Exception {try{__CLR4_5_2npjnpjlvha7fm8.R.inc(31413);
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31414);assertGetClassThrowsException( className, NullPointerException.class );
    }finally{__CLR4_5_2npjnpjlvha7fm8.R.flushNeeded();}}

    private void assertGetClassThrowsClassNotFound( final String className ) throws Exception {try{__CLR4_5_2npjnpjlvha7fm8.R.inc(31415);
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31416);assertGetClassThrowsException( className, ClassNotFoundException.class );
    }finally{__CLR4_5_2npjnpjlvha7fm8.R.flushNeeded();}}

    // Show the Java bug: http://bugs.sun.com/bugdatabase/view_bug.do?bug_id=4071957
    // We may have to delete this if a JDK fixes the bug.
    @Test
    public void testShowJavaBug() throws Exception {__CLR4_5_2npjnpjlvha7fm8.R.globalSliceStart(getClass().getName(),31417);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2b2l4x6o8p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2npjnpjlvha7fm8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2npjnpjlvha7fm8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ClassUtilsTest.testShowJavaBug",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),31417,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2b2l4x6o8p() throws Exception{try{__CLR4_5_2npjnpjlvha7fm8.R.inc(31417);
        // Tests with Collections$UnmodifiableSet
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31418);final Set<?> set = Collections.unmodifiableSet(new HashSet<>());
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31419);final Method isEmptyMethod = set.getClass().getMethod("isEmpty",  new Class[0]);
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31420);try {
            __CLR4_5_2npjnpjlvha7fm8.R.inc(31421);isEmptyMethod.invoke(set, new Object[0]);
            __CLR4_5_2npjnpjlvha7fm8.R.inc(31422);fail("Failed to throw IllegalAccessException as expected");
        } catch(final IllegalAccessException iae) {
            // expected
        }
    }finally{__CLR4_5_2npjnpjlvha7fm8.R.flushNeeded();}}

    @Test
    public void testGetPublicMethod() throws Exception {__CLR4_5_2npjnpjlvha7fm8.R.globalSliceStart(getClass().getName(),31423);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ywjiobo8v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2npjnpjlvha7fm8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2npjnpjlvha7fm8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ClassUtilsTest.testGetPublicMethod",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),31423,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ywjiobo8v() throws Exception{try{__CLR4_5_2npjnpjlvha7fm8.R.inc(31423);
        // Tests with Collections$UnmodifiableSet
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31424);final Set<?> set = Collections.unmodifiableSet(new HashSet<>());
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31425);final Method isEmptyMethod = ClassUtils.getPublicMethod(set.getClass(), "isEmpty",  new Class[0]);
            __CLR4_5_2npjnpjlvha7fm8.R.inc(31426);assertTrue(Modifier.isPublic(isEmptyMethod.getDeclaringClass().getModifiers()));

        __CLR4_5_2npjnpjlvha7fm8.R.inc(31427);try {
            __CLR4_5_2npjnpjlvha7fm8.R.inc(31428);isEmptyMethod.invoke(set, new Object[0]);
        } catch(final java.lang.IllegalAccessException iae) {
            __CLR4_5_2npjnpjlvha7fm8.R.inc(31429);fail("Should not have thrown IllegalAccessException");
        }

        // Tests with a public Class
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31430);final Method toStringMethod = ClassUtils.getPublicMethod(Object.class, "toString",  new Class[0]);
            __CLR4_5_2npjnpjlvha7fm8.R.inc(31431);assertEquals(Object.class.getMethod("toString", new Class[0]), toStringMethod);
    }finally{__CLR4_5_2npjnpjlvha7fm8.R.flushNeeded();}}

    @Test
    public void testToClass_object() {__CLR4_5_2npjnpjlvha7fm8.R.globalSliceStart(getClass().getName(),31432);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2v8bl5yo94();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2npjnpjlvha7fm8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2npjnpjlvha7fm8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ClassUtilsTest.testToClass_object",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),31432,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2v8bl5yo94(){try{__CLR4_5_2npjnpjlvha7fm8.R.inc(31432);
//        assertNull(ClassUtils.toClass(null)); // generates warning
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31433);assertNull(ClassUtils.toClass((Object[]) null)); // equivalent explicit cast
        
        // Additional varargs tests
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31434);assertTrue("empty -> empty", Arrays.equals(ArrayUtils.EMPTY_CLASS_ARRAY, ClassUtils.toClass()));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31435);final Class<?>[] castNull = ClassUtils.toClass((Object) null); // == new Object[]{null}
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31436);assertTrue("(Object)null -> [null]", Arrays.equals(new Object[]{null}, castNull));

        __CLR4_5_2npjnpjlvha7fm8.R.inc(31437);assertSame(ArrayUtils.EMPTY_CLASS_ARRAY, ClassUtils.toClass(ArrayUtils.EMPTY_OBJECT_ARRAY));

        __CLR4_5_2npjnpjlvha7fm8.R.inc(31438);assertTrue(Arrays.equals(new Class[] { String.class, Integer.class, Double.class },
                ClassUtils.toClass(new Object[] { "Test", Integer.valueOf(1), Double.valueOf(99d) })));

        __CLR4_5_2npjnpjlvha7fm8.R.inc(31439);assertTrue(Arrays.equals(new Class[] { String.class, null, Double.class },
                ClassUtils.toClass(new Object[] { "Test", null, Double.valueOf(99d) })));
    }finally{__CLR4_5_2npjnpjlvha7fm8.R.flushNeeded();}}

    @Test
    public void test_getShortCanonicalName_Object() {__CLR4_5_2npjnpjlvha7fm8.R.globalSliceStart(getClass().getName(),31440);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2u5zf5lo9c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2npjnpjlvha7fm8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2npjnpjlvha7fm8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ClassUtilsTest.test_getShortCanonicalName_Object",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),31440,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2u5zf5lo9c(){try{__CLR4_5_2npjnpjlvha7fm8.R.inc(31440);
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31441);assertEquals("<null>", ClassUtils.getShortCanonicalName(null, "<null>"));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31442);assertEquals("ClassUtils", ClassUtils.getShortCanonicalName(new ClassUtils(), "<null>"));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31443);assertEquals("ClassUtils[]", ClassUtils.getShortCanonicalName(new ClassUtils[0], "<null>"));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31444);assertEquals("ClassUtils[][]", ClassUtils.getShortCanonicalName(new ClassUtils[0][0], "<null>"));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31445);assertEquals("int[]", ClassUtils.getShortCanonicalName(new int[0], "<null>"));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31446);assertEquals("int[][]", ClassUtils.getShortCanonicalName(new int[0][0], "<null>"));

        // Inner types
        class Named {}
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31447);assertEquals("ClassUtilsTest.6", ClassUtils.getShortCanonicalName(new Object(){}, "<null>"));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31448);assertEquals("ClassUtilsTest.5Named", ClassUtils.getShortCanonicalName(new Named(), "<null>"));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31449);assertEquals("ClassUtilsTest.Inner", ClassUtils.getShortCanonicalName(new Inner(), "<null>"));
    }finally{__CLR4_5_2npjnpjlvha7fm8.R.flushNeeded();}}

    @Test
    public void test_getShortCanonicalName_Class() {__CLR4_5_2npjnpjlvha7fm8.R.globalSliceStart(getClass().getName(),31450);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22muc8ko9m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2npjnpjlvha7fm8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2npjnpjlvha7fm8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ClassUtilsTest.test_getShortCanonicalName_Class",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),31450,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22muc8ko9m(){try{__CLR4_5_2npjnpjlvha7fm8.R.inc(31450);
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31451);assertEquals("ClassUtils", ClassUtils.getShortCanonicalName(ClassUtils.class));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31452);assertEquals("ClassUtils[]", ClassUtils.getShortCanonicalName(ClassUtils[].class));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31453);assertEquals("ClassUtils[][]", ClassUtils.getShortCanonicalName(ClassUtils[][].class));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31454);assertEquals("int[]", ClassUtils.getShortCanonicalName(int[].class));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31455);assertEquals("int[][]", ClassUtils.getShortCanonicalName(int[][].class));
        
        // Inner types
        class Named {}
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31456);assertEquals("ClassUtilsTest.7", ClassUtils.getShortCanonicalName(new Object(){}.getClass()));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31457);assertEquals("ClassUtilsTest.6Named", ClassUtils.getShortCanonicalName(Named.class));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31458);assertEquals("ClassUtilsTest.Inner", ClassUtils.getShortCanonicalName(Inner.class));
    }finally{__CLR4_5_2npjnpjlvha7fm8.R.flushNeeded();}}

    @Test
    public void test_getShortCanonicalName_String() {__CLR4_5_2npjnpjlvha7fm8.R.globalSliceStart(getClass().getName(),31459);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ubgmwlo9v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2npjnpjlvha7fm8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2npjnpjlvha7fm8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ClassUtilsTest.test_getShortCanonicalName_String",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),31459,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ubgmwlo9v(){try{__CLR4_5_2npjnpjlvha7fm8.R.inc(31459);
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31460);assertEquals("ClassUtils", ClassUtils.getShortCanonicalName("org.apache.commons.lang3.ClassUtils"));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31461);assertEquals("ClassUtils[]", ClassUtils.getShortCanonicalName("[Lorg.apache.commons.lang3.ClassUtils;"));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31462);assertEquals("ClassUtils[][]", ClassUtils.getShortCanonicalName("[[Lorg.apache.commons.lang3.ClassUtils;"));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31463);assertEquals("ClassUtils[]", ClassUtils.getShortCanonicalName("org.apache.commons.lang3.ClassUtils[]"));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31464);assertEquals("ClassUtils[][]", ClassUtils.getShortCanonicalName("org.apache.commons.lang3.ClassUtils[][]"));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31465);assertEquals("int[]", ClassUtils.getShortCanonicalName("[I"));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31466);assertEquals("int[][]", ClassUtils.getShortCanonicalName("[[I"));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31467);assertEquals("int[]", ClassUtils.getShortCanonicalName("int[]"));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31468);assertEquals("int[][]", ClassUtils.getShortCanonicalName("int[][]"));
        
        // Inner types
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31469);assertEquals("ClassUtilsTest.6", ClassUtils.getShortCanonicalName("org.apache.commons.lang3.ClassUtilsTest$6"));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31470);assertEquals("ClassUtilsTest.5Named", ClassUtils.getShortCanonicalName("org.apache.commons.lang3.ClassUtilsTest$5Named"));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31471);assertEquals("ClassUtilsTest.Inner", ClassUtils.getShortCanonicalName("org.apache.commons.lang3.ClassUtilsTest$Inner"));
    }finally{__CLR4_5_2npjnpjlvha7fm8.R.flushNeeded();}}

    @Test
    public void test_getPackageCanonicalName_Object() {__CLR4_5_2npjnpjlvha7fm8.R.globalSliceStart(getClass().getName(),31472);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2uv535voa8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2npjnpjlvha7fm8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2npjnpjlvha7fm8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ClassUtilsTest.test_getPackageCanonicalName_Object",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),31472,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2uv535voa8(){try{__CLR4_5_2npjnpjlvha7fm8.R.inc(31472);
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31473);assertEquals("<null>", ClassUtils.getPackageCanonicalName(null, "<null>"));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31474);assertEquals("org.apache.commons.lang3", ClassUtils.getPackageCanonicalName(new ClassUtils(), "<null>"));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31475);assertEquals("org.apache.commons.lang3", ClassUtils.getPackageCanonicalName(new ClassUtils[0], "<null>"));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31476);assertEquals("org.apache.commons.lang3", ClassUtils.getPackageCanonicalName(new ClassUtils[0][0], "<null>"));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31477);assertEquals("", ClassUtils.getPackageCanonicalName(new int[0], "<null>"));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31478);assertEquals("", ClassUtils.getPackageCanonicalName(new int[0][0], "<null>"));
        
        // Inner types
        class Named {}
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31479);assertEquals("org.apache.commons.lang3", ClassUtils.getPackageCanonicalName(new Object(){}, "<null>"));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31480);assertEquals("org.apache.commons.lang3", ClassUtils.getPackageCanonicalName(new Named(), "<null>"));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31481);assertEquals("org.apache.commons.lang3", ClassUtils.getPackageCanonicalName(new Inner(), "<null>"));
    }finally{__CLR4_5_2npjnpjlvha7fm8.R.flushNeeded();}}

    @Test
    public void test_getPackageCanonicalName_Class() {__CLR4_5_2npjnpjlvha7fm8.R.globalSliceStart(getClass().getName(),31482);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2bjkouoai();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2npjnpjlvha7fm8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2npjnpjlvha7fm8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ClassUtilsTest.test_getPackageCanonicalName_Class",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),31482,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2bjkouoai(){try{__CLR4_5_2npjnpjlvha7fm8.R.inc(31482);
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31483);assertEquals("org.apache.commons.lang3", ClassUtils.getPackageCanonicalName(ClassUtils.class));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31484);assertEquals("org.apache.commons.lang3", ClassUtils.getPackageCanonicalName(ClassUtils[].class));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31485);assertEquals("org.apache.commons.lang3", ClassUtils.getPackageCanonicalName(ClassUtils[][].class));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31486);assertEquals("", ClassUtils.getPackageCanonicalName(int[].class));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31487);assertEquals("", ClassUtils.getPackageCanonicalName(int[][].class));
        
        // Inner types
        class Named {}
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31488);assertEquals("org.apache.commons.lang3", ClassUtils.getPackageCanonicalName(new Object(){}.getClass()));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31489);assertEquals("org.apache.commons.lang3", ClassUtils.getPackageCanonicalName(Named.class));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31490);assertEquals("org.apache.commons.lang3", ClassUtils.getPackageCanonicalName(Inner.class));
    }finally{__CLR4_5_2npjnpjlvha7fm8.R.flushNeeded();}}

    @Test
    public void test_getPackageCanonicalName_String() {__CLR4_5_2npjnpjlvha7fm8.R.globalSliceStart(getClass().getName(),31491);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2tmaywboar();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2npjnpjlvha7fm8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2npjnpjlvha7fm8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ClassUtilsTest.test_getPackageCanonicalName_String",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),31491,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2tmaywboar(){try{__CLR4_5_2npjnpjlvha7fm8.R.inc(31491);
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31492);assertEquals("org.apache.commons.lang3",
            ClassUtils.getPackageCanonicalName("org.apache.commons.lang3.ClassUtils"));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31493);assertEquals("org.apache.commons.lang3",
            ClassUtils.getPackageCanonicalName("[Lorg.apache.commons.lang3.ClassUtils;"));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31494);assertEquals("org.apache.commons.lang3",
            ClassUtils.getPackageCanonicalName("[[Lorg.apache.commons.lang3.ClassUtils;"));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31495);assertEquals("org.apache.commons.lang3",
            ClassUtils.getPackageCanonicalName("org.apache.commons.lang3.ClassUtils[]"));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31496);assertEquals("org.apache.commons.lang3",
            ClassUtils.getPackageCanonicalName("org.apache.commons.lang3.ClassUtils[][]"));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31497);assertEquals("", ClassUtils.getPackageCanonicalName("[I"));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31498);assertEquals("", ClassUtils.getPackageCanonicalName("[[I"));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31499);assertEquals("", ClassUtils.getPackageCanonicalName("int[]"));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31500);assertEquals("", ClassUtils.getPackageCanonicalName("int[][]"));
        
        // Inner types
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31501);assertEquals("org.apache.commons.lang3", ClassUtils.getPackageCanonicalName("org.apache.commons.lang3.ClassUtilsTest$6"));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31502);assertEquals("org.apache.commons.lang3", ClassUtils.getPackageCanonicalName("org.apache.commons.lang3.ClassUtilsTest$5Named"));
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31503);assertEquals("org.apache.commons.lang3", ClassUtils.getPackageCanonicalName("org.apache.commons.lang3.ClassUtilsTest$Inner"));
    }finally{__CLR4_5_2npjnpjlvha7fm8.R.flushNeeded();}}

    @Test
    public void testHierarchyIncludingInterfaces() {__CLR4_5_2npjnpjlvha7fm8.R.globalSliceStart(getClass().getName(),31504);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2j7mrhfob4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2npjnpjlvha7fm8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2npjnpjlvha7fm8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ClassUtilsTest.testHierarchyIncludingInterfaces",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),31504,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2j7mrhfob4(){try{__CLR4_5_2npjnpjlvha7fm8.R.inc(31504);
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31505);final Iterator<Class<?>> iter =
            ClassUtils.hierarchy(StringParameterizedChild.class, Interfaces.INCLUDE).iterator();
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31506);assertEquals(StringParameterizedChild.class, iter.next());
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31507);assertEquals(GenericParent.class, iter.next());
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31508);assertEquals(GenericConsumer.class, iter.next());
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31509);assertEquals(Object.class, iter.next());
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31510);assertFalse(iter.hasNext());
    }finally{__CLR4_5_2npjnpjlvha7fm8.R.flushNeeded();}}

    @Test
    public void testHierarchyExcludingInterfaces() {__CLR4_5_2npjnpjlvha7fm8.R.globalSliceStart(getClass().getName(),31511);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2elzxpnobb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2npjnpjlvha7fm8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2npjnpjlvha7fm8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ClassUtilsTest.testHierarchyExcludingInterfaces",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),31511,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2elzxpnobb(){try{__CLR4_5_2npjnpjlvha7fm8.R.inc(31511);
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31512);final Iterator<Class<?>> iter = ClassUtils.hierarchy(StringParameterizedChild.class).iterator();
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31513);assertEquals(StringParameterizedChild.class, iter.next());
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31514);assertEquals(GenericParent.class, iter.next());
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31515);assertEquals(Object.class, iter.next());
        __CLR4_5_2npjnpjlvha7fm8.R.inc(31516);assertFalse(iter.hasNext());
    }finally{__CLR4_5_2npjnpjlvha7fm8.R.flushNeeded();}}
}
