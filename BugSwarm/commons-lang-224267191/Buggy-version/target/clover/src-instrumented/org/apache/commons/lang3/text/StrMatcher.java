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

import java.util.Arrays;

import org.apache.commons.lang3.StringUtils;

/**
 * A matcher class that can be queried to determine if a character array
 * portion matches.
 * <p>
 * This class comes complete with various factory methods.
 * If these do not suffice, you can subclass and implement your own matcher.
 *
 * @since 2.2
 * @deprecated as of 3.6, use commons-text
 * <a href="https://commons.apache.org/proper/commons-text/javadocs/api-release/org/apache/commons/text/StrMatcher.html">
 * StrMatcher</a> instead
 */
@Deprecated
public abstract class StrMatcher {public static class __CLR4_5_2fi4fi4lvha7bp0{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172755542L,8589935092L,20186,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Matches the comma character.
     */
    private static final StrMatcher COMMA_MATCHER = new CharMatcher(',');
    /**
     * Matches the tab character.
     */
    private static final StrMatcher TAB_MATCHER = new CharMatcher('\t');
    /**
     * Matches the space character.
     */
    private static final StrMatcher SPACE_MATCHER = new CharMatcher(' ');
    /**
     * Matches the same characters as StringTokenizer,
     * namely space, tab, newline, formfeed.
     */
    private static final StrMatcher SPLIT_MATCHER = new CharSetMatcher(" \t\n\r\f".toCharArray());
    /**
     * Matches the String trim() whitespace characters.
     */
    private static final StrMatcher TRIM_MATCHER = new TrimMatcher();
    /**
     * Matches the double quote character.
     */
    private static final StrMatcher SINGLE_QUOTE_MATCHER = new CharMatcher('\'');
    /**
     * Matches the double quote character.
     */
    private static final StrMatcher DOUBLE_QUOTE_MATCHER = new CharMatcher('"');
    /**
     * Matches the single or double quote character.
     */
    private static final StrMatcher QUOTE_MATCHER = new CharSetMatcher("'\"".toCharArray());
    /**
     * Matches no characters.
     */
    private static final StrMatcher NONE_MATCHER = new NoMatcher();

    // -----------------------------------------------------------------------

    /**
     * Returns a matcher which matches the comma character.
     *
     * @return a matcher for a comma
     */
    public static StrMatcher commaMatcher() {try{__CLR4_5_2fi4fi4lvha7bp0.R.inc(20092);
        __CLR4_5_2fi4fi4lvha7bp0.R.inc(20093);return COMMA_MATCHER;
    }finally{__CLR4_5_2fi4fi4lvha7bp0.R.flushNeeded();}}

    /**
     * Returns a matcher which matches the tab character.
     *
     * @return a matcher for a tab
     */
    public static StrMatcher tabMatcher() {try{__CLR4_5_2fi4fi4lvha7bp0.R.inc(20094);
        __CLR4_5_2fi4fi4lvha7bp0.R.inc(20095);return TAB_MATCHER;
    }finally{__CLR4_5_2fi4fi4lvha7bp0.R.flushNeeded();}}

    /**
     * Returns a matcher which matches the space character.
     *
     * @return a matcher for a space
     */
    public static StrMatcher spaceMatcher() {try{__CLR4_5_2fi4fi4lvha7bp0.R.inc(20096);
        __CLR4_5_2fi4fi4lvha7bp0.R.inc(20097);return SPACE_MATCHER;
    }finally{__CLR4_5_2fi4fi4lvha7bp0.R.flushNeeded();}}

    /**
     * Matches the same characters as StringTokenizer,
     * namely space, tab, newline and formfeed.
     *
     * @return the split matcher
     */
    public static StrMatcher splitMatcher() {try{__CLR4_5_2fi4fi4lvha7bp0.R.inc(20098);
        __CLR4_5_2fi4fi4lvha7bp0.R.inc(20099);return SPLIT_MATCHER;
    }finally{__CLR4_5_2fi4fi4lvha7bp0.R.flushNeeded();}}

    /**
     * Matches the String trim() whitespace characters.
     *
     * @return the trim matcher
     */
    public static StrMatcher trimMatcher() {try{__CLR4_5_2fi4fi4lvha7bp0.R.inc(20100);
        __CLR4_5_2fi4fi4lvha7bp0.R.inc(20101);return TRIM_MATCHER;
    }finally{__CLR4_5_2fi4fi4lvha7bp0.R.flushNeeded();}}

