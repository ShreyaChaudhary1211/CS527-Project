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

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;

/**
 * Tokenizes a string based based on delimiters (separators)
 * and supporting quoting and ignored character concepts.
 * <p>
 * This class can split a String into many smaller strings. It aims
 * to do a similar job to {@link java.util.StringTokenizer StringTokenizer},
 * however it offers much more control and flexibility including implementing
 * the <code>ListIterator</code> interface. By default, it is set up
 * like <code>StringTokenizer</code>.
 * <p>
 * The input String is split into a number of <i>tokens</i>.
 * Each token is separated from the next String by a <i>delimiter</i>.
 * One or more delimiter characters must be specified.
 * <p>
 * Each token may be surrounded by quotes.
 * The <i>quote</i> matcher specifies the quote character(s).
 * A quote may be escaped within a quoted section by duplicating itself.
 * <p>
 * Between each token and the delimiter are potentially characters that need trimming.
 * The <i>trimmer</i> matcher specifies these characters.
 * One usage might be to trim whitespace characters.
 * <p>
 * At any point outside the quotes there might potentially be invalid characters.
 * The <i>ignored</i> matcher specifies these characters to be removed.
 * One usage might be to remove new line characters.
 * <p>
 * Empty tokens may be removed or returned as null.
 * <pre>
 * "a,b,c"         - Three tokens "a","b","c"   (comma delimiter)
 * " a, b , c "    - Three tokens "a","b","c"   (default CSV processing trims whitespace)
 * "a, ", b ,", c" - Three tokens "a, " , " b ", ", c" (quoted text untouched)
 * </pre>
 * <p>
 *
 * This tokenizer has the following properties and options:
 *
 * <table summary="Tokenizer Properties">
 *  <tr>
 *   <th>Property</th><th>Type</th><th>Default</th>
 *  </tr>
 *  <tr>
 *   <td>delim</td><td>CharSetMatcher</td><td>{ \t\n\r\f}</td>
 *  </tr>
 *  <tr>
 *   <td>quote</td><td>NoneMatcher</td><td>{}</td>
 *  </tr>
 *  <tr>
 *   <td>ignore</td><td>NoneMatcher</td><td>{}</td>
 *  </tr>
 *  <tr>
 *   <td>emptyTokenAsNull</td><td>boolean</td><td>false</td>
 *  </tr>
 *  <tr>
 *   <td>ignoreEmptyTokens</td><td>boolean</td><td>true</td>
 *  </tr>
 * </table>
 *
 * @since 2.2
 * @deprecated as of 3.6, use commons-text
 * <a href="https://commons.apache.org/proper/commons-text/javadocs/api-release/org/apache/commons/text/StrTokenizer.html">
 * StrTokenizer</a> instead
 */
@Deprecated
public class StrTokenizer implements ListIterator<String>, Cloneable {public static class __CLR4_5_2fvofvolvha7brx{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172755542L,8589935092L,20937,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final StrTokenizer CSV_TOKENIZER_PROTOTYPE;
    private static final StrTokenizer TSV_TOKENIZER_PROTOTYPE;
    static {try{__CLR4_5_2fvofvolvha7brx.R.inc(20580);
        __CLR4_5_2fvofvolvha7brx.R.inc(20581);CSV_TOKENIZER_PROTOTYPE = new StrTokenizer();
        __CLR4_5_2fvofvolvha7brx.R.inc(20582);CSV_TOKENIZER_PROTOTYPE.setDelimiterMatcher(StrMatcher.commaMatcher());
        __CLR4_5_2fvofvolvha7brx.R.inc(20583);CSV_TOKENIZER_PROTOTYPE.setQuoteMatcher(StrMatcher.doubleQuoteMatcher());
        __CLR4_5_2fvofvolvha7brx.R.inc(20584);CSV_TOKENIZER_PROTOTYPE.setIgnoredMatcher(StrMatcher.noneMatcher());
        __CLR4_5_2fvofvolvha7brx.R.inc(20585);CSV_TOKENIZER_PROTOTYPE.setTrimmerMatcher(StrMatcher.trimMatcher());
        __CLR4_5_2fvofvolvha7brx.R.inc(20586);CSV_TOKENIZER_PROTOTYPE.setEmptyTokenAsNull(false);
        __CLR4_5_2fvofvolvha7brx.R.inc(20587);CSV_TOKENIZER_PROTOTYPE.setIgnoreEmptyTokens(false);

        __CLR4_5_2fvofvolvha7brx.R.inc(20588);TSV_TOKENIZER_PROTOTYPE = new StrTokenizer();
        __CLR4_5_2fvofvolvha7brx.R.inc(20589);TSV_TOKENIZER_PROTOTYPE.setDelimiterMatcher(StrMatcher.tabMatcher());
        __CLR4_5_2fvofvolvha7brx.R.inc(20590);TSV_TOKENIZER_PROTOTYPE.setQuoteMatcher(StrMatcher.doubleQuoteMatcher());
        __CLR4_5_2fvofvolvha7brx.R.inc(20591);TSV_TOKENIZER_PROTOTYPE.setIgnoredMatcher(StrMatcher.noneMatcher());
        __CLR4_5_2fvofvolvha7brx.R.inc(20592);TSV_TOKENIZER_PROTOTYPE.setTrimmerMatcher(StrMatcher.trimMatcher());
        __CLR4_5_2fvofvolvha7brx.R.inc(20593);TSV_TOKENIZER_PROTOTYPE.setEmptyTokenAsNull(false);
        __CLR4_5_2fvofvolvha7brx.R.inc(20594);TSV_TOKENIZER_PROTOTYPE.setIgnoreEmptyTokens(false);
    }finally{__CLR4_5_2fvofvolvha7brx.R.flushNeeded();}}

    /** The text to work on. */
    private char chars[];
    /** The parsed tokens */
    private String tokens[];
    /** The current iteration position */
    private int tokenPos;

    /** The delimiter matcher */
    private StrMatcher delimMatcher = StrMatcher.splitMatcher();
    /** The quote matcher */
    private StrMatcher quoteMatcher = StrMatcher.noneMatcher();
    /** The ignored matcher */
    private StrMatcher ignoredMatcher = StrMatcher.noneMatcher();
    /** The trimmer matcher */
    private StrMatcher trimmerMatcher = StrMatcher.noneMatcher();

    /** Whether to return empty tokens as null */
    private boolean emptyAsNull = false;
    /** Whether to ignore empty tokens */
    private boolean ignoreEmptyTokens = true;

    //-----------------------------------------------------------------------

    /**
     * Returns a clone of <code>CSV_TOKENIZER_PROTOTYPE</code>.
     * 
     * @return a clone of <code>CSV_TOKENIZER_PROTOTYPE</code>.
     */
    private static StrTokenizer getCSVClone() {try{__CLR4_5_2fvofvolvha7brx.R.inc(20595);
        __CLR4_5_2fvofvolvha7brx.R.inc(20596);return (StrTokenizer) CSV_TOKENIZER_PROTOTYPE.clone();
    }finally{__CLR4_5_2fvofvolvha7brx.R.flushNeeded();}}

    /**
     * Gets a new tokenizer instance which parses Comma Separated Value strings
     * initializing it with the given input.  The default for CSV processing
     * will be trim whitespace from both ends (which can be overridden with
     * the setTrimmer method).
     * <p>
     * You must call a "reset" method to set the string which you want to parse.
     * @return a new tokenizer instance which parses Comma Separated Value strings
     */
    public static StrTokenizer getCSVInstance() {try{__CLR4_5_2fvofvolvha7brx.R.inc(20597);
        __CLR4_5_2fvofvolvha7brx.R.inc(20598);return getCSVClone();
    }finally{__CLR4_5_2fvofvolvha7brx.R.flushNeeded();}}

