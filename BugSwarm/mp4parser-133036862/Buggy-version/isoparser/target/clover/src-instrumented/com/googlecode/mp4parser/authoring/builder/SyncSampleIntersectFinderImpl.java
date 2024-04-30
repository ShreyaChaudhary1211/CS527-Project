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
public class SyncSampleIntersectFinderImpl implements Fragmenter {public static class __CLR4_5_25k15k1lvlulfqg{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0033\u0033\u0030\u0033\u0036\u0038\u0036\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714448869219L,8589935092L,7391,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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
    public SyncSampleIntersectFinderImpl(Movie movie, Track referenceTrack, int minFragmentDurationSeconds) {try{__CLR4_5_25k15k1lvlulfqg.R.inc(7201);
        __CLR4_5_25k15k1lvlulfqg.R.inc(7202);this.movie = movie;
        __CLR4_5_25k15k1lvlulfqg.R.inc(7203);this.referenceTrack = referenceTrack;
        __CLR4_5_25k15k1lvlulfqg.R.inc(7204);this.minFragmentDurationSeconds = minFragmentDurationSeconds;
    }finally{__CLR4_5_25k15k1lvlulfqg.R.flushNeeded();}}

    static String getFormat(Track track) {try{__CLR4_5_25k15k1lvlulfqg.R.inc(7205);
        __CLR4_5_25k15k1lvlulfqg.R.inc(7206);SampleDescriptionBox stsd = track.getSampleDescriptionBox();
        __CLR4_5_25k15k1lvlulfqg.R.inc(7207);OriginalFormatBox frma = Path.getPath(stsd, "enc./sinf/frma");
        __CLR4_5_25k15k1lvlulfqg.R.inc(7208);if ((((frma!=null)&&(__CLR4_5_25k15k1lvlulfqg.R.iget(7209)!=0|true))||(__CLR4_5_25k15k1lvlulfqg.R.iget(7210)==0&false))) {{
            __CLR4_5_25k15k1lvlulfqg.R.inc(7211);return frma.getDataFormat();
        } }else {{
            __CLR4_5_25k15k1lvlulfqg.R.inc(7212);return stsd.getSampleEntry().getType();
        }
    }}finally{__CLR4_5_25k15k1lvlulfqg.R.flushNeeded();}}


