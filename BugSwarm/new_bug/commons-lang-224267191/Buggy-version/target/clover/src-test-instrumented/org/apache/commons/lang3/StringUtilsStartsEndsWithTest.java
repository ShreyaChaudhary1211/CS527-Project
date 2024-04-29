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
package org.apache.commons.lang3;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


/**
 * Unit tests {@link org.apache.commons.lang3.StringUtils} - StartsWith/EndsWith methods
 */
public class StringUtilsStartsEndsWithTest {static class __CLR4_5_2rccrcclvha7ggy{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172763741L,8589935092L,35532,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private static final String foo    = "foo";
    private static final String bar    = "bar";
    private static final String foobar = "foobar";
    private static final String FOO    = "FOO";
    private static final String BAR    = "BAR";
    private static final String FOOBAR = "FOOBAR";

    //-----------------------------------------------------------------------

    /**
     * Test StringUtils.startsWith()
     */
    @Test
    public void testStartsWith() {__CLR4_5_2rccrcclvha7ggy.R.globalSliceStart(getClass().getName(),35436);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_210ksuorcc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2rccrcclvha7ggy.R.rethrow($CLV_t2$);}finally{__CLR4_5_2rccrcclvha7ggy.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsStartsEndsWithTest.testStartsWith",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),35436,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_210ksuorcc(){try{__CLR4_5_2rccrcclvha7ggy.R.inc(35436);
        __CLR4_5_2rccrcclvha7ggy.R.inc(35437);assertTrue("startsWith(null, null)", StringUtils.startsWith(null, null));
        __CLR4_5_2rccrcclvha7ggy.R.inc(35438);assertFalse("startsWith(FOOBAR, null)", StringUtils.startsWith(FOOBAR, null));
        __CLR4_5_2rccrcclvha7ggy.R.inc(35439);assertFalse("startsWith(null, FOO)",    StringUtils.startsWith(null, FOO));
        __CLR4_5_2rccrcclvha7ggy.R.inc(35440);assertTrue("startsWith(FOOBAR, \"\")",  StringUtils.startsWith(FOOBAR, ""));

        __CLR4_5_2rccrcclvha7ggy.R.inc(35441);assertTrue("startsWith(foobar, foo)",  StringUtils.startsWith(foobar, foo));
        __CLR4_5_2rccrcclvha7ggy.R.inc(35442);assertTrue("startsWith(FOOBAR, FOO)",  StringUtils.startsWith(FOOBAR, FOO));
        __CLR4_5_2rccrcclvha7ggy.R.inc(35443);assertFalse("startsWith(foobar, FOO)", StringUtils.startsWith(foobar, FOO));
        __CLR4_5_2rccrcclvha7ggy.R.inc(35444);assertFalse("startsWith(FOOBAR, foo)", StringUtils.startsWith(FOOBAR, foo));

        __CLR4_5_2rccrcclvha7ggy.R.inc(35445);assertFalse("startsWith(foo, foobar)", StringUtils.startsWith(foo, foobar));
        __CLR4_5_2rccrcclvha7ggy.R.inc(35446);assertFalse("startsWith(foo, foobar)", StringUtils.startsWith(bar, foobar));

        __CLR4_5_2rccrcclvha7ggy.R.inc(35447);assertFalse("startsWith(foobar, bar)", StringUtils.startsWith(foobar, bar));
        __CLR4_5_2rccrcclvha7ggy.R.inc(35448);assertFalse("startsWith(FOOBAR, BAR)", StringUtils.startsWith(FOOBAR, BAR));
        __CLR4_5_2rccrcclvha7ggy.R.inc(35449);assertFalse("startsWith(foobar, BAR)", StringUtils.startsWith(foobar, BAR));
        __CLR4_5_2rccrcclvha7ggy.R.inc(35450);assertFalse("startsWith(FOOBAR, bar)", StringUtils.startsWith(FOOBAR, bar));
    }finally{__CLR4_5_2rccrcclvha7ggy.R.flushNeeded();}}

