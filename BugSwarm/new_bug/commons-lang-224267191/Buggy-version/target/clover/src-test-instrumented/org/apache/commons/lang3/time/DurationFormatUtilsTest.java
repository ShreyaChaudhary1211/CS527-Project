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

package org.apache.commons.lang3.time;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.util.Calendar;
import java.util.TimeZone;

import org.junit.Test;

/**
 * TestCase for DurationFormatUtils.
 */
public class DurationFormatUtilsTest {static class __CLR4_5_217sk17sklvha7irm{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172763741L,8589935092L,57112,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    // -----------------------------------------------------------------------
    @Test
    public void testConstructor() {__CLR4_5_217sk17sklvha7irm.R.globalSliceStart(getClass().getName(),56756);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2uefs8h17sk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_217sk17sklvha7irm.R.rethrow($CLV_t2$);}finally{__CLR4_5_217sk17sklvha7irm.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DurationFormatUtilsTest.testConstructor",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),56756,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2uefs8h17sk(){try{__CLR4_5_217sk17sklvha7irm.R.inc(56756);
        __CLR4_5_217sk17sklvha7irm.R.inc(56757);assertNotNull(new DurationFormatUtils());
        __CLR4_5_217sk17sklvha7irm.R.inc(56758);final Constructor<?>[] cons = DurationFormatUtils.class.getDeclaredConstructors();
        __CLR4_5_217sk17sklvha7irm.R.inc(56759);assertEquals(1, cons.length);
        __CLR4_5_217sk17sklvha7irm.R.inc(56760);assertTrue(Modifier.isPublic(cons[0].getModifiers()));
        __CLR4_5_217sk17sklvha7irm.R.inc(56761);assertTrue(Modifier.isPublic(DurationFormatUtils.class.getModifiers()));
        __CLR4_5_217sk17sklvha7irm.R.inc(56762);assertFalse(Modifier.isFinal(DurationFormatUtils.class.getModifiers()));
    }finally{__CLR4_5_217sk17sklvha7irm.R.flushNeeded();}}

