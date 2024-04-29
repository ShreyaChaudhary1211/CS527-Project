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

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit tests {@link org.apache.commons.lang3.builder.RecursiveToStringStyleTest}.
 */
public class RecursiveToStringStyleTest {static class __CLR4_5_2wqewqelvha7hgc{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172763741L,8589935092L,42485,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private final Integer base = Integer.valueOf(5);
    private final String baseStr = base.getClass().getName() + "@" + Integer.toHexString(System.identityHashCode(base));
    
    @Before
    public void setUp() throws Exception {try{__CLR4_5_2wqewqelvha7hgc.R.inc(42422);
        __CLR4_5_2wqewqelvha7hgc.R.inc(42423);ToStringBuilder.setDefaultStyle(new RecursiveToStringStyle());
    }finally{__CLR4_5_2wqewqelvha7hgc.R.flushNeeded();}}

    @After
    public void tearDown() throws Exception {try{__CLR4_5_2wqewqelvha7hgc.R.inc(42424);
        __CLR4_5_2wqewqelvha7hgc.R.inc(42425);ToStringBuilder.setDefaultStyle(ToStringStyle.DEFAULT_STYLE);
    }finally{__CLR4_5_2wqewqelvha7hgc.R.flushNeeded();}}

    //----------------------------------------------------------------
    
    @Test
    public void testBlank() {__CLR4_5_2wqewqelvha7hgc.R.globalSliceStart(getClass().getName(),42426);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2s7z6qxwqi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2wqewqelvha7hgc.R.rethrow($CLV_t2$);}finally{__CLR4_5_2wqewqelvha7hgc.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.RecursiveToStringStyleTest.testBlank",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),42426,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2s7z6qxwqi(){try{__CLR4_5_2wqewqelvha7hgc.R.inc(42426);
        __CLR4_5_2wqewqelvha7hgc.R.inc(42427);assertEquals(baseStr + "[]", new ToStringBuilder(base).toString());
    }finally{__CLR4_5_2wqewqelvha7hgc.R.flushNeeded();}}

