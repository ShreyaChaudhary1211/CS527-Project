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
package org.apache.commons.lang3.reflect;

import static org.hamcrest.Matchers.hasItemInArray;
import static org.hamcrest.Matchers.hasItems;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.ClassUtils;
import org.apache.commons.lang3.ClassUtils.Interfaces;
import org.apache.commons.lang3.math.NumberUtils;
import org.apache.commons.lang3.mutable.Mutable;
import org.apache.commons.lang3.mutable.MutableObject;
import org.apache.commons.lang3.reflect.testbed.Annotated;
import org.apache.commons.lang3.reflect.testbed.GenericConsumer;
import org.apache.commons.lang3.reflect.testbed.GenericParent;
import org.apache.commons.lang3.reflect.testbed.PublicChild;
import org.apache.commons.lang3.reflect.testbed.StringParameterizedChild;
import org.apache.commons.lang3.tuple.ImmutablePair;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit tests MethodUtils
 */
public class MethodUtilsTest {static class __CLR4_5_212oz12ozlvha7i9j{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172763741L,8589935092L,50593,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static interface PrivateInterface {}

    static class TestBeanWithInterfaces implements PrivateInterface {
        public String foo() {try{__CLR4_5_212oz12ozlvha7i9j.R.inc(50147);
            __CLR4_5_212oz12ozlvha7i9j.R.inc(50148);return "foo()";
        }finally{__CLR4_5_212oz12ozlvha7i9j.R.flushNeeded();}}
    }

    public static class TestBean {

        public static String bar() {try{__CLR4_5_212oz12ozlvha7i9j.R.inc(50149);
            __CLR4_5_212oz12ozlvha7i9j.R.inc(50150);return "bar()";
        }finally{__CLR4_5_212oz12ozlvha7i9j.R.flushNeeded();}}

        public static String bar(final int i) {try{__CLR4_5_212oz12ozlvha7i9j.R.inc(50151);
            __CLR4_5_212oz12ozlvha7i9j.R.inc(50152);return "bar(int)";
        }finally{__CLR4_5_212oz12ozlvha7i9j.R.flushNeeded();}}

        public static String bar(final Integer i) {try{__CLR4_5_212oz12ozlvha7i9j.R.inc(50153);
            __CLR4_5_212oz12ozlvha7i9j.R.inc(50154);return "bar(Integer)";
        }finally{__CLR4_5_212oz12ozlvha7i9j.R.flushNeeded();}}

        public static String bar(final double d) {try{__CLR4_5_212oz12ozlvha7i9j.R.inc(50155);
            __CLR4_5_212oz12ozlvha7i9j.R.inc(50156);return "bar(double)";
        }finally{__CLR4_5_212oz12ozlvha7i9j.R.flushNeeded();}}

        public static String bar(final String s) {try{__CLR4_5_212oz12ozlvha7i9j.R.inc(50157);
            __CLR4_5_212oz12ozlvha7i9j.R.inc(50158);return "bar(String)";
        }finally{__CLR4_5_212oz12ozlvha7i9j.R.flushNeeded();}}

        public static String bar(final Object o) {try{__CLR4_5_212oz12ozlvha7i9j.R.inc(50159);
            __CLR4_5_212oz12ozlvha7i9j.R.inc(50160);return "bar(Object)";
        }finally{__CLR4_5_212oz12ozlvha7i9j.R.flushNeeded();}}

        public static String bar(final String... s) {try{__CLR4_5_212oz12ozlvha7i9j.R.inc(50161);
            __CLR4_5_212oz12ozlvha7i9j.R.inc(50162);return "bar(String...)";
        }finally{__CLR4_5_212oz12ozlvha7i9j.R.flushNeeded();}}

        public static String bar(final long... s) {try{__CLR4_5_212oz12ozlvha7i9j.R.inc(50163);
            __CLR4_5_212oz12ozlvha7i9j.R.inc(50164);return "bar(long...)";
        }finally{__CLR4_5_212oz12ozlvha7i9j.R.flushNeeded();}}

        public static String bar(final Integer i, final String... s) {try{__CLR4_5_212oz12ozlvha7i9j.R.inc(50165);
            __CLR4_5_212oz12ozlvha7i9j.R.inc(50166);return "bar(int, String...)";
        }finally{__CLR4_5_212oz12ozlvha7i9j.R.flushNeeded();}}

        public static void oneParameterStatic(final String s) {try{__CLR4_5_212oz12ozlvha7i9j.R.inc(50167);
            // empty
        }finally{__CLR4_5_212oz12ozlvha7i9j.R.flushNeeded();}}

        @SuppressWarnings("unused")
        private void privateStuff() {try{__CLR4_5_212oz12ozlvha7i9j.R.inc(50168);
        }finally{__CLR4_5_212oz12ozlvha7i9j.R.flushNeeded();}}

        @SuppressWarnings("unused")
        private String privateStringStuff() {try{__CLR4_5_212oz12ozlvha7i9j.R.inc(50169);
            __CLR4_5_212oz12ozlvha7i9j.R.inc(50170);return "privateStringStuff()";
        }finally{__CLR4_5_212oz12ozlvha7i9j.R.flushNeeded();}}

        @SuppressWarnings("unused")
        private String privateStringStuff(final int i) {try{__CLR4_5_212oz12ozlvha7i9j.R.inc(50171);
            __CLR4_5_212oz12ozlvha7i9j.R.inc(50172);return "privateStringStuff(int)";
        }finally{__CLR4_5_212oz12ozlvha7i9j.R.flushNeeded();}}

        @SuppressWarnings("unused")
        private String privateStringStuff(final Integer i) {try{__CLR4_5_212oz12ozlvha7i9j.R.inc(50173);
            __CLR4_5_212oz12ozlvha7i9j.R.inc(50174);return "privateStringStuff(Integer)";
        }finally{__CLR4_5_212oz12ozlvha7i9j.R.flushNeeded();}}

        @SuppressWarnings("unused")
        private String privateStringStuff(final double d) {try{__CLR4_5_212oz12ozlvha7i9j.R.inc(50175);
            __CLR4_5_212oz12ozlvha7i9j.R.inc(50176);return "privateStringStuff(double)";
        }finally{__CLR4_5_212oz12ozlvha7i9j.R.flushNeeded();}}

        @SuppressWarnings("unused")
        private String privateStringStuff(final String s) {try{__CLR4_5_212oz12ozlvha7i9j.R.inc(50177);
            __CLR4_5_212oz12ozlvha7i9j.R.inc(50178);return "privateStringStuff(String)";
        }finally{__CLR4_5_212oz12ozlvha7i9j.R.flushNeeded();}}

        @SuppressWarnings("unused")
        private String privateStringStuff(final Object s) {try{__CLR4_5_212oz12ozlvha7i9j.R.inc(50179);
            __CLR4_5_212oz12ozlvha7i9j.R.inc(50180);return "privateStringStuff(Object)";
        }finally{__CLR4_5_212oz12ozlvha7i9j.R.flushNeeded();}}

        public String foo() {try{__CLR4_5_212oz12ozlvha7i9j.R.inc(50181);
            __CLR4_5_212oz12ozlvha7i9j.R.inc(50182);return "foo()";
        }finally{__CLR4_5_212oz12ozlvha7i9j.R.flushNeeded();}}

        public String foo(final int i) {try{__CLR4_5_212oz12ozlvha7i9j.R.inc(50183);
            __CLR4_5_212oz12ozlvha7i9j.R.inc(50184);return "foo(int)";
        }finally{__CLR4_5_212oz12ozlvha7i9j.R.flushNeeded();}}

        public String foo(final Integer i) {try{__CLR4_5_212oz12ozlvha7i9j.R.inc(50185);
            __CLR4_5_212oz12ozlvha7i9j.R.inc(50186);return "foo(Integer)";
        }finally{__CLR4_5_212oz12ozlvha7i9j.R.flushNeeded();}}

        public String foo(final double d) {try{__CLR4_5_212oz12ozlvha7i9j.R.inc(50187);
            __CLR4_5_212oz12ozlvha7i9j.R.inc(50188);return "foo(double)";
        }finally{__CLR4_5_212oz12ozlvha7i9j.R.flushNeeded();}}

        public String foo(final long l) {try{__CLR4_5_212oz12ozlvha7i9j.R.inc(50189);
            __CLR4_5_212oz12ozlvha7i9j.R.inc(50190);return "foo(long)";
        }finally{__CLR4_5_212oz12ozlvha7i9j.R.flushNeeded();}}

        public String foo(final String s) {try{__CLR4_5_212oz12ozlvha7i9j.R.inc(50191);
            __CLR4_5_212oz12ozlvha7i9j.R.inc(50192);return "foo(String)";
        }finally{__CLR4_5_212oz12ozlvha7i9j.R.flushNeeded();}}

        public String foo(final Object o) {try{__CLR4_5_212oz12ozlvha7i9j.R.inc(50193);
            __CLR4_5_212oz12ozlvha7i9j.R.inc(50194);return "foo(Object)";
        }finally{__CLR4_5_212oz12ozlvha7i9j.R.flushNeeded();}}

        public String foo(final String... s) {try{__CLR4_5_212oz12ozlvha7i9j.R.inc(50195);
            __CLR4_5_212oz12ozlvha7i9j.R.inc(50196);return "foo(String...)";
        }finally{__CLR4_5_212oz12ozlvha7i9j.R.flushNeeded();}}

        public String foo(final long... l) {try{__CLR4_5_212oz12ozlvha7i9j.R.inc(50197);
            __CLR4_5_212oz12ozlvha7i9j.R.inc(50198);return "foo(long...)";
        }finally{__CLR4_5_212oz12ozlvha7i9j.R.flushNeeded();}}

        public String foo(final Integer i, final String... s) {try{__CLR4_5_212oz12ozlvha7i9j.R.inc(50199);
            __CLR4_5_212oz12ozlvha7i9j.R.inc(50200);return "foo(int, String...)";
        }finally{__CLR4_5_212oz12ozlvha7i9j.R.flushNeeded();}}

        public void oneParameter(final String s) {try{__CLR4_5_212oz12ozlvha7i9j.R.inc(50201);
            // empty
        }finally{__CLR4_5_212oz12ozlvha7i9j.R.flushNeeded();}}

        public String foo(final Object... s) {try{__CLR4_5_212oz12ozlvha7i9j.R.inc(50202);
            __CLR4_5_212oz12ozlvha7i9j.R.inc(50203);return "foo(Object...)";
        }finally{__CLR4_5_212oz12ozlvha7i9j.R.flushNeeded();}}

        public int[] unboxing(final int... values) {try{__CLR4_5_212oz12ozlvha7i9j.R.inc(50204);
            __CLR4_5_212oz12ozlvha7i9j.R.inc(50205);return values;
        }finally{__CLR4_5_212oz12ozlvha7i9j.R.flushNeeded();}}

