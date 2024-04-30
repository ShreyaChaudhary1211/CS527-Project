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

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
import static org.apache.commons.lang3.AnnotationUtilsTest.Stooge.CURLY;
import static org.apache.commons.lang3.AnnotationUtilsTest.Stooge.LARRY;
import static org.apache.commons.lang3.AnnotationUtilsTest.Stooge.MOE;
import static org.apache.commons.lang3.AnnotationUtilsTest.Stooge.SHEMP;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Collection;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

/**
 */
public class AnnotationUtilsTest {static class __CLR4_5_2iflifllvha7dwt{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172763741L,8589935092L,23959,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @TestAnnotation(
            booleanValue = false,
            booleanValues = { false },
            byteValue = 0,
            byteValues = { 0 },
            charValue = 0,
            charValues = { 0 },
            doubleValue = 0,
            doubleValues = { 0 },
            floatValue = 0,
            floatValues = { 0 },
            intValue = 0,
            intValues = { 0 },
            longValue = 0,
            longValues = { 0 },
            nest = @NestAnnotation(
                    booleanValue = false,
                    booleanValues = { false },
                    byteValue = 0,
                    byteValues = { 0 },
                    charValue = 0,
                    charValues = { 0 },
                    doubleValue = 0,
                    doubleValues = { 0 },
                    floatValue = 0,
                    floatValues = { 0 },
                    intValue = 0,
                    intValues = { 0 },
                    longValue = 0,
                    longValues = { 0 },
                    shortValue = 0,
                    shortValues = { 0 },
                    stooge = CURLY,
                    stooges = { MOE, LARRY, SHEMP },
                    string = "",
                    strings = { "" },
                    type = Object.class,
                    types = { Object.class }
            ),
            nests = {
                @NestAnnotation(
                        booleanValue = false,
                        booleanValues = { false },
                        byteValue = 0,
                        byteValues = { 0 },
                        charValue = 0,
                        charValues = { 0 },
                        doubleValue = 0,
                        doubleValues = { 0 },
                        floatValue = 0,
                        floatValues = { 0 },
                        intValue = 0,
                        intValues = { 0 },
                        longValue = 0,
                        longValues = { 0 },
                        shortValue = 0,
                        shortValues = { 0 },
                        stooge = CURLY,
                        stooges = { MOE, LARRY, SHEMP },
                        string = "",
                        strings = { "" },
                        type = Object[].class,
                        types = { Object[].class }
                )
            },
            shortValue = 0,
            shortValues = { 0 },
            stooge = SHEMP,
            stooges = { MOE, LARRY, CURLY },
            string = "",
            strings = { "" },
            type = Object.class,
            types = { Object.class }
    )
    public Object dummy1;

    @TestAnnotation(
            booleanValue = false,
            booleanValues = { false },
            byteValue = 0,
            byteValues = { 0 },
            charValue = 0,
            charValues = { 0 },
            doubleValue = 0,
            doubleValues = { 0 },
            floatValue = 0,
            floatValues = { 0 },
            intValue = 0,
            intValues = { 0 },
            longValue = 0,
            longValues = { 0 },
            nest = @NestAnnotation(
                    booleanValue = false,
                    booleanValues = { false },
                    byteValue = 0,
                    byteValues = { 0 },
                    charValue = 0,
                    charValues = { 0 },
                    doubleValue = 0,
                    doubleValues = { 0 },
                    floatValue = 0,
                    floatValues = { 0 },
                    intValue = 0,
                    intValues = { 0 },
                    longValue = 0,
                    longValues = { 0 },
                    shortValue = 0,
                    shortValues = { 0 },
                    stooge = CURLY,
                    stooges = { MOE, LARRY, SHEMP },
                    string = "",
                    strings = { "" },
                    type = Object.class,
                    types = { Object.class }
            ),
            nests = {
                @NestAnnotation(
                        booleanValue = false,
                        booleanValues = { false },
                        byteValue = 0,
                        byteValues = { 0 },
                        charValue = 0,
                        charValues = { 0 },
                        doubleValue = 0,
                        doubleValues = { 0 },
                        floatValue = 0,
                        floatValues = { 0 },
                        intValue = 0,
                        intValues = { 0 },
                        longValue = 0,
                        longValues = { 0 },
                        shortValue = 0,
                        shortValues = { 0 },
                        stooge = CURLY,
                        stooges = { MOE, LARRY, SHEMP },
                        string = "",
                        strings = { "" },
                        type = Object[].class,
                        types = { Object[].class }
                )
            },
            shortValue = 0,
            shortValues = { 0 },
            stooge = SHEMP,
            stooges = { MOE, LARRY, CURLY },
            string = "",
            strings = { "" },
            type = Object.class,
            types = { Object.class }
    )
    public Object dummy2;

