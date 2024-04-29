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
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * <p>A contiguous range of characters, optionally negated.</p>
 * 
 * <p>Instances are immutable.</p>
 *
 * <p>#ThreadSafe#</p>
 * @since 1.0
 */
// TODO: This is no longer public and will be removed later as CharSet is moved 
// to depend on Range.
final class CharRange implements Iterable<Character>, Serializable {public static class __CLR4_5_23a03a0lvha78mg{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172755542L,8589935092L,4374,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Required for serialization support. Lang version 2.0. 
     * 
     * @see java.io.Serializable
     */
    private static final long serialVersionUID = 8270183163158333422L;
    
    /** The first character, inclusive, in the range. */
    private final char start;
    /** The last character, inclusive, in the range. */
    private final char end;
    /** True if the range is everything except the characters specified. */
    private final boolean negated;
    
    /** Cached toString. */
    private transient String iToString;

    /**
     * <p>Constructs a {@code CharRange} over a set of characters,
     * optionally negating the range.</p>
     *
     * <p>A negated range includes everything except that defined by the
     * start and end characters.</p>
     * 
     * <p>If start and end are in the wrong order, they are reversed.
     * Thus {@code a-e} is the same as {@code e-a}.</p>
     *
     * @param start  first character, inclusive, in this range
     * @param end  last character, inclusive, in this range
     * @param negated  true to express everything except the range
     */
    private CharRange(char start, char end, final boolean negated) {
        super();__CLR4_5_23a03a0lvha78mg.R.inc(4249);try{__CLR4_5_23a03a0lvha78mg.R.inc(4248);
        __CLR4_5_23a03a0lvha78mg.R.inc(4250);if ((((start > end)&&(__CLR4_5_23a03a0lvha78mg.R.iget(4251)!=0|true))||(__CLR4_5_23a03a0lvha78mg.R.iget(4252)==0&false))) {{
            __CLR4_5_23a03a0lvha78mg.R.inc(4253);final char temp = start;
            __CLR4_5_23a03a0lvha78mg.R.inc(4254);start = end;
            __CLR4_5_23a03a0lvha78mg.R.inc(4255);end = temp;
        }
        
        }__CLR4_5_23a03a0lvha78mg.R.inc(4256);this.start = start;
        __CLR4_5_23a03a0lvha78mg.R.inc(4257);this.end = end;
        __CLR4_5_23a03a0lvha78mg.R.inc(4258);this.negated = negated;
    }finally{__CLR4_5_23a03a0lvha78mg.R.flushNeeded();}}

    /**
     * <p>Constructs a {@code CharRange} over a single character.</p>
     *
     * @param ch  only character in this range
     * @return the new CharRange object
     * @see CharRange#CharRange(char, char, boolean)
     * @since 2.5
     */
    public static CharRange is(final char ch) {try{__CLR4_5_23a03a0lvha78mg.R.inc(4259);
        __CLR4_5_23a03a0lvha78mg.R.inc(4260);return new CharRange(ch, ch, false);
    }finally{__CLR4_5_23a03a0lvha78mg.R.flushNeeded();}}

    /**
     * <p>Constructs a negated {@code CharRange} over a single character.</p>
     *
     * @param ch  only character in this range
     * @return the new CharRange object
     * @see CharRange#CharRange(char, char, boolean)
     * @since 2.5
     */
    public static CharRange isNot(final char ch) {try{__CLR4_5_23a03a0lvha78mg.R.inc(4261);
        __CLR4_5_23a03a0lvha78mg.R.inc(4262);return new CharRange(ch, ch, true);
    }finally{__CLR4_5_23a03a0lvha78mg.R.flushNeeded();}}

    /**
     * <p>Constructs a {@code CharRange} over a set of characters.</p>
     *
     * @param start  first character, inclusive, in this range
     * @param end  last character, inclusive, in this range
     * @return the new CharRange object
     * @see CharRange#CharRange(char, char, boolean)
     * @since 2.5
     */
    public static CharRange isIn(final char start, final char end) {try{__CLR4_5_23a03a0lvha78mg.R.inc(4263);
        __CLR4_5_23a03a0lvha78mg.R.inc(4264);return new CharRange(start, end, false);
    }finally{__CLR4_5_23a03a0lvha78mg.R.flushNeeded();}}

