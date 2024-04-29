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
 * <p>Operations on {@code CharSet} instances.</p>
 *
 * <p>This class handles {@code null} input gracefully.
 * An exception will not be thrown for a {@code null} input.
 * Each method documents its behaviour in more detail.</p>
 * 
 * <p>#ThreadSafe#</p>
 * @see CharSet
 * @since 1.0
 */
public class CharSetUtils {public static class __CLR4_5_23je3jelvha78o8{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172755542L,8589935092L,4686,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * <p>CharSetUtils instances should NOT be constructed in standard programming.
     * Instead, the class should be used as {@code CharSetUtils.evaluateSet(null);}.</p>
     *
     * <p>This constructor is public to permit tools that require a JavaBean instance
     * to operate.</p>
     */
    public CharSetUtils() {
      super();__CLR4_5_23je3jelvha78o8.R.inc(4587);try{__CLR4_5_23je3jelvha78o8.R.inc(4586);
    }finally{__CLR4_5_23je3jelvha78o8.R.flushNeeded();}}

    // Squeeze
    //-----------------------------------------------------------------------
    /**
     * <p>Squeezes any repetitions of a character that is mentioned in the
     * supplied set.</p>
     *
     * <pre>
     * CharSetUtils.squeeze(null, *)        = null
     * CharSetUtils.squeeze("", *)          = ""
     * CharSetUtils.squeeze(*, null)        = *
     * CharSetUtils.squeeze(*, "")          = *
     * CharSetUtils.squeeze("hello", "k-p") = "helo"
     * CharSetUtils.squeeze("hello", "a-e") = "hello"
     * </pre>
     *
     * @see CharSet#getInstance(java.lang.String...) for set-syntax.
     * @param str  the string to squeeze, may be null
     * @param set  the character set to use for manipulation, may be null
     * @return the modified String, {@code null} if null string input
     */
    public static String squeeze(final String str, final String... set) {try{__CLR4_5_23je3jelvha78o8.R.inc(4588);
        __CLR4_5_23je3jelvha78o8.R.inc(4589);if ((((StringUtils.isEmpty(str) || deepEmpty(set))&&(__CLR4_5_23je3jelvha78o8.R.iget(4590)!=0|true))||(__CLR4_5_23je3jelvha78o8.R.iget(4591)==0&false))) {{
            __CLR4_5_23je3jelvha78o8.R.inc(4592);return str;
        }
        }__CLR4_5_23je3jelvha78o8.R.inc(4593);final CharSet chars = CharSet.getInstance(set);
        __CLR4_5_23je3jelvha78o8.R.inc(4594);final StringBuilder buffer = new StringBuilder(str.length());
        __CLR4_5_23je3jelvha78o8.R.inc(4595);final char[] chrs = str.toCharArray();
        __CLR4_5_23je3jelvha78o8.R.inc(4596);final int sz = chrs.length;
        __CLR4_5_23je3jelvha78o8.R.inc(4597);char lastChar = chrs[0];
        __CLR4_5_23je3jelvha78o8.R.inc(4598);char ch = ' ';
        __CLR4_5_23je3jelvha78o8.R.inc(4599);Character inChars = null;
        __CLR4_5_23je3jelvha78o8.R.inc(4600);Character notInChars = null;
        __CLR4_5_23je3jelvha78o8.R.inc(4601);buffer.append(lastChar);
        __CLR4_5_23je3jelvha78o8.R.inc(4602);for (int i = 1; (((i < sz)&&(__CLR4_5_23je3jelvha78o8.R.iget(4603)!=0|true))||(__CLR4_5_23je3jelvha78o8.R.iget(4604)==0&false)); i++) {{
            __CLR4_5_23je3jelvha78o8.R.inc(4605);ch = chrs[i];
            __CLR4_5_23je3jelvha78o8.R.inc(4606);if ((((ch == lastChar)&&(__CLR4_5_23je3jelvha78o8.R.iget(4607)!=0|true))||(__CLR4_5_23je3jelvha78o8.R.iget(4608)==0&false))) {{
                __CLR4_5_23je3jelvha78o8.R.inc(4609);if ((((inChars != null && ch == inChars)&&(__CLR4_5_23je3jelvha78o8.R.iget(4610)!=0|true))||(__CLR4_5_23je3jelvha78o8.R.iget(4611)==0&false))) {{
                    __CLR4_5_23je3jelvha78o8.R.inc(4612);continue;
                } }else {{
                    __CLR4_5_23je3jelvha78o8.R.inc(4613);if ((((notInChars == null || ch != notInChars)&&(__CLR4_5_23je3jelvha78o8.R.iget(4614)!=0|true))||(__CLR4_5_23je3jelvha78o8.R.iget(4615)==0&false))) {{
                        __CLR4_5_23je3jelvha78o8.R.inc(4616);if ((((chars.contains(ch))&&(__CLR4_5_23je3jelvha78o8.R.iget(4617)!=0|true))||(__CLR4_5_23je3jelvha78o8.R.iget(4618)==0&false))) {{
                            __CLR4_5_23je3jelvha78o8.R.inc(4619);inChars = ch;
                            __CLR4_5_23je3jelvha78o8.R.inc(4620);continue;
                        } }else {{
                            __CLR4_5_23je3jelvha78o8.R.inc(4621);notInChars = ch;
                        }
                    }}
                }}
            }}
            }__CLR4_5_23je3jelvha78o8.R.inc(4622);buffer.append(ch);
            __CLR4_5_23je3jelvha78o8.R.inc(4623);lastChar = ch;
        }
        }__CLR4_5_23je3jelvha78o8.R.inc(4624);return buffer.toString();
    }finally{__CLR4_5_23je3jelvha78o8.R.flushNeeded();}}

