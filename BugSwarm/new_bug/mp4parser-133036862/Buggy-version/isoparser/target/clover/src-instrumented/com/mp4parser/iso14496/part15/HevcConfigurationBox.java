/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.mp4parser.iso14496.part15;

import com.googlecode.mp4parser.AbstractBox;

import java.nio.ByteBuffer;
import java.util.List;

/**
 * Created by sannies on 08.09.2014.
 */
public class HevcConfigurationBox extends AbstractBox {public static class __CLR4_5_2gblgbllvlulnpl{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0033\u0033\u0030\u0033\u0036\u0038\u0036\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714448869219L,8589935092L,21223,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static final String TYPE = "hvcC";



    private HevcDecoderConfigurationRecord hevcDecoderConfigurationRecord;

    public HevcConfigurationBox() {
        super(TYPE);__CLR4_5_2gblgbllvlulnpl.R.inc(21154);try{__CLR4_5_2gblgbllvlulnpl.R.inc(21153);
        __CLR4_5_2gblgbllvlulnpl.R.inc(21155);hevcDecoderConfigurationRecord = new HevcDecoderConfigurationRecord();
    }finally{__CLR4_5_2gblgbllvlulnpl.R.flushNeeded();}}

    @Override
    protected long getContentSize() {try{__CLR4_5_2gblgbllvlulnpl.R.inc(21156);
        __CLR4_5_2gblgbllvlulnpl.R.inc(21157);return hevcDecoderConfigurationRecord.getSize();
    }finally{__CLR4_5_2gblgbllvlulnpl.R.flushNeeded();}}

    @Override
    protected void getContent(ByteBuffer byteBuffer) {try{__CLR4_5_2gblgbllvlulnpl.R.inc(21158);
        __CLR4_5_2gblgbllvlulnpl.R.inc(21159);hevcDecoderConfigurationRecord.write(byteBuffer);
    }finally{__CLR4_5_2gblgbllvlulnpl.R.flushNeeded();}}

    @Override
    protected void _parseDetails(ByteBuffer content) {try{__CLR4_5_2gblgbllvlulnpl.R.inc(21160);
        __CLR4_5_2gblgbllvlulnpl.R.inc(21161);hevcDecoderConfigurationRecord.parse(content);
    }finally{__CLR4_5_2gblgbllvlulnpl.R.flushNeeded();}}

    public HevcDecoderConfigurationRecord getHevcDecoderConfigurationRecord() {try{__CLR4_5_2gblgbllvlulnpl.R.inc(21162);
        __CLR4_5_2gblgbllvlulnpl.R.inc(21163);return hevcDecoderConfigurationRecord;
    }finally{__CLR4_5_2gblgbllvlulnpl.R.flushNeeded();}}

    public void setHevcDecoderConfigurationRecord(HevcDecoderConfigurationRecord hevcDecoderConfigurationRecord) {try{__CLR4_5_2gblgbllvlulnpl.R.inc(21164);
        __CLR4_5_2gblgbllvlulnpl.R.inc(21165);this.hevcDecoderConfigurationRecord = hevcDecoderConfigurationRecord;
    }finally{__CLR4_5_2gblgbllvlulnpl.R.flushNeeded();}}

