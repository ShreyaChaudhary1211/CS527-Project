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
package org.apache.commons.lang3;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.regex.Pattern;

/**
 * <p>Operations on {@link java.lang.String} that are
 * {@code null} safe.</p>
 *
 * <ul>
 *  <li><b>IsEmpty/IsBlank</b>
 *      - checks if a String contains text</li>
 *  <li><b>Trim/Strip</b>
 *      - removes leading and trailing whitespace</li>
 *  <li><b>Equals/Compare</b>
 *      - compares two strings null-safe</li>
 *  <li><b>startsWith</b>
 *      - check if a String starts with a prefix null-safe</li>
 *  <li><b>endsWith</b>
 *      - check if a String ends with a suffix null-safe</li>
 *  <li><b>IndexOf/LastIndexOf/Contains</b>
 *      - null-safe index-of checks
 *  <li><b>IndexOfAny/LastIndexOfAny/IndexOfAnyBut/LastIndexOfAnyBut</b>
 *      - index-of any of a set of Strings</li>
 *  <li><b>ContainsOnly/ContainsNone/ContainsAny</b>
 *      - does String contains only/none/any of these characters</li>
 *  <li><b>Substring/Left/Right/Mid</b>
 *      - null-safe substring extractions</li>
 *  <li><b>SubstringBefore/SubstringAfter/SubstringBetween</b>
 *      - substring extraction relative to other strings</li>
 *  <li><b>Split/Join</b>
 *      - splits a String into an array of substrings and vice versa</li>
 *  <li><b>Remove/Delete</b>
 *      - removes part of a String</li>
 *  <li><b>Replace/Overlay</b>
 *      - Searches a String and replaces one String with another</li>
 *  <li><b>Chomp/Chop</b>
 *      - removes the last part of a String</li>
 *  <li><b>AppendIfMissing</b>
 *      - appends a suffix to the end of the String if not present</li>
 *  <li><b>PrependIfMissing</b>
 *      - prepends a prefix to the start of the String if not present</li>
 *  <li><b>LeftPad/RightPad/Center/Repeat</b>
 *      - pads a String</li>
 *  <li><b>UpperCase/LowerCase/SwapCase/Capitalize/Uncapitalize</b>
 *      - changes the case of a String</li>
 *  <li><b>CountMatches</b>
 *      - counts the number of occurrences of one String in another</li>
 *  <li><b>IsAlpha/IsNumeric/IsWhitespace/IsAsciiPrintable</b>
 *      - checks the characters in a String</li>
 *  <li><b>DefaultString</b>
 *      - protects against a null input String</li>
 *  <li><b>Rotate</b>
 *      - rotate (circular shift) a String</li>
 *  <li><b>Reverse/ReverseDelimited</b>
 *      - reverses a String</li>
 *  <li><b>Abbreviate</b>
 *      - abbreviates a string using ellipsis or another given String</li>
 *  <li><b>Difference</b>
 *      - compares Strings and reports on their differences</li>
 *  <li><b>LevenshteinDistance</b>
 *      - the number of changes needed to change one String into another</li>
 * </ul>
 *
 * <p>The {@code StringUtils} class defines certain words related to
 * String handling.</p>
 *
 * <ul>
 *  <li>null - {@code null}</li>
 *  <li>empty - a zero-length string ({@code ""})</li>
 *  <li>space - the space character ({@code ' '}, char 32)</li>
 *  <li>whitespace - the characters defined by {@link Character#isWhitespace(char)}</li>
 *  <li>trim - the characters &lt;= 32 as in {@link String#trim()}</li>
 * </ul>
 *
 * <p>{@code StringUtils} handles {@code null} input Strings quietly.
 * That is to say that a {@code null} input will return {@code null}.
 * Where a {@code boolean} or {@code int} is being returned
 * details vary by method.</p>
 *
 * <p>A side effect of the {@code null} handling is that a
 * {@code NullPointerException} should be considered a bug in
 * {@code StringUtils}.</p>
 *
 * <p>Methods in this class give sample code to explain their operation.
 * The symbol {@code *} is used to indicate any input including {@code null}.</p>
 *
 * <p>#ThreadSafe#</p>
 * @see java.lang.String
 * @since 1.0
 */
//@Immutable
@java.lang.SuppressWarnings({"fallthrough"}) public class StringUtils {public static class __CLR4_5_25lh5lhlvha79yz{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172755542L,8589935092L,10286,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    // Performance testing notes (JDK 1.4, Jul03, scolebourne)
    // Whitespace:
    // Character.isWhitespace() is faster than WHITESPACE.indexOf()
    // where WHITESPACE is a string of all whitespace characters
    //
    // Character access:
    // String.charAt(n) versus toCharArray(), then array[n]
    // String.charAt(n) is about 15% worse for a 10K string
    // They are about equal for a length 50 string
    // String.charAt(n) is about 4 times better for a length 3 string
    // String.charAt(n) is best bet overall
    //
    // Append:
    // String.concat about twice as fast as StringBuffer.append
    // (not sure who tested this)

    /**
     * A String for a space character.
     *
     * @since 3.2
     */
    public static final String SPACE = " ";

    /**
     * The empty String {@code ""}.
     * @since 2.0
     */
    public static final String EMPTY = "";

    /**
     * A String for linefeed LF ("\n").
     *
     * @see <a href="http://docs.oracle.com/javase/specs/jls/se7/html/jls-3.html#jls-3.10.6">JLF: Escape Sequences
     *      for Character and String Literals</a>
     * @since 3.2
     */
    public static final String LF = "\n";

    /**
     * A String for carriage return CR ("\r").
     *
     * @see <a href="http://docs.oracle.com/javase/specs/jls/se7/html/jls-3.html#jls-3.10.6">JLF: Escape Sequences
     *      for Character and String Literals</a>
     * @since 3.2
     */
    public static final String CR = "\r";

    /**
     * Represents a failed index search.
     * @since 2.1
     */
    public static final int INDEX_NOT_FOUND = -1;

    /**
     * <p>The maximum size to which the padding constant(s) can expand.</p>
     */
    private static final int PAD_LIMIT = 8192;

    /**
     * <p>{@code StringUtils} instances should NOT be constructed in
     * standard programming. Instead, the class should be used as
     * {@code StringUtils.trim(" foo ");}.</p>
     *
     * <p>This constructor is public to permit tools that require a JavaBean
     * instance to operate.</p>
     */
    public StringUtils() {
        super();__CLR4_5_25lh5lhlvha79yz.R.inc(7254);try{__CLR4_5_25lh5lhlvha79yz.R.inc(7253);
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    // Empty checks
    //-----------------------------------------------------------------------
    /**
     * <p>Checks if a CharSequence is empty ("") or null.</p>
     *
     * <pre>
     * StringUtils.isEmpty(null)      = true
     * StringUtils.isEmpty("")        = true
     * StringUtils.isEmpty(" ")       = false
     * StringUtils.isEmpty("bob")     = false
     * StringUtils.isEmpty("  bob  ") = false
     * </pre>
     *
     * <p>NOTE: This method changed in Lang version 2.0.
     * It no longer trims the CharSequence.
     * That functionality is available in isBlank().</p>
     *
     * @param cs  the CharSequence to check, may be null
     * @return {@code true} if the CharSequence is empty or null
     * @since 3.0 Changed signature from isEmpty(String) to isEmpty(CharSequence)
     */
    public static boolean isEmpty(final CharSequence cs) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(7255);
        __CLR4_5_25lh5lhlvha79yz.R.inc(7256);return cs == null || cs.length() == 0;
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    /**
     * <p>Checks if a CharSequence is not empty ("") and not null.</p>
     *
     * <pre>
     * StringUtils.isNotEmpty(null)      = false
     * StringUtils.isNotEmpty("")        = false
     * StringUtils.isNotEmpty(" ")       = true
     * StringUtils.isNotEmpty("bob")     = true
     * StringUtils.isNotEmpty("  bob  ") = true
     * </pre>
     *
     * @param cs  the CharSequence to check, may be null
     * @return {@code true} if the CharSequence is not empty and not null
     * @since 3.0 Changed signature from isNotEmpty(String) to isNotEmpty(CharSequence)
     */
    public static boolean isNotEmpty(final CharSequence cs) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(7257);
        __CLR4_5_25lh5lhlvha79yz.R.inc(7258);return !isEmpty(cs);
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}
       
    /**
     * <p>Checks if any of the CharSequences are empty ("") or null.</p>
     *
     * <pre>
     * StringUtils.isAnyEmpty(null)             = true
     * StringUtils.isAnyEmpty(null, "foo")      = true
     * StringUtils.isAnyEmpty("", "bar")        = true
     * StringUtils.isAnyEmpty("bob", "")        = true
     * StringUtils.isAnyEmpty("  bob  ", null)  = true
     * StringUtils.isAnyEmpty(" ", "bar")       = false
     * StringUtils.isAnyEmpty("foo", "bar")     = false
     * </pre>
     *
     * @param css  the CharSequences to check, may be null or empty
     * @return {@code true} if any of the CharSequences are empty or null
     * @since 3.2
     */
    public static boolean isAnyEmpty(final CharSequence... css) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(7259);
      __CLR4_5_25lh5lhlvha79yz.R.inc(7260);if ((((ArrayUtils.isEmpty(css))&&(__CLR4_5_25lh5lhlvha79yz.R.iget(7261)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(7262)==0&false))) {{
        __CLR4_5_25lh5lhlvha79yz.R.inc(7263);return false;
      }
      }__CLR4_5_25lh5lhlvha79yz.R.inc(7264);for (final CharSequence cs : css){{
        __CLR4_5_25lh5lhlvha79yz.R.inc(7265);if ((((isEmpty(cs))&&(__CLR4_5_25lh5lhlvha79yz.R.iget(7266)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(7267)==0&false))) {{
          __CLR4_5_25lh5lhlvha79yz.R.inc(7268);return true;
        }
      }}
      }__CLR4_5_25lh5lhlvha79yz.R.inc(7269);return false;
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    /**
     * <p>Checks if none of the CharSequences are empty ("") or null.</p>
     *
     * <pre>
     * StringUtils.isNoneEmpty(null)             = false
     * StringUtils.isNoneEmpty(null, "foo")      = false
     * StringUtils.isNoneEmpty("", "bar")        = false
     * StringUtils.isNoneEmpty("bob", "")        = false
     * StringUtils.isNoneEmpty("  bob  ", null)  = false
     * StringUtils.isNoneEmpty(new String[] {})  = false
     * StringUtils.isNoneEmpty(" ", "bar")       = true
     * StringUtils.isNoneEmpty("foo", "bar")     = true
     * </pre>
     *
     * @param css  the CharSequences to check, may be null or empty
     * @return {@code true} if none of the CharSequences are empty or null
     * @since 3.2
     */
    public static boolean isNoneEmpty(final CharSequence... css) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(7270);
      __CLR4_5_25lh5lhlvha79yz.R.inc(7271);return !isAnyEmpty(css);
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    /**
     * <p>Checks if all of the CharSequences are empty ("") or null.</p>
     *
     * <pre>
     * StringUtils.isAllEmpty(null)             = true
     * StringUtils.isAllEmpty(null, "")         = true
     * StringUtils.isAllEmpty(new String[] {})  = true
     * StringUtils.isAllEmpty(null, "foo")      = false
     * StringUtils.isAllEmpty("", "bar")        = false
     * StringUtils.isAllEmpty("bob", "")        = false
     * StringUtils.isAllEmpty("  bob  ", null)  = false
     * StringUtils.isAllEmpty(" ", "bar")       = false
     * StringUtils.isAllEmpty("foo", "bar")     = false
     * </pre>
     *
     * @param css  the CharSequences to check, may be null or empty
     * @return {@code true} if all of the CharSequences are empty or null
     * @since 3.6
     */
    public static boolean isAllEmpty(final CharSequence... css) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(7272);
        __CLR4_5_25lh5lhlvha79yz.R.inc(7273);if ((((ArrayUtils.isEmpty(css))&&(__CLR4_5_25lh5lhlvha79yz.R.iget(7274)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(7275)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(7276);return true;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(7277);for (final CharSequence cs : css) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(7278);if ((((isNotEmpty(cs))&&(__CLR4_5_25lh5lhlvha79yz.R.iget(7279)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(7280)==0&false))) {{
                __CLR4_5_25lh5lhlvha79yz.R.inc(7281);return false;
            }
        }}
        }__CLR4_5_25lh5lhlvha79yz.R.inc(7282);return true;
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    /**
     * <p>Checks if a CharSequence is empty (""), null or whitespace only.</p>
     * 
     * <p>Whitespace is defined by {@link Character#isWhitespace(char)}.</p>
     *
     * <pre>
     * StringUtils.isBlank(null)      = true
     * StringUtils.isBlank("")        = true
     * StringUtils.isBlank(" ")       = true
     * StringUtils.isBlank("bob")     = false
     * StringUtils.isBlank("  bob  ") = false
     * </pre>
     *
     * @param cs  the CharSequence to check, may be null
     * @return {@code true} if the CharSequence is null, empty or whitespace only
     * @since 2.0
     * @since 3.0 Changed signature from isBlank(String) to isBlank(CharSequence)
     */
    public static boolean isBlank(final CharSequence cs) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(7283);
        __CLR4_5_25lh5lhlvha79yz.R.inc(7284);int strLen;
        __CLR4_5_25lh5lhlvha79yz.R.inc(7285);if (cs == null || (strLen = cs.length()) == 0) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(7288);return true;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(7289);for (int i = 0; (((i < strLen)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(7290)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(7291)==0&false)); i++) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(7292);if ((((Character.isWhitespace(cs.charAt(i)) == false)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(7293)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(7294)==0&false))) {{
                __CLR4_5_25lh5lhlvha79yz.R.inc(7295);return false;
            }
        }}
        }__CLR4_5_25lh5lhlvha79yz.R.inc(7296);return true;
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    /**
     * <p>Checks if a CharSequence is not empty (""), not null and not whitespace only.</p>
     * 
     * <p>Whitespace is defined by {@link Character#isWhitespace(char)}.</p>
     *
     * <pre>
     * StringUtils.isNotBlank(null)      = false
     * StringUtils.isNotBlank("")        = false
     * StringUtils.isNotBlank(" ")       = false
     * StringUtils.isNotBlank("bob")     = true
     * StringUtils.isNotBlank("  bob  ") = true
     * </pre>
     *
     * @param cs  the CharSequence to check, may be null
     * @return {@code true} if the CharSequence is
     *  not empty and not null and not whitespace only
     * @since 2.0
     * @since 3.0 Changed signature from isNotBlank(String) to isNotBlank(CharSequence)
     */
    public static boolean isNotBlank(final CharSequence cs) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(7297);
        __CLR4_5_25lh5lhlvha79yz.R.inc(7298);return !isBlank(cs);
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    /**
     * <p>Checks if any of the CharSequences are empty ("") or null or whitespace only.</p>
     * 
     * <p>Whitespace is defined by {@link Character#isWhitespace(char)}.</p>
     *
     * <pre>
     * StringUtils.isAnyBlank(null)             = true
     * StringUtils.isAnyBlank(null, "foo")      = true
     * StringUtils.isAnyBlank(null, null)       = true
     * StringUtils.isAnyBlank("", "bar")        = true
     * StringUtils.isAnyBlank("bob", "")        = true
     * StringUtils.isAnyBlank("  bob  ", null)  = true
     * StringUtils.isAnyBlank(" ", "bar")       = true
     * StringUtils.isAnyBlank(new String[] {})  = false
     * StringUtils.isAnyBlank("foo", "bar")     = false
     * </pre>
     *
     * @param css  the CharSequences to check, may be null or empty
     * @return {@code true} if any of the CharSequences are empty or null or whitespace only
     * @since 3.2
     */
    public static boolean isAnyBlank(final CharSequence... css) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(7299);
      __CLR4_5_25lh5lhlvha79yz.R.inc(7300);if ((((ArrayUtils.isEmpty(css))&&(__CLR4_5_25lh5lhlvha79yz.R.iget(7301)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(7302)==0&false))) {{
        __CLR4_5_25lh5lhlvha79yz.R.inc(7303);return false;
      }
      }__CLR4_5_25lh5lhlvha79yz.R.inc(7304);for (final CharSequence cs : css){{
        __CLR4_5_25lh5lhlvha79yz.R.inc(7305);if ((((isBlank(cs))&&(__CLR4_5_25lh5lhlvha79yz.R.iget(7306)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(7307)==0&false))) {{
          __CLR4_5_25lh5lhlvha79yz.R.inc(7308);return true;
        }
      }}
      }__CLR4_5_25lh5lhlvha79yz.R.inc(7309);return false;
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    /**
     * <p>Checks if none of the CharSequences are empty (""), null or whitespace only.</p>
     * 
     * <p>Whitespace is defined by {@link Character#isWhitespace(char)}.</p>
     *
     * <pre>
     * StringUtils.isNoneBlank(null)             = false
     * StringUtils.isNoneBlank(null, "foo")      = false
     * StringUtils.isNoneBlank(null, null)       = false
     * StringUtils.isNoneBlank("", "bar")        = false
     * StringUtils.isNoneBlank("bob", "")        = false
     * StringUtils.isNoneBlank("  bob  ", null)  = false
     * StringUtils.isNoneBlank(" ", "bar")       = false
     * StringUtils.isNoneBlank(new String[] {})  = false
     * StringUtils.isNoneBlank("foo", "bar")     = true
     * </pre>
     *
     * @param css  the CharSequences to check, may be null or empty
     * @return {@code true} if none of the CharSequences are empty or null or whitespace only
     * @since 3.2
     */
    public static boolean isNoneBlank(final CharSequence... css) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(7310);
      __CLR4_5_25lh5lhlvha79yz.R.inc(7311);return !isAnyBlank(css);
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    /**
     * <p>Checks if all of the CharSequences are empty (""), null or whitespace only.</p>
     *
     * <p>Whitespace is defined by {@link Character#isWhitespace(char)}.</p>
     *
     * <pre>
     * StringUtils.isAllBlank(null)             = true
     * StringUtils.isAllBlank(null, "foo")      = false
     * StringUtils.isAllBlank(null, null)       = true
     * StringUtils.isAllBlank("", "bar")        = false
     * StringUtils.isAllBlank("bob", "")        = false
     * StringUtils.isAllBlank("  bob  ", null)  = false
     * StringUtils.isAllBlank(" ", "bar")       = false
     * StringUtils.isAllBlank("foo", "bar")     = false
     * StringUtils.isAllBlank(new String[] {})  = true
     * </pre>
     *
     * @param css  the CharSequences to check, may be null or empty
     * @return {@code true} if all of the CharSequences are empty or null or whitespace only
     * @since 3.6
     */
    public static boolean isAllBlank(final CharSequence... css) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(7312);
        __CLR4_5_25lh5lhlvha79yz.R.inc(7313);if ((((ArrayUtils.isEmpty(css))&&(__CLR4_5_25lh5lhlvha79yz.R.iget(7314)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(7315)==0&false))) {{  
            __CLR4_5_25lh5lhlvha79yz.R.inc(7316);return true;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(7317);for (final CharSequence cs : css) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(7318);if ((((isNotBlank(cs))&&(__CLR4_5_25lh5lhlvha79yz.R.iget(7319)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(7320)==0&false))) {{
               __CLR4_5_25lh5lhlvha79yz.R.inc(7321);return false;
            }
        }}
        }__CLR4_5_25lh5lhlvha79yz.R.inc(7322);return true;
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    // Trim
    //-----------------------------------------------------------------------
    /**
     * <p>Removes control characters (char &lt;= 32) from both
     * ends of this String, handling {@code null} by returning
     * {@code null}.</p>
     *
     * <p>The String is trimmed using {@link String#trim()}.
     * Trim removes start and end characters &lt;= 32.
     * To strip whitespace use {@link #strip(String)}.</p>
     *
     * <p>To trim your choice of characters, use the
     * {@link #strip(String, String)} methods.</p>
     *
     * <pre>
     * StringUtils.trim(null)          = null
     * StringUtils.trim("")            = ""
     * StringUtils.trim("     ")       = ""
     * StringUtils.trim("abc")         = "abc"
     * StringUtils.trim("    abc    ") = "abc"
     * </pre>
     *
     * @param str  the String to be trimmed, may be null
     * @return the trimmed string, {@code null} if null String input
     */
    public static String trim(final String str) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(7323);
        __CLR4_5_25lh5lhlvha79yz.R.inc(7324);return (((str == null )&&(__CLR4_5_25lh5lhlvha79yz.R.iget(7325)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(7326)==0&false))? null : str.trim();
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    /**
     * <p>Removes control characters (char &lt;= 32) from both
     * ends of this String returning {@code null} if the String is
     * empty ("") after the trim or if it is {@code null}.
     *
     * <p>The String is trimmed using {@link String#trim()}.
     * Trim removes start and end characters &lt;= 32.
     * To strip whitespace use {@link #stripToNull(String)}.</p>
     *
     * <pre>
     * StringUtils.trimToNull(null)          = null
     * StringUtils.trimToNull("")            = null
     * StringUtils.trimToNull("     ")       = null
     * StringUtils.trimToNull("abc")         = "abc"
     * StringUtils.trimToNull("    abc    ") = "abc"
     * </pre>
     *
     * @param str  the String to be trimmed, may be null
     * @return the trimmed String,
     *  {@code null} if only chars &lt;= 32, empty or null String input
     * @since 2.0
     */
    public static String trimToNull(final String str) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(7327);
        __CLR4_5_25lh5lhlvha79yz.R.inc(7328);final String ts = trim(str);
        __CLR4_5_25lh5lhlvha79yz.R.inc(7329);return (((isEmpty(ts) )&&(__CLR4_5_25lh5lhlvha79yz.R.iget(7330)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(7331)==0&false))? null : ts;
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    /**
     * <p>Removes control characters (char &lt;= 32) from both
     * ends of this String returning an empty String ("") if the String
     * is empty ("") after the trim or if it is {@code null}.
     *
     * <p>The String is trimmed using {@link String#trim()}.
     * Trim removes start and end characters &lt;= 32.
     * To strip whitespace use {@link #stripToEmpty(String)}.</p>
     *
     * <pre>
     * StringUtils.trimToEmpty(null)          = ""
     * StringUtils.trimToEmpty("")            = ""
     * StringUtils.trimToEmpty("     ")       = ""
     * StringUtils.trimToEmpty("abc")         = "abc"
     * StringUtils.trimToEmpty("    abc    ") = "abc"
     * </pre>
     *
     * @param str  the String to be trimmed, may be null
     * @return the trimmed String, or an empty String if {@code null} input
     * @since 2.0
     */
    public static String trimToEmpty(final String str) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(7332);
        __CLR4_5_25lh5lhlvha79yz.R.inc(7333);return (((str == null )&&(__CLR4_5_25lh5lhlvha79yz.R.iget(7334)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(7335)==0&false))? EMPTY : str.trim();
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    /**
     * <p>Truncates a String. This will turn
     * "Now is the time for all good men" into "Now is the time for".</p>
     *
     * <p>Specifically:</p>
     * <ul>
     *   <li>If {@code str} is less than {@code maxWidth} characters
     *       long, return it.</li>
     *   <li>Else truncate it to {@code substring(str, 0, maxWidth)}.</li>
     *   <li>If {@code maxWidth} is less than {@code 0}, throw an
     *       {@code IllegalArgumentException}.</li>
     *   <li>In no case will it return a String of length greater than
     *       {@code maxWidth}.</li>
     * </ul>
     *
     * <pre>
     * StringUtils.truncate(null, 0)       = null
     * StringUtils.truncate(null, 2)       = null
     * StringUtils.truncate("", 4)         = ""
     * StringUtils.truncate("abcdefg", 4)  = "abcd"
     * StringUtils.truncate("abcdefg", 6)  = "abcdef"
     * StringUtils.truncate("abcdefg", 7)  = "abcdefg"
     * StringUtils.truncate("abcdefg", 8)  = "abcdefg"
     * StringUtils.truncate("abcdefg", -1) = throws an IllegalArgumentException
     * </pre>
     *
     * @param str  the String to truncate, may be null
     * @param maxWidth  maximum length of result String, must be positive
     * @return truncated String, {@code null} if null String input
     * @since 3.5
     */
    public static String truncate(final String str, final int maxWidth) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(7336);
        __CLR4_5_25lh5lhlvha79yz.R.inc(7337);return truncate(str, 0, maxWidth);
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    /**
     * <p>Truncates a String. This will turn
     * "Now is the time for all good men" into "is the time for all".</p>
     *
     * <p>Works like {@code truncate(String, int)}, but allows you to specify
     * a "left edge" offset.
     *
     * <p>Specifically:</p>
     * <ul>
     *   <li>If {@code str} is less than {@code maxWidth} characters
     *       long, return it.</li>
     *   <li>Else truncate it to {@code substring(str, offset, maxWidth)}.</li>
     *   <li>If {@code maxWidth} is less than {@code 0}, throw an
     *       {@code IllegalArgumentException}.</li>
     *   <li>If {@code offset} is less than {@code 0}, throw an
     *       {@code IllegalArgumentException}.</li>
     *   <li>In no case will it return a String of length greater than
     *       {@code maxWidth}.</li>
     * </ul>
     *
     * <pre>
     * StringUtils.truncate(null, 0, 0) = null
     * StringUtils.truncate(null, 2, 4) = null
     * StringUtils.truncate("", 0, 10) = ""
     * StringUtils.truncate("", 2, 10) = ""
     * StringUtils.truncate("abcdefghij", 0, 3) = "abc"
     * StringUtils.truncate("abcdefghij", 5, 6) = "fghij"
     * StringUtils.truncate("raspberry peach", 10, 15) = "peach"
     * StringUtils.truncate("abcdefghijklmno", 0, 10) = "abcdefghij"
     * StringUtils.truncate("abcdefghijklmno", -1, 10) = throws an IllegalArgumentException
     * StringUtils.truncate("abcdefghijklmno", Integer.MIN_VALUE, 10) = "abcdefghij"
     * StringUtils.truncate("abcdefghijklmno", Integer.MIN_VALUE, Integer.MAX_VALUE) = "abcdefghijklmno"
     * StringUtils.truncate("abcdefghijklmno", 0, Integer.MAX_VALUE) = "abcdefghijklmno"
     * StringUtils.truncate("abcdefghijklmno", 1, 10) = "bcdefghijk"
     * StringUtils.truncate("abcdefghijklmno", 2, 10) = "cdefghijkl"
     * StringUtils.truncate("abcdefghijklmno", 3, 10) = "defghijklm"
     * StringUtils.truncate("abcdefghijklmno", 4, 10) = "efghijklmn"
     * StringUtils.truncate("abcdefghijklmno", 5, 10) = "fghijklmno"
     * StringUtils.truncate("abcdefghijklmno", 5, 5) = "fghij"
     * StringUtils.truncate("abcdefghijklmno", 5, 3) = "fgh"
     * StringUtils.truncate("abcdefghijklmno", 10, 3) = "klm"
     * StringUtils.truncate("abcdefghijklmno", 10, Integer.MAX_VALUE) = "klmno"
     * StringUtils.truncate("abcdefghijklmno", 13, 1) = "n"
     * StringUtils.truncate("abcdefghijklmno", 13, Integer.MAX_VALUE) = "no"
     * StringUtils.truncate("abcdefghijklmno", 14, 1) = "o"
     * StringUtils.truncate("abcdefghijklmno", 14, Integer.MAX_VALUE) = "o"
     * StringUtils.truncate("abcdefghijklmno", 15, 1) = ""
     * StringUtils.truncate("abcdefghijklmno", 15, Integer.MAX_VALUE) = ""
     * StringUtils.truncate("abcdefghijklmno", Integer.MAX_VALUE, Integer.MAX_VALUE) = ""
     * StringUtils.truncate("abcdefghij", 3, -1) = throws an IllegalArgumentException
     * StringUtils.truncate("abcdefghij", -2, 4) = throws an IllegalArgumentException
     * </pre>
     *
     * @param str  the String to check, may be null
     * @param offset  left edge of source String
     * @param maxWidth  maximum length of result String, must be positive
     * @return truncated String, {@code null} if null String input
     * @since 3.5
     */
    public static String truncate(final String str, final int offset, final int maxWidth) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(7338);
        __CLR4_5_25lh5lhlvha79yz.R.inc(7339);if ((((offset < 0)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(7340)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(7341)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(7342);throw new IllegalArgumentException("offset cannot be negative");
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(7343);if ((((maxWidth < 0)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(7344)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(7345)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(7346);throw new IllegalArgumentException("maxWith cannot be negative");
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(7347);if ((((str == null)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(7348)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(7349)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(7350);return null;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(7351);if ((((offset > str.length())&&(__CLR4_5_25lh5lhlvha79yz.R.iget(7352)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(7353)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(7354);return EMPTY;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(7355);if ((((str.length() > maxWidth)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(7356)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(7357)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(7358);final int ix = (((offset + maxWidth > str.length() )&&(__CLR4_5_25lh5lhlvha79yz.R.iget(7359)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(7360)==0&false))? str.length() : offset + maxWidth;
            __CLR4_5_25lh5lhlvha79yz.R.inc(7361);return str.substring(offset, ix);
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(7362);return str.substring(offset);
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    // Stripping
    //-----------------------------------------------------------------------
    /**
     * <p>Strips whitespace from the start and end of a String.</p>
     *
     * <p>This is similar to {@link #trim(String)} but removes whitespace.
     * Whitespace is defined by {@link Character#isWhitespace(char)}.</p>
     *
     * <p>A {@code null} input String returns {@code null}.</p>
     *
     * <pre>
     * StringUtils.strip(null)     = null
     * StringUtils.strip("")       = ""
     * StringUtils.strip("   ")    = ""
     * StringUtils.strip("abc")    = "abc"
     * StringUtils.strip("  abc")  = "abc"
     * StringUtils.strip("abc  ")  = "abc"
     * StringUtils.strip(" abc ")  = "abc"
     * StringUtils.strip(" ab c ") = "ab c"
     * </pre>
     *
     * @param str  the String to remove whitespace from, may be null
     * @return the stripped String, {@code null} if null String input
     */
    public static String strip(final String str) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(7363);
        __CLR4_5_25lh5lhlvha79yz.R.inc(7364);return strip(str, null);
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    /**
     * <p>Strips whitespace from the start and end of a String  returning
     * {@code null} if the String is empty ("") after the strip.</p>
     *
     * <p>This is similar to {@link #trimToNull(String)} but removes whitespace.
     * Whitespace is defined by {@link Character#isWhitespace(char)}.</p>
     *
     * <pre>
     * StringUtils.stripToNull(null)     = null
     * StringUtils.stripToNull("")       = null
     * StringUtils.stripToNull("   ")    = null
     * StringUtils.stripToNull("abc")    = "abc"
     * StringUtils.stripToNull("  abc")  = "abc"
     * StringUtils.stripToNull("abc  ")  = "abc"
     * StringUtils.stripToNull(" abc ")  = "abc"
     * StringUtils.stripToNull(" ab c ") = "ab c"
     * </pre>
     *
     * @param str  the String to be stripped, may be null
     * @return the stripped String,
     *  {@code null} if whitespace, empty or null String input
     * @since 2.0
     */
    public static String stripToNull(String str) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(7365);
        __CLR4_5_25lh5lhlvha79yz.R.inc(7366);if ((((str == null)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(7367)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(7368)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(7369);return null;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(7370);str = strip(str, null);
        __CLR4_5_25lh5lhlvha79yz.R.inc(7371);return (((str.isEmpty() )&&(__CLR4_5_25lh5lhlvha79yz.R.iget(7372)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(7373)==0&false))? null : str;
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    /**
     * <p>Strips whitespace from the start and end of a String  returning
     * an empty String if {@code null} input.</p>
     *
     * <p>This is similar to {@link #trimToEmpty(String)} but removes whitespace.
     * Whitespace is defined by {@link Character#isWhitespace(char)}.</p>
     *
     * <pre>
     * StringUtils.stripToEmpty(null)     = ""
     * StringUtils.stripToEmpty("")       = ""
     * StringUtils.stripToEmpty("   ")    = ""
     * StringUtils.stripToEmpty("abc")    = "abc"
     * StringUtils.stripToEmpty("  abc")  = "abc"
     * StringUtils.stripToEmpty("abc  ")  = "abc"
     * StringUtils.stripToEmpty(" abc ")  = "abc"
     * StringUtils.stripToEmpty(" ab c ") = "ab c"
     * </pre>
     *
     * @param str  the String to be stripped, may be null
     * @return the trimmed String, or an empty String if {@code null} input
     * @since 2.0
     */
    public static String stripToEmpty(final String str) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(7374);
        __CLR4_5_25lh5lhlvha79yz.R.inc(7375);return (((str == null )&&(__CLR4_5_25lh5lhlvha79yz.R.iget(7376)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(7377)==0&false))? EMPTY : strip(str, null);
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    /**
     * <p>Strips any of a set of characters from the start and end of a String.
     * This is similar to {@link String#trim()} but allows the characters
     * to be stripped to be controlled.</p>
     *
     * <p>A {@code null} input String returns {@code null}.
     * An empty string ("") input returns the empty string.</p>
     *
     * <p>If the stripChars String is {@code null}, whitespace is
     * stripped as defined by {@link Character#isWhitespace(char)}.
     * Alternatively use {@link #strip(String)}.</p>
     *
     * <pre>
     * StringUtils.strip(null, *)          = null
     * StringUtils.strip("", *)            = ""
     * StringUtils.strip("abc", null)      = "abc"
     * StringUtils.strip("  abc", null)    = "abc"
     * StringUtils.strip("abc  ", null)    = "abc"
     * StringUtils.strip(" abc ", null)    = "abc"
     * StringUtils.strip("  abcyx", "xyz") = "  abc"
     * </pre>
     *
     * @param str  the String to remove characters from, may be null
     * @param stripChars  the characters to remove, null treated as whitespace
     * @return the stripped String, {@code null} if null String input
     */
    public static String strip(String str, final String stripChars) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(7378);
        __CLR4_5_25lh5lhlvha79yz.R.inc(7379);if ((((isEmpty(str))&&(__CLR4_5_25lh5lhlvha79yz.R.iget(7380)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(7381)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(7382);return str;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(7383);str = stripStart(str, stripChars);
        __CLR4_5_25lh5lhlvha79yz.R.inc(7384);return stripEnd(str, stripChars);
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}
    
    /**
     * <p>Strips any of a set of characters from the start of a String.</p>
     *
     * <p>A {@code null} input String returns {@code null}.
     * An empty string ("") input returns the empty string.</p>
     *
     * <p>If the stripChars String is {@code null}, whitespace is
     * stripped as defined by {@link Character#isWhitespace(char)}.</p>
     *
     * <pre>
     * StringUtils.stripStart(null, *)          = null
     * StringUtils.stripStart("", *)            = ""
     * StringUtils.stripStart("abc", "")        = "abc"
     * StringUtils.stripStart("abc", null)      = "abc"
     * StringUtils.stripStart("  abc", null)    = "abc"
     * StringUtils.stripStart("abc  ", null)    = "abc  "
     * StringUtils.stripStart(" abc ", null)    = "abc "
     * StringUtils.stripStart("yxabc  ", "xyz") = "abc  "
     * </pre>
     *
     * @param str  the String to remove characters from, may be null
     * @param stripChars  the characters to remove, null treated as whitespace
     * @return the stripped String, {@code null} if null String input
     */
    public static String stripStart(final String str, final String stripChars) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(7385);
        __CLR4_5_25lh5lhlvha79yz.R.inc(7386);int strLen;
        __CLR4_5_25lh5lhlvha79yz.R.inc(7387);if (str == null || (strLen = str.length()) == 0) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(7390);return str;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(7391);int start = 0;
        __CLR4_5_25lh5lhlvha79yz.R.inc(7392);if ((((stripChars == null)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(7393)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(7394)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(7395);while ((((start != strLen && Character.isWhitespace(str.charAt(start)))&&(__CLR4_5_25lh5lhlvha79yz.R.iget(7396)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(7397)==0&false))) {{
                __CLR4_5_25lh5lhlvha79yz.R.inc(7398);start++;
            }
        }} }else {__CLR4_5_25lh5lhlvha79yz.R.inc(7399);if ((((stripChars.isEmpty())&&(__CLR4_5_25lh5lhlvha79yz.R.iget(7400)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(7401)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(7402);return str;
        } }else {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(7403);while ((((start != strLen && stripChars.indexOf(str.charAt(start)) != INDEX_NOT_FOUND)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(7404)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(7405)==0&false))) {{
                __CLR4_5_25lh5lhlvha79yz.R.inc(7406);start++;
            }
        }}
        }}__CLR4_5_25lh5lhlvha79yz.R.inc(7407);return str.substring(start);
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    /**
     * <p>Strips any of a set of characters from the end of a String.</p>
     *
     * <p>A {@code null} input String returns {@code null}.
     * An empty string ("") input returns the empty string.</p>
     *
     * <p>If the stripChars String is {@code null}, whitespace is
     * stripped as defined by {@link Character#isWhitespace(char)}.</p>
     *
     * <pre>
     * StringUtils.stripEnd(null, *)          = null
     * StringUtils.stripEnd("", *)            = ""
     * StringUtils.stripEnd("abc", "")        = "abc"
     * StringUtils.stripEnd("abc", null)      = "abc"
     * StringUtils.stripEnd("  abc", null)    = "  abc"
     * StringUtils.stripEnd("abc  ", null)    = "abc"
     * StringUtils.stripEnd(" abc ", null)    = " abc"
     * StringUtils.stripEnd("  abcyx", "xyz") = "  abc"
     * StringUtils.stripEnd("120.00", ".0")   = "12"
     * </pre>
     *
     * @param str  the String to remove characters from, may be null
     * @param stripChars  the set of characters to remove, null treated as whitespace
     * @return the stripped String, {@code null} if null String input
     */
    public static String stripEnd(final String str, final String stripChars) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(7408);
        __CLR4_5_25lh5lhlvha79yz.R.inc(7409);int end;
        __CLR4_5_25lh5lhlvha79yz.R.inc(7410);if (str == null || (end = str.length()) == 0) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(7413);return str;
        }

        }__CLR4_5_25lh5lhlvha79yz.R.inc(7414);if ((((stripChars == null)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(7415)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(7416)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(7417);while ((((end != 0 && Character.isWhitespace(str.charAt(end - 1)))&&(__CLR4_5_25lh5lhlvha79yz.R.iget(7418)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(7419)==0&false))) {{
                __CLR4_5_25lh5lhlvha79yz.R.inc(7420);end--;
            }
        }} }else {__CLR4_5_25lh5lhlvha79yz.R.inc(7421);if ((((stripChars.isEmpty())&&(__CLR4_5_25lh5lhlvha79yz.R.iget(7422)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(7423)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(7424);return str;
        } }else {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(7425);while ((((end != 0 && stripChars.indexOf(str.charAt(end - 1)) != INDEX_NOT_FOUND)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(7426)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(7427)==0&false))) {{
                __CLR4_5_25lh5lhlvha79yz.R.inc(7428);end--;
            }
        }}
        }}__CLR4_5_25lh5lhlvha79yz.R.inc(7429);return str.substring(0, end);
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    // StripAll
    //-----------------------------------------------------------------------
    /**
     * <p>Strips whitespace from the start and end of every String in an array.
     * Whitespace is defined by {@link Character#isWhitespace(char)}.</p>
     *
     * <p>A new array is returned each time, except for length zero.
     * A {@code null} array will return {@code null}.
     * An empty array will return itself.
     * A {@code null} array entry will be ignored.</p>
     *
     * <pre>
     * StringUtils.stripAll(null)             = null
     * StringUtils.stripAll([])               = []
     * StringUtils.stripAll(["abc", "  abc"]) = ["abc", "abc"]
     * StringUtils.stripAll(["abc  ", null])  = ["abc", null]
     * </pre>
     *
     * @param strs  the array to remove whitespace from, may be null
     * @return the stripped Strings, {@code null} if null array input
     */
    public static String[] stripAll(final String... strs) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(7430);
        __CLR4_5_25lh5lhlvha79yz.R.inc(7431);return stripAll(strs, null);
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    /**
     * <p>Strips any of a set of characters from the start and end of every
     * String in an array.</p>
     * <p>Whitespace is defined by {@link Character#isWhitespace(char)}.</p>
     *
     * <p>A new array is returned each time, except for length zero.
     * A {@code null} array will return {@code null}.
     * An empty array will return itself.
     * A {@code null} array entry will be ignored.
     * A {@code null} stripChars will strip whitespace as defined by
     * {@link Character#isWhitespace(char)}.</p>
     *
     * <pre>
     * StringUtils.stripAll(null, *)                = null
     * StringUtils.stripAll([], *)                  = []
     * StringUtils.stripAll(["abc", "  abc"], null) = ["abc", "abc"]
     * StringUtils.stripAll(["abc  ", null], null)  = ["abc", null]
     * StringUtils.stripAll(["abc  ", null], "yz")  = ["abc  ", null]
     * StringUtils.stripAll(["yabcz", null], "yz")  = ["abc", null]
     * </pre>
     *
     * @param strs  the array to remove characters from, may be null
     * @param stripChars  the characters to remove, null treated as whitespace
     * @return the stripped Strings, {@code null} if null array input
     */
    public static String[] stripAll(final String[] strs, final String stripChars) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(7432);
        __CLR4_5_25lh5lhlvha79yz.R.inc(7433);int strsLen;
        __CLR4_5_25lh5lhlvha79yz.R.inc(7434);if (strs == null || (strsLen = strs.length) == 0) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(7437);return strs;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(7438);final String[] newArr = new String[strsLen];
        __CLR4_5_25lh5lhlvha79yz.R.inc(7439);for (int i = 0; (((i < strsLen)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(7440)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(7441)==0&false)); i++) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(7442);newArr[i] = strip(strs[i], stripChars);
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(7443);return newArr;
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    /**
     * <p>Removes diacritics (~= accents) from a string. The case will not be altered.</p>
     * <p>For instance, '&agrave;' will be replaced by 'a'.</p>
     * <p>Note that ligatures will be left as is.</p>
     *
     * <pre>
     * StringUtils.stripAccents(null)                = null
     * StringUtils.stripAccents("")                  = ""
     * StringUtils.stripAccents("control")           = "control"
     * StringUtils.stripAccents("&eacute;clair")     = "eclair"
     * </pre>
     *
     * @param input String to be stripped
     * @return input text with diacritics removed
     *
     * @since 3.0
     */
    // See also Lucene's ASCIIFoldingFilter (Lucene 2.9) that replaces accented characters by their unaccented equivalent (and uncommitted bug fix: https://issues.apache.org/jira/browse/LUCENE-1343?focusedCommentId=12858907&page=com.atlassian.jira.plugin.system.issuetabpanels%3Acomment-tabpanel#action_12858907).
    public static String stripAccents(final String input) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(7444);
        __CLR4_5_25lh5lhlvha79yz.R.inc(7445);if((((input == null)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(7446)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(7447)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(7448);return null;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(7449);final Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");//$NON-NLS-1$
        __CLR4_5_25lh5lhlvha79yz.R.inc(7450);final StringBuilder decomposed = new StringBuilder(Normalizer.normalize(input, Normalizer.Form.NFD));
        __CLR4_5_25lh5lhlvha79yz.R.inc(7451);convertRemainingAccentCharacters(decomposed);
        // Note that this doesn't correctly remove ligatures...
        __CLR4_5_25lh5lhlvha79yz.R.inc(7452);return pattern.matcher(decomposed).replaceAll(StringUtils.EMPTY);
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    private static void convertRemainingAccentCharacters(final StringBuilder decomposed) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(7453);
        __CLR4_5_25lh5lhlvha79yz.R.inc(7454);for (int i = 0; (((i < decomposed.length())&&(__CLR4_5_25lh5lhlvha79yz.R.iget(7455)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(7456)==0&false)); i++) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(7457);if ((((decomposed.charAt(i) == '\u0141')&&(__CLR4_5_25lh5lhlvha79yz.R.iget(7458)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(7459)==0&false))) {{
                __CLR4_5_25lh5lhlvha79yz.R.inc(7460);decomposed.deleteCharAt(i);
                __CLR4_5_25lh5lhlvha79yz.R.inc(7461);decomposed.insert(i, 'L');
            } }else {__CLR4_5_25lh5lhlvha79yz.R.inc(7462);if ((((decomposed.charAt(i) == '\u0142')&&(__CLR4_5_25lh5lhlvha79yz.R.iget(7463)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(7464)==0&false))) {{
                __CLR4_5_25lh5lhlvha79yz.R.inc(7465);decomposed.deleteCharAt(i);
                __CLR4_5_25lh5lhlvha79yz.R.inc(7466);decomposed.insert(i, 'l');
            }
        }}}
    }}finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    // Equals
    //-----------------------------------------------------------------------
    /**
     * <p>Compares two CharSequences, returning {@code true} if they represent
     * equal sequences of characters.</p>
     *
     * <p>{@code null}s are handled without exceptions. Two {@code null}
     * references are considered to be equal. The comparison is case sensitive.</p>
     *
     * <pre>
     * StringUtils.equals(null, null)   = true
     * StringUtils.equals(null, "abc")  = false
     * StringUtils.equals("abc", null)  = false
     * StringUtils.equals("abc", "abc") = true
     * StringUtils.equals("abc", "ABC") = false
     * </pre>
     *
     * @see Object#equals(Object)
     * @param cs1  the first CharSequence, may be {@code null}
     * @param cs2  the second CharSequence, may be {@code null}
     * @return {@code true} if the CharSequences are equal (case-sensitive), or both {@code null}
     * @since 3.0 Changed signature from equals(String, String) to equals(CharSequence, CharSequence)
     */
    public static boolean equals(final CharSequence cs1, final CharSequence cs2) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(7467);
        __CLR4_5_25lh5lhlvha79yz.R.inc(7468);if ((((cs1 == cs2)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(7469)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(7470)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(7471);return true;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(7472);if ((((cs1 == null || cs2 == null)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(7473)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(7474)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(7475);return false;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(7476);if ((((cs1.length() != cs2.length())&&(__CLR4_5_25lh5lhlvha79yz.R.iget(7477)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(7478)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(7479);return false;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(7480);if ((((cs1 instanceof String && cs2 instanceof String)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(7481)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(7482)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(7483);return cs1.equals(cs2);
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(7484);return CharSequenceUtils.regionMatches(cs1, false, 0, cs2, 0, cs1.length());
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    /**
     * <p>Compares two CharSequences, returning {@code true} if they represent
     * equal sequences of characters, ignoring case.</p>
     *
     * <p>{@code null}s are handled without exceptions. Two {@code null}
     * references are considered equal. Comparison is case insensitive.</p>
     *
     * <pre>
     * StringUtils.equalsIgnoreCase(null, null)   = true
     * StringUtils.equalsIgnoreCase(null, "abc")  = false
     * StringUtils.equalsIgnoreCase("abc", null)  = false
     * StringUtils.equalsIgnoreCase("abc", "abc") = true
     * StringUtils.equalsIgnoreCase("abc", "ABC") = true
     * </pre>
     *
     * @param str1  the first CharSequence, may be null
     * @param str2  the second CharSequence, may be null
     * @return {@code true} if the CharSequence are equal, case insensitive, or
     *  both {@code null}
     * @since 3.0 Changed signature from equalsIgnoreCase(String, String) to equalsIgnoreCase(CharSequence, CharSequence)
     */
    public static boolean equalsIgnoreCase(final CharSequence str1, final CharSequence str2) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(7485);
        __CLR4_5_25lh5lhlvha79yz.R.inc(7486);if ((((str1 == null || str2 == null)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(7487)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(7488)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(7489);return str1 == str2;
        } }else {__CLR4_5_25lh5lhlvha79yz.R.inc(7490);if ((((str1 == str2)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(7491)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(7492)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(7493);return true;
        } }else {__CLR4_5_25lh5lhlvha79yz.R.inc(7494);if ((((str1.length() != str2.length())&&(__CLR4_5_25lh5lhlvha79yz.R.iget(7495)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(7496)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(7497);return false;
        } }else {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(7498);return CharSequenceUtils.regionMatches(str1, true, 0, str2, 0, str1.length());
        }
    }}}}finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    // Compare
    //-----------------------------------------------------------------------
    /**
     * <p>Compare two Strings lexicographically, as per {@link String#compareTo(String)}, returning :</p>
     * <ul>
     *  <li>{@code int = 0}, if {@code str1} is equal to {@code str2} (or both {@code null})</li>
     *  <li>{@code int < 0}, if {@code str1} is less than {@code str2}</li>
     *  <li>{@code int > 0}, if {@code str1} is greater than {@code str2}</li>
     * </ul>
     *
     * <p>This is a {@code null} safe version of :</p>
     * <blockquote><pre>str1.compareTo(str2)</pre></blockquote>
     *
     * <p>{@code null} value is considered less than non-{@code null} value.
     * Two {@code null} references are considered equal.</p>
     *
     * <pre>
     * StringUtils.compare(null, null)   = 0
     * StringUtils.compare(null , "a")   &lt; 0
     * StringUtils.compare("a", null)    &gt; 0
     * StringUtils.compare("abc", "abc") = 0
     * StringUtils.compare("a", "b")     &lt; 0
     * StringUtils.compare("b", "a")     &gt; 0
     * StringUtils.compare("a", "B")     &gt; 0
     * StringUtils.compare("ab", "abc")  &lt; 0
     * </pre>
     *
     * @see #compare(String, String, boolean)
     * @see String#compareTo(String)
     * @param str1  the String to compare from
     * @param str2  the String to compare to
     * @return &lt; 0, 0, &gt; 0, if {@code str1} is respectively less, equal ou greater than {@code str2}
     * @since 3.5
     */
    public static int compare(final String str1, final String str2) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(7499);
        __CLR4_5_25lh5lhlvha79yz.R.inc(7500);return compare(str1, str2, true);
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    /**
     * <p>Compare two Strings lexicographically, as per {@link String#compareTo(String)}, returning :</p>
     * <ul>
     *  <li>{@code int = 0}, if {@code str1} is equal to {@code str2} (or both {@code null})</li>
     *  <li>{@code int < 0}, if {@code str1} is less than {@code str2}</li>
     *  <li>{@code int > 0}, if {@code str1} is greater than {@code str2}</li>
     * </ul>
     *
     * <p>This is a {@code null} safe version of :</p>
     * <blockquote><pre>str1.compareTo(str2)</pre></blockquote>
     *
     * <p>{@code null} inputs are handled according to the {@code nullIsLess} parameter.
     * Two {@code null} references are considered equal.</p>
     *
     * <pre>
     * StringUtils.compare(null, null, *)     = 0
     * StringUtils.compare(null , "a", true)  &lt; 0
     * StringUtils.compare(null , "a", false) &gt; 0
     * StringUtils.compare("a", null, true)   &gt; 0
     * StringUtils.compare("a", null, false)  &lt; 0
     * StringUtils.compare("abc", "abc", *)   = 0
     * StringUtils.compare("a", "b", *)       &lt; 0
     * StringUtils.compare("b", "a", *)       &gt; 0
     * StringUtils.compare("a", "B", *)       &gt; 0
     * StringUtils.compare("ab", "abc", *)    &lt; 0
     * </pre>
     *
     * @see String#compareTo(String)
     * @param str1  the String to compare from
     * @param str2  the String to compare to
     * @param nullIsLess  whether consider {@code null} value less than non-{@code null} value
     * @return &lt; 0, 0, &gt; 0, if {@code str1} is respectively less, equal ou greater than {@code str2}
     * @since 3.5
     */
    public static int compare(final String str1, final String str2, final boolean nullIsLess) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(7501);
        __CLR4_5_25lh5lhlvha79yz.R.inc(7502);if ((((str1 == str2)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(7503)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(7504)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(7505);return 0;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(7506);if ((((str1 == null)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(7507)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(7508)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(7509);return (((nullIsLess )&&(__CLR4_5_25lh5lhlvha79yz.R.iget(7510)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(7511)==0&false))? -1 : 1;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(7512);if ((((str2 == null)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(7513)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(7514)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(7515);return (((nullIsLess )&&(__CLR4_5_25lh5lhlvha79yz.R.iget(7516)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(7517)==0&false))? 1 : - 1;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(7518);return str1.compareTo(str2);
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    /**
     * <p>Compare two Strings lexicographically, ignoring case differences,
     * as per {@link String#compareToIgnoreCase(String)}, returning :</p>
     * <ul>
     *  <li>{@code int = 0}, if {@code str1} is equal to {@code str2} (or both {@code null})</li>
     *  <li>{@code int < 0}, if {@code str1} is less than {@code str2}</li>
     *  <li>{@code int > 0}, if {@code str1} is greater than {@code str2}</li>
     * </ul>
     *
     * <p>This is a {@code null} safe version of :</p>
     * <blockquote><pre>str1.compareToIgnoreCase(str2)</pre></blockquote>
     *
     * <p>{@code null} value is considered less than non-{@code null} value.
     * Two {@code null} references are considered equal.
     * Comparison is case insensitive.</p>
     *
     * <pre>
     * StringUtils.compareIgnoreCase(null, null)   = 0
     * StringUtils.compareIgnoreCase(null , "a")   &lt; 0
     * StringUtils.compareIgnoreCase("a", null)    &gt; 0
     * StringUtils.compareIgnoreCase("abc", "abc") = 0
     * StringUtils.compareIgnoreCase("abc", "ABC") = 0
     * StringUtils.compareIgnoreCase("a", "b")     &lt; 0
     * StringUtils.compareIgnoreCase("b", "a")     &gt; 0
     * StringUtils.compareIgnoreCase("a", "B")     &lt; 0
     * StringUtils.compareIgnoreCase("A", "b")     &lt; 0
     * StringUtils.compareIgnoreCase("ab", "ABC")  &lt; 0
     * </pre>
     *
     * @see #compareIgnoreCase(String, String, boolean)
     * @see String#compareToIgnoreCase(String)
     * @param str1  the String to compare from
     * @param str2  the String to compare to
     * @return &lt; 0, 0, &gt; 0, if {@code str1} is respectively less, equal ou greater than {@code str2},
     *          ignoring case differences.
     * @since 3.5
     */
    public static int compareIgnoreCase(final String str1, final String str2) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(7519);
        __CLR4_5_25lh5lhlvha79yz.R.inc(7520);return compareIgnoreCase(str1, str2, true);
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    /**
     * <p>Compare two Strings lexicographically, ignoring case differences,
     * as per {@link String#compareToIgnoreCase(String)}, returning :</p>
     * <ul>
     *  <li>{@code int = 0}, if {@code str1} is equal to {@code str2} (or both {@code null})</li>
     *  <li>{@code int < 0}, if {@code str1} is less than {@code str2}</li>
     *  <li>{@code int > 0}, if {@code str1} is greater than {@code str2}</li>
     * </ul>
     *
     * <p>This is a {@code null} safe version of :</p>
     * <blockquote><pre>str1.compareToIgnoreCase(str2)</pre></blockquote>
     *
     * <p>{@code null} inputs are handled according to the {@code nullIsLess} parameter.
     * Two {@code null} references are considered equal.
     * Comparison is case insensitive.</p>
     *
     * <pre>
     * StringUtils.compareIgnoreCase(null, null, *)     = 0
     * StringUtils.compareIgnoreCase(null , "a", true)  &lt; 0
     * StringUtils.compareIgnoreCase(null , "a", false) &gt; 0
     * StringUtils.compareIgnoreCase("a", null, true)   &gt; 0
     * StringUtils.compareIgnoreCase("a", null, false)  &lt; 0
     * StringUtils.compareIgnoreCase("abc", "abc", *)   = 0
     * StringUtils.compareIgnoreCase("abc", "ABC", *)   = 0
     * StringUtils.compareIgnoreCase("a", "b", *)       &lt; 0
     * StringUtils.compareIgnoreCase("b", "a", *)       &gt; 0
     * StringUtils.compareIgnoreCase("a", "B", *)       &lt; 0
     * StringUtils.compareIgnoreCase("A", "b", *)       &lt; 0
     * StringUtils.compareIgnoreCase("ab", "abc", *)    &lt; 0
     * </pre>
     *
     * @see String#compareToIgnoreCase(String)
     * @param str1  the String to compare from
     * @param str2  the String to compare to
     * @param nullIsLess  whether consider {@code null} value less than non-{@code null} value
     * @return &lt; 0, 0, &gt; 0, if {@code str1} is respectively less, equal ou greater than {@code str2},
     *          ignoring case differences.
     * @since 3.5
     */
    public static int compareIgnoreCase(final String str1, final String str2, final boolean nullIsLess) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(7521);
        __CLR4_5_25lh5lhlvha79yz.R.inc(7522);if ((((str1 == str2)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(7523)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(7524)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(7525);return 0;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(7526);if ((((str1 == null)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(7527)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(7528)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(7529);return (((nullIsLess )&&(__CLR4_5_25lh5lhlvha79yz.R.iget(7530)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(7531)==0&false))? -1 : 1;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(7532);if ((((str2 == null)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(7533)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(7534)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(7535);return (((nullIsLess )&&(__CLR4_5_25lh5lhlvha79yz.R.iget(7536)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(7537)==0&false))? 1 : - 1;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(7538);return str1.compareToIgnoreCase(str2);
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    /**
     * <p>Compares given <code>string</code> to a CharSequences vararg of <code>searchStrings</code>,
     * returning {@code true} if the <code>string</code> is equal to any of the <code>searchStrings</code>.</p>
     *
     * <pre>
     * StringUtils.equalsAny(null, (CharSequence[]) null) = false
     * StringUtils.equalsAny(null, null, null)    = true
     * StringUtils.equalsAny(null, "abc", "def")  = false
     * StringUtils.equalsAny("abc", null, "def")  = false
     * StringUtils.equalsAny("abc", "abc", "def") = true
     * StringUtils.equalsAny("abc", "ABC", "DEF") = false
     * </pre>
     *
     * @param string to compare, may be {@code null}.
     * @param searchStrings a vararg of strings, may be {@code null}.
     * @return {@code true} if the string is equal (case-sensitive) to any other element of <code>searchStrings</code>;
     * {@code false} if <code>searchStrings</code> is null or contains no matches.
     * @since 3.5
     */
    public static boolean equalsAny(final CharSequence string, final CharSequence... searchStrings) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(7539);
        __CLR4_5_25lh5lhlvha79yz.R.inc(7540);if ((((ArrayUtils.isNotEmpty(searchStrings))&&(__CLR4_5_25lh5lhlvha79yz.R.iget(7541)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(7542)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(7543);for (final CharSequence next : searchStrings) {{
                __CLR4_5_25lh5lhlvha79yz.R.inc(7544);if ((((equals(string, next))&&(__CLR4_5_25lh5lhlvha79yz.R.iget(7545)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(7546)==0&false))) {{
                    __CLR4_5_25lh5lhlvha79yz.R.inc(7547);return true;
                }
            }}
        }}
        }__CLR4_5_25lh5lhlvha79yz.R.inc(7548);return false;
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}


    /**
     * <p>Compares given <code>string</code> to a CharSequences vararg of <code>searchStrings</code>,
     * returning {@code true} if the <code>string</code> is equal to any of the <code>searchStrings</code>, ignoring case.</p>
     *
     * <pre>
     * StringUtils.equalsAnyIgnoreCase(null, (CharSequence[]) null) = false
     * StringUtils.equalsAnyIgnoreCase(null, null, null)    = true
     * StringUtils.equalsAnyIgnoreCase(null, "abc", "def")  = false
     * StringUtils.equalsAnyIgnoreCase("abc", null, "def")  = false
     * StringUtils.equalsAnyIgnoreCase("abc", "abc", "def") = true
     * StringUtils.equalsAnyIgnoreCase("abc", "ABC", "DEF") = true
     * </pre>
     *
     * @param string to compare, may be {@code null}.
     * @param searchStrings a vararg of strings, may be {@code null}.
     * @return {@code true} if the string is equal (case-insensitive) to any other element of <code>searchStrings</code>;
     * {@code false} if <code>searchStrings</code> is null or contains no matches.
     * @since 3.5
     */
    public static boolean equalsAnyIgnoreCase(final CharSequence string, final CharSequence...searchStrings) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(7549);
        __CLR4_5_25lh5lhlvha79yz.R.inc(7550);if ((((ArrayUtils.isNotEmpty(searchStrings))&&(__CLR4_5_25lh5lhlvha79yz.R.iget(7551)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(7552)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(7553);for (final CharSequence next : searchStrings) {{
                __CLR4_5_25lh5lhlvha79yz.R.inc(7554);if ((((equalsIgnoreCase(string, next))&&(__CLR4_5_25lh5lhlvha79yz.R.iget(7555)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(7556)==0&false))) {{
                    __CLR4_5_25lh5lhlvha79yz.R.inc(7557);return true;
                }
            }}
        }}
        }__CLR4_5_25lh5lhlvha79yz.R.inc(7558);return false;
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    // IndexOf
    //-----------------------------------------------------------------------
    /**
     * Returns the index within <code>seq</code> of the first occurrence of
     * the specified character. If a character with value
     * <code>searchChar</code> occurs in the character sequence represented by
     * <code>seq</code> <code>CharSequence</code> object, then the index (in Unicode
     * code units) of the first such occurrence is returned. For
     * values of <code>searchChar</code> in the range from 0 to 0xFFFF
     * (inclusive), this is the smallest value <i>k</i> such that:
     * <blockquote><pre>
     * this.charAt(<i>k</i>) == searchChar
     * </pre></blockquote>
     * is true. For other values of <code>searchChar</code>, it is the
     * smallest value <i>k</i> such that:
     * <blockquote><pre>
     * this.codePointAt(<i>k</i>) == searchChar
     * </pre></blockquote>
     * is true. In either case, if no such character occurs in <code>seq</code>,
     * then {@code INDEX_NOT_FOUND (-1)} is returned.
     *
     * <p>Furthermore, a {@code null} or empty ("") CharSequence will
     * return {@code INDEX_NOT_FOUND (-1)}.</p>
     *
     * <pre>
     * StringUtils.indexOf(null, *)         = -1
     * StringUtils.indexOf("", *)           = -1
     * StringUtils.indexOf("aabaabaa", 'a') = 0
     * StringUtils.indexOf("aabaabaa", 'b') = 2
     * </pre>
     *
     * @param seq  the CharSequence to check, may be null
     * @param searchChar  the character to find
     * @return the first index of the search character,
     *  -1 if no match or {@code null} string input
     * @since 2.0
     * @since 3.0 Changed signature from indexOf(String, int) to indexOf(CharSequence, int)
     * @since 3.6 Updated {@link CharSequenceUtils} call to behave more like <code>String</code>
     */
    public static int indexOf(final CharSequence seq, final int searchChar) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(7559);
        __CLR4_5_25lh5lhlvha79yz.R.inc(7560);if ((((isEmpty(seq))&&(__CLR4_5_25lh5lhlvha79yz.R.iget(7561)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(7562)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(7563);return INDEX_NOT_FOUND;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(7564);return CharSequenceUtils.indexOf(seq, searchChar, 0);
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    /**
     *
     * Returns the index within <code>seq</code> of the first occurrence of the
     * specified character, starting the search at the specified index.
     * <p>
     * If a character with value <code>searchChar</code> occurs in the
     * character sequence represented by the <code>seq</code> <code>CharSequence</code>
     * object at an index no smaller than <code>startPos</code>, then
     * the index of the first such occurrence is returned. For values
     * of <code>searchChar</code> in the range from 0 to 0xFFFF (inclusive),
     * this is the smallest value <i>k</i> such that:
     * <blockquote><pre>
     * (this.charAt(<i>k</i>) == searchChar) &amp;&amp; (<i>k</i> &gt;= startPos)
     * </pre></blockquote>
     * is true. For other values of <code>searchChar</code>, it is the
     * smallest value <i>k</i> such that:
     * <blockquote><pre>
     * (this.codePointAt(<i>k</i>) == searchChar) &amp;&amp; (<i>k</i> &gt;= startPos)
     * </pre></blockquote>
     * is true. In either case, if no such character occurs in <code>seq</code>
     * at or after position <code>startPos</code>, then
     * <code>-1</code> is returned.
     *
     * <p>
     * There is no restriction on the value of <code>startPos</code>. If it
     * is negative, it has the same effect as if it were zero: this entire
     * string may be searched. If it is greater than the length of this
     * string, it has the same effect as if it were equal to the length of
     * this string: {@code (INDEX_NOT_FOUND) -1} is returned. Furthermore, a
     * {@code null} or empty ("") CharSequence will
     * return {@code (INDEX_NOT_FOUND) -1}.
     *
     * <p>All indices are specified in <code>char</code> values
     * (Unicode code units).
     *
     * <pre>
     * StringUtils.indexOf(null, *, *)          = -1
     * StringUtils.indexOf("", *, *)            = -1
     * StringUtils.indexOf("aabaabaa", 'b', 0)  = 2
     * StringUtils.indexOf("aabaabaa", 'b', 3)  = 5
     * StringUtils.indexOf("aabaabaa", 'b', 9)  = -1
     * StringUtils.indexOf("aabaabaa", 'b', -1) = 2
     * </pre>
     *
     * @param seq  the CharSequence to check, may be null
     * @param searchChar  the character to find
     * @param startPos  the start position, negative treated as zero
     * @return the first index of the search character (always &ge; startPos),
     *  -1 if no match or {@code null} string input
     * @since 2.0
     * @since 3.0 Changed signature from indexOf(String, int, int) to indexOf(CharSequence, int, int)
     * @since 3.6 Updated {@link CharSequenceUtils} call to behave more like <code>String</code>
     */
    public static int indexOf(final CharSequence seq, final int searchChar, final int startPos) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(7565);
        __CLR4_5_25lh5lhlvha79yz.R.inc(7566);if ((((isEmpty(seq))&&(__CLR4_5_25lh5lhlvha79yz.R.iget(7567)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(7568)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(7569);return INDEX_NOT_FOUND;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(7570);return CharSequenceUtils.indexOf(seq, searchChar, startPos);
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    /**
     * <p>Finds the first index within a CharSequence, handling {@code null}.
     * This method uses {@link String#indexOf(String, int)} if possible.</p>
     *
     * <p>A {@code null} CharSequence will return {@code -1}.</p>
     *
     * <pre>
     * StringUtils.indexOf(null, *)          = -1
     * StringUtils.indexOf(*, null)          = -1
     * StringUtils.indexOf("", "")           = 0
     * StringUtils.indexOf("", *)            = -1 (except when * = "")
     * StringUtils.indexOf("aabaabaa", "a")  = 0
     * StringUtils.indexOf("aabaabaa", "b")  = 2
     * StringUtils.indexOf("aabaabaa", "ab") = 1
     * StringUtils.indexOf("aabaabaa", "")   = 0
     * </pre>
     *
     * @param seq  the CharSequence to check, may be null
     * @param searchSeq  the CharSequence to find, may be null
     * @return the first index of the search CharSequence,
     *  -1 if no match or {@code null} string input
     * @since 2.0
     * @since 3.0 Changed signature from indexOf(String, String) to indexOf(CharSequence, CharSequence)
     */
    public static int indexOf(final CharSequence seq, final CharSequence searchSeq) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(7571);
        __CLR4_5_25lh5lhlvha79yz.R.inc(7572);if ((((seq == null || searchSeq == null)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(7573)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(7574)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(7575);return INDEX_NOT_FOUND;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(7576);return CharSequenceUtils.indexOf(seq, searchSeq, 0);
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    /**
     * <p>Finds the first index within a CharSequence, handling {@code null}.
     * This method uses {@link String#indexOf(String, int)} if possible.</p>
     *
     * <p>A {@code null} CharSequence will return {@code -1}.
     * A negative start position is treated as zero.
     * An empty ("") search CharSequence always matches.
     * A start position greater than the string length only matches
     * an empty search CharSequence.</p>
     *
     * <pre>
     * StringUtils.indexOf(null, *, *)          = -1
     * StringUtils.indexOf(*, null, *)          = -1
     * StringUtils.indexOf("", "", 0)           = 0
     * StringUtils.indexOf("", *, 0)            = -1 (except when * = "")
     * StringUtils.indexOf("aabaabaa", "a", 0)  = 0
     * StringUtils.indexOf("aabaabaa", "b", 0)  = 2
     * StringUtils.indexOf("aabaabaa", "ab", 0) = 1
     * StringUtils.indexOf("aabaabaa", "b", 3)  = 5
     * StringUtils.indexOf("aabaabaa", "b", 9)  = -1
     * StringUtils.indexOf("aabaabaa", "b", -1) = 2
     * StringUtils.indexOf("aabaabaa", "", 2)   = 2
     * StringUtils.indexOf("abc", "", 9)        = 3
     * </pre>
     *
     * @param seq  the CharSequence to check, may be null
     * @param searchSeq  the CharSequence to find, may be null
     * @param startPos  the start position, negative treated as zero
     * @return the first index of the search CharSequence (always &ge; startPos),
     *  -1 if no match or {@code null} string input
     * @since 2.0
     * @since 3.0 Changed signature from indexOf(String, String, int) to indexOf(CharSequence, CharSequence, int)
     */
    public static int indexOf(final CharSequence seq, final CharSequence searchSeq, final int startPos) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(7577);
        __CLR4_5_25lh5lhlvha79yz.R.inc(7578);if ((((seq == null || searchSeq == null)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(7579)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(7580)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(7581);return INDEX_NOT_FOUND;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(7582);return CharSequenceUtils.indexOf(seq, searchSeq, startPos);
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    /**
     * <p>Finds the n-th index within a CharSequence, handling {@code null}.
     * This method uses {@link String#indexOf(String)} if possible.</p>
     * <p><b>Note:</b> The code starts looking for a match at the start of the target,
     * incrementing the starting index by one after each successful match
     * (unless {@code searchStr} is an empty string in which case the position
     * is never incremented and {@code 0} is returned immediately).
     * This means that matches may overlap.</p>
     * <p>A {@code null} CharSequence will return {@code -1}.</p>
     *
     * <pre>
     * StringUtils.ordinalIndexOf(null, *, *)          = -1
     * StringUtils.ordinalIndexOf(*, null, *)          = -1
     * StringUtils.ordinalIndexOf("", "", *)           = 0
     * StringUtils.ordinalIndexOf("aabaabaa", "a", 1)  = 0
     * StringUtils.ordinalIndexOf("aabaabaa", "a", 2)  = 1
     * StringUtils.ordinalIndexOf("aabaabaa", "b", 1)  = 2
     * StringUtils.ordinalIndexOf("aabaabaa", "b", 2)  = 5
     * StringUtils.ordinalIndexOf("aabaabaa", "ab", 1) = 1
     * StringUtils.ordinalIndexOf("aabaabaa", "ab", 2) = 4
     * StringUtils.ordinalIndexOf("aabaabaa", "", 1)   = 0
     * StringUtils.ordinalIndexOf("aabaabaa", "", 2)   = 0
     * </pre>
     *
     * <p>Matches may overlap:</p>
     * <pre>
     * StringUtils.ordinalIndexOf("ababab","aba", 1)   = 0
     * StringUtils.ordinalIndexOf("ababab","aba", 2)   = 2
     * StringUtils.ordinalIndexOf("ababab","aba", 3)   = -1
     *
     * StringUtils.ordinalIndexOf("abababab", "abab", 1) = 0
     * StringUtils.ordinalIndexOf("abababab", "abab", 2) = 2
     * StringUtils.ordinalIndexOf("abababab", "abab", 3) = 4
     * StringUtils.ordinalIndexOf("abababab", "abab", 4) = -1
     * </pre>
     *
     * <p>Note that 'head(CharSequence str, int n)' may be implemented as: </p>
     *
     * <pre>
     *   str.substring(0, lastOrdinalIndexOf(str, "\n", n))
     * </pre>
     *
     * @param str  the CharSequence to check, may be null
     * @param searchStr  the CharSequence to find, may be null
     * @param ordinal  the n-th {@code searchStr} to find
     * @return the n-th index of the search CharSequence,
     *  {@code -1} ({@code INDEX_NOT_FOUND}) if no match or {@code null} string input
     * @since 2.1
     * @since 3.0 Changed signature from ordinalIndexOf(String, String, int) to ordinalIndexOf(CharSequence, CharSequence, int)
     */
    public static int ordinalIndexOf(final CharSequence str, final CharSequence searchStr, final int ordinal) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(7583);
        __CLR4_5_25lh5lhlvha79yz.R.inc(7584);return ordinalIndexOf(str, searchStr, ordinal, false);
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    /**
     * <p>Finds the n-th index within a String, handling {@code null}.
     * This method uses {@link String#indexOf(String)} if possible.</p>
     * <p>Note that matches may overlap<p>
     *
     * <p>A {@code null} CharSequence will return {@code -1}.</p>
     *
     * @param str  the CharSequence to check, may be null
     * @param searchStr  the CharSequence to find, may be null
     * @param ordinal  the n-th {@code searchStr} to find, overlapping matches are allowed.
     * @param lastIndex true if lastOrdinalIndexOf() otherwise false if ordinalIndexOf()
     * @return the n-th index of the search CharSequence,
     *  {@code -1} ({@code INDEX_NOT_FOUND}) if no match or {@code null} string input
     */
    // Shared code between ordinalIndexOf(String,String,int) and lastOrdinalIndexOf(String,String,int)
    private static int ordinalIndexOf(final CharSequence str, final CharSequence searchStr, final int ordinal, final boolean lastIndex) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(7585);
        __CLR4_5_25lh5lhlvha79yz.R.inc(7586);if ((((str == null || searchStr == null || ordinal <= 0)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(7587)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(7588)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(7589);return INDEX_NOT_FOUND;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(7590);if ((((searchStr.length() == 0)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(7591)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(7592)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(7593);return (((lastIndex )&&(__CLR4_5_25lh5lhlvha79yz.R.iget(7594)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(7595)==0&false))? str.length() : 0;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(7596);int found = 0;
        // set the initial index beyond the end of the string
        // this is to allow for the initial index decrement/increment
        __CLR4_5_25lh5lhlvha79yz.R.inc(7597);int index = (((lastIndex )&&(__CLR4_5_25lh5lhlvha79yz.R.iget(7598)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(7599)==0&false))? str.length() : INDEX_NOT_FOUND;
        __CLR4_5_25lh5lhlvha79yz.R.inc(7600);do {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(7601);if ((((lastIndex)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(7602)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(7603)==0&false))) {{
                __CLR4_5_25lh5lhlvha79yz.R.inc(7604);index = CharSequenceUtils.lastIndexOf(str, searchStr, index - 1); // step backwards thru string
            } }else {{
                __CLR4_5_25lh5lhlvha79yz.R.inc(7605);index = CharSequenceUtils.indexOf(str, searchStr, index + 1); // step forwards through string
            }
            }__CLR4_5_25lh5lhlvha79yz.R.inc(7606);if ((((index < 0)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(7607)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(7608)==0&false))) {{
                __CLR4_5_25lh5lhlvha79yz.R.inc(7609);return index;
            }
            }__CLR4_5_25lh5lhlvha79yz.R.inc(7610);found++;
        } }while ((((found < ordinal)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(7611)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(7612)==0&false)));
        __CLR4_5_25lh5lhlvha79yz.R.inc(7613);return index;
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    /**
     * <p>Case in-sensitive find of the first index within a CharSequence.</p>
     *
     * <p>A {@code null} CharSequence will return {@code -1}.
     * A negative start position is treated as zero.
     * An empty ("") search CharSequence always matches.
     * A start position greater than the string length only matches
     * an empty search CharSequence.</p>
     *
     * <pre>
     * StringUtils.indexOfIgnoreCase(null, *)          = -1
     * StringUtils.indexOfIgnoreCase(*, null)          = -1
     * StringUtils.indexOfIgnoreCase("", "")           = 0
     * StringUtils.indexOfIgnoreCase("aabaabaa", "a")  = 0
     * StringUtils.indexOfIgnoreCase("aabaabaa", "b")  = 2
     * StringUtils.indexOfIgnoreCase("aabaabaa", "ab") = 1
     * </pre>
     *
     * @param str  the CharSequence to check, may be null
     * @param searchStr  the CharSequence to find, may be null
     * @return the first index of the search CharSequence,
     *  -1 if no match or {@code null} string input
     * @since 2.5
     * @since 3.0 Changed signature from indexOfIgnoreCase(String, String) to indexOfIgnoreCase(CharSequence, CharSequence)
     */
    public static int indexOfIgnoreCase(final CharSequence str, final CharSequence searchStr) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(7614);
        __CLR4_5_25lh5lhlvha79yz.R.inc(7615);return indexOfIgnoreCase(str, searchStr, 0);
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    /**
     * <p>Case in-sensitive find of the first index within a CharSequence
     * from the specified position.</p>
     *
     * <p>A {@code null} CharSequence will return {@code -1}.
     * A negative start position is treated as zero.
     * An empty ("") search CharSequence always matches.
     * A start position greater than the string length only matches
     * an empty search CharSequence.</p>
     *
     * <pre>
     * StringUtils.indexOfIgnoreCase(null, *, *)          = -1
     * StringUtils.indexOfIgnoreCase(*, null, *)          = -1
     * StringUtils.indexOfIgnoreCase("", "", 0)           = 0
     * StringUtils.indexOfIgnoreCase("aabaabaa", "A", 0)  = 0
     * StringUtils.indexOfIgnoreCase("aabaabaa", "B", 0)  = 2
     * StringUtils.indexOfIgnoreCase("aabaabaa", "AB", 0) = 1
     * StringUtils.indexOfIgnoreCase("aabaabaa", "B", 3)  = 5
     * StringUtils.indexOfIgnoreCase("aabaabaa", "B", 9)  = -1
     * StringUtils.indexOfIgnoreCase("aabaabaa", "B", -1) = 2
     * StringUtils.indexOfIgnoreCase("aabaabaa", "", 2)   = 2
     * StringUtils.indexOfIgnoreCase("abc", "", 9)        = -1
     * </pre>
     *
     * @param str  the CharSequence to check, may be null
     * @param searchStr  the CharSequence to find, may be null
     * @param startPos  the start position, negative treated as zero
     * @return the first index of the search CharSequence (always &ge; startPos),
     *  -1 if no match or {@code null} string input
     * @since 2.5
     * @since 3.0 Changed signature from indexOfIgnoreCase(String, String, int) to indexOfIgnoreCase(CharSequence, CharSequence, int)
     */
    public static int indexOfIgnoreCase(final CharSequence str, final CharSequence searchStr, int startPos) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(7616);
        __CLR4_5_25lh5lhlvha79yz.R.inc(7617);if ((((str == null || searchStr == null)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(7618)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(7619)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(7620);return INDEX_NOT_FOUND;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(7621);if ((((startPos < 0)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(7622)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(7623)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(7624);startPos = 0;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(7625);final int endLimit = str.length() - searchStr.length() + 1;
        __CLR4_5_25lh5lhlvha79yz.R.inc(7626);if ((((startPos > endLimit)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(7627)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(7628)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(7629);return INDEX_NOT_FOUND;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(7630);if ((((searchStr.length() == 0)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(7631)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(7632)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(7633);return startPos;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(7634);for (int i = startPos; (((i < endLimit)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(7635)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(7636)==0&false)); i++) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(7637);if ((((CharSequenceUtils.regionMatches(str, true, i, searchStr, 0, searchStr.length()))&&(__CLR4_5_25lh5lhlvha79yz.R.iget(7638)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(7639)==0&false))) {{
                __CLR4_5_25lh5lhlvha79yz.R.inc(7640);return i;
            }
        }}
        }__CLR4_5_25lh5lhlvha79yz.R.inc(7641);return INDEX_NOT_FOUND;
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    // LastIndexOf
    //-----------------------------------------------------------------------
    /**
     * Returns the index within <code>seq</code> of the last occurrence of
     * the specified character. For values of <code>searchChar</code> in the
     * range from 0 to 0xFFFF (inclusive), the index (in Unicode code
     * units) returned is the largest value <i>k</i> such that:
     * <blockquote><pre>
     * this.charAt(<i>k</i>) == searchChar
     * </pre></blockquote>
     * is true. For other values of <code>searchChar</code>, it is the
     * largest value <i>k</i> such that:
     * <blockquote><pre>
     * this.codePointAt(<i>k</i>) == searchChar
     * </pre></blockquote>
     * is true.  In either case, if no such character occurs in this
     * string, then <code>-1</code> is returned. Furthermore, a {@code null} or empty ("")
     * <code>CharSequence</code> will return {@code -1}. The
     * <code>seq</code> <code>CharSequence</code> object is searched backwards
     * starting at the last character.
     *
     * <pre>
     * StringUtils.lastIndexOf(null, *)         = -1
     * StringUtils.lastIndexOf("", *)           = -1
     * StringUtils.lastIndexOf("aabaabaa", 'a') = 7
     * StringUtils.lastIndexOf("aabaabaa", 'b') = 5
     * </pre>
     *
     * @param seq  the <code>CharSequence</code> to check, may be null
     * @param searchChar  the character to find
     * @return the last index of the search character,
     *  -1 if no match or {@code null} string input
     * @since 2.0
     * @since 3.0 Changed signature from lastIndexOf(String, int) to lastIndexOf(CharSequence, int)
     * @since 3.6 Updated {@link CharSequenceUtils} call to behave more like <code>String</code>
     */
    public static int lastIndexOf(final CharSequence seq, final int searchChar) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(7642);
        __CLR4_5_25lh5lhlvha79yz.R.inc(7643);if ((((isEmpty(seq))&&(__CLR4_5_25lh5lhlvha79yz.R.iget(7644)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(7645)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(7646);return INDEX_NOT_FOUND;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(7647);return CharSequenceUtils.lastIndexOf(seq, searchChar, seq.length());
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    /**
     * Returns the index within <code>seq</code> of the last occurrence of
     * the specified character, searching backward starting at the
     * specified index. For values of <code>searchChar</code> in the range
     * from 0 to 0xFFFF (inclusive), the index returned is the largest
     * value <i>k</i> such that:
     * <blockquote><pre>
     * (this.charAt(<i>k</i>) == searchChar) &amp;&amp; (<i>k</i> &lt;= startPos)
     * </pre></blockquote>
     * is true. For other values of <code>searchChar</code>, it is the
     * largest value <i>k</i> such that:
     * <blockquote><pre>
     * (this.codePointAt(<i>k</i>) == searchChar) &amp;&amp; (<i>k</i> &lt;= startPos)
     * </pre></blockquote>
     * is true. In either case, if no such character occurs in <code>seq</code>
     * at or before position <code>startPos</code>, then
     * <code>-1</code> is returned. Furthermore, a {@code null} or empty ("")
     * <code>CharSequence</code> will return {@code -1}. A start position greater
     * than the string length searches the whole string.
     * The search starts at the <code>startPos</code> and works backwards;
     * matches starting after the start position are ignored.
     *
     * <p>All indices are specified in <code>char</code> values
     * (Unicode code units).
     *
     * <pre>
     * StringUtils.lastIndexOf(null, *, *)          = -1
     * StringUtils.lastIndexOf("", *,  *)           = -1
     * StringUtils.lastIndexOf("aabaabaa", 'b', 8)  = 5
     * StringUtils.lastIndexOf("aabaabaa", 'b', 4)  = 2
     * StringUtils.lastIndexOf("aabaabaa", 'b', 0)  = -1
     * StringUtils.lastIndexOf("aabaabaa", 'b', 9)  = 5
     * StringUtils.lastIndexOf("aabaabaa", 'b', -1) = -1
     * StringUtils.lastIndexOf("aabaabaa", 'a', 0)  = 0
     * </pre>
     *
     * @param seq  the CharSequence to check, may be null
     * @param searchChar  the character to find
     * @param startPos  the start position
     * @return the last index of the search character (always &le; startPos),
     *  -1 if no match or {@code null} string input
     * @since 2.0
     * @since 3.0 Changed signature from lastIndexOf(String, int, int) to lastIndexOf(CharSequence, int, int)
     */
    public static int lastIndexOf(final CharSequence seq, final int searchChar, final int startPos) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(7648);
        __CLR4_5_25lh5lhlvha79yz.R.inc(7649);if ((((isEmpty(seq))&&(__CLR4_5_25lh5lhlvha79yz.R.iget(7650)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(7651)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(7652);return INDEX_NOT_FOUND;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(7653);return CharSequenceUtils.lastIndexOf(seq, searchChar, startPos);
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    /**
     * <p>Finds the last index within a CharSequence, handling {@code null}.
     * This method uses {@link String#lastIndexOf(String)} if possible.</p>
     *
     * <p>A {@code null} CharSequence will return {@code -1}.</p>
     *
     * <pre>
     * StringUtils.lastIndexOf(null, *)          = -1
     * StringUtils.lastIndexOf(*, null)          = -1
     * StringUtils.lastIndexOf("", "")           = 0
     * StringUtils.lastIndexOf("aabaabaa", "a")  = 7
     * StringUtils.lastIndexOf("aabaabaa", "b")  = 5
     * StringUtils.lastIndexOf("aabaabaa", "ab") = 4
     * StringUtils.lastIndexOf("aabaabaa", "")   = 8
     * </pre>
     *
     * @param seq  the CharSequence to check, may be null
     * @param searchSeq  the CharSequence to find, may be null
     * @return the last index of the search String,
     *  -1 if no match or {@code null} string input
     * @since 2.0
     * @since 3.0 Changed signature from lastIndexOf(String, String) to lastIndexOf(CharSequence, CharSequence)
     */
    public static int lastIndexOf(final CharSequence seq, final CharSequence searchSeq) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(7654);
        __CLR4_5_25lh5lhlvha79yz.R.inc(7655);if ((((seq == null || searchSeq == null)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(7656)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(7657)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(7658);return INDEX_NOT_FOUND;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(7659);return CharSequenceUtils.lastIndexOf(seq, searchSeq, seq.length());
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    /**
     * <p>Finds the n-th last index within a String, handling {@code null}.
     * This method uses {@link String#lastIndexOf(String)}.</p>
     *
     * <p>A {@code null} String will return {@code -1}.</p>
     *
     * <pre>
     * StringUtils.lastOrdinalIndexOf(null, *, *)          = -1
     * StringUtils.lastOrdinalIndexOf(*, null, *)          = -1
     * StringUtils.lastOrdinalIndexOf("", "", *)           = 0
     * StringUtils.lastOrdinalIndexOf("aabaabaa", "a", 1)  = 7
     * StringUtils.lastOrdinalIndexOf("aabaabaa", "a", 2)  = 6
     * StringUtils.lastOrdinalIndexOf("aabaabaa", "b", 1)  = 5
     * StringUtils.lastOrdinalIndexOf("aabaabaa", "b", 2)  = 2
     * StringUtils.lastOrdinalIndexOf("aabaabaa", "ab", 1) = 4
     * StringUtils.lastOrdinalIndexOf("aabaabaa", "ab", 2) = 1
     * StringUtils.lastOrdinalIndexOf("aabaabaa", "", 1)   = 8
     * StringUtils.lastOrdinalIndexOf("aabaabaa", "", 2)   = 8
     * </pre>
     *
     * <p>Note that 'tail(CharSequence str, int n)' may be implemented as: </p>
     *
     * <pre>
     *   str.substring(lastOrdinalIndexOf(str, "\n", n) + 1)
     * </pre>
     *
     * @param str  the CharSequence to check, may be null
     * @param searchStr  the CharSequence to find, may be null
     * @param ordinal  the n-th last {@code searchStr} to find
     * @return the n-th last index of the search CharSequence,
     *  {@code -1} ({@code INDEX_NOT_FOUND}) if no match or {@code null} string input
     * @since 2.5
     * @since 3.0 Changed signature from lastOrdinalIndexOf(String, String, int) to lastOrdinalIndexOf(CharSequence, CharSequence, int)
     */
    public static int lastOrdinalIndexOf(final CharSequence str, final CharSequence searchStr, final int ordinal) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(7660);
        __CLR4_5_25lh5lhlvha79yz.R.inc(7661);return ordinalIndexOf(str, searchStr, ordinal, true);
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    /**
     * <p>Finds the last index within a CharSequence, handling {@code null}.
     * This method uses {@link String#lastIndexOf(String, int)} if possible.</p>
     *
     * <p>A {@code null} CharSequence will return {@code -1}.
     * A negative start position returns {@code -1}.
     * An empty ("") search CharSequence always matches unless the start position is negative.
     * A start position greater than the string length searches the whole string.
     * The search starts at the startPos and works backwards; matches starting after the start
     * position are ignored.
     * </p>
     *
     * <pre>
     * StringUtils.lastIndexOf(null, *, *)          = -1
     * StringUtils.lastIndexOf(*, null, *)          = -1
     * StringUtils.lastIndexOf("aabaabaa", "a", 8)  = 7
     * StringUtils.lastIndexOf("aabaabaa", "b", 8)  = 5
     * StringUtils.lastIndexOf("aabaabaa", "ab", 8) = 4
     * StringUtils.lastIndexOf("aabaabaa", "b", 9)  = 5
     * StringUtils.lastIndexOf("aabaabaa", "b", -1) = -1
     * StringUtils.lastIndexOf("aabaabaa", "a", 0)  = 0
     * StringUtils.lastIndexOf("aabaabaa", "b", 0)  = -1
     * StringUtils.lastIndexOf("aabaabaa", "b", 1)  = -1
     * StringUtils.lastIndexOf("aabaabaa", "b", 2)  = 2
     * StringUtils.lastIndexOf("aabaabaa", "ba", 2)  = -1
     * StringUtils.lastIndexOf("aabaabaa", "ba", 2)  = 2
     * </pre>
     *
     * @param seq  the CharSequence to check, may be null
     * @param searchSeq  the CharSequence to find, may be null
     * @param startPos  the start position, negative treated as zero
     * @return the last index of the search CharSequence (always &le; startPos),
     *  -1 if no match or {@code null} string input
     * @since 2.0
     * @since 3.0 Changed signature from lastIndexOf(String, String, int) to lastIndexOf(CharSequence, CharSequence, int)
     */
    public static int lastIndexOf(final CharSequence seq, final CharSequence searchSeq, final int startPos) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(7662);
        __CLR4_5_25lh5lhlvha79yz.R.inc(7663);if ((((seq == null || searchSeq == null)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(7664)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(7665)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(7666);return INDEX_NOT_FOUND;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(7667);return CharSequenceUtils.lastIndexOf(seq, searchSeq, startPos);
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    /**
     * <p>Case in-sensitive find of the last index within a CharSequence.</p>
     *
     * <p>A {@code null} CharSequence will return {@code -1}.
     * A negative start position returns {@code -1}.
     * An empty ("") search CharSequence always matches unless the start position is negative.
     * A start position greater than the string length searches the whole string.</p>
     *
     * <pre>
     * StringUtils.lastIndexOfIgnoreCase(null, *)          = -1
     * StringUtils.lastIndexOfIgnoreCase(*, null)          = -1
     * StringUtils.lastIndexOfIgnoreCase("aabaabaa", "A")  = 7
     * StringUtils.lastIndexOfIgnoreCase("aabaabaa", "B")  = 5
     * StringUtils.lastIndexOfIgnoreCase("aabaabaa", "AB") = 4
     * </pre>
     *
     * @param str  the CharSequence to check, may be null
     * @param searchStr  the CharSequence to find, may be null
     * @return the first index of the search CharSequence,
     *  -1 if no match or {@code null} string input
     * @since 2.5
     * @since 3.0 Changed signature from lastIndexOfIgnoreCase(String, String) to lastIndexOfIgnoreCase(CharSequence, CharSequence)
     */
    public static int lastIndexOfIgnoreCase(final CharSequence str, final CharSequence searchStr) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(7668);
        __CLR4_5_25lh5lhlvha79yz.R.inc(7669);if ((((str == null || searchStr == null)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(7670)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(7671)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(7672);return INDEX_NOT_FOUND;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(7673);return lastIndexOfIgnoreCase(str, searchStr, str.length());
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    /**
     * <p>Case in-sensitive find of the last index within a CharSequence
     * from the specified position.</p>
     *
     * <p>A {@code null} CharSequence will return {@code -1}.
     * A negative start position returns {@code -1}.
     * An empty ("") search CharSequence always matches unless the start position is negative.
     * A start position greater than the string length searches the whole string.
     * The search starts at the startPos and works backwards; matches starting after the start
     * position are ignored.
     * </p>
     *
     * <pre>
     * StringUtils.lastIndexOfIgnoreCase(null, *, *)          = -1
     * StringUtils.lastIndexOfIgnoreCase(*, null, *)          = -1
     * StringUtils.lastIndexOfIgnoreCase("aabaabaa", "A", 8)  = 7
     * StringUtils.lastIndexOfIgnoreCase("aabaabaa", "B", 8)  = 5
     * StringUtils.lastIndexOfIgnoreCase("aabaabaa", "AB", 8) = 4
     * StringUtils.lastIndexOfIgnoreCase("aabaabaa", "B", 9)  = 5
     * StringUtils.lastIndexOfIgnoreCase("aabaabaa", "B", -1) = -1
     * StringUtils.lastIndexOfIgnoreCase("aabaabaa", "A", 0)  = 0
     * StringUtils.lastIndexOfIgnoreCase("aabaabaa", "B", 0)  = -1
     * </pre>
     *
     * @param str  the CharSequence to check, may be null
     * @param searchStr  the CharSequence to find, may be null
     * @param startPos  the start position
     * @return the last index of the search CharSequence (always &le; startPos),
     *  -1 if no match or {@code null} input
     * @since 2.5
     * @since 3.0 Changed signature from lastIndexOfIgnoreCase(String, String, int) to lastIndexOfIgnoreCase(CharSequence, CharSequence, int)
     */
    public static int lastIndexOfIgnoreCase(final CharSequence str, final CharSequence searchStr, int startPos) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(7674);
        __CLR4_5_25lh5lhlvha79yz.R.inc(7675);if ((((str == null || searchStr == null)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(7676)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(7677)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(7678);return INDEX_NOT_FOUND;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(7679);if ((((startPos > str.length() - searchStr.length())&&(__CLR4_5_25lh5lhlvha79yz.R.iget(7680)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(7681)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(7682);startPos = str.length() - searchStr.length();
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(7683);if ((((startPos < 0)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(7684)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(7685)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(7686);return INDEX_NOT_FOUND;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(7687);if ((((searchStr.length() == 0)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(7688)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(7689)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(7690);return startPos;
        }

        }__CLR4_5_25lh5lhlvha79yz.R.inc(7691);for (int i = startPos; (((i >= 0)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(7692)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(7693)==0&false)); i--) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(7694);if ((((CharSequenceUtils.regionMatches(str, true, i, searchStr, 0, searchStr.length()))&&(__CLR4_5_25lh5lhlvha79yz.R.iget(7695)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(7696)==0&false))) {{
                __CLR4_5_25lh5lhlvha79yz.R.inc(7697);return i;
            }
        }}
        }__CLR4_5_25lh5lhlvha79yz.R.inc(7698);return INDEX_NOT_FOUND;
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    // Contains
    //-----------------------------------------------------------------------
    /**
     * <p>Checks if CharSequence contains a search character, handling {@code null}.
     * This method uses {@link String#indexOf(int)} if possible.</p>
     *
     * <p>A {@code null} or empty ("") CharSequence will return {@code false}.</p>
     *
     * <pre>
     * StringUtils.contains(null, *)    = false
     * StringUtils.contains("", *)      = false
     * StringUtils.contains("abc", 'a') = true
     * StringUtils.contains("abc", 'z') = false
     * </pre>
     *
     * @param seq  the CharSequence to check, may be null
     * @param searchChar  the character to find
     * @return true if the CharSequence contains the search character,
     *  false if not or {@code null} string input
     * @since 2.0
     * @since 3.0 Changed signature from contains(String, int) to contains(CharSequence, int)
     */
    public static boolean contains(final CharSequence seq, final int searchChar) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(7699);
        __CLR4_5_25lh5lhlvha79yz.R.inc(7700);if ((((isEmpty(seq))&&(__CLR4_5_25lh5lhlvha79yz.R.iget(7701)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(7702)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(7703);return false;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(7704);return CharSequenceUtils.indexOf(seq, searchChar, 0) >= 0;
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    /**
     * <p>Checks if CharSequence contains a search CharSequence, handling {@code null}.
     * This method uses {@link String#indexOf(String)} if possible.</p>
     *
     * <p>A {@code null} CharSequence will return {@code false}.</p>
     *
     * <pre>
     * StringUtils.contains(null, *)     = false
     * StringUtils.contains(*, null)     = false
     * StringUtils.contains("", "")      = true
     * StringUtils.contains("abc", "")   = true
     * StringUtils.contains("abc", "a")  = true
     * StringUtils.contains("abc", "z")  = false
     * </pre>
     *
     * @param seq  the CharSequence to check, may be null
     * @param searchSeq  the CharSequence to find, may be null
     * @return true if the CharSequence contains the search CharSequence,
     *  false if not or {@code null} string input
     * @since 2.0
     * @since 3.0 Changed signature from contains(String, String) to contains(CharSequence, CharSequence)
     */
    public static boolean contains(final CharSequence seq, final CharSequence searchSeq) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(7705);
        __CLR4_5_25lh5lhlvha79yz.R.inc(7706);if ((((seq == null || searchSeq == null)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(7707)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(7708)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(7709);return false;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(7710);return CharSequenceUtils.indexOf(seq, searchSeq, 0) >= 0;
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    /**
     * <p>Checks if CharSequence contains a search CharSequence irrespective of case,
     * handling {@code null}. Case-insensitivity is defined as by
     * {@link String#equalsIgnoreCase(String)}.
     *
     * <p>A {@code null} CharSequence will return {@code false}.</p>
     *
     * <pre>
     * StringUtils.containsIgnoreCase(null, *) = false
     * StringUtils.containsIgnoreCase(*, null) = false
     * StringUtils.containsIgnoreCase("", "") = true
     * StringUtils.containsIgnoreCase("abc", "") = true
     * StringUtils.containsIgnoreCase("abc", "a") = true
     * StringUtils.containsIgnoreCase("abc", "z") = false
     * StringUtils.containsIgnoreCase("abc", "A") = true
     * StringUtils.containsIgnoreCase("abc", "Z") = false
     * </pre>
     *
     * @param str  the CharSequence to check, may be null
     * @param searchStr  the CharSequence to find, may be null
     * @return true if the CharSequence contains the search CharSequence irrespective of
     * case or false if not or {@code null} string input
     * @since 3.0 Changed signature from containsIgnoreCase(String, String) to containsIgnoreCase(CharSequence, CharSequence)
     */
    public static boolean containsIgnoreCase(final CharSequence str, final CharSequence searchStr) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(7711);
        __CLR4_5_25lh5lhlvha79yz.R.inc(7712);if ((((str == null || searchStr == null)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(7713)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(7714)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(7715);return false;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(7716);final int len = searchStr.length();
        __CLR4_5_25lh5lhlvha79yz.R.inc(7717);final int max = str.length() - len;
        __CLR4_5_25lh5lhlvha79yz.R.inc(7718);for (int i = 0; (((i <= max)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(7719)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(7720)==0&false)); i++) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(7721);if ((((CharSequenceUtils.regionMatches(str, true, i, searchStr, 0, len))&&(__CLR4_5_25lh5lhlvha79yz.R.iget(7722)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(7723)==0&false))) {{
                __CLR4_5_25lh5lhlvha79yz.R.inc(7724);return true;
            }
        }}
        }__CLR4_5_25lh5lhlvha79yz.R.inc(7725);return false;
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    /**
     * <p>Check whether the given CharSequence contains any whitespace characters.</p>
     * 
     * <p>Whitespace is defined by {@link Character#isWhitespace(char)}.</p>
     * 
     * @param seq the CharSequence to check (may be {@code null})
     * @return {@code true} if the CharSequence is not empty and
     * contains at least 1 (breaking) whitespace character
     * @since 3.0
     */
    // From org.springframework.util.StringUtils, under Apache License 2.0
    public static boolean containsWhitespace(final CharSequence seq) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(7726);
        __CLR4_5_25lh5lhlvha79yz.R.inc(7727);if ((((isEmpty(seq))&&(__CLR4_5_25lh5lhlvha79yz.R.iget(7728)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(7729)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(7730);return false;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(7731);final int strLen = seq.length();
        __CLR4_5_25lh5lhlvha79yz.R.inc(7732);for (int i = 0; (((i < strLen)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(7733)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(7734)==0&false)); i++) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(7735);if ((((Character.isWhitespace(seq.charAt(i)))&&(__CLR4_5_25lh5lhlvha79yz.R.iget(7736)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(7737)==0&false))) {{
                __CLR4_5_25lh5lhlvha79yz.R.inc(7738);return true;
            }
        }}
        }__CLR4_5_25lh5lhlvha79yz.R.inc(7739);return false;
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    // IndexOfAny chars
    //-----------------------------------------------------------------------
    /**
     * <p>Search a CharSequence to find the first index of any
     * character in the given set of characters.</p>
     *
     * <p>A {@code null} String will return {@code -1}.
     * A {@code null} or zero length search array will return {@code -1}.</p>
     *
     * <pre>
     * StringUtils.indexOfAny(null, *)                = -1
     * StringUtils.indexOfAny("", *)                  = -1
     * StringUtils.indexOfAny(*, null)                = -1
     * StringUtils.indexOfAny(*, [])                  = -1
     * StringUtils.indexOfAny("zzabyycdxx",['z','a']) = 0
     * StringUtils.indexOfAny("zzabyycdxx",['b','y']) = 3
     * StringUtils.indexOfAny("aba", ['z'])           = -1
     * </pre>
     *
     * @param cs  the CharSequence to check, may be null
     * @param searchChars  the chars to search for, may be null
     * @return the index of any of the chars, -1 if no match or null input
     * @since 2.0
     * @since 3.0 Changed signature from indexOfAny(String, char[]) to indexOfAny(CharSequence, char...)
     */
    public static int indexOfAny(final CharSequence cs, final char... searchChars) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(7740);
        __CLR4_5_25lh5lhlvha79yz.R.inc(7741);if ((((isEmpty(cs) || ArrayUtils.isEmpty(searchChars))&&(__CLR4_5_25lh5lhlvha79yz.R.iget(7742)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(7743)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(7744);return INDEX_NOT_FOUND;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(7745);final int csLen = cs.length();
        __CLR4_5_25lh5lhlvha79yz.R.inc(7746);final int csLast = csLen - 1;
        __CLR4_5_25lh5lhlvha79yz.R.inc(7747);final int searchLen = searchChars.length;
        __CLR4_5_25lh5lhlvha79yz.R.inc(7748);final int searchLast = searchLen - 1;
        __CLR4_5_25lh5lhlvha79yz.R.inc(7749);for (int i = 0; (((i < csLen)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(7750)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(7751)==0&false)); i++) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(7752);final char ch = cs.charAt(i);
            __CLR4_5_25lh5lhlvha79yz.R.inc(7753);for (int j = 0; (((j < searchLen)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(7754)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(7755)==0&false)); j++) {{
                __CLR4_5_25lh5lhlvha79yz.R.inc(7756);if ((((searchChars[j] == ch)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(7757)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(7758)==0&false))) {{
                    __CLR4_5_25lh5lhlvha79yz.R.inc(7759);if ((((i < csLast && j < searchLast && Character.isHighSurrogate(ch))&&(__CLR4_5_25lh5lhlvha79yz.R.iget(7760)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(7761)==0&false))) {{
                        // ch is a supplementary character
                        __CLR4_5_25lh5lhlvha79yz.R.inc(7762);if ((((searchChars[j + 1] == cs.charAt(i + 1))&&(__CLR4_5_25lh5lhlvha79yz.R.iget(7763)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(7764)==0&false))) {{
                            __CLR4_5_25lh5lhlvha79yz.R.inc(7765);return i;
                        }
                    }} }else {{
                        __CLR4_5_25lh5lhlvha79yz.R.inc(7766);return i;
                    }
                }}
            }}
        }}
        }__CLR4_5_25lh5lhlvha79yz.R.inc(7767);return INDEX_NOT_FOUND;
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    /**
     * <p>Search a CharSequence to find the first index of any
     * character in the given set of characters.</p>
     *
     * <p>A {@code null} String will return {@code -1}.
     * A {@code null} search string will return {@code -1}.</p>
     *
     * <pre>
     * StringUtils.indexOfAny(null, *)            = -1
     * StringUtils.indexOfAny("", *)              = -1
     * StringUtils.indexOfAny(*, null)            = -1
     * StringUtils.indexOfAny(*, "")              = -1
     * StringUtils.indexOfAny("zzabyycdxx", "za") = 0
     * StringUtils.indexOfAny("zzabyycdxx", "by") = 3
     * StringUtils.indexOfAny("aba","z")          = -1
     * </pre>
     *
     * @param cs  the CharSequence to check, may be null
     * @param searchChars  the chars to search for, may be null
     * @return the index of any of the chars, -1 if no match or null input
     * @since 2.0
     * @since 3.0 Changed signature from indexOfAny(String, String) to indexOfAny(CharSequence, String)
     */
    public static int indexOfAny(final CharSequence cs, final String searchChars) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(7768);
        __CLR4_5_25lh5lhlvha79yz.R.inc(7769);if ((((isEmpty(cs) || isEmpty(searchChars))&&(__CLR4_5_25lh5lhlvha79yz.R.iget(7770)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(7771)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(7772);return INDEX_NOT_FOUND;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(7773);return indexOfAny(cs, searchChars.toCharArray());
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    // ContainsAny
    //-----------------------------------------------------------------------
    /**
     * <p>Checks if the CharSequence contains any character in the given
     * set of characters.</p>
     *
     * <p>A {@code null} CharSequence will return {@code false}.
     * A {@code null} or zero length search array will return {@code false}.</p>
     *
     * <pre>
     * StringUtils.containsAny(null, *)                = false
     * StringUtils.containsAny("", *)                  = false
     * StringUtils.containsAny(*, null)                = false
     * StringUtils.containsAny(*, [])                  = false
     * StringUtils.containsAny("zzabyycdxx",['z','a']) = true
     * StringUtils.containsAny("zzabyycdxx",['b','y']) = true
     * StringUtils.containsAny("zzabyycdxx",['z','y']) = true
     * StringUtils.containsAny("aba", ['z'])           = false
     * </pre>
     *
     * @param cs  the CharSequence to check, may be null
     * @param searchChars  the chars to search for, may be null
     * @return the {@code true} if any of the chars are found,
     * {@code false} if no match or null input
     * @since 2.4
     * @since 3.0 Changed signature from containsAny(String, char[]) to containsAny(CharSequence, char...)
     */
    public static boolean containsAny(final CharSequence cs, final char... searchChars) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(7774);
        __CLR4_5_25lh5lhlvha79yz.R.inc(7775);if ((((isEmpty(cs) || ArrayUtils.isEmpty(searchChars))&&(__CLR4_5_25lh5lhlvha79yz.R.iget(7776)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(7777)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(7778);return false;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(7779);final int csLength = cs.length();
        __CLR4_5_25lh5lhlvha79yz.R.inc(7780);final int searchLength = searchChars.length;
        __CLR4_5_25lh5lhlvha79yz.R.inc(7781);final int csLast = csLength - 1;
        __CLR4_5_25lh5lhlvha79yz.R.inc(7782);final int searchLast = searchLength - 1;
        __CLR4_5_25lh5lhlvha79yz.R.inc(7783);for (int i = 0; (((i < csLength)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(7784)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(7785)==0&false)); i++) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(7786);final char ch = cs.charAt(i);
            __CLR4_5_25lh5lhlvha79yz.R.inc(7787);for (int j = 0; (((j < searchLength)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(7788)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(7789)==0&false)); j++) {{
                __CLR4_5_25lh5lhlvha79yz.R.inc(7790);if ((((searchChars[j] == ch)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(7791)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(7792)==0&false))) {{
                    __CLR4_5_25lh5lhlvha79yz.R.inc(7793);if ((((Character.isHighSurrogate(ch))&&(__CLR4_5_25lh5lhlvha79yz.R.iget(7794)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(7795)==0&false))) {{
                        __CLR4_5_25lh5lhlvha79yz.R.inc(7796);if ((((j == searchLast)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(7797)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(7798)==0&false))) {{
                            // missing low surrogate, fine, like String.indexOf(String)
                            __CLR4_5_25lh5lhlvha79yz.R.inc(7799);return true;
                        }
                        }__CLR4_5_25lh5lhlvha79yz.R.inc(7800);if ((((i < csLast && searchChars[j + 1] == cs.charAt(i + 1))&&(__CLR4_5_25lh5lhlvha79yz.R.iget(7801)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(7802)==0&false))) {{
                            __CLR4_5_25lh5lhlvha79yz.R.inc(7803);return true;
                        }
                    }} }else {{
                        // ch is in the Basic Multilingual Plane
                        __CLR4_5_25lh5lhlvha79yz.R.inc(7804);return true;
                    }
                }}
            }}
        }}
        }__CLR4_5_25lh5lhlvha79yz.R.inc(7805);return false;
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    /**
     * <p>
     * Checks if the CharSequence contains any character in the given set of characters.
     * </p>
     *
     * <p>
     * A {@code null} CharSequence will return {@code false}. A {@code null} search CharSequence will return
     * {@code false}.
     * </p>
     *
     * <pre>
     * StringUtils.containsAny(null, *)               = false
     * StringUtils.containsAny("", *)                 = false
     * StringUtils.containsAny(*, null)               = false
     * StringUtils.containsAny(*, "")                 = false
     * StringUtils.containsAny("zzabyycdxx", "za")    = true
     * StringUtils.containsAny("zzabyycdxx", "by")    = true
     * StringUtils.containsAny("zzabyycdxx", "zy")    = true
     * StringUtils.containsAny("zzabyycdxx", "\tx")   = true
     * StringUtils.containsAny("zzabyycdxx", "$.#yF") = true
     * StringUtils.containsAny("aba","z")             = false
     * </pre>
     *
     * @param cs
     *            the CharSequence to check, may be null
     * @param searchChars
     *            the chars to search for, may be null
     * @return the {@code true} if any of the chars are found, {@code false} if no match or null input
     * @since 2.4
     * @since 3.0 Changed signature from containsAny(String, String) to containsAny(CharSequence, CharSequence)
     */
    public static boolean containsAny(final CharSequence cs, final CharSequence searchChars) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(7806);
        __CLR4_5_25lh5lhlvha79yz.R.inc(7807);if ((((searchChars == null)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(7808)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(7809)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(7810);return false;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(7811);return containsAny(cs, CharSequenceUtils.toCharArray(searchChars));
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    /**
     * <p>Checks if the CharSequence contains any of the CharSequences in the given array.</p>
     *
     * <p>
     * A {@code null} {@code cs} CharSequence will return {@code false}. A {@code null} or zero
     * length search array will return {@code false}.
     * </p>
     *
     * <pre>
     * StringUtils.containsAny(null, *)            = false
     * StringUtils.containsAny("", *)              = false
     * StringUtils.containsAny(*, null)            = false
     * StringUtils.containsAny(*, [])              = false
     * StringUtils.containsAny("abcd", "ab", null) = true
     * StringUtils.containsAny("abcd", "ab", "cd") = true
     * StringUtils.containsAny("abc", "d", "abc")  = true
     * </pre>
     *
     * 
     * @param cs The CharSequence to check, may be null
     * @param searchCharSequences The array of CharSequences to search for, may be null.
     * Individual CharSequences may be null as well.
     * @return {@code true} if any of the search CharSequences are found, {@code false} otherwise
     * @since 3.4
     */
    public static boolean containsAny(final CharSequence cs, final CharSequence... searchCharSequences) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(7812);
        __CLR4_5_25lh5lhlvha79yz.R.inc(7813);if ((((isEmpty(cs) || ArrayUtils.isEmpty(searchCharSequences))&&(__CLR4_5_25lh5lhlvha79yz.R.iget(7814)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(7815)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(7816);return false;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(7817);for (final CharSequence searchCharSequence : searchCharSequences) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(7818);if ((((contains(cs, searchCharSequence))&&(__CLR4_5_25lh5lhlvha79yz.R.iget(7819)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(7820)==0&false))) {{
                __CLR4_5_25lh5lhlvha79yz.R.inc(7821);return true;
            }
        }}
        }__CLR4_5_25lh5lhlvha79yz.R.inc(7822);return false;
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    // IndexOfAnyBut chars
    //-----------------------------------------------------------------------
    /**
     * <p>Searches a CharSequence to find the first index of any
     * character not in the given set of characters.</p>
     *
     * <p>A {@code null} CharSequence will return {@code -1}.
     * A {@code null} or zero length search array will return {@code -1}.</p>
     *
     * <pre>
     * StringUtils.indexOfAnyBut(null, *)                              = -1
     * StringUtils.indexOfAnyBut("", *)                                = -1
     * StringUtils.indexOfAnyBut(*, null)                              = -1
     * StringUtils.indexOfAnyBut(*, [])                                = -1
     * StringUtils.indexOfAnyBut("zzabyycdxx", new char[] {'z', 'a'} ) = 3
     * StringUtils.indexOfAnyBut("aba", new char[] {'z'} )             = 0
     * StringUtils.indexOfAnyBut("aba", new char[] {'a', 'b'} )        = -1

     * </pre>
     *
     * @param cs  the CharSequence to check, may be null
     * @param searchChars  the chars to search for, may be null
     * @return the index of any of the chars, -1 if no match or null input
     * @since 2.0
     * @since 3.0 Changed signature from indexOfAnyBut(String, char[]) to indexOfAnyBut(CharSequence, char...)
     */
    public static int indexOfAnyBut(final CharSequence cs, final char... searchChars) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(7823);
        __CLR4_5_25lh5lhlvha79yz.R.inc(7824);if ((((isEmpty(cs) || ArrayUtils.isEmpty(searchChars))&&(__CLR4_5_25lh5lhlvha79yz.R.iget(7825)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(7826)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(7827);return INDEX_NOT_FOUND;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(7828);final int csLen = cs.length();
        __CLR4_5_25lh5lhlvha79yz.R.inc(7829);final int csLast = csLen - 1;
        __CLR4_5_25lh5lhlvha79yz.R.inc(7830);final int searchLen = searchChars.length;
        __CLR4_5_25lh5lhlvha79yz.R.inc(7831);final int searchLast = searchLen - 1;
        __CLR4_5_25lh5lhlvha79yz.R.inc(7832);outer:
        for (int i = 0; (((i < csLen)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(7833)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(7834)==0&false)); i++) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(7835);final char ch = cs.charAt(i);
            __CLR4_5_25lh5lhlvha79yz.R.inc(7836);for (int j = 0; (((j < searchLen)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(7837)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(7838)==0&false)); j++) {{
                __CLR4_5_25lh5lhlvha79yz.R.inc(7839);if ((((searchChars[j] == ch)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(7840)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(7841)==0&false))) {{
                    __CLR4_5_25lh5lhlvha79yz.R.inc(7842);if ((((i < csLast && j < searchLast && Character.isHighSurrogate(ch))&&(__CLR4_5_25lh5lhlvha79yz.R.iget(7843)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(7844)==0&false))) {{
                        __CLR4_5_25lh5lhlvha79yz.R.inc(7845);if ((((searchChars[j + 1] == cs.charAt(i + 1))&&(__CLR4_5_25lh5lhlvha79yz.R.iget(7846)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(7847)==0&false))) {{
                            __CLR4_5_25lh5lhlvha79yz.R.inc(7848);continue outer;
                        }
                    }} }else {{
                        __CLR4_5_25lh5lhlvha79yz.R.inc(7849);continue outer;
                    }
                }}
            }}
            }__CLR4_5_25lh5lhlvha79yz.R.inc(7850);return i;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(7851);return INDEX_NOT_FOUND;
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    /**
     * <p>Search a CharSequence to find the first index of any
     * character not in the given set of characters.</p>
     *
     * <p>A {@code null} CharSequence will return {@code -1}.
     * A {@code null} or empty search string will return {@code -1}.</p>
     *
     * <pre>
     * StringUtils.indexOfAnyBut(null, *)            = -1
     * StringUtils.indexOfAnyBut("", *)              = -1
     * StringUtils.indexOfAnyBut(*, null)            = -1
     * StringUtils.indexOfAnyBut(*, "")              = -1
     * StringUtils.indexOfAnyBut("zzabyycdxx", "za") = 3
     * StringUtils.indexOfAnyBut("zzabyycdxx", "")   = -1
     * StringUtils.indexOfAnyBut("aba","ab")         = -1
     * </pre>
     *
     * @param seq  the CharSequence to check, may be null
     * @param searchChars  the chars to search for, may be null
     * @return the index of any of the chars, -1 if no match or null input
     * @since 2.0
     * @since 3.0 Changed signature from indexOfAnyBut(String, String) to indexOfAnyBut(CharSequence, CharSequence)
     */
    public static int indexOfAnyBut(final CharSequence seq, final CharSequence searchChars) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(7852);
        __CLR4_5_25lh5lhlvha79yz.R.inc(7853);if ((((isEmpty(seq) || isEmpty(searchChars))&&(__CLR4_5_25lh5lhlvha79yz.R.iget(7854)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(7855)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(7856);return INDEX_NOT_FOUND;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(7857);final int strLen = seq.length();
        __CLR4_5_25lh5lhlvha79yz.R.inc(7858);for (int i = 0; (((i < strLen)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(7859)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(7860)==0&false)); i++) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(7861);final char ch = seq.charAt(i);
            __CLR4_5_25lh5lhlvha79yz.R.inc(7862);final boolean chFound = CharSequenceUtils.indexOf(searchChars, ch, 0) >= 0;
            __CLR4_5_25lh5lhlvha79yz.R.inc(7863);if ((((i + 1 < strLen && Character.isHighSurrogate(ch))&&(__CLR4_5_25lh5lhlvha79yz.R.iget(7864)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(7865)==0&false))) {{
                __CLR4_5_25lh5lhlvha79yz.R.inc(7866);final char ch2 = seq.charAt(i + 1);
                __CLR4_5_25lh5lhlvha79yz.R.inc(7867);if ((((chFound && CharSequenceUtils.indexOf(searchChars, ch2, 0) < 0)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(7868)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(7869)==0&false))) {{
                    __CLR4_5_25lh5lhlvha79yz.R.inc(7870);return i;
                }
            }} }else {{
                __CLR4_5_25lh5lhlvha79yz.R.inc(7871);if ((((!chFound)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(7872)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(7873)==0&false))) {{
                    __CLR4_5_25lh5lhlvha79yz.R.inc(7874);return i;
                }
            }}
        }}
        }__CLR4_5_25lh5lhlvha79yz.R.inc(7875);return INDEX_NOT_FOUND;
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    // ContainsOnly
    //-----------------------------------------------------------------------
    /**
     * <p>Checks if the CharSequence contains only certain characters.</p>
     *
     * <p>A {@code null} CharSequence will return {@code false}.
     * A {@code null} valid character array will return {@code false}.
     * An empty CharSequence (length()=0) always returns {@code true}.</p>
     *
     * <pre>
     * StringUtils.containsOnly(null, *)       = false
     * StringUtils.containsOnly(*, null)       = false
     * StringUtils.containsOnly("", *)         = true
     * StringUtils.containsOnly("ab", '')      = false
     * StringUtils.containsOnly("abab", 'abc') = true
     * StringUtils.containsOnly("ab1", 'abc')  = false
     * StringUtils.containsOnly("abz", 'abc')  = false
     * </pre>
     *
     * @param cs  the String to check, may be null
     * @param valid  an array of valid chars, may be null
     * @return true if it only contains valid chars and is non-null
     * @since 3.0 Changed signature from containsOnly(String, char[]) to containsOnly(CharSequence, char...)
     */
    public static boolean containsOnly(final CharSequence cs, final char... valid) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(7876);
        // All these pre-checks are to maintain API with an older version
        __CLR4_5_25lh5lhlvha79yz.R.inc(7877);if ((((valid == null || cs == null)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(7878)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(7879)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(7880);return false;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(7881);if ((((cs.length() == 0)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(7882)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(7883)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(7884);return true;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(7885);if ((((valid.length == 0)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(7886)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(7887)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(7888);return false;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(7889);return indexOfAnyBut(cs, valid) == INDEX_NOT_FOUND;
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    /**
     * <p>Checks if the CharSequence contains only certain characters.</p>
     *
     * <p>A {@code null} CharSequence will return {@code false}.
     * A {@code null} valid character String will return {@code false}.
     * An empty String (length()=0) always returns {@code true}.</p>
     *
     * <pre>
     * StringUtils.containsOnly(null, *)       = false
     * StringUtils.containsOnly(*, null)       = false
     * StringUtils.containsOnly("", *)         = true
     * StringUtils.containsOnly("ab", "")      = false
     * StringUtils.containsOnly("abab", "abc") = true
     * StringUtils.containsOnly("ab1", "abc")  = false
     * StringUtils.containsOnly("abz", "abc")  = false
     * </pre>
     *
     * @param cs  the CharSequence to check, may be null
     * @param validChars  a String of valid chars, may be null
     * @return true if it only contains valid chars and is non-null
     * @since 2.0
     * @since 3.0 Changed signature from containsOnly(String, String) to containsOnly(CharSequence, String)
     */
    public static boolean containsOnly(final CharSequence cs, final String validChars) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(7890);
        __CLR4_5_25lh5lhlvha79yz.R.inc(7891);if ((((cs == null || validChars == null)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(7892)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(7893)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(7894);return false;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(7895);return containsOnly(cs, validChars.toCharArray());
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    // ContainsNone
    //-----------------------------------------------------------------------
    /**
     * <p>Checks that the CharSequence does not contain certain characters.</p>
     *
     * <p>A {@code null} CharSequence will return {@code true}.
     * A {@code null} invalid character array will return {@code true}.
     * An empty CharSequence (length()=0) always returns true.</p>
     *
     * <pre>
     * StringUtils.containsNone(null, *)       = true
     * StringUtils.containsNone(*, null)       = true
     * StringUtils.containsNone("", *)         = true
     * StringUtils.containsNone("ab", '')      = true
     * StringUtils.containsNone("abab", 'xyz') = true
     * StringUtils.containsNone("ab1", 'xyz')  = true
     * StringUtils.containsNone("abz", 'xyz')  = false
     * </pre>
     *
     * @param cs  the CharSequence to check, may be null
     * @param searchChars  an array of invalid chars, may be null
     * @return true if it contains none of the invalid chars, or is null
     * @since 2.0
     * @since 3.0 Changed signature from containsNone(String, char[]) to containsNone(CharSequence, char...)
     */
    public static boolean containsNone(final CharSequence cs, final char... searchChars) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(7896);
        __CLR4_5_25lh5lhlvha79yz.R.inc(7897);if ((((cs == null || searchChars == null)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(7898)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(7899)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(7900);return true;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(7901);final int csLen = cs.length();
        __CLR4_5_25lh5lhlvha79yz.R.inc(7902);final int csLast = csLen - 1;
        __CLR4_5_25lh5lhlvha79yz.R.inc(7903);final int searchLen = searchChars.length;
        __CLR4_5_25lh5lhlvha79yz.R.inc(7904);final int searchLast = searchLen - 1;
        __CLR4_5_25lh5lhlvha79yz.R.inc(7905);for (int i = 0; (((i < csLen)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(7906)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(7907)==0&false)); i++) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(7908);final char ch = cs.charAt(i);
            __CLR4_5_25lh5lhlvha79yz.R.inc(7909);for (int j = 0; (((j < searchLen)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(7910)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(7911)==0&false)); j++) {{
                __CLR4_5_25lh5lhlvha79yz.R.inc(7912);if ((((searchChars[j] == ch)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(7913)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(7914)==0&false))) {{
                    __CLR4_5_25lh5lhlvha79yz.R.inc(7915);if ((((Character.isHighSurrogate(ch))&&(__CLR4_5_25lh5lhlvha79yz.R.iget(7916)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(7917)==0&false))) {{
                        __CLR4_5_25lh5lhlvha79yz.R.inc(7918);if ((((j == searchLast)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(7919)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(7920)==0&false))) {{
                            // missing low surrogate, fine, like String.indexOf(String)
                            __CLR4_5_25lh5lhlvha79yz.R.inc(7921);return false;
                        }
                        }__CLR4_5_25lh5lhlvha79yz.R.inc(7922);if ((((i < csLast && searchChars[j + 1] == cs.charAt(i + 1))&&(__CLR4_5_25lh5lhlvha79yz.R.iget(7923)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(7924)==0&false))) {{
                            __CLR4_5_25lh5lhlvha79yz.R.inc(7925);return false;
                        }
                    }} }else {{
                        // ch is in the Basic Multilingual Plane
                        __CLR4_5_25lh5lhlvha79yz.R.inc(7926);return false;
                    }
                }}
            }}
        }}
        }__CLR4_5_25lh5lhlvha79yz.R.inc(7927);return true;
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    /**
     * <p>Checks that the CharSequence does not contain certain characters.</p>
     *
     * <p>A {@code null} CharSequence will return {@code true}.
     * A {@code null} invalid character array will return {@code true}.
     * An empty String ("") always returns true.</p>
     *
     * <pre>
     * StringUtils.containsNone(null, *)       = true
     * StringUtils.containsNone(*, null)       = true
     * StringUtils.containsNone("", *)         = true
     * StringUtils.containsNone("ab", "")      = true
     * StringUtils.containsNone("abab", "xyz") = true
     * StringUtils.containsNone("ab1", "xyz")  = true
     * StringUtils.containsNone("abz", "xyz")  = false
     * </pre>
     *
     * @param cs  the CharSequence to check, may be null
     * @param invalidChars  a String of invalid chars, may be null
     * @return true if it contains none of the invalid chars, or is null
     * @since 2.0
     * @since 3.0 Changed signature from containsNone(String, String) to containsNone(CharSequence, String)
     */
    public static boolean containsNone(final CharSequence cs, final String invalidChars) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(7928);
        __CLR4_5_25lh5lhlvha79yz.R.inc(7929);if ((((cs == null || invalidChars == null)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(7930)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(7931)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(7932);return true;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(7933);return containsNone(cs, invalidChars.toCharArray());
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    // IndexOfAny strings
    //-----------------------------------------------------------------------
    /**
     * <p>Find the first index of any of a set of potential substrings.</p>
     *
     * <p>A {@code null} CharSequence will return {@code -1}.
     * A {@code null} or zero length search array will return {@code -1}.
     * A {@code null} search array entry will be ignored, but a search
     * array containing "" will return {@code 0} if {@code str} is not
     * null. This method uses {@link String#indexOf(String)} if possible.</p>
     *
     * <pre>
     * StringUtils.indexOfAny(null, *)                     = -1
     * StringUtils.indexOfAny(*, null)                     = -1
     * StringUtils.indexOfAny(*, [])                       = -1
     * StringUtils.indexOfAny("zzabyycdxx", ["ab","cd"])   = 2
     * StringUtils.indexOfAny("zzabyycdxx", ["cd","ab"])   = 2
     * StringUtils.indexOfAny("zzabyycdxx", ["mn","op"])   = -1
     * StringUtils.indexOfAny("zzabyycdxx", ["zab","aby"]) = 1
     * StringUtils.indexOfAny("zzabyycdxx", [""])          = 0
     * StringUtils.indexOfAny("", [""])                    = 0
     * StringUtils.indexOfAny("", ["a"])                   = -1
     * </pre>
     *
     * @param str  the CharSequence to check, may be null
     * @param searchStrs  the CharSequences to search for, may be null
     * @return the first index of any of the searchStrs in str, -1 if no match
     * @since 3.0 Changed signature from indexOfAny(String, String[]) to indexOfAny(CharSequence, CharSequence...)
     */
    public static int indexOfAny(final CharSequence str, final CharSequence... searchStrs) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(7934);
        __CLR4_5_25lh5lhlvha79yz.R.inc(7935);if ((((str == null || searchStrs == null)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(7936)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(7937)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(7938);return INDEX_NOT_FOUND;
        }

        // String's can't have a MAX_VALUEth index.
        }__CLR4_5_25lh5lhlvha79yz.R.inc(7939);int ret = Integer.MAX_VALUE;

        __CLR4_5_25lh5lhlvha79yz.R.inc(7940);int tmp = 0;
        __CLR4_5_25lh5lhlvha79yz.R.inc(7941);for (final CharSequence search : searchStrs) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(7942);if ((((search == null)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(7943)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(7944)==0&false))) {{
                __CLR4_5_25lh5lhlvha79yz.R.inc(7945);continue;
            }
            }__CLR4_5_25lh5lhlvha79yz.R.inc(7946);tmp = CharSequenceUtils.indexOf(str, search, 0);
            __CLR4_5_25lh5lhlvha79yz.R.inc(7947);if ((((tmp == INDEX_NOT_FOUND)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(7948)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(7949)==0&false))) {{
                __CLR4_5_25lh5lhlvha79yz.R.inc(7950);continue;
            }

            }__CLR4_5_25lh5lhlvha79yz.R.inc(7951);if ((((tmp < ret)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(7952)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(7953)==0&false))) {{
                __CLR4_5_25lh5lhlvha79yz.R.inc(7954);ret = tmp;
            }
        }}

        }__CLR4_5_25lh5lhlvha79yz.R.inc(7955);return (((ret == Integer.MAX_VALUE )&&(__CLR4_5_25lh5lhlvha79yz.R.iget(7956)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(7957)==0&false))? INDEX_NOT_FOUND : ret;
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    /**
     * <p>Find the latest index of any of a set of potential substrings.</p>
     *
     * <p>A {@code null} CharSequence will return {@code -1}.
     * A {@code null} search array will return {@code -1}.
     * A {@code null} or zero length search array entry will be ignored,
     * but a search array containing "" will return the length of {@code str}
     * if {@code str} is not null. This method uses {@link String#indexOf(String)} if possible</p>
     *
     * <pre>
     * StringUtils.lastIndexOfAny(null, *)                   = -1
     * StringUtils.lastIndexOfAny(*, null)                   = -1
     * StringUtils.lastIndexOfAny(*, [])                     = -1
     * StringUtils.lastIndexOfAny(*, [null])                 = -1
     * StringUtils.lastIndexOfAny("zzabyycdxx", ["ab","cd"]) = 6
     * StringUtils.lastIndexOfAny("zzabyycdxx", ["cd","ab"]) = 6
     * StringUtils.lastIndexOfAny("zzabyycdxx", ["mn","op"]) = -1
     * StringUtils.lastIndexOfAny("zzabyycdxx", ["mn","op"]) = -1
     * StringUtils.lastIndexOfAny("zzabyycdxx", ["mn",""])   = 10
     * </pre>
     *
     * @param str  the CharSequence to check, may be null
     * @param searchStrs  the CharSequences to search for, may be null
     * @return the last index of any of the CharSequences, -1 if no match
     * @since 3.0 Changed signature from lastIndexOfAny(String, String[]) to lastIndexOfAny(CharSequence, CharSequence)
     */
    public static int lastIndexOfAny(final CharSequence str, final CharSequence... searchStrs) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(7958);
        __CLR4_5_25lh5lhlvha79yz.R.inc(7959);if ((((str == null || searchStrs == null)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(7960)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(7961)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(7962);return INDEX_NOT_FOUND;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(7963);int ret = INDEX_NOT_FOUND;
        __CLR4_5_25lh5lhlvha79yz.R.inc(7964);int tmp = 0;
        __CLR4_5_25lh5lhlvha79yz.R.inc(7965);for (final CharSequence search : searchStrs) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(7966);if ((((search == null)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(7967)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(7968)==0&false))) {{
                __CLR4_5_25lh5lhlvha79yz.R.inc(7969);continue;
            }
            }__CLR4_5_25lh5lhlvha79yz.R.inc(7970);tmp = CharSequenceUtils.lastIndexOf(str, search, str.length());
            __CLR4_5_25lh5lhlvha79yz.R.inc(7971);if ((((tmp > ret)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(7972)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(7973)==0&false))) {{
                __CLR4_5_25lh5lhlvha79yz.R.inc(7974);ret = tmp;
            }
        }}
        }__CLR4_5_25lh5lhlvha79yz.R.inc(7975);return ret;
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    // Substring
    //-----------------------------------------------------------------------
    /**
     * <p>Gets a substring from the specified String avoiding exceptions.</p>
     *
     * <p>A negative start position can be used to start {@code n}
     * characters from the end of the String.</p>
     *
     * <p>A {@code null} String will return {@code null}.
     * An empty ("") String will return "".</p>
     *
     * <pre>
     * StringUtils.substring(null, *)   = null
     * StringUtils.substring("", *)     = ""
     * StringUtils.substring("abc", 0)  = "abc"
     * StringUtils.substring("abc", 2)  = "c"
     * StringUtils.substring("abc", 4)  = ""
     * StringUtils.substring("abc", -2) = "bc"
     * StringUtils.substring("abc", -4) = "abc"
     * </pre>
     *
     * @param str  the String to get the substring from, may be null
     * @param start  the position to start from, negative means
     *  count back from the end of the String by this many characters
     * @return substring from start position, {@code null} if null String input
     */
    public static String substring(final String str, int start) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(7976);
        __CLR4_5_25lh5lhlvha79yz.R.inc(7977);if ((((str == null)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(7978)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(7979)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(7980);return null;
        }

        // handle negatives, which means last n characters
        }__CLR4_5_25lh5lhlvha79yz.R.inc(7981);if ((((start < 0)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(7982)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(7983)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(7984);start = str.length() + start; // remember start is negative
        }

        }__CLR4_5_25lh5lhlvha79yz.R.inc(7985);if ((((start < 0)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(7986)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(7987)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(7988);start = 0;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(7989);if ((((start > str.length())&&(__CLR4_5_25lh5lhlvha79yz.R.iget(7990)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(7991)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(7992);return EMPTY;
        }

        }__CLR4_5_25lh5lhlvha79yz.R.inc(7993);return str.substring(start);
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    /**
     * <p>Gets a substring from the specified String avoiding exceptions.</p>
     *
     * <p>A negative start position can be used to start/end {@code n}
     * characters from the end of the String.</p>
     *
     * <p>The returned substring starts with the character in the {@code start}
     * position and ends before the {@code end} position. All position counting is
     * zero-based -- i.e., to start at the beginning of the string use
     * {@code start = 0}. Negative start and end positions can be used to
     * specify offsets relative to the end of the String.</p>
     *
     * <p>If {@code start} is not strictly to the left of {@code end}, ""
     * is returned.</p>
     *
     * <pre>
     * StringUtils.substring(null, *, *)    = null
     * StringUtils.substring("", * ,  *)    = "";
     * StringUtils.substring("abc", 0, 2)   = "ab"
     * StringUtils.substring("abc", 2, 0)   = ""
     * StringUtils.substring("abc", 2, 4)   = "c"
     * StringUtils.substring("abc", 4, 6)   = ""
     * StringUtils.substring("abc", 2, 2)   = ""
     * StringUtils.substring("abc", -2, -1) = "b"
     * StringUtils.substring("abc", -4, 2)  = "ab"
     * </pre>
     *
     * @param str  the String to get the substring from, may be null
     * @param start  the position to start from, negative means
     *  count back from the end of the String by this many characters
     * @param end  the position to end at (exclusive), negative means
     *  count back from the end of the String by this many characters
     * @return substring from start position to end position,
     *  {@code null} if null String input
     */
    public static String substring(final String str, int start, int end) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(7994);
        __CLR4_5_25lh5lhlvha79yz.R.inc(7995);if ((((str == null)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(7996)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(7997)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(7998);return null;
        }

        // handle negatives
        }__CLR4_5_25lh5lhlvha79yz.R.inc(7999);if ((((end < 0)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(8000)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(8001)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(8002);end = str.length() + end; // remember end is negative
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(8003);if ((((start < 0)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(8004)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(8005)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(8006);start = str.length() + start; // remember start is negative
        }

        // check length next
        }__CLR4_5_25lh5lhlvha79yz.R.inc(8007);if ((((end > str.length())&&(__CLR4_5_25lh5lhlvha79yz.R.iget(8008)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(8009)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(8010);end = str.length();
        }

        // if start is greater than end, return ""
        }__CLR4_5_25lh5lhlvha79yz.R.inc(8011);if ((((start > end)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(8012)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(8013)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(8014);return EMPTY;
        }

        }__CLR4_5_25lh5lhlvha79yz.R.inc(8015);if ((((start < 0)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(8016)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(8017)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(8018);start = 0;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(8019);if ((((end < 0)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(8020)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(8021)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(8022);end = 0;
        }

        }__CLR4_5_25lh5lhlvha79yz.R.inc(8023);return str.substring(start, end);
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    // Left/Right/Mid
    //-----------------------------------------------------------------------
    /**
     * <p>Gets the leftmost {@code len} characters of a String.</p>
     *
     * <p>If {@code len} characters are not available, or the
     * String is {@code null}, the String will be returned without
     * an exception. An empty String is returned if len is negative.</p>
     *
     * <pre>
     * StringUtils.left(null, *)    = null
     * StringUtils.left(*, -ve)     = ""
     * StringUtils.left("", *)      = ""
     * StringUtils.left("abc", 0)   = ""
     * StringUtils.left("abc", 2)   = "ab"
     * StringUtils.left("abc", 4)   = "abc"
     * </pre>
     *
     * @param str  the String to get the leftmost characters from, may be null
     * @param len  the length of the required String
     * @return the leftmost characters, {@code null} if null String input
     */
    public static String left(final String str, final int len) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(8024);
        __CLR4_5_25lh5lhlvha79yz.R.inc(8025);if ((((str == null)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(8026)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(8027)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(8028);return null;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(8029);if ((((len < 0)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(8030)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(8031)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(8032);return EMPTY;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(8033);if ((((str.length() <= len)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(8034)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(8035)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(8036);return str;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(8037);return str.substring(0, len);
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    /**
     * <p>Gets the rightmost {@code len} characters of a String.</p>
     *
     * <p>If {@code len} characters are not available, or the String
     * is {@code null}, the String will be returned without an
     * an exception. An empty String is returned if len is negative.</p>
     *
     * <pre>
     * StringUtils.right(null, *)    = null
     * StringUtils.right(*, -ve)     = ""
     * StringUtils.right("", *)      = ""
     * StringUtils.right("abc", 0)   = ""
     * StringUtils.right("abc", 2)   = "bc"
     * StringUtils.right("abc", 4)   = "abc"
     * </pre>
     *
     * @param str  the String to get the rightmost characters from, may be null
     * @param len  the length of the required String
     * @return the rightmost characters, {@code null} if null String input
     */
    public static String right(final String str, final int len) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(8038);
        __CLR4_5_25lh5lhlvha79yz.R.inc(8039);if ((((str == null)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(8040)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(8041)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(8042);return null;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(8043);if ((((len < 0)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(8044)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(8045)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(8046);return EMPTY;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(8047);if ((((str.length() <= len)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(8048)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(8049)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(8050);return str;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(8051);return str.substring(str.length() - len);
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    /**
     * <p>Gets {@code len} characters from the middle of a String.</p>
     *
     * <p>If {@code len} characters are not available, the remainder
     * of the String will be returned without an exception. If the
     * String is {@code null}, {@code null} will be returned.
     * An empty String is returned if len is negative or exceeds the
     * length of {@code str}.</p>
     *
     * <pre>
     * StringUtils.mid(null, *, *)    = null
     * StringUtils.mid(*, *, -ve)     = ""
     * StringUtils.mid("", 0, *)      = ""
     * StringUtils.mid("abc", 0, 2)   = "ab"
     * StringUtils.mid("abc", 0, 4)   = "abc"
     * StringUtils.mid("abc", 2, 4)   = "c"
     * StringUtils.mid("abc", 4, 2)   = ""
     * StringUtils.mid("abc", -2, 2)  = "ab"
     * </pre>
     *
     * @param str  the String to get the characters from, may be null
     * @param pos  the position to start from, negative treated as zero
     * @param len  the length of the required String
     * @return the middle characters, {@code null} if null String input
     */
    public static String mid(final String str, int pos, final int len) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(8052);
        __CLR4_5_25lh5lhlvha79yz.R.inc(8053);if ((((str == null)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(8054)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(8055)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(8056);return null;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(8057);if ((((len < 0 || pos > str.length())&&(__CLR4_5_25lh5lhlvha79yz.R.iget(8058)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(8059)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(8060);return EMPTY;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(8061);if ((((pos < 0)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(8062)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(8063)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(8064);pos = 0;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(8065);if ((((str.length() <= pos + len)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(8066)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(8067)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(8068);return str.substring(pos);
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(8069);return str.substring(pos, pos + len);
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    // SubStringAfter/SubStringBefore
    //-----------------------------------------------------------------------
    /**
     * <p>Gets the substring before the first occurrence of a separator.
     * The separator is not returned.</p>
     *
     * <p>A {@code null} string input will return {@code null}.
     * An empty ("") string input will return the empty string.
     * A {@code null} separator will return the input string.</p>
     *
     * <p>If nothing is found, the string input is returned.</p>
     *
     * <pre>
     * StringUtils.substringBefore(null, *)      = null
     * StringUtils.substringBefore("", *)        = ""
     * StringUtils.substringBefore("abc", "a")   = ""
     * StringUtils.substringBefore("abcba", "b") = "a"
     * StringUtils.substringBefore("abc", "c")   = "ab"
     * StringUtils.substringBefore("abc", "d")   = "abc"
     * StringUtils.substringBefore("abc", "")    = ""
     * StringUtils.substringBefore("abc", null)  = "abc"
     * </pre>
     *
     * @param str  the String to get a substring from, may be null
     * @param separator  the String to search for, may be null
     * @return the substring before the first occurrence of the separator,
     *  {@code null} if null String input
     * @since 2.0
     */
    public static String substringBefore(final String str, final String separator) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(8070);
        __CLR4_5_25lh5lhlvha79yz.R.inc(8071);if ((((isEmpty(str) || separator == null)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(8072)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(8073)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(8074);return str;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(8075);if ((((separator.isEmpty())&&(__CLR4_5_25lh5lhlvha79yz.R.iget(8076)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(8077)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(8078);return EMPTY;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(8079);final int pos = str.indexOf(separator);
        __CLR4_5_25lh5lhlvha79yz.R.inc(8080);if ((((pos == INDEX_NOT_FOUND)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(8081)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(8082)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(8083);return str;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(8084);return str.substring(0, pos);
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    /**
     * <p>Gets the substring after the first occurrence of a separator.
     * The separator is not returned.</p>
     *
     * <p>A {@code null} string input will return {@code null}.
     * An empty ("") string input will return the empty string.
     * A {@code null} separator will return the empty string if the
     * input string is not {@code null}.</p>
     *
     * <p>If nothing is found, the empty string is returned.</p>
     *
     * <pre>
     * StringUtils.substringAfter(null, *)      = null
     * StringUtils.substringAfter("", *)        = ""
     * StringUtils.substringAfter(*, null)      = ""
     * StringUtils.substringAfter("abc", "a")   = "bc"
     * StringUtils.substringAfter("abcba", "b") = "cba"
     * StringUtils.substringAfter("abc", "c")   = ""
     * StringUtils.substringAfter("abc", "d")   = ""
     * StringUtils.substringAfter("abc", "")    = "abc"
     * </pre>
     *
     * @param str  the String to get a substring from, may be null
     * @param separator  the String to search for, may be null
     * @return the substring after the first occurrence of the separator,
     *  {@code null} if null String input
     * @since 2.0
     */
    public static String substringAfter(final String str, final String separator) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(8085);
        __CLR4_5_25lh5lhlvha79yz.R.inc(8086);if ((((isEmpty(str))&&(__CLR4_5_25lh5lhlvha79yz.R.iget(8087)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(8088)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(8089);return str;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(8090);if ((((separator == null)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(8091)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(8092)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(8093);return EMPTY;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(8094);final int pos = str.indexOf(separator);
        __CLR4_5_25lh5lhlvha79yz.R.inc(8095);if ((((pos == INDEX_NOT_FOUND)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(8096)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(8097)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(8098);return EMPTY;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(8099);return str.substring(pos + separator.length());
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    /**
     * <p>Gets the substring before the last occurrence of a separator.
     * The separator is not returned.</p>
     *
     * <p>A {@code null} string input will return {@code null}.
     * An empty ("") string input will return the empty string.
     * An empty or {@code null} separator will return the input string.</p>
     *
     * <p>If nothing is found, the string input is returned.</p>
     *
     * <pre>
     * StringUtils.substringBeforeLast(null, *)      = null
     * StringUtils.substringBeforeLast("", *)        = ""
     * StringUtils.substringBeforeLast("abcba", "b") = "abc"
     * StringUtils.substringBeforeLast("abc", "c")   = "ab"
     * StringUtils.substringBeforeLast("a", "a")     = ""
     * StringUtils.substringBeforeLast("a", "z")     = "a"
     * StringUtils.substringBeforeLast("a", null)    = "a"
     * StringUtils.substringBeforeLast("a", "")      = "a"
     * </pre>
     *
     * @param str  the String to get a substring from, may be null
     * @param separator  the String to search for, may be null
     * @return the substring before the last occurrence of the separator,
     *  {@code null} if null String input
     * @since 2.0
     */
    public static String substringBeforeLast(final String str, final String separator) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(8100);
        __CLR4_5_25lh5lhlvha79yz.R.inc(8101);if ((((isEmpty(str) || isEmpty(separator))&&(__CLR4_5_25lh5lhlvha79yz.R.iget(8102)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(8103)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(8104);return str;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(8105);final int pos = str.lastIndexOf(separator);
        __CLR4_5_25lh5lhlvha79yz.R.inc(8106);if ((((pos == INDEX_NOT_FOUND)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(8107)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(8108)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(8109);return str;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(8110);return str.substring(0, pos);
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    /**
     * <p>Gets the substring after the last occurrence of a separator.
     * The separator is not returned.</p>
     *
     * <p>A {@code null} string input will return {@code null}.
     * An empty ("") string input will return the empty string.
     * An empty or {@code null} separator will return the empty string if
     * the input string is not {@code null}.</p>
     *
     * <p>If nothing is found, the empty string is returned.</p>
     *
     * <pre>
     * StringUtils.substringAfterLast(null, *)      = null
     * StringUtils.substringAfterLast("", *)        = ""
     * StringUtils.substringAfterLast(*, "")        = ""
     * StringUtils.substringAfterLast(*, null)      = ""
     * StringUtils.substringAfterLast("abc", "a")   = "bc"
     * StringUtils.substringAfterLast("abcba", "b") = "a"
     * StringUtils.substringAfterLast("abc", "c")   = ""
     * StringUtils.substringAfterLast("a", "a")     = ""
     * StringUtils.substringAfterLast("a", "z")     = ""
     * </pre>
     *
     * @param str  the String to get a substring from, may be null
     * @param separator  the String to search for, may be null
     * @return the substring after the last occurrence of the separator,
     *  {@code null} if null String input
     * @since 2.0
     */
    public static String substringAfterLast(final String str, final String separator) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(8111);
        __CLR4_5_25lh5lhlvha79yz.R.inc(8112);if ((((isEmpty(str))&&(__CLR4_5_25lh5lhlvha79yz.R.iget(8113)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(8114)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(8115);return str;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(8116);if ((((isEmpty(separator))&&(__CLR4_5_25lh5lhlvha79yz.R.iget(8117)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(8118)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(8119);return EMPTY;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(8120);final int pos = str.lastIndexOf(separator);
        __CLR4_5_25lh5lhlvha79yz.R.inc(8121);if ((((pos == INDEX_NOT_FOUND || pos == str.length() - separator.length())&&(__CLR4_5_25lh5lhlvha79yz.R.iget(8122)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(8123)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(8124);return EMPTY;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(8125);return str.substring(pos + separator.length());
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    // Substring between
    //-----------------------------------------------------------------------
    /**
     * <p>Gets the String that is nested in between two instances of the
     * same String.</p>
     *
     * <p>A {@code null} input String returns {@code null}.
     * A {@code null} tag returns {@code null}.</p>
     *
     * <pre>
     * StringUtils.substringBetween(null, *)            = null
     * StringUtils.substringBetween("", "")             = ""
     * StringUtils.substringBetween("", "tag")          = null
     * StringUtils.substringBetween("tagabctag", null)  = null
     * StringUtils.substringBetween("tagabctag", "")    = ""
     * StringUtils.substringBetween("tagabctag", "tag") = "abc"
     * </pre>
     *
     * @param str  the String containing the substring, may be null
     * @param tag  the String before and after the substring, may be null
     * @return the substring, {@code null} if no match
     * @since 2.0
     */
    public static String substringBetween(final String str, final String tag) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(8126);
        __CLR4_5_25lh5lhlvha79yz.R.inc(8127);return substringBetween(str, tag, tag);
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    /**
     * <p>Gets the String that is nested in between two Strings.
     * Only the first match is returned.</p>
     *
     * <p>A {@code null} input String returns {@code null}.
     * A {@code null} open/close returns {@code null} (no match).
     * An empty ("") open and close returns an empty string.</p>
     *
     * <pre>
     * StringUtils.substringBetween("wx[b]yz", "[", "]") = "b"
     * StringUtils.substringBetween(null, *, *)          = null
     * StringUtils.substringBetween(*, null, *)          = null
     * StringUtils.substringBetween(*, *, null)          = null
     * StringUtils.substringBetween("", "", "")          = ""
     * StringUtils.substringBetween("", "", "]")         = null
     * StringUtils.substringBetween("", "[", "]")        = null
     * StringUtils.substringBetween("yabcz", "", "")     = ""
     * StringUtils.substringBetween("yabcz", "y", "z")   = "abc"
     * StringUtils.substringBetween("yabczyabcz", "y", "z")   = "abc"
     * </pre>
     *
     * @param str  the String containing the substring, may be null
     * @param open  the String before the substring, may be null
     * @param close  the String after the substring, may be null
     * @return the substring, {@code null} if no match
     * @since 2.0
     */
    public static String substringBetween(final String str, final String open, final String close) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(8128);
        __CLR4_5_25lh5lhlvha79yz.R.inc(8129);if ((((str == null || open == null || close == null)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(8130)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(8131)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(8132);return null;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(8133);final int start = str.indexOf(open);
        __CLR4_5_25lh5lhlvha79yz.R.inc(8134);if ((((start != INDEX_NOT_FOUND)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(8135)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(8136)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(8137);final int end = str.indexOf(close, start + open.length());
            __CLR4_5_25lh5lhlvha79yz.R.inc(8138);if ((((end != INDEX_NOT_FOUND)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(8139)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(8140)==0&false))) {{
                __CLR4_5_25lh5lhlvha79yz.R.inc(8141);return str.substring(start + open.length(), end);
            }
        }}
        }__CLR4_5_25lh5lhlvha79yz.R.inc(8142);return null;
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    /**
     * <p>Searches a String for substrings delimited by a start and end tag,
     * returning all matching substrings in an array.</p>
     *
     * <p>A {@code null} input String returns {@code null}.
     * A {@code null} open/close returns {@code null} (no match).
     * An empty ("") open/close returns {@code null} (no match).</p>
     *
     * <pre>
     * StringUtils.substringsBetween("[a][b][c]", "[", "]") = ["a","b","c"]
     * StringUtils.substringsBetween(null, *, *)            = null
     * StringUtils.substringsBetween(*, null, *)            = null
     * StringUtils.substringsBetween(*, *, null)            = null
     * StringUtils.substringsBetween("", "[", "]")          = []
     * </pre>
     *
     * @param str  the String containing the substrings, null returns null, empty returns empty
     * @param open  the String identifying the start of the substring, empty returns null
     * @param close  the String identifying the end of the substring, empty returns null
     * @return a String Array of substrings, or {@code null} if no match
     * @since 2.3
     */
    public static String[] substringsBetween(final String str, final String open, final String close) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(8143);
        __CLR4_5_25lh5lhlvha79yz.R.inc(8144);if ((((str == null || isEmpty(open) || isEmpty(close))&&(__CLR4_5_25lh5lhlvha79yz.R.iget(8145)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(8146)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(8147);return null;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(8148);final int strLen = str.length();
        __CLR4_5_25lh5lhlvha79yz.R.inc(8149);if ((((strLen == 0)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(8150)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(8151)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(8152);return ArrayUtils.EMPTY_STRING_ARRAY;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(8153);final int closeLen = close.length();
        __CLR4_5_25lh5lhlvha79yz.R.inc(8154);final int openLen = open.length();
        __CLR4_5_25lh5lhlvha79yz.R.inc(8155);final List<String> list = new ArrayList<>();
        __CLR4_5_25lh5lhlvha79yz.R.inc(8156);int pos = 0;
        __CLR4_5_25lh5lhlvha79yz.R.inc(8157);while ((((pos < strLen - closeLen)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(8158)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(8159)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(8160);int start = str.indexOf(open, pos);
            __CLR4_5_25lh5lhlvha79yz.R.inc(8161);if ((((start < 0)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(8162)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(8163)==0&false))) {{
                __CLR4_5_25lh5lhlvha79yz.R.inc(8164);break;
            }
            }__CLR4_5_25lh5lhlvha79yz.R.inc(8165);start += openLen;
            __CLR4_5_25lh5lhlvha79yz.R.inc(8166);final int end = str.indexOf(close, start);
            __CLR4_5_25lh5lhlvha79yz.R.inc(8167);if ((((end < 0)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(8168)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(8169)==0&false))) {{
                __CLR4_5_25lh5lhlvha79yz.R.inc(8170);break;
            }
            }__CLR4_5_25lh5lhlvha79yz.R.inc(8171);list.add(str.substring(start, end));
            __CLR4_5_25lh5lhlvha79yz.R.inc(8172);pos = end + closeLen;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(8173);if ((((list.isEmpty())&&(__CLR4_5_25lh5lhlvha79yz.R.iget(8174)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(8175)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(8176);return null;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(8177);return list.toArray(new String [list.size()]);
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    // Nested extraction
    //-----------------------------------------------------------------------

    // Splitting
    //-----------------------------------------------------------------------
    /**
     * <p>Splits the provided text into an array, using whitespace as the
     * separator.
     * Whitespace is defined by {@link Character#isWhitespace(char)}.</p>
     *
     * <p>The separator is not included in the returned String array.
     * Adjacent separators are treated as one separator.
     * For more control over the split use the StrTokenizer class.</p>
     *
     * <p>A {@code null} input String returns {@code null}.</p>
     *
     * <pre>
     * StringUtils.split(null)       = null
     * StringUtils.split("")         = []
     * StringUtils.split("abc def")  = ["abc", "def"]
     * StringUtils.split("abc  def") = ["abc", "def"]
     * StringUtils.split(" abc ")    = ["abc"]
     * </pre>
     *
     * @param str  the String to parse, may be null
     * @return an array of parsed Strings, {@code null} if null String input
     */
    public static String[] split(final String str) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(8178);
        __CLR4_5_25lh5lhlvha79yz.R.inc(8179);return split(str, null, -1);
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    /**
     * <p>Splits the provided text into an array, separator specified.
     * This is an alternative to using StringTokenizer.</p>
     *
     * <p>The separator is not included in the returned String array.
     * Adjacent separators are treated as one separator.
     * For more control over the split use the StrTokenizer class.</p>
     *
     * <p>A {@code null} input String returns {@code null}.</p>
     *
     * <pre>
     * StringUtils.split(null, *)         = null
     * StringUtils.split("", *)           = []
     * StringUtils.split("a.b.c", '.')    = ["a", "b", "c"]
     * StringUtils.split("a..b.c", '.')   = ["a", "b", "c"]
     * StringUtils.split("a:b:c", '.')    = ["a:b:c"]
     * StringUtils.split("a b c", ' ')    = ["a", "b", "c"]
     * </pre>
     *
     * @param str  the String to parse, may be null
     * @param separatorChar  the character used as the delimiter
     * @return an array of parsed Strings, {@code null} if null String input
     * @since 2.0
     */
    public static String[] split(final String str, final char separatorChar) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(8180);
        __CLR4_5_25lh5lhlvha79yz.R.inc(8181);return splitWorker(str, separatorChar, false);
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    /**
     * <p>Splits the provided text into an array, separators specified.
     * This is an alternative to using StringTokenizer.</p>
     *
     * <p>The separator is not included in the returned String array.
     * Adjacent separators are treated as one separator.
     * For more control over the split use the StrTokenizer class.</p>
     *
     * <p>A {@code null} input String returns {@code null}.
     * A {@code null} separatorChars splits on whitespace.</p>
     *
     * <pre>
     * StringUtils.split(null, *)         = null
     * StringUtils.split("", *)           = []
     * StringUtils.split("abc def", null) = ["abc", "def"]
     * StringUtils.split("abc def", " ")  = ["abc", "def"]
     * StringUtils.split("abc  def", " ") = ["abc", "def"]
     * StringUtils.split("ab:cd:ef", ":") = ["ab", "cd", "ef"]
     * </pre>
     *
     * @param str  the String to parse, may be null
     * @param separatorChars  the characters used as the delimiters,
     *  {@code null} splits on whitespace
     * @return an array of parsed Strings, {@code null} if null String input
     */
    public static String[] split(final String str, final String separatorChars) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(8182);
        __CLR4_5_25lh5lhlvha79yz.R.inc(8183);return splitWorker(str, separatorChars, -1, false);
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    /**
     * <p>Splits the provided text into an array with a maximum length,
     * separators specified.</p>
     *
     * <p>The separator is not included in the returned String array.
     * Adjacent separators are treated as one separator.</p>
     *
     * <p>A {@code null} input String returns {@code null}.
     * A {@code null} separatorChars splits on whitespace.</p>
     *
     * <p>If more than {@code max} delimited substrings are found, the last
     * returned string includes all characters after the first {@code max - 1}
     * returned strings (including separator characters).</p>
     *
     * <pre>
     * StringUtils.split(null, *, *)            = null
     * StringUtils.split("", *, *)              = []
     * StringUtils.split("ab cd ef", null, 0)   = ["ab", "cd", "ef"]
     * StringUtils.split("ab   cd ef", null, 0) = ["ab", "cd", "ef"]
     * StringUtils.split("ab:cd:ef", ":", 0)    = ["ab", "cd", "ef"]
     * StringUtils.split("ab:cd:ef", ":", 2)    = ["ab", "cd:ef"]
     * </pre>
     *
     * @param str  the String to parse, may be null
     * @param separatorChars  the characters used as the delimiters,
     *  {@code null} splits on whitespace
     * @param max  the maximum number of elements to include in the
     *  array. A zero or negative value implies no limit
     * @return an array of parsed Strings, {@code null} if null String input
     */
    public static String[] split(final String str, final String separatorChars, final int max) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(8184);
        __CLR4_5_25lh5lhlvha79yz.R.inc(8185);return splitWorker(str, separatorChars, max, false);
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    /**
     * <p>Splits the provided text into an array, separator string specified.</p>
     *
     * <p>The separator(s) will not be included in the returned String array.
     * Adjacent separators are treated as one separator.</p>
     *
     * <p>A {@code null} input String returns {@code null}.
     * A {@code null} separator splits on whitespace.</p>
     *
     * <pre>
     * StringUtils.splitByWholeSeparator(null, *)               = null
     * StringUtils.splitByWholeSeparator("", *)                 = []
     * StringUtils.splitByWholeSeparator("ab de fg", null)      = ["ab", "de", "fg"]
     * StringUtils.splitByWholeSeparator("ab   de fg", null)    = ["ab", "de", "fg"]
     * StringUtils.splitByWholeSeparator("ab:cd:ef", ":")       = ["ab", "cd", "ef"]
     * StringUtils.splitByWholeSeparator("ab-!-cd-!-ef", "-!-") = ["ab", "cd", "ef"]
     * </pre>
     *
     * @param str  the String to parse, may be null
     * @param separator  String containing the String to be used as a delimiter,
     *  {@code null} splits on whitespace
     * @return an array of parsed Strings, {@code null} if null String was input
     */
    public static String[] splitByWholeSeparator(final String str, final String separator) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(8186);
        __CLR4_5_25lh5lhlvha79yz.R.inc(8187);return splitByWholeSeparatorWorker( str, separator, -1, false ) ;
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    /**
     * <p>Splits the provided text into an array, separator string specified.
     * Returns a maximum of {@code max} substrings.</p>
     *
     * <p>The separator(s) will not be included in the returned String array.
     * Adjacent separators are treated as one separator.</p>
     *
     * <p>A {@code null} input String returns {@code null}.
     * A {@code null} separator splits on whitespace.</p>
     *
     * <pre>
     * StringUtils.splitByWholeSeparator(null, *, *)               = null
     * StringUtils.splitByWholeSeparator("", *, *)                 = []
     * StringUtils.splitByWholeSeparator("ab de fg", null, 0)      = ["ab", "de", "fg"]
     * StringUtils.splitByWholeSeparator("ab   de fg", null, 0)    = ["ab", "de", "fg"]
     * StringUtils.splitByWholeSeparator("ab:cd:ef", ":", 2)       = ["ab", "cd:ef"]
     * StringUtils.splitByWholeSeparator("ab-!-cd-!-ef", "-!-", 5) = ["ab", "cd", "ef"]
     * StringUtils.splitByWholeSeparator("ab-!-cd-!-ef", "-!-", 2) = ["ab", "cd-!-ef"]
     * </pre>
     *
     * @param str  the String to parse, may be null
     * @param separator  String containing the String to be used as a delimiter,
     *  {@code null} splits on whitespace
     * @param max  the maximum number of elements to include in the returned
     *  array. A zero or negative value implies no limit.
     * @return an array of parsed Strings, {@code null} if null String was input
     */
    public static String[] splitByWholeSeparator( final String str, final String separator, final int max) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(8188);
        __CLR4_5_25lh5lhlvha79yz.R.inc(8189);return splitByWholeSeparatorWorker(str, separator, max, false);
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    /**
     * <p>Splits the provided text into an array, separator string specified. </p>
     *
     * <p>The separator is not included in the returned String array.
     * Adjacent separators are treated as separators for empty tokens.
     * For more control over the split use the StrTokenizer class.</p>
     *
     * <p>A {@code null} input String returns {@code null}.
     * A {@code null} separator splits on whitespace.</p>
     *
     * <pre>
     * StringUtils.splitByWholeSeparatorPreserveAllTokens(null, *)               = null
     * StringUtils.splitByWholeSeparatorPreserveAllTokens("", *)                 = []
     * StringUtils.splitByWholeSeparatorPreserveAllTokens("ab de fg", null)      = ["ab", "de", "fg"]
     * StringUtils.splitByWholeSeparatorPreserveAllTokens("ab   de fg", null)    = ["ab", "", "", "de", "fg"]
     * StringUtils.splitByWholeSeparatorPreserveAllTokens("ab:cd:ef", ":")       = ["ab", "cd", "ef"]
     * StringUtils.splitByWholeSeparatorPreserveAllTokens("ab-!-cd-!-ef", "-!-") = ["ab", "cd", "ef"]
     * </pre>
     *
     * @param str  the String to parse, may be null
     * @param separator  String containing the String to be used as a delimiter,
     *  {@code null} splits on whitespace
     * @return an array of parsed Strings, {@code null} if null String was input
     * @since 2.4
     */
    public static String[] splitByWholeSeparatorPreserveAllTokens(final String str, final String separator) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(8190);
        __CLR4_5_25lh5lhlvha79yz.R.inc(8191);return splitByWholeSeparatorWorker(str, separator, -1, true);
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    /**
     * <p>Splits the provided text into an array, separator string specified.
     * Returns a maximum of {@code max} substrings.</p>
     *
     * <p>The separator is not included in the returned String array.
     * Adjacent separators are treated as separators for empty tokens.
     * For more control over the split use the StrTokenizer class.</p>
     *
     * <p>A {@code null} input String returns {@code null}.
     * A {@code null} separator splits on whitespace.</p>
     *
     * <pre>
     * StringUtils.splitByWholeSeparatorPreserveAllTokens(null, *, *)               = null
     * StringUtils.splitByWholeSeparatorPreserveAllTokens("", *, *)                 = []
     * StringUtils.splitByWholeSeparatorPreserveAllTokens("ab de fg", null, 0)      = ["ab", "de", "fg"]
     * StringUtils.splitByWholeSeparatorPreserveAllTokens("ab   de fg", null, 0)    = ["ab", "", "", "de", "fg"]
     * StringUtils.splitByWholeSeparatorPreserveAllTokens("ab:cd:ef", ":", 2)       = ["ab", "cd:ef"]
     * StringUtils.splitByWholeSeparatorPreserveAllTokens("ab-!-cd-!-ef", "-!-", 5) = ["ab", "cd", "ef"]
     * StringUtils.splitByWholeSeparatorPreserveAllTokens("ab-!-cd-!-ef", "-!-", 2) = ["ab", "cd-!-ef"]
     * </pre>
     *
     * @param str  the String to parse, may be null
     * @param separator  String containing the String to be used as a delimiter,
     *  {@code null} splits on whitespace
     * @param max  the maximum number of elements to include in the returned
     *  array. A zero or negative value implies no limit.
     * @return an array of parsed Strings, {@code null} if null String was input
     * @since 2.4
     */
    public static String[] splitByWholeSeparatorPreserveAllTokens(final String str, final String separator, final int max) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(8192);
        __CLR4_5_25lh5lhlvha79yz.R.inc(8193);return splitByWholeSeparatorWorker(str, separator, max, true);
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    /**
     * Performs the logic for the {@code splitByWholeSeparatorPreserveAllTokens} methods.
     *
     * @param str  the String to parse, may be {@code null}
     * @param separator  String containing the String to be used as a delimiter,
     *  {@code null} splits on whitespace
     * @param max  the maximum number of elements to include in the returned
     *  array. A zero or negative value implies no limit.
     * @param preserveAllTokens if {@code true}, adjacent separators are
     * treated as empty token separators; if {@code false}, adjacent
     * separators are treated as one separator.
     * @return an array of parsed Strings, {@code null} if null String input
     * @since 2.4
     */
    private static String[] splitByWholeSeparatorWorker(
            final String str, final String separator, final int max, final boolean preserveAllTokens) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(8194);
        __CLR4_5_25lh5lhlvha79yz.R.inc(8195);if ((((str == null)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(8196)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(8197)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(8198);return null;
        }

        }__CLR4_5_25lh5lhlvha79yz.R.inc(8199);final int len = str.length();

        __CLR4_5_25lh5lhlvha79yz.R.inc(8200);if ((((len == 0)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(8201)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(8202)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(8203);return ArrayUtils.EMPTY_STRING_ARRAY;
        }

        }__CLR4_5_25lh5lhlvha79yz.R.inc(8204);if ((((separator == null || EMPTY.equals(separator))&&(__CLR4_5_25lh5lhlvha79yz.R.iget(8205)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(8206)==0&false))) {{
            // Split on whitespace.
            __CLR4_5_25lh5lhlvha79yz.R.inc(8207);return splitWorker(str, null, max, preserveAllTokens);
        }

        }__CLR4_5_25lh5lhlvha79yz.R.inc(8208);final int separatorLength = separator.length();

        __CLR4_5_25lh5lhlvha79yz.R.inc(8209);final ArrayList<String> substrings = new ArrayList<>();
        __CLR4_5_25lh5lhlvha79yz.R.inc(8210);int numberOfSubstrings = 0;
        __CLR4_5_25lh5lhlvha79yz.R.inc(8211);int beg = 0;
        __CLR4_5_25lh5lhlvha79yz.R.inc(8212);int end = 0;
        __CLR4_5_25lh5lhlvha79yz.R.inc(8213);while ((((end < len)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(8214)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(8215)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(8216);end = str.indexOf(separator, beg);

            __CLR4_5_25lh5lhlvha79yz.R.inc(8217);if ((((end > -1)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(8218)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(8219)==0&false))) {{
                __CLR4_5_25lh5lhlvha79yz.R.inc(8220);if ((((end > beg)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(8221)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(8222)==0&false))) {{
                    __CLR4_5_25lh5lhlvha79yz.R.inc(8223);numberOfSubstrings += 1;

                    __CLR4_5_25lh5lhlvha79yz.R.inc(8224);if ((((numberOfSubstrings == max)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(8225)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(8226)==0&false))) {{
                        __CLR4_5_25lh5lhlvha79yz.R.inc(8227);end = len;
                        __CLR4_5_25lh5lhlvha79yz.R.inc(8228);substrings.add(str.substring(beg));
                    } }else {{
                        // The following is OK, because String.substring( beg, end ) excludes
                        // the character at the position 'end'.
                        __CLR4_5_25lh5lhlvha79yz.R.inc(8229);substrings.add(str.substring(beg, end));

                        // Set the starting point for the next search.
                        // The following is equivalent to beg = end + (separatorLength - 1) + 1,
                        // which is the right calculation:
                        __CLR4_5_25lh5lhlvha79yz.R.inc(8230);beg = end + separatorLength;
                    }
                }} }else {{
                    // We found a consecutive occurrence of the separator, so skip it.
                    __CLR4_5_25lh5lhlvha79yz.R.inc(8231);if ((((preserveAllTokens)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(8232)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(8233)==0&false))) {{
                        __CLR4_5_25lh5lhlvha79yz.R.inc(8234);numberOfSubstrings += 1;
                        __CLR4_5_25lh5lhlvha79yz.R.inc(8235);if ((((numberOfSubstrings == max)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(8236)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(8237)==0&false))) {{
                            __CLR4_5_25lh5lhlvha79yz.R.inc(8238);end = len;
                            __CLR4_5_25lh5lhlvha79yz.R.inc(8239);substrings.add(str.substring(beg));
                        } }else {{
                            __CLR4_5_25lh5lhlvha79yz.R.inc(8240);substrings.add(EMPTY);
                        }
                    }}
                    }__CLR4_5_25lh5lhlvha79yz.R.inc(8241);beg = end + separatorLength;
                }
            }} }else {{
                // String.substring( beg ) goes from 'beg' to the end of the String.
                __CLR4_5_25lh5lhlvha79yz.R.inc(8242);substrings.add(str.substring(beg));
                __CLR4_5_25lh5lhlvha79yz.R.inc(8243);end = len;
            }
        }}

        }__CLR4_5_25lh5lhlvha79yz.R.inc(8244);return substrings.toArray(new String[substrings.size()]);
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    // -----------------------------------------------------------------------
    /**
     * <p>Splits the provided text into an array, using whitespace as the
     * separator, preserving all tokens, including empty tokens created by
     * adjacent separators. This is an alternative to using StringTokenizer.
     * Whitespace is defined by {@link Character#isWhitespace(char)}.</p>
     *
     * <p>The separator is not included in the returned String array.
     * Adjacent separators are treated as separators for empty tokens.
     * For more control over the split use the StrTokenizer class.</p>
     *
     * <p>A {@code null} input String returns {@code null}.</p>
     *
     * <pre>
     * StringUtils.splitPreserveAllTokens(null)       = null
     * StringUtils.splitPreserveAllTokens("")         = []
     * StringUtils.splitPreserveAllTokens("abc def")  = ["abc", "def"]
     * StringUtils.splitPreserveAllTokens("abc  def") = ["abc", "", "def"]
     * StringUtils.splitPreserveAllTokens(" abc ")    = ["", "abc", ""]
     * </pre>
     *
     * @param str  the String to parse, may be {@code null}
     * @return an array of parsed Strings, {@code null} if null String input
     * @since 2.1
     */
    public static String[] splitPreserveAllTokens(final String str) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(8245);
        __CLR4_5_25lh5lhlvha79yz.R.inc(8246);return splitWorker(str, null, -1, true);
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    /**
     * <p>Splits the provided text into an array, separator specified,
     * preserving all tokens, including empty tokens created by adjacent
     * separators. This is an alternative to using StringTokenizer.</p>
     *
     * <p>The separator is not included in the returned String array.
     * Adjacent separators are treated as separators for empty tokens.
     * For more control over the split use the StrTokenizer class.</p>
     *
     * <p>A {@code null} input String returns {@code null}.</p>
     *
     * <pre>
     * StringUtils.splitPreserveAllTokens(null, *)         = null
     * StringUtils.splitPreserveAllTokens("", *)           = []
     * StringUtils.splitPreserveAllTokens("a.b.c", '.')    = ["a", "b", "c"]
     * StringUtils.splitPreserveAllTokens("a..b.c", '.')   = ["a", "", "b", "c"]
     * StringUtils.splitPreserveAllTokens("a:b:c", '.')    = ["a:b:c"]
     * StringUtils.splitPreserveAllTokens("a\tb\nc", null) = ["a", "b", "c"]
     * StringUtils.splitPreserveAllTokens("a b c", ' ')    = ["a", "b", "c"]
     * StringUtils.splitPreserveAllTokens("a b c ", ' ')   = ["a", "b", "c", ""]
     * StringUtils.splitPreserveAllTokens("a b c  ", ' ')   = ["a", "b", "c", "", ""]
     * StringUtils.splitPreserveAllTokens(" a b c", ' ')   = ["", a", "b", "c"]
     * StringUtils.splitPreserveAllTokens("  a b c", ' ')  = ["", "", a", "b", "c"]
     * StringUtils.splitPreserveAllTokens(" a b c ", ' ')  = ["", a", "b", "c", ""]
     * </pre>
     *
     * @param str  the String to parse, may be {@code null}
     * @param separatorChar  the character used as the delimiter,
     *  {@code null} splits on whitespace
     * @return an array of parsed Strings, {@code null} if null String input
     * @since 2.1
     */
    public static String[] splitPreserveAllTokens(final String str, final char separatorChar) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(8247);
        __CLR4_5_25lh5lhlvha79yz.R.inc(8248);return splitWorker(str, separatorChar, true);
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    /**
     * Performs the logic for the {@code split} and
     * {@code splitPreserveAllTokens} methods that do not return a
     * maximum array length.
     *
     * @param str  the String to parse, may be {@code null}
     * @param separatorChar the separate character
     * @param preserveAllTokens if {@code true}, adjacent separators are
     * treated as empty token separators; if {@code false}, adjacent
     * separators are treated as one separator.
     * @return an array of parsed Strings, {@code null} if null String input
     */
    private static String[] splitWorker(final String str, final char separatorChar, final boolean preserveAllTokens) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(8249);
        // Performance tuned for 2.0 (JDK1.4)

        __CLR4_5_25lh5lhlvha79yz.R.inc(8250);if ((((str == null)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(8251)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(8252)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(8253);return null;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(8254);final int len = str.length();
        __CLR4_5_25lh5lhlvha79yz.R.inc(8255);if ((((len == 0)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(8256)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(8257)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(8258);return ArrayUtils.EMPTY_STRING_ARRAY;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(8259);final List<String> list = new ArrayList<>();
        __CLR4_5_25lh5lhlvha79yz.R.inc(8260);int i = 0, start = 0;
        __CLR4_5_25lh5lhlvha79yz.R.inc(8261);boolean match = false;
        __CLR4_5_25lh5lhlvha79yz.R.inc(8262);boolean lastMatch = false;
        __CLR4_5_25lh5lhlvha79yz.R.inc(8263);while ((((i < len)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(8264)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(8265)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(8266);if ((((str.charAt(i) == separatorChar)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(8267)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(8268)==0&false))) {{
                __CLR4_5_25lh5lhlvha79yz.R.inc(8269);if ((((match || preserveAllTokens)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(8270)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(8271)==0&false))) {{
                    __CLR4_5_25lh5lhlvha79yz.R.inc(8272);list.add(str.substring(start, i));
                    __CLR4_5_25lh5lhlvha79yz.R.inc(8273);match = false;
                    __CLR4_5_25lh5lhlvha79yz.R.inc(8274);lastMatch = true;
                }
                }__CLR4_5_25lh5lhlvha79yz.R.inc(8275);start = ++i;
                __CLR4_5_25lh5lhlvha79yz.R.inc(8276);continue;
            }
            }__CLR4_5_25lh5lhlvha79yz.R.inc(8277);lastMatch = false;
            __CLR4_5_25lh5lhlvha79yz.R.inc(8278);match = true;
            __CLR4_5_25lh5lhlvha79yz.R.inc(8279);i++;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(8280);if ((((match || preserveAllTokens && lastMatch)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(8281)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(8282)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(8283);list.add(str.substring(start, i));
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(8284);return list.toArray(new String[list.size()]);
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    /**
     * <p>Splits the provided text into an array, separators specified,
     * preserving all tokens, including empty tokens created by adjacent
     * separators. This is an alternative to using StringTokenizer.</p>
     *
     * <p>The separator is not included in the returned String array.
     * Adjacent separators are treated as separators for empty tokens.
     * For more control over the split use the StrTokenizer class.</p>
     *
     * <p>A {@code null} input String returns {@code null}.
     * A {@code null} separatorChars splits on whitespace.</p>
     *
     * <pre>
     * StringUtils.splitPreserveAllTokens(null, *)           = null
     * StringUtils.splitPreserveAllTokens("", *)             = []
     * StringUtils.splitPreserveAllTokens("abc def", null)   = ["abc", "def"]
     * StringUtils.splitPreserveAllTokens("abc def", " ")    = ["abc", "def"]
     * StringUtils.splitPreserveAllTokens("abc  def", " ")   = ["abc", "", def"]
     * StringUtils.splitPreserveAllTokens("ab:cd:ef", ":")   = ["ab", "cd", "ef"]
     * StringUtils.splitPreserveAllTokens("ab:cd:ef:", ":")  = ["ab", "cd", "ef", ""]
     * StringUtils.splitPreserveAllTokens("ab:cd:ef::", ":") = ["ab", "cd", "ef", "", ""]
     * StringUtils.splitPreserveAllTokens("ab::cd:ef", ":")  = ["ab", "", cd", "ef"]
     * StringUtils.splitPreserveAllTokens(":cd:ef", ":")     = ["", cd", "ef"]
     * StringUtils.splitPreserveAllTokens("::cd:ef", ":")    = ["", "", cd", "ef"]
     * StringUtils.splitPreserveAllTokens(":cd:ef:", ":")    = ["", cd", "ef", ""]
     * </pre>
     *
     * @param str  the String to parse, may be {@code null}
     * @param separatorChars  the characters used as the delimiters,
     *  {@code null} splits on whitespace
     * @return an array of parsed Strings, {@code null} if null String input
     * @since 2.1
     */
    public static String[] splitPreserveAllTokens(final String str, final String separatorChars) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(8285);
        __CLR4_5_25lh5lhlvha79yz.R.inc(8286);return splitWorker(str, separatorChars, -1, true);
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    /**
     * <p>Splits the provided text into an array with a maximum length,
     * separators specified, preserving all tokens, including empty tokens
     * created by adjacent separators.</p>
     *
     * <p>The separator is not included in the returned String array.
     * Adjacent separators are treated as separators for empty tokens.
     * Adjacent separators are treated as one separator.</p>
     *
     * <p>A {@code null} input String returns {@code null}.
     * A {@code null} separatorChars splits on whitespace.</p>
     *
     * <p>If more than {@code max} delimited substrings are found, the last
     * returned string includes all characters after the first {@code max - 1}
     * returned strings (including separator characters).</p>
     *
     * <pre>
     * StringUtils.splitPreserveAllTokens(null, *, *)            = null
     * StringUtils.splitPreserveAllTokens("", *, *)              = []
     * StringUtils.splitPreserveAllTokens("ab de fg", null, 0)   = ["ab", "cd", "ef"]
     * StringUtils.splitPreserveAllTokens("ab   de fg", null, 0) = ["ab", "cd", "ef"]
     * StringUtils.splitPreserveAllTokens("ab:cd:ef", ":", 0)    = ["ab", "cd", "ef"]
     * StringUtils.splitPreserveAllTokens("ab:cd:ef", ":", 2)    = ["ab", "cd:ef"]
     * StringUtils.splitPreserveAllTokens("ab   de fg", null, 2) = ["ab", "  de fg"]
     * StringUtils.splitPreserveAllTokens("ab   de fg", null, 3) = ["ab", "", " de fg"]
     * StringUtils.splitPreserveAllTokens("ab   de fg", null, 4) = ["ab", "", "", "de fg"]
     * </pre>
     *
     * @param str  the String to parse, may be {@code null}
     * @param separatorChars  the characters used as the delimiters,
     *  {@code null} splits on whitespace
     * @param max  the maximum number of elements to include in the
     *  array. A zero or negative value implies no limit
     * @return an array of parsed Strings, {@code null} if null String input
     * @since 2.1
     */
    public static String[] splitPreserveAllTokens(final String str, final String separatorChars, final int max) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(8287);
        __CLR4_5_25lh5lhlvha79yz.R.inc(8288);return splitWorker(str, separatorChars, max, true);
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    /**
     * Performs the logic for the {@code split} and
     * {@code splitPreserveAllTokens} methods that return a maximum array
     * length.
     *
     * @param str  the String to parse, may be {@code null}
     * @param separatorChars the separate character
     * @param max  the maximum number of elements to include in the
     *  array. A zero or negative value implies no limit.
     * @param preserveAllTokens if {@code true}, adjacent separators are
     * treated as empty token separators; if {@code false}, adjacent
     * separators are treated as one separator.
     * @return an array of parsed Strings, {@code null} if null String input
     */
    private static String[] splitWorker(final String str, final String separatorChars, final int max, final boolean preserveAllTokens) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(8289);
        // Performance tuned for 2.0 (JDK1.4)
        // Direct code is quicker than StringTokenizer.
        // Also, StringTokenizer uses isSpace() not isWhitespace()

        __CLR4_5_25lh5lhlvha79yz.R.inc(8290);if ((((str == null)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(8291)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(8292)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(8293);return null;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(8294);final int len = str.length();
        __CLR4_5_25lh5lhlvha79yz.R.inc(8295);if ((((len == 0)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(8296)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(8297)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(8298);return ArrayUtils.EMPTY_STRING_ARRAY;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(8299);final List<String> list = new ArrayList<>();
        __CLR4_5_25lh5lhlvha79yz.R.inc(8300);int sizePlus1 = 1;
        __CLR4_5_25lh5lhlvha79yz.R.inc(8301);int i = 0, start = 0;
        __CLR4_5_25lh5lhlvha79yz.R.inc(8302);boolean match = false;
        __CLR4_5_25lh5lhlvha79yz.R.inc(8303);boolean lastMatch = false;
        __CLR4_5_25lh5lhlvha79yz.R.inc(8304);if ((((separatorChars == null)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(8305)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(8306)==0&false))) {{
            // Null separator means use whitespace
            __CLR4_5_25lh5lhlvha79yz.R.inc(8307);while ((((i < len)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(8308)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(8309)==0&false))) {{
                __CLR4_5_25lh5lhlvha79yz.R.inc(8310);if ((((Character.isWhitespace(str.charAt(i)))&&(__CLR4_5_25lh5lhlvha79yz.R.iget(8311)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(8312)==0&false))) {{
                    __CLR4_5_25lh5lhlvha79yz.R.inc(8313);if ((((match || preserveAllTokens)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(8314)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(8315)==0&false))) {{
                        __CLR4_5_25lh5lhlvha79yz.R.inc(8316);lastMatch = true;
                        __CLR4_5_25lh5lhlvha79yz.R.inc(8317);if ((((sizePlus1++ == max)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(8318)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(8319)==0&false))) {{
                            __CLR4_5_25lh5lhlvha79yz.R.inc(8320);i = len;
                            __CLR4_5_25lh5lhlvha79yz.R.inc(8321);lastMatch = false;
                        }
                        }__CLR4_5_25lh5lhlvha79yz.R.inc(8322);list.add(str.substring(start, i));
                        __CLR4_5_25lh5lhlvha79yz.R.inc(8323);match = false;
                    }
                    }__CLR4_5_25lh5lhlvha79yz.R.inc(8324);start = ++i;
                    __CLR4_5_25lh5lhlvha79yz.R.inc(8325);continue;
                }
                }__CLR4_5_25lh5lhlvha79yz.R.inc(8326);lastMatch = false;
                __CLR4_5_25lh5lhlvha79yz.R.inc(8327);match = true;
                __CLR4_5_25lh5lhlvha79yz.R.inc(8328);i++;
            }
        }} }else {__CLR4_5_25lh5lhlvha79yz.R.inc(8329);if ((((separatorChars.length() == 1)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(8330)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(8331)==0&false))) {{
            // Optimise 1 character case
            __CLR4_5_25lh5lhlvha79yz.R.inc(8332);final char sep = separatorChars.charAt(0);
            __CLR4_5_25lh5lhlvha79yz.R.inc(8333);while ((((i < len)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(8334)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(8335)==0&false))) {{
                __CLR4_5_25lh5lhlvha79yz.R.inc(8336);if ((((str.charAt(i) == sep)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(8337)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(8338)==0&false))) {{
                    __CLR4_5_25lh5lhlvha79yz.R.inc(8339);if ((((match || preserveAllTokens)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(8340)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(8341)==0&false))) {{
                        __CLR4_5_25lh5lhlvha79yz.R.inc(8342);lastMatch = true;
                        __CLR4_5_25lh5lhlvha79yz.R.inc(8343);if ((((sizePlus1++ == max)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(8344)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(8345)==0&false))) {{
                            __CLR4_5_25lh5lhlvha79yz.R.inc(8346);i = len;
                            __CLR4_5_25lh5lhlvha79yz.R.inc(8347);lastMatch = false;
                        }
                        }__CLR4_5_25lh5lhlvha79yz.R.inc(8348);list.add(str.substring(start, i));
                        __CLR4_5_25lh5lhlvha79yz.R.inc(8349);match = false;
                    }
                    }__CLR4_5_25lh5lhlvha79yz.R.inc(8350);start = ++i;
                    __CLR4_5_25lh5lhlvha79yz.R.inc(8351);continue;
                }
                }__CLR4_5_25lh5lhlvha79yz.R.inc(8352);lastMatch = false;
                __CLR4_5_25lh5lhlvha79yz.R.inc(8353);match = true;
                __CLR4_5_25lh5lhlvha79yz.R.inc(8354);i++;
            }
        }} }else {{
            // standard case
            __CLR4_5_25lh5lhlvha79yz.R.inc(8355);while ((((i < len)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(8356)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(8357)==0&false))) {{
                __CLR4_5_25lh5lhlvha79yz.R.inc(8358);if ((((separatorChars.indexOf(str.charAt(i)) >= 0)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(8359)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(8360)==0&false))) {{
                    __CLR4_5_25lh5lhlvha79yz.R.inc(8361);if ((((match || preserveAllTokens)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(8362)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(8363)==0&false))) {{
                        __CLR4_5_25lh5lhlvha79yz.R.inc(8364);lastMatch = true;
                        __CLR4_5_25lh5lhlvha79yz.R.inc(8365);if ((((sizePlus1++ == max)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(8366)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(8367)==0&false))) {{
                            __CLR4_5_25lh5lhlvha79yz.R.inc(8368);i = len;
                            __CLR4_5_25lh5lhlvha79yz.R.inc(8369);lastMatch = false;
                        }
                        }__CLR4_5_25lh5lhlvha79yz.R.inc(8370);list.add(str.substring(start, i));
                        __CLR4_5_25lh5lhlvha79yz.R.inc(8371);match = false;
                    }
                    }__CLR4_5_25lh5lhlvha79yz.R.inc(8372);start = ++i;
                    __CLR4_5_25lh5lhlvha79yz.R.inc(8373);continue;
                }
                }__CLR4_5_25lh5lhlvha79yz.R.inc(8374);lastMatch = false;
                __CLR4_5_25lh5lhlvha79yz.R.inc(8375);match = true;
                __CLR4_5_25lh5lhlvha79yz.R.inc(8376);i++;
            }
        }}
        }}__CLR4_5_25lh5lhlvha79yz.R.inc(8377);if ((((match || preserveAllTokens && lastMatch)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(8378)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(8379)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(8380);list.add(str.substring(start, i));
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(8381);return list.toArray(new String[list.size()]);
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    /**
     * <p>Splits a String by Character type as returned by
     * {@code java.lang.Character.getType(char)}. Groups of contiguous
     * characters of the same type are returned as complete tokens.
     * <pre>
     * StringUtils.splitByCharacterType(null)         = null
     * StringUtils.splitByCharacterType("")           = []
     * StringUtils.splitByCharacterType("ab de fg")   = ["ab", " ", "de", " ", "fg"]
     * StringUtils.splitByCharacterType("ab   de fg") = ["ab", "   ", "de", " ", "fg"]
     * StringUtils.splitByCharacterType("ab:cd:ef")   = ["ab", ":", "cd", ":", "ef"]
     * StringUtils.splitByCharacterType("number5")    = ["number", "5"]
     * StringUtils.splitByCharacterType("fooBar")     = ["foo", "B", "ar"]
     * StringUtils.splitByCharacterType("foo200Bar")  = ["foo", "200", "B", "ar"]
     * StringUtils.splitByCharacterType("ASFRules")   = ["ASFR", "ules"]
     * </pre>
     * @param str the String to split, may be {@code null}
     * @return an array of parsed Strings, {@code null} if null String input
     * @since 2.4
     */
    public static String[] splitByCharacterType(final String str) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(8382);
        __CLR4_5_25lh5lhlvha79yz.R.inc(8383);return splitByCharacterType(str, false);
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    /**
     * <p>Splits a String by Character type as returned by
     * {@code java.lang.Character.getType(char)}. Groups of contiguous
     * characters of the same type are returned as complete tokens, with the
     * following exception: the character of type
     * {@code Character.UPPERCASE_LETTER}, if any, immediately
     * preceding a token of type {@code Character.LOWERCASE_LETTER}
     * will belong to the following token rather than to the preceding, if any,
     * {@code Character.UPPERCASE_LETTER} token.
     * <pre>
     * StringUtils.splitByCharacterTypeCamelCase(null)         = null
     * StringUtils.splitByCharacterTypeCamelCase("")           = []
     * StringUtils.splitByCharacterTypeCamelCase("ab de fg")   = ["ab", " ", "de", " ", "fg"]
     * StringUtils.splitByCharacterTypeCamelCase("ab   de fg") = ["ab", "   ", "de", " ", "fg"]
     * StringUtils.splitByCharacterTypeCamelCase("ab:cd:ef")   = ["ab", ":", "cd", ":", "ef"]
     * StringUtils.splitByCharacterTypeCamelCase("number5")    = ["number", "5"]
     * StringUtils.splitByCharacterTypeCamelCase("fooBar")     = ["foo", "Bar"]
     * StringUtils.splitByCharacterTypeCamelCase("foo200Bar")  = ["foo", "200", "Bar"]
     * StringUtils.splitByCharacterTypeCamelCase("ASFRules")   = ["ASF", "Rules"]
     * </pre>
     * @param str the String to split, may be {@code null}
     * @return an array of parsed Strings, {@code null} if null String input
     * @since 2.4
     */
    public static String[] splitByCharacterTypeCamelCase(final String str) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(8384);
        __CLR4_5_25lh5lhlvha79yz.R.inc(8385);return splitByCharacterType(str, true);
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    /**
     * <p>Splits a String by Character type as returned by
     * {@code java.lang.Character.getType(char)}. Groups of contiguous
     * characters of the same type are returned as complete tokens, with the
     * following exception: if {@code camelCase} is {@code true},
     * the character of type {@code Character.UPPERCASE_LETTER}, if any,
     * immediately preceding a token of type {@code Character.LOWERCASE_LETTER}
     * will belong to the following token rather than to the preceding, if any,
     * {@code Character.UPPERCASE_LETTER} token.
     * @param str the String to split, may be {@code null}
     * @param camelCase whether to use so-called "camel-case" for letter types
     * @return an array of parsed Strings, {@code null} if null String input
     * @since 2.4
     */
    private static String[] splitByCharacterType(final String str, final boolean camelCase) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(8386);
        __CLR4_5_25lh5lhlvha79yz.R.inc(8387);if ((((str == null)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(8388)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(8389)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(8390);return null;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(8391);if ((((str.isEmpty())&&(__CLR4_5_25lh5lhlvha79yz.R.iget(8392)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(8393)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(8394);return ArrayUtils.EMPTY_STRING_ARRAY;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(8395);final char[] c = str.toCharArray();
        __CLR4_5_25lh5lhlvha79yz.R.inc(8396);final List<String> list = new ArrayList<>();
        __CLR4_5_25lh5lhlvha79yz.R.inc(8397);int tokenStart = 0;
        __CLR4_5_25lh5lhlvha79yz.R.inc(8398);int currentType = Character.getType(c[tokenStart]);
        __CLR4_5_25lh5lhlvha79yz.R.inc(8399);for (int pos = tokenStart + 1; (((pos < c.length)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(8400)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(8401)==0&false)); pos++) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(8402);final int type = Character.getType(c[pos]);
            __CLR4_5_25lh5lhlvha79yz.R.inc(8403);if ((((type == currentType)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(8404)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(8405)==0&false))) {{
                __CLR4_5_25lh5lhlvha79yz.R.inc(8406);continue;
            }
            }__CLR4_5_25lh5lhlvha79yz.R.inc(8407);if ((((camelCase && type == Character.LOWERCASE_LETTER && currentType == Character.UPPERCASE_LETTER)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(8408)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(8409)==0&false))) {{
                __CLR4_5_25lh5lhlvha79yz.R.inc(8410);final int newTokenStart = pos - 1;
                __CLR4_5_25lh5lhlvha79yz.R.inc(8411);if ((((newTokenStart != tokenStart)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(8412)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(8413)==0&false))) {{
                    __CLR4_5_25lh5lhlvha79yz.R.inc(8414);list.add(new String(c, tokenStart, newTokenStart - tokenStart));
                    __CLR4_5_25lh5lhlvha79yz.R.inc(8415);tokenStart = newTokenStart;
                }
            }} }else {{
                __CLR4_5_25lh5lhlvha79yz.R.inc(8416);list.add(new String(c, tokenStart, pos - tokenStart));
                __CLR4_5_25lh5lhlvha79yz.R.inc(8417);tokenStart = pos;
            }
            }__CLR4_5_25lh5lhlvha79yz.R.inc(8418);currentType = type;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(8419);list.add(new String(c, tokenStart, c.length - tokenStart));
        __CLR4_5_25lh5lhlvha79yz.R.inc(8420);return list.toArray(new String[list.size()]);
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    // Joining
    //-----------------------------------------------------------------------
    /**
     * <p>Joins the elements of the provided array into a single String
     * containing the provided list of elements.</p>
     *
     * <p>No separator is added to the joined String.
     * Null objects or empty strings within the array are represented by
     * empty strings.</p>
     *
     * <pre>
     * StringUtils.join(null)            = null
     * StringUtils.join([])              = ""
     * StringUtils.join([null])          = ""
     * StringUtils.join(["a", "b", "c"]) = "abc"
     * StringUtils.join([null, "", "a"]) = "a"
     * </pre>
     *
     * @param <T> the specific type of values to join together
     * @param elements  the values to join together, may be null
     * @return the joined String, {@code null} if null array input
     * @since 2.0
     * @since 3.0 Changed signature to use varargs
     */
    @SafeVarargs
    public static <T> String join(final T... elements) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(8421);
        __CLR4_5_25lh5lhlvha79yz.R.inc(8422);return join(elements, null);
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    /**
     * <p>Joins the elements of the provided array into a single String
     * containing the provided list of elements.</p>
     *
     * <p>No delimiter is added before or after the list.
     * Null objects or empty strings within the array are represented by
     * empty strings.</p>
     *
     * <pre>
     * StringUtils.join(null, *)               = null
     * StringUtils.join([], *)                 = ""
     * StringUtils.join([null], *)             = ""
     * StringUtils.join(["a", "b", "c"], ';')  = "a;b;c"
     * StringUtils.join(["a", "b", "c"], null) = "abc"
     * StringUtils.join([null, "", "a"], ';')  = ";;a"
     * </pre>
     *
     * @param array  the array of values to join together, may be null
     * @param separator  the separator character to use
     * @return the joined String, {@code null} if null array input
     * @since 2.0
     */
    public static String join(final Object[] array, final char separator) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(8423);
        __CLR4_5_25lh5lhlvha79yz.R.inc(8424);if ((((array == null)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(8425)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(8426)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(8427);return null;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(8428);return join(array, separator, 0, array.length);
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    /**
     * <p>
     * Joins the elements of the provided array into a single String containing the provided list of elements.
     * </p>
     *
     * <p>
     * No delimiter is added before or after the list. Null objects or empty strings within the array are represented
     * by empty strings.
     * </p>
     *
     * <pre>
     * StringUtils.join(null, *)               = null
     * StringUtils.join([], *)                 = ""
     * StringUtils.join([null], *)             = ""
     * StringUtils.join([1, 2, 3], ';')  = "1;2;3"
     * StringUtils.join([1, 2, 3], null) = "123"
     * </pre>
     *
     * @param array
     *            the array of values to join together, may be null
     * @param separator
     *            the separator character to use
     * @return the joined String, {@code null} if null array input
     * @since 3.2
     */
    public static String join(final long[] array, final char separator) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(8429);
        __CLR4_5_25lh5lhlvha79yz.R.inc(8430);if ((((array == null)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(8431)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(8432)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(8433);return null;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(8434);return join(array, separator, 0, array.length);
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    /**
     * <p>
     * Joins the elements of the provided array into a single String containing the provided list of elements.
     * </p>
     *
     * <p>
     * No delimiter is added before or after the list. Null objects or empty strings within the array are represented
     * by empty strings.
     * </p>
     *
     * <pre>
     * StringUtils.join(null, *)               = null
     * StringUtils.join([], *)                 = ""
     * StringUtils.join([null], *)             = ""
     * StringUtils.join([1, 2, 3], ';')  = "1;2;3"
     * StringUtils.join([1, 2, 3], null) = "123"
     * </pre>
     *
     * @param array
     *            the array of values to join together, may be null
     * @param separator
     *            the separator character to use
     * @return the joined String, {@code null} if null array input
     * @since 3.2
     */
    public static String join(final int[] array, final char separator) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(8435);
        __CLR4_5_25lh5lhlvha79yz.R.inc(8436);if ((((array == null)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(8437)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(8438)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(8439);return null;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(8440);return join(array, separator, 0, array.length);
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    /**
     * <p>
     * Joins the elements of the provided array into a single String containing the provided list of elements.
     * </p>
     *
     * <p>
     * No delimiter is added before or after the list. Null objects or empty strings within the array are represented
     * by empty strings.
     * </p>
     *
     * <pre>
     * StringUtils.join(null, *)               = null
     * StringUtils.join([], *)                 = ""
     * StringUtils.join([null], *)             = ""
     * StringUtils.join([1, 2, 3], ';')  = "1;2;3"
     * StringUtils.join([1, 2, 3], null) = "123"
     * </pre>
     *
     * @param array
     *            the array of values to join together, may be null
     * @param separator
     *            the separator character to use
     * @return the joined String, {@code null} if null array input
     * @since 3.2
     */
    public static String join(final short[] array, final char separator) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(8441);
        __CLR4_5_25lh5lhlvha79yz.R.inc(8442);if ((((array == null)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(8443)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(8444)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(8445);return null;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(8446);return join(array, separator, 0, array.length);
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    /**
     * <p>
     * Joins the elements of the provided array into a single String containing the provided list of elements.
     * </p>
     *
     * <p>
     * No delimiter is added before or after the list. Null objects or empty strings within the array are represented
     * by empty strings.
     * </p>
     *
     * <pre>
     * StringUtils.join(null, *)               = null
     * StringUtils.join([], *)                 = ""
     * StringUtils.join([null], *)             = ""
     * StringUtils.join([1, 2, 3], ';')  = "1;2;3"
     * StringUtils.join([1, 2, 3], null) = "123"
     * </pre>
     *
     * @param array
     *            the array of values to join together, may be null
     * @param separator
     *            the separator character to use
     * @return the joined String, {@code null} if null array input
     * @since 3.2
     */
    public static String join(final byte[] array, final char separator) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(8447);
        __CLR4_5_25lh5lhlvha79yz.R.inc(8448);if ((((array == null)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(8449)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(8450)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(8451);return null;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(8452);return join(array, separator, 0, array.length);
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    /**
     * <p>
     * Joins the elements of the provided array into a single String containing the provided list of elements.
     * </p>
     *
     * <p>
     * No delimiter is added before or after the list. Null objects or empty strings within the array are represented
     * by empty strings.
     * </p>
     *
     * <pre>
     * StringUtils.join(null, *)               = null
     * StringUtils.join([], *)                 = ""
     * StringUtils.join([null], *)             = ""
     * StringUtils.join([1, 2, 3], ';')  = "1;2;3"
     * StringUtils.join([1, 2, 3], null) = "123"
     * </pre>
     *
     * @param array
     *            the array of values to join together, may be null
     * @param separator
     *            the separator character to use
     * @return the joined String, {@code null} if null array input
     * @since 3.2
     */
    public static String join(final char[] array, final char separator) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(8453);
        __CLR4_5_25lh5lhlvha79yz.R.inc(8454);if ((((array == null)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(8455)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(8456)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(8457);return null;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(8458);return join(array, separator, 0, array.length);
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    /**
     * <p>
     * Joins the elements of the provided array into a single String containing the provided list of elements.
     * </p>
     *
     * <p>
     * No delimiter is added before or after the list. Null objects or empty strings within the array are represented
     * by empty strings.
     * </p>
     *
     * <pre>
     * StringUtils.join(null, *)               = null
     * StringUtils.join([], *)                 = ""
     * StringUtils.join([null], *)             = ""
     * StringUtils.join([1, 2, 3], ';')  = "1;2;3"
     * StringUtils.join([1, 2, 3], null) = "123"
     * </pre>
     *
     * @param array
     *            the array of values to join together, may be null
     * @param separator
     *            the separator character to use
     * @return the joined String, {@code null} if null array input
     * @since 3.2
     */
    public static String join(final float[] array, final char separator) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(8459);
        __CLR4_5_25lh5lhlvha79yz.R.inc(8460);if ((((array == null)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(8461)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(8462)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(8463);return null;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(8464);return join(array, separator, 0, array.length);
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    /**
     * <p>
     * Joins the elements of the provided array into a single String containing the provided list of elements.
     * </p>
     *
     * <p>
     * No delimiter is added before or after the list. Null objects or empty strings within the array are represented
     * by empty strings.
     * </p>
     *
     * <pre>
     * StringUtils.join(null, *)               = null
     * StringUtils.join([], *)                 = ""
     * StringUtils.join([null], *)             = ""
     * StringUtils.join([1, 2, 3], ';')  = "1;2;3"
     * StringUtils.join([1, 2, 3], null) = "123"
     * </pre>
     *
     * @param array
     *            the array of values to join together, may be null
     * @param separator
     *            the separator character to use
     * @return the joined String, {@code null} if null array input
     * @since 3.2
     */
    public static String join(final double[] array, final char separator) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(8465);
        __CLR4_5_25lh5lhlvha79yz.R.inc(8466);if ((((array == null)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(8467)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(8468)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(8469);return null;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(8470);return join(array, separator, 0, array.length);
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}


    /**
     * <p>Joins the elements of the provided array into a single String
     * containing the provided list of elements.</p>
     *
     * <p>No delimiter is added before or after the list.
     * Null objects or empty strings within the array are represented by
     * empty strings.</p>
     *
     * <pre>
     * StringUtils.join(null, *)               = null
     * StringUtils.join([], *)                 = ""
     * StringUtils.join([null], *)             = ""
     * StringUtils.join(["a", "b", "c"], ';')  = "a;b;c"
     * StringUtils.join(["a", "b", "c"], null) = "abc"
     * StringUtils.join([null, "", "a"], ';')  = ";;a"
     * </pre>
     *
     * @param array  the array of values to join together, may be null
     * @param separator  the separator character to use
     * @param startIndex the first index to start joining from.  It is
     * an error to pass in an end index past the end of the array
     * @param endIndex the index to stop joining from (exclusive). It is
     * an error to pass in an end index past the end of the array
     * @return the joined String, {@code null} if null array input
     * @since 2.0
     */
    public static String join(final Object[] array, final char separator, final int startIndex, final int endIndex) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(8471);
        __CLR4_5_25lh5lhlvha79yz.R.inc(8472);if ((((array == null)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(8473)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(8474)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(8475);return null;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(8476);final int noOfItems = endIndex - startIndex;
        __CLR4_5_25lh5lhlvha79yz.R.inc(8477);if ((((noOfItems <= 0)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(8478)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(8479)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(8480);return EMPTY;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(8481);final StringBuilder buf = new StringBuilder(noOfItems * 16);
        __CLR4_5_25lh5lhlvha79yz.R.inc(8482);for (int i = startIndex; (((i < endIndex)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(8483)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(8484)==0&false)); i++) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(8485);if ((((i > startIndex)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(8486)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(8487)==0&false))) {{
                __CLR4_5_25lh5lhlvha79yz.R.inc(8488);buf.append(separator);
            }
            }__CLR4_5_25lh5lhlvha79yz.R.inc(8489);if ((((array[i] != null)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(8490)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(8491)==0&false))) {{
                __CLR4_5_25lh5lhlvha79yz.R.inc(8492);buf.append(array[i]);
            }
        }}
        }__CLR4_5_25lh5lhlvha79yz.R.inc(8493);return buf.toString();
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    /**
     * <p>
     * Joins the elements of the provided array into a single String containing the provided list of elements.
     * </p>
     *
     * <p>
     * No delimiter is added before or after the list. Null objects or empty strings within the array are represented
     * by empty strings.
     * </p>
     *
     * <pre>
     * StringUtils.join(null, *)               = null
     * StringUtils.join([], *)                 = ""
     * StringUtils.join([null], *)             = ""
     * StringUtils.join([1, 2, 3], ';')  = "1;2;3"
     * StringUtils.join([1, 2, 3], null) = "123"
     * </pre>
     *
     * @param array
     *            the array of values to join together, may be null
     * @param separator
     *            the separator character to use
     * @param startIndex
     *            the first index to start joining from. It is an error to pass in an end index past the end of the
     *            array
     * @param endIndex
     *            the index to stop joining from (exclusive). It is an error to pass in an end index past the end of
     *            the array
     * @return the joined String, {@code null} if null array input
     * @since 3.2
     */
    public static String join(final long[] array, final char separator, final int startIndex, final int endIndex) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(8494);
        __CLR4_5_25lh5lhlvha79yz.R.inc(8495);if ((((array == null)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(8496)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(8497)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(8498);return null;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(8499);final int noOfItems = endIndex - startIndex;
        __CLR4_5_25lh5lhlvha79yz.R.inc(8500);if ((((noOfItems <= 0)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(8501)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(8502)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(8503);return EMPTY;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(8504);final StringBuilder buf = new StringBuilder(noOfItems * 16);
        __CLR4_5_25lh5lhlvha79yz.R.inc(8505);for (int i = startIndex; (((i < endIndex)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(8506)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(8507)==0&false)); i++) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(8508);if ((((i > startIndex)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(8509)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(8510)==0&false))) {{
                __CLR4_5_25lh5lhlvha79yz.R.inc(8511);buf.append(separator);
            }
            }__CLR4_5_25lh5lhlvha79yz.R.inc(8512);buf.append(array[i]);
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(8513);return buf.toString();
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    /**
     * <p>
     * Joins the elements of the provided array into a single String containing the provided list of elements.
     * </p>
     *
     * <p>
     * No delimiter is added before or after the list. Null objects or empty strings within the array are represented
     * by empty strings.
     * </p>
     *
     * <pre>
     * StringUtils.join(null, *)               = null
     * StringUtils.join([], *)                 = ""
     * StringUtils.join([null], *)             = ""
     * StringUtils.join([1, 2, 3], ';')  = "1;2;3"
     * StringUtils.join([1, 2, 3], null) = "123"
     * </pre>
     *
     * @param array
     *            the array of values to join together, may be null
     * @param separator
     *            the separator character to use
     * @param startIndex
     *            the first index to start joining from. It is an error to pass in an end index past the end of the
     *            array
     * @param endIndex
     *            the index to stop joining from (exclusive). It is an error to pass in an end index past the end of
     *            the array
     * @return the joined String, {@code null} if null array input
     * @since 3.2
     */
    public static String join(final int[] array, final char separator, final int startIndex, final int endIndex) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(8514);
        __CLR4_5_25lh5lhlvha79yz.R.inc(8515);if ((((array == null)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(8516)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(8517)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(8518);return null;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(8519);final int noOfItems = endIndex - startIndex;
        __CLR4_5_25lh5lhlvha79yz.R.inc(8520);if ((((noOfItems <= 0)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(8521)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(8522)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(8523);return EMPTY;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(8524);final StringBuilder buf = new StringBuilder(noOfItems * 16);
        __CLR4_5_25lh5lhlvha79yz.R.inc(8525);for (int i = startIndex; (((i < endIndex)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(8526)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(8527)==0&false)); i++) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(8528);if ((((i > startIndex)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(8529)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(8530)==0&false))) {{
                __CLR4_5_25lh5lhlvha79yz.R.inc(8531);buf.append(separator);
            }
            }__CLR4_5_25lh5lhlvha79yz.R.inc(8532);buf.append(array[i]);
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(8533);return buf.toString();
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    /**
     * <p>
     * Joins the elements of the provided array into a single String containing the provided list of elements.
     * </p>
     *
     * <p>
     * No delimiter is added before or after the list. Null objects or empty strings within the array are represented
     * by empty strings.
     * </p>
     *
     * <pre>
     * StringUtils.join(null, *)               = null
     * StringUtils.join([], *)                 = ""
     * StringUtils.join([null], *)             = ""
     * StringUtils.join([1, 2, 3], ';')  = "1;2;3"
     * StringUtils.join([1, 2, 3], null) = "123"
     * </pre>
     *
     * @param array
     *            the array of values to join together, may be null
     * @param separator
     *            the separator character to use
     * @param startIndex
     *            the first index to start joining from. It is an error to pass in an end index past the end of the
     *            array
     * @param endIndex
     *            the index to stop joining from (exclusive). It is an error to pass in an end index past the end of
     *            the array
     * @return the joined String, {@code null} if null array input
     * @since 3.2
     */
    public static String join(final byte[] array, final char separator, final int startIndex, final int endIndex) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(8534);
        __CLR4_5_25lh5lhlvha79yz.R.inc(8535);if ((((array == null)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(8536)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(8537)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(8538);return null;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(8539);final int noOfItems = endIndex - startIndex;
        __CLR4_5_25lh5lhlvha79yz.R.inc(8540);if ((((noOfItems <= 0)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(8541)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(8542)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(8543);return EMPTY;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(8544);final StringBuilder buf = new StringBuilder(noOfItems * 16);
        __CLR4_5_25lh5lhlvha79yz.R.inc(8545);for (int i = startIndex; (((i < endIndex)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(8546)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(8547)==0&false)); i++) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(8548);if ((((i > startIndex)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(8549)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(8550)==0&false))) {{
                __CLR4_5_25lh5lhlvha79yz.R.inc(8551);buf.append(separator);
            }
            }__CLR4_5_25lh5lhlvha79yz.R.inc(8552);buf.append(array[i]);
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(8553);return buf.toString();
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    /**
     * <p>
     * Joins the elements of the provided array into a single String containing the provided list of elements.
     * </p>
     *
     * <p>
     * No delimiter is added before or after the list. Null objects or empty strings within the array are represented
     * by empty strings.
     * </p>
     *
     * <pre>
     * StringUtils.join(null, *)               = null
     * StringUtils.join([], *)                 = ""
     * StringUtils.join([null], *)             = ""
     * StringUtils.join([1, 2, 3], ';')  = "1;2;3"
     * StringUtils.join([1, 2, 3], null) = "123"
     * </pre>
     *
     * @param array
     *            the array of values to join together, may be null
     * @param separator
     *            the separator character to use
     * @param startIndex
     *            the first index to start joining from. It is an error to pass in an end index past the end of the
     *            array
     * @param endIndex
     *            the index to stop joining from (exclusive). It is an error to pass in an end index past the end of
     *            the array
     * @return the joined String, {@code null} if null array input
     * @since 3.2
     */
    public static String join(final short[] array, final char separator, final int startIndex, final int endIndex) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(8554);
        __CLR4_5_25lh5lhlvha79yz.R.inc(8555);if ((((array == null)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(8556)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(8557)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(8558);return null;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(8559);final int noOfItems = endIndex - startIndex;
        __CLR4_5_25lh5lhlvha79yz.R.inc(8560);if ((((noOfItems <= 0)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(8561)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(8562)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(8563);return EMPTY;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(8564);final StringBuilder buf = new StringBuilder(noOfItems * 16);
        __CLR4_5_25lh5lhlvha79yz.R.inc(8565);for (int i = startIndex; (((i < endIndex)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(8566)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(8567)==0&false)); i++) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(8568);if ((((i > startIndex)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(8569)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(8570)==0&false))) {{
                __CLR4_5_25lh5lhlvha79yz.R.inc(8571);buf.append(separator);
            }
            }__CLR4_5_25lh5lhlvha79yz.R.inc(8572);buf.append(array[i]);
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(8573);return buf.toString();
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    /**
     * <p>
     * Joins the elements of the provided array into a single String containing the provided list of elements.
     * </p>
     *
     * <p>
     * No delimiter is added before or after the list. Null objects or empty strings within the array are represented
     * by empty strings.
     * </p>
     *
     * <pre>
     * StringUtils.join(null, *)               = null
     * StringUtils.join([], *)                 = ""
     * StringUtils.join([null], *)             = ""
     * StringUtils.join([1, 2, 3], ';')  = "1;2;3"
     * StringUtils.join([1, 2, 3], null) = "123"
     * </pre>
     *
     * @param array
     *            the array of values to join together, may be null
     * @param separator
     *            the separator character to use
     * @param startIndex
     *            the first index to start joining from. It is an error to pass in an end index past the end of the
     *            array
     * @param endIndex
     *            the index to stop joining from (exclusive). It is an error to pass in an end index past the end of
     *            the array
     * @return the joined String, {@code null} if null array input
     * @since 3.2
     */
    public static String join(final char[] array, final char separator, final int startIndex, final int endIndex) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(8574);
        __CLR4_5_25lh5lhlvha79yz.R.inc(8575);if ((((array == null)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(8576)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(8577)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(8578);return null;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(8579);final int noOfItems = endIndex - startIndex;
        __CLR4_5_25lh5lhlvha79yz.R.inc(8580);if ((((noOfItems <= 0)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(8581)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(8582)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(8583);return EMPTY;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(8584);final StringBuilder buf = new StringBuilder(noOfItems * 16);
        __CLR4_5_25lh5lhlvha79yz.R.inc(8585);for (int i = startIndex; (((i < endIndex)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(8586)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(8587)==0&false)); i++) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(8588);if ((((i > startIndex)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(8589)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(8590)==0&false))) {{
                __CLR4_5_25lh5lhlvha79yz.R.inc(8591);buf.append(separator);
            }
            }__CLR4_5_25lh5lhlvha79yz.R.inc(8592);buf.append(array[i]);
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(8593);return buf.toString();
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    /**
     * <p>
     * Joins the elements of the provided array into a single String containing the provided list of elements.
     * </p>
     *
     * <p>
     * No delimiter is added before or after the list. Null objects or empty strings within the array are represented
     * by empty strings.
     * </p>
     *
     * <pre>
     * StringUtils.join(null, *)               = null
     * StringUtils.join([], *)                 = ""
     * StringUtils.join([null], *)             = ""
     * StringUtils.join([1, 2, 3], ';')  = "1;2;3"
     * StringUtils.join([1, 2, 3], null) = "123"
     * </pre>
     *
     * @param array
     *            the array of values to join together, may be null
     * @param separator
     *            the separator character to use
     * @param startIndex
     *            the first index to start joining from. It is an error to pass in an end index past the end of the
     *            array
     * @param endIndex
     *            the index to stop joining from (exclusive). It is an error to pass in an end index past the end of
     *            the array
     * @return the joined String, {@code null} if null array input
     * @since 3.2
     */
    public static String join(final double[] array, final char separator, final int startIndex, final int endIndex) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(8594);
        __CLR4_5_25lh5lhlvha79yz.R.inc(8595);if ((((array == null)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(8596)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(8597)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(8598);return null;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(8599);final int noOfItems = endIndex - startIndex;
        __CLR4_5_25lh5lhlvha79yz.R.inc(8600);if ((((noOfItems <= 0)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(8601)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(8602)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(8603);return EMPTY;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(8604);final StringBuilder buf = new StringBuilder(noOfItems * 16);
        __CLR4_5_25lh5lhlvha79yz.R.inc(8605);for (int i = startIndex; (((i < endIndex)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(8606)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(8607)==0&false)); i++) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(8608);if ((((i > startIndex)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(8609)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(8610)==0&false))) {{
                __CLR4_5_25lh5lhlvha79yz.R.inc(8611);buf.append(separator);
            }
            }__CLR4_5_25lh5lhlvha79yz.R.inc(8612);buf.append(array[i]);
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(8613);return buf.toString();
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    /**
     * <p>
     * Joins the elements of the provided array into a single String containing the provided list of elements.
     * </p>
     *
     * <p>
     * No delimiter is added before or after the list. Null objects or empty strings within the array are represented
     * by empty strings.
     * </p>
     *
     * <pre>
     * StringUtils.join(null, *)               = null
     * StringUtils.join([], *)                 = ""
     * StringUtils.join([null], *)             = ""
     * StringUtils.join([1, 2, 3], ';')  = "1;2;3"
     * StringUtils.join([1, 2, 3], null) = "123"
     * </pre>
     *
     * @param array
     *            the array of values to join together, may be null
     * @param separator
     *            the separator character to use
     * @param startIndex
     *            the first index to start joining from. It is an error to pass in an end index past the end of the
     *            array
     * @param endIndex
     *            the index to stop joining from (exclusive). It is an error to pass in an end index past the end of
     *            the array
     * @return the joined String, {@code null} if null array input
     * @since 3.2
     */
    public static String join(final float[] array, final char separator, final int startIndex, final int endIndex) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(8614);
        __CLR4_5_25lh5lhlvha79yz.R.inc(8615);if ((((array == null)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(8616)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(8617)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(8618);return null;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(8619);final int noOfItems = endIndex - startIndex;
        __CLR4_5_25lh5lhlvha79yz.R.inc(8620);if ((((noOfItems <= 0)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(8621)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(8622)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(8623);return EMPTY;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(8624);final StringBuilder buf = new StringBuilder(noOfItems * 16);
        __CLR4_5_25lh5lhlvha79yz.R.inc(8625);for (int i = startIndex; (((i < endIndex)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(8626)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(8627)==0&false)); i++) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(8628);if ((((i > startIndex)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(8629)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(8630)==0&false))) {{
                __CLR4_5_25lh5lhlvha79yz.R.inc(8631);buf.append(separator);
            }
            }__CLR4_5_25lh5lhlvha79yz.R.inc(8632);buf.append(array[i]);
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(8633);return buf.toString();
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}


    /**
     * <p>Joins the elements of the provided array into a single String
     * containing the provided list of elements.</p>
     *
     * <p>No delimiter is added before or after the list.
     * A {@code null} separator is the same as an empty String ("").
     * Null objects or empty strings within the array are represented by
     * empty strings.</p>
     *
     * <pre>
     * StringUtils.join(null, *)                = null
     * StringUtils.join([], *)                  = ""
     * StringUtils.join([null], *)              = ""
     * StringUtils.join(["a", "b", "c"], "--")  = "a--b--c"
     * StringUtils.join(["a", "b", "c"], null)  = "abc"
     * StringUtils.join(["a", "b", "c"], "")    = "abc"
     * StringUtils.join([null, "", "a"], ',')   = ",,a"
     * </pre>
     *
     * @param array  the array of values to join together, may be null
     * @param separator  the separator character to use, null treated as ""
     * @return the joined String, {@code null} if null array input
     */
    public static String join(final Object[] array, final String separator) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(8634);
        __CLR4_5_25lh5lhlvha79yz.R.inc(8635);if ((((array == null)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(8636)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(8637)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(8638);return null;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(8639);return join(array, separator, 0, array.length);
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    /**
     * <p>Joins the elements of the provided array into a single String
     * containing the provided list of elements.</p>
     *
     * <p>No delimiter is added before or after the list.
     * A {@code null} separator is the same as an empty String ("").
     * Null objects or empty strings within the array are represented by
     * empty strings.</p>
     *
     * <pre>
     * StringUtils.join(null, *, *, *)                = null
     * StringUtils.join([], *, *, *)                  = ""
     * StringUtils.join([null], *, *, *)              = ""
     * StringUtils.join(["a", "b", "c"], "--", 0, 3)  = "a--b--c"
     * StringUtils.join(["a", "b", "c"], "--", 1, 3)  = "b--c"
     * StringUtils.join(["a", "b", "c"], "--", 2, 3)  = "c"
     * StringUtils.join(["a", "b", "c"], "--", 2, 2)  = ""
     * StringUtils.join(["a", "b", "c"], null, 0, 3)  = "abc"
     * StringUtils.join(["a", "b", "c"], "", 0, 3)    = "abc"
     * StringUtils.join([null, "", "a"], ',', 0, 3)   = ",,a"
     * </pre>
     *
     * @param array  the array of values to join together, may be null
     * @param separator  the separator character to use, null treated as ""
     * @param startIndex the first index to start joining from.
     * @param endIndex the index to stop joining from (exclusive).
     * @return the joined String, {@code null} if null array input; or the empty string
     * if {@code endIndex - startIndex <= 0}. The number of joined entries is given by
     * {@code endIndex - startIndex}
     * @throws ArrayIndexOutOfBoundsException ife<br>
     * {@code startIndex < 0} or <br>
     * {@code startIndex >= array.length()} or <br>
     * {@code endIndex < 0} or <br>
     * {@code endIndex > array.length()}
     */
    public static String join(final Object[] array, String separator, final int startIndex, final int endIndex) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(8640);
        __CLR4_5_25lh5lhlvha79yz.R.inc(8641);if ((((array == null)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(8642)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(8643)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(8644);return null;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(8645);if ((((separator == null)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(8646)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(8647)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(8648);separator = EMPTY;
        }

        // endIndex - startIndex > 0:   Len = NofStrings *(len(firstString) + len(separator))
        //           (Assuming that all Strings are roughly equally long)
        }__CLR4_5_25lh5lhlvha79yz.R.inc(8649);final int noOfItems = endIndex - startIndex;
        __CLR4_5_25lh5lhlvha79yz.R.inc(8650);if ((((noOfItems <= 0)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(8651)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(8652)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(8653);return EMPTY;
        }

        }__CLR4_5_25lh5lhlvha79yz.R.inc(8654);final StringBuilder buf = new StringBuilder(noOfItems * 16);

        __CLR4_5_25lh5lhlvha79yz.R.inc(8655);for (int i = startIndex; (((i < endIndex)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(8656)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(8657)==0&false)); i++) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(8658);if ((((i > startIndex)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(8659)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(8660)==0&false))) {{
                __CLR4_5_25lh5lhlvha79yz.R.inc(8661);buf.append(separator);
            }
            }__CLR4_5_25lh5lhlvha79yz.R.inc(8662);if ((((array[i] != null)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(8663)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(8664)==0&false))) {{
                __CLR4_5_25lh5lhlvha79yz.R.inc(8665);buf.append(array[i]);
            }
        }}
        }__CLR4_5_25lh5lhlvha79yz.R.inc(8666);return buf.toString();
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    /**
     * <p>Joins the elements of the provided {@code Iterator} into
     * a single String containing the provided elements.</p>
     *
     * <p>No delimiter is added before or after the list. Null objects or empty
     * strings within the iteration are represented by empty strings.</p>
     *
     * <p>See the examples here: {@link #join(Object[],char)}. </p>
     *
     * @param iterator  the {@code Iterator} of values to join together, may be null
     * @param separator  the separator character to use
     * @return the joined String, {@code null} if null iterator input
     * @since 2.0
     */
    public static String join(final Iterator<?> iterator, final char separator) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(8667);

        // handle null, zero and one elements before building a buffer
        __CLR4_5_25lh5lhlvha79yz.R.inc(8668);if ((((iterator == null)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(8669)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(8670)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(8671);return null;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(8672);if ((((!iterator.hasNext())&&(__CLR4_5_25lh5lhlvha79yz.R.iget(8673)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(8674)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(8675);return EMPTY;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(8676);final Object first = iterator.next();
        __CLR4_5_25lh5lhlvha79yz.R.inc(8677);if ((((!iterator.hasNext())&&(__CLR4_5_25lh5lhlvha79yz.R.iget(8678)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(8679)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(8680);final String result = Objects.toString(first, "");
            __CLR4_5_25lh5lhlvha79yz.R.inc(8681);return result;
        }

        // two or more elements
        }__CLR4_5_25lh5lhlvha79yz.R.inc(8682);final StringBuilder buf = new StringBuilder(256); // Java default is 16, probably too small
        __CLR4_5_25lh5lhlvha79yz.R.inc(8683);if ((((first != null)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(8684)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(8685)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(8686);buf.append(first);
        }

        }__CLR4_5_25lh5lhlvha79yz.R.inc(8687);while ((((iterator.hasNext())&&(__CLR4_5_25lh5lhlvha79yz.R.iget(8688)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(8689)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(8690);buf.append(separator);
            __CLR4_5_25lh5lhlvha79yz.R.inc(8691);final Object obj = iterator.next();
            __CLR4_5_25lh5lhlvha79yz.R.inc(8692);if ((((obj != null)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(8693)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(8694)==0&false))) {{
                __CLR4_5_25lh5lhlvha79yz.R.inc(8695);buf.append(obj);
            }
        }}

        }__CLR4_5_25lh5lhlvha79yz.R.inc(8696);return buf.toString();
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    /**
     * <p>Joins the elements of the provided {@code Iterator} into
     * a single String containing the provided elements.</p>
     *
     * <p>No delimiter is added before or after the list.
     * A {@code null} separator is the same as an empty String ("").</p>
     *
     * <p>See the examples here: {@link #join(Object[],String)}. </p>
     *
     * @param iterator  the {@code Iterator} of values to join together, may be null
     * @param separator  the separator character to use, null treated as ""
     * @return the joined String, {@code null} if null iterator input
     */
    public static String join(final Iterator<?> iterator, final String separator) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(8697);

        // handle null, zero and one elements before building a buffer
        __CLR4_5_25lh5lhlvha79yz.R.inc(8698);if ((((iterator == null)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(8699)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(8700)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(8701);return null;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(8702);if ((((!iterator.hasNext())&&(__CLR4_5_25lh5lhlvha79yz.R.iget(8703)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(8704)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(8705);return EMPTY;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(8706);final Object first = iterator.next();
        __CLR4_5_25lh5lhlvha79yz.R.inc(8707);if ((((!iterator.hasNext())&&(__CLR4_5_25lh5lhlvha79yz.R.iget(8708)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(8709)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(8710);final String result = Objects.toString(first, "");
            __CLR4_5_25lh5lhlvha79yz.R.inc(8711);return result;
        }

        // two or more elements
        }__CLR4_5_25lh5lhlvha79yz.R.inc(8712);final StringBuilder buf = new StringBuilder(256); // Java default is 16, probably too small
        __CLR4_5_25lh5lhlvha79yz.R.inc(8713);if ((((first != null)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(8714)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(8715)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(8716);buf.append(first);
        }

        }__CLR4_5_25lh5lhlvha79yz.R.inc(8717);while ((((iterator.hasNext())&&(__CLR4_5_25lh5lhlvha79yz.R.iget(8718)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(8719)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(8720);if ((((separator != null)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(8721)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(8722)==0&false))) {{
                __CLR4_5_25lh5lhlvha79yz.R.inc(8723);buf.append(separator);
            }
            }__CLR4_5_25lh5lhlvha79yz.R.inc(8724);final Object obj = iterator.next();
            __CLR4_5_25lh5lhlvha79yz.R.inc(8725);if ((((obj != null)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(8726)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(8727)==0&false))) {{
                __CLR4_5_25lh5lhlvha79yz.R.inc(8728);buf.append(obj);
            }
        }}
        }__CLR4_5_25lh5lhlvha79yz.R.inc(8729);return buf.toString();
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    /**
     * <p>Joins the elements of the provided {@code Iterable} into
     * a single String containing the provided elements.</p>
     *
     * <p>No delimiter is added before or after the list. Null objects or empty
     * strings within the iteration are represented by empty strings.</p>
     *
     * <p>See the examples here: {@link #join(Object[],char)}. </p>
     *
     * @param iterable  the {@code Iterable} providing the values to join together, may be null
     * @param separator  the separator character to use
     * @return the joined String, {@code null} if null iterator input
     * @since 2.3
     */
    public static String join(final Iterable<?> iterable, final char separator) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(8730);
        __CLR4_5_25lh5lhlvha79yz.R.inc(8731);if ((((iterable == null)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(8732)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(8733)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(8734);return null;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(8735);return join(iterable.iterator(), separator);
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    /**
     * <p>Joins the elements of the provided {@code Iterable} into
     * a single String containing the provided elements.</p>
     *
     * <p>No delimiter is added before or after the list.
     * A {@code null} separator is the same as an empty String ("").</p>
     *
     * <p>See the examples here: {@link #join(Object[],String)}. </p>
     *
     * @param iterable  the {@code Iterable} providing the values to join together, may be null
     * @param separator  the separator character to use, null treated as ""
     * @return the joined String, {@code null} if null iterator input
     * @since 2.3
     */
    public static String join(final Iterable<?> iterable, final String separator) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(8736);
        __CLR4_5_25lh5lhlvha79yz.R.inc(8737);if ((((iterable == null)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(8738)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(8739)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(8740);return null;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(8741);return join(iterable.iterator(), separator);
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    /**
     * <p>Joins the elements of the provided varargs into a
     * single String containing the provided elements.</p>
     *
     * <p>No delimiter is added before or after the list.
     * {@code null} elements and separator are treated as empty Strings ("").</p>
     *
     * <pre>
     * StringUtils.joinWith(",", {"a", "b"})        = "a,b"
     * StringUtils.joinWith(",", {"a", "b",""})     = "a,b,"
     * StringUtils.joinWith(",", {"a", null, "b"})  = "a,,b"
     * StringUtils.joinWith(null, {"a", "b"})       = "ab"
     * </pre>
     *
     * @param separator the separator character to use, null treated as ""
     * @param objects the varargs providing the values to join together. {@code null} elements are treated as ""
     * @return the joined String.
     * @throws java.lang.IllegalArgumentException if a null varargs is provided
     * @since 3.5
     */
    public static String joinWith(final String separator, final Object... objects) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(8742);
        __CLR4_5_25lh5lhlvha79yz.R.inc(8743);if ((((objects == null)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(8744)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(8745)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(8746);throw new IllegalArgumentException("Object varargs must not be null");
        }

        }__CLR4_5_25lh5lhlvha79yz.R.inc(8747);final String sanitizedSeparator = defaultString(separator, StringUtils.EMPTY);

        __CLR4_5_25lh5lhlvha79yz.R.inc(8748);final StringBuilder result = new StringBuilder();

        __CLR4_5_25lh5lhlvha79yz.R.inc(8749);final Iterator<Object> iterator = Arrays.asList(objects).iterator();
        __CLR4_5_25lh5lhlvha79yz.R.inc(8750);while ((((iterator.hasNext())&&(__CLR4_5_25lh5lhlvha79yz.R.iget(8751)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(8752)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(8753);final String value = Objects.toString(iterator.next(), "");
            __CLR4_5_25lh5lhlvha79yz.R.inc(8754);result.append(value);

            __CLR4_5_25lh5lhlvha79yz.R.inc(8755);if ((((iterator.hasNext())&&(__CLR4_5_25lh5lhlvha79yz.R.iget(8756)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(8757)==0&false))) {{
                __CLR4_5_25lh5lhlvha79yz.R.inc(8758);result.append(sanitizedSeparator);
            }
        }}

        }__CLR4_5_25lh5lhlvha79yz.R.inc(8759);return result.toString();
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    // Delete
    //-----------------------------------------------------------------------
    /**
     * <p>Deletes all whitespaces from a String as defined by
     * {@link Character#isWhitespace(char)}.</p>
     *
     * <pre>
     * StringUtils.deleteWhitespace(null)         = null
     * StringUtils.deleteWhitespace("")           = ""
     * StringUtils.deleteWhitespace("abc")        = "abc"
     * StringUtils.deleteWhitespace("   ab  c  ") = "abc"
     * </pre>
     *
     * @param str  the String to delete whitespace from, may be null
     * @return the String without whitespaces, {@code null} if null String input
     */
    public static String deleteWhitespace(final String str) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(8760);
        __CLR4_5_25lh5lhlvha79yz.R.inc(8761);if ((((isEmpty(str))&&(__CLR4_5_25lh5lhlvha79yz.R.iget(8762)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(8763)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(8764);return str;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(8765);final int sz = str.length();
        __CLR4_5_25lh5lhlvha79yz.R.inc(8766);final char[] chs = new char[sz];
        __CLR4_5_25lh5lhlvha79yz.R.inc(8767);int count = 0;
        __CLR4_5_25lh5lhlvha79yz.R.inc(8768);for (int i = 0; (((i < sz)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(8769)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(8770)==0&false)); i++) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(8771);if ((((!Character.isWhitespace(str.charAt(i)))&&(__CLR4_5_25lh5lhlvha79yz.R.iget(8772)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(8773)==0&false))) {{
                __CLR4_5_25lh5lhlvha79yz.R.inc(8774);chs[count++] = str.charAt(i);
            }
        }}
        }__CLR4_5_25lh5lhlvha79yz.R.inc(8775);if ((((count == sz)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(8776)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(8777)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(8778);return str;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(8779);return new String(chs, 0, count);
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    // Remove
    //-----------------------------------------------------------------------
    /**
     * <p>Removes a substring only if it is at the beginning of a source string,
     * otherwise returns the source string.</p>
     *
     * <p>A {@code null} source string will return {@code null}.
     * An empty ("") source string will return the empty string.
     * A {@code null} search string will return the source string.</p>
     *
     * <pre>
     * StringUtils.removeStart(null, *)      = null
     * StringUtils.removeStart("", *)        = ""
     * StringUtils.removeStart(*, null)      = *
     * StringUtils.removeStart("www.domain.com", "www.")   = "domain.com"
     * StringUtils.removeStart("domain.com", "www.")       = "domain.com"
     * StringUtils.removeStart("www.domain.com", "domain") = "www.domain.com"
     * StringUtils.removeStart("abc", "")    = "abc"
     * </pre>
     *
     * @param str  the source String to search, may be null
     * @param remove  the String to search for and remove, may be null
     * @return the substring with the string removed if found,
     *  {@code null} if null String input
     * @since 2.1
     */
    public static String removeStart(final String str, final String remove) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(8780);
        __CLR4_5_25lh5lhlvha79yz.R.inc(8781);if ((((isEmpty(str) || isEmpty(remove))&&(__CLR4_5_25lh5lhlvha79yz.R.iget(8782)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(8783)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(8784);return str;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(8785);if ((((str.startsWith(remove))&&(__CLR4_5_25lh5lhlvha79yz.R.iget(8786)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(8787)==0&false))){{
            __CLR4_5_25lh5lhlvha79yz.R.inc(8788);return str.substring(remove.length());
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(8789);return str;
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    /**
     * <p>Case insensitive removal of a substring if it is at the beginning of a source string,
     * otherwise returns the source string.</p>
     *
     * <p>A {@code null} source string will return {@code null}.
     * An empty ("") source string will return the empty string.
     * A {@code null} search string will return the source string.</p>
     *
     * <pre>
     * StringUtils.removeStartIgnoreCase(null, *)      = null
     * StringUtils.removeStartIgnoreCase("", *)        = ""
     * StringUtils.removeStartIgnoreCase(*, null)      = *
     * StringUtils.removeStartIgnoreCase("www.domain.com", "www.")   = "domain.com"
     * StringUtils.removeStartIgnoreCase("www.domain.com", "WWW.")   = "domain.com"
     * StringUtils.removeStartIgnoreCase("domain.com", "www.")       = "domain.com"
     * StringUtils.removeStartIgnoreCase("www.domain.com", "domain") = "www.domain.com"
     * StringUtils.removeStartIgnoreCase("abc", "")    = "abc"
     * </pre>
     *
     * @param str  the source String to search, may be null
     * @param remove  the String to search for (case insensitive) and remove, may be null
     * @return the substring with the string removed if found,
     *  {@code null} if null String input
     * @since 2.4
     */
    public static String removeStartIgnoreCase(final String str, final String remove) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(8790);
        __CLR4_5_25lh5lhlvha79yz.R.inc(8791);if ((((isEmpty(str) || isEmpty(remove))&&(__CLR4_5_25lh5lhlvha79yz.R.iget(8792)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(8793)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(8794);return str;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(8795);if ((((startsWithIgnoreCase(str, remove))&&(__CLR4_5_25lh5lhlvha79yz.R.iget(8796)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(8797)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(8798);return str.substring(remove.length());
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(8799);return str;
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    /**
     * <p>Removes a substring only if it is at the end of a source string,
     * otherwise returns the source string.</p>
     *
     * <p>A {@code null} source string will return {@code null}.
     * An empty ("") source string will return the empty string.
     * A {@code null} search string will return the source string.</p>
     *
     * <pre>
     * StringUtils.removeEnd(null, *)      = null
     * StringUtils.removeEnd("", *)        = ""
     * StringUtils.removeEnd(*, null)      = *
     * StringUtils.removeEnd("www.domain.com", ".com.")  = "www.domain.com"
     * StringUtils.removeEnd("www.domain.com", ".com")   = "www.domain"
     * StringUtils.removeEnd("www.domain.com", "domain") = "www.domain.com"
     * StringUtils.removeEnd("abc", "")    = "abc"
     * </pre>
     *
     * @param str  the source String to search, may be null
     * @param remove  the String to search for and remove, may be null
     * @return the substring with the string removed if found,
     *  {@code null} if null String input
     * @since 2.1
     */
    public static String removeEnd(final String str, final String remove) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(8800);
        __CLR4_5_25lh5lhlvha79yz.R.inc(8801);if ((((isEmpty(str) || isEmpty(remove))&&(__CLR4_5_25lh5lhlvha79yz.R.iget(8802)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(8803)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(8804);return str;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(8805);if ((((str.endsWith(remove))&&(__CLR4_5_25lh5lhlvha79yz.R.iget(8806)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(8807)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(8808);return str.substring(0, str.length() - remove.length());
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(8809);return str;
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    /**
     * <p>Case insensitive removal of a substring if it is at the end of a source string,
     * otherwise returns the source string.</p>
     *
     * <p>A {@code null} source string will return {@code null}.
     * An empty ("") source string will return the empty string.
     * A {@code null} search string will return the source string.</p>
     *
     * <pre>
     * StringUtils.removeEndIgnoreCase(null, *)      = null
     * StringUtils.removeEndIgnoreCase("", *)        = ""
     * StringUtils.removeEndIgnoreCase(*, null)      = *
     * StringUtils.removeEndIgnoreCase("www.domain.com", ".com.")  = "www.domain.com"
     * StringUtils.removeEndIgnoreCase("www.domain.com", ".com")   = "www.domain"
     * StringUtils.removeEndIgnoreCase("www.domain.com", "domain") = "www.domain.com"
     * StringUtils.removeEndIgnoreCase("abc", "")    = "abc"
     * StringUtils.removeEndIgnoreCase("www.domain.com", ".COM") = "www.domain")
     * StringUtils.removeEndIgnoreCase("www.domain.COM", ".com") = "www.domain")
     * </pre>
     *
     * @param str  the source String to search, may be null
     * @param remove  the String to search for (case insensitive) and remove, may be null
     * @return the substring with the string removed if found,
     *  {@code null} if null String input
     * @since 2.4
     */
    public static String removeEndIgnoreCase(final String str, final String remove) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(8810);
        __CLR4_5_25lh5lhlvha79yz.R.inc(8811);if ((((isEmpty(str) || isEmpty(remove))&&(__CLR4_5_25lh5lhlvha79yz.R.iget(8812)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(8813)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(8814);return str;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(8815);if ((((endsWithIgnoreCase(str, remove))&&(__CLR4_5_25lh5lhlvha79yz.R.iget(8816)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(8817)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(8818);return str.substring(0, str.length() - remove.length());
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(8819);return str;
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    /**
     * <p>Removes all occurrences of a substring from within the source string.</p>
     *
     * <p>A {@code null} source string will return {@code null}.
     * An empty ("") source string will return the empty string.
     * A {@code null} remove string will return the source string.
     * An empty ("") remove string will return the source string.</p>
     *
     * <pre>
     * StringUtils.remove(null, *)        = null
     * StringUtils.remove("", *)          = ""
     * StringUtils.remove(*, null)        = *
     * StringUtils.remove(*, "")          = *
     * StringUtils.remove("queued", "ue") = "qd"
     * StringUtils.remove("queued", "zz") = "queued"
     * </pre>
     *
     * @param str  the source String to search, may be null
     * @param remove  the String to search for and remove, may be null
     * @return the substring with the string removed if found,
     *  {@code null} if null String input
     * @since 2.1
     */
    public static String remove(final String str, final String remove) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(8820);
        __CLR4_5_25lh5lhlvha79yz.R.inc(8821);if ((((isEmpty(str) || isEmpty(remove))&&(__CLR4_5_25lh5lhlvha79yz.R.iget(8822)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(8823)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(8824);return str;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(8825);return replace(str, remove, EMPTY, -1);
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    /**
     * <p>
     * Case insensitive removal of all occurrences of a substring from within
     * the source string.
     * </p>
     *
     * <p>
     * A {@code null} source string will return {@code null}. An empty ("")
     * source string will return the empty string. A {@code null} remove string
     * will return the source string. An empty ("") remove string will return
     * the source string.
     * </p>
     *
     * <pre>
     * StringUtils.removeIgnoreCase(null, *)        = null
     * StringUtils.removeIgnoreCase("", *)          = ""
     * StringUtils.removeIgnoreCase(*, null)        = *
     * StringUtils.removeIgnoreCase(*, "")          = *
     * StringUtils.removeIgnoreCase("queued", "ue") = "qd"
     * StringUtils.removeIgnoreCase("queued", "zz") = "queued"
     * StringUtils.removeIgnoreCase("quEUed", "UE") = "qd"
     * StringUtils.removeIgnoreCase("queued", "zZ") = "queued"
     * </pre>
     *
     * @param str
     *            the source String to search, may be null
     * @param remove
     *            the String to search for (case insensitive) and remove, may be
     *            null
     * @return the substring with the string removed if found, {@code null} if
     *         null String input
     * @since 3.5
     */
    public static String removeIgnoreCase(final String str, final String remove) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(8826);
        __CLR4_5_25lh5lhlvha79yz.R.inc(8827);if ((((isEmpty(str) || isEmpty(remove))&&(__CLR4_5_25lh5lhlvha79yz.R.iget(8828)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(8829)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(8830);return str;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(8831);return replaceIgnoreCase(str, remove, EMPTY, -1);
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    /**
     * <p>Removes all occurrences of a character from within the source string.</p>
     *
     * <p>A {@code null} source string will return {@code null}.
     * An empty ("") source string will return the empty string.</p>
     *
     * <pre>
     * StringUtils.remove(null, *)       = null
     * StringUtils.remove("", *)         = ""
     * StringUtils.remove("queued", 'u') = "qeed"
     * StringUtils.remove("queued", 'z') = "queued"
     * </pre>
     *
     * @param str  the source String to search, may be null
     * @param remove  the char to search for and remove, may be null
     * @return the substring with the char removed if found,
     *  {@code null} if null String input
     * @since 2.1
     */
    public static String remove(final String str, final char remove) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(8832);
        __CLR4_5_25lh5lhlvha79yz.R.inc(8833);if ((((isEmpty(str) || str.indexOf(remove) == INDEX_NOT_FOUND)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(8834)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(8835)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(8836);return str;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(8837);final char[] chars = str.toCharArray();
        __CLR4_5_25lh5lhlvha79yz.R.inc(8838);int pos = 0;
        __CLR4_5_25lh5lhlvha79yz.R.inc(8839);for (int i = 0; (((i < chars.length)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(8840)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(8841)==0&false)); i++) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(8842);if ((((chars[i] != remove)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(8843)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(8844)==0&false))) {{
                __CLR4_5_25lh5lhlvha79yz.R.inc(8845);chars[pos++] = chars[i];
            }
        }}
        }__CLR4_5_25lh5lhlvha79yz.R.inc(8846);return new String(chars, 0, pos);
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    /**
     * <p>Removes each substring of the text String that matches the given regular expression.</p>
     *
     * This method is a {@code null} safe equivalent to:
     * <ul>
     *  <li>{@code text.replaceAll(regex, StringUtils.EMPTY)}</li>
     *  <li>{@code Pattern.compile(regex).matcher(text).replaceAll(StringUtils.EMPTY)}</li>
     * </ul>
     *
     * <p>A {@code null} reference passed to this method is a no-op.</p>
     *
     * <p>Unlike in the {@link #removePattern(String, String)} method, the {@link Pattern#DOTALL} option
     * is NOT automatically added.
     * To use the DOTALL option prepend <code>"(?s)"</code> to the regex.
     * DOTALL is also know as single-line mode in Perl.</p>
     *
     * <pre>
     * StringUtils.removeAll(null, *)      = null
     * StringUtils.removeAll("any", null)  = "any"
     * StringUtils.removeAll("any", "")    = "any"
     * StringUtils.removeAll("any", ".*")  = ""
     * StringUtils.removeAll("any", ".+")  = ""
     * StringUtils.removeAll("abc", ".?")  = ""
     * StringUtils.removeAll("A&lt;__&gt;\n&lt;__&gt;B", "&lt;.*&gt;")      = "A\nB"
     * StringUtils.removeAll("A&lt;__&gt;\n&lt;__&gt;B", "(?s)&lt;.*&gt;")  = "AB"
     * StringUtils.removeAll("ABCabc123abc", "[a-z]")     = "ABC123"
     * </pre>
     *
     * @param text  text to remove from, may be null
     * @param regex  the regular expression to which this string is to be matched
     * @return  the text with any removes processed,
     *              {@code null} if null String input
     *
     * @throws  java.util.regex.PatternSyntaxException
     *              if the regular expression's syntax is invalid
     *
     * @see #replaceAll(String, String, String)
     * @see #removePattern(String, String)
     * @see String#replaceAll(String, String)
     * @see java.util.regex.Pattern
     * @see java.util.regex.Pattern#DOTALL
     * @since 3.5
     */
    public static String removeAll(final String text, final String regex) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(8847);
        __CLR4_5_25lh5lhlvha79yz.R.inc(8848);return replaceAll(text, regex, StringUtils.EMPTY);
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    /**
     * <p>Removes the first substring of the text string that matches the given regular expression.</p>
     *
     * This method is a {@code null} safe equivalent to:
     * <ul>
     *  <li>{@code text.replaceFirst(regex, StringUtils.EMPTY)}</li>
     *  <li>{@code Pattern.compile(regex).matcher(text).replaceFirst(StringUtils.EMPTY)}</li>
     * </ul>
     *
     * <p>A {@code null} reference passed to this method is a no-op.</p>
     *
     * <p>The {@link Pattern#DOTALL} option is NOT automatically added.
     * To use the DOTALL option prepend <code>"(?s)"</code> to the regex.
     * DOTALL is also know as single-line mode in Perl.</p>
     *
     * <pre>
     * StringUtils.removeFirst(null, *)      = null
     * StringUtils.removeFirst("any", null)  = "any"
     * StringUtils.removeFirst("any", "")    = "any"
     * StringUtils.removeFirst("any", ".*")  = ""
     * StringUtils.removeFirst("any", ".+")  = ""
     * StringUtils.removeFirst("abc", ".?")  = "bc"
     * StringUtils.removeFirst("A&lt;__&gt;\n&lt;__&gt;B", "&lt;.*&gt;")      = "A\n&lt;__&gt;B"
     * StringUtils.removeFirst("A&lt;__&gt;\n&lt;__&gt;B", "(?s)&lt;.*&gt;")  = "AB"
     * StringUtils.removeFirst("ABCabc123", "[a-z]")          = "ABCbc123"
     * StringUtils.removeFirst("ABCabc123abc", "[a-z]+")      = "ABC123abc"
     * </pre>
     *
     * @param text  text to remove from, may be null
     * @param regex  the regular expression to which this string is to be matched
     * @return  the text with the first replacement processed,
     *              {@code null} if null String input
     *
     * @throws  java.util.regex.PatternSyntaxException
     *              if the regular expression's syntax is invalid
     *
     * @see #replaceFirst(String, String, String)
     * @see String#replaceFirst(String, String)
     * @see java.util.regex.Pattern
     * @see java.util.regex.Pattern#DOTALL
     * @since 3.5
     */
    public static String removeFirst(final String text, final String regex) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(8849);
        __CLR4_5_25lh5lhlvha79yz.R.inc(8850);return replaceFirst(text, regex, StringUtils.EMPTY);
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    // Replacing
    //-----------------------------------------------------------------------
    /**
     * <p>Replaces a String with another String inside a larger String, once.</p>
     *
     * <p>A {@code null} reference passed to this method is a no-op.</p>
     *
     * <pre>
     * StringUtils.replaceOnce(null, *, *)        = null
     * StringUtils.replaceOnce("", *, *)          = ""
     * StringUtils.replaceOnce("any", null, *)    = "any"
     * StringUtils.replaceOnce("any", *, null)    = "any"
     * StringUtils.replaceOnce("any", "", *)      = "any"
     * StringUtils.replaceOnce("aba", "a", null)  = "aba"
     * StringUtils.replaceOnce("aba", "a", "")    = "ba"
     * StringUtils.replaceOnce("aba", "a", "z")   = "zba"
     * </pre>
     *
     * @see #replace(String text, String searchString, String replacement, int max)
     * @param text  text to search and replace in, may be null
     * @param searchString  the String to search for, may be null
     * @param replacement  the String to replace with, may be null
     * @return the text with any replacements processed,
     *  {@code null} if null String input
     */
    public static String replaceOnce(final String text, final String searchString, final String replacement) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(8851);
        __CLR4_5_25lh5lhlvha79yz.R.inc(8852);return replace(text, searchString, replacement, 1);
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    /**
     * <p>Case insensitively replaces a String with another String inside a larger String, once.</p>
     *
     * <p>A {@code null} reference passed to this method is a no-op.</p>
     *
     * <pre>
     * StringUtils.replaceOnceIgnoreCase(null, *, *)        = null
     * StringUtils.replaceOnceIgnoreCase("", *, *)          = ""
     * StringUtils.replaceOnceIgnoreCase("any", null, *)    = "any"
     * StringUtils.replaceOnceIgnoreCase("any", *, null)    = "any"
     * StringUtils.replaceOnceIgnoreCase("any", "", *)      = "any"
     * StringUtils.replaceOnceIgnoreCase("aba", "a", null)  = "aba"
     * StringUtils.replaceOnceIgnoreCase("aba", "a", "")    = "ba"
     * StringUtils.replaceOnceIgnoreCase("aba", "a", "z")   = "zba"
     * StringUtils.replaceOnceIgnoreCase("FoOFoofoo", "foo", "") = "Foofoo"
     * </pre>
     *
     * @see #replaceIgnoreCase(String text, String searchString, String replacement, int max)
     * @param text  text to search and replace in, may be null
     * @param searchString  the String to search for (case insensitive), may be null
     * @param replacement  the String to replace with, may be null
     * @return the text with any replacements processed,
     *  {@code null} if null String input
     * @since 3.5
     */
    public static String replaceOnceIgnoreCase(final String text, final String searchString, final String replacement) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(8853);
        __CLR4_5_25lh5lhlvha79yz.R.inc(8854);return replaceIgnoreCase(text, searchString, replacement, 1);
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    /**
     * <p>Replaces each substring of the source String that matches the given regular expression with the given
     * replacement using the {@link Pattern#DOTALL} option. DOTALL is also know as single-line mode in Perl.</p>
     *
     * This call is a {@code null} safe equivalent to:
     * <ul>
     * <li>{@code source.replaceAll(&quot;(?s)&quot; + regex, replacement)}</li>
     * <li>{@code Pattern.compile(regex, Pattern.DOTALL).matcher(source).replaceAll(replacement)}</li>
     * </ul>
     *
     * <p>A {@code null} reference passed to this method is a no-op.</p>
     *
     * <pre>
     * StringUtils.replacePattern(null, *, *)       = null
     * StringUtils.replacePattern("any", null, *)   = "any"
     * StringUtils.replacePattern("any", *, null)   = "any"
     * StringUtils.replacePattern("", "", "zzz")    = "zzz"
     * StringUtils.replacePattern("", ".*", "zzz")  = "zzz"
     * StringUtils.replacePattern("", ".+", "zzz")  = ""
     * StringUtils.replacePattern("&lt;__&gt;\n&lt;__&gt;", "&lt;.*&gt;", "z")       = "z"
     * StringUtils.replacePattern("ABCabc123", "[a-z]", "_")       = "ABC___123"
     * StringUtils.replacePattern("ABCabc123", "[^A-Z0-9]+", "_")  = "ABC_123"
     * StringUtils.replacePattern("ABCabc123", "[^A-Z0-9]+", "")   = "ABC123"
     * StringUtils.replacePattern("Lorem ipsum  dolor   sit", "( +)([a-z]+)", "_$2")  = "Lorem_ipsum_dolor_sit"
     * </pre>
     *
     * @param source
     *            the source string
     * @param regex
     *            the regular expression to which this string is to be matched
     * @param replacement
     *            the string to be substituted for each match
     * @return The resulting {@code String}
     * @see #replaceAll(String, String, String)
     * @see String#replaceAll(String, String)
     * @see Pattern#DOTALL
     * @since 3.2
     * @since 3.5 Changed {@code null} reference passed to this method is a no-op.
     */
    public static String replacePattern(final String source, final String regex, final String replacement) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(8855);
        __CLR4_5_25lh5lhlvha79yz.R.inc(8856);if ((((source == null || regex == null || replacement == null)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(8857)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(8858)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(8859);return source;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(8860);return Pattern.compile(regex, Pattern.DOTALL).matcher(source).replaceAll(replacement);
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    /**
     * <p>Removes each substring of the source String that matches the given regular expression using the DOTALL option.
     * </p>
     *
     * This call is a {@code null} safe equivalent to:
     * <ul>
     * <li>{@code source.replaceAll(&quot;(?s)&quot; + regex, StringUtils.EMPTY)}</li>
     * <li>{@code Pattern.compile(regex, Pattern.DOTALL).matcher(source).replaceAll(StringUtils.EMPTY)}</li>
     * </ul>
     *
     * <p>A {@code null} reference passed to this method is a no-op.</p>
     *
     * <pre>
     * StringUtils.removePattern(null, *)       = null
     * StringUtils.removePattern("any", null)   = "any"
     * StringUtils.removePattern("A&lt;__&gt;\n&lt;__&gt;B", "&lt;.*&gt;")  = "AB"
     * StringUtils.removePattern("ABCabc123", "[a-z]")    = "ABC123"
     * </pre>
     *
     * @param source
     *            the source string
     * @param regex
     *            the regular expression to which this string is to be matched
     * @return The resulting {@code String}
     * @see #replacePattern(String, String, String)
     * @see String#replaceAll(String, String)
     * @see Pattern#DOTALL
     * @since 3.2
     * @since 3.5 Changed {@code null} reference passed to this method is a no-op.
     */
    public static String removePattern(final String source, final String regex) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(8861);
        __CLR4_5_25lh5lhlvha79yz.R.inc(8862);return replacePattern(source, regex, StringUtils.EMPTY);
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    /**
     * <p>Replaces each substring of the text String that matches the given regular expression
     * with the given replacement.</p>
     *
     * This method is a {@code null} safe equivalent to:
     * <ul>
     *  <li>{@code text.replaceAll(regex, replacement)}</li>
     *  <li>{@code Pattern.compile(regex).matcher(text).replaceAll(replacement)}</li>
     * </ul>
     *
     * <p>A {@code null} reference passed to this method is a no-op.</p>
     *
     * <p>Unlike in the {@link #replacePattern(String, String, String)} method, the {@link Pattern#DOTALL} option
     * is NOT automatically added.
     * To use the DOTALL option prepend <code>"(?s)"</code> to the regex.
     * DOTALL is also know as single-line mode in Perl.</p>
     *
     * <pre>
     * StringUtils.replaceAll(null, *, *)       = null
     * StringUtils.replaceAll("any", null, *)   = "any"
     * StringUtils.replaceAll("any", *, null)   = "any"
     * StringUtils.replaceAll("", "", "zzz")    = "zzz"
     * StringUtils.replaceAll("", ".*", "zzz")  = "zzz"
     * StringUtils.replaceAll("", ".+", "zzz")  = ""
     * StringUtils.replaceAll("abc", "", "ZZ")  = "ZZaZZbZZcZZ"
     * StringUtils.replaceAll("&lt;__&gt;\n&lt;__&gt;", "&lt;.*&gt;", "z")      = "z\nz"
     * StringUtils.replaceAll("&lt;__&gt;\n&lt;__&gt;", "(?s)&lt;.*&gt;", "z")  = "z"
     * StringUtils.replaceAll("ABCabc123", "[a-z]", "_")       = "ABC___123"
     * StringUtils.replaceAll("ABCabc123", "[^A-Z0-9]+", "_")  = "ABC_123"
     * StringUtils.replaceAll("ABCabc123", "[^A-Z0-9]+", "")   = "ABC123"
     * StringUtils.replaceAll("Lorem ipsum  dolor   sit", "( +)([a-z]+)", "_$2")  = "Lorem_ipsum_dolor_sit"
     * </pre>
     *
     * @param text  text to search and replace in, may be null
     * @param regex  the regular expression to which this string is to be matched
     * @param replacement  the string to be substituted for each match
     * @return  the text with any replacements processed,
     *              {@code null} if null String input
     *
     * @throws  java.util.regex.PatternSyntaxException
     *              if the regular expression's syntax is invalid
     *
     * @see #replacePattern(String, String, String)
     * @see String#replaceAll(String, String)
     * @see java.util.regex.Pattern
     * @see java.util.regex.Pattern#DOTALL
     * @since 3.5
     */
    public static String replaceAll(final String text, final String regex, final String replacement) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(8863);
        __CLR4_5_25lh5lhlvha79yz.R.inc(8864);if ((((text == null || regex == null|| replacement == null )&&(__CLR4_5_25lh5lhlvha79yz.R.iget(8865)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(8866)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(8867);return text;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(8868);return text.replaceAll(regex, replacement);
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    /**
     * <p>Replaces the first substring of the text string that matches the given regular expression
     * with the given replacement.</p>
     *
     * This method is a {@code null} safe equivalent to:
     * <ul>
     *  <li>{@code text.replaceFirst(regex, replacement)}</li>
     *  <li>{@code Pattern.compile(regex).matcher(text).replaceFirst(replacement)}</li>
     * </ul>
     *
     * <p>A {@code null} reference passed to this method is a no-op.</p>
     *
     * <p>The {@link Pattern#DOTALL} option is NOT automatically added.
     * To use the DOTALL option prepend <code>"(?s)"</code> to the regex.
     * DOTALL is also know as single-line mode in Perl.</p>
     *
     * <pre>
     * StringUtils.replaceFirst(null, *, *)       = null
     * StringUtils.replaceFirst("any", null, *)   = "any"
     * StringUtils.replaceFirst("any", *, null)   = "any"
     * StringUtils.replaceFirst("", "", "zzz")    = "zzz"
     * StringUtils.replaceFirst("", ".*", "zzz")  = "zzz"
     * StringUtils.replaceFirst("", ".+", "zzz")  = ""
     * StringUtils.replaceFirst("abc", "", "ZZ")  = "ZZabc"
     * StringUtils.replaceFirst("&lt;__&gt;\n&lt;__&gt;", "&lt;.*&gt;", "z")      = "z\n&lt;__&gt;"
     * StringUtils.replaceFirst("&lt;__&gt;\n&lt;__&gt;", "(?s)&lt;.*&gt;", "z")  = "z"
     * StringUtils.replaceFirst("ABCabc123", "[a-z]", "_")          = "ABC_bc123"
     * StringUtils.replaceFirst("ABCabc123abc", "[^A-Z0-9]+", "_")  = "ABC_123abc"
     * StringUtils.replaceFirst("ABCabc123abc", "[^A-Z0-9]+", "")   = "ABC123abc"
     * StringUtils.replaceFirst("Lorem ipsum  dolor   sit", "( +)([a-z]+)", "_$2")  = "Lorem_ipsum  dolor   sit"
     * </pre>
     *
     * @param text  text to search and replace in, may be null
     * @param regex  the regular expression to which this string is to be matched
     * @param replacement  the string to be substituted for the first match
     * @return  the text with the first replacement processed,
     *              {@code null} if null String input
     *
     * @throws  java.util.regex.PatternSyntaxException
     *              if the regular expression's syntax is invalid
     *
     * @see String#replaceFirst(String, String)
     * @see java.util.regex.Pattern
     * @see java.util.regex.Pattern#DOTALL
     * @since 3.5
     */
    public static String replaceFirst(final String text, final String regex, final String replacement) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(8869);
        __CLR4_5_25lh5lhlvha79yz.R.inc(8870);if ((((text == null || regex == null|| replacement == null )&&(__CLR4_5_25lh5lhlvha79yz.R.iget(8871)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(8872)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(8873);return text;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(8874);return text.replaceFirst(regex, replacement);
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    /**
     * <p>Replaces all occurrences of a String within another String.</p>
     *
     * <p>A {@code null} reference passed to this method is a no-op.</p>
     *
     * <pre>
     * StringUtils.replace(null, *, *)        = null
     * StringUtils.replace("", *, *)          = ""
     * StringUtils.replace("any", null, *)    = "any"
     * StringUtils.replace("any", *, null)    = "any"
     * StringUtils.replace("any", "", *)      = "any"
     * StringUtils.replace("aba", "a", null)  = "aba"
     * StringUtils.replace("aba", "a", "")    = "b"
     * StringUtils.replace("aba", "a", "z")   = "zbz"
     * </pre>
     *
     * @see #replace(String text, String searchString, String replacement, int max)
     * @param text  text to search and replace in, may be null
     * @param searchString  the String to search for, may be null
     * @param replacement  the String to replace it with, may be null
     * @return the text with any replacements processed,
     *  {@code null} if null String input
     */
    public static String replace(final String text, final String searchString, final String replacement) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(8875);
        __CLR4_5_25lh5lhlvha79yz.R.inc(8876);return replace(text, searchString, replacement, -1);
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    /**
    * <p>Case insensitively replaces all occurrences of a String within another String.</p>
    *
    * <p>A {@code null} reference passed to this method is a no-op.</p>
    *
    * <pre>
    * StringUtils.replaceIgnoreCase(null, *, *)        = null
    * StringUtils.replaceIgnoreCase("", *, *)          = ""
    * StringUtils.replaceIgnoreCase("any", null, *)    = "any"
    * StringUtils.replaceIgnoreCase("any", *, null)    = "any"
    * StringUtils.replaceIgnoreCase("any", "", *)      = "any"
    * StringUtils.replaceIgnoreCase("aba", "a", null)  = "aba"
    * StringUtils.replaceIgnoreCase("abA", "A", "")    = "b"
    * StringUtils.replaceIgnoreCase("aba", "A", "z")   = "zbz"
    * </pre>
    *
    * @see #replaceIgnoreCase(String text, String searchString, String replacement, int max)
    * @param text  text to search and replace in, may be null
    * @param searchString  the String to search for (case insensitive), may be null
    * @param replacement  the String to replace it with, may be null
    * @return the text with any replacements processed,
    *  {@code null} if null String input
    * @since 3.5
    */
   public static String replaceIgnoreCase(final String text, final String searchString, final String replacement) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(8877);
       __CLR4_5_25lh5lhlvha79yz.R.inc(8878);return replaceIgnoreCase(text, searchString, replacement, -1);
   }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    /**
     * <p>Replaces a String with another String inside a larger String,
     * for the first {@code max} values of the search String.</p>
     *
     * <p>A {@code null} reference passed to this method is a no-op.</p>
     *
     * <pre>
     * StringUtils.replace(null, *, *, *)         = null
     * StringUtils.replace("", *, *, *)           = ""
     * StringUtils.replace("any", null, *, *)     = "any"
     * StringUtils.replace("any", *, null, *)     = "any"
     * StringUtils.replace("any", "", *, *)       = "any"
     * StringUtils.replace("any", *, *, 0)        = "any"
     * StringUtils.replace("abaa", "a", null, -1) = "abaa"
     * StringUtils.replace("abaa", "a", "", -1)   = "b"
     * StringUtils.replace("abaa", "a", "z", 0)   = "abaa"
     * StringUtils.replace("abaa", "a", "z", 1)   = "zbaa"
     * StringUtils.replace("abaa", "a", "z", 2)   = "zbza"
     * StringUtils.replace("abaa", "a", "z", -1)  = "zbzz"
     * </pre>
     *
     * @param text  text to search and replace in, may be null
     * @param searchString  the String to search for, may be null
     * @param replacement  the String to replace it with, may be null
     * @param max  maximum number of values to replace, or {@code -1} if no maximum
     * @return the text with any replacements processed,
     *  {@code null} if null String input
     */
    public static String replace(final String text, final String searchString, final String replacement, final int max) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(8879);
        __CLR4_5_25lh5lhlvha79yz.R.inc(8880);return replace(text, searchString, replacement, max, false);
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    /**
     * <p>Replaces a String with another String inside a larger String,
     * for the first {@code max} values of the search String, 
     * case sensitively/insensisitively based on {@code ignoreCase} value.</p>
     *
     * <p>A {@code null} reference passed to this method is a no-op.</p>
     *
     * <pre>
     * StringUtils.replace(null, *, *, *, false)         = null
     * StringUtils.replace("", *, *, *, false)           = ""
     * StringUtils.replace("any", null, *, *, false)     = "any"
     * StringUtils.replace("any", *, null, *, false)     = "any"
     * StringUtils.replace("any", "", *, *, false)       = "any"
     * StringUtils.replace("any", *, *, 0, false)        = "any"
     * StringUtils.replace("abaa", "a", null, -1, false) = "abaa"
     * StringUtils.replace("abaa", "a", "", -1, false)   = "b"
     * StringUtils.replace("abaa", "a", "z", 0, false)   = "abaa"
     * StringUtils.replace("abaa", "A", "z", 1, false)   = "abaa"
     * StringUtils.replace("abaa", "A", "z", 1, true)   = "zbaa"
     * StringUtils.replace("abAa", "a", "z", 2, true)   = "zbza"
     * StringUtils.replace("abAa", "a", "z", -1, true)  = "zbzz"
     * </pre>
     *
     * @param text  text to search and replace in, may be null
     * @param searchString  the String to search for (case insensitive), may be null
     * @param replacement  the String to replace it with, may be null
     * @param max  maximum number of values to replace, or {@code -1} if no maximum
     * @param ignoreCase if true replace is case insensitive, otherwise case sensitive
     * @return the text with any replacements processed,
     *  {@code null} if null String input
     */
     private static String replace(final String text, String searchString, final String replacement, int max, final boolean ignoreCase) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(8881);
         __CLR4_5_25lh5lhlvha79yz.R.inc(8882);if ((((isEmpty(text) || isEmpty(searchString) || replacement == null || max == 0)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(8883)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(8884)==0&false))) {{
             __CLR4_5_25lh5lhlvha79yz.R.inc(8885);return text;
         }
         }__CLR4_5_25lh5lhlvha79yz.R.inc(8886);String searchText = text;
         __CLR4_5_25lh5lhlvha79yz.R.inc(8887);if ((((ignoreCase)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(8888)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(8889)==0&false))) {{
             __CLR4_5_25lh5lhlvha79yz.R.inc(8890);searchText = text.toLowerCase();
             __CLR4_5_25lh5lhlvha79yz.R.inc(8891);searchString = searchString.toLowerCase();
         }
         }__CLR4_5_25lh5lhlvha79yz.R.inc(8892);int start = 0;
         __CLR4_5_25lh5lhlvha79yz.R.inc(8893);int end = searchText.indexOf(searchString, start);
         __CLR4_5_25lh5lhlvha79yz.R.inc(8894);if ((((end == INDEX_NOT_FOUND)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(8895)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(8896)==0&false))) {{
             __CLR4_5_25lh5lhlvha79yz.R.inc(8897);return text;
         }
         }__CLR4_5_25lh5lhlvha79yz.R.inc(8898);final int replLength = searchString.length();
         __CLR4_5_25lh5lhlvha79yz.R.inc(8899);int increase = replacement.length() - replLength;
         __CLR4_5_25lh5lhlvha79yz.R.inc(8900);increase = (((increase < 0 )&&(__CLR4_5_25lh5lhlvha79yz.R.iget(8901)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(8902)==0&false))? 0 : increase;
         __CLR4_5_25lh5lhlvha79yz.R.inc(8903);increase *= (((max < 0 )&&(__CLR4_5_25lh5lhlvha79yz.R.iget(8904)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(8905)==0&false))? 16 : (((max > 64 )&&(__CLR4_5_25lh5lhlvha79yz.R.iget(8906)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(8907)==0&false))? 64 : max;
         __CLR4_5_25lh5lhlvha79yz.R.inc(8908);final StringBuilder buf = new StringBuilder(text.length() + increase);
         __CLR4_5_25lh5lhlvha79yz.R.inc(8909);while ((((end != INDEX_NOT_FOUND)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(8910)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(8911)==0&false))) {{
             __CLR4_5_25lh5lhlvha79yz.R.inc(8912);buf.append(text.substring(start, end)).append(replacement);
             __CLR4_5_25lh5lhlvha79yz.R.inc(8913);start = end + replLength;
             __CLR4_5_25lh5lhlvha79yz.R.inc(8914);if ((((--max == 0)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(8915)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(8916)==0&false))) {{
                 __CLR4_5_25lh5lhlvha79yz.R.inc(8917);break;
             }
             }__CLR4_5_25lh5lhlvha79yz.R.inc(8918);end = searchText.indexOf(searchString, start);
         }
         }__CLR4_5_25lh5lhlvha79yz.R.inc(8919);buf.append(text.substring(start));
         __CLR4_5_25lh5lhlvha79yz.R.inc(8920);return buf.toString();
     }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    /**
     * <p>Case insensitively replaces a String with another String inside a larger String,
     * for the first {@code max} values of the search String.</p>
     *
     * <p>A {@code null} reference passed to this method is a no-op.</p>
     *
     * <pre>
     * StringUtils.replaceIgnoreCase(null, *, *, *)         = null
     * StringUtils.replaceIgnoreCase("", *, *, *)           = ""
     * StringUtils.replaceIgnoreCase("any", null, *, *)     = "any"
     * StringUtils.replaceIgnoreCase("any", *, null, *)     = "any"
     * StringUtils.replaceIgnoreCase("any", "", *, *)       = "any"
     * StringUtils.replaceIgnoreCase("any", *, *, 0)        = "any"
     * StringUtils.replaceIgnoreCase("abaa", "a", null, -1) = "abaa"
     * StringUtils.replaceIgnoreCase("abaa", "a", "", -1)   = "b"
     * StringUtils.replaceIgnoreCase("abaa", "a", "z", 0)   = "abaa"
     * StringUtils.replaceIgnoreCase("abaa", "A", "z", 1)   = "zbaa"
     * StringUtils.replaceIgnoreCase("abAa", "a", "z", 2)   = "zbza"
     * StringUtils.replaceIgnoreCase("abAa", "a", "z", -1)  = "zbzz"
     * </pre>
     *
     * @param text  text to search and replace in, may be null
     * @param searchString  the String to search for (case insensitive), may be null
     * @param replacement  the String to replace it with, may be null
     * @param max  maximum number of values to replace, or {@code -1} if no maximum
     * @return the text with any replacements processed,
     *  {@code null} if null String input
     * @since 3.5
     */
    public static String replaceIgnoreCase(final String text, final String searchString, final String replacement, final int max) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(8921);
        __CLR4_5_25lh5lhlvha79yz.R.inc(8922);return replace(text, searchString, replacement, max, true);
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    /**
     * <p>
     * Replaces all occurrences of Strings within another String.
     * </p>
     *
     * <p>
     * A {@code null} reference passed to this method is a no-op, or if
     * any "search string" or "string to replace" is null, that replace will be
     * ignored. This will not repeat. For repeating replaces, call the
     * overloaded method.
     * </p>
     *
     * <pre>
     *  StringUtils.replaceEach(null, *, *)        = null
     *  StringUtils.replaceEach("", *, *)          = ""
     *  StringUtils.replaceEach("aba", null, null) = "aba"
     *  StringUtils.replaceEach("aba", new String[0], null) = "aba"
     *  StringUtils.replaceEach("aba", null, new String[0]) = "aba"
     *  StringUtils.replaceEach("aba", new String[]{"a"}, null)  = "aba"
     *  StringUtils.replaceEach("aba", new String[]{"a"}, new String[]{""})  = "b"
     *  StringUtils.replaceEach("aba", new String[]{null}, new String[]{"a"})  = "aba"
     *  StringUtils.replaceEach("abcde", new String[]{"ab", "d"}, new String[]{"w", "t"})  = "wcte"
     *  (example of how it does not repeat)
     *  StringUtils.replaceEach("abcde", new String[]{"ab", "d"}, new String[]{"d", "t"})  = "dcte"
     * </pre>
     *
     * @param text
     *            text to search and replace in, no-op if null
     * @param searchList
     *            the Strings to search for, no-op if null
     * @param replacementList
     *            the Strings to replace them with, no-op if null
     * @return the text with any replacements processed, {@code null} if
     *         null String input
     * @throws IllegalArgumentException
     *             if the lengths of the arrays are not the same (null is ok,
     *             and/or size 0)
     * @since 2.4
     */
    public static String replaceEach(final String text, final String[] searchList, final String[] replacementList) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(8923);
        __CLR4_5_25lh5lhlvha79yz.R.inc(8924);return replaceEach(text, searchList, replacementList, false, 0);
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    /**
     * <p>
     * Replaces all occurrences of Strings within another String.
     * </p>
     *
     * <p>
     * A {@code null} reference passed to this method is a no-op, or if
     * any "search string" or "string to replace" is null, that replace will be
     * ignored.
     * </p>
     *
     * <pre>
     *  StringUtils.replaceEachRepeatedly(null, *, *) = null
     *  StringUtils.replaceEachRepeatedly("", *, *) = ""
     *  StringUtils.replaceEachRepeatedly("aba", null, null) = "aba"
     *  StringUtils.replaceEachRepeatedly("aba", new String[0], null) = "aba"
     *  StringUtils.replaceEachRepeatedly("aba", null, new String[0]) = "aba"
     *  StringUtils.replaceEachRepeatedly("aba", new String[]{"a"}, null) = "aba"
     *  StringUtils.replaceEachRepeatedly("aba", new String[]{"a"}, new String[]{""}) = "b"
     *  StringUtils.replaceEachRepeatedly("aba", new String[]{null}, new String[]{"a"}) = "aba"
     *  StringUtils.replaceEachRepeatedly("abcde", new String[]{"ab", "d"}, new String[]{"w", "t"}) = "wcte"
     *  (example of how it repeats)
     *  StringUtils.replaceEachRepeatedly("abcde", new String[]{"ab", "d"}, new String[]{"d", "t"}) = "tcte"
     *  StringUtils.replaceEachRepeatedly("abcde", new String[]{"ab", "d"}, new String[]{"d", "ab"}) = IllegalStateException
     * </pre>
     *
     * @param text
     *            text to search and replace in, no-op if null
     * @param searchList
     *            the Strings to search for, no-op if null
     * @param replacementList
     *            the Strings to replace them with, no-op if null
     * @return the text with any replacements processed, {@code null} if
     *         null String input
     * @throws IllegalStateException
     *             if the search is repeating and there is an endless loop due
     *             to outputs of one being inputs to another
     * @throws IllegalArgumentException
     *             if the lengths of the arrays are not the same (null is ok,
     *             and/or size 0)
     * @since 2.4
     */
    public static String replaceEachRepeatedly(final String text, final String[] searchList, final String[] replacementList) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(8925);
        // timeToLive should be 0 if not used or nothing to replace, else it's
        // the length of the replace array
        __CLR4_5_25lh5lhlvha79yz.R.inc(8926);final int timeToLive = (((searchList == null )&&(__CLR4_5_25lh5lhlvha79yz.R.iget(8927)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(8928)==0&false))? 0 : searchList.length;
        __CLR4_5_25lh5lhlvha79yz.R.inc(8929);return replaceEach(text, searchList, replacementList, true, timeToLive);
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    /**
     * <p>
     * Replace all occurrences of Strings within another String.
     * This is a private recursive helper method for {@link #replaceEachRepeatedly(String, String[], String[])} and
     * {@link #replaceEach(String, String[], String[])}
     * </p>
     *
     * <p>
     * A {@code null} reference passed to this method is a no-op, or if
     * any "search string" or "string to replace" is null, that replace will be
     * ignored.
     * </p>
     *
     * <pre>
     *  StringUtils.replaceEach(null, *, *, *, *) = null
     *  StringUtils.replaceEach("", *, *, *, *) = ""
     *  StringUtils.replaceEach("aba", null, null, *, *) = "aba"
     *  StringUtils.replaceEach("aba", new String[0], null, *, *) = "aba"
     *  StringUtils.replaceEach("aba", null, new String[0], *, *) = "aba"
     *  StringUtils.replaceEach("aba", new String[]{"a"}, null, *, *) = "aba"
     *  StringUtils.replaceEach("aba", new String[]{"a"}, new String[]{""}, *, >=0) = "b"
     *  StringUtils.replaceEach("aba", new String[]{null}, new String[]{"a"}, *, >=0) = "aba"
     *  StringUtils.replaceEach("abcde", new String[]{"ab", "d"}, new String[]{"w", "t"}, *, >=0) = "wcte"
     *  (example of how it repeats)
     *  StringUtils.replaceEach("abcde", new String[]{"ab", "d"}, new String[]{"d", "t"}, false, >=0) = "dcte"
     *  StringUtils.replaceEach("abcde", new String[]{"ab", "d"}, new String[]{"d", "t"}, true, >=2) = "tcte"
     *  StringUtils.replaceEach("abcde", new String[]{"ab", "d"}, new String[]{"d", "ab"}, *, *) = IllegalStateException
     * </pre>
     *
     * @param text
     *            text to search and replace in, no-op if null
     * @param searchList
     *            the Strings to search for, no-op if null
     * @param replacementList
     *            the Strings to replace them with, no-op if null
     * @param repeat if true, then replace repeatedly
     *       until there are no more possible replacements or timeToLive < 0
     * @param timeToLive
     *            if less than 0 then there is a circular reference and endless
     *            loop
     * @return the text with any replacements processed, {@code null} if
     *         null String input
     * @throws IllegalStateException
     *             if the search is repeating and there is an endless loop due
     *             to outputs of one being inputs to another
     * @throws IllegalArgumentException
     *             if the lengths of the arrays are not the same (null is ok,
     *             and/or size 0)
     * @since 2.4
     */
    private static String replaceEach(
            final String text, final String[] searchList, final String[] replacementList, final boolean repeat, final int timeToLive) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(8930);

        // mchyzer Performance note: This creates very few new objects (one major goal)
        // let me know if there are performance requests, we can create a harness to measure

        __CLR4_5_25lh5lhlvha79yz.R.inc(8931);if ((((text == null || text.isEmpty() || searchList == null ||
                searchList.length == 0 || replacementList == null || replacementList.length == 0)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(8932)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(8933)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(8934);return text;
        }

        // if recursing, this shouldn't be less than 0
        }__CLR4_5_25lh5lhlvha79yz.R.inc(8935);if ((((timeToLive < 0)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(8936)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(8937)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(8938);throw new IllegalStateException("Aborting to protect against StackOverflowError - " +
                                            "output of one loop is the input of another");
        }

        }__CLR4_5_25lh5lhlvha79yz.R.inc(8939);final int searchLength = searchList.length;
        __CLR4_5_25lh5lhlvha79yz.R.inc(8940);final int replacementLength = replacementList.length;

        // make sure lengths are ok, these need to be equal
        __CLR4_5_25lh5lhlvha79yz.R.inc(8941);if ((((searchLength != replacementLength)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(8942)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(8943)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(8944);throw new IllegalArgumentException("Search and Replace array lengths don't match: "
                + searchLength
                + " vs "
                + replacementLength);
        }

        // keep track of which still have matches
        }__CLR4_5_25lh5lhlvha79yz.R.inc(8945);final boolean[] noMoreMatchesForReplIndex = new boolean[searchLength];

        // index on index that the match was found
        __CLR4_5_25lh5lhlvha79yz.R.inc(8946);int textIndex = -1;
        __CLR4_5_25lh5lhlvha79yz.R.inc(8947);int replaceIndex = -1;
        __CLR4_5_25lh5lhlvha79yz.R.inc(8948);int tempIndex = -1;

        // index of replace array that will replace the search string found
        // NOTE: logic duplicated below START
        __CLR4_5_25lh5lhlvha79yz.R.inc(8949);for (int i = 0; (((i < searchLength)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(8950)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(8951)==0&false)); i++) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(8952);if ((((noMoreMatchesForReplIndex[i] || searchList[i] == null ||
                    searchList[i].isEmpty() || replacementList[i] == null)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(8953)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(8954)==0&false))) {{
                __CLR4_5_25lh5lhlvha79yz.R.inc(8955);continue;
            }
            }__CLR4_5_25lh5lhlvha79yz.R.inc(8956);tempIndex = text.indexOf(searchList[i]);

            // see if we need to keep searching for this
            __CLR4_5_25lh5lhlvha79yz.R.inc(8957);if ((((tempIndex == -1)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(8958)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(8959)==0&false))) {{
                __CLR4_5_25lh5lhlvha79yz.R.inc(8960);noMoreMatchesForReplIndex[i] = true;
            } }else {{
                __CLR4_5_25lh5lhlvha79yz.R.inc(8961);if ((((textIndex == -1 || tempIndex < textIndex)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(8962)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(8963)==0&false))) {{
                    __CLR4_5_25lh5lhlvha79yz.R.inc(8964);textIndex = tempIndex;
                    __CLR4_5_25lh5lhlvha79yz.R.inc(8965);replaceIndex = i;
                }
            }}
        }}
        // NOTE: logic mostly below END

        // no search strings found, we are done
        }__CLR4_5_25lh5lhlvha79yz.R.inc(8966);if ((((textIndex == -1)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(8967)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(8968)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(8969);return text;
        }

        }__CLR4_5_25lh5lhlvha79yz.R.inc(8970);int start = 0;

        // get a good guess on the size of the result buffer so it doesn't have to double if it goes over a bit
        __CLR4_5_25lh5lhlvha79yz.R.inc(8971);int increase = 0;

        // count the replacement text elements that are larger than their corresponding text being replaced
        __CLR4_5_25lh5lhlvha79yz.R.inc(8972);for (int i = 0; (((i < searchList.length)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(8973)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(8974)==0&false)); i++) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(8975);if ((((searchList[i] == null || replacementList[i] == null)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(8976)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(8977)==0&false))) {{
                __CLR4_5_25lh5lhlvha79yz.R.inc(8978);continue;
            }
            }__CLR4_5_25lh5lhlvha79yz.R.inc(8979);final int greater = replacementList[i].length() - searchList[i].length();
            __CLR4_5_25lh5lhlvha79yz.R.inc(8980);if ((((greater > 0)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(8981)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(8982)==0&false))) {{
                __CLR4_5_25lh5lhlvha79yz.R.inc(8983);increase += 3 * greater; // assume 3 matches
            }
        }}
        // have upper-bound at 20% increase, then let Java take over
        }__CLR4_5_25lh5lhlvha79yz.R.inc(8984);increase = Math.min(increase, text.length() / 5);

        __CLR4_5_25lh5lhlvha79yz.R.inc(8985);final StringBuilder buf = new StringBuilder(text.length() + increase);

        __CLR4_5_25lh5lhlvha79yz.R.inc(8986);while ((((textIndex != -1)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(8987)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(8988)==0&false))) {{

            __CLR4_5_25lh5lhlvha79yz.R.inc(8989);for (int i = start; (((i < textIndex)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(8990)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(8991)==0&false)); i++) {{
                __CLR4_5_25lh5lhlvha79yz.R.inc(8992);buf.append(text.charAt(i));
            }
            }__CLR4_5_25lh5lhlvha79yz.R.inc(8993);buf.append(replacementList[replaceIndex]);

            __CLR4_5_25lh5lhlvha79yz.R.inc(8994);start = textIndex + searchList[replaceIndex].length();

            __CLR4_5_25lh5lhlvha79yz.R.inc(8995);textIndex = -1;
            __CLR4_5_25lh5lhlvha79yz.R.inc(8996);replaceIndex = -1;
            __CLR4_5_25lh5lhlvha79yz.R.inc(8997);tempIndex = -1;
            // find the next earliest match
            // NOTE: logic mostly duplicated above START
            __CLR4_5_25lh5lhlvha79yz.R.inc(8998);for (int i = 0; (((i < searchLength)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(8999)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(9000)==0&false)); i++) {{
                __CLR4_5_25lh5lhlvha79yz.R.inc(9001);if ((((noMoreMatchesForReplIndex[i] || searchList[i] == null ||
                        searchList[i].isEmpty() || replacementList[i] == null)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(9002)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(9003)==0&false))) {{
                    __CLR4_5_25lh5lhlvha79yz.R.inc(9004);continue;
                }
                }__CLR4_5_25lh5lhlvha79yz.R.inc(9005);tempIndex = text.indexOf(searchList[i], start);

                // see if we need to keep searching for this
                __CLR4_5_25lh5lhlvha79yz.R.inc(9006);if ((((tempIndex == -1)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(9007)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(9008)==0&false))) {{
                    __CLR4_5_25lh5lhlvha79yz.R.inc(9009);noMoreMatchesForReplIndex[i] = true;
                } }else {{
                    __CLR4_5_25lh5lhlvha79yz.R.inc(9010);if ((((textIndex == -1 || tempIndex < textIndex)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(9011)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(9012)==0&false))) {{
                        __CLR4_5_25lh5lhlvha79yz.R.inc(9013);textIndex = tempIndex;
                        __CLR4_5_25lh5lhlvha79yz.R.inc(9014);replaceIndex = i;
                    }
                }}
            }}
            // NOTE: logic duplicated above END

        }}
        }__CLR4_5_25lh5lhlvha79yz.R.inc(9015);final int textLength = text.length();
        __CLR4_5_25lh5lhlvha79yz.R.inc(9016);for (int i = start; (((i < textLength)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(9017)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(9018)==0&false)); i++) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(9019);buf.append(text.charAt(i));
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(9020);final String result = buf.toString();
        __CLR4_5_25lh5lhlvha79yz.R.inc(9021);if ((((!repeat)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(9022)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(9023)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(9024);return result;
        }

        }__CLR4_5_25lh5lhlvha79yz.R.inc(9025);return replaceEach(result, searchList, replacementList, repeat, timeToLive - 1);
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    // Replace, character based
    //-----------------------------------------------------------------------
    /**
     * <p>Replaces all occurrences of a character in a String with another.
     * This is a null-safe version of {@link String#replace(char, char)}.</p>
     *
     * <p>A {@code null} string input returns {@code null}.
     * An empty ("") string input returns an empty string.</p>
     *
     * <pre>
     * StringUtils.replaceChars(null, *, *)        = null
     * StringUtils.replaceChars("", *, *)          = ""
     * StringUtils.replaceChars("abcba", 'b', 'y') = "aycya"
     * StringUtils.replaceChars("abcba", 'z', 'y') = "abcba"
     * </pre>
     *
     * @param str  String to replace characters in, may be null
     * @param searchChar  the character to search for, may be null
     * @param replaceChar  the character to replace, may be null
     * @return modified String, {@code null} if null string input
     * @since 2.0
     */
    public static String replaceChars(final String str, final char searchChar, final char replaceChar) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(9026);
        __CLR4_5_25lh5lhlvha79yz.R.inc(9027);if ((((str == null)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(9028)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(9029)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(9030);return null;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(9031);return str.replace(searchChar, replaceChar);
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    /**
     * <p>Replaces multiple characters in a String in one go.
     * This method can also be used to delete characters.</p>
     *
     * <p>For example:<br>
     * <code>replaceChars(&quot;hello&quot;, &quot;ho&quot;, &quot;jy&quot;) = jelly</code>.</p>
     *
     * <p>A {@code null} string input returns {@code null}.
     * An empty ("") string input returns an empty string.
     * A null or empty set of search characters returns the input string.</p>
     *
     * <p>The length of the search characters should normally equal the length
     * of the replace characters.
     * If the search characters is longer, then the extra search characters
     * are deleted.
     * If the search characters is shorter, then the extra replace characters
     * are ignored.</p>
     *
     * <pre>
     * StringUtils.replaceChars(null, *, *)           = null
     * StringUtils.replaceChars("", *, *)             = ""
     * StringUtils.replaceChars("abc", null, *)       = "abc"
     * StringUtils.replaceChars("abc", "", *)         = "abc"
     * StringUtils.replaceChars("abc", "b", null)     = "ac"
     * StringUtils.replaceChars("abc", "b", "")       = "ac"
     * StringUtils.replaceChars("abcba", "bc", "yz")  = "ayzya"
     * StringUtils.replaceChars("abcba", "bc", "y")   = "ayya"
     * StringUtils.replaceChars("abcba", "bc", "yzx") = "ayzya"
     * </pre>
     *
     * @param str  String to replace characters in, may be null
     * @param searchChars  a set of characters to search for, may be null
     * @param replaceChars  a set of characters to replace, may be null
     * @return modified String, {@code null} if null string input
     * @since 2.0
     */
    public static String replaceChars(final String str, final String searchChars, String replaceChars) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(9032);
        __CLR4_5_25lh5lhlvha79yz.R.inc(9033);if ((((isEmpty(str) || isEmpty(searchChars))&&(__CLR4_5_25lh5lhlvha79yz.R.iget(9034)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(9035)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(9036);return str;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(9037);if ((((replaceChars == null)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(9038)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(9039)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(9040);replaceChars = EMPTY;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(9041);boolean modified = false;
        __CLR4_5_25lh5lhlvha79yz.R.inc(9042);final int replaceCharsLength = replaceChars.length();
        __CLR4_5_25lh5lhlvha79yz.R.inc(9043);final int strLength = str.length();
        __CLR4_5_25lh5lhlvha79yz.R.inc(9044);final StringBuilder buf = new StringBuilder(strLength);
        __CLR4_5_25lh5lhlvha79yz.R.inc(9045);for (int i = 0; (((i < strLength)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(9046)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(9047)==0&false)); i++) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(9048);final char ch = str.charAt(i);
            __CLR4_5_25lh5lhlvha79yz.R.inc(9049);final int index = searchChars.indexOf(ch);
            __CLR4_5_25lh5lhlvha79yz.R.inc(9050);if ((((index >= 0)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(9051)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(9052)==0&false))) {{
                __CLR4_5_25lh5lhlvha79yz.R.inc(9053);modified = true;
                __CLR4_5_25lh5lhlvha79yz.R.inc(9054);if ((((index < replaceCharsLength)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(9055)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(9056)==0&false))) {{
                    __CLR4_5_25lh5lhlvha79yz.R.inc(9057);buf.append(replaceChars.charAt(index));
                }
            }} }else {{
                __CLR4_5_25lh5lhlvha79yz.R.inc(9058);buf.append(ch);
            }
        }}
        }__CLR4_5_25lh5lhlvha79yz.R.inc(9059);if ((((modified)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(9060)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(9061)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(9062);return buf.toString();
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(9063);return str;
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    // Overlay
    //-----------------------------------------------------------------------
    /**
     * <p>Overlays part of a String with another String.</p>
     *
     * <p>A {@code null} string input returns {@code null}.
     * A negative index is treated as zero.
     * An index greater than the string length is treated as the string length.
     * The start index is always the smaller of the two indices.</p>
     *
     * <pre>
     * StringUtils.overlay(null, *, *, *)            = null
     * StringUtils.overlay("", "abc", 0, 0)          = "abc"
     * StringUtils.overlay("abcdef", null, 2, 4)     = "abef"
     * StringUtils.overlay("abcdef", "", 2, 4)       = "abef"
     * StringUtils.overlay("abcdef", "", 4, 2)       = "abef"
     * StringUtils.overlay("abcdef", "zzzz", 2, 4)   = "abzzzzef"
     * StringUtils.overlay("abcdef", "zzzz", 4, 2)   = "abzzzzef"
     * StringUtils.overlay("abcdef", "zzzz", -1, 4)  = "zzzzef"
     * StringUtils.overlay("abcdef", "zzzz", 2, 8)   = "abzzzz"
     * StringUtils.overlay("abcdef", "zzzz", -2, -3) = "zzzzabcdef"
     * StringUtils.overlay("abcdef", "zzzz", 8, 10)  = "abcdefzzzz"
     * </pre>
     *
     * @param str  the String to do overlaying in, may be null
     * @param overlay  the String to overlay, may be null
     * @param start  the position to start overlaying at
     * @param end  the position to stop overlaying before
     * @return overlayed String, {@code null} if null String input
     * @since 2.0
     */
    public static String overlay(final String str, String overlay, int start, int end) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(9064);
        __CLR4_5_25lh5lhlvha79yz.R.inc(9065);if ((((str == null)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(9066)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(9067)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(9068);return null;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(9069);if ((((overlay == null)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(9070)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(9071)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(9072);overlay = EMPTY;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(9073);final int len = str.length();
        __CLR4_5_25lh5lhlvha79yz.R.inc(9074);if ((((start < 0)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(9075)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(9076)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(9077);start = 0;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(9078);if ((((start > len)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(9079)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(9080)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(9081);start = len;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(9082);if ((((end < 0)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(9083)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(9084)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(9085);end = 0;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(9086);if ((((end > len)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(9087)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(9088)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(9089);end = len;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(9090);if ((((start > end)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(9091)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(9092)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(9093);final int temp = start;
            __CLR4_5_25lh5lhlvha79yz.R.inc(9094);start = end;
            __CLR4_5_25lh5lhlvha79yz.R.inc(9095);end = temp;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(9096);return new StringBuilder(len + start - end + overlay.length() + 1)
            .append(str.substring(0, start))
            .append(overlay)
            .append(str.substring(end))
            .toString();
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    // Chomping
    //-----------------------------------------------------------------------
    /**
     * <p>Removes one newline from end of a String if it's there,
     * otherwise leave it alone.  A newline is &quot;{@code \n}&quot;,
     * &quot;{@code \r}&quot;, or &quot;{@code \r\n}&quot;.</p>
     *
     * <p>NOTE: This method changed in 2.0.
     * It now more closely matches Perl chomp.</p>
     *
     * <pre>
     * StringUtils.chomp(null)          = null
     * StringUtils.chomp("")            = ""
     * StringUtils.chomp("abc \r")      = "abc "
     * StringUtils.chomp("abc\n")       = "abc"
     * StringUtils.chomp("abc\r\n")     = "abc"
     * StringUtils.chomp("abc\r\n\r\n") = "abc\r\n"
     * StringUtils.chomp("abc\n\r")     = "abc\n"
     * StringUtils.chomp("abc\n\rabc")  = "abc\n\rabc"
     * StringUtils.chomp("\r")          = ""
     * StringUtils.chomp("\n")          = ""
     * StringUtils.chomp("\r\n")        = ""
     * </pre>
     *
     * @param str  the String to chomp a newline from, may be null
     * @return String without newline, {@code null} if null String input
     */
    public static String chomp(final String str) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(9097);
        __CLR4_5_25lh5lhlvha79yz.R.inc(9098);if ((((isEmpty(str))&&(__CLR4_5_25lh5lhlvha79yz.R.iget(9099)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(9100)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(9101);return str;
        }

        }__CLR4_5_25lh5lhlvha79yz.R.inc(9102);if ((((str.length() == 1)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(9103)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(9104)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(9105);final char ch = str.charAt(0);
            __CLR4_5_25lh5lhlvha79yz.R.inc(9106);if ((((ch == CharUtils.CR || ch == CharUtils.LF)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(9107)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(9108)==0&false))) {{
                __CLR4_5_25lh5lhlvha79yz.R.inc(9109);return EMPTY;
            }
            }__CLR4_5_25lh5lhlvha79yz.R.inc(9110);return str;
        }

        }__CLR4_5_25lh5lhlvha79yz.R.inc(9111);int lastIdx = str.length() - 1;
        __CLR4_5_25lh5lhlvha79yz.R.inc(9112);final char last = str.charAt(lastIdx);

        __CLR4_5_25lh5lhlvha79yz.R.inc(9113);if ((((last == CharUtils.LF)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(9114)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(9115)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(9116);if ((((str.charAt(lastIdx - 1) == CharUtils.CR)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(9117)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(9118)==0&false))) {{
                __CLR4_5_25lh5lhlvha79yz.R.inc(9119);lastIdx--;
            }
        }} }else {__CLR4_5_25lh5lhlvha79yz.R.inc(9120);if ((((last != CharUtils.CR)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(9121)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(9122)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(9123);lastIdx++;
        }
        }}__CLR4_5_25lh5lhlvha79yz.R.inc(9124);return str.substring(0, lastIdx);
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    /**
     * <p>Removes {@code separator} from the end of
     * {@code str} if it's there, otherwise leave it alone.</p>
     *
     * <p>NOTE: This method changed in version 2.0.
     * It now more closely matches Perl chomp.
     * For the previous behavior, use {@link #substringBeforeLast(String, String)}.
     * This method uses {@link String#endsWith(String)}.</p>
     *
     * <pre>
     * StringUtils.chomp(null, *)         = null
     * StringUtils.chomp("", *)           = ""
     * StringUtils.chomp("foobar", "bar") = "foo"
     * StringUtils.chomp("foobar", "baz") = "foobar"
     * StringUtils.chomp("foo", "foo")    = ""
     * StringUtils.chomp("foo ", "foo")   = "foo "
     * StringUtils.chomp(" foo", "foo")   = " "
     * StringUtils.chomp("foo", "foooo")  = "foo"
     * StringUtils.chomp("foo", "")       = "foo"
     * StringUtils.chomp("foo", null)     = "foo"
     * </pre>
     *
     * @param str  the String to chomp from, may be null
     * @param separator  separator String, may be null
     * @return String without trailing separator, {@code null} if null String input
     * @deprecated This feature will be removed in Lang 4.0, use {@link StringUtils#removeEnd(String, String)} instead
     */
    @Deprecated
    public static String chomp(final String str, final String separator) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(9125);
        __CLR4_5_25lh5lhlvha79yz.R.inc(9126);return removeEnd(str,separator);
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    // Chopping
    //-----------------------------------------------------------------------
    /**
     * <p>Remove the last character from a String.</p>
     *
     * <p>If the String ends in {@code \r\n}, then remove both
     * of them.</p>
     *
     * <pre>
     * StringUtils.chop(null)          = null
     * StringUtils.chop("")            = ""
     * StringUtils.chop("abc \r")      = "abc "
     * StringUtils.chop("abc\n")       = "abc"
     * StringUtils.chop("abc\r\n")     = "abc"
     * StringUtils.chop("abc")         = "ab"
     * StringUtils.chop("abc\nabc")    = "abc\nab"
     * StringUtils.chop("a")           = ""
     * StringUtils.chop("\r")          = ""
     * StringUtils.chop("\n")          = ""
     * StringUtils.chop("\r\n")        = ""
     * </pre>
     *
     * @param str  the String to chop last character from, may be null
     * @return String without last character, {@code null} if null String input
     */
    public static String chop(final String str) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(9127);
        __CLR4_5_25lh5lhlvha79yz.R.inc(9128);if ((((str == null)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(9129)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(9130)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(9131);return null;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(9132);final int strLen = str.length();
        __CLR4_5_25lh5lhlvha79yz.R.inc(9133);if ((((strLen < 2)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(9134)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(9135)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(9136);return EMPTY;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(9137);final int lastIdx = strLen - 1;
        __CLR4_5_25lh5lhlvha79yz.R.inc(9138);final String ret = str.substring(0, lastIdx);
        __CLR4_5_25lh5lhlvha79yz.R.inc(9139);final char last = str.charAt(lastIdx);
        __CLR4_5_25lh5lhlvha79yz.R.inc(9140);if ((((last == CharUtils.LF && ret.charAt(lastIdx - 1) == CharUtils.CR)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(9141)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(9142)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(9143);return ret.substring(0, lastIdx - 1);
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(9144);return ret;
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    // Conversion
    //-----------------------------------------------------------------------

    // Padding
    //-----------------------------------------------------------------------
    /**
     * <p>Repeat a String {@code repeat} times to form a
     * new String.</p>
     *
     * <pre>
     * StringUtils.repeat(null, 2) = null
     * StringUtils.repeat("", 0)   = ""
     * StringUtils.repeat("", 2)   = ""
     * StringUtils.repeat("a", 3)  = "aaa"
     * StringUtils.repeat("ab", 2) = "abab"
     * StringUtils.repeat("a", -2) = ""
     * </pre>
     *
     * @param str  the String to repeat, may be null
     * @param repeat  number of times to repeat str, negative treated as zero
     * @return a new String consisting of the original String repeated,
     *  {@code null} if null String input
     */
    public static String repeat(final String str, final int repeat) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(9145);
        // Performance tuned for 2.0 (JDK1.4)

        __CLR4_5_25lh5lhlvha79yz.R.inc(9146);if ((((str == null)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(9147)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(9148)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(9149);return null;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(9150);if ((((repeat <= 0)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(9151)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(9152)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(9153);return EMPTY;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(9154);final int inputLength = str.length();
        __CLR4_5_25lh5lhlvha79yz.R.inc(9155);if ((((repeat == 1 || inputLength == 0)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(9156)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(9157)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(9158);return str;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(9159);if ((((inputLength == 1 && repeat <= PAD_LIMIT)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(9160)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(9161)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(9162);return repeat(str.charAt(0), repeat);
        }

        }__CLR4_5_25lh5lhlvha79yz.R.inc(9163);final int outputLength = inputLength * repeat;
        boolean __CLB4_5_2_bool0=false;__CLR4_5_25lh5lhlvha79yz.R.inc(9164);switch (inputLength) {
            case 1 :if (!__CLB4_5_2_bool0) {__CLR4_5_25lh5lhlvha79yz.R.inc(9165);__CLB4_5_2_bool0=true;}
                __CLR4_5_25lh5lhlvha79yz.R.inc(9166);return repeat(str.charAt(0), repeat);
            case 2 :if (!__CLB4_5_2_bool0) {__CLR4_5_25lh5lhlvha79yz.R.inc(9167);__CLB4_5_2_bool0=true;}
                __CLR4_5_25lh5lhlvha79yz.R.inc(9168);final char ch0 = str.charAt(0);
                __CLR4_5_25lh5lhlvha79yz.R.inc(9169);final char ch1 = str.charAt(1);
                __CLR4_5_25lh5lhlvha79yz.R.inc(9170);final char[] output2 = new char[outputLength];
                __CLR4_5_25lh5lhlvha79yz.R.inc(9171);for (int i = repeat * 2 - 2; (((i >= 0)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(9172)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(9173)==0&false)); i--, i--) {{
                    __CLR4_5_25lh5lhlvha79yz.R.inc(9174);output2[i] = ch0;
                    __CLR4_5_25lh5lhlvha79yz.R.inc(9175);output2[i + 1] = ch1;
                }
                }__CLR4_5_25lh5lhlvha79yz.R.inc(9176);return new String(output2);
            default :if (!__CLB4_5_2_bool0) {__CLR4_5_25lh5lhlvha79yz.R.inc(9177);__CLB4_5_2_bool0=true;}
                __CLR4_5_25lh5lhlvha79yz.R.inc(9178);final StringBuilder buf = new StringBuilder(outputLength);
                __CLR4_5_25lh5lhlvha79yz.R.inc(9179);for (int i = 0; (((i < repeat)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(9180)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(9181)==0&false)); i++) {{
                    __CLR4_5_25lh5lhlvha79yz.R.inc(9182);buf.append(str);
                }
                }__CLR4_5_25lh5lhlvha79yz.R.inc(9183);return buf.toString();
        }
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    /**
     * <p>Repeat a String {@code repeat} times to form a
     * new String, with a String separator injected each time. </p>
     *
     * <pre>
     * StringUtils.repeat(null, null, 2) = null
     * StringUtils.repeat(null, "x", 2)  = null
     * StringUtils.repeat("", null, 0)   = ""
     * StringUtils.repeat("", "", 2)     = ""
     * StringUtils.repeat("", "x", 3)    = "xxx"
     * StringUtils.repeat("?", ", ", 3)  = "?, ?, ?"
     * </pre>
     *
     * @param str        the String to repeat, may be null
     * @param separator  the String to inject, may be null
     * @param repeat     number of times to repeat str, negative treated as zero
     * @return a new String consisting of the original String repeated,
     *  {@code null} if null String input
     * @since 2.5
     */
    public static String repeat(final String str, final String separator, final int repeat) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(9184);
        __CLR4_5_25lh5lhlvha79yz.R.inc(9185);if((((str == null || separator == null)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(9186)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(9187)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(9188);return repeat(str, repeat);
        }
        // given that repeat(String, int) is quite optimized, better to rely on it than try and splice this into it
        }__CLR4_5_25lh5lhlvha79yz.R.inc(9189);final String result = repeat(str + separator, repeat);
        __CLR4_5_25lh5lhlvha79yz.R.inc(9190);return removeEnd(result, separator);
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    /**
     * <p>Returns padding using the specified delimiter repeated
     * to a given length.</p>
     *
     * <pre>
     * StringUtils.repeat('e', 0)  = ""
     * StringUtils.repeat('e', 3)  = "eee"
     * StringUtils.repeat('e', -2) = ""
     * </pre>
     *
     * <p>Note: this method doesn't not support padding with
     * <a href="http://www.unicode.org/glossary/#supplementary_character">Unicode Supplementary Characters</a>
     * as they require a pair of {@code char}s to be represented.
     * If you are needing to support full I18N of your applications
     * consider using {@link #repeat(String, int)} instead.
     * </p>
     *
     * @param ch  character to repeat
     * @param repeat  number of times to repeat char, negative treated as zero
     * @return String with repeated character
     * @see #repeat(String, int)
     */
    public static String repeat(final char ch, final int repeat) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(9191);
        __CLR4_5_25lh5lhlvha79yz.R.inc(9192);if ((((repeat <= 0)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(9193)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(9194)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(9195);return EMPTY;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(9196);final char[] buf = new char[repeat];
        __CLR4_5_25lh5lhlvha79yz.R.inc(9197);for (int i = repeat - 1; (((i >= 0)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(9198)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(9199)==0&false)); i--) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(9200);buf[i] = ch;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(9201);return new String(buf);
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    /**
     * <p>Right pad a String with spaces (' ').</p>
     *
     * <p>The String is padded to the size of {@code size}.</p>
     *
     * <pre>
     * StringUtils.rightPad(null, *)   = null
     * StringUtils.rightPad("", 3)     = "   "
     * StringUtils.rightPad("bat", 3)  = "bat"
     * StringUtils.rightPad("bat", 5)  = "bat  "
     * StringUtils.rightPad("bat", 1)  = "bat"
     * StringUtils.rightPad("bat", -1) = "bat"
     * </pre>
     *
     * @param str  the String to pad out, may be null
     * @param size  the size to pad to
     * @return right padded String or original String if no padding is necessary,
     *  {@code null} if null String input
     */
    public static String rightPad(final String str, final int size) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(9202);
        __CLR4_5_25lh5lhlvha79yz.R.inc(9203);return rightPad(str, size, ' ');
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    /**
     * <p>Right pad a String with a specified character.</p>
     *
     * <p>The String is padded to the size of {@code size}.</p>
     *
     * <pre>
     * StringUtils.rightPad(null, *, *)     = null
     * StringUtils.rightPad("", 3, 'z')     = "zzz"
     * StringUtils.rightPad("bat", 3, 'z')  = "bat"
     * StringUtils.rightPad("bat", 5, 'z')  = "batzz"
     * StringUtils.rightPad("bat", 1, 'z')  = "bat"
     * StringUtils.rightPad("bat", -1, 'z') = "bat"
     * </pre>
     *
     * @param str  the String to pad out, may be null
     * @param size  the size to pad to
     * @param padChar  the character to pad with
     * @return right padded String or original String if no padding is necessary,
     *  {@code null} if null String input
     * @since 2.0
     */
    public static String rightPad(final String str, final int size, final char padChar) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(9204);
        __CLR4_5_25lh5lhlvha79yz.R.inc(9205);if ((((str == null)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(9206)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(9207)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(9208);return null;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(9209);final int pads = size - str.length();
        __CLR4_5_25lh5lhlvha79yz.R.inc(9210);if ((((pads <= 0)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(9211)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(9212)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(9213);return str; // returns original String when possible
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(9214);if ((((pads > PAD_LIMIT)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(9215)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(9216)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(9217);return rightPad(str, size, String.valueOf(padChar));
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(9218);return str.concat(repeat(padChar, pads));
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    /**
     * <p>Right pad a String with a specified String.</p>
     *
     * <p>The String is padded to the size of {@code size}.</p>
     *
     * <pre>
     * StringUtils.rightPad(null, *, *)      = null
     * StringUtils.rightPad("", 3, "z")      = "zzz"
     * StringUtils.rightPad("bat", 3, "yz")  = "bat"
     * StringUtils.rightPad("bat", 5, "yz")  = "batyz"
     * StringUtils.rightPad("bat", 8, "yz")  = "batyzyzy"
     * StringUtils.rightPad("bat", 1, "yz")  = "bat"
     * StringUtils.rightPad("bat", -1, "yz") = "bat"
     * StringUtils.rightPad("bat", 5, null)  = "bat  "
     * StringUtils.rightPad("bat", 5, "")    = "bat  "
     * </pre>
     *
     * @param str  the String to pad out, may be null
     * @param size  the size to pad to
     * @param padStr  the String to pad with, null or empty treated as single space
     * @return right padded String or original String if no padding is necessary,
     *  {@code null} if null String input
     */
    public static String rightPad(final String str, final int size, String padStr) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(9219);
        __CLR4_5_25lh5lhlvha79yz.R.inc(9220);if ((((str == null)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(9221)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(9222)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(9223);return null;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(9224);if ((((isEmpty(padStr))&&(__CLR4_5_25lh5lhlvha79yz.R.iget(9225)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(9226)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(9227);padStr = SPACE;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(9228);final int padLen = padStr.length();
        __CLR4_5_25lh5lhlvha79yz.R.inc(9229);final int strLen = str.length();
        __CLR4_5_25lh5lhlvha79yz.R.inc(9230);final int pads = size - strLen;
        __CLR4_5_25lh5lhlvha79yz.R.inc(9231);if ((((pads <= 0)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(9232)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(9233)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(9234);return str; // returns original String when possible
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(9235);if ((((padLen == 1 && pads <= PAD_LIMIT)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(9236)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(9237)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(9238);return rightPad(str, size, padStr.charAt(0));
        }

        }__CLR4_5_25lh5lhlvha79yz.R.inc(9239);if ((((pads == padLen)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(9240)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(9241)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(9242);return str.concat(padStr);
        } }else {__CLR4_5_25lh5lhlvha79yz.R.inc(9243);if ((((pads < padLen)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(9244)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(9245)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(9246);return str.concat(padStr.substring(0, pads));
        } }else {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(9247);final char[] padding = new char[pads];
            __CLR4_5_25lh5lhlvha79yz.R.inc(9248);final char[] padChars = padStr.toCharArray();
            __CLR4_5_25lh5lhlvha79yz.R.inc(9249);for (int i = 0; (((i < pads)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(9250)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(9251)==0&false)); i++) {{
                __CLR4_5_25lh5lhlvha79yz.R.inc(9252);padding[i] = padChars[i % padLen];
            }
            }__CLR4_5_25lh5lhlvha79yz.R.inc(9253);return str.concat(new String(padding));
        }
    }}}finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    /**
     * <p>Left pad a String with spaces (' ').</p>
     *
     * <p>The String is padded to the size of {@code size}.</p>
     *
     * <pre>
     * StringUtils.leftPad(null, *)   = null
     * StringUtils.leftPad("", 3)     = "   "
     * StringUtils.leftPad("bat", 3)  = "bat"
     * StringUtils.leftPad("bat", 5)  = "  bat"
     * StringUtils.leftPad("bat", 1)  = "bat"
     * StringUtils.leftPad("bat", -1) = "bat"
     * </pre>
     *
     * @param str  the String to pad out, may be null
     * @param size  the size to pad to
     * @return left padded String or original String if no padding is necessary,
     *  {@code null} if null String input
     */
    public static String leftPad(final String str, final int size) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(9254);
        __CLR4_5_25lh5lhlvha79yz.R.inc(9255);return leftPad(str, size, ' ');
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    /**
     * <p>Left pad a String with a specified character.</p>
     *
     * <p>Pad to a size of {@code size}.</p>
     *
     * <pre>
     * StringUtils.leftPad(null, *, *)     = null
     * StringUtils.leftPad("", 3, 'z')     = "zzz"
     * StringUtils.leftPad("bat", 3, 'z')  = "bat"
     * StringUtils.leftPad("bat", 5, 'z')  = "zzbat"
     * StringUtils.leftPad("bat", 1, 'z')  = "bat"
     * StringUtils.leftPad("bat", -1, 'z') = "bat"
     * </pre>
     *
     * @param str  the String to pad out, may be null
     * @param size  the size to pad to
     * @param padChar  the character to pad with
     * @return left padded String or original String if no padding is necessary,
     *  {@code null} if null String input
     * @since 2.0
     */
    public static String leftPad(final String str, final int size, final char padChar) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(9256);
        __CLR4_5_25lh5lhlvha79yz.R.inc(9257);if ((((str == null)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(9258)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(9259)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(9260);return null;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(9261);final int pads = size - str.length();
        __CLR4_5_25lh5lhlvha79yz.R.inc(9262);if ((((pads <= 0)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(9263)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(9264)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(9265);return str; // returns original String when possible
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(9266);if ((((pads > PAD_LIMIT)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(9267)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(9268)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(9269);return leftPad(str, size, String.valueOf(padChar));
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(9270);return repeat(padChar, pads).concat(str);
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    /**
     * <p>Left pad a String with a specified String.</p>
     *
     * <p>Pad to a size of {@code size}.</p>
     *
     * <pre>
     * StringUtils.leftPad(null, *, *)      = null
     * StringUtils.leftPad("", 3, "z")      = "zzz"
     * StringUtils.leftPad("bat", 3, "yz")  = "bat"
     * StringUtils.leftPad("bat", 5, "yz")  = "yzbat"
     * StringUtils.leftPad("bat", 8, "yz")  = "yzyzybat"
     * StringUtils.leftPad("bat", 1, "yz")  = "bat"
     * StringUtils.leftPad("bat", -1, "yz") = "bat"
     * StringUtils.leftPad("bat", 5, null)  = "  bat"
     * StringUtils.leftPad("bat", 5, "")    = "  bat"
     * </pre>
     *
     * @param str  the String to pad out, may be null
     * @param size  the size to pad to
     * @param padStr  the String to pad with, null or empty treated as single space
     * @return left padded String or original String if no padding is necessary,
     *  {@code null} if null String input
     */
    public static String leftPad(final String str, final int size, String padStr) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(9271);
        __CLR4_5_25lh5lhlvha79yz.R.inc(9272);if ((((str == null)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(9273)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(9274)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(9275);return null;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(9276);if ((((isEmpty(padStr))&&(__CLR4_5_25lh5lhlvha79yz.R.iget(9277)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(9278)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(9279);padStr = SPACE;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(9280);final int padLen = padStr.length();
        __CLR4_5_25lh5lhlvha79yz.R.inc(9281);final int strLen = str.length();
        __CLR4_5_25lh5lhlvha79yz.R.inc(9282);final int pads = size - strLen;
        __CLR4_5_25lh5lhlvha79yz.R.inc(9283);if ((((pads <= 0)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(9284)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(9285)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(9286);return str; // returns original String when possible
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(9287);if ((((padLen == 1 && pads <= PAD_LIMIT)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(9288)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(9289)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(9290);return leftPad(str, size, padStr.charAt(0));
        }

        }__CLR4_5_25lh5lhlvha79yz.R.inc(9291);if ((((pads == padLen)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(9292)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(9293)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(9294);return padStr.concat(str);
        } }else {__CLR4_5_25lh5lhlvha79yz.R.inc(9295);if ((((pads < padLen)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(9296)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(9297)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(9298);return padStr.substring(0, pads).concat(str);
        } }else {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(9299);final char[] padding = new char[pads];
            __CLR4_5_25lh5lhlvha79yz.R.inc(9300);final char[] padChars = padStr.toCharArray();
            __CLR4_5_25lh5lhlvha79yz.R.inc(9301);for (int i = 0; (((i < pads)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(9302)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(9303)==0&false)); i++) {{
                __CLR4_5_25lh5lhlvha79yz.R.inc(9304);padding[i] = padChars[i % padLen];
            }
            }__CLR4_5_25lh5lhlvha79yz.R.inc(9305);return new String(padding).concat(str);
        }
    }}}finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    /**
     * Gets a CharSequence length or {@code 0} if the CharSequence is
     * {@code null}.
     *
     * @param cs
     *            a CharSequence or {@code null}
     * @return CharSequence length or {@code 0} if the CharSequence is
     *         {@code null}.
     * @since 2.4
     * @since 3.0 Changed signature from length(String) to length(CharSequence)
     */
    public static int length(final CharSequence cs) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(9306);
        __CLR4_5_25lh5lhlvha79yz.R.inc(9307);return (((cs == null )&&(__CLR4_5_25lh5lhlvha79yz.R.iget(9308)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(9309)==0&false))? 0 : cs.length();
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    // Centering
    //-----------------------------------------------------------------------
    /**
     * <p>Centers a String in a larger String of size {@code size}
     * using the space character (' ').</p>
     *
     * <p>If the size is less than the String length, the String is returned.
     * A {@code null} String returns {@code null}.
     * A negative size is treated as zero.</p>
     *
     * <p>Equivalent to {@code center(str, size, " ")}.</p>
     *
     * <pre>
     * StringUtils.center(null, *)   = null
     * StringUtils.center("", 4)     = "    "
     * StringUtils.center("ab", -1)  = "ab"
     * StringUtils.center("ab", 4)   = " ab "
     * StringUtils.center("abcd", 2) = "abcd"
     * StringUtils.center("a", 4)    = " a  "
     * </pre>
     *
     * @param str  the String to center, may be null
     * @param size  the int size of new String, negative treated as zero
     * @return centered String, {@code null} if null String input
     */
    public static String center(final String str, final int size) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(9310);
        __CLR4_5_25lh5lhlvha79yz.R.inc(9311);return center(str, size, ' ');
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    /**
     * <p>Centers a String in a larger String of size {@code size}.
     * Uses a supplied character as the value to pad the String with.</p>
     *
     * <p>If the size is less than the String length, the String is returned.
     * A {@code null} String returns {@code null}.
     * A negative size is treated as zero.</p>
     *
     * <pre>
     * StringUtils.center(null, *, *)     = null
     * StringUtils.center("", 4, ' ')     = "    "
     * StringUtils.center("ab", -1, ' ')  = "ab"
     * StringUtils.center("ab", 4, ' ')   = " ab "
     * StringUtils.center("abcd", 2, ' ') = "abcd"
     * StringUtils.center("a", 4, ' ')    = " a  "
     * StringUtils.center("a", 4, 'y')    = "yayy"
     * </pre>
     *
     * @param str  the String to center, may be null
     * @param size  the int size of new String, negative treated as zero
     * @param padChar  the character to pad the new String with
     * @return centered String, {@code null} if null String input
     * @since 2.0
     */
    public static String center(String str, final int size, final char padChar) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(9312);
        __CLR4_5_25lh5lhlvha79yz.R.inc(9313);if ((((str == null || size <= 0)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(9314)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(9315)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(9316);return str;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(9317);final int strLen = str.length();
        __CLR4_5_25lh5lhlvha79yz.R.inc(9318);final int pads = size - strLen;
        __CLR4_5_25lh5lhlvha79yz.R.inc(9319);if ((((pads <= 0)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(9320)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(9321)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(9322);return str;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(9323);str = leftPad(str, strLen + pads / 2, padChar);
        __CLR4_5_25lh5lhlvha79yz.R.inc(9324);str = rightPad(str, size, padChar);
        __CLR4_5_25lh5lhlvha79yz.R.inc(9325);return str;
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    /**
     * <p>Centers a String in a larger String of size {@code size}.
     * Uses a supplied String as the value to pad the String with.</p>
     *
     * <p>If the size is less than the String length, the String is returned.
     * A {@code null} String returns {@code null}.
     * A negative size is treated as zero.</p>
     *
     * <pre>
     * StringUtils.center(null, *, *)     = null
     * StringUtils.center("", 4, " ")     = "    "
     * StringUtils.center("ab", -1, " ")  = "ab"
     * StringUtils.center("ab", 4, " ")   = " ab "
     * StringUtils.center("abcd", 2, " ") = "abcd"
     * StringUtils.center("a", 4, " ")    = " a  "
     * StringUtils.center("a", 4, "yz")   = "yayz"
     * StringUtils.center("abc", 7, null) = "  abc  "
     * StringUtils.center("abc", 7, "")   = "  abc  "
     * </pre>
     *
     * @param str  the String to center, may be null
     * @param size  the int size of new String, negative treated as zero
     * @param padStr  the String to pad the new String with, must not be null or empty
     * @return centered String, {@code null} if null String input
     * @throws IllegalArgumentException if padStr is {@code null} or empty
     */
    public static String center(String str, final int size, String padStr) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(9326);
        __CLR4_5_25lh5lhlvha79yz.R.inc(9327);if ((((str == null || size <= 0)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(9328)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(9329)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(9330);return str;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(9331);if ((((isEmpty(padStr))&&(__CLR4_5_25lh5lhlvha79yz.R.iget(9332)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(9333)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(9334);padStr = SPACE;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(9335);final int strLen = str.length();
        __CLR4_5_25lh5lhlvha79yz.R.inc(9336);final int pads = size - strLen;
        __CLR4_5_25lh5lhlvha79yz.R.inc(9337);if ((((pads <= 0)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(9338)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(9339)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(9340);return str;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(9341);str = leftPad(str, strLen + pads / 2, padStr);
        __CLR4_5_25lh5lhlvha79yz.R.inc(9342);str = rightPad(str, size, padStr);
        __CLR4_5_25lh5lhlvha79yz.R.inc(9343);return str;
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    // Case conversion
    //-----------------------------------------------------------------------
    /**
     * <p>Converts a String to upper case as per {@link String#toUpperCase()}.</p>
     *
     * <p>A {@code null} input String returns {@code null}.</p>
     *
     * <pre>
     * StringUtils.upperCase(null)  = null
     * StringUtils.upperCase("")    = ""
     * StringUtils.upperCase("aBc") = "ABC"
     * </pre>
     *
     * <p><strong>Note:</strong> As described in the documentation for {@link String#toUpperCase()},
     * the result of this method is affected by the current locale.
     * For platform-independent case transformations, the method {@link #lowerCase(String, Locale)}
     * should be used with a specific locale (e.g. {@link Locale#ENGLISH}).</p>
     *
     * @param str  the String to upper case, may be null
     * @return the upper cased String, {@code null} if null String input
     */
    public static String upperCase(final String str) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(9344);
        __CLR4_5_25lh5lhlvha79yz.R.inc(9345);if ((((str == null)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(9346)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(9347)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(9348);return null;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(9349);return str.toUpperCase();
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    /**
     * <p>Converts a String to upper case as per {@link String#toUpperCase(Locale)}.</p>
     *
     * <p>A {@code null} input String returns {@code null}.</p>
     *
     * <pre>
     * StringUtils.upperCase(null, Locale.ENGLISH)  = null
     * StringUtils.upperCase("", Locale.ENGLISH)    = ""
     * StringUtils.upperCase("aBc", Locale.ENGLISH) = "ABC"
     * </pre>
     *
     * @param str  the String to upper case, may be null
     * @param locale  the locale that defines the case transformation rules, must not be null
     * @return the upper cased String, {@code null} if null String input
     * @since 2.5
     */
    public static String upperCase(final String str, final Locale locale) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(9350);
        __CLR4_5_25lh5lhlvha79yz.R.inc(9351);if ((((str == null)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(9352)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(9353)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(9354);return null;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(9355);return str.toUpperCase(locale);
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    /**
     * <p>Converts a String to lower case as per {@link String#toLowerCase()}.</p>
     *
     * <p>A {@code null} input String returns {@code null}.</p>
     *
     * <pre>
     * StringUtils.lowerCase(null)  = null
     * StringUtils.lowerCase("")    = ""
     * StringUtils.lowerCase("aBc") = "abc"
     * </pre>
     *
     * <p><strong>Note:</strong> As described in the documentation for {@link String#toLowerCase()},
     * the result of this method is affected by the current locale.
     * For platform-independent case transformations, the method {@link #lowerCase(String, Locale)}
     * should be used with a specific locale (e.g. {@link Locale#ENGLISH}).</p>
     *
     * @param str  the String to lower case, may be null
     * @return the lower cased String, {@code null} if null String input
     */
    public static String lowerCase(final String str) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(9356);
        __CLR4_5_25lh5lhlvha79yz.R.inc(9357);if ((((str == null)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(9358)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(9359)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(9360);return null;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(9361);return str.toLowerCase();
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    /**
     * <p>Converts a String to lower case as per {@link String#toLowerCase(Locale)}.</p>
     *
     * <p>A {@code null} input String returns {@code null}.</p>
     *
     * <pre>
     * StringUtils.lowerCase(null, Locale.ENGLISH)  = null
     * StringUtils.lowerCase("", Locale.ENGLISH)    = ""
     * StringUtils.lowerCase("aBc", Locale.ENGLISH) = "abc"
     * </pre>
     *
     * @param str  the String to lower case, may be null
     * @param locale  the locale that defines the case transformation rules, must not be null
     * @return the lower cased String, {@code null} if null String input
     * @since 2.5
     */
    public static String lowerCase(final String str, final Locale locale) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(9362);
        __CLR4_5_25lh5lhlvha79yz.R.inc(9363);if ((((str == null)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(9364)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(9365)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(9366);return null;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(9367);return str.toLowerCase(locale);
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    /**
     * <p>Capitalizes a String changing the first character to title case as
     * per {@link Character#toTitleCase(int)}. No other characters are changed.</p>
     *
     * <p>For a word based algorithm, see {@link org.apache.commons.lang3.text.WordUtils#capitalize(String)}.
     * A {@code null} input String returns {@code null}.</p>
     *
     * <pre>
     * StringUtils.capitalize(null)  = null
     * StringUtils.capitalize("")    = ""
     * StringUtils.capitalize("cat") = "Cat"
     * StringUtils.capitalize("cAt") = "CAt"
     * StringUtils.capitalize("'cat'") = "'cat'"
     * </pre>
     *
     * @param str the String to capitalize, may be null
     * @return the capitalized String, {@code null} if null String input
     * @see org.apache.commons.lang3.text.WordUtils#capitalize(String)
     * @see #uncapitalize(String)
     * @since 2.0
     */
    public static String capitalize(final String str) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(9368);
        __CLR4_5_25lh5lhlvha79yz.R.inc(9369);int strLen;
        __CLR4_5_25lh5lhlvha79yz.R.inc(9370);if (str == null || (strLen = str.length()) == 0) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(9373);return str;
        }

        }__CLR4_5_25lh5lhlvha79yz.R.inc(9374);final int firstCodepoint = str.codePointAt(0);
        __CLR4_5_25lh5lhlvha79yz.R.inc(9375);final int newCodePoint = Character.toTitleCase(firstCodepoint);
        __CLR4_5_25lh5lhlvha79yz.R.inc(9376);if ((((firstCodepoint == newCodePoint)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(9377)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(9378)==0&false))) {{
            // already capitalized
            __CLR4_5_25lh5lhlvha79yz.R.inc(9379);return str;
        }

        }__CLR4_5_25lh5lhlvha79yz.R.inc(9380);final int newCodePoints[] = new int[strLen]; // cannot be longer than the char array
        __CLR4_5_25lh5lhlvha79yz.R.inc(9381);int outOffset = 0;
        __CLR4_5_25lh5lhlvha79yz.R.inc(9382);newCodePoints[outOffset++] = newCodePoint; // copy the first codepoint
        __CLR4_5_25lh5lhlvha79yz.R.inc(9383);for (int inOffset = Character.charCount(firstCodepoint); (((inOffset < strLen)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(9384)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(9385)==0&false)); ) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(9386);final int codepoint = str.codePointAt(inOffset);
            __CLR4_5_25lh5lhlvha79yz.R.inc(9387);newCodePoints[outOffset++] = codepoint; // copy the remaining ones
            __CLR4_5_25lh5lhlvha79yz.R.inc(9388);inOffset += Character.charCount(codepoint);
         }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(9389);return new String(newCodePoints, 0, outOffset);
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    /**
     * <p>Uncapitalizes a String, changing the first character to lower case as
     * per {@link Character#toLowerCase(int)}. No other characters are changed.</p>
     *
     * <p>For a word based algorithm, see {@link org.apache.commons.lang3.text.WordUtils#uncapitalize(String)}.
     * A {@code null} input String returns {@code null}.</p>
     *
     * <pre>
     * StringUtils.uncapitalize(null)  = null
     * StringUtils.uncapitalize("")    = ""
     * StringUtils.uncapitalize("cat") = "cat"
     * StringUtils.uncapitalize("Cat") = "cat"
     * StringUtils.uncapitalize("CAT") = "cAT"
     * </pre>
     *
     * @param str the String to uncapitalize, may be null
     * @return the uncapitalized String, {@code null} if null String input
     * @see org.apache.commons.lang3.text.WordUtils#uncapitalize(String)
     * @see #capitalize(String)
     * @since 2.0
     */
    public static String uncapitalize(final String str) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(9390);
        __CLR4_5_25lh5lhlvha79yz.R.inc(9391);int strLen;
        __CLR4_5_25lh5lhlvha79yz.R.inc(9392);if (str == null || (strLen = str.length()) == 0) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(9395);return str;
        }

        }__CLR4_5_25lh5lhlvha79yz.R.inc(9396);final int firstCodepoint = str.codePointAt(0);
        __CLR4_5_25lh5lhlvha79yz.R.inc(9397);final int newCodePoint = Character.toLowerCase(firstCodepoint);
        __CLR4_5_25lh5lhlvha79yz.R.inc(9398);if ((((firstCodepoint == newCodePoint)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(9399)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(9400)==0&false))) {{
            // already capitalized
            __CLR4_5_25lh5lhlvha79yz.R.inc(9401);return str;
        }

        }__CLR4_5_25lh5lhlvha79yz.R.inc(9402);final int newCodePoints[] = new int[strLen]; // cannot be longer than the char array
        __CLR4_5_25lh5lhlvha79yz.R.inc(9403);int outOffset = 0;
        __CLR4_5_25lh5lhlvha79yz.R.inc(9404);newCodePoints[outOffset++] = newCodePoint; // copy the first codepoint
        __CLR4_5_25lh5lhlvha79yz.R.inc(9405);for (int inOffset = Character.charCount(firstCodepoint); (((inOffset < strLen)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(9406)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(9407)==0&false)); ) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(9408);final int codepoint = str.codePointAt(inOffset);
            __CLR4_5_25lh5lhlvha79yz.R.inc(9409);newCodePoints[outOffset++] = codepoint; // copy the remaining ones
            __CLR4_5_25lh5lhlvha79yz.R.inc(9410);inOffset += Character.charCount(codepoint);
         }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(9411);return new String(newCodePoints, 0, outOffset);
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    /**
     * <p>Swaps the case of a String changing upper and title case to
     * lower case, and lower case to upper case.</p>
     *
     * <ul>
     *  <li>Upper case character converts to Lower case</li>
     *  <li>Title case character converts to Lower case</li>
     *  <li>Lower case character converts to Upper case</li>
     * </ul>
     *
     * <p>For a word based algorithm, see {@link org.apache.commons.lang3.text.WordUtils#swapCase(String)}.
     * A {@code null} input String returns {@code null}.</p>
     *
     * <pre>
     * StringUtils.swapCase(null)                 = null
     * StringUtils.swapCase("")                   = ""
     * StringUtils.swapCase("The dog has a BONE") = "tHE DOG HAS A bone"
     * </pre>
     *
     * <p>NOTE: This method changed in Lang version 2.0.
     * It no longer performs a word based algorithm.
     * If you only use ASCII, you will notice no change.
     * That functionality is available in org.apache.commons.lang3.text.WordUtils.</p>
     *
     * @param str  the String to swap case, may be null
     * @return the changed String, {@code null} if null String input
     */
    public static String swapCase(final String str) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(9412);
        __CLR4_5_25lh5lhlvha79yz.R.inc(9413);if ((((StringUtils.isEmpty(str))&&(__CLR4_5_25lh5lhlvha79yz.R.iget(9414)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(9415)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(9416);return str;
        }

        }__CLR4_5_25lh5lhlvha79yz.R.inc(9417);final int strLen = str.length();
        __CLR4_5_25lh5lhlvha79yz.R.inc(9418);final int newCodePoints[] = new int[strLen]; // cannot be longer than the char array
        __CLR4_5_25lh5lhlvha79yz.R.inc(9419);int outOffset = 0;
        __CLR4_5_25lh5lhlvha79yz.R.inc(9420);for (int i = 0; (((i < strLen)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(9421)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(9422)==0&false)); ) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(9423);final int oldCodepoint = str.codePointAt(i);
            __CLR4_5_25lh5lhlvha79yz.R.inc(9424);final int newCodePoint;
            __CLR4_5_25lh5lhlvha79yz.R.inc(9425);if ((((Character.isUpperCase(oldCodepoint))&&(__CLR4_5_25lh5lhlvha79yz.R.iget(9426)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(9427)==0&false))) {{
                __CLR4_5_25lh5lhlvha79yz.R.inc(9428);newCodePoint = Character.toLowerCase(oldCodepoint);
            } }else {__CLR4_5_25lh5lhlvha79yz.R.inc(9429);if ((((Character.isTitleCase(oldCodepoint))&&(__CLR4_5_25lh5lhlvha79yz.R.iget(9430)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(9431)==0&false))) {{
                __CLR4_5_25lh5lhlvha79yz.R.inc(9432);newCodePoint = Character.toLowerCase(oldCodepoint);
            } }else {__CLR4_5_25lh5lhlvha79yz.R.inc(9433);if ((((Character.isLowerCase(oldCodepoint))&&(__CLR4_5_25lh5lhlvha79yz.R.iget(9434)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(9435)==0&false))) {{
                __CLR4_5_25lh5lhlvha79yz.R.inc(9436);newCodePoint = Character.toUpperCase(oldCodepoint);
            } }else {{
                __CLR4_5_25lh5lhlvha79yz.R.inc(9437);newCodePoint = oldCodepoint;
            }
            }}}__CLR4_5_25lh5lhlvha79yz.R.inc(9438);newCodePoints[outOffset++] = newCodePoint;
            __CLR4_5_25lh5lhlvha79yz.R.inc(9439);i += Character.charCount(newCodePoint);
         }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(9440);return new String(newCodePoints, 0, outOffset);
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    // Count matches
    //-----------------------------------------------------------------------
    /**
     * <p>Counts how many times the substring appears in the larger string.</p>
     *
     * <p>A {@code null} or empty ("") String input returns {@code 0}.</p>
     *
     * <pre>
     * StringUtils.countMatches(null, *)       = 0
     * StringUtils.countMatches("", *)         = 0
     * StringUtils.countMatches("abba", null)  = 0
     * StringUtils.countMatches("abba", "")    = 0
     * StringUtils.countMatches("abba", "a")   = 2
     * StringUtils.countMatches("abba", "ab")  = 1
     * StringUtils.countMatches("abba", "xxx") = 0
     * </pre>
     *
     * @param str  the CharSequence to check, may be null
     * @param sub  the substring to count, may be null
     * @return the number of occurrences, 0 if either CharSequence is {@code null}
     * @since 3.0 Changed signature from countMatches(String, String) to countMatches(CharSequence, CharSequence)
     */
    public static int countMatches(final CharSequence str, final CharSequence sub) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(9441);
        __CLR4_5_25lh5lhlvha79yz.R.inc(9442);if ((((isEmpty(str) || isEmpty(sub))&&(__CLR4_5_25lh5lhlvha79yz.R.iget(9443)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(9444)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(9445);return 0;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(9446);int count = 0;
        __CLR4_5_25lh5lhlvha79yz.R.inc(9447);int idx = 0;
        __CLR4_5_25lh5lhlvha79yz.R.inc(9448);while ((idx = CharSequenceUtils.indexOf(str, sub, idx)) != INDEX_NOT_FOUND) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(9451);count++;
            __CLR4_5_25lh5lhlvha79yz.R.inc(9452);idx += sub.length();
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(9453);return count;
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    /**
     * <p>Counts how many times the char appears in the given string.</p>
     *
     * <p>A {@code null} or empty ("") String input returns {@code 0}.</p>
     *
     * <pre>
     * StringUtils.countMatches(null, *)       = 0
     * StringUtils.countMatches("", *)         = 0
     * StringUtils.countMatches("abba", 0)  = 0
     * StringUtils.countMatches("abba", 'a')   = 2
     * StringUtils.countMatches("abba", 'b')  = 2
     * StringUtils.countMatches("abba", 'x') = 0
     * </pre>
     *
     * @param str  the CharSequence to check, may be null
     * @param ch  the char to count
     * @return the number of occurrences, 0 if the CharSequence is {@code null}
     * @since 3.4
     */
    public static int countMatches(final CharSequence str, final char ch) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(9454);
        __CLR4_5_25lh5lhlvha79yz.R.inc(9455);if ((((isEmpty(str))&&(__CLR4_5_25lh5lhlvha79yz.R.iget(9456)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(9457)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(9458);return 0;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(9459);int count = 0;
        // We could also call str.toCharArray() for faster look ups but that would generate more garbage.
        __CLR4_5_25lh5lhlvha79yz.R.inc(9460);for (int i = 0; (((i < str.length())&&(__CLR4_5_25lh5lhlvha79yz.R.iget(9461)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(9462)==0&false)); i++) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(9463);if ((((ch == str.charAt(i))&&(__CLR4_5_25lh5lhlvha79yz.R.iget(9464)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(9465)==0&false))) {{
                __CLR4_5_25lh5lhlvha79yz.R.inc(9466);count++;
            }
        }}
        }__CLR4_5_25lh5lhlvha79yz.R.inc(9467);return count;
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    // Character Tests
    //-----------------------------------------------------------------------
    /**
     * <p>Checks if the CharSequence contains only Unicode letters.</p>
     *
     * <p>{@code null} will return {@code false}.
     * An empty CharSequence (length()=0) will return {@code false}.</p>
     *
     * <pre>
     * StringUtils.isAlpha(null)   = false
     * StringUtils.isAlpha("")     = false
     * StringUtils.isAlpha("  ")   = false
     * StringUtils.isAlpha("abc")  = true
     * StringUtils.isAlpha("ab2c") = false
     * StringUtils.isAlpha("ab-c") = false
     * </pre>
     *
     * @param cs  the CharSequence to check, may be null
     * @return {@code true} if only contains letters, and is non-null
     * @since 3.0 Changed signature from isAlpha(String) to isAlpha(CharSequence)
     * @since 3.0 Changed "" to return false and not true
     */
    public static boolean isAlpha(final CharSequence cs) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(9468);
        __CLR4_5_25lh5lhlvha79yz.R.inc(9469);if ((((isEmpty(cs))&&(__CLR4_5_25lh5lhlvha79yz.R.iget(9470)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(9471)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(9472);return false;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(9473);final int sz = cs.length();
        __CLR4_5_25lh5lhlvha79yz.R.inc(9474);for (int i = 0; (((i < sz)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(9475)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(9476)==0&false)); i++) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(9477);if ((((Character.isLetter(cs.charAt(i)) == false)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(9478)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(9479)==0&false))) {{
                __CLR4_5_25lh5lhlvha79yz.R.inc(9480);return false;
            }
        }}
        }__CLR4_5_25lh5lhlvha79yz.R.inc(9481);return true;
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    /**
     * <p>Checks if the CharSequence contains only Unicode letters and
     * space (' ').</p>
     *
     * <p>{@code null} will return {@code false}
     * An empty CharSequence (length()=0) will return {@code true}.</p>
     *
     * <pre>
     * StringUtils.isAlphaSpace(null)   = false
     * StringUtils.isAlphaSpace("")     = true
     * StringUtils.isAlphaSpace("  ")   = true
     * StringUtils.isAlphaSpace("abc")  = true
     * StringUtils.isAlphaSpace("ab c") = true
     * StringUtils.isAlphaSpace("ab2c") = false
     * StringUtils.isAlphaSpace("ab-c") = false
     * </pre>
     *
     * @param cs  the CharSequence to check, may be null
     * @return {@code true} if only contains letters and space,
     *  and is non-null
     * @since 3.0 Changed signature from isAlphaSpace(String) to isAlphaSpace(CharSequence)
     */
    public static boolean isAlphaSpace(final CharSequence cs) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(9482);
        __CLR4_5_25lh5lhlvha79yz.R.inc(9483);if ((((cs == null)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(9484)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(9485)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(9486);return false;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(9487);final int sz = cs.length();
        __CLR4_5_25lh5lhlvha79yz.R.inc(9488);for (int i = 0; (((i < sz)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(9489)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(9490)==0&false)); i++) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(9491);if ((((Character.isLetter(cs.charAt(i)) == false && cs.charAt(i) != ' ')&&(__CLR4_5_25lh5lhlvha79yz.R.iget(9492)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(9493)==0&false))) {{
                __CLR4_5_25lh5lhlvha79yz.R.inc(9494);return false;
            }
        }}
        }__CLR4_5_25lh5lhlvha79yz.R.inc(9495);return true;
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    /**
     * <p>Checks if the CharSequence contains only Unicode letters or digits.</p>
     *
     * <p>{@code null} will return {@code false}.
     * An empty CharSequence (length()=0) will return {@code false}.</p>
     *
     * <pre>
     * StringUtils.isAlphanumeric(null)   = false
     * StringUtils.isAlphanumeric("")     = false
     * StringUtils.isAlphanumeric("  ")   = false
     * StringUtils.isAlphanumeric("abc")  = true
     * StringUtils.isAlphanumeric("ab c") = false
     * StringUtils.isAlphanumeric("ab2c") = true
     * StringUtils.isAlphanumeric("ab-c") = false
     * </pre>
     *
     * @param cs  the CharSequence to check, may be null
     * @return {@code true} if only contains letters or digits,
     *  and is non-null
     * @since 3.0 Changed signature from isAlphanumeric(String) to isAlphanumeric(CharSequence)
     * @since 3.0 Changed "" to return false and not true
     */
    public static boolean isAlphanumeric(final CharSequence cs) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(9496);
        __CLR4_5_25lh5lhlvha79yz.R.inc(9497);if ((((isEmpty(cs))&&(__CLR4_5_25lh5lhlvha79yz.R.iget(9498)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(9499)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(9500);return false;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(9501);final int sz = cs.length();
        __CLR4_5_25lh5lhlvha79yz.R.inc(9502);for (int i = 0; (((i < sz)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(9503)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(9504)==0&false)); i++) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(9505);if ((((Character.isLetterOrDigit(cs.charAt(i)) == false)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(9506)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(9507)==0&false))) {{
                __CLR4_5_25lh5lhlvha79yz.R.inc(9508);return false;
            }
        }}
        }__CLR4_5_25lh5lhlvha79yz.R.inc(9509);return true;
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    /**
     * <p>Checks if the CharSequence contains only Unicode letters, digits
     * or space ({@code ' '}).</p>
     *
     * <p>{@code null} will return {@code false}.
     * An empty CharSequence (length()=0) will return {@code true}.</p>
     *
     * <pre>
     * StringUtils.isAlphanumericSpace(null)   = false
     * StringUtils.isAlphanumericSpace("")     = true
     * StringUtils.isAlphanumericSpace("  ")   = true
     * StringUtils.isAlphanumericSpace("abc")  = true
     * StringUtils.isAlphanumericSpace("ab c") = true
     * StringUtils.isAlphanumericSpace("ab2c") = true
     * StringUtils.isAlphanumericSpace("ab-c") = false
     * </pre>
     *
     * @param cs  the CharSequence to check, may be null
     * @return {@code true} if only contains letters, digits or space,
     *  and is non-null
     * @since 3.0 Changed signature from isAlphanumericSpace(String) to isAlphanumericSpace(CharSequence)
     */
    public static boolean isAlphanumericSpace(final CharSequence cs) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(9510);
        __CLR4_5_25lh5lhlvha79yz.R.inc(9511);if ((((cs == null)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(9512)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(9513)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(9514);return false;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(9515);final int sz = cs.length();
        __CLR4_5_25lh5lhlvha79yz.R.inc(9516);for (int i = 0; (((i < sz)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(9517)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(9518)==0&false)); i++) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(9519);if ((((Character.isLetterOrDigit(cs.charAt(i)) == false && cs.charAt(i) != ' ')&&(__CLR4_5_25lh5lhlvha79yz.R.iget(9520)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(9521)==0&false))) {{
                __CLR4_5_25lh5lhlvha79yz.R.inc(9522);return false;
            }
        }}
        }__CLR4_5_25lh5lhlvha79yz.R.inc(9523);return true;
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    /**
     * <p>Checks if the CharSequence contains only ASCII printable characters.</p>
     *
     * <p>{@code null} will return {@code false}.
     * An empty CharSequence (length()=0) will return {@code true}.</p>
     *
     * <pre>
     * StringUtils.isAsciiPrintable(null)     = false
     * StringUtils.isAsciiPrintable("")       = true
     * StringUtils.isAsciiPrintable(" ")      = true
     * StringUtils.isAsciiPrintable("Ceki")   = true
     * StringUtils.isAsciiPrintable("ab2c")   = true
     * StringUtils.isAsciiPrintable("!ab-c~") = true
     * StringUtils.isAsciiPrintable(" ") = true
     * StringUtils.isAsciiPrintable("!") = true
     * StringUtils.isAsciiPrintable("~") = true
     * StringUtils.isAsciiPrintable("") = false
     * StringUtils.isAsciiPrintable("Ceki G\u00fclc\u00fc") = false
     * </pre>
     *
     * @param cs the CharSequence to check, may be null
     * @return {@code true} if every character is in the range
     *  32 thru 126
     * @since 2.1
     * @since 3.0 Changed signature from isAsciiPrintable(String) to isAsciiPrintable(CharSequence)
     */
    public static boolean isAsciiPrintable(final CharSequence cs) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(9524);
        __CLR4_5_25lh5lhlvha79yz.R.inc(9525);if ((((cs == null)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(9526)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(9527)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(9528);return false;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(9529);final int sz = cs.length();
        __CLR4_5_25lh5lhlvha79yz.R.inc(9530);for (int i = 0; (((i < sz)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(9531)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(9532)==0&false)); i++) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(9533);if ((((CharUtils.isAsciiPrintable(cs.charAt(i)) == false)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(9534)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(9535)==0&false))) {{
                __CLR4_5_25lh5lhlvha79yz.R.inc(9536);return false;
            }
        }}
        }__CLR4_5_25lh5lhlvha79yz.R.inc(9537);return true;
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    /**
     * <p>Checks if the CharSequence contains only Unicode digits.
     * A decimal point is not a Unicode digit and returns false.</p>
     *
     * <p>{@code null} will return {@code false}.
     * An empty CharSequence (length()=0) will return {@code false}.</p>
     *
     * <p>Note that the method does not allow for a leading sign, either positive or negative.
     * Also, if a String passes the numeric test, it may still generate a NumberFormatException
     * when parsed by Integer.parseInt or Long.parseLong, e.g. if the value is outside the range
     * for int or long respectively.</p>
     *
     * <pre>
     * StringUtils.isNumeric(null)   = false
     * StringUtils.isNumeric("")     = false
     * StringUtils.isNumeric("  ")   = false
     * StringUtils.isNumeric("123")  = true
     * StringUtils.isNumeric("\u0967\u0968\u0969")  = true
     * StringUtils.isNumeric("12 3") = false
     * StringUtils.isNumeric("ab2c") = false
     * StringUtils.isNumeric("12-3") = false
     * StringUtils.isNumeric("12.3") = false
     * StringUtils.isNumeric("-123") = false
     * StringUtils.isNumeric("+123") = false
     * </pre>
     *
     * @param cs  the CharSequence to check, may be null
     * @return {@code true} if only contains digits, and is non-null
     * @since 3.0 Changed signature from isNumeric(String) to isNumeric(CharSequence)
     * @since 3.0 Changed "" to return false and not true
     */
    public static boolean isNumeric(final CharSequence cs) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(9538);
        __CLR4_5_25lh5lhlvha79yz.R.inc(9539);if ((((isEmpty(cs))&&(__CLR4_5_25lh5lhlvha79yz.R.iget(9540)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(9541)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(9542);return false;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(9543);final int sz = cs.length();
        __CLR4_5_25lh5lhlvha79yz.R.inc(9544);for (int i = 0; (((i < sz)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(9545)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(9546)==0&false)); i++) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(9547);if ((((!Character.isDigit(cs.charAt(i)))&&(__CLR4_5_25lh5lhlvha79yz.R.iget(9548)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(9549)==0&false))) {{
                __CLR4_5_25lh5lhlvha79yz.R.inc(9550);return false;
            }
        }}
        }__CLR4_5_25lh5lhlvha79yz.R.inc(9551);return true;
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    /**
     * <p>Checks if the CharSequence contains only Unicode digits or space
     * ({@code ' '}).
     * A decimal point is not a Unicode digit and returns false.</p>
     *
     * <p>{@code null} will return {@code false}.
     * An empty CharSequence (length()=0) will return {@code true}.</p>
     *
     * <pre>
     * StringUtils.isNumericSpace(null)   = false
     * StringUtils.isNumericSpace("")     = true
     * StringUtils.isNumericSpace("  ")   = true
     * StringUtils.isNumericSpace("123")  = true
     * StringUtils.isNumericSpace("12 3") = true
     * StringUtils.isNumeric("\u0967\u0968\u0969")  = true
     * StringUtils.isNumeric("\u0967\u0968 \u0969")  = true
     * StringUtils.isNumericSpace("ab2c") = false
     * StringUtils.isNumericSpace("12-3") = false
     * StringUtils.isNumericSpace("12.3") = false
     * </pre>
     *
     * @param cs  the CharSequence to check, may be null
     * @return {@code true} if only contains digits or space,
     *  and is non-null
     * @since 3.0 Changed signature from isNumericSpace(String) to isNumericSpace(CharSequence)
     */
    public static boolean isNumericSpace(final CharSequence cs) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(9552);
        __CLR4_5_25lh5lhlvha79yz.R.inc(9553);if ((((cs == null)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(9554)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(9555)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(9556);return false;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(9557);final int sz = cs.length();
        __CLR4_5_25lh5lhlvha79yz.R.inc(9558);for (int i = 0; (((i < sz)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(9559)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(9560)==0&false)); i++) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(9561);if ((((Character.isDigit(cs.charAt(i)) == false && cs.charAt(i) != ' ')&&(__CLR4_5_25lh5lhlvha79yz.R.iget(9562)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(9563)==0&false))) {{
                __CLR4_5_25lh5lhlvha79yz.R.inc(9564);return false;
            }
        }}
        }__CLR4_5_25lh5lhlvha79yz.R.inc(9565);return true;
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    /**
     * <p>Checks if the CharSequence contains only whitespace.</p>
     * 
     * <p>Whitespace is defined by {@link Character#isWhitespace(char)}.</p>
     *
     * <p>{@code null} will return {@code false}.
     * An empty CharSequence (length()=0) will return {@code true}.</p>
     *
     * <pre>
     * StringUtils.isWhitespace(null)   = false
     * StringUtils.isWhitespace("")     = true
     * StringUtils.isWhitespace("  ")   = true
     * StringUtils.isWhitespace("abc")  = false
     * StringUtils.isWhitespace("ab2c") = false
     * StringUtils.isWhitespace("ab-c") = false
     * </pre>
     *
     * @param cs  the CharSequence to check, may be null
     * @return {@code true} if only contains whitespace, and is non-null
     * @since 2.0
     * @since 3.0 Changed signature from isWhitespace(String) to isWhitespace(CharSequence)
     */
    public static boolean isWhitespace(final CharSequence cs) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(9566);
        __CLR4_5_25lh5lhlvha79yz.R.inc(9567);if ((((cs == null)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(9568)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(9569)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(9570);return false;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(9571);final int sz = cs.length();
        __CLR4_5_25lh5lhlvha79yz.R.inc(9572);for (int i = 0; (((i < sz)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(9573)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(9574)==0&false)); i++) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(9575);if ((((Character.isWhitespace(cs.charAt(i)) == false)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(9576)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(9577)==0&false))) {{
                __CLR4_5_25lh5lhlvha79yz.R.inc(9578);return false;
            }
        }}
        }__CLR4_5_25lh5lhlvha79yz.R.inc(9579);return true;
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    /**
     * <p>Checks if the CharSequence contains only lowercase characters.</p>
     *
     * <p>{@code null} will return {@code false}.
     * An empty CharSequence (length()=0) will return {@code false}.</p>
     *
     * <pre>
     * StringUtils.isAllLowerCase(null)   = false
     * StringUtils.isAllLowerCase("")     = false
     * StringUtils.isAllLowerCase("  ")   = false
     * StringUtils.isAllLowerCase("abc")  = true
     * StringUtils.isAllLowerCase("abC")  = false
     * StringUtils.isAllLowerCase("ab c") = false
     * StringUtils.isAllLowerCase("ab1c") = false
     * StringUtils.isAllLowerCase("ab/c") = false
     * </pre>
     *
     * @param cs  the CharSequence to check, may be null
     * @return {@code true} if only contains lowercase characters, and is non-null
     * @since 2.5
     * @since 3.0 Changed signature from isAllLowerCase(String) to isAllLowerCase(CharSequence)
     */
    public static boolean isAllLowerCase(final CharSequence cs) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(9580);
        __CLR4_5_25lh5lhlvha79yz.R.inc(9581);if ((((cs == null || isEmpty(cs))&&(__CLR4_5_25lh5lhlvha79yz.R.iget(9582)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(9583)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(9584);return false;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(9585);final int sz = cs.length();
        __CLR4_5_25lh5lhlvha79yz.R.inc(9586);for (int i = 0; (((i < sz)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(9587)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(9588)==0&false)); i++) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(9589);if ((((Character.isLowerCase(cs.charAt(i)) == false)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(9590)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(9591)==0&false))) {{
                __CLR4_5_25lh5lhlvha79yz.R.inc(9592);return false;
            }
        }}
        }__CLR4_5_25lh5lhlvha79yz.R.inc(9593);return true;
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    /**
     * <p>Checks if the CharSequence contains only uppercase characters.</p>
     *
     * <p>{@code null} will return {@code false}.
     * An empty String (length()=0) will return {@code false}.</p>
     *
     * <pre>
     * StringUtils.isAllUpperCase(null)   = false
     * StringUtils.isAllUpperCase("")     = false
     * StringUtils.isAllUpperCase("  ")   = false
     * StringUtils.isAllUpperCase("ABC")  = true
     * StringUtils.isAllUpperCase("aBC")  = false
     * StringUtils.isAllUpperCase("A C")  = false
     * StringUtils.isAllUpperCase("A1C")  = false
     * StringUtils.isAllUpperCase("A/C")  = false
     * </pre>
     *
     * @param cs the CharSequence to check, may be null
     * @return {@code true} if only contains uppercase characters, and is non-null
     * @since 2.5
     * @since 3.0 Changed signature from isAllUpperCase(String) to isAllUpperCase(CharSequence)
     */
    public static boolean isAllUpperCase(final CharSequence cs) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(9594);
        __CLR4_5_25lh5lhlvha79yz.R.inc(9595);if ((((cs == null || isEmpty(cs))&&(__CLR4_5_25lh5lhlvha79yz.R.iget(9596)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(9597)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(9598);return false;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(9599);final int sz = cs.length();
        __CLR4_5_25lh5lhlvha79yz.R.inc(9600);for (int i = 0; (((i < sz)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(9601)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(9602)==0&false)); i++) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(9603);if ((((Character.isUpperCase(cs.charAt(i)) == false)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(9604)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(9605)==0&false))) {{
                __CLR4_5_25lh5lhlvha79yz.R.inc(9606);return false;
            }
        }}
        }__CLR4_5_25lh5lhlvha79yz.R.inc(9607);return true;
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    // Defaults
    //-----------------------------------------------------------------------
    /**
     * <p>Returns either the passed in String,
     * or if the String is {@code null}, an empty String ("").</p>
     *
     * <pre>
     * StringUtils.defaultString(null)  = ""
     * StringUtils.defaultString("")    = ""
     * StringUtils.defaultString("bat") = "bat"
     * </pre>
     *
     * @see ObjectUtils#toString(Object)
     * @see String#valueOf(Object)
     * @param str  the String to check, may be null
     * @return the passed in String, or the empty String if it
     *  was {@code null}
     */
    public static String defaultString(final String str) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(9608);
        __CLR4_5_25lh5lhlvha79yz.R.inc(9609);return (((str == null )&&(__CLR4_5_25lh5lhlvha79yz.R.iget(9610)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(9611)==0&false))? EMPTY : str;
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    /**
     * <p>Returns either the passed in String, or if the String is
     * {@code null}, the value of {@code defaultStr}.</p>
     *
     * <pre>
     * StringUtils.defaultString(null, "NULL")  = "NULL"
     * StringUtils.defaultString("", "NULL")    = ""
     * StringUtils.defaultString("bat", "NULL") = "bat"
     * </pre>
     *
     * @see ObjectUtils#toString(Object,String)
     * @see String#valueOf(Object)
     * @param str  the String to check, may be null
     * @param defaultStr  the default String to return
     *  if the input is {@code null}, may be null
     * @return the passed in String, or the default if it was {@code null}
     */
    public static String defaultString(final String str, final String defaultStr) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(9612);
        __CLR4_5_25lh5lhlvha79yz.R.inc(9613);return (((str == null )&&(__CLR4_5_25lh5lhlvha79yz.R.iget(9614)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(9615)==0&false))? defaultStr : str;
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    /**
     * <p>Returns either the passed in CharSequence, or if the CharSequence is
     * whitespace, empty ("") or {@code null}, the value of {@code defaultStr}.</p>
     * 
     * <p>Whitespace is defined by {@link Character#isWhitespace(char)}.</p>
     *
     * <pre>
     * StringUtils.defaultIfBlank(null, "NULL")  = "NULL"
     * StringUtils.defaultIfBlank("", "NULL")    = "NULL"
     * StringUtils.defaultIfBlank(" ", "NULL")   = "NULL"
     * StringUtils.defaultIfBlank("bat", "NULL") = "bat"
     * StringUtils.defaultIfBlank("", null)      = null
     * </pre>
     * @param <T> the specific kind of CharSequence
     * @param str the CharSequence to check, may be null
     * @param defaultStr  the default CharSequence to return
     *  if the input is whitespace, empty ("") or {@code null}, may be null
     * @return the passed in CharSequence, or the default
     * @see StringUtils#defaultString(String, String)
     */
    public static <T extends CharSequence> T defaultIfBlank(final T str, final T defaultStr) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(9616);
        __CLR4_5_25lh5lhlvha79yz.R.inc(9617);return (((isBlank(str) )&&(__CLR4_5_25lh5lhlvha79yz.R.iget(9618)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(9619)==0&false))? defaultStr : str;
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    /**
     * <p>Returns either the passed in CharSequence, or if the CharSequence is
     * empty or {@code null}, the value of {@code defaultStr}.</p>
     *
     * <pre>
     * StringUtils.defaultIfEmpty(null, "NULL")  = "NULL"
     * StringUtils.defaultIfEmpty("", "NULL")    = "NULL"
     * StringUtils.defaultIfEmpty(" ", "NULL")   = " "
     * StringUtils.defaultIfEmpty("bat", "NULL") = "bat"
     * StringUtils.defaultIfEmpty("", null)      = null
     * </pre>
     * @param <T> the specific kind of CharSequence
     * @param str  the CharSequence to check, may be null
     * @param defaultStr  the default CharSequence to return
     *  if the input is empty ("") or {@code null}, may be null
     * @return the passed in CharSequence, or the default
     * @see StringUtils#defaultString(String, String)
     */
    public static <T extends CharSequence> T defaultIfEmpty(final T str, final T defaultStr) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(9620);
        __CLR4_5_25lh5lhlvha79yz.R.inc(9621);return (((isEmpty(str) )&&(__CLR4_5_25lh5lhlvha79yz.R.iget(9622)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(9623)==0&false))? defaultStr : str;
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    // Rotating (circular shift)
    //-----------------------------------------------------------------------
    /**
     * <p>Rotate (circular shift) a String of {@code shift} characters.</p>
     * <ul>
     *  <li>If {@code shift > 0}, right circular shift (ex : ABCDEF =&gt; FABCDE)</li>
     *  <li>If {@code shift < 0}, left circular shift (ex : ABCDEF =&gt; BCDEFA)</li>
     * </ul>
     *
     * <pre>
     * StringUtils.rotate(null, *)        = null
     * StringUtils.rotate("", *)          = ""
     * StringUtils.rotate("abcdefg", 0)   = "abcdefg"
     * StringUtils.rotate("abcdefg", 2)   = "fgabcde"
     * StringUtils.rotate("abcdefg", -2)  = "cdefgab"
     * StringUtils.rotate("abcdefg", 7)   = "abcdefg"
     * StringUtils.rotate("abcdefg", -7)  = "abcdefg"
     * StringUtils.rotate("abcdefg", 9)   = "fgabcde"
     * StringUtils.rotate("abcdefg", -9)  = "cdefgab"
     * </pre>
     *
     * @param str  the String to rotate, may be null
     * @param shift  number of time to shift (positive : right shift, negative : left shift)
     * @return the rotated String,
     *          or the original String if {@code shift == 0},
     *          or {@code null} if null String input
     * @since 3.5
     */
    public static String rotate(final String str, final int shift) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(9624);
        __CLR4_5_25lh5lhlvha79yz.R.inc(9625);if ((((str == null)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(9626)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(9627)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(9628);return null;
        }

        }__CLR4_5_25lh5lhlvha79yz.R.inc(9629);final int strLen = str.length();
        __CLR4_5_25lh5lhlvha79yz.R.inc(9630);if ((((shift == 0 || strLen == 0 || shift % strLen == 0)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(9631)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(9632)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(9633);return str;
        }

        }__CLR4_5_25lh5lhlvha79yz.R.inc(9634);final StringBuilder builder = new StringBuilder(strLen);
        __CLR4_5_25lh5lhlvha79yz.R.inc(9635);final int offset = - (shift % strLen);
        __CLR4_5_25lh5lhlvha79yz.R.inc(9636);builder.append(substring(str, offset));
        __CLR4_5_25lh5lhlvha79yz.R.inc(9637);builder.append(substring(str, 0, offset));
        __CLR4_5_25lh5lhlvha79yz.R.inc(9638);return builder.toString();
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    // Reversing
    //-----------------------------------------------------------------------
    /**
     * <p>Reverses a String as per {@link StringBuilder#reverse()}.</p>
     *
     * <p>A {@code null} String returns {@code null}.</p>
     *
     * <pre>
     * StringUtils.reverse(null)  = null
     * StringUtils.reverse("")    = ""
     * StringUtils.reverse("bat") = "tab"
     * </pre>
     *
     * @param str  the String to reverse, may be null
     * @return the reversed String, {@code null} if null String input
     */
    public static String reverse(final String str) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(9639);
        __CLR4_5_25lh5lhlvha79yz.R.inc(9640);if ((((str == null)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(9641)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(9642)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(9643);return null;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(9644);return new StringBuilder(str).reverse().toString();
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    /**
     * <p>Reverses a String that is delimited by a specific character.</p>
     *
     * <p>The Strings between the delimiters are not reversed.
     * Thus java.lang.String becomes String.lang.java (if the delimiter
     * is {@code '.'}).</p>
     *
     * <pre>
     * StringUtils.reverseDelimited(null, *)      = null
     * StringUtils.reverseDelimited("", *)        = ""
     * StringUtils.reverseDelimited("a.b.c", 'x') = "a.b.c"
     * StringUtils.reverseDelimited("a.b.c", ".") = "c.b.a"
     * </pre>
     *
     * @param str  the String to reverse, may be null
     * @param separatorChar  the separator character to use
     * @return the reversed String, {@code null} if null String input
     * @since 2.0
     */
    public static String reverseDelimited(final String str, final char separatorChar) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(9645);
        __CLR4_5_25lh5lhlvha79yz.R.inc(9646);if ((((str == null)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(9647)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(9648)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(9649);return null;
        }
        // could implement manually, but simple way is to reuse other,
        // probably slower, methods.
        }__CLR4_5_25lh5lhlvha79yz.R.inc(9650);final String[] strs = split(str, separatorChar);
        __CLR4_5_25lh5lhlvha79yz.R.inc(9651);ArrayUtils.reverse(strs);
        __CLR4_5_25lh5lhlvha79yz.R.inc(9652);return join(strs, separatorChar);
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    // Abbreviating
    //-----------------------------------------------------------------------
    /**
     * <p>Abbreviates a String using ellipses. This will turn
     * "Now is the time for all good men" into "Now is the time for..."</p>
     *
     * <p>Specifically:</p>
     * <ul>
     *   <li>If the number of characters in {@code str} is less than or equal to 
     *       {@code maxWidth}, return {@code str}.</li>
     *   <li>Else abbreviate it to {@code (substring(str, 0, max-3) + "...")}.</li>
     *   <li>If {@code maxWidth} is less than {@code 4}, throw an
     *       {@code IllegalArgumentException}.</li>
     *   <li>In no case will it return a String of length greater than
     *       {@code maxWidth}.</li>
     * </ul>
     *
     * <pre>
     * StringUtils.abbreviate(null, *)      = null
     * StringUtils.abbreviate("", 4)        = ""
     * StringUtils.abbreviate("abcdefg", 6) = "abc..."
     * StringUtils.abbreviate("abcdefg", 7) = "abcdefg"
     * StringUtils.abbreviate("abcdefg", 8) = "abcdefg"
     * StringUtils.abbreviate("abcdefg", 4) = "a..."
     * StringUtils.abbreviate("abcdefg", 3) = IllegalArgumentException
     * </pre>
     *
     * @param str  the String to check, may be null
     * @param maxWidth  maximum length of result String, must be at least 4
     * @return abbreviated String, {@code null} if null String input
     * @throws IllegalArgumentException if the width is too small
     * @since 2.0
     */
    public static String abbreviate(final String str, final int maxWidth) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(9653);
        __CLR4_5_25lh5lhlvha79yz.R.inc(9654);final String defaultAbbrevMarker = "...";
        __CLR4_5_25lh5lhlvha79yz.R.inc(9655);return abbreviate(str, defaultAbbrevMarker, 0, maxWidth);
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    /**
     * <p>Abbreviates a String using ellipses. This will turn
     * "Now is the time for all good men" into "...is the time for..."</p>
     *
     * <p>Works like {@code abbreviate(String, int)}, but allows you to specify
     * a "left edge" offset.  Note that this left edge is not necessarily going to
     * be the leftmost character in the result, or the first character following the
     * ellipses, but it will appear somewhere in the result.
     *
     * <p>In no case will it return a String of length greater than
     * {@code maxWidth}.</p>
     *
     * <pre>
     * StringUtils.abbreviate(null, *, *)                = null
     * StringUtils.abbreviate("", 0, 4)                  = ""
     * StringUtils.abbreviate("abcdefghijklmno", -1, 10) = "abcdefg..."
     * StringUtils.abbreviate("abcdefghijklmno", 0, 10)  = "abcdefg..."
     * StringUtils.abbreviate("abcdefghijklmno", 1, 10)  = "abcdefg..."
     * StringUtils.abbreviate("abcdefghijklmno", 4, 10)  = "abcdefg..."
     * StringUtils.abbreviate("abcdefghijklmno", 5, 10)  = "...fghi..."
     * StringUtils.abbreviate("abcdefghijklmno", 6, 10)  = "...ghij..."
     * StringUtils.abbreviate("abcdefghijklmno", 8, 10)  = "...ijklmno"
     * StringUtils.abbreviate("abcdefghijklmno", 10, 10) = "...ijklmno"
     * StringUtils.abbreviate("abcdefghijklmno", 12, 10) = "...ijklmno"
     * StringUtils.abbreviate("abcdefghij", 0, 3)        = IllegalArgumentException
     * StringUtils.abbreviate("abcdefghij", 5, 6)        = IllegalArgumentException
     * </pre>
     *
     * @param str  the String to check, may be null
     * @param offset  left edge of source String
     * @param maxWidth  maximum length of result String, must be at least 4
     * @return abbreviated String, {@code null} if null String input
     * @throws IllegalArgumentException if the width is too small
     * @since 2.0
     */
    public static String abbreviate(final String str, final int offset, final int maxWidth) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(9656);
        __CLR4_5_25lh5lhlvha79yz.R.inc(9657);final String defaultAbbrevMarker = "...";
        __CLR4_5_25lh5lhlvha79yz.R.inc(9658);return abbreviate(str, defaultAbbrevMarker, offset, maxWidth);
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    /**
     * <p>Abbreviates a String using another given String as replacement marker. This will turn
     * "Now is the time for all good men" into "Now is the time for..." if "..." was defined
     * as the replacement marker.</p>
     *
     * <p>Specifically:</p>
     * <ul>
     *   <li>If the number of characters in {@code str} is less than or equal to 
     *       {@code maxWidth}, return {@code str}.</li>
     *   <li>Else abbreviate it to {@code (substring(str, 0, max-abbrevMarker.length) + abbrevMarker)}.</li>
     *   <li>If {@code maxWidth} is less than {@code abbrevMarker.length + 1}, throw an
     *       {@code IllegalArgumentException}.</li>
     *   <li>In no case will it return a String of length greater than
     *       {@code maxWidth}.</li>
     * </ul>
     *
     * <pre>
     * StringUtils.abbreviate(null, "...", *)      = null
     * StringUtils.abbreviate("abcdefg", null, *)  = "abcdefg"
     * StringUtils.abbreviate("", "...", 4)        = ""
     * StringUtils.abbreviate("abcdefg", ".", 5)   = "abcd."
     * StringUtils.abbreviate("abcdefg", ".", 7)   = "abcdefg"
     * StringUtils.abbreviate("abcdefg", ".", 8)   = "abcdefg"
     * StringUtils.abbreviate("abcdefg", "..", 4)  = "ab.."
     * StringUtils.abbreviate("abcdefg", "..", 3)  = "a.."
     * StringUtils.abbreviate("abcdefg", "..", 2)  = IllegalArgumentException
     * StringUtils.abbreviate("abcdefg", "...", 3) = IllegalArgumentException
     * </pre>
     *
     * @param str  the String to check, may be null
     * @param abbrevMarker  the String used as replacement marker
     * @param maxWidth  maximum length of result String, must be at least {@code abbrevMarker.length + 1}
     * @return abbreviated String, {@code null} if null String input
     * @throws IllegalArgumentException if the width is too small
     * @since 3.6
     */
    public static String abbreviate(final String str, final String abbrevMarker, final int maxWidth) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(9659);
        __CLR4_5_25lh5lhlvha79yz.R.inc(9660);return abbreviate(str, abbrevMarker, 0, maxWidth);
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    /**
     * <p>Abbreviates a String using a given replacement marker. This will turn
     * "Now is the time for all good men" into "...is the time for..." if "..." was defined
     * as the replacement marker.</p>
     *
     * <p>Works like {@code abbreviate(String, String, int)}, but allows you to specify
     * a "left edge" offset.  Note that this left edge is not necessarily going to
     * be the leftmost character in the result, or the first character following the
     * replacement marker, but it will appear somewhere in the result.
     *
     * <p>In no case will it return a String of length greater than {@code maxWidth}.</p>
     *
     * <pre>
     * StringUtils.abbreviate(null, null, *, *)                 = null
     * StringUtils.abbreviate("abcdefghijklmno", null, *, *)    = "abcdefghijklmno"
     * StringUtils.abbreviate("", "...", 0, 4)                  = ""
     * StringUtils.abbreviate("abcdefghijklmno", "---", -1, 10) = "abcdefg---"
     * StringUtils.abbreviate("abcdefghijklmno", ",", 0, 10)    = "abcdefghi,"
     * StringUtils.abbreviate("abcdefghijklmno", ",", 1, 10)    = "abcdefghi,"
     * StringUtils.abbreviate("abcdefghijklmno", ",", 2, 10)    = "abcdefghi,"
     * StringUtils.abbreviate("abcdefghijklmno", "::", 4, 10)   = "::efghij::"
     * StringUtils.abbreviate("abcdefghijklmno", "...", 6, 10)  = "...ghij..."
     * StringUtils.abbreviate("abcdefghijklmno", "*", 9, 10)    = "*ghijklmno"
     * StringUtils.abbreviate("abcdefghijklmno", "'", 10, 10)   = "'ghijklmno"
     * StringUtils.abbreviate("abcdefghijklmno", "!", 12, 10)   = "!ghijklmno"
     * StringUtils.abbreviate("abcdefghij", "abra", 0, 4)       = IllegalArgumentException
     * StringUtils.abbreviate("abcdefghij", "...", 5, 6)        = IllegalArgumentException
     * </pre>
     *
     * @param str  the String to check, may be null
     * @param abbrevMarker  the String used as replacement marker
     * @param offset  left edge of source String
     * @param maxWidth  maximum length of result String, must be at least 4
     * @return abbreviated String, {@code null} if null String input
     * @throws IllegalArgumentException if the width is too small
     * @since 3.6
     */
    public static String abbreviate(final String str, final String abbrevMarker, int offset, final int maxWidth) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(9661);
        __CLR4_5_25lh5lhlvha79yz.R.inc(9662);if ((((isEmpty(str) || isEmpty(abbrevMarker))&&(__CLR4_5_25lh5lhlvha79yz.R.iget(9663)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(9664)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(9665);return str;
        }

        }__CLR4_5_25lh5lhlvha79yz.R.inc(9666);final int abbrevMarkerLength = abbrevMarker.length();
        __CLR4_5_25lh5lhlvha79yz.R.inc(9667);final int minAbbrevWidth = abbrevMarkerLength + 1;
        __CLR4_5_25lh5lhlvha79yz.R.inc(9668);final int minAbbrevWidthOffset = abbrevMarkerLength + abbrevMarkerLength + 1;

        __CLR4_5_25lh5lhlvha79yz.R.inc(9669);if ((((maxWidth < minAbbrevWidth)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(9670)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(9671)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(9672);throw new IllegalArgumentException(String.format("Minimum abbreviation width is %d", minAbbrevWidth));
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(9673);if ((((str.length() <= maxWidth)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(9674)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(9675)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(9676);return str;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(9677);if ((((offset > str.length())&&(__CLR4_5_25lh5lhlvha79yz.R.iget(9678)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(9679)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(9680);offset = str.length();
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(9681);if ((((str.length() - offset < maxWidth - abbrevMarkerLength)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(9682)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(9683)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(9684);offset = str.length() - (maxWidth - abbrevMarkerLength);
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(9685);if ((((offset <= abbrevMarkerLength+1)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(9686)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(9687)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(9688);return str.substring(0, maxWidth - abbrevMarkerLength) + abbrevMarker;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(9689);if ((((maxWidth < minAbbrevWidthOffset)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(9690)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(9691)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(9692);throw new IllegalArgumentException(String.format("Minimum abbreviation width with offset is %d", minAbbrevWidthOffset));
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(9693);if ((((offset + maxWidth - abbrevMarkerLength < str.length())&&(__CLR4_5_25lh5lhlvha79yz.R.iget(9694)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(9695)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(9696);return abbrevMarker + abbreviate(str.substring(offset), abbrevMarker, maxWidth - abbrevMarkerLength);
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(9697);return abbrevMarker + str.substring(str.length() - (maxWidth - abbrevMarkerLength));
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    /**
     * <p>Abbreviates a String to the length passed, replacing the middle characters with the supplied
     * replacement String.</p>
     *
     * <p>This abbreviation only occurs if the following criteria is met:</p>
     * <ul>
     * <li>Neither the String for abbreviation nor the replacement String are null or empty </li>
     * <li>The length to truncate to is less than the length of the supplied String</li>
     * <li>The length to truncate to is greater than 0</li>
     * <li>The abbreviated String will have enough room for the length supplied replacement String
     * and the first and last characters of the supplied String for abbreviation</li>
     * </ul>
     * <p>Otherwise, the returned String will be the same as the supplied String for abbreviation.
     * </p>
     *
     * <pre>
     * StringUtils.abbreviateMiddle(null, null, 0)      = null
     * StringUtils.abbreviateMiddle("abc", null, 0)      = "abc"
     * StringUtils.abbreviateMiddle("abc", ".", 0)      = "abc"
     * StringUtils.abbreviateMiddle("abc", ".", 3)      = "abc"
     * StringUtils.abbreviateMiddle("abcdef", ".", 4)     = "ab.f"
     * </pre>
     *
     * @param str  the String to abbreviate, may be null
     * @param middle the String to replace the middle characters with, may be null
     * @param length the length to abbreviate {@code str} to.
     * @return the abbreviated String if the above criteria is met, or the original String supplied for abbreviation.
     * @since 2.5
     */
    public static String abbreviateMiddle(final String str, final String middle, final int length) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(9698);
        __CLR4_5_25lh5lhlvha79yz.R.inc(9699);if ((((isEmpty(str) || isEmpty(middle))&&(__CLR4_5_25lh5lhlvha79yz.R.iget(9700)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(9701)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(9702);return str;
        }

        }__CLR4_5_25lh5lhlvha79yz.R.inc(9703);if ((((length >= str.length() || length < middle.length()+2)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(9704)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(9705)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(9706);return str;
        }

        }__CLR4_5_25lh5lhlvha79yz.R.inc(9707);final int targetSting = length-middle.length();
        __CLR4_5_25lh5lhlvha79yz.R.inc(9708);final int startOffset = targetSting/2+targetSting%2;
        __CLR4_5_25lh5lhlvha79yz.R.inc(9709);final int endOffset = str.length()-targetSting/2;

        __CLR4_5_25lh5lhlvha79yz.R.inc(9710);final StringBuilder builder = new StringBuilder(length);
        __CLR4_5_25lh5lhlvha79yz.R.inc(9711);builder.append(str.substring(0,startOffset));
        __CLR4_5_25lh5lhlvha79yz.R.inc(9712);builder.append(middle);
        __CLR4_5_25lh5lhlvha79yz.R.inc(9713);builder.append(str.substring(endOffset));

        __CLR4_5_25lh5lhlvha79yz.R.inc(9714);return builder.toString();
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    // Difference
    //-----------------------------------------------------------------------
    /**
     * <p>Compares two Strings, and returns the portion where they differ.
     * More precisely, return the remainder of the second String,
     * starting from where it's different from the first. This means that
     * the difference between "abc" and "ab" is the empty String and not "c". </p>
     *
     * <p>For example,
     * {@code difference("i am a machine", "i am a robot") -> "robot"}.</p>
     *
     * <pre>
     * StringUtils.difference(null, null) = null
     * StringUtils.difference("", "") = ""
     * StringUtils.difference("", "abc") = "abc"
     * StringUtils.difference("abc", "") = ""
     * StringUtils.difference("abc", "abc") = ""
     * StringUtils.difference("abc", "ab") = ""
     * StringUtils.difference("ab", "abxyz") = "xyz"
     * StringUtils.difference("abcde", "abxyz") = "xyz"
     * StringUtils.difference("abcde", "xyz") = "xyz"
     * </pre>
     *
     * @param str1  the first String, may be null
     * @param str2  the second String, may be null
     * @return the portion of str2 where it differs from str1; returns the
     * empty String if they are equal
     * @see #indexOfDifference(CharSequence,CharSequence)
     * @since 2.0
     */
    public static String difference(final String str1, final String str2) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(9715);
        __CLR4_5_25lh5lhlvha79yz.R.inc(9716);if ((((str1 == null)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(9717)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(9718)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(9719);return str2;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(9720);if ((((str2 == null)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(9721)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(9722)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(9723);return str1;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(9724);final int at = indexOfDifference(str1, str2);
        __CLR4_5_25lh5lhlvha79yz.R.inc(9725);if ((((at == INDEX_NOT_FOUND)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(9726)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(9727)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(9728);return EMPTY;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(9729);return str2.substring(at);
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    /**
     * <p>Compares two CharSequences, and returns the index at which the
     * CharSequences begin to differ.</p>
     *
     * <p>For example,
     * {@code indexOfDifference("i am a machine", "i am a robot") -> 7}</p>
     *
     * <pre>
     * StringUtils.indexOfDifference(null, null) = -1
     * StringUtils.indexOfDifference("", "") = -1
     * StringUtils.indexOfDifference("", "abc") = 0
     * StringUtils.indexOfDifference("abc", "") = 0
     * StringUtils.indexOfDifference("abc", "abc") = -1
     * StringUtils.indexOfDifference("ab", "abxyz") = 2
     * StringUtils.indexOfDifference("abcde", "abxyz") = 2
     * StringUtils.indexOfDifference("abcde", "xyz") = 0
     * </pre>
     *
     * @param cs1  the first CharSequence, may be null
     * @param cs2  the second CharSequence, may be null
     * @return the index where cs1 and cs2 begin to differ; -1 if they are equal
     * @since 2.0
     * @since 3.0 Changed signature from indexOfDifference(String, String) to
     * indexOfDifference(CharSequence, CharSequence)
     */
    public static int indexOfDifference(final CharSequence cs1, final CharSequence cs2) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(9730);
        __CLR4_5_25lh5lhlvha79yz.R.inc(9731);if ((((cs1 == cs2)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(9732)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(9733)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(9734);return INDEX_NOT_FOUND;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(9735);if ((((cs1 == null || cs2 == null)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(9736)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(9737)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(9738);return 0;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(9739);int i;
        __CLR4_5_25lh5lhlvha79yz.R.inc(9740);for (i = 0; (((i < cs1.length() && i < cs2.length())&&(__CLR4_5_25lh5lhlvha79yz.R.iget(9741)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(9742)==0&false)); ++i) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(9743);if ((((cs1.charAt(i) != cs2.charAt(i))&&(__CLR4_5_25lh5lhlvha79yz.R.iget(9744)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(9745)==0&false))) {{
                __CLR4_5_25lh5lhlvha79yz.R.inc(9746);break;
            }
        }}
        }__CLR4_5_25lh5lhlvha79yz.R.inc(9747);if ((((i < cs2.length() || i < cs1.length())&&(__CLR4_5_25lh5lhlvha79yz.R.iget(9748)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(9749)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(9750);return i;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(9751);return INDEX_NOT_FOUND;
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    /**
     * <p>Compares all CharSequences in an array and returns the index at which the
     * CharSequences begin to differ.</p>
     *
     * <p>For example,
     * <code>indexOfDifference(new String[] {"i am a machine", "i am a robot"}) -&gt; 7</code></p>
     *
     * <pre>
     * StringUtils.indexOfDifference(null) = -1
     * StringUtils.indexOfDifference(new String[] {}) = -1
     * StringUtils.indexOfDifference(new String[] {"abc"}) = -1
     * StringUtils.indexOfDifference(new String[] {null, null}) = -1
     * StringUtils.indexOfDifference(new String[] {"", ""}) = -1
     * StringUtils.indexOfDifference(new String[] {"", null}) = 0
     * StringUtils.indexOfDifference(new String[] {"abc", null, null}) = 0
     * StringUtils.indexOfDifference(new String[] {null, null, "abc"}) = 0
     * StringUtils.indexOfDifference(new String[] {"", "abc"}) = 0
     * StringUtils.indexOfDifference(new String[] {"abc", ""}) = 0
     * StringUtils.indexOfDifference(new String[] {"abc", "abc"}) = -1
     * StringUtils.indexOfDifference(new String[] {"abc", "a"}) = 1
     * StringUtils.indexOfDifference(new String[] {"ab", "abxyz"}) = 2
     * StringUtils.indexOfDifference(new String[] {"abcde", "abxyz"}) = 2
     * StringUtils.indexOfDifference(new String[] {"abcde", "xyz"}) = 0
     * StringUtils.indexOfDifference(new String[] {"xyz", "abcde"}) = 0
     * StringUtils.indexOfDifference(new String[] {"i am a machine", "i am a robot"}) = 7
     * </pre>
     *
     * @param css  array of CharSequences, entries may be null
     * @return the index where the strings begin to differ; -1 if they are all equal
     * @since 2.4
     * @since 3.0 Changed signature from indexOfDifference(String...) to indexOfDifference(CharSequence...)
     */
    public static int indexOfDifference(final CharSequence... css) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(9752);
        __CLR4_5_25lh5lhlvha79yz.R.inc(9753);if ((((css == null || css.length <= 1)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(9754)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(9755)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(9756);return INDEX_NOT_FOUND;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(9757);boolean anyStringNull = false;
        __CLR4_5_25lh5lhlvha79yz.R.inc(9758);boolean allStringsNull = true;
        __CLR4_5_25lh5lhlvha79yz.R.inc(9759);final int arrayLen = css.length;
        __CLR4_5_25lh5lhlvha79yz.R.inc(9760);int shortestStrLen = Integer.MAX_VALUE;
        __CLR4_5_25lh5lhlvha79yz.R.inc(9761);int longestStrLen = 0;

        // find the min and max string lengths; this avoids checking to make
        // sure we are not exceeding the length of the string each time through
        // the bottom loop.
        __CLR4_5_25lh5lhlvha79yz.R.inc(9762);for (CharSequence cs : css) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(9763);if ((((cs == null)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(9764)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(9765)==0&false))) {{
                __CLR4_5_25lh5lhlvha79yz.R.inc(9766);anyStringNull = true;
                __CLR4_5_25lh5lhlvha79yz.R.inc(9767);shortestStrLen = 0;
            } }else {{
                __CLR4_5_25lh5lhlvha79yz.R.inc(9768);allStringsNull = false;
                __CLR4_5_25lh5lhlvha79yz.R.inc(9769);shortestStrLen = Math.min(cs.length(), shortestStrLen);
                __CLR4_5_25lh5lhlvha79yz.R.inc(9770);longestStrLen = Math.max(cs.length(), longestStrLen);
            }
        }}

        // handle lists containing all nulls or all empty strings
        }__CLR4_5_25lh5lhlvha79yz.R.inc(9771);if ((((allStringsNull || longestStrLen == 0 && !anyStringNull)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(9772)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(9773)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(9774);return INDEX_NOT_FOUND;
        }

        // handle lists containing some nulls or some empty strings
        }__CLR4_5_25lh5lhlvha79yz.R.inc(9775);if ((((shortestStrLen == 0)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(9776)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(9777)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(9778);return 0;
        }

        // find the position with the first difference across all strings
        }__CLR4_5_25lh5lhlvha79yz.R.inc(9779);int firstDiff = -1;
        __CLR4_5_25lh5lhlvha79yz.R.inc(9780);for (int stringPos = 0; (((stringPos < shortestStrLen)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(9781)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(9782)==0&false)); stringPos++) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(9783);final char comparisonChar = css[0].charAt(stringPos);
            __CLR4_5_25lh5lhlvha79yz.R.inc(9784);for (int arrayPos = 1; (((arrayPos < arrayLen)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(9785)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(9786)==0&false)); arrayPos++) {{
                __CLR4_5_25lh5lhlvha79yz.R.inc(9787);if ((((css[arrayPos].charAt(stringPos) != comparisonChar)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(9788)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(9789)==0&false))) {{
                    __CLR4_5_25lh5lhlvha79yz.R.inc(9790);firstDiff = stringPos;
                    __CLR4_5_25lh5lhlvha79yz.R.inc(9791);break;
                }
            }}
            }__CLR4_5_25lh5lhlvha79yz.R.inc(9792);if ((((firstDiff != -1)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(9793)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(9794)==0&false))) {{
                __CLR4_5_25lh5lhlvha79yz.R.inc(9795);break;
            }
        }}

        }__CLR4_5_25lh5lhlvha79yz.R.inc(9796);if ((((firstDiff == -1 && shortestStrLen != longestStrLen)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(9797)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(9798)==0&false))) {{
            // we compared all of the characters up to the length of the
            // shortest string and didn't find a match, but the string lengths
            // vary, so return the length of the shortest string.
            __CLR4_5_25lh5lhlvha79yz.R.inc(9799);return shortestStrLen;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(9800);return firstDiff;
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    /**
     * <p>Compares all Strings in an array and returns the initial sequence of
     * characters that is common to all of them.</p>
     *
     * <p>For example,
     * <code>getCommonPrefix(new String[] {"i am a machine", "i am a robot"}) -&gt; "i am a "</code></p>
     *
     * <pre>
     * StringUtils.getCommonPrefix(null) = ""
     * StringUtils.getCommonPrefix(new String[] {}) = ""
     * StringUtils.getCommonPrefix(new String[] {"abc"}) = "abc"
     * StringUtils.getCommonPrefix(new String[] {null, null}) = ""
     * StringUtils.getCommonPrefix(new String[] {"", ""}) = ""
     * StringUtils.getCommonPrefix(new String[] {"", null}) = ""
     * StringUtils.getCommonPrefix(new String[] {"abc", null, null}) = ""
     * StringUtils.getCommonPrefix(new String[] {null, null, "abc"}) = ""
     * StringUtils.getCommonPrefix(new String[] {"", "abc"}) = ""
     * StringUtils.getCommonPrefix(new String[] {"abc", ""}) = ""
     * StringUtils.getCommonPrefix(new String[] {"abc", "abc"}) = "abc"
     * StringUtils.getCommonPrefix(new String[] {"abc", "a"}) = "a"
     * StringUtils.getCommonPrefix(new String[] {"ab", "abxyz"}) = "ab"
     * StringUtils.getCommonPrefix(new String[] {"abcde", "abxyz"}) = "ab"
     * StringUtils.getCommonPrefix(new String[] {"abcde", "xyz"}) = ""
     * StringUtils.getCommonPrefix(new String[] {"xyz", "abcde"}) = ""
     * StringUtils.getCommonPrefix(new String[] {"i am a machine", "i am a robot"}) = "i am a "
     * </pre>
     *
     * @param strs  array of String objects, entries may be null
     * @return the initial sequence of characters that are common to all Strings
     * in the array; empty String if the array is null, the elements are all null
     * or if there is no common prefix.
     * @since 2.4
     */
    public static String getCommonPrefix(final String... strs) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(9801);
        __CLR4_5_25lh5lhlvha79yz.R.inc(9802);if ((((strs == null || strs.length == 0)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(9803)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(9804)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(9805);return EMPTY;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(9806);final int smallestIndexOfDiff = indexOfDifference(strs);
        __CLR4_5_25lh5lhlvha79yz.R.inc(9807);if ((((smallestIndexOfDiff == INDEX_NOT_FOUND)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(9808)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(9809)==0&false))) {{
            // all strings were identical
            __CLR4_5_25lh5lhlvha79yz.R.inc(9810);if ((((strs[0] == null)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(9811)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(9812)==0&false))) {{
                __CLR4_5_25lh5lhlvha79yz.R.inc(9813);return EMPTY;
            }
            }__CLR4_5_25lh5lhlvha79yz.R.inc(9814);return strs[0];
        } }else {__CLR4_5_25lh5lhlvha79yz.R.inc(9815);if ((((smallestIndexOfDiff == 0)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(9816)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(9817)==0&false))) {{
            // there were no common initial characters
            __CLR4_5_25lh5lhlvha79yz.R.inc(9818);return EMPTY;
        } }else {{
            // we found a common initial character sequence
            __CLR4_5_25lh5lhlvha79yz.R.inc(9819);return strs[0].substring(0, smallestIndexOfDiff);
        }
    }}}finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    // Misc
    //-----------------------------------------------------------------------
    /**
     * <p>Find the Levenshtein distance between two Strings.</p>
     *
     * <p>This is the number of changes needed to change one String into
     * another, where each change is a single character modification (deletion,
     * insertion or substitution).</p>
     *
     * <p>The implementation uses a single-dimensional array of length s.length() + 1. See 
     * <a href="http://blog.softwx.net/2014/12/optimizing-levenshtein-algorithm-in-c.html">
     * http://blog.softwx.net/2014/12/optimizing-levenshtein-algorithm-in-c.html</a> for details.</p>
     *
     * <pre>
     * StringUtils.getLevenshteinDistance(null, *)             = IllegalArgumentException
     * StringUtils.getLevenshteinDistance(*, null)             = IllegalArgumentException
     * StringUtils.getLevenshteinDistance("","")               = 0
     * StringUtils.getLevenshteinDistance("","a")              = 1
     * StringUtils.getLevenshteinDistance("aaapppp", "")       = 7
     * StringUtils.getLevenshteinDistance("frog", "fog")       = 1
     * StringUtils.getLevenshteinDistance("fly", "ant")        = 3
     * StringUtils.getLevenshteinDistance("elephant", "hippo") = 7
     * StringUtils.getLevenshteinDistance("hippo", "elephant") = 7
     * StringUtils.getLevenshteinDistance("hippo", "zzzzzzzz") = 8
     * StringUtils.getLevenshteinDistance("hello", "hallo")    = 1
     * </pre>
     *
     * @param s  the first String, must not be null
     * @param t  the second String, must not be null
     * @return result distance
     * @throws IllegalArgumentException if either String input {@code null}
     * @since 3.0 Changed signature from getLevenshteinDistance(String, String) to
     * getLevenshteinDistance(CharSequence, CharSequence)
     * @deprecated as of 3.6, use commons-text
     * <a href="https://commons.apache.org/proper/commons-text/javadocs/api-release/org/apache/commons/text/similarity/LevenshteinDistance.html">
     * LevenshteinDistance</a> instead
     */
    @Deprecated
    public static int getLevenshteinDistance(CharSequence s, CharSequence t) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(9820);
        __CLR4_5_25lh5lhlvha79yz.R.inc(9821);if ((((s == null || t == null)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(9822)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(9823)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(9824);throw new IllegalArgumentException("Strings must not be null");
        }

        }__CLR4_5_25lh5lhlvha79yz.R.inc(9825);int n = s.length();
        __CLR4_5_25lh5lhlvha79yz.R.inc(9826);int m = t.length();

        __CLR4_5_25lh5lhlvha79yz.R.inc(9827);if ((((n == 0)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(9828)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(9829)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(9830);return m;
        } }else {__CLR4_5_25lh5lhlvha79yz.R.inc(9831);if ((((m == 0)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(9832)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(9833)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(9834);return n;
        }

        }}__CLR4_5_25lh5lhlvha79yz.R.inc(9835);if ((((n > m)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(9836)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(9837)==0&false))) {{
            // swap the input strings to consume less memory
            __CLR4_5_25lh5lhlvha79yz.R.inc(9838);final CharSequence tmp = s;
            __CLR4_5_25lh5lhlvha79yz.R.inc(9839);s = t;
            __CLR4_5_25lh5lhlvha79yz.R.inc(9840);t = tmp;
            __CLR4_5_25lh5lhlvha79yz.R.inc(9841);n = m;
            __CLR4_5_25lh5lhlvha79yz.R.inc(9842);m = t.length();
        }

        }__CLR4_5_25lh5lhlvha79yz.R.inc(9843);final int p[] = new int[n + 1];
        // indexes into strings s and t
        __CLR4_5_25lh5lhlvha79yz.R.inc(9844);int i; // iterates through s
        __CLR4_5_25lh5lhlvha79yz.R.inc(9845);int j; // iterates through t
        __CLR4_5_25lh5lhlvha79yz.R.inc(9846);int upper_left;
        __CLR4_5_25lh5lhlvha79yz.R.inc(9847);int upper;

        __CLR4_5_25lh5lhlvha79yz.R.inc(9848);char t_j; // jth character of t
        __CLR4_5_25lh5lhlvha79yz.R.inc(9849);int cost;

        __CLR4_5_25lh5lhlvha79yz.R.inc(9850);for (i = 0; (((i <= n)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(9851)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(9852)==0&false)); i++) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(9853);p[i] = i;
        }

        }__CLR4_5_25lh5lhlvha79yz.R.inc(9854);for (j = 1; (((j <= m)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(9855)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(9856)==0&false)); j++) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(9857);upper_left = p[0];
            __CLR4_5_25lh5lhlvha79yz.R.inc(9858);t_j = t.charAt(j - 1);
            __CLR4_5_25lh5lhlvha79yz.R.inc(9859);p[0] = j;

            __CLR4_5_25lh5lhlvha79yz.R.inc(9860);for (i = 1; (((i <= n)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(9861)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(9862)==0&false)); i++) {{
                __CLR4_5_25lh5lhlvha79yz.R.inc(9863);upper = p[i];
                __CLR4_5_25lh5lhlvha79yz.R.inc(9864);cost = (((s.charAt(i - 1) == t_j )&&(__CLR4_5_25lh5lhlvha79yz.R.iget(9865)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(9866)==0&false))? 0 : 1;
                // minimum of cell to the left+1, to the top+1, diagonally left and up +cost
                __CLR4_5_25lh5lhlvha79yz.R.inc(9867);p[i] = Math.min(Math.min(p[i - 1] + 1, p[i] + 1), upper_left + cost);
                __CLR4_5_25lh5lhlvha79yz.R.inc(9868);upper_left = upper;
            }
        }}

        }__CLR4_5_25lh5lhlvha79yz.R.inc(9869);return p[n];
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    /**
     * <p>Find the Levenshtein distance between two Strings if it's less than or equal to a given
     * threshold.</p>
     *
     * <p>This is the number of changes needed to change one String into
     * another, where each change is a single character modification (deletion,
     * insertion or substitution).</p>
     *
     * <p>This implementation follows from Algorithms on Strings, Trees and Sequences by Dan Gusfield
     * and Chas Emerick's implementation of the Levenshtein distance algorithm from
     * <a href="http://www.merriampark.com/ld.htm">http://www.merriampark.com/ld.htm</a></p>
     *
     * <pre>
     * StringUtils.getLevenshteinDistance(null, *, *)             = IllegalArgumentException
     * StringUtils.getLevenshteinDistance(*, null, *)             = IllegalArgumentException
     * StringUtils.getLevenshteinDistance(*, *, -1)               = IllegalArgumentException
     * StringUtils.getLevenshteinDistance("","", 0)               = 0
     * StringUtils.getLevenshteinDistance("aaapppp", "", 8)       = 7
     * StringUtils.getLevenshteinDistance("aaapppp", "", 7)       = 7
     * StringUtils.getLevenshteinDistance("aaapppp", "", 6))      = -1
     * StringUtils.getLevenshteinDistance("elephant", "hippo", 7) = 7
     * StringUtils.getLevenshteinDistance("elephant", "hippo", 6) = -1
     * StringUtils.getLevenshteinDistance("hippo", "elephant", 7) = 7
     * StringUtils.getLevenshteinDistance("hippo", "elephant", 6) = -1
     * </pre>
     *
     * @param s  the first String, must not be null
     * @param t  the second String, must not be null
     * @param threshold the target threshold, must not be negative
     * @return result distance, or {@code -1} if the distance would be greater than the threshold
     * @throws IllegalArgumentException if either String input {@code null} or negative threshold
     * @deprecated as of 3.6, use commons-text
     * <a href="https://commons.apache.org/proper/commons-text/javadocs/api-release/org/apache/commons/text/similarity/LevenshteinDistance.html">
     * LevenshteinDistance</a> instead
     */
    @Deprecated
    public static int getLevenshteinDistance(CharSequence s, CharSequence t, final int threshold) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(9870);
        __CLR4_5_25lh5lhlvha79yz.R.inc(9871);if ((((s == null || t == null)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(9872)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(9873)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(9874);throw new IllegalArgumentException("Strings must not be null");
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(9875);if ((((threshold < 0)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(9876)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(9877)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(9878);throw new IllegalArgumentException("Threshold must not be negative");
        }

        /*
        This implementation only computes the distance if it's less than or equal to the
        threshold value, returning -1 if it's greater.  The advantage is performance: unbounded
        distance is O(nm), but a bound of k allows us to reduce it to O(km) time by only
        computing a diagonal stripe of width 2k + 1 of the cost table.
        It is also possible to use this to compute the unbounded Levenshtein distance by starting
        the threshold at 1 and doubling each time until the distance is found; this is O(dm), where
        d is the distance.

        One subtlety comes from needing to ignore entries on the border of our stripe
        eg.
        p[] = |#|#|#|*
        d[] =  *|#|#|#|
        We must ignore the entry to the left of the leftmost member
        We must ignore the entry above the rightmost member

        Another subtlety comes from our stripe running off the matrix if the strings aren't
        of the same size.  Since string s is always swapped to be the shorter of the two,
        the stripe will always run off to the upper right instead of the lower left of the matrix.

        As a concrete example, suppose s is of length 5, t is of length 7, and our threshold is 1.
        In this case we're going to walk a stripe of length 3.  The matrix would look like so:

           1 2 3 4 5
        1 |#|#| | | |
        2 |#|#|#| | |
        3 | |#|#|#| |
        4 | | |#|#|#|
        5 | | | |#|#|
        6 | | | | |#|
        7 | | | | | |

        Note how the stripe leads off the table as there is no possible way to turn a string of length 5
        into one of length 7 in edit distance of 1.

        Additionally, this implementation decreases memory usage by using two
        single-dimensional arrays and swapping them back and forth instead of allocating
        an entire n by m matrix.  This requires a few minor changes, such as immediately returning
        when it's detected that the stripe has run off the matrix and initially filling the arrays with
        large values so that entries we don't compute are ignored.

        See Algorithms on Strings, Trees and Sequences by Dan Gusfield for some discussion.
         */

        }__CLR4_5_25lh5lhlvha79yz.R.inc(9879);int n = s.length(); // length of s
        __CLR4_5_25lh5lhlvha79yz.R.inc(9880);int m = t.length(); // length of t

        // if one string is empty, the edit distance is necessarily the length of the other
        __CLR4_5_25lh5lhlvha79yz.R.inc(9881);if ((((n == 0)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(9882)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(9883)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(9884);return (((m <= threshold )&&(__CLR4_5_25lh5lhlvha79yz.R.iget(9885)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(9886)==0&false))? m : -1;
        } }else {__CLR4_5_25lh5lhlvha79yz.R.inc(9887);if ((((m == 0)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(9888)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(9889)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(9890);return (((n <= threshold )&&(__CLR4_5_25lh5lhlvha79yz.R.iget(9891)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(9892)==0&false))? n : -1;
        }
        // no need to calculate the distance if the length difference is greater than the threshold
        }else {__CLR4_5_25lh5lhlvha79yz.R.inc(9893);if ((((Math.abs(n - m) > threshold)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(9894)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(9895)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(9896);return -1;
        }

        }}}__CLR4_5_25lh5lhlvha79yz.R.inc(9897);if ((((n > m)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(9898)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(9899)==0&false))) {{
            // swap the two strings to consume less memory
            __CLR4_5_25lh5lhlvha79yz.R.inc(9900);final CharSequence tmp = s;
            __CLR4_5_25lh5lhlvha79yz.R.inc(9901);s = t;
            __CLR4_5_25lh5lhlvha79yz.R.inc(9902);t = tmp;
            __CLR4_5_25lh5lhlvha79yz.R.inc(9903);n = m;
            __CLR4_5_25lh5lhlvha79yz.R.inc(9904);m = t.length();
        }

        }__CLR4_5_25lh5lhlvha79yz.R.inc(9905);int p[] = new int[n + 1]; // 'previous' cost array, horizontally
        __CLR4_5_25lh5lhlvha79yz.R.inc(9906);int d[] = new int[n + 1]; // cost array, horizontally
        __CLR4_5_25lh5lhlvha79yz.R.inc(9907);int _d[]; // placeholder to assist in swapping p and d

        // fill in starting table values
        __CLR4_5_25lh5lhlvha79yz.R.inc(9908);final int boundary = Math.min(n, threshold) + 1;
        __CLR4_5_25lh5lhlvha79yz.R.inc(9909);for (int i = 0; (((i < boundary)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(9910)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(9911)==0&false)); i++) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(9912);p[i] = i;
        }
        // these fills ensure that the value above the rightmost entry of our
        // stripe will be ignored in following loop iterations
        }__CLR4_5_25lh5lhlvha79yz.R.inc(9913);Arrays.fill(p, boundary, p.length, Integer.MAX_VALUE);
        __CLR4_5_25lh5lhlvha79yz.R.inc(9914);Arrays.fill(d, Integer.MAX_VALUE);

        // iterates through t
        __CLR4_5_25lh5lhlvha79yz.R.inc(9915);for (int j = 1; (((j <= m)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(9916)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(9917)==0&false)); j++) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(9918);final char t_j = t.charAt(j - 1); // jth character of t
            __CLR4_5_25lh5lhlvha79yz.R.inc(9919);d[0] = j;

            // compute stripe indices, constrain to array size
            __CLR4_5_25lh5lhlvha79yz.R.inc(9920);final int min = Math.max(1, j - threshold);
            __CLR4_5_25lh5lhlvha79yz.R.inc(9921);final int max = (((j > Integer.MAX_VALUE - threshold )&&(__CLR4_5_25lh5lhlvha79yz.R.iget(9922)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(9923)==0&false))? n : Math.min(n, j + threshold);

            // the stripe may lead off of the table if s and t are of different sizes
            __CLR4_5_25lh5lhlvha79yz.R.inc(9924);if ((((min > max)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(9925)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(9926)==0&false))) {{
                __CLR4_5_25lh5lhlvha79yz.R.inc(9927);return -1;
            }

            // ignore entry left of leftmost
            }__CLR4_5_25lh5lhlvha79yz.R.inc(9928);if ((((min > 1)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(9929)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(9930)==0&false))) {{
                __CLR4_5_25lh5lhlvha79yz.R.inc(9931);d[min - 1] = Integer.MAX_VALUE;
            }

            // iterates through [min, max] in s
            }__CLR4_5_25lh5lhlvha79yz.R.inc(9932);for (int i = min; (((i <= max)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(9933)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(9934)==0&false)); i++) {{
                __CLR4_5_25lh5lhlvha79yz.R.inc(9935);if ((((s.charAt(i - 1) == t_j)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(9936)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(9937)==0&false))) {{
                    // diagonally left and up
                    __CLR4_5_25lh5lhlvha79yz.R.inc(9938);d[i] = p[i - 1];
                } }else {{
                    // 1 + minimum of cell to the left, to the top, diagonally left and up
                    __CLR4_5_25lh5lhlvha79yz.R.inc(9939);d[i] = 1 + Math.min(Math.min(d[i - 1], p[i]), p[i - 1]);
                }
            }}

            // copy current distance counts to 'previous row' distance counts
            }__CLR4_5_25lh5lhlvha79yz.R.inc(9940);_d = p;
            __CLR4_5_25lh5lhlvha79yz.R.inc(9941);p = d;
            __CLR4_5_25lh5lhlvha79yz.R.inc(9942);d = _d;
        }

        // if p[n] is greater than the threshold, there's no guarantee on it being the correct
        // distance
        }__CLR4_5_25lh5lhlvha79yz.R.inc(9943);if ((((p[n] <= threshold)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(9944)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(9945)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(9946);return p[n];
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(9947);return -1;
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}
    
    /**
     * <p>Find the Jaro Winkler Distance which indicates the similarity score between two Strings.</p>
     *
     * <p>The Jaro measure is the weighted sum of percentage of matched characters from each file and transposed characters. 
     * Winkler increased this measure for matching initial characters.</p>
     *
     * <p>This implementation is based on the Jaro Winkler similarity algorithm
     * from <a href="http://en.wikipedia.org/wiki/Jaro%E2%80%93Winkler_distance">http://en.wikipedia.org/wiki/Jaro%E2%80%93Winkler_distance</a>.</p>
     * 
     * <pre>
     * StringUtils.getJaroWinklerDistance(null, null)          = IllegalArgumentException
     * StringUtils.getJaroWinklerDistance("","")               = 0.0
     * StringUtils.getJaroWinklerDistance("","a")              = 0.0
     * StringUtils.getJaroWinklerDistance("aaapppp", "")       = 0.0
     * StringUtils.getJaroWinklerDistance("frog", "fog")       = 0.93
     * StringUtils.getJaroWinklerDistance("fly", "ant")        = 0.0
     * StringUtils.getJaroWinklerDistance("elephant", "hippo") = 0.44
     * StringUtils.getJaroWinklerDistance("hippo", "elephant") = 0.44
     * StringUtils.getJaroWinklerDistance("hippo", "zzzzzzzz") = 0.0
     * StringUtils.getJaroWinklerDistance("hello", "hallo")    = 0.88
     * StringUtils.getJaroWinklerDistance("ABC Corporation", "ABC Corp") = 0.93
     * StringUtils.getJaroWinklerDistance("D N H Enterprises Inc", "D &amp; H Enterprises, Inc.") = 0.95
     * StringUtils.getJaroWinklerDistance("My Gym Children's Fitness Center", "My Gym. Childrens Fitness") = 0.92
     * StringUtils.getJaroWinklerDistance("PENNSYLVANIA", "PENNCISYLVNIA") = 0.88
     * </pre>
     *
     * @param first the first String, must not be null
     * @param second the second String, must not be null
     * @return result distance
     * @throws IllegalArgumentException if either String input {@code null}
     * @since 3.3
     * @deprecated as of 3.6, use commons-text
     * <a href="https://commons.apache.org/proper/commons-text/javadocs/api-release/org/apache/commons/text/similarity/JaroWinklerDistance.html">
     * JaroWinklerDistance</a> instead
     */
    @Deprecated
    public static double getJaroWinklerDistance(final CharSequence first, final CharSequence second) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(9948);
        __CLR4_5_25lh5lhlvha79yz.R.inc(9949);final double DEFAULT_SCALING_FACTOR = 0.1;

        __CLR4_5_25lh5lhlvha79yz.R.inc(9950);if ((((first == null || second == null)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(9951)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(9952)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(9953);throw new IllegalArgumentException("Strings must not be null");
        }

        }__CLR4_5_25lh5lhlvha79yz.R.inc(9954);final int[] mtp = matches(first, second);
        __CLR4_5_25lh5lhlvha79yz.R.inc(9955);final double m = mtp[0];
        __CLR4_5_25lh5lhlvha79yz.R.inc(9956);if ((((m == 0)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(9957)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(9958)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(9959);return 0D;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(9960);final double j = ((m / first.length() + m / second.length() + (m - mtp[1]) / m)) / 3;
        __CLR4_5_25lh5lhlvha79yz.R.inc(9961);final double jw = (((j < 0.7D )&&(__CLR4_5_25lh5lhlvha79yz.R.iget(9962)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(9963)==0&false))? j : j + Math.min(DEFAULT_SCALING_FACTOR, 1D / mtp[3]) * mtp[2] * (1D - j);
        __CLR4_5_25lh5lhlvha79yz.R.inc(9964);return Math.round(jw * 100.0D) / 100.0D;
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    private static int[] matches(final CharSequence first, final CharSequence second) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(9965);
        __CLR4_5_25lh5lhlvha79yz.R.inc(9966);CharSequence max, min;
        __CLR4_5_25lh5lhlvha79yz.R.inc(9967);if ((((first.length() > second.length())&&(__CLR4_5_25lh5lhlvha79yz.R.iget(9968)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(9969)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(9970);max = first;
            __CLR4_5_25lh5lhlvha79yz.R.inc(9971);min = second;
        } }else {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(9972);max = second;
            __CLR4_5_25lh5lhlvha79yz.R.inc(9973);min = first;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(9974);final int range = Math.max(max.length() / 2 - 1, 0);
        __CLR4_5_25lh5lhlvha79yz.R.inc(9975);final int[] matchIndexes = new int[min.length()];
        __CLR4_5_25lh5lhlvha79yz.R.inc(9976);Arrays.fill(matchIndexes, -1);
        __CLR4_5_25lh5lhlvha79yz.R.inc(9977);final boolean[] matchFlags = new boolean[max.length()];
        __CLR4_5_25lh5lhlvha79yz.R.inc(9978);int matches = 0;
        __CLR4_5_25lh5lhlvha79yz.R.inc(9979);for (int mi = 0; (((mi < min.length())&&(__CLR4_5_25lh5lhlvha79yz.R.iget(9980)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(9981)==0&false)); mi++) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(9982);final char c1 = min.charAt(mi);
            __CLR4_5_25lh5lhlvha79yz.R.inc(9983);for (int xi = Math.max(mi - range, 0), xn = Math.min(mi + range + 1, max.length()); (((xi < xn)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(9984)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(9985)==0&false)); xi++) {{
                __CLR4_5_25lh5lhlvha79yz.R.inc(9986);if ((((!matchFlags[xi] && c1 == max.charAt(xi))&&(__CLR4_5_25lh5lhlvha79yz.R.iget(9987)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(9988)==0&false))) {{
                    __CLR4_5_25lh5lhlvha79yz.R.inc(9989);matchIndexes[mi] = xi;
                    __CLR4_5_25lh5lhlvha79yz.R.inc(9990);matchFlags[xi] = true;
                    __CLR4_5_25lh5lhlvha79yz.R.inc(9991);matches++;
                    __CLR4_5_25lh5lhlvha79yz.R.inc(9992);break;
                }
            }}
        }}
        }__CLR4_5_25lh5lhlvha79yz.R.inc(9993);final char[] ms1 = new char[matches];
        __CLR4_5_25lh5lhlvha79yz.R.inc(9994);final char[] ms2 = new char[matches];
        __CLR4_5_25lh5lhlvha79yz.R.inc(9995);for (int i = 0, si = 0; (((i < min.length())&&(__CLR4_5_25lh5lhlvha79yz.R.iget(9996)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(9997)==0&false)); i++) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(9998);if ((((matchIndexes[i] != -1)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(9999)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(10000)==0&false))) {{
                __CLR4_5_25lh5lhlvha79yz.R.inc(10001);ms1[si] = min.charAt(i);
                __CLR4_5_25lh5lhlvha79yz.R.inc(10002);si++;
            }
        }}
        }__CLR4_5_25lh5lhlvha79yz.R.inc(10003);for (int i = 0, si = 0; (((i < max.length())&&(__CLR4_5_25lh5lhlvha79yz.R.iget(10004)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(10005)==0&false)); i++) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(10006);if ((((matchFlags[i])&&(__CLR4_5_25lh5lhlvha79yz.R.iget(10007)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(10008)==0&false))) {{
                __CLR4_5_25lh5lhlvha79yz.R.inc(10009);ms2[si] = max.charAt(i);
                __CLR4_5_25lh5lhlvha79yz.R.inc(10010);si++;
            }
        }}
        }__CLR4_5_25lh5lhlvha79yz.R.inc(10011);int transpositions = 0;
        __CLR4_5_25lh5lhlvha79yz.R.inc(10012);for (int mi = 0; (((mi < ms1.length)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(10013)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(10014)==0&false)); mi++) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(10015);if ((((ms1[mi] != ms2[mi])&&(__CLR4_5_25lh5lhlvha79yz.R.iget(10016)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(10017)==0&false))) {{
                __CLR4_5_25lh5lhlvha79yz.R.inc(10018);transpositions++;
            }
        }}
        }__CLR4_5_25lh5lhlvha79yz.R.inc(10019);int prefix = 0;
        __CLR4_5_25lh5lhlvha79yz.R.inc(10020);for (int mi = 0; (((mi < min.length())&&(__CLR4_5_25lh5lhlvha79yz.R.iget(10021)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(10022)==0&false)); mi++) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(10023);if ((((first.charAt(mi) == second.charAt(mi))&&(__CLR4_5_25lh5lhlvha79yz.R.iget(10024)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(10025)==0&false))) {{
                __CLR4_5_25lh5lhlvha79yz.R.inc(10026);prefix++;
            } }else {{
                __CLR4_5_25lh5lhlvha79yz.R.inc(10027);break;
            }
        }}
        }__CLR4_5_25lh5lhlvha79yz.R.inc(10028);return new int[] { matches, transpositions / 2, prefix, max.length() };
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    /**
     * <p>Find the Fuzzy Distance which indicates the similarity score between two Strings.</p>
     *
     * <p>This string matching algorithm is similar to the algorithms of editors such as Sublime Text,
     * TextMate, Atom and others. One point is given for every matched character. Subsequent
     * matches yield two bonus points. A higher score indicates a higher similarity.</p>
     *
     * <pre>
     * StringUtils.getFuzzyDistance(null, null, null)                                    = IllegalArgumentException
     * StringUtils.getFuzzyDistance("", "", Locale.ENGLISH)                              = 0
     * StringUtils.getFuzzyDistance("Workshop", "b", Locale.ENGLISH)                     = 0
     * StringUtils.getFuzzyDistance("Room", "o", Locale.ENGLISH)                         = 1
     * StringUtils.getFuzzyDistance("Workshop", "w", Locale.ENGLISH)                     = 1
     * StringUtils.getFuzzyDistance("Workshop", "ws", Locale.ENGLISH)                    = 2
     * StringUtils.getFuzzyDistance("Workshop", "wo", Locale.ENGLISH)                    = 4
     * StringUtils.getFuzzyDistance("Apache Software Foundation", "asf", Locale.ENGLISH) = 3
     * </pre>
     *
     * @param term a full term that should be matched against, must not be null
     * @param query the query that will be matched against a term, must not be null
     * @param locale This string matching logic is case insensitive. A locale is necessary to normalize
     *  both Strings to lower case.
     * @return result score
     * @throws IllegalArgumentException if either String input {@code null} or Locale input {@code null}
     * @since 3.4
     * @deprecated as of 3.6, use commons-text
     * <a href="https://commons.apache.org/proper/commons-text/javadocs/api-release/org/apache/commons/text/similarity/FuzzyScore.html">
     * FuzzyScore</a> instead
     */
    @Deprecated
    public static int getFuzzyDistance(final CharSequence term, final CharSequence query, final Locale locale) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(10029);
        __CLR4_5_25lh5lhlvha79yz.R.inc(10030);if ((((term == null || query == null)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(10031)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(10032)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(10033);throw new IllegalArgumentException("Strings must not be null");
        } }else {__CLR4_5_25lh5lhlvha79yz.R.inc(10034);if ((((locale == null)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(10035)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(10036)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(10037);throw new IllegalArgumentException("Locale must not be null");
        }

        // fuzzy logic is case insensitive. We normalize the Strings to lower
        // case right from the start. Turning characters to lower case
        // via Character.toLowerCase(char) is unfortunately insufficient
        // as it does not accept a locale.
        }}__CLR4_5_25lh5lhlvha79yz.R.inc(10038);final String termLowerCase = term.toString().toLowerCase(locale);
        __CLR4_5_25lh5lhlvha79yz.R.inc(10039);final String queryLowerCase = query.toString().toLowerCase(locale);

        // the resulting score
        __CLR4_5_25lh5lhlvha79yz.R.inc(10040);int score = 0;

        // the position in the term which will be scanned next for potential
        // query character matches
        __CLR4_5_25lh5lhlvha79yz.R.inc(10041);int termIndex = 0;

        // index of the previously matched character in the term
        __CLR4_5_25lh5lhlvha79yz.R.inc(10042);int previousMatchingCharacterIndex = Integer.MIN_VALUE;

        __CLR4_5_25lh5lhlvha79yz.R.inc(10043);for (int queryIndex = 0; (((queryIndex < queryLowerCase.length())&&(__CLR4_5_25lh5lhlvha79yz.R.iget(10044)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(10045)==0&false)); queryIndex++) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(10046);final char queryChar = queryLowerCase.charAt(queryIndex);

            __CLR4_5_25lh5lhlvha79yz.R.inc(10047);boolean termCharacterMatchFound = false;
            __CLR4_5_25lh5lhlvha79yz.R.inc(10048);for (; (((termIndex < termLowerCase.length() && !termCharacterMatchFound)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(10049)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(10050)==0&false)); termIndex++) {{
                __CLR4_5_25lh5lhlvha79yz.R.inc(10051);final char termChar = termLowerCase.charAt(termIndex);

                __CLR4_5_25lh5lhlvha79yz.R.inc(10052);if ((((queryChar == termChar)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(10053)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(10054)==0&false))) {{
                    // simple character matches result in one point
                    __CLR4_5_25lh5lhlvha79yz.R.inc(10055);score++;

                    // subsequent character matches further improve
                    // the score.
                    __CLR4_5_25lh5lhlvha79yz.R.inc(10056);if ((((previousMatchingCharacterIndex + 1 == termIndex)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(10057)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(10058)==0&false))) {{
                        __CLR4_5_25lh5lhlvha79yz.R.inc(10059);score += 2;
                    }

                    }__CLR4_5_25lh5lhlvha79yz.R.inc(10060);previousMatchingCharacterIndex = termIndex;

                    // we can leave the nested loop. Every character in the
                    // query can match at most one character in the term.
                    __CLR4_5_25lh5lhlvha79yz.R.inc(10061);termCharacterMatchFound = true;
                }
            }}
        }}

        }__CLR4_5_25lh5lhlvha79yz.R.inc(10062);return score;
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    // startsWith
    //-----------------------------------------------------------------------

    /**
     * <p>Check if a CharSequence starts with a specified prefix.</p>
     *
     * <p>{@code null}s are handled without exceptions. Two {@code null}
     * references are considered to be equal. The comparison is case sensitive.</p>
     *
     * <pre>
     * StringUtils.startsWith(null, null)      = true
     * StringUtils.startsWith(null, "abc")     = false
     * StringUtils.startsWith("abcdef", null)  = false
     * StringUtils.startsWith("abcdef", "abc") = true
     * StringUtils.startsWith("ABCDEF", "abc") = false
     * </pre>
     *
     * @see java.lang.String#startsWith(String)
     * @param str  the CharSequence to check, may be null
     * @param prefix the prefix to find, may be null
     * @return {@code true} if the CharSequence starts with the prefix, case sensitive, or
     *  both {@code null}
     * @since 2.4
     * @since 3.0 Changed signature from startsWith(String, String) to startsWith(CharSequence, CharSequence)
     */
    public static boolean startsWith(final CharSequence str, final CharSequence prefix) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(10063);
        __CLR4_5_25lh5lhlvha79yz.R.inc(10064);return startsWith(str, prefix, false);
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    /**
     * <p>Case insensitive check if a CharSequence starts with a specified prefix.</p>
     *
     * <p>{@code null}s are handled without exceptions. Two {@code null}
     * references are considered to be equal. The comparison is case insensitive.</p>
     *
     * <pre>
     * StringUtils.startsWithIgnoreCase(null, null)      = true
     * StringUtils.startsWithIgnoreCase(null, "abc")     = false
     * StringUtils.startsWithIgnoreCase("abcdef", null)  = false
     * StringUtils.startsWithIgnoreCase("abcdef", "abc") = true
     * StringUtils.startsWithIgnoreCase("ABCDEF", "abc") = true
     * </pre>
     *
     * @see java.lang.String#startsWith(String)
     * @param str  the CharSequence to check, may be null
     * @param prefix the prefix to find, may be null
     * @return {@code true} if the CharSequence starts with the prefix, case insensitive, or
     *  both {@code null}
     * @since 2.4
     * @since 3.0 Changed signature from startsWithIgnoreCase(String, String) to startsWithIgnoreCase(CharSequence, CharSequence)
     */
    public static boolean startsWithIgnoreCase(final CharSequence str, final CharSequence prefix) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(10065);
        __CLR4_5_25lh5lhlvha79yz.R.inc(10066);return startsWith(str, prefix, true);
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    /**
     * <p>Check if a CharSequence starts with a specified prefix (optionally case insensitive).</p>
     *
     * @see java.lang.String#startsWith(String)
     * @param str  the CharSequence to check, may be null
     * @param prefix the prefix to find, may be null
     * @param ignoreCase indicates whether the compare should ignore case
     *  (case insensitive) or not.
     * @return {@code true} if the CharSequence starts with the prefix or
     *  both {@code null}
     */
    private static boolean startsWith(final CharSequence str, final CharSequence prefix, final boolean ignoreCase) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(10067);
        __CLR4_5_25lh5lhlvha79yz.R.inc(10068);if ((((str == null || prefix == null)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(10069)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(10070)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(10071);return str == null && prefix == null;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(10072);if ((((prefix.length() > str.length())&&(__CLR4_5_25lh5lhlvha79yz.R.iget(10073)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(10074)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(10075);return false;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(10076);return CharSequenceUtils.regionMatches(str, ignoreCase, 0, prefix, 0, prefix.length());
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    /**
     * <p>Check if a CharSequence starts with any of the provided case-sensitive prefixes.</p>
     *
     * <pre>
     * StringUtils.startsWithAny(null, null)      = false
     * StringUtils.startsWithAny(null, new String[] {"abc"})  = false
     * StringUtils.startsWithAny("abcxyz", null)     = false
     * StringUtils.startsWithAny("abcxyz", new String[] {""}) = true
     * StringUtils.startsWithAny("abcxyz", new String[] {"abc"}) = true
     * StringUtils.startsWithAny("abcxyz", new String[] {null, "xyz", "abc"}) = true
     * StringUtils.startsWithAny("abcxyz", null, "xyz", "ABCX") = false
     * StringUtils.startsWithAny("ABCXYZ", null, "xyz", "abc") = false
     * </pre>
     *
     * @param sequence the CharSequence to check, may be null
     * @param searchStrings the case-sensitive CharSequence prefixes, may be empty or contain {@code null}
     * @see StringUtils#startsWith(CharSequence, CharSequence)
     * @return {@code true} if the input {@code sequence} is {@code null} AND no {@code searchStrings} are provided, or
     *   the input {@code sequence} begins with any of the provided case-sensitive {@code searchStrings}.
     * @since 2.5
     * @since 3.0 Changed signature from startsWithAny(String, String[]) to startsWithAny(CharSequence, CharSequence...)
     */
    public static boolean startsWithAny(final CharSequence sequence, final CharSequence... searchStrings) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(10077);
        __CLR4_5_25lh5lhlvha79yz.R.inc(10078);if ((((isEmpty(sequence) || ArrayUtils.isEmpty(searchStrings))&&(__CLR4_5_25lh5lhlvha79yz.R.iget(10079)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(10080)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(10081);return false;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(10082);for (final CharSequence searchString : searchStrings) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(10083);if ((((startsWith(sequence, searchString))&&(__CLR4_5_25lh5lhlvha79yz.R.iget(10084)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(10085)==0&false))) {{
                __CLR4_5_25lh5lhlvha79yz.R.inc(10086);return true;
            }
        }}
        }__CLR4_5_25lh5lhlvha79yz.R.inc(10087);return false;
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    // endsWith
    //-----------------------------------------------------------------------

    /**
     * <p>Check if a CharSequence ends with a specified suffix.</p>
     *
     * <p>{@code null}s are handled without exceptions. Two {@code null}
     * references are considered to be equal. The comparison is case sensitive.</p>
     *
     * <pre>
     * StringUtils.endsWith(null, null)      = true
     * StringUtils.endsWith(null, "def")     = false
     * StringUtils.endsWith("abcdef", null)  = false
     * StringUtils.endsWith("abcdef", "def") = true
     * StringUtils.endsWith("ABCDEF", "def") = false
     * StringUtils.endsWith("ABCDEF", "cde") = false
     * StringUtils.endsWith("ABCDEF", "")    = true
     * </pre>
     *
     * @see java.lang.String#endsWith(String)
     * @param str  the CharSequence to check, may be null
     * @param suffix the suffix to find, may be null
     * @return {@code true} if the CharSequence ends with the suffix, case sensitive, or
     *  both {@code null}
     * @since 2.4
     * @since 3.0 Changed signature from endsWith(String, String) to endsWith(CharSequence, CharSequence)
     */
    public static boolean endsWith(final CharSequence str, final CharSequence suffix) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(10088);
        __CLR4_5_25lh5lhlvha79yz.R.inc(10089);return endsWith(str, suffix, false);
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    /**
     * <p>Case insensitive check if a CharSequence ends with a specified suffix.</p>
     *
     * <p>{@code null}s are handled without exceptions. Two {@code null}
     * references are considered to be equal. The comparison is case insensitive.</p>
     *
     * <pre>
     * StringUtils.endsWithIgnoreCase(null, null)      = true
     * StringUtils.endsWithIgnoreCase(null, "def")     = false
     * StringUtils.endsWithIgnoreCase("abcdef", null)  = false
     * StringUtils.endsWithIgnoreCase("abcdef", "def") = true
     * StringUtils.endsWithIgnoreCase("ABCDEF", "def") = true
     * StringUtils.endsWithIgnoreCase("ABCDEF", "cde") = false
     * </pre>
     *
     * @see java.lang.String#endsWith(String)
     * @param str  the CharSequence to check, may be null
     * @param suffix the suffix to find, may be null
     * @return {@code true} if the CharSequence ends with the suffix, case insensitive, or
     *  both {@code null}
     * @since 2.4
     * @since 3.0 Changed signature from endsWithIgnoreCase(String, String) to endsWithIgnoreCase(CharSequence, CharSequence)
     */
    public static boolean endsWithIgnoreCase(final CharSequence str, final CharSequence suffix) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(10090);
        __CLR4_5_25lh5lhlvha79yz.R.inc(10091);return endsWith(str, suffix, true);
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    /**
     * <p>Check if a CharSequence ends with a specified suffix (optionally case insensitive).</p>
     *
     * @see java.lang.String#endsWith(String)
     * @param str  the CharSequence to check, may be null
     * @param suffix the suffix to find, may be null
     * @param ignoreCase indicates whether the compare should ignore case
     *  (case insensitive) or not.
     * @return {@code true} if the CharSequence starts with the prefix or
     *  both {@code null}
     */
    private static boolean endsWith(final CharSequence str, final CharSequence suffix, final boolean ignoreCase) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(10092);
        __CLR4_5_25lh5lhlvha79yz.R.inc(10093);if ((((str == null || suffix == null)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(10094)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(10095)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(10096);return str == null && suffix == null;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(10097);if ((((suffix.length() > str.length())&&(__CLR4_5_25lh5lhlvha79yz.R.iget(10098)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(10099)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(10100);return false;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(10101);final int strOffset = str.length() - suffix.length();
        __CLR4_5_25lh5lhlvha79yz.R.inc(10102);return CharSequenceUtils.regionMatches(str, ignoreCase, strOffset, suffix, 0, suffix.length());
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    /**
     * <p>
     * Similar to <a
     * href="http://www.w3.org/TR/xpath/#function-normalize-space">http://www.w3.org/TR/xpath/#function-normalize
     * -space</a>
     * </p>
     * <p>
     * The function returns the argument string with whitespace normalized by using
     * <code>{@link #trim(String)}</code> to remove leading and trailing whitespace
     * and then replacing sequences of whitespace characters by a single space.
     * </p>
     * In XML Whitespace characters are the same as those allowed by the <a
     * href="http://www.w3.org/TR/REC-xml/#NT-S">S</a> production, which is S ::= (#x20 | #x9 | #xD | #xA)+
     * <p>
     * Java's regexp pattern \s defines whitespace as [ \t\n\x0B\f\r]
     *
     * <p>For reference:</p>
     * <ul>
     * <li>\x0B = vertical tab</li>
     * <li>\f = #xC = form feed</li>
     * <li>#x20 = space</li>
     * <li>#x9 = \t</li>
     * <li>#xA = \n</li>
     * <li>#xD = \r</li>
     * </ul>
     *
     * <p>
     * The difference is that Java's whitespace includes vertical tab and form feed, which this functional will also
     * normalize. Additionally <code>{@link #trim(String)}</code> removes control characters (char &lt;= 32) from both
     * ends of this String.
     * </p>
     *
     * @see Pattern
     * @see #trim(String)
     * @see <a
     *      href="http://www.w3.org/TR/xpath/#function-normalize-space">http://www.w3.org/TR/xpath/#function-normalize-space</a>
     * @param str the source String to normalize whitespaces from, may be null
     * @return the modified string with whitespace normalized, {@code null} if null String input
     *
     * @since 3.0
     */
    public static String normalizeSpace(final String str) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(10103);
        // LANG-1020: Improved performance significantly by normalizing manually instead of using regex
        // See https://github.com/librucha/commons-lang-normalizespaces-benchmark for performance test
        __CLR4_5_25lh5lhlvha79yz.R.inc(10104);if ((((isEmpty(str))&&(__CLR4_5_25lh5lhlvha79yz.R.iget(10105)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(10106)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(10107);return str;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(10108);final int size = str.length();
        __CLR4_5_25lh5lhlvha79yz.R.inc(10109);final char[] newChars = new char[size];
        __CLR4_5_25lh5lhlvha79yz.R.inc(10110);int count = 0;
        __CLR4_5_25lh5lhlvha79yz.R.inc(10111);int whitespacesCount = 0;
        __CLR4_5_25lh5lhlvha79yz.R.inc(10112);boolean startWhitespaces = true;
        __CLR4_5_25lh5lhlvha79yz.R.inc(10113);for (int i = 0; (((i < size)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(10114)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(10115)==0&false)); i++) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(10116);final char actualChar = str.charAt(i);
            __CLR4_5_25lh5lhlvha79yz.R.inc(10117);final boolean isWhitespace = Character.isWhitespace(actualChar);
            __CLR4_5_25lh5lhlvha79yz.R.inc(10118);if ((((!isWhitespace)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(10119)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(10120)==0&false))) {{
                __CLR4_5_25lh5lhlvha79yz.R.inc(10121);startWhitespaces = false;
                __CLR4_5_25lh5lhlvha79yz.R.inc(10122);newChars[count++] = ((((actualChar == 160 )&&(__CLR4_5_25lh5lhlvha79yz.R.iget(10123)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(10124)==0&false))? 32 : actualChar);
                __CLR4_5_25lh5lhlvha79yz.R.inc(10125);whitespacesCount = 0;
            } }else {{
                __CLR4_5_25lh5lhlvha79yz.R.inc(10126);if ((((whitespacesCount == 0 && !startWhitespaces)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(10127)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(10128)==0&false))) {{
                    __CLR4_5_25lh5lhlvha79yz.R.inc(10129);newChars[count++] = SPACE.charAt(0);
                }
                }__CLR4_5_25lh5lhlvha79yz.R.inc(10130);whitespacesCount++;
            }
        }}
        }__CLR4_5_25lh5lhlvha79yz.R.inc(10131);if ((((startWhitespaces)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(10132)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(10133)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(10134);return EMPTY;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(10135);return new String(newChars, 0, count - ((((whitespacesCount > 0 )&&(__CLR4_5_25lh5lhlvha79yz.R.iget(10136)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(10137)==0&false))? 1 : 0)).trim();
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    /**
     * <p>Check if a CharSequence ends with any of the provided case-sensitive suffixes.</p>
     *
     * <pre>
     * StringUtils.endsWithAny(null, null)      = false
     * StringUtils.endsWithAny(null, new String[] {"abc"})  = false
     * StringUtils.endsWithAny("abcxyz", null)     = false
     * StringUtils.endsWithAny("abcxyz", new String[] {""}) = true
     * StringUtils.endsWithAny("abcxyz", new String[] {"xyz"}) = true
     * StringUtils.endsWithAny("abcxyz", new String[] {null, "xyz", "abc"}) = true
     * StringUtils.endsWithAny("abcXYZ", "def", "XYZ") = true
     * StringUtils.endsWithAny("abcXYZ", "def", "xyz") = false
     * </pre>
     *
     * @param sequence  the CharSequence to check, may be null
     * @param searchStrings the case-sensitive CharSequences to find, may be empty or contain {@code null}
     * @see StringUtils#endsWith(CharSequence, CharSequence)
     * @return {@code true} if the input {@code sequence} is {@code null} AND no {@code searchStrings} are provided, or
     *   the input {@code sequence} ends in any of the provided case-sensitive {@code searchStrings}.
     * @since 3.0
     */
    public static boolean endsWithAny(final CharSequence sequence, final CharSequence... searchStrings) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(10138);
        __CLR4_5_25lh5lhlvha79yz.R.inc(10139);if ((((isEmpty(sequence) || ArrayUtils.isEmpty(searchStrings))&&(__CLR4_5_25lh5lhlvha79yz.R.iget(10140)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(10141)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(10142);return false;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(10143);for (final CharSequence searchString : searchStrings) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(10144);if ((((endsWith(sequence, searchString))&&(__CLR4_5_25lh5lhlvha79yz.R.iget(10145)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(10146)==0&false))) {{
                __CLR4_5_25lh5lhlvha79yz.R.inc(10147);return true;
            }
        }}
        }__CLR4_5_25lh5lhlvha79yz.R.inc(10148);return false;
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    /**
     * Appends the suffix to the end of the string if the string does not
     * already end with the suffix.
     *
     * @param str The string.
     * @param suffix The suffix to append to the end of the string.
     * @param ignoreCase Indicates whether the compare should ignore case.
     * @param suffixes Additional suffixes that are valid terminators (optional).
     *
     * @return A new String if suffix was appended, the same string otherwise.
     */
    private static String appendIfMissing(final String str, final CharSequence suffix, final boolean ignoreCase, final CharSequence... suffixes) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(10149);
        __CLR4_5_25lh5lhlvha79yz.R.inc(10150);if ((((str == null || isEmpty(suffix) || endsWith(str, suffix, ignoreCase))&&(__CLR4_5_25lh5lhlvha79yz.R.iget(10151)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(10152)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(10153);return str;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(10154);if ((((suffixes != null && suffixes.length > 0)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(10155)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(10156)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(10157);for (final CharSequence s : suffixes) {{
                __CLR4_5_25lh5lhlvha79yz.R.inc(10158);if ((((endsWith(str, s, ignoreCase))&&(__CLR4_5_25lh5lhlvha79yz.R.iget(10159)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(10160)==0&false))) {{
                    __CLR4_5_25lh5lhlvha79yz.R.inc(10161);return str;
                }
            }}
        }}
        }__CLR4_5_25lh5lhlvha79yz.R.inc(10162);return str + suffix.toString();
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    /**
     * Appends the suffix to the end of the string if the string does not
     * already end with any of the suffixes.
     *
     * <pre>
     * StringUtils.appendIfMissing(null, null) = null
     * StringUtils.appendIfMissing("abc", null) = "abc"
     * StringUtils.appendIfMissing("", "xyz") = "xyz"
     * StringUtils.appendIfMissing("abc", "xyz") = "abcxyz"
     * StringUtils.appendIfMissing("abcxyz", "xyz") = "abcxyz"
     * StringUtils.appendIfMissing("abcXYZ", "xyz") = "abcXYZxyz"
     * </pre>
     * <p>With additional suffixes,</p>
     * <pre>
     * StringUtils.appendIfMissing(null, null, null) = null
     * StringUtils.appendIfMissing("abc", null, null) = "abc"
     * StringUtils.appendIfMissing("", "xyz", null) = "xyz"
     * StringUtils.appendIfMissing("abc", "xyz", new CharSequence[]{null}) = "abcxyz"
     * StringUtils.appendIfMissing("abc", "xyz", "") = "abc"
     * StringUtils.appendIfMissing("abc", "xyz", "mno") = "abcxyz"
     * StringUtils.appendIfMissing("abcxyz", "xyz", "mno") = "abcxyz"
     * StringUtils.appendIfMissing("abcmno", "xyz", "mno") = "abcmno"
     * StringUtils.appendIfMissing("abcXYZ", "xyz", "mno") = "abcXYZxyz"
     * StringUtils.appendIfMissing("abcMNO", "xyz", "mno") = "abcMNOxyz"
     * </pre>
     *
     * @param str The string.
     * @param suffix The suffix to append to the end of the string.
     * @param suffixes Additional suffixes that are valid terminators.
     *
     * @return A new String if suffix was appended, the same string otherwise.
     *
     * @since 3.2
     */
    public static String appendIfMissing(final String str, final CharSequence suffix, final CharSequence... suffixes) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(10163);
        __CLR4_5_25lh5lhlvha79yz.R.inc(10164);return appendIfMissing(str, suffix, false, suffixes);
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    /**
     * Appends the suffix to the end of the string if the string does not
     * already end, case insensitive, with any of the suffixes.
     *
     * <pre>
     * StringUtils.appendIfMissingIgnoreCase(null, null) = null
     * StringUtils.appendIfMissingIgnoreCase("abc", null) = "abc"
     * StringUtils.appendIfMissingIgnoreCase("", "xyz") = "xyz"
     * StringUtils.appendIfMissingIgnoreCase("abc", "xyz") = "abcxyz"
     * StringUtils.appendIfMissingIgnoreCase("abcxyz", "xyz") = "abcxyz"
     * StringUtils.appendIfMissingIgnoreCase("abcXYZ", "xyz") = "abcXYZ"
     * </pre>
     * <p>With additional suffixes,</p>
     * <pre>
     * StringUtils.appendIfMissingIgnoreCase(null, null, null) = null
     * StringUtils.appendIfMissingIgnoreCase("abc", null, null) = "abc"
     * StringUtils.appendIfMissingIgnoreCase("", "xyz", null) = "xyz"
     * StringUtils.appendIfMissingIgnoreCase("abc", "xyz", new CharSequence[]{null}) = "abcxyz"
     * StringUtils.appendIfMissingIgnoreCase("abc", "xyz", "") = "abc"
     * StringUtils.appendIfMissingIgnoreCase("abc", "xyz", "mno") = "axyz"
     * StringUtils.appendIfMissingIgnoreCase("abcxyz", "xyz", "mno") = "abcxyz"
     * StringUtils.appendIfMissingIgnoreCase("abcmno", "xyz", "mno") = "abcmno"
     * StringUtils.appendIfMissingIgnoreCase("abcXYZ", "xyz", "mno") = "abcXYZ"
     * StringUtils.appendIfMissingIgnoreCase("abcMNO", "xyz", "mno") = "abcMNO"
     * </pre>
     *
     * @param str The string.
     * @param suffix The suffix to append to the end of the string.
     * @param suffixes Additional suffixes that are valid terminators.
     *
     * @return A new String if suffix was appended, the same string otherwise.
     *
     * @since 3.2
     */
    public static String appendIfMissingIgnoreCase(final String str, final CharSequence suffix, final CharSequence... suffixes) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(10165);
        __CLR4_5_25lh5lhlvha79yz.R.inc(10166);return appendIfMissing(str, suffix, true, suffixes);
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    /**
     * Prepends the prefix to the start of the string if the string does not
     * already start with any of the prefixes.
     *
     * @param str The string.
     * @param prefix The prefix to prepend to the start of the string.
     * @param ignoreCase Indicates whether the compare should ignore case.
     * @param prefixes Additional prefixes that are valid (optional).
     *
     * @return A new String if prefix was prepended, the same string otherwise.
     */
    private static String prependIfMissing(final String str, final CharSequence prefix, final boolean ignoreCase, final CharSequence... prefixes) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(10167);
        __CLR4_5_25lh5lhlvha79yz.R.inc(10168);if ((((str == null || isEmpty(prefix) || startsWith(str, prefix, ignoreCase))&&(__CLR4_5_25lh5lhlvha79yz.R.iget(10169)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(10170)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(10171);return str;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(10172);if ((((prefixes != null && prefixes.length > 0)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(10173)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(10174)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(10175);for (final CharSequence p : prefixes) {{
                __CLR4_5_25lh5lhlvha79yz.R.inc(10176);if ((((startsWith(str, p, ignoreCase))&&(__CLR4_5_25lh5lhlvha79yz.R.iget(10177)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(10178)==0&false))) {{
                    __CLR4_5_25lh5lhlvha79yz.R.inc(10179);return str;
                }
            }}
        }}
        }__CLR4_5_25lh5lhlvha79yz.R.inc(10180);return prefix.toString() + str;
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    /**
     * Prepends the prefix to the start of the string if the string does not
     * already start with any of the prefixes.
     *
     * <pre>
     * StringUtils.prependIfMissing(null, null) = null
     * StringUtils.prependIfMissing("abc", null) = "abc"
     * StringUtils.prependIfMissing("", "xyz") = "xyz"
     * StringUtils.prependIfMissing("abc", "xyz") = "xyzabc"
     * StringUtils.prependIfMissing("xyzabc", "xyz") = "xyzabc"
     * StringUtils.prependIfMissing("XYZabc", "xyz") = "xyzXYZabc"
     * </pre>
     * <p>With additional prefixes,</p>
     * <pre>
     * StringUtils.prependIfMissing(null, null, null) = null
     * StringUtils.prependIfMissing("abc", null, null) = "abc"
     * StringUtils.prependIfMissing("", "xyz", null) = "xyz"
     * StringUtils.prependIfMissing("abc", "xyz", new CharSequence[]{null}) = "xyzabc"
     * StringUtils.prependIfMissing("abc", "xyz", "") = "abc"
     * StringUtils.prependIfMissing("abc", "xyz", "mno") = "xyzabc"
     * StringUtils.prependIfMissing("xyzabc", "xyz", "mno") = "xyzabc"
     * StringUtils.prependIfMissing("mnoabc", "xyz", "mno") = "mnoabc"
     * StringUtils.prependIfMissing("XYZabc", "xyz", "mno") = "xyzXYZabc"
     * StringUtils.prependIfMissing("MNOabc", "xyz", "mno") = "xyzMNOabc"
     * </pre>
     *
     * @param str The string.
     * @param prefix The prefix to prepend to the start of the string.
     * @param prefixes Additional prefixes that are valid.
     *
     * @return A new String if prefix was prepended, the same string otherwise.
     *
     * @since 3.2
     */
    public static String prependIfMissing(final String str, final CharSequence prefix, final CharSequence... prefixes) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(10181);
        __CLR4_5_25lh5lhlvha79yz.R.inc(10182);return prependIfMissing(str, prefix, false, prefixes);
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    /**
     * Prepends the prefix to the start of the string if the string does not
     * already start, case insensitive, with any of the prefixes.
     *
     * <pre>
     * StringUtils.prependIfMissingIgnoreCase(null, null) = null
     * StringUtils.prependIfMissingIgnoreCase("abc", null) = "abc"
     * StringUtils.prependIfMissingIgnoreCase("", "xyz") = "xyz"
     * StringUtils.prependIfMissingIgnoreCase("abc", "xyz") = "xyzabc"
     * StringUtils.prependIfMissingIgnoreCase("xyzabc", "xyz") = "xyzabc"
     * StringUtils.prependIfMissingIgnoreCase("XYZabc", "xyz") = "XYZabc"
     * </pre>
     * <p>With additional prefixes,</p>
     * <pre>
     * StringUtils.prependIfMissingIgnoreCase(null, null, null) = null
     * StringUtils.prependIfMissingIgnoreCase("abc", null, null) = "abc"
     * StringUtils.prependIfMissingIgnoreCase("", "xyz", null) = "xyz"
     * StringUtils.prependIfMissingIgnoreCase("abc", "xyz", new CharSequence[]{null}) = "xyzabc"
     * StringUtils.prependIfMissingIgnoreCase("abc", "xyz", "") = "abc"
     * StringUtils.prependIfMissingIgnoreCase("abc", "xyz", "mno") = "xyzabc"
     * StringUtils.prependIfMissingIgnoreCase("xyzabc", "xyz", "mno") = "xyzabc"
     * StringUtils.prependIfMissingIgnoreCase("mnoabc", "xyz", "mno") = "mnoabc"
     * StringUtils.prependIfMissingIgnoreCase("XYZabc", "xyz", "mno") = "XYZabc"
     * StringUtils.prependIfMissingIgnoreCase("MNOabc", "xyz", "mno") = "MNOabc"
     * </pre>
     *
     * @param str The string.
     * @param prefix The prefix to prepend to the start of the string.
     * @param prefixes Additional prefixes that are valid (optional).
     *
     * @return A new String if prefix was prepended, the same string otherwise.
     *
     * @since 3.2
     */
    public static String prependIfMissingIgnoreCase(final String str, final CharSequence prefix, final CharSequence... prefixes) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(10183);
        __CLR4_5_25lh5lhlvha79yz.R.inc(10184);return prependIfMissing(str, prefix, true, prefixes);
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    /**
     * Converts a <code>byte[]</code> to a String using the specified character encoding.
     *
     * @param bytes
     *            the byte array to read from
     * @param charsetName
     *            the encoding to use, if null then use the platform default
     * @return a new String
     * @throws UnsupportedEncodingException
     *             If the named charset is not supported
     * @throws NullPointerException
     *             if the input is null
     * @deprecated use {@link StringUtils#toEncodedString(byte[], Charset)} instead of String constants in your code
     * @since 3.1
     */
    @Deprecated
    public static String toString(final byte[] bytes, final String charsetName) throws UnsupportedEncodingException {try{__CLR4_5_25lh5lhlvha79yz.R.inc(10185);
        __CLR4_5_25lh5lhlvha79yz.R.inc(10186);return (((charsetName != null )&&(__CLR4_5_25lh5lhlvha79yz.R.iget(10187)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(10188)==0&false))? new String(bytes, charsetName) : new String(bytes, Charset.defaultCharset());
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    /**
     * Converts a <code>byte[]</code> to a String using the specified character encoding.
     * 
     * @param bytes
     *            the byte array to read from
     * @param charset
     *            the encoding to use, if null then use the platform default
     * @return a new String
     * @throws NullPointerException
     *             if {@code bytes} is null
     * @since 3.2
     * @since 3.3 No longer throws {@link UnsupportedEncodingException}.
     */
    public static String toEncodedString(final byte[] bytes, final Charset charset) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(10189);
        __CLR4_5_25lh5lhlvha79yz.R.inc(10190);return new String(bytes, (((charset != null )&&(__CLR4_5_25lh5lhlvha79yz.R.iget(10191)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(10192)==0&false))? charset : Charset.defaultCharset());
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    /**
     * <p>
     * Wraps a string with a char.
     * </p>
     * 
     * <pre>
     * StringUtils.wrap(null, *)        = null
     * StringUtils.wrap("", *)          = ""
     * StringUtils.wrap("ab", '\0')     = "ab"
     * StringUtils.wrap("ab", 'x')      = "xabx"
     * StringUtils.wrap("ab", '\'')     = "'ab'"
     * StringUtils.wrap("\"ab\"", '\"') = "\"\"ab\"\""
     * </pre>
     * 
     * @param str
     *            the string to be wrapped, may be {@code null}
     * @param wrapWith
     *            the char that will wrap {@code str}
     * @return the wrapped string, or {@code null} if {@code str==null}
     * @since 3.4
     */
    public static String wrap(final String str, final char wrapWith) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(10193);

        __CLR4_5_25lh5lhlvha79yz.R.inc(10194);if ((((isEmpty(str) || wrapWith == '\0')&&(__CLR4_5_25lh5lhlvha79yz.R.iget(10195)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(10196)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(10197);return str;
        }

        }__CLR4_5_25lh5lhlvha79yz.R.inc(10198);return wrapWith + str + wrapWith;
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    /**
     * <p>
     * Wraps a String with another String.
     * </p>
     * 
     * <p>
     * A {@code null} input String returns {@code null}.
     * </p>
     * 
     * <pre>
     * StringUtils.wrap(null, *)         = null
     * StringUtils.wrap("", *)           = ""
     * StringUtils.wrap("ab", null)      = "ab"
     * StringUtils.wrap("ab", "x")       = "xabx"
     * StringUtils.wrap("ab", "\"")      = "\"ab\""
     * StringUtils.wrap("\"ab\"", "\"")  = "\"\"ab\"\""
     * StringUtils.wrap("ab", "'")       = "'ab'"
     * StringUtils.wrap("'abcd'", "'")   = "''abcd''"
     * StringUtils.wrap("\"abcd\"", "'") = "'\"abcd\"'"
     * StringUtils.wrap("'abcd'", "\"")  = "\"'abcd'\""
     * </pre>
     * 
     * @param str
     *            the String to be wrapper, may be null
     * @param wrapWith
     *            the String that will wrap str
     * @return wrapped String, {@code null} if null String input
     * @since 3.4
     */
    public static String wrap(final String str, final String wrapWith) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(10199);

        __CLR4_5_25lh5lhlvha79yz.R.inc(10200);if ((((isEmpty(str) || isEmpty(wrapWith))&&(__CLR4_5_25lh5lhlvha79yz.R.iget(10201)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(10202)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(10203);return str;
        }

        }__CLR4_5_25lh5lhlvha79yz.R.inc(10204);return wrapWith.concat(str).concat(wrapWith);
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    /**
     * <p>
     * Wraps a string with a char if that char is missing from the start or end of the given string.
     * </p>
     * 
     * <pre>
     * StringUtils.wrap(null, *)        = null
     * StringUtils.wrap("", *)          = ""
     * StringUtils.wrap("ab", '\0')     = "ab"
     * StringUtils.wrap("ab", 'x')      = "xabx"
     * StringUtils.wrap("ab", '\'')     = "'ab'"
     * StringUtils.wrap("\"ab\"", '\"') = "\"ab\""
     * StringUtils.wrap("/", '/')  = "/"
     * StringUtils.wrap("a/b/c", '/')  = "/a/b/c/"
     * StringUtils.wrap("/a/b/c", '/')  = "/a/b/c/"
     * StringUtils.wrap("a/b/c/", '/')  = "/a/b/c/"
     * </pre>
     * 
     * @param str
     *            the string to be wrapped, may be {@code null}
     * @param wrapWith
     *            the char that will wrap {@code str}
     * @return the wrapped string, or {@code null} if {@code str==null}
     * @since 3.5
     */
    public static String wrapIfMissing(final String str, final char wrapWith) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(10205);
        __CLR4_5_25lh5lhlvha79yz.R.inc(10206);if ((((isEmpty(str) || wrapWith == '\0')&&(__CLR4_5_25lh5lhlvha79yz.R.iget(10207)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(10208)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(10209);return str;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(10210);final StringBuilder builder = new StringBuilder(str.length() + 2);
        __CLR4_5_25lh5lhlvha79yz.R.inc(10211);if ((((str.charAt(0) != wrapWith)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(10212)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(10213)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(10214);builder.append(wrapWith);
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(10215);builder.append(str);
        __CLR4_5_25lh5lhlvha79yz.R.inc(10216);if ((((str.charAt(str.length() - 1) != wrapWith)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(10217)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(10218)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(10219);builder.append(wrapWith);
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(10220);return builder.toString();
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    /**
     * <p>
     * Wraps a string with a string if that string is missing from the start or end of the given string.
     * </p>
     * 
     * <pre>
     * StringUtils.wrap(null, *)         = null
     * StringUtils.wrap("", *)           = ""
     * StringUtils.wrap("ab", null)      = "ab"
     * StringUtils.wrap("ab", "x")       = "xabx"
     * StringUtils.wrap("ab", "\"")      = "\"ab\""
     * StringUtils.wrap("\"ab\"", "\"")  = "\"ab\""
     * StringUtils.wrap("ab", "'")       = "'ab'"
     * StringUtils.wrap("'abcd'", "'")   = "'abcd'"
     * StringUtils.wrap("\"abcd\"", "'") = "'\"abcd\"'"
     * StringUtils.wrap("'abcd'", "\"")  = "\"'abcd'\""
     * StringUtils.wrap("/", "/")  = "/"
     * StringUtils.wrap("a/b/c", "/")  = "/a/b/c/"
     * StringUtils.wrap("/a/b/c", "/")  = "/a/b/c/"
     * StringUtils.wrap("a/b/c/", "/")  = "/a/b/c/"
     * </pre>
     * 
     * @param str
     *            the string to be wrapped, may be {@code null}
     * @param wrapWith
     *            the char that will wrap {@code str}
     * @return the wrapped string, or {@code null} if {@code str==null}
     * @since 3.5
     */
    public static String wrapIfMissing(final String str, final String wrapWith) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(10221);
        __CLR4_5_25lh5lhlvha79yz.R.inc(10222);if ((((isEmpty(str) || isEmpty(wrapWith))&&(__CLR4_5_25lh5lhlvha79yz.R.iget(10223)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(10224)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(10225);return str;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(10226);final StringBuilder builder = new StringBuilder(str.length() + wrapWith.length() + wrapWith.length());
        __CLR4_5_25lh5lhlvha79yz.R.inc(10227);if ((((!str.startsWith(wrapWith))&&(__CLR4_5_25lh5lhlvha79yz.R.iget(10228)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(10229)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(10230);builder.append(wrapWith);
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(10231);builder.append(str);
        __CLR4_5_25lh5lhlvha79yz.R.inc(10232);if ((((!str.endsWith(wrapWith))&&(__CLR4_5_25lh5lhlvha79yz.R.iget(10233)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(10234)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(10235);builder.append(wrapWith);
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(10236);return builder.toString();
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    /**
     * <p>
     * Unwraps a given string from anther string.
     * </p>
     *
     * <pre>
     * StringUtils.unwrap(null, null)         = null
     * StringUtils.unwrap(null, "")           = null
     * StringUtils.unwrap(null, "1")          = null
     * StringUtils.unwrap("\'abc\'", "\'")    = "abc"
     * StringUtils.unwrap("\"abc\"", "\"")    = "abc"
     * StringUtils.unwrap("AABabcBAA", "AA")  = "BabcB"
     * StringUtils.unwrap("A", "#")           = "A"
     * StringUtils.unwrap("#A", "#")          = "#A"
     * StringUtils.unwrap("A#", "#")          = "A#"
     * </pre>
     *
     * @param str
     *          the String to be unwrapped, can be null
     * @param wrapToken
     *          the String used to unwrap
     * @return unwrapped String or the original string 
     *          if it is not quoted properly with the wrapToken
     * @since 3.6
     */
    public static String unwrap(final String str, final String wrapToken) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(10237);
        __CLR4_5_25lh5lhlvha79yz.R.inc(10238);if ((((isEmpty(str) || isEmpty(wrapToken))&&(__CLR4_5_25lh5lhlvha79yz.R.iget(10239)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(10240)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(10241);return str;
        }

        }__CLR4_5_25lh5lhlvha79yz.R.inc(10242);if ((((startsWith(str, wrapToken) && endsWith(str, wrapToken))&&(__CLR4_5_25lh5lhlvha79yz.R.iget(10243)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(10244)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(10245);final int startIndex = str.indexOf(wrapToken);
            __CLR4_5_25lh5lhlvha79yz.R.inc(10246);final int endIndex = str.lastIndexOf(wrapToken);
            __CLR4_5_25lh5lhlvha79yz.R.inc(10247);final int wrapLength = wrapToken.length();
            __CLR4_5_25lh5lhlvha79yz.R.inc(10248);if ((((startIndex != -1 && endIndex != -1)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(10249)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(10250)==0&false))) {{
                __CLR4_5_25lh5lhlvha79yz.R.inc(10251);return str.substring(startIndex + wrapLength, endIndex);
            }
        }}

        }__CLR4_5_25lh5lhlvha79yz.R.inc(10252);return str;
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    /**
     * <p>
     * Unwraps a given string from a character.
     * </p>
     * 
     * <pre>
     * StringUtils.unwrap(null, null)         = null
     * StringUtils.unwrap(null, '\0')         = null
     * StringUtils.unwrap(null, '1')          = null
     * StringUtils.unwrap("\'abc\'", '\'')    = "abc"
     * StringUtils.unwrap("AABabcBAA", 'A')  = "ABabcBA"
     * StringUtils.unwrap("A", '#')           = "A"
     * StringUtils.unwrap("#A", '#')          = "#A"
     * StringUtils.unwrap("A#", '#')          = "A#"
     * </pre>
     *
     * @param str
     *          the String to be unwrapped, can be null
     * @param wrapChar
     *          the character used to unwrap
     * @return unwrapped String or the original string 
     *          if it is not quoted properly with the wrapChar
     * @since 3.6
     */
    public static String unwrap(final String str, final char wrapChar) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(10253);
        __CLR4_5_25lh5lhlvha79yz.R.inc(10254);if ((((isEmpty(str) || wrapChar == '\0')&&(__CLR4_5_25lh5lhlvha79yz.R.iget(10255)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(10256)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(10257);return str;
        }

        }__CLR4_5_25lh5lhlvha79yz.R.inc(10258);if ((((str.charAt(0) == wrapChar && str.charAt(str.length() - 1) == wrapChar)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(10259)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(10260)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(10261);final int startIndex = 0;
            __CLR4_5_25lh5lhlvha79yz.R.inc(10262);final int endIndex = str.length() - 1;
            __CLR4_5_25lh5lhlvha79yz.R.inc(10263);if ((((startIndex != -1 && endIndex != -1)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(10264)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(10265)==0&false))) {{
                __CLR4_5_25lh5lhlvha79yz.R.inc(10266);return str.substring(startIndex + 1, endIndex);
            }
        }}

        }__CLR4_5_25lh5lhlvha79yz.R.inc(10267);return str;
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}

    /**
     * <p>Converts a {@code CharSequence} into an array of code points.</p>
     * 
     * <p>Valid pairs of surrogate code units will be converted into a single supplementary
     * code point. Isolated surrogate code units (i.e. a high surrogate not followed by a low surrogate or
     * a low surrogate not preceeded by a high surrogate) will be returned as-is.</p>
     * 
     * <pre>
     * StringUtils.toCodePoints(null)   =  null
     * StringUtils.toCodePoints("")     =  []  // empty array
     * </pre>
     * 
     * @param str the character sequence to convert
     * @return an array of code points
     * @since 3.6
     */
    public static int[] toCodePoints(CharSequence str) {try{__CLR4_5_25lh5lhlvha79yz.R.inc(10268);
        __CLR4_5_25lh5lhlvha79yz.R.inc(10269);if ((((str == null)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(10270)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(10271)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(10272);return null;
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(10273);if ((((str.length() == 0)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(10274)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(10275)==0&false))) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(10276);return ArrayUtils.EMPTY_INT_ARRAY;
        }

        }__CLR4_5_25lh5lhlvha79yz.R.inc(10277);String s = str.toString();
        __CLR4_5_25lh5lhlvha79yz.R.inc(10278);int[] result = new int[s.codePointCount(0, s.length())];
        __CLR4_5_25lh5lhlvha79yz.R.inc(10279);int index = 0;
        __CLR4_5_25lh5lhlvha79yz.R.inc(10280);for (int i = 0; (((i < result.length)&&(__CLR4_5_25lh5lhlvha79yz.R.iget(10281)!=0|true))||(__CLR4_5_25lh5lhlvha79yz.R.iget(10282)==0&false)); i++) {{
            __CLR4_5_25lh5lhlvha79yz.R.inc(10283);result[i] = s.codePointAt(index);
            __CLR4_5_25lh5lhlvha79yz.R.inc(10284);index += Character.charCount(result[i]);
        }
        }__CLR4_5_25lh5lhlvha79yz.R.inc(10285);return result;
    }finally{__CLR4_5_25lh5lhlvha79yz.R.flushNeeded();}}
}
