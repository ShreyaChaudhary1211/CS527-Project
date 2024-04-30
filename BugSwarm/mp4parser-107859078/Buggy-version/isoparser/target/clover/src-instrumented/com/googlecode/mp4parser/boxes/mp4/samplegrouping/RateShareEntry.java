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
public class RateShareEntry extends GroupEntry {public static class __CLR4_5_2dq2dq2lvl9ekkg{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0030\u0037\u0038\u0035\u0039\u0030\u0037\u0038\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714413275835L,8589935092L,17926,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static final String TYPE = "rash";

    private short operationPointCut;
    private short targetRateShare;
    private List<Entry> entries = new LinkedList<Entry>();
    private int maximumBitrate;
    private int minimumBitrate;
    private short discardPriority;

    @Override
    public String getType() {try{__CLR4_5_2dq2dq2lvl9ekkg.R.inc(17786);
        __CLR4_5_2dq2dq2lvl9ekkg.R.inc(17787);return TYPE;
    }finally{__CLR4_5_2dq2dq2lvl9ekkg.R.flushNeeded();}}

    @Override
    public void parse(ByteBuffer byteBuffer) {try{__CLR4_5_2dq2dq2lvl9ekkg.R.inc(17788);
        __CLR4_5_2dq2dq2lvl9ekkg.R.inc(17789);operationPointCut = byteBuffer.getShort();
        __CLR4_5_2dq2dq2lvl9ekkg.R.inc(17790);if ((((operationPointCut == 1)&&(__CLR4_5_2dq2dq2lvl9ekkg.R.iget(17791)!=0|true))||(__CLR4_5_2dq2dq2lvl9ekkg.R.iget(17792)==0&false))) {{
            __CLR4_5_2dq2dq2lvl9ekkg.R.inc(17793);targetRateShare = byteBuffer.getShort();
        } }else {{
            __CLR4_5_2dq2dq2lvl9ekkg.R.inc(17794);int entriesLeft = operationPointCut;
            __CLR4_5_2dq2dq2lvl9ekkg.R.inc(17795);while ((((entriesLeft-- > 0)&&(__CLR4_5_2dq2dq2lvl9ekkg.R.iget(17796)!=0|true))||(__CLR4_5_2dq2dq2lvl9ekkg.R.iget(17797)==0&false))) {{
                __CLR4_5_2dq2dq2lvl9ekkg.R.inc(17798);entries.add(new Entry(l2i(IsoTypeReader.readUInt32(byteBuffer)), byteBuffer.getShort()));
            }
        }}
        }__CLR4_5_2dq2dq2lvl9ekkg.R.inc(17799);maximumBitrate = l2i(IsoTypeReader.readUInt32(byteBuffer));
        __CLR4_5_2dq2dq2lvl9ekkg.R.inc(17800);minimumBitrate = l2i(IsoTypeReader.readUInt32(byteBuffer));
        __CLR4_5_2dq2dq2lvl9ekkg.R.inc(17801);discardPriority = (short) IsoTypeReader.readUInt8(byteBuffer);
    }finally{__CLR4_5_2dq2dq2lvl9ekkg.R.flushNeeded();}}

