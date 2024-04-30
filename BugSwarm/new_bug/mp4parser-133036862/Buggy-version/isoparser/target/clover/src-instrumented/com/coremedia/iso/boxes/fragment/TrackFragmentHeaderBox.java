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

/**
 * <h1>4cc = "{@value #TYPE}"</h1>
 * aligned(8) class TrackFragmentHeaderBox
 * extends FullBox('tfhd', 0, tf_flags){
 * unsigned int(32) track_ID;
 * // all the following are optional fields
 * unsigned int(64) base_data_offset;
 * unsigned int(32) sample_description_index;
 * unsigned int(32) default_sample_duration;
 * unsigned int(32) default_sample_size;
 * unsigned int(32) default_sample_flags
 * }
 */
public class TrackFragmentHeaderBox extends AbstractFullBox {public static class __CLR4_5_22m22m2lvlulcbm{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0033\u0033\u0030\u0033\u0036\u0038\u0036\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714448869219L,8589935092L,3552,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static final String TYPE = "tfhd";

    private long trackId;
    private long baseDataOffset = -1;
    private long sampleDescriptionIndex;
    private long defaultSampleDuration = -1;
    private long defaultSampleSize = -1;
    private SampleFlags defaultSampleFlags;
    private boolean durationIsEmpty;
    private boolean defaultBaseIsMoof;

    public TrackFragmentHeaderBox() {
        super(TYPE);__CLR4_5_22m22m2lvlulcbm.R.inc(3387);try{__CLR4_5_22m22m2lvlulcbm.R.inc(3386);
    }finally{__CLR4_5_22m22m2lvlulcbm.R.flushNeeded();}}

    @Override
    protected long getContentSize() {try{__CLR4_5_22m22m2lvlulcbm.R.inc(3388);
        __CLR4_5_22m22m2lvlulcbm.R.inc(3389);long size = 8;
        __CLR4_5_22m22m2lvlulcbm.R.inc(3390);int flags = getFlags();
        __CLR4_5_22m22m2lvlulcbm.R.inc(3391);if (((((flags & 0x1) == 1)&&(__CLR4_5_22m22m2lvlulcbm.R.iget(3392)!=0|true))||(__CLR4_5_22m22m2lvlulcbm.R.iget(3393)==0&false))) {{ //baseDataOffsetPresent
            __CLR4_5_22m22m2lvlulcbm.R.inc(3394);size += 8;
        }
        }__CLR4_5_22m22m2lvlulcbm.R.inc(3395);if (((((flags & 0x2) == 0x2)&&(__CLR4_5_22m22m2lvlulcbm.R.iget(3396)!=0|true))||(__CLR4_5_22m22m2lvlulcbm.R.iget(3397)==0&false))) {{ //sampleDescriptionIndexPresent
            __CLR4_5_22m22m2lvlulcbm.R.inc(3398);size += 4;
        }
        }__CLR4_5_22m22m2lvlulcbm.R.inc(3399);if (((((flags & 0x8) == 0x8)&&(__CLR4_5_22m22m2lvlulcbm.R.iget(3400)!=0|true))||(__CLR4_5_22m22m2lvlulcbm.R.iget(3401)==0&false))) {{ //defaultSampleDurationPresent
            __CLR4_5_22m22m2lvlulcbm.R.inc(3402);size += 4;
        }
        }__CLR4_5_22m22m2lvlulcbm.R.inc(3403);if (((((flags & 0x10) == 0x10)&&(__CLR4_5_22m22m2lvlulcbm.R.iget(3404)!=0|true))||(__CLR4_5_22m22m2lvlulcbm.R.iget(3405)==0&false))) {{ //defaultSampleSizePresent
            __CLR4_5_22m22m2lvlulcbm.R.inc(3406);size += 4;
        }
        }__CLR4_5_22m22m2lvlulcbm.R.inc(3407);if (((((flags & 0x20) == 0x20)&&(__CLR4_5_22m22m2lvlulcbm.R.iget(3408)!=0|true))||(__CLR4_5_22m22m2lvlulcbm.R.iget(3409)==0&false))) {{ //defaultSampleFlagsPresent
            __CLR4_5_22m22m2lvlulcbm.R.inc(3410);size += 4;
        }
        }__CLR4_5_22m22m2lvlulcbm.R.inc(3411);return size;
    }finally{__CLR4_5_22m22m2lvlulcbm.R.flushNeeded();}}


