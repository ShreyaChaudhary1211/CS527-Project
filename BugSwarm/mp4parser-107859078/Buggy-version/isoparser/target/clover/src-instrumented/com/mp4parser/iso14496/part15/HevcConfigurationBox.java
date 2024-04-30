/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.mp4parser.iso14496.part15;

import com.googlecode.mp4parser.AbstractBox;

import java.nio.ByteBuffer;
import java.util.List;

/**
 * Created by sannies on 08.09.2014.
 */
public class HevcConfigurationBox extends AbstractBox {public static class __CLR4_5_2g8yg8ylvl9el5e{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0030\u0037\u0038\u0035\u0039\u0030\u0037\u0038\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714413275835L,8589935092L,21128,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static final String TYPE = "hvcC";



    private HevcDecoderConfigurationRecord hevcDecoderConfigurationRecord;

    public HevcConfigurationBox() {
        super(TYPE);__CLR4_5_2g8yg8ylvl9el5e.R.inc(21059);try{__CLR4_5_2g8yg8ylvl9el5e.R.inc(21058);
        __CLR4_5_2g8yg8ylvl9el5e.R.inc(21060);hevcDecoderConfigurationRecord = new HevcDecoderConfigurationRecord();
    }finally{__CLR4_5_2g8yg8ylvl9el5e.R.flushNeeded();}}

    @Override
    protected long getContentSize() {try{__CLR4_5_2g8yg8ylvl9el5e.R.inc(21061);
        __CLR4_5_2g8yg8ylvl9el5e.R.inc(21062);return hevcDecoderConfigurationRecord.getSize();
    }finally{__CLR4_5_2g8yg8ylvl9el5e.R.flushNeeded();}}

    @Override
    protected void getContent(ByteBuffer byteBuffer) {try{__CLR4_5_2g8yg8ylvl9el5e.R.inc(21063);
        __CLR4_5_2g8yg8ylvl9el5e.R.inc(21064);hevcDecoderConfigurationRecord.write(byteBuffer);
    }finally{__CLR4_5_2g8yg8ylvl9el5e.R.flushNeeded();}}

    @Override
    protected void _parseDetails(ByteBuffer content) {try{__CLR4_5_2g8yg8ylvl9el5e.R.inc(21065);
        __CLR4_5_2g8yg8ylvl9el5e.R.inc(21066);hevcDecoderConfigurationRecord.parse(content);
    }finally{__CLR4_5_2g8yg8ylvl9el5e.R.flushNeeded();}}

    public HevcDecoderConfigurationRecord getHevcDecoderConfigurationRecord() {try{__CLR4_5_2g8yg8ylvl9el5e.R.inc(21067);
        __CLR4_5_2g8yg8ylvl9el5e.R.inc(21068);return hevcDecoderConfigurationRecord;
    }finally{__CLR4_5_2g8yg8ylvl9el5e.R.flushNeeded();}}

    public void setHevcDecoderConfigurationRecord(HevcDecoderConfigurationRecord hevcDecoderConfigurationRecord) {try{__CLR4_5_2g8yg8ylvl9el5e.R.inc(21069);
        __CLR4_5_2g8yg8ylvl9el5e.R.inc(21070);this.hevcDecoderConfigurationRecord = hevcDecoderConfigurationRecord;
    }finally{__CLR4_5_2g8yg8ylvl9el5e.R.flushNeeded();}}

