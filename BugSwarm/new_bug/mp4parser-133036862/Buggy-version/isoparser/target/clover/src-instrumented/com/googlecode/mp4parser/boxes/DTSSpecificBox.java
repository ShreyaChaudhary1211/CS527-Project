/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.googlecode.mp4parser.boxes;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.AbstractBox;
import com.googlecode.mp4parser.annotations.DoNotParseDetail;
import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BitReaderBuffer;
import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BitWriterBuffer;

import java.nio.ByteBuffer;

/**
 * <h1>4cc = "{@value #TYPE}"</h1>
 */
public class DTSSpecificBox extends AbstractBox {public static class __CLR4_5_2auaaualvluljqm{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0033\u0033\u0030\u0033\u0036\u0038\u0036\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714448869219L,8589935092L,14256,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static final String TYPE = "ddts";

    long DTSSamplingFrequency;
    long maxBitRate;
    long avgBitRate;
    int pcmSampleDepth;
    int frameDuration;
    int streamConstruction;
    int coreLFEPresent;
    int coreLayout;
    int coreSize;
    int stereoDownmix;
    int representationType;
    int channelLayout;
    int multiAssetFlag;
    int LBRDurationMod;
    int reservedBoxPresent;
    int reserved;

    public DTSSpecificBox() {
        super(TYPE);__CLR4_5_2auaaualvluljqm.R.inc(14051);try{__CLR4_5_2auaaualvluljqm.R.inc(14050);
    }finally{__CLR4_5_2auaaualvluljqm.R.flushNeeded();}}

    @Override
    protected long getContentSize() {try{__CLR4_5_2auaaualvluljqm.R.inc(14052);
        __CLR4_5_2auaaualvluljqm.R.inc(14053);return 20;
    }finally{__CLR4_5_2auaaualvluljqm.R.flushNeeded();}}

    @Override
    public void _parseDetails(ByteBuffer content) {try{__CLR4_5_2auaaualvluljqm.R.inc(14054);
        __CLR4_5_2auaaualvluljqm.R.inc(14055);DTSSamplingFrequency = IsoTypeReader.readUInt32(content);
        __CLR4_5_2auaaualvluljqm.R.inc(14056);maxBitRate = IsoTypeReader.readUInt32(content);
        __CLR4_5_2auaaualvluljqm.R.inc(14057);avgBitRate = IsoTypeReader.readUInt32(content);
        __CLR4_5_2auaaualvluljqm.R.inc(14058);pcmSampleDepth = IsoTypeReader.readUInt8(content);
        __CLR4_5_2auaaualvluljqm.R.inc(14059);BitReaderBuffer brb = new BitReaderBuffer(content);
        __CLR4_5_2auaaualvluljqm.R.inc(14060);frameDuration = brb.readBits(2);
        __CLR4_5_2auaaualvluljqm.R.inc(14061);streamConstruction = brb.readBits(5);
        __CLR4_5_2auaaualvluljqm.R.inc(14062);coreLFEPresent = brb.readBits(1);
        __CLR4_5_2auaaualvluljqm.R.inc(14063);coreLayout = brb.readBits(6);
        __CLR4_5_2auaaualvluljqm.R.inc(14064);coreSize = brb.readBits(14);
        __CLR4_5_2auaaualvluljqm.R.inc(14065);stereoDownmix = brb.readBits(1);
        __CLR4_5_2auaaualvluljqm.R.inc(14066);representationType = brb.readBits(3);
        __CLR4_5_2auaaualvluljqm.R.inc(14067);channelLayout = brb.readBits(16);
        __CLR4_5_2auaaualvluljqm.R.inc(14068);multiAssetFlag = brb.readBits(1);
        __CLR4_5_2auaaualvluljqm.R.inc(14069);LBRDurationMod = brb.readBits(1);
        __CLR4_5_2auaaualvluljqm.R.inc(14070);reservedBoxPresent = brb.readBits(1);
        __CLR4_5_2auaaualvluljqm.R.inc(14071);reserved = brb.readBits(5);

    }finally{__CLR4_5_2auaaualvluljqm.R.flushNeeded();}}