    @TestAnnotation(
            booleanValue = false,
            booleanValues = { false },
            byteValue = 0,
            byteValues = { 0 },
            charValue = 0,
            charValues = { 0 },
            doubleValue = 0,
            doubleValues = { 0 },
            floatValue = 0,
            floatValues = { 0 },
            intValue = 0,
            intValues = { 0 },
            longValue = 0,
            longValues = { 0 },
            nest = @NestAnnotation(
                    booleanValue = false,
                    booleanValues = { false },
                    byteValue = 0,
                    byteValues = { 0 },
                    charValue = 0,
                    charValues = { 0 },
                    doubleValue = 0,
                    doubleValues = { 0 },
                    floatValue = 0,
                    floatValues = { 0 },
                    intValue = 0,
                    intValues = { 0 },
                    longValue = 0,
                    longValues = { 0 },
                    shortValue = 0,
                    shortValues = { 0 },
                    stooge = CURLY,
                    stooges = { MOE, LARRY, SHEMP },
                    string = "",
                    strings = { "" },
                    type = Object.class,
                    types = { Object.class }
            ),
            nests = {
                @NestAnnotation(
                        booleanValue = false,
                        booleanValues = { false },
                        byteValue = 0,
                        byteValues = { 0 },
                        charValue = 0,
                        charValues = { 0 },
                        doubleValue = 0,
                        doubleValues = { 0 },
                        floatValue = 0,
                        floatValues = { 0 },
                        intValue = 0,
                        intValues = { 0 },
                        longValue = 0,
                        longValues = { 0 },
                        shortValue = 0,
                        shortValues = { 0 },
                        stooge = CURLY,
                        stooges = { MOE, LARRY, SHEMP },
                        string = "",
                        strings = { "" },
                        type = Object[].class,
                        types = { Object[].class }
                ),
                //add a second NestAnnotation to break equality:
                @NestAnnotation(
                        booleanValue = false,
                        booleanValues = { false },
                        byteValue = 0,
                        byteValues = { 0 },
                        charValue = 0,
                        charValues = { 0 },
                        doubleValue = 0,
                        doubleValues = { 0 },
                        floatValue = 0,
                        floatValues = { 0 },
                        intValue = 0,
                        intValues = { 0 },
                        longValue = 0,
                        longValues = { 0 },
                        shortValue = 0,
                        shortValues = { 0 },
                        stooge = CURLY,
                        stooges = { MOE, LARRY, SHEMP },
                        string = "",
                        strings = { "" },
                        type = Object[].class,
                        types = { Object[].class }
                )
            },
            shortValue = 0,
            shortValues = { 0 },
            stooge = SHEMP,
            stooges = { MOE, LARRY, CURLY },
            string = "",
            strings = { "" },
            type = Object.class,
            types = { Object.class }
    )
    public Object dummy3;

    @NestAnnotation(
            booleanValue = false,
            booleanValues = { false },
            byteValue = 0,
            byteValues = { 0 },
            charValue = 0,
            charValues = { 0 },
            doubleValue = 0,
            doubleValues = { 0 },
            floatValue = 0,
            floatValues = { 0 },
            intValue = 0,
            intValues = { 0 },
            longValue = 0,
            longValues = { 0 },
            shortValue = 0,
            shortValues = { 0 },
            stooge = CURLY,
            stooges = { MOE, LARRY, SHEMP },
            string = "",
            strings = { "" },
            type = Object[].class,
            types = { Object[].class }
    )
    public Object dummy4;