    /**
     * Gets an array of sample numbers that are meant to be the first sample of each
     * chunk or fragment.
     *
     * @param track concerned track
     * @return an array containing the ordinal of each fragment's first sample
     */
    public long[] sampleNumbers(Track track) {try{__CLR4_5_25k15k1lvlulfqg.R.inc(7213);

        __CLR4_5_25k15k1lvlulfqg.R.inc(7214);if (((("vide".equals(track.getHandler()))&&(__CLR4_5_25k15k1lvlulfqg.R.iget(7215)!=0|true))||(__CLR4_5_25k15k1lvlulfqg.R.iget(7216)==0&false))) {{
            __CLR4_5_25k15k1lvlulfqg.R.inc(7217);if ((((track.getSyncSamples() != null && track.getSyncSamples().length > 0)&&(__CLR4_5_25k15k1lvlulfqg.R.iget(7218)!=0|true))||(__CLR4_5_25k15k1lvlulfqg.R.iget(7219)==0&false))) {{
                __CLR4_5_25k15k1lvlulfqg.R.inc(7220);List<long[]> times = getSyncSamplesTimestamps(movie, track);
                __CLR4_5_25k15k1lvlulfqg.R.inc(7221);return getCommonIndices(track.getSyncSamples(), getTimes(track, movie), track.getTrackMetaData().getTimescale(), times.toArray(new long[times.size()][]));
            } }else {{
                __CLR4_5_25k15k1lvlulfqg.R.inc(7222);throw new RuntimeException("Video Tracks need sync samples. Only tracks other than video may have no sync samples.");
            }
        }} }else {__CLR4_5_25k15k1lvlulfqg.R.inc(7223);if (((("soun".equals(track.getHandler()))&&(__CLR4_5_25k15k1lvlulfqg.R.iget(7224)!=0|true))||(__CLR4_5_25k15k1lvlulfqg.R.iget(7225)==0&false))) {{
            __CLR4_5_25k15k1lvlulfqg.R.inc(7226);if ((((referenceTrack == null)&&(__CLR4_5_25k15k1lvlulfqg.R.iget(7227)!=0|true))||(__CLR4_5_25k15k1lvlulfqg.R.iget(7228)==0&false))) {{
                __CLR4_5_25k15k1lvlulfqg.R.inc(7229);for (Track candidate : movie.getTracks()) {{
                    __CLR4_5_25k15k1lvlulfqg.R.inc(7230);if ((((candidate.getSyncSamples() != null && "vide".equals(candidate.getHandler()) && candidate.getSyncSamples().length > 0)&&(__CLR4_5_25k15k1lvlulfqg.R.iget(7231)!=0|true))||(__CLR4_5_25k15k1lvlulfqg.R.iget(7232)==0&false))) {{
                        __CLR4_5_25k15k1lvlulfqg.R.inc(7233);referenceTrack = candidate;
                    }
                }}
            }}
            }__CLR4_5_25k15k1lvlulfqg.R.inc(7234);if ((((referenceTrack != null)&&(__CLR4_5_25k15k1lvlulfqg.R.iget(7235)!=0|true))||(__CLR4_5_25k15k1lvlulfqg.R.iget(7236)==0&false))) {{

                // Gets the reference track's fra
                __CLR4_5_25k15k1lvlulfqg.R.inc(7237);long[] refSyncSamples = sampleNumbers(referenceTrack);

                __CLR4_5_25k15k1lvlulfqg.R.inc(7238);int refSampleCount = referenceTrack.getSamples().size();

                __CLR4_5_25k15k1lvlulfqg.R.inc(7239);long[] syncSamples = new long[refSyncSamples.length];
                __CLR4_5_25k15k1lvlulfqg.R.inc(7240);long minSampleRate = 192000;
                __CLR4_5_25k15k1lvlulfqg.R.inc(7241);for (Track testTrack : movie.getTracks()) {{
                    __CLR4_5_25k15k1lvlulfqg.R.inc(7242);if ((((getFormat(track).equals(getFormat(testTrack)))&&(__CLR4_5_25k15k1lvlulfqg.R.iget(7243)!=0|true))||(__CLR4_5_25k15k1lvlulfqg.R.iget(7244)==0&false))) {{
                        __CLR4_5_25k15k1lvlulfqg.R.inc(7245);AudioSampleEntry ase = (AudioSampleEntry) testTrack.getSampleDescriptionBox().getSampleEntry();
                        __CLR4_5_25k15k1lvlulfqg.R.inc(7246);if ((((ase.getSampleRate() < minSampleRate)&&(__CLR4_5_25k15k1lvlulfqg.R.iget(7247)!=0|true))||(__CLR4_5_25k15k1lvlulfqg.R.iget(7248)==0&false))) {{
                            __CLR4_5_25k15k1lvlulfqg.R.inc(7249);minSampleRate = ase.getSampleRate();
                            __CLR4_5_25k15k1lvlulfqg.R.inc(7250);long sc = testTrack.getSamples().size();
                            __CLR4_5_25k15k1lvlulfqg.R.inc(7251);double stretch = (double) sc / refSampleCount;

                            __CLR4_5_25k15k1lvlulfqg.R.inc(7252);long samplesPerFrame = testTrack.getSampleDurations()[0]; // Assuming all audio tracks have the same number of samples per frame, which they do for all known types

                            __CLR4_5_25k15k1lvlulfqg.R.inc(7253);for (int i = 0; (((i < syncSamples.length)&&(__CLR4_5_25k15k1lvlulfqg.R.iget(7254)!=0|true))||(__CLR4_5_25k15k1lvlulfqg.R.iget(7255)==0&false)); i++) {{
                                __CLR4_5_25k15k1lvlulfqg.R.inc(7256);long start = (long) Math.ceil(stretch * (refSyncSamples[i] - 1) * samplesPerFrame);
                                __CLR4_5_25k15k1lvlulfqg.R.inc(7257);syncSamples[i] = start;
                                // The Stretch makes sure that there are as much audio and video chunks!
                            }
                            }__CLR4_5_25k15k1lvlulfqg.R.inc(7258);break;
                        }
                    }}
                }}
                }__CLR4_5_25k15k1lvlulfqg.R.inc(7259);AudioSampleEntry ase = (AudioSampleEntry) track.getSampleDescriptionBox().getSampleEntry();

                __CLR4_5_25k15k1lvlulfqg.R.inc(7260);long samplesPerFrame = track.getSampleDurations()[0]; // Assuming all audio tracks have the same number of samples per frame, which they do for all known types
                __CLR4_5_25k15k1lvlulfqg.R.inc(7261);double factor = (double) ase.getSampleRate() / (double) minSampleRate;
                __CLR4_5_25k15k1lvlulfqg.R.inc(7262);if ((((factor != Math.rint(factor))&&(__CLR4_5_25k15k1lvlulfqg.R.iget(7263)!=0|true))||(__CLR4_5_25k15k1lvlulfqg.R.iget(7264)==0&false))) {{ // Not an integer
                    __CLR4_5_25k15k1lvlulfqg.R.inc(7265);throw new RuntimeException("Sample rates must be a multiple of the lowest sample rate to create a correct file!");
                }
                }__CLR4_5_25k15k1lvlulfqg.R.inc(7266);for (int i = 0; (((i < syncSamples.length)&&(__CLR4_5_25k15k1lvlulfqg.R.iget(7267)!=0|true))||(__CLR4_5_25k15k1lvlulfqg.R.iget(7268)==0&false)); i++) {{
                    __CLR4_5_25k15k1lvlulfqg.R.inc(7269);syncSamples[i] = (long) (1 + syncSamples[i] * factor / (double) samplesPerFrame);
                }
                }__CLR4_5_25k15k1lvlulfqg.R.inc(7270);return syncSamples;
            }
            }__CLR4_5_25k15k1lvlulfqg.R.inc(7271);throw new RuntimeException("There was absolutely no Track with sync samples. I can't work with that!");
        } }else {{
            // Ok, my track has no sync samples - let's find one with sync samples.
            __CLR4_5_25k15k1lvlulfqg.R.inc(7272);for (Track candidate : movie.getTracks()) {{
                __CLR4_5_25k15k1lvlulfqg.R.inc(7273);if ((((candidate.getSyncSamples() != null && candidate.getSyncSamples().length > 0)&&(__CLR4_5_25k15k1lvlulfqg.R.iget(7274)!=0|true))||(__CLR4_5_25k15k1lvlulfqg.R.iget(7275)==0&false))) {{
                    __CLR4_5_25k15k1lvlulfqg.R.inc(7276);long[] refSyncSamples = sampleNumbers(candidate);
                    __CLR4_5_25k15k1lvlulfqg.R.inc(7277);int refSampleCount = candidate.getSamples().size();

                    __CLR4_5_25k15k1lvlulfqg.R.inc(7278);long[] syncSamples = new long[refSyncSamples.length];
                    __CLR4_5_25k15k1lvlulfqg.R.inc(7279);long sc = track.getSamples().size();
                    __CLR4_5_25k15k1lvlulfqg.R.inc(7280);double stretch = (double) sc / refSampleCount;

                    __CLR4_5_25k15k1lvlulfqg.R.inc(7281);for (int i = 0; (((i < syncSamples.length)&&(__CLR4_5_25k15k1lvlulfqg.R.iget(7282)!=0|true))||(__CLR4_5_25k15k1lvlulfqg.R.iget(7283)==0&false)); i++) {{
                        __CLR4_5_25k15k1lvlulfqg.R.inc(7284);long start = (long) Math.ceil(stretch * (refSyncSamples[i] - 1)) + 1;
                        __CLR4_5_25k15k1lvlulfqg.R.inc(7285);syncSamples[i] = start;
                        // The Stretch makes sure that there are as much audio and video chunks!
                    }
                    }__CLR4_5_25k15k1lvlulfqg.R.inc(7286);return syncSamples;
                }
            }}
            }__CLR4_5_25k15k1lvlulfqg.R.inc(7287);throw new RuntimeException("There was absolutely no Track with sync samples. I can't work with that!");
        }


    }}}finally{__CLR4_5_25k15k1lvlulfqg.R.flushNeeded();}}

