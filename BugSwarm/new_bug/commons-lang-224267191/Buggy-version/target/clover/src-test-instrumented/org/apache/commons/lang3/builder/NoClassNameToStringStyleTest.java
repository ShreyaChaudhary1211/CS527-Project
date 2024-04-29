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
package org.apache.commons.lang3.builder;

import org.apache.commons.lang3.builder.ToStringStyleTest.Person;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.Assert.assertEquals;

/**
 * Unit tests {@link ToStringStyle#NO_CLASS_NAME_STYLE}.
 */
public class NoClassNameToStringStyleTest {static class __CLR4_5_2wn5wn5lvha7hfr{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172763741L,8589935092L,42363,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private final Integer base = Integer.valueOf(5);

    @Before
    public void setUp() throws Exception {try{__CLR4_5_2wn5wn5lvha7hfr.R.inc(42305);
        __CLR4_5_2wn5wn5lvha7hfr.R.inc(42306);ToStringBuilder.setDefaultStyle(ToStringStyle.NO_CLASS_NAME_STYLE);
    }finally{__CLR4_5_2wn5wn5lvha7hfr.R.flushNeeded();}}

    @After
    public void tearDown() throws Exception {try{__CLR4_5_2wn5wn5lvha7hfr.R.inc(42307);
        __CLR4_5_2wn5wn5lvha7hfr.R.inc(42308);ToStringBuilder.setDefaultStyle(ToStringStyle.DEFAULT_STYLE);
    }finally{__CLR4_5_2wn5wn5lvha7hfr.R.flushNeeded();}}

    //----------------------------------------------------------------

    @Test
    public void testBlank() {__CLR4_5_2wn5wn5lvha7hfr.R.globalSliceStart(getClass().getName(),42309);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2s7z6qxwn9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2wn5wn5lvha7hfr.R.rethrow($CLV_t2$);}finally{__CLR4_5_2wn5wn5lvha7hfr.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.NoClassNameToStringStyleTest.testBlank",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),42309,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2s7z6qxwn9(){try{__CLR4_5_2wn5wn5lvha7hfr.R.inc(42309);
        __CLR4_5_2wn5wn5lvha7hfr.R.inc(42310);assertEquals("[]", new ToStringBuilder(base).toString());
    }finally{__CLR4_5_2wn5wn5lvha7hfr.R.flushNeeded();}}

