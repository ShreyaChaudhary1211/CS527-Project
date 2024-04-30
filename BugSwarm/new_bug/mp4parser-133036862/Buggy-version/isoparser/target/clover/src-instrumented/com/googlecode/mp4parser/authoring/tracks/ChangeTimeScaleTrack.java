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
public class ChangeTimeScaleTrack implements Track {public static class __CLR4_5_275p75plvlulhpg{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0033\u0033\u0030\u0033\u0036\u0038\u0036\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714448869219L,8589935092L,9363,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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
    public ChangeTimeScaleTrack(Track source, long targetTimeScale, long[] syncSamples) {try{__CLR4_5_275p75plvlulhpg.R.inc(9277);
        __CLR4_5_275p75plvlulhpg.R.inc(9278);this.source = source;
        __CLR4_5_275p75plvlulhpg.R.inc(9279);this.timeScale = targetTimeScale;
        __CLR4_5_275p75plvlulhpg.R.inc(9280);double timeScaleFactor = (double) targetTimeScale / source.getTrackMetaData().getTimescale();
        __CLR4_5_275p75plvlulhpg.R.inc(9281);ctts = adjustCtts(source.getCompositionTimeEntries(), timeScaleFactor);
        __CLR4_5_275p75plvlulhpg.R.inc(9282);decodingTimes = adjustTts(source.getSampleDurations(), timeScaleFactor, syncSamples, getTimes(source, syncSamples, targetTimeScale));
    }finally{__CLR4_5_275p75plvlulhpg.R.flushNeeded();}}

    private static long[] getTimes(Track track, long[] syncSamples, long targetTimeScale) {try{__CLR4_5_275p75plvlulhpg.R.inc(9283);
        __CLR4_5_275p75plvlulhpg.R.inc(9284);long[] syncSampleTimes = new long[syncSamples.length];

        __CLR4_5_275p75plvlulhpg.R.inc(9285);int currentSample = 1;  // first syncsample is 1
        __CLR4_5_275p75plvlulhpg.R.inc(9286);long currentDuration = 0;
        __CLR4_5_275p75plvlulhpg.R.inc(9287);int currentSyncSampleIndex = 0;


        __CLR4_5_275p75plvlulhpg.R.inc(9288);while ((((currentSample <= syncSamples[syncSamples.length - 1])&&(__CLR4_5_275p75plvlulhpg.R.iget(9289)!=0|true))||(__CLR4_5_275p75plvlulhpg.R.iget(9290)==0&false))) {{
            __CLR4_5_275p75plvlulhpg.R.inc(9291);if ((((currentSample == syncSamples[currentSyncSampleIndex])&&(__CLR4_5_275p75plvlulhpg.R.iget(9292)!=0|true))||(__CLR4_5_275p75plvlulhpg.R.iget(9293)==0&false))) {{
                __CLR4_5_275p75plvlulhpg.R.inc(9294);syncSampleTimes[currentSyncSampleIndex++] = (currentDuration * targetTimeScale) / track.getTrackMetaData().getTimescale();
            }
            }__CLR4_5_275p75plvlulhpg.R.inc(9295);currentDuration += track.getSampleDurations()[currentSample - 1];
            __CLR4_5_275p75plvlulhpg.R.inc(9296);currentSample++;
        }
        }__CLR4_5_275p75plvlulhpg.R.inc(9297);return syncSampleTimes;

    }finally{__CLR4_5_275p75plvlulhpg.R.flushNeeded();}}

    /**
     * Adjusting the composition times is easy. Just scale it by the factor - that's it. There is no rounding
     * error summing up.
     *
     * @param source
     * @param timeScaleFactor
     * @return
     */
    static List<CompositionTimeToSample.Entry> adjustCtts(List<CompositionTimeToSample.Entry> source, double timeScaleFactor) {try{__CLR4_5_275p75plvlulhpg.R.inc(9298);
        __CLR4_5_275p75plvlulhpg.R.inc(9299);if ((((source != null)&&(__CLR4_5_275p75plvlulhpg.R.iget(9300)!=0|true))||(__CLR4_5_275p75plvlulhpg.R.iget(9301)==0&false))) {{
            __CLR4_5_275p75plvlulhpg.R.inc(9302);List<CompositionTimeToSample.Entry> entries2 = new ArrayList<CompositionTimeToSample.Entry>(source.size());
            __CLR4_5_275p75plvlulhpg.R.inc(9303);for (CompositionTimeToSample.Entry entry : source) {{
                __CLR4_5_275p75plvlulhpg.R.inc(9304);entries2.add(new CompositionTimeToSample.Entry(entry.getCount(), (int) Math.round(timeScaleFactor * entry.getOffset())));
            }
            }__CLR4_5_275p75plvlulhpg.R.inc(9305);return entries2;
        } }else {{
            __CLR4_5_275p75plvlulhpg.R.inc(9306);return null;
        }
    }}finally{__CLR4_5_275p75plvlulhpg.R.flushNeeded();}}

