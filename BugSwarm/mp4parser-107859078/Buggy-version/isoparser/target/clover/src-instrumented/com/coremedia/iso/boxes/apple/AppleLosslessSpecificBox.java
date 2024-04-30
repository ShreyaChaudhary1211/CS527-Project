/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.coremedia.iso.boxes.apple;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.AbstractFullBox;

import java.nio.ByteBuffer;

/**
 * <h1>4cc = "{@value #TYPE}"</h1>
 */
public final class AppleLosslessSpecificBox extends AbstractFullBox {public static class __CLR4_5_229a29alvl9effa{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0030\u0037\u0038\u0035\u0039\u0030\u0037\u0038\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714413275835L,8589935092L,3000,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static final String TYPE = "alac";
    /*
   Extradata: 32bit size 32bit tag (=alac) 32bit zero?
   32bit max sample per frame 8bit ?? (zero?) 8bit sample
   size 8bit history mult 8bit initial history 8bit kmodifier
   8bit channels? 16bit ?? 32bit max coded frame size 32bit
   bitrate? 32bit samplerate
    */
    private long maxSamplePerFrame; // 32bi
    private int unknown1; // 8bit
    private int sampleSize; // 8bit
    private int historyMult; // 8bit
    private int initialHistory; // 8bit
    private int kModifier; // 8bit
    private int channels; // 8bit
    private int unknown2; // 16bit
    private long maxCodedFrameSize; // 32bit
    private long bitRate; // 32bit
    private long sampleRate; // 32bit

    public long getMaxSamplePerFrame() {try{__CLR4_5_229a29alvl9effa.R.inc(2926);
        __CLR4_5_229a29alvl9effa.R.inc(2927);return maxSamplePerFrame;
    }finally{__CLR4_5_229a29alvl9effa.R.flushNeeded();}}

    public void setMaxSamplePerFrame(int maxSamplePerFrame) {try{__CLR4_5_229a29alvl9effa.R.inc(2928);
        __CLR4_5_229a29alvl9effa.R.inc(2929);this.maxSamplePerFrame = maxSamplePerFrame;
    }finally{__CLR4_5_229a29alvl9effa.R.flushNeeded();}}

    public int getUnknown1() {try{__CLR4_5_229a29alvl9effa.R.inc(2930);
        __CLR4_5_229a29alvl9effa.R.inc(2931);return unknown1;
    }finally{__CLR4_5_229a29alvl9effa.R.flushNeeded();}}

    public void setUnknown1(int unknown1) {try{__CLR4_5_229a29alvl9effa.R.inc(2932);
        __CLR4_5_229a29alvl9effa.R.inc(2933);this.unknown1 = unknown1;
    }finally{__CLR4_5_229a29alvl9effa.R.flushNeeded();}}

    public int getSampleSize() {try{__CLR4_5_229a29alvl9effa.R.inc(2934);
        __CLR4_5_229a29alvl9effa.R.inc(2935);return sampleSize;
    }finally{__CLR4_5_229a29alvl9effa.R.flushNeeded();}}

    public void setSampleSize(int sampleSize) {try{__CLR4_5_229a29alvl9effa.R.inc(2936);
        __CLR4_5_229a29alvl9effa.R.inc(2937);this.sampleSize = sampleSize;
    }finally{__CLR4_5_229a29alvl9effa.R.flushNeeded();}}

    public int getHistoryMult() {try{__CLR4_5_229a29alvl9effa.R.inc(2938);
        __CLR4_5_229a29alvl9effa.R.inc(2939);return historyMult;
    }finally{__CLR4_5_229a29alvl9effa.R.flushNeeded();}}

    public void setHistoryMult(int historyMult) {try{__CLR4_5_229a29alvl9effa.R.inc(2940);
        __CLR4_5_229a29alvl9effa.R.inc(2941);this.historyMult = historyMult;
    }finally{__CLR4_5_229a29alvl9effa.R.flushNeeded();}}

    public int getInitialHistory() {try{__CLR4_5_229a29alvl9effa.R.inc(2942);
        __CLR4_5_229a29alvl9effa.R.inc(2943);return initialHistory;
    }finally{__CLR4_5_229a29alvl9effa.R.flushNeeded();}}

