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

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.lang.reflect.Constructor;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.math.NumberUtils;
import org.apache.commons.lang3.mutable.MutableObject;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit tests ConstructorUtils
 */
public class ConstructorUtilsTest {static class __CLR4_5_2120k120klvha7i7d{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172763741L,8589935092L,49387,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static class TestBean {
        private final String toString;
        final String[] varArgs;

        public TestBean() {try{__CLR4_5_2120k120klvha7i7d.R.inc(49268);
            __CLR4_5_2120k120klvha7i7d.R.inc(49269);toString = "()";
            __CLR4_5_2120k120klvha7i7d.R.inc(49270);varArgs = null;
        }finally{__CLR4_5_2120k120klvha7i7d.R.flushNeeded();}}

        public TestBean(final int i) {try{__CLR4_5_2120k120klvha7i7d.R.inc(49271);
            __CLR4_5_2120k120klvha7i7d.R.inc(49272);toString = "(int)";
            __CLR4_5_2120k120klvha7i7d.R.inc(49273);varArgs = null;
        }finally{__CLR4_5_2120k120klvha7i7d.R.flushNeeded();}}

        public TestBean(final Integer i) {try{__CLR4_5_2120k120klvha7i7d.R.inc(49274);
            __CLR4_5_2120k120klvha7i7d.R.inc(49275);toString = "(Integer)";
            __CLR4_5_2120k120klvha7i7d.R.inc(49276);varArgs = null;
        }finally{__CLR4_5_2120k120klvha7i7d.R.flushNeeded();}}

        public TestBean(final double d) {try{__CLR4_5_2120k120klvha7i7d.R.inc(49277);
            __CLR4_5_2120k120klvha7i7d.R.inc(49278);toString = "(double)";
            __CLR4_5_2120k120klvha7i7d.R.inc(49279);varArgs = null;
        }finally{__CLR4_5_2120k120klvha7i7d.R.flushNeeded();}}

        public TestBean(final String s) {try{__CLR4_5_2120k120klvha7i7d.R.inc(49280);
            __CLR4_5_2120k120klvha7i7d.R.inc(49281);toString = "(String)";
            __CLR4_5_2120k120klvha7i7d.R.inc(49282);varArgs = null;
        }finally{__CLR4_5_2120k120klvha7i7d.R.flushNeeded();}}

        public TestBean(final Object o) {try{__CLR4_5_2120k120klvha7i7d.R.inc(49283);
            __CLR4_5_2120k120klvha7i7d.R.inc(49284);toString = "(Object)";
            __CLR4_5_2120k120klvha7i7d.R.inc(49285);varArgs = null;
        }finally{__CLR4_5_2120k120klvha7i7d.R.flushNeeded();}}

        public TestBean(final String... s) {try{__CLR4_5_2120k120klvha7i7d.R.inc(49286);
            __CLR4_5_2120k120klvha7i7d.R.inc(49287);toString = "(String...)";
            __CLR4_5_2120k120klvha7i7d.R.inc(49288);varArgs = s;
        }finally{__CLR4_5_2120k120klvha7i7d.R.flushNeeded();}}

        public TestBean(final Integer i, final String... s) {try{__CLR4_5_2120k120klvha7i7d.R.inc(49289);
            __CLR4_5_2120k120klvha7i7d.R.inc(49290);toString = "(Integer, String...)";
            __CLR4_5_2120k120klvha7i7d.R.inc(49291);varArgs = s;
        }finally{__CLR4_5_2120k120klvha7i7d.R.flushNeeded();}}

        public TestBean(final Integer first, final int... args) {try{__CLR4_5_2120k120klvha7i7d.R.inc(49292);
            __CLR4_5_2120k120klvha7i7d.R.inc(49293);toString = "(Integer, String...)";
            __CLR4_5_2120k120klvha7i7d.R.inc(49294);varArgs = new String[args.length];
            __CLR4_5_2120k120klvha7i7d.R.inc(49295);for(int i = 0; (((i< args.length)&&(__CLR4_5_2120k120klvha7i7d.R.iget(49296)!=0|true))||(__CLR4_5_2120k120klvha7i7d.R.iget(49297)==0&false)); ++i) {{
                __CLR4_5_2120k120klvha7i7d.R.inc(49298);varArgs[i] = Integer.toString(args[i]);
            }
        }}finally{__CLR4_5_2120k120klvha7i7d.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_5_2120k120klvha7i7d.R.inc(49299);
            __CLR4_5_2120k120klvha7i7d.R.inc(49300);return toString;
        }finally{__CLR4_5_2120k120klvha7i7d.R.flushNeeded();}}