    @Override
    protected void getContent(ByteBuffer byteBuffer) {try{__CLR4_5_22m22m2lvlulcbm.R.inc(3412);
        __CLR4_5_22m22m2lvlulcbm.R.inc(3413);writeVersionAndFlags(byteBuffer);
        __CLR4_5_22m22m2lvlulcbm.R.inc(3414);IsoTypeWriter.writeUInt32(byteBuffer, trackId);

        __CLR4_5_22m22m2lvlulcbm.R.inc(3415);if (((((getFlags() & 0x1) == 1)&&(__CLR4_5_22m22m2lvlulcbm.R.iget(3416)!=0|true))||(__CLR4_5_22m22m2lvlulcbm.R.iget(3417)==0&false))) {{ //baseDataOffsetPresent
            __CLR4_5_22m22m2lvlulcbm.R.inc(3418);IsoTypeWriter.writeUInt64(byteBuffer, getBaseDataOffset());
        }
        }__CLR4_5_22m22m2lvlulcbm.R.inc(3419);if (((((getFlags() & 0x2) == 0x2)&&(__CLR4_5_22m22m2lvlulcbm.R.iget(3420)!=0|true))||(__CLR4_5_22m22m2lvlulcbm.R.iget(3421)==0&false))) {{ //sampleDescriptionIndexPresent
            __CLR4_5_22m22m2lvlulcbm.R.inc(3422);IsoTypeWriter.writeUInt32(byteBuffer, getSampleDescriptionIndex());
        }
        }__CLR4_5_22m22m2lvlulcbm.R.inc(3423);if (((((getFlags() & 0x8) == 0x8)&&(__CLR4_5_22m22m2lvlulcbm.R.iget(3424)!=0|true))||(__CLR4_5_22m22m2lvlulcbm.R.iget(3425)==0&false))) {{ //defaultSampleDurationPresent
            __CLR4_5_22m22m2lvlulcbm.R.inc(3426);IsoTypeWriter.writeUInt32(byteBuffer, getDefaultSampleDuration());
        }
        }__CLR4_5_22m22m2lvlulcbm.R.inc(3427);if (((((getFlags() & 0x10) == 0x10)&&(__CLR4_5_22m22m2lvlulcbm.R.iget(3428)!=0|true))||(__CLR4_5_22m22m2lvlulcbm.R.iget(3429)==0&false))) {{ //defaultSampleSizePresent
            __CLR4_5_22m22m2lvlulcbm.R.inc(3430);IsoTypeWriter.writeUInt32(byteBuffer, getDefaultSampleSize());
        }
        }__CLR4_5_22m22m2lvlulcbm.R.inc(3431);if (((((getFlags() & 0x20) == 0x20)&&(__CLR4_5_22m22m2lvlulcbm.R.iget(3432)!=0|true))||(__CLR4_5_22m22m2lvlulcbm.R.iget(3433)==0&false))) {{ //defaultSampleFlagsPresent
            __CLR4_5_22m22m2lvlulcbm.R.inc(3434);defaultSampleFlags.getContent(byteBuffer);
        }
    }}finally{__CLR4_5_22m22m2lvlulcbm.R.flushNeeded();}}