    /**
     * Calculates the timestamp of all tracks' sync samples.
     *
     * @param movie <code>track</code> is located in this movie
     * @param track get this track's samples timestamps
     * @return a list of timestamps
     */
    public static List<long[]> getSyncSamplesTimestamps(Movie movie, Track track) {try{__CLR4_5_25k15k1lvlulfqg.R.inc(7288);
        __CLR4_5_25k15k1lvlulfqg.R.inc(7289);List<long[]> times = new LinkedList<long[]>();
        __CLR4_5_25k15k1lvlulfqg.R.inc(7290);for (Track currentTrack : movie.getTracks()) {{
            __CLR4_5_25k15k1lvlulfqg.R.inc(7291);if ((((currentTrack.getHandler().equals(track.getHandler()))&&(__CLR4_5_25k15k1lvlulfqg.R.iget(7292)!=0|true))||(__CLR4_5_25k15k1lvlulfqg.R.iget(7293)==0&false))) {{
                __CLR4_5_25k15k1lvlulfqg.R.inc(7294);long[] currentTrackSyncSamples = currentTrack.getSyncSamples();
                __CLR4_5_25k15k1lvlulfqg.R.inc(7295);if ((((currentTrackSyncSamples != null && currentTrackSyncSamples.length > 0)&&(__CLR4_5_25k15k1lvlulfqg.R.iget(7296)!=0|true))||(__CLR4_5_25k15k1lvlulfqg.R.iget(7297)==0&false))) {{
                    __CLR4_5_25k15k1lvlulfqg.R.inc(7298);final long[] currentTrackTimes = getTimes(currentTrack, movie);
                    __CLR4_5_25k15k1lvlulfqg.R.inc(7299);times.add(currentTrackTimes);
                }
            }}
        }}
        }__CLR4_5_25k15k1lvlulfqg.R.inc(7300);return times;
    }finally{__CLR4_5_25k15k1lvlulfqg.R.flushNeeded();}}

