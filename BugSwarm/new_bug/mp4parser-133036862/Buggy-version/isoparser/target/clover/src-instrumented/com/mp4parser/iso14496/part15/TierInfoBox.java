/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.mp4parser.iso14496.part15;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.AbstractBox;

import java.nio.ByteBuffer;

public class TierInfoBox extends AbstractBox {public static class __CLR4_5_2gwrgwrlvlulnuj{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0033\u0033\u0030\u0033\u0036\u0038\u0036\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714448869219L,8589935092L,21986,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static final String TYPE = "tiri";

    int tierID;
    int profileIndication;
    int profile_compatibility;
    int levelIndication;
    int reserved1 = 0;
    int visualWidth;
    int visualHeight;
    int discardable;
    int constantFrameRate;
    int reserved2 = 0;
    int frameRate;

    public TierInfoBox() {
        super(TYPE);__CLR4_5_2gwrgwrlvlulnuj.R.inc(21916);try{__CLR4_5_2gwrgwrlvlulnuj.R.inc(21915);
    }finally{__CLR4_5_2gwrgwrlvlulnuj.R.flushNeeded();}}

    @Override
    protected long getContentSize() {try{__CLR4_5_2gwrgwrlvlulnuj.R.inc(21917);
        __CLR4_5_2gwrgwrlvlulnuj.R.inc(21918);return 13;
    }finally{__CLR4_5_2gwrgwrlvlulnuj.R.flushNeeded();}}

    @Override
    protected void getContent(ByteBuffer byteBuffer) {try{__CLR4_5_2gwrgwrlvlulnuj.R.inc(21919);
        __CLR4_5_2gwrgwrlvlulnuj.R.inc(21920);IsoTypeWriter.writeUInt16(byteBuffer, tierID);

        __CLR4_5_2gwrgwrlvlulnuj.R.inc(21921);IsoTypeWriter.writeUInt8(byteBuffer, profileIndication);
        __CLR4_5_2gwrgwrlvlulnuj.R.inc(21922);IsoTypeWriter.writeUInt8(byteBuffer, profile_compatibility);
        __CLR4_5_2gwrgwrlvlulnuj.R.inc(21923);IsoTypeWriter.writeUInt8(byteBuffer, levelIndication);
        __CLR4_5_2gwrgwrlvlulnuj.R.inc(21924);IsoTypeWriter.writeUInt8(byteBuffer, reserved1);

        __CLR4_5_2gwrgwrlvlulnuj.R.inc(21925);IsoTypeWriter.writeUInt16(byteBuffer, visualWidth);
        __CLR4_5_2gwrgwrlvlulnuj.R.inc(21926);IsoTypeWriter.writeUInt16(byteBuffer, visualHeight);

        __CLR4_5_2gwrgwrlvlulnuj.R.inc(21927);IsoTypeWriter.writeUInt8(byteBuffer, (discardable << 6) + (constantFrameRate << 4) +reserved2);

        __CLR4_5_2gwrgwrlvlulnuj.R.inc(21928);IsoTypeWriter.writeUInt16(byteBuffer, frameRate);
    }finally{__CLR4_5_2gwrgwrlvlulnuj.R.flushNeeded();}}

    @Override
    protected void _parseDetails(ByteBuffer content) {try{__CLR4_5_2gwrgwrlvlulnuj.R.inc(21929);
        __CLR4_5_2gwrgwrlvlulnuj.R.inc(21930);tierID = IsoTypeReader.readUInt16(content);

        __CLR4_5_2gwrgwrlvlulnuj.R.inc(21931);profileIndication = IsoTypeReader.readUInt8(content);
        __CLR4_5_2gwrgwrlvlulnuj.R.inc(21932);profile_compatibility = IsoTypeReader.readUInt8(content);
        __CLR4_5_2gwrgwrlvlulnuj.R.inc(21933);levelIndication = IsoTypeReader.readUInt8(content);
        __CLR4_5_2gwrgwrlvlulnuj.R.inc(21934);reserved1 = IsoTypeReader.readUInt8(content);

        __CLR4_5_2gwrgwrlvlulnuj.R.inc(21935);visualWidth = IsoTypeReader.readUInt16(content);
        __CLR4_5_2gwrgwrlvlulnuj.R.inc(21936);visualHeight = IsoTypeReader.readUInt16(content);
        __CLR4_5_2gwrgwrlvlulnuj.R.inc(21937);int a = IsoTypeReader.readUInt8(content);
        __CLR4_5_2gwrgwrlvlulnuj.R.inc(21938);discardable = (a & 0xC0) >> 6;
        __CLR4_5_2gwrgwrlvlulnuj.R.inc(21939);constantFrameRate = (a & 0x30) >> 4;
        __CLR4_5_2gwrgwrlvlulnuj.R.inc(21940);reserved2 = a & 0xf;
        __CLR4_5_2gwrgwrlvlulnuj.R.inc(21941);frameRate = IsoTypeReader.readUInt16(content);

    }finally{__CLR4_5_2gwrgwrlvlulnuj.R.flushNeeded();}}

