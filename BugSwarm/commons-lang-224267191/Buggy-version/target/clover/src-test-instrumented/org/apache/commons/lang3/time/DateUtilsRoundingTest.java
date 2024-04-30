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

import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 * These Unit-tests will check all possible extremes when using some rounding-methods of DateUtils.
 * The extremes are tested at the switch-point in milliseconds
 * 
 * According to the implementation SEMI_MONTH will either round/truncate to the 1st or 16th
 * When rounding Calendar.MONTH it depends on the number of days within that month.
 * A month with 28 days will be rounded up from the 15th
 * A month with 29 or 30 days will be rounded up from the 16th
 * A month with 31 days will be rounded up from the 17th
 * 
 * @since 3.0
 */
public class DateUtilsRoundingTest {static class __CLR4_5_216xd16xdlvha7ioo{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172763741L,8589935092L,55943,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    DateFormat dateTimeParser;
    
    Date januaryOneDate;
    Date targetYearDate;
    //No targetMonths, these must be tested for every type of month(28-31 days)
    Date targetDateDate, targetDayOfMonthDate, targetAmDate, targetPmDate;
    Date targetHourOfDayDate, targetHourDate;
    Date targetMinuteDate;
    Date targetSecondDate;
    Date targetMilliSecondDate;

    Calendar januaryOneCalendar;
    @SuppressWarnings("deprecation")
    FastDateFormat fdf = DateFormatUtils.ISO_DATETIME_FORMAT;


