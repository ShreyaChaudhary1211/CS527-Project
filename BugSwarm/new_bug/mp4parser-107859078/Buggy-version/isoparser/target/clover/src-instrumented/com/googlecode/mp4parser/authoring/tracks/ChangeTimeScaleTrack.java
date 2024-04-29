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
package com.googlecode.mp4parser.authoring.tracks;

import com.coremedia.iso.boxes.CompositionTimeToSample;
import com.coremedia.iso.boxes.SampleDependencyTypeBox;
import com.coremedia.iso.boxes.SampleDescriptionBox;
import com.coremedia.iso.boxes.SubSampleInformationBox;
import com.googlecode.mp4parser.authoring.Edit;
import com.googlecode.mp4parser.authoring.Sample;
import com.googlecode.mp4parser.authoring.Track;
import com.googlecode.mp4parser.authoring.TrackMetaData;
import com.googlecode.mp4parser.boxes.mp4.samplegrouping.GroupEntry;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

/**
 * Changes the timescale of a track by wrapping the track.
 */
public class ChangeTimeScaleTrack implements Track {public static class __CLR4_5_2732732lvl9ei89{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0030\u0037\u0038\u0035\u0039\u0030\u0037\u0038\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714413275835L,8589935092L,9268,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private static final Logger LOG = Logger.getLogger(ChangeTimeScaleTrack.class.getName());

    Track source;
    List<CompositionTimeToSample.Entry> ctts;
    long[] decodingTimes;
    long timeScale;

    /**
     * Changes the time scale of the source track to the target time scale and makes sure
     * that any rounding errors that may have summed are corrected exactly before the syncSamples.
     *
     * @param source          the source track
     * @param targetTimeScale the resulting time scale of this track.
     * @param syncSamples     at these sync points where rounding error are corrected.
     */
    public ChangeTimeScaleTrack(Track source, long targetTimeScale, long[] syncSamples) {try{__CLR4_5_2732732lvl9ei89.R.inc(9182);
        __CLR4_5_2732732lvl9ei89.R.inc(9183);this.source = source;
        __CLR4_5_2732732lvl9ei89.R.inc(9184);this.timeScale = targetTimeScale;
        __CLR4_5_2732732lvl9ei89.R.inc(9185);double timeScaleFactor = (double) targetTimeScale / source.getTrackMetaData().getTimescale();
        __CLR4_5_2732732lvl9ei89.R.inc(9186);ctts = adjustCtts(source.getCompositionTimeEntries(), timeScaleFactor);
        __CLR4_5_2732732lvl9ei89.R.inc(9187);decodingTimes = adjustTts(source.getSampleDurations(), timeScaleFactor, syncSamples, getTimes(source, syncSamples, targetTimeScale));
    }finally{__CLR4_5_2732732lvl9ei89.R.flushNeeded();}}

    private static long[] getTimes(Track track, long[] syncSamples, long targetTimeScale) {try{__CLR4_5_2732732lvl9ei89.R.inc(9188);
        __CLR4_5_2732732lvl9ei89.R.inc(9189);long[] syncSampleTimes = new long[syncSamples.length];

        __CLR4_5_2732732lvl9ei89.R.inc(9190);int currentSample = 1;  // first syncsample is 1
        __CLR4_5_2732732lvl9ei89.R.inc(9191);long currentDuration = 0;
        __CLR4_5_2732732lvl9ei89.R.inc(9192);int currentSyncSampleIndex = 0;


        __CLR4_5_2732732lvl9ei89.R.inc(9193);while ((((currentSample <= syncSamples[syncSamples.length - 1])&&(__CLR4_5_2732732lvl9ei89.R.iget(9194)!=0|true))||(__CLR4_5_2732732lvl9ei89.R.iget(9195)==0&false))) {{
            __CLR4_5_2732732lvl9ei89.R.inc(9196);if ((((currentSample == syncSamples[currentSyncSampleIndex])&&(__CLR4_5_2732732lvl9ei89.R.iget(9197)!=0|true))||(__CLR4_5_2732732lvl9ei89.R.iget(9198)==0&false))) {{
                __CLR4_5_2732732lvl9ei89.R.inc(9199);syncSampleTimes[currentSyncSampleIndex++] = (currentDuration * targetTimeScale) / track.getTrackMetaData().getTimescale();
            }
            }__CLR4_5_2732732lvl9ei89.R.inc(9200);currentDuration += track.getSampleDurations()[currentSample - 1];
            __CLR4_5_2732732lvl9ei89.R.inc(9201);currentSample++;
        }
        }__CLR4_5_2732732lvl9ei89.R.inc(9202);return syncSampleTimes;

    }finally{__CLR4_5_2732732lvl9ei89.R.flushNeeded();}}

