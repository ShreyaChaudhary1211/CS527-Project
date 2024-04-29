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
 * Unit tests {@link org.apache.commons.lang3.builder.SimpleToStringStyleTest}.
 */
public class SimpleToStringStyleTest {static class __CLR4_5_2xpyxpylvha7hk0{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172763741L,8589935092L,43760,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private final Integer base = Integer.valueOf(5);
    
    @Before
    public void setUp() throws Exception {try{__CLR4_5_2xpyxpylvha7hk0.R.inc(43702);
        __CLR4_5_2xpyxpylvha7hk0.R.inc(43703);ToStringBuilder.setDefaultStyle(ToStringStyle.SIMPLE_STYLE);
    }finally{__CLR4_5_2xpyxpylvha7hk0.R.flushNeeded();}}

    @After
    public void tearDown() throws Exception {try{__CLR4_5_2xpyxpylvha7hk0.R.inc(43704);
        __CLR4_5_2xpyxpylvha7hk0.R.inc(43705);ToStringBuilder.setDefaultStyle(ToStringStyle.DEFAULT_STYLE);
    }finally{__CLR4_5_2xpyxpylvha7hk0.R.flushNeeded();}}

    //----------------------------------------------------------------
    
    @Test
    public void testBlank() {__CLR4_5_2xpyxpylvha7hk0.R.globalSliceStart(getClass().getName(),43706);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2s7z6qxxq2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2xpyxpylvha7hk0.R.rethrow($CLV_t2$);}finally{__CLR4_5_2xpyxpylvha7hk0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.SimpleToStringStyleTest.testBlank",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),43706,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2s7z6qxxq2(){try{__CLR4_5_2xpyxpylvha7hk0.R.inc(43706);
        __CLR4_5_2xpyxpylvha7hk0.R.inc(43707);assertEquals("", new ToStringBuilder(base).toString());
    }finally{__CLR4_5_2xpyxpylvha7hk0.R.flushNeeded();}}

