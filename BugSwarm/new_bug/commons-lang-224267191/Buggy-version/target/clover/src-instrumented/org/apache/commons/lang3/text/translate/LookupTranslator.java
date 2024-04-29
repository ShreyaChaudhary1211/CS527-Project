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
import java.util.HashMap;
import java.util.HashSet;

/**
 * Translates a value using a lookup table.
 *
 * @since 3.0
 * @deprecated as of 3.6, use commons-text
 * <a href="https://commons.apache.org/proper/commons-text/javadocs/api-release/org/apache/commons/text/translate/LookupTranslator.html">
 * LookupTranslator</a> instead
 */
@Deprecated
public class LookupTranslator extends CharSequenceTranslator {public static class __CLR4_5_2gezgezlvha7c5m{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172755542L,8589935092L,21317,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private final HashMap<String, String> lookupMap;
    private final HashSet<Character> prefixSet;
    private final int shortest;
    private final int longest;

    /**
     * Define the lookup table to be used in translation
     *
     * Note that, as of Lang 3.1, the key to the lookup table is converted to a
     * java.lang.String. This is because we need the key to support hashCode and
     * equals(Object), allowing it to be the key for a HashMap. See LANG-882.
     *
     * @param lookup CharSequence[][] table of size [*][2]
     */
    public LookupTranslator(final CharSequence[]... lookup) {try{__CLR4_5_2gezgezlvha7c5m.R.inc(21275);
        __CLR4_5_2gezgezlvha7c5m.R.inc(21276);lookupMap = new HashMap<>();
        __CLR4_5_2gezgezlvha7c5m.R.inc(21277);prefixSet = new HashSet<>();
        __CLR4_5_2gezgezlvha7c5m.R.inc(21278);int _shortest = Integer.MAX_VALUE;
        __CLR4_5_2gezgezlvha7c5m.R.inc(21279);int _longest = 0;
        __CLR4_5_2gezgezlvha7c5m.R.inc(21280);if ((((lookup != null)&&(__CLR4_5_2gezgezlvha7c5m.R.iget(21281)!=0|true))||(__CLR4_5_2gezgezlvha7c5m.R.iget(21282)==0&false))) {{
            __CLR4_5_2gezgezlvha7c5m.R.inc(21283);for (final CharSequence[] seq : lookup) {{
                __CLR4_5_2gezgezlvha7c5m.R.inc(21284);this.lookupMap.put(seq[0].toString(), seq[1].toString());
                __CLR4_5_2gezgezlvha7c5m.R.inc(21285);this.prefixSet.add(seq[0].charAt(0));
                __CLR4_5_2gezgezlvha7c5m.R.inc(21286);final int sz = seq[0].length();
                __CLR4_5_2gezgezlvha7c5m.R.inc(21287);if ((((sz < _shortest)&&(__CLR4_5_2gezgezlvha7c5m.R.iget(21288)!=0|true))||(__CLR4_5_2gezgezlvha7c5m.R.iget(21289)==0&false))) {{
                    __CLR4_5_2gezgezlvha7c5m.R.inc(21290);_shortest = sz;
                }
                }__CLR4_5_2gezgezlvha7c5m.R.inc(21291);if ((((sz > _longest)&&(__CLR4_5_2gezgezlvha7c5m.R.iget(21292)!=0|true))||(__CLR4_5_2gezgezlvha7c5m.R.iget(21293)==0&false))) {{
                    __CLR4_5_2gezgezlvha7c5m.R.inc(21294);_longest = sz;
                }
            }}
        }}
        }__CLR4_5_2gezgezlvha7c5m.R.inc(21295);shortest = _shortest;
        __CLR4_5_2gezgezlvha7c5m.R.inc(21296);longest = _longest;
    }finally{__CLR4_5_2gezgezlvha7c5m.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public int translate(final CharSequence input, final int index, final Writer out) throws IOException {try{__CLR4_5_2gezgezlvha7c5m.R.inc(21297);
        // check if translation exists for the input at position index
        __CLR4_5_2gezgezlvha7c5m.R.inc(21298);if ((((prefixSet.contains(input.charAt(index)))&&(__CLR4_5_2gezgezlvha7c5m.R.iget(21299)!=0|true))||(__CLR4_5_2gezgezlvha7c5m.R.iget(21300)==0&false))) {{
            __CLR4_5_2gezgezlvha7c5m.R.inc(21301);int max = longest;
            __CLR4_5_2gezgezlvha7c5m.R.inc(21302);if ((((index + longest > input.length())&&(__CLR4_5_2gezgezlvha7c5m.R.iget(21303)!=0|true))||(__CLR4_5_2gezgezlvha7c5m.R.iget(21304)==0&false))) {{
                __CLR4_5_2gezgezlvha7c5m.R.inc(21305);max = input.length() - index;
            }
            // implement greedy algorithm by trying maximum match first
            }__CLR4_5_2gezgezlvha7c5m.R.inc(21306);for (int i = max; (((i >= shortest)&&(__CLR4_5_2gezgezlvha7c5m.R.iget(21307)!=0|true))||(__CLR4_5_2gezgezlvha7c5m.R.iget(21308)==0&false)); i--) {{
                __CLR4_5_2gezgezlvha7c5m.R.inc(21309);final CharSequence subSeq = input.subSequence(index, index + i);
                __CLR4_5_2gezgezlvha7c5m.R.inc(21310);final String result = lookupMap.get(subSeq.toString());

                __CLR4_5_2gezgezlvha7c5m.R.inc(21311);if ((((result != null)&&(__CLR4_5_2gezgezlvha7c5m.R.iget(21312)!=0|true))||(__CLR4_5_2gezgezlvha7c5m.R.iget(21313)==0&false))) {{
                    __CLR4_5_2gezgezlvha7c5m.R.inc(21314);out.write(result);
                    __CLR4_5_2gezgezlvha7c5m.R.inc(21315);return i;
                }
            }}
        }}
        }__CLR4_5_2gezgezlvha7c5m.R.inc(21316);return 0;
    }finally{__CLR4_5_2gezgezlvha7c5m.R.flushNeeded();}}
}
