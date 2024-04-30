/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.mp4parser.iso14496.part15;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.boxes.mp4.samplegrouping.GroupEntry;

import java.nio.ByteBuffer;

/**
 * Created by sannies on 08.09.2014.
 */
public class TemporalLayerSampleGroup extends GroupEntry {public static class __CLR4_5_2goegoelvl9el9k{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0030\u0037\u0038\u0035\u0039\u0030\u0037\u0038\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714413275835L,8589935092L,21761,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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
    public String getType() {try{__CLR4_5_2goegoelvl9el9k.R.inc(21614);
        __CLR4_5_2goegoelvl9el9k.R.inc(21615);return TYPE;
    }finally{__CLR4_5_2goegoelvl9el9k.R.flushNeeded();}}

    public int getTemporalLayerId() {try{__CLR4_5_2goegoelvl9el9k.R.inc(21616);
        __CLR4_5_2goegoelvl9el9k.R.inc(21617);return temporalLayerId;
    }finally{__CLR4_5_2goegoelvl9el9k.R.flushNeeded();}}

    public void setTemporalLayerId(int temporalLayerId) {try{__CLR4_5_2goegoelvl9el9k.R.inc(21618);
        __CLR4_5_2goegoelvl9el9k.R.inc(21619);this.temporalLayerId = temporalLayerId;
    }finally{__CLR4_5_2goegoelvl9el9k.R.flushNeeded();}}

    public int getTlprofile_space() {try{__CLR4_5_2goegoelvl9el9k.R.inc(21620);
        __CLR4_5_2goegoelvl9el9k.R.inc(21621);return tlprofile_space;
    }finally{__CLR4_5_2goegoelvl9el9k.R.flushNeeded();}}

    public void setTlprofile_space(int tlprofile_space) {try{__CLR4_5_2goegoelvl9el9k.R.inc(21622);
        __CLR4_5_2goegoelvl9el9k.R.inc(21623);this.tlprofile_space = tlprofile_space;
    }finally{__CLR4_5_2goegoelvl9el9k.R.flushNeeded();}}

    public boolean isTltier_flag() {try{__CLR4_5_2goegoelvl9el9k.R.inc(21624);
        __CLR4_5_2goegoelvl9el9k.R.inc(21625);return tltier_flag;
    }finally{__CLR4_5_2goegoelvl9el9k.R.flushNeeded();}}

    public void setTltier_flag(boolean tltier_flag) {try{__CLR4_5_2goegoelvl9el9k.R.inc(21626);
        __CLR4_5_2goegoelvl9el9k.R.inc(21627);this.tltier_flag = tltier_flag;
    }finally{__CLR4_5_2goegoelvl9el9k.R.flushNeeded();}}

    public int getTlprofile_idc() {try{__CLR4_5_2goegoelvl9el9k.R.inc(21628);
        __CLR4_5_2goegoelvl9el9k.R.inc(21629);return tlprofile_idc;
    }finally{__CLR4_5_2goegoelvl9el9k.R.flushNeeded();}}

    public void setTlprofile_idc(int tlprofile_idc) {try{__CLR4_5_2goegoelvl9el9k.R.inc(21630);
        __CLR4_5_2goegoelvl9el9k.R.inc(21631);this.tlprofile_idc = tlprofile_idc;
    }finally{__CLR4_5_2goegoelvl9el9k.R.flushNeeded();}}

    public long getTlprofile_compatibility_flags() {try{__CLR4_5_2goegoelvl9el9k.R.inc(21632);
        __CLR4_5_2goegoelvl9el9k.R.inc(21633);return tlprofile_compatibility_flags;
    }finally{__CLR4_5_2goegoelvl9el9k.R.flushNeeded();}}

    public void setTlprofile_compatibility_flags(long tlprofile_compatibility_flags) {try{__CLR4_5_2goegoelvl9el9k.R.inc(21634);
        __CLR4_5_2goegoelvl9el9k.R.inc(21635);this.tlprofile_compatibility_flags = tlprofile_compatibility_flags;
    }finally{__CLR4_5_2goegoelvl9el9k.R.flushNeeded();}}