    @Test
    public void testAppendSuper() {__CLR4_5_2xpyxpylvha7hk0.R.globalSliceStart(getClass().getName(),43708);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2cvyfiixq4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2xpyxpylvha7hk0.R.rethrow($CLV_t2$);}finally{__CLR4_5_2xpyxpylvha7hk0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.SimpleToStringStyleTest.testAppendSuper",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),43708,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2cvyfiixq4(){try{__CLR4_5_2xpyxpylvha7hk0.R.inc(43708);
        __CLR4_5_2xpyxpylvha7hk0.R.inc(43709);assertEquals("", new ToStringBuilder(base).appendSuper("").toString());
        __CLR4_5_2xpyxpylvha7hk0.R.inc(43710);assertEquals("<null>", new ToStringBuilder(base).appendSuper("<null>").toString());
        
        __CLR4_5_2xpyxpylvha7hk0.R.inc(43711);assertEquals("hello", new ToStringBuilder(base).appendSuper("").append("a", "hello").toString());
        __CLR4_5_2xpyxpylvha7hk0.R.inc(43712);assertEquals("<null>,hello", new ToStringBuilder(base).appendSuper("<null>").append("a", "hello").toString());
        __CLR4_5_2xpyxpylvha7hk0.R.inc(43713);assertEquals("hello", new ToStringBuilder(base).appendSuper(null).append("a", "hello").toString());
    }finally{__CLR4_5_2xpyxpylvha7hk0.R.flushNeeded();}}
    
    @Test
    public void testObject() {__CLR4_5_2xpyxpylvha7hk0.R.globalSliceStart(getClass().getName(),43714);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2iogga0xqa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2xpyxpylvha7hk0.R.rethrow($CLV_t2$);}finally{__CLR4_5_2xpyxpylvha7hk0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.SimpleToStringStyleTest.testObject",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),43714,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2iogga0xqa(){try{__CLR4_5_2xpyxpylvha7hk0.R.inc(43714);
        __CLR4_5_2xpyxpylvha7hk0.R.inc(43715);final Integer i3 = Integer.valueOf(3);
        __CLR4_5_2xpyxpylvha7hk0.R.inc(43716);final Integer i4 = Integer.valueOf(4);
        __CLR4_5_2xpyxpylvha7hk0.R.inc(43717);assertEquals("<null>", new ToStringBuilder(base).append((Object) null).toString());
        __CLR4_5_2xpyxpylvha7hk0.R.inc(43718);assertEquals("3", new ToStringBuilder(base).append(i3).toString());
        __CLR4_5_2xpyxpylvha7hk0.R.inc(43719);assertEquals("<null>", new ToStringBuilder(base).append("a", (Object) null).toString());
        __CLR4_5_2xpyxpylvha7hk0.R.inc(43720);assertEquals("3", new ToStringBuilder(base).append("a", i3).toString());
        __CLR4_5_2xpyxpylvha7hk0.R.inc(43721);assertEquals("3,4", new ToStringBuilder(base).append("a", i3).append("b", i4).toString());
        __CLR4_5_2xpyxpylvha7hk0.R.inc(43722);assertEquals("<Integer>", new ToStringBuilder(base).append("a", i3, false).toString());
        __CLR4_5_2xpyxpylvha7hk0.R.inc(43723);assertEquals("<size=0>", new ToStringBuilder(base).append("a", new ArrayList<>(), false).toString());
        __CLR4_5_2xpyxpylvha7hk0.R.inc(43724);assertEquals("[]", new ToStringBuilder(base).append("a", new ArrayList<>(), true).toString());
        __CLR4_5_2xpyxpylvha7hk0.R.inc(43725);assertEquals("<size=0>", new ToStringBuilder(base).append("a", new HashMap<>(), false).toString());
        __CLR4_5_2xpyxpylvha7hk0.R.inc(43726);assertEquals("{}", new ToStringBuilder(base).append("a", new HashMap<>(), true).toString());
        __CLR4_5_2xpyxpylvha7hk0.R.inc(43727);assertEquals("<size=0>", new ToStringBuilder(base).append("a", (Object) new String[0], false).toString());
        __CLR4_5_2xpyxpylvha7hk0.R.inc(43728);assertEquals("{}", new ToStringBuilder(base).append("a", (Object) new String[0], true).toString());
    }finally{__CLR4_5_2xpyxpylvha7hk0.R.flushNeeded();}}

    @Test
    public void testPerson() {__CLR4_5_2xpyxpylvha7hk0.R.globalSliceStart(getClass().getName(),43729);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2rmqmmqxqp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2xpyxpylvha7hk0.R.rethrow($CLV_t2$);}finally{__CLR4_5_2xpyxpylvha7hk0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.SimpleToStringStyleTest.testPerson",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),43729,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2rmqmmqxqp(){try{__CLR4_5_2xpyxpylvha7hk0.R.inc(43729);
        __CLR4_5_2xpyxpylvha7hk0.R.inc(43730);final Person p = new Person();
        __CLR4_5_2xpyxpylvha7hk0.R.inc(43731);p.name = "Jane Q. Public";
        __CLR4_5_2xpyxpylvha7hk0.R.inc(43732);p.age = 47;
        __CLR4_5_2xpyxpylvha7hk0.R.inc(43733);p.smoker = false;
        __CLR4_5_2xpyxpylvha7hk0.R.inc(43734);assertEquals("Jane Q. Public,47,false", new ToStringBuilder(p).append("name", p.name).append("age", p.age).append("smoker", p.smoker).toString());
    }finally{__CLR4_5_2xpyxpylvha7hk0.R.flushNeeded();}}

    @Test
    public void testLong() {__CLR4_5_2xpyxpylvha7hk0.R.globalSliceStart(getClass().getName(),43735);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2xsq9mzxqv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2xpyxpylvha7hk0.R.rethrow($CLV_t2$);}finally{__CLR4_5_2xpyxpylvha7hk0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.SimpleToStringStyleTest.testLong",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),43735,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2xsq9mzxqv(){try{__CLR4_5_2xpyxpylvha7hk0.R.inc(43735);
        __CLR4_5_2xpyxpylvha7hk0.R.inc(43736);assertEquals("3", new ToStringBuilder(base).append(3L).toString());
        __CLR4_5_2xpyxpylvha7hk0.R.inc(43737);assertEquals("3", new ToStringBuilder(base).append("a", 3L).toString());
        __CLR4_5_2xpyxpylvha7hk0.R.inc(43738);assertEquals("3,4", new ToStringBuilder(base).append("a", 3L).append("b", 4L).toString());
    }finally{__CLR4_5_2xpyxpylvha7hk0.R.flushNeeded();}}

    @Test
    public void testObjectArray() {__CLR4_5_2xpyxpylvha7hk0.R.globalSliceStart(getClass().getName(),43739);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2oi04a7xqz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2xpyxpylvha7hk0.R.rethrow($CLV_t2$);}finally{__CLR4_5_2xpyxpylvha7hk0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.SimpleToStringStyleTest.testObjectArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),43739,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2oi04a7xqz(){try{__CLR4_5_2xpyxpylvha7hk0.R.inc(43739);
        __CLR4_5_2xpyxpylvha7hk0.R.inc(43740);Object[] array = new Object[] {null, base, new int[] {3, 6}};
        __CLR4_5_2xpyxpylvha7hk0.R.inc(43741);assertEquals("{<null>,5,{3,6}}", new ToStringBuilder(base).append(array).toString());
        __CLR4_5_2xpyxpylvha7hk0.R.inc(43742);assertEquals("{<null>,5,{3,6}}", new ToStringBuilder(base).append((Object) array).toString());
        __CLR4_5_2xpyxpylvha7hk0.R.inc(43743);array = null;
        __CLR4_5_2xpyxpylvha7hk0.R.inc(43744);assertEquals("<null>", new ToStringBuilder(base).append(array).toString());
        __CLR4_5_2xpyxpylvha7hk0.R.inc(43745);assertEquals("<null>", new ToStringBuilder(base).append((Object) array).toString());
    }finally{__CLR4_5_2xpyxpylvha7hk0.R.flushNeeded();}}

    @Test
    public void testLongArray() {__CLR4_5_2xpyxpylvha7hk0.R.globalSliceStart(getClass().getName(),43746);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2if58i6xr6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2xpyxpylvha7hk0.R.rethrow($CLV_t2$);}finally{__CLR4_5_2xpyxpylvha7hk0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.SimpleToStringStyleTest.testLongArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),43746,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2if58i6xr6(){try{__CLR4_5_2xpyxpylvha7hk0.R.inc(43746);
        __CLR4_5_2xpyxpylvha7hk0.R.inc(43747);long[] array = new long[] {1, 2, -3, 4};
        __CLR4_5_2xpyxpylvha7hk0.R.inc(43748);assertEquals("{1,2,-3,4}", new ToStringBuilder(base).append(array).toString());
        __CLR4_5_2xpyxpylvha7hk0.R.inc(43749);assertEquals("{1,2,-3,4}", new ToStringBuilder(base).append((Object) array).toString());
        __CLR4_5_2xpyxpylvha7hk0.R.inc(43750);array = null;
        __CLR4_5_2xpyxpylvha7hk0.R.inc(43751);assertEquals("<null>", new ToStringBuilder(base).append(array).toString());
        __CLR4_5_2xpyxpylvha7hk0.R.inc(43752);assertEquals("<null>", new ToStringBuilder(base).append((Object) array).toString());
    }finally{__CLR4_5_2xpyxpylvha7hk0.R.flushNeeded();}}

    @Test
    public void testLongArrayArray() {__CLR4_5_2xpyxpylvha7hk0.R.globalSliceStart(getClass().getName(),43753);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2xbpkglxrd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2xpyxpylvha7hk0.R.rethrow($CLV_t2$);}finally{__CLR4_5_2xpyxpylvha7hk0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.SimpleToStringStyleTest.testLongArrayArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),43753,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2xbpkglxrd(){try{__CLR4_5_2xpyxpylvha7hk0.R.inc(43753);
        __CLR4_5_2xpyxpylvha7hk0.R.inc(43754);long[][] array = new long[][] {{1, 2}, null, {5}};
        __CLR4_5_2xpyxpylvha7hk0.R.inc(43755);assertEquals("{{1,2},<null>,{5}}", new ToStringBuilder(base).append(array).toString());
        __CLR4_5_2xpyxpylvha7hk0.R.inc(43756);assertEquals("{{1,2},<null>,{5}}", new ToStringBuilder(base).append((Object) array).toString());
        __CLR4_5_2xpyxpylvha7hk0.R.inc(43757);array = null;
        __CLR4_5_2xpyxpylvha7hk0.R.inc(43758);assertEquals("<null>", new ToStringBuilder(base).append(array).toString());
        __CLR4_5_2xpyxpylvha7hk0.R.inc(43759);assertEquals("<null>", new ToStringBuilder(base).append((Object) array).toString());
    }finally{__CLR4_5_2xpyxpylvha7hk0.R.flushNeeded();}}

}
