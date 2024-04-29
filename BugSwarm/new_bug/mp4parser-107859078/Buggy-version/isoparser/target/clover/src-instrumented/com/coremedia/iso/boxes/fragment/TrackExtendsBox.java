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
 * aligned(8) class TrackExtendsBox extends FullBox('trex', 0, 0){
 * unsigned int(32) track_ID;
 * unsigned int(32) default_sample_description_index;
 * unsigned int(32) default_sample_duration;
 * unsigned int(32) default_sample_size;
 * unsigned int(32) default_sample_flags
 * }
 */
public class TrackExtendsBox extends AbstractFullBox {public static class __CLR4_5_22ji2jilvl9efjp{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0030\u0037\u0038\u0035\u0039\u0030\u0037\u0038\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714413275835L,8589935092L,3334,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static final String TYPE = "trex";
    private long trackId;
    private long defaultSampleDescriptionIndex;
    private long defaultSampleDuration;
    private long defaultSampleSize;
    private SampleFlags defaultSampleFlags;

    public TrackExtendsBox() {
        super(TYPE);__CLR4_5_22ji2jilvl9efjp.R.inc(3295);try{__CLR4_5_22ji2jilvl9efjp.R.inc(3294);
    }finally{__CLR4_5_22ji2jilvl9efjp.R.flushNeeded();}}

    @Override
    protected long getContentSize() {try{__CLR4_5_22ji2jilvl9efjp.R.inc(3296);
        __CLR4_5_22ji2jilvl9efjp.R.inc(3297);return 5 * 4 + 4;
    }finally{__CLR4_5_22ji2jilvl9efjp.R.flushNeeded();}}

    @Override
    protected void getContent(ByteBuffer byteBuffer) {try{__CLR4_5_22ji2jilvl9efjp.R.inc(3298);
        __CLR4_5_22ji2jilvl9efjp.R.inc(3299);writeVersionAndFlags(byteBuffer);
        __CLR4_5_22ji2jilvl9efjp.R.inc(3300);IsoTypeWriter.writeUInt32(byteBuffer, trackId);
        __CLR4_5_22ji2jilvl9efjp.R.inc(3301);IsoTypeWriter.writeUInt32(byteBuffer, defaultSampleDescriptionIndex);
        __CLR4_5_22ji2jilvl9efjp.R.inc(3302);IsoTypeWriter.writeUInt32(byteBuffer, defaultSampleDuration);
        __CLR4_5_22ji2jilvl9efjp.R.inc(3303);IsoTypeWriter.writeUInt32(byteBuffer, defaultSampleSize);
        __CLR4_5_22ji2jilvl9efjp.R.inc(3304);defaultSampleFlags.getContent(byteBuffer);
    }finally{__CLR4_5_22ji2jilvl9efjp.R.flushNeeded();}}

    @Override
    public void _parseDetails(ByteBuffer content) {try{__CLR4_5_22ji2jilvl9efjp.R.inc(3305);
        __CLR4_5_22ji2jilvl9efjp.R.inc(3306);parseVersionAndFlags(content);
        __CLR4_5_22ji2jilvl9efjp.R.inc(3307);trackId = IsoTypeReader.readUInt32(content);
        __CLR4_5_22ji2jilvl9efjp.R.inc(3308);defaultSampleDescriptionIndex = IsoTypeReader.readUInt32(content);
        __CLR4_5_22ji2jilvl9efjp.R.inc(3309);defaultSampleDuration = IsoTypeReader.readUInt32(content);
        __CLR4_5_22ji2jilvl9efjp.R.inc(3310);defaultSampleSize = IsoTypeReader.readUInt32(content);
        __CLR4_5_22ji2jilvl9efjp.R.inc(3311);defaultSampleFlags = new SampleFlags(content);
    }finally{__CLR4_5_22ji2jilvl9efjp.R.flushNeeded();}}

    public long getTrackId() {try{__CLR4_5_22ji2jilvl9efjp.R.inc(3312);
        __CLR4_5_22ji2jilvl9efjp.R.inc(3313);return trackId;
    }finally{__CLR4_5_22ji2jilvl9efjp.R.flushNeeded();}}

    public long getDefaultSampleDescriptionIndex() {try{__CLR4_5_22ji2jilvl9efjp.R.inc(3314);
        __CLR4_5_22ji2jilvl9efjp.R.inc(3315);return defaultSampleDescriptionIndex;
    }finally{__CLR4_5_22ji2jilvl9efjp.R.flushNeeded();}}

    public long getDefaultSampleDuration() {try{__CLR4_5_22ji2jilvl9efjp.R.inc(3316);
        __CLR4_5_22ji2jilvl9efjp.R.inc(3317);return defaultSampleDuration;
    }finally{__CLR4_5_22ji2jilvl9efjp.R.flushNeeded();}}

    public long getDefaultSampleSize() {try{__CLR4_5_22ji2jilvl9efjp.R.inc(3318);
        __CLR4_5_22ji2jilvl9efjp.R.inc(3319);return defaultSampleSize;
    }finally{__CLR4_5_22ji2jilvl9efjp.R.flushNeeded();}}

    public SampleFlags getDefaultSampleFlags() {try{__CLR4_5_22ji2jilvl9efjp.R.inc(3320);
        __CLR4_5_22ji2jilvl9efjp.R.inc(3321);return defaultSampleFlags;
    }finally{__CLR4_5_22ji2jilvl9efjp.R.flushNeeded();}}

    public String getDefaultSampleFlagsStr() {try{__CLR4_5_22ji2jilvl9efjp.R.inc(3322);
        __CLR4_5_22ji2jilvl9efjp.R.inc(3323);return defaultSampleFlags.toString();
    }finally{__CLR4_5_22ji2jilvl9efjp.R.flushNeeded();}}

    public void setTrackId(long trackId) {try{__CLR4_5_22ji2jilvl9efjp.R.inc(3324);
        __CLR4_5_22ji2jilvl9efjp.R.inc(3325);this.trackId = trackId;
    }finally{__CLR4_5_22ji2jilvl9efjp.R.flushNeeded();}}

    public void setDefaultSampleDescriptionIndex(long defaultSampleDescriptionIndex) {try{__CLR4_5_22ji2jilvl9efjp.R.inc(3326);
        __CLR4_5_22ji2jilvl9efjp.R.inc(3327);this.defaultSampleDescriptionIndex = defaultSampleDescriptionIndex;
    }finally{__CLR4_5_22ji2jilvl9efjp.R.flushNeeded();}}

    public void setDefaultSampleDuration(long defaultSampleDuration) {try{__CLR4_5_22ji2jilvl9efjp.R.inc(3328);
        __CLR4_5_22ji2jilvl9efjp.R.inc(3329);this.defaultSampleDuration = defaultSampleDuration;
    }finally{__CLR4_5_22ji2jilvl9efjp.R.flushNeeded();}}

    public void setDefaultSampleSize(long defaultSampleSize) {try{__CLR4_5_22ji2jilvl9efjp.R.inc(3330);
        __CLR4_5_22ji2jilvl9efjp.R.inc(3331);this.defaultSampleSize = defaultSampleSize;
    }finally{__CLR4_5_22ji2jilvl9efjp.R.flushNeeded();}}

    public void setDefaultSampleFlags(SampleFlags defaultSampleFlags) {try{__CLR4_5_22ji2jilvl9efjp.R.inc(3332);
        __CLR4_5_22ji2jilvl9efjp.R.inc(3333);this.defaultSampleFlags = defaultSampleFlags;

    }finally{__CLR4_5_22ji2jilvl9efjp.R.flushNeeded();}}
}
