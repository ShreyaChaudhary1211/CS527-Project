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
package uk.ac.manchester.owl.owlapi.tutorialowled2011;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@SuppressWarnings("javadoc")
public final class Formatter {public static class __CLR4_5_21111lvicnyki{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0063\u006f\u006e\u0074\u0072\u0061\u0063\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237362759L,8589935092L,81,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private Formatter() {try{__CLR4_5_21111lvicnyki.R.inc(37);}finally{__CLR4_5_21111lvicnyki.R.flushNeeded();}}

    public static void main(String[] args) throws Exception {try{__CLR4_5_21111lvicnyki.R.inc(38);
        __CLR4_5_21111lvicnyki.R.inc(39);System.out.println("Formatter.main() " + Long.MAX_VALUE
                / (1000 * 86000 * 365));
        __CLR4_5_21111lvicnyki.R.inc(40);Map<String, String> specials = new HashMap<>();
        __CLR4_5_21111lvicnyki.R.inc(41);specials.put("public void test", "\\begin{beamerboxesrounded}{");
        __CLR4_5_21111lvicnyki.R.inc(42);specials.put("() throws Exception \\{", "}\n\\scriptsize");
        __CLR4_5_21111lvicnyki.R.inc(43);String[] keywords = { " class ", " void ", " extends ", "public",
                " static final", "return", "throws" };
        __CLR4_5_21111lvicnyki.R.inc(44);Pattern stringPattern = Pattern.compile("(\"[\\w\\.\\:\\s\\#/\\-]*\")");
        __CLR4_5_21111lvicnyki.R.inc(45);BufferedReader r = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream(
                                "../OWLAPI3/tutorial2011/uk/ac/manchester/owl/owlapi/tutorialowled2011/TutorialSnippets.java")));
        __CLR4_5_21111lvicnyki.R.inc(46);String line = r.readLine();
        __CLR4_5_21111lvicnyki.R.inc(47);while ((((line != null)&&(__CLR4_5_21111lvicnyki.R.iget(48)!=0|true))||(__CLR4_5_21111lvicnyki.R.iget(49)==0&false))) {{
            __CLR4_5_21111lvicnyki.R.inc(50);if ((((line.trim().isEmpty())&&(__CLR4_5_21111lvicnyki.R.iget(51)!=0|true))||(__CLR4_5_21111lvicnyki.R.iget(52)==0&false))) {{
                __CLR4_5_21111lvicnyki.R.inc(53);System.out.println("\\end{beamerboxesrounded}\n\n");
            } }else {{
                __CLR4_5_21111lvicnyki.R.inc(54);line = line.replace("{", "\\{").replace("}", "\\}")
                        .replace("_", "\\_");
                __CLR4_5_21111lvicnyki.R.inc(55);if ((((line.trim().startsWith("//"))&&(__CLR4_5_21111lvicnyki.R.iget(56)!=0|true))||(__CLR4_5_21111lvicnyki.R.iget(57)==0&false))) {{
                    __CLR4_5_21111lvicnyki.R.inc(58);System.out
                            .println("\\codecomment{" + line.trim() + "}\\\\");
                } }else {{
                    // regular code
                    __CLR4_5_21111lvicnyki.R.inc(59);for (String s : specials.keySet()) {{
                        __CLR4_5_21111lvicnyki.R.inc(60);line = line.replace(s, specials.get(s));
                    }
                    }__CLR4_5_21111lvicnyki.R.inc(61);for (String s : keywords) {{
                        __CLR4_5_21111lvicnyki.R.inc(62);line = line.replace(s, "\\codekeyword{" + s + '}');
                    }
                    }__CLR4_5_21111lvicnyki.R.inc(63);line = line
                            .replace("\t", "\\hspace{4mm}")
                            .replace("    ", "\\hspace{4mm}")
                            .replace("\\hspace{4mm}\\hspace{4mm}",
                                    "\\hspace{4mm}");
                    __CLR4_5_21111lvicnyki.R.inc(64);Matcher match = stringPattern.matcher(line);
                    __CLR4_5_21111lvicnyki.R.inc(65);List<String> strings = new ArrayList<>();
                    __CLR4_5_21111lvicnyki.R.inc(66);while ((((match.find())&&(__CLR4_5_21111lvicnyki.R.iget(67)!=0|true))||(__CLR4_5_21111lvicnyki.R.iget(68)==0&false))) {{
                        __CLR4_5_21111lvicnyki.R.inc(69);strings.add(match.group(1));
                    }
                    }__CLR4_5_21111lvicnyki.R.inc(70);for (String s : strings) {{
                        __CLR4_5_21111lvicnyki.R.inc(71);line = line.replace(s, "\\codestring{" + s + '}');
                    }
                    }__CLR4_5_21111lvicnyki.R.inc(72);if ((((!line.contains("beamerboxesrounded"))&&(__CLR4_5_21111lvicnyki.R.iget(73)!=0|true))||(__CLR4_5_21111lvicnyki.R.iget(74)==0&false))) {{
                        __CLR4_5_21111lvicnyki.R.inc(75);System.out.print("\\coderegular{");
                        __CLR4_5_21111lvicnyki.R.inc(76);System.out.print(line.trim());
                        __CLR4_5_21111lvicnyki.R.inc(77);System.out.println("}\\\\");
                    } }else {{
                        __CLR4_5_21111lvicnyki.R.inc(78);System.out.println(line.trim());
                    }
                }}
            }}
            }__CLR4_5_21111lvicnyki.R.inc(79);line = r.readLine();
        }
        }__CLR4_5_21111lvicnyki.R.inc(80);r.close();
    }finally{__CLR4_5_21111lvicnyki.R.flushNeeded();}}
}
