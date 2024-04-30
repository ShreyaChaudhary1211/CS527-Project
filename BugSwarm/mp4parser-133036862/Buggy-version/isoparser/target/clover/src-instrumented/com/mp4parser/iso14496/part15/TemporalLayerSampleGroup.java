/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.mp4parser.iso14496.part15;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.boxes.mp4.samplegrouping.GroupEntry;

import java.nio.ByteBuffer;

/**
 * Created by sannies on 08.09.2014.
 */
public class TemporalLayerSampleGroup extends GroupEntry {public static class __CLR4_5_2gr1gr1lvlulnt7{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0033\u0033\u0030\u0033\u0036\u0038\u0036\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714448869219L,8589935092L,21856,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static final String TYPE = "tscl";

    int temporalLayerId;
    int tlprofile_space;
    boolean tltier_flag;
    int tlprofile_idc;
    long tlprofile_compatibility_flags;
    long tlconstraint_indicator_flags;
    int tllevel_idc;
    int tlMaxBitRate;
    int tlAvgBitRate;
    int tlConstantFrameRate;
    int tlAvgFrameRate;

    @Override
    public String getType() {try{__CLR4_5_2gr1gr1lvlulnt7.R.inc(21709);
        __CLR4_5_2gr1gr1lvlulnt7.R.inc(21710);return TYPE;
    }finally{__CLR4_5_2gr1gr1lvlulnt7.R.flushNeeded();}}

    public int getTemporalLayerId() {try{__CLR4_5_2gr1gr1lvlulnt7.R.inc(21711);
        __CLR4_5_2gr1gr1lvlulnt7.R.inc(21712);return temporalLayerId;
    }finally{__CLR4_5_2gr1gr1lvlulnt7.R.flushNeeded();}}

    public void setTemporalLayerId(int temporalLayerId) {try{__CLR4_5_2gr1gr1lvlulnt7.R.inc(21713);
        __CLR4_5_2gr1gr1lvlulnt7.R.inc(21714);this.temporalLayerId = temporalLayerId;
    }finally{__CLR4_5_2gr1gr1lvlulnt7.R.flushNeeded();}}

    public int getTlprofile_space() {try{__CLR4_5_2gr1gr1lvlulnt7.R.inc(21715);
        __CLR4_5_2gr1gr1lvlulnt7.R.inc(21716);return tlprofile_space;
    }finally{__CLR4_5_2gr1gr1lvlulnt7.R.flushNeeded();}}

    public void setTlprofile_space(int tlprofile_space) {try{__CLR4_5_2gr1gr1lvlulnt7.R.inc(21717);
        __CLR4_5_2gr1gr1lvlulnt7.R.inc(21718);this.tlprofile_space = tlprofile_space;
    }finally{__CLR4_5_2gr1gr1lvlulnt7.R.flushNeeded();}}

    public boolean isTltier_flag() {try{__CLR4_5_2gr1gr1lvlulnt7.R.inc(21719);
        __CLR4_5_2gr1gr1lvlulnt7.R.inc(21720);return tltier_flag;
    }finally{__CLR4_5_2gr1gr1lvlulnt7.R.flushNeeded();}}

    public void setTltier_flag(boolean tltier_flag) {try{__CLR4_5_2gr1gr1lvlulnt7.R.inc(21721);
        __CLR4_5_2gr1gr1lvlulnt7.R.inc(21722);this.tltier_flag = tltier_flag;
    }finally{__CLR4_5_2gr1gr1lvlulnt7.R.flushNeeded();}}

    public int getTlprofile_idc() {try{__CLR4_5_2gr1gr1lvlulnt7.R.inc(21723);
        __CLR4_5_2gr1gr1lvlulnt7.R.inc(21724);return tlprofile_idc;
    }finally{__CLR4_5_2gr1gr1lvlulnt7.R.flushNeeded();}}

