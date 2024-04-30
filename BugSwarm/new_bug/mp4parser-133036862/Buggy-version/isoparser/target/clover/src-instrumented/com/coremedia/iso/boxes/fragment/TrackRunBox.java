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
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.AbstractFullBox;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

import static com.googlecode.mp4parser.util.CastUtils.l2i;

/**
 * <h1>4cc = "{@value #TYPE}"</h1>
 * aligned(8) class TrackRunBox
 * extends FullBox('trun', version, tr_flags) {
 * unsigned int(32)	sample_count;
 * // the following are optional fields
 * signed int(32)	data_offset;
 * unsigned int(32)	first_sample_flags;
 * // all fields in the following array are optional
 * {
 * unsigned int(32)	sample_duration;
 * unsigned int(32)	sample_size;
 * unsigned int(32)	sample_flags
 * if (version == 0)
 * { unsigned int(32)	sample_composition_time_offset; }
 * else
 * { signed int(32)		sample_composition_time_offset; }
 * }[ sample_count ]
 * }
 */

public class TrackRunBox extends AbstractFullBox {public static class __CLR4_5_22ux2uxlvlulcfo{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0033\u0033\u0030\u0033\u0036\u0038\u0036\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714448869219L,8589935092L,3917,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static final String TYPE = "trun";
    private int dataOffset;
    private SampleFlags firstSampleFlags;
    private List<Entry> entries = new ArrayList<Entry>();


    public List<Entry> getEntries() {try{__CLR4_5_22ux2uxlvlulcfo.R.inc(3705);
        __CLR4_5_22ux2uxlvlulcfo.R.inc(3706);return entries;
    }finally{__CLR4_5_22ux2uxlvlulcfo.R.flushNeeded();}}

    public static class Entry {
        private long sampleDuration;
        private long sampleSize;
        private SampleFlags sampleFlags;
        private long sampleCompositionTimeOffset;

        public Entry() {try{__CLR4_5_22ux2uxlvlulcfo.R.inc(3707);
        }finally{__CLR4_5_22ux2uxlvlulcfo.R.flushNeeded();}}

        public Entry(long sampleDuration, long sampleSize, SampleFlags sampleFlags, int sampleCompositionTimeOffset) {try{__CLR4_5_22ux2uxlvlulcfo.R.inc(3708);
            __CLR4_5_22ux2uxlvlulcfo.R.inc(3709);this.sampleDuration = sampleDuration;
            __CLR4_5_22ux2uxlvlulcfo.R.inc(3710);this.sampleSize = sampleSize;
            __CLR4_5_22ux2uxlvlulcfo.R.inc(3711);this.sampleFlags = sampleFlags;
            __CLR4_5_22ux2uxlvlulcfo.R.inc(3712);this.sampleCompositionTimeOffset = sampleCompositionTimeOffset;
        }finally{__CLR4_5_22ux2uxlvlulcfo.R.flushNeeded();}}

        public long getSampleDuration() {try{__CLR4_5_22ux2uxlvlulcfo.R.inc(3713);
            __CLR4_5_22ux2uxlvlulcfo.R.inc(3714);return sampleDuration;
        }finally{__CLR4_5_22ux2uxlvlulcfo.R.flushNeeded();}}

        public long getSampleSize() {try{__CLR4_5_22ux2uxlvlulcfo.R.inc(3715);
            __CLR4_5_22ux2uxlvlulcfo.R.inc(3716);return sampleSize;
        }finally{__CLR4_5_22ux2uxlvlulcfo.R.flushNeeded();}}

        public SampleFlags getSampleFlags() {try{__CLR4_5_22ux2uxlvlulcfo.R.inc(3717);
            __CLR4_5_22ux2uxlvlulcfo.R.inc(3718);return sampleFlags;
        }finally{__CLR4_5_22ux2uxlvlulcfo.R.flushNeeded();}}