    /**
     * Adjusting the composition times is easy. Just scale it by the factor - that's it. There is no rounding
     * error summing up.
     *
     * @param source
     * @param timeScaleFactor
     * @return
     */
    static List<CompositionTimeToSample.Entry> adjustCtts(List<CompositionTimeToSample.Entry> source, double timeScaleFactor) {try{__CLR4_5_2732732lvl9ei89.R.inc(9203);
        __CLR4_5_2732732lvl9ei89.R.inc(9204);if ((((source != null)&&(__CLR4_5_2732732lvl9ei89.R.iget(9205)!=0|true))||(__CLR4_5_2732732lvl9ei89.R.iget(9206)==0&false))) {{
            __CLR4_5_2732732lvl9ei89.R.inc(9207);List<CompositionTimeToSample.Entry> entries2 = new ArrayList<CompositionTimeToSample.Entry>(source.size());
            __CLR4_5_2732732lvl9ei89.R.inc(9208);for (CompositionTimeToSample.Entry entry : source) {{
                __CLR4_5_2732732lvl9ei89.R.inc(9209);entries2.add(new CompositionTimeToSample.Entry(entry.getCount(), (int) Math.round(timeScaleFactor * entry.getOffset())));
            }
            }__CLR4_5_2732732lvl9ei89.R.inc(9210);return entries2;
        } }else {{
            __CLR4_5_2732732lvl9ei89.R.inc(9211);return null;
        }
    }}finally{__CLR4_5_2732732lvl9ei89.R.flushNeeded();}}

    static long[] adjustTts(long[] sourceArray, double timeScaleFactor, long[] syncSample, long[] syncSampleTimes) {try{__CLR4_5_2732732lvl9ei89.R.inc(9212);


        __CLR4_5_2732732lvl9ei89.R.inc(9213);long summedDurations = 0;

        __CLR4_5_2732732lvl9ei89.R.inc(9214);long[] scaledArray = new long[sourceArray.length];

        __CLR4_5_2732732lvl9ei89.R.inc(9215);for (int i = 1; (((i <= sourceArray.length)&&(__CLR4_5_2732732lvl9ei89.R.iget(9216)!=0|true))||(__CLR4_5_2732732lvl9ei89.R.iget(9217)==0&false)); i++) {{
            __CLR4_5_2732732lvl9ei89.R.inc(9218);long duration = sourceArray[i - 1];

            __CLR4_5_2732732lvl9ei89.R.inc(9219);long x = Math.round(timeScaleFactor * duration);

            __CLR4_5_2732732lvl9ei89.R.inc(9220);int ssIndex;
            __CLR4_5_2732732lvl9ei89.R.inc(9221);if ((ssIndex = Arrays.binarySearch(syncSample, i + 1)) >= 0) {{
                // we are at the sample before sync point
                __CLR4_5_2732732lvl9ei89.R.inc(9224);if ((((syncSampleTimes[ssIndex] != summedDurations)&&(__CLR4_5_2732732lvl9ei89.R.iget(9225)!=0|true))||(__CLR4_5_2732732lvl9ei89.R.iget(9226)==0&false))) {{
                    __CLR4_5_2732732lvl9ei89.R.inc(9227);long correction = syncSampleTimes[ssIndex] - (summedDurations + x);
                    __CLR4_5_2732732lvl9ei89.R.inc(9228);LOG.finest(String.format("Sample %d %d / %d - correct by %d", i, summedDurations, syncSampleTimes[ssIndex], correction));
                    __CLR4_5_2732732lvl9ei89.R.inc(9229);x += correction;
                }
            }}
            }__CLR4_5_2732732lvl9ei89.R.inc(9230);summedDurations += x;
            __CLR4_5_2732732lvl9ei89.R.inc(9231);scaledArray[i - 1] = x;
        }
        }__CLR4_5_2732732lvl9ei89.R.inc(9232);return scaledArray;
    }finally{__CLR4_5_2732732lvl9ei89.R.flushNeeded();}}

    public void close() throws IOException {try{__CLR4_5_2732732lvl9ei89.R.inc(9233);
        __CLR4_5_2732732lvl9ei89.R.inc(9234);source.close();
    }finally{__CLR4_5_2732732lvl9ei89.R.flushNeeded();}}

    public SampleDescriptionBox getSampleDescriptionBox() {try{__CLR4_5_2732732lvl9ei89.R.inc(9235);
        __CLR4_5_2732732lvl9ei89.R.inc(9236);return source.getSampleDescriptionBox();
    }finally{__CLR4_5_2732732lvl9ei89.R.flushNeeded();}}