    /**
     * Returns a matcher which matches the single quote character.
     *
     * @return a matcher for a single quote
     */
    public static StrMatcher singleQuoteMatcher() {try{__CLR4_5_2fi4fi4lvha7bp0.R.inc(20102);
        __CLR4_5_2fi4fi4lvha7bp0.R.inc(20103);return SINGLE_QUOTE_MATCHER;
    }finally{__CLR4_5_2fi4fi4lvha7bp0.R.flushNeeded();}}

    /**
     * Returns a matcher which matches the double quote character.
     *
     * @return a matcher for a double quote
     */
    public static StrMatcher doubleQuoteMatcher() {try{__CLR4_5_2fi4fi4lvha7bp0.R.inc(20104);
        __CLR4_5_2fi4fi4lvha7bp0.R.inc(20105);return DOUBLE_QUOTE_MATCHER;
    }finally{__CLR4_5_2fi4fi4lvha7bp0.R.flushNeeded();}}

    /**
     * Returns a matcher which matches the single or double quote character.
     *
     * @return a matcher for a single or double quote
     */
    public static StrMatcher quoteMatcher() {try{__CLR4_5_2fi4fi4lvha7bp0.R.inc(20106);
        __CLR4_5_2fi4fi4lvha7bp0.R.inc(20107);return QUOTE_MATCHER;
    }finally{__CLR4_5_2fi4fi4lvha7bp0.R.flushNeeded();}}

    /**
     * Matches no characters.
     *
     * @return a matcher that matches nothing
     */
    public static StrMatcher noneMatcher() {try{__CLR4_5_2fi4fi4lvha7bp0.R.inc(20108);
        __CLR4_5_2fi4fi4lvha7bp0.R.inc(20109);return NONE_MATCHER;
    }finally{__CLR4_5_2fi4fi4lvha7bp0.R.flushNeeded();}}

    /**
     * Constructor that creates a matcher from a character.
     *
     * @param ch  the character to match, must not be null
     * @return a new Matcher for the given char
     */
    public static StrMatcher charMatcher(final char ch) {try{__CLR4_5_2fi4fi4lvha7bp0.R.inc(20110);
        __CLR4_5_2fi4fi4lvha7bp0.R.inc(20111);return new CharMatcher(ch);
    }finally{__CLR4_5_2fi4fi4lvha7bp0.R.flushNeeded();}}

    /**
     * Constructor that creates a matcher from a set of characters.
     *
     * @param chars  the characters to match, null or empty matches nothing
     * @return a new matcher for the given char[]
     */
    public static StrMatcher charSetMatcher(final char... chars) {try{__CLR4_5_2fi4fi4lvha7bp0.R.inc(20112);
        __CLR4_5_2fi4fi4lvha7bp0.R.inc(20113);if ((((chars == null || chars.length == 0)&&(__CLR4_5_2fi4fi4lvha7bp0.R.iget(20114)!=0|true))||(__CLR4_5_2fi4fi4lvha7bp0.R.iget(20115)==0&false))) {{
            __CLR4_5_2fi4fi4lvha7bp0.R.inc(20116);return NONE_MATCHER;
        }
        }__CLR4_5_2fi4fi4lvha7bp0.R.inc(20117);if ((((chars.length == 1)&&(__CLR4_5_2fi4fi4lvha7bp0.R.iget(20118)!=0|true))||(__CLR4_5_2fi4fi4lvha7bp0.R.iget(20119)==0&false))) {{
            __CLR4_5_2fi4fi4lvha7bp0.R.inc(20120);return new CharMatcher(chars[0]);
        }
        }__CLR4_5_2fi4fi4lvha7bp0.R.inc(20121);return new CharSetMatcher(chars);
    }finally{__CLR4_5_2fi4fi4lvha7bp0.R.flushNeeded();}}

    /**
     * Constructor that creates a matcher from a string representing a set of characters.
     *
     * @param chars  the characters to match, null or empty matches nothing
     * @return a new Matcher for the given characters
     */
    public static StrMatcher charSetMatcher(final String chars) {try{__CLR4_5_2fi4fi4lvha7bp0.R.inc(20122);
        __CLR4_5_2fi4fi4lvha7bp0.R.inc(20123);if ((((StringUtils.isEmpty(chars))&&(__CLR4_5_2fi4fi4lvha7bp0.R.iget(20124)!=0|true))||(__CLR4_5_2fi4fi4lvha7bp0.R.iget(20125)==0&false))) {{
            __CLR4_5_2fi4fi4lvha7bp0.R.inc(20126);return NONE_MATCHER;
        }
        }__CLR4_5_2fi4fi4lvha7bp0.R.inc(20127);if ((((chars.length() == 1)&&(__CLR4_5_2fi4fi4lvha7bp0.R.iget(20128)!=0|true))||(__CLR4_5_2fi4fi4lvha7bp0.R.iget(20129)==0&false))) {{
            __CLR4_5_2fi4fi4lvha7bp0.R.inc(20130);return new CharMatcher(chars.charAt(0));
        }
        }__CLR4_5_2fi4fi4lvha7bp0.R.inc(20131);return new CharSetMatcher(chars.toCharArray());
    }finally{__CLR4_5_2fi4fi4lvha7bp0.R.flushNeeded();}}

