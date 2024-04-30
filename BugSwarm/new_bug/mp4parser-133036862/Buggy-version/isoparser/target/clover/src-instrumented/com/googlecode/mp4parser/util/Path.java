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

public class Path {public static class __CLR4_5_2fuyfuylvlulniu{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0033\u0033\u0030\u0033\u0036\u0038\u0036\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714448869219L,8589935092L,20675,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private Path() {try{__CLR4_5_2fuyfuylvlulniu.R.inc(20554);
    }finally{__CLR4_5_2fuyfuylvlulniu.R.flushNeeded();}}

    static Pattern component = Pattern.compile("(....|\\.\\.)(\\[(.*)\\])?");

    public static String createPath(Box box) {try{__CLR4_5_2fuyfuylvlulniu.R.inc(20555);
        __CLR4_5_2fuyfuylvlulniu.R.inc(20556);return createPath(box, "");
    }finally{__CLR4_5_2fuyfuylvlulniu.R.flushNeeded();}}

    private static String createPath(Box box, String path) {try{__CLR4_5_2fuyfuylvlulniu.R.inc(20557);

        __CLR4_5_2fuyfuylvlulniu.R.inc(20558);Container parent = box.getParent();
        __CLR4_5_2fuyfuylvlulniu.R.inc(20559);int index = 0;
        __CLR4_5_2fuyfuylvlulniu.R.inc(20560);List<Box> siblings = parent.getBoxes();
        __CLR4_5_2fuyfuylvlulniu.R.inc(20561);for (Box sibling : siblings) {{
            __CLR4_5_2fuyfuylvlulniu.R.inc(20562);if ((((sibling.getType().equals(box.getType()))&&(__CLR4_5_2fuyfuylvlulniu.R.iget(20563)!=0|true))||(__CLR4_5_2fuyfuylvlulniu.R.iget(20564)==0&false))) {{
                __CLR4_5_2fuyfuylvlulniu.R.inc(20565);if ((((sibling == box)&&(__CLR4_5_2fuyfuylvlulniu.R.iget(20566)!=0|true))||(__CLR4_5_2fuyfuylvlulniu.R.iget(20567)==0&false))) {{
                    __CLR4_5_2fuyfuylvlulniu.R.inc(20568);break;
                }
                }__CLR4_5_2fuyfuylvlulniu.R.inc(20569);index++;
            }
        }}
        }__CLR4_5_2fuyfuylvlulniu.R.inc(20570);path = String.format("/%s[%d]", box.getType(), index) + path;
        __CLR4_5_2fuyfuylvlulniu.R.inc(20571);if ((((parent instanceof Box)&&(__CLR4_5_2fuyfuylvlulniu.R.iget(20572)!=0|true))||(__CLR4_5_2fuyfuylvlulniu.R.iget(20573)==0&false))) {{
            __CLR4_5_2fuyfuylvlulniu.R.inc(20574);return createPath((Box) parent, path);
        } }else {{
            __CLR4_5_2fuyfuylvlulniu.R.inc(20575);return path;
        }
    }}finally{__CLR4_5_2fuyfuylvlulniu.R.flushNeeded();}}

    public static <T extends Box> T getPath(Box box, String path) {try{__CLR4_5_2fuyfuylvlulniu.R.inc(20576);
        __CLR4_5_2fuyfuylvlulniu.R.inc(20577);List<T> all = getPaths(box, path, true);
        __CLR4_5_2fuyfuylvlulniu.R.inc(20578);return (((all.isEmpty() )&&(__CLR4_5_2fuyfuylvlulniu.R.iget(20579)!=0|true))||(__CLR4_5_2fuyfuylvlulniu.R.iget(20580)==0&false))? null : all.get(0);
    }finally{__CLR4_5_2fuyfuylvlulniu.R.flushNeeded();}}

