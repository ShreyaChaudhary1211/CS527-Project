/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//* This file is part of the OWL API.
 * The contents of this file are subject to the LGPL License, Version 3.0.
 * Copyright 2014, The University of Manchester
 * 
 * This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License along with this program.  If not, see http://www.gnu.org/licenses/.
 *
 * Alternatively, the contents of this file may be used under the terms of the Apache License, Version 2.0 in which case, the provisions of the Apache License Version 2.0 are applicable instead of those above.
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */
package org.semanticweb.owlapi.manchestersyntax.parser;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.annotation.Nonnull;

/**
 * @author Matthew Horridge, The University Of Manchester, Bio-Health
 *         Informatics Group
 * @since 2.2.0
 */
public class ManchesterOWLSyntaxTokenizer {public static class __CLR4_5_2jtljtllvicmbsc{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0070\u0061\u0072\u0073\u0065\u0072\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237279647L,8589935092L,25868,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** EOF */
    @Nonnull
    public static final String EOF = "|EOF|";

    /**
     * @param s
     *        string to check
     * @return true if EOF
     */
    public static boolean eof(String s) {try{__CLR4_5_2jtljtllvicmbsc.R.inc(25689);
        __CLR4_5_2jtljtllvicmbsc.R.inc(25690);return EOF.equals(s);
    }finally{__CLR4_5_2jtljtllvicmbsc.R.flushNeeded();}}

    @Nonnull
    protected final Set<Character> skip = new HashSet<>();
    protected final Set<Character> commentDelimiters = new HashSet<>();
    protected final Set<Character> delims = new HashSet<>();
    private final String buffer;
    private int pos;
    private int col;
    private int row;
    int startPos = 0;
    int startCol = 1;
    int startRow = 1;
    List<Token> tokens = new ArrayList<>();
    private StringBuilder sb;
    private static final char ESCAPE_CHAR = '\\';

    /**
     * @param buffer
     *        buffer
     */
    public ManchesterOWLSyntaxTokenizer(String buffer) {try{__CLR4_5_2jtljtllvicmbsc.R.inc(25691);
        __CLR4_5_2jtljtllvicmbsc.R.inc(25692);this.buffer = buffer;
        __CLR4_5_2jtljtllvicmbsc.R.inc(25693);skip.add(' ');
        __CLR4_5_2jtljtllvicmbsc.R.inc(25694);skip.add('\n');
        __CLR4_5_2jtljtllvicmbsc.R.inc(25695);skip.add('\r');
        __CLR4_5_2jtljtllvicmbsc.R.inc(25696);skip.add('\t');
        __CLR4_5_2jtljtllvicmbsc.R.inc(25697);commentDelimiters.add('#');
        __CLR4_5_2jtljtllvicmbsc.R.inc(25698);commentDelimiters.add('*');
        __CLR4_5_2jtljtllvicmbsc.R.inc(25699);delims.add('(');
        __CLR4_5_2jtljtllvicmbsc.R.inc(25700);delims.add(')');
        __CLR4_5_2jtljtllvicmbsc.R.inc(25701);delims.add('[');
        __CLR4_5_2jtljtllvicmbsc.R.inc(25702);delims.add(']');
        __CLR4_5_2jtljtllvicmbsc.R.inc(25703);delims.add(',');
        __CLR4_5_2jtljtllvicmbsc.R.inc(25704);delims.add('{');
        __CLR4_5_2jtljtllvicmbsc.R.inc(25705);delims.add('}');
        __CLR4_5_2jtljtllvicmbsc.R.inc(25706);delims.add('^');
        __CLR4_5_2jtljtllvicmbsc.R.inc(25707);delims.add('@');
        __CLR4_5_2jtljtllvicmbsc.R.inc(25708);delims.add('<');
        __CLR4_5_2jtljtllvicmbsc.R.inc(25709);delims.add('>');
        __CLR4_5_2jtljtllvicmbsc.R.inc(25710);delims.add('=');
        __CLR4_5_2jtljtllvicmbsc.R.inc(25711);delims.add('?');
    }finally{__CLR4_5_2jtljtllvicmbsc.R.flushNeeded();}}

