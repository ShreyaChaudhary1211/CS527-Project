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
package com.googlecode.mp4parser.authoring.builder;

import com.coremedia.iso.boxes.OriginalFormatBox;
import com.coremedia.iso.boxes.SampleDescriptionBox;
import com.coremedia.iso.boxes.sampleentry.AudioSampleEntry;
import com.googlecode.mp4parser.authoring.Movie;
import com.googlecode.mp4parser.authoring.Track;
import com.googlecode.mp4parser.util.Path;

import java.util.*;
import java.util.logging.Logger;

import static com.googlecode.mp4parser.util.Math.lcm;

/**
 * This <code>FragmentIntersectionFinder</code> cuts the input movie video tracks in
 * fragments of the same length exactly before the sync samples. Audio tracks are cut
 * into pieces of similar length.
 */
public class SyncSampleIntersectFinderImpl implements Fragmenter {public static class __CLR4_5_25he5helvl9eh1v{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0030\u0037\u0038\u0035\u0039\u0030\u0037\u0038\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714413275835L,8589935092L,7296,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static Logger LOG = Logger.getLogger(SyncSampleIntersectFinderImpl.class.getName());

    private final int minFragmentDurationSeconds;
    private Movie movie;
    private Track referenceTrack;

    /**
     * Creates a <code>SyncSampleIntersectFinderImpl</code> that will not create any fragment
     * smaller than the given <code>minFragmentDurationSeconds</code>
     *
     * @param movie this movie is the reference
     * @param referenceTrack used for audio tracks to find similar boundaries of segments.
     * @param minFragmentDurationSeconds the smallest allowable duration of a fragment.
     */
    public SyncSampleIntersectFinderImpl(Movie movie, Track referenceTrack, int minFragmentDurationSeconds) {try{__CLR4_5_25he5helvl9eh1v.R.inc(7106);
        __CLR4_5_25he5helvl9eh1v.R.inc(7107);this.movie = movie;
        __CLR4_5_25he5helvl9eh1v.R.inc(7108);this.referenceTrack = referenceTrack;
        __CLR4_5_25he5helvl9eh1v.R.inc(7109);this.minFragmentDurationSeconds = minFragmentDurationSeconds;
    }finally{__CLR4_5_25he5helvl9eh1v.R.flushNeeded();}}

    static String getFormat(Track track) {try{__CLR4_5_25he5helvl9eh1v.R.inc(7110);
        __CLR4_5_25he5helvl9eh1v.R.inc(7111);SampleDescriptionBox stsd = track.getSampleDescriptionBox();
        __CLR4_5_25he5helvl9eh1v.R.inc(7112);OriginalFormatBox frma = Path.getPath(stsd, "enc./sinf/frma");
        __CLR4_5_25he5helvl9eh1v.R.inc(7113);if ((((frma!=null)&&(__CLR4_5_25he5helvl9eh1v.R.iget(7114)!=0|true))||(__CLR4_5_25he5helvl9eh1v.R.iget(7115)==0&false))) {{
            __CLR4_5_25he5helvl9eh1v.R.inc(7116);return frma.getDataFormat();
        } }else {{
            __CLR4_5_25he5helvl9eh1v.R.inc(7117);return stsd.getSampleEntry().getType();
        }
    }}finally{__CLR4_5_25he5helvl9eh1v.R.flushNeeded();}}