    public long[] getSampleDurations() {try{__CLR4_5_2732732lvl9ei89.R.inc(9237);
        __CLR4_5_2732732lvl9ei89.R.inc(9238);return decodingTimes;
    }finally{__CLR4_5_2732732lvl9ei89.R.flushNeeded();}}

    public List<CompositionTimeToSample.Entry> getCompositionTimeEntries() {try{__CLR4_5_2732732lvl9ei89.R.inc(9239);
        __CLR4_5_2732732lvl9ei89.R.inc(9240);return ctts;
    }finally{__CLR4_5_2732732lvl9ei89.R.flushNeeded();}}

    public long[] getSyncSamples() {try{__CLR4_5_2732732lvl9ei89.R.inc(9241);
        __CLR4_5_2732732lvl9ei89.R.inc(9242);return source.getSyncSamples();
    }finally{__CLR4_5_2732732lvl9ei89.R.flushNeeded();}}

    public List<SampleDependencyTypeBox.Entry> getSampleDependencies() {try{__CLR4_5_2732732lvl9ei89.R.inc(9243);
        __CLR4_5_2732732lvl9ei89.R.inc(9244);return source.getSampleDependencies();
    }finally{__CLR4_5_2732732lvl9ei89.R.flushNeeded();}}

    public TrackMetaData getTrackMetaData() {try{__CLR4_5_2732732lvl9ei89.R.inc(9245);
        __CLR4_5_2732732lvl9ei89.R.inc(9246);TrackMetaData trackMetaData = (TrackMetaData) source.getTrackMetaData().clone();
        __CLR4_5_2732732lvl9ei89.R.inc(9247);trackMetaData.setTimescale(timeScale);
        __CLR4_5_2732732lvl9ei89.R.inc(9248);return trackMetaData;
    }finally{__CLR4_5_2732732lvl9ei89.R.flushNeeded();}}

    public String getHandler() {try{__CLR4_5_2732732lvl9ei89.R.inc(9249);
        __CLR4_5_2732732lvl9ei89.R.inc(9250);return source.getHandler();
    }finally{__CLR4_5_2732732lvl9ei89.R.flushNeeded();}}

    public List<Sample> getSamples() {try{__CLR4_5_2732732lvl9ei89.R.inc(9251);
        __CLR4_5_2732732lvl9ei89.R.inc(9252);return source.getSamples();
    }finally{__CLR4_5_2732732lvl9ei89.R.flushNeeded();}}

    public SubSampleInformationBox getSubsampleInformationBox() {try{__CLR4_5_2732732lvl9ei89.R.inc(9253);
        __CLR4_5_2732732lvl9ei89.R.inc(9254);return source.getSubsampleInformationBox();
    }finally{__CLR4_5_2732732lvl9ei89.R.flushNeeded();}}

    public long getDuration() {try{__CLR4_5_2732732lvl9ei89.R.inc(9255);
        __CLR4_5_2732732lvl9ei89.R.inc(9256);long duration = 0;
        __CLR4_5_2732732lvl9ei89.R.inc(9257);for (long delta : decodingTimes) {{
            __CLR4_5_2732732lvl9ei89.R.inc(9258);duration += delta;
        }
        }__CLR4_5_2732732lvl9ei89.R.inc(9259);return duration;
    }finally{__CLR4_5_2732732lvl9ei89.R.flushNeeded();}}

    @Override
    public String toString() {try{__CLR4_5_2732732lvl9ei89.R.inc(9260);
        __CLR4_5_2732732lvl9ei89.R.inc(9261);return "ChangeTimeScaleTrack{" +
                "source=" + source +
                '}';
    }finally{__CLR4_5_2732732lvl9ei89.R.flushNeeded();}}

    public String getName() {try{__CLR4_5_2732732lvl9ei89.R.inc(9262);
        __CLR4_5_2732732lvl9ei89.R.inc(9263);return "timeScale(" + source.getName() + ")";
    }finally{__CLR4_5_2732732lvl9ei89.R.flushNeeded();}}

    public List<Edit> getEdits() {try{__CLR4_5_2732732lvl9ei89.R.inc(9264);
        __CLR4_5_2732732lvl9ei89.R.inc(9265);return source.getEdits();
    }finally{__CLR4_5_2732732lvl9ei89.R.flushNeeded();}}

    public Map<GroupEntry, long[]> getSampleGroups() {try{__CLR4_5_2732732lvl9ei89.R.inc(9266);
        __CLR4_5_2732732lvl9ei89.R.inc(9267);return source.getSampleGroups();
    }finally{__CLR4_5_2732732lvl9ei89.R.flushNeeded();}}
}