        public long getSampleCompositionTimeOffset() {try{__CLR4_5_22ux2uxlvlulcfo.R.inc(3719);
            __CLR4_5_22ux2uxlvlulcfo.R.inc(3720);return sampleCompositionTimeOffset;
        }finally{__CLR4_5_22ux2uxlvlulcfo.R.flushNeeded();}}

        public void setSampleDuration(long sampleDuration) {try{__CLR4_5_22ux2uxlvlulcfo.R.inc(3721);
            __CLR4_5_22ux2uxlvlulcfo.R.inc(3722);this.sampleDuration = sampleDuration;
        }finally{__CLR4_5_22ux2uxlvlulcfo.R.flushNeeded();}}

        public void setSampleSize(long sampleSize) {try{__CLR4_5_22ux2uxlvlulcfo.R.inc(3723);
            __CLR4_5_22ux2uxlvlulcfo.R.inc(3724);this.sampleSize = sampleSize;
        }finally{__CLR4_5_22ux2uxlvlulcfo.R.flushNeeded();}}

        public void setSampleFlags(SampleFlags sampleFlags) {try{__CLR4_5_22ux2uxlvlulcfo.R.inc(3725);
            __CLR4_5_22ux2uxlvlulcfo.R.inc(3726);this.sampleFlags = sampleFlags;
        }finally{__CLR4_5_22ux2uxlvlulcfo.R.flushNeeded();}}

        public void setSampleCompositionTimeOffset(int sampleCompositionTimeOffset) {try{__CLR4_5_22ux2uxlvlulcfo.R.inc(3727);
            __CLR4_5_22ux2uxlvlulcfo.R.inc(3728);this.sampleCompositionTimeOffset = sampleCompositionTimeOffset;
        }finally{__CLR4_5_22ux2uxlvlulcfo.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_5_22ux2uxlvlulcfo.R.inc(3729);
            __CLR4_5_22ux2uxlvlulcfo.R.inc(3730);return "Entry{" +
                    "duration=" + sampleDuration +
                    ", size=" + sampleSize +
                    ", dlags=" + sampleFlags +
                    ", compTimeOffset=" + sampleCompositionTimeOffset +
                    '}';
        }finally{__CLR4_5_22ux2uxlvlulcfo.R.flushNeeded();}}
    }

    public void setDataOffset(int dataOffset) {try{__CLR4_5_22ux2uxlvlulcfo.R.inc(3731);
        __CLR4_5_22ux2uxlvlulcfo.R.inc(3732);if ((((dataOffset == -1)&&(__CLR4_5_22ux2uxlvlulcfo.R.iget(3733)!=0|true))||(__CLR4_5_22ux2uxlvlulcfo.R.iget(3734)==0&false))) {{
            __CLR4_5_22ux2uxlvlulcfo.R.inc(3735);setFlags(getFlags() & (0xFFFFFF ^ 1));
        } }else {{
            __CLR4_5_22ux2uxlvlulcfo.R.inc(3736);setFlags(getFlags() | 0x1); // turn on dataoffset
        }
        }__CLR4_5_22ux2uxlvlulcfo.R.inc(3737);this.dataOffset = dataOffset;
    }finally{__CLR4_5_22ux2uxlvlulcfo.R.flushNeeded();}}

    public long[] getSampleCompositionTimeOffsets() {try{__CLR4_5_22ux2uxlvlulcfo.R.inc(3738);
        __CLR4_5_22ux2uxlvlulcfo.R.inc(3739);if ((((isSampleCompositionTimeOffsetPresent())&&(__CLR4_5_22ux2uxlvlulcfo.R.iget(3740)!=0|true))||(__CLR4_5_22ux2uxlvlulcfo.R.iget(3741)==0&false))) {{
            __CLR4_5_22ux2uxlvlulcfo.R.inc(3742);long[] result = new long[entries.size()];

            __CLR4_5_22ux2uxlvlulcfo.R.inc(3743);for (int i = 0; (((i < result.length)&&(__CLR4_5_22ux2uxlvlulcfo.R.iget(3744)!=0|true))||(__CLR4_5_22ux2uxlvlulcfo.R.iget(3745)==0&false)); i++) {{
                __CLR4_5_22ux2uxlvlulcfo.R.inc(3746);result[i] = entries.get(i).getSampleCompositionTimeOffset();
            }
            }__CLR4_5_22ux2uxlvlulcfo.R.inc(3747);return result;
        }
        }__CLR4_5_22ux2uxlvlulcfo.R.inc(3748);return null;
    }finally{__CLR4_5_22ux2uxlvlulcfo.R.flushNeeded();}}

