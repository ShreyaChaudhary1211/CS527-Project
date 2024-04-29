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
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.TimeZone;

import org.apache.commons.lang3.test.SystemDefaults;
import org.apache.commons.lang3.test.SystemDefaultsSwitch;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;

/**
 * Unit tests {@link org.apache.commons.lang3.time.DateUtils}.
 */
public class DateUtilsTest {static class __CLR4_5_2175z175zlvha7iqh{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172763741L,8589935092L,56756,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static Date BASE_DATE;

    @BeforeClass
    public static void classSetup() {try{__CLR4_5_2175z175zlvha7iqh.R.inc(55943);
        __CLR4_5_2175z175zlvha7iqh.R.inc(55944);final GregorianCalendar cal = new GregorianCalendar(2000, 6, 5, 4, 3, 2);
        __CLR4_5_2175z175zlvha7iqh.R.inc(55945);cal.set(Calendar.MILLISECOND, 1);
        __CLR4_5_2175z175zlvha7iqh.R.inc(55946);BASE_DATE = cal.getTime();
    }finally{__CLR4_5_2175z175zlvha7iqh.R.flushNeeded();}}

    @Rule
    public SystemDefaultsSwitch defaults = new SystemDefaultsSwitch();
    
    private DateFormat dateParser = null;
    private DateFormat dateTimeParser = null;
    private Date dateAmPm1 = null;
    private Date dateAmPm2 = null;
    private Date dateAmPm3 = null;
    private Date dateAmPm4 = null;
    private Date date0 = null;
    private Date date1 = null;
    private Date date2 = null;
    private Date date3 = null;
    private Date date4 = null;
    private Date date5 = null;
    private Date date6 = null;
    private Date date7 = null;
    private Date date8 = null;
    private Calendar calAmPm1 = null;
    private Calendar calAmPm2 = null;
    private Calendar calAmPm3 = null;
    private Calendar calAmPm4 = null;
    private Calendar cal1 = null;
    private Calendar cal2 = null;
    private Calendar cal3 = null;
    private Calendar cal4 = null;
    private Calendar cal5 = null;
    private Calendar cal6 = null;
    private Calendar cal7 = null;
    private Calendar cal8 = null;
    private TimeZone zone = null;
    private TimeZone defaultZone = null;

