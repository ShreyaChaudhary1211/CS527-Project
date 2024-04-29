/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.googlecode.mp4parser.syncsamples;

import com.coremedia.iso.boxes.MovieBox;
import com.googlecode.mp4parser.FileDataSourceImpl;
import com.googlecode.mp4parser.authoring.Movie;
import com.googlecode.mp4parser.authoring.Track;
import com.googlecode.mp4parser.authoring.container.mp4.MovieCreator;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;


public class ListSyncSamples {public static class __CLR4_5_21by1bylvl9g11j{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0030\u0037\u0038\u0035\u0039\u0030\u0037\u0038\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0065\u0078\u0061\u006d\u0070\u006c\u0065\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714413351766L,8589935092L,1750,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static void main(String[] args) throws IOException {try{__CLR4_5_21by1bylvl9g11j.R.inc(1726);
        __CLR4_5_21by1bylvl9g11j.R.inc(1727);Map<String, long[]> ss = new LinkedHashMap<String, long[]>();
        __CLR4_5_21by1bylvl9g11j.R.inc(1728);int maxIndex = 0;
        __CLR4_5_21by1bylvl9g11j.R.inc(1729);for (String arg : args) {{
            __CLR4_5_21by1bylvl9g11j.R.inc(1730);File f = new File(arg);
            __CLR4_5_21by1bylvl9g11j.R.inc(1731);Movie m = MovieCreator.build(new FileDataSourceImpl(f));
            __CLR4_5_21by1bylvl9g11j.R.inc(1732);for (Track track : m.getTracks()) {{
                __CLR4_5_21by1bylvl9g11j.R.inc(1733);if (((("vide".equals(track.getHandler()))&&(__CLR4_5_21by1bylvl9g11j.R.iget(1734)!=0|true))||(__CLR4_5_21by1bylvl9g11j.R.iget(1735)==0&false))) {{
                    __CLR4_5_21by1bylvl9g11j.R.inc(1736);ss.put(f.getName() + track.getTrackMetaData().getTrackId(), track.getSyncSamples());
                    __CLR4_5_21by1bylvl9g11j.R.inc(1737);maxIndex = Math.max(maxIndex, track.getSyncSamples().length);
                }
            }}
        }}
        }__CLR4_5_21by1bylvl9g11j.R.inc(1738);for (String s : ss.keySet()) {{
            __CLR4_5_21by1bylvl9g11j.R.inc(1739);System.out.print(String.format("|%10s", s));
        }
        }__CLR4_5_21by1bylvl9g11j.R.inc(1740);System.out.println("|");

        __CLR4_5_21by1bylvl9g11j.R.inc(1741);for (int i = 0; (((i < maxIndex)&&(__CLR4_5_21by1bylvl9g11j.R.iget(1742)!=0|true))||(__CLR4_5_21by1bylvl9g11j.R.iget(1743)==0&false)); i++) {{
            __CLR4_5_21by1bylvl9g11j.R.inc(1744);for (String s : ss.keySet()) {{
                __CLR4_5_21by1bylvl9g11j.R.inc(1745);long[] syncSamples = ss.get(s);
                __CLR4_5_21by1bylvl9g11j.R.inc(1746);try {
                    __CLR4_5_21by1bylvl9g11j.R.inc(1747);System.out.print(String.format("|%10d", syncSamples[i]));
                } catch (IndexOutOfBoundsException e) {
                    __CLR4_5_21by1bylvl9g11j.R.inc(1748);System.out.print(String.format("|%10s", ""));
                }
            }
            }__CLR4_5_21by1bylvl9g11j.R.inc(1749);System.out.println("|");
        }

    }}finally{__CLR4_5_21by1bylvl9g11j.R.flushNeeded();}}
}
