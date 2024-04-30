/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.googlecode.mp4parser;

import com.coremedia.iso.boxes.Container;
import com.googlecode.mp4parser.authoring.Movie;
import com.googlecode.mp4parser.authoring.Track;
import com.googlecode.mp4parser.authoring.builder.DefaultMp4Builder;
import com.googlecode.mp4parser.authoring.container.mp4.MovieCreator;
import com.googlecode.mp4parser.authoring.tracks.AppendTrack;
import com.googlecode.mp4parser.authoring.tracks.CroppedTrack;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Shortens/Crops a track
 */
public class ShortenExample {public static class __CLR4_5_2j0j0lvluo0dj{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0033\u0033\u0030\u0033\u0036\u0038\u0036\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0065\u0078\u0061\u006d\u0070\u006c\u0065\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714448995581L,8589935092L,776,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;


    public static void main(String[] args) throws IOException {try{__CLR4_5_2j0j0lvluo0dj.R.inc(684);
        //Movie movie = new MovieCreator().build(new RandomAccessFile("/home/sannies/suckerpunch-distantplanet_h1080p/suckerpunch-distantplanet_h1080p.mov", "r").getChannel());
        __CLR4_5_2j0j0lvluo0dj.R.inc(685);Movie movie = MovieCreator.build("c:\\dev\\mp4parser\\34d91f42f4754c8ba12a5af279e10f77.mp4");

        __CLR4_5_2j0j0lvluo0dj.R.inc(686);List<Track> tracks = movie.getTracks();
        __CLR4_5_2j0j0lvluo0dj.R.inc(687);movie.setTracks(new LinkedList<Track>());
        // remove all tracks we will create new tracks from the old

        __CLR4_5_2j0j0lvluo0dj.R.inc(688);double startTime1 = 10;
        __CLR4_5_2j0j0lvluo0dj.R.inc(689);double endTime1 = 20;
        __CLR4_5_2j0j0lvluo0dj.R.inc(690);double startTime2 = 30;
        __CLR4_5_2j0j0lvluo0dj.R.inc(691);double endTime2 = 40;

        __CLR4_5_2j0j0lvluo0dj.R.inc(692);boolean timeCorrected = false;

        // Here we try to find a track that has sync samples. Since we can only start decoding
        // at such a sample we SHOULD make sure that the start of the new fragment is exactly
        // such a frame
        __CLR4_5_2j0j0lvluo0dj.R.inc(693);for (Track track : tracks) {{
            __CLR4_5_2j0j0lvluo0dj.R.inc(694);if ((((track.getSyncSamples() != null && track.getSyncSamples().length > 0)&&(__CLR4_5_2j0j0lvluo0dj.R.iget(695)!=0|true))||(__CLR4_5_2j0j0lvluo0dj.R.iget(696)==0&false))) {{
                __CLR4_5_2j0j0lvluo0dj.R.inc(697);if ((((timeCorrected)&&(__CLR4_5_2j0j0lvluo0dj.R.iget(698)!=0|true))||(__CLR4_5_2j0j0lvluo0dj.R.iget(699)==0&false))) {{
                    // This exception here could be a false positive in case we have multiple tracks
                    // with sync samples at exactly the same positions. E.g. a single movie containing
                    // multiple qualities of the same video (Microsoft Smooth Streaming file)

                    __CLR4_5_2j0j0lvluo0dj.R.inc(700);throw new RuntimeException("The startTime has already been corrected by another track with SyncSample. Not Supported.");
                }
                }__CLR4_5_2j0j0lvluo0dj.R.inc(701);startTime1 = correctTimeToSyncSample(track, startTime1, false);
                __CLR4_5_2j0j0lvluo0dj.R.inc(702);endTime1 = correctTimeToSyncSample(track, endTime1, true);
                __CLR4_5_2j0j0lvluo0dj.R.inc(703);startTime2 = correctTimeToSyncSample(track, startTime2, false);
                __CLR4_5_2j0j0lvluo0dj.R.inc(704);endTime2 = correctTimeToSyncSample(track, endTime2, true);
                __CLR4_5_2j0j0lvluo0dj.R.inc(705);timeCorrected = true;
            }
        }}

        }__CLR4_5_2j0j0lvluo0dj.R.inc(706);for (Track track : tracks) {{
            __CLR4_5_2j0j0lvluo0dj.R.inc(707);long currentSample = 0;
            __CLR4_5_2j0j0lvluo0dj.R.inc(708);double currentTime = 0;
            __CLR4_5_2j0j0lvluo0dj.R.inc(709);double lastTime = -1;
            __CLR4_5_2j0j0lvluo0dj.R.inc(710);long startSample1 = -1;
            __CLR4_5_2j0j0lvluo0dj.R.inc(711);long endSample1 = -1;
            __CLR4_5_2j0j0lvluo0dj.R.inc(712);long startSample2 = -1;
            __CLR4_5_2j0j0lvluo0dj.R.inc(713);long endSample2 = -1;

            __CLR4_5_2j0j0lvluo0dj.R.inc(714);for (int i = 0; (((i < track.getSampleDurations().length)&&(__CLR4_5_2j0j0lvluo0dj.R.iget(715)!=0|true))||(__CLR4_5_2j0j0lvluo0dj.R.iget(716)==0&false)); i++) {{
                __CLR4_5_2j0j0lvluo0dj.R.inc(717);long delta = track.getSampleDurations()[i];


                __CLR4_5_2j0j0lvluo0dj.R.inc(718);if ((((currentTime > lastTime && currentTime <= startTime1)&&(__CLR4_5_2j0j0lvluo0dj.R.iget(719)!=0|true))||(__CLR4_5_2j0j0lvluo0dj.R.iget(720)==0&false))) {{
                    // current sample is still before the new starttime
                    __CLR4_5_2j0j0lvluo0dj.R.inc(721);startSample1 = currentSample;
                }
                }__CLR4_5_2j0j0lvluo0dj.R.inc(722);if ((((currentTime > lastTime && currentTime <= endTime1)&&(__CLR4_5_2j0j0lvluo0dj.R.iget(723)!=0|true))||(__CLR4_5_2j0j0lvluo0dj.R.iget(724)==0&false))) {{
                    // current sample is after the new start time and still before the new endtime
                    __CLR4_5_2j0j0lvluo0dj.R.inc(725);endSample1 = currentSample;
                }
                }__CLR4_5_2j0j0lvluo0dj.R.inc(726);if ((((currentTime > lastTime && currentTime <= startTime2)&&(__CLR4_5_2j0j0lvluo0dj.R.iget(727)!=0|true))||(__CLR4_5_2j0j0lvluo0dj.R.iget(728)==0&false))) {{
                    // current sample is still before the new starttime
                    __CLR4_5_2j0j0lvluo0dj.R.inc(729);startSample2 = currentSample;
                }
                }__CLR4_5_2j0j0lvluo0dj.R.inc(730);if ((((currentTime > lastTime && currentTime <= endTime2)&&(__CLR4_5_2j0j0lvluo0dj.R.iget(731)!=0|true))||(__CLR4_5_2j0j0lvluo0dj.R.iget(732)==0&false))) {{
                    // current sample is after the new start time and still before the new endtime
                    __CLR4_5_2j0j0lvluo0dj.R.inc(733);endSample2 = currentSample;
                }
                }__CLR4_5_2j0j0lvluo0dj.R.inc(734);lastTime = currentTime;
                __CLR4_5_2j0j0lvluo0dj.R.inc(735);currentTime += (double) delta / (double) track.getTrackMetaData().getTimescale();
                __CLR4_5_2j0j0lvluo0dj.R.inc(736);currentSample++;
            }
            }__CLR4_5_2j0j0lvluo0dj.R.inc(737);movie.addTrack(new AppendTrack(new CroppedTrack(track, startSample1, endSample1), new CroppedTrack(track, startSample2, endSample2)));
        }
        }__CLR4_5_2j0j0lvluo0dj.R.inc(738);long start1 = System.currentTimeMillis();
        __CLR4_5_2j0j0lvluo0dj.R.inc(739);Container out = new DefaultMp4Builder().build(movie);
        __CLR4_5_2j0j0lvluo0dj.R.inc(740);long start2 = System.currentTimeMillis();
        __CLR4_5_2j0j0lvluo0dj.R.inc(741);FileOutputStream fos = new FileOutputStream(String.format("output-%f-%f--%f-%f.mp4", startTime1, endTime1, startTime2, endTime2));
        __CLR4_5_2j0j0lvluo0dj.R.inc(742);FileChannel fc = fos.getChannel();
        __CLR4_5_2j0j0lvluo0dj.R.inc(743);out.writeContainer(fc);

        __CLR4_5_2j0j0lvluo0dj.R.inc(744);fc.close();
        __CLR4_5_2j0j0lvluo0dj.R.inc(745);fos.close();
        __CLR4_5_2j0j0lvluo0dj.R.inc(746);long start3 = System.currentTimeMillis();
        __CLR4_5_2j0j0lvluo0dj.R.inc(747);System.err.println("Building IsoFile took : " + (start2 - start1) + "ms");
        __CLR4_5_2j0j0lvluo0dj.R.inc(748);System.err.println("Writing IsoFile took  : " + (start3 - start2) + "ms");
        __CLR4_5_2j0j0lvluo0dj.R.inc(749);System.err.println("Writing IsoFile speed : " + (new File(String.format("output-%f-%f--%f-%f.mp4", startTime1, endTime1, startTime2, endTime2)).length() / (start3 - start2) / 1000) + "MB/s");
    }finally{__CLR4_5_2j0j0lvluo0dj.R.flushNeeded();}}