    public void setTlprofile_idc(int tlprofile_idc) {try{__CLR4_5_2gr1gr1lvlulnt7.R.inc(21725);
        __CLR4_5_2gr1gr1lvlulnt7.R.inc(21726);this.tlprofile_idc = tlprofile_idc;
    }finally{__CLR4_5_2gr1gr1lvlulnt7.R.flushNeeded();}}

    public long getTlprofile_compatibility_flags() {try{__CLR4_5_2gr1gr1lvlulnt7.R.inc(21727);
        __CLR4_5_2gr1gr1lvlulnt7.R.inc(21728);return tlprofile_compatibility_flags;
    }finally{__CLR4_5_2gr1gr1lvlulnt7.R.flushNeeded();}}

    public void setTlprofile_compatibility_flags(long tlprofile_compatibility_flags) {try{__CLR4_5_2gr1gr1lvlulnt7.R.inc(21729);
        __CLR4_5_2gr1gr1lvlulnt7.R.inc(21730);this.tlprofile_compatibility_flags = tlprofile_compatibility_flags;
    }finally{__CLR4_5_2gr1gr1lvlulnt7.R.flushNeeded();}}

    public long getTlconstraint_indicator_flags() {try{__CLR4_5_2gr1gr1lvlulnt7.R.inc(21731);
        __CLR4_5_2gr1gr1lvlulnt7.R.inc(21732);return tlconstraint_indicator_flags;
    }finally{__CLR4_5_2gr1gr1lvlulnt7.R.flushNeeded();}}

    public void setTlconstraint_indicator_flags(long tlconstraint_indicator_flags) {try{__CLR4_5_2gr1gr1lvlulnt7.R.inc(21733);
        __CLR4_5_2gr1gr1lvlulnt7.R.inc(21734);this.tlconstraint_indicator_flags = tlconstraint_indicator_flags;
    }finally{__CLR4_5_2gr1gr1lvlulnt7.R.flushNeeded();}}

    public int getTllevel_idc() {try{__CLR4_5_2gr1gr1lvlulnt7.R.inc(21735);
        __CLR4_5_2gr1gr1lvlulnt7.R.inc(21736);return tllevel_idc;
    }finally{__CLR4_5_2gr1gr1lvlulnt7.R.flushNeeded();}}

    public void setTllevel_idc(int tllevel_idc) {try{__CLR4_5_2gr1gr1lvlulnt7.R.inc(21737);
        __CLR4_5_2gr1gr1lvlulnt7.R.inc(21738);this.tllevel_idc = tllevel_idc;
    }finally{__CLR4_5_2gr1gr1lvlulnt7.R.flushNeeded();}}

    public int getTlMaxBitRate() {try{__CLR4_5_2gr1gr1lvlulnt7.R.inc(21739);
        __CLR4_5_2gr1gr1lvlulnt7.R.inc(21740);return tlMaxBitRate;
    }finally{__CLR4_5_2gr1gr1lvlulnt7.R.flushNeeded();}}

    public void setTlMaxBitRate(int tlMaxBitRate) {try{__CLR4_5_2gr1gr1lvlulnt7.R.inc(21741);
        __CLR4_5_2gr1gr1lvlulnt7.R.inc(21742);this.tlMaxBitRate = tlMaxBitRate;
    }finally{__CLR4_5_2gr1gr1lvlulnt7.R.flushNeeded();}}

    public int getTlAvgBitRate() {try{__CLR4_5_2gr1gr1lvlulnt7.R.inc(21743);
        __CLR4_5_2gr1gr1lvlulnt7.R.inc(21744);return tlAvgBitRate;
    }finally{__CLR4_5_2gr1gr1lvlulnt7.R.flushNeeded();}}

    public void setTlAvgBitRate(int tlAvgBitRate) {try{__CLR4_5_2gr1gr1lvlulnt7.R.inc(21745);
        __CLR4_5_2gr1gr1lvlulnt7.R.inc(21746);this.tlAvgBitRate = tlAvgBitRate;
    }finally{__CLR4_5_2gr1gr1lvlulnt7.R.flushNeeded();}}

