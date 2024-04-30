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

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;

/**
 * <p>Operations on Strings that contain words.</p>
 * 
 * <p>This class tries to handle <code>null</code> input gracefully.
 * An exception will not be thrown for a <code>null</code> input.
 * Each method documents its behaviour in more detail.</p>
 * 
 * @since 2.0
 */
public class WordUtils {public static class __CLR4_5_2g5lg5llvha7btg{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172755542L,8589935092L,21166,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * <p><code>WordUtils</code> instances should NOT be constructed in
     * standard programming. Instead, the class should be used as
     * <code>WordUtils.wrap("foo bar", 20);</code>.</p>
     *
     * <p>This constructor is public to permit tools that require a JavaBean
     * instance to operate.</p>
     */
    public WordUtils() {
      super();__CLR4_5_2g5lg5llvha7btg.R.inc(20938);try{__CLR4_5_2g5lg5llvha7btg.R.inc(20937);
    }finally{__CLR4_5_2g5lg5llvha7btg.R.flushNeeded();}}

    // Wrapping
    //--------------------------------------------------------------------------
    /**
     * <p>Wraps a single line of text, identifying words by <code>' '</code>.</p>
     * 
     * <p>New lines will be separated by the system property line separator.
     * Very long words, such as URLs will <i>not</i> be wrapped.</p>
     * 
     * <p>Leading spaces on a new line are stripped.
     * Trailing spaces are not stripped.</p>
     *
     * <table border="1" summary="Wrap Results">
     *  <tr>
     *   <th>input</th>
     *   <th>wrapLength</th>
     *   <th>result</th>
     *  </tr>
     *  <tr>
     *   <td>null</td>
     *   <td>*</td>
     *   <td>null</td>
     *  </tr>
     *  <tr>
     *   <td>""</td>
     *   <td>*</td>
     *   <td>""</td>
     *  </tr>
     *  <tr>
     *   <td>"Here is one line of text that is going to be wrapped after 20 columns."</td>
     *   <td>20</td>
     *   <td>"Here is one line of\ntext that is going\nto be wrapped after\n20 columns."</td>
     *  </tr>
     *  <tr>
     *   <td>"Click here to jump to the commons website - http://commons.apache.org"</td>
     *   <td>20</td>
     *   <td>"Click here to jump\nto the commons\nwebsite -\nhttp://commons.apache.org"</td>
     *  </tr>
     *  <tr>
     *   <td>"Click here, http://commons.apache.org, to jump to the commons website"</td>
     *   <td>20</td>
     *   <td>"Click here,\nhttp://commons.apache.org,\nto jump to the\ncommons website"</td>
     *  </tr>
     * </table>
     *
     * (assuming that '\n' is the systems line separator)
     *
     * @param str  the String to be word wrapped, may be null
     * @param wrapLength  the column to wrap the words at, less than 1 is treated as 1
     * @return a line with newlines inserted, <code>null</code> if null input
     */
    public static String wrap(final String str, final int wrapLength) {try{__CLR4_5_2g5lg5llvha7btg.R.inc(20939);
        __CLR4_5_2g5lg5llvha7btg.R.inc(20940);return wrap(str, wrapLength, null, false);
    }finally{__CLR4_5_2g5lg5llvha7btg.R.flushNeeded();}}
    
    /**
     * <p>Wraps a single line of text, identifying words by <code>' '</code>.</p>
     * 
     * <p>Leading spaces on a new line are stripped.
     * Trailing spaces are not stripped.</p>
     *
     * <table border="1" summary="Wrap Results">
     *  <tr>
     *   <th>input</th>
     *   <th>wrapLength</th>
     *   <th>newLineString</th>
     *   <th>wrapLongWords</th>
     *   <th>result</th>
     *  </tr>
     *  <tr>
     *   <td>null</td>
     *   <td>*</td>
     *   <td>*</td>
     *   <td>true/false</td>
     *   <td>null</td>
     *  </tr>
     *  <tr>
     *   <td>""</td>
     *   <td>*</td>
     *   <td>*</td>
     *   <td>true/false</td>
     *   <td>""</td>
     *  </tr>
     *  <tr>
     *   <td>"Here is one line of text that is going to be wrapped after 20 columns."</td>
     *   <td>20</td>
     *   <td>"\n"</td>
     *   <td>true/false</td>
     *   <td>"Here is one line of\ntext that is going\nto be wrapped after\n20 columns."</td>
     *  </tr>
     *  <tr>
     *   <td>"Here is one line of text that is going to be wrapped after 20 columns."</td>
     *   <td>20</td>
     *   <td>"&lt;br /&gt;"</td>
     *   <td>true/false</td>
     *   <td>"Here is one line of&lt;br /&gt;text that is going&lt;br /&gt;to be wrapped after&lt;br /&gt;20 columns."</td>
     *  </tr>
     *  <tr>
     *   <td>"Here is one line of text that is going to be wrapped after 20 columns."</td>
     *   <td>20</td>
     *   <td>null</td>
     *   <td>true/false</td>
     *   <td>"Here is one line of" + systemNewLine + "text that is going" + systemNewLine + "to be wrapped after" + systemNewLine + "20 columns."</td>
     *  </tr>
     *  <tr>
     *   <td>"Click here to jump to the commons website - http://commons.apache.org"</td>
     *   <td>20</td>
     *   <td>"\n"</td>
     *   <td>false</td>
     *   <td>"Click here to jump\nto the commons\nwebsite -\nhttp://commons.apache.org"</td>
     *  </tr>
     *  <tr>
     *   <td>"Click here to jump to the commons website - http://commons.apache.org"</td>
     *   <td>20</td>
     *   <td>"\n"</td>
     *   <td>true</td>
     *   <td>"Click here to jump\nto the commons\nwebsite -\nhttp://commons.apach\ne.org"</td>
     *  </tr>
     * </table>
     *
     * @param str  the String to be word wrapped, may be null
     * @param wrapLength  the column to wrap the words at, less than 1 is treated as 1
     * @param newLineStr  the string to insert for a new line, 
     *  <code>null</code> uses the system property line separator
     * @param wrapLongWords  true if long words (such as URLs) should be wrapped
     * @return a line with newlines inserted, <code>null</code> if null input
     */
    public static String wrap(final String str, final int wrapLength, final String newLineStr, final boolean wrapLongWords) {try{__CLR4_5_2g5lg5llvha7btg.R.inc(20941);
        __CLR4_5_2g5lg5llvha7btg.R.inc(20942);return wrap(str, wrapLength, newLineStr, wrapLongWords, " ");
    }finally{__CLR4_5_2g5lg5llvha7btg.R.flushNeeded();}}

