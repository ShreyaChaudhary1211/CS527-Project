/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2011 Sebastian Annies, Hamburg
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
package com.googlecode.mp4parser.srt;

import com.googlecode.mp4parser.authoring.tracks.TextTrackImpl;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.LineNumberReader;

/**
 * Parses a .srt file and creates a Track for it.
 */
public class SrtParser {public static class __CLR4_5_2fihfihlvlulncf{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0033\u0033\u0030\u0033\u0036\u0038\u0036\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714448869219L,8589935092L,20129,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static TextTrackImpl parse(InputStream is) throws IOException {try{__CLR4_5_2fihfihlvlulncf.R.inc(20105);
        __CLR4_5_2fihfihlvlulncf.R.inc(20106);LineNumberReader r = new LineNumberReader(new InputStreamReader(is, "UTF-8"));
        __CLR4_5_2fihfihlvlulncf.R.inc(20107);TextTrackImpl track = new TextTrackImpl();
        __CLR4_5_2fihfihlvlulncf.R.inc(20108);String numberString;
        __CLR4_5_2fihfihlvlulncf.R.inc(20109);while ((numberString = r.readLine()) != null) {{
            __CLR4_5_2fihfihlvlulncf.R.inc(20112);String timeString = r.readLine();
            __CLR4_5_2fihfihlvlulncf.R.inc(20113);String lineString = "";
            __CLR4_5_2fihfihlvlulncf.R.inc(20114);String s;
            __CLR4_5_2fihfihlvlulncf.R.inc(20115);while (!((s = r.readLine()) == null || s.trim().equals(""))) {{
                __CLR4_5_2fihfihlvlulncf.R.inc(20118);lineString += s + "\n";
            }

            }__CLR4_5_2fihfihlvlulncf.R.inc(20119);long startTime = parse(timeString.split("-->")[0]);
            __CLR4_5_2fihfihlvlulncf.R.inc(20120);long endTime = parse(timeString.split("-->")[1]);

            __CLR4_5_2fihfihlvlulncf.R.inc(20121);track.getSubs().add(new TextTrackImpl.Line(startTime, endTime, lineString));

        }
        }__CLR4_5_2fihfihlvlulncf.R.inc(20122);return track;
    }finally{__CLR4_5_2fihfihlvlulncf.R.flushNeeded();}}

    private static long parse(String in) {try{__CLR4_5_2fihfihlvlulncf.R.inc(20123);
        __CLR4_5_2fihfihlvlulncf.R.inc(20124);long hours = Long.parseLong(in.split(":")[0].trim());
        __CLR4_5_2fihfihlvlulncf.R.inc(20125);long minutes = Long.parseLong(in.split(":")[1].trim());
        __CLR4_5_2fihfihlvlulncf.R.inc(20126);long seconds = Long.parseLong(in.split(":")[2].split(",")[0].trim());
        __CLR4_5_2fihfihlvlulncf.R.inc(20127);long millies = Long.parseLong(in.split(":")[2].split(",")[1].trim());

        __CLR4_5_2fihfihlvlulncf.R.inc(20128);return hours * 60 * 60 * 1000 + minutes * 60 * 1000 + seconds * 1000 + millies;

    }finally{__CLR4_5_2fihfihlvlulncf.R.flushNeeded();}}
}