    @Test
    public void testAppendSuper() {__CLR4_5_2wn5wn5lvha7hfr.R.globalSliceStart(getClass().getName(),42311);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2cvyfiiwnb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2wn5wn5lvha7hfr.R.rethrow($CLV_t2$);}finally{__CLR4_5_2wn5wn5lvha7hfr.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.NoClassNameToStringStyleTest.testAppendSuper",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),42311,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2cvyfiiwnb(){try{__CLR4_5_2wn5wn5lvha7hfr.R.inc(42311);
        __CLR4_5_2wn5wn5lvha7hfr.R.inc(42312);assertEquals("[]", new ToStringBuilder(base).appendSuper("Integer@8888[]").toString());
        __CLR4_5_2wn5wn5lvha7hfr.R.inc(42313);assertEquals("[<null>]", new ToStringBuilder(base).appendSuper("Integer@8888[<null>]").toString());

        __CLR4_5_2wn5wn5lvha7hfr.R.inc(42314);assertEquals("[a=hello]", new ToStringBuilder(base).appendSuper("Integer@8888[]").append("a", "hello").toString());
        __CLR4_5_2wn5wn5lvha7hfr.R.inc(42315);assertEquals("[<null>,a=hello]", new ToStringBuilder(base).appendSuper("Integer@8888[<null>]").append("a", "hello").toString());
        __CLR4_5_2wn5wn5lvha7hfr.R.inc(42316);assertEquals("[a=hello]", new ToStringBuilder(base).appendSuper(null).append("a", "hello").toString());
    }finally{__CLR4_5_2wn5wn5lvha7hfr.R.flushNeeded();}}

    @Test
    public void testObject() {__CLR4_5_2wn5wn5lvha7hfr.R.globalSliceStart(getClass().getName(),42317);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2iogga0wnh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2wn5wn5lvha7hfr.R.rethrow($CLV_t2$);}finally{__CLR4_5_2wn5wn5lvha7hfr.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.NoClassNameToStringStyleTest.testObject",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),42317,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2iogga0wnh(){try{__CLR4_5_2wn5wn5lvha7hfr.R.inc(42317);
        __CLR4_5_2wn5wn5lvha7hfr.R.inc(42318);final Integer i3 = Integer.valueOf(3);
        __CLR4_5_2wn5wn5lvha7hfr.R.inc(42319);final Integer i4 = Integer.valueOf(4);
        __CLR4_5_2wn5wn5lvha7hfr.R.inc(42320);assertEquals("[<null>]", new ToStringBuilder(base).append((Object) null).toString());
        __CLR4_5_2wn5wn5lvha7hfr.R.inc(42321);assertEquals("[3]", new ToStringBuilder(base).append(i3).toString());
        __CLR4_5_2wn5wn5lvha7hfr.R.inc(42322);assertEquals("[a=<null>]", new ToStringBuilder(base).append("a", (Object) null).toString());
        __CLR4_5_2wn5wn5lvha7hfr.R.inc(42323);assertEquals("[a=3]", new ToStringBuilder(base).append("a", i3).toString());
        __CLR4_5_2wn5wn5lvha7hfr.R.inc(42324);assertEquals("[a=3,b=4]", new ToStringBuilder(base).append("a", i3).append("b", i4).toString());
        __CLR4_5_2wn5wn5lvha7hfr.R.inc(42325);assertEquals("[a=<Integer>]", new ToStringBuilder(base).append("a", i3, false).toString());
        __CLR4_5_2wn5wn5lvha7hfr.R.inc(42326);assertEquals("[a=<size=0>]", new ToStringBuilder(base).append("a", new ArrayList<>(), false).toString());
        __CLR4_5_2wn5wn5lvha7hfr.R.inc(42327);assertEquals("[a=[]]", new ToStringBuilder(base).append("a", new ArrayList<>(), true).toString());
        __CLR4_5_2wn5wn5lvha7hfr.R.inc(42328);assertEquals("[a=<size=0>]", new ToStringBuilder(base).append("a", new HashMap<>(), false).toString());
        __CLR4_5_2wn5wn5lvha7hfr.R.inc(42329);assertEquals("[a={}]", new ToStringBuilder(base).append("a", new HashMap<>(), true).toString());
        __CLR4_5_2wn5wn5lvha7hfr.R.inc(42330);assertEquals("[a=<size=0>]", new ToStringBuilder(base).append("a", (Object) new String[0], false).toString());
        __CLR4_5_2wn5wn5lvha7hfr.R.inc(42331);assertEquals("[a={}]", new ToStringBuilder(base).append("a", (Object) new String[0], true).toString());
    }finally{__CLR4_5_2wn5wn5lvha7hfr.R.flushNeeded();}}

    @Test
    public void testPerson() {__CLR4_5_2wn5wn5lvha7hfr.R.globalSliceStart(getClass().getName(),42332);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2rmqmmqwnw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2wn5wn5lvha7hfr.R.rethrow($CLV_t2$);}finally{__CLR4_5_2wn5wn5lvha7hfr.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.NoClassNameToStringStyleTest.testPerson",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),42332,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2rmqmmqwnw(){try{__CLR4_5_2wn5wn5lvha7hfr.R.inc(42332);
        __CLR4_5_2wn5wn5lvha7hfr.R.inc(42333);final Person p = new Person();
        __CLR4_5_2wn5wn5lvha7hfr.R.inc(42334);p.name = "John Q. Public";
        __CLR4_5_2wn5wn5lvha7hfr.R.inc(42335);p.age = 45;
        __CLR4_5_2wn5wn5lvha7hfr.R.inc(42336);p.smoker = true;
        __CLR4_5_2wn5wn5lvha7hfr.R.inc(42337);assertEquals("[name=John Q. Public,age=45,smoker=true]", new ToStringBuilder(p).append("name", p.name).append("age", p.age).append("smoker", p.smoker).toString());
    }finally{__CLR4_5_2wn5wn5lvha7hfr.R.flushNeeded();}}

    @Test
    public void testLong() {__CLR4_5_2wn5wn5lvha7hfr.R.globalSliceStart(getClass().getName(),42338);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2xsq9mzwo2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2wn5wn5lvha7hfr.R.rethrow($CLV_t2$);}finally{__CLR4_5_2wn5wn5lvha7hfr.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.NoClassNameToStringStyleTest.testLong",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),42338,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2xsq9mzwo2(){try{__CLR4_5_2wn5wn5lvha7hfr.R.inc(42338);
        __CLR4_5_2wn5wn5lvha7hfr.R.inc(42339);assertEquals("[3]", new ToStringBuilder(base).append(3L).toString());
        __CLR4_5_2wn5wn5lvha7hfr.R.inc(42340);assertEquals("[a=3]", new ToStringBuilder(base).append("a", 3L).toString());
        __CLR4_5_2wn5wn5lvha7hfr.R.inc(42341);assertEquals("[a=3,b=4]", new ToStringBuilder(base).append("a", 3L).append("b", 4L).toString());
    }finally{__CLR4_5_2wn5wn5lvha7hfr.R.flushNeeded();}}

    @Test
    public void testObjectArray() {__CLR4_5_2wn5wn5lvha7hfr.R.globalSliceStart(getClass().getName(),42342);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2oi04a7wo6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2wn5wn5lvha7hfr.R.rethrow($CLV_t2$);}finally{__CLR4_5_2wn5wn5lvha7hfr.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.NoClassNameToStringStyleTest.testObjectArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),42342,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2oi04a7wo6(){try{__CLR4_5_2wn5wn5lvha7hfr.R.inc(42342);
        __CLR4_5_2wn5wn5lvha7hfr.R.inc(42343);Object[] array = new Object[] {null, base, new int[] {3, 6}};
        __CLR4_5_2wn5wn5lvha7hfr.R.inc(42344);assertEquals("[{<null>,5,{3,6}}]", new ToStringBuilder(base).append(array).toString());
        __CLR4_5_2wn5wn5lvha7hfr.R.inc(42345);assertEquals("[{<null>,5,{3,6}}]", new ToStringBuilder(base).append((Object) array).toString());
        __CLR4_5_2wn5wn5lvha7hfr.R.inc(42346);array = null;
        __CLR4_5_2wn5wn5lvha7hfr.R.inc(42347);assertEquals("[<null>]", new ToStringBuilder(base).append(array).toString());
        __CLR4_5_2wn5wn5lvha7hfr.R.inc(42348);assertEquals("[<null>]", new ToStringBuilder(base).append((Object) array).toString());
    }finally{__CLR4_5_2wn5wn5lvha7hfr.R.flushNeeded();}}

    @Test
    public void testLongArray() {__CLR4_5_2wn5wn5lvha7hfr.R.globalSliceStart(getClass().getName(),42349);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2if58i6wod();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2wn5wn5lvha7hfr.R.rethrow($CLV_t2$);}finally{__CLR4_5_2wn5wn5lvha7hfr.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.NoClassNameToStringStyleTest.testLongArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),42349,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2if58i6wod(){try{__CLR4_5_2wn5wn5lvha7hfr.R.inc(42349);
        __CLR4_5_2wn5wn5lvha7hfr.R.inc(42350);long[] array = new long[] {1, 2, -3, 4};
        __CLR4_5_2wn5wn5lvha7hfr.R.inc(42351);assertEquals("[{1,2,-3,4}]", new ToStringBuilder(base).append(array).toString());
        __CLR4_5_2wn5wn5lvha7hfr.R.inc(42352);assertEquals("[{1,2,-3,4}]", new ToStringBuilder(base).append((Object) array).toString());
        __CLR4_5_2wn5wn5lvha7hfr.R.inc(42353);array = null;
        __CLR4_5_2wn5wn5lvha7hfr.R.inc(42354);assertEquals("[<null>]", new ToStringBuilder(base).append(array).toString());
        __CLR4_5_2wn5wn5lvha7hfr.R.inc(42355);assertEquals("[<null>]", new ToStringBuilder(base).append((Object) array).toString());
    }finally{__CLR4_5_2wn5wn5lvha7hfr.R.flushNeeded();}}

    @Test
    public void testLongArrayArray() {__CLR4_5_2wn5wn5lvha7hfr.R.globalSliceStart(getClass().getName(),42356);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2xbpkglwok();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2wn5wn5lvha7hfr.R.rethrow($CLV_t2$);}finally{__CLR4_5_2wn5wn5lvha7hfr.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.NoClassNameToStringStyleTest.testLongArrayArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),42356,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2xbpkglwok(){try{__CLR4_5_2wn5wn5lvha7hfr.R.inc(42356);
        __CLR4_5_2wn5wn5lvha7hfr.R.inc(42357);long[][] array = new long[][] {{1, 2}, null, {5}};
        __CLR4_5_2wn5wn5lvha7hfr.R.inc(42358);assertEquals("[{{1,2},<null>,{5}}]", new ToStringBuilder(base).append(array).toString());
        __CLR4_5_2wn5wn5lvha7hfr.R.inc(42359);assertEquals("[{{1,2},<null>,{5}}]", new ToStringBuilder(base).append((Object) array).toString());
        __CLR4_5_2wn5wn5lvha7hfr.R.inc(42360);array = null;
        __CLR4_5_2wn5wn5lvha7hfr.R.inc(42361);assertEquals("[<null>]", new ToStringBuilder(base).append(array).toString());
        __CLR4_5_2wn5wn5lvha7hfr.R.inc(42362);assertEquals("[<null>]", new ToStringBuilder(base).append((Object) array).toString());
    }finally{__CLR4_5_2wn5wn5lvha7hfr.R.flushNeeded();}}

}
