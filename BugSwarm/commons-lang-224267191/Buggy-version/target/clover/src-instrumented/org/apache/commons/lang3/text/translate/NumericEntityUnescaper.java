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
import java.io.Writer;
import java.util.Arrays;
import java.util.EnumSet;

/**
 * Translate XML numeric entities of the form &amp;#[xX]?\d+;? to 
 * the specific codepoint.
 *
 * Note that the semi-colon is optional.
 * 
 * @since 3.0
 * @deprecated as of 3.6, use commons-text
 * <a href="https://commons.apache.org/proper/commons-text/javadocs/api-release/org/apache/commons/text/translate/NumericEntityUnescaper.html">
 * NumericEntityUnescaper</a> instead
 */
@Deprecated
public class NumericEntityUnescaper extends CharSequenceTranslator {public static class __CLR4_5_2ggzggzlvha7c7f{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172755542L,8589935092L,21412,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static enum OPTION { semiColonRequired, semiColonOptional, errorIfNoSemiColon }

    // TODO?: Create an OptionsSet class to hide some of the conditional logic below
    private final EnumSet<OPTION> options;

    /**
     * Create a UnicodeUnescaper.
     *
     * The constructor takes a list of options, only one type of which is currently 
     * available (whether to allow, error or ignore the semi-colon on the end of a 
     * numeric entity to being missing).
     *
     * For example, to support numeric entities without a ';':
     *    new NumericEntityUnescaper(NumericEntityUnescaper.OPTION.semiColonOptional)
     * and to throw an IllegalArgumentException when they're missing:
     *    new NumericEntityUnescaper(NumericEntityUnescaper.OPTION.errorIfNoSemiColon)
     *
     * Note that the default behaviour is to ignore them. 
     *
     * @param options to apply to this unescaper
     */
    public NumericEntityUnescaper(final OPTION... options) {try{__CLR4_5_2ggzggzlvha7c7f.R.inc(21347);
        __CLR4_5_2ggzggzlvha7c7f.R.inc(21348);if((((options.length > 0)&&(__CLR4_5_2ggzggzlvha7c7f.R.iget(21349)!=0|true))||(__CLR4_5_2ggzggzlvha7c7f.R.iget(21350)==0&false))) {{
            __CLR4_5_2ggzggzlvha7c7f.R.inc(21351);this.options = EnumSet.copyOf(Arrays.asList(options));
        } }else {{
            __CLR4_5_2ggzggzlvha7c7f.R.inc(21352);this.options = EnumSet.copyOf(Arrays.asList(new OPTION[] { OPTION.semiColonRequired }));
        }
    }}finally{__CLR4_5_2ggzggzlvha7c7f.R.flushNeeded();}}

