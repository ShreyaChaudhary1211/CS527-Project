/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.mp4parser.iso14496.part15;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.AbstractBox;

import java.nio.ByteBuffer;

public class TierInfoBox extends AbstractBox {public static class __CLR4_5_2gu4gu4lvl9elal{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0030\u0037\u0038\u0035\u0039\u0030\u0037\u0038\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714413275835L,8589935092L,21891,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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
        super(TYPE);__CLR4_5_2gu4gu4lvl9elal.R.inc(21821);try{__CLR4_5_2gu4gu4lvl9elal.R.inc(21820);
    }finally{__CLR4_5_2gu4gu4lvl9elal.R.flushNeeded();}}

    @Override
    protected long getContentSize() {try{__CLR4_5_2gu4gu4lvl9elal.R.inc(21822);
        __CLR4_5_2gu4gu4lvl9elal.R.inc(21823);return 13;
    }finally{__CLR4_5_2gu4gu4lvl9elal.R.flushNeeded();}}

    @Override
    protected void getContent(ByteBuffer byteBuffer) {try{__CLR4_5_2gu4gu4lvl9elal.R.inc(21824);
        __CLR4_5_2gu4gu4lvl9elal.R.inc(21825);IsoTypeWriter.writeUInt16(byteBuffer, tierID);

        __CLR4_5_2gu4gu4lvl9elal.R.inc(21826);IsoTypeWriter.writeUInt8(byteBuffer, profileIndication);
        __CLR4_5_2gu4gu4lvl9elal.R.inc(21827);IsoTypeWriter.writeUInt8(byteBuffer, profile_compatibility);
        __CLR4_5_2gu4gu4lvl9elal.R.inc(21828);IsoTypeWriter.writeUInt8(byteBuffer, levelIndication);
        __CLR4_5_2gu4gu4lvl9elal.R.inc(21829);IsoTypeWriter.writeUInt8(byteBuffer, reserved1);

        __CLR4_5_2gu4gu4lvl9elal.R.inc(21830);IsoTypeWriter.writeUInt16(byteBuffer, visualWidth);
        __CLR4_5_2gu4gu4lvl9elal.R.inc(21831);IsoTypeWriter.writeUInt16(byteBuffer, visualHeight);

        __CLR4_5_2gu4gu4lvl9elal.R.inc(21832);IsoTypeWriter.writeUInt8(byteBuffer, (discardable << 6) + (constantFrameRate << 4) +reserved2);

        __CLR4_5_2gu4gu4lvl9elal.R.inc(21833);IsoTypeWriter.writeUInt16(byteBuffer, frameRate);
    }finally{__CLR4_5_2gu4gu4lvl9elal.R.flushNeeded();}}

    @Override
    protected void _parseDetails(ByteBuffer content) {try{__CLR4_5_2gu4gu4lvl9elal.R.inc(21834);
        __CLR4_5_2gu4gu4lvl9elal.R.inc(21835);tierID = IsoTypeReader.readUInt16(content);

        __CLR4_5_2gu4gu4lvl9elal.R.inc(21836);profileIndication = IsoTypeReader.readUInt8(content);
        __CLR4_5_2gu4gu4lvl9elal.R.inc(21837);profile_compatibility = IsoTypeReader.readUInt8(content);
        __CLR4_5_2gu4gu4lvl9elal.R.inc(21838);levelIndication = IsoTypeReader.readUInt8(content);
        __CLR4_5_2gu4gu4lvl9elal.R.inc(21839);reserved1 = IsoTypeReader.readUInt8(content);

        __CLR4_5_2gu4gu4lvl9elal.R.inc(21840);visualWidth = IsoTypeReader.readUInt16(content);
        __CLR4_5_2gu4gu4lvl9elal.R.inc(21841);visualHeight = IsoTypeReader.readUInt16(content);
        __CLR4_5_2gu4gu4lvl9elal.R.inc(21842);int a = IsoTypeReader.readUInt8(content);
        __CLR4_5_2gu4gu4lvl9elal.R.inc(21843);discardable = (a & 0xC0) >> 6;
        __CLR4_5_2gu4gu4lvl9elal.R.inc(21844);constantFrameRate = (a & 0x30) >> 4;
        __CLR4_5_2gu4gu4lvl9elal.R.inc(21845);reserved2 = a & 0xf;
        __CLR4_5_2gu4gu4lvl9elal.R.inc(21846);frameRate = IsoTypeReader.readUInt16(content);

    }finally{__CLR4_5_2gu4gu4lvl9elal.R.flushNeeded();}}