    @Override
    public boolean equals(Object o) {try{__CLR4_5_2g8yg8ylvl9el5e.R.inc(21071);
        __CLR4_5_2g8yg8ylvl9el5e.R.inc(21072);if ((((this == o)&&(__CLR4_5_2g8yg8ylvl9el5e.R.iget(21073)!=0|true))||(__CLR4_5_2g8yg8ylvl9el5e.R.iget(21074)==0&false))) {__CLR4_5_2g8yg8ylvl9el5e.R.inc(21075);return true;
        }__CLR4_5_2g8yg8ylvl9el5e.R.inc(21076);if ((((o == null || getClass() != o.getClass())&&(__CLR4_5_2g8yg8ylvl9el5e.R.iget(21077)!=0|true))||(__CLR4_5_2g8yg8ylvl9el5e.R.iget(21078)==0&false))) {__CLR4_5_2g8yg8ylvl9el5e.R.inc(21079);return false;

        }__CLR4_5_2g8yg8ylvl9el5e.R.inc(21080);HevcConfigurationBox that = (HevcConfigurationBox) o;

        __CLR4_5_2g8yg8ylvl9el5e.R.inc(21081);if (((((((hevcDecoderConfigurationRecord != null )&&(__CLR4_5_2g8yg8ylvl9el5e.R.iget(21082)!=0|true))||(__CLR4_5_2g8yg8ylvl9el5e.R.iget(21083)==0&false))? !hevcDecoderConfigurationRecord.equals(that.hevcDecoderConfigurationRecord) : that.hevcDecoderConfigurationRecord != null)&&(__CLR4_5_2g8yg8ylvl9el5e.R.iget(21084)!=0|true))||(__CLR4_5_2g8yg8ylvl9el5e.R.iget(21085)==0&false)))
            {__CLR4_5_2g8yg8ylvl9el5e.R.inc(21086);return false;

        }__CLR4_5_2g8yg8ylvl9el5e.R.inc(21087);return true;
    }finally{__CLR4_5_2g8yg8ylvl9el5e.R.flushNeeded();}}

    @Override
    public int hashCode() {try{__CLR4_5_2g8yg8ylvl9el5e.R.inc(21088);
        __CLR4_5_2g8yg8ylvl9el5e.R.inc(21089);return (((hevcDecoderConfigurationRecord != null )&&(__CLR4_5_2g8yg8ylvl9el5e.R.iget(21090)!=0|true))||(__CLR4_5_2g8yg8ylvl9el5e.R.iget(21091)==0&false))? hevcDecoderConfigurationRecord.hashCode() : 0;
    }finally{__CLR4_5_2g8yg8ylvl9el5e.R.flushNeeded();}}


    public int getConfigurationVersion() {try{__CLR4_5_2g8yg8ylvl9el5e.R.inc(21092);
        __CLR4_5_2g8yg8ylvl9el5e.R.inc(21093);return hevcDecoderConfigurationRecord.configurationVersion;
    }finally{__CLR4_5_2g8yg8ylvl9el5e.R.flushNeeded();}}

    public int getGeneral_profile_space() {try{__CLR4_5_2g8yg8ylvl9el5e.R.inc(21094);
        __CLR4_5_2g8yg8ylvl9el5e.R.inc(21095);return hevcDecoderConfigurationRecord.general_profile_space;
    }finally{__CLR4_5_2g8yg8ylvl9el5e.R.flushNeeded();}}

    public boolean isGeneral_tier_flag() {try{__CLR4_5_2g8yg8ylvl9el5e.R.inc(21096);
        __CLR4_5_2g8yg8ylvl9el5e.R.inc(21097);return hevcDecoderConfigurationRecord.general_tier_flag;
    }finally{__CLR4_5_2g8yg8ylvl9el5e.R.flushNeeded();}}


    public int getGeneral_profile_idc() {try{__CLR4_5_2g8yg8ylvl9el5e.R.inc(21098);
        __CLR4_5_2g8yg8ylvl9el5e.R.inc(21099);return hevcDecoderConfigurationRecord.general_profile_idc;
    }finally{__CLR4_5_2g8yg8ylvl9el5e.R.flushNeeded();}}

    public long getGeneral_profile_compatibility_flags() {try{__CLR4_5_2g8yg8ylvl9el5e.R.inc(21100);
        __CLR4_5_2g8yg8ylvl9el5e.R.inc(21101);return hevcDecoderConfigurationRecord.general_profile_compatibility_flags;
    }finally{__CLR4_5_2g8yg8ylvl9el5e.R.flushNeeded();}}

    public long getGeneral_constraint_indicator_flags() {try{__CLR4_5_2g8yg8ylvl9el5e.R.inc(21102);
        __CLR4_5_2g8yg8ylvl9el5e.R.inc(21103);return hevcDecoderConfigurationRecord.general_constraint_indicator_flags;
    }finally{__CLR4_5_2g8yg8ylvl9el5e.R.flushNeeded();}}

    public int getGeneral_level_idc() {try{__CLR4_5_2g8yg8ylvl9el5e.R.inc(21104);
        __CLR4_5_2g8yg8ylvl9el5e.R.inc(21105);return hevcDecoderConfigurationRecord.general_level_idc;
    }finally{__CLR4_5_2g8yg8ylvl9el5e.R.flushNeeded();}}

