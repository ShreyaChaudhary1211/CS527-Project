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
public class TrackFragmentHeaderBox extends AbstractFullBox {public static class __CLR4_5_22ll2lllvl9efkt{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0030\u0037\u0038\u0035\u0039\u0030\u0037\u0038\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714413275835L,8589935092L,3519,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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
        super(TYPE);__CLR4_5_22ll2lllvl9efkt.R.inc(3370);try{__CLR4_5_22ll2lllvl9efkt.R.inc(3369);
    }finally{__CLR4_5_22ll2lllvl9efkt.R.flushNeeded();}}

    @Override
    protected long getContentSize() {try{__CLR4_5_22ll2lllvl9efkt.R.inc(3371);
        __CLR4_5_22ll2lllvl9efkt.R.inc(3372);long size = 8;
        __CLR4_5_22ll2lllvl9efkt.R.inc(3373);int flags = getFlags();
        __CLR4_5_22ll2lllvl9efkt.R.inc(3374);if (((((flags & 0x1) == 1)&&(__CLR4_5_22ll2lllvl9efkt.R.iget(3375)!=0|true))||(__CLR4_5_22ll2lllvl9efkt.R.iget(3376)==0&false))) {{ //baseDataOffsetPresent
            __CLR4_5_22ll2lllvl9efkt.R.inc(3377);size += 8;
        }
        }__CLR4_5_22ll2lllvl9efkt.R.inc(3378);if (((((flags & 0x2) == 0x2)&&(__CLR4_5_22ll2lllvl9efkt.R.iget(3379)!=0|true))||(__CLR4_5_22ll2lllvl9efkt.R.iget(3380)==0&false))) {{ //sampleDescriptionIndexPresent
            __CLR4_5_22ll2lllvl9efkt.R.inc(3381);size += 4;
        }
        }__CLR4_5_22ll2lllvl9efkt.R.inc(3382);if (((((flags & 0x8) == 0x8)&&(__CLR4_5_22ll2lllvl9efkt.R.iget(3383)!=0|true))||(__CLR4_5_22ll2lllvl9efkt.R.iget(3384)==0&false))) {{ //defaultSampleDurationPresent
            __CLR4_5_22ll2lllvl9efkt.R.inc(3385);size += 4;
        }
        }__CLR4_5_22ll2lllvl9efkt.R.inc(3386);if (((((flags & 0x10) == 0x10)&&(__CLR4_5_22ll2lllvl9efkt.R.iget(3387)!=0|true))||(__CLR4_5_22ll2lllvl9efkt.R.iget(3388)==0&false))) {{ //defaultSampleSizePresent
            __CLR4_5_22ll2lllvl9efkt.R.inc(3389);size += 4;
        }
        }__CLR4_5_22ll2lllvl9efkt.R.inc(3390);if (((((flags & 0x20) == 0x20)&&(__CLR4_5_22ll2lllvl9efkt.R.iget(3391)!=0|true))||(__CLR4_5_22ll2lllvl9efkt.R.iget(3392)==0&false))) {{ //defaultSampleFlagsPresent
            __CLR4_5_22ll2lllvl9efkt.R.inc(3393);size += 4;
        }
        }__CLR4_5_22ll2lllvl9efkt.R.inc(3394);return size;
    }finally{__CLR4_5_22ll2lllvl9efkt.R.flushNeeded();}}