    @Override
    public boolean equals(Object o) {try{__CLR4_5_2gblgbllvlulnpl.R.inc(21166);
        __CLR4_5_2gblgbllvlulnpl.R.inc(21167);if ((((this == o)&&(__CLR4_5_2gblgbllvlulnpl.R.iget(21168)!=0|true))||(__CLR4_5_2gblgbllvlulnpl.R.iget(21169)==0&false))) {__CLR4_5_2gblgbllvlulnpl.R.inc(21170);return true;
        }__CLR4_5_2gblgbllvlulnpl.R.inc(21171);if ((((o == null || getClass() != o.getClass())&&(__CLR4_5_2gblgbllvlulnpl.R.iget(21172)!=0|true))||(__CLR4_5_2gblgbllvlulnpl.R.iget(21173)==0&false))) {__CLR4_5_2gblgbllvlulnpl.R.inc(21174);return false;

        }__CLR4_5_2gblgbllvlulnpl.R.inc(21175);HevcConfigurationBox that = (HevcConfigurationBox) o;

        __CLR4_5_2gblgbllvlulnpl.R.inc(21176);if (((((((hevcDecoderConfigurationRecord != null )&&(__CLR4_5_2gblgbllvlulnpl.R.iget(21177)!=0|true))||(__CLR4_5_2gblgbllvlulnpl.R.iget(21178)==0&false))? !hevcDecoderConfigurationRecord.equals(that.hevcDecoderConfigurationRecord) : that.hevcDecoderConfigurationRecord != null)&&(__CLR4_5_2gblgbllvlulnpl.R.iget(21179)!=0|true))||(__CLR4_5_2gblgbllvlulnpl.R.iget(21180)==0&false)))
            {__CLR4_5_2gblgbllvlulnpl.R.inc(21181);return false;

        }__CLR4_5_2gblgbllvlulnpl.R.inc(21182);return true;
    }finally{__CLR4_5_2gblgbllvlulnpl.R.flushNeeded();}}

    @Override
    public int hashCode() {try{__CLR4_5_2gblgbllvlulnpl.R.inc(21183);
        __CLR4_5_2gblgbllvlulnpl.R.inc(21184);return (((hevcDecoderConfigurationRecord != null )&&(__CLR4_5_2gblgbllvlulnpl.R.iget(21185)!=0|true))||(__CLR4_5_2gblgbllvlulnpl.R.iget(21186)==0&false))? hevcDecoderConfigurationRecord.hashCode() : 0;
    }finally{__CLR4_5_2gblgbllvlulnpl.R.flushNeeded();}}


    public int getConfigurationVersion() {try{__CLR4_5_2gblgbllvlulnpl.R.inc(21187);
        __CLR4_5_2gblgbllvlulnpl.R.inc(21188);return hevcDecoderConfigurationRecord.configurationVersion;
    }finally{__CLR4_5_2gblgbllvlulnpl.R.flushNeeded();}}

    public int getGeneral_profile_space() {try{__CLR4_5_2gblgbllvlulnpl.R.inc(21189);
        __CLR4_5_2gblgbllvlulnpl.R.inc(21190);return hevcDecoderConfigurationRecord.general_profile_space;
    }finally{__CLR4_5_2gblgbllvlulnpl.R.flushNeeded();}}

    public boolean isGeneral_tier_flag() {try{__CLR4_5_2gblgbllvlulnpl.R.inc(21191);
        __CLR4_5_2gblgbllvlulnpl.R.inc(21192);return hevcDecoderConfigurationRecord.general_tier_flag;
    }finally{__CLR4_5_2gblgbllvlulnpl.R.flushNeeded();}}


    public int getGeneral_profile_idc() {try{__CLR4_5_2gblgbllvlulnpl.R.inc(21193);
        __CLR4_5_2gblgbllvlulnpl.R.inc(21194);return hevcDecoderConfigurationRecord.general_profile_idc;
    }finally{__CLR4_5_2gblgbllvlulnpl.R.flushNeeded();}}

    public long getGeneral_profile_compatibility_flags() {try{__CLR4_5_2gblgbllvlulnpl.R.inc(21195);
        __CLR4_5_2gblgbllvlulnpl.R.inc(21196);return hevcDecoderConfigurationRecord.general_profile_compatibility_flags;
    }finally{__CLR4_5_2gblgbllvlulnpl.R.flushNeeded();}}

    public long getGeneral_constraint_indicator_flags() {try{__CLR4_5_2gblgbllvlulnpl.R.inc(21197);
        __CLR4_5_2gblgbllvlulnpl.R.inc(21198);return hevcDecoderConfigurationRecord.general_constraint_indicator_flags;
    }finally{__CLR4_5_2gblgbllvlulnpl.R.flushNeeded();}}

    public int getGeneral_level_idc() {try{__CLR4_5_2gblgbllvlulnpl.R.inc(21199);
        __CLR4_5_2gblgbllvlulnpl.R.inc(21200);return hevcDecoderConfigurationRecord.general_level_idc;
    }finally{__CLR4_5_2gblgbllvlulnpl.R.flushNeeded();}}

