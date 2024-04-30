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
import com.coremedia.iso.boxes.sampleentry.TextSampleEntry;
import com.googlecode.mp4parser.authoring.AbstractTrack;
import com.googlecode.mp4parser.authoring.Sample;
import com.googlecode.mp4parser.authoring.SampleImpl;
import com.googlecode.mp4parser.authoring.TrackMetaData;
import com.googlecode.mp4parser.boxes.threegpp26245.FontTableBox;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.*;

/**
 *
 */
public class TextTrackImpl extends AbstractTrack {public static class __CLR4_5_28mf8mflvluli8e{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0033\u0033\u0030\u0033\u0036\u0038\u0036\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714448869219L,8589935092L,11262,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    TrackMetaData trackMetaData = new TrackMetaData();
    SampleDescriptionBox sampleDescriptionBox;
    List<Line> subs = new LinkedList<Line>();
    List<Sample> samples;

    public TextTrackImpl() {
        super("subtitles");__CLR4_5_28mf8mflvluli8e.R.inc(11176);try{__CLR4_5_28mf8mflvluli8e.R.inc(11175);
        __CLR4_5_28mf8mflvluli8e.R.inc(11177);sampleDescriptionBox = new SampleDescriptionBox();
        __CLR4_5_28mf8mflvluli8e.R.inc(11178);TextSampleEntry tx3g = new TextSampleEntry("tx3g");
        __CLR4_5_28mf8mflvluli8e.R.inc(11179);tx3g.setDataReferenceIndex(1);
        __CLR4_5_28mf8mflvluli8e.R.inc(11180);tx3g.setStyleRecord(new TextSampleEntry.StyleRecord());
        __CLR4_5_28mf8mflvluli8e.R.inc(11181);tx3g.setBoxRecord(new TextSampleEntry.BoxRecord());
        __CLR4_5_28mf8mflvluli8e.R.inc(11182);sampleDescriptionBox.addBox(tx3g);

        __CLR4_5_28mf8mflvluli8e.R.inc(11183);FontTableBox ftab = new FontTableBox();
        __CLR4_5_28mf8mflvluli8e.R.inc(11184);ftab.setEntries(Collections.singletonList(new FontTableBox.FontRecord(1, "Serif")));

        __CLR4_5_28mf8mflvluli8e.R.inc(11185);tx3g.addBox(ftab);


        __CLR4_5_28mf8mflvluli8e.R.inc(11186);trackMetaData.setCreationTime(new Date());
        __CLR4_5_28mf8mflvluli8e.R.inc(11187);trackMetaData.setModificationTime(new Date());
        __CLR4_5_28mf8mflvluli8e.R.inc(11188);trackMetaData.setTimescale(1000); // Text tracks use millieseconds


    }finally{__CLR4_5_28mf8mflvluli8e.R.flushNeeded();}}

    public List<Line> getSubs() {try{__CLR4_5_28mf8mflvluli8e.R.inc(11189);
        __CLR4_5_28mf8mflvluli8e.R.inc(11190);return subs;
    }finally{__CLR4_5_28mf8mflvluli8e.R.flushNeeded();}}

    public void close() throws IOException {try{__CLR4_5_28mf8mflvluli8e.R.inc(11191);
        // nothing to close
    }finally{__CLR4_5_28mf8mflvluli8e.R.flushNeeded();}}

