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

/**
 * <p>Operations on {@link CharSequence} that are
 * {@code null} safe.</p>
 *
 * @see CharSequence
 * @since 3.0
 */
public class CharSequenceUtils {public static class __CLR4_5_23di3dilvha78mx{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172755542L,8589935092L,4508,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final int NOT_FOUND = -1;

    /**
     * <p>{@code CharSequenceUtils} instances should NOT be constructed in
     * standard programming. </p>
     *
     * <p>This constructor is public to permit tools that require a JavaBean
     * instance to operate.</p>
     */
    public CharSequenceUtils() {
        super();__CLR4_5_23di3dilvha78mx.R.inc(4375);try{__CLR4_5_23di3dilvha78mx.R.inc(4374);
    }finally{__CLR4_5_23di3dilvha78mx.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * <p>Returns a new {@code CharSequence} that is a subsequence of this
     * sequence starting with the {@code char} value at the specified index.</p>
     *
     * <p>This provides the {@code CharSequence} equivalent to {@link String#substring(int)}.
     * The length (in {@code char}) of the returned sequence is {@code length() - start},
     * so if {@code start == end} then an empty sequence is returned.</p>
     *
     * @param cs  the specified subsequence, null returns null
     * @param start  the start index, inclusive, valid
     * @return a new subsequence, may be null
     * @throws IndexOutOfBoundsException if {@code start} is negative or if 
     *  {@code start} is greater than {@code length()}
     */
    public static CharSequence subSequence(final CharSequence cs, final int start) {try{__CLR4_5_23di3dilvha78mx.R.inc(4376);
        __CLR4_5_23di3dilvha78mx.R.inc(4377);return (((cs == null )&&(__CLR4_5_23di3dilvha78mx.R.iget(4378)!=0|true))||(__CLR4_5_23di3dilvha78mx.R.iget(4379)==0&false))? null : cs.subSequence(start, cs.length());
    }finally{__CLR4_5_23di3dilvha78mx.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Returns the index within <code>cs</code> of the first occurrence of the
     * specified character, starting the search at the specified index.
     * <p>
     * If a character with value <code>searchChar</code> occurs in the
     * character sequence represented by the <code>cs</code>
     * object at an index no smaller than <code>start</code>, then
     * the index of the first such occurrence is returned. For values
     * of <code>searchChar</code> in the range from 0 to 0xFFFF (inclusive),
     * this is the smallest value <i>k</i> such that:
     * <blockquote><pre>
     * (this.charAt(<i>k</i>) == searchChar) &amp;&amp; (<i>k</i> &gt;= start)
     * </pre></blockquote>
     * is true. For other values of <code>searchChar</code>, it is the
     * smallest value <i>k</i> such that:
     * <blockquote><pre>
     * (this.codePointAt(<i>k</i>) == searchChar) &amp;&amp; (<i>k</i> &gt;= start)
     * </pre></blockquote>
     * is true. In either case, if no such character occurs inm <code>cs</code>
     * at or after position <code>start</code>, then
     * <code>-1</code> is returned.
     *
     * <p>
     * There is no restriction on the value of <code>start</code>. If it
     * is negative, it has the same effect as if it were zero: the entire
     * <code>CharSequence</code> may be searched. If it is greater than
     * the length of <code>cs</code>, it has the same effect as if it were
     * equal to the length of <code>cs</code>: <code>-1</code> is returned.
     *
     * <p>All indices are specified in <code>char</code> values
     * (Unicode code units).
     *
     * @param cs  the {@code CharSequence} to be processed, not null
     * @param searchChar  the char to be searched for
     * @param start  the start index, negative starts at the string start
     * @return the index where the search char was found, -1 if not found
     * @since 3.6 updated to behave more like <code>String</code>
     */
    static int indexOf(final CharSequence cs, final int searchChar, int start) {try{__CLR4_5_23di3dilvha78mx.R.inc(4380);
        __CLR4_5_23di3dilvha78mx.R.inc(4381);if ((((cs instanceof String)&&(__CLR4_5_23di3dilvha78mx.R.iget(4382)!=0|true))||(__CLR4_5_23di3dilvha78mx.R.iget(4383)==0&false))) {{
            __CLR4_5_23di3dilvha78mx.R.inc(4384);return ((String) cs).indexOf(searchChar, start);
        }
        }__CLR4_5_23di3dilvha78mx.R.inc(4385);final int sz = cs.length();
        __CLR4_5_23di3dilvha78mx.R.inc(4386);if ((((start < 0)&&(__CLR4_5_23di3dilvha78mx.R.iget(4387)!=0|true))||(__CLR4_5_23di3dilvha78mx.R.iget(4388)==0&false))) {{
            __CLR4_5_23di3dilvha78mx.R.inc(4389);start = 0;
        }
        }__CLR4_5_23di3dilvha78mx.R.inc(4390);if ((((searchChar < Character.MIN_SUPPLEMENTARY_CODE_POINT)&&(__CLR4_5_23di3dilvha78mx.R.iget(4391)!=0|true))||(__CLR4_5_23di3dilvha78mx.R.iget(4392)==0&false))) {{
            __CLR4_5_23di3dilvha78mx.R.inc(4393);for (int i = start; (((i < sz)&&(__CLR4_5_23di3dilvha78mx.R.iget(4394)!=0|true))||(__CLR4_5_23di3dilvha78mx.R.iget(4395)==0&false)); i++) {{
                __CLR4_5_23di3dilvha78mx.R.inc(4396);if ((((cs.charAt(i) == searchChar)&&(__CLR4_5_23di3dilvha78mx.R.iget(4397)!=0|true))||(__CLR4_5_23di3dilvha78mx.R.iget(4398)==0&false))) {{
                    __CLR4_5_23di3dilvha78mx.R.inc(4399);return i;
                }
            }}
        }}
        //supplementary characters (LANG1300)
        }__CLR4_5_23di3dilvha78mx.R.inc(4400);if ((((searchChar <= Character.MAX_CODE_POINT)&&(__CLR4_5_23di3dilvha78mx.R.iget(4401)!=0|true))||(__CLR4_5_23di3dilvha78mx.R.iget(4402)==0&false))) {{
            __CLR4_5_23di3dilvha78mx.R.inc(4403);char[] chars = Character.toChars(searchChar);
            __CLR4_5_23di3dilvha78mx.R.inc(4404);for (int i = start; (((i < sz - 1)&&(__CLR4_5_23di3dilvha78mx.R.iget(4405)!=0|true))||(__CLR4_5_23di3dilvha78mx.R.iget(4406)==0&false)); i++) {{
                __CLR4_5_23di3dilvha78mx.R.inc(4407);char high = cs.charAt(i);
                __CLR4_5_23di3dilvha78mx.R.inc(4408);char low = cs.charAt(i + 1);
                __CLR4_5_23di3dilvha78mx.R.inc(4409);if ((((high == chars[0] && low == chars[1])&&(__CLR4_5_23di3dilvha78mx.R.iget(4410)!=0|true))||(__CLR4_5_23di3dilvha78mx.R.iget(4411)==0&false))) {{
                    __CLR4_5_23di3dilvha78mx.R.inc(4412);return i;
                }
            }}
        }}
        }__CLR4_5_23di3dilvha78mx.R.inc(4413);return NOT_FOUND;
    }finally{__CLR4_5_23di3dilvha78mx.R.flushNeeded();}}

    /**
     * Used by the indexOf(CharSequence methods) as a green implementation of indexOf.
     *
     * @param cs the {@code CharSequence} to be processed
     * @param searchChar the {@code CharSequence} to be searched for
     * @param start the start index
     * @return the index where the search sequence was found
     */
    static int indexOf(final CharSequence cs, final CharSequence searchChar, final int start) {try{__CLR4_5_23di3dilvha78mx.R.inc(4414);
        __CLR4_5_23di3dilvha78mx.R.inc(4415);return cs.toString().indexOf(searchChar.toString(), start);
//        if (cs instanceof String && searchChar instanceof String) {
//            // TODO: Do we assume searchChar is usually relatively small;
//            //       If so then calling toString() on it is better than reverting to
//            //       the green implementation in the else block
//            return ((String) cs).indexOf((String) searchChar, start);
//        } else {
//            // TODO: Implement rather than convert to String
//            return cs.toString().indexOf(searchChar.toString(), start);
//        }
    }finally{__CLR4_5_23di3dilvha78mx.R.flushNeeded();}}

    /**
     * Returns the index within <code>cs</code> of the last occurrence of
     * the specified character, searching backward starting at the
     * specified index. For values of <code>searchChar</code> in the range
     * from 0 to 0xFFFF (inclusive), the index returned is the largest
     * value <i>k</i> such that:
     * <blockquote><pre>
     * (this.charAt(<i>k</i>) == searchChar) &amp;&amp; (<i>k</i> &lt;= start)
     * </pre></blockquote>
     * is true. For other values of <code>searchChar</code>, it is the
     * largest value <i>k</i> such that:
     * <blockquote><pre>
     * (this.codePointAt(<i>k</i>) == searchChar) &amp;&amp; (<i>k</i> &lt;= start)
     * </pre></blockquote>
     * is true. In either case, if no such character occurs in <code>cs</code>
     * at or before position <code>start</code>, then <code>-1</code> is returned.
     *
     * <p>All indices are specified in <code>char</code> values
     * (Unicode code units).
     *
     * @param cs  the {@code CharSequence} to be processed
     * @param searchChar  the char to be searched for
     * @param start  the start index, negative returns -1, beyond length starts at end
     * @return the index where the search char was found, -1 if not found
     * @since 3.6 updated to behave more like <code>String</code>
     */
    static int lastIndexOf(final CharSequence cs, final int searchChar, int start) {try{__CLR4_5_23di3dilvha78mx.R.inc(4416);
        __CLR4_5_23di3dilvha78mx.R.inc(4417);if ((((cs instanceof String)&&(__CLR4_5_23di3dilvha78mx.R.iget(4418)!=0|true))||(__CLR4_5_23di3dilvha78mx.R.iget(4419)==0&false))) {{
            __CLR4_5_23di3dilvha78mx.R.inc(4420);return ((String) cs).lastIndexOf(searchChar, start);
        }
        }__CLR4_5_23di3dilvha78mx.R.inc(4421);final int sz = cs.length();
        __CLR4_5_23di3dilvha78mx.R.inc(4422);if ((((start < 0)&&(__CLR4_5_23di3dilvha78mx.R.iget(4423)!=0|true))||(__CLR4_5_23di3dilvha78mx.R.iget(4424)==0&false))) {{
            __CLR4_5_23di3dilvha78mx.R.inc(4425);return NOT_FOUND;
        }
        }__CLR4_5_23di3dilvha78mx.R.inc(4426);if ((((start >= sz)&&(__CLR4_5_23di3dilvha78mx.R.iget(4427)!=0|true))||(__CLR4_5_23di3dilvha78mx.R.iget(4428)==0&false))) {{
            __CLR4_5_23di3dilvha78mx.R.inc(4429);start = sz - 1;
        }
        }__CLR4_5_23di3dilvha78mx.R.inc(4430);if ((((searchChar < Character.MIN_SUPPLEMENTARY_CODE_POINT)&&(__CLR4_5_23di3dilvha78mx.R.iget(4431)!=0|true))||(__CLR4_5_23di3dilvha78mx.R.iget(4432)==0&false))) {{
            __CLR4_5_23di3dilvha78mx.R.inc(4433);for (int i = start; (((i >= 0)&&(__CLR4_5_23di3dilvha78mx.R.iget(4434)!=0|true))||(__CLR4_5_23di3dilvha78mx.R.iget(4435)==0&false)); --i) {{
                __CLR4_5_23di3dilvha78mx.R.inc(4436);if ((((cs.charAt(i) == searchChar)&&(__CLR4_5_23di3dilvha78mx.R.iget(4437)!=0|true))||(__CLR4_5_23di3dilvha78mx.R.iget(4438)==0&false))) {{
                    __CLR4_5_23di3dilvha78mx.R.inc(4439);return i;
                }
            }}
        }}
        //supplementary characters (LANG1300)
        //NOTE - we must do a forward traversal for this to avoid duplicating code points
        }__CLR4_5_23di3dilvha78mx.R.inc(4440);if ((((searchChar <= Character.MAX_CODE_POINT)&&(__CLR4_5_23di3dilvha78mx.R.iget(4441)!=0|true))||(__CLR4_5_23di3dilvha78mx.R.iget(4442)==0&false))) {{
            __CLR4_5_23di3dilvha78mx.R.inc(4443);char[] chars = Character.toChars(searchChar);
            //make sure it's not the last index
            __CLR4_5_23di3dilvha78mx.R.inc(4444);if ((((start == sz - 1)&&(__CLR4_5_23di3dilvha78mx.R.iget(4445)!=0|true))||(__CLR4_5_23di3dilvha78mx.R.iget(4446)==0&false))) {{
                __CLR4_5_23di3dilvha78mx.R.inc(4447);return NOT_FOUND;
            }
            }__CLR4_5_23di3dilvha78mx.R.inc(4448);for (int i = start; (((i >= 0)&&(__CLR4_5_23di3dilvha78mx.R.iget(4449)!=0|true))||(__CLR4_5_23di3dilvha78mx.R.iget(4450)==0&false)); i--) {{
                __CLR4_5_23di3dilvha78mx.R.inc(4451);char high = cs.charAt(i);
                __CLR4_5_23di3dilvha78mx.R.inc(4452);char low = cs.charAt(i + 1);
                __CLR4_5_23di3dilvha78mx.R.inc(4453);if ((((chars[0] == high && chars[1] == low)&&(__CLR4_5_23di3dilvha78mx.R.iget(4454)!=0|true))||(__CLR4_5_23di3dilvha78mx.R.iget(4455)==0&false))) {{
                    __CLR4_5_23di3dilvha78mx.R.inc(4456);return i;
                }
            }}
        }}
        }__CLR4_5_23di3dilvha78mx.R.inc(4457);return NOT_FOUND;
    }finally{__CLR4_5_23di3dilvha78mx.R.flushNeeded();}}

    /**
     * Used by the lastIndexOf(CharSequence methods) as a green implementation of lastIndexOf
     *
     * @param cs the {@code CharSequence} to be processed
     * @param searchChar the {@code CharSequence} to be searched for
     * @param start the start index
     * @return the index where the search sequence was found
     */
    static int lastIndexOf(final CharSequence cs, final CharSequence searchChar, final int start) {try{__CLR4_5_23di3dilvha78mx.R.inc(4458);
        __CLR4_5_23di3dilvha78mx.R.inc(4459);return cs.toString().lastIndexOf(searchChar.toString(), start);
//        if (cs instanceof String && searchChar instanceof String) {
//            // TODO: Do we assume searchChar is usually relatively small;
//            //       If so then calling toString() on it is better than reverting to
//            //       the green implementation in the else block
//            return ((String) cs).lastIndexOf((String) searchChar, start);
//        } else {
//            // TODO: Implement rather than convert to String
//            return cs.toString().lastIndexOf(searchChar.toString(), start);
//        }
    }finally{__CLR4_5_23di3dilvha78mx.R.flushNeeded();}}

    /**
     * Green implementation of toCharArray.
     *
     * @param cs the {@code CharSequence} to be processed
     * @return the resulting char array
     */
    static char[] toCharArray(final CharSequence cs) {try{__CLR4_5_23di3dilvha78mx.R.inc(4460);
        __CLR4_5_23di3dilvha78mx.R.inc(4461);if ((((cs instanceof String)&&(__CLR4_5_23di3dilvha78mx.R.iget(4462)!=0|true))||(__CLR4_5_23di3dilvha78mx.R.iget(4463)==0&false))) {{
            __CLR4_5_23di3dilvha78mx.R.inc(4464);return ((String) cs).toCharArray();
        }
        }__CLR4_5_23di3dilvha78mx.R.inc(4465);final int sz = cs.length();
        __CLR4_5_23di3dilvha78mx.R.inc(4466);final char[] array = new char[cs.length()];
        __CLR4_5_23di3dilvha78mx.R.inc(4467);for (int i = 0; (((i < sz)&&(__CLR4_5_23di3dilvha78mx.R.iget(4468)!=0|true))||(__CLR4_5_23di3dilvha78mx.R.iget(4469)==0&false)); i++) {{
            __CLR4_5_23di3dilvha78mx.R.inc(4470);array[i] = cs.charAt(i);
        }
        }__CLR4_5_23di3dilvha78mx.R.inc(4471);return array;
    }finally{__CLR4_5_23di3dilvha78mx.R.flushNeeded();}}

    /**
     * Green implementation of regionMatches.
     *
     * @param cs the {@code CharSequence} to be processed
     * @param ignoreCase whether or not to be case insensitive
     * @param thisStart the index to start on the {@code cs} CharSequence
     * @param substring the {@code CharSequence} to be looked for
     * @param start the index to start on the {@code substring} CharSequence
     * @param length character length of the region
     * @return whether the region matched
     */
    static boolean regionMatches(final CharSequence cs, final boolean ignoreCase, final int thisStart,
            final CharSequence substring, final int start, final int length)    {try{__CLR4_5_23di3dilvha78mx.R.inc(4472);
        __CLR4_5_23di3dilvha78mx.R.inc(4473);if ((((cs instanceof String && substring instanceof String)&&(__CLR4_5_23di3dilvha78mx.R.iget(4474)!=0|true))||(__CLR4_5_23di3dilvha78mx.R.iget(4475)==0&false))) {{
            __CLR4_5_23di3dilvha78mx.R.inc(4476);return ((String) cs).regionMatches(ignoreCase, thisStart, (String) substring, start, length);
        }
        }__CLR4_5_23di3dilvha78mx.R.inc(4477);int index1 = thisStart;
        __CLR4_5_23di3dilvha78mx.R.inc(4478);int index2 = start;
        __CLR4_5_23di3dilvha78mx.R.inc(4479);int tmpLen = length;

        // Extract these first so we detect NPEs the same as the java.lang.String version
        __CLR4_5_23di3dilvha78mx.R.inc(4480);final int srcLen = cs.length() - thisStart;
        __CLR4_5_23di3dilvha78mx.R.inc(4481);final int otherLen = substring.length() - start;

        // Check for invalid parameters
        __CLR4_5_23di3dilvha78mx.R.inc(4482);if ((((thisStart < 0 || start < 0 || length < 0)&&(__CLR4_5_23di3dilvha78mx.R.iget(4483)!=0|true))||(__CLR4_5_23di3dilvha78mx.R.iget(4484)==0&false))) {{
            __CLR4_5_23di3dilvha78mx.R.inc(4485);return false;
        }

        // Check that the regions are long enough
        }__CLR4_5_23di3dilvha78mx.R.inc(4486);if ((((srcLen < length || otherLen < length)&&(__CLR4_5_23di3dilvha78mx.R.iget(4487)!=0|true))||(__CLR4_5_23di3dilvha78mx.R.iget(4488)==0&false))) {{
            __CLR4_5_23di3dilvha78mx.R.inc(4489);return false;
        }

        }__CLR4_5_23di3dilvha78mx.R.inc(4490);while ((((tmpLen-- > 0)&&(__CLR4_5_23di3dilvha78mx.R.iget(4491)!=0|true))||(__CLR4_5_23di3dilvha78mx.R.iget(4492)==0&false))) {{
            __CLR4_5_23di3dilvha78mx.R.inc(4493);final char c1 = cs.charAt(index1++);
            __CLR4_5_23di3dilvha78mx.R.inc(4494);final char c2 = substring.charAt(index2++);

            __CLR4_5_23di3dilvha78mx.R.inc(4495);if ((((c1 == c2)&&(__CLR4_5_23di3dilvha78mx.R.iget(4496)!=0|true))||(__CLR4_5_23di3dilvha78mx.R.iget(4497)==0&false))) {{
                __CLR4_5_23di3dilvha78mx.R.inc(4498);continue;
            }

            }__CLR4_5_23di3dilvha78mx.R.inc(4499);if ((((!ignoreCase)&&(__CLR4_5_23di3dilvha78mx.R.iget(4500)!=0|true))||(__CLR4_5_23di3dilvha78mx.R.iget(4501)==0&false))) {{
                __CLR4_5_23di3dilvha78mx.R.inc(4502);return false;
            }

            // The same check as in String.regionMatches():
            }__CLR4_5_23di3dilvha78mx.R.inc(4503);if ((((Character.toUpperCase(c1) != Character.toUpperCase(c2)
                    && Character.toLowerCase(c1) != Character.toLowerCase(c2))&&(__CLR4_5_23di3dilvha78mx.R.iget(4504)!=0|true))||(__CLR4_5_23di3dilvha78mx.R.iget(4505)==0&false))) {{
                __CLR4_5_23di3dilvha78mx.R.inc(4506);return false;
            }
        }}

        }__CLR4_5_23di3dilvha78mx.R.inc(4507);return true;
    }finally{__CLR4_5_23di3dilvha78mx.R.flushNeeded();}}
}
