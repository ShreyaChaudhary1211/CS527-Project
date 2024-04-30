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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.Serializable;
import java.text.FieldPosition;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

import org.apache.commons.lang3.SerializationUtils;
import org.apache.commons.lang3.test.SystemDefaults;
import org.apache.commons.lang3.test.SystemDefaultsSwitch;
import org.junit.Rule;
import org.junit.Test;

/**
 * Unit tests {@link org.apache.commons.lang3.time.FastDatePrinter}.
 *
 * @since 3.0
 */
public class FastDatePrinterTest {static class __CLR4_5_218mj18mjlvha7ixd{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172763741L,8589935092L,58052,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    
    private static final String YYYY_MM_DD = "yyyy/MM/dd";
    private static final TimeZone NEW_YORK = TimeZone.getTimeZone("America/New_York");
    private static final TimeZone GMT = TimeZone.getTimeZone("GMT");
    private static final TimeZone INDIA = TimeZone.getTimeZone("Asia/Calcutta");
    private static final Locale SWEDEN = new Locale("sv", "SE");

    DatePrinter getInstance(final String format) {try{__CLR4_5_218mj18mjlvha7ixd.R.inc(57835);
        __CLR4_5_218mj18mjlvha7ixd.R.inc(57836);return getInstance(format, TimeZone.getDefault(), Locale.getDefault());
    }finally{__CLR4_5_218mj18mjlvha7ixd.R.flushNeeded();}}

    private DatePrinter getDateInstance(final int dateStyle, final Locale locale) {try{__CLR4_5_218mj18mjlvha7ixd.R.inc(57837);
        __CLR4_5_218mj18mjlvha7ixd.R.inc(57838);return getInstance(FormatCache.getPatternForStyle(Integer.valueOf(dateStyle), null, locale), TimeZone.getDefault(), Locale.getDefault());
    }finally{__CLR4_5_218mj18mjlvha7ixd.R.flushNeeded();}}

    private DatePrinter getInstance(final String format, final Locale locale) {try{__CLR4_5_218mj18mjlvha7ixd.R.inc(57839);
        __CLR4_5_218mj18mjlvha7ixd.R.inc(57840);return getInstance(format, TimeZone.getDefault(), locale);
    }finally{__CLR4_5_218mj18mjlvha7ixd.R.flushNeeded();}}

    private DatePrinter getInstance(final String format, final TimeZone timeZone) {try{__CLR4_5_218mj18mjlvha7ixd.R.inc(57841);
        __CLR4_5_218mj18mjlvha7ixd.R.inc(57842);return getInstance(format, timeZone, Locale.getDefault());
    }finally{__CLR4_5_218mj18mjlvha7ixd.R.flushNeeded();}}

    /**
     * Override this method in derived tests to change the construction of instances
     * @param format the format string to use
     * @param timeZone the time zone to use
     * @param locale the locale to use
     * @return the DatePrinter to use for testing
     */
    protected DatePrinter getInstance(final String format, final TimeZone timeZone, final Locale locale) {try{__CLR4_5_218mj18mjlvha7ixd.R.inc(57843);
        __CLR4_5_218mj18mjlvha7ixd.R.inc(57844);return new FastDatePrinter(format, timeZone, locale);
    }finally{__CLR4_5_218mj18mjlvha7ixd.R.flushNeeded();}}

    @Rule
    public SystemDefaultsSwitch defaults = new SystemDefaultsSwitch();

