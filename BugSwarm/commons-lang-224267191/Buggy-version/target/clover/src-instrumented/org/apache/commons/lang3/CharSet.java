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

import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * <p>A set of characters.</p>
 *
 * <p>Instances are immutable, but instances of subclasses may not be.</p>
 *
 * <p>#ThreadSafe#</p>
 * @since 1.0
 */
public class CharSet implements Serializable {public static class __CLR4_5_23h83h8lvha78nk{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172755542L,8589935092L,4586,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Required for serialization support. Lang version 2.0. 
     * 
     * @see java.io.Serializable
     */
    private static final long serialVersionUID = 5947847346149275958L;

    /** 
     * A CharSet defining no characters. 
     * @since 2.0
     */
    public static final CharSet EMPTY = new CharSet((String) null);

    /** 
     * A CharSet defining ASCII alphabetic characters "a-zA-Z".
     * @since 2.0
     */
    public static final CharSet ASCII_ALPHA = new CharSet("a-zA-Z");

    /** 
     * A CharSet defining ASCII alphabetic characters "a-z".
     * @since 2.0
     */
    public static final CharSet ASCII_ALPHA_LOWER = new CharSet("a-z");

    /** 
     * A CharSet defining ASCII alphabetic characters "A-Z".
     * @since 2.0
     */
    public static final CharSet ASCII_ALPHA_UPPER = new CharSet("A-Z");

    /** 
     * A CharSet defining ASCII alphabetic characters "0-9".
     * @since 2.0
     */
    public static final CharSet ASCII_NUMERIC = new CharSet("0-9");

    /**
     * A Map of the common cases used in the factory.
     * Subclasses can add more common patterns if desired
     * @since 2.0
     */
    protected static final Map<String, CharSet> COMMON = Collections.synchronizedMap(new HashMap<String, CharSet>());
    
    static {try{__CLR4_5_23h83h8lvha78nk.R.inc(4508);
        __CLR4_5_23h83h8lvha78nk.R.inc(4509);COMMON.put(null, EMPTY);
        __CLR4_5_23h83h8lvha78nk.R.inc(4510);COMMON.put(StringUtils.EMPTY, EMPTY);
        __CLR4_5_23h83h8lvha78nk.R.inc(4511);COMMON.put("a-zA-Z", ASCII_ALPHA);
        __CLR4_5_23h83h8lvha78nk.R.inc(4512);COMMON.put("A-Za-z", ASCII_ALPHA);
        __CLR4_5_23h83h8lvha78nk.R.inc(4513);COMMON.put("a-z", ASCII_ALPHA_LOWER);
        __CLR4_5_23h83h8lvha78nk.R.inc(4514);COMMON.put("A-Z", ASCII_ALPHA_UPPER);
        __CLR4_5_23h83h8lvha78nk.R.inc(4515);COMMON.put("0-9", ASCII_NUMERIC);
    }finally{__CLR4_5_23h83h8lvha78nk.R.flushNeeded();}}

    /** The set of CharRange objects. */
    private final Set<CharRange> set = Collections.synchronizedSet(new HashSet<CharRange>());

