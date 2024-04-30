/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2012 Sebastian Annies, Hamburg
 *
 * Licensed under the Apache License, Version 2.0 (the License);
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an AS IS BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.googlecode.mp4parser.util;


import com.coremedia.iso.boxes.Box;
import com.coremedia.iso.boxes.Container;
import com.googlecode.mp4parser.AbstractContainerBox;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Path {public static class __CLR4_5_2fsbfsblvl9el2l{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0030\u0037\u0038\u0035\u0039\u0030\u0037\u0038\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714413275835L,8589935092L,20580,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private Path() {try{__CLR4_5_2fsbfsblvl9el2l.R.inc(20459);
    }finally{__CLR4_5_2fsbfsblvl9el2l.R.flushNeeded();}}

    static Pattern component = Pattern.compile("(....|\\.\\.)(\\[(.*)\\])?");

    public static String createPath(Box box) {try{__CLR4_5_2fsbfsblvl9el2l.R.inc(20460);
        __CLR4_5_2fsbfsblvl9el2l.R.inc(20461);return createPath(box, "");
    }finally{__CLR4_5_2fsbfsblvl9el2l.R.flushNeeded();}}

    private static String createPath(Box box, String path) {try{__CLR4_5_2fsbfsblvl9el2l.R.inc(20462);

        __CLR4_5_2fsbfsblvl9el2l.R.inc(20463);Container parent = box.getParent();
        __CLR4_5_2fsbfsblvl9el2l.R.inc(20464);int index = 0;
        __CLR4_5_2fsbfsblvl9el2l.R.inc(20465);List<Box> siblings = parent.getBoxes();
        __CLR4_5_2fsbfsblvl9el2l.R.inc(20466);for (Box sibling : siblings) {{
            __CLR4_5_2fsbfsblvl9el2l.R.inc(20467);if ((((sibling.getType().equals(box.getType()))&&(__CLR4_5_2fsbfsblvl9el2l.R.iget(20468)!=0|true))||(__CLR4_5_2fsbfsblvl9el2l.R.iget(20469)==0&false))) {{
                __CLR4_5_2fsbfsblvl9el2l.R.inc(20470);if ((((sibling == box)&&(__CLR4_5_2fsbfsblvl9el2l.R.iget(20471)!=0|true))||(__CLR4_5_2fsbfsblvl9el2l.R.iget(20472)==0&false))) {{
                    __CLR4_5_2fsbfsblvl9el2l.R.inc(20473);break;
                }
                }__CLR4_5_2fsbfsblvl9el2l.R.inc(20474);index++;
            }
        }}
        }__CLR4_5_2fsbfsblvl9el2l.R.inc(20475);path = String.format("/%s[%d]", box.getType(), index) + path;
        __CLR4_5_2fsbfsblvl9el2l.R.inc(20476);if ((((parent instanceof Box)&&(__CLR4_5_2fsbfsblvl9el2l.R.iget(20477)!=0|true))||(__CLR4_5_2fsbfsblvl9el2l.R.iget(20478)==0&false))) {{
            __CLR4_5_2fsbfsblvl9el2l.R.inc(20479);return createPath((Box) parent, path);
        } }else {{
            __CLR4_5_2fsbfsblvl9el2l.R.inc(20480);return path;
        }
    }}finally{__CLR4_5_2fsbfsblvl9el2l.R.flushNeeded();}}

    public static <T extends Box> T getPath(Box box, String path) {try{__CLR4_5_2fsbfsblvl9el2l.R.inc(20481);
        __CLR4_5_2fsbfsblvl9el2l.R.inc(20482);List<T> all = getPaths(box, path, true);
        __CLR4_5_2fsbfsblvl9el2l.R.inc(20483);return (((all.isEmpty() )&&(__CLR4_5_2fsbfsblvl9el2l.R.iget(20484)!=0|true))||(__CLR4_5_2fsbfsblvl9el2l.R.iget(20485)==0&false))? null : all.get(0);
    }finally{__CLR4_5_2fsbfsblvl9el2l.R.flushNeeded();}}

    public static <T extends Box> T  getPath(Container container, String path) {try{__CLR4_5_2fsbfsblvl9el2l.R.inc(20486);
        __CLR4_5_2fsbfsblvl9el2l.R.inc(20487);List<T> all = getPaths(container, path, true);
        __CLR4_5_2fsbfsblvl9el2l.R.inc(20488);return (((all.isEmpty() )&&(__CLR4_5_2fsbfsblvl9el2l.R.iget(20489)!=0|true))||(__CLR4_5_2fsbfsblvl9el2l.R.iget(20490)==0&false))? null : all.get(0);
    }finally{__CLR4_5_2fsbfsblvl9el2l.R.flushNeeded();}}

    public static <T extends Box> T  getPath(AbstractContainerBox containerBox, String path) {try{__CLR4_5_2fsbfsblvl9el2l.R.inc(20491);
        __CLR4_5_2fsbfsblvl9el2l.R.inc(20492);List<T> all = getPaths(containerBox, path, true);
        __CLR4_5_2fsbfsblvl9el2l.R.inc(20493);return (((all.isEmpty() )&&(__CLR4_5_2fsbfsblvl9el2l.R.iget(20494)!=0|true))||(__CLR4_5_2fsbfsblvl9el2l.R.iget(20495)==0&false))? null : all.get(0);
    }finally{__CLR4_5_2fsbfsblvl9el2l.R.flushNeeded();}}


    public static <T extends Box> List<T> getPaths(Box box, String path) {try{__CLR4_5_2fsbfsblvl9el2l.R.inc(20496);
        __CLR4_5_2fsbfsblvl9el2l.R.inc(20497);return getPaths(box, path, false);
    }finally{__CLR4_5_2fsbfsblvl9el2l.R.flushNeeded();}}

    public static <T extends Box> List<T> getPaths(Container container, String path) {try{__CLR4_5_2fsbfsblvl9el2l.R.inc(20498);
        __CLR4_5_2fsbfsblvl9el2l.R.inc(20499);return getPaths(container, path, false);
    }finally{__CLR4_5_2fsbfsblvl9el2l.R.flushNeeded();}}

    private static <T extends Box> List<T> getPaths(AbstractContainerBox container, String path, boolean singleResult) {try{__CLR4_5_2fsbfsblvl9el2l.R.inc(20500);
        __CLR4_5_2fsbfsblvl9el2l.R.inc(20501);return getPaths((Object) container, path, singleResult);
    }finally{__CLR4_5_2fsbfsblvl9el2l.R.flushNeeded();}}

    private static <T extends Box> List<T> getPaths(Container container, String path, boolean singleResult) {try{__CLR4_5_2fsbfsblvl9el2l.R.inc(20502);
        __CLR4_5_2fsbfsblvl9el2l.R.inc(20503);return getPaths((Object) container, path, singleResult);
    }finally{__CLR4_5_2fsbfsblvl9el2l.R.flushNeeded();}}

    private static <T extends Box> List<T>  getPaths(Box box, String path, boolean singleResult) {try{__CLR4_5_2fsbfsblvl9el2l.R.inc(20504);
        __CLR4_5_2fsbfsblvl9el2l.R.inc(20505);return getPaths((Object) box, path, singleResult);
    }finally{__CLR4_5_2fsbfsblvl9el2l.R.flushNeeded();}}

    @SuppressWarnings("unchecked")
    private static <T extends Box> List<T>  getPaths(Object thing, String path, boolean singleResult) {try{__CLR4_5_2fsbfsblvl9el2l.R.inc(20506);
        __CLR4_5_2fsbfsblvl9el2l.R.inc(20507);if ((((path.startsWith("/"))&&(__CLR4_5_2fsbfsblvl9el2l.R.iget(20508)!=0|true))||(__CLR4_5_2fsbfsblvl9el2l.R.iget(20509)==0&false))) {{
            __CLR4_5_2fsbfsblvl9el2l.R.inc(20510);path = path.substring(1);
            __CLR4_5_2fsbfsblvl9el2l.R.inc(20511);while ((((thing instanceof Box)&&(__CLR4_5_2fsbfsblvl9el2l.R.iget(20512)!=0|true))||(__CLR4_5_2fsbfsblvl9el2l.R.iget(20513)==0&false))) {{
                __CLR4_5_2fsbfsblvl9el2l.R.inc(20514);thing = ((Box) thing).getParent();
            }
        }}

        }__CLR4_5_2fsbfsblvl9el2l.R.inc(20515);if ((((path.length() == 0)&&(__CLR4_5_2fsbfsblvl9el2l.R.iget(20516)!=0|true))||(__CLR4_5_2fsbfsblvl9el2l.R.iget(20517)==0&false))) {{
            __CLR4_5_2fsbfsblvl9el2l.R.inc(20518);if ((((thing instanceof Box)&&(__CLR4_5_2fsbfsblvl9el2l.R.iget(20519)!=0|true))||(__CLR4_5_2fsbfsblvl9el2l.R.iget(20520)==0&false))) {{
                __CLR4_5_2fsbfsblvl9el2l.R.inc(20521);return Collections.singletonList((T) thing);
            } }else {{
                __CLR4_5_2fsbfsblvl9el2l.R.inc(20522);throw new RuntimeException("Result of path expression seems to be the root container. This is not allowed!");
            }
        }} }else {{
            __CLR4_5_2fsbfsblvl9el2l.R.inc(20523);String later;
            __CLR4_5_2fsbfsblvl9el2l.R.inc(20524);String now;
            __CLR4_5_2fsbfsblvl9el2l.R.inc(20525);if ((((path.contains("/"))&&(__CLR4_5_2fsbfsblvl9el2l.R.iget(20526)!=0|true))||(__CLR4_5_2fsbfsblvl9el2l.R.iget(20527)==0&false))) {{
                __CLR4_5_2fsbfsblvl9el2l.R.inc(20528);later = path.substring(path.indexOf('/') + 1);
                __CLR4_5_2fsbfsblvl9el2l.R.inc(20529);now = path.substring(0, path.indexOf('/'));
            } }else {{
                __CLR4_5_2fsbfsblvl9el2l.R.inc(20530);now = path;
                __CLR4_5_2fsbfsblvl9el2l.R.inc(20531);later = "";
            }

            }__CLR4_5_2fsbfsblvl9el2l.R.inc(20532);Matcher m = component.matcher(now);
            __CLR4_5_2fsbfsblvl9el2l.R.inc(20533);if ((((m.matches())&&(__CLR4_5_2fsbfsblvl9el2l.R.iget(20534)!=0|true))||(__CLR4_5_2fsbfsblvl9el2l.R.iget(20535)==0&false))) {{
                __CLR4_5_2fsbfsblvl9el2l.R.inc(20536);String type = m.group(1);
                __CLR4_5_2fsbfsblvl9el2l.R.inc(20537);if (((("..".equals(type))&&(__CLR4_5_2fsbfsblvl9el2l.R.iget(20538)!=0|true))||(__CLR4_5_2fsbfsblvl9el2l.R.iget(20539)==0&false))) {{
                    __CLR4_5_2fsbfsblvl9el2l.R.inc(20540);if ((((thing instanceof Box)&&(__CLR4_5_2fsbfsblvl9el2l.R.iget(20541)!=0|true))||(__CLR4_5_2fsbfsblvl9el2l.R.iget(20542)==0&false))) {{
                        __CLR4_5_2fsbfsblvl9el2l.R.inc(20543);return Path.getPaths(((Box) thing).getParent(), later, singleResult);
                    } }else {{
                        __CLR4_5_2fsbfsblvl9el2l.R.inc(20544);return Collections.emptyList();
                    }
                }} }else {{
                    __CLR4_5_2fsbfsblvl9el2l.R.inc(20545);if ((((thing instanceof Container)&&(__CLR4_5_2fsbfsblvl9el2l.R.iget(20546)!=0|true))||(__CLR4_5_2fsbfsblvl9el2l.R.iget(20547)==0&false))) {{
                        __CLR4_5_2fsbfsblvl9el2l.R.inc(20548);int index = -1;
                        __CLR4_5_2fsbfsblvl9el2l.R.inc(20549);if ((((m.group(2) != null)&&(__CLR4_5_2fsbfsblvl9el2l.R.iget(20550)!=0|true))||(__CLR4_5_2fsbfsblvl9el2l.R.iget(20551)==0&false))) {{
                            // we have a specific index
                            __CLR4_5_2fsbfsblvl9el2l.R.inc(20552);String indexString = m.group(3);
                            __CLR4_5_2fsbfsblvl9el2l.R.inc(20553);index = Integer.parseInt(indexString);
                        }
                        }__CLR4_5_2fsbfsblvl9el2l.R.inc(20554);List<T> children = new LinkedList<T>();
                        __CLR4_5_2fsbfsblvl9el2l.R.inc(20555);int currentIndex = 0;
                        // I'm suspecting some Dalvik VM to create indexed loops from for-each loops
                        // using the iterator instead makes sure that this doesn't happen
                        // (and yes - it could be completely useless)
                        __CLR4_5_2fsbfsblvl9el2l.R.inc(20556);Iterator<Box> iterator = ((Container) thing).getBoxes().iterator();
                        __CLR4_5_2fsbfsblvl9el2l.R.inc(20557);while ((((iterator.hasNext())&&(__CLR4_5_2fsbfsblvl9el2l.R.iget(20558)!=0|true))||(__CLR4_5_2fsbfsblvl9el2l.R.iget(20559)==0&false))) {{
                            __CLR4_5_2fsbfsblvl9el2l.R.inc(20560);Box box1 = iterator.next();
                            __CLR4_5_2fsbfsblvl9el2l.R.inc(20561);if ((((box1.getType().matches(type))&&(__CLR4_5_2fsbfsblvl9el2l.R.iget(20562)!=0|true))||(__CLR4_5_2fsbfsblvl9el2l.R.iget(20563)==0&false))) {{
                                __CLR4_5_2fsbfsblvl9el2l.R.inc(20564);if ((((index == -1 || index == currentIndex)&&(__CLR4_5_2fsbfsblvl9el2l.R.iget(20565)!=0|true))||(__CLR4_5_2fsbfsblvl9el2l.R.iget(20566)==0&false))) {{
                                    __CLR4_5_2fsbfsblvl9el2l.R.inc(20567);children.addAll(Path.<T>getPaths(box1, later, singleResult));
                                }
                                }__CLR4_5_2fsbfsblvl9el2l.R.inc(20568);currentIndex++;
                            }
                            }__CLR4_5_2fsbfsblvl9el2l.R.inc(20569);if (((((singleResult || index >= 0) && !children.isEmpty())&&(__CLR4_5_2fsbfsblvl9el2l.R.iget(20570)!=0|true))||(__CLR4_5_2fsbfsblvl9el2l.R.iget(20571)==0&false))) {{
                                __CLR4_5_2fsbfsblvl9el2l.R.inc(20572);return children;
                            }
                        }}
                        }__CLR4_5_2fsbfsblvl9el2l.R.inc(20573);return children;
                    } }else {{
                        __CLR4_5_2fsbfsblvl9el2l.R.inc(20574);return Collections.emptyList();
                    }
                }}
            }} }else {{
                __CLR4_5_2fsbfsblvl9el2l.R.inc(20575);throw new RuntimeException(now + " is invalid path.");
            }

        }}

    }}finally{__CLR4_5_2fsbfsblvl9el2l.R.flushNeeded();}}


    public static boolean isContained(Box box, String path) {try{__CLR4_5_2fsbfsblvl9el2l.R.inc(20576);
        assert (((path.startsWith("/") )&&(__CLR4_5_2fsbfsblvl9el2l.R.iget(20577)!=0|true))||(__CLR4_5_2fsbfsblvl9el2l.R.iget(20578)==0&false)): "Absolute path required";
        __CLR4_5_2fsbfsblvl9el2l.R.inc(20579);return getPaths(box, path).contains(box);
    }finally{__CLR4_5_2fsbfsblvl9el2l.R.flushNeeded();}}
}