    @Before
    public void setUp() throws Exception {try{__CLR4_5_216xd16xdlvha7ioo.R.inc(55633);

        __CLR4_5_216xd16xdlvha7ioo.R.inc(55634);dateTimeParser = new SimpleDateFormat("MMM dd, yyyy H:mm:ss.SSS", Locale.ENGLISH);
        
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55635);targetYearDate = dateTimeParser.parse("January 1, 2007 0:00:00.000");
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55636);targetDateDate = targetDayOfMonthDate = dateTimeParser.parse("June 1, 2008 0:00:00.000");
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55637);targetAmDate =  dateTimeParser.parse("June 1, 2008 0:00:00.000");
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55638);targetPmDate = dateTimeParser.parse("June 1, 2008 12:00:00.000");
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55639);targetHourDate = dateTimeParser.parse("June 1, 2008 8:00:00.000");
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55640);targetHourOfDayDate = dateTimeParser.parse("June 1, 2008 8:00:00.000");
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55641);targetMinuteDate =  dateTimeParser.parse("June 1, 2008 8:15:00.000");
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55642);targetSecondDate =  dateTimeParser.parse("June 1, 2008 8:15:14.000");
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55643);targetMilliSecondDate =  dateTimeParser.parse("June 1, 2008 8:15:14.231");
        
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55644);januaryOneDate = dateTimeParser.parse("January 1, 2008 0:00:00.000");
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55645);januaryOneCalendar = Calendar.getInstance();
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55646);januaryOneCalendar.setTime(januaryOneDate);
    }finally{__CLR4_5_216xd16xdlvha7ioo.R.flushNeeded();}}

    /**
     * Tests DateUtils.round()-method with Calendar.Year
     * 
     * @throws Exception so we don't have to catch it
     * @since 3.0
     */
    @Test
    public void testRoundYear() throws Exception {__CLR4_5_216xd16xdlvha7ioo.R.globalSliceStart(getClass().getName(),55647);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2mx3s016xr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_216xd16xdlvha7ioo.R.rethrow($CLV_t2$);}finally{__CLR4_5_216xd16xdlvha7ioo.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsRoundingTest.testRoundYear",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),55647,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2mx3s016xr() throws Exception{try{__CLR4_5_216xd16xdlvha7ioo.R.inc(55647);
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55648);final int calendarField = Calendar.YEAR;
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55649);final Date roundedUpDate = dateTimeParser.parse("January 1, 2008 0:00:00.000");
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55650);final Date roundedDownDate = targetYearDate;
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55651);final Date lastRoundedDownDate = dateTimeParser.parse("June 30, 2007 23:59:59.999");
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55652);baseRoundTest(roundedUpDate, roundedDownDate, lastRoundedDownDate,  calendarField);
    }finally{__CLR4_5_216xd16xdlvha7ioo.R.flushNeeded();}}
    
    /**
     * Tests DateUtils.round()-method with Calendar.MONTH
     * Includes rounding months with 28, 29, 30 and 31 days
     * Includes rounding to January 1
     * 
     * @throws Exception so we don't have to catch it
     * @since 3.0
     */
    @Test
    public void testRoundMonth() throws Exception {__CLR4_5_216xd16xdlvha7ioo.R.globalSliceStart(getClass().getName(),55653);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ynx85116xx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_216xd16xdlvha7ioo.R.rethrow($CLV_t2$);}finally{__CLR4_5_216xd16xdlvha7ioo.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsRoundingTest.testRoundMonth",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),55653,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ynx85116xx() throws Exception{try{__CLR4_5_216xd16xdlvha7ioo.R.inc(55653);
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55654);final int calendarField = Calendar.MONTH;
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55655);Date roundedUpDate, roundedDownDate, lastRoundedDownDate;
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55656);Date minDate, maxDate;
        
        //month with 28 days
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55657);roundedUpDate = dateTimeParser.parse("March 1, 2007 0:00:00.000");
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55658);roundedDownDate = dateTimeParser.parse("February 1, 2007 0:00:00.000");
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55659);lastRoundedDownDate = dateTimeParser.parse("February 14, 2007 23:59:59.999");
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55660);baseRoundTest(roundedUpDate, roundedDownDate, lastRoundedDownDate,  calendarField);

        //month with 29 days
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55661);roundedUpDate = dateTimeParser.parse("March 1, 2008 0:00:00.000");
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55662);roundedDownDate = dateTimeParser.parse("February 1, 2008 0:00:00.000");
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55663);lastRoundedDownDate = dateTimeParser.parse("February 15, 2008 23:59:59.999");
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55664);baseRoundTest(roundedUpDate, roundedDownDate, lastRoundedDownDate,  calendarField);
        
        //month with 30 days
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55665);roundedUpDate = dateTimeParser.parse("May 1, 2008 0:00:00.000");
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55666);roundedDownDate = dateTimeParser.parse("April 1, 2008 0:00:00.000");
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55667);lastRoundedDownDate = dateTimeParser.parse("April 15, 2008 23:59:59.999");
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55668);baseRoundTest(roundedUpDate, roundedDownDate, lastRoundedDownDate,  calendarField);
        
        //month with 31 days
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55669);roundedUpDate = dateTimeParser.parse("June 1, 2008 0:00:00.000");
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55670);roundedDownDate = dateTimeParser.parse("May 1, 2008 0:00:00.000");
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55671);lastRoundedDownDate = dateTimeParser.parse("May 16, 2008 23:59:59.999");
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55672);baseRoundTest(roundedUpDate, roundedDownDate, lastRoundedDownDate,  calendarField);
        
        //round to January 1
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55673);minDate = dateTimeParser.parse("December 17, 2007 00:00:00.000");
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55674);maxDate = dateTimeParser.parse("January 16, 2008 23:59:59.999");
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55675);roundToJanuaryFirst(minDate, maxDate, calendarField);
    }finally{__CLR4_5_216xd16xdlvha7ioo.R.flushNeeded();}}
    
    /**
     * Tests DateUtils.round()-method with DateUtils.SEMI_MONTH
     * Includes rounding months with 28, 29, 30 and 31 days, each with first and second half 
     * Includes rounding to January 1
     *      
     * @throws Exception so we don't have to catch it
     * @since 3.0
     */
    @Test
    public void testRoundSemiMonth() throws Exception {__CLR4_5_216xd16xdlvha7ioo.R.globalSliceStart(getClass().getName(),55676);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2qn6yrh16yk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_216xd16xdlvha7ioo.R.rethrow($CLV_t2$);}finally{__CLR4_5_216xd16xdlvha7ioo.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsRoundingTest.testRoundSemiMonth",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),55676,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2qn6yrh16yk() throws Exception{try{__CLR4_5_216xd16xdlvha7ioo.R.inc(55676);
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55677);final int calendarField = DateUtils.SEMI_MONTH;
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55678);Date roundedUpDate, roundedDownDate, lastRoundedDownDate;
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55679);Date minDate, maxDate;
        
        //month with 28 days (1)
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55680);roundedUpDate = dateTimeParser.parse("February 16, 2007 0:00:00.000");
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55681);roundedDownDate = dateTimeParser.parse("February 1, 2007 0:00:00.000");
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55682);lastRoundedDownDate = dateTimeParser.parse("February 8, 2007 23:59:59.999");
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55683);baseRoundTest(roundedUpDate, roundedDownDate, lastRoundedDownDate,  calendarField);

        //month with 28 days (2)
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55684);roundedUpDate = dateTimeParser.parse("March 1, 2007 0:00:00.000");
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55685);roundedDownDate = dateTimeParser.parse("February 16, 2007 0:00:00.000");
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55686);lastRoundedDownDate = dateTimeParser.parse("February 23, 2007 23:59:59.999");
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55687);baseRoundTest(roundedUpDate, roundedDownDate, lastRoundedDownDate,  calendarField);

        //month with 29 days (1)
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55688);roundedUpDate = dateTimeParser.parse("February 16, 2008 0:00:00.000");
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55689);roundedDownDate = dateTimeParser.parse("February 1, 2008 0:00:00.000");
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55690);lastRoundedDownDate = dateTimeParser.parse("February 8, 2008 23:59:59.999");
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55691);baseRoundTest(roundedUpDate, roundedDownDate, lastRoundedDownDate,  calendarField);
        
        //month with 29 days (2)
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55692);roundedUpDate = dateTimeParser.parse("March 1, 2008 0:00:00.000");
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55693);roundedDownDate = dateTimeParser.parse("February 16, 2008 0:00:00.000");
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55694);lastRoundedDownDate = dateTimeParser.parse("February 23, 2008 23:59:59.999");
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55695);baseRoundTest(roundedUpDate, roundedDownDate, lastRoundedDownDate,  calendarField);

        //month with 30 days (1)
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55696);roundedUpDate = dateTimeParser.parse("April 16, 2008 0:00:00.000");
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55697);roundedDownDate = dateTimeParser.parse("April 1, 2008 0:00:00.000");
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55698);lastRoundedDownDate = dateTimeParser.parse("April 8, 2008 23:59:59.999");
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55699);baseRoundTest(roundedUpDate, roundedDownDate, lastRoundedDownDate,  calendarField);

        //month with 30 days (2)
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55700);roundedUpDate = dateTimeParser.parse("May 1, 2008 0:00:00.000");
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55701);roundedDownDate = dateTimeParser.parse("April 16, 2008 0:00:00.000");
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55702);lastRoundedDownDate = dateTimeParser.parse("April 23, 2008 23:59:59.999");
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55703);baseRoundTest(roundedUpDate, roundedDownDate, lastRoundedDownDate,  calendarField);
        
        //month with 31 days (1)
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55704);roundedUpDate = dateTimeParser.parse("May 16, 2008 0:00:00.000");
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55705);roundedDownDate = dateTimeParser.parse("May 1, 2008 0:00:00.000");
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55706);lastRoundedDownDate = dateTimeParser.parse("May 8, 2008 23:59:59.999");
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55707);baseRoundTest(roundedUpDate, roundedDownDate, lastRoundedDownDate,  calendarField);

        //month with 31 days (2)
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55708);roundedUpDate = dateTimeParser.parse("June 1, 2008 0:00:00.000");
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55709);roundedDownDate = dateTimeParser.parse("May 16, 2008 0:00:00.000");
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55710);lastRoundedDownDate = dateTimeParser.parse("May 23, 2008 23:59:59.999");
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55711);baseRoundTest(roundedUpDate, roundedDownDate, lastRoundedDownDate,  calendarField);
        
        //round to January 1
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55712);minDate = dateTimeParser.parse("December 24, 2007 00:00:00.000");
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55713);maxDate = dateTimeParser.parse("January 8, 2008 23:59:59.999");
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55714);roundToJanuaryFirst(minDate, maxDate, calendarField);
    }finally{__CLR4_5_216xd16xdlvha7ioo.R.flushNeeded();}}
    
    /**
     * Tests DateUtils.round()-method with Calendar.DATE
     * Includes rounding the extremes of one day 
     * Includes rounding to January 1
     * 
     * @throws Exception so we don't have to catch it
     * @since 3.0
     */
    @Test
    public void testRoundDate() throws Exception {__CLR4_5_216xd16xdlvha7ioo.R.globalSliceStart(getClass().getName(),55715);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_227regh16zn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_216xd16xdlvha7ioo.R.rethrow($CLV_t2$);}finally{__CLR4_5_216xd16xdlvha7ioo.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsRoundingTest.testRoundDate",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),55715,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_227regh16zn() throws Exception{try{__CLR4_5_216xd16xdlvha7ioo.R.inc(55715);
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55716);final int calendarField = Calendar.DATE;
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55717);Date roundedUpDate, roundedDownDate, lastRoundedDownDate;
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55718);Date minDate, maxDate;

        __CLR4_5_216xd16xdlvha7ioo.R.inc(55719);roundedUpDate = dateTimeParser.parse("June 2, 2008 0:00:00.000");
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55720);roundedDownDate = targetDateDate;
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55721);lastRoundedDownDate = dateTimeParser.parse("June 1, 2008 11:59:59.999");
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55722);baseRoundTest(roundedUpDate, roundedDownDate, lastRoundedDownDate,  calendarField);
        
        //round to January 1
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55723);minDate = dateTimeParser.parse("December 31, 2007 12:00:00.000");
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55724);maxDate = dateTimeParser.parse("January 1, 2008 11:59:59.999");
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55725);roundToJanuaryFirst(minDate, maxDate, calendarField);
    }finally{__CLR4_5_216xd16xdlvha7ioo.R.flushNeeded();}}
    
    /**
     * Tests DateUtils.round()-method with Calendar.DAY_OF_MONTH
     * Includes rounding the extremes of one day 
     * Includes rounding to January 1
     * 
     * @throws Exception so we don't have to catch it
     * @since 3.0
     */
    @Test
    public void testRoundDayOfMonth() throws Exception {__CLR4_5_216xd16xdlvha7ioo.R.globalSliceStart(getClass().getName(),55726);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vjbg2816zy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_216xd16xdlvha7ioo.R.rethrow($CLV_t2$);}finally{__CLR4_5_216xd16xdlvha7ioo.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsRoundingTest.testRoundDayOfMonth",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),55726,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vjbg2816zy() throws Exception{try{__CLR4_5_216xd16xdlvha7ioo.R.inc(55726);
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55727);final int calendarField = Calendar.DAY_OF_MONTH;
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55728);Date roundedUpDate, roundedDownDate, lastRoundedDownDate;
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55729);Date minDate, maxDate;

        __CLR4_5_216xd16xdlvha7ioo.R.inc(55730);roundedUpDate = dateTimeParser.parse("June 2, 2008 0:00:00.000");
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55731);roundedDownDate = targetDayOfMonthDate;
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55732);lastRoundedDownDate = dateTimeParser.parse("June 1, 2008 11:59:59.999");
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55733);baseRoundTest(roundedUpDate, roundedDownDate, lastRoundedDownDate,  calendarField);
        
        //round to January 1
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55734);minDate = dateTimeParser.parse("December 31, 2007 12:00:00.000");
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55735);maxDate = dateTimeParser.parse("January 1, 2008 11:59:59.999");
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55736);roundToJanuaryFirst(minDate, maxDate, calendarField);
    }finally{__CLR4_5_216xd16xdlvha7ioo.R.flushNeeded();}}
    
    /**
     * Tests DateUtils.round()-method with Calendar.AM_PM
     * Includes rounding the extremes of both AM and PM of one day 
     * Includes rounding to January 1
     * 
     * @throws Exception so we don't have to catch it
     * @since 3.0
     */
    @Test
    public void testRoundAmPm() throws Exception {__CLR4_5_216xd16xdlvha7ioo.R.globalSliceStart(getClass().getName(),55737);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gcqt3o1709();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_216xd16xdlvha7ioo.R.rethrow($CLV_t2$);}finally{__CLR4_5_216xd16xdlvha7ioo.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsRoundingTest.testRoundAmPm",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),55737,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gcqt3o1709() throws Exception{try{__CLR4_5_216xd16xdlvha7ioo.R.inc(55737);
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55738);final int calendarField = Calendar.AM_PM;
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55739);Date roundedUpDate, roundedDownDate, lastRoundedDownDate;
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55740);Date minDate, maxDate;

        //AM
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55741);roundedUpDate = dateTimeParser.parse("June 1, 2008 12:00:00.000");
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55742);roundedDownDate = targetAmDate;
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55743);lastRoundedDownDate = dateTimeParser.parse("June 1, 2008 5:59:59.999");
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55744);baseRoundTest(roundedUpDate, roundedDownDate, lastRoundedDownDate,  calendarField);

        //PM
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55745);roundedUpDate = dateTimeParser.parse("June 2, 2008 0:00:00.000");
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55746);roundedDownDate = targetPmDate;
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55747);lastRoundedDownDate = dateTimeParser.parse("June 1, 2008 17:59:59.999");
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55748);baseRoundTest(roundedUpDate, roundedDownDate, lastRoundedDownDate,  calendarField);

        //round to January 1
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55749);minDate = dateTimeParser.parse("December 31, 2007 18:00:00.000");
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55750);maxDate = dateTimeParser.parse("January 1, 2008 5:59:59.999");
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55751);roundToJanuaryFirst(minDate, maxDate, calendarField);
    }finally{__CLR4_5_216xd16xdlvha7ioo.R.flushNeeded();}}
    
    /**
     * Tests DateUtils.round()-method with Calendar.HOUR_OF_DAY
     * Includes rounding the extremes of one hour 
     * Includes rounding to January 1
     * 
     * @throws Exception so we don't have to catch it
     * @since 3.0
     */
    @Test
    public void testRoundHourOfDay() throws Exception {__CLR4_5_216xd16xdlvha7ioo.R.globalSliceStart(getClass().getName(),55752);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ccjbu4170o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_216xd16xdlvha7ioo.R.rethrow($CLV_t2$);}finally{__CLR4_5_216xd16xdlvha7ioo.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsRoundingTest.testRoundHourOfDay",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),55752,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ccjbu4170o() throws Exception{try{__CLR4_5_216xd16xdlvha7ioo.R.inc(55752);
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55753);final int calendarField = Calendar.HOUR_OF_DAY;
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55754);Date roundedUpDate, roundedDownDate, lastRoundedDownDate;
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55755);Date minDate, maxDate;

        __CLR4_5_216xd16xdlvha7ioo.R.inc(55756);roundedUpDate = dateTimeParser.parse("June 1, 2008 9:00:00.000");
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55757);roundedDownDate = targetHourOfDayDate;
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55758);lastRoundedDownDate = dateTimeParser.parse("June 1, 2008 8:29:59.999");
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55759);baseRoundTest(roundedUpDate, roundedDownDate, lastRoundedDownDate,  calendarField);
        
        //round to January 1
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55760);minDate = dateTimeParser.parse("December 31, 2007 23:30:00.000");
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55761);maxDate = dateTimeParser.parse("January 1, 2008 0:29:59.999");
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55762);roundToJanuaryFirst(minDate, maxDate, calendarField);
    }finally{__CLR4_5_216xd16xdlvha7ioo.R.flushNeeded();}}
    
    /**
     * Tests DateUtils.round()-method with Calendar.HOUR
     * Includes rounding the extremes of one hour 
     * Includes rounding to January 1
     * 
     * @throws Exception so we don't have to catch it
     * @since 3.0
     */
    @Test
    public void testRoundHour() throws Exception {__CLR4_5_216xd16xdlvha7ioo.R.globalSliceStart(getClass().getName(),55763);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27bp9y1170z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_216xd16xdlvha7ioo.R.rethrow($CLV_t2$);}finally{__CLR4_5_216xd16xdlvha7ioo.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsRoundingTest.testRoundHour",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),55763,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27bp9y1170z() throws Exception{try{__CLR4_5_216xd16xdlvha7ioo.R.inc(55763);
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55764);final int calendarField = Calendar.HOUR;
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55765);Date roundedUpDate, roundedDownDate, lastRoundedDownDate;
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55766);Date minDate, maxDate;

        __CLR4_5_216xd16xdlvha7ioo.R.inc(55767);roundedUpDate = dateTimeParser.parse("June 1, 2008 9:00:00.000");
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55768);roundedDownDate = targetHourDate;
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55769);lastRoundedDownDate = dateTimeParser.parse("June 1, 2008 8:29:59.999");
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55770);baseRoundTest(roundedUpDate, roundedDownDate, lastRoundedDownDate,  calendarField);
        
        //round to January 1
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55771);minDate = dateTimeParser.parse("December 31, 2007 23:30:00.000");
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55772);maxDate = dateTimeParser.parse("January 1, 2008 0:29:59.999");
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55773);roundToJanuaryFirst(minDate, maxDate, calendarField);
    }finally{__CLR4_5_216xd16xdlvha7ioo.R.flushNeeded();}}
    
    /**
     * Tests DateUtils.round()-method with Calendar.MINUTE
     * Includes rounding the extremes of one minute 
     * Includes rounding to January 1
     * 
     * @throws Exception so we don't have to catch it
     * @since 3.0
     */
    @Test
    public void testRoundMinute() throws Exception {__CLR4_5_216xd16xdlvha7ioo.R.globalSliceStart(getClass().getName(),55774);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26i5uvr171a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_216xd16xdlvha7ioo.R.rethrow($CLV_t2$);}finally{__CLR4_5_216xd16xdlvha7ioo.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsRoundingTest.testRoundMinute",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),55774,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26i5uvr171a() throws Exception{try{__CLR4_5_216xd16xdlvha7ioo.R.inc(55774);
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55775);final int calendarField = Calendar.MINUTE;
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55776);Date roundedUpDate, roundedDownDate, lastRoundedDownDate;
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55777);Date minDate, maxDate;

        __CLR4_5_216xd16xdlvha7ioo.R.inc(55778);roundedUpDate = dateTimeParser.parse("June 1, 2008 8:16:00.000");
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55779);roundedDownDate = targetMinuteDate;
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55780);lastRoundedDownDate = dateTimeParser.parse("June 1, 2008 8:15:29.999");
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55781);baseRoundTest(roundedUpDate, roundedDownDate, lastRoundedDownDate,  calendarField);
        
        //round to January 1
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55782);minDate = dateTimeParser.parse("December 31, 2007 23:59:30.000");
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55783);maxDate = dateTimeParser.parse("January 1, 2008 0:00:29.999");
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55784);roundToJanuaryFirst(minDate, maxDate, calendarField);
    }finally{__CLR4_5_216xd16xdlvha7ioo.R.flushNeeded();}}
    
    /**
     * Tests DateUtils.round()-method with Calendar.SECOND
     * Includes rounding the extremes of one second 
     * Includes rounding to January 1
     * 
     * @throws Exception so we don't have to catch it
     * @since 3.0
     */
    @Test
    public void testRoundSecond() throws Exception {__CLR4_5_216xd16xdlvha7ioo.R.globalSliceStart(getClass().getName(),55785);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2rixxx3171l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_216xd16xdlvha7ioo.R.rethrow($CLV_t2$);}finally{__CLR4_5_216xd16xdlvha7ioo.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsRoundingTest.testRoundSecond",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),55785,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2rixxx3171l() throws Exception{try{__CLR4_5_216xd16xdlvha7ioo.R.inc(55785);
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55786);final int calendarField = Calendar.SECOND;
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55787);Date roundedUpDate, roundedDownDate, lastRoundedDownDate;
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55788);Date minDate, maxDate;

        __CLR4_5_216xd16xdlvha7ioo.R.inc(55789);roundedUpDate = dateTimeParser.parse("June 1, 2008 8:15:15.000");
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55790);roundedDownDate = targetSecondDate;
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55791);lastRoundedDownDate = dateTimeParser.parse("June 1, 2008 8:15:14.499");
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55792);baseRoundTest(roundedUpDate, roundedDownDate, lastRoundedDownDate,  calendarField);
        
        //round to January 1
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55793);minDate = dateTimeParser.parse("December 31, 2007 23:59:59.500");
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55794);maxDate = dateTimeParser.parse("January 1, 2008 0:00:00.499");
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55795);roundToJanuaryFirst(minDate, maxDate, calendarField);
    }finally{__CLR4_5_216xd16xdlvha7ioo.R.flushNeeded();}}
    
    /**
     * Tests DateUtils.round()-method with Calendar.MILLISECOND
     * Includes rounding the extremes of one second 
     * Includes rounding to January 1
     * 
     * @throws Exception so we don't have to catch it
     * @since 3.0
     */
    @Test
    public void testRoundMilliSecond() throws Exception {__CLR4_5_216xd16xdlvha7ioo.R.globalSliceStart(getClass().getName(),55796);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26ddb3o171w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_216xd16xdlvha7ioo.R.rethrow($CLV_t2$);}finally{__CLR4_5_216xd16xdlvha7ioo.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsRoundingTest.testRoundMilliSecond",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),55796,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26ddb3o171w() throws Exception{try{__CLR4_5_216xd16xdlvha7ioo.R.inc(55796);
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55797);final int calendarField = Calendar.MILLISECOND;
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55798);Date roundedUpDate, roundedDownDate, lastRoundedDownDate;
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55799);Date minDate, maxDate;

        __CLR4_5_216xd16xdlvha7ioo.R.inc(55800);roundedDownDate = lastRoundedDownDate = targetMilliSecondDate;
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55801);roundedUpDate = dateTimeParser.parse("June 1, 2008 8:15:14.232");
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55802);baseRoundTest(roundedUpDate, roundedDownDate, lastRoundedDownDate,  calendarField);
        
        //round to January 1
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55803);minDate = maxDate = januaryOneDate;
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55804);roundToJanuaryFirst(minDate, maxDate, calendarField);
    }finally{__CLR4_5_216xd16xdlvha7ioo.R.flushNeeded();}}
    
    /**
     * Test DateUtils.truncate()-method with Calendar.YEAR
     * 
     * @throws Exception so we don't have to catch it
     * @since 3.0
     */
    @Test
    public void testTruncateYear() throws Exception {__CLR4_5_216xd16xdlvha7ioo.R.globalSliceStart(getClass().getName(),55805);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2dpusyk1725();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_216xd16xdlvha7ioo.R.rethrow($CLV_t2$);}finally{__CLR4_5_216xd16xdlvha7ioo.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsRoundingTest.testTruncateYear",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),55805,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2dpusyk1725() throws Exception{try{__CLR4_5_216xd16xdlvha7ioo.R.inc(55805);
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55806);final int calendarField = Calendar.YEAR;
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55807);final Date lastTruncateDate = dateTimeParser.parse("December 31, 2007 23:59:59.999");
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55808);baseTruncateTest(targetYearDate, lastTruncateDate, calendarField);
    }finally{__CLR4_5_216xd16xdlvha7ioo.R.flushNeeded();}}

    /**
     * Test DateUtils.truncate()-method with Calendar.MONTH
     * 
     * @throws Exception so we don't have to catch it
     * @since 3.0
     */
    @Test
    public void testTruncateMonth() throws Exception {__CLR4_5_216xd16xdlvha7ioo.R.globalSliceStart(getClass().getName(),55809);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2fukd4h1729();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_216xd16xdlvha7ioo.R.rethrow($CLV_t2$);}finally{__CLR4_5_216xd16xdlvha7ioo.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsRoundingTest.testTruncateMonth",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),55809,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2fukd4h1729() throws Exception{try{__CLR4_5_216xd16xdlvha7ioo.R.inc(55809);
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55810);final int calendarField = Calendar.MONTH;
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55811);final Date truncatedDate = dateTimeParser.parse("March 1, 2008 0:00:00.000");
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55812);final Date lastTruncateDate = dateTimeParser.parse("March 31, 2008 23:59:59.999");
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55813);baseTruncateTest(truncatedDate, lastTruncateDate, calendarField);
    }finally{__CLR4_5_216xd16xdlvha7ioo.R.flushNeeded();}}

    /**
     * Test DateUtils.truncate()-method with DateUtils.SEMI_MONTH
     * Includes truncating months with 28, 29, 30 and 31 days, each with first and second half
     * 
     * @throws Exception so we don't have to catch it
     * @since 3.0
     */
    @Test
    public void testTruncateSemiMonth() throws Exception {__CLR4_5_216xd16xdlvha7ioo.R.globalSliceStart(getClass().getName(),55814);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2dem3y9172e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_216xd16xdlvha7ioo.R.rethrow($CLV_t2$);}finally{__CLR4_5_216xd16xdlvha7ioo.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsRoundingTest.testTruncateSemiMonth",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),55814,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2dem3y9172e() throws Exception{try{__CLR4_5_216xd16xdlvha7ioo.R.inc(55814);
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55815);final int calendarField = DateUtils.SEMI_MONTH;
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55816);Date truncatedDate, lastTruncateDate;
        
        //month with 28 days (1)
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55817);truncatedDate = dateTimeParser.parse("February 1, 2007 0:00:00.000");
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55818);lastTruncateDate = dateTimeParser.parse("February 15, 2007 23:59:59.999");
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55819);baseTruncateTest(truncatedDate, lastTruncateDate, calendarField);

        //month with 28 days (2)
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55820);truncatedDate = dateTimeParser.parse("February 16, 2007 0:00:00.000");
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55821);lastTruncateDate = dateTimeParser.parse("February 28, 2007 23:59:59.999");
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55822);baseTruncateTest(truncatedDate, lastTruncateDate, calendarField);

        //month with 29 days (1)
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55823);truncatedDate = dateTimeParser.parse("February 1, 2008 0:00:00.000");
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55824);lastTruncateDate = dateTimeParser.parse("February 15, 2008 23:59:59.999");
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55825);baseTruncateTest(truncatedDate, lastTruncateDate, calendarField);

        //month with 29 days (2)
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55826);truncatedDate = dateTimeParser.parse("February 16, 2008 0:00:00.000");
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55827);lastTruncateDate = dateTimeParser.parse("February 29, 2008 23:59:59.999");
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55828);baseTruncateTest(truncatedDate, lastTruncateDate, calendarField);

        //month with 30 days (1)
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55829);truncatedDate = dateTimeParser.parse("April 1, 2008 0:00:00.000");
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55830);lastTruncateDate = dateTimeParser.parse("April 15, 2008 23:59:59.999");
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55831);baseTruncateTest(truncatedDate, lastTruncateDate, calendarField);

        //month with 30 days (2)
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55832);truncatedDate = dateTimeParser.parse("April 16, 2008 0:00:00.000");
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55833);lastTruncateDate = dateTimeParser.parse("April 30, 2008 23:59:59.999");
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55834);baseTruncateTest(truncatedDate, lastTruncateDate, calendarField);
        
        //month with 31 days (1)
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55835);truncatedDate = dateTimeParser.parse("March 1, 2008 0:00:00.000");
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55836);lastTruncateDate = dateTimeParser.parse("March 15, 2008 23:59:59.999");
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55837);baseTruncateTest(truncatedDate, lastTruncateDate, calendarField);

        //month with 31 days (2)
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55838);truncatedDate = dateTimeParser.parse("March 16, 2008 0:00:00.000");
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55839);lastTruncateDate = dateTimeParser.parse("March 31, 2008 23:59:59.999");
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55840);baseTruncateTest(truncatedDate, lastTruncateDate, calendarField);

    }finally{__CLR4_5_216xd16xdlvha7ioo.R.flushNeeded();}}

    /**
     * Test DateUtils.truncate()-method with Calendar.DATE
     * 
     * @throws Exception so we don't have to catch it
     * @since 3.0
     */
    @Test
    public void testTruncateDate() throws Exception {__CLR4_5_216xd16xdlvha7ioo.R.globalSliceStart(getClass().getName(),55841);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gkjb711735();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_216xd16xdlvha7ioo.R.rethrow($CLV_t2$);}finally{__CLR4_5_216xd16xdlvha7ioo.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsRoundingTest.testTruncateDate",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),55841,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gkjb711735() throws Exception{try{__CLR4_5_216xd16xdlvha7ioo.R.inc(55841);
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55842);final int calendarField = Calendar.DATE;
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55843);final Date lastTruncateDate = dateTimeParser.parse("June 1, 2008 23:59:59.999");
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55844);baseTruncateTest(targetDateDate, lastTruncateDate, calendarField);
    }finally{__CLR4_5_216xd16xdlvha7ioo.R.flushNeeded();}}
    
    /**
     * Test DateUtils.truncate()-method with Calendar.DAY_OF_MONTH
     * 
     * @throws Exception so we don't have to catch it
     * @since 3.0
     */
    @Test
    public void testTruncateDayOfMonth() throws Exception {__CLR4_5_216xd16xdlvha7ioo.R.globalSliceStart(getClass().getName(),55845);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2np2t841739();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_216xd16xdlvha7ioo.R.rethrow($CLV_t2$);}finally{__CLR4_5_216xd16xdlvha7ioo.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsRoundingTest.testTruncateDayOfMonth",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),55845,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2np2t841739() throws Exception{try{__CLR4_5_216xd16xdlvha7ioo.R.inc(55845);
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55846);final int calendarField = Calendar.DAY_OF_MONTH;
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55847);final Date lastTruncateDate = dateTimeParser.parse("June 1, 2008 23:59:59.999");
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55848);baseTruncateTest(targetDayOfMonthDate, lastTruncateDate, calendarField);
    }finally{__CLR4_5_216xd16xdlvha7ioo.R.flushNeeded();}}
    
    /**
     * Test DateUtils.truncate()-method with Calendar.AM_PM
     * Includes truncating the extremes of both AM and PM of one day 
     * 
     * @throws Exception so we don't have to catch it
     * @since 3.0
     */
    @Test
    public void testTruncateAmPm() throws Exception {__CLR4_5_216xd16xdlvha7ioo.R.globalSliceStart(getClass().getName(),55849);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21zywd4173d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_216xd16xdlvha7ioo.R.rethrow($CLV_t2$);}finally{__CLR4_5_216xd16xdlvha7ioo.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsRoundingTest.testTruncateAmPm",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),55849,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21zywd4173d() throws Exception{try{__CLR4_5_216xd16xdlvha7ioo.R.inc(55849);
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55850);final int calendarField = Calendar.AM_PM;
        
        //AM
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55851);Date lastTruncateDate = dateTimeParser.parse("June 1, 2008 11:59:59.999");
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55852);baseTruncateTest(targetAmDate, lastTruncateDate, calendarField);

        //PM
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55853);lastTruncateDate = dateTimeParser.parse("June 1, 2008 23:59:59.999");
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55854);baseTruncateTest(targetPmDate, lastTruncateDate, calendarField);
    }finally{__CLR4_5_216xd16xdlvha7ioo.R.flushNeeded();}}
    
    /**
     * Test DateUtils.truncate()-method with Calendar.HOUR
     * 
     * @throws Exception so we don't have to catch it
     * @since 3.0
     */
    @Test
    public void testTruncateHour() throws Exception {__CLR4_5_216xd16xdlvha7ioo.R.globalSliceStart(getClass().getName(),55855);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2712msj173j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_216xd16xdlvha7ioo.R.rethrow($CLV_t2$);}finally{__CLR4_5_216xd16xdlvha7ioo.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsRoundingTest.testTruncateHour",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),55855,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2712msj173j() throws Exception{try{__CLR4_5_216xd16xdlvha7ioo.R.inc(55855);
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55856);final int calendarField = Calendar.HOUR;
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55857);final Date lastTruncateDate = dateTimeParser.parse("June 1, 2008 8:59:59.999");
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55858);baseTruncateTest(targetHourDate, lastTruncateDate, calendarField);
    }finally{__CLR4_5_216xd16xdlvha7ioo.R.flushNeeded();}}
    
    /**
     * Test DateUtils.truncate()-method with Calendar.HOUR_OF_DAY
     * 
     * @throws Exception so we don't have to catch it
     * @since 3.0
     */
    @Test
    public void testTruncateHourOfDay() throws Exception {__CLR4_5_216xd16xdlvha7ioo.R.globalSliceStart(getClass().getName(),55859);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2w1iz4173n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_216xd16xdlvha7ioo.R.rethrow($CLV_t2$);}finally{__CLR4_5_216xd16xdlvha7ioo.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsRoundingTest.testTruncateHourOfDay",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),55859,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2w1iz4173n() throws Exception{try{__CLR4_5_216xd16xdlvha7ioo.R.inc(55859);
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55860);final int calendarField = Calendar.HOUR_OF_DAY;
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55861);final Date lastTruncateDate = dateTimeParser.parse("June 1, 2008 8:59:59.999");
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55862);baseTruncateTest(targetHourOfDayDate, lastTruncateDate, calendarField);
    }finally{__CLR4_5_216xd16xdlvha7ioo.R.flushNeeded();}}
    
    /**
     * Test DateUtils.truncate()-method with Calendar.MINUTE
     * 
     * @throws Exception so we don't have to catch it
     * @since 3.0
     */
    @Test
    public void testTruncateMinute() throws Exception {__CLR4_5_216xd16xdlvha7ioo.R.globalSliceStart(getClass().getName(),55863);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ljc4k3173r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_216xd16xdlvha7ioo.R.rethrow($CLV_t2$);}finally{__CLR4_5_216xd16xdlvha7ioo.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsRoundingTest.testTruncateMinute",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),55863,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ljc4k3173r() throws Exception{try{__CLR4_5_216xd16xdlvha7ioo.R.inc(55863);
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55864);final int calendarField = Calendar.MINUTE;
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55865);final Date lastTruncateDate = dateTimeParser.parse("June 1, 2008 8:15:59.999");
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55866);baseTruncateTest(targetMinuteDate, lastTruncateDate, calendarField);
    }finally{__CLR4_5_216xd16xdlvha7ioo.R.flushNeeded();}}
    
    /**
     * Test DateUtils.truncate()-method with Calendar.SECOND
     * 
     * @throws Exception so we don't have to catch it
     * @since 3.0
     */
    @Test
    public void testTruncateSecond() throws Exception {__CLR4_5_216xd16xdlvha7ioo.R.globalSliceStart(getClass().getName(),55867);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2sgzudp173v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_216xd16xdlvha7ioo.R.rethrow($CLV_t2$);}finally{__CLR4_5_216xd16xdlvha7ioo.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsRoundingTest.testTruncateSecond",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),55867,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2sgzudp173v() throws Exception{try{__CLR4_5_216xd16xdlvha7ioo.R.inc(55867);
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55868);final int calendarField = Calendar.SECOND;
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55869);final Date lastTruncateDate = dateTimeParser.parse("June 1, 2008 8:15:14.999");
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55870);baseTruncateTest(targetSecondDate, lastTruncateDate, calendarField);
    }finally{__CLR4_5_216xd16xdlvha7ioo.R.flushNeeded();}}
    
    /**
     * Test DateUtils.truncate()-method with Calendar.SECOND
     * 
     * @throws Exception so we don't have to catch it
     * @since 3.0
     */
    @Test
    public void testTruncateMilliSecond() throws Exception {__CLR4_5_216xd16xdlvha7ioo.R.globalSliceStart(getClass().getName(),55871);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2duxzlc173z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_216xd16xdlvha7ioo.R.rethrow($CLV_t2$);}finally{__CLR4_5_216xd16xdlvha7ioo.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsRoundingTest.testTruncateMilliSecond",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),55871,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2duxzlc173z() throws Exception{try{__CLR4_5_216xd16xdlvha7ioo.R.inc(55871);
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55872);final int calendarField = Calendar.MILLISECOND;
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55873);baseTruncateTest(targetMilliSecondDate, targetMilliSecondDate, calendarField);
    }finally{__CLR4_5_216xd16xdlvha7ioo.R.flushNeeded();}}
        
    /**
     * When using this basetest all extremes are tested.<br> 
     * It will test the Date, Calendar and Object-implementation<br>
     * lastRoundDownDate should round down to roundedDownDate<br>
     * lastRoundDownDate + 1 millisecond should round up to roundedUpDate
     * 
     * @param roundedUpDate the next rounded date after <strong>roundedDownDate</strong> when using <strong>calendarField</strong>
     * @param roundedDownDate the result if <strong>lastRoundDownDate</strong> was rounded with <strong>calendarField</strong>
     * @param lastRoundDownDate rounding this value with <strong>calendarField</strong> will result in <strong>roundedDownDate</strong>
     * @param calendarField a Calendar.field value
     * @since 3.0
     */
    protected void baseRoundTest(final Date roundedUpDate, final Date roundedDownDate, final Date lastRoundDownDate, final int calendarField) {try{__CLR4_5_216xd16xdlvha7ioo.R.inc(55874);
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55875);final Date firstRoundUpDate = DateUtils.addMilliseconds(lastRoundDownDate, 1);
        
        //Date-comparison
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55876);assertEquals(roundedDownDate, DateUtils.round(roundedDownDate, calendarField));
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55877);assertEquals(roundedUpDate, DateUtils.round(roundedUpDate, calendarField));
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55878);assertEquals(roundedDownDate, DateUtils.round(lastRoundDownDate, calendarField));
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55879);assertEquals(roundedUpDate, DateUtils.round(firstRoundUpDate, calendarField));
        
        //Calendar-initiations
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55880);Calendar roundedUpCalendar, roundedDownCalendar, lastRoundDownCalendar, firstRoundUpCalendar; 
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55881);roundedDownCalendar = Calendar.getInstance();
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55882);roundedUpCalendar = Calendar.getInstance();
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55883);lastRoundDownCalendar = Calendar.getInstance();
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55884);firstRoundUpCalendar = Calendar.getInstance();
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55885);roundedDownCalendar.setTime(roundedDownDate);
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55886);roundedUpCalendar.setTime(roundedUpDate);
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55887);lastRoundDownCalendar.setTime(lastRoundDownDate);
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55888);firstRoundUpCalendar.setTime(firstRoundUpDate);

        //Calendar-comparison
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55889);assertEquals(roundedDownCalendar, DateUtils.round(roundedDownCalendar, calendarField));
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55890);assertEquals(roundedUpCalendar, DateUtils.round(roundedUpCalendar, calendarField));
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55891);assertEquals(roundedDownCalendar, DateUtils.round(lastRoundDownCalendar, calendarField));
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55892);assertEquals(roundedUpCalendar, DateUtils.round(firstRoundUpCalendar, calendarField));

        //Object-comparison
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55893);assertEquals(roundedDownDate, DateUtils.round((Object) roundedDownDate, calendarField));
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55894);assertEquals(roundedUpDate, DateUtils.round((Object) roundedUpDate, calendarField));
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55895);assertEquals(roundedDownDate, DateUtils.round((Object) lastRoundDownDate, calendarField));
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55896);assertEquals(roundedUpDate, DateUtils.round((Object) firstRoundUpDate, calendarField));
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55897);assertEquals(roundedDownDate, DateUtils.round((Object) roundedDownCalendar, calendarField));
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55898);assertEquals(roundedUpDate, DateUtils.round((Object) roundedUpCalendar, calendarField));
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55899);assertEquals(roundedDownDate, DateUtils.round((Object) lastRoundDownDate, calendarField));
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55900);assertEquals(roundedUpDate, DateUtils.round((Object) firstRoundUpDate, calendarField));
    }finally{__CLR4_5_216xd16xdlvha7ioo.R.flushNeeded();}}
    
    /**
     * When using this basetest all extremes are tested.<br> 
     * It will test the Date, Calendar and Object-implementation<br>
     * lastTruncateDate should round down to truncatedDate<br>
     * lastTruncateDate + 1 millisecond should never round down to truncatedDate
     * 
     * @param truncatedDate expected Date when <strong>lastTruncateDate</strong> is truncated with <strong>calendarField</strong>
     * @param lastTruncateDate the last possible Date which will truncate to <strong>truncatedDate</strong> with <strong>calendarField</strong>
     * @param calendarField a Calendar.field value
     * @since 3.0
     */
    protected void baseTruncateTest(final Date truncatedDate, final Date lastTruncateDate, final int calendarField) {try{__CLR4_5_216xd16xdlvha7ioo.R.inc(55901);
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55902);final Date nextTruncateDate = DateUtils.addMilliseconds(lastTruncateDate, 1);
        
        //Date-comparison
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55903);assertEquals("Truncating "+ fdf.format(truncatedDate) +" as Date with CalendarField-value "+ calendarField +" must return itself", truncatedDate, DateUtils.truncate(truncatedDate, calendarField));
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55904);assertEquals(truncatedDate, DateUtils.truncate(lastTruncateDate, calendarField));
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55905);assertFalse(fdf.format(lastTruncateDate) +" is not an extreme when truncating as Date with CalendarField-value "+ calendarField, truncatedDate.equals(DateUtils.truncate(nextTruncateDate, calendarField)));
        
        //Calendar-initiations
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55906);Calendar truncatedCalendar, lastTruncateCalendar, nextTruncateCalendar; 
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55907);truncatedCalendar = Calendar.getInstance();
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55908);lastTruncateCalendar = Calendar.getInstance();
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55909);nextTruncateCalendar = Calendar.getInstance();
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55910);truncatedCalendar.setTime(truncatedDate);
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55911);lastTruncateCalendar.setTime(lastTruncateDate);
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55912);nextTruncateCalendar.setTime(nextTruncateDate);

        //Calendar-comparison
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55913);assertEquals("Truncating "+ fdf.format(truncatedCalendar) +" as Calendar with CalendarField-value "+ calendarField +" must return itself", truncatedCalendar, DateUtils.truncate(truncatedCalendar, calendarField));
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55914);assertEquals(truncatedCalendar, DateUtils.truncate(lastTruncateCalendar, calendarField));
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55915);assertFalse(fdf.format(lastTruncateCalendar) +" is not an extreme when truncating as Calendar with CalendarField-value "+ calendarField, truncatedCalendar.equals(DateUtils.truncate(nextTruncateCalendar, calendarField)));

        //Object-comparison
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55916);assertEquals("Truncating "+ fdf.format(truncatedDate) +" as Date cast to Object with CalendarField-value "+ calendarField +" must return itself as Date", truncatedDate, DateUtils.truncate((Object) truncatedDate, calendarField));
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55917);assertEquals(truncatedDate, DateUtils.truncate((Object) lastTruncateDate, calendarField));
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55918);assertFalse(fdf.format(lastTruncateDate) +" is not an extreme when truncating as Date cast to Object with CalendarField-value "+ calendarField, truncatedDate.equals(DateUtils.truncate((Object) nextTruncateDate, calendarField)));
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55919);assertEquals("Truncating "+ fdf.format(truncatedCalendar) +" as Calendar cast to Object with CalendarField-value "+ calendarField +" must return itself as Date", truncatedDate, DateUtils.truncate((Object) truncatedCalendar, calendarField));
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55920);assertEquals(truncatedDate, DateUtils.truncate((Object) lastTruncateCalendar, calendarField));
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55921);assertFalse(fdf.format(lastTruncateCalendar) +" is not an extreme when truncating as Calendar cast to Object with CalendarField-value "+ calendarField, truncatedDate.equals(DateUtils.truncate((Object) nextTruncateCalendar, calendarField)));
    }finally{__CLR4_5_216xd16xdlvha7ioo.R.flushNeeded();}}
    
    /**
     * 
     * Any January 1 could be considered as the ultimate extreme.
     * Instead of comparing the results if the input has a difference of 1 millisecond we check the output to be exactly January first. 
     * 
     * @param minDate the lower bound
     * @param maxDate the upper bound
     * @param calendarField a Calendar.field value
     * @since 3.0
     */
    protected void roundToJanuaryFirst(final Date minDate, final Date maxDate, final int calendarField) {try{__CLR4_5_216xd16xdlvha7ioo.R.inc(55922);
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55923);assertEquals("Rounding "+ fdf.format(januaryOneDate) +" as Date with CalendarField-value "+ calendarField +" must return itself", januaryOneDate, DateUtils.round(januaryOneDate, calendarField));
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55924);assertEquals(januaryOneDate, DateUtils.round(minDate, calendarField));
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55925);assertEquals(januaryOneDate, DateUtils.round(maxDate, calendarField));
        
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55926);final Calendar minCalendar = Calendar.getInstance();
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55927);minCalendar.setTime(minDate);
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55928);final Calendar maxCalendar = Calendar.getInstance();
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55929);maxCalendar.setTime(maxDate);
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55930);assertEquals("Rounding "+ fdf.format(januaryOneCalendar) +" as Date with CalendarField-value "+ calendarField +" must return itself", januaryOneCalendar, DateUtils.round(januaryOneCalendar, calendarField));
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55931);assertEquals(januaryOneCalendar, DateUtils.round(minCalendar, calendarField));
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55932);assertEquals(januaryOneCalendar, DateUtils.round(maxCalendar, calendarField));

        __CLR4_5_216xd16xdlvha7ioo.R.inc(55933);final Date toPrevRoundDate = DateUtils.addMilliseconds(minDate, -1);
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55934);final Date toNextRoundDate = DateUtils.addMilliseconds(maxDate, 1);
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55935);assertFalse(fdf.format(minDate) +" is not an lower-extreme when rounding as Date with CalendarField-value "+ calendarField, januaryOneDate.equals(DateUtils.round(toPrevRoundDate, calendarField)));
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55936);assertFalse(fdf.format(maxDate) +" is not an upper-extreme when rounding as Date with CalendarField-value "+ calendarField, januaryOneDate.equals(DateUtils.round(toNextRoundDate, calendarField)));
        
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55937);final Calendar toPrevRoundCalendar = Calendar.getInstance();
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55938);toPrevRoundCalendar.setTime(toPrevRoundDate);
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55939);final Calendar toNextRoundCalendar = Calendar.getInstance();
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55940);toNextRoundCalendar.setTime(toNextRoundDate);
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55941);assertFalse(fdf.format(minCalendar) +" is not an lower-extreme when rounding as Date with CalendarField-value "+ calendarField, januaryOneDate.equals(DateUtils.round(toPrevRoundDate, calendarField)));
        __CLR4_5_216xd16xdlvha7ioo.R.inc(55942);assertFalse(fdf.format(maxCalendar) +" is not an upper-extreme when rounding as Date with CalendarField-value "+ calendarField, januaryOneDate.equals(DateUtils.round(toNextRoundDate, calendarField)));
    }finally{__CLR4_5_216xd16xdlvha7ioo.R.flushNeeded();}}
}