    /**
     * Gets an array of sample numbers that are meant to be the first sample of each
     * chunk or fragment.
     *
     * @param track concerned track
     * @return an array containing the ordinal of each fragment's first sample
     */
    public long[] sampleNumbers(Track track) {try{__CLR4_5_25he5helvl9eh1v.R.inc(7118);

        __CLR4_5_25he5helvl9eh1v.R.inc(7119);if (((("vide".equals(track.getHandler()))&&(__CLR4_5_25he5helvl9eh1v.R.iget(7120)!=0|true))||(__CLR4_5_25he5helvl9eh1v.R.iget(7121)==0&false))) {{
            __CLR4_5_25he5helvl9eh1v.R.inc(7122);if ((((track.getSyncSamples() != null && track.getSyncSamples().length > 0)&&(__CLR4_5_25he5helvl9eh1v.R.iget(7123)!=0|true))||(__CLR4_5_25he5helvl9eh1v.R.iget(7124)==0&false))) {{
                __CLR4_5_25he5helvl9eh1v.R.inc(7125);List<long[]> times = getSyncSamplesTimestamps(movie, track);
                __CLR4_5_25he5helvl9eh1v.R.inc(7126);return getCommonIndices(track.getSyncSamples(), getTimes(track, movie), track.getTrackMetaData().getTimescale(), times.toArray(new long[times.size()][]));
            } }else {{
                __CLR4_5_25he5helvl9eh1v.R.inc(7127);throw new RuntimeException("Video Tracks need sync samples. Only tracks other than video may have no sync samples.");
            }
        }} }else {__CLR4_5_25he5helvl9eh1v.R.inc(7128);if (((("soun".equals(track.getHandler()))&&(__CLR4_5_25he5helvl9eh1v.R.iget(7129)!=0|true))||(__CLR4_5_25he5helvl9eh1v.R.iget(7130)==0&false))) {{
            __CLR4_5_25he5helvl9eh1v.R.inc(7131);if ((((referenceTrack == null)&&(__CLR4_5_25he5helvl9eh1v.R.iget(7132)!=0|true))||(__CLR4_5_25he5helvl9eh1v.R.iget(7133)==0&false))) {{
                __CLR4_5_25he5helvl9eh1v.R.inc(7134);for (Track candidate : movie.getTracks()) {{
                    __CLR4_5_25he5helvl9eh1v.R.inc(7135);if ((((candidate.getSyncSamples() != null && "vide".equals(candidate.getHandler()) && candidate.getSyncSamples().length > 0)&&(__CLR4_5_25he5helvl9eh1v.R.iget(7136)!=0|true))||(__CLR4_5_25he5helvl9eh1v.R.iget(7137)==0&false))) {{
                        __CLR4_5_25he5helvl9eh1v.R.inc(7138);referenceTrack = candidate;
                    }
                }}
            }}
            }__CLR4_5_25he5helvl9eh1v.R.inc(7139);if ((((referenceTrack != null)&&(__CLR4_5_25he5helvl9eh1v.R.iget(7140)!=0|true))||(__CLR4_5_25he5helvl9eh1v.R.iget(7141)==0&false))) {{

                // Gets the reference track's fra
                __CLR4_5_25he5helvl9eh1v.R.inc(7142);long[] refSyncSamples = sampleNumbers(referenceTrack);

                __CLR4_5_25he5helvl9eh1v.R.inc(7143);int refSampleCount = referenceTrack.getSamples().size();

                __CLR4_5_25he5helvl9eh1v.R.inc(7144);long[] syncSamples = new long[refSyncSamples.length];
                __CLR4_5_25he5helvl9eh1v.R.inc(7145);long minSampleRate = 192000;
                __CLR4_5_25he5helvl9eh1v.R.inc(7146);for (Track testTrack : movie.getTracks()) {{
                    __CLR4_5_25he5helvl9eh1v.R.inc(7147);if ((((getFormat(track).equals(getFormat(testTrack)))&&(__CLR4_5_25he5helvl9eh1v.R.iget(7148)!=0|true))||(__CLR4_5_25he5helvl9eh1v.R.iget(7149)==0&false))) {{
                        __CLR4_5_25he5helvl9eh1v.R.inc(7150);AudioSampleEntry ase = (AudioSampleEntry) testTrack.getSampleDescriptionBox().getSampleEntry();
                        __CLR4_5_25he5helvl9eh1v.R.inc(7151);if ((((ase.getSampleRate() < minSampleRate)&&(__CLR4_5_25he5helvl9eh1v.R.iget(7152)!=0|true))||(__CLR4_5_25he5helvl9eh1v.R.iget(7153)==0&false))) {{
                            __CLR4_5_25he5helvl9eh1v.R.inc(7154);minSampleRate = ase.getSampleRate();
                            __CLR4_5_25he5helvl9eh1v.R.inc(7155);long sc = testTrack.getSamples().size();
                            __CLR4_5_25he5helvl9eh1v.R.inc(7156);double stretch = (double) sc / refSampleCount;

                            __CLR4_5_25he5helvl9eh1v.R.inc(7157);long samplesPerFrame = testTrack.getSampleDurations()[0]; // Assuming all audio tracks have the same number of samples per frame, which they do for all known types

                            __CLR4_5_25he5helvl9eh1v.R.inc(7158);for (int i = 0; (((i < syncSamples.length)&&(__CLR4_5_25he5helvl9eh1v.R.iget(7159)!=0|true))||(__CLR4_5_25he5helvl9eh1v.R.iget(7160)==0&false)); i++) {{
                                __CLR4_5_25he5helvl9eh1v.R.inc(7161);long start = (long) Math.ceil(stretch * (refSyncSamples[i] - 1) * samplesPerFrame);
                                __CLR4_5_25he5helvl9eh1v.R.inc(7162);syncSamples[i] = start;
                                // The Stretch makes sure that there are as much audio and video chunks!
                            }
                            }__CLR4_5_25he5helvl9eh1v.R.inc(7163);break;
                        }
                    }}
                }}
                }__CLR4_5_25he5helvl9eh1v.R.inc(7164);AudioSampleEntry ase = (AudioSampleEntry) track.getSampleDescriptionBox().getSampleEntry();

                __CLR4_5_25he5helvl9eh1v.R.inc(7165);long samplesPerFrame = track.getSampleDurations()[0]; // Assuming all audio tracks have the same number of samples per frame, which they do for all known types
                __CLR4_5_25he5helvl9eh1v.R.inc(7166);double factor = (double) ase.getSampleRate() / (double) minSampleRate;
                __CLR4_5_25he5helvl9eh1v.R.inc(7167);if ((((factor != Math.rint(factor))&&(__CLR4_5_25he5helvl9eh1v.R.iget(7168)!=0|true))||(__CLR4_5_25he5helvl9eh1v.R.iget(7169)==0&false))) {{ // Not an integer
                    __CLR4_5_25he5helvl9eh1v.R.inc(7170);throw new RuntimeException("Sample rates must be a multiple of the lowest sample rate to create a correct file!");
                }
                }__CLR4_5_25he5helvl9eh1v.R.inc(7171);for (int i = 0; (((i < syncSamples.length)&&(__CLR4_5_25he5helvl9eh1v.R.iget(7172)!=0|true))||(__CLR4_5_25he5helvl9eh1v.R.iget(7173)==0&false)); i++) {{
                    __CLR4_5_25he5helvl9eh1v.R.inc(7174);syncSamples[i] = (long) (1 + syncSamples[i] * factor / (double) samplesPerFrame);
                }
                }__CLR4_5_25he5helvl9eh1v.R.inc(7175);return syncSamples;
            }
            }__CLR4_5_25he5helvl9eh1v.R.inc(7176);throw new RuntimeException("There was absolutely no Track with sync samples. I can't work with that!");
        } }else {{
            // Ok, my track has no sync samples - let's find one with sync samples.
            __CLR4_5_25he5helvl9eh1v.R.inc(7177);for (Track candidate : movie.getTracks()) {{
                __CLR4_5_25he5helvl9eh1v.R.inc(7178);if ((((candidate.getSyncSamples() != null && candidate.getSyncSamples().length > 0)&&(__CLR4_5_25he5helvl9eh1v.R.iget(7179)!=0|true))||(__CLR4_5_25he5helvl9eh1v.R.iget(7180)==0&false))) {{
                    __CLR4_5_25he5helvl9eh1v.R.inc(7181);long[] refSyncSamples = sampleNumbers(candidate);
                    __CLR4_5_25he5helvl9eh1v.R.inc(7182);int refSampleCount = candidate.getSamples().size();

                    __CLR4_5_25he5helvl9eh1v.R.inc(7183);long[] syncSamples = new long[refSyncSamples.length];
                    __CLR4_5_25he5helvl9eh1v.R.inc(7184);long sc = track.getSamples().size();
                    __CLR4_5_25he5helvl9eh1v.R.inc(7185);double stretch = (double) sc / refSampleCount;

                    __CLR4_5_25he5helvl9eh1v.R.inc(7186);for (int i = 0; (((i < syncSamples.length)&&(__CLR4_5_25he5helvl9eh1v.R.iget(7187)!=0|true))||(__CLR4_5_25he5helvl9eh1v.R.iget(7188)==0&false)); i++) {{
                        __CLR4_5_25he5helvl9eh1v.R.inc(7189);long start = (long) Math.ceil(stretch * (refSyncSamples[i] - 1)) + 1;
                        __CLR4_5_25he5helvl9eh1v.R.inc(7190);syncSamples[i] = start;
                        // The Stretch makes sure that there are as much audio and video chunks!
                    }
                    }__CLR4_5_25he5helvl9eh1v.R.inc(7191);return syncSamples;
                }
            }}
            }__CLR4_5_25he5helvl9eh1v.R.inc(7192);throw new RuntimeException("There was absolutely no Track with sync samples. I can't work with that!");
        }


    }}}finally{__CLR4_5_25he5helvl9eh1v.R.flushNeeded();}}