    public synchronized List<Sample> getSamples() {try{__CLR4_5_28mf8mflvluli8e.R.inc(11192);
        __CLR4_5_28mf8mflvluli8e.R.inc(11193);if ((((samples == null)&&(__CLR4_5_28mf8mflvluli8e.R.iget(11194)!=0|true))||(__CLR4_5_28mf8mflvluli8e.R.iget(11195)==0&false))) {{
            __CLR4_5_28mf8mflvluli8e.R.inc(11196);samples = new ArrayList<Sample>();
            __CLR4_5_28mf8mflvluli8e.R.inc(11197);long lastEnd = 0;
            __CLR4_5_28mf8mflvluli8e.R.inc(11198);for (Line sub : subs) {{
                __CLR4_5_28mf8mflvluli8e.R.inc(11199);long silentTime = sub.from - lastEnd;
                __CLR4_5_28mf8mflvluli8e.R.inc(11200);if ((((silentTime > 0)&&(__CLR4_5_28mf8mflvluli8e.R.iget(11201)!=0|true))||(__CLR4_5_28mf8mflvluli8e.R.iget(11202)==0&false))) {{
                    __CLR4_5_28mf8mflvluli8e.R.inc(11203);samples.add(new SampleImpl(ByteBuffer.wrap(new byte[]{0, 0})));
                } }else {__CLR4_5_28mf8mflvluli8e.R.inc(11204);if ((((silentTime < 0)&&(__CLR4_5_28mf8mflvluli8e.R.iget(11205)!=0|true))||(__CLR4_5_28mf8mflvluli8e.R.iget(11206)==0&false))) {{
                    __CLR4_5_28mf8mflvluli8e.R.inc(11207);throw new Error("Subtitle display times may not intersect");
                }
                }}__CLR4_5_28mf8mflvluli8e.R.inc(11208);ByteArrayOutputStream baos = new ByteArrayOutputStream();
                __CLR4_5_28mf8mflvluli8e.R.inc(11209);DataOutputStream dos = new DataOutputStream(baos);
                __CLR4_5_28mf8mflvluli8e.R.inc(11210);try {
                    __CLR4_5_28mf8mflvluli8e.R.inc(11211);dos.writeShort(sub.text.getBytes("UTF-8").length);
                    __CLR4_5_28mf8mflvluli8e.R.inc(11212);dos.write(sub.text.getBytes("UTF-8"));
                    __CLR4_5_28mf8mflvluli8e.R.inc(11213);dos.close();
                } catch (IOException e) {
                    __CLR4_5_28mf8mflvluli8e.R.inc(11214);throw new Error("VM is broken. Does not support UTF-8");
                }
                __CLR4_5_28mf8mflvluli8e.R.inc(11215);samples.add(new SampleImpl(ByteBuffer.wrap(baos.toByteArray())));
                __CLR4_5_28mf8mflvluli8e.R.inc(11216);lastEnd = sub.to;
            }
        }}
        }__CLR4_5_28mf8mflvluli8e.R.inc(11217);return samples;
    }finally{__CLR4_5_28mf8mflvluli8e.R.flushNeeded();}}

    public SampleDescriptionBox getSampleDescriptionBox() {try{__CLR4_5_28mf8mflvluli8e.R.inc(11218);
        __CLR4_5_28mf8mflvluli8e.R.inc(11219);return sampleDescriptionBox;
    }finally{__CLR4_5_28mf8mflvluli8e.R.flushNeeded();}}

    public long[] getSampleDurations() {try{__CLR4_5_28mf8mflvluli8e.R.inc(11220);
        __CLR4_5_28mf8mflvluli8e.R.inc(11221);List<Long> decTimes = new ArrayList<Long>();

        __CLR4_5_28mf8mflvluli8e.R.inc(11222);long lastEnd = 0;
        __CLR4_5_28mf8mflvluli8e.R.inc(11223);for (Line sub : subs) {{
            __CLR4_5_28mf8mflvluli8e.R.inc(11224);long silentTime = sub.from - lastEnd;
            __CLR4_5_28mf8mflvluli8e.R.inc(11225);if ((((silentTime > 0)&&(__CLR4_5_28mf8mflvluli8e.R.iget(11226)!=0|true))||(__CLR4_5_28mf8mflvluli8e.R.iget(11227)==0&false))) {{

                __CLR4_5_28mf8mflvluli8e.R.inc(11228);decTimes.add(silentTime);
            } }else {__CLR4_5_28mf8mflvluli8e.R.inc(11229);if ((((silentTime < 0)&&(__CLR4_5_28mf8mflvluli8e.R.iget(11230)!=0|true))||(__CLR4_5_28mf8mflvluli8e.R.iget(11231)==0&false))) {{
                __CLR4_5_28mf8mflvluli8e.R.inc(11232);throw new Error("Subtitle display times may not intersect");
            }
            }}__CLR4_5_28mf8mflvluli8e.R.inc(11233);decTimes.add( sub.to - sub.from);
            __CLR4_5_28mf8mflvluli8e.R.inc(11234);lastEnd = sub.to;
        }
        }__CLR4_5_28mf8mflvluli8e.R.inc(11235);long[] decTimesArray = new long[decTimes.size()];
        __CLR4_5_28mf8mflvluli8e.R.inc(11236);int index = 0;
        __CLR4_5_28mf8mflvluli8e.R.inc(11237);for (Long decTime : decTimes) {{
            __CLR4_5_28mf8mflvluli8e.R.inc(11238);decTimesArray[index++] = decTime;
        }
        }__CLR4_5_28mf8mflvluli8e.R.inc(11239);return decTimesArray;
    }finally{__CLR4_5_28mf8mflvluli8e.R.flushNeeded();}}