    @Override
    public void _parseDetails(ByteBuffer content) {try{__CLR4_5_22m22m2lvlulcbm.R.inc(3435);
        __CLR4_5_22m22m2lvlulcbm.R.inc(3436);parseVersionAndFlags(content);
        __CLR4_5_22m22m2lvlulcbm.R.inc(3437);trackId = IsoTypeReader.readUInt32(content);
        __CLR4_5_22m22m2lvlulcbm.R.inc(3438);if (((((getFlags() & 0x1) == 1)&&(__CLR4_5_22m22m2lvlulcbm.R.iget(3439)!=0|true))||(__CLR4_5_22m22m2lvlulcbm.R.iget(3440)==0&false))) {{ //baseDataOffsetPresent
            __CLR4_5_22m22m2lvlulcbm.R.inc(3441);baseDataOffset = IsoTypeReader.readUInt64(content);
        }
        }__CLR4_5_22m22m2lvlulcbm.R.inc(3442);if (((((getFlags() & 0x2) == 0x2)&&(__CLR4_5_22m22m2lvlulcbm.R.iget(3443)!=0|true))||(__CLR4_5_22m22m2lvlulcbm.R.iget(3444)==0&false))) {{ //sampleDescriptionIndexPresent
            __CLR4_5_22m22m2lvlulcbm.R.inc(3445);sampleDescriptionIndex = IsoTypeReader.readUInt32(content);
        }
        }__CLR4_5_22m22m2lvlulcbm.R.inc(3446);if (((((getFlags() & 0x8) == 0x8)&&(__CLR4_5_22m22m2lvlulcbm.R.iget(3447)!=0|true))||(__CLR4_5_22m22m2lvlulcbm.R.iget(3448)==0&false))) {{ //defaultSampleDurationPresent
            __CLR4_5_22m22m2lvlulcbm.R.inc(3449);defaultSampleDuration = IsoTypeReader.readUInt32(content);
        }
        }__CLR4_5_22m22m2lvlulcbm.R.inc(3450);if (((((getFlags() & 0x10) == 0x10)&&(__CLR4_5_22m22m2lvlulcbm.R.iget(3451)!=0|true))||(__CLR4_5_22m22m2lvlulcbm.R.iget(3452)==0&false))) {{ //defaultSampleSizePresent
            __CLR4_5_22m22m2lvlulcbm.R.inc(3453);defaultSampleSize = IsoTypeReader.readUInt32(content);
        }
        }__CLR4_5_22m22m2lvlulcbm.R.inc(3454);if (((((getFlags() & 0x20) == 0x20)&&(__CLR4_5_22m22m2lvlulcbm.R.iget(3455)!=0|true))||(__CLR4_5_22m22m2lvlulcbm.R.iget(3456)==0&false))) {{ //defaultSampleFlagsPresent
            __CLR4_5_22m22m2lvlulcbm.R.inc(3457);defaultSampleFlags = new SampleFlags(content);
        }
        }__CLR4_5_22m22m2lvlulcbm.R.inc(3458);if (((((getFlags() & 0x10000) == 0x10000)&&(__CLR4_5_22m22m2lvlulcbm.R.iget(3459)!=0|true))||(__CLR4_5_22m22m2lvlulcbm.R.iget(3460)==0&false))) {{ //durationIsEmpty
            __CLR4_5_22m22m2lvlulcbm.R.inc(3461);durationIsEmpty = true;
        }
        }__CLR4_5_22m22m2lvlulcbm.R.inc(3462);if (((((getFlags() & 0x20000) == 0x20000)&&(__CLR4_5_22m22m2lvlulcbm.R.iget(3463)!=0|true))||(__CLR4_5_22m22m2lvlulcbm.R.iget(3464)==0&false))) {{ //defaultBaseIsMoof
            __CLR4_5_22m22m2lvlulcbm.R.inc(3465);defaultBaseIsMoof = true;
        }
    }}finally{__CLR4_5_22m22m2lvlulcbm.R.flushNeeded();}}

    public boolean hasBaseDataOffset() {try{__CLR4_5_22m22m2lvlulcbm.R.inc(3466);
        __CLR4_5_22m22m2lvlulcbm.R.inc(3467);return (getFlags() & 0x1) != 0;
    }finally{__CLR4_5_22m22m2lvlulcbm.R.flushNeeded();}}

    public boolean hasSampleDescriptionIndex() {try{__CLR4_5_22m22m2lvlulcbm.R.inc(3468);
        __CLR4_5_22m22m2lvlulcbm.R.inc(3469);return (getFlags() & 0x2) != 0;
    }finally{__CLR4_5_22m22m2lvlulcbm.R.flushNeeded();}}