    /**
     * <p>Constructs a negated {@code CharRange} over a set of characters.</p>
     *
     * @param start  first character, inclusive, in this range
     * @param end  last character, inclusive, in this range
     * @return the new CharRange object
     * @see CharRange#CharRange(char, char, boolean)
     * @since 2.5
     */
    public static CharRange isNotIn(final char start, final char end) {try{__CLR4_5_23a03a0lvha78mg.R.inc(4265);
        __CLR4_5_23a03a0lvha78mg.R.inc(4266);return new CharRange(start, end, true);
    }finally{__CLR4_5_23a03a0lvha78mg.R.flushNeeded();}}

    // Accessors
    //-----------------------------------------------------------------------
    /**
     * <p>Gets the start character for this character range.</p>
     * 
     * @return the start char (inclusive)
     */
    public char getStart() {try{__CLR4_5_23a03a0lvha78mg.R.inc(4267);
        __CLR4_5_23a03a0lvha78mg.R.inc(4268);return this.start;
    }finally{__CLR4_5_23a03a0lvha78mg.R.flushNeeded();}}

    /**
     * <p>Gets the end character for this character range.</p>
     * 
     * @return the end char (inclusive)
     */
    public char getEnd() {try{__CLR4_5_23a03a0lvha78mg.R.inc(4269);
        __CLR4_5_23a03a0lvha78mg.R.inc(4270);return this.end;
    }finally{__CLR4_5_23a03a0lvha78mg.R.flushNeeded();}}

    /**
     * <p>Is this {@code CharRange} negated.</p>
     * 
     * <p>A negated range includes everything except that defined by the
     * start and end characters.</p>
     *
     * @return {@code true} if negated
     */
    public boolean isNegated() {try{__CLR4_5_23a03a0lvha78mg.R.inc(4271);
        __CLR4_5_23a03a0lvha78mg.R.inc(4272);return negated;
    }finally{__CLR4_5_23a03a0lvha78mg.R.flushNeeded();}}

    // Contains
    //-----------------------------------------------------------------------
    /**
     * <p>Is the character specified contained in this range.</p>
     *
     * @param ch  the character to check
     * @return {@code true} if this range contains the input character
     */
    public boolean contains(final char ch) {try{__CLR4_5_23a03a0lvha78mg.R.inc(4273);
        __CLR4_5_23a03a0lvha78mg.R.inc(4274);return (ch >= start && ch <= end) != negated;
    }finally{__CLR4_5_23a03a0lvha78mg.R.flushNeeded();}}

    /**
     * <p>Are all the characters of the passed in range contained in
     * this range.</p>
     *
     * @param range  the range to check against
     * @return {@code true} if this range entirely contains the input range
     * @throws IllegalArgumentException if {@code null} input
     */
    public boolean contains(final CharRange range) {try{__CLR4_5_23a03a0lvha78mg.R.inc(4275);
        __CLR4_5_23a03a0lvha78mg.R.inc(4276);Validate.isTrue(range != null, "The Range must not be null");
        __CLR4_5_23a03a0lvha78mg.R.inc(4277);if ((((negated)&&(__CLR4_5_23a03a0lvha78mg.R.iget(4278)!=0|true))||(__CLR4_5_23a03a0lvha78mg.R.iget(4279)==0&false))) {{
            __CLR4_5_23a03a0lvha78mg.R.inc(4280);if ((((range.negated)&&(__CLR4_5_23a03a0lvha78mg.R.iget(4281)!=0|true))||(__CLR4_5_23a03a0lvha78mg.R.iget(4282)==0&false))) {{
                __CLR4_5_23a03a0lvha78mg.R.inc(4283);return start >= range.start && end <= range.end;
            }
            }__CLR4_5_23a03a0lvha78mg.R.inc(4284);return range.end < start || range.start > end;
        }
        }__CLR4_5_23a03a0lvha78mg.R.inc(4285);if ((((range.negated)&&(__CLR4_5_23a03a0lvha78mg.R.iget(4286)!=0|true))||(__CLR4_5_23a03a0lvha78mg.R.iget(4287)==0&false))) {{
            __CLR4_5_23a03a0lvha78mg.R.inc(4288);return start == 0 && end == Character.MAX_VALUE;
        }
        }__CLR4_5_23a03a0lvha78mg.R.inc(4289);return start <= range.start && end >= range.end;
    }finally{__CLR4_5_23a03a0lvha78mg.R.flushNeeded();}}