    public List<CompositionTimeToSample.Entry> getCompositionTimeEntries() {try{__CLR4_5_28mf8mflvluli8e.R.inc(11240);
        __CLR4_5_28mf8mflvluli8e.R.inc(11241);return null;
    }finally{__CLR4_5_28mf8mflvluli8e.R.flushNeeded();}}

    public long[] getSyncSamples() {try{__CLR4_5_28mf8mflvluli8e.R.inc(11242);
        __CLR4_5_28mf8mflvluli8e.R.inc(11243);return null;
    }finally{__CLR4_5_28mf8mflvluli8e.R.flushNeeded();}}

    public List<SampleDependencyTypeBox.Entry> getSampleDependencies() {try{__CLR4_5_28mf8mflvluli8e.R.inc(11244);
        __CLR4_5_28mf8mflvluli8e.R.inc(11245);return null;
    }finally{__CLR4_5_28mf8mflvluli8e.R.flushNeeded();}}

    public TrackMetaData getTrackMetaData() {try{__CLR4_5_28mf8mflvluli8e.R.inc(11246);
        __CLR4_5_28mf8mflvluli8e.R.inc(11247);return trackMetaData;
    }finally{__CLR4_5_28mf8mflvluli8e.R.flushNeeded();}}

    public String getHandler() {try{__CLR4_5_28mf8mflvluli8e.R.inc(11248);
        __CLR4_5_28mf8mflvluli8e.R.inc(11249);return "sbtl";
    }finally{__CLR4_5_28mf8mflvluli8e.R.flushNeeded();}}

    public SubSampleInformationBox getSubsampleInformationBox() {try{__CLR4_5_28mf8mflvluli8e.R.inc(11250);
        __CLR4_5_28mf8mflvluli8e.R.inc(11251);return null;
    }finally{__CLR4_5_28mf8mflvluli8e.R.flushNeeded();}}

    public static class Line {
        long from;
        long to;
        String text;


        public Line(long from, long to, String text) {try{__CLR4_5_28mf8mflvluli8e.R.inc(11252);
            __CLR4_5_28mf8mflvluli8e.R.inc(11253);this.from = from;
            __CLR4_5_28mf8mflvluli8e.R.inc(11254);this.to = to;
            __CLR4_5_28mf8mflvluli8e.R.inc(11255);this.text = text;
        }finally{__CLR4_5_28mf8mflvluli8e.R.flushNeeded();}}

        public long getFrom() {try{__CLR4_5_28mf8mflvluli8e.R.inc(11256);
            __CLR4_5_28mf8mflvluli8e.R.inc(11257);return from;
        }finally{__CLR4_5_28mf8mflvluli8e.R.flushNeeded();}}

        public String getText() {try{__CLR4_5_28mf8mflvluli8e.R.inc(11258);
            __CLR4_5_28mf8mflvluli8e.R.inc(11259);return text;
        }finally{__CLR4_5_28mf8mflvluli8e.R.flushNeeded();}}

        public long getTo() {try{__CLR4_5_28mf8mflvluli8e.R.inc(11260);
            __CLR4_5_28mf8mflvluli8e.R.inc(11261);return to;
        }finally{__CLR4_5_28mf8mflvluli8e.R.flushNeeded();}}
    }
}