    public long getTlconstraint_indicator_flags() {try{__CLR4_5_2goegoelvl9el9k.R.inc(21636);
        __CLR4_5_2goegoelvl9el9k.R.inc(21637);return tlconstraint_indicator_flags;
    }finally{__CLR4_5_2goegoelvl9el9k.R.flushNeeded();}}

    public void setTlconstraint_indicator_flags(long tlconstraint_indicator_flags) {try{__CLR4_5_2goegoelvl9el9k.R.inc(21638);
        __CLR4_5_2goegoelvl9el9k.R.inc(21639);this.tlconstraint_indicator_flags = tlconstraint_indicator_flags;
    }finally{__CLR4_5_2goegoelvl9el9k.R.flushNeeded();}}

    public int getTllevel_idc() {try{__CLR4_5_2goegoelvl9el9k.R.inc(21640);
        __CLR4_5_2goegoelvl9el9k.R.inc(21641);return tllevel_idc;
    }finally{__CLR4_5_2goegoelvl9el9k.R.flushNeeded();}}

    public void setTllevel_idc(int tllevel_idc) {try{__CLR4_5_2goegoelvl9el9k.R.inc(21642);
        __CLR4_5_2goegoelvl9el9k.R.inc(21643);this.tllevel_idc = tllevel_idc;
    }finally{__CLR4_5_2goegoelvl9el9k.R.flushNeeded();}}

    public int getTlMaxBitRate() {try{__CLR4_5_2goegoelvl9el9k.R.inc(21644);
        __CLR4_5_2goegoelvl9el9k.R.inc(21645);return tlMaxBitRate;
    }finally{__CLR4_5_2goegoelvl9el9k.R.flushNeeded();}}

    public void setTlMaxBitRate(int tlMaxBitRate) {try{__CLR4_5_2goegoelvl9el9k.R.inc(21646);
        __CLR4_5_2goegoelvl9el9k.R.inc(21647);this.tlMaxBitRate = tlMaxBitRate;
    }finally{__CLR4_5_2goegoelvl9el9k.R.flushNeeded();}}

    public int getTlAvgBitRate() {try{__CLR4_5_2goegoelvl9el9k.R.inc(21648);
        __CLR4_5_2goegoelvl9el9k.R.inc(21649);return tlAvgBitRate;
    }finally{__CLR4_5_2goegoelvl9el9k.R.flushNeeded();}}

    public void setTlAvgBitRate(int tlAvgBitRate) {try{__CLR4_5_2goegoelvl9el9k.R.inc(21650);
        __CLR4_5_2goegoelvl9el9k.R.inc(21651);this.tlAvgBitRate = tlAvgBitRate;
    }finally{__CLR4_5_2goegoelvl9el9k.R.flushNeeded();}}

    public int getTlConstantFrameRate() {try{__CLR4_5_2goegoelvl9el9k.R.inc(21652);
        __CLR4_5_2goegoelvl9el9k.R.inc(21653);return tlConstantFrameRate;
    }finally{__CLR4_5_2goegoelvl9el9k.R.flushNeeded();}}

    public void setTlConstantFrameRate(int tlConstantFrameRate) {try{__CLR4_5_2goegoelvl9el9k.R.inc(21654);
        __CLR4_5_2goegoelvl9el9k.R.inc(21655);this.tlConstantFrameRate = tlConstantFrameRate;
    }finally{__CLR4_5_2goegoelvl9el9k.R.flushNeeded();}}

    public int getTlAvgFrameRate() {try{__CLR4_5_2goegoelvl9el9k.R.inc(21656);
        __CLR4_5_2goegoelvl9el9k.R.inc(21657);return tlAvgFrameRate;
    }finally{__CLR4_5_2goegoelvl9el9k.R.flushNeeded();}}

    public void setTlAvgFrameRate(int tlAvgFrameRate) {try{__CLR4_5_2goegoelvl9el9k.R.inc(21658);
        __CLR4_5_2goegoelvl9el9k.R.inc(21659);this.tlAvgFrameRate = tlAvgFrameRate;
    }finally{__CLR4_5_2goegoelvl9el9k.R.flushNeeded();}}