    public TrackRunBox() {
        super(TYPE);__CLR4_5_22ux2uxlvlulcfo.R.inc(3750);try{__CLR4_5_22ux2uxlvlulcfo.R.inc(3749);
    }finally{__CLR4_5_22ux2uxlvlulcfo.R.flushNeeded();}}

    protected long getContentSize() {try{__CLR4_5_22ux2uxlvlulcfo.R.inc(3751);
        __CLR4_5_22ux2uxlvlulcfo.R.inc(3752);long size = 8;
        __CLR4_5_22ux2uxlvlulcfo.R.inc(3753);int flags = getFlags();

        __CLR4_5_22ux2uxlvlulcfo.R.inc(3754);if (((((flags & 0x1) == 0x1)&&(__CLR4_5_22ux2uxlvlulcfo.R.iget(3755)!=0|true))||(__CLR4_5_22ux2uxlvlulcfo.R.iget(3756)==0&false))) {{ //dataOffsetPresent
            __CLR4_5_22ux2uxlvlulcfo.R.inc(3757);size += 4;
        }
        }__CLR4_5_22ux2uxlvlulcfo.R.inc(3758);if (((((flags & 0x4) == 0x4)&&(__CLR4_5_22ux2uxlvlulcfo.R.iget(3759)!=0|true))||(__CLR4_5_22ux2uxlvlulcfo.R.iget(3760)==0&false))) {{ //firstSampleFlagsPresent
            __CLR4_5_22ux2uxlvlulcfo.R.inc(3761);size += 4;
        }

        }__CLR4_5_22ux2uxlvlulcfo.R.inc(3762);long entrySize = 0;
        __CLR4_5_22ux2uxlvlulcfo.R.inc(3763);if (((((flags & 0x100) == 0x100)&&(__CLR4_5_22ux2uxlvlulcfo.R.iget(3764)!=0|true))||(__CLR4_5_22ux2uxlvlulcfo.R.iget(3765)==0&false))) {{ //sampleDurationPresent
            __CLR4_5_22ux2uxlvlulcfo.R.inc(3766);entrySize += 4;
        }
        }__CLR4_5_22ux2uxlvlulcfo.R.inc(3767);if (((((flags & 0x200) == 0x200)&&(__CLR4_5_22ux2uxlvlulcfo.R.iget(3768)!=0|true))||(__CLR4_5_22ux2uxlvlulcfo.R.iget(3769)==0&false))) {{ //sampleSizePresent
            __CLR4_5_22ux2uxlvlulcfo.R.inc(3770);entrySize += 4;
        }
        }__CLR4_5_22ux2uxlvlulcfo.R.inc(3771);if (((((flags & 0x400) == 0x400)&&(__CLR4_5_22ux2uxlvlulcfo.R.iget(3772)!=0|true))||(__CLR4_5_22ux2uxlvlulcfo.R.iget(3773)==0&false))) {{ //sampleFlagsPresent
            __CLR4_5_22ux2uxlvlulcfo.R.inc(3774);entrySize += 4;
        }
        }__CLR4_5_22ux2uxlvlulcfo.R.inc(3775);if (((((flags & 0x800) == 0x800)&&(__CLR4_5_22ux2uxlvlulcfo.R.iget(3776)!=0|true))||(__CLR4_5_22ux2uxlvlulcfo.R.iget(3777)==0&false))) {{ //sampleCompositionTimeOffsetPresent
            __CLR4_5_22ux2uxlvlulcfo.R.inc(3778);entrySize += 4;
        }
        }__CLR4_5_22ux2uxlvlulcfo.R.inc(3779);size += entrySize * entries.size();
        __CLR4_5_22ux2uxlvlulcfo.R.inc(3780);return size;
    }finally{__CLR4_5_22ux2uxlvlulcfo.R.flushNeeded();}}