    public int getTierID() {try{__CLR4_5_2gwrgwrlvlulnuj.R.inc(21942);
        __CLR4_5_2gwrgwrlvlulnuj.R.inc(21943);return tierID;
    }finally{__CLR4_5_2gwrgwrlvlulnuj.R.flushNeeded();}}

    public void setTierID(int tierID) {try{__CLR4_5_2gwrgwrlvlulnuj.R.inc(21944);
        __CLR4_5_2gwrgwrlvlulnuj.R.inc(21945);this.tierID = tierID;
    }finally{__CLR4_5_2gwrgwrlvlulnuj.R.flushNeeded();}}

    public int getProfileIndication() {try{__CLR4_5_2gwrgwrlvlulnuj.R.inc(21946);
        __CLR4_5_2gwrgwrlvlulnuj.R.inc(21947);return profileIndication;
    }finally{__CLR4_5_2gwrgwrlvlulnuj.R.flushNeeded();}}

    public void setProfileIndication(int profileIndication) {try{__CLR4_5_2gwrgwrlvlulnuj.R.inc(21948);
        __CLR4_5_2gwrgwrlvlulnuj.R.inc(21949);this.profileIndication = profileIndication;
    }finally{__CLR4_5_2gwrgwrlvlulnuj.R.flushNeeded();}}

    public int getProfile_compatibility() {try{__CLR4_5_2gwrgwrlvlulnuj.R.inc(21950);
        __CLR4_5_2gwrgwrlvlulnuj.R.inc(21951);return profile_compatibility;
    }finally{__CLR4_5_2gwrgwrlvlulnuj.R.flushNeeded();}}

    public void setProfile_compatibility(int profile_compatibility) {try{__CLR4_5_2gwrgwrlvlulnuj.R.inc(21952);
        __CLR4_5_2gwrgwrlvlulnuj.R.inc(21953);this.profile_compatibility = profile_compatibility;
    }finally{__CLR4_5_2gwrgwrlvlulnuj.R.flushNeeded();}}

    public int getLevelIndication() {try{__CLR4_5_2gwrgwrlvlulnuj.R.inc(21954);
        __CLR4_5_2gwrgwrlvlulnuj.R.inc(21955);return levelIndication;
    }finally{__CLR4_5_2gwrgwrlvlulnuj.R.flushNeeded();}}

    public void setLevelIndication(int levelIndication) {try{__CLR4_5_2gwrgwrlvlulnuj.R.inc(21956);
        __CLR4_5_2gwrgwrlvlulnuj.R.inc(21957);this.levelIndication = levelIndication;
    }finally{__CLR4_5_2gwrgwrlvlulnuj.R.flushNeeded();}}

    public int getReserved1() {try{__CLR4_5_2gwrgwrlvlulnuj.R.inc(21958);
        __CLR4_5_2gwrgwrlvlulnuj.R.inc(21959);return reserved1;
    }finally{__CLR4_5_2gwrgwrlvlulnuj.R.flushNeeded();}}

    public void setReserved1(int reserved1) {try{__CLR4_5_2gwrgwrlvlulnuj.R.inc(21960);
        __CLR4_5_2gwrgwrlvlulnuj.R.inc(21961);this.reserved1 = reserved1;
    }finally{__CLR4_5_2gwrgwrlvlulnuj.R.flushNeeded();}}

