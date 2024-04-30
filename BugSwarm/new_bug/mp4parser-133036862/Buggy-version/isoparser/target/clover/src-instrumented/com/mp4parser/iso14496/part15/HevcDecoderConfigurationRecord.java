/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.mp4parser.iso14496.part15;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class HevcDecoderConfigurationRecord {public static class __CLR4_5_2gdjgdjlvlulnr6{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0033\u0033\u0030\u0033\u0036\u0038\u0036\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714448869219L,8589935092L,21619,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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


    public HevcDecoderConfigurationRecord() {try{__CLR4_5_2gdjgdjlvlulnr6.R.inc(21223);
    }finally{__CLR4_5_2gdjgdjlvlulnr6.R.flushNeeded();}}


    public void parse(ByteBuffer content) {try{__CLR4_5_2gdjgdjlvlulnr6.R.inc(21224);
        __CLR4_5_2gdjgdjlvlulnr6.R.inc(21225);configurationVersion = IsoTypeReader.readUInt8(content);

        /*
         * unsigned int(2) general_profile_space;
         * unsigned int(1) general_tier_flag;
         * unsigned int(5) general_profile_idc;
         */
        __CLR4_5_2gdjgdjlvlulnr6.R.inc(21226);int a = IsoTypeReader.readUInt8(content);
        __CLR4_5_2gdjgdjlvlulnr6.R.inc(21227);general_profile_space = (a & 0xC0) >> 6;
        __CLR4_5_2gdjgdjlvlulnr6.R.inc(21228);general_tier_flag = (a & 0x20) > 0;
        __CLR4_5_2gdjgdjlvlulnr6.R.inc(21229);general_profile_idc = (a & 0x1F);

        /* unsigned int(32) general_profile_compatibility_flags; */
        __CLR4_5_2gdjgdjlvlulnr6.R.inc(21230);general_profile_compatibility_flags = IsoTypeReader.readUInt32(content);


         /* unsigned int(48) general_constraint_indicator_flags; */
        __CLR4_5_2gdjgdjlvlulnr6.R.inc(21231);general_constraint_indicator_flags = IsoTypeReader.readUInt48(content);

        __CLR4_5_2gdjgdjlvlulnr6.R.inc(21232);frame_only_constraint_flag = ((general_constraint_indicator_flags >> 44) & 0x08) > 0;
        __CLR4_5_2gdjgdjlvlulnr6.R.inc(21233);non_packed_constraint_flag = ((general_constraint_indicator_flags >> 44) & 0x04) > 0;
        __CLR4_5_2gdjgdjlvlulnr6.R.inc(21234);interlaced_source_flag = ((general_constraint_indicator_flags >> 44) & 0x02) > 0;
        __CLR4_5_2gdjgdjlvlulnr6.R.inc(21235);progressive_source_flag = ((general_constraint_indicator_flags >> 44) & 0x01) > 0;

        __CLR4_5_2gdjgdjlvlulnr6.R.inc(21236);general_constraint_indicator_flags &= 0x7fffffffffffL;

        /* unsigned int(8) general_level_idc; */
        __CLR4_5_2gdjgdjlvlulnr6.R.inc(21237);general_level_idc = IsoTypeReader.readUInt8(content);

        /*
         * bit(4) reserved = \u20181111\u2019b;
         * unsigned int(12) min_spatial_segmentation_idc;
         */
        __CLR4_5_2gdjgdjlvlulnr6.R.inc(21238);a = IsoTypeReader.readUInt16(content);
        __CLR4_5_2gdjgdjlvlulnr6.R.inc(21239);reserved1 = (a & 0xF000) >> 12;
        __CLR4_5_2gdjgdjlvlulnr6.R.inc(21240);min_spatial_segmentation_idc = a & 0xFFF;

        __CLR4_5_2gdjgdjlvlulnr6.R.inc(21241);a = IsoTypeReader.readUInt8(content);
        __CLR4_5_2gdjgdjlvlulnr6.R.inc(21242);reserved2 = (a & 0xFC) >> 2;
        __CLR4_5_2gdjgdjlvlulnr6.R.inc(21243);parallelismType = a & 0x3;

        __CLR4_5_2gdjgdjlvlulnr6.R.inc(21244);a = IsoTypeReader.readUInt8(content);
        __CLR4_5_2gdjgdjlvlulnr6.R.inc(21245);reserved3 = (a & 0xFC) >> 2;
        __CLR4_5_2gdjgdjlvlulnr6.R.inc(21246);chromaFormat = a & 0x3;

        __CLR4_5_2gdjgdjlvlulnr6.R.inc(21247);a = IsoTypeReader.readUInt8(content);
        __CLR4_5_2gdjgdjlvlulnr6.R.inc(21248);reserved4 = (a & 0xF8) >> 3;
        __CLR4_5_2gdjgdjlvlulnr6.R.inc(21249);bitDepthLumaMinus8 = a & 0x7;

        __CLR4_5_2gdjgdjlvlulnr6.R.inc(21250);a = IsoTypeReader.readUInt8(content);
        __CLR4_5_2gdjgdjlvlulnr6.R.inc(21251);reserved5 = (a & 0xF8) >> 3;
        __CLR4_5_2gdjgdjlvlulnr6.R.inc(21252);bitDepthChromaMinus8 = a & 0x7;

        __CLR4_5_2gdjgdjlvlulnr6.R.inc(21253);avgFrameRate = IsoTypeReader.readUInt16(content);

        __CLR4_5_2gdjgdjlvlulnr6.R.inc(21254);a = IsoTypeReader.readUInt8(content);
        __CLR4_5_2gdjgdjlvlulnr6.R.inc(21255);constantFrameRate = (a & 0xC0) >> 6;
        __CLR4_5_2gdjgdjlvlulnr6.R.inc(21256);numTemporalLayers = (a & 0x38) >> 3;
        __CLR4_5_2gdjgdjlvlulnr6.R.inc(21257);temporalIdNested = (a & 0x4) > 0;
        __CLR4_5_2gdjgdjlvlulnr6.R.inc(21258);lengthSizeMinusOne = a & 0x3;


        __CLR4_5_2gdjgdjlvlulnr6.R.inc(21259);int numOfArrays = IsoTypeReader.readUInt8(content);
        __CLR4_5_2gdjgdjlvlulnr6.R.inc(21260);this.arrays = new ArrayList<Array>();
        __CLR4_5_2gdjgdjlvlulnr6.R.inc(21261);for (int i = 0; (((i < numOfArrays)&&(__CLR4_5_2gdjgdjlvlulnr6.R.iget(21262)!=0|true))||(__CLR4_5_2gdjgdjlvlulnr6.R.iget(21263)==0&false)); i++) {{
            __CLR4_5_2gdjgdjlvlulnr6.R.inc(21264);Array array = new Array();

            __CLR4_5_2gdjgdjlvlulnr6.R.inc(21265);a = IsoTypeReader.readUInt8(content);
            __CLR4_5_2gdjgdjlvlulnr6.R.inc(21266);array.array_completeness = (a & 0x80) > 0;
            __CLR4_5_2gdjgdjlvlulnr6.R.inc(21267);array.reserved = (a & 0x40) > 0;
            __CLR4_5_2gdjgdjlvlulnr6.R.inc(21268);array.nal_unit_type = a & 0x3F;

            __CLR4_5_2gdjgdjlvlulnr6.R.inc(21269);int numNalus = IsoTypeReader.readUInt16(content);
            __CLR4_5_2gdjgdjlvlulnr6.R.inc(21270);array.nalUnits = new ArrayList<byte[]>();
            __CLR4_5_2gdjgdjlvlulnr6.R.inc(21271);for (int j = 0; (((j < numNalus)&&(__CLR4_5_2gdjgdjlvlulnr6.R.iget(21272)!=0|true))||(__CLR4_5_2gdjgdjlvlulnr6.R.iget(21273)==0&false)); j++) {{
                __CLR4_5_2gdjgdjlvlulnr6.R.inc(21274);int nalUnitLength = IsoTypeReader.readUInt16(content);
                __CLR4_5_2gdjgdjlvlulnr6.R.inc(21275);byte[] nal = new byte[nalUnitLength];
                __CLR4_5_2gdjgdjlvlulnr6.R.inc(21276);content.get(nal);
                __CLR4_5_2gdjgdjlvlulnr6.R.inc(21277);array.nalUnits.add(nal);
            }
            }__CLR4_5_2gdjgdjlvlulnr6.R.inc(21278);arrays.add(array);
        }
    }}finally{__CLR4_5_2gdjgdjlvlulnr6.R.flushNeeded();}}

    public void write(ByteBuffer byteBuffer) {try{__CLR4_5_2gdjgdjlvlulnr6.R.inc(21279);
        __CLR4_5_2gdjgdjlvlulnr6.R.inc(21280);IsoTypeWriter.writeUInt8(byteBuffer, configurationVersion);


        __CLR4_5_2gdjgdjlvlulnr6.R.inc(21281);IsoTypeWriter.writeUInt8(byteBuffer, (general_profile_space << 6) + ((((general_tier_flag )&&(__CLR4_5_2gdjgdjlvlulnr6.R.iget(21282)!=0|true))||(__CLR4_5_2gdjgdjlvlulnr6.R.iget(21283)==0&false))? 0x20 : 0) + general_profile_idc);

        __CLR4_5_2gdjgdjlvlulnr6.R.inc(21284);IsoTypeWriter.writeUInt32(byteBuffer, general_profile_compatibility_flags);
        __CLR4_5_2gdjgdjlvlulnr6.R.inc(21285);long _general_constraint_indicator_flags = general_constraint_indicator_flags;
        __CLR4_5_2gdjgdjlvlulnr6.R.inc(21286);if ((((frame_only_constraint_flag)&&(__CLR4_5_2gdjgdjlvlulnr6.R.iget(21287)!=0|true))||(__CLR4_5_2gdjgdjlvlulnr6.R.iget(21288)==0&false))) {{
            __CLR4_5_2gdjgdjlvlulnr6.R.inc(21289);_general_constraint_indicator_flags |= 1l << 47;
        }
        }__CLR4_5_2gdjgdjlvlulnr6.R.inc(21290);if ((((non_packed_constraint_flag)&&(__CLR4_5_2gdjgdjlvlulnr6.R.iget(21291)!=0|true))||(__CLR4_5_2gdjgdjlvlulnr6.R.iget(21292)==0&false))) {{
            __CLR4_5_2gdjgdjlvlulnr6.R.inc(21293);_general_constraint_indicator_flags |= 1l << 46;
        }
        }__CLR4_5_2gdjgdjlvlulnr6.R.inc(21294);if ( (((interlaced_source_flag)&&(__CLR4_5_2gdjgdjlvlulnr6.R.iget(21295)!=0|true))||(__CLR4_5_2gdjgdjlvlulnr6.R.iget(21296)==0&false))) {{
            __CLR4_5_2gdjgdjlvlulnr6.R.inc(21297);_general_constraint_indicator_flags |= 1l << 45;
        }
        }__CLR4_5_2gdjgdjlvlulnr6.R.inc(21298);if ((((progressive_source_flag)&&(__CLR4_5_2gdjgdjlvlulnr6.R.iget(21299)!=0|true))||(__CLR4_5_2gdjgdjlvlulnr6.R.iget(21300)==0&false))) {{
            __CLR4_5_2gdjgdjlvlulnr6.R.inc(21301);_general_constraint_indicator_flags |= 1l << 44;
        }

        }__CLR4_5_2gdjgdjlvlulnr6.R.inc(21302);IsoTypeWriter.writeUInt48(byteBuffer, _general_constraint_indicator_flags);


        __CLR4_5_2gdjgdjlvlulnr6.R.inc(21303);IsoTypeWriter.writeUInt8(byteBuffer, general_level_idc);

        __CLR4_5_2gdjgdjlvlulnr6.R.inc(21304);IsoTypeWriter.writeUInt16(byteBuffer, (reserved1 << 12) + min_spatial_segmentation_idc);

        __CLR4_5_2gdjgdjlvlulnr6.R.inc(21305);IsoTypeWriter.writeUInt8(byteBuffer, (reserved2 << 2) + parallelismType);

        __CLR4_5_2gdjgdjlvlulnr6.R.inc(21306);IsoTypeWriter.writeUInt8(byteBuffer, (reserved3 << 2) + chromaFormat);

        __CLR4_5_2gdjgdjlvlulnr6.R.inc(21307);IsoTypeWriter.writeUInt8(byteBuffer, (reserved4 << 3) + bitDepthLumaMinus8);

        __CLR4_5_2gdjgdjlvlulnr6.R.inc(21308);IsoTypeWriter.writeUInt8(byteBuffer, (reserved5 << 3) + bitDepthChromaMinus8);

        __CLR4_5_2gdjgdjlvlulnr6.R.inc(21309);IsoTypeWriter.writeUInt16(byteBuffer, avgFrameRate);

        __CLR4_5_2gdjgdjlvlulnr6.R.inc(21310);IsoTypeWriter.writeUInt8(byteBuffer, (constantFrameRate << 6) + (numTemporalLayers << 3) + ((((temporalIdNested )&&(__CLR4_5_2gdjgdjlvlulnr6.R.iget(21311)!=0|true))||(__CLR4_5_2gdjgdjlvlulnr6.R.iget(21312)==0&false))? 0x4 : 0) + lengthSizeMinusOne);

        __CLR4_5_2gdjgdjlvlulnr6.R.inc(21313);IsoTypeWriter.writeUInt8(byteBuffer, arrays.size());

        __CLR4_5_2gdjgdjlvlulnr6.R.inc(21314);for (Array array : arrays) {{
            __CLR4_5_2gdjgdjlvlulnr6.R.inc(21315);IsoTypeWriter.writeUInt8(byteBuffer, ((((array.array_completeness )&&(__CLR4_5_2gdjgdjlvlulnr6.R.iget(21316)!=0|true))||(__CLR4_5_2gdjgdjlvlulnr6.R.iget(21317)==0&false))? 0x80 : 0) + ((((array.reserved )&&(__CLR4_5_2gdjgdjlvlulnr6.R.iget(21318)!=0|true))||(__CLR4_5_2gdjgdjlvlulnr6.R.iget(21319)==0&false))? 0x40 : 0) + array.nal_unit_type);

            __CLR4_5_2gdjgdjlvlulnr6.R.inc(21320);IsoTypeWriter.writeUInt16(byteBuffer, array.nalUnits.size());
            __CLR4_5_2gdjgdjlvlulnr6.R.inc(21321);for (byte[] nalUnit : array.nalUnits) {{
                __CLR4_5_2gdjgdjlvlulnr6.R.inc(21322);IsoTypeWriter.writeUInt16(byteBuffer, nalUnit.length);
                __CLR4_5_2gdjgdjlvlulnr6.R.inc(21323);byteBuffer.put(nalUnit);
            }
        }}
    }}finally{__CLR4_5_2gdjgdjlvlulnr6.R.flushNeeded();}}

    public int getSize() {try{__CLR4_5_2gdjgdjlvlulnr6.R.inc(21324);
        __CLR4_5_2gdjgdjlvlulnr6.R.inc(21325);int size = 23;
        __CLR4_5_2gdjgdjlvlulnr6.R.inc(21326);for (Array array : arrays) {{
            __CLR4_5_2gdjgdjlvlulnr6.R.inc(21327);size += 3;
            __CLR4_5_2gdjgdjlvlulnr6.R.inc(21328);for (byte[] nalUnit : array.nalUnits) {{
                __CLR4_5_2gdjgdjlvlulnr6.R.inc(21329);size += 2;
                __CLR4_5_2gdjgdjlvlulnr6.R.inc(21330);size += nalUnit.length;
            }
        }}
        }__CLR4_5_2gdjgdjlvlulnr6.R.inc(21331);return size;
    }finally{__CLR4_5_2gdjgdjlvlulnr6.R.flushNeeded();}}

    @Override
    public boolean equals(Object o) {try{__CLR4_5_2gdjgdjlvlulnr6.R.inc(21332);
        __CLR4_5_2gdjgdjlvlulnr6.R.inc(21333);if ((((this == o)&&(__CLR4_5_2gdjgdjlvlulnr6.R.iget(21334)!=0|true))||(__CLR4_5_2gdjgdjlvlulnr6.R.iget(21335)==0&false))) {__CLR4_5_2gdjgdjlvlulnr6.R.inc(21336);return true;
        }__CLR4_5_2gdjgdjlvlulnr6.R.inc(21337);if ((((o == null || getClass() != o.getClass())&&(__CLR4_5_2gdjgdjlvlulnr6.R.iget(21338)!=0|true))||(__CLR4_5_2gdjgdjlvlulnr6.R.iget(21339)==0&false))) {__CLR4_5_2gdjgdjlvlulnr6.R.inc(21340);return false;

        }__CLR4_5_2gdjgdjlvlulnr6.R.inc(21341);HevcDecoderConfigurationRecord that = (HevcDecoderConfigurationRecord) o;

        __CLR4_5_2gdjgdjlvlulnr6.R.inc(21342);if ((((avgFrameRate != that.avgFrameRate)&&(__CLR4_5_2gdjgdjlvlulnr6.R.iget(21343)!=0|true))||(__CLR4_5_2gdjgdjlvlulnr6.R.iget(21344)==0&false))) {__CLR4_5_2gdjgdjlvlulnr6.R.inc(21345);return false;
        }__CLR4_5_2gdjgdjlvlulnr6.R.inc(21346);if ((((bitDepthChromaMinus8 != that.bitDepthChromaMinus8)&&(__CLR4_5_2gdjgdjlvlulnr6.R.iget(21347)!=0|true))||(__CLR4_5_2gdjgdjlvlulnr6.R.iget(21348)==0&false))) {__CLR4_5_2gdjgdjlvlulnr6.R.inc(21349);return false;
        }__CLR4_5_2gdjgdjlvlulnr6.R.inc(21350);if ((((bitDepthLumaMinus8 != that.bitDepthLumaMinus8)&&(__CLR4_5_2gdjgdjlvlulnr6.R.iget(21351)!=0|true))||(__CLR4_5_2gdjgdjlvlulnr6.R.iget(21352)==0&false))) {__CLR4_5_2gdjgdjlvlulnr6.R.inc(21353);return false;
        }__CLR4_5_2gdjgdjlvlulnr6.R.inc(21354);if ((((chromaFormat != that.chromaFormat)&&(__CLR4_5_2gdjgdjlvlulnr6.R.iget(21355)!=0|true))||(__CLR4_5_2gdjgdjlvlulnr6.R.iget(21356)==0&false))) {__CLR4_5_2gdjgdjlvlulnr6.R.inc(21357);return false;
        }__CLR4_5_2gdjgdjlvlulnr6.R.inc(21358);if ((((configurationVersion != that.configurationVersion)&&(__CLR4_5_2gdjgdjlvlulnr6.R.iget(21359)!=0|true))||(__CLR4_5_2gdjgdjlvlulnr6.R.iget(21360)==0&false))) {__CLR4_5_2gdjgdjlvlulnr6.R.inc(21361);return false;
        }__CLR4_5_2gdjgdjlvlulnr6.R.inc(21362);if ((((constantFrameRate != that.constantFrameRate)&&(__CLR4_5_2gdjgdjlvlulnr6.R.iget(21363)!=0|true))||(__CLR4_5_2gdjgdjlvlulnr6.R.iget(21364)==0&false))) {__CLR4_5_2gdjgdjlvlulnr6.R.inc(21365);return false;
        }__CLR4_5_2gdjgdjlvlulnr6.R.inc(21366);if ((((general_constraint_indicator_flags != that.general_constraint_indicator_flags)&&(__CLR4_5_2gdjgdjlvlulnr6.R.iget(21367)!=0|true))||(__CLR4_5_2gdjgdjlvlulnr6.R.iget(21368)==0&false))) {__CLR4_5_2gdjgdjlvlulnr6.R.inc(21369);return false;
        }__CLR4_5_2gdjgdjlvlulnr6.R.inc(21370);if ((((general_level_idc != that.general_level_idc)&&(__CLR4_5_2gdjgdjlvlulnr6.R.iget(21371)!=0|true))||(__CLR4_5_2gdjgdjlvlulnr6.R.iget(21372)==0&false))) {__CLR4_5_2gdjgdjlvlulnr6.R.inc(21373);return false;
        }__CLR4_5_2gdjgdjlvlulnr6.R.inc(21374);if ((((general_profile_compatibility_flags != that.general_profile_compatibility_flags)&&(__CLR4_5_2gdjgdjlvlulnr6.R.iget(21375)!=0|true))||(__CLR4_5_2gdjgdjlvlulnr6.R.iget(21376)==0&false))) {__CLR4_5_2gdjgdjlvlulnr6.R.inc(21377);return false;
        }__CLR4_5_2gdjgdjlvlulnr6.R.inc(21378);if ((((general_profile_idc != that.general_profile_idc)&&(__CLR4_5_2gdjgdjlvlulnr6.R.iget(21379)!=0|true))||(__CLR4_5_2gdjgdjlvlulnr6.R.iget(21380)==0&false))) {__CLR4_5_2gdjgdjlvlulnr6.R.inc(21381);return false;
        }__CLR4_5_2gdjgdjlvlulnr6.R.inc(21382);if ((((general_profile_space != that.general_profile_space)&&(__CLR4_5_2gdjgdjlvlulnr6.R.iget(21383)!=0|true))||(__CLR4_5_2gdjgdjlvlulnr6.R.iget(21384)==0&false))) {__CLR4_5_2gdjgdjlvlulnr6.R.inc(21385);return false;
        }__CLR4_5_2gdjgdjlvlulnr6.R.inc(21386);if ((((general_tier_flag != that.general_tier_flag)&&(__CLR4_5_2gdjgdjlvlulnr6.R.iget(21387)!=0|true))||(__CLR4_5_2gdjgdjlvlulnr6.R.iget(21388)==0&false))) {__CLR4_5_2gdjgdjlvlulnr6.R.inc(21389);return false;
        }__CLR4_5_2gdjgdjlvlulnr6.R.inc(21390);if ((((lengthSizeMinusOne != that.lengthSizeMinusOne)&&(__CLR4_5_2gdjgdjlvlulnr6.R.iget(21391)!=0|true))||(__CLR4_5_2gdjgdjlvlulnr6.R.iget(21392)==0&false))) {__CLR4_5_2gdjgdjlvlulnr6.R.inc(21393);return false;
        }__CLR4_5_2gdjgdjlvlulnr6.R.inc(21394);if ((((min_spatial_segmentation_idc != that.min_spatial_segmentation_idc)&&(__CLR4_5_2gdjgdjlvlulnr6.R.iget(21395)!=0|true))||(__CLR4_5_2gdjgdjlvlulnr6.R.iget(21396)==0&false))) {__CLR4_5_2gdjgdjlvlulnr6.R.inc(21397);return false;
        }__CLR4_5_2gdjgdjlvlulnr6.R.inc(21398);if ((((numTemporalLayers != that.numTemporalLayers)&&(__CLR4_5_2gdjgdjlvlulnr6.R.iget(21399)!=0|true))||(__CLR4_5_2gdjgdjlvlulnr6.R.iget(21400)==0&false))) {__CLR4_5_2gdjgdjlvlulnr6.R.inc(21401);return false;
        }__CLR4_5_2gdjgdjlvlulnr6.R.inc(21402);if ((((parallelismType != that.parallelismType)&&(__CLR4_5_2gdjgdjlvlulnr6.R.iget(21403)!=0|true))||(__CLR4_5_2gdjgdjlvlulnr6.R.iget(21404)==0&false))) {__CLR4_5_2gdjgdjlvlulnr6.R.inc(21405);return false;
        }__CLR4_5_2gdjgdjlvlulnr6.R.inc(21406);if ((((reserved1 != that.reserved1)&&(__CLR4_5_2gdjgdjlvlulnr6.R.iget(21407)!=0|true))||(__CLR4_5_2gdjgdjlvlulnr6.R.iget(21408)==0&false))) {__CLR4_5_2gdjgdjlvlulnr6.R.inc(21409);return false;
        }__CLR4_5_2gdjgdjlvlulnr6.R.inc(21410);if ((((reserved2 != that.reserved2)&&(__CLR4_5_2gdjgdjlvlulnr6.R.iget(21411)!=0|true))||(__CLR4_5_2gdjgdjlvlulnr6.R.iget(21412)==0&false))) {__CLR4_5_2gdjgdjlvlulnr6.R.inc(21413);return false;
        }__CLR4_5_2gdjgdjlvlulnr6.R.inc(21414);if ((((reserved3 != that.reserved3)&&(__CLR4_5_2gdjgdjlvlulnr6.R.iget(21415)!=0|true))||(__CLR4_5_2gdjgdjlvlulnr6.R.iget(21416)==0&false))) {__CLR4_5_2gdjgdjlvlulnr6.R.inc(21417);return false;
        }__CLR4_5_2gdjgdjlvlulnr6.R.inc(21418);if ((((reserved4 != that.reserved4)&&(__CLR4_5_2gdjgdjlvlulnr6.R.iget(21419)!=0|true))||(__CLR4_5_2gdjgdjlvlulnr6.R.iget(21420)==0&false))) {__CLR4_5_2gdjgdjlvlulnr6.R.inc(21421);return false;
        }__CLR4_5_2gdjgdjlvlulnr6.R.inc(21422);if ((((reserved5 != that.reserved5)&&(__CLR4_5_2gdjgdjlvlulnr6.R.iget(21423)!=0|true))||(__CLR4_5_2gdjgdjlvlulnr6.R.iget(21424)==0&false))) {__CLR4_5_2gdjgdjlvlulnr6.R.inc(21425);return false;
        }__CLR4_5_2gdjgdjlvlulnr6.R.inc(21426);if ((((temporalIdNested != that.temporalIdNested)&&(__CLR4_5_2gdjgdjlvlulnr6.R.iget(21427)!=0|true))||(__CLR4_5_2gdjgdjlvlulnr6.R.iget(21428)==0&false))) {__CLR4_5_2gdjgdjlvlulnr6.R.inc(21429);return false;
        }__CLR4_5_2gdjgdjlvlulnr6.R.inc(21430);if (((((((arrays != null )&&(__CLR4_5_2gdjgdjlvlulnr6.R.iget(21431)!=0|true))||(__CLR4_5_2gdjgdjlvlulnr6.R.iget(21432)==0&false))? !arrays.equals(that.arrays) : that.arrays != null)&&(__CLR4_5_2gdjgdjlvlulnr6.R.iget(21433)!=0|true))||(__CLR4_5_2gdjgdjlvlulnr6.R.iget(21434)==0&false))) {__CLR4_5_2gdjgdjlvlulnr6.R.inc(21435);return false;

        }__CLR4_5_2gdjgdjlvlulnr6.R.inc(21436);return true;
    }finally{__CLR4_5_2gdjgdjlvlulnr6.R.flushNeeded();}}

    @Override
    public int hashCode() {try{__CLR4_5_2gdjgdjlvlulnr6.R.inc(21437);
        __CLR4_5_2gdjgdjlvlulnr6.R.inc(21438);int result = configurationVersion;
        __CLR4_5_2gdjgdjlvlulnr6.R.inc(21439);result = 31 * result + general_profile_space;
        __CLR4_5_2gdjgdjlvlulnr6.R.inc(21440);result = 31 * result + ((((general_tier_flag )&&(__CLR4_5_2gdjgdjlvlulnr6.R.iget(21441)!=0|true))||(__CLR4_5_2gdjgdjlvlulnr6.R.iget(21442)==0&false))? 1 : 0);
        __CLR4_5_2gdjgdjlvlulnr6.R.inc(21443);result = 31 * result + general_profile_idc;
        __CLR4_5_2gdjgdjlvlulnr6.R.inc(21444);result = 31 * result + (int) (general_profile_compatibility_flags ^ (general_profile_compatibility_flags >>> 32));
        __CLR4_5_2gdjgdjlvlulnr6.R.inc(21445);result = 31 * result + (int) (general_constraint_indicator_flags ^ (general_constraint_indicator_flags >>> 32));
        __CLR4_5_2gdjgdjlvlulnr6.R.inc(21446);result = 31 * result + general_level_idc;
        __CLR4_5_2gdjgdjlvlulnr6.R.inc(21447);result = 31 * result + reserved1;
        __CLR4_5_2gdjgdjlvlulnr6.R.inc(21448);result = 31 * result + min_spatial_segmentation_idc;
        __CLR4_5_2gdjgdjlvlulnr6.R.inc(21449);result = 31 * result + reserved2;
        __CLR4_5_2gdjgdjlvlulnr6.R.inc(21450);result = 31 * result + parallelismType;
        __CLR4_5_2gdjgdjlvlulnr6.R.inc(21451);result = 31 * result + reserved3;
        __CLR4_5_2gdjgdjlvlulnr6.R.inc(21452);result = 31 * result + chromaFormat;
        __CLR4_5_2gdjgdjlvlulnr6.R.inc(21453);result = 31 * result + reserved4;
        __CLR4_5_2gdjgdjlvlulnr6.R.inc(21454);result = 31 * result + bitDepthLumaMinus8;
        __CLR4_5_2gdjgdjlvlulnr6.R.inc(21455);result = 31 * result + reserved5;
        __CLR4_5_2gdjgdjlvlulnr6.R.inc(21456);result = 31 * result + bitDepthChromaMinus8;
        __CLR4_5_2gdjgdjlvlulnr6.R.inc(21457);result = 31 * result + avgFrameRate;
        __CLR4_5_2gdjgdjlvlulnr6.R.inc(21458);result = 31 * result + constantFrameRate;
        __CLR4_5_2gdjgdjlvlulnr6.R.inc(21459);result = 31 * result + numTemporalLayers;
        __CLR4_5_2gdjgdjlvlulnr6.R.inc(21460);result = 31 * result + ((((temporalIdNested )&&(__CLR4_5_2gdjgdjlvlulnr6.R.iget(21461)!=0|true))||(__CLR4_5_2gdjgdjlvlulnr6.R.iget(21462)==0&false))? 1 : 0);
        __CLR4_5_2gdjgdjlvlulnr6.R.inc(21463);result = 31 * result + lengthSizeMinusOne;
        __CLR4_5_2gdjgdjlvlulnr6.R.inc(21464);result = 31 * result + ((((arrays != null )&&(__CLR4_5_2gdjgdjlvlulnr6.R.iget(21465)!=0|true))||(__CLR4_5_2gdjgdjlvlulnr6.R.iget(21466)==0&false))? arrays.hashCode() : 0);
        __CLR4_5_2gdjgdjlvlulnr6.R.inc(21467);return result;
    }finally{__CLR4_5_2gdjgdjlvlulnr6.R.flushNeeded();}}

    @Override
    public String toString() {try{__CLR4_5_2gdjgdjlvlulnr6.R.inc(21468);
        __CLR4_5_2gdjgdjlvlulnr6.R.inc(21469);return "HEVCDecoderConfigurationRecord{" +
                "configurationVersion=" + configurationVersion +
                ", general_profile_space=" + general_profile_space +
                ", general_tier_flag=" + general_tier_flag +
                ", general_profile_idc=" + general_profile_idc +
                ", general_profile_compatibility_flags=" + general_profile_compatibility_flags +
                ", general_constraint_indicator_flags=" + general_constraint_indicator_flags +
                ", general_level_idc=" + general_level_idc +
                ((((reserved1 != 0xf )&&(__CLR4_5_2gdjgdjlvlulnr6.R.iget(21470)!=0|true))||(__CLR4_5_2gdjgdjlvlulnr6.R.iget(21471)==0&false))? (", reserved1=" + reserved1) : "") +
                ", min_spatial_segmentation_idc=" + min_spatial_segmentation_idc +
                ((((reserved2 != 0x3F )&&(__CLR4_5_2gdjgdjlvlulnr6.R.iget(21472)!=0|true))||(__CLR4_5_2gdjgdjlvlulnr6.R.iget(21473)==0&false))? (", reserved2=" + reserved2) : "") +
                ", parallelismType=" + parallelismType +
                ((((reserved3 != 0x3F )&&(__CLR4_5_2gdjgdjlvlulnr6.R.iget(21474)!=0|true))||(__CLR4_5_2gdjgdjlvlulnr6.R.iget(21475)==0&false))? (", reserved3=" + reserved3) : "") +
                ", chromaFormat=" + chromaFormat +
                ((((reserved4 != 0x1F )&&(__CLR4_5_2gdjgdjlvlulnr6.R.iget(21476)!=0|true))||(__CLR4_5_2gdjgdjlvlulnr6.R.iget(21477)==0&false))? (", reserved4=" + reserved4) : "") +
                ", bitDepthLumaMinus8=" + bitDepthLumaMinus8 +
                ((((reserved5 != 0x1F )&&(__CLR4_5_2gdjgdjlvlulnr6.R.iget(21478)!=0|true))||(__CLR4_5_2gdjgdjlvlulnr6.R.iget(21479)==0&false))? (", reserved5=" + reserved5) : "") +
                ", bitDepthChromaMinus8=" + bitDepthChromaMinus8 +
                ", avgFrameRate=" + avgFrameRate +
                ", constantFrameRate=" + constantFrameRate +
                ", numTemporalLayers=" + numTemporalLayers +
                ", temporalIdNested=" + temporalIdNested +
                ", lengthSizeMinusOne=" + lengthSizeMinusOne +
                ", arrays=" + arrays +
                '}';
    }finally{__CLR4_5_2gdjgdjlvlulnr6.R.flushNeeded();}}

    public int getConfigurationVersion() {try{__CLR4_5_2gdjgdjlvlulnr6.R.inc(21480);
        __CLR4_5_2gdjgdjlvlulnr6.R.inc(21481);return configurationVersion;
    }finally{__CLR4_5_2gdjgdjlvlulnr6.R.flushNeeded();}}

    public void setConfigurationVersion(int configurationVersion) {try{__CLR4_5_2gdjgdjlvlulnr6.R.inc(21482);
        __CLR4_5_2gdjgdjlvlulnr6.R.inc(21483);this.configurationVersion = configurationVersion;
    }finally{__CLR4_5_2gdjgdjlvlulnr6.R.flushNeeded();}}

    public int getGeneral_profile_space() {try{__CLR4_5_2gdjgdjlvlulnr6.R.inc(21484);
        __CLR4_5_2gdjgdjlvlulnr6.R.inc(21485);return general_profile_space;
    }finally{__CLR4_5_2gdjgdjlvlulnr6.R.flushNeeded();}}

    public void setGeneral_profile_space(int general_profile_space) {try{__CLR4_5_2gdjgdjlvlulnr6.R.inc(21486);
        __CLR4_5_2gdjgdjlvlulnr6.R.inc(21487);this.general_profile_space = general_profile_space;
    }finally{__CLR4_5_2gdjgdjlvlulnr6.R.flushNeeded();}}

    public boolean isGeneral_tier_flag() {try{__CLR4_5_2gdjgdjlvlulnr6.R.inc(21488);
        __CLR4_5_2gdjgdjlvlulnr6.R.inc(21489);return general_tier_flag;
    }finally{__CLR4_5_2gdjgdjlvlulnr6.R.flushNeeded();}}

    public void setGeneral_tier_flag(boolean general_tier_flag) {try{__CLR4_5_2gdjgdjlvlulnr6.R.inc(21490);
        __CLR4_5_2gdjgdjlvlulnr6.R.inc(21491);this.general_tier_flag = general_tier_flag;
    }finally{__CLR4_5_2gdjgdjlvlulnr6.R.flushNeeded();}}

    public int getGeneral_profile_idc() {try{__CLR4_5_2gdjgdjlvlulnr6.R.inc(21492);
        __CLR4_5_2gdjgdjlvlulnr6.R.inc(21493);return general_profile_idc;
    }finally{__CLR4_5_2gdjgdjlvlulnr6.R.flushNeeded();}}

    public void setGeneral_profile_idc(int general_profile_idc) {try{__CLR4_5_2gdjgdjlvlulnr6.R.inc(21494);
        __CLR4_5_2gdjgdjlvlulnr6.R.inc(21495);this.general_profile_idc = general_profile_idc;
    }finally{__CLR4_5_2gdjgdjlvlulnr6.R.flushNeeded();}}

    public long getGeneral_profile_compatibility_flags() {try{__CLR4_5_2gdjgdjlvlulnr6.R.inc(21496);
        __CLR4_5_2gdjgdjlvlulnr6.R.inc(21497);return general_profile_compatibility_flags;
    }finally{__CLR4_5_2gdjgdjlvlulnr6.R.flushNeeded();}}

    public void setGeneral_profile_compatibility_flags(long general_profile_compatibility_flags) {try{__CLR4_5_2gdjgdjlvlulnr6.R.inc(21498);
        __CLR4_5_2gdjgdjlvlulnr6.R.inc(21499);this.general_profile_compatibility_flags = general_profile_compatibility_flags;
    }finally{__CLR4_5_2gdjgdjlvlulnr6.R.flushNeeded();}}

    public long getGeneral_constraint_indicator_flags() {try{__CLR4_5_2gdjgdjlvlulnr6.R.inc(21500);
        __CLR4_5_2gdjgdjlvlulnr6.R.inc(21501);return general_constraint_indicator_flags;
    }finally{__CLR4_5_2gdjgdjlvlulnr6.R.flushNeeded();}}

    public void setGeneral_constraint_indicator_flags(long general_constraint_indicator_flags) {try{__CLR4_5_2gdjgdjlvlulnr6.R.inc(21502);
        __CLR4_5_2gdjgdjlvlulnr6.R.inc(21503);this.general_constraint_indicator_flags = general_constraint_indicator_flags;
    }finally{__CLR4_5_2gdjgdjlvlulnr6.R.flushNeeded();}}

    public int getGeneral_level_idc() {try{__CLR4_5_2gdjgdjlvlulnr6.R.inc(21504);
        __CLR4_5_2gdjgdjlvlulnr6.R.inc(21505);return general_level_idc;
    }finally{__CLR4_5_2gdjgdjlvlulnr6.R.flushNeeded();}}

    public void setGeneral_level_idc(int general_level_idc) {try{__CLR4_5_2gdjgdjlvlulnr6.R.inc(21506);
        __CLR4_5_2gdjgdjlvlulnr6.R.inc(21507);this.general_level_idc = general_level_idc;
    }finally{__CLR4_5_2gdjgdjlvlulnr6.R.flushNeeded();}}

    public int getMin_spatial_segmentation_idc() {try{__CLR4_5_2gdjgdjlvlulnr6.R.inc(21508);
        __CLR4_5_2gdjgdjlvlulnr6.R.inc(21509);return min_spatial_segmentation_idc;
    }finally{__CLR4_5_2gdjgdjlvlulnr6.R.flushNeeded();}}

    public void setMin_spatial_segmentation_idc(int min_spatial_segmentation_idc) {try{__CLR4_5_2gdjgdjlvlulnr6.R.inc(21510);
        __CLR4_5_2gdjgdjlvlulnr6.R.inc(21511);this.min_spatial_segmentation_idc = min_spatial_segmentation_idc;
    }finally{__CLR4_5_2gdjgdjlvlulnr6.R.flushNeeded();}}

    public int getParallelismType() {try{__CLR4_5_2gdjgdjlvlulnr6.R.inc(21512);
        __CLR4_5_2gdjgdjlvlulnr6.R.inc(21513);return parallelismType;
    }finally{__CLR4_5_2gdjgdjlvlulnr6.R.flushNeeded();}}

    public void setParallelismType(int parallelismType) {try{__CLR4_5_2gdjgdjlvlulnr6.R.inc(21514);
        __CLR4_5_2gdjgdjlvlulnr6.R.inc(21515);this.parallelismType = parallelismType;
    }finally{__CLR4_5_2gdjgdjlvlulnr6.R.flushNeeded();}}

    public int getChromaFormat() {try{__CLR4_5_2gdjgdjlvlulnr6.R.inc(21516);
        __CLR4_5_2gdjgdjlvlulnr6.R.inc(21517);return chromaFormat;
    }finally{__CLR4_5_2gdjgdjlvlulnr6.R.flushNeeded();}}

    public void setChromaFormat(int chromaFormat) {try{__CLR4_5_2gdjgdjlvlulnr6.R.inc(21518);
        __CLR4_5_2gdjgdjlvlulnr6.R.inc(21519);this.chromaFormat = chromaFormat;
    }finally{__CLR4_5_2gdjgdjlvlulnr6.R.flushNeeded();}}

    public int getBitDepthLumaMinus8() {try{__CLR4_5_2gdjgdjlvlulnr6.R.inc(21520);
        __CLR4_5_2gdjgdjlvlulnr6.R.inc(21521);return bitDepthLumaMinus8;
    }finally{__CLR4_5_2gdjgdjlvlulnr6.R.flushNeeded();}}

    public void setBitDepthLumaMinus8(int bitDepthLumaMinus8) {try{__CLR4_5_2gdjgdjlvlulnr6.R.inc(21522);
        __CLR4_5_2gdjgdjlvlulnr6.R.inc(21523);this.bitDepthLumaMinus8 = bitDepthLumaMinus8;
    }finally{__CLR4_5_2gdjgdjlvlulnr6.R.flushNeeded();}}

    public int getBitDepthChromaMinus8() {try{__CLR4_5_2gdjgdjlvlulnr6.R.inc(21524);
        __CLR4_5_2gdjgdjlvlulnr6.R.inc(21525);return bitDepthChromaMinus8;
    }finally{__CLR4_5_2gdjgdjlvlulnr6.R.flushNeeded();}}

    public void setBitDepthChromaMinus8(int bitDepthChromaMinus8) {try{__CLR4_5_2gdjgdjlvlulnr6.R.inc(21526);
        __CLR4_5_2gdjgdjlvlulnr6.R.inc(21527);this.bitDepthChromaMinus8 = bitDepthChromaMinus8;
    }finally{__CLR4_5_2gdjgdjlvlulnr6.R.flushNeeded();}}

    public int getAvgFrameRate() {try{__CLR4_5_2gdjgdjlvlulnr6.R.inc(21528);
        __CLR4_5_2gdjgdjlvlulnr6.R.inc(21529);return avgFrameRate;
    }finally{__CLR4_5_2gdjgdjlvlulnr6.R.flushNeeded();}}

    public void setAvgFrameRate(int avgFrameRate) {try{__CLR4_5_2gdjgdjlvlulnr6.R.inc(21530);
        __CLR4_5_2gdjgdjlvlulnr6.R.inc(21531);this.avgFrameRate = avgFrameRate;
    }finally{__CLR4_5_2gdjgdjlvlulnr6.R.flushNeeded();}}

    public int getNumTemporalLayers() {try{__CLR4_5_2gdjgdjlvlulnr6.R.inc(21532);
        __CLR4_5_2gdjgdjlvlulnr6.R.inc(21533);return numTemporalLayers;
    }finally{__CLR4_5_2gdjgdjlvlulnr6.R.flushNeeded();}}

    public void setNumTemporalLayers(int numTemporalLayers) {try{__CLR4_5_2gdjgdjlvlulnr6.R.inc(21534);
        __CLR4_5_2gdjgdjlvlulnr6.R.inc(21535);this.numTemporalLayers = numTemporalLayers;
    }finally{__CLR4_5_2gdjgdjlvlulnr6.R.flushNeeded();}}

    public int getLengthSizeMinusOne() {try{__CLR4_5_2gdjgdjlvlulnr6.R.inc(21536);
        __CLR4_5_2gdjgdjlvlulnr6.R.inc(21537);return lengthSizeMinusOne;
    }finally{__CLR4_5_2gdjgdjlvlulnr6.R.flushNeeded();}}

    public void setLengthSizeMinusOne(int lengthSizeMinusOne) {try{__CLR4_5_2gdjgdjlvlulnr6.R.inc(21538);
        __CLR4_5_2gdjgdjlvlulnr6.R.inc(21539);this.lengthSizeMinusOne = lengthSizeMinusOne;
    }finally{__CLR4_5_2gdjgdjlvlulnr6.R.flushNeeded();}}

    public boolean isTemporalIdNested() {try{__CLR4_5_2gdjgdjlvlulnr6.R.inc(21540);
        __CLR4_5_2gdjgdjlvlulnr6.R.inc(21541);return temporalIdNested;
    }finally{__CLR4_5_2gdjgdjlvlulnr6.R.flushNeeded();}}

    public void setTemporalIdNested(boolean temporalIdNested) {try{__CLR4_5_2gdjgdjlvlulnr6.R.inc(21542);
        __CLR4_5_2gdjgdjlvlulnr6.R.inc(21543);this.temporalIdNested = temporalIdNested;
    }finally{__CLR4_5_2gdjgdjlvlulnr6.R.flushNeeded();}}

    public int getConstantFrameRate() {try{__CLR4_5_2gdjgdjlvlulnr6.R.inc(21544);
        __CLR4_5_2gdjgdjlvlulnr6.R.inc(21545);return constantFrameRate;
    }finally{__CLR4_5_2gdjgdjlvlulnr6.R.flushNeeded();}}

    public void setConstantFrameRate(int constantFrameRate) {try{__CLR4_5_2gdjgdjlvlulnr6.R.inc(21546);
        __CLR4_5_2gdjgdjlvlulnr6.R.inc(21547);this.constantFrameRate = constantFrameRate;
    }finally{__CLR4_5_2gdjgdjlvlulnr6.R.flushNeeded();}}

    public List<Array> getArrays() {try{__CLR4_5_2gdjgdjlvlulnr6.R.inc(21548);
        __CLR4_5_2gdjgdjlvlulnr6.R.inc(21549);return arrays;
    }finally{__CLR4_5_2gdjgdjlvlulnr6.R.flushNeeded();}}

    public void setArrays(List<Array> arrays) {try{__CLR4_5_2gdjgdjlvlulnr6.R.inc(21550);
        __CLR4_5_2gdjgdjlvlulnr6.R.inc(21551);this.arrays = arrays;
    }finally{__CLR4_5_2gdjgdjlvlulnr6.R.flushNeeded();}}

    public boolean isFrame_only_constraint_flag() {try{__CLR4_5_2gdjgdjlvlulnr6.R.inc(21552);
        __CLR4_5_2gdjgdjlvlulnr6.R.inc(21553);return frame_only_constraint_flag;
    }finally{__CLR4_5_2gdjgdjlvlulnr6.R.flushNeeded();}}

    public void setFrame_only_constraint_flag(boolean frame_only_constraint_flag) {try{__CLR4_5_2gdjgdjlvlulnr6.R.inc(21554);
        __CLR4_5_2gdjgdjlvlulnr6.R.inc(21555);this.frame_only_constraint_flag = frame_only_constraint_flag;
    }finally{__CLR4_5_2gdjgdjlvlulnr6.R.flushNeeded();}}

    public boolean isNon_packed_constraint_flag() {try{__CLR4_5_2gdjgdjlvlulnr6.R.inc(21556);
        __CLR4_5_2gdjgdjlvlulnr6.R.inc(21557);return non_packed_constraint_flag;
    }finally{__CLR4_5_2gdjgdjlvlulnr6.R.flushNeeded();}}

    public void setNon_packed_constraint_flag(boolean non_packed_constraint_flag) {try{__CLR4_5_2gdjgdjlvlulnr6.R.inc(21558);
        __CLR4_5_2gdjgdjlvlulnr6.R.inc(21559);this.non_packed_constraint_flag = non_packed_constraint_flag;
    }finally{__CLR4_5_2gdjgdjlvlulnr6.R.flushNeeded();}}

    public boolean isInterlaced_source_flag() {try{__CLR4_5_2gdjgdjlvlulnr6.R.inc(21560);
        __CLR4_5_2gdjgdjlvlulnr6.R.inc(21561);return interlaced_source_flag;
    }finally{__CLR4_5_2gdjgdjlvlulnr6.R.flushNeeded();}}

    public void setInterlaced_source_flag(boolean interlaced_source_flag) {try{__CLR4_5_2gdjgdjlvlulnr6.R.inc(21562);
        __CLR4_5_2gdjgdjlvlulnr6.R.inc(21563);this.interlaced_source_flag = interlaced_source_flag;
    }finally{__CLR4_5_2gdjgdjlvlulnr6.R.flushNeeded();}}

    public boolean isProgressive_source_flag() {try{__CLR4_5_2gdjgdjlvlulnr6.R.inc(21564);
        __CLR4_5_2gdjgdjlvlulnr6.R.inc(21565);return progressive_source_flag;
    }finally{__CLR4_5_2gdjgdjlvlulnr6.R.flushNeeded();}}

    public void setProgressive_source_flag(boolean progressive_source_flag) {try{__CLR4_5_2gdjgdjlvlulnr6.R.inc(21566);
        __CLR4_5_2gdjgdjlvlulnr6.R.inc(21567);this.progressive_source_flag = progressive_source_flag;
    }finally{__CLR4_5_2gdjgdjlvlulnr6.R.flushNeeded();}}

    public static class Array {

        public boolean array_completeness;
        public boolean reserved;
        public int nal_unit_type;
        public List<byte[]> nalUnits;


        public Array() {try{__CLR4_5_2gdjgdjlvlulnr6.R.inc(21568);

        }finally{__CLR4_5_2gdjgdjlvlulnr6.R.flushNeeded();}}

        @Override
        public boolean equals(Object o) {try{__CLR4_5_2gdjgdjlvlulnr6.R.inc(21569);
            __CLR4_5_2gdjgdjlvlulnr6.R.inc(21570);if ((((this == o)&&(__CLR4_5_2gdjgdjlvlulnr6.R.iget(21571)!=0|true))||(__CLR4_5_2gdjgdjlvlulnr6.R.iget(21572)==0&false))) {__CLR4_5_2gdjgdjlvlulnr6.R.inc(21573);return true;
            }__CLR4_5_2gdjgdjlvlulnr6.R.inc(21574);if ((((o == null || getClass() != o.getClass())&&(__CLR4_5_2gdjgdjlvlulnr6.R.iget(21575)!=0|true))||(__CLR4_5_2gdjgdjlvlulnr6.R.iget(21576)==0&false))) {__CLR4_5_2gdjgdjlvlulnr6.R.inc(21577);return false;

            }__CLR4_5_2gdjgdjlvlulnr6.R.inc(21578);Array array = (Array) o;

            __CLR4_5_2gdjgdjlvlulnr6.R.inc(21579);if ((((array_completeness != array.array_completeness)&&(__CLR4_5_2gdjgdjlvlulnr6.R.iget(21580)!=0|true))||(__CLR4_5_2gdjgdjlvlulnr6.R.iget(21581)==0&false))) {__CLR4_5_2gdjgdjlvlulnr6.R.inc(21582);return false;
            }__CLR4_5_2gdjgdjlvlulnr6.R.inc(21583);if ((((nal_unit_type != array.nal_unit_type)&&(__CLR4_5_2gdjgdjlvlulnr6.R.iget(21584)!=0|true))||(__CLR4_5_2gdjgdjlvlulnr6.R.iget(21585)==0&false))) {__CLR4_5_2gdjgdjlvlulnr6.R.inc(21586);return false;
            }__CLR4_5_2gdjgdjlvlulnr6.R.inc(21587);if ((((reserved != array.reserved)&&(__CLR4_5_2gdjgdjlvlulnr6.R.iget(21588)!=0|true))||(__CLR4_5_2gdjgdjlvlulnr6.R.iget(21589)==0&false))) {__CLR4_5_2gdjgdjlvlulnr6.R.inc(21590);return false;
            }__CLR4_5_2gdjgdjlvlulnr6.R.inc(21591);ListIterator<byte[]> e1 = nalUnits.listIterator();
            __CLR4_5_2gdjgdjlvlulnr6.R.inc(21592);ListIterator<byte[]> e2 = (array.nalUnits).listIterator();
            __CLR4_5_2gdjgdjlvlulnr6.R.inc(21593);while ((((e1.hasNext() && e2.hasNext())&&(__CLR4_5_2gdjgdjlvlulnr6.R.iget(21594)!=0|true))||(__CLR4_5_2gdjgdjlvlulnr6.R.iget(21595)==0&false))) {{
                __CLR4_5_2gdjgdjlvlulnr6.R.inc(21596);byte[] o1 = e1.next();
                __CLR4_5_2gdjgdjlvlulnr6.R.inc(21597);byte[] o2 = e2.next();

                __CLR4_5_2gdjgdjlvlulnr6.R.inc(21598);if ((((!((((o1 == null )&&(__CLR4_5_2gdjgdjlvlulnr6.R.iget(21599)!=0|true))||(__CLR4_5_2gdjgdjlvlulnr6.R.iget(21600)==0&false))? o2 == null : Arrays.equals(o1, o2)))&&(__CLR4_5_2gdjgdjlvlulnr6.R.iget(21601)!=0|true))||(__CLR4_5_2gdjgdjlvlulnr6.R.iget(21602)==0&false)))
                    {__CLR4_5_2gdjgdjlvlulnr6.R.inc(21603);return false;
            }}
            }__CLR4_5_2gdjgdjlvlulnr6.R.inc(21604);return !(e1.hasNext() || e2.hasNext());
        }finally{__CLR4_5_2gdjgdjlvlulnr6.R.flushNeeded();}}

        @Override
        public int hashCode() {try{__CLR4_5_2gdjgdjlvlulnr6.R.inc(21605);
            __CLR4_5_2gdjgdjlvlulnr6.R.inc(21606);int result = ((((array_completeness )&&(__CLR4_5_2gdjgdjlvlulnr6.R.iget(21607)!=0|true))||(__CLR4_5_2gdjgdjlvlulnr6.R.iget(21608)==0&false))? 1 : 0);
            __CLR4_5_2gdjgdjlvlulnr6.R.inc(21609);result = 31 * result + ((((reserved )&&(__CLR4_5_2gdjgdjlvlulnr6.R.iget(21610)!=0|true))||(__CLR4_5_2gdjgdjlvlulnr6.R.iget(21611)==0&false))? 1 : 0);
            __CLR4_5_2gdjgdjlvlulnr6.R.inc(21612);result = 31 * result + nal_unit_type;
            __CLR4_5_2gdjgdjlvlulnr6.R.inc(21613);result = 31 * result + ((((nalUnits != null )&&(__CLR4_5_2gdjgdjlvlulnr6.R.iget(21614)!=0|true))||(__CLR4_5_2gdjgdjlvlulnr6.R.iget(21615)==0&false))? nalUnits.hashCode() : 0);
            __CLR4_5_2gdjgdjlvlulnr6.R.inc(21616);return result;
        }finally{__CLR4_5_2gdjgdjlvlulnr6.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_5_2gdjgdjlvlulnr6.R.inc(21617);
            __CLR4_5_2gdjgdjlvlulnr6.R.inc(21618);return "Array{" +
                    "nal_unit_type=" + nal_unit_type +
                    ", reserved=" + reserved +
                    ", array_completeness=" + array_completeness +
                    ", num_nals=" + nalUnits.size() +
                    '}';
        }finally{__CLR4_5_2gdjgdjlvlulnr6.R.flushNeeded();}}
    }
}