    private static double correctTimeToSyncSample(Track track, double cutHere, boolean next) {try{__CLR4_5_2j0j0lvluo0dj.R.inc(750);
        __CLR4_5_2j0j0lvluo0dj.R.inc(751);double[] timeOfSyncSamples = new double[track.getSyncSamples().length];
        __CLR4_5_2j0j0lvluo0dj.R.inc(752);long currentSample = 0;
        __CLR4_5_2j0j0lvluo0dj.R.inc(753);double currentTime = 0;
        __CLR4_5_2j0j0lvluo0dj.R.inc(754);for (int i = 0; (((i < track.getSampleDurations().length)&&(__CLR4_5_2j0j0lvluo0dj.R.iget(755)!=0|true))||(__CLR4_5_2j0j0lvluo0dj.R.iget(756)==0&false)); i++) {{
            __CLR4_5_2j0j0lvluo0dj.R.inc(757);long delta = track.getSampleDurations()[i];

            __CLR4_5_2j0j0lvluo0dj.R.inc(758);if ((((Arrays.binarySearch(track.getSyncSamples(), currentSample + 1) >= 0)&&(__CLR4_5_2j0j0lvluo0dj.R.iget(759)!=0|true))||(__CLR4_5_2j0j0lvluo0dj.R.iget(760)==0&false))) {{
                // samples always start with 1 but we start with zero therefore +1
                __CLR4_5_2j0j0lvluo0dj.R.inc(761);timeOfSyncSamples[Arrays.binarySearch(track.getSyncSamples(), currentSample + 1)] = currentTime;
            }
            }__CLR4_5_2j0j0lvluo0dj.R.inc(762);currentTime += (double) delta / (double) track.getTrackMetaData().getTimescale();
            __CLR4_5_2j0j0lvluo0dj.R.inc(763);currentSample++;

        }
        }__CLR4_5_2j0j0lvluo0dj.R.inc(764);double previous = 0;
        __CLR4_5_2j0j0lvluo0dj.R.inc(765);for (double timeOfSyncSample : timeOfSyncSamples) {{
            __CLR4_5_2j0j0lvluo0dj.R.inc(766);if ((((timeOfSyncSample > cutHere)&&(__CLR4_5_2j0j0lvluo0dj.R.iget(767)!=0|true))||(__CLR4_5_2j0j0lvluo0dj.R.iget(768)==0&false))) {{
                __CLR4_5_2j0j0lvluo0dj.R.inc(769);if ((((next)&&(__CLR4_5_2j0j0lvluo0dj.R.iget(770)!=0|true))||(__CLR4_5_2j0j0lvluo0dj.R.iget(771)==0&false))) {{
                    __CLR4_5_2j0j0lvluo0dj.R.inc(772);return timeOfSyncSample;
                } }else {{
                    __CLR4_5_2j0j0lvluo0dj.R.inc(773);return previous;
                }
            }}
            }__CLR4_5_2j0j0lvluo0dj.R.inc(774);previous = timeOfSyncSample;
        }
        }__CLR4_5_2j0j0lvluo0dj.R.inc(775);return timeOfSyncSamples[timeOfSyncSamples.length - 1];
    }finally{__CLR4_5_2j0j0lvluo0dj.R.flushNeeded();}}


}