    private void reset() {try{__CLR4_5_2jtljtllvicmbsc.R.inc(25712);
        __CLR4_5_2jtljtllvicmbsc.R.inc(25713);sb = new StringBuilder();
        __CLR4_5_2jtljtllvicmbsc.R.inc(25714);tokens.clear();
        __CLR4_5_2jtljtllvicmbsc.R.inc(25715);startRow = 1;
        __CLR4_5_2jtljtllvicmbsc.R.inc(25716);startCol = 1;
        __CLR4_5_2jtljtllvicmbsc.R.inc(25717);startPos = 0;
        __CLR4_5_2jtljtllvicmbsc.R.inc(25718);pos = 0;
        __CLR4_5_2jtljtllvicmbsc.R.inc(25719);row = 1;
        __CLR4_5_2jtljtllvicmbsc.R.inc(25720);col = 1;
    }finally{__CLR4_5_2jtljtllvicmbsc.R.flushNeeded();}}

    /** @return tokens */
    public List<Token> tokenize() {try{__CLR4_5_2jtljtllvicmbsc.R.inc(25721);
        __CLR4_5_2jtljtllvicmbsc.R.inc(25722);reset();
        __CLR4_5_2jtljtllvicmbsc.R.inc(25723);int bufferLen = buffer.length();
        __CLR4_5_2jtljtllvicmbsc.R.inc(25724);char lastChar = ' ';
        __CLR4_5_2jtljtllvicmbsc.R.inc(25725);while ((((pos < bufferLen)&&(__CLR4_5_2jtljtllvicmbsc.R.iget(25726)!=0|true))||(__CLR4_5_2jtljtllvicmbsc.R.iget(25727)==0&false))) {{
            __CLR4_5_2jtljtllvicmbsc.R.inc(25728);char ch = readChar();
            __CLR4_5_2jtljtllvicmbsc.R.inc(25729);if ((((ch == ESCAPE_CHAR)&&(__CLR4_5_2jtljtllvicmbsc.R.iget(25730)!=0|true))||(__CLR4_5_2jtljtllvicmbsc.R.iget(25731)==0&false))) {{
                __CLR4_5_2jtljtllvicmbsc.R.inc(25732);lastChar = ch;
                __CLR4_5_2jtljtllvicmbsc.R.inc(25733);ch = readChar();
            }
            }__CLR4_5_2jtljtllvicmbsc.R.inc(25734);if ((((ch == '\"' && lastChar != '\\')&&(__CLR4_5_2jtljtllvicmbsc.R.iget(25735)!=0|true))||(__CLR4_5_2jtljtllvicmbsc.R.iget(25736)==0&false))) {{
                __CLR4_5_2jtljtllvicmbsc.R.inc(25737);readString('\"', true);
            } }else {__CLR4_5_2jtljtllvicmbsc.R.inc(25738);if ((((ch == '\'' && lastChar != '\\')&&(__CLR4_5_2jtljtllvicmbsc.R.iget(25739)!=0|true))||(__CLR4_5_2jtljtllvicmbsc.R.iget(25740)==0&false))) {{
                __CLR4_5_2jtljtllvicmbsc.R.inc(25741);readString('\'', true);
            } }else {__CLR4_5_2jtljtllvicmbsc.R.inc(25742);if ((((ch == '<')&&(__CLR4_5_2jtljtllvicmbsc.R.iget(25743)!=0|true))||(__CLR4_5_2jtljtllvicmbsc.R.iget(25744)==0&false))) {{
                // Potentially the start of an IRI
                __CLR4_5_2jtljtllvicmbsc.R.inc(25745);readIRI();
            } }else {__CLR4_5_2jtljtllvicmbsc.R.inc(25746);if ((((skip.contains(ch))&&(__CLR4_5_2jtljtllvicmbsc.R.iget(25747)!=0|true))||(__CLR4_5_2jtljtllvicmbsc.R.iget(25748)==0&false))) {{
                __CLR4_5_2jtljtllvicmbsc.R.inc(25749);consumeToken();
            } }else {__CLR4_5_2jtljtllvicmbsc.R.inc(25750);if ((((commentDelimiters.contains(ch))&&(__CLR4_5_2jtljtllvicmbsc.R.iget(25751)!=0|true))||(__CLR4_5_2jtljtllvicmbsc.R.iget(25752)==0&false))) {{
                __CLR4_5_2jtljtllvicmbsc.R.inc(25753);consumeToken();
                __CLR4_5_2jtljtllvicmbsc.R.inc(25754);readComment();
            } }else {__CLR4_5_2jtljtllvicmbsc.R.inc(25755);if ((((delims.contains(ch))&&(__CLR4_5_2jtljtllvicmbsc.R.iget(25756)!=0|true))||(__CLR4_5_2jtljtllvicmbsc.R.iget(25757)==0&false))) {{
                __CLR4_5_2jtljtllvicmbsc.R.inc(25758);consumeToken();
                __CLR4_5_2jtljtllvicmbsc.R.inc(25759);sb.append(ch);
                __CLR4_5_2jtljtllvicmbsc.R.inc(25760);if ((((ch != '@')&&(__CLR4_5_2jtljtllvicmbsc.R.iget(25761)!=0|true))||(__CLR4_5_2jtljtllvicmbsc.R.iget(25762)==0&false))) {{
                    __CLR4_5_2jtljtllvicmbsc.R.inc(25763);consumeToken();
                }
            }} }else {{
                __CLR4_5_2jtljtllvicmbsc.R.inc(25764);sb.append(ch);
            }
            }}}}}}__CLR4_5_2jtljtllvicmbsc.R.inc(25765);lastChar = ch;
        }
        }__CLR4_5_2jtljtllvicmbsc.R.inc(25766);consumeToken();
        __CLR4_5_2jtljtllvicmbsc.R.inc(25767);tokens.add(new Token(EOF, pos, col, row));
        __CLR4_5_2jtljtllvicmbsc.R.inc(25768);return new ArrayList<>(tokens);
    }finally{__CLR4_5_2jtljtllvicmbsc.R.flushNeeded();}}

