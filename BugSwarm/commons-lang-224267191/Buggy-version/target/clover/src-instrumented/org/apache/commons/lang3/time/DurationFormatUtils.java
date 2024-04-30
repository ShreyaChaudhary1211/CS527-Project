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

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.Validate;

/**
 * <p>Duration formatting utilities and constants. The following table describes the tokens 
 * used in the pattern language for formatting. </p>
 * <table border="1" summary="Pattern Tokens">
 *  <tr><th>character</th><th>duration element</th></tr>
 *  <tr><td>y</td><td>years</td></tr>
 *  <tr><td>M</td><td>months</td></tr>
 *  <tr><td>d</td><td>days</td></tr>
 *  <tr><td>H</td><td>hours</td></tr>
 *  <tr><td>m</td><td>minutes</td></tr>
 *  <tr><td>s</td><td>seconds</td></tr>
 *  <tr><td>S</td><td>milliseconds</td></tr>
 *  <tr><td>'text'</td><td>arbitrary text content</td></tr>
 * </table>
 *
 * <b>Note: It's not currently possible to include a single-quote in a format.</b>
 * <br>
 * Token values are printed using decimal digits.
 * A token character can be repeated to ensure that the field occupies a certain minimum
 * size. Values will be left-padded with 0 unless padding is disabled in the method invocation.
 * @since 2.1
 */