    @Override
    public void parse(ByteBuffer byteBuffer) {try{__CLR4_5_2goegoelvl9el9k.R.inc(21660);
        __CLR4_5_2goegoelvl9el9k.R.inc(21661);temporalLayerId = IsoTypeReader.readUInt8(byteBuffer);
        __CLR4_5_2goegoelvl9el9k.R.inc(21662);int a =IsoTypeReader.readUInt8(byteBuffer);
        __CLR4_5_2goegoelvl9el9k.R.inc(21663);tlprofile_space = (a & 0xC0)>>6;
        __CLR4_5_2goegoelvl9el9k.R.inc(21664);tltier_flag = (a & 0x20)>0;
        __CLR4_5_2goegoelvl9el9k.R.inc(21665);tlprofile_idc = (a & 0x1F);
        __CLR4_5_2goegoelvl9el9k.R.inc(21666);tlprofile_compatibility_flags = IsoTypeReader.readUInt32(byteBuffer);
        __CLR4_5_2goegoelvl9el9k.R.inc(21667);tlconstraint_indicator_flags = IsoTypeReader.readUInt48(byteBuffer);
        __CLR4_5_2goegoelvl9el9k.R.inc(21668);tllevel_idc = IsoTypeReader.readUInt8(byteBuffer);
        __CLR4_5_2goegoelvl9el9k.R.inc(21669);tlMaxBitRate = IsoTypeReader.readUInt16(byteBuffer);
        __CLR4_5_2goegoelvl9el9k.R.inc(21670);tlAvgBitRate = IsoTypeReader.readUInt16(byteBuffer);
        __CLR4_5_2goegoelvl9el9k.R.inc(21671);tlConstantFrameRate = IsoTypeReader.readUInt8(byteBuffer);
        __CLR4_5_2goegoelvl9el9k.R.inc(21672);tlAvgFrameRate = IsoTypeReader.readUInt16(byteBuffer);
    }finally{__CLR4_5_2goegoelvl9el9k.R.flushNeeded();}}

    @Override
    public ByteBuffer get() {try{__CLR4_5_2goegoelvl9el9k.R.inc(21673);
        __CLR4_5_2goegoelvl9el9k.R.inc(21674);ByteBuffer byteBuffer = ByteBuffer.allocate(20);

        __CLR4_5_2goegoelvl9el9k.R.inc(21675);IsoTypeWriter.writeUInt8(byteBuffer, temporalLayerId);
        __CLR4_5_2goegoelvl9el9k.R.inc(21676);IsoTypeWriter.writeUInt8(byteBuffer, (tlprofile_space<<6) +( (((tltier_flag)&&(__CLR4_5_2goegoelvl9el9k.R.iget(21677)!=0|true))||(__CLR4_5_2goegoelvl9el9k.R.iget(21678)==0&false))?0x20:0) + tlprofile_idc);

        __CLR4_5_2goegoelvl9el9k.R.inc(21679);IsoTypeWriter.writeUInt32(byteBuffer, tlprofile_compatibility_flags);
        __CLR4_5_2goegoelvl9el9k.R.inc(21680);IsoTypeWriter.writeUInt48(byteBuffer, tlconstraint_indicator_flags);
        __CLR4_5_2goegoelvl9el9k.R.inc(21681);IsoTypeWriter.writeUInt8(byteBuffer, tllevel_idc);
        __CLR4_5_2goegoelvl9el9k.R.inc(21682);IsoTypeWriter.writeUInt16(byteBuffer, tlMaxBitRate);
        __CLR4_5_2goegoelvl9el9k.R.inc(21683);IsoTypeWriter.writeUInt16(byteBuffer, tlAvgBitRate );
        __CLR4_5_2goegoelvl9el9k.R.inc(21684);IsoTypeWriter.writeUInt8(byteBuffer, tlConstantFrameRate);
        __CLR4_5_2goegoelvl9el9k.R.inc(21685);IsoTypeWriter.writeUInt16(byteBuffer, tlAvgFrameRate);
        __CLR4_5_2goegoelvl9el9k.R.inc(21686);return (ByteBuffer) byteBuffer.rewind();
    }finally{__CLR4_5_2goegoelvl9el9k.R.flushNeeded();}}