    /**
     * Gets a new tokenizer instance which parses Comma Separated Value strings
     * initializing it with the given input.  The default for CSV processing
     * will be trim whitespace from both ends (which can be overridden with
     * the setTrimmer method).
     *
     * @param input  the text to parse
     * @return a new tokenizer instance which parses Comma Separated Value strings
     */
    public static StrTokenizer getCSVInstance(final String input) {try{__CLR4_5_2fvofvolvha7brx.R.inc(20599);
        __CLR4_5_2fvofvolvha7brx.R.inc(20600);final StrTokenizer tok = getCSVClone();
        __CLR4_5_2fvofvolvha7brx.R.inc(20601);tok.reset(input);
        __CLR4_5_2fvofvolvha7brx.R.inc(20602);return tok;
    }finally{__CLR4_5_2fvofvolvha7brx.R.flushNeeded();}}

    /**
     * Gets a new tokenizer instance which parses Comma Separated Value strings
     * initializing it with the given input.  The default for CSV processing
     * will be trim whitespace from both ends (which can be overridden with
     * the setTrimmer method).
     *
     * @param input  the text to parse
     * @return a new tokenizer instance which parses Comma Separated Value strings
     */
    public static StrTokenizer getCSVInstance(final char[] input) {try{__CLR4_5_2fvofvolvha7brx.R.inc(20603);
        __CLR4_5_2fvofvolvha7brx.R.inc(20604);final StrTokenizer tok = getCSVClone();
        __CLR4_5_2fvofvolvha7brx.R.inc(20605);tok.reset(input);
        __CLR4_5_2fvofvolvha7brx.R.inc(20606);return tok;
    }finally{__CLR4_5_2fvofvolvha7brx.R.flushNeeded();}}

    /**
     * Returns a clone of <code>TSV_TOKENIZER_PROTOTYPE</code>.
     * 
     * @return a clone of <code>TSV_TOKENIZER_PROTOTYPE</code>.
     */
    private static StrTokenizer getTSVClone() {try{__CLR4_5_2fvofvolvha7brx.R.inc(20607);
        __CLR4_5_2fvofvolvha7brx.R.inc(20608);return (StrTokenizer) TSV_TOKENIZER_PROTOTYPE.clone();
    }finally{__CLR4_5_2fvofvolvha7brx.R.flushNeeded();}}


    /**
     * Gets a new tokenizer instance which parses Tab Separated Value strings.
     * The default for CSV processing will be trim whitespace from both ends
     * (which can be overridden with the setTrimmer method).
     * <p>
     * You must call a "reset" method to set the string which you want to parse.
     * @return a new tokenizer instance which parses Tab Separated Value strings.
     */
    public static StrTokenizer getTSVInstance() {try{__CLR4_5_2fvofvolvha7brx.R.inc(20609);
        __CLR4_5_2fvofvolvha7brx.R.inc(20610);return getTSVClone();
    }finally{__CLR4_5_2fvofvolvha7brx.R.flushNeeded();}}

    /**
     * Gets a new tokenizer instance which parses Tab Separated Value strings.
     * The default for CSV processing will be trim whitespace from both ends
     * (which can be overridden with the setTrimmer method).
     * @param input  the string to parse
     * @return a new tokenizer instance which parses Tab Separated Value strings.
     */
    public static StrTokenizer getTSVInstance(final String input) {try{__CLR4_5_2fvofvolvha7brx.R.inc(20611);
        __CLR4_5_2fvofvolvha7brx.R.inc(20612);final StrTokenizer tok = getTSVClone();
        __CLR4_5_2fvofvolvha7brx.R.inc(20613);tok.reset(input);
        __CLR4_5_2fvofvolvha7brx.R.inc(20614);return tok;
    }finally{__CLR4_5_2fvofvolvha7brx.R.flushNeeded();}}