    protected void getContent(ByteBuffer byteBuffer) {try{__CLR4_5_22ux2uxlvlulcfo.R.inc(3781);
        __CLR4_5_22ux2uxlvlulcfo.R.inc(3782);writeVersionAndFlags(byteBuffer);
        __CLR4_5_22ux2uxlvlulcfo.R.inc(3783);IsoTypeWriter.writeUInt32(byteBuffer, entries.size());
        __CLR4_5_22ux2uxlvlulcfo.R.inc(3784);int flags = getFlags();

        __CLR4_5_22ux2uxlvlulcfo.R.inc(3785);if (((((flags & 0x1) == 1)&&(__CLR4_5_22ux2uxlvlulcfo.R.iget(3786)!=0|true))||(__CLR4_5_22ux2uxlvlulcfo.R.iget(3787)==0&false))) {{ //dataOffsetPresent
            __CLR4_5_22ux2uxlvlulcfo.R.inc(3788);IsoTypeWriter.writeUInt32(byteBuffer, dataOffset);
        }
        }__CLR4_5_22ux2uxlvlulcfo.R.inc(3789);if (((((flags & 0x4) == 0x4)&&(__CLR4_5_22ux2uxlvlulcfo.R.iget(3790)!=0|true))||(__CLR4_5_22ux2uxlvlulcfo.R.iget(3791)==0&false))) {{ //firstSampleFlagsPresent
            __CLR4_5_22ux2uxlvlulcfo.R.inc(3792);firstSampleFlags.getContent(byteBuffer);
        }

        }__CLR4_5_22ux2uxlvlulcfo.R.inc(3793);for (Entry entry : entries) {{
            __CLR4_5_22ux2uxlvlulcfo.R.inc(3794);if (((((flags & 0x100) == 0x100)&&(__CLR4_5_22ux2uxlvlulcfo.R.iget(3795)!=0|true))||(__CLR4_5_22ux2uxlvlulcfo.R.iget(3796)==0&false))) {{ //sampleDurationPresent
                __CLR4_5_22ux2uxlvlulcfo.R.inc(3797);IsoTypeWriter.writeUInt32(byteBuffer, entry.sampleDuration);
            }
            }__CLR4_5_22ux2uxlvlulcfo.R.inc(3798);if (((((flags & 0x200) == 0x200)&&(__CLR4_5_22ux2uxlvlulcfo.R.iget(3799)!=0|true))||(__CLR4_5_22ux2uxlvlulcfo.R.iget(3800)==0&false))) {{ //sampleSizePresent
                __CLR4_5_22ux2uxlvlulcfo.R.inc(3801);IsoTypeWriter.writeUInt32(byteBuffer, entry.sampleSize);
            }
            }__CLR4_5_22ux2uxlvlulcfo.R.inc(3802);if (((((flags & 0x400) == 0x400)&&(__CLR4_5_22ux2uxlvlulcfo.R.iget(3803)!=0|true))||(__CLR4_5_22ux2uxlvlulcfo.R.iget(3804)==0&false))) {{ //sampleFlagsPresent
                __CLR4_5_22ux2uxlvlulcfo.R.inc(3805);entry.sampleFlags.getContent(byteBuffer);
            }
            }__CLR4_5_22ux2uxlvlulcfo.R.inc(3806);if (((((flags & 0x800) == 0x800)&&(__CLR4_5_22ux2uxlvlulcfo.R.iget(3807)!=0|true))||(__CLR4_5_22ux2uxlvlulcfo.R.iget(3808)==0&false))) {{ //sampleCompositionTimeOffsetPresent
                __CLR4_5_22ux2uxlvlulcfo.R.inc(3809);if ((((getVersion() == 0)&&(__CLR4_5_22ux2uxlvlulcfo.R.iget(3810)!=0|true))||(__CLR4_5_22ux2uxlvlulcfo.R.iget(3811)==0&false))) {{
                    __CLR4_5_22ux2uxlvlulcfo.R.inc(3812);IsoTypeWriter.writeUInt32(byteBuffer, entry.sampleCompositionTimeOffset);
                } }else {{
                    __CLR4_5_22ux2uxlvlulcfo.R.inc(3813);byteBuffer.putInt((int) entry.sampleCompositionTimeOffset);
                }
            }}
        }}
    }}finally{__CLR4_5_22ux2uxlvlulcfo.R.flushNeeded();}}

