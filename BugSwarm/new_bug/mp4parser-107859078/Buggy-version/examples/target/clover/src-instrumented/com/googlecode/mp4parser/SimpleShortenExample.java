/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.googlecode.mp4parser;

import com.coremedia.iso.boxes.Container;
import com.googlecode.mp4parser.authoring.Movie;
import com.googlecode.mp4parser.authoring.Track;
import com.googlecode.mp4parser.authoring.builder.DefaultMp4Builder;
import com.googlecode.mp4parser.authoring.container.mp4.MovieCreator;
import com.googlecode.mp4parser.authoring.tracks.AppendTrack;
import com.googlecode.mp4parser.authoring.tracks.CroppedTrack;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Shortens/Crops a track
 */
public class SimpleShortenExample {public static class __CLR4_5_2m1m1lvl9g0s5{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0030\u0037\u0038\u0035\u0039\u0030\u0037\u0038\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0065\u0078\u0061\u006d\u0070\u006c\u0065\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714413351766L,8589935092L,870,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;


    public static void main(String[] args) throws IOException {try{__CLR4_5_2m1m1lvl9g0s5.R.inc(793);
        //Movie movie = new MovieCreator().build(new RandomAccessFile("/home/sannies/suckerpunch-distantplanet_h1080p/suckerpunch-distantplanet_h1080p.mov", "r").getChannel());
        __CLR4_5_2m1m1lvl9g0s5.R.inc(794);Movie movie = MovieCreator.build("C:\\Users\\sannies\\Downloads\\GOPR1008.MP4");

        __CLR4_5_2m1m1lvl9g0s5.R.inc(795);List<Track> tracks = movie.getTracks();
        __CLR4_5_2m1m1lvl9g0s5.R.inc(796);movie.setTracks(new LinkedList<Track>());
        // remove all tracks we will create new tracks from the old

        __CLR4_5_2m1m1lvl9g0s5.R.inc(797);double startTime1 = 5;
        __CLR4_5_2m1m1lvl9g0s5.R.inc(798);double endTime1 = 8;

        __CLR4_5_2m1m1lvl9g0s5.R.inc(799);boolean timeCorrected = false;

        // Here we try to find a track that has sync samples. Since we can only start decoding
        // at such a sample we SHOULD make sure that the start of the new fragment is exactly
        // such a frame
        __CLR4_5_2m1m1lvl9g0s5.R.inc(800);for (Track track : tracks) {{
            __CLR4_5_2m1m1lvl9g0s5.R.inc(801);if ((((track.getSyncSamples() != null && track.getSyncSamples().length > 0)&&(__CLR4_5_2m1m1lvl9g0s5.R.iget(802)!=0|true))||(__CLR4_5_2m1m1lvl9g0s5.R.iget(803)==0&false))) {{
                __CLR4_5_2m1m1lvl9g0s5.R.inc(804);if ((((timeCorrected)&&(__CLR4_5_2m1m1lvl9g0s5.R.iget(805)!=0|true))||(__CLR4_5_2m1m1lvl9g0s5.R.iget(806)==0&false))) {{
                    // This exception here could be a false positive in case we have multiple tracks
                    // with sync samples at exactly the same positions. E.g. a single movie containing
                    // multiple qualities of the same video (Microsoft Smooth Streaming file)

                    __CLR4_5_2m1m1lvl9g0s5.R.inc(807);throw new RuntimeException("The startTime has already been corrected by another track with SyncSample. Not Supported.");
                }
                }__CLR4_5_2m1m1lvl9g0s5.R.inc(808);startTime1 = correctTimeToSyncSample(track, startTime1, false);
                __CLR4_5_2m1m1lvl9g0s5.R.inc(809);endTime1 = correctTimeToSyncSample(track, endTime1, true);
                __CLR4_5_2m1m1lvl9g0s5.R.inc(810);timeCorrected = true;
            }
        }}

        }__CLR4_5_2m1m1lvl9g0s5.R.inc(811);for (Track track : tracks) {{
            __CLR4_5_2m1m1lvl9g0s5.R.inc(812);long currentSample = 0;
            __CLR4_5_2m1m1lvl9g0s5.R.inc(813);double currentTime = 0;
            __CLR4_5_2m1m1lvl9g0s5.R.inc(814);double lastTime = -1;
            __CLR4_5_2m1m1lvl9g0s5.R.inc(815);long startSample1 = -1;
            __CLR4_5_2m1m1lvl9g0s5.R.inc(816);long endSample1 = -1;

            __CLR4_5_2m1m1lvl9g0s5.R.inc(817);for (int i = 0; (((i < track.getSampleDurations().length)&&(__CLR4_5_2m1m1lvl9g0s5.R.iget(818)!=0|true))||(__CLR4_5_2m1m1lvl9g0s5.R.iget(819)==0&false)); i++) {{
                __CLR4_5_2m1m1lvl9g0s5.R.inc(820);long delta = track.getSampleDurations()[i];


                __CLR4_5_2m1m1lvl9g0s5.R.inc(821);if ((((currentTime > lastTime && currentTime <= startTime1)&&(__CLR4_5_2m1m1lvl9g0s5.R.iget(822)!=0|true))||(__CLR4_5_2m1m1lvl9g0s5.R.iget(823)==0&false))) {{
                    // current sample is still before the new starttime
                    __CLR4_5_2m1m1lvl9g0s5.R.inc(824);startSample1 = currentSample;
                }
                }__CLR4_5_2m1m1lvl9g0s5.R.inc(825);if ((((currentTime > lastTime && currentTime <= endTime1)&&(__CLR4_5_2m1m1lvl9g0s5.R.iget(826)!=0|true))||(__CLR4_5_2m1m1lvl9g0s5.R.iget(827)==0&false))) {{
                    // current sample is after the new start time and still before the new endtime
                    __CLR4_5_2m1m1lvl9g0s5.R.inc(828);endSample1 = currentSample;
                }
                }__CLR4_5_2m1m1lvl9g0s5.R.inc(829);lastTime = currentTime;
                __CLR4_5_2m1m1lvl9g0s5.R.inc(830);currentTime += (double) delta / (double) track.getTrackMetaData().getTimescale();
                __CLR4_5_2m1m1lvl9g0s5.R.inc(831);currentSample++;
            }
            }__CLR4_5_2m1m1lvl9g0s5.R.inc(832);movie.addTrack(new AppendTrack(new CroppedTrack(track, startSample1, endSample1)));
        }
        }__CLR4_5_2m1m1lvl9g0s5.R.inc(833);long start1 = System.currentTimeMillis();
        __CLR4_5_2m1m1lvl9g0s5.R.inc(834);Container out = new DefaultMp4Builder().build(movie);
        __CLR4_5_2m1m1lvl9g0s5.R.inc(835);long start2 = System.currentTimeMillis();
        __CLR4_5_2m1m1lvl9g0s5.R.inc(836);FileOutputStream fos = new FileOutputStream(String.format("output-%f-%f.mp4", startTime1, endTime1));
        __CLR4_5_2m1m1lvl9g0s5.R.inc(837);FileChannel fc = fos.getChannel();
        __CLR4_5_2m1m1lvl9g0s5.R.inc(838);out.writeContainer(fc);

        __CLR4_5_2m1m1lvl9g0s5.R.inc(839);fc.close();
        __CLR4_5_2m1m1lvl9g0s5.R.inc(840);fos.close();
        __CLR4_5_2m1m1lvl9g0s5.R.inc(841);long start3 = System.currentTimeMillis();
        __CLR4_5_2m1m1lvl9g0s5.R.inc(842);System.err.println("Building IsoFile took : " + (start2 - start1) + "ms");
        __CLR4_5_2m1m1lvl9g0s5.R.inc(843);System.err.println("Writing IsoFile took  : " + (start3 - start2) + "ms");
        //System.err.println("Writing IsoFile speed : " + (new File(String.format("output-%f-%f--%f-%f.mp4", startTime1, endTime1, startTime2, endTime2)).length() / (start3 - start2) / 1000) + "MB/s");
    }finally{__CLR4_5_2m1m1lvl9g0s5.R.flushNeeded();}}