    /**
     * Calculates the timestamp of all tracks' sync samples.
     *
     * @param movie <code>track</code> is located in this movie
     * @param track get this track's samples timestamps
     * @return a list of timestamps
     */
    public static List<long[]> getSyncSamplesTimestamps(Movie movie, Track track) {try{__CLR4_5_25he5helvl9eh1v.R.inc(7193);
        __CLR4_5_25he5helvl9eh1v.R.inc(7194);List<long[]> times = new LinkedList<long[]>();
        __CLR4_5_25he5helvl9eh1v.R.inc(7195);for (Track currentTrack : movie.getTracks()) {{
            __CLR4_5_25he5helvl9eh1v.R.inc(7196);if ((((currentTrack.getHandler().equals(track.getHandler()))&&(__CLR4_5_25he5helvl9eh1v.R.iget(7197)!=0|true))||(__CLR4_5_25he5helvl9eh1v.R.iget(7198)==0&false))) {{
                __CLR4_5_25he5helvl9eh1v.R.inc(7199);long[] currentTrackSyncSamples = currentTrack.getSyncSamples();
                __CLR4_5_25he5helvl9eh1v.R.inc(7200);if ((((currentTrackSyncSamples != null && currentTrackSyncSamples.length > 0)&&(__CLR4_5_25he5helvl9eh1v.R.iget(7201)!=0|true))||(__CLR4_5_25he5helvl9eh1v.R.iget(7202)==0&false))) {{
                    __CLR4_5_25he5helvl9eh1v.R.inc(7203);final long[] currentTrackTimes = getTimes(currentTrack, movie);
                    __CLR4_5_25he5helvl9eh1v.R.inc(7204);times.add(currentTrackTimes);
                }
            }}
        }}
        }__CLR4_5_25he5helvl9eh1v.R.inc(7205);return times;
    }finally{__CLR4_5_25he5helvl9eh1v.R.flushNeeded();}}