    @Override
    public void _parseDetails(ByteBuffer content) {try{__CLR4_5_22ux2uxlvlulcfo.R.inc(3814);
        __CLR4_5_22ux2uxlvlulcfo.R.inc(3815);parseVersionAndFlags(content);
        __CLR4_5_22ux2uxlvlulcfo.R.inc(3816);long sampleCount = IsoTypeReader.readUInt32(content);

        __CLR4_5_22ux2uxlvlulcfo.R.inc(3817);if (((((getFlags() & 0x1) == 1)&&(__CLR4_5_22ux2uxlvlulcfo.R.iget(3818)!=0|true))||(__CLR4_5_22ux2uxlvlulcfo.R.iget(3819)==0&false))) {{ //dataOffsetPresent
            __CLR4_5_22ux2uxlvlulcfo.R.inc(3820);dataOffset = l2i(IsoTypeReader.readUInt32(content));
        } }else {{
            __CLR4_5_22ux2uxlvlulcfo.R.inc(3821);dataOffset = -1;
        }
        }__CLR4_5_22ux2uxlvlulcfo.R.inc(3822);if (((((getFlags() & 0x4) == 0x4)&&(__CLR4_5_22ux2uxlvlulcfo.R.iget(3823)!=0|true))||(__CLR4_5_22ux2uxlvlulcfo.R.iget(3824)==0&false))) {{ //firstSampleFlagsPresent
            __CLR4_5_22ux2uxlvlulcfo.R.inc(3825);firstSampleFlags = new SampleFlags(content);
        }

        }__CLR4_5_22ux2uxlvlulcfo.R.inc(3826);for (int i = 0; (((i < sampleCount)&&(__CLR4_5_22ux2uxlvlulcfo.R.iget(3827)!=0|true))||(__CLR4_5_22ux2uxlvlulcfo.R.iget(3828)==0&false)); i++) {{
            __CLR4_5_22ux2uxlvlulcfo.R.inc(3829);Entry entry = new Entry();
            __CLR4_5_22ux2uxlvlulcfo.R.inc(3830);if (((((getFlags() & 0x100) == 0x100)&&(__CLR4_5_22ux2uxlvlulcfo.R.iget(3831)!=0|true))||(__CLR4_5_22ux2uxlvlulcfo.R.iget(3832)==0&false))) {{ //sampleDurationPresent
                __CLR4_5_22ux2uxlvlulcfo.R.inc(3833);entry.sampleDuration = IsoTypeReader.readUInt32(content);
            }
            }__CLR4_5_22ux2uxlvlulcfo.R.inc(3834);if (((((getFlags() & 0x200) == 0x200)&&(__CLR4_5_22ux2uxlvlulcfo.R.iget(3835)!=0|true))||(__CLR4_5_22ux2uxlvlulcfo.R.iget(3836)==0&false))) {{ //sampleSizePresent
                __CLR4_5_22ux2uxlvlulcfo.R.inc(3837);entry.sampleSize = IsoTypeReader.readUInt32(content);
            }
            }__CLR4_5_22ux2uxlvlulcfo.R.inc(3838);if (((((getFlags() & 0x400) == 0x400)&&(__CLR4_5_22ux2uxlvlulcfo.R.iget(3839)!=0|true))||(__CLR4_5_22ux2uxlvlulcfo.R.iget(3840)==0&false))) {{ //sampleFlagsPresent
                __CLR4_5_22ux2uxlvlulcfo.R.inc(3841);entry.sampleFlags = new SampleFlags(content);
            }
            }__CLR4_5_22ux2uxlvlulcfo.R.inc(3842);if (((((getFlags() & 0x800) == 0x800)&&(__CLR4_5_22ux2uxlvlulcfo.R.iget(3843)!=0|true))||(__CLR4_5_22ux2uxlvlulcfo.R.iget(3844)==0&false))) {{ //sampleCompositionTimeOffsetPresent
                __CLR4_5_22ux2uxlvlulcfo.R.inc(3845);entry.sampleCompositionTimeOffset = content.getInt();
            }
            }__CLR4_5_22ux2uxlvlulcfo.R.inc(3846);entries.add(entry);
        }

    }}finally{__CLR4_5_22ux2uxlvlulcfo.R.flushNeeded();}}