        // This method is overloaded for the wrapper class for every primitive type, plus the common supertypes
        // Number and Object. This is an acid test since it easily leads to ambiguous methods.
        public static String varOverload(final Byte... args) {try{__CLR4_5_212oz12ozlvha7i9j.R.inc(50206); __CLR4_5_212oz12ozlvha7i9j.R.inc(50207);return "Byte..."; }finally{__CLR4_5_212oz12ozlvha7i9j.R.flushNeeded();}}
        public static String varOverload(final Character... args) {try{__CLR4_5_212oz12ozlvha7i9j.R.inc(50208); __CLR4_5_212oz12ozlvha7i9j.R.inc(50209);return "Character..."; }finally{__CLR4_5_212oz12ozlvha7i9j.R.flushNeeded();}}
        public static String varOverload(final Short... args) {try{__CLR4_5_212oz12ozlvha7i9j.R.inc(50210); __CLR4_5_212oz12ozlvha7i9j.R.inc(50211);return "Short..."; }finally{__CLR4_5_212oz12ozlvha7i9j.R.flushNeeded();}}
        public static String varOverload(final Boolean... args) {try{__CLR4_5_212oz12ozlvha7i9j.R.inc(50212); __CLR4_5_212oz12ozlvha7i9j.R.inc(50213);return "Boolean..."; }finally{__CLR4_5_212oz12ozlvha7i9j.R.flushNeeded();}}
        public static String varOverload(final Float... args) {try{__CLR4_5_212oz12ozlvha7i9j.R.inc(50214); __CLR4_5_212oz12ozlvha7i9j.R.inc(50215);return "Float..."; }finally{__CLR4_5_212oz12ozlvha7i9j.R.flushNeeded();}}
        public static String varOverload(final Double... args) {try{__CLR4_5_212oz12ozlvha7i9j.R.inc(50216); __CLR4_5_212oz12ozlvha7i9j.R.inc(50217);return "Double..."; }finally{__CLR4_5_212oz12ozlvha7i9j.R.flushNeeded();}}
        public static String varOverload(final Integer... args) {try{__CLR4_5_212oz12ozlvha7i9j.R.inc(50218); __CLR4_5_212oz12ozlvha7i9j.R.inc(50219);return "Integer..."; }finally{__CLR4_5_212oz12ozlvha7i9j.R.flushNeeded();}}
        public static String varOverload(final Long... args) {try{__CLR4_5_212oz12ozlvha7i9j.R.inc(50220); __CLR4_5_212oz12ozlvha7i9j.R.inc(50221);return "Long..."; }finally{__CLR4_5_212oz12ozlvha7i9j.R.flushNeeded();}}
        public static String varOverload(final Number... args) {try{__CLR4_5_212oz12ozlvha7i9j.R.inc(50222); __CLR4_5_212oz12ozlvha7i9j.R.inc(50223);return "Number..."; }finally{__CLR4_5_212oz12ozlvha7i9j.R.flushNeeded();}}
        public static String varOverload(final Object... args) {try{__CLR4_5_212oz12ozlvha7i9j.R.inc(50224); __CLR4_5_212oz12ozlvha7i9j.R.inc(50225);return "Object..."; }finally{__CLR4_5_212oz12ozlvha7i9j.R.flushNeeded();}}
        public static String varOverload(final String... args) {try{__CLR4_5_212oz12ozlvha7i9j.R.inc(50226); __CLR4_5_212oz12ozlvha7i9j.R.inc(50227);return "String..."; }finally{__CLR4_5_212oz12ozlvha7i9j.R.flushNeeded();}}

        // This method is overloaded for the wrapper class for every numeric primitive type, plus the common
        // supertype Number
        public static String numOverload(final Byte... args) {try{__CLR4_5_212oz12ozlvha7i9j.R.inc(50228); __CLR4_5_212oz12ozlvha7i9j.R.inc(50229);return "Byte..."; }finally{__CLR4_5_212oz12ozlvha7i9j.R.flushNeeded();}}
        public static String numOverload(final Short... args) {try{__CLR4_5_212oz12ozlvha7i9j.R.inc(50230); __CLR4_5_212oz12ozlvha7i9j.R.inc(50231);return "Short..."; }finally{__CLR4_5_212oz12ozlvha7i9j.R.flushNeeded();}}
        public static String numOverload(final Float... args) {try{__CLR4_5_212oz12ozlvha7i9j.R.inc(50232); __CLR4_5_212oz12ozlvha7i9j.R.inc(50233);return "Float..."; }finally{__CLR4_5_212oz12ozlvha7i9j.R.flushNeeded();}}
        public static String numOverload(final Double... args) {try{__CLR4_5_212oz12ozlvha7i9j.R.inc(50234); __CLR4_5_212oz12ozlvha7i9j.R.inc(50235);return "Double..."; }finally{__CLR4_5_212oz12ozlvha7i9j.R.flushNeeded();}}
        public static String numOverload(final Integer... args) {try{__CLR4_5_212oz12ozlvha7i9j.R.inc(50236); __CLR4_5_212oz12ozlvha7i9j.R.inc(50237);return "Integer..."; }finally{__CLR4_5_212oz12ozlvha7i9j.R.flushNeeded();}}
        public static String numOverload(final Long... args) {try{__CLR4_5_212oz12ozlvha7i9j.R.inc(50238); __CLR4_5_212oz12ozlvha7i9j.R.inc(50239);return "Long..."; }finally{__CLR4_5_212oz12ozlvha7i9j.R.flushNeeded();}}
        public static String numOverload(final Number... args) {try{__CLR4_5_212oz12ozlvha7i9j.R.inc(50240); __CLR4_5_212oz12ozlvha7i9j.R.inc(50241);return "Number..."; }finally{__CLR4_5_212oz12ozlvha7i9j.R.flushNeeded();}}

        // These varOverloadEcho and varOverloadEchoStatic methods are designed to verify that
        // not only is the correct overloaded variant invoked, but that the varags arguments
        // are also delivered correctly to the method.
        public ImmutablePair<String, Object[]> varOverloadEcho(final String... args) {try{__CLR4_5_212oz12ozlvha7i9j.R.inc(50242);
          __CLR4_5_212oz12ozlvha7i9j.R.inc(50243);return new ImmutablePair<String, Object[]>("String...", args);
        }finally{__CLR4_5_212oz12ozlvha7i9j.R.flushNeeded();}}
        public ImmutablePair<String, Object[]> varOverloadEcho(final Number... args) {try{__CLR4_5_212oz12ozlvha7i9j.R.inc(50244);
          __CLR4_5_212oz12ozlvha7i9j.R.inc(50245);return new ImmutablePair<String, Object[]>("Number...", args);
        }finally{__CLR4_5_212oz12ozlvha7i9j.R.flushNeeded();}}

        public static ImmutablePair<String, Object[]> varOverloadEchoStatic(final String... args) {try{__CLR4_5_212oz12ozlvha7i9j.R.inc(50246);
          __CLR4_5_212oz12ozlvha7i9j.R.inc(50247);return new ImmutablePair<String, Object[]>("String...", args);
        }finally{__CLR4_5_212oz12ozlvha7i9j.R.flushNeeded();}}
        public static ImmutablePair<String, Object[]> varOverloadEchoStatic(final Number... args) {try{__CLR4_5_212oz12ozlvha7i9j.R.inc(50248);
          __CLR4_5_212oz12ozlvha7i9j.R.inc(50249);return new ImmutablePair<String, Object[]>("Number...", args);
        }finally{__CLR4_5_212oz12ozlvha7i9j.R.flushNeeded();}}

        static void verify(final ImmutablePair<String, Object[]> a, final ImmutablePair<String, Object[]> b) {try{__CLR4_5_212oz12ozlvha7i9j.R.inc(50250);
          __CLR4_5_212oz12ozlvha7i9j.R.inc(50251);assertEquals(a.getLeft(), b.getLeft());
          __CLR4_5_212oz12ozlvha7i9j.R.inc(50252);assertArrayEquals(a.getRight(), b.getRight());
        }finally{__CLR4_5_212oz12ozlvha7i9j.R.flushNeeded();}}

        static void verify(final ImmutablePair<String, Object[]> a, final Object _b) {try{__CLR4_5_212oz12ozlvha7i9j.R.inc(50253);
          __CLR4_5_212oz12ozlvha7i9j.R.inc(50254);@SuppressWarnings("unchecked")
          final ImmutablePair<String, Object[]> b = (ImmutablePair<String, Object[]>) _b;
          __CLR4_5_212oz12ozlvha7i9j.R.inc(50255);verify(a, b);
        }finally{__CLR4_5_212oz12ozlvha7i9j.R.flushNeeded();}}

    }

    private static class TestMutable implements Mutable<Object> {
        @Override
        public Object getValue() {try{__CLR4_5_212oz12ozlvha7i9j.R.inc(50256);
            __CLR4_5_212oz12ozlvha7i9j.R.inc(50257);return null;
        }finally{__CLR4_5_212oz12ozlvha7i9j.R.flushNeeded();}}

        @Override
        public void setValue(final Object value) {try{__CLR4_5_212oz12ozlvha7i9j.R.inc(50258);
        }finally{__CLR4_5_212oz12ozlvha7i9j.R.flushNeeded();}}
    }

    private TestBean testBean;
    private final Map<Class<?>, Class<?>[]> classCache = new HashMap<>();

