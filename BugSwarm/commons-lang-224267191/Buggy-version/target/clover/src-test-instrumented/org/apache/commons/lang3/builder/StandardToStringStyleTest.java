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
 * Unit tests {@link org.apache.commons.lang3.builder.ToStringStyle}.
 */
public class StandardToStringStyleTest {static class __CLR4_5_2xrkxrklvha7hkb{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172763741L,8589935092L,43830,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private final Integer base = Integer.valueOf(5);
    private final String baseStr = "Integer";
    
    private static final StandardToStringStyle STYLE = new StandardToStringStyle();
    
    static {try{__CLR4_5_2xrkxrklvha7hkb.R.inc(43760);
        __CLR4_5_2xrkxrklvha7hkb.R.inc(43761);STYLE.setUseShortClassName(true);
        __CLR4_5_2xrkxrklvha7hkb.R.inc(43762);STYLE.setUseIdentityHashCode(false);
        __CLR4_5_2xrkxrklvha7hkb.R.inc(43763);STYLE.setArrayStart("[");
        __CLR4_5_2xrkxrklvha7hkb.R.inc(43764);STYLE.setArraySeparator(", ");
        __CLR4_5_2xrkxrklvha7hkb.R.inc(43765);STYLE.setArrayEnd("]");
        __CLR4_5_2xrkxrklvha7hkb.R.inc(43766);STYLE.setNullText("%NULL%");
        __CLR4_5_2xrkxrklvha7hkb.R.inc(43767);STYLE.setSizeStartText("%SIZE=");
        __CLR4_5_2xrkxrklvha7hkb.R.inc(43768);STYLE.setSizeEndText("%");
        __CLR4_5_2xrkxrklvha7hkb.R.inc(43769);STYLE.setSummaryObjectStartText("%");
        __CLR4_5_2xrkxrklvha7hkb.R.inc(43770);STYLE.setSummaryObjectEndText("%");
    }finally{__CLR4_5_2xrkxrklvha7hkb.R.flushNeeded();}}
    
    @Before
    public void setUp() throws Exception {try{__CLR4_5_2xrkxrklvha7hkb.R.inc(43771);
        __CLR4_5_2xrkxrklvha7hkb.R.inc(43772);ToStringBuilder.setDefaultStyle(STYLE);
    }finally{__CLR4_5_2xrkxrklvha7hkb.R.flushNeeded();}}

    @After
    public void tearDown() throws Exception {try{__CLR4_5_2xrkxrklvha7hkb.R.inc(43773);
        __CLR4_5_2xrkxrklvha7hkb.R.inc(43774);ToStringBuilder.setDefaultStyle(ToStringStyle.DEFAULT_STYLE);
    }finally{__CLR4_5_2xrkxrklvha7hkb.R.flushNeeded();}}

    //----------------------------------------------------------------
    
    @Test
    public void testBlank() {__CLR4_5_2xrkxrklvha7hkb.R.globalSliceStart(getClass().getName(),43775);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2s7z6qxxrz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2xrkxrklvha7hkb.R.rethrow($CLV_t2$);}finally{__CLR4_5_2xrkxrklvha7hkb.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.StandardToStringStyleTest.testBlank",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),43775,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2s7z6qxxrz(){try{__CLR4_5_2xrkxrklvha7hkb.R.inc(43775);
        __CLR4_5_2xrkxrklvha7hkb.R.inc(43776);assertEquals(baseStr + "[]", new ToStringBuilder(base).toString());
    }finally{__CLR4_5_2xrkxrklvha7hkb.R.flushNeeded();}}