    @Override
    public int size() {try{__CLR4_5_2goegoelvl9el9k.R.inc(21687);
        __CLR4_5_2goegoelvl9el9k.R.inc(21688);return 20;
    }finally{__CLR4_5_2goegoelvl9el9k.R.flushNeeded();}}

    @Override
    public boolean equals(Object o) {try{__CLR4_5_2goegoelvl9el9k.R.inc(21689);

        __CLR4_5_2goegoelvl9el9k.R.inc(21690);if ((((this == o)&&(__CLR4_5_2goegoelvl9el9k.R.iget(21691)!=0|true))||(__CLR4_5_2goegoelvl9el9k.R.iget(21692)==0&false))) {__CLR4_5_2goegoelvl9el9k.R.inc(21693);return true;
        }__CLR4_5_2goegoelvl9el9k.R.inc(21694);if ((((o == null || getClass() != o.getClass())&&(__CLR4_5_2goegoelvl9el9k.R.iget(21695)!=0|true))||(__CLR4_5_2goegoelvl9el9k.R.iget(21696)==0&false))) {__CLR4_5_2goegoelvl9el9k.R.inc(21697);return false;

        }__CLR4_5_2goegoelvl9el9k.R.inc(21698);TemporalLayerSampleGroup that = (TemporalLayerSampleGroup) o;

        __CLR4_5_2goegoelvl9el9k.R.inc(21699);if ((((temporalLayerId != that.temporalLayerId)&&(__CLR4_5_2goegoelvl9el9k.R.iget(21700)!=0|true))||(__CLR4_5_2goegoelvl9el9k.R.iget(21701)==0&false))) {__CLR4_5_2goegoelvl9el9k.R.inc(21702);return false;
        }__CLR4_5_2goegoelvl9el9k.R.inc(21703);if ((((tlAvgBitRate != that.tlAvgBitRate)&&(__CLR4_5_2goegoelvl9el9k.R.iget(21704)!=0|true))||(__CLR4_5_2goegoelvl9el9k.R.iget(21705)==0&false))) {__CLR4_5_2goegoelvl9el9k.R.inc(21706);return false;
        }__CLR4_5_2goegoelvl9el9k.R.inc(21707);if ((((tlAvgFrameRate != that.tlAvgFrameRate)&&(__CLR4_5_2goegoelvl9el9k.R.iget(21708)!=0|true))||(__CLR4_5_2goegoelvl9el9k.R.iget(21709)==0&false))) {__CLR4_5_2goegoelvl9el9k.R.inc(21710);return false;
        }__CLR4_5_2goegoelvl9el9k.R.inc(21711);if ((((tlConstantFrameRate != that.tlConstantFrameRate)&&(__CLR4_5_2goegoelvl9el9k.R.iget(21712)!=0|true))||(__CLR4_5_2goegoelvl9el9k.R.iget(21713)==0&false))) {__CLR4_5_2goegoelvl9el9k.R.inc(21714);return false;
        }__CLR4_5_2goegoelvl9el9k.R.inc(21715);if ((((tlMaxBitRate != that.tlMaxBitRate)&&(__CLR4_5_2goegoelvl9el9k.R.iget(21716)!=0|true))||(__CLR4_5_2goegoelvl9el9k.R.iget(21717)==0&false))) {__CLR4_5_2goegoelvl9el9k.R.inc(21718);return false;
        }__CLR4_5_2goegoelvl9el9k.R.inc(21719);if ((((tlconstraint_indicator_flags != that.tlconstraint_indicator_flags)&&(__CLR4_5_2goegoelvl9el9k.R.iget(21720)!=0|true))||(__CLR4_5_2goegoelvl9el9k.R.iget(21721)==0&false))) {__CLR4_5_2goegoelvl9el9k.R.inc(21722);return false;
        }__CLR4_5_2goegoelvl9el9k.R.inc(21723);if ((((tllevel_idc != that.tllevel_idc)&&(__CLR4_5_2goegoelvl9el9k.R.iget(21724)!=0|true))||(__CLR4_5_2goegoelvl9el9k.R.iget(21725)==0&false))) {__CLR4_5_2goegoelvl9el9k.R.inc(21726);return false;
        }__CLR4_5_2goegoelvl9el9k.R.inc(21727);if ((((tlprofile_compatibility_flags != that.tlprofile_compatibility_flags)&&(__CLR4_5_2goegoelvl9el9k.R.iget(21728)!=0|true))||(__CLR4_5_2goegoelvl9el9k.R.iget(21729)==0&false))) {__CLR4_5_2goegoelvl9el9k.R.inc(21730);return false;
        }__CLR4_5_2goegoelvl9el9k.R.inc(21731);if ((((tlprofile_idc != that.tlprofile_idc)&&(__CLR4_5_2goegoelvl9el9k.R.iget(21732)!=0|true))||(__CLR4_5_2goegoelvl9el9k.R.iget(21733)==0&false))) {__CLR4_5_2goegoelvl9el9k.R.inc(21734);return false;
        }__CLR4_5_2goegoelvl9el9k.R.inc(21735);if ((((tlprofile_space != that.tlprofile_space)&&(__CLR4_5_2goegoelvl9el9k.R.iget(21736)!=0|true))||(__CLR4_5_2goegoelvl9el9k.R.iget(21737)==0&false))) {__CLR4_5_2goegoelvl9el9k.R.inc(21738);return false;
        }__CLR4_5_2goegoelvl9el9k.R.inc(21739);if ((((tltier_flag != that.tltier_flag)&&(__CLR4_5_2goegoelvl9el9k.R.iget(21740)!=0|true))||(__CLR4_5_2goegoelvl9el9k.R.iget(21741)==0&false))) {__CLR4_5_2goegoelvl9el9k.R.inc(21742);return false;

        }__CLR4_5_2goegoelvl9el9k.R.inc(21743);return true;
    }finally{__CLR4_5_2goegoelvl9el9k.R.flushNeeded();}}

