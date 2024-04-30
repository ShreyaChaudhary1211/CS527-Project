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

public class TrackRunBox extends AbstractFullBox {public static class __CLR4_5_22u02u0lvl9efma{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0030\u0037\u0038\u0035\u0039\u0030\u0037\u0038\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714413275835L,8589935092L,3884,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static final String TYPE = "trun";
    private int dataOffset;
    private SampleFlags firstSampleFlags;
    private List<Entry> entries = new ArrayList<Entry>();


    public List<Entry> getEntries() {try{__CLR4_5_22u02u0lvl9efma.R.inc(3672);
        __CLR4_5_22u02u0lvl9efma.R.inc(3673);return entries;
    }finally{__CLR4_5_22u02u0lvl9efma.R.flushNeeded();}}

    public static class Entry {
        private long sampleDuration;
        private long sampleSize;
        private SampleFlags sampleFlags;
        private long sampleCompositionTimeOffset;

        public Entry() {try{__CLR4_5_22u02u0lvl9efma.R.inc(3674);
        }finally{__CLR4_5_22u02u0lvl9efma.R.flushNeeded();}}

        public Entry(long sampleDuration, long sampleSize, SampleFlags sampleFlags, int sampleCompositionTimeOffset) {try{__CLR4_5_22u02u0lvl9efma.R.inc(3675);
            __CLR4_5_22u02u0lvl9efma.R.inc(3676);this.sampleDuration = sampleDuration;
            __CLR4_5_22u02u0lvl9efma.R.inc(3677);this.sampleSize = sampleSize;
            __CLR4_5_22u02u0lvl9efma.R.inc(3678);this.sampleFlags = sampleFlags;
            __CLR4_5_22u02u0lvl9efma.R.inc(3679);this.sampleCompositionTimeOffset = sampleCompositionTimeOffset;
        }finally{__CLR4_5_22u02u0lvl9efma.R.flushNeeded();}}

        public long getSampleDuration() {try{__CLR4_5_22u02u0lvl9efma.R.inc(3680);
            __CLR4_5_22u02u0lvl9efma.R.inc(3681);return sampleDuration;
        }finally{__CLR4_5_22u02u0lvl9efma.R.flushNeeded();}}

        public long getSampleSize() {try{__CLR4_5_22u02u0lvl9efma.R.inc(3682);
            __CLR4_5_22u02u0lvl9efma.R.inc(3683);return sampleSize;
        }finally{__CLR4_5_22u02u0lvl9efma.R.flushNeeded();}}

        public SampleFlags getSampleFlags() {try{__CLR4_5_22u02u0lvl9efma.R.inc(3684);
            __CLR4_5_22u02u0lvl9efma.R.inc(3685);return sampleFlags;
        }finally{__CLR4_5_22u02u0lvl9efma.R.flushNeeded();}}

        public long getSampleCompositionTimeOffset() {try{__CLR4_5_22u02u0lvl9efma.R.inc(3686);
            __CLR4_5_22u02u0lvl9efma.R.inc(3687);return sampleCompositionTimeOffset;
        }finally{__CLR4_5_22u02u0lvl9efma.R.flushNeeded();}}

        public void setSampleDuration(long sampleDuration) {try{__CLR4_5_22u02u0lvl9efma.R.inc(3688);
            __CLR4_5_22u02u0lvl9efma.R.inc(3689);this.sampleDuration = sampleDuration;
        }finally{__CLR4_5_22u02u0lvl9efma.R.flushNeeded();}}

        public void setSampleSize(long sampleSize) {try{__CLR4_5_22u02u0lvl9efma.R.inc(3690);
            __CLR4_5_22u02u0lvl9efma.R.inc(3691);this.sampleSize = sampleSize;
        }finally{__CLR4_5_22u02u0lvl9efma.R.flushNeeded();}}

        public void setSampleFlags(SampleFlags sampleFlags) {try{__CLR4_5_22u02u0lvl9efma.R.inc(3692);
            __CLR4_5_22u02u0lvl9efma.R.inc(3693);this.sampleFlags = sampleFlags;
        }finally{__CLR4_5_22u02u0lvl9efma.R.flushNeeded();}}