    /**
     * Whether the passed in option is currently set.
     *
     * @param option to check state of
     * @return whether the option is set
     */
    public boolean isSet(final OPTION option) {try{__CLR4_5_2ggzggzlvha7c7f.R.inc(21353); 
        __CLR4_5_2ggzggzlvha7c7f.R.inc(21354);return (((options == null )&&(__CLR4_5_2ggzggzlvha7c7f.R.iget(21355)!=0|true))||(__CLR4_5_2ggzggzlvha7c7f.R.iget(21356)==0&false))? false : options.contains(option);
    }finally{__CLR4_5_2ggzggzlvha7c7f.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public int translate(final CharSequence input, final int index, final Writer out) throws IOException {try{__CLR4_5_2ggzggzlvha7c7f.R.inc(21357);
        __CLR4_5_2ggzggzlvha7c7f.R.inc(21358);final int seqEnd = input.length();
        // Uses -2 to ensure there is something after the &#
        __CLR4_5_2ggzggzlvha7c7f.R.inc(21359);if((((input.charAt(index) == '&' && index < seqEnd - 2 && input.charAt(index + 1) == '#')&&(__CLR4_5_2ggzggzlvha7c7f.R.iget(21360)!=0|true))||(__CLR4_5_2ggzggzlvha7c7f.R.iget(21361)==0&false))) {{
            __CLR4_5_2ggzggzlvha7c7f.R.inc(21362);int start = index + 2;
            __CLR4_5_2ggzggzlvha7c7f.R.inc(21363);boolean isHex = false;

            __CLR4_5_2ggzggzlvha7c7f.R.inc(21364);final char firstChar = input.charAt(start);
            __CLR4_5_2ggzggzlvha7c7f.R.inc(21365);if((((firstChar == 'x' || firstChar == 'X')&&(__CLR4_5_2ggzggzlvha7c7f.R.iget(21366)!=0|true))||(__CLR4_5_2ggzggzlvha7c7f.R.iget(21367)==0&false))) {{
                __CLR4_5_2ggzggzlvha7c7f.R.inc(21368);start++;
                __CLR4_5_2ggzggzlvha7c7f.R.inc(21369);isHex = true;

                // Check there's more than just an x after the &#
                __CLR4_5_2ggzggzlvha7c7f.R.inc(21370);if((((start == seqEnd)&&(__CLR4_5_2ggzggzlvha7c7f.R.iget(21371)!=0|true))||(__CLR4_5_2ggzggzlvha7c7f.R.iget(21372)==0&false))) {{
                    __CLR4_5_2ggzggzlvha7c7f.R.inc(21373);return 0;
                }
            }}

            }__CLR4_5_2ggzggzlvha7c7f.R.inc(21374);int end = start;
            // Note that this supports character codes without a ; on the end
            __CLR4_5_2ggzggzlvha7c7f.R.inc(21375);while((((end < seqEnd && ( input.charAt(end) >= '0' && input.charAt(end) <= '9' ||
                                    input.charAt(end) >= 'a' && input.charAt(end) <= 'f' ||
                                    input.charAt(end) >= 'A' && input.charAt(end) <= 'F' ) )&&(__CLR4_5_2ggzggzlvha7c7f.R.iget(21376)!=0|true))||(__CLR4_5_2ggzggzlvha7c7f.R.iget(21377)==0&false)))
            {{
                __CLR4_5_2ggzggzlvha7c7f.R.inc(21378);end++;
            }

            }__CLR4_5_2ggzggzlvha7c7f.R.inc(21379);final boolean semiNext = end != seqEnd && input.charAt(end) == ';';

            __CLR4_5_2ggzggzlvha7c7f.R.inc(21380);if((((!semiNext)&&(__CLR4_5_2ggzggzlvha7c7f.R.iget(21381)!=0|true))||(__CLR4_5_2ggzggzlvha7c7f.R.iget(21382)==0&false))) {{
                __CLR4_5_2ggzggzlvha7c7f.R.inc(21383);if((((isSet(OPTION.semiColonRequired))&&(__CLR4_5_2ggzggzlvha7c7f.R.iget(21384)!=0|true))||(__CLR4_5_2ggzggzlvha7c7f.R.iget(21385)==0&false))) {{
                    __CLR4_5_2ggzggzlvha7c7f.R.inc(21386);return 0;
                } }else
                {__CLR4_5_2ggzggzlvha7c7f.R.inc(21387);if((((isSet(OPTION.errorIfNoSemiColon))&&(__CLR4_5_2ggzggzlvha7c7f.R.iget(21388)!=0|true))||(__CLR4_5_2ggzggzlvha7c7f.R.iget(21389)==0&false))) {{
                    __CLR4_5_2ggzggzlvha7c7f.R.inc(21390);throw new IllegalArgumentException("Semi-colon required at end of numeric entity");
                }
            }}}

            }__CLR4_5_2ggzggzlvha7c7f.R.inc(21391);int entityValue;
            __CLR4_5_2ggzggzlvha7c7f.R.inc(21392);try {
                __CLR4_5_2ggzggzlvha7c7f.R.inc(21393);if((((isHex)&&(__CLR4_5_2ggzggzlvha7c7f.R.iget(21394)!=0|true))||(__CLR4_5_2ggzggzlvha7c7f.R.iget(21395)==0&false))) {{
                    __CLR4_5_2ggzggzlvha7c7f.R.inc(21396);entityValue = Integer.parseInt(input.subSequence(start, end).toString(), 16);
                } }else {{
                    __CLR4_5_2ggzggzlvha7c7f.R.inc(21397);entityValue = Integer.parseInt(input.subSequence(start, end).toString(), 10);
                }
            }} catch(final NumberFormatException nfe) {
                __CLR4_5_2ggzggzlvha7c7f.R.inc(21398);return 0;
            }

            __CLR4_5_2ggzggzlvha7c7f.R.inc(21399);if((((entityValue > 0xFFFF)&&(__CLR4_5_2ggzggzlvha7c7f.R.iget(21400)!=0|true))||(__CLR4_5_2ggzggzlvha7c7f.R.iget(21401)==0&false))) {{
                __CLR4_5_2ggzggzlvha7c7f.R.inc(21402);final char[] chars = Character.toChars(entityValue);
                __CLR4_5_2ggzggzlvha7c7f.R.inc(21403);out.write(chars[0]);
                __CLR4_5_2ggzggzlvha7c7f.R.inc(21404);out.write(chars[1]);
            } }else {{
                __CLR4_5_2ggzggzlvha7c7f.R.inc(21405);out.write(entityValue);
            }

            }__CLR4_5_2ggzggzlvha7c7f.R.inc(21406);return 2 + end - start + ((((isHex )&&(__CLR4_5_2ggzggzlvha7c7f.R.iget(21407)!=0|true))||(__CLR4_5_2ggzggzlvha7c7f.R.iget(21408)==0&false))? 1 : 0) + ((((semiNext )&&(__CLR4_5_2ggzggzlvha7c7f.R.iget(21409)!=0|true))||(__CLR4_5_2ggzggzlvha7c7f.R.iget(21410)==0&false))? 1 : 0);
        }
        }__CLR4_5_2ggzggzlvha7c7f.R.inc(21411);return 0;
    }finally{__CLR4_5_2ggzggzlvha7c7f.R.flushNeeded();}}
}
