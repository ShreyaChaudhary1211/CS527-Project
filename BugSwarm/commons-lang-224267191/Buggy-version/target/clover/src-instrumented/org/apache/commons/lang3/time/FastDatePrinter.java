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

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.text.FieldPosition;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

import org.apache.commons.lang3.exception.ExceptionUtils;

/**
 * <p>FastDatePrinter is a fast and thread-safe version of
 * {@link java.text.SimpleDateFormat}.</p>
 *
 * <p>To obtain a FastDatePrinter, use {@link FastDateFormat#getInstance(String, TimeZone, Locale)} 
 * or another variation of the factory methods of {@link FastDateFormat}.</p>
 * 
 * <p>Since FastDatePrinter is thread safe, you can use a static member instance:</p>
 * <code>
 *     private static final DatePrinter DATE_PRINTER = FastDateFormat.getInstance("yyyy-MM-dd");
 * </code>
 * 
 * <p>This class can be used as a direct replacement to
 * {@code SimpleDateFormat} in most formatting situations.
 * This class is especially useful in multi-threaded server environments.
 * {@code SimpleDateFormat} is not thread-safe in any JDK version,
 * nor will it be as Sun have closed the bug/RFE.
 * </p>
 *
 * <p>Only formatting is supported by this class, but all patterns are compatible with
 * SimpleDateFormat (except time zones and some year patterns - see below).</p>
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
 * <p>Starting with JDK7, ISO 8601 support was added using the pattern {@code 'X'}.
 * To maintain compatibility, {@code 'ZZ'} will continue to be supported, but using
 * one of the {@code 'X'} formats is recommended.
 *
 * <p>Javadoc cites for the year pattern: <i>For formatting, if the number of
 * pattern letters is 2, the year is truncated to 2 digits; otherwise it is
 * interpreted as a number.</i> Starting with Java 1.7 a pattern of 'Y' or
 * 'YYY' will be formatted as '2003', while it was '03' in former Java
 * versions. FastDatePrinter implements the behavior of Java 7.</p>
 *
 * @since 3.2
 * @see FastDateParser
 */