    /**
     * Gets a new tokenizer instance which parses Tab Separated Value strings.
     * The default for CSV processing will be trim whitespace from both ends
     * (which can be overridden with the setTrimmer method).
     * @param input  the string to parse
     * @return a new tokenizer instance which parses Tab Separated Value strings.
     */
    public static StrTokenizer getTSVInstance(final char[] input) {try{__CLR4_5_2fvofvolvha7brx.R.inc(20615);
        __CLR4_5_2fvofvolvha7brx.R.inc(20616);final StrTokenizer tok = getTSVClone();
        __CLR4_5_2fvofvolvha7brx.R.inc(20617);tok.reset(input);
        __CLR4_5_2fvofvolvha7brx.R.inc(20618);return tok;
    }finally{__CLR4_5_2fvofvolvha7brx.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Constructs a tokenizer splitting on space, tab, newline and formfeed
     * as per StringTokenizer, but with no text to tokenize.
     * <p>
     * This constructor is normally used with {@link #reset(String)}.
     */
    public StrTokenizer() {
        super();__CLR4_5_2fvofvolvha7brx.R.inc(20620);try{__CLR4_5_2fvofvolvha7brx.R.inc(20619);
        __CLR4_5_2fvofvolvha7brx.R.inc(20621);this.chars = null;
    }finally{__CLR4_5_2fvofvolvha7brx.R.flushNeeded();}}

    /**
     * Constructs a tokenizer splitting on space, tab, newline and formfeed
     * as per StringTokenizer.
     *
     * @param input  the string which is to be parsed
     */
    public StrTokenizer(final String input) {
        super();__CLR4_5_2fvofvolvha7brx.R.inc(20623);try{__CLR4_5_2fvofvolvha7brx.R.inc(20622);
        __CLR4_5_2fvofvolvha7brx.R.inc(20624);if ((((input != null)&&(__CLR4_5_2fvofvolvha7brx.R.iget(20625)!=0|true))||(__CLR4_5_2fvofvolvha7brx.R.iget(20626)==0&false))) {{
            __CLR4_5_2fvofvolvha7brx.R.inc(20627);chars = input.toCharArray();
        } }else {{
            __CLR4_5_2fvofvolvha7brx.R.inc(20628);chars = null;
        }
    }}finally{__CLR4_5_2fvofvolvha7brx.R.flushNeeded();}}

    /**
     * Constructs a tokenizer splitting on the specified delimiter character.
     *
     * @param input  the string which is to be parsed
     * @param delim  the field delimiter character
     */
    public StrTokenizer(final String input, final char delim) {
        this(input);__CLR4_5_2fvofvolvha7brx.R.inc(20630);try{__CLR4_5_2fvofvolvha7brx.R.inc(20629);
        __CLR4_5_2fvofvolvha7brx.R.inc(20631);setDelimiterChar(delim);
    }finally{__CLR4_5_2fvofvolvha7brx.R.flushNeeded();}}

    /**
     * Constructs a tokenizer splitting on the specified delimiter string.
     *
     * @param input  the string which is to be parsed
     * @param delim  the field delimiter string
     */
    public StrTokenizer(final String input, final String delim) {
        this(input);__CLR4_5_2fvofvolvha7brx.R.inc(20633);try{__CLR4_5_2fvofvolvha7brx.R.inc(20632);
        __CLR4_5_2fvofvolvha7brx.R.inc(20634);setDelimiterString(delim);
    }finally{__CLR4_5_2fvofvolvha7brx.R.flushNeeded();}}

    /**
     * Constructs a tokenizer splitting using the specified delimiter matcher.
     *
     * @param input  the string which is to be parsed
     * @param delim  the field delimiter matcher
     */
    public StrTokenizer(final String input, final StrMatcher delim) {
        this(input);__CLR4_5_2fvofvolvha7brx.R.inc(20636);try{__CLR4_5_2fvofvolvha7brx.R.inc(20635);
        __CLR4_5_2fvofvolvha7brx.R.inc(20637);setDelimiterMatcher(delim);
    }finally{__CLR4_5_2fvofvolvha7brx.R.flushNeeded();}}

    /**
     * Constructs a tokenizer splitting on the specified delimiter character
     * and handling quotes using the specified quote character.
     *
     * @param input  the string which is to be parsed
     * @param delim  the field delimiter character
     * @param quote  the field quoted string character
     */
    public StrTokenizer(final String input, final char delim, final char quote) {
        this(input, delim);__CLR4_5_2fvofvolvha7brx.R.inc(20639);try{__CLR4_5_2fvofvolvha7brx.R.inc(20638);
        __CLR4_5_2fvofvolvha7brx.R.inc(20640);setQuoteChar(quote);
    }finally{__CLR4_5_2fvofvolvha7brx.R.flushNeeded();}}

    /**
     * Constructs a tokenizer splitting using the specified delimiter matcher
     * and handling quotes using the specified quote matcher.
     *
     * @param input  the string which is to be parsed
     * @param delim  the field delimiter matcher
     * @param quote  the field quoted string matcher
     */
    public StrTokenizer(final String input, final StrMatcher delim, final StrMatcher quote) {
        this(input, delim);__CLR4_5_2fvofvolvha7brx.R.inc(20642);try{__CLR4_5_2fvofvolvha7brx.R.inc(20641);
        __CLR4_5_2fvofvolvha7brx.R.inc(20643);setQuoteMatcher(quote);
    }finally{__CLR4_5_2fvofvolvha7brx.R.flushNeeded();}}

    /**
     * Constructs a tokenizer splitting on space, tab, newline and formfeed
     * as per StringTokenizer.
     *
     * @param input  the string which is to be parsed, not cloned
     */
    public StrTokenizer(final char[] input) {
        super();__CLR4_5_2fvofvolvha7brx.R.inc(20645);try{__CLR4_5_2fvofvolvha7brx.R.inc(20644);
        __CLR4_5_2fvofvolvha7brx.R.inc(20646);this.chars = ArrayUtils.clone(input);
    }finally{__CLR4_5_2fvofvolvha7brx.R.flushNeeded();}}

    /**
     * Constructs a tokenizer splitting on the specified character.
     *
     * @param input  the string which is to be parsed, not cloned
     * @param delim the field delimiter character
     */
    public StrTokenizer(final char[] input, final char delim) {
        this(input);__CLR4_5_2fvofvolvha7brx.R.inc(20648);try{__CLR4_5_2fvofvolvha7brx.R.inc(20647);
        __CLR4_5_2fvofvolvha7brx.R.inc(20649);setDelimiterChar(delim);
    }finally{__CLR4_5_2fvofvolvha7brx.R.flushNeeded();}}

    /**
     * Constructs a tokenizer splitting on the specified string.
     *
     * @param input  the string which is to be parsed, not cloned
     * @param delim the field delimiter string
     */
    public StrTokenizer(final char[] input, final String delim) {
        this(input);__CLR4_5_2fvofvolvha7brx.R.inc(20651);try{__CLR4_5_2fvofvolvha7brx.R.inc(20650);
        __CLR4_5_2fvofvolvha7brx.R.inc(20652);setDelimiterString(delim);
    }finally{__CLR4_5_2fvofvolvha7brx.R.flushNeeded();}}

    /**
     * Constructs a tokenizer splitting using the specified delimiter matcher.
     *
     * @param input  the string which is to be parsed, not cloned
     * @param delim  the field delimiter matcher
     */
    public StrTokenizer(final char[] input, final StrMatcher delim) {
        this(input);__CLR4_5_2fvofvolvha7brx.R.inc(20654);try{__CLR4_5_2fvofvolvha7brx.R.inc(20653);
        __CLR4_5_2fvofvolvha7brx.R.inc(20655);setDelimiterMatcher(delim);
    }finally{__CLR4_5_2fvofvolvha7brx.R.flushNeeded();}}

    /**
     * Constructs a tokenizer splitting on the specified delimiter character
     * and handling quotes using the specified quote character.
     *
     * @param input  the string which is to be parsed, not cloned
     * @param delim  the field delimiter character
     * @param quote  the field quoted string character
     */
    public StrTokenizer(final char[] input, final char delim, final char quote) {
        this(input, delim);__CLR4_5_2fvofvolvha7brx.R.inc(20657);try{__CLR4_5_2fvofvolvha7brx.R.inc(20656);
        __CLR4_5_2fvofvolvha7brx.R.inc(20658);setQuoteChar(quote);
    }finally{__CLR4_5_2fvofvolvha7brx.R.flushNeeded();}}

    /**
     * Constructs a tokenizer splitting using the specified delimiter matcher
     * and handling quotes using the specified quote matcher.
     *
     * @param input  the string which is to be parsed, not cloned
     * @param delim  the field delimiter character
     * @param quote  the field quoted string character
     */
    public StrTokenizer(final char[] input, final StrMatcher delim, final StrMatcher quote) {
        this(input, delim);__CLR4_5_2fvofvolvha7brx.R.inc(20660);try{__CLR4_5_2fvofvolvha7brx.R.inc(20659);
        __CLR4_5_2fvofvolvha7brx.R.inc(20661);setQuoteMatcher(quote);
    }finally{__CLR4_5_2fvofvolvha7brx.R.flushNeeded();}}

    // API
    //-----------------------------------------------------------------------
    /**
     * Gets the number of tokens found in the String.
     *
     * @return the number of matched tokens
     */
    public int size() {try{__CLR4_5_2fvofvolvha7brx.R.inc(20662);
        __CLR4_5_2fvofvolvha7brx.R.inc(20663);checkTokenized();
        __CLR4_5_2fvofvolvha7brx.R.inc(20664);return tokens.length;
    }finally{__CLR4_5_2fvofvolvha7brx.R.flushNeeded();}}

    /**
     * Gets the next token from the String.
     * Equivalent to {@link #next()} except it returns null rather than
     * throwing {@link NoSuchElementException} when no tokens remain.
     *
     * @return the next sequential token, or null when no more tokens are found
     */
    public String nextToken() {try{__CLR4_5_2fvofvolvha7brx.R.inc(20665);
        __CLR4_5_2fvofvolvha7brx.R.inc(20666);if ((((hasNext())&&(__CLR4_5_2fvofvolvha7brx.R.iget(20667)!=0|true))||(__CLR4_5_2fvofvolvha7brx.R.iget(20668)==0&false))) {{
            __CLR4_5_2fvofvolvha7brx.R.inc(20669);return tokens[tokenPos++];
        }
        }__CLR4_5_2fvofvolvha7brx.R.inc(20670);return null;
    }finally{__CLR4_5_2fvofvolvha7brx.R.flushNeeded();}}

    /**
     * Gets the previous token from the String.
     *
     * @return the previous sequential token, or null when no more tokens are found
     */
    public String previousToken() {try{__CLR4_5_2fvofvolvha7brx.R.inc(20671);
        __CLR4_5_2fvofvolvha7brx.R.inc(20672);if ((((hasPrevious())&&(__CLR4_5_2fvofvolvha7brx.R.iget(20673)!=0|true))||(__CLR4_5_2fvofvolvha7brx.R.iget(20674)==0&false))) {{
            __CLR4_5_2fvofvolvha7brx.R.inc(20675);return tokens[--tokenPos];
        }
        }__CLR4_5_2fvofvolvha7brx.R.inc(20676);return null;
    }finally{__CLR4_5_2fvofvolvha7brx.R.flushNeeded();}}

    /**
     * Gets a copy of the full token list as an independent modifiable array.
     *
     * @return the tokens as a String array
     */
    public String[] getTokenArray() {try{__CLR4_5_2fvofvolvha7brx.R.inc(20677);
        __CLR4_5_2fvofvolvha7brx.R.inc(20678);checkTokenized();
        __CLR4_5_2fvofvolvha7brx.R.inc(20679);return tokens.clone();
    }finally{__CLR4_5_2fvofvolvha7brx.R.flushNeeded();}}

    /**
     * Gets a copy of the full token list as an independent modifiable list.
     *
     * @return the tokens as a String array
     */
    public List<String> getTokenList() {try{__CLR4_5_2fvofvolvha7brx.R.inc(20680);
        __CLR4_5_2fvofvolvha7brx.R.inc(20681);checkTokenized();
        __CLR4_5_2fvofvolvha7brx.R.inc(20682);final List<String> list = new ArrayList<>(tokens.length);
        __CLR4_5_2fvofvolvha7brx.R.inc(20683);for (final String element : tokens) {{
            __CLR4_5_2fvofvolvha7brx.R.inc(20684);list.add(element);
        }
        }__CLR4_5_2fvofvolvha7brx.R.inc(20685);return list;
    }finally{__CLR4_5_2fvofvolvha7brx.R.flushNeeded();}}

    /**
     * Resets this tokenizer, forgetting all parsing and iteration already completed.
     * <p>
     * This method allows the same tokenizer to be reused for the same String.
     *
     * @return this, to enable chaining
     */
    public StrTokenizer reset() {try{__CLR4_5_2fvofvolvha7brx.R.inc(20686);
        __CLR4_5_2fvofvolvha7brx.R.inc(20687);tokenPos = 0;
        __CLR4_5_2fvofvolvha7brx.R.inc(20688);tokens = null;
        __CLR4_5_2fvofvolvha7brx.R.inc(20689);return this;
    }finally{__CLR4_5_2fvofvolvha7brx.R.flushNeeded();}}

    /**
     * Reset this tokenizer, giving it a new input string to parse.
     * In this manner you can re-use a tokenizer with the same settings
     * on multiple input lines.
     *
     * @param input  the new string to tokenize, null sets no text to parse
     * @return this, to enable chaining
     */
    public StrTokenizer reset(final String input) {try{__CLR4_5_2fvofvolvha7brx.R.inc(20690);
        __CLR4_5_2fvofvolvha7brx.R.inc(20691);reset();
        __CLR4_5_2fvofvolvha7brx.R.inc(20692);if ((((input != null)&&(__CLR4_5_2fvofvolvha7brx.R.iget(20693)!=0|true))||(__CLR4_5_2fvofvolvha7brx.R.iget(20694)==0&false))) {{
            __CLR4_5_2fvofvolvha7brx.R.inc(20695);this.chars = input.toCharArray();
        } }else {{
            __CLR4_5_2fvofvolvha7brx.R.inc(20696);this.chars = null;
        }
        }__CLR4_5_2fvofvolvha7brx.R.inc(20697);return this;
    }finally{__CLR4_5_2fvofvolvha7brx.R.flushNeeded();}}

    /**
     * Reset this tokenizer, giving it a new input string to parse.
     * In this manner you can re-use a tokenizer with the same settings
     * on multiple input lines.
     *
     * @param input  the new character array to tokenize, not cloned, null sets no text to parse
     * @return this, to enable chaining
     */
    public StrTokenizer reset(final char[] input) {try{__CLR4_5_2fvofvolvha7brx.R.inc(20698);
        __CLR4_5_2fvofvolvha7brx.R.inc(20699);reset();
        __CLR4_5_2fvofvolvha7brx.R.inc(20700);this.chars = ArrayUtils.clone(input);
        __CLR4_5_2fvofvolvha7brx.R.inc(20701);return this;
    }finally{__CLR4_5_2fvofvolvha7brx.R.flushNeeded();}}

    // ListIterator
    //-----------------------------------------------------------------------
    /**
     * Checks whether there are any more tokens.
     *
     * @return true if there are more tokens
     */
    @Override
    public boolean hasNext() {try{__CLR4_5_2fvofvolvha7brx.R.inc(20702);
        __CLR4_5_2fvofvolvha7brx.R.inc(20703);checkTokenized();
        __CLR4_5_2fvofvolvha7brx.R.inc(20704);return tokenPos < tokens.length;
    }finally{__CLR4_5_2fvofvolvha7brx.R.flushNeeded();}}

    /**
     * Gets the next token.
     *
     * @return the next String token
     * @throws NoSuchElementException if there are no more elements
     */
    @Override
    public String next() {try{__CLR4_5_2fvofvolvha7brx.R.inc(20705);
        __CLR4_5_2fvofvolvha7brx.R.inc(20706);if ((((hasNext())&&(__CLR4_5_2fvofvolvha7brx.R.iget(20707)!=0|true))||(__CLR4_5_2fvofvolvha7brx.R.iget(20708)==0&false))) {{
            __CLR4_5_2fvofvolvha7brx.R.inc(20709);return tokens[tokenPos++];
        }
        }__CLR4_5_2fvofvolvha7brx.R.inc(20710);throw new NoSuchElementException();
    }finally{__CLR4_5_2fvofvolvha7brx.R.flushNeeded();}}

    /**
     * Gets the index of the next token to return.
     *
     * @return the next token index
     */
    @Override
    public int nextIndex() {try{__CLR4_5_2fvofvolvha7brx.R.inc(20711);
        __CLR4_5_2fvofvolvha7brx.R.inc(20712);return tokenPos;
    }finally{__CLR4_5_2fvofvolvha7brx.R.flushNeeded();}}

    /**
     * Checks whether there are any previous tokens that can be iterated to.
     *
     * @return true if there are previous tokens
     */
    @Override
    public boolean hasPrevious() {try{__CLR4_5_2fvofvolvha7brx.R.inc(20713);
        __CLR4_5_2fvofvolvha7brx.R.inc(20714);checkTokenized();
        __CLR4_5_2fvofvolvha7brx.R.inc(20715);return tokenPos > 0;
    }finally{__CLR4_5_2fvofvolvha7brx.R.flushNeeded();}}

    /**
     * Gets the token previous to the last returned token.
     *
     * @return the previous token
     */
    @Override
    public String previous() {try{__CLR4_5_2fvofvolvha7brx.R.inc(20716);
        __CLR4_5_2fvofvolvha7brx.R.inc(20717);if ((((hasPrevious())&&(__CLR4_5_2fvofvolvha7brx.R.iget(20718)!=0|true))||(__CLR4_5_2fvofvolvha7brx.R.iget(20719)==0&false))) {{
            __CLR4_5_2fvofvolvha7brx.R.inc(20720);return tokens[--tokenPos];
        }
        }__CLR4_5_2fvofvolvha7brx.R.inc(20721);throw new NoSuchElementException();
    }finally{__CLR4_5_2fvofvolvha7brx.R.flushNeeded();}}

    /**
     * Gets the index of the previous token.
     *
     * @return the previous token index
     */
    @Override
    public int previousIndex() {try{__CLR4_5_2fvofvolvha7brx.R.inc(20722);
        __CLR4_5_2fvofvolvha7brx.R.inc(20723);return tokenPos - 1;
    }finally{__CLR4_5_2fvofvolvha7brx.R.flushNeeded();}}

    /**
     * Unsupported ListIterator operation.
     *
     * @throws UnsupportedOperationException always
     */
    @Override
    public void remove() {try{__CLR4_5_2fvofvolvha7brx.R.inc(20724);
        __CLR4_5_2fvofvolvha7brx.R.inc(20725);throw new UnsupportedOperationException("remove() is unsupported");
    }finally{__CLR4_5_2fvofvolvha7brx.R.flushNeeded();}}

    /**
     * Unsupported ListIterator operation.
     * @param obj this parameter ignored.
     * @throws UnsupportedOperationException always
     */
    @Override
    public void set(final String obj) {try{__CLR4_5_2fvofvolvha7brx.R.inc(20726);
        __CLR4_5_2fvofvolvha7brx.R.inc(20727);throw new UnsupportedOperationException("set() is unsupported");
    }finally{__CLR4_5_2fvofvolvha7brx.R.flushNeeded();}}

    /**
     * Unsupported ListIterator operation.
     * @param obj this parameter ignored.
     * @throws UnsupportedOperationException always
     */
    @Override
    public void add(final String obj) {try{__CLR4_5_2fvofvolvha7brx.R.inc(20728);
        __CLR4_5_2fvofvolvha7brx.R.inc(20729);throw new UnsupportedOperationException("add() is unsupported");
    }finally{__CLR4_5_2fvofvolvha7brx.R.flushNeeded();}}

    // Implementation
    //-----------------------------------------------------------------------
    /**
     * Checks if tokenization has been done, and if not then do it.
     */
    private void checkTokenized() {try{__CLR4_5_2fvofvolvha7brx.R.inc(20730);
        __CLR4_5_2fvofvolvha7brx.R.inc(20731);if ((((tokens == null)&&(__CLR4_5_2fvofvolvha7brx.R.iget(20732)!=0|true))||(__CLR4_5_2fvofvolvha7brx.R.iget(20733)==0&false))) {{
            __CLR4_5_2fvofvolvha7brx.R.inc(20734);if ((((chars == null)&&(__CLR4_5_2fvofvolvha7brx.R.iget(20735)!=0|true))||(__CLR4_5_2fvofvolvha7brx.R.iget(20736)==0&false))) {{
                // still call tokenize as subclass may do some work
                __CLR4_5_2fvofvolvha7brx.R.inc(20737);final List<String> split = tokenize(null, 0, 0);
                __CLR4_5_2fvofvolvha7brx.R.inc(20738);tokens = split.toArray(new String[split.size()]);
            } }else {{
                __CLR4_5_2fvofvolvha7brx.R.inc(20739);final List<String> split = tokenize(chars, 0, chars.length);
                __CLR4_5_2fvofvolvha7brx.R.inc(20740);tokens = split.toArray(new String[split.size()]);
            }
        }}
    }}finally{__CLR4_5_2fvofvolvha7brx.R.flushNeeded();}}

    /**
     * Internal method to performs the tokenization.
     * <p>
     * Most users of this class do not need to call this method. This method
     * will be called automatically by other (public) methods when required.
     * <p>
     * This method exists to allow subclasses to add code before or after the
     * tokenization. For example, a subclass could alter the character array,
     * offset or count to be parsed, or call the tokenizer multiple times on
     * multiple strings. It is also be possible to filter the results.
     * <p>
     * <code>StrTokenizer</code> will always pass a zero offset and a count
     * equal to the length of the array to this method, however a subclass
     * may pass other values, or even an entirely different array.
     * 
     * @param srcChars  the character array being tokenized, may be null
     * @param offset  the start position within the character array, must be valid
     * @param count  the number of characters to tokenize, must be valid
     * @return the modifiable list of String tokens, unmodifiable if null array or zero count
     */
    protected List<String> tokenize(final char[] srcChars, final int offset, final int count) {try{__CLR4_5_2fvofvolvha7brx.R.inc(20741);
        __CLR4_5_2fvofvolvha7brx.R.inc(20742);if ((((srcChars == null || count == 0)&&(__CLR4_5_2fvofvolvha7brx.R.iget(20743)!=0|true))||(__CLR4_5_2fvofvolvha7brx.R.iget(20744)==0&false))) {{
            __CLR4_5_2fvofvolvha7brx.R.inc(20745);return Collections.emptyList();
        }
        }__CLR4_5_2fvofvolvha7brx.R.inc(20746);final StrBuilder buf = new StrBuilder();
        __CLR4_5_2fvofvolvha7brx.R.inc(20747);final List<String> tokenList = new ArrayList<>();
        __CLR4_5_2fvofvolvha7brx.R.inc(20748);int pos = offset;
        
        // loop around the entire buffer
        __CLR4_5_2fvofvolvha7brx.R.inc(20749);while ((((pos >= 0 && pos < count)&&(__CLR4_5_2fvofvolvha7brx.R.iget(20750)!=0|true))||(__CLR4_5_2fvofvolvha7brx.R.iget(20751)==0&false))) {{
            // find next token
            __CLR4_5_2fvofvolvha7brx.R.inc(20752);pos = readNextToken(srcChars, pos, count, buf, tokenList);
            
            // handle case where end of string is a delimiter
            __CLR4_5_2fvofvolvha7brx.R.inc(20753);if ((((pos >= count)&&(__CLR4_5_2fvofvolvha7brx.R.iget(20754)!=0|true))||(__CLR4_5_2fvofvolvha7brx.R.iget(20755)==0&false))) {{
                __CLR4_5_2fvofvolvha7brx.R.inc(20756);addToken(tokenList, StringUtils.EMPTY);
            }
        }}
        }__CLR4_5_2fvofvolvha7brx.R.inc(20757);return tokenList;
    }finally{__CLR4_5_2fvofvolvha7brx.R.flushNeeded();}}

    /**
     * Adds a token to a list, paying attention to the parameters we've set.
     *
     * @param list  the list to add to
     * @param tok  the token to add
     */
    private void addToken(final List<String> list, String tok) {try{__CLR4_5_2fvofvolvha7brx.R.inc(20758);
        __CLR4_5_2fvofvolvha7brx.R.inc(20759);if ((((StringUtils.isEmpty(tok))&&(__CLR4_5_2fvofvolvha7brx.R.iget(20760)!=0|true))||(__CLR4_5_2fvofvolvha7brx.R.iget(20761)==0&false))) {{
            __CLR4_5_2fvofvolvha7brx.R.inc(20762);if ((((isIgnoreEmptyTokens())&&(__CLR4_5_2fvofvolvha7brx.R.iget(20763)!=0|true))||(__CLR4_5_2fvofvolvha7brx.R.iget(20764)==0&false))) {{
                __CLR4_5_2fvofvolvha7brx.R.inc(20765);return;
            }
            }__CLR4_5_2fvofvolvha7brx.R.inc(20766);if ((((isEmptyTokenAsNull())&&(__CLR4_5_2fvofvolvha7brx.R.iget(20767)!=0|true))||(__CLR4_5_2fvofvolvha7brx.R.iget(20768)==0&false))) {{
                __CLR4_5_2fvofvolvha7brx.R.inc(20769);tok = null;
            }
        }}
        }__CLR4_5_2fvofvolvha7brx.R.inc(20770);list.add(tok);
    }finally{__CLR4_5_2fvofvolvha7brx.R.flushNeeded();}}

    /**
     * Reads character by character through the String to get the next token.
     *
     * @param srcChars  the character array being tokenized
     * @param start  the first character of field
     * @param len  the length of the character array being tokenized
     * @param workArea  a temporary work area
     * @param tokenList  the list of parsed tokens
     * @return the starting position of the next field (the character
     *  immediately after the delimiter), or -1 if end of string found
     */
    private int readNextToken(final char[] srcChars, int start, final int len, final StrBuilder workArea, final List<String> tokenList) {try{__CLR4_5_2fvofvolvha7brx.R.inc(20771);
        // skip all leading whitespace, unless it is the
        // field delimiter or the quote character
        __CLR4_5_2fvofvolvha7brx.R.inc(20772);while ((((start < len)&&(__CLR4_5_2fvofvolvha7brx.R.iget(20773)!=0|true))||(__CLR4_5_2fvofvolvha7brx.R.iget(20774)==0&false))) {{
            __CLR4_5_2fvofvolvha7brx.R.inc(20775);final int removeLen = Math.max(
                    getIgnoredMatcher().isMatch(srcChars, start, start, len),
                    getTrimmerMatcher().isMatch(srcChars, start, start, len));
            __CLR4_5_2fvofvolvha7brx.R.inc(20776);if ((((removeLen == 0 ||
                getDelimiterMatcher().isMatch(srcChars, start, start, len) > 0 ||
                getQuoteMatcher().isMatch(srcChars, start, start, len) > 0)&&(__CLR4_5_2fvofvolvha7brx.R.iget(20777)!=0|true))||(__CLR4_5_2fvofvolvha7brx.R.iget(20778)==0&false))) {{
                __CLR4_5_2fvofvolvha7brx.R.inc(20779);break;
            }
            }__CLR4_5_2fvofvolvha7brx.R.inc(20780);start += removeLen;
        }
        
        // handle reaching end
        }__CLR4_5_2fvofvolvha7brx.R.inc(20781);if ((((start >= len)&&(__CLR4_5_2fvofvolvha7brx.R.iget(20782)!=0|true))||(__CLR4_5_2fvofvolvha7brx.R.iget(20783)==0&false))) {{
            __CLR4_5_2fvofvolvha7brx.R.inc(20784);addToken(tokenList, StringUtils.EMPTY);
            __CLR4_5_2fvofvolvha7brx.R.inc(20785);return -1;
        }
        
        // handle empty token
        }__CLR4_5_2fvofvolvha7brx.R.inc(20786);final int delimLen = getDelimiterMatcher().isMatch(srcChars, start, start, len);
        __CLR4_5_2fvofvolvha7brx.R.inc(20787);if ((((delimLen > 0)&&(__CLR4_5_2fvofvolvha7brx.R.iget(20788)!=0|true))||(__CLR4_5_2fvofvolvha7brx.R.iget(20789)==0&false))) {{
            __CLR4_5_2fvofvolvha7brx.R.inc(20790);addToken(tokenList, StringUtils.EMPTY);
            __CLR4_5_2fvofvolvha7brx.R.inc(20791);return start + delimLen;
        }
        
        // handle found token
        }__CLR4_5_2fvofvolvha7brx.R.inc(20792);final int quoteLen = getQuoteMatcher().isMatch(srcChars, start, start, len);
        __CLR4_5_2fvofvolvha7brx.R.inc(20793);if ((((quoteLen > 0)&&(__CLR4_5_2fvofvolvha7brx.R.iget(20794)!=0|true))||(__CLR4_5_2fvofvolvha7brx.R.iget(20795)==0&false))) {{
            __CLR4_5_2fvofvolvha7brx.R.inc(20796);return readWithQuotes(srcChars, start + quoteLen, len, workArea, tokenList, start, quoteLen);
        }
        }__CLR4_5_2fvofvolvha7brx.R.inc(20797);return readWithQuotes(srcChars, start, len, workArea, tokenList, 0, 0);
    }finally{__CLR4_5_2fvofvolvha7brx.R.flushNeeded();}}

    /**
     * Reads a possibly quoted string token.
     *
     * @param srcChars  the character array being tokenized
     * @param start  the first character of field
     * @param len  the length of the character array being tokenized
     * @param workArea  a temporary work area
     * @param tokenList  the list of parsed tokens
     * @param quoteStart  the start position of the matched quote, 0 if no quoting
     * @param quoteLen  the length of the matched quote, 0 if no quoting
     * @return the starting position of the next field (the character
     *  immediately after the delimiter, or if end of string found,
     *  then the length of string
     */
    private int readWithQuotes(final char[] srcChars, final int start, final int len, final StrBuilder workArea, 
                               final List<String> tokenList, final int quoteStart, final int quoteLen) {try{__CLR4_5_2fvofvolvha7brx.R.inc(20798);
        // Loop until we've found the end of the quoted
        // string or the end of the input
        __CLR4_5_2fvofvolvha7brx.R.inc(20799);workArea.clear();
        __CLR4_5_2fvofvolvha7brx.R.inc(20800);int pos = start;
        __CLR4_5_2fvofvolvha7brx.R.inc(20801);boolean quoting = quoteLen > 0;
        __CLR4_5_2fvofvolvha7brx.R.inc(20802);int trimStart = 0;
        
        __CLR4_5_2fvofvolvha7brx.R.inc(20803);while ((((pos < len)&&(__CLR4_5_2fvofvolvha7brx.R.iget(20804)!=0|true))||(__CLR4_5_2fvofvolvha7brx.R.iget(20805)==0&false))) {{
            // quoting mode can occur several times throughout a string
            // we must switch between quoting and non-quoting until we
            // encounter a non-quoted delimiter, or end of string
            __CLR4_5_2fvofvolvha7brx.R.inc(20806);if ((((quoting)&&(__CLR4_5_2fvofvolvha7brx.R.iget(20807)!=0|true))||(__CLR4_5_2fvofvolvha7brx.R.iget(20808)==0&false))) {{
                // In quoting mode
                
                // If we've found a quote character, see if it's
                // followed by a second quote.  If so, then we need
                // to actually put the quote character into the token
                // rather than end the token.
                __CLR4_5_2fvofvolvha7brx.R.inc(20809);if ((((isQuote(srcChars, pos, len, quoteStart, quoteLen))&&(__CLR4_5_2fvofvolvha7brx.R.iget(20810)!=0|true))||(__CLR4_5_2fvofvolvha7brx.R.iget(20811)==0&false))) {{
                    __CLR4_5_2fvofvolvha7brx.R.inc(20812);if ((((isQuote(srcChars, pos + quoteLen, len, quoteStart, quoteLen))&&(__CLR4_5_2fvofvolvha7brx.R.iget(20813)!=0|true))||(__CLR4_5_2fvofvolvha7brx.R.iget(20814)==0&false))) {{
                        // matched pair of quotes, thus an escaped quote
                        __CLR4_5_2fvofvolvha7brx.R.inc(20815);workArea.append(srcChars, pos, quoteLen);
                        __CLR4_5_2fvofvolvha7brx.R.inc(20816);pos += quoteLen * 2;
                        __CLR4_5_2fvofvolvha7brx.R.inc(20817);trimStart = workArea.size();
                        __CLR4_5_2fvofvolvha7brx.R.inc(20818);continue;
                    }
                    
                    // end of quoting
                    }__CLR4_5_2fvofvolvha7brx.R.inc(20819);quoting = false;
                    __CLR4_5_2fvofvolvha7brx.R.inc(20820);pos += quoteLen;
                    __CLR4_5_2fvofvolvha7brx.R.inc(20821);continue;
                }
                
                // copy regular character from inside quotes
                }__CLR4_5_2fvofvolvha7brx.R.inc(20822);workArea.append(srcChars[pos++]);
                __CLR4_5_2fvofvolvha7brx.R.inc(20823);trimStart = workArea.size();
                
            } }else {{
                // Not in quoting mode
                
                // check for delimiter, and thus end of token
                __CLR4_5_2fvofvolvha7brx.R.inc(20824);final int delimLen = getDelimiterMatcher().isMatch(srcChars, pos, start, len);
                __CLR4_5_2fvofvolvha7brx.R.inc(20825);if ((((delimLen > 0)&&(__CLR4_5_2fvofvolvha7brx.R.iget(20826)!=0|true))||(__CLR4_5_2fvofvolvha7brx.R.iget(20827)==0&false))) {{
                    // return condition when end of token found
                    __CLR4_5_2fvofvolvha7brx.R.inc(20828);addToken(tokenList, workArea.substring(0, trimStart));
                    __CLR4_5_2fvofvolvha7brx.R.inc(20829);return pos + delimLen;
                }
                
                // check for quote, and thus back into quoting mode
                }__CLR4_5_2fvofvolvha7brx.R.inc(20830);if ((((quoteLen > 0 && isQuote(srcChars, pos, len, quoteStart, quoteLen))&&(__CLR4_5_2fvofvolvha7brx.R.iget(20831)!=0|true))||(__CLR4_5_2fvofvolvha7brx.R.iget(20832)==0&false))) {{
                    __CLR4_5_2fvofvolvha7brx.R.inc(20833);quoting = true;
                    __CLR4_5_2fvofvolvha7brx.R.inc(20834);pos += quoteLen;
                    __CLR4_5_2fvofvolvha7brx.R.inc(20835);continue;
                }
                
                // check for ignored (outside quotes), and ignore
                }__CLR4_5_2fvofvolvha7brx.R.inc(20836);final int ignoredLen = getIgnoredMatcher().isMatch(srcChars, pos, start, len);
                __CLR4_5_2fvofvolvha7brx.R.inc(20837);if ((((ignoredLen > 0)&&(__CLR4_5_2fvofvolvha7brx.R.iget(20838)!=0|true))||(__CLR4_5_2fvofvolvha7brx.R.iget(20839)==0&false))) {{
                    __CLR4_5_2fvofvolvha7brx.R.inc(20840);pos += ignoredLen;
                    __CLR4_5_2fvofvolvha7brx.R.inc(20841);continue;
                }
                
                // check for trimmed character
                // don't yet know if its at the end, so copy to workArea
                // use trimStart to keep track of trim at the end
                }__CLR4_5_2fvofvolvha7brx.R.inc(20842);final int trimmedLen = getTrimmerMatcher().isMatch(srcChars, pos, start, len);
                __CLR4_5_2fvofvolvha7brx.R.inc(20843);if ((((trimmedLen > 0)&&(__CLR4_5_2fvofvolvha7brx.R.iget(20844)!=0|true))||(__CLR4_5_2fvofvolvha7brx.R.iget(20845)==0&false))) {{
                    __CLR4_5_2fvofvolvha7brx.R.inc(20846);workArea.append(srcChars, pos, trimmedLen);
                    __CLR4_5_2fvofvolvha7brx.R.inc(20847);pos += trimmedLen;
                    __CLR4_5_2fvofvolvha7brx.R.inc(20848);continue;
                }
                
                // copy regular character from outside quotes
                }__CLR4_5_2fvofvolvha7brx.R.inc(20849);workArea.append(srcChars[pos++]);
                __CLR4_5_2fvofvolvha7brx.R.inc(20850);trimStart = workArea.size();
            }
        }}
        
        // return condition when end of string found
        }__CLR4_5_2fvofvolvha7brx.R.inc(20851);addToken(tokenList, workArea.substring(0, trimStart));
        __CLR4_5_2fvofvolvha7brx.R.inc(20852);return -1;
    }finally{__CLR4_5_2fvofvolvha7brx.R.flushNeeded();}}

    /**
     * Checks if the characters at the index specified match the quote
     * already matched in readNextToken().
     *
     * @param srcChars  the character array being tokenized
     * @param pos  the position to check for a quote
     * @param len  the length of the character array being tokenized
     * @param quoteStart  the start position of the matched quote, 0 if no quoting
     * @param quoteLen  the length of the matched quote, 0 if no quoting
     * @return true if a quote is matched
     */
    private boolean isQuote(final char[] srcChars, final int pos, final int len, final int quoteStart, final int quoteLen) {try{__CLR4_5_2fvofvolvha7brx.R.inc(20853);
        __CLR4_5_2fvofvolvha7brx.R.inc(20854);for (int i = 0; (((i < quoteLen)&&(__CLR4_5_2fvofvolvha7brx.R.iget(20855)!=0|true))||(__CLR4_5_2fvofvolvha7brx.R.iget(20856)==0&false)); i++) {{
            __CLR4_5_2fvofvolvha7brx.R.inc(20857);if ((((pos + i >= len || srcChars[pos + i] != srcChars[quoteStart + i])&&(__CLR4_5_2fvofvolvha7brx.R.iget(20858)!=0|true))||(__CLR4_5_2fvofvolvha7brx.R.iget(20859)==0&false))) {{
                __CLR4_5_2fvofvolvha7brx.R.inc(20860);return false;
            }
        }}
        }__CLR4_5_2fvofvolvha7brx.R.inc(20861);return true;
    }finally{__CLR4_5_2fvofvolvha7brx.R.flushNeeded();}}

    // Delimiter
    //-----------------------------------------------------------------------
    /**
     * Gets the field delimiter matcher.
     *
     * @return the delimiter matcher in use
     */
    public StrMatcher getDelimiterMatcher() {try{__CLR4_5_2fvofvolvha7brx.R.inc(20862);
        __CLR4_5_2fvofvolvha7brx.R.inc(20863);return this.delimMatcher;
    }finally{__CLR4_5_2fvofvolvha7brx.R.flushNeeded();}}

    /**
     * Sets the field delimiter matcher.
     * <p>
     * The delimitier is used to separate one token from another.
     *
     * @param delim  the delimiter matcher to use
     * @return this, to enable chaining
     */
    public StrTokenizer setDelimiterMatcher(final StrMatcher delim) {try{__CLR4_5_2fvofvolvha7brx.R.inc(20864);
        __CLR4_5_2fvofvolvha7brx.R.inc(20865);if ((((delim == null)&&(__CLR4_5_2fvofvolvha7brx.R.iget(20866)!=0|true))||(__CLR4_5_2fvofvolvha7brx.R.iget(20867)==0&false))) {{
            __CLR4_5_2fvofvolvha7brx.R.inc(20868);this.delimMatcher = StrMatcher.noneMatcher();
        } }else {{
            __CLR4_5_2fvofvolvha7brx.R.inc(20869);this.delimMatcher = delim;
        }
        }__CLR4_5_2fvofvolvha7brx.R.inc(20870);return this;
    }finally{__CLR4_5_2fvofvolvha7brx.R.flushNeeded();}}

    /**
     * Sets the field delimiter character.
     *
     * @param delim  the delimiter character to use
     * @return this, to enable chaining
     */
    public StrTokenizer setDelimiterChar(final char delim) {try{__CLR4_5_2fvofvolvha7brx.R.inc(20871);
        __CLR4_5_2fvofvolvha7brx.R.inc(20872);return setDelimiterMatcher(StrMatcher.charMatcher(delim));
    }finally{__CLR4_5_2fvofvolvha7brx.R.flushNeeded();}}

    /**
     * Sets the field delimiter string.
     *
     * @param delim  the delimiter string to use
     * @return this, to enable chaining
     */
    public StrTokenizer setDelimiterString(final String delim) {try{__CLR4_5_2fvofvolvha7brx.R.inc(20873);
        __CLR4_5_2fvofvolvha7brx.R.inc(20874);return setDelimiterMatcher(StrMatcher.stringMatcher(delim));
    }finally{__CLR4_5_2fvofvolvha7brx.R.flushNeeded();}}

    // Quote
    //-----------------------------------------------------------------------
    /**
     * Gets the quote matcher currently in use.
     * <p>
     * The quote character is used to wrap data between the tokens.
     * This enables delimiters to be entered as data.
     * The default value is '"' (double quote).
     *
     * @return the quote matcher in use
     */
    public StrMatcher getQuoteMatcher() {try{__CLR4_5_2fvofvolvha7brx.R.inc(20875);
        __CLR4_5_2fvofvolvha7brx.R.inc(20876);return quoteMatcher;
    }finally{__CLR4_5_2fvofvolvha7brx.R.flushNeeded();}}

    /**
     * Set the quote matcher to use.
     * <p>
     * The quote character is used to wrap data between the tokens.
     * This enables delimiters to be entered as data.
     *
     * @param quote  the quote matcher to use, null ignored
     * @return this, to enable chaining
     */
    public StrTokenizer setQuoteMatcher(final StrMatcher quote) {try{__CLR4_5_2fvofvolvha7brx.R.inc(20877);
        __CLR4_5_2fvofvolvha7brx.R.inc(20878);if ((((quote != null)&&(__CLR4_5_2fvofvolvha7brx.R.iget(20879)!=0|true))||(__CLR4_5_2fvofvolvha7brx.R.iget(20880)==0&false))) {{
            __CLR4_5_2fvofvolvha7brx.R.inc(20881);this.quoteMatcher = quote;
        }
        }__CLR4_5_2fvofvolvha7brx.R.inc(20882);return this;
    }finally{__CLR4_5_2fvofvolvha7brx.R.flushNeeded();}}

    /**
     * Sets the quote character to use.
     * <p>
     * The quote character is used to wrap data between the tokens.
     * This enables delimiters to be entered as data.
     *
     * @param quote  the quote character to use
     * @return this, to enable chaining
     */
    public StrTokenizer setQuoteChar(final char quote) {try{__CLR4_5_2fvofvolvha7brx.R.inc(20883);
        __CLR4_5_2fvofvolvha7brx.R.inc(20884);return setQuoteMatcher(StrMatcher.charMatcher(quote));
    }finally{__CLR4_5_2fvofvolvha7brx.R.flushNeeded();}}

    // Ignored
    //-----------------------------------------------------------------------
    /**
     * Gets the ignored character matcher.
     * <p>
     * These characters are ignored when parsing the String, unless they are
     * within a quoted region.
     * The default value is not to ignore anything.
     *
     * @return the ignored matcher in use
     */
    public StrMatcher getIgnoredMatcher() {try{__CLR4_5_2fvofvolvha7brx.R.inc(20885);
        __CLR4_5_2fvofvolvha7brx.R.inc(20886);return ignoredMatcher;
    }finally{__CLR4_5_2fvofvolvha7brx.R.flushNeeded();}}

    /**
     * Set the matcher for characters to ignore.
     * <p>
     * These characters are ignored when parsing the String, unless they are
     * within a quoted region.
     *
     * @param ignored  the ignored matcher to use, null ignored
     * @return this, to enable chaining
     */
    public StrTokenizer setIgnoredMatcher(final StrMatcher ignored) {try{__CLR4_5_2fvofvolvha7brx.R.inc(20887);
        __CLR4_5_2fvofvolvha7brx.R.inc(20888);if ((((ignored != null)&&(__CLR4_5_2fvofvolvha7brx.R.iget(20889)!=0|true))||(__CLR4_5_2fvofvolvha7brx.R.iget(20890)==0&false))) {{
            __CLR4_5_2fvofvolvha7brx.R.inc(20891);this.ignoredMatcher = ignored;
        }
        }__CLR4_5_2fvofvolvha7brx.R.inc(20892);return this;
    }finally{__CLR4_5_2fvofvolvha7brx.R.flushNeeded();}}

    /**
     * Set the character to ignore.
     * <p>
     * This character is ignored when parsing the String, unless it is
     * within a quoted region.
     *
     * @param ignored  the ignored character to use
     * @return this, to enable chaining
     */
    public StrTokenizer setIgnoredChar(final char ignored) {try{__CLR4_5_2fvofvolvha7brx.R.inc(20893);
        __CLR4_5_2fvofvolvha7brx.R.inc(20894);return setIgnoredMatcher(StrMatcher.charMatcher(ignored));
    }finally{__CLR4_5_2fvofvolvha7brx.R.flushNeeded();}}

    // Trimmer
    //-----------------------------------------------------------------------
    /**
     * Gets the trimmer character matcher.
     * <p>
     * These characters are trimmed off on each side of the delimiter
     * until the token or quote is found.
     * The default value is not to trim anything.
     *
     * @return the trimmer matcher in use
     */
    public StrMatcher getTrimmerMatcher() {try{__CLR4_5_2fvofvolvha7brx.R.inc(20895);
        __CLR4_5_2fvofvolvha7brx.R.inc(20896);return trimmerMatcher;
    }finally{__CLR4_5_2fvofvolvha7brx.R.flushNeeded();}}

    /**
     * Sets the matcher for characters to trim.
     * <p>
     * These characters are trimmed off on each side of the delimiter
     * until the token or quote is found.
     *
     * @param trimmer  the trimmer matcher to use, null ignored
     * @return this, to enable chaining
     */
    public StrTokenizer setTrimmerMatcher(final StrMatcher trimmer) {try{__CLR4_5_2fvofvolvha7brx.R.inc(20897);
        __CLR4_5_2fvofvolvha7brx.R.inc(20898);if ((((trimmer != null)&&(__CLR4_5_2fvofvolvha7brx.R.iget(20899)!=0|true))||(__CLR4_5_2fvofvolvha7brx.R.iget(20900)==0&false))) {{
            __CLR4_5_2fvofvolvha7brx.R.inc(20901);this.trimmerMatcher = trimmer;
        }
        }__CLR4_5_2fvofvolvha7brx.R.inc(20902);return this;
    }finally{__CLR4_5_2fvofvolvha7brx.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Gets whether the tokenizer currently returns empty tokens as null.
     * The default for this property is false.
     *
     * @return true if empty tokens are returned as null
     */
    public boolean isEmptyTokenAsNull() {try{__CLR4_5_2fvofvolvha7brx.R.inc(20903);
        __CLR4_5_2fvofvolvha7brx.R.inc(20904);return this.emptyAsNull;
    }finally{__CLR4_5_2fvofvolvha7brx.R.flushNeeded();}}

    /**
     * Sets whether the tokenizer should return empty tokens as null.
     * The default for this property is false.
     *
     * @param emptyAsNull  whether empty tokens are returned as null
     * @return this, to enable chaining
     */
    public StrTokenizer setEmptyTokenAsNull(final boolean emptyAsNull) {try{__CLR4_5_2fvofvolvha7brx.R.inc(20905);
        __CLR4_5_2fvofvolvha7brx.R.inc(20906);this.emptyAsNull = emptyAsNull;
        __CLR4_5_2fvofvolvha7brx.R.inc(20907);return this;
    }finally{__CLR4_5_2fvofvolvha7brx.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Gets whether the tokenizer currently ignores empty tokens.
     * The default for this property is true.
     *
     * @return true if empty tokens are not returned
     */
    public boolean isIgnoreEmptyTokens() {try{__CLR4_5_2fvofvolvha7brx.R.inc(20908);
        __CLR4_5_2fvofvolvha7brx.R.inc(20909);return ignoreEmptyTokens;
    }finally{__CLR4_5_2fvofvolvha7brx.R.flushNeeded();}}

    /**
     * Sets whether the tokenizer should ignore and not return empty tokens.
     * The default for this property is true.
     *
     * @param ignoreEmptyTokens  whether empty tokens are not returned
     * @return this, to enable chaining
     */
    public StrTokenizer setIgnoreEmptyTokens(final boolean ignoreEmptyTokens) {try{__CLR4_5_2fvofvolvha7brx.R.inc(20910);
        __CLR4_5_2fvofvolvha7brx.R.inc(20911);this.ignoreEmptyTokens = ignoreEmptyTokens;
        __CLR4_5_2fvofvolvha7brx.R.inc(20912);return this;
    }finally{__CLR4_5_2fvofvolvha7brx.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Gets the String content that the tokenizer is parsing.
     *
     * @return the string content being parsed
     */
    public String getContent() {try{__CLR4_5_2fvofvolvha7brx.R.inc(20913);
        __CLR4_5_2fvofvolvha7brx.R.inc(20914);if ((((chars == null)&&(__CLR4_5_2fvofvolvha7brx.R.iget(20915)!=0|true))||(__CLR4_5_2fvofvolvha7brx.R.iget(20916)==0&false))) {{
            __CLR4_5_2fvofvolvha7brx.R.inc(20917);return null;
        }
        }__CLR4_5_2fvofvolvha7brx.R.inc(20918);return new String(chars);
    }finally{__CLR4_5_2fvofvolvha7brx.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Creates a new instance of this Tokenizer. The new instance is reset so
     * that it will be at the start of the token list.
     * If a {@link CloneNotSupportedException} is caught, return <code>null</code>.
     * 
     * @return a new instance of this Tokenizer which has been reset.
     */
    @Override
    public Object clone() {try{__CLR4_5_2fvofvolvha7brx.R.inc(20919);
        __CLR4_5_2fvofvolvha7brx.R.inc(20920);try {
            __CLR4_5_2fvofvolvha7brx.R.inc(20921);return cloneReset();
        } catch (final CloneNotSupportedException ex) {
            __CLR4_5_2fvofvolvha7brx.R.inc(20922);return null;
        }
    }finally{__CLR4_5_2fvofvolvha7brx.R.flushNeeded();}}

    /**
     * Creates a new instance of this Tokenizer. The new instance is reset so that
     * it will be at the start of the token list.
     * 
     * @return a new instance of this Tokenizer which has been reset.
     * @throws CloneNotSupportedException if there is a problem cloning
     */
    Object cloneReset() throws CloneNotSupportedException {try{__CLR4_5_2fvofvolvha7brx.R.inc(20923);
        // this method exists to enable 100% test coverage
        __CLR4_5_2fvofvolvha7brx.R.inc(20924);final StrTokenizer cloned = (StrTokenizer) super.clone();
        __CLR4_5_2fvofvolvha7brx.R.inc(20925);if ((((cloned.chars != null)&&(__CLR4_5_2fvofvolvha7brx.R.iget(20926)!=0|true))||(__CLR4_5_2fvofvolvha7brx.R.iget(20927)==0&false))) {{
            __CLR4_5_2fvofvolvha7brx.R.inc(20928);cloned.chars = cloned.chars.clone();
        }
        }__CLR4_5_2fvofvolvha7brx.R.inc(20929);cloned.reset();
        __CLR4_5_2fvofvolvha7brx.R.inc(20930);return cloned;
    }finally{__CLR4_5_2fvofvolvha7brx.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Gets the String content that the tokenizer is parsing.
     *
     * @return the string content being parsed
     */
    @Override
    public String toString() {try{__CLR4_5_2fvofvolvha7brx.R.inc(20931);
        __CLR4_5_2fvofvolvha7brx.R.inc(20932);if ((((tokens == null)&&(__CLR4_5_2fvofvolvha7brx.R.iget(20933)!=0|true))||(__CLR4_5_2fvofvolvha7brx.R.iget(20934)==0&false))) {{
            __CLR4_5_2fvofvolvha7brx.R.inc(20935);return "StrTokenizer[not tokenized yet]";
        }
        }__CLR4_5_2fvofvolvha7brx.R.inc(20936);return "StrTokenizer" + getTokenList();
    }finally{__CLR4_5_2fvofvolvha7brx.R.flushNeeded();}}

}