        public void setSampleCompositionTimeOffset(int sampleCompositionTimeOffset) {try{__CLR4_5_22u02u0lvl9efma.R.inc(3694);
            __CLR4_5_22u02u0lvl9efma.R.inc(3695);this.sampleCompositionTimeOffset = sampleCompositionTimeOffset;
        }finally{__CLR4_5_22u02u0lvl9efma.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_5_22u02u0lvl9efma.R.inc(3696);
            __CLR4_5_22u02u0lvl9efma.R.inc(3697);return "Entry{" +
                    "duration=" + sampleDuration +
                    ", size=" + sampleSize +
                    ", dlags=" + sampleFlags +
                    ", compTimeOffset=" + sampleCompositionTimeOffset +
                    '}';
        }finally{__CLR4_5_22u02u0lvl9efma.R.flushNeeded();}}
    }

    public void setDataOffset(int dataOffset) {try{__CLR4_5_22u02u0lvl9efma.R.inc(3698);
        __CLR4_5_22u02u0lvl9efma.R.inc(3699);if ((((dataOffset == -1)&&(__CLR4_5_22u02u0lvl9efma.R.iget(3700)!=0|true))||(__CLR4_5_22u02u0lvl9efma.R.iget(3701)==0&false))) {{
            __CLR4_5_22u02u0lvl9efma.R.inc(3702);setFlags(getFlags() & (0xFFFFFF ^ 1));
        } }else {{
            __CLR4_5_22u02u0lvl9efma.R.inc(3703);setFlags(getFlags() | 0x1); // turn on dataoffset
        }
        }__CLR4_5_22u02u0lvl9efma.R.inc(3704);this.dataOffset = dataOffset;
    }finally{__CLR4_5_22u02u0lvl9efma.R.flushNeeded();}}

    public long[] getSampleCompositionTimeOffsets() {try{__CLR4_5_22u02u0lvl9efma.R.inc(3705);
        __CLR4_5_22u02u0lvl9efma.R.inc(3706);if ((((isSampleCompositionTimeOffsetPresent())&&(__CLR4_5_22u02u0lvl9efma.R.iget(3707)!=0|true))||(__CLR4_5_22u02u0lvl9efma.R.iget(3708)==0&false))) {{
            __CLR4_5_22u02u0lvl9efma.R.inc(3709);long[] result = new long[entries.size()];

            __CLR4_5_22u02u0lvl9efma.R.inc(3710);for (int i = 0; (((i < result.length)&&(__CLR4_5_22u02u0lvl9efma.R.iget(3711)!=0|true))||(__CLR4_5_22u02u0lvl9efma.R.iget(3712)==0&false)); i++) {{
                __CLR4_5_22u02u0lvl9efma.R.inc(3713);result[i] = entries.get(i).getSampleCompositionTimeOffset();
            }
            }__CLR4_5_22u02u0lvl9efma.R.inc(3714);return result;
        }
        }__CLR4_5_22u02u0lvl9efma.R.inc(3715);return null;
    }finally{__CLR4_5_22u02u0lvl9efma.R.flushNeeded();}}

    public TrackRunBox() {
        super(TYPE);__CLR4_5_22u02u0lvl9efma.R.inc(3717);try{__CLR4_5_22u02u0lvl9efma.R.inc(3716);
    }finally{__CLR4_5_22u02u0lvl9efma.R.flushNeeded();}}

