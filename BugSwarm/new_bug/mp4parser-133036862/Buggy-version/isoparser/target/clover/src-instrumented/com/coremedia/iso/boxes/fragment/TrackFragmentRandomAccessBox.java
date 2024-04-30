/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2009 castLabs GmbH, Berlin
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

package com.coremedia.iso.boxes.fragment;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeReaderVariable;
import com.coremedia.iso.IsoTypeWriter;
import com.coremedia.iso.IsoTypeWriterVariable;
import com.googlecode.mp4parser.AbstractFullBox;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * <h1>4cc = "{@value #TYPE}"</h1>
 * <pre>
 * aligned(8) class TrackFragmentRandomAccessBox extends FullBox('tfra', version, 0) {
 *  unsigned int(32) track_ID;
 *  const unsigned int(26) reserved = 0;
 *  unsigned int(2) length_size_of_traf_num;
 *  unsigned int(2) length_size_of_trun_num;
 *  unsigned int(2) length_size_of_sample_num;
 *  unsigned int(32) number_of_entry;
 *  for(i=1; i &lt;= number_of_entry; i++){
 *   if(version==1){
 *    unsigned int(64) time;
 *    unsigned int(64) moof_offset;
 *   }else{
 *    unsigned int(32) time;
 *    unsigned int(32) moof_offset;
 *   }
 *  unsigned int((length_size_of_traf_num+1) * 8) traf_number;
 *  unsigned int((length_size_of_trun_num+1) * 8) trun_number;
 *  unsigned int((length_size_of_sample_num+1) * 8) sample_number;
 *  }
 * }
 * </pre>
 */
public class TrackFragmentRandomAccessBox extends AbstractFullBox {public static class __CLR4_5_22qo2qolvlulccl{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0033\u0033\u0030\u0033\u0036\u0038\u0036\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714448869219L,8589935092L,3705,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static final String TYPE = "tfra";

    private long trackId;
    private int reserved;
    private int lengthSizeOfTrafNum = 2;
    private int lengthSizeOfTrunNum = 2;
    private int lengthSizeOfSampleNum = 2;
    private List<Entry> entries = Collections.emptyList();

    public TrackFragmentRandomAccessBox() {
        super(TYPE);__CLR4_5_22qo2qolvlulccl.R.inc(3553);try{__CLR4_5_22qo2qolvlulccl.R.inc(3552);
    }finally{__CLR4_5_22qo2qolvlulccl.R.flushNeeded();}}


    protected long getContentSize() {try{__CLR4_5_22qo2qolvlulccl.R.inc(3554);
        __CLR4_5_22qo2qolvlulccl.R.inc(3555);long contentSize = 4;
        __CLR4_5_22qo2qolvlulccl.R.inc(3556);contentSize += 4 + 4 /*26 + 2 + 2 + 2 */ + 4;
        __CLR4_5_22qo2qolvlulccl.R.inc(3557);if ((((getVersion() == 1)&&(__CLR4_5_22qo2qolvlulccl.R.iget(3558)!=0|true))||(__CLR4_5_22qo2qolvlulccl.R.iget(3559)==0&false))) {{
            __CLR4_5_22qo2qolvlulccl.R.inc(3560);contentSize += (8 + 8) * entries.size();
        } }else {{
            __CLR4_5_22qo2qolvlulccl.R.inc(3561);contentSize += (4 + 4) * entries.size();
        }
        }__CLR4_5_22qo2qolvlulccl.R.inc(3562);contentSize += lengthSizeOfTrafNum * entries.size();
        __CLR4_5_22qo2qolvlulccl.R.inc(3563);contentSize += lengthSizeOfTrunNum * entries.size();
        __CLR4_5_22qo2qolvlulccl.R.inc(3564);contentSize += lengthSizeOfSampleNum * entries.size();
        __CLR4_5_22qo2qolvlulccl.R.inc(3565);return contentSize;
    }finally{__CLR4_5_22qo2qolvlulccl.R.flushNeeded();}}