    public int getVisualWidth() {try{__CLR4_5_2gwrgwrlvlulnuj.R.inc(21962);
        __CLR4_5_2gwrgwrlvlulnuj.R.inc(21963);return visualWidth;
    }finally{__CLR4_5_2gwrgwrlvlulnuj.R.flushNeeded();}}

    public void setVisualWidth(int visualWidth) {try{__CLR4_5_2gwrgwrlvlulnuj.R.inc(21964);
        __CLR4_5_2gwrgwrlvlulnuj.R.inc(21965);this.visualWidth = visualWidth;
    }finally{__CLR4_5_2gwrgwrlvlulnuj.R.flushNeeded();}}

    public int getVisualHeight() {try{__CLR4_5_2gwrgwrlvlulnuj.R.inc(21966);
        __CLR4_5_2gwrgwrlvlulnuj.R.inc(21967);return visualHeight;
    }finally{__CLR4_5_2gwrgwrlvlulnuj.R.flushNeeded();}}

    public void setVisualHeight(int visualHeight) {try{__CLR4_5_2gwrgwrlvlulnuj.R.inc(21968);
        __CLR4_5_2gwrgwrlvlulnuj.R.inc(21969);this.visualHeight = visualHeight;
    }finally{__CLR4_5_2gwrgwrlvlulnuj.R.flushNeeded();}}

    public int getDiscardable() {try{__CLR4_5_2gwrgwrlvlulnuj.R.inc(21970);
        __CLR4_5_2gwrgwrlvlulnuj.R.inc(21971);return discardable;
    }finally{__CLR4_5_2gwrgwrlvlulnuj.R.flushNeeded();}}

    public void setDiscardable(int discardable) {try{__CLR4_5_2gwrgwrlvlulnuj.R.inc(21972);
        __CLR4_5_2gwrgwrlvlulnuj.R.inc(21973);this.discardable = discardable;
    }finally{__CLR4_5_2gwrgwrlvlulnuj.R.flushNeeded();}}

    public int getConstantFrameRate() {try{__CLR4_5_2gwrgwrlvlulnuj.R.inc(21974);
        __CLR4_5_2gwrgwrlvlulnuj.R.inc(21975);return constantFrameRate;
    }finally{__CLR4_5_2gwrgwrlvlulnuj.R.flushNeeded();}}

    public void setConstantFrameRate(int constantFrameRate) {try{__CLR4_5_2gwrgwrlvlulnuj.R.inc(21976);
        __CLR4_5_2gwrgwrlvlulnuj.R.inc(21977);this.constantFrameRate = constantFrameRate;
    }finally{__CLR4_5_2gwrgwrlvlulnuj.R.flushNeeded();}}

    public int getReserved2() {try{__CLR4_5_2gwrgwrlvlulnuj.R.inc(21978);
        __CLR4_5_2gwrgwrlvlulnuj.R.inc(21979);return reserved2;
    }finally{__CLR4_5_2gwrgwrlvlulnuj.R.flushNeeded();}}

    public void setReserved2(int reserved2) {try{__CLR4_5_2gwrgwrlvlulnuj.R.inc(21980);
        __CLR4_5_2gwrgwrlvlulnuj.R.inc(21981);this.reserved2 = reserved2;
    }finally{__CLR4_5_2gwrgwrlvlulnuj.R.flushNeeded();}}

    public int getFrameRate() {try{__CLR4_5_2gwrgwrlvlulnuj.R.inc(21982);
        __CLR4_5_2gwrgwrlvlulnuj.R.inc(21983);return frameRate;
    }finally{__CLR4_5_2gwrgwrlvlulnuj.R.flushNeeded();}}

    public void setFrameRate(int frameRate) {try{__CLR4_5_2gwrgwrlvlulnuj.R.inc(21984);
        __CLR4_5_2gwrgwrlvlulnuj.R.inc(21985);this.frameRate = frameRate;
    }finally{__CLR4_5_2gwrgwrlvlulnuj.R.flushNeeded();}}
}