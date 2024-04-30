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
package org.apache.commons.lang3.text;

import static java.util.FormattableFlags.LEFT_JUSTIFY;

import java.util.Formattable;
import java.util.Formatter;

import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.Validate;

/**
 * <p>Provides utilities for working with the {@code Formattable} interface.</p>
 * 
 * <p>The {@link Formattable} interface provides basic control over formatting
 * when using a {@code Formatter}. It is primarily concerned with numeric precision
 * and padding, and is not designed to allow generalised alternate formats.</p>
 * 
 * @since Lang 3.0
 * @deprecated as of 3.6, use commons-text
 * <a href="https://commons.apache.org/proper/commons-text/javadocs/api-release/org/apache/commons/text/FormattableUtils.html">
 * FormattableUtils</a> instead
 */
@Deprecated
public class FormattableUtils {public static class __CLR4_5_2ed2ed2lvha7biz{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172755542L,8589935092L,18641,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * A format that simply outputs the value as a string.
     */
    private static final String SIMPLEST_FORMAT = "%s";

    /**
     * <p>{@code FormattableUtils} instances should NOT be constructed in
     * standard programming. Instead, the methods of the class should be invoked
     * statically.</p>
     * 
     * <p>This constructor is public to permit tools that require a JavaBean
     * instance to operate.</p>
     */
    public FormattableUtils() {
        super();__CLR4_5_2ed2ed2lvha7biz.R.inc(18615);try{__CLR4_5_2ed2ed2lvha7biz.R.inc(18614);
    }finally{__CLR4_5_2ed2ed2lvha7biz.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Get the default formatted representation of the specified
     * {@code Formattable}.
     * 
     * @param formattable  the instance to convert to a string, not null
     * @return the resulting string, not null
     */
    public static String toString(final Formattable formattable) {try{__CLR4_5_2ed2ed2lvha7biz.R.inc(18616);
        __CLR4_5_2ed2ed2lvha7biz.R.inc(18617);return String.format(SIMPLEST_FORMAT, formattable);
    }finally{__CLR4_5_2ed2ed2lvha7biz.R.flushNeeded();}}

    /**
     * Handles the common {@code Formattable} operations of truncate-pad-append,
     * with no ellipsis on precision overflow, and padding width underflow with
     * spaces.
     * 
     * @param seq  the string to handle, not null
     * @param formatter  the destination formatter, not null
     * @param flags  the flags for formatting, see {@code Formattable}
     * @param width  the width of the output, see {@code Formattable}
     * @param precision  the precision of the output, see {@code Formattable}
     * @return the {@code formatter} instance, not null
     */
    public static Formatter append(final CharSequence seq, final Formatter formatter, final int flags, final int width,
            final int precision) {try{__CLR4_5_2ed2ed2lvha7biz.R.inc(18618);
        __CLR4_5_2ed2ed2lvha7biz.R.inc(18619);return append(seq, formatter, flags, width, precision, ' ', null);
    }finally{__CLR4_5_2ed2ed2lvha7biz.R.flushNeeded();}}

    /**
     * Handles the common {@link Formattable} operations of truncate-pad-append,
     * with no ellipsis on precision overflow.
     * 
     * @param seq  the string to handle, not null
     * @param formatter  the destination formatter, not null
     * @param flags  the flags for formatting, see {@code Formattable}
     * @param width  the width of the output, see {@code Formattable}
     * @param precision  the precision of the output, see {@code Formattable}
     * @param padChar  the pad character to use
     * @return the {@code formatter} instance, not null
     */
    public static Formatter append(final CharSequence seq, final Formatter formatter, final int flags, final int width,
            final int precision, final char padChar) {try{__CLR4_5_2ed2ed2lvha7biz.R.inc(18620);
        __CLR4_5_2ed2ed2lvha7biz.R.inc(18621);return append(seq, formatter, flags, width, precision, padChar, null);
    }finally{__CLR4_5_2ed2ed2lvha7biz.R.flushNeeded();}}

    /**
     * Handles the common {@link Formattable} operations of truncate-pad-append,
     * padding width underflow with spaces.
     * 
     * @param seq  the string to handle, not null
     * @param formatter  the destination formatter, not null
     * @param flags  the flags for formatting, see {@code Formattable}
     * @param width  the width of the output, see {@code Formattable}
     * @param precision  the precision of the output, see {@code Formattable}
     * @param ellipsis  the ellipsis to use when precision dictates truncation, null or
     *  empty causes a hard truncation
     * @return the {@code formatter} instance, not null
     */
    public static Formatter append(final CharSequence seq, final Formatter formatter, final int flags, final int width,
            final int precision, final CharSequence ellipsis) {try{__CLR4_5_2ed2ed2lvha7biz.R.inc(18622);
        __CLR4_5_2ed2ed2lvha7biz.R.inc(18623);return append(seq, formatter, flags, width, precision, ' ', ellipsis);
    }finally{__CLR4_5_2ed2ed2lvha7biz.R.flushNeeded();}}

    /**
     * Handles the common {@link Formattable} operations of truncate-pad-append.
     * 
     * @param seq  the string to handle, not null
     * @param formatter  the destination formatter, not null
     * @param flags  the flags for formatting, see {@code Formattable}
     * @param width  the width of the output, see {@code Formattable}
     * @param precision  the precision of the output, see {@code Formattable}
     * @param padChar  the pad character to use
     * @param ellipsis  the ellipsis to use when precision dictates truncation, null or
     *  empty causes a hard truncation
     * @return the {@code formatter} instance, not null
     */
    public static Formatter append(final CharSequence seq, final Formatter formatter, final int flags, final int width,
            final int precision, final char padChar, final CharSequence ellipsis) {try{__CLR4_5_2ed2ed2lvha7biz.R.inc(18624);
        __CLR4_5_2ed2ed2lvha7biz.R.inc(18625);Validate.isTrue(ellipsis == null || precision < 0 || ellipsis.length() <= precision,
                "Specified ellipsis '%1$s' exceeds precision of %2$s", ellipsis, Integer.valueOf(precision));
        __CLR4_5_2ed2ed2lvha7biz.R.inc(18626);final StringBuilder buf = new StringBuilder(seq);
        __CLR4_5_2ed2ed2lvha7biz.R.inc(18627);if ((((precision >= 0 && precision < seq.length())&&(__CLR4_5_2ed2ed2lvha7biz.R.iget(18628)!=0|true))||(__CLR4_5_2ed2ed2lvha7biz.R.iget(18629)==0&false))) {{
            __CLR4_5_2ed2ed2lvha7biz.R.inc(18630);final CharSequence _ellipsis = ObjectUtils.defaultIfNull(ellipsis, StringUtils.EMPTY);
            __CLR4_5_2ed2ed2lvha7biz.R.inc(18631);buf.replace(precision - _ellipsis.length(), seq.length(), _ellipsis.toString());
        }
        }__CLR4_5_2ed2ed2lvha7biz.R.inc(18632);final boolean leftJustify = (flags & LEFT_JUSTIFY) == LEFT_JUSTIFY;
        __CLR4_5_2ed2ed2lvha7biz.R.inc(18633);for (int i = buf.length(); (((i < width)&&(__CLR4_5_2ed2ed2lvha7biz.R.iget(18634)!=0|true))||(__CLR4_5_2ed2ed2lvha7biz.R.iget(18635)==0&false)); i++) {{
            __CLR4_5_2ed2ed2lvha7biz.R.inc(18636);buf.insert((((leftJustify )&&(__CLR4_5_2ed2ed2lvha7biz.R.iget(18637)!=0|true))||(__CLR4_5_2ed2ed2lvha7biz.R.iget(18638)==0&false))? i : 0, padChar);
        }
        }__CLR4_5_2ed2ed2lvha7biz.R.inc(18639);formatter.format(buf.toString());
        __CLR4_5_2ed2ed2lvha7biz.R.inc(18640);return formatter;
    }finally{__CLR4_5_2ed2ed2lvha7biz.R.flushNeeded();}}

}