    public long[] getCommonIndices(long[] syncSamples, long[] syncSampleTimes, long timeScale, long[]... otherTracksTimes) {try{__CLR4_5_25k15k1lvlulfqg.R.inc(7301);
        __CLR4_5_25k15k1lvlulfqg.R.inc(7302);List<Long> nuSyncSamples = new LinkedList<Long>();
        __CLR4_5_25k15k1lvlulfqg.R.inc(7303);List<Long> nuSyncSampleTimes = new LinkedList<Long>();


        __CLR4_5_25k15k1lvlulfqg.R.inc(7304);for (int i = 0; (((i < syncSampleTimes.length)&&(__CLR4_5_25k15k1lvlulfqg.R.iget(7305)!=0|true))||(__CLR4_5_25k15k1lvlulfqg.R.iget(7306)==0&false)); i++) {{
            __CLR4_5_25k15k1lvlulfqg.R.inc(7307);boolean foundInEveryRef = true;
            __CLR4_5_25k15k1lvlulfqg.R.inc(7308);for (long[] times : otherTracksTimes) {{
                __CLR4_5_25k15k1lvlulfqg.R.inc(7309);foundInEveryRef &= (Arrays.binarySearch(times, syncSampleTimes[i]) >= 0);
            }

            }__CLR4_5_25k15k1lvlulfqg.R.inc(7310);if ((((foundInEveryRef)&&(__CLR4_5_25k15k1lvlulfqg.R.iget(7311)!=0|true))||(__CLR4_5_25k15k1lvlulfqg.R.iget(7312)==0&false))) {{
                // use sample only if found in every other track.
                __CLR4_5_25k15k1lvlulfqg.R.inc(7313);nuSyncSamples.add(syncSamples[i]);
                __CLR4_5_25k15k1lvlulfqg.R.inc(7314);nuSyncSampleTimes.add(syncSampleTimes[i]);
            }
        }}
        // We have two arrays now:
        // nuSyncSamples: Contains all common sync samples
        // nuSyncSampleTimes: Contains the times of all sync samples

        // Start: Warn user if samples are not matching!
        }__CLR4_5_25k15k1lvlulfqg.R.inc(7315);if ((((nuSyncSamples.size() < (syncSamples.length * 0.25))&&(__CLR4_5_25k15k1lvlulfqg.R.iget(7316)!=0|true))||(__CLR4_5_25k15k1lvlulfqg.R.iget(7317)==0&false))) {{
            __CLR4_5_25k15k1lvlulfqg.R.inc(7318);String log = "";
            __CLR4_5_25k15k1lvlulfqg.R.inc(7319);log += String.format("%5d - Common:  [", nuSyncSamples.size());
            __CLR4_5_25k15k1lvlulfqg.R.inc(7320);for (long l : nuSyncSamples) {{
                __CLR4_5_25k15k1lvlulfqg.R.inc(7321);log += (String.format("%10d,", l));
            }
            }__CLR4_5_25k15k1lvlulfqg.R.inc(7322);log += ("]");
            __CLR4_5_25k15k1lvlulfqg.R.inc(7323);LOG.warning(log);
            __CLR4_5_25k15k1lvlulfqg.R.inc(7324);log = "";

            __CLR4_5_25k15k1lvlulfqg.R.inc(7325);log += String.format("%5d - In    :  [", syncSamples.length);
            __CLR4_5_25k15k1lvlulfqg.R.inc(7326);for (long l : syncSamples) {{
                __CLR4_5_25k15k1lvlulfqg.R.inc(7327);log += (String.format("%10d,", l));
            }
            }__CLR4_5_25k15k1lvlulfqg.R.inc(7328);log += ("]");
            __CLR4_5_25k15k1lvlulfqg.R.inc(7329);LOG.warning(log);
            __CLR4_5_25k15k1lvlulfqg.R.inc(7330);LOG.warning("There are less than 25% of common sync samples in the given track.");
            __CLR4_5_25k15k1lvlulfqg.R.inc(7331);throw new RuntimeException("There are less than 25% of common sync samples in the given track.");
        } }else {__CLR4_5_25k15k1lvlulfqg.R.inc(7332);if ((((nuSyncSamples.size() < (syncSamples.length * 0.5))&&(__CLR4_5_25k15k1lvlulfqg.R.iget(7333)!=0|true))||(__CLR4_5_25k15k1lvlulfqg.R.iget(7334)==0&false))) {{
            __CLR4_5_25k15k1lvlulfqg.R.inc(7335);LOG.fine("There are less than 50% of common sync samples in the given track. This is implausible but I'm ok to continue.");
        } }else {__CLR4_5_25k15k1lvlulfqg.R.inc(7336);if ((((nuSyncSamples.size() < syncSamples.length)&&(__CLR4_5_25k15k1lvlulfqg.R.iget(7337)!=0|true))||(__CLR4_5_25k15k1lvlulfqg.R.iget(7338)==0&false))) {{
            __CLR4_5_25k15k1lvlulfqg.R.inc(7339);LOG.finest("Common SyncSample positions vs. this tracks SyncSample positions: " + nuSyncSamples.size() + " vs. " + syncSamples.length);
        }
        // End: Warn user if samples are not matching!


        }}}__CLR4_5_25k15k1lvlulfqg.R.inc(7340);List<Long> finalSampleList = new LinkedList<Long>();

        __CLR4_5_25k15k1lvlulfqg.R.inc(7341);if ((((minFragmentDurationSeconds > 0)&&(__CLR4_5_25k15k1lvlulfqg.R.iget(7342)!=0|true))||(__CLR4_5_25k15k1lvlulfqg.R.iget(7343)==0&false))) {{
            // if minFragmentDurationSeconds is greater 0
            // we need to throw away certain samples.
            __CLR4_5_25k15k1lvlulfqg.R.inc(7344);long lastSyncSampleTime = -1;
            __CLR4_5_25k15k1lvlulfqg.R.inc(7345);Iterator<Long> nuSyncSamplesIterator = nuSyncSamples.iterator();
            __CLR4_5_25k15k1lvlulfqg.R.inc(7346);Iterator<Long> nuSyncSampleTimesIterator = nuSyncSampleTimes.iterator();
            __CLR4_5_25k15k1lvlulfqg.R.inc(7347);while ((((nuSyncSamplesIterator.hasNext() && nuSyncSampleTimesIterator.hasNext())&&(__CLR4_5_25k15k1lvlulfqg.R.iget(7348)!=0|true))||(__CLR4_5_25k15k1lvlulfqg.R.iget(7349)==0&false))) {{
                __CLR4_5_25k15k1lvlulfqg.R.inc(7350);long curSyncSample = nuSyncSamplesIterator.next();
                __CLR4_5_25k15k1lvlulfqg.R.inc(7351);long curSyncSampleTime = nuSyncSampleTimesIterator.next();
                __CLR4_5_25k15k1lvlulfqg.R.inc(7352);if ((((lastSyncSampleTime == -1 || (curSyncSampleTime - lastSyncSampleTime) / timeScale >= minFragmentDurationSeconds)&&(__CLR4_5_25k15k1lvlulfqg.R.iget(7353)!=0|true))||(__CLR4_5_25k15k1lvlulfqg.R.iget(7354)==0&false))) {{
                    __CLR4_5_25k15k1lvlulfqg.R.inc(7355);finalSampleList.add(curSyncSample);
                    __CLR4_5_25k15k1lvlulfqg.R.inc(7356);lastSyncSampleTime = curSyncSampleTime;
                }
            }}
        }} }else {{
            // the list of all samples is the final list of samples
            // since minFragmentDurationSeconds ist not used.
            __CLR4_5_25k15k1lvlulfqg.R.inc(7357);finalSampleList = nuSyncSamples;
        }


        // transform the list to an array
        }__CLR4_5_25k15k1lvlulfqg.R.inc(7358);long[] finalSampleArray = new long[finalSampleList.size()];
        __CLR4_5_25k15k1lvlulfqg.R.inc(7359);for (int i = 0; (((i < finalSampleArray.length)&&(__CLR4_5_25k15k1lvlulfqg.R.iget(7360)!=0|true))||(__CLR4_5_25k15k1lvlulfqg.R.iget(7361)==0&false)); i++) {{
            __CLR4_5_25k15k1lvlulfqg.R.inc(7362);finalSampleArray[i] = finalSampleList.get(i);
        }
        }__CLR4_5_25k15k1lvlulfqg.R.inc(7363);return finalSampleArray;

    }finally{__CLR4_5_25k15k1lvlulfqg.R.flushNeeded();}}


