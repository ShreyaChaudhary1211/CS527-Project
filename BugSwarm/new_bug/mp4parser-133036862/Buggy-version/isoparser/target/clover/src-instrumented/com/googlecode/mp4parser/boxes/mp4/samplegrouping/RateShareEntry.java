/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2012 castLabs, Berlin
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


package com.googlecode.mp4parser.boxes.mp4.samplegrouping;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;

import java.nio.ByteBuffer;
import java.util.LinkedList;
import java.util.List;

import static com.googlecode.mp4parser.util.CastUtils.l2i;

/**
 * <h1>4cc = "{@value #TYPE}"</h1>
 * <p>Each sample of a track may be associated to (zero or) one of a number of sample group descriptions, each of
 * which defines a record of rate-share information. Typically the same rate-share information applies to many
 * consecutive samples and it may therefore be enough to define two or three sample group descriptions that
 * can be used at different time intervals.</p>
 * <p>The grouping type 'rash' (short for rate share) is defined as the grouping criterion for rate share information.
 * Zero or one sample-to-group box ('sbgp') for the grouping type 'rash' can be contained in the sample
 * table box ('stbl') of a track. It shall reside in a hint track, if a hint track is used, otherwise in a media track.</p>
 * <p>Target rate share may be specified for several operation points that are defined in terms of the total available
 * bitrate, i.e., the bitrate that should be shared. If only one operation point is defined, the target rate share
 * applies to all available bitrates. If several operation points are defined, then each operation point specifies a
 * target rate share. Target rate share values specified for the first and the last operation points also specify the
 * target rate share values at lower and higher available bitrates, respectively. The target rate share between two
 * operation points is specified to be in the range between the target rate shares of those operation points. One
 * possibility is to estimate with linear interpolation.</p>
 */
public class RateShareEntry extends GroupEntry {public static class __CLR4_5_2dspdsplvlulmok{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0033\u0033\u0030\u0033\u0036\u0038\u0036\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714448869219L,8589935092L,18021,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static final String TYPE = "rash";

    private short operationPointCut;
    private short targetRateShare;
    private List<Entry> entries = new LinkedList<Entry>();
    private int maximumBitrate;
    private int minimumBitrate;
    private short discardPriority;

    @Override
    public String getType() {try{__CLR4_5_2dspdsplvlulmok.R.inc(17881);
        __CLR4_5_2dspdsplvlulmok.R.inc(17882);return TYPE;
    }finally{__CLR4_5_2dspdsplvlulmok.R.flushNeeded();}}

    @Override
    public void parse(ByteBuffer byteBuffer) {try{__CLR4_5_2dspdsplvlulmok.R.inc(17883);
        __CLR4_5_2dspdsplvlulmok.R.inc(17884);operationPointCut = byteBuffer.getShort();
        __CLR4_5_2dspdsplvlulmok.R.inc(17885);if ((((operationPointCut == 1)&&(__CLR4_5_2dspdsplvlulmok.R.iget(17886)!=0|true))||(__CLR4_5_2dspdsplvlulmok.R.iget(17887)==0&false))) {{
            __CLR4_5_2dspdsplvlulmok.R.inc(17888);targetRateShare = byteBuffer.getShort();
        } }else {{
            __CLR4_5_2dspdsplvlulmok.R.inc(17889);int entriesLeft = operationPointCut;
            __CLR4_5_2dspdsplvlulmok.R.inc(17890);while ((((entriesLeft-- > 0)&&(__CLR4_5_2dspdsplvlulmok.R.iget(17891)!=0|true))||(__CLR4_5_2dspdsplvlulmok.R.iget(17892)==0&false))) {{
                __CLR4_5_2dspdsplvlulmok.R.inc(17893);entries.add(new Entry(l2i(IsoTypeReader.readUInt32(byteBuffer)), byteBuffer.getShort()));
            }
        }}
        }__CLR4_5_2dspdsplvlulmok.R.inc(17894);maximumBitrate = l2i(IsoTypeReader.readUInt32(byteBuffer));
        __CLR4_5_2dspdsplvlulmok.R.inc(17895);minimumBitrate = l2i(IsoTypeReader.readUInt32(byteBuffer));
        __CLR4_5_2dspdsplvlulmok.R.inc(17896);discardPriority = (short) IsoTypeReader.readUInt8(byteBuffer);
    }finally{__CLR4_5_2dspdsplvlulmok.R.flushNeeded();}}

