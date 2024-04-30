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
package org.apache.commons.lang3.text.translate;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Locale;

/**
 * An API for translating text. 
 * Its core use is to escape and unescape text. Because escaping and unescaping 
 * is completely contextual, the API does not present two separate signatures.
 * 
 * @since 3.0
 * @deprecated as of 3.6, use commons-text
 * <a href="https://commons.apache.org/proper/commons-text/javadocs/api-release/org/apache/commons/text/translate/CharSequenceTranslator.html">
 * CharSequenceTranslator</a> instead
 */
@Deprecated
public abstract class CharSequenceTranslator {public static class __CLR4_5_2gc8gc8lvha7bun{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172755542L,8589935092L,21228,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    static final char[] HEX_DIGITS = new char[] {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};

    /**
     * Translate a set of codepoints, represented by an int index into a CharSequence, 
     * into another set of codepoints. The number of codepoints consumed must be returned, 
     * and the only IOExceptions thrown must be from interacting with the Writer so that 
     * the top level API may reliably ignore StringWriter IOExceptions. 
     *
     * @param input CharSequence that is being translated
     * @param index int representing the current point of translation
     * @param out Writer to translate the text to
     * @return int count of codepoints consumed
     * @throws IOException if and only if the Writer produces an IOException
     */
    public abstract int translate(CharSequence input, int index, Writer out) throws IOException;

    /**
     * Helper for non-Writer usage. 
     * @param input CharSequence to be translated
     * @return String output of translation
     */
    public final String translate(final CharSequence input) {try{__CLR4_5_2gc8gc8lvha7bun.R.inc(21176);
        __CLR4_5_2gc8gc8lvha7bun.R.inc(21177);if ((((input == null)&&(__CLR4_5_2gc8gc8lvha7bun.R.iget(21178)!=0|true))||(__CLR4_5_2gc8gc8lvha7bun.R.iget(21179)==0&false))) {{
            __CLR4_5_2gc8gc8lvha7bun.R.inc(21180);return null;
        }
        }__CLR4_5_2gc8gc8lvha7bun.R.inc(21181);try {
            __CLR4_5_2gc8gc8lvha7bun.R.inc(21182);final StringWriter writer = new StringWriter(input.length() * 2);
            __CLR4_5_2gc8gc8lvha7bun.R.inc(21183);translate(input, writer);
            __CLR4_5_2gc8gc8lvha7bun.R.inc(21184);return writer.toString();
        } catch (final IOException ioe) {
            // this should never ever happen while writing to a StringWriter
            __CLR4_5_2gc8gc8lvha7bun.R.inc(21185);throw new RuntimeException(ioe);
        }
    }finally{__CLR4_5_2gc8gc8lvha7bun.R.flushNeeded();}}