    protected long getContentSize() {try{__CLR4_5_22u02u0lvl9efma.R.inc(3718);
        __CLR4_5_22u02u0lvl9efma.R.inc(3719);long size = 8;
        __CLR4_5_22u02u0lvl9efma.R.inc(3720);int flags = getFlags();

        __CLR4_5_22u02u0lvl9efma.R.inc(3721);if (((((flags & 0x1) == 0x1)&&(__CLR4_5_22u02u0lvl9efma.R.iget(3722)!=0|true))||(__CLR4_5_22u02u0lvl9efma.R.iget(3723)==0&false))) {{ //dataOffsetPresent
            __CLR4_5_22u02u0lvl9efma.R.inc(3724);size += 4;
        }
        }__CLR4_5_22u02u0lvl9efma.R.inc(3725);if (((((flags & 0x4) == 0x4)&&(__CLR4_5_22u02u0lvl9efma.R.iget(3726)!=0|true))||(__CLR4_5_22u02u0lvl9efma.R.iget(3727)==0&false))) {{ //firstSampleFlagsPresent
            __CLR4_5_22u02u0lvl9efma.R.inc(3728);size += 4;
        }

        }__CLR4_5_22u02u0lvl9efma.R.inc(3729);long entrySize = 0;
        __CLR4_5_22u02u0lvl9efma.R.inc(3730);if (((((flags & 0x100) == 0x100)&&(__CLR4_5_22u02u0lvl9efma.R.iget(3731)!=0|true))||(__CLR4_5_22u02u0lvl9efma.R.iget(3732)==0&false))) {{ //sampleDurationPresent
            __CLR4_5_22u02u0lvl9efma.R.inc(3733);entrySize += 4;
        }
        }__CLR4_5_22u02u0lvl9efma.R.inc(3734);if (((((flags & 0x200) == 0x200)&&(__CLR4_5_22u02u0lvl9efma.R.iget(3735)!=0|true))||(__CLR4_5_22u02u0lvl9efma.R.iget(3736)==0&false))) {{ //sampleSizePresent
            __CLR4_5_22u02u0lvl9efma.R.inc(3737);entrySize += 4;
        }
        }__CLR4_5_22u02u0lvl9efma.R.inc(3738);if (((((flags & 0x400) == 0x400)&&(__CLR4_5_22u02u0lvl9efma.R.iget(3739)!=0|true))||(__CLR4_5_22u02u0lvl9efma.R.iget(3740)==0&false))) {{ //sampleFlagsPresent
            __CLR4_5_22u02u0lvl9efma.R.inc(3741);entrySize += 4;
        }
        }__CLR4_5_22u02u0lvl9efma.R.inc(3742);if (((((flags & 0x800) == 0x800)&&(__CLR4_5_22u02u0lvl9efma.R.iget(3743)!=0|true))||(__CLR4_5_22u02u0lvl9efma.R.iget(3744)==0&false))) {{ //sampleCompositionTimeOffsetPresent
            __CLR4_5_22u02u0lvl9efma.R.inc(3745);entrySize += 4;
        }
        }__CLR4_5_22u02u0lvl9efma.R.inc(3746);size += entrySize * entries.size();
        __CLR4_5_22u02u0lvl9efma.R.inc(3747);return size;
    }finally{__CLR4_5_22u02u0lvl9efma.R.flushNeeded();}}