    @Override
    public int hashCode() {try{__CLR4_5_2goegoelvl9el9k.R.inc(21744);
        __CLR4_5_2goegoelvl9el9k.R.inc(21745);int result = temporalLayerId;
        __CLR4_5_2goegoelvl9el9k.R.inc(21746);result = 31 * result + tlprofile_space;
        __CLR4_5_2goegoelvl9el9k.R.inc(21747);result = 31 * result + ((((tltier_flag )&&(__CLR4_5_2goegoelvl9el9k.R.iget(21748)!=0|true))||(__CLR4_5_2goegoelvl9el9k.R.iget(21749)==0&false))? 1 : 0);
        __CLR4_5_2goegoelvl9el9k.R.inc(21750);result = 31 * result + tlprofile_idc;
        __CLR4_5_2goegoelvl9el9k.R.inc(21751);result = 31 * result + (int) (tlprofile_compatibility_flags ^ (tlprofile_compatibility_flags >>> 32));
        __CLR4_5_2goegoelvl9el9k.R.inc(21752);result = 31 * result + (int) (tlconstraint_indicator_flags ^ (tlconstraint_indicator_flags >>> 32));
        __CLR4_5_2goegoelvl9el9k.R.inc(21753);result = 31 * result + tllevel_idc;
        __CLR4_5_2goegoelvl9el9k.R.inc(21754);result = 31 * result + tlMaxBitRate;
        __CLR4_5_2goegoelvl9el9k.R.inc(21755);result = 31 * result + tlAvgBitRate;
        __CLR4_5_2goegoelvl9el9k.R.inc(21756);result = 31 * result + tlConstantFrameRate;
        __CLR4_5_2goegoelvl9el9k.R.inc(21757);result = 31 * result + tlAvgFrameRate;
        __CLR4_5_2goegoelvl9el9k.R.inc(21758);return result;
    }finally{__CLR4_5_2goegoelvl9el9k.R.flushNeeded();}}

    @Override
    public String toString() {try{__CLR4_5_2goegoelvl9el9k.R.inc(21759);
        __CLR4_5_2goegoelvl9el9k.R.inc(21760);return "TemporalLayerSampleGroup{" +
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
    }finally{__CLR4_5_2goegoelvl9el9k.R.flushNeeded();}}
}
