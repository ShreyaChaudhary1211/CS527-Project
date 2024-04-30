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
package org.apache.commons.lang3.text.translate;

/**
 * Translates codepoints to their Unicode escaped value suitable for Java source.
 * 
 * @since 3.2
 * @deprecated as of 3.6, use commons-text
 * <a href="https://commons.apache.org/proper/commons-text/javadocs/api-release/org/apache/commons/text/translate/UnicodeEscaper.html">
 * UnicodeEscaper</a> instead
 */
@Deprecated
public class JavaUnicodeEscaper extends UnicodeEscaper {public static class __CLR4_5_2gemgemlvha7c4j{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172755542L,8589935092L,21275,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * <p>
     * Constructs a <code>JavaUnicodeEscaper</code> above the specified value (exclusive).
     * </p>
     * 
     * @param codepoint
     *            above which to escape
     * @return the newly created {@code UnicodeEscaper} instance
     */
    public static JavaUnicodeEscaper above(final int codepoint) {try{__CLR4_5_2gemgemlvha7c4j.R.inc(21262);
        __CLR4_5_2gemgemlvha7c4j.R.inc(21263);return outsideOf(0, codepoint);
    }finally{__CLR4_5_2gemgemlvha7c4j.R.flushNeeded();}}

    /**
     * <p>
     * Constructs a <code>JavaUnicodeEscaper</code> below the specified value (exclusive).
     * </p>
     * 
     * @param codepoint
     *            below which to escape
     * @return the newly created {@code UnicodeEscaper} instance
     */
    public static JavaUnicodeEscaper below(final int codepoint) {try{__CLR4_5_2gemgemlvha7c4j.R.inc(21264);
        __CLR4_5_2gemgemlvha7c4j.R.inc(21265);return outsideOf(codepoint, Integer.MAX_VALUE);
    }finally{__CLR4_5_2gemgemlvha7c4j.R.flushNeeded();}}

    /**
     * <p>
     * Constructs a <code>JavaUnicodeEscaper</code> between the specified values (inclusive).
     * </p>
     * 
     * @param codepointLow
     *            above which to escape
     * @param codepointHigh
     *            below which to escape
     * @return the newly created {@code UnicodeEscaper} instance
     */
    public static JavaUnicodeEscaper between(final int codepointLow, final int codepointHigh) {try{__CLR4_5_2gemgemlvha7c4j.R.inc(21266);
        __CLR4_5_2gemgemlvha7c4j.R.inc(21267);return new JavaUnicodeEscaper(codepointLow, codepointHigh, true);
    }finally{__CLR4_5_2gemgemlvha7c4j.R.flushNeeded();}}

    /**
     * <p>
     * Constructs a <code>JavaUnicodeEscaper</code> outside of the specified values (exclusive).
     * </p>
     * 
     * @param codepointLow
     *            below which to escape
     * @param codepointHigh
     *            above which to escape
     * @return the newly created {@code UnicodeEscaper} instance
     */
    public static JavaUnicodeEscaper outsideOf(final int codepointLow, final int codepointHigh) {try{__CLR4_5_2gemgemlvha7c4j.R.inc(21268);
        __CLR4_5_2gemgemlvha7c4j.R.inc(21269);return new JavaUnicodeEscaper(codepointLow, codepointHigh, false);
    }finally{__CLR4_5_2gemgemlvha7c4j.R.flushNeeded();}}

    /**
     * <p>
     * Constructs a <code>JavaUnicodeEscaper</code> for the specified range. This is the underlying method for the
     * other constructors/builders. The <code>below</code> and <code>above</code> boundaries are inclusive when
     * <code>between</code> is <code>true</code> and exclusive when it is <code>false</code>.
     * </p>
     * 
     * @param below
     *            int value representing the lowest codepoint boundary
     * @param above
     *            int value representing the highest codepoint boundary
     * @param between
     *            whether to escape between the boundaries or outside them
     */
    public JavaUnicodeEscaper(final int below, final int above, final boolean between) {
        super(below, above, between);__CLR4_5_2gemgemlvha7c4j.R.inc(21271);try{__CLR4_5_2gemgemlvha7c4j.R.inc(21270);
    }finally{__CLR4_5_2gemgemlvha7c4j.R.flushNeeded();}}

    /**
     * Converts the given codepoint to a hex string of the form {@code "\\uXXXX\\uXXXX"}
     * 
     * @param codepoint
     *            a Unicode code point
     * @return the hex string for the given codepoint
     */
    @Override
    protected String toUtf16Escape(final int codepoint) {try{__CLR4_5_2gemgemlvha7c4j.R.inc(21272);
        __CLR4_5_2gemgemlvha7c4j.R.inc(21273);final char[] surrogatePair = Character.toChars(codepoint);
        __CLR4_5_2gemgemlvha7c4j.R.inc(21274);return "\\u" + hex(surrogatePair[0]) + "\\u" + hex(surrogatePair[1]);
    }finally{__CLR4_5_2gemgemlvha7c4j.R.flushNeeded();}}

}