    // ContainsAny
    //-----------------------------------------------------------------------
    /**
     * <p>Takes an argument in set-syntax, see evaluateSet,
     * and identifies whether any of the characters are present in the specified string.</p>
     *
     * <pre>
     * CharSetUtils.containsAny(null, *)        = false
     * CharSetUtils.containsAny("", *)          = false
     * CharSetUtils.containsAny(*, null)        = false
     * CharSetUtils.containsAny(*, "")          = false
     * CharSetUtils.containsAny("hello", "k-p") = true
     * CharSetUtils.containsAny("hello", "a-d") = false
     * </pre>
     *
     * @see CharSet#getInstance(java.lang.String...) for set-syntax.
     * @param str  String to look for characters in, may be null
     * @param set  String[] set of characters to identify, may be null
     * @return whether or not the characters in the set are in the primary string
     * @since 3.2
     */
    public static boolean containsAny(final String str, final String... set) {try{__CLR4_5_23je3jelvha78o8.R.inc(4625);
        __CLR4_5_23je3jelvha78o8.R.inc(4626);if ((((StringUtils.isEmpty(str) || deepEmpty(set))&&(__CLR4_5_23je3jelvha78o8.R.iget(4627)!=0|true))||(__CLR4_5_23je3jelvha78o8.R.iget(4628)==0&false))) {{
            __CLR4_5_23je3jelvha78o8.R.inc(4629);return false;
        }
        }__CLR4_5_23je3jelvha78o8.R.inc(4630);final CharSet chars = CharSet.getInstance(set);
        __CLR4_5_23je3jelvha78o8.R.inc(4631);for (final char c : str.toCharArray()) {{
            __CLR4_5_23je3jelvha78o8.R.inc(4632);if ((((chars.contains(c))&&(__CLR4_5_23je3jelvha78o8.R.iget(4633)!=0|true))||(__CLR4_5_23je3jelvha78o8.R.iget(4634)==0&false))) {{
                __CLR4_5_23je3jelvha78o8.R.inc(4635);return true;
            }
        }}
        }__CLR4_5_23je3jelvha78o8.R.inc(4636);return false;
    }finally{__CLR4_5_23je3jelvha78o8.R.flushNeeded();}}

