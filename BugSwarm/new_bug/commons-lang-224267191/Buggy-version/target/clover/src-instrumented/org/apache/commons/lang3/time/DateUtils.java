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
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.Validate;

/**
 * <p>A suite of utilities surrounding the use of the
 * {@link java.util.Calendar} and {@link java.util.Date} object.</p>
 * 
 * <p>DateUtils contains a lot of common methods considering manipulations
 * of Dates or Calendars. Some methods require some extra explanation.
 * The truncate, ceiling and round methods could be considered the Math.floor(),
 * Math.ceil() or Math.round versions for dates
 * This way date-fields will be ignored in bottom-up order.
 * As a complement to these methods we've introduced some fragment-methods.
 * With these methods the Date-fields will be ignored in top-down order.
 * Since a date without a year is not a valid date, you have to decide in what
 * kind of date-field you want your result, for instance milliseconds or days.
 * </p>
 * <p>
 * Several methods are provided for adding to {@code Date} objects, of the form 
 * {@code addXXX(Date date, int amount)}. It is important to note these methods 
 * use a {@code Calendar} internally (with default timezone and locale) and may
 * be affected by changes to daylight saving time (DST).
 * </p>
 *
 * @since 2.0
 */
@java.lang.SuppressWarnings({"fallthrough"}) public class DateUtils {public static class __CLR4_5_2gmdgmdlvha7cf4{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172755542L,8589935092L,22035,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Number of milliseconds in a standard second.
     * @since 2.1
     */
    public static final long MILLIS_PER_SECOND = 1000;
    /**
     * Number of milliseconds in a standard minute.
     * @since 2.1
     */
    public static final long MILLIS_PER_MINUTE = 60 * MILLIS_PER_SECOND;
    /**
     * Number of milliseconds in a standard hour.
     * @since 2.1
     */
    public static final long MILLIS_PER_HOUR = 60 * MILLIS_PER_MINUTE;
    /**
     * Number of milliseconds in a standard day.
     * @since 2.1
     */
    public static final long MILLIS_PER_DAY = 24 * MILLIS_PER_HOUR;

    /**
     * This is half a month, so this represents whether a date is in the top
     * or bottom half of the month.
     */
    public static final int SEMI_MONTH = 1001;

    private static final int[][] fields = {
            {Calendar.MILLISECOND},
            {Calendar.SECOND},
            {Calendar.MINUTE},
            {Calendar.HOUR_OF_DAY, Calendar.HOUR},
            {Calendar.DATE, Calendar.DAY_OF_MONTH, Calendar.AM_PM 
                /* Calendar.DAY_OF_YEAR, Calendar.DAY_OF_WEEK, Calendar.DAY_OF_WEEK_IN_MONTH */
            },
            {Calendar.MONTH, DateUtils.SEMI_MONTH},
            {Calendar.YEAR},
            {Calendar.ERA}};

    /**
     * A week range, starting on Sunday.
     */
    public static final int RANGE_WEEK_SUNDAY = 1;
    /**
     * A week range, starting on Monday.
     */
    public static final int RANGE_WEEK_MONDAY = 2;
    /**
     * A week range, starting on the day focused.
     */
    public static final int RANGE_WEEK_RELATIVE = 3;
    /**
     * A week range, centered around the day focused.
     */
    public static final int RANGE_WEEK_CENTER = 4;
    /**
     * A month range, the week starting on Sunday.
     */
    public static final int RANGE_MONTH_SUNDAY = 5;
    /**
     * A month range, the week starting on Monday.
     */
    public static final int RANGE_MONTH_MONDAY = 6;

    /**
     * Calendar modification types.
     */
    private enum ModifyType {
        /**
         * Truncation.
         */
        TRUNCATE,
        
        /**
         * Rounding. 
         */
        ROUND,
        
        /**
         * Ceiling. 
         */
        CEILING
    }

    /**
     * <p>{@code DateUtils} instances should NOT be constructed in
     * standard programming. Instead, the static methods on the class should
     * be used, such as {@code DateUtils.parseDate(str);}.</p>
     *
     * <p>This constructor is public to permit tools that require a JavaBean
     * instance to operate.</p>
     */
    public DateUtils() {
        super();__CLR4_5_2gmdgmdlvha7cf4.R.inc(21542);try{__CLR4_5_2gmdgmdlvha7cf4.R.inc(21541);
    }finally{__CLR4_5_2gmdgmdlvha7cf4.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * <p>Checks if two date objects are on the same day ignoring time.</p>
     *
     * <p>28 Mar 2002 13:45 and 28 Mar 2002 06:01 would return true.
     * 28 Mar 2002 13:45 and 12 Mar 2002 13:45 would return false.
     * </p>
     * 
     * @param date1  the first date, not altered, not null
     * @param date2  the second date, not altered, not null
     * @return true if they represent the same day
     * @throws IllegalArgumentException if either date is <code>null</code>
     * @since 2.1
     */
    public static boolean isSameDay(final Date date1, final Date date2) {try{__CLR4_5_2gmdgmdlvha7cf4.R.inc(21543);
        __CLR4_5_2gmdgmdlvha7cf4.R.inc(21544);if ((((date1 == null || date2 == null)&&(__CLR4_5_2gmdgmdlvha7cf4.R.iget(21545)!=0|true))||(__CLR4_5_2gmdgmdlvha7cf4.R.iget(21546)==0&false))) {{
            __CLR4_5_2gmdgmdlvha7cf4.R.inc(21547);throw new IllegalArgumentException("The date must not be null");
        }
        }__CLR4_5_2gmdgmdlvha7cf4.R.inc(21548);final Calendar cal1 = Calendar.getInstance();
        __CLR4_5_2gmdgmdlvha7cf4.R.inc(21549);cal1.setTime(date1);
        __CLR4_5_2gmdgmdlvha7cf4.R.inc(21550);final Calendar cal2 = Calendar.getInstance();
        __CLR4_5_2gmdgmdlvha7cf4.R.inc(21551);cal2.setTime(date2);
        __CLR4_5_2gmdgmdlvha7cf4.R.inc(21552);return isSameDay(cal1, cal2);
    }finally{__CLR4_5_2gmdgmdlvha7cf4.R.flushNeeded();}}

    /**
     * <p>Checks if two calendar objects are on the same day ignoring time.</p>
     *
     * <p>28 Mar 2002 13:45 and 28 Mar 2002 06:01 would return true.
     * 28 Mar 2002 13:45 and 12 Mar 2002 13:45 would return false.
     * </p>
     * 
     * @param cal1  the first calendar, not altered, not null
     * @param cal2  the second calendar, not altered, not null
     * @return true if they represent the same day
     * @throws IllegalArgumentException if either calendar is <code>null</code>
     * @since 2.1
     */
    public static boolean isSameDay(final Calendar cal1, final Calendar cal2) {try{__CLR4_5_2gmdgmdlvha7cf4.R.inc(21553);
        __CLR4_5_2gmdgmdlvha7cf4.R.inc(21554);if ((((cal1 == null || cal2 == null)&&(__CLR4_5_2gmdgmdlvha7cf4.R.iget(21555)!=0|true))||(__CLR4_5_2gmdgmdlvha7cf4.R.iget(21556)==0&false))) {{
            __CLR4_5_2gmdgmdlvha7cf4.R.inc(21557);throw new IllegalArgumentException("The date must not be null");
        }
        }__CLR4_5_2gmdgmdlvha7cf4.R.inc(21558);return cal1.get(Calendar.ERA) == cal2.get(Calendar.ERA) &&
                cal1.get(Calendar.YEAR) == cal2.get(Calendar.YEAR) &&
                cal1.get(Calendar.DAY_OF_YEAR) == cal2.get(Calendar.DAY_OF_YEAR);
    }finally{__CLR4_5_2gmdgmdlvha7cf4.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * <p>Checks if two date objects represent the same instant in time.</p>
     *
     * <p>This method compares the long millisecond time of the two objects.</p>
     * 
     * @param date1  the first date, not altered, not null
     * @param date2  the second date, not altered, not null
     * @return true if they represent the same millisecond instant
     * @throws IllegalArgumentException if either date is <code>null</code>
     * @since 2.1
     */
    public static boolean isSameInstant(final Date date1, final Date date2) {try{__CLR4_5_2gmdgmdlvha7cf4.R.inc(21559);
        __CLR4_5_2gmdgmdlvha7cf4.R.inc(21560);if ((((date1 == null || date2 == null)&&(__CLR4_5_2gmdgmdlvha7cf4.R.iget(21561)!=0|true))||(__CLR4_5_2gmdgmdlvha7cf4.R.iget(21562)==0&false))) {{
            __CLR4_5_2gmdgmdlvha7cf4.R.inc(21563);throw new IllegalArgumentException("The date must not be null");
        }
        }__CLR4_5_2gmdgmdlvha7cf4.R.inc(21564);return date1.getTime() == date2.getTime();
    }finally{__CLR4_5_2gmdgmdlvha7cf4.R.flushNeeded();}}

    /**
     * <p>Checks if two calendar objects represent the same instant in time.</p>
     *
     * <p>This method compares the long millisecond time of the two objects.</p>
     * 
     * @param cal1  the first calendar, not altered, not null
     * @param cal2  the second calendar, not altered, not null
     * @return true if they represent the same millisecond instant
     * @throws IllegalArgumentException if either date is <code>null</code>
     * @since 2.1
     */
    public static boolean isSameInstant(final Calendar cal1, final Calendar cal2) {try{__CLR4_5_2gmdgmdlvha7cf4.R.inc(21565);
        __CLR4_5_2gmdgmdlvha7cf4.R.inc(21566);if ((((cal1 == null || cal2 == null)&&(__CLR4_5_2gmdgmdlvha7cf4.R.iget(21567)!=0|true))||(__CLR4_5_2gmdgmdlvha7cf4.R.iget(21568)==0&false))) {{
            __CLR4_5_2gmdgmdlvha7cf4.R.inc(21569);throw new IllegalArgumentException("The date must not be null");
        }
        }__CLR4_5_2gmdgmdlvha7cf4.R.inc(21570);return cal1.getTime().getTime() == cal2.getTime().getTime();
    }finally{__CLR4_5_2gmdgmdlvha7cf4.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * <p>Checks if two calendar objects represent the same local time.</p>
     *
     * <p>This method compares the values of the fields of the two objects.
     * In addition, both calendars must be the same of the same type.</p>
     * 
     * @param cal1  the first calendar, not altered, not null
     * @param cal2  the second calendar, not altered, not null
     * @return true if they represent the same millisecond instant
     * @throws IllegalArgumentException if either date is <code>null</code>
     * @since 2.1
     */
    public static boolean isSameLocalTime(final Calendar cal1, final Calendar cal2) {try{__CLR4_5_2gmdgmdlvha7cf4.R.inc(21571);
        __CLR4_5_2gmdgmdlvha7cf4.R.inc(21572);if ((((cal1 == null || cal2 == null)&&(__CLR4_5_2gmdgmdlvha7cf4.R.iget(21573)!=0|true))||(__CLR4_5_2gmdgmdlvha7cf4.R.iget(21574)==0&false))) {{
            __CLR4_5_2gmdgmdlvha7cf4.R.inc(21575);throw new IllegalArgumentException("The date must not be null");
        }
        }__CLR4_5_2gmdgmdlvha7cf4.R.inc(21576);return cal1.get(Calendar.MILLISECOND) == cal2.get(Calendar.MILLISECOND) &&
                cal1.get(Calendar.SECOND) == cal2.get(Calendar.SECOND) &&
                cal1.get(Calendar.MINUTE) == cal2.get(Calendar.MINUTE) &&
                cal1.get(Calendar.HOUR_OF_DAY) == cal2.get(Calendar.HOUR_OF_DAY) &&
                cal1.get(Calendar.DAY_OF_YEAR) == cal2.get(Calendar.DAY_OF_YEAR) &&
                cal1.get(Calendar.YEAR) == cal2.get(Calendar.YEAR) &&
                cal1.get(Calendar.ERA) == cal2.get(Calendar.ERA) &&
                cal1.getClass() == cal2.getClass();
    }finally{__CLR4_5_2gmdgmdlvha7cf4.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * <p>Parses a string representing a date by trying a variety of different parsers.</p>
     * 
     * <p>The parse will try each parse pattern in turn.
     * A parse is only deemed successful if it parses the whole of the input string.
     * If no parse patterns match, a ParseException is thrown.</p>
     * The parser will be lenient toward the parsed date.
     * 
     * @param str  the date to parse, not null
     * @param parsePatterns  the date format patterns to use, see SimpleDateFormat, not null
     * @return the parsed date
     * @throws IllegalArgumentException if the date string or pattern array is null
     * @throws ParseException if none of the date patterns were suitable (or there were none)
     */
    public static Date parseDate(final String str, final String... parsePatterns) throws ParseException {try{__CLR4_5_2gmdgmdlvha7cf4.R.inc(21577);
        __CLR4_5_2gmdgmdlvha7cf4.R.inc(21578);return parseDate(str, null, parsePatterns);
    }finally{__CLR4_5_2gmdgmdlvha7cf4.R.flushNeeded();}}
    
    //-----------------------------------------------------------------------
    /**
     * <p>Parses a string representing a date by trying a variety of different parsers,
     * using the default date format symbols for the given locale.</p>
     * 
     * <p>The parse will try each parse pattern in turn.
     * A parse is only deemed successful if it parses the whole of the input string.
     * If no parse patterns match, a ParseException is thrown.</p>
     * The parser will be lenient toward the parsed date.
     * 
     * @param str  the date to parse, not null
     * @param locale the locale whose date format symbols should be used. If <code>null</code>,
     * the system locale is used (as per {@link #parseDate(String, String...)}).
     * @param parsePatterns  the date format patterns to use, see SimpleDateFormat, not null
     * @return the parsed date
     * @throws IllegalArgumentException if the date string or pattern array is null
     * @throws ParseException if none of the date patterns were suitable (or there were none)
     * @since 3.2
     */
    public static Date parseDate(final String str, final Locale locale, final String... parsePatterns) throws ParseException {try{__CLR4_5_2gmdgmdlvha7cf4.R.inc(21579);
        __CLR4_5_2gmdgmdlvha7cf4.R.inc(21580);return parseDateWithLeniency(str, locale, parsePatterns, true);
    }finally{__CLR4_5_2gmdgmdlvha7cf4.R.flushNeeded();}}    

  //-----------------------------------------------------------------------
    /**
     * <p>Parses a string representing a date by trying a variety of different parsers.</p>
     * 
     * <p>The parse will try each parse pattern in turn.
     * A parse is only deemed successful if it parses the whole of the input string.
     * If no parse patterns match, a ParseException is thrown.</p>
     * The parser parses strictly - it does not allow for dates such as "February 942, 1996". 
     * 
     * @param str  the date to parse, not null
     * @param parsePatterns  the date format patterns to use, see SimpleDateFormat, not null
     * @return the parsed date
     * @throws IllegalArgumentException if the date string or pattern array is null
     * @throws ParseException if none of the date patterns were suitable
     * @since 2.5
     */
    public static Date parseDateStrictly(final String str, final String... parsePatterns) throws ParseException {try{__CLR4_5_2gmdgmdlvha7cf4.R.inc(21581);
        __CLR4_5_2gmdgmdlvha7cf4.R.inc(21582);return parseDateStrictly(str, null, parsePatterns);
    }finally{__CLR4_5_2gmdgmdlvha7cf4.R.flushNeeded();}}

    /**
     * <p>Parses a string representing a date by trying a variety of different parsers,
     * using the default date format symbols for the given locale..</p>
     * 
     * <p>The parse will try each parse pattern in turn.
     * A parse is only deemed successful if it parses the whole of the input string.
     * If no parse patterns match, a ParseException is thrown.</p>
     * The parser parses strictly - it does not allow for dates such as "February 942, 1996". 
     * 
     * @param str  the date to parse, not null
     * @param locale the locale whose date format symbols should be used. If <code>null</code>,
     * the system locale is used (as per {@link #parseDateStrictly(String, String...)}).
     * @param parsePatterns  the date format patterns to use, see SimpleDateFormat, not null
     * @return the parsed date
     * @throws IllegalArgumentException if the date string or pattern array is null
     * @throws ParseException if none of the date patterns were suitable
     * @since 3.2
     */
    public static Date parseDateStrictly(final String str, final Locale locale, final String... parsePatterns) throws ParseException {try{__CLR4_5_2gmdgmdlvha7cf4.R.inc(21583);
        __CLR4_5_2gmdgmdlvha7cf4.R.inc(21584);return parseDateWithLeniency(str, locale, parsePatterns, false);
    }finally{__CLR4_5_2gmdgmdlvha7cf4.R.flushNeeded();}}    

    /**
     * <p>Parses a string representing a date by trying a variety of different parsers.</p>
     * 
     * <p>The parse will try each parse pattern in turn.
     * A parse is only deemed successful if it parses the whole of the input string.
     * If no parse patterns match, a ParseException is thrown.</p>
     * 
     * @param str  the date to parse, not null
     * @param locale the locale to use when interpretting the pattern, can be null in which
     * case the default system locale is used
     * @param parsePatterns  the date format patterns to use, see SimpleDateFormat, not null
     * @param lenient Specify whether or not date/time parsing is to be lenient.
     * @return the parsed date
     * @throws IllegalArgumentException if the date string or pattern array is null
     * @throws ParseException if none of the date patterns were suitable
     * @see java.util.Calendar#isLenient()
     */
    private static Date parseDateWithLeniency(
            final String str, final Locale locale, final String[] parsePatterns, final boolean lenient) throws ParseException {try{__CLR4_5_2gmdgmdlvha7cf4.R.inc(21585);
        __CLR4_5_2gmdgmdlvha7cf4.R.inc(21586);if ((((str == null || parsePatterns == null)&&(__CLR4_5_2gmdgmdlvha7cf4.R.iget(21587)!=0|true))||(__CLR4_5_2gmdgmdlvha7cf4.R.iget(21588)==0&false))) {{
            __CLR4_5_2gmdgmdlvha7cf4.R.inc(21589);throw new IllegalArgumentException("Date and Patterns must not be null");
        }

        }__CLR4_5_2gmdgmdlvha7cf4.R.inc(21590);final TimeZone tz = TimeZone.getDefault();
        __CLR4_5_2gmdgmdlvha7cf4.R.inc(21591);final Locale lcl = (((locale==null )&&(__CLR4_5_2gmdgmdlvha7cf4.R.iget(21592)!=0|true))||(__CLR4_5_2gmdgmdlvha7cf4.R.iget(21593)==0&false))?Locale.getDefault() : locale;
        __CLR4_5_2gmdgmdlvha7cf4.R.inc(21594);final ParsePosition pos = new ParsePosition(0);
        __CLR4_5_2gmdgmdlvha7cf4.R.inc(21595);final Calendar calendar = Calendar.getInstance(tz, lcl);
        __CLR4_5_2gmdgmdlvha7cf4.R.inc(21596);calendar.setLenient(lenient);

        __CLR4_5_2gmdgmdlvha7cf4.R.inc(21597);for (final String parsePattern : parsePatterns) {{
            __CLR4_5_2gmdgmdlvha7cf4.R.inc(21598);final FastDateParser fdp = new FastDateParser(parsePattern, tz, lcl);
            __CLR4_5_2gmdgmdlvha7cf4.R.inc(21599);calendar.clear();
            __CLR4_5_2gmdgmdlvha7cf4.R.inc(21600);try {
                __CLR4_5_2gmdgmdlvha7cf4.R.inc(21601);if ((((fdp.parse(str, pos, calendar) && pos.getIndex()==str.length())&&(__CLR4_5_2gmdgmdlvha7cf4.R.iget(21602)!=0|true))||(__CLR4_5_2gmdgmdlvha7cf4.R.iget(21603)==0&false))) {{
                    __CLR4_5_2gmdgmdlvha7cf4.R.inc(21604);return calendar.getTime();
                }
            }}
            catch(final IllegalArgumentException ignore) {
                // leniency is preventing calendar from being set
            }
            __CLR4_5_2gmdgmdlvha7cf4.R.inc(21605);pos.setIndex(0);
        }
        }__CLR4_5_2gmdgmdlvha7cf4.R.inc(21606);throw new ParseException("Unable to parse the date: " + str, -1);
    }finally{__CLR4_5_2gmdgmdlvha7cf4.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Adds a number of years to a date returning a new object.
     * The original {@code Date} is unchanged.
     *
     * @param date  the date, not null
     * @param amount  the amount to add, may be negative
     * @return the new {@code Date} with the amount added
     * @throws IllegalArgumentException if the date is null
     */
    public static Date addYears(final Date date, final int amount) {try{__CLR4_5_2gmdgmdlvha7cf4.R.inc(21607);
        __CLR4_5_2gmdgmdlvha7cf4.R.inc(21608);return add(date, Calendar.YEAR, amount);
    }finally{__CLR4_5_2gmdgmdlvha7cf4.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Adds a number of months to a date returning a new object.
     * The original {@code Date} is unchanged.
     *
     * @param date  the date, not null
     * @param amount  the amount to add, may be negative
     * @return the new {@code Date} with the amount added
     * @throws IllegalArgumentException if the date is null
     */
    public static Date addMonths(final Date date, final int amount) {try{__CLR4_5_2gmdgmdlvha7cf4.R.inc(21609);
        __CLR4_5_2gmdgmdlvha7cf4.R.inc(21610);return add(date, Calendar.MONTH, amount);
    }finally{__CLR4_5_2gmdgmdlvha7cf4.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Adds a number of weeks to a date returning a new object.
     * The original {@code Date} is unchanged.
     *
     * @param date  the date, not null
     * @param amount  the amount to add, may be negative
     * @return the new {@code Date} with the amount added
     * @throws IllegalArgumentException if the date is null
     */
    public static Date addWeeks(final Date date, final int amount) {try{__CLR4_5_2gmdgmdlvha7cf4.R.inc(21611);
        __CLR4_5_2gmdgmdlvha7cf4.R.inc(21612);return add(date, Calendar.WEEK_OF_YEAR, amount);
    }finally{__CLR4_5_2gmdgmdlvha7cf4.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Adds a number of days to a date returning a new object.
     * The original {@code Date} is unchanged.
     *
     * @param date  the date, not null
     * @param amount  the amount to add, may be negative
     * @return the new {@code Date} with the amount added
     * @throws IllegalArgumentException if the date is null
     */
    public static Date addDays(final Date date, final int amount) {try{__CLR4_5_2gmdgmdlvha7cf4.R.inc(21613);
        __CLR4_5_2gmdgmdlvha7cf4.R.inc(21614);return add(date, Calendar.DAY_OF_MONTH, amount);
    }finally{__CLR4_5_2gmdgmdlvha7cf4.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Adds a number of hours to a date returning a new object.
     * The original {@code Date} is unchanged.
     *
     * @param date  the date, not null
     * @param amount  the amount to add, may be negative
     * @return the new {@code Date} with the amount added
     * @throws IllegalArgumentException if the date is null
     */
    public static Date addHours(final Date date, final int amount) {try{__CLR4_5_2gmdgmdlvha7cf4.R.inc(21615);
        __CLR4_5_2gmdgmdlvha7cf4.R.inc(21616);return add(date, Calendar.HOUR_OF_DAY, amount);
    }finally{__CLR4_5_2gmdgmdlvha7cf4.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Adds a number of minutes to a date returning a new object.
     * The original {@code Date} is unchanged.
     *
     * @param date  the date, not null
     * @param amount  the amount to add, may be negative
     * @return the new {@code Date} with the amount added
     * @throws IllegalArgumentException if the date is null
     */
    public static Date addMinutes(final Date date, final int amount) {try{__CLR4_5_2gmdgmdlvha7cf4.R.inc(21617);
        __CLR4_5_2gmdgmdlvha7cf4.R.inc(21618);return add(date, Calendar.MINUTE, amount);
    }finally{__CLR4_5_2gmdgmdlvha7cf4.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Adds a number of seconds to a date returning a new object.
     * The original {@code Date} is unchanged.
     *
     * @param date  the date, not null
     * @param amount  the amount to add, may be negative
     * @return the new {@code Date} with the amount added
     * @throws IllegalArgumentException if the date is null
     */
    public static Date addSeconds(final Date date, final int amount) {try{__CLR4_5_2gmdgmdlvha7cf4.R.inc(21619);
        __CLR4_5_2gmdgmdlvha7cf4.R.inc(21620);return add(date, Calendar.SECOND, amount);
    }finally{__CLR4_5_2gmdgmdlvha7cf4.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Adds a number of milliseconds to a date returning a new object.
     * The original {@code Date} is unchanged.
     *
     * @param date  the date, not null
     * @param amount  the amount to add, may be negative
     * @return the new {@code Date} with the amount added
     * @throws IllegalArgumentException if the date is null
     */
    public static Date addMilliseconds(final Date date, final int amount) {try{__CLR4_5_2gmdgmdlvha7cf4.R.inc(21621);
        __CLR4_5_2gmdgmdlvha7cf4.R.inc(21622);return add(date, Calendar.MILLISECOND, amount);
    }finally{__CLR4_5_2gmdgmdlvha7cf4.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Adds to a date returning a new object.
     * The original {@code Date} is unchanged.
     *
     * @param date  the date, not null
     * @param calendarField  the calendar field to add to
     * @param amount  the amount to add, may be negative
     * @return the new {@code Date} with the amount added
     * @throws IllegalArgumentException if the date is null
     */
    private static Date add(final Date date, final int calendarField, final int amount) {try{__CLR4_5_2gmdgmdlvha7cf4.R.inc(21623);
        __CLR4_5_2gmdgmdlvha7cf4.R.inc(21624);validateDateNotNull(date);
        __CLR4_5_2gmdgmdlvha7cf4.R.inc(21625);final Calendar c = Calendar.getInstance();
        __CLR4_5_2gmdgmdlvha7cf4.R.inc(21626);c.setTime(date);
        __CLR4_5_2gmdgmdlvha7cf4.R.inc(21627);c.add(calendarField, amount);
        __CLR4_5_2gmdgmdlvha7cf4.R.inc(21628);return c.getTime();
    }finally{__CLR4_5_2gmdgmdlvha7cf4.R.flushNeeded();}}
    
    //-----------------------------------------------------------------------
    /**
     * Sets the years field to a date returning a new object.
     * The original {@code Date} is unchanged.
     *
     * @param date  the date, not null
     * @param amount the amount to set
     * @return a new {@code Date} set with the specified value
     * @throws IllegalArgumentException if the date is null
     * @since 2.4
     */
    public static Date setYears(final Date date, final int amount) {try{__CLR4_5_2gmdgmdlvha7cf4.R.inc(21629);
        __CLR4_5_2gmdgmdlvha7cf4.R.inc(21630);return set(date, Calendar.YEAR, amount);
    }finally{__CLR4_5_2gmdgmdlvha7cf4.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Sets the months field to a date returning a new object.
     * The original {@code Date} is unchanged.
     *
     * @param date  the date, not null
     * @param amount the amount to set
     * @return a new {@code Date} set with the specified value
     * @throws IllegalArgumentException if the date is null
     * @since 2.4
     */
    public static Date setMonths(final Date date, final int amount) {try{__CLR4_5_2gmdgmdlvha7cf4.R.inc(21631);
        __CLR4_5_2gmdgmdlvha7cf4.R.inc(21632);return set(date, Calendar.MONTH, amount);
    }finally{__CLR4_5_2gmdgmdlvha7cf4.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Sets the day of month field to a date returning a new object.
     * The original {@code Date} is unchanged.
     *
     * @param date  the date, not null
     * @param amount the amount to set
     * @return a new {@code Date} set with the specified value
     * @throws IllegalArgumentException if the date is null
     * @since 2.4
     */
    public static Date setDays(final Date date, final int amount) {try{__CLR4_5_2gmdgmdlvha7cf4.R.inc(21633);
        __CLR4_5_2gmdgmdlvha7cf4.R.inc(21634);return set(date, Calendar.DAY_OF_MONTH, amount);
    }finally{__CLR4_5_2gmdgmdlvha7cf4.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Sets the hours field to a date returning a new object.  Hours range 
     * from  0-23.
     * The original {@code Date} is unchanged.
     *
     * @param date  the date, not null
     * @param amount the amount to set
     * @return a new {@code Date} set with the specified value
     * @throws IllegalArgumentException if the date is null
     * @since 2.4
     */
    public static Date setHours(final Date date, final int amount) {try{__CLR4_5_2gmdgmdlvha7cf4.R.inc(21635);
        __CLR4_5_2gmdgmdlvha7cf4.R.inc(21636);return set(date, Calendar.HOUR_OF_DAY, amount);
    }finally{__CLR4_5_2gmdgmdlvha7cf4.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Sets the minute field to a date returning a new object.
     * The original {@code Date} is unchanged.
     *
     * @param date  the date, not null
     * @param amount the amount to set
     * @return a new {@code Date} set with the specified value
     * @throws IllegalArgumentException if the date is null
     * @since 2.4
     */
    public static Date setMinutes(final Date date, final int amount) {try{__CLR4_5_2gmdgmdlvha7cf4.R.inc(21637);
        __CLR4_5_2gmdgmdlvha7cf4.R.inc(21638);return set(date, Calendar.MINUTE, amount);
    }finally{__CLR4_5_2gmdgmdlvha7cf4.R.flushNeeded();}}
    
    //-----------------------------------------------------------------------
    /**
     * Sets the seconds field to a date returning a new object.
     * The original {@code Date} is unchanged.
     *
     * @param date  the date, not null
     * @param amount the amount to set
     * @return a new {@code Date} set with the specified value
     * @throws IllegalArgumentException if the date is null
     * @since 2.4
     */
    public static Date setSeconds(final Date date, final int amount) {try{__CLR4_5_2gmdgmdlvha7cf4.R.inc(21639);
        __CLR4_5_2gmdgmdlvha7cf4.R.inc(21640);return set(date, Calendar.SECOND, amount);
    }finally{__CLR4_5_2gmdgmdlvha7cf4.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Sets the milliseconds field to a date returning a new object.
     * The original {@code Date} is unchanged.
     *
     * @param date  the date, not null
     * @param amount the amount to set
     * @return a new {@code Date} set with the specified value
     * @throws IllegalArgumentException if the date is null
     * @since 2.4
     */
    public static Date setMilliseconds(final Date date, final int amount) {try{__CLR4_5_2gmdgmdlvha7cf4.R.inc(21641);
        __CLR4_5_2gmdgmdlvha7cf4.R.inc(21642);return set(date, Calendar.MILLISECOND, amount);
    }finally{__CLR4_5_2gmdgmdlvha7cf4.R.flushNeeded();}} 
    
    //-----------------------------------------------------------------------
    /**
     * Sets the specified field to a date returning a new object.  
     * This does not use a lenient calendar.
     * The original {@code Date} is unchanged.
     *
     * @param date  the date, not null
     * @param calendarField  the {@code Calendar} field to set the amount to
     * @param amount the amount to set
     * @return a new {@code Date} set with the specified value
     * @throws IllegalArgumentException if the date is null
     * @since 2.4
     */
    private static Date set(final Date date, final int calendarField, final int amount) {try{__CLR4_5_2gmdgmdlvha7cf4.R.inc(21643);
        __CLR4_5_2gmdgmdlvha7cf4.R.inc(21644);validateDateNotNull(date);
        // getInstance() returns a new object, so this method is thread safe.
        __CLR4_5_2gmdgmdlvha7cf4.R.inc(21645);final Calendar c = Calendar.getInstance();
        __CLR4_5_2gmdgmdlvha7cf4.R.inc(21646);c.setLenient(false);
        __CLR4_5_2gmdgmdlvha7cf4.R.inc(21647);c.setTime(date);
        __CLR4_5_2gmdgmdlvha7cf4.R.inc(21648);c.set(calendarField, amount);
        __CLR4_5_2gmdgmdlvha7cf4.R.inc(21649);return c.getTime();
    }finally{__CLR4_5_2gmdgmdlvha7cf4.R.flushNeeded();}}   

    //-----------------------------------------------------------------------
    /**
     * Converts a {@code Date} into a {@code Calendar}. 
     * 
     * @param date the date to convert to a Calendar
     * @return the created Calendar
     * @throws NullPointerException if null is passed in
     * @since 3.0
     */
    public static Calendar toCalendar(final Date date) {try{__CLR4_5_2gmdgmdlvha7cf4.R.inc(21650);
        __CLR4_5_2gmdgmdlvha7cf4.R.inc(21651);final Calendar c = Calendar.getInstance();
        __CLR4_5_2gmdgmdlvha7cf4.R.inc(21652);c.setTime(date);
        __CLR4_5_2gmdgmdlvha7cf4.R.inc(21653);return c;
    }finally{__CLR4_5_2gmdgmdlvha7cf4.R.flushNeeded();}}
    
    //-----------------------------------------------------------------------
    /**
     * Converts a {@code Date} of a given {@code TimeZone} into a {@code Calendar}
     * @param date the date to convert to a Calendar
     * @param tz the time zone of the {@code date}
     * @return the created Calendar
     * @throws NullPointerException if {@code date} or {@code tz} is null
     */
    public static Calendar toCalendar(final Date date, final TimeZone tz) {try{__CLR4_5_2gmdgmdlvha7cf4.R.inc(21654);
        __CLR4_5_2gmdgmdlvha7cf4.R.inc(21655);final Calendar c = Calendar.getInstance(tz);
        __CLR4_5_2gmdgmdlvha7cf4.R.inc(21656);c.setTime(date);
        __CLR4_5_2gmdgmdlvha7cf4.R.inc(21657);return c;
    }finally{__CLR4_5_2gmdgmdlvha7cf4.R.flushNeeded();}}
    
    //-----------------------------------------------------------------------
    /**
     * <p>Rounds a date, leaving the field specified as the most
     * significant field.</p>
     *
     * <p>For example, if you had the date-time of 28 Mar 2002
     * 13:45:01.231, if this was passed with HOUR, it would return
     * 28 Mar 2002 14:00:00.000. If this was passed with MONTH, it
     * would return 1 April 2002 0:00:00.000.</p>
     * 
     * <p>For a date in a timezone that handles the change to daylight
     * saving time, rounding to Calendar.HOUR_OF_DAY will behave as follows.
     * Suppose daylight saving time begins at 02:00 on March 30. Rounding a 
     * date that crosses this time would produce the following values:
     * </p>
     * <ul>
     * <li>March 30, 2003 01:10 rounds to March 30, 2003 01:00</li>
     * <li>March 30, 2003 01:40 rounds to March 30, 2003 03:00</li>
     * <li>March 30, 2003 02:10 rounds to March 30, 2003 03:00</li>
     * <li>March 30, 2003 02:40 rounds to March 30, 2003 04:00</li>
     * </ul>
     * 
     * @param date  the date to work with, not null
     * @param field  the field from {@code Calendar} or {@code SEMI_MONTH}
     * @return the different rounded date, not null
     * @throws ArithmeticException if the year is over 280 million
     */
    public static Date round(final Date date, final int field) {try{__CLR4_5_2gmdgmdlvha7cf4.R.inc(21658);
        __CLR4_5_2gmdgmdlvha7cf4.R.inc(21659);validateDateNotNull(date);
        __CLR4_5_2gmdgmdlvha7cf4.R.inc(21660);final Calendar gval = Calendar.getInstance();
        __CLR4_5_2gmdgmdlvha7cf4.R.inc(21661);gval.setTime(date);
        __CLR4_5_2gmdgmdlvha7cf4.R.inc(21662);modify(gval, field, ModifyType.ROUND);
        __CLR4_5_2gmdgmdlvha7cf4.R.inc(21663);return gval.getTime();
    }finally{__CLR4_5_2gmdgmdlvha7cf4.R.flushNeeded();}}

    /**
     * <p>Rounds a date, leaving the field specified as the most
     * significant field.</p>
     *
     * <p>For example, if you had the date-time of 28 Mar 2002
     * 13:45:01.231, if this was passed with HOUR, it would return
     * 28 Mar 2002 14:00:00.000. If this was passed with MONTH, it
     * would return 1 April 2002 0:00:00.000.</p>
     * 
     * <p>For a date in a timezone that handles the change to daylight
     * saving time, rounding to Calendar.HOUR_OF_DAY will behave as follows.
     * Suppose daylight saving time begins at 02:00 on March 30. Rounding a 
     * date that crosses this time would produce the following values:
     * </p>
     * <ul>
     * <li>March 30, 2003 01:10 rounds to March 30, 2003 01:00</li>
     * <li>March 30, 2003 01:40 rounds to March 30, 2003 03:00</li>
     * <li>March 30, 2003 02:10 rounds to March 30, 2003 03:00</li>
     * <li>March 30, 2003 02:40 rounds to March 30, 2003 04:00</li>
     * </ul>
     * 
     * @param date  the date to work with, not null
     * @param field  the field from {@code Calendar} or <code>SEMI_MONTH</code>
     * @return the different rounded date, not null
     * @throws IllegalArgumentException if the date is <code>null</code>
     * @throws ArithmeticException if the year is over 280 million
     */
    public static Calendar round(final Calendar date, final int field) {try{__CLR4_5_2gmdgmdlvha7cf4.R.inc(21664);
        __CLR4_5_2gmdgmdlvha7cf4.R.inc(21665);if ((((date == null)&&(__CLR4_5_2gmdgmdlvha7cf4.R.iget(21666)!=0|true))||(__CLR4_5_2gmdgmdlvha7cf4.R.iget(21667)==0&false))) {{
            __CLR4_5_2gmdgmdlvha7cf4.R.inc(21668);throw new IllegalArgumentException("The date must not be null");
        }
        }__CLR4_5_2gmdgmdlvha7cf4.R.inc(21669);final Calendar rounded = (Calendar) date.clone();
        __CLR4_5_2gmdgmdlvha7cf4.R.inc(21670);modify(rounded, field, ModifyType.ROUND);
        __CLR4_5_2gmdgmdlvha7cf4.R.inc(21671);return rounded;
    }finally{__CLR4_5_2gmdgmdlvha7cf4.R.flushNeeded();}}

    /**
     * <p>Rounds a date, leaving the field specified as the most
     * significant field.</p>
     *
     * <p>For example, if you had the date-time of 28 Mar 2002
     * 13:45:01.231, if this was passed with HOUR, it would return
     * 28 Mar 2002 14:00:00.000. If this was passed with MONTH, it
     * would return 1 April 2002 0:00:00.000.</p>
     * 
     * <p>For a date in a timezone that handles the change to daylight
     * saving time, rounding to Calendar.HOUR_OF_DAY will behave as follows.
     * Suppose daylight saving time begins at 02:00 on March 30. Rounding a 
     * date that crosses this time would produce the following values:
     * </p>
     * <ul>
     * <li>March 30, 2003 01:10 rounds to March 30, 2003 01:00</li>
     * <li>March 30, 2003 01:40 rounds to March 30, 2003 03:00</li>
     * <li>March 30, 2003 02:10 rounds to March 30, 2003 03:00</li>
     * <li>March 30, 2003 02:40 rounds to March 30, 2003 04:00</li>
     * </ul>
     * 
     * @param date  the date to work with, either {@code Date} or {@code Calendar}, not null
     * @param field  the field from {@code Calendar} or <code>SEMI_MONTH</code>
     * @return the different rounded date, not null
     * @throws IllegalArgumentException if the date is <code>null</code>
     * @throws ClassCastException if the object type is not a {@code Date} or {@code Calendar}
     * @throws ArithmeticException if the year is over 280 million
     */
    public static Date round(final Object date, final int field) {try{__CLR4_5_2gmdgmdlvha7cf4.R.inc(21672);
        __CLR4_5_2gmdgmdlvha7cf4.R.inc(21673);if ((((date == null)&&(__CLR4_5_2gmdgmdlvha7cf4.R.iget(21674)!=0|true))||(__CLR4_5_2gmdgmdlvha7cf4.R.iget(21675)==0&false))) {{
            __CLR4_5_2gmdgmdlvha7cf4.R.inc(21676);throw new IllegalArgumentException("The date must not be null");
        }
        }__CLR4_5_2gmdgmdlvha7cf4.R.inc(21677);if ((((date instanceof Date)&&(__CLR4_5_2gmdgmdlvha7cf4.R.iget(21678)!=0|true))||(__CLR4_5_2gmdgmdlvha7cf4.R.iget(21679)==0&false))) {{
            __CLR4_5_2gmdgmdlvha7cf4.R.inc(21680);return round((Date) date, field);
        } }else {__CLR4_5_2gmdgmdlvha7cf4.R.inc(21681);if ((((date instanceof Calendar)&&(__CLR4_5_2gmdgmdlvha7cf4.R.iget(21682)!=0|true))||(__CLR4_5_2gmdgmdlvha7cf4.R.iget(21683)==0&false))) {{
            __CLR4_5_2gmdgmdlvha7cf4.R.inc(21684);return round((Calendar) date, field).getTime();
        } }else {{
            __CLR4_5_2gmdgmdlvha7cf4.R.inc(21685);throw new ClassCastException("Could not round " + date);
        }
    }}}finally{__CLR4_5_2gmdgmdlvha7cf4.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * <p>Truncates a date, leaving the field specified as the most
     * significant field.</p>
     *
     * <p>For example, if you had the date-time of 28 Mar 2002
     * 13:45:01.231, if you passed with HOUR, it would return 28 Mar
     * 2002 13:00:00.000.  If this was passed with MONTH, it would
     * return 1 Mar 2002 0:00:00.000.</p>
     * 
     * @param date  the date to work with, not null
     * @param field  the field from {@code Calendar} or <code>SEMI_MONTH</code>
     * @return the different truncated date, not null
     * @throws IllegalArgumentException if the date is <code>null</code>
     * @throws ArithmeticException if the year is over 280 million
     */
    public static Date truncate(final Date date, final int field) {try{__CLR4_5_2gmdgmdlvha7cf4.R.inc(21686);
        __CLR4_5_2gmdgmdlvha7cf4.R.inc(21687);validateDateNotNull(date);
        __CLR4_5_2gmdgmdlvha7cf4.R.inc(21688);final Calendar gval = Calendar.getInstance();
        __CLR4_5_2gmdgmdlvha7cf4.R.inc(21689);gval.setTime(date);
        __CLR4_5_2gmdgmdlvha7cf4.R.inc(21690);modify(gval, field, ModifyType.TRUNCATE);
        __CLR4_5_2gmdgmdlvha7cf4.R.inc(21691);return gval.getTime();
    }finally{__CLR4_5_2gmdgmdlvha7cf4.R.flushNeeded();}}

    /**
     * <p>Truncates a date, leaving the field specified as the most
     * significant field.</p>
     *
     * <p>For example, if you had the date-time of 28 Mar 2002
     * 13:45:01.231, if you passed with HOUR, it would return 28 Mar
     * 2002 13:00:00.000.  If this was passed with MONTH, it would
     * return 1 Mar 2002 0:00:00.000.</p>
     * 
     * @param date  the date to work with, not null
     * @param field  the field from {@code Calendar} or <code>SEMI_MONTH</code>
     * @return the different truncated date, not null
     * @throws IllegalArgumentException if the date is <code>null</code>
     * @throws ArithmeticException if the year is over 280 million
     */
    public static Calendar truncate(final Calendar date, final int field) {try{__CLR4_5_2gmdgmdlvha7cf4.R.inc(21692);
        __CLR4_5_2gmdgmdlvha7cf4.R.inc(21693);if ((((date == null)&&(__CLR4_5_2gmdgmdlvha7cf4.R.iget(21694)!=0|true))||(__CLR4_5_2gmdgmdlvha7cf4.R.iget(21695)==0&false))) {{
            __CLR4_5_2gmdgmdlvha7cf4.R.inc(21696);throw new IllegalArgumentException("The date must not be null");
        }
        }__CLR4_5_2gmdgmdlvha7cf4.R.inc(21697);final Calendar truncated = (Calendar) date.clone();
        __CLR4_5_2gmdgmdlvha7cf4.R.inc(21698);modify(truncated, field, ModifyType.TRUNCATE);
        __CLR4_5_2gmdgmdlvha7cf4.R.inc(21699);return truncated;
    }finally{__CLR4_5_2gmdgmdlvha7cf4.R.flushNeeded();}}

    /**
     * <p>Truncates a date, leaving the field specified as the most
     * significant field.</p>
     *
     * <p>For example, if you had the date-time of 28 Mar 2002
     * 13:45:01.231, if you passed with HOUR, it would return 28 Mar
     * 2002 13:00:00.000.  If this was passed with MONTH, it would
     * return 1 Mar 2002 0:00:00.000.</p>
     * 
     * @param date  the date to work with, either {@code Date} or {@code Calendar}, not null
     * @param field  the field from {@code Calendar} or <code>SEMI_MONTH</code>
     * @return the different truncated date, not null
     * @throws IllegalArgumentException if the date is <code>null</code>
     * @throws ClassCastException if the object type is not a {@code Date} or {@code Calendar}
     * @throws ArithmeticException if the year is over 280 million
     */
    public static Date truncate(final Object date, final int field) {try{__CLR4_5_2gmdgmdlvha7cf4.R.inc(21700);
        __CLR4_5_2gmdgmdlvha7cf4.R.inc(21701);if ((((date == null)&&(__CLR4_5_2gmdgmdlvha7cf4.R.iget(21702)!=0|true))||(__CLR4_5_2gmdgmdlvha7cf4.R.iget(21703)==0&false))) {{
            __CLR4_5_2gmdgmdlvha7cf4.R.inc(21704);throw new IllegalArgumentException("The date must not be null");
        }
        }__CLR4_5_2gmdgmdlvha7cf4.R.inc(21705);if ((((date instanceof Date)&&(__CLR4_5_2gmdgmdlvha7cf4.R.iget(21706)!=0|true))||(__CLR4_5_2gmdgmdlvha7cf4.R.iget(21707)==0&false))) {{
            __CLR4_5_2gmdgmdlvha7cf4.R.inc(21708);return truncate((Date) date, field);
        } }else {__CLR4_5_2gmdgmdlvha7cf4.R.inc(21709);if ((((date instanceof Calendar)&&(__CLR4_5_2gmdgmdlvha7cf4.R.iget(21710)!=0|true))||(__CLR4_5_2gmdgmdlvha7cf4.R.iget(21711)==0&false))) {{
            __CLR4_5_2gmdgmdlvha7cf4.R.inc(21712);return truncate((Calendar) date, field).getTime();
        } }else {{
            __CLR4_5_2gmdgmdlvha7cf4.R.inc(21713);throw new ClassCastException("Could not truncate " + date);
        }
    }}}finally{__CLR4_5_2gmdgmdlvha7cf4.R.flushNeeded();}}
    
  //-----------------------------------------------------------------------
    /**
     * <p>Gets a date ceiling, leaving the field specified as the most
     * significant field.</p>
     *
     * <p>For example, if you had the date-time of 28 Mar 2002
     * 13:45:01.231, if you passed with HOUR, it would return 28 Mar
     * 2002 14:00:00.000.  If this was passed with MONTH, it would
     * return 1 Apr 2002 0:00:00.000.</p>
     * 
     * @param date  the date to work with, not null
     * @param field  the field from {@code Calendar} or <code>SEMI_MONTH</code>
     * @return the different ceil date, not null
     * @throws IllegalArgumentException if the date is <code>null</code>
     * @throws ArithmeticException if the year is over 280 million
     * @since 2.5
     */
    public static Date ceiling(final Date date, final int field) {try{__CLR4_5_2gmdgmdlvha7cf4.R.inc(21714);
        __CLR4_5_2gmdgmdlvha7cf4.R.inc(21715);validateDateNotNull(date);
        __CLR4_5_2gmdgmdlvha7cf4.R.inc(21716);final Calendar gval = Calendar.getInstance();
        __CLR4_5_2gmdgmdlvha7cf4.R.inc(21717);gval.setTime(date);
        __CLR4_5_2gmdgmdlvha7cf4.R.inc(21718);modify(gval, field, ModifyType.CEILING);
        __CLR4_5_2gmdgmdlvha7cf4.R.inc(21719);return gval.getTime();
    }finally{__CLR4_5_2gmdgmdlvha7cf4.R.flushNeeded();}}

    /**
     * <p>Gets a date ceiling, leaving the field specified as the most
     * significant field.</p>
     *
     * <p>For example, if you had the date-time of 28 Mar 2002
     * 13:45:01.231, if you passed with HOUR, it would return 28 Mar
     * 2002 14:00:00.000.  If this was passed with MONTH, it would
     * return 1 Apr 2002 0:00:00.000.</p>
     * 
     * @param date  the date to work with, not null
     * @param field  the field from {@code Calendar} or <code>SEMI_MONTH</code>
     * @return the different ceil date, not null
     * @throws IllegalArgumentException if the date is <code>null</code>
     * @throws ArithmeticException if the year is over 280 million
     * @since 2.5
     */
    public static Calendar ceiling(final Calendar date, final int field) {try{__CLR4_5_2gmdgmdlvha7cf4.R.inc(21720);
        __CLR4_5_2gmdgmdlvha7cf4.R.inc(21721);if ((((date == null)&&(__CLR4_5_2gmdgmdlvha7cf4.R.iget(21722)!=0|true))||(__CLR4_5_2gmdgmdlvha7cf4.R.iget(21723)==0&false))) {{
            __CLR4_5_2gmdgmdlvha7cf4.R.inc(21724);throw new IllegalArgumentException("The date must not be null");
        }
        }__CLR4_5_2gmdgmdlvha7cf4.R.inc(21725);final Calendar ceiled = (Calendar) date.clone();
        __CLR4_5_2gmdgmdlvha7cf4.R.inc(21726);modify(ceiled, field, ModifyType.CEILING);
        __CLR4_5_2gmdgmdlvha7cf4.R.inc(21727);return ceiled;
    }finally{__CLR4_5_2gmdgmdlvha7cf4.R.flushNeeded();}}

    /**
     * <p>Gets a date ceiling, leaving the field specified as the most
     * significant field.</p>
     *
     * <p>For example, if you had the date-time of 28 Mar 2002
     * 13:45:01.231, if you passed with HOUR, it would return 28 Mar
     * 2002 14:00:00.000.  If this was passed with MONTH, it would
     * return 1 Apr 2002 0:00:00.000.</p>
     * 
     * @param date  the date to work with, either {@code Date} or {@code Calendar}, not null
     * @param field  the field from {@code Calendar} or <code>SEMI_MONTH</code>
     * @return the different ceil date, not null
     * @throws IllegalArgumentException if the date is <code>null</code>
     * @throws ClassCastException if the object type is not a {@code Date} or {@code Calendar}
     * @throws ArithmeticException if the year is over 280 million
     * @since 2.5
     */
    public static Date ceiling(final Object date, final int field) {try{__CLR4_5_2gmdgmdlvha7cf4.R.inc(21728);
        __CLR4_5_2gmdgmdlvha7cf4.R.inc(21729);if ((((date == null)&&(__CLR4_5_2gmdgmdlvha7cf4.R.iget(21730)!=0|true))||(__CLR4_5_2gmdgmdlvha7cf4.R.iget(21731)==0&false))) {{
            __CLR4_5_2gmdgmdlvha7cf4.R.inc(21732);throw new IllegalArgumentException("The date must not be null");
        }
        }__CLR4_5_2gmdgmdlvha7cf4.R.inc(21733);if ((((date instanceof Date)&&(__CLR4_5_2gmdgmdlvha7cf4.R.iget(21734)!=0|true))||(__CLR4_5_2gmdgmdlvha7cf4.R.iget(21735)==0&false))) {{
            __CLR4_5_2gmdgmdlvha7cf4.R.inc(21736);return ceiling((Date) date, field);
        } }else {__CLR4_5_2gmdgmdlvha7cf4.R.inc(21737);if ((((date instanceof Calendar)&&(__CLR4_5_2gmdgmdlvha7cf4.R.iget(21738)!=0|true))||(__CLR4_5_2gmdgmdlvha7cf4.R.iget(21739)==0&false))) {{
            __CLR4_5_2gmdgmdlvha7cf4.R.inc(21740);return ceiling((Calendar) date, field).getTime();
        } }else {{
            __CLR4_5_2gmdgmdlvha7cf4.R.inc(21741);throw new ClassCastException("Could not find ceiling of for type: " + date.getClass());
        }
    }}}finally{__CLR4_5_2gmdgmdlvha7cf4.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * <p>Internal calculation method.</p>
     * 
     * @param val  the calendar, not null
     * @param field  the field constant
     * @param modType  type to truncate, round or ceiling
     * @throws ArithmeticException if the year is over 280 million
     */
    private static void modify(final Calendar val, final int field, final ModifyType modType) {try{__CLR4_5_2gmdgmdlvha7cf4.R.inc(21742);
        __CLR4_5_2gmdgmdlvha7cf4.R.inc(21743);if ((((val.get(Calendar.YEAR) > 280000000)&&(__CLR4_5_2gmdgmdlvha7cf4.R.iget(21744)!=0|true))||(__CLR4_5_2gmdgmdlvha7cf4.R.iget(21745)==0&false))) {{
            __CLR4_5_2gmdgmdlvha7cf4.R.inc(21746);throw new ArithmeticException("Calendar value too large for accurate calculations");
        }
        
        }__CLR4_5_2gmdgmdlvha7cf4.R.inc(21747);if ((((field == Calendar.MILLISECOND)&&(__CLR4_5_2gmdgmdlvha7cf4.R.iget(21748)!=0|true))||(__CLR4_5_2gmdgmdlvha7cf4.R.iget(21749)==0&false))) {{
            __CLR4_5_2gmdgmdlvha7cf4.R.inc(21750);return;
        }

        // ----------------- Fix for LANG-59 ---------------------- START ---------------
        // see http://issues.apache.org/jira/browse/LANG-59
        //
        // Manually truncate milliseconds, seconds and minutes, rather than using
        // Calendar methods.

        }__CLR4_5_2gmdgmdlvha7cf4.R.inc(21751);final Date date = val.getTime();
        __CLR4_5_2gmdgmdlvha7cf4.R.inc(21752);long time = date.getTime();
        __CLR4_5_2gmdgmdlvha7cf4.R.inc(21753);boolean done = false;

        // truncate milliseconds
        __CLR4_5_2gmdgmdlvha7cf4.R.inc(21754);final int millisecs = val.get(Calendar.MILLISECOND);
        __CLR4_5_2gmdgmdlvha7cf4.R.inc(21755);if ((((ModifyType.TRUNCATE == modType || millisecs < 500)&&(__CLR4_5_2gmdgmdlvha7cf4.R.iget(21756)!=0|true))||(__CLR4_5_2gmdgmdlvha7cf4.R.iget(21757)==0&false))) {{
            __CLR4_5_2gmdgmdlvha7cf4.R.inc(21758);time = time - millisecs;
        }
        }__CLR4_5_2gmdgmdlvha7cf4.R.inc(21759);if ((((field == Calendar.SECOND)&&(__CLR4_5_2gmdgmdlvha7cf4.R.iget(21760)!=0|true))||(__CLR4_5_2gmdgmdlvha7cf4.R.iget(21761)==0&false))) {{
            __CLR4_5_2gmdgmdlvha7cf4.R.inc(21762);done = true;
        }

        // truncate seconds
        }__CLR4_5_2gmdgmdlvha7cf4.R.inc(21763);final int seconds = val.get(Calendar.SECOND);
        __CLR4_5_2gmdgmdlvha7cf4.R.inc(21764);if ((((!done && (ModifyType.TRUNCATE == modType || seconds < 30))&&(__CLR4_5_2gmdgmdlvha7cf4.R.iget(21765)!=0|true))||(__CLR4_5_2gmdgmdlvha7cf4.R.iget(21766)==0&false))) {{
            __CLR4_5_2gmdgmdlvha7cf4.R.inc(21767);time = time - (seconds * 1000L);
        }
        }__CLR4_5_2gmdgmdlvha7cf4.R.inc(21768);if ((((field == Calendar.MINUTE)&&(__CLR4_5_2gmdgmdlvha7cf4.R.iget(21769)!=0|true))||(__CLR4_5_2gmdgmdlvha7cf4.R.iget(21770)==0&false))) {{
            __CLR4_5_2gmdgmdlvha7cf4.R.inc(21771);done = true;
        }

        // truncate minutes
        }__CLR4_5_2gmdgmdlvha7cf4.R.inc(21772);final int minutes = val.get(Calendar.MINUTE);
        __CLR4_5_2gmdgmdlvha7cf4.R.inc(21773);if ((((!done && (ModifyType.TRUNCATE == modType || minutes < 30))&&(__CLR4_5_2gmdgmdlvha7cf4.R.iget(21774)!=0|true))||(__CLR4_5_2gmdgmdlvha7cf4.R.iget(21775)==0&false))) {{
            __CLR4_5_2gmdgmdlvha7cf4.R.inc(21776);time = time - (minutes * 60000L);
        }

        // reset time
        }__CLR4_5_2gmdgmdlvha7cf4.R.inc(21777);if ((((date.getTime() != time)&&(__CLR4_5_2gmdgmdlvha7cf4.R.iget(21778)!=0|true))||(__CLR4_5_2gmdgmdlvha7cf4.R.iget(21779)==0&false))) {{
            __CLR4_5_2gmdgmdlvha7cf4.R.inc(21780);date.setTime(time);
            __CLR4_5_2gmdgmdlvha7cf4.R.inc(21781);val.setTime(date);
        }
        // ----------------- Fix for LANG-59 ----------------------- END ----------------

        }__CLR4_5_2gmdgmdlvha7cf4.R.inc(21782);boolean roundUp = false;
        __CLR4_5_2gmdgmdlvha7cf4.R.inc(21783);for (final int[] aField : fields) {{
            __CLR4_5_2gmdgmdlvha7cf4.R.inc(21784);for (final int element : aField) {{
                __CLR4_5_2gmdgmdlvha7cf4.R.inc(21785);if ((((element == field)&&(__CLR4_5_2gmdgmdlvha7cf4.R.iget(21786)!=0|true))||(__CLR4_5_2gmdgmdlvha7cf4.R.iget(21787)==0&false))) {{
                    //This is our field... we stop looping
                    __CLR4_5_2gmdgmdlvha7cf4.R.inc(21788);if ((((modType == ModifyType.CEILING || modType == ModifyType.ROUND && roundUp)&&(__CLR4_5_2gmdgmdlvha7cf4.R.iget(21789)!=0|true))||(__CLR4_5_2gmdgmdlvha7cf4.R.iget(21790)==0&false))) {{
                        __CLR4_5_2gmdgmdlvha7cf4.R.inc(21791);if ((((field == DateUtils.SEMI_MONTH)&&(__CLR4_5_2gmdgmdlvha7cf4.R.iget(21792)!=0|true))||(__CLR4_5_2gmdgmdlvha7cf4.R.iget(21793)==0&false))) {{
                            //This is a special case that's hard to generalize
                            //If the date is 1, we round up to 16, otherwise
                            //  we subtract 15 days and add 1 month
                            __CLR4_5_2gmdgmdlvha7cf4.R.inc(21794);if ((((val.get(Calendar.DATE) == 1)&&(__CLR4_5_2gmdgmdlvha7cf4.R.iget(21795)!=0|true))||(__CLR4_5_2gmdgmdlvha7cf4.R.iget(21796)==0&false))) {{
                                __CLR4_5_2gmdgmdlvha7cf4.R.inc(21797);val.add(Calendar.DATE, 15);
                            } }else {{
                                __CLR4_5_2gmdgmdlvha7cf4.R.inc(21798);val.add(Calendar.DATE, -15);
                                __CLR4_5_2gmdgmdlvha7cf4.R.inc(21799);val.add(Calendar.MONTH, 1);
                            }
// ----------------- Fix for LANG-440 ---------------------- START ---------------
                        }} }else {__CLR4_5_2gmdgmdlvha7cf4.R.inc(21800);if ((((field == Calendar.AM_PM)&&(__CLR4_5_2gmdgmdlvha7cf4.R.iget(21801)!=0|true))||(__CLR4_5_2gmdgmdlvha7cf4.R.iget(21802)==0&false))) {{
                            // This is a special case
                            // If the time is 0, we round up to 12, otherwise
                            //  we subtract 12 hours and add 1 day
                            __CLR4_5_2gmdgmdlvha7cf4.R.inc(21803);if ((((val.get(Calendar.HOUR_OF_DAY) == 0)&&(__CLR4_5_2gmdgmdlvha7cf4.R.iget(21804)!=0|true))||(__CLR4_5_2gmdgmdlvha7cf4.R.iget(21805)==0&false))) {{
                                __CLR4_5_2gmdgmdlvha7cf4.R.inc(21806);val.add(Calendar.HOUR_OF_DAY, 12);
                            } }else {{
                                __CLR4_5_2gmdgmdlvha7cf4.R.inc(21807);val.add(Calendar.HOUR_OF_DAY, -12);
                                __CLR4_5_2gmdgmdlvha7cf4.R.inc(21808);val.add(Calendar.DATE, 1);
                            }
// ----------------- Fix for LANG-440 ---------------------- END ---------------
                        }} }else {{
                            //We need at add one to this field since the
                            //  last number causes us to round up
                            __CLR4_5_2gmdgmdlvha7cf4.R.inc(21809);val.add(aField[0], 1);
                        }
                    }}}
                    }__CLR4_5_2gmdgmdlvha7cf4.R.inc(21810);return;
                }
            }}
            //We have various fields that are not easy roundings
            }__CLR4_5_2gmdgmdlvha7cf4.R.inc(21811);int offset = 0;
            __CLR4_5_2gmdgmdlvha7cf4.R.inc(21812);boolean offsetSet = false;
            //These are special types of fields that require different rounding rules
            boolean __CLB4_5_2_bool0=false;__CLR4_5_2gmdgmdlvha7cf4.R.inc(21813);switch (field) {
                case DateUtils.SEMI_MONTH:if (!__CLB4_5_2_bool0) {__CLR4_5_2gmdgmdlvha7cf4.R.inc(21814);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2gmdgmdlvha7cf4.R.inc(21815);if ((((aField[0] == Calendar.DATE)&&(__CLR4_5_2gmdgmdlvha7cf4.R.iget(21816)!=0|true))||(__CLR4_5_2gmdgmdlvha7cf4.R.iget(21817)==0&false))) {{
                        //If we're going to drop the DATE field's value,
                        //  we want to do this our own way.
                        //We need to subtrace 1 since the date has a minimum of 1
                        __CLR4_5_2gmdgmdlvha7cf4.R.inc(21818);offset = val.get(Calendar.DATE) - 1;
                        //If we're above 15 days adjustment, that means we're in the
                        //  bottom half of the month and should stay accordingly.
                        __CLR4_5_2gmdgmdlvha7cf4.R.inc(21819);if ((((offset >= 15)&&(__CLR4_5_2gmdgmdlvha7cf4.R.iget(21820)!=0|true))||(__CLR4_5_2gmdgmdlvha7cf4.R.iget(21821)==0&false))) {{
                            __CLR4_5_2gmdgmdlvha7cf4.R.inc(21822);offset -= 15;
                        }
                        //Record whether we're in the top or bottom half of that range
                        }__CLR4_5_2gmdgmdlvha7cf4.R.inc(21823);roundUp = offset > 7;
                        __CLR4_5_2gmdgmdlvha7cf4.R.inc(21824);offsetSet = true;
                    }
                    }__CLR4_5_2gmdgmdlvha7cf4.R.inc(21825);break;
                case Calendar.AM_PM:if (!__CLB4_5_2_bool0) {__CLR4_5_2gmdgmdlvha7cf4.R.inc(21826);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2gmdgmdlvha7cf4.R.inc(21827);if ((((aField[0] == Calendar.HOUR_OF_DAY)&&(__CLR4_5_2gmdgmdlvha7cf4.R.iget(21828)!=0|true))||(__CLR4_5_2gmdgmdlvha7cf4.R.iget(21829)==0&false))) {{
                        //If we're going to drop the HOUR field's value,
                        //  we want to do this our own way.
                        __CLR4_5_2gmdgmdlvha7cf4.R.inc(21830);offset = val.get(Calendar.HOUR_OF_DAY);
                        __CLR4_5_2gmdgmdlvha7cf4.R.inc(21831);if ((((offset >= 12)&&(__CLR4_5_2gmdgmdlvha7cf4.R.iget(21832)!=0|true))||(__CLR4_5_2gmdgmdlvha7cf4.R.iget(21833)==0&false))) {{
                            __CLR4_5_2gmdgmdlvha7cf4.R.inc(21834);offset -= 12;
                        }
                        }__CLR4_5_2gmdgmdlvha7cf4.R.inc(21835);roundUp = offset >= 6;
                        __CLR4_5_2gmdgmdlvha7cf4.R.inc(21836);offsetSet = true;
                    }
                    }__CLR4_5_2gmdgmdlvha7cf4.R.inc(21837);break;
                default:if (!__CLB4_5_2_bool0) {__CLR4_5_2gmdgmdlvha7cf4.R.inc(21838);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2gmdgmdlvha7cf4.R.inc(21839);break;
            }
            __CLR4_5_2gmdgmdlvha7cf4.R.inc(21840);if ((((!offsetSet)&&(__CLR4_5_2gmdgmdlvha7cf4.R.iget(21841)!=0|true))||(__CLR4_5_2gmdgmdlvha7cf4.R.iget(21842)==0&false))) {{
                __CLR4_5_2gmdgmdlvha7cf4.R.inc(21843);final int min = val.getActualMinimum(aField[0]);
                __CLR4_5_2gmdgmdlvha7cf4.R.inc(21844);final int max = val.getActualMaximum(aField[0]);
                //Calculate the offset from the minimum allowed value
                __CLR4_5_2gmdgmdlvha7cf4.R.inc(21845);offset = val.get(aField[0]) - min;
                //Set roundUp if this is more than half way between the minimum and maximum
                __CLR4_5_2gmdgmdlvha7cf4.R.inc(21846);roundUp = offset > ((max - min) / 2);
            }
            //We need to remove this field
            }__CLR4_5_2gmdgmdlvha7cf4.R.inc(21847);if ((((offset != 0)&&(__CLR4_5_2gmdgmdlvha7cf4.R.iget(21848)!=0|true))||(__CLR4_5_2gmdgmdlvha7cf4.R.iget(21849)==0&false))) {{
                __CLR4_5_2gmdgmdlvha7cf4.R.inc(21850);val.set(aField[0], val.get(aField[0]) - offset);
            }
        }}
        }__CLR4_5_2gmdgmdlvha7cf4.R.inc(21851);throw new IllegalArgumentException("The field " + field + " is not supported");

    }finally{__CLR4_5_2gmdgmdlvha7cf4.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * <p>Constructs an <code>Iterator</code> over each day in a date
     * range defined by a focus date and range style.</p>
     *
     * <p>For instance, passing Thursday, July 4, 2002 and a
     * <code>RANGE_MONTH_SUNDAY</code> will return an <code>Iterator</code>
     * that starts with Sunday, June 30, 2002 and ends with Saturday, August 3,
     * 2002, returning a Calendar instance for each intermediate day.</p>
     *
     * <p>This method provides an iterator that returns Calendar objects.
     * The days are progressed using {@link Calendar#add(int, int)}.</p>
     *
     * @param focus  the date to work with, not null
     * @param rangeStyle  the style constant to use. Must be one of
     * {@link DateUtils#RANGE_MONTH_SUNDAY}, 
     * {@link DateUtils#RANGE_MONTH_MONDAY},
     * {@link DateUtils#RANGE_WEEK_SUNDAY},
     * {@link DateUtils#RANGE_WEEK_MONDAY},
     * {@link DateUtils#RANGE_WEEK_RELATIVE},
     * {@link DateUtils#RANGE_WEEK_CENTER}
     * @return the date iterator, not null, not null
     * @throws IllegalArgumentException if the date is <code>null</code>
     * @throws IllegalArgumentException if the rangeStyle is invalid
     */
    public static Iterator<Calendar> iterator(final Date focus, final int rangeStyle) {try{__CLR4_5_2gmdgmdlvha7cf4.R.inc(21852);
        __CLR4_5_2gmdgmdlvha7cf4.R.inc(21853);validateDateNotNull(focus);
        __CLR4_5_2gmdgmdlvha7cf4.R.inc(21854);final Calendar gval = Calendar.getInstance();
        __CLR4_5_2gmdgmdlvha7cf4.R.inc(21855);gval.setTime(focus);
        __CLR4_5_2gmdgmdlvha7cf4.R.inc(21856);return iterator(gval, rangeStyle);
    }finally{__CLR4_5_2gmdgmdlvha7cf4.R.flushNeeded();}}

    /**
     * <p>Constructs an <code>Iterator</code> over each day in a date
     * range defined by a focus date and range style.</p>
     *
     * <p>For instance, passing Thursday, July 4, 2002 and a
     * <code>RANGE_MONTH_SUNDAY</code> will return an <code>Iterator</code>
     * that starts with Sunday, June 30, 2002 and ends with Saturday, August 3,
     * 2002, returning a Calendar instance for each intermediate day.</p>
     *
     * <p>This method provides an iterator that returns Calendar objects.
     * The days are progressed using {@link Calendar#add(int, int)}.</p>
     *
     * @param focus  the date to work with, not null
     * @param rangeStyle  the style constant to use. Must be one of
     * {@link DateUtils#RANGE_MONTH_SUNDAY}, 
     * {@link DateUtils#RANGE_MONTH_MONDAY},
     * {@link DateUtils#RANGE_WEEK_SUNDAY},
     * {@link DateUtils#RANGE_WEEK_MONDAY},
     * {@link DateUtils#RANGE_WEEK_RELATIVE},
     * {@link DateUtils#RANGE_WEEK_CENTER}
     * @return the date iterator, not null
     * @throws IllegalArgumentException if the date is <code>null</code>
     * @throws IllegalArgumentException if the rangeStyle is invalid
     */
    public static Iterator<Calendar> iterator(final Calendar focus, final int rangeStyle) {try{__CLR4_5_2gmdgmdlvha7cf4.R.inc(21857);
        __CLR4_5_2gmdgmdlvha7cf4.R.inc(21858);if ((((focus == null)&&(__CLR4_5_2gmdgmdlvha7cf4.R.iget(21859)!=0|true))||(__CLR4_5_2gmdgmdlvha7cf4.R.iget(21860)==0&false))) {{
            __CLR4_5_2gmdgmdlvha7cf4.R.inc(21861);throw new IllegalArgumentException("The date must not be null");
        }
        }__CLR4_5_2gmdgmdlvha7cf4.R.inc(21862);Calendar start = null;
        __CLR4_5_2gmdgmdlvha7cf4.R.inc(21863);Calendar end = null;
        __CLR4_5_2gmdgmdlvha7cf4.R.inc(21864);int startCutoff = Calendar.SUNDAY;
        __CLR4_5_2gmdgmdlvha7cf4.R.inc(21865);int endCutoff = Calendar.SATURDAY;
        boolean __CLB4_5_2_bool1=false;__CLR4_5_2gmdgmdlvha7cf4.R.inc(21866);switch (rangeStyle) {
            case RANGE_MONTH_SUNDAY:if (!__CLB4_5_2_bool1) {__CLR4_5_2gmdgmdlvha7cf4.R.inc(21867);__CLB4_5_2_bool1=true;}
            case RANGE_MONTH_MONDAY:if (!__CLB4_5_2_bool1) {__CLR4_5_2gmdgmdlvha7cf4.R.inc(21868);__CLB4_5_2_bool1=true;}
                //Set start to the first of the month
                __CLR4_5_2gmdgmdlvha7cf4.R.inc(21869);start = truncate(focus, Calendar.MONTH);
                //Set end to the last of the month
                __CLR4_5_2gmdgmdlvha7cf4.R.inc(21870);end = (Calendar) start.clone();
                __CLR4_5_2gmdgmdlvha7cf4.R.inc(21871);end.add(Calendar.MONTH, 1);
                __CLR4_5_2gmdgmdlvha7cf4.R.inc(21872);end.add(Calendar.DATE, -1);
                //Loop start back to the previous sunday or monday
                __CLR4_5_2gmdgmdlvha7cf4.R.inc(21873);if ((((rangeStyle == RANGE_MONTH_MONDAY)&&(__CLR4_5_2gmdgmdlvha7cf4.R.iget(21874)!=0|true))||(__CLR4_5_2gmdgmdlvha7cf4.R.iget(21875)==0&false))) {{
                    __CLR4_5_2gmdgmdlvha7cf4.R.inc(21876);startCutoff = Calendar.MONDAY;
                    __CLR4_5_2gmdgmdlvha7cf4.R.inc(21877);endCutoff = Calendar.SUNDAY;
                }
                }__CLR4_5_2gmdgmdlvha7cf4.R.inc(21878);break;
            case RANGE_WEEK_SUNDAY:if (!__CLB4_5_2_bool1) {__CLR4_5_2gmdgmdlvha7cf4.R.inc(21879);__CLB4_5_2_bool1=true;}
            case RANGE_WEEK_MONDAY:if (!__CLB4_5_2_bool1) {__CLR4_5_2gmdgmdlvha7cf4.R.inc(21880);__CLB4_5_2_bool1=true;}
            case RANGE_WEEK_RELATIVE:if (!__CLB4_5_2_bool1) {__CLR4_5_2gmdgmdlvha7cf4.R.inc(21881);__CLB4_5_2_bool1=true;}
            case RANGE_WEEK_CENTER:if (!__CLB4_5_2_bool1) {__CLR4_5_2gmdgmdlvha7cf4.R.inc(21882);__CLB4_5_2_bool1=true;}
                //Set start and end to the current date
                __CLR4_5_2gmdgmdlvha7cf4.R.inc(21883);start = truncate(focus, Calendar.DATE);
                __CLR4_5_2gmdgmdlvha7cf4.R.inc(21884);end = truncate(focus, Calendar.DATE);
                boolean __CLB4_5_2_bool2=false;__CLR4_5_2gmdgmdlvha7cf4.R.inc(21885);switch (rangeStyle) {
                    case RANGE_WEEK_SUNDAY:if (!__CLB4_5_2_bool2) {__CLR4_5_2gmdgmdlvha7cf4.R.inc(21886);__CLB4_5_2_bool2=true;}
                        //already set by default
                        __CLR4_5_2gmdgmdlvha7cf4.R.inc(21887);break;
                    case RANGE_WEEK_MONDAY:if (!__CLB4_5_2_bool2) {__CLR4_5_2gmdgmdlvha7cf4.R.inc(21888);__CLB4_5_2_bool2=true;}
                        __CLR4_5_2gmdgmdlvha7cf4.R.inc(21889);startCutoff = Calendar.MONDAY;
                        __CLR4_5_2gmdgmdlvha7cf4.R.inc(21890);endCutoff = Calendar.SUNDAY;
                        __CLR4_5_2gmdgmdlvha7cf4.R.inc(21891);break;
                    case RANGE_WEEK_RELATIVE:if (!__CLB4_5_2_bool2) {__CLR4_5_2gmdgmdlvha7cf4.R.inc(21892);__CLB4_5_2_bool2=true;}
                        __CLR4_5_2gmdgmdlvha7cf4.R.inc(21893);startCutoff = focus.get(Calendar.DAY_OF_WEEK);
                        __CLR4_5_2gmdgmdlvha7cf4.R.inc(21894);endCutoff = startCutoff - 1;
                        __CLR4_5_2gmdgmdlvha7cf4.R.inc(21895);break;
                    case RANGE_WEEK_CENTER:if (!__CLB4_5_2_bool2) {__CLR4_5_2gmdgmdlvha7cf4.R.inc(21896);__CLB4_5_2_bool2=true;}
                        __CLR4_5_2gmdgmdlvha7cf4.R.inc(21897);startCutoff = focus.get(Calendar.DAY_OF_WEEK) - 3;
                        __CLR4_5_2gmdgmdlvha7cf4.R.inc(21898);endCutoff = focus.get(Calendar.DAY_OF_WEEK) + 3;
                        __CLR4_5_2gmdgmdlvha7cf4.R.inc(21899);break;
                    default:if (!__CLB4_5_2_bool2) {__CLR4_5_2gmdgmdlvha7cf4.R.inc(21900);__CLB4_5_2_bool2=true;}
                        __CLR4_5_2gmdgmdlvha7cf4.R.inc(21901);break;
                }
                __CLR4_5_2gmdgmdlvha7cf4.R.inc(21902);break;
            default:if (!__CLB4_5_2_bool1) {__CLR4_5_2gmdgmdlvha7cf4.R.inc(21903);__CLB4_5_2_bool1=true;}
                __CLR4_5_2gmdgmdlvha7cf4.R.inc(21904);throw new IllegalArgumentException("The range style " + rangeStyle + " is not valid.");
        }
        __CLR4_5_2gmdgmdlvha7cf4.R.inc(21905);if ((((startCutoff < Calendar.SUNDAY)&&(__CLR4_5_2gmdgmdlvha7cf4.R.iget(21906)!=0|true))||(__CLR4_5_2gmdgmdlvha7cf4.R.iget(21907)==0&false))) {{
            __CLR4_5_2gmdgmdlvha7cf4.R.inc(21908);startCutoff += 7;
        }
        }__CLR4_5_2gmdgmdlvha7cf4.R.inc(21909);if ((((startCutoff > Calendar.SATURDAY)&&(__CLR4_5_2gmdgmdlvha7cf4.R.iget(21910)!=0|true))||(__CLR4_5_2gmdgmdlvha7cf4.R.iget(21911)==0&false))) {{
            __CLR4_5_2gmdgmdlvha7cf4.R.inc(21912);startCutoff -= 7;
        }
        }__CLR4_5_2gmdgmdlvha7cf4.R.inc(21913);if ((((endCutoff < Calendar.SUNDAY)&&(__CLR4_5_2gmdgmdlvha7cf4.R.iget(21914)!=0|true))||(__CLR4_5_2gmdgmdlvha7cf4.R.iget(21915)==0&false))) {{
            __CLR4_5_2gmdgmdlvha7cf4.R.inc(21916);endCutoff += 7;
        }
        }__CLR4_5_2gmdgmdlvha7cf4.R.inc(21917);if ((((endCutoff > Calendar.SATURDAY)&&(__CLR4_5_2gmdgmdlvha7cf4.R.iget(21918)!=0|true))||(__CLR4_5_2gmdgmdlvha7cf4.R.iget(21919)==0&false))) {{
            __CLR4_5_2gmdgmdlvha7cf4.R.inc(21920);endCutoff -= 7;
        }
        }__CLR4_5_2gmdgmdlvha7cf4.R.inc(21921);while ((((start.get(Calendar.DAY_OF_WEEK) != startCutoff)&&(__CLR4_5_2gmdgmdlvha7cf4.R.iget(21922)!=0|true))||(__CLR4_5_2gmdgmdlvha7cf4.R.iget(21923)==0&false))) {{
            __CLR4_5_2gmdgmdlvha7cf4.R.inc(21924);start.add(Calendar.DATE, -1);
        }
        }__CLR4_5_2gmdgmdlvha7cf4.R.inc(21925);while ((((end.get(Calendar.DAY_OF_WEEK) != endCutoff)&&(__CLR4_5_2gmdgmdlvha7cf4.R.iget(21926)!=0|true))||(__CLR4_5_2gmdgmdlvha7cf4.R.iget(21927)==0&false))) {{
            __CLR4_5_2gmdgmdlvha7cf4.R.inc(21928);end.add(Calendar.DATE, 1);
        }
        }__CLR4_5_2gmdgmdlvha7cf4.R.inc(21929);return new DateIterator(start, end);
    }finally{__CLR4_5_2gmdgmdlvha7cf4.R.flushNeeded();}}

    /**
     * <p>Constructs an <code>Iterator</code> over each day in a date
     * range defined by a focus date and range style.</p>
     *
     * <p>For instance, passing Thursday, July 4, 2002 and a
     * <code>RANGE_MONTH_SUNDAY</code> will return an <code>Iterator</code>
     * that starts with Sunday, June 30, 2002 and ends with Saturday, August 3,
     * 2002, returning a Calendar instance for each intermediate day.</p>
     *
     * @param focus  the date to work with, either {@code Date} or {@code Calendar}, not null
     * @param rangeStyle  the style constant to use. Must be one of the range
     * styles listed for the {@link #iterator(Calendar, int)} method.
     * @return the date iterator, not null
     * @throws IllegalArgumentException if the date is <code>null</code>
     * @throws ClassCastException if the object type is not a {@code Date} or {@code Calendar}
     */
    public static Iterator<?> iterator(final Object focus, final int rangeStyle) {try{__CLR4_5_2gmdgmdlvha7cf4.R.inc(21930);
        __CLR4_5_2gmdgmdlvha7cf4.R.inc(21931);if ((((focus == null)&&(__CLR4_5_2gmdgmdlvha7cf4.R.iget(21932)!=0|true))||(__CLR4_5_2gmdgmdlvha7cf4.R.iget(21933)==0&false))) {{
            __CLR4_5_2gmdgmdlvha7cf4.R.inc(21934);throw new IllegalArgumentException("The date must not be null");
        }
        }__CLR4_5_2gmdgmdlvha7cf4.R.inc(21935);if ((((focus instanceof Date)&&(__CLR4_5_2gmdgmdlvha7cf4.R.iget(21936)!=0|true))||(__CLR4_5_2gmdgmdlvha7cf4.R.iget(21937)==0&false))) {{
            __CLR4_5_2gmdgmdlvha7cf4.R.inc(21938);return iterator((Date) focus, rangeStyle);
        } }else {__CLR4_5_2gmdgmdlvha7cf4.R.inc(21939);if ((((focus instanceof Calendar)&&(__CLR4_5_2gmdgmdlvha7cf4.R.iget(21940)!=0|true))||(__CLR4_5_2gmdgmdlvha7cf4.R.iget(21941)==0&false))) {{
            __CLR4_5_2gmdgmdlvha7cf4.R.inc(21942);return iterator((Calendar) focus, rangeStyle);
        } }else {{
            __CLR4_5_2gmdgmdlvha7cf4.R.inc(21943);throw new ClassCastException("Could not iterate based on " + focus);
        }
    }}}finally{__CLR4_5_2gmdgmdlvha7cf4.R.flushNeeded();}}
    
    /**
     * <p>Returns the number of milliseconds within the 
     * fragment. All datefields greater than the fragment will be ignored.</p>
     * 
     * <p>Asking the milliseconds of any date will only return the number of milliseconds
     * of the current second (resulting in a number between 0 and 999). This 
     * method will retrieve the number of milliseconds for any fragment. 
     * For example, if you want to calculate the number of milliseconds past today, 
     * your fragment is Calendar.DATE or Calendar.DAY_OF_YEAR. The result will
     * be all milliseconds of the past hour(s), minutes(s) and second(s).</p>
     * 
     * <p>Valid fragments are: Calendar.YEAR, Calendar.MONTH, both 
     * Calendar.DAY_OF_YEAR and Calendar.DATE, Calendar.HOUR_OF_DAY, 
     * Calendar.MINUTE, Calendar.SECOND and Calendar.MILLISECOND
     * A fragment less than or equal to a SECOND field will return 0.</p> 
     * 
     * <ul>
     *  <li>January 1, 2008 7:15:10.538 with Calendar.SECOND as fragment will return 538</li>
     *  <li>January 6, 2008 7:15:10.538 with Calendar.SECOND as fragment will return 538</li>
     *  <li>January 6, 2008 7:15:10.538 with Calendar.MINUTE as fragment will return 10538 (10*1000 + 538)</li>
     *  <li>January 16, 2008 7:15:10.538 with Calendar.MILLISECOND as fragment will return 0
     *   (a millisecond cannot be split in milliseconds)</li>
     * </ul>
     * 
     * @param date the date to work with, not null
     * @param fragment the {@code Calendar} field part of date to calculate 
     * @return number of milliseconds within the fragment of date
     * @throws IllegalArgumentException if the date is <code>null</code> or
     * fragment is not supported
     * @since 2.4
     */
    public static long getFragmentInMilliseconds(final Date date, final int fragment) {try{__CLR4_5_2gmdgmdlvha7cf4.R.inc(21944);
        __CLR4_5_2gmdgmdlvha7cf4.R.inc(21945);return getFragment(date, fragment, TimeUnit.MILLISECONDS);    
    }finally{__CLR4_5_2gmdgmdlvha7cf4.R.flushNeeded();}}
    
    /**
     * <p>Returns the number of seconds within the 
     * fragment. All datefields greater than the fragment will be ignored.</p> 
     * 
     * <p>Asking the seconds of any date will only return the number of seconds
     * of the current minute (resulting in a number between 0 and 59). This 
     * method will retrieve the number of seconds for any fragment. 
     * For example, if you want to calculate the number of seconds past today, 
     * your fragment is Calendar.DATE or Calendar.DAY_OF_YEAR. The result will
     * be all seconds of the past hour(s) and minutes(s).</p> 
     * 
     * <p>Valid fragments are: Calendar.YEAR, Calendar.MONTH, both 
     * Calendar.DAY_OF_YEAR and Calendar.DATE, Calendar.HOUR_OF_DAY, 
     * Calendar.MINUTE, Calendar.SECOND and Calendar.MILLISECOND
     * A fragment less than or equal to a SECOND field will return 0.</p> 
     * 
     * <ul>
     *  <li>January 1, 2008 7:15:10.538 with Calendar.MINUTE as fragment will return 10
     *   (equivalent to deprecated date.getSeconds())</li>
     *  <li>January 6, 2008 7:15:10.538 with Calendar.MINUTE as fragment will return 10
     *   (equivalent to deprecated date.getSeconds())</li>
     *  <li>January 6, 2008 7:15:10.538 with Calendar.DAY_OF_YEAR as fragment will return 26110
     *   (7*3600 + 15*60 + 10)</li>
     *  <li>January 16, 2008 7:15:10.538 with Calendar.MILLISECOND as fragment will return 0
     *   (a millisecond cannot be split in seconds)</li>
     * </ul>
     * 
     * @param date the date to work with, not null
     * @param fragment the {@code Calendar} field part of date to calculate 
     * @return number of seconds within the fragment of date
     * @throws IllegalArgumentException if the date is <code>null</code> or
     * fragment is not supported
     * @since 2.4
     */
    public static long getFragmentInSeconds(final Date date, final int fragment) {try{__CLR4_5_2gmdgmdlvha7cf4.R.inc(21946);
        __CLR4_5_2gmdgmdlvha7cf4.R.inc(21947);return getFragment(date, fragment, TimeUnit.SECONDS);
    }finally{__CLR4_5_2gmdgmdlvha7cf4.R.flushNeeded();}}
    
    /**
     * <p>Returns the number of minutes within the 
     * fragment. All datefields greater than the fragment will be ignored.</p> 
     * 
     * <p>Asking the minutes of any date will only return the number of minutes
     * of the current hour (resulting in a number between 0 and 59). This 
     * method will retrieve the number of minutes for any fragment. 
     * For example, if you want to calculate the number of minutes past this month, 
     * your fragment is Calendar.MONTH. The result will be all minutes of the 
     * past day(s) and hour(s).</p> 
     * 
     * <p>Valid fragments are: Calendar.YEAR, Calendar.MONTH, both 
     * Calendar.DAY_OF_YEAR and Calendar.DATE, Calendar.HOUR_OF_DAY, 
     * Calendar.MINUTE, Calendar.SECOND and Calendar.MILLISECOND
     * A fragment less than or equal to a MINUTE field will return 0.</p> 
     * 
     * <ul>
     *  <li>January 1, 2008 7:15:10.538 with Calendar.HOUR_OF_DAY as fragment will return 15
     *   (equivalent to deprecated date.getMinutes())</li>
     *  <li>January 6, 2008 7:15:10.538 with Calendar.HOUR_OF_DAY as fragment will return 15
     *   (equivalent to deprecated date.getMinutes())</li>
     *  <li>January 1, 2008 7:15:10.538 with Calendar.MONTH as fragment will return 15</li>
     *  <li>January 6, 2008 7:15:10.538 with Calendar.MONTH as fragment will return 435 (7*60 + 15)</li>
     *  <li>January 16, 2008 7:15:10.538 with Calendar.MILLISECOND as fragment will return 0
     *   (a millisecond cannot be split in minutes)</li>
     * </ul>
     * 
     * @param date the date to work with, not null
     * @param fragment the {@code Calendar} field part of date to calculate 
     * @return number of minutes within the fragment of date
     * @throws IllegalArgumentException if the date is <code>null</code> or 
     * fragment is not supported
     * @since 2.4
     */
    public static long getFragmentInMinutes(final Date date, final int fragment) {try{__CLR4_5_2gmdgmdlvha7cf4.R.inc(21948);
        __CLR4_5_2gmdgmdlvha7cf4.R.inc(21949);return getFragment(date, fragment, TimeUnit.MINUTES);
    }finally{__CLR4_5_2gmdgmdlvha7cf4.R.flushNeeded();}}
    
    /**
     * <p>Returns the number of hours within the 
     * fragment. All datefields greater than the fragment will be ignored.</p> 
     * 
     * <p>Asking the hours of any date will only return the number of hours
     * of the current day (resulting in a number between 0 and 23). This 
     * method will retrieve the number of hours for any fragment. 
     * For example, if you want to calculate the number of hours past this month, 
     * your fragment is Calendar.MONTH. The result will be all hours of the 
     * past day(s).</p> 
     * 
     * <p>Valid fragments are: Calendar.YEAR, Calendar.MONTH, both 
     * Calendar.DAY_OF_YEAR and Calendar.DATE, Calendar.HOUR_OF_DAY, 
     * Calendar.MINUTE, Calendar.SECOND and Calendar.MILLISECOND
     * A fragment less than or equal to a HOUR field will return 0.</p> 
     * 
     * <ul>
     *  <li>January 1, 2008 7:15:10.538 with Calendar.DAY_OF_YEAR as fragment will return 7
     *   (equivalent to deprecated date.getHours())</li>
     *  <li>January 6, 2008 7:15:10.538 with Calendar.DAY_OF_YEAR as fragment will return 7
     *   (equivalent to deprecated date.getHours())</li>
     *  <li>January 1, 2008 7:15:10.538 with Calendar.MONTH as fragment will return 7</li>
     *  <li>January 6, 2008 7:15:10.538 with Calendar.MONTH as fragment will return 127 (5*24 + 7)</li>
     *  <li>January 16, 2008 7:15:10.538 with Calendar.MILLISECOND as fragment will return 0
     *   (a millisecond cannot be split in hours)</li>
     * </ul>
     * 
     * @param date the date to work with, not null
     * @param fragment the {@code Calendar} field part of date to calculate 
     * @return number of hours within the fragment of date
     * @throws IllegalArgumentException if the date is <code>null</code> or 
     * fragment is not supported
     * @since 2.4
     */
    public static long getFragmentInHours(final Date date, final int fragment) {try{__CLR4_5_2gmdgmdlvha7cf4.R.inc(21950);
        __CLR4_5_2gmdgmdlvha7cf4.R.inc(21951);return getFragment(date, fragment, TimeUnit.HOURS);
    }finally{__CLR4_5_2gmdgmdlvha7cf4.R.flushNeeded();}}
    
    /**
     * <p>Returns the number of days within the 
     * fragment. All datefields greater than the fragment will be ignored.</p> 
     * 
     * <p>Asking the days of any date will only return the number of days
     * of the current month (resulting in a number between 1 and 31). This 
     * method will retrieve the number of days for any fragment. 
     * For example, if you want to calculate the number of days past this year, 
     * your fragment is Calendar.YEAR. The result will be all days of the 
     * past month(s).</p> 
     * 
     * <p>Valid fragments are: Calendar.YEAR, Calendar.MONTH, both 
     * Calendar.DAY_OF_YEAR and Calendar.DATE, Calendar.HOUR_OF_DAY, 
     * Calendar.MINUTE, Calendar.SECOND and Calendar.MILLISECOND
     * A fragment less than or equal to a DAY field will return 0.</p> 
     *  
     * <ul>
     *  <li>January 28, 2008 with Calendar.MONTH as fragment will return 28
     *   (equivalent to deprecated date.getDay())</li>
     *  <li>February 28, 2008 with Calendar.MONTH as fragment will return 28
     *   (equivalent to deprecated date.getDay())</li>
     *  <li>January 28, 2008 with Calendar.YEAR as fragment will return 28</li>
     *  <li>February 28, 2008 with Calendar.YEAR as fragment will return 59</li>
     *  <li>January 28, 2008 with Calendar.MILLISECOND as fragment will return 0
     *   (a millisecond cannot be split in days)</li>
     * </ul>
     * 
     * @param date the date to work with, not null
     * @param fragment the {@code Calendar} field part of date to calculate 
     * @return number of days  within the fragment of date
     * @throws IllegalArgumentException if the date is <code>null</code> or 
     * fragment is not supported
     * @since 2.4
     */
    public static long getFragmentInDays(final Date date, final int fragment) {try{__CLR4_5_2gmdgmdlvha7cf4.R.inc(21952);
        __CLR4_5_2gmdgmdlvha7cf4.R.inc(21953);return getFragment(date, fragment, TimeUnit.DAYS);
    }finally{__CLR4_5_2gmdgmdlvha7cf4.R.flushNeeded();}}

    /**
     * <p>Returns the number of milliseconds within the 
     * fragment. All datefields greater than the fragment will be ignored.</p> 
     * 
     * <p>Asking the milliseconds of any date will only return the number of milliseconds
     * of the current second (resulting in a number between 0 and 999). This 
     * method will retrieve the number of milliseconds for any fragment. 
     * For example, if you want to calculate the number of seconds past today, 
     * your fragment is Calendar.DATE or Calendar.DAY_OF_YEAR. The result will
     * be all seconds of the past hour(s), minutes(s) and second(s).</p> 
     * 
     * <p>Valid fragments are: Calendar.YEAR, Calendar.MONTH, both 
     * Calendar.DAY_OF_YEAR and Calendar.DATE, Calendar.HOUR_OF_DAY, 
     * Calendar.MINUTE, Calendar.SECOND and Calendar.MILLISECOND
     * A fragment less than or equal to a MILLISECOND field will return 0.</p> 
     * 
     * <ul>
     *  <li>January 1, 2008 7:15:10.538 with Calendar.SECOND as fragment will return 538
     *   (equivalent to calendar.get(Calendar.MILLISECOND))</li>
     *  <li>January 6, 2008 7:15:10.538 with Calendar.SECOND as fragment will return 538
     *   (equivalent to calendar.get(Calendar.MILLISECOND))</li>
     *  <li>January 6, 2008 7:15:10.538 with Calendar.MINUTE as fragment will return 10538
     *   (10*1000 + 538)</li>
     *  <li>January 16, 2008 7:15:10.538 with Calendar.MILLISECOND as fragment will return 0
     *   (a millisecond cannot be split in milliseconds)</li>
     * </ul>
     * 
     * @param calendar the calendar to work with, not null
     * @param fragment the {@code Calendar} field part of calendar to calculate 
     * @return number of milliseconds within the fragment of date
     * @throws IllegalArgumentException if the date is <code>null</code> or 
     * fragment is not supported
     * @since 2.4
     */
  public static long getFragmentInMilliseconds(final Calendar calendar, final int fragment) {try{__CLR4_5_2gmdgmdlvha7cf4.R.inc(21954);
    __CLR4_5_2gmdgmdlvha7cf4.R.inc(21955);return getFragment(calendar, fragment, TimeUnit.MILLISECONDS);
  }finally{__CLR4_5_2gmdgmdlvha7cf4.R.flushNeeded();}}
    /**
     * <p>Returns the number of seconds within the 
     * fragment. All datefields greater than the fragment will be ignored.</p> 
     * 
     * <p>Asking the seconds of any date will only return the number of seconds
     * of the current minute (resulting in a number between 0 and 59). This 
     * method will retrieve the number of seconds for any fragment. 
     * For example, if you want to calculate the number of seconds past today, 
     * your fragment is Calendar.DATE or Calendar.DAY_OF_YEAR. The result will
     * be all seconds of the past hour(s) and minutes(s).</p> 
     * 
     * <p>Valid fragments are: Calendar.YEAR, Calendar.MONTH, both 
     * Calendar.DAY_OF_YEAR and Calendar.DATE, Calendar.HOUR_OF_DAY, 
     * Calendar.MINUTE, Calendar.SECOND and Calendar.MILLISECOND
     * A fragment less than or equal to a SECOND field will return 0.</p> 
     * 
     * <ul>
     *  <li>January 1, 2008 7:15:10.538 with Calendar.MINUTE as fragment will return 10
     *   (equivalent to calendar.get(Calendar.SECOND))</li>
     *  <li>January 6, 2008 7:15:10.538 with Calendar.MINUTE as fragment will return 10
     *   (equivalent to calendar.get(Calendar.SECOND))</li>
     *  <li>January 6, 2008 7:15:10.538 with Calendar.DAY_OF_YEAR as fragment will return 26110
     *   (7*3600 + 15*60 + 10)</li>
     *  <li>January 16, 2008 7:15:10.538 with Calendar.MILLISECOND as fragment will return 0
     *   (a millisecond cannot be split in seconds)</li>
     * </ul>
     * 
     * @param calendar the calendar to work with, not null
     * @param fragment the {@code Calendar} field part of calendar to calculate 
     * @return number of seconds within the fragment of date
     * @throws IllegalArgumentException if the date is <code>null</code> or 
     * fragment is not supported
     * @since 2.4
     */
    public static long getFragmentInSeconds(final Calendar calendar, final int fragment) {try{__CLR4_5_2gmdgmdlvha7cf4.R.inc(21956);
        __CLR4_5_2gmdgmdlvha7cf4.R.inc(21957);return getFragment(calendar, fragment, TimeUnit.SECONDS);
    }finally{__CLR4_5_2gmdgmdlvha7cf4.R.flushNeeded();}}
    
    /**
     * <p>Returns the number of minutes within the 
     * fragment. All datefields greater than the fragment will be ignored.</p> 
     * 
     * <p>Asking the minutes of any date will only return the number of minutes
     * of the current hour (resulting in a number between 0 and 59). This 
     * method will retrieve the number of minutes for any fragment. 
     * For example, if you want to calculate the number of minutes past this month, 
     * your fragment is Calendar.MONTH. The result will be all minutes of the 
     * past day(s) and hour(s).</p> 
     * 
     * <p>Valid fragments are: Calendar.YEAR, Calendar.MONTH, both 
     * Calendar.DAY_OF_YEAR and Calendar.DATE, Calendar.HOUR_OF_DAY, 
     * Calendar.MINUTE, Calendar.SECOND and Calendar.MILLISECOND
     * A fragment less than or equal to a MINUTE field will return 0.</p> 
     * 
     * <ul>
     *  <li>January 1, 2008 7:15:10.538 with Calendar.HOUR_OF_DAY as fragment will return 15
     *   (equivalent to calendar.get(Calendar.MINUTES))</li>
     *  <li>January 6, 2008 7:15:10.538 with Calendar.HOUR_OF_DAY as fragment will return 15
     *   (equivalent to calendar.get(Calendar.MINUTES))</li>
     *  <li>January 1, 2008 7:15:10.538 with Calendar.MONTH as fragment will return 15</li>
     *  <li>January 6, 2008 7:15:10.538 with Calendar.MONTH as fragment will return 435 (7*60 + 15)</li>
     *  <li>January 16, 2008 7:15:10.538 with Calendar.MILLISECOND as fragment will return 0
     *   (a millisecond cannot be split in minutes)</li>
     * </ul>
     * 
     * @param calendar the calendar to work with, not null
     * @param fragment the {@code Calendar} field part of calendar to calculate 
     * @return number of minutes within the fragment of date
     * @throws IllegalArgumentException if the date is <code>null</code> or 
     * fragment is not supported
     * @since 2.4
     */
    public static long getFragmentInMinutes(final Calendar calendar, final int fragment) {try{__CLR4_5_2gmdgmdlvha7cf4.R.inc(21958);
        __CLR4_5_2gmdgmdlvha7cf4.R.inc(21959);return getFragment(calendar, fragment, TimeUnit.MINUTES);
    }finally{__CLR4_5_2gmdgmdlvha7cf4.R.flushNeeded();}}
    
    /**
     * <p>Returns the number of hours within the 
     * fragment. All datefields greater than the fragment will be ignored.</p> 
     * 
     * <p>Asking the hours of any date will only return the number of hours
     * of the current day (resulting in a number between 0 and 23). This 
     * method will retrieve the number of hours for any fragment. 
     * For example, if you want to calculate the number of hours past this month, 
     * your fragment is Calendar.MONTH. The result will be all hours of the 
     * past day(s).</p> 
     * 
     * <p>Valid fragments are: Calendar.YEAR, Calendar.MONTH, both 
     * Calendar.DAY_OF_YEAR and Calendar.DATE, Calendar.HOUR_OF_DAY, 
     * Calendar.MINUTE, Calendar.SECOND and Calendar.MILLISECOND
     * A fragment less than or equal to a HOUR field will return 0.</p> 
     *  
     * <ul>
     *  <li>January 1, 2008 7:15:10.538 with Calendar.DAY_OF_YEAR as fragment will return 7
     *   (equivalent to calendar.get(Calendar.HOUR_OF_DAY))</li>
     *  <li>January 6, 2008 7:15:10.538 with Calendar.DAY_OF_YEAR as fragment will return 7
     *   (equivalent to calendar.get(Calendar.HOUR_OF_DAY))</li>
     *  <li>January 1, 2008 7:15:10.538 with Calendar.MONTH as fragment will return 7</li>
     *  <li>January 6, 2008 7:15:10.538 with Calendar.MONTH as fragment will return 127 (5*24 + 7)</li>
     *  <li>January 16, 2008 7:15:10.538 with Calendar.MILLISECOND as fragment will return 0
     *   (a millisecond cannot be split in hours)</li>
     * </ul>
     *  
     * @param calendar the calendar to work with, not null
     * @param fragment the {@code Calendar} field part of calendar to calculate 
     * @return number of hours within the fragment of date
     * @throws IllegalArgumentException if the date is <code>null</code> or 
     * fragment is not supported
     * @since 2.4
     */
    public static long getFragmentInHours(final Calendar calendar, final int fragment) {try{__CLR4_5_2gmdgmdlvha7cf4.R.inc(21960);
        __CLR4_5_2gmdgmdlvha7cf4.R.inc(21961);return getFragment(calendar, fragment, TimeUnit.HOURS);
    }finally{__CLR4_5_2gmdgmdlvha7cf4.R.flushNeeded();}}
    
    /**
     * <p>Returns the number of days within the 
     * fragment. All datefields greater than the fragment will be ignored.</p> 
     * 
     * <p>Asking the days of any date will only return the number of days
     * of the current month (resulting in a number between 1 and 31). This 
     * method will retrieve the number of days for any fragment. 
     * For example, if you want to calculate the number of days past this year, 
     * your fragment is Calendar.YEAR. The result will be all days of the 
     * past month(s).</p> 
     * 
     * <p>Valid fragments are: Calendar.YEAR, Calendar.MONTH, both 
     * Calendar.DAY_OF_YEAR and Calendar.DATE, Calendar.HOUR_OF_DAY, 
     * Calendar.MINUTE, Calendar.SECOND and Calendar.MILLISECOND
     * A fragment less than or equal to a DAY field will return 0.</p> 
     * 
     * <ul>
     *  <li>January 28, 2008 with Calendar.MONTH as fragment will return 28
     *   (equivalent to calendar.get(Calendar.DAY_OF_MONTH))</li>
     *  <li>February 28, 2008 with Calendar.MONTH as fragment will return 28
     *   (equivalent to calendar.get(Calendar.DAY_OF_MONTH))</li>
     *  <li>January 28, 2008 with Calendar.YEAR as fragment will return 28
     *   (equivalent to calendar.get(Calendar.DAY_OF_YEAR))</li>
     *  <li>February 28, 2008 with Calendar.YEAR as fragment will return 59
     *   (equivalent to calendar.get(Calendar.DAY_OF_YEAR))</li>
     *  <li>January 28, 2008 with Calendar.MILLISECOND as fragment will return 0
     *   (a millisecond cannot be split in days)</li>
     * </ul>
     * 
     * @param calendar the calendar to work with, not null
     * @param fragment the {@code Calendar} field part of calendar to calculate 
     * @return number of days within the fragment of date
     * @throws IllegalArgumentException if the date is <code>null</code> or 
     * fragment is not supported
     * @since 2.4
     */
    public static long getFragmentInDays(final Calendar calendar, final int fragment) {try{__CLR4_5_2gmdgmdlvha7cf4.R.inc(21962);
        __CLR4_5_2gmdgmdlvha7cf4.R.inc(21963);return getFragment(calendar, fragment, TimeUnit.DAYS);
    }finally{__CLR4_5_2gmdgmdlvha7cf4.R.flushNeeded();}}
    
    /**
     * Gets a Date fragment for any unit.
     * 
     * @param date the date to work with, not null
     * @param fragment the Calendar field part of date to calculate 
     * @param unit the time unit
     * @return number of units within the fragment of the date
     * @throws IllegalArgumentException if the date is <code>null</code> or 
     * fragment is not supported
     * @since 2.4
     */
    private static long getFragment(final Date date, final int fragment, final TimeUnit unit) {try{__CLR4_5_2gmdgmdlvha7cf4.R.inc(21964);
        __CLR4_5_2gmdgmdlvha7cf4.R.inc(21965);validateDateNotNull(date);
        __CLR4_5_2gmdgmdlvha7cf4.R.inc(21966);final Calendar calendar = Calendar.getInstance();
        __CLR4_5_2gmdgmdlvha7cf4.R.inc(21967);calendar.setTime(date);
        __CLR4_5_2gmdgmdlvha7cf4.R.inc(21968);return getFragment(calendar, fragment, unit);
    }finally{__CLR4_5_2gmdgmdlvha7cf4.R.flushNeeded();}}

    /**
     * Gets a Calendar fragment for any unit.
     * 
     * @param calendar the calendar to work with, not null
     * @param fragment the Calendar field part of calendar to calculate 
     * @param unit the time unit
     * @return number of units within the fragment of the calendar
     * @throws IllegalArgumentException if the date is <code>null</code> or 
     * fragment is not supported
     * @since 2.4
     */
    private static long getFragment(final Calendar calendar, final int fragment, final TimeUnit unit) {try{__CLR4_5_2gmdgmdlvha7cf4.R.inc(21969);
        __CLR4_5_2gmdgmdlvha7cf4.R.inc(21970);if((((calendar == null)&&(__CLR4_5_2gmdgmdlvha7cf4.R.iget(21971)!=0|true))||(__CLR4_5_2gmdgmdlvha7cf4.R.iget(21972)==0&false))) {{
            __CLR4_5_2gmdgmdlvha7cf4.R.inc(21973);throw  new IllegalArgumentException("The date must not be null"); 
        }

        }__CLR4_5_2gmdgmdlvha7cf4.R.inc(21974);long result = 0;
        
        __CLR4_5_2gmdgmdlvha7cf4.R.inc(21975);final int offset = ((((unit == TimeUnit.DAYS) )&&(__CLR4_5_2gmdgmdlvha7cf4.R.iget(21976)!=0|true))||(__CLR4_5_2gmdgmdlvha7cf4.R.iget(21977)==0&false))? 0 : 1;
        
        // Fragments bigger than a day require a breakdown to days
        boolean __CLB4_5_2_bool3=false;__CLR4_5_2gmdgmdlvha7cf4.R.inc(21978);switch (fragment) {
            case Calendar.YEAR:if (!__CLB4_5_2_bool3) {__CLR4_5_2gmdgmdlvha7cf4.R.inc(21979);__CLB4_5_2_bool3=true;}
                __CLR4_5_2gmdgmdlvha7cf4.R.inc(21980);result += unit.convert(calendar.get(Calendar.DAY_OF_YEAR) - offset, TimeUnit.DAYS);
                __CLR4_5_2gmdgmdlvha7cf4.R.inc(21981);break;
            case Calendar.MONTH:if (!__CLB4_5_2_bool3) {__CLR4_5_2gmdgmdlvha7cf4.R.inc(21982);__CLB4_5_2_bool3=true;}
                __CLR4_5_2gmdgmdlvha7cf4.R.inc(21983);result += unit.convert(calendar.get(Calendar.DAY_OF_MONTH) - offset, TimeUnit.DAYS);
                __CLR4_5_2gmdgmdlvha7cf4.R.inc(21984);break;
            default:if (!__CLB4_5_2_bool3) {__CLR4_5_2gmdgmdlvha7cf4.R.inc(21985);__CLB4_5_2_bool3=true;}
                __CLR4_5_2gmdgmdlvha7cf4.R.inc(21986);break;
        }

        boolean __CLB4_5_2_bool4=false;__CLR4_5_2gmdgmdlvha7cf4.R.inc(21987);switch (fragment) {
            // Number of days already calculated for these cases
            case Calendar.YEAR:if (!__CLB4_5_2_bool4) {__CLR4_5_2gmdgmdlvha7cf4.R.inc(21988);__CLB4_5_2_bool4=true;}
            case Calendar.MONTH:if (!__CLB4_5_2_bool4) {__CLR4_5_2gmdgmdlvha7cf4.R.inc(21989);__CLB4_5_2_bool4=true;}
            
            // The rest of the valid cases
            case Calendar.DAY_OF_YEAR:if (!__CLB4_5_2_bool4) {__CLR4_5_2gmdgmdlvha7cf4.R.inc(21990);__CLB4_5_2_bool4=true;}
            case Calendar.DATE:if (!__CLB4_5_2_bool4) {__CLR4_5_2gmdgmdlvha7cf4.R.inc(21991);__CLB4_5_2_bool4=true;}
                __CLR4_5_2gmdgmdlvha7cf4.R.inc(21992);result += unit.convert(calendar.get(Calendar.HOUR_OF_DAY), TimeUnit.HOURS);
                //$FALL-THROUGH$
            case Calendar.HOUR_OF_DAY:if (!__CLB4_5_2_bool4) {__CLR4_5_2gmdgmdlvha7cf4.R.inc(21993);__CLB4_5_2_bool4=true;}
                __CLR4_5_2gmdgmdlvha7cf4.R.inc(21994);result += unit.convert(calendar.get(Calendar.MINUTE), TimeUnit.MINUTES);
                //$FALL-THROUGH$
            case Calendar.MINUTE:if (!__CLB4_5_2_bool4) {__CLR4_5_2gmdgmdlvha7cf4.R.inc(21995);__CLB4_5_2_bool4=true;}
                __CLR4_5_2gmdgmdlvha7cf4.R.inc(21996);result += unit.convert(calendar.get(Calendar.SECOND), TimeUnit.SECONDS);
                //$FALL-THROUGH$
            case Calendar.SECOND:if (!__CLB4_5_2_bool4) {__CLR4_5_2gmdgmdlvha7cf4.R.inc(21997);__CLB4_5_2_bool4=true;}
                __CLR4_5_2gmdgmdlvha7cf4.R.inc(21998);result += unit.convert(calendar.get(Calendar.MILLISECOND), TimeUnit.MILLISECONDS);
                __CLR4_5_2gmdgmdlvha7cf4.R.inc(21999);break;
            case Calendar.MILLISECOND:if (!__CLB4_5_2_bool4) {__CLR4_5_2gmdgmdlvha7cf4.R.inc(22000);__CLB4_5_2_bool4=true;} __CLR4_5_2gmdgmdlvha7cf4.R.inc(22001);break;//never useful
                default:if (!__CLB4_5_2_bool4) {__CLR4_5_2gmdgmdlvha7cf4.R.inc(22002);__CLB4_5_2_bool4=true;} __CLR4_5_2gmdgmdlvha7cf4.R.inc(22003);throw new IllegalArgumentException("The fragment " + fragment + " is not supported");
        }
        __CLR4_5_2gmdgmdlvha7cf4.R.inc(22004);return result;
    }finally{__CLR4_5_2gmdgmdlvha7cf4.R.flushNeeded();}}
    
    /**
     * Determines if two calendars are equal up to no more than the specified 
     * most significant field.
     * 
     * @param cal1 the first calendar, not <code>null</code>
     * @param cal2 the second calendar, not <code>null</code>
     * @param field the field from {@code Calendar}
     * @return <code>true</code> if equal; otherwise <code>false</code>
     * @throws IllegalArgumentException if any argument is <code>null</code>
     * @see #truncate(Calendar, int)
     * @see #truncatedEquals(Date, Date, int)
     * @since 3.0
     */
    public static boolean truncatedEquals(final Calendar cal1, final Calendar cal2, final int field) {try{__CLR4_5_2gmdgmdlvha7cf4.R.inc(22005);
        __CLR4_5_2gmdgmdlvha7cf4.R.inc(22006);return truncatedCompareTo(cal1, cal2, field) == 0;
    }finally{__CLR4_5_2gmdgmdlvha7cf4.R.flushNeeded();}}

    /**
     * Determines if two dates are equal up to no more than the specified 
     * most significant field.
     * 
     * @param date1 the first date, not <code>null</code>
     * @param date2 the second date, not <code>null</code>
     * @param field the field from {@code Calendar}
     * @return <code>true</code> if equal; otherwise <code>false</code>
     * @throws IllegalArgumentException if any argument is <code>null</code>
     * @see #truncate(Date, int)
     * @see #truncatedEquals(Calendar, Calendar, int)
     * @since 3.0
     */
    public static boolean truncatedEquals(final Date date1, final Date date2, final int field) {try{__CLR4_5_2gmdgmdlvha7cf4.R.inc(22007);
        __CLR4_5_2gmdgmdlvha7cf4.R.inc(22008);return truncatedCompareTo(date1, date2, field) == 0;
    }finally{__CLR4_5_2gmdgmdlvha7cf4.R.flushNeeded();}}

    /**
     * Determines how two calendars compare up to no more than the specified 
     * most significant field.
     * 
     * @param cal1 the first calendar, not <code>null</code>
     * @param cal2 the second calendar, not <code>null</code>
     * @param field the field from {@code Calendar}
     * @return a negative integer, zero, or a positive integer as the first 
     * calendar is less than, equal to, or greater than the second.
     * @throws IllegalArgumentException if any argument is <code>null</code>
     * @see #truncate(Calendar, int)
     * @see #truncatedCompareTo(Date, Date, int)
     * @since 3.0
     */
    public static int truncatedCompareTo(final Calendar cal1, final Calendar cal2, final int field) {try{__CLR4_5_2gmdgmdlvha7cf4.R.inc(22009);
        __CLR4_5_2gmdgmdlvha7cf4.R.inc(22010);final Calendar truncatedCal1 = truncate(cal1, field);
        __CLR4_5_2gmdgmdlvha7cf4.R.inc(22011);final Calendar truncatedCal2 = truncate(cal2, field);
        __CLR4_5_2gmdgmdlvha7cf4.R.inc(22012);return truncatedCal1.compareTo(truncatedCal2);
    }finally{__CLR4_5_2gmdgmdlvha7cf4.R.flushNeeded();}}

    /**
     * Determines how two dates compare up to no more than the specified 
     * most significant field.
     * 
     * @param date1 the first date, not <code>null</code>
     * @param date2 the second date, not <code>null</code>
     * @param field the field from <code>Calendar</code>
     * @return a negative integer, zero, or a positive integer as the first 
     * date is less than, equal to, or greater than the second.
     * @throws IllegalArgumentException if any argument is <code>null</code>
     * @see #truncate(Calendar, int)
     * @see #truncatedCompareTo(Date, Date, int)
     * @since 3.0
     */
    public static int truncatedCompareTo(final Date date1, final Date date2, final int field) {try{__CLR4_5_2gmdgmdlvha7cf4.R.inc(22013);
        __CLR4_5_2gmdgmdlvha7cf4.R.inc(22014);final Date truncatedDate1 = truncate(date1, field);
        __CLR4_5_2gmdgmdlvha7cf4.R.inc(22015);final Date truncatedDate2 = truncate(date2, field);
        __CLR4_5_2gmdgmdlvha7cf4.R.inc(22016);return truncatedDate1.compareTo(truncatedDate2);
    }finally{__CLR4_5_2gmdgmdlvha7cf4.R.flushNeeded();}}

    private static void validateDateNotNull(final Date date) {try{__CLR4_5_2gmdgmdlvha7cf4.R.inc(22017);
        __CLR4_5_2gmdgmdlvha7cf4.R.inc(22018);Validate.isTrue(date != null, "The date must not be null");
    }finally{__CLR4_5_2gmdgmdlvha7cf4.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * <p>Date iterator.</p>
     */
    static class DateIterator implements Iterator<Calendar> {
        private final Calendar endFinal;
        private final Calendar spot;
        
        /**
         * Constructs a DateIterator that ranges from one date to another. 
         *
         * @param startFinal start date (inclusive)
         * @param endFinal end date (inclusive)
         */
        DateIterator(final Calendar startFinal, final Calendar endFinal) {
            super();__CLR4_5_2gmdgmdlvha7cf4.R.inc(22020);try{__CLR4_5_2gmdgmdlvha7cf4.R.inc(22019);
            __CLR4_5_2gmdgmdlvha7cf4.R.inc(22021);this.endFinal = endFinal;
            __CLR4_5_2gmdgmdlvha7cf4.R.inc(22022);spot = startFinal;
            __CLR4_5_2gmdgmdlvha7cf4.R.inc(22023);spot.add(Calendar.DATE, -1);
        }finally{__CLR4_5_2gmdgmdlvha7cf4.R.flushNeeded();}}

        /**
         * Has the iterator not reached the end date yet?
         *
         * @return <code>true</code> if the iterator has yet to reach the end date
         */
        @Override
        public boolean hasNext() {try{__CLR4_5_2gmdgmdlvha7cf4.R.inc(22024);
            __CLR4_5_2gmdgmdlvha7cf4.R.inc(22025);return spot.before(endFinal);
        }finally{__CLR4_5_2gmdgmdlvha7cf4.R.flushNeeded();}}

        /**
         * Return the next calendar in the iteration
         *
         * @return Object calendar for the next date
         */
        @Override
        public Calendar next() {try{__CLR4_5_2gmdgmdlvha7cf4.R.inc(22026);
            __CLR4_5_2gmdgmdlvha7cf4.R.inc(22027);if ((((spot.equals(endFinal))&&(__CLR4_5_2gmdgmdlvha7cf4.R.iget(22028)!=0|true))||(__CLR4_5_2gmdgmdlvha7cf4.R.iget(22029)==0&false))) {{
                __CLR4_5_2gmdgmdlvha7cf4.R.inc(22030);throw new NoSuchElementException();
            }
            }__CLR4_5_2gmdgmdlvha7cf4.R.inc(22031);spot.add(Calendar.DATE, 1);
            __CLR4_5_2gmdgmdlvha7cf4.R.inc(22032);return (Calendar) spot.clone();
        }finally{__CLR4_5_2gmdgmdlvha7cf4.R.flushNeeded();}}

        /**
         * Always throws UnsupportedOperationException.
         * 
         * @throws UnsupportedOperationException
         * @see java.util.Iterator#remove()
         */
        @Override
        public void remove() {try{__CLR4_5_2gmdgmdlvha7cf4.R.inc(22033);
            __CLR4_5_2gmdgmdlvha7cf4.R.inc(22034);throw new UnsupportedOperationException();
        }finally{__CLR4_5_2gmdgmdlvha7cf4.R.flushNeeded();}}
    }

}