    public boolean hasDefaultSampleDuration() {try{__CLR4_5_22m22m2lvlulcbm.R.inc(3470);
        __CLR4_5_22m22m2lvlulcbm.R.inc(3471);return (getFlags() & 0x8) != 0;
    }finally{__CLR4_5_22m22m2lvlulcbm.R.flushNeeded();}}

    public boolean hasDefaultSampleSize() {try{__CLR4_5_22m22m2lvlulcbm.R.inc(3472);
        __CLR4_5_22m22m2lvlulcbm.R.inc(3473);return (getFlags() & 0x10) != 0;
    }finally{__CLR4_5_22m22m2lvlulcbm.R.flushNeeded();}}

    public boolean hasDefaultSampleFlags() {try{__CLR4_5_22m22m2lvlulcbm.R.inc(3474);
        __CLR4_5_22m22m2lvlulcbm.R.inc(3475);return (getFlags() & 0x20) != 0;
    }finally{__CLR4_5_22m22m2lvlulcbm.R.flushNeeded();}}

    public long getTrackId() {try{__CLR4_5_22m22m2lvlulcbm.R.inc(3476);
        __CLR4_5_22m22m2lvlulcbm.R.inc(3477);return trackId;
    }finally{__CLR4_5_22m22m2lvlulcbm.R.flushNeeded();}}

    public void setTrackId(long trackId) {try{__CLR4_5_22m22m2lvlulcbm.R.inc(3478);
        __CLR4_5_22m22m2lvlulcbm.R.inc(3479);this.trackId = trackId;
    }finally{__CLR4_5_22m22m2lvlulcbm.R.flushNeeded();}}

    public long getBaseDataOffset() {try{__CLR4_5_22m22m2lvlulcbm.R.inc(3480);
        __CLR4_5_22m22m2lvlulcbm.R.inc(3481);return baseDataOffset;
    }finally{__CLR4_5_22m22m2lvlulcbm.R.flushNeeded();}}

    public void setBaseDataOffset(long baseDataOffset) {try{__CLR4_5_22m22m2lvlulcbm.R.inc(3482);
        __CLR4_5_22m22m2lvlulcbm.R.inc(3483);if ((((baseDataOffset == -1)&&(__CLR4_5_22m22m2lvlulcbm.R.iget(3484)!=0|true))||(__CLR4_5_22m22m2lvlulcbm.R.iget(3485)==0&false))) {{
            __CLR4_5_22m22m2lvlulcbm.R.inc(3486);setFlags(getFlags() & (Integer.MAX_VALUE ^ 0x1));
        } }else {{
            __CLR4_5_22m22m2lvlulcbm.R.inc(3487);setFlags(getFlags() | 0x1); // activate the field
        }
        }__CLR4_5_22m22m2lvlulcbm.R.inc(3488);this.baseDataOffset = baseDataOffset;
    }finally{__CLR4_5_22m22m2lvlulcbm.R.flushNeeded();}}

    public long getSampleDescriptionIndex() {try{__CLR4_5_22m22m2lvlulcbm.R.inc(3489);
        __CLR4_5_22m22m2lvlulcbm.R.inc(3490);return sampleDescriptionIndex;
    }finally{__CLR4_5_22m22m2lvlulcbm.R.flushNeeded();}}

    public void setSampleDescriptionIndex(long sampleDescriptionIndex) {try{__CLR4_5_22m22m2lvlulcbm.R.inc(3491);
        __CLR4_5_22m22m2lvlulcbm.R.inc(3492);if ((((sampleDescriptionIndex == -1)&&(__CLR4_5_22m22m2lvlulcbm.R.iget(3493)!=0|true))||(__CLR4_5_22m22m2lvlulcbm.R.iget(3494)==0&false))) {{
            __CLR4_5_22m22m2lvlulcbm.R.inc(3495);setFlags(getFlags() & (Integer.MAX_VALUE ^ 0x2));
        } }else {{
            __CLR4_5_22m22m2lvlulcbm.R.inc(3496);setFlags(getFlags() | 0x2); // activate the field
        }
        }__CLR4_5_22m22m2lvlulcbm.R.inc(3497);this.sampleDescriptionIndex = sampleDescriptionIndex;
    }finally{__CLR4_5_22m22m2lvlulcbm.R.flushNeeded();}}

