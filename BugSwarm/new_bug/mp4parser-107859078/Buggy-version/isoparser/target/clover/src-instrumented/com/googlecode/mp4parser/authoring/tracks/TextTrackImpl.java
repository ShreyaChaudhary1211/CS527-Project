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
public class TextTrackImpl extends AbstractTrack {public static class __CLR4_5_28js8jslvl9eih5{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0030\u0037\u0038\u0035\u0039\u0030\u0037\u0038\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714413275835L,8589935092L,11167,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    TrackMetaData trackMetaData = new TrackMetaData();
    SampleDescriptionBox sampleDescriptionBox;
    List<Line> subs = new LinkedList<Line>();
    List<Sample> samples;

    public TextTrackImpl() {
        super("subtitles");__CLR4_5_28js8jslvl9eih5.R.inc(11081);try{__CLR4_5_28js8jslvl9eih5.R.inc(11080);
        __CLR4_5_28js8jslvl9eih5.R.inc(11082);sampleDescriptionBox = new SampleDescriptionBox();
        __CLR4_5_28js8jslvl9eih5.R.inc(11083);TextSampleEntry tx3g = new TextSampleEntry("tx3g");
        __CLR4_5_28js8jslvl9eih5.R.inc(11084);tx3g.setDataReferenceIndex(1);
        __CLR4_5_28js8jslvl9eih5.R.inc(11085);tx3g.setStyleRecord(new TextSampleEntry.StyleRecord());
        __CLR4_5_28js8jslvl9eih5.R.inc(11086);tx3g.setBoxRecord(new TextSampleEntry.BoxRecord());
        __CLR4_5_28js8jslvl9eih5.R.inc(11087);sampleDescriptionBox.addBox(tx3g);

        __CLR4_5_28js8jslvl9eih5.R.inc(11088);FontTableBox ftab = new FontTableBox();
        __CLR4_5_28js8jslvl9eih5.R.inc(11089);ftab.setEntries(Collections.singletonList(new FontTableBox.FontRecord(1, "Serif")));

        __CLR4_5_28js8jslvl9eih5.R.inc(11090);tx3g.addBox(ftab);


        __CLR4_5_28js8jslvl9eih5.R.inc(11091);trackMetaData.setCreationTime(new Date());
        __CLR4_5_28js8jslvl9eih5.R.inc(11092);trackMetaData.setModificationTime(new Date());
        __CLR4_5_28js8jslvl9eih5.R.inc(11093);trackMetaData.setTimescale(1000); // Text tracks use millieseconds


    }finally{__CLR4_5_28js8jslvl9eih5.R.flushNeeded();}}

    public List<Line> getSubs() {try{__CLR4_5_28js8jslvl9eih5.R.inc(11094);
        __CLR4_5_28js8jslvl9eih5.R.inc(11095);return subs;
    }finally{__CLR4_5_28js8jslvl9eih5.R.flushNeeded();}}

    public void close() throws IOException {try{__CLR4_5_28js8jslvl9eih5.R.inc(11096);
        // nothing to close
    }finally{__CLR4_5_28js8jslvl9eih5.R.flushNeeded();}}