    private void consumeToken() {try{__CLR4_5_2jtljtllvicmbsc.R.inc(25769);
        __CLR4_5_2jtljtllvicmbsc.R.inc(25770);if ((((sb.length() > 0)&&(__CLR4_5_2jtljtllvicmbsc.R.iget(25771)!=0|true))||(__CLR4_5_2jtljtllvicmbsc.R.iget(25772)==0&false))) {{
            __CLR4_5_2jtljtllvicmbsc.R.inc(25773);String string = sb.toString();
            assert (((string != null)&&(__CLR4_5_2jtljtllvicmbsc.R.iget(25774)!=0|true))||(__CLR4_5_2jtljtllvicmbsc.R.iget(25775)==0&false));
            __CLR4_5_2jtljtllvicmbsc.R.inc(25776);tokens.add(new Token(string, startPos, startCol, startRow));
            __CLR4_5_2jtljtllvicmbsc.R.inc(25777);sb = new StringBuilder();
        }
        }__CLR4_5_2jtljtllvicmbsc.R.inc(25778);startPos = pos;
        __CLR4_5_2jtljtllvicmbsc.R.inc(25779);startCol = col;
        __CLR4_5_2jtljtllvicmbsc.R.inc(25780);startRow = row;
    }finally{__CLR4_5_2jtljtllvicmbsc.R.flushNeeded();}}

    private void readComment() {try{__CLR4_5_2jtljtllvicmbsc.R.inc(25781);
        __CLR4_5_2jtljtllvicmbsc.R.inc(25782);char ch = '#';
        __CLR4_5_2jtljtllvicmbsc.R.inc(25783);while ((((ch != '\n' && pos < buffer.length())&&(__CLR4_5_2jtljtllvicmbsc.R.iget(25784)!=0|true))||(__CLR4_5_2jtljtllvicmbsc.R.iget(25785)==0&false))) {{
            __CLR4_5_2jtljtllvicmbsc.R.inc(25786);ch = readChar();
        }
        }__CLR4_5_2jtljtllvicmbsc.R.inc(25787);consumeToken();
    }finally{__CLR4_5_2jtljtllvicmbsc.R.flushNeeded();}}