    public long getDefaultSampleDuration() {try{__CLR4_5_22m22m2lvlulcbm.R.inc(3498);
        __CLR4_5_22m22m2lvlulcbm.R.inc(3499);return defaultSampleDuration;
    }finally{__CLR4_5_22m22m2lvlulcbm.R.flushNeeded();}}

    public void setDefaultSampleDuration(long defaultSampleDuration) {try{__CLR4_5_22m22m2lvlulcbm.R.inc(3500);


        __CLR4_5_22m22m2lvlulcbm.R.inc(3501);setFlags(getFlags() | 0x8); // activate the field
        __CLR4_5_22m22m2lvlulcbm.R.inc(3502);this.defaultSampleDuration = defaultSampleDuration;
    }finally{__CLR4_5_22m22m2lvlulcbm.R.flushNeeded();}}

    public long getDefaultSampleSize() {try{__CLR4_5_22m22m2lvlulcbm.R.inc(3503);
        __CLR4_5_22m22m2lvlulcbm.R.inc(3504);return defaultSampleSize;
    }finally{__CLR4_5_22m22m2lvlulcbm.R.flushNeeded();}}

    public void setDefaultSampleSize(long defaultSampleSize) {try{__CLR4_5_22m22m2lvlulcbm.R.inc(3505);
        __CLR4_5_22m22m2lvlulcbm.R.inc(3506);if ((((defaultSampleSize != -1)&&(__CLR4_5_22m22m2lvlulcbm.R.iget(3507)!=0|true))||(__CLR4_5_22m22m2lvlulcbm.R.iget(3508)==0&false))) {{
            __CLR4_5_22m22m2lvlulcbm.R.inc(3509);setFlags(getFlags() | 0x10);
        } }else {{
            __CLR4_5_22m22m2lvlulcbm.R.inc(3510);setFlags(getFlags() & (0xFFFFFF ^ 0x10));
        }
        }__CLR4_5_22m22m2lvlulcbm.R.inc(3511);this.defaultSampleSize = defaultSampleSize;
    }finally{__CLR4_5_22m22m2lvlulcbm.R.flushNeeded();}}

    public SampleFlags getDefaultSampleFlags() {try{__CLR4_5_22m22m2lvlulcbm.R.inc(3512);
        __CLR4_5_22m22m2lvlulcbm.R.inc(3513);return defaultSampleFlags;
    }finally{__CLR4_5_22m22m2lvlulcbm.R.flushNeeded();}}

    public void setDefaultSampleFlags(SampleFlags defaultSampleFlags) {try{__CLR4_5_22m22m2lvlulcbm.R.inc(3514);
        __CLR4_5_22m22m2lvlulcbm.R.inc(3515);if ((((defaultSampleFlags != null)&&(__CLR4_5_22m22m2lvlulcbm.R.iget(3516)!=0|true))||(__CLR4_5_22m22m2lvlulcbm.R.iget(3517)==0&false))) {{
            __CLR4_5_22m22m2lvlulcbm.R.inc(3518);setFlags(getFlags() | 0x20);
        } }else {{
            __CLR4_5_22m22m2lvlulcbm.R.inc(3519);setFlags(getFlags() & (0xFFFFFF ^ 0x20));
        }
        }__CLR4_5_22m22m2lvlulcbm.R.inc(3520);this.defaultSampleFlags = defaultSampleFlags;
    }finally{__CLR4_5_22m22m2lvlulcbm.R.flushNeeded();}}

    public boolean isDurationIsEmpty() {try{__CLR4_5_22m22m2lvlulcbm.R.inc(3521);
        __CLR4_5_22m22m2lvlulcbm.R.inc(3522);return durationIsEmpty;
    }finally{__CLR4_5_22m22m2lvlulcbm.R.flushNeeded();}}