    @Before
    public void setUp() throws Exception {try{__CLR4_5_2175z175zlvha7iqh.R.inc(55947);
        __CLR4_5_2175z175zlvha7iqh.R.inc(55948);dateParser = new SimpleDateFormat("MMM dd, yyyy", Locale.ENGLISH);
        __CLR4_5_2175z175zlvha7iqh.R.inc(55949);dateTimeParser = new SimpleDateFormat("MMM dd, yyyy H:mm:ss.SSS", Locale.ENGLISH);

        __CLR4_5_2175z175zlvha7iqh.R.inc(55950);dateAmPm1 = dateTimeParser.parse("February 3, 2002 01:10:00.000");
        __CLR4_5_2175z175zlvha7iqh.R.inc(55951);dateAmPm2 = dateTimeParser.parse("February 3, 2002 11:10:00.000");
        __CLR4_5_2175z175zlvha7iqh.R.inc(55952);dateAmPm3 = dateTimeParser.parse("February 3, 2002 13:10:00.000");
        __CLR4_5_2175z175zlvha7iqh.R.inc(55953);dateAmPm4 = dateTimeParser.parse("February 3, 2002 19:10:00.000");
        __CLR4_5_2175z175zlvha7iqh.R.inc(55954);date0 = dateTimeParser.parse("February 3, 2002 12:34:56.789");
        __CLR4_5_2175z175zlvha7iqh.R.inc(55955);date1 = dateTimeParser.parse("February 12, 2002 12:34:56.789");
        __CLR4_5_2175z175zlvha7iqh.R.inc(55956);date2 = dateTimeParser.parse("November 18, 2001 1:23:11.321");
        __CLR4_5_2175z175zlvha7iqh.R.inc(55957);defaultZone = TimeZone.getDefault();
        __CLR4_5_2175z175zlvha7iqh.R.inc(55958);zone = TimeZone.getTimeZone("MET");
        __CLR4_5_2175z175zlvha7iqh.R.inc(55959);TimeZone.setDefault(zone);
        __CLR4_5_2175z175zlvha7iqh.R.inc(55960);dateTimeParser.setTimeZone(zone);
        __CLR4_5_2175z175zlvha7iqh.R.inc(55961);date3 = dateTimeParser.parse("March 30, 2003 05:30:45.000");
        __CLR4_5_2175z175zlvha7iqh.R.inc(55962);date4 = dateTimeParser.parse("March 30, 2003 01:10:00.000");
        __CLR4_5_2175z175zlvha7iqh.R.inc(55963);date5 = dateTimeParser.parse("March 30, 2003 01:40:00.000");
        __CLR4_5_2175z175zlvha7iqh.R.inc(55964);date6 = dateTimeParser.parse("March 30, 2003 02:10:00.000");
        __CLR4_5_2175z175zlvha7iqh.R.inc(55965);date7 = dateTimeParser.parse("March 30, 2003 02:40:00.000");
        __CLR4_5_2175z175zlvha7iqh.R.inc(55966);date8 = dateTimeParser.parse("October 26, 2003 05:30:45.000");
        __CLR4_5_2175z175zlvha7iqh.R.inc(55967);dateTimeParser.setTimeZone(defaultZone);
        __CLR4_5_2175z175zlvha7iqh.R.inc(55968);TimeZone.setDefault(defaultZone);
        __CLR4_5_2175z175zlvha7iqh.R.inc(55969);calAmPm1 = Calendar.getInstance();
        __CLR4_5_2175z175zlvha7iqh.R.inc(55970);calAmPm1.setTime(dateAmPm1);
        __CLR4_5_2175z175zlvha7iqh.R.inc(55971);calAmPm2 = Calendar.getInstance();
        __CLR4_5_2175z175zlvha7iqh.R.inc(55972);calAmPm2.setTime(dateAmPm2);
        __CLR4_5_2175z175zlvha7iqh.R.inc(55973);calAmPm3 = Calendar.getInstance();
        __CLR4_5_2175z175zlvha7iqh.R.inc(55974);calAmPm3.setTime(dateAmPm3);
        __CLR4_5_2175z175zlvha7iqh.R.inc(55975);calAmPm4 = Calendar.getInstance();
        __CLR4_5_2175z175zlvha7iqh.R.inc(55976);calAmPm4.setTime(dateAmPm4);
        __CLR4_5_2175z175zlvha7iqh.R.inc(55977);cal1 = Calendar.getInstance();
        __CLR4_5_2175z175zlvha7iqh.R.inc(55978);cal1.setTime(date1);
        __CLR4_5_2175z175zlvha7iqh.R.inc(55979);cal2 = Calendar.getInstance();
        __CLR4_5_2175z175zlvha7iqh.R.inc(55980);cal2.setTime(date2);
        __CLR4_5_2175z175zlvha7iqh.R.inc(55981);TimeZone.setDefault(zone);
        __CLR4_5_2175z175zlvha7iqh.R.inc(55982);cal3 = Calendar.getInstance();
        __CLR4_5_2175z175zlvha7iqh.R.inc(55983);cal3.setTime(date3);
        __CLR4_5_2175z175zlvha7iqh.R.inc(55984);cal4 = Calendar.getInstance();
        __CLR4_5_2175z175zlvha7iqh.R.inc(55985);cal4.setTime(date4);
        __CLR4_5_2175z175zlvha7iqh.R.inc(55986);cal5 = Calendar.getInstance();
        __CLR4_5_2175z175zlvha7iqh.R.inc(55987);cal5.setTime(date5);
        __CLR4_5_2175z175zlvha7iqh.R.inc(55988);cal6 = Calendar.getInstance();
        __CLR4_5_2175z175zlvha7iqh.R.inc(55989);cal6.setTime(date6);
        __CLR4_5_2175z175zlvha7iqh.R.inc(55990);cal7 = Calendar.getInstance();
        __CLR4_5_2175z175zlvha7iqh.R.inc(55991);cal7.setTime(date7);
        __CLR4_5_2175z175zlvha7iqh.R.inc(55992);cal8 = Calendar.getInstance();
        __CLR4_5_2175z175zlvha7iqh.R.inc(55993);cal8.setTime(date8);
        __CLR4_5_2175z175zlvha7iqh.R.inc(55994);TimeZone.setDefault(defaultZone);
    }finally{__CLR4_5_2175z175zlvha7iqh.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testConstructor() {__CLR4_5_2175z175zlvha7iqh.R.globalSliceStart(getClass().getName(),55995);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2uefs8h177f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2175z175zlvha7iqh.R.rethrow($CLV_t2$);}finally{__CLR4_5_2175z175zlvha7iqh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsTest.testConstructor",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),55995,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2uefs8h177f(){try{__CLR4_5_2175z175zlvha7iqh.R.inc(55995);
        __CLR4_5_2175z175zlvha7iqh.R.inc(55996);assertNotNull(new DateUtils());
        __CLR4_5_2175z175zlvha7iqh.R.inc(55997);final Constructor<?>[] cons = DateUtils.class.getDeclaredConstructors();
        __CLR4_5_2175z175zlvha7iqh.R.inc(55998);assertEquals(1, cons.length);
        __CLR4_5_2175z175zlvha7iqh.R.inc(55999);assertTrue(Modifier.isPublic(cons[0].getModifiers()));
        __CLR4_5_2175z175zlvha7iqh.R.inc(56000);assertTrue(Modifier.isPublic(DateUtils.class.getModifiers()));
        __CLR4_5_2175z175zlvha7iqh.R.inc(56001);assertFalse(Modifier.isFinal(DateUtils.class.getModifiers()));
    }finally{__CLR4_5_2175z175zlvha7iqh.R.flushNeeded();}}
    
    //-----------------------------------------------------------------------
    @Test
    public void testIsSameDay_Date() {__CLR4_5_2175z175zlvha7iqh.R.globalSliceStart(getClass().getName(),56002);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23yogvu177m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2175z175zlvha7iqh.R.rethrow($CLV_t2$);}finally{__CLR4_5_2175z175zlvha7iqh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsTest.testIsSameDay_Date",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),56002,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23yogvu177m(){try{__CLR4_5_2175z175zlvha7iqh.R.inc(56002);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56003);Date datea = new GregorianCalendar(2004, 6, 9, 13, 45).getTime();
        __CLR4_5_2175z175zlvha7iqh.R.inc(56004);Date dateb = new GregorianCalendar(2004, 6, 9, 13, 45).getTime();
        __CLR4_5_2175z175zlvha7iqh.R.inc(56005);assertTrue(DateUtils.isSameDay(datea, dateb));
        __CLR4_5_2175z175zlvha7iqh.R.inc(56006);dateb = new GregorianCalendar(2004, 6, 10, 13, 45).getTime();
        __CLR4_5_2175z175zlvha7iqh.R.inc(56007);assertFalse(DateUtils.isSameDay(datea, dateb));
        __CLR4_5_2175z175zlvha7iqh.R.inc(56008);datea = new GregorianCalendar(2004, 6, 10, 13, 45).getTime();
        __CLR4_5_2175z175zlvha7iqh.R.inc(56009);assertTrue(DateUtils.isSameDay(datea, dateb));
        __CLR4_5_2175z175zlvha7iqh.R.inc(56010);dateb = new GregorianCalendar(2005, 6, 10, 13, 45).getTime();
        __CLR4_5_2175z175zlvha7iqh.R.inc(56011);assertFalse(DateUtils.isSameDay(datea, dateb));
    }finally{__CLR4_5_2175z175zlvha7iqh.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class)
    public void testIsSameDay_DateNullNull() throws Exception {__CLR4_5_2175z175zlvha7iqh.R.globalSliceStart(getClass().getName(),56012);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2cxy73s177w();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,73,115,83,97,109,101,68,97,121,95,68,97,116,101,78,117,108,108,78,117,108,108,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2175z175zlvha7iqh.R.rethrow($CLV_t2$);}finally{__CLR4_5_2175z175zlvha7iqh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsTest.testIsSameDay_DateNullNull",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),56012,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2cxy73s177w() throws Exception{try{__CLR4_5_2175z175zlvha7iqh.R.inc(56012);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56013);DateUtils.isSameDay((Date) null, null);
    }finally{__CLR4_5_2175z175zlvha7iqh.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class)
    public void testIsSameDay_DateNullNotNull() throws Exception {__CLR4_5_2175z175zlvha7iqh.R.globalSliceStart(getClass().getName(),56014);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n7tyvt177y();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,73,115,83,97,109,101,68,97,121,95,68,97,116,101,78,117,108,108,78,111,116,78,117,108,108,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2175z175zlvha7iqh.R.rethrow($CLV_t2$);}finally{__CLR4_5_2175z175zlvha7iqh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsTest.testIsSameDay_DateNullNotNull",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),56014,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n7tyvt177y() throws Exception{try{__CLR4_5_2175z175zlvha7iqh.R.inc(56014);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56015);DateUtils.isSameDay(null, new Date());
    }finally{__CLR4_5_2175z175zlvha7iqh.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class)
    public void testIsSameDay_DateNotNullNull() throws Exception {__CLR4_5_2175z175zlvha7iqh.R.globalSliceStart(getClass().getName(),56016);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vx9njf1780();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,73,115,83,97,109,101,68,97,121,95,68,97,116,101,78,111,116,78,117,108,108,78,117,108,108,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2175z175zlvha7iqh.R.rethrow($CLV_t2$);}finally{__CLR4_5_2175z175zlvha7iqh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsTest.testIsSameDay_DateNotNullNull",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),56016,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vx9njf1780() throws Exception{try{__CLR4_5_2175z175zlvha7iqh.R.inc(56016);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56017);DateUtils.isSameDay(new Date(), null);
    }finally{__CLR4_5_2175z175zlvha7iqh.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testIsSameDay_Cal() {__CLR4_5_2175z175zlvha7iqh.R.globalSliceStart(getClass().getName(),56018);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26736gg1782();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2175z175zlvha7iqh.R.rethrow($CLV_t2$);}finally{__CLR4_5_2175z175zlvha7iqh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsTest.testIsSameDay_Cal",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),56018,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26736gg1782(){try{__CLR4_5_2175z175zlvha7iqh.R.inc(56018);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56019);final GregorianCalendar cala = new GregorianCalendar(2004, 6, 9, 13, 45);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56020);final GregorianCalendar calb = new GregorianCalendar(2004, 6, 9, 13, 45);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56021);assertTrue(DateUtils.isSameDay(cala, calb));
        __CLR4_5_2175z175zlvha7iqh.R.inc(56022);calb.add(Calendar.DAY_OF_YEAR, 1);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56023);assertFalse(DateUtils.isSameDay(cala, calb));
        __CLR4_5_2175z175zlvha7iqh.R.inc(56024);cala.add(Calendar.DAY_OF_YEAR, 1);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56025);assertTrue(DateUtils.isSameDay(cala, calb));
        __CLR4_5_2175z175zlvha7iqh.R.inc(56026);calb.add(Calendar.YEAR, 1);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56027);assertFalse(DateUtils.isSameDay(cala, calb));
    }finally{__CLR4_5_2175z175zlvha7iqh.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class)
    public void testIsSameDay_CalNullNull() throws Exception {__CLR4_5_2175z175zlvha7iqh.R.globalSliceStart(getClass().getName(),56028);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2l5sw2178c();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,73,115,83,97,109,101,68,97,121,95,67,97,108,78,117,108,108,78,117,108,108,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2175z175zlvha7iqh.R.rethrow($CLV_t2$);}finally{__CLR4_5_2175z175zlvha7iqh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsTest.testIsSameDay_CalNullNull",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),56028,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2l5sw2178c() throws Exception{try{__CLR4_5_2175z175zlvha7iqh.R.inc(56028);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56029);DateUtils.isSameDay((Calendar) null, null);
    }finally{__CLR4_5_2175z175zlvha7iqh.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class)
    public void testIsSameDay_CalNullNotNull() throws Exception {__CLR4_5_2175z175zlvha7iqh.R.globalSliceStart(getClass().getName(),56030);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ubzekv178e();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,73,115,83,97,109,101,68,97,121,95,67,97,108,78,117,108,108,78,111,116,78,117,108,108,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2175z175zlvha7iqh.R.rethrow($CLV_t2$);}finally{__CLR4_5_2175z175zlvha7iqh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsTest.testIsSameDay_CalNullNotNull",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),56030,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ubzekv178e() throws Exception{try{__CLR4_5_2175z175zlvha7iqh.R.inc(56030);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56031);DateUtils.isSameDay(null, Calendar.getInstance());
    }finally{__CLR4_5_2175z175zlvha7iqh.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class)
    public void testIsSameDay_CalNotNullNull() throws Exception {__CLR4_5_2175z175zlvha7iqh.R.globalSliceStart(getClass().getName(),56032);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vzoyqn178g();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,73,115,83,97,109,101,68,97,121,95,67,97,108,78,111,116,78,117,108,108,78,117,108,108,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2175z175zlvha7iqh.R.rethrow($CLV_t2$);}finally{__CLR4_5_2175z175zlvha7iqh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsTest.testIsSameDay_CalNotNullNull",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),56032,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vzoyqn178g() throws Exception{try{__CLR4_5_2175z175zlvha7iqh.R.inc(56032);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56033);DateUtils.isSameDay(Calendar.getInstance(), null);
    }finally{__CLR4_5_2175z175zlvha7iqh.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testIsSameInstant_Date() {__CLR4_5_2175z175zlvha7iqh.R.globalSliceStart(getClass().getName(),56034);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_29e4g7f178i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2175z175zlvha7iqh.R.rethrow($CLV_t2$);}finally{__CLR4_5_2175z175zlvha7iqh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsTest.testIsSameInstant_Date",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),56034,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_29e4g7f178i(){try{__CLR4_5_2175z175zlvha7iqh.R.inc(56034);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56035);Date datea = new GregorianCalendar(2004, 6, 9, 13, 45).getTime();
        __CLR4_5_2175z175zlvha7iqh.R.inc(56036);Date dateb = new GregorianCalendar(2004, 6, 9, 13, 45).getTime();
        __CLR4_5_2175z175zlvha7iqh.R.inc(56037);assertTrue(DateUtils.isSameInstant(datea, dateb));
        __CLR4_5_2175z175zlvha7iqh.R.inc(56038);dateb = new GregorianCalendar(2004, 6, 10, 13, 45).getTime();
        __CLR4_5_2175z175zlvha7iqh.R.inc(56039);assertFalse(DateUtils.isSameInstant(datea, dateb));
        __CLR4_5_2175z175zlvha7iqh.R.inc(56040);datea = new GregorianCalendar(2004, 6, 10, 13, 45).getTime();
        __CLR4_5_2175z175zlvha7iqh.R.inc(56041);assertTrue(DateUtils.isSameInstant(datea, dateb));
        __CLR4_5_2175z175zlvha7iqh.R.inc(56042);dateb = new GregorianCalendar(2005, 6, 10, 13, 45).getTime();
        __CLR4_5_2175z175zlvha7iqh.R.inc(56043);assertFalse(DateUtils.isSameInstant(datea, dateb));
    }finally{__CLR4_5_2175z175zlvha7iqh.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class)
    public void testIsSameInstant_DateNullNull() throws Exception {__CLR4_5_2175z175zlvha7iqh.R.globalSliceStart(getClass().getName(),56044);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2mc3fgj178s();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,73,115,83,97,109,101,73,110,115,116,97,110,116,95,68,97,116,101,78,117,108,108,78,117,108,108,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2175z175zlvha7iqh.R.rethrow($CLV_t2$);}finally{__CLR4_5_2175z175zlvha7iqh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsTest.testIsSameInstant_DateNullNull",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),56044,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2mc3fgj178s() throws Exception{try{__CLR4_5_2175z175zlvha7iqh.R.inc(56044);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56045);DateUtils.isSameInstant((Date) null, null);
    }finally{__CLR4_5_2175z175zlvha7iqh.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class)
    public void testIsSameInstant_DateNullNotNull() throws Exception {__CLR4_5_2175z175zlvha7iqh.R.globalSliceStart(getClass().getName(),56046);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_215tjv0178u();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,73,115,83,97,109,101,73,110,115,116,97,110,116,95,68,97,116,101,78,117,108,108,78,111,116,78,117,108,108,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2175z175zlvha7iqh.R.rethrow($CLV_t2$);}finally{__CLR4_5_2175z175zlvha7iqh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsTest.testIsSameInstant_DateNullNotNull",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),56046,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_215tjv0178u() throws Exception{try{__CLR4_5_2175z175zlvha7iqh.R.inc(56046);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56047);DateUtils.isSameInstant(null, new Date());
    }finally{__CLR4_5_2175z175zlvha7iqh.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class)
    public void testIsSameInstant_DateNotNullNull() throws Exception {__CLR4_5_2175z175zlvha7iqh.R.globalSliceStart(getClass().getName(),56048);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27jm4sm178w();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,73,115,83,97,109,101,73,110,115,116,97,110,116,95,68,97,116,101,78,111,116,78,117,108,108,78,117,108,108,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2175z175zlvha7iqh.R.rethrow($CLV_t2$);}finally{__CLR4_5_2175z175zlvha7iqh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsTest.testIsSameInstant_DateNotNullNull",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),56048,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27jm4sm178w() throws Exception{try{__CLR4_5_2175z175zlvha7iqh.R.inc(56048);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56049);DateUtils.isSameInstant(new Date(), null);
    }finally{__CLR4_5_2175z175zlvha7iqh.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testIsSameInstant_Cal() {__CLR4_5_2175z175zlvha7iqh.R.globalSliceStart(getClass().getName(),56050);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2h5aoa3178y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2175z175zlvha7iqh.R.rethrow($CLV_t2$);}finally{__CLR4_5_2175z175zlvha7iqh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsTest.testIsSameInstant_Cal",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),56050,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2h5aoa3178y(){try{__CLR4_5_2175z175zlvha7iqh.R.inc(56050);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56051);final GregorianCalendar cala = new GregorianCalendar(TimeZone.getTimeZone("GMT+1"));
        __CLR4_5_2175z175zlvha7iqh.R.inc(56052);final GregorianCalendar calb = new GregorianCalendar(TimeZone.getTimeZone("GMT-1"));
        __CLR4_5_2175z175zlvha7iqh.R.inc(56053);cala.set(2004, Calendar.JULY, 9, 13, 45, 0);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56054);cala.set(Calendar.MILLISECOND, 0);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56055);calb.set(2004, Calendar.JULY, 9, 13, 45, 0);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56056);calb.set(Calendar.MILLISECOND, 0);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56057);assertFalse(DateUtils.isSameInstant(cala, calb));
        
        __CLR4_5_2175z175zlvha7iqh.R.inc(56058);calb.set(2004, Calendar.JULY, 9, 11, 45, 0);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56059);assertTrue(DateUtils.isSameInstant(cala, calb));
    }finally{__CLR4_5_2175z175zlvha7iqh.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class)
    public void testIsSameInstant_CalNullNull() throws Exception {__CLR4_5_2175z175zlvha7iqh.R.globalSliceStart(getClass().getName(),56060);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2wmmsgz1798();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,73,115,83,97,109,101,73,110,115,116,97,110,116,95,67,97,108,78,117,108,108,78,117,108,108,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2175z175zlvha7iqh.R.rethrow($CLV_t2$);}finally{__CLR4_5_2175z175zlvha7iqh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsTest.testIsSameInstant_CalNullNull",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),56060,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2wmmsgz1798() throws Exception{try{__CLR4_5_2175z175zlvha7iqh.R.inc(56060);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56061);DateUtils.isSameInstant((Calendar) null, null);
    }finally{__CLR4_5_2175z175zlvha7iqh.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class)
    public void testIsSameInstant_CalNullNotNull() throws Exception {__CLR4_5_2175z175zlvha7iqh.R.globalSliceStart(getClass().getName(),56062);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28xa8r8179a();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,73,115,83,97,109,101,73,110,115,116,97,110,116,95,67,97,108,78,117,108,108,78,111,116,78,117,108,108,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2175z175zlvha7iqh.R.rethrow($CLV_t2$);}finally{__CLR4_5_2175z175zlvha7iqh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsTest.testIsSameInstant_CalNullNotNull",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),56062,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28xa8r8179a() throws Exception{try{__CLR4_5_2175z175zlvha7iqh.R.inc(56062);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56063);DateUtils.isSameInstant(null, Calendar.getInstance());
    }finally{__CLR4_5_2175z175zlvha7iqh.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class)
    public void testIsSameInstant_CalNotNullNull() throws Exception {__CLR4_5_2175z175zlvha7iqh.R.globalSliceStart(getClass().getName(),56064);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hmpxeu179c();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,73,115,83,97,109,101,73,110,115,116,97,110,116,95,67,97,108,78,111,116,78,117,108,108,78,117,108,108,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2175z175zlvha7iqh.R.rethrow($CLV_t2$);}finally{__CLR4_5_2175z175zlvha7iqh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsTest.testIsSameInstant_CalNotNullNull",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),56064,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hmpxeu179c() throws Exception{try{__CLR4_5_2175z175zlvha7iqh.R.inc(56064);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56065);DateUtils.isSameInstant(Calendar.getInstance(), null);
    }finally{__CLR4_5_2175z175zlvha7iqh.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testIsSameLocalTime_Cal() {__CLR4_5_2175z175zlvha7iqh.R.globalSliceStart(getClass().getName(),56066);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ofpq5o179e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2175z175zlvha7iqh.R.rethrow($CLV_t2$);}finally{__CLR4_5_2175z175zlvha7iqh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsTest.testIsSameLocalTime_Cal",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),56066,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ofpq5o179e(){try{__CLR4_5_2175z175zlvha7iqh.R.inc(56066);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56067);final GregorianCalendar cala = new GregorianCalendar(TimeZone.getTimeZone("GMT+1"));
        __CLR4_5_2175z175zlvha7iqh.R.inc(56068);final GregorianCalendar calb = new GregorianCalendar(TimeZone.getTimeZone("GMT-1"));
        __CLR4_5_2175z175zlvha7iqh.R.inc(56069);cala.set(2004, Calendar.JULY, 9, 13, 45, 0);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56070);cala.set(Calendar.MILLISECOND, 0);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56071);calb.set(2004, Calendar.JULY, 9, 13, 45, 0);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56072);calb.set(Calendar.MILLISECOND, 0);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56073);assertTrue(DateUtils.isSameLocalTime(cala, calb));

        __CLR4_5_2175z175zlvha7iqh.R.inc(56074);final Calendar calc = Calendar.getInstance();
        __CLR4_5_2175z175zlvha7iqh.R.inc(56075);final Calendar cald = Calendar.getInstance();
        __CLR4_5_2175z175zlvha7iqh.R.inc(56076);calc.set(2004, Calendar.JULY, 9, 4,  0, 0);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56077);cald.set(2004, Calendar.JULY, 9, 16, 0, 0);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56078);calc.set(Calendar.MILLISECOND, 0);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56079);cald.set(Calendar.MILLISECOND, 0);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56080);assertFalse("LANG-677", DateUtils.isSameLocalTime(calc, cald));
        
        __CLR4_5_2175z175zlvha7iqh.R.inc(56081);calb.set(2004, Calendar.JULY, 9, 11, 45, 0);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56082);assertFalse(DateUtils.isSameLocalTime(cala, calb));
    }finally{__CLR4_5_2175z175zlvha7iqh.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class)
    public void testIsSameLocalTime_CalNullNull() throws Exception {__CLR4_5_2175z175zlvha7iqh.R.globalSliceStart(getClass().getName(),56083);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ybx516179v();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,73,115,83,97,109,101,76,111,99,97,108,84,105,109,101,95,67,97,108,78,117,108,108,78,117,108,108,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2175z175zlvha7iqh.R.rethrow($CLV_t2$);}finally{__CLR4_5_2175z175zlvha7iqh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsTest.testIsSameLocalTime_CalNullNull",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),56083,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ybx516179v() throws Exception{try{__CLR4_5_2175z175zlvha7iqh.R.inc(56083);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56084);DateUtils.isSameLocalTime(null, null);
    }finally{__CLR4_5_2175z175zlvha7iqh.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class)
    public void testIsSameLocalTime_CalNullNotNull() throws Exception {__CLR4_5_2175z175zlvha7iqh.R.globalSliceStart(getClass().getName(),56085);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27wovnv179x();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,73,115,83,97,109,101,76,111,99,97,108,84,105,109,101,95,67,97,108,78,117,108,108,78,111,116,78,117,108,108,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2175z175zlvha7iqh.R.rethrow($CLV_t2$);}finally{__CLR4_5_2175z175zlvha7iqh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsTest.testIsSameLocalTime_CalNullNotNull",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),56085,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27wovnv179x() throws Exception{try{__CLR4_5_2175z175zlvha7iqh.R.inc(56085);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56086);DateUtils.isSameLocalTime(null, Calendar.getInstance());
    }finally{__CLR4_5_2175z175zlvha7iqh.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class)
    public void testIsSameLocalTime_CalNotNullNull() throws Exception {__CLR4_5_2175z175zlvha7iqh.R.globalSliceStart(getClass().getName(),56087);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gm4kbh179z();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,73,115,83,97,109,101,76,111,99,97,108,84,105,109,101,95,67,97,108,78,111,116,78,117,108,108,78,117,108,108,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2175z175zlvha7iqh.R.rethrow($CLV_t2$);}finally{__CLR4_5_2175z175zlvha7iqh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsTest.testIsSameLocalTime_CalNotNullNull",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),56087,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gm4kbh179z() throws Exception{try{__CLR4_5_2175z175zlvha7iqh.R.inc(56087);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56088);DateUtils.isSameLocalTime(Calendar.getInstance(), null);
    }finally{__CLR4_5_2175z175zlvha7iqh.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testParseDate() throws Exception {__CLR4_5_2175z175zlvha7iqh.R.globalSliceStart(getClass().getName(),56089);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2148ft617a1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2175z175zlvha7iqh.R.rethrow($CLV_t2$);}finally{__CLR4_5_2175z175zlvha7iqh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsTest.testParseDate",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),56089,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2148ft617a1() throws Exception{try{__CLR4_5_2175z175zlvha7iqh.R.inc(56089);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56090);final GregorianCalendar cal = new GregorianCalendar(1972, 11, 3);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56091);String dateStr = "1972-12-03";
        __CLR4_5_2175z175zlvha7iqh.R.inc(56092);final String[] parsers = new String[] {"yyyy'-'DDD", "yyyy'-'MM'-'dd", "yyyyMMdd"};
        __CLR4_5_2175z175zlvha7iqh.R.inc(56093);Date date = DateUtils.parseDate(dateStr, parsers);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56094);assertEquals(cal.getTime(), date);
        
        __CLR4_5_2175z175zlvha7iqh.R.inc(56095);dateStr = "1972-338";
        __CLR4_5_2175z175zlvha7iqh.R.inc(56096);date = DateUtils.parseDate(dateStr, parsers);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56097);assertEquals(cal.getTime(), date);
        
        __CLR4_5_2175z175zlvha7iqh.R.inc(56098);dateStr = "19721203";
        __CLR4_5_2175z175zlvha7iqh.R.inc(56099);date = DateUtils.parseDate(dateStr, parsers);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56100);assertEquals(cal.getTime(), date);
    }finally{__CLR4_5_2175z175zlvha7iqh.R.flushNeeded();}}

    @Test(expected = ParseException.class)
    public void testParseDate_NoDateString() throws Exception {__CLR4_5_2175z175zlvha7iqh.R.globalSliceStart(getClass().getName(),56101);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hqoi6v17ad();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,80,97,114,115,101,68,97,116,101,95,78,111,68,97,116,101,83,116,114,105,110,103,58,32,91,80,97,114,115,101,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof ParseException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2175z175zlvha7iqh.R.rethrow($CLV_t2$);}finally{__CLR4_5_2175z175zlvha7iqh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsTest.testParseDate_NoDateString",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),56101,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hqoi6v17ad() throws Exception{try{__CLR4_5_2175z175zlvha7iqh.R.inc(56101);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56102);final String[] parsers = new String[] {"yyyy'-'DDD", "yyyy'-'MM'-'dd", "yyyyMMdd"};
        __CLR4_5_2175z175zlvha7iqh.R.inc(56103);DateUtils.parseDate("PURPLE", parsers);
    }finally{__CLR4_5_2175z175zlvha7iqh.R.flushNeeded();}}

    @Test(expected = ParseException.class)
    public void testParseDate_InvalidDateString() throws Exception {__CLR4_5_2175z175zlvha7iqh.R.globalSliceStart(getClass().getName(),56104);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2utowa517ag();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,80,97,114,115,101,68,97,116,101,95,73,110,118,97,108,105,100,68,97,116,101,83,116,114,105,110,103,58,32,91,80,97,114,115,101,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof ParseException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2175z175zlvha7iqh.R.rethrow($CLV_t2$);}finally{__CLR4_5_2175z175zlvha7iqh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsTest.testParseDate_InvalidDateString",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),56104,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2utowa517ag() throws Exception{try{__CLR4_5_2175z175zlvha7iqh.R.inc(56104);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56105);final String[] parsers = new String[] {"yyyy'-'DDD", "yyyy'-'MM'-'dd", "yyyyMMdd"};
        __CLR4_5_2175z175zlvha7iqh.R.inc(56106);DateUtils.parseDate("197212AB", parsers);
    }finally{__CLR4_5_2175z175zlvha7iqh.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class)
    public void testParseDate_Null() throws Exception {__CLR4_5_2175z175zlvha7iqh.R.globalSliceStart(getClass().getName(),56107);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2pv7mf617aj();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,80,97,114,115,101,68,97,116,101,95,78,117,108,108,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2175z175zlvha7iqh.R.rethrow($CLV_t2$);}finally{__CLR4_5_2175z175zlvha7iqh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsTest.testParseDate_Null",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),56107,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2pv7mf617aj() throws Exception{try{__CLR4_5_2175z175zlvha7iqh.R.inc(56107);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56108);final String[] parsers = new String[] {"yyyy'-'DDD", "yyyy'-'MM'-'dd", "yyyyMMdd"};
        __CLR4_5_2175z175zlvha7iqh.R.inc(56109);DateUtils.parseDate(null, parsers);
    }finally{__CLR4_5_2175z175zlvha7iqh.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class)
    public void testParse_NullParsers() throws Exception {__CLR4_5_2175z175zlvha7iqh.R.globalSliceStart(getClass().getName(),56110);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2sdab6217am();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,80,97,114,115,101,95,78,117,108,108,80,97,114,115,101,114,115,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2175z175zlvha7iqh.R.rethrow($CLV_t2$);}finally{__CLR4_5_2175z175zlvha7iqh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsTest.testParse_NullParsers",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),56110,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2sdab6217am() throws Exception{try{__CLR4_5_2175z175zlvha7iqh.R.inc(56110);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56111);DateUtils.parseDate("19721203", (String[]) null);
    }finally{__CLR4_5_2175z175zlvha7iqh.R.flushNeeded();}}
    
    @Test(expected = ParseException.class)
    public void testParse_EmptyParsers() throws Exception {__CLR4_5_2175z175zlvha7iqh.R.globalSliceStart(getClass().getName(),56112);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2phv19o17ao();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,80,97,114,115,101,95,69,109,112,116,121,80,97,114,115,101,114,115,58,32,91,80,97,114,115,101,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof ParseException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2175z175zlvha7iqh.R.rethrow($CLV_t2$);}finally{__CLR4_5_2175z175zlvha7iqh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsTest.testParse_EmptyParsers",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),56112,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2phv19o17ao() throws Exception{try{__CLR4_5_2175z175zlvha7iqh.R.inc(56112);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56113);DateUtils.parseDate("19721203");
    }finally{__CLR4_5_2175z175zlvha7iqh.R.flushNeeded();}}

    // LANG-486
    @Test
    public void testParseDateWithLeniency() throws Exception {__CLR4_5_2175z175zlvha7iqh.R.globalSliceStart(getClass().getName(),56114);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2o9wlyn17aq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2175z175zlvha7iqh.R.rethrow($CLV_t2$);}finally{__CLR4_5_2175z175zlvha7iqh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsTest.testParseDateWithLeniency",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),56114,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2o9wlyn17aq() throws Exception{try{__CLR4_5_2175z175zlvha7iqh.R.inc(56114);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56115);final GregorianCalendar cal = new GregorianCalendar(1998, 6, 30);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56116);final String dateStr = "02 942, 1996";
        __CLR4_5_2175z175zlvha7iqh.R.inc(56117);final String[] parsers = new String[] {"MM DDD, yyyy"};
        
        __CLR4_5_2175z175zlvha7iqh.R.inc(56118);final Date date = DateUtils.parseDate(dateStr, parsers);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56119);assertEquals(cal.getTime(), date);
        
        __CLR4_5_2175z175zlvha7iqh.R.inc(56120);try {
            __CLR4_5_2175z175zlvha7iqh.R.inc(56121);DateUtils.parseDateStrictly(dateStr, parsers);
            __CLR4_5_2175z175zlvha7iqh.R.inc(56122);fail();
        } catch (final ParseException ex) {}
    }finally{__CLR4_5_2175z175zlvha7iqh.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testAddYears() throws Exception {__CLR4_5_2175z175zlvha7iqh.R.globalSliceStart(getClass().getName(),56123);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2pigqmm17az();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2175z175zlvha7iqh.R.rethrow($CLV_t2$);}finally{__CLR4_5_2175z175zlvha7iqh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsTest.testAddYears",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),56123,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2pigqmm17az() throws Exception{try{__CLR4_5_2175z175zlvha7iqh.R.inc(56123);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56124);Date result = DateUtils.addYears(BASE_DATE, 0);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56125);assertNotSame(BASE_DATE, result);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56126);assertDate(BASE_DATE, 2000, 6, 5, 4, 3, 2, 1);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56127);assertDate(result, 2000, 6, 5, 4, 3, 2, 1);
        
        __CLR4_5_2175z175zlvha7iqh.R.inc(56128);result = DateUtils.addYears(BASE_DATE, 1);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56129);assertNotSame(BASE_DATE, result);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56130);assertDate(BASE_DATE, 2000, 6, 5, 4, 3, 2, 1);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56131);assertDate(result, 2001, 6, 5, 4, 3, 2, 1);
        
        __CLR4_5_2175z175zlvha7iqh.R.inc(56132);result = DateUtils.addYears(BASE_DATE, -1);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56133);assertNotSame(BASE_DATE, result);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56134);assertDate(BASE_DATE, 2000, 6, 5, 4, 3, 2, 1);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56135);assertDate(result, 1999, 6, 5, 4, 3, 2, 1);
    }finally{__CLR4_5_2175z175zlvha7iqh.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testAddMonths() throws Exception {__CLR4_5_2175z175zlvha7iqh.R.globalSliceStart(getClass().getName(),56136);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n5eqa117bc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2175z175zlvha7iqh.R.rethrow($CLV_t2$);}finally{__CLR4_5_2175z175zlvha7iqh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsTest.testAddMonths",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),56136,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n5eqa117bc() throws Exception{try{__CLR4_5_2175z175zlvha7iqh.R.inc(56136);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56137);Date result = DateUtils.addMonths(BASE_DATE, 0);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56138);assertNotSame(BASE_DATE, result);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56139);assertDate(BASE_DATE, 2000, 6, 5, 4, 3, 2, 1);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56140);assertDate(result, 2000, 6, 5, 4, 3, 2, 1);
        
        __CLR4_5_2175z175zlvha7iqh.R.inc(56141);result = DateUtils.addMonths(BASE_DATE, 1);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56142);assertNotSame(BASE_DATE, result);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56143);assertDate(BASE_DATE, 2000, 6, 5, 4, 3, 2, 1);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56144);assertDate(result, 2000, 7, 5, 4, 3, 2, 1);
        
        __CLR4_5_2175z175zlvha7iqh.R.inc(56145);result = DateUtils.addMonths(BASE_DATE, -1);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56146);assertNotSame(BASE_DATE, result);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56147);assertDate(BASE_DATE, 2000, 6, 5, 4, 3, 2, 1);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56148);assertDate(result, 2000, 5, 5, 4, 3, 2, 1);
    }finally{__CLR4_5_2175z175zlvha7iqh.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testAddWeeks() throws Exception {__CLR4_5_2175z175zlvha7iqh.R.globalSliceStart(getClass().getName(),56149);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_25be28n17bp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2175z175zlvha7iqh.R.rethrow($CLV_t2$);}finally{__CLR4_5_2175z175zlvha7iqh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsTest.testAddWeeks",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),56149,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_25be28n17bp() throws Exception{try{__CLR4_5_2175z175zlvha7iqh.R.inc(56149);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56150);Date result = DateUtils.addWeeks(BASE_DATE, 0);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56151);assertNotSame(BASE_DATE, result);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56152);assertDate(BASE_DATE, 2000, 6, 5, 4, 3, 2, 1);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56153);assertDate(result, 2000, 6, 5, 4, 3, 2, 1);
        
        __CLR4_5_2175z175zlvha7iqh.R.inc(56154);result = DateUtils.addWeeks(BASE_DATE, 1);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56155);assertNotSame(BASE_DATE, result);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56156);assertDate(BASE_DATE, 2000, 6, 5, 4, 3, 2, 1);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56157);assertDate(result, 2000, 6, 12, 4, 3, 2, 1);
        
        __CLR4_5_2175z175zlvha7iqh.R.inc(56158);result = DateUtils.addWeeks(BASE_DATE, -1);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56159);assertNotSame(BASE_DATE, result);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56160);assertDate(BASE_DATE, 2000, 6, 5, 4, 3, 2, 1);      // july
        __CLR4_5_2175z175zlvha7iqh.R.inc(56161);assertDate(result, 2000, 5, 28, 4, 3, 2, 1);   // june
    }finally{__CLR4_5_2175z175zlvha7iqh.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testAddDays() throws Exception {__CLR4_5_2175z175zlvha7iqh.R.globalSliceStart(getClass().getName(),56162);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hq0g1917c2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2175z175zlvha7iqh.R.rethrow($CLV_t2$);}finally{__CLR4_5_2175z175zlvha7iqh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsTest.testAddDays",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),56162,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hq0g1917c2() throws Exception{try{__CLR4_5_2175z175zlvha7iqh.R.inc(56162);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56163);Date result = DateUtils.addDays(BASE_DATE, 0);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56164);assertNotSame(BASE_DATE, result);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56165);assertDate(BASE_DATE, 2000, 6, 5, 4, 3, 2, 1);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56166);assertDate(result, 2000, 6, 5, 4, 3, 2, 1);
        
        __CLR4_5_2175z175zlvha7iqh.R.inc(56167);result = DateUtils.addDays(BASE_DATE, 1);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56168);assertNotSame(BASE_DATE, result);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56169);assertDate(BASE_DATE, 2000, 6, 5, 4, 3, 2, 1);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56170);assertDate(result, 2000, 6, 6, 4, 3, 2, 1);
        
        __CLR4_5_2175z175zlvha7iqh.R.inc(56171);result = DateUtils.addDays(BASE_DATE, -1);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56172);assertNotSame(BASE_DATE, result);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56173);assertDate(BASE_DATE, 2000, 6, 5, 4, 3, 2, 1);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56174);assertDate(result, 2000, 6, 4, 4, 3, 2, 1);
    }finally{__CLR4_5_2175z175zlvha7iqh.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testAddHours() throws Exception {__CLR4_5_2175z175zlvha7iqh.R.globalSliceStart(getClass().getName(),56175);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2v9jld317cf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2175z175zlvha7iqh.R.rethrow($CLV_t2$);}finally{__CLR4_5_2175z175zlvha7iqh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsTest.testAddHours",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),56175,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2v9jld317cf() throws Exception{try{__CLR4_5_2175z175zlvha7iqh.R.inc(56175);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56176);Date result = DateUtils.addHours(BASE_DATE, 0);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56177);assertNotSame(BASE_DATE, result);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56178);assertDate(BASE_DATE, 2000, 6, 5, 4, 3, 2, 1);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56179);assertDate(result, 2000, 6, 5, 4, 3, 2, 1);
        
        __CLR4_5_2175z175zlvha7iqh.R.inc(56180);result = DateUtils.addHours(BASE_DATE, 1);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56181);assertNotSame(BASE_DATE, result);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56182);assertDate(BASE_DATE, 2000, 6, 5, 4, 3, 2, 1);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56183);assertDate(result, 2000, 6, 5, 5, 3, 2, 1);
        
        __CLR4_5_2175z175zlvha7iqh.R.inc(56184);result = DateUtils.addHours(BASE_DATE, -1);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56185);assertNotSame(BASE_DATE, result);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56186);assertDate(BASE_DATE, 2000, 6, 5, 4, 3, 2, 1);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56187);assertDate(result, 2000, 6, 5, 3, 3, 2, 1);
    }finally{__CLR4_5_2175z175zlvha7iqh.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testAddMinutes() throws Exception {__CLR4_5_2175z175zlvha7iqh.R.globalSliceStart(getClass().getName(),56188);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2pu9rbd17cs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2175z175zlvha7iqh.R.rethrow($CLV_t2$);}finally{__CLR4_5_2175z175zlvha7iqh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsTest.testAddMinutes",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),56188,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2pu9rbd17cs() throws Exception{try{__CLR4_5_2175z175zlvha7iqh.R.inc(56188);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56189);Date result = DateUtils.addMinutes(BASE_DATE, 0);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56190);assertNotSame(BASE_DATE, result);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56191);assertDate(BASE_DATE, 2000, 6, 5, 4, 3, 2, 1);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56192);assertDate(result, 2000, 6, 5, 4, 3, 2, 1);
        
        __CLR4_5_2175z175zlvha7iqh.R.inc(56193);result = DateUtils.addMinutes(BASE_DATE, 1);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56194);assertNotSame(BASE_DATE, result);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56195);assertDate(BASE_DATE, 2000, 6, 5, 4, 3, 2, 1);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56196);assertDate(result, 2000, 6, 5, 4, 4, 2, 1);
        
        __CLR4_5_2175z175zlvha7iqh.R.inc(56197);result = DateUtils.addMinutes(BASE_DATE, -1);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56198);assertNotSame(BASE_DATE, result);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56199);assertDate(BASE_DATE, 2000, 6, 5, 4, 3, 2, 1);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56200);assertDate(result, 2000, 6, 5, 4, 2, 2, 1);
    }finally{__CLR4_5_2175z175zlvha7iqh.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testAddSeconds() throws Exception {__CLR4_5_2175z175zlvha7iqh.R.globalSliceStart(getClass().getName(),56201);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2dg3my117d5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2175z175zlvha7iqh.R.rethrow($CLV_t2$);}finally{__CLR4_5_2175z175zlvha7iqh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsTest.testAddSeconds",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),56201,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2dg3my117d5() throws Exception{try{__CLR4_5_2175z175zlvha7iqh.R.inc(56201);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56202);Date result = DateUtils.addSeconds(BASE_DATE, 0);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56203);assertNotSame(BASE_DATE, result);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56204);assertDate(BASE_DATE, 2000, 6, 5, 4, 3, 2, 1);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56205);assertDate(result, 2000, 6, 5, 4, 3, 2, 1);
        
        __CLR4_5_2175z175zlvha7iqh.R.inc(56206);result = DateUtils.addSeconds(BASE_DATE, 1);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56207);assertNotSame(BASE_DATE, result);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56208);assertDate(BASE_DATE, 2000, 6, 5, 4, 3, 2, 1);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56209);assertDate(result, 2000, 6, 5, 4, 3, 3, 1);
        
        __CLR4_5_2175z175zlvha7iqh.R.inc(56210);result = DateUtils.addSeconds(BASE_DATE, -1);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56211);assertNotSame(BASE_DATE, result);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56212);assertDate(BASE_DATE, 2000, 6, 5, 4, 3, 2, 1);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56213);assertDate(result, 2000, 6, 5, 4, 3, 1, 1);
    }finally{__CLR4_5_2175z175zlvha7iqh.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testAddMilliseconds() throws Exception {__CLR4_5_2175z175zlvha7iqh.R.globalSliceStart(getClass().getName(),56214);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27wvhx417di();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2175z175zlvha7iqh.R.rethrow($CLV_t2$);}finally{__CLR4_5_2175z175zlvha7iqh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsTest.testAddMilliseconds",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),56214,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27wvhx417di() throws Exception{try{__CLR4_5_2175z175zlvha7iqh.R.inc(56214);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56215);Date result = DateUtils.addMilliseconds(BASE_DATE, 0);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56216);assertNotSame(BASE_DATE, result);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56217);assertDate(BASE_DATE, 2000, 6, 5, 4, 3, 2, 1);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56218);assertDate(result, 2000, 6, 5, 4, 3, 2, 1);
        
        __CLR4_5_2175z175zlvha7iqh.R.inc(56219);result = DateUtils.addMilliseconds(BASE_DATE, 1);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56220);assertNotSame(BASE_DATE, result);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56221);assertDate(BASE_DATE, 2000, 6, 5, 4, 3, 2, 1);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56222);assertDate(result, 2000, 6, 5, 4, 3, 2, 2);
        
        __CLR4_5_2175z175zlvha7iqh.R.inc(56223);result = DateUtils.addMilliseconds(BASE_DATE, -1);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56224);assertNotSame(BASE_DATE, result);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56225);assertDate(BASE_DATE, 2000, 6, 5, 4, 3, 2, 1);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56226);assertDate(result, 2000, 6, 5, 4, 3, 2, 0);
    }finally{__CLR4_5_2175z175zlvha7iqh.R.flushNeeded();}}

    // -----------------------------------------------------------------------
    @Test
    public void testSetYears() throws Exception {__CLR4_5_2175z175zlvha7iqh.R.globalSliceStart(getClass().getName(),56227);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2diokb117dv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2175z175zlvha7iqh.R.rethrow($CLV_t2$);}finally{__CLR4_5_2175z175zlvha7iqh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsTest.testSetYears",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),56227,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2diokb117dv() throws Exception{try{__CLR4_5_2175z175zlvha7iqh.R.inc(56227);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56228);Date result = DateUtils.setYears(BASE_DATE, 2000);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56229);assertNotSame(BASE_DATE, result);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56230);assertDate(BASE_DATE, 2000, 6, 5, 4, 3, 2, 1);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56231);assertDate(result, 2000, 6, 5, 4, 3, 2, 1);

        __CLR4_5_2175z175zlvha7iqh.R.inc(56232);result = DateUtils.setYears(BASE_DATE, 2008);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56233);assertNotSame(BASE_DATE, result);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56234);assertDate(BASE_DATE, 2000, 6, 5, 4, 3, 2, 1);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56235);assertDate(result, 2008, 6, 5, 4, 3, 2, 1);

        __CLR4_5_2175z175zlvha7iqh.R.inc(56236);result = DateUtils.setYears(BASE_DATE, 2005);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56237);assertNotSame(BASE_DATE, result);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56238);assertDate(BASE_DATE, 2000, 6, 5, 4, 3, 2, 1);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56239);assertDate(result, 2005, 6, 5, 4, 3, 2, 1);
    }finally{__CLR4_5_2175z175zlvha7iqh.R.flushNeeded();}}

    // -----------------------------------------------------------------------
    @Test
    public void testSetMonths() throws Exception {__CLR4_5_2175z175zlvha7iqh.R.globalSliceStart(getClass().getName(),56240);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26hpk6i17e8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2175z175zlvha7iqh.R.rethrow($CLV_t2$);}finally{__CLR4_5_2175z175zlvha7iqh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsTest.testSetMonths",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),56240,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26hpk6i17e8() throws Exception{try{__CLR4_5_2175z175zlvha7iqh.R.inc(56240);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56241);Date result = DateUtils.setMonths(BASE_DATE, 5);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56242);assertNotSame(BASE_DATE, result);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56243);assertDate(BASE_DATE, 2000, 6, 5, 4, 3, 2, 1);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56244);assertDate(result, 2000, 5, 5, 4, 3, 2, 1);

        __CLR4_5_2175z175zlvha7iqh.R.inc(56245);result = DateUtils.setMonths(BASE_DATE, 1);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56246);assertNotSame(BASE_DATE, result);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56247);assertDate(BASE_DATE, 2000, 6, 5, 4, 3, 2, 1);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56248);assertDate(result, 2000, 1, 5, 4, 3, 2, 1);

        __CLR4_5_2175z175zlvha7iqh.R.inc(56249);try {
            __CLR4_5_2175z175zlvha7iqh.R.inc(56250);DateUtils.setMonths(BASE_DATE, 12);
            __CLR4_5_2175z175zlvha7iqh.R.inc(56251);fail("DateUtils.setMonths did not throw an expected IllegalArgumentException.");
        } catch (final IllegalArgumentException e) {

        }
    }finally{__CLR4_5_2175z175zlvha7iqh.R.flushNeeded();}}

    // -----------------------------------------------------------------------
    @Test
    public void testSetDays() throws Exception {__CLR4_5_2175z175zlvha7iqh.R.globalSliceStart(getClass().getName(),56252);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_25kshbm17ek();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2175z175zlvha7iqh.R.rethrow($CLV_t2$);}finally{__CLR4_5_2175z175zlvha7iqh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsTest.testSetDays",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),56252,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_25kshbm17ek() throws Exception{try{__CLR4_5_2175z175zlvha7iqh.R.inc(56252);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56253);Date result = DateUtils.setDays(BASE_DATE, 1);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56254);assertNotSame(BASE_DATE, result);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56255);assertDate(BASE_DATE, 2000, 6, 5, 4, 3, 2, 1);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56256);assertDate(result, 2000, 6, 1, 4, 3, 2, 1);

        __CLR4_5_2175z175zlvha7iqh.R.inc(56257);result = DateUtils.setDays(BASE_DATE, 29);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56258);assertNotSame(BASE_DATE, result);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56259);assertDate(BASE_DATE, 2000, 6, 5, 4, 3, 2, 1);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56260);assertDate(result, 2000, 6, 29, 4, 3, 2, 1);

        __CLR4_5_2175z175zlvha7iqh.R.inc(56261);try {
            __CLR4_5_2175z175zlvha7iqh.R.inc(56262);DateUtils.setDays(BASE_DATE, 32);
            __CLR4_5_2175z175zlvha7iqh.R.inc(56263);fail("DateUtils.setDays did not throw an expected IllegalArgumentException.");
        } catch (final IllegalArgumentException e) {

        }
    }finally{__CLR4_5_2175z175zlvha7iqh.R.flushNeeded();}}

    // -----------------------------------------------------------------------
    @Test
    public void testSetHours() throws Exception {__CLR4_5_2175z175zlvha7iqh.R.globalSliceStart(getClass().getName(),56264);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2j9rf1i17ew();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2175z175zlvha7iqh.R.rethrow($CLV_t2$);}finally{__CLR4_5_2175z175zlvha7iqh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsTest.testSetHours",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),56264,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2j9rf1i17ew() throws Exception{try{__CLR4_5_2175z175zlvha7iqh.R.inc(56264);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56265);Date result = DateUtils.setHours(BASE_DATE, 0);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56266);assertNotSame(BASE_DATE, result);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56267);assertDate(BASE_DATE, 2000, 6, 5, 4, 3, 2, 1);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56268);assertDate(result, 2000, 6, 5, 0, 3, 2, 1);

        __CLR4_5_2175z175zlvha7iqh.R.inc(56269);result = DateUtils.setHours(BASE_DATE, 23);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56270);assertNotSame(BASE_DATE, result);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56271);assertDate(BASE_DATE, 2000, 6, 5, 4, 3, 2, 1);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56272);assertDate(result, 2000, 6, 5, 23, 3, 2, 1);

        __CLR4_5_2175z175zlvha7iqh.R.inc(56273);try {
            __CLR4_5_2175z175zlvha7iqh.R.inc(56274);DateUtils.setHours(BASE_DATE, 24);
            __CLR4_5_2175z175zlvha7iqh.R.inc(56275);fail("DateUtils.setHours did not throw an expected IllegalArgumentException.");
        } catch (final IllegalArgumentException e) {

        }
    }finally{__CLR4_5_2175z175zlvha7iqh.R.flushNeeded();}}

    // -----------------------------------------------------------------------
    @Test
    public void testSetMinutes() throws Exception {__CLR4_5_2175z175zlvha7iqh.R.globalSliceStart(getClass().getName(),56276);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2pzyfg617f8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2175z175zlvha7iqh.R.rethrow($CLV_t2$);}finally{__CLR4_5_2175z175zlvha7iqh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsTest.testSetMinutes",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),56276,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2pzyfg617f8() throws Exception{try{__CLR4_5_2175z175zlvha7iqh.R.inc(56276);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56277);Date result = DateUtils.setMinutes(BASE_DATE, 0);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56278);assertNotSame(BASE_DATE, result);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56279);assertDate(BASE_DATE, 2000, 6, 5, 4, 3, 2, 1);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56280);assertDate(result, 2000, 6, 5, 4, 0, 2, 1);

        __CLR4_5_2175z175zlvha7iqh.R.inc(56281);result = DateUtils.setMinutes(BASE_DATE, 59);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56282);assertNotSame(BASE_DATE, result);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56283);assertDate(BASE_DATE, 2000, 6, 5, 4, 3, 2, 1);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56284);assertDate(result, 2000, 6, 5, 4, 59, 2, 1);

        __CLR4_5_2175z175zlvha7iqh.R.inc(56285);try {
            __CLR4_5_2175z175zlvha7iqh.R.inc(56286);DateUtils.setMinutes(BASE_DATE, 60);
            __CLR4_5_2175z175zlvha7iqh.R.inc(56287);fail("DateUtils.setMinutes did not throw an expected IllegalArgumentException.");
        } catch (final IllegalArgumentException e) {

        }
    }finally{__CLR4_5_2175z175zlvha7iqh.R.flushNeeded();}}

    // -----------------------------------------------------------------------
    @Test
    public void testSetSeconds() throws Exception {__CLR4_5_2175z175zlvha7iqh.R.globalSliceStart(getClass().getName(),56288);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2wmzi5m17fk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2175z175zlvha7iqh.R.rethrow($CLV_t2$);}finally{__CLR4_5_2175z175zlvha7iqh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsTest.testSetSeconds",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),56288,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2wmzi5m17fk() throws Exception{try{__CLR4_5_2175z175zlvha7iqh.R.inc(56288);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56289);Date result = DateUtils.setSeconds(BASE_DATE, 0);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56290);assertNotSame(BASE_DATE, result);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56291);assertDate(BASE_DATE, 2000, 6, 5, 4, 3, 2, 1);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56292);assertDate(result, 2000, 6, 5, 4, 3, 0, 1);

        __CLR4_5_2175z175zlvha7iqh.R.inc(56293);result = DateUtils.setSeconds(BASE_DATE, 59);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56294);assertNotSame(BASE_DATE, result);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56295);assertDate(BASE_DATE, 2000, 6, 5, 4, 3, 2, 1);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56296);assertDate(result, 2000, 6, 5, 4, 3, 59, 1);

        __CLR4_5_2175z175zlvha7iqh.R.inc(56297);try {
            __CLR4_5_2175z175zlvha7iqh.R.inc(56298);DateUtils.setSeconds(BASE_DATE, 60);
            __CLR4_5_2175z175zlvha7iqh.R.inc(56299);fail("DateUtils.setSeconds did not throw an expected IllegalArgumentException.");
        } catch (final IllegalArgumentException e) {

        }
    }finally{__CLR4_5_2175z175zlvha7iqh.R.flushNeeded();}}

    // -----------------------------------------------------------------------
    @Test
    public void testSetMilliseconds() throws Exception {__CLR4_5_2175z175zlvha7iqh.R.globalSliceStart(getClass().getName(),56300);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2xitrxl17fw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2175z175zlvha7iqh.R.rethrow($CLV_t2$);}finally{__CLR4_5_2175z175zlvha7iqh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsTest.testSetMilliseconds",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),56300,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2xitrxl17fw() throws Exception{try{__CLR4_5_2175z175zlvha7iqh.R.inc(56300);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56301);Date result = DateUtils.setMilliseconds(BASE_DATE, 0);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56302);assertNotSame(BASE_DATE, result);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56303);assertDate(BASE_DATE, 2000, 6, 5, 4, 3, 2, 1);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56304);assertDate(result, 2000, 6, 5, 4, 3, 2, 0);

        __CLR4_5_2175z175zlvha7iqh.R.inc(56305);result = DateUtils.setMilliseconds(BASE_DATE, 999);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56306);assertNotSame(BASE_DATE, result);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56307);assertDate(BASE_DATE, 2000, 6, 5, 4, 3, 2, 1);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56308);assertDate(result, 2000, 6, 5, 4, 3, 2, 999);

        __CLR4_5_2175z175zlvha7iqh.R.inc(56309);try {
            __CLR4_5_2175z175zlvha7iqh.R.inc(56310);DateUtils.setMilliseconds(BASE_DATE, 1000);
            __CLR4_5_2175z175zlvha7iqh.R.inc(56311);fail("DateUtils.setMilliseconds did not throw an expected IllegalArgumentException.");
        } catch (final IllegalArgumentException e) {

        }
    }finally{__CLR4_5_2175z175zlvha7iqh.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    private void assertDate(final Date date, final int year, final int month, final int day, final int hour, final int min, final int sec, final int mil) throws Exception {try{__CLR4_5_2175z175zlvha7iqh.R.inc(56312);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56313);final GregorianCalendar cal = new GregorianCalendar();
        __CLR4_5_2175z175zlvha7iqh.R.inc(56314);cal.setTime(date);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56315);assertEquals(year, cal.get(Calendar.YEAR));
        __CLR4_5_2175z175zlvha7iqh.R.inc(56316);assertEquals(month, cal.get(Calendar.MONTH));
        __CLR4_5_2175z175zlvha7iqh.R.inc(56317);assertEquals(day, cal.get(Calendar.DAY_OF_MONTH));
        __CLR4_5_2175z175zlvha7iqh.R.inc(56318);assertEquals(hour, cal.get(Calendar.HOUR_OF_DAY));
        __CLR4_5_2175z175zlvha7iqh.R.inc(56319);assertEquals(min, cal.get(Calendar.MINUTE));
        __CLR4_5_2175z175zlvha7iqh.R.inc(56320);assertEquals(sec, cal.get(Calendar.SECOND));
        __CLR4_5_2175z175zlvha7iqh.R.inc(56321);assertEquals(mil, cal.get(Calendar.MILLISECOND));
    }finally{__CLR4_5_2175z175zlvha7iqh.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testToCalendar() {__CLR4_5_2175z175zlvha7iqh.R.globalSliceStart(getClass().getName(),56322);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_293d0y617gi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2175z175zlvha7iqh.R.rethrow($CLV_t2$);}finally{__CLR4_5_2175z175zlvha7iqh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsTest.testToCalendar",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),56322,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_293d0y617gi(){try{__CLR4_5_2175z175zlvha7iqh.R.inc(56322);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56323);assertEquals("Failed to convert to a Calendar and back", date1, DateUtils.toCalendar(date1).getTime());
        __CLR4_5_2175z175zlvha7iqh.R.inc(56324);try {
            __CLR4_5_2175z175zlvha7iqh.R.inc(56325);DateUtils.toCalendar(null);
            __CLR4_5_2175z175zlvha7iqh.R.inc(56326);fail("Expected NullPointerException to be thrown");
        } catch(final NullPointerException npe) {
            // expected
        }
    }finally{__CLR4_5_2175z175zlvha7iqh.R.flushNeeded();}}
    
    //-----------------------------------------------------------------------
    @Test(expected=NullPointerException.class)
    public void testToCalendarWithDateNull() {__CLR4_5_2175z175zlvha7iqh.R.globalSliceStart(getClass().getName(),56327);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2j2mlxv17gn();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,84,111,67,97,108,101,110,100,97,114,87,105,116,104,68,97,116,101,78,117,108,108,58,32,91,78,117,108,108,80,111,105,110,116,101,114,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NullPointerException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2175z175zlvha7iqh.R.rethrow($CLV_t2$);}finally{__CLR4_5_2175z175zlvha7iqh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsTest.testToCalendarWithDateNull",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),56327,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2j2mlxv17gn(){try{__CLR4_5_2175z175zlvha7iqh.R.inc(56327);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56328);DateUtils.toCalendar(null, zone);
    }finally{__CLR4_5_2175z175zlvha7iqh.R.flushNeeded();}}
    
    //-----------------------------------------------------------------------
    @Test(expected=NullPointerException.class)
    public void testToCalendarWithTimeZoneNull() {__CLR4_5_2175z175zlvha7iqh.R.globalSliceStart(getClass().getName(),56329);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2f0y2yg17gp();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,84,111,67,97,108,101,110,100,97,114,87,105,116,104,84,105,109,101,90,111,110,101,78,117,108,108,58,32,91,78,117,108,108,80,111,105,110,116,101,114,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NullPointerException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2175z175zlvha7iqh.R.rethrow($CLV_t2$);}finally{__CLR4_5_2175z175zlvha7iqh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsTest.testToCalendarWithTimeZoneNull",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),56329,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2f0y2yg17gp(){try{__CLR4_5_2175z175zlvha7iqh.R.inc(56329);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56330);DateUtils.toCalendar(date1, null);
    }finally{__CLR4_5_2175z175zlvha7iqh.R.flushNeeded();}}
    
    //-----------------------------------------------------------------------
    @Test
    public void testToCalendarWithDateAndTimeZoneNotNull() {__CLR4_5_2175z175zlvha7iqh.R.globalSliceStart(getClass().getName(),56331);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2cn1wy817gr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2175z175zlvha7iqh.R.rethrow($CLV_t2$);}finally{__CLR4_5_2175z175zlvha7iqh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsTest.testToCalendarWithDateAndTimeZoneNotNull",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),56331,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2cn1wy817gr(){try{__CLR4_5_2175z175zlvha7iqh.R.inc(56331);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56332);final Calendar c = DateUtils.toCalendar(date2, defaultZone);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56333);assertEquals("Convert Date and TimeZone to a Calendar, but failed to get the Date back", date2, c.getTime());
        __CLR4_5_2175z175zlvha7iqh.R.inc(56334);assertEquals("Convert Date and TimeZone to a Calendar, but failed to get the TimeZone back", defaultZone, c.getTimeZone());
    }finally{__CLR4_5_2175z175zlvha7iqh.R.flushNeeded();}}
    
    //-----------------------------------------------------------------------
    @Test(expected=NullPointerException.class)
    public void testToCalendarWithDateAndTimeZoneNull() {__CLR4_5_2175z175zlvha7iqh.R.globalSliceStart(getClass().getName(),56335);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_232mv9d17gv();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,84,111,67,97,108,101,110,100,97,114,87,105,116,104,68,97,116,101,65,110,100,84,105,109,101,90,111,110,101,78,117,108,108,58,32,91,78,117,108,108,80,111,105,110,116,101,114,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NullPointerException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2175z175zlvha7iqh.R.rethrow($CLV_t2$);}finally{__CLR4_5_2175z175zlvha7iqh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsTest.testToCalendarWithDateAndTimeZoneNull",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),56335,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_232mv9d17gv(){try{__CLR4_5_2175z175zlvha7iqh.R.inc(56335);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56336);DateUtils.toCalendar(null, null);
    }finally{__CLR4_5_2175z175zlvha7iqh.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Tests various values with the round method
     *
     * @throws java.lang.Exception so we don't have to catch it
     */
    @Test
    public void testRound() throws Exception {__CLR4_5_2175z175zlvha7iqh.R.globalSliceStart(getClass().getName(),56337);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2uyajvh17gx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2175z175zlvha7iqh.R.rethrow($CLV_t2$);}finally{__CLR4_5_2175z175zlvha7iqh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsTest.testRound",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),56337,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2uyajvh17gx() throws Exception{try{__CLR4_5_2175z175zlvha7iqh.R.inc(56337);
        // tests for public static Date round(Date date, int field)
        __CLR4_5_2175z175zlvha7iqh.R.inc(56338);assertEquals("round year-1 failed",
                dateParser.parse("January 1, 2002"),
                DateUtils.round(date1, Calendar.YEAR));
        __CLR4_5_2175z175zlvha7iqh.R.inc(56339);assertEquals("round year-2 failed",
                dateParser.parse("January 1, 2002"),
                DateUtils.round(date2, Calendar.YEAR));
        __CLR4_5_2175z175zlvha7iqh.R.inc(56340);assertEquals("round month-1 failed",
                dateParser.parse("February 1, 2002"),
                DateUtils.round(date1, Calendar.MONTH));
        __CLR4_5_2175z175zlvha7iqh.R.inc(56341);assertEquals("round month-2 failed",
                dateParser.parse("December 1, 2001"),
                DateUtils.round(date2, Calendar.MONTH));
        __CLR4_5_2175z175zlvha7iqh.R.inc(56342);assertEquals("round semimonth-0 failed",
                dateParser.parse("February 1, 2002"),
                DateUtils.round(date0, DateUtils.SEMI_MONTH));
        __CLR4_5_2175z175zlvha7iqh.R.inc(56343);assertEquals("round semimonth-1 failed",
                dateParser.parse("February 16, 2002"),
                DateUtils.round(date1, DateUtils.SEMI_MONTH));
        __CLR4_5_2175z175zlvha7iqh.R.inc(56344);assertEquals("round semimonth-2 failed",
                dateParser.parse("November 16, 2001"),
                DateUtils.round(date2, DateUtils.SEMI_MONTH));
        
        
        __CLR4_5_2175z175zlvha7iqh.R.inc(56345);assertEquals("round date-1 failed",
                dateParser.parse("February 13, 2002"),
                DateUtils.round(date1, Calendar.DATE));
        __CLR4_5_2175z175zlvha7iqh.R.inc(56346);assertEquals("round date-2 failed",
                dateParser.parse("November 18, 2001"),
                DateUtils.round(date2, Calendar.DATE));
        __CLR4_5_2175z175zlvha7iqh.R.inc(56347);assertEquals("round hour-1 failed",
                dateTimeParser.parse("February 12, 2002 13:00:00.000"),
                DateUtils.round(date1, Calendar.HOUR));
        __CLR4_5_2175z175zlvha7iqh.R.inc(56348);assertEquals("round hour-2 failed",
                dateTimeParser.parse("November 18, 2001 1:00:00.000"),
                DateUtils.round(date2, Calendar.HOUR));
        __CLR4_5_2175z175zlvha7iqh.R.inc(56349);assertEquals("round minute-1 failed",
                dateTimeParser.parse("February 12, 2002 12:35:00.000"),
                DateUtils.round(date1, Calendar.MINUTE));
        __CLR4_5_2175z175zlvha7iqh.R.inc(56350);assertEquals("round minute-2 failed",
                dateTimeParser.parse("November 18, 2001 1:23:00.000"),
                DateUtils.round(date2, Calendar.MINUTE));
        __CLR4_5_2175z175zlvha7iqh.R.inc(56351);assertEquals("round second-1 failed",
                dateTimeParser.parse("February 12, 2002 12:34:57.000"),
                DateUtils.round(date1, Calendar.SECOND));
        __CLR4_5_2175z175zlvha7iqh.R.inc(56352);assertEquals("round second-2 failed",
                dateTimeParser.parse("November 18, 2001 1:23:11.000"),
                DateUtils.round(date2, Calendar.SECOND));
        __CLR4_5_2175z175zlvha7iqh.R.inc(56353);assertEquals("round ampm-1 failed",
                dateTimeParser.parse("February 3, 2002 00:00:00.000"),
                DateUtils.round(dateAmPm1, Calendar.AM_PM));
        __CLR4_5_2175z175zlvha7iqh.R.inc(56354);assertEquals("round ampm-2 failed",
                dateTimeParser.parse("February 3, 2002 12:00:00.000"),
                DateUtils.round(dateAmPm2, Calendar.AM_PM));
        __CLR4_5_2175z175zlvha7iqh.R.inc(56355);assertEquals("round ampm-3 failed",
                dateTimeParser.parse("February 3, 2002 12:00:00.000"),
                DateUtils.round(dateAmPm3, Calendar.AM_PM));
        __CLR4_5_2175z175zlvha7iqh.R.inc(56356);assertEquals("round ampm-4 failed",
                dateTimeParser.parse("February 4, 2002 00:00:00.000"),
                DateUtils.round(dateAmPm4, Calendar.AM_PM));

        // tests for public static Date round(Object date, int field)
        __CLR4_5_2175z175zlvha7iqh.R.inc(56357);assertEquals("round year-1 failed",
                dateParser.parse("January 1, 2002"),
                DateUtils.round((Object) date1, Calendar.YEAR));
        __CLR4_5_2175z175zlvha7iqh.R.inc(56358);assertEquals("round year-2 failed",
                dateParser.parse("January 1, 2002"),
                DateUtils.round((Object) date2, Calendar.YEAR));
        __CLR4_5_2175z175zlvha7iqh.R.inc(56359);assertEquals("round month-1 failed",
                dateParser.parse("February 1, 2002"),
                DateUtils.round((Object) date1, Calendar.MONTH));
        __CLR4_5_2175z175zlvha7iqh.R.inc(56360);assertEquals("round month-2 failed",
                dateParser.parse("December 1, 2001"),
                DateUtils.round((Object) date2, Calendar.MONTH));
        __CLR4_5_2175z175zlvha7iqh.R.inc(56361);assertEquals("round semimonth-1 failed",
                dateParser.parse("February 16, 2002"),
                DateUtils.round((Object) date1, DateUtils.SEMI_MONTH));
        __CLR4_5_2175z175zlvha7iqh.R.inc(56362);assertEquals("round semimonth-2 failed",
                dateParser.parse("November 16, 2001"),
                DateUtils.round((Object) date2, DateUtils.SEMI_MONTH));
        __CLR4_5_2175z175zlvha7iqh.R.inc(56363);assertEquals("round date-1 failed",
                dateParser.parse("February 13, 2002"),
                DateUtils.round((Object) date1, Calendar.DATE));
        __CLR4_5_2175z175zlvha7iqh.R.inc(56364);assertEquals("round date-2 failed",
                dateParser.parse("November 18, 2001"),
                DateUtils.round((Object) date2, Calendar.DATE));
        __CLR4_5_2175z175zlvha7iqh.R.inc(56365);assertEquals("round hour-1 failed",
                dateTimeParser.parse("February 12, 2002 13:00:00.000"),
                DateUtils.round((Object) date1, Calendar.HOUR));
        __CLR4_5_2175z175zlvha7iqh.R.inc(56366);assertEquals("round hour-2 failed",
                dateTimeParser.parse("November 18, 2001 1:00:00.000"),
                DateUtils.round((Object) date2, Calendar.HOUR));
        __CLR4_5_2175z175zlvha7iqh.R.inc(56367);assertEquals("round minute-1 failed",
                dateTimeParser.parse("February 12, 2002 12:35:00.000"),
                DateUtils.round((Object) date1, Calendar.MINUTE));
        __CLR4_5_2175z175zlvha7iqh.R.inc(56368);assertEquals("round minute-2 failed",
                dateTimeParser.parse("November 18, 2001 1:23:00.000"),
                DateUtils.round((Object) date2, Calendar.MINUTE));
        __CLR4_5_2175z175zlvha7iqh.R.inc(56369);assertEquals("round second-1 failed",
                dateTimeParser.parse("February 12, 2002 12:34:57.000"),
                DateUtils.round((Object) date1, Calendar.SECOND));
        __CLR4_5_2175z175zlvha7iqh.R.inc(56370);assertEquals("round second-2 failed",
                dateTimeParser.parse("November 18, 2001 1:23:11.000"),
                DateUtils.round((Object) date2, Calendar.SECOND));
        __CLR4_5_2175z175zlvha7iqh.R.inc(56371);assertEquals("round calendar second-1 failed",
                dateTimeParser.parse("February 12, 2002 12:34:57.000"),
                DateUtils.round((Object) cal1, Calendar.SECOND));
        __CLR4_5_2175z175zlvha7iqh.R.inc(56372);assertEquals("round calendar second-2 failed",
                dateTimeParser.parse("November 18, 2001 1:23:11.000"),
                DateUtils.round((Object) cal2, Calendar.SECOND));
        __CLR4_5_2175z175zlvha7iqh.R.inc(56373);assertEquals("round ampm-1 failed",
                dateTimeParser.parse("February 3, 2002 00:00:00.000"),
                DateUtils.round((Object) dateAmPm1, Calendar.AM_PM));
        __CLR4_5_2175z175zlvha7iqh.R.inc(56374);assertEquals("round ampm-2 failed",
                dateTimeParser.parse("February 3, 2002 12:00:00.000"),
                DateUtils.round((Object) dateAmPm2, Calendar.AM_PM));
        __CLR4_5_2175z175zlvha7iqh.R.inc(56375);assertEquals("round ampm-3 failed",
                dateTimeParser.parse("February 3, 2002 12:00:00.000"),
                DateUtils.round((Object) dateAmPm3, Calendar.AM_PM));
        __CLR4_5_2175z175zlvha7iqh.R.inc(56376);assertEquals("round ampm-4 failed",
                dateTimeParser.parse("February 4, 2002 00:00:00.000"),
                DateUtils.round((Object) dateAmPm4, Calendar.AM_PM));

        __CLR4_5_2175z175zlvha7iqh.R.inc(56377);try {
            __CLR4_5_2175z175zlvha7iqh.R.inc(56378);DateUtils.round((Date) null, Calendar.SECOND);
            __CLR4_5_2175z175zlvha7iqh.R.inc(56379);fail();
        } catch (final IllegalArgumentException ex) {}
        __CLR4_5_2175z175zlvha7iqh.R.inc(56380);try {
            __CLR4_5_2175z175zlvha7iqh.R.inc(56381);DateUtils.round((Calendar) null, Calendar.SECOND);
            __CLR4_5_2175z175zlvha7iqh.R.inc(56382);fail();
        } catch (final IllegalArgumentException ex) {}
        __CLR4_5_2175z175zlvha7iqh.R.inc(56383);try {
            __CLR4_5_2175z175zlvha7iqh.R.inc(56384);DateUtils.round((Object) null, Calendar.SECOND);
            __CLR4_5_2175z175zlvha7iqh.R.inc(56385);fail();
        } catch (final IllegalArgumentException ex) {}
        __CLR4_5_2175z175zlvha7iqh.R.inc(56386);try {
            __CLR4_5_2175z175zlvha7iqh.R.inc(56387);DateUtils.round("", Calendar.SECOND);
            __CLR4_5_2175z175zlvha7iqh.R.inc(56388);fail();
        } catch (final ClassCastException ex) {}
        __CLR4_5_2175z175zlvha7iqh.R.inc(56389);try {
            __CLR4_5_2175z175zlvha7iqh.R.inc(56390);DateUtils.round(date1, -9999);
            __CLR4_5_2175z175zlvha7iqh.R.inc(56391);fail();
        } catch(final IllegalArgumentException ex) {}

        __CLR4_5_2175z175zlvha7iqh.R.inc(56392);assertEquals("round ampm-1 failed",
                dateTimeParser.parse("February 3, 2002 00:00:00.000"),
                DateUtils.round((Object) calAmPm1, Calendar.AM_PM));
        __CLR4_5_2175z175zlvha7iqh.R.inc(56393);assertEquals("round ampm-2 failed",
                dateTimeParser.parse("February 3, 2002 12:00:00.000"),
                DateUtils.round((Object) calAmPm2, Calendar.AM_PM));
        __CLR4_5_2175z175zlvha7iqh.R.inc(56394);assertEquals("round ampm-3 failed",
                dateTimeParser.parse("February 3, 2002 12:00:00.000"),
                DateUtils.round((Object) calAmPm3, Calendar.AM_PM));
        __CLR4_5_2175z175zlvha7iqh.R.inc(56395);assertEquals("round ampm-4 failed",
                dateTimeParser.parse("February 4, 2002 00:00:00.000"),
                DateUtils.round((Object) calAmPm4, Calendar.AM_PM));
        
        // Fix for http://issues.apache.org/bugzilla/show_bug.cgi?id=25560 / LANG-13
        // Test rounding across the beginning of daylight saving time
        __CLR4_5_2175z175zlvha7iqh.R.inc(56396);TimeZone.setDefault(zone);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56397);dateTimeParser.setTimeZone(zone);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56398);assertEquals("round MET date across DST change-over",
                dateTimeParser.parse("March 30, 2003 00:00:00.000"),
                DateUtils.round(date4, Calendar.DATE));
        __CLR4_5_2175z175zlvha7iqh.R.inc(56399);assertEquals("round MET date across DST change-over",
                dateTimeParser.parse("March 30, 2003 00:00:00.000"),
                DateUtils.round((Object) cal4, Calendar.DATE));
        __CLR4_5_2175z175zlvha7iqh.R.inc(56400);assertEquals("round MET date across DST change-over",
                dateTimeParser.parse("March 30, 2003 00:00:00.000"),
                DateUtils.round(date5, Calendar.DATE));
        __CLR4_5_2175z175zlvha7iqh.R.inc(56401);assertEquals("round MET date across DST change-over",
                dateTimeParser.parse("March 30, 2003 00:00:00.000"),
                DateUtils.round((Object) cal5, Calendar.DATE));
        __CLR4_5_2175z175zlvha7iqh.R.inc(56402);assertEquals("round MET date across DST change-over",
                dateTimeParser.parse("March 30, 2003 00:00:00.000"),
                DateUtils.round(date6, Calendar.DATE));
        __CLR4_5_2175z175zlvha7iqh.R.inc(56403);assertEquals("round MET date across DST change-over",
                dateTimeParser.parse("March 30, 2003 00:00:00.000"),
                DateUtils.round((Object) cal6, Calendar.DATE));
        __CLR4_5_2175z175zlvha7iqh.R.inc(56404);assertEquals("round MET date across DST change-over",
                dateTimeParser.parse("March 30, 2003 00:00:00.000"),
                DateUtils.round(date7, Calendar.DATE));
        __CLR4_5_2175z175zlvha7iqh.R.inc(56405);assertEquals("round MET date across DST change-over",
                dateTimeParser.parse("March 30, 2003 00:00:00.000"),
                DateUtils.round((Object) cal7, Calendar.DATE));
        
        __CLR4_5_2175z175zlvha7iqh.R.inc(56406);assertEquals("round MET date across DST change-over",
                dateTimeParser.parse("March 30, 2003 01:00:00.000"),
                DateUtils.round(date4, Calendar.HOUR_OF_DAY));
        __CLR4_5_2175z175zlvha7iqh.R.inc(56407);assertEquals("round MET date across DST change-over",
                dateTimeParser.parse("March 30, 2003 01:00:00.000"),
                DateUtils.round((Object) cal4, Calendar.HOUR_OF_DAY));
        __CLR4_5_2175z175zlvha7iqh.R.inc(56408);assertEquals("round MET date across DST change-over",
                dateTimeParser.parse("March 30, 2003 03:00:00.000"),
                DateUtils.round(date5, Calendar.HOUR_OF_DAY));
        __CLR4_5_2175z175zlvha7iqh.R.inc(56409);assertEquals("round MET date across DST change-over",
                dateTimeParser.parse("March 30, 2003 03:00:00.000"),
                DateUtils.round((Object) cal5, Calendar.HOUR_OF_DAY));
        __CLR4_5_2175z175zlvha7iqh.R.inc(56410);assertEquals("round MET date across DST change-over",
                dateTimeParser.parse("March 30, 2003 03:00:00.000"),
                DateUtils.round(date6, Calendar.HOUR_OF_DAY));
        __CLR4_5_2175z175zlvha7iqh.R.inc(56411);assertEquals("round MET date across DST change-over",
                dateTimeParser.parse("March 30, 2003 03:00:00.000"),
                DateUtils.round((Object) cal6, Calendar.HOUR_OF_DAY));
        __CLR4_5_2175z175zlvha7iqh.R.inc(56412);assertEquals("round MET date across DST change-over",
                dateTimeParser.parse("March 30, 2003 04:00:00.000"),
                DateUtils.round(date7, Calendar.HOUR_OF_DAY));
        __CLR4_5_2175z175zlvha7iqh.R.inc(56413);assertEquals("round MET date across DST change-over",
                dateTimeParser.parse("March 30, 2003 04:00:00.000"),
                DateUtils.round((Object) cal7, Calendar.HOUR_OF_DAY));
        __CLR4_5_2175z175zlvha7iqh.R.inc(56414);TimeZone.setDefault(defaultZone);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56415);dateTimeParser.setTimeZone(defaultZone);
    }finally{__CLR4_5_2175z175zlvha7iqh.R.flushNeeded();}}

    /**
     * Tests the Changes Made by LANG-346 to the DateUtils.modify() private method invoked
     * by DateUtils.round().
     *
     * @throws java.lang.Exception so we don't have to catch it
     */
    @Test
    public void testRoundLang346() throws Exception {__CLR4_5_2175z175zlvha7iqh.R.globalSliceStart(getClass().getName(),56416);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2dirzwu17j4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2175z175zlvha7iqh.R.rethrow($CLV_t2$);}finally{__CLR4_5_2175z175zlvha7iqh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsTest.testRoundLang346",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),56416,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2dirzwu17j4() throws Exception{try{__CLR4_5_2175z175zlvha7iqh.R.inc(56416);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56417);TimeZone.setDefault(defaultZone);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56418);dateTimeParser.setTimeZone(defaultZone);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56419);final Calendar testCalendar = Calendar.getInstance();
        __CLR4_5_2175z175zlvha7iqh.R.inc(56420);testCalendar.set(2007, Calendar.JULY, 2, 8, 8, 50);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56421);Date date = testCalendar.getTime();
        __CLR4_5_2175z175zlvha7iqh.R.inc(56422);assertEquals("Minute Round Up Failed",
                     dateTimeParser.parse("July 2, 2007 08:09:00.000"),
                     DateUtils.round(date, Calendar.MINUTE));

        __CLR4_5_2175z175zlvha7iqh.R.inc(56423);testCalendar.set(2007, Calendar.JULY, 2, 8, 8, 20);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56424);date = testCalendar.getTime();
        __CLR4_5_2175z175zlvha7iqh.R.inc(56425);assertEquals("Minute No Round Failed",
                     dateTimeParser.parse("July 2, 2007 08:08:00.000"),
                     DateUtils.round(date, Calendar.MINUTE));

        __CLR4_5_2175z175zlvha7iqh.R.inc(56426);testCalendar.set(2007, Calendar.JULY, 2, 8, 8, 50);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56427);testCalendar.set(Calendar.MILLISECOND, 600);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56428);date = testCalendar.getTime();

        __CLR4_5_2175z175zlvha7iqh.R.inc(56429);assertEquals("Second Round Up with 600 Milli Seconds Failed",
                     dateTimeParser.parse("July 2, 2007 08:08:51.000"),
                     DateUtils.round(date, Calendar.SECOND));

        __CLR4_5_2175z175zlvha7iqh.R.inc(56430);testCalendar.set(2007, Calendar.JULY, 2, 8, 8, 50);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56431);testCalendar.set(Calendar.MILLISECOND, 200);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56432);date = testCalendar.getTime();
        __CLR4_5_2175z175zlvha7iqh.R.inc(56433);assertEquals("Second Round Down with 200 Milli Seconds Failed",
                     dateTimeParser.parse("July 2, 2007 08:08:50.000"),
                     DateUtils.round(date, Calendar.SECOND));

        __CLR4_5_2175z175zlvha7iqh.R.inc(56434);testCalendar.set(2007, Calendar.JULY, 2, 8, 8, 20);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56435);testCalendar.set(Calendar.MILLISECOND, 600);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56436);date = testCalendar.getTime();
        __CLR4_5_2175z175zlvha7iqh.R.inc(56437);assertEquals("Second Round Up with 200 Milli Seconds Failed",
                     dateTimeParser.parse("July 2, 2007 08:08:21.000"),
                     DateUtils.round(date, Calendar.SECOND));

        __CLR4_5_2175z175zlvha7iqh.R.inc(56438);testCalendar.set(2007, Calendar.JULY, 2, 8, 8, 20);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56439);testCalendar.set(Calendar.MILLISECOND, 200);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56440);date = testCalendar.getTime();
        __CLR4_5_2175z175zlvha7iqh.R.inc(56441);assertEquals("Second Round Down with 200 Milli Seconds Failed",
                     dateTimeParser.parse("July 2, 2007 08:08:20.000"),
                     DateUtils.round(date, Calendar.SECOND));

        __CLR4_5_2175z175zlvha7iqh.R.inc(56442);testCalendar.set(2007, Calendar.JULY, 2, 8, 8, 50);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56443);date = testCalendar.getTime();
        __CLR4_5_2175z175zlvha7iqh.R.inc(56444);assertEquals("Hour Round Down Failed",
                     dateTimeParser.parse("July 2, 2007 08:00:00.000"),
                     DateUtils.round(date, Calendar.HOUR));

        __CLR4_5_2175z175zlvha7iqh.R.inc(56445);testCalendar.set(2007, Calendar.JULY, 2, 8, 31, 50);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56446);date = testCalendar.getTime();
        __CLR4_5_2175z175zlvha7iqh.R.inc(56447);assertEquals("Hour Round Up Failed",
                     dateTimeParser.parse("July 2, 2007 09:00:00.000"),
                     DateUtils.round(date, Calendar.HOUR));
    }finally{__CLR4_5_2175z175zlvha7iqh.R.flushNeeded();}}

    /**
     * Tests various values with the trunc method
     *
     * @throws java.lang.Exception so we don't have to catch it
     */
    @Test
    public void testTruncate() throws Exception {__CLR4_5_2175z175zlvha7iqh.R.globalSliceStart(getClass().getName(),56448);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2scappd17k0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2175z175zlvha7iqh.R.rethrow($CLV_t2$);}finally{__CLR4_5_2175z175zlvha7iqh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsTest.testTruncate",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),56448,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2scappd17k0() throws Exception{try{__CLR4_5_2175z175zlvha7iqh.R.inc(56448);
        // tests public static Date truncate(Date date, int field)
        __CLR4_5_2175z175zlvha7iqh.R.inc(56449);assertEquals("truncate year-1 failed",
                dateParser.parse("January 1, 2002"),
                DateUtils.truncate(date1, Calendar.YEAR));
        __CLR4_5_2175z175zlvha7iqh.R.inc(56450);assertEquals("truncate year-2 failed",
                dateParser.parse("January 1, 2001"),
                DateUtils.truncate(date2, Calendar.YEAR));
        __CLR4_5_2175z175zlvha7iqh.R.inc(56451);assertEquals("truncate month-1 failed",
                dateParser.parse("February 1, 2002"),
                DateUtils.truncate(date1, Calendar.MONTH));
        __CLR4_5_2175z175zlvha7iqh.R.inc(56452);assertEquals("truncate month-2 failed",
                dateParser.parse("November 1, 2001"),
                DateUtils.truncate(date2, Calendar.MONTH));
        __CLR4_5_2175z175zlvha7iqh.R.inc(56453);assertEquals("truncate semimonth-1 failed",
                dateParser.parse("February 1, 2002"),
                DateUtils.truncate(date1, DateUtils.SEMI_MONTH));
        __CLR4_5_2175z175zlvha7iqh.R.inc(56454);assertEquals("truncate semimonth-2 failed",
                dateParser.parse("November 16, 2001"),
                DateUtils.truncate(date2, DateUtils.SEMI_MONTH));
        __CLR4_5_2175z175zlvha7iqh.R.inc(56455);assertEquals("truncate date-1 failed",
                dateParser.parse("February 12, 2002"),
                DateUtils.truncate(date1, Calendar.DATE));
        __CLR4_5_2175z175zlvha7iqh.R.inc(56456);assertEquals("truncate date-2 failed",
                dateParser.parse("November 18, 2001"),
                DateUtils.truncate(date2, Calendar.DATE));
        __CLR4_5_2175z175zlvha7iqh.R.inc(56457);assertEquals("truncate hour-1 failed",
                dateTimeParser.parse("February 12, 2002 12:00:00.000"),
                DateUtils.truncate(date1, Calendar.HOUR));
        __CLR4_5_2175z175zlvha7iqh.R.inc(56458);assertEquals("truncate hour-2 failed",
                dateTimeParser.parse("November 18, 2001 1:00:00.000"),
                DateUtils.truncate(date2, Calendar.HOUR));
        __CLR4_5_2175z175zlvha7iqh.R.inc(56459);assertEquals("truncate minute-1 failed",
                dateTimeParser.parse("February 12, 2002 12:34:00.000"),
                DateUtils.truncate(date1, Calendar.MINUTE));
        __CLR4_5_2175z175zlvha7iqh.R.inc(56460);assertEquals("truncate minute-2 failed",
                dateTimeParser.parse("November 18, 2001 1:23:00.000"),
                DateUtils.truncate(date2, Calendar.MINUTE));
        __CLR4_5_2175z175zlvha7iqh.R.inc(56461);assertEquals("truncate second-1 failed",
                dateTimeParser.parse("February 12, 2002 12:34:56.000"),
                DateUtils.truncate(date1, Calendar.SECOND));
        __CLR4_5_2175z175zlvha7iqh.R.inc(56462);assertEquals("truncate second-2 failed",
                dateTimeParser.parse("November 18, 2001 1:23:11.000"),
                DateUtils.truncate(date2, Calendar.SECOND));
        __CLR4_5_2175z175zlvha7iqh.R.inc(56463);assertEquals("truncate ampm-1 failed",
                dateTimeParser.parse("February 3, 2002 00:00:00.000"),
                DateUtils.truncate(dateAmPm1, Calendar.AM_PM));
        __CLR4_5_2175z175zlvha7iqh.R.inc(56464);assertEquals("truncate ampm-2 failed",
                dateTimeParser.parse("February 3, 2002 00:00:00.000"),
                DateUtils.truncate(dateAmPm2, Calendar.AM_PM));
        __CLR4_5_2175z175zlvha7iqh.R.inc(56465);assertEquals("truncate ampm-3 failed",
                dateTimeParser.parse("February 3, 2002 12:00:00.000"),
                DateUtils.truncate(dateAmPm3, Calendar.AM_PM));
        __CLR4_5_2175z175zlvha7iqh.R.inc(56466);assertEquals("truncate ampm-4 failed",
                dateTimeParser.parse("February 3, 2002 12:00:00.000"),
                DateUtils.truncate(dateAmPm4, Calendar.AM_PM));

        // tests public static Date truncate(Object date, int field)
        __CLR4_5_2175z175zlvha7iqh.R.inc(56467);assertEquals("truncate year-1 failed",
                dateParser.parse("January 1, 2002"),
                DateUtils.truncate((Object) date1, Calendar.YEAR));
        __CLR4_5_2175z175zlvha7iqh.R.inc(56468);assertEquals("truncate year-2 failed",
                dateParser.parse("January 1, 2001"),
                DateUtils.truncate((Object) date2, Calendar.YEAR));
        __CLR4_5_2175z175zlvha7iqh.R.inc(56469);assertEquals("truncate month-1 failed",
                dateParser.parse("February 1, 2002"),
                DateUtils.truncate((Object) date1, Calendar.MONTH));
        __CLR4_5_2175z175zlvha7iqh.R.inc(56470);assertEquals("truncate month-2 failed",
                dateParser.parse("November 1, 2001"),
                DateUtils.truncate((Object) date2, Calendar.MONTH));
        __CLR4_5_2175z175zlvha7iqh.R.inc(56471);assertEquals("truncate semimonth-1 failed",
                dateParser.parse("February 1, 2002"),
                DateUtils.truncate((Object) date1, DateUtils.SEMI_MONTH));
        __CLR4_5_2175z175zlvha7iqh.R.inc(56472);assertEquals("truncate semimonth-2 failed",
                dateParser.parse("November 16, 2001"),
                DateUtils.truncate((Object) date2, DateUtils.SEMI_MONTH));
        __CLR4_5_2175z175zlvha7iqh.R.inc(56473);assertEquals("truncate date-1 failed",
                dateParser.parse("February 12, 2002"),
                DateUtils.truncate((Object) date1, Calendar.DATE));
        __CLR4_5_2175z175zlvha7iqh.R.inc(56474);assertEquals("truncate date-2 failed",
                dateParser.parse("November 18, 2001"),
                DateUtils.truncate((Object) date2, Calendar.DATE));
        __CLR4_5_2175z175zlvha7iqh.R.inc(56475);assertEquals("truncate hour-1 failed",
                dateTimeParser.parse("February 12, 2002 12:00:00.000"),
                DateUtils.truncate((Object) date1, Calendar.HOUR));
        __CLR4_5_2175z175zlvha7iqh.R.inc(56476);assertEquals("truncate hour-2 failed",
                dateTimeParser.parse("November 18, 2001 1:00:00.000"),
                DateUtils.truncate((Object) date2, Calendar.HOUR));
        __CLR4_5_2175z175zlvha7iqh.R.inc(56477);assertEquals("truncate minute-1 failed",
                dateTimeParser.parse("February 12, 2002 12:34:00.000"),
                DateUtils.truncate((Object) date1, Calendar.MINUTE));
        __CLR4_5_2175z175zlvha7iqh.R.inc(56478);assertEquals("truncate minute-2 failed",
                dateTimeParser.parse("November 18, 2001 1:23:00.000"),
                DateUtils.truncate((Object) date2, Calendar.MINUTE));
        __CLR4_5_2175z175zlvha7iqh.R.inc(56479);assertEquals("truncate second-1 failed",
                dateTimeParser.parse("February 12, 2002 12:34:56.000"),
                DateUtils.truncate((Object) date1, Calendar.SECOND));
        __CLR4_5_2175z175zlvha7iqh.R.inc(56480);assertEquals("truncate second-2 failed",
                dateTimeParser.parse("November 18, 2001 1:23:11.000"),
                DateUtils.truncate((Object) date2, Calendar.SECOND));
        __CLR4_5_2175z175zlvha7iqh.R.inc(56481);assertEquals("truncate ampm-1 failed",
                dateTimeParser.parse("February 3, 2002 00:00:00.000"),
                DateUtils.truncate((Object) dateAmPm1, Calendar.AM_PM));
        __CLR4_5_2175z175zlvha7iqh.R.inc(56482);assertEquals("truncate ampm-2 failed",
                dateTimeParser.parse("February 3, 2002 00:00:00.000"),
                DateUtils.truncate((Object) dateAmPm2, Calendar.AM_PM));
        __CLR4_5_2175z175zlvha7iqh.R.inc(56483);assertEquals("truncate ampm-3 failed",
                dateTimeParser.parse("February 3, 2002 12:00:00.000"),
                DateUtils.truncate((Object) dateAmPm3, Calendar.AM_PM));
        __CLR4_5_2175z175zlvha7iqh.R.inc(56484);assertEquals("truncate ampm-4 failed",
                dateTimeParser.parse("February 3, 2002 12:00:00.000"),
                DateUtils.truncate((Object) dateAmPm4, Calendar.AM_PM));
        
        __CLR4_5_2175z175zlvha7iqh.R.inc(56485);assertEquals("truncate calendar second-1 failed",
                dateTimeParser.parse("February 12, 2002 12:34:56.000"),
                DateUtils.truncate((Object) cal1, Calendar.SECOND));
        __CLR4_5_2175z175zlvha7iqh.R.inc(56486);assertEquals("truncate calendar second-2 failed",
                dateTimeParser.parse("November 18, 2001 1:23:11.000"),
                DateUtils.truncate((Object) cal2, Calendar.SECOND));
        
        __CLR4_5_2175z175zlvha7iqh.R.inc(56487);assertEquals("truncate ampm-1 failed",
                dateTimeParser.parse("February 3, 2002 00:00:00.000"),
                DateUtils.truncate((Object) calAmPm1, Calendar.AM_PM));
        __CLR4_5_2175z175zlvha7iqh.R.inc(56488);assertEquals("truncate ampm-2 failed",
                dateTimeParser.parse("February 3, 2002 00:00:00.000"),
                DateUtils.truncate((Object) calAmPm2, Calendar.AM_PM));
        __CLR4_5_2175z175zlvha7iqh.R.inc(56489);assertEquals("truncate ampm-3 failed",
                dateTimeParser.parse("February 3, 2002 12:00:00.000"),
                DateUtils.truncate((Object) calAmPm3, Calendar.AM_PM));
        __CLR4_5_2175z175zlvha7iqh.R.inc(56490);assertEquals("truncate ampm-4 failed",
                dateTimeParser.parse("February 3, 2002 12:00:00.000"),
                DateUtils.truncate((Object) calAmPm4, Calendar.AM_PM));
        
        __CLR4_5_2175z175zlvha7iqh.R.inc(56491);try {
            __CLR4_5_2175z175zlvha7iqh.R.inc(56492);DateUtils.truncate((Date) null, Calendar.SECOND);
            __CLR4_5_2175z175zlvha7iqh.R.inc(56493);fail();
        } catch (final IllegalArgumentException ex) {}
        __CLR4_5_2175z175zlvha7iqh.R.inc(56494);try {
            __CLR4_5_2175z175zlvha7iqh.R.inc(56495);DateUtils.truncate((Calendar) null, Calendar.SECOND);
            __CLR4_5_2175z175zlvha7iqh.R.inc(56496);fail();
        } catch (final IllegalArgumentException ex) {}
        __CLR4_5_2175z175zlvha7iqh.R.inc(56497);try {
            __CLR4_5_2175z175zlvha7iqh.R.inc(56498);DateUtils.truncate((Object) null, Calendar.SECOND);
            __CLR4_5_2175z175zlvha7iqh.R.inc(56499);fail();
        } catch (final IllegalArgumentException ex) {}
        __CLR4_5_2175z175zlvha7iqh.R.inc(56500);try {
            __CLR4_5_2175z175zlvha7iqh.R.inc(56501);DateUtils.truncate("", Calendar.SECOND);
            __CLR4_5_2175z175zlvha7iqh.R.inc(56502);fail();
        } catch (final ClassCastException ex) {}

        // Fix for http://issues.apache.org/bugzilla/show_bug.cgi?id=25560
        // Test truncate across beginning of daylight saving time
        __CLR4_5_2175z175zlvha7iqh.R.inc(56503);TimeZone.setDefault(zone);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56504);dateTimeParser.setTimeZone(zone);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56505);assertEquals("truncate MET date across DST change-over",
                dateTimeParser.parse("March 30, 2003 00:00:00.000"),
                DateUtils.truncate(date3, Calendar.DATE));
        __CLR4_5_2175z175zlvha7iqh.R.inc(56506);assertEquals("truncate MET date across DST change-over",
                dateTimeParser.parse("March 30, 2003 00:00:00.000"),
                DateUtils.truncate((Object) cal3, Calendar.DATE));
        // Test truncate across end of daylight saving time
        __CLR4_5_2175z175zlvha7iqh.R.inc(56507);assertEquals("truncate MET date across DST change-over",
                dateTimeParser.parse("October 26, 2003 00:00:00.000"),
                DateUtils.truncate(date8, Calendar.DATE));
        __CLR4_5_2175z175zlvha7iqh.R.inc(56508);assertEquals("truncate MET date across DST change-over",
                dateTimeParser.parse("October 26, 2003 00:00:00.000"),
                DateUtils.truncate((Object) cal8, Calendar.DATE));
        __CLR4_5_2175z175zlvha7iqh.R.inc(56509);TimeZone.setDefault(defaultZone);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56510);dateTimeParser.setTimeZone(defaultZone);
        
        // Bug 31395, large dates
        __CLR4_5_2175z175zlvha7iqh.R.inc(56511);final Date endOfTime = new Date(Long.MAX_VALUE); // fyi: Sun Aug 17 07:12:55 CET 292278994 -- 807 millis
        __CLR4_5_2175z175zlvha7iqh.R.inc(56512);final GregorianCalendar endCal = new GregorianCalendar();
        __CLR4_5_2175z175zlvha7iqh.R.inc(56513);endCal.setTime(endOfTime);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56514);try {
            __CLR4_5_2175z175zlvha7iqh.R.inc(56515);DateUtils.truncate(endCal, Calendar.DATE);
            __CLR4_5_2175z175zlvha7iqh.R.inc(56516);fail();
        } catch (final ArithmeticException ex) {}
        __CLR4_5_2175z175zlvha7iqh.R.inc(56517);endCal.set(Calendar.YEAR, 280000001);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56518);try {
            __CLR4_5_2175z175zlvha7iqh.R.inc(56519);DateUtils.truncate(endCal, Calendar.DATE);
            __CLR4_5_2175z175zlvha7iqh.R.inc(56520);fail();
        } catch (final ArithmeticException ex) {}
        __CLR4_5_2175z175zlvha7iqh.R.inc(56521);endCal.set(Calendar.YEAR, 280000000);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56522);final Calendar cal = DateUtils.truncate(endCal, Calendar.DATE);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56523);assertEquals(0, cal.get(Calendar.HOUR));
    }finally{__CLR4_5_2175z175zlvha7iqh.R.flushNeeded();}}

    /**
     * Tests for LANG-59
     *
     * @throws java.lang.Exception so we don't have to catch it
     *
     * see http://issues.apache.org/jira/browse/LANG-59
     */
    @Test
    public void testTruncateLang59() throws Exception {__CLR4_5_2175z175zlvha7iqh.R.globalSliceStart(getClass().getName(),56524);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gx12un17m4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2175z175zlvha7iqh.R.rethrow($CLV_t2$);}finally{__CLR4_5_2175z175zlvha7iqh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsTest.testTruncateLang59",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),56524,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gx12un17m4() throws Exception{try{__CLR4_5_2175z175zlvha7iqh.R.inc(56524);
        // Set TimeZone to Mountain Time
        __CLR4_5_2175z175zlvha7iqh.R.inc(56525);final TimeZone MST_MDT = TimeZone.getTimeZone("MST7MDT");
        __CLR4_5_2175z175zlvha7iqh.R.inc(56526);TimeZone.setDefault(MST_MDT);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56527);final DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS z");
        __CLR4_5_2175z175zlvha7iqh.R.inc(56528);format.setTimeZone(MST_MDT);

        __CLR4_5_2175z175zlvha7iqh.R.inc(56529);final Date oct31_01MDT = new Date(1099206000000L); 

        __CLR4_5_2175z175zlvha7iqh.R.inc(56530);final Date oct31MDT             = new Date(oct31_01MDT.getTime()       - 3600000L); // - 1 hour
        __CLR4_5_2175z175zlvha7iqh.R.inc(56531);final Date oct31_01_02MDT       = new Date(oct31_01MDT.getTime()       + 120000L);  // + 2 minutes
        __CLR4_5_2175z175zlvha7iqh.R.inc(56532);final Date oct31_01_02_03MDT    = new Date(oct31_01_02MDT.getTime()    + 3000L);    // + 3 seconds
        __CLR4_5_2175z175zlvha7iqh.R.inc(56533);final Date oct31_01_02_03_04MDT = new Date(oct31_01_02_03MDT.getTime() + 4L);       // + 4 milliseconds

        __CLR4_5_2175z175zlvha7iqh.R.inc(56534);assertEquals("Check 00:00:00.000", "2004-10-31 00:00:00.000 MDT", format.format(oct31MDT));
        __CLR4_5_2175z175zlvha7iqh.R.inc(56535);assertEquals("Check 01:00:00.000", "2004-10-31 01:00:00.000 MDT", format.format(oct31_01MDT));
        __CLR4_5_2175z175zlvha7iqh.R.inc(56536);assertEquals("Check 01:02:00.000", "2004-10-31 01:02:00.000 MDT", format.format(oct31_01_02MDT));
        __CLR4_5_2175z175zlvha7iqh.R.inc(56537);assertEquals("Check 01:02:03.000", "2004-10-31 01:02:03.000 MDT", format.format(oct31_01_02_03MDT));
        __CLR4_5_2175z175zlvha7iqh.R.inc(56538);assertEquals("Check 01:02:03.004", "2004-10-31 01:02:03.004 MDT", format.format(oct31_01_02_03_04MDT));

        // ------- Demonstrate Problem -------
        __CLR4_5_2175z175zlvha7iqh.R.inc(56539);final Calendar gval = Calendar.getInstance();
        __CLR4_5_2175z175zlvha7iqh.R.inc(56540);gval.setTime(new Date(oct31_01MDT.getTime()));
        __CLR4_5_2175z175zlvha7iqh.R.inc(56541);gval.set(Calendar.MINUTE, gval.get(Calendar.MINUTE)); // set minutes to the same value
        __CLR4_5_2175z175zlvha7iqh.R.inc(56542);assertEquals("Demonstrate Problem", gval.getTime().getTime(), oct31_01MDT.getTime() + 3600000L);

        // ---------- Test Truncate ----------
        __CLR4_5_2175z175zlvha7iqh.R.inc(56543);assertEquals("Truncate Calendar.MILLISECOND",
                oct31_01_02_03_04MDT, DateUtils.truncate(oct31_01_02_03_04MDT, Calendar.MILLISECOND));

        __CLR4_5_2175z175zlvha7iqh.R.inc(56544);assertEquals("Truncate Calendar.SECOND",
                   oct31_01_02_03MDT, DateUtils.truncate(oct31_01_02_03_04MDT, Calendar.SECOND));

        __CLR4_5_2175z175zlvha7iqh.R.inc(56545);assertEquals("Truncate Calendar.MINUTE",
                      oct31_01_02MDT, DateUtils.truncate(oct31_01_02_03_04MDT, Calendar.MINUTE));

        __CLR4_5_2175z175zlvha7iqh.R.inc(56546);assertEquals("Truncate Calendar.HOUR_OF_DAY",
                         oct31_01MDT, DateUtils.truncate(oct31_01_02_03_04MDT, Calendar.HOUR_OF_DAY));

        __CLR4_5_2175z175zlvha7iqh.R.inc(56547);assertEquals("Truncate Calendar.HOUR",
                         oct31_01MDT, DateUtils.truncate(oct31_01_02_03_04MDT, Calendar.HOUR));

        __CLR4_5_2175z175zlvha7iqh.R.inc(56548);assertEquals("Truncate Calendar.DATE",
                            oct31MDT, DateUtils.truncate(oct31_01_02_03_04MDT, Calendar.DATE));


        // ---------- Test Round (down) ----------
        __CLR4_5_2175z175zlvha7iqh.R.inc(56549);assertEquals("Round Calendar.MILLISECOND",
                oct31_01_02_03_04MDT, DateUtils.round(oct31_01_02_03_04MDT, Calendar.MILLISECOND));

        __CLR4_5_2175z175zlvha7iqh.R.inc(56550);assertEquals("Round Calendar.SECOND",
                   oct31_01_02_03MDT, DateUtils.round(oct31_01_02_03_04MDT, Calendar.SECOND));

        __CLR4_5_2175z175zlvha7iqh.R.inc(56551);assertEquals("Round Calendar.MINUTE",
                      oct31_01_02MDT, DateUtils.round(oct31_01_02_03_04MDT, Calendar.MINUTE));

        __CLR4_5_2175z175zlvha7iqh.R.inc(56552);assertEquals("Round Calendar.HOUR_OF_DAY",
                         oct31_01MDT, DateUtils.round(oct31_01_02_03_04MDT, Calendar.HOUR_OF_DAY));

        __CLR4_5_2175z175zlvha7iqh.R.inc(56553);assertEquals("Round Calendar.HOUR",
                         oct31_01MDT, DateUtils.round(oct31_01_02_03_04MDT, Calendar.HOUR));

        __CLR4_5_2175z175zlvha7iqh.R.inc(56554);assertEquals("Round Calendar.DATE",
                            oct31MDT, DateUtils.round(oct31_01_02_03_04MDT, Calendar.DATE));

        // restore default time zone
        __CLR4_5_2175z175zlvha7iqh.R.inc(56555);TimeZone.setDefault(defaultZone);
    }finally{__CLR4_5_2175z175zlvha7iqh.R.flushNeeded();}}

    // http://issues.apache.org/jira/browse/LANG-530
    @SuppressWarnings("deprecation")
    @Test
    public void testLang530() throws ParseException {__CLR4_5_2175z175zlvha7iqh.R.globalSliceStart(getClass().getName(),56556);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2aigeyh17n0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2175z175zlvha7iqh.R.rethrow($CLV_t2$);}finally{__CLR4_5_2175z175zlvha7iqh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsTest.testLang530",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),56556,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2aigeyh17n0() throws ParseException{try{__CLR4_5_2175z175zlvha7iqh.R.inc(56556);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56557);final Date d = new Date();
        __CLR4_5_2175z175zlvha7iqh.R.inc(56558);final String isoDateStr = DateFormatUtils.ISO_DATETIME_TIME_ZONE_FORMAT.format(d);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56559);final Date d2 = DateUtils.parseDate(isoDateStr, new String[] { DateFormatUtils.ISO_DATETIME_TIME_ZONE_FORMAT.getPattern() });
        // the format loses milliseconds so have to reintroduce them
        __CLR4_5_2175z175zlvha7iqh.R.inc(56560);assertEquals("Date not equal to itself ISO formatted and parsed", d.getTime(), d2.getTime() + d.getTime() % 1000); 
    }finally{__CLR4_5_2175z175zlvha7iqh.R.flushNeeded();}}
    
    /**
     * Tests various values with the ceiling method
     *
     * @throws java.lang.Exception so we don't have to catch it
     */
    @Test
    public void testCeil() throws Exception {__CLR4_5_2175z175zlvha7iqh.R.globalSliceStart(getClass().getName(),56561);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2omoba617n5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2175z175zlvha7iqh.R.rethrow($CLV_t2$);}finally{__CLR4_5_2175z175zlvha7iqh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsTest.testCeil",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),56561,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2omoba617n5() throws Exception{try{__CLR4_5_2175z175zlvha7iqh.R.inc(56561);
        // test javadoc
        __CLR4_5_2175z175zlvha7iqh.R.inc(56562);assertEquals("ceiling javadoc-1 failed",
                dateTimeParser.parse("March 28, 2002 14:00:00.000"),
                DateUtils.ceiling(
                    dateTimeParser.parse("March 28, 2002 13:45:01.231"),
                Calendar.HOUR));
        __CLR4_5_2175z175zlvha7iqh.R.inc(56563);assertEquals("ceiling javadoc-2 failed",
                dateTimeParser.parse("April 1, 2002 00:00:00.000"),
                DateUtils.ceiling(
                    dateTimeParser.parse("March 28, 2002 13:45:01.231"),
                Calendar.MONTH));

        // tests public static Date ceiling(Date date, int field)
        __CLR4_5_2175z175zlvha7iqh.R.inc(56564);assertEquals("ceiling year-1 failed",
                dateParser.parse("January 1, 2003"),
                DateUtils.ceiling(date1, Calendar.YEAR));
        __CLR4_5_2175z175zlvha7iqh.R.inc(56565);assertEquals("ceiling year-2 failed",
                dateParser.parse("January 1, 2002"),
                DateUtils.ceiling(date2, Calendar.YEAR));
        __CLR4_5_2175z175zlvha7iqh.R.inc(56566);assertEquals("ceiling month-1 failed",
                dateParser.parse("March 1, 2002"),
                DateUtils.ceiling(date1, Calendar.MONTH));
        __CLR4_5_2175z175zlvha7iqh.R.inc(56567);assertEquals("ceiling month-2 failed",
                dateParser.parse("December 1, 2001"),
                DateUtils.ceiling(date2, Calendar.MONTH));
        __CLR4_5_2175z175zlvha7iqh.R.inc(56568);assertEquals("ceiling semimonth-1 failed",
                dateParser.parse("February 16, 2002"),
                DateUtils.ceiling(date1, DateUtils.SEMI_MONTH));
        __CLR4_5_2175z175zlvha7iqh.R.inc(56569);assertEquals("ceiling semimonth-2 failed",
                dateParser.parse("December 1, 2001"),
                DateUtils.ceiling(date2, DateUtils.SEMI_MONTH));
        __CLR4_5_2175z175zlvha7iqh.R.inc(56570);assertEquals("ceiling date-1 failed",
                dateParser.parse("February 13, 2002"),
                DateUtils.ceiling(date1, Calendar.DATE));
        __CLR4_5_2175z175zlvha7iqh.R.inc(56571);assertEquals("ceiling date-2 failed",
                dateParser.parse("November 19, 2001"),
                DateUtils.ceiling(date2, Calendar.DATE));
        __CLR4_5_2175z175zlvha7iqh.R.inc(56572);assertEquals("ceiling hour-1 failed",
                dateTimeParser.parse("February 12, 2002 13:00:00.000"),
                DateUtils.ceiling(date1, Calendar.HOUR));
        __CLR4_5_2175z175zlvha7iqh.R.inc(56573);assertEquals("ceiling hour-2 failed",
                dateTimeParser.parse("November 18, 2001 2:00:00.000"),
                DateUtils.ceiling(date2, Calendar.HOUR));
        __CLR4_5_2175z175zlvha7iqh.R.inc(56574);assertEquals("ceiling minute-1 failed",
                dateTimeParser.parse("February 12, 2002 12:35:00.000"),
                DateUtils.ceiling(date1, Calendar.MINUTE));
        __CLR4_5_2175z175zlvha7iqh.R.inc(56575);assertEquals("ceiling minute-2 failed",
                dateTimeParser.parse("November 18, 2001 1:24:00.000"),
                DateUtils.ceiling(date2, Calendar.MINUTE));
        __CLR4_5_2175z175zlvha7iqh.R.inc(56576);assertEquals("ceiling second-1 failed",
                dateTimeParser.parse("February 12, 2002 12:34:57.000"),
                DateUtils.ceiling(date1, Calendar.SECOND));
        __CLR4_5_2175z175zlvha7iqh.R.inc(56577);assertEquals("ceiling second-2 failed",
                dateTimeParser.parse("November 18, 2001 1:23:12.000"),
                DateUtils.ceiling(date2, Calendar.SECOND));
        __CLR4_5_2175z175zlvha7iqh.R.inc(56578);assertEquals("ceiling ampm-1 failed",
                dateTimeParser.parse("February 3, 2002 12:00:00.000"),
                DateUtils.ceiling(dateAmPm1, Calendar.AM_PM));
        __CLR4_5_2175z175zlvha7iqh.R.inc(56579);assertEquals("ceiling ampm-2 failed",
                dateTimeParser.parse("February 3, 2002 12:00:00.000"),
                DateUtils.ceiling(dateAmPm2, Calendar.AM_PM));
        __CLR4_5_2175z175zlvha7iqh.R.inc(56580);assertEquals("ceiling ampm-3 failed",
                dateTimeParser.parse("February 4, 2002 00:00:00.000"),
                DateUtils.ceiling(dateAmPm3, Calendar.AM_PM));
        __CLR4_5_2175z175zlvha7iqh.R.inc(56581);assertEquals("ceiling ampm-4 failed",
                dateTimeParser.parse("February 4, 2002 00:00:00.000"),
                DateUtils.ceiling(dateAmPm4, Calendar.AM_PM));
        
     // tests public static Date ceiling(Object date, int field)
        __CLR4_5_2175z175zlvha7iqh.R.inc(56582);assertEquals("ceiling year-1 failed",
                dateParser.parse("January 1, 2003"),
                DateUtils.ceiling((Object) date1, Calendar.YEAR));
        __CLR4_5_2175z175zlvha7iqh.R.inc(56583);assertEquals("ceiling year-2 failed",
                dateParser.parse("January 1, 2002"),
                DateUtils.ceiling((Object) date2, Calendar.YEAR));
        __CLR4_5_2175z175zlvha7iqh.R.inc(56584);assertEquals("ceiling month-1 failed",
                dateParser.parse("March 1, 2002"),
                DateUtils.ceiling((Object) date1, Calendar.MONTH));
        __CLR4_5_2175z175zlvha7iqh.R.inc(56585);assertEquals("ceiling month-2 failed",
                dateParser.parse("December 1, 2001"),
                DateUtils.ceiling((Object) date2, Calendar.MONTH));
        __CLR4_5_2175z175zlvha7iqh.R.inc(56586);assertEquals("ceiling semimonth-1 failed",
                dateParser.parse("February 16, 2002"),
                DateUtils.ceiling((Object) date1, DateUtils.SEMI_MONTH));
        __CLR4_5_2175z175zlvha7iqh.R.inc(56587);assertEquals("ceiling semimonth-2 failed",
                dateParser.parse("December 1, 2001"),
                DateUtils.ceiling((Object) date2, DateUtils.SEMI_MONTH));
        __CLR4_5_2175z175zlvha7iqh.R.inc(56588);assertEquals("ceiling date-1 failed",
                dateParser.parse("February 13, 2002"),
                DateUtils.ceiling((Object) date1, Calendar.DATE));
        __CLR4_5_2175z175zlvha7iqh.R.inc(56589);assertEquals("ceiling date-2 failed",
                dateParser.parse("November 19, 2001"),
                DateUtils.ceiling((Object) date2, Calendar.DATE));
        __CLR4_5_2175z175zlvha7iqh.R.inc(56590);assertEquals("ceiling hour-1 failed",
                dateTimeParser.parse("February 12, 2002 13:00:00.000"),
                DateUtils.ceiling((Object) date1, Calendar.HOUR));
        __CLR4_5_2175z175zlvha7iqh.R.inc(56591);assertEquals("ceiling hour-2 failed",
                dateTimeParser.parse("November 18, 2001 2:00:00.000"),
                DateUtils.ceiling((Object) date2, Calendar.HOUR));
        __CLR4_5_2175z175zlvha7iqh.R.inc(56592);assertEquals("ceiling minute-1 failed",
                dateTimeParser.parse("February 12, 2002 12:35:00.000"),
                DateUtils.ceiling((Object) date1, Calendar.MINUTE));
        __CLR4_5_2175z175zlvha7iqh.R.inc(56593);assertEquals("ceiling minute-2 failed",
                dateTimeParser.parse("November 18, 2001 1:24:00.000"),
                DateUtils.ceiling((Object) date2, Calendar.MINUTE));
        __CLR4_5_2175z175zlvha7iqh.R.inc(56594);assertEquals("ceiling second-1 failed",
                dateTimeParser.parse("February 12, 2002 12:34:57.000"),
                DateUtils.ceiling((Object) date1, Calendar.SECOND));
        __CLR4_5_2175z175zlvha7iqh.R.inc(56595);assertEquals("ceiling second-2 failed",
                dateTimeParser.parse("November 18, 2001 1:23:12.000"),
                DateUtils.ceiling((Object) date2, Calendar.SECOND));
        __CLR4_5_2175z175zlvha7iqh.R.inc(56596);assertEquals("ceiling ampm-1 failed",
                dateTimeParser.parse("February 3, 2002 12:00:00.000"),
                DateUtils.ceiling((Object) dateAmPm1, Calendar.AM_PM));
        __CLR4_5_2175z175zlvha7iqh.R.inc(56597);assertEquals("ceiling ampm-2 failed",
                dateTimeParser.parse("February 3, 2002 12:00:00.000"),
                DateUtils.ceiling((Object) dateAmPm2, Calendar.AM_PM));
        __CLR4_5_2175z175zlvha7iqh.R.inc(56598);assertEquals("ceiling ampm-3 failed",
                dateTimeParser.parse("February 4, 2002 00:00:00.000"),
                DateUtils.ceiling((Object) dateAmPm3, Calendar.AM_PM));
        __CLR4_5_2175z175zlvha7iqh.R.inc(56599);assertEquals("ceiling ampm-4 failed",
                dateTimeParser.parse("February 4, 2002 00:00:00.000"),
                DateUtils.ceiling((Object) dateAmPm4, Calendar.AM_PM));
        
        __CLR4_5_2175z175zlvha7iqh.R.inc(56600);assertEquals("ceiling calendar second-1 failed",
                dateTimeParser.parse("February 12, 2002 12:34:57.000"),
                DateUtils.ceiling((Object) cal1, Calendar.SECOND));
        __CLR4_5_2175z175zlvha7iqh.R.inc(56601);assertEquals("ceiling calendar second-2 failed",
                dateTimeParser.parse("November 18, 2001 1:23:12.000"),
                DateUtils.ceiling((Object) cal2, Calendar.SECOND));
        
        __CLR4_5_2175z175zlvha7iqh.R.inc(56602);assertEquals("ceiling ampm-1 failed",
                dateTimeParser.parse("February 3, 2002 12:00:00.000"),
                DateUtils.ceiling((Object) calAmPm1, Calendar.AM_PM));
        __CLR4_5_2175z175zlvha7iqh.R.inc(56603);assertEquals("ceiling ampm-2 failed",
                dateTimeParser.parse("February 3, 2002 12:00:00.000"),
                DateUtils.ceiling((Object) calAmPm2, Calendar.AM_PM));
        __CLR4_5_2175z175zlvha7iqh.R.inc(56604);assertEquals("ceiling ampm-3 failed",
                dateTimeParser.parse("February 4, 2002 00:00:00.000"),
                DateUtils.ceiling((Object) calAmPm3, Calendar.AM_PM));
        __CLR4_5_2175z175zlvha7iqh.R.inc(56605);assertEquals("ceiling ampm-4 failed",
                dateTimeParser.parse("February 4, 2002 00:00:00.000"),
                DateUtils.ceiling((Object) calAmPm4, Calendar.AM_PM));

        __CLR4_5_2175z175zlvha7iqh.R.inc(56606);try {
            __CLR4_5_2175z175zlvha7iqh.R.inc(56607);DateUtils.ceiling((Date) null, Calendar.SECOND);
            __CLR4_5_2175z175zlvha7iqh.R.inc(56608);fail();
        } catch (final IllegalArgumentException ex) {}
        __CLR4_5_2175z175zlvha7iqh.R.inc(56609);try {
            __CLR4_5_2175z175zlvha7iqh.R.inc(56610);DateUtils.ceiling((Calendar) null, Calendar.SECOND);
            __CLR4_5_2175z175zlvha7iqh.R.inc(56611);fail();
        } catch (final IllegalArgumentException ex) {}
        __CLR4_5_2175z175zlvha7iqh.R.inc(56612);try {
            __CLR4_5_2175z175zlvha7iqh.R.inc(56613);DateUtils.ceiling((Object) null, Calendar.SECOND);
            __CLR4_5_2175z175zlvha7iqh.R.inc(56614);fail();
        } catch (final IllegalArgumentException ex) {}
        __CLR4_5_2175z175zlvha7iqh.R.inc(56615);try {
            __CLR4_5_2175z175zlvha7iqh.R.inc(56616);DateUtils.ceiling("", Calendar.SECOND);
            __CLR4_5_2175z175zlvha7iqh.R.inc(56617);fail();
        } catch (final ClassCastException ex) {}
        __CLR4_5_2175z175zlvha7iqh.R.inc(56618);try {
            __CLR4_5_2175z175zlvha7iqh.R.inc(56619);DateUtils.ceiling(date1, -9999);
            __CLR4_5_2175z175zlvha7iqh.R.inc(56620);fail();
        } catch(final IllegalArgumentException ex) {}

        
        // Fix for http://issues.apache.org/bugzilla/show_bug.cgi?id=25560
        // Test ceiling across the beginning of daylight saving time
        __CLR4_5_2175z175zlvha7iqh.R.inc(56621);TimeZone.setDefault(zone);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56622);dateTimeParser.setTimeZone(zone);

        __CLR4_5_2175z175zlvha7iqh.R.inc(56623);assertEquals("ceiling MET date across DST change-over",
                dateTimeParser.parse("March 31, 2003 00:00:00.000"),
                DateUtils.ceiling(date4, Calendar.DATE));
        __CLR4_5_2175z175zlvha7iqh.R.inc(56624);assertEquals("ceiling MET date across DST change-over",
                dateTimeParser.parse("March 31, 2003 00:00:00.000"),
                DateUtils.ceiling((Object) cal4, Calendar.DATE));
        __CLR4_5_2175z175zlvha7iqh.R.inc(56625);assertEquals("ceiling MET date across DST change-over",
                dateTimeParser.parse("March 31, 2003 00:00:00.000"),
                DateUtils.ceiling(date5, Calendar.DATE));
        __CLR4_5_2175z175zlvha7iqh.R.inc(56626);assertEquals("ceiling MET date across DST change-over",
                dateTimeParser.parse("March 31, 2003 00:00:00.000"),
                DateUtils.ceiling((Object) cal5, Calendar.DATE));
        __CLR4_5_2175z175zlvha7iqh.R.inc(56627);assertEquals("ceiling MET date across DST change-over",
                dateTimeParser.parse("March 31, 2003 00:00:00.000"),
                DateUtils.ceiling(date6, Calendar.DATE));
        __CLR4_5_2175z175zlvha7iqh.R.inc(56628);assertEquals("ceiling MET date across DST change-over",
                dateTimeParser.parse("March 31, 2003 00:00:00.000"),
                DateUtils.ceiling((Object) cal6, Calendar.DATE));
        __CLR4_5_2175z175zlvha7iqh.R.inc(56629);assertEquals("ceiling MET date across DST change-over",
                dateTimeParser.parse("March 31, 2003 00:00:00.000"),
                DateUtils.ceiling(date7, Calendar.DATE));
        __CLR4_5_2175z175zlvha7iqh.R.inc(56630);assertEquals("ceiling MET date across DST change-over",
                dateTimeParser.parse("March 31, 2003 00:00:00.000"),
                DateUtils.ceiling((Object) cal7, Calendar.DATE));
        
        __CLR4_5_2175z175zlvha7iqh.R.inc(56631);assertEquals("ceiling MET date across DST change-over",
                dateTimeParser.parse("March 30, 2003 03:00:00.000"),
                DateUtils.ceiling(date4, Calendar.HOUR_OF_DAY));
        __CLR4_5_2175z175zlvha7iqh.R.inc(56632);assertEquals("ceiling MET date across DST change-over",
                dateTimeParser.parse("March 30, 2003 03:00:00.000"),
                DateUtils.ceiling((Object) cal4, Calendar.HOUR_OF_DAY));
        __CLR4_5_2175z175zlvha7iqh.R.inc(56633);assertEquals("ceiling MET date across DST change-over",
                dateTimeParser.parse("March 30, 2003 03:00:00.000"),
                DateUtils.ceiling(date5, Calendar.HOUR_OF_DAY));
        __CLR4_5_2175z175zlvha7iqh.R.inc(56634);assertEquals("ceiling MET date across DST change-over",
                dateTimeParser.parse("March 30, 2003 03:00:00.000"),
                DateUtils.ceiling((Object) cal5, Calendar.HOUR_OF_DAY));
        __CLR4_5_2175z175zlvha7iqh.R.inc(56635);assertEquals("ceiling MET date across DST change-over",
                dateTimeParser.parse("March 30, 2003 04:00:00.000"),
                DateUtils.ceiling(date6, Calendar.HOUR_OF_DAY));
        __CLR4_5_2175z175zlvha7iqh.R.inc(56636);assertEquals("ceiling MET date across DST change-over",
                dateTimeParser.parse("March 30, 2003 04:00:00.000"),
                DateUtils.ceiling((Object) cal6, Calendar.HOUR_OF_DAY));
        __CLR4_5_2175z175zlvha7iqh.R.inc(56637);assertEquals("ceiling MET date across DST change-over",
                dateTimeParser.parse("March 30, 2003 04:00:00.000"),
                DateUtils.ceiling(date7, Calendar.HOUR_OF_DAY));
        __CLR4_5_2175z175zlvha7iqh.R.inc(56638);assertEquals("ceiling MET date across DST change-over",
                dateTimeParser.parse("March 30, 2003 04:00:00.000"),
                DateUtils.ceiling((Object) cal7, Calendar.HOUR_OF_DAY));
        __CLR4_5_2175z175zlvha7iqh.R.inc(56639);TimeZone.setDefault(defaultZone);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56640);dateTimeParser.setTimeZone(defaultZone);
        
     // Bug 31395, large dates
        __CLR4_5_2175z175zlvha7iqh.R.inc(56641);final Date endOfTime = new Date(Long.MAX_VALUE); // fyi: Sun Aug 17 07:12:55 CET 292278994 -- 807 millis
        __CLR4_5_2175z175zlvha7iqh.R.inc(56642);final GregorianCalendar endCal = new GregorianCalendar();
        __CLR4_5_2175z175zlvha7iqh.R.inc(56643);endCal.setTime(endOfTime);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56644);try {
            __CLR4_5_2175z175zlvha7iqh.R.inc(56645);DateUtils.ceiling(endCal, Calendar.DATE);
            __CLR4_5_2175z175zlvha7iqh.R.inc(56646);fail();
        } catch (final ArithmeticException ex) {}
        __CLR4_5_2175z175zlvha7iqh.R.inc(56647);endCal.set(Calendar.YEAR, 280000001);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56648);try {
            __CLR4_5_2175z175zlvha7iqh.R.inc(56649);DateUtils.ceiling(endCal, Calendar.DATE);
            __CLR4_5_2175z175zlvha7iqh.R.inc(56650);fail();
        } catch (final ArithmeticException ex) {}
        __CLR4_5_2175z175zlvha7iqh.R.inc(56651);endCal.set(Calendar.YEAR, 280000000);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56652);final Calendar cal = DateUtils.ceiling(endCal, Calendar.DATE);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56653);assertEquals(0, cal.get(Calendar.HOUR));
    }finally{__CLR4_5_2175z175zlvha7iqh.R.flushNeeded();}}

    /**
     * Tests the iterator exceptions
     *
     * @throws java.lang.Exception so we don't have to catch it
     */
    @Test
    public void testIteratorEx() throws Exception {__CLR4_5_2175z175zlvha7iqh.R.globalSliceStart(getClass().getName(),56654);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2tgtzu17pq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2175z175zlvha7iqh.R.rethrow($CLV_t2$);}finally{__CLR4_5_2175z175zlvha7iqh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsTest.testIteratorEx",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),56654,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2tgtzu17pq() throws Exception{try{__CLR4_5_2175z175zlvha7iqh.R.inc(56654);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56655);try {
            __CLR4_5_2175z175zlvha7iqh.R.inc(56656);DateUtils.iterator(Calendar.getInstance(), -9999);
        } catch (final IllegalArgumentException ex) {}
        __CLR4_5_2175z175zlvha7iqh.R.inc(56657);try {
            __CLR4_5_2175z175zlvha7iqh.R.inc(56658);DateUtils.iterator((Date) null, DateUtils.RANGE_WEEK_CENTER);
            __CLR4_5_2175z175zlvha7iqh.R.inc(56659);fail();
        } catch (final IllegalArgumentException ex) {}
        __CLR4_5_2175z175zlvha7iqh.R.inc(56660);try {
            __CLR4_5_2175z175zlvha7iqh.R.inc(56661);DateUtils.iterator((Calendar) null, DateUtils.RANGE_WEEK_CENTER);
            __CLR4_5_2175z175zlvha7iqh.R.inc(56662);fail();
        } catch (final IllegalArgumentException ex) {}
        __CLR4_5_2175z175zlvha7iqh.R.inc(56663);try {
            __CLR4_5_2175z175zlvha7iqh.R.inc(56664);DateUtils.iterator((Object) null, DateUtils.RANGE_WEEK_CENTER);
            __CLR4_5_2175z175zlvha7iqh.R.inc(56665);fail();
        } catch (final IllegalArgumentException ex) {}
        __CLR4_5_2175z175zlvha7iqh.R.inc(56666);try {
            __CLR4_5_2175z175zlvha7iqh.R.inc(56667);DateUtils.iterator("", DateUtils.RANGE_WEEK_CENTER);
            __CLR4_5_2175z175zlvha7iqh.R.inc(56668);fail();
        } catch (final ClassCastException ex) {}
    }finally{__CLR4_5_2175z175zlvha7iqh.R.flushNeeded();}}

    /**
     * Tests the calendar iterator for week ranges
     *
     * @throws java.lang.Exception so we don't have to catch it
     */
    @Test
    public void testWeekIterator() throws Exception {__CLR4_5_2175z175zlvha7iqh.R.globalSliceStart(getClass().getName(),56669);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2bpvfnf17q5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2175z175zlvha7iqh.R.rethrow($CLV_t2$);}finally{__CLR4_5_2175z175zlvha7iqh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsTest.testWeekIterator",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),56669,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2bpvfnf17q5() throws Exception{try{__CLR4_5_2175z175zlvha7iqh.R.inc(56669);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56670);final Calendar now = Calendar.getInstance();
        __CLR4_5_2175z175zlvha7iqh.R.inc(56671);for (int i = 0; (((i< 7)&&(__CLR4_5_2175z175zlvha7iqh.R.iget(56672)!=0|true))||(__CLR4_5_2175z175zlvha7iqh.R.iget(56673)==0&false)); i++) {{
            __CLR4_5_2175z175zlvha7iqh.R.inc(56674);final Calendar today = DateUtils.truncate(now, Calendar.DATE);
            __CLR4_5_2175z175zlvha7iqh.R.inc(56675);final Calendar sunday = DateUtils.truncate(now, Calendar.DATE);
            __CLR4_5_2175z175zlvha7iqh.R.inc(56676);sunday.add(Calendar.DATE, 1 - sunday.get(Calendar.DAY_OF_WEEK));
            __CLR4_5_2175z175zlvha7iqh.R.inc(56677);final Calendar monday = DateUtils.truncate(now, Calendar.DATE);
            __CLR4_5_2175z175zlvha7iqh.R.inc(56678);if ((((monday.get(Calendar.DAY_OF_WEEK) == 1)&&(__CLR4_5_2175z175zlvha7iqh.R.iget(56679)!=0|true))||(__CLR4_5_2175z175zlvha7iqh.R.iget(56680)==0&false))) {{
                //This is sunday... roll back 6 days
                __CLR4_5_2175z175zlvha7iqh.R.inc(56681);monday.add(Calendar.DATE, -6);
            } }else {{
                __CLR4_5_2175z175zlvha7iqh.R.inc(56682);monday.add(Calendar.DATE, 2 - monday.get(Calendar.DAY_OF_WEEK));
            }
            }__CLR4_5_2175z175zlvha7iqh.R.inc(56683);final Calendar centered = DateUtils.truncate(now, Calendar.DATE);
            __CLR4_5_2175z175zlvha7iqh.R.inc(56684);centered.add(Calendar.DATE, -3);
            
            __CLR4_5_2175z175zlvha7iqh.R.inc(56685);Iterator<?> it = DateUtils.iterator(now, DateUtils.RANGE_WEEK_SUNDAY);
            __CLR4_5_2175z175zlvha7iqh.R.inc(56686);assertWeekIterator(it, sunday);
            __CLR4_5_2175z175zlvha7iqh.R.inc(56687);it = DateUtils.iterator(now, DateUtils.RANGE_WEEK_MONDAY);
            __CLR4_5_2175z175zlvha7iqh.R.inc(56688);assertWeekIterator(it, monday);
            __CLR4_5_2175z175zlvha7iqh.R.inc(56689);it = DateUtils.iterator(now, DateUtils.RANGE_WEEK_RELATIVE);
            __CLR4_5_2175z175zlvha7iqh.R.inc(56690);assertWeekIterator(it, today);
            __CLR4_5_2175z175zlvha7iqh.R.inc(56691);it = DateUtils.iterator(now, DateUtils.RANGE_WEEK_CENTER);
            __CLR4_5_2175z175zlvha7iqh.R.inc(56692);assertWeekIterator(it, centered);
            
            __CLR4_5_2175z175zlvha7iqh.R.inc(56693);it = DateUtils.iterator((Object) now, DateUtils.RANGE_WEEK_CENTER);
            __CLR4_5_2175z175zlvha7iqh.R.inc(56694);assertWeekIterator(it, centered);
            __CLR4_5_2175z175zlvha7iqh.R.inc(56695);it = DateUtils.iterator((Object) now.getTime(), DateUtils.RANGE_WEEK_CENTER);
            __CLR4_5_2175z175zlvha7iqh.R.inc(56696);assertWeekIterator(it, centered);
            __CLR4_5_2175z175zlvha7iqh.R.inc(56697);try {
                __CLR4_5_2175z175zlvha7iqh.R.inc(56698);it.next();
                __CLR4_5_2175z175zlvha7iqh.R.inc(56699);fail();
            } catch (final NoSuchElementException ex) {}
            __CLR4_5_2175z175zlvha7iqh.R.inc(56700);it = DateUtils.iterator(now, DateUtils.RANGE_WEEK_CENTER);
            __CLR4_5_2175z175zlvha7iqh.R.inc(56701);it.next();
            __CLR4_5_2175z175zlvha7iqh.R.inc(56702);try {
                __CLR4_5_2175z175zlvha7iqh.R.inc(56703);it.remove();
            } catch( final UnsupportedOperationException ex) {}
            
            __CLR4_5_2175z175zlvha7iqh.R.inc(56704);now.add(Calendar.DATE,1);
        }
    }}finally{__CLR4_5_2175z175zlvha7iqh.R.flushNeeded();}}
            
    /**
     * Tests the calendar iterator for month-based ranges
     *
     * @throws java.lang.Exception so we don't have to catch it
     */
    @Test
    public void testMonthIterator() throws Exception {__CLR4_5_2175z175zlvha7iqh.R.globalSliceStart(getClass().getName(),56705);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2u2kxur17r5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2175z175zlvha7iqh.R.rethrow($CLV_t2$);}finally{__CLR4_5_2175z175zlvha7iqh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsTest.testMonthIterator",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),56705,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2u2kxur17r5() throws Exception{try{__CLR4_5_2175z175zlvha7iqh.R.inc(56705);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56706);Iterator<?> it = DateUtils.iterator(date1, DateUtils.RANGE_MONTH_SUNDAY);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56707);assertWeekIterator(it,
                dateParser.parse("January 27, 2002"),
                dateParser.parse("March 2, 2002"));

        __CLR4_5_2175z175zlvha7iqh.R.inc(56708);it = DateUtils.iterator(date1, DateUtils.RANGE_MONTH_MONDAY);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56709);assertWeekIterator(it,
                dateParser.parse("January 28, 2002"),
                dateParser.parse("March 3, 2002"));

        __CLR4_5_2175z175zlvha7iqh.R.inc(56710);it = DateUtils.iterator(date2, DateUtils.RANGE_MONTH_SUNDAY);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56711);assertWeekIterator(it,
                dateParser.parse("October 28, 2001"),
                dateParser.parse("December 1, 2001"));

        __CLR4_5_2175z175zlvha7iqh.R.inc(56712);it = DateUtils.iterator(date2, DateUtils.RANGE_MONTH_MONDAY);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56713);assertWeekIterator(it,
                dateParser.parse("October 29, 2001"),
                dateParser.parse("December 2, 2001"));
    }finally{__CLR4_5_2175z175zlvha7iqh.R.flushNeeded();}}

    @SystemDefaults(locale="en")
    @Test
    public void testLANG799_EN_OK() throws ParseException {__CLR4_5_2175z175zlvha7iqh.R.globalSliceStart(getClass().getName(),56714);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_246kir317re();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2175z175zlvha7iqh.R.rethrow($CLV_t2$);}finally{__CLR4_5_2175z175zlvha7iqh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsTest.testLANG799_EN_OK",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),56714,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_246kir317re() throws ParseException{try{__CLR4_5_2175z175zlvha7iqh.R.inc(56714);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56715);DateUtils.parseDate("Wed, 09 Apr 2008 23:55:38 GMT", "EEE, dd MMM yyyy HH:mm:ss zzz");
        __CLR4_5_2175z175zlvha7iqh.R.inc(56716);DateUtils.parseDateStrictly("Wed, 09 Apr 2008 23:55:38 GMT", "EEE, dd MMM yyyy HH:mm:ss zzz");
    }finally{__CLR4_5_2175z175zlvha7iqh.R.flushNeeded();}}

    // Parse German date with English Locale
    @SystemDefaults(locale="en")
    @Test(expected = ParseException.class)
    public void testLANG799_EN_FAIL() throws ParseException {__CLR4_5_2175z175zlvha7iqh.R.globalSliceStart(getClass().getName(),56717);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2dfrkwj17rh();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,76,65,78,71,55,57,57,95,69,78,95,70,65,73,76,58,32,91,80,97,114,115,101,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof ParseException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2175z175zlvha7iqh.R.rethrow($CLV_t2$);}finally{__CLR4_5_2175z175zlvha7iqh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsTest.testLANG799_EN_FAIL",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),56717,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2dfrkwj17rh() throws ParseException{try{__CLR4_5_2175z175zlvha7iqh.R.inc(56717);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56718);DateUtils.parseDate("Mi, 09 Apr 2008 23:55:38 GMT", "EEE, dd MMM yyyy HH:mm:ss zzz");
    }finally{__CLR4_5_2175z175zlvha7iqh.R.flushNeeded();}}

    @SystemDefaults(locale="de")
    @Test
    public void testLANG799_DE_OK() throws ParseException {__CLR4_5_2175z175zlvha7iqh.R.globalSliceStart(getClass().getName(),56719);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2etdut517rj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2175z175zlvha7iqh.R.rethrow($CLV_t2$);}finally{__CLR4_5_2175z175zlvha7iqh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsTest.testLANG799_DE_OK",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),56719,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2etdut517rj() throws ParseException{try{__CLR4_5_2175z175zlvha7iqh.R.inc(56719);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56720);DateUtils.parseDate("Mi, 09 Apr 2008 23:55:38 GMT", "EEE, dd MMM yyyy HH:mm:ss zzz");
        __CLR4_5_2175z175zlvha7iqh.R.inc(56721);DateUtils.parseDateStrictly("Mi, 09 Apr 2008 23:55:38 GMT", "EEE, dd MMM yyyy HH:mm:ss zzz");
    }finally{__CLR4_5_2175z175zlvha7iqh.R.flushNeeded();}}

    // Parse English date with German Locale
    @SystemDefaults(locale="de")
    @Test(expected=ParseException.class)
    public void testLANG799_DE_FAIL() throws ParseException {__CLR4_5_2175z175zlvha7iqh.R.globalSliceStart(getClass().getName(),56722);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gahi2j17rm();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,76,65,78,71,55,57,57,95,68,69,95,70,65,73,76,58,32,91,80,97,114,115,101,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof ParseException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2175z175zlvha7iqh.R.rethrow($CLV_t2$);}finally{__CLR4_5_2175z175zlvha7iqh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsTest.testLANG799_DE_FAIL",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),56722,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gahi2j17rm() throws ParseException{try{__CLR4_5_2175z175zlvha7iqh.R.inc(56722);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56723);DateUtils.parseDate("Wed, 09 Apr 2008 23:55:38 GMT", "EEE, dd MMM yyyy HH:mm:ss zzz");
    }finally{__CLR4_5_2175z175zlvha7iqh.R.flushNeeded();}}
    
    // Parse German date with English Locale, specifying German Locale override
    @SystemDefaults(locale="en")
    @Test
    public void testLANG799_EN_WITH_DE_LOCALE() throws ParseException {__CLR4_5_2175z175zlvha7iqh.R.globalSliceStart(getClass().getName(),56724);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_230e6j017ro();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2175z175zlvha7iqh.R.rethrow($CLV_t2$);}finally{__CLR4_5_2175z175zlvha7iqh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsTest.testLANG799_EN_WITH_DE_LOCALE",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),56724,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_230e6j017ro() throws ParseException{try{__CLR4_5_2175z175zlvha7iqh.R.inc(56724);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56725);DateUtils.parseDate("Mi, 09 Apr 2008 23:55:38 GMT", Locale.GERMAN, "EEE, dd MMM yyyy HH:mm:ss zzz");
    }finally{__CLR4_5_2175z175zlvha7iqh.R.flushNeeded();}}
    
    /**
     * This checks that this is a 7 element iterator of Calendar objects
     * that are dates (no time), and exactly 1 day spaced after each other.
     */
    private static void assertWeekIterator(final Iterator<?> it, final Calendar start) {try{__CLR4_5_2175z175zlvha7iqh.R.inc(56726);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56727);final Calendar end = (Calendar) start.clone();
        __CLR4_5_2175z175zlvha7iqh.R.inc(56728);end.add(Calendar.DATE, 6);

        __CLR4_5_2175z175zlvha7iqh.R.inc(56729);assertWeekIterator(it, start, end);
    }finally{__CLR4_5_2175z175zlvha7iqh.R.flushNeeded();}}

    /**
     * Convenience method for when working with Date objects
     */
    private static void assertWeekIterator(final Iterator<?> it, final Date start, final Date end) {try{__CLR4_5_2175z175zlvha7iqh.R.inc(56730);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56731);final Calendar calStart = Calendar.getInstance();
        __CLR4_5_2175z175zlvha7iqh.R.inc(56732);calStart.setTime(start);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56733);final Calendar calEnd = Calendar.getInstance();
        __CLR4_5_2175z175zlvha7iqh.R.inc(56734);calEnd.setTime(end);

        __CLR4_5_2175z175zlvha7iqh.R.inc(56735);assertWeekIterator(it, calStart, calEnd);
    }finally{__CLR4_5_2175z175zlvha7iqh.R.flushNeeded();}}

    /**
     * This checks that this is a 7 divisble iterator of Calendar objects
     * that are dates (no time), and exactly 1 day spaced after each other
     * (in addition to the proper start and stop dates)
     */
    private static void assertWeekIterator(final Iterator<?> it, final Calendar start, final Calendar end) {try{__CLR4_5_2175z175zlvha7iqh.R.inc(56736);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56737);Calendar cal = (Calendar) it.next();
        __CLR4_5_2175z175zlvha7iqh.R.inc(56738);assertCalendarsEquals("", start, cal, 0);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56739);Calendar last = null;
        __CLR4_5_2175z175zlvha7iqh.R.inc(56740);int count = 1;
        __CLR4_5_2175z175zlvha7iqh.R.inc(56741);while ((((it.hasNext())&&(__CLR4_5_2175z175zlvha7iqh.R.iget(56742)!=0|true))||(__CLR4_5_2175z175zlvha7iqh.R.iget(56743)==0&false))) {{
            //Check this is just a date (no time component)
            __CLR4_5_2175z175zlvha7iqh.R.inc(56744);assertCalendarsEquals("", cal, DateUtils.truncate(cal, Calendar.DATE), 0);

            __CLR4_5_2175z175zlvha7iqh.R.inc(56745);last = cal;
            __CLR4_5_2175z175zlvha7iqh.R.inc(56746);cal = (Calendar) it.next();
            __CLR4_5_2175z175zlvha7iqh.R.inc(56747);count++;

            //Check that this is one day more than the last date
            __CLR4_5_2175z175zlvha7iqh.R.inc(56748);last.add(Calendar.DATE, 1);
            __CLR4_5_2175z175zlvha7iqh.R.inc(56749);assertCalendarsEquals("", last, cal, 0);
        }

        }__CLR4_5_2175z175zlvha7iqh.R.inc(56750);assertFalse("There were " + count + " days in this iterator", count % 7 != 0);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56751);assertCalendarsEquals("", end, cal, 0);
    }finally{__CLR4_5_2175z175zlvha7iqh.R.flushNeeded();}}

    /**
     * Used to check that Calendar objects are close enough
     * delta is in milliseconds
     */
    private static void assertCalendarsEquals(final String message, final Calendar cal1, final Calendar cal2, final long delta) {try{__CLR4_5_2175z175zlvha7iqh.R.inc(56752);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56753);assertFalse(message + " expected " + cal1.getTime() + " but got " + cal2.getTime(),
                Math.abs(cal1.getTime().getTime() - cal2.getTime().getTime()) > delta);
    }finally{__CLR4_5_2175z175zlvha7iqh.R.flushNeeded();}}

    @Test
    public void testLANG799() throws ParseException {__CLR4_5_2175z175zlvha7iqh.R.globalSliceStart(getClass().getName(),56754);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2kk17jy17si();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2175z175zlvha7iqh.R.rethrow($CLV_t2$);}finally{__CLR4_5_2175z175zlvha7iqh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsTest.testLANG799",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),56754,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2kk17jy17si() throws ParseException{try{__CLR4_5_2175z175zlvha7iqh.R.inc(56754);
        __CLR4_5_2175z175zlvha7iqh.R.inc(56755);DateUtils.parseDateStrictly("09 abril 2008 23:55:38 GMT", new Locale("es"), new String[]{"dd MMM yyyy HH:mm:ss zzz"});
    }finally{__CLR4_5_2175z175zlvha7iqh.R.flushNeeded();}}
}