    private void readString(char terminator, boolean appendTerminator) {try{__CLR4_5_2jtljtllvicmbsc.R.inc(25788);
        __CLR4_5_2jtljtllvicmbsc.R.inc(25789);if ((((appendTerminator)&&(__CLR4_5_2jtljtllvicmbsc.R.iget(25790)!=0|true))||(__CLR4_5_2jtljtllvicmbsc.R.iget(25791)==0&false))) {{
            __CLR4_5_2jtljtllvicmbsc.R.inc(25792);sb.append(terminator);
        }
        }__CLR4_5_2jtljtllvicmbsc.R.inc(25793);while ((((pos < buffer.length())&&(__CLR4_5_2jtljtllvicmbsc.R.iget(25794)!=0|true))||(__CLR4_5_2jtljtllvicmbsc.R.iget(25795)==0&false))) {{
            __CLR4_5_2jtljtllvicmbsc.R.inc(25796);char ch = readChar();
            __CLR4_5_2jtljtllvicmbsc.R.inc(25797);if ((((ch == ESCAPE_CHAR)&&(__CLR4_5_2jtljtllvicmbsc.R.iget(25798)!=0|true))||(__CLR4_5_2jtljtllvicmbsc.R.iget(25799)==0&false))) {{
                __CLR4_5_2jtljtllvicmbsc.R.inc(25800);int j = pos + 1;
                __CLR4_5_2jtljtllvicmbsc.R.inc(25801);if ((((j < buffer.length())&&(__CLR4_5_2jtljtllvicmbsc.R.iget(25802)!=0|true))||(__CLR4_5_2jtljtllvicmbsc.R.iget(25803)==0&false))) {{
                    __CLR4_5_2jtljtllvicmbsc.R.inc(25804);char escapedChar = readChar();
                    __CLR4_5_2jtljtllvicmbsc.R.inc(25805);if ((((escapedChar == '\"' || escapedChar == '\''
                            || escapedChar == '\\')&&(__CLR4_5_2jtljtllvicmbsc.R.iget(25806)!=0|true))||(__CLR4_5_2jtljtllvicmbsc.R.iget(25807)==0&false))) {{
                        __CLR4_5_2jtljtllvicmbsc.R.inc(25808);sb.append(escapedChar);
                    } }else {{
                        __CLR4_5_2jtljtllvicmbsc.R.inc(25809);sb.append(ch);
                        __CLR4_5_2jtljtllvicmbsc.R.inc(25810);sb.append(escapedChar);
                    }
                }} }else {{
                    __CLR4_5_2jtljtllvicmbsc.R.inc(25811);sb.append('\\');
                }
            }} }else {__CLR4_5_2jtljtllvicmbsc.R.inc(25812);if ((((ch == terminator)&&(__CLR4_5_2jtljtllvicmbsc.R.iget(25813)!=0|true))||(__CLR4_5_2jtljtllvicmbsc.R.iget(25814)==0&false))) {{
                __CLR4_5_2jtljtllvicmbsc.R.inc(25815);if ((((appendTerminator)&&(__CLR4_5_2jtljtllvicmbsc.R.iget(25816)!=0|true))||(__CLR4_5_2jtljtllvicmbsc.R.iget(25817)==0&false))) {{
                    __CLR4_5_2jtljtllvicmbsc.R.inc(25818);sb.append(ch);
                }
                }__CLR4_5_2jtljtllvicmbsc.R.inc(25819);break;
            } }else {{
                __CLR4_5_2jtljtllvicmbsc.R.inc(25820);sb.append(ch);
            }
        }}}
        }__CLR4_5_2jtljtllvicmbsc.R.inc(25821);consumeToken();
    }finally{__CLR4_5_2jtljtllvicmbsc.R.flushNeeded();}}

    private void readIRI() {try{__CLR4_5_2jtljtllvicmbsc.R.inc(25822);
        __CLR4_5_2jtljtllvicmbsc.R.inc(25823);sb = new StringBuilder("<");
        __CLR4_5_2jtljtllvicmbsc.R.inc(25824);int startPos1 = pos;
        __CLR4_5_2jtljtllvicmbsc.R.inc(25825);while ((((pos < buffer.length())&&(__CLR4_5_2jtljtllvicmbsc.R.iget(25826)!=0|true))||(__CLR4_5_2jtljtllvicmbsc.R.iget(25827)==0&false))) {{
            __CLR4_5_2jtljtllvicmbsc.R.inc(25828);char ch = readChar();
            __CLR4_5_2jtljtllvicmbsc.R.inc(25829);if ((((Character.isWhitespace(ch))&&(__CLR4_5_2jtljtllvicmbsc.R.iget(25830)!=0|true))||(__CLR4_5_2jtljtllvicmbsc.R.iget(25831)==0&false))) {{
                // Not an IRI -- go back to where we started
                __CLR4_5_2jtljtllvicmbsc.R.inc(25832);pos = startPos1;
                __CLR4_5_2jtljtllvicmbsc.R.inc(25833);sb = new StringBuilder("<");
                __CLR4_5_2jtljtllvicmbsc.R.inc(25834);consumeToken();
                __CLR4_5_2jtljtllvicmbsc.R.inc(25835);break;
            } }else {__CLR4_5_2jtljtllvicmbsc.R.inc(25836);if ((((ch == '>')&&(__CLR4_5_2jtljtllvicmbsc.R.iget(25837)!=0|true))||(__CLR4_5_2jtljtllvicmbsc.R.iget(25838)==0&false))) {{
                // End of IRI
                __CLR4_5_2jtljtllvicmbsc.R.inc(25839);sb.append('>');
                __CLR4_5_2jtljtllvicmbsc.R.inc(25840);consumeToken();
                __CLR4_5_2jtljtllvicmbsc.R.inc(25841);break;
            } }else {{
                __CLR4_5_2jtljtllvicmbsc.R.inc(25842);sb.append(ch);
            }
        }}}
    }}finally{__CLR4_5_2jtljtllvicmbsc.R.flushNeeded();}}

