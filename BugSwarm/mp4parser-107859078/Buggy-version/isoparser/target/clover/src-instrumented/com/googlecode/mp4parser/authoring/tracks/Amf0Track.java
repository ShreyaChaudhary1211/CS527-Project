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
import com.googlecode.mp4parser.authoring.TrackMetaData;
import com.googlecode.mp4parser.boxes.adobe.ActionMessageFormat0SampleEntryBox;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class Amf0Track extends AbstractTrack {public static class __CLR4_5_26gg6gglvl9ei2b{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0030\u0037\u0038\u0035\u0039\u0030\u0037\u0038\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714413275835L,8589935092L,8411,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    SortedMap<Long, byte[]> rawSamples = new TreeMap<Long, byte[]>() {
    };
    private TrackMetaData trackMetaData = new TrackMetaData();


    /**
     * Creates a new AMF0 track from
     *
     * @param rawSamples raw samples of the track
     */
    public Amf0Track(Map<Long, byte[]> rawSamples) {
        super("amf0");__CLR4_5_26gg6gglvl9ei2b.R.inc(8369);try{__CLR4_5_26gg6gglvl9ei2b.R.inc(8368);
        __CLR4_5_26gg6gglvl9ei2b.R.inc(8370);this.rawSamples = new TreeMap<Long, byte[]>(rawSamples);
        __CLR4_5_26gg6gglvl9ei2b.R.inc(8371);trackMetaData.setCreationTime(new Date());
        __CLR4_5_26gg6gglvl9ei2b.R.inc(8372);trackMetaData.setModificationTime(new Date());
        __CLR4_5_26gg6gglvl9ei2b.R.inc(8373);trackMetaData.setTimescale(1000); // Text tracks use millieseconds
        __CLR4_5_26gg6gglvl9ei2b.R.inc(8374);trackMetaData.setLanguage("eng");
    }finally{__CLR4_5_26gg6gglvl9ei2b.R.flushNeeded();}}

    public List<Sample> getSamples() {try{__CLR4_5_26gg6gglvl9ei2b.R.inc(8375);
        __CLR4_5_26gg6gglvl9ei2b.R.inc(8376);LinkedList<Sample> samples = new LinkedList<Sample>();
        __CLR4_5_26gg6gglvl9ei2b.R.inc(8377);for (byte[] bytes : rawSamples.values()) {{
            __CLR4_5_26gg6gglvl9ei2b.R.inc(8378);samples.add(new SampleImpl(ByteBuffer.wrap(bytes)));
        }
        }__CLR4_5_26gg6gglvl9ei2b.R.inc(8379);return samples;
    }finally{__CLR4_5_26gg6gglvl9ei2b.R.flushNeeded();}}

    public void close() throws IOException {try{__CLR4_5_26gg6gglvl9ei2b.R.inc(8380);
        // no resources involved - doing nothing
    }finally{__CLR4_5_26gg6gglvl9ei2b.R.flushNeeded();}}

    public SampleDescriptionBox getSampleDescriptionBox() {try{__CLR4_5_26gg6gglvl9ei2b.R.inc(8381);
        __CLR4_5_26gg6gglvl9ei2b.R.inc(8382);SampleDescriptionBox stsd = new SampleDescriptionBox();
        __CLR4_5_26gg6gglvl9ei2b.R.inc(8383);ActionMessageFormat0SampleEntryBox amf0 = new ActionMessageFormat0SampleEntryBox();
        __CLR4_5_26gg6gglvl9ei2b.R.inc(8384);amf0.setDataReferenceIndex(1);
        __CLR4_5_26gg6gglvl9ei2b.R.inc(8385);stsd.addBox(amf0);
        __CLR4_5_26gg6gglvl9ei2b.R.inc(8386);return stsd;
    }finally{__CLR4_5_26gg6gglvl9ei2b.R.flushNeeded();}}

    public long[] getSampleDurations() {try{__CLR4_5_26gg6gglvl9ei2b.R.inc(8387);
        __CLR4_5_26gg6gglvl9ei2b.R.inc(8388);LinkedList<Long> keys = new LinkedList<Long>(rawSamples.keySet());
        __CLR4_5_26gg6gglvl9ei2b.R.inc(8389);Collections.sort(keys);
        __CLR4_5_26gg6gglvl9ei2b.R.inc(8390);long[] rc = new long[keys.size()];
        __CLR4_5_26gg6gglvl9ei2b.R.inc(8391);long lastTimeStamp = 0;
        __CLR4_5_26gg6gglvl9ei2b.R.inc(8392);for (int i = 0; (((i < keys.size())&&(__CLR4_5_26gg6gglvl9ei2b.R.iget(8393)!=0|true))||(__CLR4_5_26gg6gglvl9ei2b.R.iget(8394)==0&false)); i++) {{
            __CLR4_5_26gg6gglvl9ei2b.R.inc(8395);long key = keys.get(i);
            __CLR4_5_26gg6gglvl9ei2b.R.inc(8396);long delta = key - lastTimeStamp;
            __CLR4_5_26gg6gglvl9ei2b.R.inc(8397);rc[i] = delta;
        }
        }__CLR4_5_26gg6gglvl9ei2b.R.inc(8398);return rc;
    }finally{__CLR4_5_26gg6gglvl9ei2b.R.flushNeeded();}}

    public List<CompositionTimeToSample.Entry> getCompositionTimeEntries() {try{__CLR4_5_26gg6gglvl9ei2b.R.inc(8399);
        // AMF0 tracks do not have Composition Time
        __CLR4_5_26gg6gglvl9ei2b.R.inc(8400);return null;
    }finally{__CLR4_5_26gg6gglvl9ei2b.R.flushNeeded();}}

    public long[] getSyncSamples() {try{__CLR4_5_26gg6gglvl9ei2b.R.inc(8401);
        // AMF0 tracks do not have Sync Samples
        __CLR4_5_26gg6gglvl9ei2b.R.inc(8402);return null;
    }finally{__CLR4_5_26gg6gglvl9ei2b.R.flushNeeded();}}

    public List<SampleDependencyTypeBox.Entry> getSampleDependencies() {try{__CLR4_5_26gg6gglvl9ei2b.R.inc(8403);
        // AMF0 tracks do not have Sample Dependencies
        __CLR4_5_26gg6gglvl9ei2b.R.inc(8404);return null;
    }finally{__CLR4_5_26gg6gglvl9ei2b.R.flushNeeded();}}

    public TrackMetaData getTrackMetaData() {try{__CLR4_5_26gg6gglvl9ei2b.R.inc(8405);
        __CLR4_5_26gg6gglvl9ei2b.R.inc(8406);return trackMetaData;  //To change body of implemented methods use File | Settings | File Templates.
    }finally{__CLR4_5_26gg6gglvl9ei2b.R.flushNeeded();}}

    public String getHandler() {try{__CLR4_5_26gg6gglvl9ei2b.R.inc(8407);
        __CLR4_5_26gg6gglvl9ei2b.R.inc(8408);return "data";
    }finally{__CLR4_5_26gg6gglvl9ei2b.R.flushNeeded();}}

    public SubSampleInformationBox getSubsampleInformationBox() {try{__CLR4_5_26gg6gglvl9ei2b.R.inc(8409);
        __CLR4_5_26gg6gglvl9ei2b.R.inc(8410);return null;
    }finally{__CLR4_5_26gg6gglvl9ei2b.R.flushNeeded();}}

}