    // -----------------------------------------------------------------------
    @Test
    public void testFormatDurationWords() {__CLR4_5_217sk17sklvha7irm.R.globalSliceStart(getClass().getName(),56763);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2olh5d917sr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_217sk17sklvha7irm.R.rethrow($CLV_t2$);}finally{__CLR4_5_217sk17sklvha7irm.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DurationFormatUtilsTest.testFormatDurationWords",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),56763,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2olh5d917sr(){try{__CLR4_5_217sk17sklvha7irm.R.inc(56763);
        __CLR4_5_217sk17sklvha7irm.R.inc(56764);String text = null;

        __CLR4_5_217sk17sklvha7irm.R.inc(56765);text = DurationFormatUtils.formatDurationWords(50 * 1000, true, false);
        __CLR4_5_217sk17sklvha7irm.R.inc(56766);assertEquals("50 seconds", text);
        __CLR4_5_217sk17sklvha7irm.R.inc(56767);text = DurationFormatUtils.formatDurationWords(65 * 1000, true, false);
        __CLR4_5_217sk17sklvha7irm.R.inc(56768);assertEquals("1 minute 5 seconds", text);
        __CLR4_5_217sk17sklvha7irm.R.inc(56769);text = DurationFormatUtils.formatDurationWords(120 * 1000, true, false);
        __CLR4_5_217sk17sklvha7irm.R.inc(56770);assertEquals("2 minutes 0 seconds", text);
        __CLR4_5_217sk17sklvha7irm.R.inc(56771);text = DurationFormatUtils.formatDurationWords(121 * 1000, true, false);
        __CLR4_5_217sk17sklvha7irm.R.inc(56772);assertEquals("2 minutes 1 second", text);
        __CLR4_5_217sk17sklvha7irm.R.inc(56773);text = DurationFormatUtils.formatDurationWords(72 * 60 * 1000, true, false);
        __CLR4_5_217sk17sklvha7irm.R.inc(56774);assertEquals("1 hour 12 minutes 0 seconds", text);
        __CLR4_5_217sk17sklvha7irm.R.inc(56775);text = DurationFormatUtils.formatDurationWords(24 * 60 * 60 * 1000, true, false);
        __CLR4_5_217sk17sklvha7irm.R.inc(56776);assertEquals("1 day 0 hours 0 minutes 0 seconds", text);

        __CLR4_5_217sk17sklvha7irm.R.inc(56777);text = DurationFormatUtils.formatDurationWords(50 * 1000, true, true);
        __CLR4_5_217sk17sklvha7irm.R.inc(56778);assertEquals("50 seconds", text);
        __CLR4_5_217sk17sklvha7irm.R.inc(56779);text = DurationFormatUtils.formatDurationWords(65 * 1000, true, true);
        __CLR4_5_217sk17sklvha7irm.R.inc(56780);assertEquals("1 minute 5 seconds", text);
        __CLR4_5_217sk17sklvha7irm.R.inc(56781);text = DurationFormatUtils.formatDurationWords(120 * 1000, true, true);
        __CLR4_5_217sk17sklvha7irm.R.inc(56782);assertEquals("2 minutes", text);
        __CLR4_5_217sk17sklvha7irm.R.inc(56783);text = DurationFormatUtils.formatDurationWords(121 * 1000, true, true);
        __CLR4_5_217sk17sklvha7irm.R.inc(56784);assertEquals("2 minutes 1 second", text);
        __CLR4_5_217sk17sklvha7irm.R.inc(56785);text = DurationFormatUtils.formatDurationWords(72 * 60 * 1000, true, true);
        __CLR4_5_217sk17sklvha7irm.R.inc(56786);assertEquals("1 hour 12 minutes", text);
        __CLR4_5_217sk17sklvha7irm.R.inc(56787);text = DurationFormatUtils.formatDurationWords(24 * 60 * 60 * 1000, true, true);
        __CLR4_5_217sk17sklvha7irm.R.inc(56788);assertEquals("1 day", text);

        __CLR4_5_217sk17sklvha7irm.R.inc(56789);text = DurationFormatUtils.formatDurationWords(50 * 1000, false, true);
        __CLR4_5_217sk17sklvha7irm.R.inc(56790);assertEquals("0 days 0 hours 0 minutes 50 seconds", text);
        __CLR4_5_217sk17sklvha7irm.R.inc(56791);text = DurationFormatUtils.formatDurationWords(65 * 1000, false, true);
        __CLR4_5_217sk17sklvha7irm.R.inc(56792);assertEquals("0 days 0 hours 1 minute 5 seconds", text);
        __CLR4_5_217sk17sklvha7irm.R.inc(56793);text = DurationFormatUtils.formatDurationWords(120 * 1000, false, true);
        __CLR4_5_217sk17sklvha7irm.R.inc(56794);assertEquals("0 days 0 hours 2 minutes", text);
        __CLR4_5_217sk17sklvha7irm.R.inc(56795);text = DurationFormatUtils.formatDurationWords(121 * 1000, false, true);
        __CLR4_5_217sk17sklvha7irm.R.inc(56796);assertEquals("0 days 0 hours 2 minutes 1 second", text);
        __CLR4_5_217sk17sklvha7irm.R.inc(56797);text = DurationFormatUtils.formatDurationWords(72 * 60 * 1000, false, true);
        __CLR4_5_217sk17sklvha7irm.R.inc(56798);assertEquals("0 days 1 hour 12 minutes", text);
        __CLR4_5_217sk17sklvha7irm.R.inc(56799);text = DurationFormatUtils.formatDurationWords(24 * 60 * 60 * 1000, false, true);
        __CLR4_5_217sk17sklvha7irm.R.inc(56800);assertEquals("1 day", text);

        __CLR4_5_217sk17sklvha7irm.R.inc(56801);text = DurationFormatUtils.formatDurationWords(50 * 1000, false, false);
        __CLR4_5_217sk17sklvha7irm.R.inc(56802);assertEquals("0 days 0 hours 0 minutes 50 seconds", text);
        __CLR4_5_217sk17sklvha7irm.R.inc(56803);text = DurationFormatUtils.formatDurationWords(65 * 1000, false, false);
        __CLR4_5_217sk17sklvha7irm.R.inc(56804);assertEquals("0 days 0 hours 1 minute 5 seconds", text);
        __CLR4_5_217sk17sklvha7irm.R.inc(56805);text = DurationFormatUtils.formatDurationWords(120 * 1000, false, false);
        __CLR4_5_217sk17sklvha7irm.R.inc(56806);assertEquals("0 days 0 hours 2 minutes 0 seconds", text);
        __CLR4_5_217sk17sklvha7irm.R.inc(56807);text = DurationFormatUtils.formatDurationWords(121 * 1000, false, false);
        __CLR4_5_217sk17sklvha7irm.R.inc(56808);assertEquals("0 days 0 hours 2 minutes 1 second", text);
        __CLR4_5_217sk17sklvha7irm.R.inc(56809);text = DurationFormatUtils.formatDurationWords(72 * 60 * 1000, false, false);
        __CLR4_5_217sk17sklvha7irm.R.inc(56810);assertEquals("0 days 1 hour 12 minutes 0 seconds", text);
        __CLR4_5_217sk17sklvha7irm.R.inc(56811);text = DurationFormatUtils.formatDurationWords(24 * 60 * 60 * 1000 + 72 * 60 * 1000, false, false);
        __CLR4_5_217sk17sklvha7irm.R.inc(56812);assertEquals("1 day 1 hour 12 minutes 0 seconds", text);
        __CLR4_5_217sk17sklvha7irm.R.inc(56813);text = DurationFormatUtils.formatDurationWords(2 * 24 * 60 * 60 * 1000 + 72 * 60 * 1000, false, false);
        __CLR4_5_217sk17sklvha7irm.R.inc(56814);assertEquals("2 days 1 hour 12 minutes 0 seconds", text);
        __CLR4_5_217sk17sklvha7irm.R.inc(56815);for (int i = 2; (((i < 31)&&(__CLR4_5_217sk17sklvha7irm.R.iget(56816)!=0|true))||(__CLR4_5_217sk17sklvha7irm.R.iget(56817)==0&false)); i++) {{
            __CLR4_5_217sk17sklvha7irm.R.inc(56818);text = DurationFormatUtils.formatDurationWords(i * 24 * 60 * 60 * 1000L, false, false);
            __CLR4_5_217sk17sklvha7irm.R.inc(56819);assertEquals(i + " days 0 hours 0 minutes 0 seconds", text);
        }
    }}finally{__CLR4_5_217sk17sklvha7irm.R.flushNeeded();}}

    /**
     * Tests that "1 &lt;unit&gt;s" gets converted to "1 &lt;unit&gt;" but that "11 &lt;unit&gt;s" is left alone.
     */
    @Test
    public void testFormatDurationPluralWords() {__CLR4_5_217sk17sklvha7irm.R.globalSliceStart(getClass().getName(),56820);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2yg8j3j17uc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_217sk17sklvha7irm.R.rethrow($CLV_t2$);}finally{__CLR4_5_217sk17sklvha7irm.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DurationFormatUtilsTest.testFormatDurationPluralWords",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),56820,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2yg8j3j17uc(){try{__CLR4_5_217sk17sklvha7irm.R.inc(56820);
        __CLR4_5_217sk17sklvha7irm.R.inc(56821);final long oneSecond = 1000;
        __CLR4_5_217sk17sklvha7irm.R.inc(56822);final long oneMinute = oneSecond * 60;
        __CLR4_5_217sk17sklvha7irm.R.inc(56823);final long oneHour = oneMinute * 60;
        __CLR4_5_217sk17sklvha7irm.R.inc(56824);final long oneDay = oneHour * 24;
        __CLR4_5_217sk17sklvha7irm.R.inc(56825);String text = null;

        __CLR4_5_217sk17sklvha7irm.R.inc(56826);text = DurationFormatUtils.formatDurationWords(oneSecond, false, false);
        __CLR4_5_217sk17sklvha7irm.R.inc(56827);assertEquals("0 days 0 hours 0 minutes 1 second", text);
        __CLR4_5_217sk17sklvha7irm.R.inc(56828);text = DurationFormatUtils.formatDurationWords(oneSecond * 2, false, false);
        __CLR4_5_217sk17sklvha7irm.R.inc(56829);assertEquals("0 days 0 hours 0 minutes 2 seconds", text);
        __CLR4_5_217sk17sklvha7irm.R.inc(56830);text = DurationFormatUtils.formatDurationWords(oneSecond * 11, false, false);
        __CLR4_5_217sk17sklvha7irm.R.inc(56831);assertEquals("0 days 0 hours 0 minutes 11 seconds", text);

        __CLR4_5_217sk17sklvha7irm.R.inc(56832);text = DurationFormatUtils.formatDurationWords(oneMinute, false, false);
        __CLR4_5_217sk17sklvha7irm.R.inc(56833);assertEquals("0 days 0 hours 1 minute 0 seconds", text);
        __CLR4_5_217sk17sklvha7irm.R.inc(56834);text = DurationFormatUtils.formatDurationWords(oneMinute * 2, false, false);
        __CLR4_5_217sk17sklvha7irm.R.inc(56835);assertEquals("0 days 0 hours 2 minutes 0 seconds", text);
        __CLR4_5_217sk17sklvha7irm.R.inc(56836);text = DurationFormatUtils.formatDurationWords(oneMinute * 11, false, false);
        __CLR4_5_217sk17sklvha7irm.R.inc(56837);assertEquals("0 days 0 hours 11 minutes 0 seconds", text);
        __CLR4_5_217sk17sklvha7irm.R.inc(56838);text = DurationFormatUtils.formatDurationWords(oneMinute + oneSecond, false, false);
        __CLR4_5_217sk17sklvha7irm.R.inc(56839);assertEquals("0 days 0 hours 1 minute 1 second", text);

        __CLR4_5_217sk17sklvha7irm.R.inc(56840);text = DurationFormatUtils.formatDurationWords(oneHour, false, false);
        __CLR4_5_217sk17sklvha7irm.R.inc(56841);assertEquals("0 days 1 hour 0 minutes 0 seconds", text);
        __CLR4_5_217sk17sklvha7irm.R.inc(56842);text = DurationFormatUtils.formatDurationWords(oneHour * 2, false, false);
        __CLR4_5_217sk17sklvha7irm.R.inc(56843);assertEquals("0 days 2 hours 0 minutes 0 seconds", text);
        __CLR4_5_217sk17sklvha7irm.R.inc(56844);text = DurationFormatUtils.formatDurationWords(oneHour * 11, false, false);
        __CLR4_5_217sk17sklvha7irm.R.inc(56845);assertEquals("0 days 11 hours 0 minutes 0 seconds", text);
        __CLR4_5_217sk17sklvha7irm.R.inc(56846);text = DurationFormatUtils.formatDurationWords(oneHour + oneMinute + oneSecond, false, false);
        __CLR4_5_217sk17sklvha7irm.R.inc(56847);assertEquals("0 days 1 hour 1 minute 1 second", text);

        __CLR4_5_217sk17sklvha7irm.R.inc(56848);text = DurationFormatUtils.formatDurationWords(oneDay, false, false);
        __CLR4_5_217sk17sklvha7irm.R.inc(56849);assertEquals("1 day 0 hours 0 minutes 0 seconds", text);
        __CLR4_5_217sk17sklvha7irm.R.inc(56850);text = DurationFormatUtils.formatDurationWords(oneDay * 2, false, false);
        __CLR4_5_217sk17sklvha7irm.R.inc(56851);assertEquals("2 days 0 hours 0 minutes 0 seconds", text);
        __CLR4_5_217sk17sklvha7irm.R.inc(56852);text = DurationFormatUtils.formatDurationWords(oneDay * 11, false, false);
        __CLR4_5_217sk17sklvha7irm.R.inc(56853);assertEquals("11 days 0 hours 0 minutes 0 seconds", text);
        __CLR4_5_217sk17sklvha7irm.R.inc(56854);text = DurationFormatUtils.formatDurationWords(oneDay + oneHour + oneMinute + oneSecond, false, false);
        __CLR4_5_217sk17sklvha7irm.R.inc(56855);assertEquals("1 day 1 hour 1 minute 1 second", text);
    }finally{__CLR4_5_217sk17sklvha7irm.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class)
    public void testFormatNegativeDurationWords() throws Exception {__CLR4_5_217sk17sklvha7irm.R.globalSliceStart(getClass().getName(),56856);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2khywvy17vc();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,70,111,114,109,97,116,78,101,103,97,116,105,118,101,68,117,114,97,116,105,111,110,87,111,114,100,115,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_217sk17sklvha7irm.R.rethrow($CLV_t2$);}finally{__CLR4_5_217sk17sklvha7irm.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DurationFormatUtilsTest.testFormatNegativeDurationWords",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),56856,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2khywvy17vc() throws Exception{try{__CLR4_5_217sk17sklvha7irm.R.inc(56856);
        __CLR4_5_217sk17sklvha7irm.R.inc(56857);DurationFormatUtils.formatDurationWords(-5000, true, true);
    }finally{__CLR4_5_217sk17sklvha7irm.R.flushNeeded();}}

    @Test
    public void testFormatDurationHMS() {__CLR4_5_217sk17sklvha7irm.R.globalSliceStart(getClass().getName(),56858);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_29t123s17ve();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_217sk17sklvha7irm.R.rethrow($CLV_t2$);}finally{__CLR4_5_217sk17sklvha7irm.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DurationFormatUtilsTest.testFormatDurationHMS",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),56858,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_29t123s17ve(){try{__CLR4_5_217sk17sklvha7irm.R.inc(56858);
        __CLR4_5_217sk17sklvha7irm.R.inc(56859);long time = 0;
        __CLR4_5_217sk17sklvha7irm.R.inc(56860);assertEquals("00:00:00.000", DurationFormatUtils.formatDurationHMS(time));

        __CLR4_5_217sk17sklvha7irm.R.inc(56861);time = 1;
        __CLR4_5_217sk17sklvha7irm.R.inc(56862);assertEquals("00:00:00.001", DurationFormatUtils.formatDurationHMS(time));

        __CLR4_5_217sk17sklvha7irm.R.inc(56863);time = 15;
        __CLR4_5_217sk17sklvha7irm.R.inc(56864);assertEquals("00:00:00.015", DurationFormatUtils.formatDurationHMS(time));

        __CLR4_5_217sk17sklvha7irm.R.inc(56865);time = 165;
        __CLR4_5_217sk17sklvha7irm.R.inc(56866);assertEquals("00:00:00.165", DurationFormatUtils.formatDurationHMS(time));

        __CLR4_5_217sk17sklvha7irm.R.inc(56867);time = 1675;
        __CLR4_5_217sk17sklvha7irm.R.inc(56868);assertEquals("00:00:01.675", DurationFormatUtils.formatDurationHMS(time));

        __CLR4_5_217sk17sklvha7irm.R.inc(56869);time = 13465;
        __CLR4_5_217sk17sklvha7irm.R.inc(56870);assertEquals("00:00:13.465", DurationFormatUtils.formatDurationHMS(time));

        __CLR4_5_217sk17sklvha7irm.R.inc(56871);time = 72789;
        __CLR4_5_217sk17sklvha7irm.R.inc(56872);assertEquals("00:01:12.789", DurationFormatUtils.formatDurationHMS(time));

        __CLR4_5_217sk17sklvha7irm.R.inc(56873);time = 12789 + 32 * 60000;
        __CLR4_5_217sk17sklvha7irm.R.inc(56874);assertEquals("00:32:12.789", DurationFormatUtils.formatDurationHMS(time));

        __CLR4_5_217sk17sklvha7irm.R.inc(56875);time = 12789 + 62 * 60000;
        __CLR4_5_217sk17sklvha7irm.R.inc(56876);assertEquals("01:02:12.789", DurationFormatUtils.formatDurationHMS(time));
    }finally{__CLR4_5_217sk17sklvha7irm.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class)
    public void testFormatNegativeDurationHMS() throws Exception {__CLR4_5_217sk17sklvha7irm.R.globalSliceStart(getClass().getName(),56877);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22id7wj17vx();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,70,111,114,109,97,116,78,101,103,97,116,105,118,101,68,117,114,97,116,105,111,110,72,77,83,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_217sk17sklvha7irm.R.rethrow($CLV_t2$);}finally{__CLR4_5_217sk17sklvha7irm.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DurationFormatUtilsTest.testFormatNegativeDurationHMS",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),56877,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22id7wj17vx() throws Exception{try{__CLR4_5_217sk17sklvha7irm.R.inc(56877);
        __CLR4_5_217sk17sklvha7irm.R.inc(56878);DurationFormatUtils.formatDurationHMS(-5000);
    }finally{__CLR4_5_217sk17sklvha7irm.R.flushNeeded();}}

    @Test
    public void testFormatDurationISO() {__CLR4_5_217sk17sklvha7irm.R.globalSliceStart(getClass().getName(),56879);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2bb1p6717vz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_217sk17sklvha7irm.R.rethrow($CLV_t2$);}finally{__CLR4_5_217sk17sklvha7irm.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DurationFormatUtilsTest.testFormatDurationISO",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),56879,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2bb1p6717vz(){try{__CLR4_5_217sk17sklvha7irm.R.inc(56879);
        __CLR4_5_217sk17sklvha7irm.R.inc(56880);assertEquals("P0Y0M0DT0H0M0.000S", DurationFormatUtils.formatDurationISO(0L));
        __CLR4_5_217sk17sklvha7irm.R.inc(56881);assertEquals("P0Y0M0DT0H0M0.001S", DurationFormatUtils.formatDurationISO(1L));
        __CLR4_5_217sk17sklvha7irm.R.inc(56882);assertEquals("P0Y0M0DT0H0M0.010S", DurationFormatUtils.formatDurationISO(10L));
        __CLR4_5_217sk17sklvha7irm.R.inc(56883);assertEquals("P0Y0M0DT0H0M0.100S", DurationFormatUtils.formatDurationISO(100L));
        __CLR4_5_217sk17sklvha7irm.R.inc(56884);assertEquals("P0Y0M0DT0H1M15.321S", DurationFormatUtils.formatDurationISO(75321L));
    }finally{__CLR4_5_217sk17sklvha7irm.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class)
    public void testFormatNegativeDurationISO() throws Exception {__CLR4_5_217sk17sklvha7irm.R.globalSliceStart(getClass().getName(),56885);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2nmfz6i17w5();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,70,111,114,109,97,116,78,101,103,97,116,105,118,101,68,117,114,97,116,105,111,110,73,83,79,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_217sk17sklvha7irm.R.rethrow($CLV_t2$);}finally{__CLR4_5_217sk17sklvha7irm.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DurationFormatUtilsTest.testFormatNegativeDurationISO",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),56885,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2nmfz6i17w5() throws Exception{try{__CLR4_5_217sk17sklvha7irm.R.inc(56885);
        __CLR4_5_217sk17sklvha7irm.R.inc(56886);DurationFormatUtils.formatDurationISO(-5000);
    }finally{__CLR4_5_217sk17sklvha7irm.R.flushNeeded();}}

    @Test
    public void testFormatDuration() {__CLR4_5_217sk17sklvha7irm.R.globalSliceStart(getClass().getName(),56887);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2dunrlw17w7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_217sk17sklvha7irm.R.rethrow($CLV_t2$);}finally{__CLR4_5_217sk17sklvha7irm.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DurationFormatUtilsTest.testFormatDuration",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),56887,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2dunrlw17w7(){try{__CLR4_5_217sk17sklvha7irm.R.inc(56887);
        __CLR4_5_217sk17sklvha7irm.R.inc(56888);long duration = 0;
        __CLR4_5_217sk17sklvha7irm.R.inc(56889);assertEquals("0", DurationFormatUtils.formatDuration(duration, "y"));
        __CLR4_5_217sk17sklvha7irm.R.inc(56890);assertEquals("0", DurationFormatUtils.formatDuration(duration, "M"));
        __CLR4_5_217sk17sklvha7irm.R.inc(56891);assertEquals("0", DurationFormatUtils.formatDuration(duration, "d"));
        __CLR4_5_217sk17sklvha7irm.R.inc(56892);assertEquals("0", DurationFormatUtils.formatDuration(duration, "H"));
        __CLR4_5_217sk17sklvha7irm.R.inc(56893);assertEquals("0", DurationFormatUtils.formatDuration(duration, "m"));
        __CLR4_5_217sk17sklvha7irm.R.inc(56894);assertEquals("0", DurationFormatUtils.formatDuration(duration, "s"));
        __CLR4_5_217sk17sklvha7irm.R.inc(56895);assertEquals("0", DurationFormatUtils.formatDuration(duration, "S"));
        __CLR4_5_217sk17sklvha7irm.R.inc(56896);assertEquals("0000", DurationFormatUtils.formatDuration(duration, "SSSS"));
        __CLR4_5_217sk17sklvha7irm.R.inc(56897);assertEquals("0000", DurationFormatUtils.formatDuration(duration, "yyyy"));
        __CLR4_5_217sk17sklvha7irm.R.inc(56898);assertEquals("0000", DurationFormatUtils.formatDuration(duration, "yyMM"));

        __CLR4_5_217sk17sklvha7irm.R.inc(56899);duration = 60 * 1000;
        __CLR4_5_217sk17sklvha7irm.R.inc(56900);assertEquals("0", DurationFormatUtils.formatDuration(duration, "y"));
        __CLR4_5_217sk17sklvha7irm.R.inc(56901);assertEquals("0", DurationFormatUtils.formatDuration(duration, "M"));
        __CLR4_5_217sk17sklvha7irm.R.inc(56902);assertEquals("0", DurationFormatUtils.formatDuration(duration, "d"));
        __CLR4_5_217sk17sklvha7irm.R.inc(56903);assertEquals("0", DurationFormatUtils.formatDuration(duration, "H"));
        __CLR4_5_217sk17sklvha7irm.R.inc(56904);assertEquals("1", DurationFormatUtils.formatDuration(duration, "m"));
        __CLR4_5_217sk17sklvha7irm.R.inc(56905);assertEquals("60", DurationFormatUtils.formatDuration(duration, "s"));
        __CLR4_5_217sk17sklvha7irm.R.inc(56906);assertEquals("60000", DurationFormatUtils.formatDuration(duration, "S"));
        __CLR4_5_217sk17sklvha7irm.R.inc(56907);assertEquals("01:00", DurationFormatUtils.formatDuration(duration, "mm:ss"));

        __CLR4_5_217sk17sklvha7irm.R.inc(56908);final Calendar base = Calendar.getInstance();
        __CLR4_5_217sk17sklvha7irm.R.inc(56909);base.set(2000, Calendar.JANUARY, 1, 0, 0, 0);
        __CLR4_5_217sk17sklvha7irm.R.inc(56910);base.set(Calendar.MILLISECOND, 0);

        __CLR4_5_217sk17sklvha7irm.R.inc(56911);final Calendar cal = Calendar.getInstance();
        __CLR4_5_217sk17sklvha7irm.R.inc(56912);cal.set(2003, Calendar.FEBRUARY, 1, 0, 0, 0);
        __CLR4_5_217sk17sklvha7irm.R.inc(56913);cal.set(Calendar.MILLISECOND, 0);
        __CLR4_5_217sk17sklvha7irm.R.inc(56914);duration = cal.getTime().getTime() - base.getTime().getTime(); // duration from 2000-01-01 to cal
        // don't use 1970 in test as time zones were less reliable in 1970 than now
        // remember that duration formatting ignores time zones, working on strict hour lengths
        __CLR4_5_217sk17sklvha7irm.R.inc(56915);final int days = 366 + 365 + 365 + 31;
        __CLR4_5_217sk17sklvha7irm.R.inc(56916);assertEquals("0 0 " + days, DurationFormatUtils.formatDuration(duration, "y M d"));
    }finally{__CLR4_5_217sk17sklvha7irm.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class)
    public void testFormatNegativeDuration() throws Exception {__CLR4_5_217sk17sklvha7irm.R.globalSliceStart(getClass().getName(),56917);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ja1a9l17x1();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,70,111,114,109,97,116,78,101,103,97,116,105,118,101,68,117,114,97,116,105,111,110,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_217sk17sklvha7irm.R.rethrow($CLV_t2$);}finally{__CLR4_5_217sk17sklvha7irm.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DurationFormatUtilsTest.testFormatNegativeDuration",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),56917,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ja1a9l17x1() throws Exception{try{__CLR4_5_217sk17sklvha7irm.R.inc(56917);
        __CLR4_5_217sk17sklvha7irm.R.inc(56918);DurationFormatUtils.formatDuration(-5000, "S", true);
    }finally{__CLR4_5_217sk17sklvha7irm.R.flushNeeded();}}

    @SuppressWarnings("deprecation")
    @Test
    public void testFormatPeriodISO() {__CLR4_5_217sk17sklvha7irm.R.globalSliceStart(getClass().getName(),56919);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26fsqwu17x3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_217sk17sklvha7irm.R.rethrow($CLV_t2$);}finally{__CLR4_5_217sk17sklvha7irm.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DurationFormatUtilsTest.testFormatPeriodISO",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),56919,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26fsqwu17x3(){try{__CLR4_5_217sk17sklvha7irm.R.inc(56919);
        __CLR4_5_217sk17sklvha7irm.R.inc(56920);final TimeZone timeZone = TimeZone.getTimeZone("GMT-3");
        __CLR4_5_217sk17sklvha7irm.R.inc(56921);final Calendar base = Calendar.getInstance(timeZone);
        __CLR4_5_217sk17sklvha7irm.R.inc(56922);base.set(1970, Calendar.JANUARY, 1, 0, 0, 0);
        __CLR4_5_217sk17sklvha7irm.R.inc(56923);base.set(Calendar.MILLISECOND, 0);

        __CLR4_5_217sk17sklvha7irm.R.inc(56924);final Calendar cal = Calendar.getInstance(timeZone);
        __CLR4_5_217sk17sklvha7irm.R.inc(56925);cal.set(2002, Calendar.FEBRUARY, 23, 9, 11, 12);
        __CLR4_5_217sk17sklvha7irm.R.inc(56926);cal.set(Calendar.MILLISECOND, 1);
        __CLR4_5_217sk17sklvha7irm.R.inc(56927);String text;
        // repeat a test from testDateTimeISO to compare extended and not extended.
        __CLR4_5_217sk17sklvha7irm.R.inc(56928);text = DateFormatUtils.format(cal, DateFormatUtils.ISO_DATETIME_TIME_ZONE_FORMAT.getPattern(), timeZone);
        __CLR4_5_217sk17sklvha7irm.R.inc(56929);assertEquals("2002-02-23T09:11:12-03:00", text);
        // test fixture is the same as above, but now with extended format.
        __CLR4_5_217sk17sklvha7irm.R.inc(56930);text = DurationFormatUtils.formatPeriod(base.getTime().getTime(), cal.getTime().getTime(),
                DurationFormatUtils.ISO_EXTENDED_FORMAT_PATTERN, false, timeZone);
        __CLR4_5_217sk17sklvha7irm.R.inc(56931);assertEquals("P32Y1M22DT9H11M12.001S", text);
        // test fixture from example in http://www.w3.org/TR/xmlschema-2/#duration
        __CLR4_5_217sk17sklvha7irm.R.inc(56932);cal.set(1971, Calendar.FEBRUARY, 3, 10, 30, 0);
        __CLR4_5_217sk17sklvha7irm.R.inc(56933);cal.set(Calendar.MILLISECOND, 0);
        __CLR4_5_217sk17sklvha7irm.R.inc(56934);text = DurationFormatUtils.formatPeriod(base.getTime().getTime(), cal.getTime().getTime(),
                DurationFormatUtils.ISO_EXTENDED_FORMAT_PATTERN, false, timeZone);
        __CLR4_5_217sk17sklvha7irm.R.inc(56935);assertEquals("P1Y1M2DT10H30M0.000S", text);
        // want a way to say 'don't print the seconds in format()' or other fields for that matter:
        // assertEquals("P1Y2M3DT10H30M", text);
    }finally{__CLR4_5_217sk17sklvha7irm.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class)
    public void testFormatPeriodISOStartGreaterEnd() throws Exception {__CLR4_5_217sk17sklvha7irm.R.globalSliceStart(getClass().getName(),56936);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2436wrz17xk();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,70,111,114,109,97,116,80,101,114,105,111,100,73,83,79,83,116,97,114,116,71,114,101,97,116,101,114,69,110,100,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_217sk17sklvha7irm.R.rethrow($CLV_t2$);}finally{__CLR4_5_217sk17sklvha7irm.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DurationFormatUtilsTest.testFormatPeriodISOStartGreaterEnd",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),56936,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2436wrz17xk() throws Exception{try{__CLR4_5_217sk17sklvha7irm.R.inc(56936);
        __CLR4_5_217sk17sklvha7irm.R.inc(56937);DurationFormatUtils.formatPeriodISO(5000, 2000);
    }finally{__CLR4_5_217sk17sklvha7irm.R.flushNeeded();}}

    @Test
    public void testFormatPeriodISOMethod() {__CLR4_5_217sk17sklvha7irm.R.globalSliceStart(getClass().getName(),56938);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2aycqe517xm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_217sk17sklvha7irm.R.rethrow($CLV_t2$);}finally{__CLR4_5_217sk17sklvha7irm.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DurationFormatUtilsTest.testFormatPeriodISOMethod",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),56938,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2aycqe517xm(){try{__CLR4_5_217sk17sklvha7irm.R.inc(56938);
        __CLR4_5_217sk17sklvha7irm.R.inc(56939);assertEquals("P0Y0M0DT0H0M0.000S", DurationFormatUtils.formatPeriodISO(0L, 0L));
        __CLR4_5_217sk17sklvha7irm.R.inc(56940);assertEquals("P0Y0M0DT0H0M1.000S", DurationFormatUtils.formatPeriodISO(0L, 1000L));
        __CLR4_5_217sk17sklvha7irm.R.inc(56941);assertEquals("P0Y0M0DT0H1M1.000S", DurationFormatUtils.formatPeriodISO(0L, 61000L));
    }finally{__CLR4_5_217sk17sklvha7irm.R.flushNeeded();}}

    @Test
    public void testFormatPeriod() {__CLR4_5_217sk17sklvha7irm.R.globalSliceStart(getClass().getName(),56942);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27dc7dd17xq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_217sk17sklvha7irm.R.rethrow($CLV_t2$);}finally{__CLR4_5_217sk17sklvha7irm.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DurationFormatUtilsTest.testFormatPeriod",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),56942,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27dc7dd17xq(){try{__CLR4_5_217sk17sklvha7irm.R.inc(56942);
        __CLR4_5_217sk17sklvha7irm.R.inc(56943);final Calendar cal1970 = Calendar.getInstance();
        __CLR4_5_217sk17sklvha7irm.R.inc(56944);cal1970.set(1970, Calendar.JANUARY, 1, 0, 0, 0);
        __CLR4_5_217sk17sklvha7irm.R.inc(56945);cal1970.set(Calendar.MILLISECOND, 0);
        __CLR4_5_217sk17sklvha7irm.R.inc(56946);final long time1970 = cal1970.getTime().getTime();

        __CLR4_5_217sk17sklvha7irm.R.inc(56947);assertEquals("0", DurationFormatUtils.formatPeriod(time1970, time1970, "y"));
        __CLR4_5_217sk17sklvha7irm.R.inc(56948);assertEquals("0", DurationFormatUtils.formatPeriod(time1970, time1970, "M"));
        __CLR4_5_217sk17sklvha7irm.R.inc(56949);assertEquals("0", DurationFormatUtils.formatPeriod(time1970, time1970, "d"));
        __CLR4_5_217sk17sklvha7irm.R.inc(56950);assertEquals("0", DurationFormatUtils.formatPeriod(time1970, time1970, "H"));
        __CLR4_5_217sk17sklvha7irm.R.inc(56951);assertEquals("0", DurationFormatUtils.formatPeriod(time1970, time1970, "m"));
        __CLR4_5_217sk17sklvha7irm.R.inc(56952);assertEquals("0", DurationFormatUtils.formatPeriod(time1970, time1970, "s"));
        __CLR4_5_217sk17sklvha7irm.R.inc(56953);assertEquals("0", DurationFormatUtils.formatPeriod(time1970, time1970, "S"));
        __CLR4_5_217sk17sklvha7irm.R.inc(56954);assertEquals("0000", DurationFormatUtils.formatPeriod(time1970, time1970, "SSSS"));
        __CLR4_5_217sk17sklvha7irm.R.inc(56955);assertEquals("0000", DurationFormatUtils.formatPeriod(time1970, time1970, "yyyy"));
        __CLR4_5_217sk17sklvha7irm.R.inc(56956);assertEquals("0000", DurationFormatUtils.formatPeriod(time1970, time1970, "yyMM"));

        __CLR4_5_217sk17sklvha7irm.R.inc(56957);long time = time1970 + 60 * 1000;
        __CLR4_5_217sk17sklvha7irm.R.inc(56958);assertEquals("0", DurationFormatUtils.formatPeriod(time1970, time, "y"));
        __CLR4_5_217sk17sklvha7irm.R.inc(56959);assertEquals("0", DurationFormatUtils.formatPeriod(time1970, time, "M"));
        __CLR4_5_217sk17sklvha7irm.R.inc(56960);assertEquals("0", DurationFormatUtils.formatPeriod(time1970, time, "d"));
        __CLR4_5_217sk17sklvha7irm.R.inc(56961);assertEquals("0", DurationFormatUtils.formatPeriod(time1970, time, "H"));
        __CLR4_5_217sk17sklvha7irm.R.inc(56962);assertEquals("1", DurationFormatUtils.formatPeriod(time1970, time, "m"));
        __CLR4_5_217sk17sklvha7irm.R.inc(56963);assertEquals("60", DurationFormatUtils.formatPeriod(time1970, time, "s"));
        __CLR4_5_217sk17sklvha7irm.R.inc(56964);assertEquals("60000", DurationFormatUtils.formatPeriod(time1970, time, "S"));
        __CLR4_5_217sk17sklvha7irm.R.inc(56965);assertEquals("01:00", DurationFormatUtils.formatPeriod(time1970, time, "mm:ss"));

        __CLR4_5_217sk17sklvha7irm.R.inc(56966);final Calendar cal = Calendar.getInstance();
        __CLR4_5_217sk17sklvha7irm.R.inc(56967);cal.set(1973, Calendar.JULY, 1, 0, 0, 0);
        __CLR4_5_217sk17sklvha7irm.R.inc(56968);cal.set(Calendar.MILLISECOND, 0);
        __CLR4_5_217sk17sklvha7irm.R.inc(56969);time = cal.getTime().getTime();
        __CLR4_5_217sk17sklvha7irm.R.inc(56970);assertEquals("36", DurationFormatUtils.formatPeriod(time1970, time, "yM"));
        __CLR4_5_217sk17sklvha7irm.R.inc(56971);assertEquals("3 years 6 months", DurationFormatUtils.formatPeriod(time1970, time, "y' years 'M' months'"));
        __CLR4_5_217sk17sklvha7irm.R.inc(56972);assertEquals("03/06", DurationFormatUtils.formatPeriod(time1970, time, "yy/MM"));

        __CLR4_5_217sk17sklvha7irm.R.inc(56973);cal.set(1973, Calendar.NOVEMBER, 1, 0, 0, 0);
        __CLR4_5_217sk17sklvha7irm.R.inc(56974);cal.set(Calendar.MILLISECOND, 0);
        __CLR4_5_217sk17sklvha7irm.R.inc(56975);time = cal.getTime().getTime();
        __CLR4_5_217sk17sklvha7irm.R.inc(56976);assertEquals("310", DurationFormatUtils.formatPeriod(time1970, time, "yM"));
        __CLR4_5_217sk17sklvha7irm.R.inc(56977);assertEquals("3 years 10 months", DurationFormatUtils.formatPeriod(time1970, time, "y' years 'M' months'"));
        __CLR4_5_217sk17sklvha7irm.R.inc(56978);assertEquals("03/10", DurationFormatUtils.formatPeriod(time1970, time, "yy/MM"));

        __CLR4_5_217sk17sklvha7irm.R.inc(56979);cal.set(1974, Calendar.JANUARY, 1, 0, 0, 0);
        __CLR4_5_217sk17sklvha7irm.R.inc(56980);cal.set(Calendar.MILLISECOND, 0);
        __CLR4_5_217sk17sklvha7irm.R.inc(56981);time = cal.getTime().getTime();
        __CLR4_5_217sk17sklvha7irm.R.inc(56982);assertEquals("40", DurationFormatUtils.formatPeriod(time1970, time, "yM"));
        __CLR4_5_217sk17sklvha7irm.R.inc(56983);assertEquals("4 years 0 months", DurationFormatUtils.formatPeriod(time1970, time, "y' years 'M' months'"));
        __CLR4_5_217sk17sklvha7irm.R.inc(56984);assertEquals("04/00", DurationFormatUtils.formatPeriod(time1970, time, "yy/MM"));
        __CLR4_5_217sk17sklvha7irm.R.inc(56985);assertEquals("48", DurationFormatUtils.formatPeriod(time1970, time, "M"));
        __CLR4_5_217sk17sklvha7irm.R.inc(56986);assertEquals("48", DurationFormatUtils.formatPeriod(time1970, time, "MM"));
        __CLR4_5_217sk17sklvha7irm.R.inc(56987);assertEquals("048", DurationFormatUtils.formatPeriod(time1970, time, "MMM"));
    }finally{__CLR4_5_217sk17sklvha7irm.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class)
    public void testFormatPeriodeStartGreaterEnd() throws Exception {__CLR4_5_217sk17sklvha7irm.R.globalSliceStart(getClass().getName(),56988);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gu6qs117z0();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,70,111,114,109,97,116,80,101,114,105,111,100,101,83,116,97,114,116,71,114,101,97,116,101,114,69,110,100,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_217sk17sklvha7irm.R.rethrow($CLV_t2$);}finally{__CLR4_5_217sk17sklvha7irm.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DurationFormatUtilsTest.testFormatPeriodeStartGreaterEnd",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),56988,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gu6qs117z0() throws Exception{try{__CLR4_5_217sk17sklvha7irm.R.inc(56988);
        __CLR4_5_217sk17sklvha7irm.R.inc(56989);DurationFormatUtils.formatPeriod(5000, 2500, "yy/MM");
    }finally{__CLR4_5_217sk17sklvha7irm.R.flushNeeded();}}

    @Test
    public void testLexx() {__CLR4_5_217sk17sklvha7irm.R.globalSliceStart(getClass().getName(),56990);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2f6760e17z2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_217sk17sklvha7irm.R.rethrow($CLV_t2$);}finally{__CLR4_5_217sk17sklvha7irm.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DurationFormatUtilsTest.testLexx",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),56990,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2f6760e17z2(){try{__CLR4_5_217sk17sklvha7irm.R.inc(56990);
        // tests each constant
        __CLR4_5_217sk17sklvha7irm.R.inc(56991);assertArrayEquals(new DurationFormatUtils.Token[]{
            new DurationFormatUtils.Token(DurationFormatUtils.y, 1),
            new DurationFormatUtils.Token(DurationFormatUtils.M, 1),
            new DurationFormatUtils.Token(DurationFormatUtils.d, 1),
            new DurationFormatUtils.Token(DurationFormatUtils.H, 1),
            new DurationFormatUtils.Token(DurationFormatUtils.m, 1),
            new DurationFormatUtils.Token(DurationFormatUtils.s, 1),
            new DurationFormatUtils.Token(DurationFormatUtils.S, 1)}, DurationFormatUtils.lexx("yMdHmsS"));

        // tests the ISO 8601-like
        __CLR4_5_217sk17sklvha7irm.R.inc(56992);assertArrayEquals(new DurationFormatUtils.Token[]{
            new DurationFormatUtils.Token(DurationFormatUtils.H, 2),
            new DurationFormatUtils.Token(new StringBuilder(":"), 1),
            new DurationFormatUtils.Token(DurationFormatUtils.m, 2),
            new DurationFormatUtils.Token(new StringBuilder(":"), 1),
            new DurationFormatUtils.Token(DurationFormatUtils.s, 2),
            new DurationFormatUtils.Token(new StringBuilder("."), 1),
            new DurationFormatUtils.Token(DurationFormatUtils.S, 3)}, DurationFormatUtils.lexx("HH:mm:ss.SSS"));

        // test the iso extended format
        __CLR4_5_217sk17sklvha7irm.R.inc(56993);assertArrayEquals(new DurationFormatUtils.Token[]{
            new DurationFormatUtils.Token(new StringBuilder("P"), 1),
            new DurationFormatUtils.Token(DurationFormatUtils.y, 4),
            new DurationFormatUtils.Token(new StringBuilder("Y"), 1),
            new DurationFormatUtils.Token(DurationFormatUtils.M, 1),
            new DurationFormatUtils.Token(new StringBuilder("M"), 1),
            new DurationFormatUtils.Token(DurationFormatUtils.d, 1),
            new DurationFormatUtils.Token(new StringBuilder("DT"), 1),
            new DurationFormatUtils.Token(DurationFormatUtils.H, 1),
            new DurationFormatUtils.Token(new StringBuilder("H"), 1),
            new DurationFormatUtils.Token(DurationFormatUtils.m, 1),
            new DurationFormatUtils.Token(new StringBuilder("M"), 1),
            new DurationFormatUtils.Token(DurationFormatUtils.s, 1),
            new DurationFormatUtils.Token(new StringBuilder("."), 1),
            new DurationFormatUtils.Token(DurationFormatUtils.S, 3),
            new DurationFormatUtils.Token(new StringBuilder("S"), 1)}, DurationFormatUtils
                .lexx(DurationFormatUtils.ISO_EXTENDED_FORMAT_PATTERN));

        // test failures in equals
        __CLR4_5_217sk17sklvha7irm.R.inc(56994);final DurationFormatUtils.Token token = new DurationFormatUtils.Token(DurationFormatUtils.y, 4);
        __CLR4_5_217sk17sklvha7irm.R.inc(56995);assertFalse("Token equal to non-Token class. ", token.equals(new Object()));
        __CLR4_5_217sk17sklvha7irm.R.inc(56996);assertFalse("Token equal to Token with wrong value class. ", token.equals(new DurationFormatUtils.Token(
                new Object())));
        __CLR4_5_217sk17sklvha7irm.R.inc(56997);assertFalse("Token equal to Token with different count. ", token.equals(new DurationFormatUtils.Token(
                DurationFormatUtils.y, 1)));
        __CLR4_5_217sk17sklvha7irm.R.inc(56998);final DurationFormatUtils.Token numToken = new DurationFormatUtils.Token(Integer.valueOf(1), 4);
        __CLR4_5_217sk17sklvha7irm.R.inc(56999);assertTrue("Token with Number value not equal to itself. ", numToken.equals(numToken));
    }finally{__CLR4_5_217sk17sklvha7irm.R.flushNeeded();}}


    // http://issues.apache.org/bugzilla/show_bug.cgi?id=38401
    @Test
    public void testBugzilla38401() {__CLR4_5_217sk17sklvha7irm.R.globalSliceStart(getClass().getName(),57000);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2w7elev17zc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_217sk17sklvha7irm.R.rethrow($CLV_t2$);}finally{__CLR4_5_217sk17sklvha7irm.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DurationFormatUtilsTest.testBugzilla38401",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),57000,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2w7elev17zc(){try{__CLR4_5_217sk17sklvha7irm.R.inc(57000);
        __CLR4_5_217sk17sklvha7irm.R.inc(57001);assertEqualDuration( "0000/00/30 16:00:00 000", new int[] { 2006, 0, 26, 18, 47, 34 }, 
                             new int[] { 2006, 1, 26, 10, 47, 34 }, "yyyy/MM/dd HH:mm:ss SSS");
    }finally{__CLR4_5_217sk17sklvha7irm.R.flushNeeded();}}

    // https://issues.apache.org/jira/browse/LANG-281
    @Test
    public void testJiraLang281() {__CLR4_5_217sk17sklvha7irm.R.globalSliceStart(getClass().getName(),57002);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2mnc20417ze();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_217sk17sklvha7irm.R.rethrow($CLV_t2$);}finally{__CLR4_5_217sk17sklvha7irm.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DurationFormatUtilsTest.testJiraLang281",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),57002,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2mnc20417ze(){try{__CLR4_5_217sk17sklvha7irm.R.inc(57002);
        __CLR4_5_217sk17sklvha7irm.R.inc(57003);assertEqualDuration( "09", new int[] { 2005, 11, 31, 0, 0, 0 }, 
                             new int[] { 2006, 9, 6, 0, 0, 0 }, "MM");
    }finally{__CLR4_5_217sk17sklvha7irm.R.flushNeeded();}}

    @Test
    public void testLANG815() {__CLR4_5_217sk17sklvha7irm.R.globalSliceStart(getClass().getName(),57004);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2j8cevx17zg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_217sk17sklvha7irm.R.rethrow($CLV_t2$);}finally{__CLR4_5_217sk17sklvha7irm.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DurationFormatUtilsTest.testLANG815",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),57004,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2j8cevx17zg(){try{__CLR4_5_217sk17sklvha7irm.R.inc(57004);
        __CLR4_5_217sk17sklvha7irm.R.inc(57005);final Calendar calendar = Calendar.getInstance();
        __CLR4_5_217sk17sklvha7irm.R.inc(57006);calendar.set(2012, Calendar.JULY, 30, 0, 0, 0);
        __CLR4_5_217sk17sklvha7irm.R.inc(57007);final long startMillis = calendar.getTimeInMillis();

        __CLR4_5_217sk17sklvha7irm.R.inc(57008);calendar.set(2012, Calendar.SEPTEMBER, 8);
        __CLR4_5_217sk17sklvha7irm.R.inc(57009);final long endMillis = calendar.getTimeInMillis();

        __CLR4_5_217sk17sklvha7irm.R.inc(57010);assertEquals("1 9", DurationFormatUtils.formatPeriod(startMillis, endMillis, "M d"));
    }finally{__CLR4_5_217sk17sklvha7irm.R.flushNeeded();}}

    // Testing the under a day range in DurationFormatUtils.formatPeriod
    @Test
    public void testLowDurations() {__CLR4_5_217sk17sklvha7irm.R.globalSliceStart(getClass().getName(),57011);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2dhsjo17zn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_217sk17sklvha7irm.R.rethrow($CLV_t2$);}finally{__CLR4_5_217sk17sklvha7irm.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DurationFormatUtilsTest.testLowDurations",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),57011,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2dhsjo17zn(){try{__CLR4_5_217sk17sklvha7irm.R.inc(57011);
        __CLR4_5_217sk17sklvha7irm.R.inc(57012);for(int hr=0; (((hr < 24)&&(__CLR4_5_217sk17sklvha7irm.R.iget(57013)!=0|true))||(__CLR4_5_217sk17sklvha7irm.R.iget(57014)==0&false)); hr++) {{
            __CLR4_5_217sk17sklvha7irm.R.inc(57015);for(int min=0; (((min < 60)&&(__CLR4_5_217sk17sklvha7irm.R.iget(57016)!=0|true))||(__CLR4_5_217sk17sklvha7irm.R.iget(57017)==0&false)); min++) {{
                __CLR4_5_217sk17sklvha7irm.R.inc(57018);for(int sec=0; (((sec < 60)&&(__CLR4_5_217sk17sklvha7irm.R.iget(57019)!=0|true))||(__CLR4_5_217sk17sklvha7irm.R.iget(57020)==0&false)); sec++) {{
                    __CLR4_5_217sk17sklvha7irm.R.inc(57021);assertEqualDuration( hr + ":" + min + ":" + sec, 
                                         new int[] { 2000, 0, 1, 0, 0, 0, 0 },
                                         new int[] { 2000, 0, 1, hr, min, sec },
                                         "H:m:s"
                                       );
                }
            }}
        }}
    }}finally{__CLR4_5_217sk17sklvha7irm.R.flushNeeded();}}

    // Attempting to test edge cases in DurationFormatUtils.formatPeriod
    @Test
    public void testEdgeDurations() {__CLR4_5_217sk17sklvha7irm.R.globalSliceStart(getClass().getName(),57022);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_242lgjb17zy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_217sk17sklvha7irm.R.rethrow($CLV_t2$);}finally{__CLR4_5_217sk17sklvha7irm.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DurationFormatUtilsTest.testEdgeDurations",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),57022,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_242lgjb17zy(){try{__CLR4_5_217sk17sklvha7irm.R.inc(57022);
        // This test case must use a time zone without DST
        __CLR4_5_217sk17sklvha7irm.R.inc(57023);TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
        __CLR4_5_217sk17sklvha7irm.R.inc(57024);assertEqualDuration( "01", new int[] { 2006, 0, 15, 0, 0, 0 }, 
                             new int[] { 2006, 2, 10, 0, 0, 0 }, "MM");
        __CLR4_5_217sk17sklvha7irm.R.inc(57025);assertEqualDuration( "12", new int[] { 2005, 0, 15, 0, 0, 0 }, 
                             new int[] { 2006, 0, 15, 0, 0, 0 }, "MM");
        __CLR4_5_217sk17sklvha7irm.R.inc(57026);assertEqualDuration( "12", new int[] { 2005, 0, 15, 0, 0, 0 }, 
                             new int[] { 2006, 0, 16, 0, 0, 0 }, "MM");
        __CLR4_5_217sk17sklvha7irm.R.inc(57027);assertEqualDuration( "11", new int[] { 2005, 0, 15, 0, 0, 0 }, 
                             new int[] { 2006, 0, 14, 0, 0, 0 }, "MM");
        
        __CLR4_5_217sk17sklvha7irm.R.inc(57028);assertEqualDuration( "01 26", new int[] { 2006, 0, 15, 0, 0, 0 },
                             new int[] { 2006, 2, 10, 0, 0, 0 }, "MM dd");
        __CLR4_5_217sk17sklvha7irm.R.inc(57029);assertEqualDuration( "54", new int[] { 2006, 0, 15, 0, 0, 0 },
                             new int[] { 2006, 2, 10, 0, 0, 0 }, "dd"); 
        
        __CLR4_5_217sk17sklvha7irm.R.inc(57030);assertEqualDuration( "09 12", new int[] { 2006, 1, 20, 0, 0, 0 },
                             new int[] { 2006, 11, 4, 0, 0, 0 }, "MM dd");
        __CLR4_5_217sk17sklvha7irm.R.inc(57031);assertEqualDuration( "287", new int[] { 2006, 1, 20, 0, 0, 0 },
                             new int[] { 2006, 11, 4, 0, 0, 0 }, "dd"); 

        __CLR4_5_217sk17sklvha7irm.R.inc(57032);assertEqualDuration( "11 30", new int[] { 2006, 0, 2, 0, 0, 0 },
                             new int[] { 2007, 0, 1, 0, 0, 0 }, "MM dd"); 
        __CLR4_5_217sk17sklvha7irm.R.inc(57033);assertEqualDuration( "364", new int[] { 2006, 0, 2, 0, 0, 0 },
                             new int[] { 2007, 0, 1, 0, 0, 0 }, "dd"); 

        __CLR4_5_217sk17sklvha7irm.R.inc(57034);assertEqualDuration( "12 00", new int[] { 2006, 0, 1, 0, 0, 0 },
                             new int[] { 2007, 0, 1, 0, 0, 0 }, "MM dd"); 
        __CLR4_5_217sk17sklvha7irm.R.inc(57035);assertEqualDuration( "365", new int[] { 2006, 0, 1, 0, 0, 0 },
                             new int[] { 2007, 0, 1, 0, 0, 0 }, "dd"); 
    
        __CLR4_5_217sk17sklvha7irm.R.inc(57036);assertEqualDuration( "31", new int[] { 2006, 0, 1, 0, 0, 0 },
                new int[] { 2006, 1, 1, 0, 0, 0 }, "dd"); 
        
        __CLR4_5_217sk17sklvha7irm.R.inc(57037);assertEqualDuration( "92", new int[] { 2005, 9, 1, 0, 0, 0 },
                new int[] { 2006, 0, 1, 0, 0, 0 }, "dd"); 
        __CLR4_5_217sk17sklvha7irm.R.inc(57038);assertEqualDuration( "77", new int[] { 2005, 9, 16, 0, 0, 0 },
                new int[] { 2006, 0, 1, 0, 0, 0 }, "dd"); 

        // test month larger in start than end
        __CLR4_5_217sk17sklvha7irm.R.inc(57039);assertEqualDuration( "136", new int[] { 2005, 9, 16, 0, 0, 0 },
                new int[] { 2006, 2, 1, 0, 0, 0 }, "dd"); 
        // test when start in leap year
        __CLR4_5_217sk17sklvha7irm.R.inc(57040);assertEqualDuration( "136", new int[] { 2004, 9, 16, 0, 0, 0 },
                new int[] { 2005, 2, 1, 0, 0, 0 }, "dd"); 
        // test when end in leap year
        __CLR4_5_217sk17sklvha7irm.R.inc(57041);assertEqualDuration( "137", new int[] { 2003, 9, 16, 0, 0, 0 },
                new int[] { 2004, 2, 1, 0, 0, 0 }, "dd");         
        // test when end in leap year but less than end of feb
        __CLR4_5_217sk17sklvha7irm.R.inc(57042);assertEqualDuration( "135", new int[] { 2003, 9, 16, 0, 0, 0 },
                new int[] { 2004, 1, 28, 0, 0, 0 }, "dd"); 

        __CLR4_5_217sk17sklvha7irm.R.inc(57043);assertEqualDuration( "364", new int[] { 2007, 0, 2, 0, 0, 0 },
                new int[] { 2008, 0, 1, 0, 0, 0 }, "dd"); 
        __CLR4_5_217sk17sklvha7irm.R.inc(57044);assertEqualDuration( "729", new int[] { 2006, 0, 2, 0, 0, 0 },
                new int[] { 2008, 0, 1, 0, 0, 0 }, "dd"); 

        __CLR4_5_217sk17sklvha7irm.R.inc(57045);assertEqualDuration( "365", new int[] { 2007, 2, 2, 0, 0, 0 },
                new int[] { 2008, 2, 1, 0, 0, 0 }, "dd"); 
        __CLR4_5_217sk17sklvha7irm.R.inc(57046);assertEqualDuration( "333", new int[] { 2007, 1, 2, 0, 0, 0 },
                new int[] { 2008, 0, 1, 0, 0, 0 }, "dd"); 

        __CLR4_5_217sk17sklvha7irm.R.inc(57047);assertEqualDuration( "28", new int[] { 2008, 1, 2, 0, 0, 0 },
                new int[] { 2008, 2, 1, 0, 0, 0 }, "dd"); 
        __CLR4_5_217sk17sklvha7irm.R.inc(57048);assertEqualDuration( "393", new int[] { 2007, 1, 2, 0, 0, 0 },
                new int[] { 2008, 2, 1, 0, 0, 0 }, "dd"); 

        __CLR4_5_217sk17sklvha7irm.R.inc(57049);assertEqualDuration( "369", new int[] { 2004, 0, 29, 0, 0, 0 },
                new int[] { 2005, 1, 1, 0, 0, 0 }, "dd"); 

        __CLR4_5_217sk17sklvha7irm.R.inc(57050);assertEqualDuration( "338", new int[] { 2004, 1, 29, 0, 0, 0 },
                new int[] { 2005, 1, 1, 0, 0, 0 }, "dd"); 

        __CLR4_5_217sk17sklvha7irm.R.inc(57051);assertEqualDuration( "28", new int[] { 2004, 2, 8, 0, 0, 0 },
                new int[] { 2004, 3, 5, 0, 0, 0 }, "dd"); 

        __CLR4_5_217sk17sklvha7irm.R.inc(57052);assertEqualDuration( "48", new int[] { 1992, 1, 29, 0, 0, 0 },
                new int[] { 1996, 1, 29, 0, 0, 0 }, "M"); 
        
        
        // this seems odd - and will fail if I throw it in as a brute force 
        // below as it expects the answer to be 12. It's a tricky edge case
        __CLR4_5_217sk17sklvha7irm.R.inc(57053);assertEqualDuration( "11", new int[] { 1996, 1, 29, 0, 0, 0 },
                new int[] { 1997, 1, 28, 0, 0, 0 }, "M"); 
        // again - this seems odd
        __CLR4_5_217sk17sklvha7irm.R.inc(57054);assertEqualDuration( "11 28", new int[] { 1996, 1, 29, 0, 0, 0 },
                new int[] { 1997, 1, 28, 0, 0, 0 }, "M d"); 
        
    }finally{__CLR4_5_217sk17sklvha7irm.R.flushNeeded();}}

    @Test
    public void testLANG984() {__CLR4_5_217sk17sklvha7irm.R.globalSliceStart(getClass().getName(),57055);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2toiwo4180v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_217sk17sklvha7irm.R.rethrow($CLV_t2$);}finally{__CLR4_5_217sk17sklvha7irm.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DurationFormatUtilsTest.testLANG984",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),57055,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2toiwo4180v(){try{__CLR4_5_217sk17sklvha7irm.R.inc(57055); // Long durations
        __CLR4_5_217sk17sklvha7irm.R.inc(57056);assertEquals("0", DurationFormatUtils.formatDuration(0, "S"));
        __CLR4_5_217sk17sklvha7irm.R.inc(57057);assertEquals(Integer.toString(Integer.MAX_VALUE), DurationFormatUtils.formatDuration(Integer.MAX_VALUE, "S"));
        __CLR4_5_217sk17sklvha7irm.R.inc(57058);long maxIntPlus=Integer.MAX_VALUE;
        __CLR4_5_217sk17sklvha7irm.R.inc(57059);maxIntPlus++;
        __CLR4_5_217sk17sklvha7irm.R.inc(57060);assertEquals(Long.toString(maxIntPlus), DurationFormatUtils.formatDuration(maxIntPlus, "S"));
        __CLR4_5_217sk17sklvha7irm.R.inc(57061);assertEquals(Long.toString(Long.MAX_VALUE), DurationFormatUtils.formatDuration(Long.MAX_VALUE, "S"));
    }finally{__CLR4_5_217sk17sklvha7irm.R.flushNeeded();}}

    @Test
    public void testLANG982() {__CLR4_5_217sk17sklvha7irm.R.globalSliceStart(getClass().getName(),57062);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2yul7q21812();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_217sk17sklvha7irm.R.rethrow($CLV_t2$);}finally{__CLR4_5_217sk17sklvha7irm.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DurationFormatUtilsTest.testLANG982",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),57062,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2yul7q21812(){try{__CLR4_5_217sk17sklvha7irm.R.inc(57062); // More than 3 millisecond digits following a second
        __CLR4_5_217sk17sklvha7irm.R.inc(57063);assertEquals("61.999", DurationFormatUtils.formatDuration(61999, "s.S"));
        __CLR4_5_217sk17sklvha7irm.R.inc(57064);assertEquals("1 1999", DurationFormatUtils.formatDuration(61999, "m S"));
        __CLR4_5_217sk17sklvha7irm.R.inc(57065);assertEquals("61.999", DurationFormatUtils.formatDuration(61999, "s.SSS"));
        __CLR4_5_217sk17sklvha7irm.R.inc(57066);assertEquals("1 1999", DurationFormatUtils.formatDuration(61999, "m SSS"));
        __CLR4_5_217sk17sklvha7irm.R.inc(57067);assertEquals("61.0999", DurationFormatUtils.formatDuration(61999, "s.SSSS"));
        __CLR4_5_217sk17sklvha7irm.R.inc(57068);assertEquals("1 1999", DurationFormatUtils.formatDuration(61999, "m SSSS"));
        __CLR4_5_217sk17sklvha7irm.R.inc(57069);assertEquals("61.00999", DurationFormatUtils.formatDuration(61999, "s.SSSSS"));
        __CLR4_5_217sk17sklvha7irm.R.inc(57070);assertEquals("1 01999", DurationFormatUtils.formatDuration(61999, "m SSSSS"));
    }finally{__CLR4_5_217sk17sklvha7irm.R.flushNeeded();}}

    @Test
    public void testDurationsByBruteForce() {__CLR4_5_217sk17sklvha7irm.R.globalSliceStart(getClass().getName(),57071);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2bfu55s181b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_217sk17sklvha7irm.R.rethrow($CLV_t2$);}finally{__CLR4_5_217sk17sklvha7irm.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DurationFormatUtilsTest.testDurationsByBruteForce",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),57071,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2bfu55s181b(){try{__CLR4_5_217sk17sklvha7irm.R.inc(57071);
        __CLR4_5_217sk17sklvha7irm.R.inc(57072);bruteForce(2006, 0, 1, "d", Calendar.DAY_OF_MONTH);
        __CLR4_5_217sk17sklvha7irm.R.inc(57073);bruteForce(2006, 0, 2, "d", Calendar.DAY_OF_MONTH);
        __CLR4_5_217sk17sklvha7irm.R.inc(57074);bruteForce(2007, 1, 2, "d", Calendar.DAY_OF_MONTH);
        __CLR4_5_217sk17sklvha7irm.R.inc(57075);bruteForce(2004, 1, 29, "d", Calendar.DAY_OF_MONTH);
        __CLR4_5_217sk17sklvha7irm.R.inc(57076);bruteForce(1996, 1, 29, "d", Calendar.DAY_OF_MONTH);

        __CLR4_5_217sk17sklvha7irm.R.inc(57077);bruteForce(1969, 1, 28, "M", Calendar.MONTH);  // tests for 48 years
        //bruteForce(1996, 1, 29, "M", Calendar.MONTH);  // this will fail
    }finally{__CLR4_5_217sk17sklvha7irm.R.flushNeeded();}}

    @Test(expected=IllegalArgumentException.class)
    public void testLANG981() {__CLR4_5_217sk17sklvha7irm.R.globalSliceStart(getClass().getName(),57078);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vll8xl181i();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,76,65,78,71,57,56,49,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_217sk17sklvha7irm.R.rethrow($CLV_t2$);}finally{__CLR4_5_217sk17sklvha7irm.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DurationFormatUtilsTest.testLANG981",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),57078,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vll8xl181i(){try{__CLR4_5_217sk17sklvha7irm.R.inc(57078); // unmatched quote char in lexx
        __CLR4_5_217sk17sklvha7irm.R.inc(57079);DurationFormatUtils.lexx("'yMdHms''S");
    }finally{__CLR4_5_217sk17sklvha7irm.R.flushNeeded();}}

    private static final int FOUR_YEARS = 365 * 3 + 366;
    
    // Takes a minute to run, so generally turned off
