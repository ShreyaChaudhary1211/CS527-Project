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

import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.Format;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/**
 * <p>FastDateFormat is a fast and thread-safe version of
 * {@link java.text.SimpleDateFormat}.</p>
 *
 * <p>To obtain an instance of FastDateFormat, use one of the static factory methods: 
 * {@link #getInstance(String, TimeZone, Locale)}, {@link #getDateInstance(int, TimeZone, Locale)}, 
 * {@link #getTimeInstance(int, TimeZone, Locale)}, or {@link #getDateTimeInstance(int, int, TimeZone, Locale)} 
 * </p>
 * 
 * <p>Since FastDateFormat is thread safe, you can use a static member instance:</p>
 * <code>
 *   private static final FastDateFormat DATE_FORMATTER = FastDateFormat.getDateTimeInstance(FastDateFormat.LONG, FastDateFormat.SHORT);
 * </code>
 * 
 * <p>This class can be used as a direct replacement to
 * {@code SimpleDateFormat} in most formatting and parsing situations.
 * This class is especially useful in multi-threaded server environments.
 * {@code SimpleDateFormat} is not thread-safe in any JDK version,
 * nor will it be as Sun have closed the bug/RFE.
 * </p>
 *
 * <p>All patterns are compatible with
 * SimpleDateFormat (except time zones and some year patterns - see below).</p>
 *
 * <p>Since 3.2, FastDateFormat supports parsing as well as printing.</p>
 *
 * <p>Java 1.4 introduced a new pattern letter, {@code 'Z'}, to represent
 * time zones in RFC822 format (eg. {@code +0800} or {@code -1100}).
 * This pattern letter can be used here (on all JDK versions).</p>
 *
 * <p>In addition, the pattern {@code 'ZZ'} has been made to represent
 * ISO 8601 extended format time zones (eg. {@code +08:00} or {@code -11:00}).
 * This introduces a minor incompatibility with Java 1.4, but at a gain of
 * useful functionality.</p>
 *
 * <p>Javadoc cites for the year pattern: <i>For formatting, if the number of
 * pattern letters is 2, the year is truncated to 2 digits; otherwise it is
 * interpreted as a number.</i> Starting with Java 1.7 a pattern of 'Y' or
 * 'YYY' will be formatted as '2003', while it was '03' in former Java
 * versions. FastDateFormat implements the behavior of Java 7.</p>
 *
 * @since 2.0
 */
public class FastDateFormat extends Format implements DateParser, DatePrinter {public static class __CLR4_5_2haghaglvha7cgv{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172755542L,8589935092L,22498,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    
    /**
     * Required for serialization support.
     *
     * @see java.io.Serializable
     */
    private static final long serialVersionUID = 2L;

    /**
     * FULL locale dependent date or time style.
     */
    
    public static final int FULL = DateFormat.FULL;
    
    /**
     * LONG locale dependent date or time style.
     */
    public static final int LONG = DateFormat.LONG;
    
    /**
     * MEDIUM locale dependent date or time style.
     */
    public static final int MEDIUM = DateFormat.MEDIUM;
    
    /**
     * SHORT locale dependent date or time style.
     */
    public static final int SHORT = DateFormat.SHORT;

    private static final FormatCache<FastDateFormat> cache= new FormatCache<FastDateFormat>() {
        @Override
        protected FastDateFormat createInstance(final String pattern, final TimeZone timeZone, final Locale locale) {try{__CLR4_5_2haghaglvha7cgv.R.inc(22408);
            __CLR4_5_2haghaglvha7cgv.R.inc(22409);return new FastDateFormat(pattern, timeZone, locale);
        }finally{__CLR4_5_2haghaglvha7cgv.R.flushNeeded();}}
    };

    private final FastDatePrinter printer;
    private final FastDateParser parser;

