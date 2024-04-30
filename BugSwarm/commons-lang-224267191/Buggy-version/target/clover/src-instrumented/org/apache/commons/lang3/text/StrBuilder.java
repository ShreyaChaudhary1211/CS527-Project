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

import java.io.IOException;
import java.io.Reader;
import java.io.Serializable;
import java.io.Writer;
import java.nio.CharBuffer;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.Builder;

/**
 * Builds a string from constituent parts providing a more flexible and powerful API
 * than StringBuffer.
 * <p>
 * The main differences from StringBuffer/StringBuilder are:
 * </p>
 * <ul>
 * <li>Not synchronized</li>
 * <li>Not final</li>
 * <li>Subclasses have direct access to character array</li>
 * <li>Additional methods
 *  <ul>
 *   <li>appendWithSeparators - adds an array of values, with a separator</li>
 *   <li>appendPadding - adds a length padding characters</li>
 *   <li>appendFixedLength - adds a fixed width field to the builder</li>
 *   <li>toCharArray/getChars - simpler ways to get a range of the character array</li>
 *   <li>delete - delete char or string</li>
 *   <li>replace - search and replace for a char or string</li>
 *   <li>leftString/rightString/midString - substring without exceptions</li>
 *   <li>contains - whether the builder contains a char or string</li>
 *   <li>size/clear/isEmpty - collections style API methods</li>
 *  </ul>
 * </li>
 * <li>Views
 *  <ul>
 *   <li>asTokenizer - uses the internal buffer as the source of a StrTokenizer</li>
 *   <li>asReader - uses the internal buffer as the source of a Reader</li>
 *   <li>asWriter - allows a Writer to write directly to the internal buffer</li>
 *  </ul>
 * </li>
 * </ul>
 * <p>
 * The aim has been to provide an API that mimics very closely what StringBuffer
 * provides, but with additional methods. It should be noted that some edge cases,
 * with invalid indices or null input, have been altered - see individual methods.
 * The biggest of these changes is that by default, null will not output the text
 * 'null'. This can be controlled by a property, {@link #setNullText(String)}.
 * <p>
 * Prior to 3.0, this class implemented Cloneable but did not implement the 
 * clone method so could not be used. From 3.0 onwards it no longer implements 
 * the interface. 
 *
 * @since 2.2
 * @deprecated as of 3.6, use commons-text
 * <a href="https://commons.apache.org/proper/commons-text/javadocs/api-release/org/apache/commons/text/StrBuilder.html">
 * StrBuilder</a> instead
 */
@Deprecated
public class StrBuilder implements CharSequence, Appendable, Serializable, Builder<String> {public static class __CLR4_5_2edtedtlvha7bn1{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172755542L,8589935092L,20064,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * The extra capacity for new builders.
     */
    static final int CAPACITY = 32;

    /**
     * Required for serialization support.
     * 
     * @see java.io.Serializable
     */
    private static final long serialVersionUID = 7628716375283629643L;

    /** Internal data storage. */
    protected char[] buffer; // TODO make private?
    /** Current size of the buffer. */
    protected int size; // TODO make private?
    /** The new line. */
    private String newLine;
    /** The null text. */
    private String nullText;

    //-----------------------------------------------------------------------
    /**
     * Constructor that creates an empty builder initial capacity 32 characters.
     */
    public StrBuilder() {
        this(CAPACITY);__CLR4_5_2edtedtlvha7bn1.R.inc(18642);try{__CLR4_5_2edtedtlvha7bn1.R.inc(18641);
    }finally{__CLR4_5_2edtedtlvha7bn1.R.flushNeeded();}}