    @Override
    protected void getContent(ByteBuffer byteBuffer) {try{__CLR4_5_2auaaualvluljqm.R.inc(14072);
        __CLR4_5_2auaaualvluljqm.R.inc(14073);IsoTypeWriter.writeUInt32(byteBuffer, DTSSamplingFrequency);
        __CLR4_5_2auaaualvluljqm.R.inc(14074);IsoTypeWriter.writeUInt32(byteBuffer, maxBitRate);
        __CLR4_5_2auaaualvluljqm.R.inc(14075);IsoTypeWriter.writeUInt32(byteBuffer, avgBitRate);
        __CLR4_5_2auaaualvluljqm.R.inc(14076);IsoTypeWriter.writeUInt8(byteBuffer, pcmSampleDepth);
        __CLR4_5_2auaaualvluljqm.R.inc(14077);BitWriterBuffer bwb = new BitWriterBuffer(byteBuffer);
        __CLR4_5_2auaaualvluljqm.R.inc(14078);bwb.writeBits(frameDuration, 2);
        __CLR4_5_2auaaualvluljqm.R.inc(14079);bwb.writeBits(streamConstruction, 5);
        __CLR4_5_2auaaualvluljqm.R.inc(14080);bwb.writeBits(coreLFEPresent, 1);
        __CLR4_5_2auaaualvluljqm.R.inc(14081);bwb.writeBits(coreLayout, 6);
        __CLR4_5_2auaaualvluljqm.R.inc(14082);bwb.writeBits(coreSize, 14);
        __CLR4_5_2auaaualvluljqm.R.inc(14083);bwb.writeBits(stereoDownmix, 1);
        __CLR4_5_2auaaualvluljqm.R.inc(14084);bwb.writeBits(representationType, 3);
        __CLR4_5_2auaaualvluljqm.R.inc(14085);bwb.writeBits(channelLayout, 16);
        __CLR4_5_2auaaualvluljqm.R.inc(14086);bwb.writeBits(multiAssetFlag, 1);
        __CLR4_5_2auaaualvluljqm.R.inc(14087);bwb.writeBits(LBRDurationMod, 1);
        __CLR4_5_2auaaualvluljqm.R.inc(14088);bwb.writeBits(reservedBoxPresent, 1);
        __CLR4_5_2auaaualvluljqm.R.inc(14089);bwb.writeBits(reserved, 5);

    }finally{__CLR4_5_2auaaualvluljqm.R.flushNeeded();}}

    public long getAvgBitRate() {try{__CLR4_5_2auaaualvluljqm.R.inc(14090);
        __CLR4_5_2auaaualvluljqm.R.inc(14091);return avgBitRate;
    }finally{__CLR4_5_2auaaualvluljqm.R.flushNeeded();}}

    public void setAvgBitRate(long avgBitRate) {try{__CLR4_5_2auaaualvluljqm.R.inc(14092);
        __CLR4_5_2auaaualvluljqm.R.inc(14093);this.avgBitRate = avgBitRate;
    }finally{__CLR4_5_2auaaualvluljqm.R.flushNeeded();}}

    public long getDTSSamplingFrequency() {try{__CLR4_5_2auaaualvluljqm.R.inc(14094);
        __CLR4_5_2auaaualvluljqm.R.inc(14095);return DTSSamplingFrequency;
    }finally{__CLR4_5_2auaaualvluljqm.R.flushNeeded();}}

    public void setDTSSamplingFrequency(long DTSSamplingFrequency) {try{__CLR4_5_2auaaualvluljqm.R.inc(14096);
        __CLR4_5_2auaaualvluljqm.R.inc(14097);this.DTSSamplingFrequency = DTSSamplingFrequency;
    }finally{__CLR4_5_2auaaualvluljqm.R.flushNeeded();}}

    public long getMaxBitRate() {try{__CLR4_5_2auaaualvluljqm.R.inc(14098);
        __CLR4_5_2auaaualvluljqm.R.inc(14099);return maxBitRate;
    }finally{__CLR4_5_2auaaualvluljqm.R.flushNeeded();}}

    public void setMaxBitRate(long maxBitRate) {try{__CLR4_5_2auaaualvluljqm.R.inc(14100);
        __CLR4_5_2auaaualvluljqm.R.inc(14101);this.maxBitRate = maxBitRate;
    }finally{__CLR4_5_2auaaualvluljqm.R.flushNeeded();}}