    @Target(FIELD)
    @Retention(RUNTIME)
    public @interface TestAnnotation {
        String string();
        String[] strings();
        Class<?> type();
        Class<?>[] types();
        byte byteValue();
        byte[] byteValues();
        short shortValue();
        short[] shortValues();
        int intValue();
        int[] intValues();
        char charValue();
        char[] charValues();
        long longValue();
        long[] longValues();
        float floatValue();
        float[] floatValues();
        double doubleValue();
        double[] doubleValues();
        boolean booleanValue();
        boolean[] booleanValues();
        Stooge stooge();
        Stooge[] stooges();
        NestAnnotation nest();
        NestAnnotation[] nests();
    }
    
    @Retention(RUNTIME)
    public @interface NestAnnotation {
        String string();
        String[] strings();
        Class<?> type();
        Class<?>[] types();
        byte byteValue();
        byte[] byteValues();
        short shortValue();
        short[] shortValues();
        int intValue();
        int[] intValues();
        char charValue();
        char[] charValues();
        long longValue();
        long[] longValues();
        float floatValue();
        float[] floatValues();
        double doubleValue();
        double[] doubleValues();
        boolean booleanValue();
        boolean[] booleanValues();
        Stooge stooge();
        Stooge[] stooges();
    }

    public static enum Stooge {
        MOE, LARRY, CURLY, JOE, SHEMP
    }

    private Field field1;
    private Field field2;
    private Field field3;
    private Field field4;

    @Before
    public void setup() throws Exception {try{__CLR4_5_2iflifllvha7dwt.R.inc(23889);
        __CLR4_5_2iflifllvha7dwt.R.inc(23890);field1 = getClass().getDeclaredField("dummy1");
        __CLR4_5_2iflifllvha7dwt.R.inc(23891);field2 = getClass().getDeclaredField("dummy2");
        __CLR4_5_2iflifllvha7dwt.R.inc(23892);field3 = getClass().getDeclaredField("dummy3");
        __CLR4_5_2iflifllvha7dwt.R.inc(23893);field4 = getClass().getDeclaredField("dummy4");
    }finally{__CLR4_5_2iflifllvha7dwt.R.flushNeeded();}}

    @Test
    public void testEquivalence() {__CLR4_5_2iflifllvha7dwt.R.globalSliceStart(getClass().getName(),23894);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2fqchj3ifq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2iflifllvha7dwt.R.rethrow($CLV_t2$);}finally{__CLR4_5_2iflifllvha7dwt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.AnnotationUtilsTest.testEquivalence",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23894,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2fqchj3ifq(){try{__CLR4_5_2iflifllvha7dwt.R.inc(23894);
        __CLR4_5_2iflifllvha7dwt.R.inc(23895);assertTrue(AnnotationUtils.equals(field1.getAnnotation(TestAnnotation.class), field2.getAnnotation(TestAnnotation.class)));
        __CLR4_5_2iflifllvha7dwt.R.inc(23896);assertTrue(AnnotationUtils.equals(field2.getAnnotation(TestAnnotation.class), field1.getAnnotation(TestAnnotation.class)));
    }finally{__CLR4_5_2iflifllvha7dwt.R.flushNeeded();}}

