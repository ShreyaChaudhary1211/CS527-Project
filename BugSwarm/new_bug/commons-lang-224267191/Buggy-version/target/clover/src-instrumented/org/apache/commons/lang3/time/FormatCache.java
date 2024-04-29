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
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

import org.apache.commons.lang3.Validate;

/**
 * <p>FormatCache is a cache and factory for {@link Format}s.</p>
 * 
 * @since 3.0
 */
// TODO: Before making public move from getDateTimeInstance(Integer,...) to int; or some other approach.
abstract class FormatCache<F extends Format> {public static class __CLR4_5_2i6li6llvha7cpu{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172755542L,8589935092L,23643,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    
    /**
     * No date or no time.  Used in same parameters as DateFormat.SHORT or DateFormat.LONG
     */
    static final int NONE= -1;
    
    private final ConcurrentMap<MultipartKey, F> cInstanceCache 
        = new ConcurrentHashMap<>(7);
    
    private static final ConcurrentMap<MultipartKey, String> cDateTimeInstanceCache 
        = new ConcurrentHashMap<>(7);

    /**
     * <p>Gets a formatter instance using the default pattern in the
     * default timezone and locale.</p>
     * 
     * @return a date/time formatter
     */
    public F getInstance() {try{__CLR4_5_2i6li6llvha7cpu.R.inc(23565);
        __CLR4_5_2i6li6llvha7cpu.R.inc(23566);return getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT, TimeZone.getDefault(), Locale.getDefault());
    }finally{__CLR4_5_2i6li6llvha7cpu.R.flushNeeded();}}

    /**
     * <p>Gets a formatter instance using the specified pattern, time zone
     * and locale.</p>
     * 
     * @param pattern  {@link java.text.SimpleDateFormat} compatible
     *  pattern, non-null
     * @param timeZone  the time zone, null means use the default TimeZone
     * @param locale  the locale, null means use the default Locale
     * @return a pattern based date/time formatter
     * @throws IllegalArgumentException if pattern is invalid
     *  or <code>null</code>
     */
    public F getInstance(final String pattern, TimeZone timeZone, Locale locale) {try{__CLR4_5_2i6li6llvha7cpu.R.inc(23567);
        __CLR4_5_2i6li6llvha7cpu.R.inc(23568);Validate.notNull(pattern, "pattern must not be null");
        __CLR4_5_2i6li6llvha7cpu.R.inc(23569);if ((((timeZone == null)&&(__CLR4_5_2i6li6llvha7cpu.R.iget(23570)!=0|true))||(__CLR4_5_2i6li6llvha7cpu.R.iget(23571)==0&false))) {{
            __CLR4_5_2i6li6llvha7cpu.R.inc(23572);timeZone = TimeZone.getDefault();
        }
        }__CLR4_5_2i6li6llvha7cpu.R.inc(23573);if ((((locale == null)&&(__CLR4_5_2i6li6llvha7cpu.R.iget(23574)!=0|true))||(__CLR4_5_2i6li6llvha7cpu.R.iget(23575)==0&false))) {{
            __CLR4_5_2i6li6llvha7cpu.R.inc(23576);locale = Locale.getDefault();
        }
        }__CLR4_5_2i6li6llvha7cpu.R.inc(23577);final MultipartKey key = new MultipartKey(pattern, timeZone, locale);
        __CLR4_5_2i6li6llvha7cpu.R.inc(23578);F format = cInstanceCache.get(key);
        __CLR4_5_2i6li6llvha7cpu.R.inc(23579);if ((((format == null)&&(__CLR4_5_2i6li6llvha7cpu.R.iget(23580)!=0|true))||(__CLR4_5_2i6li6llvha7cpu.R.iget(23581)==0&false))) {{           
            __CLR4_5_2i6li6llvha7cpu.R.inc(23582);format = createInstance(pattern, timeZone, locale);
            __CLR4_5_2i6li6llvha7cpu.R.inc(23583);final F previousValue= cInstanceCache.putIfAbsent(key, format);
            __CLR4_5_2i6li6llvha7cpu.R.inc(23584);if ((((previousValue != null)&&(__CLR4_5_2i6li6llvha7cpu.R.iget(23585)!=0|true))||(__CLR4_5_2i6li6llvha7cpu.R.iget(23586)==0&false))) {{
                // another thread snuck in and did the same work
                // we should return the instance that is in ConcurrentMap
                __CLR4_5_2i6li6llvha7cpu.R.inc(23587);format= previousValue;              
            }
        }}
        }__CLR4_5_2i6li6llvha7cpu.R.inc(23588);return format;
    }finally{__CLR4_5_2i6li6llvha7cpu.R.flushNeeded();}}
    