    protected void getContent(ByteBuffer byteBuffer) {try{__CLR4_5_22u02u0lvl9efma.R.inc(3748);
        __CLR4_5_22u02u0lvl9efma.R.inc(3749);writeVersionAndFlags(byteBuffer);
        __CLR4_5_22u02u0lvl9efma.R.inc(3750);IsoTypeWriter.writeUInt32(byteBuffer, entries.size());
        __CLR4_5_22u02u0lvl9efma.R.inc(3751);int flags = getFlags();

        __CLR4_5_22u02u0lvl9efma.R.inc(3752);if (((((flags & 0x1) == 1)&&(__CLR4_5_22u02u0lvl9efma.R.iget(3753)!=0|true))||(__CLR4_5_22u02u0lvl9efma.R.iget(3754)==0&false))) {{ //dataOffsetPresent
            __CLR4_5_22u02u0lvl9efma.R.inc(3755);IsoTypeWriter.writeUInt32(byteBuffer, dataOffset);
        }
        }__CLR4_5_22u02u0lvl9efma.R.inc(3756);if (((((flags & 0x4) == 0x4)&&(__CLR4_5_22u02u0lvl9efma.R.iget(3757)!=0|true))||(__CLR4_5_22u02u0lvl9efma.R.iget(3758)==0&false))) {{ //firstSampleFlagsPresent
            __CLR4_5_22u02u0lvl9efma.R.inc(3759);firstSampleFlags.getContent(byteBuffer);
        }

        }__CLR4_5_22u02u0lvl9efma.R.inc(3760);for (Entry entry : entries) {{
            __CLR4_5_22u02u0lvl9efma.R.inc(3761);if (((((flags & 0x100) == 0x100)&&(__CLR4_5_22u02u0lvl9efma.R.iget(3762)!=0|true))||(__CLR4_5_22u02u0lvl9efma.R.iget(3763)==0&false))) {{ //sampleDurationPresent
                __CLR4_5_22u02u0lvl9efma.R.inc(3764);IsoTypeWriter.writeUInt32(byteBuffer, entry.sampleDuration);
            }
            }__CLR4_5_22u02u0lvl9efma.R.inc(3765);if (((((flags & 0x200) == 0x200)&&(__CLR4_5_22u02u0lvl9efma.R.iget(3766)!=0|true))||(__CLR4_5_22u02u0lvl9efma.R.iget(3767)==0&false))) {{ //sampleSizePresent
                __CLR4_5_22u02u0lvl9efma.R.inc(3768);IsoTypeWriter.writeUInt32(byteBuffer, entry.sampleSize);
            }
            }__CLR4_5_22u02u0lvl9efma.R.inc(3769);if (((((flags & 0x400) == 0x400)&&(__CLR4_5_22u02u0lvl9efma.R.iget(3770)!=0|true))||(__CLR4_5_22u02u0lvl9efma.R.iget(3771)==0&false))) {{ //sampleFlagsPresent
                __CLR4_5_22u02u0lvl9efma.R.inc(3772);entry.sampleFlags.getContent(byteBuffer);
            }
            }__CLR4_5_22u02u0lvl9efma.R.inc(3773);if (((((flags & 0x800) == 0x800)&&(__CLR4_5_22u02u0lvl9efma.R.iget(3774)!=0|true))||(__CLR4_5_22u02u0lvl9efma.R.iget(3775)==0&false))) {{ //sampleCompositionTimeOffsetPresent
                __CLR4_5_22u02u0lvl9efma.R.inc(3776);if ((((getVersion() == 0)&&(__CLR4_5_22u02u0lvl9efma.R.iget(3777)!=0|true))||(__CLR4_5_22u02u0lvl9efma.R.iget(3778)==0&false))) {{
                    __CLR4_5_22u02u0lvl9efma.R.inc(3779);IsoTypeWriter.writeUInt32(byteBuffer, entry.sampleCompositionTimeOffset);
                } }else {{
                    __CLR4_5_22u02u0lvl9efma.R.inc(3780);byteBuffer.putInt((int) entry.sampleCompositionTimeOffset);
                }
            }}
        }}
    }}finally{__CLR4_5_22u02u0lvl9efma.R.flushNeeded();}}

