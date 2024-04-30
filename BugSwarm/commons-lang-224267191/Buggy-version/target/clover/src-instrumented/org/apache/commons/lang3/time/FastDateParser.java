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
import java.text.DateFormatSymbols;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * <p>FastDateParser is a fast and thread-safe version of
 * {@link java.text.SimpleDateFormat}.</p>
 *
 * <p>To obtain a proxy to a FastDateParser, use {@link FastDateFormat#getInstance(String, TimeZone, Locale)} 
 * or another variation of the factory methods of {@link FastDateFormat}.</p>
 * 
 * <p>Since FastDateParser is thread safe, you can use a static member instance:</p>
 * <code>
 *     private static final DateParser DATE_PARSER = FastDateFormat.getInstance("yyyy-MM-dd");
 * </code>
 * 
 * <p>This class can be used as a direct replacement for
 * <code>SimpleDateFormat</code> in most parsing situations.
 * This class is especially useful in multi-threaded server environments.
 * <code>SimpleDateFormat</code> is not thread-safe in any JDK version,
 * nor will it be as Sun has closed the
 * <a href="http://bugs.sun.com/bugdatabase/view_bug.do?bug_id=4228335">bug</a>/RFE.
 * </p>
 *
 * <p>Only parsing is supported by this class, but all patterns are compatible with
 * SimpleDateFormat.</p>
 *
 * <p>The class operates in lenient mode, so for example a time of 90 minutes is treated as 1 hour 30 minutes.</p>
 *
 * <p>Timing tests indicate this class is as about as fast as SimpleDateFormat
 * in single thread applications and about 25% faster in multi-thread applications.</p>
 *
 * @since 3.2
 * @see FastDatePrinter
 */
@java.lang.SuppressWarnings({"fallthrough"}) public class FastDateParser implements DateParser, Serializable {public static class __CLR4_5_2hcyhcylvha7ck2{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172755542L,8589935092L,22954,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Required for serialization support.
     *
     * @see java.io.Serializable
     */
    private static final long serialVersionUID = 3L;

    static final Locale JAPANESE_IMPERIAL = new Locale("ja","JP","JP");

    // defining fields
    private final String pattern;
    private final TimeZone timeZone;
    private final Locale locale;
    private final int century;
    private final int startYear;

    // derived fields
    private transient List<StrategyAndWidth> patterns;

    // comparator used to sort regex alternatives
    // alternatives should be ordered longer first, and shorter last. ('february' before 'feb')
    // all entries must be lowercase by locale.
    private static final Comparator<String> LONGER_FIRST_LOWERCASE = new Comparator<String>() {
        @Override
        public int compare(final String left, final String right) {try{__CLR4_5_2hcyhcylvha7ck2.R.inc(22498);
            __CLR4_5_2hcyhcylvha7ck2.R.inc(22499);return right.compareTo(left);
        }finally{__CLR4_5_2hcyhcylvha7ck2.R.flushNeeded();}}
    };

    /**
     * <p>Constructs a new FastDateParser.</p>
     * 
     * Use {@link FastDateFormat#getInstance(String, TimeZone, Locale)} or another variation of the 
     * factory methods of {@link FastDateFormat} to get a cached FastDateParser instance.
     *
     * @param pattern non-null {@link java.text.SimpleDateFormat} compatible
     *  pattern
     * @param timeZone non-null time zone to use
     * @param locale non-null locale
     */
    protected FastDateParser(final String pattern, final TimeZone timeZone, final Locale locale) {
        this(pattern, timeZone, locale, null);__CLR4_5_2hcyhcylvha7ck2.R.inc(22501);try{__CLR4_5_2hcyhcylvha7ck2.R.inc(22500);
    }finally{__CLR4_5_2hcyhcylvha7ck2.R.flushNeeded();}}

    /**
     * <p>Constructs a new FastDateParser.</p>
     *
     * @param pattern non-null {@link java.text.SimpleDateFormat} compatible
     *  pattern
     * @param timeZone non-null time zone to use
     * @param locale non-null locale
     * @param centuryStart The start of the century for 2 digit year parsing
     *
     * @since 3.5
     */
    protected FastDateParser(final String pattern, final TimeZone timeZone, final Locale locale, final Date centuryStart) {try{__CLR4_5_2hcyhcylvha7ck2.R.inc(22502);
        __CLR4_5_2hcyhcylvha7ck2.R.inc(22503);this.pattern = pattern;
        __CLR4_5_2hcyhcylvha7ck2.R.inc(22504);this.timeZone = timeZone;
        __CLR4_5_2hcyhcylvha7ck2.R.inc(22505);this.locale = locale;

        __CLR4_5_2hcyhcylvha7ck2.R.inc(22506);final Calendar definingCalendar = Calendar.getInstance(timeZone, locale);

        __CLR4_5_2hcyhcylvha7ck2.R.inc(22507);int centuryStartYear;
        __CLR4_5_2hcyhcylvha7ck2.R.inc(22508);if((((centuryStart!=null)&&(__CLR4_5_2hcyhcylvha7ck2.R.iget(22509)!=0|true))||(__CLR4_5_2hcyhcylvha7ck2.R.iget(22510)==0&false))) {{
            __CLR4_5_2hcyhcylvha7ck2.R.inc(22511);definingCalendar.setTime(centuryStart);
            __CLR4_5_2hcyhcylvha7ck2.R.inc(22512);centuryStartYear= definingCalendar.get(Calendar.YEAR);
        }
        }else {__CLR4_5_2hcyhcylvha7ck2.R.inc(22513);if((((locale.equals(JAPANESE_IMPERIAL))&&(__CLR4_5_2hcyhcylvha7ck2.R.iget(22514)!=0|true))||(__CLR4_5_2hcyhcylvha7ck2.R.iget(22515)==0&false))) {{
            __CLR4_5_2hcyhcylvha7ck2.R.inc(22516);centuryStartYear= 0;
        }
        }else {{
            // from 80 years ago to 20 years from now
            __CLR4_5_2hcyhcylvha7ck2.R.inc(22517);definingCalendar.setTime(new Date());
            __CLR4_5_2hcyhcylvha7ck2.R.inc(22518);centuryStartYear= definingCalendar.get(Calendar.YEAR)-80;
        }
        }}__CLR4_5_2hcyhcylvha7ck2.R.inc(22519);century= centuryStartYear / 100 * 100;
        __CLR4_5_2hcyhcylvha7ck2.R.inc(22520);startYear= centuryStartYear - century;

        __CLR4_5_2hcyhcylvha7ck2.R.inc(22521);init(definingCalendar);
    }finally{__CLR4_5_2hcyhcylvha7ck2.R.flushNeeded();}}

    /**
     * Initialize derived fields from defining fields.
     * This is called from constructor and from readObject (de-serialization)
     *
     * @param definingCalendar the {@link java.util.Calendar} instance used to initialize this FastDateParser
     */
    private void init(final Calendar definingCalendar) {try{__CLR4_5_2hcyhcylvha7ck2.R.inc(22522);
        __CLR4_5_2hcyhcylvha7ck2.R.inc(22523);patterns = new ArrayList<>();

        __CLR4_5_2hcyhcylvha7ck2.R.inc(22524);final StrategyParser fm = new StrategyParser(definingCalendar);
        __CLR4_5_2hcyhcylvha7ck2.R.inc(22525);for(;;) {{
            __CLR4_5_2hcyhcylvha7ck2.R.inc(22526);final StrategyAndWidth field = fm.getNextStrategy();
            __CLR4_5_2hcyhcylvha7ck2.R.inc(22527);if((((field==null)&&(__CLR4_5_2hcyhcylvha7ck2.R.iget(22528)!=0|true))||(__CLR4_5_2hcyhcylvha7ck2.R.iget(22529)==0&false))) {{
                __CLR4_5_2hcyhcylvha7ck2.R.inc(22530);break;
            }
            }__CLR4_5_2hcyhcylvha7ck2.R.inc(22531);patterns.add(field);
        }
    }}finally{__CLR4_5_2hcyhcylvha7ck2.R.flushNeeded();}}

    // helper classes to parse the format string
    //-----------------------------------------------------------------------

    /**
     * Holds strategy and field width
     */
    private static class StrategyAndWidth {
        final Strategy strategy;
        final int width;

        StrategyAndWidth(final Strategy strategy, final int width) {try{__CLR4_5_2hcyhcylvha7ck2.R.inc(22532);
            __CLR4_5_2hcyhcylvha7ck2.R.inc(22533);this.strategy = strategy;
            __CLR4_5_2hcyhcylvha7ck2.R.inc(22534);this.width = width;
        }finally{__CLR4_5_2hcyhcylvha7ck2.R.flushNeeded();}}

        int getMaxWidth(final ListIterator<StrategyAndWidth> lt) {try{__CLR4_5_2hcyhcylvha7ck2.R.inc(22535);
            __CLR4_5_2hcyhcylvha7ck2.R.inc(22536);if((((!strategy.isNumber() || !lt.hasNext())&&(__CLR4_5_2hcyhcylvha7ck2.R.iget(22537)!=0|true))||(__CLR4_5_2hcyhcylvha7ck2.R.iget(22538)==0&false))) {{
                __CLR4_5_2hcyhcylvha7ck2.R.inc(22539);return 0;
            }
            }__CLR4_5_2hcyhcylvha7ck2.R.inc(22540);final Strategy nextStrategy = lt.next().strategy;
            __CLR4_5_2hcyhcylvha7ck2.R.inc(22541);lt.previous();
            __CLR4_5_2hcyhcylvha7ck2.R.inc(22542);return (((nextStrategy.isNumber() )&&(__CLR4_5_2hcyhcylvha7ck2.R.iget(22543)!=0|true))||(__CLR4_5_2hcyhcylvha7ck2.R.iget(22544)==0&false))?width :0;
       }finally{__CLR4_5_2hcyhcylvha7ck2.R.flushNeeded();}}
    }

    /**
     * Parse format into Strategies
     */
    private class StrategyParser {
        final private Calendar definingCalendar;
        private int currentIdx;

        StrategyParser(final Calendar definingCalendar) {try{__CLR4_5_2hcyhcylvha7ck2.R.inc(22545);
            __CLR4_5_2hcyhcylvha7ck2.R.inc(22546);this.definingCalendar = definingCalendar;
        }finally{__CLR4_5_2hcyhcylvha7ck2.R.flushNeeded();}}

        StrategyAndWidth getNextStrategy() {try{__CLR4_5_2hcyhcylvha7ck2.R.inc(22547);
            __CLR4_5_2hcyhcylvha7ck2.R.inc(22548);if ((((currentIdx >= pattern.length())&&(__CLR4_5_2hcyhcylvha7ck2.R.iget(22549)!=0|true))||(__CLR4_5_2hcyhcylvha7ck2.R.iget(22550)==0&false))) {{
                __CLR4_5_2hcyhcylvha7ck2.R.inc(22551);return null;
            }

            }__CLR4_5_2hcyhcylvha7ck2.R.inc(22552);final char c = pattern.charAt(currentIdx);
            __CLR4_5_2hcyhcylvha7ck2.R.inc(22553);if ((((isFormatLetter(c))&&(__CLR4_5_2hcyhcylvha7ck2.R.iget(22554)!=0|true))||(__CLR4_5_2hcyhcylvha7ck2.R.iget(22555)==0&false))) {{
                __CLR4_5_2hcyhcylvha7ck2.R.inc(22556);return letterPattern(c);
            }
            }__CLR4_5_2hcyhcylvha7ck2.R.inc(22557);return literal();
        }finally{__CLR4_5_2hcyhcylvha7ck2.R.flushNeeded();}}

        private StrategyAndWidth letterPattern(final char c) {try{__CLR4_5_2hcyhcylvha7ck2.R.inc(22558);
            __CLR4_5_2hcyhcylvha7ck2.R.inc(22559);final int begin = currentIdx;
            __CLR4_5_2hcyhcylvha7ck2.R.inc(22560);while ((((++currentIdx < pattern.length())&&(__CLR4_5_2hcyhcylvha7ck2.R.iget(22561)!=0|true))||(__CLR4_5_2hcyhcylvha7ck2.R.iget(22562)==0&false))) {{
                __CLR4_5_2hcyhcylvha7ck2.R.inc(22563);if ((((pattern.charAt(currentIdx) != c)&&(__CLR4_5_2hcyhcylvha7ck2.R.iget(22564)!=0|true))||(__CLR4_5_2hcyhcylvha7ck2.R.iget(22565)==0&false))) {{
                    __CLR4_5_2hcyhcylvha7ck2.R.inc(22566);break;
                }
            }}

            }__CLR4_5_2hcyhcylvha7ck2.R.inc(22567);final int width = currentIdx - begin;
            __CLR4_5_2hcyhcylvha7ck2.R.inc(22568);return new StrategyAndWidth(getStrategy(c, width, definingCalendar), width);
        }finally{__CLR4_5_2hcyhcylvha7ck2.R.flushNeeded();}}

        private StrategyAndWidth literal() {try{__CLR4_5_2hcyhcylvha7ck2.R.inc(22569);
            __CLR4_5_2hcyhcylvha7ck2.R.inc(22570);boolean activeQuote = false;

            __CLR4_5_2hcyhcylvha7ck2.R.inc(22571);final StringBuilder sb = new StringBuilder();
            __CLR4_5_2hcyhcylvha7ck2.R.inc(22572);while ((((currentIdx < pattern.length())&&(__CLR4_5_2hcyhcylvha7ck2.R.iget(22573)!=0|true))||(__CLR4_5_2hcyhcylvha7ck2.R.iget(22574)==0&false))) {{
                __CLR4_5_2hcyhcylvha7ck2.R.inc(22575);final char c = pattern.charAt(currentIdx);
                __CLR4_5_2hcyhcylvha7ck2.R.inc(22576);if ((((!activeQuote && isFormatLetter(c))&&(__CLR4_5_2hcyhcylvha7ck2.R.iget(22577)!=0|true))||(__CLR4_5_2hcyhcylvha7ck2.R.iget(22578)==0&false))) {{
                    __CLR4_5_2hcyhcylvha7ck2.R.inc(22579);break;
                } }else {__CLR4_5_2hcyhcylvha7ck2.R.inc(22580);if ((((c == '\'' && (++currentIdx == pattern.length() || pattern.charAt(currentIdx) != '\''))&&(__CLR4_5_2hcyhcylvha7ck2.R.iget(22581)!=0|true))||(__CLR4_5_2hcyhcylvha7ck2.R.iget(22582)==0&false))) {{
                    __CLR4_5_2hcyhcylvha7ck2.R.inc(22583);activeQuote = !activeQuote;
                    __CLR4_5_2hcyhcylvha7ck2.R.inc(22584);continue;
                }
                }}__CLR4_5_2hcyhcylvha7ck2.R.inc(22585);++currentIdx;
                __CLR4_5_2hcyhcylvha7ck2.R.inc(22586);sb.append(c);
            }

            }__CLR4_5_2hcyhcylvha7ck2.R.inc(22587);if ((((activeQuote)&&(__CLR4_5_2hcyhcylvha7ck2.R.iget(22588)!=0|true))||(__CLR4_5_2hcyhcylvha7ck2.R.iget(22589)==0&false))) {{
                __CLR4_5_2hcyhcylvha7ck2.R.inc(22590);throw new IllegalArgumentException("Unterminated quote");
            }

            }__CLR4_5_2hcyhcylvha7ck2.R.inc(22591);final String formatField = sb.toString();
            __CLR4_5_2hcyhcylvha7ck2.R.inc(22592);return new StrategyAndWidth(new CopyQuotedStrategy(formatField), formatField.length());
        }finally{__CLR4_5_2hcyhcylvha7ck2.R.flushNeeded();}}
    }

    private static boolean isFormatLetter(final char c) {try{__CLR4_5_2hcyhcylvha7ck2.R.inc(22593);
        __CLR4_5_2hcyhcylvha7ck2.R.inc(22594);return c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z';
    }finally{__CLR4_5_2hcyhcylvha7ck2.R.flushNeeded();}}

    // Accessors
    //-----------------------------------------------------------------------
    /* (non-Javadoc)
     * @see org.apache.commons.lang3.time.DateParser#getPattern()
     */
    @Override
    public String getPattern() {try{__CLR4_5_2hcyhcylvha7ck2.R.inc(22595);
        __CLR4_5_2hcyhcylvha7ck2.R.inc(22596);return pattern;
    }finally{__CLR4_5_2hcyhcylvha7ck2.R.flushNeeded();}}

    /* (non-Javadoc)
     * @see org.apache.commons.lang3.time.DateParser#getTimeZone()
     */
    @Override
    public TimeZone getTimeZone() {try{__CLR4_5_2hcyhcylvha7ck2.R.inc(22597);
        __CLR4_5_2hcyhcylvha7ck2.R.inc(22598);return timeZone;
    }finally{__CLR4_5_2hcyhcylvha7ck2.R.flushNeeded();}}

    /* (non-Javadoc)
     * @see org.apache.commons.lang3.time.DateParser#getLocale()
     */
    @Override
    public Locale getLocale() {try{__CLR4_5_2hcyhcylvha7ck2.R.inc(22599);
        __CLR4_5_2hcyhcylvha7ck2.R.inc(22600);return locale;
    }finally{__CLR4_5_2hcyhcylvha7ck2.R.flushNeeded();}}


    // Basics
    //-----------------------------------------------------------------------
    /**
     * <p>Compare another object for equality with this object.</p>
     *
     * @param obj  the object to compare to
     * @return <code>true</code>if equal to this instance
     */
    @Override
    public boolean equals(final Object obj) {try{__CLR4_5_2hcyhcylvha7ck2.R.inc(22601);
        __CLR4_5_2hcyhcylvha7ck2.R.inc(22602);if ((((!(obj instanceof FastDateParser))&&(__CLR4_5_2hcyhcylvha7ck2.R.iget(22603)!=0|true))||(__CLR4_5_2hcyhcylvha7ck2.R.iget(22604)==0&false))) {{
            __CLR4_5_2hcyhcylvha7ck2.R.inc(22605);return false;
        }
        }__CLR4_5_2hcyhcylvha7ck2.R.inc(22606);final FastDateParser other = (FastDateParser) obj;
        __CLR4_5_2hcyhcylvha7ck2.R.inc(22607);return pattern.equals(other.pattern)
            && timeZone.equals(other.timeZone)
            && locale.equals(other.locale);
    }finally{__CLR4_5_2hcyhcylvha7ck2.R.flushNeeded();}}

    /**
     * <p>Return a hash code compatible with equals.</p>
     *
     * @return a hash code compatible with equals
     */
    @Override
    public int hashCode() {try{__CLR4_5_2hcyhcylvha7ck2.R.inc(22608);
        __CLR4_5_2hcyhcylvha7ck2.R.inc(22609);return pattern.hashCode() + 13 * (timeZone.hashCode() + 13 * locale.hashCode());
    }finally{__CLR4_5_2hcyhcylvha7ck2.R.flushNeeded();}}

    /**
     * <p>Get a string version of this formatter.</p>
     *
     * @return a debugging string
     */
    @Override
    public String toString() {try{__CLR4_5_2hcyhcylvha7ck2.R.inc(22610);
        __CLR4_5_2hcyhcylvha7ck2.R.inc(22611);return "FastDateParser[" + pattern + "," + locale + "," + timeZone.getID() + "]";
    }finally{__CLR4_5_2hcyhcylvha7ck2.R.flushNeeded();}}

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
    private void readObject(final ObjectInputStream in) throws IOException, ClassNotFoundException {try{__CLR4_5_2hcyhcylvha7ck2.R.inc(22612);
        __CLR4_5_2hcyhcylvha7ck2.R.inc(22613);in.defaultReadObject();

        __CLR4_5_2hcyhcylvha7ck2.R.inc(22614);final Calendar definingCalendar = Calendar.getInstance(timeZone, locale);
        __CLR4_5_2hcyhcylvha7ck2.R.inc(22615);init(definingCalendar);
    }finally{__CLR4_5_2hcyhcylvha7ck2.R.flushNeeded();}}

    /* (non-Javadoc)
     * @see org.apache.commons.lang3.time.DateParser#parseObject(java.lang.String)
     */
    @Override
    public Object parseObject(final String source) throws ParseException {try{__CLR4_5_2hcyhcylvha7ck2.R.inc(22616);
        __CLR4_5_2hcyhcylvha7ck2.R.inc(22617);return parse(source);
    }finally{__CLR4_5_2hcyhcylvha7ck2.R.flushNeeded();}}

    /* (non-Javadoc)
     * @see org.apache.commons.lang3.time.DateParser#parse(java.lang.String)
     */
    @Override
    public Date parse(final String source) throws ParseException {try{__CLR4_5_2hcyhcylvha7ck2.R.inc(22618);
        __CLR4_5_2hcyhcylvha7ck2.R.inc(22619);final ParsePosition pp = new ParsePosition(0);
        __CLR4_5_2hcyhcylvha7ck2.R.inc(22620);final Date date= parse(source, pp);
        __CLR4_5_2hcyhcylvha7ck2.R.inc(22621);if ((((date == null)&&(__CLR4_5_2hcyhcylvha7ck2.R.iget(22622)!=0|true))||(__CLR4_5_2hcyhcylvha7ck2.R.iget(22623)==0&false))) {{
            // Add a note re supported date range
            __CLR4_5_2hcyhcylvha7ck2.R.inc(22624);if ((((locale.equals(JAPANESE_IMPERIAL))&&(__CLR4_5_2hcyhcylvha7ck2.R.iget(22625)!=0|true))||(__CLR4_5_2hcyhcylvha7ck2.R.iget(22626)==0&false))) {{
                __CLR4_5_2hcyhcylvha7ck2.R.inc(22627);throw new ParseException(
                        "(The " +locale + " locale does not support dates before 1868 AD)\n" +
                                "Unparseable date: \""+source, pp.getErrorIndex());
            }
            }__CLR4_5_2hcyhcylvha7ck2.R.inc(22628);throw new ParseException("Unparseable date: "+source, pp.getErrorIndex());
        }
        }__CLR4_5_2hcyhcylvha7ck2.R.inc(22629);return date;
    }finally{__CLR4_5_2hcyhcylvha7ck2.R.flushNeeded();}}

    /* (non-Javadoc)
     * @see org.apache.commons.lang3.time.DateParser#parseObject(java.lang.String, java.text.ParsePosition)
     */
    @Override
    public Object parseObject(final String source, final ParsePosition pos) {try{__CLR4_5_2hcyhcylvha7ck2.R.inc(22630);
        __CLR4_5_2hcyhcylvha7ck2.R.inc(22631);return parse(source, pos);
    }finally{__CLR4_5_2hcyhcylvha7ck2.R.flushNeeded();}}

    /**
     * This implementation updates the ParsePosition if the parse succeeds.
     * However, it sets the error index to the position before the failed field unlike 
     * the method {@link java.text.SimpleDateFormat#parse(String, ParsePosition)} which sets 
     * the error index to after the failed field.
     * <p>
     * To determine if the parse has succeeded, the caller must check if the current parse position
     * given by {@link ParsePosition#getIndex()} has been updated. If the input buffer has been fully
     * parsed, then the index will point to just after the end of the input buffer.
     *
     * @see org.apache.commons.lang3.time.DateParser#parse(java.lang.String, java.text.ParsePosition)
     */
    @Override
    public Date parse(final String source, final ParsePosition pos) {try{__CLR4_5_2hcyhcylvha7ck2.R.inc(22632);
        // timing tests indicate getting new instance is 19% faster than cloning
        __CLR4_5_2hcyhcylvha7ck2.R.inc(22633);final Calendar cal= Calendar.getInstance(timeZone, locale);
        __CLR4_5_2hcyhcylvha7ck2.R.inc(22634);cal.clear();

        __CLR4_5_2hcyhcylvha7ck2.R.inc(22635);return (((parse(source, pos, cal) )&&(__CLR4_5_2hcyhcylvha7ck2.R.iget(22636)!=0|true))||(__CLR4_5_2hcyhcylvha7ck2.R.iget(22637)==0&false))? cal.getTime() : null;
    }finally{__CLR4_5_2hcyhcylvha7ck2.R.flushNeeded();}}

    /**
     * Parse a formatted date string according to the format.  Updates the Calendar with parsed fields.
     * Upon success, the ParsePosition index is updated to indicate how much of the source text was consumed.
     * Not all source text needs to be consumed.  Upon parse failure, ParsePosition error index is updated to
     * the offset of the source text which does not match the supplied format.
     * 
     * @param source The text to parse.
     * @param pos On input, the position in the source to start parsing, on output, updated position.
     * @param calendar The calendar into which to set parsed fields.
     * @return true, if source has been parsed (pos parsePosition is updated); otherwise false (and pos errorIndex is updated)
     * @throws IllegalArgumentException when Calendar has been set to be not lenient, and a parsed field is
     * out of range.
     */
    @Override
    public boolean parse(final String source, final ParsePosition pos, final Calendar calendar) {try{__CLR4_5_2hcyhcylvha7ck2.R.inc(22638);
        __CLR4_5_2hcyhcylvha7ck2.R.inc(22639);final ListIterator<StrategyAndWidth> lt = patterns.listIterator();
        __CLR4_5_2hcyhcylvha7ck2.R.inc(22640);while ((((lt.hasNext())&&(__CLR4_5_2hcyhcylvha7ck2.R.iget(22641)!=0|true))||(__CLR4_5_2hcyhcylvha7ck2.R.iget(22642)==0&false))) {{
            __CLR4_5_2hcyhcylvha7ck2.R.inc(22643);final StrategyAndWidth strategyAndWidth = lt.next();
            __CLR4_5_2hcyhcylvha7ck2.R.inc(22644);final int maxWidth = strategyAndWidth.getMaxWidth(lt);
            __CLR4_5_2hcyhcylvha7ck2.R.inc(22645);if ((((!strategyAndWidth.strategy.parse(this, calendar, source, pos, maxWidth))&&(__CLR4_5_2hcyhcylvha7ck2.R.iget(22646)!=0|true))||(__CLR4_5_2hcyhcylvha7ck2.R.iget(22647)==0&false))) {{
                __CLR4_5_2hcyhcylvha7ck2.R.inc(22648);return false;
            }
        }}
        }__CLR4_5_2hcyhcylvha7ck2.R.inc(22649);return true;
    }finally{__CLR4_5_2hcyhcylvha7ck2.R.flushNeeded();}}

    // Support for strategies
    //-----------------------------------------------------------------------

    private static StringBuilder simpleQuote(final StringBuilder sb, final String value) {try{__CLR4_5_2hcyhcylvha7ck2.R.inc(22650);
        __CLR4_5_2hcyhcylvha7ck2.R.inc(22651);for (int i = 0; (((i < value.length())&&(__CLR4_5_2hcyhcylvha7ck2.R.iget(22652)!=0|true))||(__CLR4_5_2hcyhcylvha7ck2.R.iget(22653)==0&false)); ++i) {{
            __CLR4_5_2hcyhcylvha7ck2.R.inc(22654);final char c = value.charAt(i);
            boolean __CLB4_5_2_bool0=false;__CLR4_5_2hcyhcylvha7ck2.R.inc(22655);switch (c) {
            case '\\':if (!__CLB4_5_2_bool0) {__CLR4_5_2hcyhcylvha7ck2.R.inc(22656);__CLB4_5_2_bool0=true;}
            case '^':if (!__CLB4_5_2_bool0) {__CLR4_5_2hcyhcylvha7ck2.R.inc(22657);__CLB4_5_2_bool0=true;}
            case '$':if (!__CLB4_5_2_bool0) {__CLR4_5_2hcyhcylvha7ck2.R.inc(22658);__CLB4_5_2_bool0=true;}
            case '.':if (!__CLB4_5_2_bool0) {__CLR4_5_2hcyhcylvha7ck2.R.inc(22659);__CLB4_5_2_bool0=true;}
            case '|':if (!__CLB4_5_2_bool0) {__CLR4_5_2hcyhcylvha7ck2.R.inc(22660);__CLB4_5_2_bool0=true;}
            case '?':if (!__CLB4_5_2_bool0) {__CLR4_5_2hcyhcylvha7ck2.R.inc(22661);__CLB4_5_2_bool0=true;}
            case '*':if (!__CLB4_5_2_bool0) {__CLR4_5_2hcyhcylvha7ck2.R.inc(22662);__CLB4_5_2_bool0=true;}
            case '+':if (!__CLB4_5_2_bool0) {__CLR4_5_2hcyhcylvha7ck2.R.inc(22663);__CLB4_5_2_bool0=true;}
            case '(':if (!__CLB4_5_2_bool0) {__CLR4_5_2hcyhcylvha7ck2.R.inc(22664);__CLB4_5_2_bool0=true;}
            case ')':if (!__CLB4_5_2_bool0) {__CLR4_5_2hcyhcylvha7ck2.R.inc(22665);__CLB4_5_2_bool0=true;}
            case '[':if (!__CLB4_5_2_bool0) {__CLR4_5_2hcyhcylvha7ck2.R.inc(22666);__CLB4_5_2_bool0=true;}
            case '{':if (!__CLB4_5_2_bool0) {__CLR4_5_2hcyhcylvha7ck2.R.inc(22667);__CLB4_5_2_bool0=true;}
                __CLR4_5_2hcyhcylvha7ck2.R.inc(22668);sb.append('\\');
            default:if (!__CLB4_5_2_bool0) {__CLR4_5_2hcyhcylvha7ck2.R.inc(22669);__CLB4_5_2_bool0=true;}
                __CLR4_5_2hcyhcylvha7ck2.R.inc(22670);sb.append(c);
            }
        }
        }__CLR4_5_2hcyhcylvha7ck2.R.inc(22671);return sb;
    }finally{__CLR4_5_2hcyhcylvha7ck2.R.flushNeeded();}}

    /**
     * Get the short and long values displayed for a field
     * @param cal The calendar to obtain the short and long values
     * @param locale The locale of display names
     * @param field The field of interest
     * @param regex The regular expression to build
     * @return The map of string display names to field values
     */
    private static Map<String, Integer> appendDisplayNames(final Calendar cal, final Locale locale, final int field, final StringBuilder regex) {try{__CLR4_5_2hcyhcylvha7ck2.R.inc(22672);
        __CLR4_5_2hcyhcylvha7ck2.R.inc(22673);final Map<String, Integer> values = new HashMap<>();

        __CLR4_5_2hcyhcylvha7ck2.R.inc(22674);final Map<String, Integer> displayNames = cal.getDisplayNames(field, Calendar.ALL_STYLES, locale);
        __CLR4_5_2hcyhcylvha7ck2.R.inc(22675);final TreeSet<String> sorted = new TreeSet<>(LONGER_FIRST_LOWERCASE);
        __CLR4_5_2hcyhcylvha7ck2.R.inc(22676);for (final Map.Entry<String, Integer> displayName : displayNames.entrySet()) {{
            __CLR4_5_2hcyhcylvha7ck2.R.inc(22677);final String key = displayName.getKey().toLowerCase(locale);
            __CLR4_5_2hcyhcylvha7ck2.R.inc(22678);if ((((sorted.add(key))&&(__CLR4_5_2hcyhcylvha7ck2.R.iget(22679)!=0|true))||(__CLR4_5_2hcyhcylvha7ck2.R.iget(22680)==0&false))) {{
                __CLR4_5_2hcyhcylvha7ck2.R.inc(22681);values.put(key, displayName.getValue());
            }
        }}
        }__CLR4_5_2hcyhcylvha7ck2.R.inc(22682);for (final String symbol : sorted) {{
            __CLR4_5_2hcyhcylvha7ck2.R.inc(22683);simpleQuote(regex, symbol).append('|');
        }
        }__CLR4_5_2hcyhcylvha7ck2.R.inc(22684);return values;
    }finally{__CLR4_5_2hcyhcylvha7ck2.R.flushNeeded();}}

    /**
     * Adjust dates to be within appropriate century
     * @param twoDigitYear The year to adjust
     * @return A value between centuryStart(inclusive) to centuryStart+100(exclusive)
     */
    private int adjustYear(final int twoDigitYear) {try{__CLR4_5_2hcyhcylvha7ck2.R.inc(22685);
        __CLR4_5_2hcyhcylvha7ck2.R.inc(22686);final int trial = century + twoDigitYear;
        __CLR4_5_2hcyhcylvha7ck2.R.inc(22687);return (((twoDigitYear >= startYear )&&(__CLR4_5_2hcyhcylvha7ck2.R.iget(22688)!=0|true))||(__CLR4_5_2hcyhcylvha7ck2.R.iget(22689)==0&false))? trial : trial + 100;
    }finally{__CLR4_5_2hcyhcylvha7ck2.R.flushNeeded();}}

    /**
     * A strategy to parse a single field from the parsing pattern
     */
    private static abstract class Strategy {
        /**
         * Is this field a number?
         * The default implementation returns false.
         *
         * @return true, if field is a number
         */
        boolean isNumber() {try{__CLR4_5_2hcyhcylvha7ck2.R.inc(22690);
            __CLR4_5_2hcyhcylvha7ck2.R.inc(22691);return false;
        }finally{__CLR4_5_2hcyhcylvha7ck2.R.flushNeeded();}}

        abstract boolean parse(FastDateParser parser, Calendar calendar, String source, ParsePosition pos, int maxWidth);
    }

    /**
     * A strategy to parse a single field from the parsing pattern
     */
    private static abstract class PatternStrategy extends Strategy {

        private Pattern pattern;

        void createPattern(final StringBuilder regex) {try{__CLR4_5_2hcyhcylvha7ck2.R.inc(22692);
            __CLR4_5_2hcyhcylvha7ck2.R.inc(22693);createPattern(regex.toString());
        }finally{__CLR4_5_2hcyhcylvha7ck2.R.flushNeeded();}}

        void createPattern(final String regex) {try{__CLR4_5_2hcyhcylvha7ck2.R.inc(22694);
            __CLR4_5_2hcyhcylvha7ck2.R.inc(22695);this.pattern = Pattern.compile(regex);
        }finally{__CLR4_5_2hcyhcylvha7ck2.R.flushNeeded();}}

        /**
         * Is this field a number?
         * The default implementation returns false.
         *
         * @return true, if field is a number
         */
        @Override
        boolean isNumber() {try{__CLR4_5_2hcyhcylvha7ck2.R.inc(22696);
            __CLR4_5_2hcyhcylvha7ck2.R.inc(22697);return false;
        }finally{__CLR4_5_2hcyhcylvha7ck2.R.flushNeeded();}}

        @Override
        boolean parse(final FastDateParser parser, final Calendar calendar, final String source, final ParsePosition pos, final int maxWidth) {try{__CLR4_5_2hcyhcylvha7ck2.R.inc(22698);
            __CLR4_5_2hcyhcylvha7ck2.R.inc(22699);final Matcher matcher = pattern.matcher(source.substring(pos.getIndex()));
            __CLR4_5_2hcyhcylvha7ck2.R.inc(22700);if ((((!matcher.lookingAt())&&(__CLR4_5_2hcyhcylvha7ck2.R.iget(22701)!=0|true))||(__CLR4_5_2hcyhcylvha7ck2.R.iget(22702)==0&false))) {{
                __CLR4_5_2hcyhcylvha7ck2.R.inc(22703);pos.setErrorIndex(pos.getIndex());
                __CLR4_5_2hcyhcylvha7ck2.R.inc(22704);return false;
            }
            }__CLR4_5_2hcyhcylvha7ck2.R.inc(22705);pos.setIndex(pos.getIndex() + matcher.end(1));
            __CLR4_5_2hcyhcylvha7ck2.R.inc(22706);setCalendar(parser, calendar, matcher.group(1));
            __CLR4_5_2hcyhcylvha7ck2.R.inc(22707);return true;
        }finally{__CLR4_5_2hcyhcylvha7ck2.R.flushNeeded();}}

        abstract void setCalendar(FastDateParser parser, Calendar cal, String value);
    }

    /**
     * Obtain a Strategy given a field from a SimpleDateFormat pattern
     * @param f A sub-sequence of the SimpleDateFormat pattern
     * @param definingCalendar The calendar to obtain the short and long values
     * @return The Strategy that will handle parsing for the field
     */
    private Strategy getStrategy(final char f, final int width, final Calendar definingCalendar) {try{__CLR4_5_2hcyhcylvha7ck2.R.inc(22708);
        boolean __CLB4_5_2_bool1=false;__CLR4_5_2hcyhcylvha7ck2.R.inc(22709);switch(f) {
        default:if (!__CLB4_5_2_bool1) {__CLR4_5_2hcyhcylvha7ck2.R.inc(22710);__CLB4_5_2_bool1=true;}
            __CLR4_5_2hcyhcylvha7ck2.R.inc(22711);throw new IllegalArgumentException("Format '"+f+"' not supported");
        case 'D':if (!__CLB4_5_2_bool1) {__CLR4_5_2hcyhcylvha7ck2.R.inc(22712);__CLB4_5_2_bool1=true;}
            __CLR4_5_2hcyhcylvha7ck2.R.inc(22713);return DAY_OF_YEAR_STRATEGY;
        case 'E':if (!__CLB4_5_2_bool1) {__CLR4_5_2hcyhcylvha7ck2.R.inc(22714);__CLB4_5_2_bool1=true;}
            __CLR4_5_2hcyhcylvha7ck2.R.inc(22715);return getLocaleSpecificStrategy(Calendar.DAY_OF_WEEK, definingCalendar);
        case 'F':if (!__CLB4_5_2_bool1) {__CLR4_5_2hcyhcylvha7ck2.R.inc(22716);__CLB4_5_2_bool1=true;}
            __CLR4_5_2hcyhcylvha7ck2.R.inc(22717);return DAY_OF_WEEK_IN_MONTH_STRATEGY;
        case 'G':if (!__CLB4_5_2_bool1) {__CLR4_5_2hcyhcylvha7ck2.R.inc(22718);__CLB4_5_2_bool1=true;}
            __CLR4_5_2hcyhcylvha7ck2.R.inc(22719);return getLocaleSpecificStrategy(Calendar.ERA, definingCalendar);
        case 'H':if (!__CLB4_5_2_bool1) {__CLR4_5_2hcyhcylvha7ck2.R.inc(22720);__CLB4_5_2_bool1=true;}  // Hour in day (0-23)
            __CLR4_5_2hcyhcylvha7ck2.R.inc(22721);return HOUR_OF_DAY_STRATEGY;
        case 'K':if (!__CLB4_5_2_bool1) {__CLR4_5_2hcyhcylvha7ck2.R.inc(22722);__CLB4_5_2_bool1=true;}  // Hour in am/pm (0-11) 
            __CLR4_5_2hcyhcylvha7ck2.R.inc(22723);return HOUR_STRATEGY;
        case 'M':if (!__CLB4_5_2_bool1) {__CLR4_5_2hcyhcylvha7ck2.R.inc(22724);__CLB4_5_2_bool1=true;}
            __CLR4_5_2hcyhcylvha7ck2.R.inc(22725);return (((width>=3 )&&(__CLR4_5_2hcyhcylvha7ck2.R.iget(22726)!=0|true))||(__CLR4_5_2hcyhcylvha7ck2.R.iget(22727)==0&false))?getLocaleSpecificStrategy(Calendar.MONTH, definingCalendar) :NUMBER_MONTH_STRATEGY;
        case 'S':if (!__CLB4_5_2_bool1) {__CLR4_5_2hcyhcylvha7ck2.R.inc(22728);__CLB4_5_2_bool1=true;}
            __CLR4_5_2hcyhcylvha7ck2.R.inc(22729);return MILLISECOND_STRATEGY;
        case 'W':if (!__CLB4_5_2_bool1) {__CLR4_5_2hcyhcylvha7ck2.R.inc(22730);__CLB4_5_2_bool1=true;}
            __CLR4_5_2hcyhcylvha7ck2.R.inc(22731);return WEEK_OF_MONTH_STRATEGY;
        case 'a':if (!__CLB4_5_2_bool1) {__CLR4_5_2hcyhcylvha7ck2.R.inc(22732);__CLB4_5_2_bool1=true;}
            __CLR4_5_2hcyhcylvha7ck2.R.inc(22733);return getLocaleSpecificStrategy(Calendar.AM_PM, definingCalendar);
        case 'd':if (!__CLB4_5_2_bool1) {__CLR4_5_2hcyhcylvha7ck2.R.inc(22734);__CLB4_5_2_bool1=true;}
            __CLR4_5_2hcyhcylvha7ck2.R.inc(22735);return DAY_OF_MONTH_STRATEGY;
        case 'h':if (!__CLB4_5_2_bool1) {__CLR4_5_2hcyhcylvha7ck2.R.inc(22736);__CLB4_5_2_bool1=true;}  // Hour in am/pm (1-12), i.e. midday/midnight is 12, not 0
            __CLR4_5_2hcyhcylvha7ck2.R.inc(22737);return HOUR12_STRATEGY;
        case 'k':if (!__CLB4_5_2_bool1) {__CLR4_5_2hcyhcylvha7ck2.R.inc(22738);__CLB4_5_2_bool1=true;}  // Hour in day (1-24), i.e. midnight is 24, not 0
            __CLR4_5_2hcyhcylvha7ck2.R.inc(22739);return HOUR24_OF_DAY_STRATEGY;
        case 'm':if (!__CLB4_5_2_bool1) {__CLR4_5_2hcyhcylvha7ck2.R.inc(22740);__CLB4_5_2_bool1=true;}
            __CLR4_5_2hcyhcylvha7ck2.R.inc(22741);return MINUTE_STRATEGY;
        case 's':if (!__CLB4_5_2_bool1) {__CLR4_5_2hcyhcylvha7ck2.R.inc(22742);__CLB4_5_2_bool1=true;}
            __CLR4_5_2hcyhcylvha7ck2.R.inc(22743);return SECOND_STRATEGY;
        case 'u':if (!__CLB4_5_2_bool1) {__CLR4_5_2hcyhcylvha7ck2.R.inc(22744);__CLB4_5_2_bool1=true;}
            __CLR4_5_2hcyhcylvha7ck2.R.inc(22745);return DAY_OF_WEEK_STRATEGY;
        case 'w':if (!__CLB4_5_2_bool1) {__CLR4_5_2hcyhcylvha7ck2.R.inc(22746);__CLB4_5_2_bool1=true;}
            __CLR4_5_2hcyhcylvha7ck2.R.inc(22747);return WEEK_OF_YEAR_STRATEGY;
        case 'y':if (!__CLB4_5_2_bool1) {__CLR4_5_2hcyhcylvha7ck2.R.inc(22748);__CLB4_5_2_bool1=true;}
        case 'Y':if (!__CLB4_5_2_bool1) {__CLR4_5_2hcyhcylvha7ck2.R.inc(22749);__CLB4_5_2_bool1=true;}
            __CLR4_5_2hcyhcylvha7ck2.R.inc(22750);return (((width>2 )&&(__CLR4_5_2hcyhcylvha7ck2.R.iget(22751)!=0|true))||(__CLR4_5_2hcyhcylvha7ck2.R.iget(22752)==0&false))?LITERAL_YEAR_STRATEGY :ABBREVIATED_YEAR_STRATEGY;
        case 'X':if (!__CLB4_5_2_bool1) {__CLR4_5_2hcyhcylvha7ck2.R.inc(22753);__CLB4_5_2_bool1=true;}
            __CLR4_5_2hcyhcylvha7ck2.R.inc(22754);return ISO8601TimeZoneStrategy.getStrategy(width);
        case 'Z':if (!__CLB4_5_2_bool1) {__CLR4_5_2hcyhcylvha7ck2.R.inc(22755);__CLB4_5_2_bool1=true;}
            __CLR4_5_2hcyhcylvha7ck2.R.inc(22756);if ((((width==2)&&(__CLR4_5_2hcyhcylvha7ck2.R.iget(22757)!=0|true))||(__CLR4_5_2hcyhcylvha7ck2.R.iget(22758)==0&false))) {{
                __CLR4_5_2hcyhcylvha7ck2.R.inc(22759);return ISO8601TimeZoneStrategy.ISO_8601_3_STRATEGY;
            }
            //$FALL-THROUGH$
        }case 'z':if (!__CLB4_5_2_bool1) {__CLR4_5_2hcyhcylvha7ck2.R.inc(22760);__CLB4_5_2_bool1=true;}
            __CLR4_5_2hcyhcylvha7ck2.R.inc(22761);return getLocaleSpecificStrategy(Calendar.ZONE_OFFSET, definingCalendar);
        }
    }finally{__CLR4_5_2hcyhcylvha7ck2.R.flushNeeded();}}

    @SuppressWarnings("unchecked") // OK because we are creating an array with no entries
    private static final ConcurrentMap<Locale, Strategy>[] caches = new ConcurrentMap[Calendar.FIELD_COUNT];

    /**
     * Get a cache of Strategies for a particular field
     * @param field The Calendar field
     * @return a cache of Locale to Strategy
     */
    private static ConcurrentMap<Locale, Strategy> getCache(final int field) {try{__CLR4_5_2hcyhcylvha7ck2.R.inc(22762);
        __CLR4_5_2hcyhcylvha7ck2.R.inc(22763);synchronized (caches) {
            __CLR4_5_2hcyhcylvha7ck2.R.inc(22764);if ((((caches[field] == null)&&(__CLR4_5_2hcyhcylvha7ck2.R.iget(22765)!=0|true))||(__CLR4_5_2hcyhcylvha7ck2.R.iget(22766)==0&false))) {{
                __CLR4_5_2hcyhcylvha7ck2.R.inc(22767);caches[field] = new ConcurrentHashMap<>(3);
            }
            }__CLR4_5_2hcyhcylvha7ck2.R.inc(22768);return caches[field];
        }
    }finally{__CLR4_5_2hcyhcylvha7ck2.R.flushNeeded();}}

    /**
     * Construct a Strategy that parses a Text field
     * @param field The Calendar field
     * @param definingCalendar The calendar to obtain the short and long values
     * @return a TextStrategy for the field and Locale
     */
    private Strategy getLocaleSpecificStrategy(final int field, final Calendar definingCalendar) {try{__CLR4_5_2hcyhcylvha7ck2.R.inc(22769);
        __CLR4_5_2hcyhcylvha7ck2.R.inc(22770);final ConcurrentMap<Locale, Strategy> cache = getCache(field);
        __CLR4_5_2hcyhcylvha7ck2.R.inc(22771);Strategy strategy = cache.get(locale);
        __CLR4_5_2hcyhcylvha7ck2.R.inc(22772);if ((((strategy == null)&&(__CLR4_5_2hcyhcylvha7ck2.R.iget(22773)!=0|true))||(__CLR4_5_2hcyhcylvha7ck2.R.iget(22774)==0&false))) {{
            __CLR4_5_2hcyhcylvha7ck2.R.inc(22775);strategy = (((field == Calendar.ZONE_OFFSET 
                    )&&(__CLR4_5_2hcyhcylvha7ck2.R.iget(22776)!=0|true))||(__CLR4_5_2hcyhcylvha7ck2.R.iget(22777)==0&false))? new TimeZoneStrategy(locale)
                    : new CaseInsensitiveTextStrategy(field, definingCalendar, locale);
            __CLR4_5_2hcyhcylvha7ck2.R.inc(22778);final Strategy inCache = cache.putIfAbsent(locale, strategy);
            __CLR4_5_2hcyhcylvha7ck2.R.inc(22779);if ((((inCache != null)&&(__CLR4_5_2hcyhcylvha7ck2.R.iget(22780)!=0|true))||(__CLR4_5_2hcyhcylvha7ck2.R.iget(22781)==0&false))) {{
                __CLR4_5_2hcyhcylvha7ck2.R.inc(22782);return inCache;
            }
        }}
        }__CLR4_5_2hcyhcylvha7ck2.R.inc(22783);return strategy;
    }finally{__CLR4_5_2hcyhcylvha7ck2.R.flushNeeded();}}

    /**
     * A strategy that copies the static or quoted field in the parsing pattern
     */
    private static class CopyQuotedStrategy extends Strategy {

        final private String formatField;

        /**
         * Construct a Strategy that ensures the formatField has literal text
         * @param formatField The literal text to match
         */
        CopyQuotedStrategy(final String formatField) {try{__CLR4_5_2hcyhcylvha7ck2.R.inc(22784);
            __CLR4_5_2hcyhcylvha7ck2.R.inc(22785);this.formatField = formatField;
        }finally{__CLR4_5_2hcyhcylvha7ck2.R.flushNeeded();}}

        /**
         * {@inheritDoc}
         */
        @Override
        boolean isNumber() {try{__CLR4_5_2hcyhcylvha7ck2.R.inc(22786);
            __CLR4_5_2hcyhcylvha7ck2.R.inc(22787);return false;
        }finally{__CLR4_5_2hcyhcylvha7ck2.R.flushNeeded();}}

        @Override
        boolean parse(final FastDateParser parser, final Calendar calendar, final String source, final ParsePosition pos, final int maxWidth) {try{__CLR4_5_2hcyhcylvha7ck2.R.inc(22788);
            __CLR4_5_2hcyhcylvha7ck2.R.inc(22789);for (int idx = 0; (((idx < formatField.length())&&(__CLR4_5_2hcyhcylvha7ck2.R.iget(22790)!=0|true))||(__CLR4_5_2hcyhcylvha7ck2.R.iget(22791)==0&false)); ++idx) {{
                __CLR4_5_2hcyhcylvha7ck2.R.inc(22792);final int sIdx = idx + pos.getIndex();
                __CLR4_5_2hcyhcylvha7ck2.R.inc(22793);if ((((sIdx == source.length())&&(__CLR4_5_2hcyhcylvha7ck2.R.iget(22794)!=0|true))||(__CLR4_5_2hcyhcylvha7ck2.R.iget(22795)==0&false))) {{
                    __CLR4_5_2hcyhcylvha7ck2.R.inc(22796);pos.setErrorIndex(sIdx);
                    __CLR4_5_2hcyhcylvha7ck2.R.inc(22797);return false;
                }
                }__CLR4_5_2hcyhcylvha7ck2.R.inc(22798);if ((((formatField.charAt(idx) != source.charAt(sIdx))&&(__CLR4_5_2hcyhcylvha7ck2.R.iget(22799)!=0|true))||(__CLR4_5_2hcyhcylvha7ck2.R.iget(22800)==0&false))) {{
                    __CLR4_5_2hcyhcylvha7ck2.R.inc(22801);pos.setErrorIndex(sIdx);
                    __CLR4_5_2hcyhcylvha7ck2.R.inc(22802);return false;
                }
            }}
            }__CLR4_5_2hcyhcylvha7ck2.R.inc(22803);pos.setIndex(formatField.length() + pos.getIndex());
            __CLR4_5_2hcyhcylvha7ck2.R.inc(22804);return true;
        }finally{__CLR4_5_2hcyhcylvha7ck2.R.flushNeeded();}}
    }

    /**
     * A strategy that handles a text field in the parsing pattern
     */
     private static class CaseInsensitiveTextStrategy extends PatternStrategy {
        private final int field;
        final Locale locale;
        private final Map<String, Integer> lKeyValues;

        /**
         * Construct a Strategy that parses a Text field
         * @param field  The Calendar field
         * @param definingCalendar  The Calendar to use
         * @param locale  The Locale to use
         */
        CaseInsensitiveTextStrategy(final int field, final Calendar definingCalendar, final Locale locale) {try{__CLR4_5_2hcyhcylvha7ck2.R.inc(22805);
            __CLR4_5_2hcyhcylvha7ck2.R.inc(22806);this.field = field;
            __CLR4_5_2hcyhcylvha7ck2.R.inc(22807);this.locale = locale;
            
            __CLR4_5_2hcyhcylvha7ck2.R.inc(22808);final StringBuilder regex = new StringBuilder();
            __CLR4_5_2hcyhcylvha7ck2.R.inc(22809);regex.append("((?iu)");
            __CLR4_5_2hcyhcylvha7ck2.R.inc(22810);lKeyValues = appendDisplayNames(definingCalendar, locale, field, regex);
            __CLR4_5_2hcyhcylvha7ck2.R.inc(22811);regex.setLength(regex.length()-1);
            __CLR4_5_2hcyhcylvha7ck2.R.inc(22812);regex.append(")");
            __CLR4_5_2hcyhcylvha7ck2.R.inc(22813);createPattern(regex);
        }finally{__CLR4_5_2hcyhcylvha7ck2.R.flushNeeded();}}

        /**
         * {@inheritDoc}
         */
        @Override
        void setCalendar(final FastDateParser parser, final Calendar cal, final String value) {try{__CLR4_5_2hcyhcylvha7ck2.R.inc(22814);
            __CLR4_5_2hcyhcylvha7ck2.R.inc(22815);final Integer iVal = lKeyValues.get(value.toLowerCase(locale));
            __CLR4_5_2hcyhcylvha7ck2.R.inc(22816);cal.set(field, iVal.intValue());
        }finally{__CLR4_5_2hcyhcylvha7ck2.R.flushNeeded();}}
    }


    /**
     * A strategy that handles a number field in the parsing pattern
     */
    private static class NumberStrategy extends Strategy {
        private final int field;

        /**
         * Construct a Strategy that parses a Number field
         * @param field The Calendar field
         */
        NumberStrategy(final int field) {try{__CLR4_5_2hcyhcylvha7ck2.R.inc(22817);
             __CLR4_5_2hcyhcylvha7ck2.R.inc(22818);this.field= field;
        }finally{__CLR4_5_2hcyhcylvha7ck2.R.flushNeeded();}}

        /**
         * {@inheritDoc}
         */
        @Override
        boolean isNumber() {try{__CLR4_5_2hcyhcylvha7ck2.R.inc(22819);
            __CLR4_5_2hcyhcylvha7ck2.R.inc(22820);return true;
        }finally{__CLR4_5_2hcyhcylvha7ck2.R.flushNeeded();}}

        @Override
        boolean parse(final FastDateParser parser, final Calendar calendar, final String source, final ParsePosition pos, final int maxWidth) {try{__CLR4_5_2hcyhcylvha7ck2.R.inc(22821);
            __CLR4_5_2hcyhcylvha7ck2.R.inc(22822);int idx = pos.getIndex();
            __CLR4_5_2hcyhcylvha7ck2.R.inc(22823);int last = source.length();

            __CLR4_5_2hcyhcylvha7ck2.R.inc(22824);if ((((maxWidth == 0)&&(__CLR4_5_2hcyhcylvha7ck2.R.iget(22825)!=0|true))||(__CLR4_5_2hcyhcylvha7ck2.R.iget(22826)==0&false))) {{
                // if no maxWidth, strip leading white space
                __CLR4_5_2hcyhcylvha7ck2.R.inc(22827);for (; (((idx < last)&&(__CLR4_5_2hcyhcylvha7ck2.R.iget(22828)!=0|true))||(__CLR4_5_2hcyhcylvha7ck2.R.iget(22829)==0&false)); ++idx) {{
                    __CLR4_5_2hcyhcylvha7ck2.R.inc(22830);final char c = source.charAt(idx);
                    __CLR4_5_2hcyhcylvha7ck2.R.inc(22831);if ((((!Character.isWhitespace(c))&&(__CLR4_5_2hcyhcylvha7ck2.R.iget(22832)!=0|true))||(__CLR4_5_2hcyhcylvha7ck2.R.iget(22833)==0&false))) {{
                        __CLR4_5_2hcyhcylvha7ck2.R.inc(22834);break;
                    }
                }}
                }__CLR4_5_2hcyhcylvha7ck2.R.inc(22835);pos.setIndex(idx);
            } }else {{
                __CLR4_5_2hcyhcylvha7ck2.R.inc(22836);final int end = idx + maxWidth;
                __CLR4_5_2hcyhcylvha7ck2.R.inc(22837);if ((((last > end)&&(__CLR4_5_2hcyhcylvha7ck2.R.iget(22838)!=0|true))||(__CLR4_5_2hcyhcylvha7ck2.R.iget(22839)==0&false))) {{
                    __CLR4_5_2hcyhcylvha7ck2.R.inc(22840);last = end;
                }
            }}

            }__CLR4_5_2hcyhcylvha7ck2.R.inc(22841);for (; (((idx < last)&&(__CLR4_5_2hcyhcylvha7ck2.R.iget(22842)!=0|true))||(__CLR4_5_2hcyhcylvha7ck2.R.iget(22843)==0&false)); ++idx) {{
                __CLR4_5_2hcyhcylvha7ck2.R.inc(22844);final char c = source.charAt(idx);
                __CLR4_5_2hcyhcylvha7ck2.R.inc(22845);if ((((!Character.isDigit(c))&&(__CLR4_5_2hcyhcylvha7ck2.R.iget(22846)!=0|true))||(__CLR4_5_2hcyhcylvha7ck2.R.iget(22847)==0&false))) {{
                    __CLR4_5_2hcyhcylvha7ck2.R.inc(22848);break;
                }
            }}

            }__CLR4_5_2hcyhcylvha7ck2.R.inc(22849);if ((((pos.getIndex() == idx)&&(__CLR4_5_2hcyhcylvha7ck2.R.iget(22850)!=0|true))||(__CLR4_5_2hcyhcylvha7ck2.R.iget(22851)==0&false))) {{
                __CLR4_5_2hcyhcylvha7ck2.R.inc(22852);pos.setErrorIndex(idx);
                __CLR4_5_2hcyhcylvha7ck2.R.inc(22853);return false;
            }

            }__CLR4_5_2hcyhcylvha7ck2.R.inc(22854);final int value = Integer.parseInt(source.substring(pos.getIndex(), idx));
            __CLR4_5_2hcyhcylvha7ck2.R.inc(22855);pos.setIndex(idx);

            __CLR4_5_2hcyhcylvha7ck2.R.inc(22856);calendar.set(field, modify(parser, value));
            __CLR4_5_2hcyhcylvha7ck2.R.inc(22857);return true;
        }finally{__CLR4_5_2hcyhcylvha7ck2.R.flushNeeded();}}

        /**
         * Make any modifications to parsed integer
         * @param parser The parser
         * @param iValue The parsed integer
         * @return The modified value
         */
        int modify(final FastDateParser parser, final int iValue) {try{__CLR4_5_2hcyhcylvha7ck2.R.inc(22858);
            __CLR4_5_2hcyhcylvha7ck2.R.inc(22859);return iValue;
        }finally{__CLR4_5_2hcyhcylvha7ck2.R.flushNeeded();}}

    }

    private static final Strategy ABBREVIATED_YEAR_STRATEGY = new NumberStrategy(Calendar.YEAR) {
        /**
         * {@inheritDoc}
         */
        @Override
        int modify(final FastDateParser parser, final int iValue) {try{__CLR4_5_2hcyhcylvha7ck2.R.inc(22860);
            __CLR4_5_2hcyhcylvha7ck2.R.inc(22861);return (((iValue < 100 )&&(__CLR4_5_2hcyhcylvha7ck2.R.iget(22862)!=0|true))||(__CLR4_5_2hcyhcylvha7ck2.R.iget(22863)==0&false))? parser.adjustYear(iValue) : iValue;
        }finally{__CLR4_5_2hcyhcylvha7ck2.R.flushNeeded();}}
    };

    /**
     * A strategy that handles a timezone field in the parsing pattern
     */
    static class TimeZoneStrategy extends PatternStrategy {
        private static final String RFC_822_TIME_ZONE = "[+-]\\d{4}";
        private static final String GMT_OPTION= "GMT[+-]\\d{1,2}:\\d{2}";

        private final Locale locale;
        private final Map<String, TzInfo> tzNames= new HashMap<>();

        private static class TzInfo {
            TimeZone zone;
            int dstOffset;

            TzInfo(final TimeZone tz, final boolean useDst) {try{__CLR4_5_2hcyhcylvha7ck2.R.inc(22864);
                __CLR4_5_2hcyhcylvha7ck2.R.inc(22865);zone = tz;
                __CLR4_5_2hcyhcylvha7ck2.R.inc(22866);dstOffset = (((useDst )&&(__CLR4_5_2hcyhcylvha7ck2.R.iget(22867)!=0|true))||(__CLR4_5_2hcyhcylvha7ck2.R.iget(22868)==0&false))?tz.getDSTSavings() :0;
            }finally{__CLR4_5_2hcyhcylvha7ck2.R.flushNeeded();}}
        }

        /**
         * Index of zone id
         */
        private static final int ID = 0;

        /**
         * Construct a Strategy that parses a TimeZone
         * @param locale The Locale
         */
        TimeZoneStrategy(final Locale locale) {try{__CLR4_5_2hcyhcylvha7ck2.R.inc(22869);
            __CLR4_5_2hcyhcylvha7ck2.R.inc(22870);this.locale = locale;

            __CLR4_5_2hcyhcylvha7ck2.R.inc(22871);final StringBuilder sb = new StringBuilder();
            __CLR4_5_2hcyhcylvha7ck2.R.inc(22872);sb.append("((?iu)" + RFC_822_TIME_ZONE + "|" + GMT_OPTION );

            __CLR4_5_2hcyhcylvha7ck2.R.inc(22873);final Set<String> sorted = new TreeSet<>(LONGER_FIRST_LOWERCASE);

            __CLR4_5_2hcyhcylvha7ck2.R.inc(22874);final String[][] zones = DateFormatSymbols.getInstance(locale).getZoneStrings();
            __CLR4_5_2hcyhcylvha7ck2.R.inc(22875);for (final String[] zoneNames : zones) {{
                // offset 0 is the time zone ID and is not localized
                __CLR4_5_2hcyhcylvha7ck2.R.inc(22876);final String tzId = zoneNames[ID];
                __CLR4_5_2hcyhcylvha7ck2.R.inc(22877);if ((((tzId.equalsIgnoreCase("GMT"))&&(__CLR4_5_2hcyhcylvha7ck2.R.iget(22878)!=0|true))||(__CLR4_5_2hcyhcylvha7ck2.R.iget(22879)==0&false))) {{
                    __CLR4_5_2hcyhcylvha7ck2.R.inc(22880);continue;
                }
                }__CLR4_5_2hcyhcylvha7ck2.R.inc(22881);final TimeZone tz = TimeZone.getTimeZone(tzId);
                // offset 1 is long standard name
                // offset 2 is short standard name
                __CLR4_5_2hcyhcylvha7ck2.R.inc(22882);final TzInfo standard = new TzInfo(tz, false);
                __CLR4_5_2hcyhcylvha7ck2.R.inc(22883);TzInfo tzInfo = standard;
                __CLR4_5_2hcyhcylvha7ck2.R.inc(22884);for (int i = 1; (((i < zoneNames.length)&&(__CLR4_5_2hcyhcylvha7ck2.R.iget(22885)!=0|true))||(__CLR4_5_2hcyhcylvha7ck2.R.iget(22886)==0&false)); ++i) {{
                    boolean __CLB4_5_2_bool2=false;__CLR4_5_2hcyhcylvha7ck2.R.inc(22887);switch (i) {
                    case 3:if (!__CLB4_5_2_bool2) {__CLR4_5_2hcyhcylvha7ck2.R.inc(22888);__CLB4_5_2_bool2=true;} // offset 3 is long daylight savings (or summertime) name
                            // offset 4 is the short summertime name
                        __CLR4_5_2hcyhcylvha7ck2.R.inc(22889);tzInfo = new TzInfo(tz, true);
                        __CLR4_5_2hcyhcylvha7ck2.R.inc(22890);break;
                    case 5:if (!__CLB4_5_2_bool2) {__CLR4_5_2hcyhcylvha7ck2.R.inc(22891);__CLB4_5_2_bool2=true;} // offset 5 starts additional names, probably standard time
                        __CLR4_5_2hcyhcylvha7ck2.R.inc(22892);tzInfo = standard;
                        __CLR4_5_2hcyhcylvha7ck2.R.inc(22893);break;
                    default:if (!__CLB4_5_2_bool2) {__CLR4_5_2hcyhcylvha7ck2.R.inc(22894);__CLB4_5_2_bool2=true;}
                        __CLR4_5_2hcyhcylvha7ck2.R.inc(22895);break;
                    }
                    __CLR4_5_2hcyhcylvha7ck2.R.inc(22896);if ((((zoneNames[i] != null)&&(__CLR4_5_2hcyhcylvha7ck2.R.iget(22897)!=0|true))||(__CLR4_5_2hcyhcylvha7ck2.R.iget(22898)==0&false))) {{
                        __CLR4_5_2hcyhcylvha7ck2.R.inc(22899);final String key = zoneNames[i].toLowerCase(locale);
                        // ignore the data associated with duplicates supplied in
                        // the additional names
                        __CLR4_5_2hcyhcylvha7ck2.R.inc(22900);if ((((sorted.add(key))&&(__CLR4_5_2hcyhcylvha7ck2.R.iget(22901)!=0|true))||(__CLR4_5_2hcyhcylvha7ck2.R.iget(22902)==0&false))) {{
                            __CLR4_5_2hcyhcylvha7ck2.R.inc(22903);tzNames.put(key, tzInfo);
                        }
                    }}
                }}
            }}
            // order the regex alternatives with longer strings first, greedy
            // match will ensure longest string will be consumed
            }__CLR4_5_2hcyhcylvha7ck2.R.inc(22904);for (final String zoneName : sorted) {{
                __CLR4_5_2hcyhcylvha7ck2.R.inc(22905);simpleQuote(sb.append('|'), zoneName);
            }
            }__CLR4_5_2hcyhcylvha7ck2.R.inc(22906);sb.append(")");
            __CLR4_5_2hcyhcylvha7ck2.R.inc(22907);createPattern(sb);
        }finally{__CLR4_5_2hcyhcylvha7ck2.R.flushNeeded();}}

        /**
         * {@inheritDoc}
         */
        @Override
        void setCalendar(final FastDateParser parser, final Calendar cal, final String value) {try{__CLR4_5_2hcyhcylvha7ck2.R.inc(22908);
            __CLR4_5_2hcyhcylvha7ck2.R.inc(22909);if ((((value.charAt(0) == '+' || value.charAt(0) == '-')&&(__CLR4_5_2hcyhcylvha7ck2.R.iget(22910)!=0|true))||(__CLR4_5_2hcyhcylvha7ck2.R.iget(22911)==0&false))) {{
                __CLR4_5_2hcyhcylvha7ck2.R.inc(22912);final TimeZone tz = TimeZone.getTimeZone("GMT" + value);
                __CLR4_5_2hcyhcylvha7ck2.R.inc(22913);cal.setTimeZone(tz);
            } }else {__CLR4_5_2hcyhcylvha7ck2.R.inc(22914);if ((((value.regionMatches(true, 0, "GMT", 0, 3))&&(__CLR4_5_2hcyhcylvha7ck2.R.iget(22915)!=0|true))||(__CLR4_5_2hcyhcylvha7ck2.R.iget(22916)==0&false))) {{
                __CLR4_5_2hcyhcylvha7ck2.R.inc(22917);final TimeZone tz = TimeZone.getTimeZone(value.toUpperCase());
                __CLR4_5_2hcyhcylvha7ck2.R.inc(22918);cal.setTimeZone(tz);
            } }else {{
                __CLR4_5_2hcyhcylvha7ck2.R.inc(22919);final TzInfo tzInfo = tzNames.get(value.toLowerCase(locale));
                __CLR4_5_2hcyhcylvha7ck2.R.inc(22920);cal.set(Calendar.DST_OFFSET, tzInfo.dstOffset);
                __CLR4_5_2hcyhcylvha7ck2.R.inc(22921);cal.set(Calendar.ZONE_OFFSET, tzInfo.zone.getRawOffset());
            }
        }}}finally{__CLR4_5_2hcyhcylvha7ck2.R.flushNeeded();}}
    }
    
    private static class ISO8601TimeZoneStrategy extends PatternStrategy {
        // Z, +hh, -hh, +hhmm, -hhmm, +hh:mm or -hh:mm 

        /**
         * Construct a Strategy that parses a TimeZone
         * @param pattern The Pattern
         */
        ISO8601TimeZoneStrategy(final String pattern) {try{__CLR4_5_2hcyhcylvha7ck2.R.inc(22922);
            __CLR4_5_2hcyhcylvha7ck2.R.inc(22923);createPattern(pattern);
        }finally{__CLR4_5_2hcyhcylvha7ck2.R.flushNeeded();}}
        
        /**
         * {@inheritDoc}
         */
        @Override
        void setCalendar(final FastDateParser parser, final Calendar cal, final String value) {try{__CLR4_5_2hcyhcylvha7ck2.R.inc(22924);
            __CLR4_5_2hcyhcylvha7ck2.R.inc(22925);if ((((value.equals("Z"))&&(__CLR4_5_2hcyhcylvha7ck2.R.iget(22926)!=0|true))||(__CLR4_5_2hcyhcylvha7ck2.R.iget(22927)==0&false))) {{
                __CLR4_5_2hcyhcylvha7ck2.R.inc(22928);cal.setTimeZone(TimeZone.getTimeZone("UTC"));
            } }else {{
                __CLR4_5_2hcyhcylvha7ck2.R.inc(22929);cal.setTimeZone(TimeZone.getTimeZone("GMT" + value));
            }
        }}finally{__CLR4_5_2hcyhcylvha7ck2.R.flushNeeded();}}
        
        private static final Strategy ISO_8601_1_STRATEGY = new ISO8601TimeZoneStrategy("(Z|(?:[+-]\\d{2}))");
        private static final Strategy ISO_8601_2_STRATEGY = new ISO8601TimeZoneStrategy("(Z|(?:[+-]\\d{2}\\d{2}))");
        private static final Strategy ISO_8601_3_STRATEGY = new ISO8601TimeZoneStrategy("(Z|(?:[+-]\\d{2}(?::)\\d{2}))");

        /**
         * Factory method for ISO8601TimeZoneStrategies.
         * 
         * @param tokenLen a token indicating the length of the TimeZone String to be formatted.
         * @return a ISO8601TimeZoneStrategy that can format TimeZone String of length {@code tokenLen}. If no such
         *          strategy exists, an IllegalArgumentException will be thrown.
         */
        static Strategy getStrategy(final int tokenLen) {try{__CLR4_5_2hcyhcylvha7ck2.R.inc(22930);
            boolean __CLB4_5_2_bool3=false;__CLR4_5_2hcyhcylvha7ck2.R.inc(22931);switch(tokenLen) {
            case 1:if (!__CLB4_5_2_bool3) {__CLR4_5_2hcyhcylvha7ck2.R.inc(22932);__CLB4_5_2_bool3=true;}
                __CLR4_5_2hcyhcylvha7ck2.R.inc(22933);return ISO_8601_1_STRATEGY;
            case 2:if (!__CLB4_5_2_bool3) {__CLR4_5_2hcyhcylvha7ck2.R.inc(22934);__CLB4_5_2_bool3=true;}
                __CLR4_5_2hcyhcylvha7ck2.R.inc(22935);return ISO_8601_2_STRATEGY;
            case 3:if (!__CLB4_5_2_bool3) {__CLR4_5_2hcyhcylvha7ck2.R.inc(22936);__CLB4_5_2_bool3=true;}
                __CLR4_5_2hcyhcylvha7ck2.R.inc(22937);return ISO_8601_3_STRATEGY;
            default:if (!__CLB4_5_2_bool3) {__CLR4_5_2hcyhcylvha7ck2.R.inc(22938);__CLB4_5_2_bool3=true;}
                __CLR4_5_2hcyhcylvha7ck2.R.inc(22939);throw new IllegalArgumentException("invalid number of X");
            }
        }finally{__CLR4_5_2hcyhcylvha7ck2.R.flushNeeded();}}
    }

    private static final Strategy NUMBER_MONTH_STRATEGY = new NumberStrategy(Calendar.MONTH) {
        @Override
        int modify(final FastDateParser parser, final int iValue) {try{__CLR4_5_2hcyhcylvha7ck2.R.inc(22940);
            __CLR4_5_2hcyhcylvha7ck2.R.inc(22941);return iValue-1;
        }finally{__CLR4_5_2hcyhcylvha7ck2.R.flushNeeded();}}
    };
    private static final Strategy LITERAL_YEAR_STRATEGY = new NumberStrategy(Calendar.YEAR);
    private static final Strategy WEEK_OF_YEAR_STRATEGY = new NumberStrategy(Calendar.WEEK_OF_YEAR);
    private static final Strategy WEEK_OF_MONTH_STRATEGY = new NumberStrategy(Calendar.WEEK_OF_MONTH);
    private static final Strategy DAY_OF_YEAR_STRATEGY = new NumberStrategy(Calendar.DAY_OF_YEAR);
    private static final Strategy DAY_OF_MONTH_STRATEGY = new NumberStrategy(Calendar.DAY_OF_MONTH);
    private static final Strategy DAY_OF_WEEK_STRATEGY = new NumberStrategy(Calendar.DAY_OF_WEEK) {
        @Override
        int modify(final FastDateParser parser, final int iValue) {try{__CLR4_5_2hcyhcylvha7ck2.R.inc(22942);
            __CLR4_5_2hcyhcylvha7ck2.R.inc(22943);return (((iValue != 7 )&&(__CLR4_5_2hcyhcylvha7ck2.R.iget(22944)!=0|true))||(__CLR4_5_2hcyhcylvha7ck2.R.iget(22945)==0&false))? iValue + 1 : Calendar.SUNDAY;
        }finally{__CLR4_5_2hcyhcylvha7ck2.R.flushNeeded();}}
    };
    private static final Strategy DAY_OF_WEEK_IN_MONTH_STRATEGY = new NumberStrategy(Calendar.DAY_OF_WEEK_IN_MONTH);
    private static final Strategy HOUR_OF_DAY_STRATEGY = new NumberStrategy(Calendar.HOUR_OF_DAY);
    private static final Strategy HOUR24_OF_DAY_STRATEGY = new NumberStrategy(Calendar.HOUR_OF_DAY) {
        @Override
        int modify(final FastDateParser parser, final int iValue) {try{__CLR4_5_2hcyhcylvha7ck2.R.inc(22946);
            __CLR4_5_2hcyhcylvha7ck2.R.inc(22947);return (((iValue == 24 )&&(__CLR4_5_2hcyhcylvha7ck2.R.iget(22948)!=0|true))||(__CLR4_5_2hcyhcylvha7ck2.R.iget(22949)==0&false))? 0 : iValue;
        }finally{__CLR4_5_2hcyhcylvha7ck2.R.flushNeeded();}}
    };
    private static final Strategy HOUR12_STRATEGY = new NumberStrategy(Calendar.HOUR) {
        @Override
        int modify(final FastDateParser parser, final int iValue) {try{__CLR4_5_2hcyhcylvha7ck2.R.inc(22950);
            __CLR4_5_2hcyhcylvha7ck2.R.inc(22951);return (((iValue == 12 )&&(__CLR4_5_2hcyhcylvha7ck2.R.iget(22952)!=0|true))||(__CLR4_5_2hcyhcylvha7ck2.R.iget(22953)==0&false))? 0 : iValue;
        }finally{__CLR4_5_2hcyhcylvha7ck2.R.flushNeeded();}}
    };
    private static final Strategy HOUR_STRATEGY = new NumberStrategy(Calendar.HOUR);
    private static final Strategy MINUTE_STRATEGY = new NumberStrategy(Calendar.MINUTE);
    private static final Strategy SECOND_STRATEGY = new NumberStrategy(Calendar.SECOND);
    private static final Strategy MILLISECOND_STRATEGY = new NumberStrategy(Calendar.MILLISECOND);
}