    //-----------------------------------------------------------------------
    /**
     * <p>Gets a formatter instance using the default pattern in the
     * default locale.</p>
     *
     * @return a date/time formatter
     */
    public static FastDateFormat getInstance() {try{__CLR4_5_2haghaglvha7cgv.R.inc(22410);
        __CLR4_5_2haghaglvha7cgv.R.inc(22411);return cache.getInstance();
    }finally{__CLR4_5_2haghaglvha7cgv.R.flushNeeded();}}

    /**
     * <p>Gets a formatter instance using the specified pattern in the
     * default locale.</p>
     *
     * @param pattern  {@link java.text.SimpleDateFormat} compatible
     *  pattern
     * @return a pattern based date/time formatter
     * @throws IllegalArgumentException if pattern is invalid
     */
    public static FastDateFormat getInstance(final String pattern) {try{__CLR4_5_2haghaglvha7cgv.R.inc(22412);
        __CLR4_5_2haghaglvha7cgv.R.inc(22413);return cache.getInstance(pattern, null, null);
    }finally{__CLR4_5_2haghaglvha7cgv.R.flushNeeded();}}

    /**
     * <p>Gets a formatter instance using the specified pattern and
     * time zone.</p>
     *
     * @param pattern  {@link java.text.SimpleDateFormat} compatible
     *  pattern
     * @param timeZone  optional time zone, overrides time zone of
     *  formatted date
     * @return a pattern based date/time formatter
     * @throws IllegalArgumentException if pattern is invalid
     */
    public static FastDateFormat getInstance(final String pattern, final TimeZone timeZone) {try{__CLR4_5_2haghaglvha7cgv.R.inc(22414);
        __CLR4_5_2haghaglvha7cgv.R.inc(22415);return cache.getInstance(pattern, timeZone, null);
    }finally{__CLR4_5_2haghaglvha7cgv.R.flushNeeded();}}

    /**
     * <p>Gets a formatter instance using the specified pattern and
     * locale.</p>
     *
     * @param pattern  {@link java.text.SimpleDateFormat} compatible
     *  pattern
     * @param locale  optional locale, overrides system locale
     * @return a pattern based date/time formatter
     * @throws IllegalArgumentException if pattern is invalid
     */
    public static FastDateFormat getInstance(final String pattern, final Locale locale) {try{__CLR4_5_2haghaglvha7cgv.R.inc(22416);
        __CLR4_5_2haghaglvha7cgv.R.inc(22417);return cache.getInstance(pattern, null, locale);
    }finally{__CLR4_5_2haghaglvha7cgv.R.flushNeeded();}}