    public int getTierID() {try{__CLR4_5_2gu4gu4lvl9elal.R.inc(21847);
        __CLR4_5_2gu4gu4lvl9elal.R.inc(21848);return tierID;
    }finally{__CLR4_5_2gu4gu4lvl9elal.R.flushNeeded();}}

    public void setTierID(int tierID) {try{__CLR4_5_2gu4gu4lvl9elal.R.inc(21849);
        __CLR4_5_2gu4gu4lvl9elal.R.inc(21850);this.tierID = tierID;
    }finally{__CLR4_5_2gu4gu4lvl9elal.R.flushNeeded();}}

    public int getProfileIndication() {try{__CLR4_5_2gu4gu4lvl9elal.R.inc(21851);
        __CLR4_5_2gu4gu4lvl9elal.R.inc(21852);return profileIndication;
    }finally{__CLR4_5_2gu4gu4lvl9elal.R.flushNeeded();}}

    public void setProfileIndication(int profileIndication) {try{__CLR4_5_2gu4gu4lvl9elal.R.inc(21853);
        __CLR4_5_2gu4gu4lvl9elal.R.inc(21854);this.profileIndication = profileIndication;
    }finally{__CLR4_5_2gu4gu4lvl9elal.R.flushNeeded();}}

    public int getProfile_compatibility() {try{__CLR4_5_2gu4gu4lvl9elal.R.inc(21855);
        __CLR4_5_2gu4gu4lvl9elal.R.inc(21856);return profile_compatibility;
    }finally{__CLR4_5_2gu4gu4lvl9elal.R.flushNeeded();}}

    public void setProfile_compatibility(int profile_compatibility) {try{__CLR4_5_2gu4gu4lvl9elal.R.inc(21857);
        __CLR4_5_2gu4gu4lvl9elal.R.inc(21858);this.profile_compatibility = profile_compatibility;
    }finally{__CLR4_5_2gu4gu4lvl9elal.R.flushNeeded();}}

    public int getLevelIndication() {try{__CLR4_5_2gu4gu4lvl9elal.R.inc(21859);
        __CLR4_5_2gu4gu4lvl9elal.R.inc(21860);return levelIndication;
    }finally{__CLR4_5_2gu4gu4lvl9elal.R.flushNeeded();}}

    public void setLevelIndication(int levelIndication) {try{__CLR4_5_2gu4gu4lvl9elal.R.inc(21861);
        __CLR4_5_2gu4gu4lvl9elal.R.inc(21862);this.levelIndication = levelIndication;
    }finally{__CLR4_5_2gu4gu4lvl9elal.R.flushNeeded();}}

    public int getReserved1() {try{__CLR4_5_2gu4gu4lvl9elal.R.inc(21863);
        __CLR4_5_2gu4gu4lvl9elal.R.inc(21864);return reserved1;
    }finally{__CLR4_5_2gu4gu4lvl9elal.R.flushNeeded();}}

    public void setReserved1(int reserved1) {try{__CLR4_5_2gu4gu4lvl9elal.R.inc(21865);
        __CLR4_5_2gu4gu4lvl9elal.R.inc(21866);this.reserved1 = reserved1;
    }finally{__CLR4_5_2gu4gu4lvl9elal.R.flushNeeded();}}