@java.lang.SuppressWarnings({"fallthrough"}) public class DurationFormatUtils {public static class __CLR4_5_2h03h03lvha7cg9{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172755542L,8589935092L,22408,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * <p>DurationFormatUtils instances should NOT be constructed in standard programming.</p>
     *
     * <p>This constructor is public to permit tools that require a JavaBean instance
     * to operate.</p>
     */
    public DurationFormatUtils() {
        super();__CLR4_5_2h03h03lvha7cg9.R.inc(22036);try{__CLR4_5_2h03h03lvha7cg9.R.inc(22035);
    }finally{__CLR4_5_2h03h03lvha7cg9.R.flushNeeded();}}

    /**
     * <p>Pattern used with <code>FastDateFormat</code> and <code>SimpleDateFormat</code>
     * for the ISO 8601 period format used in durations.</p>
     * 
     * @see org.apache.commons.lang3.time.FastDateFormat
     * @see java.text.SimpleDateFormat
     */
    public static final String ISO_EXTENDED_FORMAT_PATTERN = "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.SSS'S'";

    //-----------------------------------------------------------------------
    /**
     * <p>Formats the time gap as a string.</p>
     * 
     * <p>The format used is ISO 8601-like: {@code HH:mm:ss.SSS}.</p>
     *
     * @param durationMillis  the duration to format
     * @return the formatted duration, not null
     * @throws java.lang.IllegalArgumentException if durationMillis is negative
     */
    public static String formatDurationHMS(final long durationMillis) {try{__CLR4_5_2h03h03lvha7cg9.R.inc(22037);
        __CLR4_5_2h03h03lvha7cg9.R.inc(22038);return formatDuration(durationMillis, "HH:mm:ss.SSS");
    }finally{__CLR4_5_2h03h03lvha7cg9.R.flushNeeded();}}

    /**
     * <p>Formats the time gap as a string.</p>
     * 
     * <p>The format used is the ISO 8601 period format.</p>
     * 
     * <p>This method formats durations using the days and lower fields of the
     * ISO format pattern, such as P7D6TH5M4.321S.</p>
     * 
     * @param durationMillis  the duration to format
     * @return the formatted duration, not null
     * @throws java.lang.IllegalArgumentException if durationMillis is negative
     */
    public static String formatDurationISO(final long durationMillis) {try{__CLR4_5_2h03h03lvha7cg9.R.inc(22039);
        __CLR4_5_2h03h03lvha7cg9.R.inc(22040);return formatDuration(durationMillis, ISO_EXTENDED_FORMAT_PATTERN, false);
    }finally{__CLR4_5_2h03h03lvha7cg9.R.flushNeeded();}}

    /**
     * <p>Formats the time gap as a string, using the specified format, and padding with zeros.</p>
     * 
     * <p>This method formats durations using the days and lower fields of the
     * format pattern. Months and larger are not used.</p>
     * 
     * @param durationMillis  the duration to format
     * @param format  the way in which to format the duration, not null
     * @return the formatted duration, not null
     * @throws java.lang.IllegalArgumentException if durationMillis is negative
     */
    public static String formatDuration(final long durationMillis, final String format) {try{__CLR4_5_2h03h03lvha7cg9.R.inc(22041);
        __CLR4_5_2h03h03lvha7cg9.R.inc(22042);return formatDuration(durationMillis, format, true);
    }finally{__CLR4_5_2h03h03lvha7cg9.R.flushNeeded();}}

    /**
     * <p>Formats the time gap as a string, using the specified format.
     * Padding the left hand side of numbers with zeroes is optional.</p>
     * 
     * <p>This method formats durations using the days and lower fields of the
     * format pattern. Months and larger are not used.</p>
     * 
     * @param durationMillis  the duration to format
     * @param format  the way in which to format the duration, not null
     * @param padWithZeros  whether to pad the left hand side of numbers with 0's
     * @return the formatted duration, not null
     * @throws java.lang.IllegalArgumentException if durationMillis is negative
     */
    public static String formatDuration(final long durationMillis, final String format, final boolean padWithZeros) {try{__CLR4_5_2h03h03lvha7cg9.R.inc(22043);
        __CLR4_5_2h03h03lvha7cg9.R.inc(22044);Validate.inclusiveBetween(0, Long.MAX_VALUE, durationMillis, "durationMillis must not be negative");        

        __CLR4_5_2h03h03lvha7cg9.R.inc(22045);final Token[] tokens = lexx(format);

        __CLR4_5_2h03h03lvha7cg9.R.inc(22046);long days         = 0;
        __CLR4_5_2h03h03lvha7cg9.R.inc(22047);long hours        = 0;
        __CLR4_5_2h03h03lvha7cg9.R.inc(22048);long minutes      = 0;
        __CLR4_5_2h03h03lvha7cg9.R.inc(22049);long seconds      = 0;
        __CLR4_5_2h03h03lvha7cg9.R.inc(22050);long milliseconds = durationMillis;
        
        __CLR4_5_2h03h03lvha7cg9.R.inc(22051);if ((((Token.containsTokenWithValue(tokens, d) )&&(__CLR4_5_2h03h03lvha7cg9.R.iget(22052)!=0|true))||(__CLR4_5_2h03h03lvha7cg9.R.iget(22053)==0&false))) {{
            __CLR4_5_2h03h03lvha7cg9.R.inc(22054);days = milliseconds / DateUtils.MILLIS_PER_DAY;
            __CLR4_5_2h03h03lvha7cg9.R.inc(22055);milliseconds = milliseconds - (days * DateUtils.MILLIS_PER_DAY);
        }
        }__CLR4_5_2h03h03lvha7cg9.R.inc(22056);if ((((Token.containsTokenWithValue(tokens, H) )&&(__CLR4_5_2h03h03lvha7cg9.R.iget(22057)!=0|true))||(__CLR4_5_2h03h03lvha7cg9.R.iget(22058)==0&false))) {{
            __CLR4_5_2h03h03lvha7cg9.R.inc(22059);hours = milliseconds / DateUtils.MILLIS_PER_HOUR;
            __CLR4_5_2h03h03lvha7cg9.R.inc(22060);milliseconds = milliseconds - (hours * DateUtils.MILLIS_PER_HOUR);
        }
        }__CLR4_5_2h03h03lvha7cg9.R.inc(22061);if ((((Token.containsTokenWithValue(tokens, m) )&&(__CLR4_5_2h03h03lvha7cg9.R.iget(22062)!=0|true))||(__CLR4_5_2h03h03lvha7cg9.R.iget(22063)==0&false))) {{
            __CLR4_5_2h03h03lvha7cg9.R.inc(22064);minutes = milliseconds / DateUtils.MILLIS_PER_MINUTE;
            __CLR4_5_2h03h03lvha7cg9.R.inc(22065);milliseconds = milliseconds - (minutes * DateUtils.MILLIS_PER_MINUTE);
        }
        }__CLR4_5_2h03h03lvha7cg9.R.inc(22066);if ((((Token.containsTokenWithValue(tokens, s) )&&(__CLR4_5_2h03h03lvha7cg9.R.iget(22067)!=0|true))||(__CLR4_5_2h03h03lvha7cg9.R.iget(22068)==0&false))) {{
            __CLR4_5_2h03h03lvha7cg9.R.inc(22069);seconds = milliseconds / DateUtils.MILLIS_PER_SECOND;
            __CLR4_5_2h03h03lvha7cg9.R.inc(22070);milliseconds = milliseconds - (seconds * DateUtils.MILLIS_PER_SECOND);
        }

        }__CLR4_5_2h03h03lvha7cg9.R.inc(22071);return format(tokens, 0, 0, days, hours, minutes, seconds, milliseconds, padWithZeros);
    }finally{__CLR4_5_2h03h03lvha7cg9.R.flushNeeded();}}

    /**
     * <p>Formats an elapsed time into a pluralization correct string.</p>
     * 
     * <p>This method formats durations using the days and lower fields of the
     * format pattern. Months and larger are not used.</p>
     * 
     * @param durationMillis  the elapsed time to report in milliseconds
     * @param suppressLeadingZeroElements  suppresses leading 0 elements
     * @param suppressTrailingZeroElements  suppresses trailing 0 elements
     * @return the formatted text in days/hours/minutes/seconds, not null
     * @throws java.lang.IllegalArgumentException if durationMillis is negative
     */
    public static String formatDurationWords(
        final long durationMillis,
        final boolean suppressLeadingZeroElements,
        final boolean suppressTrailingZeroElements) {try{__CLR4_5_2h03h03lvha7cg9.R.inc(22072);

        // This method is generally replaceable by the format method, but
        // there are a series of tweaks and special cases that require 
        // trickery to replicate.
        __CLR4_5_2h03h03lvha7cg9.R.inc(22073);String duration = formatDuration(durationMillis, "d' days 'H' hours 'm' minutes 's' seconds'");
        __CLR4_5_2h03h03lvha7cg9.R.inc(22074);if ((((suppressLeadingZeroElements)&&(__CLR4_5_2h03h03lvha7cg9.R.iget(22075)!=0|true))||(__CLR4_5_2h03h03lvha7cg9.R.iget(22076)==0&false))) {{
            // this is a temporary marker on the front. Like ^ in regexp.
            __CLR4_5_2h03h03lvha7cg9.R.inc(22077);duration = " " + duration;
            __CLR4_5_2h03h03lvha7cg9.R.inc(22078);String tmp = StringUtils.replaceOnce(duration, " 0 days", StringUtils.EMPTY);
            __CLR4_5_2h03h03lvha7cg9.R.inc(22079);if ((((tmp.length() != duration.length())&&(__CLR4_5_2h03h03lvha7cg9.R.iget(22080)!=0|true))||(__CLR4_5_2h03h03lvha7cg9.R.iget(22081)==0&false))) {{
                __CLR4_5_2h03h03lvha7cg9.R.inc(22082);duration = tmp;
                __CLR4_5_2h03h03lvha7cg9.R.inc(22083);tmp = StringUtils.replaceOnce(duration, " 0 hours", StringUtils.EMPTY);
                __CLR4_5_2h03h03lvha7cg9.R.inc(22084);if ((((tmp.length() != duration.length())&&(__CLR4_5_2h03h03lvha7cg9.R.iget(22085)!=0|true))||(__CLR4_5_2h03h03lvha7cg9.R.iget(22086)==0&false))) {{
                    __CLR4_5_2h03h03lvha7cg9.R.inc(22087);duration = tmp;
                    __CLR4_5_2h03h03lvha7cg9.R.inc(22088);tmp = StringUtils.replaceOnce(duration, " 0 minutes", StringUtils.EMPTY);
                    __CLR4_5_2h03h03lvha7cg9.R.inc(22089);duration = tmp;
                    __CLR4_5_2h03h03lvha7cg9.R.inc(22090);if ((((tmp.length() != duration.length())&&(__CLR4_5_2h03h03lvha7cg9.R.iget(22091)!=0|true))||(__CLR4_5_2h03h03lvha7cg9.R.iget(22092)==0&false))) {{
                        __CLR4_5_2h03h03lvha7cg9.R.inc(22093);duration = StringUtils.replaceOnce(tmp, " 0 seconds", StringUtils.EMPTY);
                    }
                }}
            }}
            }__CLR4_5_2h03h03lvha7cg9.R.inc(22094);if ((((duration.length() != 0)&&(__CLR4_5_2h03h03lvha7cg9.R.iget(22095)!=0|true))||(__CLR4_5_2h03h03lvha7cg9.R.iget(22096)==0&false))) {{
                // strip the space off again
                __CLR4_5_2h03h03lvha7cg9.R.inc(22097);duration = duration.substring(1);
            }
        }}
        }__CLR4_5_2h03h03lvha7cg9.R.inc(22098);if ((((suppressTrailingZeroElements)&&(__CLR4_5_2h03h03lvha7cg9.R.iget(22099)!=0|true))||(__CLR4_5_2h03h03lvha7cg9.R.iget(22100)==0&false))) {{
            __CLR4_5_2h03h03lvha7cg9.R.inc(22101);String tmp = StringUtils.replaceOnce(duration, " 0 seconds", StringUtils.EMPTY);
            __CLR4_5_2h03h03lvha7cg9.R.inc(22102);if ((((tmp.length() != duration.length())&&(__CLR4_5_2h03h03lvha7cg9.R.iget(22103)!=0|true))||(__CLR4_5_2h03h03lvha7cg9.R.iget(22104)==0&false))) {{
                __CLR4_5_2h03h03lvha7cg9.R.inc(22105);duration = tmp;
                __CLR4_5_2h03h03lvha7cg9.R.inc(22106);tmp = StringUtils.replaceOnce(duration, " 0 minutes", StringUtils.EMPTY);
                __CLR4_5_2h03h03lvha7cg9.R.inc(22107);if ((((tmp.length() != duration.length())&&(__CLR4_5_2h03h03lvha7cg9.R.iget(22108)!=0|true))||(__CLR4_5_2h03h03lvha7cg9.R.iget(22109)==0&false))) {{
                    __CLR4_5_2h03h03lvha7cg9.R.inc(22110);duration = tmp;
                    __CLR4_5_2h03h03lvha7cg9.R.inc(22111);tmp = StringUtils.replaceOnce(duration, " 0 hours", StringUtils.EMPTY);
                    __CLR4_5_2h03h03lvha7cg9.R.inc(22112);if ((((tmp.length() != duration.length())&&(__CLR4_5_2h03h03lvha7cg9.R.iget(22113)!=0|true))||(__CLR4_5_2h03h03lvha7cg9.R.iget(22114)==0&false))) {{
                        __CLR4_5_2h03h03lvha7cg9.R.inc(22115);duration = StringUtils.replaceOnce(tmp, " 0 days", StringUtils.EMPTY);
                    }
                }}
            }}
        }}
        // handle plurals
        }__CLR4_5_2h03h03lvha7cg9.R.inc(22116);duration = " " + duration;
        __CLR4_5_2h03h03lvha7cg9.R.inc(22117);duration = StringUtils.replaceOnce(duration, " 1 seconds", " 1 second");
        __CLR4_5_2h03h03lvha7cg9.R.inc(22118);duration = StringUtils.replaceOnce(duration, " 1 minutes", " 1 minute");
        __CLR4_5_2h03h03lvha7cg9.R.inc(22119);duration = StringUtils.replaceOnce(duration, " 1 hours", " 1 hour");
        __CLR4_5_2h03h03lvha7cg9.R.inc(22120);duration = StringUtils.replaceOnce(duration, " 1 days", " 1 day");
        __CLR4_5_2h03h03lvha7cg9.R.inc(22121);return duration.trim();
    }finally{__CLR4_5_2h03h03lvha7cg9.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * <p>Formats the time gap as a string.</p>
     * 
     * <p>The format used is the ISO 8601 period format.</p>
     * 
     * @param startMillis  the start of the duration to format
     * @param endMillis  the end of the duration to format
     * @return the formatted duration, not null
     * @throws java.lang.IllegalArgumentException if startMillis is greater than endMillis
     */
    public static String formatPeriodISO(final long startMillis, final long endMillis) {try{__CLR4_5_2h03h03lvha7cg9.R.inc(22122);
        __CLR4_5_2h03h03lvha7cg9.R.inc(22123);return formatPeriod(startMillis, endMillis, ISO_EXTENDED_FORMAT_PATTERN, false, TimeZone.getDefault());
    }finally{__CLR4_5_2h03h03lvha7cg9.R.flushNeeded();}}

    /**
     * <p>Formats the time gap as a string, using the specified format.
     * Padding the left hand side of numbers with zeroes is optional.
     * 
     * @param startMillis  the start of the duration
     * @param endMillis  the end of the duration
     * @param format  the way in which to format the duration, not null
     * @return the formatted duration, not null
     * @throws java.lang.IllegalArgumentException if startMillis is greater than endMillis
     */
    public static String formatPeriod(final long startMillis, final long endMillis, final String format) {try{__CLR4_5_2h03h03lvha7cg9.R.inc(22124);
        __CLR4_5_2h03h03lvha7cg9.R.inc(22125);return formatPeriod(startMillis, endMillis, format, true, TimeZone.getDefault());
    }finally{__CLR4_5_2h03h03lvha7cg9.R.flushNeeded();}}

    /**
     * <p>Formats the time gap as a string, using the specified format.
     * Padding the left hand side of numbers with zeroes is optional and 
     * the timezone may be specified. </p>
     *
     * <p>When calculating the difference between months/days, it chooses to 
     * calculate months first. So when working out the number of months and 
     * days between January 15th and March 10th, it choose 1 month and 
     * 23 days gained by choosing January-&gt;February = 1 month and then 
     * calculating days forwards, and not the 1 month and 26 days gained by 
     * choosing March -&gt; February = 1 month and then calculating days 
     * backwards. </p>
     *
     * <p>For more control, the <a href="http://joda-time.sf.net/">Joda-Time</a>
     * library is recommended.</p>
     * 
     * @param startMillis  the start of the duration
     * @param endMillis  the end of the duration
     * @param format  the way in which to format the duration, not null
     * @param padWithZeros  whether to pad the left hand side of numbers with 0's
     * @param timezone  the millis are defined in
     * @return the formatted duration, not null
     * @throws java.lang.IllegalArgumentException if startMillis is greater than endMillis
     */
    public static String formatPeriod(final long startMillis, final long endMillis, final String format, final boolean padWithZeros, 
            final TimeZone timezone) {try{__CLR4_5_2h03h03lvha7cg9.R.inc(22126);
        __CLR4_5_2h03h03lvha7cg9.R.inc(22127);Validate.isTrue(startMillis <= endMillis, "startMillis must not be greater than endMillis");
        

        // Used to optimise for differences under 28 days and 
        // called formatDuration(millis, format); however this did not work 
        // over leap years. 
        // TODO: Compare performance to see if anything was lost by 
        // losing this optimisation. 
        
        __CLR4_5_2h03h03lvha7cg9.R.inc(22128);final Token[] tokens = lexx(format);

        // timezones get funky around 0, so normalizing everything to GMT 
        // stops the hours being off
        __CLR4_5_2h03h03lvha7cg9.R.inc(22129);final Calendar start = Calendar.getInstance(timezone);
        __CLR4_5_2h03h03lvha7cg9.R.inc(22130);start.setTime(new Date(startMillis));
        __CLR4_5_2h03h03lvha7cg9.R.inc(22131);final Calendar end = Calendar.getInstance(timezone);
        __CLR4_5_2h03h03lvha7cg9.R.inc(22132);end.setTime(new Date(endMillis));

        // initial estimates
        __CLR4_5_2h03h03lvha7cg9.R.inc(22133);int milliseconds = end.get(Calendar.MILLISECOND) - start.get(Calendar.MILLISECOND);
        __CLR4_5_2h03h03lvha7cg9.R.inc(22134);int seconds = end.get(Calendar.SECOND) - start.get(Calendar.SECOND);
        __CLR4_5_2h03h03lvha7cg9.R.inc(22135);int minutes = end.get(Calendar.MINUTE) - start.get(Calendar.MINUTE);
        __CLR4_5_2h03h03lvha7cg9.R.inc(22136);int hours = end.get(Calendar.HOUR_OF_DAY) - start.get(Calendar.HOUR_OF_DAY);
        __CLR4_5_2h03h03lvha7cg9.R.inc(22137);int days = end.get(Calendar.DAY_OF_MONTH) - start.get(Calendar.DAY_OF_MONTH);
        __CLR4_5_2h03h03lvha7cg9.R.inc(22138);int months = end.get(Calendar.MONTH) - start.get(Calendar.MONTH);
        __CLR4_5_2h03h03lvha7cg9.R.inc(22139);int years = end.get(Calendar.YEAR) - start.get(Calendar.YEAR);

        // each initial estimate is adjusted in case it is under 0
        __CLR4_5_2h03h03lvha7cg9.R.inc(22140);while ((((milliseconds < 0)&&(__CLR4_5_2h03h03lvha7cg9.R.iget(22141)!=0|true))||(__CLR4_5_2h03h03lvha7cg9.R.iget(22142)==0&false))) {{
            __CLR4_5_2h03h03lvha7cg9.R.inc(22143);milliseconds += 1000;
            __CLR4_5_2h03h03lvha7cg9.R.inc(22144);seconds -= 1;
        }
        }__CLR4_5_2h03h03lvha7cg9.R.inc(22145);while ((((seconds < 0)&&(__CLR4_5_2h03h03lvha7cg9.R.iget(22146)!=0|true))||(__CLR4_5_2h03h03lvha7cg9.R.iget(22147)==0&false))) {{
            __CLR4_5_2h03h03lvha7cg9.R.inc(22148);seconds += 60;
            __CLR4_5_2h03h03lvha7cg9.R.inc(22149);minutes -= 1;
        }
        }__CLR4_5_2h03h03lvha7cg9.R.inc(22150);while ((((minutes < 0)&&(__CLR4_5_2h03h03lvha7cg9.R.iget(22151)!=0|true))||(__CLR4_5_2h03h03lvha7cg9.R.iget(22152)==0&false))) {{
            __CLR4_5_2h03h03lvha7cg9.R.inc(22153);minutes += 60;
            __CLR4_5_2h03h03lvha7cg9.R.inc(22154);hours -= 1;
        }
        }__CLR4_5_2h03h03lvha7cg9.R.inc(22155);while ((((hours < 0)&&(__CLR4_5_2h03h03lvha7cg9.R.iget(22156)!=0|true))||(__CLR4_5_2h03h03lvha7cg9.R.iget(22157)==0&false))) {{
            __CLR4_5_2h03h03lvha7cg9.R.inc(22158);hours += 24;
            __CLR4_5_2h03h03lvha7cg9.R.inc(22159);days -= 1;
        }
       
        }__CLR4_5_2h03h03lvha7cg9.R.inc(22160);if ((((Token.containsTokenWithValue(tokens, M))&&(__CLR4_5_2h03h03lvha7cg9.R.iget(22161)!=0|true))||(__CLR4_5_2h03h03lvha7cg9.R.iget(22162)==0&false))) {{
            __CLR4_5_2h03h03lvha7cg9.R.inc(22163);while ((((days < 0)&&(__CLR4_5_2h03h03lvha7cg9.R.iget(22164)!=0|true))||(__CLR4_5_2h03h03lvha7cg9.R.iget(22165)==0&false))) {{
                __CLR4_5_2h03h03lvha7cg9.R.inc(22166);days += start.getActualMaximum(Calendar.DAY_OF_MONTH);
                __CLR4_5_2h03h03lvha7cg9.R.inc(22167);months -= 1;
                __CLR4_5_2h03h03lvha7cg9.R.inc(22168);start.add(Calendar.MONTH, 1);
            }

            }__CLR4_5_2h03h03lvha7cg9.R.inc(22169);while ((((months < 0)&&(__CLR4_5_2h03h03lvha7cg9.R.iget(22170)!=0|true))||(__CLR4_5_2h03h03lvha7cg9.R.iget(22171)==0&false))) {{
                __CLR4_5_2h03h03lvha7cg9.R.inc(22172);months += 12;
                __CLR4_5_2h03h03lvha7cg9.R.inc(22173);years -= 1;
            }

            }__CLR4_5_2h03h03lvha7cg9.R.inc(22174);if ((((!Token.containsTokenWithValue(tokens, y) && years != 0)&&(__CLR4_5_2h03h03lvha7cg9.R.iget(22175)!=0|true))||(__CLR4_5_2h03h03lvha7cg9.R.iget(22176)==0&false))) {{
                __CLR4_5_2h03h03lvha7cg9.R.inc(22177);while ((((years != 0)&&(__CLR4_5_2h03h03lvha7cg9.R.iget(22178)!=0|true))||(__CLR4_5_2h03h03lvha7cg9.R.iget(22179)==0&false))) {{
                    __CLR4_5_2h03h03lvha7cg9.R.inc(22180);months += 12 * years;
                    __CLR4_5_2h03h03lvha7cg9.R.inc(22181);years = 0;
                }
            }}
        }} }else {{
            // there are no M's in the format string

            __CLR4_5_2h03h03lvha7cg9.R.inc(22182);if( (((!Token.containsTokenWithValue(tokens, y) )&&(__CLR4_5_2h03h03lvha7cg9.R.iget(22183)!=0|true))||(__CLR4_5_2h03h03lvha7cg9.R.iget(22184)==0&false))) {{
                __CLR4_5_2h03h03lvha7cg9.R.inc(22185);int target = end.get(Calendar.YEAR);
                __CLR4_5_2h03h03lvha7cg9.R.inc(22186);if ((((months < 0)&&(__CLR4_5_2h03h03lvha7cg9.R.iget(22187)!=0|true))||(__CLR4_5_2h03h03lvha7cg9.R.iget(22188)==0&false))) {{
                    // target is end-year -1
                    __CLR4_5_2h03h03lvha7cg9.R.inc(22189);target -= 1;
                }
                
                }__CLR4_5_2h03h03lvha7cg9.R.inc(22190);while ((((start.get(Calendar.YEAR) != target)&&(__CLR4_5_2h03h03lvha7cg9.R.iget(22191)!=0|true))||(__CLR4_5_2h03h03lvha7cg9.R.iget(22192)==0&false))) {{
                    __CLR4_5_2h03h03lvha7cg9.R.inc(22193);days += start.getActualMaximum(Calendar.DAY_OF_YEAR) - start.get(Calendar.DAY_OF_YEAR);
                    
                    // Not sure I grok why this is needed, but the brutal tests show it is
                    __CLR4_5_2h03h03lvha7cg9.R.inc(22194);if ((((start instanceof GregorianCalendar &&
                            start.get(Calendar.MONTH) == Calendar.FEBRUARY &&
                            start.get(Calendar.DAY_OF_MONTH) == 29)&&(__CLR4_5_2h03h03lvha7cg9.R.iget(22195)!=0|true))||(__CLR4_5_2h03h03lvha7cg9.R.iget(22196)==0&false))) {{
                        __CLR4_5_2h03h03lvha7cg9.R.inc(22197);days += 1;
                    }
                    
                    }__CLR4_5_2h03h03lvha7cg9.R.inc(22198);start.add(Calendar.YEAR, 1);
                    
                    __CLR4_5_2h03h03lvha7cg9.R.inc(22199);days += start.get(Calendar.DAY_OF_YEAR);
                }
                
                }__CLR4_5_2h03h03lvha7cg9.R.inc(22200);years = 0;
            }
            
            }__CLR4_5_2h03h03lvha7cg9.R.inc(22201);while( (((start.get(Calendar.MONTH) != end.get(Calendar.MONTH) )&&(__CLR4_5_2h03h03lvha7cg9.R.iget(22202)!=0|true))||(__CLR4_5_2h03h03lvha7cg9.R.iget(22203)==0&false))) {{
                __CLR4_5_2h03h03lvha7cg9.R.inc(22204);days += start.getActualMaximum(Calendar.DAY_OF_MONTH);
                __CLR4_5_2h03h03lvha7cg9.R.inc(22205);start.add(Calendar.MONTH, 1);
            }
            
            }__CLR4_5_2h03h03lvha7cg9.R.inc(22206);months = 0;            

            __CLR4_5_2h03h03lvha7cg9.R.inc(22207);while ((((days < 0)&&(__CLR4_5_2h03h03lvha7cg9.R.iget(22208)!=0|true))||(__CLR4_5_2h03h03lvha7cg9.R.iget(22209)==0&false))) {{
                __CLR4_5_2h03h03lvha7cg9.R.inc(22210);days += start.getActualMaximum(Calendar.DAY_OF_MONTH);
                __CLR4_5_2h03h03lvha7cg9.R.inc(22211);months -= 1;
                __CLR4_5_2h03h03lvha7cg9.R.inc(22212);start.add(Calendar.MONTH, 1);
            }
            
        }}

        // The rest of this code adds in values that 
        // aren't requested. This allows the user to ask for the 
        // number of months and get the real count and not just 0->11.

        }__CLR4_5_2h03h03lvha7cg9.R.inc(22213);if ((((!Token.containsTokenWithValue(tokens, d))&&(__CLR4_5_2h03h03lvha7cg9.R.iget(22214)!=0|true))||(__CLR4_5_2h03h03lvha7cg9.R.iget(22215)==0&false))) {{
            __CLR4_5_2h03h03lvha7cg9.R.inc(22216);hours += 24 * days;
            __CLR4_5_2h03h03lvha7cg9.R.inc(22217);days = 0;
        }
        }__CLR4_5_2h03h03lvha7cg9.R.inc(22218);if ((((!Token.containsTokenWithValue(tokens, H))&&(__CLR4_5_2h03h03lvha7cg9.R.iget(22219)!=0|true))||(__CLR4_5_2h03h03lvha7cg9.R.iget(22220)==0&false))) {{
            __CLR4_5_2h03h03lvha7cg9.R.inc(22221);minutes += 60 * hours;
            __CLR4_5_2h03h03lvha7cg9.R.inc(22222);hours = 0;
        }
        }__CLR4_5_2h03h03lvha7cg9.R.inc(22223);if ((((!Token.containsTokenWithValue(tokens, m))&&(__CLR4_5_2h03h03lvha7cg9.R.iget(22224)!=0|true))||(__CLR4_5_2h03h03lvha7cg9.R.iget(22225)==0&false))) {{
            __CLR4_5_2h03h03lvha7cg9.R.inc(22226);seconds += 60 * minutes;
            __CLR4_5_2h03h03lvha7cg9.R.inc(22227);minutes = 0;
        }
        }__CLR4_5_2h03h03lvha7cg9.R.inc(22228);if ((((!Token.containsTokenWithValue(tokens, s))&&(__CLR4_5_2h03h03lvha7cg9.R.iget(22229)!=0|true))||(__CLR4_5_2h03h03lvha7cg9.R.iget(22230)==0&false))) {{
            __CLR4_5_2h03h03lvha7cg9.R.inc(22231);milliseconds += 1000 * seconds;
            __CLR4_5_2h03h03lvha7cg9.R.inc(22232);seconds = 0;
        }

        }__CLR4_5_2h03h03lvha7cg9.R.inc(22233);return format(tokens, years, months, days, hours, minutes, seconds, milliseconds, padWithZeros);
    }finally{__CLR4_5_2h03h03lvha7cg9.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * <p>The internal method to do the formatting.</p>
     * 
     * @param tokens  the tokens
     * @param years  the number of years
     * @param months  the number of months
     * @param days  the number of days
     * @param hours  the number of hours
     * @param minutes  the number of minutes
     * @param seconds  the number of seconds
     * @param milliseconds  the number of millis
     * @param padWithZeros  whether to pad
     * @return the formatted string
     */
    static String format(final Token[] tokens, final long years, final long months, final long days, final long hours, final long minutes, final long seconds,
            final long milliseconds, final boolean padWithZeros) {try{__CLR4_5_2h03h03lvha7cg9.R.inc(22234);
        __CLR4_5_2h03h03lvha7cg9.R.inc(22235);final StringBuilder buffer = new StringBuilder();
        __CLR4_5_2h03h03lvha7cg9.R.inc(22236);boolean lastOutputSeconds = false;
        __CLR4_5_2h03h03lvha7cg9.R.inc(22237);for (final Token token : tokens) {{
            __CLR4_5_2h03h03lvha7cg9.R.inc(22238);final Object value = token.getValue();
            __CLR4_5_2h03h03lvha7cg9.R.inc(22239);final int count = token.getCount();
            __CLR4_5_2h03h03lvha7cg9.R.inc(22240);if ((((value instanceof StringBuilder)&&(__CLR4_5_2h03h03lvha7cg9.R.iget(22241)!=0|true))||(__CLR4_5_2h03h03lvha7cg9.R.iget(22242)==0&false))) {{
                __CLR4_5_2h03h03lvha7cg9.R.inc(22243);buffer.append(value.toString());
            } }else {{
                __CLR4_5_2h03h03lvha7cg9.R.inc(22244);if ((((value.equals(y))&&(__CLR4_5_2h03h03lvha7cg9.R.iget(22245)!=0|true))||(__CLR4_5_2h03h03lvha7cg9.R.iget(22246)==0&false))) {{
                    __CLR4_5_2h03h03lvha7cg9.R.inc(22247);buffer.append(paddedValue(years, padWithZeros, count));
                    __CLR4_5_2h03h03lvha7cg9.R.inc(22248);lastOutputSeconds = false;
                } }else {__CLR4_5_2h03h03lvha7cg9.R.inc(22249);if ((((value.equals(M))&&(__CLR4_5_2h03h03lvha7cg9.R.iget(22250)!=0|true))||(__CLR4_5_2h03h03lvha7cg9.R.iget(22251)==0&false))) {{
                    __CLR4_5_2h03h03lvha7cg9.R.inc(22252);buffer.append(paddedValue(months, padWithZeros, count));
                    __CLR4_5_2h03h03lvha7cg9.R.inc(22253);lastOutputSeconds = false;
                } }else {__CLR4_5_2h03h03lvha7cg9.R.inc(22254);if ((((value.equals(d))&&(__CLR4_5_2h03h03lvha7cg9.R.iget(22255)!=0|true))||(__CLR4_5_2h03h03lvha7cg9.R.iget(22256)==0&false))) {{
                    __CLR4_5_2h03h03lvha7cg9.R.inc(22257);buffer.append(paddedValue(days, padWithZeros, count));
                    __CLR4_5_2h03h03lvha7cg9.R.inc(22258);lastOutputSeconds = false;
                } }else {__CLR4_5_2h03h03lvha7cg9.R.inc(22259);if ((((value.equals(H))&&(__CLR4_5_2h03h03lvha7cg9.R.iget(22260)!=0|true))||(__CLR4_5_2h03h03lvha7cg9.R.iget(22261)==0&false))) {{
                    __CLR4_5_2h03h03lvha7cg9.R.inc(22262);buffer.append(paddedValue(hours, padWithZeros, count));
                    __CLR4_5_2h03h03lvha7cg9.R.inc(22263);lastOutputSeconds = false;
                } }else {__CLR4_5_2h03h03lvha7cg9.R.inc(22264);if ((((value.equals(m))&&(__CLR4_5_2h03h03lvha7cg9.R.iget(22265)!=0|true))||(__CLR4_5_2h03h03lvha7cg9.R.iget(22266)==0&false))) {{
                    __CLR4_5_2h03h03lvha7cg9.R.inc(22267);buffer.append(paddedValue(minutes, padWithZeros, count));
                    __CLR4_5_2h03h03lvha7cg9.R.inc(22268);lastOutputSeconds = false;
                } }else {__CLR4_5_2h03h03lvha7cg9.R.inc(22269);if ((((value.equals(s))&&(__CLR4_5_2h03h03lvha7cg9.R.iget(22270)!=0|true))||(__CLR4_5_2h03h03lvha7cg9.R.iget(22271)==0&false))) {{
                    __CLR4_5_2h03h03lvha7cg9.R.inc(22272);buffer.append(paddedValue(seconds, padWithZeros, count));
                    __CLR4_5_2h03h03lvha7cg9.R.inc(22273);lastOutputSeconds = true;
                } }else {__CLR4_5_2h03h03lvha7cg9.R.inc(22274);if ((((value.equals(S))&&(__CLR4_5_2h03h03lvha7cg9.R.iget(22275)!=0|true))||(__CLR4_5_2h03h03lvha7cg9.R.iget(22276)==0&false))) {{
                    __CLR4_5_2h03h03lvha7cg9.R.inc(22277);if ((((lastOutputSeconds)&&(__CLR4_5_2h03h03lvha7cg9.R.iget(22278)!=0|true))||(__CLR4_5_2h03h03lvha7cg9.R.iget(22279)==0&false))) {{
                        // ensure at least 3 digits are displayed even if padding is not selected
                        __CLR4_5_2h03h03lvha7cg9.R.inc(22280);final int width = (((padWithZeros )&&(__CLR4_5_2h03h03lvha7cg9.R.iget(22281)!=0|true))||(__CLR4_5_2h03h03lvha7cg9.R.iget(22282)==0&false))? Math.max(3, count) : 3;
                        __CLR4_5_2h03h03lvha7cg9.R.inc(22283);buffer.append(paddedValue(milliseconds, true, width));
                    } }else {{
                        __CLR4_5_2h03h03lvha7cg9.R.inc(22284);buffer.append(paddedValue(milliseconds, padWithZeros, count));
                    }
                    }__CLR4_5_2h03h03lvha7cg9.R.inc(22285);lastOutputSeconds = false;
                }
            }}}}}}}}
        }}
        }__CLR4_5_2h03h03lvha7cg9.R.inc(22286);return buffer.toString();
    }finally{__CLR4_5_2h03h03lvha7cg9.R.flushNeeded();}}

    /**
     * <p>Converts a {@code long} to a {@code String} with optional
     * zero padding.</p>
     *
     * @param value the value to convert
     * @param padWithZeros whether to pad with zeroes
     * @param count the size to pad to (ignored if {@code padWithZeros} is false)
     * @return the string result
     */
    private static String paddedValue(final long value, final boolean padWithZeros, final int count) {try{__CLR4_5_2h03h03lvha7cg9.R.inc(22287);
        __CLR4_5_2h03h03lvha7cg9.R.inc(22288);final String longString = Long.toString(value);
        __CLR4_5_2h03h03lvha7cg9.R.inc(22289);return (((padWithZeros )&&(__CLR4_5_2h03h03lvha7cg9.R.iget(22290)!=0|true))||(__CLR4_5_2h03h03lvha7cg9.R.iget(22291)==0&false))? StringUtils.leftPad(longString, count, '0') : longString;
    }finally{__CLR4_5_2h03h03lvha7cg9.R.flushNeeded();}}

    static final Object y = "y";
    static final Object M = "M";
    static final Object d = "d";
    static final Object H = "H";
    static final Object m = "m";
    static final Object s = "s";
    static final Object S = "S";
    
    /**
     * Parses a classic date format string into Tokens
     *
     * @param format  the format to parse, not null
     * @return array of Token[]
     */
    static Token[] lexx(final String format) {try{__CLR4_5_2h03h03lvha7cg9.R.inc(22292);
        __CLR4_5_2h03h03lvha7cg9.R.inc(22293);final ArrayList<Token> list = new ArrayList<>(format.length());

        __CLR4_5_2h03h03lvha7cg9.R.inc(22294);boolean inLiteral = false;
        // Although the buffer is stored in a Token, the Tokens are only
        // used internally, so cannot be accessed by other threads
        __CLR4_5_2h03h03lvha7cg9.R.inc(22295);StringBuilder buffer = null;
        __CLR4_5_2h03h03lvha7cg9.R.inc(22296);Token previous = null;
        __CLR4_5_2h03h03lvha7cg9.R.inc(22297);for (int i = 0; (((i < format.length())&&(__CLR4_5_2h03h03lvha7cg9.R.iget(22298)!=0|true))||(__CLR4_5_2h03h03lvha7cg9.R.iget(22299)==0&false)); i++) {{
            __CLR4_5_2h03h03lvha7cg9.R.inc(22300);final char ch = format.charAt(i);
            __CLR4_5_2h03h03lvha7cg9.R.inc(22301);if ((((inLiteral && ch != '\'')&&(__CLR4_5_2h03h03lvha7cg9.R.iget(22302)!=0|true))||(__CLR4_5_2h03h03lvha7cg9.R.iget(22303)==0&false))) {{
                __CLR4_5_2h03h03lvha7cg9.R.inc(22304);buffer.append(ch); // buffer can't be null if inLiteral is true
                __CLR4_5_2h03h03lvha7cg9.R.inc(22305);continue;
            }
            }__CLR4_5_2h03h03lvha7cg9.R.inc(22306);Object value = null;
            boolean __CLB4_5_2_bool0=false;__CLR4_5_2h03h03lvha7cg9.R.inc(22307);switch (ch) {
            // TODO: Need to handle escaping of '
            case '\'':if (!__CLB4_5_2_bool0) {__CLR4_5_2h03h03lvha7cg9.R.inc(22308);__CLB4_5_2_bool0=true;}
                __CLR4_5_2h03h03lvha7cg9.R.inc(22309);if ((((inLiteral)&&(__CLR4_5_2h03h03lvha7cg9.R.iget(22310)!=0|true))||(__CLR4_5_2h03h03lvha7cg9.R.iget(22311)==0&false))) {{
                    __CLR4_5_2h03h03lvha7cg9.R.inc(22312);buffer = null;
                    __CLR4_5_2h03h03lvha7cg9.R.inc(22313);inLiteral = false;
                } }else {{
                    __CLR4_5_2h03h03lvha7cg9.R.inc(22314);buffer = new StringBuilder();
                    __CLR4_5_2h03h03lvha7cg9.R.inc(22315);list.add(new Token(buffer));
                    __CLR4_5_2h03h03lvha7cg9.R.inc(22316);inLiteral = true;
                }
                }__CLR4_5_2h03h03lvha7cg9.R.inc(22317);break;
            case 'y':if (!__CLB4_5_2_bool0) {__CLR4_5_2h03h03lvha7cg9.R.inc(22318);__CLB4_5_2_bool0=true;}
                __CLR4_5_2h03h03lvha7cg9.R.inc(22319);value = y;
                __CLR4_5_2h03h03lvha7cg9.R.inc(22320);break;
            case 'M':if (!__CLB4_5_2_bool0) {__CLR4_5_2h03h03lvha7cg9.R.inc(22321);__CLB4_5_2_bool0=true;}
                __CLR4_5_2h03h03lvha7cg9.R.inc(22322);value = M;
                __CLR4_5_2h03h03lvha7cg9.R.inc(22323);break;
            case 'd':if (!__CLB4_5_2_bool0) {__CLR4_5_2h03h03lvha7cg9.R.inc(22324);__CLB4_5_2_bool0=true;}
                __CLR4_5_2h03h03lvha7cg9.R.inc(22325);value = d;
                __CLR4_5_2h03h03lvha7cg9.R.inc(22326);break;
            case 'H':if (!__CLB4_5_2_bool0) {__CLR4_5_2h03h03lvha7cg9.R.inc(22327);__CLB4_5_2_bool0=true;}
                __CLR4_5_2h03h03lvha7cg9.R.inc(22328);value = H;
                __CLR4_5_2h03h03lvha7cg9.R.inc(22329);break;
            case 'm':if (!__CLB4_5_2_bool0) {__CLR4_5_2h03h03lvha7cg9.R.inc(22330);__CLB4_5_2_bool0=true;}
                __CLR4_5_2h03h03lvha7cg9.R.inc(22331);value = m;
                __CLR4_5_2h03h03lvha7cg9.R.inc(22332);break;
            case 's':if (!__CLB4_5_2_bool0) {__CLR4_5_2h03h03lvha7cg9.R.inc(22333);__CLB4_5_2_bool0=true;}
                __CLR4_5_2h03h03lvha7cg9.R.inc(22334);value = s;
                __CLR4_5_2h03h03lvha7cg9.R.inc(22335);break;
            case 'S':if (!__CLB4_5_2_bool0) {__CLR4_5_2h03h03lvha7cg9.R.inc(22336);__CLB4_5_2_bool0=true;}
                __CLR4_5_2h03h03lvha7cg9.R.inc(22337);value = S;
                __CLR4_5_2h03h03lvha7cg9.R.inc(22338);break;
            default:if (!__CLB4_5_2_bool0) {__CLR4_5_2h03h03lvha7cg9.R.inc(22339);__CLB4_5_2_bool0=true;}
                __CLR4_5_2h03h03lvha7cg9.R.inc(22340);if ((((buffer == null)&&(__CLR4_5_2h03h03lvha7cg9.R.iget(22341)!=0|true))||(__CLR4_5_2h03h03lvha7cg9.R.iget(22342)==0&false))) {{
                    __CLR4_5_2h03h03lvha7cg9.R.inc(22343);buffer = new StringBuilder();
                    __CLR4_5_2h03h03lvha7cg9.R.inc(22344);list.add(new Token(buffer));
                }
                }__CLR4_5_2h03h03lvha7cg9.R.inc(22345);buffer.append(ch);
            }

            __CLR4_5_2h03h03lvha7cg9.R.inc(22346);if ((((value != null)&&(__CLR4_5_2h03h03lvha7cg9.R.iget(22347)!=0|true))||(__CLR4_5_2h03h03lvha7cg9.R.iget(22348)==0&false))) {{
                __CLR4_5_2h03h03lvha7cg9.R.inc(22349);if ((((previous != null && previous.getValue().equals(value))&&(__CLR4_5_2h03h03lvha7cg9.R.iget(22350)!=0|true))||(__CLR4_5_2h03h03lvha7cg9.R.iget(22351)==0&false))) {{
                    __CLR4_5_2h03h03lvha7cg9.R.inc(22352);previous.increment();
                } }else {{
                    __CLR4_5_2h03h03lvha7cg9.R.inc(22353);final Token token = new Token(value);
                    __CLR4_5_2h03h03lvha7cg9.R.inc(22354);list.add(token);
                    __CLR4_5_2h03h03lvha7cg9.R.inc(22355);previous = token;
                }
                }__CLR4_5_2h03h03lvha7cg9.R.inc(22356);buffer = null;
            }
        }}
        }__CLR4_5_2h03h03lvha7cg9.R.inc(22357);if ((((inLiteral)&&(__CLR4_5_2h03h03lvha7cg9.R.iget(22358)!=0|true))||(__CLR4_5_2h03h03lvha7cg9.R.iget(22359)==0&false))) {{ // i.e. we have not found the end of the literal
            __CLR4_5_2h03h03lvha7cg9.R.inc(22360);throw new IllegalArgumentException("Unmatched quote in format: " + format);
        }
        }__CLR4_5_2h03h03lvha7cg9.R.inc(22361);return list.toArray(new Token[list.size()]);
    }finally{__CLR4_5_2h03h03lvha7cg9.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Element that is parsed from the format pattern.
     */
    static class Token {

        /**
         * Helper method to determine if a set of tokens contain a value
         *
         * @param tokens set to look in
         * @param value to look for
         * @return boolean <code>true</code> if contained
         */
        static boolean containsTokenWithValue(final Token[] tokens, final Object value) {try{__CLR4_5_2h03h03lvha7cg9.R.inc(22362);
            __CLR4_5_2h03h03lvha7cg9.R.inc(22363);for (final Token token : tokens) {{
                __CLR4_5_2h03h03lvha7cg9.R.inc(22364);if ((((token.getValue() == value)&&(__CLR4_5_2h03h03lvha7cg9.R.iget(22365)!=0|true))||(__CLR4_5_2h03h03lvha7cg9.R.iget(22366)==0&false))) {{
                    __CLR4_5_2h03h03lvha7cg9.R.inc(22367);return true;
                }
            }}
            }__CLR4_5_2h03h03lvha7cg9.R.inc(22368);return false;
        }finally{__CLR4_5_2h03h03lvha7cg9.R.flushNeeded();}}

        private final Object value;
        private int count;

        /**
         * Wraps a token around a value. A value would be something like a 'Y'.
         *
         * @param value to wrap
         */
        Token(final Object value) {try{__CLR4_5_2h03h03lvha7cg9.R.inc(22369);
            __CLR4_5_2h03h03lvha7cg9.R.inc(22370);this.value = value;
            __CLR4_5_2h03h03lvha7cg9.R.inc(22371);this.count = 1;
        }finally{__CLR4_5_2h03h03lvha7cg9.R.flushNeeded();}}

        /**
         * Wraps a token around a repeated number of a value, for example it would 
         * store 'yyyy' as a value for y and a count of 4.
         *
         * @param value to wrap
         * @param count to wrap
         */
        Token(final Object value, final int count) {try{__CLR4_5_2h03h03lvha7cg9.R.inc(22372);
            __CLR4_5_2h03h03lvha7cg9.R.inc(22373);this.value = value;
            __CLR4_5_2h03h03lvha7cg9.R.inc(22374);this.count = count;
        }finally{__CLR4_5_2h03h03lvha7cg9.R.flushNeeded();}}

        /**
         * Adds another one of the value
         */
        void increment() {try{__CLR4_5_2h03h03lvha7cg9.R.inc(22375); 
            __CLR4_5_2h03h03lvha7cg9.R.inc(22376);count++;
        }finally{__CLR4_5_2h03h03lvha7cg9.R.flushNeeded();}}

        /**
         * Gets the current number of values represented
         *
         * @return int number of values represented
         */
        int getCount() {try{__CLR4_5_2h03h03lvha7cg9.R.inc(22377);
            __CLR4_5_2h03h03lvha7cg9.R.inc(22378);return count;
        }finally{__CLR4_5_2h03h03lvha7cg9.R.flushNeeded();}}

        /**
         * Gets the particular value this token represents.
         * 
         * @return Object value
         */
        Object getValue() {try{__CLR4_5_2h03h03lvha7cg9.R.inc(22379);
            __CLR4_5_2h03h03lvha7cg9.R.inc(22380);return value;
        }finally{__CLR4_5_2h03h03lvha7cg9.R.flushNeeded();}}

        /**
         * Supports equality of this Token to another Token.
         *
         * @param obj2 Object to consider equality of
         * @return boolean <code>true</code> if equal
         */
        @Override
        public boolean equals(final Object obj2) {try{__CLR4_5_2h03h03lvha7cg9.R.inc(22381);
            __CLR4_5_2h03h03lvha7cg9.R.inc(22382);if ((((obj2 instanceof Token)&&(__CLR4_5_2h03h03lvha7cg9.R.iget(22383)!=0|true))||(__CLR4_5_2h03h03lvha7cg9.R.iget(22384)==0&false))) {{
                __CLR4_5_2h03h03lvha7cg9.R.inc(22385);final Token tok2 = (Token) obj2;
                __CLR4_5_2h03h03lvha7cg9.R.inc(22386);if ((((this.value.getClass() != tok2.value.getClass())&&(__CLR4_5_2h03h03lvha7cg9.R.iget(22387)!=0|true))||(__CLR4_5_2h03h03lvha7cg9.R.iget(22388)==0&false))) {{
                    __CLR4_5_2h03h03lvha7cg9.R.inc(22389);return false;
                }
                }__CLR4_5_2h03h03lvha7cg9.R.inc(22390);if ((((this.count != tok2.count)&&(__CLR4_5_2h03h03lvha7cg9.R.iget(22391)!=0|true))||(__CLR4_5_2h03h03lvha7cg9.R.iget(22392)==0&false))) {{
                    __CLR4_5_2h03h03lvha7cg9.R.inc(22393);return false;
                }
                }__CLR4_5_2h03h03lvha7cg9.R.inc(22394);if ((((this.value instanceof StringBuilder)&&(__CLR4_5_2h03h03lvha7cg9.R.iget(22395)!=0|true))||(__CLR4_5_2h03h03lvha7cg9.R.iget(22396)==0&false))) {{
                    __CLR4_5_2h03h03lvha7cg9.R.inc(22397);return this.value.toString().equals(tok2.value.toString());
                } }else {__CLR4_5_2h03h03lvha7cg9.R.inc(22398);if ((((this.value instanceof Number)&&(__CLR4_5_2h03h03lvha7cg9.R.iget(22399)!=0|true))||(__CLR4_5_2h03h03lvha7cg9.R.iget(22400)==0&false))) {{
                    __CLR4_5_2h03h03lvha7cg9.R.inc(22401);return this.value.equals(tok2.value);
                } }else {{
                    __CLR4_5_2h03h03lvha7cg9.R.inc(22402);return this.value == tok2.value;
                }
            }}}
            }__CLR4_5_2h03h03lvha7cg9.R.inc(22403);return false;
        }finally{__CLR4_5_2h03h03lvha7cg9.R.flushNeeded();}}

        /**
         * Returns a hash code for the token equal to the 
         * hash code for the token's value. Thus 'TT' and 'TTTT' 
         * will have the same hash code. 
         *
         * @return The hash code for the token
         */
        @Override
        public int hashCode() {try{__CLR4_5_2h03h03lvha7cg9.R.inc(22404);
            __CLR4_5_2h03h03lvha7cg9.R.inc(22405);return this.value.hashCode();
        }finally{__CLR4_5_2h03h03lvha7cg9.R.flushNeeded();}}

        /**
         * Represents this token as a String.
         *
         * @return String representation of the token
         */
        @Override
        public String toString() {try{__CLR4_5_2h03h03lvha7cg9.R.inc(22406);
            __CLR4_5_2h03h03lvha7cg9.R.inc(22407);return StringUtils.repeat(this.value.toString(), this.count);
        }finally{__CLR4_5_2h03h03lvha7cg9.R.flushNeeded();}}
    }

}