    @Override
    protected void getContent(ByteBuffer byteBuffer) {try{__CLR4_5_22ll2lllvl9efkt.R.inc(3395);
        __CLR4_5_22ll2lllvl9efkt.R.inc(3396);writeVersionAndFlags(byteBuffer);
        __CLR4_5_22ll2lllvl9efkt.R.inc(3397);IsoTypeWriter.writeUInt32(byteBuffer, trackId);

        __CLR4_5_22ll2lllvl9efkt.R.inc(3398);if (((((getFlags() & 0x1) == 1)&&(__CLR4_5_22ll2lllvl9efkt.R.iget(3399)!=0|true))||(__CLR4_5_22ll2lllvl9efkt.R.iget(3400)==0&false))) {{ //baseDataOffsetPresent
            __CLR4_5_22ll2lllvl9efkt.R.inc(3401);IsoTypeWriter.writeUInt64(byteBuffer, getBaseDataOffset());
        }
        }__CLR4_5_22ll2lllvl9efkt.R.inc(3402);if (((((getFlags() & 0x2) == 0x2)&&(__CLR4_5_22ll2lllvl9efkt.R.iget(3403)!=0|true))||(__CLR4_5_22ll2lllvl9efkt.R.iget(3404)==0&false))) {{ //sampleDescriptionIndexPresent
            __CLR4_5_22ll2lllvl9efkt.R.inc(3405);IsoTypeWriter.writeUInt32(byteBuffer, getSampleDescriptionIndex());
        }
        }__CLR4_5_22ll2lllvl9efkt.R.inc(3406);if (((((getFlags() & 0x8) == 0x8)&&(__CLR4_5_22ll2lllvl9efkt.R.iget(3407)!=0|true))||(__CLR4_5_22ll2lllvl9efkt.R.iget(3408)==0&false))) {{ //defaultSampleDurationPresent
            __CLR4_5_22ll2lllvl9efkt.R.inc(3409);IsoTypeWriter.writeUInt32(byteBuffer, getDefaultSampleDuration());
        }
        }__CLR4_5_22ll2lllvl9efkt.R.inc(3410);if (((((getFlags() & 0x10) == 0x10)&&(__CLR4_5_22ll2lllvl9efkt.R.iget(3411)!=0|true))||(__CLR4_5_22ll2lllvl9efkt.R.iget(3412)==0&false))) {{ //defaultSampleSizePresent
            __CLR4_5_22ll2lllvl9efkt.R.inc(3413);IsoTypeWriter.writeUInt32(byteBuffer, getDefaultSampleSize());
        }
        }__CLR4_5_22ll2lllvl9efkt.R.inc(3414);if (((((getFlags() & 0x20) == 0x20)&&(__CLR4_5_22ll2lllvl9efkt.R.iget(3415)!=0|true))||(__CLR4_5_22ll2lllvl9efkt.R.iget(3416)==0&false))) {{ //defaultSampleFlagsPresent
            __CLR4_5_22ll2lllvl9efkt.R.inc(3417);defaultSampleFlags.getContent(byteBuffer);
        }
    }}finally{__CLR4_5_22ll2lllvl9efkt.R.flushNeeded();}}

    @Override
    public void _parseDetails(ByteBuffer content) {try{__CLR4_5_22ll2lllvl9efkt.R.inc(3418);
        __CLR4_5_22ll2lllvl9efkt.R.inc(3419);parseVersionAndFlags(content);
        __CLR4_5_22ll2lllvl9efkt.R.inc(3420);trackId = IsoTypeReader.readUInt32(content);
        __CLR4_5_22ll2lllvl9efkt.R.inc(3421);if (((((getFlags() & 0x1) == 1)&&(__CLR4_5_22ll2lllvl9efkt.R.iget(3422)!=0|true))||(__CLR4_5_22ll2lllvl9efkt.R.iget(3423)==0&false))) {{ //baseDataOffsetPresent
            __CLR4_5_22ll2lllvl9efkt.R.inc(3424);baseDataOffset = IsoTypeReader.readUInt64(content);
        }
        }__CLR4_5_22ll2lllvl9efkt.R.inc(3425);if (((((getFlags() & 0x2) == 0x2)&&(__CLR4_5_22ll2lllvl9efkt.R.iget(3426)!=0|true))||(__CLR4_5_22ll2lllvl9efkt.R.iget(3427)==0&false))) {{ //sampleDescriptionIndexPresent
            __CLR4_5_22ll2lllvl9efkt.R.inc(3428);sampleDescriptionIndex = IsoTypeReader.readUInt32(content);
        }
        }__CLR4_5_22ll2lllvl9efkt.R.inc(3429);if (((((getFlags() & 0x8) == 0x8)&&(__CLR4_5_22ll2lllvl9efkt.R.iget(3430)!=0|true))||(__CLR4_5_22ll2lllvl9efkt.R.iget(3431)==0&false))) {{ //defaultSampleDurationPresent
            __CLR4_5_22ll2lllvl9efkt.R.inc(3432);defaultSampleDuration = IsoTypeReader.readUInt32(content);
        }
        }__CLR4_5_22ll2lllvl9efkt.R.inc(3433);if (((((getFlags() & 0x10) == 0x10)&&(__CLR4_5_22ll2lllvl9efkt.R.iget(3434)!=0|true))||(__CLR4_5_22ll2lllvl9efkt.R.iget(3435)==0&false))) {{ //defaultSampleSizePresent
            __CLR4_5_22ll2lllvl9efkt.R.inc(3436);defaultSampleSize = IsoTypeReader.readUInt32(content);
        }
        }__CLR4_5_22ll2lllvl9efkt.R.inc(3437);if (((((getFlags() & 0x20) == 0x20)&&(__CLR4_5_22ll2lllvl9efkt.R.iget(3438)!=0|true))||(__CLR4_5_22ll2lllvl9efkt.R.iget(3439)==0&false))) {{ //defaultSampleFlagsPresent
            __CLR4_5_22ll2lllvl9efkt.R.inc(3440);defaultSampleFlags = new SampleFlags(content);
        }
        }__CLR4_5_22ll2lllvl9efkt.R.inc(3441);if (((((getFlags() & 0x10000) == 0x10000)&&(__CLR4_5_22ll2lllvl9efkt.R.iget(3442)!=0|true))||(__CLR4_5_22ll2lllvl9efkt.R.iget(3443)==0&false))) {{ //durationIsEmpty
            __CLR4_5_22ll2lllvl9efkt.R.inc(3444);durationIsEmpty = true;
        }
        }__CLR4_5_22ll2lllvl9efkt.R.inc(3445);if (((((getFlags() & 0x20000) == 0x20000)&&(__CLR4_5_22ll2lllvl9efkt.R.iget(3446)!=0|true))||(__CLR4_5_22ll2lllvl9efkt.R.iget(3447)==0&false))) {{ //defaultBaseIsMoof
            __CLR4_5_22ll2lllvl9efkt.R.inc(3448);defaultBaseIsMoof = true;
        }
    }}finally{__CLR4_5_22ll2lllvl9efkt.R.flushNeeded();}}

