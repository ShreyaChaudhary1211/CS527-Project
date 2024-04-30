/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*  
 * Copyright 2008 CoreMedia AG, Hamburg
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

package com.coremedia.iso.boxes;


import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.AbstractFullBox;

import java.nio.ByteBuffer;
import java.util.LinkedList;
import java.util.List;

import static com.googlecode.mp4parser.util.CastUtils.l2i;

/**
 * <h1>4cc = "{@value #TYPE}"</h1>
 * <pre>
 * Box Type  : 'elst'
 * Container: {@link EditBox}('edts')
 * Mandatory: No
 * Quantity  : Zero or one</pre>
 *
 * <p>This box contains an explicit timeline map. Each entry defines part of the track time-line: by mapping part of
 * the media time-line, or by indicating 'empty' time, or by defining a 'dwell', where a single time-point in the
 * media is held for a period.</p>
 * <p>Note that edits are not restricted to fall on sample times. This means that when entering an edit, it can be
 * necessary to (a) back up to a sync point, and pre-roll from there and then (b) be careful about the duration of
 * the first sample - it might have been truncated if the edit enters it during its normal duration. If this is audio,
 * that frame might need to be decoded, and then the final slicing done. Likewise, the duration of the last sample
 * in an edit might need slicing. </p>
 * <p>Starting offsets for tracks (streams) are represented by an initial empty edit. For example, to play a track from
 * its start for 30 seconds, but at 10 seconds into the presentation, we have the following edit list:</p>
 *
 * <ul>
 * <li>Entry-count = 2</li>
 * <li>Segment-duration = 10 seconds</li>
 * <li>Media-Time = -1</li>
 * <li>Media-Rate = 1</li>
 * <li>Segment-duration = 30 seconds (could be the length of the whole track)</li>
 * <li>Media-Time = 0 seconds</li>
 * <li>Media-Rate = 1</li>
 * </ul>
 */
public class EditListBox extends AbstractFullBox {public static class __CLR4_5_2nenelvlulb59{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0033\u0033\u0030\u0033\u0036\u0038\u0036\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714448869219L,8589935092L,933,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static final String TYPE = "elst";
    private List<Entry> entries = new LinkedList<Entry>();

    public EditListBox() {
        super(TYPE);__CLR4_5_2nenelvlulb59.R.inc(843);try{__CLR4_5_2nenelvlulb59.R.inc(842);
    }finally{__CLR4_5_2nenelvlulb59.R.flushNeeded();}}


    public List<Entry> getEntries() {try{__CLR4_5_2nenelvlulb59.R.inc(844);
        __CLR4_5_2nenelvlulb59.R.inc(845);return entries;
    }finally{__CLR4_5_2nenelvlulb59.R.flushNeeded();}}

    public void setEntries(List<Entry> entries) {try{__CLR4_5_2nenelvlulb59.R.inc(846);
        __CLR4_5_2nenelvlulb59.R.inc(847);this.entries = entries;
    }finally{__CLR4_5_2nenelvlulb59.R.flushNeeded();}}

    protected long getContentSize() {try{__CLR4_5_2nenelvlulb59.R.inc(848);
        __CLR4_5_2nenelvlulb59.R.inc(849);long contentSize = 8;
        __CLR4_5_2nenelvlulb59.R.inc(850);if ((((getVersion() == 1)&&(__CLR4_5_2nenelvlulb59.R.iget(851)!=0|true))||(__CLR4_5_2nenelvlulb59.R.iget(852)==0&false))) {{
            __CLR4_5_2nenelvlulb59.R.inc(853);contentSize += entries.size() * 20;
        } }else {{
            __CLR4_5_2nenelvlulb59.R.inc(854);contentSize += entries.size() * 12;
        }

        }__CLR4_5_2nenelvlulb59.R.inc(855);return contentSize;
    }finally{__CLR4_5_2nenelvlulb59.R.flushNeeded();}}

    @Override
    public void _parseDetails(ByteBuffer content) {try{__CLR4_5_2nenelvlulb59.R.inc(856);
        __CLR4_5_2nenelvlulb59.R.inc(857);parseVersionAndFlags(content);
        __CLR4_5_2nenelvlulb59.R.inc(858);int entryCount = l2i(IsoTypeReader.readUInt32(content));
        __CLR4_5_2nenelvlulb59.R.inc(859);entries = new LinkedList<Entry>();
        __CLR4_5_2nenelvlulb59.R.inc(860);for (int i = 0; (((i < entryCount)&&(__CLR4_5_2nenelvlulb59.R.iget(861)!=0|true))||(__CLR4_5_2nenelvlulb59.R.iget(862)==0&false)); i++) {{
            __CLR4_5_2nenelvlulb59.R.inc(863);entries.add(new Entry(this, content));

        }
    }}finally{__CLR4_5_2nenelvlulb59.R.flushNeeded();}}