    public int getPcmSampleDepth() {try{__CLR4_5_2auaaualvluljqm.R.inc(14102);
        __CLR4_5_2auaaualvluljqm.R.inc(14103);return pcmSampleDepth;
    }finally{__CLR4_5_2auaaualvluljqm.R.flushNeeded();}}

    public void setPcmSampleDepth(int pcmSampleDepth) {try{__CLR4_5_2auaaualvluljqm.R.inc(14104);
        __CLR4_5_2auaaualvluljqm.R.inc(14105);this.pcmSampleDepth = pcmSampleDepth;
    }finally{__CLR4_5_2auaaualvluljqm.R.flushNeeded();}}

    public int getFrameDuration() {try{__CLR4_5_2auaaualvluljqm.R.inc(14106);
        __CLR4_5_2auaaualvluljqm.R.inc(14107);return frameDuration;
    }finally{__CLR4_5_2auaaualvluljqm.R.flushNeeded();}}

    public void setFrameDuration(int frameDuration) {try{__CLR4_5_2auaaualvluljqm.R.inc(14108);
        __CLR4_5_2auaaualvluljqm.R.inc(14109);this.frameDuration = frameDuration;
    }finally{__CLR4_5_2auaaualvluljqm.R.flushNeeded();}}

    public int getStreamConstruction() {try{__CLR4_5_2auaaualvluljqm.R.inc(14110);
        __CLR4_5_2auaaualvluljqm.R.inc(14111);return streamConstruction;
    }finally{__CLR4_5_2auaaualvluljqm.R.flushNeeded();}}

    public void setStreamConstruction(int streamConstruction) {try{__CLR4_5_2auaaualvluljqm.R.inc(14112);
        __CLR4_5_2auaaualvluljqm.R.inc(14113);this.streamConstruction = streamConstruction;
    }finally{__CLR4_5_2auaaualvluljqm.R.flushNeeded();}}

    public int getCoreLFEPresent() {try{__CLR4_5_2auaaualvluljqm.R.inc(14114);
        __CLR4_5_2auaaualvluljqm.R.inc(14115);return coreLFEPresent;
    }finally{__CLR4_5_2auaaualvluljqm.R.flushNeeded();}}

    public void setCoreLFEPresent(int coreLFEPresent) {try{__CLR4_5_2auaaualvluljqm.R.inc(14116);
        __CLR4_5_2auaaualvluljqm.R.inc(14117);this.coreLFEPresent = coreLFEPresent;
    }finally{__CLR4_5_2auaaualvluljqm.R.flushNeeded();}}

    public int getCoreLayout() {try{__CLR4_5_2auaaualvluljqm.R.inc(14118);
        __CLR4_5_2auaaualvluljqm.R.inc(14119);return coreLayout;
    }finally{__CLR4_5_2auaaualvluljqm.R.flushNeeded();}}

    public void setCoreLayout(int coreLayout) {try{__CLR4_5_2auaaualvluljqm.R.inc(14120);
        __CLR4_5_2auaaualvluljqm.R.inc(14121);this.coreLayout = coreLayout;
    }finally{__CLR4_5_2auaaualvluljqm.R.flushNeeded();}}

    public int getCoreSize() {try{__CLR4_5_2auaaualvluljqm.R.inc(14122);
        __CLR4_5_2auaaualvluljqm.R.inc(14123);return coreSize;
    }finally{__CLR4_5_2auaaualvluljqm.R.flushNeeded();}}

    public void setCoreSize(int coreSize) {try{__CLR4_5_2auaaualvluljqm.R.inc(14124);
        __CLR4_5_2auaaualvluljqm.R.inc(14125);this.coreSize = coreSize;
    }finally{__CLR4_5_2auaaualvluljqm.R.flushNeeded();}}

    public int getStereoDownmix() {try{__CLR4_5_2auaaualvluljqm.R.inc(14126);
        __CLR4_5_2auaaualvluljqm.R.inc(14127);return stereoDownmix;
    }finally{__CLR4_5_2auaaualvluljqm.R.flushNeeded();}}

    public void setStereoDownmix(int stereoDownmix) {try{__CLR4_5_2auaaualvluljqm.R.inc(14128);
        __CLR4_5_2auaaualvluljqm.R.inc(14129);this.stereoDownmix = stereoDownmix;
    }finally{__CLR4_5_2auaaualvluljqm.R.flushNeeded();}}