    @SystemDefaults(timezone="America/New_York", locale="en_US")
    @Test
    public void testFormat() {__CLR4_5_218mj18mjlvha7ixd.R.globalSliceStart(getClass().getName(),57845);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27ezusw18mt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_218mj18mjlvha7ixd.R.rethrow($CLV_t2$);}finally{__CLR4_5_218mj18mjlvha7ixd.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.FastDatePrinterTest.testFormat",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),57845,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27ezusw18mt(){try{__CLR4_5_218mj18mjlvha7ixd.R.inc(57845);
        __CLR4_5_218mj18mjlvha7ixd.R.inc(57846);final GregorianCalendar cal1 = new GregorianCalendar(2003, 0, 10, 15, 33, 20);
        __CLR4_5_218mj18mjlvha7ixd.R.inc(57847);final GregorianCalendar cal2 = new GregorianCalendar(2003, 6, 10, 9, 0, 0);
        __CLR4_5_218mj18mjlvha7ixd.R.inc(57848);final Date date1 = cal1.getTime();
        __CLR4_5_218mj18mjlvha7ixd.R.inc(57849);final Date date2 = cal2.getTime();
        __CLR4_5_218mj18mjlvha7ixd.R.inc(57850);final long millis1 = date1.getTime();
        __CLR4_5_218mj18mjlvha7ixd.R.inc(57851);final long millis2 = date2.getTime();

        __CLR4_5_218mj18mjlvha7ixd.R.inc(57852);DatePrinter fdf = getInstance("yyyy-MM-dd'T'HH:mm:ss");
        __CLR4_5_218mj18mjlvha7ixd.R.inc(57853);SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
        __CLR4_5_218mj18mjlvha7ixd.R.inc(57854);assertEquals(sdf.format(date1), fdf.format(date1));
        __CLR4_5_218mj18mjlvha7ixd.R.inc(57855);assertEquals("2003-01-10T15:33:20", fdf.format(date1));
        __CLR4_5_218mj18mjlvha7ixd.R.inc(57856);assertEquals("2003-01-10T15:33:20", fdf.format(cal1));
        __CLR4_5_218mj18mjlvha7ixd.R.inc(57857);assertEquals("2003-01-10T15:33:20", fdf.format(millis1));
        __CLR4_5_218mj18mjlvha7ixd.R.inc(57858);assertEquals("2003-07-10T09:00:00", fdf.format(date2));
        __CLR4_5_218mj18mjlvha7ixd.R.inc(57859);assertEquals("2003-07-10T09:00:00", fdf.format(cal2));
        __CLR4_5_218mj18mjlvha7ixd.R.inc(57860);assertEquals("2003-07-10T09:00:00", fdf.format(millis2));

        __CLR4_5_218mj18mjlvha7ixd.R.inc(57861);fdf = getInstance("Z");
        __CLR4_5_218mj18mjlvha7ixd.R.inc(57862);assertEquals("-0500", fdf.format(date1));
        __CLR4_5_218mj18mjlvha7ixd.R.inc(57863);assertEquals("-0500", fdf.format(cal1));
        __CLR4_5_218mj18mjlvha7ixd.R.inc(57864);assertEquals("-0500", fdf.format(millis1));

        __CLR4_5_218mj18mjlvha7ixd.R.inc(57865);assertEquals("-0400", fdf.format(date2));
        __CLR4_5_218mj18mjlvha7ixd.R.inc(57866);assertEquals("-0400", fdf.format(cal2));
        __CLR4_5_218mj18mjlvha7ixd.R.inc(57867);assertEquals("-0400", fdf.format(millis2));

        __CLR4_5_218mj18mjlvha7ixd.R.inc(57868);fdf = getInstance("ZZ");
        __CLR4_5_218mj18mjlvha7ixd.R.inc(57869);assertEquals("-05:00", fdf.format(date1));
        __CLR4_5_218mj18mjlvha7ixd.R.inc(57870);assertEquals("-05:00", fdf.format(cal1));
        __CLR4_5_218mj18mjlvha7ixd.R.inc(57871);assertEquals("-05:00", fdf.format(millis1));

        __CLR4_5_218mj18mjlvha7ixd.R.inc(57872);assertEquals("-04:00", fdf.format(date2));
        __CLR4_5_218mj18mjlvha7ixd.R.inc(57873);assertEquals("-04:00", fdf.format(cal2));
        __CLR4_5_218mj18mjlvha7ixd.R.inc(57874);assertEquals("-04:00", fdf.format(millis2));

        __CLR4_5_218mj18mjlvha7ixd.R.inc(57875);final String pattern = "GGGG GGG GG G yyyy yyy yy y MMMM MMM MM M" +
                " dddd ddd dd d DDDD DDD DD D EEEE EEE EE E aaaa aaa aa a zzzz zzz zz z";
        __CLR4_5_218mj18mjlvha7ixd.R.inc(57876);fdf = getInstance(pattern);
        __CLR4_5_218mj18mjlvha7ixd.R.inc(57877);sdf = new SimpleDateFormat(pattern);
        // SDF bug fix starting with Java 7
        __CLR4_5_218mj18mjlvha7ixd.R.inc(57878);assertEquals(sdf.format(date1).replaceAll("2003 03 03 03", "2003 2003 03 2003"), fdf.format(date1));
        __CLR4_5_218mj18mjlvha7ixd.R.inc(57879);assertEquals(sdf.format(date2).replaceAll("2003 03 03 03", "2003 2003 03 2003"), fdf.format(date2));
    }finally{__CLR4_5_218mj18mjlvha7ixd.R.flushNeeded();}}