    @Override
    public ByteBuffer get() {try{__CLR4_5_2dspdsplvlulmok.R.inc(17897);
        __CLR4_5_2dspdsplvlulmok.R.inc(17898);ByteBuffer buf = ByteBuffer.allocate((((operationPointCut == 1 )&&(__CLR4_5_2dspdsplvlulmok.R.iget(17899)!=0|true))||(__CLR4_5_2dspdsplvlulmok.R.iget(17900)==0&false))? 13 : (operationPointCut * 6 + 11));
        __CLR4_5_2dspdsplvlulmok.R.inc(17901);buf.putShort(operationPointCut);
        __CLR4_5_2dspdsplvlulmok.R.inc(17902);if ((((operationPointCut == 1)&&(__CLR4_5_2dspdsplvlulmok.R.iget(17903)!=0|true))||(__CLR4_5_2dspdsplvlulmok.R.iget(17904)==0&false))) {{
            __CLR4_5_2dspdsplvlulmok.R.inc(17905);buf.putShort(targetRateShare);
        } }else {{
            __CLR4_5_2dspdsplvlulmok.R.inc(17906);for (Entry entry : entries) {{
                __CLR4_5_2dspdsplvlulmok.R.inc(17907);buf.putInt(entry.getAvailableBitrate());
                __CLR4_5_2dspdsplvlulmok.R.inc(17908);buf.putShort(entry.getTargetRateShare());
            }
        }}
        }__CLR4_5_2dspdsplvlulmok.R.inc(17909);buf.putInt(maximumBitrate);
        __CLR4_5_2dspdsplvlulmok.R.inc(17910);buf.putInt(minimumBitrate);
        __CLR4_5_2dspdsplvlulmok.R.inc(17911);IsoTypeWriter.writeUInt8(buf, discardPriority);
        __CLR4_5_2dspdsplvlulmok.R.inc(17912);buf.rewind();
        __CLR4_5_2dspdsplvlulmok.R.inc(17913);return buf;
    }finally{__CLR4_5_2dspdsplvlulmok.R.flushNeeded();}}