    @Override
    public ByteBuffer get() {try{__CLR4_5_2dq2dq2lvl9ekkg.R.inc(17802);
        __CLR4_5_2dq2dq2lvl9ekkg.R.inc(17803);ByteBuffer buf = ByteBuffer.allocate((((operationPointCut == 1 )&&(__CLR4_5_2dq2dq2lvl9ekkg.R.iget(17804)!=0|true))||(__CLR4_5_2dq2dq2lvl9ekkg.R.iget(17805)==0&false))? 13 : (operationPointCut * 6 + 11));
        __CLR4_5_2dq2dq2lvl9ekkg.R.inc(17806);buf.putShort(operationPointCut);
        __CLR4_5_2dq2dq2lvl9ekkg.R.inc(17807);if ((((operationPointCut == 1)&&(__CLR4_5_2dq2dq2lvl9ekkg.R.iget(17808)!=0|true))||(__CLR4_5_2dq2dq2lvl9ekkg.R.iget(17809)==0&false))) {{
            __CLR4_5_2dq2dq2lvl9ekkg.R.inc(17810);buf.putShort(targetRateShare);
        } }else {{
            __CLR4_5_2dq2dq2lvl9ekkg.R.inc(17811);for (Entry entry : entries) {{
                __CLR4_5_2dq2dq2lvl9ekkg.R.inc(17812);buf.putInt(entry.getAvailableBitrate());
                __CLR4_5_2dq2dq2lvl9ekkg.R.inc(17813);buf.putShort(entry.getTargetRateShare());
            }
        }}
        }__CLR4_5_2dq2dq2lvl9ekkg.R.inc(17814);buf.putInt(maximumBitrate);
        __CLR4_5_2dq2dq2lvl9ekkg.R.inc(17815);buf.putInt(minimumBitrate);
        __CLR4_5_2dq2dq2lvl9ekkg.R.inc(17816);IsoTypeWriter.writeUInt8(buf, discardPriority);
        __CLR4_5_2dq2dq2lvl9ekkg.R.inc(17817);buf.rewind();
        __CLR4_5_2dq2dq2lvl9ekkg.R.inc(17818);return buf;
    }finally{__CLR4_5_2dq2dq2lvl9ekkg.R.flushNeeded();}}

    @Override
    public boolean equals(Object o) {try{__CLR4_5_2dq2dq2lvl9ekkg.R.inc(17819);
        __CLR4_5_2dq2dq2lvl9ekkg.R.inc(17820);if ((((this == o)&&(__CLR4_5_2dq2dq2lvl9ekkg.R.iget(17821)!=0|true))||(__CLR4_5_2dq2dq2lvl9ekkg.R.iget(17822)==0&false))) {{
            __CLR4_5_2dq2dq2lvl9ekkg.R.inc(17823);return true;
        }
        }__CLR4_5_2dq2dq2lvl9ekkg.R.inc(17824);if ((((o == null || getClass() != o.getClass())&&(__CLR4_5_2dq2dq2lvl9ekkg.R.iget(17825)!=0|true))||(__CLR4_5_2dq2dq2lvl9ekkg.R.iget(17826)==0&false))) {{
            __CLR4_5_2dq2dq2lvl9ekkg.R.inc(17827);return false;
        }

        }__CLR4_5_2dq2dq2lvl9ekkg.R.inc(17828);RateShareEntry that = (RateShareEntry) o;

        __CLR4_5_2dq2dq2lvl9ekkg.R.inc(17829);if ((((discardPriority != that.discardPriority)&&(__CLR4_5_2dq2dq2lvl9ekkg.R.iget(17830)!=0|true))||(__CLR4_5_2dq2dq2lvl9ekkg.R.iget(17831)==0&false))) {{
            __CLR4_5_2dq2dq2lvl9ekkg.R.inc(17832);return false;
        }
        }__CLR4_5_2dq2dq2lvl9ekkg.R.inc(17833);if ((((maximumBitrate != that.maximumBitrate)&&(__CLR4_5_2dq2dq2lvl9ekkg.R.iget(17834)!=0|true))||(__CLR4_5_2dq2dq2lvl9ekkg.R.iget(17835)==0&false))) {{
            __CLR4_5_2dq2dq2lvl9ekkg.R.inc(17836);return false;
        }
        }__CLR4_5_2dq2dq2lvl9ekkg.R.inc(17837);if ((((minimumBitrate != that.minimumBitrate)&&(__CLR4_5_2dq2dq2lvl9ekkg.R.iget(17838)!=0|true))||(__CLR4_5_2dq2dq2lvl9ekkg.R.iget(17839)==0&false))) {{
            __CLR4_5_2dq2dq2lvl9ekkg.R.inc(17840);return false;
        }
        }__CLR4_5_2dq2dq2lvl9ekkg.R.inc(17841);if ((((operationPointCut != that.operationPointCut)&&(__CLR4_5_2dq2dq2lvl9ekkg.R.iget(17842)!=0|true))||(__CLR4_5_2dq2dq2lvl9ekkg.R.iget(17843)==0&false))) {{
            __CLR4_5_2dq2dq2lvl9ekkg.R.inc(17844);return false;
        }
        }__CLR4_5_2dq2dq2lvl9ekkg.R.inc(17845);if ((((targetRateShare != that.targetRateShare)&&(__CLR4_5_2dq2dq2lvl9ekkg.R.iget(17846)!=0|true))||(__CLR4_5_2dq2dq2lvl9ekkg.R.iget(17847)==0&false))) {{
            __CLR4_5_2dq2dq2lvl9ekkg.R.inc(17848);return false;
        }
        }__CLR4_5_2dq2dq2lvl9ekkg.R.inc(17849);if (((((((entries != null )&&(__CLR4_5_2dq2dq2lvl9ekkg.R.iget(17850)!=0|true))||(__CLR4_5_2dq2dq2lvl9ekkg.R.iget(17851)==0&false))? !entries.equals(that.entries) : that.entries != null)&&(__CLR4_5_2dq2dq2lvl9ekkg.R.iget(17852)!=0|true))||(__CLR4_5_2dq2dq2lvl9ekkg.R.iget(17853)==0&false))) {{
            __CLR4_5_2dq2dq2lvl9ekkg.R.inc(17854);return false;
        }

        }__CLR4_5_2dq2dq2lvl9ekkg.R.inc(17855);return true;
    }finally{__CLR4_5_2dq2dq2lvl9ekkg.R.flushNeeded();}}