    public int getMin_spatial_segmentation_idc() {try{__CLR4_5_2g8yg8ylvl9el5e.R.inc(21106);
        __CLR4_5_2g8yg8ylvl9el5e.R.inc(21107);return hevcDecoderConfigurationRecord.min_spatial_segmentation_idc;
    }finally{__CLR4_5_2g8yg8ylvl9el5e.R.flushNeeded();}}

    public int getParallelismType() {try{__CLR4_5_2g8yg8ylvl9el5e.R.inc(21108);
        __CLR4_5_2g8yg8ylvl9el5e.R.inc(21109);return hevcDecoderConfigurationRecord.parallelismType;
    }finally{__CLR4_5_2g8yg8ylvl9el5e.R.flushNeeded();}}

    public int getChromaFormat() {try{__CLR4_5_2g8yg8ylvl9el5e.R.inc(21110);
        __CLR4_5_2g8yg8ylvl9el5e.R.inc(21111);return hevcDecoderConfigurationRecord.chromaFormat;
    }finally{__CLR4_5_2g8yg8ylvl9el5e.R.flushNeeded();}}

    public int getBitDepthLumaMinus8() {try{__CLR4_5_2g8yg8ylvl9el5e.R.inc(21112);
        __CLR4_5_2g8yg8ylvl9el5e.R.inc(21113);return hevcDecoderConfigurationRecord.bitDepthLumaMinus8;
    }finally{__CLR4_5_2g8yg8ylvl9el5e.R.flushNeeded();}}

    public int getBitDepthChromaMinus8() {try{__CLR4_5_2g8yg8ylvl9el5e.R.inc(21114);
        __CLR4_5_2g8yg8ylvl9el5e.R.inc(21115);return hevcDecoderConfigurationRecord.bitDepthChromaMinus8;
    }finally{__CLR4_5_2g8yg8ylvl9el5e.R.flushNeeded();}}

    public int getAvgFrameRate() {try{__CLR4_5_2g8yg8ylvl9el5e.R.inc(21116);
        __CLR4_5_2g8yg8ylvl9el5e.R.inc(21117);return hevcDecoderConfigurationRecord.avgFrameRate;
    }finally{__CLR4_5_2g8yg8ylvl9el5e.R.flushNeeded();}}

    public int getNumTemporalLayers() {try{__CLR4_5_2g8yg8ylvl9el5e.R.inc(21118);
        __CLR4_5_2g8yg8ylvl9el5e.R.inc(21119);return hevcDecoderConfigurationRecord.numTemporalLayers;
    }finally{__CLR4_5_2g8yg8ylvl9el5e.R.flushNeeded();}}

    public int getLengthSizeMinusOne() {try{__CLR4_5_2g8yg8ylvl9el5e.R.inc(21120);
        __CLR4_5_2g8yg8ylvl9el5e.R.inc(21121);return hevcDecoderConfigurationRecord.lengthSizeMinusOne;
    }finally{__CLR4_5_2g8yg8ylvl9el5e.R.flushNeeded();}}

    public boolean isTemporalIdNested() {try{__CLR4_5_2g8yg8ylvl9el5e.R.inc(21122);
        __CLR4_5_2g8yg8ylvl9el5e.R.inc(21123);return hevcDecoderConfigurationRecord.temporalIdNested;
    }finally{__CLR4_5_2g8yg8ylvl9el5e.R.flushNeeded();}}

    public int getConstantFrameRate() {try{__CLR4_5_2g8yg8ylvl9el5e.R.inc(21124);
        __CLR4_5_2g8yg8ylvl9el5e.R.inc(21125);return hevcDecoderConfigurationRecord.constantFrameRate;
    }finally{__CLR4_5_2g8yg8ylvl9el5e.R.flushNeeded();}}

    public List<HevcDecoderConfigurationRecord.Array> getArrays() {try{__CLR4_5_2g8yg8ylvl9el5e.R.inc(21126);
        __CLR4_5_2g8yg8ylvl9el5e.R.inc(21127);return hevcDecoderConfigurationRecord.arrays;
    }finally{__CLR4_5_2g8yg8ylvl9el5e.R.flushNeeded();}}
}