    public boolean hasBaseDataOffset() {try{__CLR4_5_22ll2lllvl9efkt.R.inc(3449);
        __CLR4_5_22ll2lllvl9efkt.R.inc(3450);return (getFlags() & 0x1) != 0;
    }finally{__CLR4_5_22ll2lllvl9efkt.R.flushNeeded();}}

    public boolean hasSampleDescriptionIndex() {try{__CLR4_5_22ll2lllvl9efkt.R.inc(3451);
        __CLR4_5_22ll2lllvl9efkt.R.inc(3452);return (getFlags() & 0x2) != 0;
    }finally{__CLR4_5_22ll2lllvl9efkt.R.flushNeeded();}}

    public boolean hasDefaultSampleDuration() {try{__CLR4_5_22ll2lllvl9efkt.R.inc(3453);
        __CLR4_5_22ll2lllvl9efkt.R.inc(3454);return (getFlags() & 0x8) != 0;
    }finally{__CLR4_5_22ll2lllvl9efkt.R.flushNeeded();}}

    public boolean hasDefaultSampleSize() {try{__CLR4_5_22ll2lllvl9efkt.R.inc(3455);
        __CLR4_5_22ll2lllvl9efkt.R.inc(3456);return (getFlags() & 0x10) != 0;
    }finally{__CLR4_5_22ll2lllvl9efkt.R.flushNeeded();}}

    public boolean hasDefaultSampleFlags() {try{__CLR4_5_22ll2lllvl9efkt.R.inc(3457);
        __CLR4_5_22ll2lllvl9efkt.R.inc(3458);return (getFlags() & 0x20) != 0;
    }finally{__CLR4_5_22ll2lllvl9efkt.R.flushNeeded();}}

    public long getTrackId() {try{__CLR4_5_22ll2lllvl9efkt.R.inc(3459);
        __CLR4_5_22ll2lllvl9efkt.R.inc(3460);return trackId;
    }finally{__CLR4_5_22ll2lllvl9efkt.R.flushNeeded();}}

    public long getBaseDataOffset() {try{__CLR4_5_22ll2lllvl9efkt.R.inc(3461);
        __CLR4_5_22ll2lllvl9efkt.R.inc(3462);return baseDataOffset;
    }finally{__CLR4_5_22ll2lllvl9efkt.R.flushNeeded();}}

