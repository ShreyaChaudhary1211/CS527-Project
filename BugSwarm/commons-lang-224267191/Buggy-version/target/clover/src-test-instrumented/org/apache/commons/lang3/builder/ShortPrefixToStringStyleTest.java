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
 * Unit tests {@link org.apache.commons.lang3.builder.ToStringStyle#SHORT_PREFIX_STYLE}.
 */
public class ShortPrefixToStringStyleTest {static class __CLR4_5_2xobxoblvha7hjs{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172763741L,8589935092L,43702,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private final Integer base = Integer.valueOf(5);
    private final String baseStr = "Integer";
    
    @Before
    public void setUp() throws Exception {try{__CLR4_5_2xobxoblvha7hjs.R.inc(43643);
        __CLR4_5_2xobxoblvha7hjs.R.inc(43644);ToStringBuilder.setDefaultStyle(ToStringStyle.SHORT_PREFIX_STYLE);
    }finally{__CLR4_5_2xobxoblvha7hjs.R.flushNeeded();}}

    @After
    public void tearDown() throws Exception {try{__CLR4_5_2xobxoblvha7hjs.R.inc(43645);
        __CLR4_5_2xobxoblvha7hjs.R.inc(43646);ToStringBuilder.setDefaultStyle(ToStringStyle.DEFAULT_STYLE);
    }finally{__CLR4_5_2xobxoblvha7hjs.R.flushNeeded();}}

    //----------------------------------------------------------------
    
    @Test
    public void testBlank() {__CLR4_5_2xobxoblvha7hjs.R.globalSliceStart(getClass().getName(),43647);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2s7z6qxxof();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2xobxoblvha7hjs.R.rethrow($CLV_t2$);}finally{__CLR4_5_2xobxoblvha7hjs.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ShortPrefixToStringStyleTest.testBlank",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),43647,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2s7z6qxxof(){try{__CLR4_5_2xobxoblvha7hjs.R.inc(43647);
        __CLR4_5_2xobxoblvha7hjs.R.inc(43648);assertEquals(baseStr + "[]", new ToStringBuilder(base).toString());
    }finally{__CLR4_5_2xobxoblvha7hjs.R.flushNeeded();}}

    @Test
    public void testAppendSuper() {__CLR4_5_2xobxoblvha7hjs.R.globalSliceStart(getClass().getName(),43649);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2cvyfiixoh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2xobxoblvha7hjs.R.rethrow($CLV_t2$);}finally{__CLR4_5_2xobxoblvha7hjs.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ShortPrefixToStringStyleTest.testAppendSuper",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),43649,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2cvyfiixoh(){try{__CLR4_5_2xobxoblvha7hjs.R.inc(43649);
        __CLR4_5_2xobxoblvha7hjs.R.inc(43650);assertEquals(baseStr + "[]", new ToStringBuilder(base).appendSuper("Integer@8888[]").toString());
        __CLR4_5_2xobxoblvha7hjs.R.inc(43651);assertEquals(baseStr + "[<null>]", new ToStringBuilder(base).appendSuper("Integer@8888[<null>]").toString());
        
        __CLR4_5_2xobxoblvha7hjs.R.inc(43652);assertEquals(baseStr + "[a=hello]", new ToStringBuilder(base).appendSuper("Integer@8888[]").append("a", "hello").toString());
        __CLR4_5_2xobxoblvha7hjs.R.inc(43653);assertEquals(baseStr + "[<null>,a=hello]", new ToStringBuilder(base).appendSuper("Integer@8888[<null>]").append("a", "hello").toString());
        __CLR4_5_2xobxoblvha7hjs.R.inc(43654);assertEquals(baseStr + "[a=hello]", new ToStringBuilder(base).appendSuper(null).append("a", "hello").toString());
    }finally{__CLR4_5_2xobxoblvha7hjs.R.flushNeeded();}}
    
    @Test
    public void testObject() {__CLR4_5_2xobxoblvha7hjs.R.globalSliceStart(getClass().getName(),43655);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2iogga0xon();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2xobxoblvha7hjs.R.rethrow($CLV_t2$);}finally{__CLR4_5_2xobxoblvha7hjs.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ShortPrefixToStringStyleTest.testObject",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),43655,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2iogga0xon(){try{__CLR4_5_2xobxoblvha7hjs.R.inc(43655);
        __CLR4_5_2xobxoblvha7hjs.R.inc(43656);final Integer i3 = Integer.valueOf(3);
        __CLR4_5_2xobxoblvha7hjs.R.inc(43657);final Integer i4 = Integer.valueOf(4);
        __CLR4_5_2xobxoblvha7hjs.R.inc(43658);assertEquals(baseStr + "[<null>]", new ToStringBuilder(base).append((Object) null).toString());
        __CLR4_5_2xobxoblvha7hjs.R.inc(43659);assertEquals(baseStr + "[3]", new ToStringBuilder(base).append(i3).toString());
        __CLR4_5_2xobxoblvha7hjs.R.inc(43660);assertEquals(baseStr + "[a=<null>]", new ToStringBuilder(base).append("a", (Object) null).toString());
        __CLR4_5_2xobxoblvha7hjs.R.inc(43661);assertEquals(baseStr + "[a=3]", new ToStringBuilder(base).append("a", i3).toString());
        __CLR4_5_2xobxoblvha7hjs.R.inc(43662);assertEquals(baseStr + "[a=3,b=4]", new ToStringBuilder(base).append("a", i3).append("b", i4).toString());
        __CLR4_5_2xobxoblvha7hjs.R.inc(43663);assertEquals(baseStr + "[a=<Integer>]", new ToStringBuilder(base).append("a", i3, false).toString());
        __CLR4_5_2xobxoblvha7hjs.R.inc(43664);assertEquals(baseStr + "[a=<size=0>]", new ToStringBuilder(base).append("a", new ArrayList<>(), false).toString());
        __CLR4_5_2xobxoblvha7hjs.R.inc(43665);assertEquals(baseStr + "[a=[]]", new ToStringBuilder(base).append("a", new ArrayList<>(), true).toString());
        __CLR4_5_2xobxoblvha7hjs.R.inc(43666);assertEquals(baseStr + "[a=<size=0>]", new ToStringBuilder(base).append("a", new HashMap<>(), false).toString());
        __CLR4_5_2xobxoblvha7hjs.R.inc(43667);assertEquals(baseStr + "[a={}]", new ToStringBuilder(base).append("a", new HashMap<>(), true).toString());
        __CLR4_5_2xobxoblvha7hjs.R.inc(43668);assertEquals(baseStr + "[a=<size=0>]", new ToStringBuilder(base).append("a", (Object) new String[0], false).toString());
        __CLR4_5_2xobxoblvha7hjs.R.inc(43669);assertEquals(baseStr + "[a={}]", new ToStringBuilder(base).append("a", (Object) new String[0], true).toString());
    }finally{__CLR4_5_2xobxoblvha7hjs.R.flushNeeded();}}

    @Test
    public void testPerson() {__CLR4_5_2xobxoblvha7hjs.R.globalSliceStart(getClass().getName(),43670);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2rmqmmqxp2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2xobxoblvha7hjs.R.rethrow($CLV_t2$);}finally{__CLR4_5_2xobxoblvha7hjs.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ShortPrefixToStringStyleTest.testPerson",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),43670,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2rmqmmqxp2(){try{__CLR4_5_2xobxoblvha7hjs.R.inc(43670);
        __CLR4_5_2xobxoblvha7hjs.R.inc(43671);final Person p = new Person();
        __CLR4_5_2xobxoblvha7hjs.R.inc(43672);p.name = "John Q. Public";
        __CLR4_5_2xobxoblvha7hjs.R.inc(43673);p.age = 45;
        __CLR4_5_2xobxoblvha7hjs.R.inc(43674);p.smoker = true;
        __CLR4_5_2xobxoblvha7hjs.R.inc(43675);final String pBaseStr = "ToStringStyleTest.Person";
        __CLR4_5_2xobxoblvha7hjs.R.inc(43676);assertEquals(pBaseStr + "[name=John Q. Public,age=45,smoker=true]", new ToStringBuilder(p).append("name", p.name).append("age", p.age).append("smoker", p.smoker).toString());
    }finally{__CLR4_5_2xobxoblvha7hjs.R.flushNeeded();}}

    @Test
    public void testLong() {__CLR4_5_2xobxoblvha7hjs.R.globalSliceStart(getClass().getName(),43677);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2xsq9mzxp9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2xobxoblvha7hjs.R.rethrow($CLV_t2$);}finally{__CLR4_5_2xobxoblvha7hjs.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ShortPrefixToStringStyleTest.testLong",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),43677,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2xsq9mzxp9(){try{__CLR4_5_2xobxoblvha7hjs.R.inc(43677);
        __CLR4_5_2xobxoblvha7hjs.R.inc(43678);assertEquals(baseStr + "[3]", new ToStringBuilder(base).append(3L).toString());
        __CLR4_5_2xobxoblvha7hjs.R.inc(43679);assertEquals(baseStr + "[a=3]", new ToStringBuilder(base).append("a", 3L).toString());
        __CLR4_5_2xobxoblvha7hjs.R.inc(43680);assertEquals(baseStr + "[a=3,b=4]", new ToStringBuilder(base).append("a", 3L).append("b", 4L).toString());
    }finally{__CLR4_5_2xobxoblvha7hjs.R.flushNeeded();}}

    @Test
    public void testObjectArray() {__CLR4_5_2xobxoblvha7hjs.R.globalSliceStart(getClass().getName(),43681);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2oi04a7xpd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2xobxoblvha7hjs.R.rethrow($CLV_t2$);}finally{__CLR4_5_2xobxoblvha7hjs.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ShortPrefixToStringStyleTest.testObjectArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),43681,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2oi04a7xpd(){try{__CLR4_5_2xobxoblvha7hjs.R.inc(43681);
        __CLR4_5_2xobxoblvha7hjs.R.inc(43682);Object[] array = new Object[] {null, base, new int[] {3, 6}};
        __CLR4_5_2xobxoblvha7hjs.R.inc(43683);assertEquals(baseStr + "[{<null>,5,{3,6}}]", new ToStringBuilder(base).append(array).toString());
        __CLR4_5_2xobxoblvha7hjs.R.inc(43684);assertEquals(baseStr + "[{<null>,5,{3,6}}]", new ToStringBuilder(base).append((Object) array).toString());
        __CLR4_5_2xobxoblvha7hjs.R.inc(43685);array = null;
        __CLR4_5_2xobxoblvha7hjs.R.inc(43686);assertEquals(baseStr + "[<null>]", new ToStringBuilder(base).append(array).toString());
        __CLR4_5_2xobxoblvha7hjs.R.inc(43687);assertEquals(baseStr + "[<null>]", new ToStringBuilder(base).append((Object) array).toString());
    }finally{__CLR4_5_2xobxoblvha7hjs.R.flushNeeded();}}

    @Test
    public void testLongArray() {__CLR4_5_2xobxoblvha7hjs.R.globalSliceStart(getClass().getName(),43688);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2if58i6xpk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2xobxoblvha7hjs.R.rethrow($CLV_t2$);}finally{__CLR4_5_2xobxoblvha7hjs.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ShortPrefixToStringStyleTest.testLongArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),43688,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2if58i6xpk(){try{__CLR4_5_2xobxoblvha7hjs.R.inc(43688);
        __CLR4_5_2xobxoblvha7hjs.R.inc(43689);long[] array = new long[] {1, 2, -3, 4};
        __CLR4_5_2xobxoblvha7hjs.R.inc(43690);assertEquals(baseStr + "[{1,2,-3,4}]", new ToStringBuilder(base).append(array).toString());
        __CLR4_5_2xobxoblvha7hjs.R.inc(43691);assertEquals(baseStr + "[{1,2,-3,4}]", new ToStringBuilder(base).append((Object) array).toString());
        __CLR4_5_2xobxoblvha7hjs.R.inc(43692);array = null;
        __CLR4_5_2xobxoblvha7hjs.R.inc(43693);assertEquals(baseStr + "[<null>]", new ToStringBuilder(base).append(array).toString());
        __CLR4_5_2xobxoblvha7hjs.R.inc(43694);assertEquals(baseStr + "[<null>]", new ToStringBuilder(base).append((Object) array).toString());
    }finally{__CLR4_5_2xobxoblvha7hjs.R.flushNeeded();}}

    @Test
    public void testLongArrayArray() {__CLR4_5_2xobxoblvha7hjs.R.globalSliceStart(getClass().getName(),43695);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2xbpkglxpr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2xobxoblvha7hjs.R.rethrow($CLV_t2$);}finally{__CLR4_5_2xobxoblvha7hjs.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ShortPrefixToStringStyleTest.testLongArrayArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),43695,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2xbpkglxpr(){try{__CLR4_5_2xobxoblvha7hjs.R.inc(43695);
        __CLR4_5_2xobxoblvha7hjs.R.inc(43696);long[][] array = new long[][] {{1, 2}, null, {5}};
        __CLR4_5_2xobxoblvha7hjs.R.inc(43697);assertEquals(baseStr + "[{{1,2},<null>,{5}}]", new ToStringBuilder(base).append(array).toString());
        __CLR4_5_2xobxoblvha7hjs.R.inc(43698);assertEquals(baseStr + "[{{1,2},<null>,{5}}]", new ToStringBuilder(base).append((Object) array).toString());
        __CLR4_5_2xobxoblvha7hjs.R.inc(43699);array = null;
        __CLR4_5_2xobxoblvha7hjs.R.inc(43700);assertEquals(baseStr + "[<null>]", new ToStringBuilder(base).append(array).toString());
        __CLR4_5_2xobxoblvha7hjs.R.inc(43701);assertEquals(baseStr + "[<null>]", new ToStringBuilder(base).append((Object) array).toString());
    }finally{__CLR4_5_2xobxoblvha7hjs.R.flushNeeded();}}
    
}