    public synchronized List<Sample> getSamples() {try{__CLR4_5_28js8jslvl9eih5.R.inc(11097);
        __CLR4_5_28js8jslvl9eih5.R.inc(11098);if ((((samples == null)&&(__CLR4_5_28js8jslvl9eih5.R.iget(11099)!=0|true))||(__CLR4_5_28js8jslvl9eih5.R.iget(11100)==0&false))) {{
            __CLR4_5_28js8jslvl9eih5.R.inc(11101);samples = new ArrayList<Sample>();
            __CLR4_5_28js8jslvl9eih5.R.inc(11102);long lastEnd = 0;
            __CLR4_5_28js8jslvl9eih5.R.inc(11103);for (Line sub : subs) {{
                __CLR4_5_28js8jslvl9eih5.R.inc(11104);long silentTime = sub.from - lastEnd;
                __CLR4_5_28js8jslvl9eih5.R.inc(11105);if ((((silentTime > 0)&&(__CLR4_5_28js8jslvl9eih5.R.iget(11106)!=0|true))||(__CLR4_5_28js8jslvl9eih5.R.iget(11107)==0&false))) {{
                    __CLR4_5_28js8jslvl9eih5.R.inc(11108);samples.add(new SampleImpl(ByteBuffer.wrap(new byte[]{0, 0})));
                } }else {__CLR4_5_28js8jslvl9eih5.R.inc(11109);if ((((silentTime < 0)&&(__CLR4_5_28js8jslvl9eih5.R.iget(11110)!=0|true))||(__CLR4_5_28js8jslvl9eih5.R.iget(11111)==0&false))) {{
                    __CLR4_5_28js8jslvl9eih5.R.inc(11112);throw new Error("Subtitle display times may not intersect");
                }
                }}__CLR4_5_28js8jslvl9eih5.R.inc(11113);ByteArrayOutputStream baos = new ByteArrayOutputStream();
                __CLR4_5_28js8jslvl9eih5.R.inc(11114);DataOutputStream dos = new DataOutputStream(baos);
                __CLR4_5_28js8jslvl9eih5.R.inc(11115);try {
                    __CLR4_5_28js8jslvl9eih5.R.inc(11116);dos.writeShort(sub.text.getBytes("UTF-8").length);
                    __CLR4_5_28js8jslvl9eih5.R.inc(11117);dos.write(sub.text.getBytes("UTF-8"));
                    __CLR4_5_28js8jslvl9eih5.R.inc(11118);dos.close();
                } catch (IOException e) {
                    __CLR4_5_28js8jslvl9eih5.R.inc(11119);throw new Error("VM is broken. Does not support UTF-8");
                }
                __CLR4_5_28js8jslvl9eih5.R.inc(11120);samples.add(new SampleImpl(ByteBuffer.wrap(baos.toByteArray())));
                __CLR4_5_28js8jslvl9eih5.R.inc(11121);lastEnd = sub.to;
            }
        }}
        }__CLR4_5_28js8jslvl9eih5.R.inc(11122);return samples;
    }finally{__CLR4_5_28js8jslvl9eih5.R.flushNeeded();}}

    public SampleDescriptionBox getSampleDescriptionBox() {try{__CLR4_5_28js8jslvl9eih5.R.inc(11123);
        __CLR4_5_28js8jslvl9eih5.R.inc(11124);return sampleDescriptionBox;
    }finally{__CLR4_5_28js8jslvl9eih5.R.flushNeeded();}}

    public long[] getSampleDurations() {try{__CLR4_5_28js8jslvl9eih5.R.inc(11125);
        __CLR4_5_28js8jslvl9eih5.R.inc(11126);List<Long> decTimes = new ArrayList<Long>();

        __CLR4_5_28js8jslvl9eih5.R.inc(11127);long lastEnd = 0;
        __CLR4_5_28js8jslvl9eih5.R.inc(11128);for (Line sub : subs) {{
            __CLR4_5_28js8jslvl9eih5.R.inc(11129);long silentTime = sub.from - lastEnd;
            __CLR4_5_28js8jslvl9eih5.R.inc(11130);if ((((silentTime > 0)&&(__CLR4_5_28js8jslvl9eih5.R.iget(11131)!=0|true))||(__CLR4_5_28js8jslvl9eih5.R.iget(11132)==0&false))) {{

                __CLR4_5_28js8jslvl9eih5.R.inc(11133);decTimes.add(silentTime);
            } }else {__CLR4_5_28js8jslvl9eih5.R.inc(11134);if ((((silentTime < 0)&&(__CLR4_5_28js8jslvl9eih5.R.iget(11135)!=0|true))||(__CLR4_5_28js8jslvl9eih5.R.iget(11136)==0&false))) {{
                __CLR4_5_28js8jslvl9eih5.R.inc(11137);throw new Error("Subtitle display times may not intersect");
            }
            }}__CLR4_5_28js8jslvl9eih5.R.inc(11138);decTimes.add( sub.to - sub.from);
            __CLR4_5_28js8jslvl9eih5.R.inc(11139);lastEnd = sub.to;
        }
        }__CLR4_5_28js8jslvl9eih5.R.inc(11140);long[] decTimesArray = new long[decTimes.size()];
        __CLR4_5_28js8jslvl9eih5.R.inc(11141);int index = 0;
        __CLR4_5_28js8jslvl9eih5.R.inc(11142);for (Long decTime : decTimes) {{
            __CLR4_5_28js8jslvl9eih5.R.inc(11143);decTimesArray[index++] = decTime;
        }
        }__CLR4_5_28js8jslvl9eih5.R.inc(11144);return decTimesArray;
    }finally{__CLR4_5_28js8jslvl9eih5.R.flushNeeded();}}