    public int getTlConstantFrameRate() {try{__CLR4_5_2gr1gr1lvlulnt7.R.inc(21747);
        __CLR4_5_2gr1gr1lvlulnt7.R.inc(21748);return tlConstantFrameRate;
    }finally{__CLR4_5_2gr1gr1lvlulnt7.R.flushNeeded();}}

    public void setTlConstantFrameRate(int tlConstantFrameRate) {try{__CLR4_5_2gr1gr1lvlulnt7.R.inc(21749);
        __CLR4_5_2gr1gr1lvlulnt7.R.inc(21750);this.tlConstantFrameRate = tlConstantFrameRate;
    }finally{__CLR4_5_2gr1gr1lvlulnt7.R.flushNeeded();}}

    public int getTlAvgFrameRate() {try{__CLR4_5_2gr1gr1lvlulnt7.R.inc(21751);
        __CLR4_5_2gr1gr1lvlulnt7.R.inc(21752);return tlAvgFrameRate;
    }finally{__CLR4_5_2gr1gr1lvlulnt7.R.flushNeeded();}}

    public void setTlAvgFrameRate(int tlAvgFrameRate) {try{__CLR4_5_2gr1gr1lvlulnt7.R.inc(21753);
        __CLR4_5_2gr1gr1lvlulnt7.R.inc(21754);this.tlAvgFrameRate = tlAvgFrameRate;
    }finally{__CLR4_5_2gr1gr1lvlulnt7.R.flushNeeded();}}

    @Override
    public void parse(ByteBuffer byteBuffer) {try{__CLR4_5_2gr1gr1lvlulnt7.R.inc(21755);
        __CLR4_5_2gr1gr1lvlulnt7.R.inc(21756);temporalLayerId = IsoTypeReader.readUInt8(byteBuffer);
        __CLR4_5_2gr1gr1lvlulnt7.R.inc(21757);int a =IsoTypeReader.readUInt8(byteBuffer);
        __CLR4_5_2gr1gr1lvlulnt7.R.inc(21758);tlprofile_space = (a & 0xC0)>>6;
        __CLR4_5_2gr1gr1lvlulnt7.R.inc(21759);tltier_flag = (a & 0x20)>0;
        __CLR4_5_2gr1gr1lvlulnt7.R.inc(21760);tlprofile_idc = (a & 0x1F);
        __CLR4_5_2gr1gr1lvlulnt7.R.inc(21761);tlprofile_compatibility_flags = IsoTypeReader.readUInt32(byteBuffer);
        __CLR4_5_2gr1gr1lvlulnt7.R.inc(21762);tlconstraint_indicator_flags = IsoTypeReader.readUInt48(byteBuffer);
        __CLR4_5_2gr1gr1lvlulnt7.R.inc(21763);tllevel_idc = IsoTypeReader.readUInt8(byteBuffer);
        __CLR4_5_2gr1gr1lvlulnt7.R.inc(21764);tlMaxBitRate = IsoTypeReader.readUInt16(byteBuffer);
        __CLR4_5_2gr1gr1lvlulnt7.R.inc(21765);tlAvgBitRate = IsoTypeReader.readUInt16(byteBuffer);
        __CLR4_5_2gr1gr1lvlulnt7.R.inc(21766);tlConstantFrameRate = IsoTypeReader.readUInt8(byteBuffer);
        __CLR4_5_2gr1gr1lvlulnt7.R.inc(21767);tlAvgFrameRate = IsoTypeReader.readUInt16(byteBuffer);
    }finally{__CLR4_5_2gr1gr1lvlulnt7.R.flushNeeded();}}