    @Override
    public boolean equals(Object o) {try{__CLR4_5_2dspdsplvlulmok.R.inc(17914);
        __CLR4_5_2dspdsplvlulmok.R.inc(17915);if ((((this == o)&&(__CLR4_5_2dspdsplvlulmok.R.iget(17916)!=0|true))||(__CLR4_5_2dspdsplvlulmok.R.iget(17917)==0&false))) {{
            __CLR4_5_2dspdsplvlulmok.R.inc(17918);return true;
        }
        }__CLR4_5_2dspdsplvlulmok.R.inc(17919);if ((((o == null || getClass() != o.getClass())&&(__CLR4_5_2dspdsplvlulmok.R.iget(17920)!=0|true))||(__CLR4_5_2dspdsplvlulmok.R.iget(17921)==0&false))) {{
            __CLR4_5_2dspdsplvlulmok.R.inc(17922);return false;
        }

        }__CLR4_5_2dspdsplvlulmok.R.inc(17923);RateShareEntry that = (RateShareEntry) o;

        __CLR4_5_2dspdsplvlulmok.R.inc(17924);if ((((discardPriority != that.discardPriority)&&(__CLR4_5_2dspdsplvlulmok.R.iget(17925)!=0|true))||(__CLR4_5_2dspdsplvlulmok.R.iget(17926)==0&false))) {{
            __CLR4_5_2dspdsplvlulmok.R.inc(17927);return false;
        }
        }__CLR4_5_2dspdsplvlulmok.R.inc(17928);if ((((maximumBitrate != that.maximumBitrate)&&(__CLR4_5_2dspdsplvlulmok.R.iget(17929)!=0|true))||(__CLR4_5_2dspdsplvlulmok.R.iget(17930)==0&false))) {{
            __CLR4_5_2dspdsplvlulmok.R.inc(17931);return false;
        }
        }__CLR4_5_2dspdsplvlulmok.R.inc(17932);if ((((minimumBitrate != that.minimumBitrate)&&(__CLR4_5_2dspdsplvlulmok.R.iget(17933)!=0|true))||(__CLR4_5_2dspdsplvlulmok.R.iget(17934)==0&false))) {{
            __CLR4_5_2dspdsplvlulmok.R.inc(17935);return false;
        }
        }__CLR4_5_2dspdsplvlulmok.R.inc(17936);if ((((operationPointCut != that.operationPointCut)&&(__CLR4_5_2dspdsplvlulmok.R.iget(17937)!=0|true))||(__CLR4_5_2dspdsplvlulmok.R.iget(17938)==0&false))) {{
            __CLR4_5_2dspdsplvlulmok.R.inc(17939);return false;
        }
        }__CLR4_5_2dspdsplvlulmok.R.inc(17940);if ((((targetRateShare != that.targetRateShare)&&(__CLR4_5_2dspdsplvlulmok.R.iget(17941)!=0|true))||(__CLR4_5_2dspdsplvlulmok.R.iget(17942)==0&false))) {{
            __CLR4_5_2dspdsplvlulmok.R.inc(17943);return false;
        }
        }__CLR4_5_2dspdsplvlulmok.R.inc(17944);if (((((((entries != null )&&(__CLR4_5_2dspdsplvlulmok.R.iget(17945)!=0|true))||(__CLR4_5_2dspdsplvlulmok.R.iget(17946)==0&false))? !entries.equals(that.entries) : that.entries != null)&&(__CLR4_5_2dspdsplvlulmok.R.iget(17947)!=0|true))||(__CLR4_5_2dspdsplvlulmok.R.iget(17948)==0&false))) {{
            __CLR4_5_2dspdsplvlulmok.R.inc(17949);return false;
        }

        }__CLR4_5_2dspdsplvlulmok.R.inc(17950);return true;
    }finally{__CLR4_5_2dspdsplvlulmok.R.flushNeeded();}}

    @Override
    public int hashCode() {try{__CLR4_5_2dspdsplvlulmok.R.inc(17951);
        __CLR4_5_2dspdsplvlulmok.R.inc(17952);int result = (int) operationPointCut;
        __CLR4_5_2dspdsplvlulmok.R.inc(17953);result = 31 * result + (int) targetRateShare;
        __CLR4_5_2dspdsplvlulmok.R.inc(17954);result = 31 * result + ((((entries != null )&&(__CLR4_5_2dspdsplvlulmok.R.iget(17955)!=0|true))||(__CLR4_5_2dspdsplvlulmok.R.iget(17956)==0&false))? entries.hashCode() : 0);
        __CLR4_5_2dspdsplvlulmok.R.inc(17957);result = 31 * result + maximumBitrate;
        __CLR4_5_2dspdsplvlulmok.R.inc(17958);result = 31 * result + minimumBitrate;
        __CLR4_5_2dspdsplvlulmok.R.inc(17959);result = 31 * result + (int) discardPriority;
        __CLR4_5_2dspdsplvlulmok.R.inc(17960);return result;
    }finally{__CLR4_5_2dspdsplvlulmok.R.flushNeeded();}}

    public short getOperationPointCut() {try{__CLR4_5_2dspdsplvlulmok.R.inc(17961);
        __CLR4_5_2dspdsplvlulmok.R.inc(17962);return operationPointCut;
    }finally{__CLR4_5_2dspdsplvlulmok.R.flushNeeded();}}

    public void setOperationPointCut(short operationPointCut) {try{__CLR4_5_2dspdsplvlulmok.R.inc(17963);
        __CLR4_5_2dspdsplvlulmok.R.inc(17964);this.operationPointCut = operationPointCut;
    }finally{__CLR4_5_2dspdsplvlulmok.R.flushNeeded();}}