    private static long[] getTimes(Track track, Movie m) {try{__CLR4_5_25k15k1lvlulfqg.R.inc(7364);
        __CLR4_5_25k15k1lvlulfqg.R.inc(7365);long[] syncSamples = track.getSyncSamples();
        __CLR4_5_25k15k1lvlulfqg.R.inc(7366);long[] syncSampleTimes = new long[syncSamples.length];

        __CLR4_5_25k15k1lvlulfqg.R.inc(7367);int currentSample = 1;  // first syncsample is 1
        __CLR4_5_25k15k1lvlulfqg.R.inc(7368);long currentDuration = 0;
        __CLR4_5_25k15k1lvlulfqg.R.inc(7369);int currentSyncSampleIndex = 0;

        __CLR4_5_25k15k1lvlulfqg.R.inc(7370);final long scalingFactor = calculateTracktimesScalingFactor(m, track);

        __CLR4_5_25k15k1lvlulfqg.R.inc(7371);while ((((currentSample <= syncSamples[syncSamples.length - 1])&&(__CLR4_5_25k15k1lvlulfqg.R.iget(7372)!=0|true))||(__CLR4_5_25k15k1lvlulfqg.R.iget(7373)==0&false))) {{
            __CLR4_5_25k15k1lvlulfqg.R.inc(7374);if ((((currentSample == syncSamples[currentSyncSampleIndex])&&(__CLR4_5_25k15k1lvlulfqg.R.iget(7375)!=0|true))||(__CLR4_5_25k15k1lvlulfqg.R.iget(7376)==0&false))) {{
                __CLR4_5_25k15k1lvlulfqg.R.inc(7377);syncSampleTimes[currentSyncSampleIndex++] = currentDuration * scalingFactor;
            }
            }__CLR4_5_25k15k1lvlulfqg.R.inc(7378);currentDuration += track.getSampleDurations()[-1 + currentSample++];
        }
        }__CLR4_5_25k15k1lvlulfqg.R.inc(7379);return syncSampleTimes;
    }finally{__CLR4_5_25k15k1lvlulfqg.R.flushNeeded();}}

