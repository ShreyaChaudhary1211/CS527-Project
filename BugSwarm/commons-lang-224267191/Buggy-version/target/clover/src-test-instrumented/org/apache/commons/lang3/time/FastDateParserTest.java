/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional inparserion regarding copyright ownership.
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
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

import org.apache.commons.lang3.LocaleUtils;
import org.apache.commons.lang3.SerializationUtils;
import org.junit.Assert;
import org.junit.Test;

/**
 * Unit tests {@link org.apache.commons.lang3.time.FastDateParser}.
 *
 * @since 3.2
 */
public class FastDateParserTest {static class __CLR4_5_2189d189dlvha7iux{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172763741L,8589935092L,57760,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private static final String SHORT_FORMAT_NOERA = "y/M/d/h/a/m/s/E";
    private static final String LONG_FORMAT_NOERA = "yyyy/MMMM/dddd/hhhh/mmmm/ss/aaaa/EEEE";
    private static final String SHORT_FORMAT = "G/" + SHORT_FORMAT_NOERA;
    private static final String LONG_FORMAT = "GGGG/" + LONG_FORMAT_NOERA;

    private static final String yMdHmsSZ = "yyyy-MM-dd'T'HH:mm:ss.SSS Z";
    private static final String DMY_DOT = "dd.MM.yyyy";
    private static final String YMD_SLASH = "yyyy/MM/dd";
    private static final String MDY_DASH = "MM-DD-yyyy";
    private static final String MDY_SLASH = "MM/DD/yyyy";

    private static final TimeZone REYKJAVIK = TimeZone.getTimeZone("Atlantic/Reykjavik");
    private static final TimeZone NEW_YORK = TimeZone.getTimeZone("America/New_York");
    private static final TimeZone GMT = TimeZone.getTimeZone("GMT");
    private static final TimeZone INDIA = TimeZone.getTimeZone("Asia/Calcutta");

    private static final Locale SWEDEN = new Locale("sv", "SE");

    DateParser getInstance(final String format) {try{__CLR4_5_2189d189dlvha7iux.R.inc(57361);
        __CLR4_5_2189d189dlvha7iux.R.inc(57362);return getInstance(format, TimeZone.getDefault(), Locale.getDefault());
    }finally{__CLR4_5_2189d189dlvha7iux.R.flushNeeded();}}

    private DateParser getDateInstance(final int dateStyle, final Locale locale) {try{__CLR4_5_2189d189dlvha7iux.R.inc(57363);
        __CLR4_5_2189d189dlvha7iux.R.inc(57364);return getInstance(FormatCache.getPatternForStyle(Integer.valueOf(dateStyle), null, locale), TimeZone.getDefault(), Locale.getDefault());
    }finally{__CLR4_5_2189d189dlvha7iux.R.flushNeeded();}}

    private DateParser getInstance(final String format, final Locale locale) {try{__CLR4_5_2189d189dlvha7iux.R.inc(57365);
        __CLR4_5_2189d189dlvha7iux.R.inc(57366);return getInstance(format, TimeZone.getDefault(), locale);
    }finally{__CLR4_5_2189d189dlvha7iux.R.flushNeeded();}}

    private DateParser getInstance(final String format, final TimeZone timeZone) {try{__CLR4_5_2189d189dlvha7iux.R.inc(57367);
        __CLR4_5_2189d189dlvha7iux.R.inc(57368);return getInstance(format, timeZone, Locale.getDefault());
    }finally{__CLR4_5_2189d189dlvha7iux.R.flushNeeded();}}

    /**
     * Override this method in derived tests to change the construction of instances
     *
     * @param format the format string to use
     * @param timeZone the time zone to use
     * @param locale the locale to use
     *
     * @return the DateParser instance to use for testing
     */
    protected DateParser getInstance(final String format, final TimeZone timeZone, final Locale locale) {try{__CLR4_5_2189d189dlvha7iux.R.inc(57369);
        __CLR4_5_2189d189dlvha7iux.R.inc(57370);return new FastDateParser(format, timeZone, locale, null);
    }finally{__CLR4_5_2189d189dlvha7iux.R.flushNeeded();}}

    @Test
    public void test_Equality_Hash() {__CLR4_5_2189d189dlvha7iux.R.globalSliceStart(getClass().getName(),57371);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_29qhnm5189n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2189d189dlvha7iux.R.rethrow($CLV_t2$);}finally{__CLR4_5_2189d189dlvha7iux.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.FastDateParserTest.test_Equality_Hash",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),57371,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_29qhnm5189n(){try{__CLR4_5_2189d189dlvha7iux.R.inc(57371);
        __CLR4_5_2189d189dlvha7iux.R.inc(57372);final DateParser[] parsers= {
            getInstance(yMdHmsSZ, NEW_YORK, Locale.US),
            getInstance(DMY_DOT, NEW_YORK, Locale.US),
            getInstance(YMD_SLASH, NEW_YORK, Locale.US),
            getInstance(MDY_DASH, NEW_YORK, Locale.US),
            getInstance(MDY_SLASH, NEW_YORK, Locale.US),
            getInstance(MDY_SLASH, REYKJAVIK, Locale.US),
            getInstance(MDY_SLASH, REYKJAVIK, SWEDEN)
        };

        __CLR4_5_2189d189dlvha7iux.R.inc(57373);final Map<DateParser,Integer> map= new HashMap<>();
        __CLR4_5_2189d189dlvha7iux.R.inc(57374);int i= 0;
        __CLR4_5_2189d189dlvha7iux.R.inc(57375);for(final DateParser parser:parsers) {{
            __CLR4_5_2189d189dlvha7iux.R.inc(57376);map.put(parser, Integer.valueOf(i++));
        }

        }__CLR4_5_2189d189dlvha7iux.R.inc(57377);i= 0;
        __CLR4_5_2189d189dlvha7iux.R.inc(57378);for(final DateParser parser:parsers) {{
            __CLR4_5_2189d189dlvha7iux.R.inc(57379);assertEquals(i++, map.get(parser).intValue());
        }
    }}finally{__CLR4_5_2189d189dlvha7iux.R.flushNeeded();}}