    public long[] getCommonIndices(long[] syncSamples, long[] syncSampleTimes, long timeScale, long[]... otherTracksTimes) {try{__CLR4_5_25he5helvl9eh1v.R.inc(7206);
        __CLR4_5_25he5helvl9eh1v.R.inc(7207);List<Long> nuSyncSamples = new LinkedList<Long>();
        __CLR4_5_25he5helvl9eh1v.R.inc(7208);List<Long> nuSyncSampleTimes = new LinkedList<Long>();


        __CLR4_5_25he5helvl9eh1v.R.inc(7209);for (int i = 0; (((i < syncSampleTimes.length)&&(__CLR4_5_25he5helvl9eh1v.R.iget(7210)!=0|true))||(__CLR4_5_25he5helvl9eh1v.R.iget(7211)==0&false)); i++) {{
            __CLR4_5_25he5helvl9eh1v.R.inc(7212);boolean foundInEveryRef = true;
            __CLR4_5_25he5helvl9eh1v.R.inc(7213);for (long[] times : otherTracksTimes) {{
                __CLR4_5_25he5helvl9eh1v.R.inc(7214);foundInEveryRef &= (Arrays.binarySearch(times, syncSampleTimes[i]) >= 0);
            }

            }__CLR4_5_25he5helvl9eh1v.R.inc(7215);if ((((foundInEveryRef)&&(__CLR4_5_25he5helvl9eh1v.R.iget(7216)!=0|true))||(__CLR4_5_25he5helvl9eh1v.R.iget(7217)==0&false))) {{
                // use sample only if found in every other track.
                __CLR4_5_25he5helvl9eh1v.R.inc(7218);nuSyncSamples.add(syncSamples[i]);
                __CLR4_5_25he5helvl9eh1v.R.inc(7219);nuSyncSampleTimes.add(syncSampleTimes[i]);
            }
        }}
        // We have two arrays now:
        // nuSyncSamples: Contains all common sync samples
        // nuSyncSampleTimes: Contains the times of all sync samples

        // Start: Warn user if samples are not matching!
        }__CLR4_5_25he5helvl9eh1v.R.inc(7220);if ((((nuSyncSamples.size() < (syncSamples.length * 0.25))&&(__CLR4_5_25he5helvl9eh1v.R.iget(7221)!=0|true))||(__CLR4_5_25he5helvl9eh1v.R.iget(7222)==0&false))) {{
            __CLR4_5_25he5helvl9eh1v.R.inc(7223);String log = "";
            __CLR4_5_25he5helvl9eh1v.R.inc(7224);log += String.format("%5d - Common:  [", nuSyncSamples.size());
            __CLR4_5_25he5helvl9eh1v.R.inc(7225);for (long l : nuSyncSamples) {{
                __CLR4_5_25he5helvl9eh1v.R.inc(7226);log += (String.format("%10d,", l));
            }
            }__CLR4_5_25he5helvl9eh1v.R.inc(7227);log += ("]");
            __CLR4_5_25he5helvl9eh1v.R.inc(7228);LOG.warning(log);
            __CLR4_5_25he5helvl9eh1v.R.inc(7229);log = "";

            __CLR4_5_25he5helvl9eh1v.R.inc(7230);log += String.format("%5d - In    :  [", syncSamples.length);
            __CLR4_5_25he5helvl9eh1v.R.inc(7231);for (long l : syncSamples) {{
                __CLR4_5_25he5helvl9eh1v.R.inc(7232);log += (String.format("%10d,", l));
            }
            }__CLR4_5_25he5helvl9eh1v.R.inc(7233);log += ("]");
            __CLR4_5_25he5helvl9eh1v.R.inc(7234);LOG.warning(log);
            __CLR4_5_25he5helvl9eh1v.R.inc(7235);LOG.warning("There are less than 25% of common sync samples in the given track.");
            __CLR4_5_25he5helvl9eh1v.R.inc(7236);throw new RuntimeException("There are less than 25% of common sync samples in the given track.");
        } }else {__CLR4_5_25he5helvl9eh1v.R.inc(7237);if ((((nuSyncSamples.size() < (syncSamples.length * 0.5))&&(__CLR4_5_25he5helvl9eh1v.R.iget(7238)!=0|true))||(__CLR4_5_25he5helvl9eh1v.R.iget(7239)==0&false))) {{
            __CLR4_5_25he5helvl9eh1v.R.inc(7240);LOG.fine("There are less than 50% of common sync samples in the given track. This is implausible but I'm ok to continue.");
        } }else {__CLR4_5_25he5helvl9eh1v.R.inc(7241);if ((((nuSyncSamples.size() < syncSamples.length)&&(__CLR4_5_25he5helvl9eh1v.R.iget(7242)!=0|true))||(__CLR4_5_25he5helvl9eh1v.R.iget(7243)==0&false))) {{
            __CLR4_5_25he5helvl9eh1v.R.inc(7244);LOG.finest("Common SyncSample positions vs. this tracks SyncSample positions: " + nuSyncSamples.size() + " vs. " + syncSamples.length);
        }
        // End: Warn user if samples are not matching!


        }}}__CLR4_5_25he5helvl9eh1v.R.inc(7245);List<Long> finalSampleList = new LinkedList<Long>();

        __CLR4_5_25he5helvl9eh1v.R.inc(7246);if ((((minFragmentDurationSeconds > 0)&&(__CLR4_5_25he5helvl9eh1v.R.iget(7247)!=0|true))||(__CLR4_5_25he5helvl9eh1v.R.iget(7248)==0&false))) {{
            // if minFragmentDurationSeconds is greater 0
            // we need to throw away certain samples.
            __CLR4_5_25he5helvl9eh1v.R.inc(7249);long lastSyncSampleTime = -1;
            __CLR4_5_25he5helvl9eh1v.R.inc(7250);Iterator<Long> nuSyncSamplesIterator = nuSyncSamples.iterator();
            __CLR4_5_25he5helvl9eh1v.R.inc(7251);Iterator<Long> nuSyncSampleTimesIterator = nuSyncSampleTimes.iterator();
            __CLR4_5_25he5helvl9eh1v.R.inc(7252);while ((((nuSyncSamplesIterator.hasNext() && nuSyncSampleTimesIterator.hasNext())&&(__CLR4_5_25he5helvl9eh1v.R.iget(7253)!=0|true))||(__CLR4_5_25he5helvl9eh1v.R.iget(7254)==0&false))) {{
                __CLR4_5_25he5helvl9eh1v.R.inc(7255);long curSyncSample = nuSyncSamplesIterator.next();
                __CLR4_5_25he5helvl9eh1v.R.inc(7256);long curSyncSampleTime = nuSyncSampleTimesIterator.next();
                __CLR4_5_25he5helvl9eh1v.R.inc(7257);if ((((lastSyncSampleTime == -1 || (curSyncSampleTime - lastSyncSampleTime) / timeScale >= minFragmentDurationSeconds)&&(__CLR4_5_25he5helvl9eh1v.R.iget(7258)!=0|true))||(__CLR4_5_25he5helvl9eh1v.R.iget(7259)==0&false))) {{
                    __CLR4_5_25he5helvl9eh1v.R.inc(7260);finalSampleList.add(curSyncSample);
                    __CLR4_5_25he5helvl9eh1v.R.inc(7261);lastSyncSampleTime = curSyncSampleTime;
                }
            }}
        }} }else {{
            // the list of all samples is the final list of samples
            // since minFragmentDurationSeconds ist not used.
            __CLR4_5_25he5helvl9eh1v.R.inc(7262);finalSampleList = nuSyncSamples;
        }


        // transform the list to an array
        }__CLR4_5_25he5helvl9eh1v.R.inc(7263);long[] finalSampleArray = new long[finalSampleList.size()];
        __CLR4_5_25he5helvl9eh1v.R.inc(7264);for (int i = 0; (((i < finalSampleArray.length)&&(__CLR4_5_25he5helvl9eh1v.R.iget(7265)!=0|true))||(__CLR4_5_25he5helvl9eh1v.R.iget(7266)==0&false)); i++) {{
            __CLR4_5_25he5helvl9eh1v.R.inc(7267);finalSampleArray[i] = finalSampleList.get(i);
        }
        }__CLR4_5_25he5helvl9eh1v.R.inc(7268);return finalSampleArray;

    }finally{__CLR4_5_25he5helvl9eh1v.R.flushNeeded();}}