    @Override
    public void _parseDetails(ByteBuffer content) {try{__CLR4_5_22qo2qolvlulccl.R.inc(3566);
        __CLR4_5_22qo2qolvlulccl.R.inc(3567);parseVersionAndFlags(content);
        __CLR4_5_22qo2qolvlulccl.R.inc(3568);trackId = IsoTypeReader.readUInt32(content);
        __CLR4_5_22qo2qolvlulccl.R.inc(3569);long temp = IsoTypeReader.readUInt32(content);
        __CLR4_5_22qo2qolvlulccl.R.inc(3570);reserved = (int) (temp >> 6);
        __CLR4_5_22qo2qolvlulccl.R.inc(3571);lengthSizeOfTrafNum = ((int) (temp & 0x3F) >> 4) + 1;
        __CLR4_5_22qo2qolvlulccl.R.inc(3572);lengthSizeOfTrunNum = ((int) (temp & 0xC) >> 2) + 1;
        __CLR4_5_22qo2qolvlulccl.R.inc(3573);lengthSizeOfSampleNum = ((int) (temp & 0x3)) + 1;
        __CLR4_5_22qo2qolvlulccl.R.inc(3574);long numberOfEntries = IsoTypeReader.readUInt32(content);

        __CLR4_5_22qo2qolvlulccl.R.inc(3575);entries = new ArrayList<Entry>();

        __CLR4_5_22qo2qolvlulccl.R.inc(3576);for (int i = 0; (((i < numberOfEntries)&&(__CLR4_5_22qo2qolvlulccl.R.iget(3577)!=0|true))||(__CLR4_5_22qo2qolvlulccl.R.iget(3578)==0&false)); i++) {{
            __CLR4_5_22qo2qolvlulccl.R.inc(3579);Entry entry = new Entry();
            __CLR4_5_22qo2qolvlulccl.R.inc(3580);if ((((getVersion() == 1)&&(__CLR4_5_22qo2qolvlulccl.R.iget(3581)!=0|true))||(__CLR4_5_22qo2qolvlulccl.R.iget(3582)==0&false))) {{
                __CLR4_5_22qo2qolvlulccl.R.inc(3583);entry.time = IsoTypeReader.readUInt64(content);
                __CLR4_5_22qo2qolvlulccl.R.inc(3584);entry.moofOffset = IsoTypeReader.readUInt64(content);
            } }else {{
                __CLR4_5_22qo2qolvlulccl.R.inc(3585);entry.time = IsoTypeReader.readUInt32(content);
                __CLR4_5_22qo2qolvlulccl.R.inc(3586);entry.moofOffset = IsoTypeReader.readUInt32(content);
            }
            }__CLR4_5_22qo2qolvlulccl.R.inc(3587);entry.trafNumber = IsoTypeReaderVariable.read(content, lengthSizeOfTrafNum);
            __CLR4_5_22qo2qolvlulccl.R.inc(3588);entry.trunNumber = IsoTypeReaderVariable.read(content, lengthSizeOfTrunNum);
            __CLR4_5_22qo2qolvlulccl.R.inc(3589);entry.sampleNumber = IsoTypeReaderVariable.read(content, lengthSizeOfSampleNum);

            __CLR4_5_22qo2qolvlulccl.R.inc(3590);entries.add(entry);
        }

    }}finally{__CLR4_5_22qo2qolvlulccl.R.flushNeeded();}}