    public int getRepresentationType() {try{__CLR4_5_2auaaualvluljqm.R.inc(14130);
        __CLR4_5_2auaaualvluljqm.R.inc(14131);return representationType;
    }finally{__CLR4_5_2auaaualvluljqm.R.flushNeeded();}}

    public void setRepresentationType(int representationType) {try{__CLR4_5_2auaaualvluljqm.R.inc(14132);
        __CLR4_5_2auaaualvluljqm.R.inc(14133);this.representationType = representationType;
    }finally{__CLR4_5_2auaaualvluljqm.R.flushNeeded();}}

    public int getChannelLayout() {try{__CLR4_5_2auaaualvluljqm.R.inc(14134);
        __CLR4_5_2auaaualvluljqm.R.inc(14135);return channelLayout;
    }finally{__CLR4_5_2auaaualvluljqm.R.flushNeeded();}}

    public void setChannelLayout(int channelLayout) {try{__CLR4_5_2auaaualvluljqm.R.inc(14136);
        __CLR4_5_2auaaualvluljqm.R.inc(14137);this.channelLayout = channelLayout;
    }finally{__CLR4_5_2auaaualvluljqm.R.flushNeeded();}}

    public int getMultiAssetFlag() {try{__CLR4_5_2auaaualvluljqm.R.inc(14138);
        __CLR4_5_2auaaualvluljqm.R.inc(14139);return multiAssetFlag;
    }finally{__CLR4_5_2auaaualvluljqm.R.flushNeeded();}}

    public void setMultiAssetFlag(int multiAssetFlag) {try{__CLR4_5_2auaaualvluljqm.R.inc(14140);
        __CLR4_5_2auaaualvluljqm.R.inc(14141);this.multiAssetFlag = multiAssetFlag;
    }finally{__CLR4_5_2auaaualvluljqm.R.flushNeeded();}}

    public int getLBRDurationMod() {try{__CLR4_5_2auaaualvluljqm.R.inc(14142);
        __CLR4_5_2auaaualvluljqm.R.inc(14143);return LBRDurationMod;
    }finally{__CLR4_5_2auaaualvluljqm.R.flushNeeded();}}

    public void setLBRDurationMod(int LBRDurationMod) {try{__CLR4_5_2auaaualvluljqm.R.inc(14144);
        __CLR4_5_2auaaualvluljqm.R.inc(14145);this.LBRDurationMod = LBRDurationMod;
    }finally{__CLR4_5_2auaaualvluljqm.R.flushNeeded();}}

    public int getReserved() {try{__CLR4_5_2auaaualvluljqm.R.inc(14146);
        __CLR4_5_2auaaualvluljqm.R.inc(14147);return reserved;
    }finally{__CLR4_5_2auaaualvluljqm.R.flushNeeded();}}

    public void setReserved(int reserved) {try{__CLR4_5_2auaaualvluljqm.R.inc(14148);
        __CLR4_5_2auaaualvluljqm.R.inc(14149);this.reserved = reserved;
    }finally{__CLR4_5_2auaaualvluljqm.R.flushNeeded();}}

    public int getReservedBoxPresent() {try{__CLR4_5_2auaaualvluljqm.R.inc(14150);
        __CLR4_5_2auaaualvluljqm.R.inc(14151);return reservedBoxPresent;
    }finally{__CLR4_5_2auaaualvluljqm.R.flushNeeded();}}

    public void setReservedBoxPresent(int reservedBoxPresent) {try{__CLR4_5_2auaaualvluljqm.R.inc(14152);
        __CLR4_5_2auaaualvluljqm.R.inc(14153);this.reservedBoxPresent = reservedBoxPresent;
    }finally{__CLR4_5_2auaaualvluljqm.R.flushNeeded();}}

