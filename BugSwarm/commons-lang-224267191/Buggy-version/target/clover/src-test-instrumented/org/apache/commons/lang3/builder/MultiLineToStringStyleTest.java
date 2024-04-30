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

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.HashMap;

import org.apache.commons.lang3.builder.ToStringStyleTest.Person;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit tests {@link org.apache.commons.lang3.builder.MultiLineToStringStyleTest}.
 */
public class MultiLineToStringStyleTest {static class __CLR4_5_2wjmwjmlvha7hey{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172763741L,8589935092L,42237,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private final Integer base = Integer.valueOf(5);
    private final String baseStr = base.getClass().getName() + "@" + Integer.toHexString(System.identityHashCode(base));
    
    @Before
    public void setUp() throws Exception {try{__CLR4_5_2wjmwjmlvha7hey.R.inc(42178);
        __CLR4_5_2wjmwjmlvha7hey.R.inc(42179);ToStringBuilder.setDefaultStyle(ToStringStyle.MULTI_LINE_STYLE);
    }finally{__CLR4_5_2wjmwjmlvha7hey.R.flushNeeded();}}

    @After
    public void tearDown() throws Exception {try{__CLR4_5_2wjmwjmlvha7hey.R.inc(42180);
        __CLR4_5_2wjmwjmlvha7hey.R.inc(42181);ToStringBuilder.setDefaultStyle(ToStringStyle.DEFAULT_STYLE);
    }finally{__CLR4_5_2wjmwjmlvha7hey.R.flushNeeded();}}

    //----------------------------------------------------------------

    @Test
    public void testBlank() {__CLR4_5_2wjmwjmlvha7hey.R.globalSliceStart(getClass().getName(),42182);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2s7z6qxwjq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2wjmwjmlvha7hey.R.rethrow($CLV_t2$);}finally{__CLR4_5_2wjmwjmlvha7hey.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.MultiLineToStringStyleTest.testBlank",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),42182,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2s7z6qxwjq(){try{__CLR4_5_2wjmwjmlvha7hey.R.inc(42182);
        __CLR4_5_2wjmwjmlvha7hey.R.inc(42183);assertEquals(baseStr + "[" + System.lineSeparator() + "]", new ToStringBuilder(base).toString());
    }finally{__CLR4_5_2wjmwjmlvha7hey.R.flushNeeded();}}