    /**
     * Constructor that creates a matcher from a string.
     *
     * @param str  the string to match, null or empty matches nothing
     * @return a new Matcher for the given String
     */
    public static StrMatcher stringMatcher(final String str) {try{__CLR4_5_2fi4fi4lvha7bp0.R.inc(20132);
        __CLR4_5_2fi4fi4lvha7bp0.R.inc(20133);if ((((StringUtils.isEmpty(str))&&(__CLR4_5_2fi4fi4lvha7bp0.R.iget(20134)!=0|true))||(__CLR4_5_2fi4fi4lvha7bp0.R.iget(20135)==0&false))) {{
            __CLR4_5_2fi4fi4lvha7bp0.R.inc(20136);return NONE_MATCHER;
        }
        }__CLR4_5_2fi4fi4lvha7bp0.R.inc(20137);return new StringMatcher(str);
    }finally{__CLR4_5_2fi4fi4lvha7bp0.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Constructor.
     */
    protected StrMatcher() {
        super();__CLR4_5_2fi4fi4lvha7bp0.R.inc(20139);try{__CLR4_5_2fi4fi4lvha7bp0.R.inc(20138);
    }finally{__CLR4_5_2fi4fi4lvha7bp0.R.flushNeeded();}}

    /**
     * Returns the number of matching characters, zero for no match.
     * <p>
     * This method is called to check for a match.
     * The parameter <code>pos</code> represents the current position to be
     * checked in the string <code>buffer</code> (a character array which must
     * not be changed).
     * The API guarantees that <code>pos</code> is a valid index for <code>buffer</code>.
     * <p>
     * The character array may be larger than the active area to be matched.
     * Only values in the buffer between the specified indices may be accessed.
     * <p>
     * The matching code may check one character or many.
     * It may check characters preceding <code>pos</code> as well as those
     * after, so long as no checks exceed the bounds specified.
     * <p>
     * It must return zero for no match, or a positive number if a match was found.
     * The number indicates the number of characters that matched.
     *
     * @param buffer  the text content to match against, do not change
     * @param pos  the starting position for the match, valid for buffer
     * @param bufferStart  the first active index in the buffer, valid for buffer
     * @param bufferEnd  the end index (exclusive) of the active buffer, valid for buffer
     * @return the number of matching characters, zero for no match
     */
    public abstract int isMatch(char[] buffer, int pos, int bufferStart, int bufferEnd);

    /**
     * Returns the number of matching characters, zero for no match.
     * <p>
     * This method is called to check for a match.
     * The parameter <code>pos</code> represents the current position to be
     * checked in the string <code>buffer</code> (a character array which must
     * not be changed).
     * The API guarantees that <code>pos</code> is a valid index for <code>buffer</code>.
     * <p>
     * The matching code may check one character or many.
     * It may check characters preceding <code>pos</code> as well as those after.
     * <p>
     * It must return zero for no match, or a positive number if a match was found.
     * The number indicates the number of characters that matched.
     *
     * @param buffer  the text content to match against, do not change
     * @param pos  the starting position for the match, valid for buffer
     * @return the number of matching characters, zero for no match
     * @since 2.4
     */
    public int isMatch(final char[] buffer, final int pos) {try{__CLR4_5_2fi4fi4lvha7bp0.R.inc(20140);
        __CLR4_5_2fi4fi4lvha7bp0.R.inc(20141);return isMatch(buffer, pos, 0, buffer.length);
    }finally{__CLR4_5_2fi4fi4lvha7bp0.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Class used to define a set of characters for matching purposes.
     */
    static final class CharSetMatcher extends StrMatcher {
        /** The set of characters to match. */
        private final char[] chars;

        /**
         * Constructor that creates a matcher from a character array.
         *
         * @param chars  the characters to match, must not be null
         */
        CharSetMatcher(final char chars[]) {
            super();__CLR4_5_2fi4fi4lvha7bp0.R.inc(20143);try{__CLR4_5_2fi4fi4lvha7bp0.R.inc(20142);
            __CLR4_5_2fi4fi4lvha7bp0.R.inc(20144);this.chars = chars.clone();
            __CLR4_5_2fi4fi4lvha7bp0.R.inc(20145);Arrays.sort(this.chars);
        }finally{__CLR4_5_2fi4fi4lvha7bp0.R.flushNeeded();}}

        /**
         * Returns whether or not the given character matches.
         *
         * @param buffer  the text content to match against, do not change
         * @param pos  the starting position for the match, valid for buffer
         * @param bufferStart  the first active index in the buffer, valid for buffer
         * @param bufferEnd  the end index of the active buffer, valid for buffer
         * @return the number of matching characters, zero for no match
         */
        @Override
        public int isMatch(final char[] buffer, final int pos, final int bufferStart, final int bufferEnd) {try{__CLR4_5_2fi4fi4lvha7bp0.R.inc(20146);
            __CLR4_5_2fi4fi4lvha7bp0.R.inc(20147);return (((Arrays.binarySearch(chars, buffer[pos]) >= 0 )&&(__CLR4_5_2fi4fi4lvha7bp0.R.iget(20148)!=0|true))||(__CLR4_5_2fi4fi4lvha7bp0.R.iget(20149)==0&false))? 1 : 0;
        }finally{__CLR4_5_2fi4fi4lvha7bp0.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    /**
     * Class used to define a character for matching purposes.
     */
    static final class CharMatcher extends StrMatcher {
        /** The character to match. */
        private final char ch;

        /**
         * Constructor that creates a matcher that matches a single character.
         *
         * @param ch  the character to match
         */
        CharMatcher(final char ch) {
            super();__CLR4_5_2fi4fi4lvha7bp0.R.inc(20151);try{__CLR4_5_2fi4fi4lvha7bp0.R.inc(20150);
            __CLR4_5_2fi4fi4lvha7bp0.R.inc(20152);this.ch = ch;
        }finally{__CLR4_5_2fi4fi4lvha7bp0.R.flushNeeded();}}

        /**
         * Returns whether or not the given character matches.
         *
         * @param buffer  the text content to match against, do not change
         * @param pos  the starting position for the match, valid for buffer
         * @param bufferStart  the first active index in the buffer, valid for buffer
         * @param bufferEnd  the end index of the active buffer, valid for buffer
         * @return the number of matching characters, zero for no match
         */
        @Override
        public int isMatch(final char[] buffer, final int pos, final int bufferStart, final int bufferEnd) {try{__CLR4_5_2fi4fi4lvha7bp0.R.inc(20153);
            __CLR4_5_2fi4fi4lvha7bp0.R.inc(20154);return (((ch == buffer[pos] )&&(__CLR4_5_2fi4fi4lvha7bp0.R.iget(20155)!=0|true))||(__CLR4_5_2fi4fi4lvha7bp0.R.iget(20156)==0&false))? 1 : 0;
        }finally{__CLR4_5_2fi4fi4lvha7bp0.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    /**
     * Class used to define a set of characters for matching purposes.
     */
    static final class StringMatcher extends StrMatcher {
        /** The string to match, as a character array. */
        private final char[] chars;

        /**
         * Constructor that creates a matcher from a String.
         *
         * @param str  the string to match, must not be null
         */
        StringMatcher(final String str) {
            super();__CLR4_5_2fi4fi4lvha7bp0.R.inc(20158);try{__CLR4_5_2fi4fi4lvha7bp0.R.inc(20157);
            __CLR4_5_2fi4fi4lvha7bp0.R.inc(20159);chars = str.toCharArray();
        }finally{__CLR4_5_2fi4fi4lvha7bp0.R.flushNeeded();}}

        /**
         * Returns whether or not the given text matches the stored string.
         *
         * @param buffer  the text content to match against, do not change
         * @param pos  the starting position for the match, valid for buffer
         * @param bufferStart  the first active index in the buffer, valid for buffer
         * @param bufferEnd  the end index of the active buffer, valid for buffer
         * @return the number of matching characters, zero for no match
         */
        @Override
        public int isMatch(final char[] buffer, int pos, final int bufferStart, final int bufferEnd) {try{__CLR4_5_2fi4fi4lvha7bp0.R.inc(20160);
            __CLR4_5_2fi4fi4lvha7bp0.R.inc(20161);final int len = chars.length;
            __CLR4_5_2fi4fi4lvha7bp0.R.inc(20162);if ((((pos + len > bufferEnd)&&(__CLR4_5_2fi4fi4lvha7bp0.R.iget(20163)!=0|true))||(__CLR4_5_2fi4fi4lvha7bp0.R.iget(20164)==0&false))) {{
                __CLR4_5_2fi4fi4lvha7bp0.R.inc(20165);return 0;
            }
            }__CLR4_5_2fi4fi4lvha7bp0.R.inc(20166);for (int i = 0; (((i < chars.length)&&(__CLR4_5_2fi4fi4lvha7bp0.R.iget(20167)!=0|true))||(__CLR4_5_2fi4fi4lvha7bp0.R.iget(20168)==0&false)); i++, pos++) {{
                __CLR4_5_2fi4fi4lvha7bp0.R.inc(20169);if ((((chars[i] != buffer[pos])&&(__CLR4_5_2fi4fi4lvha7bp0.R.iget(20170)!=0|true))||(__CLR4_5_2fi4fi4lvha7bp0.R.iget(20171)==0&false))) {{
                    __CLR4_5_2fi4fi4lvha7bp0.R.inc(20172);return 0;
                }
            }}
            }__CLR4_5_2fi4fi4lvha7bp0.R.inc(20173);return len;
        }finally{__CLR4_5_2fi4fi4lvha7bp0.R.flushNeeded();}}
        
        @Override
        public String toString() {try{__CLR4_5_2fi4fi4lvha7bp0.R.inc(20174);
            __CLR4_5_2fi4fi4lvha7bp0.R.inc(20175);return super.toString() + ' ' + Arrays.toString(chars);
        }finally{__CLR4_5_2fi4fi4lvha7bp0.R.flushNeeded();}}

    }

    //-----------------------------------------------------------------------
    /**
     * Class used to match no characters.
     */
    static final class NoMatcher extends StrMatcher {

        /**
         * Constructs a new instance of <code>NoMatcher</code>.
         */
        NoMatcher() {
            super();__CLR4_5_2fi4fi4lvha7bp0.R.inc(20177);try{__CLR4_5_2fi4fi4lvha7bp0.R.inc(20176);
        }finally{__CLR4_5_2fi4fi4lvha7bp0.R.flushNeeded();}}

        /**
         * Always returns <code>false</code>.
         *
         * @param buffer  the text content to match against, do not change
         * @param pos  the starting position for the match, valid for buffer
         * @param bufferStart  the first active index in the buffer, valid for buffer
         * @param bufferEnd  the end index of the active buffer, valid for buffer
         * @return the number of matching characters, zero for no match
         */
        @Override
        public int isMatch(final char[] buffer, final int pos, final int bufferStart, final int bufferEnd) {try{__CLR4_5_2fi4fi4lvha7bp0.R.inc(20178);
            __CLR4_5_2fi4fi4lvha7bp0.R.inc(20179);return 0;
        }finally{__CLR4_5_2fi4fi4lvha7bp0.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    /**
     * Class used to match whitespace as per trim().
     */
    static final class TrimMatcher extends StrMatcher {

        /**
         * Constructs a new instance of <code>TrimMatcher</code>.
         */
        TrimMatcher() {
            super();__CLR4_5_2fi4fi4lvha7bp0.R.inc(20181);try{__CLR4_5_2fi4fi4lvha7bp0.R.inc(20180);
        }finally{__CLR4_5_2fi4fi4lvha7bp0.R.flushNeeded();}}

        /**
         * Returns whether or not the given character matches.
         *
         * @param buffer  the text content to match against, do not change
         * @param pos  the starting position for the match, valid for buffer
         * @param bufferStart  the first active index in the buffer, valid for buffer
         * @param bufferEnd  the end index of the active buffer, valid for buffer
         * @return the number of matching characters, zero for no match
         */
        @Override
        public int isMatch(final char[] buffer, final int pos, final int bufferStart, final int bufferEnd) {try{__CLR4_5_2fi4fi4lvha7bp0.R.inc(20182);
            __CLR4_5_2fi4fi4lvha7bp0.R.inc(20183);return (((buffer[pos] <= 32 )&&(__CLR4_5_2fi4fi4lvha7bp0.R.iget(20184)!=0|true))||(__CLR4_5_2fi4fi4lvha7bp0.R.iget(20185)==0&false))? 1 : 0;
        }finally{__CLR4_5_2fi4fi4lvha7bp0.R.flushNeeded();}}
    }

}