    public short getTargetRateShare() {try{__CLR4_5_2dspdsplvlulmok.R.inc(17965);
        __CLR4_5_2dspdsplvlulmok.R.inc(17966);return targetRateShare;
    }finally{__CLR4_5_2dspdsplvlulmok.R.flushNeeded();}}

    public void setTargetRateShare(short targetRateShare) {try{__CLR4_5_2dspdsplvlulmok.R.inc(17967);
        __CLR4_5_2dspdsplvlulmok.R.inc(17968);this.targetRateShare = targetRateShare;
    }finally{__CLR4_5_2dspdsplvlulmok.R.flushNeeded();}}

    public List<Entry> getEntries() {try{__CLR4_5_2dspdsplvlulmok.R.inc(17969);
        __CLR4_5_2dspdsplvlulmok.R.inc(17970);return entries;
    }finally{__CLR4_5_2dspdsplvlulmok.R.flushNeeded();}}

    public void setEntries(List<Entry> entries) {try{__CLR4_5_2dspdsplvlulmok.R.inc(17971);
        __CLR4_5_2dspdsplvlulmok.R.inc(17972);this.entries = entries;
    }finally{__CLR4_5_2dspdsplvlulmok.R.flushNeeded();}}

    public int getMaximumBitrate() {try{__CLR4_5_2dspdsplvlulmok.R.inc(17973);
        __CLR4_5_2dspdsplvlulmok.R.inc(17974);return maximumBitrate;
    }finally{__CLR4_5_2dspdsplvlulmok.R.flushNeeded();}}

    public void setMaximumBitrate(int maximumBitrate) {try{__CLR4_5_2dspdsplvlulmok.R.inc(17975);
        __CLR4_5_2dspdsplvlulmok.R.inc(17976);this.maximumBitrate = maximumBitrate;
    }finally{__CLR4_5_2dspdsplvlulmok.R.flushNeeded();}}

    public int getMinimumBitrate() {try{__CLR4_5_2dspdsplvlulmok.R.inc(17977);
        __CLR4_5_2dspdsplvlulmok.R.inc(17978);return minimumBitrate;
    }finally{__CLR4_5_2dspdsplvlulmok.R.flushNeeded();}}

    public void setMinimumBitrate(int minimumBitrate) {try{__CLR4_5_2dspdsplvlulmok.R.inc(17979);
        __CLR4_5_2dspdsplvlulmok.R.inc(17980);this.minimumBitrate = minimumBitrate;
    }finally{__CLR4_5_2dspdsplvlulmok.R.flushNeeded();}}

    public short getDiscardPriority() {try{__CLR4_5_2dspdsplvlulmok.R.inc(17981);
        __CLR4_5_2dspdsplvlulmok.R.inc(17982);return discardPriority;
    }finally{__CLR4_5_2dspdsplvlulmok.R.flushNeeded();}}

    public void setDiscardPriority(short discardPriority) {try{__CLR4_5_2dspdsplvlulmok.R.inc(17983);
        __CLR4_5_2dspdsplvlulmok.R.inc(17984);this.discardPriority = discardPriority;
    }finally{__CLR4_5_2dspdsplvlulmok.R.flushNeeded();}}

    public static class Entry {
        int availableBitrate;
        short targetRateShare;

        public Entry(int availableBitrate, short targetRateShare) {try{__CLR4_5_2dspdsplvlulmok.R.inc(17985);
            __CLR4_5_2dspdsplvlulmok.R.inc(17986);this.availableBitrate = availableBitrate;
            __CLR4_5_2dspdsplvlulmok.R.inc(17987);this.targetRateShare = targetRateShare;
        }finally{__CLR4_5_2dspdsplvlulmok.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_5_2dspdsplvlulmok.R.inc(17988);
            __CLR4_5_2dspdsplvlulmok.R.inc(17989);return "{" +
                    "availableBitrate=" + availableBitrate +
                    ", targetRateShare=" + targetRateShare +
                    '}';
        }finally{__CLR4_5_2dspdsplvlulmok.R.flushNeeded();}}