    public int getMin_spatial_segmentation_idc() {try{__CLR4_5_2gblgbllvlulnpl.R.inc(21201);
        __CLR4_5_2gblgbllvlulnpl.R.inc(21202);return hevcDecoderConfigurationRecord.min_spatial_segmentation_idc;
    }finally{__CLR4_5_2gblgbllvlulnpl.R.flushNeeded();}}

    public int getParallelismType() {try{__CLR4_5_2gblgbllvlulnpl.R.inc(21203);
        __CLR4_5_2gblgbllvlulnpl.R.inc(21204);return hevcDecoderConfigurationRecord.parallelismType;
    }finally{__CLR4_5_2gblgbllvlulnpl.R.flushNeeded();}}

    public int getChromaFormat() {try{__CLR4_5_2gblgbllvlulnpl.R.inc(21205);
        __CLR4_5_2gblgbllvlulnpl.R.inc(21206);return hevcDecoderConfigurationRecord.chromaFormat;
    }finally{__CLR4_5_2gblgbllvlulnpl.R.flushNeeded();}}

    public int getBitDepthLumaMinus8() {try{__CLR4_5_2gblgbllvlulnpl.R.inc(21207);
        __CLR4_5_2gblgbllvlulnpl.R.inc(21208);return hevcDecoderConfigurationRecord.bitDepthLumaMinus8;
    }finally{__CLR4_5_2gblgbllvlulnpl.R.flushNeeded();}}

    public int getBitDepthChromaMinus8() {try{__CLR4_5_2gblgbllvlulnpl.R.inc(21209);
        __CLR4_5_2gblgbllvlulnpl.R.inc(21210);return hevcDecoderConfigurationRecord.bitDepthChromaMinus8;
    }finally{__CLR4_5_2gblgbllvlulnpl.R.flushNeeded();}}

    public int getAvgFrameRate() {try{__CLR4_5_2gblgbllvlulnpl.R.inc(21211);
        __CLR4_5_2gblgbllvlulnpl.R.inc(21212);return hevcDecoderConfigurationRecord.avgFrameRate;
    }finally{__CLR4_5_2gblgbllvlulnpl.R.flushNeeded();}}

    public int getNumTemporalLayers() {try{__CLR4_5_2gblgbllvlulnpl.R.inc(21213);
        __CLR4_5_2gblgbllvlulnpl.R.inc(21214);return hevcDecoderConfigurationRecord.numTemporalLayers;
    }finally{__CLR4_5_2gblgbllvlulnpl.R.flushNeeded();}}

    public int getLengthSizeMinusOne() {try{__CLR4_5_2gblgbllvlulnpl.R.inc(21215);
        __CLR4_5_2gblgbllvlulnpl.R.inc(21216);return hevcDecoderConfigurationRecord.lengthSizeMinusOne;
    }finally{__CLR4_5_2gblgbllvlulnpl.R.flushNeeded();}}

    public boolean isTemporalIdNested() {try{__CLR4_5_2gblgbllvlulnpl.R.inc(21217);
        __CLR4_5_2gblgbllvlulnpl.R.inc(21218);return hevcDecoderConfigurationRecord.temporalIdNested;
    }finally{__CLR4_5_2gblgbllvlulnpl.R.flushNeeded();}}

    public int getConstantFrameRate() {try{__CLR4_5_2gblgbllvlulnpl.R.inc(21219);
        __CLR4_5_2gblgbllvlulnpl.R.inc(21220);return hevcDecoderConfigurationRecord.constantFrameRate;
    }finally{__CLR4_5_2gblgbllvlulnpl.R.flushNeeded();}}

    public List<HevcDecoderConfigurationRecord.Array> getArrays() {try{__CLR4_5_2gblgbllvlulnpl.R.inc(21221);
        __CLR4_5_2gblgbllvlulnpl.R.inc(21222);return hevcDecoderConfigurationRecord.arrays;
    }finally{__CLR4_5_2gblgbllvlulnpl.R.flushNeeded();}}
}