    @Override
    protected void getContent(ByteBuffer byteBuffer) {try{__CLR4_5_22qo2qolvlulccl.R.inc(3591);
        __CLR4_5_22qo2qolvlulccl.R.inc(3592);writeVersionAndFlags(byteBuffer);
        __CLR4_5_22qo2qolvlulccl.R.inc(3593);IsoTypeWriter.writeUInt32(byteBuffer, trackId);
        __CLR4_5_22qo2qolvlulccl.R.inc(3594);long temp;
        __CLR4_5_22qo2qolvlulccl.R.inc(3595);temp = reserved << 6;
        __CLR4_5_22qo2qolvlulccl.R.inc(3596);temp = temp | (((lengthSizeOfTrafNum - 1) & 0x3) << 4);
        __CLR4_5_22qo2qolvlulccl.R.inc(3597);temp = temp | (((lengthSizeOfTrunNum - 1) & 0x3) << 2);
        __CLR4_5_22qo2qolvlulccl.R.inc(3598);temp = temp | ((lengthSizeOfSampleNum - 1) & 0x3);
        __CLR4_5_22qo2qolvlulccl.R.inc(3599);IsoTypeWriter.writeUInt32(byteBuffer, temp);
        __CLR4_5_22qo2qolvlulccl.R.inc(3600);IsoTypeWriter.writeUInt32(byteBuffer, entries.size());

        __CLR4_5_22qo2qolvlulccl.R.inc(3601);for (Entry entry : entries) {{
            __CLR4_5_22qo2qolvlulccl.R.inc(3602);if ((((getVersion() == 1)&&(__CLR4_5_22qo2qolvlulccl.R.iget(3603)!=0|true))||(__CLR4_5_22qo2qolvlulccl.R.iget(3604)==0&false))) {{
                __CLR4_5_22qo2qolvlulccl.R.inc(3605);IsoTypeWriter.writeUInt64(byteBuffer, entry.time);
                __CLR4_5_22qo2qolvlulccl.R.inc(3606);IsoTypeWriter.writeUInt64(byteBuffer, entry.moofOffset);
            } }else {{
                __CLR4_5_22qo2qolvlulccl.R.inc(3607);IsoTypeWriter.writeUInt32(byteBuffer, entry.time);
                __CLR4_5_22qo2qolvlulccl.R.inc(3608);IsoTypeWriter.writeUInt32(byteBuffer, entry.moofOffset);
            }
            }__CLR4_5_22qo2qolvlulccl.R.inc(3609);IsoTypeWriterVariable.write(entry.trafNumber, byteBuffer, lengthSizeOfTrafNum);
            __CLR4_5_22qo2qolvlulccl.R.inc(3610);IsoTypeWriterVariable.write(entry.trunNumber, byteBuffer, lengthSizeOfTrunNum);
            __CLR4_5_22qo2qolvlulccl.R.inc(3611);IsoTypeWriterVariable.write(entry.sampleNumber, byteBuffer, lengthSizeOfSampleNum);

        }
    }}finally{__CLR4_5_22qo2qolvlulccl.R.flushNeeded();}}


    public void setTrackId(long trackId) {try{__CLR4_5_22qo2qolvlulccl.R.inc(3612);
        __CLR4_5_22qo2qolvlulccl.R.inc(3613);this.trackId = trackId;
    }finally{__CLR4_5_22qo2qolvlulccl.R.flushNeeded();}}

    public void setLengthSizeOfTrafNum(int lengthSizeOfTrafNum) {try{__CLR4_5_22qo2qolvlulccl.R.inc(3614);
        __CLR4_5_22qo2qolvlulccl.R.inc(3615);this.lengthSizeOfTrafNum = lengthSizeOfTrafNum;
    }finally{__CLR4_5_22qo2qolvlulccl.R.flushNeeded();}}

    public void setLengthSizeOfTrunNum(int lengthSizeOfTrunNum) {try{__CLR4_5_22qo2qolvlulccl.R.inc(3616);
        __CLR4_5_22qo2qolvlulccl.R.inc(3617);this.lengthSizeOfTrunNum = lengthSizeOfTrunNum;
    }finally{__CLR4_5_22qo2qolvlulccl.R.flushNeeded();}}

    public void setLengthSizeOfSampleNum(int lengthSizeOfSampleNum) {try{__CLR4_5_22qo2qolvlulccl.R.inc(3618);
        __CLR4_5_22qo2qolvlulccl.R.inc(3619);this.lengthSizeOfSampleNum = lengthSizeOfSampleNum;
    }finally{__CLR4_5_22qo2qolvlulccl.R.flushNeeded();}}