    @Test
    public void testAppendSuper() {__CLR4_5_2wqewqelvha7hgc.R.globalSliceStart(getClass().getName(),42428);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2cvyfiiwqk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2wqewqelvha7hgc.R.rethrow($CLV_t2$);}finally{__CLR4_5_2wqewqelvha7hgc.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.RecursiveToStringStyleTest.testAppendSuper",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),42428,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2cvyfiiwqk(){try{__CLR4_5_2wqewqelvha7hgc.R.inc(42428);
        __CLR4_5_2wqewqelvha7hgc.R.inc(42429);assertEquals(baseStr + "[]", new ToStringBuilder(base).appendSuper("Integer@8888[]").toString());
        __CLR4_5_2wqewqelvha7hgc.R.inc(42430);assertEquals(baseStr + "[<null>]", new ToStringBuilder(base).appendSuper("Integer@8888[<null>]").toString());
        
        __CLR4_5_2wqewqelvha7hgc.R.inc(42431);assertEquals(baseStr + "[a=hello]", new ToStringBuilder(base).appendSuper("Integer@8888[]").append("a", "hello").toString());
        __CLR4_5_2wqewqelvha7hgc.R.inc(42432);assertEquals(baseStr + "[<null>,a=hello]", new ToStringBuilder(base).appendSuper("Integer@8888[<null>]").append("a", "hello").toString());
        __CLR4_5_2wqewqelvha7hgc.R.inc(42433);assertEquals(baseStr + "[a=hello]", new ToStringBuilder(base).appendSuper(null).append("a", "hello").toString());
    }finally{__CLR4_5_2wqewqelvha7hgc.R.flushNeeded();}}
    
    @Test
    public void testObject() {__CLR4_5_2wqewqelvha7hgc.R.globalSliceStart(getClass().getName(),42434);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2iogga0wqq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2wqewqelvha7hgc.R.rethrow($CLV_t2$);}finally{__CLR4_5_2wqewqelvha7hgc.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.RecursiveToStringStyleTest.testObject",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),42434,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2iogga0wqq(){try{__CLR4_5_2wqewqelvha7hgc.R.inc(42434);
        __CLR4_5_2wqewqelvha7hgc.R.inc(42435);final Integer i3 = Integer.valueOf(3);
        __CLR4_5_2wqewqelvha7hgc.R.inc(42436);final Integer i4 = Integer.valueOf(4);
        __CLR4_5_2wqewqelvha7hgc.R.inc(42437);final ArrayList<Object> emptyList = new ArrayList<>();
        
        __CLR4_5_2wqewqelvha7hgc.R.inc(42438);assertEquals(baseStr + "[<null>]", new ToStringBuilder(base).append((Object) null).toString());
        __CLR4_5_2wqewqelvha7hgc.R.inc(42439);assertEquals(baseStr + "[3]", new ToStringBuilder(base).append(i3).toString());
        __CLR4_5_2wqewqelvha7hgc.R.inc(42440);assertEquals(baseStr + "[a=<null>]", new ToStringBuilder(base).append("a", (Object) null).toString());
        __CLR4_5_2wqewqelvha7hgc.R.inc(42441);assertEquals(baseStr + "[a=3]", new ToStringBuilder(base).append("a", i3).toString());
        __CLR4_5_2wqewqelvha7hgc.R.inc(42442);assertEquals(baseStr + "[a=3,b=4]", new ToStringBuilder(base).append("a", i3).append("b", i4).toString());
        __CLR4_5_2wqewqelvha7hgc.R.inc(42443);assertEquals(baseStr + "[a=<Integer>]", new ToStringBuilder(base).append("a", i3, false).toString());
        __CLR4_5_2wqewqelvha7hgc.R.inc(42444);assertEquals(baseStr + "[a=<size=0>]", new ToStringBuilder(base).append("a", emptyList, false).toString());      
        __CLR4_5_2wqewqelvha7hgc.R.inc(42445);assertEquals(baseStr + "[a=java.util.ArrayList@" + Integer.toHexString(System.identityHashCode(emptyList)) + "{}]",
                new ToStringBuilder(base).append("a", emptyList, true).toString());
        __CLR4_5_2wqewqelvha7hgc.R.inc(42446);assertEquals(baseStr + "[a=<size=0>]", new ToStringBuilder(base).append("a", new HashMap<>(), false).toString());
        __CLR4_5_2wqewqelvha7hgc.R.inc(42447);assertEquals(baseStr + "[a={}]", new ToStringBuilder(base).append("a", new HashMap<>(), true).toString());
        __CLR4_5_2wqewqelvha7hgc.R.inc(42448);assertEquals(baseStr + "[a=<size=0>]", new ToStringBuilder(base).append("a", (Object) new String[0], false).toString());
        __CLR4_5_2wqewqelvha7hgc.R.inc(42449);assertEquals(baseStr + "[a={}]", new ToStringBuilder(base).append("a", (Object) new String[0], true).toString());
    }finally{__CLR4_5_2wqewqelvha7hgc.R.flushNeeded();}}

    @Test
    public void testPerson() {__CLR4_5_2wqewqelvha7hgc.R.globalSliceStart(getClass().getName(),42450);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2rmqmmqwr6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2wqewqelvha7hgc.R.rethrow($CLV_t2$);}finally{__CLR4_5_2wqewqelvha7hgc.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.RecursiveToStringStyleTest.testPerson",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),42450,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2rmqmmqwr6(){try{__CLR4_5_2wqewqelvha7hgc.R.inc(42450);
        __CLR4_5_2wqewqelvha7hgc.R.inc(42451);final Person p = new Person();
        __CLR4_5_2wqewqelvha7hgc.R.inc(42452);p.name = "John Doe";
        __CLR4_5_2wqewqelvha7hgc.R.inc(42453);p.age = 33;
        __CLR4_5_2wqewqelvha7hgc.R.inc(42454);p.smoker = false;
        __CLR4_5_2wqewqelvha7hgc.R.inc(42455);p.job = new Job();
        __CLR4_5_2wqewqelvha7hgc.R.inc(42456);p.job.title = "Manager";
        __CLR4_5_2wqewqelvha7hgc.R.inc(42457);final String pBaseStr = p.getClass().getName() + "@" + Integer.toHexString(System.identityHashCode(p));
        __CLR4_5_2wqewqelvha7hgc.R.inc(42458);final String pJobStr  = p.job.getClass().getName() + "@" + Integer.toHexString(System.identityHashCode(p.job));
        __CLR4_5_2wqewqelvha7hgc.R.inc(42459);assertEquals(pBaseStr + "[name=John Doe,age=33,smoker=false,job=" + pJobStr + "[title=Manager]]",
                     new ReflectionToStringBuilder(p, new RecursiveToStringStyle()).toString());
    }finally{__CLR4_5_2wqewqelvha7hgc.R.flushNeeded();}}

    @Test
    public void testLong() {__CLR4_5_2wqewqelvha7hgc.R.globalSliceStart(getClass().getName(),42460);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2xsq9mzwrg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2wqewqelvha7hgc.R.rethrow($CLV_t2$);}finally{__CLR4_5_2wqewqelvha7hgc.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.RecursiveToStringStyleTest.testLong",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),42460,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2xsq9mzwrg(){try{__CLR4_5_2wqewqelvha7hgc.R.inc(42460);
        __CLR4_5_2wqewqelvha7hgc.R.inc(42461);assertEquals(baseStr + "[3]", new ToStringBuilder(base).append(3L).toString());
        __CLR4_5_2wqewqelvha7hgc.R.inc(42462);assertEquals(baseStr + "[a=3]", new ToStringBuilder(base).append("a", 3L).toString());
        __CLR4_5_2wqewqelvha7hgc.R.inc(42463);assertEquals(baseStr + "[a=3,b=4]", new ToStringBuilder(base).append("a", 3L).append("b", 4L).toString());
    }finally{__CLR4_5_2wqewqelvha7hgc.R.flushNeeded();}}

    @Test
    public void testObjectArray() {__CLR4_5_2wqewqelvha7hgc.R.globalSliceStart(getClass().getName(),42464);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2oi04a7wrk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2wqewqelvha7hgc.R.rethrow($CLV_t2$);}finally{__CLR4_5_2wqewqelvha7hgc.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.RecursiveToStringStyleTest.testObjectArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),42464,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2oi04a7wrk(){try{__CLR4_5_2wqewqelvha7hgc.R.inc(42464);
        __CLR4_5_2wqewqelvha7hgc.R.inc(42465);Object[] array = new Object[] {null, base, new int[] {3, 6}};
        __CLR4_5_2wqewqelvha7hgc.R.inc(42466);assertEquals(baseStr + "[{<null>,5,{3,6}}]", new ToStringBuilder(base).append(array).toString());
        __CLR4_5_2wqewqelvha7hgc.R.inc(42467);assertEquals(baseStr + "[{<null>,5,{3,6}}]", new ToStringBuilder(base).append((Object) array).toString());
        __CLR4_5_2wqewqelvha7hgc.R.inc(42468);array = null;
        __CLR4_5_2wqewqelvha7hgc.R.inc(42469);assertEquals(baseStr + "[<null>]", new ToStringBuilder(base).append(array).toString());
        __CLR4_5_2wqewqelvha7hgc.R.inc(42470);assertEquals(baseStr + "[<null>]", new ToStringBuilder(base).append((Object) array).toString());
    }finally{__CLR4_5_2wqewqelvha7hgc.R.flushNeeded();}}

    @Test
    public void testLongArray() {__CLR4_5_2wqewqelvha7hgc.R.globalSliceStart(getClass().getName(),42471);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2if58i6wrr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2wqewqelvha7hgc.R.rethrow($CLV_t2$);}finally{__CLR4_5_2wqewqelvha7hgc.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.RecursiveToStringStyleTest.testLongArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),42471,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2if58i6wrr(){try{__CLR4_5_2wqewqelvha7hgc.R.inc(42471);
        __CLR4_5_2wqewqelvha7hgc.R.inc(42472);long[] array = new long[] {1, 2, -3, 4};
        __CLR4_5_2wqewqelvha7hgc.R.inc(42473);assertEquals(baseStr + "[{1,2,-3,4}]", new ToStringBuilder(base).append(array).toString());
        __CLR4_5_2wqewqelvha7hgc.R.inc(42474);assertEquals(baseStr + "[{1,2,-3,4}]", new ToStringBuilder(base).append((Object) array).toString());
        __CLR4_5_2wqewqelvha7hgc.R.inc(42475);array = null;
        __CLR4_5_2wqewqelvha7hgc.R.inc(42476);assertEquals(baseStr + "[<null>]", new ToStringBuilder(base).append(array).toString());
        __CLR4_5_2wqewqelvha7hgc.R.inc(42477);assertEquals(baseStr + "[<null>]", new ToStringBuilder(base).append((Object) array).toString());
    }finally{__CLR4_5_2wqewqelvha7hgc.R.flushNeeded();}}

    @Test
    public void testLongArrayArray() {__CLR4_5_2wqewqelvha7hgc.R.globalSliceStart(getClass().getName(),42478);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2xbpkglwry();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2wqewqelvha7hgc.R.rethrow($CLV_t2$);}finally{__CLR4_5_2wqewqelvha7hgc.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.RecursiveToStringStyleTest.testLongArrayArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),42478,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2xbpkglwry(){try{__CLR4_5_2wqewqelvha7hgc.R.inc(42478);
        __CLR4_5_2wqewqelvha7hgc.R.inc(42479);long[][] array = new long[][] {{1, 2}, null, {5}};
        __CLR4_5_2wqewqelvha7hgc.R.inc(42480);assertEquals(baseStr + "[{{1,2},<null>,{5}}]", new ToStringBuilder(base).append(array).toString());
        __CLR4_5_2wqewqelvha7hgc.R.inc(42481);assertEquals(baseStr + "[{{1,2},<null>,{5}}]", new ToStringBuilder(base).append((Object) array).toString());
        __CLR4_5_2wqewqelvha7hgc.R.inc(42482);array = null;
        __CLR4_5_2wqewqelvha7hgc.R.inc(42483);assertEquals(baseStr + "[<null>]", new ToStringBuilder(base).append(array).toString());
        __CLR4_5_2wqewqelvha7hgc.R.inc(42484);assertEquals(baseStr + "[<null>]", new ToStringBuilder(base).append((Object) array).toString());
    }finally{__CLR4_5_2wqewqelvha7hgc.R.flushNeeded();}}

    static class Person {
        /**
         * Test String field.
         */
        String name;

        /**
         * Test integer field.
         */
        int age;

        /**
         * Test boolean field.
         */
        boolean smoker;
        
        /**
         * Test Object field.
         */
        Job job;
    }
    
    static class Job {
        /**
         * Test String field.
         */
        String title;
    }

}