    public long getSampleDescriptionIndex() {try{__CLR4_5_22ll2lllvl9efkt.R.inc(3463);
        __CLR4_5_22ll2lllvl9efkt.R.inc(3464);return sampleDescriptionIndex;
    }finally{__CLR4_5_22ll2lllvl9efkt.R.flushNeeded();}}

    public long getDefaultSampleDuration() {try{__CLR4_5_22ll2lllvl9efkt.R.inc(3465);
        __CLR4_5_22ll2lllvl9efkt.R.inc(3466);return defaultSampleDuration;
    }finally{__CLR4_5_22ll2lllvl9efkt.R.flushNeeded();}}

    public long getDefaultSampleSize() {try{__CLR4_5_22ll2lllvl9efkt.R.inc(3467);
        __CLR4_5_22ll2lllvl9efkt.R.inc(3468);return defaultSampleSize;
    }finally{__CLR4_5_22ll2lllvl9efkt.R.flushNeeded();}}

    public SampleFlags getDefaultSampleFlags() {try{__CLR4_5_22ll2lllvl9efkt.R.inc(3469);
        __CLR4_5_22ll2lllvl9efkt.R.inc(3470);return defaultSampleFlags;
    }finally{__CLR4_5_22ll2lllvl9efkt.R.flushNeeded();}}

    public boolean isDurationIsEmpty() {try{__CLR4_5_22ll2lllvl9efkt.R.inc(3471);
        __CLR4_5_22ll2lllvl9efkt.R.inc(3472);return durationIsEmpty;
    }finally{__CLR4_5_22ll2lllvl9efkt.R.flushNeeded();}}

    public boolean isDefaultBaseIsMoof() {try{__CLR4_5_22ll2lllvl9efkt.R.inc(3473);
        __CLR4_5_22ll2lllvl9efkt.R.inc(3474);return defaultBaseIsMoof;
    }finally{__CLR4_5_22ll2lllvl9efkt.R.flushNeeded();}}

    public void setTrackId(long trackId) {try{__CLR4_5_22ll2lllvl9efkt.R.inc(3475);
        __CLR4_5_22ll2lllvl9efkt.R.inc(3476);this.trackId = trackId;
    }finally{__CLR4_5_22ll2lllvl9efkt.R.flushNeeded();}}

    public void setBaseDataOffset(long baseDataOffset) {try{__CLR4_5_22ll2lllvl9efkt.R.inc(3477);
        __CLR4_5_22ll2lllvl9efkt.R.inc(3478);if ((((baseDataOffset == -1)&&(__CLR4_5_22ll2lllvl9efkt.R.iget(3479)!=0|true))||(__CLR4_5_22ll2lllvl9efkt.R.iget(3480)==0&false))) {{
            __CLR4_5_22ll2lllvl9efkt.R.inc(3481);setFlags(getFlags() & (Integer.MAX_VALUE ^ 0x1));
        } }else {{
            __CLR4_5_22ll2lllvl9efkt.R.inc(3482);setFlags(getFlags() | 0x1); // activate the field
        }
        }__CLR4_5_22ll2lllvl9efkt.R.inc(3483);this.baseDataOffset = baseDataOffset;
    }finally{__CLR4_5_22ll2lllvl9efkt.R.flushNeeded();}}

    public void setSampleDescriptionIndex(long sampleDescriptionIndex) {try{__CLR4_5_22ll2lllvl9efkt.R.inc(3484);
        __CLR4_5_22ll2lllvl9efkt.R.inc(3485);if ((((sampleDescriptionIndex == -1)&&(__CLR4_5_22ll2lllvl9efkt.R.iget(3486)!=0|true))||(__CLR4_5_22ll2lllvl9efkt.R.iget(3487)==0&false))) {{
            __CLR4_5_22ll2lllvl9efkt.R.inc(3488);setFlags(getFlags() & (Integer.MAX_VALUE ^ 0x2));
        } }else {{
            __CLR4_5_22ll2lllvl9efkt.R.inc(3489);setFlags(getFlags() | 0x2); // activate the field
        }
        }__CLR4_5_22ll2lllvl9efkt.R.inc(3490);this.sampleDescriptionIndex = sampleDescriptionIndex;
    }finally{__CLR4_5_22ll2lllvl9efkt.R.flushNeeded();}}