    public void setInitialHistory(int initialHistory) {try{__CLR4_5_229a29alvl9effa.R.inc(2944);
        __CLR4_5_229a29alvl9effa.R.inc(2945);this.initialHistory = initialHistory;
    }finally{__CLR4_5_229a29alvl9effa.R.flushNeeded();}}

    public int getKModifier() {try{__CLR4_5_229a29alvl9effa.R.inc(2946);
        __CLR4_5_229a29alvl9effa.R.inc(2947);return kModifier;
    }finally{__CLR4_5_229a29alvl9effa.R.flushNeeded();}}

    public void setKModifier(int kModifier) {try{__CLR4_5_229a29alvl9effa.R.inc(2948);
        __CLR4_5_229a29alvl9effa.R.inc(2949);this.kModifier = kModifier;
    }finally{__CLR4_5_229a29alvl9effa.R.flushNeeded();}}

    public int getChannels() {try{__CLR4_5_229a29alvl9effa.R.inc(2950);
        __CLR4_5_229a29alvl9effa.R.inc(2951);return channels;
    }finally{__CLR4_5_229a29alvl9effa.R.flushNeeded();}}

    public void setChannels(int channels) {try{__CLR4_5_229a29alvl9effa.R.inc(2952);
        __CLR4_5_229a29alvl9effa.R.inc(2953);this.channels = channels;
    }finally{__CLR4_5_229a29alvl9effa.R.flushNeeded();}}

    public int getUnknown2() {try{__CLR4_5_229a29alvl9effa.R.inc(2954);
        __CLR4_5_229a29alvl9effa.R.inc(2955);return unknown2;
    }finally{__CLR4_5_229a29alvl9effa.R.flushNeeded();}}

    public void setUnknown2(int unknown2) {try{__CLR4_5_229a29alvl9effa.R.inc(2956);
        __CLR4_5_229a29alvl9effa.R.inc(2957);this.unknown2 = unknown2;
    }finally{__CLR4_5_229a29alvl9effa.R.flushNeeded();}}

    public long getMaxCodedFrameSize() {try{__CLR4_5_229a29alvl9effa.R.inc(2958);
        __CLR4_5_229a29alvl9effa.R.inc(2959);return maxCodedFrameSize;
    }finally{__CLR4_5_229a29alvl9effa.R.flushNeeded();}}

    public void setMaxCodedFrameSize(int maxCodedFrameSize) {try{__CLR4_5_229a29alvl9effa.R.inc(2960);
        __CLR4_5_229a29alvl9effa.R.inc(2961);this.maxCodedFrameSize = maxCodedFrameSize;
    }finally{__CLR4_5_229a29alvl9effa.R.flushNeeded();}}

    public long getBitRate() {try{__CLR4_5_229a29alvl9effa.R.inc(2962);
        __CLR4_5_229a29alvl9effa.R.inc(2963);return bitRate;
    }finally{__CLR4_5_229a29alvl9effa.R.flushNeeded();}}

    public void setBitRate(int bitRate) {try{__CLR4_5_229a29alvl9effa.R.inc(2964);
        __CLR4_5_229a29alvl9effa.R.inc(2965);this.bitRate = bitRate;
    }finally{__CLR4_5_229a29alvl9effa.R.flushNeeded();}}

    public long getSampleRate() {try{__CLR4_5_229a29alvl9effa.R.inc(2966);
        __CLR4_5_229a29alvl9effa.R.inc(2967);return sampleRate;
    }finally{__CLR4_5_229a29alvl9effa.R.flushNeeded();}}

    public void setSampleRate(int sampleRate) {try{__CLR4_5_229a29alvl9effa.R.inc(2968);
        __CLR4_5_229a29alvl9effa.R.inc(2969);this.sampleRate = sampleRate;
    }finally{__CLR4_5_229a29alvl9effa.R.flushNeeded();}}