    @Override
    public int hashCode() {try{__CLR4_5_2dq2dq2lvl9ekkg.R.inc(17856);
        __CLR4_5_2dq2dq2lvl9ekkg.R.inc(17857);int result = (int) operationPointCut;
        __CLR4_5_2dq2dq2lvl9ekkg.R.inc(17858);result = 31 * result + (int) targetRateShare;
        __CLR4_5_2dq2dq2lvl9ekkg.R.inc(17859);result = 31 * result + ((((entries != null )&&(__CLR4_5_2dq2dq2lvl9ekkg.R.iget(17860)!=0|true))||(__CLR4_5_2dq2dq2lvl9ekkg.R.iget(17861)==0&false))? entries.hashCode() : 0);
        __CLR4_5_2dq2dq2lvl9ekkg.R.inc(17862);result = 31 * result + maximumBitrate;
        __CLR4_5_2dq2dq2lvl9ekkg.R.inc(17863);result = 31 * result + minimumBitrate;
        __CLR4_5_2dq2dq2lvl9ekkg.R.inc(17864);result = 31 * result + (int) discardPriority;
        __CLR4_5_2dq2dq2lvl9ekkg.R.inc(17865);return result;
    }finally{__CLR4_5_2dq2dq2lvl9ekkg.R.flushNeeded();}}

    public short getOperationPointCut() {try{__CLR4_5_2dq2dq2lvl9ekkg.R.inc(17866);
        __CLR4_5_2dq2dq2lvl9ekkg.R.inc(17867);return operationPointCut;
    }finally{__CLR4_5_2dq2dq2lvl9ekkg.R.flushNeeded();}}

    public void setOperationPointCut(short operationPointCut) {try{__CLR4_5_2dq2dq2lvl9ekkg.R.inc(17868);
        __CLR4_5_2dq2dq2lvl9ekkg.R.inc(17869);this.operationPointCut = operationPointCut;
    }finally{__CLR4_5_2dq2dq2lvl9ekkg.R.flushNeeded();}}

    public short getTargetRateShare() {try{__CLR4_5_2dq2dq2lvl9ekkg.R.inc(17870);
        __CLR4_5_2dq2dq2lvl9ekkg.R.inc(17871);return targetRateShare;
    }finally{__CLR4_5_2dq2dq2lvl9ekkg.R.flushNeeded();}}