    // Basics
    //-----------------------------------------------------------------------
    /**
     * <p>Compares two CharRange objects, returning true if they represent
     * exactly the same range of characters defined in the same way.</p>
     * 
     * @param obj  the object to compare to
     * @return true if equal
     */
    @Override
    public boolean equals(final Object obj) {try{__CLR4_5_23a03a0lvha78mg.R.inc(4290);
        __CLR4_5_23a03a0lvha78mg.R.inc(4291);if ((((obj == this)&&(__CLR4_5_23a03a0lvha78mg.R.iget(4292)!=0|true))||(__CLR4_5_23a03a0lvha78mg.R.iget(4293)==0&false))) {{
            __CLR4_5_23a03a0lvha78mg.R.inc(4294);return true;
        }
        }__CLR4_5_23a03a0lvha78mg.R.inc(4295);if ((((obj instanceof CharRange == false)&&(__CLR4_5_23a03a0lvha78mg.R.iget(4296)!=0|true))||(__CLR4_5_23a03a0lvha78mg.R.iget(4297)==0&false))) {{
            __CLR4_5_23a03a0lvha78mg.R.inc(4298);return false;
        }
        }__CLR4_5_23a03a0lvha78mg.R.inc(4299);final CharRange other = (CharRange) obj;
        __CLR4_5_23a03a0lvha78mg.R.inc(4300);return start == other.start && end == other.end && negated == other.negated;
    }finally{__CLR4_5_23a03a0lvha78mg.R.flushNeeded();}}

    /**
     * <p>Gets a hashCode compatible with the equals method.</p>
     * 
     * @return a suitable hashCode
     */
    @Override
    public int hashCode() {try{__CLR4_5_23a03a0lvha78mg.R.inc(4301);
        __CLR4_5_23a03a0lvha78mg.R.inc(4302);return 83 + start + 7 * end + ((((negated )&&(__CLR4_5_23a03a0lvha78mg.R.iget(4303)!=0|true))||(__CLR4_5_23a03a0lvha78mg.R.iget(4304)==0&false))? 1 : 0);
    }finally{__CLR4_5_23a03a0lvha78mg.R.flushNeeded();}}
    
    /**
     * <p>Gets a string representation of the character range.</p>
     * 
     * @return string representation of this range
     */
    @Override
    public String toString() {try{__CLR4_5_23a03a0lvha78mg.R.inc(4305);
        __CLR4_5_23a03a0lvha78mg.R.inc(4306);if ((((iToString == null)&&(__CLR4_5_23a03a0lvha78mg.R.iget(4307)!=0|true))||(__CLR4_5_23a03a0lvha78mg.R.iget(4308)==0&false))) {{
            __CLR4_5_23a03a0lvha78mg.R.inc(4309);final StringBuilder buf = new StringBuilder(4);
            __CLR4_5_23a03a0lvha78mg.R.inc(4310);if ((((isNegated())&&(__CLR4_5_23a03a0lvha78mg.R.iget(4311)!=0|true))||(__CLR4_5_23a03a0lvha78mg.R.iget(4312)==0&false))) {{
                __CLR4_5_23a03a0lvha78mg.R.inc(4313);buf.append('^');
            }
            }__CLR4_5_23a03a0lvha78mg.R.inc(4314);buf.append(start);
            __CLR4_5_23a03a0lvha78mg.R.inc(4315);if ((((start != end)&&(__CLR4_5_23a03a0lvha78mg.R.iget(4316)!=0|true))||(__CLR4_5_23a03a0lvha78mg.R.iget(4317)==0&false))) {{
                __CLR4_5_23a03a0lvha78mg.R.inc(4318);buf.append('-');
                __CLR4_5_23a03a0lvha78mg.R.inc(4319);buf.append(end);
            }
            }__CLR4_5_23a03a0lvha78mg.R.inc(4320);iToString = buf.toString();
        }
        }__CLR4_5_23a03a0lvha78mg.R.inc(4321);return iToString;
    }finally{__CLR4_5_23a03a0lvha78mg.R.flushNeeded();}}