    private char readChar() {try{__CLR4_5_2jtljtllvicmbsc.R.inc(25843);
        __CLR4_5_2jtljtllvicmbsc.R.inc(25844);char ch = buffer.charAt(pos);
        __CLR4_5_2jtljtllvicmbsc.R.inc(25845);pos++;
        __CLR4_5_2jtljtllvicmbsc.R.inc(25846);col++;
        __CLR4_5_2jtljtllvicmbsc.R.inc(25847);if ((((ch == '\n')&&(__CLR4_5_2jtljtllvicmbsc.R.iget(25848)!=0|true))||(__CLR4_5_2jtljtllvicmbsc.R.iget(25849)==0&false))) {{
            __CLR4_5_2jtljtllvicmbsc.R.inc(25850);row++;
            __CLR4_5_2jtljtllvicmbsc.R.inc(25851);col = 0;
        }
        }__CLR4_5_2jtljtllvicmbsc.R.inc(25852);return ch;
    }finally{__CLR4_5_2jtljtllvicmbsc.R.flushNeeded();}}

    /** token */
    public static class Token {

        @Nonnull
        private final String token;
        private final int pos;
        private final int col;
        private final int row;

        /**
         * @param token
         *        token
         * @param pos
         *        pos
         * @param col
         *        col
         * @param row
         *        row
         */
        public Token(@Nonnull String token, int pos, int col, int row) {try{__CLR4_5_2jtljtllvicmbsc.R.inc(25853);
            __CLR4_5_2jtljtllvicmbsc.R.inc(25854);this.token = token;
            __CLR4_5_2jtljtllvicmbsc.R.inc(25855);this.pos = pos;
            __CLR4_5_2jtljtllvicmbsc.R.inc(25856);this.col = col;
            __CLR4_5_2jtljtllvicmbsc.R.inc(25857);this.row = row;
        }finally{__CLR4_5_2jtljtllvicmbsc.R.flushNeeded();}}

        /** @return token */
        @Nonnull
        public String getToken() {try{__CLR4_5_2jtljtllvicmbsc.R.inc(25858);
            __CLR4_5_2jtljtllvicmbsc.R.inc(25859);return token;
        }finally{__CLR4_5_2jtljtllvicmbsc.R.flushNeeded();}}

        /** @return position */
        public int getPos() {try{__CLR4_5_2jtljtllvicmbsc.R.inc(25860);
            __CLR4_5_2jtljtllvicmbsc.R.inc(25861);return pos;
        }finally{__CLR4_5_2jtljtllvicmbsc.R.flushNeeded();}}

        /** @return column */
        public int getCol() {try{__CLR4_5_2jtljtllvicmbsc.R.inc(25862);
            __CLR4_5_2jtljtllvicmbsc.R.inc(25863);return col;
        }finally{__CLR4_5_2jtljtllvicmbsc.R.flushNeeded();}}

        /** @return row */
        public int getRow() {try{__CLR4_5_2jtljtllvicmbsc.R.inc(25864);
            __CLR4_5_2jtljtllvicmbsc.R.inc(25865);return row;
        }finally{__CLR4_5_2jtljtllvicmbsc.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_5_2jtljtllvicmbsc.R.inc(25866);
            __CLR4_5_2jtljtllvicmbsc.R.inc(25867);return token + " [" + pos + ", " + col + ", " + row + ']';
        }finally{__CLR4_5_2jtljtllvicmbsc.R.flushNeeded();}}
    }
}