    public long getSampleCount() {try{__CLR4_5_22ux2uxlvlulcfo.R.inc(3847);
        __CLR4_5_22ux2uxlvlulcfo.R.inc(3848);return entries.size();
    }finally{__CLR4_5_22ux2uxlvlulcfo.R.flushNeeded();}}

    public boolean isDataOffsetPresent() {try{__CLR4_5_22ux2uxlvlulcfo.R.inc(3849);
        __CLR4_5_22ux2uxlvlulcfo.R.inc(3850);return (getFlags() & 0x1) == 1;
    }finally{__CLR4_5_22ux2uxlvlulcfo.R.flushNeeded();}}

    public boolean isFirstSampleFlagsPresent() {try{__CLR4_5_22ux2uxlvlulcfo.R.inc(3851);
        __CLR4_5_22ux2uxlvlulcfo.R.inc(3852);return (getFlags() & 0x4) == 0x4;
    }finally{__CLR4_5_22ux2uxlvlulcfo.R.flushNeeded();}}


    public boolean isSampleSizePresent() {try{__CLR4_5_22ux2uxlvlulcfo.R.inc(3853);
        __CLR4_5_22ux2uxlvlulcfo.R.inc(3854);return (getFlags() & 0x200) == 0x200;
    }finally{__CLR4_5_22ux2uxlvlulcfo.R.flushNeeded();}}

    public boolean isSampleDurationPresent() {try{__CLR4_5_22ux2uxlvlulcfo.R.inc(3855);
        __CLR4_5_22ux2uxlvlulcfo.R.inc(3856);return (getFlags() & 0x100) == 0x100;
    }finally{__CLR4_5_22ux2uxlvlulcfo.R.flushNeeded();}}

    public boolean isSampleFlagsPresent() {try{__CLR4_5_22ux2uxlvlulcfo.R.inc(3857);
        __CLR4_5_22ux2uxlvlulcfo.R.inc(3858);return (getFlags() & 0x400) == 0x400;
    }finally{__CLR4_5_22ux2uxlvlulcfo.R.flushNeeded();}}

    public boolean isSampleCompositionTimeOffsetPresent() {try{__CLR4_5_22ux2uxlvlulcfo.R.inc(3859);
        __CLR4_5_22ux2uxlvlulcfo.R.inc(3860);return (getFlags() & 0x800) == 0x800;
    }finally{__CLR4_5_22ux2uxlvlulcfo.R.flushNeeded();}}