    @Test
    public void testAppendSuper() {__CLR4_5_2xrkxrklvha7hkb.R.globalSliceStart(getClass().getName(),43777);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2cvyfiixs1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2xrkxrklvha7hkb.R.rethrow($CLV_t2$);}finally{__CLR4_5_2xrkxrklvha7hkb.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.StandardToStringStyleTest.testAppendSuper",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),43777,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2cvyfiixs1(){try{__CLR4_5_2xrkxrklvha7hkb.R.inc(43777);
        __CLR4_5_2xrkxrklvha7hkb.R.inc(43778);assertEquals(baseStr + "[]", new ToStringBuilder(base).appendSuper("Integer@8888[]").toString());
        __CLR4_5_2xrkxrklvha7hkb.R.inc(43779);assertEquals(baseStr + "[%NULL%]", new ToStringBuilder(base).appendSuper("Integer@8888[%NULL%]").toString());
        
        __CLR4_5_2xrkxrklvha7hkb.R.inc(43780);assertEquals(baseStr + "[a=hello]", new ToStringBuilder(base).appendSuper("Integer@8888[]").append("a", "hello").toString());
        __CLR4_5_2xrkxrklvha7hkb.R.inc(43781);assertEquals(baseStr + "[%NULL%,a=hello]", new ToStringBuilder(base).appendSuper("Integer@8888[%NULL%]").append("a", "hello").toString());
        __CLR4_5_2xrkxrklvha7hkb.R.inc(43782);assertEquals(baseStr + "[a=hello]", new ToStringBuilder(base).appendSuper(null).append("a", "hello").toString());
    }finally{__CLR4_5_2xrkxrklvha7hkb.R.flushNeeded();}}
    
    @Test
    public void testObject() {__CLR4_5_2xrkxrklvha7hkb.R.globalSliceStart(getClass().getName(),43783);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2iogga0xs7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2xrkxrklvha7hkb.R.rethrow($CLV_t2$);}finally{__CLR4_5_2xrkxrklvha7hkb.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.StandardToStringStyleTest.testObject",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),43783,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2iogga0xs7(){try{__CLR4_5_2xrkxrklvha7hkb.R.inc(43783);
        __CLR4_5_2xrkxrklvha7hkb.R.inc(43784);final Integer i3 = Integer.valueOf(3);
        __CLR4_5_2xrkxrklvha7hkb.R.inc(43785);final Integer i4 = Integer.valueOf(4);
        __CLR4_5_2xrkxrklvha7hkb.R.inc(43786);assertEquals(baseStr + "[%NULL%]", new ToStringBuilder(base).append((Object) null).toString());
        __CLR4_5_2xrkxrklvha7hkb.R.inc(43787);assertEquals(baseStr + "[3]", new ToStringBuilder(base).append(i3).toString());
        __CLR4_5_2xrkxrklvha7hkb.R.inc(43788);assertEquals(baseStr + "[a=%NULL%]", new ToStringBuilder(base).append("a", (Object) null).toString());
        __CLR4_5_2xrkxrklvha7hkb.R.inc(43789);assertEquals(baseStr + "[a=3]", new ToStringBuilder(base).append("a", i3).toString());
        __CLR4_5_2xrkxrklvha7hkb.R.inc(43790);assertEquals(baseStr + "[a=3,b=4]", new ToStringBuilder(base).append("a", i3).append("b", i4).toString());
        __CLR4_5_2xrkxrklvha7hkb.R.inc(43791);assertEquals(baseStr + "[a=%Integer%]", new ToStringBuilder(base).append("a", i3, false).toString());
        __CLR4_5_2xrkxrklvha7hkb.R.inc(43792);assertEquals(baseStr + "[a=%SIZE=0%]", new ToStringBuilder(base).append("a", new ArrayList<>(), false).toString());
        __CLR4_5_2xrkxrklvha7hkb.R.inc(43793);assertEquals(baseStr + "[a=[]]", new ToStringBuilder(base).append("a", new ArrayList<>(), true).toString());
        __CLR4_5_2xrkxrklvha7hkb.R.inc(43794);assertEquals(baseStr + "[a=%SIZE=0%]", new ToStringBuilder(base).append("a", new HashMap<>(), false).toString());
        __CLR4_5_2xrkxrklvha7hkb.R.inc(43795);assertEquals(baseStr + "[a={}]", new ToStringBuilder(base).append("a", new HashMap<>(), true).toString());
        __CLR4_5_2xrkxrklvha7hkb.R.inc(43796);assertEquals(baseStr + "[a=%SIZE=0%]", new ToStringBuilder(base).append("a", (Object) new String[0], false).toString());
        __CLR4_5_2xrkxrklvha7hkb.R.inc(43797);assertEquals(baseStr + "[a=[]]", new ToStringBuilder(base).append("a", (Object) new String[0], true).toString());
    }finally{__CLR4_5_2xrkxrklvha7hkb.R.flushNeeded();}}

    @Test
    public void testPerson() {__CLR4_5_2xrkxrklvha7hkb.R.globalSliceStart(getClass().getName(),43798);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2rmqmmqxsm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2xrkxrklvha7hkb.R.rethrow($CLV_t2$);}finally{__CLR4_5_2xrkxrklvha7hkb.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.StandardToStringStyleTest.testPerson",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),43798,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2rmqmmqxsm(){try{__CLR4_5_2xrkxrklvha7hkb.R.inc(43798);
        __CLR4_5_2xrkxrklvha7hkb.R.inc(43799);final Person p = new Person();
        __CLR4_5_2xrkxrklvha7hkb.R.inc(43800);p.name = "Suzy Queue";
        __CLR4_5_2xrkxrklvha7hkb.R.inc(43801);p.age = 19;
        __CLR4_5_2xrkxrklvha7hkb.R.inc(43802);p.smoker = false;
        __CLR4_5_2xrkxrklvha7hkb.R.inc(43803);final String pBaseStr = "ToStringStyleTest.Person";
        __CLR4_5_2xrkxrklvha7hkb.R.inc(43804);assertEquals(pBaseStr + "[name=Suzy Queue,age=19,smoker=false]", new ToStringBuilder(p).append("name", p.name).append("age", p.age).append("smoker", p.smoker).toString());
    }finally{__CLR4_5_2xrkxrklvha7hkb.R.flushNeeded();}}

    @Test
    public void testLong() {__CLR4_5_2xrkxrklvha7hkb.R.globalSliceStart(getClass().getName(),43805);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2xsq9mzxst();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2xrkxrklvha7hkb.R.rethrow($CLV_t2$);}finally{__CLR4_5_2xrkxrklvha7hkb.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.StandardToStringStyleTest.testLong",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),43805,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2xsq9mzxst(){try{__CLR4_5_2xrkxrklvha7hkb.R.inc(43805);
        __CLR4_5_2xrkxrklvha7hkb.R.inc(43806);assertEquals(baseStr + "[3]", new ToStringBuilder(base).append(3L).toString());
        __CLR4_5_2xrkxrklvha7hkb.R.inc(43807);assertEquals(baseStr + "[a=3]", new ToStringBuilder(base).append("a", 3L).toString());
        __CLR4_5_2xrkxrklvha7hkb.R.inc(43808);assertEquals(baseStr + "[a=3,b=4]", new ToStringBuilder(base).append("a", 3L).append("b", 4L).toString());
    }finally{__CLR4_5_2xrkxrklvha7hkb.R.flushNeeded();}}

    @Test
    public void testObjectArray() {__CLR4_5_2xrkxrklvha7hkb.R.globalSliceStart(getClass().getName(),43809);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2oi04a7xsx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2xrkxrklvha7hkb.R.rethrow($CLV_t2$);}finally{__CLR4_5_2xrkxrklvha7hkb.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.StandardToStringStyleTest.testObjectArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),43809,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2oi04a7xsx(){try{__CLR4_5_2xrkxrklvha7hkb.R.inc(43809);
        __CLR4_5_2xrkxrklvha7hkb.R.inc(43810);Object[] array = new Object[] {null, base, new int[] {3, 6}};
        __CLR4_5_2xrkxrklvha7hkb.R.inc(43811);assertEquals(baseStr + "[[%NULL%, 5, [3, 6]]]", new ToStringBuilder(base).append(array).toString());
        __CLR4_5_2xrkxrklvha7hkb.R.inc(43812);assertEquals(baseStr + "[[%NULL%, 5, [3, 6]]]", new ToStringBuilder(base).append((Object) array).toString());
        __CLR4_5_2xrkxrklvha7hkb.R.inc(43813);array = null;
        __CLR4_5_2xrkxrklvha7hkb.R.inc(43814);assertEquals(baseStr + "[%NULL%]", new ToStringBuilder(base).append(array).toString());
        __CLR4_5_2xrkxrklvha7hkb.R.inc(43815);assertEquals(baseStr + "[%NULL%]", new ToStringBuilder(base).append((Object) array).toString());
    }finally{__CLR4_5_2xrkxrklvha7hkb.R.flushNeeded();}}

    @Test
    public void testLongArray() {__CLR4_5_2xrkxrklvha7hkb.R.globalSliceStart(getClass().getName(),43816);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2if58i6xt4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2xrkxrklvha7hkb.R.rethrow($CLV_t2$);}finally{__CLR4_5_2xrkxrklvha7hkb.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.StandardToStringStyleTest.testLongArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),43816,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2if58i6xt4(){try{__CLR4_5_2xrkxrklvha7hkb.R.inc(43816);
        __CLR4_5_2xrkxrklvha7hkb.R.inc(43817);long[] array = new long[] {1, 2, -3, 4};
        __CLR4_5_2xrkxrklvha7hkb.R.inc(43818);assertEquals(baseStr + "[[1, 2, -3, 4]]", new ToStringBuilder(base).append(array).toString());
        __CLR4_5_2xrkxrklvha7hkb.R.inc(43819);assertEquals(baseStr + "[[1, 2, -3, 4]]", new ToStringBuilder(base).append((Object) array).toString());
        __CLR4_5_2xrkxrklvha7hkb.R.inc(43820);array = null;
        __CLR4_5_2xrkxrklvha7hkb.R.inc(43821);assertEquals(baseStr + "[%NULL%]", new ToStringBuilder(base).append(array).toString());
        __CLR4_5_2xrkxrklvha7hkb.R.inc(43822);assertEquals(baseStr + "[%NULL%]", new ToStringBuilder(base).append((Object) array).toString());
    }finally{__CLR4_5_2xrkxrklvha7hkb.R.flushNeeded();}}

    @Test
    public void testLongArrayArray() {__CLR4_5_2xrkxrklvha7hkb.R.globalSliceStart(getClass().getName(),43823);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2xbpkglxtb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2xrkxrklvha7hkb.R.rethrow($CLV_t2$);}finally{__CLR4_5_2xrkxrklvha7hkb.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.StandardToStringStyleTest.testLongArrayArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),43823,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2xbpkglxtb(){try{__CLR4_5_2xrkxrklvha7hkb.R.inc(43823);
        __CLR4_5_2xrkxrklvha7hkb.R.inc(43824);long[][] array = new long[][] {{1, 2}, null, {5}};
        __CLR4_5_2xrkxrklvha7hkb.R.inc(43825);assertEquals(baseStr + "[[[1, 2], %NULL%, [5]]]", new ToStringBuilder(base).append(array).toString());
        __CLR4_5_2xrkxrklvha7hkb.R.inc(43826);assertEquals(baseStr + "[[[1, 2], %NULL%, [5]]]", new ToStringBuilder(base).append((Object) array).toString());
        __CLR4_5_2xrkxrklvha7hkb.R.inc(43827);array = null;
        __CLR4_5_2xrkxrklvha7hkb.R.inc(43828);assertEquals(baseStr + "[%NULL%]", new ToStringBuilder(base).append(array).toString());
        __CLR4_5_2xrkxrklvha7hkb.R.inc(43829);assertEquals(baseStr + "[%NULL%]", new ToStringBuilder(base).append((Object) array).toString());
    }finally{__CLR4_5_2xrkxrklvha7hkb.R.flushNeeded();}}

}