        public int getAvailableBitrate() {try{__CLR4_5_2dspdsplvlulmok.R.inc(17990);
            __CLR4_5_2dspdsplvlulmok.R.inc(17991);return availableBitrate;
        }finally{__CLR4_5_2dspdsplvlulmok.R.flushNeeded();}}

        public void setAvailableBitrate(int availableBitrate) {try{__CLR4_5_2dspdsplvlulmok.R.inc(17992);
            __CLR4_5_2dspdsplvlulmok.R.inc(17993);this.availableBitrate = availableBitrate;
        }finally{__CLR4_5_2dspdsplvlulmok.R.flushNeeded();}}

        public short getTargetRateShare() {try{__CLR4_5_2dspdsplvlulmok.R.inc(17994);
            __CLR4_5_2dspdsplvlulmok.R.inc(17995);return targetRateShare;
        }finally{__CLR4_5_2dspdsplvlulmok.R.flushNeeded();}}

        public void setTargetRateShare(short targetRateShare) {try{__CLR4_5_2dspdsplvlulmok.R.inc(17996);
            __CLR4_5_2dspdsplvlulmok.R.inc(17997);this.targetRateShare = targetRateShare;
        }finally{__CLR4_5_2dspdsplvlulmok.R.flushNeeded();}}

        @Override
        public boolean equals(Object o) {try{__CLR4_5_2dspdsplvlulmok.R.inc(17998);
            __CLR4_5_2dspdsplvlulmok.R.inc(17999);if ((((this == o)&&(__CLR4_5_2dspdsplvlulmok.R.iget(18000)!=0|true))||(__CLR4_5_2dspdsplvlulmok.R.iget(18001)==0&false))) {{
                __CLR4_5_2dspdsplvlulmok.R.inc(18002);return true;
            }
            }__CLR4_5_2dspdsplvlulmok.R.inc(18003);if ((((o == null || getClass() != o.getClass())&&(__CLR4_5_2dspdsplvlulmok.R.iget(18004)!=0|true))||(__CLR4_5_2dspdsplvlulmok.R.iget(18005)==0&false))) {{
                __CLR4_5_2dspdsplvlulmok.R.inc(18006);return false;
            }

            }__CLR4_5_2dspdsplvlulmok.R.inc(18007);Entry entry = (Entry) o;

            __CLR4_5_2dspdsplvlulmok.R.inc(18008);if ((((availableBitrate != entry.availableBitrate)&&(__CLR4_5_2dspdsplvlulmok.R.iget(18009)!=0|true))||(__CLR4_5_2dspdsplvlulmok.R.iget(18010)==0&false))) {{
                __CLR4_5_2dspdsplvlulmok.R.inc(18011);return false;
            }
            }__CLR4_5_2dspdsplvlulmok.R.inc(18012);if ((((targetRateShare != entry.targetRateShare)&&(__CLR4_5_2dspdsplvlulmok.R.iget(18013)!=0|true))||(__CLR4_5_2dspdsplvlulmok.R.iget(18014)==0&false))) {{
                __CLR4_5_2dspdsplvlulmok.R.inc(18015);return false;
            }

            }__CLR4_5_2dspdsplvlulmok.R.inc(18016);return true;
        }finally{__CLR4_5_2dspdsplvlulmok.R.flushNeeded();}}

        @Override
        public int hashCode() {try{__CLR4_5_2dspdsplvlulmok.R.inc(18017);
            __CLR4_5_2dspdsplvlulmok.R.inc(18018);int result = availableBitrate;
            __CLR4_5_2dspdsplvlulmok.R.inc(18019);result = 31 * result + (int) targetRateShare;
            __CLR4_5_2dspdsplvlulmok.R.inc(18020);return result;
        }finally{__CLR4_5_2dspdsplvlulmok.R.flushNeeded();}}
    }
}
