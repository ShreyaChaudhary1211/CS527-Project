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
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

import org.apache.commons.lang3.builder.ToStringStyleTest.Person;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit tests {@link org.apache.commons.lang3.builder.JsonToStringStyleTest}.
 */
public class JsonToStringStyleTest {static class __CLR4_5_2w5qw5qlvha7hbp{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172763741L,8589935092L,41810,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private final Integer base = Integer.valueOf(5);

    @Before
    public void setUp() throws Exception {try{__CLR4_5_2w5qw5qlvha7hbp.R.inc(41678);
        __CLR4_5_2w5qw5qlvha7hbp.R.inc(41679);ToStringBuilder.setDefaultStyle(ToStringStyle.JSON_STYLE);
    }finally{__CLR4_5_2w5qw5qlvha7hbp.R.flushNeeded();}}

    @After
    public void tearDown() throws Exception {try{__CLR4_5_2w5qw5qlvha7hbp.R.inc(41680);
        __CLR4_5_2w5qw5qlvha7hbp.R.inc(41681);ToStringBuilder.setDefaultStyle(ToStringStyle.DEFAULT_STYLE);
    }finally{__CLR4_5_2w5qw5qlvha7hbp.R.flushNeeded();}}

    // ----------------------------------------------------------------

    @Test
    public void testNull() {__CLR4_5_2w5qw5qlvha7hbp.R.globalSliceStart(getClass().getName(),41682);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_29231k0w5u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2w5qw5qlvha7hbp.R.rethrow($CLV_t2$);}finally{__CLR4_5_2w5qw5qlvha7hbp.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.JsonToStringStyleTest.testNull",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),41682,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_29231k0w5u(){try{__CLR4_5_2w5qw5qlvha7hbp.R.inc(41682);
        __CLR4_5_2w5qw5qlvha7hbp.R.inc(41683);assertEquals("null", new ToStringBuilder(null).toString());
    }finally{__CLR4_5_2w5qw5qlvha7hbp.R.flushNeeded();}}