    @Override
    public void _parseDetails(ByteBuffer content) {try{__CLR4_5_22u02u0lvl9efma.R.inc(3781);
        __CLR4_5_22u02u0lvl9efma.R.inc(3782);parseVersionAndFlags(content);
        __CLR4_5_22u02u0lvl9efma.R.inc(3783);long sampleCount = IsoTypeReader.readUInt32(content);

        __CLR4_5_22u02u0lvl9efma.R.inc(3784);if (((((getFlags() & 0x1) == 1)&&(__CLR4_5_22u02u0lvl9efma.R.iget(3785)!=0|true))||(__CLR4_5_22u02u0lvl9efma.R.iget(3786)==0&false))) {{ //dataOffsetPresent
            __CLR4_5_22u02u0lvl9efma.R.inc(3787);dataOffset = l2i(IsoTypeReader.readUInt32(content));
        } }else {{
            __CLR4_5_22u02u0lvl9efma.R.inc(3788);dataOffset = -1;
        }
        }__CLR4_5_22u02u0lvl9efma.R.inc(3789);if (((((getFlags() & 0x4) == 0x4)&&(__CLR4_5_22u02u0lvl9efma.R.iget(3790)!=0|true))||(__CLR4_5_22u02u0lvl9efma.R.iget(3791)==0&false))) {{ //firstSampleFlagsPresent
            __CLR4_5_22u02u0lvl9efma.R.inc(3792);firstSampleFlags = new SampleFlags(content);
        }

        }__CLR4_5_22u02u0lvl9efma.R.inc(3793);for (int i = 0; (((i < sampleCount)&&(__CLR4_5_22u02u0lvl9efma.R.iget(3794)!=0|true))||(__CLR4_5_22u02u0lvl9efma.R.iget(3795)==0&false)); i++) {{
            __CLR4_5_22u02u0lvl9efma.R.inc(3796);Entry entry = new Entry();
            __CLR4_5_22u02u0lvl9efma.R.inc(3797);if (((((getFlags() & 0x100) == 0x100)&&(__CLR4_5_22u02u0lvl9efma.R.iget(3798)!=0|true))||(__CLR4_5_22u02u0lvl9efma.R.iget(3799)==0&false))) {{ //sampleDurationPresent
                __CLR4_5_22u02u0lvl9efma.R.inc(3800);entry.sampleDuration = IsoTypeReader.readUInt32(content);
            }
            }__CLR4_5_22u02u0lvl9efma.R.inc(3801);if (((((getFlags() & 0x200) == 0x200)&&(__CLR4_5_22u02u0lvl9efma.R.iget(3802)!=0|true))||(__CLR4_5_22u02u0lvl9efma.R.iget(3803)==0&false))) {{ //sampleSizePresent
                __CLR4_5_22u02u0lvl9efma.R.inc(3804);entry.sampleSize = IsoTypeReader.readUInt32(content);
            }
            }__CLR4_5_22u02u0lvl9efma.R.inc(3805);if (((((getFlags() & 0x400) == 0x400)&&(__CLR4_5_22u02u0lvl9efma.R.iget(3806)!=0|true))||(__CLR4_5_22u02u0lvl9efma.R.iget(3807)==0&false))) {{ //sampleFlagsPresent
                __CLR4_5_22u02u0lvl9efma.R.inc(3808);entry.sampleFlags = new SampleFlags(content);
            }
            }__CLR4_5_22u02u0lvl9efma.R.inc(3809);if (((((getFlags() & 0x800) == 0x800)&&(__CLR4_5_22u02u0lvl9efma.R.iget(3810)!=0|true))||(__CLR4_5_22u02u0lvl9efma.R.iget(3811)==0&false))) {{ //sampleCompositionTimeOffsetPresent
                __CLR4_5_22u02u0lvl9efma.R.inc(3812);entry.sampleCompositionTimeOffset = content.getInt();
            }
            }__CLR4_5_22u02u0lvl9efma.R.inc(3813);entries.add(entry);
        }

    }}finally{__CLR4_5_22u02u0lvl9efma.R.flushNeeded();}}

    public long getSampleCount() {try{__CLR4_5_22u02u0lvl9efma.R.inc(3814);
        __CLR4_5_22u02u0lvl9efma.R.inc(3815);return entries.size();
    }finally{__CLR4_5_22u02u0lvl9efma.R.flushNeeded();}}

    public boolean isDataOffsetPresent() {try{__CLR4_5_22u02u0lvl9efma.R.inc(3816);
        __CLR4_5_22u02u0lvl9efma.R.inc(3817);return (getFlags() & 0x1) == 1;
    }finally{__CLR4_5_22u02u0lvl9efma.R.flushNeeded();}}

    public boolean isFirstSampleFlagsPresent() {try{__CLR4_5_22u02u0lvl9efma.R.inc(3818);
        __CLR4_5_22u02u0lvl9efma.R.inc(3819);return (getFlags() & 0x4) == 0x4;
    }finally{__CLR4_5_22u02u0lvl9efma.R.flushNeeded();}}


    public boolean isSampleSizePresent() {try{__CLR4_5_22u02u0lvl9efma.R.inc(3820);
        __CLR4_5_22u02u0lvl9efma.R.inc(3821);return (getFlags() & 0x200) == 0x200;
    }finally{__CLR4_5_22u02u0lvl9efma.R.flushNeeded();}}

    public boolean isSampleDurationPresent() {try{__CLR4_5_22u02u0lvl9efma.R.inc(3822);
        __CLR4_5_22u02u0lvl9efma.R.inc(3823);return (getFlags() & 0x100) == 0x100;
    }finally{__CLR4_5_22u02u0lvl9efma.R.flushNeeded();}}

