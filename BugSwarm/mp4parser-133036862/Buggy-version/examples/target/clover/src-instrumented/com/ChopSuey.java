/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com;

import com.googlecode.mp4parser.authoring.Movie;
import com.googlecode.mp4parser.authoring.Track;
import com.googlecode.mp4parser.authoring.builder.DefaultMp4Builder;
import com.googlecode.mp4parser.authoring.builder.Mp4Builder;
import com.googlecode.mp4parser.authoring.container.mp4.MovieCreator;
import com.googlecode.mp4parser.authoring.tracks.CroppedTrack;
import com.googlecode.mp4parser.util.Mp4Arrays;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by sannies on 19.11.2015.
 */
public class ChopSuey {public static class __CLR4_5_200lvlunzou{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0033\u0033\u0030\u0033\u0036\u0038\u0036\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0065\u0078\u0061\u006d\u0070\u006c\u0065\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714448995581L,8589935092L,67,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static void main(String[] args) throws IOException {try{__CLR4_5_200lvlunzou.R.inc(0);
        __CLR4_5_200lvlunzou.R.inc(1);Movie m = MovieCreator.build("C:\\dev\\mp4parser\\schaf-schleppt-kn\u00fcppel.mp4");
        __CLR4_5_200lvlunzou.R.inc(2);Track videoTrack = null;
        __CLR4_5_200lvlunzou.R.inc(3);for (Track track : m.getTracks()) {{
            __CLR4_5_200lvlunzou.R.inc(4);if (((("vide".equals(track.getHandler()))&&(__CLR4_5_200lvlunzou.R.iget(5)!=0|true))||(__CLR4_5_200lvlunzou.R.iget(6)==0&false))) {{
                __CLR4_5_200lvlunzou.R.inc(7);videoTrack = track;
            }
        }}
        }__CLR4_5_200lvlunzou.R.inc(8);if ((((videoTrack == null)&&(__CLR4_5_200lvlunzou.R.iget(9)!=0|true))||(__CLR4_5_200lvlunzou.R.iget(10)==0&false))) {{
            __CLR4_5_200lvlunzou.R.inc(11);throw new RuntimeException("You need a video track!");
        }
        }__CLR4_5_200lvlunzou.R.inc(12);int refNumSamples = videoTrack.getSamples().size();
        __CLR4_5_200lvlunzou.R.inc(13);long[] refSampleDuration = videoTrack.getSampleDurations();
        __CLR4_5_200lvlunzou.R.inc(14);long[] syncSamples = videoTrack.getSyncSamples();
        __CLR4_5_200lvlunzou.R.inc(15);double[] syncSampleTimes = new double[0];
        __CLR4_5_200lvlunzou.R.inc(16);int refIndex = 0;
        __CLR4_5_200lvlunzou.R.inc(17);double refTime = 0;
        __CLR4_5_200lvlunzou.R.inc(18);for (long syncSample : syncSamples) {{
            __CLR4_5_200lvlunzou.R.inc(19);while ((((refIndex < syncSample - 1 && refIndex < refNumSamples)&&(__CLR4_5_200lvlunzou.R.iget(20)!=0|true))||(__CLR4_5_200lvlunzou.R.iget(21)==0&false))) {{
                __CLR4_5_200lvlunzou.R.inc(22);refTime += (double) refSampleDuration[refIndex] / videoTrack.getTrackMetaData().getTimescale();
                __CLR4_5_200lvlunzou.R.inc(23);refIndex++;
            }
            }__CLR4_5_200lvlunzou.R.inc(24);syncSampleTimes = Mp4Arrays.copyOfAndAppend(syncSampleTimes, refTime);

        }
        }__CLR4_5_200lvlunzou.R.inc(25);Map<Track, List<Track>> tracks = new HashMap<Track, List<Track>>();
        __CLR4_5_200lvlunzou.R.inc(26);for (Track track : m.getTracks()) {{
            __CLR4_5_200lvlunzou.R.inc(27);List<Track> chops = new ArrayList<Track>();

            __CLR4_5_200lvlunzou.R.inc(28);int lastStart = 0;
            __CLR4_5_200lvlunzou.R.inc(29);int index = 0;
            __CLR4_5_200lvlunzou.R.inc(30);int numSamples = track.getSamples().size();
            __CLR4_5_200lvlunzou.R.inc(31);long[] durations = track.getSampleDurations();
            __CLR4_5_200lvlunzou.R.inc(32);double time = 0;
            __CLR4_5_200lvlunzou.R.inc(33);int timeIndex = 0;

            __CLR4_5_200lvlunzou.R.inc(34);while ((((index < numSamples)&&(__CLR4_5_200lvlunzou.R.iget(35)!=0|true))||(__CLR4_5_200lvlunzou.R.iget(36)==0&false))) {{
                __CLR4_5_200lvlunzou.R.inc(37);if ((((timeIndex >= syncSampleTimes.length)&&(__CLR4_5_200lvlunzou.R.iget(38)!=0|true))||(__CLR4_5_200lvlunzou.R.iget(39)==0&false))) {{
                    __CLR4_5_200lvlunzou.R.inc(40);chops.add(new CroppedTrack(track, lastStart, numSamples));
                    __CLR4_5_200lvlunzou.R.inc(41);System.err.println("Added partial track for " + track.getTrackMetaData().getTrackId() + " from sample " + lastStart + " to " + numSamples);
                    __CLR4_5_200lvlunzou.R.inc(42);break;
                }
                }__CLR4_5_200lvlunzou.R.inc(43);if ((((time >= syncSampleTimes[timeIndex])&&(__CLR4_5_200lvlunzou.R.iget(44)!=0|true))||(__CLR4_5_200lvlunzou.R.iget(45)==0&false))) {{
                    __CLR4_5_200lvlunzou.R.inc(46);if ((((lastStart != index)&&(__CLR4_5_200lvlunzou.R.iget(47)!=0|true))||(__CLR4_5_200lvlunzou.R.iget(48)==0&false))) {{
                        __CLR4_5_200lvlunzou.R.inc(49);chops.add(new CroppedTrack(track, lastStart, index));
                        __CLR4_5_200lvlunzou.R.inc(50);System.err.println("Added partial track for " + track.getTrackMetaData().getTrackId() + " from sample " + lastStart + " to " + index);
                        __CLR4_5_200lvlunzou.R.inc(51);lastStart = index;
                    }
                    }__CLR4_5_200lvlunzou.R.inc(52);timeIndex++;
                }
                }__CLR4_5_200lvlunzou.R.inc(53);time += (double) durations[index] / track.getTrackMetaData().getTimescale();
                __CLR4_5_200lvlunzou.R.inc(54);index++;

            }
            }__CLR4_5_200lvlunzou.R.inc(55);if ((((chops.size() > 0)&&(__CLR4_5_200lvlunzou.R.iget(56)!=0|true))||(__CLR4_5_200lvlunzou.R.iget(57)==0&false))) {{
                __CLR4_5_200lvlunzou.R.inc(58);tracks.put(track, chops);
            }


        }}
        }__CLR4_5_200lvlunzou.R.inc(59);Mp4Builder b = new DefaultMp4Builder();

        __CLR4_5_200lvlunzou.R.inc(60);for (int i = 0; (((i < syncSamples.length)&&(__CLR4_5_200lvlunzou.R.iget(61)!=0|true))||(__CLR4_5_200lvlunzou.R.iget(62)==0&false)); i++) {{
            __CLR4_5_200lvlunzou.R.inc(63);Movie chopped = new Movie();

            __CLR4_5_200lvlunzou.R.inc(64);for (Track track : tracks.keySet()) {{
                __CLR4_5_200lvlunzou.R.inc(65);chopped.addTrack(tracks.get(track).get(i));
            }

            }__CLR4_5_200lvlunzou.R.inc(66);b.build(chopped).writeContainer(new FileOutputStream("out-" + i + ".mp4").getChannel());
        }

    }}finally{__CLR4_5_200lvlunzou.R.flushNeeded();}}
}