    @Test
    public void testParseZone() throws ParseException {__CLR4_5_2189d189dlvha7iux.R.globalSliceStart(getClass().getName(),57380);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vj5aks189w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2189d189dlvha7iux.R.rethrow($CLV_t2$);}finally{__CLR4_5_2189d189dlvha7iux.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.FastDateParserTest.testParseZone",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),57380,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vj5aks189w() throws ParseException{try{__CLR4_5_2189d189dlvha7iux.R.inc(57380);
        __CLR4_5_2189d189dlvha7iux.R.inc(57381);final Calendar cal= Calendar.getInstance(NEW_YORK, Locale.US);
        __CLR4_5_2189d189dlvha7iux.R.inc(57382);cal.clear();
        __CLR4_5_2189d189dlvha7iux.R.inc(57383);cal.set(2003, Calendar.JULY, 10, 16, 33, 20);

        __CLR4_5_2189d189dlvha7iux.R.inc(57384);final DateParser fdf = getInstance(yMdHmsSZ, NEW_YORK, Locale.US);

        __CLR4_5_2189d189dlvha7iux.R.inc(57385);assertEquals(cal.getTime(), fdf.parse("2003-07-10T15:33:20.000 -0500"));
        __CLR4_5_2189d189dlvha7iux.R.inc(57386);assertEquals(cal.getTime(), fdf.parse("2003-07-10T15:33:20.000 GMT-05:00"));
        __CLR4_5_2189d189dlvha7iux.R.inc(57387);assertEquals(cal.getTime(), fdf.parse("2003-07-10T16:33:20.000 Eastern Daylight Time"));
        __CLR4_5_2189d189dlvha7iux.R.inc(57388);assertEquals(cal.getTime(), fdf.parse("2003-07-10T16:33:20.000 EDT"));

        __CLR4_5_2189d189dlvha7iux.R.inc(57389);cal.setTimeZone(TimeZone.getTimeZone("GMT-3"));
        __CLR4_5_2189d189dlvha7iux.R.inc(57390);cal.set(2003, Calendar.FEBRUARY, 10, 9, 0, 0);

        __CLR4_5_2189d189dlvha7iux.R.inc(57391);assertEquals(cal.getTime(), fdf.parse("2003-02-10T09:00:00.000 -0300"));

        __CLR4_5_2189d189dlvha7iux.R.inc(57392);cal.setTimeZone(TimeZone.getTimeZone("GMT+5"));
        __CLR4_5_2189d189dlvha7iux.R.inc(57393);cal.set(2003, Calendar.FEBRUARY, 10, 15, 5, 6);

        __CLR4_5_2189d189dlvha7iux.R.inc(57394);assertEquals(cal.getTime(), fdf.parse("2003-02-10T15:05:06.000 +0500"));
    }finally{__CLR4_5_2189d189dlvha7iux.R.flushNeeded();}}

    @Test
    public void testParseLongShort() throws ParseException {__CLR4_5_2189d189dlvha7iux.R.globalSliceStart(getClass().getName(),57395);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2660rra18ab();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2189d189dlvha7iux.R.rethrow($CLV_t2$);}finally{__CLR4_5_2189d189dlvha7iux.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.FastDateParserTest.testParseLongShort",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),57395,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2660rra18ab() throws ParseException{try{__CLR4_5_2189d189dlvha7iux.R.inc(57395);
        __CLR4_5_2189d189dlvha7iux.R.inc(57396);final Calendar cal= Calendar.getInstance(NEW_YORK, Locale.US);
        __CLR4_5_2189d189dlvha7iux.R.inc(57397);cal.clear();
        __CLR4_5_2189d189dlvha7iux.R.inc(57398);cal.set(2003, Calendar.FEBRUARY, 10, 15, 33, 20);
        __CLR4_5_2189d189dlvha7iux.R.inc(57399);cal.set(Calendar.MILLISECOND, 989);
        __CLR4_5_2189d189dlvha7iux.R.inc(57400);cal.setTimeZone(NEW_YORK);

        __CLR4_5_2189d189dlvha7iux.R.inc(57401);DateParser fdf = getInstance("yyyy GGGG MMMM dddd aaaa EEEE HHHH mmmm ssss SSSS ZZZZ", NEW_YORK, Locale.US);

        __CLR4_5_2189d189dlvha7iux.R.inc(57402);assertEquals(cal.getTime(), fdf.parse("2003 AD February 0010 PM Monday 0015 0033 0020 0989 GMT-05:00"));
        __CLR4_5_2189d189dlvha7iux.R.inc(57403);cal.set(Calendar.ERA, GregorianCalendar.BC);

        __CLR4_5_2189d189dlvha7iux.R.inc(57404);final Date parse = fdf.parse("2003 BC February 0010 PM Saturday 0015 0033 0020 0989 GMT-05:00");
                __CLR4_5_2189d189dlvha7iux.R.inc(57405);assertEquals(cal.getTime(), parse);

        __CLR4_5_2189d189dlvha7iux.R.inc(57406);fdf = getInstance("y G M d a E H m s S Z", NEW_YORK, Locale.US);
        __CLR4_5_2189d189dlvha7iux.R.inc(57407);assertEquals(cal.getTime(), fdf.parse("03 BC 2 10 PM Sat 15 33 20 989 -0500"));

        __CLR4_5_2189d189dlvha7iux.R.inc(57408);cal.set(Calendar.ERA, GregorianCalendar.AD);
        __CLR4_5_2189d189dlvha7iux.R.inc(57409);assertEquals(cal.getTime(), fdf.parse("03 AD 2 10 PM Saturday 15 33 20 989 -0500"));
    }finally{__CLR4_5_2189d189dlvha7iux.R.flushNeeded();}}

    @Test
    public void testAmPm() throws ParseException {__CLR4_5_2189d189dlvha7iux.R.globalSliceStart(getClass().getName(),57410);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vjul2618aq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2189d189dlvha7iux.R.rethrow($CLV_t2$);}finally{__CLR4_5_2189d189dlvha7iux.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.FastDateParserTest.testAmPm",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),57410,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vjul2618aq() throws ParseException{try{__CLR4_5_2189d189dlvha7iux.R.inc(57410);
        __CLR4_5_2189d189dlvha7iux.R.inc(57411);final Calendar cal= Calendar.getInstance(NEW_YORK, Locale.US);
        __CLR4_5_2189d189dlvha7iux.R.inc(57412);cal.clear();

        __CLR4_5_2189d189dlvha7iux.R.inc(57413);final DateParser h = getInstance("yyyy-MM-dd hh a mm:ss", NEW_YORK, Locale.US);
        __CLR4_5_2189d189dlvha7iux.R.inc(57414);final DateParser K = getInstance("yyyy-MM-dd KK a mm:ss", NEW_YORK, Locale.US);
        __CLR4_5_2189d189dlvha7iux.R.inc(57415);final DateParser k = getInstance("yyyy-MM-dd kk:mm:ss", NEW_YORK, Locale.US);
        __CLR4_5_2189d189dlvha7iux.R.inc(57416);final DateParser H = getInstance("yyyy-MM-dd HH:mm:ss", NEW_YORK, Locale.US);

        __CLR4_5_2189d189dlvha7iux.R.inc(57417);cal.set(2010, Calendar.AUGUST, 1, 0, 33, 20);
        __CLR4_5_2189d189dlvha7iux.R.inc(57418);assertEquals(cal.getTime(), h.parse("2010-08-01 12 AM 33:20"));
        __CLR4_5_2189d189dlvha7iux.R.inc(57419);assertEquals(cal.getTime(), K.parse("2010-08-01 0 AM 33:20"));
        __CLR4_5_2189d189dlvha7iux.R.inc(57420);assertEquals(cal.getTime(), k.parse("2010-08-01 00:33:20"));
        __CLR4_5_2189d189dlvha7iux.R.inc(57421);assertEquals(cal.getTime(), H.parse("2010-08-01 00:33:20"));

        __CLR4_5_2189d189dlvha7iux.R.inc(57422);cal.set(2010, Calendar.AUGUST, 1, 3, 33, 20);
        __CLR4_5_2189d189dlvha7iux.R.inc(57423);assertEquals(cal.getTime(), h.parse("2010-08-01 3 AM 33:20"));
        __CLR4_5_2189d189dlvha7iux.R.inc(57424);assertEquals(cal.getTime(), K.parse("2010-08-01 3 AM 33:20"));
        __CLR4_5_2189d189dlvha7iux.R.inc(57425);assertEquals(cal.getTime(), k.parse("2010-08-01 03:33:20"));
        __CLR4_5_2189d189dlvha7iux.R.inc(57426);assertEquals(cal.getTime(), H.parse("2010-08-01 03:33:20"));

        __CLR4_5_2189d189dlvha7iux.R.inc(57427);cal.set(2010, Calendar.AUGUST, 1, 15, 33, 20);
        __CLR4_5_2189d189dlvha7iux.R.inc(57428);assertEquals(cal.getTime(), h.parse("2010-08-01 3 PM 33:20"));
        __CLR4_5_2189d189dlvha7iux.R.inc(57429);assertEquals(cal.getTime(), K.parse("2010-08-01 3 PM 33:20"));
        __CLR4_5_2189d189dlvha7iux.R.inc(57430);assertEquals(cal.getTime(), k.parse("2010-08-01 15:33:20"));
        __CLR4_5_2189d189dlvha7iux.R.inc(57431);assertEquals(cal.getTime(), H.parse("2010-08-01 15:33:20"));

        __CLR4_5_2189d189dlvha7iux.R.inc(57432);cal.set(2010, Calendar.AUGUST, 1, 12, 33, 20);
        __CLR4_5_2189d189dlvha7iux.R.inc(57433);assertEquals(cal.getTime(), h.parse("2010-08-01 12 PM 33:20"));
        __CLR4_5_2189d189dlvha7iux.R.inc(57434);assertEquals(cal.getTime(), K.parse("2010-08-01 0 PM 33:20"));
        __CLR4_5_2189d189dlvha7iux.R.inc(57435);assertEquals(cal.getTime(), k.parse("2010-08-01 12:33:20"));
        __CLR4_5_2189d189dlvha7iux.R.inc(57436);assertEquals(cal.getTime(), H.parse("2010-08-01 12:33:20"));
    }finally{__CLR4_5_2189d189dlvha7iux.R.flushNeeded();}}

    private Calendar getEraStart(int year, final TimeZone zone, final Locale locale) {try{__CLR4_5_2189d189dlvha7iux.R.inc(57437);
        __CLR4_5_2189d189dlvha7iux.R.inc(57438);final Calendar cal = Calendar.getInstance(zone, locale);
        __CLR4_5_2189d189dlvha7iux.R.inc(57439);cal.clear();

        // http://docs.oracle.com/javase/6/docs/technotes/guides/intl/calendar.doc.html
        __CLR4_5_2189d189dlvha7iux.R.inc(57440);if ((((locale.equals(FastDateParser.JAPANESE_IMPERIAL))&&(__CLR4_5_2189d189dlvha7iux.R.iget(57441)!=0|true))||(__CLR4_5_2189d189dlvha7iux.R.iget(57442)==0&false))) {{
            __CLR4_5_2189d189dlvha7iux.R.inc(57443);if((((year < 1868)&&(__CLR4_5_2189d189dlvha7iux.R.iget(57444)!=0|true))||(__CLR4_5_2189d189dlvha7iux.R.iget(57445)==0&false))) {{
                __CLR4_5_2189d189dlvha7iux.R.inc(57446);cal.set(Calendar.ERA, 0);
                __CLR4_5_2189d189dlvha7iux.R.inc(57447);cal.set(Calendar.YEAR, 1868-year);
            }
        }}
        }else {{
            __CLR4_5_2189d189dlvha7iux.R.inc(57448);if ((((year < 0)&&(__CLR4_5_2189d189dlvha7iux.R.iget(57449)!=0|true))||(__CLR4_5_2189d189dlvha7iux.R.iget(57450)==0&false))) {{
                __CLR4_5_2189d189dlvha7iux.R.inc(57451);cal.set(Calendar.ERA, GregorianCalendar.BC);
                __CLR4_5_2189d189dlvha7iux.R.inc(57452);year= -year;
            }
            }__CLR4_5_2189d189dlvha7iux.R.inc(57453);cal.set(Calendar.YEAR, year/100 * 100);
        }
        }__CLR4_5_2189d189dlvha7iux.R.inc(57454);return cal;
    }finally{__CLR4_5_2189d189dlvha7iux.R.flushNeeded();}}

    private void validateSdfFormatFdpParseEquality(final String format, final Locale locale, final TimeZone tz, final DateParser fdp, final Date in, final int year, final Date cs) throws ParseException {try{__CLR4_5_2189d189dlvha7iux.R.inc(57455);
        __CLR4_5_2189d189dlvha7iux.R.inc(57456);final SimpleDateFormat sdf = new SimpleDateFormat(format, locale);
        __CLR4_5_2189d189dlvha7iux.R.inc(57457);sdf.setTimeZone(tz);
        __CLR4_5_2189d189dlvha7iux.R.inc(57458);if ((((format.equals(SHORT_FORMAT))&&(__CLR4_5_2189d189dlvha7iux.R.iget(57459)!=0|true))||(__CLR4_5_2189d189dlvha7iux.R.iget(57460)==0&false))) {{
            __CLR4_5_2189d189dlvha7iux.R.inc(57461);sdf.set2DigitYearStart( cs );
        }
        }__CLR4_5_2189d189dlvha7iux.R.inc(57462);final String fmt = sdf.format(in);
        __CLR4_5_2189d189dlvha7iux.R.inc(57463);try {
            __CLR4_5_2189d189dlvha7iux.R.inc(57464);final Date out = fdp.parse(fmt);
            __CLR4_5_2189d189dlvha7iux.R.inc(57465);assertEquals(locale.toString()+" "+in+" "+ format+ " "+tz.getID(), in, out);
        } catch (final ParseException pe) {
            __CLR4_5_2189d189dlvha7iux.R.inc(57466);if ((((year >= 1868 || !locale.getCountry().equals("JP"))&&(__CLR4_5_2189d189dlvha7iux.R.iget(57467)!=0|true))||(__CLR4_5_2189d189dlvha7iux.R.iget(57468)==0&false))) {{// LANG-978
                __CLR4_5_2189d189dlvha7iux.R.inc(57469);throw pe;
            }
        }}
    }finally{__CLR4_5_2189d189dlvha7iux.R.flushNeeded();}}

    @Test
    // Check that all Locales can parse the formats we use
    public void testParses() throws Exception {__CLR4_5_2189d189dlvha7iux.R.globalSliceStart(getClass().getName(),57470);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2d58xnd18ce();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2189d189dlvha7iux.R.rethrow($CLV_t2$);}finally{__CLR4_5_2189d189dlvha7iux.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.FastDateParserTest.testParses",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),57470,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2d58xnd18ce() throws Exception{try{__CLR4_5_2189d189dlvha7iux.R.inc(57470);
        __CLR4_5_2189d189dlvha7iux.R.inc(57471);for(final String format : new String[]{LONG_FORMAT, SHORT_FORMAT}) {{
            __CLR4_5_2189d189dlvha7iux.R.inc(57472);for(final Locale locale : Locale.getAvailableLocales()) {{
                __CLR4_5_2189d189dlvha7iux.R.inc(57473);for(final TimeZone tz :  new TimeZone[]{NEW_YORK, REYKJAVIK, GMT}) {{
                     __CLR4_5_2189d189dlvha7iux.R.inc(57474);for(final int year : new int[]{2003, 1940, 1868, 1867, 1, -1, -1940}) {{
                        __CLR4_5_2189d189dlvha7iux.R.inc(57475);final Calendar cal= getEraStart(year, tz, locale);
                        __CLR4_5_2189d189dlvha7iux.R.inc(57476);final Date centuryStart= cal.getTime();

                        __CLR4_5_2189d189dlvha7iux.R.inc(57477);cal.set(Calendar.MONTH, 1);
                        __CLR4_5_2189d189dlvha7iux.R.inc(57478);cal.set(Calendar.DAY_OF_MONTH, 10);
                        __CLR4_5_2189d189dlvha7iux.R.inc(57479);final Date in= cal.getTime();

                        __CLR4_5_2189d189dlvha7iux.R.inc(57480);final FastDateParser fdp= new FastDateParser(format, tz, locale, centuryStart);
                        __CLR4_5_2189d189dlvha7iux.R.inc(57481);validateSdfFormatFdpParseEquality(format, locale, tz, fdp, in, year, centuryStart);
                    }
                }}
            }}
        }}
    }}finally{__CLR4_5_2189d189dlvha7iux.R.flushNeeded();}}

    // we cannot use historic dates to test timezone parsing, some timezones have second offsets
    // as well as hours and minutes which makes the z formats a low fidelity round trip
    @Test
    public void testTzParses() throws Exception {__CLR4_5_2189d189dlvha7iux.R.globalSliceStart(getClass().getName(),57482);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2a4pmtd18cq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2189d189dlvha7iux.R.rethrow($CLV_t2$);}finally{__CLR4_5_2189d189dlvha7iux.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.FastDateParserTest.testTzParses",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),57482,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2a4pmtd18cq() throws Exception{try{__CLR4_5_2189d189dlvha7iux.R.inc(57482);
        // Check that all Locales can parse the time formats we use
        __CLR4_5_2189d189dlvha7iux.R.inc(57483);for(final Locale locale : Locale.getAvailableLocales()) {{
            __CLR4_5_2189d189dlvha7iux.R.inc(57484);final FastDateParser fdp= new FastDateParser("yyyy/MM/dd z", TimeZone.getDefault(), locale);

            __CLR4_5_2189d189dlvha7iux.R.inc(57485);for(final TimeZone tz :  new TimeZone[]{NEW_YORK, REYKJAVIK, GMT}) {{
                __CLR4_5_2189d189dlvha7iux.R.inc(57486);final Calendar cal= Calendar.getInstance(tz, locale);
                __CLR4_5_2189d189dlvha7iux.R.inc(57487);cal.clear();
                __CLR4_5_2189d189dlvha7iux.R.inc(57488);cal.set(Calendar.YEAR, 2000);
                __CLR4_5_2189d189dlvha7iux.R.inc(57489);cal.set(Calendar.MONTH, 1);
                __CLR4_5_2189d189dlvha7iux.R.inc(57490);cal.set(Calendar.DAY_OF_MONTH, 10);
                __CLR4_5_2189d189dlvha7iux.R.inc(57491);final Date expected= cal.getTime();

                __CLR4_5_2189d189dlvha7iux.R.inc(57492);final Date actual = fdp.parse("2000/02/10 "+tz.getDisplayName(locale));
                __CLR4_5_2189d189dlvha7iux.R.inc(57493);Assert.assertEquals("tz:"+tz.getID()+" locale:"+locale.getDisplayName(), expected, actual);
            }
        }}
    }}finally{__CLR4_5_2189d189dlvha7iux.R.flushNeeded();}}


    @Test
    public void testLocales_Long_AD() throws Exception {__CLR4_5_2189d189dlvha7iux.R.globalSliceStart(getClass().getName(),57494);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2pfcr4l18d2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2189d189dlvha7iux.R.rethrow($CLV_t2$);}finally{__CLR4_5_2189d189dlvha7iux.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.FastDateParserTest.testLocales_Long_AD",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),57494,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2pfcr4l18d2() throws Exception{try{__CLR4_5_2189d189dlvha7iux.R.inc(57494);
        __CLR4_5_2189d189dlvha7iux.R.inc(57495);testLocales(LONG_FORMAT, false);
    }finally{__CLR4_5_2189d189dlvha7iux.R.flushNeeded();}}

    @Test
    public void testLocales_Long_BC() throws Exception {__CLR4_5_2189d189dlvha7iux.R.globalSliceStart(getClass().getName(),57496);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2j4wd3h18d4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2189d189dlvha7iux.R.rethrow($CLV_t2$);}finally{__CLR4_5_2189d189dlvha7iux.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.FastDateParserTest.testLocales_Long_BC",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),57496,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2j4wd3h18d4() throws Exception{try{__CLR4_5_2189d189dlvha7iux.R.inc(57496);
        __CLR4_5_2189d189dlvha7iux.R.inc(57497);testLocales(LONG_FORMAT, true);
    }finally{__CLR4_5_2189d189dlvha7iux.R.flushNeeded();}}

    @Test
    public void testLocales_Short_AD() throws Exception {__CLR4_5_2189d189dlvha7iux.R.globalSliceStart(getClass().getName(),57498);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ktvdmj18d6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2189d189dlvha7iux.R.rethrow($CLV_t2$);}finally{__CLR4_5_2189d189dlvha7iux.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.FastDateParserTest.testLocales_Short_AD",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),57498,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ktvdmj18d6() throws Exception{try{__CLR4_5_2189d189dlvha7iux.R.inc(57498);
        __CLR4_5_2189d189dlvha7iux.R.inc(57499);testLocales(SHORT_FORMAT, false);
    }finally{__CLR4_5_2189d189dlvha7iux.R.flushNeeded();}}

    @Test
    public void testLocales_Short_BC() throws Exception {__CLR4_5_2189d189dlvha7iux.R.globalSliceStart(getClass().getName(),57500);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_25mzk4j18d8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2189d189dlvha7iux.R.rethrow($CLV_t2$);}finally{__CLR4_5_2189d189dlvha7iux.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.FastDateParserTest.testLocales_Short_BC",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),57500,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_25mzk4j18d8() throws Exception{try{__CLR4_5_2189d189dlvha7iux.R.inc(57500);
        __CLR4_5_2189d189dlvha7iux.R.inc(57501);testLocales(SHORT_FORMAT, true);
    }finally{__CLR4_5_2189d189dlvha7iux.R.flushNeeded();}}

    @Test
    public void testLocales_LongNoEra_AD() throws Exception {__CLR4_5_2189d189dlvha7iux.R.globalSliceStart(getClass().getName(),57502);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2o8q6i18da();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2189d189dlvha7iux.R.rethrow($CLV_t2$);}finally{__CLR4_5_2189d189dlvha7iux.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.FastDateParserTest.testLocales_LongNoEra_AD",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),57502,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2o8q6i18da() throws Exception{try{__CLR4_5_2189d189dlvha7iux.R.inc(57502);
        __CLR4_5_2189d189dlvha7iux.R.inc(57503);testLocales(LONG_FORMAT_NOERA, false);
    }finally{__CLR4_5_2189d189dlvha7iux.R.flushNeeded();}}

    @Test
    public void testLocales_LongNoEra_BC() throws Exception {__CLR4_5_2189d189dlvha7iux.R.globalSliceStart(getClass().getName(),57504);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2r53nxk18dc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2189d189dlvha7iux.R.rethrow($CLV_t2$);}finally{__CLR4_5_2189d189dlvha7iux.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.FastDateParserTest.testLocales_LongNoEra_BC",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),57504,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2r53nxk18dc() throws Exception{try{__CLR4_5_2189d189dlvha7iux.R.inc(57504);
        __CLR4_5_2189d189dlvha7iux.R.inc(57505);testLocales(LONG_FORMAT_NOERA, true);
    }finally{__CLR4_5_2189d189dlvha7iux.R.flushNeeded();}}

    @Test
    public void testLocales_ShortNoEra_AD() throws Exception {__CLR4_5_2189d189dlvha7iux.R.globalSliceStart(getClass().getName(),57506);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2q4e2jq18de();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2189d189dlvha7iux.R.rethrow($CLV_t2$);}finally{__CLR4_5_2189d189dlvha7iux.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.FastDateParserTest.testLocales_ShortNoEra_AD",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),57506,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2q4e2jq18de() throws Exception{try{__CLR4_5_2189d189dlvha7iux.R.inc(57506);
        __CLR4_5_2189d189dlvha7iux.R.inc(57507);testLocales(SHORT_FORMAT_NOERA, false);
    }finally{__CLR4_5_2189d189dlvha7iux.R.flushNeeded();}}

    @Test
    public void testLocales_ShortNoEra_BC() throws Exception {__CLR4_5_2189d189dlvha7iux.R.globalSliceStart(getClass().getName(),57508);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2cgv7c18dg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2189d189dlvha7iux.R.rethrow($CLV_t2$);}finally{__CLR4_5_2189d189dlvha7iux.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.FastDateParserTest.testLocales_ShortNoEra_BC",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),57508,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2cgv7c18dg() throws Exception{try{__CLR4_5_2189d189dlvha7iux.R.inc(57508);
        __CLR4_5_2189d189dlvha7iux.R.inc(57509);testLocales(SHORT_FORMAT_NOERA, true);
    }finally{__CLR4_5_2189d189dlvha7iux.R.flushNeeded();}}

    private void testLocales(final String format, final boolean eraBC) throws Exception {try{__CLR4_5_2189d189dlvha7iux.R.inc(57510);

        __CLR4_5_2189d189dlvha7iux.R.inc(57511);final Calendar cal= Calendar.getInstance(GMT);
        __CLR4_5_2189d189dlvha7iux.R.inc(57512);cal.clear();
        __CLR4_5_2189d189dlvha7iux.R.inc(57513);cal.set(2003, Calendar.FEBRUARY, 10);
        __CLR4_5_2189d189dlvha7iux.R.inc(57514);if ((((eraBC)&&(__CLR4_5_2189d189dlvha7iux.R.iget(57515)!=0|true))||(__CLR4_5_2189d189dlvha7iux.R.iget(57516)==0&false))) {{
            __CLR4_5_2189d189dlvha7iux.R.inc(57517);cal.set(Calendar.ERA, GregorianCalendar.BC);
        }

        }__CLR4_5_2189d189dlvha7iux.R.inc(57518);for(final Locale locale : Locale.getAvailableLocales() ) {{
            // ja_JP_JP cannot handle dates before 1868 properly
            __CLR4_5_2189d189dlvha7iux.R.inc(57519);if ((((eraBC && locale.equals(FastDateParser.JAPANESE_IMPERIAL))&&(__CLR4_5_2189d189dlvha7iux.R.iget(57520)!=0|true))||(__CLR4_5_2189d189dlvha7iux.R.iget(57521)==0&false))) {{
                __CLR4_5_2189d189dlvha7iux.R.inc(57522);continue;
            }
            }__CLR4_5_2189d189dlvha7iux.R.inc(57523);final SimpleDateFormat sdf = new SimpleDateFormat(format, locale);
            __CLR4_5_2189d189dlvha7iux.R.inc(57524);final DateParser fdf = getInstance(format, locale);

            __CLR4_5_2189d189dlvha7iux.R.inc(57525);try {
                __CLR4_5_2189d189dlvha7iux.R.inc(57526);checkParse(locale, cal, sdf, fdf);
            } catch(final ParseException ex) {
                __CLR4_5_2189d189dlvha7iux.R.inc(57527);Assert.fail("Locale "+locale+ " failed with "+format+" era "+((((eraBC)&&(__CLR4_5_2189d189dlvha7iux.R.iget(57528)!=0|true))||(__CLR4_5_2189d189dlvha7iux.R.iget(57529)==0&false))?"BC":"AD")+"\n" + trimMessage(ex.toString()));
            }
        }
    }}finally{__CLR4_5_2189d189dlvha7iux.R.flushNeeded();}}
    
    @Test
    public void testJpLocales() {__CLR4_5_2189d189dlvha7iux.R.globalSliceStart(getClass().getName(),57530);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2x921p418e2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2189d189dlvha7iux.R.rethrow($CLV_t2$);}finally{__CLR4_5_2189d189dlvha7iux.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.FastDateParserTest.testJpLocales",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),57530,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2x921p418e2(){try{__CLR4_5_2189d189dlvha7iux.R.inc(57530);

        __CLR4_5_2189d189dlvha7iux.R.inc(57531);final Calendar cal= Calendar.getInstance(GMT);
        __CLR4_5_2189d189dlvha7iux.R.inc(57532);cal.clear();
        __CLR4_5_2189d189dlvha7iux.R.inc(57533);cal.set(2003, Calendar.FEBRUARY, 10);
        __CLR4_5_2189d189dlvha7iux.R.inc(57534);cal.set(Calendar.ERA, GregorianCalendar.BC);

        __CLR4_5_2189d189dlvha7iux.R.inc(57535);final Locale locale = LocaleUtils.toLocale("zh"); {
            // ja_JP_JP cannot handle dates before 1868 properly

            __CLR4_5_2189d189dlvha7iux.R.inc(57536);final SimpleDateFormat sdf = new SimpleDateFormat(LONG_FORMAT, locale);
            __CLR4_5_2189d189dlvha7iux.R.inc(57537);final DateParser fdf = getInstance(LONG_FORMAT, locale);

            __CLR4_5_2189d189dlvha7iux.R.inc(57538);try {
                __CLR4_5_2189d189dlvha7iux.R.inc(57539);checkParse(locale, cal, sdf, fdf);
            } catch(final ParseException ex) {
                __CLR4_5_2189d189dlvha7iux.R.inc(57540);Assert.fail("Locale "+locale+ " failed with "+LONG_FORMAT+"\n" + trimMessage(ex.toString()));
            }
        }
    }finally{__CLR4_5_2189d189dlvha7iux.R.flushNeeded();}}

    private String trimMessage(final String msg) {try{__CLR4_5_2189d189dlvha7iux.R.inc(57541);
        __CLR4_5_2189d189dlvha7iux.R.inc(57542);if ((((msg.length() < 100)&&(__CLR4_5_2189d189dlvha7iux.R.iget(57543)!=0|true))||(__CLR4_5_2189d189dlvha7iux.R.iget(57544)==0&false))) {{
            __CLR4_5_2189d189dlvha7iux.R.inc(57545);return msg;
        }
        }__CLR4_5_2189d189dlvha7iux.R.inc(57546);final int gmt = msg.indexOf("(GMT");
        __CLR4_5_2189d189dlvha7iux.R.inc(57547);if ((((gmt > 0)&&(__CLR4_5_2189d189dlvha7iux.R.iget(57548)!=0|true))||(__CLR4_5_2189d189dlvha7iux.R.iget(57549)==0&false))) {{
            __CLR4_5_2189d189dlvha7iux.R.inc(57550);return msg.substring(0, gmt+4)+"...)";
        }
        }__CLR4_5_2189d189dlvha7iux.R.inc(57551);return msg.substring(0, 100)+"...";
    }finally{__CLR4_5_2189d189dlvha7iux.R.flushNeeded();}}

    private void checkParse(final Locale locale, final Calendar cal, final SimpleDateFormat sdf, final DateParser fdf) throws ParseException {try{__CLR4_5_2189d189dlvha7iux.R.inc(57552);
        __CLR4_5_2189d189dlvha7iux.R.inc(57553);final String formattedDate= sdf.format(cal.getTime());
        __CLR4_5_2189d189dlvha7iux.R.inc(57554);checkParse(locale, sdf, fdf, formattedDate);
        __CLR4_5_2189d189dlvha7iux.R.inc(57555);checkParse(locale, sdf, fdf, formattedDate.toLowerCase(locale));
        __CLR4_5_2189d189dlvha7iux.R.inc(57556);checkParse(locale, sdf, fdf, formattedDate.toUpperCase(locale));
    }finally{__CLR4_5_2189d189dlvha7iux.R.flushNeeded();}}

    private void checkParse(final Locale locale, final SimpleDateFormat sdf, final DateParser fdf, final String formattedDate) throws ParseException {try{__CLR4_5_2189d189dlvha7iux.R.inc(57557);
        __CLR4_5_2189d189dlvha7iux.R.inc(57558);final Date expectedTime = sdf.parse(formattedDate);
        __CLR4_5_2189d189dlvha7iux.R.inc(57559);final Date actualTime = fdf.parse(formattedDate);
        __CLR4_5_2189d189dlvha7iux.R.inc(57560);assertEquals(locale.toString()+" "+formattedDate +"\n",expectedTime, actualTime);
    }finally{__CLR4_5_2189d189dlvha7iux.R.flushNeeded();}}

    @Test
    public void testParseNumerics() throws ParseException {__CLR4_5_2189d189dlvha7iux.R.globalSliceStart(getClass().getName(),57561);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2i26fjm18ex();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2189d189dlvha7iux.R.rethrow($CLV_t2$);}finally{__CLR4_5_2189d189dlvha7iux.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.FastDateParserTest.testParseNumerics",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),57561,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2i26fjm18ex() throws ParseException{try{__CLR4_5_2189d189dlvha7iux.R.inc(57561);
        __CLR4_5_2189d189dlvha7iux.R.inc(57562);final Calendar cal= Calendar.getInstance(NEW_YORK, Locale.US);
        __CLR4_5_2189d189dlvha7iux.R.inc(57563);cal.clear();
        __CLR4_5_2189d189dlvha7iux.R.inc(57564);cal.set(2003, Calendar.FEBRUARY, 10, 15, 33, 20);
        __CLR4_5_2189d189dlvha7iux.R.inc(57565);cal.set(Calendar.MILLISECOND, 989);

        __CLR4_5_2189d189dlvha7iux.R.inc(57566);final DateParser fdf = getInstance("yyyyMMddHHmmssSSS", NEW_YORK, Locale.US);
        __CLR4_5_2189d189dlvha7iux.R.inc(57567);assertEquals(cal.getTime(), fdf.parse("20030210153320989"));
    }finally{__CLR4_5_2189d189dlvha7iux.R.flushNeeded();}}

    @Test
    public void testQuotes() throws ParseException {__CLR4_5_2189d189dlvha7iux.R.globalSliceStart(getClass().getName(),57568);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23bickw18f4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2189d189dlvha7iux.R.rethrow($CLV_t2$);}finally{__CLR4_5_2189d189dlvha7iux.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.FastDateParserTest.testQuotes",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),57568,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23bickw18f4() throws ParseException{try{__CLR4_5_2189d189dlvha7iux.R.inc(57568);
        __CLR4_5_2189d189dlvha7iux.R.inc(57569);final Calendar cal= Calendar.getInstance(NEW_YORK, Locale.US);
        __CLR4_5_2189d189dlvha7iux.R.inc(57570);cal.clear();
        __CLR4_5_2189d189dlvha7iux.R.inc(57571);cal.set(2003, Calendar.FEBRUARY, 10, 15, 33, 20);
        __CLR4_5_2189d189dlvha7iux.R.inc(57572);cal.set(Calendar.MILLISECOND, 989);

        __CLR4_5_2189d189dlvha7iux.R.inc(57573);final DateParser fdf = getInstance("''yyyyMMdd'A''B'HHmmssSSS''", NEW_YORK, Locale.US);
        __CLR4_5_2189d189dlvha7iux.R.inc(57574);assertEquals(cal.getTime(), fdf.parse("'20030210A'B153320989'"));
    }finally{__CLR4_5_2189d189dlvha7iux.R.flushNeeded();}}

    @Test
    public void testSpecialCharacters() throws Exception {__CLR4_5_2189d189dlvha7iux.R.globalSliceStart(getClass().getName(),57575);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21v68g818fb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2189d189dlvha7iux.R.rethrow($CLV_t2$);}finally{__CLR4_5_2189d189dlvha7iux.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.FastDateParserTest.testSpecialCharacters",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),57575,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21v68g818fb() throws Exception{try{__CLR4_5_2189d189dlvha7iux.R.inc(57575);
        __CLR4_5_2189d189dlvha7iux.R.inc(57576);testSdfAndFdp("q" ,"", true); // bad pattern character (at present)
        __CLR4_5_2189d189dlvha7iux.R.inc(57577);testSdfAndFdp("Q" ,"", true); // bad pattern character
        __CLR4_5_2189d189dlvha7iux.R.inc(57578);testSdfAndFdp("$" ,"$", false); // OK
        __CLR4_5_2189d189dlvha7iux.R.inc(57579);testSdfAndFdp("?.d" ,"?.12", false); // OK
        __CLR4_5_2189d189dlvha7iux.R.inc(57580);testSdfAndFdp("''yyyyMMdd'A''B'HHmmssSSS''", "'20030210A'B153320989'", false); // OK
        __CLR4_5_2189d189dlvha7iux.R.inc(57581);testSdfAndFdp("''''yyyyMMdd'A''B'HHmmssSSS''", "''20030210A'B153320989'", false); // OK
        __CLR4_5_2189d189dlvha7iux.R.inc(57582);testSdfAndFdp("'$\\Ed'" ,"$\\Ed", false); // OK
        
        // quoted charaters are case sensitive
        __CLR4_5_2189d189dlvha7iux.R.inc(57583);testSdfAndFdp("'QED'", "QED", false);
        __CLR4_5_2189d189dlvha7iux.R.inc(57584);testSdfAndFdp("'QED'", "qed", true);
        // case sensitive after insensitive Month field
        __CLR4_5_2189d189dlvha7iux.R.inc(57585);testSdfAndFdp("yyyy-MM-dd 'QED'", "2003-02-10 QED", false);
        __CLR4_5_2189d189dlvha7iux.R.inc(57586);testSdfAndFdp("yyyy-MM-dd 'QED'", "2003-02-10 qed", true);
    }finally{__CLR4_5_2189d189dlvha7iux.R.flushNeeded();}}
    
    @Test
    public void testLANG_832() throws Exception {__CLR4_5_2189d189dlvha7iux.R.globalSliceStart(getClass().getName(),57587);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ccjqzl18fn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2189d189dlvha7iux.R.rethrow($CLV_t2$);}finally{__CLR4_5_2189d189dlvha7iux.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.FastDateParserTest.testLANG_832",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),57587,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ccjqzl18fn() throws Exception{try{__CLR4_5_2189d189dlvha7iux.R.inc(57587);
        __CLR4_5_2189d189dlvha7iux.R.inc(57588);testSdfAndFdp("'d'd" ,"d3", false); // OK
        __CLR4_5_2189d189dlvha7iux.R.inc(57589);testSdfAndFdp("'d'd'","d3", true); // should fail (unterminated quote)
    }finally{__CLR4_5_2189d189dlvha7iux.R.flushNeeded();}}

    @Test
    public void testLANG_831() throws Exception {__CLR4_5_2189d189dlvha7iux.R.globalSliceStart(getClass().getName(),57590);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2fljps218fq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2189d189dlvha7iux.R.rethrow($CLV_t2$);}finally{__CLR4_5_2189d189dlvha7iux.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.FastDateParserTest.testLANG_831",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),57590,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2fljps218fq() throws Exception{try{__CLR4_5_2189d189dlvha7iux.R.inc(57590);
        __CLR4_5_2189d189dlvha7iux.R.inc(57591);testSdfAndFdp("M E","3  Tue", true);
    }finally{__CLR4_5_2189d189dlvha7iux.R.flushNeeded();}}

    private void testSdfAndFdp(final String format, final String date, final boolean shouldFail)
            throws Exception {try{__CLR4_5_2189d189dlvha7iux.R.inc(57592);
        __CLR4_5_2189d189dlvha7iux.R.inc(57593);Date dfdp = null;
        __CLR4_5_2189d189dlvha7iux.R.inc(57594);Date dsdf = null;
        __CLR4_5_2189d189dlvha7iux.R.inc(57595);Throwable f = null;
        __CLR4_5_2189d189dlvha7iux.R.inc(57596);Throwable s = null;

        __CLR4_5_2189d189dlvha7iux.R.inc(57597);try {
            __CLR4_5_2189d189dlvha7iux.R.inc(57598);final SimpleDateFormat sdf = new SimpleDateFormat(format, Locale.US);
            __CLR4_5_2189d189dlvha7iux.R.inc(57599);sdf.setTimeZone(NEW_YORK);
            __CLR4_5_2189d189dlvha7iux.R.inc(57600);dsdf = sdf.parse(date);
            __CLR4_5_2189d189dlvha7iux.R.inc(57601);if ((((shouldFail)&&(__CLR4_5_2189d189dlvha7iux.R.iget(57602)!=0|true))||(__CLR4_5_2189d189dlvha7iux.R.iget(57603)==0&false))) {{
                __CLR4_5_2189d189dlvha7iux.R.inc(57604);Assert.fail("Expected SDF failure, but got " + dsdf + " for ["+format+","+date+"]");
            }
        }} catch (final Exception e) {
            __CLR4_5_2189d189dlvha7iux.R.inc(57605);s = e;
            __CLR4_5_2189d189dlvha7iux.R.inc(57606);if ((((!shouldFail)&&(__CLR4_5_2189d189dlvha7iux.R.iget(57607)!=0|true))||(__CLR4_5_2189d189dlvha7iux.R.iget(57608)==0&false))) {{
                __CLR4_5_2189d189dlvha7iux.R.inc(57609);throw e;
            }
        }}

        __CLR4_5_2189d189dlvha7iux.R.inc(57610);try {
            __CLR4_5_2189d189dlvha7iux.R.inc(57611);final DateParser fdp = getInstance(format, NEW_YORK, Locale.US);
            __CLR4_5_2189d189dlvha7iux.R.inc(57612);dfdp = fdp.parse(date);
            __CLR4_5_2189d189dlvha7iux.R.inc(57613);if ((((shouldFail)&&(__CLR4_5_2189d189dlvha7iux.R.iget(57614)!=0|true))||(__CLR4_5_2189d189dlvha7iux.R.iget(57615)==0&false))) {{
                __CLR4_5_2189d189dlvha7iux.R.inc(57616);Assert.fail("Expected FDF failure, but got " + dfdp + " for ["+format+","+date+"]");
            }
        }} catch (final Exception e) {
            __CLR4_5_2189d189dlvha7iux.R.inc(57617);f = e;
            __CLR4_5_2189d189dlvha7iux.R.inc(57618);if ((((!shouldFail)&&(__CLR4_5_2189d189dlvha7iux.R.iget(57619)!=0|true))||(__CLR4_5_2189d189dlvha7iux.R.iget(57620)==0&false))) {{
                __CLR4_5_2189d189dlvha7iux.R.inc(57621);throw e;
            }
        }}
        // SDF and FDF should produce equivalent results
        __CLR4_5_2189d189dlvha7iux.R.inc(57622);assertTrue("Should both or neither throw Exceptions", (f==null)==(s==null));
        __CLR4_5_2189d189dlvha7iux.R.inc(57623);assertEquals("Parsed dates should be equal", dsdf, dfdp);
    }finally{__CLR4_5_2189d189dlvha7iux.R.flushNeeded();}}

    @Test
    public void testDayOf() throws ParseException {__CLR4_5_2189d189dlvha7iux.R.globalSliceStart(getClass().getName(),57624);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22r1tbs18go();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2189d189dlvha7iux.R.rethrow($CLV_t2$);}finally{__CLR4_5_2189d189dlvha7iux.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.FastDateParserTest.testDayOf",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),57624,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22r1tbs18go() throws ParseException{try{__CLR4_5_2189d189dlvha7iux.R.inc(57624);
        __CLR4_5_2189d189dlvha7iux.R.inc(57625);final Calendar cal= Calendar.getInstance(NEW_YORK, Locale.US);
        __CLR4_5_2189d189dlvha7iux.R.inc(57626);cal.clear();
        __CLR4_5_2189d189dlvha7iux.R.inc(57627);cal.set(2003, Calendar.FEBRUARY, 10);

        __CLR4_5_2189d189dlvha7iux.R.inc(57628);final DateParser fdf = getInstance("W w F D y", NEW_YORK, Locale.US);
        __CLR4_5_2189d189dlvha7iux.R.inc(57629);assertEquals(cal.getTime(), fdf.parse("3 7 2 41 03"));
    }finally{__CLR4_5_2189d189dlvha7iux.R.flushNeeded();}}

    /**
     * Test case for {@link FastDateParser#FastDateParser(String, TimeZone, Locale)}.
     * @throws ParseException so we don't have to catch it
     */
    @Test
    public void testShortDateStyleWithLocales() throws ParseException {__CLR4_5_2189d189dlvha7iux.R.globalSliceStart(getClass().getName(),57630);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2a9jtmn18gu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2189d189dlvha7iux.R.rethrow($CLV_t2$);}finally{__CLR4_5_2189d189dlvha7iux.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.FastDateParserTest.testShortDateStyleWithLocales",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),57630,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2a9jtmn18gu() throws ParseException{try{__CLR4_5_2189d189dlvha7iux.R.inc(57630);
        __CLR4_5_2189d189dlvha7iux.R.inc(57631);DateParser fdf = getDateInstance(FastDateFormat.SHORT, Locale.US);
        __CLR4_5_2189d189dlvha7iux.R.inc(57632);final Calendar cal = Calendar.getInstance();
        __CLR4_5_2189d189dlvha7iux.R.inc(57633);cal.clear();

        __CLR4_5_2189d189dlvha7iux.R.inc(57634);cal.set(2004, Calendar.FEBRUARY, 3);
        __CLR4_5_2189d189dlvha7iux.R.inc(57635);assertEquals(cal.getTime(), fdf.parse("2/3/04"));

        __CLR4_5_2189d189dlvha7iux.R.inc(57636);fdf = getDateInstance(FastDateFormat.SHORT, SWEDEN);
        __CLR4_5_2189d189dlvha7iux.R.inc(57637);assertEquals(cal.getTime(), fdf.parse("2004-02-03"));
    }finally{__CLR4_5_2189d189dlvha7iux.R.flushNeeded();}}

    /**
     * Tests that pre-1000AD years get padded with yyyy
     * @throws ParseException so we don't have to catch it
     */
    @Test
    public void testLowYearPadding() throws ParseException {__CLR4_5_2189d189dlvha7iux.R.globalSliceStart(getClass().getName(),57638);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jr7xi118h2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2189d189dlvha7iux.R.rethrow($CLV_t2$);}finally{__CLR4_5_2189d189dlvha7iux.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.FastDateParserTest.testLowYearPadding",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),57638,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jr7xi118h2() throws ParseException{try{__CLR4_5_2189d189dlvha7iux.R.inc(57638);
        __CLR4_5_2189d189dlvha7iux.R.inc(57639);final DateParser parser = getInstance(YMD_SLASH);
        __CLR4_5_2189d189dlvha7iux.R.inc(57640);final Calendar cal = Calendar.getInstance();
        __CLR4_5_2189d189dlvha7iux.R.inc(57641);cal.clear();

        __CLR4_5_2189d189dlvha7iux.R.inc(57642);cal.set(1, Calendar.JANUARY, 1);
        __CLR4_5_2189d189dlvha7iux.R.inc(57643);assertEquals(cal.getTime(), parser.parse("0001/01/01"));
        __CLR4_5_2189d189dlvha7iux.R.inc(57644);cal.set(10, Calendar.JANUARY, 1);
        __CLR4_5_2189d189dlvha7iux.R.inc(57645);assertEquals(cal.getTime(), parser.parse("0010/01/01"));
        __CLR4_5_2189d189dlvha7iux.R.inc(57646);cal.set(100, Calendar.JANUARY, 1);
        __CLR4_5_2189d189dlvha7iux.R.inc(57647);assertEquals(cal.getTime(), parser.parse("0100/01/01"));
        __CLR4_5_2189d189dlvha7iux.R.inc(57648);cal.set(999, Calendar.JANUARY, 1);
        __CLR4_5_2189d189dlvha7iux.R.inc(57649);assertEquals(cal.getTime(), parser.parse("0999/01/01"));
    }finally{__CLR4_5_2189d189dlvha7iux.R.flushNeeded();}}

    @Test
    public void testMilleniumBug() throws ParseException {__CLR4_5_2189d189dlvha7iux.R.globalSliceStart(getClass().getName(),57650);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2rn0vxt18he();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2189d189dlvha7iux.R.rethrow($CLV_t2$);}finally{__CLR4_5_2189d189dlvha7iux.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.FastDateParserTest.testMilleniumBug",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),57650,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2rn0vxt18he() throws ParseException{try{__CLR4_5_2189d189dlvha7iux.R.inc(57650);
        __CLR4_5_2189d189dlvha7iux.R.inc(57651);final DateParser parser = getInstance(DMY_DOT);
        __CLR4_5_2189d189dlvha7iux.R.inc(57652);final Calendar cal = Calendar.getInstance();
        __CLR4_5_2189d189dlvha7iux.R.inc(57653);cal.clear();

        __CLR4_5_2189d189dlvha7iux.R.inc(57654);cal.set(1000, Calendar.JANUARY, 1);
        __CLR4_5_2189d189dlvha7iux.R.inc(57655);assertEquals(cal.getTime(), parser.parse("01.01.1000"));
    }finally{__CLR4_5_2189d189dlvha7iux.R.flushNeeded();}}

    @Test
    public void testLang303() throws ParseException {__CLR4_5_2189d189dlvha7iux.R.globalSliceStart(getClass().getName(),57656);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26ep1el18hk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2189d189dlvha7iux.R.rethrow($CLV_t2$);}finally{__CLR4_5_2189d189dlvha7iux.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.FastDateParserTest.testLang303",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),57656,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26ep1el18hk() throws ParseException{try{__CLR4_5_2189d189dlvha7iux.R.inc(57656);
        __CLR4_5_2189d189dlvha7iux.R.inc(57657);DateParser parser = getInstance(YMD_SLASH);
        __CLR4_5_2189d189dlvha7iux.R.inc(57658);final Calendar cal = Calendar.getInstance();
        __CLR4_5_2189d189dlvha7iux.R.inc(57659);cal.set(2004, Calendar.DECEMBER, 31);

        __CLR4_5_2189d189dlvha7iux.R.inc(57660);final Date date = parser.parse("2004/11/31");

        __CLR4_5_2189d189dlvha7iux.R.inc(57661);parser = SerializationUtils.deserialize(SerializationUtils.serialize((Serializable) parser));
        __CLR4_5_2189d189dlvha7iux.R.inc(57662);assertEquals(date, parser.parse("2004/11/31"));
    }finally{__CLR4_5_2189d189dlvha7iux.R.flushNeeded();}}

    @Test
    public void testLang538() throws ParseException {__CLR4_5_2189d189dlvha7iux.R.globalSliceStart(getClass().getName(),57663);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2yinwov18hr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2189d189dlvha7iux.R.rethrow($CLV_t2$);}finally{__CLR4_5_2189d189dlvha7iux.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.FastDateParserTest.testLang538",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),57663,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2yinwov18hr() throws ParseException{try{__CLR4_5_2189d189dlvha7iux.R.inc(57663);
        __CLR4_5_2189d189dlvha7iux.R.inc(57664);final DateParser parser = getInstance("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", GMT);

        __CLR4_5_2189d189dlvha7iux.R.inc(57665);final Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("GMT-8"));
        __CLR4_5_2189d189dlvha7iux.R.inc(57666);cal.clear();
        __CLR4_5_2189d189dlvha7iux.R.inc(57667);cal.set(2009, Calendar.OCTOBER, 16, 8, 42, 16);

        __CLR4_5_2189d189dlvha7iux.R.inc(57668);assertEquals(cal.getTime(), parser.parse("2009-10-16T16:42:16.000Z"));
    }finally{__CLR4_5_2189d189dlvha7iux.R.flushNeeded();}}

    @Test
    public void testEquals() {__CLR4_5_2189d189dlvha7iux.R.globalSliceStart(getClass().getName(),57669);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2s4e60818hx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2189d189dlvha7iux.R.rethrow($CLV_t2$);}finally{__CLR4_5_2189d189dlvha7iux.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.FastDateParserTest.testEquals",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),57669,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2s4e60818hx(){try{__CLR4_5_2189d189dlvha7iux.R.inc(57669);
        __CLR4_5_2189d189dlvha7iux.R.inc(57670);final DateParser parser1= getInstance(YMD_SLASH);
        __CLR4_5_2189d189dlvha7iux.R.inc(57671);final DateParser parser2= getInstance(YMD_SLASH);

        __CLR4_5_2189d189dlvha7iux.R.inc(57672);assertEquals(parser1, parser2);
        __CLR4_5_2189d189dlvha7iux.R.inc(57673);assertEquals(parser1.hashCode(), parser2.hashCode());

        __CLR4_5_2189d189dlvha7iux.R.inc(57674);assertFalse(parser1.equals(new Object()));
    }finally{__CLR4_5_2189d189dlvha7iux.R.flushNeeded();}}

    @Test
    public void testToStringContainsName() {__CLR4_5_2189d189dlvha7iux.R.globalSliceStart(getClass().getName(),57675);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2tx5bkf18i3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2189d189dlvha7iux.R.rethrow($CLV_t2$);}finally{__CLR4_5_2189d189dlvha7iux.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.FastDateParserTest.testToStringContainsName",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),57675,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2tx5bkf18i3(){try{__CLR4_5_2189d189dlvha7iux.R.inc(57675);
        __CLR4_5_2189d189dlvha7iux.R.inc(57676);final DateParser parser= getInstance(YMD_SLASH);
        __CLR4_5_2189d189dlvha7iux.R.inc(57677);assertTrue(parser.toString().startsWith("FastDate"));
    }finally{__CLR4_5_2189d189dlvha7iux.R.flushNeeded();}}

    @Test
    public void testPatternMatches() {__CLR4_5_2189d189dlvha7iux.R.globalSliceStart(getClass().getName(),57678);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2na8f5018i6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2189d189dlvha7iux.R.rethrow($CLV_t2$);}finally{__CLR4_5_2189d189dlvha7iux.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.FastDateParserTest.testPatternMatches",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),57678,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2na8f5018i6(){try{__CLR4_5_2189d189dlvha7iux.R.inc(57678);
        __CLR4_5_2189d189dlvha7iux.R.inc(57679);final DateParser parser= getInstance(yMdHmsSZ);
        __CLR4_5_2189d189dlvha7iux.R.inc(57680);assertEquals(yMdHmsSZ, parser.getPattern());
    }finally{__CLR4_5_2189d189dlvha7iux.R.flushNeeded();}}

    @Test
    public void testLocaleMatches() {__CLR4_5_2189d189dlvha7iux.R.globalSliceStart(getClass().getName(),57681);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2pxtz0y18i9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2189d189dlvha7iux.R.rethrow($CLV_t2$);}finally{__CLR4_5_2189d189dlvha7iux.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.FastDateParserTest.testLocaleMatches",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),57681,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2pxtz0y18i9(){try{__CLR4_5_2189d189dlvha7iux.R.inc(57681);
        __CLR4_5_2189d189dlvha7iux.R.inc(57682);final DateParser parser= getInstance(yMdHmsSZ, SWEDEN);
        __CLR4_5_2189d189dlvha7iux.R.inc(57683);assertEquals(SWEDEN, parser.getLocale());
    }finally{__CLR4_5_2189d189dlvha7iux.R.flushNeeded();}}

    @Test
    public void testTimeZoneMatches() {__CLR4_5_2189d189dlvha7iux.R.globalSliceStart(getClass().getName(),57684);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2qy3lf318ic();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2189d189dlvha7iux.R.rethrow($CLV_t2$);}finally{__CLR4_5_2189d189dlvha7iux.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.FastDateParserTest.testTimeZoneMatches",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),57684,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2qy3lf318ic(){try{__CLR4_5_2189d189dlvha7iux.R.inc(57684);
        __CLR4_5_2189d189dlvha7iux.R.inc(57685);final DateParser parser= getInstance(yMdHmsSZ, REYKJAVIK);
        __CLR4_5_2189d189dlvha7iux.R.inc(57686);assertEquals(REYKJAVIK, parser.getTimeZone());
    }finally{__CLR4_5_2189d189dlvha7iux.R.flushNeeded();}}
    
    @Test
    public void testLang996() throws ParseException {__CLR4_5_2189d189dlvha7iux.R.globalSliceStart(getClass().getName(),57687);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2db5af718if();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2189d189dlvha7iux.R.rethrow($CLV_t2$);}finally{__CLR4_5_2189d189dlvha7iux.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.FastDateParserTest.testLang996",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),57687,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2db5af718if() throws ParseException{try{__CLR4_5_2189d189dlvha7iux.R.inc(57687);
        __CLR4_5_2189d189dlvha7iux.R.inc(57688);final Calendar expected = Calendar.getInstance(NEW_YORK, Locale.US);
        __CLR4_5_2189d189dlvha7iux.R.inc(57689);expected.clear();
        __CLR4_5_2189d189dlvha7iux.R.inc(57690);expected.set(2014, Calendar.MAY, 14);

        __CLR4_5_2189d189dlvha7iux.R.inc(57691);final DateParser fdp = getInstance("ddMMMyyyy", NEW_YORK, Locale.US);        
        __CLR4_5_2189d189dlvha7iux.R.inc(57692);assertEquals(expected.getTime(), fdp.parse("14may2014"));
        __CLR4_5_2189d189dlvha7iux.R.inc(57693);assertEquals(expected.getTime(), fdp.parse("14MAY2014"));
        __CLR4_5_2189d189dlvha7iux.R.inc(57694);assertEquals(expected.getTime(), fdp.parse("14May2014"));
    }finally{__CLR4_5_2189d189dlvha7iux.R.flushNeeded();}}
    
    @Test(expected = IllegalArgumentException.class)
    public void test1806Argument() {__CLR4_5_2189d189dlvha7iux.R.globalSliceStart(getClass().getName(),57695);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26rv59918in();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,49,56,48,54,65,114,103,117,109,101,110,116,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2189d189dlvha7iux.R.rethrow($CLV_t2$);}finally{__CLR4_5_2189d189dlvha7iux.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.FastDateParserTest.test1806Argument",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),57695,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26rv59918in(){try{__CLR4_5_2189d189dlvha7iux.R.inc(57695);
        __CLR4_5_2189d189dlvha7iux.R.inc(57696);getInstance("XXXX");
    }finally{__CLR4_5_2189d189dlvha7iux.R.flushNeeded();}}

    private static Calendar initializeCalendar(final TimeZone tz) {try{__CLR4_5_2189d189dlvha7iux.R.inc(57697);
        __CLR4_5_2189d189dlvha7iux.R.inc(57698);final Calendar cal = Calendar.getInstance(tz);
        __CLR4_5_2189d189dlvha7iux.R.inc(57699);cal.set(Calendar.YEAR, 2001);
        __CLR4_5_2189d189dlvha7iux.R.inc(57700);cal.set(Calendar.MONTH, 1); // not daylight savings
        __CLR4_5_2189d189dlvha7iux.R.inc(57701);cal.set(Calendar.DAY_OF_MONTH, 4);
        __CLR4_5_2189d189dlvha7iux.R.inc(57702);cal.set(Calendar.HOUR_OF_DAY, 12);
        __CLR4_5_2189d189dlvha7iux.R.inc(57703);cal.set(Calendar.MINUTE, 8);
        __CLR4_5_2189d189dlvha7iux.R.inc(57704);cal.set(Calendar.SECOND, 56);
        __CLR4_5_2189d189dlvha7iux.R.inc(57705);cal.set(Calendar.MILLISECOND, 235);
        __CLR4_5_2189d189dlvha7iux.R.inc(57706);return cal;
    }finally{__CLR4_5_2189d189dlvha7iux.R.flushNeeded();}}

    private static enum Expected1806 {
        India(INDIA, "+05", "+0530", "+05:30", true), 
        Greenwich(GMT, "Z", "Z", "Z", false), 
        NewYork(NEW_YORK, "-05", "-0500", "-05:00", false);

        private Expected1806(final TimeZone zone, final String one, final String two, final String three, final boolean hasHalfHourOffset) {try{__CLR4_5_2189d189dlvha7iux.R.inc(57707);
            __CLR4_5_2189d189dlvha7iux.R.inc(57708);this.zone = zone;
            __CLR4_5_2189d189dlvha7iux.R.inc(57709);this.one = one;
            __CLR4_5_2189d189dlvha7iux.R.inc(57710);this.two = two;
            __CLR4_5_2189d189dlvha7iux.R.inc(57711);this.three = three;
            __CLR4_5_2189d189dlvha7iux.R.inc(57712);this.offset = (((hasHalfHourOffset )&&(__CLR4_5_2189d189dlvha7iux.R.iget(57713)!=0|true))||(__CLR4_5_2189d189dlvha7iux.R.iget(57714)==0&false))?30*60*1000 :0;
        }finally{__CLR4_5_2189d189dlvha7iux.R.flushNeeded();}}

        final TimeZone zone;
        final String one;
        final String two;
        final String three;
        final long offset;
    }
    
    @Test
    public void test1806() throws ParseException {__CLR4_5_2189d189dlvha7iux.R.globalSliceStart(getClass().getName(),57715);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2apri3q18j7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2189d189dlvha7iux.R.rethrow($CLV_t2$);}finally{__CLR4_5_2189d189dlvha7iux.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.FastDateParserTest.test1806",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),57715,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2apri3q18j7() throws ParseException{try{__CLR4_5_2189d189dlvha7iux.R.inc(57715);
        __CLR4_5_2189d189dlvha7iux.R.inc(57716);final String formatStub = "yyyy-MM-dd'T'HH:mm:ss.SSS";
        __CLR4_5_2189d189dlvha7iux.R.inc(57717);final String dateStub = "2001-02-04T12:08:56.235";
        
        __CLR4_5_2189d189dlvha7iux.R.inc(57718);for (final Expected1806 trial : Expected1806.values()) {{
            __CLR4_5_2189d189dlvha7iux.R.inc(57719);final Calendar cal = initializeCalendar(trial.zone);

            __CLR4_5_2189d189dlvha7iux.R.inc(57720);final String message = trial.zone.getDisplayName()+";";
            
            __CLR4_5_2189d189dlvha7iux.R.inc(57721);DateParser parser = getInstance(formatStub+"X", trial.zone);
            __CLR4_5_2189d189dlvha7iux.R.inc(57722);assertEquals(message+trial.one, cal.getTime().getTime(), parser.parse(dateStub+trial.one).getTime()-trial.offset);

            __CLR4_5_2189d189dlvha7iux.R.inc(57723);parser = getInstance(formatStub+"XX", trial.zone);
            __CLR4_5_2189d189dlvha7iux.R.inc(57724);assertEquals(message+trial.two, cal.getTime(), parser.parse(dateStub+trial.two));

            __CLR4_5_2189d189dlvha7iux.R.inc(57725);parser = getInstance(formatStub+"XXX", trial.zone);
            __CLR4_5_2189d189dlvha7iux.R.inc(57726);assertEquals(message+trial.three, cal.getTime(), parser.parse(dateStub+trial.three));
        }
    }}finally{__CLR4_5_2189d189dlvha7iux.R.flushNeeded();}}

    @Test
    public void testLang1121() throws ParseException {__CLR4_5_2189d189dlvha7iux.R.globalSliceStart(getClass().getName(),57727);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ggekd618jj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2189d189dlvha7iux.R.rethrow($CLV_t2$);}finally{__CLR4_5_2189d189dlvha7iux.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.FastDateParserTest.testLang1121",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),57727,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ggekd618jj() throws ParseException{try{__CLR4_5_2189d189dlvha7iux.R.inc(57727);
        __CLR4_5_2189d189dlvha7iux.R.inc(57728);final TimeZone kst = TimeZone.getTimeZone("KST");
        __CLR4_5_2189d189dlvha7iux.R.inc(57729);final DateParser fdp = getInstance("yyyyMMdd", kst, Locale.KOREA);

        __CLR4_5_2189d189dlvha7iux.R.inc(57730);try {
            __CLR4_5_2189d189dlvha7iux.R.inc(57731);fdp.parse("2015");
            __CLR4_5_2189d189dlvha7iux.R.inc(57732);Assert.fail("expected parse exception");
        } catch (final ParseException pe) {
            // expected parse exception
        }

        // Wed Apr 29 00:00:00 KST 2015
        __CLR4_5_2189d189dlvha7iux.R.inc(57733);Date actual = fdp.parse("20150429");
        __CLR4_5_2189d189dlvha7iux.R.inc(57734);final Calendar cal = Calendar.getInstance(kst, Locale.KOREA);
        __CLR4_5_2189d189dlvha7iux.R.inc(57735);cal.clear();
        __CLR4_5_2189d189dlvha7iux.R.inc(57736);cal.set(2015, 3, 29);
        __CLR4_5_2189d189dlvha7iux.R.inc(57737);Date expected = cal.getTime();
        __CLR4_5_2189d189dlvha7iux.R.inc(57738);Assert.assertEquals(expected, actual);

        __CLR4_5_2189d189dlvha7iux.R.inc(57739);final SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd", Locale.KOREA);
        __CLR4_5_2189d189dlvha7iux.R.inc(57740);df.setTimeZone(kst);
        __CLR4_5_2189d189dlvha7iux.R.inc(57741);expected = df.parse("20150429113100");

        // Thu Mar 16 00:00:00 KST 81724
        __CLR4_5_2189d189dlvha7iux.R.inc(57742);actual = fdp.parse("20150429113100");
        __CLR4_5_2189d189dlvha7iux.R.inc(57743);Assert.assertEquals(expected, actual);
    }finally{__CLR4_5_2189d189dlvha7iux.R.flushNeeded();}}

    @Test
    public void testParseOffset() {__CLR4_5_2189d189dlvha7iux.R.globalSliceStart(getClass().getName(),57744);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_29mhvd118k0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2189d189dlvha7iux.R.rethrow($CLV_t2$);}finally{__CLR4_5_2189d189dlvha7iux.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.FastDateParserTest.testParseOffset",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),57744,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_29mhvd118k0(){try{__CLR4_5_2189d189dlvha7iux.R.inc(57744);
        __CLR4_5_2189d189dlvha7iux.R.inc(57745);final DateParser parser = getInstance(YMD_SLASH);
        __CLR4_5_2189d189dlvha7iux.R.inc(57746);final Date date = parser.parse("Today is 2015/07/04", new ParsePosition(9));

        __CLR4_5_2189d189dlvha7iux.R.inc(57747);final Calendar cal = Calendar.getInstance();
        __CLR4_5_2189d189dlvha7iux.R.inc(57748);cal.clear();
        __CLR4_5_2189d189dlvha7iux.R.inc(57749);cal.set(2015, Calendar.JULY, 4);
        __CLR4_5_2189d189dlvha7iux.R.inc(57750);Assert.assertEquals(cal.getTime(), date);
    }finally{__CLR4_5_2189d189dlvha7iux.R.flushNeeded();}}

    @Test
    public void testDayNumberOfWeek() throws ParseException {__CLR4_5_2189d189dlvha7iux.R.globalSliceStart(getClass().getName(),57751);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ppm0m318k7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2189d189dlvha7iux.R.rethrow($CLV_t2$);}finally{__CLR4_5_2189d189dlvha7iux.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.FastDateParserTest.testDayNumberOfWeek",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),57751,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ppm0m318k7() throws ParseException{try{__CLR4_5_2189d189dlvha7iux.R.inc(57751);
        __CLR4_5_2189d189dlvha7iux.R.inc(57752);final DateParser parser = getInstance("u");
        __CLR4_5_2189d189dlvha7iux.R.inc(57753);final Calendar calendar = Calendar.getInstance();

        __CLR4_5_2189d189dlvha7iux.R.inc(57754);calendar.setTime(parser.parse("1"));
        __CLR4_5_2189d189dlvha7iux.R.inc(57755);Assert.assertEquals(Calendar.MONDAY, calendar.get(Calendar.DAY_OF_WEEK));

        __CLR4_5_2189d189dlvha7iux.R.inc(57756);calendar.setTime(parser.parse("6"));
        __CLR4_5_2189d189dlvha7iux.R.inc(57757);Assert.assertEquals(Calendar.SATURDAY, calendar.get(Calendar.DAY_OF_WEEK));

        __CLR4_5_2189d189dlvha7iux.R.inc(57758);calendar.setTime(parser.parse("7"));
        __CLR4_5_2189d189dlvha7iux.R.inc(57759);Assert.assertEquals(Calendar.SUNDAY, calendar.get(Calendar.DAY_OF_WEEK));
    }finally{__CLR4_5_2189d189dlvha7iux.R.flushNeeded();}}
}