    @DoNotParseDetail
    public int[] getDashAudioChannelConfiguration() {try{__CLR4_5_2auaaualvluljqm.R.inc(14154);
        __CLR4_5_2auaaualvluljqm.R.inc(14155);final int channelLayout = this.getChannelLayout();
        __CLR4_5_2auaaualvluljqm.R.inc(14156);int numChannels = 0;
        __CLR4_5_2auaaualvluljqm.R.inc(14157);int dwChannelMask = 0;
        __CLR4_5_2auaaualvluljqm.R.inc(14158);if (((((channelLayout & 0x0001) == 0x0001)&&(__CLR4_5_2auaaualvluljqm.R.iget(14159)!=0|true))||(__CLR4_5_2auaaualvluljqm.R.iget(14160)==0&false))) {{
            //0001h Center in front of listener 1
            __CLR4_5_2auaaualvluljqm.R.inc(14161);numChannels += 1;
            __CLR4_5_2auaaualvluljqm.R.inc(14162);dwChannelMask |= 0x00000004; //SPEAKER_FRONT_CENTER
        }
        }__CLR4_5_2auaaualvluljqm.R.inc(14163);if (((((channelLayout & 0x0002) == 0x0002)&&(__CLR4_5_2auaaualvluljqm.R.iget(14164)!=0|true))||(__CLR4_5_2auaaualvluljqm.R.iget(14165)==0&false))) {{
            //0002h Left/Right in front 2
            __CLR4_5_2auaaualvluljqm.R.inc(14166);numChannels += 2;
            __CLR4_5_2auaaualvluljqm.R.inc(14167);dwChannelMask |= 0x00000001; //SPEAKER_FRONT_LEFT
            __CLR4_5_2auaaualvluljqm.R.inc(14168);dwChannelMask |= 0x00000002; //SPEAKER_FRONT_RIGHT
        }
        }__CLR4_5_2auaaualvluljqm.R.inc(14169);if (((((channelLayout & 0x0004) == 0x0004)&&(__CLR4_5_2auaaualvluljqm.R.iget(14170)!=0|true))||(__CLR4_5_2auaaualvluljqm.R.iget(14171)==0&false))) {{
            //0004h Left/Right surround on side in rear 2
            __CLR4_5_2auaaualvluljqm.R.inc(14172);numChannels += 2;
            //* if Lss, Rss exist, then this position is equivalent to Lsr, Rsr respectively
            __CLR4_5_2auaaualvluljqm.R.inc(14173);dwChannelMask |= 0x00000010; //SPEAKER_BACK_LEFT
            __CLR4_5_2auaaualvluljqm.R.inc(14174);dwChannelMask |= 0x00000020; //SPEAKER_BACK_RIGHT
        }
        }__CLR4_5_2auaaualvluljqm.R.inc(14175);if (((((channelLayout & 0x0008) == 0x0008)&&(__CLR4_5_2auaaualvluljqm.R.iget(14176)!=0|true))||(__CLR4_5_2auaaualvluljqm.R.iget(14177)==0&false))) {{
            //0008h Low frequency effects subwoofer 1
            __CLR4_5_2auaaualvluljqm.R.inc(14178);numChannels += 1;
            __CLR4_5_2auaaualvluljqm.R.inc(14179);dwChannelMask |= 0x00000008; //SPEAKER_LOW_FREQUENCY
        }
        }__CLR4_5_2auaaualvluljqm.R.inc(14180);if (((((channelLayout & 0x0010) == 0x0010)&&(__CLR4_5_2auaaualvluljqm.R.iget(14181)!=0|true))||(__CLR4_5_2auaaualvluljqm.R.iget(14182)==0&false))) {{
            //0010h Center surround in rear 1
            __CLR4_5_2auaaualvluljqm.R.inc(14183);numChannels += 1;
            __CLR4_5_2auaaualvluljqm.R.inc(14184);dwChannelMask |= 0x00000100; //SPEAKER_BACK_CENTER
        }
        }__CLR4_5_2auaaualvluljqm.R.inc(14185);if (((((channelLayout & 0x0020) == 0x0020)&&(__CLR4_5_2auaaualvluljqm.R.iget(14186)!=0|true))||(__CLR4_5_2auaaualvluljqm.R.iget(14187)==0&false))) {{
            //0020h Left/Right height in front 2
            __CLR4_5_2auaaualvluljqm.R.inc(14188);numChannels += 2;
            __CLR4_5_2auaaualvluljqm.R.inc(14189);dwChannelMask |= 0x00001000; //SPEAKER_TOP_FRONT_LEFT
            __CLR4_5_2auaaualvluljqm.R.inc(14190);dwChannelMask |= 0x00004000; //SPEAKER_TOP_FRONT_RIGHT
        }
        }__CLR4_5_2auaaualvluljqm.R.inc(14191);if (((((channelLayout & 0x0040) == 0x0040)&&(__CLR4_5_2auaaualvluljqm.R.iget(14192)!=0|true))||(__CLR4_5_2auaaualvluljqm.R.iget(14193)==0&false))) {{
            //0040h Left/Right surround in rear 2
            __CLR4_5_2auaaualvluljqm.R.inc(14194);numChannels += 2;
            __CLR4_5_2auaaualvluljqm.R.inc(14195);dwChannelMask |= 0x00000010; //SPEAKER_BACK_LEFT
            __CLR4_5_2auaaualvluljqm.R.inc(14196);dwChannelMask |= 0x00000020; //SPEAKER_BACK_RIGHT
        }
        }__CLR4_5_2auaaualvluljqm.R.inc(14197);if (((((channelLayout & 0x0080) == 0x0080)&&(__CLR4_5_2auaaualvluljqm.R.iget(14198)!=0|true))||(__CLR4_5_2auaaualvluljqm.R.iget(14199)==0&false))) {{
            //0080h Center Height in front 1
            __CLR4_5_2auaaualvluljqm.R.inc(14200);numChannels += 1;
            __CLR4_5_2auaaualvluljqm.R.inc(14201);dwChannelMask |= 0x00002000; //SPEAKER_TOP_FRONT_CENTER
        }
        }__CLR4_5_2auaaualvluljqm.R.inc(14202);if (((((channelLayout & 0x0100) == 0x0100)&&(__CLR4_5_2auaaualvluljqm.R.iget(14203)!=0|true))||(__CLR4_5_2auaaualvluljqm.R.iget(14204)==0&false))) {{
            //0100h Over the listener\u2019s head 1
            __CLR4_5_2auaaualvluljqm.R.inc(14205);numChannels += 1;
            __CLR4_5_2auaaualvluljqm.R.inc(14206);dwChannelMask |= 0x00000800; //SPEAKER_TOP_CENTER
        }
        }__CLR4_5_2auaaualvluljqm.R.inc(14207);if (((((channelLayout & 0x0200) == 0x0200)&&(__CLR4_5_2auaaualvluljqm.R.iget(14208)!=0|true))||(__CLR4_5_2auaaualvluljqm.R.iget(14209)==0&false))) {{
            //0200h Between left/right and center in front 2
            __CLR4_5_2auaaualvluljqm.R.inc(14210);numChannels += 2;
            __CLR4_5_2auaaualvluljqm.R.inc(14211);dwChannelMask |= 0x00000040; //SPEAKER_FRONT_LEFT_OF_CENTER
            __CLR4_5_2auaaualvluljqm.R.inc(14212);dwChannelMask |= 0x00000080; //SPEAKER_FRONT_RIGHT_OF_CENTER
        }
        }__CLR4_5_2auaaualvluljqm.R.inc(14213);if (((((channelLayout & 0x0400) == 0x0400)&&(__CLR4_5_2auaaualvluljqm.R.iget(14214)!=0|true))||(__CLR4_5_2auaaualvluljqm.R.iget(14215)==0&false))) {{
            //0400h Left/Right on side in front 2
            __CLR4_5_2auaaualvluljqm.R.inc(14216);numChannels += 2;
            __CLR4_5_2auaaualvluljqm.R.inc(14217);dwChannelMask |= 0x00000200; //SPEAKER_SIDE_LEFT
            __CLR4_5_2auaaualvluljqm.R.inc(14218);dwChannelMask |= 0x00000400; //SPEAKER_SIDE_RIGHT
        }
        }__CLR4_5_2auaaualvluljqm.R.inc(14219);if (((((channelLayout & 0x0800) == 0x0800)&&(__CLR4_5_2auaaualvluljqm.R.iget(14220)!=0|true))||(__CLR4_5_2auaaualvluljqm.R.iget(14221)==0&false))) {{
            //0800h Left/Right surround on side 2
            __CLR4_5_2auaaualvluljqm.R.inc(14222);numChannels += 2;
            //* if Lss, Rss exist, then this position is equivalent to Lsr, Rsr respectively
            __CLR4_5_2auaaualvluljqm.R.inc(14223);dwChannelMask |= 0x00000010; //SPEAKER_BACK_LEFT
            __CLR4_5_2auaaualvluljqm.R.inc(14224);dwChannelMask |= 0x00000020; //SPEAKER_BACK_RIGHT
        }
        }__CLR4_5_2auaaualvluljqm.R.inc(14225);if (((((channelLayout & 0x1000) == 0x1000)&&(__CLR4_5_2auaaualvluljqm.R.iget(14226)!=0|true))||(__CLR4_5_2auaaualvluljqm.R.iget(14227)==0&false))) {{
            //1000h Second low frequency effects subwoofer 1
            __CLR4_5_2auaaualvluljqm.R.inc(14228);numChannels += 1;
            __CLR4_5_2auaaualvluljqm.R.inc(14229);dwChannelMask |= 0x00000008; //SPEAKER_LOW_FREQUENCY
        }
        }__CLR4_5_2auaaualvluljqm.R.inc(14230);if (((((channelLayout & 0x2000) == 0x2000)&&(__CLR4_5_2auaaualvluljqm.R.iget(14231)!=0|true))||(__CLR4_5_2auaaualvluljqm.R.iget(14232)==0&false))) {{
            //2000h Left/Right height on side 2
            __CLR4_5_2auaaualvluljqm.R.inc(14233);numChannels += 2;
            __CLR4_5_2auaaualvluljqm.R.inc(14234);dwChannelMask |= 0x00000010; //SPEAKER_BACK_LEFT
            __CLR4_5_2auaaualvluljqm.R.inc(14235);dwChannelMask |= 0x00000020; //SPEAKER_BACK_RIGHT
        }
        }__CLR4_5_2auaaualvluljqm.R.inc(14236);if (((((channelLayout & 0x4000) == 0x4000)&&(__CLR4_5_2auaaualvluljqm.R.iget(14237)!=0|true))||(__CLR4_5_2auaaualvluljqm.R.iget(14238)==0&false))) {{
            //4000h Center height in rear 1
            __CLR4_5_2auaaualvluljqm.R.inc(14239);numChannels += 1;
            __CLR4_5_2auaaualvluljqm.R.inc(14240);dwChannelMask |= 0x00010000; //SPEAKER_TOP_BACK_CENTER
        }
        }__CLR4_5_2auaaualvluljqm.R.inc(14241);if (((((channelLayout & 0x8000) == 0x8000)&&(__CLR4_5_2auaaualvluljqm.R.iget(14242)!=0|true))||(__CLR4_5_2auaaualvluljqm.R.iget(14243)==0&false))) {{
            //8000h Left/Right height in rear 2
            __CLR4_5_2auaaualvluljqm.R.inc(14244);numChannels += 2;
            __CLR4_5_2auaaualvluljqm.R.inc(14245);dwChannelMask |= 0x00008000; //SPEAKER_TOP_BACK_LEFT
            __CLR4_5_2auaaualvluljqm.R.inc(14246);dwChannelMask |= 0x00020000; //SPEAKER_TOP_BACK_RIGHT
        }
        }__CLR4_5_2auaaualvluljqm.R.inc(14247);if (((((channelLayout & 0x10000) == 0x10000)&&(__CLR4_5_2auaaualvluljqm.R.iget(14248)!=0|true))||(__CLR4_5_2auaaualvluljqm.R.iget(14249)==0&false))) {{
            //10000h Center below in front
            __CLR4_5_2auaaualvluljqm.R.inc(14250);numChannels += 1;
        }
        }__CLR4_5_2auaaualvluljqm.R.inc(14251);if (((((channelLayout & 0x20000) == 0x20000)&&(__CLR4_5_2auaaualvluljqm.R.iget(14252)!=0|true))||(__CLR4_5_2auaaualvluljqm.R.iget(14253)==0&false))) {{
            //20000h Left/Right below in front
            __CLR4_5_2auaaualvluljqm.R.inc(14254);numChannels += 2;
        }
        }__CLR4_5_2auaaualvluljqm.R.inc(14255);return new int[]{numChannels, dwChannelMask};
    }finally{__CLR4_5_2auaaualvluljqm.R.flushNeeded();}}


}
