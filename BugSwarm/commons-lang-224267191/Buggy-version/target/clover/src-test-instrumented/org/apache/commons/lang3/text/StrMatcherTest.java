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

package org.apache.commons.lang3.text;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit tests for {@link org.apache.commons.lang3.text.StrMatcher}.
 */
@Deprecated
public class StrMatcherTest  {static class __CLR4_5_215gu15gulvha7igj{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172763741L,8589935092L,53862,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final char[] BUFFER1 = "0,1\t2 3\n\r\f\u0000'\"".toCharArray();

    private static final char[] BUFFER2 = "abcdef".toCharArray();


    //-----------------------------------------------------------------------
    @Test
    public void testCommaMatcher() {__CLR4_5_215gu15gulvha7igj.R.globalSliceStart(getClass().getName(),53742);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27lemve15gu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_215gu15gulvha7igj.R.rethrow($CLV_t2$);}finally{__CLR4_5_215gu15gulvha7igj.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrMatcherTest.testCommaMatcher",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),53742,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27lemve15gu(){try{__CLR4_5_215gu15gulvha7igj.R.inc(53742);
        __CLR4_5_215gu15gulvha7igj.R.inc(53743);final StrMatcher matcher = StrMatcher.commaMatcher();
        __CLR4_5_215gu15gulvha7igj.R.inc(53744);assertSame(matcher, StrMatcher.commaMatcher());
        __CLR4_5_215gu15gulvha7igj.R.inc(53745);assertEquals(0, matcher.isMatch(BUFFER1, 0));
        __CLR4_5_215gu15gulvha7igj.R.inc(53746);assertEquals(1, matcher.isMatch(BUFFER1, 1));
        __CLR4_5_215gu15gulvha7igj.R.inc(53747);assertEquals(0, matcher.isMatch(BUFFER1, 2));
    }finally{__CLR4_5_215gu15gulvha7igj.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testTabMatcher() {__CLR4_5_215gu15gulvha7igj.R.globalSliceStart(getClass().getName(),53748);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26qa74a15h0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_215gu15gulvha7igj.R.rethrow($CLV_t2$);}finally{__CLR4_5_215gu15gulvha7igj.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrMatcherTest.testTabMatcher",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),53748,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26qa74a15h0(){try{__CLR4_5_215gu15gulvha7igj.R.inc(53748);
        __CLR4_5_215gu15gulvha7igj.R.inc(53749);final StrMatcher matcher = StrMatcher.tabMatcher();
        __CLR4_5_215gu15gulvha7igj.R.inc(53750);assertSame(matcher, StrMatcher.tabMatcher());
        __CLR4_5_215gu15gulvha7igj.R.inc(53751);assertEquals(0, matcher.isMatch(BUFFER1, 2));
        __CLR4_5_215gu15gulvha7igj.R.inc(53752);assertEquals(1, matcher.isMatch(BUFFER1, 3));
        __CLR4_5_215gu15gulvha7igj.R.inc(53753);assertEquals(0, matcher.isMatch(BUFFER1, 4));
    }finally{__CLR4_5_215gu15gulvha7igj.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testSpaceMatcher() {__CLR4_5_215gu15gulvha7igj.R.globalSliceStart(getClass().getName(),53754);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ifx9xh15h6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_215gu15gulvha7igj.R.rethrow($CLV_t2$);}finally{__CLR4_5_215gu15gulvha7igj.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrMatcherTest.testSpaceMatcher",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),53754,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ifx9xh15h6(){try{__CLR4_5_215gu15gulvha7igj.R.inc(53754);
        __CLR4_5_215gu15gulvha7igj.R.inc(53755);final StrMatcher matcher = StrMatcher.spaceMatcher();
        __CLR4_5_215gu15gulvha7igj.R.inc(53756);assertSame(matcher, StrMatcher.spaceMatcher());
        __CLR4_5_215gu15gulvha7igj.R.inc(53757);assertEquals(0, matcher.isMatch(BUFFER1, 4));
        __CLR4_5_215gu15gulvha7igj.R.inc(53758);assertEquals(1, matcher.isMatch(BUFFER1, 5));
        __CLR4_5_215gu15gulvha7igj.R.inc(53759);assertEquals(0, matcher.isMatch(BUFFER1, 6));
    }finally{__CLR4_5_215gu15gulvha7igj.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testSplitMatcher() {__CLR4_5_215gu15gulvha7igj.R.globalSliceStart(getClass().getName(),53760);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26bhe9d15hc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_215gu15gulvha7igj.R.rethrow($CLV_t2$);}finally{__CLR4_5_215gu15gulvha7igj.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrMatcherTest.testSplitMatcher",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),53760,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26bhe9d15hc(){try{__CLR4_5_215gu15gulvha7igj.R.inc(53760);
        __CLR4_5_215gu15gulvha7igj.R.inc(53761);final StrMatcher matcher = StrMatcher.splitMatcher();
        __CLR4_5_215gu15gulvha7igj.R.inc(53762);assertSame(matcher, StrMatcher.splitMatcher());
        __CLR4_5_215gu15gulvha7igj.R.inc(53763);assertEquals(0, matcher.isMatch(BUFFER1, 2));
        __CLR4_5_215gu15gulvha7igj.R.inc(53764);assertEquals(1, matcher.isMatch(BUFFER1, 3));
        __CLR4_5_215gu15gulvha7igj.R.inc(53765);assertEquals(0, matcher.isMatch(BUFFER1, 4));
        __CLR4_5_215gu15gulvha7igj.R.inc(53766);assertEquals(1, matcher.isMatch(BUFFER1, 5));
        __CLR4_5_215gu15gulvha7igj.R.inc(53767);assertEquals(0, matcher.isMatch(BUFFER1, 6));
        __CLR4_5_215gu15gulvha7igj.R.inc(53768);assertEquals(1, matcher.isMatch(BUFFER1, 7));
        __CLR4_5_215gu15gulvha7igj.R.inc(53769);assertEquals(1, matcher.isMatch(BUFFER1, 8));
        __CLR4_5_215gu15gulvha7igj.R.inc(53770);assertEquals(1, matcher.isMatch(BUFFER1, 9));
        __CLR4_5_215gu15gulvha7igj.R.inc(53771);assertEquals(0, matcher.isMatch(BUFFER1, 10));
    }finally{__CLR4_5_215gu15gulvha7igj.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testTrimMatcher() {__CLR4_5_215gu15gulvha7igj.R.globalSliceStart(getClass().getName(),53772);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_273bmbf15ho();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_215gu15gulvha7igj.R.rethrow($CLV_t2$);}finally{__CLR4_5_215gu15gulvha7igj.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrMatcherTest.testTrimMatcher",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),53772,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_273bmbf15ho(){try{__CLR4_5_215gu15gulvha7igj.R.inc(53772);
        __CLR4_5_215gu15gulvha7igj.R.inc(53773);final StrMatcher matcher = StrMatcher.trimMatcher();
        __CLR4_5_215gu15gulvha7igj.R.inc(53774);assertSame(matcher, StrMatcher.trimMatcher());
        __CLR4_5_215gu15gulvha7igj.R.inc(53775);assertEquals(0, matcher.isMatch(BUFFER1, 2));
        __CLR4_5_215gu15gulvha7igj.R.inc(53776);assertEquals(1, matcher.isMatch(BUFFER1, 3));
        __CLR4_5_215gu15gulvha7igj.R.inc(53777);assertEquals(0, matcher.isMatch(BUFFER1, 4));
        __CLR4_5_215gu15gulvha7igj.R.inc(53778);assertEquals(1, matcher.isMatch(BUFFER1, 5));
        __CLR4_5_215gu15gulvha7igj.R.inc(53779);assertEquals(0, matcher.isMatch(BUFFER1, 6));
        __CLR4_5_215gu15gulvha7igj.R.inc(53780);assertEquals(1, matcher.isMatch(BUFFER1, 7));
        __CLR4_5_215gu15gulvha7igj.R.inc(53781);assertEquals(1, matcher.isMatch(BUFFER1, 8));
        __CLR4_5_215gu15gulvha7igj.R.inc(53782);assertEquals(1, matcher.isMatch(BUFFER1, 9));
        __CLR4_5_215gu15gulvha7igj.R.inc(53783);assertEquals(1, matcher.isMatch(BUFFER1, 10));
    }finally{__CLR4_5_215gu15gulvha7igj.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testSingleQuoteMatcher() {__CLR4_5_215gu15gulvha7igj.R.globalSliceStart(getClass().getName(),53784);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2d9o2kp15i0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_215gu15gulvha7igj.R.rethrow($CLV_t2$);}finally{__CLR4_5_215gu15gulvha7igj.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrMatcherTest.testSingleQuoteMatcher",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),53784,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2d9o2kp15i0(){try{__CLR4_5_215gu15gulvha7igj.R.inc(53784);
        __CLR4_5_215gu15gulvha7igj.R.inc(53785);final StrMatcher matcher = StrMatcher.singleQuoteMatcher();
        __CLR4_5_215gu15gulvha7igj.R.inc(53786);assertSame(matcher, StrMatcher.singleQuoteMatcher());
        __CLR4_5_215gu15gulvha7igj.R.inc(53787);assertEquals(0, matcher.isMatch(BUFFER1, 10));
        __CLR4_5_215gu15gulvha7igj.R.inc(53788);assertEquals(1, matcher.isMatch(BUFFER1, 11));
        __CLR4_5_215gu15gulvha7igj.R.inc(53789);assertEquals(0, matcher.isMatch(BUFFER1, 12));
    }finally{__CLR4_5_215gu15gulvha7igj.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testDoubleQuoteMatcher() {__CLR4_5_215gu15gulvha7igj.R.globalSliceStart(getClass().getName(),53790);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2uy70f415i6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_215gu15gulvha7igj.R.rethrow($CLV_t2$);}finally{__CLR4_5_215gu15gulvha7igj.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrMatcherTest.testDoubleQuoteMatcher",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),53790,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2uy70f415i6(){try{__CLR4_5_215gu15gulvha7igj.R.inc(53790);
        __CLR4_5_215gu15gulvha7igj.R.inc(53791);final StrMatcher matcher = StrMatcher.doubleQuoteMatcher();
        __CLR4_5_215gu15gulvha7igj.R.inc(53792);assertSame(matcher, StrMatcher.doubleQuoteMatcher());
        __CLR4_5_215gu15gulvha7igj.R.inc(53793);assertEquals(0, matcher.isMatch(BUFFER1, 11));
        __CLR4_5_215gu15gulvha7igj.R.inc(53794);assertEquals(1, matcher.isMatch(BUFFER1, 12));
    }finally{__CLR4_5_215gu15gulvha7igj.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testQuoteMatcher() {__CLR4_5_215gu15gulvha7igj.R.globalSliceStart(getClass().getName(),53795);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2x5oult15ib();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_215gu15gulvha7igj.R.rethrow($CLV_t2$);}finally{__CLR4_5_215gu15gulvha7igj.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrMatcherTest.testQuoteMatcher",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),53795,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2x5oult15ib(){try{__CLR4_5_215gu15gulvha7igj.R.inc(53795);
        __CLR4_5_215gu15gulvha7igj.R.inc(53796);final StrMatcher matcher = StrMatcher.quoteMatcher();
        __CLR4_5_215gu15gulvha7igj.R.inc(53797);assertSame(matcher, StrMatcher.quoteMatcher());
        __CLR4_5_215gu15gulvha7igj.R.inc(53798);assertEquals(0, matcher.isMatch(BUFFER1, 10));
        __CLR4_5_215gu15gulvha7igj.R.inc(53799);assertEquals(1, matcher.isMatch(BUFFER1, 11));
        __CLR4_5_215gu15gulvha7igj.R.inc(53800);assertEquals(1, matcher.isMatch(BUFFER1, 12));
    }finally{__CLR4_5_215gu15gulvha7igj.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testNoneMatcher() {__CLR4_5_215gu15gulvha7igj.R.globalSliceStart(getClass().getName(),53801);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2tvnub315ih();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_215gu15gulvha7igj.R.rethrow($CLV_t2$);}finally{__CLR4_5_215gu15gulvha7igj.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrMatcherTest.testNoneMatcher",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),53801,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2tvnub315ih(){try{__CLR4_5_215gu15gulvha7igj.R.inc(53801);
        __CLR4_5_215gu15gulvha7igj.R.inc(53802);final StrMatcher matcher = StrMatcher.noneMatcher();
        __CLR4_5_215gu15gulvha7igj.R.inc(53803);assertSame(matcher, StrMatcher.noneMatcher());
        __CLR4_5_215gu15gulvha7igj.R.inc(53804);assertEquals(0, matcher.isMatch(BUFFER1, 0));
        __CLR4_5_215gu15gulvha7igj.R.inc(53805);assertEquals(0, matcher.isMatch(BUFFER1, 1));
        __CLR4_5_215gu15gulvha7igj.R.inc(53806);assertEquals(0, matcher.isMatch(BUFFER1, 2));
        __CLR4_5_215gu15gulvha7igj.R.inc(53807);assertEquals(0, matcher.isMatch(BUFFER1, 3));
        __CLR4_5_215gu15gulvha7igj.R.inc(53808);assertEquals(0, matcher.isMatch(BUFFER1, 4));
        __CLR4_5_215gu15gulvha7igj.R.inc(53809);assertEquals(0, matcher.isMatch(BUFFER1, 5));
        __CLR4_5_215gu15gulvha7igj.R.inc(53810);assertEquals(0, matcher.isMatch(BUFFER1, 6));
        __CLR4_5_215gu15gulvha7igj.R.inc(53811);assertEquals(0, matcher.isMatch(BUFFER1, 7));
        __CLR4_5_215gu15gulvha7igj.R.inc(53812);assertEquals(0, matcher.isMatch(BUFFER1, 8));
        __CLR4_5_215gu15gulvha7igj.R.inc(53813);assertEquals(0, matcher.isMatch(BUFFER1, 9));
        __CLR4_5_215gu15gulvha7igj.R.inc(53814);assertEquals(0, matcher.isMatch(BUFFER1, 10));
        __CLR4_5_215gu15gulvha7igj.R.inc(53815);assertEquals(0, matcher.isMatch(BUFFER1, 11));
        __CLR4_5_215gu15gulvha7igj.R.inc(53816);assertEquals(0, matcher.isMatch(BUFFER1, 12));
    }finally{__CLR4_5_215gu15gulvha7igj.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testCharMatcher_char() {__CLR4_5_215gu15gulvha7igj.R.globalSliceStart(getClass().getName(),53817);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22vp8z215ix();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_215gu15gulvha7igj.R.rethrow($CLV_t2$);}finally{__CLR4_5_215gu15gulvha7igj.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrMatcherTest.testCharMatcher_char",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),53817,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22vp8z215ix(){try{__CLR4_5_215gu15gulvha7igj.R.inc(53817);
        __CLR4_5_215gu15gulvha7igj.R.inc(53818);final StrMatcher matcher = StrMatcher.charMatcher('c');
        __CLR4_5_215gu15gulvha7igj.R.inc(53819);assertEquals(0, matcher.isMatch(BUFFER2, 0));
        __CLR4_5_215gu15gulvha7igj.R.inc(53820);assertEquals(0, matcher.isMatch(BUFFER2, 1));
        __CLR4_5_215gu15gulvha7igj.R.inc(53821);assertEquals(1, matcher.isMatch(BUFFER2, 2));
        __CLR4_5_215gu15gulvha7igj.R.inc(53822);assertEquals(0, matcher.isMatch(BUFFER2, 3));
        __CLR4_5_215gu15gulvha7igj.R.inc(53823);assertEquals(0, matcher.isMatch(BUFFER2, 4));
        __CLR4_5_215gu15gulvha7igj.R.inc(53824);assertEquals(0, matcher.isMatch(BUFFER2, 5));
    }finally{__CLR4_5_215gu15gulvha7igj.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testCharSetMatcher_String() {__CLR4_5_215gu15gulvha7igj.R.globalSliceStart(getClass().getName(),53825);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_277k6pr15j5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_215gu15gulvha7igj.R.rethrow($CLV_t2$);}finally{__CLR4_5_215gu15gulvha7igj.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrMatcherTest.testCharSetMatcher_String",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),53825,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_277k6pr15j5(){try{__CLR4_5_215gu15gulvha7igj.R.inc(53825);
        __CLR4_5_215gu15gulvha7igj.R.inc(53826);final StrMatcher matcher = StrMatcher.charSetMatcher("ace");
        __CLR4_5_215gu15gulvha7igj.R.inc(53827);assertEquals(1, matcher.isMatch(BUFFER2, 0));
        __CLR4_5_215gu15gulvha7igj.R.inc(53828);assertEquals(0, matcher.isMatch(BUFFER2, 1));
        __CLR4_5_215gu15gulvha7igj.R.inc(53829);assertEquals(1, matcher.isMatch(BUFFER2, 2));
        __CLR4_5_215gu15gulvha7igj.R.inc(53830);assertEquals(0, matcher.isMatch(BUFFER2, 3));
        __CLR4_5_215gu15gulvha7igj.R.inc(53831);assertEquals(1, matcher.isMatch(BUFFER2, 4));
        __CLR4_5_215gu15gulvha7igj.R.inc(53832);assertEquals(0, matcher.isMatch(BUFFER2, 5));
        __CLR4_5_215gu15gulvha7igj.R.inc(53833);assertSame(StrMatcher.noneMatcher(), StrMatcher.charSetMatcher(""));
        __CLR4_5_215gu15gulvha7igj.R.inc(53834);assertSame(StrMatcher.noneMatcher(), StrMatcher.charSetMatcher((String) null));
        __CLR4_5_215gu15gulvha7igj.R.inc(53835);assertTrue(StrMatcher.charSetMatcher("a") instanceof StrMatcher.CharMatcher);
    }finally{__CLR4_5_215gu15gulvha7igj.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testCharSetMatcher_charArray() {__CLR4_5_215gu15gulvha7igj.R.globalSliceStart(getClass().getName(),53836);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26jcuil15jg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_215gu15gulvha7igj.R.rethrow($CLV_t2$);}finally{__CLR4_5_215gu15gulvha7igj.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrMatcherTest.testCharSetMatcher_charArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),53836,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26jcuil15jg(){try{__CLR4_5_215gu15gulvha7igj.R.inc(53836);
        __CLR4_5_215gu15gulvha7igj.R.inc(53837);final StrMatcher matcher = StrMatcher.charSetMatcher("ace".toCharArray());
        __CLR4_5_215gu15gulvha7igj.R.inc(53838);assertEquals(1, matcher.isMatch(BUFFER2, 0));
        __CLR4_5_215gu15gulvha7igj.R.inc(53839);assertEquals(0, matcher.isMatch(BUFFER2, 1));
        __CLR4_5_215gu15gulvha7igj.R.inc(53840);assertEquals(1, matcher.isMatch(BUFFER2, 2));
        __CLR4_5_215gu15gulvha7igj.R.inc(53841);assertEquals(0, matcher.isMatch(BUFFER2, 3));
        __CLR4_5_215gu15gulvha7igj.R.inc(53842);assertEquals(1, matcher.isMatch(BUFFER2, 4));
        __CLR4_5_215gu15gulvha7igj.R.inc(53843);assertEquals(0, matcher.isMatch(BUFFER2, 5));
        __CLR4_5_215gu15gulvha7igj.R.inc(53844);assertSame(StrMatcher.noneMatcher(), StrMatcher.charSetMatcher(new char[0]));
        __CLR4_5_215gu15gulvha7igj.R.inc(53845);assertSame(StrMatcher.noneMatcher(), StrMatcher.charSetMatcher((char[]) null));
        __CLR4_5_215gu15gulvha7igj.R.inc(53846);assertTrue(StrMatcher.charSetMatcher("a".toCharArray()) instanceof StrMatcher.CharMatcher);
    }finally{__CLR4_5_215gu15gulvha7igj.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testStringMatcher_String() {__CLR4_5_215gu15gulvha7igj.R.globalSliceStart(getClass().getName(),53847);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2nkunmw15jr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_215gu15gulvha7igj.R.rethrow($CLV_t2$);}finally{__CLR4_5_215gu15gulvha7igj.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrMatcherTest.testStringMatcher_String",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),53847,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2nkunmw15jr(){try{__CLR4_5_215gu15gulvha7igj.R.inc(53847);
        __CLR4_5_215gu15gulvha7igj.R.inc(53848);final StrMatcher matcher = StrMatcher.stringMatcher("bc");
        __CLR4_5_215gu15gulvha7igj.R.inc(53849);assertEquals(0, matcher.isMatch(BUFFER2, 0));
        __CLR4_5_215gu15gulvha7igj.R.inc(53850);assertEquals(2, matcher.isMatch(BUFFER2, 1));
        __CLR4_5_215gu15gulvha7igj.R.inc(53851);assertEquals(0, matcher.isMatch(BUFFER2, 2));
        __CLR4_5_215gu15gulvha7igj.R.inc(53852);assertEquals(0, matcher.isMatch(BUFFER2, 3));
        __CLR4_5_215gu15gulvha7igj.R.inc(53853);assertEquals(0, matcher.isMatch(BUFFER2, 4));
        __CLR4_5_215gu15gulvha7igj.R.inc(53854);assertEquals(0, matcher.isMatch(BUFFER2, 5));
        __CLR4_5_215gu15gulvha7igj.R.inc(53855);assertSame(StrMatcher.noneMatcher(), StrMatcher.stringMatcher(""));
        __CLR4_5_215gu15gulvha7igj.R.inc(53856);assertSame(StrMatcher.noneMatcher(), StrMatcher.stringMatcher(null));
    }finally{__CLR4_5_215gu15gulvha7igj.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testMatcherIndices() {__CLR4_5_215gu15gulvha7igj.R.globalSliceStart(getClass().getName(),53857);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28zzfwy15k1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_215gu15gulvha7igj.R.rethrow($CLV_t2$);}finally{__CLR4_5_215gu15gulvha7igj.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrMatcherTest.testMatcherIndices",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),53857,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28zzfwy15k1(){try{__CLR4_5_215gu15gulvha7igj.R.inc(53857);
        // remember that the API contract is tight for the isMatch() method
        // all the onus is on the caller, so invalid inputs are not
        // the concern of StrMatcher, and are not bugs
        __CLR4_5_215gu15gulvha7igj.R.inc(53858);final StrMatcher matcher = StrMatcher.stringMatcher("bc");
        __CLR4_5_215gu15gulvha7igj.R.inc(53859);assertEquals(2, matcher.isMatch(BUFFER2, 1, 1, BUFFER2.length));
        __CLR4_5_215gu15gulvha7igj.R.inc(53860);assertEquals(2, matcher.isMatch(BUFFER2, 1, 0, 3));
        __CLR4_5_215gu15gulvha7igj.R.inc(53861);assertEquals(0, matcher.isMatch(BUFFER2, 1, 0, 2));
    }finally{__CLR4_5_215gu15gulvha7igj.R.flushNeeded();}}

}