        void verify(final String str, final String[] args) {try{__CLR4_5_2120k120klvha7i7d.R.inc(49301);
          __CLR4_5_2120k120klvha7i7d.R.inc(49302);assertEquals(str, toString);
          __CLR4_5_2120k120klvha7i7d.R.inc(49303);assertArrayEquals(args, varArgs);
        }finally{__CLR4_5_2120k120klvha7i7d.R.flushNeeded();}}
    }

    private static class PrivateClass {
        @SuppressWarnings("unused")
        public PrivateClass() {try{__CLR4_5_2120k120klvha7i7d.R.inc(49304);
        }finally{__CLR4_5_2120k120klvha7i7d.R.flushNeeded();}}

        @SuppressWarnings("unused")
        public static class PublicInnerClass {
            public PublicInnerClass() {try{__CLR4_5_2120k120klvha7i7d.R.inc(49305);
            }finally{__CLR4_5_2120k120klvha7i7d.R.flushNeeded();}}
        }
    }

    private final Map<Class<?>, Class<?>[]> classCache;

    public ConstructorUtilsTest() {try{__CLR4_5_2120k120klvha7i7d.R.inc(49306);
        __CLR4_5_2120k120klvha7i7d.R.inc(49307);classCache = new HashMap<>();
    }finally{__CLR4_5_2120k120klvha7i7d.R.flushNeeded();}}


    @Before
    public void setUp() throws Exception {try{__CLR4_5_2120k120klvha7i7d.R.inc(49308);
        __CLR4_5_2120k120klvha7i7d.R.inc(49309);classCache.clear();
    }finally{__CLR4_5_2120k120klvha7i7d.R.flushNeeded();}}

    @Test
    public void testConstructor() throws Exception {__CLR4_5_2120k120klvha7i7d.R.globalSliceStart(getClass().getName(),49310);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2uefs8h121q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2120k120klvha7i7d.R.rethrow($CLV_t2$);}finally{__CLR4_5_2120k120klvha7i7d.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.reflect.ConstructorUtilsTest.testConstructor",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),49310,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2uefs8h121q() throws Exception{try{__CLR4_5_2120k120klvha7i7d.R.inc(49310);
        __CLR4_5_2120k120klvha7i7d.R.inc(49311);assertNotNull(MethodUtils.class.newInstance());
    }finally{__CLR4_5_2120k120klvha7i7d.R.flushNeeded();}}