    public long getTrackId() {try{__CLR4_5_22qo2qolvlulccl.R.inc(3620);
        __CLR4_5_22qo2qolvlulccl.R.inc(3621);return trackId;
    }finally{__CLR4_5_22qo2qolvlulccl.R.flushNeeded();}}

    public int getReserved() {try{__CLR4_5_22qo2qolvlulccl.R.inc(3622);
        __CLR4_5_22qo2qolvlulccl.R.inc(3623);return reserved;
    }finally{__CLR4_5_22qo2qolvlulccl.R.flushNeeded();}}

    public int getLengthSizeOfTrafNum() {try{__CLR4_5_22qo2qolvlulccl.R.inc(3624);
        __CLR4_5_22qo2qolvlulccl.R.inc(3625);return lengthSizeOfTrafNum;
    }finally{__CLR4_5_22qo2qolvlulccl.R.flushNeeded();}}

    public int getLengthSizeOfTrunNum() {try{__CLR4_5_22qo2qolvlulccl.R.inc(3626);
        __CLR4_5_22qo2qolvlulccl.R.inc(3627);return lengthSizeOfTrunNum;
    }finally{__CLR4_5_22qo2qolvlulccl.R.flushNeeded();}}

    public int getLengthSizeOfSampleNum() {try{__CLR4_5_22qo2qolvlulccl.R.inc(3628);
        __CLR4_5_22qo2qolvlulccl.R.inc(3629);return lengthSizeOfSampleNum;
    }finally{__CLR4_5_22qo2qolvlulccl.R.flushNeeded();}}

    public long getNumberOfEntries() {try{__CLR4_5_22qo2qolvlulccl.R.inc(3630);
        __CLR4_5_22qo2qolvlulccl.R.inc(3631);return entries.size();
    }finally{__CLR4_5_22qo2qolvlulccl.R.flushNeeded();}}

    public List<Entry> getEntries() {try{__CLR4_5_22qo2qolvlulccl.R.inc(3632);
        __CLR4_5_22qo2qolvlulccl.R.inc(3633);return Collections.unmodifiableList(entries);
    }finally{__CLR4_5_22qo2qolvlulccl.R.flushNeeded();}}

    public void setEntries(List<Entry> entries) {try{__CLR4_5_22qo2qolvlulccl.R.inc(3634);
        __CLR4_5_22qo2qolvlulccl.R.inc(3635);this.entries = entries;
    }finally{__CLR4_5_22qo2qolvlulccl.R.flushNeeded();}}

    public static class Entry {
        private long time;
        private long moofOffset;
        private long trafNumber;
        private long trunNumber;
        private long sampleNumber;

        public Entry() {try{__CLR4_5_22qo2qolvlulccl.R.inc(3636);
        }finally{__CLR4_5_22qo2qolvlulccl.R.flushNeeded();}}

        public Entry(long time, long moofOffset, long trafNumber, long trunNumber, long sampleNumber) {try{__CLR4_5_22qo2qolvlulccl.R.inc(3637);
            __CLR4_5_22qo2qolvlulccl.R.inc(3638);this.moofOffset = moofOffset;
            __CLR4_5_22qo2qolvlulccl.R.inc(3639);this.sampleNumber = sampleNumber;
            __CLR4_5_22qo2qolvlulccl.R.inc(3640);this.time = time;
            __CLR4_5_22qo2qolvlulccl.R.inc(3641);this.trafNumber = trafNumber;
            __CLR4_5_22qo2qolvlulccl.R.inc(3642);this.trunNumber = trunNumber;
        }finally{__CLR4_5_22qo2qolvlulccl.R.flushNeeded();}}

        public long getTime() {try{__CLR4_5_22qo2qolvlulccl.R.inc(3643);
            __CLR4_5_22qo2qolvlulccl.R.inc(3644);return time;
        }finally{__CLR4_5_22qo2qolvlulccl.R.flushNeeded();}}