    /**
     * Translate an input onto a Writer. This is intentionally final as its algorithm is 
     * tightly coupled with the abstract method of this class. 
     *
     * @param input CharSequence that is being translated
     * @param out Writer to translate the text to
     * @throws IOException if and only if the Writer produces an IOException
     */
    public final void translate(final CharSequence input, final Writer out) throws IOException {try{__CLR4_5_2gc8gc8lvha7bun.R.inc(21186);
        __CLR4_5_2gc8gc8lvha7bun.R.inc(21187);if ((((out == null)&&(__CLR4_5_2gc8gc8lvha7bun.R.iget(21188)!=0|true))||(__CLR4_5_2gc8gc8lvha7bun.R.iget(21189)==0&false))) {{
            __CLR4_5_2gc8gc8lvha7bun.R.inc(21190);throw new IllegalArgumentException("The Writer must not be null");
        }
        }__CLR4_5_2gc8gc8lvha7bun.R.inc(21191);if ((((input == null)&&(__CLR4_5_2gc8gc8lvha7bun.R.iget(21192)!=0|true))||(__CLR4_5_2gc8gc8lvha7bun.R.iget(21193)==0&false))) {{
            __CLR4_5_2gc8gc8lvha7bun.R.inc(21194);return;
        }
        }__CLR4_5_2gc8gc8lvha7bun.R.inc(21195);int pos = 0;
        __CLR4_5_2gc8gc8lvha7bun.R.inc(21196);final int len = input.length();
        __CLR4_5_2gc8gc8lvha7bun.R.inc(21197);while ((((pos < len)&&(__CLR4_5_2gc8gc8lvha7bun.R.iget(21198)!=0|true))||(__CLR4_5_2gc8gc8lvha7bun.R.iget(21199)==0&false))) {{
            __CLR4_5_2gc8gc8lvha7bun.R.inc(21200);final int consumed = translate(input, pos, out);
            __CLR4_5_2gc8gc8lvha7bun.R.inc(21201);if ((((consumed == 0)&&(__CLR4_5_2gc8gc8lvha7bun.R.iget(21202)!=0|true))||(__CLR4_5_2gc8gc8lvha7bun.R.iget(21203)==0&false))) {{
                // inlined implementation of Character.toChars(Character.codePointAt(input, pos))
                // avoids allocating temp char arrays and duplicate checks
                __CLR4_5_2gc8gc8lvha7bun.R.inc(21204);final char c1 = input.charAt(pos);
                __CLR4_5_2gc8gc8lvha7bun.R.inc(21205);out.write(c1);
                __CLR4_5_2gc8gc8lvha7bun.R.inc(21206);pos++;
                __CLR4_5_2gc8gc8lvha7bun.R.inc(21207);if ((((Character.isHighSurrogate(c1) && pos < len)&&(__CLR4_5_2gc8gc8lvha7bun.R.iget(21208)!=0|true))||(__CLR4_5_2gc8gc8lvha7bun.R.iget(21209)==0&false))) {{
                    __CLR4_5_2gc8gc8lvha7bun.R.inc(21210);final char c2 = input.charAt(pos);
                    __CLR4_5_2gc8gc8lvha7bun.R.inc(21211);if ((((Character.isLowSurrogate(c2))&&(__CLR4_5_2gc8gc8lvha7bun.R.iget(21212)!=0|true))||(__CLR4_5_2gc8gc8lvha7bun.R.iget(21213)==0&false))) {{
                      __CLR4_5_2gc8gc8lvha7bun.R.inc(21214);out.write(c2);
                      __CLR4_5_2gc8gc8lvha7bun.R.inc(21215);pos++;
                    }
                }}
                }__CLR4_5_2gc8gc8lvha7bun.R.inc(21216);continue;
            }
            // contract with translators is that they have to understand codepoints
            // and they just took care of a surrogate pair
            }__CLR4_5_2gc8gc8lvha7bun.R.inc(21217);for (int pt = 0; (((pt < consumed)&&(__CLR4_5_2gc8gc8lvha7bun.R.iget(21218)!=0|true))||(__CLR4_5_2gc8gc8lvha7bun.R.iget(21219)==0&false)); pt++) {{
                __CLR4_5_2gc8gc8lvha7bun.R.inc(21220);pos += Character.charCount(Character.codePointAt(input, pos));
            }
        }}
    }}finally{__CLR4_5_2gc8gc8lvha7bun.R.flushNeeded();}}

    /**
     * Helper method to create a merger of this translator with another set of 
     * translators. Useful in customizing the standard functionality.
     *
     * @param translators CharSequenceTranslator array of translators to merge with this one
     * @return CharSequenceTranslator merging this translator with the others
     */
    public final CharSequenceTranslator with(final CharSequenceTranslator... translators) {try{__CLR4_5_2gc8gc8lvha7bun.R.inc(21221);
        __CLR4_5_2gc8gc8lvha7bun.R.inc(21222);final CharSequenceTranslator[] newArray = new CharSequenceTranslator[translators.length + 1];
        __CLR4_5_2gc8gc8lvha7bun.R.inc(21223);newArray[0] = this;
        __CLR4_5_2gc8gc8lvha7bun.R.inc(21224);System.arraycopy(translators, 0, newArray, 1, translators.length);
        __CLR4_5_2gc8gc8lvha7bun.R.inc(21225);return new AggregateTranslator(newArray);
    }finally{__CLR4_5_2gc8gc8lvha7bun.R.flushNeeded();}}

    /**
     * <p>Returns an upper case hexadecimal <code>String</code> for the given
     * character.</p>
     *
     * @param codepoint The codepoint to convert.
     * @return An upper case hexadecimal <code>String</code>
     */
    public static String hex(final int codepoint) {try{__CLR4_5_2gc8gc8lvha7bun.R.inc(21226);
        __CLR4_5_2gc8gc8lvha7bun.R.inc(21227);return Integer.toHexString(codepoint).toUpperCase(Locale.ENGLISH);
    }finally{__CLR4_5_2gc8gc8lvha7bun.R.flushNeeded();}}

}
