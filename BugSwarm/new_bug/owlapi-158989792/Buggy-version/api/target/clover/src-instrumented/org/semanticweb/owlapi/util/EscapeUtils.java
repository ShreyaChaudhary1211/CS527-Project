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
package org.semanticweb.owlapi.util;

import static org.semanticweb.owlapi.util.OWLAPIPreconditions.verifyNotNull;

import javax.annotation.Nonnull;

/**
 * @author Matthew Horridge, The University Of Manchester, Bio-Health
 *         Informatics Group
 * @since 2.2.0
 */
public final class EscapeUtils {public static class __CLR4_5_2622622lvickpwz{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0061\u0070\u0069\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237201267L,8589935092L,7897,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private EscapeUtils() {try{__CLR4_5_2622622lvickpwz.R.inc(7850);}finally{__CLR4_5_2622622lvickpwz.R.flushNeeded();}}

    /**
     * Escapes quotes and backslashes in a string. Double quotes are replaced
     * with a backslash followed by a double quote, and backslashes are replaced
     * with a double backslash.
     * 
     * @param s
     *        The string to be escaped
     * @return The escaped string.
     */
    @Nonnull
    public static String escapeString(@Nonnull String s) {try{__CLR4_5_2622622lvickpwz.R.inc(7851);
        // We replace double quotes with a back slash followed
        // by a double quote. We replace backslashes with a double
        // backslash
        __CLR4_5_2622622lvickpwz.R.inc(7852);if ((((s.indexOf('\"') == -1 && s.indexOf('\\') == -1)&&(__CLR4_5_2622622lvickpwz.R.iget(7853)!=0|true))||(__CLR4_5_2622622lvickpwz.R.iget(7854)==0&false))) {{
            __CLR4_5_2622622lvickpwz.R.inc(7855);return s;
        }
        }__CLR4_5_2622622lvickpwz.R.inc(7856);StringBuilder sb = new StringBuilder(s.length() + 20);
        __CLR4_5_2622622lvickpwz.R.inc(7857);for (int i = 0; (((i < s.length())&&(__CLR4_5_2622622lvickpwz.R.iget(7858)!=0|true))||(__CLR4_5_2622622lvickpwz.R.iget(7859)==0&false)); i++) {{
            __CLR4_5_2622622lvickpwz.R.inc(7860);char ch = s.charAt(i);
            __CLR4_5_2622622lvickpwz.R.inc(7861);if ((((ch == '\\')&&(__CLR4_5_2622622lvickpwz.R.iget(7862)!=0|true))||(__CLR4_5_2622622lvickpwz.R.iget(7863)==0&false))) {{
                __CLR4_5_2622622lvickpwz.R.inc(7864);sb.append("\\\\");
            } }else {__CLR4_5_2622622lvickpwz.R.inc(7865);if ((((ch == '\"')&&(__CLR4_5_2622622lvickpwz.R.iget(7866)!=0|true))||(__CLR4_5_2622622lvickpwz.R.iget(7867)==0&false))) {{
                __CLR4_5_2622622lvickpwz.R.inc(7868);sb.append("\\\"");
            } }else {{
                __CLR4_5_2622622lvickpwz.R.inc(7869);sb.append(ch);
            }
        }}}
        }__CLR4_5_2622622lvickpwz.R.inc(7870);return verifyNotNull(sb.toString());
    }finally{__CLR4_5_2622622lvickpwz.R.flushNeeded();}}

    /**
     * @param s
     *        string to unescape
     * @return the unescaped string
     */
    public static String unescapeString(String s) {try{__CLR4_5_2622622lvickpwz.R.inc(7871);
        __CLR4_5_2622622lvickpwz.R.inc(7872);if ((((s.indexOf('\\') == -1)&&(__CLR4_5_2622622lvickpwz.R.iget(7873)!=0|true))||(__CLR4_5_2622622lvickpwz.R.iget(7874)==0&false))) {{
            __CLR4_5_2622622lvickpwz.R.inc(7875);return s;
        }
        }__CLR4_5_2622622lvickpwz.R.inc(7876);StringBuilder sb = new StringBuilder(s.length());
        __CLR4_5_2622622lvickpwz.R.inc(7877);for (int i = 0; (((i < s.length())&&(__CLR4_5_2622622lvickpwz.R.iget(7878)!=0|true))||(__CLR4_5_2622622lvickpwz.R.iget(7879)==0&false)); i++) {{
            __CLR4_5_2622622lvickpwz.R.inc(7880);char ch = s.charAt(i);
            __CLR4_5_2622622lvickpwz.R.inc(7881);if ((((ch == '\\')&&(__CLR4_5_2622622lvickpwz.R.iget(7882)!=0|true))||(__CLR4_5_2622622lvickpwz.R.iget(7883)==0&false))) {{
                __CLR4_5_2622622lvickpwz.R.inc(7884);int j = i + 1;
                __CLR4_5_2622622lvickpwz.R.inc(7885);if ((((j < s.length())&&(__CLR4_5_2622622lvickpwz.R.iget(7886)!=0|true))||(__CLR4_5_2622622lvickpwz.R.iget(7887)==0&false))) {{
                    __CLR4_5_2622622lvickpwz.R.inc(7888);char escCh = s.charAt(j);
                    __CLR4_5_2622622lvickpwz.R.inc(7889);if ((((escCh == '\\' || escCh == '\"')&&(__CLR4_5_2622622lvickpwz.R.iget(7890)!=0|true))||(__CLR4_5_2622622lvickpwz.R.iget(7891)==0&false))) {{
                        __CLR4_5_2622622lvickpwz.R.inc(7892);i++;
                        __CLR4_5_2622622lvickpwz.R.inc(7893);sb.append(escCh);
                    }
                }} }else {{
                    __CLR4_5_2622622lvickpwz.R.inc(7894);sb.append('\\');
                }
            }} }else {{
                __CLR4_5_2622622lvickpwz.R.inc(7895);sb.append(ch);
            }
        }}
        }__CLR4_5_2622622lvickpwz.R.inc(7896);return sb.toString();
    }finally{__CLR4_5_2622622lvickpwz.R.flushNeeded();}}
}