    private static long calculateTracktimesScalingFactor(Movie m, Track track) {try{__CLR4_5_25k15k1lvlulfqg.R.inc(7380);
        __CLR4_5_25k15k1lvlulfqg.R.inc(7381);long timeScale = 1;
        __CLR4_5_25k15k1lvlulfqg.R.inc(7382);for (Track track1 : m.getTracks()) {{
            __CLR4_5_25k15k1lvlulfqg.R.inc(7383);if ((((track1.getHandler().equals(track.getHandler()))&&(__CLR4_5_25k15k1lvlulfqg.R.iget(7384)!=0|true))||(__CLR4_5_25k15k1lvlulfqg.R.iget(7385)==0&false))) {{
                __CLR4_5_25k15k1lvlulfqg.R.inc(7386);if ((((track1.getTrackMetaData().getTimescale() != track.getTrackMetaData().getTimescale())&&(__CLR4_5_25k15k1lvlulfqg.R.iget(7387)!=0|true))||(__CLR4_5_25k15k1lvlulfqg.R.iget(7388)==0&false))) {{
                    __CLR4_5_25k15k1lvlulfqg.R.inc(7389);timeScale = lcm(timeScale, track1.getTrackMetaData().getTimescale());
                }
            }}
        }}
        }__CLR4_5_25k15k1lvlulfqg.R.inc(7390);return timeScale;
    }finally{__CLR4_5_25k15k1lvlulfqg.R.flushNeeded();}}

}