    /**
     * <p>Create a format instance using the specified pattern, time zone
     * and locale.</p>
     * 
     * @param pattern  {@link java.text.SimpleDateFormat} compatible pattern, this will not be null.
     * @param timeZone  time zone, this will not be null.
     * @param locale  locale, this will not be null.
     * @return a pattern based date/time formatter
     * @throws IllegalArgumentException if pattern is invalid
     *  or <code>null</code>
     */
    abstract protected F createInstance(String pattern, TimeZone timeZone, Locale locale);
        
    /**
     * <p>Gets a date/time formatter instance using the specified style,
     * time zone and locale.</p>
     * 
     * @param dateStyle  date style: FULL, LONG, MEDIUM, or SHORT, null indicates no date in format
     * @param timeStyle  time style: FULL, LONG, MEDIUM, or SHORT, null indicates no time in format
     * @param timeZone  optional time zone, overrides time zone of
     *  formatted date, null means use default Locale
     * @param locale  optional locale, overrides system locale
     * @return a localized standard date/time formatter
     * @throws IllegalArgumentException if the Locale has no date/time
     *  pattern defined
     */
    // This must remain private, see LANG-884 
    private F getDateTimeInstance(final Integer dateStyle, final Integer timeStyle, final TimeZone timeZone, Locale locale) {try{__CLR4_5_2i6li6llvha7cpu.R.inc(23589);
        __CLR4_5_2i6li6llvha7cpu.R.inc(23590);if ((((locale == null)&&(__CLR4_5_2i6li6llvha7cpu.R.iget(23591)!=0|true))||(__CLR4_5_2i6li6llvha7cpu.R.iget(23592)==0&false))) {{
            __CLR4_5_2i6li6llvha7cpu.R.inc(23593);locale = Locale.getDefault();
        }
        }__CLR4_5_2i6li6llvha7cpu.R.inc(23594);final String pattern = getPatternForStyle(dateStyle, timeStyle, locale);
        __CLR4_5_2i6li6llvha7cpu.R.inc(23595);return getInstance(pattern, timeZone, locale);
    }finally{__CLR4_5_2i6li6llvha7cpu.R.flushNeeded();}}

    /**
     * <p>Gets a date/time formatter instance using the specified style,
     * time zone and locale.</p>
     * 
     * @param dateStyle  date style: FULL, LONG, MEDIUM, or SHORT
     * @param timeStyle  time style: FULL, LONG, MEDIUM, or SHORT
     * @param timeZone  optional time zone, overrides time zone of
     *  formatted date, null means use default Locale
     * @param locale  optional locale, overrides system locale
     * @return a localized standard date/time formatter
     * @throws IllegalArgumentException if the Locale has no date/time
     *  pattern defined
     */
    // package protected, for access from FastDateFormat; do not make public or protected
    F getDateTimeInstance(final int dateStyle, final int timeStyle, final TimeZone timeZone, final Locale locale) {try{__CLR4_5_2i6li6llvha7cpu.R.inc(23596);
        __CLR4_5_2i6li6llvha7cpu.R.inc(23597);return getDateTimeInstance(Integer.valueOf(dateStyle), Integer.valueOf(timeStyle), timeZone, locale);
    }finally{__CLR4_5_2i6li6llvha7cpu.R.flushNeeded();}}

