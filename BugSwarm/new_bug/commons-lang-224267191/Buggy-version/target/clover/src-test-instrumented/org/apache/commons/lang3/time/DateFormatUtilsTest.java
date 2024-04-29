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
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

import org.apache.commons.lang3.test.SystemDefaultsSwitch;
import org.apache.commons.lang3.test.SystemDefaults;
import org.junit.Rule;
import org.junit.Test;

/**
 * TestCase for DateFormatUtils.
 */
@SuppressWarnings("deprecation") // tests lots of deprecated items
public class DateFormatUtilsTest {static class __CLR4_5_216mf16mflvha7in3{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172763741L,8589935092L,55352,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Rule
    public SystemDefaultsSwitch defaults = new SystemDefaultsSwitch();
    
    //-----------------------------------------------------------------------
    @Test
    public void testConstructor() {__CLR4_5_216mf16mflvha7in3.R.globalSliceStart(getClass().getName(),55239);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2uefs8h16mf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_216mf16mflvha7in3.R.rethrow($CLV_t2$);}finally{__CLR4_5_216mf16mflvha7in3.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateFormatUtilsTest.testConstructor",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),55239,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2uefs8h16mf(){try{__CLR4_5_216mf16mflvha7in3.R.inc(55239);
        __CLR4_5_216mf16mflvha7in3.R.inc(55240);assertNotNull(new DateFormatUtils());
        __CLR4_5_216mf16mflvha7in3.R.inc(55241);final Constructor<?>[] cons = DateFormatUtils.class.getDeclaredConstructors();
        __CLR4_5_216mf16mflvha7in3.R.inc(55242);assertEquals(1, cons.length);
        __CLR4_5_216mf16mflvha7in3.R.inc(55243);assertTrue(Modifier.isPublic(cons[0].getModifiers()));
        __CLR4_5_216mf16mflvha7in3.R.inc(55244);assertTrue(Modifier.isPublic(DateFormatUtils.class.getModifiers()));
        __CLR4_5_216mf16mflvha7in3.R.inc(55245);assertFalse(Modifier.isFinal(DateFormatUtils.class.getModifiers()));
    }finally{__CLR4_5_216mf16mflvha7in3.R.flushNeeded();}}
    