    @Test
    public void testSameInstance() {__CLR4_5_2iflifllvha7dwt.R.globalSliceStart(getClass().getName(),23897);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2nqiovoift();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2iflifllvha7dwt.R.rethrow($CLV_t2$);}finally{__CLR4_5_2iflifllvha7dwt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.AnnotationUtilsTest.testSameInstance",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23897,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2nqiovoift(){try{__CLR4_5_2iflifllvha7dwt.R.inc(23897);
        __CLR4_5_2iflifllvha7dwt.R.inc(23898);assertTrue(AnnotationUtils.equals(field1.getAnnotation(TestAnnotation.class), field1.getAnnotation(TestAnnotation.class)));
    }finally{__CLR4_5_2iflifllvha7dwt.R.flushNeeded();}}

    @Test
    public void testNonEquivalentAnnotationsOfSameType() {__CLR4_5_2iflifllvha7dwt.R.globalSliceStart(getClass().getName(),23899);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2401szifv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2iflifllvha7dwt.R.rethrow($CLV_t2$);}finally{__CLR4_5_2iflifllvha7dwt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.AnnotationUtilsTest.testNonEquivalentAnnotationsOfSameType",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23899,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2401szifv(){try{__CLR4_5_2iflifllvha7dwt.R.inc(23899);
        __CLR4_5_2iflifllvha7dwt.R.inc(23900);assertFalse(AnnotationUtils.equals(field1.getAnnotation(TestAnnotation.class), field3.getAnnotation(TestAnnotation.class)));
        __CLR4_5_2iflifllvha7dwt.R.inc(23901);assertFalse(AnnotationUtils.equals(field3.getAnnotation(TestAnnotation.class), field1.getAnnotation(TestAnnotation.class)));
    }finally{__CLR4_5_2iflifllvha7dwt.R.flushNeeded();}}

    @Test
    public void testAnnotationsOfDifferingTypes() {__CLR4_5_2iflifllvha7dwt.R.globalSliceStart(getClass().getName(),23902);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2uyga87ify();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2iflifllvha7dwt.R.rethrow($CLV_t2$);}finally{__CLR4_5_2iflifllvha7dwt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.AnnotationUtilsTest.testAnnotationsOfDifferingTypes",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23902,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2uyga87ify(){try{__CLR4_5_2iflifllvha7dwt.R.inc(23902);
        __CLR4_5_2iflifllvha7dwt.R.inc(23903);assertFalse(AnnotationUtils.equals(field1.getAnnotation(TestAnnotation.class), field4.getAnnotation(NestAnnotation.class)));
        __CLR4_5_2iflifllvha7dwt.R.inc(23904);assertFalse(AnnotationUtils.equals(field4.getAnnotation(NestAnnotation.class), field1.getAnnotation(TestAnnotation.class)));
    }finally{__CLR4_5_2iflifllvha7dwt.R.flushNeeded();}}

    @Test
    public void testOneArgNull() {__CLR4_5_2iflifllvha7dwt.R.globalSliceStart(getClass().getName(),23905);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_273qdioig1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2iflifllvha7dwt.R.rethrow($CLV_t2$);}finally{__CLR4_5_2iflifllvha7dwt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.AnnotationUtilsTest.testOneArgNull",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23905,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_273qdioig1(){try{__CLR4_5_2iflifllvha7dwt.R.inc(23905);
        __CLR4_5_2iflifllvha7dwt.R.inc(23906);assertFalse(AnnotationUtils.equals(field1.getAnnotation(TestAnnotation.class), null));
        __CLR4_5_2iflifllvha7dwt.R.inc(23907);assertFalse(AnnotationUtils.equals(null, field1.getAnnotation(TestAnnotation.class)));
    }finally{__CLR4_5_2iflifllvha7dwt.R.flushNeeded();}}

    @Test
    public void testBothArgsNull() {__CLR4_5_2iflifllvha7dwt.R.globalSliceStart(getClass().getName(),23908);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hc5nzyig4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2iflifllvha7dwt.R.rethrow($CLV_t2$);}finally{__CLR4_5_2iflifllvha7dwt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.AnnotationUtilsTest.testBothArgsNull",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23908,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hc5nzyig4(){try{__CLR4_5_2iflifllvha7dwt.R.inc(23908);
        __CLR4_5_2iflifllvha7dwt.R.inc(23909);assertTrue(AnnotationUtils.equals(null, null));
    }finally{__CLR4_5_2iflifllvha7dwt.R.flushNeeded();}}

    @Test
    public void testIsValidAnnotationMemberType() {__CLR4_5_2iflifllvha7dwt.R.globalSliceStart(getClass().getName(),23910);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2e3ezquig6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2iflifllvha7dwt.R.rethrow($CLV_t2$);}finally{__CLR4_5_2iflifllvha7dwt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.AnnotationUtilsTest.testIsValidAnnotationMemberType",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23910,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2e3ezquig6(){try{__CLR4_5_2iflifllvha7dwt.R.inc(23910);
        __CLR4_5_2iflifllvha7dwt.R.inc(23911);for (final Class<?> type : new Class[] { byte.class, short.class, int.class, char.class,
                long.class, float.class, double.class, boolean.class, String.class, Class.class,
                NestAnnotation.class, TestAnnotation.class, Stooge.class, ElementType.class }) {{
            __CLR4_5_2iflifllvha7dwt.R.inc(23912);assertTrue(AnnotationUtils.isValidAnnotationMemberType(type));
            __CLR4_5_2iflifllvha7dwt.R.inc(23913);assertTrue(AnnotationUtils.isValidAnnotationMemberType(Array.newInstance(type, 0)
                    .getClass()));
        }
        }__CLR4_5_2iflifllvha7dwt.R.inc(23914);for (final Class<?> type : new Class[] { Object.class, Map.class, Collection.class }) {{
            __CLR4_5_2iflifllvha7dwt.R.inc(23915);assertFalse(AnnotationUtils.isValidAnnotationMemberType(type));
            __CLR4_5_2iflifllvha7dwt.R.inc(23916);assertFalse(AnnotationUtils.isValidAnnotationMemberType(Array.newInstance(type, 0)
                    .getClass()));
        }
    }}finally{__CLR4_5_2iflifllvha7dwt.R.flushNeeded();}}

    @Test(timeout = 666000)
    public void testGeneratedAnnotationEquivalentToRealAnnotation() throws Exception {__CLR4_5_2iflifllvha7dwt.R.globalSliceStart(getClass().getName(),23917);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2y1euvvigd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2iflifllvha7dwt.R.rethrow($CLV_t2$);}finally{__CLR4_5_2iflifllvha7dwt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.AnnotationUtilsTest.testGeneratedAnnotationEquivalentToRealAnnotation",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23917,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2y1euvvigd() throws Exception{try{__CLR4_5_2iflifllvha7dwt.R.inc(23917);
        __CLR4_5_2iflifllvha7dwt.R.inc(23918);final Test real = getClass().getDeclaredMethod(
                "testGeneratedAnnotationEquivalentToRealAnnotation").getAnnotation(Test.class);

        __CLR4_5_2iflifllvha7dwt.R.inc(23919);final InvocationHandler generatedTestInvocationHandler = new InvocationHandler() {

            @Override
            public Object invoke(final Object proxy, final Method method, final Object[] args) throws Throwable {try{__CLR4_5_2iflifllvha7dwt.R.inc(23920);
                __CLR4_5_2iflifllvha7dwt.R.inc(23921);if (((("equals".equals(method.getName()) && method.getParameterTypes().length == 1)&&(__CLR4_5_2iflifllvha7dwt.R.iget(23922)!=0|true))||(__CLR4_5_2iflifllvha7dwt.R.iget(23923)==0&false))) {{
                    __CLR4_5_2iflifllvha7dwt.R.inc(23924);return Boolean.valueOf(proxy == args[0]);
                }
                }__CLR4_5_2iflifllvha7dwt.R.inc(23925);if (((("hashCode".equals(method.getName()) && method.getParameterTypes().length == 0)&&(__CLR4_5_2iflifllvha7dwt.R.iget(23926)!=0|true))||(__CLR4_5_2iflifllvha7dwt.R.iget(23927)==0&false))) {{
                    __CLR4_5_2iflifllvha7dwt.R.inc(23928);return Integer.valueOf(System.identityHashCode(proxy));
                }
                }__CLR4_5_2iflifllvha7dwt.R.inc(23929);if (((("toString".equals(method.getName()) && method.getParameterTypes().length == 0)&&(__CLR4_5_2iflifllvha7dwt.R.iget(23930)!=0|true))||(__CLR4_5_2iflifllvha7dwt.R.iget(23931)==0&false))) {{
                    __CLR4_5_2iflifllvha7dwt.R.inc(23932);return "Test proxy";
                }
                }__CLR4_5_2iflifllvha7dwt.R.inc(23933);return method.invoke(real, args);
            }finally{__CLR4_5_2iflifllvha7dwt.R.flushNeeded();}}
        };

        __CLR4_5_2iflifllvha7dwt.R.inc(23934);final Test generated = (Test) Proxy.newProxyInstance(Thread.currentThread()
                .getContextClassLoader(), new Class[] { Test.class },
                generatedTestInvocationHandler);
        __CLR4_5_2iflifllvha7dwt.R.inc(23935);assertTrue(real.equals(generated));
        __CLR4_5_2iflifllvha7dwt.R.inc(23936);assertFalse(generated.equals(real));
        __CLR4_5_2iflifllvha7dwt.R.inc(23937);assertTrue(AnnotationUtils.equals(generated, real));
        __CLR4_5_2iflifllvha7dwt.R.inc(23938);assertTrue(AnnotationUtils.equals(real, generated));

        __CLR4_5_2iflifllvha7dwt.R.inc(23939);final Test generated2 = (Test) Proxy.newProxyInstance(Thread.currentThread()
                .getContextClassLoader(), new Class[] { Test.class },
                generatedTestInvocationHandler);
        __CLR4_5_2iflifllvha7dwt.R.inc(23940);assertFalse(generated.equals(generated2));
        __CLR4_5_2iflifllvha7dwt.R.inc(23941);assertFalse(generated2.equals(generated));
        __CLR4_5_2iflifllvha7dwt.R.inc(23942);assertTrue(AnnotationUtils.equals(generated, generated2));
        __CLR4_5_2iflifllvha7dwt.R.inc(23943);assertTrue(AnnotationUtils.equals(generated2, generated));
    }finally{__CLR4_5_2iflifllvha7dwt.R.flushNeeded();}}

    @Test(timeout = 666000)
    public void testHashCode() throws Exception {__CLR4_5_2iflifllvha7dwt.R.globalSliceStart(getClass().getName(),23944);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23zkhv8ih4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2iflifllvha7dwt.R.rethrow($CLV_t2$);}finally{__CLR4_5_2iflifllvha7dwt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.AnnotationUtilsTest.testHashCode",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23944,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23zkhv8ih4() throws Exception{try{__CLR4_5_2iflifllvha7dwt.R.inc(23944);
        __CLR4_5_2iflifllvha7dwt.R.inc(23945);final Test test = getClass().getDeclaredMethod("testHashCode").getAnnotation(Test.class);
        __CLR4_5_2iflifllvha7dwt.R.inc(23946);assertEquals(test.hashCode(), AnnotationUtils.hashCode(test));
        __CLR4_5_2iflifllvha7dwt.R.inc(23947);final TestAnnotation testAnnotation1 = field1.getAnnotation(TestAnnotation.class);
        __CLR4_5_2iflifllvha7dwt.R.inc(23948);assertEquals(testAnnotation1.hashCode(), AnnotationUtils.hashCode(testAnnotation1));
        __CLR4_5_2iflifllvha7dwt.R.inc(23949);final TestAnnotation testAnnotation3 = field3.getAnnotation(TestAnnotation.class);
        __CLR4_5_2iflifllvha7dwt.R.inc(23950);assertEquals(testAnnotation3.hashCode(), AnnotationUtils.hashCode(testAnnotation3));
    }finally{__CLR4_5_2iflifllvha7dwt.R.flushNeeded();}}

    @Test(timeout = 666000)
    public void testToString() throws Exception {__CLR4_5_2iflifllvha7dwt.R.globalSliceStart(getClass().getName(),23951);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hrxdidihb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2iflifllvha7dwt.R.rethrow($CLV_t2$);}finally{__CLR4_5_2iflifllvha7dwt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.AnnotationUtilsTest.testToString",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23951,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hrxdidihb() throws Exception{try{__CLR4_5_2iflifllvha7dwt.R.inc(23951);
        __CLR4_5_2iflifllvha7dwt.R.inc(23952);final Test testAnnotation = getClass().getDeclaredMethod("testToString")
                .getAnnotation(Test.class);
        __CLR4_5_2iflifllvha7dwt.R.inc(23953);final String annotationString = AnnotationUtils.toString(testAnnotation);
        __CLR4_5_2iflifllvha7dwt.R.inc(23954);assertTrue(annotationString.startsWith("@org.junit.Test("));
        __CLR4_5_2iflifllvha7dwt.R.inc(23955);assertTrue(annotationString.endsWith(")"));
        __CLR4_5_2iflifllvha7dwt.R.inc(23956);assertTrue(annotationString.contains("expected=class org.junit.Test$None"));
        __CLR4_5_2iflifllvha7dwt.R.inc(23957);assertTrue(annotationString.contains("timeout=666000"));
        __CLR4_5_2iflifllvha7dwt.R.inc(23958);assertTrue(annotationString.contains(", "));
    }finally{__CLR4_5_2iflifllvha7dwt.R.flushNeeded();}}

}
