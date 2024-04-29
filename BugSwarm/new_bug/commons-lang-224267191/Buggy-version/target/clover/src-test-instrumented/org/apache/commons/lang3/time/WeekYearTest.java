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

import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class WeekYearTest {static class __CLR4_5_218xc18xclvha7iyf{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172763741L,8589935092L,58242,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=new com_atlassian_clover.TestNameSniffer.Simple();

    @Parameters(name = "{index}: {3}")
    public static Collection<Object[]> data() {try{__CLR4_5_218xc18xclvha7iyf.R.inc(58224);
        __CLR4_5_218xc18xclvha7iyf.R.inc(58225);return Arrays
                .asList(new Object[][] {
                    { 2005, Calendar.JANUARY, 1, "2004-W53-6" },
                    { 2005, Calendar.JANUARY, 2, "2004-W53-7" },
                    { 2005, Calendar.DECEMBER, 31, "2005-W52-6" },
                    { 2007, Calendar.JANUARY, 1, "2007-W01-1" },
                    { 2007, Calendar.DECEMBER, 30, "2007-W52-7" },
                    { 2007, Calendar.DECEMBER, 31, "2008-W01-1" },
                    { 2008, Calendar.JANUARY, 1, "2008-W01-2" },
                    { 2008, Calendar.DECEMBER, 28, "2008-W52-7" },
                    { 2008, Calendar.DECEMBER, 29, "2009-W01-1" },
                    { 2008, Calendar.DECEMBER, 30, "2009-W01-2" },
                    { 2008, Calendar.DECEMBER, 31, "2009-W01-3" },
                    { 2009, Calendar.JANUARY, 1, "2009-W01-4" },
                    { 2009, Calendar.DECEMBER, 31, "2009-W53-4" },
                    { 2010, Calendar.JANUARY, 1, "2009-W53-5" },
                    { 2010, Calendar.JANUARY, 2, "2009-W53-6" },
                    { 2010, Calendar.JANUARY, 3, "2009-W53-7" }
                });
    }finally{__CLR4_5_218xc18xclvha7iyf.R.flushNeeded();}}

    final Calendar vulgar;
    final String isoForm;

    public WeekYearTest(final int year, final int month, final int day, final String isoForm) {try{__CLR4_5_218xc18xclvha7iyf.R.inc(58226);
        __CLR4_5_218xc18xclvha7iyf.R.inc(58227);vulgar = new GregorianCalendar(year, month, day);
        __CLR4_5_218xc18xclvha7iyf.R.inc(58228);this.isoForm = isoForm;
    }finally{__CLR4_5_218xc18xclvha7iyf.R.flushNeeded();}}

    @Test
    public void testParser() throws ParseException {__CLR4_5_218xc18xclvha7iyf.R.globalSliceStart(getClass().getName(),58229);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_29w8yuw18xh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_218xc18xclvha7iyf.R.rethrow($CLV_t2$);}finally{__CLR4_5_218xc18xclvha7iyf.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.WeekYearTest.testParser",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),58229,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_29w8yuw18xh() throws ParseException{try{__CLR4_5_218xc18xclvha7iyf.R.inc(58229);
        __CLR4_5_218xc18xclvha7iyf.R.inc(58230);final DateParser parser = new FastDateParser("YYYY-'W'ww-u", TimeZone.getDefault(), Locale.getDefault());

        __CLR4_5_218xc18xclvha7iyf.R.inc(58231);final Calendar cal = Calendar.getInstance();
        __CLR4_5_218xc18xclvha7iyf.R.inc(58232);cal.setMinimalDaysInFirstWeek(4);
        __CLR4_5_218xc18xclvha7iyf.R.inc(58233);cal.setFirstDayOfWeek(Calendar.MONDAY);
        __CLR4_5_218xc18xclvha7iyf.R.inc(58234);cal.clear();

        __CLR4_5_218xc18xclvha7iyf.R.inc(58235);parser.parse(isoForm, new ParsePosition(0), cal);
        __CLR4_5_218xc18xclvha7iyf.R.inc(58236);Assert.assertEquals(vulgar.getTime(), cal.getTime());
    }finally{__CLR4_5_218xc18xclvha7iyf.R.flushNeeded();}}

    @Test
    public void testPrinter() {__CLR4_5_218xc18xclvha7iyf.R.globalSliceStart(getClass().getName(),58237);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2t04z9t18xp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_218xc18xclvha7iyf.R.rethrow($CLV_t2$);}finally{__CLR4_5_218xc18xclvha7iyf.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.WeekYearTest.testPrinter",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),58237,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2t04z9t18xp(){try{__CLR4_5_218xc18xclvha7iyf.R.inc(58237);
        __CLR4_5_218xc18xclvha7iyf.R.inc(58238);final FastDatePrinter printer = new FastDatePrinter("YYYY-'W'ww-u", TimeZone.getDefault(), Locale.getDefault());

        __CLR4_5_218xc18xclvha7iyf.R.inc(58239);vulgar.setMinimalDaysInFirstWeek(4);
        __CLR4_5_218xc18xclvha7iyf.R.inc(58240);vulgar.setFirstDayOfWeek(Calendar.MONDAY);

        __CLR4_5_218xc18xclvha7iyf.R.inc(58241);Assert.assertEquals(isoForm, printer.format(vulgar));
    }finally{__CLR4_5_218xc18xclvha7iyf.R.flushNeeded();}}
}