    private static long[] getTimes(Track track, Movie m) {try{__CLR4_5_25he5helvl9eh1v.R.inc(7269);
        __CLR4_5_25he5helvl9eh1v.R.inc(7270);long[] syncSamples = track.getSyncSamples();
        __CLR4_5_25he5helvl9eh1v.R.inc(7271);long[] syncSampleTimes = new long[syncSamples.length];

        __CLR4_5_25he5helvl9eh1v.R.inc(7272);int currentSample = 1;  // first syncsample is 1
        __CLR4_5_25he5helvl9eh1v.R.inc(7273);long currentDuration = 0;
        __CLR4_5_25he5helvl9eh1v.R.inc(7274);int currentSyncSampleIndex = 0;

        __CLR4_5_25he5helvl9eh1v.R.inc(7275);final long scalingFactor = calculateTracktimesScalingFactor(m, track);

        __CLR4_5_25he5helvl9eh1v.R.inc(7276);while ((((currentSample <= syncSamples[syncSamples.length - 1])&&(__CLR4_5_25he5helvl9eh1v.R.iget(7277)!=0|true))||(__CLR4_5_25he5helvl9eh1v.R.iget(7278)==0&false))) {{
            __CLR4_5_25he5helvl9eh1v.R.inc(7279);if ((((currentSample == syncSamples[currentSyncSampleIndex])&&(__CLR4_5_25he5helvl9eh1v.R.iget(7280)!=0|true))||(__CLR4_5_25he5helvl9eh1v.R.iget(7281)==0&false))) {{
                __CLR4_5_25he5helvl9eh1v.R.inc(7282);syncSampleTimes[currentSyncSampleIndex++] = currentDuration * scalingFactor;
            }
            }__CLR4_5_25he5helvl9eh1v.R.inc(7283);currentDuration += track.getSampleDurations()[-1 + currentSample++];
        }
        }__CLR4_5_25he5helvl9eh1v.R.inc(7284);return syncSampleTimes;
    }finally{__CLR4_5_25he5helvl9eh1v.R.flushNeeded();}}