    @Override
    public ByteBuffer get() {try{__CLR4_5_2gr1gr1lvlulnt7.R.inc(21768);
        __CLR4_5_2gr1gr1lvlulnt7.R.inc(21769);ByteBuffer byteBuffer = ByteBuffer.allocate(20);

        __CLR4_5_2gr1gr1lvlulnt7.R.inc(21770);IsoTypeWriter.writeUInt8(byteBuffer, temporalLayerId);
        __CLR4_5_2gr1gr1lvlulnt7.R.inc(21771);IsoTypeWriter.writeUInt8(byteBuffer, (tlprofile_space<<6) +( (((tltier_flag)&&(__CLR4_5_2gr1gr1lvlulnt7.R.iget(21772)!=0|true))||(__CLR4_5_2gr1gr1lvlulnt7.R.iget(21773)==0&false))?0x20:0) + tlprofile_idc);

        __CLR4_5_2gr1gr1lvlulnt7.R.inc(21774);IsoTypeWriter.writeUInt32(byteBuffer, tlprofile_compatibility_flags);
        __CLR4_5_2gr1gr1lvlulnt7.R.inc(21775);IsoTypeWriter.writeUInt48(byteBuffer, tlconstraint_indicator_flags);
        __CLR4_5_2gr1gr1lvlulnt7.R.inc(21776);IsoTypeWriter.writeUInt8(byteBuffer, tllevel_idc);
        __CLR4_5_2gr1gr1lvlulnt7.R.inc(21777);IsoTypeWriter.writeUInt16(byteBuffer, tlMaxBitRate);
        __CLR4_5_2gr1gr1lvlulnt7.R.inc(21778);IsoTypeWriter.writeUInt16(byteBuffer, tlAvgBitRate );
        __CLR4_5_2gr1gr1lvlulnt7.R.inc(21779);IsoTypeWriter.writeUInt8(byteBuffer, tlConstantFrameRate);
        __CLR4_5_2gr1gr1lvlulnt7.R.inc(21780);IsoTypeWriter.writeUInt16(byteBuffer, tlAvgFrameRate);
        __CLR4_5_2gr1gr1lvlulnt7.R.inc(21781);return (ByteBuffer) byteBuffer.rewind();
    }finally{__CLR4_5_2gr1gr1lvlulnt7.R.flushNeeded();}}

    @Override
    public int size() {try{__CLR4_5_2gr1gr1lvlulnt7.R.inc(21782);
        __CLR4_5_2gr1gr1lvlulnt7.R.inc(21783);return 20;
    }finally{__CLR4_5_2gr1gr1lvlulnt7.R.flushNeeded();}}