    private static double correctTimeToSyncSample(Track track, double cutHere, boolean next) {try{__CLR4_5_2m1m1lvl9g0s5.R.inc(844);
        __CLR4_5_2m1m1lvl9g0s5.R.inc(845);double[] timeOfSyncSamples = new double[track.getSyncSamples().length];
        __CLR4_5_2m1m1lvl9g0s5.R.inc(846);long currentSample = 0;
        __CLR4_5_2m1m1lvl9g0s5.R.inc(847);double currentTime = 0;
        __CLR4_5_2m1m1lvl9g0s5.R.inc(848);for (int i = 0; (((i < track.getSampleDurations().length)&&(__CLR4_5_2m1m1lvl9g0s5.R.iget(849)!=0|true))||(__CLR4_5_2m1m1lvl9g0s5.R.iget(850)==0&false)); i++) {{
            __CLR4_5_2m1m1lvl9g0s5.R.inc(851);long delta = track.getSampleDurations()[i];

            __CLR4_5_2m1m1lvl9g0s5.R.inc(852);if ((((Arrays.binarySearch(track.getSyncSamples(), currentSample + 1) >= 0)&&(__CLR4_5_2m1m1lvl9g0s5.R.iget(853)!=0|true))||(__CLR4_5_2m1m1lvl9g0s5.R.iget(854)==0&false))) {{
                // samples always start with 1 but we start with zero therefore +1
                __CLR4_5_2m1m1lvl9g0s5.R.inc(855);timeOfSyncSamples[Arrays.binarySearch(track.getSyncSamples(), currentSample + 1)] = currentTime;
            }
            }__CLR4_5_2m1m1lvl9g0s5.R.inc(856);currentTime += (double) delta / (double) track.getTrackMetaData().getTimescale();
            __CLR4_5_2m1m1lvl9g0s5.R.inc(857);currentSample++;

        }
        }__CLR4_5_2m1m1lvl9g0s5.R.inc(858);double previous = 0;
        __CLR4_5_2m1m1lvl9g0s5.R.inc(859);for (double timeOfSyncSample : timeOfSyncSamples) {{
            __CLR4_5_2m1m1lvl9g0s5.R.inc(860);if ((((timeOfSyncSample > cutHere)&&(__CLR4_5_2m1m1lvl9g0s5.R.iget(861)!=0|true))||(__CLR4_5_2m1m1lvl9g0s5.R.iget(862)==0&false))) {{
                __CLR4_5_2m1m1lvl9g0s5.R.inc(863);if ((((next)&&(__CLR4_5_2m1m1lvl9g0s5.R.iget(864)!=0|true))||(__CLR4_5_2m1m1lvl9g0s5.R.iget(865)==0&false))) {{
                    __CLR4_5_2m1m1lvl9g0s5.R.inc(866);return timeOfSyncSample;
                } }else {{
                    __CLR4_5_2m1m1lvl9g0s5.R.inc(867);return previous;
                }
            }}
            }__CLR4_5_2m1m1lvl9g0s5.R.inc(868);previous = timeOfSyncSample;
        }
        }__CLR4_5_2m1m1lvl9g0s5.R.inc(869);return timeOfSyncSamples[timeOfSyncSamples.length - 1];
    }finally{__CLR4_5_2m1m1lvl9g0s5.R.flushNeeded();}}


}