    public void setDefaultSampleDuration(long defaultSampleDuration) {try{__CLR4_5_22ll2lllvl9efkt.R.inc(3491);
        __CLR4_5_22ll2lllvl9efkt.R.inc(3492);setFlags(getFlags() | 0x8); // activate the field
        __CLR4_5_22ll2lllvl9efkt.R.inc(3493);this.defaultSampleDuration = defaultSampleDuration;
    }finally{__CLR4_5_22ll2lllvl9efkt.R.flushNeeded();}}

    public void setDefaultSampleSize(long defaultSampleSize) {try{__CLR4_5_22ll2lllvl9efkt.R.inc(3494);
        __CLR4_5_22ll2lllvl9efkt.R.inc(3495);setFlags(getFlags() | 0x10); // activate the field
        __CLR4_5_22ll2lllvl9efkt.R.inc(3496);this.defaultSampleSize = defaultSampleSize;
    }finally{__CLR4_5_22ll2lllvl9efkt.R.flushNeeded();}}

    public void setDefaultSampleFlags(SampleFlags defaultSampleFlags) {try{__CLR4_5_22ll2lllvl9efkt.R.inc(3497);
        __CLR4_5_22ll2lllvl9efkt.R.inc(3498);setFlags(getFlags() | 0x20); // activate the field
        __CLR4_5_22ll2lllvl9efkt.R.inc(3499);this.defaultSampleFlags = defaultSampleFlags;
    }finally{__CLR4_5_22ll2lllvl9efkt.R.flushNeeded();}}

    public void setDurationIsEmpty(boolean durationIsEmpty) {try{__CLR4_5_22ll2lllvl9efkt.R.inc(3500);
        __CLR4_5_22ll2lllvl9efkt.R.inc(3501);setFlags(getFlags() | 0x10000); // activate the field
        __CLR4_5_22ll2lllvl9efkt.R.inc(3502);this.durationIsEmpty = durationIsEmpty;
    }finally{__CLR4_5_22ll2lllvl9efkt.R.flushNeeded();}}

    public void setDefaultBaseIsMoof(boolean defaultBaseIsMoof) {try{__CLR4_5_22ll2lllvl9efkt.R.inc(3503);
        __CLR4_5_22ll2lllvl9efkt.R.inc(3504);setFlags(getFlags() | 0x20000); // activate the field
        __CLR4_5_22ll2lllvl9efkt.R.inc(3505);this.defaultBaseIsMoof = defaultBaseIsMoof;
    }finally{__CLR4_5_22ll2lllvl9efkt.R.flushNeeded();}}

    @Override
    public String toString() {try{__CLR4_5_22ll2lllvl9efkt.R.inc(3506);
        __CLR4_5_22ll2lllvl9efkt.R.inc(3507);final StringBuilder sb = new StringBuilder();
        __CLR4_5_22ll2lllvl9efkt.R.inc(3508);sb.append("TrackFragmentHeaderBox");
        __CLR4_5_22ll2lllvl9efkt.R.inc(3509);sb.append("{trackId=").append(trackId);
        __CLR4_5_22ll2lllvl9efkt.R.inc(3510);sb.append(", baseDataOffset=").append(baseDataOffset);
        __CLR4_5_22ll2lllvl9efkt.R.inc(3511);sb.append(", sampleDescriptionIndex=").append(sampleDescriptionIndex);
        __CLR4_5_22ll2lllvl9efkt.R.inc(3512);sb.append(", defaultSampleDuration=").append(defaultSampleDuration);
        __CLR4_5_22ll2lllvl9efkt.R.inc(3513);sb.append(", defaultSampleSize=").append(defaultSampleSize);
        __CLR4_5_22ll2lllvl9efkt.R.inc(3514);sb.append(", defaultSampleFlags=").append(defaultSampleFlags);
        __CLR4_5_22ll2lllvl9efkt.R.inc(3515);sb.append(", durationIsEmpty=").append(durationIsEmpty);
        __CLR4_5_22ll2lllvl9efkt.R.inc(3516);sb.append(", defaultBaseIsMoof=").append(defaultBaseIsMoof);
        __CLR4_5_22ll2lllvl9efkt.R.inc(3517);sb.append('}');
        __CLR4_5_22ll2lllvl9efkt.R.inc(3518);return sb.toString();
    }finally{__CLR4_5_22ll2lllvl9efkt.R.flushNeeded();}}

}