@java.lang.SuppressWarnings({"fallthrough"}) public class FastDatePrinter implements DatePrinter, Serializable {public static class __CLR4_5_2hpmhpmlvha7cow{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172755542L,8589935092L,23565,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    // A lot of the speed in this class comes from caching, but some comes
    // from the special int to StringBuffer conversion.
    //
    // The following produces a padded 2 digit number:
    //   buffer.append((char)(value / 10 + '0'));
    //   buffer.append((char)(value % 10 + '0'));
    //
    // Note that the fastest append to StringBuffer is a single char (used here).
    // Note that Integer.toString() is not called, the conversion is simply
    // taking the value and adding (mathematically) the ASCII value for '0'.
    // So, don't change this code! It works and is very fast.

    /**
     * Required for serialization support.
     *
     * @see java.io.Serializable
     */
    private static final long serialVersionUID = 1L;

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

    /**
     * The pattern.
     */
    private final String mPattern;
    /**
     * The time zone.
     */
    private final TimeZone mTimeZone;
    /**
     * The locale.
     */
    private final Locale mLocale;
    /**
     * The parsed rules.
     */
    private transient Rule[] mRules;
    /**
     * The estimated maximum length.
     */
    private transient int mMaxLengthEstimate;

    // Constructor
    //-----------------------------------------------------------------------
    /**
     * <p>Constructs a new FastDatePrinter.</p>
     * Use {@link FastDateFormat#getInstance(String, TimeZone, Locale)}  or another variation of the 
     * factory methods of {@link FastDateFormat} to get a cached FastDatePrinter instance.
     *
     * @param pattern  {@link java.text.SimpleDateFormat} compatible pattern
     * @param timeZone  non-null time zone to use
     * @param locale  non-null locale to use
     * @throws NullPointerException if pattern, timeZone, or locale is null.
     */
    protected FastDatePrinter(final String pattern, final TimeZone timeZone, final Locale locale) {try{__CLR4_5_2hpmhpmlvha7cow.R.inc(22954);
        __CLR4_5_2hpmhpmlvha7cow.R.inc(22955);mPattern = pattern;
        __CLR4_5_2hpmhpmlvha7cow.R.inc(22956);mTimeZone = timeZone;
        __CLR4_5_2hpmhpmlvha7cow.R.inc(22957);mLocale = locale;

        __CLR4_5_2hpmhpmlvha7cow.R.inc(22958);init();
    }finally{__CLR4_5_2hpmhpmlvha7cow.R.flushNeeded();}}

    /**
     * <p>Initializes the instance for first use.</p>
     */
    private void init() {try{__CLR4_5_2hpmhpmlvha7cow.R.inc(22959);
        __CLR4_5_2hpmhpmlvha7cow.R.inc(22960);final List<Rule> rulesList = parsePattern();
        __CLR4_5_2hpmhpmlvha7cow.R.inc(22961);mRules = rulesList.toArray(new Rule[rulesList.size()]);

        __CLR4_5_2hpmhpmlvha7cow.R.inc(22962);int len = 0;
        __CLR4_5_2hpmhpmlvha7cow.R.inc(22963);for (int i=mRules.length; (((--i >= 0)&&(__CLR4_5_2hpmhpmlvha7cow.R.iget(22964)!=0|true))||(__CLR4_5_2hpmhpmlvha7cow.R.iget(22965)==0&false)); ) {{
            __CLR4_5_2hpmhpmlvha7cow.R.inc(22966);len += mRules[i].estimateLength();
        }

        }__CLR4_5_2hpmhpmlvha7cow.R.inc(22967);mMaxLengthEstimate = len;
    }finally{__CLR4_5_2hpmhpmlvha7cow.R.flushNeeded();}}

    // Parse the pattern
    //-----------------------------------------------------------------------
    /**
     * <p>Returns a list of Rules given a pattern.</p>
     *
     * @return a {@code List} of Rule objects
     * @throws IllegalArgumentException if pattern is invalid
     */
    protected List<Rule> parsePattern() {try{__CLR4_5_2hpmhpmlvha7cow.R.inc(22968);
        __CLR4_5_2hpmhpmlvha7cow.R.inc(22969);final DateFormatSymbols symbols = new DateFormatSymbols(mLocale);
        __CLR4_5_2hpmhpmlvha7cow.R.inc(22970);final List<Rule> rules = new ArrayList<>();

        __CLR4_5_2hpmhpmlvha7cow.R.inc(22971);final String[] ERAs = symbols.getEras();
        __CLR4_5_2hpmhpmlvha7cow.R.inc(22972);final String[] months = symbols.getMonths();
        __CLR4_5_2hpmhpmlvha7cow.R.inc(22973);final String[] shortMonths = symbols.getShortMonths();
        __CLR4_5_2hpmhpmlvha7cow.R.inc(22974);final String[] weekdays = symbols.getWeekdays();
        __CLR4_5_2hpmhpmlvha7cow.R.inc(22975);final String[] shortWeekdays = symbols.getShortWeekdays();
        __CLR4_5_2hpmhpmlvha7cow.R.inc(22976);final String[] AmPmStrings = symbols.getAmPmStrings();

        __CLR4_5_2hpmhpmlvha7cow.R.inc(22977);final int length = mPattern.length();
        __CLR4_5_2hpmhpmlvha7cow.R.inc(22978);final int[] indexRef = new int[1];

        __CLR4_5_2hpmhpmlvha7cow.R.inc(22979);for (int i = 0; (((i < length)&&(__CLR4_5_2hpmhpmlvha7cow.R.iget(22980)!=0|true))||(__CLR4_5_2hpmhpmlvha7cow.R.iget(22981)==0&false)); i++) {{
            __CLR4_5_2hpmhpmlvha7cow.R.inc(22982);indexRef[0] = i;
            __CLR4_5_2hpmhpmlvha7cow.R.inc(22983);final String token = parseToken(mPattern, indexRef);
            __CLR4_5_2hpmhpmlvha7cow.R.inc(22984);i = indexRef[0];

            __CLR4_5_2hpmhpmlvha7cow.R.inc(22985);final int tokenLen = token.length();
            __CLR4_5_2hpmhpmlvha7cow.R.inc(22986);if ((((tokenLen == 0)&&(__CLR4_5_2hpmhpmlvha7cow.R.iget(22987)!=0|true))||(__CLR4_5_2hpmhpmlvha7cow.R.iget(22988)==0&false))) {{
                __CLR4_5_2hpmhpmlvha7cow.R.inc(22989);break;
            }

            }__CLR4_5_2hpmhpmlvha7cow.R.inc(22990);Rule rule;
            __CLR4_5_2hpmhpmlvha7cow.R.inc(22991);final char c = token.charAt(0);

            boolean __CLB4_5_2_bool0=false;__CLR4_5_2hpmhpmlvha7cow.R.inc(22992);switch (c) {
            case 'G':if (!__CLB4_5_2_bool0) {__CLR4_5_2hpmhpmlvha7cow.R.inc(22993);__CLB4_5_2_bool0=true;} // era designator (text)
                __CLR4_5_2hpmhpmlvha7cow.R.inc(22994);rule = new TextField(Calendar.ERA, ERAs);
                __CLR4_5_2hpmhpmlvha7cow.R.inc(22995);break;
            case 'y':if (!__CLB4_5_2_bool0) {__CLR4_5_2hpmhpmlvha7cow.R.inc(22996);__CLB4_5_2_bool0=true;} // year (number)
            case 'Y':if (!__CLB4_5_2_bool0) {__CLR4_5_2hpmhpmlvha7cow.R.inc(22997);__CLB4_5_2_bool0=true;} // week year
                __CLR4_5_2hpmhpmlvha7cow.R.inc(22998);if ((((tokenLen == 2)&&(__CLR4_5_2hpmhpmlvha7cow.R.iget(22999)!=0|true))||(__CLR4_5_2hpmhpmlvha7cow.R.iget(23000)==0&false))) {{
                    __CLR4_5_2hpmhpmlvha7cow.R.inc(23001);rule = TwoDigitYearField.INSTANCE;
                } }else {{
                    __CLR4_5_2hpmhpmlvha7cow.R.inc(23002);rule = selectNumberRule(Calendar.YEAR, (((tokenLen < 4 )&&(__CLR4_5_2hpmhpmlvha7cow.R.iget(23003)!=0|true))||(__CLR4_5_2hpmhpmlvha7cow.R.iget(23004)==0&false))? 4 : tokenLen);
                }
                }__CLR4_5_2hpmhpmlvha7cow.R.inc(23005);if ((((c == 'Y')&&(__CLR4_5_2hpmhpmlvha7cow.R.iget(23006)!=0|true))||(__CLR4_5_2hpmhpmlvha7cow.R.iget(23007)==0&false))) {{
                    __CLR4_5_2hpmhpmlvha7cow.R.inc(23008);rule = new WeekYear((NumberRule) rule);
                }
                }__CLR4_5_2hpmhpmlvha7cow.R.inc(23009);break;
            case 'M':if (!__CLB4_5_2_bool0) {__CLR4_5_2hpmhpmlvha7cow.R.inc(23010);__CLB4_5_2_bool0=true;} // month in year (text and number)
                __CLR4_5_2hpmhpmlvha7cow.R.inc(23011);if ((((tokenLen >= 4)&&(__CLR4_5_2hpmhpmlvha7cow.R.iget(23012)!=0|true))||(__CLR4_5_2hpmhpmlvha7cow.R.iget(23013)==0&false))) {{
                    __CLR4_5_2hpmhpmlvha7cow.R.inc(23014);rule = new TextField(Calendar.MONTH, months);
                } }else {__CLR4_5_2hpmhpmlvha7cow.R.inc(23015);if ((((tokenLen == 3)&&(__CLR4_5_2hpmhpmlvha7cow.R.iget(23016)!=0|true))||(__CLR4_5_2hpmhpmlvha7cow.R.iget(23017)==0&false))) {{
                    __CLR4_5_2hpmhpmlvha7cow.R.inc(23018);rule = new TextField(Calendar.MONTH, shortMonths);
                } }else {__CLR4_5_2hpmhpmlvha7cow.R.inc(23019);if ((((tokenLen == 2)&&(__CLR4_5_2hpmhpmlvha7cow.R.iget(23020)!=0|true))||(__CLR4_5_2hpmhpmlvha7cow.R.iget(23021)==0&false))) {{
                    __CLR4_5_2hpmhpmlvha7cow.R.inc(23022);rule = TwoDigitMonthField.INSTANCE;
                } }else {{
                    __CLR4_5_2hpmhpmlvha7cow.R.inc(23023);rule = UnpaddedMonthField.INSTANCE;
                }
                }}}__CLR4_5_2hpmhpmlvha7cow.R.inc(23024);break;
            case 'd':if (!__CLB4_5_2_bool0) {__CLR4_5_2hpmhpmlvha7cow.R.inc(23025);__CLB4_5_2_bool0=true;} // day in month (number)
                __CLR4_5_2hpmhpmlvha7cow.R.inc(23026);rule = selectNumberRule(Calendar.DAY_OF_MONTH, tokenLen);
                __CLR4_5_2hpmhpmlvha7cow.R.inc(23027);break;
            case 'h':if (!__CLB4_5_2_bool0) {__CLR4_5_2hpmhpmlvha7cow.R.inc(23028);__CLB4_5_2_bool0=true;} // hour in am/pm (number, 1..12)
                __CLR4_5_2hpmhpmlvha7cow.R.inc(23029);rule = new TwelveHourField(selectNumberRule(Calendar.HOUR, tokenLen));
                __CLR4_5_2hpmhpmlvha7cow.R.inc(23030);break;
            case 'H':if (!__CLB4_5_2_bool0) {__CLR4_5_2hpmhpmlvha7cow.R.inc(23031);__CLB4_5_2_bool0=true;} // hour in day (number, 0..23)
                __CLR4_5_2hpmhpmlvha7cow.R.inc(23032);rule = selectNumberRule(Calendar.HOUR_OF_DAY, tokenLen);
                __CLR4_5_2hpmhpmlvha7cow.R.inc(23033);break;
            case 'm':if (!__CLB4_5_2_bool0) {__CLR4_5_2hpmhpmlvha7cow.R.inc(23034);__CLB4_5_2_bool0=true;} // minute in hour (number)
                __CLR4_5_2hpmhpmlvha7cow.R.inc(23035);rule = selectNumberRule(Calendar.MINUTE, tokenLen);
                __CLR4_5_2hpmhpmlvha7cow.R.inc(23036);break;
            case 's':if (!__CLB4_5_2_bool0) {__CLR4_5_2hpmhpmlvha7cow.R.inc(23037);__CLB4_5_2_bool0=true;} // second in minute (number)
                __CLR4_5_2hpmhpmlvha7cow.R.inc(23038);rule = selectNumberRule(Calendar.SECOND, tokenLen);
                __CLR4_5_2hpmhpmlvha7cow.R.inc(23039);break;
            case 'S':if (!__CLB4_5_2_bool0) {__CLR4_5_2hpmhpmlvha7cow.R.inc(23040);__CLB4_5_2_bool0=true;} // millisecond (number)
                __CLR4_5_2hpmhpmlvha7cow.R.inc(23041);rule = selectNumberRule(Calendar.MILLISECOND, tokenLen);
                __CLR4_5_2hpmhpmlvha7cow.R.inc(23042);break;
            case 'E':if (!__CLB4_5_2_bool0) {__CLR4_5_2hpmhpmlvha7cow.R.inc(23043);__CLB4_5_2_bool0=true;} // day in week (text)
                __CLR4_5_2hpmhpmlvha7cow.R.inc(23044);rule = new TextField(Calendar.DAY_OF_WEEK, (((tokenLen < 4 )&&(__CLR4_5_2hpmhpmlvha7cow.R.iget(23045)!=0|true))||(__CLR4_5_2hpmhpmlvha7cow.R.iget(23046)==0&false))? shortWeekdays : weekdays);
                __CLR4_5_2hpmhpmlvha7cow.R.inc(23047);break;
            case 'u':if (!__CLB4_5_2_bool0) {__CLR4_5_2hpmhpmlvha7cow.R.inc(23048);__CLB4_5_2_bool0=true;} // day in week (number)
                __CLR4_5_2hpmhpmlvha7cow.R.inc(23049);rule = new DayInWeekField(selectNumberRule(Calendar.DAY_OF_WEEK, tokenLen));
                __CLR4_5_2hpmhpmlvha7cow.R.inc(23050);break;
            case 'D':if (!__CLB4_5_2_bool0) {__CLR4_5_2hpmhpmlvha7cow.R.inc(23051);__CLB4_5_2_bool0=true;} // day in year (number)
                __CLR4_5_2hpmhpmlvha7cow.R.inc(23052);rule = selectNumberRule(Calendar.DAY_OF_YEAR, tokenLen);
                __CLR4_5_2hpmhpmlvha7cow.R.inc(23053);break;
            case 'F':if (!__CLB4_5_2_bool0) {__CLR4_5_2hpmhpmlvha7cow.R.inc(23054);__CLB4_5_2_bool0=true;} // day of week in month (number)
                __CLR4_5_2hpmhpmlvha7cow.R.inc(23055);rule = selectNumberRule(Calendar.DAY_OF_WEEK_IN_MONTH, tokenLen);
                __CLR4_5_2hpmhpmlvha7cow.R.inc(23056);break;
            case 'w':if (!__CLB4_5_2_bool0) {__CLR4_5_2hpmhpmlvha7cow.R.inc(23057);__CLB4_5_2_bool0=true;} // week in year (number)
                __CLR4_5_2hpmhpmlvha7cow.R.inc(23058);rule = selectNumberRule(Calendar.WEEK_OF_YEAR, tokenLen);
                __CLR4_5_2hpmhpmlvha7cow.R.inc(23059);break;
            case 'W':if (!__CLB4_5_2_bool0) {__CLR4_5_2hpmhpmlvha7cow.R.inc(23060);__CLB4_5_2_bool0=true;} // week in month (number)
                __CLR4_5_2hpmhpmlvha7cow.R.inc(23061);rule = selectNumberRule(Calendar.WEEK_OF_MONTH, tokenLen);
                __CLR4_5_2hpmhpmlvha7cow.R.inc(23062);break;
            case 'a':if (!__CLB4_5_2_bool0) {__CLR4_5_2hpmhpmlvha7cow.R.inc(23063);__CLB4_5_2_bool0=true;} // am/pm marker (text)
                __CLR4_5_2hpmhpmlvha7cow.R.inc(23064);rule = new TextField(Calendar.AM_PM, AmPmStrings);
                __CLR4_5_2hpmhpmlvha7cow.R.inc(23065);break;
            case 'k':if (!__CLB4_5_2_bool0) {__CLR4_5_2hpmhpmlvha7cow.R.inc(23066);__CLB4_5_2_bool0=true;} // hour in day (1..24)
                __CLR4_5_2hpmhpmlvha7cow.R.inc(23067);rule = new TwentyFourHourField(selectNumberRule(Calendar.HOUR_OF_DAY, tokenLen));
                __CLR4_5_2hpmhpmlvha7cow.R.inc(23068);break;
            case 'K':if (!__CLB4_5_2_bool0) {__CLR4_5_2hpmhpmlvha7cow.R.inc(23069);__CLB4_5_2_bool0=true;} // hour in am/pm (0..11)
                __CLR4_5_2hpmhpmlvha7cow.R.inc(23070);rule = selectNumberRule(Calendar.HOUR, tokenLen);
                __CLR4_5_2hpmhpmlvha7cow.R.inc(23071);break;
            case 'X':if (!__CLB4_5_2_bool0) {__CLR4_5_2hpmhpmlvha7cow.R.inc(23072);__CLB4_5_2_bool0=true;} // ISO 8601 
                __CLR4_5_2hpmhpmlvha7cow.R.inc(23073);rule = Iso8601_Rule.getRule(tokenLen);
                __CLR4_5_2hpmhpmlvha7cow.R.inc(23074);break;    
            case 'z':if (!__CLB4_5_2_bool0) {__CLR4_5_2hpmhpmlvha7cow.R.inc(23075);__CLB4_5_2_bool0=true;} // time zone (text)
                __CLR4_5_2hpmhpmlvha7cow.R.inc(23076);if ((((tokenLen >= 4)&&(__CLR4_5_2hpmhpmlvha7cow.R.iget(23077)!=0|true))||(__CLR4_5_2hpmhpmlvha7cow.R.iget(23078)==0&false))) {{
                    __CLR4_5_2hpmhpmlvha7cow.R.inc(23079);rule = new TimeZoneNameRule(mTimeZone, mLocale, TimeZone.LONG);
                } }else {{
                    __CLR4_5_2hpmhpmlvha7cow.R.inc(23080);rule = new TimeZoneNameRule(mTimeZone, mLocale, TimeZone.SHORT);
                }
                }__CLR4_5_2hpmhpmlvha7cow.R.inc(23081);break;
            case 'Z':if (!__CLB4_5_2_bool0) {__CLR4_5_2hpmhpmlvha7cow.R.inc(23082);__CLB4_5_2_bool0=true;} // time zone (value)
                __CLR4_5_2hpmhpmlvha7cow.R.inc(23083);if ((((tokenLen == 1)&&(__CLR4_5_2hpmhpmlvha7cow.R.iget(23084)!=0|true))||(__CLR4_5_2hpmhpmlvha7cow.R.iget(23085)==0&false))) {{
                    __CLR4_5_2hpmhpmlvha7cow.R.inc(23086);rule = TimeZoneNumberRule.INSTANCE_NO_COLON;
                } }else {__CLR4_5_2hpmhpmlvha7cow.R.inc(23087);if ((((tokenLen == 2)&&(__CLR4_5_2hpmhpmlvha7cow.R.iget(23088)!=0|true))||(__CLR4_5_2hpmhpmlvha7cow.R.iget(23089)==0&false))) {{
                    __CLR4_5_2hpmhpmlvha7cow.R.inc(23090);rule = Iso8601_Rule.ISO8601_HOURS_COLON_MINUTES;
                } }else {{
                    __CLR4_5_2hpmhpmlvha7cow.R.inc(23091);rule = TimeZoneNumberRule.INSTANCE_COLON;
                }
                }}__CLR4_5_2hpmhpmlvha7cow.R.inc(23092);break;
            case '\'':if (!__CLB4_5_2_bool0) {__CLR4_5_2hpmhpmlvha7cow.R.inc(23093);__CLB4_5_2_bool0=true;} // literal text
                __CLR4_5_2hpmhpmlvha7cow.R.inc(23094);final String sub = token.substring(1);
                __CLR4_5_2hpmhpmlvha7cow.R.inc(23095);if ((((sub.length() == 1)&&(__CLR4_5_2hpmhpmlvha7cow.R.iget(23096)!=0|true))||(__CLR4_5_2hpmhpmlvha7cow.R.iget(23097)==0&false))) {{
                    __CLR4_5_2hpmhpmlvha7cow.R.inc(23098);rule = new CharacterLiteral(sub.charAt(0));
                } }else {{
                    __CLR4_5_2hpmhpmlvha7cow.R.inc(23099);rule = new StringLiteral(sub);
                }
                }__CLR4_5_2hpmhpmlvha7cow.R.inc(23100);break;
            default:if (!__CLB4_5_2_bool0) {__CLR4_5_2hpmhpmlvha7cow.R.inc(23101);__CLB4_5_2_bool0=true;}
                __CLR4_5_2hpmhpmlvha7cow.R.inc(23102);throw new IllegalArgumentException("Illegal pattern component: " + token);
            }

            __CLR4_5_2hpmhpmlvha7cow.R.inc(23103);rules.add(rule);
        }

        }__CLR4_5_2hpmhpmlvha7cow.R.inc(23104);return rules;
    }finally{__CLR4_5_2hpmhpmlvha7cow.R.flushNeeded();}}

    /**
     * <p>Performs the parsing of tokens.</p>
     *
     * @param pattern  the pattern
     * @param indexRef  index references
     * @return parsed token
     */
    protected String parseToken(final String pattern, final int[] indexRef) {try{__CLR4_5_2hpmhpmlvha7cow.R.inc(23105);
        __CLR4_5_2hpmhpmlvha7cow.R.inc(23106);final StringBuilder buf = new StringBuilder();

        __CLR4_5_2hpmhpmlvha7cow.R.inc(23107);int i = indexRef[0];
        __CLR4_5_2hpmhpmlvha7cow.R.inc(23108);final int length = pattern.length();

        __CLR4_5_2hpmhpmlvha7cow.R.inc(23109);char c = pattern.charAt(i);
        __CLR4_5_2hpmhpmlvha7cow.R.inc(23110);if ((((c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z')&&(__CLR4_5_2hpmhpmlvha7cow.R.iget(23111)!=0|true))||(__CLR4_5_2hpmhpmlvha7cow.R.iget(23112)==0&false))) {{
            // Scan a run of the same character, which indicates a time
            // pattern.
            __CLR4_5_2hpmhpmlvha7cow.R.inc(23113);buf.append(c);

            __CLR4_5_2hpmhpmlvha7cow.R.inc(23114);while ((((i + 1 < length)&&(__CLR4_5_2hpmhpmlvha7cow.R.iget(23115)!=0|true))||(__CLR4_5_2hpmhpmlvha7cow.R.iget(23116)==0&false))) {{
                __CLR4_5_2hpmhpmlvha7cow.R.inc(23117);final char peek = pattern.charAt(i + 1);
                __CLR4_5_2hpmhpmlvha7cow.R.inc(23118);if ((((peek == c)&&(__CLR4_5_2hpmhpmlvha7cow.R.iget(23119)!=0|true))||(__CLR4_5_2hpmhpmlvha7cow.R.iget(23120)==0&false))) {{
                    __CLR4_5_2hpmhpmlvha7cow.R.inc(23121);buf.append(c);
                    __CLR4_5_2hpmhpmlvha7cow.R.inc(23122);i++;
                } }else {{
                    __CLR4_5_2hpmhpmlvha7cow.R.inc(23123);break;
                }
            }}
        }} }else {{
            // This will identify token as text.
            __CLR4_5_2hpmhpmlvha7cow.R.inc(23124);buf.append('\'');

            __CLR4_5_2hpmhpmlvha7cow.R.inc(23125);boolean inLiteral = false;

            __CLR4_5_2hpmhpmlvha7cow.R.inc(23126);for (; (((i < length)&&(__CLR4_5_2hpmhpmlvha7cow.R.iget(23127)!=0|true))||(__CLR4_5_2hpmhpmlvha7cow.R.iget(23128)==0&false)); i++) {{
                __CLR4_5_2hpmhpmlvha7cow.R.inc(23129);c = pattern.charAt(i);

                __CLR4_5_2hpmhpmlvha7cow.R.inc(23130);if ((((c == '\'')&&(__CLR4_5_2hpmhpmlvha7cow.R.iget(23131)!=0|true))||(__CLR4_5_2hpmhpmlvha7cow.R.iget(23132)==0&false))) {{
                    __CLR4_5_2hpmhpmlvha7cow.R.inc(23133);if ((((i + 1 < length && pattern.charAt(i + 1) == '\'')&&(__CLR4_5_2hpmhpmlvha7cow.R.iget(23134)!=0|true))||(__CLR4_5_2hpmhpmlvha7cow.R.iget(23135)==0&false))) {{
                        // '' is treated as escaped '
                        __CLR4_5_2hpmhpmlvha7cow.R.inc(23136);i++;
                        __CLR4_5_2hpmhpmlvha7cow.R.inc(23137);buf.append(c);
                    } }else {{
                        __CLR4_5_2hpmhpmlvha7cow.R.inc(23138);inLiteral = !inLiteral;
                    }
                }} }else {__CLR4_5_2hpmhpmlvha7cow.R.inc(23139);if ((((!inLiteral &&
                         (c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z'))&&(__CLR4_5_2hpmhpmlvha7cow.R.iget(23140)!=0|true))||(__CLR4_5_2hpmhpmlvha7cow.R.iget(23141)==0&false))) {{
                    __CLR4_5_2hpmhpmlvha7cow.R.inc(23142);i--;
                    __CLR4_5_2hpmhpmlvha7cow.R.inc(23143);break;
                } }else {{
                    __CLR4_5_2hpmhpmlvha7cow.R.inc(23144);buf.append(c);
                }
            }}}
        }}

        }__CLR4_5_2hpmhpmlvha7cow.R.inc(23145);indexRef[0] = i;
        __CLR4_5_2hpmhpmlvha7cow.R.inc(23146);return buf.toString();
    }finally{__CLR4_5_2hpmhpmlvha7cow.R.flushNeeded();}}

    /**
     * <p>Gets an appropriate rule for the padding required.</p>
     *
     * @param field  the field to get a rule for
     * @param padding  the padding required
     * @return a new rule with the correct padding
     */
    protected NumberRule selectNumberRule(final int field, final int padding) {try{__CLR4_5_2hpmhpmlvha7cow.R.inc(23147);
        boolean __CLB4_5_2_bool1=false;__CLR4_5_2hpmhpmlvha7cow.R.inc(23148);switch (padding) {
        case 1:if (!__CLB4_5_2_bool1) {__CLR4_5_2hpmhpmlvha7cow.R.inc(23149);__CLB4_5_2_bool1=true;}
            __CLR4_5_2hpmhpmlvha7cow.R.inc(23150);return new UnpaddedNumberField(field);
        case 2:if (!__CLB4_5_2_bool1) {__CLR4_5_2hpmhpmlvha7cow.R.inc(23151);__CLB4_5_2_bool1=true;}
            __CLR4_5_2hpmhpmlvha7cow.R.inc(23152);return new TwoDigitNumberField(field);
        default:if (!__CLB4_5_2_bool1) {__CLR4_5_2hpmhpmlvha7cow.R.inc(23153);__CLB4_5_2_bool1=true;}
            __CLR4_5_2hpmhpmlvha7cow.R.inc(23154);return new PaddedNumberField(field, padding);
        }
    }finally{__CLR4_5_2hpmhpmlvha7cow.R.flushNeeded();}}

    // Format methods
    //-----------------------------------------------------------------------
    /**
     * <p>Formats a {@code Date}, {@code Calendar} or
     * {@code Long} (milliseconds) object.</p>
     * @deprecated Use {{@link #format(Date)}, {{@link #format(Calendar)}, {{@link #format(long)}, or {{@link #format(Object)}
     * @param obj  the object to format
     * @param toAppendTo  the buffer to append to
     * @param pos  the position - ignored
     * @return the buffer passed in
     */
    @Deprecated
    @Override
    public StringBuffer format(final Object obj, final StringBuffer toAppendTo, final FieldPosition pos) {try{__CLR4_5_2hpmhpmlvha7cow.R.inc(23155);
        __CLR4_5_2hpmhpmlvha7cow.R.inc(23156);if ((((obj instanceof Date)&&(__CLR4_5_2hpmhpmlvha7cow.R.iget(23157)!=0|true))||(__CLR4_5_2hpmhpmlvha7cow.R.iget(23158)==0&false))) {{
            __CLR4_5_2hpmhpmlvha7cow.R.inc(23159);return format((Date) obj, toAppendTo);
        } }else {__CLR4_5_2hpmhpmlvha7cow.R.inc(23160);if ((((obj instanceof Calendar)&&(__CLR4_5_2hpmhpmlvha7cow.R.iget(23161)!=0|true))||(__CLR4_5_2hpmhpmlvha7cow.R.iget(23162)==0&false))) {{
            __CLR4_5_2hpmhpmlvha7cow.R.inc(23163);return format((Calendar) obj, toAppendTo);
        } }else {__CLR4_5_2hpmhpmlvha7cow.R.inc(23164);if ((((obj instanceof Long)&&(__CLR4_5_2hpmhpmlvha7cow.R.iget(23165)!=0|true))||(__CLR4_5_2hpmhpmlvha7cow.R.iget(23166)==0&false))) {{
            __CLR4_5_2hpmhpmlvha7cow.R.inc(23167);return format(((Long) obj).longValue(), toAppendTo);
        } }else {{
            __CLR4_5_2hpmhpmlvha7cow.R.inc(23168);throw new IllegalArgumentException("Unknown class: " +
                ((((obj == null )&&(__CLR4_5_2hpmhpmlvha7cow.R.iget(23169)!=0|true))||(__CLR4_5_2hpmhpmlvha7cow.R.iget(23170)==0&false))? "<null>" : obj.getClass().getName()));
        }
    }}}}finally{__CLR4_5_2hpmhpmlvha7cow.R.flushNeeded();}}

    /**
     * <p>Formats a {@code Date}, {@code Calendar} or
     * {@code Long} (milliseconds) object.</p>
     * @since 3.5
     * @param obj  the object to format
     * @return The formatted value.
     */
    String format(final Object obj) {try{__CLR4_5_2hpmhpmlvha7cow.R.inc(23171);
        __CLR4_5_2hpmhpmlvha7cow.R.inc(23172);if ((((obj instanceof Date)&&(__CLR4_5_2hpmhpmlvha7cow.R.iget(23173)!=0|true))||(__CLR4_5_2hpmhpmlvha7cow.R.iget(23174)==0&false))) {{
            __CLR4_5_2hpmhpmlvha7cow.R.inc(23175);return format((Date) obj);
        } }else {__CLR4_5_2hpmhpmlvha7cow.R.inc(23176);if ((((obj instanceof Calendar)&&(__CLR4_5_2hpmhpmlvha7cow.R.iget(23177)!=0|true))||(__CLR4_5_2hpmhpmlvha7cow.R.iget(23178)==0&false))) {{
            __CLR4_5_2hpmhpmlvha7cow.R.inc(23179);return format((Calendar) obj);
        } }else {__CLR4_5_2hpmhpmlvha7cow.R.inc(23180);if ((((obj instanceof Long)&&(__CLR4_5_2hpmhpmlvha7cow.R.iget(23181)!=0|true))||(__CLR4_5_2hpmhpmlvha7cow.R.iget(23182)==0&false))) {{
            __CLR4_5_2hpmhpmlvha7cow.R.inc(23183);return format(((Long) obj).longValue());
        } }else {{
            __CLR4_5_2hpmhpmlvha7cow.R.inc(23184);throw new IllegalArgumentException("Unknown class: " +
                ((((obj == null )&&(__CLR4_5_2hpmhpmlvha7cow.R.iget(23185)!=0|true))||(__CLR4_5_2hpmhpmlvha7cow.R.iget(23186)==0&false))? "<null>" : obj.getClass().getName()));
        }
    }}}}finally{__CLR4_5_2hpmhpmlvha7cow.R.flushNeeded();}}

    /* (non-Javadoc)
     * @see org.apache.commons.lang3.time.DatePrinter#format(long)
     */
    @Override
    public String format(final long millis) {try{__CLR4_5_2hpmhpmlvha7cow.R.inc(23187);
        __CLR4_5_2hpmhpmlvha7cow.R.inc(23188);final Calendar c = newCalendar();
        __CLR4_5_2hpmhpmlvha7cow.R.inc(23189);c.setTimeInMillis(millis);
        __CLR4_5_2hpmhpmlvha7cow.R.inc(23190);return applyRulesToString(c);
    }finally{__CLR4_5_2hpmhpmlvha7cow.R.flushNeeded();}}

    /**
     * Creates a String representation of the given Calendar by applying the rules of this printer to it.
     * @param c the Calender to apply the rules to.
     * @return a String representation of the given Calendar.
     */
    private String applyRulesToString(final Calendar c) {try{__CLR4_5_2hpmhpmlvha7cow.R.inc(23191);
        __CLR4_5_2hpmhpmlvha7cow.R.inc(23192);return applyRules(c, new StringBuilder(mMaxLengthEstimate)).toString();
    }finally{__CLR4_5_2hpmhpmlvha7cow.R.flushNeeded();}}

    /**
     * Creation method for new calender instances.
     * @return a new Calendar instance.
     */
    private Calendar newCalendar() {try{__CLR4_5_2hpmhpmlvha7cow.R.inc(23193);
        __CLR4_5_2hpmhpmlvha7cow.R.inc(23194);return Calendar.getInstance(mTimeZone, mLocale);
    }finally{__CLR4_5_2hpmhpmlvha7cow.R.flushNeeded();}}

    /* (non-Javadoc)
     * @see org.apache.commons.lang3.time.DatePrinter#format(java.util.Date)
     */
    @Override
    public String format(final Date date) {try{__CLR4_5_2hpmhpmlvha7cow.R.inc(23195);
        __CLR4_5_2hpmhpmlvha7cow.R.inc(23196);final Calendar c = newCalendar();
        __CLR4_5_2hpmhpmlvha7cow.R.inc(23197);c.setTime(date);
        __CLR4_5_2hpmhpmlvha7cow.R.inc(23198);return applyRulesToString(c);
    }finally{__CLR4_5_2hpmhpmlvha7cow.R.flushNeeded();}}

    /* (non-Javadoc)
     * @see org.apache.commons.lang3.time.DatePrinter#format(java.util.Calendar)
     */
    @Override
    public String format(final Calendar calendar) {try{__CLR4_5_2hpmhpmlvha7cow.R.inc(23199);
        __CLR4_5_2hpmhpmlvha7cow.R.inc(23200);return format(calendar, new StringBuilder(mMaxLengthEstimate)).toString();
    }finally{__CLR4_5_2hpmhpmlvha7cow.R.flushNeeded();}}

    /* (non-Javadoc)
     * @see org.apache.commons.lang3.time.DatePrinter#format(long, java.lang.StringBuffer)
     */
    @Override
    public StringBuffer format(final long millis, final StringBuffer buf) {try{__CLR4_5_2hpmhpmlvha7cow.R.inc(23201);
        __CLR4_5_2hpmhpmlvha7cow.R.inc(23202);final Calendar c = newCalendar();
        __CLR4_5_2hpmhpmlvha7cow.R.inc(23203);c.setTimeInMillis(millis);
        __CLR4_5_2hpmhpmlvha7cow.R.inc(23204);return (StringBuffer) applyRules(c, (Appendable)buf);
    }finally{__CLR4_5_2hpmhpmlvha7cow.R.flushNeeded();}}

    /* (non-Javadoc)
     * @see org.apache.commons.lang3.time.DatePrinter#format(java.util.Date, java.lang.StringBuffer)
     */
    @Override
    public StringBuffer format(final Date date, final StringBuffer buf) {try{__CLR4_5_2hpmhpmlvha7cow.R.inc(23205);
        __CLR4_5_2hpmhpmlvha7cow.R.inc(23206);final Calendar c = newCalendar();
        __CLR4_5_2hpmhpmlvha7cow.R.inc(23207);c.setTime(date);
        __CLR4_5_2hpmhpmlvha7cow.R.inc(23208);return (StringBuffer) applyRules(c, (Appendable)buf);
    }finally{__CLR4_5_2hpmhpmlvha7cow.R.flushNeeded();}}

    /* (non-Javadoc)
     * @see org.apache.commons.lang3.time.DatePrinter#format(java.util.Calendar, java.lang.StringBuffer)
     */
    @Override
    public StringBuffer format(final Calendar calendar, final StringBuffer buf) {try{__CLR4_5_2hpmhpmlvha7cow.R.inc(23209);
        // do not pass in calendar directly, this will cause TimeZone of FastDatePrinter to be ignored
        __CLR4_5_2hpmhpmlvha7cow.R.inc(23210);return format(calendar.getTime(), buf);
    }finally{__CLR4_5_2hpmhpmlvha7cow.R.flushNeeded();}}

    /* (non-Javadoc)
     * @see org.apache.commons.lang3.time.DatePrinter#format(long, java.lang.Appendable)
     */
    @Override
    public <B extends Appendable> B format(final long millis, final B buf) {try{__CLR4_5_2hpmhpmlvha7cow.R.inc(23211);
        __CLR4_5_2hpmhpmlvha7cow.R.inc(23212);final Calendar c = newCalendar();
        __CLR4_5_2hpmhpmlvha7cow.R.inc(23213);c.setTimeInMillis(millis);
        __CLR4_5_2hpmhpmlvha7cow.R.inc(23214);return applyRules(c, buf);
    }finally{__CLR4_5_2hpmhpmlvha7cow.R.flushNeeded();}}

    /* (non-Javadoc)
     * @see org.apache.commons.lang3.time.DatePrinter#format(java.util.Date, java.lang.Appendable)
     */
    @Override
    public <B extends Appendable> B format(final Date date, final B buf) {try{__CLR4_5_2hpmhpmlvha7cow.R.inc(23215);
        __CLR4_5_2hpmhpmlvha7cow.R.inc(23216);final Calendar c = newCalendar();
        __CLR4_5_2hpmhpmlvha7cow.R.inc(23217);c.setTime(date);
        __CLR4_5_2hpmhpmlvha7cow.R.inc(23218);return applyRules(c, buf);
    }finally{__CLR4_5_2hpmhpmlvha7cow.R.flushNeeded();}}

    /* (non-Javadoc)
     * @see org.apache.commons.lang3.time.DatePrinter#format(java.util.Calendar, java.lang.Appendable)
     */
    @Override
    public <B extends Appendable> B format(Calendar calendar, final B buf) {try{__CLR4_5_2hpmhpmlvha7cow.R.inc(23219);
        // do not pass in calendar directly, this will cause TimeZone of FastDatePrinter to be ignored
        __CLR4_5_2hpmhpmlvha7cow.R.inc(23220);if((((!calendar.getTimeZone().equals(mTimeZone))&&(__CLR4_5_2hpmhpmlvha7cow.R.iget(23221)!=0|true))||(__CLR4_5_2hpmhpmlvha7cow.R.iget(23222)==0&false))) {{
            __CLR4_5_2hpmhpmlvha7cow.R.inc(23223);calendar = (Calendar)calendar.clone();
            __CLR4_5_2hpmhpmlvha7cow.R.inc(23224);calendar.setTimeZone(mTimeZone);
        }
        }__CLR4_5_2hpmhpmlvha7cow.R.inc(23225);return applyRules(calendar, buf);
    }finally{__CLR4_5_2hpmhpmlvha7cow.R.flushNeeded();}}

    /**
     * Performs the formatting by applying the rules to the
     * specified calendar.
     *
     * @param calendar the calendar to format
     * @param buf the buffer to format into
     * @return the specified string buffer
     *
     * @deprecated use {@link #format(Calendar)} or {@link #format(Calendar, Appendable)}
     */
    @Deprecated
    protected StringBuffer applyRules(final Calendar calendar, final StringBuffer buf) {try{__CLR4_5_2hpmhpmlvha7cow.R.inc(23226);
        __CLR4_5_2hpmhpmlvha7cow.R.inc(23227);return (StringBuffer) applyRules(calendar, (Appendable)buf);
    }finally{__CLR4_5_2hpmhpmlvha7cow.R.flushNeeded();}}

    /**
     * <p>Performs the formatting by applying the rules to the
     * specified calendar.</p>
     *
     * @param calendar  the calendar to format
     * @param buf  the buffer to format into
     * @param <B> the Appendable class type, usually StringBuilder or StringBuffer.
     * @return the specified string buffer
     */
    private <B extends Appendable> B applyRules(final Calendar calendar, final B buf) {try{__CLR4_5_2hpmhpmlvha7cow.R.inc(23228);
        __CLR4_5_2hpmhpmlvha7cow.R.inc(23229);try {
            __CLR4_5_2hpmhpmlvha7cow.R.inc(23230);for (final Rule rule : mRules) {{
                __CLR4_5_2hpmhpmlvha7cow.R.inc(23231);rule.appendTo(buf, calendar);
            }
        }} catch (final IOException ioe) {
            __CLR4_5_2hpmhpmlvha7cow.R.inc(23232);ExceptionUtils.rethrow(ioe);
        }
        __CLR4_5_2hpmhpmlvha7cow.R.inc(23233);return buf;
    }finally{__CLR4_5_2hpmhpmlvha7cow.R.flushNeeded();}}

    // Accessors
    //-----------------------------------------------------------------------
    /* (non-Javadoc)
     * @see org.apache.commons.lang3.time.DatePrinter#getPattern()
     */
    @Override
    public String getPattern() {try{__CLR4_5_2hpmhpmlvha7cow.R.inc(23234);
        __CLR4_5_2hpmhpmlvha7cow.R.inc(23235);return mPattern;
    }finally{__CLR4_5_2hpmhpmlvha7cow.R.flushNeeded();}}

    /* (non-Javadoc)
     * @see org.apache.commons.lang3.time.DatePrinter#getTimeZone()
     */
    @Override
    public TimeZone getTimeZone() {try{__CLR4_5_2hpmhpmlvha7cow.R.inc(23236);
        __CLR4_5_2hpmhpmlvha7cow.R.inc(23237);return mTimeZone;
    }finally{__CLR4_5_2hpmhpmlvha7cow.R.flushNeeded();}}

    /* (non-Javadoc)
     * @see org.apache.commons.lang3.time.DatePrinter#getLocale()
     */
    @Override
    public Locale getLocale() {try{__CLR4_5_2hpmhpmlvha7cow.R.inc(23238);
        __CLR4_5_2hpmhpmlvha7cow.R.inc(23239);return mLocale;
    }finally{__CLR4_5_2hpmhpmlvha7cow.R.flushNeeded();}}

    /**
     * <p>Gets an estimate for the maximum string length that the
     * formatter will produce.</p>
     *
     * <p>The actual formatted length will almost always be less than or
     * equal to this amount.</p>
     *
     * @return the maximum formatted length
     */
    public int getMaxLengthEstimate() {try{__CLR4_5_2hpmhpmlvha7cow.R.inc(23240);
        __CLR4_5_2hpmhpmlvha7cow.R.inc(23241);return mMaxLengthEstimate;
    }finally{__CLR4_5_2hpmhpmlvha7cow.R.flushNeeded();}}

    // Basics
    //-----------------------------------------------------------------------
    /**
     * <p>Compares two objects for equality.</p>
     *
     * @param obj  the object to compare to
     * @return {@code true} if equal
     */
    @Override
    public boolean equals(final Object obj) {try{__CLR4_5_2hpmhpmlvha7cow.R.inc(23242);
        __CLR4_5_2hpmhpmlvha7cow.R.inc(23243);if ((((obj instanceof FastDatePrinter == false)&&(__CLR4_5_2hpmhpmlvha7cow.R.iget(23244)!=0|true))||(__CLR4_5_2hpmhpmlvha7cow.R.iget(23245)==0&false))) {{
            __CLR4_5_2hpmhpmlvha7cow.R.inc(23246);return false;
        }
        }__CLR4_5_2hpmhpmlvha7cow.R.inc(23247);final FastDatePrinter other = (FastDatePrinter) obj;
        __CLR4_5_2hpmhpmlvha7cow.R.inc(23248);return mPattern.equals(other.mPattern)
            && mTimeZone.equals(other.mTimeZone) 
            && mLocale.equals(other.mLocale);
    }finally{__CLR4_5_2hpmhpmlvha7cow.R.flushNeeded();}}

    /**
     * <p>Returns a hash code compatible with equals.</p>
     *
     * @return a hash code compatible with equals
     */
    @Override
    public int hashCode() {try{__CLR4_5_2hpmhpmlvha7cow.R.inc(23249);
        __CLR4_5_2hpmhpmlvha7cow.R.inc(23250);return mPattern.hashCode() + 13 * (mTimeZone.hashCode() + 13 * mLocale.hashCode());
    }finally{__CLR4_5_2hpmhpmlvha7cow.R.flushNeeded();}}

    /**
     * <p>Gets a debugging string version of this formatter.</p>
     *
     * @return a debugging string
     */
    @Override
    public String toString() {try{__CLR4_5_2hpmhpmlvha7cow.R.inc(23251);
        __CLR4_5_2hpmhpmlvha7cow.R.inc(23252);return "FastDatePrinter[" + mPattern + "," + mLocale + "," + mTimeZone.getID() + "]";
    }finally{__CLR4_5_2hpmhpmlvha7cow.R.flushNeeded();}}

    // Serializing
    //-----------------------------------------------------------------------
    /**
     * Create the object after serialization. This implementation reinitializes the
     * transient properties.
     *
     * @param in ObjectInputStream from which the object is being deserialized.
     * @throws IOException if there is an IO issue.
     * @throws ClassNotFoundException if a class cannot be found.
     */
    private void readObject(final ObjectInputStream in) throws IOException, ClassNotFoundException {try{__CLR4_5_2hpmhpmlvha7cow.R.inc(23253);
        __CLR4_5_2hpmhpmlvha7cow.R.inc(23254);in.defaultReadObject();
        __CLR4_5_2hpmhpmlvha7cow.R.inc(23255);init();
    }finally{__CLR4_5_2hpmhpmlvha7cow.R.flushNeeded();}}

    /**
     * Appends two digits to the given buffer.
     *
     * @param buffer the buffer to append to.
     * @param value the value to append digits from.
     */
    private static void appendDigits(final Appendable buffer, final int value) throws IOException {try{__CLR4_5_2hpmhpmlvha7cow.R.inc(23256);
        __CLR4_5_2hpmhpmlvha7cow.R.inc(23257);buffer.append((char)(value / 10 + '0'));
        __CLR4_5_2hpmhpmlvha7cow.R.inc(23258);buffer.append((char)(value % 10 + '0'));
    }finally{__CLR4_5_2hpmhpmlvha7cow.R.flushNeeded();}}

    private static final int MAX_DIGITS = 10; // log10(Integer.MAX_VALUE) ~= 9.3

    /**
     * Appends all digits to the given buffer.
     *
     * @param buffer the buffer to append to.
     * @param value the value to append digits from.
     */
    private static void appendFullDigits(final Appendable buffer, int value, int minFieldWidth) throws IOException {try{__CLR4_5_2hpmhpmlvha7cow.R.inc(23259);
        // specialized paths for 1 to 4 digits -> avoid the memory allocation from the temporary work array
        // see LANG-1248
        __CLR4_5_2hpmhpmlvha7cow.R.inc(23260);if ((((value < 10000)&&(__CLR4_5_2hpmhpmlvha7cow.R.iget(23261)!=0|true))||(__CLR4_5_2hpmhpmlvha7cow.R.iget(23262)==0&false))) {{
            // less memory allocation path works for four digits or less

            __CLR4_5_2hpmhpmlvha7cow.R.inc(23263);int nDigits = 4;
            __CLR4_5_2hpmhpmlvha7cow.R.inc(23264);if ((((value < 1000)&&(__CLR4_5_2hpmhpmlvha7cow.R.iget(23265)!=0|true))||(__CLR4_5_2hpmhpmlvha7cow.R.iget(23266)==0&false))) {{
                __CLR4_5_2hpmhpmlvha7cow.R.inc(23267);--nDigits;
                __CLR4_5_2hpmhpmlvha7cow.R.inc(23268);if ((((value < 100)&&(__CLR4_5_2hpmhpmlvha7cow.R.iget(23269)!=0|true))||(__CLR4_5_2hpmhpmlvha7cow.R.iget(23270)==0&false))) {{
                    __CLR4_5_2hpmhpmlvha7cow.R.inc(23271);--nDigits;
                    __CLR4_5_2hpmhpmlvha7cow.R.inc(23272);if ((((value < 10)&&(__CLR4_5_2hpmhpmlvha7cow.R.iget(23273)!=0|true))||(__CLR4_5_2hpmhpmlvha7cow.R.iget(23274)==0&false))) {{
                        __CLR4_5_2hpmhpmlvha7cow.R.inc(23275);--nDigits;
                    }
                }}
            }}
            // left zero pad
            }__CLR4_5_2hpmhpmlvha7cow.R.inc(23276);for (int i = minFieldWidth - nDigits; (((i > 0)&&(__CLR4_5_2hpmhpmlvha7cow.R.iget(23277)!=0|true))||(__CLR4_5_2hpmhpmlvha7cow.R.iget(23278)==0&false)); --i) {{
                __CLR4_5_2hpmhpmlvha7cow.R.inc(23279);buffer.append('0');
            }

            }boolean __CLB4_5_2_bool2=false;__CLR4_5_2hpmhpmlvha7cow.R.inc(23280);switch (nDigits) {
            case 4:if (!__CLB4_5_2_bool2) {__CLR4_5_2hpmhpmlvha7cow.R.inc(23281);__CLB4_5_2_bool2=true;}
                __CLR4_5_2hpmhpmlvha7cow.R.inc(23282);buffer.append((char) (value / 1000 + '0'));
                __CLR4_5_2hpmhpmlvha7cow.R.inc(23283);value %= 1000;
            case 3:if (!__CLB4_5_2_bool2) {__CLR4_5_2hpmhpmlvha7cow.R.inc(23284);__CLB4_5_2_bool2=true;}
                __CLR4_5_2hpmhpmlvha7cow.R.inc(23285);if ((((value >= 100)&&(__CLR4_5_2hpmhpmlvha7cow.R.iget(23286)!=0|true))||(__CLR4_5_2hpmhpmlvha7cow.R.iget(23287)==0&false))) {{
                    __CLR4_5_2hpmhpmlvha7cow.R.inc(23288);buffer.append((char) (value / 100 + '0'));
                    __CLR4_5_2hpmhpmlvha7cow.R.inc(23289);value %= 100;
                } }else {{
                    __CLR4_5_2hpmhpmlvha7cow.R.inc(23290);buffer.append('0');
                }
            }case 2:if (!__CLB4_5_2_bool2) {__CLR4_5_2hpmhpmlvha7cow.R.inc(23291);__CLB4_5_2_bool2=true;}
                __CLR4_5_2hpmhpmlvha7cow.R.inc(23292);if ((((value >= 10)&&(__CLR4_5_2hpmhpmlvha7cow.R.iget(23293)!=0|true))||(__CLR4_5_2hpmhpmlvha7cow.R.iget(23294)==0&false))) {{
                    __CLR4_5_2hpmhpmlvha7cow.R.inc(23295);buffer.append((char) (value / 10 + '0'));
                    __CLR4_5_2hpmhpmlvha7cow.R.inc(23296);value %= 10;
                } }else {{
                    __CLR4_5_2hpmhpmlvha7cow.R.inc(23297);buffer.append('0');
                }
            }case 1:if (!__CLB4_5_2_bool2) {__CLR4_5_2hpmhpmlvha7cow.R.inc(23298);__CLB4_5_2_bool2=true;}
                __CLR4_5_2hpmhpmlvha7cow.R.inc(23299);buffer.append((char) (value + '0'));
            }
        } }else {{
            // more memory allocation path works for any digits

            // build up decimal representation in reverse
            __CLR4_5_2hpmhpmlvha7cow.R.inc(23300);final char[] work = new char[MAX_DIGITS];
            __CLR4_5_2hpmhpmlvha7cow.R.inc(23301);int digit = 0;
            __CLR4_5_2hpmhpmlvha7cow.R.inc(23302);while ((((value != 0)&&(__CLR4_5_2hpmhpmlvha7cow.R.iget(23303)!=0|true))||(__CLR4_5_2hpmhpmlvha7cow.R.iget(23304)==0&false))) {{
                __CLR4_5_2hpmhpmlvha7cow.R.inc(23305);work[digit++] = (char) (value % 10 + '0');
                __CLR4_5_2hpmhpmlvha7cow.R.inc(23306);value = value / 10;
            }

            // pad with zeros
            }__CLR4_5_2hpmhpmlvha7cow.R.inc(23307);while ((((digit < minFieldWidth)&&(__CLR4_5_2hpmhpmlvha7cow.R.iget(23308)!=0|true))||(__CLR4_5_2hpmhpmlvha7cow.R.iget(23309)==0&false))) {{
                __CLR4_5_2hpmhpmlvha7cow.R.inc(23310);buffer.append('0');
                __CLR4_5_2hpmhpmlvha7cow.R.inc(23311);--minFieldWidth;
            }

            // reverse
            }__CLR4_5_2hpmhpmlvha7cow.R.inc(23312);while ((((--digit >= 0)&&(__CLR4_5_2hpmhpmlvha7cow.R.iget(23313)!=0|true))||(__CLR4_5_2hpmhpmlvha7cow.R.iget(23314)==0&false))) {{
                __CLR4_5_2hpmhpmlvha7cow.R.inc(23315);buffer.append(work[digit]);
            }
        }}
    }}finally{__CLR4_5_2hpmhpmlvha7cow.R.flushNeeded();}}

    // Rules
    //-----------------------------------------------------------------------
    /**
     * <p>Inner class defining a rule.</p>
     */
    private interface Rule {
        /**
         * Returns the estimated length of the result.
         *
         * @return the estimated length
         */
        int estimateLength();

        /**
         * Appends the value of the specified calendar to the output buffer based on the rule implementation.
         *
         * @param buf the output buffer
         * @param calendar calendar to be appended
         * @throws IOException if an I/O error occurs
         */
        void appendTo(Appendable buf, Calendar calendar) throws IOException;
    }

    /**
     * <p>Inner class defining a numeric rule.</p>
     */
    private interface NumberRule extends Rule {
        /**
         * Appends the specified value to the output buffer based on the rule implementation.
         *
         * @param buffer the output buffer
         * @param value the value to be appended
         * @throws IOException if an I/O error occurs
         */
        void appendTo(Appendable buffer, int value) throws IOException;
    }

    /**
     * <p>Inner class to output a constant single character.</p>
     */
    private static class CharacterLiteral implements Rule {
        private final char mValue;

        /**
         * Constructs a new instance of {@code CharacterLiteral}
         * to hold the specified value.
         *
         * @param value the character literal
         */
        CharacterLiteral(final char value) {try{__CLR4_5_2hpmhpmlvha7cow.R.inc(23316);
            __CLR4_5_2hpmhpmlvha7cow.R.inc(23317);mValue = value;
        }finally{__CLR4_5_2hpmhpmlvha7cow.R.flushNeeded();}}

        /**
         * {@inheritDoc}
         */
        @Override
        public int estimateLength() {try{__CLR4_5_2hpmhpmlvha7cow.R.inc(23318);
            __CLR4_5_2hpmhpmlvha7cow.R.inc(23319);return 1;
        }finally{__CLR4_5_2hpmhpmlvha7cow.R.flushNeeded();}}

        /**
         * {@inheritDoc}
         */
        @Override
        public void appendTo(final Appendable buffer, final Calendar calendar) throws IOException {try{__CLR4_5_2hpmhpmlvha7cow.R.inc(23320);
            __CLR4_5_2hpmhpmlvha7cow.R.inc(23321);buffer.append(mValue);
        }finally{__CLR4_5_2hpmhpmlvha7cow.R.flushNeeded();}}
    }

    /**
     * <p>Inner class to output a constant string.</p>
     */
    private static class StringLiteral implements Rule {
        private final String mValue;

        /**
         * Constructs a new instance of {@code StringLiteral}
         * to hold the specified value.
         *
         * @param value the string literal
         */
        StringLiteral(final String value) {try{__CLR4_5_2hpmhpmlvha7cow.R.inc(23322);
            __CLR4_5_2hpmhpmlvha7cow.R.inc(23323);mValue = value;
        }finally{__CLR4_5_2hpmhpmlvha7cow.R.flushNeeded();}}

        /**
         * {@inheritDoc}
         */
        @Override
        public int estimateLength() {try{__CLR4_5_2hpmhpmlvha7cow.R.inc(23324);
            __CLR4_5_2hpmhpmlvha7cow.R.inc(23325);return mValue.length();
        }finally{__CLR4_5_2hpmhpmlvha7cow.R.flushNeeded();}}

        /**
         * {@inheritDoc}
         */
        @Override
        public void appendTo(final Appendable buffer, final Calendar calendar) throws IOException {try{__CLR4_5_2hpmhpmlvha7cow.R.inc(23326);
            __CLR4_5_2hpmhpmlvha7cow.R.inc(23327);buffer.append(mValue);
        }finally{__CLR4_5_2hpmhpmlvha7cow.R.flushNeeded();}}
    }

    /**
     * <p>Inner class to output one of a set of values.</p>
     */
    private static class TextField implements Rule {
        private final int mField;
        private final String[] mValues;

        /**
         * Constructs an instance of {@code TextField}
         * with the specified field and values.
         *
         * @param field the field
         * @param values the field values
         */
        TextField(final int field, final String[] values) {try{__CLR4_5_2hpmhpmlvha7cow.R.inc(23328);
            __CLR4_5_2hpmhpmlvha7cow.R.inc(23329);mField = field;
            __CLR4_5_2hpmhpmlvha7cow.R.inc(23330);mValues = values;
        }finally{__CLR4_5_2hpmhpmlvha7cow.R.flushNeeded();}}

        /**
         * {@inheritDoc}
         */
        @Override
        public int estimateLength() {try{__CLR4_5_2hpmhpmlvha7cow.R.inc(23331);
            __CLR4_5_2hpmhpmlvha7cow.R.inc(23332);int max = 0;
            __CLR4_5_2hpmhpmlvha7cow.R.inc(23333);for (int i=mValues.length; (((--i >= 0)&&(__CLR4_5_2hpmhpmlvha7cow.R.iget(23334)!=0|true))||(__CLR4_5_2hpmhpmlvha7cow.R.iget(23335)==0&false)); ) {{
                __CLR4_5_2hpmhpmlvha7cow.R.inc(23336);final int len = mValues[i].length();
                __CLR4_5_2hpmhpmlvha7cow.R.inc(23337);if ((((len > max)&&(__CLR4_5_2hpmhpmlvha7cow.R.iget(23338)!=0|true))||(__CLR4_5_2hpmhpmlvha7cow.R.iget(23339)==0&false))) {{
                    __CLR4_5_2hpmhpmlvha7cow.R.inc(23340);max = len;
                }
            }}
            }__CLR4_5_2hpmhpmlvha7cow.R.inc(23341);return max;
        }finally{__CLR4_5_2hpmhpmlvha7cow.R.flushNeeded();}}

        /**
         * {@inheritDoc}
         */
        @Override
        public void appendTo(final Appendable buffer, final Calendar calendar) throws IOException {try{__CLR4_5_2hpmhpmlvha7cow.R.inc(23342);
            __CLR4_5_2hpmhpmlvha7cow.R.inc(23343);buffer.append(mValues[calendar.get(mField)]);
        }finally{__CLR4_5_2hpmhpmlvha7cow.R.flushNeeded();}}
    }

    /**
     * <p>Inner class to output an unpadded number.</p>
     */
    private static class UnpaddedNumberField implements NumberRule {
        private final int mField;

        /**
         * Constructs an instance of {@code UnpadedNumberField} with the specified field.
         *
         * @param field the field
         */
        UnpaddedNumberField(final int field) {try{__CLR4_5_2hpmhpmlvha7cow.R.inc(23344);
            __CLR4_5_2hpmhpmlvha7cow.R.inc(23345);mField = field;
        }finally{__CLR4_5_2hpmhpmlvha7cow.R.flushNeeded();}}

        /**
         * {@inheritDoc}
         */
        @Override
        public int estimateLength() {try{__CLR4_5_2hpmhpmlvha7cow.R.inc(23346);
            __CLR4_5_2hpmhpmlvha7cow.R.inc(23347);return 4;
        }finally{__CLR4_5_2hpmhpmlvha7cow.R.flushNeeded();}}

        /**
         * {@inheritDoc}
         */
        @Override
        public void appendTo(final Appendable buffer, final Calendar calendar) throws IOException {try{__CLR4_5_2hpmhpmlvha7cow.R.inc(23348);
            __CLR4_5_2hpmhpmlvha7cow.R.inc(23349);appendTo(buffer, calendar.get(mField));
        }finally{__CLR4_5_2hpmhpmlvha7cow.R.flushNeeded();}}

        /**
         * {@inheritDoc}
         */
        @Override
        public final void appendTo(final Appendable buffer, final int value) throws IOException {try{__CLR4_5_2hpmhpmlvha7cow.R.inc(23350);
            __CLR4_5_2hpmhpmlvha7cow.R.inc(23351);if ((((value < 10)&&(__CLR4_5_2hpmhpmlvha7cow.R.iget(23352)!=0|true))||(__CLR4_5_2hpmhpmlvha7cow.R.iget(23353)==0&false))) {{
                __CLR4_5_2hpmhpmlvha7cow.R.inc(23354);buffer.append((char)(value + '0'));
            } }else {__CLR4_5_2hpmhpmlvha7cow.R.inc(23355);if ((((value < 100)&&(__CLR4_5_2hpmhpmlvha7cow.R.iget(23356)!=0|true))||(__CLR4_5_2hpmhpmlvha7cow.R.iget(23357)==0&false))) {{
                __CLR4_5_2hpmhpmlvha7cow.R.inc(23358);appendDigits(buffer, value);
            } }else {{
               __CLR4_5_2hpmhpmlvha7cow.R.inc(23359);appendFullDigits(buffer, value, 1);
            }
        }}}finally{__CLR4_5_2hpmhpmlvha7cow.R.flushNeeded();}}
    }

    /**
     * <p>Inner class to output an unpadded month.</p>
     */
    private static class UnpaddedMonthField implements NumberRule {
        static final UnpaddedMonthField INSTANCE = new UnpaddedMonthField();

        /**
         * Constructs an instance of {@code UnpaddedMonthField}.
         *
         */
        UnpaddedMonthField() {
            super();__CLR4_5_2hpmhpmlvha7cow.R.inc(23361);try{__CLR4_5_2hpmhpmlvha7cow.R.inc(23360);
        }finally{__CLR4_5_2hpmhpmlvha7cow.R.flushNeeded();}}

        /**
         * {@inheritDoc}
         */
        @Override
        public int estimateLength() {try{__CLR4_5_2hpmhpmlvha7cow.R.inc(23362);
            __CLR4_5_2hpmhpmlvha7cow.R.inc(23363);return 2;
        }finally{__CLR4_5_2hpmhpmlvha7cow.R.flushNeeded();}}

        /**
         * {@inheritDoc}
         */
        @Override
        public void appendTo(final Appendable buffer, final Calendar calendar) throws IOException {try{__CLR4_5_2hpmhpmlvha7cow.R.inc(23364);
            __CLR4_5_2hpmhpmlvha7cow.R.inc(23365);appendTo(buffer, calendar.get(Calendar.MONTH) + 1);
        }finally{__CLR4_5_2hpmhpmlvha7cow.R.flushNeeded();}}

        /**
         * {@inheritDoc}
         */
        @Override
        public final void appendTo(final Appendable buffer, final int value) throws IOException {try{__CLR4_5_2hpmhpmlvha7cow.R.inc(23366);
            __CLR4_5_2hpmhpmlvha7cow.R.inc(23367);if ((((value < 10)&&(__CLR4_5_2hpmhpmlvha7cow.R.iget(23368)!=0|true))||(__CLR4_5_2hpmhpmlvha7cow.R.iget(23369)==0&false))) {{
                __CLR4_5_2hpmhpmlvha7cow.R.inc(23370);buffer.append((char)(value + '0'));
            } }else {{
                __CLR4_5_2hpmhpmlvha7cow.R.inc(23371);appendDigits(buffer, value);
            }
        }}finally{__CLR4_5_2hpmhpmlvha7cow.R.flushNeeded();}}
    }

    /**
     * <p>Inner class to output a padded number.</p>
     */
    private static class PaddedNumberField implements NumberRule {
        private final int mField;
        private final int mSize;

        /**
         * Constructs an instance of {@code PaddedNumberField}.
         *
         * @param field the field
         * @param size size of the output field
         */
        PaddedNumberField(final int field, final int size) {try{__CLR4_5_2hpmhpmlvha7cow.R.inc(23372);
            __CLR4_5_2hpmhpmlvha7cow.R.inc(23373);if ((((size < 3)&&(__CLR4_5_2hpmhpmlvha7cow.R.iget(23374)!=0|true))||(__CLR4_5_2hpmhpmlvha7cow.R.iget(23375)==0&false))) {{
                // Should use UnpaddedNumberField or TwoDigitNumberField.
                __CLR4_5_2hpmhpmlvha7cow.R.inc(23376);throw new IllegalArgumentException();
            }
            }__CLR4_5_2hpmhpmlvha7cow.R.inc(23377);mField = field;
            __CLR4_5_2hpmhpmlvha7cow.R.inc(23378);mSize = size;
        }finally{__CLR4_5_2hpmhpmlvha7cow.R.flushNeeded();}}

        /**
         * {@inheritDoc}
         */
        @Override
        public int estimateLength() {try{__CLR4_5_2hpmhpmlvha7cow.R.inc(23379);
            __CLR4_5_2hpmhpmlvha7cow.R.inc(23380);return mSize;
        }finally{__CLR4_5_2hpmhpmlvha7cow.R.flushNeeded();}}

        /**
         * {@inheritDoc}
         */
        @Override
        public void appendTo(final Appendable buffer, final Calendar calendar) throws IOException {try{__CLR4_5_2hpmhpmlvha7cow.R.inc(23381);
            __CLR4_5_2hpmhpmlvha7cow.R.inc(23382);appendTo(buffer, calendar.get(mField));
        }finally{__CLR4_5_2hpmhpmlvha7cow.R.flushNeeded();}}

        /**
         * {@inheritDoc}
         */
        @Override
        public final void appendTo(final Appendable buffer, final int value) throws IOException {try{__CLR4_5_2hpmhpmlvha7cow.R.inc(23383);
            __CLR4_5_2hpmhpmlvha7cow.R.inc(23384);appendFullDigits(buffer, value, mSize);
        }finally{__CLR4_5_2hpmhpmlvha7cow.R.flushNeeded();}}
    }

    /**
     * <p>Inner class to output a two digit number.</p>
     */
    private static class TwoDigitNumberField implements NumberRule {
        private final int mField;

        /**
         * Constructs an instance of {@code TwoDigitNumberField} with the specified field.
         *
         * @param field the field
         */
        TwoDigitNumberField(final int field) {try{__CLR4_5_2hpmhpmlvha7cow.R.inc(23385);
            __CLR4_5_2hpmhpmlvha7cow.R.inc(23386);mField = field;
        }finally{__CLR4_5_2hpmhpmlvha7cow.R.flushNeeded();}}

        /**
         * {@inheritDoc}
         */
        @Override
        public int estimateLength() {try{__CLR4_5_2hpmhpmlvha7cow.R.inc(23387);
            __CLR4_5_2hpmhpmlvha7cow.R.inc(23388);return 2;
        }finally{__CLR4_5_2hpmhpmlvha7cow.R.flushNeeded();}}

        /**
         * {@inheritDoc}
         */
        @Override
        public void appendTo(final Appendable buffer, final Calendar calendar) throws IOException {try{__CLR4_5_2hpmhpmlvha7cow.R.inc(23389);
            __CLR4_5_2hpmhpmlvha7cow.R.inc(23390);appendTo(buffer, calendar.get(mField));
        }finally{__CLR4_5_2hpmhpmlvha7cow.R.flushNeeded();}}

        /**
         * {@inheritDoc}
         */
        @Override
        public final void appendTo(final Appendable buffer, final int value) throws IOException {try{__CLR4_5_2hpmhpmlvha7cow.R.inc(23391);
            __CLR4_5_2hpmhpmlvha7cow.R.inc(23392);if ((((value < 100)&&(__CLR4_5_2hpmhpmlvha7cow.R.iget(23393)!=0|true))||(__CLR4_5_2hpmhpmlvha7cow.R.iget(23394)==0&false))) {{
                __CLR4_5_2hpmhpmlvha7cow.R.inc(23395);appendDigits(buffer, value);
            } }else {{
                __CLR4_5_2hpmhpmlvha7cow.R.inc(23396);appendFullDigits(buffer, value, 2);
            }
        }}finally{__CLR4_5_2hpmhpmlvha7cow.R.flushNeeded();}}
    }

    /**
     * <p>Inner class to output a two digit year.</p>
     */
    private static class TwoDigitYearField implements NumberRule {
        static final TwoDigitYearField INSTANCE = new TwoDigitYearField();

        /**
         * Constructs an instance of {@code TwoDigitYearField}.
         */
        TwoDigitYearField() {
            super();__CLR4_5_2hpmhpmlvha7cow.R.inc(23398);try{__CLR4_5_2hpmhpmlvha7cow.R.inc(23397);
        }finally{__CLR4_5_2hpmhpmlvha7cow.R.flushNeeded();}}

        /**
         * {@inheritDoc}
         */
        @Override
        public int estimateLength() {try{__CLR4_5_2hpmhpmlvha7cow.R.inc(23399);
            __CLR4_5_2hpmhpmlvha7cow.R.inc(23400);return 2;
        }finally{__CLR4_5_2hpmhpmlvha7cow.R.flushNeeded();}}

        /**
         * {@inheritDoc}
         */
        @Override
        public void appendTo(final Appendable buffer, final Calendar calendar) throws IOException {try{__CLR4_5_2hpmhpmlvha7cow.R.inc(23401);
            __CLR4_5_2hpmhpmlvha7cow.R.inc(23402);appendTo(buffer, calendar.get(Calendar.YEAR) % 100);
        }finally{__CLR4_5_2hpmhpmlvha7cow.R.flushNeeded();}}

        /**
         * {@inheritDoc}
         */
        @Override
        public final void appendTo(final Appendable buffer, final int value) throws IOException {try{__CLR4_5_2hpmhpmlvha7cow.R.inc(23403);
            __CLR4_5_2hpmhpmlvha7cow.R.inc(23404);appendDigits(buffer, value);
        }finally{__CLR4_5_2hpmhpmlvha7cow.R.flushNeeded();}}
    }

    /**
     * <p>Inner class to output a two digit month.</p>
     */
    private static class TwoDigitMonthField implements NumberRule {
        static final TwoDigitMonthField INSTANCE = new TwoDigitMonthField();

        /**
         * Constructs an instance of {@code TwoDigitMonthField}.
         */
        TwoDigitMonthField() {
            super();__CLR4_5_2hpmhpmlvha7cow.R.inc(23406);try{__CLR4_5_2hpmhpmlvha7cow.R.inc(23405);
        }finally{__CLR4_5_2hpmhpmlvha7cow.R.flushNeeded();}}

        /**
         * {@inheritDoc}
         */
        @Override
        public int estimateLength() {try{__CLR4_5_2hpmhpmlvha7cow.R.inc(23407);
            __CLR4_5_2hpmhpmlvha7cow.R.inc(23408);return 2;
        }finally{__CLR4_5_2hpmhpmlvha7cow.R.flushNeeded();}}

        /**
         * {@inheritDoc}
         */
        @Override
        public void appendTo(final Appendable buffer, final Calendar calendar) throws IOException {try{__CLR4_5_2hpmhpmlvha7cow.R.inc(23409);
            __CLR4_5_2hpmhpmlvha7cow.R.inc(23410);appendTo(buffer, calendar.get(Calendar.MONTH) + 1);
        }finally{__CLR4_5_2hpmhpmlvha7cow.R.flushNeeded();}}

        /**
         * {@inheritDoc}
         */
        @Override
        public final void appendTo(final Appendable buffer, final int value) throws IOException {try{__CLR4_5_2hpmhpmlvha7cow.R.inc(23411);
            __CLR4_5_2hpmhpmlvha7cow.R.inc(23412);appendDigits(buffer, value);
        }finally{__CLR4_5_2hpmhpmlvha7cow.R.flushNeeded();}}
    }

    /**
     * <p>Inner class to output the twelve hour field.</p>
     */
    private static class TwelveHourField implements NumberRule {
        private final NumberRule mRule;

        /**
         * Constructs an instance of {@code TwelveHourField} with the specified
         * {@code NumberRule}.
         *
         * @param rule the rule
         */
        TwelveHourField(final NumberRule rule) {try{__CLR4_5_2hpmhpmlvha7cow.R.inc(23413);
            __CLR4_5_2hpmhpmlvha7cow.R.inc(23414);mRule = rule;
        }finally{__CLR4_5_2hpmhpmlvha7cow.R.flushNeeded();}}

        /**
         * {@inheritDoc}
         */
        @Override
        public int estimateLength() {try{__CLR4_5_2hpmhpmlvha7cow.R.inc(23415);
            __CLR4_5_2hpmhpmlvha7cow.R.inc(23416);return mRule.estimateLength();
        }finally{__CLR4_5_2hpmhpmlvha7cow.R.flushNeeded();}}

        /**
         * {@inheritDoc}
         */
        @Override
        public void appendTo(final Appendable buffer, final Calendar calendar) throws IOException {try{__CLR4_5_2hpmhpmlvha7cow.R.inc(23417);
            __CLR4_5_2hpmhpmlvha7cow.R.inc(23418);int value = calendar.get(Calendar.HOUR);
            __CLR4_5_2hpmhpmlvha7cow.R.inc(23419);if ((((value == 0)&&(__CLR4_5_2hpmhpmlvha7cow.R.iget(23420)!=0|true))||(__CLR4_5_2hpmhpmlvha7cow.R.iget(23421)==0&false))) {{
                __CLR4_5_2hpmhpmlvha7cow.R.inc(23422);value = calendar.getLeastMaximum(Calendar.HOUR) + 1;
            }
            }__CLR4_5_2hpmhpmlvha7cow.R.inc(23423);mRule.appendTo(buffer, value);
        }finally{__CLR4_5_2hpmhpmlvha7cow.R.flushNeeded();}}

        /**
         * {@inheritDoc}
         */
        @Override
        public void appendTo(final Appendable buffer, final int value) throws IOException {try{__CLR4_5_2hpmhpmlvha7cow.R.inc(23424);
            __CLR4_5_2hpmhpmlvha7cow.R.inc(23425);mRule.appendTo(buffer, value);
        }finally{__CLR4_5_2hpmhpmlvha7cow.R.flushNeeded();}}
    }

    /**
     * <p>Inner class to output the twenty four hour field.</p>
     */
    private static class TwentyFourHourField implements NumberRule {
        private final NumberRule mRule;

        /**
         * Constructs an instance of {@code TwentyFourHourField} with the specified
         * {@code NumberRule}.
         *
         * @param rule the rule
         */
        TwentyFourHourField(final NumberRule rule) {try{__CLR4_5_2hpmhpmlvha7cow.R.inc(23426);
            __CLR4_5_2hpmhpmlvha7cow.R.inc(23427);mRule = rule;
        }finally{__CLR4_5_2hpmhpmlvha7cow.R.flushNeeded();}}

        /**
         * {@inheritDoc}
         */
        @Override
        public int estimateLength() {try{__CLR4_5_2hpmhpmlvha7cow.R.inc(23428);
            __CLR4_5_2hpmhpmlvha7cow.R.inc(23429);return mRule.estimateLength();
        }finally{__CLR4_5_2hpmhpmlvha7cow.R.flushNeeded();}}

        /**
         * {@inheritDoc}
         */
        @Override
        public void appendTo(final Appendable buffer, final Calendar calendar) throws IOException {try{__CLR4_5_2hpmhpmlvha7cow.R.inc(23430);
            __CLR4_5_2hpmhpmlvha7cow.R.inc(23431);int value = calendar.get(Calendar.HOUR_OF_DAY);
            __CLR4_5_2hpmhpmlvha7cow.R.inc(23432);if ((((value == 0)&&(__CLR4_5_2hpmhpmlvha7cow.R.iget(23433)!=0|true))||(__CLR4_5_2hpmhpmlvha7cow.R.iget(23434)==0&false))) {{
                __CLR4_5_2hpmhpmlvha7cow.R.inc(23435);value = calendar.getMaximum(Calendar.HOUR_OF_DAY) + 1;
            }
            }__CLR4_5_2hpmhpmlvha7cow.R.inc(23436);mRule.appendTo(buffer, value);
        }finally{__CLR4_5_2hpmhpmlvha7cow.R.flushNeeded();}}

        /**
         * {@inheritDoc}
         */
        @Override
        public void appendTo(final Appendable buffer, final int value) throws IOException {try{__CLR4_5_2hpmhpmlvha7cow.R.inc(23437);
            __CLR4_5_2hpmhpmlvha7cow.R.inc(23438);mRule.appendTo(buffer, value);
        }finally{__CLR4_5_2hpmhpmlvha7cow.R.flushNeeded();}}
    }

    /**
     * <p>Inner class to output the numeric day in week.</p>
     */
    private static class DayInWeekField implements NumberRule {
        private final NumberRule mRule;

        DayInWeekField(final NumberRule rule) {try{__CLR4_5_2hpmhpmlvha7cow.R.inc(23439);
            __CLR4_5_2hpmhpmlvha7cow.R.inc(23440);mRule = rule;
        }finally{__CLR4_5_2hpmhpmlvha7cow.R.flushNeeded();}}

        @Override
        public int estimateLength() {try{__CLR4_5_2hpmhpmlvha7cow.R.inc(23441);
            __CLR4_5_2hpmhpmlvha7cow.R.inc(23442);return mRule.estimateLength();
        }finally{__CLR4_5_2hpmhpmlvha7cow.R.flushNeeded();}}

        @Override
        public void appendTo(final Appendable buffer, final Calendar calendar) throws IOException {try{__CLR4_5_2hpmhpmlvha7cow.R.inc(23443);
            __CLR4_5_2hpmhpmlvha7cow.R.inc(23444);final int value = calendar.get(Calendar.DAY_OF_WEEK);
            __CLR4_5_2hpmhpmlvha7cow.R.inc(23445);mRule.appendTo(buffer, (((value != Calendar.SUNDAY )&&(__CLR4_5_2hpmhpmlvha7cow.R.iget(23446)!=0|true))||(__CLR4_5_2hpmhpmlvha7cow.R.iget(23447)==0&false))? value - 1 : 7);
        }finally{__CLR4_5_2hpmhpmlvha7cow.R.flushNeeded();}}

        @Override
        public void appendTo(final Appendable buffer, final int value) throws IOException {try{__CLR4_5_2hpmhpmlvha7cow.R.inc(23448);
            __CLR4_5_2hpmhpmlvha7cow.R.inc(23449);mRule.appendTo(buffer, value);
        }finally{__CLR4_5_2hpmhpmlvha7cow.R.flushNeeded();}}
    }

    /**
     * <p>Inner class to output the numeric day in week.</p>
     */
    private static class WeekYear implements NumberRule {
        private final NumberRule mRule;

        WeekYear(final NumberRule rule) {try{__CLR4_5_2hpmhpmlvha7cow.R.inc(23450);
            __CLR4_5_2hpmhpmlvha7cow.R.inc(23451);mRule = rule;
        }finally{__CLR4_5_2hpmhpmlvha7cow.R.flushNeeded();}}

        @Override
        public int estimateLength() {try{__CLR4_5_2hpmhpmlvha7cow.R.inc(23452);
            __CLR4_5_2hpmhpmlvha7cow.R.inc(23453);return mRule.estimateLength();
        }finally{__CLR4_5_2hpmhpmlvha7cow.R.flushNeeded();}}

        @Override
        public void appendTo(final Appendable buffer, final Calendar calendar) throws IOException {try{__CLR4_5_2hpmhpmlvha7cow.R.inc(23454);
            __CLR4_5_2hpmhpmlvha7cow.R.inc(23455);mRule.appendTo(buffer, calendar.getWeekYear());
        }finally{__CLR4_5_2hpmhpmlvha7cow.R.flushNeeded();}}

        @Override
        public void appendTo(final Appendable buffer, final int value) throws IOException {try{__CLR4_5_2hpmhpmlvha7cow.R.inc(23456);
            __CLR4_5_2hpmhpmlvha7cow.R.inc(23457);mRule.appendTo(buffer, value);
        }finally{__CLR4_5_2hpmhpmlvha7cow.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------

    private static final ConcurrentMap<TimeZoneDisplayKey, String> cTimeZoneDisplayCache =
        new ConcurrentHashMap<>(7);
    /**
     * <p>Gets the time zone display name, using a cache for performance.</p>
     *
     * @param tz  the zone to query
     * @param daylight  true if daylight savings
     * @param style  the style to use {@code TimeZone.LONG} or {@code TimeZone.SHORT}
     * @param locale  the locale to use
     * @return the textual name of the time zone
     */
    static String getTimeZoneDisplay(final TimeZone tz, final boolean daylight, final int style, final Locale locale) {try{__CLR4_5_2hpmhpmlvha7cow.R.inc(23458);
        __CLR4_5_2hpmhpmlvha7cow.R.inc(23459);final TimeZoneDisplayKey key = new TimeZoneDisplayKey(tz, daylight, style, locale);
        __CLR4_5_2hpmhpmlvha7cow.R.inc(23460);String value = cTimeZoneDisplayCache.get(key);
        __CLR4_5_2hpmhpmlvha7cow.R.inc(23461);if ((((value == null)&&(__CLR4_5_2hpmhpmlvha7cow.R.iget(23462)!=0|true))||(__CLR4_5_2hpmhpmlvha7cow.R.iget(23463)==0&false))) {{
            // This is a very slow call, so cache the results.
            __CLR4_5_2hpmhpmlvha7cow.R.inc(23464);value = tz.getDisplayName(daylight, style, locale);
            __CLR4_5_2hpmhpmlvha7cow.R.inc(23465);final String prior = cTimeZoneDisplayCache.putIfAbsent(key, value);
            __CLR4_5_2hpmhpmlvha7cow.R.inc(23466);if ((((prior != null)&&(__CLR4_5_2hpmhpmlvha7cow.R.iget(23467)!=0|true))||(__CLR4_5_2hpmhpmlvha7cow.R.iget(23468)==0&false))) {{
                __CLR4_5_2hpmhpmlvha7cow.R.inc(23469);value= prior;
            }
        }}
        }__CLR4_5_2hpmhpmlvha7cow.R.inc(23470);return value;
    }finally{__CLR4_5_2hpmhpmlvha7cow.R.flushNeeded();}}

    /**
     * <p>Inner class to output a time zone name.</p>
     */
    private static class TimeZoneNameRule implements Rule {
        private final Locale mLocale;
        private final int mStyle;
        private final String mStandard;
        private final String mDaylight;

        /**
         * Constructs an instance of {@code TimeZoneNameRule} with the specified properties.
         *
         * @param timeZone the time zone
         * @param locale the locale
         * @param style the style
         */
        TimeZoneNameRule(final TimeZone timeZone, final Locale locale, final int style) {try{__CLR4_5_2hpmhpmlvha7cow.R.inc(23471);
            __CLR4_5_2hpmhpmlvha7cow.R.inc(23472);mLocale = locale;
            __CLR4_5_2hpmhpmlvha7cow.R.inc(23473);mStyle = style;
            
            __CLR4_5_2hpmhpmlvha7cow.R.inc(23474);mStandard = getTimeZoneDisplay(timeZone, false, style, locale);
            __CLR4_5_2hpmhpmlvha7cow.R.inc(23475);mDaylight = getTimeZoneDisplay(timeZone, true, style, locale);
        }finally{__CLR4_5_2hpmhpmlvha7cow.R.flushNeeded();}}

        /**
         * {@inheritDoc}
         */
        @Override
        public int estimateLength() {try{__CLR4_5_2hpmhpmlvha7cow.R.inc(23476);
            // We have no access to the Calendar object that will be passed to
            // appendTo so base estimate on the TimeZone passed to the
            // constructor
            __CLR4_5_2hpmhpmlvha7cow.R.inc(23477);return Math.max(mStandard.length(), mDaylight.length());
        }finally{__CLR4_5_2hpmhpmlvha7cow.R.flushNeeded();}}

        /**
         * {@inheritDoc}
         */
        @Override
        public void appendTo(final Appendable buffer, final Calendar calendar) throws IOException {try{__CLR4_5_2hpmhpmlvha7cow.R.inc(23478);
            __CLR4_5_2hpmhpmlvha7cow.R.inc(23479);final TimeZone zone = calendar.getTimeZone();
            __CLR4_5_2hpmhpmlvha7cow.R.inc(23480);if ((((calendar.get(Calendar.DST_OFFSET) != 0)&&(__CLR4_5_2hpmhpmlvha7cow.R.iget(23481)!=0|true))||(__CLR4_5_2hpmhpmlvha7cow.R.iget(23482)==0&false))) {{
                __CLR4_5_2hpmhpmlvha7cow.R.inc(23483);buffer.append(getTimeZoneDisplay(zone, true, mStyle, mLocale));
            } }else {{
                __CLR4_5_2hpmhpmlvha7cow.R.inc(23484);buffer.append(getTimeZoneDisplay(zone, false, mStyle, mLocale));
            }
        }}finally{__CLR4_5_2hpmhpmlvha7cow.R.flushNeeded();}}
    }

    /**
     * <p>Inner class to output a time zone as a number {@code +/-HHMM}
     * or {@code +/-HH:MM}.</p>
     */
    private static class TimeZoneNumberRule implements Rule {
        static final TimeZoneNumberRule INSTANCE_COLON = new TimeZoneNumberRule(true);
        static final TimeZoneNumberRule INSTANCE_NO_COLON = new TimeZoneNumberRule(false);
        
        final boolean mColon;

        /**
         * Constructs an instance of {@code TimeZoneNumberRule} with the specified properties.
         *
         * @param colon add colon between HH and MM in the output if {@code true}
         */
        TimeZoneNumberRule(final boolean colon) {try{__CLR4_5_2hpmhpmlvha7cow.R.inc(23485);
            __CLR4_5_2hpmhpmlvha7cow.R.inc(23486);mColon = colon;
        }finally{__CLR4_5_2hpmhpmlvha7cow.R.flushNeeded();}}

        /**
         * {@inheritDoc}
         */
        @Override
        public int estimateLength() {try{__CLR4_5_2hpmhpmlvha7cow.R.inc(23487);
            __CLR4_5_2hpmhpmlvha7cow.R.inc(23488);return 5;
        }finally{__CLR4_5_2hpmhpmlvha7cow.R.flushNeeded();}}

        /**
         * {@inheritDoc}
         */
        @Override
        public void appendTo(final Appendable buffer, final Calendar calendar) throws IOException {try{__CLR4_5_2hpmhpmlvha7cow.R.inc(23489);
            
            __CLR4_5_2hpmhpmlvha7cow.R.inc(23490);int offset = calendar.get(Calendar.ZONE_OFFSET) + calendar.get(Calendar.DST_OFFSET);

            __CLR4_5_2hpmhpmlvha7cow.R.inc(23491);if ((((offset < 0)&&(__CLR4_5_2hpmhpmlvha7cow.R.iget(23492)!=0|true))||(__CLR4_5_2hpmhpmlvha7cow.R.iget(23493)==0&false))) {{
                __CLR4_5_2hpmhpmlvha7cow.R.inc(23494);buffer.append('-');
                __CLR4_5_2hpmhpmlvha7cow.R.inc(23495);offset = -offset;
            } }else {{
                __CLR4_5_2hpmhpmlvha7cow.R.inc(23496);buffer.append('+');
            }

            }__CLR4_5_2hpmhpmlvha7cow.R.inc(23497);final int hours = offset / (60 * 60 * 1000);
            __CLR4_5_2hpmhpmlvha7cow.R.inc(23498);appendDigits(buffer, hours);

            __CLR4_5_2hpmhpmlvha7cow.R.inc(23499);if ((((mColon)&&(__CLR4_5_2hpmhpmlvha7cow.R.iget(23500)!=0|true))||(__CLR4_5_2hpmhpmlvha7cow.R.iget(23501)==0&false))) {{
                __CLR4_5_2hpmhpmlvha7cow.R.inc(23502);buffer.append(':');
            }

            }__CLR4_5_2hpmhpmlvha7cow.R.inc(23503);final int minutes = offset / (60 * 1000) - 60 * hours;
            __CLR4_5_2hpmhpmlvha7cow.R.inc(23504);appendDigits(buffer, minutes);
        }finally{__CLR4_5_2hpmhpmlvha7cow.R.flushNeeded();}}
    }

    /**
     * <p>Inner class to output a time zone as a number {@code +/-HHMM}
     * or {@code +/-HH:MM}.</p>
     */
    private static class Iso8601_Rule implements Rule {
        
        // Sign TwoDigitHours or Z
        static final Iso8601_Rule ISO8601_HOURS = new Iso8601_Rule(3);       
        // Sign TwoDigitHours Minutes or Z
        static final Iso8601_Rule ISO8601_HOURS_MINUTES = new Iso8601_Rule(5);
        // Sign TwoDigitHours : Minutes or Z
        static final Iso8601_Rule ISO8601_HOURS_COLON_MINUTES = new Iso8601_Rule(6);

        /**
         * Factory method for Iso8601_Rules.
         *
         * @param tokenLen a token indicating the length of the TimeZone String to be formatted.
         * @return a Iso8601_Rule that can format TimeZone String of length {@code tokenLen}. If no such
         *          rule exists, an IllegalArgumentException will be thrown.
         */
        static Iso8601_Rule getRule(final int tokenLen) {try{__CLR4_5_2hpmhpmlvha7cow.R.inc(23505);
            boolean __CLB4_5_2_bool3=false;__CLR4_5_2hpmhpmlvha7cow.R.inc(23506);switch(tokenLen) {
            case 1:if (!__CLB4_5_2_bool3) {__CLR4_5_2hpmhpmlvha7cow.R.inc(23507);__CLB4_5_2_bool3=true;}
                __CLR4_5_2hpmhpmlvha7cow.R.inc(23508);return Iso8601_Rule.ISO8601_HOURS;
            case 2:if (!__CLB4_5_2_bool3) {__CLR4_5_2hpmhpmlvha7cow.R.inc(23509);__CLB4_5_2_bool3=true;}
                __CLR4_5_2hpmhpmlvha7cow.R.inc(23510);return Iso8601_Rule.ISO8601_HOURS_MINUTES;
            case 3:if (!__CLB4_5_2_bool3) {__CLR4_5_2hpmhpmlvha7cow.R.inc(23511);__CLB4_5_2_bool3=true;}
                __CLR4_5_2hpmhpmlvha7cow.R.inc(23512);return Iso8601_Rule.ISO8601_HOURS_COLON_MINUTES;
            default:if (!__CLB4_5_2_bool3) {__CLR4_5_2hpmhpmlvha7cow.R.inc(23513);__CLB4_5_2_bool3=true;}
                __CLR4_5_2hpmhpmlvha7cow.R.inc(23514);throw new IllegalArgumentException("invalid number of X");                    
            }
        }finally{__CLR4_5_2hpmhpmlvha7cow.R.flushNeeded();}}        
        
        final int length;

        /**
         * Constructs an instance of {@code Iso8601_Rule} with the specified properties.
         *
         * @param length The number of characters in output (unless Z is output)
         */
        Iso8601_Rule(final int length) {try{__CLR4_5_2hpmhpmlvha7cow.R.inc(23515);
            __CLR4_5_2hpmhpmlvha7cow.R.inc(23516);this.length = length;
        }finally{__CLR4_5_2hpmhpmlvha7cow.R.flushNeeded();}}

        /**
         * {@inheritDoc}
         */
        @Override
        public int estimateLength() {try{__CLR4_5_2hpmhpmlvha7cow.R.inc(23517);
            __CLR4_5_2hpmhpmlvha7cow.R.inc(23518);return length;
        }finally{__CLR4_5_2hpmhpmlvha7cow.R.flushNeeded();}}

        /**
         * {@inheritDoc}
         */
        @Override
        public void appendTo(final Appendable buffer, final Calendar calendar) throws IOException {try{__CLR4_5_2hpmhpmlvha7cow.R.inc(23519);
            __CLR4_5_2hpmhpmlvha7cow.R.inc(23520);int offset = calendar.get(Calendar.ZONE_OFFSET) + calendar.get(Calendar.DST_OFFSET);
            __CLR4_5_2hpmhpmlvha7cow.R.inc(23521);if ((((offset == 0)&&(__CLR4_5_2hpmhpmlvha7cow.R.iget(23522)!=0|true))||(__CLR4_5_2hpmhpmlvha7cow.R.iget(23523)==0&false))) {{
                __CLR4_5_2hpmhpmlvha7cow.R.inc(23524);buffer.append("Z");
                __CLR4_5_2hpmhpmlvha7cow.R.inc(23525);return;
            }
            
            }__CLR4_5_2hpmhpmlvha7cow.R.inc(23526);if ((((offset < 0)&&(__CLR4_5_2hpmhpmlvha7cow.R.iget(23527)!=0|true))||(__CLR4_5_2hpmhpmlvha7cow.R.iget(23528)==0&false))) {{
                __CLR4_5_2hpmhpmlvha7cow.R.inc(23529);buffer.append('-');
                __CLR4_5_2hpmhpmlvha7cow.R.inc(23530);offset = -offset;
            } }else {{
                __CLR4_5_2hpmhpmlvha7cow.R.inc(23531);buffer.append('+');
            }

            }__CLR4_5_2hpmhpmlvha7cow.R.inc(23532);final int hours = offset / (60 * 60 * 1000);
            __CLR4_5_2hpmhpmlvha7cow.R.inc(23533);appendDigits(buffer, hours);

            __CLR4_5_2hpmhpmlvha7cow.R.inc(23534);if ((((length<5)&&(__CLR4_5_2hpmhpmlvha7cow.R.iget(23535)!=0|true))||(__CLR4_5_2hpmhpmlvha7cow.R.iget(23536)==0&false))) {{
                __CLR4_5_2hpmhpmlvha7cow.R.inc(23537);return;
            }
            
            }__CLR4_5_2hpmhpmlvha7cow.R.inc(23538);if ((((length==6)&&(__CLR4_5_2hpmhpmlvha7cow.R.iget(23539)!=0|true))||(__CLR4_5_2hpmhpmlvha7cow.R.iget(23540)==0&false))) {{
                __CLR4_5_2hpmhpmlvha7cow.R.inc(23541);buffer.append(':');
            }

            }__CLR4_5_2hpmhpmlvha7cow.R.inc(23542);final int minutes = offset / (60 * 1000) - 60 * hours;
            __CLR4_5_2hpmhpmlvha7cow.R.inc(23543);appendDigits(buffer, minutes);
        }finally{__CLR4_5_2hpmhpmlvha7cow.R.flushNeeded();}}
    }

    // ----------------------------------------------------------------------
    /**
     * <p>Inner class that acts as a compound key for time zone names.</p>
     */
    private static class TimeZoneDisplayKey {
        private final TimeZone mTimeZone;
        private final int mStyle;
        private final Locale mLocale;

        /**
         * Constructs an instance of {@code TimeZoneDisplayKey} with the specified properties.
         *
         * @param timeZone the time zone
         * @param daylight adjust the style for daylight saving time if {@code true}
         * @param style the timezone style
         * @param locale the timezone locale
         */
        TimeZoneDisplayKey(final TimeZone timeZone,
                           final boolean daylight, final int style, final Locale locale) {try{__CLR4_5_2hpmhpmlvha7cow.R.inc(23544);
            __CLR4_5_2hpmhpmlvha7cow.R.inc(23545);mTimeZone = timeZone;
            __CLR4_5_2hpmhpmlvha7cow.R.inc(23546);if ((((daylight)&&(__CLR4_5_2hpmhpmlvha7cow.R.iget(23547)!=0|true))||(__CLR4_5_2hpmhpmlvha7cow.R.iget(23548)==0&false))) {{
                __CLR4_5_2hpmhpmlvha7cow.R.inc(23549);mStyle = style | 0x80000000;
            } }else {{
                __CLR4_5_2hpmhpmlvha7cow.R.inc(23550);mStyle = style;
            }
            }__CLR4_5_2hpmhpmlvha7cow.R.inc(23551);mLocale = locale;
        }finally{__CLR4_5_2hpmhpmlvha7cow.R.flushNeeded();}}

        /**
         * {@inheritDoc}
         */
        @Override
        public int hashCode() {try{__CLR4_5_2hpmhpmlvha7cow.R.inc(23552);
            __CLR4_5_2hpmhpmlvha7cow.R.inc(23553);return (mStyle * 31 + mLocale.hashCode() ) * 31 + mTimeZone.hashCode();
        }finally{__CLR4_5_2hpmhpmlvha7cow.R.flushNeeded();}}

        /**
         * {@inheritDoc}
         */
        @Override
        public boolean equals(final Object obj) {try{__CLR4_5_2hpmhpmlvha7cow.R.inc(23554);
            __CLR4_5_2hpmhpmlvha7cow.R.inc(23555);if ((((this == obj)&&(__CLR4_5_2hpmhpmlvha7cow.R.iget(23556)!=0|true))||(__CLR4_5_2hpmhpmlvha7cow.R.iget(23557)==0&false))) {{
                __CLR4_5_2hpmhpmlvha7cow.R.inc(23558);return true;
            }
            }__CLR4_5_2hpmhpmlvha7cow.R.inc(23559);if ((((obj instanceof TimeZoneDisplayKey)&&(__CLR4_5_2hpmhpmlvha7cow.R.iget(23560)!=0|true))||(__CLR4_5_2hpmhpmlvha7cow.R.iget(23561)==0&false))) {{
                __CLR4_5_2hpmhpmlvha7cow.R.inc(23562);final TimeZoneDisplayKey other = (TimeZoneDisplayKey)obj;
                __CLR4_5_2hpmhpmlvha7cow.R.inc(23563);return
                    mTimeZone.equals(other.mTimeZone) &&
                    mStyle == other.mStyle &&
                    mLocale.equals(other.mLocale);
            }
            }__CLR4_5_2hpmhpmlvha7cow.R.inc(23564);return false;
        }finally{__CLR4_5_2hpmhpmlvha7cow.R.flushNeeded();}}
    }
}