    @Override
    public boolean equals(Object o) {try{__CLR4_5_2gr1gr1lvlulnt7.R.inc(21784);

        __CLR4_5_2gr1gr1lvlulnt7.R.inc(21785);if ((((this == o)&&(__CLR4_5_2gr1gr1lvlulnt7.R.iget(21786)!=0|true))||(__CLR4_5_2gr1gr1lvlulnt7.R.iget(21787)==0&false))) {__CLR4_5_2gr1gr1lvlulnt7.R.inc(21788);return true;
        }__CLR4_5_2gr1gr1lvlulnt7.R.inc(21789);if ((((o == null || getClass() != o.getClass())&&(__CLR4_5_2gr1gr1lvlulnt7.R.iget(21790)!=0|true))||(__CLR4_5_2gr1gr1lvlulnt7.R.iget(21791)==0&false))) {__CLR4_5_2gr1gr1lvlulnt7.R.inc(21792);return false;

        }__CLR4_5_2gr1gr1lvlulnt7.R.inc(21793);TemporalLayerSampleGroup that = (TemporalLayerSampleGroup) o;

        __CLR4_5_2gr1gr1lvlulnt7.R.inc(21794);if ((((temporalLayerId != that.temporalLayerId)&&(__CLR4_5_2gr1gr1lvlulnt7.R.iget(21795)!=0|true))||(__CLR4_5_2gr1gr1lvlulnt7.R.iget(21796)==0&false))) {__CLR4_5_2gr1gr1lvlulnt7.R.inc(21797);return false;
        }__CLR4_5_2gr1gr1lvlulnt7.R.inc(21798);if ((((tlAvgBitRate != that.tlAvgBitRate)&&(__CLR4_5_2gr1gr1lvlulnt7.R.iget(21799)!=0|true))||(__CLR4_5_2gr1gr1lvlulnt7.R.iget(21800)==0&false))) {__CLR4_5_2gr1gr1lvlulnt7.R.inc(21801);return false;
        }__CLR4_5_2gr1gr1lvlulnt7.R.inc(21802);if ((((tlAvgFrameRate != that.tlAvgFrameRate)&&(__CLR4_5_2gr1gr1lvlulnt7.R.iget(21803)!=0|true))||(__CLR4_5_2gr1gr1lvlulnt7.R.iget(21804)==0&false))) {__CLR4_5_2gr1gr1lvlulnt7.R.inc(21805);return false;
        }__CLR4_5_2gr1gr1lvlulnt7.R.inc(21806);if ((((tlConstantFrameRate != that.tlConstantFrameRate)&&(__CLR4_5_2gr1gr1lvlulnt7.R.iget(21807)!=0|true))||(__CLR4_5_2gr1gr1lvlulnt7.R.iget(21808)==0&false))) {__CLR4_5_2gr1gr1lvlulnt7.R.inc(21809);return false;
        }__CLR4_5_2gr1gr1lvlulnt7.R.inc(21810);if ((((tlMaxBitRate != that.tlMaxBitRate)&&(__CLR4_5_2gr1gr1lvlulnt7.R.iget(21811)!=0|true))||(__CLR4_5_2gr1gr1lvlulnt7.R.iget(21812)==0&false))) {__CLR4_5_2gr1gr1lvlulnt7.R.inc(21813);return false;
        }__CLR4_5_2gr1gr1lvlulnt7.R.inc(21814);if ((((tlconstraint_indicator_flags != that.tlconstraint_indicator_flags)&&(__CLR4_5_2gr1gr1lvlulnt7.R.iget(21815)!=0|true))||(__CLR4_5_2gr1gr1lvlulnt7.R.iget(21816)==0&false))) {__CLR4_5_2gr1gr1lvlulnt7.R.inc(21817);return false;
        }__CLR4_5_2gr1gr1lvlulnt7.R.inc(21818);if ((((tllevel_idc != that.tllevel_idc)&&(__CLR4_5_2gr1gr1lvlulnt7.R.iget(21819)!=0|true))||(__CLR4_5_2gr1gr1lvlulnt7.R.iget(21820)==0&false))) {__CLR4_5_2gr1gr1lvlulnt7.R.inc(21821);return false;
        }__CLR4_5_2gr1gr1lvlulnt7.R.inc(21822);if ((((tlprofile_compatibility_flags != that.tlprofile_compatibility_flags)&&(__CLR4_5_2gr1gr1lvlulnt7.R.iget(21823)!=0|true))||(__CLR4_5_2gr1gr1lvlulnt7.R.iget(21824)==0&false))) {__CLR4_5_2gr1gr1lvlulnt7.R.inc(21825);return false;
        }__CLR4_5_2gr1gr1lvlulnt7.R.inc(21826);if ((((tlprofile_idc != that.tlprofile_idc)&&(__CLR4_5_2gr1gr1lvlulnt7.R.iget(21827)!=0|true))||(__CLR4_5_2gr1gr1lvlulnt7.R.iget(21828)==0&false))) {__CLR4_5_2gr1gr1lvlulnt7.R.inc(21829);return false;
        }__CLR4_5_2gr1gr1lvlulnt7.R.inc(21830);if ((((tlprofile_space != that.tlprofile_space)&&(__CLR4_5_2gr1gr1lvlulnt7.R.iget(21831)!=0|true))||(__CLR4_5_2gr1gr1lvlulnt7.R.iget(21832)==0&false))) {__CLR4_5_2gr1gr1lvlulnt7.R.inc(21833);return false;
        }__CLR4_5_2gr1gr1lvlulnt7.R.inc(21834);if ((((tltier_flag != that.tltier_flag)&&(__CLR4_5_2gr1gr1lvlulnt7.R.iget(21835)!=0|true))||(__CLR4_5_2gr1gr1lvlulnt7.R.iget(21836)==0&false))) {__CLR4_5_2gr1gr1lvlulnt7.R.inc(21837);return false;

        }__CLR4_5_2gr1gr1lvlulnt7.R.inc(21838);return true;
    }finally{__CLR4_5_2gr1gr1lvlulnt7.R.flushNeeded();}}