    /**
     * <p>Gets a date formatter instance using the specified style,
     * time zone and locale.</p>
     * 
     * @param dateStyle  date style: FULL, LONG, MEDIUM, or SHORT
     * @param timeZone  optional time zone, overrides time zone of
     *  formatted date, null means use default Locale
     * @param locale  optional locale, overrides system locale
     * @return a localized standard date/time formatter
     * @throws IllegalArgumentException if the Locale has no date/time
     *  pattern defined
     */
    // package protected, for access from FastDateFormat; do not make public or protected
    F getDateInstance(final int dateStyle, final TimeZone timeZone, final Locale locale) {try{__CLR4_5_2i6li6llvha7cpu.R.inc(23598);
        __CLR4_5_2i6li6llvha7cpu.R.inc(23599);return getDateTimeInstance(Integer.valueOf(dateStyle), null, timeZone, locale);
    }finally{__CLR4_5_2i6li6llvha7cpu.R.flushNeeded();}}

    /**
     * <p>Gets a time formatter instance using the specified style,
     * time zone and locale.</p>
     * 
     * @param timeStyle  time style: FULL, LONG, MEDIUM, or SHORT
     * @param timeZone  optional time zone, overrides time zone of
     *  formatted date, null means use default Locale
     * @param locale  optional locale, overrides system locale
     * @return a localized standard date/time formatter
     * @throws IllegalArgumentException if the Locale has no date/time
     *  pattern defined
     */
    // package protected, for access from FastDateFormat; do not make public or protected
    F getTimeInstance(final int timeStyle, final TimeZone timeZone, final Locale locale) {try{__CLR4_5_2i6li6llvha7cpu.R.inc(23600);
        __CLR4_5_2i6li6llvha7cpu.R.inc(23601);return getDateTimeInstance(null, Integer.valueOf(timeStyle), timeZone, locale);
    }finally{__CLR4_5_2i6li6llvha7cpu.R.flushNeeded();}}

    /**
     * <p>Gets a date/time format for the specified styles and locale.</p>
     * 
     * @param dateStyle  date style: FULL, LONG, MEDIUM, or SHORT, null indicates no date in format
     * @param timeStyle  time style: FULL, LONG, MEDIUM, or SHORT, null indicates no time in format
     * @param locale  The non-null locale of the desired format
     * @return a localized standard date/time format
     * @throws IllegalArgumentException if the Locale has no date/time pattern defined
     */
    // package protected, for access from test code; do not make public or protected
    static String getPatternForStyle(final Integer dateStyle, final Integer timeStyle, final Locale locale) {try{__CLR4_5_2i6li6llvha7cpu.R.inc(23602);
        __CLR4_5_2i6li6llvha7cpu.R.inc(23603);final MultipartKey key = new MultipartKey(dateStyle, timeStyle, locale);

        __CLR4_5_2i6li6llvha7cpu.R.inc(23604);String pattern = cDateTimeInstanceCache.get(key);
        __CLR4_5_2i6li6llvha7cpu.R.inc(23605);if ((((pattern == null)&&(__CLR4_5_2i6li6llvha7cpu.R.iget(23606)!=0|true))||(__CLR4_5_2i6li6llvha7cpu.R.iget(23607)==0&false))) {{
            __CLR4_5_2i6li6llvha7cpu.R.inc(23608);try {
                __CLR4_5_2i6li6llvha7cpu.R.inc(23609);DateFormat formatter;
                __CLR4_5_2i6li6llvha7cpu.R.inc(23610);if ((((dateStyle == null)&&(__CLR4_5_2i6li6llvha7cpu.R.iget(23611)!=0|true))||(__CLR4_5_2i6li6llvha7cpu.R.iget(23612)==0&false))) {{
                    __CLR4_5_2i6li6llvha7cpu.R.inc(23613);formatter = DateFormat.getTimeInstance(timeStyle.intValue(), locale);                    
                }
                }else {__CLR4_5_2i6li6llvha7cpu.R.inc(23614);if ((((timeStyle == null)&&(__CLR4_5_2i6li6llvha7cpu.R.iget(23615)!=0|true))||(__CLR4_5_2i6li6llvha7cpu.R.iget(23616)==0&false))) {{
                    __CLR4_5_2i6li6llvha7cpu.R.inc(23617);formatter = DateFormat.getDateInstance(dateStyle.intValue(), locale);                    
                }
                }else {{
                    __CLR4_5_2i6li6llvha7cpu.R.inc(23618);formatter = DateFormat.getDateTimeInstance(dateStyle.intValue(), timeStyle.intValue(), locale);
                }
                }}__CLR4_5_2i6li6llvha7cpu.R.inc(23619);pattern = ((SimpleDateFormat)formatter).toPattern();
                __CLR4_5_2i6li6llvha7cpu.R.inc(23620);final String previous = cDateTimeInstanceCache.putIfAbsent(key, pattern);
                __CLR4_5_2i6li6llvha7cpu.R.inc(23621);if ((((previous != null)&&(__CLR4_5_2i6li6llvha7cpu.R.iget(23622)!=0|true))||(__CLR4_5_2i6li6llvha7cpu.R.iget(23623)==0&false))) {{
                    // even though it doesn't matter if another thread put the pattern
                    // it's still good practice to return the String instance that is
                    // actually in the ConcurrentMap
                    __CLR4_5_2i6li6llvha7cpu.R.inc(23624);pattern= previous;
                }
            }} catch (final ClassCastException ex) {
                __CLR4_5_2i6li6llvha7cpu.R.inc(23625);throw new IllegalArgumentException("No date time pattern for locale: " + locale);
            }
        }
        }__CLR4_5_2i6li6llvha7cpu.R.inc(23626);return pattern;
    }finally{__CLR4_5_2i6li6llvha7cpu.R.flushNeeded();}}

