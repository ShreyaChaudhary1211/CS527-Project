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
 * Unit tests {@link org.apache.commons.lang3.builder.NoFieldNamesToStringStyleTest}.
 */
public class NoFieldNamesToStringStyleTest {static class __CLR4_5_2worworlvha7hg1{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172763741L,8589935092L,42422,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private final Integer base = Integer.valueOf(5);
    private final String baseStr = base.getClass().getName() + "@" + Integer.toHexString(System.identityHashCode(base));
    
    @Before
    public void setUp() throws Exception {try{__CLR4_5_2worworlvha7hg1.R.inc(42363);
        __CLR4_5_2worworlvha7hg1.R.inc(42364);ToStringBuilder.setDefaultStyle(ToStringStyle.NO_FIELD_NAMES_STYLE);
    }finally{__CLR4_5_2worworlvha7hg1.R.flushNeeded();}}

    @After
    public void tearDown() throws Exception {try{__CLR4_5_2worworlvha7hg1.R.inc(42365);
        __CLR4_5_2worworlvha7hg1.R.inc(42366);ToStringBuilder.setDefaultStyle(ToStringStyle.DEFAULT_STYLE);
    }finally{__CLR4_5_2worworlvha7hg1.R.flushNeeded();}}

    //----------------------------------------------------------------
    
    @Test
    public void testBlank() {__CLR4_5_2worworlvha7hg1.R.globalSliceStart(getClass().getName(),42367);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2s7z6qxwov();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2worworlvha7hg1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2worworlvha7hg1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.NoFieldNamesToStringStyleTest.testBlank",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),42367,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2s7z6qxwov(){try{__CLR4_5_2worworlvha7hg1.R.inc(42367);
        __CLR4_5_2worworlvha7hg1.R.inc(42368);assertEquals(baseStr + "[]", new ToStringBuilder(base).toString());
    }finally{__CLR4_5_2worworlvha7hg1.R.flushNeeded();}}