    @Override
    protected void getContent(ByteBuffer byteBuffer) {try{__CLR4_5_2nenelvlulb59.R.inc(864);
        __CLR4_5_2nenelvlulb59.R.inc(865);writeVersionAndFlags(byteBuffer);
        __CLR4_5_2nenelvlulb59.R.inc(866);IsoTypeWriter.writeUInt32(byteBuffer, entries.size());
        __CLR4_5_2nenelvlulb59.R.inc(867);for (Entry entry : entries) {{
            __CLR4_5_2nenelvlulb59.R.inc(868);entry.getContent(byteBuffer);
        }
    }}finally{__CLR4_5_2nenelvlulb59.R.flushNeeded();}}

    @Override
    public String toString() {try{__CLR4_5_2nenelvlulb59.R.inc(869);
        __CLR4_5_2nenelvlulb59.R.inc(870);return "EditListBox{" +
                "entries=" + entries +
                '}';
    }finally{__CLR4_5_2nenelvlulb59.R.flushNeeded();}}

    public static class Entry {
        EditListBox editListBox;
        private long segmentDuration;
        private long mediaTime;
        private double mediaRate;

        /**
         * Creates a new <code>Entry</code> with all values set.
         *
         * @param editListBox parent <code>EditListBox</code>
         * @param segmentDuration duration in movie timescale
         * @param mediaTime       starting time
         * @param mediaRate       relative play rate
         */
        public Entry(EditListBox editListBox, long segmentDuration, long mediaTime, double mediaRate) {try{__CLR4_5_2nenelvlulb59.R.inc(871);
            __CLR4_5_2nenelvlulb59.R.inc(872);this.segmentDuration = segmentDuration;
            __CLR4_5_2nenelvlulb59.R.inc(873);this.mediaTime = mediaTime;
            __CLR4_5_2nenelvlulb59.R.inc(874);this.mediaRate = mediaRate;
            __CLR4_5_2nenelvlulb59.R.inc(875);this.editListBox = editListBox;
        }finally{__CLR4_5_2nenelvlulb59.R.flushNeeded();}}

        public Entry(EditListBox editListBox, ByteBuffer bb) {try{__CLR4_5_2nenelvlulb59.R.inc(876);
            __CLR4_5_2nenelvlulb59.R.inc(877);if ((((editListBox.getVersion() == 1)&&(__CLR4_5_2nenelvlulb59.R.iget(878)!=0|true))||(__CLR4_5_2nenelvlulb59.R.iget(879)==0&false))) {{
                __CLR4_5_2nenelvlulb59.R.inc(880);segmentDuration = IsoTypeReader.readUInt64(bb);
                __CLR4_5_2nenelvlulb59.R.inc(881);mediaTime = bb.getLong();
                __CLR4_5_2nenelvlulb59.R.inc(882);mediaRate = IsoTypeReader.readFixedPoint1616(bb);
            } }else {{
                __CLR4_5_2nenelvlulb59.R.inc(883);segmentDuration = IsoTypeReader.readUInt32(bb);
                __CLR4_5_2nenelvlulb59.R.inc(884);mediaTime = bb.getInt();
                __CLR4_5_2nenelvlulb59.R.inc(885);mediaRate = IsoTypeReader.readFixedPoint1616(bb);
            }
            }__CLR4_5_2nenelvlulb59.R.inc(886);this.editListBox = editListBox;
        }finally{__CLR4_5_2nenelvlulb59.R.flushNeeded();}}

        /**
         * The segment duration is an integer that specifies the duration
         * of this edit segment in units of the timescale in the Movie
         * Header Box
         *
         * @return segment duration in movie timescale
         */
        public long getSegmentDuration() {try{__CLR4_5_2nenelvlulb59.R.inc(887);
            __CLR4_5_2nenelvlulb59.R.inc(888);return segmentDuration;
        }finally{__CLR4_5_2nenelvlulb59.R.flushNeeded();}}

        /**
         * The segment duration is an integer that specifies the duration
         * of this edit segment in units of the timescale in the Movie
         * Header Box
         *
         * @param segmentDuration new segment duration in movie timescale
         */
        public void setSegmentDuration(long segmentDuration) {try{__CLR4_5_2nenelvlulb59.R.inc(889);
            __CLR4_5_2nenelvlulb59.R.inc(890);this.segmentDuration = segmentDuration;
        }finally{__CLR4_5_2nenelvlulb59.R.flushNeeded();}}

        /**
         * The media time is an integer containing the starting time
         * within the media of a specific edit segment(in media time
         * scale units, in composition time)
         *
         * @return starting time
         */
        public long getMediaTime() {try{__CLR4_5_2nenelvlulb59.R.inc(891);
            __CLR4_5_2nenelvlulb59.R.inc(892);return mediaTime;
        }finally{__CLR4_5_2nenelvlulb59.R.flushNeeded();}}

        /**
         * The media time is an integer containing the starting time
         * within the media of a specific edit segment(in media time
         * scale units, in composition time)
         *
         * @param mediaTime starting time
         */
        public void setMediaTime(long mediaTime) {try{__CLR4_5_2nenelvlulb59.R.inc(893);
            __CLR4_5_2nenelvlulb59.R.inc(894);this.mediaTime = mediaTime;
        }finally{__CLR4_5_2nenelvlulb59.R.flushNeeded();}}