    /**
     * Constructor that creates an empty builder the specified initial capacity.
     *
     * @param initialCapacity  the initial capacity, zero or less will be converted to 32
     */
    public StrBuilder(int initialCapacity) {
        super();__CLR4_5_2edtedtlvha7bn1.R.inc(18644);try{__CLR4_5_2edtedtlvha7bn1.R.inc(18643);
        __CLR4_5_2edtedtlvha7bn1.R.inc(18645);if ((((initialCapacity <= 0)&&(__CLR4_5_2edtedtlvha7bn1.R.iget(18646)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(18647)==0&false))) {{
            __CLR4_5_2edtedtlvha7bn1.R.inc(18648);initialCapacity = CAPACITY;
        }
        }__CLR4_5_2edtedtlvha7bn1.R.inc(18649);buffer = new char[initialCapacity];
    }finally{__CLR4_5_2edtedtlvha7bn1.R.flushNeeded();}}

    /**
     * Constructor that creates a builder from the string, allocating
     * 32 extra characters for growth.
     *
     * @param str  the string to copy, null treated as blank string
     */
    public StrBuilder(final String str) {
        super();__CLR4_5_2edtedtlvha7bn1.R.inc(18651);try{__CLR4_5_2edtedtlvha7bn1.R.inc(18650);
        __CLR4_5_2edtedtlvha7bn1.R.inc(18652);if ((((str == null)&&(__CLR4_5_2edtedtlvha7bn1.R.iget(18653)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(18654)==0&false))) {{
            __CLR4_5_2edtedtlvha7bn1.R.inc(18655);buffer = new char[CAPACITY];
        } }else {{
            __CLR4_5_2edtedtlvha7bn1.R.inc(18656);buffer = new char[str.length() + CAPACITY];
            __CLR4_5_2edtedtlvha7bn1.R.inc(18657);append(str);
        }
    }}finally{__CLR4_5_2edtedtlvha7bn1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Gets the text to be appended when a new line is added.
     *
     * @return the new line text, null means use system default
     */
    public String getNewLineText() {try{__CLR4_5_2edtedtlvha7bn1.R.inc(18658);
        __CLR4_5_2edtedtlvha7bn1.R.inc(18659);return newLine;
    }finally{__CLR4_5_2edtedtlvha7bn1.R.flushNeeded();}}

    /**
     * Sets the text to be appended when a new line is added.
     *
     * @param newLine  the new line text, null means use system default
     * @return this, to enable chaining
     */
    public StrBuilder setNewLineText(final String newLine) {try{__CLR4_5_2edtedtlvha7bn1.R.inc(18660);
        __CLR4_5_2edtedtlvha7bn1.R.inc(18661);this.newLine = newLine;
        __CLR4_5_2edtedtlvha7bn1.R.inc(18662);return this;
    }finally{__CLR4_5_2edtedtlvha7bn1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Gets the text to be appended when null is added.
     *
     * @return the null text, null means no append
     */
    public String getNullText() {try{__CLR4_5_2edtedtlvha7bn1.R.inc(18663);
        __CLR4_5_2edtedtlvha7bn1.R.inc(18664);return nullText;
    }finally{__CLR4_5_2edtedtlvha7bn1.R.flushNeeded();}}

    /**
     * Sets the text to be appended when null is added.
     *
     * @param nullText  the null text, null means no append
     * @return this, to enable chaining
     */
    public StrBuilder setNullText(String nullText) {try{__CLR4_5_2edtedtlvha7bn1.R.inc(18665);
        __CLR4_5_2edtedtlvha7bn1.R.inc(18666);if ((((nullText != null && nullText.isEmpty())&&(__CLR4_5_2edtedtlvha7bn1.R.iget(18667)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(18668)==0&false))) {{
            __CLR4_5_2edtedtlvha7bn1.R.inc(18669);nullText = null;
        }
        }__CLR4_5_2edtedtlvha7bn1.R.inc(18670);this.nullText = nullText;
        __CLR4_5_2edtedtlvha7bn1.R.inc(18671);return this;
    }finally{__CLR4_5_2edtedtlvha7bn1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Gets the length of the string builder.
     *
     * @return the length
     */
    @Override
    public int length() {try{__CLR4_5_2edtedtlvha7bn1.R.inc(18672);
        __CLR4_5_2edtedtlvha7bn1.R.inc(18673);return size;
    }finally{__CLR4_5_2edtedtlvha7bn1.R.flushNeeded();}}

    /**
     * Updates the length of the builder by either dropping the last characters
     * or adding filler of Unicode zero.
     *
     * @param length  the length to set to, must be zero or positive
     * @return this, to enable chaining
     * @throws IndexOutOfBoundsException if the length is negative
     */
    public StrBuilder setLength(final int length) {try{__CLR4_5_2edtedtlvha7bn1.R.inc(18674);
        __CLR4_5_2edtedtlvha7bn1.R.inc(18675);if ((((length < 0)&&(__CLR4_5_2edtedtlvha7bn1.R.iget(18676)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(18677)==0&false))) {{
            __CLR4_5_2edtedtlvha7bn1.R.inc(18678);throw new StringIndexOutOfBoundsException(length);
        }
        }__CLR4_5_2edtedtlvha7bn1.R.inc(18679);if ((((length < size)&&(__CLR4_5_2edtedtlvha7bn1.R.iget(18680)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(18681)==0&false))) {{
            __CLR4_5_2edtedtlvha7bn1.R.inc(18682);size = length;
        } }else {__CLR4_5_2edtedtlvha7bn1.R.inc(18683);if ((((length > size)&&(__CLR4_5_2edtedtlvha7bn1.R.iget(18684)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(18685)==0&false))) {{
            __CLR4_5_2edtedtlvha7bn1.R.inc(18686);ensureCapacity(length);
            __CLR4_5_2edtedtlvha7bn1.R.inc(18687);final int oldEnd = size;
            __CLR4_5_2edtedtlvha7bn1.R.inc(18688);final int newEnd = length;
            __CLR4_5_2edtedtlvha7bn1.R.inc(18689);size = length;
            __CLR4_5_2edtedtlvha7bn1.R.inc(18690);for (int i = oldEnd; (((i < newEnd)&&(__CLR4_5_2edtedtlvha7bn1.R.iget(18691)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(18692)==0&false)); i++) {{
                __CLR4_5_2edtedtlvha7bn1.R.inc(18693);buffer[i] = '\0';
            }
        }}
        }}__CLR4_5_2edtedtlvha7bn1.R.inc(18694);return this;
    }finally{__CLR4_5_2edtedtlvha7bn1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Gets the current size of the internal character array buffer.
     *
     * @return the capacity
     */
    public int capacity() {try{__CLR4_5_2edtedtlvha7bn1.R.inc(18695);
        __CLR4_5_2edtedtlvha7bn1.R.inc(18696);return buffer.length;
    }finally{__CLR4_5_2edtedtlvha7bn1.R.flushNeeded();}}

    /**
     * Checks the capacity and ensures that it is at least the size specified.
     *
     * @param capacity  the capacity to ensure
     * @return this, to enable chaining
     */
    public StrBuilder ensureCapacity(final int capacity) {try{__CLR4_5_2edtedtlvha7bn1.R.inc(18697);
        __CLR4_5_2edtedtlvha7bn1.R.inc(18698);if ((((capacity > buffer.length)&&(__CLR4_5_2edtedtlvha7bn1.R.iget(18699)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(18700)==0&false))) {{
            __CLR4_5_2edtedtlvha7bn1.R.inc(18701);final char[] old = buffer;
            __CLR4_5_2edtedtlvha7bn1.R.inc(18702);buffer = new char[capacity * 2];
            __CLR4_5_2edtedtlvha7bn1.R.inc(18703);System.arraycopy(old, 0, buffer, 0, size);
        }
        }__CLR4_5_2edtedtlvha7bn1.R.inc(18704);return this;
    }finally{__CLR4_5_2edtedtlvha7bn1.R.flushNeeded();}}

    /**
     * Minimizes the capacity to the actual length of the string.
     *
     * @return this, to enable chaining
     */
    public StrBuilder minimizeCapacity() {try{__CLR4_5_2edtedtlvha7bn1.R.inc(18705);
        __CLR4_5_2edtedtlvha7bn1.R.inc(18706);if ((((buffer.length > length())&&(__CLR4_5_2edtedtlvha7bn1.R.iget(18707)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(18708)==0&false))) {{
            __CLR4_5_2edtedtlvha7bn1.R.inc(18709);final char[] old = buffer;
            __CLR4_5_2edtedtlvha7bn1.R.inc(18710);buffer = new char[length()];
            __CLR4_5_2edtedtlvha7bn1.R.inc(18711);System.arraycopy(old, 0, buffer, 0, size);
        }
        }__CLR4_5_2edtedtlvha7bn1.R.inc(18712);return this;
    }finally{__CLR4_5_2edtedtlvha7bn1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Gets the length of the string builder.
     * <p>
     * This method is the same as {@link #length()} and is provided to match the
     * API of Collections.
     *
     * @return the length
     */
    public int size() {try{__CLR4_5_2edtedtlvha7bn1.R.inc(18713);
        __CLR4_5_2edtedtlvha7bn1.R.inc(18714);return size;
    }finally{__CLR4_5_2edtedtlvha7bn1.R.flushNeeded();}}

    /**
     * Checks is the string builder is empty (convenience Collections API style method).
     * <p>
     * This method is the same as checking {@link #length()} and is provided to match the
     * API of Collections.
     *
     * @return <code>true</code> if the size is <code>0</code>.
     */
    public boolean isEmpty() {try{__CLR4_5_2edtedtlvha7bn1.R.inc(18715);
        __CLR4_5_2edtedtlvha7bn1.R.inc(18716);return size == 0;
    }finally{__CLR4_5_2edtedtlvha7bn1.R.flushNeeded();}}

    /**
     * Clears the string builder (convenience Collections API style method).
     * <p>
     * This method does not reduce the size of the internal character buffer.
     * To do that, call <code>clear()</code> followed by {@link #minimizeCapacity()}.
     * <p>
     * This method is the same as {@link #setLength(int)} called with zero
     * and is provided to match the API of Collections.
     *
     * @return this, to enable chaining
     */
    public StrBuilder clear() {try{__CLR4_5_2edtedtlvha7bn1.R.inc(18717);
        __CLR4_5_2edtedtlvha7bn1.R.inc(18718);size = 0;
        __CLR4_5_2edtedtlvha7bn1.R.inc(18719);return this;
    }finally{__CLR4_5_2edtedtlvha7bn1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Gets the character at the specified index.
     *
     * @see #setCharAt(int, char)
     * @see #deleteCharAt(int)
     * @param index  the index to retrieve, must be valid
     * @return the character at the index
     * @throws IndexOutOfBoundsException if the index is invalid
     */
    @Override
    public char charAt(final int index) {try{__CLR4_5_2edtedtlvha7bn1.R.inc(18720);
        __CLR4_5_2edtedtlvha7bn1.R.inc(18721);if ((((index < 0 || index >= length())&&(__CLR4_5_2edtedtlvha7bn1.R.iget(18722)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(18723)==0&false))) {{
            __CLR4_5_2edtedtlvha7bn1.R.inc(18724);throw new StringIndexOutOfBoundsException(index);
        }
        }__CLR4_5_2edtedtlvha7bn1.R.inc(18725);return buffer[index];
    }finally{__CLR4_5_2edtedtlvha7bn1.R.flushNeeded();}}

    /**
     * Sets the character at the specified index.
     *
     * @see #charAt(int)
     * @see #deleteCharAt(int)
     * @param index  the index to set
     * @param ch  the new character
     * @return this, to enable chaining
     * @throws IndexOutOfBoundsException if the index is invalid
     */
    public StrBuilder setCharAt(final int index, final char ch) {try{__CLR4_5_2edtedtlvha7bn1.R.inc(18726);
        __CLR4_5_2edtedtlvha7bn1.R.inc(18727);if ((((index < 0 || index >= length())&&(__CLR4_5_2edtedtlvha7bn1.R.iget(18728)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(18729)==0&false))) {{
            __CLR4_5_2edtedtlvha7bn1.R.inc(18730);throw new StringIndexOutOfBoundsException(index);
        }
        }__CLR4_5_2edtedtlvha7bn1.R.inc(18731);buffer[index] = ch;
        __CLR4_5_2edtedtlvha7bn1.R.inc(18732);return this;
    }finally{__CLR4_5_2edtedtlvha7bn1.R.flushNeeded();}}

    /**
     * Deletes the character at the specified index.
     *
     * @see #charAt(int)
     * @see #setCharAt(int, char)
     * @param index  the index to delete
     * @return this, to enable chaining
     * @throws IndexOutOfBoundsException if the index is invalid
     */
    public StrBuilder deleteCharAt(final int index) {try{__CLR4_5_2edtedtlvha7bn1.R.inc(18733);
        __CLR4_5_2edtedtlvha7bn1.R.inc(18734);if ((((index < 0 || index >= size)&&(__CLR4_5_2edtedtlvha7bn1.R.iget(18735)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(18736)==0&false))) {{
            __CLR4_5_2edtedtlvha7bn1.R.inc(18737);throw new StringIndexOutOfBoundsException(index);
        }
        }__CLR4_5_2edtedtlvha7bn1.R.inc(18738);deleteImpl(index, index + 1, 1);
        __CLR4_5_2edtedtlvha7bn1.R.inc(18739);return this;
    }finally{__CLR4_5_2edtedtlvha7bn1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Copies the builder's character array into a new character array.
     * 
     * @return a new array that represents the contents of the builder
     */
    public char[] toCharArray() {try{__CLR4_5_2edtedtlvha7bn1.R.inc(18740);
        __CLR4_5_2edtedtlvha7bn1.R.inc(18741);if ((((size == 0)&&(__CLR4_5_2edtedtlvha7bn1.R.iget(18742)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(18743)==0&false))) {{
            __CLR4_5_2edtedtlvha7bn1.R.inc(18744);return ArrayUtils.EMPTY_CHAR_ARRAY;
        }
        }__CLR4_5_2edtedtlvha7bn1.R.inc(18745);final char chars[] = new char[size];
        __CLR4_5_2edtedtlvha7bn1.R.inc(18746);System.arraycopy(buffer, 0, chars, 0, size);
        __CLR4_5_2edtedtlvha7bn1.R.inc(18747);return chars;
    }finally{__CLR4_5_2edtedtlvha7bn1.R.flushNeeded();}}

    /**
     * Copies part of the builder's character array into a new character array.
     * 
     * @param startIndex  the start index, inclusive, must be valid
     * @param endIndex  the end index, exclusive, must be valid except that
     *  if too large it is treated as end of string
     * @return a new array that holds part of the contents of the builder
     * @throws IndexOutOfBoundsException if startIndex is invalid,
     *  or if endIndex is invalid (but endIndex greater than size is valid)
     */
    public char[] toCharArray(final int startIndex, int endIndex) {try{__CLR4_5_2edtedtlvha7bn1.R.inc(18748);
        __CLR4_5_2edtedtlvha7bn1.R.inc(18749);endIndex = validateRange(startIndex, endIndex);
        __CLR4_5_2edtedtlvha7bn1.R.inc(18750);final int len = endIndex - startIndex;
        __CLR4_5_2edtedtlvha7bn1.R.inc(18751);if ((((len == 0)&&(__CLR4_5_2edtedtlvha7bn1.R.iget(18752)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(18753)==0&false))) {{
            __CLR4_5_2edtedtlvha7bn1.R.inc(18754);return ArrayUtils.EMPTY_CHAR_ARRAY;
        }
        }__CLR4_5_2edtedtlvha7bn1.R.inc(18755);final char chars[] = new char[len];
        __CLR4_5_2edtedtlvha7bn1.R.inc(18756);System.arraycopy(buffer, startIndex, chars, 0, len);
        __CLR4_5_2edtedtlvha7bn1.R.inc(18757);return chars;
    }finally{__CLR4_5_2edtedtlvha7bn1.R.flushNeeded();}}

    /**
     * Copies the character array into the specified array.
     * 
     * @param destination  the destination array, null will cause an array to be created
     * @return the input array, unless that was null or too small
     */
    public char[] getChars(char[] destination) {try{__CLR4_5_2edtedtlvha7bn1.R.inc(18758);
        __CLR4_5_2edtedtlvha7bn1.R.inc(18759);final int len = length();
        __CLR4_5_2edtedtlvha7bn1.R.inc(18760);if ((((destination == null || destination.length < len)&&(__CLR4_5_2edtedtlvha7bn1.R.iget(18761)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(18762)==0&false))) {{
            __CLR4_5_2edtedtlvha7bn1.R.inc(18763);destination = new char[len];
        }
        }__CLR4_5_2edtedtlvha7bn1.R.inc(18764);System.arraycopy(buffer, 0, destination, 0, len);
        __CLR4_5_2edtedtlvha7bn1.R.inc(18765);return destination;
    }finally{__CLR4_5_2edtedtlvha7bn1.R.flushNeeded();}}

    /**
     * Copies the character array into the specified array.
     *
     * @param startIndex  first index to copy, inclusive, must be valid
     * @param endIndex  last index, exclusive, must be valid
     * @param destination  the destination array, must not be null or too small
     * @param destinationIndex  the index to start copying in destination
     * @throws NullPointerException if the array is null
     * @throws IndexOutOfBoundsException if any index is invalid
     */
    public void getChars(final int startIndex, final int endIndex, final char destination[], final int destinationIndex) {try{__CLR4_5_2edtedtlvha7bn1.R.inc(18766);
        __CLR4_5_2edtedtlvha7bn1.R.inc(18767);if ((((startIndex < 0)&&(__CLR4_5_2edtedtlvha7bn1.R.iget(18768)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(18769)==0&false))) {{
            __CLR4_5_2edtedtlvha7bn1.R.inc(18770);throw new StringIndexOutOfBoundsException(startIndex);
        }
        }__CLR4_5_2edtedtlvha7bn1.R.inc(18771);if ((((endIndex < 0 || endIndex > length())&&(__CLR4_5_2edtedtlvha7bn1.R.iget(18772)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(18773)==0&false))) {{
            __CLR4_5_2edtedtlvha7bn1.R.inc(18774);throw new StringIndexOutOfBoundsException(endIndex);
        }
        }__CLR4_5_2edtedtlvha7bn1.R.inc(18775);if ((((startIndex > endIndex)&&(__CLR4_5_2edtedtlvha7bn1.R.iget(18776)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(18777)==0&false))) {{
            __CLR4_5_2edtedtlvha7bn1.R.inc(18778);throw new StringIndexOutOfBoundsException("end < start");
        }
        }__CLR4_5_2edtedtlvha7bn1.R.inc(18779);System.arraycopy(buffer, startIndex, destination, destinationIndex, endIndex - startIndex);
    }finally{__CLR4_5_2edtedtlvha7bn1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * If possible, reads chars from the provided {@link Readable} directly into underlying
     * character buffer without making extra copies.
     *
     * @param readable  object to read from
     * @return the number of characters read
     * @throws IOException if an I/O error occurs
     *
     * @since 3.4
     * @see #appendTo(Appendable)
     */
    public int readFrom(final Readable readable) throws IOException {try{__CLR4_5_2edtedtlvha7bn1.R.inc(18780);
        __CLR4_5_2edtedtlvha7bn1.R.inc(18781);final int oldSize = size;
        __CLR4_5_2edtedtlvha7bn1.R.inc(18782);if ((((readable instanceof Reader)&&(__CLR4_5_2edtedtlvha7bn1.R.iget(18783)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(18784)==0&false))) {{
            __CLR4_5_2edtedtlvha7bn1.R.inc(18785);final Reader r = (Reader) readable;
            __CLR4_5_2edtedtlvha7bn1.R.inc(18786);ensureCapacity(size + 1);
            __CLR4_5_2edtedtlvha7bn1.R.inc(18787);int read;
            __CLR4_5_2edtedtlvha7bn1.R.inc(18788);while ((read = r.read(buffer, size, buffer.length - size)) != -1) {{
                __CLR4_5_2edtedtlvha7bn1.R.inc(18791);size += read;
                __CLR4_5_2edtedtlvha7bn1.R.inc(18792);ensureCapacity(size + 1);
            }
        }} }else {__CLR4_5_2edtedtlvha7bn1.R.inc(18793);if ((((readable instanceof CharBuffer)&&(__CLR4_5_2edtedtlvha7bn1.R.iget(18794)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(18795)==0&false))) {{
            __CLR4_5_2edtedtlvha7bn1.R.inc(18796);final CharBuffer cb = (CharBuffer) readable;
            __CLR4_5_2edtedtlvha7bn1.R.inc(18797);final int remaining = cb.remaining();
            __CLR4_5_2edtedtlvha7bn1.R.inc(18798);ensureCapacity(size + remaining);
            __CLR4_5_2edtedtlvha7bn1.R.inc(18799);cb.get(buffer, size, remaining);
            __CLR4_5_2edtedtlvha7bn1.R.inc(18800);size += remaining;
        } }else {{
            __CLR4_5_2edtedtlvha7bn1.R.inc(18801);while (true) {{
                __CLR4_5_2edtedtlvha7bn1.R.inc(18802);ensureCapacity(size + 1);
                __CLR4_5_2edtedtlvha7bn1.R.inc(18803);final CharBuffer buf = CharBuffer.wrap(buffer, size, buffer.length - size);
                __CLR4_5_2edtedtlvha7bn1.R.inc(18804);final int read = readable.read(buf);
                __CLR4_5_2edtedtlvha7bn1.R.inc(18805);if ((((read == -1)&&(__CLR4_5_2edtedtlvha7bn1.R.iget(18806)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(18807)==0&false))) {{
                    __CLR4_5_2edtedtlvha7bn1.R.inc(18808);break;
                }
                }__CLR4_5_2edtedtlvha7bn1.R.inc(18809);size += read;
            }
        }}
        }}__CLR4_5_2edtedtlvha7bn1.R.inc(18810);return size - oldSize;
    }finally{__CLR4_5_2edtedtlvha7bn1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Appends the new line string to this string builder.
     * <p>
     * The new line string can be altered using {@link #setNewLineText(String)}.
     * This might be used to force the output to always use Unix line endings
     * even when on Windows.
     *
     * @return this, to enable chaining
     */
    public StrBuilder appendNewLine() {try{__CLR4_5_2edtedtlvha7bn1.R.inc(18811);
        __CLR4_5_2edtedtlvha7bn1.R.inc(18812);if ((((newLine == null)&&(__CLR4_5_2edtedtlvha7bn1.R.iget(18813)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(18814)==0&false)))  {{
            __CLR4_5_2edtedtlvha7bn1.R.inc(18815);append(System.lineSeparator());
            __CLR4_5_2edtedtlvha7bn1.R.inc(18816);return this;
        }
        }__CLR4_5_2edtedtlvha7bn1.R.inc(18817);return append(newLine);
    }finally{__CLR4_5_2edtedtlvha7bn1.R.flushNeeded();}}

    /**
     * Appends the text representing <code>null</code> to this string builder.
     *
     * @return this, to enable chaining
     */
    public StrBuilder appendNull() {try{__CLR4_5_2edtedtlvha7bn1.R.inc(18818);
        __CLR4_5_2edtedtlvha7bn1.R.inc(18819);if ((((nullText == null)&&(__CLR4_5_2edtedtlvha7bn1.R.iget(18820)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(18821)==0&false)))  {{
            __CLR4_5_2edtedtlvha7bn1.R.inc(18822);return this;
        }
        }__CLR4_5_2edtedtlvha7bn1.R.inc(18823);return append(nullText);
    }finally{__CLR4_5_2edtedtlvha7bn1.R.flushNeeded();}}

    /**
     * Appends an object to this string builder.
     * Appending null will call {@link #appendNull()}.
     *
     * @param obj  the object to append
     * @return this, to enable chaining
     */
    public StrBuilder append(final Object obj) {try{__CLR4_5_2edtedtlvha7bn1.R.inc(18824);
        __CLR4_5_2edtedtlvha7bn1.R.inc(18825);if ((((obj == null)&&(__CLR4_5_2edtedtlvha7bn1.R.iget(18826)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(18827)==0&false))) {{
            __CLR4_5_2edtedtlvha7bn1.R.inc(18828);return appendNull();
        }
        }__CLR4_5_2edtedtlvha7bn1.R.inc(18829);if ((((obj instanceof CharSequence)&&(__CLR4_5_2edtedtlvha7bn1.R.iget(18830)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(18831)==0&false))) {{
            __CLR4_5_2edtedtlvha7bn1.R.inc(18832);return append((CharSequence) obj);
        }
        }__CLR4_5_2edtedtlvha7bn1.R.inc(18833);return append(obj.toString());        
    }finally{__CLR4_5_2edtedtlvha7bn1.R.flushNeeded();}}

    /**
     * Appends a CharSequence to this string builder.
     * Appending null will call {@link #appendNull()}.
     *
     * @param seq  the CharSequence to append
     * @return this, to enable chaining
     * @since 3.0
     */
    @Override
    public StrBuilder append(final CharSequence seq) {try{__CLR4_5_2edtedtlvha7bn1.R.inc(18834);
        __CLR4_5_2edtedtlvha7bn1.R.inc(18835);if ((((seq == null)&&(__CLR4_5_2edtedtlvha7bn1.R.iget(18836)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(18837)==0&false))) {{
            __CLR4_5_2edtedtlvha7bn1.R.inc(18838);return appendNull();
        }
        }__CLR4_5_2edtedtlvha7bn1.R.inc(18839);if ((((seq instanceof StrBuilder)&&(__CLR4_5_2edtedtlvha7bn1.R.iget(18840)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(18841)==0&false))) {{
            __CLR4_5_2edtedtlvha7bn1.R.inc(18842);return append((StrBuilder) seq);
        }
        }__CLR4_5_2edtedtlvha7bn1.R.inc(18843);if ((((seq instanceof StringBuilder)&&(__CLR4_5_2edtedtlvha7bn1.R.iget(18844)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(18845)==0&false))) {{
            __CLR4_5_2edtedtlvha7bn1.R.inc(18846);return append((StringBuilder) seq);
        }
        }__CLR4_5_2edtedtlvha7bn1.R.inc(18847);if ((((seq instanceof StringBuffer)&&(__CLR4_5_2edtedtlvha7bn1.R.iget(18848)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(18849)==0&false))) {{
            __CLR4_5_2edtedtlvha7bn1.R.inc(18850);return append((StringBuffer) seq);
        }
        }__CLR4_5_2edtedtlvha7bn1.R.inc(18851);if ((((seq instanceof CharBuffer)&&(__CLR4_5_2edtedtlvha7bn1.R.iget(18852)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(18853)==0&false))) {{
            __CLR4_5_2edtedtlvha7bn1.R.inc(18854);return append((CharBuffer) seq);
        }
        }__CLR4_5_2edtedtlvha7bn1.R.inc(18855);return append(seq.toString());        
    }finally{__CLR4_5_2edtedtlvha7bn1.R.flushNeeded();}}

    /**
     * Appends part of a CharSequence to this string builder.
     * Appending null will call {@link #appendNull()}.
     *
     * @param seq  the CharSequence to append
     * @param startIndex  the start index, inclusive, must be valid
     * @param length  the length to append, must be valid
     * @return this, to enable chaining
     * @since 3.0
     */
    @Override
    public StrBuilder append(final CharSequence seq, final int startIndex, final int length) {try{__CLR4_5_2edtedtlvha7bn1.R.inc(18856);
        __CLR4_5_2edtedtlvha7bn1.R.inc(18857);if ((((seq == null)&&(__CLR4_5_2edtedtlvha7bn1.R.iget(18858)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(18859)==0&false))) {{
            __CLR4_5_2edtedtlvha7bn1.R.inc(18860);return appendNull();
        } 
        }__CLR4_5_2edtedtlvha7bn1.R.inc(18861);return append(seq.toString(), startIndex, length);
    }finally{__CLR4_5_2edtedtlvha7bn1.R.flushNeeded();}}
    
    /**
     * Appends a string to this string builder.
     * Appending null will call {@link #appendNull()}.
     *
     * @param str  the string to append
     * @return this, to enable chaining
     */
    public StrBuilder append(final String str) {try{__CLR4_5_2edtedtlvha7bn1.R.inc(18862);
        __CLR4_5_2edtedtlvha7bn1.R.inc(18863);if ((((str == null)&&(__CLR4_5_2edtedtlvha7bn1.R.iget(18864)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(18865)==0&false))) {{
            __CLR4_5_2edtedtlvha7bn1.R.inc(18866);return appendNull();
        }
        }__CLR4_5_2edtedtlvha7bn1.R.inc(18867);final int strLen = str.length();
        __CLR4_5_2edtedtlvha7bn1.R.inc(18868);if ((((strLen > 0)&&(__CLR4_5_2edtedtlvha7bn1.R.iget(18869)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(18870)==0&false))) {{
            __CLR4_5_2edtedtlvha7bn1.R.inc(18871);final int len = length();
            __CLR4_5_2edtedtlvha7bn1.R.inc(18872);ensureCapacity(len + strLen);
            __CLR4_5_2edtedtlvha7bn1.R.inc(18873);str.getChars(0, strLen, buffer, len);
            __CLR4_5_2edtedtlvha7bn1.R.inc(18874);size += strLen;
        }
        }__CLR4_5_2edtedtlvha7bn1.R.inc(18875);return this;
    }finally{__CLR4_5_2edtedtlvha7bn1.R.flushNeeded();}}
   

    /**
     * Appends part of a string to this string builder.
     * Appending null will call {@link #appendNull()}.
     *
     * @param str  the string to append
     * @param startIndex  the start index, inclusive, must be valid
     * @param length  the length to append, must be valid
     * @return this, to enable chaining
     */
    public StrBuilder append(final String str, final int startIndex, final int length) {try{__CLR4_5_2edtedtlvha7bn1.R.inc(18876);
        __CLR4_5_2edtedtlvha7bn1.R.inc(18877);if ((((str == null)&&(__CLR4_5_2edtedtlvha7bn1.R.iget(18878)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(18879)==0&false))) {{
            __CLR4_5_2edtedtlvha7bn1.R.inc(18880);return appendNull();
        }
        }__CLR4_5_2edtedtlvha7bn1.R.inc(18881);if ((((startIndex < 0 || startIndex > str.length())&&(__CLR4_5_2edtedtlvha7bn1.R.iget(18882)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(18883)==0&false))) {{
            __CLR4_5_2edtedtlvha7bn1.R.inc(18884);throw new StringIndexOutOfBoundsException("startIndex must be valid");
        }
        }__CLR4_5_2edtedtlvha7bn1.R.inc(18885);if ((((length < 0 || (startIndex + length) > str.length())&&(__CLR4_5_2edtedtlvha7bn1.R.iget(18886)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(18887)==0&false))) {{
            __CLR4_5_2edtedtlvha7bn1.R.inc(18888);throw new StringIndexOutOfBoundsException("length must be valid");
        }
        }__CLR4_5_2edtedtlvha7bn1.R.inc(18889);if ((((length > 0)&&(__CLR4_5_2edtedtlvha7bn1.R.iget(18890)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(18891)==0&false))) {{
            __CLR4_5_2edtedtlvha7bn1.R.inc(18892);final int len = length();
            __CLR4_5_2edtedtlvha7bn1.R.inc(18893);ensureCapacity(len + length);
            __CLR4_5_2edtedtlvha7bn1.R.inc(18894);str.getChars(startIndex, startIndex + length, buffer, len);
            __CLR4_5_2edtedtlvha7bn1.R.inc(18895);size += length;
        }
        }__CLR4_5_2edtedtlvha7bn1.R.inc(18896);return this;
    }finally{__CLR4_5_2edtedtlvha7bn1.R.flushNeeded();}}

    /**
     * Calls {@link String#format(String, Object...)} and appends the result.
     *
     * @param format the format string
     * @param objs the objects to use in the format string
     * @return {@code this} to enable chaining
     * @see String#format(String, Object...)
     * @since 3.2
     */
    public StrBuilder append(final String format, final Object... objs) {try{__CLR4_5_2edtedtlvha7bn1.R.inc(18897);
        __CLR4_5_2edtedtlvha7bn1.R.inc(18898);return append(String.format(format, objs));
    }finally{__CLR4_5_2edtedtlvha7bn1.R.flushNeeded();}}

    /**
     * Appends the contents of a char buffer to this string builder.
     * Appending null will call {@link #appendNull()}.
     *
     * @param buf  the char buffer to append
     * @return this, to enable chaining
     * @since 3.4
     */
    public StrBuilder append(final CharBuffer buf) {try{__CLR4_5_2edtedtlvha7bn1.R.inc(18899);
        __CLR4_5_2edtedtlvha7bn1.R.inc(18900);if ((((buf == null)&&(__CLR4_5_2edtedtlvha7bn1.R.iget(18901)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(18902)==0&false))) {{
            __CLR4_5_2edtedtlvha7bn1.R.inc(18903);return appendNull();
        }
        }__CLR4_5_2edtedtlvha7bn1.R.inc(18904);if ((((buf.hasArray())&&(__CLR4_5_2edtedtlvha7bn1.R.iget(18905)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(18906)==0&false))) {{
            __CLR4_5_2edtedtlvha7bn1.R.inc(18907);final int length = buf.remaining();
            __CLR4_5_2edtedtlvha7bn1.R.inc(18908);final int len = length();
            __CLR4_5_2edtedtlvha7bn1.R.inc(18909);ensureCapacity(len + length);
            __CLR4_5_2edtedtlvha7bn1.R.inc(18910);System.arraycopy(buf.array(), buf.arrayOffset() + buf.position(), buffer, len, length);
            __CLR4_5_2edtedtlvha7bn1.R.inc(18911);size += length;
        } }else {{
            __CLR4_5_2edtedtlvha7bn1.R.inc(18912);append(buf.toString());
        }
        }__CLR4_5_2edtedtlvha7bn1.R.inc(18913);return this;
    }finally{__CLR4_5_2edtedtlvha7bn1.R.flushNeeded();}}

    /**
     * Appends the contents of a char buffer to this string builder.
     * Appending null will call {@link #appendNull()}.
     *
     * @param buf  the char buffer to append
     * @param startIndex  the start index, inclusive, must be valid
     * @param length  the length to append, must be valid
     * @return this, to enable chaining
     * @since 3.4
     */
    public StrBuilder append(final CharBuffer buf, final int startIndex, final int length) {try{__CLR4_5_2edtedtlvha7bn1.R.inc(18914);
        __CLR4_5_2edtedtlvha7bn1.R.inc(18915);if ((((buf == null)&&(__CLR4_5_2edtedtlvha7bn1.R.iget(18916)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(18917)==0&false))) {{
            __CLR4_5_2edtedtlvha7bn1.R.inc(18918);return appendNull();
        }
        }__CLR4_5_2edtedtlvha7bn1.R.inc(18919);if ((((buf.hasArray())&&(__CLR4_5_2edtedtlvha7bn1.R.iget(18920)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(18921)==0&false))) {{
            __CLR4_5_2edtedtlvha7bn1.R.inc(18922);final int totalLength = buf.remaining();
            __CLR4_5_2edtedtlvha7bn1.R.inc(18923);if ((((startIndex < 0 || startIndex > totalLength)&&(__CLR4_5_2edtedtlvha7bn1.R.iget(18924)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(18925)==0&false))) {{
                __CLR4_5_2edtedtlvha7bn1.R.inc(18926);throw new StringIndexOutOfBoundsException("startIndex must be valid");
            }
            }__CLR4_5_2edtedtlvha7bn1.R.inc(18927);if ((((length < 0 || (startIndex + length) > totalLength)&&(__CLR4_5_2edtedtlvha7bn1.R.iget(18928)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(18929)==0&false))) {{
                __CLR4_5_2edtedtlvha7bn1.R.inc(18930);throw new StringIndexOutOfBoundsException("length must be valid");
            }
            }__CLR4_5_2edtedtlvha7bn1.R.inc(18931);final int len = length();
            __CLR4_5_2edtedtlvha7bn1.R.inc(18932);ensureCapacity(len + length);
            __CLR4_5_2edtedtlvha7bn1.R.inc(18933);System.arraycopy(buf.array(), buf.arrayOffset() + buf.position() + startIndex, buffer, len, length);
            __CLR4_5_2edtedtlvha7bn1.R.inc(18934);size += length;
        } }else {{
            __CLR4_5_2edtedtlvha7bn1.R.inc(18935);append(buf.toString(), startIndex, length);
        }
        }__CLR4_5_2edtedtlvha7bn1.R.inc(18936);return this;
    }finally{__CLR4_5_2edtedtlvha7bn1.R.flushNeeded();}}

    /**
     * Appends a string buffer to this string builder.
     * Appending null will call {@link #appendNull()}.
     *
     * @param str  the string buffer to append
     * @return this, to enable chaining
     */
    public StrBuilder append(final StringBuffer str) {try{__CLR4_5_2edtedtlvha7bn1.R.inc(18937);
        __CLR4_5_2edtedtlvha7bn1.R.inc(18938);if ((((str == null)&&(__CLR4_5_2edtedtlvha7bn1.R.iget(18939)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(18940)==0&false))) {{
            __CLR4_5_2edtedtlvha7bn1.R.inc(18941);return appendNull();
        }
        }__CLR4_5_2edtedtlvha7bn1.R.inc(18942);final int strLen = str.length();
        __CLR4_5_2edtedtlvha7bn1.R.inc(18943);if ((((strLen > 0)&&(__CLR4_5_2edtedtlvha7bn1.R.iget(18944)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(18945)==0&false))) {{
            __CLR4_5_2edtedtlvha7bn1.R.inc(18946);final int len = length();
            __CLR4_5_2edtedtlvha7bn1.R.inc(18947);ensureCapacity(len + strLen);
            __CLR4_5_2edtedtlvha7bn1.R.inc(18948);str.getChars(0, strLen, buffer, len);
            __CLR4_5_2edtedtlvha7bn1.R.inc(18949);size += strLen;
        }
        }__CLR4_5_2edtedtlvha7bn1.R.inc(18950);return this;
    }finally{__CLR4_5_2edtedtlvha7bn1.R.flushNeeded();}}

    /**
     * Appends part of a string buffer to this string builder.
     * Appending null will call {@link #appendNull()}.
     *
     * @param str  the string to append
     * @param startIndex  the start index, inclusive, must be valid
     * @param length  the length to append, must be valid
     * @return this, to enable chaining
     */
    public StrBuilder append(final StringBuffer str, final int startIndex, final int length) {try{__CLR4_5_2edtedtlvha7bn1.R.inc(18951);
        __CLR4_5_2edtedtlvha7bn1.R.inc(18952);if ((((str == null)&&(__CLR4_5_2edtedtlvha7bn1.R.iget(18953)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(18954)==0&false))) {{
            __CLR4_5_2edtedtlvha7bn1.R.inc(18955);return appendNull();
        }
        }__CLR4_5_2edtedtlvha7bn1.R.inc(18956);if ((((startIndex < 0 || startIndex > str.length())&&(__CLR4_5_2edtedtlvha7bn1.R.iget(18957)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(18958)==0&false))) {{
            __CLR4_5_2edtedtlvha7bn1.R.inc(18959);throw new StringIndexOutOfBoundsException("startIndex must be valid");
        }
        }__CLR4_5_2edtedtlvha7bn1.R.inc(18960);if ((((length < 0 || (startIndex + length) > str.length())&&(__CLR4_5_2edtedtlvha7bn1.R.iget(18961)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(18962)==0&false))) {{
            __CLR4_5_2edtedtlvha7bn1.R.inc(18963);throw new StringIndexOutOfBoundsException("length must be valid");
        }
        }__CLR4_5_2edtedtlvha7bn1.R.inc(18964);if ((((length > 0)&&(__CLR4_5_2edtedtlvha7bn1.R.iget(18965)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(18966)==0&false))) {{
            __CLR4_5_2edtedtlvha7bn1.R.inc(18967);final int len = length();
            __CLR4_5_2edtedtlvha7bn1.R.inc(18968);ensureCapacity(len + length);
            __CLR4_5_2edtedtlvha7bn1.R.inc(18969);str.getChars(startIndex, startIndex + length, buffer, len);
            __CLR4_5_2edtedtlvha7bn1.R.inc(18970);size += length;
        }
        }__CLR4_5_2edtedtlvha7bn1.R.inc(18971);return this;
    }finally{__CLR4_5_2edtedtlvha7bn1.R.flushNeeded();}}

    /**
     * Appends a StringBuilder to this string builder.
     * Appending null will call {@link #appendNull()}.
     *
     * @param str the StringBuilder to append
     * @return this, to enable chaining
     * @since 3.2
     */
    public StrBuilder append(final StringBuilder str) {try{__CLR4_5_2edtedtlvha7bn1.R.inc(18972);
        __CLR4_5_2edtedtlvha7bn1.R.inc(18973);if ((((str == null)&&(__CLR4_5_2edtedtlvha7bn1.R.iget(18974)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(18975)==0&false))) {{
            __CLR4_5_2edtedtlvha7bn1.R.inc(18976);return appendNull();
        }
        }__CLR4_5_2edtedtlvha7bn1.R.inc(18977);final int strLen = str.length();
        __CLR4_5_2edtedtlvha7bn1.R.inc(18978);if ((((strLen > 0)&&(__CLR4_5_2edtedtlvha7bn1.R.iget(18979)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(18980)==0&false))) {{
            __CLR4_5_2edtedtlvha7bn1.R.inc(18981);final int len = length();
            __CLR4_5_2edtedtlvha7bn1.R.inc(18982);ensureCapacity(len + strLen);
            __CLR4_5_2edtedtlvha7bn1.R.inc(18983);str.getChars(0, strLen, buffer, len);
            __CLR4_5_2edtedtlvha7bn1.R.inc(18984);size += strLen;
        }
        }__CLR4_5_2edtedtlvha7bn1.R.inc(18985);return this;
    }finally{__CLR4_5_2edtedtlvha7bn1.R.flushNeeded();}}
    
    /**
     * Appends part of a StringBuilder to this string builder.
     * Appending null will call {@link #appendNull()}.
     *
     * @param str the StringBuilder to append
     * @param startIndex the start index, inclusive, must be valid
     * @param length the length to append, must be valid
     * @return this, to enable chaining
     * @since 3.2
     */
    public StrBuilder append(final StringBuilder str, final int startIndex, final int length) {try{__CLR4_5_2edtedtlvha7bn1.R.inc(18986);
        __CLR4_5_2edtedtlvha7bn1.R.inc(18987);if ((((str == null)&&(__CLR4_5_2edtedtlvha7bn1.R.iget(18988)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(18989)==0&false))) {{
            __CLR4_5_2edtedtlvha7bn1.R.inc(18990);return appendNull();
        }
        }__CLR4_5_2edtedtlvha7bn1.R.inc(18991);if ((((startIndex < 0 || startIndex > str.length())&&(__CLR4_5_2edtedtlvha7bn1.R.iget(18992)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(18993)==0&false))) {{
            __CLR4_5_2edtedtlvha7bn1.R.inc(18994);throw new StringIndexOutOfBoundsException("startIndex must be valid");
        }
        }__CLR4_5_2edtedtlvha7bn1.R.inc(18995);if ((((length < 0 || (startIndex + length) > str.length())&&(__CLR4_5_2edtedtlvha7bn1.R.iget(18996)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(18997)==0&false))) {{
            __CLR4_5_2edtedtlvha7bn1.R.inc(18998);throw new StringIndexOutOfBoundsException("length must be valid");
        }
        }__CLR4_5_2edtedtlvha7bn1.R.inc(18999);if ((((length > 0)&&(__CLR4_5_2edtedtlvha7bn1.R.iget(19000)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(19001)==0&false))) {{
            __CLR4_5_2edtedtlvha7bn1.R.inc(19002);final int len = length();
            __CLR4_5_2edtedtlvha7bn1.R.inc(19003);ensureCapacity(len + length);
            __CLR4_5_2edtedtlvha7bn1.R.inc(19004);str.getChars(startIndex, startIndex + length, buffer, len);
            __CLR4_5_2edtedtlvha7bn1.R.inc(19005);size += length;
        }
        }__CLR4_5_2edtedtlvha7bn1.R.inc(19006);return this;
    }finally{__CLR4_5_2edtedtlvha7bn1.R.flushNeeded();}}

    /**
     * Appends another string builder to this string builder.
     * Appending null will call {@link #appendNull()}.
     *
     * @param str  the string builder to append
     * @return this, to enable chaining
     */
    public StrBuilder append(final StrBuilder str) {try{__CLR4_5_2edtedtlvha7bn1.R.inc(19007);
        __CLR4_5_2edtedtlvha7bn1.R.inc(19008);if ((((str == null)&&(__CLR4_5_2edtedtlvha7bn1.R.iget(19009)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(19010)==0&false))) {{
            __CLR4_5_2edtedtlvha7bn1.R.inc(19011);return appendNull();
        }
        }__CLR4_5_2edtedtlvha7bn1.R.inc(19012);final int strLen = str.length();
        __CLR4_5_2edtedtlvha7bn1.R.inc(19013);if ((((strLen > 0)&&(__CLR4_5_2edtedtlvha7bn1.R.iget(19014)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(19015)==0&false))) {{
            __CLR4_5_2edtedtlvha7bn1.R.inc(19016);final int len = length();
            __CLR4_5_2edtedtlvha7bn1.R.inc(19017);ensureCapacity(len + strLen);
            __CLR4_5_2edtedtlvha7bn1.R.inc(19018);System.arraycopy(str.buffer, 0, buffer, len, strLen);
            __CLR4_5_2edtedtlvha7bn1.R.inc(19019);size += strLen;
        }
        }__CLR4_5_2edtedtlvha7bn1.R.inc(19020);return this;
    }finally{__CLR4_5_2edtedtlvha7bn1.R.flushNeeded();}}

    /**
     * Appends part of a string builder to this string builder.
     * Appending null will call {@link #appendNull()}.
     *
     * @param str  the string to append
     * @param startIndex  the start index, inclusive, must be valid
     * @param length  the length to append, must be valid
     * @return this, to enable chaining
     */
    public StrBuilder append(final StrBuilder str, final int startIndex, final int length) {try{__CLR4_5_2edtedtlvha7bn1.R.inc(19021);
        __CLR4_5_2edtedtlvha7bn1.R.inc(19022);if ((((str == null)&&(__CLR4_5_2edtedtlvha7bn1.R.iget(19023)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(19024)==0&false))) {{
            __CLR4_5_2edtedtlvha7bn1.R.inc(19025);return appendNull();
        }
        }__CLR4_5_2edtedtlvha7bn1.R.inc(19026);if ((((startIndex < 0 || startIndex > str.length())&&(__CLR4_5_2edtedtlvha7bn1.R.iget(19027)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(19028)==0&false))) {{
            __CLR4_5_2edtedtlvha7bn1.R.inc(19029);throw new StringIndexOutOfBoundsException("startIndex must be valid");
        }
        }__CLR4_5_2edtedtlvha7bn1.R.inc(19030);if ((((length < 0 || (startIndex + length) > str.length())&&(__CLR4_5_2edtedtlvha7bn1.R.iget(19031)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(19032)==0&false))) {{
            __CLR4_5_2edtedtlvha7bn1.R.inc(19033);throw new StringIndexOutOfBoundsException("length must be valid");
        }
        }__CLR4_5_2edtedtlvha7bn1.R.inc(19034);if ((((length > 0)&&(__CLR4_5_2edtedtlvha7bn1.R.iget(19035)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(19036)==0&false))) {{
            __CLR4_5_2edtedtlvha7bn1.R.inc(19037);final int len = length();
            __CLR4_5_2edtedtlvha7bn1.R.inc(19038);ensureCapacity(len + length);
            __CLR4_5_2edtedtlvha7bn1.R.inc(19039);str.getChars(startIndex, startIndex + length, buffer, len);
            __CLR4_5_2edtedtlvha7bn1.R.inc(19040);size += length;
        }
        }__CLR4_5_2edtedtlvha7bn1.R.inc(19041);return this;
    }finally{__CLR4_5_2edtedtlvha7bn1.R.flushNeeded();}}

    /**
     * Appends a char array to the string builder.
     * Appending null will call {@link #appendNull()}.
     *
     * @param chars  the char array to append
     * @return this, to enable chaining
     */
    public StrBuilder append(final char[] chars) {try{__CLR4_5_2edtedtlvha7bn1.R.inc(19042);
        __CLR4_5_2edtedtlvha7bn1.R.inc(19043);if ((((chars == null)&&(__CLR4_5_2edtedtlvha7bn1.R.iget(19044)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(19045)==0&false))) {{
            __CLR4_5_2edtedtlvha7bn1.R.inc(19046);return appendNull();
        }
        }__CLR4_5_2edtedtlvha7bn1.R.inc(19047);final int strLen = chars.length;
        __CLR4_5_2edtedtlvha7bn1.R.inc(19048);if ((((strLen > 0)&&(__CLR4_5_2edtedtlvha7bn1.R.iget(19049)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(19050)==0&false))) {{
            __CLR4_5_2edtedtlvha7bn1.R.inc(19051);final int len = length();
            __CLR4_5_2edtedtlvha7bn1.R.inc(19052);ensureCapacity(len + strLen);
            __CLR4_5_2edtedtlvha7bn1.R.inc(19053);System.arraycopy(chars, 0, buffer, len, strLen);
            __CLR4_5_2edtedtlvha7bn1.R.inc(19054);size += strLen;
        }
        }__CLR4_5_2edtedtlvha7bn1.R.inc(19055);return this;
    }finally{__CLR4_5_2edtedtlvha7bn1.R.flushNeeded();}}

    /**
     * Appends a char array to the string builder.
     * Appending null will call {@link #appendNull()}.
     *
     * @param chars  the char array to append
     * @param startIndex  the start index, inclusive, must be valid
     * @param length  the length to append, must be valid
     * @return this, to enable chaining
     */
    public StrBuilder append(final char[] chars, final int startIndex, final int length) {try{__CLR4_5_2edtedtlvha7bn1.R.inc(19056);
        __CLR4_5_2edtedtlvha7bn1.R.inc(19057);if ((((chars == null)&&(__CLR4_5_2edtedtlvha7bn1.R.iget(19058)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(19059)==0&false))) {{
            __CLR4_5_2edtedtlvha7bn1.R.inc(19060);return appendNull();
        }
        }__CLR4_5_2edtedtlvha7bn1.R.inc(19061);if ((((startIndex < 0 || startIndex > chars.length)&&(__CLR4_5_2edtedtlvha7bn1.R.iget(19062)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(19063)==0&false))) {{
            __CLR4_5_2edtedtlvha7bn1.R.inc(19064);throw new StringIndexOutOfBoundsException("Invalid startIndex: " + length);
        }
        }__CLR4_5_2edtedtlvha7bn1.R.inc(19065);if ((((length < 0 || (startIndex + length) > chars.length)&&(__CLR4_5_2edtedtlvha7bn1.R.iget(19066)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(19067)==0&false))) {{
            __CLR4_5_2edtedtlvha7bn1.R.inc(19068);throw new StringIndexOutOfBoundsException("Invalid length: " + length);
        }
        }__CLR4_5_2edtedtlvha7bn1.R.inc(19069);if ((((length > 0)&&(__CLR4_5_2edtedtlvha7bn1.R.iget(19070)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(19071)==0&false))) {{
            __CLR4_5_2edtedtlvha7bn1.R.inc(19072);final int len = length();
            __CLR4_5_2edtedtlvha7bn1.R.inc(19073);ensureCapacity(len + length);
            __CLR4_5_2edtedtlvha7bn1.R.inc(19074);System.arraycopy(chars, startIndex, buffer, len, length);
            __CLR4_5_2edtedtlvha7bn1.R.inc(19075);size += length;
        }
        }__CLR4_5_2edtedtlvha7bn1.R.inc(19076);return this;
    }finally{__CLR4_5_2edtedtlvha7bn1.R.flushNeeded();}}

    /**
     * Appends a boolean value to the string builder.
     *
     * @param value  the value to append
     * @return this, to enable chaining
     */
    public StrBuilder append(final boolean value) {try{__CLR4_5_2edtedtlvha7bn1.R.inc(19077);
        __CLR4_5_2edtedtlvha7bn1.R.inc(19078);if ((((value)&&(__CLR4_5_2edtedtlvha7bn1.R.iget(19079)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(19080)==0&false))) {{
            __CLR4_5_2edtedtlvha7bn1.R.inc(19081);ensureCapacity(size + 4);
            __CLR4_5_2edtedtlvha7bn1.R.inc(19082);buffer[size++] = 't';
            __CLR4_5_2edtedtlvha7bn1.R.inc(19083);buffer[size++] = 'r';
            __CLR4_5_2edtedtlvha7bn1.R.inc(19084);buffer[size++] = 'u';
            __CLR4_5_2edtedtlvha7bn1.R.inc(19085);buffer[size++] = 'e';
        } }else {{
            __CLR4_5_2edtedtlvha7bn1.R.inc(19086);ensureCapacity(size + 5);
            __CLR4_5_2edtedtlvha7bn1.R.inc(19087);buffer[size++] = 'f';
            __CLR4_5_2edtedtlvha7bn1.R.inc(19088);buffer[size++] = 'a';
            __CLR4_5_2edtedtlvha7bn1.R.inc(19089);buffer[size++] = 'l';
            __CLR4_5_2edtedtlvha7bn1.R.inc(19090);buffer[size++] = 's';
            __CLR4_5_2edtedtlvha7bn1.R.inc(19091);buffer[size++] = 'e';
        }
        }__CLR4_5_2edtedtlvha7bn1.R.inc(19092);return this;
    }finally{__CLR4_5_2edtedtlvha7bn1.R.flushNeeded();}}

    /**
     * Appends a char value to the string builder.
     *
     * @param ch  the value to append
     * @return this, to enable chaining
     * @since 3.0
     */
    @Override
    public StrBuilder append(final char ch) {try{__CLR4_5_2edtedtlvha7bn1.R.inc(19093);
        __CLR4_5_2edtedtlvha7bn1.R.inc(19094);final int len = length();
        __CLR4_5_2edtedtlvha7bn1.R.inc(19095);ensureCapacity(len + 1);
        __CLR4_5_2edtedtlvha7bn1.R.inc(19096);buffer[size++] = ch;
        __CLR4_5_2edtedtlvha7bn1.R.inc(19097);return this;
    }finally{__CLR4_5_2edtedtlvha7bn1.R.flushNeeded();}}

    /**
     * Appends an int value to the string builder using <code>String.valueOf</code>.
     *
     * @param value  the value to append
     * @return this, to enable chaining
     */
    public StrBuilder append(final int value) {try{__CLR4_5_2edtedtlvha7bn1.R.inc(19098);
        __CLR4_5_2edtedtlvha7bn1.R.inc(19099);return append(String.valueOf(value));
    }finally{__CLR4_5_2edtedtlvha7bn1.R.flushNeeded();}}

    /**
     * Appends a long value to the string builder using <code>String.valueOf</code>.
     *
     * @param value  the value to append
     * @return this, to enable chaining
     */
    public StrBuilder append(final long value) {try{__CLR4_5_2edtedtlvha7bn1.R.inc(19100);
        __CLR4_5_2edtedtlvha7bn1.R.inc(19101);return append(String.valueOf(value));
    }finally{__CLR4_5_2edtedtlvha7bn1.R.flushNeeded();}}

    /**
     * Appends a float value to the string builder using <code>String.valueOf</code>.
     *
     * @param value  the value to append
     * @return this, to enable chaining
     */
    public StrBuilder append(final float value) {try{__CLR4_5_2edtedtlvha7bn1.R.inc(19102);
        __CLR4_5_2edtedtlvha7bn1.R.inc(19103);return append(String.valueOf(value));
    }finally{__CLR4_5_2edtedtlvha7bn1.R.flushNeeded();}}

    /**
     * Appends a double value to the string builder using <code>String.valueOf</code>.
     *
     * @param value  the value to append
     * @return this, to enable chaining
     */
    public StrBuilder append(final double value) {try{__CLR4_5_2edtedtlvha7bn1.R.inc(19104);
        __CLR4_5_2edtedtlvha7bn1.R.inc(19105);return append(String.valueOf(value));
    }finally{__CLR4_5_2edtedtlvha7bn1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Appends an object followed by a new line to this string builder.
     * Appending null will call {@link #appendNull()}.
     *
     * @param obj  the object to append
     * @return this, to enable chaining
     * @since 2.3
     */
    public StrBuilder appendln(final Object obj) {try{__CLR4_5_2edtedtlvha7bn1.R.inc(19106);
        __CLR4_5_2edtedtlvha7bn1.R.inc(19107);return append(obj).appendNewLine();
    }finally{__CLR4_5_2edtedtlvha7bn1.R.flushNeeded();}}

    /**
     * Appends a string followed by a new line to this string builder.
     * Appending null will call {@link #appendNull()}.
     *
     * @param str  the string to append
     * @return this, to enable chaining
     * @since 2.3
     */
    public StrBuilder appendln(final String str) {try{__CLR4_5_2edtedtlvha7bn1.R.inc(19108);
        __CLR4_5_2edtedtlvha7bn1.R.inc(19109);return append(str).appendNewLine();
    }finally{__CLR4_5_2edtedtlvha7bn1.R.flushNeeded();}}

    /**
     * Appends part of a string followed by a new line to this string builder.
     * Appending null will call {@link #appendNull()}.
     *
     * @param str  the string to append
     * @param startIndex  the start index, inclusive, must be valid
     * @param length  the length to append, must be valid
     * @return this, to enable chaining
     * @since 2.3
     */
    public StrBuilder appendln(final String str, final int startIndex, final int length) {try{__CLR4_5_2edtedtlvha7bn1.R.inc(19110);
        __CLR4_5_2edtedtlvha7bn1.R.inc(19111);return append(str, startIndex, length).appendNewLine();
    }finally{__CLR4_5_2edtedtlvha7bn1.R.flushNeeded();}}

    /**
     * Calls {@link String#format(String, Object...)} and appends the result.
     *
     * @param format the format string
     * @param objs the objects to use in the format string
     * @return {@code this} to enable chaining
     * @see String#format(String, Object...)
     * @since 3.2
     */
    public StrBuilder appendln(final String format, final Object... objs) {try{__CLR4_5_2edtedtlvha7bn1.R.inc(19112);
        __CLR4_5_2edtedtlvha7bn1.R.inc(19113);return append(format, objs).appendNewLine();
    }finally{__CLR4_5_2edtedtlvha7bn1.R.flushNeeded();}}

    /**
     * Appends a string buffer followed by a new line to this string builder.
     * Appending null will call {@link #appendNull()}.
     *
     * @param str  the string buffer to append
     * @return this, to enable chaining
     * @since 2.3
     */
    public StrBuilder appendln(final StringBuffer str) {try{__CLR4_5_2edtedtlvha7bn1.R.inc(19114);
        __CLR4_5_2edtedtlvha7bn1.R.inc(19115);return append(str).appendNewLine();
    }finally{__CLR4_5_2edtedtlvha7bn1.R.flushNeeded();}}

    /**
     * Appends a string builder followed by a new line to this string builder.
     * Appending null will call {@link #appendNull()}.
     *
     * @param str  the string builder to append
     * @return this, to enable chaining
     * @since 3.2
     */
    public StrBuilder appendln(final StringBuilder str) {try{__CLR4_5_2edtedtlvha7bn1.R.inc(19116);
        __CLR4_5_2edtedtlvha7bn1.R.inc(19117);return append(str).appendNewLine();
    }finally{__CLR4_5_2edtedtlvha7bn1.R.flushNeeded();}}

    /**
     * Appends part of a string builder followed by a new line to this string builder.
     * Appending null will call {@link #appendNull()}.
     *
     * @param str  the string builder to append
     * @param startIndex  the start index, inclusive, must be valid
     * @param length  the length to append, must be valid
     * @return this, to enable chaining
     * @since 3.2
     */
    public StrBuilder appendln(final StringBuilder str, final int startIndex, final int length) {try{__CLR4_5_2edtedtlvha7bn1.R.inc(19118);
        __CLR4_5_2edtedtlvha7bn1.R.inc(19119);return append(str, startIndex, length).appendNewLine();
    }finally{__CLR4_5_2edtedtlvha7bn1.R.flushNeeded();}}

    /**
     * Appends part of a string buffer followed by a new line to this string builder.
     * Appending null will call {@link #appendNull()}.
     *
     * @param str  the string to append
     * @param startIndex  the start index, inclusive, must be valid
     * @param length  the length to append, must be valid
     * @return this, to enable chaining
     * @since 2.3
     */
    public StrBuilder appendln(final StringBuffer str, final int startIndex, final int length) {try{__CLR4_5_2edtedtlvha7bn1.R.inc(19120);
        __CLR4_5_2edtedtlvha7bn1.R.inc(19121);return append(str, startIndex, length).appendNewLine();
    }finally{__CLR4_5_2edtedtlvha7bn1.R.flushNeeded();}}

    /**
     * Appends another string builder followed by a new line to this string builder.
     * Appending null will call {@link #appendNull()}.
     *
     * @param str  the string builder to append
     * @return this, to enable chaining
     * @since 2.3
     */
    public StrBuilder appendln(final StrBuilder str) {try{__CLR4_5_2edtedtlvha7bn1.R.inc(19122);
        __CLR4_5_2edtedtlvha7bn1.R.inc(19123);return append(str).appendNewLine();
    }finally{__CLR4_5_2edtedtlvha7bn1.R.flushNeeded();}}

    /**
     * Appends part of a string builder followed by a new line to this string builder.
     * Appending null will call {@link #appendNull()}.
     *
     * @param str  the string to append
     * @param startIndex  the start index, inclusive, must be valid
     * @param length  the length to append, must be valid
     * @return this, to enable chaining
     * @since 2.3
     */
    public StrBuilder appendln(final StrBuilder str, final int startIndex, final int length) {try{__CLR4_5_2edtedtlvha7bn1.R.inc(19124);
        __CLR4_5_2edtedtlvha7bn1.R.inc(19125);return append(str, startIndex, length).appendNewLine();
    }finally{__CLR4_5_2edtedtlvha7bn1.R.flushNeeded();}}

    /**
     * Appends a char array followed by a new line to the string builder.
     * Appending null will call {@link #appendNull()}.
     *
     * @param chars  the char array to append
     * @return this, to enable chaining
     * @since 2.3
     */
    public StrBuilder appendln(final char[] chars) {try{__CLR4_5_2edtedtlvha7bn1.R.inc(19126);
        __CLR4_5_2edtedtlvha7bn1.R.inc(19127);return append(chars).appendNewLine();
    }finally{__CLR4_5_2edtedtlvha7bn1.R.flushNeeded();}}

    /**
     * Appends a char array followed by a new line to the string builder.
     * Appending null will call {@link #appendNull()}.
     *
     * @param chars  the char array to append
     * @param startIndex  the start index, inclusive, must be valid
     * @param length  the length to append, must be valid
     * @return this, to enable chaining
     * @since 2.3
     */
    public StrBuilder appendln(final char[] chars, final int startIndex, final int length) {try{__CLR4_5_2edtedtlvha7bn1.R.inc(19128);
        __CLR4_5_2edtedtlvha7bn1.R.inc(19129);return append(chars, startIndex, length).appendNewLine();
    }finally{__CLR4_5_2edtedtlvha7bn1.R.flushNeeded();}}

    /**
     * Appends a boolean value followed by a new line to the string builder.
     *
     * @param value  the value to append
     * @return this, to enable chaining
     * @since 2.3
     */
    public StrBuilder appendln(final boolean value) {try{__CLR4_5_2edtedtlvha7bn1.R.inc(19130);
        __CLR4_5_2edtedtlvha7bn1.R.inc(19131);return append(value).appendNewLine();
    }finally{__CLR4_5_2edtedtlvha7bn1.R.flushNeeded();}}

    /**
     * Appends a char value followed by a new line to the string builder.
     *
     * @param ch  the value to append
     * @return this, to enable chaining
     * @since 2.3
     */
    public StrBuilder appendln(final char ch) {try{__CLR4_5_2edtedtlvha7bn1.R.inc(19132);
        __CLR4_5_2edtedtlvha7bn1.R.inc(19133);return append(ch).appendNewLine();
    }finally{__CLR4_5_2edtedtlvha7bn1.R.flushNeeded();}}

    /**
     * Appends an int value followed by a new line to the string builder using <code>String.valueOf</code>.
     *
     * @param value  the value to append
     * @return this, to enable chaining
     * @since 2.3
     */
    public StrBuilder appendln(final int value) {try{__CLR4_5_2edtedtlvha7bn1.R.inc(19134);
        __CLR4_5_2edtedtlvha7bn1.R.inc(19135);return append(value).appendNewLine();
    }finally{__CLR4_5_2edtedtlvha7bn1.R.flushNeeded();}}

    /**
     * Appends a long value followed by a new line to the string builder using <code>String.valueOf</code>.
     *
     * @param value  the value to append
     * @return this, to enable chaining
     * @since 2.3
     */
    public StrBuilder appendln(final long value) {try{__CLR4_5_2edtedtlvha7bn1.R.inc(19136);
        __CLR4_5_2edtedtlvha7bn1.R.inc(19137);return append(value).appendNewLine();
    }finally{__CLR4_5_2edtedtlvha7bn1.R.flushNeeded();}}

    /**
     * Appends a float value followed by a new line to the string builder using <code>String.valueOf</code>.
     *
     * @param value  the value to append
     * @return this, to enable chaining
     * @since 2.3
     */
    public StrBuilder appendln(final float value) {try{__CLR4_5_2edtedtlvha7bn1.R.inc(19138);
        __CLR4_5_2edtedtlvha7bn1.R.inc(19139);return append(value).appendNewLine();
    }finally{__CLR4_5_2edtedtlvha7bn1.R.flushNeeded();}}

    /**
     * Appends a double value followed by a new line to the string builder using <code>String.valueOf</code>.
     *
     * @param value  the value to append
     * @return this, to enable chaining
     * @since 2.3
     */
    public StrBuilder appendln(final double value) {try{__CLR4_5_2edtedtlvha7bn1.R.inc(19140);
        __CLR4_5_2edtedtlvha7bn1.R.inc(19141);return append(value).appendNewLine();
    }finally{__CLR4_5_2edtedtlvha7bn1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Appends each item in an array to the builder without any separators.
     * Appending a null array will have no effect.
     * Each object is appended using {@link #append(Object)}.
     *
     * @param <T>  the element type
     * @param array  the array to append
     * @return this, to enable chaining
     * @since 2.3
     */
    public <T> StrBuilder appendAll(@SuppressWarnings("unchecked") final T... array) {try{__CLR4_5_2edtedtlvha7bn1.R.inc(19142);
        /*
         * @SuppressWarnings used to hide warning about vararg usage. We cannot
         * use @SafeVarargs, since this method is not final. Using @SupressWarnings
         * is fine, because it isn't inherited by subclasses, so each subclass must
         * vouch for itself whether its use of 'array' is safe.
         */
        __CLR4_5_2edtedtlvha7bn1.R.inc(19143);if ((((array != null && array.length > 0)&&(__CLR4_5_2edtedtlvha7bn1.R.iget(19144)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(19145)==0&false))) {{
            __CLR4_5_2edtedtlvha7bn1.R.inc(19146);for (final Object element : array) {{
                __CLR4_5_2edtedtlvha7bn1.R.inc(19147);append(element);
            }
        }}
        }__CLR4_5_2edtedtlvha7bn1.R.inc(19148);return this;
    }finally{__CLR4_5_2edtedtlvha7bn1.R.flushNeeded();}}

    /**
     * Appends each item in an iterable to the builder without any separators.
     * Appending a null iterable will have no effect.
     * Each object is appended using {@link #append(Object)}.
     *
     * @param iterable  the iterable to append
     * @return this, to enable chaining
     * @since 2.3
     */
    public StrBuilder appendAll(final Iterable<?> iterable) {try{__CLR4_5_2edtedtlvha7bn1.R.inc(19149);
        __CLR4_5_2edtedtlvha7bn1.R.inc(19150);if ((((iterable != null)&&(__CLR4_5_2edtedtlvha7bn1.R.iget(19151)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(19152)==0&false))) {{
            __CLR4_5_2edtedtlvha7bn1.R.inc(19153);for (final Object o : iterable) {{
                __CLR4_5_2edtedtlvha7bn1.R.inc(19154);append(o);
            }
        }}
        }__CLR4_5_2edtedtlvha7bn1.R.inc(19155);return this;
    }finally{__CLR4_5_2edtedtlvha7bn1.R.flushNeeded();}}

    /**
     * Appends each item in an iterator to the builder without any separators.
     * Appending a null iterator will have no effect.
     * Each object is appended using {@link #append(Object)}.
     *
     * @param it  the iterator to append
     * @return this, to enable chaining
     * @since 2.3
     */
    public StrBuilder appendAll(final Iterator<?> it) {try{__CLR4_5_2edtedtlvha7bn1.R.inc(19156);
        __CLR4_5_2edtedtlvha7bn1.R.inc(19157);if ((((it != null)&&(__CLR4_5_2edtedtlvha7bn1.R.iget(19158)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(19159)==0&false))) {{
            __CLR4_5_2edtedtlvha7bn1.R.inc(19160);while ((((it.hasNext())&&(__CLR4_5_2edtedtlvha7bn1.R.iget(19161)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(19162)==0&false))) {{
                __CLR4_5_2edtedtlvha7bn1.R.inc(19163);append(it.next());
            }
        }}
        }__CLR4_5_2edtedtlvha7bn1.R.inc(19164);return this;
    }finally{__CLR4_5_2edtedtlvha7bn1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Appends an array placing separators between each value, but
     * not before the first or after the last.
     * Appending a null array will have no effect.
     * Each object is appended using {@link #append(Object)}.
     *
     * @param array  the array to append
     * @param separator  the separator to use, null means no separator
     * @return this, to enable chaining
     */
    public StrBuilder appendWithSeparators(final Object[] array, final String separator) {try{__CLR4_5_2edtedtlvha7bn1.R.inc(19165);
        __CLR4_5_2edtedtlvha7bn1.R.inc(19166);if ((((array != null && array.length > 0)&&(__CLR4_5_2edtedtlvha7bn1.R.iget(19167)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(19168)==0&false))) {{
            __CLR4_5_2edtedtlvha7bn1.R.inc(19169);final String sep = Objects.toString(separator, "");
            __CLR4_5_2edtedtlvha7bn1.R.inc(19170);append(array[0]);
            __CLR4_5_2edtedtlvha7bn1.R.inc(19171);for (int i = 1; (((i < array.length)&&(__CLR4_5_2edtedtlvha7bn1.R.iget(19172)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(19173)==0&false)); i++) {{
                __CLR4_5_2edtedtlvha7bn1.R.inc(19174);append(sep);
                __CLR4_5_2edtedtlvha7bn1.R.inc(19175);append(array[i]);
            }
        }}
        }__CLR4_5_2edtedtlvha7bn1.R.inc(19176);return this;
    }finally{__CLR4_5_2edtedtlvha7bn1.R.flushNeeded();}}

    /**
     * Appends an iterable placing separators between each value, but
     * not before the first or after the last.
     * Appending a null iterable will have no effect.
     * Each object is appended using {@link #append(Object)}.
     *
     * @param iterable  the iterable to append
     * @param separator  the separator to use, null means no separator
     * @return this, to enable chaining
     */
    public StrBuilder appendWithSeparators(final Iterable<?> iterable, final String separator) {try{__CLR4_5_2edtedtlvha7bn1.R.inc(19177);
        __CLR4_5_2edtedtlvha7bn1.R.inc(19178);if ((((iterable != null)&&(__CLR4_5_2edtedtlvha7bn1.R.iget(19179)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(19180)==0&false))) {{
            __CLR4_5_2edtedtlvha7bn1.R.inc(19181);final String sep = Objects.toString(separator, "");
            __CLR4_5_2edtedtlvha7bn1.R.inc(19182);final Iterator<?> it = iterable.iterator();
            __CLR4_5_2edtedtlvha7bn1.R.inc(19183);while ((((it.hasNext())&&(__CLR4_5_2edtedtlvha7bn1.R.iget(19184)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(19185)==0&false))) {{
                __CLR4_5_2edtedtlvha7bn1.R.inc(19186);append(it.next());
                __CLR4_5_2edtedtlvha7bn1.R.inc(19187);if ((((it.hasNext())&&(__CLR4_5_2edtedtlvha7bn1.R.iget(19188)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(19189)==0&false))) {{
                    __CLR4_5_2edtedtlvha7bn1.R.inc(19190);append(sep);
                }
            }}
        }}
        }__CLR4_5_2edtedtlvha7bn1.R.inc(19191);return this;
    }finally{__CLR4_5_2edtedtlvha7bn1.R.flushNeeded();}}

    /**
     * Appends an iterator placing separators between each value, but
     * not before the first or after the last.
     * Appending a null iterator will have no effect.
     * Each object is appended using {@link #append(Object)}.
     *
     * @param it  the iterator to append
     * @param separator  the separator to use, null means no separator
     * @return this, to enable chaining
     */
    public StrBuilder appendWithSeparators(final Iterator<?> it, final String separator) {try{__CLR4_5_2edtedtlvha7bn1.R.inc(19192);
        __CLR4_5_2edtedtlvha7bn1.R.inc(19193);if ((((it != null)&&(__CLR4_5_2edtedtlvha7bn1.R.iget(19194)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(19195)==0&false))) {{
            __CLR4_5_2edtedtlvha7bn1.R.inc(19196);final String sep = Objects.toString(separator, "");
            __CLR4_5_2edtedtlvha7bn1.R.inc(19197);while ((((it.hasNext())&&(__CLR4_5_2edtedtlvha7bn1.R.iget(19198)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(19199)==0&false))) {{
                __CLR4_5_2edtedtlvha7bn1.R.inc(19200);append(it.next());
                __CLR4_5_2edtedtlvha7bn1.R.inc(19201);if ((((it.hasNext())&&(__CLR4_5_2edtedtlvha7bn1.R.iget(19202)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(19203)==0&false))) {{
                    __CLR4_5_2edtedtlvha7bn1.R.inc(19204);append(sep);
                }
            }}
        }}
        }__CLR4_5_2edtedtlvha7bn1.R.inc(19205);return this;
    }finally{__CLR4_5_2edtedtlvha7bn1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Appends a separator if the builder is currently non-empty.
     * Appending a null separator will have no effect.
     * The separator is appended using {@link #append(String)}.
     * <p>
     * This method is useful for adding a separator each time around the
     * loop except the first.
     * <pre>
     * for (Iterator it = list.iterator(); it.hasNext(); ) {
     *   appendSeparator(",");
     *   append(it.next());
     * }
     * </pre>
     * Note that for this simple example, you should use
     * {@link #appendWithSeparators(Iterable, String)}.
     * 
     * @param separator  the separator to use, null means no separator
     * @return this, to enable chaining
     * @since 2.3
     */
    public StrBuilder appendSeparator(final String separator) {try{__CLR4_5_2edtedtlvha7bn1.R.inc(19206);
        __CLR4_5_2edtedtlvha7bn1.R.inc(19207);return appendSeparator(separator, null);
    }finally{__CLR4_5_2edtedtlvha7bn1.R.flushNeeded();}}

    /**
     * Appends one of both separators to the StrBuilder.
     * If the builder is currently empty it will append the defaultIfEmpty-separator
     * Otherwise it will append the standard-separator
     * 
     * Appending a null separator will have no effect.
     * The separator is appended using {@link #append(String)}.
     * <p>
     * This method is for example useful for constructing queries
     * <pre>
     * StrBuilder whereClause = new StrBuilder();
     * if(searchCommand.getPriority() != null) {
     *  whereClause.appendSeparator(" and", " where");
     *  whereClause.append(" priority = ?")
     * }
     * if(searchCommand.getComponent() != null) {
     *  whereClause.appendSeparator(" and", " where");
     *  whereClause.append(" component = ?")
     * }
     * selectClause.append(whereClause)
     * </pre>
     * 
     * @param standard the separator if builder is not empty, null means no separator
     * @param defaultIfEmpty the separator if builder is empty, null means no separator
     * @return this, to enable chaining
     * @since 2.5
     */
    public StrBuilder appendSeparator(final String standard, final String defaultIfEmpty) {try{__CLR4_5_2edtedtlvha7bn1.R.inc(19208);
        __CLR4_5_2edtedtlvha7bn1.R.inc(19209);final String str = (((isEmpty() )&&(__CLR4_5_2edtedtlvha7bn1.R.iget(19210)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(19211)==0&false))? defaultIfEmpty : standard;
        __CLR4_5_2edtedtlvha7bn1.R.inc(19212);if ((((str != null)&&(__CLR4_5_2edtedtlvha7bn1.R.iget(19213)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(19214)==0&false))) {{
            __CLR4_5_2edtedtlvha7bn1.R.inc(19215);append(str);
        }
        }__CLR4_5_2edtedtlvha7bn1.R.inc(19216);return this;
    }finally{__CLR4_5_2edtedtlvha7bn1.R.flushNeeded();}}

    /**
     * Appends a separator if the builder is currently non-empty.
     * The separator is appended using {@link #append(char)}.
     * <p>
     * This method is useful for adding a separator each time around the
     * loop except the first.
     * <pre>
     * for (Iterator it = list.iterator(); it.hasNext(); ) {
     *   appendSeparator(',');
     *   append(it.next());
     * }
     * </pre>
     * Note that for this simple example, you should use
     * {@link #appendWithSeparators(Iterable, String)}.
     * 
     * @param separator  the separator to use
     * @return this, to enable chaining
     * @since 2.3
     */
    public StrBuilder appendSeparator(final char separator) {try{__CLR4_5_2edtedtlvha7bn1.R.inc(19217);
        __CLR4_5_2edtedtlvha7bn1.R.inc(19218);if ((((size() > 0)&&(__CLR4_5_2edtedtlvha7bn1.R.iget(19219)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(19220)==0&false))) {{
            __CLR4_5_2edtedtlvha7bn1.R.inc(19221);append(separator);
        }
        }__CLR4_5_2edtedtlvha7bn1.R.inc(19222);return this;
    }finally{__CLR4_5_2edtedtlvha7bn1.R.flushNeeded();}}

    /**
     * Append one of both separators to the builder
     * If the builder is currently empty it will append the defaultIfEmpty-separator
     * Otherwise it will append the standard-separator
     *
     * The separator is appended using {@link #append(char)}.
     * @param standard the separator if builder is not empty
     * @param defaultIfEmpty the separator if builder is empty
     * @return this, to enable chaining
     * @since 2.5
     */
    public StrBuilder appendSeparator(final char standard, final char defaultIfEmpty) {try{__CLR4_5_2edtedtlvha7bn1.R.inc(19223);
        __CLR4_5_2edtedtlvha7bn1.R.inc(19224);if ((((size() > 0)&&(__CLR4_5_2edtedtlvha7bn1.R.iget(19225)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(19226)==0&false))) {{
            __CLR4_5_2edtedtlvha7bn1.R.inc(19227);append(standard);
        } }else {{
            __CLR4_5_2edtedtlvha7bn1.R.inc(19228);append(defaultIfEmpty);
        }
        }__CLR4_5_2edtedtlvha7bn1.R.inc(19229);return this;
    }finally{__CLR4_5_2edtedtlvha7bn1.R.flushNeeded();}}
    /**
     * Appends a separator to the builder if the loop index is greater than zero.
     * Appending a null separator will have no effect.
     * The separator is appended using {@link #append(String)}.
     * <p>
     * This method is useful for adding a separator each time around the
     * loop except the first.
     * </p>
     * <pre>
     * for (int i = 0; i &lt; list.size(); i++) {
     *   appendSeparator(",", i);
     *   append(list.get(i));
     * }
     * </pre>
     * Note that for this simple example, you should use
     * {@link #appendWithSeparators(Iterable, String)}.
     * 
     * @param separator  the separator to use, null means no separator
     * @param loopIndex  the loop index
     * @return this, to enable chaining
     * @since 2.3
     */
    public StrBuilder appendSeparator(final String separator, final int loopIndex) {try{__CLR4_5_2edtedtlvha7bn1.R.inc(19230);
        __CLR4_5_2edtedtlvha7bn1.R.inc(19231);if ((((separator != null && loopIndex > 0)&&(__CLR4_5_2edtedtlvha7bn1.R.iget(19232)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(19233)==0&false))) {{
            __CLR4_5_2edtedtlvha7bn1.R.inc(19234);append(separator);
        }
        }__CLR4_5_2edtedtlvha7bn1.R.inc(19235);return this;
    }finally{__CLR4_5_2edtedtlvha7bn1.R.flushNeeded();}}

    /**
     * Appends a separator to the builder if the loop index is greater than zero.
     * The separator is appended using {@link #append(char)}.
     * <p>
     * This method is useful for adding a separator each time around the
     * loop except the first.
     * </p>
     * <pre>
     * for (int i = 0; i &lt; list.size(); i++) {
     *   appendSeparator(",", i);
     *   append(list.get(i));
     * }
     * </pre>
     * Note that for this simple example, you should use
     * {@link #appendWithSeparators(Iterable, String)}.
     * 
     * @param separator  the separator to use
     * @param loopIndex  the loop index
     * @return this, to enable chaining
     * @since 2.3
     */
    public StrBuilder appendSeparator(final char separator, final int loopIndex) {try{__CLR4_5_2edtedtlvha7bn1.R.inc(19236);
        __CLR4_5_2edtedtlvha7bn1.R.inc(19237);if ((((loopIndex > 0)&&(__CLR4_5_2edtedtlvha7bn1.R.iget(19238)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(19239)==0&false))) {{
            __CLR4_5_2edtedtlvha7bn1.R.inc(19240);append(separator);
        }
        }__CLR4_5_2edtedtlvha7bn1.R.inc(19241);return this;
    }finally{__CLR4_5_2edtedtlvha7bn1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Appends the pad character to the builder the specified number of times.
     * 
     * @param length  the length to append, negative means no append
     * @param padChar  the character to append
     * @return this, to enable chaining
     */
    public StrBuilder appendPadding(final int length, final char padChar) {try{__CLR4_5_2edtedtlvha7bn1.R.inc(19242);
        __CLR4_5_2edtedtlvha7bn1.R.inc(19243);if ((((length >= 0)&&(__CLR4_5_2edtedtlvha7bn1.R.iget(19244)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(19245)==0&false))) {{
            __CLR4_5_2edtedtlvha7bn1.R.inc(19246);ensureCapacity(size + length);
            __CLR4_5_2edtedtlvha7bn1.R.inc(19247);for (int i = 0; (((i < length)&&(__CLR4_5_2edtedtlvha7bn1.R.iget(19248)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(19249)==0&false)); i++) {{
                __CLR4_5_2edtedtlvha7bn1.R.inc(19250);buffer[size++] = padChar;
            }
        }}
        }__CLR4_5_2edtedtlvha7bn1.R.inc(19251);return this;
    }finally{__CLR4_5_2edtedtlvha7bn1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Appends an object to the builder padding on the left to a fixed width.
     * The <code>toString</code> of the object is used.
     * If the object is larger than the length, the left hand side is lost.
     * If the object is null, the null text value is used.
     * 
     * @param obj  the object to append, null uses null text
     * @param width  the fixed field width, zero or negative has no effect
     * @param padChar  the pad character to use
     * @return this, to enable chaining
     */
    public StrBuilder appendFixedWidthPadLeft(final Object obj, final int width, final char padChar) {try{__CLR4_5_2edtedtlvha7bn1.R.inc(19252);
        __CLR4_5_2edtedtlvha7bn1.R.inc(19253);if ((((width > 0)&&(__CLR4_5_2edtedtlvha7bn1.R.iget(19254)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(19255)==0&false))) {{
            __CLR4_5_2edtedtlvha7bn1.R.inc(19256);ensureCapacity(size + width);
            __CLR4_5_2edtedtlvha7bn1.R.inc(19257);String str = ((((obj == null )&&(__CLR4_5_2edtedtlvha7bn1.R.iget(19258)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(19259)==0&false))? getNullText() : obj.toString());
            __CLR4_5_2edtedtlvha7bn1.R.inc(19260);if ((((str == null)&&(__CLR4_5_2edtedtlvha7bn1.R.iget(19261)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(19262)==0&false))) {{
                __CLR4_5_2edtedtlvha7bn1.R.inc(19263);str = StringUtils.EMPTY;
            }
            }__CLR4_5_2edtedtlvha7bn1.R.inc(19264);final int strLen = str.length();
            __CLR4_5_2edtedtlvha7bn1.R.inc(19265);if ((((strLen >= width)&&(__CLR4_5_2edtedtlvha7bn1.R.iget(19266)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(19267)==0&false))) {{
                __CLR4_5_2edtedtlvha7bn1.R.inc(19268);str.getChars(strLen - width, strLen, buffer, size);
            } }else {{
                __CLR4_5_2edtedtlvha7bn1.R.inc(19269);final int padLen = width - strLen;
                __CLR4_5_2edtedtlvha7bn1.R.inc(19270);for (int i = 0; (((i < padLen)&&(__CLR4_5_2edtedtlvha7bn1.R.iget(19271)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(19272)==0&false)); i++) {{
                    __CLR4_5_2edtedtlvha7bn1.R.inc(19273);buffer[size + i] = padChar;
                }
                }__CLR4_5_2edtedtlvha7bn1.R.inc(19274);str.getChars(0, strLen, buffer, size + padLen);
            }
            }__CLR4_5_2edtedtlvha7bn1.R.inc(19275);size += width;
        }
        }__CLR4_5_2edtedtlvha7bn1.R.inc(19276);return this;
    }finally{__CLR4_5_2edtedtlvha7bn1.R.flushNeeded();}}

    /**
     * Appends an object to the builder padding on the left to a fixed width.
     * The <code>String.valueOf</code> of the <code>int</code> value is used.
     * If the formatted value is larger than the length, the left hand side is lost.
     * 
     * @param value  the value to append
     * @param width  the fixed field width, zero or negative has no effect
     * @param padChar  the pad character to use
     * @return this, to enable chaining
     */
    public StrBuilder appendFixedWidthPadLeft(final int value, final int width, final char padChar) {try{__CLR4_5_2edtedtlvha7bn1.R.inc(19277);
        __CLR4_5_2edtedtlvha7bn1.R.inc(19278);return appendFixedWidthPadLeft(String.valueOf(value), width, padChar);
    }finally{__CLR4_5_2edtedtlvha7bn1.R.flushNeeded();}}

    /**
     * Appends an object to the builder padding on the right to a fixed length.
     * The <code>toString</code> of the object is used.
     * If the object is larger than the length, the right hand side is lost.
     * If the object is null, null text value is used.
     * 
     * @param obj  the object to append, null uses null text
     * @param width  the fixed field width, zero or negative has no effect
     * @param padChar  the pad character to use
     * @return this, to enable chaining
     */
    public StrBuilder appendFixedWidthPadRight(final Object obj, final int width, final char padChar) {try{__CLR4_5_2edtedtlvha7bn1.R.inc(19279);
        __CLR4_5_2edtedtlvha7bn1.R.inc(19280);if ((((width > 0)&&(__CLR4_5_2edtedtlvha7bn1.R.iget(19281)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(19282)==0&false))) {{
            __CLR4_5_2edtedtlvha7bn1.R.inc(19283);ensureCapacity(size + width);
            __CLR4_5_2edtedtlvha7bn1.R.inc(19284);String str = ((((obj == null )&&(__CLR4_5_2edtedtlvha7bn1.R.iget(19285)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(19286)==0&false))? getNullText() : obj.toString());
            __CLR4_5_2edtedtlvha7bn1.R.inc(19287);if ((((str == null)&&(__CLR4_5_2edtedtlvha7bn1.R.iget(19288)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(19289)==0&false))) {{
                __CLR4_5_2edtedtlvha7bn1.R.inc(19290);str = StringUtils.EMPTY;
            }
            }__CLR4_5_2edtedtlvha7bn1.R.inc(19291);final int strLen = str.length();
            __CLR4_5_2edtedtlvha7bn1.R.inc(19292);if ((((strLen >= width)&&(__CLR4_5_2edtedtlvha7bn1.R.iget(19293)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(19294)==0&false))) {{
                __CLR4_5_2edtedtlvha7bn1.R.inc(19295);str.getChars(0, width, buffer, size);
            } }else {{
                __CLR4_5_2edtedtlvha7bn1.R.inc(19296);final int padLen = width - strLen;
                __CLR4_5_2edtedtlvha7bn1.R.inc(19297);str.getChars(0, strLen, buffer, size);
                __CLR4_5_2edtedtlvha7bn1.R.inc(19298);for (int i = 0; (((i < padLen)&&(__CLR4_5_2edtedtlvha7bn1.R.iget(19299)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(19300)==0&false)); i++) {{
                    __CLR4_5_2edtedtlvha7bn1.R.inc(19301);buffer[size + strLen + i] = padChar;
                }
            }}
            }__CLR4_5_2edtedtlvha7bn1.R.inc(19302);size += width;
        }
        }__CLR4_5_2edtedtlvha7bn1.R.inc(19303);return this;
    }finally{__CLR4_5_2edtedtlvha7bn1.R.flushNeeded();}}

    /**
     * Appends an object to the builder padding on the right to a fixed length.
     * The <code>String.valueOf</code> of the <code>int</code> value is used.
     * If the object is larger than the length, the right hand side is lost.
     * 
     * @param value  the value to append
     * @param width  the fixed field width, zero or negative has no effect
     * @param padChar  the pad character to use
     * @return this, to enable chaining
     */
    public StrBuilder appendFixedWidthPadRight(final int value, final int width, final char padChar) {try{__CLR4_5_2edtedtlvha7bn1.R.inc(19304);
        __CLR4_5_2edtedtlvha7bn1.R.inc(19305);return appendFixedWidthPadRight(String.valueOf(value), width, padChar);
    }finally{__CLR4_5_2edtedtlvha7bn1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Inserts the string representation of an object into this builder.
     * Inserting null will use the stored null text value.
     *
     * @param index  the index to add at, must be valid
     * @param obj  the object to insert
     * @return this, to enable chaining
     * @throws IndexOutOfBoundsException if the index is invalid
     */
    public StrBuilder insert(final int index, final Object obj) {try{__CLR4_5_2edtedtlvha7bn1.R.inc(19306);
        __CLR4_5_2edtedtlvha7bn1.R.inc(19307);if ((((obj == null)&&(__CLR4_5_2edtedtlvha7bn1.R.iget(19308)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(19309)==0&false))) {{
            __CLR4_5_2edtedtlvha7bn1.R.inc(19310);return insert(index, nullText);
        }
        }__CLR4_5_2edtedtlvha7bn1.R.inc(19311);return insert(index, obj.toString());
    }finally{__CLR4_5_2edtedtlvha7bn1.R.flushNeeded();}}

    /**
     * Inserts the string into this builder.
     * Inserting null will use the stored null text value.
     *
     * @param index  the index to add at, must be valid
     * @param str  the string to insert
     * @return this, to enable chaining
     * @throws IndexOutOfBoundsException if the index is invalid
     */
    public StrBuilder insert(final int index, String str) {try{__CLR4_5_2edtedtlvha7bn1.R.inc(19312);
        __CLR4_5_2edtedtlvha7bn1.R.inc(19313);validateIndex(index);
        __CLR4_5_2edtedtlvha7bn1.R.inc(19314);if ((((str == null)&&(__CLR4_5_2edtedtlvha7bn1.R.iget(19315)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(19316)==0&false))) {{
            __CLR4_5_2edtedtlvha7bn1.R.inc(19317);str = nullText;
        }
        }__CLR4_5_2edtedtlvha7bn1.R.inc(19318);if ((((str != null)&&(__CLR4_5_2edtedtlvha7bn1.R.iget(19319)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(19320)==0&false))) {{
            __CLR4_5_2edtedtlvha7bn1.R.inc(19321);final int strLen = str.length();
            __CLR4_5_2edtedtlvha7bn1.R.inc(19322);if ((((strLen > 0)&&(__CLR4_5_2edtedtlvha7bn1.R.iget(19323)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(19324)==0&false))) {{
                __CLR4_5_2edtedtlvha7bn1.R.inc(19325);final int newSize = size + strLen;
                __CLR4_5_2edtedtlvha7bn1.R.inc(19326);ensureCapacity(newSize);
                __CLR4_5_2edtedtlvha7bn1.R.inc(19327);System.arraycopy(buffer, index, buffer, index + strLen, size - index);
                __CLR4_5_2edtedtlvha7bn1.R.inc(19328);size = newSize;
                __CLR4_5_2edtedtlvha7bn1.R.inc(19329);str.getChars(0, strLen, buffer, index);
            }
        }}
        }__CLR4_5_2edtedtlvha7bn1.R.inc(19330);return this;
    }finally{__CLR4_5_2edtedtlvha7bn1.R.flushNeeded();}}

    /**
     * Inserts the character array into this builder.
     * Inserting null will use the stored null text value.
     *
     * @param index  the index to add at, must be valid
     * @param chars  the char array to insert
     * @return this, to enable chaining
     * @throws IndexOutOfBoundsException if the index is invalid
     */
    public StrBuilder insert(final int index, final char chars[]) {try{__CLR4_5_2edtedtlvha7bn1.R.inc(19331);
        __CLR4_5_2edtedtlvha7bn1.R.inc(19332);validateIndex(index);
        __CLR4_5_2edtedtlvha7bn1.R.inc(19333);if ((((chars == null)&&(__CLR4_5_2edtedtlvha7bn1.R.iget(19334)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(19335)==0&false))) {{
            __CLR4_5_2edtedtlvha7bn1.R.inc(19336);return insert(index, nullText);
        }
        }__CLR4_5_2edtedtlvha7bn1.R.inc(19337);final int len = chars.length;
        __CLR4_5_2edtedtlvha7bn1.R.inc(19338);if ((((len > 0)&&(__CLR4_5_2edtedtlvha7bn1.R.iget(19339)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(19340)==0&false))) {{
            __CLR4_5_2edtedtlvha7bn1.R.inc(19341);ensureCapacity(size + len);
            __CLR4_5_2edtedtlvha7bn1.R.inc(19342);System.arraycopy(buffer, index, buffer, index + len, size - index);
            __CLR4_5_2edtedtlvha7bn1.R.inc(19343);System.arraycopy(chars, 0, buffer, index, len);
            __CLR4_5_2edtedtlvha7bn1.R.inc(19344);size += len;
        }
        }__CLR4_5_2edtedtlvha7bn1.R.inc(19345);return this;
    }finally{__CLR4_5_2edtedtlvha7bn1.R.flushNeeded();}}

    /**
     * Inserts part of the character array into this builder.
     * Inserting null will use the stored null text value.
     *
     * @param index  the index to add at, must be valid
     * @param chars  the char array to insert
     * @param offset  the offset into the character array to start at, must be valid
     * @param length  the length of the character array part to copy, must be positive
     * @return this, to enable chaining
     * @throws IndexOutOfBoundsException if any index is invalid
     */
    public StrBuilder insert(final int index, final char chars[], final int offset, final int length) {try{__CLR4_5_2edtedtlvha7bn1.R.inc(19346);
        __CLR4_5_2edtedtlvha7bn1.R.inc(19347);validateIndex(index);
        __CLR4_5_2edtedtlvha7bn1.R.inc(19348);if ((((chars == null)&&(__CLR4_5_2edtedtlvha7bn1.R.iget(19349)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(19350)==0&false))) {{
            __CLR4_5_2edtedtlvha7bn1.R.inc(19351);return insert(index, nullText);
        }
        }__CLR4_5_2edtedtlvha7bn1.R.inc(19352);if ((((offset < 0 || offset > chars.length)&&(__CLR4_5_2edtedtlvha7bn1.R.iget(19353)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(19354)==0&false))) {{
            __CLR4_5_2edtedtlvha7bn1.R.inc(19355);throw new StringIndexOutOfBoundsException("Invalid offset: " + offset);
        }
        }__CLR4_5_2edtedtlvha7bn1.R.inc(19356);if ((((length < 0 || offset + length > chars.length)&&(__CLR4_5_2edtedtlvha7bn1.R.iget(19357)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(19358)==0&false))) {{
            __CLR4_5_2edtedtlvha7bn1.R.inc(19359);throw new StringIndexOutOfBoundsException("Invalid length: " + length);
        }
        }__CLR4_5_2edtedtlvha7bn1.R.inc(19360);if ((((length > 0)&&(__CLR4_5_2edtedtlvha7bn1.R.iget(19361)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(19362)==0&false))) {{
            __CLR4_5_2edtedtlvha7bn1.R.inc(19363);ensureCapacity(size + length);
            __CLR4_5_2edtedtlvha7bn1.R.inc(19364);System.arraycopy(buffer, index, buffer, index + length, size - index);
            __CLR4_5_2edtedtlvha7bn1.R.inc(19365);System.arraycopy(chars, offset, buffer, index, length);
            __CLR4_5_2edtedtlvha7bn1.R.inc(19366);size += length;
        }
        }__CLR4_5_2edtedtlvha7bn1.R.inc(19367);return this;
    }finally{__CLR4_5_2edtedtlvha7bn1.R.flushNeeded();}}

    /**
     * Inserts the value into this builder.
     *
     * @param index  the index to add at, must be valid
     * @param value  the value to insert
     * @return this, to enable chaining
     * @throws IndexOutOfBoundsException if the index is invalid
     */
    public StrBuilder insert(int index, final boolean value) {try{__CLR4_5_2edtedtlvha7bn1.R.inc(19368);
        __CLR4_5_2edtedtlvha7bn1.R.inc(19369);validateIndex(index);
        __CLR4_5_2edtedtlvha7bn1.R.inc(19370);if ((((value)&&(__CLR4_5_2edtedtlvha7bn1.R.iget(19371)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(19372)==0&false))) {{
            __CLR4_5_2edtedtlvha7bn1.R.inc(19373);ensureCapacity(size + 4);
            __CLR4_5_2edtedtlvha7bn1.R.inc(19374);System.arraycopy(buffer, index, buffer, index + 4, size - index);
            __CLR4_5_2edtedtlvha7bn1.R.inc(19375);buffer[index++] = 't';
            __CLR4_5_2edtedtlvha7bn1.R.inc(19376);buffer[index++] = 'r';
            __CLR4_5_2edtedtlvha7bn1.R.inc(19377);buffer[index++] = 'u';
            __CLR4_5_2edtedtlvha7bn1.R.inc(19378);buffer[index] = 'e';
            __CLR4_5_2edtedtlvha7bn1.R.inc(19379);size += 4;
        } }else {{
            __CLR4_5_2edtedtlvha7bn1.R.inc(19380);ensureCapacity(size + 5);
            __CLR4_5_2edtedtlvha7bn1.R.inc(19381);System.arraycopy(buffer, index, buffer, index + 5, size - index);
            __CLR4_5_2edtedtlvha7bn1.R.inc(19382);buffer[index++] = 'f';
            __CLR4_5_2edtedtlvha7bn1.R.inc(19383);buffer[index++] = 'a';
            __CLR4_5_2edtedtlvha7bn1.R.inc(19384);buffer[index++] = 'l';
            __CLR4_5_2edtedtlvha7bn1.R.inc(19385);buffer[index++] = 's';
            __CLR4_5_2edtedtlvha7bn1.R.inc(19386);buffer[index] = 'e';
            __CLR4_5_2edtedtlvha7bn1.R.inc(19387);size += 5;
        }
        }__CLR4_5_2edtedtlvha7bn1.R.inc(19388);return this;
    }finally{__CLR4_5_2edtedtlvha7bn1.R.flushNeeded();}}

    /**
     * Inserts the value into this builder.
     *
     * @param index  the index to add at, must be valid
     * @param value  the value to insert
     * @return this, to enable chaining
     * @throws IndexOutOfBoundsException if the index is invalid
     */
    public StrBuilder insert(final int index, final char value) {try{__CLR4_5_2edtedtlvha7bn1.R.inc(19389);
        __CLR4_5_2edtedtlvha7bn1.R.inc(19390);validateIndex(index);
        __CLR4_5_2edtedtlvha7bn1.R.inc(19391);ensureCapacity(size + 1);
        __CLR4_5_2edtedtlvha7bn1.R.inc(19392);System.arraycopy(buffer, index, buffer, index + 1, size - index);
        __CLR4_5_2edtedtlvha7bn1.R.inc(19393);buffer[index] = value;
        __CLR4_5_2edtedtlvha7bn1.R.inc(19394);size++;
        __CLR4_5_2edtedtlvha7bn1.R.inc(19395);return this;
    }finally{__CLR4_5_2edtedtlvha7bn1.R.flushNeeded();}}

    /**
     * Inserts the value into this builder.
     *
     * @param index  the index to add at, must be valid
     * @param value  the value to insert
     * @return this, to enable chaining
     * @throws IndexOutOfBoundsException if the index is invalid
     */
    public StrBuilder insert(final int index, final int value) {try{__CLR4_5_2edtedtlvha7bn1.R.inc(19396);
        __CLR4_5_2edtedtlvha7bn1.R.inc(19397);return insert(index, String.valueOf(value));
    }finally{__CLR4_5_2edtedtlvha7bn1.R.flushNeeded();}}

    /**
     * Inserts the value into this builder.
     *
     * @param index  the index to add at, must be valid
     * @param value  the value to insert
     * @return this, to enable chaining
     * @throws IndexOutOfBoundsException if the index is invalid
     */
    public StrBuilder insert(final int index, final long value) {try{__CLR4_5_2edtedtlvha7bn1.R.inc(19398);
        __CLR4_5_2edtedtlvha7bn1.R.inc(19399);return insert(index, String.valueOf(value));
    }finally{__CLR4_5_2edtedtlvha7bn1.R.flushNeeded();}}

    /**
     * Inserts the value into this builder.
     *
     * @param index  the index to add at, must be valid
     * @param value  the value to insert
     * @return this, to enable chaining
     * @throws IndexOutOfBoundsException if the index is invalid
     */
    public StrBuilder insert(final int index, final float value) {try{__CLR4_5_2edtedtlvha7bn1.R.inc(19400);
        __CLR4_5_2edtedtlvha7bn1.R.inc(19401);return insert(index, String.valueOf(value));
    }finally{__CLR4_5_2edtedtlvha7bn1.R.flushNeeded();}}

    /**
     * Inserts the value into this builder.
     *
     * @param index  the index to add at, must be valid
     * @param value  the value to insert
     * @return this, to enable chaining
     * @throws IndexOutOfBoundsException if the index is invalid
     */
    public StrBuilder insert(final int index, final double value) {try{__CLR4_5_2edtedtlvha7bn1.R.inc(19402);
        __CLR4_5_2edtedtlvha7bn1.R.inc(19403);return insert(index, String.valueOf(value));
    }finally{__CLR4_5_2edtedtlvha7bn1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Internal method to delete a range without validation.
     *
     * @param startIndex  the start index, must be valid
     * @param endIndex  the end index (exclusive), must be valid
     * @param len  the length, must be valid
     * @throws IndexOutOfBoundsException if any index is invalid
     */
    private void deleteImpl(final int startIndex, final int endIndex, final int len) {try{__CLR4_5_2edtedtlvha7bn1.R.inc(19404);
        __CLR4_5_2edtedtlvha7bn1.R.inc(19405);System.arraycopy(buffer, endIndex, buffer, startIndex, size - endIndex);
        __CLR4_5_2edtedtlvha7bn1.R.inc(19406);size -= len;
    }finally{__CLR4_5_2edtedtlvha7bn1.R.flushNeeded();}}

    /**
     * Deletes the characters between the two specified indices.
     *
     * @param startIndex  the start index, inclusive, must be valid
     * @param endIndex  the end index, exclusive, must be valid except
     *  that if too large it is treated as end of string
     * @return this, to enable chaining
     * @throws IndexOutOfBoundsException if the index is invalid
     */
    public StrBuilder delete(final int startIndex, int endIndex) {try{__CLR4_5_2edtedtlvha7bn1.R.inc(19407);
        __CLR4_5_2edtedtlvha7bn1.R.inc(19408);endIndex = validateRange(startIndex, endIndex);
        __CLR4_5_2edtedtlvha7bn1.R.inc(19409);final int len = endIndex - startIndex;
        __CLR4_5_2edtedtlvha7bn1.R.inc(19410);if ((((len > 0)&&(__CLR4_5_2edtedtlvha7bn1.R.iget(19411)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(19412)==0&false))) {{
            __CLR4_5_2edtedtlvha7bn1.R.inc(19413);deleteImpl(startIndex, endIndex, len);
        }
        }__CLR4_5_2edtedtlvha7bn1.R.inc(19414);return this;
    }finally{__CLR4_5_2edtedtlvha7bn1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Deletes the character wherever it occurs in the builder.
     *
     * @param ch  the character to delete
     * @return this, to enable chaining
     */
    public StrBuilder deleteAll(final char ch) {try{__CLR4_5_2edtedtlvha7bn1.R.inc(19415);
        __CLR4_5_2edtedtlvha7bn1.R.inc(19416);for (int i = 0; (((i < size)&&(__CLR4_5_2edtedtlvha7bn1.R.iget(19417)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(19418)==0&false)); i++) {{
            __CLR4_5_2edtedtlvha7bn1.R.inc(19419);if ((((buffer[i] == ch)&&(__CLR4_5_2edtedtlvha7bn1.R.iget(19420)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(19421)==0&false))) {{
                __CLR4_5_2edtedtlvha7bn1.R.inc(19422);final int start = i;
                __CLR4_5_2edtedtlvha7bn1.R.inc(19423);while ((((++i < size)&&(__CLR4_5_2edtedtlvha7bn1.R.iget(19424)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(19425)==0&false))) {{
                    __CLR4_5_2edtedtlvha7bn1.R.inc(19426);if ((((buffer[i] != ch)&&(__CLR4_5_2edtedtlvha7bn1.R.iget(19427)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(19428)==0&false))) {{
                        __CLR4_5_2edtedtlvha7bn1.R.inc(19429);break;
                    }
                }}
                }__CLR4_5_2edtedtlvha7bn1.R.inc(19430);final int len = i - start;
                __CLR4_5_2edtedtlvha7bn1.R.inc(19431);deleteImpl(start, i, len);
                __CLR4_5_2edtedtlvha7bn1.R.inc(19432);i -= len;
            }
        }}
        }__CLR4_5_2edtedtlvha7bn1.R.inc(19433);return this;
    }finally{__CLR4_5_2edtedtlvha7bn1.R.flushNeeded();}}

    /**
     * Deletes the character wherever it occurs in the builder.
     *
     * @param ch  the character to delete
     * @return this, to enable chaining
     */
    public StrBuilder deleteFirst(final char ch) {try{__CLR4_5_2edtedtlvha7bn1.R.inc(19434);
        __CLR4_5_2edtedtlvha7bn1.R.inc(19435);for (int i = 0; (((i < size)&&(__CLR4_5_2edtedtlvha7bn1.R.iget(19436)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(19437)==0&false)); i++) {{
            __CLR4_5_2edtedtlvha7bn1.R.inc(19438);if ((((buffer[i] == ch)&&(__CLR4_5_2edtedtlvha7bn1.R.iget(19439)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(19440)==0&false))) {{
                __CLR4_5_2edtedtlvha7bn1.R.inc(19441);deleteImpl(i, i + 1, 1);
                __CLR4_5_2edtedtlvha7bn1.R.inc(19442);break;
            }
        }}
        }__CLR4_5_2edtedtlvha7bn1.R.inc(19443);return this;
    }finally{__CLR4_5_2edtedtlvha7bn1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Deletes the string wherever it occurs in the builder.
     *
     * @param str  the string to delete, null causes no action
     * @return this, to enable chaining
     */
    public StrBuilder deleteAll(final String str) {try{__CLR4_5_2edtedtlvha7bn1.R.inc(19444);
        __CLR4_5_2edtedtlvha7bn1.R.inc(19445);final int len = ((((str == null )&&(__CLR4_5_2edtedtlvha7bn1.R.iget(19446)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(19447)==0&false))? 0 : str.length());
        __CLR4_5_2edtedtlvha7bn1.R.inc(19448);if ((((len > 0)&&(__CLR4_5_2edtedtlvha7bn1.R.iget(19449)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(19450)==0&false))) {{
            __CLR4_5_2edtedtlvha7bn1.R.inc(19451);int index = indexOf(str, 0);
            __CLR4_5_2edtedtlvha7bn1.R.inc(19452);while ((((index >= 0)&&(__CLR4_5_2edtedtlvha7bn1.R.iget(19453)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(19454)==0&false))) {{
                __CLR4_5_2edtedtlvha7bn1.R.inc(19455);deleteImpl(index, index + len, len);
                __CLR4_5_2edtedtlvha7bn1.R.inc(19456);index = indexOf(str, index);
            }
        }}
        }__CLR4_5_2edtedtlvha7bn1.R.inc(19457);return this;
    }finally{__CLR4_5_2edtedtlvha7bn1.R.flushNeeded();}}

    /**
     * Deletes the string wherever it occurs in the builder.
     *
     * @param str  the string to delete, null causes no action
     * @return this, to enable chaining
     */
    public StrBuilder deleteFirst(final String str) {try{__CLR4_5_2edtedtlvha7bn1.R.inc(19458);
        __CLR4_5_2edtedtlvha7bn1.R.inc(19459);final int len = ((((str == null )&&(__CLR4_5_2edtedtlvha7bn1.R.iget(19460)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(19461)==0&false))? 0 : str.length());
        __CLR4_5_2edtedtlvha7bn1.R.inc(19462);if ((((len > 0)&&(__CLR4_5_2edtedtlvha7bn1.R.iget(19463)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(19464)==0&false))) {{
            __CLR4_5_2edtedtlvha7bn1.R.inc(19465);final int index = indexOf(str, 0);
            __CLR4_5_2edtedtlvha7bn1.R.inc(19466);if ((((index >= 0)&&(__CLR4_5_2edtedtlvha7bn1.R.iget(19467)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(19468)==0&false))) {{
                __CLR4_5_2edtedtlvha7bn1.R.inc(19469);deleteImpl(index, index + len, len);
            }
        }}
        }__CLR4_5_2edtedtlvha7bn1.R.inc(19470);return this;
    }finally{__CLR4_5_2edtedtlvha7bn1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Deletes all parts of the builder that the matcher matches.
     * <p>
     * Matchers can be used to perform advanced deletion behaviour.
     * For example you could write a matcher to delete all occurrences
     * where the character 'a' is followed by a number.
     *
     * @param matcher  the matcher to use to find the deletion, null causes no action
     * @return this, to enable chaining
     */
    public StrBuilder deleteAll(final StrMatcher matcher) {try{__CLR4_5_2edtedtlvha7bn1.R.inc(19471);
        __CLR4_5_2edtedtlvha7bn1.R.inc(19472);return replace(matcher, null, 0, size, -1);
    }finally{__CLR4_5_2edtedtlvha7bn1.R.flushNeeded();}}

    /**
     * Deletes the first match within the builder using the specified matcher.
     * <p>
     * Matchers can be used to perform advanced deletion behaviour.
     * For example you could write a matcher to delete
     * where the character 'a' is followed by a number.
     *
     * @param matcher  the matcher to use to find the deletion, null causes no action
     * @return this, to enable chaining
     */
    public StrBuilder deleteFirst(final StrMatcher matcher) {try{__CLR4_5_2edtedtlvha7bn1.R.inc(19473);
        __CLR4_5_2edtedtlvha7bn1.R.inc(19474);return replace(matcher, null, 0, size, 1);
    }finally{__CLR4_5_2edtedtlvha7bn1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Internal method to delete a range without validation.
     *
     * @param startIndex  the start index, must be valid
     * @param endIndex  the end index (exclusive), must be valid
     * @param removeLen  the length to remove (endIndex - startIndex), must be valid
     * @param insertStr  the string to replace with, null means delete range
     * @param insertLen  the length of the insert string, must be valid
     * @throws IndexOutOfBoundsException if any index is invalid
     */
    private void replaceImpl(final int startIndex, final int endIndex, final int removeLen, final String insertStr, final int insertLen) {try{__CLR4_5_2edtedtlvha7bn1.R.inc(19475);
        __CLR4_5_2edtedtlvha7bn1.R.inc(19476);final int newSize = size - removeLen + insertLen;
        __CLR4_5_2edtedtlvha7bn1.R.inc(19477);if ((((insertLen != removeLen)&&(__CLR4_5_2edtedtlvha7bn1.R.iget(19478)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(19479)==0&false))) {{
            __CLR4_5_2edtedtlvha7bn1.R.inc(19480);ensureCapacity(newSize);
            __CLR4_5_2edtedtlvha7bn1.R.inc(19481);System.arraycopy(buffer, endIndex, buffer, startIndex + insertLen, size - endIndex);
            __CLR4_5_2edtedtlvha7bn1.R.inc(19482);size = newSize;
        }
        }__CLR4_5_2edtedtlvha7bn1.R.inc(19483);if ((((insertLen > 0)&&(__CLR4_5_2edtedtlvha7bn1.R.iget(19484)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(19485)==0&false))) {{
            __CLR4_5_2edtedtlvha7bn1.R.inc(19486);insertStr.getChars(0, insertLen, buffer, startIndex);
        }
    }}finally{__CLR4_5_2edtedtlvha7bn1.R.flushNeeded();}}

    /**
     * Replaces a portion of the string builder with another string.
     * The length of the inserted string does not have to match the removed length.
     *
     * @param startIndex  the start index, inclusive, must be valid
     * @param endIndex  the end index, exclusive, must be valid except
     *  that if too large it is treated as end of string
     * @param replaceStr  the string to replace with, null means delete range
     * @return this, to enable chaining
     * @throws IndexOutOfBoundsException if the index is invalid
     */
    public StrBuilder replace(final int startIndex, int endIndex, final String replaceStr) {try{__CLR4_5_2edtedtlvha7bn1.R.inc(19487);
        __CLR4_5_2edtedtlvha7bn1.R.inc(19488);endIndex = validateRange(startIndex, endIndex);
        __CLR4_5_2edtedtlvha7bn1.R.inc(19489);final int insertLen = ((((replaceStr == null )&&(__CLR4_5_2edtedtlvha7bn1.R.iget(19490)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(19491)==0&false))? 0 : replaceStr.length());
        __CLR4_5_2edtedtlvha7bn1.R.inc(19492);replaceImpl(startIndex, endIndex, endIndex - startIndex, replaceStr, insertLen);
        __CLR4_5_2edtedtlvha7bn1.R.inc(19493);return this;
    }finally{__CLR4_5_2edtedtlvha7bn1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Replaces the search character with the replace character
     * throughout the builder.
     *
     * @param search  the search character
     * @param replace  the replace character
     * @return this, to enable chaining
     */
    public StrBuilder replaceAll(final char search, final char replace) {try{__CLR4_5_2edtedtlvha7bn1.R.inc(19494);
        __CLR4_5_2edtedtlvha7bn1.R.inc(19495);if ((((search != replace)&&(__CLR4_5_2edtedtlvha7bn1.R.iget(19496)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(19497)==0&false))) {{
            __CLR4_5_2edtedtlvha7bn1.R.inc(19498);for (int i = 0; (((i < size)&&(__CLR4_5_2edtedtlvha7bn1.R.iget(19499)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(19500)==0&false)); i++) {{
                __CLR4_5_2edtedtlvha7bn1.R.inc(19501);if ((((buffer[i] == search)&&(__CLR4_5_2edtedtlvha7bn1.R.iget(19502)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(19503)==0&false))) {{
                    __CLR4_5_2edtedtlvha7bn1.R.inc(19504);buffer[i] = replace;
                }
            }}
        }}
        }__CLR4_5_2edtedtlvha7bn1.R.inc(19505);return this;
    }finally{__CLR4_5_2edtedtlvha7bn1.R.flushNeeded();}}

    /**
     * Replaces the first instance of the search character with the
     * replace character in the builder.
     *
     * @param search  the search character
     * @param replace  the replace character
     * @return this, to enable chaining
     */
    public StrBuilder replaceFirst(final char search, final char replace) {try{__CLR4_5_2edtedtlvha7bn1.R.inc(19506);
        __CLR4_5_2edtedtlvha7bn1.R.inc(19507);if ((((search != replace)&&(__CLR4_5_2edtedtlvha7bn1.R.iget(19508)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(19509)==0&false))) {{
            __CLR4_5_2edtedtlvha7bn1.R.inc(19510);for (int i = 0; (((i < size)&&(__CLR4_5_2edtedtlvha7bn1.R.iget(19511)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(19512)==0&false)); i++) {{
                __CLR4_5_2edtedtlvha7bn1.R.inc(19513);if ((((buffer[i] == search)&&(__CLR4_5_2edtedtlvha7bn1.R.iget(19514)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(19515)==0&false))) {{
                    __CLR4_5_2edtedtlvha7bn1.R.inc(19516);buffer[i] = replace;
                    __CLR4_5_2edtedtlvha7bn1.R.inc(19517);break;
                }
            }}
        }}
        }__CLR4_5_2edtedtlvha7bn1.R.inc(19518);return this;
    }finally{__CLR4_5_2edtedtlvha7bn1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Replaces the search string with the replace string throughout the builder.
     *
     * @param searchStr  the search string, null causes no action to occur
     * @param replaceStr  the replace string, null is equivalent to an empty string
     * @return this, to enable chaining
     */
    public StrBuilder replaceAll(final String searchStr, final String replaceStr) {try{__CLR4_5_2edtedtlvha7bn1.R.inc(19519);
        __CLR4_5_2edtedtlvha7bn1.R.inc(19520);final int searchLen = ((((searchStr == null )&&(__CLR4_5_2edtedtlvha7bn1.R.iget(19521)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(19522)==0&false))? 0 : searchStr.length());
        __CLR4_5_2edtedtlvha7bn1.R.inc(19523);if ((((searchLen > 0)&&(__CLR4_5_2edtedtlvha7bn1.R.iget(19524)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(19525)==0&false))) {{
            __CLR4_5_2edtedtlvha7bn1.R.inc(19526);final int replaceLen = ((((replaceStr == null )&&(__CLR4_5_2edtedtlvha7bn1.R.iget(19527)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(19528)==0&false))? 0 : replaceStr.length());
            __CLR4_5_2edtedtlvha7bn1.R.inc(19529);int index = indexOf(searchStr, 0);
            __CLR4_5_2edtedtlvha7bn1.R.inc(19530);while ((((index >= 0)&&(__CLR4_5_2edtedtlvha7bn1.R.iget(19531)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(19532)==0&false))) {{
                __CLR4_5_2edtedtlvha7bn1.R.inc(19533);replaceImpl(index, index + searchLen, searchLen, replaceStr, replaceLen);
                __CLR4_5_2edtedtlvha7bn1.R.inc(19534);index = indexOf(searchStr, index + replaceLen);
            }
        }}
        }__CLR4_5_2edtedtlvha7bn1.R.inc(19535);return this;
    }finally{__CLR4_5_2edtedtlvha7bn1.R.flushNeeded();}}

    /**
     * Replaces the first instance of the search string with the replace string.
     *
     * @param searchStr  the search string, null causes no action to occur
     * @param replaceStr  the replace string, null is equivalent to an empty string
     * @return this, to enable chaining
     */
    public StrBuilder replaceFirst(final String searchStr, final String replaceStr) {try{__CLR4_5_2edtedtlvha7bn1.R.inc(19536);
        __CLR4_5_2edtedtlvha7bn1.R.inc(19537);final int searchLen = ((((searchStr == null )&&(__CLR4_5_2edtedtlvha7bn1.R.iget(19538)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(19539)==0&false))? 0 : searchStr.length());
        __CLR4_5_2edtedtlvha7bn1.R.inc(19540);if ((((searchLen > 0)&&(__CLR4_5_2edtedtlvha7bn1.R.iget(19541)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(19542)==0&false))) {{
            __CLR4_5_2edtedtlvha7bn1.R.inc(19543);final int index = indexOf(searchStr, 0);
            __CLR4_5_2edtedtlvha7bn1.R.inc(19544);if ((((index >= 0)&&(__CLR4_5_2edtedtlvha7bn1.R.iget(19545)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(19546)==0&false))) {{
                __CLR4_5_2edtedtlvha7bn1.R.inc(19547);final int replaceLen = ((((replaceStr == null )&&(__CLR4_5_2edtedtlvha7bn1.R.iget(19548)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(19549)==0&false))? 0 : replaceStr.length());
                __CLR4_5_2edtedtlvha7bn1.R.inc(19550);replaceImpl(index, index + searchLen, searchLen, replaceStr, replaceLen);
            }
        }}
        }__CLR4_5_2edtedtlvha7bn1.R.inc(19551);return this;
    }finally{__CLR4_5_2edtedtlvha7bn1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Replaces all matches within the builder with the replace string.
     * <p>
     * Matchers can be used to perform advanced replace behaviour.
     * For example you could write a matcher to replace all occurrences
     * where the character 'a' is followed by a number.
     *
     * @param matcher  the matcher to use to find the deletion, null causes no action
     * @param replaceStr  the replace string, null is equivalent to an empty string
     * @return this, to enable chaining
     */
    public StrBuilder replaceAll(final StrMatcher matcher, final String replaceStr) {try{__CLR4_5_2edtedtlvha7bn1.R.inc(19552);
        __CLR4_5_2edtedtlvha7bn1.R.inc(19553);return replace(matcher, replaceStr, 0, size, -1);
    }finally{__CLR4_5_2edtedtlvha7bn1.R.flushNeeded();}}

    /**
     * Replaces the first match within the builder with the replace string.
     * <p>
     * Matchers can be used to perform advanced replace behaviour.
     * For example you could write a matcher to replace
     * where the character 'a' is followed by a number.
     *
     * @param matcher  the matcher to use to find the deletion, null causes no action
     * @param replaceStr  the replace string, null is equivalent to an empty string
     * @return this, to enable chaining
     */
    public StrBuilder replaceFirst(final StrMatcher matcher, final String replaceStr) {try{__CLR4_5_2edtedtlvha7bn1.R.inc(19554);
        __CLR4_5_2edtedtlvha7bn1.R.inc(19555);return replace(matcher, replaceStr, 0, size, 1);
    }finally{__CLR4_5_2edtedtlvha7bn1.R.flushNeeded();}}

    // -----------------------------------------------------------------------
    /**
     * Advanced search and replaces within the builder using a matcher.
     * <p>
     * Matchers can be used to perform advanced behaviour.
     * For example you could write a matcher to delete all occurrences
     * where the character 'a' is followed by a number.
     *
     * @param matcher  the matcher to use to find the deletion, null causes no action
     * @param replaceStr  the string to replace the match with, null is a delete
     * @param startIndex  the start index, inclusive, must be valid
     * @param endIndex  the end index, exclusive, must be valid except
     *  that if too large it is treated as end of string
     * @param replaceCount  the number of times to replace, -1 for replace all
     * @return this, to enable chaining
     * @throws IndexOutOfBoundsException if start index is invalid
     */
    public StrBuilder replace(
            final StrMatcher matcher, final String replaceStr,
            final int startIndex, int endIndex, final int replaceCount) {try{__CLR4_5_2edtedtlvha7bn1.R.inc(19556);
        __CLR4_5_2edtedtlvha7bn1.R.inc(19557);endIndex = validateRange(startIndex, endIndex);
        __CLR4_5_2edtedtlvha7bn1.R.inc(19558);return replaceImpl(matcher, replaceStr, startIndex, endIndex, replaceCount);
    }finally{__CLR4_5_2edtedtlvha7bn1.R.flushNeeded();}}

    /**
     * Replaces within the builder using a matcher.
     * <p>
     * Matchers can be used to perform advanced behaviour.
     * For example you could write a matcher to delete all occurrences
     * where the character 'a' is followed by a number.
     *
     * @param matcher  the matcher to use to find the deletion, null causes no action
     * @param replaceStr  the string to replace the match with, null is a delete
     * @param from  the start index, must be valid
     * @param to  the end index (exclusive), must be valid
     * @param replaceCount  the number of times to replace, -1 for replace all
     * @return this, to enable chaining
     * @throws IndexOutOfBoundsException if any index is invalid
     */
    private StrBuilder replaceImpl(
            final StrMatcher matcher, final String replaceStr,
            final int from, int to, int replaceCount) {try{__CLR4_5_2edtedtlvha7bn1.R.inc(19559);
        __CLR4_5_2edtedtlvha7bn1.R.inc(19560);if ((((matcher == null || size == 0)&&(__CLR4_5_2edtedtlvha7bn1.R.iget(19561)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(19562)==0&false))) {{
            __CLR4_5_2edtedtlvha7bn1.R.inc(19563);return this;
        }
        }__CLR4_5_2edtedtlvha7bn1.R.inc(19564);final int replaceLen = ((((replaceStr == null )&&(__CLR4_5_2edtedtlvha7bn1.R.iget(19565)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(19566)==0&false))? 0 : replaceStr.length());
        __CLR4_5_2edtedtlvha7bn1.R.inc(19567);for (int i = from; (((i < to && replaceCount != 0)&&(__CLR4_5_2edtedtlvha7bn1.R.iget(19568)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(19569)==0&false)); i++) {{
            __CLR4_5_2edtedtlvha7bn1.R.inc(19570);final char[] buf = buffer;
            __CLR4_5_2edtedtlvha7bn1.R.inc(19571);final int removeLen = matcher.isMatch(buf, i, from, to);
            __CLR4_5_2edtedtlvha7bn1.R.inc(19572);if ((((removeLen > 0)&&(__CLR4_5_2edtedtlvha7bn1.R.iget(19573)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(19574)==0&false))) {{
                __CLR4_5_2edtedtlvha7bn1.R.inc(19575);replaceImpl(i, i + removeLen, removeLen, replaceStr, replaceLen);
                __CLR4_5_2edtedtlvha7bn1.R.inc(19576);to = to - removeLen + replaceLen;
                __CLR4_5_2edtedtlvha7bn1.R.inc(19577);i = i + replaceLen - 1;
                __CLR4_5_2edtedtlvha7bn1.R.inc(19578);if ((((replaceCount > 0)&&(__CLR4_5_2edtedtlvha7bn1.R.iget(19579)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(19580)==0&false))) {{
                    __CLR4_5_2edtedtlvha7bn1.R.inc(19581);replaceCount--;
                }
            }}
        }}
        }__CLR4_5_2edtedtlvha7bn1.R.inc(19582);return this;
    }finally{__CLR4_5_2edtedtlvha7bn1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Reverses the string builder placing each character in the opposite index.
     * 
     * @return this, to enable chaining
     */
    public StrBuilder reverse() {try{__CLR4_5_2edtedtlvha7bn1.R.inc(19583);
        __CLR4_5_2edtedtlvha7bn1.R.inc(19584);if ((((size == 0)&&(__CLR4_5_2edtedtlvha7bn1.R.iget(19585)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(19586)==0&false))) {{
            __CLR4_5_2edtedtlvha7bn1.R.inc(19587);return this;
        }
        
        }__CLR4_5_2edtedtlvha7bn1.R.inc(19588);final int half = size / 2;
        __CLR4_5_2edtedtlvha7bn1.R.inc(19589);final char[] buf = buffer;
        __CLR4_5_2edtedtlvha7bn1.R.inc(19590);for (int leftIdx = 0, rightIdx = size - 1; (((leftIdx < half)&&(__CLR4_5_2edtedtlvha7bn1.R.iget(19591)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(19592)==0&false)); leftIdx++,rightIdx--) {{
            __CLR4_5_2edtedtlvha7bn1.R.inc(19593);final char swap = buf[leftIdx];
            __CLR4_5_2edtedtlvha7bn1.R.inc(19594);buf[leftIdx] = buf[rightIdx];
            __CLR4_5_2edtedtlvha7bn1.R.inc(19595);buf[rightIdx] = swap;
        }
        }__CLR4_5_2edtedtlvha7bn1.R.inc(19596);return this;
    }finally{__CLR4_5_2edtedtlvha7bn1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Trims the builder by removing characters less than or equal to a space
     * from the beginning and end.
     *
     * @return this, to enable chaining
     */
    public StrBuilder trim() {try{__CLR4_5_2edtedtlvha7bn1.R.inc(19597);
        __CLR4_5_2edtedtlvha7bn1.R.inc(19598);if ((((size == 0)&&(__CLR4_5_2edtedtlvha7bn1.R.iget(19599)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(19600)==0&false))) {{
            __CLR4_5_2edtedtlvha7bn1.R.inc(19601);return this;
        }
        }__CLR4_5_2edtedtlvha7bn1.R.inc(19602);int len = size;
        __CLR4_5_2edtedtlvha7bn1.R.inc(19603);final char[] buf = buffer;
        __CLR4_5_2edtedtlvha7bn1.R.inc(19604);int pos = 0;
        __CLR4_5_2edtedtlvha7bn1.R.inc(19605);while ((((pos < len && buf[pos] <= ' ')&&(__CLR4_5_2edtedtlvha7bn1.R.iget(19606)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(19607)==0&false))) {{
            __CLR4_5_2edtedtlvha7bn1.R.inc(19608);pos++;
        }
        }__CLR4_5_2edtedtlvha7bn1.R.inc(19609);while ((((pos < len && buf[len - 1] <= ' ')&&(__CLR4_5_2edtedtlvha7bn1.R.iget(19610)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(19611)==0&false))) {{
            __CLR4_5_2edtedtlvha7bn1.R.inc(19612);len--;
        }
        }__CLR4_5_2edtedtlvha7bn1.R.inc(19613);if ((((len < size)&&(__CLR4_5_2edtedtlvha7bn1.R.iget(19614)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(19615)==0&false))) {{
            __CLR4_5_2edtedtlvha7bn1.R.inc(19616);delete(len, size);
        }
        }__CLR4_5_2edtedtlvha7bn1.R.inc(19617);if ((((pos > 0)&&(__CLR4_5_2edtedtlvha7bn1.R.iget(19618)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(19619)==0&false))) {{
            __CLR4_5_2edtedtlvha7bn1.R.inc(19620);delete(0, pos);
        }
        }__CLR4_5_2edtedtlvha7bn1.R.inc(19621);return this;
    }finally{__CLR4_5_2edtedtlvha7bn1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Checks whether this builder starts with the specified string.
     * <p>
     * Note that this method handles null input quietly, unlike String.
     * 
     * @param str  the string to search for, null returns false
     * @return true if the builder starts with the string
     */
    public boolean startsWith(final String str) {try{__CLR4_5_2edtedtlvha7bn1.R.inc(19622);
        __CLR4_5_2edtedtlvha7bn1.R.inc(19623);if ((((str == null)&&(__CLR4_5_2edtedtlvha7bn1.R.iget(19624)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(19625)==0&false))) {{
            __CLR4_5_2edtedtlvha7bn1.R.inc(19626);return false;
        }
        }__CLR4_5_2edtedtlvha7bn1.R.inc(19627);final int len = str.length();
        __CLR4_5_2edtedtlvha7bn1.R.inc(19628);if ((((len == 0)&&(__CLR4_5_2edtedtlvha7bn1.R.iget(19629)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(19630)==0&false))) {{
            __CLR4_5_2edtedtlvha7bn1.R.inc(19631);return true;
        }
        }__CLR4_5_2edtedtlvha7bn1.R.inc(19632);if ((((len > size)&&(__CLR4_5_2edtedtlvha7bn1.R.iget(19633)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(19634)==0&false))) {{
            __CLR4_5_2edtedtlvha7bn1.R.inc(19635);return false;
        }
        }__CLR4_5_2edtedtlvha7bn1.R.inc(19636);for (int i = 0; (((i < len)&&(__CLR4_5_2edtedtlvha7bn1.R.iget(19637)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(19638)==0&false)); i++) {{
            __CLR4_5_2edtedtlvha7bn1.R.inc(19639);if ((((buffer[i] != str.charAt(i))&&(__CLR4_5_2edtedtlvha7bn1.R.iget(19640)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(19641)==0&false))) {{
                __CLR4_5_2edtedtlvha7bn1.R.inc(19642);return false;
            }
        }}
        }__CLR4_5_2edtedtlvha7bn1.R.inc(19643);return true;
    }finally{__CLR4_5_2edtedtlvha7bn1.R.flushNeeded();}}

    /**
     * Checks whether this builder ends with the specified string.
     * <p>
     * Note that this method handles null input quietly, unlike String.
     * 
     * @param str  the string to search for, null returns false
     * @return true if the builder ends with the string
     */
    public boolean endsWith(final String str) {try{__CLR4_5_2edtedtlvha7bn1.R.inc(19644);
        __CLR4_5_2edtedtlvha7bn1.R.inc(19645);if ((((str == null)&&(__CLR4_5_2edtedtlvha7bn1.R.iget(19646)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(19647)==0&false))) {{
            __CLR4_5_2edtedtlvha7bn1.R.inc(19648);return false;
        }
        }__CLR4_5_2edtedtlvha7bn1.R.inc(19649);final int len = str.length();
        __CLR4_5_2edtedtlvha7bn1.R.inc(19650);if ((((len == 0)&&(__CLR4_5_2edtedtlvha7bn1.R.iget(19651)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(19652)==0&false))) {{
            __CLR4_5_2edtedtlvha7bn1.R.inc(19653);return true;
        }
        }__CLR4_5_2edtedtlvha7bn1.R.inc(19654);if ((((len > size)&&(__CLR4_5_2edtedtlvha7bn1.R.iget(19655)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(19656)==0&false))) {{
            __CLR4_5_2edtedtlvha7bn1.R.inc(19657);return false;
        }
        }__CLR4_5_2edtedtlvha7bn1.R.inc(19658);int pos = size - len;
        __CLR4_5_2edtedtlvha7bn1.R.inc(19659);for (int i = 0; (((i < len)&&(__CLR4_5_2edtedtlvha7bn1.R.iget(19660)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(19661)==0&false)); i++,pos++) {{
            __CLR4_5_2edtedtlvha7bn1.R.inc(19662);if ((((buffer[pos] != str.charAt(i))&&(__CLR4_5_2edtedtlvha7bn1.R.iget(19663)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(19664)==0&false))) {{
                __CLR4_5_2edtedtlvha7bn1.R.inc(19665);return false;
            }
        }}
        }__CLR4_5_2edtedtlvha7bn1.R.inc(19666);return true;
    }finally{__CLR4_5_2edtedtlvha7bn1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * {@inheritDoc}
     * @since 3.0
     */
    @Override
    public CharSequence subSequence(final int startIndex, final int endIndex) {try{__CLR4_5_2edtedtlvha7bn1.R.inc(19667);
      __CLR4_5_2edtedtlvha7bn1.R.inc(19668);if ((((startIndex < 0)&&(__CLR4_5_2edtedtlvha7bn1.R.iget(19669)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(19670)==0&false))) {{
          __CLR4_5_2edtedtlvha7bn1.R.inc(19671);throw new StringIndexOutOfBoundsException(startIndex);
      }
      }__CLR4_5_2edtedtlvha7bn1.R.inc(19672);if ((((endIndex > size)&&(__CLR4_5_2edtedtlvha7bn1.R.iget(19673)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(19674)==0&false))) {{
          __CLR4_5_2edtedtlvha7bn1.R.inc(19675);throw new StringIndexOutOfBoundsException(endIndex);
      }
      }__CLR4_5_2edtedtlvha7bn1.R.inc(19676);if ((((startIndex > endIndex)&&(__CLR4_5_2edtedtlvha7bn1.R.iget(19677)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(19678)==0&false))) {{
          __CLR4_5_2edtedtlvha7bn1.R.inc(19679);throw new StringIndexOutOfBoundsException(endIndex - startIndex);
      }
      }__CLR4_5_2edtedtlvha7bn1.R.inc(19680);return substring(startIndex, endIndex);
    }finally{__CLR4_5_2edtedtlvha7bn1.R.flushNeeded();}}

    /**
     * Extracts a portion of this string builder as a string.
     * 
     * @param start  the start index, inclusive, must be valid
     * @return the new string
     * @throws IndexOutOfBoundsException if the index is invalid
     */
    public String substring(final int start) {try{__CLR4_5_2edtedtlvha7bn1.R.inc(19681);
        __CLR4_5_2edtedtlvha7bn1.R.inc(19682);return substring(start, size);
    }finally{__CLR4_5_2edtedtlvha7bn1.R.flushNeeded();}}

    /**
     * Extracts a portion of this string builder as a string.
     * <p>
     * Note: This method treats an endIndex greater than the length of the
     * builder as equal to the length of the builder, and continues
     * without error, unlike StringBuffer or String.
     * 
     * @param startIndex  the start index, inclusive, must be valid
     * @param endIndex  the end index, exclusive, must be valid except
     *  that if too large it is treated as end of string
     * @return the new string
     * @throws IndexOutOfBoundsException if the index is invalid
     */
    public String substring(final int startIndex, int endIndex) {try{__CLR4_5_2edtedtlvha7bn1.R.inc(19683);
        __CLR4_5_2edtedtlvha7bn1.R.inc(19684);endIndex = validateRange(startIndex, endIndex);
        __CLR4_5_2edtedtlvha7bn1.R.inc(19685);return new String(buffer, startIndex, endIndex - startIndex);
    }finally{__CLR4_5_2edtedtlvha7bn1.R.flushNeeded();}}

    /**
     * Extracts the leftmost characters from the string builder without
     * throwing an exception.
     * <p>
     * This method extracts the left <code>length</code> characters from
     * the builder. If this many characters are not available, the whole
     * builder is returned. Thus the returned string may be shorter than the
     * length requested.
     * 
     * @param length  the number of characters to extract, negative returns empty string
     * @return the new string
     */
    public String leftString(final int length) {try{__CLR4_5_2edtedtlvha7bn1.R.inc(19686);
        __CLR4_5_2edtedtlvha7bn1.R.inc(19687);if ((((length <= 0)&&(__CLR4_5_2edtedtlvha7bn1.R.iget(19688)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(19689)==0&false))) {{
            __CLR4_5_2edtedtlvha7bn1.R.inc(19690);return StringUtils.EMPTY;
        } }else {__CLR4_5_2edtedtlvha7bn1.R.inc(19691);if ((((length >= size)&&(__CLR4_5_2edtedtlvha7bn1.R.iget(19692)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(19693)==0&false))) {{
            __CLR4_5_2edtedtlvha7bn1.R.inc(19694);return new String(buffer, 0, size);
        } }else {{
            __CLR4_5_2edtedtlvha7bn1.R.inc(19695);return new String(buffer, 0, length);
        }
    }}}finally{__CLR4_5_2edtedtlvha7bn1.R.flushNeeded();}}

    /**
     * Extracts the rightmost characters from the string builder without
     * throwing an exception.
     * <p>
     * This method extracts the right <code>length</code> characters from
     * the builder. If this many characters are not available, the whole
     * builder is returned. Thus the returned string may be shorter than the
     * length requested.
     * 
     * @param length  the number of characters to extract, negative returns empty string
     * @return the new string
     */
    public String rightString(final int length) {try{__CLR4_5_2edtedtlvha7bn1.R.inc(19696);
        __CLR4_5_2edtedtlvha7bn1.R.inc(19697);if ((((length <= 0)&&(__CLR4_5_2edtedtlvha7bn1.R.iget(19698)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(19699)==0&false))) {{
            __CLR4_5_2edtedtlvha7bn1.R.inc(19700);return StringUtils.EMPTY;
        } }else {__CLR4_5_2edtedtlvha7bn1.R.inc(19701);if ((((length >= size)&&(__CLR4_5_2edtedtlvha7bn1.R.iget(19702)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(19703)==0&false))) {{
            __CLR4_5_2edtedtlvha7bn1.R.inc(19704);return new String(buffer, 0, size);
        } }else {{
            __CLR4_5_2edtedtlvha7bn1.R.inc(19705);return new String(buffer, size - length, length);
        }
    }}}finally{__CLR4_5_2edtedtlvha7bn1.R.flushNeeded();}}

    /**
     * Extracts some characters from the middle of the string builder without
     * throwing an exception.
     * <p>
     * This method extracts <code>length</code> characters from the builder
     * at the specified index.
     * If the index is negative it is treated as zero.
     * If the index is greater than the builder size, it is treated as the builder size.
     * If the length is negative, the empty string is returned.
     * If insufficient characters are available in the builder, as much as possible is returned.
     * Thus the returned string may be shorter than the length requested.
     * 
     * @param index  the index to start at, negative means zero
     * @param length  the number of characters to extract, negative returns empty string
     * @return the new string
     */
    public String midString(int index, final int length) {try{__CLR4_5_2edtedtlvha7bn1.R.inc(19706);
        __CLR4_5_2edtedtlvha7bn1.R.inc(19707);if ((((index < 0)&&(__CLR4_5_2edtedtlvha7bn1.R.iget(19708)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(19709)==0&false))) {{
            __CLR4_5_2edtedtlvha7bn1.R.inc(19710);index = 0;
        }
        }__CLR4_5_2edtedtlvha7bn1.R.inc(19711);if ((((length <= 0 || index >= size)&&(__CLR4_5_2edtedtlvha7bn1.R.iget(19712)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(19713)==0&false))) {{
            __CLR4_5_2edtedtlvha7bn1.R.inc(19714);return StringUtils.EMPTY;
        }
        }__CLR4_5_2edtedtlvha7bn1.R.inc(19715);if ((((size <= index + length)&&(__CLR4_5_2edtedtlvha7bn1.R.iget(19716)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(19717)==0&false))) {{
            __CLR4_5_2edtedtlvha7bn1.R.inc(19718);return new String(buffer, index, size - index);
        }
        }__CLR4_5_2edtedtlvha7bn1.R.inc(19719);return new String(buffer, index, length);
    }finally{__CLR4_5_2edtedtlvha7bn1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Checks if the string builder contains the specified char.
     *
     * @param ch  the character to find
     * @return true if the builder contains the character
     */
    public boolean contains(final char ch) {try{__CLR4_5_2edtedtlvha7bn1.R.inc(19720);
        __CLR4_5_2edtedtlvha7bn1.R.inc(19721);final char[] thisBuf = buffer;
        __CLR4_5_2edtedtlvha7bn1.R.inc(19722);for (int i = 0; (((i < this.size)&&(__CLR4_5_2edtedtlvha7bn1.R.iget(19723)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(19724)==0&false)); i++) {{
            __CLR4_5_2edtedtlvha7bn1.R.inc(19725);if ((((thisBuf[i] == ch)&&(__CLR4_5_2edtedtlvha7bn1.R.iget(19726)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(19727)==0&false))) {{
                __CLR4_5_2edtedtlvha7bn1.R.inc(19728);return true;
            }
        }}
        }__CLR4_5_2edtedtlvha7bn1.R.inc(19729);return false;
    }finally{__CLR4_5_2edtedtlvha7bn1.R.flushNeeded();}}

    /**
     * Checks if the string builder contains the specified string.
     *
     * @param str  the string to find
     * @return true if the builder contains the string
     */
    public boolean contains(final String str) {try{__CLR4_5_2edtedtlvha7bn1.R.inc(19730);
        __CLR4_5_2edtedtlvha7bn1.R.inc(19731);return indexOf(str, 0) >= 0;
    }finally{__CLR4_5_2edtedtlvha7bn1.R.flushNeeded();}}

    /**
     * Checks if the string builder contains a string matched using the
     * specified matcher.
     * <p>
     * Matchers can be used to perform advanced searching behaviour.
     * For example you could write a matcher to search for the character
     * 'a' followed by a number.
     *
     * @param matcher  the matcher to use, null returns -1
     * @return true if the matcher finds a match in the builder
     */
    public boolean contains(final StrMatcher matcher) {try{__CLR4_5_2edtedtlvha7bn1.R.inc(19732);
        __CLR4_5_2edtedtlvha7bn1.R.inc(19733);return indexOf(matcher, 0) >= 0;
    }finally{__CLR4_5_2edtedtlvha7bn1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Searches the string builder to find the first reference to the specified char.
     * 
     * @param ch  the character to find
     * @return the first index of the character, or -1 if not found
     */
    public int indexOf(final char ch) {try{__CLR4_5_2edtedtlvha7bn1.R.inc(19734);
        __CLR4_5_2edtedtlvha7bn1.R.inc(19735);return indexOf(ch, 0);
    }finally{__CLR4_5_2edtedtlvha7bn1.R.flushNeeded();}}

    /**
     * Searches the string builder to find the first reference to the specified char.
     * 
     * @param ch  the character to find
     * @param startIndex  the index to start at, invalid index rounded to edge
     * @return the first index of the character, or -1 if not found
     */
    public int indexOf(final char ch, int startIndex) {try{__CLR4_5_2edtedtlvha7bn1.R.inc(19736);
        __CLR4_5_2edtedtlvha7bn1.R.inc(19737);startIndex = ((((startIndex < 0 )&&(__CLR4_5_2edtedtlvha7bn1.R.iget(19738)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(19739)==0&false))? 0 : startIndex);
        __CLR4_5_2edtedtlvha7bn1.R.inc(19740);if ((((startIndex >= size)&&(__CLR4_5_2edtedtlvha7bn1.R.iget(19741)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(19742)==0&false))) {{
            __CLR4_5_2edtedtlvha7bn1.R.inc(19743);return -1;
        }
        }__CLR4_5_2edtedtlvha7bn1.R.inc(19744);final char[] thisBuf = buffer;
        __CLR4_5_2edtedtlvha7bn1.R.inc(19745);for (int i = startIndex; (((i < size)&&(__CLR4_5_2edtedtlvha7bn1.R.iget(19746)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(19747)==0&false)); i++) {{
            __CLR4_5_2edtedtlvha7bn1.R.inc(19748);if ((((thisBuf[i] == ch)&&(__CLR4_5_2edtedtlvha7bn1.R.iget(19749)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(19750)==0&false))) {{
                __CLR4_5_2edtedtlvha7bn1.R.inc(19751);return i;
            }
        }}
        }__CLR4_5_2edtedtlvha7bn1.R.inc(19752);return -1;
    }finally{__CLR4_5_2edtedtlvha7bn1.R.flushNeeded();}}

    /**
     * Searches the string builder to find the first reference to the specified string.
     * <p>
     * Note that a null input string will return -1, whereas the JDK throws an exception.
     * 
     * @param str  the string to find, null returns -1
     * @return the first index of the string, or -1 if not found
     */
    public int indexOf(final String str) {try{__CLR4_5_2edtedtlvha7bn1.R.inc(19753);
        __CLR4_5_2edtedtlvha7bn1.R.inc(19754);return indexOf(str, 0);
    }finally{__CLR4_5_2edtedtlvha7bn1.R.flushNeeded();}}

    /**
     * Searches the string builder to find the first reference to the specified
     * string starting searching from the given index.
     * <p>
     * Note that a null input string will return -1, whereas the JDK throws an exception.
     * 
     * @param str  the string to find, null returns -1
     * @param startIndex  the index to start at, invalid index rounded to edge
     * @return the first index of the string, or -1 if not found
     */
    public int indexOf(final String str, int startIndex) {try{__CLR4_5_2edtedtlvha7bn1.R.inc(19755);
        __CLR4_5_2edtedtlvha7bn1.R.inc(19756);startIndex = ((((startIndex < 0 )&&(__CLR4_5_2edtedtlvha7bn1.R.iget(19757)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(19758)==0&false))? 0 : startIndex);
        __CLR4_5_2edtedtlvha7bn1.R.inc(19759);if ((((str == null || startIndex >= size)&&(__CLR4_5_2edtedtlvha7bn1.R.iget(19760)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(19761)==0&false))) {{
            __CLR4_5_2edtedtlvha7bn1.R.inc(19762);return -1;
        }
        }__CLR4_5_2edtedtlvha7bn1.R.inc(19763);final int strLen = str.length();
        __CLR4_5_2edtedtlvha7bn1.R.inc(19764);if ((((strLen == 1)&&(__CLR4_5_2edtedtlvha7bn1.R.iget(19765)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(19766)==0&false))) {{
            __CLR4_5_2edtedtlvha7bn1.R.inc(19767);return indexOf(str.charAt(0), startIndex);
        }
        }__CLR4_5_2edtedtlvha7bn1.R.inc(19768);if ((((strLen == 0)&&(__CLR4_5_2edtedtlvha7bn1.R.iget(19769)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(19770)==0&false))) {{
            __CLR4_5_2edtedtlvha7bn1.R.inc(19771);return startIndex;
        }
        }__CLR4_5_2edtedtlvha7bn1.R.inc(19772);if ((((strLen > size)&&(__CLR4_5_2edtedtlvha7bn1.R.iget(19773)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(19774)==0&false))) {{
            __CLR4_5_2edtedtlvha7bn1.R.inc(19775);return -1;
        }
        }__CLR4_5_2edtedtlvha7bn1.R.inc(19776);final char[] thisBuf = buffer;
        __CLR4_5_2edtedtlvha7bn1.R.inc(19777);final int len = size - strLen + 1;
        __CLR4_5_2edtedtlvha7bn1.R.inc(19778);outer:
        for (int i = startIndex; (((i < len)&&(__CLR4_5_2edtedtlvha7bn1.R.iget(19779)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(19780)==0&false)); i++) {{
            __CLR4_5_2edtedtlvha7bn1.R.inc(19781);for (int j = 0; (((j < strLen)&&(__CLR4_5_2edtedtlvha7bn1.R.iget(19782)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(19783)==0&false)); j++) {{
                __CLR4_5_2edtedtlvha7bn1.R.inc(19784);if ((((str.charAt(j) != thisBuf[i + j])&&(__CLR4_5_2edtedtlvha7bn1.R.iget(19785)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(19786)==0&false))) {{
                    __CLR4_5_2edtedtlvha7bn1.R.inc(19787);continue outer;
                }
            }}
            }__CLR4_5_2edtedtlvha7bn1.R.inc(19788);return i;
        }
        }__CLR4_5_2edtedtlvha7bn1.R.inc(19789);return -1;
    }finally{__CLR4_5_2edtedtlvha7bn1.R.flushNeeded();}}

    /**
     * Searches the string builder using the matcher to find the first match.
     * <p>
     * Matchers can be used to perform advanced searching behaviour.
     * For example you could write a matcher to find the character 'a'
     * followed by a number.
     *
     * @param matcher  the matcher to use, null returns -1
     * @return the first index matched, or -1 if not found
     */
    public int indexOf(final StrMatcher matcher) {try{__CLR4_5_2edtedtlvha7bn1.R.inc(19790);
        __CLR4_5_2edtedtlvha7bn1.R.inc(19791);return indexOf(matcher, 0);
    }finally{__CLR4_5_2edtedtlvha7bn1.R.flushNeeded();}}

    /**
     * Searches the string builder using the matcher to find the first
     * match searching from the given index.
     * <p>
     * Matchers can be used to perform advanced searching behaviour.
     * For example you could write a matcher to find the character 'a'
     * followed by a number.
     *
     * @param matcher  the matcher to use, null returns -1
     * @param startIndex  the index to start at, invalid index rounded to edge
     * @return the first index matched, or -1 if not found
     */
    public int indexOf(final StrMatcher matcher, int startIndex) {try{__CLR4_5_2edtedtlvha7bn1.R.inc(19792);
        __CLR4_5_2edtedtlvha7bn1.R.inc(19793);startIndex = ((((startIndex < 0 )&&(__CLR4_5_2edtedtlvha7bn1.R.iget(19794)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(19795)==0&false))? 0 : startIndex);
        __CLR4_5_2edtedtlvha7bn1.R.inc(19796);if ((((matcher == null || startIndex >= size)&&(__CLR4_5_2edtedtlvha7bn1.R.iget(19797)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(19798)==0&false))) {{
            __CLR4_5_2edtedtlvha7bn1.R.inc(19799);return -1;
        }
        }__CLR4_5_2edtedtlvha7bn1.R.inc(19800);final int len = size;
        __CLR4_5_2edtedtlvha7bn1.R.inc(19801);final char[] buf = buffer;
        __CLR4_5_2edtedtlvha7bn1.R.inc(19802);for (int i = startIndex; (((i < len)&&(__CLR4_5_2edtedtlvha7bn1.R.iget(19803)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(19804)==0&false)); i++) {{
            __CLR4_5_2edtedtlvha7bn1.R.inc(19805);if ((((matcher.isMatch(buf, i, startIndex, len) > 0)&&(__CLR4_5_2edtedtlvha7bn1.R.iget(19806)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(19807)==0&false))) {{
                __CLR4_5_2edtedtlvha7bn1.R.inc(19808);return i;
            }
        }}
        }__CLR4_5_2edtedtlvha7bn1.R.inc(19809);return -1;
    }finally{__CLR4_5_2edtedtlvha7bn1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Searches the string builder to find the last reference to the specified char.
     * 
     * @param ch  the character to find
     * @return the last index of the character, or -1 if not found
     */
    public int lastIndexOf(final char ch) {try{__CLR4_5_2edtedtlvha7bn1.R.inc(19810);
        __CLR4_5_2edtedtlvha7bn1.R.inc(19811);return lastIndexOf(ch, size - 1);
    }finally{__CLR4_5_2edtedtlvha7bn1.R.flushNeeded();}}

    /**
     * Searches the string builder to find the last reference to the specified char.
     * 
     * @param ch  the character to find
     * @param startIndex  the index to start at, invalid index rounded to edge
     * @return the last index of the character, or -1 if not found
     */
    public int lastIndexOf(final char ch, int startIndex) {try{__CLR4_5_2edtedtlvha7bn1.R.inc(19812);
        __CLR4_5_2edtedtlvha7bn1.R.inc(19813);startIndex = ((((startIndex >= size )&&(__CLR4_5_2edtedtlvha7bn1.R.iget(19814)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(19815)==0&false))? size - 1 : startIndex);
        __CLR4_5_2edtedtlvha7bn1.R.inc(19816);if ((((startIndex < 0)&&(__CLR4_5_2edtedtlvha7bn1.R.iget(19817)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(19818)==0&false))) {{
            __CLR4_5_2edtedtlvha7bn1.R.inc(19819);return -1;
        }
        }__CLR4_5_2edtedtlvha7bn1.R.inc(19820);for (int i = startIndex; (((i >= 0)&&(__CLR4_5_2edtedtlvha7bn1.R.iget(19821)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(19822)==0&false)); i--) {{
            __CLR4_5_2edtedtlvha7bn1.R.inc(19823);if ((((buffer[i] == ch)&&(__CLR4_5_2edtedtlvha7bn1.R.iget(19824)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(19825)==0&false))) {{
                __CLR4_5_2edtedtlvha7bn1.R.inc(19826);return i;
            }
        }}
        }__CLR4_5_2edtedtlvha7bn1.R.inc(19827);return -1;
    }finally{__CLR4_5_2edtedtlvha7bn1.R.flushNeeded();}}

    /**
     * Searches the string builder to find the last reference to the specified string.
     * <p>
     * Note that a null input string will return -1, whereas the JDK throws an exception.
     * 
     * @param str  the string to find, null returns -1
     * @return the last index of the string, or -1 if not found
     */
    public int lastIndexOf(final String str) {try{__CLR4_5_2edtedtlvha7bn1.R.inc(19828);
        __CLR4_5_2edtedtlvha7bn1.R.inc(19829);return lastIndexOf(str, size - 1);
    }finally{__CLR4_5_2edtedtlvha7bn1.R.flushNeeded();}}

    /**
     * Searches the string builder to find the last reference to the specified
     * string starting searching from the given index.
     * <p>
     * Note that a null input string will return -1, whereas the JDK throws an exception.
     * 
     * @param str  the string to find, null returns -1
     * @param startIndex  the index to start at, invalid index rounded to edge
     * @return the last index of the string, or -1 if not found
     */
    public int lastIndexOf(final String str, int startIndex) {try{__CLR4_5_2edtedtlvha7bn1.R.inc(19830);
        __CLR4_5_2edtedtlvha7bn1.R.inc(19831);startIndex = ((((startIndex >= size )&&(__CLR4_5_2edtedtlvha7bn1.R.iget(19832)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(19833)==0&false))? size - 1 : startIndex);
        __CLR4_5_2edtedtlvha7bn1.R.inc(19834);if ((((str == null || startIndex < 0)&&(__CLR4_5_2edtedtlvha7bn1.R.iget(19835)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(19836)==0&false))) {{
            __CLR4_5_2edtedtlvha7bn1.R.inc(19837);return -1;
        }
        }__CLR4_5_2edtedtlvha7bn1.R.inc(19838);final int strLen = str.length();
        __CLR4_5_2edtedtlvha7bn1.R.inc(19839);if ((((strLen > 0 && strLen <= size)&&(__CLR4_5_2edtedtlvha7bn1.R.iget(19840)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(19841)==0&false))) {{
            __CLR4_5_2edtedtlvha7bn1.R.inc(19842);if ((((strLen == 1)&&(__CLR4_5_2edtedtlvha7bn1.R.iget(19843)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(19844)==0&false))) {{
                __CLR4_5_2edtedtlvha7bn1.R.inc(19845);return lastIndexOf(str.charAt(0), startIndex);
            }

            }__CLR4_5_2edtedtlvha7bn1.R.inc(19846);outer:
            for (int i = startIndex - strLen + 1; (((i >= 0)&&(__CLR4_5_2edtedtlvha7bn1.R.iget(19847)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(19848)==0&false)); i--) {{
                __CLR4_5_2edtedtlvha7bn1.R.inc(19849);for (int j = 0; (((j < strLen)&&(__CLR4_5_2edtedtlvha7bn1.R.iget(19850)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(19851)==0&false)); j++) {{
                    __CLR4_5_2edtedtlvha7bn1.R.inc(19852);if ((((str.charAt(j) != buffer[i + j])&&(__CLR4_5_2edtedtlvha7bn1.R.iget(19853)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(19854)==0&false))) {{
                        __CLR4_5_2edtedtlvha7bn1.R.inc(19855);continue outer;
                    }
                }}
                }__CLR4_5_2edtedtlvha7bn1.R.inc(19856);return i;
            }
            
        }} }else {__CLR4_5_2edtedtlvha7bn1.R.inc(19857);if ((((strLen == 0)&&(__CLR4_5_2edtedtlvha7bn1.R.iget(19858)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(19859)==0&false))) {{
            __CLR4_5_2edtedtlvha7bn1.R.inc(19860);return startIndex;
        }
        }}__CLR4_5_2edtedtlvha7bn1.R.inc(19861);return -1;
    }finally{__CLR4_5_2edtedtlvha7bn1.R.flushNeeded();}}

    /**
     * Searches the string builder using the matcher to find the last match.
     * <p>
     * Matchers can be used to perform advanced searching behaviour.
     * For example you could write a matcher to find the character 'a'
     * followed by a number.
     *
     * @param matcher  the matcher to use, null returns -1
     * @return the last index matched, or -1 if not found
     */
    public int lastIndexOf(final StrMatcher matcher) {try{__CLR4_5_2edtedtlvha7bn1.R.inc(19862);
        __CLR4_5_2edtedtlvha7bn1.R.inc(19863);return lastIndexOf(matcher, size);
    }finally{__CLR4_5_2edtedtlvha7bn1.R.flushNeeded();}}

    /**
     * Searches the string builder using the matcher to find the last
     * match searching from the given index.
     * <p>
     * Matchers can be used to perform advanced searching behaviour.
     * For example you could write a matcher to find the character 'a'
     * followed by a number.
     *
     * @param matcher  the matcher to use, null returns -1
     * @param startIndex  the index to start at, invalid index rounded to edge
     * @return the last index matched, or -1 if not found
     */
    public int lastIndexOf(final StrMatcher matcher, int startIndex) {try{__CLR4_5_2edtedtlvha7bn1.R.inc(19864);
        __CLR4_5_2edtedtlvha7bn1.R.inc(19865);startIndex = ((((startIndex >= size )&&(__CLR4_5_2edtedtlvha7bn1.R.iget(19866)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(19867)==0&false))? size - 1 : startIndex);
        __CLR4_5_2edtedtlvha7bn1.R.inc(19868);if ((((matcher == null || startIndex < 0)&&(__CLR4_5_2edtedtlvha7bn1.R.iget(19869)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(19870)==0&false))) {{
            __CLR4_5_2edtedtlvha7bn1.R.inc(19871);return -1;
        }
        }__CLR4_5_2edtedtlvha7bn1.R.inc(19872);final char[] buf = buffer;
        __CLR4_5_2edtedtlvha7bn1.R.inc(19873);final int endIndex = startIndex + 1;
        __CLR4_5_2edtedtlvha7bn1.R.inc(19874);for (int i = startIndex; (((i >= 0)&&(__CLR4_5_2edtedtlvha7bn1.R.iget(19875)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(19876)==0&false)); i--) {{
            __CLR4_5_2edtedtlvha7bn1.R.inc(19877);if ((((matcher.isMatch(buf, i, 0, endIndex) > 0)&&(__CLR4_5_2edtedtlvha7bn1.R.iget(19878)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(19879)==0&false))) {{
                __CLR4_5_2edtedtlvha7bn1.R.inc(19880);return i;
            }
        }}
        }__CLR4_5_2edtedtlvha7bn1.R.inc(19881);return -1;
    }finally{__CLR4_5_2edtedtlvha7bn1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Creates a tokenizer that can tokenize the contents of this builder.
     * <p>
     * This method allows the contents of this builder to be tokenized.
     * The tokenizer will be setup by default to tokenize on space, tab,
     * newline and formfeed (as per StringTokenizer). These values can be
     * changed on the tokenizer class, before retrieving the tokens.
     * <p>
     * The returned tokenizer is linked to this builder. You may intermix
     * calls to the builder and tokenizer within certain limits, however
     * there is no synchronization. Once the tokenizer has been used once,
     * it must be {@link StrTokenizer#reset() reset} to pickup the latest
     * changes in the builder. For example:
     * <pre>
     * StrBuilder b = new StrBuilder();
     * b.append("a b ");
     * StrTokenizer t = b.asTokenizer();
     * String[] tokens1 = t.getTokenArray();  // returns a,b
     * b.append("c d ");
     * String[] tokens2 = t.getTokenArray();  // returns a,b (c and d ignored)
     * t.reset();              // reset causes builder changes to be picked up
     * String[] tokens3 = t.getTokenArray();  // returns a,b,c,d
     * </pre>
     * In addition to simply intermixing appends and tokenization, you can also
     * call the set methods on the tokenizer to alter how it tokenizes. Just
     * remember to call reset when you want to pickup builder changes.
     * <p>
     * Calling {@link StrTokenizer#reset(String)} or {@link StrTokenizer#reset(char[])}
     * with a non-null value will break the link with the builder.
     *
     * @return a tokenizer that is linked to this builder
     */
    public StrTokenizer asTokenizer() {try{__CLR4_5_2edtedtlvha7bn1.R.inc(19882);
        __CLR4_5_2edtedtlvha7bn1.R.inc(19883);return new StrBuilderTokenizer();
    }finally{__CLR4_5_2edtedtlvha7bn1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Gets the contents of this builder as a Reader.
     * <p>
     * This method allows the contents of the builder to be read
     * using any standard method that expects a Reader.
     * <p>
     * To use, simply create a <code>StrBuilder</code>, populate it with
     * data, call <code>asReader</code>, and then read away.
     * <p>
     * The internal character array is shared between the builder and the reader.
     * This allows you to append to the builder after creating the reader,
     * and the changes will be picked up.
     * Note however, that no synchronization occurs, so you must perform
     * all operations with the builder and the reader in one thread.
     * <p>
     * The returned reader supports marking, and ignores the flush method.
     *
     * @return a reader that reads from this builder
     */
    public Reader asReader() {try{__CLR4_5_2edtedtlvha7bn1.R.inc(19884);
        __CLR4_5_2edtedtlvha7bn1.R.inc(19885);return new StrBuilderReader();
    }finally{__CLR4_5_2edtedtlvha7bn1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Gets this builder as a Writer that can be written to.
     * <p>
     * This method allows you to populate the contents of the builder
     * using any standard method that takes a Writer.
     * <p>
     * To use, simply create a <code>StrBuilder</code>,
     * call <code>asWriter</code>, and populate away. The data is available
     * at any time using the methods of the <code>StrBuilder</code>.
     * <p>
     * The internal character array is shared between the builder and the writer.
     * This allows you to intermix calls that append to the builder and
     * write using the writer and the changes will be occur correctly.
     * Note however, that no synchronization occurs, so you must perform
     * all operations with the builder and the writer in one thread.
     * <p>
     * The returned writer ignores the close and flush methods.
     *
     * @return a writer that populates this builder
     */
    public Writer asWriter() {try{__CLR4_5_2edtedtlvha7bn1.R.inc(19886);
        __CLR4_5_2edtedtlvha7bn1.R.inc(19887);return new StrBuilderWriter();
    }finally{__CLR4_5_2edtedtlvha7bn1.R.flushNeeded();}}

    /**
     * Appends current contents of this <code>StrBuilder</code> to the
     * provided {@link Appendable}.
     * <p>
     * This method tries to avoid doing any extra copies of contents.
     *
     * @param appendable  the appendable to append data to
     * @throws IOException  if an I/O error occurs
     *
     * @since 3.4
     * @see #readFrom(Readable)
     */
    public void appendTo(final Appendable appendable) throws IOException {try{__CLR4_5_2edtedtlvha7bn1.R.inc(19888);
        __CLR4_5_2edtedtlvha7bn1.R.inc(19889);if ((((appendable instanceof Writer)&&(__CLR4_5_2edtedtlvha7bn1.R.iget(19890)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(19891)==0&false))) {{
            __CLR4_5_2edtedtlvha7bn1.R.inc(19892);((Writer) appendable).write(buffer, 0, size);
        } }else {__CLR4_5_2edtedtlvha7bn1.R.inc(19893);if ((((appendable instanceof StringBuilder)&&(__CLR4_5_2edtedtlvha7bn1.R.iget(19894)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(19895)==0&false))) {{
            __CLR4_5_2edtedtlvha7bn1.R.inc(19896);((StringBuilder) appendable).append(buffer, 0, size);
        } }else {__CLR4_5_2edtedtlvha7bn1.R.inc(19897);if ((((appendable instanceof StringBuffer)&&(__CLR4_5_2edtedtlvha7bn1.R.iget(19898)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(19899)==0&false))) {{
            __CLR4_5_2edtedtlvha7bn1.R.inc(19900);((StringBuffer) appendable).append(buffer, 0, size);
        } }else {__CLR4_5_2edtedtlvha7bn1.R.inc(19901);if ((((appendable instanceof CharBuffer)&&(__CLR4_5_2edtedtlvha7bn1.R.iget(19902)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(19903)==0&false))) {{
            __CLR4_5_2edtedtlvha7bn1.R.inc(19904);((CharBuffer) appendable).put(buffer, 0, size);
        } }else {{
            __CLR4_5_2edtedtlvha7bn1.R.inc(19905);appendable.append(this);
        }
    }}}}}finally{__CLR4_5_2edtedtlvha7bn1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
//    /**
//     * Gets a String version of the string builder by calling the internal
//     * constructor of String by reflection.
//     * <p>
//     * WARNING: You must not use the StrBuilder after calling this method
//     * as the buffer is now shared with the String object. To ensure this,
//     * the internal character array is set to null, so you will get
//     * NullPointerExceptions on all method calls.
//     *
//     * @return the builder as a String
//     */
//    public String toSharedString() {
//        try {
//            Constructor con = String.class.getDeclaredConstructor(
//                new Class[] {int.class, int.class, char[].class});
//            con.setAccessible(true);
//            char[] buffer = buf;
//            buf = null;
//            size = -1;
//            nullText = null;
//            return (String) con.newInstance(
//                new Object[] {Integer.valueOf(0), Integer.valueOf(size), buffer});
//            
//        } catch (Exception ex) {
//            ex.printStackTrace();
//            throw new UnsupportedOperationException("StrBuilder.toSharedString is unsupported: " + ex.getMessage());
//        }
//    }

    //-----------------------------------------------------------------------
    /**
     * Checks the contents of this builder against another to see if they
     * contain the same character content ignoring case.
     *
     * @param other  the object to check, null returns false
     * @return true if the builders contain the same characters in the same order
     */
    public boolean equalsIgnoreCase(final StrBuilder other) {try{__CLR4_5_2edtedtlvha7bn1.R.inc(19906);
        __CLR4_5_2edtedtlvha7bn1.R.inc(19907);if ((((this == other)&&(__CLR4_5_2edtedtlvha7bn1.R.iget(19908)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(19909)==0&false))) {{
            __CLR4_5_2edtedtlvha7bn1.R.inc(19910);return true;
        }
        }__CLR4_5_2edtedtlvha7bn1.R.inc(19911);if ((((this.size != other.size)&&(__CLR4_5_2edtedtlvha7bn1.R.iget(19912)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(19913)==0&false))) {{
            __CLR4_5_2edtedtlvha7bn1.R.inc(19914);return false;
        }
        }__CLR4_5_2edtedtlvha7bn1.R.inc(19915);final char thisBuf[] = this.buffer;
        __CLR4_5_2edtedtlvha7bn1.R.inc(19916);final char otherBuf[] = other.buffer;
        __CLR4_5_2edtedtlvha7bn1.R.inc(19917);for (int i = size - 1; (((i >= 0)&&(__CLR4_5_2edtedtlvha7bn1.R.iget(19918)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(19919)==0&false)); i--) {{
            __CLR4_5_2edtedtlvha7bn1.R.inc(19920);final char c1 = thisBuf[i];
            __CLR4_5_2edtedtlvha7bn1.R.inc(19921);final char c2 = otherBuf[i];
            __CLR4_5_2edtedtlvha7bn1.R.inc(19922);if ((((c1 != c2 && Character.toUpperCase(c1) != Character.toUpperCase(c2))&&(__CLR4_5_2edtedtlvha7bn1.R.iget(19923)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(19924)==0&false))) {{
                __CLR4_5_2edtedtlvha7bn1.R.inc(19925);return false;
            }
        }}
        }__CLR4_5_2edtedtlvha7bn1.R.inc(19926);return true;
    }finally{__CLR4_5_2edtedtlvha7bn1.R.flushNeeded();}}

    /**
     * Checks the contents of this builder against another to see if they
     * contain the same character content.
     *
     * @param other  the object to check, null returns false
     * @return true if the builders contain the same characters in the same order
     */
    public boolean equals(final StrBuilder other) {try{__CLR4_5_2edtedtlvha7bn1.R.inc(19927);
        __CLR4_5_2edtedtlvha7bn1.R.inc(19928);if ((((this == other)&&(__CLR4_5_2edtedtlvha7bn1.R.iget(19929)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(19930)==0&false))) {{
            __CLR4_5_2edtedtlvha7bn1.R.inc(19931);return true;
        }
        }__CLR4_5_2edtedtlvha7bn1.R.inc(19932);if ((((other == null)&&(__CLR4_5_2edtedtlvha7bn1.R.iget(19933)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(19934)==0&false))) {{
            __CLR4_5_2edtedtlvha7bn1.R.inc(19935);return false;
        }
        }__CLR4_5_2edtedtlvha7bn1.R.inc(19936);if ((((this.size != other.size)&&(__CLR4_5_2edtedtlvha7bn1.R.iget(19937)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(19938)==0&false))) {{
            __CLR4_5_2edtedtlvha7bn1.R.inc(19939);return false;
        }
        }__CLR4_5_2edtedtlvha7bn1.R.inc(19940);final char thisBuf[] = this.buffer;
        __CLR4_5_2edtedtlvha7bn1.R.inc(19941);final char otherBuf[] = other.buffer;
        __CLR4_5_2edtedtlvha7bn1.R.inc(19942);for (int i = size - 1; (((i >= 0)&&(__CLR4_5_2edtedtlvha7bn1.R.iget(19943)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(19944)==0&false)); i--) {{
            __CLR4_5_2edtedtlvha7bn1.R.inc(19945);if ((((thisBuf[i] != otherBuf[i])&&(__CLR4_5_2edtedtlvha7bn1.R.iget(19946)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(19947)==0&false))) {{
                __CLR4_5_2edtedtlvha7bn1.R.inc(19948);return false;
            }
        }}
        }__CLR4_5_2edtedtlvha7bn1.R.inc(19949);return true;
    }finally{__CLR4_5_2edtedtlvha7bn1.R.flushNeeded();}}

    /**
     * Checks the contents of this builder against another to see if they
     * contain the same character content.
     *
     * @param obj  the object to check, null returns false
     * @return true if the builders contain the same characters in the same order
     */
    @Override
    public boolean equals(final Object obj) {try{__CLR4_5_2edtedtlvha7bn1.R.inc(19950);
        __CLR4_5_2edtedtlvha7bn1.R.inc(19951);return obj instanceof StrBuilder && equals((StrBuilder) obj);
    }finally{__CLR4_5_2edtedtlvha7bn1.R.flushNeeded();}}

    /**
     * Gets a suitable hash code for this builder.
     *
     * @return a hash code
     */
    @Override
    public int hashCode() {try{__CLR4_5_2edtedtlvha7bn1.R.inc(19952);
        __CLR4_5_2edtedtlvha7bn1.R.inc(19953);final char buf[] = buffer;
        __CLR4_5_2edtedtlvha7bn1.R.inc(19954);int hash = 0;
        __CLR4_5_2edtedtlvha7bn1.R.inc(19955);for (int i = size - 1; (((i >= 0)&&(__CLR4_5_2edtedtlvha7bn1.R.iget(19956)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(19957)==0&false)); i--) {{
            __CLR4_5_2edtedtlvha7bn1.R.inc(19958);hash = 31 * hash + buf[i];
        }
        }__CLR4_5_2edtedtlvha7bn1.R.inc(19959);return hash;
    }finally{__CLR4_5_2edtedtlvha7bn1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Gets a String version of the string builder, creating a new instance
     * each time the method is called.
     * <p>
     * Note that unlike StringBuffer, the string version returned is
     * independent of the string builder.
     *
     * @return the builder as a String
     */
    @Override
    public String toString() {try{__CLR4_5_2edtedtlvha7bn1.R.inc(19960);
        __CLR4_5_2edtedtlvha7bn1.R.inc(19961);return new String(buffer, 0, size);
    }finally{__CLR4_5_2edtedtlvha7bn1.R.flushNeeded();}}

    /**
     * Gets a StringBuffer version of the string builder, creating a
     * new instance each time the method is called.
     *
     * @return the builder as a StringBuffer
     */
    public StringBuffer toStringBuffer() {try{__CLR4_5_2edtedtlvha7bn1.R.inc(19962);
        __CLR4_5_2edtedtlvha7bn1.R.inc(19963);return new StringBuffer(size).append(buffer, 0, size);
    }finally{__CLR4_5_2edtedtlvha7bn1.R.flushNeeded();}}

    /**
     * Gets a StringBuilder version of the string builder, creating a
     * new instance each time the method is called.
     *
     * @return the builder as a StringBuilder
     * @since 3.2
     */
    public StringBuilder toStringBuilder() {try{__CLR4_5_2edtedtlvha7bn1.R.inc(19964);
        __CLR4_5_2edtedtlvha7bn1.R.inc(19965);return new StringBuilder(size).append(buffer, 0, size);
    }finally{__CLR4_5_2edtedtlvha7bn1.R.flushNeeded();}}

    /**
     * Implement the {@link Builder} interface.
     * @return the builder as a String
     * @since 3.2
     * @see #toString()
     */
    @Override
    public String build() {try{__CLR4_5_2edtedtlvha7bn1.R.inc(19966);
        __CLR4_5_2edtedtlvha7bn1.R.inc(19967);return toString();
    }finally{__CLR4_5_2edtedtlvha7bn1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Validates parameters defining a range of the builder.
     * 
     * @param startIndex  the start index, inclusive, must be valid
     * @param endIndex  the end index, exclusive, must be valid except
     *  that if too large it is treated as end of string
     * @return the new string
     * @throws IndexOutOfBoundsException if the index is invalid
     */
    protected int validateRange(final int startIndex, int endIndex) {try{__CLR4_5_2edtedtlvha7bn1.R.inc(19968);
        __CLR4_5_2edtedtlvha7bn1.R.inc(19969);if ((((startIndex < 0)&&(__CLR4_5_2edtedtlvha7bn1.R.iget(19970)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(19971)==0&false))) {{
            __CLR4_5_2edtedtlvha7bn1.R.inc(19972);throw new StringIndexOutOfBoundsException(startIndex);
        }
        }__CLR4_5_2edtedtlvha7bn1.R.inc(19973);if ((((endIndex > size)&&(__CLR4_5_2edtedtlvha7bn1.R.iget(19974)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(19975)==0&false))) {{
            __CLR4_5_2edtedtlvha7bn1.R.inc(19976);endIndex = size;
        }
        }__CLR4_5_2edtedtlvha7bn1.R.inc(19977);if ((((startIndex > endIndex)&&(__CLR4_5_2edtedtlvha7bn1.R.iget(19978)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(19979)==0&false))) {{
            __CLR4_5_2edtedtlvha7bn1.R.inc(19980);throw new StringIndexOutOfBoundsException("end < start");
        }
        }__CLR4_5_2edtedtlvha7bn1.R.inc(19981);return endIndex;
    }finally{__CLR4_5_2edtedtlvha7bn1.R.flushNeeded();}}

    /**
     * Validates parameters defining a single index in the builder.
     * 
     * @param index  the index, must be valid
     * @throws IndexOutOfBoundsException if the index is invalid
     */
    protected void validateIndex(final int index) {try{__CLR4_5_2edtedtlvha7bn1.R.inc(19982);
        __CLR4_5_2edtedtlvha7bn1.R.inc(19983);if ((((index < 0 || index > size)&&(__CLR4_5_2edtedtlvha7bn1.R.iget(19984)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(19985)==0&false))) {{
            __CLR4_5_2edtedtlvha7bn1.R.inc(19986);throw new StringIndexOutOfBoundsException(index);
        }
    }}finally{__CLR4_5_2edtedtlvha7bn1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Inner class to allow StrBuilder to operate as a tokenizer.
     */
    class StrBuilderTokenizer extends StrTokenizer {

        /**
         * Default constructor.
         */
        StrBuilderTokenizer() {
            super();__CLR4_5_2edtedtlvha7bn1.R.inc(19988);try{__CLR4_5_2edtedtlvha7bn1.R.inc(19987);
        }finally{__CLR4_5_2edtedtlvha7bn1.R.flushNeeded();}}

        /** {@inheritDoc} */
        @Override
        protected List<String> tokenize(final char[] chars, final int offset, final int count) {try{__CLR4_5_2edtedtlvha7bn1.R.inc(19989);
            __CLR4_5_2edtedtlvha7bn1.R.inc(19990);if ((((chars == null)&&(__CLR4_5_2edtedtlvha7bn1.R.iget(19991)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(19992)==0&false))) {{
                __CLR4_5_2edtedtlvha7bn1.R.inc(19993);return super.tokenize(StrBuilder.this.buffer, 0, StrBuilder.this.size());
            }
            }__CLR4_5_2edtedtlvha7bn1.R.inc(19994);return super.tokenize(chars, offset, count);
        }finally{__CLR4_5_2edtedtlvha7bn1.R.flushNeeded();}}

        /** {@inheritDoc} */
        @Override
        public String getContent() {try{__CLR4_5_2edtedtlvha7bn1.R.inc(19995);
            __CLR4_5_2edtedtlvha7bn1.R.inc(19996);final String str = super.getContent();
            __CLR4_5_2edtedtlvha7bn1.R.inc(19997);if ((((str == null)&&(__CLR4_5_2edtedtlvha7bn1.R.iget(19998)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(19999)==0&false))) {{
                __CLR4_5_2edtedtlvha7bn1.R.inc(20000);return StrBuilder.this.toString();
            }
            }__CLR4_5_2edtedtlvha7bn1.R.inc(20001);return str;
        }finally{__CLR4_5_2edtedtlvha7bn1.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    /**
     * Inner class to allow StrBuilder to operate as a reader.
     */
    class StrBuilderReader extends Reader {
        /** The current stream position. */
        private int pos;
        /** The last mark position. */
        private int mark;

        /**
         * Default constructor.
         */
        StrBuilderReader() {
            super();__CLR4_5_2edtedtlvha7bn1.R.inc(20003);try{__CLR4_5_2edtedtlvha7bn1.R.inc(20002);
        }finally{__CLR4_5_2edtedtlvha7bn1.R.flushNeeded();}}

        /** {@inheritDoc} */
        @Override
        public void close() {try{__CLR4_5_2edtedtlvha7bn1.R.inc(20004);
            // do nothing
        }finally{__CLR4_5_2edtedtlvha7bn1.R.flushNeeded();}}

        /** {@inheritDoc} */
        @Override
        public int read() {try{__CLR4_5_2edtedtlvha7bn1.R.inc(20005);
            __CLR4_5_2edtedtlvha7bn1.R.inc(20006);if ((((ready() == false)&&(__CLR4_5_2edtedtlvha7bn1.R.iget(20007)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(20008)==0&false))) {{
                __CLR4_5_2edtedtlvha7bn1.R.inc(20009);return -1;
            }
            }__CLR4_5_2edtedtlvha7bn1.R.inc(20010);return StrBuilder.this.charAt(pos++);
        }finally{__CLR4_5_2edtedtlvha7bn1.R.flushNeeded();}}

        /** {@inheritDoc} */
        @Override
        public int read(final char b[], final int off, int len) {try{__CLR4_5_2edtedtlvha7bn1.R.inc(20011);
            __CLR4_5_2edtedtlvha7bn1.R.inc(20012);if ((((off < 0 || len < 0 || off > b.length ||
                    (off + len) > b.length || (off + len) < 0)&&(__CLR4_5_2edtedtlvha7bn1.R.iget(20013)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(20014)==0&false))) {{
                __CLR4_5_2edtedtlvha7bn1.R.inc(20015);throw new IndexOutOfBoundsException();
            }
            }__CLR4_5_2edtedtlvha7bn1.R.inc(20016);if ((((len == 0)&&(__CLR4_5_2edtedtlvha7bn1.R.iget(20017)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(20018)==0&false))) {{
                __CLR4_5_2edtedtlvha7bn1.R.inc(20019);return 0;
            }
            }__CLR4_5_2edtedtlvha7bn1.R.inc(20020);if ((((pos >= StrBuilder.this.size())&&(__CLR4_5_2edtedtlvha7bn1.R.iget(20021)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(20022)==0&false))) {{
                __CLR4_5_2edtedtlvha7bn1.R.inc(20023);return -1;
            }
            }__CLR4_5_2edtedtlvha7bn1.R.inc(20024);if ((((pos + len > size())&&(__CLR4_5_2edtedtlvha7bn1.R.iget(20025)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(20026)==0&false))) {{
                __CLR4_5_2edtedtlvha7bn1.R.inc(20027);len = StrBuilder.this.size() - pos;
            }
            }__CLR4_5_2edtedtlvha7bn1.R.inc(20028);StrBuilder.this.getChars(pos, pos + len, b, off);
            __CLR4_5_2edtedtlvha7bn1.R.inc(20029);pos += len;
            __CLR4_5_2edtedtlvha7bn1.R.inc(20030);return len;
        }finally{__CLR4_5_2edtedtlvha7bn1.R.flushNeeded();}}

        /** {@inheritDoc} */
        @Override
        public long skip(long n) {try{__CLR4_5_2edtedtlvha7bn1.R.inc(20031);
            __CLR4_5_2edtedtlvha7bn1.R.inc(20032);if ((((pos + n > StrBuilder.this.size())&&(__CLR4_5_2edtedtlvha7bn1.R.iget(20033)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(20034)==0&false))) {{
                __CLR4_5_2edtedtlvha7bn1.R.inc(20035);n = StrBuilder.this.size() - pos;
            }
            }__CLR4_5_2edtedtlvha7bn1.R.inc(20036);if ((((n < 0)&&(__CLR4_5_2edtedtlvha7bn1.R.iget(20037)!=0|true))||(__CLR4_5_2edtedtlvha7bn1.R.iget(20038)==0&false))) {{
                __CLR4_5_2edtedtlvha7bn1.R.inc(20039);return 0;
            }
            }__CLR4_5_2edtedtlvha7bn1.R.inc(20040);pos += n;
            __CLR4_5_2edtedtlvha7bn1.R.inc(20041);return n;
        }finally{__CLR4_5_2edtedtlvha7bn1.R.flushNeeded();}}

        /** {@inheritDoc} */
        @Override
        public boolean ready() {try{__CLR4_5_2edtedtlvha7bn1.R.inc(20042);
            __CLR4_5_2edtedtlvha7bn1.R.inc(20043);return pos < StrBuilder.this.size();
        }finally{__CLR4_5_2edtedtlvha7bn1.R.flushNeeded();}}

        /** {@inheritDoc} */
        @Override
        public boolean markSupported() {try{__CLR4_5_2edtedtlvha7bn1.R.inc(20044);
            __CLR4_5_2edtedtlvha7bn1.R.inc(20045);return true;
        }finally{__CLR4_5_2edtedtlvha7bn1.R.flushNeeded();}}

        /** {@inheritDoc} */
        @Override
        public void mark(final int readAheadLimit) {try{__CLR4_5_2edtedtlvha7bn1.R.inc(20046);
            __CLR4_5_2edtedtlvha7bn1.R.inc(20047);mark = pos;
        }finally{__CLR4_5_2edtedtlvha7bn1.R.flushNeeded();}}

        /** {@inheritDoc} */
        @Override
        public void reset() {try{__CLR4_5_2edtedtlvha7bn1.R.inc(20048);
            __CLR4_5_2edtedtlvha7bn1.R.inc(20049);pos = mark;
        }finally{__CLR4_5_2edtedtlvha7bn1.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    /**
     * Inner class to allow StrBuilder to operate as a writer.
     */
    class StrBuilderWriter extends Writer {

        /**
         * Default constructor.
         */
        StrBuilderWriter() {
            super();__CLR4_5_2edtedtlvha7bn1.R.inc(20051);try{__CLR4_5_2edtedtlvha7bn1.R.inc(20050);
        }finally{__CLR4_5_2edtedtlvha7bn1.R.flushNeeded();}}

        /** {@inheritDoc} */
        @Override
        public void close() {try{__CLR4_5_2edtedtlvha7bn1.R.inc(20052);
            // do nothing
        }finally{__CLR4_5_2edtedtlvha7bn1.R.flushNeeded();}}

        /** {@inheritDoc} */
        @Override
        public void flush() {try{__CLR4_5_2edtedtlvha7bn1.R.inc(20053);
            // do nothing
        }finally{__CLR4_5_2edtedtlvha7bn1.R.flushNeeded();}}

        /** {@inheritDoc} */
        @Override
        public void write(final int c) {try{__CLR4_5_2edtedtlvha7bn1.R.inc(20054);
            __CLR4_5_2edtedtlvha7bn1.R.inc(20055);StrBuilder.this.append((char) c);
        }finally{__CLR4_5_2edtedtlvha7bn1.R.flushNeeded();}}

        /** {@inheritDoc} */
        @Override
        public void write(final char[] cbuf) {try{__CLR4_5_2edtedtlvha7bn1.R.inc(20056);
            __CLR4_5_2edtedtlvha7bn1.R.inc(20057);StrBuilder.this.append(cbuf);
        }finally{__CLR4_5_2edtedtlvha7bn1.R.flushNeeded();}}

        /** {@inheritDoc} */
        @Override
        public void write(final char[] cbuf, final int off, final int len) {try{__CLR4_5_2edtedtlvha7bn1.R.inc(20058);
            __CLR4_5_2edtedtlvha7bn1.R.inc(20059);StrBuilder.this.append(cbuf, off, len);
        }finally{__CLR4_5_2edtedtlvha7bn1.R.flushNeeded();}}

        /** {@inheritDoc} */
        @Override
        public void write(final String str) {try{__CLR4_5_2edtedtlvha7bn1.R.inc(20060);
            __CLR4_5_2edtedtlvha7bn1.R.inc(20061);StrBuilder.this.append(str);
        }finally{__CLR4_5_2edtedtlvha7bn1.R.flushNeeded();}}

        /** {@inheritDoc} */
        @Override
        public void write(final String str, final int off, final int len) {try{__CLR4_5_2edtedtlvha7bn1.R.inc(20062);
            __CLR4_5_2edtedtlvha7bn1.R.inc(20063);StrBuilder.this.append(str, off, len);
        }finally{__CLR4_5_2edtedtlvha7bn1.R.flushNeeded();}}
    }

}
