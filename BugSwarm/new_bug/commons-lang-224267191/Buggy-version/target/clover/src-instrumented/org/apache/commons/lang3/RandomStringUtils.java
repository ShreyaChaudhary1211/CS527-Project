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

import java.util.Random;

/**
 * <p>Operations for random {@code String}s.</p>
 * <p>Currently <em>private high surrogate</em> characters are ignored. 
 * These are Unicode characters that fall between the values 56192 (db80)
 * and 56319 (dbff) as we don't know how to handle them. 
 * High and low surrogates are correctly dealt with - that is if a 
 * high surrogate is randomly chosen, 55296 (d800) to 56191 (db7f) 
 * then it is followed by a low surrogate. If a low surrogate is chosen, 
 * 56320 (dc00) to 57343 (dfff) then it is placed after a randomly 
 * chosen high surrogate. </p>
 *
 * <p>#ThreadSafe#</p>
 * @since 1.0
 */
@java.lang.SuppressWarnings({"fallthrough"}) public class RandomStringUtils {public static class __CLR4_5_2595595lvha798m{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172755542L,8589935092L,6924,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * <p>Random object used by random method. This has to be not local
     * to the random method so as to not return the same value in the 
     * same millisecond.</p>
     */
    private static final Random RANDOM = new Random();

    /**
     * <p>{@code RandomStringUtils} instances should NOT be constructed in
     * standard programming. Instead, the class should be used as
     * {@code RandomStringUtils.random(5);}.</p>
     *
     * <p>This constructor is public to permit tools that require a JavaBean instance
     * to operate.</p>
     */
    public RandomStringUtils() {
      super();__CLR4_5_2595595lvha798m.R.inc(6810);try{__CLR4_5_2595595lvha798m.R.inc(6809);
    }finally{__CLR4_5_2595595lvha798m.R.flushNeeded();}}

    // Random
    //-----------------------------------------------------------------------
    /**
     * <p>Creates a random string whose length is the number of characters
     * specified.</p>
     *
     * <p>Characters will be chosen from the set of all characters.</p>
     *
     * @param count  the length of random string to create
     * @return the random string
     */
    public static String random(final int count) {try{__CLR4_5_2595595lvha798m.R.inc(6811);
        __CLR4_5_2595595lvha798m.R.inc(6812);return random(count, false, false);
    }finally{__CLR4_5_2595595lvha798m.R.flushNeeded();}}

    /**
     * <p>Creates a random string whose length is the number of characters
     * specified.</p>
     *
     * <p>Characters will be chosen from the set of characters whose
     * ASCII value is between {@code 32} and {@code 126} (inclusive).</p>
     *
     * @param count  the length of random string to create
     * @return the random string
     */
    public static String randomAscii(final int count) {try{__CLR4_5_2595595lvha798m.R.inc(6813);
        __CLR4_5_2595595lvha798m.R.inc(6814);return random(count, 32, 127, false, false);
    }finally{__CLR4_5_2595595lvha798m.R.flushNeeded();}}

    /**
     * <p>Creates a random string whose length is between the inclusive minimum and
     * the exclusive maximum.</p>
     *
     * <p>Characters will be chosen from the set of characters whose
     * ASCII value is between {@code 32} and {@code 126} (inclusive).</p>
     *
     * @param minLengthInclusive the inclusive minimum length of the string to generate
     * @param maxLengthExclusive the exclusive maximum length of the string to generate
     * @return the random string
     * @since 3.5
     */
    public static String randomAscii(final int minLengthInclusive, final int maxLengthExclusive) {try{__CLR4_5_2595595lvha798m.R.inc(6815);
        __CLR4_5_2595595lvha798m.R.inc(6816);return randomAscii(RandomUtils.nextInt(minLengthInclusive, maxLengthExclusive));
    }finally{__CLR4_5_2595595lvha798m.R.flushNeeded();}}

    /**
     * <p>Creates a random string whose length is the number of characters
     * specified.</p>
     *
     * <p>Characters will be chosen from the set of Latin alphabetic
     * characters (a-z, A-Z).</p>
     *
     * @param count  the length of random string to create
     * @return the random string
     */
    public static String randomAlphabetic(final int count) {try{__CLR4_5_2595595lvha798m.R.inc(6817);
        __CLR4_5_2595595lvha798m.R.inc(6818);return random(count, true, false);
    }finally{__CLR4_5_2595595lvha798m.R.flushNeeded();}}

    /**
     * <p>Creates a random string whose length is between the inclusive minimum and
     * the exclusive maximum.</p>
     *
     * <p>Characters will be chosen from the set of Latin alphabetic characters (a-z, A-Z).</p>
     *
     * @param minLengthInclusive the inclusive minimum length of the string to generate
     * @param maxLengthExclusive the exclusive maximum length of the string to generate
     * @return the random string
     * @since 3.5
     */
    public static String randomAlphabetic(final int minLengthInclusive, final int maxLengthExclusive) {try{__CLR4_5_2595595lvha798m.R.inc(6819);
        __CLR4_5_2595595lvha798m.R.inc(6820);return randomAlphabetic(RandomUtils.nextInt(minLengthInclusive, maxLengthExclusive));
    }finally{__CLR4_5_2595595lvha798m.R.flushNeeded();}}

    /**
     * <p>Creates a random string whose length is the number of characters
     * specified.</p>
     *
     * <p>Characters will be chosen from the set of Latin alphabetic
     * characters (a-z, A-Z) and the digits 0-9.</p>
     *
     * @param count  the length of random string to create
     * @return the random string
     */
    public static String randomAlphanumeric(final int count) {try{__CLR4_5_2595595lvha798m.R.inc(6821);
        __CLR4_5_2595595lvha798m.R.inc(6822);return random(count, true, true);
    }finally{__CLR4_5_2595595lvha798m.R.flushNeeded();}}

    /**
     * <p>Creates a random string whose length is between the inclusive minimum and
     * the exclusive maximum.</p>
     *
     * <p>Characters will be chosen from the set of Latin alphabetic
     * characters (a-z, A-Z) and the digits 0-9.</p>
     *
     * @param minLengthInclusive the inclusive minimum length of the string to generate
     * @param maxLengthExclusive the exclusive maximum length of the string to generate
     * @return the random string
     * @since 3.5
     */
    public static String randomAlphanumeric(final int minLengthInclusive, final int maxLengthExclusive) {try{__CLR4_5_2595595lvha798m.R.inc(6823);
        __CLR4_5_2595595lvha798m.R.inc(6824);return randomAlphanumeric(RandomUtils.nextInt(minLengthInclusive, maxLengthExclusive));
    }finally{__CLR4_5_2595595lvha798m.R.flushNeeded();}}

    /**
     * <p>Creates a random string whose length is the number of characters specified.</p>
     *
     * <p>Characters will be chosen from the set of characters which match the POSIX [:graph:]
     * regular expression character class. This class contains all visible ASCII characters 
     * (i.e. anything except spaces and control characters).</p>
     *
     * @param count  the length of random string to create
     * @return the random string
     * @since 3.5
     */
    public static String randomGraph(final int count) {try{__CLR4_5_2595595lvha798m.R.inc(6825);
        __CLR4_5_2595595lvha798m.R.inc(6826);return random(count, 33, 126, false, false);
    }finally{__CLR4_5_2595595lvha798m.R.flushNeeded();}}

    /**
     * <p>Creates a random string whose length is between the inclusive minimum and
     * the exclusive maximum.</p>
     *
     * <p>Characters will be chosen from the set of \p{Graph} characters.</p>
     *
     * @param minLengthInclusive the inclusive minimum length of the string to generate
     * @param maxLengthExclusive the exclusive maximum length of the string to generate
     * @return the random string
     * @since 3.5
     */
    public static String randomGraph(final int minLengthInclusive, final int maxLengthExclusive) {try{__CLR4_5_2595595lvha798m.R.inc(6827);
        __CLR4_5_2595595lvha798m.R.inc(6828);return randomGraph(RandomUtils.nextInt(minLengthInclusive, maxLengthExclusive));
    }finally{__CLR4_5_2595595lvha798m.R.flushNeeded();}}

    /**
     * <p>Creates a random string whose length is the number of characters
     * specified.</p>
     *
     * <p>Characters will be chosen from the set of numeric
     * characters.</p>
     *
     * @param count  the length of random string to create
     * @return the random string
     */
    public static String randomNumeric(final int count) {try{__CLR4_5_2595595lvha798m.R.inc(6829);
        __CLR4_5_2595595lvha798m.R.inc(6830);return random(count, false, true);
    }finally{__CLR4_5_2595595lvha798m.R.flushNeeded();}}

    /**
     * <p>Creates a random string whose length is between the inclusive minimum and
     * the exclusive maximum.</p>
     *
     * <p>Characters will be chosen from the set of \p{Digit} characters.</p>
     *
     * @param minLengthInclusive the inclusive minimum length of the string to generate
     * @param maxLengthExclusive the exclusive maximum length of the string to generate
     * @return the random string
     * @since 3.5
     */
    public static String randomNumeric(final int minLengthInclusive, final int maxLengthExclusive) {try{__CLR4_5_2595595lvha798m.R.inc(6831);
        __CLR4_5_2595595lvha798m.R.inc(6832);return randomNumeric(RandomUtils.nextInt(minLengthInclusive, maxLengthExclusive));
    }finally{__CLR4_5_2595595lvha798m.R.flushNeeded();}}

    /**
     * <p>Creates a random string whose length is the number of characters specified.</p>
     *
     * <p>Characters will be chosen from the set of characters which match the POSIX [:print:]
     * regular expression character class. This class includes all visible ASCII characters and spaces
     * (i.e. anything except control characters).</p>
     *
     * @param count  the length of random string to create
     * @return the random string
     * @since 3.5
     */
    public static String randomPrint(final int count) {try{__CLR4_5_2595595lvha798m.R.inc(6833);
        __CLR4_5_2595595lvha798m.R.inc(6834);return random(count, 32, 126, false, false);
    }finally{__CLR4_5_2595595lvha798m.R.flushNeeded();}}

    /**
     * <p>Creates a random string whose length is between the inclusive minimum and
     * the exclusive maximum.</p>
     *
     * <p>Characters will be chosen from the set of \p{Print} characters.</p>
     *
     * @param minLengthInclusive the inclusive minimum length of the string to generate
     * @param maxLengthExclusive the exclusive maximum length of the string to generate
     * @return the random string
     * @since 3.5
     */
    public static String randomPrint(final int minLengthInclusive, final int maxLengthExclusive) {try{__CLR4_5_2595595lvha798m.R.inc(6835);
        __CLR4_5_2595595lvha798m.R.inc(6836);return randomPrint(RandomUtils.nextInt(minLengthInclusive, maxLengthExclusive));
    }finally{__CLR4_5_2595595lvha798m.R.flushNeeded();}}

    /**
     * <p>Creates a random string whose length is the number of characters
     * specified.</p>
     *
     * <p>Characters will be chosen from the set of alpha-numeric
     * characters as indicated by the arguments.</p>
     *
     * @param count  the length of random string to create
     * @param letters  if {@code true}, generated string may include
     *  alphabetic characters
     * @param numbers  if {@code true}, generated string may include
     *  numeric characters
     * @return the random string
     */
    public static String random(final int count, final boolean letters, final boolean numbers) {try{__CLR4_5_2595595lvha798m.R.inc(6837);
        __CLR4_5_2595595lvha798m.R.inc(6838);return random(count, 0, 0, letters, numbers);
    }finally{__CLR4_5_2595595lvha798m.R.flushNeeded();}}
    
    /**
     * <p>Creates a random string whose length is the number of characters
     * specified.</p>
     *
     * <p>Characters will be chosen from the set of alpha-numeric
     * characters as indicated by the arguments.</p>
     *
     * @param count  the length of random string to create
     * @param start  the position in set of chars to start at
     * @param end  the position in set of chars to end before
     * @param letters  if {@code true}, generated string may include
     *  alphabetic characters
     * @param numbers  if {@code true}, generated string may include
     *  numeric characters
     * @return the random string
     */
    public static String random(final int count, final int start, final int end, final boolean letters, final boolean numbers) {try{__CLR4_5_2595595lvha798m.R.inc(6839);
        __CLR4_5_2595595lvha798m.R.inc(6840);return random(count, start, end, letters, numbers, null, RANDOM);
    }finally{__CLR4_5_2595595lvha798m.R.flushNeeded();}}

    /**
     * <p>Creates a random string based on a variety of options, using
     * default source of randomness.</p>
     *
     * <p>This method has exactly the same semantics as
     * {@link #random(int,int,int,boolean,boolean,char[],Random)}, but
     * instead of using an externally supplied source of randomness, it uses
     * the internal static {@link Random} instance.</p>
     *
     * @param count  the length of random string to create
     * @param start  the position in set of chars to start at
     * @param end  the position in set of chars to end before
     * @param letters  only allow letters?
     * @param numbers  only allow numbers?
     * @param chars  the set of chars to choose randoms from.
     *  If {@code null}, then it will use the set of all chars.
     * @return the random string
     * @throws ArrayIndexOutOfBoundsException if there are not
     *  {@code (end - start) + 1} characters in the set array.
     */
    public static String random(final int count, final int start, final int end, final boolean letters, final boolean numbers, final char... chars) {try{__CLR4_5_2595595lvha798m.R.inc(6841);
        __CLR4_5_2595595lvha798m.R.inc(6842);return random(count, start, end, letters, numbers, chars, RANDOM);
    }finally{__CLR4_5_2595595lvha798m.R.flushNeeded();}}

    /**
     * <p>Creates a random string based on a variety of options, using
     * supplied source of randomness.</p>
     *
     * <p>If start and end are both {@code 0}, start and end are set
     * to {@code ' '} and {@code 'z'}, the ASCII printable
     * characters, will be used, unless letters and numbers are both
     * {@code false}, in which case, start and end are set to
     * {@code 0} and {@link Character#MAX_CODE_POINT}.
     *
     * <p>If set is not {@code null}, characters between start and
     * end are chosen.</p>
     *
     * <p>This method accepts a user-supplied {@link Random}
     * instance to use as a source of randomness. By seeding a single 
     * {@link Random} instance with a fixed seed and using it for each call,
     * the same random sequence of strings can be generated repeatedly
     * and predictably.</p>
     *
     * @param count  the length of random string to create
     * @param start  the position in set of chars to start at (inclusive)
     * @param end  the position in set of chars to end before (exclusive)
     * @param letters  only allow letters?
     * @param numbers  only allow numbers?
     * @param chars  the set of chars to choose randoms from, must not be empty.
     *  If {@code null}, then it will use the set of all chars.
     * @param random  a source of randomness.
     * @return the random string
     * @throws ArrayIndexOutOfBoundsException if there are not
     *  {@code (end - start) + 1} characters in the set array.
     * @throws IllegalArgumentException if {@code count} &lt; 0 or the provided chars array is empty.
     * @since 2.0
     */
    public static String random(int count, int start, int end, final boolean letters, final boolean numbers,
                                final char[] chars, final Random random) {try{__CLR4_5_2595595lvha798m.R.inc(6843);
        __CLR4_5_2595595lvha798m.R.inc(6844);if ((((count == 0)&&(__CLR4_5_2595595lvha798m.R.iget(6845)!=0|true))||(__CLR4_5_2595595lvha798m.R.iget(6846)==0&false))) {{
            __CLR4_5_2595595lvha798m.R.inc(6847);return StringUtils.EMPTY;
        } }else {__CLR4_5_2595595lvha798m.R.inc(6848);if ((((count < 0)&&(__CLR4_5_2595595lvha798m.R.iget(6849)!=0|true))||(__CLR4_5_2595595lvha798m.R.iget(6850)==0&false))) {{
            __CLR4_5_2595595lvha798m.R.inc(6851);throw new IllegalArgumentException("Requested random string length " + count + " is less than 0.");
        }
        }}__CLR4_5_2595595lvha798m.R.inc(6852);if ((((chars != null && chars.length == 0)&&(__CLR4_5_2595595lvha798m.R.iget(6853)!=0|true))||(__CLR4_5_2595595lvha798m.R.iget(6854)==0&false))) {{
            __CLR4_5_2595595lvha798m.R.inc(6855);throw new IllegalArgumentException("The chars array must not be empty");
        }

        }__CLR4_5_2595595lvha798m.R.inc(6856);if ((((start == 0 && end == 0)&&(__CLR4_5_2595595lvha798m.R.iget(6857)!=0|true))||(__CLR4_5_2595595lvha798m.R.iget(6858)==0&false))) {{
            __CLR4_5_2595595lvha798m.R.inc(6859);if ((((chars != null)&&(__CLR4_5_2595595lvha798m.R.iget(6860)!=0|true))||(__CLR4_5_2595595lvha798m.R.iget(6861)==0&false))) {{
                __CLR4_5_2595595lvha798m.R.inc(6862);end = chars.length;
            } }else {{
                __CLR4_5_2595595lvha798m.R.inc(6863);if ((((!letters && !numbers)&&(__CLR4_5_2595595lvha798m.R.iget(6864)!=0|true))||(__CLR4_5_2595595lvha798m.R.iget(6865)==0&false))) {{
                    __CLR4_5_2595595lvha798m.R.inc(6866);end = Character.MAX_CODE_POINT;
                } }else {{
                    __CLR4_5_2595595lvha798m.R.inc(6867);end = 'z' + 1;
                    __CLR4_5_2595595lvha798m.R.inc(6868);start = ' ';                
                }
            }}
        }} }else {{
            __CLR4_5_2595595lvha798m.R.inc(6869);if ((((end <= start)&&(__CLR4_5_2595595lvha798m.R.iget(6870)!=0|true))||(__CLR4_5_2595595lvha798m.R.iget(6871)==0&false))) {{
                __CLR4_5_2595595lvha798m.R.inc(6872);throw new IllegalArgumentException("Parameter end (" + end + ") must be greater than start (" + start + ")");
            }
        }}

        }__CLR4_5_2595595lvha798m.R.inc(6873);final int zero_digit_ascii = 48;
        __CLR4_5_2595595lvha798m.R.inc(6874);final int first_letter_ascii = 65;

        __CLR4_5_2595595lvha798m.R.inc(6875);if ((((chars == null && (numbers && end <= zero_digit_ascii
                || letters && end <= first_letter_ascii))&&(__CLR4_5_2595595lvha798m.R.iget(6876)!=0|true))||(__CLR4_5_2595595lvha798m.R.iget(6877)==0&false))) {{
            __CLR4_5_2595595lvha798m.R.inc(6878);throw new IllegalArgumentException("Parameter end (" + end + ") must be greater then (" + zero_digit_ascii + ") for generating digits " +
                    "or greater then (" + first_letter_ascii + ") for generating letters.");
        }

        }__CLR4_5_2595595lvha798m.R.inc(6879);StringBuilder builder = new StringBuilder(count);
        __CLR4_5_2595595lvha798m.R.inc(6880);final int gap = end - start;

        __CLR4_5_2595595lvha798m.R.inc(6881);while ((((count-- != 0)&&(__CLR4_5_2595595lvha798m.R.iget(6882)!=0|true))||(__CLR4_5_2595595lvha798m.R.iget(6883)==0&false))) {{
            __CLR4_5_2595595lvha798m.R.inc(6884);int codePoint;
            __CLR4_5_2595595lvha798m.R.inc(6885);if ((((chars == null)&&(__CLR4_5_2595595lvha798m.R.iget(6886)!=0|true))||(__CLR4_5_2595595lvha798m.R.iget(6887)==0&false))) {{
                __CLR4_5_2595595lvha798m.R.inc(6888);codePoint = random.nextInt(gap) + start;
                
                boolean __CLB4_5_2_bool0=false;__CLR4_5_2595595lvha798m.R.inc(6889);switch (Character.getType(codePoint)) {
                case Character.UNASSIGNED:if (!__CLB4_5_2_bool0) {__CLR4_5_2595595lvha798m.R.inc(6890);__CLB4_5_2_bool0=true;}
                case Character.PRIVATE_USE:if (!__CLB4_5_2_bool0) {__CLR4_5_2595595lvha798m.R.inc(6891);__CLB4_5_2_bool0=true;}
                case Character.SURROGATE:if (!__CLB4_5_2_bool0) {__CLR4_5_2595595lvha798m.R.inc(6892);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2595595lvha798m.R.inc(6893);count++;
                    __CLR4_5_2595595lvha798m.R.inc(6894);continue;
                }
                
            } }else {{
                __CLR4_5_2595595lvha798m.R.inc(6895);codePoint = chars[random.nextInt(gap) + start];
            }
            
            }__CLR4_5_2595595lvha798m.R.inc(6896);final int numberOfChars = Character.charCount(codePoint);
            __CLR4_5_2595595lvha798m.R.inc(6897);if ((((count == 0 && numberOfChars > 1)&&(__CLR4_5_2595595lvha798m.R.iget(6898)!=0|true))||(__CLR4_5_2595595lvha798m.R.iget(6899)==0&false))) {{
                __CLR4_5_2595595lvha798m.R.inc(6900);count++;
                __CLR4_5_2595595lvha798m.R.inc(6901);continue;
            }
            
            }__CLR4_5_2595595lvha798m.R.inc(6902);if ((((letters && Character.isLetter(codePoint)
                    || numbers && Character.isDigit(codePoint)
                    || !letters && !numbers)&&(__CLR4_5_2595595lvha798m.R.iget(6903)!=0|true))||(__CLR4_5_2595595lvha798m.R.iget(6904)==0&false))) {{               
                __CLR4_5_2595595lvha798m.R.inc(6905);builder.appendCodePoint(codePoint);
                
                __CLR4_5_2595595lvha798m.R.inc(6906);if ((((numberOfChars == 2)&&(__CLR4_5_2595595lvha798m.R.iget(6907)!=0|true))||(__CLR4_5_2595595lvha798m.R.iget(6908)==0&false))) {{
                    __CLR4_5_2595595lvha798m.R.inc(6909);count--;
                }
                
            }} }else {{
                __CLR4_5_2595595lvha798m.R.inc(6910);count++;
            }
        }}
        }__CLR4_5_2595595lvha798m.R.inc(6911);return builder.toString();
    }finally{__CLR4_5_2595595lvha798m.R.flushNeeded();}}


    /**
     * <p>Creates a random string whose length is the number of characters
     * specified.</p>
     *
     * <p>Characters will be chosen from the set of characters
     * specified by the string, must not be empty. 
     * If null, the set of all characters is used.</p>
     *
     * @param count  the length of random string to create
     * @param chars  the String containing the set of characters to use,
     *  may be null, but must not be empty
     * @return the random string
     * @throws IllegalArgumentException if {@code count} &lt; 0 or the string is empty.
     */
    public static String random(final int count, final String chars) {try{__CLR4_5_2595595lvha798m.R.inc(6912);
        __CLR4_5_2595595lvha798m.R.inc(6913);if ((((chars == null)&&(__CLR4_5_2595595lvha798m.R.iget(6914)!=0|true))||(__CLR4_5_2595595lvha798m.R.iget(6915)==0&false))) {{
            __CLR4_5_2595595lvha798m.R.inc(6916);return random(count, 0, 0, false, false, null, RANDOM);
        }
        }__CLR4_5_2595595lvha798m.R.inc(6917);return random(count, chars.toCharArray());
    }finally{__CLR4_5_2595595lvha798m.R.flushNeeded();}}

    /**
     * <p>Creates a random string whose length is the number of characters
     * specified.</p>
     *
     * <p>Characters will be chosen from the set of characters specified.</p>
     *
     * @param count  the length of random string to create
     * @param chars  the character array containing the set of characters to use,
     *  may be null
     * @return the random string
     * @throws IllegalArgumentException if {@code count} &lt; 0.
     */
    public static String random(final int count, final char... chars) {try{__CLR4_5_2595595lvha798m.R.inc(6918);
        __CLR4_5_2595595lvha798m.R.inc(6919);if ((((chars == null)&&(__CLR4_5_2595595lvha798m.R.iget(6920)!=0|true))||(__CLR4_5_2595595lvha798m.R.iget(6921)==0&false))) {{
            __CLR4_5_2595595lvha798m.R.inc(6922);return random(count, 0, 0, false, false, null, RANDOM);
        }
        }__CLR4_5_2595595lvha798m.R.inc(6923);return random(count, 0, chars.length, false, false, chars, RANDOM);
    }finally{__CLR4_5_2595595lvha798m.R.flushNeeded();}}
    
}