        /**
         * The media rate specifies the relative rate at which to play the
         * media corresponding to a specific edit segment.
         *
         * @return relative play rate
         */
        public double getMediaRate() {try{__CLR4_5_2nenelvlulb59.R.inc(895);
            __CLR4_5_2nenelvlulb59.R.inc(896);return mediaRate;
        }finally{__CLR4_5_2nenelvlulb59.R.flushNeeded();}}

        /**
         * The media rate specifies the relative rate at which to play the
         * media corresponding to a specific edit segment.
         *
         * @param mediaRate new relative play rate
         */
        public void setMediaRate(double mediaRate) {try{__CLR4_5_2nenelvlulb59.R.inc(897);
            __CLR4_5_2nenelvlulb59.R.inc(898);this.mediaRate = mediaRate;
        }finally{__CLR4_5_2nenelvlulb59.R.flushNeeded();}}

        @Override
        public boolean equals(Object o) {try{__CLR4_5_2nenelvlulb59.R.inc(899);
            __CLR4_5_2nenelvlulb59.R.inc(900);if ((((this == o)&&(__CLR4_5_2nenelvlulb59.R.iget(901)!=0|true))||(__CLR4_5_2nenelvlulb59.R.iget(902)==0&false))) {{
                __CLR4_5_2nenelvlulb59.R.inc(903);return true;
            }
            }__CLR4_5_2nenelvlulb59.R.inc(904);if ((((o == null || getClass() != o.getClass())&&(__CLR4_5_2nenelvlulb59.R.iget(905)!=0|true))||(__CLR4_5_2nenelvlulb59.R.iget(906)==0&false))) {{
                __CLR4_5_2nenelvlulb59.R.inc(907);return false;
            }

            }__CLR4_5_2nenelvlulb59.R.inc(908);Entry entry = (Entry) o;

            __CLR4_5_2nenelvlulb59.R.inc(909);if ((((mediaTime != entry.mediaTime)&&(__CLR4_5_2nenelvlulb59.R.iget(910)!=0|true))||(__CLR4_5_2nenelvlulb59.R.iget(911)==0&false))) {{
                __CLR4_5_2nenelvlulb59.R.inc(912);return false;
            }
            }__CLR4_5_2nenelvlulb59.R.inc(913);if ((((segmentDuration != entry.segmentDuration)&&(__CLR4_5_2nenelvlulb59.R.iget(914)!=0|true))||(__CLR4_5_2nenelvlulb59.R.iget(915)==0&false))) {{
                __CLR4_5_2nenelvlulb59.R.inc(916);return false;
            }

            }__CLR4_5_2nenelvlulb59.R.inc(917);return true;
        }finally{__CLR4_5_2nenelvlulb59.R.flushNeeded();}}

        @Override
        public int hashCode() {try{__CLR4_5_2nenelvlulb59.R.inc(918);
            __CLR4_5_2nenelvlulb59.R.inc(919);int result = (int) (segmentDuration ^ (segmentDuration >>> 32));
            __CLR4_5_2nenelvlulb59.R.inc(920);result = 31 * result + (int) (mediaTime ^ (mediaTime >>> 32));
            __CLR4_5_2nenelvlulb59.R.inc(921);return result;
        }finally{__CLR4_5_2nenelvlulb59.R.flushNeeded();}}

        public void getContent(ByteBuffer bb) {try{__CLR4_5_2nenelvlulb59.R.inc(922);
            __CLR4_5_2nenelvlulb59.R.inc(923);if ((((editListBox.getVersion() == 1)&&(__CLR4_5_2nenelvlulb59.R.iget(924)!=0|true))||(__CLR4_5_2nenelvlulb59.R.iget(925)==0&false))) {{
                __CLR4_5_2nenelvlulb59.R.inc(926);IsoTypeWriter.writeUInt64(bb, segmentDuration);
                __CLR4_5_2nenelvlulb59.R.inc(927);bb.putLong(mediaTime);
            } }else {{
                __CLR4_5_2nenelvlulb59.R.inc(928);IsoTypeWriter.writeUInt32(bb, l2i(segmentDuration));
                __CLR4_5_2nenelvlulb59.R.inc(929);bb.putInt(l2i(mediaTime));
            }
            }__CLR4_5_2nenelvlulb59.R.inc(930);IsoTypeWriter.writeFixedPoint1616(bb, mediaRate);
        }finally{__CLR4_5_2nenelvlulb59.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_5_2nenelvlulb59.R.inc(931);
            __CLR4_5_2nenelvlulb59.R.inc(932);return "Entry{" +
                    "segmentDuration=" + segmentDuration +
                    ", mediaTime=" + mediaTime +
                    ", mediaRate=" + mediaRate +
                    '}';
        }finally{__CLR4_5_2nenelvlulb59.R.flushNeeded();}}
    }
}