    @Test
    public void testInvokeConstructor() throws Exception {__CLR4_5_2120k120klvha7i7d.R.globalSliceStart(getClass().getName(),49312);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2uxozbd121s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2120k120klvha7i7d.R.rethrow($CLV_t2$);}finally{__CLR4_5_2120k120klvha7i7d.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.reflect.ConstructorUtilsTest.testInvokeConstructor",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),49312,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2uxozbd121s() throws Exception{try{__CLR4_5_2120k120klvha7i7d.R.inc(49312);
        __CLR4_5_2120k120klvha7i7d.R.inc(49313);assertEquals("()", ConstructorUtils.invokeConstructor(TestBean.class,
                (Object[]) ArrayUtils.EMPTY_CLASS_ARRAY).toString());
        __CLR4_5_2120k120klvha7i7d.R.inc(49314);assertEquals("()", ConstructorUtils.invokeConstructor(TestBean.class,
                (Object[]) null).toString());
        __CLR4_5_2120k120klvha7i7d.R.inc(49315);assertEquals("()", ConstructorUtils.invokeConstructor(TestBean.class).toString());
        __CLR4_5_2120k120klvha7i7d.R.inc(49316);assertEquals("(String)", ConstructorUtils.invokeConstructor(
                TestBean.class, "").toString());
        __CLR4_5_2120k120klvha7i7d.R.inc(49317);assertEquals("(Object)", ConstructorUtils.invokeConstructor(
                TestBean.class, new Object()).toString());
        __CLR4_5_2120k120klvha7i7d.R.inc(49318);assertEquals("(Object)", ConstructorUtils.invokeConstructor(
                TestBean.class, Boolean.TRUE).toString());
        __CLR4_5_2120k120klvha7i7d.R.inc(49319);assertEquals("(Integer)", ConstructorUtils.invokeConstructor(
                TestBean.class, NumberUtils.INTEGER_ONE).toString());
        __CLR4_5_2120k120klvha7i7d.R.inc(49320);assertEquals("(int)", ConstructorUtils.invokeConstructor(
                TestBean.class, NumberUtils.BYTE_ONE).toString());
        __CLR4_5_2120k120klvha7i7d.R.inc(49321);assertEquals("(double)", ConstructorUtils.invokeConstructor(
                TestBean.class, NumberUtils.LONG_ONE).toString());
        __CLR4_5_2120k120klvha7i7d.R.inc(49322);assertEquals("(double)", ConstructorUtils.invokeConstructor(
                TestBean.class, NumberUtils.DOUBLE_ONE).toString());
        __CLR4_5_2120k120klvha7i7d.R.inc(49323);ConstructorUtils.invokeConstructor(TestBean.class, NumberUtils.INTEGER_ONE)
          .verify("(Integer)", null);
        __CLR4_5_2120k120klvha7i7d.R.inc(49324);ConstructorUtils.invokeConstructor(TestBean.class, "a", "b")
          .verify("(String...)", new String[]{"a", "b"});
        __CLR4_5_2120k120klvha7i7d.R.inc(49325);ConstructorUtils.invokeConstructor(TestBean.class, NumberUtils.INTEGER_ONE, "a", "b")
          .verify("(Integer, String...)", new String[]{"a", "b"});
    }finally{__CLR4_5_2120k120klvha7i7d.R.flushNeeded();}}

    @Test
    public void testInvokeExactConstructor() throws Exception {__CLR4_5_2120k120klvha7i7d.R.globalSliceStart(getClass().getName(),49326);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2fct97w1226();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2120k120klvha7i7d.R.rethrow($CLV_t2$);}finally{__CLR4_5_2120k120klvha7i7d.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.reflect.ConstructorUtilsTest.testInvokeExactConstructor",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),49326,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2fct97w1226() throws Exception{try{__CLR4_5_2120k120klvha7i7d.R.inc(49326);
        __CLR4_5_2120k120klvha7i7d.R.inc(49327);assertEquals("()", ConstructorUtils.invokeExactConstructor(
                TestBean.class, (Object[]) ArrayUtils.EMPTY_CLASS_ARRAY).toString());
        __CLR4_5_2120k120klvha7i7d.R.inc(49328);assertEquals("()", ConstructorUtils.invokeExactConstructor(
                TestBean.class, (Object[]) null).toString());
        __CLR4_5_2120k120klvha7i7d.R.inc(49329);assertEquals("(String)", ConstructorUtils.invokeExactConstructor(
                TestBean.class, "").toString());
        __CLR4_5_2120k120klvha7i7d.R.inc(49330);assertEquals("(Object)", ConstructorUtils.invokeExactConstructor(
                TestBean.class, new Object()).toString());
        __CLR4_5_2120k120klvha7i7d.R.inc(49331);assertEquals("(Integer)", ConstructorUtils.invokeExactConstructor(
                TestBean.class, NumberUtils.INTEGER_ONE).toString());
        __CLR4_5_2120k120klvha7i7d.R.inc(49332);assertEquals("(double)", ConstructorUtils.invokeExactConstructor(
                TestBean.class, new Object[] { NumberUtils.DOUBLE_ONE },
                new Class[] { Double.TYPE }).toString());

        __CLR4_5_2120k120klvha7i7d.R.inc(49333);try {
            __CLR4_5_2120k120klvha7i7d.R.inc(49334);ConstructorUtils.invokeExactConstructor(TestBean.class,
                    NumberUtils.BYTE_ONE);
            __CLR4_5_2120k120klvha7i7d.R.inc(49335);fail("should throw NoSuchMethodException");
        } catch (final NoSuchMethodException e) {
        }
        __CLR4_5_2120k120klvha7i7d.R.inc(49336);try {
            __CLR4_5_2120k120klvha7i7d.R.inc(49337);ConstructorUtils.invokeExactConstructor(TestBean.class,
                    NumberUtils.LONG_ONE);
            __CLR4_5_2120k120klvha7i7d.R.inc(49338);fail("should throw NoSuchMethodException");
        } catch (final NoSuchMethodException e) {
        }
        __CLR4_5_2120k120klvha7i7d.R.inc(49339);try {
            __CLR4_5_2120k120klvha7i7d.R.inc(49340);ConstructorUtils.invokeExactConstructor(TestBean.class,
                    Boolean.TRUE);
            __CLR4_5_2120k120klvha7i7d.R.inc(49341);fail("should throw NoSuchMethodException");
        } catch (final NoSuchMethodException e) {
        }
    }finally{__CLR4_5_2120k120klvha7i7d.R.flushNeeded();}}

    @Test
    public void testGetAccessibleConstructor() throws Exception {__CLR4_5_2120k120klvha7i7d.R.globalSliceStart(getClass().getName(),49342);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2de8pqx122m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2120k120klvha7i7d.R.rethrow($CLV_t2$);}finally{__CLR4_5_2120k120klvha7i7d.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.reflect.ConstructorUtilsTest.testGetAccessibleConstructor",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),49342,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2de8pqx122m() throws Exception{try{__CLR4_5_2120k120klvha7i7d.R.inc(49342);
        __CLR4_5_2120k120klvha7i7d.R.inc(49343);assertNotNull(ConstructorUtils.getAccessibleConstructor(Object.class
                .getConstructor(ArrayUtils.EMPTY_CLASS_ARRAY)));
        __CLR4_5_2120k120klvha7i7d.R.inc(49344);assertNull(ConstructorUtils.getAccessibleConstructor(PrivateClass.class
                .getConstructor(ArrayUtils.EMPTY_CLASS_ARRAY)));
        __CLR4_5_2120k120klvha7i7d.R.inc(49345);assertNull(ConstructorUtils.getAccessibleConstructor(PrivateClass.PublicInnerClass.class));
    }finally{__CLR4_5_2120k120klvha7i7d.R.flushNeeded();}}

    @Test
    public void testGetAccessibleConstructorFromDescription() throws Exception {__CLR4_5_2120k120klvha7i7d.R.globalSliceStart(getClass().getName(),49346);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2awzuyv122q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2120k120klvha7i7d.R.rethrow($CLV_t2$);}finally{__CLR4_5_2120k120klvha7i7d.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.reflect.ConstructorUtilsTest.testGetAccessibleConstructorFromDescription",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),49346,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2awzuyv122q() throws Exception{try{__CLR4_5_2120k120klvha7i7d.R.inc(49346);
        __CLR4_5_2120k120klvha7i7d.R.inc(49347);assertNotNull(ConstructorUtils.getAccessibleConstructor(Object.class,
                ArrayUtils.EMPTY_CLASS_ARRAY));
        __CLR4_5_2120k120klvha7i7d.R.inc(49348);assertNull(ConstructorUtils.getAccessibleConstructor(
                PrivateClass.class, ArrayUtils.EMPTY_CLASS_ARRAY));
    }finally{__CLR4_5_2120k120klvha7i7d.R.flushNeeded();}}

    @Test
    public void testGetMatchingAccessibleMethod() throws Exception {__CLR4_5_2120k120klvha7i7d.R.globalSliceStart(getClass().getName(),49349);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ksuhnl122t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2120k120klvha7i7d.R.rethrow($CLV_t2$);}finally{__CLR4_5_2120k120klvha7i7d.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.reflect.ConstructorUtilsTest.testGetMatchingAccessibleMethod",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),49349,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ksuhnl122t() throws Exception{try{__CLR4_5_2120k120klvha7i7d.R.inc(49349);
        __CLR4_5_2120k120klvha7i7d.R.inc(49350);expectMatchingAccessibleConstructorParameterTypes(TestBean.class,
                ArrayUtils.EMPTY_CLASS_ARRAY, ArrayUtils.EMPTY_CLASS_ARRAY);
        __CLR4_5_2120k120klvha7i7d.R.inc(49351);expectMatchingAccessibleConstructorParameterTypes(TestBean.class, null,
                ArrayUtils.EMPTY_CLASS_ARRAY);
        __CLR4_5_2120k120klvha7i7d.R.inc(49352);expectMatchingAccessibleConstructorParameterTypes(TestBean.class,
                singletonArray(String.class), singletonArray(String.class));
        __CLR4_5_2120k120klvha7i7d.R.inc(49353);expectMatchingAccessibleConstructorParameterTypes(TestBean.class,
                singletonArray(Object.class), singletonArray(Object.class));
        __CLR4_5_2120k120klvha7i7d.R.inc(49354);expectMatchingAccessibleConstructorParameterTypes(TestBean.class,
                singletonArray(Boolean.class), singletonArray(Object.class));
        __CLR4_5_2120k120klvha7i7d.R.inc(49355);expectMatchingAccessibleConstructorParameterTypes(TestBean.class,
                singletonArray(Byte.class), singletonArray(Integer.TYPE));
        __CLR4_5_2120k120klvha7i7d.R.inc(49356);expectMatchingAccessibleConstructorParameterTypes(TestBean.class,
                singletonArray(Byte.TYPE), singletonArray(Integer.TYPE));
        __CLR4_5_2120k120klvha7i7d.R.inc(49357);expectMatchingAccessibleConstructorParameterTypes(TestBean.class,
                singletonArray(Short.class), singletonArray(Integer.TYPE));
        __CLR4_5_2120k120klvha7i7d.R.inc(49358);expectMatchingAccessibleConstructorParameterTypes(TestBean.class,
                singletonArray(Short.TYPE), singletonArray(Integer.TYPE));
        __CLR4_5_2120k120klvha7i7d.R.inc(49359);expectMatchingAccessibleConstructorParameterTypes(TestBean.class,
                singletonArray(Character.class), singletonArray(Integer.TYPE));
        __CLR4_5_2120k120klvha7i7d.R.inc(49360);expectMatchingAccessibleConstructorParameterTypes(TestBean.class,
                singletonArray(Character.TYPE), singletonArray(Integer.TYPE));
        __CLR4_5_2120k120klvha7i7d.R.inc(49361);expectMatchingAccessibleConstructorParameterTypes(TestBean.class,
                singletonArray(Integer.class), singletonArray(Integer.class));
        __CLR4_5_2120k120klvha7i7d.R.inc(49362);expectMatchingAccessibleConstructorParameterTypes(TestBean.class,
                singletonArray(Integer.TYPE), singletonArray(Integer.TYPE));
        __CLR4_5_2120k120klvha7i7d.R.inc(49363);expectMatchingAccessibleConstructorParameterTypes(TestBean.class,
                singletonArray(Long.class), singletonArray(Double.TYPE));
        __CLR4_5_2120k120klvha7i7d.R.inc(49364);expectMatchingAccessibleConstructorParameterTypes(TestBean.class,
                singletonArray(Long.TYPE), singletonArray(Double.TYPE));
        __CLR4_5_2120k120klvha7i7d.R.inc(49365);expectMatchingAccessibleConstructorParameterTypes(TestBean.class,
                singletonArray(Float.class), singletonArray(Double.TYPE));
        __CLR4_5_2120k120klvha7i7d.R.inc(49366);expectMatchingAccessibleConstructorParameterTypes(TestBean.class,
                singletonArray(Float.TYPE), singletonArray(Double.TYPE));
        __CLR4_5_2120k120klvha7i7d.R.inc(49367);expectMatchingAccessibleConstructorParameterTypes(TestBean.class,
                singletonArray(Double.class), singletonArray(Double.TYPE));
        __CLR4_5_2120k120klvha7i7d.R.inc(49368);expectMatchingAccessibleConstructorParameterTypes(TestBean.class,
                singletonArray(Double.TYPE), singletonArray(Double.TYPE));
    }finally{__CLR4_5_2120k120klvha7i7d.R.flushNeeded();}}

    @Test
    public void testNullArgument() {__CLR4_5_2120k120klvha7i7d.R.globalSliceStart(getClass().getName(),49369);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2r6zpsz123d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2120k120klvha7i7d.R.rethrow($CLV_t2$);}finally{__CLR4_5_2120k120klvha7i7d.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.reflect.ConstructorUtilsTest.testNullArgument",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),49369,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2r6zpsz123d(){try{__CLR4_5_2120k120klvha7i7d.R.inc(49369);
        __CLR4_5_2120k120klvha7i7d.R.inc(49370);expectMatchingAccessibleConstructorParameterTypes(MutableObject.class,
                singletonArray(null), singletonArray(Object.class));
    }finally{__CLR4_5_2120k120klvha7i7d.R.flushNeeded();}}

    private void expectMatchingAccessibleConstructorParameterTypes(final Class<?> cls,
            final Class<?>[] requestTypes, final Class<?>[] actualTypes) {try{__CLR4_5_2120k120klvha7i7d.R.inc(49371);
        __CLR4_5_2120k120klvha7i7d.R.inc(49372);final Constructor<?> c = ConstructorUtils.getMatchingAccessibleConstructor(cls,
                requestTypes);
        __CLR4_5_2120k120klvha7i7d.R.inc(49373);assertTrue(toString(c.getParameterTypes()) + " not equals "
                + toString(actualTypes), Arrays.equals(actualTypes, c
                .getParameterTypes()));
    }finally{__CLR4_5_2120k120klvha7i7d.R.flushNeeded();}}

    private String toString(final Class<?>[] c) {try{__CLR4_5_2120k120klvha7i7d.R.inc(49374);
        __CLR4_5_2120k120klvha7i7d.R.inc(49375);return Arrays.asList(c).toString();
    }finally{__CLR4_5_2120k120klvha7i7d.R.flushNeeded();}}

    private Class<?>[] singletonArray(final Class<?> c) {try{__CLR4_5_2120k120klvha7i7d.R.inc(49376);
        __CLR4_5_2120k120klvha7i7d.R.inc(49377);Class<?>[] result = classCache.get(c);
        __CLR4_5_2120k120klvha7i7d.R.inc(49378);if ((((result == null)&&(__CLR4_5_2120k120klvha7i7d.R.iget(49379)!=0|true))||(__CLR4_5_2120k120klvha7i7d.R.iget(49380)==0&false))) {{
            __CLR4_5_2120k120klvha7i7d.R.inc(49381);result = new Class[] { c };
            __CLR4_5_2120k120klvha7i7d.R.inc(49382);classCache.put(c, result);
        }
        }__CLR4_5_2120k120klvha7i7d.R.inc(49383);return result;
    }finally{__CLR4_5_2120k120klvha7i7d.R.flushNeeded();}}

    @Test
    public void testVarArgsUnboxing() throws Exception {__CLR4_5_2120k120klvha7i7d.R.globalSliceStart(getClass().getName(),49384);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2rrxs6h123s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2120k120klvha7i7d.R.rethrow($CLV_t2$);}finally{__CLR4_5_2120k120klvha7i7d.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.reflect.ConstructorUtilsTest.testVarArgsUnboxing",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),49384,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2rrxs6h123s() throws Exception{try{__CLR4_5_2120k120klvha7i7d.R.inc(49384);
        __CLR4_5_2120k120klvha7i7d.R.inc(49385);final TestBean testBean = ConstructorUtils.invokeConstructor(
                TestBean.class, Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(3));

        __CLR4_5_2120k120klvha7i7d.R.inc(49386);assertArrayEquals(new String[]{"2", "3"}, testBean.varArgs);
    }finally{__CLR4_5_2120k120klvha7i7d.R.flushNeeded();}}

}