    @Test
    public void testAppendSuper() {__CLR4_5_2wjmwjmlvha7hey.R.globalSliceStart(getClass().getName(),42184);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2cvyfiiwjs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2wjmwjmlvha7hey.R.rethrow($CLV_t2$);}finally{__CLR4_5_2wjmwjmlvha7hey.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.MultiLineToStringStyleTest.testAppendSuper",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),42184,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2cvyfiiwjs(){try{__CLR4_5_2wjmwjmlvha7hey.R.inc(42184);
        __CLR4_5_2wjmwjmlvha7hey.R.inc(42185);assertEquals(baseStr + "[" + System.lineSeparator() + "]", new ToStringBuilder(base).appendSuper("Integer@8888[" + System.lineSeparator() + "]").toString());
        __CLR4_5_2wjmwjmlvha7hey.R.inc(42186);assertEquals(baseStr + "[" + System.lineSeparator() + "  <null>" + System.lineSeparator() + "]", new ToStringBuilder(base).appendSuper("Integer@8888[" + System.lineSeparator() + "  <null>" + System.lineSeparator() + "]").toString());
        
        __CLR4_5_2wjmwjmlvha7hey.R.inc(42187);assertEquals(baseStr + "[" + System.lineSeparator() + "  a=hello" + System.lineSeparator() + "]", new ToStringBuilder(base).appendSuper("Integer@8888[" + System.lineSeparator() + "]").append("a", "hello").toString());
        __CLR4_5_2wjmwjmlvha7hey.R.inc(42188);assertEquals(baseStr + "[" + System.lineSeparator() + "  <null>" + System.lineSeparator() + "  a=hello" + System.lineSeparator() + "]", new ToStringBuilder(base).appendSuper("Integer@8888[" + System.lineSeparator() + "  <null>" + System.lineSeparator() + "]").append("a", "hello").toString());
        __CLR4_5_2wjmwjmlvha7hey.R.inc(42189);assertEquals(baseStr + "[" + System.lineSeparator() + "  a=hello" + System.lineSeparator() + "]", new ToStringBuilder(base).appendSuper(null).append("a", "hello").toString());
    }finally{__CLR4_5_2wjmwjmlvha7hey.R.flushNeeded();}}
    
    @Test
    public void testObject() {__CLR4_5_2wjmwjmlvha7hey.R.globalSliceStart(getClass().getName(),42190);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2iogga0wjy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2wjmwjmlvha7hey.R.rethrow($CLV_t2$);}finally{__CLR4_5_2wjmwjmlvha7hey.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.MultiLineToStringStyleTest.testObject",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),42190,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2iogga0wjy(){try{__CLR4_5_2wjmwjmlvha7hey.R.inc(42190);
        __CLR4_5_2wjmwjmlvha7hey.R.inc(42191);final Integer i3 = Integer.valueOf(3);
        __CLR4_5_2wjmwjmlvha7hey.R.inc(42192);final Integer i4 = Integer.valueOf(4);
        __CLR4_5_2wjmwjmlvha7hey.R.inc(42193);assertEquals(baseStr + "[" + System.lineSeparator() + "  <null>" + System.lineSeparator() + "]", new ToStringBuilder(base).append((Object) null).toString());
        __CLR4_5_2wjmwjmlvha7hey.R.inc(42194);assertEquals(baseStr + "[" + System.lineSeparator() + "  3" + System.lineSeparator() + "]", new ToStringBuilder(base).append(i3).toString());
        __CLR4_5_2wjmwjmlvha7hey.R.inc(42195);assertEquals(baseStr + "[" + System.lineSeparator() + "  a=<null>" + System.lineSeparator() + "]", new ToStringBuilder(base).append("a", (Object) null).toString());
        __CLR4_5_2wjmwjmlvha7hey.R.inc(42196);assertEquals(baseStr + "[" + System.lineSeparator() + "  a=3" + System.lineSeparator() + "]", new ToStringBuilder(base).append("a", i3).toString());
        __CLR4_5_2wjmwjmlvha7hey.R.inc(42197);assertEquals(baseStr + "[" + System.lineSeparator() + "  a=3" + System.lineSeparator() + "  b=4" + System.lineSeparator() + "]", new ToStringBuilder(base).append("a", i3).append("b", i4).toString());
        __CLR4_5_2wjmwjmlvha7hey.R.inc(42198);assertEquals(baseStr + "[" + System.lineSeparator() + "  a=<Integer>" + System.lineSeparator() + "]", new ToStringBuilder(base).append("a", i3, false).toString());
        __CLR4_5_2wjmwjmlvha7hey.R.inc(42199);assertEquals(baseStr + "[" + System.lineSeparator() + "  a=<size=0>" + System.lineSeparator() + "]", new ToStringBuilder(base).append("a", new ArrayList<>(), false).toString());
        __CLR4_5_2wjmwjmlvha7hey.R.inc(42200);assertEquals(baseStr + "[" + System.lineSeparator() + "  a=[]" + System.lineSeparator() + "]", new ToStringBuilder(base).append("a", new ArrayList<>(), true).toString());
        __CLR4_5_2wjmwjmlvha7hey.R.inc(42201);assertEquals(baseStr + "[" + System.lineSeparator() + "  a=<size=0>" + System.lineSeparator() + "]", new ToStringBuilder(base).append("a", new HashMap<>(), false).toString());
        __CLR4_5_2wjmwjmlvha7hey.R.inc(42202);assertEquals(baseStr + "[" + System.lineSeparator() + "  a={}" + System.lineSeparator() + "]", new ToStringBuilder(base).append("a", new HashMap<>(), true).toString());
        __CLR4_5_2wjmwjmlvha7hey.R.inc(42203);assertEquals(baseStr + "[" + System.lineSeparator() + "  a=<size=0>" + System.lineSeparator() + "]", new ToStringBuilder(base).append("a", (Object) new String[0], false).toString());
        __CLR4_5_2wjmwjmlvha7hey.R.inc(42204);assertEquals(baseStr + "[" + System.lineSeparator() + "  a={}" + System.lineSeparator() + "]", new ToStringBuilder(base).append("a", (Object) new String[0], true).toString());
    }finally{__CLR4_5_2wjmwjmlvha7hey.R.flushNeeded();}}

    @Test
    public void testPerson() {__CLR4_5_2wjmwjmlvha7hey.R.globalSliceStart(getClass().getName(),42205);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2rmqmmqwkd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2wjmwjmlvha7hey.R.rethrow($CLV_t2$);}finally{__CLR4_5_2wjmwjmlvha7hey.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.MultiLineToStringStyleTest.testPerson",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),42205,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2rmqmmqwkd(){try{__CLR4_5_2wjmwjmlvha7hey.R.inc(42205);
        __CLR4_5_2wjmwjmlvha7hey.R.inc(42206);final Person p = new Person();
        __CLR4_5_2wjmwjmlvha7hey.R.inc(42207);p.name = "Jane Doe";
        __CLR4_5_2wjmwjmlvha7hey.R.inc(42208);p.age = 25;
        __CLR4_5_2wjmwjmlvha7hey.R.inc(42209);p.smoker = true;
        __CLR4_5_2wjmwjmlvha7hey.R.inc(42210);final String pBaseStr = p.getClass().getName() + "@" + Integer.toHexString(System.identityHashCode(p));
        __CLR4_5_2wjmwjmlvha7hey.R.inc(42211);assertEquals(pBaseStr + "[" + System.lineSeparator() + "  name=Jane Doe" + System.lineSeparator() + "  age=25" + System.lineSeparator() + "  smoker=true" + System.lineSeparator() + "]", new ToStringBuilder(p).append("name", p.name).append("age", p.age).append("smoker", p.smoker).toString());
    }finally{__CLR4_5_2wjmwjmlvha7hey.R.flushNeeded();}}

    @Test
    public void testLong() {__CLR4_5_2wjmwjmlvha7hey.R.globalSliceStart(getClass().getName(),42212);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2xsq9mzwkk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2wjmwjmlvha7hey.R.rethrow($CLV_t2$);}finally{__CLR4_5_2wjmwjmlvha7hey.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.MultiLineToStringStyleTest.testLong",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),42212,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2xsq9mzwkk(){try{__CLR4_5_2wjmwjmlvha7hey.R.inc(42212);
        __CLR4_5_2wjmwjmlvha7hey.R.inc(42213);assertEquals(baseStr + "[" + System.lineSeparator() + "  3" + System.lineSeparator() + "]", new ToStringBuilder(base).append(3L).toString());
        __CLR4_5_2wjmwjmlvha7hey.R.inc(42214);assertEquals(baseStr + "[" + System.lineSeparator() + "  a=3" + System.lineSeparator() + "]", new ToStringBuilder(base).append("a", 3L).toString());
        __CLR4_5_2wjmwjmlvha7hey.R.inc(42215);assertEquals(baseStr + "[" + System.lineSeparator() + "  a=3" + System.lineSeparator() + "  b=4" + System.lineSeparator() + "]", new ToStringBuilder(base).append("a", 3L).append("b", 4L).toString());
    }finally{__CLR4_5_2wjmwjmlvha7hey.R.flushNeeded();}}

    @Test
    public void testObjectArray() {__CLR4_5_2wjmwjmlvha7hey.R.globalSliceStart(getClass().getName(),42216);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2oi04a7wko();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2wjmwjmlvha7hey.R.rethrow($CLV_t2$);}finally{__CLR4_5_2wjmwjmlvha7hey.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.MultiLineToStringStyleTest.testObjectArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),42216,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2oi04a7wko(){try{__CLR4_5_2wjmwjmlvha7hey.R.inc(42216);
        __CLR4_5_2wjmwjmlvha7hey.R.inc(42217);Object[] array = new Object[] {null, base, new int[] {3, 6}};
        __CLR4_5_2wjmwjmlvha7hey.R.inc(42218);assertEquals(baseStr + "[" + System.lineSeparator() + "  {<null>,5,{3,6}}" + System.lineSeparator() + "]", new ToStringBuilder(base).append(array).toString());
        __CLR4_5_2wjmwjmlvha7hey.R.inc(42219);assertEquals(baseStr + "[" + System.lineSeparator() + "  {<null>,5,{3,6}}" + System.lineSeparator() + "]", new ToStringBuilder(base).append((Object) array).toString());
        __CLR4_5_2wjmwjmlvha7hey.R.inc(42220);array = null;
        __CLR4_5_2wjmwjmlvha7hey.R.inc(42221);assertEquals(baseStr + "[" + System.lineSeparator() + "  <null>" + System.lineSeparator() + "]", new ToStringBuilder(base).append(array).toString());
        __CLR4_5_2wjmwjmlvha7hey.R.inc(42222);assertEquals(baseStr + "[" + System.lineSeparator() + "  <null>" + System.lineSeparator() + "]", new ToStringBuilder(base).append((Object) array).toString());
    }finally{__CLR4_5_2wjmwjmlvha7hey.R.flushNeeded();}}

    @Test
    public void testLongArray() {__CLR4_5_2wjmwjmlvha7hey.R.globalSliceStart(getClass().getName(),42223);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2if58i6wkv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2wjmwjmlvha7hey.R.rethrow($CLV_t2$);}finally{__CLR4_5_2wjmwjmlvha7hey.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.MultiLineToStringStyleTest.testLongArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),42223,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2if58i6wkv(){try{__CLR4_5_2wjmwjmlvha7hey.R.inc(42223);
        __CLR4_5_2wjmwjmlvha7hey.R.inc(42224);long[] array = new long[] {1, 2, -3, 4};
        __CLR4_5_2wjmwjmlvha7hey.R.inc(42225);assertEquals(baseStr + "[" + System.lineSeparator() + "  {1,2,-3,4}" + System.lineSeparator() + "]", new ToStringBuilder(base).append(array).toString());
        __CLR4_5_2wjmwjmlvha7hey.R.inc(42226);assertEquals(baseStr + "[" + System.lineSeparator() + "  {1,2,-3,4}" + System.lineSeparator() + "]", new ToStringBuilder(base).append((Object) array).toString());
        __CLR4_5_2wjmwjmlvha7hey.R.inc(42227);array = null;
        __CLR4_5_2wjmwjmlvha7hey.R.inc(42228);assertEquals(baseStr + "[" + System.lineSeparator() + "  <null>" + System.lineSeparator() + "]", new ToStringBuilder(base).append(array).toString());
        __CLR4_5_2wjmwjmlvha7hey.R.inc(42229);assertEquals(baseStr + "[" + System.lineSeparator() + "  <null>" + System.lineSeparator() + "]", new ToStringBuilder(base).append((Object) array).toString());
    }finally{__CLR4_5_2wjmwjmlvha7hey.R.flushNeeded();}}

    @Test
    public void testLongArrayArray() {__CLR4_5_2wjmwjmlvha7hey.R.globalSliceStart(getClass().getName(),42230);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2xbpkglwl2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2wjmwjmlvha7hey.R.rethrow($CLV_t2$);}finally{__CLR4_5_2wjmwjmlvha7hey.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.MultiLineToStringStyleTest.testLongArrayArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),42230,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2xbpkglwl2(){try{__CLR4_5_2wjmwjmlvha7hey.R.inc(42230);
        __CLR4_5_2wjmwjmlvha7hey.R.inc(42231);long[][] array = new long[][] {{1, 2}, null, {5}};
        __CLR4_5_2wjmwjmlvha7hey.R.inc(42232);assertEquals(baseStr + "[" + System.lineSeparator() + "  {{1,2},<null>,{5}}" + System.lineSeparator() + "]", new ToStringBuilder(base).append(array).toString());
        __CLR4_5_2wjmwjmlvha7hey.R.inc(42233);assertEquals(baseStr + "[" + System.lineSeparator() + "  {{1,2},<null>,{5}}" + System.lineSeparator() + "]", new ToStringBuilder(base).append((Object) array).toString());
        __CLR4_5_2wjmwjmlvha7hey.R.inc(42234);array = null;
        __CLR4_5_2wjmwjmlvha7hey.R.inc(42235);assertEquals(baseStr + "[" + System.lineSeparator() + "  <null>" + System.lineSeparator() + "]", new ToStringBuilder(base).append(array).toString());
        __CLR4_5_2wjmwjmlvha7hey.R.inc(42236);assertEquals(baseStr + "[" + System.lineSeparator() + "  <null>" + System.lineSeparator() + "]", new ToStringBuilder(base).append((Object) array).toString());
    }finally{__CLR4_5_2wjmwjmlvha7hey.R.flushNeeded();}}

}