//    public void testBrutally() {
//        Calendar c = Calendar.getInstance();
//        c.set(2004, 0, 1, 0, 0, 0);
//        for (int i=0; i < FOUR_YEARS; i++) {
//            bruteForce(c.get(Calendar.YEAR), c.get(Calendar.MONTH), c.get(Calendar.DAY_OF_MONTH), "d", Calendar.DAY_OF_MONTH );
//            c.add(Calendar.DAY_OF_MONTH, 1);
//        }
//    }        
    
    private void bruteForce(final int year, final int month, final int day, final String format, final int calendarType) {try{__CLR4_5_217sk17sklvha7irm.R.inc(57080);
        __CLR4_5_217sk17sklvha7irm.R.inc(57081);final String msg = year + "-" + month + "-" + day + " to ";
        __CLR4_5_217sk17sklvha7irm.R.inc(57082);final Calendar c = Calendar.getInstance();
        __CLR4_5_217sk17sklvha7irm.R.inc(57083);c.set(year, month, day, 0, 0, 0);
        __CLR4_5_217sk17sklvha7irm.R.inc(57084);final int[] array1 = new int[] { year, month, day, 0, 0, 0 };
        __CLR4_5_217sk17sklvha7irm.R.inc(57085);final int[] array2 = new int[] { year, month, day, 0, 0, 0 };
        __CLR4_5_217sk17sklvha7irm.R.inc(57086);for (int i=0; (((i < FOUR_YEARS)&&(__CLR4_5_217sk17sklvha7irm.R.iget(57087)!=0|true))||(__CLR4_5_217sk17sklvha7irm.R.iget(57088)==0&false)); i++) {{
            __CLR4_5_217sk17sklvha7irm.R.inc(57089);array2[0] = c.get(Calendar.YEAR);
            __CLR4_5_217sk17sklvha7irm.R.inc(57090);array2[1] = c.get(Calendar.MONTH);
            __CLR4_5_217sk17sklvha7irm.R.inc(57091);array2[2] = c.get(Calendar.DAY_OF_MONTH);
            __CLR4_5_217sk17sklvha7irm.R.inc(57092);final String tmpMsg = msg + array2[0] + "-" + array2[1] + "-" + array2[2] + " at ";
            __CLR4_5_217sk17sklvha7irm.R.inc(57093);assertEqualDuration( tmpMsg + i, Integer.toString(i), array1, array2, format );
            __CLR4_5_217sk17sklvha7irm.R.inc(57094);c.add(calendarType, 1);
        }
    }}finally{__CLR4_5_217sk17sklvha7irm.R.flushNeeded();}}

    private void assertEqualDuration(final String expected, final int[] start, final int[] end, final String format) {try{__CLR4_5_217sk17sklvha7irm.R.inc(57095);
        __CLR4_5_217sk17sklvha7irm.R.inc(57096);assertEqualDuration(null, expected, start, end, format);
    }finally{__CLR4_5_217sk17sklvha7irm.R.flushNeeded();}}
    private void assertEqualDuration(final String message, final String expected, final int[] start, final int[] end, final String format) {try{__CLR4_5_217sk17sklvha7irm.R.inc(57097);
        __CLR4_5_217sk17sklvha7irm.R.inc(57098);final Calendar cal1 = Calendar.getInstance();
        __CLR4_5_217sk17sklvha7irm.R.inc(57099);cal1.set(start[0], start[1], start[2], start[3], start[4], start[5]);
        __CLR4_5_217sk17sklvha7irm.R.inc(57100);cal1.set(Calendar.MILLISECOND, 0);
        __CLR4_5_217sk17sklvha7irm.R.inc(57101);final Calendar cal2 = Calendar.getInstance();
        __CLR4_5_217sk17sklvha7irm.R.inc(57102);cal2.set(end[0], end[1], end[2], end[3], end[4], end[5]);
        __CLR4_5_217sk17sklvha7irm.R.inc(57103);cal2.set(Calendar.MILLISECOND, 0);
        __CLR4_5_217sk17sklvha7irm.R.inc(57104);final long milli1 = cal1.getTime().getTime();
        __CLR4_5_217sk17sklvha7irm.R.inc(57105);final long milli2 = cal2.getTime().getTime();
        __CLR4_5_217sk17sklvha7irm.R.inc(57106);final String result = DurationFormatUtils.formatPeriod(milli1, milli2, format);
        __CLR4_5_217sk17sklvha7irm.R.inc(57107);if ((((message == null)&&(__CLR4_5_217sk17sklvha7irm.R.iget(57108)!=0|true))||(__CLR4_5_217sk17sklvha7irm.R.iget(57109)==0&false))) {{
            __CLR4_5_217sk17sklvha7irm.R.inc(57110);assertEquals(expected, result);
        } }else {{
            __CLR4_5_217sk17sklvha7irm.R.inc(57111);assertEquals(message, expected, result);
        }
    }}finally{__CLR4_5_217sk17sklvha7irm.R.flushNeeded();}}

}