    //-----------------------------------------------------------------------
    /**
     * <p>Factory method to create a new CharSet using a special syntax.</p>
     *
     * <ul>
     *  <li>{@code null} or empty string ("")
     * - set containing no characters</li>
     *  <li>Single character, such as "a"
     *  - set containing just that character</li>
     *  <li>Multi character, such as "a-e"
     *  - set containing characters from one character to the other</li>
     *  <li>Negated, such as "^a" or "^a-e"
     *  - set containing all characters except those defined</li>
     *  <li>Combinations, such as "abe-g"
     *  - set containing all the characters from the individual sets</li>
     * </ul>
     *
     * <p>The matching order is:</p>
     * <ol>
     *  <li>Negated multi character range, such as "^a-e"
     *  <li>Ordinary multi character range, such as "a-e"
     *  <li>Negated single character, such as "^a"
     *  <li>Ordinary single character, such as "a"
     * </ol>
     * 
     * <p>Matching works left to right. Once a match is found the
     * search starts again from the next character.</p>
     *
     * <p>If the same range is defined twice using the same syntax, only
     * one range will be kept.
     * Thus, "a-ca-c" creates only one range of "a-c".</p>
     *
     * <p>If the start and end of a range are in the wrong order,
     * they are reversed. Thus "a-e" is the same as "e-a".
     * As a result, "a-ee-a" would create only one range,
     * as the "a-e" and "e-a" are the same.</p>
     *
     * <p>The set of characters represented is the union of the specified ranges.</p>
     * 
     * <p>There are two ways to add a literal negation character ({@code ^}):</p>
     * <ul>
     *     <li>As the last character in a string, e.g. {@code CharSet.getInstance("a-z^")}</li>
     *     <li>As a separate element, e.g. {@code CharSet.getInstance("^","a-z")}</li>
     * </ul>
     *
     * <p>Examples using the negation character:</p>
     * <pre>
     *     CharSet.getInstance("^a-c").contains('a') = false
     *     CharSet.getInstance("^a-c").contains('d') = true
     *     CharSet.getInstance("^^a-c").contains('a') = true // (only '^' is negated)
     *     CharSet.getInstance("^^a-c").contains('^') = false
     *     CharSet.getInstance("^a-cd-f").contains('d') = true 
     *     CharSet.getInstance("a-c^").contains('^') = true
     *     CharSet.getInstance("^", "a-c").contains('^') = true
     * </pre>
     * 
     * <p>All CharSet objects returned by this method will be immutable.</p>
     *
     * @param setStrs  Strings to merge into the set, may be null
     * @return a CharSet instance
     * @since 2.4
     */
    public static CharSet getInstance(final String... setStrs) {try{__CLR4_5_23h83h8lvha78nk.R.inc(4516);
        __CLR4_5_23h83h8lvha78nk.R.inc(4517);if ((((setStrs == null)&&(__CLR4_5_23h83h8lvha78nk.R.iget(4518)!=0|true))||(__CLR4_5_23h83h8lvha78nk.R.iget(4519)==0&false))) {{
            __CLR4_5_23h83h8lvha78nk.R.inc(4520);return null;
        }
        }__CLR4_5_23h83h8lvha78nk.R.inc(4521);if ((((setStrs.length == 1)&&(__CLR4_5_23h83h8lvha78nk.R.iget(4522)!=0|true))||(__CLR4_5_23h83h8lvha78nk.R.iget(4523)==0&false))) {{
            __CLR4_5_23h83h8lvha78nk.R.inc(4524);final CharSet common = COMMON.get(setStrs[0]);
            __CLR4_5_23h83h8lvha78nk.R.inc(4525);if ((((common != null)&&(__CLR4_5_23h83h8lvha78nk.R.iget(4526)!=0|true))||(__CLR4_5_23h83h8lvha78nk.R.iget(4527)==0&false))) {{
                __CLR4_5_23h83h8lvha78nk.R.inc(4528);return common;
            }
        }}
        }__CLR4_5_23h83h8lvha78nk.R.inc(4529);return new CharSet(setStrs); 
    }finally{__CLR4_5_23h83h8lvha78nk.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * <p>Constructs a new CharSet using the set syntax.
     * Each string is merged in with the set.</p>
     *
     * @param set  Strings to merge into the initial set
     * @throws NullPointerException if set is {@code null}
     */
    protected CharSet(final String... set) {
        super();__CLR4_5_23h83h8lvha78nk.R.inc(4531);try{__CLR4_5_23h83h8lvha78nk.R.inc(4530);
        __CLR4_5_23h83h8lvha78nk.R.inc(4532);for (String s : set) {{
            __CLR4_5_23h83h8lvha78nk.R.inc(4533);add(s);
        }
    }}finally{__CLR4_5_23h83h8lvha78nk.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * <p>Add a set definition string to the {@code CharSet}.</p>
     *
     * @param str  set definition string
     */
    protected void add(final String str) {try{__CLR4_5_23h83h8lvha78nk.R.inc(4534);
        __CLR4_5_23h83h8lvha78nk.R.inc(4535);if ((((str == null)&&(__CLR4_5_23h83h8lvha78nk.R.iget(4536)!=0|true))||(__CLR4_5_23h83h8lvha78nk.R.iget(4537)==0&false))) {{
            __CLR4_5_23h83h8lvha78nk.R.inc(4538);return;
        }

        }__CLR4_5_23h83h8lvha78nk.R.inc(4539);final int len = str.length();
        __CLR4_5_23h83h8lvha78nk.R.inc(4540);int pos = 0;
        __CLR4_5_23h83h8lvha78nk.R.inc(4541);while ((((pos < len)&&(__CLR4_5_23h83h8lvha78nk.R.iget(4542)!=0|true))||(__CLR4_5_23h83h8lvha78nk.R.iget(4543)==0&false))) {{
            __CLR4_5_23h83h8lvha78nk.R.inc(4544);final int remainder = len - pos;
            __CLR4_5_23h83h8lvha78nk.R.inc(4545);if ((((remainder >= 4 && str.charAt(pos) == '^' && str.charAt(pos + 2) == '-')&&(__CLR4_5_23h83h8lvha78nk.R.iget(4546)!=0|true))||(__CLR4_5_23h83h8lvha78nk.R.iget(4547)==0&false))) {{
                // negated range
                __CLR4_5_23h83h8lvha78nk.R.inc(4548);set.add(CharRange.isNotIn(str.charAt(pos + 1), str.charAt(pos + 3)));
                __CLR4_5_23h83h8lvha78nk.R.inc(4549);pos += 4;
            } }else {__CLR4_5_23h83h8lvha78nk.R.inc(4550);if ((((remainder >= 3 && str.charAt(pos + 1) == '-')&&(__CLR4_5_23h83h8lvha78nk.R.iget(4551)!=0|true))||(__CLR4_5_23h83h8lvha78nk.R.iget(4552)==0&false))) {{
                // range
                __CLR4_5_23h83h8lvha78nk.R.inc(4553);set.add(CharRange.isIn(str.charAt(pos), str.charAt(pos + 2)));
                __CLR4_5_23h83h8lvha78nk.R.inc(4554);pos += 3;
            } }else {__CLR4_5_23h83h8lvha78nk.R.inc(4555);if ((((remainder >= 2 && str.charAt(pos) == '^')&&(__CLR4_5_23h83h8lvha78nk.R.iget(4556)!=0|true))||(__CLR4_5_23h83h8lvha78nk.R.iget(4557)==0&false))) {{
                // negated char
                __CLR4_5_23h83h8lvha78nk.R.inc(4558);set.add(CharRange.isNot(str.charAt(pos + 1)));
                __CLR4_5_23h83h8lvha78nk.R.inc(4559);pos += 2;
            } }else {{
                // char
                __CLR4_5_23h83h8lvha78nk.R.inc(4560);set.add(CharRange.is(str.charAt(pos)));
                __CLR4_5_23h83h8lvha78nk.R.inc(4561);pos += 1;
            }
        }}}}
    }}finally{__CLR4_5_23h83h8lvha78nk.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * <p>Gets the internal set as an array of CharRange objects.</p>
     *
     * @return an array of immutable CharRange objects
     * @since 2.0
     */
// NOTE: This is no longer public as CharRange is no longer a public class. 
//       It may be replaced when CharSet moves to Range.
    /*public*/ CharRange[] getCharRanges() {try{__CLR4_5_23h83h8lvha78nk.R.inc(4562);
        __CLR4_5_23h83h8lvha78nk.R.inc(4563);return set.toArray(new CharRange[set.size()]);
    }finally{__CLR4_5_23h83h8lvha78nk.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * <p>Does the {@code CharSet} contain the specified
     * character {@code ch}.</p>
     *
     * @param ch  the character to check for
     * @return {@code true} if the set contains the characters
     */
    public boolean contains(final char ch) {try{__CLR4_5_23h83h8lvha78nk.R.inc(4564);
        __CLR4_5_23h83h8lvha78nk.R.inc(4565);for (final CharRange range : set) {{
            __CLR4_5_23h83h8lvha78nk.R.inc(4566);if ((((range.contains(ch))&&(__CLR4_5_23h83h8lvha78nk.R.iget(4567)!=0|true))||(__CLR4_5_23h83h8lvha78nk.R.iget(4568)==0&false))) {{
                __CLR4_5_23h83h8lvha78nk.R.inc(4569);return true;
            }
        }}
        }__CLR4_5_23h83h8lvha78nk.R.inc(4570);return false;
    }finally{__CLR4_5_23h83h8lvha78nk.R.flushNeeded();}}

    // Basics
    //-----------------------------------------------------------------------
    /**
     * <p>Compares two {@code CharSet} objects, returning true if they represent
     * exactly the same set of characters defined in the same way.</p>
     *
     * <p>The two sets {@code abc} and {@code a-c} are <i>not</i>
     * equal according to this method.</p>
     *
     * @param obj  the object to compare to
     * @return true if equal
     * @since 2.0
     */
    @Override
    public boolean equals(final Object obj) {try{__CLR4_5_23h83h8lvha78nk.R.inc(4571);
        __CLR4_5_23h83h8lvha78nk.R.inc(4572);if ((((obj == this)&&(__CLR4_5_23h83h8lvha78nk.R.iget(4573)!=0|true))||(__CLR4_5_23h83h8lvha78nk.R.iget(4574)==0&false))) {{
            __CLR4_5_23h83h8lvha78nk.R.inc(4575);return true;
        }
        }__CLR4_5_23h83h8lvha78nk.R.inc(4576);if ((((obj instanceof CharSet == false)&&(__CLR4_5_23h83h8lvha78nk.R.iget(4577)!=0|true))||(__CLR4_5_23h83h8lvha78nk.R.iget(4578)==0&false))) {{
            __CLR4_5_23h83h8lvha78nk.R.inc(4579);return false;
        }
        }__CLR4_5_23h83h8lvha78nk.R.inc(4580);final CharSet other = (CharSet) obj;
        __CLR4_5_23h83h8lvha78nk.R.inc(4581);return set.equals(other.set);
    }finally{__CLR4_5_23h83h8lvha78nk.R.flushNeeded();}}

    /**
     * <p>Gets a hash code compatible with the equals method.</p>
     *
     * @return a suitable hash code
     * @since 2.0
     */
    @Override
    public int hashCode() {try{__CLR4_5_23h83h8lvha78nk.R.inc(4582);
        __CLR4_5_23h83h8lvha78nk.R.inc(4583);return 89 + set.hashCode();
    }finally{__CLR4_5_23h83h8lvha78nk.R.flushNeeded();}}

    /**
     * <p>Gets a string representation of the set.</p>
     *
     * @return string representation of the set
     */
    @Override
    public String toString() {try{__CLR4_5_23h83h8lvha78nk.R.inc(4584);
        __CLR4_5_23h83h8lvha78nk.R.inc(4585);return set.toString();
    }finally{__CLR4_5_23h83h8lvha78nk.R.flushNeeded();}}

}