    @Override
    public int hashCode() {try{__CLR4_5_2gr1gr1lvlulnt7.R.inc(21839);
        __CLR4_5_2gr1gr1lvlulnt7.R.inc(21840);int result = temporalLayerId;
        __CLR4_5_2gr1gr1lvlulnt7.R.inc(21841);result = 31 * result + tlprofile_space;
        __CLR4_5_2gr1gr1lvlulnt7.R.inc(21842);result = 31 * result + ((((tltier_flag )&&(__CLR4_5_2gr1gr1lvlulnt7.R.iget(21843)!=0|true))||(__CLR4_5_2gr1gr1lvlulnt7.R.iget(21844)==0&false))? 1 : 0);
        __CLR4_5_2gr1gr1lvlulnt7.R.inc(21845);result = 31 * result + tlprofile_idc;
        __CLR4_5_2gr1gr1lvlulnt7.R.inc(21846);result = 31 * result + (int) (tlprofile_compatibility_flags ^ (tlprofile_compatibility_flags >>> 32));
        __CLR4_5_2gr1gr1lvlulnt7.R.inc(21847);result = 31 * result + (int) (tlconstraint_indicator_flags ^ (tlconstraint_indicator_flags >>> 32));
        __CLR4_5_2gr1gr1lvlulnt7.R.inc(21848);result = 31 * result + tllevel_idc;
        __CLR4_5_2gr1gr1lvlulnt7.R.inc(21849);result = 31 * result + tlMaxBitRate;
        __CLR4_5_2gr1gr1lvlulnt7.R.inc(21850);result = 31 * result + tlAvgBitRate;
        __CLR4_5_2gr1gr1lvlulnt7.R.inc(21851);result = 31 * result + tlConstantFrameRate;
        __CLR4_5_2gr1gr1lvlulnt7.R.inc(21852);result = 31 * result + tlAvgFrameRate;
        __CLR4_5_2gr1gr1lvlulnt7.R.inc(21853);return result;
    }finally{__CLR4_5_2gr1gr1lvlulnt7.R.flushNeeded();}}

    @Override
    public String toString() {try{__CLR4_5_2gr1gr1lvlulnt7.R.inc(21854);
        __CLR4_5_2gr1gr1lvlulnt7.R.inc(21855);return "TemporalLayerSampleGroup{" +
                "temporalLayerId=" + temporalLayerId +
                ", tlprofile_space=" + tlprofile_space +
                ", tltier_flag=" + tltier_flag +
                ", tlprofile_idc=" + tlprofile_idc +
                ", tlprofile_compatibility_flags=" + tlprofile_compatibility_flags +
                ", tlconstraint_indicator_flags=" + tlconstraint_indicator_flags +
                ", tllevel_idc=" + tllevel_idc +
                ", tlMaxBitRate=" + tlMaxBitRate +
                ", tlAvgBitRate=" + tlAvgBitRate +
                ", tlConstantFrameRate=" + tlConstantFrameRate +
                ", tlAvgFrameRate=" + tlAvgFrameRate +
                '}';
    }finally{__CLR4_5_2gr1gr1lvlulnt7.R.flushNeeded();}}
}