        public long getMoofOffset() {try{__CLR4_5_22qo2qolvlulccl.R.inc(3645);
            __CLR4_5_22qo2qolvlulccl.R.inc(3646);return moofOffset;
        }finally{__CLR4_5_22qo2qolvlulccl.R.flushNeeded();}}

        public long getTrafNumber() {try{__CLR4_5_22qo2qolvlulccl.R.inc(3647);
            __CLR4_5_22qo2qolvlulccl.R.inc(3648);return trafNumber;
        }finally{__CLR4_5_22qo2qolvlulccl.R.flushNeeded();}}

        public long getTrunNumber() {try{__CLR4_5_22qo2qolvlulccl.R.inc(3649);
            __CLR4_5_22qo2qolvlulccl.R.inc(3650);return trunNumber;
        }finally{__CLR4_5_22qo2qolvlulccl.R.flushNeeded();}}

        public long getSampleNumber() {try{__CLR4_5_22qo2qolvlulccl.R.inc(3651);
            __CLR4_5_22qo2qolvlulccl.R.inc(3652);return sampleNumber;
        }finally{__CLR4_5_22qo2qolvlulccl.R.flushNeeded();}}

        public void setTime(long time) {try{__CLR4_5_22qo2qolvlulccl.R.inc(3653);
            __CLR4_5_22qo2qolvlulccl.R.inc(3654);this.time = time;
        }finally{__CLR4_5_22qo2qolvlulccl.R.flushNeeded();}}

        public void setMoofOffset(long moofOffset) {try{__CLR4_5_22qo2qolvlulccl.R.inc(3655);
            __CLR4_5_22qo2qolvlulccl.R.inc(3656);this.moofOffset = moofOffset;
        }finally{__CLR4_5_22qo2qolvlulccl.R.flushNeeded();}}

        public void setTrafNumber(long trafNumber) {try{__CLR4_5_22qo2qolvlulccl.R.inc(3657);
            __CLR4_5_22qo2qolvlulccl.R.inc(3658);this.trafNumber = trafNumber;
        }finally{__CLR4_5_22qo2qolvlulccl.R.flushNeeded();}}

        public void setTrunNumber(long trunNumber) {try{__CLR4_5_22qo2qolvlulccl.R.inc(3659);
            __CLR4_5_22qo2qolvlulccl.R.inc(3660);this.trunNumber = trunNumber;
        }finally{__CLR4_5_22qo2qolvlulccl.R.flushNeeded();}}

        public void setSampleNumber(long sampleNumber) {try{__CLR4_5_22qo2qolvlulccl.R.inc(3661);
            __CLR4_5_22qo2qolvlulccl.R.inc(3662);this.sampleNumber = sampleNumber;
        }finally{__CLR4_5_22qo2qolvlulccl.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_5_22qo2qolvlulccl.R.inc(3663);
            __CLR4_5_22qo2qolvlulccl.R.inc(3664);return "Entry{" +
                    "time=" + time +
                    ", moofOffset=" + moofOffset +
                    ", trafNumber=" + trafNumber +
                    ", trunNumber=" + trunNumber +
                    ", sampleNumber=" + sampleNumber +
                    '}';
        }finally{__CLR4_5_22qo2qolvlulccl.R.flushNeeded();}}

