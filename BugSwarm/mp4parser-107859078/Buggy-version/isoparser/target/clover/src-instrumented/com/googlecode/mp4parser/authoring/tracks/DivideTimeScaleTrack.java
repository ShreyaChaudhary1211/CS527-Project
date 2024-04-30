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
import java.util.List;
import java.util.Map;

/**
 * Changes the timescale of a track by wrapping the track.
 */
public class DivideTimeScaleTrack implements Track {public static class __CLR4_5_27ve7velvl9eibj{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0030\u0037\u0038\u0035\u0039\u0030\u0037\u0038\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714413275835L,8589935092L,10255,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    Track source;
    private int timeScaleDivisor;

    public DivideTimeScaleTrack(Track source, int timeScaleDivisor) {try{__CLR4_5_27ve7velvl9eibj.R.inc(10202);
        __CLR4_5_27ve7velvl9eibj.R.inc(10203);this.source = source;
        __CLR4_5_27ve7velvl9eibj.R.inc(10204);this.timeScaleDivisor = timeScaleDivisor;
    }finally{__CLR4_5_27ve7velvl9eibj.R.flushNeeded();}}

    public void close() throws IOException {try{__CLR4_5_27ve7velvl9eibj.R.inc(10205);
        __CLR4_5_27ve7velvl9eibj.R.inc(10206);source.close();
    }finally{__CLR4_5_27ve7velvl9eibj.R.flushNeeded();}}

    public SampleDescriptionBox getSampleDescriptionBox() {try{__CLR4_5_27ve7velvl9eibj.R.inc(10207);
        __CLR4_5_27ve7velvl9eibj.R.inc(10208);return source.getSampleDescriptionBox();
    }finally{__CLR4_5_27ve7velvl9eibj.R.flushNeeded();}}

    public long[] getSampleDurations() {try{__CLR4_5_27ve7velvl9eibj.R.inc(10209);
        __CLR4_5_27ve7velvl9eibj.R.inc(10210);long[] scaled = new long[source.getSampleDurations().length];


        __CLR4_5_27ve7velvl9eibj.R.inc(10211);for (int i = 0; (((i < source.getSampleDurations().length)&&(__CLR4_5_27ve7velvl9eibj.R.iget(10212)!=0|true))||(__CLR4_5_27ve7velvl9eibj.R.iget(10213)==0&false)); i++) {{
            __CLR4_5_27ve7velvl9eibj.R.inc(10214);scaled[i] = source.getSampleDurations()[i] / timeScaleDivisor;
        }
        }__CLR4_5_27ve7velvl9eibj.R.inc(10215);return scaled;
    }finally{__CLR4_5_27ve7velvl9eibj.R.flushNeeded();}}

    public List<CompositionTimeToSample.Entry> getCompositionTimeEntries() {try{__CLR4_5_27ve7velvl9eibj.R.inc(10216);
        __CLR4_5_27ve7velvl9eibj.R.inc(10217);return adjustCtts();
    }finally{__CLR4_5_27ve7velvl9eibj.R.flushNeeded();}}

    public long[] getSyncSamples() {try{__CLR4_5_27ve7velvl9eibj.R.inc(10218);
        __CLR4_5_27ve7velvl9eibj.R.inc(10219);return source.getSyncSamples();
    }finally{__CLR4_5_27ve7velvl9eibj.R.flushNeeded();}}

    public List<SampleDependencyTypeBox.Entry> getSampleDependencies() {try{__CLR4_5_27ve7velvl9eibj.R.inc(10220);
        __CLR4_5_27ve7velvl9eibj.R.inc(10221);return source.getSampleDependencies();
    }finally{__CLR4_5_27ve7velvl9eibj.R.flushNeeded();}}

    public TrackMetaData getTrackMetaData() {try{__CLR4_5_27ve7velvl9eibj.R.inc(10222);
        __CLR4_5_27ve7velvl9eibj.R.inc(10223);TrackMetaData trackMetaData = (TrackMetaData) source.getTrackMetaData().clone();
        __CLR4_5_27ve7velvl9eibj.R.inc(10224);trackMetaData.setTimescale(source.getTrackMetaData().getTimescale() / this.timeScaleDivisor);
        __CLR4_5_27ve7velvl9eibj.R.inc(10225);return trackMetaData;
    }finally{__CLR4_5_27ve7velvl9eibj.R.flushNeeded();}}