    @Test
    public void testAppendSuper() {__CLR4_5_2worworlvha7hg1.R.globalSliceStart(getClass().getName(),42369);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2cvyfiiwox();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2worworlvha7hg1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2worworlvha7hg1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.NoFieldNamesToStringStyleTest.testAppendSuper",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),42369,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2cvyfiiwox(){try{__CLR4_5_2worworlvha7hg1.R.inc(42369);
        __CLR4_5_2worworlvha7hg1.R.inc(42370);assertEquals(baseStr + "[]", new ToStringBuilder(base).appendSuper("Integer@8888[]").toString());
        __CLR4_5_2worworlvha7hg1.R.inc(42371);assertEquals(baseStr + "[<null>]", new ToStringBuilder(base).appendSuper("Integer@8888[<null>]").toString());
        
        __CLR4_5_2worworlvha7hg1.R.inc(42372);assertEquals(baseStr + "[hello]", new ToStringBuilder(base).appendSuper("Integer@8888[]").append("a", "hello").toString());
        __CLR4_5_2worworlvha7hg1.R.inc(42373);assertEquals(baseStr + "[<null>,hello]", new ToStringBuilder(base).appendSuper("Integer@8888[<null>]").append("a", "hello").toString());
        __CLR4_5_2worworlvha7hg1.R.inc(42374);assertEquals(baseStr + "[hello]", new ToStringBuilder(base).appendSuper(null).append("a", "hello").toString());
    }finally{__CLR4_5_2worworlvha7hg1.R.flushNeeded();}}
    
    @Test
    public void testObject() {__CLR4_5_2worworlvha7hg1.R.globalSliceStart(getClass().getName(),42375);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2iogga0wp3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2worworlvha7hg1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2worworlvha7hg1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.NoFieldNamesToStringStyleTest.testObject",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),42375,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2iogga0wp3(){try{__CLR4_5_2worworlvha7hg1.R.inc(42375);
        __CLR4_5_2worworlvha7hg1.R.inc(42376);final Integer i3 = Integer.valueOf(3);
        __CLR4_5_2worworlvha7hg1.R.inc(42377);final Integer i4 = Integer.valueOf(4);
        __CLR4_5_2worworlvha7hg1.R.inc(42378);assertEquals(baseStr + "[<null>]", new ToStringBuilder(base).append((Object) null).toString());
        __CLR4_5_2worworlvha7hg1.R.inc(42379);assertEquals(baseStr + "[3]", new ToStringBuilder(base).append(i3).toString());
        __CLR4_5_2worworlvha7hg1.R.inc(42380);assertEquals(baseStr + "[<null>]", new ToStringBuilder(base).append("a", (Object) null).toString());
        __CLR4_5_2worworlvha7hg1.R.inc(42381);assertEquals(baseStr + "[3]", new ToStringBuilder(base).append("a", i3).toString());
        __CLR4_5_2worworlvha7hg1.R.inc(42382);assertEquals(baseStr + "[3,4]", new ToStringBuilder(base).append("a", i3).append("b", i4).toString());
        __CLR4_5_2worworlvha7hg1.R.inc(42383);assertEquals(baseStr + "[<Integer>]", new ToStringBuilder(base).append("a", i3, false).toString());
        __CLR4_5_2worworlvha7hg1.R.inc(42384);assertEquals(baseStr + "[<size=0>]", new ToStringBuilder(base).append("a", new ArrayList<>(), false).toString());
        __CLR4_5_2worworlvha7hg1.R.inc(42385);assertEquals(baseStr + "[[]]", new ToStringBuilder(base).append("a", new ArrayList<>(), true).toString());
        __CLR4_5_2worworlvha7hg1.R.inc(42386);assertEquals(baseStr + "[<size=0>]", new ToStringBuilder(base).append("a", new HashMap<>(), false).toString());
        __CLR4_5_2worworlvha7hg1.R.inc(42387);assertEquals(baseStr + "[{}]", new ToStringBuilder(base).append("a", new HashMap<>(), true).toString());
        __CLR4_5_2worworlvha7hg1.R.inc(42388);assertEquals(baseStr + "[<size=0>]", new ToStringBuilder(base).append("a", (Object) new String[0], false).toString());
        __CLR4_5_2worworlvha7hg1.R.inc(42389);assertEquals(baseStr + "[{}]", new ToStringBuilder(base).append("a", (Object) new String[0], true).toString());
    }finally{__CLR4_5_2worworlvha7hg1.R.flushNeeded();}}

    @Test
    public void testPerson() {__CLR4_5_2worworlvha7hg1.R.globalSliceStart(getClass().getName(),42390);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2rmqmmqwpi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2worworlvha7hg1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2worworlvha7hg1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.NoFieldNamesToStringStyleTest.testPerson",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),42390,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2rmqmmqwpi(){try{__CLR4_5_2worworlvha7hg1.R.inc(42390);
        __CLR4_5_2worworlvha7hg1.R.inc(42391);final Person p = new Person();
        __CLR4_5_2worworlvha7hg1.R.inc(42392);p.name = "Ron Paul";
        __CLR4_5_2worworlvha7hg1.R.inc(42393);p.age = 72;
        __CLR4_5_2worworlvha7hg1.R.inc(42394);p.smoker = false;
        __CLR4_5_2worworlvha7hg1.R.inc(42395);final String pBaseStr = p.getClass().getName() + "@" + Integer.toHexString(System.identityHashCode(p));
        __CLR4_5_2worworlvha7hg1.R.inc(42396);assertEquals(pBaseStr + "[Ron Paul,72,false]", new ToStringBuilder(p).append("name", p.name).append("age", p.age).append("smoker", p.smoker).toString());
    }finally{__CLR4_5_2worworlvha7hg1.R.flushNeeded();}}

    @Test
    public void testLong() {__CLR4_5_2worworlvha7hg1.R.globalSliceStart(getClass().getName(),42397);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2xsq9mzwpp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2worworlvha7hg1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2worworlvha7hg1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.NoFieldNamesToStringStyleTest.testLong",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),42397,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2xsq9mzwpp(){try{__CLR4_5_2worworlvha7hg1.R.inc(42397);
        __CLR4_5_2worworlvha7hg1.R.inc(42398);assertEquals(baseStr + "[3]", new ToStringBuilder(base).append(3L).toString());
        __CLR4_5_2worworlvha7hg1.R.inc(42399);assertEquals(baseStr + "[3]", new ToStringBuilder(base).append("a", 3L).toString());
        __CLR4_5_2worworlvha7hg1.R.inc(42400);assertEquals(baseStr + "[3,4]", new ToStringBuilder(base).append("a", 3L).append("b", 4L).toString());
    }finally{__CLR4_5_2worworlvha7hg1.R.flushNeeded();}}

    @Test
    public void testObjectArray() {__CLR4_5_2worworlvha7hg1.R.globalSliceStart(getClass().getName(),42401);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2oi04a7wpt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2worworlvha7hg1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2worworlvha7hg1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.NoFieldNamesToStringStyleTest.testObjectArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),42401,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2oi04a7wpt(){try{__CLR4_5_2worworlvha7hg1.R.inc(42401);
        __CLR4_5_2worworlvha7hg1.R.inc(42402);Object[] array = new Object[] {null, base, new int[] {3, 6}};
        __CLR4_5_2worworlvha7hg1.R.inc(42403);assertEquals(baseStr + "[{<null>,5,{3,6}}]", new ToStringBuilder(base).append(array).toString());
        __CLR4_5_2worworlvha7hg1.R.inc(42404);assertEquals(baseStr + "[{<null>,5,{3,6}}]", new ToStringBuilder(base).append((Object) array).toString());
        __CLR4_5_2worworlvha7hg1.R.inc(42405);array = null;
        __CLR4_5_2worworlvha7hg1.R.inc(42406);assertEquals(baseStr + "[<null>]", new ToStringBuilder(base).append(array).toString());
        __CLR4_5_2worworlvha7hg1.R.inc(42407);assertEquals(baseStr + "[<null>]", new ToStringBuilder(base).append((Object) array).toString());
    }finally{__CLR4_5_2worworlvha7hg1.R.flushNeeded();}}

    @Test
    public void testLongArray() {__CLR4_5_2worworlvha7hg1.R.globalSliceStart(getClass().getName(),42408);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2if58i6wq0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2worworlvha7hg1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2worworlvha7hg1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.NoFieldNamesToStringStyleTest.testLongArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),42408,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2if58i6wq0(){try{__CLR4_5_2worworlvha7hg1.R.inc(42408);
        __CLR4_5_2worworlvha7hg1.R.inc(42409);long[] array = new long[] {1, 2, -3, 4};
        __CLR4_5_2worworlvha7hg1.R.inc(42410);assertEquals(baseStr + "[{1,2,-3,4}]", new ToStringBuilder(base).append(array).toString());
        __CLR4_5_2worworlvha7hg1.R.inc(42411);assertEquals(baseStr + "[{1,2,-3,4}]", new ToStringBuilder(base).append((Object) array).toString());
        __CLR4_5_2worworlvha7hg1.R.inc(42412);array = null;
        __CLR4_5_2worworlvha7hg1.R.inc(42413);assertEquals(baseStr + "[<null>]", new ToStringBuilder(base).append(array).toString());
        __CLR4_5_2worworlvha7hg1.R.inc(42414);assertEquals(baseStr + "[<null>]", new ToStringBuilder(base).append((Object) array).toString());
    }finally{__CLR4_5_2worworlvha7hg1.R.flushNeeded();}}

    @Test
    public void testLongArrayArray() {__CLR4_5_2worworlvha7hg1.R.globalSliceStart(getClass().getName(),42415);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2xbpkglwq7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2worworlvha7hg1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2worworlvha7hg1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.NoFieldNamesToStringStyleTest.testLongArrayArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),42415,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2xbpkglwq7(){try{__CLR4_5_2worworlvha7hg1.R.inc(42415);
        __CLR4_5_2worworlvha7hg1.R.inc(42416);long[][] array = new long[][] {{1, 2}, null, {5}};
        __CLR4_5_2worworlvha7hg1.R.inc(42417);assertEquals(baseStr + "[{{1,2},<null>,{5}}]", new ToStringBuilder(base).append(array).toString());
        __CLR4_5_2worworlvha7hg1.R.inc(42418);assertEquals(baseStr + "[{{1,2},<null>,{5}}]", new ToStringBuilder(base).append((Object) array).toString());
        __CLR4_5_2worworlvha7hg1.R.inc(42419);array = null;
        __CLR4_5_2worworlvha7hg1.R.inc(42420);assertEquals(baseStr + "[<null>]", new ToStringBuilder(base).append(array).toString());
        __CLR4_5_2worworlvha7hg1.R.inc(42421);assertEquals(baseStr + "[<null>]", new ToStringBuilder(base).append((Object) array).toString());
    }finally{__CLR4_5_2worworlvha7hg1.R.flushNeeded();}}

}