    public List<CompositionTimeToSample.Entry> getCompositionTimeEntries() {try{__CLR4_5_28js8jslvl9eih5.R.inc(11145);
        __CLR4_5_28js8jslvl9eih5.R.inc(11146);return null;
    }finally{__CLR4_5_28js8jslvl9eih5.R.flushNeeded();}}

    public long[] getSyncSamples() {try{__CLR4_5_28js8jslvl9eih5.R.inc(11147);
        __CLR4_5_28js8jslvl9eih5.R.inc(11148);return null;
    }finally{__CLR4_5_28js8jslvl9eih5.R.flushNeeded();}}

    public List<SampleDependencyTypeBox.Entry> getSampleDependencies() {try{__CLR4_5_28js8jslvl9eih5.R.inc(11149);
        __CLR4_5_28js8jslvl9eih5.R.inc(11150);return null;
    }finally{__CLR4_5_28js8jslvl9eih5.R.flushNeeded();}}

    public TrackMetaData getTrackMetaData() {try{__CLR4_5_28js8jslvl9eih5.R.inc(11151);
        __CLR4_5_28js8jslvl9eih5.R.inc(11152);return trackMetaData;
    }finally{__CLR4_5_28js8jslvl9eih5.R.flushNeeded();}}

    public String getHandler() {try{__CLR4_5_28js8jslvl9eih5.R.inc(11153);
        __CLR4_5_28js8jslvl9eih5.R.inc(11154);return "sbtl";
    }finally{__CLR4_5_28js8jslvl9eih5.R.flushNeeded();}}

    public SubSampleInformationBox getSubsampleInformationBox() {try{__CLR4_5_28js8jslvl9eih5.R.inc(11155);
        __CLR4_5_28js8jslvl9eih5.R.inc(11156);return null;
    }finally{__CLR4_5_28js8jslvl9eih5.R.flushNeeded();}}

    public static class Line {
        long from;
        long to;
        String text;


        public Line(long from, long to, String text) {try{__CLR4_5_28js8jslvl9eih5.R.inc(11157);
            __CLR4_5_28js8jslvl9eih5.R.inc(11158);this.from = from;
            __CLR4_5_28js8jslvl9eih5.R.inc(11159);this.to = to;
            __CLR4_5_28js8jslvl9eih5.R.inc(11160);this.text = text;
        }finally{__CLR4_5_28js8jslvl9eih5.R.flushNeeded();}}

        public long getFrom() {try{__CLR4_5_28js8jslvl9eih5.R.inc(11161);
            __CLR4_5_28js8jslvl9eih5.R.inc(11162);return from;
        }finally{__CLR4_5_28js8jslvl9eih5.R.flushNeeded();}}

        public String getText() {try{__CLR4_5_28js8jslvl9eih5.R.inc(11163);
            __CLR4_5_28js8jslvl9eih5.R.inc(11164);return text;
        }finally{__CLR4_5_28js8jslvl9eih5.R.flushNeeded();}}

        public long getTo() {try{__CLR4_5_28js8jslvl9eih5.R.inc(11165);
            __CLR4_5_28js8jslvl9eih5.R.inc(11166);return to;
        }finally{__CLR4_5_28js8jslvl9eih5.R.flushNeeded();}}
    }
}