    // Count
    //-----------------------------------------------------------------------
    /**
     * <p>Takes an argument in set-syntax, see evaluateSet,
     * and returns the number of characters present in the specified string.</p>
     *
     * <pre>
     * CharSetUtils.count(null, *)        = 0
     * CharSetUtils.count("", *)          = 0
     * CharSetUtils.count(*, null)        = 0
     * CharSetUtils.count(*, "")          = 0
     * CharSetUtils.count("hello", "k-p") = 3
     * CharSetUtils.count("hello", "a-e") = 1
     * </pre>
     *
     * @see CharSet#getInstance(java.lang.String...) for set-syntax.
     * @param str  String to count characters in, may be null
     * @param set  String[] set of characters to count, may be null
     * @return the character count, zero if null string input
     */
    public static int count(final String str, final String... set) {try{__CLR4_5_23je3jelvha78o8.R.inc(4637);
        __CLR4_5_23je3jelvha78o8.R.inc(4638);if ((((StringUtils.isEmpty(str) || deepEmpty(set))&&(__CLR4_5_23je3jelvha78o8.R.iget(4639)!=0|true))||(__CLR4_5_23je3jelvha78o8.R.iget(4640)==0&false))) {{
            __CLR4_5_23je3jelvha78o8.R.inc(4641);return 0;
        }
        }__CLR4_5_23je3jelvha78o8.R.inc(4642);final CharSet chars = CharSet.getInstance(set);
        __CLR4_5_23je3jelvha78o8.R.inc(4643);int count = 0;
        __CLR4_5_23je3jelvha78o8.R.inc(4644);for (final char c : str.toCharArray()) {{
            __CLR4_5_23je3jelvha78o8.R.inc(4645);if ((((chars.contains(c))&&(__CLR4_5_23je3jelvha78o8.R.iget(4646)!=0|true))||(__CLR4_5_23je3jelvha78o8.R.iget(4647)==0&false))) {{
                __CLR4_5_23je3jelvha78o8.R.inc(4648);count++;
            }
        }}
        }__CLR4_5_23je3jelvha78o8.R.inc(4649);return count;
    }finally{__CLR4_5_23je3jelvha78o8.R.flushNeeded();}}

    // Keep
    //-----------------------------------------------------------------------
    /**
     * <p>Takes an argument in set-syntax, see evaluateSet,
     * and keeps any of characters present in the specified string.</p>
     *
     * <pre>
     * CharSetUtils.keep(null, *)        = null
     * CharSetUtils.keep("", *)          = ""
     * CharSetUtils.keep(*, null)        = ""
     * CharSetUtils.keep(*, "")          = ""
     * CharSetUtils.keep("hello", "hl")  = "hll"
     * CharSetUtils.keep("hello", "le")  = "ell"
     * </pre>
     *
     * @see CharSet#getInstance(java.lang.String...) for set-syntax.
     * @param str  String to keep characters from, may be null
     * @param set  String[] set of characters to keep, may be null
     * @return the modified String, {@code null} if null string input
     * @since 2.0
     */
    public static String keep(final String str, final String... set) {try{__CLR4_5_23je3jelvha78o8.R.inc(4650);
        __CLR4_5_23je3jelvha78o8.R.inc(4651);if ((((str == null)&&(__CLR4_5_23je3jelvha78o8.R.iget(4652)!=0|true))||(__CLR4_5_23je3jelvha78o8.R.iget(4653)==0&false))) {{
            __CLR4_5_23je3jelvha78o8.R.inc(4654);return null;
        }
        }__CLR4_5_23je3jelvha78o8.R.inc(4655);if ((((str.isEmpty() || deepEmpty(set))&&(__CLR4_5_23je3jelvha78o8.R.iget(4656)!=0|true))||(__CLR4_5_23je3jelvha78o8.R.iget(4657)==0&false))) {{
            __CLR4_5_23je3jelvha78o8.R.inc(4658);return StringUtils.EMPTY;
        }
        }__CLR4_5_23je3jelvha78o8.R.inc(4659);return modify(str, set, true);
    }finally{__CLR4_5_23je3jelvha78o8.R.flushNeeded();}}