    public static <T extends Box> T  getPath(Container container, String path) {try{__CLR4_5_2fuyfuylvlulniu.R.inc(20581);
        __CLR4_5_2fuyfuylvlulniu.R.inc(20582);List<T> all = getPaths(container, path, true);
        __CLR4_5_2fuyfuylvlulniu.R.inc(20583);return (((all.isEmpty() )&&(__CLR4_5_2fuyfuylvlulniu.R.iget(20584)!=0|true))||(__CLR4_5_2fuyfuylvlulniu.R.iget(20585)==0&false))? null : all.get(0);
    }finally{__CLR4_5_2fuyfuylvlulniu.R.flushNeeded();}}

    public static <T extends Box> T  getPath(AbstractContainerBox containerBox, String path) {try{__CLR4_5_2fuyfuylvlulniu.R.inc(20586);
        __CLR4_5_2fuyfuylvlulniu.R.inc(20587);List<T> all = getPaths(containerBox, path, true);
        __CLR4_5_2fuyfuylvlulniu.R.inc(20588);return (((all.isEmpty() )&&(__CLR4_5_2fuyfuylvlulniu.R.iget(20589)!=0|true))||(__CLR4_5_2fuyfuylvlulniu.R.iget(20590)==0&false))? null : all.get(0);
    }finally{__CLR4_5_2fuyfuylvlulniu.R.flushNeeded();}}


    public static <T extends Box> List<T> getPaths(Box box, String path) {try{__CLR4_5_2fuyfuylvlulniu.R.inc(20591);
        __CLR4_5_2fuyfuylvlulniu.R.inc(20592);return getPaths(box, path, false);
    }finally{__CLR4_5_2fuyfuylvlulniu.R.flushNeeded();}}

    public static <T extends Box> List<T> getPaths(Container container, String path) {try{__CLR4_5_2fuyfuylvlulniu.R.inc(20593);
        __CLR4_5_2fuyfuylvlulniu.R.inc(20594);return getPaths(container, path, false);
    }finally{__CLR4_5_2fuyfuylvlulniu.R.flushNeeded();}}

    private static <T extends Box> List<T> getPaths(AbstractContainerBox container, String path, boolean singleResult) {try{__CLR4_5_2fuyfuylvlulniu.R.inc(20595);
        __CLR4_5_2fuyfuylvlulniu.R.inc(20596);return getPaths((Object) container, path, singleResult);
    }finally{__CLR4_5_2fuyfuylvlulniu.R.flushNeeded();}}

    private static <T extends Box> List<T> getPaths(Container container, String path, boolean singleResult) {try{__CLR4_5_2fuyfuylvlulniu.R.inc(20597);
        __CLR4_5_2fuyfuylvlulniu.R.inc(20598);return getPaths((Object) container, path, singleResult);
    }finally{__CLR4_5_2fuyfuylvlulniu.R.flushNeeded();}}

    private static <T extends Box> List<T>  getPaths(Box box, String path, boolean singleResult) {try{__CLR4_5_2fuyfuylvlulniu.R.inc(20599);
        __CLR4_5_2fuyfuylvlulniu.R.inc(20600);return getPaths((Object) box, path, singleResult);
    }finally{__CLR4_5_2fuyfuylvlulniu.R.flushNeeded();}}