    /**
     * <p>Wraps a single line of text, identifying words by <code>wrapOn</code>.</p>
     *
     * <p>Leading spaces on a new line are stripped.
     * Trailing spaces are not stripped.</p>
     *
     * <table border="1" summary="Wrap Results">
     *  <tr>
     *   <th>input</th>
     *   <th>wrapLength</th>
     *   <th>newLineString</th>
     *   <th>wrapLongWords</th>
     *   <th>wrapOn</th>
     *   <th>result</th>
     *  </tr>
     *  <tr>
     *   <td>null</td>
     *   <td>*</td>
     *   <td>*</td>
     *   <td>true/false</td>
     *   <td>*</td>
     *   <td>null</td>
     *  </tr>
     *  <tr>
     *   <td>""</td>
     *   <td>*</td>
     *   <td>*</td>
     *   <td>true/false</td>
     *   <td>*</td>
     *   <td>""</td>
     *  </tr>
     *  <tr>
     *   <td>"Here is one line of text that is going to be wrapped after 20 columns."</td>
     *   <td>20</td>
     *   <td>"\n"</td>
     *   <td>true/false</td>
     *   <td>" "</td>
     *   <td>"Here is one line of\ntext that is going\nto be wrapped after\n20 columns."</td>
     *  </tr>
     *  <tr>
     *   <td>"Here is one line of text that is going to be wrapped after 20 columns."</td>
     *   <td>20</td>
     *   <td>"&lt;br /&gt;"</td>
     *   <td>true/false</td>
     *   <td>" "</td>
     *   <td>"Here is one line of&lt;br /&gt;text that is going&lt;br /&gt;to be wrapped after&lt;br /&gt;20 columns."</td>
     *  </tr>
     *  <tr>
     *   <td>"Here is one line of text that is going to be wrapped after 20 columns."</td>
     *   <td>20</td>
     *   <td>null</td>
     *   <td>true/false</td>
     *   <td>" "</td>
     *   <td>"Here is one line of" + systemNewLine + "text that is going" + systemNewLine + "to be wrapped after" + systemNewLine + "20 columns."</td>
     *  </tr>
     *  <tr>
     *   <td>"Click here to jump to the commons website - http://commons.apache.org"</td>
     *   <td>20</td>
     *   <td>"\n"</td>
     *   <td>false</td>
     *   <td>" "</td>
     *   <td>"Click here to jump\nto the commons\nwebsite -\nhttp://commons.apache.org"</td>
     *  </tr>
     *  <tr>
     *   <td>"Click here to jump to the commons website - http://commons.apache.org"</td>
     *   <td>20</td>
     *   <td>"\n"</td>
     *   <td>true</td>
     *   <td>" "</td>
     *   <td>"Click here to jump\nto the commons\nwebsite -\nhttp://commons.apach\ne.org"</td>
     *  </tr>
     *  <tr>
     *   <td>"flammable/inflammable"</td>
     *   <td>20</td>
     *   <td>"\n"</td>
     *   <td>true</td>
     *   <td>"/"</td>
     *   <td>"flammable\ninflammable"</td>
     *  </tr>
     * </table>
     * @param str  the String to be word wrapped, may be null
     * @param wrapLength  the column to wrap the words at, less than 1 is treated as 1
     * @param newLineStr  the string to insert for a new line,
     *  <code>null</code> uses the system property line separator
     * @param wrapLongWords  true if long words (such as URLs) should be wrapped
     * @param wrapOn regex expression to be used as a breakable characters,
     *               if blank string is provided a space character will be used
     * @return a line with newlines inserted, <code>null</code> if null input
     */
    public static String wrap(final String str, int wrapLength, String newLineStr, final boolean wrapLongWords, String wrapOn) {try{__CLR4_5_2g5lg5llvha7btg.R.inc(20943);
        __CLR4_5_2g5lg5llvha7btg.R.inc(20944);if ((((str == null)&&(__CLR4_5_2g5lg5llvha7btg.R.iget(20945)!=0|true))||(__CLR4_5_2g5lg5llvha7btg.R.iget(20946)==0&false))) {{
            __CLR4_5_2g5lg5llvha7btg.R.inc(20947);return null;
        }
        }__CLR4_5_2g5lg5llvha7btg.R.inc(20948);if ((((newLineStr == null)&&(__CLR4_5_2g5lg5llvha7btg.R.iget(20949)!=0|true))||(__CLR4_5_2g5lg5llvha7btg.R.iget(20950)==0&false))) {{
            __CLR4_5_2g5lg5llvha7btg.R.inc(20951);newLineStr = System.lineSeparator();
        }
        }__CLR4_5_2g5lg5llvha7btg.R.inc(20952);if ((((wrapLength < 1)&&(__CLR4_5_2g5lg5llvha7btg.R.iget(20953)!=0|true))||(__CLR4_5_2g5lg5llvha7btg.R.iget(20954)==0&false))) {{
            __CLR4_5_2g5lg5llvha7btg.R.inc(20955);wrapLength = 1;
        }
        }__CLR4_5_2g5lg5llvha7btg.R.inc(20956);if ((((StringUtils.isBlank(wrapOn))&&(__CLR4_5_2g5lg5llvha7btg.R.iget(20957)!=0|true))||(__CLR4_5_2g5lg5llvha7btg.R.iget(20958)==0&false))) {{
            __CLR4_5_2g5lg5llvha7btg.R.inc(20959);wrapOn = " ";
        }
        }__CLR4_5_2g5lg5llvha7btg.R.inc(20960);final Pattern patternToWrapOn = Pattern.compile(wrapOn);
        __CLR4_5_2g5lg5llvha7btg.R.inc(20961);final int inputLineLength = str.length();
        __CLR4_5_2g5lg5llvha7btg.R.inc(20962);int offset = 0;
        __CLR4_5_2g5lg5llvha7btg.R.inc(20963);final StringBuilder wrappedLine = new StringBuilder(inputLineLength + 32);

        __CLR4_5_2g5lg5llvha7btg.R.inc(20964);while ((((offset < inputLineLength)&&(__CLR4_5_2g5lg5llvha7btg.R.iget(20965)!=0|true))||(__CLR4_5_2g5lg5llvha7btg.R.iget(20966)==0&false))) {{
            __CLR4_5_2g5lg5llvha7btg.R.inc(20967);int spaceToWrapAt = -1;
            __CLR4_5_2g5lg5llvha7btg.R.inc(20968);Matcher matcher = patternToWrapOn.matcher(str.substring(offset, Math.min(offset + wrapLength + 1, inputLineLength)));
            __CLR4_5_2g5lg5llvha7btg.R.inc(20969);if ((((matcher.find())&&(__CLR4_5_2g5lg5llvha7btg.R.iget(20970)!=0|true))||(__CLR4_5_2g5lg5llvha7btg.R.iget(20971)==0&false))) {{
                __CLR4_5_2g5lg5llvha7btg.R.inc(20972);if ((((matcher.start() == 0)&&(__CLR4_5_2g5lg5llvha7btg.R.iget(20973)!=0|true))||(__CLR4_5_2g5lg5llvha7btg.R.iget(20974)==0&false))) {{
                    __CLR4_5_2g5lg5llvha7btg.R.inc(20975);offset += matcher.end();
                    __CLR4_5_2g5lg5llvha7btg.R.inc(20976);continue;
                }}else {{
                    __CLR4_5_2g5lg5llvha7btg.R.inc(20977);spaceToWrapAt = matcher.start() + offset;
                }
            }}

            // only last line without leading spaces is left
            }__CLR4_5_2g5lg5llvha7btg.R.inc(20978);if((((inputLineLength - offset <= wrapLength)&&(__CLR4_5_2g5lg5llvha7btg.R.iget(20979)!=0|true))||(__CLR4_5_2g5lg5llvha7btg.R.iget(20980)==0&false))) {{
                __CLR4_5_2g5lg5llvha7btg.R.inc(20981);break;
            }

            }__CLR4_5_2g5lg5llvha7btg.R.inc(20982);while((((matcher.find())&&(__CLR4_5_2g5lg5llvha7btg.R.iget(20983)!=0|true))||(__CLR4_5_2g5lg5llvha7btg.R.iget(20984)==0&false))){{
                __CLR4_5_2g5lg5llvha7btg.R.inc(20985);spaceToWrapAt = matcher.start() + offset;
            }

            }__CLR4_5_2g5lg5llvha7btg.R.inc(20986);if ((((spaceToWrapAt >= offset)&&(__CLR4_5_2g5lg5llvha7btg.R.iget(20987)!=0|true))||(__CLR4_5_2g5lg5llvha7btg.R.iget(20988)==0&false))) {{
                // normal case
                __CLR4_5_2g5lg5llvha7btg.R.inc(20989);wrappedLine.append(str.substring(offset, spaceToWrapAt));
                __CLR4_5_2g5lg5llvha7btg.R.inc(20990);wrappedLine.append(newLineStr);
                __CLR4_5_2g5lg5llvha7btg.R.inc(20991);offset = spaceToWrapAt + 1;

            } }else {{
                // really long word or URL
                __CLR4_5_2g5lg5llvha7btg.R.inc(20992);if ((((wrapLongWords)&&(__CLR4_5_2g5lg5llvha7btg.R.iget(20993)!=0|true))||(__CLR4_5_2g5lg5llvha7btg.R.iget(20994)==0&false))) {{
                    // wrap really long word one line at a time
                    __CLR4_5_2g5lg5llvha7btg.R.inc(20995);wrappedLine.append(str.substring(offset, wrapLength + offset));
                    __CLR4_5_2g5lg5llvha7btg.R.inc(20996);wrappedLine.append(newLineStr);
                    __CLR4_5_2g5lg5llvha7btg.R.inc(20997);offset += wrapLength;
                } }else {{
                    // do not wrap really long word, just extend beyond limit
                    __CLR4_5_2g5lg5llvha7btg.R.inc(20998);matcher = patternToWrapOn.matcher(str.substring(offset + wrapLength));
                    __CLR4_5_2g5lg5llvha7btg.R.inc(20999);if ((((matcher.find())&&(__CLR4_5_2g5lg5llvha7btg.R.iget(21000)!=0|true))||(__CLR4_5_2g5lg5llvha7btg.R.iget(21001)==0&false))) {{
                        __CLR4_5_2g5lg5llvha7btg.R.inc(21002);spaceToWrapAt = matcher.start() + offset + wrapLength;
                    }

                    }__CLR4_5_2g5lg5llvha7btg.R.inc(21003);if ((((spaceToWrapAt >= 0)&&(__CLR4_5_2g5lg5llvha7btg.R.iget(21004)!=0|true))||(__CLR4_5_2g5lg5llvha7btg.R.iget(21005)==0&false))) {{
                        __CLR4_5_2g5lg5llvha7btg.R.inc(21006);wrappedLine.append(str.substring(offset, spaceToWrapAt));
                        __CLR4_5_2g5lg5llvha7btg.R.inc(21007);wrappedLine.append(newLineStr);
                        __CLR4_5_2g5lg5llvha7btg.R.inc(21008);offset = spaceToWrapAt + 1;
                    } }else {{
                        __CLR4_5_2g5lg5llvha7btg.R.inc(21009);wrappedLine.append(str.substring(offset));
                        __CLR4_5_2g5lg5llvha7btg.R.inc(21010);offset = inputLineLength;
                    }
                }}
            }}
        }}

        // Whatever is left in line is short enough to just pass through
        }__CLR4_5_2g5lg5llvha7btg.R.inc(21011);wrappedLine.append(str.substring(offset));

        __CLR4_5_2g5lg5llvha7btg.R.inc(21012);return wrappedLine.toString();
    }finally{__CLR4_5_2g5lg5llvha7btg.R.flushNeeded();}}