    public int getVisualWidth() {try{__CLR4_5_2gu4gu4lvl9elal.R.inc(21867);
        __CLR4_5_2gu4gu4lvl9elal.R.inc(21868);return visualWidth;
    }finally{__CLR4_5_2gu4gu4lvl9elal.R.flushNeeded();}}

    public void setVisualWidth(int visualWidth) {try{__CLR4_5_2gu4gu4lvl9elal.R.inc(21869);
        __CLR4_5_2gu4gu4lvl9elal.R.inc(21870);this.visualWidth = visualWidth;
    }finally{__CLR4_5_2gu4gu4lvl9elal.R.flushNeeded();}}

    public int getVisualHeight() {try{__CLR4_5_2gu4gu4lvl9elal.R.inc(21871);
        __CLR4_5_2gu4gu4lvl9elal.R.inc(21872);return visualHeight;
    }finally{__CLR4_5_2gu4gu4lvl9elal.R.flushNeeded();}}

    public void setVisualHeight(int visualHeight) {try{__CLR4_5_2gu4gu4lvl9elal.R.inc(21873);
        __CLR4_5_2gu4gu4lvl9elal.R.inc(21874);this.visualHeight = visualHeight;
    }finally{__CLR4_5_2gu4gu4lvl9elal.R.flushNeeded();}}

    public int getDiscardable() {try{__CLR4_5_2gu4gu4lvl9elal.R.inc(21875);
        __CLR4_5_2gu4gu4lvl9elal.R.inc(21876);return discardable;
    }finally{__CLR4_5_2gu4gu4lvl9elal.R.flushNeeded();}}

    public void setDiscardable(int discardable) {try{__CLR4_5_2gu4gu4lvl9elal.R.inc(21877);
        __CLR4_5_2gu4gu4lvl9elal.R.inc(21878);this.discardable = discardable;
    }finally{__CLR4_5_2gu4gu4lvl9elal.R.flushNeeded();}}

    public int getConstantFrameRate() {try{__CLR4_5_2gu4gu4lvl9elal.R.inc(21879);
        __CLR4_5_2gu4gu4lvl9elal.R.inc(21880);return constantFrameRate;
    }finally{__CLR4_5_2gu4gu4lvl9elal.R.flushNeeded();}}

    public void setConstantFrameRate(int constantFrameRate) {try{__CLR4_5_2gu4gu4lvl9elal.R.inc(21881);
        __CLR4_5_2gu4gu4lvl9elal.R.inc(21882);this.constantFrameRate = constantFrameRate;
    }finally{__CLR4_5_2gu4gu4lvl9elal.R.flushNeeded();}}

    public int getReserved2() {try{__CLR4_5_2gu4gu4lvl9elal.R.inc(21883);
        __CLR4_5_2gu4gu4lvl9elal.R.inc(21884);return reserved2;
    }finally{__CLR4_5_2gu4gu4lvl9elal.R.flushNeeded();}}

    public void setReserved2(int reserved2) {try{__CLR4_5_2gu4gu4lvl9elal.R.inc(21885);
        __CLR4_5_2gu4gu4lvl9elal.R.inc(21886);this.reserved2 = reserved2;
    }finally{__CLR4_5_2gu4gu4lvl9elal.R.flushNeeded();}}

    public int getFrameRate() {try{__CLR4_5_2gu4gu4lvl9elal.R.inc(21887);
        __CLR4_5_2gu4gu4lvl9elal.R.inc(21888);return frameRate;
    }finally{__CLR4_5_2gu4gu4lvl9elal.R.flushNeeded();}}

    public void setFrameRate(int frameRate) {try{__CLR4_5_2gu4gu4lvl9elal.R.inc(21889);
        __CLR4_5_2gu4gu4lvl9elal.R.inc(21890);this.frameRate = frameRate;
    }finally{__CLR4_5_2gu4gu4lvl9elal.R.flushNeeded();}}
}