        @Override
        public boolean equals(Object o) {try{__CLR4_5_22qo2qolvlulccl.R.inc(3665);
            __CLR4_5_22qo2qolvlulccl.R.inc(3666);if ((((this == o)&&(__CLR4_5_22qo2qolvlulccl.R.iget(3667)!=0|true))||(__CLR4_5_22qo2qolvlulccl.R.iget(3668)==0&false))) {__CLR4_5_22qo2qolvlulccl.R.inc(3669);return true;
            }__CLR4_5_22qo2qolvlulccl.R.inc(3670);if ((((o == null || getClass() != o.getClass())&&(__CLR4_5_22qo2qolvlulccl.R.iget(3671)!=0|true))||(__CLR4_5_22qo2qolvlulccl.R.iget(3672)==0&false))) {__CLR4_5_22qo2qolvlulccl.R.inc(3673);return false;

            }__CLR4_5_22qo2qolvlulccl.R.inc(3674);Entry entry = (Entry) o;

            __CLR4_5_22qo2qolvlulccl.R.inc(3675);if ((((moofOffset != entry.moofOffset)&&(__CLR4_5_22qo2qolvlulccl.R.iget(3676)!=0|true))||(__CLR4_5_22qo2qolvlulccl.R.iget(3677)==0&false))) {__CLR4_5_22qo2qolvlulccl.R.inc(3678);return false;
            }__CLR4_5_22qo2qolvlulccl.R.inc(3679);if ((((sampleNumber != entry.sampleNumber)&&(__CLR4_5_22qo2qolvlulccl.R.iget(3680)!=0|true))||(__CLR4_5_22qo2qolvlulccl.R.iget(3681)==0&false))) {__CLR4_5_22qo2qolvlulccl.R.inc(3682);return false;
            }__CLR4_5_22qo2qolvlulccl.R.inc(3683);if ((((time != entry.time)&&(__CLR4_5_22qo2qolvlulccl.R.iget(3684)!=0|true))||(__CLR4_5_22qo2qolvlulccl.R.iget(3685)==0&false))) {__CLR4_5_22qo2qolvlulccl.R.inc(3686);return false;
            }__CLR4_5_22qo2qolvlulccl.R.inc(3687);if ((((trafNumber != entry.trafNumber)&&(__CLR4_5_22qo2qolvlulccl.R.iget(3688)!=0|true))||(__CLR4_5_22qo2qolvlulccl.R.iget(3689)==0&false))) {__CLR4_5_22qo2qolvlulccl.R.inc(3690);return false;
            }__CLR4_5_22qo2qolvlulccl.R.inc(3691);if ((((trunNumber != entry.trunNumber)&&(__CLR4_5_22qo2qolvlulccl.R.iget(3692)!=0|true))||(__CLR4_5_22qo2qolvlulccl.R.iget(3693)==0&false))) {__CLR4_5_22qo2qolvlulccl.R.inc(3694);return false;

            }__CLR4_5_22qo2qolvlulccl.R.inc(3695);return true;
        }finally{__CLR4_5_22qo2qolvlulccl.R.flushNeeded();}}

        @Override
        public int hashCode() {try{__CLR4_5_22qo2qolvlulccl.R.inc(3696);
            __CLR4_5_22qo2qolvlulccl.R.inc(3697);int result = (int) (time ^ (time >>> 32));
            __CLR4_5_22qo2qolvlulccl.R.inc(3698);result = 31 * result + (int) (moofOffset ^ (moofOffset >>> 32));
            __CLR4_5_22qo2qolvlulccl.R.inc(3699);result = 31 * result + (int) (trafNumber ^ (trafNumber >>> 32));
            __CLR4_5_22qo2qolvlulccl.R.inc(3700);result = 31 * result + (int) (trunNumber ^ (trunNumber >>> 32));
            __CLR4_5_22qo2qolvlulccl.R.inc(3701);result = 31 * result + (int) (sampleNumber ^ (sampleNumber >>> 32));
            __CLR4_5_22qo2qolvlulccl.R.inc(3702);return result;
        }finally{__CLR4_5_22qo2qolvlulccl.R.flushNeeded();}}
    }

    @Override
    public String toString() {try{__CLR4_5_22qo2qolvlulccl.R.inc(3703);
        __CLR4_5_22qo2qolvlulccl.R.inc(3704);return "TrackFragmentRandomAccessBox{" +
                "trackId=" + trackId +
                ", entries=" + entries +
                '}';
    }finally{__CLR4_5_22qo2qolvlulccl.R.flushNeeded();}}
}