    public boolean isSampleFlagsPresent() {try{__CLR4_5_22u02u0lvl9efma.R.inc(3824);
        __CLR4_5_22u02u0lvl9efma.R.inc(3825);return (getFlags() & 0x400) == 0x400;
    }finally{__CLR4_5_22u02u0lvl9efma.R.flushNeeded();}}

    public boolean isSampleCompositionTimeOffsetPresent() {try{__CLR4_5_22u02u0lvl9efma.R.inc(3826);
        __CLR4_5_22u02u0lvl9efma.R.inc(3827);return (getFlags() & 0x800) == 0x800;
    }finally{__CLR4_5_22u02u0lvl9efma.R.flushNeeded();}}

    public void setDataOffsetPresent(boolean v) {try{__CLR4_5_22u02u0lvl9efma.R.inc(3828);
        __CLR4_5_22u02u0lvl9efma.R.inc(3829);if ((((v)&&(__CLR4_5_22u02u0lvl9efma.R.iget(3830)!=0|true))||(__CLR4_5_22u02u0lvl9efma.R.iget(3831)==0&false))) {{
            __CLR4_5_22u02u0lvl9efma.R.inc(3832);setFlags(getFlags() | 0x01);
        } }else {{
            __CLR4_5_22u02u0lvl9efma.R.inc(3833);setFlags(getFlags() & (0xFFFFFF ^ 0x1));
        }
    }}finally{__CLR4_5_22u02u0lvl9efma.R.flushNeeded();}}

    public void setSampleSizePresent(boolean v) {try{__CLR4_5_22u02u0lvl9efma.R.inc(3834);
        __CLR4_5_22u02u0lvl9efma.R.inc(3835);if ((((v)&&(__CLR4_5_22u02u0lvl9efma.R.iget(3836)!=0|true))||(__CLR4_5_22u02u0lvl9efma.R.iget(3837)==0&false))) {{
            __CLR4_5_22u02u0lvl9efma.R.inc(3838);setFlags(getFlags() | 0x200);
        } }else {{
            __CLR4_5_22u02u0lvl9efma.R.inc(3839);setFlags(getFlags() & (0xFFFFFF ^ 0x200));
        }
    }}finally{__CLR4_5_22u02u0lvl9efma.R.flushNeeded();}}

    public void setSampleDurationPresent(boolean v) {try{__CLR4_5_22u02u0lvl9efma.R.inc(3840);

        __CLR4_5_22u02u0lvl9efma.R.inc(3841);if ((((v)&&(__CLR4_5_22u02u0lvl9efma.R.iget(3842)!=0|true))||(__CLR4_5_22u02u0lvl9efma.R.iget(3843)==0&false))) {{
            __CLR4_5_22u02u0lvl9efma.R.inc(3844);setFlags(getFlags() | 0x100);
        } }else {{
            __CLR4_5_22u02u0lvl9efma.R.inc(3845);setFlags(getFlags() & (0xFFFFFF ^ 0x100));
        }
    }}finally{__CLR4_5_22u02u0lvl9efma.R.flushNeeded();}}

    public void setSampleFlagsPresent(boolean v) {try{__CLR4_5_22u02u0lvl9efma.R.inc(3846);
        __CLR4_5_22u02u0lvl9efma.R.inc(3847);if ((((v)&&(__CLR4_5_22u02u0lvl9efma.R.iget(3848)!=0|true))||(__CLR4_5_22u02u0lvl9efma.R.iget(3849)==0&false))) {{
            __CLR4_5_22u02u0lvl9efma.R.inc(3850);setFlags(getFlags() | 0x400);
        } }else {{
            __CLR4_5_22u02u0lvl9efma.R.inc(3851);setFlags(getFlags() & (0xFFFFFF ^ 0x400));
        }
    }}finally{__CLR4_5_22u02u0lvl9efma.R.flushNeeded();}}