    public void setDataOffsetPresent(boolean v) {try{__CLR4_5_22ux2uxlvlulcfo.R.inc(3861);
        __CLR4_5_22ux2uxlvlulcfo.R.inc(3862);if ((((v)&&(__CLR4_5_22ux2uxlvlulcfo.R.iget(3863)!=0|true))||(__CLR4_5_22ux2uxlvlulcfo.R.iget(3864)==0&false))) {{
            __CLR4_5_22ux2uxlvlulcfo.R.inc(3865);setFlags(getFlags() | 0x01);
        } }else {{
            __CLR4_5_22ux2uxlvlulcfo.R.inc(3866);setFlags(getFlags() & (0xFFFFFF ^ 0x1));
        }
    }}finally{__CLR4_5_22ux2uxlvlulcfo.R.flushNeeded();}}

    public void setSampleSizePresent(boolean v) {try{__CLR4_5_22ux2uxlvlulcfo.R.inc(3867);
        __CLR4_5_22ux2uxlvlulcfo.R.inc(3868);if ((((v)&&(__CLR4_5_22ux2uxlvlulcfo.R.iget(3869)!=0|true))||(__CLR4_5_22ux2uxlvlulcfo.R.iget(3870)==0&false))) {{
            __CLR4_5_22ux2uxlvlulcfo.R.inc(3871);setFlags(getFlags() | 0x200);
        } }else {{
            __CLR4_5_22ux2uxlvlulcfo.R.inc(3872);setFlags(getFlags() & (0xFFFFFF ^ 0x200));
        }
    }}finally{__CLR4_5_22ux2uxlvlulcfo.R.flushNeeded();}}

    public void setSampleDurationPresent(boolean v) {try{__CLR4_5_22ux2uxlvlulcfo.R.inc(3873);

        __CLR4_5_22ux2uxlvlulcfo.R.inc(3874);if ((((v)&&(__CLR4_5_22ux2uxlvlulcfo.R.iget(3875)!=0|true))||(__CLR4_5_22ux2uxlvlulcfo.R.iget(3876)==0&false))) {{
            __CLR4_5_22ux2uxlvlulcfo.R.inc(3877);setFlags(getFlags() | 0x100);
        } }else {{
            __CLR4_5_22ux2uxlvlulcfo.R.inc(3878);setFlags(getFlags() & (0xFFFFFF ^ 0x100));
        }
    }}finally{__CLR4_5_22ux2uxlvlulcfo.R.flushNeeded();}}

    public void setSampleFlagsPresent(boolean v) {try{__CLR4_5_22ux2uxlvlulcfo.R.inc(3879);
        __CLR4_5_22ux2uxlvlulcfo.R.inc(3880);if ((((v)&&(__CLR4_5_22ux2uxlvlulcfo.R.iget(3881)!=0|true))||(__CLR4_5_22ux2uxlvlulcfo.R.iget(3882)==0&false))) {{
            __CLR4_5_22ux2uxlvlulcfo.R.inc(3883);setFlags(getFlags() | 0x400);
        } }else {{
            __CLR4_5_22ux2uxlvlulcfo.R.inc(3884);setFlags(getFlags() & (0xFFFFFF ^ 0x400));
        }
    }}finally{__CLR4_5_22ux2uxlvlulcfo.R.flushNeeded();}}

    public void setSampleCompositionTimeOffsetPresent(boolean v) {try{__CLR4_5_22ux2uxlvlulcfo.R.inc(3885);
        __CLR4_5_22ux2uxlvlulcfo.R.inc(3886);if ((((v)&&(__CLR4_5_22ux2uxlvlulcfo.R.iget(3887)!=0|true))||(__CLR4_5_22ux2uxlvlulcfo.R.iget(3888)==0&false))) {{
            __CLR4_5_22ux2uxlvlulcfo.R.inc(3889);setFlags(getFlags() | 0x800);
        } }else {{
            __CLR4_5_22ux2uxlvlulcfo.R.inc(3890);setFlags(getFlags() & (0xFFFFFF ^ 0x800));
        }

    }}finally{__CLR4_5_22ux2uxlvlulcfo.R.flushNeeded();}}