    static long[] adjustTts(long[] sourceArray, double timeScaleFactor, long[] syncSample, long[] syncSampleTimes) {try{__CLR4_5_275p75plvlulhpg.R.inc(9307);


        __CLR4_5_275p75plvlulhpg.R.inc(9308);long summedDurations = 0;

        __CLR4_5_275p75plvlulhpg.R.inc(9309);long[] scaledArray = new long[sourceArray.length];

        __CLR4_5_275p75plvlulhpg.R.inc(9310);for (int i = 1; (((i <= sourceArray.length)&&(__CLR4_5_275p75plvlulhpg.R.iget(9311)!=0|true))||(__CLR4_5_275p75plvlulhpg.R.iget(9312)==0&false)); i++) {{
            __CLR4_5_275p75plvlulhpg.R.inc(9313);long duration = sourceArray[i - 1];

            __CLR4_5_275p75plvlulhpg.R.inc(9314);long x = Math.round(timeScaleFactor * duration);

            __CLR4_5_275p75plvlulhpg.R.inc(9315);int ssIndex;
            __CLR4_5_275p75plvlulhpg.R.inc(9316);if ((ssIndex = Arrays.binarySearch(syncSample, i + 1)) >= 0) {{
                // we are at the sample before sync point
                __CLR4_5_275p75plvlulhpg.R.inc(9319);if ((((syncSampleTimes[ssIndex] != summedDurations)&&(__CLR4_5_275p75plvlulhpg.R.iget(9320)!=0|true))||(__CLR4_5_275p75plvlulhpg.R.iget(9321)==0&false))) {{
                    __CLR4_5_275p75plvlulhpg.R.inc(9322);long correction = syncSampleTimes[ssIndex] - (summedDurations + x);
                    __CLR4_5_275p75plvlulhpg.R.inc(9323);LOG.finest(String.format("Sample %d %d / %d - correct by %d", i, summedDurations, syncSampleTimes[ssIndex], correction));
                    __CLR4_5_275p75plvlulhpg.R.inc(9324);x += correction;
                }
            }}
            }__CLR4_5_275p75plvlulhpg.R.inc(9325);summedDurations += x;
            __CLR4_5_275p75plvlulhpg.R.inc(9326);scaledArray[i - 1] = x;
        }
        }__CLR4_5_275p75plvlulhpg.R.inc(9327);return scaledArray;
    }finally{__CLR4_5_275p75plvlulhpg.R.flushNeeded();}}

    public void close() throws IOException {try{__CLR4_5_275p75plvlulhpg.R.inc(9328);
        __CLR4_5_275p75plvlulhpg.R.inc(9329);source.close();
    }finally{__CLR4_5_275p75plvlulhpg.R.flushNeeded();}}

    public SampleDescriptionBox getSampleDescriptionBox() {try{__CLR4_5_275p75plvlulhpg.R.inc(9330);
        __CLR4_5_275p75plvlulhpg.R.inc(9331);return source.getSampleDescriptionBox();
    }finally{__CLR4_5_275p75plvlulhpg.R.flushNeeded();}}

    public long[] getSampleDurations() {try{__CLR4_5_275p75plvlulhpg.R.inc(9332);
        __CLR4_5_275p75plvlulhpg.R.inc(9333);return decodingTimes;
    }finally{__CLR4_5_275p75plvlulhpg.R.flushNeeded();}}