    @Before
    public void setUp() throws Exception {try{__CLR4_5_212oz12ozlvha7i9j.R.inc(50259);
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50260);testBean = new TestBean();
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50261);classCache.clear();
    }finally{__CLR4_5_212oz12ozlvha7i9j.R.flushNeeded();}}

    @Test
    public void testConstructor() throws Exception {__CLR4_5_212oz12ozlvha7i9j.R.globalSliceStart(getClass().getName(),50262);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2uefs8h12s6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_212oz12ozlvha7i9j.R.rethrow($CLV_t2$);}finally{__CLR4_5_212oz12ozlvha7i9j.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.reflect.MethodUtilsTest.testConstructor",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),50262,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2uefs8h12s6() throws Exception{try{__CLR4_5_212oz12ozlvha7i9j.R.inc(50262);
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50263);assertNotNull(MethodUtils.class.newInstance());
    }finally{__CLR4_5_212oz12ozlvha7i9j.R.flushNeeded();}}

    @Test
    public void verifyJavaVarargsOverloadingResolution() throws Exception {__CLR4_5_212oz12ozlvha7i9j.R.globalSliceStart(getClass().getName(),50264);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2l5wyi612s8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_212oz12ozlvha7i9j.R.rethrow($CLV_t2$);}finally{__CLR4_5_212oz12ozlvha7i9j.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.reflect.MethodUtilsTest.verifyJavaVarargsOverloadingResolution",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),50264,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2l5wyi612s8() throws Exception{try{__CLR4_5_212oz12ozlvha7i9j.R.inc(50264);
        // This code is not a test of MethodUtils.
        // Rather it makes explicit the behavior of the Java specification for
        // various cases of overload resolution.
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50265);assertEquals("Byte...", TestBean.varOverload((byte) 1, (byte) 2));
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50266);assertEquals("Short...", TestBean.varOverload((short) 1, (short) 2));
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50267);assertEquals("Integer...", TestBean.varOverload(1, 2));
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50268);assertEquals("Long...", TestBean.varOverload(1L, 2L));
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50269);assertEquals("Float...", TestBean.varOverload(1f, 2f));
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50270);assertEquals("Double...", TestBean.varOverload(1d, 2d));
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50271);assertEquals("Character...", TestBean.varOverload('a', 'b'));
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50272);assertEquals("String...", TestBean.varOverload("a", "b"));
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50273);assertEquals("Boolean...", TestBean.varOverload(true, false));

        __CLR4_5_212oz12ozlvha7i9j.R.inc(50274);assertEquals("Object...", TestBean.varOverload(1, "s"));
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50275);assertEquals("Object...", TestBean.varOverload(1, true));
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50276);assertEquals("Object...", TestBean.varOverload(1.1, true));
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50277);assertEquals("Object...", TestBean.varOverload('c', true));
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50278);assertEquals("Number...", TestBean.varOverload(1, 1.1));
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50279);assertEquals("Number...", TestBean.varOverload(1, 1L));
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50280);assertEquals("Number...", TestBean.varOverload(1d, 1f));
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50281);assertEquals("Number...", TestBean.varOverload((short) 1, (byte) 1));
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50282);assertEquals("Object...", TestBean.varOverload(1, 'c'));
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50283);assertEquals("Object...", TestBean.varOverload('c', "s"));
    }finally{__CLR4_5_212oz12ozlvha7i9j.R.flushNeeded();}}

    @Test
    public void testInvokeJavaVarargsOverloadingResolution() throws Exception {__CLR4_5_212oz12ozlvha7i9j.R.globalSliceStart(getClass().getName(),50284);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21dm6oz12ss();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_212oz12ozlvha7i9j.R.rethrow($CLV_t2$);}finally{__CLR4_5_212oz12ozlvha7i9j.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.reflect.MethodUtilsTest.testInvokeJavaVarargsOverloadingResolution",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),50284,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21dm6oz12ss() throws Exception{try{__CLR4_5_212oz12ozlvha7i9j.R.inc(50284);
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50285);assertEquals("Byte...", MethodUtils.invokeStaticMethod(TestBean.class,
                "varOverload", (byte) 1, (byte) 2));
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50286);assertEquals("Short...", MethodUtils.invokeStaticMethod(TestBean.class,
                "varOverload", (short) 1, (short) 2));
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50287);assertEquals("Integer...", MethodUtils.invokeStaticMethod(TestBean.class,
                "varOverload", 1, 2));
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50288);assertEquals("Long...", MethodUtils.invokeStaticMethod(TestBean.class,
                "varOverload", 1L, 2L));
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50289);assertEquals("Float...", MethodUtils.invokeStaticMethod(TestBean.class,
                "varOverload", 1f, 2f));
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50290);assertEquals("Double...", MethodUtils.invokeStaticMethod(TestBean.class,
                "varOverload", 1d, 2d));
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50291);assertEquals("Character...", MethodUtils.invokeStaticMethod(TestBean.class,
                "varOverload", 'a', 'b'));
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50292);assertEquals("String...", MethodUtils.invokeStaticMethod(TestBean.class,
                "varOverload", "a", "b"));
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50293);assertEquals("Boolean...", MethodUtils.invokeStaticMethod(TestBean.class,
                "varOverload", true, false));

        __CLR4_5_212oz12ozlvha7i9j.R.inc(50294);assertEquals("Object...", MethodUtils.invokeStaticMethod(TestBean.class,
                "varOverload", 1, "s"));
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50295);assertEquals("Object...", MethodUtils.invokeStaticMethod(TestBean.class,
                "varOverload", 1, true));
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50296);assertEquals("Object...", MethodUtils.invokeStaticMethod(TestBean.class,
                "varOverload", 1.1, true));
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50297);assertEquals("Object...", MethodUtils.invokeStaticMethod(TestBean.class,
                "varOverload", 'c', true));
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50298);assertEquals("Number...", MethodUtils.invokeStaticMethod(TestBean.class,
                "varOverload", 1, 1.1));
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50299);assertEquals("Number...", MethodUtils.invokeStaticMethod(TestBean.class,
                "varOverload", 1, 1L));
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50300);assertEquals("Number...", MethodUtils.invokeStaticMethod(TestBean.class,
                "varOverload", 1d, 1f));
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50301);assertEquals("Number...", MethodUtils.invokeStaticMethod(TestBean.class,
                "varOverload", (short) 1, (byte) 1));
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50302);assertEquals("Object...", MethodUtils.invokeStaticMethod(TestBean.class,
                "varOverload", 1, 'c'));
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50303);assertEquals("Object...", MethodUtils.invokeStaticMethod(TestBean.class,
                "varOverload", 'c', "s"));

        __CLR4_5_212oz12ozlvha7i9j.R.inc(50304);assertEquals("Object...", MethodUtils.invokeStaticMethod(TestBean.class, "varOverload",
                (Object[]) ArrayUtils.EMPTY_CLASS_ARRAY));
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50305);assertEquals("Number...", MethodUtils.invokeStaticMethod(TestBean.class, "numOverload",
                (Object[]) ArrayUtils.EMPTY_CLASS_ARRAY));
    }finally{__CLR4_5_212oz12ozlvha7i9j.R.flushNeeded();}}

    @Test
    public void testInvokeMethod() throws Exception {__CLR4_5_212oz12ozlvha7i9j.R.globalSliceStart(getClass().getName(),50306);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2s8eck212te();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_212oz12ozlvha7i9j.R.rethrow($CLV_t2$);}finally{__CLR4_5_212oz12ozlvha7i9j.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.reflect.MethodUtilsTest.testInvokeMethod",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),50306,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2s8eck212te() throws Exception{try{__CLR4_5_212oz12ozlvha7i9j.R.inc(50306);
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50307);assertEquals("foo()", MethodUtils.invokeMethod(testBean, "foo",
                (Object[]) ArrayUtils.EMPTY_CLASS_ARRAY));
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50308);assertEquals("foo()", MethodUtils.invokeMethod(testBean, "foo"));
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50309);assertEquals("foo()", MethodUtils.invokeMethod(testBean, "foo",
                (Object[]) null));
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50310);assertEquals("foo()", MethodUtils.invokeMethod(testBean, "foo",
                null, null));
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50311);assertEquals("foo(String)", MethodUtils.invokeMethod(testBean, "foo",
                ""));
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50312);assertEquals("foo(Object)", MethodUtils.invokeMethod(testBean, "foo",
                new Object()));
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50313);assertEquals("foo(Object)", MethodUtils.invokeMethod(testBean, "foo",
                Boolean.TRUE));
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50314);assertEquals("foo(Integer)", MethodUtils.invokeMethod(testBean, "foo",
                NumberUtils.INTEGER_ONE));
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50315);assertEquals("foo(int)", MethodUtils.invokeMethod(testBean, "foo",
                NumberUtils.BYTE_ONE));
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50316);assertEquals("foo(long)", MethodUtils.invokeMethod(testBean, "foo",
                NumberUtils.LONG_ONE));
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50317);assertEquals("foo(double)", MethodUtils.invokeMethod(testBean, "foo",
                NumberUtils.DOUBLE_ONE));
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50318);assertEquals("foo(String...)", MethodUtils.invokeMethod(testBean, "foo",
                "a", "b", "c"));
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50319);assertEquals("foo(String...)", MethodUtils.invokeMethod(testBean, "foo",
                "a", "b", "c"));
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50320);assertEquals("foo(int, String...)", MethodUtils.invokeMethod(testBean, "foo",
                5, "a", "b", "c"));
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50321);assertEquals("foo(long...)", MethodUtils.invokeMethod(testBean, "foo",
                1L, 2L));

        __CLR4_5_212oz12ozlvha7i9j.R.inc(50322);try {
            __CLR4_5_212oz12ozlvha7i9j.R.inc(50323);MethodUtils.invokeMethod(testBean, "foo",
                    1, 2);
            __CLR4_5_212oz12ozlvha7i9j.R.inc(50324);fail("should throw NoSuchMethodException");
        } catch (NoSuchMethodException expected) {
        }

        __CLR4_5_212oz12ozlvha7i9j.R.inc(50325);TestBean.verify(new ImmutablePair<String, Object[]>("String...", new String[]{"x", "y"}),
                        MethodUtils.invokeMethod(testBean, "varOverloadEcho", "x", "y"));
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50326);TestBean.verify(new ImmutablePair<String, Object[]>("Number...", new Number[]{17, 23, 42}),
                        MethodUtils.invokeMethod(testBean, "varOverloadEcho", 17, 23, 42));
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50327);TestBean.verify(new ImmutablePair<String, Object[]>("String...", new String[]{"x", "y"}),
                        MethodUtils.invokeMethod(testBean, "varOverloadEcho", "x", "y"));
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50328);TestBean.verify(new ImmutablePair<String, Object[]>("Number...", new Number[]{17, 23, 42}),
                        MethodUtils.invokeMethod(testBean, "varOverloadEcho", 17, 23, 42));
    }finally{__CLR4_5_212oz12ozlvha7i9j.R.flushNeeded();}}

    @Test
    public void testInvokeExactMethod() throws Exception {__CLR4_5_212oz12ozlvha7i9j.R.globalSliceStart(getClass().getName(),50329);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2x5qcoz12u1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_212oz12ozlvha7i9j.R.rethrow($CLV_t2$);}finally{__CLR4_5_212oz12ozlvha7i9j.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.reflect.MethodUtilsTest.testInvokeExactMethod",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),50329,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2x5qcoz12u1() throws Exception{try{__CLR4_5_212oz12ozlvha7i9j.R.inc(50329);
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50330);assertEquals("foo()", MethodUtils.invokeExactMethod(testBean, "foo",
                (Object[]) ArrayUtils.EMPTY_CLASS_ARRAY));
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50331);assertEquals("foo()", MethodUtils.invokeExactMethod(testBean, "foo"));
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50332);assertEquals("foo()", MethodUtils.invokeExactMethod(testBean, "foo",
                (Object[]) null));
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50333);assertEquals("foo()", MethodUtils.invokeExactMethod(testBean, "foo",
                null, null));
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50334);assertEquals("foo(String)", MethodUtils.invokeExactMethod(testBean,
                "foo", ""));
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50335);assertEquals("foo(Object)", MethodUtils.invokeExactMethod(testBean,
                "foo", new Object()));
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50336);assertEquals("foo(Integer)", MethodUtils.invokeExactMethod(testBean,
                "foo", NumberUtils.INTEGER_ONE));
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50337);assertEquals("foo(double)", MethodUtils.invokeExactMethod(testBean,
                "foo", new Object[] { NumberUtils.DOUBLE_ONE },
                new Class[] { Double.TYPE }));

        __CLR4_5_212oz12ozlvha7i9j.R.inc(50338);try {
            __CLR4_5_212oz12ozlvha7i9j.R.inc(50339);MethodUtils
                    .invokeExactMethod(testBean, "foo", NumberUtils.BYTE_ONE);
            __CLR4_5_212oz12ozlvha7i9j.R.inc(50340);fail("should throw NoSuchMethodException");
        } catch (final NoSuchMethodException e) {
        }
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50341);try {
            __CLR4_5_212oz12ozlvha7i9j.R.inc(50342);MethodUtils
                    .invokeExactMethod(testBean, "foo", NumberUtils.LONG_ONE);
            __CLR4_5_212oz12ozlvha7i9j.R.inc(50343);fail("should throw NoSuchMethodException");
        } catch (final NoSuchMethodException e) {
        }
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50344);try {
            __CLR4_5_212oz12ozlvha7i9j.R.inc(50345);MethodUtils.invokeExactMethod(testBean, "foo", Boolean.TRUE);
            __CLR4_5_212oz12ozlvha7i9j.R.inc(50346);fail("should throw NoSuchMethodException");
        } catch (final NoSuchMethodException e) {
        }
    }finally{__CLR4_5_212oz12ozlvha7i9j.R.flushNeeded();}}

    @Test
    public void testInvokeStaticMethod() throws Exception {__CLR4_5_212oz12ozlvha7i9j.R.globalSliceStart(getClass().getName(),50347);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2nmtr1c12uj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_212oz12ozlvha7i9j.R.rethrow($CLV_t2$);}finally{__CLR4_5_212oz12ozlvha7i9j.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.reflect.MethodUtilsTest.testInvokeStaticMethod",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),50347,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2nmtr1c12uj() throws Exception{try{__CLR4_5_212oz12ozlvha7i9j.R.inc(50347);
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50348);assertEquals("bar()", MethodUtils.invokeStaticMethod(TestBean.class,
                "bar", (Object[]) ArrayUtils.EMPTY_CLASS_ARRAY));
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50349);assertEquals("bar()", MethodUtils.invokeStaticMethod(TestBean.class,
                "bar", (Object[]) null));
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50350);assertEquals("bar()", MethodUtils.invokeStaticMethod(TestBean.class,
                "bar", null, null));
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50351);assertEquals("bar(String)", MethodUtils.invokeStaticMethod(
                TestBean.class, "bar", ""));
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50352);assertEquals("bar(Object)", MethodUtils.invokeStaticMethod(
                TestBean.class, "bar", new Object()));
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50353);assertEquals("bar(Object)", MethodUtils.invokeStaticMethod(
                TestBean.class, "bar", Boolean.TRUE));
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50354);assertEquals("bar(Integer)", MethodUtils.invokeStaticMethod(
                TestBean.class, "bar", NumberUtils.INTEGER_ONE));
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50355);assertEquals("bar(int)", MethodUtils.invokeStaticMethod(TestBean.class,
                "bar", NumberUtils.BYTE_ONE));
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50356);assertEquals("bar(double)", MethodUtils.invokeStaticMethod(
                TestBean.class, "bar", NumberUtils.DOUBLE_ONE));
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50357);assertEquals("bar(String...)", MethodUtils.invokeStaticMethod(
                TestBean.class, "bar", "a", "b"));
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50358);assertEquals("bar(long...)", MethodUtils.invokeStaticMethod(
                TestBean.class, "bar", 1L, 2L));
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50359);assertEquals("bar(int, String...)", MethodUtils.invokeStaticMethod(
                TestBean.class, "bar", NumberUtils.INTEGER_ONE, "a", "b"));

        __CLR4_5_212oz12ozlvha7i9j.R.inc(50360);TestBean.verify(new ImmutablePair<String, Object[]>("String...", new String[]{"x", "y"}),
                        MethodUtils.invokeStaticMethod(TestBean.class, "varOverloadEchoStatic", "x", "y"));
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50361);TestBean.verify(new ImmutablePair<String, Object[]>("Number...", new Number[]{17, 23, 42}),
                        MethodUtils.invokeStaticMethod(TestBean.class, "varOverloadEchoStatic", 17, 23, 42));
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50362);TestBean.verify(new ImmutablePair<String, Object[]>("String...", new String[]{"x", "y"}),
                        MethodUtils.invokeStaticMethod(TestBean.class, "varOverloadEchoStatic", "x", "y"));
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50363);TestBean.verify(new ImmutablePair<String, Object[]>("Number...", new Number[]{17, 23, 42}),
                        MethodUtils.invokeStaticMethod(TestBean.class, "varOverloadEchoStatic", 17, 23, 42));

        __CLR4_5_212oz12ozlvha7i9j.R.inc(50364);try {
            __CLR4_5_212oz12ozlvha7i9j.R.inc(50365);MethodUtils.invokeStaticMethod(TestBean.class, "does_not_exist");
            __CLR4_5_212oz12ozlvha7i9j.R.inc(50366);fail("should throw NoSuchMethodException");
        } catch (final NoSuchMethodException e) {
        }
    }finally{__CLR4_5_212oz12ozlvha7i9j.R.flushNeeded();}}

    @Test
    public void testInvokeExactStaticMethod() throws Exception {__CLR4_5_212oz12ozlvha7i9j.R.globalSliceStart(getClass().getName(),50367);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_297dhyt12v3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_212oz12ozlvha7i9j.R.rethrow($CLV_t2$);}finally{__CLR4_5_212oz12ozlvha7i9j.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.reflect.MethodUtilsTest.testInvokeExactStaticMethod",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),50367,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_297dhyt12v3() throws Exception{try{__CLR4_5_212oz12ozlvha7i9j.R.inc(50367);
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50368);assertEquals("bar()", MethodUtils.invokeExactStaticMethod(TestBean.class,
                "bar", (Object[]) ArrayUtils.EMPTY_CLASS_ARRAY));
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50369);assertEquals("bar()", MethodUtils.invokeExactStaticMethod(TestBean.class,
                "bar", (Object[]) null));
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50370);assertEquals("bar()", MethodUtils.invokeExactStaticMethod(TestBean.class,
                "bar", null, null));
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50371);assertEquals("bar(String)", MethodUtils.invokeExactStaticMethod(
                TestBean.class, "bar", ""));
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50372);assertEquals("bar(Object)", MethodUtils.invokeExactStaticMethod(
                TestBean.class, "bar", new Object()));
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50373);assertEquals("bar(Integer)", MethodUtils.invokeExactStaticMethod(
                TestBean.class, "bar", NumberUtils.INTEGER_ONE));
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50374);assertEquals("bar(double)", MethodUtils.invokeExactStaticMethod(
                TestBean.class, "bar", new Object[] { NumberUtils.DOUBLE_ONE },
                new Class[] { Double.TYPE }));

        __CLR4_5_212oz12ozlvha7i9j.R.inc(50375);try {
            __CLR4_5_212oz12ozlvha7i9j.R.inc(50376);MethodUtils.invokeExactStaticMethod(TestBean.class, "bar",
                    NumberUtils.BYTE_ONE);
            __CLR4_5_212oz12ozlvha7i9j.R.inc(50377);fail("should throw NoSuchMethodException");
        } catch (final NoSuchMethodException e) {
        }
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50378);try {
            __CLR4_5_212oz12ozlvha7i9j.R.inc(50379);MethodUtils.invokeExactStaticMethod(TestBean.class, "bar",
                    NumberUtils.LONG_ONE);
            __CLR4_5_212oz12ozlvha7i9j.R.inc(50380);fail("should throw NoSuchMethodException");
        } catch (final NoSuchMethodException e) {
        }
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50381);try {
            __CLR4_5_212oz12ozlvha7i9j.R.inc(50382);MethodUtils.invokeExactStaticMethod(TestBean.class, "bar",
                    Boolean.TRUE);
            __CLR4_5_212oz12ozlvha7i9j.R.inc(50383);fail("should throw NoSuchMethodException");
        } catch (final NoSuchMethodException e) {
        }
    }finally{__CLR4_5_212oz12ozlvha7i9j.R.flushNeeded();}}

    @Test
    public void testGetAccessibleInterfaceMethod() throws Exception {__CLR4_5_212oz12ozlvha7i9j.R.globalSliceStart(getClass().getName(),50384);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2u470h312vk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_212oz12ozlvha7i9j.R.rethrow($CLV_t2$);}finally{__CLR4_5_212oz12ozlvha7i9j.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.reflect.MethodUtilsTest.testGetAccessibleInterfaceMethod",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),50384,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2u470h312vk() throws Exception{try{__CLR4_5_212oz12ozlvha7i9j.R.inc(50384);
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50385);final Class<?>[][] p = { ArrayUtils.EMPTY_CLASS_ARRAY, null };
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50386);for (final Class<?>[] element : p) {{
            __CLR4_5_212oz12ozlvha7i9j.R.inc(50387);final Method method = TestMutable.class.getMethod("getValue", element);
            __CLR4_5_212oz12ozlvha7i9j.R.inc(50388);final Method accessibleMethod = MethodUtils.getAccessibleMethod(method);
            __CLR4_5_212oz12ozlvha7i9j.R.inc(50389);assertNotSame(accessibleMethod, method);
            __CLR4_5_212oz12ozlvha7i9j.R.inc(50390);assertSame(Mutable.class, accessibleMethod.getDeclaringClass());
        }
    }}finally{__CLR4_5_212oz12ozlvha7i9j.R.flushNeeded();}}

    @Test
    public void testGetAccessibleMethodPrivateInterface() throws Exception {__CLR4_5_212oz12ozlvha7i9j.R.globalSliceStart(getClass().getName(),50391);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23miewo12vr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_212oz12ozlvha7i9j.R.rethrow($CLV_t2$);}finally{__CLR4_5_212oz12ozlvha7i9j.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.reflect.MethodUtilsTest.testGetAccessibleMethodPrivateInterface",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),50391,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23miewo12vr() throws Exception{try{__CLR4_5_212oz12ozlvha7i9j.R.inc(50391);
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50392);final Method expected = TestBeanWithInterfaces.class.getMethod("foo");
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50393);assertNotNull(expected);
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50394);final Method actual = MethodUtils.getAccessibleMethod(TestBeanWithInterfaces.class, "foo");
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50395);assertNull(actual);
    }finally{__CLR4_5_212oz12ozlvha7i9j.R.flushNeeded();}}

    @Test
    public void testGetAccessibleInterfaceMethodFromDescription()
            throws Exception {__CLR4_5_212oz12ozlvha7i9j.R.globalSliceStart(getClass().getName(),50396);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2pf3uh312vw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_212oz12ozlvha7i9j.R.rethrow($CLV_t2$);}finally{__CLR4_5_212oz12ozlvha7i9j.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.reflect.MethodUtilsTest.testGetAccessibleInterfaceMethodFromDescription",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),50396,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2pf3uh312vw() throws Exception{try{__CLR4_5_212oz12ozlvha7i9j.R.inc(50396);
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50397);final Class<?>[][] p = { ArrayUtils.EMPTY_CLASS_ARRAY, null };
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50398);for (final Class<?>[] element : p) {{
            __CLR4_5_212oz12ozlvha7i9j.R.inc(50399);final Method accessibleMethod = MethodUtils.getAccessibleMethod(
                    TestMutable.class, "getValue", element);
            __CLR4_5_212oz12ozlvha7i9j.R.inc(50400);assertSame(Mutable.class, accessibleMethod.getDeclaringClass());
        }
    }}finally{__CLR4_5_212oz12ozlvha7i9j.R.flushNeeded();}}

    @Test
    public void testGetAccessiblePublicMethod() throws Exception {__CLR4_5_212oz12ozlvha7i9j.R.globalSliceStart(getClass().getName(),50401);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26rv67p12w1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_212oz12ozlvha7i9j.R.rethrow($CLV_t2$);}finally{__CLR4_5_212oz12ozlvha7i9j.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.reflect.MethodUtilsTest.testGetAccessiblePublicMethod",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),50401,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26rv67p12w1() throws Exception{try{__CLR4_5_212oz12ozlvha7i9j.R.inc(50401);
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50402);assertSame(MutableObject.class, MethodUtils.getAccessibleMethod(
                MutableObject.class.getMethod("getValue",
                        ArrayUtils.EMPTY_CLASS_ARRAY)).getDeclaringClass());
    }finally{__CLR4_5_212oz12ozlvha7i9j.R.flushNeeded();}}

    @Test
    public void testGetAccessiblePublicMethodFromDescription() throws Exception {__CLR4_5_212oz12ozlvha7i9j.R.globalSliceStart(getClass().getName(),50403);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_29s4ai312w3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_212oz12ozlvha7i9j.R.rethrow($CLV_t2$);}finally{__CLR4_5_212oz12ozlvha7i9j.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.reflect.MethodUtilsTest.testGetAccessiblePublicMethodFromDescription",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),50403,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_29s4ai312w3() throws Exception{try{__CLR4_5_212oz12ozlvha7i9j.R.inc(50403);
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50404);assertSame(MutableObject.class, MethodUtils.getAccessibleMethod(
                MutableObject.class, "getValue", ArrayUtils.EMPTY_CLASS_ARRAY)
                .getDeclaringClass());
    }finally{__CLR4_5_212oz12ozlvha7i9j.R.flushNeeded();}}

    @Test
   public void testGetAccessibleMethodInaccessible() throws Exception {__CLR4_5_212oz12ozlvha7i9j.R.globalSliceStart(getClass().getName(),50405);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_218vjwj12w5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_212oz12ozlvha7i9j.R.rethrow($CLV_t2$);}finally{__CLR4_5_212oz12ozlvha7i9j.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.reflect.MethodUtilsTest.testGetAccessibleMethodInaccessible",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),50405,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_218vjwj12w5() throws Exception{try{__CLR4_5_212oz12ozlvha7i9j.R.inc(50405);
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50406);final Method expected = TestBean.class.getDeclaredMethod("privateStuff");
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50407);final Method actual = MethodUtils.getAccessibleMethod(expected);
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50408);assertNull(actual);
    }finally{__CLR4_5_212oz12ozlvha7i9j.R.flushNeeded();}}

    @Test
   public void testGetMatchingAccessibleMethod() throws Exception {__CLR4_5_212oz12ozlvha7i9j.R.globalSliceStart(getClass().getName(),50409);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ksuhnl12w9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_212oz12ozlvha7i9j.R.rethrow($CLV_t2$);}finally{__CLR4_5_212oz12ozlvha7i9j.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.reflect.MethodUtilsTest.testGetMatchingAccessibleMethod",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),50409,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ksuhnl12w9() throws Exception{try{__CLR4_5_212oz12ozlvha7i9j.R.inc(50409);
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50410);expectMatchingAccessibleMethodParameterTypes(TestBean.class, "foo",
                ArrayUtils.EMPTY_CLASS_ARRAY, ArrayUtils.EMPTY_CLASS_ARRAY);
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50411);expectMatchingAccessibleMethodParameterTypes(TestBean.class, "foo",
                null, ArrayUtils.EMPTY_CLASS_ARRAY);
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50412);expectMatchingAccessibleMethodParameterTypes(TestBean.class, "foo",
                singletonArray(String.class), singletonArray(String.class));
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50413);expectMatchingAccessibleMethodParameterTypes(TestBean.class, "foo",
                singletonArray(Object.class), singletonArray(Object.class));
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50414);expectMatchingAccessibleMethodParameterTypes(TestBean.class, "foo",
                singletonArray(Boolean.class), singletonArray(Object.class));
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50415);expectMatchingAccessibleMethodParameterTypes(TestBean.class, "foo",
                singletonArray(Byte.class), singletonArray(Integer.TYPE));
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50416);expectMatchingAccessibleMethodParameterTypes(TestBean.class, "foo",
                singletonArray(Byte.TYPE), singletonArray(Integer.TYPE));
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50417);expectMatchingAccessibleMethodParameterTypes(TestBean.class, "foo",
                singletonArray(Short.class), singletonArray(Integer.TYPE));
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50418);expectMatchingAccessibleMethodParameterTypes(TestBean.class, "foo",
                singletonArray(Short.TYPE), singletonArray(Integer.TYPE));
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50419);expectMatchingAccessibleMethodParameterTypes(TestBean.class, "foo",
                singletonArray(Character.class), singletonArray(Integer.TYPE));
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50420);expectMatchingAccessibleMethodParameterTypes(TestBean.class, "foo",
                singletonArray(Character.TYPE), singletonArray(Integer.TYPE));
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50421);expectMatchingAccessibleMethodParameterTypes(TestBean.class, "foo",
                singletonArray(Integer.class), singletonArray(Integer.class));
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50422);expectMatchingAccessibleMethodParameterTypes(TestBean.class, "foo",
                singletonArray(Integer.TYPE), singletonArray(Integer.TYPE));
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50423);expectMatchingAccessibleMethodParameterTypes(TestBean.class, "foo",
                singletonArray(Long.class), singletonArray(Long.TYPE));
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50424);expectMatchingAccessibleMethodParameterTypes(TestBean.class, "foo",
                singletonArray(Long.TYPE), singletonArray(Long.TYPE));
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50425);expectMatchingAccessibleMethodParameterTypes(TestBean.class, "foo",
                singletonArray(Float.class), singletonArray(Double.TYPE));
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50426);expectMatchingAccessibleMethodParameterTypes(TestBean.class, "foo",
                singletonArray(Float.TYPE), singletonArray(Double.TYPE));
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50427);expectMatchingAccessibleMethodParameterTypes(TestBean.class, "foo",
                singletonArray(Double.class), singletonArray(Double.TYPE));
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50428);expectMatchingAccessibleMethodParameterTypes(TestBean.class, "foo",
                singletonArray(Double.TYPE), singletonArray(Double.TYPE));
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50429);expectMatchingAccessibleMethodParameterTypes(TestBean.class, "foo",
                singletonArray(Double.TYPE), singletonArray(Double.TYPE));
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50430);expectMatchingAccessibleMethodParameterTypes(TestBean.class, "foo",
                new Class[] {String.class, String.class}, new Class[] {String[].class});
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50431);expectMatchingAccessibleMethodParameterTypes(TestBean.class, "foo",
                new Class[] {Integer.TYPE, String.class, String.class}, new Class[] {Integer.class, String[].class});
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50432);expectMatchingAccessibleMethodParameterTypes(InheritanceBean.class, "testOne",
                singletonArray(ParentObject.class), singletonArray(ParentObject.class));
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50433);expectMatchingAccessibleMethodParameterTypes(InheritanceBean.class, "testOne",
                singletonArray(ChildObject.class), singletonArray(ParentObject.class));
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50434);expectMatchingAccessibleMethodParameterTypes(InheritanceBean.class, "testTwo",
                singletonArray(ParentObject.class), singletonArray(GrandParentObject.class));
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50435);expectMatchingAccessibleMethodParameterTypes(InheritanceBean.class, "testTwo",
                singletonArray(ChildObject.class), singletonArray(ChildInterface.class));
    }finally{__CLR4_5_212oz12ozlvha7i9j.R.flushNeeded();}}

    @Test
    public void testNullArgument() {__CLR4_5_212oz12ozlvha7i9j.R.globalSliceStart(getClass().getName(),50436);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2r6zpsz12x0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_212oz12ozlvha7i9j.R.rethrow($CLV_t2$);}finally{__CLR4_5_212oz12ozlvha7i9j.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.reflect.MethodUtilsTest.testNullArgument",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),50436,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2r6zpsz12x0(){try{__CLR4_5_212oz12ozlvha7i9j.R.inc(50436);
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50437);expectMatchingAccessibleMethodParameterTypes(TestBean.class, "oneParameter",
                singletonArray(null), singletonArray(String.class));
    }finally{__CLR4_5_212oz12ozlvha7i9j.R.flushNeeded();}}

    @Test
    public void testGetOverrideHierarchyIncludingInterfaces() {__CLR4_5_212oz12ozlvha7i9j.R.globalSliceStart(getClass().getName(),50438);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gza7312x2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_212oz12ozlvha7i9j.R.rethrow($CLV_t2$);}finally{__CLR4_5_212oz12ozlvha7i9j.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.reflect.MethodUtilsTest.testGetOverrideHierarchyIncludingInterfaces",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),50438,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gza7312x2(){try{__CLR4_5_212oz12ozlvha7i9j.R.inc(50438);
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50439);final Method method = MethodUtils.getAccessibleMethod(StringParameterizedChild.class, "consume", String.class);
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50440);final Iterator<MethodDescriptor> expected =
            Arrays.asList(new MethodDescriptor(StringParameterizedChild.class, "consume", String.class),
                new MethodDescriptor(GenericParent.class, "consume", GenericParent.class.getTypeParameters()[0]),
                new MethodDescriptor(GenericConsumer.class, "consume", GenericConsumer.class.getTypeParameters()[0]))
                .iterator();
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50441);for (final Method m : MethodUtils.getOverrideHierarchy(method, Interfaces.INCLUDE)) {{
            __CLR4_5_212oz12ozlvha7i9j.R.inc(50442);assertTrue(expected.hasNext());
            __CLR4_5_212oz12ozlvha7i9j.R.inc(50443);final MethodDescriptor md = expected.next();
            __CLR4_5_212oz12ozlvha7i9j.R.inc(50444);assertEquals(md.declaringClass, m.getDeclaringClass());
            __CLR4_5_212oz12ozlvha7i9j.R.inc(50445);assertEquals(md.name, m.getName());
            __CLR4_5_212oz12ozlvha7i9j.R.inc(50446);assertEquals(md.parameterTypes.length, m.getParameterTypes().length);
            __CLR4_5_212oz12ozlvha7i9j.R.inc(50447);for (int i = 0; (((i < md.parameterTypes.length)&&(__CLR4_5_212oz12ozlvha7i9j.R.iget(50448)!=0|true))||(__CLR4_5_212oz12ozlvha7i9j.R.iget(50449)==0&false)); i++) {{
                __CLR4_5_212oz12ozlvha7i9j.R.inc(50450);assertTrue(TypeUtils.equals(md.parameterTypes[i], m.getGenericParameterTypes()[i]));
            }
        }}
        }__CLR4_5_212oz12ozlvha7i9j.R.inc(50451);assertFalse(expected.hasNext());
    }finally{__CLR4_5_212oz12ozlvha7i9j.R.flushNeeded();}}

    @Test
    public void testGetOverrideHierarchyExcludingInterfaces() {__CLR4_5_212oz12ozlvha7i9j.R.globalSliceStart(getClass().getName(),50452);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2yalze512xg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_212oz12ozlvha7i9j.R.rethrow($CLV_t2$);}finally{__CLR4_5_212oz12ozlvha7i9j.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.reflect.MethodUtilsTest.testGetOverrideHierarchyExcludingInterfaces",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),50452,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2yalze512xg(){try{__CLR4_5_212oz12ozlvha7i9j.R.inc(50452);
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50453);final Method method = MethodUtils.getAccessibleMethod(StringParameterizedChild.class, "consume", String.class);
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50454);final Iterator<MethodDescriptor> expected =
            Arrays.asList(new MethodDescriptor(StringParameterizedChild.class, "consume", String.class),
                new MethodDescriptor(GenericParent.class, "consume", GenericParent.class.getTypeParameters()[0]))
                .iterator();
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50455);for (final Method m : MethodUtils.getOverrideHierarchy(method, Interfaces.EXCLUDE)) {{
            __CLR4_5_212oz12ozlvha7i9j.R.inc(50456);assertTrue(expected.hasNext());
            __CLR4_5_212oz12ozlvha7i9j.R.inc(50457);final MethodDescriptor md = expected.next();
            __CLR4_5_212oz12ozlvha7i9j.R.inc(50458);assertEquals(md.declaringClass, m.getDeclaringClass());
            __CLR4_5_212oz12ozlvha7i9j.R.inc(50459);assertEquals(md.name, m.getName());
            __CLR4_5_212oz12ozlvha7i9j.R.inc(50460);assertEquals(md.parameterTypes.length, m.getParameterTypes().length);
            __CLR4_5_212oz12ozlvha7i9j.R.inc(50461);for (int i = 0; (((i < md.parameterTypes.length)&&(__CLR4_5_212oz12ozlvha7i9j.R.iget(50462)!=0|true))||(__CLR4_5_212oz12ozlvha7i9j.R.iget(50463)==0&false)); i++) {{
                __CLR4_5_212oz12ozlvha7i9j.R.inc(50464);assertTrue(TypeUtils.equals(md.parameterTypes[i], m.getGenericParameterTypes()[i]));
            }
        }}
        }__CLR4_5_212oz12ozlvha7i9j.R.inc(50465);assertFalse(expected.hasNext());
    }finally{__CLR4_5_212oz12ozlvha7i9j.R.flushNeeded();}}

    @Test
    @Annotated
    public void testGetMethodsWithAnnotation() throws NoSuchMethodException {__CLR4_5_212oz12ozlvha7i9j.R.globalSliceStart(getClass().getName(),50466);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ws8szu12xu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_212oz12ozlvha7i9j.R.rethrow($CLV_t2$);}finally{__CLR4_5_212oz12ozlvha7i9j.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.reflect.MethodUtilsTest.testGetMethodsWithAnnotation",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),50466,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ws8szu12xu() throws NoSuchMethodException{try{__CLR4_5_212oz12ozlvha7i9j.R.inc(50466);
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50467);assertArrayEquals(new Method[0], MethodUtils.getMethodsWithAnnotation(Object.class, Annotated.class));

        __CLR4_5_212oz12ozlvha7i9j.R.inc(50468);final Method[] methodsWithAnnotation = MethodUtils.getMethodsWithAnnotation(MethodUtilsTest.class, Annotated.class);
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50469);assertEquals(2, methodsWithAnnotation.length);
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50470);assertThat(methodsWithAnnotation, hasItemInArray(MethodUtilsTest.class.getMethod("testGetMethodsWithAnnotation")));
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50471);assertThat(methodsWithAnnotation, hasItemInArray(MethodUtilsTest.class.getMethod("testGetMethodsListWithAnnotation")));
    }finally{__CLR4_5_212oz12ozlvha7i9j.R.flushNeeded();}}

    @Test
    public void testGetMethodsWithAnnotationSearchSupersAndIgnoreAccess() throws NoSuchMethodException {__CLR4_5_212oz12ozlvha7i9j.R.globalSliceStart(getClass().getName(),50472);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2rq637z12y0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_212oz12ozlvha7i9j.R.rethrow($CLV_t2$);}finally{__CLR4_5_212oz12ozlvha7i9j.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.reflect.MethodUtilsTest.testGetMethodsWithAnnotationSearchSupersAndIgnoreAccess",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),50472,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2rq637z12y0() throws NoSuchMethodException{try{__CLR4_5_212oz12ozlvha7i9j.R.inc(50472);
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50473);assertArrayEquals(new Method[0], MethodUtils.getMethodsWithAnnotation(Object.class, Annotated.class,
                true, true));

        __CLR4_5_212oz12ozlvha7i9j.R.inc(50474);final Method[] methodsWithAnnotation = MethodUtils.getMethodsWithAnnotation(PublicChild.class, Annotated.class,
                true, true);
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50475);assertEquals(4, methodsWithAnnotation.length);
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50476);assertEquals("PublicChild", methodsWithAnnotation[0].getDeclaringClass().getSimpleName());
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50477);assertEquals("PublicChild", methodsWithAnnotation[1].getDeclaringClass().getSimpleName());
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50478);assertTrue(methodsWithAnnotation[0].getName().endsWith("AnnotatedMethod"));
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50479);assertTrue(methodsWithAnnotation[1].getName().endsWith("AnnotatedMethod"));
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50480);assertEquals("Foo.doIt",
                methodsWithAnnotation[2].getDeclaringClass().getSimpleName() + '.' +
                        methodsWithAnnotation[2].getName());
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50481);assertEquals("Parent.parentProtectedAnnotatedMethod",
                methodsWithAnnotation[3].getDeclaringClass().getSimpleName() + '.' +
                        methodsWithAnnotation[3].getName());
    }finally{__CLR4_5_212oz12ozlvha7i9j.R.flushNeeded();}}

    @Test
    public void testGetMethodsWithAnnotationNotSearchSupersButIgnoreAccess() throws NoSuchMethodException {__CLR4_5_212oz12ozlvha7i9j.R.globalSliceStart(getClass().getName(),50482);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2dnff2m12ya();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_212oz12ozlvha7i9j.R.rethrow($CLV_t2$);}finally{__CLR4_5_212oz12ozlvha7i9j.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.reflect.MethodUtilsTest.testGetMethodsWithAnnotationNotSearchSupersButIgnoreAccess",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),50482,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2dnff2m12ya() throws NoSuchMethodException{try{__CLR4_5_212oz12ozlvha7i9j.R.inc(50482);
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50483);assertArrayEquals(new Method[0], MethodUtils.getMethodsWithAnnotation(Object.class, Annotated.class,
                false, true));

        __CLR4_5_212oz12ozlvha7i9j.R.inc(50484);final Method[] methodsWithAnnotation = MethodUtils.getMethodsWithAnnotation(PublicChild.class, Annotated.class,
                false, true);
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50485);assertEquals(2, methodsWithAnnotation.length);
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50486);assertEquals("PublicChild", methodsWithAnnotation[0].getDeclaringClass().getSimpleName());
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50487);assertEquals("PublicChild", methodsWithAnnotation[1].getDeclaringClass().getSimpleName());
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50488);assertTrue(methodsWithAnnotation[0].getName().endsWith("AnnotatedMethod"));
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50489);assertTrue(methodsWithAnnotation[1].getName().endsWith("AnnotatedMethod"));
    }finally{__CLR4_5_212oz12ozlvha7i9j.R.flushNeeded();}}

    @Test
    public void testGetMethodsWithAnnotationSearchSupersButNotIgnoreAccess() throws NoSuchMethodException {__CLR4_5_212oz12ozlvha7i9j.R.globalSliceStart(getClass().getName(),50490);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ulgzg212yi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_212oz12ozlvha7i9j.R.rethrow($CLV_t2$);}finally{__CLR4_5_212oz12ozlvha7i9j.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.reflect.MethodUtilsTest.testGetMethodsWithAnnotationSearchSupersButNotIgnoreAccess",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),50490,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ulgzg212yi() throws NoSuchMethodException{try{__CLR4_5_212oz12ozlvha7i9j.R.inc(50490);
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50491);assertArrayEquals(new Method[0], MethodUtils.getMethodsWithAnnotation(Object.class, Annotated.class,
                true, false));

        __CLR4_5_212oz12ozlvha7i9j.R.inc(50492);final Method[] methodsWithAnnotation = MethodUtils.getMethodsWithAnnotation(PublicChild.class, Annotated.class,
                true, false);
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50493);assertEquals(2, methodsWithAnnotation.length);
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50494);assertEquals("PublicChild.publicAnnotatedMethod",
                methodsWithAnnotation[0].getDeclaringClass().getSimpleName() + '.' +
                        methodsWithAnnotation[0].getName());
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50495);assertEquals("Foo.doIt",
                methodsWithAnnotation[1].getDeclaringClass().getSimpleName() + '.' +
                        methodsWithAnnotation[1].getName());
    }finally{__CLR4_5_212oz12ozlvha7i9j.R.flushNeeded();}}

    @Test
    public void testGetMethodsWithAnnotationNotSearchSupersAndNotIgnoreAccess() throws NoSuchMethodException {__CLR4_5_212oz12ozlvha7i9j.R.globalSliceStart(getClass().getName(),50496);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2mdcx8712yo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_212oz12ozlvha7i9j.R.rethrow($CLV_t2$);}finally{__CLR4_5_212oz12ozlvha7i9j.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.reflect.MethodUtilsTest.testGetMethodsWithAnnotationNotSearchSupersAndNotIgnoreAccess",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),50496,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2mdcx8712yo() throws NoSuchMethodException{try{__CLR4_5_212oz12ozlvha7i9j.R.inc(50496);
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50497);assertArrayEquals(new Method[0], MethodUtils.getMethodsWithAnnotation(Object.class, Annotated.class,
                false, false));

        __CLR4_5_212oz12ozlvha7i9j.R.inc(50498);final Method[] methodsWithAnnotation = MethodUtils.getMethodsWithAnnotation(PublicChild.class, Annotated.class,
                false, false);
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50499);assertEquals(1, methodsWithAnnotation.length);
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50500);assertEquals("PublicChild.publicAnnotatedMethod",
                methodsWithAnnotation[0].getDeclaringClass().getSimpleName() + '.' +
                        methodsWithAnnotation[0].getName());
    }finally{__CLR4_5_212oz12ozlvha7i9j.R.flushNeeded();}}

    @Test
    public void testGetAnnotationSearchSupersAndIgnoreAccess() throws NoSuchMethodException {__CLR4_5_212oz12ozlvha7i9j.R.globalSliceStart(getClass().getName(),50501);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2f1rgkf12yt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_212oz12ozlvha7i9j.R.rethrow($CLV_t2$);}finally{__CLR4_5_212oz12ozlvha7i9j.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.reflect.MethodUtilsTest.testGetAnnotationSearchSupersAndIgnoreAccess",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),50501,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2f1rgkf12yt() throws NoSuchMethodException{try{__CLR4_5_212oz12ozlvha7i9j.R.inc(50501);
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50502);assertNull(MethodUtils.getAnnotation(PublicChild.class.getMethod("parentNotAnnotatedMethod"),
                Annotated.class, true, true));
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50503);assertNotNull(MethodUtils.getAnnotation(PublicChild.class.getMethod("doIt"), Annotated.class,
                true, true));
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50504);assertNotNull(MethodUtils.getAnnotation(PublicChild.class.getMethod("parentProtectedAnnotatedMethod"),
                Annotated.class, true, true));
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50505);assertNotNull(MethodUtils.getAnnotation(PublicChild.class.getDeclaredMethod("privateAnnotatedMethod"),
                Annotated.class, true, true));
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50506);assertNotNull(MethodUtils.getAnnotation(PublicChild.class.getMethod("publicAnnotatedMethod"),
                Annotated.class, true, true));
    }finally{__CLR4_5_212oz12ozlvha7i9j.R.flushNeeded();}}

    @Test
    public void testGetAnnotationNotSearchSupersButIgnoreAccess() throws NoSuchMethodException {__CLR4_5_212oz12ozlvha7i9j.R.globalSliceStart(getClass().getName(),50507);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2v9or8e12yz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_212oz12ozlvha7i9j.R.rethrow($CLV_t2$);}finally{__CLR4_5_212oz12ozlvha7i9j.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.reflect.MethodUtilsTest.testGetAnnotationNotSearchSupersButIgnoreAccess",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),50507,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2v9or8e12yz() throws NoSuchMethodException{try{__CLR4_5_212oz12ozlvha7i9j.R.inc(50507);
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50508);assertNull(MethodUtils.getAnnotation(PublicChild.class.getMethod("parentNotAnnotatedMethod"),
                Annotated.class, false, true));
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50509);assertNull(MethodUtils.getAnnotation(PublicChild.class.getMethod("doIt"), Annotated.class,
                false, true));
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50510);assertNull(MethodUtils.getAnnotation(PublicChild.class.getMethod("parentProtectedAnnotatedMethod"),
                Annotated.class, false, true));
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50511);assertNotNull(MethodUtils.getAnnotation(PublicChild.class.getDeclaredMethod("privateAnnotatedMethod"),
                Annotated.class, false, true));
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50512);assertNotNull(MethodUtils.getAnnotation(PublicChild.class.getMethod("publicAnnotatedMethod"),
                Annotated.class, false, true));
    }finally{__CLR4_5_212oz12ozlvha7i9j.R.flushNeeded();}}

    @Test
    public void testGetAnnotationSearchSupersButNotIgnoreAccess() throws NoSuchMethodException {__CLR4_5_212oz12ozlvha7i9j.R.globalSliceStart(getClass().getName(),50513);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2mtdqda12z5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_212oz12ozlvha7i9j.R.rethrow($CLV_t2$);}finally{__CLR4_5_212oz12ozlvha7i9j.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.reflect.MethodUtilsTest.testGetAnnotationSearchSupersButNotIgnoreAccess",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),50513,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2mtdqda12z5() throws NoSuchMethodException{try{__CLR4_5_212oz12ozlvha7i9j.R.inc(50513);
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50514);assertNull(MethodUtils.getAnnotation(PublicChild.class.getMethod("parentNotAnnotatedMethod"),
                Annotated.class, true, false));
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50515);assertNull(MethodUtils.getAnnotation(PublicChild.class.getMethod("doIt"), Annotated.class,
                true, false));
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50516);assertNull(MethodUtils.getAnnotation(PublicChild.class.getMethod("parentProtectedAnnotatedMethod"),
                Annotated.class, true, false));
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50517);assertNull(MethodUtils.getAnnotation(PublicChild.class.getDeclaredMethod("privateAnnotatedMethod"),
                Annotated.class, true, false));
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50518);assertNotNull(MethodUtils.getAnnotation(PublicChild.class.getMethod("publicAnnotatedMethod"),
                Annotated.class, true, false));
    }finally{__CLR4_5_212oz12ozlvha7i9j.R.flushNeeded();}}

    @Test
    public void testGetAnnotationNotSearchSupersAndNotIgnoreAccess() throws NoSuchMethodException {__CLR4_5_212oz12ozlvha7i9j.R.globalSliceStart(getClass().getName(),50519);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22hc7if12zb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_212oz12ozlvha7i9j.R.rethrow($CLV_t2$);}finally{__CLR4_5_212oz12ozlvha7i9j.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.reflect.MethodUtilsTest.testGetAnnotationNotSearchSupersAndNotIgnoreAccess",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),50519,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22hc7if12zb() throws NoSuchMethodException{try{__CLR4_5_212oz12ozlvha7i9j.R.inc(50519);
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50520);assertNull(MethodUtils.getAnnotation(PublicChild.class.getMethod("parentNotAnnotatedMethod"),
                Annotated.class, false, false));
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50521);assertNull(MethodUtils.getAnnotation(PublicChild.class.getMethod("doIt"), Annotated.class,
                false, false));
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50522);assertNull(MethodUtils.getAnnotation(PublicChild.class.getMethod("parentProtectedAnnotatedMethod"),
                Annotated.class, false, false));
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50523);assertNull(MethodUtils.getAnnotation(PublicChild.class.getDeclaredMethod("privateAnnotatedMethod"),
                Annotated.class, false, false));
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50524);assertNotNull(MethodUtils.getAnnotation(PublicChild.class.getMethod("publicAnnotatedMethod"),
                Annotated.class, false, false));
    }finally{__CLR4_5_212oz12ozlvha7i9j.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class)
    public void testGetMethodsWithAnnotationIllegalArgumentException1() {__CLR4_5_212oz12ozlvha7i9j.R.globalSliceStart(getClass().getName(),50525);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2cacpwn12zh();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,71,101,116,77,101,116,104,111,100,115,87,105,116,104,65,110,110,111,116,97,116,105,111,110,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,49,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_212oz12ozlvha7i9j.R.rethrow($CLV_t2$);}finally{__CLR4_5_212oz12ozlvha7i9j.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.reflect.MethodUtilsTest.testGetMethodsWithAnnotationIllegalArgumentException1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),50525,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2cacpwn12zh(){try{__CLR4_5_212oz12ozlvha7i9j.R.inc(50525);
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50526);MethodUtils.getMethodsWithAnnotation(FieldUtilsTest.class, null);
    }finally{__CLR4_5_212oz12ozlvha7i9j.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class)
    public void testGetMethodsWithAnnotationIllegalArgumentException2() {__CLR4_5_212oz12ozlvha7i9j.R.globalSliceStart(getClass().getName(),50527);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_291cr4612zj();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,71,101,116,77,101,116,104,111,100,115,87,105,116,104,65,110,110,111,116,97,116,105,111,110,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,50,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_212oz12ozlvha7i9j.R.rethrow($CLV_t2$);}finally{__CLR4_5_212oz12ozlvha7i9j.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.reflect.MethodUtilsTest.testGetMethodsWithAnnotationIllegalArgumentException2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),50527,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_291cr4612zj(){try{__CLR4_5_212oz12ozlvha7i9j.R.inc(50527);
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50528);MethodUtils.getMethodsWithAnnotation(null, Annotated.class);
    }finally{__CLR4_5_212oz12ozlvha7i9j.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class)
    public void testGetMethodsWithAnnotationIllegalArgumentException3() {__CLR4_5_212oz12ozlvha7i9j.R.globalSliceStart(getClass().getName(),50529);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_25scsbp12zl();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,71,101,116,77,101,116,104,111,100,115,87,105,116,104,65,110,110,111,116,97,116,105,111,110,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,51,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_212oz12ozlvha7i9j.R.rethrow($CLV_t2$);}finally{__CLR4_5_212oz12ozlvha7i9j.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.reflect.MethodUtilsTest.testGetMethodsWithAnnotationIllegalArgumentException3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),50529,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_25scsbp12zl(){try{__CLR4_5_212oz12ozlvha7i9j.R.inc(50529);
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50530);MethodUtils.getMethodsWithAnnotation(null, null);
    }finally{__CLR4_5_212oz12ozlvha7i9j.R.flushNeeded();}}

    @Test
    @Annotated
    public void testGetMethodsListWithAnnotation() throws NoSuchMethodException {__CLR4_5_212oz12ozlvha7i9j.R.globalSliceStart(getClass().getName(),50531);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2dgmqmg12zn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_212oz12ozlvha7i9j.R.rethrow($CLV_t2$);}finally{__CLR4_5_212oz12ozlvha7i9j.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.reflect.MethodUtilsTest.testGetMethodsListWithAnnotation",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),50531,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2dgmqmg12zn() throws NoSuchMethodException{try{__CLR4_5_212oz12ozlvha7i9j.R.inc(50531);
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50532);assertEquals(0, MethodUtils.getMethodsListWithAnnotation(Object.class, Annotated.class).size());

        __CLR4_5_212oz12ozlvha7i9j.R.inc(50533);final List<Method> methodWithAnnotation = MethodUtils.getMethodsListWithAnnotation(MethodUtilsTest.class, Annotated.class);
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50534);assertEquals(2, methodWithAnnotation.size());
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50535);assertThat(methodWithAnnotation, hasItems(
                MethodUtilsTest.class.getMethod("testGetMethodsWithAnnotation"),
                MethodUtilsTest.class.getMethod("testGetMethodsListWithAnnotation")
        ));
    }finally{__CLR4_5_212oz12ozlvha7i9j.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class)
    public void testGetMethodsListWithAnnotationIllegalArgumentException1() {__CLR4_5_212oz12ozlvha7i9j.R.globalSliceStart(getClass().getName(),50536);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2uck2l712zs();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,71,101,116,77,101,116,104,111,100,115,76,105,115,116,87,105,116,104,65,110,110,111,116,97,116,105,111,110,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,49,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_212oz12ozlvha7i9j.R.rethrow($CLV_t2$);}finally{__CLR4_5_212oz12ozlvha7i9j.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.reflect.MethodUtilsTest.testGetMethodsListWithAnnotationIllegalArgumentException1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),50536,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2uck2l712zs(){try{__CLR4_5_212oz12ozlvha7i9j.R.inc(50536);
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50537);MethodUtils.getMethodsListWithAnnotation(FieldUtilsTest.class, null);
    }finally{__CLR4_5_212oz12ozlvha7i9j.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class)
    public void testGetMethodsListWithAnnotationIllegalArgumentException2() {__CLR4_5_212oz12ozlvha7i9j.R.globalSliceStart(getClass().getName(),50538);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2xlk1do12zu();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,71,101,116,77,101,116,104,111,100,115,76,105,115,116,87,105,116,104,65,110,110,111,116,97,116,105,111,110,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,50,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_212oz12ozlvha7i9j.R.rethrow($CLV_t2$);}finally{__CLR4_5_212oz12ozlvha7i9j.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.reflect.MethodUtilsTest.testGetMethodsListWithAnnotationIllegalArgumentException2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),50538,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2xlk1do12zu(){try{__CLR4_5_212oz12ozlvha7i9j.R.inc(50538);
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50539);MethodUtils.getMethodsListWithAnnotation(null, Annotated.class);
    }finally{__CLR4_5_212oz12ozlvha7i9j.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class)
    public void testGetMethodsListWithAnnotationIllegalArgumentException3() {__CLR4_5_212oz12ozlvha7i9j.R.globalSliceStart(getClass().getName(),50540);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2y6k1sz12zw();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,71,101,116,77,101,116,104,111,100,115,76,105,115,116,87,105,116,104,65,110,110,111,116,97,116,105,111,110,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,51,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_212oz12ozlvha7i9j.R.rethrow($CLV_t2$);}finally{__CLR4_5_212oz12ozlvha7i9j.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.reflect.MethodUtilsTest.testGetMethodsListWithAnnotationIllegalArgumentException3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),50540,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2y6k1sz12zw(){try{__CLR4_5_212oz12ozlvha7i9j.R.inc(50540);
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50541);MethodUtils.getMethodsListWithAnnotation(null, null);
    }finally{__CLR4_5_212oz12ozlvha7i9j.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class)
    public void testGetAnnotationIllegalArgumentException1() {__CLR4_5_212oz12ozlvha7i9j.R.globalSliceStart(getClass().getName(),50542);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24a5rt512zy();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,71,101,116,65,110,110,111,116,97,116,105,111,110,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,49,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_212oz12ozlvha7i9j.R.rethrow($CLV_t2$);}finally{__CLR4_5_212oz12ozlvha7i9j.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.reflect.MethodUtilsTest.testGetAnnotationIllegalArgumentException1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),50542,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24a5rt512zy(){try{__CLR4_5_212oz12ozlvha7i9j.R.inc(50542);
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50543);MethodUtils.getAnnotation(FieldUtilsTest.class.getDeclaredMethods()[0], null, true,
                true);
    }finally{__CLR4_5_212oz12ozlvha7i9j.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class)
    public void testGetAnnotationIllegalArgumentException2() {__CLR4_5_212oz12ozlvha7i9j.R.globalSliceStart(getClass().getName(),50544);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27j5qlm1300();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,71,101,116,65,110,110,111,116,97,116,105,111,110,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,50,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_212oz12ozlvha7i9j.R.rethrow($CLV_t2$);}finally{__CLR4_5_212oz12ozlvha7i9j.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.reflect.MethodUtilsTest.testGetAnnotationIllegalArgumentException2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),50544,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27j5qlm1300(){try{__CLR4_5_212oz12ozlvha7i9j.R.inc(50544);
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50545);MethodUtils.getAnnotation(null, Annotated.class, true, true);
    }finally{__CLR4_5_212oz12ozlvha7i9j.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class)
    public void testGetAnnotationIllegalArgumentException3() {__CLR4_5_212oz12ozlvha7i9j.R.globalSliceStart(getClass().getName(),50546);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2as5pe31302();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,71,101,116,65,110,110,111,116,97,116,105,111,110,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,51,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_212oz12ozlvha7i9j.R.rethrow($CLV_t2$);}finally{__CLR4_5_212oz12ozlvha7i9j.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.reflect.MethodUtilsTest.testGetAnnotationIllegalArgumentException3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),50546,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2as5pe31302(){try{__CLR4_5_212oz12ozlvha7i9j.R.inc(50546);
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50547);MethodUtils.getAnnotation(null, null, true, true);
    }finally{__CLR4_5_212oz12ozlvha7i9j.R.flushNeeded();}}

    private void expectMatchingAccessibleMethodParameterTypes(final Class<?> cls,
            final String methodName, final Class<?>[] requestTypes, final Class<?>[] actualTypes) {try{__CLR4_5_212oz12ozlvha7i9j.R.inc(50548);
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50549);final Method m = MethodUtils.getMatchingAccessibleMethod(cls, methodName,
                requestTypes);
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50550);assertNotNull("could not find any matches for " + methodName
                + " (" + ((((requestTypes == null )&&(__CLR4_5_212oz12ozlvha7i9j.R.iget(50551)!=0|true))||(__CLR4_5_212oz12ozlvha7i9j.R.iget(50552)==0&false))? null : toString(requestTypes)) + ")", m);
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50553);assertTrue(toString(m.getParameterTypes()) + " not equals "
                + toString(actualTypes), Arrays.equals(actualTypes, m
                .getParameterTypes()));
    }finally{__CLR4_5_212oz12ozlvha7i9j.R.flushNeeded();}}

    private String toString(final Class<?>[] c) {try{__CLR4_5_212oz12ozlvha7i9j.R.inc(50554);
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50555);return Arrays.asList(c).toString();
    }finally{__CLR4_5_212oz12ozlvha7i9j.R.flushNeeded();}}

    private Class<?>[] singletonArray(final Class<?> c) {try{__CLR4_5_212oz12ozlvha7i9j.R.inc(50556);
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50557);Class<?>[] result = classCache.get(c);
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50558);if ((((result == null)&&(__CLR4_5_212oz12ozlvha7i9j.R.iget(50559)!=0|true))||(__CLR4_5_212oz12ozlvha7i9j.R.iget(50560)==0&false))) {{
            __CLR4_5_212oz12ozlvha7i9j.R.inc(50561);result = new Class[] { c };
            __CLR4_5_212oz12ozlvha7i9j.R.inc(50562);classCache.put(c, result);
        }
        }__CLR4_5_212oz12ozlvha7i9j.R.inc(50563);return result;
    }finally{__CLR4_5_212oz12ozlvha7i9j.R.flushNeeded();}}

    public static class InheritanceBean {
        public void testOne(final Object obj) {try{__CLR4_5_212oz12ozlvha7i9j.R.inc(50564);}finally{__CLR4_5_212oz12ozlvha7i9j.R.flushNeeded();}}
        public void testOne(final GrandParentObject obj) {try{__CLR4_5_212oz12ozlvha7i9j.R.inc(50565);}finally{__CLR4_5_212oz12ozlvha7i9j.R.flushNeeded();}}
        public void testOne(final ParentObject obj) {try{__CLR4_5_212oz12ozlvha7i9j.R.inc(50566);}finally{__CLR4_5_212oz12ozlvha7i9j.R.flushNeeded();}}
        public void testTwo(final Object obj) {try{__CLR4_5_212oz12ozlvha7i9j.R.inc(50567);}finally{__CLR4_5_212oz12ozlvha7i9j.R.flushNeeded();}}
        public void testTwo(final GrandParentObject obj) {try{__CLR4_5_212oz12ozlvha7i9j.R.inc(50568);}finally{__CLR4_5_212oz12ozlvha7i9j.R.flushNeeded();}}
        public void testTwo(final ChildInterface obj) {try{__CLR4_5_212oz12ozlvha7i9j.R.inc(50569);}finally{__CLR4_5_212oz12ozlvha7i9j.R.flushNeeded();}}
    }

    interface ChildInterface {}
    public static class GrandParentObject {}
    public static class ParentObject extends GrandParentObject {}
    public static class ChildObject extends ParentObject implements ChildInterface {}

    private static class MethodDescriptor {
        final Class<?> declaringClass;
        final String name;
        final Type[] parameterTypes;

        MethodDescriptor(final Class<?> declaringClass, final String name, final Type... parameterTypes) {try{__CLR4_5_212oz12ozlvha7i9j.R.inc(50570);
            __CLR4_5_212oz12ozlvha7i9j.R.inc(50571);this.declaringClass = declaringClass;
            __CLR4_5_212oz12ozlvha7i9j.R.inc(50572);this.name = name;
            __CLR4_5_212oz12ozlvha7i9j.R.inc(50573);this.parameterTypes = parameterTypes;
        }finally{__CLR4_5_212oz12ozlvha7i9j.R.flushNeeded();}}
    }

    @Test
    public void testVarArgsUnboxing() throws Exception {__CLR4_5_212oz12ozlvha7i9j.R.globalSliceStart(getClass().getName(),50574);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2rrxs6h130u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_212oz12ozlvha7i9j.R.rethrow($CLV_t2$);}finally{__CLR4_5_212oz12ozlvha7i9j.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.reflect.MethodUtilsTest.testVarArgsUnboxing",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),50574,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2rrxs6h130u() throws Exception{try{__CLR4_5_212oz12ozlvha7i9j.R.inc(50574);
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50575);final TestBean testBean = new TestBean();
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50576);final int[] actual = (int[])MethodUtils.invokeMethod(testBean, "unboxing", Integer.valueOf(1), Integer.valueOf(2));
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50577);Assert.assertArrayEquals(new int[]{1, 2}, actual);
    }finally{__CLR4_5_212oz12ozlvha7i9j.R.flushNeeded();}}

    @Test
    public void testInvokeMethodForceAccessNoArgs() throws Exception {__CLR4_5_212oz12ozlvha7i9j.R.globalSliceStart(getClass().getName(),50578);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2k8jujt130y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_212oz12ozlvha7i9j.R.rethrow($CLV_t2$);}finally{__CLR4_5_212oz12ozlvha7i9j.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.reflect.MethodUtilsTest.testInvokeMethodForceAccessNoArgs",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),50578,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2k8jujt130y() throws Exception{try{__CLR4_5_212oz12ozlvha7i9j.R.inc(50578);
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50579);Assert.assertEquals("privateStringStuff()", MethodUtils.invokeMethod(testBean, true, "privateStringStuff"));
    }finally{__CLR4_5_212oz12ozlvha7i9j.R.flushNeeded();}}

    @Test
    public void testInvokeMethodForceAccessWithArgs() throws Exception {__CLR4_5_212oz12ozlvha7i9j.R.globalSliceStart(getClass().getName(),50580);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22bvlu61310();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_212oz12ozlvha7i9j.R.rethrow($CLV_t2$);}finally{__CLR4_5_212oz12ozlvha7i9j.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.reflect.MethodUtilsTest.testInvokeMethodForceAccessWithArgs",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),50580,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22bvlu61310() throws Exception{try{__CLR4_5_212oz12ozlvha7i9j.R.inc(50580);
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50581);Assert.assertEquals("privateStringStuff(Integer)", MethodUtils.invokeMethod(testBean, true, "privateStringStuff", 5));
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50582);Assert.assertEquals("privateStringStuff(double)", MethodUtils.invokeMethod(testBean, true, "privateStringStuff", 5.0d));
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50583);Assert.assertEquals("privateStringStuff(String)", MethodUtils.invokeMethod(testBean, true, "privateStringStuff", "Hi There"));
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50584);Assert.assertEquals("privateStringStuff(Object)", MethodUtils.invokeMethod(testBean, true, "privateStringStuff", new Date()));
    }finally{__CLR4_5_212oz12ozlvha7i9j.R.flushNeeded();}}

    @Test
    public void testDistance() throws Exception {__CLR4_5_212oz12ozlvha7i9j.R.globalSliceStart(getClass().getName(),50585);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2o82ia61315();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_212oz12ozlvha7i9j.R.rethrow($CLV_t2$);}finally{__CLR4_5_212oz12ozlvha7i9j.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.reflect.MethodUtilsTest.testDistance",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),50585,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2o82ia61315() throws Exception{try{__CLR4_5_212oz12ozlvha7i9j.R.inc(50585);
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50586);final Method distanceMethod = MethodUtils.getMatchingMethod(MethodUtils.class, "distance", Class[].class, Class[].class);
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50587);distanceMethod.setAccessible(true);

        __CLR4_5_212oz12ozlvha7i9j.R.inc(50588);Assert.assertEquals(-1, distanceMethod.invoke(null, new Class[]{String.class}, new Class[]{Date.class}));
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50589);Assert.assertEquals(0, distanceMethod.invoke(null, new Class[]{Date.class}, new Class[]{Date.class}));
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50590);Assert.assertEquals(1, distanceMethod.invoke(null, new Class[]{Integer.class}, new Class[]{ClassUtils.wrapperToPrimitive(Integer.class)}));
        __CLR4_5_212oz12ozlvha7i9j.R.inc(50591);Assert.assertEquals(2, distanceMethod.invoke(null, new Class[]{Integer.class}, new Class[]{Object.class}));

        __CLR4_5_212oz12ozlvha7i9j.R.inc(50592);distanceMethod.setAccessible(false);
    }finally{__CLR4_5_212oz12ozlvha7i9j.R.flushNeeded();}}
}