    /**
     * Test case for {@link FastDateParser#FastDateParser(String, TimeZone, Locale)}.
     */
    @Test
    public void testShortDateStyleWithLocales() {__CLR4_5_218mj18mjlvha7ixd.R.globalSliceStart(getClass().getName(),57880);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2a9jtmn18ns();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_218mj18mjlvha7ixd.R.rethrow($CLV_t2$);}finally{__CLR4_5_218mj18mjlvha7ixd.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.FastDatePrinterTest.testShortDateStyleWithLocales",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),57880,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2a9jtmn18ns(){try{__CLR4_5_218mj18mjlvha7ixd.R.inc(57880);
        __CLR4_5_218mj18mjlvha7ixd.R.inc(57881);final Locale usLocale = Locale.US;
        __CLR4_5_218mj18mjlvha7ixd.R.inc(57882);final Locale swedishLocale = new Locale("sv", "SE");
        __CLR4_5_218mj18mjlvha7ixd.R.inc(57883);final Calendar cal = Calendar.getInstance();
        __CLR4_5_218mj18mjlvha7ixd.R.inc(57884);cal.set(2004, Calendar.FEBRUARY, 3);
        __CLR4_5_218mj18mjlvha7ixd.R.inc(57885);DatePrinter fdf = getDateInstance(FastDateFormat.SHORT, usLocale);
        __CLR4_5_218mj18mjlvha7ixd.R.inc(57886);assertEquals("2/3/04", fdf.format(cal));

        __CLR4_5_218mj18mjlvha7ixd.R.inc(57887);fdf = getDateInstance(FastDateFormat.SHORT, swedishLocale);
        __CLR4_5_218mj18mjlvha7ixd.R.inc(57888);assertEquals("2004-02-03", fdf.format(cal));

    }finally{__CLR4_5_218mj18mjlvha7ixd.R.flushNeeded();}}

    /**
     * Tests that pre-1000AD years get padded with yyyy
     */
    @Test
    public void testLowYearPadding() {__CLR4_5_218mj18mjlvha7ixd.R.globalSliceStart(getClass().getName(),57889);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jr7xi118o1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_218mj18mjlvha7ixd.R.rethrow($CLV_t2$);}finally{__CLR4_5_218mj18mjlvha7ixd.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.FastDatePrinterTest.testLowYearPadding",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),57889,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jr7xi118o1(){try{__CLR4_5_218mj18mjlvha7ixd.R.inc(57889);
        __CLR4_5_218mj18mjlvha7ixd.R.inc(57890);final Calendar cal = Calendar.getInstance();
        __CLR4_5_218mj18mjlvha7ixd.R.inc(57891);final DatePrinter format = getInstance(YYYY_MM_DD);

        __CLR4_5_218mj18mjlvha7ixd.R.inc(57892);cal.set(1, Calendar.JANUARY, 1);
        __CLR4_5_218mj18mjlvha7ixd.R.inc(57893);assertEquals("0001/01/01", format.format(cal));
        __CLR4_5_218mj18mjlvha7ixd.R.inc(57894);cal.set(10, Calendar.JANUARY, 1);
        __CLR4_5_218mj18mjlvha7ixd.R.inc(57895);assertEquals("0010/01/01", format.format(cal));
        __CLR4_5_218mj18mjlvha7ixd.R.inc(57896);cal.set(100, Calendar.JANUARY, 1);
        __CLR4_5_218mj18mjlvha7ixd.R.inc(57897);assertEquals("0100/01/01", format.format(cal));
        __CLR4_5_218mj18mjlvha7ixd.R.inc(57898);cal.set(999, Calendar.JANUARY, 1);
        __CLR4_5_218mj18mjlvha7ixd.R.inc(57899);assertEquals("0999/01/01", format.format(cal));
    }finally{__CLR4_5_218mj18mjlvha7ixd.R.flushNeeded();}}
    /**
     * Show Bug #39410 is solved
     */
    @Test
    public void testMilleniumBug() {__CLR4_5_218mj18mjlvha7ixd.R.globalSliceStart(getClass().getName(),57900);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2rn0vxt18oc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_218mj18mjlvha7ixd.R.rethrow($CLV_t2$);}finally{__CLR4_5_218mj18mjlvha7ixd.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.FastDatePrinterTest.testMilleniumBug",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),57900,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2rn0vxt18oc(){try{__CLR4_5_218mj18mjlvha7ixd.R.inc(57900);
        __CLR4_5_218mj18mjlvha7ixd.R.inc(57901);final Calendar cal = Calendar.getInstance();
        __CLR4_5_218mj18mjlvha7ixd.R.inc(57902);final DatePrinter format = getInstance("dd.MM.yyyy");

        __CLR4_5_218mj18mjlvha7ixd.R.inc(57903);cal.set(1000, Calendar.JANUARY, 1);
        __CLR4_5_218mj18mjlvha7ixd.R.inc(57904);assertEquals("01.01.1000", format.format(cal));
    }finally{__CLR4_5_218mj18mjlvha7ixd.R.flushNeeded();}}

    /**
     * testLowYearPadding showed that the date was buggy
     * This test confirms it, getting 366 back as a date
     */
    @Test
    public void testSimpleDate() {__CLR4_5_218mj18mjlvha7ixd.R.globalSliceStart(getClass().getName(),57905);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2sx4dyx18oh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_218mj18mjlvha7ixd.R.rethrow($CLV_t2$);}finally{__CLR4_5_218mj18mjlvha7ixd.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.FastDatePrinterTest.testSimpleDate",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),57905,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2sx4dyx18oh(){try{__CLR4_5_218mj18mjlvha7ixd.R.inc(57905);
        __CLR4_5_218mj18mjlvha7ixd.R.inc(57906);final Calendar cal = Calendar.getInstance();
        __CLR4_5_218mj18mjlvha7ixd.R.inc(57907);final DatePrinter format = getInstance(YYYY_MM_DD);

        __CLR4_5_218mj18mjlvha7ixd.R.inc(57908);cal.set(2004, Calendar.DECEMBER, 31);
        __CLR4_5_218mj18mjlvha7ixd.R.inc(57909);assertEquals("2004/12/31", format.format(cal));
        __CLR4_5_218mj18mjlvha7ixd.R.inc(57910);cal.set(999, Calendar.DECEMBER, 31);
        __CLR4_5_218mj18mjlvha7ixd.R.inc(57911);assertEquals("0999/12/31", format.format(cal));
        __CLR4_5_218mj18mjlvha7ixd.R.inc(57912);cal.set(1, Calendar.MARCH, 2);
        __CLR4_5_218mj18mjlvha7ixd.R.inc(57913);assertEquals("0001/03/02", format.format(cal));
    }finally{__CLR4_5_218mj18mjlvha7ixd.R.flushNeeded();}}

    @Test
    public void testLang303() {__CLR4_5_218mj18mjlvha7ixd.R.globalSliceStart(getClass().getName(),57914);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26ep1el18oq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_218mj18mjlvha7ixd.R.rethrow($CLV_t2$);}finally{__CLR4_5_218mj18mjlvha7ixd.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.FastDatePrinterTest.testLang303",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),57914,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26ep1el18oq(){try{__CLR4_5_218mj18mjlvha7ixd.R.inc(57914);
        __CLR4_5_218mj18mjlvha7ixd.R.inc(57915);final Calendar cal = Calendar.getInstance();
        __CLR4_5_218mj18mjlvha7ixd.R.inc(57916);cal.set(2004, Calendar.DECEMBER, 31);

        __CLR4_5_218mj18mjlvha7ixd.R.inc(57917);DatePrinter format = getInstance(YYYY_MM_DD);
        __CLR4_5_218mj18mjlvha7ixd.R.inc(57918);final String output = format.format(cal);

        __CLR4_5_218mj18mjlvha7ixd.R.inc(57919);format = SerializationUtils.deserialize(SerializationUtils.serialize((Serializable) format));
        __CLR4_5_218mj18mjlvha7ixd.R.inc(57920);assertEquals(output, format.format(cal));
    }finally{__CLR4_5_218mj18mjlvha7ixd.R.flushNeeded();}}

    @Test
    public void testLang538() {__CLR4_5_218mj18mjlvha7ixd.R.globalSliceStart(getClass().getName(),57921);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2yinwov18ox();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_218mj18mjlvha7ixd.R.rethrow($CLV_t2$);}finally{__CLR4_5_218mj18mjlvha7ixd.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.FastDatePrinterTest.testLang538",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),57921,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2yinwov18ox(){try{__CLR4_5_218mj18mjlvha7ixd.R.inc(57921);
        // more commonly constructed with: cal = new GregorianCalendar(2009, 9, 16, 8, 42, 16)
        // for the unit test to work in any time zone, constructing with GMT-8 rather than default locale time zone
        __CLR4_5_218mj18mjlvha7ixd.R.inc(57922);final GregorianCalendar cal = new GregorianCalendar(TimeZone.getTimeZone("GMT-8"));
        __CLR4_5_218mj18mjlvha7ixd.R.inc(57923);cal.clear();
        __CLR4_5_218mj18mjlvha7ixd.R.inc(57924);cal.set(2009, Calendar.OCTOBER, 16, 8, 42, 16);

        __CLR4_5_218mj18mjlvha7ixd.R.inc(57925);final DatePrinter format = getInstance("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", TimeZone.getTimeZone("GMT"));
        __CLR4_5_218mj18mjlvha7ixd.R.inc(57926);assertEquals("dateTime", "2009-10-16T16:42:16.000Z", format.format(cal.getTime()));
        __CLR4_5_218mj18mjlvha7ixd.R.inc(57927);assertEquals("dateTime", "2009-10-16T16:42:16.000Z", format.format(cal));
    }finally{__CLR4_5_218mj18mjlvha7ixd.R.flushNeeded();}}

    @Test
    public void testLang645() {__CLR4_5_218mj18mjlvha7ixd.R.globalSliceStart(getClass().getName(),57928);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gonldu18p4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_218mj18mjlvha7ixd.R.rethrow($CLV_t2$);}finally{__CLR4_5_218mj18mjlvha7ixd.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.FastDatePrinterTest.testLang645",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),57928,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gonldu18p4(){try{__CLR4_5_218mj18mjlvha7ixd.R.inc(57928);
        __CLR4_5_218mj18mjlvha7ixd.R.inc(57929);final Locale locale = new Locale("sv", "SE");

        __CLR4_5_218mj18mjlvha7ixd.R.inc(57930);final Calendar cal = Calendar.getInstance();
        __CLR4_5_218mj18mjlvha7ixd.R.inc(57931);cal.set(2010, Calendar.JANUARY, 1, 12, 0, 0);
        __CLR4_5_218mj18mjlvha7ixd.R.inc(57932);final Date d = cal.getTime();

        __CLR4_5_218mj18mjlvha7ixd.R.inc(57933);final DatePrinter fdf = getInstance("EEEE', week 'ww", locale);

        __CLR4_5_218mj18mjlvha7ixd.R.inc(57934);assertEquals("fredag, week 53", fdf.format(d));
    }finally{__CLR4_5_218mj18mjlvha7ixd.R.flushNeeded();}}
    
    @Test
    public void testEquals() {__CLR4_5_218mj18mjlvha7ixd.R.globalSliceStart(getClass().getName(),57935);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2s4e60818pb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_218mj18mjlvha7ixd.R.rethrow($CLV_t2$);}finally{__CLR4_5_218mj18mjlvha7ixd.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.FastDatePrinterTest.testEquals",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),57935,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2s4e60818pb(){try{__CLR4_5_218mj18mjlvha7ixd.R.inc(57935);
        __CLR4_5_218mj18mjlvha7ixd.R.inc(57936);final DatePrinter printer1= getInstance(YYYY_MM_DD);
        __CLR4_5_218mj18mjlvha7ixd.R.inc(57937);final DatePrinter printer2= getInstance(YYYY_MM_DD);

        __CLR4_5_218mj18mjlvha7ixd.R.inc(57938);assertEquals(printer1, printer2);
        __CLR4_5_218mj18mjlvha7ixd.R.inc(57939);assertEquals(printer1.hashCode(), printer2.hashCode());        

        __CLR4_5_218mj18mjlvha7ixd.R.inc(57940);assertFalse(printer1.equals(new Object()));
    }finally{__CLR4_5_218mj18mjlvha7ixd.R.flushNeeded();}}
    
    @Test
    public void testToStringContainsName() {__CLR4_5_218mj18mjlvha7ixd.R.globalSliceStart(getClass().getName(),57941);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2tx5bkf18ph();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_218mj18mjlvha7ixd.R.rethrow($CLV_t2$);}finally{__CLR4_5_218mj18mjlvha7ixd.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.FastDatePrinterTest.testToStringContainsName",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),57941,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2tx5bkf18ph(){try{__CLR4_5_218mj18mjlvha7ixd.R.inc(57941);
        __CLR4_5_218mj18mjlvha7ixd.R.inc(57942);final DatePrinter printer= getInstance(YYYY_MM_DD);
        __CLR4_5_218mj18mjlvha7ixd.R.inc(57943);assertTrue(printer.toString().startsWith("FastDate"));
    }finally{__CLR4_5_218mj18mjlvha7ixd.R.flushNeeded();}}
    
    @Test
    public void testPatternMatches() {__CLR4_5_218mj18mjlvha7ixd.R.globalSliceStart(getClass().getName(),57944);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2na8f5018pk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_218mj18mjlvha7ixd.R.rethrow($CLV_t2$);}finally{__CLR4_5_218mj18mjlvha7ixd.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.FastDatePrinterTest.testPatternMatches",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),57944,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2na8f5018pk(){try{__CLR4_5_218mj18mjlvha7ixd.R.inc(57944);
        __CLR4_5_218mj18mjlvha7ixd.R.inc(57945);final DatePrinter printer= getInstance(YYYY_MM_DD);
        __CLR4_5_218mj18mjlvha7ixd.R.inc(57946);assertEquals(YYYY_MM_DD, printer.getPattern());
    }finally{__CLR4_5_218mj18mjlvha7ixd.R.flushNeeded();}}
    
    @Test
    public void testLocaleMatches() {__CLR4_5_218mj18mjlvha7ixd.R.globalSliceStart(getClass().getName(),57947);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2pxtz0y18pn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_218mj18mjlvha7ixd.R.rethrow($CLV_t2$);}finally{__CLR4_5_218mj18mjlvha7ixd.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.FastDatePrinterTest.testLocaleMatches",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),57947,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2pxtz0y18pn(){try{__CLR4_5_218mj18mjlvha7ixd.R.inc(57947);
        __CLR4_5_218mj18mjlvha7ixd.R.inc(57948);final DatePrinter printer= getInstance(YYYY_MM_DD, SWEDEN);
        __CLR4_5_218mj18mjlvha7ixd.R.inc(57949);assertEquals(SWEDEN, printer.getLocale());
    }finally{__CLR4_5_218mj18mjlvha7ixd.R.flushNeeded();}}
    
    @Test
    public void testTimeZoneMatches() {__CLR4_5_218mj18mjlvha7ixd.R.globalSliceStart(getClass().getName(),57950);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2qy3lf318pq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_218mj18mjlvha7ixd.R.rethrow($CLV_t2$);}finally{__CLR4_5_218mj18mjlvha7ixd.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.FastDatePrinterTest.testTimeZoneMatches",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),57950,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2qy3lf318pq(){try{__CLR4_5_218mj18mjlvha7ixd.R.inc(57950);
        __CLR4_5_218mj18mjlvha7ixd.R.inc(57951);final DatePrinter printer= getInstance(YYYY_MM_DD, NEW_YORK);
        __CLR4_5_218mj18mjlvha7ixd.R.inc(57952);assertEquals(NEW_YORK, printer.getTimeZone());
    }finally{__CLR4_5_218mj18mjlvha7ixd.R.flushNeeded();}}

    @SystemDefaults(timezone="UTC")
    @Test
    public void testTimeZoneAsZ() throws Exception {__CLR4_5_218mj18mjlvha7ixd.R.globalSliceStart(getClass().getName(),57953);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2uc3e7w18pt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_218mj18mjlvha7ixd.R.rethrow($CLV_t2$);}finally{__CLR4_5_218mj18mjlvha7ixd.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.FastDatePrinterTest.testTimeZoneAsZ",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),57953,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2uc3e7w18pt() throws Exception{try{__CLR4_5_218mj18mjlvha7ixd.R.inc(57953);
        __CLR4_5_218mj18mjlvha7ixd.R.inc(57954);final Calendar c = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        __CLR4_5_218mj18mjlvha7ixd.R.inc(57955);final FastDateFormat noColonFormat = FastDateFormat.getInstance("Z");
        __CLR4_5_218mj18mjlvha7ixd.R.inc(57956);assertEquals("+0000", noColonFormat.format(c));
        
        __CLR4_5_218mj18mjlvha7ixd.R.inc(57957);final FastDateFormat isoFormat = FastDateFormat.getInstance("ZZ");
        __CLR4_5_218mj18mjlvha7ixd.R.inc(57958);assertEquals("Z", isoFormat.format(c));
        
        __CLR4_5_218mj18mjlvha7ixd.R.inc(57959);final FastDateFormat colonFormat = FastDateFormat.getInstance("ZZZ");
        __CLR4_5_218mj18mjlvha7ixd.R.inc(57960);assertEquals("+00:00", colonFormat.format(c));
    }finally{__CLR4_5_218mj18mjlvha7ixd.R.flushNeeded();}}

    private static Calendar initializeCalendar(final TimeZone tz) {try{__CLR4_5_218mj18mjlvha7ixd.R.inc(57961);
        __CLR4_5_218mj18mjlvha7ixd.R.inc(57962);final Calendar cal = Calendar.getInstance(tz);
        __CLR4_5_218mj18mjlvha7ixd.R.inc(57963);cal.set(Calendar.YEAR, 2001);
        __CLR4_5_218mj18mjlvha7ixd.R.inc(57964);cal.set(Calendar.MONTH, 1); // not daylight savings
        __CLR4_5_218mj18mjlvha7ixd.R.inc(57965);cal.set(Calendar.DAY_OF_MONTH, 4);
        __CLR4_5_218mj18mjlvha7ixd.R.inc(57966);cal.set(Calendar.HOUR_OF_DAY, 12);
        __CLR4_5_218mj18mjlvha7ixd.R.inc(57967);cal.set(Calendar.MINUTE, 8);
        __CLR4_5_218mj18mjlvha7ixd.R.inc(57968);cal.set(Calendar.SECOND, 56);
        __CLR4_5_218mj18mjlvha7ixd.R.inc(57969);cal.set(Calendar.MILLISECOND, 235);
        __CLR4_5_218mj18mjlvha7ixd.R.inc(57970);return cal;
    }finally{__CLR4_5_218mj18mjlvha7ixd.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class)
    public void test1806Argument() {__CLR4_5_218mj18mjlvha7ixd.R.globalSliceStart(getClass().getName(),57971);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26rv59918qb();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,49,56,48,54,65,114,103,117,109,101,110,116,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_218mj18mjlvha7ixd.R.rethrow($CLV_t2$);}finally{__CLR4_5_218mj18mjlvha7ixd.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.FastDatePrinterTest.test1806Argument",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),57971,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26rv59918qb(){try{__CLR4_5_218mj18mjlvha7ixd.R.inc(57971);
        __CLR4_5_218mj18mjlvha7ixd.R.inc(57972);getInstance("XXXX");
    }finally{__CLR4_5_218mj18mjlvha7ixd.R.flushNeeded();}}

    private static enum Expected1806 {
        India(INDIA, "+05", "+0530", "+05:30"), Greenwich(GMT, "Z", "Z", "Z"), NewYork(
                NEW_YORK, "-05", "-0500", "-05:00");

        private Expected1806(final TimeZone zone, final String one, final String two, final String three) {try{__CLR4_5_218mj18mjlvha7ixd.R.inc(57973);
            __CLR4_5_218mj18mjlvha7ixd.R.inc(57974);this.zone = zone;
            __CLR4_5_218mj18mjlvha7ixd.R.inc(57975);this.one = one;
            __CLR4_5_218mj18mjlvha7ixd.R.inc(57976);this.two = two;
            __CLR4_5_218mj18mjlvha7ixd.R.inc(57977);this.three = three;
        }finally{__CLR4_5_218mj18mjlvha7ixd.R.flushNeeded();}}

        final TimeZone zone;
        final String one;
        final String two;
        final String three;
    }

    @Test
    public void test1806() throws ParseException {__CLR4_5_218mj18mjlvha7ixd.R.globalSliceStart(getClass().getName(),57978);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2apri3q18qi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_218mj18mjlvha7ixd.R.rethrow($CLV_t2$);}finally{__CLR4_5_218mj18mjlvha7ixd.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.FastDatePrinterTest.test1806",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),57978,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2apri3q18qi() throws ParseException{try{__CLR4_5_218mj18mjlvha7ixd.R.inc(57978);
        __CLR4_5_218mj18mjlvha7ixd.R.inc(57979);for (final Expected1806 trial : Expected1806.values()) {{
            __CLR4_5_218mj18mjlvha7ixd.R.inc(57980);final Calendar cal = initializeCalendar(trial.zone);

            __CLR4_5_218mj18mjlvha7ixd.R.inc(57981);DatePrinter printer = getInstance("X", trial.zone);
            __CLR4_5_218mj18mjlvha7ixd.R.inc(57982);assertEquals(trial.one, printer.format(cal));

            __CLR4_5_218mj18mjlvha7ixd.R.inc(57983);printer = getInstance("XX", trial.zone);
            __CLR4_5_218mj18mjlvha7ixd.R.inc(57984);assertEquals(trial.two, printer.format(cal));

            __CLR4_5_218mj18mjlvha7ixd.R.inc(57985);printer = getInstance("XXX", trial.zone);
            __CLR4_5_218mj18mjlvha7ixd.R.inc(57986);assertEquals(trial.three, printer.format(cal));
        }
    }}finally{__CLR4_5_218mj18mjlvha7ixd.R.flushNeeded();}}
    
    @Test
    public void testLang1103() throws ParseException {__CLR4_5_218mj18mjlvha7ixd.R.globalSliceStart(getClass().getName(),57987);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21mzm3u18qr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_218mj18mjlvha7ixd.R.rethrow($CLV_t2$);}finally{__CLR4_5_218mj18mjlvha7ixd.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.FastDatePrinterTest.testLang1103",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),57987,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21mzm3u18qr() throws ParseException{try{__CLR4_5_218mj18mjlvha7ixd.R.inc(57987);
        __CLR4_5_218mj18mjlvha7ixd.R.inc(57988);final Calendar cal = Calendar.getInstance(SWEDEN);
        __CLR4_5_218mj18mjlvha7ixd.R.inc(57989);cal.set(Calendar.DAY_OF_MONTH, 2);

        __CLR4_5_218mj18mjlvha7ixd.R.inc(57990);assertEquals("2", getInstance("d", SWEDEN).format(cal));
        __CLR4_5_218mj18mjlvha7ixd.R.inc(57991);assertEquals("02", getInstance("dd", SWEDEN).format(cal));
        __CLR4_5_218mj18mjlvha7ixd.R.inc(57992);assertEquals("002", getInstance("ddd", SWEDEN).format(cal));
        __CLR4_5_218mj18mjlvha7ixd.R.inc(57993);assertEquals("0002", getInstance("dddd", SWEDEN).format(cal));
        __CLR4_5_218mj18mjlvha7ixd.R.inc(57994);assertEquals("00002", getInstance("ddddd", SWEDEN).format(cal));
    }finally{__CLR4_5_218mj18mjlvha7ixd.R.flushNeeded();}}

    /**
     * According to LANG-916 (https://issues.apache.org/jira/browse/LANG-916),
     * the format method did contain a bug: it did not use the TimeZone data.
     *
     * This method test that the bug is fixed.
     */
    @Test
    public void testLang916() throws Exception {__CLR4_5_218mj18mjlvha7ixd.R.globalSliceStart(getClass().getName(),57995);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2x2fp5118qz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_218mj18mjlvha7ixd.R.rethrow($CLV_t2$);}finally{__CLR4_5_218mj18mjlvha7ixd.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.FastDatePrinterTest.testLang916",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),57995,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2x2fp5118qz() throws Exception{try{__CLR4_5_218mj18mjlvha7ixd.R.inc(57995);

        __CLR4_5_218mj18mjlvha7ixd.R.inc(57996);final Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("Europe/Paris"));
        __CLR4_5_218mj18mjlvha7ixd.R.inc(57997);cal.clear();
        __CLR4_5_218mj18mjlvha7ixd.R.inc(57998);cal.set(2009, 9, 16, 8, 42, 16);

        // calendar fast.
        {
            __CLR4_5_218mj18mjlvha7ixd.R.inc(57999);final String value = FastDateFormat.getInstance("yyyy-MM-dd'T'HH:mm:ss Z", TimeZone.getTimeZone("Europe/Paris")).format(cal);
            __CLR4_5_218mj18mjlvha7ixd.R.inc(58000);assertEquals("calendar", "2009-10-16T08:42:16 +0200", value);
        }
        {
            __CLR4_5_218mj18mjlvha7ixd.R.inc(58001);final String value = FastDateFormat.getInstance("yyyy-MM-dd'T'HH:mm:ss Z", TimeZone.getTimeZone("Asia/Kolkata")).format(cal);
            __CLR4_5_218mj18mjlvha7ixd.R.inc(58002);assertEquals("calendar", "2009-10-16T12:12:16 +0530", value);
        }
        {
            __CLR4_5_218mj18mjlvha7ixd.R.inc(58003);final String value = FastDateFormat.getInstance("yyyy-MM-dd'T'HH:mm:ss Z", TimeZone.getTimeZone("Europe/London")).format(cal);
            __CLR4_5_218mj18mjlvha7ixd.R.inc(58004);assertEquals("calendar", "2009-10-16T07:42:16 +0100", value);
        }
    }finally{__CLR4_5_218mj18mjlvha7ixd.R.flushNeeded();}}

    @Test
    public void testHourFormats() {__CLR4_5_218mj18mjlvha7ixd.R.globalSliceStart(getClass().getName(),58005);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2rkhbbn18r9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_218mj18mjlvha7ixd.R.rethrow($CLV_t2$);}finally{__CLR4_5_218mj18mjlvha7ixd.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.FastDatePrinterTest.testHourFormats",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),58005,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2rkhbbn18r9(){try{__CLR4_5_218mj18mjlvha7ixd.R.inc(58005);
        __CLR4_5_218mj18mjlvha7ixd.R.inc(58006);final Calendar calendar = Calendar.getInstance();
        __CLR4_5_218mj18mjlvha7ixd.R.inc(58007);calendar.clear();
        __CLR4_5_218mj18mjlvha7ixd.R.inc(58008);final DatePrinter printer = getInstance("K k H h");

        __CLR4_5_218mj18mjlvha7ixd.R.inc(58009);calendar.set(Calendar.HOUR_OF_DAY, 0);
        __CLR4_5_218mj18mjlvha7ixd.R.inc(58010);assertEquals("0 24 0 12", printer.format(calendar));

        __CLR4_5_218mj18mjlvha7ixd.R.inc(58011);calendar.set(Calendar.HOUR_OF_DAY, 12);
        __CLR4_5_218mj18mjlvha7ixd.R.inc(58012);assertEquals("0 12 12 12", printer.format(calendar));

        __CLR4_5_218mj18mjlvha7ixd.R.inc(58013);calendar.set(Calendar.HOUR_OF_DAY, 23);
        __CLR4_5_218mj18mjlvha7ixd.R.inc(58014);assertEquals("11 23 23 11", printer.format(calendar));
    }finally{__CLR4_5_218mj18mjlvha7ixd.R.flushNeeded();}}

    @SuppressWarnings("deprecation")
    @Test
    public void testStringBufferOptions() {__CLR4_5_218mj18mjlvha7ixd.R.globalSliceStart(getClass().getName(),58015);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2m8oh2618rj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_218mj18mjlvha7ixd.R.rethrow($CLV_t2$);}finally{__CLR4_5_218mj18mjlvha7ixd.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.FastDatePrinterTest.testStringBufferOptions",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),58015,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2m8oh2618rj(){try{__CLR4_5_218mj18mjlvha7ixd.R.inc(58015);
        __CLR4_5_218mj18mjlvha7ixd.R.inc(58016);final DatePrinter format = getInstance("yyyy-MM-dd HH:mm:ss.SSS Z", TimeZone.getTimeZone("GMT"));
        __CLR4_5_218mj18mjlvha7ixd.R.inc(58017);final Calendar calendar = Calendar.getInstance();
        __CLR4_5_218mj18mjlvha7ixd.R.inc(58018);final StringBuffer sb = new StringBuffer();
        __CLR4_5_218mj18mjlvha7ixd.R.inc(58019);final String expected = format.format(calendar, sb, new FieldPosition(0)).toString();
        __CLR4_5_218mj18mjlvha7ixd.R.inc(58020);sb.setLength(0);
        __CLR4_5_218mj18mjlvha7ixd.R.inc(58021);assertEquals(expected, format.format(calendar, sb).toString());
        __CLR4_5_218mj18mjlvha7ixd.R.inc(58022);sb.setLength(0);

        __CLR4_5_218mj18mjlvha7ixd.R.inc(58023);final Date date = calendar.getTime();
        __CLR4_5_218mj18mjlvha7ixd.R.inc(58024);assertEquals(expected, format.format(date, sb, new FieldPosition(0)).toString());
        __CLR4_5_218mj18mjlvha7ixd.R.inc(58025);sb.setLength(0);
        __CLR4_5_218mj18mjlvha7ixd.R.inc(58026);assertEquals(expected, format.format(date, sb).toString());
        __CLR4_5_218mj18mjlvha7ixd.R.inc(58027);sb.setLength(0);

        __CLR4_5_218mj18mjlvha7ixd.R.inc(58028);final long epoch = date.getTime();
        __CLR4_5_218mj18mjlvha7ixd.R.inc(58029);assertEquals(expected, format.format(epoch, sb, new FieldPosition(0)).toString());
        __CLR4_5_218mj18mjlvha7ixd.R.inc(58030);sb.setLength(0);
        __CLR4_5_218mj18mjlvha7ixd.R.inc(58031);assertEquals(expected, format.format(epoch, sb).toString());
    }finally{__CLR4_5_218mj18mjlvha7ixd.R.flushNeeded();}}

    @Test
    public void testAppendableOptions() {__CLR4_5_218mj18mjlvha7ixd.R.globalSliceStart(getClass().getName(),58032);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ylo21r18s0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_218mj18mjlvha7ixd.R.rethrow($CLV_t2$);}finally{__CLR4_5_218mj18mjlvha7ixd.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.FastDatePrinterTest.testAppendableOptions",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),58032,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ylo21r18s0(){try{__CLR4_5_218mj18mjlvha7ixd.R.inc(58032);
        __CLR4_5_218mj18mjlvha7ixd.R.inc(58033);final DatePrinter format = getInstance("yyyy-MM-dd HH:mm:ss.SSS Z", TimeZone.getTimeZone("GMT"));
        __CLR4_5_218mj18mjlvha7ixd.R.inc(58034);final Calendar calendar = Calendar.getInstance();
        __CLR4_5_218mj18mjlvha7ixd.R.inc(58035);final StringBuilder sb = new StringBuilder();
        __CLR4_5_218mj18mjlvha7ixd.R.inc(58036);final String expected = format.format(calendar, sb).toString();
        __CLR4_5_218mj18mjlvha7ixd.R.inc(58037);sb.setLength(0);

        __CLR4_5_218mj18mjlvha7ixd.R.inc(58038);final Date date = calendar.getTime();
        __CLR4_5_218mj18mjlvha7ixd.R.inc(58039);assertEquals(expected, format.format(date, sb).toString());
        __CLR4_5_218mj18mjlvha7ixd.R.inc(58040);sb.setLength(0);

        __CLR4_5_218mj18mjlvha7ixd.R.inc(58041);final long epoch = date.getTime();
        __CLR4_5_218mj18mjlvha7ixd.R.inc(58042);assertEquals(expected, format.format(epoch, sb).toString());
    }finally{__CLR4_5_218mj18mjlvha7ixd.R.flushNeeded();}}

    @Test
    public void testDayNumberOfWeek() {__CLR4_5_218mj18mjlvha7ixd.R.globalSliceStart(getClass().getName(),58043);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ppm0m318sb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_218mj18mjlvha7ixd.R.rethrow($CLV_t2$);}finally{__CLR4_5_218mj18mjlvha7ixd.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.FastDatePrinterTest.testDayNumberOfWeek",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),58043,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ppm0m318sb(){try{__CLR4_5_218mj18mjlvha7ixd.R.inc(58043);
        __CLR4_5_218mj18mjlvha7ixd.R.inc(58044);final DatePrinter printer = getInstance("u");
        __CLR4_5_218mj18mjlvha7ixd.R.inc(58045);final Calendar calendar = Calendar.getInstance();

        __CLR4_5_218mj18mjlvha7ixd.R.inc(58046);calendar.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
        __CLR4_5_218mj18mjlvha7ixd.R.inc(58047);assertEquals("1", printer.format(calendar.getTime()));

        __CLR4_5_218mj18mjlvha7ixd.R.inc(58048);calendar.set(Calendar.DAY_OF_WEEK, Calendar.SATURDAY);
        __CLR4_5_218mj18mjlvha7ixd.R.inc(58049);assertEquals("6", printer.format(calendar.getTime()));

        __CLR4_5_218mj18mjlvha7ixd.R.inc(58050);calendar.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
        __CLR4_5_218mj18mjlvha7ixd.R.inc(58051);assertEquals("7", printer.format(calendar.getTime()));
    }finally{__CLR4_5_218mj18mjlvha7ixd.R.flushNeeded();}}
}