    public List<CompositionTimeToSample.Entry> getCompositionTimeEntries() {try{__CLR4_5_275p75plvlulhpg.R.inc(9334);
        __CLR4_5_275p75plvlulhpg.R.inc(9335);return ctts;
    }finally{__CLR4_5_275p75plvlulhpg.R.flushNeeded();}}

    public long[] getSyncSamples() {try{__CLR4_5_275p75plvlulhpg.R.inc(9336);
        __CLR4_5_275p75plvlulhpg.R.inc(9337);return source.getSyncSamples();
    }finally{__CLR4_5_275p75plvlulhpg.R.flushNeeded();}}

    public List<SampleDependencyTypeBox.Entry> getSampleDependencies() {try{__CLR4_5_275p75plvlulhpg.R.inc(9338);
        __CLR4_5_275p75plvlulhpg.R.inc(9339);return source.getSampleDependencies();
    }finally{__CLR4_5_275p75plvlulhpg.R.flushNeeded();}}

    public TrackMetaData getTrackMetaData() {try{__CLR4_5_275p75plvlulhpg.R.inc(9340);
        __CLR4_5_275p75plvlulhpg.R.inc(9341);TrackMetaData trackMetaData = (TrackMetaData) source.getTrackMetaData().clone();
        __CLR4_5_275p75plvlulhpg.R.inc(9342);trackMetaData.setTimescale(timeScale);
        __CLR4_5_275p75plvlulhpg.R.inc(9343);return trackMetaData;
    }finally{__CLR4_5_275p75plvlulhpg.R.flushNeeded();}}

    public String getHandler() {try{__CLR4_5_275p75plvlulhpg.R.inc(9344);
        __CLR4_5_275p75plvlulhpg.R.inc(9345);return source.getHandler();
    }finally{__CLR4_5_275p75plvlulhpg.R.flushNeeded();}}

    public List<Sample> getSamples() {try{__CLR4_5_275p75plvlulhpg.R.inc(9346);
        __CLR4_5_275p75plvlulhpg.R.inc(9347);return source.getSamples();
    }finally{__CLR4_5_275p75plvlulhpg.R.flushNeeded();}}

    public SubSampleInformationBox getSubsampleInformationBox() {try{__CLR4_5_275p75plvlulhpg.R.inc(9348);
        __CLR4_5_275p75plvlulhpg.R.inc(9349);return source.getSubsampleInformationBox();
    }finally{__CLR4_5_275p75plvlulhpg.R.flushNeeded();}}

    public long getDuration() {try{__CLR4_5_275p75plvlulhpg.R.inc(9350);
        __CLR4_5_275p75plvlulhpg.R.inc(9351);long duration = 0;
        __CLR4_5_275p75plvlulhpg.R.inc(9352);for (long delta : decodingTimes) {{
            __CLR4_5_275p75plvlulhpg.R.inc(9353);duration += delta;
        }
        }__CLR4_5_275p75plvlulhpg.R.inc(9354);return duration;
    }finally{__CLR4_5_275p75plvlulhpg.R.flushNeeded();}}

    @Override
    public String toString() {try{__CLR4_5_275p75plvlulhpg.R.inc(9355);
        __CLR4_5_275p75plvlulhpg.R.inc(9356);return "ChangeTimeScaleTrack{" +
                "source=" + source +
                '}';
    }finally{__CLR4_5_275p75plvlulhpg.R.flushNeeded();}}

    public String getName() {try{__CLR4_5_275p75plvlulhpg.R.inc(9357);
        __CLR4_5_275p75plvlulhpg.R.inc(9358);return "timeScale(" + source.getName() + ")";
    }finally{__CLR4_5_275p75plvlulhpg.R.flushNeeded();}}

    public List<Edit> getEdits() {try{__CLR4_5_275p75plvlulhpg.R.inc(9359);
        __CLR4_5_275p75plvlulhpg.R.inc(9360);return source.getEdits();
    }finally{__CLR4_5_275p75plvlulhpg.R.flushNeeded();}}

    public Map<GroupEntry, long[]> getSampleGroups() {try{__CLR4_5_275p75plvlulhpg.R.inc(9361);
        __CLR4_5_275p75plvlulhpg.R.inc(9362);return source.getSampleGroups();
    }finally{__CLR4_5_275p75plvlulhpg.R.flushNeeded();}}
}