    /**
     * <p>Gets a formatter instance using the specified pattern, time zone
     * and locale.</p>
     *
     * @param pattern  {@link java.text.SimpleDateFormat} compatible
     *  pattern
     * @param timeZone  optional time zone, overrides time zone of
     *  formatted date
     * @param locale  optional locale, overrides system locale
     * @return a pattern based date/time formatter
     * @throws IllegalArgumentException if pattern is invalid
     *  or {@code null}
     */
    public static FastDateFormat getInstance(final String pattern, final TimeZone timeZone, final Locale locale) {try{__CLR4_5_2haghaglvha7cgv.R.inc(22418);
        __CLR4_5_2haghaglvha7cgv.R.inc(22419);return cache.getInstance(pattern, timeZone, locale);
    }finally{__CLR4_5_2haghaglvha7cgv.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * <p>Gets a date formatter instance using the specified style in the
     * default time zone and locale.</p>
     *
     * @param style  date style: FULL, LONG, MEDIUM, or SHORT
     * @return a localized standard date formatter
     * @throws IllegalArgumentException if the Locale has no date
     *  pattern defined
     * @since 2.1
     */
    public static FastDateFormat getDateInstance(final int style) {try{__CLR4_5_2haghaglvha7cgv.R.inc(22420);
        __CLR4_5_2haghaglvha7cgv.R.inc(22421);return cache.getDateInstance(style, null, null);
    }finally{__CLR4_5_2haghaglvha7cgv.R.flushNeeded();}}

    /**
     * <p>Gets a date formatter instance using the specified style and
     * locale in the default time zone.</p>
     *
     * @param style  date style: FULL, LONG, MEDIUM, or SHORT
     * @param locale  optional locale, overrides system locale
     * @return a localized standard date formatter
     * @throws IllegalArgumentException if the Locale has no date
     *  pattern defined
     * @since 2.1
     */
    public static FastDateFormat getDateInstance(final int style, final Locale locale) {try{__CLR4_5_2haghaglvha7cgv.R.inc(22422);
        __CLR4_5_2haghaglvha7cgv.R.inc(22423);return cache.getDateInstance(style, null, locale);
    }finally{__CLR4_5_2haghaglvha7cgv.R.flushNeeded();}}

    /**
     * <p>Gets a date formatter instance using the specified style and
     * time zone in the default locale.</p>
     *
     * @param style  date style: FULL, LONG, MEDIUM, or SHORT
     * @param timeZone  optional time zone, overrides time zone of
     *  formatted date
     * @return a localized standard date formatter
     * @throws IllegalArgumentException if the Locale has no date
     *  pattern defined
     * @since 2.1
     */
    public static FastDateFormat getDateInstance(final int style, final TimeZone timeZone) {try{__CLR4_5_2haghaglvha7cgv.R.inc(22424);
        __CLR4_5_2haghaglvha7cgv.R.inc(22425);return cache.getDateInstance(style, timeZone, null);
    }finally{__CLR4_5_2haghaglvha7cgv.R.flushNeeded();}}

    /**
     * <p>Gets a date formatter instance using the specified style, time
     * zone and locale.</p>
     *
     * @param style  date style: FULL, LONG, MEDIUM, or SHORT
     * @param timeZone  optional time zone, overrides time zone of
     *  formatted date
     * @param locale  optional locale, overrides system locale
     * @return a localized standard date formatter
     * @throws IllegalArgumentException if the Locale has no date
     *  pattern defined
     */
    public static FastDateFormat getDateInstance(final int style, final TimeZone timeZone, final Locale locale) {try{__CLR4_5_2haghaglvha7cgv.R.inc(22426);
        __CLR4_5_2haghaglvha7cgv.R.inc(22427);return cache.getDateInstance(style, timeZone, locale);
    }finally{__CLR4_5_2haghaglvha7cgv.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * <p>Gets a time formatter instance using the specified style in the
     * default time zone and locale.</p>
     *
     * @param style  time style: FULL, LONG, MEDIUM, or SHORT
     * @return a localized standard time formatter
     * @throws IllegalArgumentException if the Locale has no time
     *  pattern defined
     * @since 2.1
     */
    public static FastDateFormat getTimeInstance(final int style) {try{__CLR4_5_2haghaglvha7cgv.R.inc(22428);
        __CLR4_5_2haghaglvha7cgv.R.inc(22429);return cache.getTimeInstance(style, null, null);
    }finally{__CLR4_5_2haghaglvha7cgv.R.flushNeeded();}}

    /**
     * <p>Gets a time formatter instance using the specified style and
     * locale in the default time zone.</p>
     *
     * @param style  time style: FULL, LONG, MEDIUM, or SHORT
     * @param locale  optional locale, overrides system locale
     * @return a localized standard time formatter
     * @throws IllegalArgumentException if the Locale has no time
     *  pattern defined
     * @since 2.1
     */
    public static FastDateFormat getTimeInstance(final int style, final Locale locale) {try{__CLR4_5_2haghaglvha7cgv.R.inc(22430);
        __CLR4_5_2haghaglvha7cgv.R.inc(22431);return cache.getTimeInstance(style, null, locale);
    }finally{__CLR4_5_2haghaglvha7cgv.R.flushNeeded();}}

    /**
     * <p>Gets a time formatter instance using the specified style and
     * time zone in the default locale.</p>
     *
     * @param style  time style: FULL, LONG, MEDIUM, or SHORT
     * @param timeZone  optional time zone, overrides time zone of
     *  formatted time
     * @return a localized standard time formatter
     * @throws IllegalArgumentException if the Locale has no time
     *  pattern defined
     * @since 2.1
     */
    public static FastDateFormat getTimeInstance(final int style, final TimeZone timeZone) {try{__CLR4_5_2haghaglvha7cgv.R.inc(22432);
        __CLR4_5_2haghaglvha7cgv.R.inc(22433);return cache.getTimeInstance(style, timeZone, null);
    }finally{__CLR4_5_2haghaglvha7cgv.R.flushNeeded();}}

    /**
     * <p>Gets a time formatter instance using the specified style, time
     * zone and locale.</p>
     *
     * @param style  time style: FULL, LONG, MEDIUM, or SHORT
     * @param timeZone  optional time zone, overrides time zone of
     *  formatted time
     * @param locale  optional locale, overrides system locale
     * @return a localized standard time formatter
     * @throws IllegalArgumentException if the Locale has no time
     *  pattern defined
     */
    public static FastDateFormat getTimeInstance(final int style, final TimeZone timeZone, final Locale locale) {try{__CLR4_5_2haghaglvha7cgv.R.inc(22434);
        __CLR4_5_2haghaglvha7cgv.R.inc(22435);return cache.getTimeInstance(style, timeZone, locale);
    }finally{__CLR4_5_2haghaglvha7cgv.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * <p>Gets a date/time formatter instance using the specified style
     * in the default time zone and locale.</p>
     *
     * @param dateStyle  date style: FULL, LONG, MEDIUM, or SHORT
     * @param timeStyle  time style: FULL, LONG, MEDIUM, or SHORT
     * @return a localized standard date/time formatter
     * @throws IllegalArgumentException if the Locale has no date/time
     *  pattern defined
     * @since 2.1
     */
    public static FastDateFormat getDateTimeInstance(final int dateStyle, final int timeStyle) {try{__CLR4_5_2haghaglvha7cgv.R.inc(22436);
        __CLR4_5_2haghaglvha7cgv.R.inc(22437);return cache.getDateTimeInstance(dateStyle, timeStyle, null, null);
    }finally{__CLR4_5_2haghaglvha7cgv.R.flushNeeded();}}

    /**
     * <p>Gets a date/time formatter instance using the specified style and
     * locale in the default time zone.</p>
     *
     * @param dateStyle  date style: FULL, LONG, MEDIUM, or SHORT
     * @param timeStyle  time style: FULL, LONG, MEDIUM, or SHORT
     * @param locale  optional locale, overrides system locale
     * @return a localized standard date/time formatter
     * @throws IllegalArgumentException if the Locale has no date/time
     *  pattern defined
     * @since 2.1
     */
    public static FastDateFormat getDateTimeInstance(final int dateStyle, final int timeStyle, final Locale locale) {try{__CLR4_5_2haghaglvha7cgv.R.inc(22438);
        __CLR4_5_2haghaglvha7cgv.R.inc(22439);return cache.getDateTimeInstance(dateStyle, timeStyle, null, locale);
    }finally{__CLR4_5_2haghaglvha7cgv.R.flushNeeded();}}

    /**
     * <p>Gets a date/time formatter instance using the specified style and
     * time zone in the default locale.</p>
     *
     * @param dateStyle  date style: FULL, LONG, MEDIUM, or SHORT
     * @param timeStyle  time style: FULL, LONG, MEDIUM, or SHORT
     * @param timeZone  optional time zone, overrides time zone of
     *  formatted date
     * @return a localized standard date/time formatter
     * @throws IllegalArgumentException if the Locale has no date/time
     *  pattern defined
     * @since 2.1
     */
    public static FastDateFormat getDateTimeInstance(final int dateStyle, final int timeStyle, final TimeZone timeZone) {try{__CLR4_5_2haghaglvha7cgv.R.inc(22440);
        __CLR4_5_2haghaglvha7cgv.R.inc(22441);return getDateTimeInstance(dateStyle, timeStyle, timeZone, null);
    }finally{__CLR4_5_2haghaglvha7cgv.R.flushNeeded();}}
    /**
     * <p>Gets a date/time formatter instance using the specified style,
     * time zone and locale.</p>
     *
     * @param dateStyle  date style: FULL, LONG, MEDIUM, or SHORT
     * @param timeStyle  time style: FULL, LONG, MEDIUM, or SHORT
     * @param timeZone  optional time zone, overrides time zone of
     *  formatted date
     * @param locale  optional locale, overrides system locale
     * @return a localized standard date/time formatter
     * @throws IllegalArgumentException if the Locale has no date/time
     *  pattern defined
     */
    public static FastDateFormat getDateTimeInstance(
            final int dateStyle, final int timeStyle, final TimeZone timeZone, final Locale locale) {try{__CLR4_5_2haghaglvha7cgv.R.inc(22442);
        __CLR4_5_2haghaglvha7cgv.R.inc(22443);return cache.getDateTimeInstance(dateStyle, timeStyle, timeZone, locale);
    }finally{__CLR4_5_2haghaglvha7cgv.R.flushNeeded();}}

    // Constructor
    //-----------------------------------------------------------------------
    /**
     * <p>Constructs a new FastDateFormat.</p>
     *
     * @param pattern  {@link java.text.SimpleDateFormat} compatible pattern
     * @param timeZone  non-null time zone to use
     * @param locale  non-null locale to use
     * @throws NullPointerException if pattern, timeZone, or locale is null.
     */
    protected FastDateFormat(final String pattern, final TimeZone timeZone, final Locale locale) {
        this(pattern, timeZone, locale, null);__CLR4_5_2haghaglvha7cgv.R.inc(22445);try{__CLR4_5_2haghaglvha7cgv.R.inc(22444);
    }finally{__CLR4_5_2haghaglvha7cgv.R.flushNeeded();}}

    // Constructor
    //-----------------------------------------------------------------------
    /**
     * <p>Constructs a new FastDateFormat.</p>
     *
     * @param pattern  {@link java.text.SimpleDateFormat} compatible pattern
     * @param timeZone  non-null time zone to use
     * @param locale  non-null locale to use
     * @param centuryStart The start of the 100 year period to use as the "default century" for 2 digit year parsing.  If centuryStart is null, defaults to now - 80 years
     * @throws NullPointerException if pattern, timeZone, or locale is null.
     */
    protected FastDateFormat(final String pattern, final TimeZone timeZone, final Locale locale, final Date centuryStart) {try{__CLR4_5_2haghaglvha7cgv.R.inc(22446);
        __CLR4_5_2haghaglvha7cgv.R.inc(22447);printer= new FastDatePrinter(pattern, timeZone, locale);
        __CLR4_5_2haghaglvha7cgv.R.inc(22448);parser= new FastDateParser(pattern, timeZone, locale, centuryStart);
    }finally{__CLR4_5_2haghaglvha7cgv.R.flushNeeded();}}

    // Format methods
    //-----------------------------------------------------------------------
    /**
     * <p>Formats a {@code Date}, {@code Calendar} or
     * {@code Long} (milliseconds) object.</p>
     * This method is an implementation of {@link Format#format(Object, StringBuffer, FieldPosition)}
     *
     * @param obj  the object to format
     * @param toAppendTo  the buffer to append to
     * @param pos  the position - ignored
     * @return the buffer passed in
     */
    @Override
    public StringBuffer format(final Object obj, final StringBuffer toAppendTo, final FieldPosition pos) {try{__CLR4_5_2haghaglvha7cgv.R.inc(22449);
        __CLR4_5_2haghaglvha7cgv.R.inc(22450);return toAppendTo.append(printer.format(obj));
    }finally{__CLR4_5_2haghaglvha7cgv.R.flushNeeded();}}

    /**
     * <p>Formats a millisecond {@code long} value.</p>
     *
     * @param millis  the millisecond value to format
     * @return the formatted string
     * @since 2.1
     */
    @Override
    public String format(final long millis) {try{__CLR4_5_2haghaglvha7cgv.R.inc(22451);
        __CLR4_5_2haghaglvha7cgv.R.inc(22452);return printer.format(millis);
    }finally{__CLR4_5_2haghaglvha7cgv.R.flushNeeded();}}

    /**
     * <p>Formats a {@code Date} object using a {@code GregorianCalendar}.</p>
     *
     * @param date  the date to format
     * @return the formatted string
     */
    @Override
    public String format(final Date date) {try{__CLR4_5_2haghaglvha7cgv.R.inc(22453);
        __CLR4_5_2haghaglvha7cgv.R.inc(22454);return printer.format(date);
    }finally{__CLR4_5_2haghaglvha7cgv.R.flushNeeded();}}

    /**
     * <p>Formats a {@code Calendar} object.</p>
     *
     * @param calendar  the calendar to format
     * @return the formatted string
     */
    @Override
    public String format(final Calendar calendar) {try{__CLR4_5_2haghaglvha7cgv.R.inc(22455);
        __CLR4_5_2haghaglvha7cgv.R.inc(22456);return printer.format(calendar);
    }finally{__CLR4_5_2haghaglvha7cgv.R.flushNeeded();}}

    /**
     * <p>Formats a millisecond {@code long} value into the
     * supplied {@code StringBuffer}.</p>
     *
     * @param millis  the millisecond value to format
     * @param buf  the buffer to format into
     * @return the specified string buffer
     * @since 2.1
     * @deprecated Use {{@link #format(long, Appendable)}.
     */
    @Deprecated
    @Override
    public StringBuffer format(final long millis, final StringBuffer buf) {try{__CLR4_5_2haghaglvha7cgv.R.inc(22457);
        __CLR4_5_2haghaglvha7cgv.R.inc(22458);return printer.format(millis, buf);
    }finally{__CLR4_5_2haghaglvha7cgv.R.flushNeeded();}}

    /**
     * <p>Formats a {@code Date} object into the
     * supplied {@code StringBuffer} using a {@code GregorianCalendar}.</p>
     *
     * @param date  the date to format
     * @param buf  the buffer to format into
     * @return the specified string buffer
     * @deprecated Use {{@link #format(Date, Appendable)}.
     */
    @Deprecated
    @Override
    public StringBuffer format(final Date date, final StringBuffer buf) {try{__CLR4_5_2haghaglvha7cgv.R.inc(22459);
        __CLR4_5_2haghaglvha7cgv.R.inc(22460);return printer.format(date, buf);
    }finally{__CLR4_5_2haghaglvha7cgv.R.flushNeeded();}}

    /**
     * <p>Formats a {@code Calendar} object into the
     * supplied {@code StringBuffer}.</p>
     *
     * @param calendar  the calendar to format
     * @param buf  the buffer to format into
     * @return the specified string buffer
     * @deprecated Use {{@link #format(Calendar, Appendable)}.
     */
    @Deprecated
    @Override
    public StringBuffer format(final Calendar calendar, final StringBuffer buf) {try{__CLR4_5_2haghaglvha7cgv.R.inc(22461);
        __CLR4_5_2haghaglvha7cgv.R.inc(22462);return printer.format(calendar, buf);
    }finally{__CLR4_5_2haghaglvha7cgv.R.flushNeeded();}}

    /**
     * <p>Formats a millisecond {@code long} value into the
     * supplied {@code StringBuffer}.</p>
     *
     * @param millis  the millisecond value to format
     * @param buf  the buffer to format into
     * @return the specified string buffer
     * @since 3.5
     */
    @Override
    public <B extends Appendable> B format(final long millis, final B buf) {try{__CLR4_5_2haghaglvha7cgv.R.inc(22463);
        __CLR4_5_2haghaglvha7cgv.R.inc(22464);return printer.format(millis, buf);
    }finally{__CLR4_5_2haghaglvha7cgv.R.flushNeeded();}}

    /**
     * <p>Formats a {@code Date} object into the
     * supplied {@code StringBuffer} using a {@code GregorianCalendar}.</p>
     *
     * @param date  the date to format
     * @param buf  the buffer to format into
     * @return the specified string buffer
     * @since 3.5
     */
    @Override
    public <B extends Appendable> B format(final Date date, final B buf) {try{__CLR4_5_2haghaglvha7cgv.R.inc(22465);
        __CLR4_5_2haghaglvha7cgv.R.inc(22466);return printer.format(date, buf);
    }finally{__CLR4_5_2haghaglvha7cgv.R.flushNeeded();}}

    /**
     * <p>Formats a {@code Calendar} object into the
     * supplied {@code StringBuffer}.</p>
     *
     * @param calendar  the calendar to format
     * @param buf  the buffer to format into
     * @return the specified string buffer
     * @since 3.5
    */
    @Override
    public <B extends Appendable> B format(final Calendar calendar, final B buf) {try{__CLR4_5_2haghaglvha7cgv.R.inc(22467);
        __CLR4_5_2haghaglvha7cgv.R.inc(22468);return printer.format(calendar, buf);
    }finally{__CLR4_5_2haghaglvha7cgv.R.flushNeeded();}}

    // Parsing
    //-----------------------------------------------------------------------


    /* (non-Javadoc)
     * @see DateParser#parse(java.lang.String)
     */
    @Override
    public Date parse(final String source) throws ParseException {try{__CLR4_5_2haghaglvha7cgv.R.inc(22469);
        __CLR4_5_2haghaglvha7cgv.R.inc(22470);return parser.parse(source);
    }finally{__CLR4_5_2haghaglvha7cgv.R.flushNeeded();}}

    /* (non-Javadoc)
     * @see DateParser#parse(java.lang.String, java.text.ParsePosition)
     */
    @Override
    public Date parse(final String source, final ParsePosition pos) {try{__CLR4_5_2haghaglvha7cgv.R.inc(22471);
        __CLR4_5_2haghaglvha7cgv.R.inc(22472);return parser.parse(source, pos);
    }finally{__CLR4_5_2haghaglvha7cgv.R.flushNeeded();}}

    /*
     * (non-Javadoc)
     * @see org.apache.commons.lang3.time.DateParser#parse(java.lang.String, java.text.ParsePosition, java.util.Calendar)
     */
    @Override
    public boolean parse(final String source, final ParsePosition pos, final Calendar calendar) {try{__CLR4_5_2haghaglvha7cgv.R.inc(22473);
        __CLR4_5_2haghaglvha7cgv.R.inc(22474);return parser.parse(source, pos, calendar);
    }finally{__CLR4_5_2haghaglvha7cgv.R.flushNeeded();}}

    /* (non-Javadoc)
     * @see java.text.Format#parseObject(java.lang.String, java.text.ParsePosition)
     */
    @Override
    public Object parseObject(final String source, final ParsePosition pos) {try{__CLR4_5_2haghaglvha7cgv.R.inc(22475);
        __CLR4_5_2haghaglvha7cgv.R.inc(22476);return parser.parseObject(source, pos);
    }finally{__CLR4_5_2haghaglvha7cgv.R.flushNeeded();}}

    // Accessors
    //-----------------------------------------------------------------------
    /**
     * <p>Gets the pattern used by this formatter.</p>
     *
     * @return the pattern, {@link java.text.SimpleDateFormat} compatible
     */
    @Override
    public String getPattern() {try{__CLR4_5_2haghaglvha7cgv.R.inc(22477);
        __CLR4_5_2haghaglvha7cgv.R.inc(22478);return printer.getPattern();
    }finally{__CLR4_5_2haghaglvha7cgv.R.flushNeeded();}}

    /**
     * <p>Gets the time zone used by this formatter.</p>
     *
     * <p>This zone is always used for {@code Date} formatting. </p>
     *
     * @return the time zone
     */
    @Override
    public TimeZone getTimeZone() {try{__CLR4_5_2haghaglvha7cgv.R.inc(22479);
        __CLR4_5_2haghaglvha7cgv.R.inc(22480);return printer.getTimeZone();
    }finally{__CLR4_5_2haghaglvha7cgv.R.flushNeeded();}}

    /**
     * <p>Gets the locale used by this formatter.</p>
     *
     * @return the locale
     */
    @Override
    public Locale getLocale() {try{__CLR4_5_2haghaglvha7cgv.R.inc(22481);
        __CLR4_5_2haghaglvha7cgv.R.inc(22482);return printer.getLocale();
    }finally{__CLR4_5_2haghaglvha7cgv.R.flushNeeded();}}

    /**
     * <p>Gets an estimate for the maximum string length that the
     * formatter will produce.</p>
     *
     * <p>The actual formatted length will almost always be less than or
     * equal to this amount.</p>
     *
     * @return the maximum formatted length
     */
    public int getMaxLengthEstimate() {try{__CLR4_5_2haghaglvha7cgv.R.inc(22483);
        __CLR4_5_2haghaglvha7cgv.R.inc(22484);return printer.getMaxLengthEstimate();
    }finally{__CLR4_5_2haghaglvha7cgv.R.flushNeeded();}}

    // Basics
    //-----------------------------------------------------------------------
    /**
     * <p>Compares two objects for equality.</p>
     *
     * @param obj  the object to compare to
     * @return {@code true} if equal
     */
    @Override
    public boolean equals(final Object obj) {try{__CLR4_5_2haghaglvha7cgv.R.inc(22485);
        __CLR4_5_2haghaglvha7cgv.R.inc(22486);if ((((obj instanceof FastDateFormat == false)&&(__CLR4_5_2haghaglvha7cgv.R.iget(22487)!=0|true))||(__CLR4_5_2haghaglvha7cgv.R.iget(22488)==0&false))) {{
            __CLR4_5_2haghaglvha7cgv.R.inc(22489);return false;
        }
        }__CLR4_5_2haghaglvha7cgv.R.inc(22490);final FastDateFormat other = (FastDateFormat) obj;
        // no need to check parser, as it has same invariants as printer
        __CLR4_5_2haghaglvha7cgv.R.inc(22491);return printer.equals(other.printer);
    }finally{__CLR4_5_2haghaglvha7cgv.R.flushNeeded();}}

    /**
     * <p>Returns a hash code compatible with equals.</p>
     *
     * @return a hash code compatible with equals
     */
    @Override
    public int hashCode() {try{__CLR4_5_2haghaglvha7cgv.R.inc(22492);
        __CLR4_5_2haghaglvha7cgv.R.inc(22493);return printer.hashCode();
    }finally{__CLR4_5_2haghaglvha7cgv.R.flushNeeded();}}

    /**
     * <p>Gets a debugging string version of this formatter.</p>
     *
     * @return a debugging string
     */
    @Override
    public String toString() {try{__CLR4_5_2haghaglvha7cgv.R.inc(22494);
        __CLR4_5_2haghaglvha7cgv.R.inc(22495);return "FastDateFormat[" + printer.getPattern() + "," + printer.getLocale() + "," + printer.getTimeZone().getID() + "]";
    }finally{__CLR4_5_2haghaglvha7cgv.R.flushNeeded();}}

    /**
     * <p>Performs the formatting by applying the rules to the
     * specified calendar.</p>
     *
     * @param calendar the calendar to format
     * @param buf  the buffer to format into
     * @return the specified string buffer
     * @deprecated Use {@link #format(Calendar, Appendable)}
     */
    @Deprecated
    protected StringBuffer applyRules(final Calendar calendar, final StringBuffer buf) {try{__CLR4_5_2haghaglvha7cgv.R.inc(22496);
        __CLR4_5_2haghaglvha7cgv.R.inc(22497);return printer.applyRules(calendar, buf);
    }finally{__CLR4_5_2haghaglvha7cgv.R.flushNeeded();}}
}