    public void setTargetRateShare(short targetRateShare) {try{__CLR4_5_2dq2dq2lvl9ekkg.R.inc(17872);
        __CLR4_5_2dq2dq2lvl9ekkg.R.inc(17873);this.targetRateShare = targetRateShare;
    }finally{__CLR4_5_2dq2dq2lvl9ekkg.R.flushNeeded();}}

    public List<Entry> getEntries() {try{__CLR4_5_2dq2dq2lvl9ekkg.R.inc(17874);
        __CLR4_5_2dq2dq2lvl9ekkg.R.inc(17875);return entries;
    }finally{__CLR4_5_2dq2dq2lvl9ekkg.R.flushNeeded();}}

    public void setEntries(List<Entry> entries) {try{__CLR4_5_2dq2dq2lvl9ekkg.R.inc(17876);
        __CLR4_5_2dq2dq2lvl9ekkg.R.inc(17877);this.entries = entries;
    }finally{__CLR4_5_2dq2dq2lvl9ekkg.R.flushNeeded();}}

    public int getMaximumBitrate() {try{__CLR4_5_2dq2dq2lvl9ekkg.R.inc(17878);
        __CLR4_5_2dq2dq2lvl9ekkg.R.inc(17879);return maximumBitrate;
    }finally{__CLR4_5_2dq2dq2lvl9ekkg.R.flushNeeded();}}

    public void setMaximumBitrate(int maximumBitrate) {try{__CLR4_5_2dq2dq2lvl9ekkg.R.inc(17880);
        __CLR4_5_2dq2dq2lvl9ekkg.R.inc(17881);this.maximumBitrate = maximumBitrate;
    }finally{__CLR4_5_2dq2dq2lvl9ekkg.R.flushNeeded();}}

    public int getMinimumBitrate() {try{__CLR4_5_2dq2dq2lvl9ekkg.R.inc(17882);
        __CLR4_5_2dq2dq2lvl9ekkg.R.inc(17883);return minimumBitrate;
    }finally{__CLR4_5_2dq2dq2lvl9ekkg.R.flushNeeded();}}

    public void setMinimumBitrate(int minimumBitrate) {try{__CLR4_5_2dq2dq2lvl9ekkg.R.inc(17884);
        __CLR4_5_2dq2dq2lvl9ekkg.R.inc(17885);this.minimumBitrate = minimumBitrate;
    }finally{__CLR4_5_2dq2dq2lvl9ekkg.R.flushNeeded();}}

    public short getDiscardPriority() {try{__CLR4_5_2dq2dq2lvl9ekkg.R.inc(17886);
        __CLR4_5_2dq2dq2lvl9ekkg.R.inc(17887);return discardPriority;
    }finally{__CLR4_5_2dq2dq2lvl9ekkg.R.flushNeeded();}}

    public void setDiscardPriority(short discardPriority) {try{__CLR4_5_2dq2dq2lvl9ekkg.R.inc(17888);
        __CLR4_5_2dq2dq2lvl9ekkg.R.inc(17889);this.discardPriority = discardPriority;
    }finally{__CLR4_5_2dq2dq2lvl9ekkg.R.flushNeeded();}}

    public static class Entry {
        int availableBitrate;
        short targetRateShare;

        public Entry(int availableBitrate, short targetRateShare) {try{__CLR4_5_2dq2dq2lvl9ekkg.R.inc(17890);
            __CLR4_5_2dq2dq2lvl9ekkg.R.inc(17891);this.availableBitrate = availableBitrate;
            __CLR4_5_2dq2dq2lvl9ekkg.R.inc(17892);this.targetRateShare = targetRateShare;
        }finally{__CLR4_5_2dq2dq2lvl9ekkg.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_5_2dq2dq2lvl9ekkg.R.inc(17893);
            __CLR4_5_2dq2dq2lvl9ekkg.R.inc(17894);return "{" +
                    "availableBitrate=" + availableBitrate +
                    ", targetRateShare=" + targetRateShare +
                    '}';
        }finally{__CLR4_5_2dq2dq2lvl9ekkg.R.flushNeeded();}}