    //-----------------------------------------------------------------------
    @Test
    public void testFormat() {__CLR4_5_216mf16mflvha7in3.R.globalSliceStart(getClass().getName(),55246);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27ezusw16mm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_216mf16mflvha7in3.R.rethrow($CLV_t2$);}finally{__CLR4_5_216mf16mflvha7in3.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateFormatUtilsTest.testFormat",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),55246,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27ezusw16mm(){try{__CLR4_5_216mf16mflvha7in3.R.inc(55246);
        __CLR4_5_216mf16mflvha7in3.R.inc(55247);final Calendar c = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        __CLR4_5_216mf16mflvha7in3.R.inc(55248);c.set(2005, Calendar.JANUARY, 1, 12, 0, 0);
        __CLR4_5_216mf16mflvha7in3.R.inc(55249);c.setTimeZone(TimeZone.getDefault());
        __CLR4_5_216mf16mflvha7in3.R.inc(55250);final StringBuilder buffer = new StringBuilder ();
        __CLR4_5_216mf16mflvha7in3.R.inc(55251);final int year = c.get(Calendar.YEAR);
        __CLR4_5_216mf16mflvha7in3.R.inc(55252);final int month = c.get(Calendar.MONTH) + 1;
        __CLR4_5_216mf16mflvha7in3.R.inc(55253);final int day = c.get(Calendar.DAY_OF_MONTH);
        __CLR4_5_216mf16mflvha7in3.R.inc(55254);final int hour = c.get(Calendar.HOUR_OF_DAY);
        __CLR4_5_216mf16mflvha7in3.R.inc(55255);buffer.append (year);
        __CLR4_5_216mf16mflvha7in3.R.inc(55256);buffer.append(month);
        __CLR4_5_216mf16mflvha7in3.R.inc(55257);buffer.append(day);
        __CLR4_5_216mf16mflvha7in3.R.inc(55258);buffer.append(hour);
        __CLR4_5_216mf16mflvha7in3.R.inc(55259);assertEquals(buffer.toString(), DateFormatUtils.format(c.getTime(), "yyyyMdH"));
        
        __CLR4_5_216mf16mflvha7in3.R.inc(55260);assertEquals(buffer.toString(), DateFormatUtils.format(c.getTime().getTime(), "yyyyMdH"));
        
        __CLR4_5_216mf16mflvha7in3.R.inc(55261);assertEquals(buffer.toString(), DateFormatUtils.format(c.getTime(), "yyyyMdH", Locale.US));
        
        __CLR4_5_216mf16mflvha7in3.R.inc(55262);assertEquals(buffer.toString(), DateFormatUtils.format(c.getTime().getTime(), "yyyyMdH", Locale.US));
    }finally{__CLR4_5_216mf16mflvha7in3.R.flushNeeded();}}
    
    //-----------------------------------------------------------------------
    @Test
    public void testFormatCalendar() {__CLR4_5_216mf16mflvha7in3.R.globalSliceStart(getClass().getName(),55263);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2fxrimq16n3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_216mf16mflvha7in3.R.rethrow($CLV_t2$);}finally{__CLR4_5_216mf16mflvha7in3.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateFormatUtilsTest.testFormatCalendar",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),55263,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2fxrimq16n3(){try{__CLR4_5_216mf16mflvha7in3.R.inc(55263);
        __CLR4_5_216mf16mflvha7in3.R.inc(55264);final Calendar c = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        __CLR4_5_216mf16mflvha7in3.R.inc(55265);c.set(2005, Calendar.JANUARY, 1, 12, 0, 0);
        __CLR4_5_216mf16mflvha7in3.R.inc(55266);c.setTimeZone(TimeZone.getDefault());
        __CLR4_5_216mf16mflvha7in3.R.inc(55267);final StringBuilder buffer = new StringBuilder ();
        __CLR4_5_216mf16mflvha7in3.R.inc(55268);final int year = c.get(Calendar.YEAR);
        __CLR4_5_216mf16mflvha7in3.R.inc(55269);final int month = c.get(Calendar.MONTH) + 1;
        __CLR4_5_216mf16mflvha7in3.R.inc(55270);final int day = c.get(Calendar.DAY_OF_MONTH);
        __CLR4_5_216mf16mflvha7in3.R.inc(55271);final int hour = c.get(Calendar.HOUR_OF_DAY);
        __CLR4_5_216mf16mflvha7in3.R.inc(55272);buffer.append (year);
        __CLR4_5_216mf16mflvha7in3.R.inc(55273);buffer.append(month);
        __CLR4_5_216mf16mflvha7in3.R.inc(55274);buffer.append(day);
        __CLR4_5_216mf16mflvha7in3.R.inc(55275);buffer.append(hour);
        __CLR4_5_216mf16mflvha7in3.R.inc(55276);assertEquals(buffer.toString(), DateFormatUtils.format(c, "yyyyMdH"));
        
        __CLR4_5_216mf16mflvha7in3.R.inc(55277);assertEquals(buffer.toString(), DateFormatUtils.format(c.getTime(), "yyyyMdH"));
        
        __CLR4_5_216mf16mflvha7in3.R.inc(55278);assertEquals(buffer.toString(), DateFormatUtils.format(c, "yyyyMdH", Locale.US));
        
        __CLR4_5_216mf16mflvha7in3.R.inc(55279);assertEquals(buffer.toString(), DateFormatUtils.format(c.getTime(), "yyyyMdH", Locale.US));
    }finally{__CLR4_5_216mf16mflvha7in3.R.flushNeeded();}}
    
    @Test
    public void testFormatUTC() {__CLR4_5_216mf16mflvha7in3.R.globalSliceStart(getClass().getName(),55280);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2tnw5em16nk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_216mf16mflvha7in3.R.rethrow($CLV_t2$);}finally{__CLR4_5_216mf16mflvha7in3.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateFormatUtilsTest.testFormatUTC",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),55280,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2tnw5em16nk(){try{__CLR4_5_216mf16mflvha7in3.R.inc(55280);
        __CLR4_5_216mf16mflvha7in3.R.inc(55281);final Calendar c = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        __CLR4_5_216mf16mflvha7in3.R.inc(55282);c.set(2005, Calendar.JANUARY, 1, 12, 0, 0);
        __CLR4_5_216mf16mflvha7in3.R.inc(55283);assertEquals ("2005-01-01T12:00:00", DateFormatUtils.formatUTC(c.getTime(), DateFormatUtils.ISO_DATETIME_FORMAT.getPattern()));
        
        __CLR4_5_216mf16mflvha7in3.R.inc(55284);assertEquals ("2005-01-01T12:00:00", DateFormatUtils.formatUTC(c.getTime().getTime(), DateFormatUtils.ISO_DATETIME_FORMAT.getPattern()));
        
        __CLR4_5_216mf16mflvha7in3.R.inc(55285);assertEquals ("2005-01-01T12:00:00", DateFormatUtils.formatUTC(c.getTime(), DateFormatUtils.ISO_DATETIME_FORMAT.getPattern(), Locale.US));
        
        __CLR4_5_216mf16mflvha7in3.R.inc(55286);assertEquals ("2005-01-01T12:00:00", DateFormatUtils.formatUTC(c.getTime().getTime(), DateFormatUtils.ISO_DATETIME_FORMAT.getPattern(), Locale.US));
    }finally{__CLR4_5_216mf16mflvha7in3.R.flushNeeded();}}

    private void assertFormats(final String expectedValue, final String pattern, final TimeZone timeZone, final Calendar cal) {try{__CLR4_5_216mf16mflvha7in3.R.inc(55287);
        __CLR4_5_216mf16mflvha7in3.R.inc(55288);assertEquals(expectedValue, DateFormatUtils.format(cal.getTime(), pattern, timeZone));
        __CLR4_5_216mf16mflvha7in3.R.inc(55289);assertEquals(expectedValue, DateFormatUtils.format(cal.getTime().getTime(), pattern, timeZone));
        __CLR4_5_216mf16mflvha7in3.R.inc(55290);assertEquals(expectedValue, DateFormatUtils.format(cal, pattern, timeZone));
    }finally{__CLR4_5_216mf16mflvha7in3.R.flushNeeded();}}

    private Calendar createFebruaryTestDate(final TimeZone timeZone) {try{__CLR4_5_216mf16mflvha7in3.R.inc(55291);
        __CLR4_5_216mf16mflvha7in3.R.inc(55292);final Calendar cal = Calendar.getInstance(timeZone);
        __CLR4_5_216mf16mflvha7in3.R.inc(55293);cal.set(2002, Calendar.FEBRUARY, 23, 9, 11, 12);
        __CLR4_5_216mf16mflvha7in3.R.inc(55294);return cal;
    }finally{__CLR4_5_216mf16mflvha7in3.R.flushNeeded();}}

    private Calendar createJuneTestDate(final TimeZone timeZone) {try{__CLR4_5_216mf16mflvha7in3.R.inc(55295);
        __CLR4_5_216mf16mflvha7in3.R.inc(55296);final Calendar cal = Calendar.getInstance(timeZone);
        __CLR4_5_216mf16mflvha7in3.R.inc(55297);cal.set(2003, Calendar.JUNE, 8, 10, 11, 12);
        __CLR4_5_216mf16mflvha7in3.R.inc(55298);return cal;
    }finally{__CLR4_5_216mf16mflvha7in3.R.flushNeeded();}}

    private void testGmtMinus3(final String expectedValue, final String pattern) {try{__CLR4_5_216mf16mflvha7in3.R.inc(55299);
        __CLR4_5_216mf16mflvha7in3.R.inc(55300);final TimeZone timeZone = TimeZone.getTimeZone("GMT-3");
        __CLR4_5_216mf16mflvha7in3.R.inc(55301);assertFormats(expectedValue, pattern, timeZone, createFebruaryTestDate(timeZone));
    }finally{__CLR4_5_216mf16mflvha7in3.R.flushNeeded();}}

    private void testUTC(final String expectedValue, final String pattern) {try{__CLR4_5_216mf16mflvha7in3.R.inc(55302);
        __CLR4_5_216mf16mflvha7in3.R.inc(55303);final TimeZone timeZone = TimeZone.getTimeZone("UTC");
        __CLR4_5_216mf16mflvha7in3.R.inc(55304);assertFormats(expectedValue, pattern, timeZone, createFebruaryTestDate(timeZone));
    }finally{__CLR4_5_216mf16mflvha7in3.R.flushNeeded();}}
    
    @Test
    public void testDateTimeISO() throws Exception {__CLR4_5_216mf16mflvha7in3.R.globalSliceStart(getClass().getName(),55305);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2henqyn16o9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_216mf16mflvha7in3.R.rethrow($CLV_t2$);}finally{__CLR4_5_216mf16mflvha7in3.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateFormatUtilsTest.testDateTimeISO",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),55305,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2henqyn16o9() throws Exception{try{__CLR4_5_216mf16mflvha7in3.R.inc(55305);
        __CLR4_5_216mf16mflvha7in3.R.inc(55306);testGmtMinus3("2002-02-23T09:11:12", DateFormatUtils.ISO_DATETIME_FORMAT.getPattern());
        __CLR4_5_216mf16mflvha7in3.R.inc(55307);testGmtMinus3("2002-02-23T09:11:12-03:00", DateFormatUtils.ISO_DATETIME_TIME_ZONE_FORMAT.getPattern());
        __CLR4_5_216mf16mflvha7in3.R.inc(55308);testUTC("2002-02-23T09:11:12Z", DateFormatUtils.ISO_DATETIME_TIME_ZONE_FORMAT.getPattern());
    }finally{__CLR4_5_216mf16mflvha7in3.R.flushNeeded();}}

    @Test
    public void testDateISO() {__CLR4_5_216mf16mflvha7in3.R.globalSliceStart(getClass().getName(),55309);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21ysgus16od();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_216mf16mflvha7in3.R.rethrow($CLV_t2$);}finally{__CLR4_5_216mf16mflvha7in3.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateFormatUtilsTest.testDateISO",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),55309,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21ysgus16od(){try{__CLR4_5_216mf16mflvha7in3.R.inc(55309);
        __CLR4_5_216mf16mflvha7in3.R.inc(55310);testGmtMinus3("2002-02-23", DateFormatUtils.ISO_DATE_FORMAT.getPattern());
        __CLR4_5_216mf16mflvha7in3.R.inc(55311);testGmtMinus3("2002-02-23-03:00", DateFormatUtils.ISO_DATE_TIME_ZONE_FORMAT.getPattern());
        __CLR4_5_216mf16mflvha7in3.R.inc(55312);testUTC("2002-02-23Z", DateFormatUtils.ISO_DATE_TIME_ZONE_FORMAT.getPattern());
    }finally{__CLR4_5_216mf16mflvha7in3.R.flushNeeded();}}

    @Test
    public void testTimeISO() {__CLR4_5_216mf16mflvha7in3.R.globalSliceStart(getClass().getName(),55313);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2h7ca3116oh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_216mf16mflvha7in3.R.rethrow($CLV_t2$);}finally{__CLR4_5_216mf16mflvha7in3.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateFormatUtilsTest.testTimeISO",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),55313,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2h7ca3116oh(){try{__CLR4_5_216mf16mflvha7in3.R.inc(55313);
        __CLR4_5_216mf16mflvha7in3.R.inc(55314);testGmtMinus3("T09:11:12", DateFormatUtils.ISO_TIME_FORMAT.getPattern());
        __CLR4_5_216mf16mflvha7in3.R.inc(55315);testGmtMinus3("T09:11:12-03:00", DateFormatUtils.ISO_TIME_TIME_ZONE_FORMAT.getPattern());
        __CLR4_5_216mf16mflvha7in3.R.inc(55316);testUTC("T09:11:12Z", DateFormatUtils.ISO_TIME_TIME_ZONE_FORMAT.getPattern());
    }finally{__CLR4_5_216mf16mflvha7in3.R.flushNeeded();}}

    @Test
    public void testTimeNoTISO() {__CLR4_5_216mf16mflvha7in3.R.globalSliceStart(getClass().getName(),55317);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2bdbo816ol();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_216mf16mflvha7in3.R.rethrow($CLV_t2$);}finally{__CLR4_5_216mf16mflvha7in3.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateFormatUtilsTest.testTimeNoTISO",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),55317,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2bdbo816ol(){try{__CLR4_5_216mf16mflvha7in3.R.inc(55317);
        __CLR4_5_216mf16mflvha7in3.R.inc(55318);testGmtMinus3("09:11:12", DateFormatUtils.ISO_TIME_NO_T_FORMAT.getPattern());
        __CLR4_5_216mf16mflvha7in3.R.inc(55319);testGmtMinus3("09:11:12-03:00", DateFormatUtils.ISO_TIME_NO_T_TIME_ZONE_FORMAT.getPattern());
        __CLR4_5_216mf16mflvha7in3.R.inc(55320);testUTC("09:11:12Z", DateFormatUtils.ISO_TIME_NO_T_TIME_ZONE_FORMAT.getPattern());
    }finally{__CLR4_5_216mf16mflvha7in3.R.flushNeeded();}}

    @SystemDefaults(locale="en")
    @Test
    public void testSMTP() {__CLR4_5_216mf16mflvha7in3.R.globalSliceStart(getClass().getName(),55321);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26nzlm716op();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_216mf16mflvha7in3.R.rethrow($CLV_t2$);}finally{__CLR4_5_216mf16mflvha7in3.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateFormatUtilsTest.testSMTP",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),55321,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26nzlm716op(){try{__CLR4_5_216mf16mflvha7in3.R.inc(55321);
        __CLR4_5_216mf16mflvha7in3.R.inc(55322);TimeZone timeZone = TimeZone.getTimeZone("GMT-3");
        __CLR4_5_216mf16mflvha7in3.R.inc(55323);Calendar june = createJuneTestDate(timeZone);

        __CLR4_5_216mf16mflvha7in3.R.inc(55324);assertFormats("Sun, 08 Jun 2003 10:11:12 -0300", DateFormatUtils.SMTP_DATETIME_FORMAT.getPattern(),
                timeZone, june);

        __CLR4_5_216mf16mflvha7in3.R.inc(55325);timeZone = TimeZone.getTimeZone("UTC");
        __CLR4_5_216mf16mflvha7in3.R.inc(55326);june = createJuneTestDate(timeZone);
        __CLR4_5_216mf16mflvha7in3.R.inc(55327);assertFormats("Sun, 08 Jun 2003 10:11:12 +0000", DateFormatUtils.SMTP_DATETIME_FORMAT.getPattern(),
                timeZone, june);
    }finally{__CLR4_5_216mf16mflvha7in3.R.flushNeeded();}}

    /*
    public void testLang312() {
        String pattern = "dd/MM/yyyy";
        String expected = "19/04/1948";
        TimeZone timeZone = TimeZone.getTimeZone("CET");
        Locale locale = Locale.GERMANY;

        // show Calendar is good
        Calendar cal = Calendar.getInstance(timeZone, locale);
        cal.set(1948, 3, 19);
        assertEquals(expected, DateFormatUtils.format( cal.getTime(), pattern, timeZone, locale ) );

        Date date = new Date(48, 3, 19);

        // test JDK
        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat(pattern, locale);
        sdf.setTimeZone(timeZone);
// There's nothing we can do if the JDK fails, so just going to print a warning in this case
//        assertEquals(expected, sdf.format( date ) );
        if( ! expected.equals( sdf.format( date ) ) ) {
            System.out.println("WARNING: JDK test failed - testLang312()");
        }

        // test Commons
        assertEquals(expected, DateFormatUtils.format( date, pattern, timeZone, locale ) );
    }
    */

    @Test
    public void testLANG1000() throws Exception {__CLR4_5_216mf16mflvha7in3.R.globalSliceStart(getClass().getName(),55328);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2u0cb0a16ow();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_216mf16mflvha7in3.R.rethrow($CLV_t2$);}finally{__CLR4_5_216mf16mflvha7in3.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateFormatUtilsTest.testLANG1000",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),55328,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2u0cb0a16ow() throws Exception{try{__CLR4_5_216mf16mflvha7in3.R.inc(55328);
        __CLR4_5_216mf16mflvha7in3.R.inc(55329);final String date = "2013-11-18T12:48:05Z";
        __CLR4_5_216mf16mflvha7in3.R.inc(55330);DateFormatUtils.ISO_DATETIME_TIME_ZONE_FORMAT.parse(date);
    }finally{__CLR4_5_216mf16mflvha7in3.R.flushNeeded();}}

    @SystemDefaults(timezone="UTC")
    @Test
    public void testLang530() throws ParseException {__CLR4_5_216mf16mflvha7in3.R.globalSliceStart(getClass().getName(),55331);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2aigeyh16oz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_216mf16mflvha7in3.R.rethrow($CLV_t2$);}finally{__CLR4_5_216mf16mflvha7in3.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateFormatUtilsTest.testLang530",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),55331,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2aigeyh16oz() throws ParseException{try{__CLR4_5_216mf16mflvha7in3.R.inc(55331);
        __CLR4_5_216mf16mflvha7in3.R.inc(55332);final Date d = new Date();
        __CLR4_5_216mf16mflvha7in3.R.inc(55333);final String isoDateStr = DateFormatUtils.ISO_DATETIME_TIME_ZONE_FORMAT.format(d);
        __CLR4_5_216mf16mflvha7in3.R.inc(55334);final Date d2 = DateUtils.parseDate(isoDateStr, new String[] { DateFormatUtils.ISO_DATETIME_TIME_ZONE_FORMAT.getPattern() });
        // the format loses milliseconds so have to reintroduce them
        __CLR4_5_216mf16mflvha7in3.R.inc(55335);assertEquals("Date not equal to itself ISO formatted and parsed", d.getTime(), d2.getTime() + d.getTime() % 1000);
    }finally{__CLR4_5_216mf16mflvha7in3.R.flushNeeded();}}

    /**
     * According to LANG-916 (https://issues.apache.org/jira/browse/LANG-916),
     * the format method did contain a bug: it did not use the TimeZone data.
     *
     * This method test that the bug is fixed.
     */
    @Test
    public void testLang916() throws Exception {__CLR4_5_216mf16mflvha7in3.R.globalSliceStart(getClass().getName(),55336);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2x2fp5116p4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_216mf16mflvha7in3.R.rethrow($CLV_t2$);}finally{__CLR4_5_216mf16mflvha7in3.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateFormatUtilsTest.testLang916",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),55336,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2x2fp5116p4() throws Exception{try{__CLR4_5_216mf16mflvha7in3.R.inc(55336);

        __CLR4_5_216mf16mflvha7in3.R.inc(55337);final Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("Europe/Paris"));
        __CLR4_5_216mf16mflvha7in3.R.inc(55338);cal.clear();
        __CLR4_5_216mf16mflvha7in3.R.inc(55339);cal.set(2009, 9, 16, 8, 42, 16);

        // Long.
        {
            __CLR4_5_216mf16mflvha7in3.R.inc(55340);final String value = DateFormatUtils.format(cal.getTimeInMillis(), DateFormatUtils.ISO_DATETIME_TIME_ZONE_FORMAT.getPattern(), TimeZone.getTimeZone("Europe/Paris"));
            __CLR4_5_216mf16mflvha7in3.R.inc(55341);assertEquals("long", "2009-10-16T08:42:16+02:00", value);
        }
        {
            __CLR4_5_216mf16mflvha7in3.R.inc(55342);final String value = DateFormatUtils.format(cal.getTimeInMillis(), DateFormatUtils.ISO_DATETIME_TIME_ZONE_FORMAT.getPattern(), TimeZone.getTimeZone("Asia/Kolkata"));
            __CLR4_5_216mf16mflvha7in3.R.inc(55343);assertEquals("long", "2009-10-16T12:12:16+05:30", value);
        }
        {
            __CLR4_5_216mf16mflvha7in3.R.inc(55344);final String value = DateFormatUtils.format(cal.getTimeInMillis(), DateFormatUtils.ISO_DATETIME_TIME_ZONE_FORMAT.getPattern(), TimeZone.getTimeZone("Europe/London"));
            __CLR4_5_216mf16mflvha7in3.R.inc(55345);assertEquals("long", "2009-10-16T07:42:16+01:00", value);
        }

        // Calendar.
        {
            __CLR4_5_216mf16mflvha7in3.R.inc(55346);final String value = DateFormatUtils.format(cal, DateFormatUtils.ISO_DATETIME_TIME_ZONE_FORMAT.getPattern(), TimeZone.getTimeZone("Europe/Paris"));
            __CLR4_5_216mf16mflvha7in3.R.inc(55347);assertEquals("calendar", "2009-10-16T08:42:16+02:00", value);
        }
        {
            __CLR4_5_216mf16mflvha7in3.R.inc(55348);final String value = DateFormatUtils.format(cal, DateFormatUtils.ISO_DATETIME_TIME_ZONE_FORMAT.getPattern(), TimeZone.getTimeZone("Asia/Kolkata"));
            __CLR4_5_216mf16mflvha7in3.R.inc(55349);assertEquals("calendar", "2009-10-16T12:12:16+05:30", value);
        }
        {
            __CLR4_5_216mf16mflvha7in3.R.inc(55350);final String value = DateFormatUtils.format(cal, DateFormatUtils.ISO_DATETIME_TIME_ZONE_FORMAT.getPattern(), TimeZone.getTimeZone("Europe/London"));
            __CLR4_5_216mf16mflvha7in3.R.inc(55351);assertEquals("calendar", "2009-10-16T07:42:16+01:00", value);
        }
    }finally{__CLR4_5_216mf16mflvha7in3.R.flushNeeded();}}
}