    // Expansions
    //-----------------------------------------------------------------------
    /**
     * <p>Returns an iterator which can be used to walk through the characters described by this range.</p>
     *
     * <p>#NotThreadSafe# the iterator is not thread-safe</p>
     * @return an iterator to the chars represented by this range
     * @since 2.5
     */
    @Override
    public Iterator<Character> iterator() {try{__CLR4_5_23a03a0lvha78mg.R.inc(4322);
        __CLR4_5_23a03a0lvha78mg.R.inc(4323);return new CharacterIterator(this);
    }finally{__CLR4_5_23a03a0lvha78mg.R.flushNeeded();}}

    /**
     * Character {@link Iterator}.
     * <p>#NotThreadSafe#</p>
     */
    private static class CharacterIterator implements Iterator<Character> {
        /** The current character */
        private char current;

        private final CharRange range;
        private boolean hasNext;

        /**
         * Construct a new iterator for the character range.
         *
         * @param r The character range
         */
        private CharacterIterator(final CharRange r) {try{__CLR4_5_23a03a0lvha78mg.R.inc(4324);
            __CLR4_5_23a03a0lvha78mg.R.inc(4325);range = r;
            __CLR4_5_23a03a0lvha78mg.R.inc(4326);hasNext = true;

            __CLR4_5_23a03a0lvha78mg.R.inc(4327);if ((((range.negated)&&(__CLR4_5_23a03a0lvha78mg.R.iget(4328)!=0|true))||(__CLR4_5_23a03a0lvha78mg.R.iget(4329)==0&false))) {{
                __CLR4_5_23a03a0lvha78mg.R.inc(4330);if ((((range.start == 0)&&(__CLR4_5_23a03a0lvha78mg.R.iget(4331)!=0|true))||(__CLR4_5_23a03a0lvha78mg.R.iget(4332)==0&false))) {{
                    __CLR4_5_23a03a0lvha78mg.R.inc(4333);if ((((range.end == Character.MAX_VALUE)&&(__CLR4_5_23a03a0lvha78mg.R.iget(4334)!=0|true))||(__CLR4_5_23a03a0lvha78mg.R.iget(4335)==0&false))) {{
                        // This range is an empty set
                        __CLR4_5_23a03a0lvha78mg.R.inc(4336);hasNext = false;
                    } }else {{
                        __CLR4_5_23a03a0lvha78mg.R.inc(4337);current = (char) (range.end + 1);
                    }
                }} }else {{
                    __CLR4_5_23a03a0lvha78mg.R.inc(4338);current = 0;
                }
            }} }else {{
                __CLR4_5_23a03a0lvha78mg.R.inc(4339);current = range.start;
            }
        }}finally{__CLR4_5_23a03a0lvha78mg.R.flushNeeded();}}