    @Test
    public void testBlank() {__CLR4_5_2w5qw5qlvha7hbp.R.globalSliceStart(getClass().getName(),41684);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2s7z6qxw5w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2w5qw5qlvha7hbp.R.rethrow($CLV_t2$);}finally{__CLR4_5_2w5qw5qlvha7hbp.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.JsonToStringStyleTest.testBlank",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),41684,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2s7z6qxw5w(){try{__CLR4_5_2w5qw5qlvha7hbp.R.inc(41684);
        __CLR4_5_2w5qw5qlvha7hbp.R.inc(41685);assertEquals("{}", new ToStringBuilder(base).toString());
    }finally{__CLR4_5_2w5qw5qlvha7hbp.R.flushNeeded();}}

    @Test
    public void testAppendSuper() {__CLR4_5_2w5qw5qlvha7hbp.R.globalSliceStart(getClass().getName(),41686);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2cvyfiiw5y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2w5qw5qlvha7hbp.R.rethrow($CLV_t2$);}finally{__CLR4_5_2w5qw5qlvha7hbp.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.JsonToStringStyleTest.testAppendSuper",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),41686,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2cvyfiiw5y(){try{__CLR4_5_2w5qw5qlvha7hbp.R.inc(41686);
        __CLR4_5_2w5qw5qlvha7hbp.R.inc(41687);assertEquals(
                "{}",
                new ToStringBuilder(base).appendSuper(
                        "Integer@8888[" + System.lineSeparator() + "]")
                        .toString());
        __CLR4_5_2w5qw5qlvha7hbp.R.inc(41688);assertEquals(
                "{}",
                new ToStringBuilder(base).appendSuper(
                        "Integer@8888[" + System.lineSeparator() + "  null"
                                + System.lineSeparator() + "]").toString());
        __CLR4_5_2w5qw5qlvha7hbp.R.inc(41689);assertEquals(
                "{\"a\":\"hello\"}",
                new ToStringBuilder(base)
                        .appendSuper(
                                "Integer@8888[" + System.lineSeparator()
                                        + "]").append("a", "hello").toString());
        __CLR4_5_2w5qw5qlvha7hbp.R.inc(41690);assertEquals(
                "{\"a\":\"hello\"}",
                new ToStringBuilder(base)
                        .appendSuper(
                                "Integer@8888[" + System.lineSeparator()
                                        + "  null" + System.lineSeparator()
                                        + "]").append("a", "hello").toString());
        __CLR4_5_2w5qw5qlvha7hbp.R.inc(41691);assertEquals("{\"a\":\"hello\"}", new ToStringBuilder(base)
                .appendSuper(null).append("a", "hello").toString());

        __CLR4_5_2w5qw5qlvha7hbp.R.inc(41692);assertEquals("{\"a\":\"hello\",\"b\":\"world\"}", new ToStringBuilder(base)
                .appendSuper("{\"a\":\"hello\"}").append("b", "world").toString());
    }finally{__CLR4_5_2w5qw5qlvha7hbp.R.flushNeeded();}}

    @Test
    public void testChar() {__CLR4_5_2w5qw5qlvha7hbp.R.globalSliceStart(getClass().getName(),41693);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2d2kz0vw65();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2w5qw5qlvha7hbp.R.rethrow($CLV_t2$);}finally{__CLR4_5_2w5qw5qlvha7hbp.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.JsonToStringStyleTest.testChar",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),41693,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2d2kz0vw65(){try{__CLR4_5_2w5qw5qlvha7hbp.R.inc(41693);
        __CLR4_5_2w5qw5qlvha7hbp.R.inc(41694);try {
            __CLR4_5_2w5qw5qlvha7hbp.R.inc(41695);new ToStringBuilder(base).append('A').toString();
            __CLR4_5_2w5qw5qlvha7hbp.R.inc(41696);fail("Should have generated UnsupportedOperationException");
        } catch (final UnsupportedOperationException e) {
        }

        __CLR4_5_2w5qw5qlvha7hbp.R.inc(41697);assertEquals("{\"a\":\"A\"}", new ToStringBuilder(base).append("a", 'A')
                .toString());
        __CLR4_5_2w5qw5qlvha7hbp.R.inc(41698);assertEquals("{\"a\":\"A\",\"b\":\"B\"}", new ToStringBuilder(base).append("a", 'A').append("b", 'B')
                .toString());
    }finally{__CLR4_5_2w5qw5qlvha7hbp.R.flushNeeded();}}

    @Test
    public void testDate() {__CLR4_5_2w5qw5qlvha7hbp.R.globalSliceStart(getClass().getName(),41699);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2czcdi1w6b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2w5qw5qlvha7hbp.R.rethrow($CLV_t2$);}finally{__CLR4_5_2w5qw5qlvha7hbp.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.JsonToStringStyleTest.testDate",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),41699,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2czcdi1w6b(){try{__CLR4_5_2w5qw5qlvha7hbp.R.inc(41699);
        __CLR4_5_2w5qw5qlvha7hbp.R.inc(41700);final Date now = new Date();
        __CLR4_5_2w5qw5qlvha7hbp.R.inc(41701);final Date afterNow = new Date(System.currentTimeMillis() + 1);

        __CLR4_5_2w5qw5qlvha7hbp.R.inc(41702);try {
            __CLR4_5_2w5qw5qlvha7hbp.R.inc(41703);new ToStringBuilder(base).append(now).toString();
            __CLR4_5_2w5qw5qlvha7hbp.R.inc(41704);fail("Should have generated UnsupportedOperationException");
        } catch (final UnsupportedOperationException e) {
        }

        __CLR4_5_2w5qw5qlvha7hbp.R.inc(41705);assertEquals("{\"now\":\"" + now.toString() +"\"}", new ToStringBuilder(base).append("now", now)
                .toString());
        __CLR4_5_2w5qw5qlvha7hbp.R.inc(41706);assertEquals("{\"now\":\"" + now.toString() +"\",\"after\":\"" + afterNow.toString() + "\"}", new ToStringBuilder(base).append("now", now).append("after", afterNow)
                .toString());
    }finally{__CLR4_5_2w5qw5qlvha7hbp.R.flushNeeded();}}

    @Test
    public void testObject() {__CLR4_5_2w5qw5qlvha7hbp.R.globalSliceStart(getClass().getName(),41707);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2iogga0w6j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2w5qw5qlvha7hbp.R.rethrow($CLV_t2$);}finally{__CLR4_5_2w5qw5qlvha7hbp.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.JsonToStringStyleTest.testObject",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),41707,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2iogga0w6j(){try{__CLR4_5_2w5qw5qlvha7hbp.R.inc(41707);

        __CLR4_5_2w5qw5qlvha7hbp.R.inc(41708);final Integer i3 = Integer.valueOf(3);
        __CLR4_5_2w5qw5qlvha7hbp.R.inc(41709);final Integer i4 = Integer.valueOf(4);

        __CLR4_5_2w5qw5qlvha7hbp.R.inc(41710);try {
            __CLR4_5_2w5qw5qlvha7hbp.R.inc(41711);new ToStringBuilder(base).append((Object) null).toString();
            __CLR4_5_2w5qw5qlvha7hbp.R.inc(41712);fail("Should have generated UnsupportedOperationException");
        } catch (final UnsupportedOperationException e) {
        }

        __CLR4_5_2w5qw5qlvha7hbp.R.inc(41713);try {
            __CLR4_5_2w5qw5qlvha7hbp.R.inc(41714);new ToStringBuilder(base).append(i3).toString();
            __CLR4_5_2w5qw5qlvha7hbp.R.inc(41715);fail("Should have generated UnsupportedOperationException");
        } catch (final UnsupportedOperationException e) {
        }

        __CLR4_5_2w5qw5qlvha7hbp.R.inc(41716);assertEquals("{\"a\":null}",
                new ToStringBuilder(base).append("a", (Object) null).toString());
        __CLR4_5_2w5qw5qlvha7hbp.R.inc(41717);assertEquals("{\"a\":3}", new ToStringBuilder(base).append("a", i3)
                .toString());
        __CLR4_5_2w5qw5qlvha7hbp.R.inc(41718);assertEquals("{\"a\":3,\"b\":4}",
                new ToStringBuilder(base).append("a", i3).append("b", i4)
                        .toString());

        __CLR4_5_2w5qw5qlvha7hbp.R.inc(41719);try {
            __CLR4_5_2w5qw5qlvha7hbp.R.inc(41720);new ToStringBuilder(base).append("a", i3, false).toString();
            __CLR4_5_2w5qw5qlvha7hbp.R.inc(41721);fail("Should have generated UnsupportedOperationException");
        } catch (final UnsupportedOperationException e) {
        }

        __CLR4_5_2w5qw5qlvha7hbp.R.inc(41722);try {
            __CLR4_5_2w5qw5qlvha7hbp.R.inc(41723);new ToStringBuilder(base).append("a", new ArrayList<>(), false).toString();
            __CLR4_5_2w5qw5qlvha7hbp.R.inc(41724);fail("Should have generated UnsupportedOperationException");
        } catch (final UnsupportedOperationException e) {
        }

        __CLR4_5_2w5qw5qlvha7hbp.R.inc(41725);assertEquals(
                "{\"a\":[]}",
                new ToStringBuilder(base).append("a", new ArrayList<>(),
                        true).toString());

        __CLR4_5_2w5qw5qlvha7hbp.R.inc(41726);try {
            __CLR4_5_2w5qw5qlvha7hbp.R.inc(41727);new ToStringBuilder(base).append("a", new HashMap<>(), false).toString();
            __CLR4_5_2w5qw5qlvha7hbp.R.inc(41728);fail("Should have generated UnsupportedOperationException");
        } catch (final UnsupportedOperationException e) {
        }

        __CLR4_5_2w5qw5qlvha7hbp.R.inc(41729);assertEquals(
                "{\"a\":{}}",
                new ToStringBuilder(base).append("a",
                        new HashMap<>(), true).toString());

        __CLR4_5_2w5qw5qlvha7hbp.R.inc(41730);try {
            __CLR4_5_2w5qw5qlvha7hbp.R.inc(41731);new ToStringBuilder(base).append("a", (Object) new String[0], false).toString();
            __CLR4_5_2w5qw5qlvha7hbp.R.inc(41732);fail("Should have generated UnsupportedOperationException");
        } catch (final UnsupportedOperationException e) {
        }

        __CLR4_5_2w5qw5qlvha7hbp.R.inc(41733);assertEquals(
                "{\"a\":[]}",
                new ToStringBuilder(base).append("a", (Object) new String[0],
                        true).toString());

        __CLR4_5_2w5qw5qlvha7hbp.R.inc(41734);try {
            __CLR4_5_2w5qw5qlvha7hbp.R.inc(41735);new ToStringBuilder(base).append("a", (Object) new int[]{1, 2, 3}, false).toString();
            __CLR4_5_2w5qw5qlvha7hbp.R.inc(41736);fail("Should have generated UnsupportedOperationException");
        } catch (final UnsupportedOperationException e) {
        }


        __CLR4_5_2w5qw5qlvha7hbp.R.inc(41737);assertEquals(
                "{\"a\":[1,2,3]}",
                new ToStringBuilder(base).append("a",
                        (Object) new int[]{1, 2, 3}, true).toString());

        __CLR4_5_2w5qw5qlvha7hbp.R.inc(41738);try {
            __CLR4_5_2w5qw5qlvha7hbp.R.inc(41739);new ToStringBuilder(base).append("a", (Object) new String[]{"v", "x", "y", "z"}, false).toString();
            __CLR4_5_2w5qw5qlvha7hbp.R.inc(41740);fail("Should have generated UnsupportedOperationException");
        } catch (final UnsupportedOperationException e) {
        }


        __CLR4_5_2w5qw5qlvha7hbp.R.inc(41741);assertEquals(
                "{\"a\":[\"v\",\"x\",\"y\",\"z\"]}",
                new ToStringBuilder(base).append("a",
                        (Object) new String[]{"v", "x", "y", "z"}, true)
                        .toString());
    }finally{__CLR4_5_2w5qw5qlvha7hbp.R.flushNeeded();}}

    @Test
    public void testPerson() {__CLR4_5_2w5qw5qlvha7hbp.R.globalSliceStart(getClass().getName(),41742);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2rmqmmqw7i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2w5qw5qlvha7hbp.R.rethrow($CLV_t2$);}finally{__CLR4_5_2w5qw5qlvha7hbp.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.JsonToStringStyleTest.testPerson",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),41742,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2rmqmmqw7i(){try{__CLR4_5_2w5qw5qlvha7hbp.R.inc(41742);
        __CLR4_5_2w5qw5qlvha7hbp.R.inc(41743);final Person p = new Person();
        __CLR4_5_2w5qw5qlvha7hbp.R.inc(41744);p.name = "Jane Doe";
        __CLR4_5_2w5qw5qlvha7hbp.R.inc(41745);p.age = 25;
        __CLR4_5_2w5qw5qlvha7hbp.R.inc(41746);p.smoker = true;

        __CLR4_5_2w5qw5qlvha7hbp.R.inc(41747);assertEquals(
                "{\"name\":\"Jane Doe\",\"age\":25,\"smoker\":true}",
                new ToStringBuilder(p).append("name", p.name)
                        .append("age", p.age).append("smoker", p.smoker)
                        .toString());
    }finally{__CLR4_5_2w5qw5qlvha7hbp.R.flushNeeded();}}
    
    @Test
    public void testNestingPerson() {__CLR4_5_2w5qw5qlvha7hbp.R.globalSliceStart(getClass().getName(),41748);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2i7nk98w7o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2w5qw5qlvha7hbp.R.rethrow($CLV_t2$);}finally{__CLR4_5_2w5qw5qlvha7hbp.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.JsonToStringStyleTest.testNestingPerson",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),41748,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2i7nk98w7o(){try{__CLR4_5_2w5qw5qlvha7hbp.R.inc(41748);
        __CLR4_5_2w5qw5qlvha7hbp.R.inc(41749);final Person p = new Person(){
            @Override
            public String toString(){try{__CLR4_5_2w5qw5qlvha7hbp.R.inc(41750);
                __CLR4_5_2w5qw5qlvha7hbp.R.inc(41751);return new ToStringBuilder(this).append("name", this.name)
                    .append("age", this.age).append("smoker", this.smoker)
                    .toString();
            }finally{__CLR4_5_2w5qw5qlvha7hbp.R.flushNeeded();}}
        };
        __CLR4_5_2w5qw5qlvha7hbp.R.inc(41752);p.name = "Jane Doe";
        __CLR4_5_2w5qw5qlvha7hbp.R.inc(41753);p.age = 25;
        __CLR4_5_2w5qw5qlvha7hbp.R.inc(41754);p.smoker = true;

        __CLR4_5_2w5qw5qlvha7hbp.R.inc(41755);final NestingPerson nestP = new NestingPerson();
        __CLR4_5_2w5qw5qlvha7hbp.R.inc(41756);nestP.pid="#1@Jane";
        __CLR4_5_2w5qw5qlvha7hbp.R.inc(41757);nestP.person = p;

        __CLR4_5_2w5qw5qlvha7hbp.R.inc(41758);assertEquals(
                "{\"pid\":\"#1@Jane\",\"person\":{\"name\":\"Jane Doe\",\"age\":25,\"smoker\":true}}",
                new ToStringBuilder(nestP).append("pid", nestP.pid)
                        .append("person", nestP.person)
                        .toString());
    }finally{__CLR4_5_2w5qw5qlvha7hbp.R.flushNeeded();}}

    @Test
    public void testLong() {__CLR4_5_2w5qw5qlvha7hbp.R.globalSliceStart(getClass().getName(),41759);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2xsq9mzw7z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2w5qw5qlvha7hbp.R.rethrow($CLV_t2$);}finally{__CLR4_5_2w5qw5qlvha7hbp.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.JsonToStringStyleTest.testLong",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),41759,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2xsq9mzw7z(){try{__CLR4_5_2w5qw5qlvha7hbp.R.inc(41759);

        __CLR4_5_2w5qw5qlvha7hbp.R.inc(41760);try {
            __CLR4_5_2w5qw5qlvha7hbp.R.inc(41761);new ToStringBuilder(base).append(3L).toString();
            __CLR4_5_2w5qw5qlvha7hbp.R.inc(41762);fail("Should have generated UnsupportedOperationException");
        } catch (final UnsupportedOperationException e) {
        }

        __CLR4_5_2w5qw5qlvha7hbp.R.inc(41763);assertEquals("{\"a\":3}", new ToStringBuilder(base).append("a", 3L)
                .toString());
        __CLR4_5_2w5qw5qlvha7hbp.R.inc(41764);assertEquals("{\"a\":3,\"b\":4}",
                new ToStringBuilder(base).append("a", 3L).append("b", 4L)
                        .toString());
    }finally{__CLR4_5_2w5qw5qlvha7hbp.R.flushNeeded();}}

    @Test
    public void testObjectArray() {__CLR4_5_2w5qw5qlvha7hbp.R.globalSliceStart(getClass().getName(),41765);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2oi04a7w85();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2w5qw5qlvha7hbp.R.rethrow($CLV_t2$);}finally{__CLR4_5_2w5qw5qlvha7hbp.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.JsonToStringStyleTest.testObjectArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),41765,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2oi04a7w85(){try{__CLR4_5_2w5qw5qlvha7hbp.R.inc(41765);
        __CLR4_5_2w5qw5qlvha7hbp.R.inc(41766);Object[] array = new Object[]{null, base, new int[]{3, 6}};

        __CLR4_5_2w5qw5qlvha7hbp.R.inc(41767);try {
            __CLR4_5_2w5qw5qlvha7hbp.R.inc(41768);new ToStringBuilder(base).append(array).toString();
            __CLR4_5_2w5qw5qlvha7hbp.R.inc(41769);fail("Should have generated UnsupportedOperationException");
        } catch (final UnsupportedOperationException e) {
        }

        __CLR4_5_2w5qw5qlvha7hbp.R.inc(41770);try {
            __CLR4_5_2w5qw5qlvha7hbp.R.inc(41771);new ToStringBuilder(base).append((Object) array).toString();
            __CLR4_5_2w5qw5qlvha7hbp.R.inc(41772);fail("Should have generated UnsupportedOperationException");
        } catch (final UnsupportedOperationException e) {
        }

        __CLR4_5_2w5qw5qlvha7hbp.R.inc(41773);array = null;
        __CLR4_5_2w5qw5qlvha7hbp.R.inc(41774);try {
            __CLR4_5_2w5qw5qlvha7hbp.R.inc(41775);new ToStringBuilder(base).append(array).toString();
            __CLR4_5_2w5qw5qlvha7hbp.R.inc(41776);fail("Should have generated UnsupportedOperationException");
        } catch (final UnsupportedOperationException e) {
        }

        __CLR4_5_2w5qw5qlvha7hbp.R.inc(41777);try {
            __CLR4_5_2w5qw5qlvha7hbp.R.inc(41778);new ToStringBuilder(base).append((Object) array).toString();
            __CLR4_5_2w5qw5qlvha7hbp.R.inc(41779);fail("Should have generated UnsupportedOperationException");
        } catch (final UnsupportedOperationException e) {
        }
    }finally{__CLR4_5_2w5qw5qlvha7hbp.R.flushNeeded();}}

    @Test
    public void testLongArray() {__CLR4_5_2w5qw5qlvha7hbp.R.globalSliceStart(getClass().getName(),41780);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2if58i6w8k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2w5qw5qlvha7hbp.R.rethrow($CLV_t2$);}finally{__CLR4_5_2w5qw5qlvha7hbp.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.JsonToStringStyleTest.testLongArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),41780,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2if58i6w8k(){try{__CLR4_5_2w5qw5qlvha7hbp.R.inc(41780);
        __CLR4_5_2w5qw5qlvha7hbp.R.inc(41781);long[] array = new long[]{1, 2, -3, 4};

        __CLR4_5_2w5qw5qlvha7hbp.R.inc(41782);try {
            __CLR4_5_2w5qw5qlvha7hbp.R.inc(41783);new ToStringBuilder(base).append(array).toString();
            __CLR4_5_2w5qw5qlvha7hbp.R.inc(41784);fail("Should have generated UnsupportedOperationException");
        } catch (final UnsupportedOperationException e) {
        }

        __CLR4_5_2w5qw5qlvha7hbp.R.inc(41785);try {
            __CLR4_5_2w5qw5qlvha7hbp.R.inc(41786);new ToStringBuilder(base).append((Object) array).toString();
            __CLR4_5_2w5qw5qlvha7hbp.R.inc(41787);fail("Should have generated UnsupportedOperationException");
        } catch (final UnsupportedOperationException e) {
        }

        __CLR4_5_2w5qw5qlvha7hbp.R.inc(41788);array = null;

        __CLR4_5_2w5qw5qlvha7hbp.R.inc(41789);try {
            __CLR4_5_2w5qw5qlvha7hbp.R.inc(41790);new ToStringBuilder(base).append(array).toString();
            __CLR4_5_2w5qw5qlvha7hbp.R.inc(41791);fail("Should have generated UnsupportedOperationException");
        } catch (final UnsupportedOperationException e) {
        }

        __CLR4_5_2w5qw5qlvha7hbp.R.inc(41792);try {
            __CLR4_5_2w5qw5qlvha7hbp.R.inc(41793);new ToStringBuilder(base).append((Object) array).toString();
            __CLR4_5_2w5qw5qlvha7hbp.R.inc(41794);fail("Should have generated UnsupportedOperationException");
        } catch (final UnsupportedOperationException e) {
        }
    }finally{__CLR4_5_2w5qw5qlvha7hbp.R.flushNeeded();}}

    @Test
    public void testLongArrayArray() {__CLR4_5_2w5qw5qlvha7hbp.R.globalSliceStart(getClass().getName(),41795);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2xbpkglw8z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2w5qw5qlvha7hbp.R.rethrow($CLV_t2$);}finally{__CLR4_5_2w5qw5qlvha7hbp.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.JsonToStringStyleTest.testLongArrayArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),41795,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2xbpkglw8z(){try{__CLR4_5_2w5qw5qlvha7hbp.R.inc(41795);
        __CLR4_5_2w5qw5qlvha7hbp.R.inc(41796);long[][] array = new long[][]{{1, 2}, null, {5}};

        __CLR4_5_2w5qw5qlvha7hbp.R.inc(41797);try {
            __CLR4_5_2w5qw5qlvha7hbp.R.inc(41798);new ToStringBuilder(base).append(array).toString();
            __CLR4_5_2w5qw5qlvha7hbp.R.inc(41799);fail("Should have generated UnsupportedOperationException");
        } catch (final UnsupportedOperationException e) {
        }

        __CLR4_5_2w5qw5qlvha7hbp.R.inc(41800);try {
            __CLR4_5_2w5qw5qlvha7hbp.R.inc(41801);new ToStringBuilder(base).append((Object) array).toString();
            __CLR4_5_2w5qw5qlvha7hbp.R.inc(41802);fail("Should have generated UnsupportedOperationException");
        } catch (final UnsupportedOperationException e) {
        }

        __CLR4_5_2w5qw5qlvha7hbp.R.inc(41803);array = null;

        __CLR4_5_2w5qw5qlvha7hbp.R.inc(41804);try {
            __CLR4_5_2w5qw5qlvha7hbp.R.inc(41805);new ToStringBuilder(base).append(array).toString();
            __CLR4_5_2w5qw5qlvha7hbp.R.inc(41806);fail("Should have generated UnsupportedOperationException");
        } catch (final UnsupportedOperationException e) {
        }

        __CLR4_5_2w5qw5qlvha7hbp.R.inc(41807);try {
            __CLR4_5_2w5qw5qlvha7hbp.R.inc(41808);new ToStringBuilder(base).append((Object) array).toString();
            __CLR4_5_2w5qw5qlvha7hbp.R.inc(41809);fail("Should have generated UnsupportedOperationException");
        } catch (final UnsupportedOperationException e) {
        }
    }finally{__CLR4_5_2w5qw5qlvha7hbp.R.flushNeeded();}}
    
    /**
     * An object with nested object structures used to test {@link ToStringStyle.JsonToStringStyle}.
     * 
     */
    static class NestingPerson {
        /**
         * Test String field.
         */
        String pid;

        /**
         * Test nested object field.
         */
        Person person;
    }
}