    @Override
    public void _parseDetails(ByteBuffer content) {try{__CLR4_5_229a29alvl9effa.R.inc(2970);
        __CLR4_5_229a29alvl9effa.R.inc(2971);parseVersionAndFlags(content);
        __CLR4_5_229a29alvl9effa.R.inc(2972);maxSamplePerFrame = IsoTypeReader.readUInt32(content);
        __CLR4_5_229a29alvl9effa.R.inc(2973);unknown1 = IsoTypeReader.readUInt8(content);
        __CLR4_5_229a29alvl9effa.R.inc(2974);sampleSize = IsoTypeReader.readUInt8(content);
        __CLR4_5_229a29alvl9effa.R.inc(2975);historyMult = IsoTypeReader.readUInt8(content);
        __CLR4_5_229a29alvl9effa.R.inc(2976);initialHistory = IsoTypeReader.readUInt8(content);
        __CLR4_5_229a29alvl9effa.R.inc(2977);kModifier = IsoTypeReader.readUInt8(content);
        __CLR4_5_229a29alvl9effa.R.inc(2978);channels = IsoTypeReader.readUInt8(content);
        __CLR4_5_229a29alvl9effa.R.inc(2979);unknown2 = IsoTypeReader.readUInt16(content);
        __CLR4_5_229a29alvl9effa.R.inc(2980);maxCodedFrameSize = IsoTypeReader.readUInt32(content);
        __CLR4_5_229a29alvl9effa.R.inc(2981);bitRate = IsoTypeReader.readUInt32(content);
        __CLR4_5_229a29alvl9effa.R.inc(2982);sampleRate = IsoTypeReader.readUInt32(content);
    }finally{__CLR4_5_229a29alvl9effa.R.flushNeeded();}}

    @Override
    protected void getContent(ByteBuffer byteBuffer) {try{__CLR4_5_229a29alvl9effa.R.inc(2983);
        __CLR4_5_229a29alvl9effa.R.inc(2984);writeVersionAndFlags(byteBuffer);
        __CLR4_5_229a29alvl9effa.R.inc(2985);IsoTypeWriter.writeUInt32(byteBuffer, maxSamplePerFrame);
        __CLR4_5_229a29alvl9effa.R.inc(2986);IsoTypeWriter.writeUInt8(byteBuffer, unknown1);
        __CLR4_5_229a29alvl9effa.R.inc(2987);IsoTypeWriter.writeUInt8(byteBuffer, sampleSize);
        __CLR4_5_229a29alvl9effa.R.inc(2988);IsoTypeWriter.writeUInt8(byteBuffer, historyMult);
        __CLR4_5_229a29alvl9effa.R.inc(2989);IsoTypeWriter.writeUInt8(byteBuffer, initialHistory);
        __CLR4_5_229a29alvl9effa.R.inc(2990);IsoTypeWriter.writeUInt8(byteBuffer, kModifier);
        __CLR4_5_229a29alvl9effa.R.inc(2991);IsoTypeWriter.writeUInt8(byteBuffer, channels);
        __CLR4_5_229a29alvl9effa.R.inc(2992);IsoTypeWriter.writeUInt16(byteBuffer, unknown2);
        __CLR4_5_229a29alvl9effa.R.inc(2993);IsoTypeWriter.writeUInt32(byteBuffer, maxCodedFrameSize);
        __CLR4_5_229a29alvl9effa.R.inc(2994);IsoTypeWriter.writeUInt32(byteBuffer, bitRate);
        __CLR4_5_229a29alvl9effa.R.inc(2995);IsoTypeWriter.writeUInt32(byteBuffer, sampleRate);
    }finally{__CLR4_5_229a29alvl9effa.R.flushNeeded();}}

    public AppleLosslessSpecificBox() {
        super("alac");__CLR4_5_229a29alvl9effa.R.inc(2997);try{__CLR4_5_229a29alvl9effa.R.inc(2996);
    }finally{__CLR4_5_229a29alvl9effa.R.flushNeeded();}}

    protected long getContentSize() {try{__CLR4_5_229a29alvl9effa.R.inc(2998);
        __CLR4_5_229a29alvl9effa.R.inc(2999);return 28;
    }finally{__CLR4_5_229a29alvl9effa.R.flushNeeded();}}

}