        public int getAvailableBitrate() {try{__CLR4_5_2dq2dq2lvl9ekkg.R.inc(17895);
            __CLR4_5_2dq2dq2lvl9ekkg.R.inc(17896);return availableBitrate;
        }finally{__CLR4_5_2dq2dq2lvl9ekkg.R.flushNeeded();}}

        public void setAvailableBitrate(int availableBitrate) {try{__CLR4_5_2dq2dq2lvl9ekkg.R.inc(17897);
            __CLR4_5_2dq2dq2lvl9ekkg.R.inc(17898);this.availableBitrate = availableBitrate;
        }finally{__CLR4_5_2dq2dq2lvl9ekkg.R.flushNeeded();}}

        public short getTargetRateShare() {try{__CLR4_5_2dq2dq2lvl9ekkg.R.inc(17899);
            __CLR4_5_2dq2dq2lvl9ekkg.R.inc(17900);return targetRateShare;
        }finally{__CLR4_5_2dq2dq2lvl9ekkg.R.flushNeeded();}}

        public void setTargetRateShare(short targetRateShare) {try{__CLR4_5_2dq2dq2lvl9ekkg.R.inc(17901);
            __CLR4_5_2dq2dq2lvl9ekkg.R.inc(17902);this.targetRateShare = targetRateShare;
        }finally{__CLR4_5_2dq2dq2lvl9ekkg.R.flushNeeded();}}

        @Override
        public boolean equals(Object o) {try{__CLR4_5_2dq2dq2lvl9ekkg.R.inc(17903);
            __CLR4_5_2dq2dq2lvl9ekkg.R.inc(17904);if ((((this == o)&&(__CLR4_5_2dq2dq2lvl9ekkg.R.iget(17905)!=0|true))||(__CLR4_5_2dq2dq2lvl9ekkg.R.iget(17906)==0&false))) {{
                __CLR4_5_2dq2dq2lvl9ekkg.R.inc(17907);return true;
            }
            }__CLR4_5_2dq2dq2lvl9ekkg.R.inc(17908);if ((((o == null || getClass() != o.getClass())&&(__CLR4_5_2dq2dq2lvl9ekkg.R.iget(17909)!=0|true))||(__CLR4_5_2dq2dq2lvl9ekkg.R.iget(17910)==0&false))) {{
                __CLR4_5_2dq2dq2lvl9ekkg.R.inc(17911);return false;
            }

            }__CLR4_5_2dq2dq2lvl9ekkg.R.inc(17912);Entry entry = (Entry) o;

            __CLR4_5_2dq2dq2lvl9ekkg.R.inc(17913);if ((((availableBitrate != entry.availableBitrate)&&(__CLR4_5_2dq2dq2lvl9ekkg.R.iget(17914)!=0|true))||(__CLR4_5_2dq2dq2lvl9ekkg.R.iget(17915)==0&false))) {{
                __CLR4_5_2dq2dq2lvl9ekkg.R.inc(17916);return false;
            }
            }__CLR4_5_2dq2dq2lvl9ekkg.R.inc(17917);if ((((targetRateShare != entry.targetRateShare)&&(__CLR4_5_2dq2dq2lvl9ekkg.R.iget(17918)!=0|true))||(__CLR4_5_2dq2dq2lvl9ekkg.R.iget(17919)==0&false))) {{
                __CLR4_5_2dq2dq2lvl9ekkg.R.inc(17920);return false;
            }

            }__CLR4_5_2dq2dq2lvl9ekkg.R.inc(17921);return true;
        }finally{__CLR4_5_2dq2dq2lvl9ekkg.R.flushNeeded();}}

        @Override
        public int hashCode() {try{__CLR4_5_2dq2dq2lvl9ekkg.R.inc(17922);
            __CLR4_5_2dq2dq2lvl9ekkg.R.inc(17923);int result = availableBitrate;
            __CLR4_5_2dq2dq2lvl9ekkg.R.inc(17924);result = 31 * result + (int) targetRateShare;
            __CLR4_5_2dq2dq2lvl9ekkg.R.inc(17925);return result;
        }finally{__CLR4_5_2dq2dq2lvl9ekkg.R.flushNeeded();}}
    }
}