    public void setDurationIsEmpty(boolean durationIsEmpty) {try{__CLR4_5_22m22m2lvlulcbm.R.inc(3523);
        __CLR4_5_22m22m2lvlulcbm.R.inc(3524);if ((((defaultBaseIsMoof)&&(__CLR4_5_22m22m2lvlulcbm.R.iget(3525)!=0|true))||(__CLR4_5_22m22m2lvlulcbm.R.iget(3526)==0&false))) {{
            __CLR4_5_22m22m2lvlulcbm.R.inc(3527);setFlags(getFlags() | 0x10000);
        } }else {{
            __CLR4_5_22m22m2lvlulcbm.R.inc(3528);setFlags(getFlags() & (0xFFFFFF ^ 0x10000));
        }
        }__CLR4_5_22m22m2lvlulcbm.R.inc(3529);this.durationIsEmpty = durationIsEmpty;
    }finally{__CLR4_5_22m22m2lvlulcbm.R.flushNeeded();}}

    public boolean isDefaultBaseIsMoof() {try{__CLR4_5_22m22m2lvlulcbm.R.inc(3530);
        __CLR4_5_22m22m2lvlulcbm.R.inc(3531);return defaultBaseIsMoof;
    }finally{__CLR4_5_22m22m2lvlulcbm.R.flushNeeded();}}

    public void setDefaultBaseIsMoof(boolean defaultBaseIsMoof) {try{__CLR4_5_22m22m2lvlulcbm.R.inc(3532);
        __CLR4_5_22m22m2lvlulcbm.R.inc(3533);if ((((defaultBaseIsMoof)&&(__CLR4_5_22m22m2lvlulcbm.R.iget(3534)!=0|true))||(__CLR4_5_22m22m2lvlulcbm.R.iget(3535)==0&false))) {{
            __CLR4_5_22m22m2lvlulcbm.R.inc(3536);setFlags(getFlags() | 0x20000);
        } }else {{
            __CLR4_5_22m22m2lvlulcbm.R.inc(3537);setFlags(getFlags() & (0xFFFFFF ^ 0x20000));
        }
        }__CLR4_5_22m22m2lvlulcbm.R.inc(3538);this.defaultBaseIsMoof = defaultBaseIsMoof;
    }finally{__CLR4_5_22m22m2lvlulcbm.R.flushNeeded();}}

    @Override
    public String toString() {try{__CLR4_5_22m22m2lvlulcbm.R.inc(3539);
        __CLR4_5_22m22m2lvlulcbm.R.inc(3540);final StringBuilder sb = new StringBuilder();
        __CLR4_5_22m22m2lvlulcbm.R.inc(3541);sb.append("TrackFragmentHeaderBox");
        __CLR4_5_22m22m2lvlulcbm.R.inc(3542);sb.append("{trackId=").append(trackId);
        __CLR4_5_22m22m2lvlulcbm.R.inc(3543);sb.append(", baseDataOffset=").append(baseDataOffset);
        __CLR4_5_22m22m2lvlulcbm.R.inc(3544);sb.append(", sampleDescriptionIndex=").append(sampleDescriptionIndex);
        __CLR4_5_22m22m2lvlulcbm.R.inc(3545);sb.append(", defaultSampleDuration=").append(defaultSampleDuration);
        __CLR4_5_22m22m2lvlulcbm.R.inc(3546);sb.append(", defaultSampleSize=").append(defaultSampleSize);
        __CLR4_5_22m22m2lvlulcbm.R.inc(3547);sb.append(", defaultSampleFlags=").append(defaultSampleFlags);
        __CLR4_5_22m22m2lvlulcbm.R.inc(3548);sb.append(", durationIsEmpty=").append(durationIsEmpty);
        __CLR4_5_22m22m2lvlulcbm.R.inc(3549);sb.append(", defaultBaseIsMoof=").append(defaultBaseIsMoof);
        __CLR4_5_22m22m2lvlulcbm.R.inc(3550);sb.append('}');
        __CLR4_5_22m22m2lvlulcbm.R.inc(3551);return sb.toString();
    }finally{__CLR4_5_22m22m2lvlulcbm.R.flushNeeded();}}

}