    public int getDataOffset() {try{__CLR4_5_22ux2uxlvlulcfo.R.inc(3891);
        __CLR4_5_22ux2uxlvlulcfo.R.inc(3892);return dataOffset;
    }finally{__CLR4_5_22ux2uxlvlulcfo.R.flushNeeded();}}

    public SampleFlags getFirstSampleFlags() {try{__CLR4_5_22ux2uxlvlulcfo.R.inc(3893);
        __CLR4_5_22ux2uxlvlulcfo.R.inc(3894);return firstSampleFlags;
    }finally{__CLR4_5_22ux2uxlvlulcfo.R.flushNeeded();}}

    public void setFirstSampleFlags(SampleFlags firstSampleFlags) {try{__CLR4_5_22ux2uxlvlulcfo.R.inc(3895);
        __CLR4_5_22ux2uxlvlulcfo.R.inc(3896);if ((((firstSampleFlags == null)&&(__CLR4_5_22ux2uxlvlulcfo.R.iget(3897)!=0|true))||(__CLR4_5_22ux2uxlvlulcfo.R.iget(3898)==0&false))) {{
            __CLR4_5_22ux2uxlvlulcfo.R.inc(3899);setFlags(getFlags() & (0xFFFFFF ^ 0x4));
        } }else {{
            __CLR4_5_22ux2uxlvlulcfo.R.inc(3900);setFlags(getFlags() | 0x4);
        }
        }__CLR4_5_22ux2uxlvlulcfo.R.inc(3901);this.firstSampleFlags = firstSampleFlags;
    }finally{__CLR4_5_22ux2uxlvlulcfo.R.flushNeeded();}}

    @Override
    public String toString() {try{__CLR4_5_22ux2uxlvlulcfo.R.inc(3902);
        __CLR4_5_22ux2uxlvlulcfo.R.inc(3903);final StringBuilder sb = new StringBuilder();
        __CLR4_5_22ux2uxlvlulcfo.R.inc(3904);sb.append("TrackRunBox");
        __CLR4_5_22ux2uxlvlulcfo.R.inc(3905);sb.append("{sampleCount=").append(entries.size());
        __CLR4_5_22ux2uxlvlulcfo.R.inc(3906);sb.append(", dataOffset=").append(dataOffset);
        __CLR4_5_22ux2uxlvlulcfo.R.inc(3907);sb.append(", dataOffsetPresent=").append(isDataOffsetPresent());
        __CLR4_5_22ux2uxlvlulcfo.R.inc(3908);sb.append(", sampleSizePresent=").append(isSampleSizePresent());
        __CLR4_5_22ux2uxlvlulcfo.R.inc(3909);sb.append(", sampleDurationPresent=").append(isSampleDurationPresent());
        __CLR4_5_22ux2uxlvlulcfo.R.inc(3910);sb.append(", sampleFlagsPresentPresent=").append(isSampleFlagsPresent());
        __CLR4_5_22ux2uxlvlulcfo.R.inc(3911);sb.append(", sampleCompositionTimeOffsetPresent=").append(isSampleCompositionTimeOffsetPresent());
        __CLR4_5_22ux2uxlvlulcfo.R.inc(3912);sb.append(", firstSampleFlags=").append(firstSampleFlags);
        __CLR4_5_22ux2uxlvlulcfo.R.inc(3913);sb.append('}');
        __CLR4_5_22ux2uxlvlulcfo.R.inc(3914);return sb.toString();
    }finally{__CLR4_5_22ux2uxlvlulcfo.R.flushNeeded();}}

    public void setEntries(List<Entry> entries) {try{__CLR4_5_22ux2uxlvlulcfo.R.inc(3915);
        __CLR4_5_22ux2uxlvlulcfo.R.inc(3916);this.entries = entries;
    }finally{__CLR4_5_22ux2uxlvlulcfo.R.flushNeeded();}}
}