    // ----------------------------------------------------------------------
    /**
     * <p>Helper class to hold multi-part Map keys</p>
     */
    private static class MultipartKey {
        private final Object[] keys;
        private int hashCode;

        /**
         * Constructs an instance of <code>MultipartKey</code> to hold the specified objects.
         * @param keys the set of objects that make up the key.  Each key may be null.
         */
        public MultipartKey(final Object... keys) {try{__CLR4_5_2i6li6llvha7cpu.R.inc(23627);
            __CLR4_5_2i6li6llvha7cpu.R.inc(23628);this.keys = keys;
        }finally{__CLR4_5_2i6li6llvha7cpu.R.flushNeeded();}}

        /**
         * {@inheritDoc}
         */
        @Override
        public boolean equals(final Object obj) {try{__CLR4_5_2i6li6llvha7cpu.R.inc(23629);
            // Eliminate the usual boilerplate because
            // this inner static class is only used in a generic ConcurrentHashMap
            // which will not compare against other Object types
            __CLR4_5_2i6li6llvha7cpu.R.inc(23630);return Arrays.equals(keys, ((MultipartKey)obj).keys);
        }finally{__CLR4_5_2i6li6llvha7cpu.R.flushNeeded();}}

        /**
         * {@inheritDoc}
         */
        @Override
        public int hashCode() {try{__CLR4_5_2i6li6llvha7cpu.R.inc(23631);
            __CLR4_5_2i6li6llvha7cpu.R.inc(23632);if((((hashCode==0)&&(__CLR4_5_2i6li6llvha7cpu.R.iget(23633)!=0|true))||(__CLR4_5_2i6li6llvha7cpu.R.iget(23634)==0&false))) {{
                __CLR4_5_2i6li6llvha7cpu.R.inc(23635);int rc= 0;
                __CLR4_5_2i6li6llvha7cpu.R.inc(23636);for(final Object key : keys) {{
                    __CLR4_5_2i6li6llvha7cpu.R.inc(23637);if((((key!=null)&&(__CLR4_5_2i6li6llvha7cpu.R.iget(23638)!=0|true))||(__CLR4_5_2i6li6llvha7cpu.R.iget(23639)==0&false))) {{
                        __CLR4_5_2i6li6llvha7cpu.R.inc(23640);rc= rc*7 + key.hashCode();
                    }
                }}
                }__CLR4_5_2i6li6llvha7cpu.R.inc(23641);hashCode= rc;
            }
            }__CLR4_5_2i6li6llvha7cpu.R.inc(23642);return hashCode;
        }finally{__CLR4_5_2i6li6llvha7cpu.R.flushNeeded();}}
    }

}