    // Capitalizing
    //-----------------------------------------------------------------------
    /**
     * <p>Capitalizes all the whitespace separated words in a String.
     * Only the first character of each word is changed. To convert the 
     * rest of each word to lowercase at the same time, 
     * use {@link #capitalizeFully(String)}.</p>
     *
     * <p>Whitespace is defined by {@link Character#isWhitespace(char)}.
     * A <code>null</code> input String returns <code>null</code>.
     * Capitalization uses the Unicode title case, normally equivalent to
     * upper case.</p>
     *
     * <pre>
     * WordUtils.capitalize(null)        = null
     * WordUtils.capitalize("")          = ""
     * WordUtils.capitalize("i am FINE") = "I Am FINE"
     * </pre>
     * 
     * @param str  the String to capitalize, may be null
     * @return capitalized String, <code>null</code> if null String input
     * @see #uncapitalize(String)
     * @see #capitalizeFully(String)
     */
    public static String capitalize(final String str) {try{__CLR4_5_2g5lg5llvha7btg.R.inc(21013);
        __CLR4_5_2g5lg5llvha7btg.R.inc(21014);return capitalize(str, null);
    }finally{__CLR4_5_2g5lg5llvha7btg.R.flushNeeded();}}

    /**
     * <p>Capitalizes all the delimiter separated words in a String.
     * Only the first character of each word is changed. To convert the 
     * rest of each word to lowercase at the same time, 
     * use {@link #capitalizeFully(String, char[])}.</p>
     *
     * <p>The delimiters represent a set of characters understood to separate words.
     * The first string character and the first non-delimiter character after a
     * delimiter will be capitalized. </p>
     *
     * <p>A <code>null</code> input String returns <code>null</code>.
     * Capitalization uses the Unicode title case, normally equivalent to
     * upper case.</p>
     *
     * <pre>
     * WordUtils.capitalize(null, *)            = null
     * WordUtils.capitalize("", *)              = ""
     * WordUtils.capitalize(*, new char[0])     = *
     * WordUtils.capitalize("i am fine", null)  = "I Am Fine"
     * WordUtils.capitalize("i aM.fine", {'.'}) = "I aM.Fine"
     * </pre>
     * 
     * @param str  the String to capitalize, may be null
     * @param delimiters  set of characters to determine capitalization, null means whitespace
     * @return capitalized String, <code>null</code> if null String input
     * @see #uncapitalize(String)
     * @see #capitalizeFully(String)
     * @since 2.1
     */
    public static String capitalize(final String str, final char... delimiters) {try{__CLR4_5_2g5lg5llvha7btg.R.inc(21015);
        __CLR4_5_2g5lg5llvha7btg.R.inc(21016);final int delimLen = (((delimiters == null )&&(__CLR4_5_2g5lg5llvha7btg.R.iget(21017)!=0|true))||(__CLR4_5_2g5lg5llvha7btg.R.iget(21018)==0&false))? -1 : delimiters.length;
        __CLR4_5_2g5lg5llvha7btg.R.inc(21019);if ((((StringUtils.isEmpty(str) || delimLen == 0)&&(__CLR4_5_2g5lg5llvha7btg.R.iget(21020)!=0|true))||(__CLR4_5_2g5lg5llvha7btg.R.iget(21021)==0&false))) {{
            __CLR4_5_2g5lg5llvha7btg.R.inc(21022);return str;
        }
        }__CLR4_5_2g5lg5llvha7btg.R.inc(21023);final char[] buffer = str.toCharArray();
        __CLR4_5_2g5lg5llvha7btg.R.inc(21024);boolean capitalizeNext = true;
        __CLR4_5_2g5lg5llvha7btg.R.inc(21025);for (int i = 0; (((i < buffer.length)&&(__CLR4_5_2g5lg5llvha7btg.R.iget(21026)!=0|true))||(__CLR4_5_2g5lg5llvha7btg.R.iget(21027)==0&false)); i++) {{
            __CLR4_5_2g5lg5llvha7btg.R.inc(21028);final char ch = buffer[i];
            __CLR4_5_2g5lg5llvha7btg.R.inc(21029);if ((((isDelimiter(ch, delimiters))&&(__CLR4_5_2g5lg5llvha7btg.R.iget(21030)!=0|true))||(__CLR4_5_2g5lg5llvha7btg.R.iget(21031)==0&false))) {{
                __CLR4_5_2g5lg5llvha7btg.R.inc(21032);capitalizeNext = true;
            } }else {__CLR4_5_2g5lg5llvha7btg.R.inc(21033);if ((((capitalizeNext)&&(__CLR4_5_2g5lg5llvha7btg.R.iget(21034)!=0|true))||(__CLR4_5_2g5lg5llvha7btg.R.iget(21035)==0&false))) {{
                __CLR4_5_2g5lg5llvha7btg.R.inc(21036);buffer[i] = Character.toTitleCase(ch);
                __CLR4_5_2g5lg5llvha7btg.R.inc(21037);capitalizeNext = false;
            }
        }}}
        }__CLR4_5_2g5lg5llvha7btg.R.inc(21038);return new String(buffer);
    }finally{__CLR4_5_2g5lg5llvha7btg.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * <p>Converts all the whitespace separated words in a String into capitalized words, 
     * that is each word is made up of a titlecase character and then a series of 
     * lowercase characters.  </p>
     *
     * <p>Whitespace is defined by {@link Character#isWhitespace(char)}.
     * A <code>null</code> input String returns <code>null</code>.
     * Capitalization uses the Unicode title case, normally equivalent to
     * upper case.</p>
     *
     * <pre>
     * WordUtils.capitalizeFully(null)        = null
     * WordUtils.capitalizeFully("")          = ""
     * WordUtils.capitalizeFully("i am FINE") = "I Am Fine"
     * </pre>
     * 
     * @param str  the String to capitalize, may be null
     * @return capitalized String, <code>null</code> if null String input
     */
    public static String capitalizeFully(final String str) {try{__CLR4_5_2g5lg5llvha7btg.R.inc(21039);
        __CLR4_5_2g5lg5llvha7btg.R.inc(21040);return capitalizeFully(str, null);
    }finally{__CLR4_5_2g5lg5llvha7btg.R.flushNeeded();}}

    /**
     * <p>Converts all the delimiter separated words in a String into capitalized words, 
     * that is each word is made up of a titlecase character and then a series of 
     * lowercase characters. </p>
     *
     * <p>The delimiters represent a set of characters understood to separate words.
     * The first string character and the first non-delimiter character after a
     * delimiter will be capitalized. </p>
     *
     * <p>A <code>null</code> input String returns <code>null</code>.
     * Capitalization uses the Unicode title case, normally equivalent to
     * upper case.</p>
     *
     * <pre>
     * WordUtils.capitalizeFully(null, *)            = null
     * WordUtils.capitalizeFully("", *)              = ""
     * WordUtils.capitalizeFully(*, null)            = *
     * WordUtils.capitalizeFully(*, new char[0])     = *
     * WordUtils.capitalizeFully("i aM.fine", {'.'}) = "I am.Fine"
     * </pre>
     * 
     * @param str  the String to capitalize, may be null
     * @param delimiters  set of characters to determine capitalization, null means whitespace
     * @return capitalized String, <code>null</code> if null String input
     * @since 2.1
     */
    public static String capitalizeFully(String str, final char... delimiters) {try{__CLR4_5_2g5lg5llvha7btg.R.inc(21041);
        __CLR4_5_2g5lg5llvha7btg.R.inc(21042);final int delimLen = (((delimiters == null )&&(__CLR4_5_2g5lg5llvha7btg.R.iget(21043)!=0|true))||(__CLR4_5_2g5lg5llvha7btg.R.iget(21044)==0&false))? -1 : delimiters.length;
        __CLR4_5_2g5lg5llvha7btg.R.inc(21045);if ((((StringUtils.isEmpty(str) || delimLen == 0)&&(__CLR4_5_2g5lg5llvha7btg.R.iget(21046)!=0|true))||(__CLR4_5_2g5lg5llvha7btg.R.iget(21047)==0&false))) {{
            __CLR4_5_2g5lg5llvha7btg.R.inc(21048);return str;
        }
        }__CLR4_5_2g5lg5llvha7btg.R.inc(21049);str = str.toLowerCase();
        __CLR4_5_2g5lg5llvha7btg.R.inc(21050);return capitalize(str, delimiters);
    }finally{__CLR4_5_2g5lg5llvha7btg.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * <p>Uncapitalizes all the whitespace separated words in a String.
     * Only the first character of each word is changed.</p>
     *
     * <p>Whitespace is defined by {@link Character#isWhitespace(char)}.
     * A <code>null</code> input String returns <code>null</code>.</p>
     *
     * <pre>
     * WordUtils.uncapitalize(null)        = null
     * WordUtils.uncapitalize("")          = ""
     * WordUtils.uncapitalize("I Am FINE") = "i am fINE"
     * </pre>
     * 
     * @param str  the String to uncapitalize, may be null
     * @return uncapitalized String, <code>null</code> if null String input
     * @see #capitalize(String)
     */
    public static String uncapitalize(final String str) {try{__CLR4_5_2g5lg5llvha7btg.R.inc(21051);
        __CLR4_5_2g5lg5llvha7btg.R.inc(21052);return uncapitalize(str, null);
    }finally{__CLR4_5_2g5lg5llvha7btg.R.flushNeeded();}}

    /**
     * <p>Uncapitalizes all the whitespace separated words in a String.
     * Only the first character of each word is changed.</p>
     *
     * <p>The delimiters represent a set of characters understood to separate words.
     * The first string character and the first non-delimiter character after a
     * delimiter will be uncapitalized. </p>
     *
     * <p>Whitespace is defined by {@link Character#isWhitespace(char)}.
     * A <code>null</code> input String returns <code>null</code>.</p>
     *
     * <pre>
     * WordUtils.uncapitalize(null, *)            = null
     * WordUtils.uncapitalize("", *)              = ""
     * WordUtils.uncapitalize(*, null)            = *
     * WordUtils.uncapitalize(*, new char[0])     = *
     * WordUtils.uncapitalize("I AM.FINE", {'.'}) = "i AM.fINE"
     * </pre>
     * 
     * @param str  the String to uncapitalize, may be null
     * @param delimiters  set of characters to determine uncapitalization, null means whitespace
     * @return uncapitalized String, <code>null</code> if null String input
     * @see #capitalize(String)
     * @since 2.1
     */
    public static String uncapitalize(final String str, final char... delimiters) {try{__CLR4_5_2g5lg5llvha7btg.R.inc(21053);
        __CLR4_5_2g5lg5llvha7btg.R.inc(21054);final int delimLen = (((delimiters == null )&&(__CLR4_5_2g5lg5llvha7btg.R.iget(21055)!=0|true))||(__CLR4_5_2g5lg5llvha7btg.R.iget(21056)==0&false))? -1 : delimiters.length;
        __CLR4_5_2g5lg5llvha7btg.R.inc(21057);if ((((StringUtils.isEmpty(str) || delimLen == 0)&&(__CLR4_5_2g5lg5llvha7btg.R.iget(21058)!=0|true))||(__CLR4_5_2g5lg5llvha7btg.R.iget(21059)==0&false))) {{
            __CLR4_5_2g5lg5llvha7btg.R.inc(21060);return str;
        }
        }__CLR4_5_2g5lg5llvha7btg.R.inc(21061);final char[] buffer = str.toCharArray();
        __CLR4_5_2g5lg5llvha7btg.R.inc(21062);boolean uncapitalizeNext = true;
        __CLR4_5_2g5lg5llvha7btg.R.inc(21063);for (int i = 0; (((i < buffer.length)&&(__CLR4_5_2g5lg5llvha7btg.R.iget(21064)!=0|true))||(__CLR4_5_2g5lg5llvha7btg.R.iget(21065)==0&false)); i++) {{
            __CLR4_5_2g5lg5llvha7btg.R.inc(21066);final char ch = buffer[i];
            __CLR4_5_2g5lg5llvha7btg.R.inc(21067);if ((((isDelimiter(ch, delimiters))&&(__CLR4_5_2g5lg5llvha7btg.R.iget(21068)!=0|true))||(__CLR4_5_2g5lg5llvha7btg.R.iget(21069)==0&false))) {{
                __CLR4_5_2g5lg5llvha7btg.R.inc(21070);uncapitalizeNext = true;
            } }else {__CLR4_5_2g5lg5llvha7btg.R.inc(21071);if ((((uncapitalizeNext)&&(__CLR4_5_2g5lg5llvha7btg.R.iget(21072)!=0|true))||(__CLR4_5_2g5lg5llvha7btg.R.iget(21073)==0&false))) {{
                __CLR4_5_2g5lg5llvha7btg.R.inc(21074);buffer[i] = Character.toLowerCase(ch);
                __CLR4_5_2g5lg5llvha7btg.R.inc(21075);uncapitalizeNext = false;
            }
        }}}
        }__CLR4_5_2g5lg5llvha7btg.R.inc(21076);return new String(buffer);
    }finally{__CLR4_5_2g5lg5llvha7btg.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * <p>Swaps the case of a String using a word based algorithm.</p>
     * 
     * <ul>
     *  <li>Upper case character converts to Lower case</li>
     *  <li>Title case character converts to Lower case</li>
     *  <li>Lower case character after Whitespace or at start converts to Title case</li>
     *  <li>Other Lower case character converts to Upper case</li>
     * </ul>
     * 
     * <p>Whitespace is defined by {@link Character#isWhitespace(char)}.
     * A <code>null</code> input String returns <code>null</code>.</p>
     * 
     * <pre>
     * StringUtils.swapCase(null)                 = null
     * StringUtils.swapCase("")                   = ""
     * StringUtils.swapCase("The dog has a BONE") = "tHE DOG HAS A bone"
     * </pre>
     * 
     * @param str  the String to swap case, may be null
     * @return the changed String, <code>null</code> if null String input
     */
    public static String swapCase(final String str) {try{__CLR4_5_2g5lg5llvha7btg.R.inc(21077);
        __CLR4_5_2g5lg5llvha7btg.R.inc(21078);if ((((StringUtils.isEmpty(str))&&(__CLR4_5_2g5lg5llvha7btg.R.iget(21079)!=0|true))||(__CLR4_5_2g5lg5llvha7btg.R.iget(21080)==0&false))) {{
            __CLR4_5_2g5lg5llvha7btg.R.inc(21081);return str;
        }
        }__CLR4_5_2g5lg5llvha7btg.R.inc(21082);final char[] buffer = str.toCharArray();

        __CLR4_5_2g5lg5llvha7btg.R.inc(21083);boolean whitespace = true;

        __CLR4_5_2g5lg5llvha7btg.R.inc(21084);for (int i = 0; (((i < buffer.length)&&(__CLR4_5_2g5lg5llvha7btg.R.iget(21085)!=0|true))||(__CLR4_5_2g5lg5llvha7btg.R.iget(21086)==0&false)); i++) {{
            __CLR4_5_2g5lg5llvha7btg.R.inc(21087);final char ch = buffer[i];
            __CLR4_5_2g5lg5llvha7btg.R.inc(21088);if ((((Character.isUpperCase(ch))&&(__CLR4_5_2g5lg5llvha7btg.R.iget(21089)!=0|true))||(__CLR4_5_2g5lg5llvha7btg.R.iget(21090)==0&false))) {{
                __CLR4_5_2g5lg5llvha7btg.R.inc(21091);buffer[i] = Character.toLowerCase(ch);
                __CLR4_5_2g5lg5llvha7btg.R.inc(21092);whitespace = false;
            } }else {__CLR4_5_2g5lg5llvha7btg.R.inc(21093);if ((((Character.isTitleCase(ch))&&(__CLR4_5_2g5lg5llvha7btg.R.iget(21094)!=0|true))||(__CLR4_5_2g5lg5llvha7btg.R.iget(21095)==0&false))) {{
                __CLR4_5_2g5lg5llvha7btg.R.inc(21096);buffer[i] = Character.toLowerCase(ch);
                __CLR4_5_2g5lg5llvha7btg.R.inc(21097);whitespace = false;
            } }else {__CLR4_5_2g5lg5llvha7btg.R.inc(21098);if ((((Character.isLowerCase(ch))&&(__CLR4_5_2g5lg5llvha7btg.R.iget(21099)!=0|true))||(__CLR4_5_2g5lg5llvha7btg.R.iget(21100)==0&false))) {{
                __CLR4_5_2g5lg5llvha7btg.R.inc(21101);if ((((whitespace)&&(__CLR4_5_2g5lg5llvha7btg.R.iget(21102)!=0|true))||(__CLR4_5_2g5lg5llvha7btg.R.iget(21103)==0&false))) {{
                    __CLR4_5_2g5lg5llvha7btg.R.inc(21104);buffer[i] = Character.toTitleCase(ch);
                    __CLR4_5_2g5lg5llvha7btg.R.inc(21105);whitespace = false;
                } }else {{
                    __CLR4_5_2g5lg5llvha7btg.R.inc(21106);buffer[i] = Character.toUpperCase(ch);
                }
            }} }else {{
                __CLR4_5_2g5lg5llvha7btg.R.inc(21107);whitespace = Character.isWhitespace(ch);
            }
        }}}}
        }__CLR4_5_2g5lg5llvha7btg.R.inc(21108);return new String(buffer);
    }finally{__CLR4_5_2g5lg5llvha7btg.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * <p>Extracts the initial characters from each word in the String.</p>
     * 
     * <p>All first characters after whitespace are returned as a new string.
     * Their case is not changed.</p>
     *
     * <p>Whitespace is defined by {@link Character#isWhitespace(char)}.
     * A <code>null</code> input String returns <code>null</code>.</p>
     *
     * <pre>
     * WordUtils.initials(null)             = null
     * WordUtils.initials("")               = ""
     * WordUtils.initials("Ben John Lee")   = "BJL"
     * WordUtils.initials("Ben J.Lee")      = "BJ"
     * </pre>
     *
     * @param str  the String to get initials from, may be null
     * @return String of initial letters, <code>null</code> if null String input
     * @see #initials(String,char[])
     * @since 2.2
     */
    public static String initials(final String str) {try{__CLR4_5_2g5lg5llvha7btg.R.inc(21109);
        __CLR4_5_2g5lg5llvha7btg.R.inc(21110);return initials(str, null);
    }finally{__CLR4_5_2g5lg5llvha7btg.R.flushNeeded();}}

    /**
     * <p>Extracts the initial characters from each word in the String.</p>
     * 
     * <p>All first characters after the defined delimiters are returned as a new string.
     * Their case is not changed.</p>
     *
     * <p>If the delimiters array is null, then Whitespace is used.
     * Whitespace is defined by {@link Character#isWhitespace(char)}.
     * A <code>null</code> input String returns <code>null</code>.
     * An empty delimiter array returns an empty String.</p>
     *
     * <pre>
     * WordUtils.initials(null, *)                = null
     * WordUtils.initials("", *)                  = ""
     * WordUtils.initials("Ben John Lee", null)   = "BJL"
     * WordUtils.initials("Ben J.Lee", null)      = "BJ"
     * WordUtils.initials("Ben J.Lee", [' ','.']) = "BJL"
     * WordUtils.initials(*, new char[0])         = ""
     * </pre>
     * 
     * @param str  the String to get initials from, may be null
     * @param delimiters  set of characters to determine words, null means whitespace
     * @return String of initial characters, <code>null</code> if null String input
     * @see #initials(String)
     * @since 2.2
     */
    public static String initials(final String str, final char... delimiters) {try{__CLR4_5_2g5lg5llvha7btg.R.inc(21111);
        __CLR4_5_2g5lg5llvha7btg.R.inc(21112);if ((((StringUtils.isEmpty(str))&&(__CLR4_5_2g5lg5llvha7btg.R.iget(21113)!=0|true))||(__CLR4_5_2g5lg5llvha7btg.R.iget(21114)==0&false))) {{
            __CLR4_5_2g5lg5llvha7btg.R.inc(21115);return str;
        }
        }__CLR4_5_2g5lg5llvha7btg.R.inc(21116);if ((((delimiters != null && delimiters.length == 0)&&(__CLR4_5_2g5lg5llvha7btg.R.iget(21117)!=0|true))||(__CLR4_5_2g5lg5llvha7btg.R.iget(21118)==0&false))) {{
            __CLR4_5_2g5lg5llvha7btg.R.inc(21119);return StringUtils.EMPTY;
        }
        }__CLR4_5_2g5lg5llvha7btg.R.inc(21120);final int strLen = str.length();
        __CLR4_5_2g5lg5llvha7btg.R.inc(21121);final char[] buf = new char[strLen / 2 + 1];
        __CLR4_5_2g5lg5llvha7btg.R.inc(21122);int count = 0;
        __CLR4_5_2g5lg5llvha7btg.R.inc(21123);boolean lastWasGap = true;
        __CLR4_5_2g5lg5llvha7btg.R.inc(21124);for (int i = 0; (((i < strLen)&&(__CLR4_5_2g5lg5llvha7btg.R.iget(21125)!=0|true))||(__CLR4_5_2g5lg5llvha7btg.R.iget(21126)==0&false)); i++) {{
            __CLR4_5_2g5lg5llvha7btg.R.inc(21127);final char ch = str.charAt(i);

            __CLR4_5_2g5lg5llvha7btg.R.inc(21128);if ((((isDelimiter(ch, delimiters))&&(__CLR4_5_2g5lg5llvha7btg.R.iget(21129)!=0|true))||(__CLR4_5_2g5lg5llvha7btg.R.iget(21130)==0&false))) {{
                __CLR4_5_2g5lg5llvha7btg.R.inc(21131);lastWasGap = true;
            } }else {__CLR4_5_2g5lg5llvha7btg.R.inc(21132);if ((((lastWasGap)&&(__CLR4_5_2g5lg5llvha7btg.R.iget(21133)!=0|true))||(__CLR4_5_2g5lg5llvha7btg.R.iget(21134)==0&false))) {{
                __CLR4_5_2g5lg5llvha7btg.R.inc(21135);buf[count++] = ch;
                __CLR4_5_2g5lg5llvha7btg.R.inc(21136);lastWasGap = false;
            } }else {{
                __CLR4_5_2g5lg5llvha7btg.R.inc(21137);continue; // ignore ch
            }
        }}}
        }__CLR4_5_2g5lg5llvha7btg.R.inc(21138);return new String(buf, 0, count);
    }finally{__CLR4_5_2g5lg5llvha7btg.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * <p>Checks if the String contains all words in the given array.</p>
     *
     * <p>
     * A {@code null} String will return {@code false}. A {@code null}, zero
     * length search array or if one element of array is null will return {@code false}.
     * </p>
     *
     * <pre>
     * WordUtils.containsAllWords(null, *)            = false
     * WordUtils.containsAllWords("", *)              = false
     * WordUtils.containsAllWords(*, null)            = false
     * WordUtils.containsAllWords(*, [])              = false
     * WordUtils.containsAllWords("abcd", "ab", "cd") = false
     * WordUtils.containsAllWords("abc def", "def", "abc") = true
     * </pre>
     *
     *
     * @param word The CharSequence to check, may be null
     * @param words The array of String words to search for, may be null
     * @return {@code true} if all search words are found, {@code false} otherwise
     * @since 3.5
     */
    public static boolean containsAllWords(final CharSequence word, final CharSequence... words) {try{__CLR4_5_2g5lg5llvha7btg.R.inc(21139);
        __CLR4_5_2g5lg5llvha7btg.R.inc(21140);if ((((StringUtils.isEmpty(word) || ArrayUtils.isEmpty(words))&&(__CLR4_5_2g5lg5llvha7btg.R.iget(21141)!=0|true))||(__CLR4_5_2g5lg5llvha7btg.R.iget(21142)==0&false))) {{
            __CLR4_5_2g5lg5llvha7btg.R.inc(21143);return false;
        }
        }__CLR4_5_2g5lg5llvha7btg.R.inc(21144);for (final CharSequence w : words) {{
            __CLR4_5_2g5lg5llvha7btg.R.inc(21145);if ((((StringUtils.isBlank(w))&&(__CLR4_5_2g5lg5llvha7btg.R.iget(21146)!=0|true))||(__CLR4_5_2g5lg5llvha7btg.R.iget(21147)==0&false))) {{
                __CLR4_5_2g5lg5llvha7btg.R.inc(21148);return false;
            }
            }__CLR4_5_2g5lg5llvha7btg.R.inc(21149);final Pattern p = Pattern.compile(".*\\b" + w + "\\b.*");
            __CLR4_5_2g5lg5llvha7btg.R.inc(21150);if ((((!p.matcher(word).matches())&&(__CLR4_5_2g5lg5llvha7btg.R.iget(21151)!=0|true))||(__CLR4_5_2g5lg5llvha7btg.R.iget(21152)==0&false))) {{
                __CLR4_5_2g5lg5llvha7btg.R.inc(21153);return false;
            }
        }}
        }__CLR4_5_2g5lg5llvha7btg.R.inc(21154);return true;
    }finally{__CLR4_5_2g5lg5llvha7btg.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Is the character a delimiter.
     *
     * @param ch  the character to check
     * @param delimiters  the delimiters
     * @return true if it is a delimiter
     */
    private static boolean isDelimiter(final char ch, final char[] delimiters) {try{__CLR4_5_2g5lg5llvha7btg.R.inc(21155);
        __CLR4_5_2g5lg5llvha7btg.R.inc(21156);if ((((delimiters == null)&&(__CLR4_5_2g5lg5llvha7btg.R.iget(21157)!=0|true))||(__CLR4_5_2g5lg5llvha7btg.R.iget(21158)==0&false))) {{
            __CLR4_5_2g5lg5llvha7btg.R.inc(21159);return Character.isWhitespace(ch);
        }
        }__CLR4_5_2g5lg5llvha7btg.R.inc(21160);for (final char delimiter : delimiters) {{
            __CLR4_5_2g5lg5llvha7btg.R.inc(21161);if ((((ch == delimiter)&&(__CLR4_5_2g5lg5llvha7btg.R.iget(21162)!=0|true))||(__CLR4_5_2g5lg5llvha7btg.R.iget(21163)==0&false))) {{
                __CLR4_5_2g5lg5llvha7btg.R.inc(21164);return true;
            }
        }}
        }__CLR4_5_2g5lg5llvha7btg.R.inc(21165);return false;
    }finally{__CLR4_5_2g5lg5llvha7btg.R.flushNeeded();}}

}