    /**
     * Test StringUtils.testStartsWithIgnoreCase()
     */
    @Test
    public void testStartsWithIgnoreCase() {__CLR4_5_2rccrcclvha7ggy.R.globalSliceStart(getClass().getName(),35451);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2w0t2hercr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2rccrcclvha7ggy.R.rethrow($CLV_t2$);}finally{__CLR4_5_2rccrcclvha7ggy.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsStartsEndsWithTest.testStartsWithIgnoreCase",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),35451,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2w0t2hercr(){try{__CLR4_5_2rccrcclvha7ggy.R.inc(35451);
        __CLR4_5_2rccrcclvha7ggy.R.inc(35452);assertTrue("startsWithIgnoreCase(null, null)",    StringUtils.startsWithIgnoreCase(null, null));
        __CLR4_5_2rccrcclvha7ggy.R.inc(35453);assertFalse("startsWithIgnoreCase(FOOBAR, null)", StringUtils.startsWithIgnoreCase(FOOBAR, null));
        __CLR4_5_2rccrcclvha7ggy.R.inc(35454);assertFalse("startsWithIgnoreCase(null, FOO)",    StringUtils.startsWithIgnoreCase(null, FOO));
        __CLR4_5_2rccrcclvha7ggy.R.inc(35455);assertTrue("startsWithIgnoreCase(FOOBAR, \"\")",  StringUtils.startsWithIgnoreCase(FOOBAR, ""));

        __CLR4_5_2rccrcclvha7ggy.R.inc(35456);assertTrue("startsWithIgnoreCase(foobar, foo)", StringUtils.startsWithIgnoreCase(foobar, foo));
        __CLR4_5_2rccrcclvha7ggy.R.inc(35457);assertTrue("startsWithIgnoreCase(FOOBAR, FOO)", StringUtils.startsWithIgnoreCase(FOOBAR, FOO));
        __CLR4_5_2rccrcclvha7ggy.R.inc(35458);assertTrue("startsWithIgnoreCase(foobar, FOO)", StringUtils.startsWithIgnoreCase(foobar, FOO));
        __CLR4_5_2rccrcclvha7ggy.R.inc(35459);assertTrue("startsWithIgnoreCase(FOOBAR, foo)", StringUtils.startsWithIgnoreCase(FOOBAR, foo));

        __CLR4_5_2rccrcclvha7ggy.R.inc(35460);assertFalse("startsWithIgnoreCase(foo, foobar)", StringUtils.startsWithIgnoreCase(foo, foobar));
        __CLR4_5_2rccrcclvha7ggy.R.inc(35461);assertFalse("startsWithIgnoreCase(foo, foobar)", StringUtils.startsWithIgnoreCase(bar, foobar));

        __CLR4_5_2rccrcclvha7ggy.R.inc(35462);assertFalse("startsWithIgnoreCase(foobar, bar)", StringUtils.startsWithIgnoreCase(foobar, bar));
        __CLR4_5_2rccrcclvha7ggy.R.inc(35463);assertFalse("startsWithIgnoreCase(FOOBAR, BAR)", StringUtils.startsWithIgnoreCase(FOOBAR, BAR));
        __CLR4_5_2rccrcclvha7ggy.R.inc(35464);assertFalse("startsWithIgnoreCase(foobar, BAR)", StringUtils.startsWithIgnoreCase(foobar, BAR));
        __CLR4_5_2rccrcclvha7ggy.R.inc(35465);assertFalse("startsWithIgnoreCase(FOOBAR, bar)", StringUtils.startsWithIgnoreCase(FOOBAR, bar));
    }finally{__CLR4_5_2rccrcclvha7ggy.R.flushNeeded();}}

    @Test
    public void testStartsWithAny() {__CLR4_5_2rccrcclvha7ggy.R.globalSliceStart(getClass().getName(),35466);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2h8v67erd6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2rccrcclvha7ggy.R.rethrow($CLV_t2$);}finally{__CLR4_5_2rccrcclvha7ggy.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsStartsEndsWithTest.testStartsWithAny",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),35466,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2h8v67erd6(){try{__CLR4_5_2rccrcclvha7ggy.R.inc(35466);
        __CLR4_5_2rccrcclvha7ggy.R.inc(35467);assertFalse(StringUtils.startsWithAny(null, (String[])null));
        __CLR4_5_2rccrcclvha7ggy.R.inc(35468);assertFalse(StringUtils.startsWithAny(null, "abc"));
        __CLR4_5_2rccrcclvha7ggy.R.inc(35469);assertFalse(StringUtils.startsWithAny("abcxyz", (String[])null));
        __CLR4_5_2rccrcclvha7ggy.R.inc(35470);assertFalse(StringUtils.startsWithAny("abcxyz"));
        __CLR4_5_2rccrcclvha7ggy.R.inc(35471);assertTrue(StringUtils.startsWithAny("abcxyz", "abc"));
        __CLR4_5_2rccrcclvha7ggy.R.inc(35472);assertTrue(StringUtils.startsWithAny("abcxyz", null, "xyz", "abc"));
        __CLR4_5_2rccrcclvha7ggy.R.inc(35473);assertFalse(StringUtils.startsWithAny("abcxyz", null, "xyz", "abcd"));
        __CLR4_5_2rccrcclvha7ggy.R.inc(35474);assertTrue(StringUtils.startsWithAny("abcxyz", new String[]{""}));
        __CLR4_5_2rccrcclvha7ggy.R.inc(35475);assertFalse(StringUtils.startsWithAny("abcxyz", null, "xyz", "ABCX"));
        __CLR4_5_2rccrcclvha7ggy.R.inc(35476);assertFalse(StringUtils.startsWithAny("ABCXYZ", null, "xyz", "abc"));

        __CLR4_5_2rccrcclvha7ggy.R.inc(35477);assertTrue("StringUtils.startsWithAny(abcxyz, StringBuilder(xyz), StringBuffer(abc))", StringUtils.startsWithAny("abcxyz", new StringBuilder("xyz"), new StringBuffer("abc")));
        __CLR4_5_2rccrcclvha7ggy.R.inc(35478);assertTrue("StringUtils.startsWithAny(StringBuffer(abcxyz), StringBuilder(xyz), StringBuffer(abc))", StringUtils.startsWithAny(new StringBuffer("abcxyz"), new StringBuilder("xyz"), new StringBuffer("abc")));
    }finally{__CLR4_5_2rccrcclvha7ggy.R.flushNeeded();}}
 

    /**
     * Test StringUtils.endsWith()
     */
    @Test
    public void testEndsWith() {__CLR4_5_2rccrcclvha7ggy.R.globalSliceStart(getClass().getName(),35479);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2yf5q6vrdj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2rccrcclvha7ggy.R.rethrow($CLV_t2$);}finally{__CLR4_5_2rccrcclvha7ggy.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsStartsEndsWithTest.testEndsWith",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),35479,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2yf5q6vrdj(){try{__CLR4_5_2rccrcclvha7ggy.R.inc(35479);
        __CLR4_5_2rccrcclvha7ggy.R.inc(35480);assertTrue("endsWith(null, null)",    StringUtils.endsWith(null, null));
        __CLR4_5_2rccrcclvha7ggy.R.inc(35481);assertFalse("endsWith(FOOBAR, null)", StringUtils.endsWith(FOOBAR, null));
        __CLR4_5_2rccrcclvha7ggy.R.inc(35482);assertFalse("endsWith(null, FOO)",    StringUtils.endsWith(null, FOO));
        __CLR4_5_2rccrcclvha7ggy.R.inc(35483);assertTrue("endsWith(FOOBAR, \"\")",  StringUtils.endsWith(FOOBAR, ""));

        __CLR4_5_2rccrcclvha7ggy.R.inc(35484);assertFalse("endsWith(foobar, foo)", StringUtils.endsWith(foobar, foo));
        __CLR4_5_2rccrcclvha7ggy.R.inc(35485);assertFalse("endsWith(FOOBAR, FOO)", StringUtils.endsWith(FOOBAR, FOO));
        __CLR4_5_2rccrcclvha7ggy.R.inc(35486);assertFalse("endsWith(foobar, FOO)", StringUtils.endsWith(foobar, FOO));
        __CLR4_5_2rccrcclvha7ggy.R.inc(35487);assertFalse("endsWith(FOOBAR, foo)", StringUtils.endsWith(FOOBAR, foo));

        __CLR4_5_2rccrcclvha7ggy.R.inc(35488);assertFalse("endsWith(foo, foobar)", StringUtils.endsWith(foo, foobar));
        __CLR4_5_2rccrcclvha7ggy.R.inc(35489);assertFalse("endsWith(foo, foobar)", StringUtils.endsWith(bar, foobar));

        __CLR4_5_2rccrcclvha7ggy.R.inc(35490);assertTrue("endsWith(foobar, bar)",  StringUtils.endsWith(foobar, bar));
        __CLR4_5_2rccrcclvha7ggy.R.inc(35491);assertTrue("endsWith(FOOBAR, BAR)",  StringUtils.endsWith(FOOBAR, BAR));
        __CLR4_5_2rccrcclvha7ggy.R.inc(35492);assertFalse("endsWith(foobar, BAR)", StringUtils.endsWith(foobar, BAR));
        __CLR4_5_2rccrcclvha7ggy.R.inc(35493);assertFalse("endsWith(FOOBAR, bar)", StringUtils.endsWith(FOOBAR, bar));

        // "alpha,beta,gamma,delta".endsWith("delta")
        __CLR4_5_2rccrcclvha7ggy.R.inc(35494);assertTrue("endsWith(\u03b1\u03b2\u03b3\u03b4, \u03b4)",
                StringUtils.endsWith("\u03b1\u03b2\u03b3\u03b4", "\u03b4"));
        // "alpha,beta,gamma,delta".endsWith("gamma,DELTA")
        __CLR4_5_2rccrcclvha7ggy.R.inc(35495);assertFalse("endsWith(\u03b1\u03b2\u03b3\u03b4, \u03b3\u0394)",
                StringUtils.endsWith("\u03b1\u03b2\u03b3\u03b4", "\u03b3\u0394"));
    }finally{__CLR4_5_2rccrcclvha7ggy.R.flushNeeded();}}

    /**
     * Test StringUtils.endsWithIgnoreCase()
     */
    @Test
    public void testEndsWithIgnoreCase() {__CLR4_5_2rccrcclvha7ggy.R.globalSliceStart(getClass().getName(),35496);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vfojdzre0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2rccrcclvha7ggy.R.rethrow($CLV_t2$);}finally{__CLR4_5_2rccrcclvha7ggy.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsStartsEndsWithTest.testEndsWithIgnoreCase",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),35496,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vfojdzre0(){try{__CLR4_5_2rccrcclvha7ggy.R.inc(35496);
        __CLR4_5_2rccrcclvha7ggy.R.inc(35497);assertTrue("endsWithIgnoreCase(null, null)",    StringUtils.endsWithIgnoreCase(null, null));
        __CLR4_5_2rccrcclvha7ggy.R.inc(35498);assertFalse("endsWithIgnoreCase(FOOBAR, null)", StringUtils.endsWithIgnoreCase(FOOBAR, null));
        __CLR4_5_2rccrcclvha7ggy.R.inc(35499);assertFalse("endsWithIgnoreCase(null, FOO)",    StringUtils.endsWithIgnoreCase(null, FOO));
        __CLR4_5_2rccrcclvha7ggy.R.inc(35500);assertTrue("endsWithIgnoreCase(FOOBAR, \"\")",  StringUtils.endsWithIgnoreCase(FOOBAR, ""));

        __CLR4_5_2rccrcclvha7ggy.R.inc(35501);assertFalse("endsWithIgnoreCase(foobar, foo)", StringUtils.endsWithIgnoreCase(foobar, foo));
        __CLR4_5_2rccrcclvha7ggy.R.inc(35502);assertFalse("endsWithIgnoreCase(FOOBAR, FOO)", StringUtils.endsWithIgnoreCase(FOOBAR, FOO));
        __CLR4_5_2rccrcclvha7ggy.R.inc(35503);assertFalse("endsWithIgnoreCase(foobar, FOO)", StringUtils.endsWithIgnoreCase(foobar, FOO));
        __CLR4_5_2rccrcclvha7ggy.R.inc(35504);assertFalse("endsWithIgnoreCase(FOOBAR, foo)", StringUtils.endsWithIgnoreCase(FOOBAR, foo));

        __CLR4_5_2rccrcclvha7ggy.R.inc(35505);assertFalse("endsWithIgnoreCase(foo, foobar)", StringUtils.endsWithIgnoreCase(foo, foobar));
        __CLR4_5_2rccrcclvha7ggy.R.inc(35506);assertFalse("endsWithIgnoreCase(foo, foobar)", StringUtils.endsWithIgnoreCase(bar, foobar));

        __CLR4_5_2rccrcclvha7ggy.R.inc(35507);assertTrue("endsWithIgnoreCase(foobar, bar)", StringUtils.endsWithIgnoreCase(foobar, bar));
        __CLR4_5_2rccrcclvha7ggy.R.inc(35508);assertTrue("endsWithIgnoreCase(FOOBAR, BAR)", StringUtils.endsWithIgnoreCase(FOOBAR, BAR));
        __CLR4_5_2rccrcclvha7ggy.R.inc(35509);assertTrue("endsWithIgnoreCase(foobar, BAR)", StringUtils.endsWithIgnoreCase(foobar, BAR));
        __CLR4_5_2rccrcclvha7ggy.R.inc(35510);assertTrue("endsWithIgnoreCase(FOOBAR, bar)", StringUtils.endsWithIgnoreCase(FOOBAR, bar));

        // javadoc
        __CLR4_5_2rccrcclvha7ggy.R.inc(35511);assertTrue(StringUtils.endsWithIgnoreCase("abcdef", "def"));
        __CLR4_5_2rccrcclvha7ggy.R.inc(35512);assertTrue(StringUtils.endsWithIgnoreCase("ABCDEF", "def"));
        __CLR4_5_2rccrcclvha7ggy.R.inc(35513);assertFalse(StringUtils.endsWithIgnoreCase("ABCDEF", "cde"));

        // "alpha,beta,gamma,delta".endsWith("DELTA")
        __CLR4_5_2rccrcclvha7ggy.R.inc(35514);assertTrue("endsWith(\u03b1\u03b2\u03b3\u03b4, \u0394)",
                StringUtils.endsWithIgnoreCase("\u03b1\u03b2\u03b3\u03b4", "\u0394"));
        // "alpha,beta,gamma,delta".endsWith("GAMMA")
        __CLR4_5_2rccrcclvha7ggy.R.inc(35515);assertFalse("endsWith(\u03b1\u03b2\u03b3\u03b4, \u0393)",
                StringUtils.endsWithIgnoreCase("\u03b1\u03b2\u03b3\u03b4", "\u0393"));
    }finally{__CLR4_5_2rccrcclvha7ggy.R.flushNeeded();}}

    @Test
    public void testEndsWithAny() {__CLR4_5_2rccrcclvha7ggy.R.globalSliceStart(getClass().getName(),35516);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2rdcvlprek();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2rccrcclvha7ggy.R.rethrow($CLV_t2$);}finally{__CLR4_5_2rccrcclvha7ggy.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsStartsEndsWithTest.testEndsWithAny",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),35516,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2rdcvlprek(){try{__CLR4_5_2rccrcclvha7ggy.R.inc(35516);
        __CLR4_5_2rccrcclvha7ggy.R.inc(35517);assertFalse("StringUtils.endsWithAny(null, null)", StringUtils.endsWithAny(null, (String)null));
        __CLR4_5_2rccrcclvha7ggy.R.inc(35518);assertFalse("StringUtils.endsWithAny(null, new String[] {abc})", StringUtils.endsWithAny(null, new String[] {"abc"}));
        __CLR4_5_2rccrcclvha7ggy.R.inc(35519);assertFalse("StringUtils.endsWithAny(abcxyz, null)", StringUtils.endsWithAny("abcxyz", (String)null));
        __CLR4_5_2rccrcclvha7ggy.R.inc(35520);assertTrue("StringUtils.endsWithAny(abcxyz, new String[] {\"\"})", StringUtils.endsWithAny("abcxyz", new String[] {""}));
        __CLR4_5_2rccrcclvha7ggy.R.inc(35521);assertTrue("StringUtils.endsWithAny(abcxyz, new String[] {xyz})", StringUtils.endsWithAny("abcxyz", new String[] {"xyz"}));
        __CLR4_5_2rccrcclvha7ggy.R.inc(35522);assertTrue("StringUtils.endsWithAny(abcxyz, new String[] {null, xyz, abc})", StringUtils.endsWithAny("abcxyz", new String[] {null, "xyz", "abc"}));
        __CLR4_5_2rccrcclvha7ggy.R.inc(35523);assertFalse("StringUtils.endsWithAny(defg, new String[] {null, xyz, abc})", StringUtils.endsWithAny("defg", new String[] {null, "xyz", "abc"}));
        __CLR4_5_2rccrcclvha7ggy.R.inc(35524);assertTrue(StringUtils.endsWithAny("abcXYZ", "def", "XYZ"));
        __CLR4_5_2rccrcclvha7ggy.R.inc(35525);assertFalse(StringUtils.endsWithAny("abcXYZ", "def", "xyz"));
        __CLR4_5_2rccrcclvha7ggy.R.inc(35526);assertTrue(StringUtils.endsWithAny("abcXYZ", "def", "YZ"));

        /*
         * Type null of the last argument to method endsWithAny(CharSequence, CharSequence...)
         * doesn't exactly match the vararg parameter type. 
         * Cast to CharSequence[] to confirm the non-varargs invocation,
         * or pass individual arguments of type CharSequence for a varargs invocation.
         *
         * assertFalse(StringUtils.endsWithAny("abcXYZ", null)); // replace with specific types to avoid warning
         */
        __CLR4_5_2rccrcclvha7ggy.R.inc(35527);assertFalse(StringUtils.endsWithAny("abcXYZ", (CharSequence) null));
        __CLR4_5_2rccrcclvha7ggy.R.inc(35528);assertFalse(StringUtils.endsWithAny("abcXYZ", (CharSequence[]) null));
        __CLR4_5_2rccrcclvha7ggy.R.inc(35529);assertTrue(StringUtils.endsWithAny("abcXYZ", ""));

        __CLR4_5_2rccrcclvha7ggy.R.inc(35530);assertTrue("StringUtils.endsWithAny(abcxyz, StringBuilder(abc), StringBuffer(xyz))", StringUtils.endsWithAny("abcxyz", new StringBuilder("abc"), new StringBuffer("xyz")));
        __CLR4_5_2rccrcclvha7ggy.R.inc(35531);assertTrue("StringUtils.endsWithAny(StringBuffer(abcxyz), StringBuilder(abc), StringBuffer(xyz))", StringUtils.endsWithAny(new StringBuffer("abcxyz"), new StringBuilder("abc"), new StringBuffer("xyz")));
    }finally{__CLR4_5_2rccrcclvha7ggy.R.flushNeeded();}}


}