    public void setSampleCompositionTimeOffsetPresent(boolean v) {try{__CLR4_5_22u02u0lvl9efma.R.inc(3852);
        __CLR4_5_22u02u0lvl9efma.R.inc(3853);if ((((v)&&(__CLR4_5_22u02u0lvl9efma.R.iget(3854)!=0|true))||(__CLR4_5_22u02u0lvl9efma.R.iget(3855)==0&false))) {{
            __CLR4_5_22u02u0lvl9efma.R.inc(3856);setFlags(getFlags() | 0x800);
        } }else {{
            __CLR4_5_22u02u0lvl9efma.R.inc(3857);setFlags(getFlags() & (0xFFFFFF ^ 0x800));
        }

    }}finally{__CLR4_5_22u02u0lvl9efma.R.flushNeeded();}}

    public int getDataOffset() {try{__CLR4_5_22u02u0lvl9efma.R.inc(3858);
        __CLR4_5_22u02u0lvl9efma.R.inc(3859);return dataOffset;
    }finally{__CLR4_5_22u02u0lvl9efma.R.flushNeeded();}}

    public SampleFlags getFirstSampleFlags() {try{__CLR4_5_22u02u0lvl9efma.R.inc(3860);
        __CLR4_5_22u02u0lvl9efma.R.inc(3861);return firstSampleFlags;
    }finally{__CLR4_5_22u02u0lvl9efma.R.flushNeeded();}}

    public void setFirstSampleFlags(SampleFlags firstSampleFlags) {try{__CLR4_5_22u02u0lvl9efma.R.inc(3862);
        __CLR4_5_22u02u0lvl9efma.R.inc(3863);if ((((firstSampleFlags == null)&&(__CLR4_5_22u02u0lvl9efma.R.iget(3864)!=0|true))||(__CLR4_5_22u02u0lvl9efma.R.iget(3865)==0&false))) {{
            __CLR4_5_22u02u0lvl9efma.R.inc(3866);setFlags(getFlags() & (0xFFFFFF ^ 0x4));
        } }else {{
            __CLR4_5_22u02u0lvl9efma.R.inc(3867);setFlags(getFlags() | 0x4);
        }
        }__CLR4_5_22u02u0lvl9efma.R.inc(3868);this.firstSampleFlags = firstSampleFlags;
    }finally{__CLR4_5_22u02u0lvl9efma.R.flushNeeded();}}

    @Override
    public String toString() {try{__CLR4_5_22u02u0lvl9efma.R.inc(3869);
        __CLR4_5_22u02u0lvl9efma.R.inc(3870);final StringBuilder sb = new StringBuilder();
        __CLR4_5_22u02u0lvl9efma.R.inc(3871);sb.append("TrackRunBox");
        __CLR4_5_22u02u0lvl9efma.R.inc(3872);sb.append("{sampleCount=").append(entries.size());
        __CLR4_5_22u02u0lvl9efma.R.inc(3873);sb.append(", dataOffset=").append(dataOffset);
        __CLR4_5_22u02u0lvl9efma.R.inc(3874);sb.append(", dataOffsetPresent=").append(isDataOffsetPresent());
        __CLR4_5_22u02u0lvl9efma.R.inc(3875);sb.append(", sampleSizePresent=").append(isSampleSizePresent());
        __CLR4_5_22u02u0lvl9efma.R.inc(3876);sb.append(", sampleDurationPresent=").append(isSampleDurationPresent());
        __CLR4_5_22u02u0lvl9efma.R.inc(3877);sb.append(", sampleFlagsPresentPresent=").append(isSampleFlagsPresent());
        __CLR4_5_22u02u0lvl9efma.R.inc(3878);sb.append(", sampleCompositionTimeOffsetPresent=").append(isSampleCompositionTimeOffsetPresent());
        __CLR4_5_22u02u0lvl9efma.R.inc(3879);sb.append(", firstSampleFlags=").append(firstSampleFlags);
        __CLR4_5_22u02u0lvl9efma.R.inc(3880);sb.append('}');
        __CLR4_5_22u02u0lvl9efma.R.inc(3881);return sb.toString();
    }finally{__CLR4_5_22u02u0lvl9efma.R.flushNeeded();}}

    public void setEntries(List<Entry> entries) {try{__CLR4_5_22u02u0lvl9efma.R.inc(3882);
        __CLR4_5_22u02u0lvl9efma.R.inc(3883);this.entries = entries;
    }finally{__CLR4_5_22u02u0lvl9efma.R.flushNeeded();}}
}
