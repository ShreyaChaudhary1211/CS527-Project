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

import com.googlecode.mp4parser.authoring.Track;
import com.googlecode.mp4parser.util.Mp4Arrays;

import java.util.Arrays;

/**
 * Finds start samples within a given track so that:
 * <ul>
 * <li>Each segment is at least <code>fragmentLength</code> seconds long</li>
 * <li>The last segment might be almost twice the size of the rest</li>
 * </ul>
 */
public class DefaultFragmenterImpl implements Fragmenter {public static class __CLR4_5_24or4orlvluldtm{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0033\u0033\u0030\u0033\u0036\u0038\u0036\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714448869219L,8589935092L,6102,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private double fragmentLength = 2.0D;

    public DefaultFragmenterImpl(double fragmentLength) {try{__CLR4_5_24or4orlvluldtm.R.inc(6075);
        __CLR4_5_24or4orlvluldtm.R.inc(6076);this.fragmentLength = fragmentLength;
    }finally{__CLR4_5_24or4orlvluldtm.R.flushNeeded();}}

    public long[] sampleNumbers(Track track) {try{__CLR4_5_24or4orlvluldtm.R.inc(6077);
        __CLR4_5_24or4orlvluldtm.R.inc(6078);long[] segmentStartSamples = new long[]{1L};
        __CLR4_5_24or4orlvluldtm.R.inc(6079);long[] sampleDurations = track.getSampleDurations();
        __CLR4_5_24or4orlvluldtm.R.inc(6080);long[] syncSamples = track.getSyncSamples();
        __CLR4_5_24or4orlvluldtm.R.inc(6081);long timescale = track.getTrackMetaData().getTimescale();
        __CLR4_5_24or4orlvluldtm.R.inc(6082);double time = 0.0D;

        __CLR4_5_24or4orlvluldtm.R.inc(6083);for (int i = 0; (((i < sampleDurations.length)&&(__CLR4_5_24or4orlvluldtm.R.iget(6084)!=0|true))||(__CLR4_5_24or4orlvluldtm.R.iget(6085)==0&false)); ++i) {{
            __CLR4_5_24or4orlvluldtm.R.inc(6086);time += (double) sampleDurations[i] / (double) timescale;
            __CLR4_5_24or4orlvluldtm.R.inc(6087);if ((((time >= this.fragmentLength && (syncSamples == null || Arrays.binarySearch(syncSamples, (long) (i + 1)) >= 0))&&(__CLR4_5_24or4orlvluldtm.R.iget(6088)!=0|true))||(__CLR4_5_24or4orlvluldtm.R.iget(6089)==0&false))) {{
                __CLR4_5_24or4orlvluldtm.R.inc(6090);if ((((i > 0)&&(__CLR4_5_24or4orlvluldtm.R.iget(6091)!=0|true))||(__CLR4_5_24or4orlvluldtm.R.iget(6092)==0&false))) {{
                    __CLR4_5_24or4orlvluldtm.R.inc(6093);segmentStartSamples = Mp4Arrays.copyOfAndAppend(segmentStartSamples, (long) (i + 1));
                }

                }__CLR4_5_24or4orlvluldtm.R.inc(6094);time = 0.0D;
            }
        }}
        // In case the last Fragment is shorter: make the previous one a bigger and omit the small one
        }__CLR4_5_24or4orlvluldtm.R.inc(6095);if ((((time < fragmentLength && segmentStartSamples.length > 1)&&(__CLR4_5_24or4orlvluldtm.R.iget(6096)!=0|true))||(__CLR4_5_24or4orlvluldtm.R.iget(6097)==0&false))) {{
            __CLR4_5_24or4orlvluldtm.R.inc(6098);long[] nuSegmentStartSamples = new long[segmentStartSamples.length - 1];
            __CLR4_5_24or4orlvluldtm.R.inc(6099);System.arraycopy(segmentStartSamples, 0, nuSegmentStartSamples, 0, segmentStartSamples.length - 1);
            __CLR4_5_24or4orlvluldtm.R.inc(6100);segmentStartSamples = nuSegmentStartSamples;
        }

        }__CLR4_5_24or4orlvluldtm.R.inc(6101);return segmentStartSamples;
    }finally{__CLR4_5_24or4orlvluldtm.R.flushNeeded();}}

}