    @SuppressWarnings("unchecked")
    private static <T extends Box> List<T>  getPaths(Object thing, String path, boolean singleResult) {try{__CLR4_5_2fuyfuylvlulniu.R.inc(20601);
        __CLR4_5_2fuyfuylvlulniu.R.inc(20602);if ((((path.startsWith("/"))&&(__CLR4_5_2fuyfuylvlulniu.R.iget(20603)!=0|true))||(__CLR4_5_2fuyfuylvlulniu.R.iget(20604)==0&false))) {{
            __CLR4_5_2fuyfuylvlulniu.R.inc(20605);path = path.substring(1);
            __CLR4_5_2fuyfuylvlulniu.R.inc(20606);while ((((thing instanceof Box)&&(__CLR4_5_2fuyfuylvlulniu.R.iget(20607)!=0|true))||(__CLR4_5_2fuyfuylvlulniu.R.iget(20608)==0&false))) {{
                __CLR4_5_2fuyfuylvlulniu.R.inc(20609);thing = ((Box) thing).getParent();
            }
        }}

        }__CLR4_5_2fuyfuylvlulniu.R.inc(20610);if ((((path.length() == 0)&&(__CLR4_5_2fuyfuylvlulniu.R.iget(20611)!=0|true))||(__CLR4_5_2fuyfuylvlulniu.R.iget(20612)==0&false))) {{
            __CLR4_5_2fuyfuylvlulniu.R.inc(20613);if ((((thing instanceof Box)&&(__CLR4_5_2fuyfuylvlulniu.R.iget(20614)!=0|true))||(__CLR4_5_2fuyfuylvlulniu.R.iget(20615)==0&false))) {{
                __CLR4_5_2fuyfuylvlulniu.R.inc(20616);return Collections.singletonList((T) thing);
            } }else {{
                __CLR4_5_2fuyfuylvlulniu.R.inc(20617);throw new RuntimeException("Result of path expression seems to be the root container. This is not allowed!");
            }
        }} }else {{
            __CLR4_5_2fuyfuylvlulniu.R.inc(20618);String later;
            __CLR4_5_2fuyfuylvlulniu.R.inc(20619);String now;
            __CLR4_5_2fuyfuylvlulniu.R.inc(20620);if ((((path.contains("/"))&&(__CLR4_5_2fuyfuylvlulniu.R.iget(20621)!=0|true))||(__CLR4_5_2fuyfuylvlulniu.R.iget(20622)==0&false))) {{
                __CLR4_5_2fuyfuylvlulniu.R.inc(20623);later = path.substring(path.indexOf('/') + 1);
                __CLR4_5_2fuyfuylvlulniu.R.inc(20624);now = path.substring(0, path.indexOf('/'));
            } }else {{
                __CLR4_5_2fuyfuylvlulniu.R.inc(20625);now = path;
                __CLR4_5_2fuyfuylvlulniu.R.inc(20626);later = "";
            }

            }__CLR4_5_2fuyfuylvlulniu.R.inc(20627);Matcher m = component.matcher(now);
            __CLR4_5_2fuyfuylvlulniu.R.inc(20628);if ((((m.matches())&&(__CLR4_5_2fuyfuylvlulniu.R.iget(20629)!=0|true))||(__CLR4_5_2fuyfuylvlulniu.R.iget(20630)==0&false))) {{
                __CLR4_5_2fuyfuylvlulniu.R.inc(20631);String type = m.group(1);
                __CLR4_5_2fuyfuylvlulniu.R.inc(20632);if (((("..".equals(type))&&(__CLR4_5_2fuyfuylvlulniu.R.iget(20633)!=0|true))||(__CLR4_5_2fuyfuylvlulniu.R.iget(20634)==0&false))) {{
                    __CLR4_5_2fuyfuylvlulniu.R.inc(20635);if ((((thing instanceof Box)&&(__CLR4_5_2fuyfuylvlulniu.R.iget(20636)!=0|true))||(__CLR4_5_2fuyfuylvlulniu.R.iget(20637)==0&false))) {{
                        __CLR4_5_2fuyfuylvlulniu.R.inc(20638);return Path.getPaths(((Box) thing).getParent(), later, singleResult);
                    } }else {{
                        __CLR4_5_2fuyfuylvlulniu.R.inc(20639);return Collections.emptyList();
                    }
                }} }else {{
                    __CLR4_5_2fuyfuylvlulniu.R.inc(20640);if ((((thing instanceof Container)&&(__CLR4_5_2fuyfuylvlulniu.R.iget(20641)!=0|true))||(__CLR4_5_2fuyfuylvlulniu.R.iget(20642)==0&false))) {{
                        __CLR4_5_2fuyfuylvlulniu.R.inc(20643);int index = -1;
                        __CLR4_5_2fuyfuylvlulniu.R.inc(20644);if ((((m.group(2) != null)&&(__CLR4_5_2fuyfuylvlulniu.R.iget(20645)!=0|true))||(__CLR4_5_2fuyfuylvlulniu.R.iget(20646)==0&false))) {{
                            // we have a specific index
                            __CLR4_5_2fuyfuylvlulniu.R.inc(20647);String indexString = m.group(3);
                            __CLR4_5_2fuyfuylvlulniu.R.inc(20648);index = Integer.parseInt(indexString);
                        }
                        }__CLR4_5_2fuyfuylvlulniu.R.inc(20649);List<T> children = new LinkedList<T>();
                        __CLR4_5_2fuyfuylvlulniu.R.inc(20650);int currentIndex = 0;
                        // I'm suspecting some Dalvik VM to create indexed loops from for-each loops
                        // using the iterator instead makes sure that this doesn't happen
                        // (and yes - it could be completely useless)
                        __CLR4_5_2fuyfuylvlulniu.R.inc(20651);Iterator<Box> iterator = ((Container) thing).getBoxes().iterator();
                        __CLR4_5_2fuyfuylvlulniu.R.inc(20652);while ((((iterator.hasNext())&&(__CLR4_5_2fuyfuylvlulniu.R.iget(20653)!=0|true))||(__CLR4_5_2fuyfuylvlulniu.R.iget(20654)==0&false))) {{
                            __CLR4_5_2fuyfuylvlulniu.R.inc(20655);Box box1 = iterator.next();
                            __CLR4_5_2fuyfuylvlulniu.R.inc(20656);if ((((box1.getType().matches(type))&&(__CLR4_5_2fuyfuylvlulniu.R.iget(20657)!=0|true))||(__CLR4_5_2fuyfuylvlulniu.R.iget(20658)==0&false))) {{
                                __CLR4_5_2fuyfuylvlulniu.R.inc(20659);if ((((index == -1 || index == currentIndex)&&(__CLR4_5_2fuyfuylvlulniu.R.iget(20660)!=0|true))||(__CLR4_5_2fuyfuylvlulniu.R.iget(20661)==0&false))) {{
                                    __CLR4_5_2fuyfuylvlulniu.R.inc(20662);children.addAll(Path.<T>getPaths(box1, later, singleResult));
                                }
                                }__CLR4_5_2fuyfuylvlulniu.R.inc(20663);currentIndex++;
                            }
                            }__CLR4_5_2fuyfuylvlulniu.R.inc(20664);if (((((singleResult || index >= 0) && !children.isEmpty())&&(__CLR4_5_2fuyfuylvlulniu.R.iget(20665)!=0|true))||(__CLR4_5_2fuyfuylvlulniu.R.iget(20666)==0&false))) {{
                                __CLR4_5_2fuyfuylvlulniu.R.inc(20667);return children;
                            }
                        }}
                        }__CLR4_5_2fuyfuylvlulniu.R.inc(20668);return children;
                    } }else {{
                        __CLR4_5_2fuyfuylvlulniu.R.inc(20669);return Collections.emptyList();
                    }
                }}
            }} }else {{
                __CLR4_5_2fuyfuylvlulniu.R.inc(20670);throw new RuntimeException(now + " is invalid path.");
            }

        }}

    }}finally{__CLR4_5_2fuyfuylvlulniu.R.flushNeeded();}}


    public static boolean isContained(Box box, String path) {try{__CLR4_5_2fuyfuylvlulniu.R.inc(20671);
        assert (((path.startsWith("/") )&&(__CLR4_5_2fuyfuylvlulniu.R.iget(20672)!=0|true))||(__CLR4_5_2fuyfuylvlulniu.R.iget(20673)==0&false)): "Absolute path required";
        __CLR4_5_2fuyfuylvlulniu.R.inc(20674);return getPaths(box, path).contains(box);
    }finally{__CLR4_5_2fuyfuylvlulniu.R.flushNeeded();}}
}