    // Delete
    //-----------------------------------------------------------------------
    /**
     * <p>Takes an argument in set-syntax, see evaluateSet,
     * and deletes any of characters present in the specified string.</p>
     *
     * <pre>
     * CharSetUtils.delete(null, *)        = null
     * CharSetUtils.delete("", *)          = ""
     * CharSetUtils.delete(*, null)        = *
     * CharSetUtils.delete(*, "")          = *
     * CharSetUtils.delete("hello", "hl")  = "eo"
     * CharSetUtils.delete("hello", "le")  = "ho"
     * </pre>
     *
     * @see CharSet#getInstance(java.lang.String...) for set-syntax.
     * @param str  String to delete characters from, may be null
     * @param set  String[] set of characters to delete, may be null
     * @return the modified String, {@code null} if null string input
     */
    public static String delete(final String str, final String... set) {try{__CLR4_5_23je3jelvha78o8.R.inc(4660);
        __CLR4_5_23je3jelvha78o8.R.inc(4661);if ((((StringUtils.isEmpty(str) || deepEmpty(set))&&(__CLR4_5_23je3jelvha78o8.R.iget(4662)!=0|true))||(__CLR4_5_23je3jelvha78o8.R.iget(4663)==0&false))) {{
            __CLR4_5_23je3jelvha78o8.R.inc(4664);return str;
        }
        }__CLR4_5_23je3jelvha78o8.R.inc(4665);return modify(str, set, false);
    }finally{__CLR4_5_23je3jelvha78o8.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Implementation of delete and keep
     *
     * @param str String to modify characters within
     * @param set String[] set of characters to modify
     * @param expect whether to evaluate on match, or non-match
     * @return the modified String, not null
     */
    private static String modify(final String str, final String[] set, final boolean expect) {try{__CLR4_5_23je3jelvha78o8.R.inc(4666);
        __CLR4_5_23je3jelvha78o8.R.inc(4667);final CharSet chars = CharSet.getInstance(set);
        __CLR4_5_23je3jelvha78o8.R.inc(4668);final StringBuilder buffer = new StringBuilder(str.length());
        __CLR4_5_23je3jelvha78o8.R.inc(4669);final char[] chrs = str.toCharArray();
        __CLR4_5_23je3jelvha78o8.R.inc(4670);for (char chr : chrs) {{
            __CLR4_5_23je3jelvha78o8.R.inc(4671);if ((((chars.contains(chr) == expect)&&(__CLR4_5_23je3jelvha78o8.R.iget(4672)!=0|true))||(__CLR4_5_23je3jelvha78o8.R.iget(4673)==0&false))) {{
                __CLR4_5_23je3jelvha78o8.R.inc(4674);buffer.append(chr);
            }
        }}
        }__CLR4_5_23je3jelvha78o8.R.inc(4675);return buffer.toString();
    }finally{__CLR4_5_23je3jelvha78o8.R.flushNeeded();}}

    /** 
     * Determines whether or not all the Strings in an array are 
     * empty or not.
     *
     * @param strings String[] whose elements are being checked for emptiness
     * @return whether or not the String is empty
     */
    private static boolean deepEmpty(final String[] strings) {try{__CLR4_5_23je3jelvha78o8.R.inc(4676);
        __CLR4_5_23je3jelvha78o8.R.inc(4677);if ((((strings != null)&&(__CLR4_5_23je3jelvha78o8.R.iget(4678)!=0|true))||(__CLR4_5_23je3jelvha78o8.R.iget(4679)==0&false))) {{
            __CLR4_5_23je3jelvha78o8.R.inc(4680);for (final String s : strings) {{
                __CLR4_5_23je3jelvha78o8.R.inc(4681);if ((((StringUtils.isNotEmpty(s))&&(__CLR4_5_23je3jelvha78o8.R.iget(4682)!=0|true))||(__CLR4_5_23je3jelvha78o8.R.iget(4683)==0&false))) {{
                    __CLR4_5_23je3jelvha78o8.R.inc(4684);return false;
                }
            }}
        }}
        }__CLR4_5_23je3jelvha78o8.R.inc(4685);return true;
    }finally{__CLR4_5_23je3jelvha78o8.R.flushNeeded();}}
}