    public String getHandler() {try{__CLR4_5_27ve7velvl9eibj.R.inc(10226);
        __CLR4_5_27ve7velvl9eibj.R.inc(10227);return source.getHandler();
    }finally{__CLR4_5_27ve7velvl9eibj.R.flushNeeded();}}


    public List<Sample> getSamples() {try{__CLR4_5_27ve7velvl9eibj.R.inc(10228);
        __CLR4_5_27ve7velvl9eibj.R.inc(10229);return source.getSamples();
    }finally{__CLR4_5_27ve7velvl9eibj.R.flushNeeded();}}


    List<CompositionTimeToSample.Entry> adjustCtts() {try{__CLR4_5_27ve7velvl9eibj.R.inc(10230);
        __CLR4_5_27ve7velvl9eibj.R.inc(10231);List<CompositionTimeToSample.Entry> origCtts = this.source.getCompositionTimeEntries();
        __CLR4_5_27ve7velvl9eibj.R.inc(10232);if ((((origCtts != null)&&(__CLR4_5_27ve7velvl9eibj.R.iget(10233)!=0|true))||(__CLR4_5_27ve7velvl9eibj.R.iget(10234)==0&false))) {{
            __CLR4_5_27ve7velvl9eibj.R.inc(10235);List<CompositionTimeToSample.Entry> entries2 = new ArrayList<CompositionTimeToSample.Entry>(origCtts.size());
            __CLR4_5_27ve7velvl9eibj.R.inc(10236);for (CompositionTimeToSample.Entry entry : origCtts) {{
                __CLR4_5_27ve7velvl9eibj.R.inc(10237);entries2.add(new CompositionTimeToSample.Entry(entry.getCount(), entry.getOffset() / timeScaleDivisor));
            }
            }__CLR4_5_27ve7velvl9eibj.R.inc(10238);return entries2;
        } }else {{
            __CLR4_5_27ve7velvl9eibj.R.inc(10239);return null;
        }
    }}finally{__CLR4_5_27ve7velvl9eibj.R.flushNeeded();}}

    public SubSampleInformationBox getSubsampleInformationBox() {try{__CLR4_5_27ve7velvl9eibj.R.inc(10240);
        __CLR4_5_27ve7velvl9eibj.R.inc(10241);return source.getSubsampleInformationBox();
    }finally{__CLR4_5_27ve7velvl9eibj.R.flushNeeded();}}

    public long getDuration() {try{__CLR4_5_27ve7velvl9eibj.R.inc(10242);
        __CLR4_5_27ve7velvl9eibj.R.inc(10243);long duration = 0;
        __CLR4_5_27ve7velvl9eibj.R.inc(10244);for (long delta : getSampleDurations()) {{
            __CLR4_5_27ve7velvl9eibj.R.inc(10245);duration += delta;
        }
        }__CLR4_5_27ve7velvl9eibj.R.inc(10246);return duration;
    }finally{__CLR4_5_27ve7velvl9eibj.R.flushNeeded();}}

    @Override
    public String toString() {try{__CLR4_5_27ve7velvl9eibj.R.inc(10247);
        __CLR4_5_27ve7velvl9eibj.R.inc(10248);return "MultiplyTimeScaleTrack{" +
                "source=" + source +
                '}';
    }finally{__CLR4_5_27ve7velvl9eibj.R.flushNeeded();}}

    public String getName() {try{__CLR4_5_27ve7velvl9eibj.R.inc(10249);
        __CLR4_5_27ve7velvl9eibj.R.inc(10250);return "timscale(" + source.getName() + ")";
    }finally{__CLR4_5_27ve7velvl9eibj.R.flushNeeded();}}

    public List<Edit> getEdits() {try{__CLR4_5_27ve7velvl9eibj.R.inc(10251);
        __CLR4_5_27ve7velvl9eibj.R.inc(10252);return source.getEdits();
    }finally{__CLR4_5_27ve7velvl9eibj.R.flushNeeded();}}

    public Map<GroupEntry, long[]> getSampleGroups() {try{__CLR4_5_27ve7velvl9eibj.R.inc(10253);
        __CLR4_5_27ve7velvl9eibj.R.inc(10254);return source.getSampleGroups();
    }finally{__CLR4_5_27ve7velvl9eibj.R.flushNeeded();}}
}