    private static long calculateTracktimesScalingFactor(Movie m, Track track) {try{__CLR4_5_25he5helvl9eh1v.R.inc(7285);
        __CLR4_5_25he5helvl9eh1v.R.inc(7286);long timeScale = 1;
        __CLR4_5_25he5helvl9eh1v.R.inc(7287);for (Track track1 : m.getTracks()) {{
            __CLR4_5_25he5helvl9eh1v.R.inc(7288);if ((((track1.getHandler().equals(track.getHandler()))&&(__CLR4_5_25he5helvl9eh1v.R.iget(7289)!=0|true))||(__CLR4_5_25he5helvl9eh1v.R.iget(7290)==0&false))) {{
                __CLR4_5_25he5helvl9eh1v.R.inc(7291);if ((((track1.getTrackMetaData().getTimescale() != track.getTrackMetaData().getTimescale())&&(__CLR4_5_25he5helvl9eh1v.R.iget(7292)!=0|true))||(__CLR4_5_25he5helvl9eh1v.R.iget(7293)==0&false))) {{
                    __CLR4_5_25he5helvl9eh1v.R.inc(7294);timeScale = lcm(timeScale, track1.getTrackMetaData().getTimescale());
                }
            }}
        }}
        }__CLR4_5_25he5helvl9eh1v.R.inc(7295);return timeScale;
    }finally{__CLR4_5_25he5helvl9eh1v.R.flushNeeded();}}

}
