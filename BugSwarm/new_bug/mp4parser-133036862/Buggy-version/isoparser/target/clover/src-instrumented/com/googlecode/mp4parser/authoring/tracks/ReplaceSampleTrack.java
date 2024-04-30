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

import com.coremedia.iso.boxes.*;
import com.googlecode.mp4parser.authoring.AbstractTrack;
import com.googlecode.mp4parser.authoring.Sample;
import com.googlecode.mp4parser.authoring.SampleImpl;
import com.googlecode.mp4parser.authoring.Track;
import com.googlecode.mp4parser.authoring.TrackMetaData;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.AbstractList;
import java.util.List;

/**
 * Generates a Track where a single sample has been replaced by a given <code>ByteBuffer</code>.
 */

public class ReplaceSampleTrack extends AbstractTrack {public static class __CLR4_5_28k98k9lvluli70{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0033\u0033\u0030\u0033\u0036\u0038\u0036\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714448869219L,8589935092L,11131,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    Track origTrack;
    private long sampleNumber;
    private Sample sampleContent;
    private List<Sample> samples;

    public ReplaceSampleTrack(Track origTrack, long sampleNumber, ByteBuffer content) {
        super("replace(" + origTrack.getName() + ")");__CLR4_5_28k98k9lvluli70.R.inc(11098);try{__CLR4_5_28k98k9lvluli70.R.inc(11097);
        __CLR4_5_28k98k9lvluli70.R.inc(11099);this.origTrack = origTrack;
        __CLR4_5_28k98k9lvluli70.R.inc(11100);this.sampleNumber = sampleNumber;
        __CLR4_5_28k98k9lvluli70.R.inc(11101);this.sampleContent = new SampleImpl(content);
        __CLR4_5_28k98k9lvluli70.R.inc(11102);this.samples = new ReplaceASingleEntryList();

    }finally{__CLR4_5_28k98k9lvluli70.R.flushNeeded();}}

    public void close() throws IOException {try{__CLR4_5_28k98k9lvluli70.R.inc(11103);
        __CLR4_5_28k98k9lvluli70.R.inc(11104);origTrack.close();
    }finally{__CLR4_5_28k98k9lvluli70.R.flushNeeded();}}

    public List<Sample> getSamples() {try{__CLR4_5_28k98k9lvluli70.R.inc(11105);
        __CLR4_5_28k98k9lvluli70.R.inc(11106);return samples;
    }finally{__CLR4_5_28k98k9lvluli70.R.flushNeeded();}}

    public SampleDescriptionBox getSampleDescriptionBox() {try{__CLR4_5_28k98k9lvluli70.R.inc(11107);
        __CLR4_5_28k98k9lvluli70.R.inc(11108);return origTrack.getSampleDescriptionBox();
    }finally{__CLR4_5_28k98k9lvluli70.R.flushNeeded();}}

    public synchronized long[] getSampleDurations() {try{__CLR4_5_28k98k9lvluli70.R.inc(11109);
        __CLR4_5_28k98k9lvluli70.R.inc(11110);return origTrack.getSampleDurations();
    }finally{__CLR4_5_28k98k9lvluli70.R.flushNeeded();}}

    public List<CompositionTimeToSample.Entry> getCompositionTimeEntries() {try{__CLR4_5_28k98k9lvluli70.R.inc(11111);
        __CLR4_5_28k98k9lvluli70.R.inc(11112);return origTrack.getCompositionTimeEntries();

    }finally{__CLR4_5_28k98k9lvluli70.R.flushNeeded();}}

    synchronized public long[] getSyncSamples() {try{__CLR4_5_28k98k9lvluli70.R.inc(11113);
        __CLR4_5_28k98k9lvluli70.R.inc(11114);return origTrack.getSyncSamples();
    }finally{__CLR4_5_28k98k9lvluli70.R.flushNeeded();}}

    public List<SampleDependencyTypeBox.Entry> getSampleDependencies() {try{__CLR4_5_28k98k9lvluli70.R.inc(11115);
        __CLR4_5_28k98k9lvluli70.R.inc(11116);return origTrack.getSampleDependencies();
    }finally{__CLR4_5_28k98k9lvluli70.R.flushNeeded();}}

    public TrackMetaData getTrackMetaData() {try{__CLR4_5_28k98k9lvluli70.R.inc(11117);
        __CLR4_5_28k98k9lvluli70.R.inc(11118);return origTrack.getTrackMetaData();
    }finally{__CLR4_5_28k98k9lvluli70.R.flushNeeded();}}

    public String getHandler() {try{__CLR4_5_28k98k9lvluli70.R.inc(11119);
        __CLR4_5_28k98k9lvluli70.R.inc(11120);return origTrack.getHandler();
    }finally{__CLR4_5_28k98k9lvluli70.R.flushNeeded();}}

    public SubSampleInformationBox getSubsampleInformationBox() {try{__CLR4_5_28k98k9lvluli70.R.inc(11121);
        __CLR4_5_28k98k9lvluli70.R.inc(11122);return origTrack.getSubsampleInformationBox();
    }finally{__CLR4_5_28k98k9lvluli70.R.flushNeeded();}}

    private class ReplaceASingleEntryList extends AbstractList<Sample> {
        @Override
        public Sample get(int index) {try{__CLR4_5_28k98k9lvluli70.R.inc(11123);
            __CLR4_5_28k98k9lvluli70.R.inc(11124);if ((((ReplaceSampleTrack.this.sampleNumber == index)&&(__CLR4_5_28k98k9lvluli70.R.iget(11125)!=0|true))||(__CLR4_5_28k98k9lvluli70.R.iget(11126)==0&false))) {{
                __CLR4_5_28k98k9lvluli70.R.inc(11127);return ReplaceSampleTrack.this.sampleContent;
            } }else {{
                __CLR4_5_28k98k9lvluli70.R.inc(11128);return ReplaceSampleTrack.this.origTrack.getSamples().get(index);
            }
        }}finally{__CLR4_5_28k98k9lvluli70.R.flushNeeded();}}

        @Override
        public int size() {try{__CLR4_5_28k98k9lvluli70.R.inc(11129);
            __CLR4_5_28k98k9lvluli70.R.inc(11130);return ReplaceSampleTrack.this.origTrack.getSamples().size();
        }finally{__CLR4_5_28k98k9lvluli70.R.flushNeeded();}}
    }

}
