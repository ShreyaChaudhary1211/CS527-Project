/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.mp4parser.iso14496.part15;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class HevcDecoderConfigurationRecord {public static class __CLR4_5_2gawgawlvl9el7m{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0030\u0037\u0038\u0035\u0039\u0030\u0037\u0038\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714413275835L,8589935092L,21524,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    int configurationVersion;

    int general_profile_space;
    boolean general_tier_flag;
    int general_profile_idc;

    long general_profile_compatibility_flags;
    long general_constraint_indicator_flags;

    int general_level_idc;

    int reserved1 = 0xF;
    int min_spatial_segmentation_idc;

    int reserved2 = 0x3F;
    int parallelismType;

    int reserved3 = 0x3F;
    int chromaFormat;

    int reserved4 = 0x1F;
    int bitDepthLumaMinus8;

    int reserved5 = 0x1F;
    int bitDepthChromaMinus8;

    int avgFrameRate;

    int constantFrameRate;
    int numTemporalLayers;
    boolean temporalIdNested;
    int lengthSizeMinusOne;

    List<Array> arrays = new ArrayList<Array>();

    boolean frame_only_constraint_flag;
    boolean non_packed_constraint_flag;
    boolean interlaced_source_flag;
    boolean progressive_source_flag;


    public HevcDecoderConfigurationRecord() {try{__CLR4_5_2gawgawlvl9el7m.R.inc(21128);
    }finally{__CLR4_5_2gawgawlvl9el7m.R.flushNeeded();}}


    public void parse(ByteBuffer content) {try{__CLR4_5_2gawgawlvl9el7m.R.inc(21129);
        __CLR4_5_2gawgawlvl9el7m.R.inc(21130);configurationVersion = IsoTypeReader.readUInt8(content);

        /*
         * unsigned int(2) general_profile_space;
         * unsigned int(1) general_tier_flag;
         * unsigned int(5) general_profile_idc;
         */
        __CLR4_5_2gawgawlvl9el7m.R.inc(21131);int a = IsoTypeReader.readUInt8(content);
        __CLR4_5_2gawgawlvl9el7m.R.inc(21132);general_profile_space = (a & 0xC0) >> 6;
        __CLR4_5_2gawgawlvl9el7m.R.inc(21133);general_tier_flag = (a & 0x20) > 0;
        __CLR4_5_2gawgawlvl9el7m.R.inc(21134);general_profile_idc = (a & 0x1F);

        /* unsigned int(32) general_profile_compatibility_flags; */
        __CLR4_5_2gawgawlvl9el7m.R.inc(21135);general_profile_compatibility_flags = IsoTypeReader.readUInt32(content);


         /* unsigned int(48) general_constraint_indicator_flags; */
        __CLR4_5_2gawgawlvl9el7m.R.inc(21136);general_constraint_indicator_flags = IsoTypeReader.readUInt48(content);

        __CLR4_5_2gawgawlvl9el7m.R.inc(21137);frame_only_constraint_flag = ((general_constraint_indicator_flags >> 44) & 0x08) > 0;
        __CLR4_5_2gawgawlvl9el7m.R.inc(21138);non_packed_constraint_flag = ((general_constraint_indicator_flags >> 44) & 0x04) > 0;
        __CLR4_5_2gawgawlvl9el7m.R.inc(21139);interlaced_source_flag = ((general_constraint_indicator_flags >> 44) & 0x02) > 0;
        __CLR4_5_2gawgawlvl9el7m.R.inc(21140);progressive_source_flag = ((general_constraint_indicator_flags >> 44) & 0x01) > 0;

        __CLR4_5_2gawgawlvl9el7m.R.inc(21141);general_constraint_indicator_flags &= 0x7fffffffffffL;

        /* unsigned int(8) general_level_idc; */
        __CLR4_5_2gawgawlvl9el7m.R.inc(21142);general_level_idc = IsoTypeReader.readUInt8(content);

        /*
         * bit(4) reserved = \u20181111\u2019b;
         * unsigned int(12) min_spatial_segmentation_idc;
         */
        __CLR4_5_2gawgawlvl9el7m.R.inc(21143);a = IsoTypeReader.readUInt16(content);
        __CLR4_5_2gawgawlvl9el7m.R.inc(21144);reserved1 = (a & 0xF000) >> 12;
        __CLR4_5_2gawgawlvl9el7m.R.inc(21145);min_spatial_segmentation_idc = a & 0xFFF;

        __CLR4_5_2gawgawlvl9el7m.R.inc(21146);a = IsoTypeReader.readUInt8(content);
        __CLR4_5_2gawgawlvl9el7m.R.inc(21147);reserved2 = (a & 0xFC) >> 2;
        __CLR4_5_2gawgawlvl9el7m.R.inc(21148);parallelismType = a & 0x3;

        __CLR4_5_2gawgawlvl9el7m.R.inc(21149);a = IsoTypeReader.readUInt8(content);
        __CLR4_5_2gawgawlvl9el7m.R.inc(21150);reserved3 = (a & 0xFC) >> 2;
        __CLR4_5_2gawgawlvl9el7m.R.inc(21151);chromaFormat = a & 0x3;

        __CLR4_5_2gawgawlvl9el7m.R.inc(21152);a = IsoTypeReader.readUInt8(content);
        __CLR4_5_2gawgawlvl9el7m.R.inc(21153);reserved4 = (a & 0xF8) >> 3;
        __CLR4_5_2gawgawlvl9el7m.R.inc(21154);bitDepthLumaMinus8 = a & 0x7;

        __CLR4_5_2gawgawlvl9el7m.R.inc(21155);a = IsoTypeReader.readUInt8(content);
        __CLR4_5_2gawgawlvl9el7m.R.inc(21156);reserved5 = (a & 0xF8) >> 3;
        __CLR4_5_2gawgawlvl9el7m.R.inc(21157);bitDepthChromaMinus8 = a & 0x7;

        __CLR4_5_2gawgawlvl9el7m.R.inc(21158);avgFrameRate = IsoTypeReader.readUInt16(content);

        __CLR4_5_2gawgawlvl9el7m.R.inc(21159);a = IsoTypeReader.readUInt8(content);
        __CLR4_5_2gawgawlvl9el7m.R.inc(21160);constantFrameRate = (a & 0xC0) >> 6;
        __CLR4_5_2gawgawlvl9el7m.R.inc(21161);numTemporalLayers = (a & 0x38) >> 3;
        __CLR4_5_2gawgawlvl9el7m.R.inc(21162);temporalIdNested = (a & 0x4) > 0;
        __CLR4_5_2gawgawlvl9el7m.R.inc(21163);lengthSizeMinusOne = a & 0x3;


        __CLR4_5_2gawgawlvl9el7m.R.inc(21164);int numOfArrays = IsoTypeReader.readUInt8(content);
        __CLR4_5_2gawgawlvl9el7m.R.inc(21165);this.arrays = new ArrayList<Array>();
        __CLR4_5_2gawgawlvl9el7m.R.inc(21166);for (int i = 0; (((i < numOfArrays)&&(__CLR4_5_2gawgawlvl9el7m.R.iget(21167)!=0|true))||(__CLR4_5_2gawgawlvl9el7m.R.iget(21168)==0&false)); i++) {{
            __CLR4_5_2gawgawlvl9el7m.R.inc(21169);Array array = new Array();

            __CLR4_5_2gawgawlvl9el7m.R.inc(21170);a = IsoTypeReader.readUInt8(content);
            __CLR4_5_2gawgawlvl9el7m.R.inc(21171);array.array_completeness = (a & 0x80) > 0;
            __CLR4_5_2gawgawlvl9el7m.R.inc(21172);array.reserved = (a & 0x40) > 0;
            __CLR4_5_2gawgawlvl9el7m.R.inc(21173);array.nal_unit_type = a & 0x3F;

            __CLR4_5_2gawgawlvl9el7m.R.inc(21174);int numNalus = IsoTypeReader.readUInt16(content);
            __CLR4_5_2gawgawlvl9el7m.R.inc(21175);array.nalUnits = new ArrayList<byte[]>();
            __CLR4_5_2gawgawlvl9el7m.R.inc(21176);for (int j = 0; (((j < numNalus)&&(__CLR4_5_2gawgawlvl9el7m.R.iget(21177)!=0|true))||(__CLR4_5_2gawgawlvl9el7m.R.iget(21178)==0&false)); j++) {{
                __CLR4_5_2gawgawlvl9el7m.R.inc(21179);int nalUnitLength = IsoTypeReader.readUInt16(content);
                __CLR4_5_2gawgawlvl9el7m.R.inc(21180);byte[] nal = new byte[nalUnitLength];
                __CLR4_5_2gawgawlvl9el7m.R.inc(21181);content.get(nal);
                __CLR4_5_2gawgawlvl9el7m.R.inc(21182);array.nalUnits.add(nal);
            }
            }__CLR4_5_2gawgawlvl9el7m.R.inc(21183);arrays.add(array);
        }
    }}finally{__CLR4_5_2gawgawlvl9el7m.R.flushNeeded();}}

    public void write(ByteBuffer byteBuffer) {try{__CLR4_5_2gawgawlvl9el7m.R.inc(21184);
        __CLR4_5_2gawgawlvl9el7m.R.inc(21185);IsoTypeWriter.writeUInt8(byteBuffer, configurationVersion);


        __CLR4_5_2gawgawlvl9el7m.R.inc(21186);IsoTypeWriter.writeUInt8(byteBuffer, (general_profile_space << 6) + ((((general_tier_flag )&&(__CLR4_5_2gawgawlvl9el7m.R.iget(21187)!=0|true))||(__CLR4_5_2gawgawlvl9el7m.R.iget(21188)==0&false))? 0x20 : 0) + general_profile_idc);

        __CLR4_5_2gawgawlvl9el7m.R.inc(21189);IsoTypeWriter.writeUInt32(byteBuffer, general_profile_compatibility_flags);
        __CLR4_5_2gawgawlvl9el7m.R.inc(21190);long _general_constraint_indicator_flags = general_constraint_indicator_flags;
        __CLR4_5_2gawgawlvl9el7m.R.inc(21191);if ((((frame_only_constraint_flag)&&(__CLR4_5_2gawgawlvl9el7m.R.iget(21192)!=0|true))||(__CLR4_5_2gawgawlvl9el7m.R.iget(21193)==0&false))) {{
            __CLR4_5_2gawgawlvl9el7m.R.inc(21194);_general_constraint_indicator_flags |= 1l << 47;
        }
        }__CLR4_5_2gawgawlvl9el7m.R.inc(21195);if ((((non_packed_constraint_flag)&&(__CLR4_5_2gawgawlvl9el7m.R.iget(21196)!=0|true))||(__CLR4_5_2gawgawlvl9el7m.R.iget(21197)==0&false))) {{
            __CLR4_5_2gawgawlvl9el7m.R.inc(21198);_general_constraint_indicator_flags |= 1l << 46;
        }
        }__CLR4_5_2gawgawlvl9el7m.R.inc(21199);if ( (((interlaced_source_flag)&&(__CLR4_5_2gawgawlvl9el7m.R.iget(21200)!=0|true))||(__CLR4_5_2gawgawlvl9el7m.R.iget(21201)==0&false))) {{
            __CLR4_5_2gawgawlvl9el7m.R.inc(21202);_general_constraint_indicator_flags |= 1l << 45;
        }
        }__CLR4_5_2gawgawlvl9el7m.R.inc(21203);if ((((progressive_source_flag)&&(__CLR4_5_2gawgawlvl9el7m.R.iget(21204)!=0|true))||(__CLR4_5_2gawgawlvl9el7m.R.iget(21205)==0&false))) {{
            __CLR4_5_2gawgawlvl9el7m.R.inc(21206);_general_constraint_indicator_flags |= 1l << 44;
        }

        }__CLR4_5_2gawgawlvl9el7m.R.inc(21207);IsoTypeWriter.writeUInt48(byteBuffer, _general_constraint_indicator_flags);


        __CLR4_5_2gawgawlvl9el7m.R.inc(21208);IsoTypeWriter.writeUInt8(byteBuffer, general_level_idc);

        __CLR4_5_2gawgawlvl9el7m.R.inc(21209);IsoTypeWriter.writeUInt16(byteBuffer, (reserved1 << 12) + min_spatial_segmentation_idc);

        __CLR4_5_2gawgawlvl9el7m.R.inc(21210);IsoTypeWriter.writeUInt8(byteBuffer, (reserved2 << 2) + parallelismType);

        __CLR4_5_2gawgawlvl9el7m.R.inc(21211);IsoTypeWriter.writeUInt8(byteBuffer, (reserved3 << 2) + chromaFormat);

        __CLR4_5_2gawgawlvl9el7m.R.inc(21212);IsoTypeWriter.writeUInt8(byteBuffer, (reserved4 << 3) + bitDepthLumaMinus8);

        __CLR4_5_2gawgawlvl9el7m.R.inc(21213);IsoTypeWriter.writeUInt8(byteBuffer, (reserved5 << 3) + bitDepthChromaMinus8);

        __CLR4_5_2gawgawlvl9el7m.R.inc(21214);IsoTypeWriter.writeUInt16(byteBuffer, avgFrameRate);

        __CLR4_5_2gawgawlvl9el7m.R.inc(21215);IsoTypeWriter.writeUInt8(byteBuffer, (constantFrameRate << 6) + (numTemporalLayers << 3) + ((((temporalIdNested )&&(__CLR4_5_2gawgawlvl9el7m.R.iget(21216)!=0|true))||(__CLR4_5_2gawgawlvl9el7m.R.iget(21217)==0&false))? 0x4 : 0) + lengthSizeMinusOne);

        __CLR4_5_2gawgawlvl9el7m.R.inc(21218);IsoTypeWriter.writeUInt8(byteBuffer, arrays.size());

        __CLR4_5_2gawgawlvl9el7m.R.inc(21219);for (Array array : arrays) {{
            __CLR4_5_2gawgawlvl9el7m.R.inc(21220);IsoTypeWriter.writeUInt8(byteBuffer, ((((array.array_completeness )&&(__CLR4_5_2gawgawlvl9el7m.R.iget(21221)!=0|true))||(__CLR4_5_2gawgawlvl9el7m.R.iget(21222)==0&false))? 0x80 : 0) + ((((array.reserved )&&(__CLR4_5_2gawgawlvl9el7m.R.iget(21223)!=0|true))||(__CLR4_5_2gawgawlvl9el7m.R.iget(21224)==0&false))? 0x40 : 0) + array.nal_unit_type);

            __CLR4_5_2gawgawlvl9el7m.R.inc(21225);IsoTypeWriter.writeUInt16(byteBuffer, array.nalUnits.size());
            __CLR4_5_2gawgawlvl9el7m.R.inc(21226);for (byte[] nalUnit : array.nalUnits) {{
                __CLR4_5_2gawgawlvl9el7m.R.inc(21227);IsoTypeWriter.writeUInt16(byteBuffer, nalUnit.length);
                __CLR4_5_2gawgawlvl9el7m.R.inc(21228);byteBuffer.put(nalUnit);
            }
        }}
    }}finally{__CLR4_5_2gawgawlvl9el7m.R.flushNeeded();}}

    public int getSize() {try{__CLR4_5_2gawgawlvl9el7m.R.inc(21229);
        __CLR4_5_2gawgawlvl9el7m.R.inc(21230);int size = 23;
        __CLR4_5_2gawgawlvl9el7m.R.inc(21231);for (Array array : arrays) {{
            __CLR4_5_2gawgawlvl9el7m.R.inc(21232);size += 3;
            __CLR4_5_2gawgawlvl9el7m.R.inc(21233);for (byte[] nalUnit : array.nalUnits) {{
                __CLR4_5_2gawgawlvl9el7m.R.inc(21234);size += 2;
                __CLR4_5_2gawgawlvl9el7m.R.inc(21235);size += nalUnit.length;
            }
        }}
        }__CLR4_5_2gawgawlvl9el7m.R.inc(21236);return size;
    }finally{__CLR4_5_2gawgawlvl9el7m.R.flushNeeded();}}

    @Override
    public boolean equals(Object o) {try{__CLR4_5_2gawgawlvl9el7m.R.inc(21237);
        __CLR4_5_2gawgawlvl9el7m.R.inc(21238);if ((((this == o)&&(__CLR4_5_2gawgawlvl9el7m.R.iget(21239)!=0|true))||(__CLR4_5_2gawgawlvl9el7m.R.iget(21240)==0&false))) {__CLR4_5_2gawgawlvl9el7m.R.inc(21241);return true;
        }__CLR4_5_2gawgawlvl9el7m.R.inc(21242);if ((((o == null || getClass() != o.getClass())&&(__CLR4_5_2gawgawlvl9el7m.R.iget(21243)!=0|true))||(__CLR4_5_2gawgawlvl9el7m.R.iget(21244)==0&false))) {__CLR4_5_2gawgawlvl9el7m.R.inc(21245);return false;

        }__CLR4_5_2gawgawlvl9el7m.R.inc(21246);HevcDecoderConfigurationRecord that = (HevcDecoderConfigurationRecord) o;

        __CLR4_5_2gawgawlvl9el7m.R.inc(21247);if ((((avgFrameRate != that.avgFrameRate)&&(__CLR4_5_2gawgawlvl9el7m.R.iget(21248)!=0|true))||(__CLR4_5_2gawgawlvl9el7m.R.iget(21249)==0&false))) {__CLR4_5_2gawgawlvl9el7m.R.inc(21250);return false;
        }__CLR4_5_2gawgawlvl9el7m.R.inc(21251);if ((((bitDepthChromaMinus8 != that.bitDepthChromaMinus8)&&(__CLR4_5_2gawgawlvl9el7m.R.iget(21252)!=0|true))||(__CLR4_5_2gawgawlvl9el7m.R.iget(21253)==0&false))) {__CLR4_5_2gawgawlvl9el7m.R.inc(21254);return false;
        }__CLR4_5_2gawgawlvl9el7m.R.inc(21255);if ((((bitDepthLumaMinus8 != that.bitDepthLumaMinus8)&&(__CLR4_5_2gawgawlvl9el7m.R.iget(21256)!=0|true))||(__CLR4_5_2gawgawlvl9el7m.R.iget(21257)==0&false))) {__CLR4_5_2gawgawlvl9el7m.R.inc(21258);return false;
        }__CLR4_5_2gawgawlvl9el7m.R.inc(21259);if ((((chromaFormat != that.chromaFormat)&&(__CLR4_5_2gawgawlvl9el7m.R.iget(21260)!=0|true))||(__CLR4_5_2gawgawlvl9el7m.R.iget(21261)==0&false))) {__CLR4_5_2gawgawlvl9el7m.R.inc(21262);return false;
        }__CLR4_5_2gawgawlvl9el7m.R.inc(21263);if ((((configurationVersion != that.configurationVersion)&&(__CLR4_5_2gawgawlvl9el7m.R.iget(21264)!=0|true))||(__CLR4_5_2gawgawlvl9el7m.R.iget(21265)==0&false))) {__CLR4_5_2gawgawlvl9el7m.R.inc(21266);return false;
        }__CLR4_5_2gawgawlvl9el7m.R.inc(21267);if ((((constantFrameRate != that.constantFrameRate)&&(__CLR4_5_2gawgawlvl9el7m.R.iget(21268)!=0|true))||(__CLR4_5_2gawgawlvl9el7m.R.iget(21269)==0&false))) {__CLR4_5_2gawgawlvl9el7m.R.inc(21270);return false;
        }__CLR4_5_2gawgawlvl9el7m.R.inc(21271);if ((((general_constraint_indicator_flags != that.general_constraint_indicator_flags)&&(__CLR4_5_2gawgawlvl9el7m.R.iget(21272)!=0|true))||(__CLR4_5_2gawgawlvl9el7m.R.iget(21273)==0&false))) {__CLR4_5_2gawgawlvl9el7m.R.inc(21274);return false;
        }__CLR4_5_2gawgawlvl9el7m.R.inc(21275);if ((((general_level_idc != that.general_level_idc)&&(__CLR4_5_2gawgawlvl9el7m.R.iget(21276)!=0|true))||(__CLR4_5_2gawgawlvl9el7m.R.iget(21277)==0&false))) {__CLR4_5_2gawgawlvl9el7m.R.inc(21278);return false;
        }__CLR4_5_2gawgawlvl9el7m.R.inc(21279);if ((((general_profile_compatibility_flags != that.general_profile_compatibility_flags)&&(__CLR4_5_2gawgawlvl9el7m.R.iget(21280)!=0|true))||(__CLR4_5_2gawgawlvl9el7m.R.iget(21281)==0&false))) {__CLR4_5_2gawgawlvl9el7m.R.inc(21282);return false;
        }__CLR4_5_2gawgawlvl9el7m.R.inc(21283);if ((((general_profile_idc != that.general_profile_idc)&&(__CLR4_5_2gawgawlvl9el7m.R.iget(21284)!=0|true))||(__CLR4_5_2gawgawlvl9el7m.R.iget(21285)==0&false))) {__CLR4_5_2gawgawlvl9el7m.R.inc(21286);return false;
        }__CLR4_5_2gawgawlvl9el7m.R.inc(21287);if ((((general_profile_space != that.general_profile_space)&&(__CLR4_5_2gawgawlvl9el7m.R.iget(21288)!=0|true))||(__CLR4_5_2gawgawlvl9el7m.R.iget(21289)==0&false))) {__CLR4_5_2gawgawlvl9el7m.R.inc(21290);return false;
        }__CLR4_5_2gawgawlvl9el7m.R.inc(21291);if ((((general_tier_flag != that.general_tier_flag)&&(__CLR4_5_2gawgawlvl9el7m.R.iget(21292)!=0|true))||(__CLR4_5_2gawgawlvl9el7m.R.iget(21293)==0&false))) {__CLR4_5_2gawgawlvl9el7m.R.inc(21294);return false;
        }__CLR4_5_2gawgawlvl9el7m.R.inc(21295);if ((((lengthSizeMinusOne != that.lengthSizeMinusOne)&&(__CLR4_5_2gawgawlvl9el7m.R.iget(21296)!=0|true))||(__CLR4_5_2gawgawlvl9el7m.R.iget(21297)==0&false))) {__CLR4_5_2gawgawlvl9el7m.R.inc(21298);return false;
        }__CLR4_5_2gawgawlvl9el7m.R.inc(21299);if ((((min_spatial_segmentation_idc != that.min_spatial_segmentation_idc)&&(__CLR4_5_2gawgawlvl9el7m.R.iget(21300)!=0|true))||(__CLR4_5_2gawgawlvl9el7m.R.iget(21301)==0&false))) {__CLR4_5_2gawgawlvl9el7m.R.inc(21302);return false;
        }__CLR4_5_2gawgawlvl9el7m.R.inc(21303);if ((((numTemporalLayers != that.numTemporalLayers)&&(__CLR4_5_2gawgawlvl9el7m.R.iget(21304)!=0|true))||(__CLR4_5_2gawgawlvl9el7m.R.iget(21305)==0&false))) {__CLR4_5_2gawgawlvl9el7m.R.inc(21306);return false;
        }__CLR4_5_2gawgawlvl9el7m.R.inc(21307);if ((((parallelismType != that.parallelismType)&&(__CLR4_5_2gawgawlvl9el7m.R.iget(21308)!=0|true))||(__CLR4_5_2gawgawlvl9el7m.R.iget(21309)==0&false))) {__CLR4_5_2gawgawlvl9el7m.R.inc(21310);return false;
        }__CLR4_5_2gawgawlvl9el7m.R.inc(21311);if ((((reserved1 != that.reserved1)&&(__CLR4_5_2gawgawlvl9el7m.R.iget(21312)!=0|true))||(__CLR4_5_2gawgawlvl9el7m.R.iget(21313)==0&false))) {__CLR4_5_2gawgawlvl9el7m.R.inc(21314);return false;
        }__CLR4_5_2gawgawlvl9el7m.R.inc(21315);if ((((reserved2 != that.reserved2)&&(__CLR4_5_2gawgawlvl9el7m.R.iget(21316)!=0|true))||(__CLR4_5_2gawgawlvl9el7m.R.iget(21317)==0&false))) {__CLR4_5_2gawgawlvl9el7m.R.inc(21318);return false;
        }__CLR4_5_2gawgawlvl9el7m.R.inc(21319);if ((((reserved3 != that.reserved3)&&(__CLR4_5_2gawgawlvl9el7m.R.iget(21320)!=0|true))||(__CLR4_5_2gawgawlvl9el7m.R.iget(21321)==0&false))) {__CLR4_5_2gawgawlvl9el7m.R.inc(21322);return false;
        }__CLR4_5_2gawgawlvl9el7m.R.inc(21323);if ((((reserved4 != that.reserved4)&&(__CLR4_5_2gawgawlvl9el7m.R.iget(21324)!=0|true))||(__CLR4_5_2gawgawlvl9el7m.R.iget(21325)==0&false))) {__CLR4_5_2gawgawlvl9el7m.R.inc(21326);return false;
        }__CLR4_5_2gawgawlvl9el7m.R.inc(21327);if ((((reserved5 != that.reserved5)&&(__CLR4_5_2gawgawlvl9el7m.R.iget(21328)!=0|true))||(__CLR4_5_2gawgawlvl9el7m.R.iget(21329)==0&false))) {__CLR4_5_2gawgawlvl9el7m.R.inc(21330);return false;
        }__CLR4_5_2gawgawlvl9el7m.R.inc(21331);if ((((temporalIdNested != that.temporalIdNested)&&(__CLR4_5_2gawgawlvl9el7m.R.iget(21332)!=0|true))||(__CLR4_5_2gawgawlvl9el7m.R.iget(21333)==0&false))) {__CLR4_5_2gawgawlvl9el7m.R.inc(21334);return false;
        }__CLR4_5_2gawgawlvl9el7m.R.inc(21335);if (((((((arrays != null )&&(__CLR4_5_2gawgawlvl9el7m.R.iget(21336)!=0|true))||(__CLR4_5_2gawgawlvl9el7m.R.iget(21337)==0&false))? !arrays.equals(that.arrays) : that.arrays != null)&&(__CLR4_5_2gawgawlvl9el7m.R.iget(21338)!=0|true))||(__CLR4_5_2gawgawlvl9el7m.R.iget(21339)==0&false))) {__CLR4_5_2gawgawlvl9el7m.R.inc(21340);return false;

        }__CLR4_5_2gawgawlvl9el7m.R.inc(21341);return true;
    }finally{__CLR4_5_2gawgawlvl9el7m.R.flushNeeded();}}

    @Override
    public int hashCode() {try{__CLR4_5_2gawgawlvl9el7m.R.inc(21342);
        __CLR4_5_2gawgawlvl9el7m.R.inc(21343);int result = configurationVersion;
        __CLR4_5_2gawgawlvl9el7m.R.inc(21344);result = 31 * result + general_profile_space;
        __CLR4_5_2gawgawlvl9el7m.R.inc(21345);result = 31 * result + ((((general_tier_flag )&&(__CLR4_5_2gawgawlvl9el7m.R.iget(21346)!=0|true))||(__CLR4_5_2gawgawlvl9el7m.R.iget(21347)==0&false))? 1 : 0);
        __CLR4_5_2gawgawlvl9el7m.R.inc(21348);result = 31 * result + general_profile_idc;
        __CLR4_5_2gawgawlvl9el7m.R.inc(21349);result = 31 * result + (int) (general_profile_compatibility_flags ^ (general_profile_compatibility_flags >>> 32));
        __CLR4_5_2gawgawlvl9el7m.R.inc(21350);result = 31 * result + (int) (general_constraint_indicator_flags ^ (general_constraint_indicator_flags >>> 32));
        __CLR4_5_2gawgawlvl9el7m.R.inc(21351);result = 31 * result + general_level_idc;
        __CLR4_5_2gawgawlvl9el7m.R.inc(21352);result = 31 * result + reserved1;
        __CLR4_5_2gawgawlvl9el7m.R.inc(21353);result = 31 * result + min_spatial_segmentation_idc;
        __CLR4_5_2gawgawlvl9el7m.R.inc(21354);result = 31 * result + reserved2;
        __CLR4_5_2gawgawlvl9el7m.R.inc(21355);result = 31 * result + parallelismType;
        __CLR4_5_2gawgawlvl9el7m.R.inc(21356);result = 31 * result + reserved3;
        __CLR4_5_2gawgawlvl9el7m.R.inc(21357);result = 31 * result + chromaFormat;
        __CLR4_5_2gawgawlvl9el7m.R.inc(21358);result = 31 * result + reserved4;
        __CLR4_5_2gawgawlvl9el7m.R.inc(21359);result = 31 * result + bitDepthLumaMinus8;
        __CLR4_5_2gawgawlvl9el7m.R.inc(21360);result = 31 * result + reserved5;
        __CLR4_5_2gawgawlvl9el7m.R.inc(21361);result = 31 * result + bitDepthChromaMinus8;
        __CLR4_5_2gawgawlvl9el7m.R.inc(21362);result = 31 * result + avgFrameRate;
        __CLR4_5_2gawgawlvl9el7m.R.inc(21363);result = 31 * result + constantFrameRate;
        __CLR4_5_2gawgawlvl9el7m.R.inc(21364);result = 31 * result + numTemporalLayers;
        __CLR4_5_2gawgawlvl9el7m.R.inc(21365);result = 31 * result + ((((temporalIdNested )&&(__CLR4_5_2gawgawlvl9el7m.R.iget(21366)!=0|true))||(__CLR4_5_2gawgawlvl9el7m.R.iget(21367)==0&false))? 1 : 0);
        __CLR4_5_2gawgawlvl9el7m.R.inc(21368);result = 31 * result + lengthSizeMinusOne;
        __CLR4_5_2gawgawlvl9el7m.R.inc(21369);result = 31 * result + ((((arrays != null )&&(__CLR4_5_2gawgawlvl9el7m.R.iget(21370)!=0|true))||(__CLR4_5_2gawgawlvl9el7m.R.iget(21371)==0&false))? arrays.hashCode() : 0);
        __CLR4_5_2gawgawlvl9el7m.R.inc(21372);return result;
    }finally{__CLR4_5_2gawgawlvl9el7m.R.flushNeeded();}}

    @Override
    public String toString() {try{__CLR4_5_2gawgawlvl9el7m.R.inc(21373);
        __CLR4_5_2gawgawlvl9el7m.R.inc(21374);return "HEVCDecoderConfigurationRecord{" +
                "configurationVersion=" + configurationVersion +
                ", general_profile_space=" + general_profile_space +
                ", general_tier_flag=" + general_tier_flag +
                ", general_profile_idc=" + general_profile_idc +
                ", general_profile_compatibility_flags=" + general_profile_compatibility_flags +
                ", general_constraint_indicator_flags=" + general_constraint_indicator_flags +
                ", general_level_idc=" + general_level_idc +
                ((((reserved1 != 0xf )&&(__CLR4_5_2gawgawlvl9el7m.R.iget(21375)!=0|true))||(__CLR4_5_2gawgawlvl9el7m.R.iget(21376)==0&false))? (", reserved1=" + reserved1) : "") +
                ", min_spatial_segmentation_idc=" + min_spatial_segmentation_idc +
                ((((reserved2 != 0x3F )&&(__CLR4_5_2gawgawlvl9el7m.R.iget(21377)!=0|true))||(__CLR4_5_2gawgawlvl9el7m.R.iget(21378)==0&false))? (", reserved2=" + reserved2) : "") +
                ", parallelismType=" + parallelismType +
                ((((reserved3 != 0x3F )&&(__CLR4_5_2gawgawlvl9el7m.R.iget(21379)!=0|true))||(__CLR4_5_2gawgawlvl9el7m.R.iget(21380)==0&false))? (", reserved3=" + reserved3) : "") +
                ", chromaFormat=" + chromaFormat +
                ((((reserved4 != 0x1F )&&(__CLR4_5_2gawgawlvl9el7m.R.iget(21381)!=0|true))||(__CLR4_5_2gawgawlvl9el7m.R.iget(21382)==0&false))? (", reserved4=" + reserved4) : "") +
                ", bitDepthLumaMinus8=" + bitDepthLumaMinus8 +
                ((((reserved5 != 0x1F )&&(__CLR4_5_2gawgawlvl9el7m.R.iget(21383)!=0|true))||(__CLR4_5_2gawgawlvl9el7m.R.iget(21384)==0&false))? (", reserved5=" + reserved5) : "") +
                ", bitDepthChromaMinus8=" + bitDepthChromaMinus8 +
                ", avgFrameRate=" + avgFrameRate +
                ", constantFrameRate=" + constantFrameRate +
                ", numTemporalLayers=" + numTemporalLayers +
                ", temporalIdNested=" + temporalIdNested +
                ", lengthSizeMinusOne=" + lengthSizeMinusOne +
                ", arrays=" + arrays +
                '}';
    }finally{__CLR4_5_2gawgawlvl9el7m.R.flushNeeded();}}

    public int getConfigurationVersion() {try{__CLR4_5_2gawgawlvl9el7m.R.inc(21385);
        __CLR4_5_2gawgawlvl9el7m.R.inc(21386);return configurationVersion;
    }finally{__CLR4_5_2gawgawlvl9el7m.R.flushNeeded();}}

    public void setConfigurationVersion(int configurationVersion) {try{__CLR4_5_2gawgawlvl9el7m.R.inc(21387);
        __CLR4_5_2gawgawlvl9el7m.R.inc(21388);this.configurationVersion = configurationVersion;
    }finally{__CLR4_5_2gawgawlvl9el7m.R.flushNeeded();}}

    public int getGeneral_profile_space() {try{__CLR4_5_2gawgawlvl9el7m.R.inc(21389);
        __CLR4_5_2gawgawlvl9el7m.R.inc(21390);return general_profile_space;
    }finally{__CLR4_5_2gawgawlvl9el7m.R.flushNeeded();}}

    public void setGeneral_profile_space(int general_profile_space) {try{__CLR4_5_2gawgawlvl9el7m.R.inc(21391);
        __CLR4_5_2gawgawlvl9el7m.R.inc(21392);this.general_profile_space = general_profile_space;
    }finally{__CLR4_5_2gawgawlvl9el7m.R.flushNeeded();}}

    public boolean isGeneral_tier_flag() {try{__CLR4_5_2gawgawlvl9el7m.R.inc(21393);
        __CLR4_5_2gawgawlvl9el7m.R.inc(21394);return general_tier_flag;
    }finally{__CLR4_5_2gawgawlvl9el7m.R.flushNeeded();}}

    public void setGeneral_tier_flag(boolean general_tier_flag) {try{__CLR4_5_2gawgawlvl9el7m.R.inc(21395);
        __CLR4_5_2gawgawlvl9el7m.R.inc(21396);this.general_tier_flag = general_tier_flag;
    }finally{__CLR4_5_2gawgawlvl9el7m.R.flushNeeded();}}

    public int getGeneral_profile_idc() {try{__CLR4_5_2gawgawlvl9el7m.R.inc(21397);
        __CLR4_5_2gawgawlvl9el7m.R.inc(21398);return general_profile_idc;
    }finally{__CLR4_5_2gawgawlvl9el7m.R.flushNeeded();}}

    public void setGeneral_profile_idc(int general_profile_idc) {try{__CLR4_5_2gawgawlvl9el7m.R.inc(21399);
        __CLR4_5_2gawgawlvl9el7m.R.inc(21400);this.general_profile_idc = general_profile_idc;
    }finally{__CLR4_5_2gawgawlvl9el7m.R.flushNeeded();}}

    public long getGeneral_profile_compatibility_flags() {try{__CLR4_5_2gawgawlvl9el7m.R.inc(21401);
        __CLR4_5_2gawgawlvl9el7m.R.inc(21402);return general_profile_compatibility_flags;
    }finally{__CLR4_5_2gawgawlvl9el7m.R.flushNeeded();}}

    public void setGeneral_profile_compatibility_flags(long general_profile_compatibility_flags) {try{__CLR4_5_2gawgawlvl9el7m.R.inc(21403);
        __CLR4_5_2gawgawlvl9el7m.R.inc(21404);this.general_profile_compatibility_flags = general_profile_compatibility_flags;
    }finally{__CLR4_5_2gawgawlvl9el7m.R.flushNeeded();}}

    public long getGeneral_constraint_indicator_flags() {try{__CLR4_5_2gawgawlvl9el7m.R.inc(21405);
        __CLR4_5_2gawgawlvl9el7m.R.inc(21406);return general_constraint_indicator_flags;
    }finally{__CLR4_5_2gawgawlvl9el7m.R.flushNeeded();}}

    public void setGeneral_constraint_indicator_flags(long general_constraint_indicator_flags) {try{__CLR4_5_2gawgawlvl9el7m.R.inc(21407);
        __CLR4_5_2gawgawlvl9el7m.R.inc(21408);this.general_constraint_indicator_flags = general_constraint_indicator_flags;
    }finally{__CLR4_5_2gawgawlvl9el7m.R.flushNeeded();}}

    public int getGeneral_level_idc() {try{__CLR4_5_2gawgawlvl9el7m.R.inc(21409);
        __CLR4_5_2gawgawlvl9el7m.R.inc(21410);return general_level_idc;
    }finally{__CLR4_5_2gawgawlvl9el7m.R.flushNeeded();}}

    public void setGeneral_level_idc(int general_level_idc) {try{__CLR4_5_2gawgawlvl9el7m.R.inc(21411);
        __CLR4_5_2gawgawlvl9el7m.R.inc(21412);this.general_level_idc = general_level_idc;
    }finally{__CLR4_5_2gawgawlvl9el7m.R.flushNeeded();}}

    public int getMin_spatial_segmentation_idc() {try{__CLR4_5_2gawgawlvl9el7m.R.inc(21413);
        __CLR4_5_2gawgawlvl9el7m.R.inc(21414);return min_spatial_segmentation_idc;
    }finally{__CLR4_5_2gawgawlvl9el7m.R.flushNeeded();}}

    public void setMin_spatial_segmentation_idc(int min_spatial_segmentation_idc) {try{__CLR4_5_2gawgawlvl9el7m.R.inc(21415);
        __CLR4_5_2gawgawlvl9el7m.R.inc(21416);this.min_spatial_segmentation_idc = min_spatial_segmentation_idc;
    }finally{__CLR4_5_2gawgawlvl9el7m.R.flushNeeded();}}

    public int getParallelismType() {try{__CLR4_5_2gawgawlvl9el7m.R.inc(21417);
        __CLR4_5_2gawgawlvl9el7m.R.inc(21418);return parallelismType;
    }finally{__CLR4_5_2gawgawlvl9el7m.R.flushNeeded();}}

    public void setParallelismType(int parallelismType) {try{__CLR4_5_2gawgawlvl9el7m.R.inc(21419);
        __CLR4_5_2gawgawlvl9el7m.R.inc(21420);this.parallelismType = parallelismType;
    }finally{__CLR4_5_2gawgawlvl9el7m.R.flushNeeded();}}

    public int getChromaFormat() {try{__CLR4_5_2gawgawlvl9el7m.R.inc(21421);
        __CLR4_5_2gawgawlvl9el7m.R.inc(21422);return chromaFormat;
    }finally{__CLR4_5_2gawgawlvl9el7m.R.flushNeeded();}}

    public void setChromaFormat(int chromaFormat) {try{__CLR4_5_2gawgawlvl9el7m.R.inc(21423);
        __CLR4_5_2gawgawlvl9el7m.R.inc(21424);this.chromaFormat = chromaFormat;
    }finally{__CLR4_5_2gawgawlvl9el7m.R.flushNeeded();}}

    public int getBitDepthLumaMinus8() {try{__CLR4_5_2gawgawlvl9el7m.R.inc(21425);
        __CLR4_5_2gawgawlvl9el7m.R.inc(21426);return bitDepthLumaMinus8;
    }finally{__CLR4_5_2gawgawlvl9el7m.R.flushNeeded();}}

    public void setBitDepthLumaMinus8(int bitDepthLumaMinus8) {try{__CLR4_5_2gawgawlvl9el7m.R.inc(21427);
        __CLR4_5_2gawgawlvl9el7m.R.inc(21428);this.bitDepthLumaMinus8 = bitDepthLumaMinus8;
    }finally{__CLR4_5_2gawgawlvl9el7m.R.flushNeeded();}}

    public int getBitDepthChromaMinus8() {try{__CLR4_5_2gawgawlvl9el7m.R.inc(21429);
        __CLR4_5_2gawgawlvl9el7m.R.inc(21430);return bitDepthChromaMinus8;
    }finally{__CLR4_5_2gawgawlvl9el7m.R.flushNeeded();}}

    public void setBitDepthChromaMinus8(int bitDepthChromaMinus8) {try{__CLR4_5_2gawgawlvl9el7m.R.inc(21431);
        __CLR4_5_2gawgawlvl9el7m.R.inc(21432);this.bitDepthChromaMinus8 = bitDepthChromaMinus8;
    }finally{__CLR4_5_2gawgawlvl9el7m.R.flushNeeded();}}

    public int getAvgFrameRate() {try{__CLR4_5_2gawgawlvl9el7m.R.inc(21433);
        __CLR4_5_2gawgawlvl9el7m.R.inc(21434);return avgFrameRate;
    }finally{__CLR4_5_2gawgawlvl9el7m.R.flushNeeded();}}

    public void setAvgFrameRate(int avgFrameRate) {try{__CLR4_5_2gawgawlvl9el7m.R.inc(21435);
        __CLR4_5_2gawgawlvl9el7m.R.inc(21436);this.avgFrameRate = avgFrameRate;
    }finally{__CLR4_5_2gawgawlvl9el7m.R.flushNeeded();}}

    public int getNumTemporalLayers() {try{__CLR4_5_2gawgawlvl9el7m.R.inc(21437);
        __CLR4_5_2gawgawlvl9el7m.R.inc(21438);return numTemporalLayers;
    }finally{__CLR4_5_2gawgawlvl9el7m.R.flushNeeded();}}

    public void setNumTemporalLayers(int numTemporalLayers) {try{__CLR4_5_2gawgawlvl9el7m.R.inc(21439);
        __CLR4_5_2gawgawlvl9el7m.R.inc(21440);this.numTemporalLayers = numTemporalLayers;
    }finally{__CLR4_5_2gawgawlvl9el7m.R.flushNeeded();}}

    public int getLengthSizeMinusOne() {try{__CLR4_5_2gawgawlvl9el7m.R.inc(21441);
        __CLR4_5_2gawgawlvl9el7m.R.inc(21442);return lengthSizeMinusOne;
    }finally{__CLR4_5_2gawgawlvl9el7m.R.flushNeeded();}}

    public void setLengthSizeMinusOne(int lengthSizeMinusOne) {try{__CLR4_5_2gawgawlvl9el7m.R.inc(21443);
        __CLR4_5_2gawgawlvl9el7m.R.inc(21444);this.lengthSizeMinusOne = lengthSizeMinusOne;
    }finally{__CLR4_5_2gawgawlvl9el7m.R.flushNeeded();}}

    public boolean isTemporalIdNested() {try{__CLR4_5_2gawgawlvl9el7m.R.inc(21445);
        __CLR4_5_2gawgawlvl9el7m.R.inc(21446);return temporalIdNested;
    }finally{__CLR4_5_2gawgawlvl9el7m.R.flushNeeded();}}

    public void setTemporalIdNested(boolean temporalIdNested) {try{__CLR4_5_2gawgawlvl9el7m.R.inc(21447);
        __CLR4_5_2gawgawlvl9el7m.R.inc(21448);this.temporalIdNested = temporalIdNested;
    }finally{__CLR4_5_2gawgawlvl9el7m.R.flushNeeded();}}

    public int getConstantFrameRate() {try{__CLR4_5_2gawgawlvl9el7m.R.inc(21449);
        __CLR4_5_2gawgawlvl9el7m.R.inc(21450);return constantFrameRate;
    }finally{__CLR4_5_2gawgawlvl9el7m.R.flushNeeded();}}

    public void setConstantFrameRate(int constantFrameRate) {try{__CLR4_5_2gawgawlvl9el7m.R.inc(21451);
        __CLR4_5_2gawgawlvl9el7m.R.inc(21452);this.constantFrameRate = constantFrameRate;
    }finally{__CLR4_5_2gawgawlvl9el7m.R.flushNeeded();}}

    public List<Array> getArrays() {try{__CLR4_5_2gawgawlvl9el7m.R.inc(21453);
        __CLR4_5_2gawgawlvl9el7m.R.inc(21454);return arrays;
    }finally{__CLR4_5_2gawgawlvl9el7m.R.flushNeeded();}}

    public void setArrays(List<Array> arrays) {try{__CLR4_5_2gawgawlvl9el7m.R.inc(21455);
        __CLR4_5_2gawgawlvl9el7m.R.inc(21456);this.arrays = arrays;
    }finally{__CLR4_5_2gawgawlvl9el7m.R.flushNeeded();}}

    public boolean isFrame_only_constraint_flag() {try{__CLR4_5_2gawgawlvl9el7m.R.inc(21457);
        __CLR4_5_2gawgawlvl9el7m.R.inc(21458);return frame_only_constraint_flag;
    }finally{__CLR4_5_2gawgawlvl9el7m.R.flushNeeded();}}

    public void setFrame_only_constraint_flag(boolean frame_only_constraint_flag) {try{__CLR4_5_2gawgawlvl9el7m.R.inc(21459);
        __CLR4_5_2gawgawlvl9el7m.R.inc(21460);this.frame_only_constraint_flag = frame_only_constraint_flag;
    }finally{__CLR4_5_2gawgawlvl9el7m.R.flushNeeded();}}

    public boolean isNon_packed_constraint_flag() {try{__CLR4_5_2gawgawlvl9el7m.R.inc(21461);
        __CLR4_5_2gawgawlvl9el7m.R.inc(21462);return non_packed_constraint_flag;
    }finally{__CLR4_5_2gawgawlvl9el7m.R.flushNeeded();}}

    public void setNon_packed_constraint_flag(boolean non_packed_constraint_flag) {try{__CLR4_5_2gawgawlvl9el7m.R.inc(21463);
        __CLR4_5_2gawgawlvl9el7m.R.inc(21464);this.non_packed_constraint_flag = non_packed_constraint_flag;
    }finally{__CLR4_5_2gawgawlvl9el7m.R.flushNeeded();}}

    public boolean isInterlaced_source_flag() {try{__CLR4_5_2gawgawlvl9el7m.R.inc(21465);
        __CLR4_5_2gawgawlvl9el7m.R.inc(21466);return interlaced_source_flag;
    }finally{__CLR4_5_2gawgawlvl9el7m.R.flushNeeded();}}

    public void setInterlaced_source_flag(boolean interlaced_source_flag) {try{__CLR4_5_2gawgawlvl9el7m.R.inc(21467);
        __CLR4_5_2gawgawlvl9el7m.R.inc(21468);this.interlaced_source_flag = interlaced_source_flag;
    }finally{__CLR4_5_2gawgawlvl9el7m.R.flushNeeded();}}

    public boolean isProgressive_source_flag() {try{__CLR4_5_2gawgawlvl9el7m.R.inc(21469);
        __CLR4_5_2gawgawlvl9el7m.R.inc(21470);return progressive_source_flag;
    }finally{__CLR4_5_2gawgawlvl9el7m.R.flushNeeded();}}

    public void setProgressive_source_flag(boolean progressive_source_flag) {try{__CLR4_5_2gawgawlvl9el7m.R.inc(21471);
        __CLR4_5_2gawgawlvl9el7m.R.inc(21472);this.progressive_source_flag = progressive_source_flag;
    }finally{__CLR4_5_2gawgawlvl9el7m.R.flushNeeded();}}

    public static class Array {

        public boolean array_completeness;
        public boolean reserved;
        public int nal_unit_type;
        public List<byte[]> nalUnits;


        public Array() {try{__CLR4_5_2gawgawlvl9el7m.R.inc(21473);

        }finally{__CLR4_5_2gawgawlvl9el7m.R.flushNeeded();}}

        @Override
        public boolean equals(Object o) {try{__CLR4_5_2gawgawlvl9el7m.R.inc(21474);
            __CLR4_5_2gawgawlvl9el7m.R.inc(21475);if ((((this == o)&&(__CLR4_5_2gawgawlvl9el7m.R.iget(21476)!=0|true))||(__CLR4_5_2gawgawlvl9el7m.R.iget(21477)==0&false))) {__CLR4_5_2gawgawlvl9el7m.R.inc(21478);return true;
            }__CLR4_5_2gawgawlvl9el7m.R.inc(21479);if ((((o == null || getClass() != o.getClass())&&(__CLR4_5_2gawgawlvl9el7m.R.iget(21480)!=0|true))||(__CLR4_5_2gawgawlvl9el7m.R.iget(21481)==0&false))) {__CLR4_5_2gawgawlvl9el7m.R.inc(21482);return false;

            }__CLR4_5_2gawgawlvl9el7m.R.inc(21483);Array array = (Array) o;

            __CLR4_5_2gawgawlvl9el7m.R.inc(21484);if ((((array_completeness != array.array_completeness)&&(__CLR4_5_2gawgawlvl9el7m.R.iget(21485)!=0|true))||(__CLR4_5_2gawgawlvl9el7m.R.iget(21486)==0&false))) {__CLR4_5_2gawgawlvl9el7m.R.inc(21487);return false;
            }__CLR4_5_2gawgawlvl9el7m.R.inc(21488);if ((((nal_unit_type != array.nal_unit_type)&&(__CLR4_5_2gawgawlvl9el7m.R.iget(21489)!=0|true))||(__CLR4_5_2gawgawlvl9el7m.R.iget(21490)==0&false))) {__CLR4_5_2gawgawlvl9el7m.R.inc(21491);return false;
            }__CLR4_5_2gawgawlvl9el7m.R.inc(21492);if ((((reserved != array.reserved)&&(__CLR4_5_2gawgawlvl9el7m.R.iget(21493)!=0|true))||(__CLR4_5_2gawgawlvl9el7m.R.iget(21494)==0&false))) {__CLR4_5_2gawgawlvl9el7m.R.inc(21495);return false;
            }__CLR4_5_2gawgawlvl9el7m.R.inc(21496);ListIterator<byte[]> e1 = nalUnits.listIterator();
            __CLR4_5_2gawgawlvl9el7m.R.inc(21497);ListIterator<byte[]> e2 = (array.nalUnits).listIterator();
            __CLR4_5_2gawgawlvl9el7m.R.inc(21498);while ((((e1.hasNext() && e2.hasNext())&&(__CLR4_5_2gawgawlvl9el7m.R.iget(21499)!=0|true))||(__CLR4_5_2gawgawlvl9el7m.R.iget(21500)==0&false))) {{
                __CLR4_5_2gawgawlvl9el7m.R.inc(21501);byte[] o1 = e1.next();
                __CLR4_5_2gawgawlvl9el7m.R.inc(21502);byte[] o2 = e2.next();

                __CLR4_5_2gawgawlvl9el7m.R.inc(21503);if ((((!((((o1 == null )&&(__CLR4_5_2gawgawlvl9el7m.R.iget(21504)!=0|true))||(__CLR4_5_2gawgawlvl9el7m.R.iget(21505)==0&false))? o2 == null : Arrays.equals(o1, o2)))&&(__CLR4_5_2gawgawlvl9el7m.R.iget(21506)!=0|true))||(__CLR4_5_2gawgawlvl9el7m.R.iget(21507)==0&false)))
                    {__CLR4_5_2gawgawlvl9el7m.R.inc(21508);return false;
            }}
            }__CLR4_5_2gawgawlvl9el7m.R.inc(21509);return !(e1.hasNext() || e2.hasNext());
        }finally{__CLR4_5_2gawgawlvl9el7m.R.flushNeeded();}}

        @Override
        public int hashCode() {try{__CLR4_5_2gawgawlvl9el7m.R.inc(21510);
            __CLR4_5_2gawgawlvl9el7m.R.inc(21511);int result = ((((array_completeness )&&(__CLR4_5_2gawgawlvl9el7m.R.iget(21512)!=0|true))||(__CLR4_5_2gawgawlvl9el7m.R.iget(21513)==0&false))? 1 : 0);
            __CLR4_5_2gawgawlvl9el7m.R.inc(21514);result = 31 * result + ((((reserved )&&(__CLR4_5_2gawgawlvl9el7m.R.iget(21515)!=0|true))||(__CLR4_5_2gawgawlvl9el7m.R.iget(21516)==0&false))? 1 : 0);
            __CLR4_5_2gawgawlvl9el7m.R.inc(21517);result = 31 * result + nal_unit_type;
            __CLR4_5_2gawgawlvl9el7m.R.inc(21518);result = 31 * result + ((((nalUnits != null )&&(__CLR4_5_2gawgawlvl9el7m.R.iget(21519)!=0|true))||(__CLR4_5_2gawgawlvl9el7m.R.iget(21520)==0&false))? nalUnits.hashCode() : 0);
            __CLR4_5_2gawgawlvl9el7m.R.inc(21521);return result;
        }finally{__CLR4_5_2gawgawlvl9el7m.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_5_2gawgawlvl9el7m.R.inc(21522);
            __CLR4_5_2gawgawlvl9el7m.R.inc(21523);return "Array{" +
                    "nal_unit_type=" + nal_unit_type +
                    ", reserved=" + reserved +
                    ", array_completeness=" + array_completeness +
                    ", num_nals=" + nalUnits.size() +
                    '}';
        }finally{__CLR4_5_2gawgawlvl9el7m.R.flushNeeded();}}
    }
}