        /**
         * Prepare the next character in the range.
         */
        private void prepareNext() {try{__CLR4_5_23a03a0lvha78mg.R.inc(4340);
            __CLR4_5_23a03a0lvha78mg.R.inc(4341);if ((((range.negated)&&(__CLR4_5_23a03a0lvha78mg.R.iget(4342)!=0|true))||(__CLR4_5_23a03a0lvha78mg.R.iget(4343)==0&false))) {{
                __CLR4_5_23a03a0lvha78mg.R.inc(4344);if ((((current == Character.MAX_VALUE)&&(__CLR4_5_23a03a0lvha78mg.R.iget(4345)!=0|true))||(__CLR4_5_23a03a0lvha78mg.R.iget(4346)==0&false))) {{
                    __CLR4_5_23a03a0lvha78mg.R.inc(4347);hasNext = false;
                } }else {__CLR4_5_23a03a0lvha78mg.R.inc(4348);if ((((current + 1 == range.start)&&(__CLR4_5_23a03a0lvha78mg.R.iget(4349)!=0|true))||(__CLR4_5_23a03a0lvha78mg.R.iget(4350)==0&false))) {{
                    __CLR4_5_23a03a0lvha78mg.R.inc(4351);if ((((range.end == Character.MAX_VALUE)&&(__CLR4_5_23a03a0lvha78mg.R.iget(4352)!=0|true))||(__CLR4_5_23a03a0lvha78mg.R.iget(4353)==0&false))) {{
                        __CLR4_5_23a03a0lvha78mg.R.inc(4354);hasNext = false;
                    } }else {{
                        __CLR4_5_23a03a0lvha78mg.R.inc(4355);current = (char) (range.end + 1);
                    }
                }} }else {{
                    __CLR4_5_23a03a0lvha78mg.R.inc(4356);current = (char) (current + 1);
                }
            }}} }else {__CLR4_5_23a03a0lvha78mg.R.inc(4357);if ((((current < range.end)&&(__CLR4_5_23a03a0lvha78mg.R.iget(4358)!=0|true))||(__CLR4_5_23a03a0lvha78mg.R.iget(4359)==0&false))) {{
                __CLR4_5_23a03a0lvha78mg.R.inc(4360);current = (char) (current + 1);
            } }else {{
                __CLR4_5_23a03a0lvha78mg.R.inc(4361);hasNext = false;
            }
        }}}finally{__CLR4_5_23a03a0lvha78mg.R.flushNeeded();}}

        /**
         * Has the iterator not reached the end character yet?
         *
         * @return {@code true} if the iterator has yet to reach the character date
         */
        @Override
        public boolean hasNext() {try{__CLR4_5_23a03a0lvha78mg.R.inc(4362);
            __CLR4_5_23a03a0lvha78mg.R.inc(4363);return hasNext;
        }finally{__CLR4_5_23a03a0lvha78mg.R.flushNeeded();}}

        /**
         * Return the next character in the iteration
         *
         * @return {@code Character} for the next character
         */
        @Override
        public Character next() {try{__CLR4_5_23a03a0lvha78mg.R.inc(4364);
            __CLR4_5_23a03a0lvha78mg.R.inc(4365);if ((((hasNext == false)&&(__CLR4_5_23a03a0lvha78mg.R.iget(4366)!=0|true))||(__CLR4_5_23a03a0lvha78mg.R.iget(4367)==0&false))) {{
                __CLR4_5_23a03a0lvha78mg.R.inc(4368);throw new NoSuchElementException();
            }
            }__CLR4_5_23a03a0lvha78mg.R.inc(4369);final char cur = current;
            __CLR4_5_23a03a0lvha78mg.R.inc(4370);prepareNext();
            __CLR4_5_23a03a0lvha78mg.R.inc(4371);return Character.valueOf(cur);
        }finally{__CLR4_5_23a03a0lvha78mg.R.flushNeeded();}}

        /**
         * Always throws UnsupportedOperationException.
         *
         * @throws UnsupportedOperationException
         * @see java.util.Iterator#remove()
         */
        @Override
        public void remove() {try{__CLR4_5_23a03a0lvha78mg.R.inc(4372);
            __CLR4_5_23a03a0lvha78mg.R.inc(4373);throw new UnsupportedOperationException();
        }finally{__CLR4_5_23a03a0lvha78mg.R.flushNeeded();}}
    }
}
